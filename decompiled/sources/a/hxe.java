package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes3.dex */
public final class hxe implements hzc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gzc f13812a;
    public final gzc b;
    public final gzc c;

    public hxe() {
        pz40 pz40Var = s6t0.f31722a;
        long coefHigher = s6t0.b().b.getCoefHigher();
        StaticColors staticColors = StaticColors.INSTANCE;
        long jM121getTransparent0d7_KjU = staticColors.m121getTransparent0d7_KjU();
        zcl zclVar = qmk.f28987a;
        gzc gzcVar = new gzc(R.drawable.ic_glyph_arrow_up, coefHigher, jM121getTransparent0d7_KjU, 0.0f, 0.0f, 12.0f);
        gzc gzcVar2 = new gzc(R.drawable.ic_glyph_arrow_down, s6t0.b().b.getCoefLower(), staticColors.m121getTransparent0d7_KjU(), 0.0f, 0.0f, 12.0f);
        gzc gzcVar3 = new gzc(R.drawable.ic_glyph_lock, s6t0.b().f33626a.getSecondary(), staticColors.m121getTransparent0d7_KjU(), 0.0f, 0.0f, 14.0f);
        this.f13812a = gzcVar;
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
        return this.f13812a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hxe)) {
            return false;
        }
        hxe hxeVar = (hxe) obj;
        return Intrinsics.d(this.f13812a, hxeVar.f13812a) && Intrinsics.d(this.b, hxeVar.b) && Intrinsics.d(this.c, hxeVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f13812a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "MediumCustomBackgroundCoefIconsStyle(coefUpParams=" + this.f13812a + ", coefDownParams=" + this.b + ", blockParams=" + this.c + Separators.RPAREN;
    }
}
