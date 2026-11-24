package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class uq4 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f36100a = 0;
    public final /* synthetic */ hl60 b;

    public /* synthetic */ uq4(hl60 hl60Var) {
        this.b = hl60Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f36100a;
        hl60 hl60Var = this.b;
        fet fetVar = (fet) obj;
        Integer num = (Integer) obj2;
        switch (b) {
            case 0:
                int iIntValue = num.intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    String strS = xsm0.s(R.string.authenticator, fetVar);
                    boolean zI = fetVar.i(hl60Var);
                    Object objP = fetVar.P();
                    if (zI || objP == ukd.f35823a) {
                        objP = new zo4(hl60Var, (byte) 2);
                        fetVar.o0(objP);
                    }
                    jeb.i(strS, (Function0) objP, fetVar, 0);
                } else {
                    fetVar.X();
                }
                break;
            default:
                num.getClass();
                cjx.f(hl60Var, fetVar, x8x.L(9));
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ uq4(hl60 hl60Var, int i) {
        this.b = hl60Var;
    }
}
