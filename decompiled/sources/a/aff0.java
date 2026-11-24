package a;

/* JADX INFO: loaded from: classes.dex */
public final class aff0 extends xww {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xww f777a;
    public final int b;

    public aff0(xww xwwVar, int i) {
        this.f777a = xwwVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof aff0)) {
            return false;
        }
        aff0 aff0Var = (aff0) obj;
        return aff0Var.f777a.equals(this.f777a) && aff0Var.b == this.b;
    }

    public final int hashCode() {
        return this.f777a.hashCode() + (this.b * 31);
    }
}
