package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class sns implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f32510a;
    public final /* synthetic */ zns b;
    public final /* synthetic */ Throwable c;

    public /* synthetic */ sns(zns znsVar, Throwable th, byte b) {
        this.f32510a = b;
        this.b = znsVar;
        this.c = th;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f32510a;
        Throwable th = this.c;
        zns znsVar = this.b;
        Throwable th2 = (Throwable) obj;
        String str = (String) obj2;
        switch (b) {
            case 0:
                th2.getClass();
                str.getClass();
                if (!znsVar.P(th)) {
                    znsVar.G(ons.f25562a);
                }
                break;
            default:
                th2.getClass();
                str.getClass();
                znsVar.P(th);
                break;
        }
        return Unit.f46060a;
    }
}
