package a;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class ob10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fa10 f24955a;
    public final Throwable b;

    public ob10(fa10 fa10Var) {
        this.f24955a = fa10Var;
        this.b = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ob10)) {
            return false;
        }
        ob10 ob10Var = (ob10) obj;
        fa10 fa10Var = this.f24955a;
        if (fa10Var != null && fa10Var == ob10Var.f24955a) {
            return true;
        }
        Throwable th = this.b;
        if (th == null || ob10Var.b == null) {
            return false;
        }
        return th.toString().equals(th.toString());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f24955a, this.b});
    }

    public ob10(Throwable th) {
        this.b = th;
        this.f24955a = null;
    }
}
