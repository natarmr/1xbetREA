package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class gyd extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ kyd j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gyd(kyd kydVar, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = kydVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        kyd kydVar = this.j;
        switch (b) {
            case 0:
                return new gyd(kydVar, yjeVar, (byte) 0);
            default:
                return new gyd(kydVar, yjeVar, (byte) 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        kmq kmqVar = (kmq) obj;
        yje yjeVar = (yje) obj2;
        switch (this.i) {
            case 0:
                break;
        }
        return ((gyd) create(kmqVar, yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        switch (this.i) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                this.j.K();
                break;
            default:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                kyd kydVar = this.j;
                mne mneVar = kydVar.c;
                c4m0 c4m0Var = kydVar.E;
                if (c4m0Var == null || !c4m0Var.isActive()) {
                    kydVar.E = sac.T(new fnq(kydVar.k.b(), new yxd(kydVar, null, (byte) 3), (byte) 4), d5c.S(jiu0.a(kydVar), mneVar.f22085a), new pd(2, null, (byte) 29));
                }
                v3c.N(kydVar.H);
                kydVar.H = sac.V(jiu0.a(kydVar), new enc(1, kydVar, kyd.class, "handleServerError", "handleServerError(Ljava/lang/Throwable;)V", 0, (byte) 23), null, mneVar.b, new fj3(kydVar, (yje) null, (byte) 4), 10);
                break;
        }
        return Unit.f46060a;
    }
}
