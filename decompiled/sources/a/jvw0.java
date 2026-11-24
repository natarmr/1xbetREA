package a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes2.dex */
public final class jvw0 extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m6x0 f17223a;
    public boolean b;
    public boolean c;

    public jvw0(m6x0 m6x0Var) {
        this.f17223a = m6x0Var;
    }

    public final void a() {
        m6x0 m6x0Var = this.f17223a;
        m6x0Var.l0();
        m6x0Var.J().m1();
        m6x0Var.J().m1();
        if (this.b) {
            m6x0Var.r().o.a("Unregistering connectivity change receiver");
            this.b = false;
            this.c = false;
            try {
                m6x0Var.l.f19080a.unregisterReceiver(this);
            } catch (IllegalArgumentException e) {
                m6x0Var.r().g.b(e, "Failed to unregister the network broadcast receiver");
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        m6x0 m6x0Var = this.f17223a;
        m6x0Var.l0();
        String action = intent.getAction();
        m6x0Var.r().o.b(action, "NetworkBroadcastReceiver received action");
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            m6x0Var.r().j.b(action, "NetworkBroadcastReceiver received unknown action");
            return;
        }
        fvw0 fvw0Var = m6x0Var.b;
        m6x0.T(fvw0Var);
        boolean zQ1 = fvw0Var.q1();
        if (this.c != zQ1) {
            this.c = zQ1;
            m6x0Var.J().v1(new fju0(this, zQ1));
        }
    }
}
