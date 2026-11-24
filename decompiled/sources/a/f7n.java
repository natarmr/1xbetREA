package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class f7n implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f9066a = 1;
    public final /* synthetic */ cqq b;

    public /* synthetic */ f7n(cqq cqqVar) {
        this.b = cqqVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f9066a;
        cqq cqqVar = this.b;
        switch (b) {
            case 0:
                break;
            default:
                if (cqqVar != null) {
                    cqq.a(cqqVar);
                }
                break;
        }
        return Unit.f46060a;
    }
}
