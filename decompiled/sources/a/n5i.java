package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class n5i implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f22945a = 0;
    public final /* synthetic */ w9n b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ n5i(w9n w9nVar, Function1 function1) {
        this.b = w9nVar;
        this.c = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f22945a;
        Function1 function1 = this.c;
        w9n w9nVar = this.b;
        switch (b) {
            case 0:
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    o0x o0xVarR = w9nVar.r();
                    o0x o0xVarW = w9nVar.w();
                    boolean zG = fetVar.g(function1);
                    Object objP = fetVar.P();
                    if (zG || objP == ukd.f35823a) {
                        objP = new olh(function1, (byte) 8);
                        fetVar.o0(objP);
                    }
                    ibm0.e(o0xVarR, o0xVarW, (Function1) objP, phu0.b, u1c.M(1716894427, new tx(w9nVar, (byte) 17), fetVar), fetVar, 27648);
                } else {
                    fetVar.X();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                jar0.M(w9nVar, function1, (fet) obj, x8x.L(385));
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ n5i(w9n w9nVar, Function1 function1, int i) {
        this.b = w9nVar;
        this.c = function1;
    }
}
