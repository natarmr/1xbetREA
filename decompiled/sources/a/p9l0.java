package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class p9l0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f26612a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ j3n c;

    public /* synthetic */ p9l0(mm40 mm40Var, j3n j3nVar, byte b) {
        this.f26612a = b;
        this.b = mm40Var;
        this.c = j3nVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f26612a;
        j3n j3nVar = this.c;
        mm40 mm40Var = this.b;
        byte b2 = 1;
        switch (b) {
            case 0:
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    obc.d(eal0.c.a(new y9q0(0L, qmk.p, null, j1t0.b, 0L, null, 0, 0, qmk.C, 16646109)), u1c.M(-1097625027, new p9l0(mm40Var, j3nVar, b2), fetVar), fetVar, 56);
                } else {
                    fetVar.X();
                }
                break;
            default:
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    yqm0.b(mm40Var, u1c.M(-1948032661, new ze2(j3nVar, (byte) 3), fetVar2), fetVar2, 48);
                } else {
                    fetVar2.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
