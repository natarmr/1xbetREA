package a;

/* JADX INFO: loaded from: classes6.dex */
public final class dtr0 implements etr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xdk0 f6668a;

    public dtr0(xdk0 xdk0Var) {
        this.f6668a = xdk0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dtr0) && this.f6668a.equals(((dtr0) obj).f6668a);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.f6668a.hashCode() * 31);
    }

    public final String toString() {
        return cs0.k("ShowSnackBar(snackBarModel=", this.f6668a, ", showOverBottomSheet=true)");
    }
}
