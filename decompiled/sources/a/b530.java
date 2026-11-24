package a;

import android.gov.nist.core.Separators;
import android.text.Editable;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.io.File;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.feature.fin_bet.impl.domain.model.FinBetInfoModel;
import org.xplatform.verification.status.impl.navigation.VerificationStatusScreens$VerificationStatusFragmentScreen;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class b530 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f1981a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b530(k050 k050Var, j050 j050Var) {
        this.f1981a = (byte) 14;
        this.b = k050Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r25v1, types: [java.lang.Throwable] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        lq8 lq8Var;
        String str;
        ub40 ub40Var;
        int i;
        char c;
        char c2;
        Object ue50Var;
        String strJ;
        String str2;
        byte b = this.f1981a;
        byte b2 = 21;
        int i2 = 10;
        byte b3 = 4;
        byte b4 = 6;
        yje yjeVar = null;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                cp cpVar = (cp) obj;
                cpVar.getClass();
                cpVar.f40887a.setOnClickListener(new wg(obj2, (Object) cpVar, (byte) 28));
                cpVar.t(new ctv(cpVar, cpVar, b4));
                return Unit.f46060a;
            case 1:
                Throwable th = (Throwable) obj;
                th.getClass();
                ((rg30) obj2).q.b(th, new ei20(b2));
                return Unit.f46060a;
            case 2:
                return ((g3) obj2).e(((Integer) obj).intValue());
            case 3:
                Editable editable = (Editable) obj;
                atz atzVar = ik30.W1;
                editable.getClass();
                zk30 zk30VarH0 = ((ik30) obj2).H0();
                String string = editable.toString();
                string.getClass();
                if (string.length() >= 3 || string.length() <= 0) {
                    bby bbyVar = zk30VarH0.r;
                    if (bbyVar != null) {
                        bbyVar.cancel(null);
                    }
                    zk30VarH0.r = sac.V(jiu0.a(zk30VarH0), yk30.f42769a, null, zk30VarH0.h.f22085a, new mq10(zk30VarH0, string, yjeVar, b2), 10);
                }
                return Unit.f46060a;
            case 4:
                ((Throwable) obj).getClass();
                ((zk30) obj2).y();
                return Unit.f46060a;
            case 5:
                fee feeVar = (fee) obj;
                feeVar.getClass();
                ky6 ky6Var = (ky6) feeVar.c();
                FinBetInfoModel finBetInfoModel = ((sg20) ((c69) obj2).o).f32140a;
                ky6Var.getClass();
                kd5 kd5Var = ky6Var.f19093a;
                td5 td5Var = new td5(kd5Var.f18089a, kd5Var.b);
                itv itvVar = new itv(false, false, "", 0, "", hye.c);
                iur iurVar = ky6Var.b;
                hy20 hy20Var = new hy20(iurVar.f15410a);
                String str3 = iurVar.b;
                pn40 pn40Var = pn40.f27267a;
                return new xy6(td5Var, itvVar, l580.f19441a, new c0s(hy20Var, new r5n0(str3, new o6q(pn40.j(iurVar.d, finBetInfoModel.g, false), finBetInfoModel.k ? ux3.UP : ux3.DOWN)), iurVar.c, wbs0.IS_NOT_VISIBLE, iho.f14789a), new g0d("", "", false), null);
            case 6:
                abi0 abi0Var = (abi0) obj;
                abi0Var.getClass();
                float f = ((jp30) obj2).h;
                if (f == 0.0f) {
                    lq8Var = lq8.f20474a;
                } else {
                    lq8Var = f == 1.0f ? lq8.c : lq8.b;
                }
                zai0 zai0Var = cbi0.f;
                iiy iiyVar = cbi0.f4063a[4];
                zai0Var.getClass();
                abi0Var.b(zai0Var, lq8Var);
                return Unit.f46060a;
            case 7:
                uag0 uag0Var = (uag0) obj;
                uag0Var.getClass();
                ba40 ba40Var = ((ia40) obj2).b;
                uag0Var.b((ba40Var.f.length() == 0 || ba40Var.d.length() == 0) ? 0.0f : 1.0f);
                return Unit.f46060a;
            case 8:
                hcz hczVar = (hcz) obj;
                hczVar.getClass();
                a4x a4xVar = ((ba40) obj2).h;
                byte b5 = 20;
                hczVar.f(a4xVar.size(), new ygy(new o240(b4), a4xVar, b5), new ap30(a4xVar, (byte) 10), new ugd(2039820996, true, new xy1(a4xVar, b5)));
                return Unit.f46060a;
            case 9:
                kc40 kc40Var = (kc40) obj2;
                xb40 xb40Var = (xb40) obj;
                uuz uuzVar = kc40.l2;
                xb40Var.getClass();
                vcc.f0(i120.V(new Pair("REQUEST_ROLE_RESULT_KEY", xb40Var)), kc40Var, "REQUEST_ROLE_RESULT_KEY");
                kc40Var.x0();
                return Unit.f46060a;
            case 10:
                gfg gfgVar = (gfg) obj2;
                List list = (List) obj;
                ctf0 ctf0Var = gfgVar.c;
                boolean z = ((yc40) gfgVar.g).f;
                ctf0Var.getClass();
                if (list == null) {
                    return iun.f15405a;
                }
                ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                Iterator it = list.iterator();
                int i3 = 0;
                while (it.hasNext()) {
                    Object next = it.next();
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        ?? r25 = yjeVar;
                        q3d.p();
                        throw r25;
                    }
                    qb40 qb40Var = (qb40) next;
                    String strI = f140.i(i3, qb40Var.b);
                    long j = qb40Var.f28431a;
                    String str4 = qb40Var.b;
                    yje yjeVar2 = yjeVar;
                    n0x n0xVar = new n0x(qb40Var.c);
                    List list2 = qb40Var.g.c;
                    boolean z2 = z;
                    ArrayList arrayList2 = new ArrayList(r3d.q(list2, i2));
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        uc40 uc40Var = (uc40) it2.next();
                        arrayList2.add(new ja40(new n0x(uc40Var.c), uc40Var.f35412a));
                        it2 = it2;
                        it = it;
                    }
                    Iterator it3 = it;
                    a4x a4xVarO0 = dyb.o0(arrayList2);
                    lsm0 lsm0Var = ctf0Var.b;
                    String strA = lsm0Var.a(R.string.statistic_info_rating, Arrays.copyOf(new Object[0], 0));
                    Integer numValueOf = Integer.valueOf(qb40Var.d);
                    Locale locale = Locale.US;
                    ctf0 ctf0Var2 = ctf0Var;
                    String str5 = new DecimalFormat("#.##", new DecimalFormatSymbols(locale)).format(numValueOf);
                    str5.getClass();
                    String strA2 = lsm0Var.a(R.string.win_rate, Arrays.copyOf(new Object[0], 0));
                    int i5 = qb40Var.e;
                    int i6 = qb40Var.f;
                    if (i5 <= 0) {
                        str = "";
                    } else {
                        str = new DecimalFormat("#.##%", new DecimalFormatSymbols(locale)).format(((double) i6) / ((double) i5));
                        str.getClass();
                    }
                    String strA3 = lsm0Var.a(R.string.cyber_skills_title, Arrays.copyOf(new Object[0], 0));
                    List list3 = qb40Var.h;
                    ArrayList arrayListU = twn.u(list3);
                    Iterator it4 = list3.iterator();
                    while (it4.hasNext()) {
                        Object next2 = it4.next();
                        gb40 gb40Var = (gb40) next2;
                        String str6 = str;
                        Iterator it5 = it4;
                        if (gb40Var.b >= 0 && gb40Var.d.d.length() > 0 && gb40Var.e.d.length() > 0) {
                            arrayListU.add(next2);
                        }
                        str = str6;
                        it4 = it5;
                    }
                    String str7 = str;
                    ArrayList arrayList3 = new ArrayList(r3d.q(arrayListU, 10));
                    Iterator it6 = arrayListU.iterator();
                    while (it6.hasNext()) {
                        gb40 gb40Var2 = (gb40) it6.next();
                        long j2 = j;
                        long j3 = gb40Var2.b;
                        hb40 hb40Var = gb40Var2.e;
                        String str8 = str4;
                        String str9 = gb40Var2.c;
                        yk5 yk5Var = mc6.b;
                        Iterator it7 = it6;
                        Integer numValueOf2 = Integer.valueOf(gb40Var2.f);
                        yk5Var.getClass();
                        byte b6 = yk5.d(numValueOf2).f21536a;
                        int i7 = i4;
                        String str10 = str7;
                        StringBuilder sb = new StringBuilder(ujn.h);
                        hb40 hb40Var2 = gb40Var2.d;
                        String str11 = (String) CollectionsKt.firstOrNull(hb40Var2.b);
                        if (str11 == null) {
                            str11 = "";
                        }
                        n0x n0xVar2 = n0xVar;
                        ub40 ub40Var2 = ub40Var;
                        if (str11.length() == 0) {
                            sb.setLength(0);
                        } else {
                            int i8 = 0;
                            if (StringsKt.O(str11, ujn.h, false)) {
                                sb.setLength(i8);
                                sb.append(str11);
                            } else if (kotlin.text.c.x(str11, "https://", false)) {
                                i8 = 0;
                                sb.setLength(i8);
                                sb.append(str11);
                            } else {
                                if (sb.length() <= 0 || StringsKt.S(sb, Separators.SLASH)) {
                                    i = 1;
                                    c = '/';
                                } else {
                                    sb.append('/');
                                    c = '/';
                                    i = 1;
                                }
                                char[] cArr = new char[i];
                                cArr[0] = c;
                                sb.append(StringsKt.y0(str11, cArr));
                            }
                        }
                        pa40 pa40Var = new pa40(new n0x(sb.toString()), hb40Var2.d, String.valueOf(hb40Var2.c), hb40Var2.e);
                        StringBuilder sb2 = new StringBuilder(ujn.h);
                        String str12 = (String) CollectionsKt.firstOrNull(hb40Var.b);
                        if (str12 == null) {
                            str12 = "";
                        }
                        if (str12.length() == 0) {
                            sb2.setLength(0);
                        } else {
                            int i9 = 0;
                            if (StringsKt.O(str12, ujn.h, false)) {
                                sb2.setLength(i9);
                                sb2.append(str12);
                            } else if (kotlin.text.c.x(str12, "https://", false)) {
                                i9 = 0;
                                sb2.setLength(i9);
                                sb2.append(str12);
                            } else {
                                if (sb2.length() <= 0 || StringsKt.S(sb2, Separators.SLASH)) {
                                    c2 = '/';
                                } else {
                                    c2 = '/';
                                    sb2.append('/');
                                }
                                sb2.append(StringsKt.y0(str12, c2));
                            }
                        }
                        arrayList3.add(new qa40(j3, str9, pa40Var, new pa40(new n0x(sb2.toString()), hb40Var.d, String.valueOf(hb40Var.c), hb40Var.e), b6, z2));
                        ub40Var = ub40Var2;
                        j = j2;
                        it6 = it7;
                        i4 = i7;
                        str4 = str8;
                        str7 = str10;
                        n0xVar = n0xVar2;
                    }
                    arrayList.add(new ub40(strI, new ka40(new ia40(j, new ba40(str4, n0xVar, strA, str5, strA2, str7, strA3, a4xVarO0, dyb.o0(arrayList3)), lsm0Var.a(R.string.cyber_live, Arrays.copyOf(new Object[0], 0))))));
                    it = it3;
                    z = z2;
                    yjeVar = yjeVar2;
                    ctf0Var = ctf0Var2;
                    i3 = i4;
                    i2 = 10;
                }
                return arrayList;
            case 11:
                abi0 abi0Var2 = (abi0) obj;
                abi0Var2.getClass();
                yai0.f(abi0Var2, ((rwm0) obj2).e);
                return Unit.f46060a;
            case 12:
                wl40 wl40Var = (wl40) obj2;
                wl40Var.show();
                return new ty2(wl40Var, (byte) 14);
            case 13:
                File file = (File) obj;
                file.getClass();
                return new lw40(((sje) obj2).f32300a, file);
            case 14:
                ((k050) obj2).c(null);
                return Unit.f46060a;
            case 15:
                rb50 rb50Var = (rb50) obj;
                rb50Var.getClass();
                ob50 ob50Var = (ob50) ((qzn) obj2).invoke(rb50Var);
                return new ob50(rb50Var, ob50Var.b, ob50Var.c, new ugd(1460009743, true, new p0z((Object) ob50Var, (byte) 18)));
            case 16:
                ((hgk0) ((gf50) obj2).f11192a).setValue((jf50) obj);
                return Unit.f46060a;
            case 17:
                lf50 lf50Var = (lf50) obj;
                lf50Var.getClass();
                vul0 vul0Var = new vul0((VerificationStatusScreens$VerificationStatusFragmentScreen) obj2);
                re50 re50Var = lf50Var.b;
                List list4 = lf50Var.f19938a;
                if (re50Var != null) {
                    return lf50.a(lf50Var, null, re50.d(re50Var, vul0Var, iun.f15405a, 1), null, 5);
                }
                Object objF0 = CollectionsKt.f0(list4);
                if (!(objF0 instanceof ve50)) {
                    objF0 = null;
                }
                ve50 ve50Var = (ve50) objF0;
                if (ve50Var == null) {
                    return lf50Var;
                }
                if (ve50Var instanceof se50) {
                    iun iunVar = iun.f15405a;
                    iunVar.getClass();
                    ue50Var = new se50(vul0Var, iunVar);
                } else if (ve50Var instanceof re50) {
                    ue50Var = re50.d((re50) ve50Var, vul0Var, iun.f15405a, 1);
                } else {
                    if (!(ve50Var instanceof ue50)) {
                        t9f.b();
                        return null;
                    }
                    ue50Var = new ue50(vul0Var);
                }
                return lf50.a(lf50Var, CollectionsKt.r0(CollectionsKt.P(1, list4), ue50Var), null, null, 6);
            case 18:
                mf50 mf50Var = (mf50) obj2;
                c8d c8dVar = (c8d) obj;
                c8dVar.getClass();
                g1w0 g1w0Var = c8dVar.b;
                if (g1w0Var != null) {
                    if (g1w0Var instanceof w0w0) {
                        strJ = mf50.f(((w0w0) g1w0Var).f38370a);
                        str2 = "Navigate(";
                    } else if (g1w0Var instanceof d1w0) {
                        strJ = mf50.f(((d1w0) g1w0Var).f5332a);
                        str2 = "Replace(";
                    } else if (g1w0Var instanceof y0w0) {
                        strJ = mf50.f(((y0w0) g1w0Var).f41827a);
                        str2 = "NewRoot(";
                    } else {
                        if (g1w0Var instanceof p0w0) {
                            return "Back";
                        }
                        if (g1w0Var instanceof q0w0) {
                            m7h0 m7h0Var = ((q0w0) g1w0Var).f27923a;
                            if (m7h0Var == null || (strJ = mf50.f(m7h0Var)) == null) {
                                strJ = "root";
                            }
                            str2 = "BackTo(";
                        } else {
                            if (g1w0Var instanceof r0w0) {
                                return "BackToAuthorization";
                            }
                            if (g1w0Var instanceof x0w0) {
                                strJ = CollectionsKt.b0(((x0w0) g1w0Var).f40092a, null, null, null, new mb50(mf50Var, b3), 31);
                                str2 = "NewChain(";
                            } else if (g1w0Var instanceof f1w0) {
                                strJ = mf50.f(((f1w0) g1w0Var).f8787a);
                                str2 = "StartChildChain(";
                            } else {
                                if (g1w0Var instanceof u0w0) {
                                    return "FinishChildChain";
                                }
                                if (g1w0Var instanceof v0w0) {
                                    return "FinishRoot";
                                }
                                if (g1w0Var instanceof z0w0) {
                                    strJ = mf50.f(((z0w0) g1w0Var).f43589a);
                                    str2 = "NewRootCurrentChildChain(";
                                } else if (g1w0Var instanceof s0w0) {
                                    strJ = mf50.f(((s0w0) g1w0Var).f31429a);
                                    str2 = "BackToOrNavigate(";
                                } else if (g1w0Var instanceof e1w0) {
                                    strJ = mf50.f(((e1w0) g1w0Var).f7058a);
                                    str2 = "Show(";
                                } else {
                                    if (g1w0Var instanceof t0w0) {
                                        return "DismissCurrent";
                                    }
                                    if (g1w0Var instanceof c1w0) {
                                        strJ = sre0.f32672a.b(((c1w0) g1w0Var).f3596a.getClass()).J();
                                        str2 = "OpenBottomSheet(";
                                    } else {
                                        if (g1w0Var instanceof n0w0) {
                                            return "OpenLogin";
                                        }
                                        if (g1w0Var instanceof o0w0) {
                                            return "OpenRegistration";
                                        }
                                        if (g1w0Var instanceof m0w0) {
                                            return "CompleteAuthorization";
                                        }
                                        if (g1w0Var instanceof l0w0) {
                                            return "CancelAuthorization";
                                        }
                                        if (g1w0Var instanceof a1w0) {
                                            return "Action";
                                        }
                                        if (g1w0Var instanceof b1w0) {
                                            return "SuspendAction";
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return kng0.l(str2, strJ, Separators.RPAREN);
                }
                t9f.b();
                return null;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return Boolean.valueOf(((sj50) obj).b == ((mu40) obj2));
            case 20:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                ((sq50) obj2).v.b(th2, new rj50(b3));
                return Unit.f46060a;
            case 21:
                bt5 bt5Var = (bt5) obj;
                wsz wszVar = wr50.S1;
                bt5Var.getClass();
                ut50 ut50Var = (ut50) ((wr50) obj2).M1.getValue();
                yo4 yo4Var = ut50Var.d;
                kj5 kj5Var = uo5.b;
                int i10 = bt5Var.f3165a;
                kj5Var.getClass();
                if (pt50.f27548a[kj5.f(i10).ordinal()] == 1) {
                    yo4Var.k();
                }
                yo4Var.c(String.valueOf(i10), "actions");
                ut50Var.e.k(Integer.valueOf(i10), y1p.ACTIONS);
                ut50Var.l.d(new rw40(ut50Var, bt5Var, (byte) 15));
                return Unit.f46060a;
            case 22:
                ((zr50) obj2).y = null;
                return Unit.f46060a;
            case 23:
                ((cs50) obj2).w = null;
                return Unit.f46060a;
            case 24:
                ut50 ut50Var2 = (ut50) obj2;
                Throwable th3 = (Throwable) obj;
                th3.getClass();
                boolean z3 = (th3 instanceof SocketTimeoutException) || (th3 instanceof UnknownHostException);
                p7m0 p7m0Var = ut50Var2.u;
                mt50 mt50Var = new mt50(sa10.b(ut50Var2.n, pb10.g, R.string.data_retrieval_error, 0, null, 28), z3);
                p7m0Var.getClass();
                p7m0Var.o(null, mt50Var);
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                Throwable th4 = (Throwable) obj;
                th4.getClass();
                ((wu50) obj2).A.b(th4, new rj50(b4));
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                uw50 uw50Var = (uw50) obj2;
                Throwable th5 = (Throwable) obj;
                th5.getClass();
                uw50Var.b.b(th5, new rj50((byte) 8));
                p7m0 p7m0Var2 = uw50Var.c;
                sw50 sw50Var = new sw50(sa10.b((sa10) uw50Var.h, pb10.g, R.string.data_retrieval_error, 0, null, 28));
                p7m0Var2.getClass();
                p7m0Var2.o(null, sw50Var);
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ((vy40) obj2).a((km40) obj);
                return Boolean.TRUE;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                i560 i560Var = (i560) obj;
                uuz uuzVar2 = w560.Q1;
                i560Var.getClass();
                ((w560) obj2).G0().x(i560Var);
                return Unit.f46060a;
            default:
                cmc cmcVar = (cmc) obj;
                cmcVar.getClass();
                List list5 = (List) ((g0o) obj2).c;
                list5.getClass();
                cmcVar.b = list5;
                return Unit.f46060a;
        }
    }

    public /* synthetic */ b530(Object obj, byte b) {
        this.f1981a = b;
        this.b = obj;
    }
}
