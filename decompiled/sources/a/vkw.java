package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class vkw implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37596a;
    public final String b;
    public final int c;

    public vkw(int i, String str, String str2) {
        str.getClass();
        this.f37596a = str;
        this.b = str2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vkw)) {
            return false;
        }
        vkw vkwVar = (vkw) obj;
        return Intrinsics.d(this.f37596a, vkwVar.f37596a) && this.b.equals(vkwVar.b) && this.c == vkwVar.c;
    }

    @Override // a.p6t0
    public final String getKey() {
        return "HomeVirtualBannerUiModel_-1";
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + ua80.b(ua80.b(rw2.b(124879386, 31, -1L), 31, this.f37596a), 31, this.b);
    }

    public final String toString() {
        return rz4.j(this.c, Separators.RPAREN, b1j.n("HomeVirtualBannerUiModel(key=HomeVirtualBannerUiModel_-1, id=-1, label=", this.f37596a, ", image=", this.b, ", placeholderRes="));
    }
}
