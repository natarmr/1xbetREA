package a;

/* JADX INFO: loaded from: classes.dex */
public final class get implements pld {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mld f11172a;

    public get(mld mldVar) {
        this.f11172a = mldVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof get) {
            return this.f11172a.equals(((get) obj).f11172a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f11172a.hashCode() * 31;
    }
}
