package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class sca implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f31976a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ pda c;
    public final /* synthetic */ Function2 d;

    public /* synthetic */ sca(mm40 mm40Var, pda pdaVar, Function2 function2, int i) {
        this.f31976a = (byte) 0;
        this.b = mm40Var;
        this.c = pdaVar;
        this.d = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f31976a;
        mm40 mm40Var = this.b;
        pda pdaVar = this.c;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                o050.h(mm40Var, pdaVar, this.d, (fet) obj, x8x.L(1));
                break;
            case 1:
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    kcp0.a(this.b, pdaVar.b, this.d, fetVar, 0, 0);
                } else {
                    fetVar.X();
                }
                break;
            default:
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    zcl zclVar = qmk.f28987a;
                    kcp0.a(o7k0.e(mm40Var, 72.0f), pdaVar.c, this.d, fetVar2, 0, 0);
                } else {
                    fetVar2.X();
                }
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ sca(mm40 mm40Var, pda pdaVar, Function2 function2, byte b) {
        this.f31976a = b;
        this.b = mm40Var;
        this.c = pdaVar;
        this.d = function2;
    }
}
