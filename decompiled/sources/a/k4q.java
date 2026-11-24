package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class k4q implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f17681a;
    public final /* synthetic */ n4q b;

    public /* synthetic */ k4q(n4q n4qVar, byte b) {
        this.f17681a = b;
        this.b = n4qVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f17681a;
        n4q n4qVar = this.b;
        switch (b) {
            case 0:
                bek bekVar = n4q.R1;
                fiu0 fiu0Var = n4qVar.N1;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            default:
                bek bekVar2 = n4q.R1;
                n4qVar.G0().x(e4q.f7195a);
                return Unit.f46060a;
        }
    }
}
