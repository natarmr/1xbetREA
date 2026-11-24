package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class j8g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f16082a;
    public final /* synthetic */ k8g b;

    public /* synthetic */ j8g(k8g k8gVar, byte b) {
        this.f16082a = b;
        this.b = k8gVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f16082a;
        k8g k8gVar = this.b;
        Throwable th = (Throwable) obj;
        switch (b) {
            case 0:
                th.getClass();
                k8gVar.g.b(th, new jyf((byte) 12));
                break;
            default:
                th.getClass();
                k8gVar.g.b(th, new jyf((byte) 13));
                break;
        }
        return Unit.f46060a;
    }
}
