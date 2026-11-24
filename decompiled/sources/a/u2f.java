package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class u2f implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f34942a;
    public final /* synthetic */ a3f b;

    public /* synthetic */ u2f(a3f a3fVar, byte b) {
        this.f34942a = b;
        this.b = a3fVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f34942a;
        byte b2 = 21;
        a3f a3fVar = this.b;
        Throwable th = (Throwable) obj;
        switch (b) {
            case 0:
                th.getClass();
                a3fVar.q.b(th, new cnc(a3fVar, b2));
                break;
            case 1:
                th.getClass();
                a3fVar.q.b(th, new cnc(a3fVar, b2));
                break;
            case 2:
                a3fVar.q.b(th, new bqd((byte) 18));
                break;
            default:
                a3fVar.q.b(th, new bqd((byte) 19));
                break;
        }
        return Unit.f46060a;
    }
}
