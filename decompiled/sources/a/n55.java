package a;

/* JADX INFO: loaded from: classes.dex */
public final class n55 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22926a;
    public final ozw b;

    public n55(int i, ozw ozwVar) {
        this.f22926a = i;
        this.b = ozwVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof n55) {
            n55 n55Var = (n55) obj;
            return this.f22926a == n55Var.f22926a && this.b == n55Var.b;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.f22926a ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "CaptureError{requestId=" + this.f22926a + ", imageCaptureException=" + this.b + "}";
    }
}
