package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import java.util.Collections;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/nme0;", "La/yx5;", "<init>", "()V", "a/lme0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class nme0 extends yx5 {
    public final phf0 K1;
    public final r34 L1;
    public final s0r M1;
    public final boolean N1;
    public fiu0 O1;
    public final a8z P1;
    public static final /* synthetic */ iiy[] R1 = {new ez40(nme0.class, "gameId", "getGameId()Ljava/lang/String;", 0), new ez40(nme0.class, "sportId", "getSportId()J", 0), new j0d0(nme0.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0)};
    public static final lme0 Q1 = new lme0((byte) 0);

    public nme0() {
        super(R.layout.compose_fragment);
        this.K1 = new phf0("game_id");
        this.L1 = new r34("sport_id");
        this.M1 = ltt0.o(this, mme0.f22034a);
        this.N1 = true;
        this.P1 = xbc.b0(this, sre0.f32672a.b(ume0.class), new tie0(this, (byte) 4));
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        Object objN = this.M1.n(R1[2], this);
        objN.getClass();
        pkd.h(((aid) objN).f919a, new owp0(this), null, new ugd(-1737277394, true, new dke0(this, (byte) 4)));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(kme0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            kme0 kme0Var = (kme0) (ze3Var instanceof kme0 ? ze3Var : null);
            if (kme0Var != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                iiy[] iiyVarArr = R1;
                String strN = this.K1.n(this, iiyVarArr[0]);
                Long lN = this.L1.n(this, iiyVarArr[1]);
                i1w0VarF.getClass();
                strN.getClass();
                cad cadVar = kme0Var.f18535a;
                duj dujVar = kme0Var.b;
                pmi0 pmi0Var = kme0Var.c;
                ctf0 ctf0Var = kme0Var.d;
                ocl oclVar = kme0Var.e;
                r9u r9uVar = kme0Var.f;
                ctf0Var.getClass();
                r9uVar.getClass();
                g45 g45Var = new g45();
                g45Var.b = ctf0Var;
                g45Var.c = pmi0Var;
                g45Var.g = strN;
                g45Var.f10647a = lN;
                g45Var.d = i1w0VarF;
                g45Var.e = dujVar;
                g45Var.f = oclVar;
                g45Var.h = cadVar;
                g45Var.i = new ppi(g45Var, (byte) 24);
                this.O1 = new fiu0(Collections.singletonMap(ume0.class, (ppi) g45Var.i));
                return;
            }
        }
        jf4.n(b1j.i(kme0.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getN1() {
        return this.N1;
    }
}
