package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class fcr0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f9325a = 0;
    public final /* synthetic */ jcr0 b;

    public /* synthetic */ fcr0(jcr0 jcr0Var) {
        this.b = jcr0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f9325a;
        jcr0 jcr0Var = this.b;
        switch (b) {
            case 0:
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    xcz xczVarA = ddz.a(0, 0, fetVar, 0, 3);
                    n0q n0qVar = o7k0.c;
                    boolean zG = fetVar.g(jcr0Var);
                    Object objP = fetVar.P();
                    if (zG || objP == ukd.f35823a) {
                        objP = new nop0(jcr0Var, (byte) 29);
                        fetVar.o0(objP);
                    }
                    b8k0.e(n0qVar, xczVarA, null, null, null, null, false, null, (Function1) objP, fetVar, 6, 508);
                } else {
                    fetVar.X();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                ju70.G(jcr0Var, (fet) obj, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ fcr0(jcr0 jcr0Var, int i) {
        this.b = jcr0Var;
    }
}
