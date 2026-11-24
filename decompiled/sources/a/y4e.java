package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class y4e implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f41999a;
    public final /* synthetic */ i5e b;

    public /* synthetic */ y4e(i5e i5eVar, byte b) {
        this.f41999a = b;
        this.b = i5eVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f41999a;
        i5e i5eVar = this.b;
        switch (b) {
            case 0:
                kud kudVar = i5e.q2;
                i1w0 i1w0VarF = a4n0.f(i5eVar);
                fdi fdiVar = i5eVar.h2;
                if (fdiVar != null) {
                    return new ry3(i1w0VarF, fdiVar);
                }
                Intrinsics.h("consultantBottomFileDialogViewModelFactory");
                throw null;
            case 1:
                kud kudVar2 = i5e.q2;
                i5eVar.W0().y(p5e.f26400a);
                return Unit.f46060a;
            case 2:
                kud kudVar3 = i5e.q2;
                return new h5e(i5eVar);
            default:
                kud kudVar4 = i5e.q2;
                i5eVar.W0().y(j5e.f15929a);
                return Unit.f46060a;
        }
    }
}
