package a;

/* JADX INFO: loaded from: classes6.dex */
public final class zcl implements ene {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f44172a;

    public zcl(float f) {
        this.f44172a = f;
    }

    @Override // a.ene
    public final float a(long j, w6k w6kVar) {
        return w6kVar.w0(this.f44172a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zcl) && ycl.b(this.f44172a, ((zcl) obj).f44172a);
    }

    public final int hashCode() {
        return Float.hashCode(this.f44172a);
    }

    public final String toString() {
        return rw2.j(this.f44172a, "CornerSize(size = ", ".dp)");
    }
}
