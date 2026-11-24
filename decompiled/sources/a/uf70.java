package a;

import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public abstract class uf70 extends w46 {
    public final xcc b;
    public final p7m0 c;

    public uf70(qa60 qa60Var, xcc xccVar) {
        qa60Var.getClass();
        xccVar.getClass();
        this.b = xccVar;
        this.c = q7m0.a(new tf70(false, R.string.bet));
        slb.U(new dnq(new fnq(qa60Var.a(), new vf20(2, this, uf70.class, "observeCommand", "observeCommand(Lorg/xplatform/core/domain/GameCommand;)V", 4, (byte) 25), (byte) 4), new ib60(this, null, (byte) 1), (byte) 1), jiu0.a(this));
    }

    public void w(zy5 zy5Var) {
        zy5Var.getClass();
        boolean z = zy5Var instanceof hy5;
        p7m0 p7m0Var = this.c;
        if (z) {
            y(tf70.a((tf70) p7m0Var.getValue(), ((hy5) zy5Var).f13844a, 2));
            return;
        }
        if ((zy5Var instanceof zle) || (zy5Var instanceof yle) || (zy5Var instanceof tle) || (zy5Var instanceof xle) || (zy5Var instanceof ry5)) {
            y(tf70.a((tf70) p7m0Var.getValue(), false, 2));
        }
    }

    public abstract void x();

    public final void y(tf70 tf70Var) {
        qjj.W(jiu0.a(this), null, null, new ku60(this, tf70Var, null, (byte) 14), 3);
    }
}
