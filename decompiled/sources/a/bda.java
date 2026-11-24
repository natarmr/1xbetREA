package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class bda implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f2389a;
    public final /* synthetic */ y5d b;
    public final /* synthetic */ mm40 c;
    public final /* synthetic */ oda d;
    public final /* synthetic */ Function2 e;

    public /* synthetic */ bda(y5d y5dVar, mm40 mm40Var, oda odaVar, Function2 function2, byte b) {
        this.f2389a = b;
        this.b = y5dVar;
        this.c = mm40Var;
        this.d = odaVar;
        this.e = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f2389a) {
            case 0:
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    obc.d(egp0.c.a(new y9q0(0L, qmk.p, null, j1t0.b, 0L, null, 0, 0, qmk.C, 16646109)), u1c.M(-680064157, new bda(this.b, this.c, this.d, this.e, (byte) 1), fetVar), fetVar, 56);
                } else {
                    fetVar.X();
                }
                break;
            default:
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    msm0.b(this.b.b(this.c, true), u1c.M(394099701, new z1s(this.d, this.e, (byte) 1), fetVar2), fetVar2, 48);
                } else {
                    fetVar2.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
