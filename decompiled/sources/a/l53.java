package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class l53 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f19436a;
    public final /* synthetic */ y9q0 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ String d;
    public final /* synthetic */ t33 e;

    public /* synthetic */ l53(y9q0 y9q0Var, long j, String str, t33 t33Var, byte b) {
        this.f19436a = b;
        this.b = y9q0Var;
        this.c = j;
        this.d = str;
        this.e = t33Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f19436a;
        cl5 cl5Var = ukd.f35823a;
        t33 t33Var = this.e;
        switch (b) {
            case 0:
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    Object objP = fetVar.P();
                    if (objP == cl5Var) {
                        objP = new n53(t33Var, (byte) 0);
                        fetVar.o0(objP);
                    }
                    aad.e(this.d, jm40.b, y9q0.a(this.b, 0L, this.c, null, null, null, 0L, null, null, 0, 1, 0L, null, null, 16711677), null, 2, false, 1, 0, (n4d) objP, null, fetVar, 1597488, 680);
                } else {
                    fetVar.X();
                }
                break;
            default:
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    Object objP2 = fetVar2.P();
                    if (objP2 == cl5Var) {
                        objP2 = new n53(t33Var, (byte) 1);
                        fetVar2.o0(objP2);
                    }
                    aad.e(this.d, jm40.b, y9q0.a(this.b, 0L, this.c, null, null, null, 0L, null, null, 0, 1, 0L, null, null, 16711677), null, 0, false, 0, 0, (n4d) objP2, null, fetVar2, 48, 760);
                } else {
                    fetVar2.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
