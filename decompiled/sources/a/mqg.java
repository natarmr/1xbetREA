package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class mqg implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f22223a;
    public final /* synthetic */ vqg b;

    public /* synthetic */ mqg(vqg vqgVar, byte b) {
        this.f22223a = b;
        this.b = vqgVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f22223a;
        vqg vqgVar = this.b;
        switch (b) {
            case 0:
                Throwable th = (Throwable) obj;
                th.getClass();
                vqgVar.z();
                vqgVar.c.a(th);
                break;
            default:
                vqgVar.D.f(new pqg(((Integer) obj).intValue()));
                break;
        }
        return Unit.f46060a;
    }
}
