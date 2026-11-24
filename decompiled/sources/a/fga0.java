package a;

import java.io.Serializable;
import java.util.ArrayList;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class fga0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jw20 f9482a;
    public final knf0 b;
    public final mne c;
    public final rfa0 d;

    public fga0(jw20 jw20Var, knf0 knf0Var, mne mneVar, rfa0 rfa0Var) {
        knf0Var.getClass();
        rfa0Var.getClass();
        this.f9482a = jw20Var;
        this.b = knf0Var;
        this.c = mneVar;
        this.d = rfa0Var;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Serializable a(long j, zje zjeVar, boolean z) {
        dga0 dga0Var;
        tdn tdnVar;
        String str;
        if (zjeVar instanceof dga0) {
            dga0Var = (dga0) zjeVar;
            int i = dga0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                dga0Var.k = i - Integer.MIN_VALUE;
            } else {
                dga0Var = new dga0(this, zjeVar);
            }
        } else {
            dga0Var = new dga0(this, zjeVar);
        }
        dga0 dga0Var2 = dga0Var;
        Object objA = dga0Var2.i;
        wne wneVar = wne.f39444a;
        int i2 = dga0Var2.k;
        if (i2 == 0) {
            z1x.P(objA);
            String str2 = z ? "FeedLive" : "FeedLine";
            knf0 knf0Var = this.b;
            knf0Var.getClass();
            String strC = knf0Var.c();
            dga0Var2.k = 1;
            objA = ((kfa0) ((tpv) this.f9482a.b).invoke()).a(str2, j, strC, 1, 22, dga0Var2);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objA);
        }
        Iterable<bv10> iterable = (Iterable) ((dx5) objA).a();
        ArrayList arrayList = new ArrayList();
        for (bv10 bv10Var : iterable) {
            bv10Var.getClass();
            Long l = bv10Var.f3261a;
            if (l == null || (str = bv10Var.c) == null || StringsKt.W(str)) {
                tdnVar = null;
            } else {
                long jLongValue = l.longValue();
                String str3 = bv10Var.b;
                if (str3 == null) {
                    str3 = "";
                }
                tdnVar = new tdn(jLongValue, bv10Var.d, str3, bv10Var.c);
            }
            if (tdnVar != null) {
                arrayList.add(tdnVar);
            }
        }
        return arrayList;
    }
}
