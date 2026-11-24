package a;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class s6b0 implements rg90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f31695a;
    public final /* synthetic */ qog0 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ yx5 d;

    public /* synthetic */ s6b0(qog0 qog0Var, yx5 yx5Var, boolean z, byte b) {
        this.f31695a = b;
        this.b = qog0Var;
        this.d = yx5Var;
        this.c = z;
    }

    @Override // a.rg90
    public final void d(ArrayList arrayList) {
        kt2 kt2Var;
        byte b = this.f31695a;
        qog0 qog0Var = this.b;
        boolean z = this.c;
        yx5 yx5Var = this.d;
        switch (b) {
            case 0:
                u6b0 u6b0Var = (u6b0) yx5Var;
                if (n7x.p(arrayList)) {
                    xi70 xi70Var = u6b0.e2;
                    sbb0 sbb0VarJ0 = u6b0Var.J0();
                    sbb0VarJ0.I();
                    sbb0VarJ0.x.a(true);
                    sac.V(jiu0.a(sbb0VarJ0), null, null, sbb0VarJ0.q.f22085a, new mab0(sbb0VarJ0, null, (byte) 6), 11);
                    b1j.v("allow", sbb0VarJ0.T.f11237a, 12659L);
                    i8i.D("action", "allow", sbb0VarJ0.U.f44322a, "notification_permission_click");
                } else {
                    if (n7x.r(arrayList)) {
                        xi70 xi70Var2 = u6b0.e2;
                        sbb0 sbb0VarJ1 = u6b0Var.J0();
                        b1j.v("deny", sbb0VarJ1.T.f11237a, 12659L);
                        kt2Var = sbb0VarJ1.U.f44322a;
                    } else if (n7x.q(arrayList) && z) {
                        xi70 xi70Var3 = u6b0.e2;
                        sbb0 sbb0VarJ2 = u6b0Var.J0();
                        b1j.v("deny", sbb0VarJ2.T.f11237a, 12659L);
                        kt2Var = sbb0VarJ2.U.f44322a;
                    }
                    i8i.D("action", "deny", kt2Var, "notification_permission_click");
                }
                qog0Var.f29072a.remove(this);
                break;
            default:
                ccb0 ccb0Var = (ccb0) yx5Var;
                if (n7x.p(arrayList)) {
                    mi70 mi70Var = ccb0.X1;
                    ccb0Var.I0().x(aya0.f1662a);
                } else {
                    boolean zR = n7x.r(arrayList);
                    zxa0 zxa0Var = zxa0.f45150a;
                    if (zR) {
                        mi70 mi70Var2 = ccb0.X1;
                        ccb0Var.I0().x(zxa0Var);
                    } else if (n7x.q(arrayList) && z) {
                        mi70 mi70Var3 = ccb0.X1;
                        ccb0Var.I0().x(zxa0Var);
                    }
                }
                qog0Var.f29072a.remove(this);
                break;
        }
    }
}
