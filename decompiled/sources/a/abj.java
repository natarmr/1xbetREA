package a;

/* JADX INFO: loaded from: classes.dex */
public final class abj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f582a;
    public final float b;

    public abj(float f, float f2) {
        this.f582a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof abj)) {
            return false;
        }
        abj abjVar = (abj) obj;
        return Float.compare(this.f582a, abjVar.f582a) == 0 && Float.compare(this.b, abjVar.b) == 0 && Double.compare(10.0d, 10.0d) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(10.0d) + defpackage.c.a(Float.hashCode(this.f582a) * 31, this.b, 31);
    }

    public final String toString() {
        return rw2.i(this.f582a, this.b, "DataPointUiModel(x=", ", y=", ", value=10.0)");
    }
}
