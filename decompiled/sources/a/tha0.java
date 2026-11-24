package a;

import android.content.ComponentCallbacks2;
import android.content.Context;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"La/tha0;", "La/iw5;", "<init>", "()V", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class tha0 extends iw5 {
    public static final /* synthetic */ int m2 = 0;
    public fiu0 k2;
    public final kiu0 l2;

    public tha0() {
        l3a0 l3a0Var = new l3a0(this, (byte) 15);
        a8z a8zVarA = maz.a(wez.b, new wz80(new wz80(this, (byte) 15), (byte) 16));
        this.l2 = agc.G(this, sre0.f32672a.b(yha0.class), new a190(a8zVarA, (byte) 14), new a190(a8zVarA, (byte) 15), l3a0Var);
    }

    @Override // a.iw5
    public final bw5 J0(fet fetVar) {
        fetVar.e0(-686068611);
        yha0 yha0Var = (yha0) this.l2.getValue();
        int i = yha0.p;
        bw5 bw5Var = new bw5(iw5.O0(1, fetVar), oja0.c, (ugd) null, u1c.M(1831137196, new tft(yha0Var.y(fetVar), (byte) 9), fetVar), 10);
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
            o5d0 o5d0Var = (o5d0) af3Var.d().get(wka0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            wka0 wka0Var = (wka0) (ze3Var instanceof wka0 ? ze3Var : null);
            if (wka0Var != null) {
                this.k2 = wka0Var.a(a4n0.f(this), "", 0L).i();
                return;
            }
        }
        jf4.n(b1j.i(wka0.class, "Cannot create dependency "));
    }
}
