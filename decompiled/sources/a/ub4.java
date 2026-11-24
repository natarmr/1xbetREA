package a;

import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ub4 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f35360a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ub4(long j, Function0 function0, int i) {
        this.f35360a = (byte) 2;
        this.b = j;
        this.c = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        Pair pair;
        byte b = this.f35360a;
        boolean zContains = false;
        long j = this.b;
        Object obj3 = this.c;
        switch (b) {
            case 0:
                mb4 mb4Var = (mb4) obj2;
                ((oyg0) obj).getClass();
                mb4Var.getClass();
                boolean z3 = ((zte0) ((chf0) ((kc4) obj3).t.f2175a).b).f44955a.get();
                cb4 cb4Var = mb4Var.m;
                if (z3) {
                    if (!cb4Var.g.contains(Long.valueOf(j))) {
                        z = true;
                    }
                    return mb4.a(mb4Var, false, z, false, null, null, null, 0, false, null, null, false, 16381);
                }
                zContains = cb4Var.h.contains(Long.valueOf(j));
                z = zContains;
                return mb4.a(mb4Var, false, z, false, null, null, null, 0, false, null, null, false, 16381);
            case 1:
                zf4 zf4Var = (zf4) obj2;
                ((oyg0) obj).getClass();
                zf4Var.getClass();
                boolean z4 = ((zte0) ((chf0) ((fh4) obj3).s.f2175a).b).f44955a.get();
                pf4 pf4Var = zf4Var.m;
                if (z4) {
                    if (!pf4Var.h.contains(Long.valueOf(j))) {
                        z2 = true;
                    }
                    return zf4.a(zf4Var, false, z2, false, null, null, null, 0, false, null, null, false, false, 32765);
                }
                zContains = pf4Var.i.contains(Long.valueOf(j));
                z2 = zContains;
                return zf4.a(zf4Var, false, z2, false, null, null, null, 0, false, null, null, false, false, 32765);
            case 2:
                ((Integer) obj2).getClass();
                mom.a(j, (Function0) obj3, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 3:
                w9s w9sVar = (w9s) obj3;
                das dasVar = (das) obj2;
                ((String) obj).getClass();
                if (dasVar == null) {
                    dasVar = new das();
                }
                return das.a(dasVar, xp20.k(dasVar.f5766a, new Pair(new bds(j), w9sVar)), null, null, 6);
            case 4:
                ihz ihzVar = (ihz) obj2;
                j0g0 j0g0Var = new j0g0(obj3);
                Pair pair2 = ihzVar.k;
                if (pair2 == null || ((Number) pair2.f46059a).longValue() != j) {
                    Long lValueOf = Long.valueOf(j);
                    yyg yygVar = (yyg) (obj3 instanceof g0g0 ? null : obj3);
                    pair = new Pair(lValueOf, yygVar != null ? yygVar.c : null);
                } else {
                    pair = ihzVar.k;
                }
                return ihz.a(ihzVar, 0L, 0, null, null, null, null, null, null, j0g0Var, pair, null, null, null, false, false, ihzVar.q || !(obj3 instanceof g0g0), 63999);
            case 5:
                ((Integer) obj2).getClass();
                bdx.L((a4x) obj3, j, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 6:
                List list = (List) obj3;
                u2b0 u2b0Var = (u2b0) obj2;
                List<df40> list2 = u2b0Var.l;
                ArrayList arrayList = new ArrayList(r3d.q(list2, 10));
                for (df40 pe40Var : list2) {
                    if (pe40Var instanceof pe40) {
                        w4t w4tVar = ((pe40) pe40Var).f26833a;
                        if ((w4tVar instanceof q4t) && ((q4t) w4tVar).f28117a == j) {
                            pe40Var = new pe40(w4tVar, !list.isEmpty() ? new cyx(list) : zxx.f45180a);
                        }
                    }
                    arrayList.add(pe40Var);
                }
                return u2b0.a(u2b0Var, false, false, false, false, null, null, arrayList, 2047);
            case 7:
                ((Integer) obj2).getClass();
                idx.a((ilq) obj3, j, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 8:
                ((Integer) obj2).getClass();
                cjx.H((r8l0) obj3, j, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            default:
                ugd ugdVar = (ugd) obj3;
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ugdVar.j(Float.valueOf(Float.intBitsToFloat((int) (j >> 32))), Float.valueOf(Float.intBitsToFloat((int) (j & 4294967295L))), fetVar, 0);
                } else {
                    fetVar.X();
                }
                return Unit.f46060a;
        }
    }

    public /* synthetic */ ub4(long j, Object obj, byte b) {
        this.f35360a = b;
        this.b = j;
        this.c = obj;
    }

    public /* synthetic */ ub4(byte b, int i, long j, Object obj) {
        this.f35360a = b;
        this.c = obj;
        this.b = j;
    }

    public /* synthetic */ ub4(Object obj, long j, byte b) {
        this.f35360a = b;
        this.c = obj;
        this.b = j;
    }
}
