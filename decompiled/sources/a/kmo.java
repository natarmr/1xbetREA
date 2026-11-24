package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class kmo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18550a;
    public final String b;
    public final boolean c;

    public kmo(String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        this.f18550a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kmo)) {
            return false;
        }
        kmo kmoVar = (kmo) obj;
        return Intrinsics.d(this.f18550a, kmoVar.f18550a) && Intrinsics.d(this.b, kmoVar.b) && this.c == kmoVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ua80.b(ua80.b(Integer.hashCode(R.drawable.ic_glyph_chevron_down_small) * 31, 31, this.f18550a), 31, this.b);
    }

    public final String toString() {
        return defpackage.c.c(this.b, ", isExpand=", Separators.RPAREN, vqd.r(R.drawable.ic_glyph_chevron_down_small, "ExpandButtonUiModel(iconArrow=", ", expand=", this.f18550a, ", collapse="), this.c);
    }
}
