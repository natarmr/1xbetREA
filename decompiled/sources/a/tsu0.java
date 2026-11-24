package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class tsu0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f34480a;
    public final /* synthetic */ mm40 b;

    public /* synthetic */ tsu0(mm40 mm40Var, int i, byte b) {
        this.f34480a = b;
        this.b = mm40Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f34480a;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                tke.P(x8x.L(1), fetVar, this.b);
                break;
            case 1:
                eeq.H(x8x.L(1), fetVar, this.b);
                break;
            case 2:
                lvm0.e(x8x.L(1), fetVar, this.b);
                break;
            case 3:
                k7n0.d(x8x.L(1), fetVar, this.b);
                break;
            case 4:
                k7n0.a(x8x.L(1), fetVar, this.b);
                break;
            default:
                xia0.J(x8x.L(1), fetVar, this.b);
                break;
        }
        return Unit.f46060a;
    }
}
