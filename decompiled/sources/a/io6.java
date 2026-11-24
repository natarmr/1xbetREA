package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class io6 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f15105a;
    public final /* synthetic */ po6 b;

    public /* synthetic */ io6(po6 po6Var, byte b) {
        this.f15105a = b;
        this.b = po6Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f15105a;
        po6 po6Var = this.b;
        switch (b) {
            case 0:
                return po6Var.x.a();
            default:
                qjj.W(jiu0.a(po6Var), null, null, new ko6(po6Var, null, (byte) 2), 3);
                return Unit.f46060a;
        }
    }
}
