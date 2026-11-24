package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final class wlr0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f39371a;
    public final /* synthetic */ ylr0 b;
    public final /* synthetic */ hmr0 c;

    public /* synthetic */ wlr0(ylr0 ylr0Var, hmr0 hmr0Var, byte b) {
        this.f39371a = b;
        this.b = ylr0Var;
        this.c = hmr0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f39371a;
        hmr0 hmr0Var = this.c;
        ylr0 ylr0Var = this.b;
        switch (b) {
            case 0:
                int i = hmr0Var.f13321a;
                int i2 = ylr0.m2;
                ylr0Var.P0(i);
                break;
            default:
                int i3 = hmr0Var.f13321a;
                int i4 = ylr0.m2;
                ylr0Var.P0(i3);
                break;
        }
        return Unit.f46060a;
    }
}
