package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class iwh implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f15489a;
    public final /* synthetic */ lwh b;

    public /* synthetic */ iwh(lwh lwhVar, byte b) {
        this.f15489a = b;
        this.b = lwhVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f15489a;
        lwh lwhVar = this.b;
        Throwable th = (Throwable) obj;
        switch (b) {
            case 0:
                th.getClass();
                lwhVar.r.b(th, new jwh(lwhVar, (byte) 2));
                break;
            default:
                th.getClass();
                lwhVar.r.b(th, new jwh(lwhVar, (byte) 1));
                break;
        }
        return Unit.f46060a;
    }
}
