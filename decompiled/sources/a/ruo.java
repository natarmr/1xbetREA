package a;

/* JADX INFO: loaded from: classes.dex */
public final class ruo extends y960 {
    public static final z960 d;
    public float b = 0.0f;
    public float c = 0.0f;

    static {
        z960 z960VarA = z960.a(256, new ruo());
        d = z960VarA;
        z960VarA.f = 0.5f;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof ruo) {
            ruo ruoVar = (ruo) obj;
            if (this.b == ruoVar.b && this.c == ruoVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.c) ^ Float.floatToIntBits(this.b);
    }

    public final String toString() {
        return this.b + "x" + this.c;
    }
}
