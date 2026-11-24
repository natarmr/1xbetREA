package a;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class hab0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f12716a;
    public final /* synthetic */ sbb0 b;

    public /* synthetic */ hab0(sbb0 sbb0Var, byte b) {
        this.f12716a = b;
        this.b = sbb0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        boolean zA;
        byte b = this.f12716a;
        sbb0 sbb0Var = this.b;
        switch (b) {
            case 0:
                zA = sbb0Var.S.a();
                break;
            default:
                zA = sbb0Var.W.a();
                break;
        }
        return Boolean.valueOf(zA);
    }
}
