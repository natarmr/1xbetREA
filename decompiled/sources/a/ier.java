package a;

import android.gov.nist.javax.sip.parser.TokenNames;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes2.dex */
public final class ier extends h1 {
    public static final qlc l = new qlc(j4m0.l, g950.e("Function"));
    public static final qlc m = new qlc(j4m0.i, g950.e("KFunction"));
    public final eu00 e;
    public final mg80 f;
    public final wer g;
    public final int h;
    public final her i;
    public final ker j;
    public final List k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ier(eu00 eu00Var, ed9 ed9Var, wer werVar, int i) {
        super(eu00Var, werVar.a(i));
        ed9Var.getClass();
        this.e = eu00Var;
        this.f = ed9Var;
        this.g = werVar;
        this.h = i;
        this.i = new her(this);
        this.j = new ker(eu00Var, this, (byte) 0);
        ArrayList arrayList = new ArrayList();
        IntRange intRange = new IntRange(1, i, 1);
        ArrayList arrayList2 = new ArrayList(r3d.q(intRange, 10));
        Iterator it = intRange.iterator();
        while (((kkx) it).c) {
            int iNextInt = ((bkx) it).nextInt();
            arrayList.add(izs0.s1(this, t3u0.d, g950.e("P" + iNextInt), arrayList.size(), this.e));
            arrayList2.add(Unit.f46060a);
        }
        arrayList.add(izs0.s1(this, t3u0.e, g950.e(TokenNames.R), arrayList.size(), this.e));
        this.k = CollectionsKt.L0(arrayList);
        pek pekVar = jer.f16389a;
        wer werVar2 = this.g;
        pekVar.getClass();
        werVar2.getClass();
        if (werVar2.equals(ser.d) || werVar2.equals(ver.d) || werVar2.equals(ter.d)) {
            return;
        }
        werVar2.equals(uer.d);
    }

    @Override // a.sq30
    public final boolean L() {
        return false;
    }

    @Override // a.wm40, a.goc
    public final List M() {
        return this.k;
    }

    @Override // a.sq30
    public final boolean Q() {
        return false;
    }

    @Override // a.wm40
    public final cr30 U() {
        return br30.b;
    }

    @Override // a.xjj
    public final gmk0 b() {
        return gmk0.x0;
    }

    @Override // a.wm40
    public final Collection g() {
        return iun.f15405a;
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
        return false;
    }

    @Override // a.sq30
    public final boolean isExternal() {
        return false;
    }

    @Override // a.wm40
    public final boolean isInline() {
        return false;
    }

    @Override // a.vjj
    public final vjj j() {
        return this.f;
    }

    @Override // a.wm40
    public final cr30 l0(cty ctyVar) {
        return this.j;
    }

    @Override // a.wm40, a.sq30
    public final gm40 m() {
        return gm40.e;
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
        return slc.b;
    }

    @Override // a.wm40
    public final boolean r0() {
        return false;
    }

    public final String toString() {
        String strB = getName().b();
        strB.getClass();
        return strB;
    }
}
