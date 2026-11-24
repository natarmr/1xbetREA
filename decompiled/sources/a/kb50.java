package a;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kb50 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f17996a;
    public final /* synthetic */ oms0 b;

    public /* synthetic */ kb50(oms0 oms0Var, byte b) {
        this.f17996a = b;
        this.b = oms0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f17996a;
        oms0 oms0Var = this.b;
        switch (b) {
            case 0:
                return Boolean.valueOf(oms0Var.g());
            case 1:
                return Boolean.valueOf(oms0Var.g());
            case 2:
                return Boolean.valueOf(!Intrinsics.d(((hgk0) oms0Var.d).getValue(), oms0Var.f25519a.y0()) || oms0Var.g() || ((Boolean) ((hgk0) oms0Var.i).getValue()).booleanValue());
            default:
                return Long.valueOf(oms0Var.b());
        }
    }
}
