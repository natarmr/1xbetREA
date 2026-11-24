package a;

/* JADX INFO: loaded from: classes.dex */
public final class qfu0 {
    public static final qfu0 d = new qfu0(0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f28655a;
    public final int b;
    public final float c;

    static {
        vtt0.H(0);
        vtt0.H(1);
        vtt0.H(3);
    }

    public qfu0(int i, float f, int i2) {
        this.f28655a = i;
        this.b = i2;
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof qfu0) {
            qfu0 qfu0Var = (qfu0) obj;
            if (this.f28655a == qfu0Var.f28655a && this.b == qfu0Var.b && this.c == qfu0Var.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.c) + ((((217 + this.f28655a) * 31) + this.b) * 31);
    }

    public qfu0(int i, int i2) {
        this(i, 1.0f, i2);
    }
}
