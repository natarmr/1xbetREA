package a;

/* JADX INFO: loaded from: classes.dex */
public final class ld90 implements ene {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f19839a;

    public ld90(float f) {
        this.f19839a = f;
        if (f < 0.0f || f > 100.0f) {
            adx.a("The percent should be in the range of [0, 100]");
        }
    }

    @Override // a.ene
    public final float a(long j, w6k w6kVar) {
        return (this.f19839a / 100.0f) * h7k0.d(j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ld90) && Float.compare(this.f19839a, ((ld90) obj).f19839a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f19839a);
    }

    public final String toString() {
        return rw2.j(this.f19839a, "CornerSize(size = ", "%)");
    }
}
