package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d9g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f5699a;
    public final /* synthetic */ g9g b;

    public /* synthetic */ d9g(g9g g9gVar, byte b) {
        this.f5699a = b;
        this.b = g9gVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f5699a;
        g9g g9gVar = this.b;
        Throwable th = (Throwable) obj;
        switch (b) {
            case 0:
                th.getClass();
                g9gVar.h.b(th, new cnc(g9gVar, (byte) 28));
                break;
            default:
                th.getClass();
                g9gVar.h.b(th, new jyf((byte) 15));
                break;
        }
        return Unit.f46060a;
    }
}
