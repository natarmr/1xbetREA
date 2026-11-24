package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import java.util.Collections;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/qcr;", "La/yx5;", "<init>", "()V", "a/bek", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class qcr extends yx5 {
    public final f9o0 K1;
    public final s0r L1;
    public final phf0 M1;
    public final zz2 N1;
    public fiu0 O1;
    public final a8z P1;
    public static final /* synthetic */ iiy[] R1 = {new j0d0(qcr.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0), new ez40(qcr.class, "gameId", "getGameId()Ljava/lang/String;", 0), new ez40(qcr.class, "sportId", "getSportId()I", 0)};
    public static final bek Q1 = new bek();

    public qcr() {
        super(R.layout.compose_fragment);
        this.K1 = new f9o0(R.attr.uikitBackgroundContent);
        this.L1 = ltt0.o(this, pcr.f26773a);
        this.M1 = new phf0("GAME_ID_KEY");
        this.N1 = new zz2("SPORT_ID_KEY");
        this.P1 = xbc.b0(this, sre0.f32672a.b(wcr.class), new yip(this, (byte) 18));
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        Object objN = this.L1.n(R1[0], this);
        objN.getClass();
        h97.t(((aid) objN).f919a, new owp0(this), new ugd(-179647257, true, new jar(this, (byte) 1)));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(rcr.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            rcr rcrVar = (rcr) (ze3Var instanceof rcr ? ze3Var : null);
            if (rcrVar != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                iiy[] iiyVarArr = R1;
                String strN = this.M1.n(this, iiyVarArr[1]);
                Integer numN = this.N1.n(this, iiyVarArr[2]);
                i1w0VarF.getClass();
                strN.getClass();
                cad cadVar = rcrVar.f30254a;
                gii0 gii0Var = rcrVar.b;
                ocl oclVar = rcrVar.c;
                j1q0 j1q0Var = rcrVar.d;
                ctf0 ctf0Var = rcrVar.f;
                m1e m1eVar = rcrVar.e;
                roi0 roi0Var = rcrVar.g;
                j1q0Var.getClass();
                gii0Var.getClass();
                m1eVar.getClass();
                ctf0Var.getClass();
                ru ruVar = new ru();
                ruVar.f31100a = strN;
                ruVar.b = numN;
                ruVar.c = i1w0VarF;
                ruVar.d = j1q0Var;
                ruVar.f = oclVar;
                ruVar.h = m1eVar;
                ruVar.g = cadVar;
                ruVar.i = roi0Var;
                ruVar.e = ctf0Var;
                ruVar.j = new ugi(ruVar, (byte) 10);
                this.O1 = new fiu0(Collections.singletonMap(wcr.class, (ugi) ruVar.j));
                return;
            }
        }
        jf4.n(b1j.i(rcr.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: z0 */
    public final j9o0 getK1() {
        return this.K1;
    }
}
