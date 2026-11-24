package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import kotlin.Metadata;
import org.xplatform.statistic.stage.api.domain.TypeStageId;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/xyl0;", "La/iw5;", "<init>", "()V", "a/gle0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class xyl0 extends iw5 {
    public fiu0 l2;
    public static final /* synthetic */ iiy[] o2 = {new ez40(xyl0.class, "stageId", "getStageId()Lorg/xplatform/statistic/stage/api/domain/TypeStageId;", 0)};
    public static final gle0 n2 = new gle0();
    public final khf0 k2 = new khf0("stage_id_bundle_key");
    public final a8z m2 = xbc.b0(this, sre0.f32672a.b(ezl0.class), new vyl0(this, (byte) 0));

    @Override // a.iw5
    public final bw5 J0(fet fetVar) {
        fetVar.e0(-1908208624);
        bw5 bw5Var = new bw5(iw5.O0(1, fetVar), cjx.n, (ugd) null, u1c.M(1497200833, new nhl0(((i3t0) ((k3t0) this.m2.getValue())).y(fetVar), this, (byte) 8), fetVar), 10);
        fetVar.r(false);
        return bw5Var;
    }

    @Override // a.sik, androidx.fragment.app.Fragment
    public final void W(Bundle bundle) {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(h2m0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            h2m0 h2m0Var = (h2m0) (ze3Var instanceof h2m0 ? ze3Var : null);
            if (h2m0Var != null) {
                this.l2 = h2m0.a(h2m0Var, (TypeStageId) this.k2.n(this, o2[0]), 0L, a4n0.f(this), 0L).i();
                super.W(bundle);
                return;
            }
        }
        jf4.n(b1j.i(h2m0.class, "Cannot create dependency "));
    }
}
