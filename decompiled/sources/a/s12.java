package a;

import java.util.ArrayList;
import org.xplatform.alerts_pipe_api.presentation.AlertsPipeType;

/* JADX INFO: loaded from: classes3.dex */
public final class s12 implements r12 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ii f31434a;
    public final ctf0 b;
    public final ArrayList c;
    public final sje d;
    public bby e;
    public AlertsPipeType f;
    public androidx.fragment.app.e g;

    public s12(lqt0 lqt0Var, ii iiVar, ctf0 ctf0Var) {
        iiVar.getClass();
        ctf0Var.getClass();
        this.f31434a = iiVar;
        this.b = ctf0Var;
        this.c = new ArrayList();
        this.d = d5c.a(kotlin.coroutines.e.c(qem0.e(), tvk.f34603a));
    }

    public final void a(q12 q12Var) {
        this.c.add(q12Var);
        bby bbyVar = this.e;
        if (bbyVar == null || !bbyVar.isActive()) {
            this.e = sac.V(this.d, new dj1((byte) 21), null, null, new pa((Object) this, (yje) null, (byte) 19), 14);
        }
    }

    public final void b() {
        AlertsPipeType alertsPipeType = this.f;
        if (alertsPipeType != null) {
            w3d.y(this.c, new m51(alertsPipeType, (byte) 11));
        }
        this.f = null;
        this.g = null;
    }
}
