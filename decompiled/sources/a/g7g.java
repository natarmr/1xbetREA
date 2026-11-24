package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class g7g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f10810a;
    public final /* synthetic */ j7g b;

    public /* synthetic */ g7g(j7g j7gVar, byte b) {
        this.f10810a = b;
        this.b = j7gVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f10810a;
        j7g j7gVar = this.b;
        Throwable th = (Throwable) obj;
        switch (b) {
            case 0:
                th.getClass();
                j7gVar.i.b(th, new jyf((byte) 11));
                break;
            case 1:
                th.getClass();
                j7gVar.i.b(th, new jyf((byte) 9));
                break;
            default:
                th.getClass();
                j7gVar.i.b(th, new jyf((byte) 10));
                break;
        }
        return Unit.f46060a;
    }
}
