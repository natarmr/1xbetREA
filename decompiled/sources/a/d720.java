package a;

import org.xplatform.feature.fin_bet.impl.domain.model.FinBetInfoModel;

/* JADX INFO: loaded from: classes4.dex */
public final class d720 {
    public static final String e = z620.class.getSimpleName();
    public static final String f = z620.class.getSimpleName();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lbu f5575a;
    public final ua20 b;
    public final boolean c;
    public final String d;

    public d720(lbu lbuVar, lk5 lk5Var) {
        this.f5575a = lbuVar;
        ua20 ua20VarC = lk5Var.c(j820.d);
        this.b = ua20VarC;
        boolean z = ua20VarC != ua20.MEDIUM_NO_GAME_INFO;
        this.c = z;
        this.d = z ? f : e;
    }

    public final void a(androidx.fragment.app.e eVar, FinBetInfoModel finBetInfoModel) {
        eVar.getClass();
        String str = this.d;
        if (eVar.J(str) != null || this.f5575a.j()) {
            return;
        }
        if (!this.c) {
            c720.p2.getClass();
            c720 c720Var = new c720();
            iiy[] iiyVarArr = c720.q2;
            c720Var.j2.J(c720Var, iiyVarArr[1], finBetInfoModel);
            c720Var.k2.u(c720Var, iiyVarArr[2], "REQUEST_FINISH_MAKE_BET_DIALOG_KEY");
            sj3.E0(c720Var, eVar, str);
            return;
        }
        z620.u2.getClass();
        z620 z620Var = new z620();
        iiy[] iiyVarArr2 = z620.v2;
        z620Var.p2.J(z620Var, iiyVarArr2[0], finBetInfoModel);
        z620Var.q2.u(z620Var, iiyVarArr2[1], "REQUEST_FINISH_MAKE_BET_DIALOG_KEY");
        z620Var.r2.u(z620Var, iiyVarArr2[2], this.b);
        sj3.E0(z620Var, eVar, str);
    }
}
