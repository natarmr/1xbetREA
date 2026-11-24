package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class aag implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f522a;
    public final /* synthetic */ hbg b;

    public /* synthetic */ aag(hbg hbgVar, byte b) {
        this.f522a = b;
        this.b = hbgVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f522a;
        hbg hbgVar = this.b;
        switch (b) {
            case 0:
                if (((Integer) obj).intValue() == 1) {
                    dyb.Q(new e8g(hbgVar, (byte) 4));
                }
                break;
            case 1:
                Throwable th = (Throwable) obj;
                th.getClass();
                hbgVar.l.b(th, new zag(hbgVar, (byte) 0));
                break;
            default:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                hbgVar.l.b(th2, new jyf((byte) 16));
                break;
        }
        return Unit.f46060a;
    }
}
