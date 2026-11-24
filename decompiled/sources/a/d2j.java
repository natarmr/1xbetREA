package a;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes5.dex */
public final class d2j implements v6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f5357a = 0;
    public final ctf0 b;
    public final n0o0 c;
    public final n0o0 d;
    public final n0o0 e;
    public final n0o0 f;
    public final n0o0 g;
    public final n0o0 h;

    public d2j(zqc0 zqc0Var, ctf0 ctf0Var) {
        ctf0Var.getClass();
        this.b = ctf0Var;
        n0o0 n0o0VarH = bkb.H(zqc0Var.d);
        this.c = n0o0VarH;
        this.d = bkb.H(Boolean.valueOf(zqc0Var.f44802a));
        this.e = bkb.H(Boolean.valueOf(zqc0Var.b));
        final byte b = 0;
        this.f = maz.b(new yw9((fee) n0o0VarH.getValue(), new Function1(this) { // from class: a.krc0
            public final /* synthetic */ d2j b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                cuc0 buc0Var;
                byte b2 = b;
                d2j d2jVar = this.b;
                switch (b2) {
                    case 0:
                        fee feeVar = (fee) obj;
                        feeVar.getClass();
                        List<vrc0> list = (List) feeVar.c();
                        if (list.isEmpty()) {
                            guc0 guc0Var = guc0.b;
                            zcl zclVar = qmk.f28987a;
                            return new muc0(guc0Var, new lh80(16.0f, 8.0f, 16.0f, 16.0f));
                        }
                        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                        for (vrc0 vrc0Var : list) {
                            ctf0 ctf0Var2 = d2jVar.b;
                            if (vrc0Var != null) {
                                if (vrc0Var instanceof trc0) {
                                    trc0 trc0Var = (trc0) vrc0Var;
                                    long j = trc0Var.f34417a;
                                    n0x n0xVar = new n0x(trc0Var.k);
                                    String str = trc0Var.c;
                                    int i = trc0Var.h;
                                    buc0Var = new auc0(j, str, i > 0 ? new tda(new rpe(i), ctf0Var2.b.a(R.string.fs, Arrays.copyOf(new Object[0], 0))) : null, null, n0xVar);
                                } else if (vrc0Var instanceof urc0) {
                                    urc0 urc0Var = (urc0) vrc0Var;
                                    long j2 = urc0Var.f36158a;
                                    hds hdsVar = urc0Var.l;
                                    String str2 = urc0Var.c;
                                    int i2 = urc0Var.h;
                                    buc0Var = new buc0(j2, str2, i2 > 0 ? new tda(new rpe(i2), ctf0Var2.b.a(R.string.fs, Arrays.copyOf(new Object[0], 0))) : null, null, hdsVar);
                                }
                                arrayList.add(buc0Var);
                            }
                            t9f.b();
                            return null;
                        }
                        a4x a4xVarO0 = dyb.o0(arrayList);
                        guc0 guc0Var2 = guc0.b;
                        zcl zclVar2 = qmk.f28987a;
                        return new luc0(a4xVarO0, guc0Var2, new lh80(16.0f, 8.0f, 16.0f, 16.0f));
                    default:
                        arc0 arc0Var = (arc0) obj;
                        arc0Var.getClass();
                        src0 src0Var = arc0Var.h;
                        int i3 = arc0Var.d;
                        int i4 = arc0Var.c;
                        int i5 = arc0Var.b;
                        String str3 = arc0Var.e;
                        int i6 = arc0Var.f;
                        int i7 = arc0Var.g;
                        src0 src0Var2 = src0.f;
                        ctf0 ctf0Var3 = d2jVar.b;
                        String strA = src0Var == src0Var2 ? ctf0Var3.b.a(R.string.promocode_casino_subtitle, Arrays.copyOf(new Object[]{str3, String.valueOf(i6), String.valueOf(i7)}, 3)) : ctf0Var3.b.a(R.string.promocode_subtitle, Arrays.copyOf(new Object[]{str3, String.valueOf(i6)}, 2));
                        String str4 = arc0Var.f1339a;
                        int iOrdinal = src0Var.ordinal();
                        int i8 = iOrdinal != 2 ? iOrdinal != 4 ? R.string.promo_cost : R.string.promo_cost_kit : R.string.promo_games_count;
                        lsm0 lsm0Var = ctf0Var3.b;
                        lsm0 lsm0Var2 = ctf0Var3.b;
                        String strA2 = lsm0Var.a(i8, Arrays.copyOf(new Object[0], 0));
                        String strValueOf = String.valueOf((src0Var == src0Var2 || src0Var == src0.d) ? i4 : i5);
                        String strA3 = lsm0Var2.a(R.string.promo_points, Arrays.copyOf(new Object[]{Integer.valueOf(i3)}, 1));
                        wul wulVar = new wul(iul.e, oe9.f25112a, new ue9(lsm0Var2.a(R.string.promo_buy_for_pts_v2, Arrays.copyOf(new Object[]{Integer.valueOf(i5)}, 1))), true, false, false);
                        mul mulVar = mul.e;
                        oe9 oe9Var = oe9.c;
                        return new frc0(strA, str4, strA2, strValueOf, strA3, wulVar, new wul(mulVar, oe9Var, new te9(R.drawable.ic_glyph_plus_small), i5 + i6 <= i3, false, false), new wul(mulVar, oe9Var, new te9(R.drawable.ic_glyph_minus_small), i5 > i6, false, false), src0Var == src0Var2 ? lsm0Var2.a(R.string.promo_points_fs, Arrays.copyOf(new Object[]{Integer.valueOf(i7 * i4)}, 1)) : "");
                }
            }
        }, (byte) 20));
        this.g = maz.b(new yw9(new crc0("", ""), new ljc0(this), (byte) 20));
        final byte b2 = 1;
        this.h = maz.b(new yw9(new arc0("", 0, 0, 0, "", 0, 0, src0.b), new Function1(this) { // from class: a.krc0
            public final /* synthetic */ d2j b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                cuc0 buc0Var;
                byte b3 = b2;
                d2j d2jVar = this.b;
                switch (b3) {
                    case 0:
                        fee feeVar = (fee) obj;
                        feeVar.getClass();
                        List<vrc0> list = (List) feeVar.c();
                        if (list.isEmpty()) {
                            guc0 guc0Var = guc0.b;
                            zcl zclVar = qmk.f28987a;
                            return new muc0(guc0Var, new lh80(16.0f, 8.0f, 16.0f, 16.0f));
                        }
                        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                        for (vrc0 vrc0Var : list) {
                            ctf0 ctf0Var2 = d2jVar.b;
                            if (vrc0Var != null) {
                                if (vrc0Var instanceof trc0) {
                                    trc0 trc0Var = (trc0) vrc0Var;
                                    long j = trc0Var.f34417a;
                                    n0x n0xVar = new n0x(trc0Var.k);
                                    String str = trc0Var.c;
                                    int i = trc0Var.h;
                                    buc0Var = new auc0(j, str, i > 0 ? new tda(new rpe(i), ctf0Var2.b.a(R.string.fs, Arrays.copyOf(new Object[0], 0))) : null, null, n0xVar);
                                } else if (vrc0Var instanceof urc0) {
                                    urc0 urc0Var = (urc0) vrc0Var;
                                    long j2 = urc0Var.f36158a;
                                    hds hdsVar = urc0Var.l;
                                    String str2 = urc0Var.c;
                                    int i2 = urc0Var.h;
                                    buc0Var = new buc0(j2, str2, i2 > 0 ? new tda(new rpe(i2), ctf0Var2.b.a(R.string.fs, Arrays.copyOf(new Object[0], 0))) : null, null, hdsVar);
                                }
                                arrayList.add(buc0Var);
                            }
                            t9f.b();
                            return null;
                        }
                        a4x a4xVarO0 = dyb.o0(arrayList);
                        guc0 guc0Var2 = guc0.b;
                        zcl zclVar2 = qmk.f28987a;
                        return new luc0(a4xVarO0, guc0Var2, new lh80(16.0f, 8.0f, 16.0f, 16.0f));
                    default:
                        arc0 arc0Var = (arc0) obj;
                        arc0Var.getClass();
                        src0 src0Var = arc0Var.h;
                        int i3 = arc0Var.d;
                        int i4 = arc0Var.c;
                        int i5 = arc0Var.b;
                        String str3 = arc0Var.e;
                        int i6 = arc0Var.f;
                        int i7 = arc0Var.g;
                        src0 src0Var2 = src0.f;
                        ctf0 ctf0Var3 = d2jVar.b;
                        String strA = src0Var == src0Var2 ? ctf0Var3.b.a(R.string.promocode_casino_subtitle, Arrays.copyOf(new Object[]{str3, String.valueOf(i6), String.valueOf(i7)}, 3)) : ctf0Var3.b.a(R.string.promocode_subtitle, Arrays.copyOf(new Object[]{str3, String.valueOf(i6)}, 2));
                        String str4 = arc0Var.f1339a;
                        int iOrdinal = src0Var.ordinal();
                        int i8 = iOrdinal != 2 ? iOrdinal != 4 ? R.string.promo_cost : R.string.promo_cost_kit : R.string.promo_games_count;
                        lsm0 lsm0Var = ctf0Var3.b;
                        lsm0 lsm0Var2 = ctf0Var3.b;
                        String strA2 = lsm0Var.a(i8, Arrays.copyOf(new Object[0], 0));
                        String strValueOf = String.valueOf((src0Var == src0Var2 || src0Var == src0.d) ? i4 : i5);
                        String strA3 = lsm0Var2.a(R.string.promo_points, Arrays.copyOf(new Object[]{Integer.valueOf(i3)}, 1));
                        wul wulVar = new wul(iul.e, oe9.f25112a, new ue9(lsm0Var2.a(R.string.promo_buy_for_pts_v2, Arrays.copyOf(new Object[]{Integer.valueOf(i5)}, 1))), true, false, false);
                        mul mulVar = mul.e;
                        oe9 oe9Var = oe9.c;
                        return new frc0(strA, str4, strA2, strValueOf, strA3, wulVar, new wul(mulVar, oe9Var, new te9(R.drawable.ic_glyph_plus_small), i5 + i6 <= i3, false, false), new wul(mulVar, oe9Var, new te9(R.drawable.ic_glyph_minus_small), i5 > i6, false, false), src0Var == src0Var2 ? lsm0Var2.a(R.string.promo_points_fs, Arrays.copyOf(new Object[]{Integer.valueOf(i7 * i4)}, 1)) : "");
                }
            }
        }, (byte) 20));
    }

    public static imm a(String str) {
        pz40 pz40Var = s6t0.f31722a;
        return new imm(new ilm(s6t0.b().f33626a.getSecondary()), new plm(str, s6t0.b().f33626a.getSecondary(), fa50.f9191a), fmm.f9790a, s6t0.b().f33626a.getBackgroundContent(), true, null);
    }

    @Override // a.v6t0
    public final Object invoke(Object obj) {
        Object drc0Var;
        byte b = this.f5357a;
        n0o0 n0o0Var = this.f;
        n0o0 n0o0Var2 = this.g;
        n0o0 n0o0Var3 = this.e;
        n0o0 n0o0Var4 = this.d;
        n0o0 n0o0Var5 = this.c;
        n0o0 n0o0Var6 = this.h;
        switch (b) {
            case 0:
                b2j b2jVar = (b2j) obj;
                b2jVar.getClass();
                ((fee) n0o0Var5.getValue()).d(b2jVar.f1853a);
                ((fee) n0o0Var4.getValue()).d(Boolean.valueOf(b2jVar.b));
                return new e2j((omm) ((fee) n0o0Var6.getValue()).b());
            case 1:
                inn innVar = (inn) obj;
                innVar.getClass();
                fee feeVar = (fee) n0o0Var5.getValue();
                feeVar.getClass();
                pz40 pz40VarA = feeVar.a();
                ((q4f) feeVar.a().getValue()).getClass();
                pz40VarA.setValue(innVar.f15082a);
                fee feeVar2 = (fee) n0o0Var4.getValue();
                feeVar2.getClass();
                pz40 pz40VarA2 = feeVar2.a();
                ((Boolean) feeVar2.a().getValue()).getClass();
                pz40VarA2.setValue(Boolean.valueOf(innVar.b));
                fee feeVar3 = (fee) n0o0Var6.getValue();
                feeVar3.getClass();
                pz40 pz40VarA3 = feeVar3.a();
                ((inn) feeVar3.a().getValue()).getClass();
                pz40VarA3.setValue(innVar);
                fee feeVar4 = (fee) n0o0Var3.getValue();
                feeVar4.getClass();
                pz40 pz40VarA4 = feeVar4.a();
                ((Boolean) feeVar4.a().getValue()).getClass();
                pz40VarA4.setValue(Boolean.valueOf(innVar.o));
                fee feeVar5 = (fee) n0o0Var2.getValue();
                feeVar5.getClass();
                pz40 pz40VarA5 = feeVar5.a();
                ((amn) feeVar5.a().getValue()).getClass();
                pz40VarA5.setValue(innVar.g);
                return new onn((imm) ((fee) n0o0Var.getValue()).b(), (gmn) ((fee) n0o0Var2.getValue()).b(), (jln) ((fee) n0o0Var6.getValue()).b(), innVar.n);
            default:
                zqc0 zqc0Var = (zqc0) obj;
                zqc0Var.getClass();
                ((fee) n0o0Var5.getValue()).d(zqc0Var.d);
                ((fee) n0o0Var4.getValue()).d(Boolean.valueOf(zqc0Var.f44802a));
                ((fee) n0o0Var3.getValue()).d(Boolean.valueOf(zqc0Var.b));
                fee feeVar6 = (fee) n0o0Var2.getValue();
                vrc0 vrc0Var = zqc0Var.e;
                if (vrc0Var instanceof trc0) {
                    trc0 trc0Var = (trc0) vrc0Var;
                    String str = trc0Var.l;
                    if (str.length() == 0) {
                        str = trc0Var.k;
                    }
                    drc0Var = new crc0(str, trc0Var.c);
                } else {
                    if (!(vrc0Var instanceof urc0)) {
                        t9f.b();
                        return null;
                    }
                    urc0 urc0Var = (urc0) vrc0Var;
                    drc0Var = new drc0(urc0Var.l, urc0Var.c);
                }
                feeVar6.d(drc0Var);
                ((fee) n0o0Var6.getValue()).d(new arc0(vrc0Var.A(), zqc0Var.h, zqc0Var.i, zqc0Var.j, zqc0Var.g, vrc0Var.h0(), vrc0Var.m0(), zqc0Var.f));
                if (!((Boolean) ((fee) n0o0Var4.getValue()).c()).booleanValue()) {
                    return ((Boolean) ((fee) n0o0Var3.getValue()).c()).booleanValue() ? new hrc0((shc0) ((fee) n0o0Var2.getValue()).e.getValue(), zqc0Var.c) : new grc0((shc0) ((fee) n0o0Var2.getValue()).e.getValue(), (nuc0) ((fee) n0o0Var.getValue()).e.getValue(), (frc0) ((fee) n0o0Var6.getValue()).e.getValue());
                }
                shc0 shc0Var = (shc0) ((fee) n0o0Var2.getValue()).e.getValue();
                guc0 guc0Var = guc0.b;
                zcl zclVar = qmk.f28987a;
                return new irc0(shc0Var, new muc0(guc0Var, new lh80(16.0f, 8.0f, 16.0f, 16.0f)));
        }
    }

    public d2j(ctf0 ctf0Var, b2j b2jVar) {
        final byte b = 0;
        ctf0Var.getClass();
        this.b = ctf0Var;
        n0o0 n0o0VarH = bkb.H(b2jVar.f1853a);
        this.c = n0o0VarH;
        n0o0 n0o0VarH2 = bkb.H(Boolean.valueOf(b2jVar.b));
        this.d = n0o0VarH2;
        this.e = bkb.G(((fee) n0o0VarH2.getValue()).d, new Function1(this) { // from class: a.c2j
            public final /* synthetic */ d2j b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) throws Throwable {
                Throwable th;
                List list;
                String strA;
                byte b2 = b;
                int i = 0;
                d2j d2jVar = this.b;
                switch (b2) {
                    case 0:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        qul qulVar = qul.e;
                        oe9 oe9Var = oe9.f25112a;
                        ctf0 ctf0Var2 = d2jVar.b;
                        return new wul(qulVar, oe9Var, new ue9(zBooleanValue ? ctf0Var2.b.a(R.string.skip, Arrays.copyOf(new Object[0], 0)) : ctf0Var2.b.a(R.string.daily_task_dialog_come_back, Arrays.copyOf(new Object[0], 0))), true, false, true);
                    case 1:
                        boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                        lul lulVar = lul.e;
                        oe9 oe9Var2 = oe9.f25112a;
                        ctf0 ctf0Var3 = d2jVar.b;
                        return new wul(lulVar, oe9Var2, new ue9(zBooleanValue2 ? ctf0Var3.b.a(R.string.next, Arrays.copyOf(new Object[0], 0)) : ctf0Var3.b.a(R.string.daily_task_dialog_join, Arrays.copyOf(new Object[0], 0))), true, false, true);
                    case 2:
                        n85 n85Var = (n85) obj;
                        ctf0 ctf0Var4 = d2jVar.b;
                        ctf0Var4.getClass();
                        if (n85Var == null) {
                            return lak0.c;
                        }
                        suo0 suo0Var = n85Var.l;
                        huo0 huo0Var = n85Var.k;
                        sba0 sba0Var = n85Var.h;
                        List listJ = q3d.j(jeb.Q(null, null, null), jeb.Q(sba0Var, huo0Var, suo0Var));
                        lsm0 lsm0Var = ctf0Var4.b;
                        List listJ2 = q3d.j(lsm0Var.a(R.string.daily_task_complete_tasks_title, Arrays.copyOf(new Object[0], 0)), lsm0Var.a(R.string.daily_task_current_task, Arrays.copyOf(new Object[0], 0)));
                        String strA2 = lsm0Var.a(R.string.daily_task_complete_tasks_subtitle, Arrays.copyOf(new Object[0], 0));
                        sba0 sba0Var2 = sba0.GAMING;
                        if (sba0Var == sba0Var2 && (huo0Var instanceof wdt) && (suo0Var instanceof puo0)) {
                            wdt wdtVar = (wdt) huo0Var;
                            wqd wqdVar = wdtVar.f38989a;
                            String str = wdtVar.b.b;
                            pn40 pn40Var = pn40.f27267a;
                            puo0 puo0Var = (puo0) suo0Var;
                            th = null;
                            list = listJ;
                            strA = lsm0Var.a(R.string.daily_task_description_sum, Arrays.copyOf(new Object[]{str, "\u200e".concat(pn40.i(wqdVar.e, 2)), wqdVar.b, "\u200e".concat(pn40.i(puo0Var.f27627a, 0)), puo0Var.b.b, puo0Var.c.b}, 6));
                        } else {
                            th = null;
                            list = listJ;
                            if (sba0Var == sba0Var2 && (huo0Var instanceof ydt) && (suo0Var instanceof puo0)) {
                                ydt ydtVar = (ydt) huo0Var;
                                pn40 pn40Var2 = pn40.f27267a;
                                puo0 puo0Var2 = (puo0) suo0Var;
                                strA = lsm0Var.a(R.string.daily_task_description_bets, Arrays.copyOf(new Object[]{pn40.i(ydtVar.f42456a.e, 0), ydtVar.b.b, "\u200e".concat(pn40.i(puo0Var2.f27627a, 0)), puo0Var2.b.b, puo0Var2.c.b}, 5));
                            } else if (sba0Var == sba0Var2 && (huo0Var instanceof xdt) && (suo0Var instanceof puo0)) {
                                xdt xdtVar = (xdt) huo0Var;
                                wqd wqdVar2 = xdtVar.f40712a;
                                String str2 = xdtVar.b.b;
                                pn40 pn40Var3 = pn40.f27267a;
                                puo0 puo0Var3 = (puo0) suo0Var;
                                strA = lsm0Var.a(R.string.daily_task_description_2, Arrays.copyOf(new Object[]{str2, "\u200e".concat(pn40.i(wqdVar2.e, 2)), wqdVar2.b, "\u200e".concat(pn40.i(puo0Var3.f27627a, 0)), puo0Var3.b.b, puo0Var3.c.b}, 6));
                            } else if (sba0Var == sba0Var2 && (huo0Var instanceof zdt) && (suo0Var instanceof puo0)) {
                                zdt zdtVar = (zdt) huo0Var;
                                pn40 pn40Var4 = pn40.f27267a;
                                puo0 puo0Var4 = (puo0) suo0Var;
                                strA = lsm0Var.a(R.string.daily_task_description_4, Arrays.copyOf(new Object[]{pn40.i(zdtVar.f44224a.e, 0), zdtVar.b.b, "\u200e".concat(pn40.i(puo0Var4.f27627a, 0)), puo0Var4.b.b, puo0Var4.c.b}, 5));
                            } else {
                                strA = lsm0Var.a(R.string.empty_str, Arrays.copyOf(new Object[0], 0));
                            }
                        }
                        List listJ3 = q3d.j(strA2, strA);
                        List list2 = list;
                        ArrayList arrayList = new ArrayList(r3d.q(list2, 10));
                        for (Object obj2 : list2) {
                            int i2 = i + 1;
                            if (i < 0) {
                                q3d.p();
                                throw th;
                            }
                            arrayList.add(new uj60((o0x) obj2, Integer.valueOf(R.drawable.onboard_type_4), (String) listJ2.get(i), (String) listJ3.get(i)));
                            i = i2;
                        }
                        return dyb.o0(arrayList);
                    default:
                        return new omm((a4x) ((fee) d2jVar.g.getValue()).b(), (wul) ((fee) d2jVar.e.getValue()).b(), (wul) ((fee) d2jVar.f.getValue()).b());
                }
            }
        });
        final byte b2 = 1;
        this.f = bkb.G(((fee) n0o0VarH2.getValue()).d, new Function1(this) { // from class: a.c2j
            public final /* synthetic */ d2j b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) throws Throwable {
                Throwable th;
                List list;
                String strA;
                byte b3 = b2;
                int i = 0;
                d2j d2jVar = this.b;
                switch (b3) {
                    case 0:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        qul qulVar = qul.e;
                        oe9 oe9Var = oe9.f25112a;
                        ctf0 ctf0Var2 = d2jVar.b;
                        return new wul(qulVar, oe9Var, new ue9(zBooleanValue ? ctf0Var2.b.a(R.string.skip, Arrays.copyOf(new Object[0], 0)) : ctf0Var2.b.a(R.string.daily_task_dialog_come_back, Arrays.copyOf(new Object[0], 0))), true, false, true);
                    case 1:
                        boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                        lul lulVar = lul.e;
                        oe9 oe9Var2 = oe9.f25112a;
                        ctf0 ctf0Var3 = d2jVar.b;
                        return new wul(lulVar, oe9Var2, new ue9(zBooleanValue2 ? ctf0Var3.b.a(R.string.next, Arrays.copyOf(new Object[0], 0)) : ctf0Var3.b.a(R.string.daily_task_dialog_join, Arrays.copyOf(new Object[0], 0))), true, false, true);
                    case 2:
                        n85 n85Var = (n85) obj;
                        ctf0 ctf0Var4 = d2jVar.b;
                        ctf0Var4.getClass();
                        if (n85Var == null) {
                            return lak0.c;
                        }
                        suo0 suo0Var = n85Var.l;
                        huo0 huo0Var = n85Var.k;
                        sba0 sba0Var = n85Var.h;
                        List listJ = q3d.j(jeb.Q(null, null, null), jeb.Q(sba0Var, huo0Var, suo0Var));
                        lsm0 lsm0Var = ctf0Var4.b;
                        List listJ2 = q3d.j(lsm0Var.a(R.string.daily_task_complete_tasks_title, Arrays.copyOf(new Object[0], 0)), lsm0Var.a(R.string.daily_task_current_task, Arrays.copyOf(new Object[0], 0)));
                        String strA2 = lsm0Var.a(R.string.daily_task_complete_tasks_subtitle, Arrays.copyOf(new Object[0], 0));
                        sba0 sba0Var2 = sba0.GAMING;
                        if (sba0Var == sba0Var2 && (huo0Var instanceof wdt) && (suo0Var instanceof puo0)) {
                            wdt wdtVar = (wdt) huo0Var;
                            wqd wqdVar = wdtVar.f38989a;
                            String str = wdtVar.b.b;
                            pn40 pn40Var = pn40.f27267a;
                            puo0 puo0Var = (puo0) suo0Var;
                            th = null;
                            list = listJ;
                            strA = lsm0Var.a(R.string.daily_task_description_sum, Arrays.copyOf(new Object[]{str, "\u200e".concat(pn40.i(wqdVar.e, 2)), wqdVar.b, "\u200e".concat(pn40.i(puo0Var.f27627a, 0)), puo0Var.b.b, puo0Var.c.b}, 6));
                        } else {
                            th = null;
                            list = listJ;
                            if (sba0Var == sba0Var2 && (huo0Var instanceof ydt) && (suo0Var instanceof puo0)) {
                                ydt ydtVar = (ydt) huo0Var;
                                pn40 pn40Var2 = pn40.f27267a;
                                puo0 puo0Var2 = (puo0) suo0Var;
                                strA = lsm0Var.a(R.string.daily_task_description_bets, Arrays.copyOf(new Object[]{pn40.i(ydtVar.f42456a.e, 0), ydtVar.b.b, "\u200e".concat(pn40.i(puo0Var2.f27627a, 0)), puo0Var2.b.b, puo0Var2.c.b}, 5));
                            } else if (sba0Var == sba0Var2 && (huo0Var instanceof xdt) && (suo0Var instanceof puo0)) {
                                xdt xdtVar = (xdt) huo0Var;
                                wqd wqdVar2 = xdtVar.f40712a;
                                String str2 = xdtVar.b.b;
                                pn40 pn40Var3 = pn40.f27267a;
                                puo0 puo0Var3 = (puo0) suo0Var;
                                strA = lsm0Var.a(R.string.daily_task_description_2, Arrays.copyOf(new Object[]{str2, "\u200e".concat(pn40.i(wqdVar2.e, 2)), wqdVar2.b, "\u200e".concat(pn40.i(puo0Var3.f27627a, 0)), puo0Var3.b.b, puo0Var3.c.b}, 6));
                            } else if (sba0Var == sba0Var2 && (huo0Var instanceof zdt) && (suo0Var instanceof puo0)) {
                                zdt zdtVar = (zdt) huo0Var;
                                pn40 pn40Var4 = pn40.f27267a;
                                puo0 puo0Var4 = (puo0) suo0Var;
                                strA = lsm0Var.a(R.string.daily_task_description_4, Arrays.copyOf(new Object[]{pn40.i(zdtVar.f44224a.e, 0), zdtVar.b.b, "\u200e".concat(pn40.i(puo0Var4.f27627a, 0)), puo0Var4.b.b, puo0Var4.c.b}, 5));
                            } else {
                                strA = lsm0Var.a(R.string.empty_str, Arrays.copyOf(new Object[0], 0));
                            }
                        }
                        List listJ3 = q3d.j(strA2, strA);
                        List list2 = list;
                        ArrayList arrayList = new ArrayList(r3d.q(list2, 10));
                        for (Object obj2 : list2) {
                            int i2 = i + 1;
                            if (i < 0) {
                                q3d.p();
                                throw th;
                            }
                            arrayList.add(new uj60((o0x) obj2, Integer.valueOf(R.drawable.onboard_type_4), (String) listJ2.get(i), (String) listJ3.get(i)));
                            i = i2;
                        }
                        return dyb.o0(arrayList);
                    default:
                        return new omm((a4x) ((fee) d2jVar.g.getValue()).b(), (wul) ((fee) d2jVar.e.getValue()).b(), (wul) ((fee) d2jVar.f.getValue()).b());
                }
            }
        });
        final byte b3 = 2;
        this.g = bkb.G(((fee) n0o0VarH.getValue()).d, new Function1(this) { // from class: a.c2j
            public final /* synthetic */ d2j b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) throws Throwable {
                Throwable th;
                List list;
                String strA;
                byte b4 = b3;
                int i = 0;
                d2j d2jVar = this.b;
                switch (b4) {
                    case 0:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        qul qulVar = qul.e;
                        oe9 oe9Var = oe9.f25112a;
                        ctf0 ctf0Var2 = d2jVar.b;
                        return new wul(qulVar, oe9Var, new ue9(zBooleanValue ? ctf0Var2.b.a(R.string.skip, Arrays.copyOf(new Object[0], 0)) : ctf0Var2.b.a(R.string.daily_task_dialog_come_back, Arrays.copyOf(new Object[0], 0))), true, false, true);
                    case 1:
                        boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                        lul lulVar = lul.e;
                        oe9 oe9Var2 = oe9.f25112a;
                        ctf0 ctf0Var3 = d2jVar.b;
                        return new wul(lulVar, oe9Var2, new ue9(zBooleanValue2 ? ctf0Var3.b.a(R.string.next, Arrays.copyOf(new Object[0], 0)) : ctf0Var3.b.a(R.string.daily_task_dialog_join, Arrays.copyOf(new Object[0], 0))), true, false, true);
                    case 2:
                        n85 n85Var = (n85) obj;
                        ctf0 ctf0Var4 = d2jVar.b;
                        ctf0Var4.getClass();
                        if (n85Var == null) {
                            return lak0.c;
                        }
                        suo0 suo0Var = n85Var.l;
                        huo0 huo0Var = n85Var.k;
                        sba0 sba0Var = n85Var.h;
                        List listJ = q3d.j(jeb.Q(null, null, null), jeb.Q(sba0Var, huo0Var, suo0Var));
                        lsm0 lsm0Var = ctf0Var4.b;
                        List listJ2 = q3d.j(lsm0Var.a(R.string.daily_task_complete_tasks_title, Arrays.copyOf(new Object[0], 0)), lsm0Var.a(R.string.daily_task_current_task, Arrays.copyOf(new Object[0], 0)));
                        String strA2 = lsm0Var.a(R.string.daily_task_complete_tasks_subtitle, Arrays.copyOf(new Object[0], 0));
                        sba0 sba0Var2 = sba0.GAMING;
                        if (sba0Var == sba0Var2 && (huo0Var instanceof wdt) && (suo0Var instanceof puo0)) {
                            wdt wdtVar = (wdt) huo0Var;
                            wqd wqdVar = wdtVar.f38989a;
                            String str = wdtVar.b.b;
                            pn40 pn40Var = pn40.f27267a;
                            puo0 puo0Var = (puo0) suo0Var;
                            th = null;
                            list = listJ;
                            strA = lsm0Var.a(R.string.daily_task_description_sum, Arrays.copyOf(new Object[]{str, "\u200e".concat(pn40.i(wqdVar.e, 2)), wqdVar.b, "\u200e".concat(pn40.i(puo0Var.f27627a, 0)), puo0Var.b.b, puo0Var.c.b}, 6));
                        } else {
                            th = null;
                            list = listJ;
                            if (sba0Var == sba0Var2 && (huo0Var instanceof ydt) && (suo0Var instanceof puo0)) {
                                ydt ydtVar = (ydt) huo0Var;
                                pn40 pn40Var2 = pn40.f27267a;
                                puo0 puo0Var2 = (puo0) suo0Var;
                                strA = lsm0Var.a(R.string.daily_task_description_bets, Arrays.copyOf(new Object[]{pn40.i(ydtVar.f42456a.e, 0), ydtVar.b.b, "\u200e".concat(pn40.i(puo0Var2.f27627a, 0)), puo0Var2.b.b, puo0Var2.c.b}, 5));
                            } else if (sba0Var == sba0Var2 && (huo0Var instanceof xdt) && (suo0Var instanceof puo0)) {
                                xdt xdtVar = (xdt) huo0Var;
                                wqd wqdVar2 = xdtVar.f40712a;
                                String str2 = xdtVar.b.b;
                                pn40 pn40Var3 = pn40.f27267a;
                                puo0 puo0Var3 = (puo0) suo0Var;
                                strA = lsm0Var.a(R.string.daily_task_description_2, Arrays.copyOf(new Object[]{str2, "\u200e".concat(pn40.i(wqdVar2.e, 2)), wqdVar2.b, "\u200e".concat(pn40.i(puo0Var3.f27627a, 0)), puo0Var3.b.b, puo0Var3.c.b}, 6));
                            } else if (sba0Var == sba0Var2 && (huo0Var instanceof zdt) && (suo0Var instanceof puo0)) {
                                zdt zdtVar = (zdt) huo0Var;
                                pn40 pn40Var4 = pn40.f27267a;
                                puo0 puo0Var4 = (puo0) suo0Var;
                                strA = lsm0Var.a(R.string.daily_task_description_4, Arrays.copyOf(new Object[]{pn40.i(zdtVar.f44224a.e, 0), zdtVar.b.b, "\u200e".concat(pn40.i(puo0Var4.f27627a, 0)), puo0Var4.b.b, puo0Var4.c.b}, 5));
                            } else {
                                strA = lsm0Var.a(R.string.empty_str, Arrays.copyOf(new Object[0], 0));
                            }
                        }
                        List listJ3 = q3d.j(strA2, strA);
                        List list2 = list;
                        ArrayList arrayList = new ArrayList(r3d.q(list2, 10));
                        for (Object obj2 : list2) {
                            int i2 = i + 1;
                            if (i < 0) {
                                q3d.p();
                                throw th;
                            }
                            arrayList.add(new uj60((o0x) obj2, Integer.valueOf(R.drawable.onboard_type_4), (String) listJ2.get(i), (String) listJ3.get(i)));
                            i = i2;
                        }
                        return dyb.o0(arrayList);
                    default:
                        return new omm((a4x) ((fee) d2jVar.g.getValue()).b(), (wul) ((fee) d2jVar.e.getValue()).b(), (wul) ((fee) d2jVar.f.getValue()).b());
                }
            }
        });
        final byte b4 = 3;
        this.h = bkb.G(((fee) n0o0VarH.getValue()).d, new Function1(this) { // from class: a.c2j
            public final /* synthetic */ d2j b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) throws Throwable {
                Throwable th;
                List list;
                String strA;
                byte b5 = b4;
                int i = 0;
                d2j d2jVar = this.b;
                switch (b5) {
                    case 0:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        qul qulVar = qul.e;
                        oe9 oe9Var = oe9.f25112a;
                        ctf0 ctf0Var2 = d2jVar.b;
                        return new wul(qulVar, oe9Var, new ue9(zBooleanValue ? ctf0Var2.b.a(R.string.skip, Arrays.copyOf(new Object[0], 0)) : ctf0Var2.b.a(R.string.daily_task_dialog_come_back, Arrays.copyOf(new Object[0], 0))), true, false, true);
                    case 1:
                        boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                        lul lulVar = lul.e;
                        oe9 oe9Var2 = oe9.f25112a;
                        ctf0 ctf0Var3 = d2jVar.b;
                        return new wul(lulVar, oe9Var2, new ue9(zBooleanValue2 ? ctf0Var3.b.a(R.string.next, Arrays.copyOf(new Object[0], 0)) : ctf0Var3.b.a(R.string.daily_task_dialog_join, Arrays.copyOf(new Object[0], 0))), true, false, true);
                    case 2:
                        n85 n85Var = (n85) obj;
                        ctf0 ctf0Var4 = d2jVar.b;
                        ctf0Var4.getClass();
                        if (n85Var == null) {
                            return lak0.c;
                        }
                        suo0 suo0Var = n85Var.l;
                        huo0 huo0Var = n85Var.k;
                        sba0 sba0Var = n85Var.h;
                        List listJ = q3d.j(jeb.Q(null, null, null), jeb.Q(sba0Var, huo0Var, suo0Var));
                        lsm0 lsm0Var = ctf0Var4.b;
                        List listJ2 = q3d.j(lsm0Var.a(R.string.daily_task_complete_tasks_title, Arrays.copyOf(new Object[0], 0)), lsm0Var.a(R.string.daily_task_current_task, Arrays.copyOf(new Object[0], 0)));
                        String strA2 = lsm0Var.a(R.string.daily_task_complete_tasks_subtitle, Arrays.copyOf(new Object[0], 0));
                        sba0 sba0Var2 = sba0.GAMING;
                        if (sba0Var == sba0Var2 && (huo0Var instanceof wdt) && (suo0Var instanceof puo0)) {
                            wdt wdtVar = (wdt) huo0Var;
                            wqd wqdVar = wdtVar.f38989a;
                            String str = wdtVar.b.b;
                            pn40 pn40Var = pn40.f27267a;
                            puo0 puo0Var = (puo0) suo0Var;
                            th = null;
                            list = listJ;
                            strA = lsm0Var.a(R.string.daily_task_description_sum, Arrays.copyOf(new Object[]{str, "\u200e".concat(pn40.i(wqdVar.e, 2)), wqdVar.b, "\u200e".concat(pn40.i(puo0Var.f27627a, 0)), puo0Var.b.b, puo0Var.c.b}, 6));
                        } else {
                            th = null;
                            list = listJ;
                            if (sba0Var == sba0Var2 && (huo0Var instanceof ydt) && (suo0Var instanceof puo0)) {
                                ydt ydtVar = (ydt) huo0Var;
                                pn40 pn40Var2 = pn40.f27267a;
                                puo0 puo0Var2 = (puo0) suo0Var;
                                strA = lsm0Var.a(R.string.daily_task_description_bets, Arrays.copyOf(new Object[]{pn40.i(ydtVar.f42456a.e, 0), ydtVar.b.b, "\u200e".concat(pn40.i(puo0Var2.f27627a, 0)), puo0Var2.b.b, puo0Var2.c.b}, 5));
                            } else if (sba0Var == sba0Var2 && (huo0Var instanceof xdt) && (suo0Var instanceof puo0)) {
                                xdt xdtVar = (xdt) huo0Var;
                                wqd wqdVar2 = xdtVar.f40712a;
                                String str2 = xdtVar.b.b;
                                pn40 pn40Var3 = pn40.f27267a;
                                puo0 puo0Var3 = (puo0) suo0Var;
                                strA = lsm0Var.a(R.string.daily_task_description_2, Arrays.copyOf(new Object[]{str2, "\u200e".concat(pn40.i(wqdVar2.e, 2)), wqdVar2.b, "\u200e".concat(pn40.i(puo0Var3.f27627a, 0)), puo0Var3.b.b, puo0Var3.c.b}, 6));
                            } else if (sba0Var == sba0Var2 && (huo0Var instanceof zdt) && (suo0Var instanceof puo0)) {
                                zdt zdtVar = (zdt) huo0Var;
                                pn40 pn40Var4 = pn40.f27267a;
                                puo0 puo0Var4 = (puo0) suo0Var;
                                strA = lsm0Var.a(R.string.daily_task_description_4, Arrays.copyOf(new Object[]{pn40.i(zdtVar.f44224a.e, 0), zdtVar.b.b, "\u200e".concat(pn40.i(puo0Var4.f27627a, 0)), puo0Var4.b.b, puo0Var4.c.b}, 5));
                            } else {
                                strA = lsm0Var.a(R.string.empty_str, Arrays.copyOf(new Object[0], 0));
                            }
                        }
                        List listJ3 = q3d.j(strA2, strA);
                        List list2 = list;
                        ArrayList arrayList = new ArrayList(r3d.q(list2, 10));
                        for (Object obj2 : list2) {
                            int i2 = i + 1;
                            if (i < 0) {
                                q3d.p();
                                throw th;
                            }
                            arrayList.add(new uj60((o0x) obj2, Integer.valueOf(R.drawable.onboard_type_4), (String) listJ2.get(i), (String) listJ3.get(i)));
                            i = i2;
                        }
                        return dyb.o0(arrayList);
                    default:
                        return new omm((a4x) ((fee) d2jVar.g.getValue()).b(), (wul) ((fee) d2jVar.e.getValue()).b(), (wul) ((fee) d2jVar.f.getValue()).b());
                }
            }
        });
    }

    public d2j(inn innVar, ctf0 ctf0Var) {
        final byte b = 1;
        ctf0Var.getClass();
        this.b = ctf0Var;
        this.c = bkb.H(innVar.f15082a);
        this.d = bkb.H(Boolean.valueOf(innVar.b));
        this.e = bkb.H(Boolean.valueOf(innVar.o));
        final byte b2 = 0;
        this.f = maz.b(new yw9(innVar, new Function1(this) { // from class: a.pnn
            public final /* synthetic */ d2j b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:114:0x0373  */
            /* JADX WARN: Code duplicated, block: B:116:0x037d  */
            /* JADX WARN: Code duplicated, block: B:119:0x038c  */
            /* JADX WARN: Code duplicated, block: B:122:0x039b  */
            /* JADX WARN: Code duplicated, block: B:125:0x03a8  */
            /* JADX WARN: Code duplicated, block: B:128:0x03b7  */
            /* JADX WARN: Code duplicated, block: B:131:0x03c6  */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i;
                iln glnVar;
                boolean z;
                a4x a4xVar;
                List listJ;
                List listC;
                lsm0 lsm0Var;
                inn innVar2;
                p3u0 p3u0Var;
                String str;
                String str2;
                eln elnVar;
                int i2;
                lc00 lc00VarB;
                ivo0 ivo0Var;
                ivo0 ivo0Var2;
                ivo0 ivo0Var3;
                ivo0 ivo0Var4;
                a4x a4xVarO0;
                byte b3 = b2;
                d2j d2jVar = this.b;
                switch (b3) {
                    case 0:
                        ((inn) obj).getClass();
                        q4f q4fVar = (q4f) ((fee) d2jVar.c.getValue()).c();
                        boolean zBooleanValue = ((Boolean) ((fee) d2jVar.d.getValue()).c()).booleanValue();
                        ctf0 ctf0Var2 = d2jVar.b;
                        q4fVar.getClass();
                        ctf0Var2.getClass();
                        pz40 pz40Var = s6t0.f31722a;
                        return new imm(new ilm(s6t0.b().f33626a.getSecondary()), new plm(q4fVar != q4f.b ? ctf0Var2.b.a(lgb.V(q4fVar), Arrays.copyOf(new Object[0], 0)) : ctf0Var2.b.a(R.string.edit_coupon_title, Arrays.copyOf(new Object[0], 0)), s6t0.b().f33626a.getSecondary(), zBooleanValue ? new ea50(s6t0.b().f33626a.getSecondary()) : fa50.f9191a), new dmm(new ta50(new wkm(0, R.drawable.ic_action_more, true, ra50.f30118a, s6t0.b().f33626a.getSecondary()))), s6t0.b().f33626a.getBackgroundContent(), false, null);
                    default:
                        inn innVar3 = (inn) obj;
                        innVar3.getClass();
                        n0o0 n0o0Var = d2jVar.g;
                        if (!(((fee) n0o0Var.getValue()).c() instanceof vln) && !(((fee) n0o0Var.getValue()).c() instanceof wln)) {
                            return null;
                        }
                        boolean z2 = ((fee) n0o0Var.getValue()).c() instanceof wln;
                        ctf0 ctf0Var3 = d2jVar.b;
                        p3u0 p3u0Var2 = p3u0.c;
                        pn40 pn40Var = pn40.f27267a;
                        int i3 = cy7.f5159a;
                        amn amnVar = innVar3.g;
                        ctf0Var3.getClass();
                        boolean z3 = amnVar instanceof vln;
                        vln vlnVar = z3 ? (vln) amnVar : null;
                        List<pln> list = vlnVar != null ? vlnVar.f37633a : null;
                        if (list == null) {
                            list = iun.f15405a;
                        }
                        String strValueOf = String.valueOf(list.size());
                        if (list.isEmpty()) {
                            i = 0;
                        } else {
                            i = 0;
                            for (pln plnVar : list) {
                                if (plnVar.h || plnVar.o || plnVar.x) {
                                    i++;
                                    if (i < 0) {
                                        q3d.o();
                                        throw null;
                                    }
                                }
                            }
                        }
                        String strValueOf2 = String.valueOf(i);
                        if (list.isEmpty()) {
                            glnVar = hln.f13271a;
                        } else {
                            Iterator it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    glnVar = hln.f13271a;
                                } else if (((pln) it.next()).A == gho.b) {
                                    pz40 pz40Var2 = s6t0.f31722a;
                                    long primary = s6t0.b().f33626a.getPrimary();
                                    zcl zclVar = qmk.m;
                                    ugg0 ugg0Var = vgg0.f37379a;
                                    glnVar = new gln(new b9x(primary, new ugg0(zclVar, zclVar, zclVar, zclVar)), ctf0Var3.b.a(R.string.auto_sub_title, Arrays.copyOf(new Object[0], 0)));
                                }
                            }
                        }
                        tc7 tc7Var = new tc7(strValueOf, strValueOf2, glnVar);
                        lc00 lc00VarB2 = kotlin.collections.a.b();
                        nnn nnnVar = innVar3.i;
                        en7 en7Var = innVar3.l;
                        v0f v0fVar = innVar3.h;
                        vln vlnVar2 = z3 ? (vln) amnVar : null;
                        List list2 = vlnVar2 != null ? vlnVar2.f37633a : null;
                        if (list2 == null) {
                            list2 = iun.f15405a;
                        }
                        int i4 = cy7.f5159a;
                        String str3 = v0fVar.f36579a;
                        String str4 = v0fVar.c;
                        lsm0 lsm0Var2 = ctf0Var3.b;
                        lc00VarB2.add(new cln(cy7.e(lsm0Var2.a(R.string.history_coupon_number, Arrays.copyOf(new Object[]{str3}, 1))), new qmn("")));
                        oln olnVar = v0fVar.m;
                        if (list2 == null || !list2.isEmpty()) {
                            Iterator it2 = list2.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    pln plnVar2 = (pln) it2.next();
                                    if (plnVar2.h || plnVar2.o || plnVar2.x) {
                                        z = true;
                                    }
                                } else {
                                    z = false;
                                }
                            }
                        } else {
                            z = false;
                        }
                        if (olnVar.equals(mln.f21999a)) {
                            listJ = kotlin.collections.a.c(new cln(lsm0Var2.a(R.string.coefficient, Arrays.copyOf(new Object[0], 0)), new qmn("-")));
                        } else {
                            if (!(olnVar instanceof lln)) {
                                if (olnVar instanceof nln) {
                                    nln nlnVar = (nln) olnVar;
                                    listJ = q3d.j(ulb.E(lsm0Var2.a(R.string.edit_coupon_maximum_coef, Arrays.copyOf(new Object[0], 0)), nlnVar.f23736a, z), ulb.E(lsm0Var2.a(R.string.edit_coupon_optional_coef, Arrays.copyOf(new Object[0], 0)), nlnVar.b, z));
                                } else {
                                    a4xVar = null;
                                    t9f.b();
                                }
                                return a4xVar;
                            }
                            listJ = kotlin.collections.a.c(ulb.E(lsm0Var2.a(R.string.coefficient, Arrays.copyOf(new Object[0], 0)), ((lln) olnVar).f20255a, z));
                        }
                        lc00VarB2.addAll(listJ);
                        if (!en7Var.equals(new en7(0, 0, 0, 0.0d, false))) {
                            lc00VarB2.add(new dln(lsm0Var2.a(R.string.system, Arrays.copyOf(new Object[0], 0)), twn.m(en7Var.f8078a, String.format(Locale.ENGLISH, "%s %d/", Arrays.copyOf(new Object[]{lsm0Var2.a(R.string.system, Arrays.copyOf(new Object[0], 0)), Integer.valueOf(en7Var.c)}, 2)))));
                        }
                        double d = v0fVar.e;
                        double d2 = v0fVar.d;
                        if (d == d2 || d == 0.0d) {
                            String strA = lsm0Var2.a(R.string.bet, Arrays.copyOf(new Object[0], 0));
                            int i5 = cy7.f5159a;
                            pn40 pn40Var2 = pn40.f27267a;
                            listC = kotlin.collections.a.c(new cln(strA, new qmn(cy7.e(pn40.d(d2, str4, p3u0.c)))));
                        } else {
                            String strA2 = lsm0Var2.a(R.string.edit_coupon_start_sum, Arrays.copyOf(new Object[0], 0));
                            int i6 = cy7.f5159a;
                            pn40 pn40Var3 = pn40.f27267a;
                            p3u0 p3u0Var3 = p3u0.c;
                            listC = q3d.j(new cln(strA2, new qmn(cy7.e(pn40.d(d2, str4, p3u0Var3)))), new cln(lsm0Var2.a(R.string.edit_coupon_new_sum, Arrays.copyOf(new Object[0], 0)), new qmn(cy7.e(pn40.d(d, str4, p3u0Var3)))));
                        }
                        lc00VarB2.addAll(listC);
                        if (nnnVar instanceof mnn) {
                            mnn mnnVar = (mnn) nnnVar;
                            String str5 = mnnVar.b;
                            hxu hxuVar = mnnVar.f22097a;
                            double d3 = hxuVar.g;
                            ivo0 ivo0Var5 = hxuVar.f13829a;
                            ivo0 ivo0Var6 = hxuVar.d;
                            smk0 smk0Var = new smk0(0L, 0L, psq.g, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 65531);
                            str = "-";
                            String strE = cy7.e(pn40.p(str5, d3));
                            h83 h83Var = new h83();
                            p3u0Var = p3u0Var2;
                            if (d3 > 0.0d) {
                                pz40 pz40Var3 = s6t0.f31722a;
                                lsm0Var = lsm0Var2;
                                innVar2 = innVar3;
                                str2 = str4;
                                int iG = h83Var.g(smk0.a(smk0Var, StaticColors.INSTANCE.m98getGreen0d7_KjU(), null, 65534));
                                try {
                                    h83Var.c(strE);
                                    h83Var.d(iG);
                                } catch (Throwable th) {
                                    h83Var.d(iG);
                                    throw th;
                                }
                            } else {
                                lsm0Var = lsm0Var2;
                                innVar2 = innVar3;
                                str2 = str4;
                                if (d3 < 0.0d) {
                                    pz40 pz40Var4 = s6t0.f31722a;
                                    a4xVar = null;
                                    int iG2 = h83Var.g(smk0.a(smk0Var, s6t0.b().f33626a.getTextPrimary(), null, 65534));
                                    try {
                                        h83Var.c(strE);
                                        h83Var.d(iG2);
                                    } catch (Throwable th2) {
                                        h83Var.d(iG2);
                                        throw th2;
                                    }
                                }
                                j83 j83VarH = h83Var.h();
                                if (!osm0.l(ivo0Var6) || osm0.l(ivo0Var5)) {
                                    lc00VarB = kotlin.collections.a.b();
                                    if (ivo0Var5.b > 0.0d) {
                                        lc00VarB.add(vsm0.l(ivo0Var5, str5));
                                    }
                                    ivo0Var = hxuVar.b;
                                    if (ivo0Var.b > 0.0d) {
                                        lc00VarB.add(vsm0.l(ivo0Var, str5));
                                    }
                                    ivo0Var2 = hxuVar.c;
                                    if (ivo0Var2.b > 0.0d) {
                                        lc00VarB.add(vsm0.l(ivo0Var2, str5));
                                    }
                                    if (ivo0Var6.b > 0.0d) {
                                        lc00VarB.add(vsm0.l(ivo0Var6, str5));
                                    }
                                    ivo0Var3 = hxuVar.e;
                                    if (ivo0Var3.b > 0.0d) {
                                        lc00VarB.add(vsm0.l(ivo0Var3, str5));
                                    }
                                    ivo0Var4 = hxuVar.f;
                                    if (ivo0Var4.b > 0.0d) {
                                        lc00VarB.add(vsm0.l(ivo0Var4, str5));
                                    }
                                    a4xVarO0 = dyb.o0(kotlin.collections.a.a(lc00VarB));
                                } else {
                                    a4xVarO0 = lak0.c;
                                }
                                elnVar = new eln(new tvo0(j83VarH, a4xVarO0));
                            }
                            a4xVar = null;
                            j83 j83VarH2 = h83Var.h();
                            if (osm0.l(ivo0Var6)) {
                                lc00VarB = kotlin.collections.a.b();
                                if (ivo0Var5.b > 0.0d) {
                                    lc00VarB.add(vsm0.l(ivo0Var5, str5));
                                }
                                ivo0Var = hxuVar.b;
                                if (ivo0Var.b > 0.0d) {
                                    lc00VarB.add(vsm0.l(ivo0Var, str5));
                                }
                                ivo0Var2 = hxuVar.c;
                                if (ivo0Var2.b > 0.0d) {
                                    lc00VarB.add(vsm0.l(ivo0Var2, str5));
                                }
                                if (ivo0Var6.b > 0.0d) {
                                    lc00VarB.add(vsm0.l(ivo0Var6, str5));
                                }
                                ivo0Var3 = hxuVar.e;
                                if (ivo0Var3.b > 0.0d) {
                                    lc00VarB.add(vsm0.l(ivo0Var3, str5));
                                }
                                ivo0Var4 = hxuVar.f;
                                if (ivo0Var4.b > 0.0d) {
                                    lc00VarB.add(vsm0.l(ivo0Var4, str5));
                                }
                                a4xVarO0 = dyb.o0(kotlin.collections.a.a(lc00VarB));
                            } else {
                                lc00VarB = kotlin.collections.a.b();
                                if (ivo0Var5.b > 0.0d) {
                                    lc00VarB.add(vsm0.l(ivo0Var5, str5));
                                }
                                ivo0Var = hxuVar.b;
                                if (ivo0Var.b > 0.0d) {
                                    lc00VarB.add(vsm0.l(ivo0Var, str5));
                                }
                                ivo0Var2 = hxuVar.c;
                                if (ivo0Var2.b > 0.0d) {
                                    lc00VarB.add(vsm0.l(ivo0Var2, str5));
                                }
                                if (ivo0Var6.b > 0.0d) {
                                    lc00VarB.add(vsm0.l(ivo0Var6, str5));
                                }
                                ivo0Var3 = hxuVar.e;
                                if (ivo0Var3.b > 0.0d) {
                                    lc00VarB.add(vsm0.l(ivo0Var3, str5));
                                }
                                ivo0Var4 = hxuVar.f;
                                if (ivo0Var4.b > 0.0d) {
                                    lc00VarB.add(vsm0.l(ivo0Var4, str5));
                                }
                                a4xVarO0 = dyb.o0(kotlin.collections.a.a(lc00VarB));
                            }
                            elnVar = new eln(new tvo0(j83VarH2, a4xVarO0));
                        } else {
                            lsm0Var = lsm0Var2;
                            innVar2 = innVar3;
                            p3u0Var = p3u0Var2;
                            str = "-";
                            str2 = str4;
                            a4xVar = null;
                            if (nnnVar.equals(knn.f18594a)) {
                                elnVar = new eln(svo0.f32879a);
                            } else {
                                if (!nnnVar.equals(lnn.f20354a)) {
                                    t9f.b();
                                    return a4xVar;
                                }
                                elnVar = null;
                            }
                        }
                        if (elnVar != null) {
                            lc00VarB2.add(elnVar);
                        }
                        inn innVar4 = innVar2;
                        boolean z4 = innVar4.k;
                        q4f q4fVar2 = v0fVar.b;
                        if (q4fVar2 == q4f.e) {
                            i2 = R.string.min_bet_possible_win;
                        } else if (z4) {
                            i2 = R.string.edit_coupon_summary_possible_win;
                        } else {
                            i2 = (v0fVar.k && q4fVar2 == q4f.c) ? R.string.max_win_possible : R.string.bet_possible_win;
                        }
                        lsm0 lsm0Var3 = lsm0Var;
                        lc00VarB2.add(new cln(lsm0Var3.a(i2, Arrays.copyOf(new Object[0], 0)), (q4fVar2 == q4f.k || q4fVar2 == q4f.j || q4fVar2 == q4f.f) ? new qmn(str) : nnnVar instanceof knn ? pmn.f27244a : new qmn(cy7.e(pn40.d(v0fVar.l, str2, p3u0Var)))));
                        a4x a4xVarO1 = !z2 ? dyb.o0(kotlin.collections.a.a(lc00VarB2)) : a4xVar;
                        if (a4xVarO1 == null) {
                            a4xVarO1 = lak0.c;
                        }
                        nul nulVar = nul.e;
                        oe9 oe9Var = oe9.b;
                        return new jln(tc7Var, a4xVarO1, new wul(nulVar, oe9Var, new ue9(lsm0Var3.a(R.string.add_event_btn_text, Arrays.copyOf(new Object[0], 0))), true, false, false), new wul(lul.e, oe9Var, new ue9(lsm0Var3.a(R.string.save, Arrays.copyOf(new Object[0], 0))), innVar4.j, false, false));
                }
            }
        }, (byte) 20));
        this.g = maz.b(new yw9(innVar.g, new dpl(this, innVar, (byte) 28), (byte) 20));
        this.h = maz.b(new yw9(innVar, new Function1(this) { // from class: a.pnn
            public final /* synthetic */ d2j b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:114:0x0373  */
            /* JADX WARN: Code duplicated, block: B:116:0x037d  */
            /* JADX WARN: Code duplicated, block: B:119:0x038c  */
            /* JADX WARN: Code duplicated, block: B:122:0x039b  */
            /* JADX WARN: Code duplicated, block: B:125:0x03a8  */
            /* JADX WARN: Code duplicated, block: B:128:0x03b7  */
            /* JADX WARN: Code duplicated, block: B:131:0x03c6  */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i;
                iln glnVar;
                boolean z;
                a4x a4xVar;
                List listJ;
                List listC;
                lsm0 lsm0Var;
                inn innVar2;
                p3u0 p3u0Var;
                String str;
                String str2;
                eln elnVar;
                int i2;
                lc00 lc00VarB;
                ivo0 ivo0Var;
                ivo0 ivo0Var2;
                ivo0 ivo0Var3;
                ivo0 ivo0Var4;
                a4x a4xVarO0;
                byte b3 = b;
                d2j d2jVar = this.b;
                switch (b3) {
                    case 0:
                        ((inn) obj).getClass();
                        q4f q4fVar = (q4f) ((fee) d2jVar.c.getValue()).c();
                        boolean zBooleanValue = ((Boolean) ((fee) d2jVar.d.getValue()).c()).booleanValue();
                        ctf0 ctf0Var2 = d2jVar.b;
                        q4fVar.getClass();
                        ctf0Var2.getClass();
                        pz40 pz40Var = s6t0.f31722a;
                        return new imm(new ilm(s6t0.b().f33626a.getSecondary()), new plm(q4fVar != q4f.b ? ctf0Var2.b.a(lgb.V(q4fVar), Arrays.copyOf(new Object[0], 0)) : ctf0Var2.b.a(R.string.edit_coupon_title, Arrays.copyOf(new Object[0], 0)), s6t0.b().f33626a.getSecondary(), zBooleanValue ? new ea50(s6t0.b().f33626a.getSecondary()) : fa50.f9191a), new dmm(new ta50(new wkm(0, R.drawable.ic_action_more, true, ra50.f30118a, s6t0.b().f33626a.getSecondary()))), s6t0.b().f33626a.getBackgroundContent(), false, null);
                    default:
                        inn innVar3 = (inn) obj;
                        innVar3.getClass();
                        n0o0 n0o0Var = d2jVar.g;
                        if (!(((fee) n0o0Var.getValue()).c() instanceof vln) && !(((fee) n0o0Var.getValue()).c() instanceof wln)) {
                            return null;
                        }
                        boolean z2 = ((fee) n0o0Var.getValue()).c() instanceof wln;
                        ctf0 ctf0Var3 = d2jVar.b;
                        p3u0 p3u0Var2 = p3u0.c;
                        pn40 pn40Var = pn40.f27267a;
                        int i3 = cy7.f5159a;
                        amn amnVar = innVar3.g;
                        ctf0Var3.getClass();
                        boolean z3 = amnVar instanceof vln;
                        vln vlnVar = z3 ? (vln) amnVar : null;
                        List<pln> list = vlnVar != null ? vlnVar.f37633a : null;
                        if (list == null) {
                            list = iun.f15405a;
                        }
                        String strValueOf = String.valueOf(list.size());
                        if (list.isEmpty()) {
                            i = 0;
                        } else {
                            i = 0;
                            for (pln plnVar : list) {
                                if (plnVar.h || plnVar.o || plnVar.x) {
                                    i++;
                                    if (i < 0) {
                                        q3d.o();
                                        throw null;
                                    }
                                }
                            }
                        }
                        String strValueOf2 = String.valueOf(i);
                        if (list.isEmpty()) {
                            glnVar = hln.f13271a;
                        } else {
                            Iterator it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    glnVar = hln.f13271a;
                                } else if (((pln) it.next()).A == gho.b) {
                                    pz40 pz40Var2 = s6t0.f31722a;
                                    long primary = s6t0.b().f33626a.getPrimary();
                                    zcl zclVar = qmk.m;
                                    ugg0 ugg0Var = vgg0.f37379a;
                                    glnVar = new gln(new b9x(primary, new ugg0(zclVar, zclVar, zclVar, zclVar)), ctf0Var3.b.a(R.string.auto_sub_title, Arrays.copyOf(new Object[0], 0)));
                                }
                            }
                        }
                        tc7 tc7Var = new tc7(strValueOf, strValueOf2, glnVar);
                        lc00 lc00VarB2 = kotlin.collections.a.b();
                        nnn nnnVar = innVar3.i;
                        en7 en7Var = innVar3.l;
                        v0f v0fVar = innVar3.h;
                        vln vlnVar2 = z3 ? (vln) amnVar : null;
                        List list2 = vlnVar2 != null ? vlnVar2.f37633a : null;
                        if (list2 == null) {
                            list2 = iun.f15405a;
                        }
                        int i4 = cy7.f5159a;
                        String str3 = v0fVar.f36579a;
                        String str4 = v0fVar.c;
                        lsm0 lsm0Var2 = ctf0Var3.b;
                        lc00VarB2.add(new cln(cy7.e(lsm0Var2.a(R.string.history_coupon_number, Arrays.copyOf(new Object[]{str3}, 1))), new qmn("")));
                        oln olnVar = v0fVar.m;
                        if (list2 == null || !list2.isEmpty()) {
                            Iterator it2 = list2.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    pln plnVar2 = (pln) it2.next();
                                    if (plnVar2.h || plnVar2.o || plnVar2.x) {
                                        z = true;
                                    }
                                } else {
                                    z = false;
                                }
                            }
                        } else {
                            z = false;
                        }
                        if (olnVar.equals(mln.f21999a)) {
                            listJ = kotlin.collections.a.c(new cln(lsm0Var2.a(R.string.coefficient, Arrays.copyOf(new Object[0], 0)), new qmn("-")));
                        } else {
                            if (!(olnVar instanceof lln)) {
                                if (olnVar instanceof nln) {
                                    nln nlnVar = (nln) olnVar;
                                    listJ = q3d.j(ulb.E(lsm0Var2.a(R.string.edit_coupon_maximum_coef, Arrays.copyOf(new Object[0], 0)), nlnVar.f23736a, z), ulb.E(lsm0Var2.a(R.string.edit_coupon_optional_coef, Arrays.copyOf(new Object[0], 0)), nlnVar.b, z));
                                } else {
                                    a4xVar = null;
                                    t9f.b();
                                }
                                return a4xVar;
                            }
                            listJ = kotlin.collections.a.c(ulb.E(lsm0Var2.a(R.string.coefficient, Arrays.copyOf(new Object[0], 0)), ((lln) olnVar).f20255a, z));
                        }
                        lc00VarB2.addAll(listJ);
                        if (!en7Var.equals(new en7(0, 0, 0, 0.0d, false))) {
                            lc00VarB2.add(new dln(lsm0Var2.a(R.string.system, Arrays.copyOf(new Object[0], 0)), twn.m(en7Var.f8078a, String.format(Locale.ENGLISH, "%s %d/", Arrays.copyOf(new Object[]{lsm0Var2.a(R.string.system, Arrays.copyOf(new Object[0], 0)), Integer.valueOf(en7Var.c)}, 2)))));
                        }
                        double d = v0fVar.e;
                        double d2 = v0fVar.d;
                        if (d == d2 || d == 0.0d) {
                            String strA = lsm0Var2.a(R.string.bet, Arrays.copyOf(new Object[0], 0));
                            int i5 = cy7.f5159a;
                            pn40 pn40Var2 = pn40.f27267a;
                            listC = kotlin.collections.a.c(new cln(strA, new qmn(cy7.e(pn40.d(d2, str4, p3u0.c)))));
                        } else {
                            String strA2 = lsm0Var2.a(R.string.edit_coupon_start_sum, Arrays.copyOf(new Object[0], 0));
                            int i6 = cy7.f5159a;
                            pn40 pn40Var3 = pn40.f27267a;
                            p3u0 p3u0Var3 = p3u0.c;
                            listC = q3d.j(new cln(strA2, new qmn(cy7.e(pn40.d(d2, str4, p3u0Var3)))), new cln(lsm0Var2.a(R.string.edit_coupon_new_sum, Arrays.copyOf(new Object[0], 0)), new qmn(cy7.e(pn40.d(d, str4, p3u0Var3)))));
                        }
                        lc00VarB2.addAll(listC);
                        if (nnnVar instanceof mnn) {
                            mnn mnnVar = (mnn) nnnVar;
                            String str5 = mnnVar.b;
                            hxu hxuVar = mnnVar.f22097a;
                            double d3 = hxuVar.g;
                            ivo0 ivo0Var5 = hxuVar.f13829a;
                            ivo0 ivo0Var6 = hxuVar.d;
                            smk0 smk0Var = new smk0(0L, 0L, psq.g, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 65531);
                            str = "-";
                            String strE = cy7.e(pn40.p(str5, d3));
                            h83 h83Var = new h83();
                            p3u0Var = p3u0Var2;
                            if (d3 > 0.0d) {
                                pz40 pz40Var3 = s6t0.f31722a;
                                lsm0Var = lsm0Var2;
                                innVar2 = innVar3;
                                str2 = str4;
                                int iG = h83Var.g(smk0.a(smk0Var, StaticColors.INSTANCE.m98getGreen0d7_KjU(), null, 65534));
                                try {
                                    h83Var.c(strE);
                                    h83Var.d(iG);
                                } catch (Throwable th) {
                                    h83Var.d(iG);
                                    throw th;
                                }
                            } else {
                                lsm0Var = lsm0Var2;
                                innVar2 = innVar3;
                                str2 = str4;
                                if (d3 < 0.0d) {
                                    pz40 pz40Var4 = s6t0.f31722a;
                                    a4xVar = null;
                                    int iG2 = h83Var.g(smk0.a(smk0Var, s6t0.b().f33626a.getTextPrimary(), null, 65534));
                                    try {
                                        h83Var.c(strE);
                                        h83Var.d(iG2);
                                    } catch (Throwable th2) {
                                        h83Var.d(iG2);
                                        throw th2;
                                    }
                                }
                                j83 j83VarH2 = h83Var.h();
                                if (!osm0.l(ivo0Var6) || osm0.l(ivo0Var5)) {
                                    lc00VarB = kotlin.collections.a.b();
                                    if (ivo0Var5.b > 0.0d) {
                                        lc00VarB.add(vsm0.l(ivo0Var5, str5));
                                    }
                                    ivo0Var = hxuVar.b;
                                    if (ivo0Var.b > 0.0d) {
                                        lc00VarB.add(vsm0.l(ivo0Var, str5));
                                    }
                                    ivo0Var2 = hxuVar.c;
                                    if (ivo0Var2.b > 0.0d) {
                                        lc00VarB.add(vsm0.l(ivo0Var2, str5));
                                    }
                                    if (ivo0Var6.b > 0.0d) {
                                        lc00VarB.add(vsm0.l(ivo0Var6, str5));
                                    }
                                    ivo0Var3 = hxuVar.e;
                                    if (ivo0Var3.b > 0.0d) {
                                        lc00VarB.add(vsm0.l(ivo0Var3, str5));
                                    }
                                    ivo0Var4 = hxuVar.f;
                                    if (ivo0Var4.b > 0.0d) {
                                        lc00VarB.add(vsm0.l(ivo0Var4, str5));
                                    }
                                    a4xVarO0 = dyb.o0(kotlin.collections.a.a(lc00VarB));
                                } else {
                                    a4xVarO0 = lak0.c;
                                }
                                elnVar = new eln(new tvo0(j83VarH2, a4xVarO0));
                            }
                            a4xVar = null;
                            j83 j83VarH3 = h83Var.h();
                            if (osm0.l(ivo0Var6)) {
                                lc00VarB = kotlin.collections.a.b();
                                if (ivo0Var5.b > 0.0d) {
                                    lc00VarB.add(vsm0.l(ivo0Var5, str5));
                                }
                                ivo0Var = hxuVar.b;
                                if (ivo0Var.b > 0.0d) {
                                    lc00VarB.add(vsm0.l(ivo0Var, str5));
                                }
                                ivo0Var2 = hxuVar.c;
                                if (ivo0Var2.b > 0.0d) {
                                    lc00VarB.add(vsm0.l(ivo0Var2, str5));
                                }
                                if (ivo0Var6.b > 0.0d) {
                                    lc00VarB.add(vsm0.l(ivo0Var6, str5));
                                }
                                ivo0Var3 = hxuVar.e;
                                if (ivo0Var3.b > 0.0d) {
                                    lc00VarB.add(vsm0.l(ivo0Var3, str5));
                                }
                                ivo0Var4 = hxuVar.f;
                                if (ivo0Var4.b > 0.0d) {
                                    lc00VarB.add(vsm0.l(ivo0Var4, str5));
                                }
                                a4xVarO0 = dyb.o0(kotlin.collections.a.a(lc00VarB));
                            } else {
                                lc00VarB = kotlin.collections.a.b();
                                if (ivo0Var5.b > 0.0d) {
                                    lc00VarB.add(vsm0.l(ivo0Var5, str5));
                                }
                                ivo0Var = hxuVar.b;
                                if (ivo0Var.b > 0.0d) {
                                    lc00VarB.add(vsm0.l(ivo0Var, str5));
                                }
                                ivo0Var2 = hxuVar.c;
                                if (ivo0Var2.b > 0.0d) {
                                    lc00VarB.add(vsm0.l(ivo0Var2, str5));
                                }
                                if (ivo0Var6.b > 0.0d) {
                                    lc00VarB.add(vsm0.l(ivo0Var6, str5));
                                }
                                ivo0Var3 = hxuVar.e;
                                if (ivo0Var3.b > 0.0d) {
                                    lc00VarB.add(vsm0.l(ivo0Var3, str5));
                                }
                                ivo0Var4 = hxuVar.f;
                                if (ivo0Var4.b > 0.0d) {
                                    lc00VarB.add(vsm0.l(ivo0Var4, str5));
                                }
                                a4xVarO0 = dyb.o0(kotlin.collections.a.a(lc00VarB));
                            }
                            elnVar = new eln(new tvo0(j83VarH3, a4xVarO0));
                        } else {
                            lsm0Var = lsm0Var2;
                            innVar2 = innVar3;
                            p3u0Var = p3u0Var2;
                            str = "-";
                            str2 = str4;
                            a4xVar = null;
                            if (nnnVar.equals(knn.f18594a)) {
                                elnVar = new eln(svo0.f32879a);
                            } else {
                                if (!nnnVar.equals(lnn.f20354a)) {
                                    t9f.b();
                                    return a4xVar;
                                }
                                elnVar = null;
                            }
                        }
                        if (elnVar != null) {
                            lc00VarB2.add(elnVar);
                        }
                        inn innVar4 = innVar2;
                        boolean z4 = innVar4.k;
                        q4f q4fVar2 = v0fVar.b;
                        if (q4fVar2 == q4f.e) {
                            i2 = R.string.min_bet_possible_win;
                        } else if (z4) {
                            i2 = R.string.edit_coupon_summary_possible_win;
                        } else {
                            i2 = (v0fVar.k && q4fVar2 == q4f.c) ? R.string.max_win_possible : R.string.bet_possible_win;
                        }
                        lsm0 lsm0Var3 = lsm0Var;
                        lc00VarB2.add(new cln(lsm0Var3.a(i2, Arrays.copyOf(new Object[0], 0)), (q4fVar2 == q4f.k || q4fVar2 == q4f.j || q4fVar2 == q4f.f) ? new qmn(str) : nnnVar instanceof knn ? pmn.f27244a : new qmn(cy7.e(pn40.d(v0fVar.l, str2, p3u0Var)))));
                        a4x a4xVarO1 = !z2 ? dyb.o0(kotlin.collections.a.a(lc00VarB2)) : a4xVar;
                        if (a4xVarO1 == null) {
                            a4xVarO1 = lak0.c;
                        }
                        nul nulVar = nul.e;
                        oe9 oe9Var = oe9.b;
                        return new jln(tc7Var, a4xVarO1, new wul(nulVar, oe9Var, new ue9(lsm0Var3.a(R.string.add_event_btn_text, Arrays.copyOf(new Object[0], 0))), true, false, false), new wul(lul.e, oe9Var, new ue9(lsm0Var3.a(R.string.save, Arrays.copyOf(new Object[0], 0))), innVar4.j, false, false));
                }
            }
        }, (byte) 20));
    }
}
