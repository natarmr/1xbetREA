package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class auo implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f1488a;
    public final /* synthetic */ wul b;
    public final /* synthetic */ Function0 c;

    public /* synthetic */ auo(wul wulVar, Function0 function0, int i) {
        this.f1488a = (byte) 2;
        this.b = wulVar;
        this.c = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f1488a;
        jm40 jm40Var = jm40.b;
        fet fetVar = (fet) obj;
        Integer num = (Integer) obj2;
        switch (b) {
            case 0:
                int iIntValue = num.intValue();
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    qzb.n(o7k0.d(jm40Var, 1.0f), this.b, this.c, fetVar, 6, 0);
                } else {
                    fetVar.X();
                }
                break;
            case 1:
                int iIntValue2 = num.intValue();
                if (fetVar.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    qzb.n(o7k0.d(jm40Var, 1.0f), this.b, this.c, fetVar, 6, 0);
                } else {
                    fetVar.X();
                }
                break;
            default:
                num.getClass();
                km10.d(this.b, this.c, fetVar, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ auo(wul wulVar, Function0 function0, byte b) {
        this.f1488a = b;
        this.b = wulVar;
        this.c = function0;
    }
}
