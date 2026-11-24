package a;

import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class y26 implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f41891a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ y26(int i, Object obj, Object obj2, byte b) {
        this.f41891a = b;
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.f41891a;
        int i = this.b;
        byte b2 = 1;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (b) {
            case 0:
                String str = (String) obj5;
                l7m0 l7m0Var = (l7m0) obj4;
                fet fetVar = (fet) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((u63) obj).getClass();
                if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                    v8q0.a(str, o2e.e0(jm40.b, "LABEL_CONTAINER_TEXT"), ((y3d) l7m0Var.getValue()).f41946a, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, y9q0.a(new y9q0(0L, qmk.s, null, j1t0.c, 0L, null, 0, 0, qmk.G, 16646109), 0L, 0L, null, null, null, 0L, null, null, 0, this.b, 0L, null, null, 16711679), fetVar, 48, 24960, 110584);
                } else {
                    fetVar.X();
                }
                return Unit.f46060a;
            case 1:
                fop0 fop0Var = (fop0) obj5;
                Function1 function1 = (Function1) obj4;
                fet fetVar2 = (fet) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((g9z) obj).getClass();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    hfm0.n(fop0Var, i, function1, fetVar2, 0);
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
            case 2:
                ngk0 ngk0Var = (ngk0) obj5;
                l7m0 l7m0Var2 = (l7m0) obj4;
                vj30 vj30Var = (vj30) obj;
                pj30 pj30Var = (pj30) obj2;
                vj30Var.getClass();
                pj30Var.getClass();
                pu90 pu90VarS = pj30Var.S(((p4e) obj3).f26347a);
                Integer num = (Integer) ngk0Var.get(Integer.valueOf(i));
                int i2 = pu90VarS.b;
                if (num == null || num.intValue() != i2) {
                    ngk0Var.put(Integer.valueOf(i), Integer.valueOf(pu90VarS.b));
                }
                Iterator it = ngk0Var.b.iterator();
                int i3 = 0;
                int i4 = 0;
                while (((a8m0) it).hasNext()) {
                    Map.Entry entry = (Map.Entry) ((a8m0) it).next();
                    int iIntValue3 = ((Number) entry.getKey()).intValue();
                    int iIntValue4 = ((Number) entry.getValue()).intValue();
                    i3 += iIntValue4;
                    if (iIntValue3 > i) {
                        i4 += iIntValue4;
                    }
                }
                int iD = l1e0.d(si30.b(((Number) l7m0Var2.getValue()).floatValue() * i3) - i4, 0, pu90VarS.b);
                return vj30.x(vj30Var, pu90VarS.f27604a, iD, new n7(pu90VarS, iD, (byte) 7));
            default:
                k7h k7hVar = (k7h) obj5;
                Function1 function2 = (Function1) obj4;
                mm40 mm40Var = (mm40) obj;
                fet fetVar3 = (fet) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                mm40Var.getClass();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= fetVar3.g(mm40Var) ? 4 : 2;
                }
                if (fetVar3.U(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                    int i5 = this.b;
                    if (i5 == -1) {
                        return Unit.f46060a;
                    }
                    Object objP = fetVar3.P();
                    if (objP == ukd.f35823a) {
                        long j = y3d.f;
                        zcl zclVar = qmk.f28987a;
                        objP = new nbh0(0.0f, 12.0f, j);
                        fetVar3.o0(objP);
                    }
                    qxw.n(mm40Var, i5, (nbh0) objP, null, false, jiq0.b, u1c.M(-144675794, new kbg(k7hVar, function2, b2), fetVar3), fetVar3, (iIntValue5 & 14) | 1769856);
                } else {
                    fetVar3.X();
                }
                return Unit.f46060a;
        }
    }

    public /* synthetic */ y26(Object obj, int i, Object obj2, byte b) {
        this.f41891a = b;
        this.c = obj;
        this.b = i;
        this.d = obj2;
    }
}
