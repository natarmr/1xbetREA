package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import android.util.TypedValue;
import androidx.compose.ui.platform.ComposeView;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"La/u250;", "La/yx5;", "La/d9o0;", "<init>", "()V", "a/wsz", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class u250 extends yx5 implements d9o0 {
    public final r34 K1;
    public final r34 L1;
    public final s0r M1;
    public fiu0 N1;
    public ii O1;
    public wdk0 P1;
    public ynb Q1;
    public roq0 R1;
    public final boolean S1;
    public final a8z U1;
    public static final /* synthetic */ iiy[] W1 = {new ez40(u250.class, "idToOpen", "getIdToOpen()J", 0), new ez40(u250.class, "partitionId", "getPartitionId()J", 0), new j0d0(u250.class, "viewBinding", "getViewBinding()Lorg/xplatform/aggregator/impl/databinding/MyAggregatorFragmentBinding;", 0)};
    public static final wsz V1 = new wsz();

    public u250() {
        super(R.layout.my_aggregator_fragment);
        this.K1 = new r34("GAME_TO_OPEN_ITEM");
        this.L1 = new r34("PARTITION_ID");
        this.M1 = ltt0.o(this, t250.f33200a);
        this.S1 = true;
        this.U1 = xbc.b0(this, sre0.f32672a.b(p850.class), new s250(this, (byte) 0));
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        ccq0.T(this, "REQUEST_BONUS_BALANCE_WARNING_DIALOG_KEY", new s250(this, (byte) 1));
        n0().r().u0("GAME_CLOSED_KEY", this, new r250(this, (byte) 1));
        G0().x(s050.f31398a);
        Object objN = this.M1.n(W1[2], this);
        objN.getClass();
        pkd.h(((v250) objN).b, new owp0(this), null, new ugd(-1050436738, true, new pi40(this, (byte) 9)));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(p250.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            p250 p250Var = (p250) (ze3Var instanceof p250 ? ze3Var : null);
            if (p250Var != null) {
                iiy[] iiyVarArr = W1;
                mdi mdiVarA = p250Var.a(new q250(this.K1.n(this, iiyVarArr[0]).longValue(), this.L1.n(this, iiyVarArr[1]).longValue()));
                this.N1 = mdiVarA.t();
                this.O1 = (ii) mdiVarA.Y;
                this.P1 = (wdk0) mdiVarA.b0;
                ynb ynbVarI = ((yzn0) ((peg0) mdiVarA.a0).b).i();
                x1x.x(ynbVarI);
                this.Q1 = ynbVarI;
                this.R1 = new roq0();
                return;
            }
        }
        jf4.n(b1j.i(p250.class, "Cannot create dependency "));
    }

    public final k3t0 G0() {
        return (k3t0) this.U1.getValue();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void W(Bundle bundle) {
        super.W(bundle);
        n0().r().u0("LOYALTY_PROGRAM_CASHBACK_UPDATED_RESULT_KEY", this, new r250(this, (byte) 0));
    }

    @Override // androidx.fragment.app.Fragment
    public final void d0() {
        this.j1 = true;
        G0().x(t050.f33103a);
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void e0() {
        super.e0();
        G0().x(u050.f34839a);
    }

    @Override // a.d9o0
    public final void m(int i) {
        Object objN = this.M1.n(W1[2], this);
        objN.getClass();
        ComposeView composeView = ((v250) objN).f36668a;
        TypedValue typedValue = j5d.f15927a;
        composeView.setBackgroundColor(j5d.a(o0(), i, false));
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getN1() {
        return this.S1;
    }
}
