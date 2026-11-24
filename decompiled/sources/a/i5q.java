package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class i5q implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f14205a;
    public final /* synthetic */ m5q b;

    public /* synthetic */ i5q(m5q m5qVar, byte b) {
        this.f14205a = b;
        this.b = m5qVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f14205a;
        m5q m5qVar = this.b;
        switch (b) {
            case 0:
                nek nekVar = m5q.o2;
                fiu0 fiu0Var = m5qVar.m2;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 1:
                nek nekVar2 = m5q.o2;
                ((k3t0) m5qVar.n2.getValue()).x(e5q.f7245a);
                return Unit.f46060a;
            default:
                nek nekVar3 = m5q.o2;
                m5qVar.P0();
                return Unit.f46060a;
        }
    }
}
