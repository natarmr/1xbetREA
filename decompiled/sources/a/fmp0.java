package a;

import java.util.Collection;
import org.xplatform.statistic.team.impl.team_statistic.domain.models.TypeParam;

/* JADX INFO: loaded from: classes6.dex */
public final class fmp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g090 f9796a;
    public final mne b;
    public final knf0 c;

    public fmp0(mne mneVar, g090 g090Var, knf0 knf0Var) {
        knf0Var.getClass();
        this.f9796a = g090Var;
        this.b = mneVar;
        this.c = knf0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, zje zjeVar) {
        emp0 emp0Var;
        if (zjeVar instanceof emp0) {
            emp0Var = (emp0) zjeVar;
            int i = emp0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                emp0Var.k = i - Integer.MIN_VALUE;
            } else {
                emp0Var = new emp0(this, zjeVar);
            }
        } else {
            emp0Var = new emp0(this, zjeVar);
        }
        Object objD0 = emp0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = emp0Var.k;
        if (i2 == 0) {
            z1x.P(objD0);
            TypeParam.Team team = new TypeParam.Team(str);
            emp0Var.k = 1;
            objD0 = qjj.d0(this.b.b, new dmp0(team, this, null), emp0Var);
            if (objD0 == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objD0);
        }
        return Boolean.valueOf(!((Collection) objD0).isEmpty());
    }
}
