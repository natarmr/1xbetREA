package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class xqi0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f41322a;
    public final /* synthetic */ bri0 b;

    public /* synthetic */ xqi0(bri0 bri0Var, byte b) {
        this.f41322a = b;
        this.b = bri0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f41322a;
        iri0 iri0Var = iri0.f15257a;
        bri0 bri0Var = this.b;
        switch (b) {
            case 0:
                pti ptiVar = bri0Var.M1;
                if (ptiVar != null) {
                    return new t0h0(ptiVar, a4n0.f(bri0Var));
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 1:
                lme0 lme0Var = bri0.V1;
                uri0 uri0VarH0 = bri0Var.H0();
                String strValueOf = String.valueOf(bri0Var.G0().e.getText());
                if (uri0VarH0.C) {
                    sac.V(jiu0.a(uri0VarH0), new cri0(uri0VarH0, (byte) 1), null, uri0VarH0.r.b, new zye0(uri0VarH0, strValueOf, null, (byte) 22), 10);
                } else {
                    uri0VarH0.w.f(eri0.f8282a);
                }
                return Unit.f46060a;
            case 2:
                lme0 lme0Var2 = bri0.V1;
                bri0Var.H0().w.f(iri0Var);
                return Unit.f46060a;
            case 3:
                lme0 lme0Var3 = bri0.V1;
                bri0Var.H0().w.f(iri0Var);
                return Unit.f46060a;
            case 4:
                lme0 lme0Var4 = bri0.V1;
                bri0 bri0Var2 = this.b;
                wdk0 wdk0Var = bri0Var2.O1;
                if (wdk0Var == null) {
                    Intrinsics.h("snackbarManager");
                    throw null;
                }
                rek0 rek0Var = rek0.b;
                String strH = bri0Var2.H(R.string.network_error);
                strH.getClass();
                wdk0.k(wdk0Var, new xdk0(rek0Var, strH, null, null, null, null, 124), bri0Var2, null, null, false, null, 1020);
                return Unit.f46060a;
            case 5:
                lme0 lme0Var5 = bri0.V1;
                bri0Var.H0().w.f(hri0.f13531a);
                return Unit.f46060a;
            case 6:
                lme0 lme0Var6 = bri0.V1;
                bri0Var.H0().w();
                return Unit.f46060a;
            default:
                lme0 lme0Var7 = bri0.V1;
                bri0Var.H0().w();
                return Unit.f46060a;
        }
    }
}
