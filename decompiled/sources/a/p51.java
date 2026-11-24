package a;

import android.content.ComponentCallbacks2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.aggregator.impl.core.navigation.AggregatorScreenModel;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class p51 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f26382a;
    public final /* synthetic */ v51 b;

    public /* synthetic */ p51(v51 v51Var, byte b) {
        this.f26382a = b;
        this.b = v51Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f26382a;
        v51 v51Var = this.b;
        switch (b) {
            case 0:
                qek0 qek0Var = v51.a2;
                v51Var.H0().n.a(false);
                return Unit.f46060a;
            case 1:
                qek0 qek0Var2 = v51.a2;
                v51 v51Var2 = this.b;
                kxq kxqVarN0 = v51Var2.n0();
                androidx.fragment.app.e eVarC = v51Var2.C();
                eVarC.getClass();
                return new ua0(kxqVarN0, eVarC, a4n0.e(v51Var2), new f8(0, v51Var2, v51.class, "isCurrentFragmentTabRoot", "isCurrentFragmentTabRoot()Z", 0, (byte) 7));
            case 2:
                qek0 qek0Var3 = v51.a2;
                ComponentCallbacks2 application = v51Var.n0().getApplication();
                application.getClass();
                af3 af3Var = application instanceof af3 ? (af3) application : null;
                if (af3Var != null) {
                    o5d0 o5d0Var = (o5d0) af3Var.d().get(is0.class);
                    ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                    if (!(ze3Var instanceof is0)) {
                        ze3Var = null;
                    }
                    is0 is0Var = (is0) ze3Var;
                    if (is0Var != null) {
                        yzn0 yzn0Var = v51Var.R1;
                        iiy[] iiyVarArr = v51.b2;
                        return is0.a(is0Var, (lr1) yzn0Var.n(v51Var, iiyVarArr[0]), (AggregatorScreenModel) v51Var.S1.n(v51Var, iiyVarArr[1]), null, v51.class.getSimpleName(), true, null, 36);
                    }
                }
                jf4.n(b1j.i(is0.class, "Cannot create dependency "));
                return null;
            case 3:
                fiu0 fiu0Var = v51Var.M1;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            default:
                o7i o7iVar = v51Var.L1;
                if (o7iVar != null) {
                    return new q0h0(o7iVar);
                }
                Intrinsics.h("aggregatorMainViewModelFactory");
                throw null;
        }
    }
}
