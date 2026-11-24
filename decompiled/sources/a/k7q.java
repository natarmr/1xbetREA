package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class k7q implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f17836a;
    public final /* synthetic */ r8q b;

    public /* synthetic */ k7q(r8q r8qVar, byte b) {
        this.f17836a = b;
        this.b = r8qVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f17836a;
        r8q r8qVar = this.b;
        switch (b) {
            case 0:
                r8qVar.T.f(u7q.f35197a);
                break;
            default:
                r8qVar.T.f(b8q.f2168a);
                break;
        }
        return Unit.f46060a;
    }
}
