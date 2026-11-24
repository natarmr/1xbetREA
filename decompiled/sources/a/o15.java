package a;

/* JADX INFO: loaded from: classes.dex */
public final class o15 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f24461a;
    public final p15 b;

    public o15(int i, p15 p15Var) {
        if (i == 0) {
            hny.u("Null type");
            throw null;
        }
        this.f24461a = i;
        this.b = p15Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o15)) {
            return false;
        }
        o15 o15Var = (o15) obj;
        if (!hne.b(this.f24461a, o15Var.f24461a)) {
            return false;
        }
        p15 p15Var = o15Var.b;
        p15 p15Var2 = this.b;
        if (p15Var2 == null) {
            return p15Var == null;
        }
        return p15Var2.equals(p15Var);
    }

    public final int hashCode() {
        int iE = (hne.E(this.f24461a) ^ 1000003) * 1000003;
        p15 p15Var = this.b;
        return (p15Var == null ? 0 : p15Var.hashCode()) ^ iE;
    }

    public final String toString() {
        return "CameraState{type=" + dw9.C(this.f24461a) + ", error=" + this.b + "}";
    }
}
