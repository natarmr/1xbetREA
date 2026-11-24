package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class t57 implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f33354a;
    public final /* synthetic */ fqj0 b;

    public /* synthetic */ t57(fqj0 fqj0Var, byte b) {
        this.f33354a = b;
        this.b = fqj0Var;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.f33354a;
        jm40 jm40Var = jm40.b;
        fqj0 fqj0Var = this.b;
        switch (b) {
            case 0:
                fet fetVar = (fet) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((g9z) obj).getClass();
                if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                    float f = xfn.a(fetVar).d;
                    zcl zclVar = qmk.f28987a;
                    mm40 mm40VarE = o7k0.e(o7k0.d(s5x0.K(jm40Var, f, 4.0f), 1.0f), 52.0f);
                    zcl zclVar2 = qmk.i;
                    ugg0 ugg0Var = vgg0.f37379a;
                    zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE), fqj0Var));
                } else {
                    fetVar.X();
                }
                break;
            case 1:
                fet fetVar2 = (fet) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((g9z) obj).getClass();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    pz40 pz40Var = s6t0.f31722a;
                    pzw.r(s6t0.b().f33626a.getBackground(), fqj0Var, fetVar2, 0);
                    mbc.o(zfi0.f44303a, null, false, fetVar2, 6, 6);
                    pzw.r(s6t0.b().f33626a.getBackgroundContent(), fqj0Var, fetVar2, 0);
                } else {
                    fetVar2.X();
                }
                break;
            case 2:
                fet fetVar3 = (fet) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((g9z) obj).getClass();
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    m8x.e(fqj0Var, fetVar3, 0);
                } else {
                    fetVar3.X();
                }
                break;
            case 3:
                fet fetVar4 = (fet) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((g9z) obj).getClass();
                if (fetVar4.U(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    x8x.a(fqj0Var, fetVar4, 0);
                } else {
                    fetVar4.X();
                }
                break;
            default:
                fet fetVar5 = (fet) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((g9z) obj).getClass();
                if (fetVar5.U(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                    pz40 pz40Var2 = s6t0.f31722a;
                    mm40 mm40VarQ = i120.Q(mm40VarD, s6t0.b().f33626a.getBackgroundContent(), jd8.n);
                    zcl zclVar3 = qmk.f28987a;
                    mm40 mm40VarN = s5x0.N(mm40VarQ, xfn.a(fetVar5).e, 8.0f, 0.0f, 8.0f, 4);
                    boolean zG = fetVar5.g(fqj0Var);
                    Object objP = fetVar5.P();
                    if (zG || objP == ukd.f35823a) {
                        objP = new yq5(fqj0Var, (byte) 5);
                        fetVar5.o0(objP);
                    }
                    b8k0.f(mm40VarN, null, null, false, null, null, null, false, null, (Function1) objP, fetVar5, 12582912, 382);
                } else {
                    fetVar5.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
