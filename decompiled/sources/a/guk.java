package a;

import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final class guk extends w46 {
    public final int b;
    public final String c;
    public final mne d;
    public final p4u e;
    public final dq00 f;
    public bby g;
    public final p7m0 h;

    public guk(vzg0 vzg0Var, int i, String str, mne mneVar, p4u p4uVar, dq00 dq00Var, g2v g2vVar) {
        this.b = i;
        this.c = str;
        this.d = mneVar;
        this.e = p4uVar;
        this.f = dq00Var;
        iun iunVar = iun.f15405a;
        String str2 = (String) vzg0Var.a("KEY_SEARCH_QUERY");
        this.h = q7m0.a(new nuk(iunVar, str2 == null ? "" : str2, g2v.d(g2vVar, pb10.r1, okm.c, null, R.string.nothing_found, 0, null, 476)));
        sac.V(jiu0.a(this), new e3j(this, (byte) 17), null, mneVar.f22085a, new hij(this, null, (byte) 6), 10);
    }
}
