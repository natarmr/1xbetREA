package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class h57 implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f12466a;
    public final /* synthetic */ z77 b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ h57(z77 z77Var, Function1 function1, byte b) {
        this.f12466a = b;
        this.b = z77Var;
        this.c = function1;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.f12466a;
        cl5 cl5Var = ukd.f35823a;
        Function1 function1 = this.c;
        z77 z77Var = this.b;
        switch (b) {
            case 0:
                fet fetVar = (fet) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((g9z) obj).getClass();
                if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                    dn7 dn7Var = ((pv7) ((x77) z77Var).h).f27650a;
                    boolean zG = fetVar.g(function1);
                    Object objP = fetVar.P();
                    if (zG || objP == cl5Var) {
                        objP = new to6(function1, (byte) 5);
                        fetVar.o0(objP);
                    }
                    x4d0.h(null, dn7Var, (Function0) objP, fetVar, 0, 1);
                } else {
                    fetVar.X();
                }
                break;
            case 1:
                fet fetVar2 = (fet) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((g9z) obj).getClass();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    zcl zclVar = qmk.f28987a;
                    mm40 mm40VarN = s5x0.N(jm40.b, 0.0f, 8.0f, 0.0f, 0.0f, 13);
                    dn7 dn7Var2 = ((pv7) ((x77) z77Var).h).f27650a;
                    boolean zG2 = fetVar2.g(function1);
                    Object objP2 = fetVar2.P();
                    if (zG2 || objP2 == cl5Var) {
                        objP2 = new xv50(function1, (byte) 14);
                        fetVar2.o0(objP2);
                    }
                    x4d0.h(mm40VarN, dn7Var2, (Function0) objP2, fetVar2, 0, 0);
                } else {
                    fetVar2.X();
                }
                break;
            default:
                fet fetVar3 = (fet) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((g9z) obj).getClass();
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    dn7 dn7Var3 = ((pv7) ((x77) z77Var).h).f27650a;
                    boolean zG3 = fetVar3.g(function1);
                    Object objP3 = fetVar3.P();
                    if (zG3 || objP3 == cl5Var) {
                        objP3 = new gno0(function1, (byte) 6);
                        fetVar3.o0(objP3);
                    }
                    x4d0.h(null, dn7Var3, (Function0) objP3, fetVar3, 0, 1);
                } else {
                    fetVar3.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
