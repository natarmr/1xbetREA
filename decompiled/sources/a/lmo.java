package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class lmo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20306a;
    public final String b;
    public final boolean c;

    public lmo(String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        this.f20306a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lmo)) {
            return false;
        }
        lmo lmoVar = (lmo) obj;
        return Intrinsics.d(this.f20306a, lmoVar.f20306a) && Intrinsics.d(this.b, lmoVar.b) && this.c == lmoVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ua80.b(ua80.b(Integer.hashCode(R.drawable.ic_glyph_chevron_down_small) * 31, 31, this.f20306a), 31, this.b);
    }

    public final String toString() {
        return defpackage.c.c(this.b, ", isExpand=", Separators.RPAREN, vqd.r(R.drawable.ic_glyph_chevron_down_small, "ExpandButtonUiModel(iconArrow=", ", expand=", this.f20306a, ", collapse="), this.c);
    }
}
