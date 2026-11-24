package a;

import android.content.Context;
import android.gov.nist.core.Separators;
import android.view.View;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.authenticator.impl.navigation.AuthenticatorScreenFactoryImpl$registrationFailScreen$1;
import org.xplatform.limits_ne.api.domain.LimitNeGroupEnum;
import org.xplatform.registration_default.api.presentation.model.RegistrationDefaultScreenParams;
import org.xplatform.security.api.presentation.models.ConfirmSendEmailScreenParams;
import org.xplatform.security.impl.presentation.email.confirmation.screen.SendConfirmationEmailScreen;
import org.xplatform.security.impl.presentation.email.send_code.model.CheckEmailScreenParams;
import org.xplatform.security.impl.presentation.email.send_code.screen.CheckEmailCodeScreen;
import org.xplatform.uikit.components.chips.Chip;
import org.xplatform.uikit.components.lottie_empty.DSLottieEmptyContainer;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class h6c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f12524a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ h6c(v7c v7cVar, a6c a6cVar) {
        this.f12524a = (byte) 1;
        this.b = v7cVar;
        this.c = a6cVar;
    }

    /* JADX WARN: Code duplicated, block: B:265:0x0696  */
    /* JADX WARN: Code duplicated, block: B:279:0x06eb  */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String strA;
        String strA2;
        String str;
        i8r i8rVar;
        boolean z;
        double d;
        Double d2;
        String strA3;
        int i;
        String strA4;
        String strA5;
        x6q0 x6q0Var;
        String strA6;
        String strA7;
        i4 i4VarR0;
        wui0 wui0Var;
        String str2;
        boolean z2;
        Object value;
        yje yjeVar;
        byte b = this.f12524a;
        byte b2 = 16;
        yje yjeVar2 = null;
        Object obj2 = this.b;
        Object obj3 = this.c;
        switch (b) {
            case 0:
                we50 we50Var = (we50) obj3;
                v7c v7cVar = (v7c) obj2;
                k0w0 k0w0Var = (k0w0) obj;
                k0w0Var.getClass();
                if (j7c.f16033a[we50Var.ordinal()] == 1) {
                    k0w0Var.d();
                } else {
                    k0w0Var.c(v7cVar.o.G0(we50Var));
                }
                return Unit.f46060a;
            case 1:
                dmt dmtVar = ((v7c) obj2).E;
                gne0 gne0Var = q7f0.b;
                int i2 = ((a6c) obj3).i;
                gne0Var.getClass();
                ((k0w0) obj).c(dmtVar.a(new RegistrationDefaultScreenParams(gne0.c(i2))));
                return Unit.f46060a;
            case 2:
                Throwable th = (Throwable) obj;
                th.getClass();
                ((i9c) obj3).f(th, (vne) obj2);
                return Unit.f46060a;
            case 3:
                zac zacVar = (zac) obj3;
                Function1 function1 = (Function1) obj2;
                List list = (List) obj;
                list.getClass();
                Chip chip = (Chip) CollectionsKt.firstOrNull(list);
                if (chip != null) {
                    l4b l4bVar = (l4b) CollectionsKt.W(zacVar.a(chip), l4b.i);
                    if (l4bVar == null) {
                        l4bVar = l4b.ALL;
                    }
                    function1.invoke(l4bVar);
                }
                return Unit.f46060a;
            case 4:
                ctf0 ctf0Var = (ctf0) obj3;
                wrz wrzVar = (wrz) obj2;
                rdc rdcVar = (rdc) obj;
                rdcVar.getClass();
                ctf0Var.getClass();
                LimitNeGroupEnum limitNeGroupEnumM = q5x.M(wrzVar);
                int iOrdinal = limitNeGroupEnumM.ordinal();
                if (iOrdinal == 0) {
                    strA = ctf0Var.b.a(R.string.limits_choice_title, Arrays.copyOf(new Object[0], 0));
                } else if (iOrdinal == 1) {
                    strA = ctf0Var.b.a(R.string.limits_choice_title, Arrays.copyOf(new Object[0], 0));
                } else if (iOrdinal == 2) {
                    strA = ctf0Var.b.a(R.string.limits_chose_session_time, Arrays.copyOf(new Object[0], 0));
                } else if (iOrdinal == 3) {
                    strA = ctf0Var.b.a(R.string.select_period, Arrays.copyOf(new Object[0], 0));
                } else {
                    if (iOrdinal != 4) {
                        t9f.b();
                        return null;
                    }
                    strA = "";
                }
                int iOrdinal2 = limitNeGroupEnumM.ordinal();
                if (iOrdinal2 == 0 || iOrdinal2 == 1 || iOrdinal2 == 2) {
                    strA2 = ctf0Var.b.a(R.string.limits_bottom_sheet_description, Arrays.copyOf(new Object[0], 0));
                } else if (iOrdinal2 == 3) {
                    strA2 = ctf0Var.b.a(R.string.limits_self_exclusion_warning_title, Arrays.copyOf(new Object[0], 0));
                } else {
                    if (iOrdinal2 != 4) {
                        t9f.b();
                        return null;
                    }
                    strA2 = "";
                }
                double d3 = rdcVar.b;
                i8r i8rVar2 = rdcVar.c;
                String str3 = rdcVar.d;
                boolean z3 = rdcVar.e;
                double d4 = rdcVar.f;
                Double d5 = rdcVar.g;
                LimitNeGroupEnum limitNeGroupEnumM2 = q5x.M(wrzVar);
                LimitNeGroupEnum limitNeGroupEnum = LimitNeGroupEnum.SELF_EXCLUSION_LIMITS;
                if (limitNeGroupEnumM2 == limitNeGroupEnum) {
                    x6q0Var = null;
                    i = 0;
                } else {
                    DecimalFormat decimalFormat = new DecimalFormat("#.##");
                    if (d3 == 0.0d) {
                        str = "";
                    } else {
                        String str4 = decimalFormat.format(d3);
                        str4.getClass();
                        str = str4;
                    }
                    oki0 oki0Var = oki0.SESSION_TIME_LIMIT_7_DAY;
                    double d6 = (wrzVar == oki0Var || wrzVar == oki0.SESSION_TIME_LIMIT_30_DAY) ? d3 * 24.0d : d3;
                    boolean z4 = d6 == d4;
                    boolean z5 = d6 == (d5 != null ? d5.doubleValue() : 0.0d);
                    boolean z6 = z4;
                    if (i8rVar2 != null) {
                        h8r h8rVar = i8rVar2.b;
                        z = z3;
                        h8r h8rVar2 = i8rVar2.f14353a;
                        i8rVar = i8rVar2;
                        LimitNeGroupEnum limitNeGroupEnumM3 = q5x.M(wrzVar);
                        d = d4;
                        String strK = (limitNeGroupEnumM3 == limitNeGroupEnum || limitNeGroupEnumM3 == LimitNeGroupEnum.SESSION_TIME_LIMITS) ? "" : kng0.k(Separators.SP, h8rVar2.b);
                        d2 = d5;
                        double d7 = h8rVar.f12641a;
                        boolean z7 = d6 > d7;
                        double d8 = h8rVar2.f12641a;
                        boolean z8 = d6 < d8;
                        double d9 = d8;
                        DecimalFormat decimalFormat2 = new DecimalFormat("#.##");
                        if (wrzVar == oki0Var || wrzVar == oki0.SESSION_TIME_LIMIT_30_DAY) {
                            d9 /= 24.0d;
                        }
                        String strN = ohs0.n(decimalFormat2.format(d9), strK);
                        ge7 ge7Var = ge7.BET_LIMIT_1_DAY;
                        if (wrzVar == ge7Var || wrzVar == ge7.BET_LIMIT_7_DAY || wrzVar == ge7.BET_LIMIT_30_DAY || wrzVar == o7k.DEPOSIT_LIMIT_1_DAY || wrzVar == o7k.DEPOSIT_LIMIT_7_DAY || wrzVar == o7k.DEPOSIT_LIMIT_30_DAY) {
                            strA6 = ctf0Var.b.a(R.string.limits_min_sum, Arrays.copyOf(new Object[0], 0));
                        } else if (wrzVar == asz.b || wrzVar == g8i0.f10866a) {
                            strA6 = "";
                        } else {
                            if (wrzVar != oki0.SESSION_TIME_LIMIT_1_DAY) {
                                if (wrzVar == oki0Var || wrzVar == oki0.SESSION_TIME_LIMIT_30_DAY) {
                                    strA6 = ctf0Var.b.a(R.string.limits_min_days, Arrays.copyOf(new Object[0], 0));
                                } else {
                                    t9f.b();
                                }
                                return null;
                            }
                            strA6 = ctf0Var.b.a(R.string.limits_min_hours, Arrays.copyOf(new Object[0], 0));
                        }
                        strA3 = kng0.l(strA6, Separators.SP, strN);
                        String strN2 = ohs0.n(decimalFormat2.format((wrzVar == oki0Var || wrzVar == oki0.SESSION_TIME_LIMIT_30_DAY) ? d7 / 24.0d : d7), strK);
                        if (wrzVar == ge7Var || wrzVar == ge7.BET_LIMIT_7_DAY || wrzVar == ge7.BET_LIMIT_30_DAY || wrzVar == o7k.DEPOSIT_LIMIT_1_DAY || wrzVar == o7k.DEPOSIT_LIMIT_7_DAY || wrzVar == o7k.DEPOSIT_LIMIT_30_DAY) {
                            strA7 = ctf0Var.b.a(R.string.limits_max_sum, Arrays.copyOf(new Object[0], 0));
                        } else if (wrzVar == asz.b || wrzVar == g8i0.f10866a) {
                            strA7 = "";
                        } else {
                            if (wrzVar != oki0.SESSION_TIME_LIMIT_1_DAY) {
                                if (wrzVar == oki0Var || wrzVar == oki0.SESSION_TIME_LIMIT_30_DAY) {
                                    strA7 = ctf0Var.b.a(R.string.limits_max_days, Arrays.copyOf(new Object[0], 0));
                                } else {
                                    t9f.b();
                                }
                                return null;
                            }
                            strA7 = ctf0Var.b.a(R.string.limits_max_hours, Arrays.copyOf(new Object[0], 0));
                        }
                        String strL = kng0.l(strA7, Separators.SP, strN2);
                        if (d6 == 0.0d) {
                            strA3 = kng0.l(strN, " - ", strN2);
                        } else if (z7) {
                            strA3 = strL;
                        } else if (!z8) {
                            if (z6) {
                                strA3 = ctf0Var.b.a(R.string.limits_current_match_new_limit, Arrays.copyOf(new Object[0], 0));
                            } else if (z5) {
                                strA3 = ctf0Var.b.a(R.string.limits_pending_match_new_limit, Arrays.copyOf(new Object[0], 0));
                            } else if (z) {
                                strA3 = ctf0Var.b.a(R.string.limits_incorrect_day_week_month_condition, Arrays.copyOf(new Object[0], 0));
                            } else {
                                strA3 = kng0.l(strN, " - ", strN2);
                            }
                        }
                    } else {
                        i8rVar = i8rVar2;
                        z = z3;
                        d = d4;
                        d2 = d5;
                        if (d6 == 0.0d) {
                            strA3 = "";
                        } else if (z6) {
                            strA3 = ctf0Var.b.a(R.string.limits_current_match_new_limit, Arrays.copyOf(new Object[0], 0));
                        } else if (z5) {
                            strA3 = ctf0Var.b.a(R.string.limits_pending_match_new_limit, Arrays.copyOf(new Object[0], 0));
                        } else if (z) {
                            strA3 = ctf0Var.b.a(R.string.limits_incorrect_day_week_month_condition, Arrays.copyOf(new Object[0], 0));
                        } else {
                            strA3 = "";
                        }
                    }
                    s7q0 s7q0Var = new s7q0(strA3);
                    boolean zW = tdc.W(d3, d, d2, i8rVar, z, wrzVar);
                    if (wrzVar == ge7.BET_LIMIT_1_DAY || wrzVar == ge7.BET_LIMIT_7_DAY || wrzVar == ge7.BET_LIMIT_30_DAY || wrzVar == o7k.DEPOSIT_LIMIT_1_DAY || wrzVar == o7k.DEPOSIT_LIMIT_7_DAY || wrzVar == o7k.DEPOSIT_LIMIT_30_DAY) {
                        i = 0;
                        strA4 = ctf0Var.b.a(R.string.limits_enter_sum_with_currency_v2, Arrays.copyOf(new Object[]{str3}, 1));
                    } else {
                        if (wrzVar == oki0.SESSION_TIME_LIMIT_1_DAY) {
                            strA5 = ctf0Var.b.a(R.string.limits_enter_count_hours, Arrays.copyOf(new Object[0], 0));
                        } else if (wrzVar == oki0Var || wrzVar == oki0.SESSION_TIME_LIMIT_30_DAY) {
                            i = 0;
                            strA4 = ctf0Var.b.a(R.string.limits_enter_count_days, Arrays.copyOf(new Object[0], 0));
                        } else {
                            if (wrzVar != g8i0.f10866a && wrzVar != asz.b) {
                                t9f.b();
                                return null;
                            }
                            strA5 = "";
                        }
                        i = 0;
                        x6q0Var = new x6q0(str, o6q0.f24750a, s7q0Var, true, zW, new y5q0(9, null, null, 6), strA5, null, 0, 32000);
                    }
                    strA5 = strA4;
                    x6q0Var = new x6q0(str, o6q0.f24750a, s7q0Var, true, zW, new y5q0(9, null, null, 6), strA5, null, 0, 32000);
                }
                List list2 = rdcVar.f30283a;
                if (limitNeGroupEnumM == LimitNeGroupEnum.SESSION_TIME_LIMITS) {
                    i4VarR0 = lak0.c;
                } else {
                    ArrayList arrayList = new ArrayList(r3d.q(list2, 10));
                    Iterator it = list2.iterator();
                    int i3 = i;
                    while (it.hasNext()) {
                        Object next = it.next();
                        int i4 = i3 + 1;
                        if (i3 < 0) {
                            q3d.p();
                            throw null;
                        }
                        z85 z85Var = (z85) next;
                        long j = z85Var.f43950a;
                        String str5 = z85Var.b;
                        String str6 = z85Var.c;
                        List list3 = list2;
                        int size = list3.size();
                        Iterator it2 = it;
                        if (size == 1) {
                            wui0Var = wui0.f39793a;
                        } else if (i3 == 0) {
                            wui0Var = wui0.b;
                        } else {
                            wui0Var = i3 == size + (-1) ? wui0.d : wui0.c;
                        }
                        arrayList.add(new x95(j, str5, str6, wui0Var, ((double) z85Var.f43950a) == d3));
                        i3 = i4;
                        list2 = list3;
                        it = it2;
                    }
                    i4VarR0 = dyb.r0(arrayList);
                }
                return new sdc(strA, strA2, i4VarR0, x6q0Var, (tdc.W(rdcVar.b, rdcVar.f, rdcVar.g, rdcVar.c, rdcVar.e, wrzVar) || d3 == 0.0d) ? false : true, rdcVar.h);
            case 5:
                tec tecVar = (tec) obj3;
                List list4 = (List) obj;
                list4.getClass();
                return new mec(tecVar.b, dyb.r0(list4), new kec(!tecVar.f.isEmpty(), new mtl(dyb.g0(new itl(new wul(lul.e, oe9.f25112a, new ue9(((ctf0) obj2).b.a(R.string.apply_action, Arrays.copyOf(new Object[0], 0))), true, false, true), rk.k)))));
            case 6:
                hcz hczVar = (hcz) obj;
                hczVar.getClass();
                a4x a4xVar = ((gfc) obj3).b;
                hczVar.f(a4xVar.size(), null, new dx8(a4xVar, (byte) 11), new ugd(802480018, true, new vb(a4xVar, (Function1) obj2, b2)));
                return Unit.f46060a;
            case 7:
                hwv0 hwv0Var = (hwv0) obj3;
                i3t0 i3t0Var = (i3t0) obj2;
                dgc dgcVar = (dgc) obj;
                dgcVar.getClass();
                if (dgcVar instanceof bgc) {
                    hwv0Var.b();
                } else if ((dgcVar instanceof cgc) && hwv0Var.e.compareAndSet(false, true)) {
                    sje sjeVar = hwv0Var.d;
                    rwj rwjVar = tvk.f34603a;
                    sac.V(sjeVar, null, null, ys10.f43147a.x(), new wup0(hwv0Var, yjeVar2, (byte) 21), 11);
                }
                i3t0Var.x(kfc.f18188a);
                return Unit.f46060a;
            case 8:
                l7m0 l7m0Var = (l7m0) obj3;
                hcz hczVar2 = (hcz) obj;
                int i5 = esc.m2;
                hczVar2.getClass();
                a4x a4xVar2 = ((jsc) l7m0Var.getValue()).f17045a;
                hczVar2.f(a4xVar2.size(), new at7(new sfc((byte) 6), a4xVar2, (byte) 20), new wl0(a4xVar2, (byte) 16), new ugd(2039820996, true, new c8((List) a4xVar2, obj2, (Object) l7m0Var, (byte) 13)));
                return Unit.f46060a;
            case 9:
                ((View) obj).getClass();
                ((iz) obj3).invoke(((itc) ((cp) obj2).u()).c);
                return Unit.f46060a;
            case 10:
                Function0 function0 = (Function0) obj2;
                ((wgl0) obj).getClass();
                if (!((p7p) obj3).g) {
                    function0.invoke();
                }
                return Unit.f46060a;
            case 11:
                cp cpVar = (cp) obj;
                cpVar.getClass();
                cpVar.t(new l1d(cpVar, (z6e) obj3, (z6e) obj2));
                return Unit.f46060a;
            case 12:
                jkm jkmVar = (jkm) obj3;
                Function0 function2 = (Function0) obj2;
                DSLottieEmptyContainer dSLottieEmptyContainer = (DSLottieEmptyContainer) obj;
                dSLottieEmptyContainer.getClass();
                if (jkmVar != null) {
                    dSLottieEmptyContainer.b(jkm.a(jkmVar, function2), 10000L, new bmh((byte) 12));
                    dSLottieEmptyContainer.setVisibility(0);
                } else {
                    dSLottieEmptyContainer.setVisibility(8);
                }
                return Unit.f46060a;
            case 13:
                dk5 dk5Var = (dk5) obj3;
                Context context = (Context) obj;
                context.getClass();
                DSLottieEmptyContainer dSLottieEmptyContainer2 = new DSLottieEmptyContainer(context, null, 6);
                pk5 pk5Var = (pk5) ((pz40) obj2).getValue();
                pk5Var.getClass();
                dSLottieEmptyContainer2.b(jkm.a(((nk5) pk5Var).f23666a, new pw4(0, dk5Var, dk5.class, "onRefreshAfterError", "onRefreshAfterError()V", 0, (byte) 19)), 10000L, new bmh((byte) 12));
                dSLottieEmptyContainer2.setVisibility(0);
                return dSLottieEmptyContainer2;
            case 14:
                an4 an4Var = (an4) obj2;
                k0w0 k0w0Var2 = (k0w0) obj;
                k0w0Var2.getClass();
                rek0 rek0Var = ((svd) obj3).f;
                String message = an4Var.getMessage();
                str2 = message != null ? message : "";
                z2 = an4Var.c == i2o.AuthenticatorPartnerIsBlocked;
                rek0Var.getClass();
                k0w0Var2.k(new AuthenticatorScreenFactoryImpl$registrationFailScreen$1(str2, z2));
                return Unit.f46060a;
            case 15:
                an4 an4Var2 = (an4) obj2;
                k0w0 k0w0Var3 = (k0w0) obj;
                k0w0Var3.getClass();
                rek0 rek0Var2 = ((kyd) obj3).i;
                String message2 = an4Var2.getMessage();
                str2 = message2 != null ? message2 : "";
                z2 = an4Var2.c == i2o.AuthenticatorPartnerIsBlocked;
                rek0Var2.getClass();
                k0w0Var3.k(new AuthenticatorScreenFactoryImpl$registrationFailScreen$1(str2, z2));
                return Unit.f46060a;
            case 16:
                pfi0 pfi0Var = (pfi0) obj3;
                k0w0 k0w0Var4 = (k0w0) obj;
                k0w0Var4.getClass();
                k0w0Var4.h(new CheckEmailCodeScreen(new CheckEmailScreenParams.Registration(pfi0Var.b, pfi0Var.f26908a, ((ConfirmSendEmailScreenParams.Registration) obj2).f46933a)));
                return Unit.f46060a;
            case 17:
                pfi0 pfi0Var2 = (pfi0) obj3;
                k0w0 k0w0Var5 = (k0w0) obj;
                k0w0Var5.getClass();
                k0w0Var5.h(new CheckEmailCodeScreen(new CheckEmailScreenParams.RestorePassword(pfi0Var2.b, pfi0Var2.f26908a, ((ConfirmSendEmailScreenParams.RestorePassword) obj2).f46934a)));
                return Unit.f46060a;
            case 18:
                pfi0 pfi0Var3 = (pfi0) obj3;
                ConfirmSendEmailScreenParams.BindEmail bindEmail = (ConfirmSendEmailScreenParams.BindEmail) obj2;
                k0w0 k0w0Var6 = (k0w0) obj;
                k0w0Var6.getClass();
                k0w0Var6.h(new CheckEmailCodeScreen(new CheckEmailScreenParams.BindEmail(pfi0Var3.b, pfi0Var3.f26908a, bindEmail.f46932a, new SendConfirmationEmailScreen(bindEmail))));
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                g1e g1eVar = (g1e) obj3;
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                m7a m7aVar = (m7a) ((mie0) obj2).f21842a;
                p7m0 p7m0Var = g1eVar.B;
                do {
                    value = p7m0Var.getValue();
                    yjeVar = null;
                } while (!p7m0Var.m(value, r0e.a((r0e) value, false, null, null, 510)));
                sac.V(jiu0.a(g1eVar), x0e.f40067a, null, null, new ee0(th2, g1eVar, m7aVar, yjeVar, (byte) 26), 14);
                return Unit.f46060a;
            case 20:
                djz djzVar = (djz) obj3;
                t89 t89Var = (t89) obj2;
                g7z g7zVar = (g7z) obj;
                g7zVar.a();
                if (((Boolean) ((hgk0) djzVar.s).getValue()).booleanValue() || ((Boolean) ((hgk0) djzVar.t).getValue()).booleanValue()) {
                    fhl.r(g7zVar, t89Var, 0L, 0L, 0.0f, null, null, 0, 126);
                }
                return Unit.f46060a;
            case 21:
                jzj jzjVar = (jzj) obj3;
                bby bbyVar = (ndd) obj2;
                Throwable th3 = (Throwable) obj;
                jzjVar.getClass();
                bbyVar.getClass();
                if (th3 == null) {
                    ((odd) bbyVar).N(jzjVar.getCompleted());
                } else if (th3 instanceof CancellationException) {
                    ((pby) bbyVar).s((CancellationException) th3);
                } else {
                    ((odd) bbyVar).b0(th3);
                }
                return Unit.f46060a;
            case 22:
                tu9 tu9Var = (tu9) obj3;
                odd oddVar = (odd) obj2;
                Throwable th4 = (Throwable) obj;
                if (th4 == null) {
                    tu9Var.b(oddVar.B());
                } else if (th4 instanceof CancellationException) {
                    tu9Var.c();
                } else {
                    tu9Var.d(th4);
                }
                return Unit.f46060a;
            case 23:
                vpe vpeVar = (vpe) obj3;
                Throwable th5 = (Throwable) obj;
                th5.getClass();
                th5.getLocalizedMessage();
                vpeVar.i.o(null, i8d.e);
                vpeVar.f(th5, (vne) obj2);
                return Unit.f46060a;
            case 24:
                Long l = (Long) obj;
                l.getClass();
                ((mhc) obj3).invoke(Integer.valueOf(((ra8) ((cp) obj2).u()).f30121a), l);
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                Long l2 = (Long) obj;
                l2.getClass();
                ((mhc) obj3).invoke(Integer.valueOf(((ra8) ((cp) obj2).u()).f30121a), l2);
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ((View) obj).getClass();
                ((lya) obj3).invoke(Integer.valueOf(((lob) ((cp) obj2).u()).f20383a));
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                m0k0 m0k0Var = (m0k0) obj3;
                lq2 lq2Var = (lq2) obj2;
                n1g n1gVar = (n1g) obj;
                n1gVar.getClass();
                n1gVar.b(String.valueOf(m0k0Var.Y));
                long j2 = m0k0Var.f20959a;
                if (j2 == 40) {
                    j2 = m0k0Var.B;
                }
                n1gVar.c = j2;
                n1gVar.e = lq2Var;
                n1gVar.d = j2 == 40 ? j1g.REAL : j1g.SYNTHETIC;
                n1gVar.f = l1g.ADD_TO_COUPON;
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                m9s m9sVar = (m9s) obj3;
                lq2 lq2Var2 = (lq2) obj2;
                n1g n1gVar2 = (n1g) obj;
                n1gVar2.getClass();
                n1gVar2.b(String.valueOf(m9sVar.f21426a));
                long j3 = m9sVar.o;
                if (j3 == 40) {
                    j3 = m9sVar.p;
                }
                n1gVar2.c = j3;
                n1gVar2.e = lq2Var2;
                n1gVar2.d = j3 == 40 ? j1g.REAL : j1g.SYNTHETIC;
                n1gVar2.f = l1g.ADD_TO_COUPON;
                return Unit.f46060a;
            default:
                ((View) obj).getClass();
                ((z6e) obj3).invoke(Long.valueOf(((vte) ((cp) obj2).u()).Z));
                return Unit.f46060a;
        }
    }

    public /* synthetic */ h6c(Object obj, Object obj2, byte b) {
        this.f12524a = b;
        this.c = obj;
        this.b = obj2;
    }
}
