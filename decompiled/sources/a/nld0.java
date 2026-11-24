package a;

import android.appwidget.AppWidgetManager;
import android.content.ComponentCallbacks2;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Metadata;
import org.xbet.client1.R;
import org.xplatform.widget.impl.presentation.quickavailable.widget.MySectionsWidget;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/nld0;", "La/yx5;", "<init>", "()V", "a/mi70", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class nld0 extends yx5 {
    public final hnm0 K1;
    public uqi L1;
    public wdk0 M1;
    public final kiu0 N1;
    public final s0r O1;
    public final n0o0 P1;
    public List Q1;
    public vyx R1;
    public static final /* synthetic */ iiy[] U1 = {new j0d0(nld0.class, "binding", "getBinding()Lorg/xplatform/widget/impl/databinding/FragmentQuickAvailableBinding;", 0)};
    public static final mi70 S1 = new mi70();

    public nld0() {
        super(R.layout.fragment_quick_available);
        this.K1 = hnm0.f13359a;
        kld0 kld0Var = new kld0(this, (byte) 0);
        a8z a8zVarA = maz.a(wez.b, new f1d0(new f1d0(this, (byte) 19), (byte) 20));
        this.N1 = agc.G(this, sre0.f32672a.b(sld0.class), new ync0(a8zVarA, (byte) 22), new ync0(a8zVarA, (byte) 23), kld0Var);
        this.O1 = ltt0.o(this, lld0.f20242a);
        this.P1 = maz.b(new kld0(this, (byte) 1));
        this.Q1 = iun.f15405a;
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) throws Exception {
        q3r q3rVarG0 = G0();
        mc50.a(q3rVarG0.b, new kld0(this, (byte) 3));
        RecyclerView recyclerView = q3rVarG0.c;
        n0o0 n0o0Var = this.P1;
        recyclerView.setAdapter((jev0) n0o0Var.getValue());
        if (this.R1 == null) {
            vyx vyxVar = new vyx(new w9m0((jev0) n0o0Var.getValue()));
            this.R1 = vyxVar;
            vyxVar.i(recyclerView);
        }
        p7m0 p7m0Var = H0().j;
        jjc0 jjc0Var = new jjc0(2, this, nld0.class, "onDataUiState", "onDataUiState(Lorg/xplatform/widget/impl/presentation/quickavailable/config/QuickAvailableWidgetConfigureViewModel$QuickAvailableUiState;)V", 4, (byte) 10);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new fxc0(p7m0Var, clzVarW, jjc0Var, (yje) null, (byte) 0), 3);
        ol60 ol60Var = H0().k;
        d7a0 d7a0Var = new d7a0(this, null, (byte) 16);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new fxc0(ol60Var, clzVarW2, d7a0Var, (yje) null), 3);
        qcc.X(this, new kld0(this, (byte) 2));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(jld0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            jld0 jld0Var = (jld0) (ze3Var instanceof jld0 ? ze3Var : null);
            if (jld0Var != null) {
                g45 g45VarA = jld0Var.a();
                this.L1 = (uqi) ((n5d0) g45VarA.i).get();
                this.M1 = (wdk0) g45VarA.h;
                return;
            }
        }
        jf4.n(b1j.i(jld0.class, "Cannot create dependency "));
    }

    public final q3r G0() {
        Object objN = this.O1.n(U1[0], this);
        objN.getClass();
        return (q3r) objN;
    }

    public final sld0 H0() {
        return (sld0) this.N1.getValue();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void Z() {
        super.Z();
        vyx vyxVar = this.R1;
        if (vyxVar != null) {
            vyxVar.i(null);
        }
        this.R1 = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void d0() {
        kxq kxqVarB = B();
        if (kxqVarB != null) {
            Intent intentPutExtra = new Intent(kxqVarB, (Class<?>) MySectionsWidget.class).setAction("android.appwidget.action.APPWIDGET_UPDATE").putExtra("appWidgetIds", AppWidgetManager.getInstance(kxqVarB).getAppWidgetIds(new ComponentName(kxqVarB.getApplication(), (Class<?>) MySectionsWidget.class)));
            intentPutExtra.getClass();
            kxqVarB.sendBroadcast(intentPutExtra);
        }
        this.j1 = true;
    }

    @Override // a.yx5
    public final jnm0 y0() {
        return this.K1;
    }
}
