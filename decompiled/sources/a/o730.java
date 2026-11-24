package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class o730 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f24765a;
    public final /* synthetic */ s730 b;

    public /* synthetic */ o730(s730 s730Var, byte b) {
        this.f24765a = b;
        this.b = s730Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f24765a;
        s730 s730Var = this.b;
        switch (b) {
            case 0:
                fiu0 fiu0Var = s730Var.L1;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            default:
                atz atzVar = s730.Q1;
                s730Var.G0().f.setVisibility(8);
                return Unit.f46060a;
        }
    }
}
