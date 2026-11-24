package a;

import org.xplatform.rules.api.presentation.models.RuleData;

/* JADX INFO: loaded from: classes5.dex */
public final class lsi implements giu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ msi f20580a;

    public lsi(msi msiVar) {
        this.f20580a = msiVar;
    }

    @Override // a.giu0
    public final diu0 c(Object obj) {
        i1w0 i1w0Var = (i1w0) obj;
        nsi nsiVar = (nsi) this.f20580a.c;
        gmg0 gmg0Var = nsiVar.f24051a;
        RuleData ruleData = gmg0Var.f11542a;
        boolean z = gmg0Var.b;
        nv20 nv20Var = nsiVar.b;
        tzi tziVarE = ((h6i) nv20Var.f24171a).e();
        m1e m1eVar = nsiVar.c;
        g2v g2vVar = nsiVar.d;
        duj dujVar = nsiVar.e;
        kt2 kt2Var = nsiVar.f;
        u58 u58Var = new u58(kt2Var, (byte) 2);
        ag3 ag3Var = new ag3(kt2Var, (byte) 7);
        d1p d1pVar = nsiVar.g;
        return new mog0(ruleData, z, nv20Var, tziVarE, m1eVar, g2vVar, dujVar, u58Var, ag3Var, d1pVar.x(), d1pVar.k0(), nsiVar.h, i1w0Var);
    }
}
