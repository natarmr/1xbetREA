package a;

/* JADX INFO: loaded from: classes2.dex */
public final class tpy extends x8x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f34358a;

    public tpy(int i) {
        this.f34358a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tpy) && this.f34358a == ((tpy) obj).f34358a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f34358a);
    }

    public final String toString() {
        return brm0.n(new StringBuilder("TypeParameter(id="), this.f34358a, ')');
    }
}
