package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class mfe implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f21690a;
    public final /* synthetic */ db00 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Function1 d;

    public /* synthetic */ mfe(db00 db00Var, boolean z, Function1 function1, byte b) {
        this.f21690a = b;
        this.b = db00Var;
        this.c = z;
        this.d = function1;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.f21690a;
        cl5 cl5Var = ukd.f35823a;
        fet fetVar = (fet) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((zdz) obj).getClass();
        int i = iIntValue & 17;
        switch (b) {
            case 0:
                if (fetVar.U(iIntValue & 1, i != 16)) {
                    zcl zclVar = qmk.f28987a;
                    mm40 mm40VarN = s5x0.N(jm40.b, 0.0f, 0.0f, 0.0f, 8.0f, 7);
                    Object objP = fetVar.P();
                    if (objP == cl5Var) {
                        objP = new vzd((byte) 5);
                        fetVar.o0(objP);
                    }
                    t9x.y(mm40VarN, this.b, this.c, this.d, (Function1) objP, fetVar, 24576);
                } else {
                    fetVar.X();
                }
                break;
            default:
                if (fetVar.U(iIntValue & 1, i != 16)) {
                    zcl zclVar2 = qmk.f28987a;
                    mm40 mm40VarN2 = s5x0.N(jm40.b, 0.0f, 0.0f, 0.0f, 8.0f, 7);
                    Object objP2 = fetVar.P();
                    if (objP2 == cl5Var) {
                        objP2 = new vzd((byte) 4);
                        fetVar.o0(objP2);
                    }
                    t9x.y(mm40VarN2, this.b, this.c, this.d, (Function1) objP2, fetVar, 24576);
                } else {
                    fetVar.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
