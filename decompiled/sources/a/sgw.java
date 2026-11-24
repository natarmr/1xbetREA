package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class sgw implements whw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f32182a;

    public sgw(int i) {
        this.f32182a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sgw) && this.f32182a == ((sgw) obj).f32182a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f32182a);
    }

    public final String toString() {
        return ua80.e(this.f32182a, "OnCategoryVirtualGamesClick(categoryId=", Separators.RPAREN);
    }
}
