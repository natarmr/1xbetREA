package a;

import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class xzw0 extends j1x0 {
    public static final Set g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vzw0 f41775a;
    public final uzw0 b;
    public final wzw0 c;
    public final p50 d;
    public final fpw0 e;
    public final icw0 f;

    static {
        try {
            g = (Set) new cpw0((byte) 25).mo0zza();
        } catch (Exception e) {
            itt0.s(e);
        }
    }

    public xzw0(vzw0 vzw0Var, uzw0 uzw0Var, wzw0 wzw0Var, fpw0 fpw0Var, p50 p50Var, icw0 icw0Var) {
        this.f41775a = vzw0Var;
        this.b = uzw0Var;
        this.c = wzw0Var;
        this.e = fpw0Var;
        this.d = p50Var;
        this.f = icw0Var;
    }

    public static zcw0 b() {
        zcw0 zcw0Var = new zcw0();
        zcw0Var.f44186a = null;
        zcw0Var.b = null;
        zcw0Var.c = null;
        zcw0Var.d = null;
        zcw0Var.e = p50.n;
        zcw0Var.f = null;
        return zcw0Var;
    }

    @Override // a.fpw0
    public final boolean a() {
        return this.d != p50.n;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof xzw0)) {
            return false;
        }
        xzw0 xzw0Var = (xzw0) obj;
        return xzw0Var.f41775a == this.f41775a && xzw0Var.b == this.b && xzw0Var.c == this.c && Objects.equals(xzw0Var.e, this.e) && xzw0Var.d == this.d && Objects.equals(xzw0Var.f, this.f);
    }

    public final int hashCode() {
        return Objects.hash(xzw0.class, this.f41775a, this.b, this.c, this.e, this.d, this.f);
    }

    public final String toString() {
        return String.format("EciesParameters(curveType=%s, hashType=%s, pointFormat=%s, demParameters=%s, variant=%s, salt=%s)", this.f41775a, this.b, this.c, this.e, this.d, this.f);
    }
}
