package a;

import android.gov.nist.javax.sip.parser.TokenNames;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes2.dex */
public final class m660 extends jlc {
    public final boolean g;
    public final ArrayList h;
    public final dmc i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m660(eu00 eu00Var, vlc vlcVar, g950 g950Var, boolean z, int i) {
        super(eu00Var, vlcVar, g950Var, gmk0.x0);
        vlcVar.getClass();
        g950Var.getClass();
        this.g = z;
        IntRange intRangeO = l1e0.o(0, i);
        ArrayList arrayList = new ArrayList(r3d.q(intRangeO, 10));
        Iterator it = intRangeO.iterator();
        while (((kkx) it).c) {
            int iNextInt = ((bkx) it).nextInt();
            arrayList.add(izs0.s1(this, t3u0.c, g950.e(TokenNames.T + iNextInt), iNextInt, eu00Var));
        }
        this.h = arrayList;
        List listO = nsm0.o(this);
        int i2 = rek.f30339a;
        ym40 ym40VarC = oek.c(this);
        ym40VarC.getClass();
        this.i = new dmc(this, listO, cui0.b(ym40VarC.c().e()), eu00Var);
    }

    @Override // a.sq30
    public final boolean L() {
        return false;
    }

    @Override // a.wm40, a.goc
    public final List M() {
        return this.h;
    }

    @Override // a.sq30
    public final boolean Q() {
        return false;
    }

    @Override // a.wm40
    public final cr30 U() {
        return br30.b;
    }

    @Override // a.wm40
    public final Collection g() {
        return xun.f41520a;
    }

    @Override // a.e83
    public final g93 getAnnotations() {
        return ujn.c;
    }

    @Override // a.wm40, a.sq30
    public final tek getVisibility() {
        tek tekVar = uek.e;
        tekVar.getClass();
        return tekVar;
    }

    @Override // a.foc
    public final iys0 h() {
        return this.i;
    }

    @Override // a.goc
    public final boolean i() {
        return this.g;
    }

    @Override // a.jlc, a.sq30
    public final boolean isExternal() {
        return false;
    }

    @Override // a.wm40
    public final boolean isInline() {
        return false;
    }

    @Override // a.wm40
    public final cr30 l0(cty ctyVar) {
        return br30.b;
    }

    @Override // a.wm40, a.sq30
    public final gm40 m() {
        return gm40.b;
    }

    @Override // a.wm40
    public final flc m0() {
        return null;
    }

    @Override // a.wm40
    public final k2u0 n0() {
        return null;
    }

    @Override // a.wm40
    public final boolean o0() {
        return false;
    }

    @Override // a.wm40
    public final boolean p0() {
        return false;
    }

    @Override // a.wm40
    public final boolean q0() {
        return false;
    }

    @Override // a.wm40
    public final slc r() {
        return slc.f32392a;
    }

    @Override // a.wm40
    public final boolean r0() {
        return false;
    }

    public final String toString() {
        return "class " + getName() + " (not found)";
    }
}
