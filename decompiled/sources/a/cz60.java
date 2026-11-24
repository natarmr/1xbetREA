package a;

import android.widget.ProgressBar;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.core.navigation.dialog.DialogScreen;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesParentSectionModel;
import org.xplatform.cyber.section.api.home.CyberHomeParams;
import org.xplatform.cyber.section.impl.navigation.CyberGamesScreenFactoryImpl$homeScreen$1;
import org.xplatform.feature.dayexpress.impl.presentation.DayExpressScreen;
import org.xplatform.rules.impl.navigation.RulesScreenFactoryImpl$getContactsFragmentScreen$1;
import org.xplatform.security.impl.presentation.password.change.input_password.PasswordChangeViewModel$ScreenUiState;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class cz60 extends rer implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f5211a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cz60(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.f5211a = b;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object value;
        Object value2;
        Object value3;
        n7b0 n7b0Var;
        byte b = 2;
        yje yjeVar = null;
        final byte b2 = 1;
        final byte b3 = 0;
        switch (this.f5211a) {
            case 0:
                g670 g670Var = (g670) this.receiver;
                p7m0 p7m0Var = g670Var.E;
                do {
                    value = p7m0Var.getValue();
                } while (!p7m0Var.m(value, gz60.a((gz60) value, null, true, false, false, false, false, 509)));
                g670Var.D.f(q570.f28137a);
                return Unit.f46060a;
            case 1:
                ((g670) this.receiver).C(u570.f35082a);
                return Unit.f46060a;
            case 2:
                i1w0 i1w0Var = ((g670) this.receiver).c;
                CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
                ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0.f26173a), i1w0Var, copyOnWriteArrayListQ, 0);
                while (true) {
                    paw pawVar = (paw) listIteratorP;
                    if (!pawVar.hasNext()) {
                        return Unit.f46060a;
                    }
                    i1w0Var.a((oe50) pawVar.next());
                }
                break;
            case 3:
                ((to70) this.receiver).A();
                return Unit.f46060a;
            case 4:
                to70 to70Var = (to70) this.receiver;
                to70Var.getClass();
                sac.V(jiu0.a(to70Var), new gk70(1, to70Var, to70.class, "handleGameError", "handleGameError(Ljava/lang/Throwable;)V", 0, (byte) 11), null, to70Var.g.b, new gc1((Object) to70Var, yjeVar, (byte) 12), 10);
                return Unit.f46060a;
            case 5:
                ((Function0) this.receiver).invoke();
                return Unit.f46060a;
            case 6:
                c4m0 c4m0Var = ((aa80) this.receiver).v;
                if (c4m0Var != null) {
                    c4m0Var.cancel(null);
                }
                return Unit.f46060a;
            case 7:
                aa80 aa80Var = (aa80) this.receiver;
                bby bbyVar = aa80Var.x;
                if (bbyVar != null && bbyVar.isCancelled()) {
                    aa80Var.w();
                }
                return Unit.f46060a;
            case 8:
                fho0 fho0Var = (fho0) this.receiver;
                fho0Var.D0.f(new dgo0(((smu) fho0Var.a0.get()).a(), ((rmu) fho0Var.b0.get()).a()));
                return Unit.f46060a;
            case 9:
                return ((kc80) this.receiver).p0();
            case 10:
                rio0 rio0Var = (rio0) this.receiver;
                rio0Var.M0.f(new vho0(((smu) rio0Var.l0.get()).a(), ((rmu) rio0Var.m0.get()).a()));
                return Unit.f46060a;
            case 11:
                return ((xc80) this.receiver).p0();
            case 12:
                ((di80) this.receiver).d.u(new yh80(false, zh80.b));
                return Unit.f46060a;
            case 13:
                ((di80) this.receiver).d.u(new yh80(false, zh80.b));
                return Unit.f46060a;
            case 14:
                org.xplatform.security.impl.presentation.password.change.input_password.f fVar = (org.xplatform.security.impl.presentation.password.change.input_password.f) this.receiver;
                fVar.b.e("current_password_key", new PasswordChangeViewModel$ScreenUiState.PasswordInputted(((PasswordChangeViewModel$ScreenUiState) fVar.n.f40549a.getValue()).getF46956a()));
                return Unit.f46060a;
            case 15:
                s690 s690Var = (s690) this.receiver;
                if (!(s690Var.w.getValue() instanceof z590)) {
                    s690Var.y();
                    s690Var.x(s690Var.b);
                }
                return Unit.f46060a;
            case 16:
                o890 o890Var = (o890) this.receiver;
                jh70 jh70Var = o890.f2;
                ((ProgressBar) o890Var.K0().f.b).setVisibility(8);
                o890Var.K0().e.setText(o890Var.H(R.string.data_retrieval_error));
                o890Var.K0().b.setVisibility(0);
                siq fixedWebView = o890Var.K0().g.getFixedWebView();
                if (fixedWebView != null) {
                    fixedWebView.setVisibility(8);
                }
                return Unit.f46060a;
            case 17:
                p990 p990Var = (p990) this.receiver;
                p7m0 p7m0Var2 = p990Var.z;
                do {
                    value2 = p7m0Var2.getValue();
                } while (!p7m0Var2.m(value2, d990.f5690a));
                p990Var.C();
                p990Var.B();
                return Unit.f46060a;
            case 18:
                kk90 kk90Var = (kk90) this.receiver;
                kk90Var.u.H("bind_phone");
                kk90Var.p.d(new hj90(kk90Var, (byte) 3));
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ((kk90) this.receiver).u.H("cancel");
                return Unit.f46060a;
            case 20:
                ((kk90) this.receiver).E();
                return Unit.f46060a;
            case 21:
                kk90 kk90Var2 = (kk90) this.receiver;
                ywq0 ywq0Var = kk90Var2.u;
                ((vd1) ywq0Var.f43384a).f37210a.a("acc_add_phone_call", xp20.f(new Pair("screen", "acc_personal"), new Pair("element", "allert_activate_phone")));
                ((ik4) ywq0Var.g).f14907a.a(tx3.l0(new k1p[]{new j1p("acc_personal", (byte) 0), new j1p("allert_activate_phone", (byte) 1)}), 3231L);
                kk90Var2.p.d(new hj90(kk90Var2, (byte) 4));
                return Unit.f46060a;
            case 22:
                kk90 kk90Var3 = (kk90) this.receiver;
                i1w0 i1w0Var2 = kk90Var3.p;
                kk90Var3.u.F(ui90.CONTACTS);
                if (kk90Var3.z.A0) {
                    k0w0 k0w0VarI = cs0.i(i1w0Var2, i1w0Var2);
                    kk90Var3.w.getClass();
                    k0w0VarI.h(new RulesScreenFactoryImpl$getContactsFragmentScreen$1(false));
                    ListIterator listIteratorO = b1j.o(i1w0Var2, k0w0VarI.f17489a, 0);
                    while (true) {
                        paw pawVar2 = (paw) listIteratorO;
                        if (pawVar2.hasNext()) {
                            i1w0Var2.a((oe50) pawVar2.next());
                        }
                    }
                } else {
                    kk90Var3.x.j();
                    i1w0Var2.d(new hj90(kk90Var3, b));
                }
                return Unit.f46060a;
            case 23:
                ((kk90) this.receiver).u.F(ui90.CANCEL);
                return Unit.f46060a;
            case 24:
                final alv alvVar = ((sbb0) this.receiver).s;
                ouu ouuVar = alvVar.e;
                mne mneVar = alvVar.n;
                i1w0 i1w0Var3 = alvVar.g;
                switch (alvVar.d.b().ordinal()) {
                    case 0:
                        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
                        ListIterator listIteratorP2 = b1j.p(copyOnWriteArrayList, new c8d(y7d.f42146a, new a1w0(new ykv(alvVar, b2))), i1w0Var3, copyOnWriteArrayList, 0);
                        while (true) {
                            paw pawVar3 = (paw) listIteratorP2;
                            if (!pawVar3.hasNext()) {
                                alvVar.v(rkv.PAYMENT);
                            } else {
                                i1w0Var3.a((oe50) pawVar3.next());
                            }
                            break;
                        }
                        break;
                    case 1:
                        ouuVar.q(new za50(0, 7, 0L, 0L), true);
                        alvVar.v(rkv.HISTORY_BETS);
                        break;
                    case 2:
                        ouuVar.q(new ya50(0), false);
                        alvVar.v(rkv.FAVORITES);
                        break;
                    case 3:
                        FragmentScreen dayExpressScreen = new DayExpressScreen(false);
                        CopyOnWriteArrayList copyOnWriteArrayList2 = new CopyOnWriteArrayList();
                        if (dayExpressScreen instanceof DialogScreen) {
                            copyOnWriteArrayList2.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) dayExpressScreen)));
                        } else {
                            copyOnWriteArrayList2.add(new c8d(y7d.f42146a, new w0w0(dayExpressScreen)));
                        }
                        ListIterator listIteratorO2 = b1j.o(i1w0Var3, copyOnWriteArrayList2, 0);
                        while (true) {
                            paw pawVar4 = (paw) listIteratorO2;
                            if (!pawVar4.hasNext()) {
                                alvVar.v(rkv.EXPRESS);
                            } else {
                                i1w0Var3.a((oe50) pawVar4.next());
                            }
                            break;
                        }
                        break;
                    case 4:
                        sac.V(jiu0.a(alvVar.s()), new umu((byte) 9), null, mneVar.f22085a, new cin(alvVar, yjeVar, (byte) 16), 10);
                        i1w0Var3.d(new Function1() { // from class: a.zkv
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                byte b4 = b2;
                                alv alvVar2 = alvVar;
                                k0w0 k0w0Var = (k0w0) obj;
                                switch (b4) {
                                    case 0:
                                        k0w0Var.getClass();
                                        k0w0Var.h(alvVar2.i.q(new hr1(0L, 3)));
                                        break;
                                    default:
                                        k0w0Var.getClass();
                                        k0w0Var.h(new CyberGamesScreenFactoryImpl$homeScreen$1(alvVar2.j, new CyberHomeParams(CyberGamesPage.Real.INSTANCE, CyberGamesParentSectionModel.FromMain.INSTANCE)));
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        });
                        alvVar.v(rkv.CYBER_SPORT);
                        break;
                    case 5:
                        sac.V(jiu0.a(alvVar.s()), new vft(1, alvVar.l, duj.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 12), null, mneVar.f22085a, new u5u(alvVar, new ykv(alvVar, b3), yjeVar, (byte) 11), 10);
                        break;
                    case 6:
                        i1w0Var3.d(new Function1() { // from class: a.zkv
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                byte b4 = b3;
                                alv alvVar2 = alvVar;
                                k0w0 k0w0Var = (k0w0) obj;
                                switch (b4) {
                                    case 0:
                                        k0w0Var.getClass();
                                        k0w0Var.h(alvVar2.i.q(new hr1(0L, 3)));
                                        break;
                                    default:
                                        k0w0Var.getClass();
                                        k0w0Var.h(new CyberGamesScreenFactoryImpl$homeScreen$1(alvVar2.j, new CyberHomeParams(CyberGamesPage.Real.INSTANCE, CyberGamesParentSectionModel.FromMain.INSTANCE)));
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        });
                        alvVar.v(rkv.SLOTS);
                        break;
                    default:
                        t9f.b();
                        return null;
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                p7m0 p7m0Var3 = ((sbb0) this.receiver).D0;
                do {
                    value3 = p7m0Var3.getValue();
                    n7b0Var = (n7b0) value3;
                } while (!p7m0Var3.m(value3, n7b0.a(n7b0Var, null, null, oz60.a(n7b0Var.c, pd00.f26783a, null, null, 30), null, 11)));
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                g9b0 g9b0Var = (g9b0) this.receiver;
                g9b0Var.G(Intrinsics.d(g9b0Var.S.getValue(), m8b0.f21362a));
                g9b0Var.A(s8b0.f31793a);
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ((g9b0) this.receiver).H();
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                org.xplatform.personal.impl.presentation.edit.n nVar = (org.xplatform.personal.impl.presentation.edit.n) this.receiver;
                nVar.getClass();
                nVar.D(new g2c0(false));
                return Unit.f46060a;
            default:
                org.xplatform.personal.impl.presentation.edit.n nVar2 = (org.xplatform.personal.impl.presentation.edit.n) this.receiver;
                if (nVar2.t == 0 || nVar2.B().hashCode() == nVar2.t) {
                    nVar2.C();
                } else {
                    nVar2.D(h2c0.f12324a);
                }
                return Unit.f46060a;
        }
    }
}
