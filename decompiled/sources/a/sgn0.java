package a;

import org.xplatform.betting.core.success_bet_alert.presentation.models.SuccessBetAlertModel;

/* JADX INFO: loaded from: classes3.dex */
public final class sgn0 extends i3t0 {
    public final SuccessBetAlertModel o;
    public final tmt p;
    public final ywu q;
    public final mii0 r;
    public final x20 s;
    public final ctf0 t;
    public final duj u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sgn0(vzg0 vzg0Var, SuccessBetAlertModel successBetAlertModel, tmt tmtVar, ywu ywuVar, mii0 mii0Var, x20 x20Var, ctf0 ctf0Var, duj dujVar, mne mneVar) {
        super(null, new a7n0((byte) 15), new rgn0((byte) 0), cvm0.p(mneVar.f22085a, mneVar.b), null);
        tmtVar.getClass();
        ctf0Var.getClass();
        this.o = successBetAlertModel;
        this.p = tmtVar;
        this.q = ywuVar;
        this.r = mii0Var;
        this.s = x20Var;
        this.t = ctf0Var;
        this.u = dujVar;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0084  */
    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        ufn0 ufn0Var = (ufn0) obj;
        ufn0Var.getClass();
        super.x(ufn0Var);
        boolean zEquals = ufn0Var.equals(sfn0.f32126a);
        int i = 1;
        x20 x20Var = this.s;
        mii0 mii0Var = this.r;
        if (!zEquals) {
            if (ufn0Var.equals(rfn0.f30397a)) {
                i8i.D("option", "continue", (kt2) mii0Var.b, "bet_placed_success_click");
                x20Var.i(zm7.CONTINUE);
                return;
            }
            if (ufn0Var.equals(tfn0.f33875a)) {
                i8i.D("option", "share", (kt2) mii0Var.b, "bet_placed_success_click");
                x20Var.i(zm7.SHARE);
                i3t0.K(this, null, new ndn0(1, this, sgn0.class, "processSaveBetError", "processSaveBetError(Ljava/lang/Throwable;)V", 0, (byte) 8), new hhb0(this, null, (byte) 18), 1);
                return;
            } else if (ufn0Var.equals(pfn0.f26914a)) {
                i8i.D("option", "continue", (kt2) mii0Var.b, "bet_placed_success_click");
                x20Var.i(zm7.CONTINUE);
                return;
            } else if (ufn0Var.equals(qfn0.f28644a)) {
                E();
                return;
            } else {
                t9f.b();
                return;
            }
        }
        i8i.D("option", "history", (kt2) mii0Var.b, "bet_placed_success_click");
        x20Var.i(zm7.HISTORY);
        SuccessBetAlertModel successBetAlertModel = this.o;
        String str = successBetAlertModel.e;
        Long l = successBetAlertModel.d;
        long jLongValue = l != null ? l.longValue() : 0L;
        ywu ywuVar = this.q;
        daf dafVar = (daf) ((onv) ywuVar.c).f25567a;
        dafVar.f().q();
        if (str == null) {
            bj5 bj5Var = s77.b;
            i = 0;
        } else {
            int iHashCode = str.hashCode();
            if (iHashCode != -1119119882) {
                if (iHashCode != 2020783) {
                    if (iHashCode == 2581046 && str.equals("TOTO")) {
                        bj5 bj5Var2 = s77.b;
                    } else {
                        bj5 bj5Var3 = s77.b;
                        i = 0;
                    }
                } else if (str.equals("AUTO")) {
                    bj5 bj5Var4 = s77.b;
                    i = 2;
                } else {
                    bj5 bj5Var5 = s77.b;
                    i = 0;
                }
            } else if (str.equals("JACKPOT")) {
                bj5 bj5Var6 = s77.b;
                i = 6;
            } else {
                bj5 bj5Var7 = s77.b;
                i = 0;
            }
        }
        ((t47) dafVar.Y().f19975a.e).c = i;
        ((t47) dafVar.X().f13444a.e).d = jLongValue;
        xex xexVarG = dafVar.g();
        f8w f8wVar = f8w.f9129a;
        xexVarG.J();
        ((ouu) ywuVar.b).q(new za50(0, 7, 0L, 0L), false);
    }
}
