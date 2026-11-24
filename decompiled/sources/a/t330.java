package a;

import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class t330 implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f33247a;

    public /* synthetic */ t330(vhe vheVar) {
        this.f33247a = (byte) 15;
    }

    /* JADX WARN: Code duplicated, block: B:73:0x0217  */
    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        long jE;
        long jE2;
        boolean z = false;
        switch (this.f33247a) {
            case 0:
                ((Long) obj).getClass();
                ((Long) obj2).getClass();
                ((Double) obj3).getClass();
                xuz xuzVar = v330.Q1;
                return Unit.f46060a;
            case 1:
                ((Long) obj).longValue();
                ((Boolean) obj3).booleanValue();
                xuz xuzVar2 = v330.Q1;
                ((String) obj2).getClass();
                return Unit.f46060a;
            case 2:
                ((Long) obj).longValue();
                ((Boolean) obj3).booleanValue();
                xuz xuzVar3 = v330.Q1;
                ((String) obj2).getClass();
                return Unit.f46060a;
            case 3:
                vj30 vj30Var = (vj30) obj;
                pj30 pj30Var = (pj30) obj2;
                p4e p4eVar = (p4e) obj3;
                vj30Var.getClass();
                pj30Var.getClass();
                zcl zclVar = qmk.f28987a;
                int iT = vj30Var.T(8.0f);
                int i = (int) (((p4e.i(p4eVar.f26347a) - iT) / 1.7777778f) + iT);
                pu90 pu90VarS = pj30Var.S(p4e.b(p4eVar.f26347a, 0, 0, i, i, 3));
                return vj30.x(vj30Var, pu90VarS.f27604a, pu90VarS.b, new cam(pu90VarS, (byte) 13));
            case 4:
                vj30 vj30Var2 = (vj30) obj;
                pj30 pj30Var2 = (pj30) obj2;
                p4e p4eVar2 = (p4e) obj3;
                vj30Var2.getClass();
                pj30Var2.getClass();
                zcl zclVar2 = qmk.f28987a;
                int iT2 = vj30Var2.T(448.0f);
                int iT3 = vj30Var2.T(88.0f);
                int iMin = Math.min((int) ((p4e.e(p4eVar2.f26347a) ? p4e.i(p4eVar2.f26347a) : iT2) * 0.8f), iT2);
                int iL = pj30Var2.L(Integer.MAX_VALUE);
                int iD = pj30Var2.D(Integer.MAX_VALUE);
                int iMin2 = (iL <= 0 || iD <= 0) ? 0 : Math.min((int) ((iMin * iD) / iL), iT3);
                if (!((iMin2 >= 0) & (iMin >= 0))) {
                    zcx.a("width and height must be >= 0");
                }
                return vj30.x(vj30Var2, iMin, iMin2, new cam(pj30Var2.S(r4e.h(iMin, iMin, iMin2, iMin2)), (byte) 19));
            case 5:
                ((Integer) obj).getClass();
                ((Integer) obj2).getClass();
                ((Integer) obj3).getClass();
                return Boolean.TRUE;
            case 6:
                ((Integer) obj2).getClass();
                p6t0 p6t0Var = (p6t0) obj3;
                ((x8z) obj).getClass();
                p6t0Var.getClass();
                if ((p6t0Var instanceof pqv) || (p6t0Var instanceof ly30)) {
                    jE = q8x.e(2);
                } else {
                    my30 my30Var = p6t0Var instanceof my30 ? (my30) p6t0Var : null;
                    if (my30Var == null || !my30Var.y0()) {
                        jE = q8x.e(1);
                    } else {
                        jE = q8x.e(2);
                    }
                }
                return new pgv(jE);
            case 7:
                ((Long) obj).longValue();
                ((Boolean) obj3).booleanValue();
                ((String) obj2).getClass();
                return Unit.f46060a;
            case 8:
                int iIntValue = ((Integer) obj2).intValue();
                int iIntValue2 = ((Integer) obj3).intValue();
                ((tcz) obj).getClass();
                return Integer.valueOf(l1e0.d(iIntValue2, iIntValue - 1, iIntValue + 1));
            case 9:
                ((Integer) obj2).intValue();
                Integer num = (Integer) obj3;
                num.intValue();
                ((tcz) obj).getClass();
                return num;
            case 10:
                ((Integer) obj2).intValue();
                p6t0 p6t0Var2 = (p6t0) obj3;
                ((x8z) obj).getClass();
                p6t0Var2.getClass();
                if ((p6t0Var2 instanceof nfh0) || (p6t0Var2 instanceof ofh0)) {
                    jE2 = q8x.e(2);
                } else if (p6t0Var2 instanceof zfh0) {
                    jE2 = q8x.e(((zfh0) p6t0Var2).b ? 1 : 2);
                } else {
                    jE2 = q8x.e(1);
                }
                return new pgv(jE2);
            case 11:
                p6t0 p6t0Var3 = (p6t0) obj;
                ((Integer) obj3).getClass();
                p6t0Var3.getClass();
                ((List) obj2).getClass();
                if ((p6t0Var3 instanceof yjn0) && ((yjn0) p6t0Var3).f == rjn0.COMPACT_CARDS) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 12:
                p6t0 p6t0Var4 = (p6t0) obj;
                ((Integer) obj3).getClass();
                p6t0Var4.getClass();
                ((List) obj2).getClass();
                if ((p6t0Var4 instanceof yjn0) && ((yjn0) p6t0Var4).f == rjn0.PLAIN_LIST_ITEMS) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 13:
                ((Integer) obj2).intValue();
                p6t0 p6t0Var5 = (p6t0) obj3;
                ((x8z) obj).getClass();
                p6t0Var5.getClass();
                return new pgv(p6t0Var5 instanceof jy30 ? q8x.e(1) : q8x.e(2));
            case 14:
                vj30 vj30Var3 = (vj30) obj;
                pj30 pj30Var3 = (pj30) obj2;
                p4e p4eVar3 = (p4e) obj3;
                vj30Var3.getClass();
                pj30Var3.getClass();
                zcl zclVar3 = qmk.f28987a;
                int iT4 = vj30Var3.T(24.0f) + 1;
                long j = p4eVar3.f26347a;
                int iH = p4e.h(j) + iT4;
                long j2 = p4eVar3.f26347a;
                pu90 pu90VarS2 = pj30Var3.S(p4e.b(j, 0, 0, iH, p4e.h(j2) + iT4, 3));
                return vj30.x(vj30Var3, pu90VarS2.f27604a, p4e.h(j2), new n7(pu90VarS2, iT4, (byte) 18));
            case 15:
                fet fetVar = (fet) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((y5d) obj).getClass();
                if (fetVar.U(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    nkb.h(null, new ijm(), kjm.b, null, null, null, fetVar, 384, 57);
                    for (int i2 = 0; i2 < 16; i2++) {
                        mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
                        zcl zclVar4 = qmk.f28987a;
                        mm40 mm40VarN = s5x0.N(o7k0.e(mm40VarD, 56.0f), 0.0f, 0.0f, 0.0f, 8.0f, 7);
                        zcl zclVar5 = qmk.i;
                        ugg0 ugg0Var = vgg0.f37379a;
                        qxw.o(fetVar, xbc.c0(h97.e(zclVar5, zclVar5, zclVar5, zclVar5, mm40VarN), vbc.d0(null, fetVar, 0, 1)));
                    }
                } else {
                    fetVar.X();
                }
                return Unit.f46060a;
            default:
                ((Integer) obj).getClass();
                ((Float) obj2).getClass();
                ((Integer) obj3).getClass();
                return Unit.f46060a;
        }
    }

    public /* synthetic */ t330(byte b) {
        this.f33247a = b;
    }
}
