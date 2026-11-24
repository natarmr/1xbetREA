package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final class iry implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f15280a;
    public final /* synthetic */ to9 b;

    public /* synthetic */ iry(to9 to9Var, byte b) {
        this.f15280a = b;
        this.b = to9Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f15280a;
        to9 to9Var = this.b;
        switch (b) {
            case 0:
                to9Var.cancel();
                break;
            case 1:
                to9Var.cancel();
                break;
            default:
                to9Var.cancel();
                break;
        }
        return Unit.f46060a;
    }
}
