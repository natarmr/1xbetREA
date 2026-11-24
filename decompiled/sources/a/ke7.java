package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import android.widget.Button;
import kotlin.Metadata;
import org.xbet.client1.R;
import org.xplatform.responsible_game.impl.domain.models.LimitTypeEnum;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/ke7;", "La/yx5;", "<init>", "()V", "a/yk5", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ke7 extends yx5 {
    public z9i K1;
    public ii L1;
    public wdk0 M1;
    public final kiu0 N1;
    public final s0r O1;
    public final n0o0 P1;
    public final khf0 Q1;
    public static final /* synthetic */ iiy[] S1 = {new j0d0(ke7.class, "binding", "getBinding()Lorg/xplatform/responsible_game_impl/databinding/FragmentBetLimitBinding;", 0), new ez40(ke7.class, "limitType", "getLimitType()Lorg/xplatform/responsible_game/impl/domain/models/LimitTypeEnum;", 0)};
    public static final yk5 R1 = new yk5();

    public ke7() {
        super(R.layout.fragment_bet_limit);
        ie7 ie7Var = new ie7(this, (byte) 0);
        a8z a8zVarA = maz.a(wez.b, new p46(new p46(this, (byte) 16), (byte) 17));
        this.N1 = agc.G(this, sre0.f32672a.b(uf7.class), new rt6(a8zVarA, (byte) 4), new rt6(a8zVarA, (byte) 5), ie7Var);
        this.O1 = ltt0.o(this, je7.f16359a);
        this.P1 = maz.b(new ie7(this, (byte) 1));
        this.Q1 = new khf0("LIMIT_TYPE");
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        dyb.c0(G0().b, new os5(this, (byte) 22));
        G0().e.setNavigationOnClickListener(new q10(this, (byte) 5));
        G0().d.setAdapter((isz) this.P1.getValue());
        ccq0.V(this, "SET_LIMIT_REQUEST_KEY", new ie7(this, (byte) 2));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(le7.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            le7 le7Var = (le7) (ze3Var instanceof le7 ? ze3Var : null);
            if (le7Var != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                LimitTypeEnum limitTypeEnum = (LimitTypeEnum) this.Q1.n(this, S1[1]);
                i1w0VarF.getClass();
                xio xioVar = le7Var.f19886a;
                czz czzVar = le7Var.b;
                dzz dzzVar = le7Var.c;
                btt0 btt0Var = le7Var.d;
                wsf0 wsf0Var = le7Var.g;
                gii0 gii0Var = le7Var.e;
                ii iiVar = le7Var.h;
                duj dujVar = le7Var.f;
                knf0 knf0Var = le7Var.i;
                wdk0 wdk0Var = le7Var.j;
                iiVar.getClass();
                xioVar.getClass();
                czzVar.getClass();
                dzzVar.getClass();
                btt0Var.getClass();
                gii0Var.getClass();
                knf0Var.getClass();
                wdk0Var.getClass();
                this.K1 = (z9i) ((n5d0) new o3c(wsf0Var, iiVar, i1w0VarF, limitTypeEnum, xioVar, czzVar, dzzVar, btt0Var, gii0Var, dujVar, knf0Var, wdk0Var).k).get();
                this.L1 = iiVar;
                this.M1 = wdk0Var;
                return;
            }
        }
        jf4.n(b1j.i(le7.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        p7m0 p7m0Var = H0().j;
        vp3 vp3Var = new vp3(2, this, ke7.class, "showProgress", "showProgress(Z)V", 4, (byte) 27);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new u47(p7m0Var, clzVarW, vp3Var, (yje) null), 3);
        ol60 ol60Var = H0().m;
        yp6 yp6Var = new yp6(this, null, (byte) 7);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new u47(ol60Var, clzVarW2, yp6Var, (yje) null), 3);
        p7m0 p7m0Var2 = H0().k;
        vp3 vp3Var2 = new vp3(2, (isz) this.P1.getValue(), isz.class, "setItems", "setItems(Ljava/util/List;)V", 4, (byte) 28);
        clz clzVarW3 = aac.W(this);
        qjj.W(x0x.Q(clzVarW3.x()), null, null, new u47(p7m0Var2, clzVarW3, vp3Var2, (yje) null, (byte) 0), 3);
        p7m0 p7m0Var3 = H0().l;
        vp3 vp3Var3 = new vp3(2, G0().b, Button.class, "setEnabled", "setEnabled(Z)V", 4, (byte) 29);
        clz clzVarW4 = aac.W(this);
        qjj.W(x0x.Q(clzVarW4.x()), null, null, new u47((gmq) p7m0Var3, clzVarW4, vp3Var3, (yje) null, (char) 0), 3);
    }

    public final lyq G0() {
        Object objN = this.O1.n(S1[0], this);
        objN.getClass();
        return (lyq) objN;
    }

    public final uf7 H0() {
        return (uf7) this.N1.getValue();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void Z() {
        G0().d.setAdapter(null);
        super.Z();
    }
}
