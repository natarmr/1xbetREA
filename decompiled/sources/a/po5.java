package a;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class po5 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f27315a;
    public final /* synthetic */ ro5 b;

    public /* synthetic */ po5(ro5 ro5Var, byte b) {
        this.f27315a = b;
        this.b = ro5Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f27315a;
        ro5 ro5Var = this.b;
        switch (b) {
            case 0:
                return ro5Var;
            case 1:
                return new r0x(ro5Var.h);
            default:
                return new r0x(ro5Var.i);
        }
    }
}
