package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class y5j implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f42049a;
    public final /* synthetic */ e6j b;

    public /* synthetic */ y5j(e6j e6jVar, byte b) {
        this.f42049a = b;
        this.b = e6jVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f42049a;
        e6j e6jVar = this.b;
        Throwable th = (Throwable) obj;
        switch (b) {
            case 0:
                th.getClass();
                e6j.P(e6jVar, th);
                break;
            case 1:
                th.getClass();
                e6j.P(e6jVar, th);
                break;
            case 2:
                th.getClass();
                e6jVar.p.b(th, new zuh((byte) 11));
                break;
            default:
                th.getClass();
                e6j.P(e6jVar, th);
                break;
        }
        return Unit.f46060a;
    }
}
