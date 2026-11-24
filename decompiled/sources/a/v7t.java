package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class v7t implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f36946a;
    public final /* synthetic */ b8t b;

    public /* synthetic */ v7t(b8t b8tVar, byte b) {
        this.f36946a = b;
        this.b = b8tVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f36946a;
        b8t b8tVar = this.b;
        switch (b) {
            case 0:
                iiy[] iiyVarArr = b8t.Q1;
                fiu0 fiu0Var = b8tVar.M1;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 1:
                iiy[] iiyVarArr2 = b8t.Q1;
                return new z7t(b8tVar);
            default:
                iiy[] iiyVarArr3 = b8t.Q1;
                p7m0 p7m0Var = b8tVar.I0().t;
                p7m0Var.getClass();
                p7m0Var.o(null, h8t.f12644a);
                return Unit.f46060a;
        }
    }
}
