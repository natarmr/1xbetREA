package a;

import android.gov.nist.javax.sip.header.ParameterNames;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.wallet.impl.navigation.WalletsScreen$AddWalletScreen;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class pw4 extends rer implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f27693a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pw4(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.f27693a = b;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object value;
        Object value2;
        ql5 ql5Var;
        byte b = 3;
        byte b2 = 0;
        yje yjeVar = null;
        switch (this.f27693a) {
            case 0:
                return ((rw4) this.receiver).p0();
            case 1:
                ((fy4) this.receiver).D();
                return Unit.f46060a;
            case 2:
                ((dk5) this.receiver).N();
                return Unit.f46060a;
            case 3:
                bl5 bl5Var = (bl5) this.receiver;
                yk5 yk5Var = bl5.R1;
                ynb ynbVar = bl5Var.L1;
                if (ynbVar == null) {
                    Intrinsics.h("changeBalanceDialogProvider");
                    throw null;
                }
                bm5 bm5Var = bm5.g;
                androidx.fragment.app.e eVarC = bl5Var.C();
                eVarC.getClass();
                ynb.b(ynbVar, bm5Var, null, eVarC, false, "CHANGE_BALANCE_KEY", 494);
                return Unit.f46060a;
            case 4:
                ol5 ol5Var = (ol5) this.receiver;
                kl5 kl5Var = ol5.R1;
                ynb ynbVar2 = ol5Var.L1;
                if (ynbVar2 == null) {
                    Intrinsics.h("changeBalanceDialogProvider");
                    throw null;
                }
                bm5 bm5Var2 = bm5.g;
                androidx.fragment.app.e eVarC2 = ol5Var.C();
                eVarC2.getClass();
                ynb.b(ynbVar2, bm5Var2, null, eVarC2, false, "CHANGE_BALANCE_KEY", 494);
                return Unit.f46060a;
            case 5:
                po6 po6Var = (po6) this.receiver;
                po6Var.getClass();
                sac.V(jiu0.a(po6Var), new yj5(1, po6Var, po6.class, "emitShowSnackBarWithDefaultErrorMessage", "emitShowSnackBarWithDefaultErrorMessage(Ljava/lang/Throwable;)V", 0, (byte) 18), null, po6Var.D.b, new ko6(po6Var, yjeVar, b), 10);
                return Unit.f46060a;
            case 6:
                po6 po6Var2 = (po6) this.receiver;
                v88.b(po6Var2.A, po6Var2.E, 0L, 4);
                return Unit.f46060a;
            case 7:
                ((as6) this.receiver).C();
                return Unit.f46060a;
            case 8:
                ((as6) this.receiver).B();
                return Unit.f46060a;
            case 9:
                cb8 cb8Var = (cb8) this.receiver;
                boolean zA = cb8Var.a();
                cgk0 cgk0Var = cb8Var.h;
                if (zA) {
                    cgk0Var.m(cgk0Var.l() + 1);
                }
                return Unit.f46060a;
            case 10:
                ((yj8) this.receiver).w();
                return Unit.f46060a;
            case 11:
                p89 p89Var = (p89) this.receiver;
                p7m0 p7m0Var = p89Var.l;
                do {
                    value = p7m0Var.getValue();
                } while (!p7m0Var.m(value, b89.a((b89) value, true, true, false, false, null, false, 32607)));
                p89Var.z();
                return Unit.f46060a;
            case 12:
                p89 p89Var2 = (p89) this.receiver;
                p7m0 p7m0Var2 = p89Var2.l;
                do {
                    value2 = p7m0Var2.getValue();
                } while (!p7m0Var2.m(value2, b89.a((b89) value2, false, false, true, false, null, false, 32383)));
                p89Var2.y();
                return Unit.f46060a;
            case 13:
                p89 p89Var3 = (p89) this.receiver;
                bby bbyVar = p89Var3.o;
                if (bbyVar == null || !bbyVar.isActive()) {
                    p89Var3.o = sac.V(jiu0.a(p89Var3), n89.f23078a, null, p89Var3.d.c, new k89(p89Var3, yjeVar, b), 10);
                }
                return Unit.f46060a;
            case 14:
                mr9 mr9Var = (mr9) this.receiver;
                v3c.N(mr9Var.k);
                p7m0 p7m0Var3 = mr9Var.m;
                Boolean bool = Boolean.TRUE;
                p7m0Var3.getClass();
                p7m0Var3.o(null, bool);
                return Unit.f46060a;
            case 15:
                gob gobVar = (gob) this.receiver;
                bby bbyVar2 = gobVar.w;
                if ((bbyVar2 == null || !bbyVar2.isActive()) && (ql5Var = gobVar.v) != null) {
                    i8i.D("screen", "spoiler_bill_choise", gobVar.l.f14765a, "deposit_call");
                    l7k l7kVar = gobVar.r;
                    y1p y1pVar = y1p.MAIN;
                    l7kVar.b("spoiler_bill_choise", gobVar.s.g());
                    gobVar.w = sac.V(jiu0.a(gobVar), new znb(gobVar, (byte) 1), null, gobVar.o.c, new fob(gobVar, ql5Var, yjeVar, b2), 10);
                }
                return Unit.f46060a;
            case 16:
                gob gobVar2 = (gob) this.receiver;
                gobVar2.m.f44322a.c("create_bill_bottom_call");
                i1w0 i1w0Var = gobVar2.q;
                k0w0 k0w0VarI = cs0.i(i1w0Var, i1w0Var);
                gobVar2.p.getClass();
                k0w0VarI.h(new WalletsScreen$AddWalletScreen());
                ListIterator listIteratorO = b1j.o(i1w0Var, k0w0VarI.f17489a, 0);
                while (true) {
                    paw pawVar = (paw) listIteratorO;
                    if (!pawVar.hasNext()) {
                        return Unit.f46060a;
                    }
                    i1w0Var.a((oe50) pawVar.next());
                }
                break;
            case 17:
                return Boolean.valueOf(((on4) this.receiver).b());
            case 18:
                ((dk5) this.receiver).O();
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ((dk5) this.receiver).O();
                return Unit.f46060a;
            case 20:
                axe axeVar = (axe) this.receiver;
                kud kudVar = axe.e2;
                wdk0 wdk0Var = axeVar.U1;
                if (wdk0Var == null) {
                    Intrinsics.h("snackbarManager");
                    throw null;
                }
                pek0 pek0Var = pek0.f26859a;
                String strH = axeVar.H(R.string.auto_sub_info_message);
                strH.getClass();
                wdk0.k(wdk0Var, new xdk0(pek0Var, strH, null, null, null, null, 124), axeVar, null, axeVar.L0().f27859a, true, null, 996);
                return Unit.f46060a;
            case 21:
                ((r7f) this.receiver).R(q3f.f28050a);
                return Unit.f46060a;
            case 22:
                ((r7f) this.receiver).R(m3f.f21112a);
                return Unit.f46060a;
            case 23:
                ((r7f) this.receiver).x1 = true;
                return Unit.f46060a;
            case 24:
                r7f r7fVar = (r7f) this.receiver;
                i8i.D("action", ParameterNames.INFO, r7fVar.I0.f29324a, "express_boost_info_call");
                b1j.v(ParameterNames.INFO, r7fVar.K0.f40143a, 12216L);
                g0f g0fVarA = r7fVar.s0.a();
                r7fVar.R(new r3f(g0fVarA.o, g0fVarA.m));
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                r7f r7fVar2 = (r7f) this.receiver;
                et7 et7VarC = r7fVar2.C();
                r7fVar2.o0(true, et7VarC != null ? et7VarC.b : m2a.m);
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                r7f r7fVar3 = (r7f) this.receiver;
                i8i.D("action", "close", r7fVar3.I0.f29324a, "express_boost_info_call");
                r7fVar3.K0.f40143a.a(cui0.b(new j1p("close", (byte) 0)), 12216L);
                sac.V(jiu0.a(r7fVar3), k6f.f17766a, null, r7fVar3.Y0.b, new l6f(r7fVar3, yjeVar, b2), 10);
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                axe axeVar2 = (axe) this.receiver;
                kud kudVar2 = axe.e2;
                axeVar2.P0();
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ((r7f) this.receiver).b0();
                return Unit.f46060a;
            default:
                r7f r7fVar4 = (r7f) this.receiver;
                et7 et7VarC2 = r7fVar4.C();
                r7fVar4.o0(true, et7VarC2 != null ? et7VarC2.b : m2a.m);
                return Unit.f46060a;
        }
    }
}
