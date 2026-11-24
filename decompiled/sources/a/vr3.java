package a;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.client1.features.appactivity.ApplicationActivity;

/* JADX INFO: loaded from: classes4.dex */
public final class vr3 extends q1r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f37879a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vr3(Object obj, byte b) {
        this.f37879a = b;
        this.b = obj;
    }

    @Override // a.q1r
    public void a(androidx.fragment.app.e eVar, Fragment fragment, Context context) {
        switch (this.f37879a) {
            case 1:
                wws wwsVar = (wws) this.b;
                roq0 roq0Var = wwsVar.M1;
                if (roq0Var == null) {
                    Intrinsics.h("tipsDialogScreenFactory");
                    throw null;
                }
                if (roq0Var.b(fragment)) {
                    wwsVar.H0().z();
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // a.q1r
    public void c(androidx.fragment.app.e eVar, Fragment fragment) {
        Object value;
        switch (this.f37879a) {
            case 1:
                wws wwsVar = (wws) this.b;
                roq0 roq0Var = wwsVar.M1;
                if (roq0Var == null) {
                    Intrinsics.h("tipsDialogScreenFactory");
                    throw null;
                }
                if (roq0Var.b(fragment)) {
                    yys yysVarH0 = wwsVar.H0();
                    p7m0 p7m0Var = yysVarH0.B;
                    do {
                        value = p7m0Var.getValue();
                    } while (!p7m0Var.m(value, ixs.a((ixs) value, 0L, null, false, false, false, false, null, false, false, null, false, null, false, false, 458751)));
                    ixs ixsVar = (ixs) p7m0Var.getValue();
                    if (!ixsVar.o || ixsVar.q) {
                        return;
                    }
                    ((neu0) yysVarH0.l.f20148a).f23405a.a();
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // a.q1r
    public void e(androidx.fragment.app.e eVar, Fragment fragment) {
        Object value;
        byte b = this.f37879a;
        Object obj = this.b;
        switch (b) {
            case 0:
                View viewJ = fragment.J();
                if (viewJ != null) {
                    ApplicationActivity applicationActivity = (ApplicationActivity) obj;
                    if (viewJ.isLaidOut() && !viewJ.isLayoutRequested()) {
                        int i = ApplicationActivity.F1;
                        applicationActivity.I(false);
                    } else {
                        viewJ.addOnLayoutChangeListener(new w23(applicationActivity, (byte) 2));
                    }
                }
                break;
            case 2:
                if (!(fragment instanceof sik)) {
                    iiy[] iiyVarArr = ez60.S1;
                    g670 g670VarH0 = ((ez60) obj).H0();
                    if (g670VarH0.w.length() > 0) {
                        p7m0 p7m0Var = g670VarH0.E;
                        do {
                            value = p7m0Var.getValue();
                        } while (!p7m0Var.m(value, gz60.a((gz60) value, g670VarH0.w, false, false, false, false, false, 510)));
                        g670VarH0.w = "";
                    }
                }
                break;
            case 4:
                j6m0 j6m0Var = b5r0.t2;
                ((b5r0) obj).Q0().x(j4r0.f15899a);
                break;
        }
    }

    @Override // a.q1r
    public void h(androidx.fragment.app.e eVar, Fragment fragment, View view) {
        switch (this.f37879a) {
            case 3:
                bn70 bn70Var = (bn70) this.b;
                view.getClass();
                if (fragment instanceof oe70) {
                    to70 to70VarQ0 = bn70Var.Q0();
                    to70VarQ0.getClass();
                    sac.V(jiu0.a(to70VarQ0), new gk70(1, to70VarQ0, to70.class, "handleGameError", "handleGameError(Ljava/lang/Throwable;)V", 0, (byte) 10), null, to70VarQ0.g.b, new lo70(to70VarQ0, null, (byte) 0), 10);
                    bn70Var.C().B0(this);
                }
                break;
        }
    }

    @Override // a.q1r
    public void i(androidx.fragment.app.e eVar, Fragment fragment) {
        switch (this.f37879a) {
            case 4:
                b5r0 b5r0Var = (b5r0) this.b;
                j6m0 j6m0Var = b5r0.t2;
                b5r0Var.Q0().x(j4r0.f15899a);
                break;
        }
    }
}
