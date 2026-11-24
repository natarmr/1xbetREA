package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class imo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15036a;
    public final String b;
    public final boolean c;

    public imo(String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        this.f15036a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof imo)) {
            return false;
        }
        imo imoVar = (imo) obj;
        return Intrinsics.d(this.f15036a, imoVar.f15036a) && Intrinsics.d(this.b, imoVar.b) && this.c == imoVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ua80.b(ua80.b(Integer.hashCode(R.drawable.ic_glyph_chevron_down_small) * 31, 31, this.f15036a), 31, this.b);
    }

    public final String toString() {
        return defpackage.c.c(this.b, ", isExpand=", Separators.RPAREN, vqd.r(R.drawable.ic_glyph_chevron_down_small, "ExpandButtonUiModel(iconArrow=", ", expand=", this.f15036a, ", collapse="), this.c);
    }
}
