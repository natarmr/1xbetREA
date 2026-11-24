package a;

import android.content.ComponentCallbacks2;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"La/rwv;", "La/yx5;", "La/cg60;", "<init>", "()V", "a/sqt", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class rwv extends yx5 implements cg60 {
    public final s0r K1;
    public fiu0 L1;
    public wdk0 M1;
    public final kiu0 N1;
    public final cgx0 O1;
    public static final /* synthetic */ iiy[] Q1 = {new j0d0(rwv.class, "binding", "getBinding()Lorg/xplatform/feature/hidden_betting/impl/databinding/HiddenBettingUpdateFragmentBinding;", 0), new ez40(rwv.class, "showCloseButton", "getShowCloseButton()Z", 0)};
    public static final sqt P1 = new sqt();

    public rwv() {
        super(R.layout.hidden_betting_update_fragment);
        this.K1 = ltt0.o(this, pwv.f27728a);
        bdv bdvVar = new bdv(this, (byte) 11);
        a8z a8zVarA = maz.a(wez.b, new t7t(new t7t(this, (byte) 16), (byte) 17));
        this.N1 = agc.G(this, sre0.f32672a.b(uwv.class), new qwv(a8zVarA, (byte) 0), new qwv(a8zVarA, (byte) 1), bdvVar);
        this.O1 = new cgx0("SHOW_CLOSE_BUTTON_ITEM", true);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        final byte b = 1;
        final byte b2 = 0;
        G0().c.setVisibility(this.O1.n(this, Q1[1]).booleanValue() ? 0 : 8);
        dyb.O(G0().c, new Function1(this) { // from class: a.owv
            public final /* synthetic */ rwv b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b3 = b2;
                rwv rwvVar = this.b;
                View view = (View) obj;
                switch (b3) {
                    case 0:
                        sqt sqtVar = rwv.P1;
                        view.getClass();
                        ((uwv) rwvVar.N1.getValue()).w(rwvVar.O1.n(rwvVar, rwv.Q1[1]).booleanValue());
                        break;
                    default:
                        sqt sqtVar2 = rwv.P1;
                        view.getClass();
                        uwv uwvVar = (uwv) rwvVar.N1.getValue();
                        sac.V(jiu0.a(uwvVar), new umu((byte) 24), null, null, new e3p(uwvVar, null, (byte) 6), 14);
                        break;
                }
                return Unit.f46060a;
            }
        });
        dyb.O(G0().b, new Function1(this) { // from class: a.owv
            public final /* synthetic */ rwv b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b3 = b;
                rwv rwvVar = this.b;
                View view = (View) obj;
                switch (b3) {
                    case 0:
                        sqt sqtVar = rwv.P1;
                        view.getClass();
                        ((uwv) rwvVar.N1.getValue()).w(rwvVar.O1.n(rwvVar, rwv.Q1[1]).booleanValue());
                        break;
                    default:
                        sqt sqtVar2 = rwv.P1;
                        view.getClass();
                        uwv uwvVar = (uwv) rwvVar.N1.getValue();
                        sac.V(jiu0.a(uwvVar), new umu((byte) 24), null, null, new e3p(uwvVar, null, (byte) 6), 14);
                        break;
                }
                return Unit.f46060a;
            }
        });
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(mwv.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            mwv mwvVar = (mwv) (ze3Var instanceof mwv ? ze3Var : null);
            if (mwvVar != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                i1w0VarF.getClass();
                q7d0 q7d0Var = mwvVar.f22523a;
                gii0 gii0Var = mwvVar.b;
                knf0 knf0Var = mwvVar.c;
                wdk0 wdk0Var = mwvVar.d;
                q7d0Var.getClass();
                gii0Var.getClass();
                knf0Var.getClass();
                wdk0Var.getClass();
                gr00 gr00Var = new gr00();
                gr00Var.f11760a = knf0Var;
                gr00Var.b = gii0Var;
                gr00Var.c = q7d0Var;
                gr00Var.d = i1w0VarF;
                gr00Var.e = new ugi(gr00Var, (byte) 27);
                this.L1 = new fiu0(Collections.singletonMap(uwv.class, (ugi) gr00Var.e));
                this.M1 = wdk0Var;
                return;
            }
        }
        jf4.n(b1j.i(mwv.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        vae0 vae0VarM = vtb.M(((uwv) this.N1.getValue()).e);
        j0s j0sVar = new j0s(this, null, (byte) 24);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new hgv(vae0VarM, clzVarW, j0sVar, (yje) null), 3);
    }

    public final swv G0() {
        Object objN = this.K1.n(Q1[0], this);
        objN.getClass();
        return (swv) objN;
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void e0() {
        ycm0 ziv0Var;
        bcm0.x(n0().getWindow(), false);
        Window window = n0().getWindow();
        ani0 ani0Var = new ani0((View) G0().f32943a);
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            ziv0Var = new bjv0(window, ani0Var);
        } else if (i >= 30) {
            ziv0Var = new ajv0(window, ani0Var);
        } else {
            ziv0Var = i >= 26 ? new ziv0(window, ani0Var) : new yiv0(window, ani0Var);
        }
        ziv0Var.s(2);
        ziv0Var.s(519);
        ziv0Var.x(2);
        super.e0();
    }

    @Override // androidx.fragment.app.Fragment
    public final void h0() {
        ycm0 ziv0Var;
        bcm0.x(n0().getWindow(), true);
        Window window = n0().getWindow();
        ani0 ani0Var = new ani0((View) G0().f32943a);
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            ziv0Var = new bjv0(window, ani0Var);
        } else if (i >= 30) {
            ziv0Var = new ajv0(window, ani0Var);
        } else {
            ziv0Var = i >= 26 ? new ziv0(window, ani0Var) : new yiv0(window, ani0Var);
        }
        ziv0Var.y(2);
        ziv0Var.y(519);
        this.j1 = true;
    }

    @Override // a.cg60
    public final boolean j() {
        ((uwv) this.N1.getValue()).w(this.O1.n(this, Q1[1]).booleanValue());
        return false;
    }
}
