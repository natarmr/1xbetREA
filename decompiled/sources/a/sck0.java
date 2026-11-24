package a;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class sck0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f31990a;
    public final /* synthetic */ tck0 b;

    public /* synthetic */ sck0(tck0 tck0Var, byte b) {
        this.f31990a = b;
        this.b = tck0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f31990a;
        tck0 tck0Var = this.b;
        switch (b) {
            case 0:
                phf0 phf0Var = tck0Var.m2;
                bdk0 bdk0Var = (bdk0) obj;
                eke0 eke0Var = tck0.t2;
                bdk0Var.getClass();
                if (bdk0Var instanceof adk0) {
                    if (tck0Var.l2 == null) {
                        Intrinsics.h("captchaDialogDelegate");
                        throw null;
                    }
                    d7a d7aVar = ((adk0) bdk0Var).f684a;
                    String strH = tck0Var.H(R.string.confirmation);
                    strH.getClass();
                    gl5.q(tck0Var, "REQUEST_CAPTCHA_CODE_DIALOG_KEY", d7aVar, strH);
                } else if (bdk0Var instanceof zck0) {
                    zck0 zck0Var = (zck0) bdk0Var;
                    vcc.f0(i120.V(new Pair("CODE_CONFIRMED_RESULT", Boolean.valueOf(zck0Var.f44171a)), new Pair("CODE_CONFIRMED_MESSAGE", zck0Var.b), new Pair("CODE_CONFIRMATION_ERROR", zck0Var.c)), tck0Var, phf0Var.n(tck0Var, tck0.u2[0]));
                    tck0Var.y0();
                } else {
                    if (!bdk0Var.equals(yck0.f42388a)) {
                        t9f.b();
                        return null;
                    }
                    vcc.f0(i120.V(new Pair("CODE_CONFIRMED_RESULT", Boolean.FALSE), new Pair("CODE_CONFIRMED_MESSAGE", ""), new Pair("CODE_CONFIRMATION_ERROR", "")), tck0Var, phf0Var.n(tck0Var, tck0.u2[0]));
                    tck0Var.y0();
                }
                tck0Var.P0().x(gck0.f11067a);
                return Unit.f46060a;
            default:
                iqt0 iqt0Var = (iqt0) obj;
                eke0 eke0Var2 = tck0.t2;
                iqt0Var.getClass();
                tck0Var.P0().x(new lck0(iqt0Var));
                return Unit.f46060a;
        }
    }
}
