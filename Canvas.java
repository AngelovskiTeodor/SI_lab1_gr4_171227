public class Canvas {
    private List<Point> points;

    public Canvas(){}

    @PostConstruct
    public void init(PointsFile pointsCsvFile) {
        this.points = pointsCsvFile.parse();
    }

    @PreDestroy
    public void savePoints(PointsFile pointsCsvFile){
        pointsCsvFile.save(this.points);
    }

    public void draw() {
        this.points
            .stream
            .foreach( point -> point.draw() );
    }

    public void addPoint(Point point) {
        this.points.add(point);
    }

    public void deletePointById(String id) {
        this. points = this.points
            .stream
            .filter( point -> !(point.id.equals(id)) )
            .collect(Collectors.toList());
    }
}