package a;

/* JADX INFO: loaded from: classes.dex */
public final class gum0 extends IllegalStateException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f11937a;
    public final int b;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public gum0(int i, int i2) {
        String strE;
        if (i == 0) {
            strE = ua80.e(i2, "Player stuck buffering and not loading for ", " ms");
        } else if (i == 1) {
            strE = ua80.e(i2, "Player stuck buffering with no progress for ", " ms");
        } else if (i == 2) {
            strE = ua80.e(i2, "Player stuck playing with no progress for ", " ms");
        } else if (i == 3) {
            strE = ua80.e(i2, "Player stuck playing without ending for ", " ms");
        } else {
            if (i != 4) {
                v4i0.e();
                throw null;
            }
            strE = ua80.e(i2, "Player stuck suppressed for ", " ms");
        }
        super(strE);
        this.f11937a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || gum0.class != obj.getClass()) {
            return false;
        }
        gum0 gum0Var = (gum0) obj;
        return this.f11937a == gum0Var.f11937a && this.b == gum0Var.b;
    }

    public final int hashCode() {
        return ((527 + this.f11937a) * 31) + this.b;
    }
}
