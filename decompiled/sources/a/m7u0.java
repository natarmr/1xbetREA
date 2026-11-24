package a;

import android.content.ComponentCallbacks2;
import androidx.fragment.app.Fragment;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class m7u0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f21337a;
    public final /* synthetic */ o7u0 b;

    public /* synthetic */ m7u0(o7u0 o7u0Var, byte b) {
        this.f21337a = b;
        this.b = o7u0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f21337a;
        o7u0 o7u0Var = this.b;
        switch (b) {
            case 0:
                iiy[] iiyVarArr = o7u0.N1;
                androidx.fragment.app.e eVarF = o7u0Var.F();
                List listP = eVarF.c.p();
                listP.getClass();
                Fragment fragment = (Fragment) CollectionsKt.f0(listP);
                if (fragment != null) {
                    zb5 zb5Var = new zb5(eVarF);
                    zb5Var.n(fragment);
                    zb5Var.f();
                    eVarF.A(new t1r(eVarF, null, -1, 0), false);
                }
                return Unit.f46060a;
            default:
                iiy[] iiyVarArr2 = o7u0.N1;
                ComponentCallbacks2 application = o7u0Var.n0().getApplication();
                application.getClass();
                af3 af3Var = application instanceof af3 ? (af3) application : null;
                if (af3Var != null) {
                    o5d0 o5d0Var = (o5d0) af3Var.d().get(p7u0.class);
                    ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                    if (!(ze3Var instanceof p7u0)) {
                        ze3Var = null;
                    }
                    p7u0 p7u0Var = (p7u0) ze3Var;
                    if (p7u0Var != null) {
                        ii iiVar = p7u0Var.f26525a;
                        iiVar.getClass();
                        return new uyi(iiVar);
                    }
                }
                jf4.n(b1j.i(p7u0.class, "Cannot create dependency "));
                return null;
        }
    }
}
