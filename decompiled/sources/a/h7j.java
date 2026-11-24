package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class h7j implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f12576a;
    public final /* synthetic */ o7j b;

    public /* synthetic */ h7j(o7j o7jVar, byte b) {
        this.f12576a = b;
        this.b = o7jVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f12576a;
        o7j o7jVar = this.b;
        Throwable th = (Throwable) obj;
        switch (b) {
            case 0:
                th.getClass();
                o7jVar.y(new j7j(o7jVar.w()));
                o7jVar.e.a(th);
                break;
            default:
                th.getClass();
                o7jVar.y(new j7j(o7jVar.w()));
                o7jVar.e.a(th);
                break;
        }
        return Unit.f46060a;
    }
}
