package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes3.dex */
public final class gxe implements hzc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gzc f12074a;
    public final gzc b;
    public final gzc c;

    public gxe() {
        pz40 pz40Var = s6t0.f31722a;
        StaticColors staticColors = StaticColors.INSTANCE;
        long jM123getWhite0d7_KjU = staticColors.m123getWhite0d7_KjU();
        long coefHigher = s6t0.b().b.getCoefHigher();
        zcl zclVar = qmk.f28987a;
        gzc gzcVar = new gzc(R.drawable.ic_glyph_arrow_up, jM123getWhite0d7_KjU, coefHigher, 4.0f, 2.0f, 12.0f);
        gzc gzcVar2 = new gzc(R.drawable.ic_glyph_arrow_down, staticColors.m123getWhite0d7_KjU(), s6t0.b().b.getCoefLower(), 4.0f, 2.0f, 12.0f);
        gzc gzcVar3 = new gzc(R.drawable.ic_glyph_lock, staticColors.m123getWhite0d7_KjU(), s6t0.b().f33626a.getSecondary(), 4.0f, 2.0f, 14.0f);
        this.f12074a = gzcVar;
        this.b = gzcVar2;
        this.c = gzcVar3;
    }

    @Override // a.hzc
    public final gzc a() {
        return this.c;
    }

    @Override // a.hzc
    public final gzc b() {
        return this.b;
    }

    @Override // a.hzc
    public final gzc c() {
        return this.f12074a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gxe)) {
            return false;
        }
        gxe gxeVar = (gxe) obj;
        return Intrinsics.d(this.f12074a, gxeVar.f12074a) && Intrinsics.d(this.b, gxeVar.b) && Intrinsics.d(this.c, gxeVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f12074a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "LiteNoTabsCoefCoefIconsStyle(coefUpParams=" + this.f12074a + ", coefDownParams=" + this.b + ", blockParams=" + this.c + Separators.RPAREN;
    }
}
