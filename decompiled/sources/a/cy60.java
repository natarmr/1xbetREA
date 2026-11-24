package a;

import android.os.Bundle;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class cy60 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f5158a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cy60(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.f5158a = b;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f5158a) {
            case 0:
                Throwable th = (Throwable) obj;
                th.getClass();
                ((dy60) this.receiver).M(th);
                return Unit.f46060a;
            case 1:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                ((dy60) this.receiver).M(th2);
                return Unit.f46060a;
            case 2:
                Throwable th3 = (Throwable) obj;
                th3.getClass();
                ((dy60) this.receiver).M(th3);
                return Unit.f46060a;
            case 3:
                sy60 sy60Var = (sy60) obj;
                sy60Var.getClass();
                py60 py60Var = (py60) this.receiver;
                iiy[] iiyVarArr = py60.P1;
                py60Var.getClass();
                if (sy60Var.equals(sy60.f33013a)) {
                    i1w0 i1w0VarF = a4n0.f(py60Var);
                    CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0VarF);
                    ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0.f26173a), i1w0VarF, copyOnWriteArrayListQ, 0);
                    while (true) {
                        paw pawVar = (paw) listIteratorP;
                        if (pawVar.hasNext()) {
                            i1w0VarF.a((oe50) pawVar.next());
                        }
                    }
                }
                ((k3t0) py60Var.O1.getValue()).x(ey60.f8613a);
                return Unit.f46060a;
            case 4:
                String str = (String) obj;
                str.getClass();
                g670 g670Var = (g670) this.receiver;
                g670Var.getClass();
                g670Var.w(str, false, true);
                return Unit.f46060a;
            case 5:
                b270 b270Var = (b270) obj;
                b270Var.getClass();
                p170 p170Var = (p170) this.receiver;
                xuz xuzVar = p170.Q1;
                p170Var.getClass();
                kiu0 kiu0Var = p170Var.N1;
                if (b270Var.equals(b270.f1841a)) {
                    ((k370) kiu0Var.getValue()).y(y270.f41893a);
                } else if (b270Var.equals(b270.b)) {
                    ((k370) kiu0Var.getValue()).y(new z270(true));
                } else {
                    if (!b270Var.equals(b270.c)) {
                        t9f.b();
                        return null;
                    }
                    ynb ynbVar = p170Var.M1;
                    if (ynbVar == null) {
                        Intrinsics.h("changeBalanceDialogProvider");
                        throw null;
                    }
                    bm5 bm5Var = bm5.d;
                    androidx.fragment.app.e eVarC = p170Var.C();
                    eVarC.getClass();
                    ynb.b(ynbVar, bm5Var, null, eVarC, false, "SELECT_BALANCE_REQUEST_KEY", 494);
                }
                p170Var.G0().x(r070.f29617a);
                return Unit.f46060a;
            case 6:
                j170 j170Var = (j170) obj;
                j170Var.getClass();
                ((k3t0) this.receiver).x(j170Var);
                return Unit.f46060a;
            case 7:
                Throwable th4 = (Throwable) obj;
                th4.getClass();
                ((n270) this.receiver).M.b(th4, new cr60((byte) 14));
                return Unit.f46060a;
            case 8:
                Throwable th5 = (Throwable) obj;
                th5.getClass();
                ((n270) this.receiver).M.b(th5, new cr60((byte) 14));
                return Unit.f46060a;
            case 9:
                Throwable th6 = (Throwable) obj;
                th6.getClass();
                ((n270) this.receiver).M.b(th6, new cr60((byte) 14));
                return Unit.f46060a;
            case 10:
                p970 p970Var = (p970) obj;
                p970Var.getClass();
                h970 h970Var = (h970) this.receiver;
                atz atzVar = h970.o2;
                h970Var.getClass();
                if (p970Var instanceof o970) {
                    if (!h970Var.R()) {
                        h970Var.Q0(i120.V(new Pair(h970Var.k2.n(h970Var, h970.p2[0]), Boolean.TRUE)));
                        h970Var.y0();
                    }
                } else {
                    if (!(p970Var instanceof n970)) {
                        t9f.b();
                        return null;
                    }
                    if (!h970Var.R()) {
                        h970Var.P0();
                        h970Var.y0();
                    }
                }
                ((k3t0) h970Var.n2.getValue()).x(l970.f19637a);
                return Unit.f46060a;
            case 11:
                m970 m970Var = (m970) obj;
                m970Var.getClass();
                ((k3t0) this.receiver).x(m970Var);
                return Unit.f46060a;
            case 12:
                v870 v870Var = (v870) obj;
                v870Var.getClass();
                ((k3t0) this.receiver).x(v870Var);
                return Unit.f46060a;
            case 13:
                v870 v870Var2 = (v870) obj;
                v870Var2.getClass();
                ((k3t0) this.receiver).x(v870Var2);
                return Unit.f46060a;
            case 14:
                pc70 pc70Var = (pc70) obj;
                pc70Var.getClass();
                lc70 lc70Var = (lc70) this.receiver;
                uuz uuzVar = lc70.n2;
                if (!(pc70Var instanceof mc70)) {
                    lc70Var.getClass();
                    if (pc70Var.equals(nc70.f23278a)) {
                        if (!lc70Var.R()) {
                            String strP0 = lc70Var.P0();
                            Bundle bundle = new Bundle();
                            bundle.putBoolean("OneXGamesWebGame.UNAUTHORIZED_DEMO_DIALOG_RESULT_LOGIN_KEY", true);
                            vcc.f0(bundle, lc70Var, strP0);
                            lc70Var.y0();
                        }
                    } else {
                        if (!pc70Var.equals(oc70.f25015a)) {
                            t9f.b();
                            return null;
                        }
                        if (!lc70Var.R()) {
                            String strP1 = lc70Var.P0();
                            Bundle bundle2 = new Bundle();
                            bundle2.putBoolean("OneXGamesWebGame.UNAUTHORIZED_DEMO_DIALOG_RESULT_REGISTRATION_KEY", true);
                            vcc.f0(bundle2, lc70Var, strP1);
                            lc70Var.y0();
                        }
                    }
                } else if (!lc70Var.R()) {
                    if (!((mc70) pc70Var).f21537a) {
                        String strP2 = lc70Var.P0();
                        Bundle bundle3 = new Bundle();
                        bundle3.putBoolean("OneXGamesWebGame.UNAUTHORIZED_DEMO_DIALOG_RESULT_EXIT_KEY", true);
                        vcc.f0(bundle3, lc70Var, strP2);
                    }
                    lc70Var.y0();
                }
                ((k3t0) lc70Var.m2.getValue()).x(ec70.f7551a);
                return Unit.f46060a;
            case 15:
                ic70 ic70Var = (ic70) obj;
                ic70Var.getClass();
                ((k3t0) this.receiver).x(ic70Var);
                return Unit.f46060a;
            case 16:
                Throwable th7 = (Throwable) obj;
                th7.getClass();
                ((xd70) this.receiver).T(th7);
                return Unit.f46060a;
            case 17:
                Throwable th8 = (Throwable) obj;
                th8.getClass();
                ((xd70) this.receiver).T(th8);
                return Unit.f46060a;
            case 18:
                Throwable th9 = (Throwable) obj;
                th9.getClass();
                ((xd70) this.receiver).T(th9);
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                Throwable th10 = (Throwable) obj;
                th10.getClass();
                ((xd70) this.receiver).T(th10);
                return Unit.f46060a;
            case 20:
                Throwable th11 = (Throwable) obj;
                th11.getClass();
                ((xd70) this.receiver).T(th11);
                return Unit.f46060a;
            case 21:
                Throwable th12 = (Throwable) obj;
                th12.getClass();
                ((xd70) this.receiver).T(th12);
                return Unit.f46060a;
            case 22:
                Throwable th13 = (Throwable) obj;
                th13.getClass();
                ((xd70) this.receiver).T(th13);
                return Unit.f46060a;
            case 23:
                Throwable th14 = (Throwable) obj;
                th14.getClass();
                ((xd70) this.receiver).T(th14);
                return Unit.f46060a;
            case 24:
                Throwable th15 = (Throwable) obj;
                th15.getClass();
                ((xd70) this.receiver).T(th15);
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                Throwable th16 = (Throwable) obj;
                th16.getClass();
                ((xd70) this.receiver).T(th16);
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                Throwable th17 = (Throwable) obj;
                th17.getClass();
                ((xd70) this.receiver).T(th17);
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                Throwable th18 = (Throwable) obj;
                th18.getClass();
                ((xd70) this.receiver).T(th18);
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                Throwable th19 = (Throwable) obj;
                th19.getClass();
                ((xd70) this.receiver).T(th19);
                return Unit.f46060a;
            default:
                Throwable th20 = (Throwable) obj;
                th20.getClass();
                ((xd70) this.receiver).T(th20);
                return Unit.f46060a;
        }
    }
}
