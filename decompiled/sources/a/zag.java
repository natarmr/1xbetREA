package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class zag implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f44066a;
    public final /* synthetic */ hbg b;

    public /* synthetic */ zag(hbg hbgVar, byte b) {
        this.f44066a = b;
        this.b = hbgVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f44066a;
        hbg hbgVar = this.b;
        Throwable th = (Throwable) obj;
        String str = (String) obj2;
        switch (b) {
            case 0:
                th.getClass();
                str.getClass();
                hbgVar.A();
                break;
            default:
                hbgVar.A();
                break;
        }
        return Unit.f46060a;
    }
}
