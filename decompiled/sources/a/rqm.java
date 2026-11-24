package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class rqm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vui0 f30938a;
    public final pui0 b;
    public final pvi0 c;
    public final float d;
    public final d4d e;
    public final tvi0 f;
    public final wui0 g;
    public final boolean h;
    public final t89 i;

    /* JADX WARN: Illegal instructions before constructor call */
    public rqm(vui0 vui0Var, pui0 pui0Var, pvi0 pvi0Var, d4d d4dVar, tvi0 tvi0Var, wui0 wui0Var, boolean z, e900 e900Var, int i) {
        pui0Var = (i & 2) != 0 ? null : pui0Var;
        pvi0Var = (i & 4) != 0 ? null : pvi0Var;
        zcl zclVar = qmk.f28987a;
        this(vui0Var, pui0Var, pvi0Var, 48.0f, (i & 16) != 0 ? d4d.BACKGROUND_CONTENT : d4dVar, (i & 32) != 0 ? qvi0.f29388a : tvi0Var, (i & 64) != 0 ? wui0.f39793a : wui0Var, (i & 128) != 0 ? true : z, (i & 256) != 0 ? null : e900Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rqm)) {
            return false;
        }
        rqm rqmVar = (rqm) obj;
        return Intrinsics.d(this.f30938a, rqmVar.f30938a) && Intrinsics.d(this.b, rqmVar.b) && Intrinsics.d(this.c, rqmVar.c) && ycl.b(this.d, rqmVar.d) && this.e == rqmVar.e && Intrinsics.d(this.f, rqmVar.f) && this.g == rqmVar.g && this.h == rqmVar.h && Intrinsics.d(this.i, rqmVar.i);
    }

    public final int hashCode() {
        int iHashCode = this.f30938a.hashCode() * 31;
        pui0 pui0Var = this.b;
        int iHashCode2 = (iHashCode + (pui0Var == null ? 0 : pui0Var.hashCode())) * 31;
        pvi0 pvi0Var = this.c;
        int iE = brm0.e(rw2.c(this.g, (this.f.hashCode() + dw9.b(this.e, defpackage.c.a((iHashCode2 + (pvi0Var == null ? 0 : pvi0Var.hashCode())) * 31, this.d, 31), 31)) * 31, 31), 31, this.h);
        t89 t89Var = this.i;
        return iE + (t89Var != null ? t89Var.hashCode() : 0);
    }

    public final String toString() {
        return "DsSettingCellStyle(settingCellMiddleStyle=" + this.f30938a + ", settingCellLeftStyle=" + this.b + ", settingCellRightStyle=" + this.c + ", cellHeight=" + ycl.c(this.d) + ", backgroundColor=" + this.e + ", shape=" + this.f + ", position=" + this.g + ", enable=" + this.h + ", gradientBrush=" + this.i + Separators.RPAREN;
    }

    public rqm(vui0 vui0Var, pui0 pui0Var, pvi0 pvi0Var, float f, d4d d4dVar, tvi0 tvi0Var, wui0 wui0Var, boolean z, t89 t89Var) {
        vui0Var.getClass();
        d4dVar.getClass();
        tvi0Var.getClass();
        wui0Var.getClass();
        this.f30938a = vui0Var;
        this.b = pui0Var;
        this.c = pvi0Var;
        this.d = f;
        this.e = d4dVar;
        this.f = tvi0Var;
        this.g = wui0Var;
        this.h = z;
        this.i = t89Var;
    }
}
