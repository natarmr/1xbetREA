package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class iv0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f15420a;
    public final /* synthetic */ kv0 b;

    public /* synthetic */ iv0(kv0 kv0Var, byte b) {
        this.f15420a = b;
        this.b = kv0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f15420a;
        kv0 kv0Var = this.b;
        switch (b) {
            case 0:
                hfk0 hfk0Var = kv0.n2;
                fiu0 fiu0Var = kv0Var.l2;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 1:
                hfk0 hfk0Var2 = kv0.n2;
                kv0Var.P0().x(dv0.f6720a);
                return Unit.f46060a;
            default:
                hfk0 hfk0Var3 = kv0.n2;
                kv0Var.P0().x(ev0.f8446a);
                return Unit.f46060a;
        }
    }
}
