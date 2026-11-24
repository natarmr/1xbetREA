package a;

import org.xplatform.core.navigation.authorization.model.AuthType;

/* JADX INFO: loaded from: classes3.dex */
public final class x8i implements p0h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n8i f40462a;

    public x8i(n8i n8iVar) {
        this.f40462a = n8iVar;
    }

    @Override // a.p0h0
    public final diu0 a(vzg0 vzg0Var) {
        g45 g45Var = (g45) this.f40462a.b;
        i1w0 i1w0Var = (i1w0) g45Var.f10647a;
        mzt mztVar = new mzt((peg0) g45Var.b);
        s9m0 s9m0Var = (s9m0) g45Var.c;
        dpc dpcVar = (dpc) g45Var.d;
        pru pruVar = (pru) g45Var.e;
        bzt bztVar = new bzt((fsd) g45Var.f);
        AuthType authType = (AuthType) g45Var.g;
        mne mneVarH = ((psc) ((cad) g45Var.h).b).h();
        x1x.x(mneVarH);
        return new q54(vzg0Var, i1w0Var, mztVar, s9m0Var, dpcVar, pruVar, bztVar, authType, mneVarH);
    }
}
