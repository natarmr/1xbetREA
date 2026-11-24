package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class eht implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f7824a;
    public final /* synthetic */ cqq b;

    public /* synthetic */ eht(cqq cqqVar, byte b) {
        this.f7824a = b;
        this.b = cqqVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f7824a;
        ((jly) obj).getClass();
        switch (b) {
            case 0:
                cqq.a(this.b);
                break;
            default:
                cqq.a(this.b);
                break;
        }
        return Unit.f46060a;
    }
}
