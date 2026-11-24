package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class sxv0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f32997a;
    public final /* synthetic */ txv0 b;

    public /* synthetic */ sxv0(txv0 txv0Var, byte b) {
        this.f32997a = b;
        this.b = txv0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f32997a;
        txv0 txv0Var = this.b;
        byte b2 = 2;
        byte b3 = 1;
        fet fetVar = (fet) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (b) {
            case 0:
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    y9a.q(txv0Var.g, new fjk(228, false, false, false), u1c.M(1362933375, new sxv0(txv0Var, b3), fetVar), fetVar, 384);
                } else {
                    fetVar.X();
                }
                break;
            case 1:
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    tnq0.f(0, fetVar);
                    boolean zG = fetVar.g(txv0Var);
                    Object objP = fetVar.P();
                    if (zG || objP == ukd.f35823a) {
                        objP = new jmv0(txv0Var, (byte) 12);
                        fetVar.o0(objP);
                    }
                    iym0.c(0, fetVar, (Function0) objP);
                    obc.e(new l5d0[]{or00.f25714a.a(r8x.V(null, fetVar, 3)), ps00.f27491a.a(txv0Var.e), luv0.f20695a.a(Boolean.TRUE)}, u1c.M(565291455, new sxv0(txv0Var, b2), fetVar), fetVar, 48);
                } else {
                    fetVar.X();
                }
                break;
            default:
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    txv0Var.b.a(0, fetVar);
                } else {
                    fetVar.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
