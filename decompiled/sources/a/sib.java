package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class sib implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f32254a;
    public final /* synthetic */ ajb b;

    public /* synthetic */ sib(ajb ajbVar, byte b) {
        this.f32254a = b;
        this.b = ajbVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f32254a;
        ajb ajbVar = this.b;
        Throwable th = (Throwable) obj;
        switch (b) {
            case 0:
                th.getClass();
                ajbVar.O(th);
                break;
            default:
                th.getClass();
                ajbVar.q.b(th, new pua((byte) 20));
                break;
        }
        return Unit.f46060a;
    }
}
