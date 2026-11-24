package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class w9 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f38751a;
    public final /* synthetic */ ab b;

    public /* synthetic */ w9(ab abVar, byte b) {
        this.f38751a = b;
        this.b = abVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f38751a;
        ab abVar = this.b;
        switch (b) {
            case 0:
                ab abVar2 = this.b;
                abVar2.getClass();
                sac.V(jiu0.a(abVar2), new t0(1, abVar2, ab.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 7), null, abVar2.x.f22085a, new pa((Object) abVar2, (yje) null, (byte) 0), 10);
                break;
            case 1:
                abVar.w0.f(z9.f43993a);
                break;
            default:
                abVar.y.d(new u9(abVar, (byte) 3));
                break;
        }
        return Unit.f46060a;
    }
}
