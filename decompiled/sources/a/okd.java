package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class okd implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f25401a;
    public final /* synthetic */ cwk b;
    public final /* synthetic */ ugd c;

    public /* synthetic */ okd(cwk cwkVar, ugd ugdVar, byte b) {
        this.f25401a = b;
        this.b = cwkVar;
        this.c = ugdVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f25401a;
        ugd ugdVar = this.c;
        cwk cwkVar = this.b;
        byte b2 = 1;
        fet fetVar = (fet) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (b) {
            case 0:
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    pz40 pz40Var = s6t0.f31722a;
                    dem0.e(s6t0.b(), s6t0.c(), u1c.M(1371670087, new okd(cwkVar, ugdVar, b2), fetVar), fetVar, 384, 0);
                } else {
                    fetVar.X();
                }
                break;
            default:
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    obc.d(jr00.b.a(cwkVar), u1c.M(1676512007, new w(ugdVar, (byte) 5), fetVar), fetVar, 56);
                } else {
                    fetVar.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
