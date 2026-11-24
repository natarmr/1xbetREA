package a;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/v0j;", "La/iw5;", "<init>", "()V", "a/nwd", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class v0j extends iw5 {
    public fiu0 n2;
    public static final /* synthetic */ iiy[] q2 = {new ez40(v0j.class, "taskKindId", "getTaskKindId()I", 0), new ez40(v0j.class, "progress", "getProgress()I", 0), new ez40(v0j.class, "productId", "getProductId()J", 0)};
    public static final nwd p2 = new nwd();
    public final zz2 k2 = new zz2("BUNDLE_TASK_KIND_ID", -1);
    public final zz2 l2 = new zz2("BUNDLE_PROGRESS_KEY", 0);
    public final r34 m2 = new r34("BUNDLE_PRODUCT_ID", 0);
    public final a8z o2 = xbc.b0(this, sre0.f32672a.b(c1j.class), new u0j(this, (byte) 0));

    @Override // a.iw5
    public final bw5 J0(fet fetVar) {
        v0j v0jVar;
        fetVar.e0(-517546843);
        k3t0 k3t0VarP0 = P0();
        boolean zI = fetVar.i(this);
        Object objP = fetVar.P();
        Object obj = ukd.f35823a;
        if (zI || objP == obj) {
            v0jVar = this;
            Object y6hVar = new y6h(1, v0jVar, v0j.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/aggregator/daily_tasks/impl/presentation/moreinfo/models/DailyTaskMoreInfoSideEffect;)V", 0, (byte) 5);
            fetVar.o0(y6hVar);
            objP = y6hVar;
        } else {
            v0jVar = this;
        }
        lkz lkzVar = lkz.f20223a;
        pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) ((jhy) objP), fetVar);
        byte b = 3;
        boolean zI2 = fetVar.i(k3t0VarP0) | fetVar.i(v0jVar) | fetVar.e(3) | fetVar.g(pz40VarF);
        Object objP2 = fetVar.P();
        if (zI2 || objP2 == obj) {
            objP2 = new g6g(k3t0VarP0, v0jVar, pz40VarF, (yje) null);
            fetVar.o0(objP2);
        }
        m0x0.t(fetVar, v0jVar, (Function2) objP2);
        bw5 bw5Var = new bw5(iw5.O0(1, fetVar), (xdr) null, (ugd) null, u1c.M(2042652948, new rgh((a1j) ((i3t0) v0jVar.P0()).y(fetVar).getValue(), v0jVar, b), fetVar), 14);
        fetVar.r(false);
        return bw5Var;
    }

    public final k3t0 P0() {
        return (k3t0) this.o2.getValue();
    }

    @Override // a.sik, androidx.fragment.app.Fragment
    public final void V(Context context) {
        super.V(context);
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(h4j.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            h4j h4jVar = (h4j) (ze3Var instanceof h4j ? ze3Var : null);
            if (h4jVar != null) {
                this.n2 = h4jVar.a(a4n0.f(this)).e();
                return;
            }
        }
        jf4.n(b1j.i(h4j.class, "Cannot create dependency "));
    }

    @Override // a.iw5, androidx.fragment.app.Fragment
    public final void i0(View view, Bundle bundle) {
        view.getClass();
        super.i0(view, bundle);
        k3t0 k3t0VarP0 = P0();
        iiy[] iiyVarArr = q2;
        long jLongValue = this.m2.n(this, iiyVarArr[2]).longValue();
        k3t0VarP0.x(new q0j(this.k2.n(this, iiyVarArr[0]).intValue(), this.l2.n(this, iiyVarArr[1]).intValue(), jLongValue));
        L0().N(3);
        L0().K = true;
    }
}
