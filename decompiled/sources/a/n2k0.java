package a;

/* JADX INFO: loaded from: classes4.dex */
public final class n2k0 implements p2k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mdm f22805a;

    public n2k0(mdm mdmVar) {
        this.f22805a = mdmVar;
    }

    @Override // a.p2k0
    public final boolean a() {
        return false;
    }

    @Override // a.p2k0
    public final boolean b() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n2k0) && this.f22805a.equals(((n2k0) obj).f22805a);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + brm0.e(this.f22805a.hashCode() * 31, 31, false);
    }

    public final String toString() {
        return b1j.j("Error(dsEmptyConfig=", this.f22805a, ", isRefreshing=false, refreshEnabled=false)");
    }
}
