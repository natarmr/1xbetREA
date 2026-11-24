package a;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class jsq implements hsq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float[] f17065a;
    public final float[] b;

    public jsq(float[] fArr, float[] fArr2) {
        if (fArr.length != fArr2.length || fArr.length == 0) {
            jf4.o("Array lengths must match and be nonzero");
            throw null;
        }
        this.f17065a = fArr;
        this.b = fArr2;
    }

    @Override // a.hsq
    public final float a(float f) {
        return e3c.F(f, this.b, this.f17065a);
    }

    @Override // a.hsq
    public final float b(float f) {
        return e3c.F(f, this.f17065a, this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof jsq)) {
            return false;
        }
        jsq jsqVar = (jsq) obj;
        return Arrays.equals(this.f17065a, jsqVar.f17065a) && Arrays.equals(this.b, jsqVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + (Arrays.hashCode(this.f17065a) * 31);
    }

    public final String toString() {
        String string = Arrays.toString(this.f17065a);
        string.getClass();
        String string2 = Arrays.toString(this.b);
        string2.getClass();
        return "FontScaleConverter{fromSpValues=" + string + ", toDpValues=" + string2 + "}";
    }
}
