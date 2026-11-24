package a;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final class hwb0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f13763a;
    public final iwb0 b;

    public /* synthetic */ hwb0(iwb0 iwb0Var, byte b) {
        this.f13763a = b;
        this.b = iwb0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f13763a;
        iwb0 iwb0Var = this.b;
        switch (b) {
            case 0:
                return j4m0.l.a(iwb0Var.f15481a);
            default:
                return j4m0.l.a(iwb0Var.b);
        }
    }
}
