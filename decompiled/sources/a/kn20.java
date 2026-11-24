package a;

import org.xplatform.feature.fin_bet.impl.domain.model.FinBetInfoModel;

/* JADX INFO: loaded from: classes3.dex */
public final class kn20 extends w46 {
    public final FinBetInfoModel b;
    public final lbu c;
    public final i1w0 d;
    public final mne e;
    public final k7u f;
    public final sff0 g;
    public final p7m0 h;
    public final p7m0 i;
    public final p7m0 j;

    public kn20(FinBetInfoModel finBetInfoModel, lbu lbuVar, jqt jqtVar, i1w0 i1w0Var, mne mneVar, x4u x4uVar, k7u k7uVar, pru pruVar) {
        i1w0Var.getClass();
        this.b = finBetInfoModel;
        this.c = lbuVar;
        this.d = i1w0Var;
        this.e = mneVar;
        this.f = k7uVar;
        this.g = pruVar.a();
        this.h = q7m0.a(new pi20(0.0d, k7uVar.f17841a.b().getId()));
        this.i = q7m0.a(Double.valueOf(finBetInfoModel.f));
        this.j = q7m0.a(li20.f20084a);
        yje yjeVar = null;
        slb.U(new fnq(new i89(new ewt(finBetInfoModel.k ? x4uVar.a(wbq.f38891a) : x4uVar.a(wbq.b), this, (byte) 28), (byte) 22), new xr10((Object) this, yjeVar, (byte) 9), (byte) 4), jiu0.a(this));
        sac.T(new fnq(jqtVar.a(), new vf20(2, this, kn20.class, "checkAuthorization", "checkAuthorization(Z)V", 4, (byte) 1), (byte) 4), d5c.S(jiu0.a(this), mneVar.f22085a), new sax(2, yjeVar, (byte) 19));
    }

    @Override // a.diu0
    public final void v() {
    }
}
