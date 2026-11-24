package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.registration_default.impl.presentation.udf.state.models.fields.CitizenshipStateModel;
import org.xplatform.registration_default.impl.presentation.udf.state.models.fields.DocumentStateModel;

/* JADX INFO: loaded from: classes3.dex */
public final class ng1 implements v6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f23462a = 1;
    public final ctf0 b;
    public final n0o0 c;
    public final n0o0 d;
    public final n0o0 e;
    public final n0o0 f;
    public final n0o0 g;
    public final n0o0 h;
    public final n0o0 i;
    public final n0o0 j;
    public final n0o0 k;
    public final n0o0 l;
    public final n0o0 m;
    public final n0o0 n;
    public final n0o0 o;
    public final n0o0 p;
    public final n0o0 q;
    public final n0o0 r;
    public final n0o0 s;
    public final n0o0 t;
    public final Object u;

    public ng1(pf1 pf1Var, ctf0 ctf0Var) {
        final byte b = 0;
        ctf0Var.getClass();
        this.b = ctf0Var;
        n0o0 n0o0VarH = bkb.H(pf1Var.A);
        this.c = n0o0VarH;
        n0o0 n0o0VarH2 = bkb.H(pf1Var.y);
        this.d = n0o0VarH2;
        n0o0 n0o0VarH3 = bkb.H(pf1Var.B);
        this.e = n0o0VarH3;
        n0o0 n0o0VarH4 = bkb.H(pf1Var.x);
        this.f = n0o0VarH4;
        n0o0 n0o0VarH5 = bkb.H(pf1Var.z);
        this.g = n0o0VarH5;
        n0o0 n0o0VarH6 = bkb.H(pf1Var.C);
        this.h = n0o0VarH6;
        this.i = bkb.H(pf1Var.F);
        n0o0 n0o0VarH7 = bkb.H(Boolean.valueOf(pf1Var.r));
        this.j = n0o0VarH7;
        this.k = bkb.H(Boolean.valueOf(pf1Var.v));
        n0o0 n0o0VarH8 = bkb.H(Integer.valueOf(pf1Var.w));
        this.l = maz.b(new yw9((fee) bkb.H(Boolean.valueOf(pf1Var.G)).getValue(), new Function1(this) { // from class: a.lg1
            public final /* synthetic */ ng1 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:183:0x0695  */
            /* JADX WARN: Code duplicated, block: B:193:0x06ab  */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                ozh lzhVar;
                ozh izhVar;
                ozh lzhVar2;
                char c;
                char c2;
                String strA;
                char c3;
                char c4;
                char c5;
                char c6;
                mzb0 mzb0VarA;
                char c7;
                char c8;
                char c9;
                char c10;
                byte b2 = b;
                ng1 ng1Var = this.b;
                switch (b2) {
                    case 0:
                        n0o0 n0o0Var = ng1Var.s;
                        n0o0 n0o0Var2 = ng1Var.t;
                        ((fee) obj).getClass();
                        lc00 lc00VarB = kotlin.collections.a.b();
                        n0o0 n0o0Var3 = (n0o0) ng1Var.u;
                        lc00VarB.add(((fee) n0o0Var3.getValue()).b());
                        n0o0 n0o0Var4 = ng1Var.q;
                        lc00VarB.add(((fee) n0o0Var4.getValue()).b());
                        if (((fee) n0o0Var3.getValue()).b() != null || ((fee) n0o0Var4.getValue()).b() != null || ((fee) n0o0Var2.getValue()).b() != null || ((fee) n0o0Var.getValue()).b() != null) {
                            lc00VarB.add(((fee) n0o0Var2.getValue()).b());
                            lc00VarB.add(((fee) ng1Var.r.getValue()).b());
                            lc00VarB.add(((fee) ng1Var.p.getValue()).b());
                        }
                        lc00VarB.add(((fee) n0o0Var.getValue()).b());
                        return dyb.o0(CollectionsKt.S(kotlin.collections.a.a(lc00VarB)));
                    default:
                        ((fee) obj).getClass();
                        w2j w2jVar = (w2j) ((fee) ng1Var.h.getValue()).c();
                        ctf0 ctf0Var2 = ng1Var.b;
                        w2jVar.getClass();
                        ctf0Var2.getClass();
                        if (w2jVar instanceof t2j) {
                            d3j d3jVar = ((t2j) w2jVar).f33217a;
                            if (d3jVar instanceof a3j) {
                                lsm0 lsm0Var = ctf0Var2.b;
                                String strA2 = lsm0Var.a(R.string.daily_task_title, Arrays.copyOf(new Object[0], 0));
                                String strA3 = lsm0Var.a(R.string.daily_task_widget_no_task_available_title, Arrays.copyOf(new Object[0], 0));
                                String strA4 = lsm0Var.a(R.string.daily_task_widget_task_available_title, Arrays.copyOf(new Object[0], 0));
                                String strA5 = lsm0Var.a(R.string.daily_task_widget_no_task_available_title, Arrays.copyOf(new Object[0], 0));
                                String strA6 = lsm0Var.a(R.string.daily_task_widget_task_available_subtitle, Arrays.copyOf(new Object[0], 0));
                                String strA7 = lsm0Var.a(R.string.daily_task_widget_no_task_available, Arrays.copyOf(new Object[0], 0));
                                String strA8 = lsm0Var.a(R.string.daily_task_button_text_game, Arrays.copyOf(new Object[0], 0));
                                String strA9 = lsm0Var.a(R.string.daily_task_button_text_participate, Arrays.copyOf(new Object[0], 0));
                                String strA10 = lsm0Var.a(R.string.daily_task_widget_open_tasks, Arrays.copyOf(new Object[0], 0));
                                StringBuilder sb = new StringBuilder(ujn.h);
                                if (StringsKt.O("/static/img/android/casino/daily_challenge/widget/daily_default.webp", ujn.h, false) || kotlin.text.c.x("/static/img/android/casino/daily_challenge/widget/daily_default.webp", "https://", false)) {
                                    sb.setLength(0);
                                    sb.append("/static/img/android/casino/daily_challenge/widget/daily_default.webp");
                                } else {
                                    if (sb.length() <= 0 || StringsKt.S(sb, Separators.SLASH)) {
                                        c10 = '/';
                                    } else {
                                        c10 = '/';
                                        sb.append('/');
                                    }
                                    sb.append(StringsKt.y0("/static/img/android/casino/daily_challenge/widget/daily_default.webp", c10));
                                }
                                n0x n0xVar = new n0x(sb.toString());
                                StringBuilder sb2 = new StringBuilder(ujn.h);
                                if (StringsKt.O("/static/img/android/casino/daily_challenge/widget/daily_calendar.webp", ujn.h, false) || kotlin.text.c.x("/static/img/android/casino/daily_challenge/widget/daily_calendar.webp", "https://", false)) {
                                    sb2.setLength(0);
                                    sb2.append("/static/img/android/casino/daily_challenge/widget/daily_calendar.webp");
                                } else {
                                    if (sb2.length() <= 0 || StringsKt.S(sb2, Separators.SLASH)) {
                                        c9 = '/';
                                    } else {
                                        c9 = '/';
                                        sb2.append('/');
                                    }
                                    sb2.append(StringsKt.y0("/static/img/android/casino/daily_challenge/widget/daily_calendar.webp", c9));
                                }
                                lzhVar = new lzh(strA2, strA3, strA5, strA4, strA6, strA7, strA8, strA9, strA10, n0xVar, new n0x(sb2.toString()), lsm0Var.a(R.string.daily_task_done_tag, Arrays.copyOf(new Object[0], 0)), true, true);
                                izhVar = lzhVar;
                                if (izhVar != null) {
                                    return new bg1(izhVar);
                                }
                            } else {
                                if (d3jVar instanceof x2j) {
                                    n85 n85Var = ((x2j) d3jVar).f40170a;
                                    lsm0 lsm0Var2 = ctf0Var2.b;
                                    String strA11 = lsm0Var2.a(R.string.daily_task_title, Arrays.copyOf(new Object[0], 0));
                                    suo0 suo0Var = n85Var.l;
                                    sba0 sba0Var = n85Var.h;
                                    huo0 huo0Var = n85Var.k;
                                    String strK = wpm0.k(ctf0Var2, suo0Var);
                                    String strA12 = lsm0Var2.a(R.string.daily_task_title, Arrays.copyOf(new Object[0], 0));
                                    String strA13 = lsm0Var2.a(R.string.daily_task_widget_task_available_title, Arrays.copyOf(new Object[0], 0));
                                    String strA14 = lsm0Var2.a(R.string.daily_task_widget_no_task_available_title, Arrays.copyOf(new Object[0], 0));
                                    String strQ = gnm0.q(ctf0Var2, sba0Var, huo0Var, n85Var.l);
                                    String strA15 = lsm0Var2.a(R.string.daily_task_widget_task_available_subtitle, Arrays.copyOf(new Object[0], 0));
                                    String strA16 = lsm0Var2.a(R.string.daily_task_widget_no_task_available, Arrays.copyOf(new Object[0], 0));
                                    String strA17 = lsm0Var2.a(R.string.daily_task_button_text_game, Arrays.copyOf(new Object[0], 0));
                                    String strA18 = lsm0Var2.a(R.string.daily_task_button_text_participate, Arrays.copyOf(new Object[0], 0));
                                    String strA19 = lsm0Var2.a(R.string.daily_task_widget_open_tasks, Arrays.copyOf(new Object[0], 0));
                                    StringBuilder sb3 = new StringBuilder(ujn.h);
                                    if (StringsKt.O("/static/img/android/casino/daily_challenge/widget/daily_default.webp", ujn.h, false) || kotlin.text.c.x("/static/img/android/casino/daily_challenge/widget/daily_default.webp", "https://", false)) {
                                        sb3.setLength(0);
                                        sb3.append("/static/img/android/casino/daily_challenge/widget/daily_default.webp");
                                    } else {
                                        if (sb3.length() <= 0 || StringsKt.S(sb3, Separators.SLASH)) {
                                            c8 = '/';
                                        } else {
                                            c8 = '/';
                                            sb3.append('/');
                                        }
                                        sb3.append(StringsKt.y0("/static/img/android/casino/daily_challenge/widget/daily_default.webp", c8));
                                    }
                                    n0x n0xVar2 = new n0x(sb3.toString());
                                    StringBuilder sb4 = new StringBuilder(ujn.h);
                                    if (StringsKt.O("/static/img/android/casino/daily_challenge/widget/daily_calendar.webp", ujn.h, false) || kotlin.text.c.x("/static/img/android/casino/daily_challenge/widget/daily_calendar.webp", "https://", false)) {
                                        sb4.setLength(0);
                                        sb4.append("/static/img/android/casino/daily_challenge/widget/daily_calendar.webp");
                                    } else {
                                        if (sb4.length() <= 0 || StringsKt.S(sb4, Separators.SLASH)) {
                                            c7 = '/';
                                        } else {
                                            c7 = '/';
                                            sb4.append('/');
                                        }
                                        sb4.append(StringsKt.y0("/static/img/android/casino/daily_challenge/widget/daily_calendar.webp", c7));
                                    }
                                    n0x n0xVar3 = new n0x(sb4.toString());
                                    String strA20 = lsm0Var2.a(R.string.daily_task_done_tag, Arrays.copyOf(new Object[0], 0));
                                    String strB0 = bfb.b0(huo0Var);
                                    String strZ = bfb.Z(huo0Var);
                                    int i = (int) n85Var.j;
                                    String strA0 = bfb.a0(huo0Var);
                                    ddk ddkVar = qll.f28939a;
                                    Integer numValueOf = Integer.valueOf(sba0Var.f31923a);
                                    ddkVar.getClass();
                                    qll qllVarQ = ddk.q(numValueOf);
                                    aet aetVar = huo0Var instanceof aet ? (aet) huo0Var : null;
                                    izhVar = new izh(strA11, strK, strA12, strA14, strA13, strQ, strA15, strA16, strA17, strA18, strA19, n0xVar2, n0xVar3, strA20, strB0, strZ, i, strA0, qllVarQ, (aetVar == null || (mzb0VarA = aetVar.a()) == null) ? 0L : mzb0VarA.f22646a);
                                } else {
                                    if (d3jVar instanceof y2j) {
                                        n85 n85Var2 = ((y2j) d3jVar).f41906a;
                                        lsm0 lsm0Var3 = ctf0Var2.b;
                                        String strA21 = lsm0Var3.a(R.string.daily_task_title, Arrays.copyOf(new Object[0], 0));
                                        String strK2 = wpm0.k(ctf0Var2, n85Var2.l);
                                        String strA22 = lsm0Var3.a(R.string.daily_task_title, Arrays.copyOf(new Object[0], 0));
                                        String strA23 = lsm0Var3.a(R.string.daily_task_widget_task_available_title, Arrays.copyOf(new Object[0], 0));
                                        String strA24 = lsm0Var3.a(R.string.daily_task_widget_no_task_available_title, Arrays.copyOf(new Object[0], 0));
                                        String strQ2 = gnm0.q(ctf0Var2, n85Var2.h, n85Var2.k, n85Var2.l);
                                        String strA25 = lsm0Var3.a(R.string.daily_task_widget_task_available_subtitle, Arrays.copyOf(new Object[0], 0));
                                        String strA26 = lsm0Var3.a(R.string.daily_task_widget_no_task_available, Arrays.copyOf(new Object[0], 0));
                                        String strA27 = lsm0Var3.a(R.string.daily_task_button_text_game, Arrays.copyOf(new Object[0], 0));
                                        String strA28 = lsm0Var3.a(R.string.daily_task_button_text_participate, Arrays.copyOf(new Object[0], 0));
                                        String strA29 = lsm0Var3.a(R.string.daily_task_widget_open_tasks, Arrays.copyOf(new Object[0], 0));
                                        StringBuilder sb5 = new StringBuilder(ujn.h);
                                        if (StringsKt.O("/static/img/android/casino/daily_challenge/widget/daily_default.webp", ujn.h, false) || kotlin.text.c.x("/static/img/android/casino/daily_challenge/widget/daily_default.webp", "https://", false)) {
                                            sb5.setLength(0);
                                            sb5.append("/static/img/android/casino/daily_challenge/widget/daily_default.webp");
                                        } else {
                                            if (sb5.length() <= 0 || StringsKt.S(sb5, Separators.SLASH)) {
                                                c6 = '/';
                                            } else {
                                                c6 = '/';
                                                sb5.append('/');
                                            }
                                            sb5.append(StringsKt.y0("/static/img/android/casino/daily_challenge/widget/daily_default.webp", c6));
                                        }
                                        n0x n0xVar4 = new n0x(sb5.toString());
                                        StringBuilder sb6 = new StringBuilder(ujn.h);
                                        if (StringsKt.O("/static/img/android/casino/daily_challenge/widget/daily_calendar.webp", ujn.h, false) || kotlin.text.c.x("/static/img/android/casino/daily_challenge/widget/daily_calendar.webp", "https://", false)) {
                                            sb6.setLength(0);
                                            sb6.append("/static/img/android/casino/daily_challenge/widget/daily_calendar.webp");
                                        } else {
                                            if (sb6.length() <= 0 || StringsKt.S(sb6, Separators.SLASH)) {
                                                c5 = '/';
                                            } else {
                                                c5 = '/';
                                                sb6.append('/');
                                            }
                                            sb6.append(StringsKt.y0("/static/img/android/casino/daily_challenge/widget/daily_calendar.webp", c5));
                                        }
                                        lzhVar2 = new kzh(strA21, strK2, strA22, strA24, strA23, strQ2, strA25, strA26, strA27, strA28, strA29, n0xVar4, new n0x(sb6.toString()), lsm0Var3.a(R.string.daily_task_done_tag, Arrays.copyOf(new Object[0], 0)), n85Var2.e);
                                    } else if (d3jVar instanceof z2j) {
                                        z6w z6wVar = ((z2j) d3jVar).f43671a;
                                        lsm0 lsm0Var4 = ctf0Var2.b;
                                        String strA30 = lsm0Var4.a(R.string.daily_task_title, Arrays.copyOf(new Object[0], 0));
                                        suo0 suo0Var2 = z6wVar.c;
                                        huo0 huo0Var2 = z6wVar.b;
                                        String strK3 = wpm0.k(ctf0Var2, suo0Var2);
                                        String strA31 = lsm0Var4.a(R.string.daily_task_title, Arrays.copyOf(new Object[0], 0));
                                        String strA32 = lsm0Var4.a(R.string.daily_task_widget_task_available_title, Arrays.copyOf(new Object[0], 0));
                                        String strA33 = lsm0Var4.a(R.string.daily_task_widget_no_task_available_title, Arrays.copyOf(new Object[0], 0));
                                        suo0 suo0Var3 = z6wVar.c;
                                        if (suo0Var3 instanceof ouo0) {
                                            pn40 pn40Var = pn40.f27267a;
                                            ouo0 ouo0Var = (ouo0) suo0Var3;
                                            strA = lsm0Var4.a(R.string.daily_task_prize_description_bonus, Arrays.copyOf(new Object[]{"\u200e".concat(pn40.i(ouo0Var.f25886a, 2)), ouo0Var.b}, 2));
                                        } else if (suo0Var3 instanceof puo0) {
                                            pn40 pn40Var2 = pn40.f27267a;
                                            strA = lsm0Var4.a(R.string.daily_task_prize_description_frsp, Arrays.copyOf(new Object[]{"\u200e".concat(pn40.i(((puo0) suo0Var3).f27627a, 0))}, 1));
                                        } else {
                                            strA = lsm0Var4.a(R.string.empty_str, Arrays.copyOf(new Object[0], 0));
                                        }
                                        String str = strA;
                                        String strA34 = lsm0Var4.a(R.string.daily_task_widget_task_available_subtitle, Arrays.copyOf(new Object[0], 0));
                                        String strA35 = lsm0Var4.a(R.string.daily_task_widget_no_task_available, Arrays.copyOf(new Object[0], 0));
                                        String strA36 = lsm0Var4.a(R.string.daily_task_button_text_game, Arrays.copyOf(new Object[0], 0));
                                        String strA37 = lsm0Var4.a(R.string.daily_task_button_text_participate, Arrays.copyOf(new Object[0], 0));
                                        String strA38 = lsm0Var4.a(R.string.daily_task_widget_open_tasks, Arrays.copyOf(new Object[0], 0));
                                        StringBuilder sb7 = new StringBuilder(ujn.h);
                                        if (StringsKt.O("/static/img/android/casino/daily_challenge/widget/daily_default.webp", ujn.h, false) || kotlin.text.c.x("/static/img/android/casino/daily_challenge/widget/daily_default.webp", "https://", false)) {
                                            sb7.setLength(0);
                                            sb7.append("/static/img/android/casino/daily_challenge/widget/daily_default.webp");
                                        } else {
                                            if (sb7.length() <= 0 || StringsKt.S(sb7, Separators.SLASH)) {
                                                c4 = '/';
                                            } else {
                                                c4 = '/';
                                                sb7.append('/');
                                            }
                                            sb7.append(StringsKt.y0("/static/img/android/casino/daily_challenge/widget/daily_default.webp", c4));
                                        }
                                        n0x n0xVar5 = new n0x(sb7.toString());
                                        StringBuilder sb8 = new StringBuilder(ujn.h);
                                        if (StringsKt.O("/static/img/android/casino/daily_challenge/widget/daily_calendar.webp", ujn.h, false) || kotlin.text.c.x("/static/img/android/casino/daily_challenge/widget/daily_calendar.webp", "https://", false)) {
                                            sb8.setLength(0);
                                            sb8.append("/static/img/android/casino/daily_challenge/widget/daily_calendar.webp");
                                        } else {
                                            if (sb8.length() <= 0 || StringsKt.S(sb8, Separators.SLASH)) {
                                                c3 = '/';
                                            } else {
                                                c3 = '/';
                                                sb8.append('/');
                                            }
                                            sb8.append(StringsKt.y0("/static/img/android/casino/daily_challenge/widget/daily_calendar.webp", c3));
                                        }
                                        lzhVar2 = new jzh(strA30, strK3, strA31, strA33, strA32, str, strA34, strA35, strA36, strA37, strA38, n0xVar5, new n0x(sb8.toString()), lsm0Var4.a(R.string.daily_task_done_tag, Arrays.copyOf(new Object[0], 0)), bfb.b0(huo0Var2), bfb.Z(huo0Var2), (int) z6wVar.j, bfb.a0(huo0Var2));
                                    } else if (d3jVar instanceof c3j) {
                                        lsm0 lsm0Var5 = ctf0Var2.b;
                                        String strA39 = lsm0Var5.a(R.string.daily_task_title, Arrays.copyOf(new Object[0], 0));
                                        String strA40 = lsm0Var5.a(R.string.daily_task_widget_no_task_available_title, Arrays.copyOf(new Object[0], 0));
                                        String strA41 = lsm0Var5.a(R.string.daily_task_widget_task_available_title, Arrays.copyOf(new Object[0], 0));
                                        String strA42 = lsm0Var5.a(R.string.daily_task_widget_no_task_available_title, Arrays.copyOf(new Object[0], 0));
                                        String strA43 = lsm0Var5.a(R.string.daily_task_widget_task_available_subtitle, Arrays.copyOf(new Object[0], 0));
                                        String strA44 = lsm0Var5.a(R.string.daily_task_widget_no_task_available, Arrays.copyOf(new Object[0], 0));
                                        String strA45 = lsm0Var5.a(R.string.daily_task_button_text_game, Arrays.copyOf(new Object[0], 0));
                                        String strA46 = lsm0Var5.a(R.string.daily_task_button_text_participate, Arrays.copyOf(new Object[0], 0));
                                        String strA47 = lsm0Var5.a(R.string.daily_task_widget_open_tasks, Arrays.copyOf(new Object[0], 0));
                                        StringBuilder sb9 = new StringBuilder(ujn.h);
                                        if (StringsKt.O("/static/img/android/casino/daily_challenge/widget/daily_default.webp", ujn.h, false) || kotlin.text.c.x("/static/img/android/casino/daily_challenge/widget/daily_default.webp", "https://", false)) {
                                            sb9.setLength(0);
                                            sb9.append("/static/img/android/casino/daily_challenge/widget/daily_default.webp");
                                        } else {
                                            if (sb9.length() <= 0 || StringsKt.S(sb9, Separators.SLASH)) {
                                                c2 = '/';
                                            } else {
                                                c2 = '/';
                                                sb9.append('/');
                                            }
                                            sb9.append(StringsKt.y0("/static/img/android/casino/daily_challenge/widget/daily_default.webp", c2));
                                        }
                                        n0x n0xVar6 = new n0x(sb9.toString());
                                        StringBuilder sb10 = new StringBuilder(ujn.h);
                                        if (StringsKt.O("/static/img/android/casino/daily_challenge/widget/daily_calendar.webp", ujn.h, false) || kotlin.text.c.x("/static/img/android/casino/daily_challenge/widget/daily_calendar.webp", "https://", false)) {
                                            sb10.setLength(0);
                                            sb10.append("/static/img/android/casino/daily_challenge/widget/daily_calendar.webp");
                                        } else {
                                            if (sb10.length() <= 0 || StringsKt.S(sb10, Separators.SLASH)) {
                                                c = '/';
                                            } else {
                                                c = '/';
                                                sb10.append('/');
                                            }
                                            sb10.append(StringsKt.y0("/static/img/android/casino/daily_challenge/widget/daily_calendar.webp", c));
                                        }
                                        lzhVar2 = new lzh(strA39, strA40, strA42, strA41, strA43, strA44, strA45, strA46, strA47, n0xVar6, new n0x(sb10.toString()), lsm0Var5.a(R.string.daily_task_done_tag, Arrays.copyOf(new Object[0], 0)), false, false);
                                    } else if (d3jVar.equals(b3j.f1908a)) {
                                        izhVar = null;
                                    } else {
                                        t9f.b();
                                    }
                                    izhVar = lzhVar2;
                                }
                                if (izhVar != null) {
                                    return new bg1(izhVar);
                                }
                            }
                        } else if (w2jVar instanceof v2j) {
                            lzhVar = nzh.f24372a;
                            izhVar = lzhVar;
                            if (izhVar != null) {
                                return new bg1(izhVar);
                            }
                        } else if (w2jVar instanceof u2j) {
                            izhVar = null;
                            if (izhVar != null) {
                                return new bg1(izhVar);
                            }
                        } else {
                            t9f.b();
                        }
                        return null;
                }
            }
        }, (byte) 20));
        this.m = maz.b(new yw9((fee) n0o0VarH7.getValue(), new mg1(this, pf1Var, (byte) 0), (byte) 20));
        this.n = bkb.G(((fee) n0o0VarH8.getValue()).d, new eo0((byte) 23));
        this.o = bkb.G(((fee) n0o0VarH8.getValue()).d, new eo0((byte) 24));
        final byte b2 = 1;
        this.p = maz.b(new yw9((fee) n0o0VarH.getValue(), new mg1(this, pf1Var, (byte) 1), (byte) 20));
        this.q = maz.b(new yw9((fee) n0o0VarH6.getValue(), new Function1(this) { // from class: a.lg1
            public final /* synthetic */ ng1 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:183:0x0695  */
            /* JADX WARN: Code duplicated, block: B:193:0x06ab  */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                ozh lzhVar;
                ozh izhVar;
                ozh lzhVar2;
                char c;
                char c2;
                String strA;
                char c3;
                char c4;
                char c5;
                char c6;
                mzb0 mzb0VarA;
                char c7;
                char c8;
                char c9;
                char c10;
                byte b3 = b2;
                ng1 ng1Var = this.b;
                switch (b3) {
                    case 0:
                        n0o0 n0o0Var = ng1Var.s;
                        n0o0 n0o0Var2 = ng1Var.t;
                        ((fee) obj).getClass();
                        lc00 lc00VarB = kotlin.collections.a.b();
                        n0o0 n0o0Var3 = (n0o0) ng1Var.u;
                        lc00VarB.add(((fee) n0o0Var3.getValue()).b());
                        n0o0 n0o0Var4 = ng1Var.q;
                        lc00VarB.add(((fee) n0o0Var4.getValue()).b());
                        if (((fee) n0o0Var3.getValue()).b() != null || ((fee) n0o0Var4.getValue()).b() != null || ((fee) n0o0Var2.getValue()).b() != null || ((fee) n0o0Var.getValue()).b() != null) {
                            lc00VarB.add(((fee) n0o0Var2.getValue()).b());
                            lc00VarB.add(((fee) ng1Var.r.getValue()).b());
                            lc00VarB.add(((fee) ng1Var.p.getValue()).b());
                        }
                        lc00VarB.add(((fee) n0o0Var.getValue()).b());
                        return dyb.o0(CollectionsKt.S(kotlin.collections.a.a(lc00VarB)));
                    default:
                        ((fee) obj).getClass();
                        w2j w2jVar = (w2j) ((fee) ng1Var.h.getValue()).c();
                        ctf0 ctf0Var2 = ng1Var.b;
                        w2jVar.getClass();
                        ctf0Var2.getClass();
                        if (w2jVar instanceof t2j) {
                            d3j d3jVar = ((t2j) w2jVar).f33217a;
                            if (d3jVar instanceof a3j) {
                                lsm0 lsm0Var = ctf0Var2.b;
                                String strA2 = lsm0Var.a(R.string.daily_task_title, Arrays.copyOf(new Object[0], 0));
                                String strA3 = lsm0Var.a(R.string.daily_task_widget_no_task_available_title, Arrays.copyOf(new Object[0], 0));
                                String strA4 = lsm0Var.a(R.string.daily_task_widget_task_available_title, Arrays.copyOf(new Object[0], 0));
                                String strA5 = lsm0Var.a(R.string.daily_task_widget_no_task_available_title, Arrays.copyOf(new Object[0], 0));
                                String strA6 = lsm0Var.a(R.string.daily_task_widget_task_available_subtitle, Arrays.copyOf(new Object[0], 0));
                                String strA7 = lsm0Var.a(R.string.daily_task_widget_no_task_available, Arrays.copyOf(new Object[0], 0));
                                String strA8 = lsm0Var.a(R.string.daily_task_button_text_game, Arrays.copyOf(new Object[0], 0));
                                String strA9 = lsm0Var.a(R.string.daily_task_button_text_participate, Arrays.copyOf(new Object[0], 0));
                                String strA10 = lsm0Var.a(R.string.daily_task_widget_open_tasks, Arrays.copyOf(new Object[0], 0));
                                StringBuilder sb = new StringBuilder(ujn.h);
                                if (StringsKt.O("/static/img/android/casino/daily_challenge/widget/daily_default.webp", ujn.h, false) || kotlin.text.c.x("/static/img/android/casino/daily_challenge/widget/daily_default.webp", "https://", false)) {
                                    sb.setLength(0);
                                    sb.append("/static/img/android/casino/daily_challenge/widget/daily_default.webp");
                                } else {
                                    if (sb.length() <= 0 || StringsKt.S(sb, Separators.SLASH)) {
                                        c10 = '/';
                                    } else {
                                        c10 = '/';
                                        sb.append('/');
                                    }
                                    sb.append(StringsKt.y0("/static/img/android/casino/daily_challenge/widget/daily_default.webp", c10));
                                }
                                n0x n0xVar = new n0x(sb.toString());
                                StringBuilder sb2 = new StringBuilder(ujn.h);
                                if (StringsKt.O("/static/img/android/casino/daily_challenge/widget/daily_calendar.webp", ujn.h, false) || kotlin.text.c.x("/static/img/android/casino/daily_challenge/widget/daily_calendar.webp", "https://", false)) {
                                    sb2.setLength(0);
                                    sb2.append("/static/img/android/casino/daily_challenge/widget/daily_calendar.webp");
                                } else {
                                    if (sb2.length() <= 0 || StringsKt.S(sb2, Separators.SLASH)) {
                                        c9 = '/';
                                    } else {
                                        c9 = '/';
                                        sb2.append('/');
                                    }
                                    sb2.append(StringsKt.y0("/static/img/android/casino/daily_challenge/widget/daily_calendar.webp", c9));
                                }
                                lzhVar = new lzh(strA2, strA3, strA5, strA4, strA6, strA7, strA8, strA9, strA10, n0xVar, new n0x(sb2.toString()), lsm0Var.a(R.string.daily_task_done_tag, Arrays.copyOf(new Object[0], 0)), true, true);
                                izhVar = lzhVar;
                                if (izhVar != null) {
                                    return new bg1(izhVar);
                                }
                            } else {
                                if (d3jVar instanceof x2j) {
                                    n85 n85Var = ((x2j) d3jVar).f40170a;
                                    lsm0 lsm0Var2 = ctf0Var2.b;
                                    String strA11 = lsm0Var2.a(R.string.daily_task_title, Arrays.copyOf(new Object[0], 0));
                                    suo0 suo0Var = n85Var.l;
                                    sba0 sba0Var = n85Var.h;
                                    huo0 huo0Var = n85Var.k;
                                    String strK = wpm0.k(ctf0Var2, suo0Var);
                                    String strA12 = lsm0Var2.a(R.string.daily_task_title, Arrays.copyOf(new Object[0], 0));
                                    String strA13 = lsm0Var2.a(R.string.daily_task_widget_task_available_title, Arrays.copyOf(new Object[0], 0));
                                    String strA14 = lsm0Var2.a(R.string.daily_task_widget_no_task_available_title, Arrays.copyOf(new Object[0], 0));
                                    String strQ = gnm0.q(ctf0Var2, sba0Var, huo0Var, n85Var.l);
                                    String strA15 = lsm0Var2.a(R.string.daily_task_widget_task_available_subtitle, Arrays.copyOf(new Object[0], 0));
                                    String strA16 = lsm0Var2.a(R.string.daily_task_widget_no_task_available, Arrays.copyOf(new Object[0], 0));
                                    String strA17 = lsm0Var2.a(R.string.daily_task_button_text_game, Arrays.copyOf(new Object[0], 0));
                                    String strA18 = lsm0Var2.a(R.string.daily_task_button_text_participate, Arrays.copyOf(new Object[0], 0));
                                    String strA19 = lsm0Var2.a(R.string.daily_task_widget_open_tasks, Arrays.copyOf(new Object[0], 0));
                                    StringBuilder sb3 = new StringBuilder(ujn.h);
                                    if (StringsKt.O("/static/img/android/casino/daily_challenge/widget/daily_default.webp", ujn.h, false) || kotlin.text.c.x("/static/img/android/casino/daily_challenge/widget/daily_default.webp", "https://", false)) {
                                        sb3.setLength(0);
                                        sb3.append("/static/img/android/casino/daily_challenge/widget/daily_default.webp");
                                    } else {
                                        if (sb3.length() <= 0 || StringsKt.S(sb3, Separators.SLASH)) {
                                            c8 = '/';
                                        } else {
                                            c8 = '/';
                                            sb3.append('/');
                                        }
                                        sb3.append(StringsKt.y0("/static/img/android/casino/daily_challenge/widget/daily_default.webp", c8));
                                    }
                                    n0x n0xVar2 = new n0x(sb3.toString());
                                    StringBuilder sb4 = new StringBuilder(ujn.h);
                                    if (StringsKt.O("/static/img/android/casino/daily_challenge/widget/daily_calendar.webp", ujn.h, false) || kotlin.text.c.x("/static/img/android/casino/daily_challenge/widget/daily_calendar.webp", "https://", false)) {
                                        sb4.setLength(0);
                                        sb4.append("/static/img/android/casino/daily_challenge/widget/daily_calendar.webp");
                                    } else {
                                        if (sb4.length() <= 0 || StringsKt.S(sb4, Separators.SLASH)) {
                                            c7 = '/';
                                        } else {
                                            c7 = '/';
                                            sb4.append('/');
                                        }
                                        sb4.append(StringsKt.y0("/static/img/android/casino/daily_challenge/widget/daily_calendar.webp", c7));
                                    }
                                    n0x n0xVar3 = new n0x(sb4.toString());
                                    String strA20 = lsm0Var2.a(R.string.daily_task_done_tag, Arrays.copyOf(new Object[0], 0));
                                    String strB0 = bfb.b0(huo0Var);
                                    String strZ = bfb.Z(huo0Var);
                                    int i = (int) n85Var.j;
                                    String strA0 = bfb.a0(huo0Var);
                                    ddk ddkVar = qll.f28939a;
                                    Integer numValueOf = Integer.valueOf(sba0Var.f31923a);
                                    ddkVar.getClass();
                                    qll qllVarQ = ddk.q(numValueOf);
                                    aet aetVar = huo0Var instanceof aet ? (aet) huo0Var : null;
                                    izhVar = new izh(strA11, strK, strA12, strA14, strA13, strQ, strA15, strA16, strA17, strA18, strA19, n0xVar2, n0xVar3, strA20, strB0, strZ, i, strA0, qllVarQ, (aetVar == null || (mzb0VarA = aetVar.a()) == null) ? 0L : mzb0VarA.f22646a);
                                } else {
                                    if (d3jVar instanceof y2j) {
                                        n85 n85Var2 = ((y2j) d3jVar).f41906a;
                                        lsm0 lsm0Var3 = ctf0Var2.b;
                                        String strA21 = lsm0Var3.a(R.string.daily_task_title, Arrays.copyOf(new Object[0], 0));
                                        String strK2 = wpm0.k(ctf0Var2, n85Var2.l);
                                        String strA22 = lsm0Var3.a(R.string.daily_task_title, Arrays.copyOf(new Object[0], 0));
                                        String strA23 = lsm0Var3.a(R.string.daily_task_widget_task_available_title, Arrays.copyOf(new Object[0], 0));
                                        String strA24 = lsm0Var3.a(R.string.daily_task_widget_no_task_available_title, Arrays.copyOf(new Object[0], 0));
                                        String strQ2 = gnm0.q(ctf0Var2, n85Var2.h, n85Var2.k, n85Var2.l);
                                        String strA25 = lsm0Var3.a(R.string.daily_task_widget_task_available_subtitle, Arrays.copyOf(new Object[0], 0));
                                        String strA26 = lsm0Var3.a(R.string.daily_task_widget_no_task_available, Arrays.copyOf(new Object[0], 0));
                                        String strA27 = lsm0Var3.a(R.string.daily_task_button_text_game, Arrays.copyOf(new Object[0], 0));
                                        String strA28 = lsm0Var3.a(R.string.daily_task_button_text_participate, Arrays.copyOf(new Object[0], 0));
                                        String strA29 = lsm0Var3.a(R.string.daily_task_widget_open_tasks, Arrays.copyOf(new Object[0], 0));
                                        StringBuilder sb5 = new StringBuilder(ujn.h);
                                        if (StringsKt.O("/static/img/android/casino/daily_challenge/widget/daily_default.webp", ujn.h, false) || kotlin.text.c.x("/static/img/android/casino/daily_challenge/widget/daily_default.webp", "https://", false)) {
                                            sb5.setLength(0);
                                            sb5.append("/static/img/android/casino/daily_challenge/widget/daily_default.webp");
                                        } else {
                                            if (sb5.length() <= 0 || StringsKt.S(sb5, Separators.SLASH)) {
                                                c6 = '/';
                                            } else {
                                                c6 = '/';
                                                sb5.append('/');
                                            }
                                            sb5.append(StringsKt.y0("/static/img/android/casino/daily_challenge/widget/daily_default.webp", c6));
                                        }
                                        n0x n0xVar4 = new n0x(sb5.toString());
                                        StringBuilder sb6 = new StringBuilder(ujn.h);
                                        if (StringsKt.O("/static/img/android/casino/daily_challenge/widget/daily_calendar.webp", ujn.h, false) || kotlin.text.c.x("/static/img/android/casino/daily_challenge/widget/daily_calendar.webp", "https://", false)) {
                                            sb6.setLength(0);
                                            sb6.append("/static/img/android/casino/daily_challenge/widget/daily_calendar.webp");
                                        } else {
                                            if (sb6.length() <= 0 || StringsKt.S(sb6, Separators.SLASH)) {
                                                c5 = '/';
                                            } else {
                                                c5 = '/';
                                                sb6.append('/');
                                            }
                                            sb6.append(StringsKt.y0("/static/img/android/casino/daily_challenge/widget/daily_calendar.webp", c5));
                                        }
                                        lzhVar2 = new kzh(strA21, strK2, strA22, strA24, strA23, strQ2, strA25, strA26, strA27, strA28, strA29, n0xVar4, new n0x(sb6.toString()), lsm0Var3.a(R.string.daily_task_done_tag, Arrays.copyOf(new Object[0], 0)), n85Var2.e);
                                    } else if (d3jVar instanceof z2j) {
                                        z6w z6wVar = ((z2j) d3jVar).f43671a;
                                        lsm0 lsm0Var4 = ctf0Var2.b;
                                        String strA30 = lsm0Var4.a(R.string.daily_task_title, Arrays.copyOf(new Object[0], 0));
                                        suo0 suo0Var2 = z6wVar.c;
                                        huo0 huo0Var2 = z6wVar.b;
                                        String strK3 = wpm0.k(ctf0Var2, suo0Var2);
                                        String strA31 = lsm0Var4.a(R.string.daily_task_title, Arrays.copyOf(new Object[0], 0));
                                        String strA32 = lsm0Var4.a(R.string.daily_task_widget_task_available_title, Arrays.copyOf(new Object[0], 0));
                                        String strA33 = lsm0Var4.a(R.string.daily_task_widget_no_task_available_title, Arrays.copyOf(new Object[0], 0));
                                        suo0 suo0Var3 = z6wVar.c;
                                        if (suo0Var3 instanceof ouo0) {
                                            pn40 pn40Var = pn40.f27267a;
                                            ouo0 ouo0Var = (ouo0) suo0Var3;
                                            strA = lsm0Var4.a(R.string.daily_task_prize_description_bonus, Arrays.copyOf(new Object[]{"\u200e".concat(pn40.i(ouo0Var.f25886a, 2)), ouo0Var.b}, 2));
                                        } else if (suo0Var3 instanceof puo0) {
                                            pn40 pn40Var2 = pn40.f27267a;
                                            strA = lsm0Var4.a(R.string.daily_task_prize_description_frsp, Arrays.copyOf(new Object[]{"\u200e".concat(pn40.i(((puo0) suo0Var3).f27627a, 0))}, 1));
                                        } else {
                                            strA = lsm0Var4.a(R.string.empty_str, Arrays.copyOf(new Object[0], 0));
                                        }
                                        String str = strA;
                                        String strA34 = lsm0Var4.a(R.string.daily_task_widget_task_available_subtitle, Arrays.copyOf(new Object[0], 0));
                                        String strA35 = lsm0Var4.a(R.string.daily_task_widget_no_task_available, Arrays.copyOf(new Object[0], 0));
                                        String strA36 = lsm0Var4.a(R.string.daily_task_button_text_game, Arrays.copyOf(new Object[0], 0));
                                        String strA37 = lsm0Var4.a(R.string.daily_task_button_text_participate, Arrays.copyOf(new Object[0], 0));
                                        String strA38 = lsm0Var4.a(R.string.daily_task_widget_open_tasks, Arrays.copyOf(new Object[0], 0));
                                        StringBuilder sb7 = new StringBuilder(ujn.h);
                                        if (StringsKt.O("/static/img/android/casino/daily_challenge/widget/daily_default.webp", ujn.h, false) || kotlin.text.c.x("/static/img/android/casino/daily_challenge/widget/daily_default.webp", "https://", false)) {
                                            sb7.setLength(0);
                                            sb7.append("/static/img/android/casino/daily_challenge/widget/daily_default.webp");
                                        } else {
                                            if (sb7.length() <= 0 || StringsKt.S(sb7, Separators.SLASH)) {
                                                c4 = '/';
                                            } else {
                                                c4 = '/';
                                                sb7.append('/');
                                            }
                                            sb7.append(StringsKt.y0("/static/img/android/casino/daily_challenge/widget/daily_default.webp", c4));
                                        }
                                        n0x n0xVar5 = new n0x(sb7.toString());
                                        StringBuilder sb8 = new StringBuilder(ujn.h);
                                        if (StringsKt.O("/static/img/android/casino/daily_challenge/widget/daily_calendar.webp", ujn.h, false) || kotlin.text.c.x("/static/img/android/casino/daily_challenge/widget/daily_calendar.webp", "https://", false)) {
                                            sb8.setLength(0);
                                            sb8.append("/static/img/android/casino/daily_challenge/widget/daily_calendar.webp");
                                        } else {
                                            if (sb8.length() <= 0 || StringsKt.S(sb8, Separators.SLASH)) {
                                                c3 = '/';
                                            } else {
                                                c3 = '/';
                                                sb8.append('/');
                                            }
                                            sb8.append(StringsKt.y0("/static/img/android/casino/daily_challenge/widget/daily_calendar.webp", c3));
                                        }
                                        lzhVar2 = new jzh(strA30, strK3, strA31, strA33, strA32, str, strA34, strA35, strA36, strA37, strA38, n0xVar5, new n0x(sb8.toString()), lsm0Var4.a(R.string.daily_task_done_tag, Arrays.copyOf(new Object[0], 0)), bfb.b0(huo0Var2), bfb.Z(huo0Var2), (int) z6wVar.j, bfb.a0(huo0Var2));
                                    } else if (d3jVar instanceof c3j) {
                                        lsm0 lsm0Var5 = ctf0Var2.b;
                                        String strA39 = lsm0Var5.a(R.string.daily_task_title, Arrays.copyOf(new Object[0], 0));
                                        String strA40 = lsm0Var5.a(R.string.daily_task_widget_no_task_available_title, Arrays.copyOf(new Object[0], 0));
                                        String strA41 = lsm0Var5.a(R.string.daily_task_widget_task_available_title, Arrays.copyOf(new Object[0], 0));
                                        String strA42 = lsm0Var5.a(R.string.daily_task_widget_no_task_available_title, Arrays.copyOf(new Object[0], 0));
                                        String strA43 = lsm0Var5.a(R.string.daily_task_widget_task_available_subtitle, Arrays.copyOf(new Object[0], 0));
                                        String strA44 = lsm0Var5.a(R.string.daily_task_widget_no_task_available, Arrays.copyOf(new Object[0], 0));
                                        String strA45 = lsm0Var5.a(R.string.daily_task_button_text_game, Arrays.copyOf(new Object[0], 0));
                                        String strA46 = lsm0Var5.a(R.string.daily_task_button_text_participate, Arrays.copyOf(new Object[0], 0));
                                        String strA47 = lsm0Var5.a(R.string.daily_task_widget_open_tasks, Arrays.copyOf(new Object[0], 0));
                                        StringBuilder sb9 = new StringBuilder(ujn.h);
                                        if (StringsKt.O("/static/img/android/casino/daily_challenge/widget/daily_default.webp", ujn.h, false) || kotlin.text.c.x("/static/img/android/casino/daily_challenge/widget/daily_default.webp", "https://", false)) {
                                            sb9.setLength(0);
                                            sb9.append("/static/img/android/casino/daily_challenge/widget/daily_default.webp");
                                        } else {
                                            if (sb9.length() <= 0 || StringsKt.S(sb9, Separators.SLASH)) {
                                                c2 = '/';
                                            } else {
                                                c2 = '/';
                                                sb9.append('/');
                                            }
                                            sb9.append(StringsKt.y0("/static/img/android/casino/daily_challenge/widget/daily_default.webp", c2));
                                        }
                                        n0x n0xVar6 = new n0x(sb9.toString());
                                        StringBuilder sb10 = new StringBuilder(ujn.h);
                                        if (StringsKt.O("/static/img/android/casino/daily_challenge/widget/daily_calendar.webp", ujn.h, false) || kotlin.text.c.x("/static/img/android/casino/daily_challenge/widget/daily_calendar.webp", "https://", false)) {
                                            sb10.setLength(0);
                                            sb10.append("/static/img/android/casino/daily_challenge/widget/daily_calendar.webp");
                                        } else {
                                            if (sb10.length() <= 0 || StringsKt.S(sb10, Separators.SLASH)) {
                                                c = '/';
                                            } else {
                                                c = '/';
                                                sb10.append('/');
                                            }
                                            sb10.append(StringsKt.y0("/static/img/android/casino/daily_challenge/widget/daily_calendar.webp", c));
                                        }
                                        lzhVar2 = new lzh(strA39, strA40, strA42, strA41, strA43, strA44, strA45, strA46, strA47, n0xVar6, new n0x(sb10.toString()), lsm0Var5.a(R.string.daily_task_done_tag, Arrays.copyOf(new Object[0], 0)), false, false);
                                    } else if (d3jVar.equals(b3j.f1908a)) {
                                        izhVar = null;
                                    } else {
                                        t9f.b();
                                    }
                                    izhVar = lzhVar2;
                                }
                                if (izhVar != null) {
                                    return new bg1(izhVar);
                                }
                            }
                        } else if (w2jVar instanceof v2j) {
                            lzhVar = nzh.f24372a;
                            izhVar = lzhVar;
                            if (izhVar != null) {
                                return new bg1(izhVar);
                            }
                        } else if (w2jVar instanceof u2j) {
                            izhVar = null;
                            if (izhVar != null) {
                                return new bg1(izhVar);
                            }
                        } else {
                            t9f.b();
                        }
                        return null;
                }
            }
        }, (byte) 20));
        this.r = maz.b(new yw9((fee) n0o0VarH2.getValue(), new mg1(pf1Var, this, (byte) 2), (byte) 20));
        this.s = maz.b(new yw9((fee) n0o0VarH3.getValue(), new mg1(this, pf1Var, (byte) 3), (byte) 20));
        this.t = maz.b(new yw9((fee) n0o0VarH4.getValue(), new mg1(pf1Var, this, (byte) 4), (byte) 20));
        this.u = maz.b(new yw9((fee) n0o0VarH5.getValue(), new mg1(pf1Var, this, (byte) 5), (byte) 20));
    }

    public static cg1 a(me1 me1Var, n0x n0xVar, qc0 qc0Var, String str, String str2, String str3, String str4, String str5, String str6) {
        all rklVar;
        all lklVar;
        int iOrdinal = me1Var.ordinal();
        if (iOrdinal == 0) {
            rklVar = new rkl(n0xVar, qc0Var, str, str2, str3, str4);
        } else if (iOrdinal == 1) {
            rklVar = new xkl(n0xVar, qc0Var, str, str2, str3);
        } else {
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    rklVar = new ukl(n0xVar, qc0Var, str, str2, str3);
                } else {
                    if (iOrdinal != 4) {
                        t9f.b();
                        return null;
                    }
                    lklVar = new lkl(n0xVar, qc0Var, str, str2, str3, str6);
                }
                return new cg1(lklVar);
            }
            rklVar = new okl(n0xVar, qc0Var, str, str2, str3, str4, str5);
        }
        lklVar = rklVar;
        return new cg1(lklVar);
    }

    @Override // a.v6t0
    public final Object invoke(Object obj) {
        byte b = this.f23462a;
        n0o0 n0o0Var = this.o;
        n0o0 n0o0Var2 = this.h;
        n0o0 n0o0Var3 = this.g;
        n0o0 n0o0Var4 = this.n;
        n0o0 n0o0Var5 = this.m;
        n0o0 n0o0Var6 = this.l;
        n0o0 n0o0Var7 = this.k;
        n0o0 n0o0Var8 = this.j;
        n0o0 n0o0Var9 = this.i;
        n0o0 n0o0Var10 = this.f;
        n0o0 n0o0Var11 = this.e;
        n0o0 n0o0Var12 = this.d;
        n0o0 n0o0Var13 = this.c;
        switch (b) {
            case 0:
                pf1 pf1Var = (pf1) obj;
                pf1Var.getClass();
                ((fee) n0o0Var9.getValue()).d(pf1Var.F);
                ((fee) n0o0Var13.getValue()).d(pf1Var.A);
                ((fee) n0o0Var12.getValue()).d(pf1Var.y);
                ((fee) n0o0Var11.getValue()).d(pf1Var.B);
                ((fee) n0o0Var10.getValue()).d(pf1Var.x);
                ((fee) n0o0Var2.getValue()).d(pf1Var.C);
                ((fee) n0o0Var3.getValue()).d(pf1Var.z);
                ((fee) n0o0Var8.getValue()).d(Boolean.valueOf(pf1Var.r));
                ((fee) n0o0Var7.getValue()).d(Boolean.valueOf(pf1Var.v));
                yuc0 yuc0Var = (yuc0) ((fee) n0o0Var3.getValue()).c();
                c6c0 c6c0Var = (c6c0) ((fee) n0o0Var13.getValue()).c();
                vtc0 vtc0Var = (vtc0) ((fee) n0o0Var11.getValue()).c();
                boolean zBooleanValue = ((Boolean) ((fee) n0o0Var7.getValue()).c()).booleanValue();
                w2j w2jVar = (w2j) ((fee) n0o0Var2.getValue()).c();
                boolean z = c6c0Var instanceof a6c0;
                ctf0 ctf0Var = this.b;
                if (((z || (c6c0Var instanceof y5c0)) && (yuc0Var instanceof vuc0) && (w2jVar instanceof u2j) && (vtc0Var instanceof ttc0)) || zBooleanValue) {
                    return new jg1(ctf0Var.b.a(R.string.promo, Arrays.copyOf(new Object[0], 0)), (ad) ((fee) n0o0Var5.getValue()).b(), (mdm) ((fee) n0o0Var.getValue()).b());
                }
                return ((a4x) ((fee) n0o0Var6.getValue()).b()).isEmpty() ? new ig1(ctf0Var.b.a(R.string.promo, Arrays.copyOf(new Object[0], 0)), (ad) ((fee) n0o0Var5.getValue()).b(), (mdm) ((fee) n0o0Var4.getValue()).b()) : new hg1(ctf0Var.b.a(R.string.promo, Arrays.copyOf(new Object[0], 0)), (ad) ((fee) n0o0Var5.getValue()).b(), (a4x) ((fee) n0o0Var6.getValue()).b());
            default:
                aye0 aye0Var = (aye0) obj;
                aye0Var.getClass();
                ((fee) n0o0Var13.getValue()).d(aye0Var.k);
                ((fee) n0o0Var12.getValue()).d(aye0Var.h);
                fee feeVar = (fee) n0o0Var11.getValue();
                List list = aye0Var.e;
                feeVar.d(list);
                ((fee) n0o0Var10.getValue()).d(aye0Var.d);
                ((fee) n0o0Var9.getValue()).d(aye0Var.f);
                ((fee) n0o0Var8.getValue()).d(aye0Var.g);
                ((fee) n0o0Var7.getValue()).d(aye0Var.l);
                ((fee) n0o0Var6.getValue()).d(Boolean.valueOf(aye0Var.b));
                ((fee) n0o0Var5.getValue()).d(Boolean.valueOf(aye0Var.c));
                ((fee) n0o0Var4.getValue()).d(Boolean.FALSE);
                ((fee) n0o0Var3.getValue()).d(aye0Var.i);
                ((fee) n0o0Var2.getValue()).d(aye0Var.j);
                ((fee) n0o0Var.getValue()).d(aye0Var.n);
                ((fee) this.p.getValue()).d(aye0Var.C);
                ((fee) this.q.getValue()).d(list);
                return new bye0(((fee) this.t.getValue()).e, ((fee) this.r.getValue()).e, ((fee) this.s.getValue()).e, aye0Var.f1667a);
        }
    }

    public ng1(ctf0 ctf0Var, aye0 aye0Var) {
        final byte b = 1;
        ctf0Var.getClass();
        this.b = ctf0Var;
        this.u = aye0Var;
        n0o0 n0o0VarH = bkb.H(aye0Var.k);
        this.c = n0o0VarH;
        this.d = bkb.H(aye0Var.h);
        List list = aye0Var.e;
        this.e = bkb.H(list);
        this.f = bkb.H(aye0Var.d);
        this.g = bkb.H(aye0Var.i);
        this.h = bkb.H(aye0Var.j);
        this.i = bkb.H(aye0Var.f);
        this.j = bkb.H(aye0Var.g);
        this.k = bkb.H(aye0Var.l);
        this.l = bkb.H(Boolean.valueOf(aye0Var.b));
        this.m = bkb.H(Boolean.valueOf(aye0Var.c));
        n0o0 n0o0VarH2 = bkb.H(Boolean.FALSE);
        this.n = n0o0VarH2;
        this.o = bkb.H(aye0Var.n);
        this.p = bkb.H(aye0Var.C);
        final byte b2 = 0;
        this.q = maz.b(new yw9(list, new Function1(this) { // from class: a.cye0
            public final /* synthetic */ ng1 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:82:0x02e8  */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Map map;
                Object obj2;
                boolean z;
                boolean z2;
                int iIntValue;
                Map map2;
                Map map3;
                Integer numValueOf;
                boolean z3;
                Map map4;
                Integer numValueOf2;
                ygk0 ygk0Var;
                int i;
                Iterator it;
                DocumentStateModel documentStateModel;
                String strA;
                byte b3 = b2;
                ng1 ng1Var = this.b;
                switch (b3) {
                    case 0:
                        List list2 = (List) obj;
                        list2.getClass();
                        ctf0 ctf0Var2 = ng1Var.b;
                        List list3 = (List) ((fee) ng1Var.f.getValue()).c();
                        q7f0 q7f0Var = (q7f0) ((fee) ng1Var.c.getValue()).c();
                        if (q7f0Var == null || (map = (Map) ((Map) ((fee) ng1Var.i.getValue()).c()).get(q7f0Var)) == null) {
                            map = lun.f20680a;
                            map.getClass();
                        }
                        Map map5 = map;
                        q1f0 q1f0Var = (q1f0) ((fee) ng1Var.d.getValue()).c();
                        List list4 = (List) ((fee) ng1Var.j.getValue()).c();
                        aye0 aye0Var2 = (aye0) ng1Var.u;
                        boolean z4 = aye0Var2.q;
                        sff0 sff0Var = aye0Var2.m;
                        boolean z5 = sff0Var.m.s;
                        v8d v8dVar = aye0Var2.r;
                        boolean z6 = v8dVar.J;
                        boolean z7 = sff0Var.N.o;
                        List list5 = v8dVar.K;
                        Map map6 = (Map) ((fee) ng1Var.g.getValue()).c();
                        Map map7 = (Map) ((fee) ng1Var.h.getValue()).c();
                        boolean z8 = ((fee) ng1Var.k.getValue()).c() != null;
                        ctf0Var2.getClass();
                        list3.getClass();
                        map6.getClass();
                        map7.getClass();
                        q1f0Var.getClass();
                        CitizenshipStateModel citizenshipStateModel = q1f0Var.o;
                        list4.getClass();
                        list5.getClass();
                        lc00 lc00VarB = kotlin.collections.a.b();
                        Iterator it2 = list2.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                Object next = it2.next();
                                if (((q0f0) next) instanceof pze0) {
                                    obj2 = next;
                                }
                            } else {
                                obj2 = null;
                            }
                        }
                        boolean z9 = z8;
                        pze0 pze0Var = obj2 instanceof pze0 ? (pze0) obj2 : null;
                        String strJ0 = sj3.j0(pze0Var != null ? pze0Var.e : null, "18");
                        if (list5.isEmpty()) {
                            z = false;
                        } else {
                            String str = citizenshipStateModel != null ? citizenshipStateModel.b : null;
                            if (str == null || str.length() == 0 || list5.contains(Integer.valueOf(citizenshipStateModel.f46872a))) {
                                z = false;
                            } else {
                                z = true;
                            }
                        }
                        ArrayList arrayList = new ArrayList(r3d.q(list2, 10));
                        Iterator it3 = list2.iterator();
                        while (it3.hasNext()) {
                            Object zze0Var = (q0f0) it3.next();
                            String str2 = strJ0;
                            if ((zze0Var instanceof qze0) && z) {
                                it = it3;
                                zze0Var = new qze0(true, false);
                            } else {
                                it = it3;
                                if ((zze0Var instanceof a0f0) && z) {
                                    zze0Var = new a0f0(true, false);
                                } else if ((zze0Var instanceof zze0) && z6 && (documentStateModel = q1f0Var.j) != null && documentStateModel.f46876a == 126) {
                                    zze0Var = new zze0(((zze0) zze0Var).c, false);
                                }
                            }
                            arrayList.add(zze0Var);
                            strJ0 = str2;
                            it3 = it;
                        }
                        String str3 = strJ0;
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj3 : arrayList) {
                            if (!((q0f0) obj3).a()) {
                                arrayList2.add(obj3);
                            }
                        }
                        if (arrayList2.isEmpty()) {
                            z2 = z5;
                            map2 = map7;
                            map3 = map6;
                        } else {
                            Iterator it4 = arrayList2.iterator();
                            while (true) {
                                if (it4.hasNext()) {
                                    if (((q0f0) it4.next()) instanceof p0f0) {
                                        if (!z9) {
                                            boolean zD = Intrinsics.d(map5.get(u0f0.j), prp.f27476a);
                                            lc00 lc00VarB2 = kotlin.collections.a.b();
                                            Iterator it5 = list4.iterator();
                                            while (it5.hasNext()) {
                                                int iIntValue2 = ((Number) it5.next()).intValue();
                                                if (iIntValue2 == 1) {
                                                    numValueOf = Integer.valueOf(R.string.social_vk);
                                                } else if (iIntValue2 == 5) {
                                                    numValueOf = Integer.valueOf(R.string.social_ok);
                                                } else if (iIntValue2 == 7) {
                                                    numValueOf = Integer.valueOf(R.string.social_yandex);
                                                } else if (iIntValue2 == 9) {
                                                    numValueOf = Integer.valueOf(R.string.social_mailru_label_new);
                                                } else if (iIntValue2 == 11) {
                                                    numValueOf = Integer.valueOf(R.string.social_google);
                                                } else if (iIntValue2 == 13) {
                                                    numValueOf = Integer.valueOf(R.string.social_x_com);
                                                } else if (iIntValue2 == 17) {
                                                    numValueOf = Integer.valueOf(R.string.social_telegram);
                                                } else if (iIntValue2 == 19) {
                                                    numValueOf = Integer.valueOf(R.string.social_apple_id);
                                                } else if (iIntValue2 != 26) {
                                                    numValueOf = iIntValue2 != 31 ? null : Integer.valueOf(R.string.social_discord);
                                                } else {
                                                    numValueOf = Integer.valueOf(R.string.social_its_me);
                                                }
                                                if (numValueOf != null) {
                                                    int iIntValue3 = numValueOf.intValue();
                                                    z3 = z5;
                                                    if (iIntValue2 == 1) {
                                                        numValueOf2 = Integer.valueOf(R.drawable.ic_social_circle_vk);
                                                    } else if (iIntValue2 == 5) {
                                                        numValueOf2 = Integer.valueOf(R.drawable.ic_social_circle_ok);
                                                    } else if (iIntValue2 == 7) {
                                                        numValueOf2 = Integer.valueOf(R.drawable.ic_social_circle_yandex);
                                                    } else if (iIntValue2 == 9) {
                                                        numValueOf2 = Integer.valueOf(R.drawable.ic_social_circle_mail);
                                                    } else if (iIntValue2 == 11) {
                                                        numValueOf2 = Integer.valueOf(R.drawable.ic_social_circle_google);
                                                    } else if (iIntValue2 == 13) {
                                                        numValueOf2 = Integer.valueOf(R.drawable.ic_social_circle_x);
                                                    } else if (iIntValue2 == 17) {
                                                        numValueOf2 = Integer.valueOf(R.drawable.ic_social_circle_telegram);
                                                    } else if (iIntValue2 == 19) {
                                                        numValueOf2 = Integer.valueOf(R.drawable.ic_social_circle_apple);
                                                    } else if (iIntValue2 != 26) {
                                                        numValueOf2 = iIntValue2 != 31 ? null : Integer.valueOf(R.drawable.ic_social_circle_discord);
                                                    } else {
                                                        numValueOf2 = Integer.valueOf(R.drawable.ic_social_circle_itsme);
                                                    }
                                                    if (numValueOf2 != null) {
                                                        int iIntValue4 = numValueOf2.intValue();
                                                        if (zD) {
                                                            map4 = map7;
                                                            ygk0Var = ygk0.b;
                                                        } else {
                                                            map4 = map7;
                                                            Integer num = q1f0Var.D;
                                                            ygk0Var = (num != null && num.intValue() == iIntValue2) ? ygk0.f42589a : ygk0.c;
                                                        }
                                                        lc00VarB2.add(new bhk0(iIntValue2, iIntValue4, ygk0Var, ctf0Var2.b.a(iIntValue3, Arrays.copyOf(new Object[0], 0))));
                                                    }
                                                    it5 = it5;
                                                    map7 = map4;
                                                    map6 = map6;
                                                    arrayList2 = arrayList2;
                                                    map5 = map5;
                                                    z5 = z3;
                                                } else {
                                                    z3 = z5;
                                                }
                                                map4 = map7;
                                                it5 = it5;
                                                map7 = map4;
                                                map6 = map6;
                                                arrayList2 = arrayList2;
                                                map5 = map5;
                                                z5 = z3;
                                            }
                                            z2 = z5;
                                            Map map8 = map7;
                                            Map map9 = map6;
                                            ArrayList arrayList3 = arrayList2;
                                            Map map10 = map5;
                                            lc00 lc00VarA = kotlin.collections.a.a(lc00VarB2);
                                            int iC = ctf0Var2.c();
                                            int size = list4.size();
                                            Integer numValueOf3 = size <= 0 ? 1 : size <= 4 ? Integer.valueOf(size) : null;
                                            if (numValueOf3 != null) {
                                                iIntValue = numValueOf3.intValue();
                                            } else if (320 > iC || iC >= 411) {
                                                iIntValue = (411 > iC || iC >= 600) ? 8 : 6;
                                            } else {
                                                iIntValue = 5;
                                            }
                                            if (numValueOf3 == null) {
                                                while (iIntValue > 2 && size % iIntValue == 1) {
                                                    iIntValue--;
                                                }
                                            }
                                            int i2 = iIntValue * 3;
                                            boolean z10 = q1f0Var.K;
                                            lc00 lc00VarB3 = kotlin.collections.a.b();
                                            if (!z10 && lc00VarA.b() > i2) {
                                                lc00VarB3.addAll(CollectionsKt.D0(lc00VarA, i2 - 1));
                                                lc00VarB3.add(new tgk0(false));
                                            } else if (!z10 || lc00VarA.b() <= i2) {
                                                lc00VarB3.addAll(lc00VarA);
                                            } else {
                                                lc00VarB3.addAll(lc00VarA);
                                                lc00VarB3.add(new tgk0(true));
                                            }
                                            lc00 lc00VarA2 = kotlin.collections.a.a(lc00VarB3);
                                            u0f0 u0f0Var = u0f0.f34852a;
                                            lc00VarB.add(new gjk0(lc00VarA2, zD, iIntValue));
                                            map2 = map8;
                                            map3 = map9;
                                            arrayList2 = arrayList3;
                                            map5 = map10;
                                        }
                                    }
                                }
                                z2 = z5;
                                map2 = map7;
                                map3 = map6;
                            }
                        }
                        b5x.u(lc00VarB, ctf0Var2, arrayList2, map5, map3, map2, q1f0Var, list3, z7);
                        ArrayList<q0f0> arrayList4 = arrayList2;
                        if (z4) {
                            i = 0;
                        } else {
                            i = 0;
                            lc00VarB.add(new n02(u0f0.i1, ctf0Var2.b.a(R.string.company_rules, Arrays.copyOf(new Object[0], 0))));
                        }
                        u0f0 u0f0Var2 = u0f0.j1;
                        lsm0 lsm0Var = ctf0Var2.b;
                        lc00VarB.add(new n02(u0f0Var2, lsm0Var.a(R.string.info_privacy_policy, Arrays.copyOf(new Object[i], i))));
                        if (z2) {
                            lc00VarB.add(new n02(u0f0.k1, lsm0Var.a(R.string.responsible_game, Arrays.copyOf(new Object[i], i))));
                        }
                        for (q0f0 q0f0Var : arrayList4) {
                            if (q0f0Var != null) {
                                if (q0f0Var instanceof hze0) {
                                    str3.getClass();
                                    u0f0 u0f0Var3 = u0f0.f1;
                                    lc00VarB.add(new szb(u0f0Var3, lsm0Var.a(R.string.min_age_confirmation_checkbox_v2, Arrays.copyOf(new Object[]{str3}, 1)), new yvl(vzb.W(q1f0Var.b), b5x.K((urp) map5.get(u0f0Var3)), 2)));
                                } else if (q0f0Var instanceof mze0) {
                                    u0f0 u0f0Var4 = u0f0.y;
                                    lc00VarB.add(new szb(u0f0Var4, lsm0Var.a(R.string.registration_commercial_communication_checkbox, Arrays.copyOf(new Object[0], 0)), new yvl(vzb.W(q1f0Var.e), b5x.K((urp) map5.get(u0f0Var4)), 2)));
                                } else if (q0f0Var instanceof xze0) {
                                    u0f0 u0f0Var5 = u0f0.n1;
                                    lc00VarB.add(new szb(u0f0Var5, lsm0Var.a(R.string.registration_notify_news_call_checkbox, Arrays.copyOf(new Object[0], 0)), new yvl(vzb.W(q1f0Var.f), b5x.K((urp) map5.get(u0f0Var5)), 2)));
                                } else if (q0f0Var instanceof l0f0) {
                                    u0f0 u0f0Var6 = u0f0.x;
                                    lc00VarB.add(new szb(u0f0Var6, lsm0Var.a(R.string.get_results_of_my_bets_by_email_reg, Arrays.copyOf(new Object[0], 0)), new yvl(vzb.W(q1f0Var.A), b5x.K((urp) map5.get(u0f0Var6)), 2)));
                                } else if (q0f0Var instanceof m0f0) {
                                    u0f0 u0f0Var7 = u0f0.w;
                                    lc00VarB.add(new szb(u0f0Var7, lsm0Var.a(R.string.get_news_about_events_by_email, Arrays.copyOf(new Object[0], 0)), new yvl(vzb.W(q1f0Var.B), b5x.K((urp) map5.get(u0f0Var7)), 2)));
                                } else if (q0f0Var instanceof o0f0) {
                                    u0f0 u0f0Var8 = u0f0.z;
                                    lc00VarB.add(new szb(u0f0Var8, lsm0Var.a(R.string.share_personal_data_confirmation_checkbox_fixed_new, Arrays.copyOf(new Object[0], 0)), new yvl(vzb.W(q1f0Var.C), b5x.K((urp) map5.get(u0f0Var8)), 2)));
                                } else if (q0f0Var instanceof i0f0) {
                                    u0f0 u0f0Var9 = u0f0.A;
                                    lc00VarB.add(new szb(u0f0Var9, lsm0Var.a(R.string.registration_rules_confirmation_checkbox, Arrays.copyOf(new Object[0], 0)), new yvl(vzb.W(q1f0Var.x), b5x.K((urp) map5.get(u0f0Var9)), 2)));
                                } else if (q0f0Var instanceof j0f0) {
                                    str3.getClass();
                                    u0f0 u0f0Var10 = u0f0.B;
                                    lc00VarB.add(new szb(u0f0Var10, lsm0Var.a(R.string.registration_rules_confirmation_all_v2, Arrays.copyOf(new Object[]{str3}, 1)), new yvl(vzb.W(q1f0Var.y), b5x.K((urp) map5.get(u0f0Var10)), 2)));
                                } else if (q0f0Var instanceof n0f0) {
                                    u0f0 u0f0Var11 = u0f0.o1;
                                    lc00VarB.add(new szb(u0f0Var11, lsm0Var.a(R.string.receive_news_about_events_via_SMS, Arrays.copyOf(new Object[0], 0)), new yvl(vzb.W(q1f0Var.L), b5x.K((urp) map5.get(u0f0Var11)), 2)));
                                }
                            }
                        }
                        return dyb.r0(kotlin.collections.a.a(lc00VarB));
                    case 1:
                        q7f0 q7f0Var2 = (q7f0) obj;
                        ctf0 ctf0Var3 = ng1Var.b;
                        long jD = fbc.d(ctf0.b(R.attr.uikitSecondary, ctf0Var3));
                        ilm ilmVar = new ilm(jD);
                        lsm0 lsm0Var2 = ctf0Var3.b;
                        lsm0 lsm0Var3 = ctf0Var3.b;
                        String strA2 = lsm0Var2.a(R.string.registration, Arrays.copyOf(new Object[0], 0));
                        int i3 = q7f0Var2 == null ? -1 : dye0.f6888a[q7f0Var2.ordinal()];
                        if (i3 == -1) {
                            strA = "";
                        } else if (i3 == 1) {
                            strA = lsm0Var3.a(R.string.registration_by_email, Arrays.copyOf(new Object[0], 0));
                        } else if (i3 == 2) {
                            strA = lsm0Var3.a(R.string.registration_by_phone, Arrays.copyOf(new Object[0], 0));
                        } else if (i3 == 3) {
                            strA = lsm0Var3.a(R.string.one_click_registration_new, Arrays.copyOf(new Object[0], 0));
                        } else if (i3 == 4) {
                            strA = lsm0Var3.a(R.string.social_networks_new, Arrays.copyOf(new Object[0], 0));
                        } else {
                            if (i3 != 5) {
                                t9f.b();
                                return null;
                            }
                            strA = lsm0Var3.a(R.string.reg_import_personal_data, Arrays.copyOf(new Object[0], 0));
                        }
                        rlm rlmVar = new rlm(strA2, strA, jD, jD, fa50.f9191a);
                        pz40 pz40Var = s6t0.f31722a;
                        return new imm(ilmVar, rlmVar, fmm.f9790a, s6t0.b().f33626a.getBackgroundContent(), true, null);
                    case 2:
                        ((Boolean) obj).getClass();
                        return new iwe0(!((Boolean) ((fee) ng1Var.m.getValue()).c()).booleanValue(), new mtl(dyb.g0(new itl(new wul(iul.e, oe9.f25112a, new ue9(ng1Var.b.b.a(R.string.offer_to_auth_registration_button, Arrays.copyOf(new Object[0], 0))), (((Boolean) ((fee) ng1Var.n.getValue()).c()).booleanValue() || ((Boolean) ((fee) ng1Var.l.getValue()).c()).booleanValue() || ((Collection) ((fee) ng1Var.e.getValue()).c()).isEmpty()) ? false : true, false, false), sh00.o))));
                    default:
                        if (((Boolean) ((fee) ng1Var.m.getValue()).c()).booleanValue()) {
                            return new rwe0((mdm) ((fee) ng1Var.p.getValue()).c());
                        }
                        return ((Boolean) ((fee) ng1Var.l.getValue()).c()).booleanValue() ? swe0.f32920a : new qwe0((q7f0) ((fee) ng1Var.c.getValue()).c(), (u0f0) ((fee) ng1Var.o.getValue()).c(), (a4x) ((fee) ng1Var.q.getValue()).b());
                }
            }
        }, (byte) 20));
        this.r = bkb.G(((fee) n0o0VarH.getValue()).d, new Function1(this) { // from class: a.cye0
            public final /* synthetic */ ng1 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:82:0x02e8  */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Map map;
                Object obj2;
                boolean z;
                boolean z2;
                int iIntValue;
                Map map2;
                Map map3;
                Integer numValueOf;
                boolean z3;
                Map map4;
                Integer numValueOf2;
                ygk0 ygk0Var;
                int i;
                Iterator it;
                DocumentStateModel documentStateModel;
                String strA;
                byte b3 = b;
                ng1 ng1Var = this.b;
                switch (b3) {
                    case 0:
                        List list2 = (List) obj;
                        list2.getClass();
                        ctf0 ctf0Var2 = ng1Var.b;
                        List list3 = (List) ((fee) ng1Var.f.getValue()).c();
                        q7f0 q7f0Var = (q7f0) ((fee) ng1Var.c.getValue()).c();
                        if (q7f0Var == null || (map = (Map) ((Map) ((fee) ng1Var.i.getValue()).c()).get(q7f0Var)) == null) {
                            map = lun.f20680a;
                            map.getClass();
                        }
                        Map map5 = map;
                        q1f0 q1f0Var = (q1f0) ((fee) ng1Var.d.getValue()).c();
                        List list4 = (List) ((fee) ng1Var.j.getValue()).c();
                        aye0 aye0Var2 = (aye0) ng1Var.u;
                        boolean z4 = aye0Var2.q;
                        sff0 sff0Var = aye0Var2.m;
                        boolean z5 = sff0Var.m.s;
                        v8d v8dVar = aye0Var2.r;
                        boolean z6 = v8dVar.J;
                        boolean z7 = sff0Var.N.o;
                        List list5 = v8dVar.K;
                        Map map6 = (Map) ((fee) ng1Var.g.getValue()).c();
                        Map map7 = (Map) ((fee) ng1Var.h.getValue()).c();
                        boolean z8 = ((fee) ng1Var.k.getValue()).c() != null;
                        ctf0Var2.getClass();
                        list3.getClass();
                        map6.getClass();
                        map7.getClass();
                        q1f0Var.getClass();
                        CitizenshipStateModel citizenshipStateModel = q1f0Var.o;
                        list4.getClass();
                        list5.getClass();
                        lc00 lc00VarB = kotlin.collections.a.b();
                        Iterator it2 = list2.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                Object next = it2.next();
                                if (((q0f0) next) instanceof pze0) {
                                    obj2 = next;
                                }
                            } else {
                                obj2 = null;
                            }
                        }
                        boolean z9 = z8;
                        pze0 pze0Var = obj2 instanceof pze0 ? (pze0) obj2 : null;
                        String strJ0 = sj3.j0(pze0Var != null ? pze0Var.e : null, "18");
                        if (list5.isEmpty()) {
                            z = false;
                        } else {
                            String str = citizenshipStateModel != null ? citizenshipStateModel.b : null;
                            if (str == null || str.length() == 0 || list5.contains(Integer.valueOf(citizenshipStateModel.f46872a))) {
                                z = false;
                            } else {
                                z = true;
                            }
                        }
                        ArrayList arrayList = new ArrayList(r3d.q(list2, 10));
                        Iterator it3 = list2.iterator();
                        while (it3.hasNext()) {
                            Object zze0Var = (q0f0) it3.next();
                            String str2 = strJ0;
                            if ((zze0Var instanceof qze0) && z) {
                                it = it3;
                                zze0Var = new qze0(true, false);
                            } else {
                                it = it3;
                                if ((zze0Var instanceof a0f0) && z) {
                                    zze0Var = new a0f0(true, false);
                                } else if ((zze0Var instanceof zze0) && z6 && (documentStateModel = q1f0Var.j) != null && documentStateModel.f46876a == 126) {
                                    zze0Var = new zze0(((zze0) zze0Var).c, false);
                                }
                            }
                            arrayList.add(zze0Var);
                            strJ0 = str2;
                            it3 = it;
                        }
                        String str3 = strJ0;
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj3 : arrayList) {
                            if (!((q0f0) obj3).a()) {
                                arrayList2.add(obj3);
                            }
                        }
                        if (arrayList2.isEmpty()) {
                            z2 = z5;
                            map2 = map7;
                            map3 = map6;
                        } else {
                            Iterator it4 = arrayList2.iterator();
                            while (true) {
                                if (it4.hasNext()) {
                                    if (((q0f0) it4.next()) instanceof p0f0) {
                                        if (!z9) {
                                            boolean zD = Intrinsics.d(map5.get(u0f0.j), prp.f27476a);
                                            lc00 lc00VarB2 = kotlin.collections.a.b();
                                            Iterator it5 = list4.iterator();
                                            while (it5.hasNext()) {
                                                int iIntValue2 = ((Number) it5.next()).intValue();
                                                if (iIntValue2 == 1) {
                                                    numValueOf = Integer.valueOf(R.string.social_vk);
                                                } else if (iIntValue2 == 5) {
                                                    numValueOf = Integer.valueOf(R.string.social_ok);
                                                } else if (iIntValue2 == 7) {
                                                    numValueOf = Integer.valueOf(R.string.social_yandex);
                                                } else if (iIntValue2 == 9) {
                                                    numValueOf = Integer.valueOf(R.string.social_mailru_label_new);
                                                } else if (iIntValue2 == 11) {
                                                    numValueOf = Integer.valueOf(R.string.social_google);
                                                } else if (iIntValue2 == 13) {
                                                    numValueOf = Integer.valueOf(R.string.social_x_com);
                                                } else if (iIntValue2 == 17) {
                                                    numValueOf = Integer.valueOf(R.string.social_telegram);
                                                } else if (iIntValue2 == 19) {
                                                    numValueOf = Integer.valueOf(R.string.social_apple_id);
                                                } else if (iIntValue2 != 26) {
                                                    numValueOf = iIntValue2 != 31 ? null : Integer.valueOf(R.string.social_discord);
                                                } else {
                                                    numValueOf = Integer.valueOf(R.string.social_its_me);
                                                }
                                                if (numValueOf != null) {
                                                    int iIntValue3 = numValueOf.intValue();
                                                    z3 = z5;
                                                    if (iIntValue2 == 1) {
                                                        numValueOf2 = Integer.valueOf(R.drawable.ic_social_circle_vk);
                                                    } else if (iIntValue2 == 5) {
                                                        numValueOf2 = Integer.valueOf(R.drawable.ic_social_circle_ok);
                                                    } else if (iIntValue2 == 7) {
                                                        numValueOf2 = Integer.valueOf(R.drawable.ic_social_circle_yandex);
                                                    } else if (iIntValue2 == 9) {
                                                        numValueOf2 = Integer.valueOf(R.drawable.ic_social_circle_mail);
                                                    } else if (iIntValue2 == 11) {
                                                        numValueOf2 = Integer.valueOf(R.drawable.ic_social_circle_google);
                                                    } else if (iIntValue2 == 13) {
                                                        numValueOf2 = Integer.valueOf(R.drawable.ic_social_circle_x);
                                                    } else if (iIntValue2 == 17) {
                                                        numValueOf2 = Integer.valueOf(R.drawable.ic_social_circle_telegram);
                                                    } else if (iIntValue2 == 19) {
                                                        numValueOf2 = Integer.valueOf(R.drawable.ic_social_circle_apple);
                                                    } else if (iIntValue2 != 26) {
                                                        numValueOf2 = iIntValue2 != 31 ? null : Integer.valueOf(R.drawable.ic_social_circle_discord);
                                                    } else {
                                                        numValueOf2 = Integer.valueOf(R.drawable.ic_social_circle_itsme);
                                                    }
                                                    if (numValueOf2 != null) {
                                                        int iIntValue4 = numValueOf2.intValue();
                                                        if (zD) {
                                                            map4 = map7;
                                                            ygk0Var = ygk0.b;
                                                        } else {
                                                            map4 = map7;
                                                            Integer num = q1f0Var.D;
                                                            ygk0Var = (num != null && num.intValue() == iIntValue2) ? ygk0.f42589a : ygk0.c;
                                                        }
                                                        lc00VarB2.add(new bhk0(iIntValue2, iIntValue4, ygk0Var, ctf0Var2.b.a(iIntValue3, Arrays.copyOf(new Object[0], 0))));
                                                    }
                                                    it5 = it5;
                                                    map7 = map4;
                                                    map6 = map6;
                                                    arrayList2 = arrayList2;
                                                    map5 = map5;
                                                    z5 = z3;
                                                } else {
                                                    z3 = z5;
                                                }
                                                map4 = map7;
                                                it5 = it5;
                                                map7 = map4;
                                                map6 = map6;
                                                arrayList2 = arrayList2;
                                                map5 = map5;
                                                z5 = z3;
                                            }
                                            z2 = z5;
                                            Map map8 = map7;
                                            Map map9 = map6;
                                            ArrayList arrayList3 = arrayList2;
                                            Map map10 = map5;
                                            lc00 lc00VarA = kotlin.collections.a.a(lc00VarB2);
                                            int iC = ctf0Var2.c();
                                            int size = list4.size();
                                            Integer numValueOf3 = size <= 0 ? 1 : size <= 4 ? Integer.valueOf(size) : null;
                                            if (numValueOf3 != null) {
                                                iIntValue = numValueOf3.intValue();
                                            } else if (320 > iC || iC >= 411) {
                                                iIntValue = (411 > iC || iC >= 600) ? 8 : 6;
                                            } else {
                                                iIntValue = 5;
                                            }
                                            if (numValueOf3 == null) {
                                                while (iIntValue > 2 && size % iIntValue == 1) {
                                                    iIntValue--;
                                                }
                                            }
                                            int i2 = iIntValue * 3;
                                            boolean z10 = q1f0Var.K;
                                            lc00 lc00VarB3 = kotlin.collections.a.b();
                                            if (!z10 && lc00VarA.b() > i2) {
                                                lc00VarB3.addAll(CollectionsKt.D0(lc00VarA, i2 - 1));
                                                lc00VarB3.add(new tgk0(false));
                                            } else if (!z10 || lc00VarA.b() <= i2) {
                                                lc00VarB3.addAll(lc00VarA);
                                            } else {
                                                lc00VarB3.addAll(lc00VarA);
                                                lc00VarB3.add(new tgk0(true));
                                            }
                                            lc00 lc00VarA2 = kotlin.collections.a.a(lc00VarB3);
                                            u0f0 u0f0Var = u0f0.f34852a;
                                            lc00VarB.add(new gjk0(lc00VarA2, zD, iIntValue));
                                            map2 = map8;
                                            map3 = map9;
                                            arrayList2 = arrayList3;
                                            map5 = map10;
                                        }
                                    }
                                }
                                z2 = z5;
                                map2 = map7;
                                map3 = map6;
                            }
                        }
                        b5x.u(lc00VarB, ctf0Var2, arrayList2, map5, map3, map2, q1f0Var, list3, z7);
                        ArrayList<q0f0> arrayList4 = arrayList2;
                        if (z4) {
                            i = 0;
                        } else {
                            i = 0;
                            lc00VarB.add(new n02(u0f0.i1, ctf0Var2.b.a(R.string.company_rules, Arrays.copyOf(new Object[0], 0))));
                        }
                        u0f0 u0f0Var2 = u0f0.j1;
                        lsm0 lsm0Var = ctf0Var2.b;
                        lc00VarB.add(new n02(u0f0Var2, lsm0Var.a(R.string.info_privacy_policy, Arrays.copyOf(new Object[i], i))));
                        if (z2) {
                            lc00VarB.add(new n02(u0f0.k1, lsm0Var.a(R.string.responsible_game, Arrays.copyOf(new Object[i], i))));
                        }
                        for (q0f0 q0f0Var : arrayList4) {
                            if (q0f0Var != null) {
                                if (q0f0Var instanceof hze0) {
                                    str3.getClass();
                                    u0f0 u0f0Var3 = u0f0.f1;
                                    lc00VarB.add(new szb(u0f0Var3, lsm0Var.a(R.string.min_age_confirmation_checkbox_v2, Arrays.copyOf(new Object[]{str3}, 1)), new yvl(vzb.W(q1f0Var.b), b5x.K((urp) map5.get(u0f0Var3)), 2)));
                                } else if (q0f0Var instanceof mze0) {
                                    u0f0 u0f0Var4 = u0f0.y;
                                    lc00VarB.add(new szb(u0f0Var4, lsm0Var.a(R.string.registration_commercial_communication_checkbox, Arrays.copyOf(new Object[0], 0)), new yvl(vzb.W(q1f0Var.e), b5x.K((urp) map5.get(u0f0Var4)), 2)));
                                } else if (q0f0Var instanceof xze0) {
                                    u0f0 u0f0Var5 = u0f0.n1;
                                    lc00VarB.add(new szb(u0f0Var5, lsm0Var.a(R.string.registration_notify_news_call_checkbox, Arrays.copyOf(new Object[0], 0)), new yvl(vzb.W(q1f0Var.f), b5x.K((urp) map5.get(u0f0Var5)), 2)));
                                } else if (q0f0Var instanceof l0f0) {
                                    u0f0 u0f0Var6 = u0f0.x;
                                    lc00VarB.add(new szb(u0f0Var6, lsm0Var.a(R.string.get_results_of_my_bets_by_email_reg, Arrays.copyOf(new Object[0], 0)), new yvl(vzb.W(q1f0Var.A), b5x.K((urp) map5.get(u0f0Var6)), 2)));
                                } else if (q0f0Var instanceof m0f0) {
                                    u0f0 u0f0Var7 = u0f0.w;
                                    lc00VarB.add(new szb(u0f0Var7, lsm0Var.a(R.string.get_news_about_events_by_email, Arrays.copyOf(new Object[0], 0)), new yvl(vzb.W(q1f0Var.B), b5x.K((urp) map5.get(u0f0Var7)), 2)));
                                } else if (q0f0Var instanceof o0f0) {
                                    u0f0 u0f0Var8 = u0f0.z;
                                    lc00VarB.add(new szb(u0f0Var8, lsm0Var.a(R.string.share_personal_data_confirmation_checkbox_fixed_new, Arrays.copyOf(new Object[0], 0)), new yvl(vzb.W(q1f0Var.C), b5x.K((urp) map5.get(u0f0Var8)), 2)));
                                } else if (q0f0Var instanceof i0f0) {
                                    u0f0 u0f0Var9 = u0f0.A;
                                    lc00VarB.add(new szb(u0f0Var9, lsm0Var.a(R.string.registration_rules_confirmation_checkbox, Arrays.copyOf(new Object[0], 0)), new yvl(vzb.W(q1f0Var.x), b5x.K((urp) map5.get(u0f0Var9)), 2)));
                                } else if (q0f0Var instanceof j0f0) {
                                    str3.getClass();
                                    u0f0 u0f0Var10 = u0f0.B;
                                    lc00VarB.add(new szb(u0f0Var10, lsm0Var.a(R.string.registration_rules_confirmation_all_v2, Arrays.copyOf(new Object[]{str3}, 1)), new yvl(vzb.W(q1f0Var.y), b5x.K((urp) map5.get(u0f0Var10)), 2)));
                                } else if (q0f0Var instanceof n0f0) {
                                    u0f0 u0f0Var11 = u0f0.o1;
                                    lc00VarB.add(new szb(u0f0Var11, lsm0Var.a(R.string.receive_news_about_events_via_SMS, Arrays.copyOf(new Object[0], 0)), new yvl(vzb.W(q1f0Var.L), b5x.K((urp) map5.get(u0f0Var11)), 2)));
                                }
                            }
                        }
                        return dyb.r0(kotlin.collections.a.a(lc00VarB));
                    case 1:
                        q7f0 q7f0Var2 = (q7f0) obj;
                        ctf0 ctf0Var3 = ng1Var.b;
                        long jD = fbc.d(ctf0.b(R.attr.uikitSecondary, ctf0Var3));
                        ilm ilmVar = new ilm(jD);
                        lsm0 lsm0Var2 = ctf0Var3.b;
                        lsm0 lsm0Var3 = ctf0Var3.b;
                        String strA2 = lsm0Var2.a(R.string.registration, Arrays.copyOf(new Object[0], 0));
                        int i3 = q7f0Var2 == null ? -1 : dye0.f6888a[q7f0Var2.ordinal()];
                        if (i3 == -1) {
                            strA = "";
                        } else if (i3 == 1) {
                            strA = lsm0Var3.a(R.string.registration_by_email, Arrays.copyOf(new Object[0], 0));
                        } else if (i3 == 2) {
                            strA = lsm0Var3.a(R.string.registration_by_phone, Arrays.copyOf(new Object[0], 0));
                        } else if (i3 == 3) {
                            strA = lsm0Var3.a(R.string.one_click_registration_new, Arrays.copyOf(new Object[0], 0));
                        } else if (i3 == 4) {
                            strA = lsm0Var3.a(R.string.social_networks_new, Arrays.copyOf(new Object[0], 0));
                        } else {
                            if (i3 != 5) {
                                t9f.b();
                                return null;
                            }
                            strA = lsm0Var3.a(R.string.reg_import_personal_data, Arrays.copyOf(new Object[0], 0));
                        }
                        rlm rlmVar = new rlm(strA2, strA, jD, jD, fa50.f9191a);
                        pz40 pz40Var = s6t0.f31722a;
                        return new imm(ilmVar, rlmVar, fmm.f9790a, s6t0.b().f33626a.getBackgroundContent(), true, null);
                    case 2:
                        ((Boolean) obj).getClass();
                        return new iwe0(!((Boolean) ((fee) ng1Var.m.getValue()).c()).booleanValue(), new mtl(dyb.g0(new itl(new wul(iul.e, oe9.f25112a, new ue9(ng1Var.b.b.a(R.string.offer_to_auth_registration_button, Arrays.copyOf(new Object[0], 0))), (((Boolean) ((fee) ng1Var.n.getValue()).c()).booleanValue() || ((Boolean) ((fee) ng1Var.l.getValue()).c()).booleanValue() || ((Collection) ((fee) ng1Var.e.getValue()).c()).isEmpty()) ? false : true, false, false), sh00.o))));
                    default:
                        if (((Boolean) ((fee) ng1Var.m.getValue()).c()).booleanValue()) {
                            return new rwe0((mdm) ((fee) ng1Var.p.getValue()).c());
                        }
                        return ((Boolean) ((fee) ng1Var.l.getValue()).c()).booleanValue() ? swe0.f32920a : new qwe0((q7f0) ((fee) ng1Var.c.getValue()).c(), (u0f0) ((fee) ng1Var.o.getValue()).c(), (a4x) ((fee) ng1Var.q.getValue()).b());
                }
            }
        });
        final byte b3 = 2;
        this.s = bkb.G(((fee) n0o0VarH2.getValue()).d, new Function1(this) { // from class: a.cye0
            public final /* synthetic */ ng1 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:82:0x02e8  */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Map map;
                Object obj2;
                boolean z;
                boolean z2;
                int iIntValue;
                Map map2;
                Map map3;
                Integer numValueOf;
                boolean z3;
                Map map4;
                Integer numValueOf2;
                ygk0 ygk0Var;
                int i;
                Iterator it;
                DocumentStateModel documentStateModel;
                String strA;
                byte b4 = b3;
                ng1 ng1Var = this.b;
                switch (b4) {
                    case 0:
                        List list2 = (List) obj;
                        list2.getClass();
                        ctf0 ctf0Var2 = ng1Var.b;
                        List list3 = (List) ((fee) ng1Var.f.getValue()).c();
                        q7f0 q7f0Var = (q7f0) ((fee) ng1Var.c.getValue()).c();
                        if (q7f0Var == null || (map = (Map) ((Map) ((fee) ng1Var.i.getValue()).c()).get(q7f0Var)) == null) {
                            map = lun.f20680a;
                            map.getClass();
                        }
                        Map map5 = map;
                        q1f0 q1f0Var = (q1f0) ((fee) ng1Var.d.getValue()).c();
                        List list4 = (List) ((fee) ng1Var.j.getValue()).c();
                        aye0 aye0Var2 = (aye0) ng1Var.u;
                        boolean z4 = aye0Var2.q;
                        sff0 sff0Var = aye0Var2.m;
                        boolean z5 = sff0Var.m.s;
                        v8d v8dVar = aye0Var2.r;
                        boolean z6 = v8dVar.J;
                        boolean z7 = sff0Var.N.o;
                        List list5 = v8dVar.K;
                        Map map6 = (Map) ((fee) ng1Var.g.getValue()).c();
                        Map map7 = (Map) ((fee) ng1Var.h.getValue()).c();
                        boolean z8 = ((fee) ng1Var.k.getValue()).c() != null;
                        ctf0Var2.getClass();
                        list3.getClass();
                        map6.getClass();
                        map7.getClass();
                        q1f0Var.getClass();
                        CitizenshipStateModel citizenshipStateModel = q1f0Var.o;
                        list4.getClass();
                        list5.getClass();
                        lc00 lc00VarB = kotlin.collections.a.b();
                        Iterator it2 = list2.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                Object next = it2.next();
                                if (((q0f0) next) instanceof pze0) {
                                    obj2 = next;
                                }
                            } else {
                                obj2 = null;
                            }
                        }
                        boolean z9 = z8;
                        pze0 pze0Var = obj2 instanceof pze0 ? (pze0) obj2 : null;
                        String strJ0 = sj3.j0(pze0Var != null ? pze0Var.e : null, "18");
                        if (list5.isEmpty()) {
                            z = false;
                        } else {
                            String str = citizenshipStateModel != null ? citizenshipStateModel.b : null;
                            if (str == null || str.length() == 0 || list5.contains(Integer.valueOf(citizenshipStateModel.f46872a))) {
                                z = false;
                            } else {
                                z = true;
                            }
                        }
                        ArrayList arrayList = new ArrayList(r3d.q(list2, 10));
                        Iterator it3 = list2.iterator();
                        while (it3.hasNext()) {
                            Object zze0Var = (q0f0) it3.next();
                            String str2 = strJ0;
                            if ((zze0Var instanceof qze0) && z) {
                                it = it3;
                                zze0Var = new qze0(true, false);
                            } else {
                                it = it3;
                                if ((zze0Var instanceof a0f0) && z) {
                                    zze0Var = new a0f0(true, false);
                                } else if ((zze0Var instanceof zze0) && z6 && (documentStateModel = q1f0Var.j) != null && documentStateModel.f46876a == 126) {
                                    zze0Var = new zze0(((zze0) zze0Var).c, false);
                                }
                            }
                            arrayList.add(zze0Var);
                            strJ0 = str2;
                            it3 = it;
                        }
                        String str3 = strJ0;
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj3 : arrayList) {
                            if (!((q0f0) obj3).a()) {
                                arrayList2.add(obj3);
                            }
                        }
                        if (arrayList2.isEmpty()) {
                            z2 = z5;
                            map2 = map7;
                            map3 = map6;
                        } else {
                            Iterator it4 = arrayList2.iterator();
                            while (true) {
                                if (it4.hasNext()) {
                                    if (((q0f0) it4.next()) instanceof p0f0) {
                                        if (!z9) {
                                            boolean zD = Intrinsics.d(map5.get(u0f0.j), prp.f27476a);
                                            lc00 lc00VarB2 = kotlin.collections.a.b();
                                            Iterator it5 = list4.iterator();
                                            while (it5.hasNext()) {
                                                int iIntValue2 = ((Number) it5.next()).intValue();
                                                if (iIntValue2 == 1) {
                                                    numValueOf = Integer.valueOf(R.string.social_vk);
                                                } else if (iIntValue2 == 5) {
                                                    numValueOf = Integer.valueOf(R.string.social_ok);
                                                } else if (iIntValue2 == 7) {
                                                    numValueOf = Integer.valueOf(R.string.social_yandex);
                                                } else if (iIntValue2 == 9) {
                                                    numValueOf = Integer.valueOf(R.string.social_mailru_label_new);
                                                } else if (iIntValue2 == 11) {
                                                    numValueOf = Integer.valueOf(R.string.social_google);
                                                } else if (iIntValue2 == 13) {
                                                    numValueOf = Integer.valueOf(R.string.social_x_com);
                                                } else if (iIntValue2 == 17) {
                                                    numValueOf = Integer.valueOf(R.string.social_telegram);
                                                } else if (iIntValue2 == 19) {
                                                    numValueOf = Integer.valueOf(R.string.social_apple_id);
                                                } else if (iIntValue2 != 26) {
                                                    numValueOf = iIntValue2 != 31 ? null : Integer.valueOf(R.string.social_discord);
                                                } else {
                                                    numValueOf = Integer.valueOf(R.string.social_its_me);
                                                }
                                                if (numValueOf != null) {
                                                    int iIntValue3 = numValueOf.intValue();
                                                    z3 = z5;
                                                    if (iIntValue2 == 1) {
                                                        numValueOf2 = Integer.valueOf(R.drawable.ic_social_circle_vk);
                                                    } else if (iIntValue2 == 5) {
                                                        numValueOf2 = Integer.valueOf(R.drawable.ic_social_circle_ok);
                                                    } else if (iIntValue2 == 7) {
                                                        numValueOf2 = Integer.valueOf(R.drawable.ic_social_circle_yandex);
                                                    } else if (iIntValue2 == 9) {
                                                        numValueOf2 = Integer.valueOf(R.drawable.ic_social_circle_mail);
                                                    } else if (iIntValue2 == 11) {
                                                        numValueOf2 = Integer.valueOf(R.drawable.ic_social_circle_google);
                                                    } else if (iIntValue2 == 13) {
                                                        numValueOf2 = Integer.valueOf(R.drawable.ic_social_circle_x);
                                                    } else if (iIntValue2 == 17) {
                                                        numValueOf2 = Integer.valueOf(R.drawable.ic_social_circle_telegram);
                                                    } else if (iIntValue2 == 19) {
                                                        numValueOf2 = Integer.valueOf(R.drawable.ic_social_circle_apple);
                                                    } else if (iIntValue2 != 26) {
                                                        numValueOf2 = iIntValue2 != 31 ? null : Integer.valueOf(R.drawable.ic_social_circle_discord);
                                                    } else {
                                                        numValueOf2 = Integer.valueOf(R.drawable.ic_social_circle_itsme);
                                                    }
                                                    if (numValueOf2 != null) {
                                                        int iIntValue4 = numValueOf2.intValue();
                                                        if (zD) {
                                                            map4 = map7;
                                                            ygk0Var = ygk0.b;
                                                        } else {
                                                            map4 = map7;
                                                            Integer num = q1f0Var.D;
                                                            ygk0Var = (num != null && num.intValue() == iIntValue2) ? ygk0.f42589a : ygk0.c;
                                                        }
                                                        lc00VarB2.add(new bhk0(iIntValue2, iIntValue4, ygk0Var, ctf0Var2.b.a(iIntValue3, Arrays.copyOf(new Object[0], 0))));
                                                    }
                                                    it5 = it5;
                                                    map7 = map4;
                                                    map6 = map6;
                                                    arrayList2 = arrayList2;
                                                    map5 = map5;
                                                    z5 = z3;
                                                } else {
                                                    z3 = z5;
                                                }
                                                map4 = map7;
                                                it5 = it5;
                                                map7 = map4;
                                                map6 = map6;
                                                arrayList2 = arrayList2;
                                                map5 = map5;
                                                z5 = z3;
                                            }
                                            z2 = z5;
                                            Map map8 = map7;
                                            Map map9 = map6;
                                            ArrayList arrayList3 = arrayList2;
                                            Map map10 = map5;
                                            lc00 lc00VarA = kotlin.collections.a.a(lc00VarB2);
                                            int iC = ctf0Var2.c();
                                            int size = list4.size();
                                            Integer numValueOf3 = size <= 0 ? 1 : size <= 4 ? Integer.valueOf(size) : null;
                                            if (numValueOf3 != null) {
                                                iIntValue = numValueOf3.intValue();
                                            } else if (320 > iC || iC >= 411) {
                                                iIntValue = (411 > iC || iC >= 600) ? 8 : 6;
                                            } else {
                                                iIntValue = 5;
                                            }
                                            if (numValueOf3 == null) {
                                                while (iIntValue > 2 && size % iIntValue == 1) {
                                                    iIntValue--;
                                                }
                                            }
                                            int i2 = iIntValue * 3;
                                            boolean z10 = q1f0Var.K;
                                            lc00 lc00VarB3 = kotlin.collections.a.b();
                                            if (!z10 && lc00VarA.b() > i2) {
                                                lc00VarB3.addAll(CollectionsKt.D0(lc00VarA, i2 - 1));
                                                lc00VarB3.add(new tgk0(false));
                                            } else if (!z10 || lc00VarA.b() <= i2) {
                                                lc00VarB3.addAll(lc00VarA);
                                            } else {
                                                lc00VarB3.addAll(lc00VarA);
                                                lc00VarB3.add(new tgk0(true));
                                            }
                                            lc00 lc00VarA2 = kotlin.collections.a.a(lc00VarB3);
                                            u0f0 u0f0Var = u0f0.f34852a;
                                            lc00VarB.add(new gjk0(lc00VarA2, zD, iIntValue));
                                            map2 = map8;
                                            map3 = map9;
                                            arrayList2 = arrayList3;
                                            map5 = map10;
                                        }
                                    }
                                }
                                z2 = z5;
                                map2 = map7;
                                map3 = map6;
                            }
                        }
                        b5x.u(lc00VarB, ctf0Var2, arrayList2, map5, map3, map2, q1f0Var, list3, z7);
                        ArrayList<q0f0> arrayList4 = arrayList2;
                        if (z4) {
                            i = 0;
                        } else {
                            i = 0;
                            lc00VarB.add(new n02(u0f0.i1, ctf0Var2.b.a(R.string.company_rules, Arrays.copyOf(new Object[0], 0))));
                        }
                        u0f0 u0f0Var2 = u0f0.j1;
                        lsm0 lsm0Var = ctf0Var2.b;
                        lc00VarB.add(new n02(u0f0Var2, lsm0Var.a(R.string.info_privacy_policy, Arrays.copyOf(new Object[i], i))));
                        if (z2) {
                            lc00VarB.add(new n02(u0f0.k1, lsm0Var.a(R.string.responsible_game, Arrays.copyOf(new Object[i], i))));
                        }
                        for (q0f0 q0f0Var : arrayList4) {
                            if (q0f0Var != null) {
                                if (q0f0Var instanceof hze0) {
                                    str3.getClass();
                                    u0f0 u0f0Var3 = u0f0.f1;
                                    lc00VarB.add(new szb(u0f0Var3, lsm0Var.a(R.string.min_age_confirmation_checkbox_v2, Arrays.copyOf(new Object[]{str3}, 1)), new yvl(vzb.W(q1f0Var.b), b5x.K((urp) map5.get(u0f0Var3)), 2)));
                                } else if (q0f0Var instanceof mze0) {
                                    u0f0 u0f0Var4 = u0f0.y;
                                    lc00VarB.add(new szb(u0f0Var4, lsm0Var.a(R.string.registration_commercial_communication_checkbox, Arrays.copyOf(new Object[0], 0)), new yvl(vzb.W(q1f0Var.e), b5x.K((urp) map5.get(u0f0Var4)), 2)));
                                } else if (q0f0Var instanceof xze0) {
                                    u0f0 u0f0Var5 = u0f0.n1;
                                    lc00VarB.add(new szb(u0f0Var5, lsm0Var.a(R.string.registration_notify_news_call_checkbox, Arrays.copyOf(new Object[0], 0)), new yvl(vzb.W(q1f0Var.f), b5x.K((urp) map5.get(u0f0Var5)), 2)));
                                } else if (q0f0Var instanceof l0f0) {
                                    u0f0 u0f0Var6 = u0f0.x;
                                    lc00VarB.add(new szb(u0f0Var6, lsm0Var.a(R.string.get_results_of_my_bets_by_email_reg, Arrays.copyOf(new Object[0], 0)), new yvl(vzb.W(q1f0Var.A), b5x.K((urp) map5.get(u0f0Var6)), 2)));
                                } else if (q0f0Var instanceof m0f0) {
                                    u0f0 u0f0Var7 = u0f0.w;
                                    lc00VarB.add(new szb(u0f0Var7, lsm0Var.a(R.string.get_news_about_events_by_email, Arrays.copyOf(new Object[0], 0)), new yvl(vzb.W(q1f0Var.B), b5x.K((urp) map5.get(u0f0Var7)), 2)));
                                } else if (q0f0Var instanceof o0f0) {
                                    u0f0 u0f0Var8 = u0f0.z;
                                    lc00VarB.add(new szb(u0f0Var8, lsm0Var.a(R.string.share_personal_data_confirmation_checkbox_fixed_new, Arrays.copyOf(new Object[0], 0)), new yvl(vzb.W(q1f0Var.C), b5x.K((urp) map5.get(u0f0Var8)), 2)));
                                } else if (q0f0Var instanceof i0f0) {
                                    u0f0 u0f0Var9 = u0f0.A;
                                    lc00VarB.add(new szb(u0f0Var9, lsm0Var.a(R.string.registration_rules_confirmation_checkbox, Arrays.copyOf(new Object[0], 0)), new yvl(vzb.W(q1f0Var.x), b5x.K((urp) map5.get(u0f0Var9)), 2)));
                                } else if (q0f0Var instanceof j0f0) {
                                    str3.getClass();
                                    u0f0 u0f0Var10 = u0f0.B;
                                    lc00VarB.add(new szb(u0f0Var10, lsm0Var.a(R.string.registration_rules_confirmation_all_v2, Arrays.copyOf(new Object[]{str3}, 1)), new yvl(vzb.W(q1f0Var.y), b5x.K((urp) map5.get(u0f0Var10)), 2)));
                                } else if (q0f0Var instanceof n0f0) {
                                    u0f0 u0f0Var11 = u0f0.o1;
                                    lc00VarB.add(new szb(u0f0Var11, lsm0Var.a(R.string.receive_news_about_events_via_SMS, Arrays.copyOf(new Object[0], 0)), new yvl(vzb.W(q1f0Var.L), b5x.K((urp) map5.get(u0f0Var11)), 2)));
                                }
                            }
                        }
                        return dyb.r0(kotlin.collections.a.a(lc00VarB));
                    case 1:
                        q7f0 q7f0Var2 = (q7f0) obj;
                        ctf0 ctf0Var3 = ng1Var.b;
                        long jD = fbc.d(ctf0.b(R.attr.uikitSecondary, ctf0Var3));
                        ilm ilmVar = new ilm(jD);
                        lsm0 lsm0Var2 = ctf0Var3.b;
                        lsm0 lsm0Var3 = ctf0Var3.b;
                        String strA2 = lsm0Var2.a(R.string.registration, Arrays.copyOf(new Object[0], 0));
                        int i3 = q7f0Var2 == null ? -1 : dye0.f6888a[q7f0Var2.ordinal()];
                        if (i3 == -1) {
                            strA = "";
                        } else if (i3 == 1) {
                            strA = lsm0Var3.a(R.string.registration_by_email, Arrays.copyOf(new Object[0], 0));
                        } else if (i3 == 2) {
                            strA = lsm0Var3.a(R.string.registration_by_phone, Arrays.copyOf(new Object[0], 0));
                        } else if (i3 == 3) {
                            strA = lsm0Var3.a(R.string.one_click_registration_new, Arrays.copyOf(new Object[0], 0));
                        } else if (i3 == 4) {
                            strA = lsm0Var3.a(R.string.social_networks_new, Arrays.copyOf(new Object[0], 0));
                        } else {
                            if (i3 != 5) {
                                t9f.b();
                                return null;
                            }
                            strA = lsm0Var3.a(R.string.reg_import_personal_data, Arrays.copyOf(new Object[0], 0));
                        }
                        rlm rlmVar = new rlm(strA2, strA, jD, jD, fa50.f9191a);
                        pz40 pz40Var = s6t0.f31722a;
                        return new imm(ilmVar, rlmVar, fmm.f9790a, s6t0.b().f33626a.getBackgroundContent(), true, null);
                    case 2:
                        ((Boolean) obj).getClass();
                        return new iwe0(!((Boolean) ((fee) ng1Var.m.getValue()).c()).booleanValue(), new mtl(dyb.g0(new itl(new wul(iul.e, oe9.f25112a, new ue9(ng1Var.b.b.a(R.string.offer_to_auth_registration_button, Arrays.copyOf(new Object[0], 0))), (((Boolean) ((fee) ng1Var.n.getValue()).c()).booleanValue() || ((Boolean) ((fee) ng1Var.l.getValue()).c()).booleanValue() || ((Collection) ((fee) ng1Var.e.getValue()).c()).isEmpty()) ? false : true, false, false), sh00.o))));
                    default:
                        if (((Boolean) ((fee) ng1Var.m.getValue()).c()).booleanValue()) {
                            return new rwe0((mdm) ((fee) ng1Var.p.getValue()).c());
                        }
                        return ((Boolean) ((fee) ng1Var.l.getValue()).c()).booleanValue() ? swe0.f32920a : new qwe0((q7f0) ((fee) ng1Var.c.getValue()).c(), (u0f0) ((fee) ng1Var.o.getValue()).c(), (a4x) ((fee) ng1Var.q.getValue()).b());
                }
            }
        });
        final byte b4 = 3;
        this.t = bkb.G(((fee) n0o0VarH.getValue()).d, new Function1(this) { // from class: a.cye0
            public final /* synthetic */ ng1 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:82:0x02e8  */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Map map;
                Object obj2;
                boolean z;
                boolean z2;
                int iIntValue;
                Map map2;
                Map map3;
                Integer numValueOf;
                boolean z3;
                Map map4;
                Integer numValueOf2;
                ygk0 ygk0Var;
                int i;
                Iterator it;
                DocumentStateModel documentStateModel;
                String strA;
                byte b5 = b4;
                ng1 ng1Var = this.b;
                switch (b5) {
                    case 0:
                        List list2 = (List) obj;
                        list2.getClass();
                        ctf0 ctf0Var2 = ng1Var.b;
                        List list3 = (List) ((fee) ng1Var.f.getValue()).c();
                        q7f0 q7f0Var = (q7f0) ((fee) ng1Var.c.getValue()).c();
                        if (q7f0Var == null || (map = (Map) ((Map) ((fee) ng1Var.i.getValue()).c()).get(q7f0Var)) == null) {
                            map = lun.f20680a;
                            map.getClass();
                        }
                        Map map5 = map;
                        q1f0 q1f0Var = (q1f0) ((fee) ng1Var.d.getValue()).c();
                        List list4 = (List) ((fee) ng1Var.j.getValue()).c();
                        aye0 aye0Var2 = (aye0) ng1Var.u;
                        boolean z4 = aye0Var2.q;
                        sff0 sff0Var = aye0Var2.m;
                        boolean z5 = sff0Var.m.s;
                        v8d v8dVar = aye0Var2.r;
                        boolean z6 = v8dVar.J;
                        boolean z7 = sff0Var.N.o;
                        List list5 = v8dVar.K;
                        Map map6 = (Map) ((fee) ng1Var.g.getValue()).c();
                        Map map7 = (Map) ((fee) ng1Var.h.getValue()).c();
                        boolean z8 = ((fee) ng1Var.k.getValue()).c() != null;
                        ctf0Var2.getClass();
                        list3.getClass();
                        map6.getClass();
                        map7.getClass();
                        q1f0Var.getClass();
                        CitizenshipStateModel citizenshipStateModel = q1f0Var.o;
                        list4.getClass();
                        list5.getClass();
                        lc00 lc00VarB = kotlin.collections.a.b();
                        Iterator it2 = list2.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                Object next = it2.next();
                                if (((q0f0) next) instanceof pze0) {
                                    obj2 = next;
                                }
                            } else {
                                obj2 = null;
                            }
                        }
                        boolean z9 = z8;
                        pze0 pze0Var = obj2 instanceof pze0 ? (pze0) obj2 : null;
                        String strJ0 = sj3.j0(pze0Var != null ? pze0Var.e : null, "18");
                        if (list5.isEmpty()) {
                            z = false;
                        } else {
                            String str = citizenshipStateModel != null ? citizenshipStateModel.b : null;
                            if (str == null || str.length() == 0 || list5.contains(Integer.valueOf(citizenshipStateModel.f46872a))) {
                                z = false;
                            } else {
                                z = true;
                            }
                        }
                        ArrayList arrayList = new ArrayList(r3d.q(list2, 10));
                        Iterator it3 = list2.iterator();
                        while (it3.hasNext()) {
                            Object zze0Var = (q0f0) it3.next();
                            String str2 = strJ0;
                            if ((zze0Var instanceof qze0) && z) {
                                it = it3;
                                zze0Var = new qze0(true, false);
                            } else {
                                it = it3;
                                if ((zze0Var instanceof a0f0) && z) {
                                    zze0Var = new a0f0(true, false);
                                } else if ((zze0Var instanceof zze0) && z6 && (documentStateModel = q1f0Var.j) != null && documentStateModel.f46876a == 126) {
                                    zze0Var = new zze0(((zze0) zze0Var).c, false);
                                }
                            }
                            arrayList.add(zze0Var);
                            strJ0 = str2;
                            it3 = it;
                        }
                        String str3 = strJ0;
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj3 : arrayList) {
                            if (!((q0f0) obj3).a()) {
                                arrayList2.add(obj3);
                            }
                        }
                        if (arrayList2.isEmpty()) {
                            z2 = z5;
                            map2 = map7;
                            map3 = map6;
                        } else {
                            Iterator it4 = arrayList2.iterator();
                            while (true) {
                                if (it4.hasNext()) {
                                    if (((q0f0) it4.next()) instanceof p0f0) {
                                        if (!z9) {
                                            boolean zD = Intrinsics.d(map5.get(u0f0.j), prp.f27476a);
                                            lc00 lc00VarB2 = kotlin.collections.a.b();
                                            Iterator it5 = list4.iterator();
                                            while (it5.hasNext()) {
                                                int iIntValue2 = ((Number) it5.next()).intValue();
                                                if (iIntValue2 == 1) {
                                                    numValueOf = Integer.valueOf(R.string.social_vk);
                                                } else if (iIntValue2 == 5) {
                                                    numValueOf = Integer.valueOf(R.string.social_ok);
                                                } else if (iIntValue2 == 7) {
                                                    numValueOf = Integer.valueOf(R.string.social_yandex);
                                                } else if (iIntValue2 == 9) {
                                                    numValueOf = Integer.valueOf(R.string.social_mailru_label_new);
                                                } else if (iIntValue2 == 11) {
                                                    numValueOf = Integer.valueOf(R.string.social_google);
                                                } else if (iIntValue2 == 13) {
                                                    numValueOf = Integer.valueOf(R.string.social_x_com);
                                                } else if (iIntValue2 == 17) {
                                                    numValueOf = Integer.valueOf(R.string.social_telegram);
                                                } else if (iIntValue2 == 19) {
                                                    numValueOf = Integer.valueOf(R.string.social_apple_id);
                                                } else if (iIntValue2 != 26) {
                                                    numValueOf = iIntValue2 != 31 ? null : Integer.valueOf(R.string.social_discord);
                                                } else {
                                                    numValueOf = Integer.valueOf(R.string.social_its_me);
                                                }
                                                if (numValueOf != null) {
                                                    int iIntValue3 = numValueOf.intValue();
                                                    z3 = z5;
                                                    if (iIntValue2 == 1) {
                                                        numValueOf2 = Integer.valueOf(R.drawable.ic_social_circle_vk);
                                                    } else if (iIntValue2 == 5) {
                                                        numValueOf2 = Integer.valueOf(R.drawable.ic_social_circle_ok);
                                                    } else if (iIntValue2 == 7) {
                                                        numValueOf2 = Integer.valueOf(R.drawable.ic_social_circle_yandex);
                                                    } else if (iIntValue2 == 9) {
                                                        numValueOf2 = Integer.valueOf(R.drawable.ic_social_circle_mail);
                                                    } else if (iIntValue2 == 11) {
                                                        numValueOf2 = Integer.valueOf(R.drawable.ic_social_circle_google);
                                                    } else if (iIntValue2 == 13) {
                                                        numValueOf2 = Integer.valueOf(R.drawable.ic_social_circle_x);
                                                    } else if (iIntValue2 == 17) {
                                                        numValueOf2 = Integer.valueOf(R.drawable.ic_social_circle_telegram);
                                                    } else if (iIntValue2 == 19) {
                                                        numValueOf2 = Integer.valueOf(R.drawable.ic_social_circle_apple);
                                                    } else if (iIntValue2 != 26) {
                                                        numValueOf2 = iIntValue2 != 31 ? null : Integer.valueOf(R.drawable.ic_social_circle_discord);
                                                    } else {
                                                        numValueOf2 = Integer.valueOf(R.drawable.ic_social_circle_itsme);
                                                    }
                                                    if (numValueOf2 != null) {
                                                        int iIntValue4 = numValueOf2.intValue();
                                                        if (zD) {
                                                            map4 = map7;
                                                            ygk0Var = ygk0.b;
                                                        } else {
                                                            map4 = map7;
                                                            Integer num = q1f0Var.D;
                                                            ygk0Var = (num != null && num.intValue() == iIntValue2) ? ygk0.f42589a : ygk0.c;
                                                        }
                                                        lc00VarB2.add(new bhk0(iIntValue2, iIntValue4, ygk0Var, ctf0Var2.b.a(iIntValue3, Arrays.copyOf(new Object[0], 0))));
                                                    }
                                                    it5 = it5;
                                                    map7 = map4;
                                                    map6 = map6;
                                                    arrayList2 = arrayList2;
                                                    map5 = map5;
                                                    z5 = z3;
                                                } else {
                                                    z3 = z5;
                                                }
                                                map4 = map7;
                                                it5 = it5;
                                                map7 = map4;
                                                map6 = map6;
                                                arrayList2 = arrayList2;
                                                map5 = map5;
                                                z5 = z3;
                                            }
                                            z2 = z5;
                                            Map map8 = map7;
                                            Map map9 = map6;
                                            ArrayList arrayList3 = arrayList2;
                                            Map map10 = map5;
                                            lc00 lc00VarA = kotlin.collections.a.a(lc00VarB2);
                                            int iC = ctf0Var2.c();
                                            int size = list4.size();
                                            Integer numValueOf3 = size <= 0 ? 1 : size <= 4 ? Integer.valueOf(size) : null;
                                            if (numValueOf3 != null) {
                                                iIntValue = numValueOf3.intValue();
                                            } else if (320 > iC || iC >= 411) {
                                                iIntValue = (411 > iC || iC >= 600) ? 8 : 6;
                                            } else {
                                                iIntValue = 5;
                                            }
                                            if (numValueOf3 == null) {
                                                while (iIntValue > 2 && size % iIntValue == 1) {
                                                    iIntValue--;
                                                }
                                            }
                                            int i2 = iIntValue * 3;
                                            boolean z10 = q1f0Var.K;
                                            lc00 lc00VarB3 = kotlin.collections.a.b();
                                            if (!z10 && lc00VarA.b() > i2) {
                                                lc00VarB3.addAll(CollectionsKt.D0(lc00VarA, i2 - 1));
                                                lc00VarB3.add(new tgk0(false));
                                            } else if (!z10 || lc00VarA.b() <= i2) {
                                                lc00VarB3.addAll(lc00VarA);
                                            } else {
                                                lc00VarB3.addAll(lc00VarA);
                                                lc00VarB3.add(new tgk0(true));
                                            }
                                            lc00 lc00VarA2 = kotlin.collections.a.a(lc00VarB3);
                                            u0f0 u0f0Var = u0f0.f34852a;
                                            lc00VarB.add(new gjk0(lc00VarA2, zD, iIntValue));
                                            map2 = map8;
                                            map3 = map9;
                                            arrayList2 = arrayList3;
                                            map5 = map10;
                                        }
                                    }
                                }
                                z2 = z5;
                                map2 = map7;
                                map3 = map6;
                            }
                        }
                        b5x.u(lc00VarB, ctf0Var2, arrayList2, map5, map3, map2, q1f0Var, list3, z7);
                        ArrayList<q0f0> arrayList4 = arrayList2;
                        if (z4) {
                            i = 0;
                        } else {
                            i = 0;
                            lc00VarB.add(new n02(u0f0.i1, ctf0Var2.b.a(R.string.company_rules, Arrays.copyOf(new Object[0], 0))));
                        }
                        u0f0 u0f0Var2 = u0f0.j1;
                        lsm0 lsm0Var = ctf0Var2.b;
                        lc00VarB.add(new n02(u0f0Var2, lsm0Var.a(R.string.info_privacy_policy, Arrays.copyOf(new Object[i], i))));
                        if (z2) {
                            lc00VarB.add(new n02(u0f0.k1, lsm0Var.a(R.string.responsible_game, Arrays.copyOf(new Object[i], i))));
                        }
                        for (q0f0 q0f0Var : arrayList4) {
                            if (q0f0Var != null) {
                                if (q0f0Var instanceof hze0) {
                                    str3.getClass();
                                    u0f0 u0f0Var3 = u0f0.f1;
                                    lc00VarB.add(new szb(u0f0Var3, lsm0Var.a(R.string.min_age_confirmation_checkbox_v2, Arrays.copyOf(new Object[]{str3}, 1)), new yvl(vzb.W(q1f0Var.b), b5x.K((urp) map5.get(u0f0Var3)), 2)));
                                } else if (q0f0Var instanceof mze0) {
                                    u0f0 u0f0Var4 = u0f0.y;
                                    lc00VarB.add(new szb(u0f0Var4, lsm0Var.a(R.string.registration_commercial_communication_checkbox, Arrays.copyOf(new Object[0], 0)), new yvl(vzb.W(q1f0Var.e), b5x.K((urp) map5.get(u0f0Var4)), 2)));
                                } else if (q0f0Var instanceof xze0) {
                                    u0f0 u0f0Var5 = u0f0.n1;
                                    lc00VarB.add(new szb(u0f0Var5, lsm0Var.a(R.string.registration_notify_news_call_checkbox, Arrays.copyOf(new Object[0], 0)), new yvl(vzb.W(q1f0Var.f), b5x.K((urp) map5.get(u0f0Var5)), 2)));
                                } else if (q0f0Var instanceof l0f0) {
                                    u0f0 u0f0Var6 = u0f0.x;
                                    lc00VarB.add(new szb(u0f0Var6, lsm0Var.a(R.string.get_results_of_my_bets_by_email_reg, Arrays.copyOf(new Object[0], 0)), new yvl(vzb.W(q1f0Var.A), b5x.K((urp) map5.get(u0f0Var6)), 2)));
                                } else if (q0f0Var instanceof m0f0) {
                                    u0f0 u0f0Var7 = u0f0.w;
                                    lc00VarB.add(new szb(u0f0Var7, lsm0Var.a(R.string.get_news_about_events_by_email, Arrays.copyOf(new Object[0], 0)), new yvl(vzb.W(q1f0Var.B), b5x.K((urp) map5.get(u0f0Var7)), 2)));
                                } else if (q0f0Var instanceof o0f0) {
                                    u0f0 u0f0Var8 = u0f0.z;
                                    lc00VarB.add(new szb(u0f0Var8, lsm0Var.a(R.string.share_personal_data_confirmation_checkbox_fixed_new, Arrays.copyOf(new Object[0], 0)), new yvl(vzb.W(q1f0Var.C), b5x.K((urp) map5.get(u0f0Var8)), 2)));
                                } else if (q0f0Var instanceof i0f0) {
                                    u0f0 u0f0Var9 = u0f0.A;
                                    lc00VarB.add(new szb(u0f0Var9, lsm0Var.a(R.string.registration_rules_confirmation_checkbox, Arrays.copyOf(new Object[0], 0)), new yvl(vzb.W(q1f0Var.x), b5x.K((urp) map5.get(u0f0Var9)), 2)));
                                } else if (q0f0Var instanceof j0f0) {
                                    str3.getClass();
                                    u0f0 u0f0Var10 = u0f0.B;
                                    lc00VarB.add(new szb(u0f0Var10, lsm0Var.a(R.string.registration_rules_confirmation_all_v2, Arrays.copyOf(new Object[]{str3}, 1)), new yvl(vzb.W(q1f0Var.y), b5x.K((urp) map5.get(u0f0Var10)), 2)));
                                } else if (q0f0Var instanceof n0f0) {
                                    u0f0 u0f0Var11 = u0f0.o1;
                                    lc00VarB.add(new szb(u0f0Var11, lsm0Var.a(R.string.receive_news_about_events_via_SMS, Arrays.copyOf(new Object[0], 0)), new yvl(vzb.W(q1f0Var.L), b5x.K((urp) map5.get(u0f0Var11)), 2)));
                                }
                            }
                        }
                        return dyb.r0(kotlin.collections.a.a(lc00VarB));
                    case 1:
                        q7f0 q7f0Var2 = (q7f0) obj;
                        ctf0 ctf0Var3 = ng1Var.b;
                        long jD = fbc.d(ctf0.b(R.attr.uikitSecondary, ctf0Var3));
                        ilm ilmVar = new ilm(jD);
                        lsm0 lsm0Var2 = ctf0Var3.b;
                        lsm0 lsm0Var3 = ctf0Var3.b;
                        String strA2 = lsm0Var2.a(R.string.registration, Arrays.copyOf(new Object[0], 0));
                        int i3 = q7f0Var2 == null ? -1 : dye0.f6888a[q7f0Var2.ordinal()];
                        if (i3 == -1) {
                            strA = "";
                        } else if (i3 == 1) {
                            strA = lsm0Var3.a(R.string.registration_by_email, Arrays.copyOf(new Object[0], 0));
                        } else if (i3 == 2) {
                            strA = lsm0Var3.a(R.string.registration_by_phone, Arrays.copyOf(new Object[0], 0));
                        } else if (i3 == 3) {
                            strA = lsm0Var3.a(R.string.one_click_registration_new, Arrays.copyOf(new Object[0], 0));
                        } else if (i3 == 4) {
                            strA = lsm0Var3.a(R.string.social_networks_new, Arrays.copyOf(new Object[0], 0));
                        } else {
                            if (i3 != 5) {
                                t9f.b();
                                return null;
                            }
                            strA = lsm0Var3.a(R.string.reg_import_personal_data, Arrays.copyOf(new Object[0], 0));
                        }
                        rlm rlmVar = new rlm(strA2, strA, jD, jD, fa50.f9191a);
                        pz40 pz40Var = s6t0.f31722a;
                        return new imm(ilmVar, rlmVar, fmm.f9790a, s6t0.b().f33626a.getBackgroundContent(), true, null);
                    case 2:
                        ((Boolean) obj).getClass();
                        return new iwe0(!((Boolean) ((fee) ng1Var.m.getValue()).c()).booleanValue(), new mtl(dyb.g0(new itl(new wul(iul.e, oe9.f25112a, new ue9(ng1Var.b.b.a(R.string.offer_to_auth_registration_button, Arrays.copyOf(new Object[0], 0))), (((Boolean) ((fee) ng1Var.n.getValue()).c()).booleanValue() || ((Boolean) ((fee) ng1Var.l.getValue()).c()).booleanValue() || ((Collection) ((fee) ng1Var.e.getValue()).c()).isEmpty()) ? false : true, false, false), sh00.o))));
                    default:
                        if (((Boolean) ((fee) ng1Var.m.getValue()).c()).booleanValue()) {
                            return new rwe0((mdm) ((fee) ng1Var.p.getValue()).c());
                        }
                        return ((Boolean) ((fee) ng1Var.l.getValue()).c()).booleanValue() ? swe0.f32920a : new qwe0((q7f0) ((fee) ng1Var.c.getValue()).c(), (u0f0) ((fee) ng1Var.o.getValue()).c(), (a4x) ((fee) ng1Var.q.getValue()).b());
                }
            }
        });
    }
}
