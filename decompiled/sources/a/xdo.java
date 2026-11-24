package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class xdo implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f40704a = 1;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ ydo c;

    public /* synthetic */ xdo(ydo ydoVar, mm40 mm40Var) {
        this.c = ydoVar;
        this.b = mm40Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f40704a;
        ydo ydoVar = this.c;
        switch (b) {
            case 0:
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(1 & iIntValue, (iIntValue & 3) != 2)) {
                    v8q0.a(ydoVar.b, this.b, 0L, null, 0L, null, null, null, 0L, new f2q0(3), 0L, 0, false, 0, 0, null, ibm0.n(new y9q0(0L, qmk.q, null, j1t0.c, 0L, null, 0, 0, qmk.D, 16646109), fetVar), fetVar, 0, 0, 130044);
                } else {
                    fetVar.X();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                aac.s(this.b, ydoVar, (fet) obj, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ xdo(mm40 mm40Var, ydo ydoVar, int i) {
        this.b = mm40Var;
        this.c = ydoVar;
    }
}
