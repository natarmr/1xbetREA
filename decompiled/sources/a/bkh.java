package a;

import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class bkh implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f2746a;
    public final /* synthetic */ Object b;

    public /* synthetic */ bkh(Object obj, byte b) {
        this.f2746a = b;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.f2746a;
        cl5 cl5Var = ukd.f35823a;
        byte b2 = 1;
        b2 = 1;
        Object obj4 = this.b;
        byte b3 = 0;
        switch (b) {
            case 0:
                lwv0 lwv0Var = (lwv0) obj;
                fet fetVar = (fet) obj2;
                int iIntValue = ((Number) obj3).intValue();
                p1h p1hVar = (p1h) obj4;
                lwv0Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= (iIntValue & 8) == 0 ? fetVar.g(lwv0Var) : fetVar.i(lwv0Var) ? 4 : 2;
                }
                if (fetVar.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                    boolean zG = fetVar.g(p1hVar);
                    if ((iIntValue & 14) != 4 && ((iIntValue & 8) == 0 || !fetVar.i(lwv0Var))) {
                        b2 = 0;
                    }
                    boolean z = (zG ? 1 : 0) | b2;
                    Object objP = fetVar.P();
                    if (z != 0 || objP == cl5Var) {
                        objP = new vtf(p1hVar, lwv0Var, (byte) 6);
                        fetVar.o0(objP);
                    }
                    yum0.b(null, (Function1) objP, u1c.M(1671730389, new akh(lwv0Var, b3), fetVar), fetVar, 3072);
                } else {
                    fetVar.X();
                }
                return Unit.f46060a;
            case 1:
                long j = ((y3d) obj).f41946a;
                fet fetVar2 = (fet) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= fetVar2.f(j) ? 4 : 2;
                }
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    xxj.b(((b5q0) obj4).c, j, fetVar2, (iIntValue2 << 3) & 112);
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
            case 2:
                fet fetVar3 = (fet) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                ((y5d) obj).getClass();
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    zcl zclVar = qmk.f28987a;
                    mm40 mm40VarJ = s5x0.J(jm40.b, 8.0f);
                    fpw fpwVar = (fpw) obj4;
                    x5d x5dVarA = w5d.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.m, fetVar3, 0);
                    int iHashCode = Long.hashCode(fetVar3.T);
                    bh90 bh90VarM = fetVar3.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar3, mm40VarJ);
                    mkd.c0.getClass();
                    fetVar3.i0();
                    if (fetVar3.S) {
                        fetVar3.l(e7z.u1);
                    } else {
                        fetVar3.r0();
                    }
                    jpm0.o(fetVar3, x5dVarA, gqw0.x);
                    jpm0.o(fetVar3, bh90VarM, gqw0.w);
                    jpm0.o(fetVar3, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar3);
                    jpm0.o(fetVar3, mm40VarC0, gqw0.v);
                    fetVar3.e0(-1009080075);
                    Iterator<E> it = fpwVar.d.iterator();
                    while (it.hasNext()) {
                        qbc.w((dpw) it.next(), fetVar3, 6);
                    }
                    fetVar3.r(false);
                    fetVar3.r(true);
                } else {
                    fetVar3.X();
                }
                return Unit.f46060a;
            case 3:
                ((Number) obj3).intValue();
                ((ugd) obj4).invoke((fet) obj2, 0);
                return Unit.f46060a;
            case 4:
                axq0 axq0Var = (axq0) obj;
                fet fetVar4 = (fet) obj2;
                int iIntValue4 = ((Number) obj3).intValue();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= (iIntValue4 & 8) == 0 ? fetVar4.g(axq0Var) : fetVar4.i(axq0Var) ? 4 : 2;
                }
                if (fetVar4.U(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    xwq0.a(axq0Var, null, 0.0f, null, 0L, 0L, u1c.M(-999924215, new b850((String) obj4, (byte) 12), fetVar4), fetVar4, (iIntValue4 & 14) | 805306368);
                } else {
                    fetVar4.X();
                }
                return Unit.f46060a;
            case 5:
                lwv0 lwv0Var2 = (lwv0) obj;
                fet fetVar5 = (fet) obj2;
                int iIntValue5 = ((Number) obj3).intValue();
                gcl0 gcl0Var = (gcl0) obj4;
                lwv0Var2.getClass();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= (iIntValue5 & 8) == 0 ? fetVar5.g(lwv0Var2) : fetVar5.i(lwv0Var2) ? 4 : 2;
                }
                if (fetVar5.U(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                    boolean zG2 = fetVar5.g(gcl0Var);
                    if ((iIntValue5 & 14) == 4 || ((iIntValue5 & 8) != 0 && fetVar5.i(lwv0Var2))) {
                        b3 = 1;
                    }
                    boolean z2 = (zG2 ? 1 : 0) | b3;
                    Object objP2 = fetVar5.P();
                    if (z2 != 0 || objP2 == cl5Var) {
                        objP2 = new o3l0(gcl0Var, lwv0Var2, (byte) 23);
                        fetVar5.o0(objP2);
                    }
                    yum0.b(null, (Function1) objP2, u1c.M(1671730389, new akh(lwv0Var2, b2), fetVar5), fetVar5, 3072);
                } else {
                    fetVar5.X();
                }
                return Unit.f46060a;
            default:
                mm40 mm40Var = (mm40) obj;
                fet fetVar6 = (fet) obj2;
                ((Number) obj3).intValue();
                fetVar6.e0(-1498516085);
                nul0 nul0VarP = d7x.P(yt40.b, fetVar6);
                nul0 nul0VarP2 = d7x.P(yt40.d, fetVar6);
                oms0 oms0Var = (oms0) obj4;
                lxs0 lxs0Var = hp4.j;
                p4 p4Var = oms0Var.f25519a;
                pz40 pz40Var = oms0Var.d;
                boolean zBooleanValue = ((Boolean) p4Var.y0()).booleanValue();
                fetVar6.e0(-1553362193);
                float f = zBooleanValue ? 1.0f : 0.8f;
                fetVar6.r(false);
                Float fValueOf = Float.valueOf(f);
                hgk0 hgk0Var = (hgk0) pz40Var;
                boolean zBooleanValue2 = ((Boolean) hgk0Var.getValue()).booleanValue();
                fetVar6.e0(-1553362193);
                float f2 = zBooleanValue2 ? 1.0f : 0.8f;
                fetVar6.r(false);
                Float fValueOf2 = Float.valueOf(f2);
                oms0Var.f();
                fetVar6.e0(386845748);
                fetVar6.r(false);
                cms0 cms0VarE = phu0.E(oms0Var, fValueOf, fValueOf2, nul0VarP, lxs0Var, fetVar6, 196608);
                boolean zBooleanValue3 = ((Boolean) oms0Var.f25519a.y0()).booleanValue();
                fetVar6.e0(2073045083);
                float f3 = zBooleanValue3 ? 1.0f : 0.0f;
                fetVar6.r(false);
                Float fValueOf3 = Float.valueOf(f3);
                boolean zBooleanValue4 = ((Boolean) hgk0Var.getValue()).booleanValue();
                fetVar6.e0(2073045083);
                float f4 = zBooleanValue4 ? 1.0f : 0.0f;
                fetVar6.r(false);
                Float fValueOf4 = Float.valueOf(f4);
                oms0Var.f();
                fetVar6.e0(-281714272);
                fetVar6.r(false);
                mm40 mm40VarV = i4w0.V(mm40Var, ((Number) cms0VarE.getValue()).floatValue(), ((Number) cms0VarE.getValue()).floatValue(), ((Number) phu0.E(oms0Var, fValueOf3, fValueOf4, nul0VarP2, lxs0Var, fetVar6, 196608).getValue()).floatValue(), 0.0f, null, 131064);
                fetVar6.r(false);
                return mm40VarV;
        }
    }
}
