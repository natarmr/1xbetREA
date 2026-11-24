package a;

/* JADX INFO: loaded from: classes6.dex */
public final class qed0 implements ene {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f28578a;

    public qed0(float f) {
        this.f28578a = f;
    }

    @Override // a.ene
    public final float a(long j, w6k w6kVar) {
        return this.f28578a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qed0) && Float.compare(this.f28578a, ((qed0) obj).f28578a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f28578a);
    }

    public final String toString() {
        return rw2.j(this.f28578a, "CornerSize(size = ", ".px)");
    }
}
