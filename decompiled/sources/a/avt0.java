package a;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public final class avt0 extends guy implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f1544a;
    public final /* synthetic */ vkr0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ avt0(vkr0 vkr0Var, byte b) {
        super(0);
        this.f1544a = b;
        this.b = vkr0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f1544a;
        vkr0 vkr0Var = this.b;
        switch (b) {
            case 0:
                return new kf60(new jw20((wut0) vkr0Var.b));
            default:
                wut0 wut0Var = (wut0) vkr0Var.b;
                return new kvq0(new eio(wut0Var.f39807a), wut0Var.s, wut0Var.r);
        }
    }
}
