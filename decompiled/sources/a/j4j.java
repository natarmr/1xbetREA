package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"La/j4j;", "La/yx5;", "La/d1j;", "<init>", "()V", "a/kud", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class j4j extends yx5 implements d1j {
    public final wtq K1;
    public final boolean L1;
    public fiu0 M1;
    public wdk0 N1;
    public ii O1;
    public final a8z P1;
    public final s0r Q1;
    public static final /* synthetic */ iiy[] S1 = {new j0d0(j4j.class, "viewBinding", "getViewBinding()Lorg/xplatform/aggregator/daily_tasks/impl/databinding/DailyTaskFragmentBinding;", 0)};
    public static final kud R1 = new kud();

    public j4j() {
        super(R.layout.daily_task_fragment);
        this.K1 = wtq.b;
        this.L1 = true;
        this.P1 = xbc.b0(this, sre0.f32672a.b(e6j.class), new e8g(this, (byte) 24));
        this.Q1 = ltt0.o(this, i4j.f14148a);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        C().u0("REQUEST_CLOSE_MORE_INFO_DIALOG_KEY", this, new z9f(this, (byte) 7));
        Object objN = this.Q1.n(S1[0], this);
        objN.getClass();
        pkd.h(((n0j) objN).b, new owp0(this), null, new ugd(-936633209, true, new tx(this, (byte) 18)));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(h4j.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            h4j h4jVar = (h4j) (ze3Var instanceof h4j ? ze3Var : null);
            if (h4jVar != null) {
                v9i v9iVarA = h4jVar.a(a4n0.f(this));
                this.M1 = v9iVarA.e();
                this.N1 = (wdk0) v9iVarA.w;
                this.O1 = (ii) v9iVarA.v;
                return;
            }
        }
        jf4.n(b1j.i(h4j.class, "Cannot create dependency "));
    }

    public final k3t0 G0() {
        return (k3t0) this.P1.getValue();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void e0() {
        G0().x(n3j.f22853a);
        super.e0();
    }

    @Override // a.d1j
    /* JADX INFO: renamed from: i, reason: from getter */
    public final wtq getK1() {
        return this.K1;
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getL1() {
        return this.L1;
    }
}
