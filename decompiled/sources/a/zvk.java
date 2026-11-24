package a;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class zvk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f45062a;
    public final int b;
    public final int c;

    public zvk(String str, int i, int i2) {
        this.f45062a = str;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zvk)) {
            return false;
        }
        zvk zvkVar = (zvk) obj;
        return this.f45062a.equals(zvkVar.f45062a) && this.b == zvkVar.b && this.c == zvkVar.c;
    }

    public final int hashCode() {
        Integer numValueOf = Integer.valueOf(this.b);
        Integer numValueOf2 = Integer.valueOf(this.c);
        Float fValueOf = Float.valueOf(1.0f);
        return Objects.hash(this.f45062a, numValueOf, numValueOf2, fValueOf, 0, 0, 0, fValueOf);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DisplayShapeCompat{ spec=");
        sb.append(Integer.valueOf(this.f45062a.hashCode()));
        sb.append(" displayWidth=");
        sb.append(this.b);
        sb.append(" displayHeight=");
        return rz4.j(this.c, " physicalPixelDisplaySizeRatio=1.0 rotation=0 offsetX=0 offsetY=0 scale=1.0}", sb);
    }
}
