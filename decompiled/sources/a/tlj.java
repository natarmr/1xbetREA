package a;

/* JADX INFO: loaded from: classes3.dex */
public final class tlj extends upj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f34148a;

    public tlj(boolean z) {
        this.f34148a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tlj) && this.f34148a == ((tlj) obj).f34148a;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (Boolean.hashCode(this.f34148a) * 31);
    }

    public final String toString() {
        return defpackage.c.d("B2bConfig(launchFromDeepLink=", ", hasBackStack=false)", this.f34148a);
    }
}
