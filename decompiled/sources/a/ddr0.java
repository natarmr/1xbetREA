package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.uikit.components.dialog.DialogFields;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ddr0 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f5910a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ddr0(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.f5910a = b;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        dbr0 dbr0Var;
        byte b = 23;
        byte b2 = 24;
        switch (this.f5910a) {
            case 0:
                Throwable th = (Throwable) obj;
                th.getClass();
                edr0 edr0Var = (edr0) this.receiver;
                p7m0 p7m0Var = edr0Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    dbr0Var = (dbr0) value;
                    edr0Var.f.getClass();
                } while (!p7m0Var.m(value, dbr0.a(dbr0Var, false, null, new qar0(th instanceof ff5 ? par0.c : par0.b, dbr0Var.f.b), null, 443)));
                return Unit.f46060a;
            case 1:
                pkb0 pkb0Var = (pkb0) obj;
                pkb0Var.getClass();
                ((k3t0) this.receiver).x(pkb0Var);
                return Unit.f46060a;
            case 2:
                wxq0 wxq0Var = (wxq0) obj;
                wxq0Var.getClass();
                ((k3t0) this.receiver).x(wxq0Var);
                return Unit.f46060a;
            case 3:
                wxq0 wxq0Var2 = (wxq0) obj;
                wxq0Var2.getClass();
                ((k3t0) this.receiver).x(wxq0Var2);
                return Unit.f46060a;
            case 4:
                xhr0 xhr0Var = (xhr0) obj;
                xhr0Var.getClass();
                phr0 phr0Var = (phr0) this.receiver;
                y2m0 y2m0Var = phr0.W1;
                phr0Var.getClass();
                if (xhr0Var instanceof rhr0) {
                    DialogFields dialogFields = ((rhr0) xhr0Var).f30504a;
                    ii iiVar = phr0Var.O1;
                    if (iiVar == null) {
                        Intrinsics.h("actionDialogManager");
                        throw null;
                    }
                    androidx.fragment.app.e eVarC = phr0Var.C();
                    eVarC.getClass();
                    iiVar.d(dialogFields, eVarC);
                } else if (xhr0Var instanceof shr0) {
                    shr0 shr0Var = (shr0) xhr0Var;
                    if (shr0Var.d) {
                        int i = usr0.r2;
                        androidx.fragment.app.e eVarC2 = phr0Var.C();
                        eVarC2.getClass();
                        if (eVarC2.J("TotoBetMakeBetBottomSheetDialog") == null) {
                            new usr0().H0(eVarC2, "TotoBetMakeBetBottomSheetDialog");
                        }
                    } else {
                        m6m0 m6m0Var = ikr0.l2;
                        androidx.fragment.app.e eVarC3 = phr0Var.C();
                        eVarC3.getClass();
                        String str = shr0Var.f32228a;
                        String str2 = shr0Var.b;
                        boolean z = shr0Var.c;
                        m6m0Var.getClass();
                        m6m0.m(eVarC3, str, str2, z);
                    }
                } else if (xhr0Var instanceof vhr0) {
                    wdk0 wdk0Var = phr0Var.P1;
                    if (wdk0Var == null) {
                        Intrinsics.h("snackbarManager");
                        throw null;
                    }
                    wdk0.k(wdk0Var, new xdk0(rek0.b, ((vhr0) xhr0Var).f37445a, null, null, null, null, 124), phr0Var, null, null, false, null, 1020);
                } else if (xhr0Var instanceof whr0) {
                    whr0 whr0Var = (whr0) xhr0Var;
                    lgn0 lgn0Var = phr0Var.Q1;
                    if (lgn0Var == null) {
                        Intrinsics.h("successBetAlertManager");
                        throw null;
                    }
                    lgn0Var.c(whr0Var.f39179a, whr0Var.b, phr0Var);
                } else if (xhr0Var.equals(thr0.f33975a)) {
                    r9u r9uVar = phr0Var.S1;
                    if (r9uVar == null) {
                        Intrinsics.h("getFeatureToggleUseCase");
                        throw null;
                    }
                    ygp ygpVar = ygp.B1;
                    j1q0 j1q0Var = r9uVar.f30104a;
                    j1q0Var.getClass();
                    if (j1q0Var.f15748a.d(ygpVar)) {
                        int i2 = ylr0.m2;
                        androidx.fragment.app.e eVarC4 = phr0Var.C();
                        eVarC4.getClass();
                        yum0.m(eVarC4);
                    } else {
                        int i3 = amr0.m2;
                        androidx.fragment.app.e eVarC5 = phr0Var.C();
                        eVarC5.getClass();
                        cvm0.l(eVarC5);
                    }
                } else {
                    if (!(xhr0Var instanceof uhr0)) {
                        t9f.b();
                        return null;
                    }
                    roq0 roq0Var = phr0Var.R1;
                    if (roq0Var == null) {
                        Intrinsics.h("tipsDialogScreenFactory");
                        throw null;
                    }
                    androidx.fragment.app.e eVarC6 = phr0Var.C();
                    eVarC6.getClass();
                    uuz uuzVar = fk60.b;
                    roq0.c(roq0Var, eVarC6, 19);
                }
                phr0Var.G0().x(pgr0.f26965a);
                return Unit.f46060a;
            case 5:
                ghr0 ghr0Var = (ghr0) obj;
                ghr0Var.getClass();
                ((fir0) this.receiver).x(ghr0Var);
                return Unit.f46060a;
            case 6:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                ((fir0) this.receiver).M(th2);
                return Unit.f46060a;
            case 7:
                Throwable th3 = (Throwable) obj;
                th3.getClass();
                ((fir0) this.receiver).M(th3);
                return Unit.f46060a;
            case 8:
                Throwable th4 = (Throwable) obj;
                th4.getClass();
                ((fir0) this.receiver).M(th4);
                return Unit.f46060a;
            case 9:
                Throwable th5 = (Throwable) obj;
                th5.getClass();
                fir0 fir0Var = (fir0) this.receiver;
                fir0Var.J.b(th5, new a6p0(fir0Var, th5, b));
                return Unit.f46060a;
            case 10:
                Throwable th6 = (Throwable) obj;
                th6.getClass();
                fir0 fir0Var2 = (fir0) this.receiver;
                fir0Var2.J.b(th6, new a6p0(fir0Var2, th6, b));
                return Unit.f46060a;
            case 11:
                Throwable th7 = (Throwable) obj;
                th7.getClass();
                ((fir0) this.receiver).M(th7);
                return Unit.f46060a;
            case 12:
                Throwable th8 = (Throwable) obj;
                th8.getClass();
                ((fir0) this.receiver).M(th8);
                return Unit.f46060a;
            case 13:
                Throwable th9 = (Throwable) obj;
                th9.getClass();
                ((fir0) this.receiver).M(th9);
                return Unit.f46060a;
            case 14:
                Throwable th10 = (Throwable) obj;
                th10.getClass();
                ((fir0) this.receiver).M(th10);
                return Unit.f46060a;
            case 15:
                Throwable th11 = (Throwable) obj;
                th11.getClass();
                ((fir0) this.receiver).M(th11);
                return Unit.f46060a;
            case 16:
                Throwable th12 = (Throwable) obj;
                th12.getClass();
                ((fir0) this.receiver).M(th12);
                return Unit.f46060a;
            case 17:
                Throwable th13 = (Throwable) obj;
                th13.getClass();
                ((fir0) this.receiver).M(th13);
                return Unit.f46060a;
            case 18:
                Throwable th14 = (Throwable) obj;
                th14.getClass();
                ((fir0) this.receiver).M(th14);
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                Throwable th15 = (Throwable) obj;
                th15.getClass();
                ((fir0) this.receiver).M(th15);
                return Unit.f46060a;
            case 20:
                Throwable th16 = (Throwable) obj;
                th16.getClass();
                ((fir0) this.receiver).M(th16);
                return Unit.f46060a;
            case 21:
                Throwable th17 = (Throwable) obj;
                th17.getClass();
                ((fir0) this.receiver).M(th17);
                return Unit.f46060a;
            case 22:
                Throwable th18 = (Throwable) obj;
                th18.getClass();
                ((njr0) this.receiver).z(th18);
                return Unit.f46060a;
            case 23:
                Throwable th19 = (Throwable) obj;
                th19.getClass();
                ((njr0) this.receiver).z(th19);
                return Unit.f46060a;
            case 24:
                Throwable th20 = (Throwable) obj;
                th20.getClass();
                ((njr0) this.receiver).z(th20);
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                Throwable th21 = (Throwable) obj;
                th21.getClass();
                ((njr0) this.receiver).z(th21);
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                Throwable th22 = (Throwable) obj;
                th22.getClass();
                ((njr0) this.receiver).z(th22);
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                Throwable th23 = (Throwable) obj;
                th23.getClass();
                ((njr0) this.receiver).z(th23);
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                Throwable th24 = (Throwable) obj;
                th24.getClass();
                njr0 njr0Var = (njr0) this.receiver;
                njr0Var.y.b(th24, new a6p0(njr0Var, th24, b2));
                return Unit.f46060a;
            default:
                Throwable th25 = (Throwable) obj;
                th25.getClass();
                njr0 njr0Var2 = (njr0) this.receiver;
                njr0Var2.y.b(th25, new a6p0(njr0Var2, th25, b2));
                return Unit.f46060a;
        }
    }
}
