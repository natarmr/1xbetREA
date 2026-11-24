package a;

/* JADX INFO: loaded from: classes4.dex */
public final class sc50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f31970a;

    public sc50(String str) {
        this.f31970a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sc50) && this.f31970a.equals(((sc50) obj).f31970a);
    }

    public final int hashCode() {
        return brm0.e(brm0.e(ua80.b(Boolean.hashCode(false) * 31, 31, this.f31970a), 31, false), 961, false);
    }

    public final String toString() {
        return kng0.l("NavigationBarStateModel(searchAvailable=false, navigationBarTitle=", this.f31970a, ", isSearchActive=false, searchFocused=false, searchString=, placeholder=)");
    }
}
