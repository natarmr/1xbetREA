package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o1j implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f24482a;
    public final /* synthetic */ q1j b;

    public /* synthetic */ o1j(q1j q1jVar, byte b) {
        this.f24482a = b;
        this.b = q1jVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f24482a;
        q1j q1jVar = this.b;
        switch (b) {
            case 0:
                int i = q1j.n2;
                fiu0 fiu0Var = q1jVar.l2;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 1:
                int i2 = q1j.n2;
                q1jVar.P0().x(i1j.f14000a);
                return Unit.f46060a;
            default:
                int i3 = q1j.n2;
                q1jVar.P0().x(j1j.f15737a);
                return Unit.f46060a;
        }
    }
}
