package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.math.BigDecimal;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.make_bet.impl.presentation.model.StepInputUiModel;
import org.xplatform.uikit.components.dialog.DialogFields;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class gvj0 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f11978a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gvj0(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.f11978a = b;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        StepInputUiModel stepInputUiModel;
        Double dI;
        Object value2;
        org.xplatform.feature.fin_bet.impl.makebet.presentation.make_bet.ui_model.StepInputUiModel stepInputUiModel2;
        Double dI2;
        Object value3;
        Object value4;
        byte b = 1;
        byte b2 = 0;
        switch (this.f11978a) {
            case 0:
                String str = (String) obj;
                str.getClass();
                xxj0 xxj0Var = (xxj0) this.receiver;
                xxj0Var.getClass();
                p7m0 p7m0Var = xxj0Var.C0;
                do {
                    value = p7m0Var.getValue();
                    stepInputUiModel = (StepInputUiModel) value;
                    dI = kotlin.text.b.i(str);
                } while (!p7m0Var.m(value, StepInputUiModel.a(stepInputUiModel, dI != null ? dI.doubleValue() : -1.0d, 0.0d, 0.0d, 0.0d, 0.0d, null, false, false, null, true, false, false, false, false, false, 129022)));
                return Unit.f46060a;
            case 1:
                String str2 = (String) obj;
                str2.getClass();
                yxj0 yxj0Var = (yxj0) this.receiver;
                yxj0Var.getClass();
                p7m0 p7m0Var2 = yxj0Var.X;
                do {
                    value2 = p7m0Var2.getValue();
                    stepInputUiModel2 = (org.xplatform.feature.fin_bet.impl.makebet.presentation.make_bet.ui_model.StepInputUiModel) value2;
                    dI2 = kotlin.text.b.i(str2);
                } while (!p7m0Var2.m(value2, org.xplatform.feature.fin_bet.impl.makebet.presentation.make_bet.ui_model.StepInputUiModel.a(stepInputUiModel2, dI2 != null ? dI2.doubleValue() : -1.0d, 0.0d, 0.0d, 0.0d, null, false, false, true, false, false, false, 7678)));
                return Unit.f46060a;
            case 2:
                Throwable th = (Throwable) obj;
                th.getClass();
                ((yxj0) this.receiver).y(th);
                return Unit.f46060a;
            case 3:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                ((yxj0) this.receiver).w(th2);
                return Unit.f46060a;
            case 4:
                Throwable th3 = (Throwable) obj;
                th3.getClass();
                ((yxj0) this.receiver).w(th3);
                return Unit.f46060a;
            case 5:
                Throwable th4 = (Throwable) obj;
                th4.getClass();
                ((xxj0) this.receiver).C(th4);
                return Unit.f46060a;
            case 6:
                Throwable th5 = (Throwable) obj;
                th5.getClass();
                ((yxj0) this.receiver).w(th5);
                return Unit.f46060a;
            case 7:
                Throwable th6 = (Throwable) obj;
                th6.getClass();
                ((xxj0) this.receiver).C(th6);
                return Unit.f46060a;
            case 8:
                String str3 = (String) obj;
                str3.getClass();
                wyj0 wyj0Var = (wyj0) this.receiver;
                wyj0Var.getClass();
                BigDecimal bigDecimalH = kotlin.text.b.h(str3);
                if (bigDecimalH == null) {
                    bigDecimalH = new BigDecimal(String.valueOf(-1.0d));
                }
                BigDecimal bigDecimal = bigDecimalH;
                p7m0 p7m0Var3 = wyj0Var.E;
                do {
                    value3 = p7m0Var3.getValue();
                } while (!p7m0Var3.m(value3, od7.a((od7) value3, bigDecimal, null, null, false, null, 30)));
                return Unit.f46060a;
            case 9:
                Throwable th7 = (Throwable) obj;
                th7.getClass();
                l2k0 l2k0Var = (l2k0) this.receiver;
                l2k0Var.p.b(th7, new i2k0(l2k0Var, b));
                return Unit.f46060a;
            case 10:
                Throwable th8 = (Throwable) obj;
                th8.getClass();
                l2k0 l2k0Var2 = (l2k0) this.receiver;
                l2k0Var2.p.b(th8, new i2k0(l2k0Var2, b2));
                return Unit.f46060a;
            case 11:
                Throwable th9 = (Throwable) obj;
                th9.getClass();
                l2k0 l2k0Var3 = (l2k0) this.receiver;
                l2k0Var3.p.b(th9, new i2k0(l2k0Var3, b2));
                return Unit.f46060a;
            case 12:
                w4k0 w4k0Var = (w4k0) obj;
                w4k0Var.getClass();
                ((k3t0) this.receiver).x(w4k0Var);
                return Unit.f46060a;
            case 13:
                pck0 pck0Var = (pck0) obj;
                pck0Var.getClass();
                ((k3t0) this.receiver).x(pck0Var);
                return Unit.f46060a;
            case 14:
                return Float.valueOf(((qah0) this.receiver).a(((Number) obj).floatValue()));
            case 15:
                return Float.valueOf(((qah0) this.receiver).a(((Number) obj).floatValue()));
            case 16:
                ghk0 ghk0Var = (ghk0) obj;
                ghk0Var.getClass();
                tik0 tik0Var = (tik0) this.receiver;
                iiy[] iiyVarArr = tik0.Q1;
                cjk0 cjk0VarI0 = tik0Var.I0();
                p7m0 p7m0Var4 = cjk0VarI0.m;
                do {
                    value4 = p7m0Var4.getValue();
                } while (!p7m0Var4.m(value4, new nik0(true)));
                String str4 = ghk0Var.d;
                int i = ghk0Var.f11305a;
                String str5 = ghk0Var.b;
                String str6 = ghk0Var.c;
                v8d v8dVar = cjk0VarI0.k;
                sac.V(jiu0.a(cjk0VarI0), new vik0(cjk0VarI0, b), null, cjk0VarI0.b.f22085a, new kpb0(cjk0VarI0, new su4(i, str4, str5, str6, i == 13 ? v8dVar.m : v8dVar.k), ghk0Var, null, (byte) 17), 10);
                return Unit.f46060a;
            case 17:
                clk0 clk0Var = (clk0) obj;
                clk0Var.getClass();
                dlk0 dlk0Var = (dlk0) this.receiver;
                gle0 gle0Var = dlk0.m2;
                dlk0Var.getClass();
                phf0 phf0Var = dlk0Var.k2;
                if (clk0Var.equals(alk0.f1073a)) {
                    dlk0Var.y0();
                } else {
                    if (!(clk0Var instanceof blk0)) {
                        t9f.b();
                        return null;
                    }
                    iiy[] iiyVarArr2 = dlk0.n2;
                    vcc.f0(i120.V(new Pair(phf0Var.n(dlk0Var, iiyVarArr2[0]), ((blk0) clk0Var).f2798a)), dlk0Var, phf0Var.n(dlk0Var, iiyVarArr2[0]));
                }
                return Unit.f46060a;
            case 18:
                ilk0 ilk0Var = (ilk0) obj;
                ilk0Var.getClass();
                jlk0 jlk0Var = (jlk0) this.receiver;
                lme0 lme0Var = jlk0.n2;
                jlk0Var.getClass();
                phf0 phf0Var2 = jlk0Var.k2;
                if (ilk0Var instanceof glk0) {
                    jlk0Var.y0();
                } else {
                    if (!(ilk0Var instanceof hlk0)) {
                        t9f.b();
                        return null;
                    }
                    iiy[] iiyVarArr3 = jlk0.o2;
                    vcc.f0(i120.V(new Pair(phf0Var2.n(jlk0Var, iiyVarArr3[0]), ((hlk0) ilk0Var).f13266a)), jlk0Var, phf0Var2.n(jlk0Var, iiyVarArr3[0]));
                }
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                Throwable th10 = (Throwable) obj;
                th10.getClass();
                ((tyk0) this.receiver).x(th10);
                return Unit.f46060a;
            case 20:
                Throwable th11 = (Throwable) obj;
                th11.getClass();
                ((tyk0) this.receiver).x(th11);
                return Unit.f46060a;
            case 21:
                Throwable th12 = (Throwable) obj;
                th12.getClass();
                ((tyk0) this.receiver).x(th12);
                return Unit.f46060a;
            case 22:
                Throwable th13 = (Throwable) obj;
                th13.getClass();
                ((tyk0) this.receiver).x(th13);
                return Unit.f46060a;
            case 23:
                Throwable th14 = (Throwable) obj;
                th14.getClass();
                ((tyk0) this.receiver).x(th14);
                return Unit.f46060a;
            case 24:
                Throwable th15 = (Throwable) obj;
                th15.getClass();
                ((tyk0) this.receiver).x(th15);
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                Throwable th16 = (Throwable) obj;
                th16.getClass();
                ((tyk0) this.receiver).x(th16);
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                Throwable th17 = (Throwable) obj;
                th17.getClass();
                ((tyk0) this.receiver).x(th17);
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                Throwable th18 = (Throwable) obj;
                th18.getClass();
                ((tyk0) this.receiver).x(th18);
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                b1l0 b1l0Var = (b1l0) obj;
                b1l0Var.getClass();
                x0l0 x0l0Var = (x0l0) this.receiver;
                DialogFields dialogFields = b1l0Var.f1812a;
                ii iiVar = x0l0Var.K1;
                if (iiVar == null) {
                    Intrinsics.h("actionDialogManager");
                    throw null;
                }
                androidx.fragment.app.e eVarC = x0l0Var.C();
                eVarC.getClass();
                iiVar.d(dialogFields, eVarC);
                ((k3t0) x0l0Var.M1.getValue()).x(o0l0.f24432a);
                return Unit.f46060a;
            default:
                v0l0 v0l0Var = (v0l0) obj;
                v0l0Var.getClass();
                ((k3t0) this.receiver).x(v0l0Var);
                return Unit.f46060a;
        }
    }
}
