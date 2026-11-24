package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import android.view.View;
import java.util.Collections;
import kotlin.Metadata;
import org.xbet.client1.R;
import org.xplatform.onexdatabase.OnexDatabase;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/ovl0;", "La/yx5;", "<init>", "()V", "a/gne0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ovl0 extends yx5 {
    public final s0r K1;
    public final phf0 L1;
    public final r34 M1;
    public final zz2 N1;
    public fiu0 O1;
    public final a8z P1;
    public final boolean Q1;
    public static final /* synthetic */ iiy[] S1 = {new j0d0(ovl0.class, "viewBinding", "getViewBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0), new ez40(ovl0.class, "stadiumId", "getStadiumId()Ljava/lang/String;", 0), new ez40(ovl0.class, "sportId", "getSportId()J", 0), new ez40(ovl0.class, "titleResId", "getTitleResId()I", 0)};
    public static final gne0 R1 = new gne0((byte) 28);

    public ovl0() {
        super(R.layout.compose_fragment);
        this.K1 = ltt0.o(this, nvl0.f24193a);
        this.L1 = new phf0("STADIUM_ID");
        this.M1 = new r34("SPORT_ID");
        this.N1 = new zz2("TITLE_ID");
        this.P1 = xbc.b0(this, sre0.f32672a.b(zxl0.class), new goi0(this, (byte) 19));
        this.Q1 = true;
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(pvl0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            pvl0 pvl0Var = (pvl0) (ze3Var instanceof pvl0 ? ze3Var : null);
            if (pvl0Var != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                iiy[] iiyVarArr = S1;
                String strN = this.L1.n(this, iiyVarArr[1]);
                long jLongValue = this.M1.n(this, iiyVarArr[2]).longValue();
                int iIntValue = this.N1.n(this, iiyVarArr[3]).intValue();
                i1w0VarF.getClass();
                strN.getClass();
                cad cadVar = pvl0Var.f27668a;
                gii0 gii0Var = pvl0Var.b;
                m1e m1eVar = pvl0Var.c;
                wsz wszVar = pvl0Var.e;
                OnexDatabase onexDatabase = pvl0Var.d;
                xwl0 xwl0Var = new xwl0(strN, jLongValue, iIntValue);
                ctf0 ctf0Var = pvl0Var.f;
                pru pruVar = pvl0Var.g;
                knf0 knf0Var = pvl0Var.h;
                ocl oclVar = pvl0Var.i;
                j1q0 j1q0Var = pvl0Var.j;
                gii0Var.getClass();
                m1eVar.getClass();
                onexDatabase.getClass();
                ctf0Var.getClass();
                knf0Var.getClass();
                j1q0Var.getClass();
                this.O1 = new fiu0(Collections.singletonMap(zxl0.class, (rti) new o3c(cadVar, gii0Var, m1eVar, wszVar, i1w0VarF, ctf0Var, xwl0Var, pruVar, knf0Var, oclVar).k));
                return;
            }
        }
        jf4.n(b1j.i(pvl0.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        gmq gmqVarC = ((i3t0) G0()).C();
        lkz lkzVar = lkz.f20223a;
        ssl0 ssl0Var = new ssl0((Object) this, (yje) null, (byte) 1);
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new zol0((i89) gmqVarC, clzVarW, ssl0Var, (yje) null), 3);
    }

    public final k3t0 G0() {
        return (k3t0) this.P1.getValue();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void g0() {
        super.g0();
        G0().x(fvl0.f10222a);
    }

    @Override // androidx.fragment.app.Fragment
    public final void h0() {
        this.j1 = true;
        G0().x(evl0.f8475a);
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void i0(View view, Bundle bundle) {
        view.getClass();
        super.i0(view, bundle);
        Object objN = this.K1.n(S1[0], this);
        objN.getClass();
        h97.t(((aid) objN).f919a, new owp0(this), new ugd(-1570626926, true, new edk0(this, (byte) 18)));
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getL1() {
        return this.Q1;
    }
}
