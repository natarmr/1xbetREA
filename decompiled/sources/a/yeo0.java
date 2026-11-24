package a;

import kotlin.jvm.functions.Function1;
import org.xplatform.special_event.impl.top_players.presentation.model.TopPlayersSearchModel;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class yeo0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f42497a = 1;
    public final /* synthetic */ bzt b;
    public final /* synthetic */ luu c;
    public final /* synthetic */ int d;
    public final /* synthetic */ r9u e;

    public /* synthetic */ yeo0(bzt bztVar, luu luuVar, int i, r9u r9uVar) {
        this.b = bztVar;
        this.c = luuVar;
        this.d = i;
        this.e = r9uVar;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0051  */
    /* JADX WARN: Code duplicated, block: B:23:0x00eb  */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f42497a;
        Object obj2 = null;
        r9u r9uVar = this.e;
        int i = this.d;
        luu luuVar = this.c;
        bzt bztVar = this.b;
        switch (b) {
            case 0:
                vzg0 vzg0Var = (vzg0) obj;
                vzg0Var.getClass();
                for (Object obj3 : luuVar.f20692a.a()) {
                    if (((lok0) obj3).f20396a == i) {
                        obj2 = obj3;
                        lok0 lok0Var = (lok0) obj2;
                        v8d v8dVarA = bztVar.f3488a.a();
                        iun iunVar = iun.f15405a;
                        int iIntValue = ((Number) a8k0.H(vzg0Var, "EVENT_ID_KEY", Integer.valueOf(i))).intValue();
                        long jLongValue = ((Number) a8k0.H(vzg0Var, "SPORT_ID_KEY", Long.valueOf(lok0Var != null ? lok0Var.f : -1L))).longValue();
                        ygp ygpVar = ygp.t;
                        r9uVar.getClass();
                        j1q0 j1q0Var = r9uVar.f30104a;
                        j1q0Var.getClass();
                        return new keo0(-1, iunVar, iunVar, "", true, 0, iIntValue, jLongValue, j1q0Var.f15748a.d(ygpVar), v8dVarA.r);
                    }
                }
                lok0 lok0Var2 = (lok0) obj2;
                v8d v8dVarA2 = bztVar.f3488a.a();
                iun iunVar2 = iun.f15405a;
                int iIntValue2 = ((Number) a8k0.H(vzg0Var, "EVENT_ID_KEY", Integer.valueOf(i))).intValue();
                long jLongValue2 = ((Number) a8k0.H(vzg0Var, "SPORT_ID_KEY", Long.valueOf(lok0Var2 != null ? lok0Var2.f : -1L))).longValue();
                ygp ygpVar2 = ygp.t;
                r9uVar.getClass();
                j1q0 j1q0Var2 = r9uVar.f30104a;
                j1q0Var2.getClass();
                return new keo0(-1, iunVar2, iunVar2, "", true, 0, iIntValue2, jLongValue2, j1q0Var2.f15748a.d(ygpVar2), v8dVarA2.r);
            default:
                vzg0 vzg0Var2 = (vzg0) obj;
                vzg0Var2.getClass();
                v8d v8dVarA3 = bztVar.f3488a.a();
                for (Object obj4 : luuVar.f20692a.a()) {
                    if (((lok0) obj4).f20396a == i) {
                        obj2 = obj4;
                        lok0 lok0Var3 = (lok0) obj2;
                        int iIntValue3 = ((Number) a8k0.H(vzg0Var2, "EVENT_ID_KEY", Integer.valueOf(i))).intValue();
                        long jLongValue3 = ((Number) a8k0.H(vzg0Var2, "SPORT_ID_KEY", Long.valueOf(lok0Var3 != null ? lok0Var3.f : -1L))).longValue();
                        wcr0 wcr0Var = new wcr0(((Number) a8k0.H(vzg0Var2, "CURRENT_POS_KEY", 0)).intValue(), iun.f15405a);
                        TopPlayersSearchModel topPlayersSearchModel = (TopPlayersSearchModel) a8k0.H(vzg0Var2, "SEARCH_MODEL_KEY", new TopPlayersSearchModel("", false));
                        qar0 qar0Var = new qar0(par0.f26668a, v8dVarA3.r);
                        ygp ygpVar3 = ygp.t;
                        r9uVar.getClass();
                        j1q0 j1q0Var3 = r9uVar.f30104a;
                        j1q0Var3.getClass();
                        return new dbr0(iIntValue3, false, jLongValue3, true, topPlayersSearchModel, qar0Var, wcr0Var, j1q0Var3.f15748a.d(ygpVar3));
                    }
                }
                lok0 lok0Var4 = (lok0) obj2;
                int iIntValue4 = ((Number) a8k0.H(vzg0Var2, "EVENT_ID_KEY", Integer.valueOf(i))).intValue();
                long jLongValue4 = ((Number) a8k0.H(vzg0Var2, "SPORT_ID_KEY", Long.valueOf(lok0Var4 != null ? lok0Var4.f : -1L))).longValue();
                wcr0 wcr0Var2 = new wcr0(((Number) a8k0.H(vzg0Var2, "CURRENT_POS_KEY", 0)).intValue(), iun.f15405a);
                TopPlayersSearchModel topPlayersSearchModel2 = (TopPlayersSearchModel) a8k0.H(vzg0Var2, "SEARCH_MODEL_KEY", new TopPlayersSearchModel("", false));
                qar0 qar0Var2 = new qar0(par0.f26668a, v8dVarA3.r);
                ygp ygpVar4 = ygp.t;
                r9uVar.getClass();
                j1q0 j1q0Var4 = r9uVar.f30104a;
                j1q0Var4.getClass();
                return new dbr0(iIntValue4, false, jLongValue4, true, topPlayersSearchModel2, qar0Var2, wcr0Var2, j1q0Var4.f15748a.d(ygpVar4));
        }
    }

    public /* synthetic */ yeo0(luu luuVar, bzt bztVar, int i, r9u r9uVar) {
        this.c = luuVar;
        this.b = bztVar;
        this.d = i;
        this.e = r9uVar;
    }
}
