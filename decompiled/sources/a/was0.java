package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class was0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f38846a;
    public final /* synthetic */ Throwable b;

    public /* synthetic */ was0(Throwable th, byte b) {
        this.f38846a = b;
        this.b = th;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f38846a;
        Throwable th = this.b;
        Throwable th2 = (Throwable) obj;
        String str = (String) obj2;
        switch (b) {
            case 0:
                th.printStackTrace();
                break;
            default:
                cs0.C(th2, str, th);
                break;
        }
        return Unit.f46060a;
    }
}
