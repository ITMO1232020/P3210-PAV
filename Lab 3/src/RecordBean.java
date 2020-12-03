import java.io.Serializable;
import java.util.Arrays;

public class RecordBean implements Serializable {

    private Double x;
    private Double y;
    private Double r;

    private Boolean inArea;


    public RecordBean() {
        this.x = 0.;
        this.y = 0.;
        this.r = 2.01;
        this.inArea = false;
    }

    public void onSubmit() {
        inArea = Result.calculate(x, y, r);
        Result result = new Result(x, y, r, inArea);
        result.save();
    }

    public void onXChecked(Integer value) {
        this.x = value.doubleValue();
    }


    public Double getX() {
        return x;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public Double getY() {
        return y;
    }

    public void setY(Double y) {
        this.y = y;
    }

    public Double getR() {
        return r;
    }

    public void setR(Double r) {
        this.r = r;
    }

    public String ready() {
        return "success";
    }

    public String back() {
        return "success";
    }
}
