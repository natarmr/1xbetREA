package a;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class e3b0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f7126a;
    public final /* synthetic */ long b;

    public /* synthetic */ e3b0(byte b, long j) {
        this.f7126a = b;
        this.b = j;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f7126a;
        long j = this.b;
        switch (b) {
            case 0:
                u2b0 u2b0Var = (u2b0) obj2;
                ((oyg0) obj).getClass();
                u2b0Var.getClass();
                List<Object> list = u2b0Var.l;
                ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                for (Object pe40Var : list) {
                    if (pe40Var instanceof pe40) {
                        w4t w4tVar = ((pe40) pe40Var).f26833a;
                        if ((w4tVar instanceof q4t) && ((q4t) w4tVar).f28117a == j) {
                            pe40Var = new pe40(w4tVar, ayx.f1691a);
                        }
                    }
                    arrayList.add(pe40Var);
                }
                return u2b0.a(u2b0Var, false, false, false, false, null, null, arrayList, 2047);
            case 1:
                u2b0 u2b0Var2 = (u2b0) obj2;
                List<Object> list2 = u2b0Var2.l;
                ArrayList arrayList2 = new ArrayList(r3d.q(list2, 10));
                for (Object pe40Var2 : list2) {
                    if (pe40Var2 instanceof pe40) {
                        w4t w4tVar2 = ((pe40) pe40Var2).f26833a;
                        if ((w4tVar2 instanceof q4t) && ((q4t) w4tVar2).f28117a == j) {
                            pe40Var2 = new pe40(w4tVar2, eyx.f8647a);
                        }
                    }
                    arrayList2.add(pe40Var2);
                }
                return u2b0.a(u2b0Var2, false, false, false, false, null, null, arrayList2, 2047);
            case 2:
                qyd0 qyd0Var = (qyd0) obj2;
                ((oyg0) obj).getClass();
                qyd0Var.getClass();
                return qyd0.a(qyd0Var, null, null, null, null, null, null, false, ixd0.a(qyd0Var.j, null, this.b, 0L, 0L, false, 29), null, null, false, null, false, false, null, null, 134217215);
            case 3:
                qyd0 qyd0Var2 = (qyd0) obj2;
                ((oyg0) obj).getClass();
                qyd0Var2.getClass();
                return qyd0.a(qyd0Var2, null, null, null, null, null, null, false, ixd0.a(qyd0Var2.j, null, 0L, 0L, this.b, false, 23), null, null, false, null, false, false, null, null, 134217215);
            case 4:
                qyd0 qyd0Var3 = (qyd0) obj2;
                ((oyg0) obj).getClass();
                qyd0Var3.getClass();
                return qyd0.a(qyd0Var3, null, null, null, null, null, null, false, ixd0.a(qyd0Var3.j, null, 0L, this.b, 0L, false, 27), null, null, false, null, false, false, null, null, 134217215);
            case 5:
                ((Integer) obj2).getClass();
                hp4.t(j, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 6:
                return twi0.a((twi0) obj2, false, false, null, null, null, null, null, null, null, null, false, false, null, null, false, false, false, false, false, false, false, false, null, false, Math.abs(j) > 60, false, false, 0, false, false, 0, -67108865, 2097151);
            case 7:
                return tcj0.a((tcj0) obj2, false, false, null, null, null, null, false, null, false, false, null, null, false, false, false, false, false, false, false, false, null, false, Math.abs(j) > 60, false, false, 0, false, null, false, false, 0, -67108865, 2097151);
            case 8:
                return pfj0.a((pfj0) obj2, false, false, null, null, null, null, null, null, null, false, false, null, null, false, false, false, false, false, false, false, false, null, false, Math.abs(j) > 60, false, false, 0, false, false, 0, -33554433, 1048575);
            case 9:
                dvk0 dvk0Var = (dvk0) obj2;
                ((oyg0) obj).getClass();
                dvk0Var.getClass();
                return dvk0.a(dvk0Var, false, null, null, null, null, null, null, null, null, null, null, null, null, null, jwk0.a(dvk0Var.p, null, null, (int) j, 3), null, null, null, null, null, null, null, null, null, null, null, null, 1073709055);
            case 10:
                ((Integer) obj2).getClass();
                hmw0.T(j, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            default:
                ((Integer) obj2).getClass();
                k7n0.c(j, (fet) obj, x8x.L(1));
                return Unit.f46060a;
        }
    }

    public /* synthetic */ e3b0(long j, int i, byte b) {
        this.f7126a = b;
        this.b = j;
    }
}
