package a;

import android.content.ComponentCallbacks2;
import android.content.Context;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/uia0;", "La/iw5;", "<init>", "()V", "a/rl70", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class uia0 extends iw5 {
    public fiu0 k2;
    public final kiu0 l2;
    public final phf0 m2;
    public static final /* synthetic */ iiy[] o2 = {new ez40(uia0.class, "teamId", "getTeamId()Ljava/lang/String;", 0)};
    public static final rl70 n2 = new rl70();

    public uia0() {
        l3a0 l3a0Var = new l3a0(this, (byte) 20);
        a8z a8zVarA = maz.a(wez.b, new wz80(new wz80(this, (byte) 19), (byte) 20));
        this.l2 = agc.G(this, sre0.f32672a.b(zia0.class), new a190(a8zVarA, (byte) 18), new a190(a8zVarA, (byte) 19), l3a0Var);
        this.m2 = new phf0("TEAM_ID_KEY");
    }

    @Override // a.iw5
    public final bw5 J0(fet fetVar) {
        fetVar.e0(-891114455);
        zia0 zia0Var = (zia0) this.l2.getValue();
        int i = zia0.r;
        bw5 bw5Var = new bw5(iw5.O0(1, fetVar), ro4.f, (ugd) null, u1c.M(-1902752744, new tft(zia0Var.y(fetVar), (byte) 10), fetVar), 10);
        fetVar.r(false);
        return bw5Var;
    }

    @Override // a.sik, androidx.fragment.app.Fragment
    public final void V(Context context) {
        super.V(context);
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(fma0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            fma0 fma0Var = (fma0) (ze3Var instanceof fma0 ? ze3Var : null);
            if (fma0Var != null) {
                this.k2 = fma0Var.a(0L, a4n0.f(this), "", this.m2.n(this, o2[0])).i();
                return;
            }
        }
        jf4.n(b1j.i(fma0.class, "Cannot create dependency "));
    }
}
