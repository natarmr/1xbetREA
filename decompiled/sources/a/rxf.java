package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class rxf implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f31263a;
    public final /* synthetic */ l7m0 b;
    public final /* synthetic */ Function0 c;

    public /* synthetic */ rxf(l7m0 l7m0Var, Function0 function0) {
        this.f31263a = (byte) 1;
        this.b = l7m0Var;
        this.c = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f31263a;
        Function0 function0 = this.c;
        l7m0 l7m0Var = this.b;
        fet fetVar = (fet) obj;
        Integer num = (Integer) obj2;
        switch (b) {
            case 0:
                num.getClass();
                j2e.n(l7m0Var, function0, fetVar, x8x.L(1));
                break;
            case 1:
                int iIntValue = num.intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    nia0.o(null, u1c.M(-1586227436, new nhl0(l7m0Var, function0, (byte) 22), fetVar), fetVar, 48);
                } else {
                    fetVar.X();
                }
                break;
            default:
                num.getClass();
                yqm0.d(l7m0Var, function0, fetVar, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ rxf(l7m0 l7m0Var, Function0 function0, int i, byte b) {
        this.f31263a = b;
        this.b = l7m0Var;
        this.c = function0;
    }
}
