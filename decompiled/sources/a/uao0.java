package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class uao0 implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f35341a;
    public final /* synthetic */ rah0 b;
    public final /* synthetic */ cpm c;
    public final /* synthetic */ Function1 d;

    public /* synthetic */ uao0(rah0 rah0Var, cpm cpmVar, Function1 function1, byte b) {
        this.f35341a = b;
        this.b = rah0Var;
        this.c = cpmVar;
        this.d = function1;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.f35341a;
        cl5 cl5Var = ukd.f35823a;
        jm40 jm40Var = jm40.b;
        Function1 function1 = this.d;
        rah0 rah0Var = this.b;
        switch (b) {
            case 0:
                fet fetVar = (fet) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((y5d) obj).getClass();
                if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                    mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                    zcl zclVar = qmk.f28987a;
                    mm40 mm40VarA0 = wha0.a0(s5x0.N(mm40VarD, 0.0f, 8.0f, 0.0f, 4.0f, 5), rah0Var, false, 14);
                    boolean zG = fetVar.g(function1);
                    Object objP = fetVar.P();
                    if (zG || objP == cl5Var) {
                        objP = new zbm0(function1, (byte) 21);
                        fetVar.o0(objP);
                    }
                    u1c.i(mm40VarA0, this.c, (Function1) objP, fetVar, 0, 4);
                } else {
                    fetVar.X();
                }
                break;
            default:
                fet fetVar2 = (fet) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((y5d) obj).getClass();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
                    zcl zclVar2 = qmk.f28987a;
                    mm40 mm40VarA1 = wha0.a0(s5x0.L(mm40VarD2, 0.0f, 8.0f, 1), rah0Var, false, 14);
                    boolean zG2 = fetVar2.g(function1);
                    Object objP2 = fetVar2.P();
                    if (zG2 || objP2 == cl5Var) {
                        objP2 = new zbm0(function1, (byte) 23);
                        fetVar2.o0(objP2);
                    }
                    u1c.i(mm40VarA1, this.c, (Function1) objP2, fetVar2, 0, 4);
                } else {
                    fetVar2.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
