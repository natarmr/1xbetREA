package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import java.util.Collections;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/xgp0;", "La/yx5;", "<init>", "()V", "a/m6m0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class xgp0 extends yx5 {
    public final s0r K1;
    public fiu0 L1;
    public final a8z M1;
    public final phf0 N1;
    public final boolean O1;
    public static final /* synthetic */ iiy[] Q1 = {new j0d0(xgp0.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0), new ez40(xgp0.class, "teamId", "getTeamId()Ljava/lang/String;", 0)};
    public static final m6m0 P1 = new m6m0((byte) 14);

    public xgp0() {
        super(R.layout.compose_fragment);
        this.K1 = ltt0.o(this, wgp0.f39127a);
        this.M1 = xbc.b0(this, sre0.f32672a.b(rhp0.class), new nxo0(this, (byte) 12));
        this.N1 = new phf0("team_id_key");
        this.O1 = true;
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        Object objN = this.K1.n(Q1[0], this);
        objN.getClass();
        b1j.t(((aid) objN).b, new ugd(-100985095, true, new l7p0(this, (byte) 4)));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(vgp0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            vgp0 vgp0Var = (vgp0) (ze3Var instanceof vgp0 ? ze3Var : null);
            if (vgp0Var != null) {
                String strN = this.N1.n(this, Q1[1]);
                i1w0 i1w0VarF = a4n0.f(this);
                strN.getClass();
                i1w0VarF.getClass();
                cad cadVar = vgp0Var.f37393a;
                gii0 gii0Var = vgp0Var.b;
                m1e m1eVar = vgp0Var.c;
                duj dujVar = vgp0Var.d;
                ctf0 ctf0Var = vgp0Var.e;
                knf0 knf0Var = vgp0Var.f;
                ocl oclVar = vgp0Var.g;
                kuy kuyVar = vgp0Var.h;
                gii0Var.getClass();
                m1eVar.getClass();
                ctf0Var.getClass();
                knf0Var.getClass();
                kuyVar.getClass();
                ru ruVar = new ru();
                ruVar.h = m1eVar;
                ruVar.f31100a = cadVar;
                ruVar.c = oclVar;
                ruVar.b = dujVar;
                ruVar.d = gii0Var;
                ruVar.e = knf0Var;
                ruVar.f = kuyVar;
                ruVar.g = strN;
                ruVar.i = i1w0VarF;
                ruVar.j = new xvi(ruVar, (byte) 7);
                this.L1 = new fiu0(Collections.singletonMap(rhp0.class, (xvi) ruVar.j));
                return;
            }
        }
        jf4.n(b1j.i(vgp0.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getL1() {
        return this.O1;
    }
}
