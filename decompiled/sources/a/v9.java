package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class v9 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f37008a;
    public final /* synthetic */ ab b;

    public /* synthetic */ v9(ab abVar, byte b) {
        this.f37008a = b;
        this.b = abVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f37008a;
        ab abVar = this.b;
        Throwable th = (Throwable) obj;
        String str = (String) obj2;
        switch (b) {
            case 0:
                th.getClass();
                str.getClass();
                abVar.w0.f(new ca(pek0.f26859a, str));
                break;
            default:
                th.getClass();
                str.getClass();
                abVar.w0.f(new ca(rek0.b, str));
                th.printStackTrace();
                break;
        }
        return Unit.f46060a;
    }
}
