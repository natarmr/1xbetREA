package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class dim implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f6147a;
    public final /* synthetic */ whm b;
    public final /* synthetic */ sd c;
    public final /* synthetic */ Function0 d;

    public /* synthetic */ dim(whm whmVar, sd sdVar, Function0 function0, byte b) {
        this.f6147a = b;
        this.b = whmVar;
        this.c = sdVar;
        this.d = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f6147a;
        cl5 cl5Var = ukd.f35823a;
        Function0 function0 = this.d;
        whm whmVar = this.b;
        switch (b) {
            case 0:
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(1 & iIntValue, (iIntValue & 3) != 2)) {
                    zcl zclVar = qmk.f28987a;
                    mm40 mm40VarN = s5x0.N(jm40.b, 16.0f, 0.0f, 0.0f, 0.0f, 14);
                    ee eeVar = whmVar.k;
                    if (function0 == null) {
                        fetVar.e0(259300417);
                        Object objP = fetVar.P();
                        if (objP == cl5Var) {
                            objP = new ndm((byte) 4);
                            fetVar.o0(objP);
                        }
                        function0 = (Function0) objP;
                    } else {
                        fetVar.e0(-545825357);
                    }
                    fetVar.r(false);
                    jcb.f(mm40VarN, eeVar, this.c, false, null, function0, fetVar, 3072, 16);
                } else {
                    fetVar.X();
                }
                break;
            default:
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    zcl zclVar2 = qmk.f28987a;
                    mm40 mm40VarN2 = s5x0.N(jm40.b, 16.0f, 0.0f, 0.0f, 0.0f, 14);
                    ee eeVar2 = whmVar.k;
                    if (function0 == null) {
                        fetVar2.e0(1657660105);
                        Object objP2 = fetVar2.P();
                        if (objP2 == cl5Var) {
                            objP2 = new ndm((byte) 5);
                            fetVar2.o0(objP2);
                        }
                        function0 = (Function0) objP2;
                    } else {
                        fetVar2.e0(-1609095637);
                    }
                    fetVar2.r(false);
                    jcb.f(mm40VarN2, eeVar2, this.c, false, null, function0, fetVar2, 3072, 16);
                } else {
                    fetVar2.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
