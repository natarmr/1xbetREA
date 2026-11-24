package a;

import org.xplatform.swipex.impl.presentation.dialogs.confirmation.models.SwipeActionConfirmationParams;

/* JADX INFO: loaded from: classes6.dex */
public final class qon0 extends i3t0 {
    public static final /* synthetic */ int s = 0;
    public final bsc o;
    public final mne p;
    public final s31 q;
    public final e41 r;

    public qon0(vzg0 vzg0Var, ctf0 ctf0Var, bsc bscVar, mne mneVar, s31 s31Var, e41 e41Var, SwipeActionConfirmationParams swipeActionConfirmationParams) {
        ctf0Var.getClass();
        jfm0 jfm0Var = new jfm0(swipeActionConfirmationParams, (byte) 16);
        h0j0 h0j0Var = new h0j0(ctf0Var, (byte) 9);
        rwj rwjVar = mneVar.f22085a;
        super(null, jfm0Var, h0j0Var, cvm0.p(rwjVar, rwjVar), null);
        this.o = bscVar;
        this.p = mneVar;
        this.q = s31Var;
        this.r = e41Var;
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        kon0 kon0Var = (kon0) obj;
        kon0Var.getClass();
        super.x(kon0Var);
        boolean z = kon0Var instanceof jon0;
        e41 e41Var = this.r;
        s31 s31Var = this.q;
        if (!z) {
            if (kon0Var.equals(eon0.f8146a)) {
                E();
                return;
            } else if (!kon0Var.equals(fon0.f9891a)) {
                t9f.b();
                return;
            } else {
                s31Var.H(hsn0.CANCEL);
                e41Var.e(qun0.CANCEL);
                return;
            }
        }
        jon0 jon0Var = (jon0) kon0Var;
        if (jon0Var.equals(hon0.f13402a)) {
            sac.V(jiu0.a(this), pon0.f27338a, null, this.p.f22085a, new z2n0(this, null, (byte) 2), 10);
        } else if (jon0Var.equals(gon0.f11639a)) {
            s31Var.H(hsn0.CANCEL);
            e41Var.e(qun0.CANCEL);
            G(new mon0(false));
        } else {
            if (!(jon0Var instanceof ion0)) {
                t9f.b();
                return;
            }
            s31Var.H(hsn0.DONT_ASK_AGAIN);
            e41Var.e(qun0.DONT_ASK_AGAIN);
            H(new acm0((byte) 12));
        }
    }
}
