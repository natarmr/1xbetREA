package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes3.dex */
public final class by8 implements v6t0 {
    public final n0o0 A;
    public final Object B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f3404a = 1;
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
    public final n0o0 u;
    public final n0o0 v;
    public final n0o0 w;
    public final n0o0 x;
    public final n0o0 y;
    public final n0o0 z;

    public by8(yx8 yx8Var, ctf0 ctf0Var) {
        final byte b = 0;
        ctf0Var.getClass();
        this.b = ctf0Var;
        long j = yx8Var.l;
        xx8 xx8Var = yx8Var.c;
        wx8 wx8Var = yx8Var.f43408a;
        this.B = j == 126 ? ix8.c : yx8Var.k == vc0.PICTURE ? ix8.b : ix8.f15529a;
        this.c = maz.b(new yw9(yx8Var.f, new cp8((byte) 13), (byte) 20));
        this.d = maz.b(new yw9(yx8Var.g, new cp8(this, (byte) 15), (byte) 20));
        n0o0 n0o0VarH = bkb.H(Integer.valueOf(yx8Var.i));
        this.e = n0o0VarH;
        this.f = bkb.H(Boolean.valueOf(yx8Var.h));
        this.g = bkb.H(Boolean.valueOf(yx8Var.t));
        n0o0 n0o0VarH2 = bkb.H(Boolean.valueOf(yx8Var.d));
        this.h = n0o0VarH2;
        this.i = bkb.H(yx8Var.e);
        n0o0 n0o0VarH3 = bkb.H(wx8Var);
        this.j = n0o0VarH3;
        n0o0 n0o0VarH4 = bkb.H(yx8Var.b);
        this.k = n0o0VarH4;
        this.l = bkb.H(Boolean.valueOf(yx8Var.m));
        this.m = bkb.H(Boolean.valueOf(yx8Var.r));
        this.n = bkb.H(yx8Var.q);
        this.o = bkb.H(yx8Var.o);
        this.p = bkb.H(Boolean.valueOf(yx8Var.s));
        final byte b2 = 5;
        this.q = maz.b(new yw9(yx8Var.j, new Function1(this) { // from class: a.zx8
            public final /* synthetic */ by8 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:91:0x023e  */
            /* JADX WARN: Code duplicated, block: B:92:0x0241  */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                String str;
                String strC;
                long jM121getTransparent0d7_KjU;
                boolean z;
                hyl fylVar;
                char c;
                long backgroundContent;
                a4x a4xVarO0;
                wx8 wx8Var2;
                Iterator it;
                int i;
                int i2;
                char c2;
                dzh dzhVar;
                String strA;
                Integer numValueOf;
                Integer num;
                long jM98getGreen0d7_KjU;
                byte b3 = b2;
                by8 by8Var = this.b;
                int i3 = 0;
                switch (b3) {
                    case 0:
                        n0o0 n0o0Var = by8Var.c;
                        ctf0 ctf0Var2 = by8Var.b;
                        if (!((Boolean) obj).booleanValue()) {
                            return new uu8(ctf0Var2.b.a(R.string.button_login, Arrays.copyOf(new Object[0], 0)), ctf0Var2.b.a(R.string.registration, Arrays.copyOf(new Object[0], 0)));
                        }
                        ql5 ql5Var = (ql5) ((fee) by8Var.i.getValue()).c();
                        if (ql5Var != null) {
                            String strA2 = ql5Var.j;
                            if (((kg) ((fee) n0o0Var.getValue()).c()) == kg.SECONDARY) {
                                strA2 = ctf0Var2.b.a(R.string.all_balances, Arrays.copyOf(new Object[0], 0));
                            } else if (strA2.length() <= 0) {
                                strA2 = ql5Var.k;
                            }
                            str = strA2;
                        } else {
                            str = "";
                        }
                        if (ql5Var != null) {
                            double d = ql5Var.b;
                            pn40 pn40Var = pn40.f27267a;
                            strC = pn40.c(d, p3u0.c);
                        } else {
                            strC = null;
                        }
                        String str2 = strC == null ? "" : strC;
                        String str3 = ql5Var != null ? ql5Var.f : null;
                        String str4 = str3 == null ? "" : str3;
                        String strA3 = ctf0Var2.b.a(R.string.top_up, Arrays.copyOf(new Object[0], 0));
                        if (((ix8) by8Var.B) == ix8.f15529a) {
                            pz40 pz40Var = s6t0.f31722a;
                            jM121getTransparent0d7_KjU = s6t0.b().f33626a.getBackgroundContent();
                        } else {
                            pz40 pz40Var2 = s6t0.f31722a;
                            jM121getTransparent0d7_KjU = StaticColors.INSTANCE.m121getTransparent0d7_KjU();
                        }
                        return new tu8((ijl) ((fee) n0o0Var.getValue()).b(), new jjl(str2, str4, strA3, str, new y3d(jM121getTransparent0d7_KjU)));
                    case 1:
                        vx8 vx8Var = (vx8) obj;
                        vx8Var.getClass();
                        if (vx8Var.f38188a) {
                            fylVar = new gyl(null, null, 3);
                            z = true;
                        } else {
                            List<gw80> list = vx8Var.b;
                            ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                            for (gw80 gw80Var : list) {
                                long j2 = vx8Var.c;
                                String str5 = gw80Var.b;
                                long j3 = gw80Var.f12015a;
                                StringBuilder sb = new StringBuilder(ujn.h);
                                String strH = axq.h(j3, "/static/img/android/casino/brands/1xlive/icons/", ".webp");
                                if (strH.length() == 0) {
                                    sb.setLength(0);
                                } else {
                                    int i4 = 0;
                                    if (StringsKt.O(strH, ujn.h, false)) {
                                        sb.setLength(i4);
                                        sb.append(strH);
                                    } else if (kotlin.text.c.x(strH, "https://", false)) {
                                        i4 = 0;
                                        sb.setLength(i4);
                                        sb.append(strH);
                                    } else {
                                        if (sb.length() <= 0 || StringsKt.S(sb, Separators.SLASH)) {
                                            c = '/';
                                        } else {
                                            c = '/';
                                            sb.append('/');
                                        }
                                        sb.append(StringsKt.y0(strH, c));
                                    }
                                }
                                arrayList.add(by8.a(gw80Var, j2, new zxl(12, new n0x(sb.toString()), str5)));
                            }
                            z = true;
                            fylVar = new fyl(dyb.o0(arrayList), null, null, null, null, 30);
                        }
                        if (!(fylVar instanceof fyl)) {
                            if (fylVar instanceof gyl) {
                                return new op0((gyl) fylVar);
                            }
                            t9f.b();
                            return null;
                        }
                        fyl fylVar2 = (fyl) fylVar;
                        boolean zBooleanValue = ((Boolean) ((fee) by8Var.m.getValue()).c()).booleanValue();
                        String strA4 = by8Var.b.b.a(R.string.bet_filter, Arrays.copyOf(new Object[0], 0));
                        boolean z2 = (((Collection) ((fee) by8Var.n.getValue()).c()).isEmpty() && ((fee) by8Var.o.getValue()).c() == null) ? false : z;
                        if (((Boolean) ((fee) by8Var.p.getValue()).c()).booleanValue()) {
                            pz40 pz40Var3 = s6t0.f31722a;
                            backgroundContent = s6t0.b().f33626a.getBackground();
                        } else {
                            pz40 pz40Var4 = s6t0.f31722a;
                            backgroundContent = s6t0.b().f33626a.getBackgroundContent();
                        }
                        return new np0(fylVar2, zBooleanValue, strA4, z2, backgroundContent, 48);
                    case 2:
                        wx8 wx8Var3 = (wx8) obj;
                        wx8Var3.getClass();
                        boolean z3 = wx8Var3.b;
                        n0o0 n0o0Var2 = by8Var.d;
                        xll xllVar = xll.f41078a;
                        if (z3) {
                            return new aml((pt0) ((fee) n0o0Var2.getValue()).b(), xllVar, true);
                        }
                        pt0 pt0Var = (pt0) ((fee) n0o0Var2.getValue()).b();
                        List<mlr> list2 = wx8Var3.c;
                        ArrayList arrayList2 = new ArrayList(r3d.q(list2, 10));
                        for (mlr mlrVar : list2) {
                            arrayList2.add(ccq0.Z(mlrVar, by8Var.b, ((Boolean) ((fee) by8Var.h.getValue()).c()).booleanValue(), ((Boolean) ((fee) by8Var.f.getValue()).c()).booleanValue(), wx8Var3.d.contains(Long.valueOf(mlrVar.f22006a)), (pt0) ((fee) n0o0Var2.getValue()).b(), null));
                        }
                        return new zll(pt0Var, xllVar, arrayList2);
                    case 3:
                        wx8 wx8Var4 = (wx8) obj;
                        wx8Var4.getClass();
                        boolean z4 = wx8Var4.f39919a;
                        boolean z5 = wx8Var4.b;
                        List list3 = wx8Var4.c;
                        if (z4) {
                            return new fe70((mdm) ((fee) by8Var.s.getValue()).b());
                        }
                        if (list3.isEmpty() && !z5) {
                            return new ee70((mdm) ((fee) by8Var.r.getValue()).b());
                        }
                        if (z5) {
                            int i5 = (((Boolean) ((fee) by8Var.g.getValue()).c()).booleanValue() ? 4 : 3) * 4;
                            ArrayList arrayList3 = new ArrayList(i5);
                            while (i3 < i5) {
                                arrayList3.add(fzh.f10407a);
                                i3++;
                            }
                            a4xVarO0 = dyb.o0(arrayList3);
                        } else {
                            ArrayList arrayList4 = new ArrayList(r3d.q(list3, 10));
                            Iterator it2 = list3.iterator();
                            while (it2.hasNext()) {
                                mlr mlrVar2 = (mlr) it2.next();
                                ctf0 ctf0Var3 = by8Var.b;
                                boolean zBooleanValue2 = ((Boolean) ((fee) by8Var.h.getValue()).c()).booleanValue();
                                boolean zContains = wx8Var4.d.contains(Long.valueOf(mlrVar2.f22006a));
                                ctf0Var3.getClass();
                                int i6 = zBooleanValue2 ? zContains ? R.drawable.ic_favorites_slots_checked : R.drawable.ic_favorites_slots_unchecked : i3;
                                long j4 = mlrVar2.f22006a;
                                boolean z6 = mlrVar2.k;
                                String str6 = mlrVar2.e;
                                StringBuilder sb2 = new StringBuilder(ujn.h);
                                String str7 = mlrVar2.h;
                                str7.getClass();
                                if (str7.length() == 0) {
                                    wx8Var2 = wx8Var4;
                                    sb2.setLength(0);
                                    it = it2;
                                } else {
                                    wx8Var2 = wx8Var4;
                                    it = it2;
                                    if (StringsKt.O(str7, ujn.h, false)) {
                                        i = 0;
                                    } else if (kotlin.text.c.x(str7, "https://", false)) {
                                        i = 0;
                                    } else {
                                        if (sb2.length() <= 0 || StringsKt.S(sb2, Separators.SLASH)) {
                                            i2 = 1;
                                            c2 = '/';
                                        } else {
                                            sb2.append('/');
                                            c2 = '/';
                                            i2 = 1;
                                        }
                                        char[] cArr = new char[i2];
                                        cArr[0] = c2;
                                        sb2.append(StringsKt.y0(str7, cArr));
                                    }
                                    sb2.setLength(i);
                                    sb2.append(str7);
                                }
                                n0x n0xVar = new n0x(sb2.toString());
                                m0x m0xVar = new m0x(R.drawable.ic_aggregator_placeholder_vertical, null, 6);
                                if (z6) {
                                    strA = ctf0Var3.b.a(R.string.casino_promo_game_label, Arrays.copyOf(new Object[0], 0));
                                } else {
                                    if (mlrVar2.j) {
                                        strA = ctf0Var3.b.a(R.string.casino_new_game_label, Arrays.copyOf(new Object[0], 0));
                                    } else {
                                        dzhVar = null;
                                    }
                                    numValueOf = Integer.valueOf(i6);
                                    if (i6 > 0) {
                                        num = numValueOf;
                                    } else {
                                        num = null;
                                    }
                                    arrayList4.add(new ezh(j4, str6, n0xVar, m0xVar, true, dzhVar, num));
                                    wx8Var4 = wx8Var2;
                                    it2 = it;
                                    i3 = 0;
                                }
                                String str8 = strA;
                                StaticColors staticColors = StaticColors.INSTANCE;
                                long jM123getWhite0d7_KjU = staticColors.m123getWhite0d7_KjU();
                                if (z6) {
                                    pz40 pz40Var5 = s6t0.f31722a;
                                    jM98getGreen0d7_KjU = staticColors.m113getRed0d7_KjU();
                                } else {
                                    pz40 pz40Var6 = s6t0.f31722a;
                                    jM98getGreen0d7_KjU = staticColors.m98getGreen0d7_KjU();
                                }
                                dzhVar = new dzh(jM123getWhite0d7_KjU, jM98getGreen0d7_KjU, str8);
                                numValueOf = Integer.valueOf(i6);
                                if (i6 > 0) {
                                    num = numValueOf;
                                } else {
                                    num = null;
                                }
                                arrayList4.add(new ezh(j4, str6, n0xVar, m0xVar, true, dzhVar, num));
                                wx8Var4 = wx8Var2;
                                it2 = it;
                                i3 = 0;
                            }
                            a4xVarO0 = dyb.o0(arrayList4);
                        }
                        return new de70(a4xVarO0);
                    case 4:
                        wx8 wx8Var5 = (wx8) obj;
                        wx8Var5.getClass();
                        if (wx8Var5.f39919a) {
                            return new zu8((mdm) ((fee) by8Var.s.getValue()).b());
                        }
                        return (!wx8Var5.c.isEmpty() || wx8Var5.b) ? new xu8((bml) ((fee) by8Var.y.getValue()).b()) : new yu8((mdm) ((fee) by8Var.r.getValue()).b());
                    default:
                        String str9 = (String) obj;
                        str9.getClass();
                        if (((ix8) by8Var.B) == ix8.c) {
                            str9 = "/static/img/android/casino/brands/1xlive/head/1xLive_img.webp";
                        }
                        StringBuilder sb3 = new StringBuilder(ujn.h);
                        if (str9.length() == 0) {
                            sb3.setLength(0);
                        } else if (StringsKt.O(str9, ujn.h, false) || kotlin.text.c.x(str9, "https://", false)) {
                            sb3.setLength(0);
                            sb3.append(str9);
                        } else {
                            if (sb3.length() > 0 && !StringsKt.S(sb3, Separators.SLASH)) {
                                sb3.append('/');
                            }
                            sb3.append(StringsKt.y0(str9, '/'));
                        }
                        return sb3.toString();
                }
            }
        }, (byte) 20));
        this.r = bkb.G(((fee) n0o0VarH.getValue()).d, new cp8((byte) 16));
        this.s = bkb.G(((fee) n0o0VarH.getValue()).d, new cp8((byte) 17));
        this.t = maz.b(new yw9(xx8Var, new ay8(this, yx8Var), (byte) 20));
        this.u = maz.b(new yw9(xx8Var.f41644a, new ay8(yx8Var, this), (byte) 20));
        this.v = bkb.G(((fee) n0o0VarH2.getValue()).d, new Function1(this) { // from class: a.zx8
            public final /* synthetic */ by8 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:91:0x023e  */
            /* JADX WARN: Code duplicated, block: B:92:0x0241  */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                String str;
                String strC;
                long jM121getTransparent0d7_KjU;
                boolean z;
                hyl fylVar;
                char c;
                long backgroundContent;
                a4x a4xVarO0;
                wx8 wx8Var2;
                Iterator it;
                int i;
                int i2;
                char c2;
                dzh dzhVar;
                String strA;
                Integer numValueOf;
                Integer num;
                long jM98getGreen0d7_KjU;
                byte b3 = b;
                by8 by8Var = this.b;
                int i3 = 0;
                switch (b3) {
                    case 0:
                        n0o0 n0o0Var = by8Var.c;
                        ctf0 ctf0Var2 = by8Var.b;
                        if (!((Boolean) obj).booleanValue()) {
                            return new uu8(ctf0Var2.b.a(R.string.button_login, Arrays.copyOf(new Object[0], 0)), ctf0Var2.b.a(R.string.registration, Arrays.copyOf(new Object[0], 0)));
                        }
                        ql5 ql5Var = (ql5) ((fee) by8Var.i.getValue()).c();
                        if (ql5Var != null) {
                            String strA2 = ql5Var.j;
                            if (((kg) ((fee) n0o0Var.getValue()).c()) == kg.SECONDARY) {
                                strA2 = ctf0Var2.b.a(R.string.all_balances, Arrays.copyOf(new Object[0], 0));
                            } else if (strA2.length() <= 0) {
                                strA2 = ql5Var.k;
                            }
                            str = strA2;
                        } else {
                            str = "";
                        }
                        if (ql5Var != null) {
                            double d = ql5Var.b;
                            pn40 pn40Var = pn40.f27267a;
                            strC = pn40.c(d, p3u0.c);
                        } else {
                            strC = null;
                        }
                        String str2 = strC == null ? "" : strC;
                        String str3 = ql5Var != null ? ql5Var.f : null;
                        String str4 = str3 == null ? "" : str3;
                        String strA3 = ctf0Var2.b.a(R.string.top_up, Arrays.copyOf(new Object[0], 0));
                        if (((ix8) by8Var.B) == ix8.f15529a) {
                            pz40 pz40Var = s6t0.f31722a;
                            jM121getTransparent0d7_KjU = s6t0.b().f33626a.getBackgroundContent();
                        } else {
                            pz40 pz40Var2 = s6t0.f31722a;
                            jM121getTransparent0d7_KjU = StaticColors.INSTANCE.m121getTransparent0d7_KjU();
                        }
                        return new tu8((ijl) ((fee) n0o0Var.getValue()).b(), new jjl(str2, str4, strA3, str, new y3d(jM121getTransparent0d7_KjU)));
                    case 1:
                        vx8 vx8Var = (vx8) obj;
                        vx8Var.getClass();
                        if (vx8Var.f38188a) {
                            fylVar = new gyl(null, null, 3);
                            z = true;
                        } else {
                            List<gw80> list = vx8Var.b;
                            ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                            for (gw80 gw80Var : list) {
                                long j2 = vx8Var.c;
                                String str5 = gw80Var.b;
                                long j3 = gw80Var.f12015a;
                                StringBuilder sb = new StringBuilder(ujn.h);
                                String strH = axq.h(j3, "/static/img/android/casino/brands/1xlive/icons/", ".webp");
                                if (strH.length() == 0) {
                                    sb.setLength(0);
                                } else {
                                    int i4 = 0;
                                    if (StringsKt.O(strH, ujn.h, false)) {
                                        sb.setLength(i4);
                                        sb.append(strH);
                                    } else if (kotlin.text.c.x(strH, "https://", false)) {
                                        i4 = 0;
                                        sb.setLength(i4);
                                        sb.append(strH);
                                    } else {
                                        if (sb.length() <= 0 || StringsKt.S(sb, Separators.SLASH)) {
                                            c = '/';
                                        } else {
                                            c = '/';
                                            sb.append('/');
                                        }
                                        sb.append(StringsKt.y0(strH, c));
                                    }
                                }
                                arrayList.add(by8.a(gw80Var, j2, new zxl(12, new n0x(sb.toString()), str5)));
                            }
                            z = true;
                            fylVar = new fyl(dyb.o0(arrayList), null, null, null, null, 30);
                        }
                        if (!(fylVar instanceof fyl)) {
                            if (fylVar instanceof gyl) {
                                return new op0((gyl) fylVar);
                            }
                            t9f.b();
                            return null;
                        }
                        fyl fylVar2 = (fyl) fylVar;
                        boolean zBooleanValue = ((Boolean) ((fee) by8Var.m.getValue()).c()).booleanValue();
                        String strA4 = by8Var.b.b.a(R.string.bet_filter, Arrays.copyOf(new Object[0], 0));
                        boolean z2 = (((Collection) ((fee) by8Var.n.getValue()).c()).isEmpty() && ((fee) by8Var.o.getValue()).c() == null) ? false : z;
                        if (((Boolean) ((fee) by8Var.p.getValue()).c()).booleanValue()) {
                            pz40 pz40Var3 = s6t0.f31722a;
                            backgroundContent = s6t0.b().f33626a.getBackground();
                        } else {
                            pz40 pz40Var4 = s6t0.f31722a;
                            backgroundContent = s6t0.b().f33626a.getBackgroundContent();
                        }
                        return new np0(fylVar2, zBooleanValue, strA4, z2, backgroundContent, 48);
                    case 2:
                        wx8 wx8Var3 = (wx8) obj;
                        wx8Var3.getClass();
                        boolean z3 = wx8Var3.b;
                        n0o0 n0o0Var2 = by8Var.d;
                        xll xllVar = xll.f41078a;
                        if (z3) {
                            return new aml((pt0) ((fee) n0o0Var2.getValue()).b(), xllVar, true);
                        }
                        pt0 pt0Var = (pt0) ((fee) n0o0Var2.getValue()).b();
                        List<mlr> list2 = wx8Var3.c;
                        ArrayList arrayList2 = new ArrayList(r3d.q(list2, 10));
                        for (mlr mlrVar : list2) {
                            arrayList2.add(ccq0.Z(mlrVar, by8Var.b, ((Boolean) ((fee) by8Var.h.getValue()).c()).booleanValue(), ((Boolean) ((fee) by8Var.f.getValue()).c()).booleanValue(), wx8Var3.d.contains(Long.valueOf(mlrVar.f22006a)), (pt0) ((fee) n0o0Var2.getValue()).b(), null));
                        }
                        return new zll(pt0Var, xllVar, arrayList2);
                    case 3:
                        wx8 wx8Var4 = (wx8) obj;
                        wx8Var4.getClass();
                        boolean z4 = wx8Var4.f39919a;
                        boolean z5 = wx8Var4.b;
                        List list3 = wx8Var4.c;
                        if (z4) {
                            return new fe70((mdm) ((fee) by8Var.s.getValue()).b());
                        }
                        if (list3.isEmpty() && !z5) {
                            return new ee70((mdm) ((fee) by8Var.r.getValue()).b());
                        }
                        if (z5) {
                            int i5 = (((Boolean) ((fee) by8Var.g.getValue()).c()).booleanValue() ? 4 : 3) * 4;
                            ArrayList arrayList3 = new ArrayList(i5);
                            while (i3 < i5) {
                                arrayList3.add(fzh.f10407a);
                                i3++;
                            }
                            a4xVarO0 = dyb.o0(arrayList3);
                        } else {
                            ArrayList arrayList4 = new ArrayList(r3d.q(list3, 10));
                            Iterator it2 = list3.iterator();
                            while (it2.hasNext()) {
                                mlr mlrVar2 = (mlr) it2.next();
                                ctf0 ctf0Var3 = by8Var.b;
                                boolean zBooleanValue2 = ((Boolean) ((fee) by8Var.h.getValue()).c()).booleanValue();
                                boolean zContains = wx8Var4.d.contains(Long.valueOf(mlrVar2.f22006a));
                                ctf0Var3.getClass();
                                int i6 = zBooleanValue2 ? zContains ? R.drawable.ic_favorites_slots_checked : R.drawable.ic_favorites_slots_unchecked : i3;
                                long j4 = mlrVar2.f22006a;
                                boolean z6 = mlrVar2.k;
                                String str6 = mlrVar2.e;
                                StringBuilder sb2 = new StringBuilder(ujn.h);
                                String str7 = mlrVar2.h;
                                str7.getClass();
                                if (str7.length() == 0) {
                                    wx8Var2 = wx8Var4;
                                    sb2.setLength(0);
                                    it = it2;
                                } else {
                                    wx8Var2 = wx8Var4;
                                    it = it2;
                                    if (StringsKt.O(str7, ujn.h, false)) {
                                        i = 0;
                                    } else if (kotlin.text.c.x(str7, "https://", false)) {
                                        i = 0;
                                    } else {
                                        if (sb2.length() <= 0 || StringsKt.S(sb2, Separators.SLASH)) {
                                            i2 = 1;
                                            c2 = '/';
                                        } else {
                                            sb2.append('/');
                                            c2 = '/';
                                            i2 = 1;
                                        }
                                        char[] cArr = new char[i2];
                                        cArr[0] = c2;
                                        sb2.append(StringsKt.y0(str7, cArr));
                                    }
                                    sb2.setLength(i);
                                    sb2.append(str7);
                                }
                                n0x n0xVar = new n0x(sb2.toString());
                                m0x m0xVar = new m0x(R.drawable.ic_aggregator_placeholder_vertical, null, 6);
                                if (z6) {
                                    strA = ctf0Var3.b.a(R.string.casino_promo_game_label, Arrays.copyOf(new Object[0], 0));
                                } else {
                                    if (mlrVar2.j) {
                                        strA = ctf0Var3.b.a(R.string.casino_new_game_label, Arrays.copyOf(new Object[0], 0));
                                    } else {
                                        dzhVar = null;
                                    }
                                    numValueOf = Integer.valueOf(i6);
                                    if (i6 > 0) {
                                        num = numValueOf;
                                    } else {
                                        num = null;
                                    }
                                    arrayList4.add(new ezh(j4, str6, n0xVar, m0xVar, true, dzhVar, num));
                                    wx8Var4 = wx8Var2;
                                    it2 = it;
                                    i3 = 0;
                                }
                                String str8 = strA;
                                StaticColors staticColors = StaticColors.INSTANCE;
                                long jM123getWhite0d7_KjU = staticColors.m123getWhite0d7_KjU();
                                if (z6) {
                                    pz40 pz40Var5 = s6t0.f31722a;
                                    jM98getGreen0d7_KjU = staticColors.m113getRed0d7_KjU();
                                } else {
                                    pz40 pz40Var6 = s6t0.f31722a;
                                    jM98getGreen0d7_KjU = staticColors.m98getGreen0d7_KjU();
                                }
                                dzhVar = new dzh(jM123getWhite0d7_KjU, jM98getGreen0d7_KjU, str8);
                                numValueOf = Integer.valueOf(i6);
                                if (i6 > 0) {
                                    num = numValueOf;
                                } else {
                                    num = null;
                                }
                                arrayList4.add(new ezh(j4, str6, n0xVar, m0xVar, true, dzhVar, num));
                                wx8Var4 = wx8Var2;
                                it2 = it;
                                i3 = 0;
                            }
                            a4xVarO0 = dyb.o0(arrayList4);
                        }
                        return new de70(a4xVarO0);
                    case 4:
                        wx8 wx8Var5 = (wx8) obj;
                        wx8Var5.getClass();
                        if (wx8Var5.f39919a) {
                            return new zu8((mdm) ((fee) by8Var.s.getValue()).b());
                        }
                        return (!wx8Var5.c.isEmpty() || wx8Var5.b) ? new xu8((bml) ((fee) by8Var.y.getValue()).b()) : new yu8((mdm) ((fee) by8Var.r.getValue()).b());
                    default:
                        String str9 = (String) obj;
                        str9.getClass();
                        if (((ix8) by8Var.B) == ix8.c) {
                            str9 = "/static/img/android/casino/brands/1xlive/head/1xLive_img.webp";
                        }
                        StringBuilder sb3 = new StringBuilder(ujn.h);
                        if (str9.length() == 0) {
                            sb3.setLength(0);
                        } else if (StringsKt.O(str9, ujn.h, false) || kotlin.text.c.x(str9, "https://", false)) {
                            sb3.setLength(0);
                            sb3.append(str9);
                        } else {
                            if (sb3.length() > 0 && !StringsKt.S(sb3, Separators.SLASH)) {
                                sb3.append('/');
                            }
                            sb3.append(StringsKt.y0(str9, '/'));
                        }
                        return sb3.toString();
                }
            }
        });
        this.w = bkb.G(((fee) n0o0VarH4.getValue()).d, new cp8(this, (byte) 14));
        final byte b3 = 1;
        this.x = bkb.G(((fee) n0o0VarH4.getValue()).d, new Function1(this) { // from class: a.zx8
            public final /* synthetic */ by8 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:91:0x023e  */
            /* JADX WARN: Code duplicated, block: B:92:0x0241  */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                String str;
                String strC;
                long jM121getTransparent0d7_KjU;
                boolean z;
                hyl fylVar;
                char c;
                long backgroundContent;
                a4x a4xVarO0;
                wx8 wx8Var2;
                Iterator it;
                int i;
                int i2;
                char c2;
                dzh dzhVar;
                String strA;
                Integer numValueOf;
                Integer num;
                long jM98getGreen0d7_KjU;
                byte b4 = b3;
                by8 by8Var = this.b;
                int i3 = 0;
                switch (b4) {
                    case 0:
                        n0o0 n0o0Var = by8Var.c;
                        ctf0 ctf0Var2 = by8Var.b;
                        if (!((Boolean) obj).booleanValue()) {
                            return new uu8(ctf0Var2.b.a(R.string.button_login, Arrays.copyOf(new Object[0], 0)), ctf0Var2.b.a(R.string.registration, Arrays.copyOf(new Object[0], 0)));
                        }
                        ql5 ql5Var = (ql5) ((fee) by8Var.i.getValue()).c();
                        if (ql5Var != null) {
                            String strA2 = ql5Var.j;
                            if (((kg) ((fee) n0o0Var.getValue()).c()) == kg.SECONDARY) {
                                strA2 = ctf0Var2.b.a(R.string.all_balances, Arrays.copyOf(new Object[0], 0));
                            } else if (strA2.length() <= 0) {
                                strA2 = ql5Var.k;
                            }
                            str = strA2;
                        } else {
                            str = "";
                        }
                        if (ql5Var != null) {
                            double d = ql5Var.b;
                            pn40 pn40Var = pn40.f27267a;
                            strC = pn40.c(d, p3u0.c);
                        } else {
                            strC = null;
                        }
                        String str2 = strC == null ? "" : strC;
                        String str3 = ql5Var != null ? ql5Var.f : null;
                        String str4 = str3 == null ? "" : str3;
                        String strA3 = ctf0Var2.b.a(R.string.top_up, Arrays.copyOf(new Object[0], 0));
                        if (((ix8) by8Var.B) == ix8.f15529a) {
                            pz40 pz40Var = s6t0.f31722a;
                            jM121getTransparent0d7_KjU = s6t0.b().f33626a.getBackgroundContent();
                        } else {
                            pz40 pz40Var2 = s6t0.f31722a;
                            jM121getTransparent0d7_KjU = StaticColors.INSTANCE.m121getTransparent0d7_KjU();
                        }
                        return new tu8((ijl) ((fee) n0o0Var.getValue()).b(), new jjl(str2, str4, strA3, str, new y3d(jM121getTransparent0d7_KjU)));
                    case 1:
                        vx8 vx8Var = (vx8) obj;
                        vx8Var.getClass();
                        if (vx8Var.f38188a) {
                            fylVar = new gyl(null, null, 3);
                            z = true;
                        } else {
                            List<gw80> list = vx8Var.b;
                            ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                            for (gw80 gw80Var : list) {
                                long j2 = vx8Var.c;
                                String str5 = gw80Var.b;
                                long j3 = gw80Var.f12015a;
                                StringBuilder sb = new StringBuilder(ujn.h);
                                String strH = axq.h(j3, "/static/img/android/casino/brands/1xlive/icons/", ".webp");
                                if (strH.length() == 0) {
                                    sb.setLength(0);
                                } else {
                                    int i4 = 0;
                                    if (StringsKt.O(strH, ujn.h, false)) {
                                        sb.setLength(i4);
                                        sb.append(strH);
                                    } else if (kotlin.text.c.x(strH, "https://", false)) {
                                        i4 = 0;
                                        sb.setLength(i4);
                                        sb.append(strH);
                                    } else {
                                        if (sb.length() <= 0 || StringsKt.S(sb, Separators.SLASH)) {
                                            c = '/';
                                        } else {
                                            c = '/';
                                            sb.append('/');
                                        }
                                        sb.append(StringsKt.y0(strH, c));
                                    }
                                }
                                arrayList.add(by8.a(gw80Var, j2, new zxl(12, new n0x(sb.toString()), str5)));
                            }
                            z = true;
                            fylVar = new fyl(dyb.o0(arrayList), null, null, null, null, 30);
                        }
                        if (!(fylVar instanceof fyl)) {
                            if (fylVar instanceof gyl) {
                                return new op0((gyl) fylVar);
                            }
                            t9f.b();
                            return null;
                        }
                        fyl fylVar2 = (fyl) fylVar;
                        boolean zBooleanValue = ((Boolean) ((fee) by8Var.m.getValue()).c()).booleanValue();
                        String strA4 = by8Var.b.b.a(R.string.bet_filter, Arrays.copyOf(new Object[0], 0));
                        boolean z2 = (((Collection) ((fee) by8Var.n.getValue()).c()).isEmpty() && ((fee) by8Var.o.getValue()).c() == null) ? false : z;
                        if (((Boolean) ((fee) by8Var.p.getValue()).c()).booleanValue()) {
                            pz40 pz40Var3 = s6t0.f31722a;
                            backgroundContent = s6t0.b().f33626a.getBackground();
                        } else {
                            pz40 pz40Var4 = s6t0.f31722a;
                            backgroundContent = s6t0.b().f33626a.getBackgroundContent();
                        }
                        return new np0(fylVar2, zBooleanValue, strA4, z2, backgroundContent, 48);
                    case 2:
                        wx8 wx8Var3 = (wx8) obj;
                        wx8Var3.getClass();
                        boolean z3 = wx8Var3.b;
                        n0o0 n0o0Var2 = by8Var.d;
                        xll xllVar = xll.f41078a;
                        if (z3) {
                            return new aml((pt0) ((fee) n0o0Var2.getValue()).b(), xllVar, true);
                        }
                        pt0 pt0Var = (pt0) ((fee) n0o0Var2.getValue()).b();
                        List<mlr> list2 = wx8Var3.c;
                        ArrayList arrayList2 = new ArrayList(r3d.q(list2, 10));
                        for (mlr mlrVar : list2) {
                            arrayList2.add(ccq0.Z(mlrVar, by8Var.b, ((Boolean) ((fee) by8Var.h.getValue()).c()).booleanValue(), ((Boolean) ((fee) by8Var.f.getValue()).c()).booleanValue(), wx8Var3.d.contains(Long.valueOf(mlrVar.f22006a)), (pt0) ((fee) n0o0Var2.getValue()).b(), null));
                        }
                        return new zll(pt0Var, xllVar, arrayList2);
                    case 3:
                        wx8 wx8Var4 = (wx8) obj;
                        wx8Var4.getClass();
                        boolean z4 = wx8Var4.f39919a;
                        boolean z5 = wx8Var4.b;
                        List list3 = wx8Var4.c;
                        if (z4) {
                            return new fe70((mdm) ((fee) by8Var.s.getValue()).b());
                        }
                        if (list3.isEmpty() && !z5) {
                            return new ee70((mdm) ((fee) by8Var.r.getValue()).b());
                        }
                        if (z5) {
                            int i5 = (((Boolean) ((fee) by8Var.g.getValue()).c()).booleanValue() ? 4 : 3) * 4;
                            ArrayList arrayList3 = new ArrayList(i5);
                            while (i3 < i5) {
                                arrayList3.add(fzh.f10407a);
                                i3++;
                            }
                            a4xVarO0 = dyb.o0(arrayList3);
                        } else {
                            ArrayList arrayList4 = new ArrayList(r3d.q(list3, 10));
                            Iterator it2 = list3.iterator();
                            while (it2.hasNext()) {
                                mlr mlrVar2 = (mlr) it2.next();
                                ctf0 ctf0Var3 = by8Var.b;
                                boolean zBooleanValue2 = ((Boolean) ((fee) by8Var.h.getValue()).c()).booleanValue();
                                boolean zContains = wx8Var4.d.contains(Long.valueOf(mlrVar2.f22006a));
                                ctf0Var3.getClass();
                                int i6 = zBooleanValue2 ? zContains ? R.drawable.ic_favorites_slots_checked : R.drawable.ic_favorites_slots_unchecked : i3;
                                long j4 = mlrVar2.f22006a;
                                boolean z6 = mlrVar2.k;
                                String str6 = mlrVar2.e;
                                StringBuilder sb2 = new StringBuilder(ujn.h);
                                String str7 = mlrVar2.h;
                                str7.getClass();
                                if (str7.length() == 0) {
                                    wx8Var2 = wx8Var4;
                                    sb2.setLength(0);
                                    it = it2;
                                } else {
                                    wx8Var2 = wx8Var4;
                                    it = it2;
                                    if (StringsKt.O(str7, ujn.h, false)) {
                                        i = 0;
                                    } else if (kotlin.text.c.x(str7, "https://", false)) {
                                        i = 0;
                                    } else {
                                        if (sb2.length() <= 0 || StringsKt.S(sb2, Separators.SLASH)) {
                                            i2 = 1;
                                            c2 = '/';
                                        } else {
                                            sb2.append('/');
                                            c2 = '/';
                                            i2 = 1;
                                        }
                                        char[] cArr = new char[i2];
                                        cArr[0] = c2;
                                        sb2.append(StringsKt.y0(str7, cArr));
                                    }
                                    sb2.setLength(i);
                                    sb2.append(str7);
                                }
                                n0x n0xVar = new n0x(sb2.toString());
                                m0x m0xVar = new m0x(R.drawable.ic_aggregator_placeholder_vertical, null, 6);
                                if (z6) {
                                    strA = ctf0Var3.b.a(R.string.casino_promo_game_label, Arrays.copyOf(new Object[0], 0));
                                } else {
                                    if (mlrVar2.j) {
                                        strA = ctf0Var3.b.a(R.string.casino_new_game_label, Arrays.copyOf(new Object[0], 0));
                                    } else {
                                        dzhVar = null;
                                    }
                                    numValueOf = Integer.valueOf(i6);
                                    if (i6 > 0) {
                                        num = numValueOf;
                                    } else {
                                        num = null;
                                    }
                                    arrayList4.add(new ezh(j4, str6, n0xVar, m0xVar, true, dzhVar, num));
                                    wx8Var4 = wx8Var2;
                                    it2 = it;
                                    i3 = 0;
                                }
                                String str8 = strA;
                                StaticColors staticColors = StaticColors.INSTANCE;
                                long jM123getWhite0d7_KjU = staticColors.m123getWhite0d7_KjU();
                                if (z6) {
                                    pz40 pz40Var5 = s6t0.f31722a;
                                    jM98getGreen0d7_KjU = staticColors.m113getRed0d7_KjU();
                                } else {
                                    pz40 pz40Var6 = s6t0.f31722a;
                                    jM98getGreen0d7_KjU = staticColors.m98getGreen0d7_KjU();
                                }
                                dzhVar = new dzh(jM123getWhite0d7_KjU, jM98getGreen0d7_KjU, str8);
                                numValueOf = Integer.valueOf(i6);
                                if (i6 > 0) {
                                    num = numValueOf;
                                } else {
                                    num = null;
                                }
                                arrayList4.add(new ezh(j4, str6, n0xVar, m0xVar, true, dzhVar, num));
                                wx8Var4 = wx8Var2;
                                it2 = it;
                                i3 = 0;
                            }
                            a4xVarO0 = dyb.o0(arrayList4);
                        }
                        return new de70(a4xVarO0);
                    case 4:
                        wx8 wx8Var5 = (wx8) obj;
                        wx8Var5.getClass();
                        if (wx8Var5.f39919a) {
                            return new zu8((mdm) ((fee) by8Var.s.getValue()).b());
                        }
                        return (!wx8Var5.c.isEmpty() || wx8Var5.b) ? new xu8((bml) ((fee) by8Var.y.getValue()).b()) : new yu8((mdm) ((fee) by8Var.r.getValue()).b());
                    default:
                        String str9 = (String) obj;
                        str9.getClass();
                        if (((ix8) by8Var.B) == ix8.c) {
                            str9 = "/static/img/android/casino/brands/1xlive/head/1xLive_img.webp";
                        }
                        StringBuilder sb3 = new StringBuilder(ujn.h);
                        if (str9.length() == 0) {
                            sb3.setLength(0);
                        } else if (StringsKt.O(str9, ujn.h, false) || kotlin.text.c.x(str9, "https://", false)) {
                            sb3.setLength(0);
                            sb3.append(str9);
                        } else {
                            if (sb3.length() > 0 && !StringsKt.S(sb3, Separators.SLASH)) {
                                sb3.append('/');
                            }
                            sb3.append(StringsKt.y0(str9, '/'));
                        }
                        return sb3.toString();
                }
            }
        });
        final byte b4 = 2;
        this.y = bkb.G(((fee) n0o0VarH3.getValue()).d, new Function1(this) { // from class: a.zx8
            public final /* synthetic */ by8 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:91:0x023e  */
            /* JADX WARN: Code duplicated, block: B:92:0x0241  */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                String str;
                String strC;
                long jM121getTransparent0d7_KjU;
                boolean z;
                hyl fylVar;
                char c;
                long backgroundContent;
                a4x a4xVarO0;
                wx8 wx8Var2;
                Iterator it;
                int i;
                int i2;
                char c2;
                dzh dzhVar;
                String strA;
                Integer numValueOf;
                Integer num;
                long jM98getGreen0d7_KjU;
                byte b5 = b4;
                by8 by8Var = this.b;
                int i3 = 0;
                switch (b5) {
                    case 0:
                        n0o0 n0o0Var = by8Var.c;
                        ctf0 ctf0Var2 = by8Var.b;
                        if (!((Boolean) obj).booleanValue()) {
                            return new uu8(ctf0Var2.b.a(R.string.button_login, Arrays.copyOf(new Object[0], 0)), ctf0Var2.b.a(R.string.registration, Arrays.copyOf(new Object[0], 0)));
                        }
                        ql5 ql5Var = (ql5) ((fee) by8Var.i.getValue()).c();
                        if (ql5Var != null) {
                            String strA2 = ql5Var.j;
                            if (((kg) ((fee) n0o0Var.getValue()).c()) == kg.SECONDARY) {
                                strA2 = ctf0Var2.b.a(R.string.all_balances, Arrays.copyOf(new Object[0], 0));
                            } else if (strA2.length() <= 0) {
                                strA2 = ql5Var.k;
                            }
                            str = strA2;
                        } else {
                            str = "";
                        }
                        if (ql5Var != null) {
                            double d = ql5Var.b;
                            pn40 pn40Var = pn40.f27267a;
                            strC = pn40.c(d, p3u0.c);
                        } else {
                            strC = null;
                        }
                        String str2 = strC == null ? "" : strC;
                        String str3 = ql5Var != null ? ql5Var.f : null;
                        String str4 = str3 == null ? "" : str3;
                        String strA3 = ctf0Var2.b.a(R.string.top_up, Arrays.copyOf(new Object[0], 0));
                        if (((ix8) by8Var.B) == ix8.f15529a) {
                            pz40 pz40Var = s6t0.f31722a;
                            jM121getTransparent0d7_KjU = s6t0.b().f33626a.getBackgroundContent();
                        } else {
                            pz40 pz40Var2 = s6t0.f31722a;
                            jM121getTransparent0d7_KjU = StaticColors.INSTANCE.m121getTransparent0d7_KjU();
                        }
                        return new tu8((ijl) ((fee) n0o0Var.getValue()).b(), new jjl(str2, str4, strA3, str, new y3d(jM121getTransparent0d7_KjU)));
                    case 1:
                        vx8 vx8Var = (vx8) obj;
                        vx8Var.getClass();
                        if (vx8Var.f38188a) {
                            fylVar = new gyl(null, null, 3);
                            z = true;
                        } else {
                            List<gw80> list = vx8Var.b;
                            ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                            for (gw80 gw80Var : list) {
                                long j2 = vx8Var.c;
                                String str5 = gw80Var.b;
                                long j3 = gw80Var.f12015a;
                                StringBuilder sb = new StringBuilder(ujn.h);
                                String strH = axq.h(j3, "/static/img/android/casino/brands/1xlive/icons/", ".webp");
                                if (strH.length() == 0) {
                                    sb.setLength(0);
                                } else {
                                    int i4 = 0;
                                    if (StringsKt.O(strH, ujn.h, false)) {
                                        sb.setLength(i4);
                                        sb.append(strH);
                                    } else if (kotlin.text.c.x(strH, "https://", false)) {
                                        i4 = 0;
                                        sb.setLength(i4);
                                        sb.append(strH);
                                    } else {
                                        if (sb.length() <= 0 || StringsKt.S(sb, Separators.SLASH)) {
                                            c = '/';
                                        } else {
                                            c = '/';
                                            sb.append('/');
                                        }
                                        sb.append(StringsKt.y0(strH, c));
                                    }
                                }
                                arrayList.add(by8.a(gw80Var, j2, new zxl(12, new n0x(sb.toString()), str5)));
                            }
                            z = true;
                            fylVar = new fyl(dyb.o0(arrayList), null, null, null, null, 30);
                        }
                        if (!(fylVar instanceof fyl)) {
                            if (fylVar instanceof gyl) {
                                return new op0((gyl) fylVar);
                            }
                            t9f.b();
                            return null;
                        }
                        fyl fylVar2 = (fyl) fylVar;
                        boolean zBooleanValue = ((Boolean) ((fee) by8Var.m.getValue()).c()).booleanValue();
                        String strA4 = by8Var.b.b.a(R.string.bet_filter, Arrays.copyOf(new Object[0], 0));
                        boolean z2 = (((Collection) ((fee) by8Var.n.getValue()).c()).isEmpty() && ((fee) by8Var.o.getValue()).c() == null) ? false : z;
                        if (((Boolean) ((fee) by8Var.p.getValue()).c()).booleanValue()) {
                            pz40 pz40Var3 = s6t0.f31722a;
                            backgroundContent = s6t0.b().f33626a.getBackground();
                        } else {
                            pz40 pz40Var4 = s6t0.f31722a;
                            backgroundContent = s6t0.b().f33626a.getBackgroundContent();
                        }
                        return new np0(fylVar2, zBooleanValue, strA4, z2, backgroundContent, 48);
                    case 2:
                        wx8 wx8Var3 = (wx8) obj;
                        wx8Var3.getClass();
                        boolean z3 = wx8Var3.b;
                        n0o0 n0o0Var2 = by8Var.d;
                        xll xllVar = xll.f41078a;
                        if (z3) {
                            return new aml((pt0) ((fee) n0o0Var2.getValue()).b(), xllVar, true);
                        }
                        pt0 pt0Var = (pt0) ((fee) n0o0Var2.getValue()).b();
                        List<mlr> list2 = wx8Var3.c;
                        ArrayList arrayList2 = new ArrayList(r3d.q(list2, 10));
                        for (mlr mlrVar : list2) {
                            arrayList2.add(ccq0.Z(mlrVar, by8Var.b, ((Boolean) ((fee) by8Var.h.getValue()).c()).booleanValue(), ((Boolean) ((fee) by8Var.f.getValue()).c()).booleanValue(), wx8Var3.d.contains(Long.valueOf(mlrVar.f22006a)), (pt0) ((fee) n0o0Var2.getValue()).b(), null));
                        }
                        return new zll(pt0Var, xllVar, arrayList2);
                    case 3:
                        wx8 wx8Var4 = (wx8) obj;
                        wx8Var4.getClass();
                        boolean z4 = wx8Var4.f39919a;
                        boolean z5 = wx8Var4.b;
                        List list3 = wx8Var4.c;
                        if (z4) {
                            return new fe70((mdm) ((fee) by8Var.s.getValue()).b());
                        }
                        if (list3.isEmpty() && !z5) {
                            return new ee70((mdm) ((fee) by8Var.r.getValue()).b());
                        }
                        if (z5) {
                            int i5 = (((Boolean) ((fee) by8Var.g.getValue()).c()).booleanValue() ? 4 : 3) * 4;
                            ArrayList arrayList3 = new ArrayList(i5);
                            while (i3 < i5) {
                                arrayList3.add(fzh.f10407a);
                                i3++;
                            }
                            a4xVarO0 = dyb.o0(arrayList3);
                        } else {
                            ArrayList arrayList4 = new ArrayList(r3d.q(list3, 10));
                            Iterator it2 = list3.iterator();
                            while (it2.hasNext()) {
                                mlr mlrVar2 = (mlr) it2.next();
                                ctf0 ctf0Var3 = by8Var.b;
                                boolean zBooleanValue2 = ((Boolean) ((fee) by8Var.h.getValue()).c()).booleanValue();
                                boolean zContains = wx8Var4.d.contains(Long.valueOf(mlrVar2.f22006a));
                                ctf0Var3.getClass();
                                int i6 = zBooleanValue2 ? zContains ? R.drawable.ic_favorites_slots_checked : R.drawable.ic_favorites_slots_unchecked : i3;
                                long j4 = mlrVar2.f22006a;
                                boolean z6 = mlrVar2.k;
                                String str6 = mlrVar2.e;
                                StringBuilder sb2 = new StringBuilder(ujn.h);
                                String str7 = mlrVar2.h;
                                str7.getClass();
                                if (str7.length() == 0) {
                                    wx8Var2 = wx8Var4;
                                    sb2.setLength(0);
                                    it = it2;
                                } else {
                                    wx8Var2 = wx8Var4;
                                    it = it2;
                                    if (StringsKt.O(str7, ujn.h, false)) {
                                        i = 0;
                                    } else if (kotlin.text.c.x(str7, "https://", false)) {
                                        i = 0;
                                    } else {
                                        if (sb2.length() <= 0 || StringsKt.S(sb2, Separators.SLASH)) {
                                            i2 = 1;
                                            c2 = '/';
                                        } else {
                                            sb2.append('/');
                                            c2 = '/';
                                            i2 = 1;
                                        }
                                        char[] cArr = new char[i2];
                                        cArr[0] = c2;
                                        sb2.append(StringsKt.y0(str7, cArr));
                                    }
                                    sb2.setLength(i);
                                    sb2.append(str7);
                                }
                                n0x n0xVar = new n0x(sb2.toString());
                                m0x m0xVar = new m0x(R.drawable.ic_aggregator_placeholder_vertical, null, 6);
                                if (z6) {
                                    strA = ctf0Var3.b.a(R.string.casino_promo_game_label, Arrays.copyOf(new Object[0], 0));
                                } else {
                                    if (mlrVar2.j) {
                                        strA = ctf0Var3.b.a(R.string.casino_new_game_label, Arrays.copyOf(new Object[0], 0));
                                    } else {
                                        dzhVar = null;
                                    }
                                    numValueOf = Integer.valueOf(i6);
                                    if (i6 > 0) {
                                        num = numValueOf;
                                    } else {
                                        num = null;
                                    }
                                    arrayList4.add(new ezh(j4, str6, n0xVar, m0xVar, true, dzhVar, num));
                                    wx8Var4 = wx8Var2;
                                    it2 = it;
                                    i3 = 0;
                                }
                                String str8 = strA;
                                StaticColors staticColors = StaticColors.INSTANCE;
                                long jM123getWhite0d7_KjU = staticColors.m123getWhite0d7_KjU();
                                if (z6) {
                                    pz40 pz40Var5 = s6t0.f31722a;
                                    jM98getGreen0d7_KjU = staticColors.m113getRed0d7_KjU();
                                } else {
                                    pz40 pz40Var6 = s6t0.f31722a;
                                    jM98getGreen0d7_KjU = staticColors.m98getGreen0d7_KjU();
                                }
                                dzhVar = new dzh(jM123getWhite0d7_KjU, jM98getGreen0d7_KjU, str8);
                                numValueOf = Integer.valueOf(i6);
                                if (i6 > 0) {
                                    num = numValueOf;
                                } else {
                                    num = null;
                                }
                                arrayList4.add(new ezh(j4, str6, n0xVar, m0xVar, true, dzhVar, num));
                                wx8Var4 = wx8Var2;
                                it2 = it;
                                i3 = 0;
                            }
                            a4xVarO0 = dyb.o0(arrayList4);
                        }
                        return new de70(a4xVarO0);
                    case 4:
                        wx8 wx8Var5 = (wx8) obj;
                        wx8Var5.getClass();
                        if (wx8Var5.f39919a) {
                            return new zu8((mdm) ((fee) by8Var.s.getValue()).b());
                        }
                        return (!wx8Var5.c.isEmpty() || wx8Var5.b) ? new xu8((bml) ((fee) by8Var.y.getValue()).b()) : new yu8((mdm) ((fee) by8Var.r.getValue()).b());
                    default:
                        String str9 = (String) obj;
                        str9.getClass();
                        if (((ix8) by8Var.B) == ix8.c) {
                            str9 = "/static/img/android/casino/brands/1xlive/head/1xLive_img.webp";
                        }
                        StringBuilder sb3 = new StringBuilder(ujn.h);
                        if (str9.length() == 0) {
                            sb3.setLength(0);
                        } else if (StringsKt.O(str9, ujn.h, false) || kotlin.text.c.x(str9, "https://", false)) {
                            sb3.setLength(0);
                            sb3.append(str9);
                        } else {
                            if (sb3.length() > 0 && !StringsKt.S(sb3, Separators.SLASH)) {
                                sb3.append('/');
                            }
                            sb3.append(StringsKt.y0(str9, '/'));
                        }
                        return sb3.toString();
                }
            }
        });
        final byte b5 = 3;
        this.z = maz.b(new yw9(wx8Var, new Function1(this) { // from class: a.zx8
            public final /* synthetic */ by8 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:91:0x023e  */
            /* JADX WARN: Code duplicated, block: B:92:0x0241  */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                String str;
                String strC;
                long jM121getTransparent0d7_KjU;
                boolean z;
                hyl fylVar;
                char c;
                long backgroundContent;
                a4x a4xVarO0;
                wx8 wx8Var2;
                Iterator it;
                int i;
                int i2;
                char c2;
                dzh dzhVar;
                String strA;
                Integer numValueOf;
                Integer num;
                long jM98getGreen0d7_KjU;
                byte b6 = b5;
                by8 by8Var = this.b;
                int i3 = 0;
                switch (b6) {
                    case 0:
                        n0o0 n0o0Var = by8Var.c;
                        ctf0 ctf0Var2 = by8Var.b;
                        if (!((Boolean) obj).booleanValue()) {
                            return new uu8(ctf0Var2.b.a(R.string.button_login, Arrays.copyOf(new Object[0], 0)), ctf0Var2.b.a(R.string.registration, Arrays.copyOf(new Object[0], 0)));
                        }
                        ql5 ql5Var = (ql5) ((fee) by8Var.i.getValue()).c();
                        if (ql5Var != null) {
                            String strA2 = ql5Var.j;
                            if (((kg) ((fee) n0o0Var.getValue()).c()) == kg.SECONDARY) {
                                strA2 = ctf0Var2.b.a(R.string.all_balances, Arrays.copyOf(new Object[0], 0));
                            } else if (strA2.length() <= 0) {
                                strA2 = ql5Var.k;
                            }
                            str = strA2;
                        } else {
                            str = "";
                        }
                        if (ql5Var != null) {
                            double d = ql5Var.b;
                            pn40 pn40Var = pn40.f27267a;
                            strC = pn40.c(d, p3u0.c);
                        } else {
                            strC = null;
                        }
                        String str2 = strC == null ? "" : strC;
                        String str3 = ql5Var != null ? ql5Var.f : null;
                        String str4 = str3 == null ? "" : str3;
                        String strA3 = ctf0Var2.b.a(R.string.top_up, Arrays.copyOf(new Object[0], 0));
                        if (((ix8) by8Var.B) == ix8.f15529a) {
                            pz40 pz40Var = s6t0.f31722a;
                            jM121getTransparent0d7_KjU = s6t0.b().f33626a.getBackgroundContent();
                        } else {
                            pz40 pz40Var2 = s6t0.f31722a;
                            jM121getTransparent0d7_KjU = StaticColors.INSTANCE.m121getTransparent0d7_KjU();
                        }
                        return new tu8((ijl) ((fee) n0o0Var.getValue()).b(), new jjl(str2, str4, strA3, str, new y3d(jM121getTransparent0d7_KjU)));
                    case 1:
                        vx8 vx8Var = (vx8) obj;
                        vx8Var.getClass();
                        if (vx8Var.f38188a) {
                            fylVar = new gyl(null, null, 3);
                            z = true;
                        } else {
                            List<gw80> list = vx8Var.b;
                            ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                            for (gw80 gw80Var : list) {
                                long j2 = vx8Var.c;
                                String str5 = gw80Var.b;
                                long j3 = gw80Var.f12015a;
                                StringBuilder sb = new StringBuilder(ujn.h);
                                String strH = axq.h(j3, "/static/img/android/casino/brands/1xlive/icons/", ".webp");
                                if (strH.length() == 0) {
                                    sb.setLength(0);
                                } else {
                                    int i4 = 0;
                                    if (StringsKt.O(strH, ujn.h, false)) {
                                        sb.setLength(i4);
                                        sb.append(strH);
                                    } else if (kotlin.text.c.x(strH, "https://", false)) {
                                        i4 = 0;
                                        sb.setLength(i4);
                                        sb.append(strH);
                                    } else {
                                        if (sb.length() <= 0 || StringsKt.S(sb, Separators.SLASH)) {
                                            c = '/';
                                        } else {
                                            c = '/';
                                            sb.append('/');
                                        }
                                        sb.append(StringsKt.y0(strH, c));
                                    }
                                }
                                arrayList.add(by8.a(gw80Var, j2, new zxl(12, new n0x(sb.toString()), str5)));
                            }
                            z = true;
                            fylVar = new fyl(dyb.o0(arrayList), null, null, null, null, 30);
                        }
                        if (!(fylVar instanceof fyl)) {
                            if (fylVar instanceof gyl) {
                                return new op0((gyl) fylVar);
                            }
                            t9f.b();
                            return null;
                        }
                        fyl fylVar2 = (fyl) fylVar;
                        boolean zBooleanValue = ((Boolean) ((fee) by8Var.m.getValue()).c()).booleanValue();
                        String strA4 = by8Var.b.b.a(R.string.bet_filter, Arrays.copyOf(new Object[0], 0));
                        boolean z2 = (((Collection) ((fee) by8Var.n.getValue()).c()).isEmpty() && ((fee) by8Var.o.getValue()).c() == null) ? false : z;
                        if (((Boolean) ((fee) by8Var.p.getValue()).c()).booleanValue()) {
                            pz40 pz40Var3 = s6t0.f31722a;
                            backgroundContent = s6t0.b().f33626a.getBackground();
                        } else {
                            pz40 pz40Var4 = s6t0.f31722a;
                            backgroundContent = s6t0.b().f33626a.getBackgroundContent();
                        }
                        return new np0(fylVar2, zBooleanValue, strA4, z2, backgroundContent, 48);
                    case 2:
                        wx8 wx8Var3 = (wx8) obj;
                        wx8Var3.getClass();
                        boolean z3 = wx8Var3.b;
                        n0o0 n0o0Var2 = by8Var.d;
                        xll xllVar = xll.f41078a;
                        if (z3) {
                            return new aml((pt0) ((fee) n0o0Var2.getValue()).b(), xllVar, true);
                        }
                        pt0 pt0Var = (pt0) ((fee) n0o0Var2.getValue()).b();
                        List<mlr> list2 = wx8Var3.c;
                        ArrayList arrayList2 = new ArrayList(r3d.q(list2, 10));
                        for (mlr mlrVar : list2) {
                            arrayList2.add(ccq0.Z(mlrVar, by8Var.b, ((Boolean) ((fee) by8Var.h.getValue()).c()).booleanValue(), ((Boolean) ((fee) by8Var.f.getValue()).c()).booleanValue(), wx8Var3.d.contains(Long.valueOf(mlrVar.f22006a)), (pt0) ((fee) n0o0Var2.getValue()).b(), null));
                        }
                        return new zll(pt0Var, xllVar, arrayList2);
                    case 3:
                        wx8 wx8Var4 = (wx8) obj;
                        wx8Var4.getClass();
                        boolean z4 = wx8Var4.f39919a;
                        boolean z5 = wx8Var4.b;
                        List list3 = wx8Var4.c;
                        if (z4) {
                            return new fe70((mdm) ((fee) by8Var.s.getValue()).b());
                        }
                        if (list3.isEmpty() && !z5) {
                            return new ee70((mdm) ((fee) by8Var.r.getValue()).b());
                        }
                        if (z5) {
                            int i5 = (((Boolean) ((fee) by8Var.g.getValue()).c()).booleanValue() ? 4 : 3) * 4;
                            ArrayList arrayList3 = new ArrayList(i5);
                            while (i3 < i5) {
                                arrayList3.add(fzh.f10407a);
                                i3++;
                            }
                            a4xVarO0 = dyb.o0(arrayList3);
                        } else {
                            ArrayList arrayList4 = new ArrayList(r3d.q(list3, 10));
                            Iterator it2 = list3.iterator();
                            while (it2.hasNext()) {
                                mlr mlrVar2 = (mlr) it2.next();
                                ctf0 ctf0Var3 = by8Var.b;
                                boolean zBooleanValue2 = ((Boolean) ((fee) by8Var.h.getValue()).c()).booleanValue();
                                boolean zContains = wx8Var4.d.contains(Long.valueOf(mlrVar2.f22006a));
                                ctf0Var3.getClass();
                                int i6 = zBooleanValue2 ? zContains ? R.drawable.ic_favorites_slots_checked : R.drawable.ic_favorites_slots_unchecked : i3;
                                long j4 = mlrVar2.f22006a;
                                boolean z6 = mlrVar2.k;
                                String str6 = mlrVar2.e;
                                StringBuilder sb2 = new StringBuilder(ujn.h);
                                String str7 = mlrVar2.h;
                                str7.getClass();
                                if (str7.length() == 0) {
                                    wx8Var2 = wx8Var4;
                                    sb2.setLength(0);
                                    it = it2;
                                } else {
                                    wx8Var2 = wx8Var4;
                                    it = it2;
                                    if (StringsKt.O(str7, ujn.h, false)) {
                                        i = 0;
                                    } else if (kotlin.text.c.x(str7, "https://", false)) {
                                        i = 0;
                                    } else {
                                        if (sb2.length() <= 0 || StringsKt.S(sb2, Separators.SLASH)) {
                                            i2 = 1;
                                            c2 = '/';
                                        } else {
                                            sb2.append('/');
                                            c2 = '/';
                                            i2 = 1;
                                        }
                                        char[] cArr = new char[i2];
                                        cArr[0] = c2;
                                        sb2.append(StringsKt.y0(str7, cArr));
                                    }
                                    sb2.setLength(i);
                                    sb2.append(str7);
                                }
                                n0x n0xVar = new n0x(sb2.toString());
                                m0x m0xVar = new m0x(R.drawable.ic_aggregator_placeholder_vertical, null, 6);
                                if (z6) {
                                    strA = ctf0Var3.b.a(R.string.casino_promo_game_label, Arrays.copyOf(new Object[0], 0));
                                } else {
                                    if (mlrVar2.j) {
                                        strA = ctf0Var3.b.a(R.string.casino_new_game_label, Arrays.copyOf(new Object[0], 0));
                                    } else {
                                        dzhVar = null;
                                    }
                                    numValueOf = Integer.valueOf(i6);
                                    if (i6 > 0) {
                                        num = numValueOf;
                                    } else {
                                        num = null;
                                    }
                                    arrayList4.add(new ezh(j4, str6, n0xVar, m0xVar, true, dzhVar, num));
                                    wx8Var4 = wx8Var2;
                                    it2 = it;
                                    i3 = 0;
                                }
                                String str8 = strA;
                                StaticColors staticColors = StaticColors.INSTANCE;
                                long jM123getWhite0d7_KjU = staticColors.m123getWhite0d7_KjU();
                                if (z6) {
                                    pz40 pz40Var5 = s6t0.f31722a;
                                    jM98getGreen0d7_KjU = staticColors.m113getRed0d7_KjU();
                                } else {
                                    pz40 pz40Var6 = s6t0.f31722a;
                                    jM98getGreen0d7_KjU = staticColors.m98getGreen0d7_KjU();
                                }
                                dzhVar = new dzh(jM123getWhite0d7_KjU, jM98getGreen0d7_KjU, str8);
                                numValueOf = Integer.valueOf(i6);
                                if (i6 > 0) {
                                    num = numValueOf;
                                } else {
                                    num = null;
                                }
                                arrayList4.add(new ezh(j4, str6, n0xVar, m0xVar, true, dzhVar, num));
                                wx8Var4 = wx8Var2;
                                it2 = it;
                                i3 = 0;
                            }
                            a4xVarO0 = dyb.o0(arrayList4);
                        }
                        return new de70(a4xVarO0);
                    case 4:
                        wx8 wx8Var5 = (wx8) obj;
                        wx8Var5.getClass();
                        if (wx8Var5.f39919a) {
                            return new zu8((mdm) ((fee) by8Var.s.getValue()).b());
                        }
                        return (!wx8Var5.c.isEmpty() || wx8Var5.b) ? new xu8((bml) ((fee) by8Var.y.getValue()).b()) : new yu8((mdm) ((fee) by8Var.r.getValue()).b());
                    default:
                        String str9 = (String) obj;
                        str9.getClass();
                        if (((ix8) by8Var.B) == ix8.c) {
                            str9 = "/static/img/android/casino/brands/1xlive/head/1xLive_img.webp";
                        }
                        StringBuilder sb3 = new StringBuilder(ujn.h);
                        if (str9.length() == 0) {
                            sb3.setLength(0);
                        } else if (StringsKt.O(str9, ujn.h, false) || kotlin.text.c.x(str9, "https://", false)) {
                            sb3.setLength(0);
                            sb3.append(str9);
                        } else {
                            if (sb3.length() > 0 && !StringsKt.S(sb3, Separators.SLASH)) {
                                sb3.append('/');
                            }
                            sb3.append(StringsKt.y0(str9, '/'));
                        }
                        return sb3.toString();
                }
            }
        }, (byte) 20));
        final byte b6 = 4;
        this.A = bkb.G(((fee) n0o0VarH3.getValue()).d, new Function1(this) { // from class: a.zx8
            public final /* synthetic */ by8 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:91:0x023e  */
            /* JADX WARN: Code duplicated, block: B:92:0x0241  */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                String str;
                String strC;
                long jM121getTransparent0d7_KjU;
                boolean z;
                hyl fylVar;
                char c;
                long backgroundContent;
                a4x a4xVarO0;
                wx8 wx8Var2;
                Iterator it;
                int i;
                int i2;
                char c2;
                dzh dzhVar;
                String strA;
                Integer numValueOf;
                Integer num;
                long jM98getGreen0d7_KjU;
                byte b7 = b6;
                by8 by8Var = this.b;
                int i3 = 0;
                switch (b7) {
                    case 0:
                        n0o0 n0o0Var = by8Var.c;
                        ctf0 ctf0Var2 = by8Var.b;
                        if (!((Boolean) obj).booleanValue()) {
                            return new uu8(ctf0Var2.b.a(R.string.button_login, Arrays.copyOf(new Object[0], 0)), ctf0Var2.b.a(R.string.registration, Arrays.copyOf(new Object[0], 0)));
                        }
                        ql5 ql5Var = (ql5) ((fee) by8Var.i.getValue()).c();
                        if (ql5Var != null) {
                            String strA2 = ql5Var.j;
                            if (((kg) ((fee) n0o0Var.getValue()).c()) == kg.SECONDARY) {
                                strA2 = ctf0Var2.b.a(R.string.all_balances, Arrays.copyOf(new Object[0], 0));
                            } else if (strA2.length() <= 0) {
                                strA2 = ql5Var.k;
                            }
                            str = strA2;
                        } else {
                            str = "";
                        }
                        if (ql5Var != null) {
                            double d = ql5Var.b;
                            pn40 pn40Var = pn40.f27267a;
                            strC = pn40.c(d, p3u0.c);
                        } else {
                            strC = null;
                        }
                        String str2 = strC == null ? "" : strC;
                        String str3 = ql5Var != null ? ql5Var.f : null;
                        String str4 = str3 == null ? "" : str3;
                        String strA3 = ctf0Var2.b.a(R.string.top_up, Arrays.copyOf(new Object[0], 0));
                        if (((ix8) by8Var.B) == ix8.f15529a) {
                            pz40 pz40Var = s6t0.f31722a;
                            jM121getTransparent0d7_KjU = s6t0.b().f33626a.getBackgroundContent();
                        } else {
                            pz40 pz40Var2 = s6t0.f31722a;
                            jM121getTransparent0d7_KjU = StaticColors.INSTANCE.m121getTransparent0d7_KjU();
                        }
                        return new tu8((ijl) ((fee) n0o0Var.getValue()).b(), new jjl(str2, str4, strA3, str, new y3d(jM121getTransparent0d7_KjU)));
                    case 1:
                        vx8 vx8Var = (vx8) obj;
                        vx8Var.getClass();
                        if (vx8Var.f38188a) {
                            fylVar = new gyl(null, null, 3);
                            z = true;
                        } else {
                            List<gw80> list = vx8Var.b;
                            ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                            for (gw80 gw80Var : list) {
                                long j2 = vx8Var.c;
                                String str5 = gw80Var.b;
                                long j3 = gw80Var.f12015a;
                                StringBuilder sb = new StringBuilder(ujn.h);
                                String strH = axq.h(j3, "/static/img/android/casino/brands/1xlive/icons/", ".webp");
                                if (strH.length() == 0) {
                                    sb.setLength(0);
                                } else {
                                    int i4 = 0;
                                    if (StringsKt.O(strH, ujn.h, false)) {
                                        sb.setLength(i4);
                                        sb.append(strH);
                                    } else if (kotlin.text.c.x(strH, "https://", false)) {
                                        i4 = 0;
                                        sb.setLength(i4);
                                        sb.append(strH);
                                    } else {
                                        if (sb.length() <= 0 || StringsKt.S(sb, Separators.SLASH)) {
                                            c = '/';
                                        } else {
                                            c = '/';
                                            sb.append('/');
                                        }
                                        sb.append(StringsKt.y0(strH, c));
                                    }
                                }
                                arrayList.add(by8.a(gw80Var, j2, new zxl(12, new n0x(sb.toString()), str5)));
                            }
                            z = true;
                            fylVar = new fyl(dyb.o0(arrayList), null, null, null, null, 30);
                        }
                        if (!(fylVar instanceof fyl)) {
                            if (fylVar instanceof gyl) {
                                return new op0((gyl) fylVar);
                            }
                            t9f.b();
                            return null;
                        }
                        fyl fylVar2 = (fyl) fylVar;
                        boolean zBooleanValue = ((Boolean) ((fee) by8Var.m.getValue()).c()).booleanValue();
                        String strA4 = by8Var.b.b.a(R.string.bet_filter, Arrays.copyOf(new Object[0], 0));
                        boolean z2 = (((Collection) ((fee) by8Var.n.getValue()).c()).isEmpty() && ((fee) by8Var.o.getValue()).c() == null) ? false : z;
                        if (((Boolean) ((fee) by8Var.p.getValue()).c()).booleanValue()) {
                            pz40 pz40Var3 = s6t0.f31722a;
                            backgroundContent = s6t0.b().f33626a.getBackground();
                        } else {
                            pz40 pz40Var4 = s6t0.f31722a;
                            backgroundContent = s6t0.b().f33626a.getBackgroundContent();
                        }
                        return new np0(fylVar2, zBooleanValue, strA4, z2, backgroundContent, 48);
                    case 2:
                        wx8 wx8Var3 = (wx8) obj;
                        wx8Var3.getClass();
                        boolean z3 = wx8Var3.b;
                        n0o0 n0o0Var2 = by8Var.d;
                        xll xllVar = xll.f41078a;
                        if (z3) {
                            return new aml((pt0) ((fee) n0o0Var2.getValue()).b(), xllVar, true);
                        }
                        pt0 pt0Var = (pt0) ((fee) n0o0Var2.getValue()).b();
                        List<mlr> list2 = wx8Var3.c;
                        ArrayList arrayList2 = new ArrayList(r3d.q(list2, 10));
                        for (mlr mlrVar : list2) {
                            arrayList2.add(ccq0.Z(mlrVar, by8Var.b, ((Boolean) ((fee) by8Var.h.getValue()).c()).booleanValue(), ((Boolean) ((fee) by8Var.f.getValue()).c()).booleanValue(), wx8Var3.d.contains(Long.valueOf(mlrVar.f22006a)), (pt0) ((fee) n0o0Var2.getValue()).b(), null));
                        }
                        return new zll(pt0Var, xllVar, arrayList2);
                    case 3:
                        wx8 wx8Var4 = (wx8) obj;
                        wx8Var4.getClass();
                        boolean z4 = wx8Var4.f39919a;
                        boolean z5 = wx8Var4.b;
                        List list3 = wx8Var4.c;
                        if (z4) {
                            return new fe70((mdm) ((fee) by8Var.s.getValue()).b());
                        }
                        if (list3.isEmpty() && !z5) {
                            return new ee70((mdm) ((fee) by8Var.r.getValue()).b());
                        }
                        if (z5) {
                            int i5 = (((Boolean) ((fee) by8Var.g.getValue()).c()).booleanValue() ? 4 : 3) * 4;
                            ArrayList arrayList3 = new ArrayList(i5);
                            while (i3 < i5) {
                                arrayList3.add(fzh.f10407a);
                                i3++;
                            }
                            a4xVarO0 = dyb.o0(arrayList3);
                        } else {
                            ArrayList arrayList4 = new ArrayList(r3d.q(list3, 10));
                            Iterator it2 = list3.iterator();
                            while (it2.hasNext()) {
                                mlr mlrVar2 = (mlr) it2.next();
                                ctf0 ctf0Var3 = by8Var.b;
                                boolean zBooleanValue2 = ((Boolean) ((fee) by8Var.h.getValue()).c()).booleanValue();
                                boolean zContains = wx8Var4.d.contains(Long.valueOf(mlrVar2.f22006a));
                                ctf0Var3.getClass();
                                int i6 = zBooleanValue2 ? zContains ? R.drawable.ic_favorites_slots_checked : R.drawable.ic_favorites_slots_unchecked : i3;
                                long j4 = mlrVar2.f22006a;
                                boolean z6 = mlrVar2.k;
                                String str6 = mlrVar2.e;
                                StringBuilder sb2 = new StringBuilder(ujn.h);
                                String str7 = mlrVar2.h;
                                str7.getClass();
                                if (str7.length() == 0) {
                                    wx8Var2 = wx8Var4;
                                    sb2.setLength(0);
                                    it = it2;
                                } else {
                                    wx8Var2 = wx8Var4;
                                    it = it2;
                                    if (StringsKt.O(str7, ujn.h, false)) {
                                        i = 0;
                                    } else if (kotlin.text.c.x(str7, "https://", false)) {
                                        i = 0;
                                    } else {
                                        if (sb2.length() <= 0 || StringsKt.S(sb2, Separators.SLASH)) {
                                            i2 = 1;
                                            c2 = '/';
                                        } else {
                                            sb2.append('/');
                                            c2 = '/';
                                            i2 = 1;
                                        }
                                        char[] cArr = new char[i2];
                                        cArr[0] = c2;
                                        sb2.append(StringsKt.y0(str7, cArr));
                                    }
                                    sb2.setLength(i);
                                    sb2.append(str7);
                                }
                                n0x n0xVar = new n0x(sb2.toString());
                                m0x m0xVar = new m0x(R.drawable.ic_aggregator_placeholder_vertical, null, 6);
                                if (z6) {
                                    strA = ctf0Var3.b.a(R.string.casino_promo_game_label, Arrays.copyOf(new Object[0], 0));
                                } else {
                                    if (mlrVar2.j) {
                                        strA = ctf0Var3.b.a(R.string.casino_new_game_label, Arrays.copyOf(new Object[0], 0));
                                    } else {
                                        dzhVar = null;
                                    }
                                    numValueOf = Integer.valueOf(i6);
                                    if (i6 > 0) {
                                        num = numValueOf;
                                    } else {
                                        num = null;
                                    }
                                    arrayList4.add(new ezh(j4, str6, n0xVar, m0xVar, true, dzhVar, num));
                                    wx8Var4 = wx8Var2;
                                    it2 = it;
                                    i3 = 0;
                                }
                                String str8 = strA;
                                StaticColors staticColors = StaticColors.INSTANCE;
                                long jM123getWhite0d7_KjU = staticColors.m123getWhite0d7_KjU();
                                if (z6) {
                                    pz40 pz40Var5 = s6t0.f31722a;
                                    jM98getGreen0d7_KjU = staticColors.m113getRed0d7_KjU();
                                } else {
                                    pz40 pz40Var6 = s6t0.f31722a;
                                    jM98getGreen0d7_KjU = staticColors.m98getGreen0d7_KjU();
                                }
                                dzhVar = new dzh(jM123getWhite0d7_KjU, jM98getGreen0d7_KjU, str8);
                                numValueOf = Integer.valueOf(i6);
                                if (i6 > 0) {
                                    num = numValueOf;
                                } else {
                                    num = null;
                                }
                                arrayList4.add(new ezh(j4, str6, n0xVar, m0xVar, true, dzhVar, num));
                                wx8Var4 = wx8Var2;
                                it2 = it;
                                i3 = 0;
                            }
                            a4xVarO0 = dyb.o0(arrayList4);
                        }
                        return new de70(a4xVarO0);
                    case 4:
                        wx8 wx8Var5 = (wx8) obj;
                        wx8Var5.getClass();
                        if (wx8Var5.f39919a) {
                            return new zu8((mdm) ((fee) by8Var.s.getValue()).b());
                        }
                        return (!wx8Var5.c.isEmpty() || wx8Var5.b) ? new xu8((bml) ((fee) by8Var.y.getValue()).b()) : new yu8((mdm) ((fee) by8Var.r.getValue()).b());
                    default:
                        String str9 = (String) obj;
                        str9.getClass();
                        if (((ix8) by8Var.B) == ix8.c) {
                            str9 = "/static/img/android/casino/brands/1xlive/head/1xLive_img.webp";
                        }
                        StringBuilder sb3 = new StringBuilder(ujn.h);
                        if (str9.length() == 0) {
                            sb3.setLength(0);
                        } else if (StringsKt.O(str9, ujn.h, false) || kotlin.text.c.x(str9, "https://", false)) {
                            sb3.setLength(0);
                            sb3.append(str9);
                        } else {
                            if (sb3.length() > 0 && !StringsKt.S(sb3, Separators.SLASH)) {
                                sb3.append('/');
                            }
                            sb3.append(StringsKt.y0(str9, '/'));
                        }
                        return sb3.toString();
                }
            }
        });
    }

    public static lxl a(gw80 gw80Var, long j, dyl dylVar) {
        return new lxl(gw80Var.f12015a, dylVar, false, gw80Var.f12015a == j ? uxl.b : uxl.f36445a, (cwl) null, 104);
    }

    @Override // a.v6t0
    public final Object invoke(Object obj) {
        byte b = this.f3404a;
        n0o0 n0o0Var = this.A;
        n0o0 n0o0Var2 = this.z;
        n0o0 n0o0Var3 = this.x;
        n0o0 n0o0Var4 = this.q;
        n0o0 n0o0Var5 = this.p;
        n0o0 n0o0Var6 = this.n;
        n0o0 n0o0Var7 = this.m;
        n0o0 n0o0Var8 = this.k;
        n0o0 n0o0Var9 = this.j;
        n0o0 n0o0Var10 = this.i;
        n0o0 n0o0Var11 = this.h;
        n0o0 n0o0Var12 = this.g;
        n0o0 n0o0Var13 = this.f;
        n0o0 n0o0Var14 = this.e;
        n0o0 n0o0Var15 = this.d;
        n0o0 n0o0Var16 = this.l;
        n0o0 n0o0Var17 = this.c;
        switch (b) {
            case 0:
                yx8 yx8Var = (yx8) obj;
                yx8Var.getClass();
                fee feeVar = (fee) n0o0Var17.getValue();
                kg kgVar = yx8Var.f;
                wx8 wx8Var = yx8Var.f43408a;
                xx8 xx8Var = yx8Var.c;
                feeVar.d(kgVar);
                ((fee) n0o0Var15.getValue()).d(yx8Var.g);
                ((fee) n0o0Var4.getValue()).d(yx8Var.j);
                ((fee) n0o0Var14.getValue()).d(Integer.valueOf(yx8Var.i));
                ((fee) n0o0Var13.getValue()).d(Boolean.valueOf(yx8Var.h));
                ((fee) n0o0Var12.getValue()).d(Boolean.valueOf(yx8Var.t));
                ((fee) n0o0Var11.getValue()).d(Boolean.valueOf(yx8Var.d));
                ((fee) n0o0Var10.getValue()).d(yx8Var.e);
                ix8 ix8Var = (ix8) this.B;
                if (ix8Var == ix8.c) {
                    ((fee) n0o0Var2.getValue()).d(wx8Var);
                } else {
                    ((fee) n0o0Var9.getValue()).d(wx8Var);
                }
                ((fee) n0o0Var8.getValue()).d(yx8Var.b);
                ((fee) n0o0Var16.getValue()).d(Boolean.valueOf(yx8Var.m));
                ((fee) n0o0Var7.getValue()).d(Boolean.valueOf(yx8Var.r));
                ((fee) n0o0Var6.getValue()).d(yx8Var.q);
                ((fee) this.o.getValue()).d(yx8Var.o);
                ((fee) n0o0Var5.getValue()).d(Boolean.valueOf(yx8Var.s));
                n0o0 n0o0Var18 = this.t;
                ((fee) n0o0Var18.getValue()).d(xx8Var);
                n0o0 n0o0Var19 = this.u;
                ((fee) n0o0Var19.getValue()).d(xx8Var.f41644a);
                int iOrdinal = ix8Var.ordinal();
                n0o0 n0o0Var20 = this.w;
                n0o0 n0o0Var21 = this.v;
                if (iOrdinal == 0) {
                    String str = xx8Var.f41644a;
                    imm immVar = (imm) ((fee) n0o0Var18.getValue()).b();
                    vu8 vu8Var = (vu8) ((fee) n0o0Var21.getValue()).b();
                    hyl hylVar = (hyl) ((fee) n0o0Var20.getValue()).b();
                    return new ey8(str, (String) ((fee) n0o0Var4.getValue()).b(), immVar, vu8Var, (av8) ((fee) n0o0Var.getValue()).b(), hylVar);
                }
                if (iOrdinal == 1) {
                    String str2 = xx8Var.f41644a;
                    imm immVar2 = (imm) ((fee) n0o0Var18.getValue()).b();
                    imm immVar3 = (imm) ((fee) n0o0Var19.getValue()).b();
                    vu8 vu8Var2 = (vu8) ((fee) n0o0Var21.getValue()).b();
                    hyl hylVar2 = (hyl) ((fee) n0o0Var20.getValue()).b();
                    return new dy8(str2, (String) ((fee) n0o0Var4.getValue()).b(), immVar2, vu8Var2, (av8) ((fee) n0o0Var.getValue()).b(), immVar3, hylVar2);
                }
                if (iOrdinal != 2) {
                    t9f.b();
                    return null;
                }
                m0x m0xVar = new m0x(R.drawable.logo_1xlive, null, 6);
                imm immVar4 = (imm) ((fee) n0o0Var18.getValue()).b();
                imm immVar5 = (imm) ((fee) n0o0Var19.getValue()).b();
                return new cy8(m0xVar, (String) ((fee) n0o0Var4.getValue()).b(), immVar4, (vu8) ((fee) n0o0Var21.getValue()).b(), (ge70) ((fee) n0o0Var2.getValue()).b(), immVar5, (pp0) ((fee) n0o0Var3.getValue()).b());
            default:
                s5t0 s5t0Var = (s5t0) obj;
                s5t0Var.getClass();
                ((fee) n0o0Var17.getValue()).d(s5t0Var.b);
                fee feeVar2 = (fee) n0o0Var16.getValue();
                ypl0 ypl0Var = s5t0Var.j;
                feeVar2.d(ypl0Var);
                ((fee) n0o0Var15.getValue()).d(s5t0Var.c);
                ((fee) n0o0Var14.getValue()).d(s5t0Var.d);
                ((fee) n0o0Var13.getValue()).d(s5t0Var.f);
                ((fee) n0o0Var12.getValue()).d(s5t0Var.e);
                ((fee) n0o0Var11.getValue()).d(s5t0Var.g);
                ((fee) n0o0Var10.getValue()).d(ypl0Var);
                ((fee) n0o0Var9.getValue()).d(s5t0Var.k);
                ((fee) n0o0Var8.getValue()).d(Boolean.valueOf(s5t0Var.l));
                ((fee) n0o0Var7.getValue()).d(s5t0Var.h);
                ((fee) n0o0Var6.getValue()).d(Long.valueOf(s5t0Var.m));
                ((fee) n0o0Var5.getValue()).d(Long.valueOf(s5t0Var.o));
                ((fee) n0o0Var4.getValue()).d(Long.valueOf(s5t0Var.p));
                ((fee) this.r.getValue()).d(Long.valueOf(s5t0Var.q));
                return new u5t0(((fee) n0o0Var3.getValue()).e, ((fee) this.y.getValue()).e, ((fee) n0o0Var2.getValue()).e, ((fee) n0o0Var.getValue()).e);
        }
    }

    public by8(s5t0 s5t0Var, ctf0 ctf0Var, g2v g2vVar) {
        final byte b = 1;
        ctf0Var.getClass();
        this.b = ctf0Var;
        this.B = g2vVar;
        n0o0 n0o0VarH = bkb.H(s5t0Var.b);
        this.c = n0o0VarH;
        this.d = bkb.H(s5t0Var.c);
        n0o0 n0o0VarH2 = bkb.H(s5t0Var.d);
        this.e = n0o0VarH2;
        n0o0 n0o0VarH3 = bkb.H(s5t0Var.f);
        this.f = n0o0VarH3;
        n0o0 n0o0VarH4 = bkb.H(s5t0Var.e);
        this.g = n0o0VarH4;
        this.h = bkb.H(s5t0Var.g);
        ypl0 ypl0Var = s5t0Var.j;
        this.i = bkb.H(ypl0Var);
        n0o0 n0o0VarH5 = bkb.H(s5t0Var.k);
        this.j = n0o0VarH5;
        this.k = bkb.H(Boolean.valueOf(s5t0Var.l));
        this.l = bkb.H(ypl0Var);
        this.m = bkb.H(s5t0Var.h);
        this.n = bkb.H(Long.valueOf(s5t0Var.m));
        this.o = bkb.H(Boolean.valueOf(s5t0Var.n));
        this.p = bkb.H(Long.valueOf(s5t0Var.o));
        this.q = bkb.H(Long.valueOf(s5t0Var.p));
        this.r = bkb.H(Long.valueOf(s5t0Var.q));
        final byte b2 = 0;
        this.s = maz.b(new yw9((fee) n0o0VarH.getValue(), new Function1(this) { // from class: a.v5t0
            public final /* synthetic */ by8 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:116:0x02c7  */
            /* JADX WARN: Code duplicated, block: B:146:0x0347  */
            /* JADX WARN: Code duplicated, block: B:194:0x0527  */
            /* JADX WARN: Code duplicated, block: B:213:0x058a  */
            /* JADX WARN: Code duplicated, block: B:303:0x085f  */
            /* JADX WARN: Code duplicated, block: B:320:0x0897  */
            /* JADX WARN: Code duplicated, block: B:344:0x0985  */
            /* JADX WARN: Code duplicated, block: B:419:0x0356 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:420:? A[LOOP:5: B:144:0x0341->B:420:?, LOOP_END, SYNTHETIC] */
            /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v46 java.lang.Object, still in use, count: 2, list:
                  (r3v46 java.lang.Object) from 0x0893: PHI (r3 I:??) = (r3v43 java.lang.Object), (r3v46 java.lang.Object) binds: [B:317:0x0892, B:457:0x0893] A[DONT_GENERATE, DONT_INLINE]
                  (r3v46 java.lang.Object) from 0x0889: CHECK_CAST (a.iup) (r3v46 java.lang.Object)
                	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
                	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
                	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
                	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
                	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
                	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
                	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
                */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object r40) {
                /*
                    Method dump skipped, instruction units count: 2806
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: a.v5t0.invoke(java.lang.Object):java.lang.Object");
            }
        }, (byte) 20));
        this.t = maz.b(new yw9((fee) n0o0VarH2.getValue(), new Function1(this) { // from class: a.v5t0
            public final /* synthetic */ by8 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:116:0x02c7  */
            /* JADX WARN: Code duplicated, block: B:146:0x0347  */
            /* JADX WARN: Code duplicated, block: B:194:0x0527  */
            /* JADX WARN: Code duplicated, block: B:213:0x058a  */
            /* JADX WARN: Code duplicated, block: B:303:0x085f  */
            /* JADX WARN: Code duplicated, block: B:320:0x0897  */
            /* JADX WARN: Code duplicated, block: B:344:0x0985  */
            /* JADX WARN: Code duplicated, block: B:419:0x0356 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:420:? A[LOOP:5: B:144:0x0341->B:420:?, LOOP_END, SYNTHETIC] */
            /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v46 java.lang.Object, still in use, count: 2, list:
                  (r3v46 java.lang.Object) from 0x0893: PHI (r3 I:??) = (r3v43 java.lang.Object), (r3v46 java.lang.Object) binds: [B:317:0x0892, B:457:0x0893] A[DONT_GENERATE, DONT_INLINE]
                  (r3v46 java.lang.Object) from 0x0889: CHECK_CAST (a.iup) (r3v46 java.lang.Object)
                	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
                	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
                	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
                	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
                	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
                	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
                */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object r40) {
                /*
                    Method dump skipped, instruction units count: 2806
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: a.v5t0.invoke(java.lang.Object):java.lang.Object");
            }
        }, (byte) 20));
        final byte b3 = 2;
        this.u = maz.b(new yw9((fee) n0o0VarH2.getValue(), new Function1(this) { // from class: a.v5t0
            public final /* synthetic */ by8 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:116:0x02c7  */
            /* JADX WARN: Code duplicated, block: B:146:0x0347  */
            /* JADX WARN: Code duplicated, block: B:194:0x0527  */
            /* JADX WARN: Code duplicated, block: B:213:0x058a  */
            /* JADX WARN: Code duplicated, block: B:303:0x085f  */
            /* JADX WARN: Code duplicated, block: B:320:0x0897  */
            /* JADX WARN: Code duplicated, block: B:344:0x0985  */
            /* JADX WARN: Code duplicated, block: B:419:0x0356 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:420:? A[LOOP:5: B:144:0x0341->B:420:?, LOOP_END, SYNTHETIC] */
            /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v46 java.lang.Object, still in use, count: 2, list:
                  (r3v46 java.lang.Object) from 0x0893: PHI (r3 I:??) = (r3v43 java.lang.Object), (r3v46 java.lang.Object) binds: [B:317:0x0892, B:457:0x0893] A[DONT_GENERATE, DONT_INLINE]
                  (r3v46 java.lang.Object) from 0x0889: CHECK_CAST (a.iup) (r3v46 java.lang.Object)
                	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
                	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
                	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
                	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
                	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
                */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object r40) {
                /*
                    Method dump skipped, instruction units count: 2806
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: a.v5t0.invoke(java.lang.Object):java.lang.Object");
            }
        }, (byte) 20));
        fee feeVar = (fee) n0o0VarH3.getValue();
        final byte b4 = 3;
        this.v = maz.b(new yw9(feeVar, new Function1(this) { // from class: a.v5t0
            public final /* synthetic */ by8 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:116:0x02c7  */
            /* JADX WARN: Code duplicated, block: B:146:0x0347  */
            /* JADX WARN: Code duplicated, block: B:194:0x0527  */
            /* JADX WARN: Code duplicated, block: B:213:0x058a  */
            /* JADX WARN: Code duplicated, block: B:303:0x085f  */
            /* JADX WARN: Code duplicated, block: B:320:0x0897  */
            /* JADX WARN: Code duplicated, block: B:344:0x0985  */
            /* JADX WARN: Code duplicated, block: B:419:0x0356 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:420:? A[LOOP:5: B:144:0x0341->B:420:?, LOOP_END, SYNTHETIC] */
            /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v46 java.lang.Object, still in use, count: 2, list:
                  (r3v46 java.lang.Object) from 0x0893: PHI (r3 I:??) = (r3v43 java.lang.Object), (r3v46 java.lang.Object) binds: [B:317:0x0892, B:457:0x0893] A[DONT_GENERATE, DONT_INLINE]
                  (r3v46 java.lang.Object) from 0x0889: CHECK_CAST (a.iup) (r3v46 java.lang.Object)
                	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
                	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
                	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
                	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
                */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object r40) {
                /*
                    Method dump skipped, instruction units count: 2806
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: a.v5t0.invoke(java.lang.Object):java.lang.Object");
            }
        }, (byte) 20));
        final byte b5 = 4;
        this.w = maz.b(new yw9((fee) n0o0VarH4.getValue(), new Function1(this) { // from class: a.v5t0
            public final /* synthetic */ by8 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:116:0x02c7  */
            /* JADX WARN: Code duplicated, block: B:146:0x0347  */
            /* JADX WARN: Code duplicated, block: B:194:0x0527  */
            /* JADX WARN: Code duplicated, block: B:213:0x058a  */
            /* JADX WARN: Code duplicated, block: B:303:0x085f  */
            /* JADX WARN: Code duplicated, block: B:320:0x0897  */
            /* JADX WARN: Code duplicated, block: B:344:0x0985  */
            /* JADX WARN: Code duplicated, block: B:419:0x0356 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:420:? A[LOOP:5: B:144:0x0341->B:420:?, LOOP_END, SYNTHETIC] */
            /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v46 java.lang.Object, still in use, count: 2, list:
                  (r3v46 java.lang.Object) from 0x0893: PHI (r3 I:??) = (r3v43 java.lang.Object), (r3v46 java.lang.Object) binds: [B:317:0x0892, B:457:0x0893] A[DONT_GENERATE, DONT_INLINE]
                  (r3v46 java.lang.Object) from 0x0889: CHECK_CAST (a.iup) (r3v46 java.lang.Object)
                	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
                	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
                	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
                	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
                */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object r40) {
                /*
                    Method dump skipped, instruction units count: 2806
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: a.v5t0.invoke(java.lang.Object):java.lang.Object");
            }
        }, (byte) 20));
        this.x = maz.b(new yw9((fee) n0o0VarH.getValue(), new qzs0((byte) 2), (byte) 20));
        final byte b6 = 5;
        this.y = maz.b(new yw9((fee) n0o0VarH5.getValue(), new Function1(this) { // from class: a.v5t0
            public final /* synthetic */ by8 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:116:0x02c7  */
            /* JADX WARN: Code duplicated, block: B:146:0x0347  */
            /* JADX WARN: Code duplicated, block: B:194:0x0527  */
            /* JADX WARN: Code duplicated, block: B:213:0x058a  */
            /* JADX WARN: Code duplicated, block: B:303:0x085f  */
            /* JADX WARN: Code duplicated, block: B:320:0x0897  */
            /* JADX WARN: Code duplicated, block: B:344:0x0985  */
            /* JADX WARN: Code duplicated, block: B:419:0x0356 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:420:? A[LOOP:5: B:144:0x0341->B:420:?, LOOP_END, SYNTHETIC] */
            /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v46 java.lang.Object, still in use, count: 2, list:
                  (r3v46 java.lang.Object) from 0x0893: PHI (r3 I:??) = (r3v43 java.lang.Object), (r3v46 java.lang.Object) binds: [B:317:0x0892, B:457:0x0893] A[DONT_GENERATE, DONT_INLINE]
                  (r3v46 java.lang.Object) from 0x0889: CHECK_CAST (a.iup) (r3v46 java.lang.Object)
                	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
                	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
                	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
                	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
                */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object r40) {
                /*
                    Method dump skipped, instruction units count: 2806
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: a.v5t0.invoke(java.lang.Object):java.lang.Object");
            }
        }, (byte) 20));
        final byte b7 = 6;
        this.z = maz.b(new yw9((fee) n0o0VarH.getValue(), new Function1(this) { // from class: a.v5t0
            public final /* synthetic */ by8 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:116:0x02c7  */
            /* JADX WARN: Code duplicated, block: B:146:0x0347  */
            /* JADX WARN: Code duplicated, block: B:194:0x0527  */
            /* JADX WARN: Code duplicated, block: B:213:0x058a  */
            /* JADX WARN: Code duplicated, block: B:303:0x085f  */
            /* JADX WARN: Code duplicated, block: B:320:0x0897  */
            /* JADX WARN: Code duplicated, block: B:344:0x0985  */
            /* JADX WARN: Code duplicated, block: B:419:0x0356 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:420:? A[LOOP:5: B:144:0x0341->B:420:?, LOOP_END, SYNTHETIC] */
            /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v46 java.lang.Object, still in use, count: 2, list:
                  (r3v46 java.lang.Object) from 0x0893: PHI (r3 I:??) = (r3v43 java.lang.Object), (r3v46 java.lang.Object) binds: [B:317:0x0892, B:457:0x0893] A[DONT_GENERATE, DONT_INLINE]
                  (r3v46 java.lang.Object) from 0x0889: CHECK_CAST (a.iup) (r3v46 java.lang.Object)
                	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
                	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
                	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
                */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object r40) {
                /*
                    Method dump skipped, instruction units count: 2806
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: a.v5t0.invoke(java.lang.Object):java.lang.Object");
            }
        }, (byte) 20));
        final byte b8 = 7;
        this.A = maz.b(new yw9((fee) n0o0VarH.getValue(), new Function1(this) { // from class: a.v5t0
            public final /* synthetic */ by8 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:116:0x02c7  */
            /* JADX WARN: Code duplicated, block: B:146:0x0347  */
            /* JADX WARN: Code duplicated, block: B:194:0x0527  */
            /* JADX WARN: Code duplicated, block: B:213:0x058a  */
            /* JADX WARN: Code duplicated, block: B:303:0x085f  */
            /* JADX WARN: Code duplicated, block: B:320:0x0897  */
            /* JADX WARN: Code duplicated, block: B:344:0x0985  */
            /* JADX WARN: Code duplicated, block: B:419:0x0356 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:420:? A[LOOP:5: B:144:0x0341->B:420:?, LOOP_END, SYNTHETIC] */
            /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v46 java.lang.Object, still in use, count: 2, list:
                  (r3v46 java.lang.Object) from 0x0893: PHI (r3 I:??) = (r3v43 java.lang.Object), (r3v46 java.lang.Object) binds: [B:317:0x0892, B:457:0x0893] A[DONT_GENERATE, DONT_INLINE]
                  (r3v46 java.lang.Object) from 0x0889: CHECK_CAST (a.iup) (r3v46 java.lang.Object)
                	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
                	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
                */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object r40) {
                /*
                    Method dump skipped, instruction units count: 2806
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: a.v5t0.invoke(java.lang.Object):java.lang.Object");
            }
        }, (byte) 20));
    }
}
