package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import org.xbet.client1.R;
import org.xplatform.game_broadcasting.api.presentation.models.GameBroadcastingParams;
import org.xplatform.related.api.presentation.RelatedParams;
import org.xplatform.sportgame.categories_subgames.api.MarketsCategoriesParams;

/* JADX INFO: loaded from: classes5.dex */
public final class rjs implements v6t0 {
    public final n0o0 A;
    public final n0o0 B;
    public final n0o0 C;
    public final n0o0 D;
    public final n0o0 E;
    public final n0o0 F;
    public final n0o0 G;
    public final n0o0 H;
    public final n0o0 I;
    public final n0o0 J;
    public final n0o0 K;
    public final n0o0 L;
    public final n0o0 M;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ctf0 f30611a;
    public final zvh0 b;
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

    public rjs(njs njsVar, ctf0 ctf0Var, zvh0 zvh0Var) {
        ctf0Var.getClass();
        this.f30611a = ctf0Var;
        this.b = zvh0Var;
        this.c = bkb.H(Boolean.valueOf(njsVar.r));
        this.d = bkb.H(njsVar.j);
        this.e = bkb.H(Boolean.valueOf(njsVar.i));
        this.f = bkb.H(Boolean.valueOf(njsVar.q));
        this.g = bkb.H(Boolean.valueOf(njsVar.K));
        this.h = bkb.H(Boolean.valueOf(njsVar.J));
        this.i = bkb.H(Boolean.valueOf(njsVar.d));
        this.j = bkb.H(Long.valueOf(njsVar.f23650a));
        this.k = bkb.H(Long.valueOf(njsVar.f));
        this.l = bkb.H(njsVar.g);
        this.m = bkb.H(Long.valueOf(njsVar.e));
        this.n = bkb.H(njsVar.T);
        this.o = bkb.H(njsVar.l);
        this.p = bkb.H(njsVar.m);
        this.q = bkb.H(njsVar.n);
        this.r = bkb.H(njsVar.o);
        this.s = bkb.H(njsVar.p);
        anq0 anq0Var = njsVar.Q;
        this.t = bkb.H(anq0Var != null ? new znq0(anq0Var.f) : null);
        this.u = bkb.H(njsVar.S);
        this.v = bkb.H(Boolean.valueOf(njsVar.U));
        this.w = bkb.H(njsVar.V);
        this.x = bkb.H(njsVar.P);
        this.y = bkb.H(njsVar.k);
        final byte b = 0;
        this.z = maz.b(new yw9(njsVar.b(), new Function1(this) { // from class: a.qjs
            public final /* synthetic */ rjs b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:260:0x08d4  */
            /* JADX WARN: Code duplicated, block: B:262:0x08e4  */
            /* JADX WARN: Code duplicated, block: B:265:0x090f  */
            /* JADX WARN: Code duplicated, block: B:268:0x0932  */
            /* JADX WARN: Code duplicated, block: B:270:0x0936  */
            /* JADX WARN: Code duplicated, block: B:272:0x094e  */
            private final Object a(Object obj) {
                n0o0 n0o0Var;
                n0o0 n0o0Var2;
                String str;
                String str2;
                mqr kqrVar;
                String strG;
                d3h0 pekVar;
                String strN;
                d3h0 xakVar;
                Integer num;
                String strN2;
                int i;
                iul0 iul0Var;
                yd90 yd90Var;
                yd90 yd90Var2;
                iul0 iul0Var2;
                String str3;
                String str4;
                d3h0 bekVar;
                String strA;
                String strB;
                String strN3;
                rjs rjsVar = this.b;
                n0o0 n0o0Var3 = rjsVar.v;
                n0o0 n0o0Var4 = rjsVar.m;
                n0o0 n0o0Var5 = rjsVar.H;
                n0o0 n0o0Var6 = rjsVar.I;
                ctf0 ctf0Var2 = rjsVar.f30611a;
                gna gnaVar = (gna) obj;
                if (gnaVar != null) {
                    if (!(gnaVar instanceof ena)) {
                        if (gnaVar instanceof fna) {
                            ctf0Var2.getClass();
                            return new orr(d9x.L(((fna) gnaVar).f9825a, ctf0Var2));
                        }
                        t9f.b();
                        return null;
                    }
                    ena enaVar = (ena) gnaVar;
                    mca mcaVar = enaVar.f8084a;
                    List list = (List) ((fee) rjsVar.n.getValue()).c();
                    boolean zBooleanValue = ((Boolean) ((fee) rjsVar.e.getValue()).c()).booleanValue();
                    mpm mpmVar = (mpm) ((fee) n0o0Var6.getValue()).b();
                    boolean z = enaVar.p;
                    String str5 = (String) ((fee) rjsVar.p.getValue()).c();
                    String str6 = (String) ((fee) rjsVar.q.getValue()).c();
                    String str7 = (String) ((fee) rjsVar.r.getValue()).c();
                    String str8 = (String) ((fee) rjsVar.s.getValue()).c();
                    jg30 jg30Var = (jg30) ((fee) n0o0Var5.getValue()).b();
                    bg30 bg30Var = (bg30) ((fee) n0o0Var6.getValue()).c();
                    znq0 znq0Var = (znq0) ((fee) rjsVar.t.getValue()).c();
                    bha bhaVar = enaVar.o;
                    ui9 ui9Var = (ui9) ((fee) rjsVar.u.getValue()).c();
                    long jLongValue = ((Number) ((fee) n0o0Var4.getValue()).c()).longValue();
                    boolean zBooleanValue2 = ((Boolean) ((fee) n0o0Var3.getValue()).c()).booleanValue();
                    ctf0Var2.getClass();
                    if (ui9Var != null) {
                        int i2 = ui9Var.c;
                        int i3 = ui9Var.d;
                        n0o0Var = n0o0Var4;
                        String strN4 = (cy7.c() && zBooleanValue2) ? w6x.n(i3, i2, " : ") : w6x.n(i2, i3, " : ");
                        String strX = j0x.x(jLongValue, ctf0Var2);
                        ArrayList arrayList = ui9Var.f35720a;
                        n0o0Var2 = n0o0Var5;
                        str = str5;
                        str2 = str6;
                        ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
                        int i4 = 0;
                        for (Object obj2 : arrayList) {
                            int i5 = i4 + 1;
                            if (i4 < 0) {
                                q3d.p();
                                throw null;
                            }
                            arrayList2.add(piz.W((sc90) obj2, jLongValue, i4));
                            i4 = i5;
                        }
                        i4 i4VarR0 = dyb.r0(arrayList2);
                        ArrayList arrayList3 = ui9Var.b;
                        ArrayList arrayList4 = new ArrayList(r3d.q(arrayList3, 10));
                        int i6 = 0;
                        for (Object obj3 : arrayList3) {
                            int i7 = i6 + 1;
                            if (i6 < 0) {
                                q3d.p();
                                throw null;
                            }
                            arrayList4.add(piz.W((sc90) obj3, jLongValue, i6));
                            i6 = i7;
                        }
                        kqrVar = new iqr(strN4, strX, i4VarR0, dyb.r0(arrayList4));
                    } else {
                        n0o0Var = n0o0Var4;
                        n0o0Var2 = n0o0Var5;
                        str = str5;
                        str2 = str6;
                        if (bhaVar != null) {
                            float f = bhaVar.d;
                            float f2 = bhaVar.e;
                            float f3 = bhaVar.f;
                            Object[] objArr = {Float.valueOf(f3)};
                            lsm0 lsm0Var = ctf0Var2.b;
                            String strA2 = lsm0Var.a(R.string.n_percents, Arrays.copyOf(objArr, 1));
                            k3w0 g3w0Var = (f3 <= f2 || f3 <= f) ? new g3w0(strA2) : new i3w0(strA2);
                            String strA3 = lsm0Var.a(R.string.n_percents, Arrays.copyOf(new Object[]{Float.valueOf(f2)}, 1));
                            k3w0 g3w0Var2 = (f2 <= f3 || f2 <= f) ? new g3w0(strA3) : new i3w0(strA3);
                            String strA4 = lsm0Var.a(R.string.n_percents, Arrays.copyOf(new Object[]{Float.valueOf(f)}, 1));
                            kqrVar = new kqr(g3w0Var, g3w0Var2, (f <= f3 || f <= f2) ? new g3w0(strA4) : new i3w0(strA4));
                        } else {
                            kqrVar = null;
                        }
                    }
                    anq0 anq0Var2 = (anq0) ((fee) n0o0Var2.getValue()).c();
                    boolean z2 = anq0Var2 != null ? anq0Var2.f1167a : false;
                    long jLongValue2 = ((Number) ((fee) n0o0Var.getValue()).c()).longValue();
                    boolean zBooleanValue3 = ((Boolean) ((fee) n0o0Var3.getValue()).c()).booleanValue();
                    list.getClass();
                    mpmVar.getClass();
                    String strA5 = "";
                    if (mcaVar instanceof pca) {
                        pca pcaVar = (pca) mcaVar;
                        uqr uqrVarR0 = pzb.r0(mcaVar, str, str2, str7, str8, jg30Var);
                        if (bg30Var == null || (bekVar = bg30Var.b) == null) {
                            bekVar = bg30Var != null ? bg30Var.f2536a : new bek();
                        }
                        d3h0 d3h0Var = bekVar;
                        boolean z3 = d3h0Var instanceof lz10;
                        lz10 lz10Var = z3 ? (lz10) d3h0Var : null;
                        if (lz10Var != null) {
                            strA = vzb.T(lz10Var, zBooleanValue3);
                        } else {
                            hzm0 hzm0Var = d3h0Var instanceof hzm0 ? (hzm0) d3h0Var : null;
                            if (hzm0Var != null) {
                                String str9 = hzm0Var.g;
                                String str10 = hzm0Var.i;
                                StringBuilder sb = new StringBuilder("\u2066");
                                if (cy7.c() && zBooleanValue3) {
                                    if (str10 != null) {
                                        hne.B(sb, "(ov ", str10, Separators.RPAREN);
                                    }
                                    sb.append(vzb.i0(str9));
                                } else {
                                    sb.append(str9);
                                    if (str10 != null) {
                                        hne.B(sb, Separators.LPAREN, str10, " ov)");
                                    }
                                }
                                sb.append("\u2069");
                                strA = sb.toString();
                            } else {
                                strA = d3h0Var.a();
                            }
                        }
                        String str11 = strA;
                        lz10 lz10Var2 = z3 ? (lz10) d3h0Var : null;
                        if (lz10Var2 != null) {
                            strB = vzb.U(lz10Var2, zBooleanValue3);
                        } else {
                            hzm0 hzm0Var2 = d3h0Var instanceof hzm0 ? (hzm0) d3h0Var : null;
                            if (hzm0Var2 != null) {
                                String str12 = hzm0Var2.h;
                                String str13 = hzm0Var2.j;
                                StringBuilder sb2 = new StringBuilder("\u2066");
                                if (cy7.c() && zBooleanValue3) {
                                    if (str13 != null) {
                                        hne.B(sb2, "(ov ", str13, Separators.RPAREN);
                                    }
                                    sb2.append(vzb.i0(str12));
                                } else {
                                    sb2.append(str12);
                                    if (str13 != null) {
                                        hne.B(sb2, Separators.LPAREN, str13, " ov)");
                                    }
                                }
                                sb2.append("\u2069");
                                strB = sb2.toString();
                            } else {
                                strB = d3h0Var.b();
                            }
                        }
                        String str14 = strB;
                        boolean z4 = pcaVar.d;
                        rpp0 rpp0Var = pcaVar.f26749a;
                        j83 j83VarH = vzb.H(ctf0Var2, d3h0Var, pcaVar.e, pcaVar.f, pcaVar.g, (bg30Var == null || (strN3 = bg30Var.f2536a.n()) == null) ? "" : strN3, z4, zBooleanValue3);
                        String strB2 = rpp0Var.b();
                        c280 c280Var = new c280(vsm0.s(rpp0Var.a(), pcaVar.b), R.drawable.ic_glyph_placeholder_player);
                        long jA = rpp0Var.a();
                        bap bapVar = bap.b;
                        jdp0 jdp0Var = new jdp0(strB2, n6x.o0(c280Var, jA, list, zBooleanValue, bapVar), null);
                        jdp0 jdp0Var2 = new jdp0(rpp0Var.d(), n6x.o0(new c280(vsm0.s(rpp0Var.c(), pcaVar.c), R.drawable.ic_glyph_placeholder_player), rpp0Var.c(), list, zBooleanValue, bapVar), null);
                        lz10 lz10Var3 = z3 ? (lz10) d3h0Var : null;
                        return new mrr(uqrVarR0, jdp0Var, jdp0Var2, j83VarH, lz10Var3 != null ? vzb.G(lz10Var3.i) : eex.c, str11, d3h0Var.j(), str14, d3h0Var.i());
                    }
                    boolean z5 = z2;
                    String str15 = str;
                    String str16 = str2;
                    boolean z6 = mcaVar instanceof tca;
                    qpm qpmVar = qpm.f29126a;
                    if (z6) {
                        tca tcaVar = (tca) mcaVar;
                        uqr uqrVarR1 = pzb.r0(mcaVar, str15, str16, str7, str8, jg30Var);
                        znq0 znq0Var2 = new znq0(znq0Var != null ? znq0Var.f44687a : 0L);
                        rpp0 rpp0Var2 = tcaVar.f33711a;
                        boolean z7 = tcaVar.i;
                        if (rpp0Var2 instanceof qpp0) {
                            qpp0 qpp0Var = (qpp0) rpp0Var2;
                            jdp0 jdp0Var3 = new jdp0(qpp0Var.g, n6x.o0(u1c.C(tcaVar, true), qpp0Var.e, list, zBooleanValue || z7, bap.b), null);
                            jdp0 jdp0Var4 = new jdp0(qpp0Var.h, n6x.o0(u1c.C(tcaVar, false), qpp0Var.f, list, zBooleanValue || z7, bap.f2271a), null);
                            lpm lpmVar = new lpm(qpmVar, new hpm(0L, 3));
                            dpi0 dpi0Var = new dpi0((byte) 15);
                            rdj rdjVar = rdj.f30294a;
                            vzb.E(dpi0Var, rdj.g(znq0Var2, efj.UNIVERSAL, Boolean.valueOf(z), false, 56));
                            return new trr(uqrVarR1, jdp0Var3, jdp0Var4, lpmVar, ((h83) dpi0Var.f6468a).h(), kqrVar);
                        }
                        if (!(rpp0Var2 instanceof ppp0)) {
                            t9f.b();
                            return null;
                        }
                        ppp0 ppp0Var = (ppp0) rpp0Var2;
                        xcp0 xcp0VarC0 = b8k0.c0(ppp0Var.e, ppp0Var.g, tcaVar.b);
                        xcp0 xcp0VarC1 = b8k0.c0(ppp0Var.f, ppp0Var.h, tcaVar.c);
                        lpm lpmVar2 = new lpm(qpmVar, new hpm(0L, 3));
                        dpi0 dpi0Var2 = new dpi0((byte) 15);
                        rdj rdjVar2 = rdj.f30294a;
                        vzb.E(dpi0Var2, rdj.g(znq0Var2, efj.UNIVERSAL, Boolean.valueOf(z), false, 56));
                        return new trr(uqrVarR1, xcp0VarC0, xcp0VarC1, lpmVar2, ((h83) dpi0Var2.f6468a).h(), kqrVar);
                    }
                    if (!(mcaVar instanceof xca)) {
                        if (mcaVar instanceof gda) {
                            gda gdaVar = (gda) mcaVar;
                            uqr uqrVarR2 = pzb.r0(mcaVar, str15, str16, str7, str8, jg30Var);
                            znq0 znq0Var3 = new znq0(znq0Var != null ? znq0Var.f44687a : 0L);
                            String strB0 = CollectionsKt.b0(gdaVar.f11094a, Separators.SLASH, null, null, null, 62);
                            String strB1 = CollectionsKt.b0(gdaVar.b, Separators.SLASH, null, null, null, 62);
                            lpm lpmVar3 = new lpm(qpmVar, new hpm(0L, 3));
                            dpi0 dpi0Var3 = new dpi0((byte) 15);
                            rdj rdjVar3 = rdj.f30294a;
                            vzb.E(dpi0Var3, rdj.g(znq0Var3, efj.UNIVERSAL, Boolean.valueOf(z), false, 56));
                            return new rrr(uqrVarR2, strB0, strB1, lpmVar3, ((h83) dpi0Var3.f6468a).h());
                        }
                        if (mcaVar instanceof hda) {
                            hda hdaVar = (hda) mcaVar;
                            uqr uqrVarR3 = pzb.r0(mcaVar, str15, str16, str7, str8, jg30Var);
                            if (bg30Var == null || (pekVar = bg30Var.b) == null) {
                                pekVar = bg30Var != null ? bg30Var.f2536a : new pek();
                            }
                            return new rrr(uqrVarR3, CollectionsKt.b0(hdaVar.f12861a, Separators.SLASH, null, null, null, 62), CollectionsKt.b0(hdaVar.b, Separators.SLASH, null, null, null, 62), mpmVar, vzb.H(ctf0Var2, pekVar, hdaVar.h, hdaVar.i, hdaVar.j, (bg30Var == null || (strN = bg30Var.f2536a.n()) == null) ? "" : strN, hdaVar.g, zBooleanValue3));
                        }
                        if (!(mcaVar instanceof ida)) {
                            t9f.b();
                            return null;
                        }
                        ida idaVar = (ida) mcaVar;
                        uqr uqrVarR4 = pzb.r0(mcaVar, str15, str16, str7, str8, jg30Var);
                        if (!idaVar.g) {
                            if (znq0Var != null) {
                                rdj rdjVar4 = rdj.f30294a;
                                strG = rdj.g(znq0Var, efj.UNIVERSAL, Boolean.valueOf(z), false, 56);
                                if (strG == null) {
                                }
                            }
                            dpi0 dpi0Var4 = new dpi0((byte) 15);
                            vzb.E(dpi0Var4, strG);
                            return new vrr(uqrVarR4, idaVar.e, ((h83) dpi0Var4.f6468a).h());
                        }
                        strA5 = ctf0Var2.b.a(R.string.game_end, Arrays.copyOf(new Object[0], 0));
                        strG = strA5;
                        dpi0 dpi0Var5 = new dpi0((byte) 15);
                        vzb.E(dpi0Var5, strG);
                        return new vrr(uqrVarR4, idaVar.e, ((h83) dpi0Var5.f6468a).h());
                    }
                    if (!gql0.d().contains(Long.valueOf(jLongValue2))) {
                        xca xcaVar = (xca) mcaVar;
                        uqr uqrVarR5 = pzb.r0(mcaVar, str15, str16, str7, str8, jg30Var);
                        if (bg30Var == null || (xakVar = bg30Var.b) == null) {
                            xakVar = bg30Var != null ? bg30Var.f2536a : new xak((byte) 22);
                        }
                        boolean z8 = xcaVar.l;
                        boolean z9 = xcaVar.q;
                        rpp0 rpp0Var3 = xcaVar.f40636a;
                        j83 j83VarH2 = vzb.H(ctf0Var2, xakVar, xcaVar.n, xcaVar.o, xcaVar.p, (bg30Var == null || (strN2 = bg30Var.f2536a.n()) == null) ? "" : strN2, z8, zBooleanValue3);
                        if (!(rpp0Var3 instanceof qpp0)) {
                            if (rpp0Var3 instanceof ppp0) {
                                ppp0 ppp0Var2 = (ppp0) rpp0Var3;
                                return new trr(uqrVarR5, b8k0.c0(ppp0Var2.e, ppp0Var2.g, xcaVar.h), b8k0.c0(ppp0Var2.f, ppp0Var2.h, xcaVar.i), mpmVar, j83VarH2, kqrVar);
                            }
                            t9f.b();
                            return null;
                        }
                        int i8 = xcaVar.b;
                        int i9 = xcaVar.g;
                        int i10 = xcaVar.f;
                        int i11 = xcaVar.d;
                        int i12 = xcaVar.c;
                        vy vyVar = (i8 == 0 && i12 == 0 && i11 == 0) ? null : new vy(i8 > 0 ? Integer.valueOf(i8) : null, i12 > 0 ? Integer.valueOf(i12) : null, i11 > 0 ? Integer.valueOf(i11) : null);
                        int i13 = xcaVar.e;
                        vy vyVar2 = (i13 == 0 && i10 == 0 && i9 == 0) ? null : new vy(i13 > 0 ? Integer.valueOf(i13) : null, i10 > 0 ? Integer.valueOf(i10) : null, i9 > 0 ? Integer.valueOf(i9) : null);
                        boolean z10 = (vyVar == null && vyVar2 == null) ? false : true;
                        if (z10 && vyVar == null) {
                            num = null;
                            vyVar = new vy(null, null, null);
                        } else {
                            num = null;
                        }
                        if (z10 && vyVar2 == null) {
                            vyVar2 = new vy(num, num, num);
                        }
                        qpp0 qpp0Var2 = (qpp0) rpp0Var3;
                        return new trr(uqrVarR5, new jdp0(qpp0Var2.g, n6x.o0(u1c.D(xcaVar, true), qpp0Var2.e, list, zBooleanValue || z9, bap.b), vyVar), new jdp0(qpp0Var2.h, n6x.o0(u1c.D(xcaVar, false), qpp0Var2.f, list, zBooleanValue || z9, bap.f2271a), vyVar2), mpmVar, j83VarH2, kqrVar);
                    }
                    xca xcaVar2 = (xca) mcaVar;
                    long j = znq0Var != null ? znq0Var.f44687a : 0L;
                    uqr uqrVarR6 = pzb.r0(mcaVar, str15, str16, str7, str8, jg30Var);
                    znq0 znq0Var4 = new znq0(j);
                    pz10 pz10Var = bg30Var != null ? bg30Var.f2536a : null;
                    if (pz10Var instanceof nz10) {
                        izm0 izm0Var = bg30Var.b;
                        String str17 = xcaVar2.s;
                        List list2 = xcaVar2.i;
                        List list3 = xcaVar2.h;
                        rpp0 rpp0Var4 = xcaVar2.f40636a;
                        boolean z11 = xcaVar2.l;
                        String str18 = xcaVar2.p;
                        rdj rdjVar5 = rdj.f30294a;
                        pz10 pz10Var2 = pz10Var;
                        String strG2 = rdj.g(znq0Var4, efj.UNIVERSAL, Boolean.valueOf(z), false, 56);
                        str18.getClass();
                        strG2.getClass();
                        dpi0 dpi0Var6 = new dpi0((byte) 15);
                        if (str17 != null) {
                            vzb.E(dpi0Var6, str17);
                            vzb.E(dpi0Var6, ": ");
                            boolean z12 = cy7.c() && zBooleanValue3;
                            if (izm0Var == null) {
                                vzb.E(dpi0Var6, "0");
                                vzb.C(dpi0Var6);
                                vzb.E(dpi0Var6, "0");
                            } else {
                                if (!(izm0Var instanceof gzm0) && !(izm0Var instanceof hzm0)) {
                                    t9f.b();
                                    return null;
                                }
                                boolean z13 = izm0Var instanceof hzm0;
                                String strA6 = z13 ? ((hzm0) izm0Var).g : izm0Var.a();
                                String strB3 = z13 ? ((hzm0) izm0Var).h : izm0Var.b();
                                vzb.E(dpi0Var6, "\u2066");
                                if (z12) {
                                    vzb.D(dpi0Var6, strB3, vzb.L(izm0Var.i()));
                                    vzb.C(dpi0Var6);
                                    vzb.D(dpi0Var6, strA6, vzb.L(izm0Var.j()));
                                } else {
                                    vzb.D(dpi0Var6, strA6, vzb.L(izm0Var.j()));
                                    vzb.C(dpi0Var6);
                                    vzb.D(dpi0Var6, strB3, vzb.L(izm0Var.i()));
                                }
                                vzb.E(dpi0Var6, "\u2069");
                            }
                        } else {
                            vzb.E(dpi0Var6, strG2);
                            if (str18.length() > 0) {
                                vzb.A(dpi0Var6);
                                vzb.E(dpi0Var6, str18);
                            }
                            if (z11) {
                                vzb.A(dpi0Var6);
                                i = 0;
                                vzb.E(dpi0Var6, ctf0Var2.b.a(R.string.game_end, Arrays.copyOf(new Object[0], 0)));
                            } else {
                                i = 0;
                            }
                            if (z5) {
                                vzb.A(dpi0Var6);
                                vzb.E(dpi0Var6, ctf0Var2.b.a(R.string.card_cricket_break, Arrays.copyOf(new Object[i], i)));
                            }
                        }
                        j83 j83VarH3 = ((h83) dpi0Var6.f6468a).h();
                        nz10 nz10Var = (nz10) pz10Var2;
                        boolean z14 = nz10Var instanceof mz10;
                        k5q0 k5q0Var = k5q0.b;
                        if (!z14) {
                            if (nz10Var instanceof oz10) {
                                oz10 oz10Var = (oz10) nz10Var;
                                String str19 = oz10Var.i;
                                String str20 = oz10Var.g;
                                String str21 = oz10Var.m;
                                String str22 = oz10Var.k;
                                boolean z15 = ((StringsKt.W(str22) || str22.equals("0")) && (StringsKt.W(str21) || str21.equals("0"))) ? false : true;
                                boolean z16 = str20.length() > 0 || str19.length() > 0;
                                eex eexVarG = vzb.G(oz10Var.o);
                                ArrayList arrayList5 = oz10Var.f;
                                ArrayList arrayList6 = new ArrayList(r3d.q(arrayList5, 10));
                                Iterator it = arrayList5.iterator();
                                while (it.hasNext()) {
                                    te90 te90Var = (te90) it.next();
                                    arrayList6.add(new yd90(vzb.O(te90Var), vzb.Q(te90Var), te90Var.f33809a));
                                    it = it;
                                    z15 = z15;
                                }
                                boolean z17 = z15;
                                i4 i4VarR1 = dyb.r0(arrayList6);
                                j83 j83VarN = vzb.N(nz10Var);
                                j83 j83VarP = vzb.P(nz10Var);
                                lsm0 lsm0Var2 = ctf0Var2.b;
                                yd90 yd90Var3 = new yd90(j83VarN, j83VarP, lsm0Var2.a(R.string.total_count, Arrays.copyOf(new Object[0], 0)));
                                if (z17) {
                                    h83 h83Var = new h83();
                                    long j2 = y3d.g;
                                    long j3 = daq0.c;
                                    smk0 smk0Var = new smk0(vzb.L(oz10Var.l), j3, null, null, null, null, null, j3, new j56(0.0f), null, null, j2, k5q0Var, null, null, 17424);
                                    h83Var.c(str22);
                                    j83 j83VarC = kng0.c(h83Var.f12607a, h83Var, smk0Var, 0);
                                    h83 h83Var2 = new h83();
                                    smk0 smk0Var2 = new smk0(vzb.L(oz10Var.n), j3, null, null, null, null, null, j3, new j56(0.0f), null, null, j2, k5q0Var, null, null, 17424);
                                    h83Var2.c(str21);
                                    yd90Var = new yd90(j83VarC, kng0.c(h83Var2.f12607a, h83Var2, smk0Var2, 0), lsm0Var2.a(R.string.dt_points, Arrays.copyOf(new Object[0], 0)));
                                } else {
                                    yd90Var = null;
                                }
                                if (z16) {
                                    h83 h83Var3 = new h83();
                                    long j4 = y3d.g;
                                    long j5 = daq0.c;
                                    smk0 smk0Var3 = new smk0(vzb.L(oz10Var.h), j5, null, null, null, null, null, j5, new j56(0.0f), null, null, j4, k5q0Var, null, null, 17424);
                                    h83Var3.c(str20);
                                    j83 j83VarC2 = kng0.c(h83Var3.f12607a, h83Var3, smk0Var3, 0);
                                    h83 h83Var4 = new h83();
                                    smk0 smk0Var4 = new smk0(vzb.L(oz10Var.j), j5, null, null, null, null, null, j5, new j56(0.0f), null, null, j4, k5q0Var, null, null, 17424);
                                    h83Var4.c(str19);
                                    yd90Var2 = new yd90(j83VarC2, kng0.c(h83Var4.f12607a, h83Var4, smk0Var4, 0), lsm0Var2.a(R.string.tennis_game_column, Arrays.copyOf(new Object[0], 0)));
                                } else {
                                    yd90Var2 = null;
                                }
                                iul0Var2 = new iul0(eexVarG, i4VarR1, yd90Var3, yd90Var2, yd90Var);
                            } else {
                                if (!(nz10Var instanceof kz10)) {
                                    t9f.b();
                                    return null;
                                }
                                kz10 kz10Var = (kz10) nz10Var;
                                eex eexVarG2 = vzb.G(kz10Var.g);
                                ArrayList<te90> arrayList7 = kz10Var.f;
                                ArrayList arrayList8 = new ArrayList(r3d.q(arrayList7, 10));
                                for (te90 te90Var2 : arrayList7) {
                                    arrayList8.add(new yd90(vzb.O(te90Var2), vzb.Q(te90Var2), te90Var2.f33809a));
                                }
                                iul0Var = new iul0(eexVarG2, dyb.r0(arrayList8), new yd90(vzb.N(nz10Var), vzb.P(nz10Var), ctf0Var2.b.a(R.string.total_count, Arrays.copyOf(new Object[0], 0))), null, null);
                            }
                            if (rpp0Var4 instanceof qpp0) {
                                if (rpp0Var4 instanceof ppp0) {
                                    ppp0 ppp0Var3 = (ppp0) rpp0Var4;
                                    return new xrr(uqrVarR6, b8k0.c0(ppp0Var3.e, ppp0Var3.g, list3), b8k0.c0(ppp0Var3.f, ppp0Var3.h, list2), j83VarH3, iul0Var2);
                                }
                                t9f.b();
                                return null;
                            }
                            qpp0 qpp0Var3 = (qpp0) rpp0Var4;
                            String str23 = qpp0Var3.g;
                            str3 = (String) CollectionsKt.firstOrNull(list3);
                            if (str3 == null) {
                                str3 = "";
                            }
                            c280 c280Var2 = new c280(vsm0.s(qpp0Var3.e, str3), R.drawable.ic_glyph_placeholder_player);
                            long j6 = qpp0Var3.e;
                            bap bapVar2 = bap.b;
                            jdp0 jdp0Var5 = new jdp0(str23, n6x.o0(c280Var2, j6, list, zBooleanValue, bapVar2), null);
                            String str24 = qpp0Var3.h;
                            str4 = (String) CollectionsKt.firstOrNull(list2);
                            if (str4 == null) {
                                str4 = "";
                            }
                            return new xrr(uqrVarR6, jdp0Var5, new jdp0(str24, n6x.o0(new c280(vsm0.s(qpp0Var3.f, str4), R.drawable.ic_glyph_placeholder_player), qpp0Var3.f, list, zBooleanValue, bapVar2), null), j83VarH3, iul0Var2);
                        }
                        mz10 mz10Var = (mz10) nz10Var;
                        eex eexVarG3 = vzb.G(mz10Var.g);
                        ArrayList<te90> arrayList9 = mz10Var.f;
                        ArrayList arrayList10 = new ArrayList(r3d.q(arrayList9, 10));
                        for (te90 te90Var3 : arrayList9) {
                            arrayList10.add(new yd90(vzb.O(te90Var3), vzb.Q(te90Var3), te90Var3.f33809a));
                        }
                        i4 i4VarR2 = dyb.r0(arrayList10);
                        j83 j83VarN2 = vzb.N(nz10Var);
                        j83 j83VarP2 = vzb.P(nz10Var);
                        lsm0 lsm0Var3 = ctf0Var2.b;
                        yd90 yd90Var4 = new yd90(j83VarN2, j83VarP2, lsm0Var3.a(R.string.total_count, Arrays.copyOf(new Object[0], 0)));
                        h83 h83Var5 = new h83();
                        String str25 = mz10Var.h;
                        long j7 = y3d.g;
                        long j8 = daq0.c;
                        smk0 smk0Var5 = new smk0(vzb.L(mz10Var.i), j8, null, null, null, null, null, j8, new j56(0.0f), null, null, j7, k5q0Var, null, null, 17424);
                        h83Var5.c(str25);
                        j83 j83VarC3 = kng0.c(h83Var5.f12607a, h83Var5, smk0Var5, 0);
                        h83 h83Var6 = new h83();
                        String str26 = mz10Var.j;
                        smk0 smk0Var6 = new smk0(vzb.L(mz10Var.k), j8, null, null, null, null, null, j8, new j56(0.0f), null, null, j7, k5q0Var, null, null, 17424);
                        h83Var6.c(str26);
                        iul0Var = new iul0(eexVarG3, i4VarR2, yd90Var4, null, new yd90(j83VarC3, kng0.c(h83Var6.f12607a, h83Var6, smk0Var6, 0), lsm0Var3.a(R.string.dt_points, Arrays.copyOf(new Object[0], 0))));
                        iul0Var2 = iul0Var;
                        if (rpp0Var4 instanceof qpp0) {
                            if (rpp0Var4 instanceof ppp0) {
                                ppp0 ppp0Var4 = (ppp0) rpp0Var4;
                                return new xrr(uqrVarR6, b8k0.c0(ppp0Var4.e, ppp0Var4.g, list3), b8k0.c0(ppp0Var4.f, ppp0Var4.h, list2), j83VarH3, iul0Var2);
                            }
                            t9f.b();
                            return null;
                        }
                        qpp0 qpp0Var4 = (qpp0) rpp0Var4;
                        String str27 = qpp0Var4.g;
                        str3 = (String) CollectionsKt.firstOrNull(list3);
                        if (str3 == null) {
                            str3 = "";
                        }
                        c280 c280Var3 = new c280(vsm0.s(qpp0Var4.e, str3), R.drawable.ic_glyph_placeholder_player);
                        long j9 = qpp0Var4.e;
                        bap bapVar3 = bap.b;
                        jdp0 jdp0Var6 = new jdp0(str27, n6x.o0(c280Var3, j9, list, zBooleanValue, bapVar3), null);
                        String str28 = qpp0Var4.h;
                        str4 = (String) CollectionsKt.firstOrNull(list2);
                        if (str4 == null) {
                            str4 = "";
                        }
                        return new xrr(uqrVarR6, jdp0Var6, new jdp0(str28, n6x.o0(new c280(vsm0.s(qpp0Var4.f, str4), R.drawable.ic_glyph_placeholder_player), qpp0Var4.f, list, zBooleanValue, bapVar3), null), j83VarH3, iul0Var2);
                    }
                }
                return qrr.f29223a;
            }

            /* JADX WARN: Code duplicated, block: B:18:0x008a  */
            private final Object b(Object obj) {
                String strG;
                lz10 lz10Var;
                float f;
                fad dadVar;
                sad qadVar;
                j83 j83VarC;
                j83 j83VarC2;
                gna gnaVar = (gna) obj;
                if (gnaVar == null) {
                    return null;
                }
                if (!(gnaVar instanceof ena)) {
                    if (gnaVar instanceof fna) {
                        return null;
                    }
                    t9f.b();
                    return null;
                }
                ena enaVar = (ena) gnaVar;
                mca mcaVar = enaVar.f8084a;
                rjs rjsVar = this.b;
                jg30 jg30Var = (jg30) ((fee) rjsVar.H.getValue()).b();
                bg30 bg30Var = (bg30) ((fee) rjsVar.I.getValue()).c();
                pz10 pz10Var = bg30Var != null ? bg30Var.f2536a : null;
                ctf0 ctf0Var2 = rjsVar.f30611a;
                boolean z = enaVar.p;
                znq0 znq0Var = (znq0) ((fee) rjsVar.t.getValue()).c();
                boolean zBooleanValue = ((Boolean) ((fee) rjsVar.v.getValue()).c()).booleanValue();
                ctf0Var2.getClass();
                dja djaVar = dja.PENALTY;
                k5q0 k5q0Var = k5q0.b;
                if (jg30Var != null) {
                    dadVar = new ead(jg30Var);
                    f = 0.0f;
                    lz10Var = null;
                } else {
                    h83 h83Var = new h83();
                    if (znq0Var != null) {
                        rdj rdjVar = rdj.f30294a;
                        strG = rdj.g(znq0Var, efj.UNIVERSAL, Boolean.valueOf(z), false, 56);
                        if (strG == null) {
                            strG = "";
                        }
                    } else {
                        strG = "";
                    }
                    pz40 pz40Var = s6t0.f31722a;
                    long textPrimary = s6t0.b().f33626a.getTextPrimary();
                    h83 h83Var2 = new h83();
                    long j = y3d.g;
                    long j2 = daq0.c;
                    lz10Var = null;
                    f = 0.0f;
                    smk0 smk0Var = new smk0(textPrimary, j2, null, null, null, null, null, j2, new j56(0.0f), null, null, j, k5q0Var, null, null, 17424);
                    h83Var2.c(strG);
                    StringBuilder sb = h83Var2.f12607a;
                    h83Var2.a(smk0Var, 0, sb.length());
                    sb.length();
                    h83Var.b(h83Var2.h());
                    dadVar = new dad(h83Var.h());
                }
                d3h0 cl5Var = pz10Var;
                if (mcaVar instanceof pca) {
                    if (pz10Var == null) {
                        cl5Var = new cl5((byte) 28);
                    }
                    rpp0 rpp0Var = ((pca) mcaVar).f26749a;
                    String strB = rpp0Var.b();
                    String strD = rpp0Var.d();
                    boolean z2 = cl5Var instanceof lz10;
                    lz10 lz10Var2 = z2 ? (lz10) cl5Var : lz10Var;
                    String strT = lz10Var2 != null ? vzb.T(lz10Var2, zBooleanValue) : "0";
                    lz10 lz10Var3 = z2 ? (lz10) cl5Var : lz10Var;
                    qadVar = new pad(strB, strD, strT, lz10Var3 != null ? vzb.U(lz10Var3, zBooleanValue) : "0", cl5Var.j(), cl5Var.i());
                } else if (mcaVar instanceof tca) {
                    rpp0 rpp0Var2 = ((tca) mcaVar).f33711a;
                    String strB2 = rpp0Var2.b();
                    String strD2 = rpp0Var2.d();
                    h83 h83Var3 = new h83();
                    String strA = ctf0Var2.b.a(R.string.vs, Arrays.copyOf(new Object[0], 0));
                    long j3 = y3d.g;
                    long j4 = daq0.c;
                    pz40 pz40Var2 = s6t0.f31722a;
                    smk0 smk0Var2 = new smk0(s6t0.b().f33626a.getTextPrimary(), j4, null, null, null, null, null, j4, new j56(f), null, null, j3, k5q0Var, null, null, 17424);
                    h83Var3.c(strA);
                    qadVar = new rad(kng0.c(h83Var3.f12607a, h83Var3, smk0Var2, 0), strB2, strD2);
                } else if (mcaVar instanceof xca) {
                    rpp0 rpp0Var3 = ((xca) mcaVar).f40636a;
                    String strB3 = rpp0Var3.b();
                    String strD3 = rpp0Var3.d();
                    if (pz10Var != null) {
                        j83VarC2 = vzb.M(pz10Var);
                    } else {
                        h83 h83Var4 = new h83();
                        String strA2 = ctf0Var2.b.a(R.string.vs, Arrays.copyOf(new Object[0], 0));
                        long j5 = y3d.g;
                        long j6 = daq0.c;
                        pz40 pz40Var3 = s6t0.f31722a;
                        smk0 smk0Var3 = new smk0(s6t0.b().f33626a.getTextPrimary(), j6, null, null, null, null, null, j6, new j56(f), null, null, j5, k5q0Var, null, null, 17424);
                        h83Var4.c(strA2);
                        j83VarC2 = kng0.c(h83Var4.f12607a, h83Var4, smk0Var3, 0);
                    }
                    qadVar = new rad(j83VarC2, strB3, strD3);
                } else if (mcaVar instanceof gda) {
                    gda gdaVar = (gda) mcaVar;
                    String strB0 = CollectionsKt.b0(gdaVar.f11094a, Separators.SLASH, null, null, null, 62);
                    String strB1 = CollectionsKt.b0(gdaVar.b, Separators.SLASH, null, null, null, 62);
                    h83 h83Var5 = new h83();
                    String strA3 = ctf0Var2.b.a(R.string.vs, Arrays.copyOf(new Object[0], 0));
                    long j7 = y3d.g;
                    long j8 = daq0.c;
                    pz40 pz40Var4 = s6t0.f31722a;
                    smk0 smk0Var4 = new smk0(s6t0.b().f33626a.getTextPrimary(), j8, null, null, null, null, null, j8, new j56(f), null, null, j7, k5q0Var, null, null, 17424);
                    h83Var5.c(strA3);
                    qadVar = new rad(kng0.c(h83Var5.f12607a, h83Var5, smk0Var4, 0), strB0, strB1);
                } else if (mcaVar instanceof hda) {
                    hda hdaVar = (hda) mcaVar;
                    String strB4 = CollectionsKt.b0(hdaVar.f12861a, Separators.SLASH, null, null, null, 62);
                    String strB5 = CollectionsKt.b0(hdaVar.b, Separators.SLASH, null, null, null, 62);
                    if (pz10Var != null) {
                        j83VarC = vzb.M(pz10Var);
                    } else {
                        h83 h83Var6 = new h83();
                        String strA4 = ctf0Var2.b.a(R.string.vs, Arrays.copyOf(new Object[0], 0));
                        long j9 = y3d.g;
                        long j10 = daq0.c;
                        pz40 pz40Var5 = s6t0.f31722a;
                        smk0 smk0Var5 = new smk0(s6t0.b().f33626a.getTextPrimary(), j10, null, null, null, null, null, j10, new j56(f), null, null, j9, k5q0Var, null, null, 17424);
                        h83Var6.c(strA4);
                        j83VarC = kng0.c(h83Var6.f12607a, h83Var6, smk0Var5, 0);
                    }
                    qadVar = new rad(j83VarC, strB4, strB5);
                } else {
                    if (!(mcaVar instanceof ida)) {
                        t9f.b();
                        return lz10Var;
                    }
                    qadVar = new qad(((ida) mcaVar).e);
                }
                return new dax(dadVar, qadVar);
            }

            /* JADX WARN: Code duplicated, block: B:140:0x0381  */
            /* JADX WARN: Code duplicated, block: B:70:0x01a8  */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                kc50 kc50Var;
                p700 p700Var;
                ena enaVar;
                uia uiaVar;
                String strA;
                String strC;
                String strC2;
                zvl0 zvl0Var;
                yja yjaVar;
                qal0 qal0Var;
                Object b0k0Var;
                i49 g49Var;
                dxh0 dxh0Var;
                hna hnaVar;
                lmo lmoVar;
                byte b2 = b;
                int i = 0;
                rjs rjsVar = this.b;
                switch (b2) {
                    case 0:
                        List list = (List) obj;
                        list.getClass();
                        boolean zBooleanValue = ((Boolean) ((fee) rjsVar.c.getValue()).c()).booleanValue();
                        boolean zBooleanValue2 = ((Boolean) ((fee) rjsVar.e.getValue()).c()).booleanValue();
                        boolean zBooleanValue3 = ((Boolean) ((fee) rjsVar.f.getValue()).c()).booleanValue();
                        tf50 tf50Var = (tf50) ((fee) rjsVar.d.getValue()).c();
                        tf50Var.getClass();
                        if (!list.contains(tf50Var)) {
                            tf50Var = tf50.f33851a;
                        }
                        boolean z = !zBooleanValue2;
                        kc50 kc50Var2 = new kc50(R.drawable.ic_glyph_rectangular_scoreboard, tf50Var == tf50.f33851a);
                        tf50 tf50Var2 = tf50.b;
                        kc50 kc50Var3 = list.contains(tf50Var2) ? new kc50(R.drawable.ic_glyph_rectangular_broadcast, tf50Var == tf50Var2) : null;
                        tf50 tf50Var3 = tf50.c;
                        if (list.contains(tf50Var3)) {
                            kc50Var = new kc50(R.drawable.ic_glyph_rectangular_statistic, tf50Var == tf50Var3);
                        } else {
                            kc50Var = null;
                        }
                        return new ojs(zBooleanValue, z, zBooleanValue, zBooleanValue3, new hjs(kc50Var2, kc50Var3, kc50Var, tf50Var));
                    case 1:
                        n0o0 n0o0Var = rjsVar.o;
                        gna gnaVar = (gna) obj;
                        if ((gnaVar instanceof ena ? (ena) gnaVar : null) == null || (p700Var = ((ena) gnaVar).l) == null) {
                            return null;
                        }
                        List list2 = p700Var.e;
                        List list3 = (List) ((fee) n0o0Var.getValue()).c();
                        ch00 ch00Var = ch00.LAST_GAMES;
                        boolean zContains = list3.contains(ch00Var);
                        List list4 = (List) ((fee) n0o0Var.getValue()).c();
                        ch00 ch00Var2 = ch00.LAST_GAMES_OPP_ONE;
                        boolean zContains2 = list4.contains(ch00Var2);
                        List list5 = (List) ((fee) n0o0Var.getValue()).c();
                        ch00 ch00Var3 = ch00.LAST_GAMES_OPP_TWO;
                        boolean zContains3 = list5.contains(ch00Var3);
                        ctf0 ctf0Var2 = rjsVar.f30611a;
                        ctf0Var2.getClass();
                        ArrayList arrayList = new ArrayList();
                        List list6 = p700Var.g;
                        List list7 = p700Var.f;
                        if (!list2.isEmpty()) {
                            arrayList.add(z1x.T(list2, ctf0Var2, ctf0Var2.b.a(R.string.previous_meetings, Arrays.copyOf(new Object[0], 0)), ch00Var, zContains));
                        }
                        if (!list7.isEmpty()) {
                            arrayList.add(z1x.T(list7, ctf0Var2, kng0.l(ctf0Var2.b.a(R.string.last_games, Arrays.copyOf(new Object[0], 0)), ": ", p700Var.c), ch00Var2, zContains2));
                        }
                        if (!list6.isEmpty()) {
                            arrayList.add(z1x.T(list6, ctf0Var2, kng0.l(ctf0Var2.b.a(R.string.last_games, Arrays.copyOf(new Object[0], 0)), ": ", p700Var.d), ch00Var3, zContains3));
                        }
                        return arrayList;
                    case 2:
                        gna gnaVar2 = (gna) obj;
                        if ((gnaVar2 instanceof ena ? (ena) gnaVar2 : null) == null || (uiaVar = (enaVar = (ena) gnaVar2).h) == null) {
                            return null;
                        }
                        ctf0 ctf0Var3 = rjsVar.f30611a;
                        boolean z2 = enaVar.p;
                        ctf0Var3.getClass();
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it = uiaVar.c.iterator();
                        int i2 = 0;
                        while (it.hasNext()) {
                            Object next = it.next();
                            int i3 = i2 + 1;
                            if (i2 < 0) {
                                q3d.p();
                                throw null;
                            }
                            bsw bswVar = (bsw) next;
                            String str = bswVar.b;
                            String str2 = bswVar.e;
                            String strA2 = (str.length() <= 0 || str2.length() <= 0) ? ctf0Var3.b.a(R.string.vs, Arrays.copyOf(new Object[0], 0)) : w6x.q(bswVar.b, " : ", str2);
                            odp0 odp0Var = new odp0(new d5a0(new c280(bswVar.c, R.drawable.ic_glyph_placeholder_player)));
                            String strM = dw9.m(i3, ". ", bswVar.f3153a);
                            odp0 odp0Var2 = new odp0(new d5a0(new c280(bswVar.f, R.drawable.ic_glyph_placeholder_player)));
                            String strM2 = dw9.m(i3, ". ", bswVar.d);
                            rdj rdjVar = rdj.f30294a;
                            arrayList2.add(new hzy(odp0Var, strM, odp0Var2, strM2, rdj.g(new znq0(bswVar.g), efj.UNIVERSAL, Boolean.valueOf(z2), false, 56), strA2, "", null, null));
                            it = it;
                            i2 = i3;
                        }
                        dja djaVar = dja.PENALTY;
                        return new eax(dyb.o0(arrayList2), uiaVar.f35722a, uiaVar.b);
                    case 3:
                        anq0 anq0Var2 = (anq0) obj;
                        if (anq0Var2 != null) {
                            boolean z3 = ((Boolean) ((fee) rjsVar.g.getValue()).c()).booleanValue() || ((Boolean) ((fee) rjsVar.h.getValue()).c()).booleanValue();
                            ctf0 ctf0Var4 = rjsVar.f30611a;
                            ctf0Var4.getClass();
                            long j = anq0Var2.e;
                            long j2 = anq0Var2.d;
                            boolean z4 = anq0Var2.j;
                            if (j != 0 || !z4) {
                                String str3 = anq0Var2.c;
                                if (z4) {
                                    if (str3.length() > 0) {
                                        strA = ctf0Var4.b.a(R.string.live_additional_min_v2, Arrays.copyOf(new Object[]{str3}, 1));
                                    } else if (anq0Var2.f1167a) {
                                        strA = "";
                                    } else {
                                        strA = anq0Var2.b ? ctf0Var4.b.a(R.string.line_live_time_period_back_v2, Arrays.copyOf(new Object[]{""}, 1)) : ctf0Var4.b.a(R.string.line_live_time_period_capitalized_v2, Arrays.copyOf(new Object[]{""}, 1));
                                    }
                                } else if (j2 < 0) {
                                    strA = ctf0Var4.b.a(R.string.game_started, Arrays.copyOf(new Object[0], 0));
                                } else {
                                    long j3 = j2 / 86400;
                                    strA = j3 > 0 ? ctf0Var4.b.a(R.string.line_time_before_v2, Arrays.copyOf(new Object[]{String.valueOf(j3)}, 1)) : ctf0Var4.b.a(R.string.before_start, Arrays.copyOf(new Object[0], 0));
                                }
                                String strC3 = (z3 || z4 || j2 < 0) ? null : n2x.C((((j2 < 0 ? 0L : j2) / 60) / 60) % 24);
                                if (z3) {
                                    strC = null;
                                } else {
                                    long jB = (z4 ? vzb.V(anq0Var2).b() : j2 < 0 ? 0L : j2) / 60;
                                    if (!z4) {
                                        jB %= 60;
                                    }
                                    strC = n2x.C(jB);
                                }
                                if (z3) {
                                    strC2 = null;
                                } else {
                                    strC2 = n2x.C((z4 ? vzb.V(anq0Var2).b() : j2 >= 0 ? j2 : 0L) % 60);
                                }
                                return new jg30(strA, strC3, strC, strC2);
                            }
                        }
                        return null;
                    case 4:
                        gna gnaVar3 = (gna) obj;
                        ena enaVar2 = gnaVar3 instanceof ena ? (ena) gnaVar3 : null;
                        if (enaVar2 == null || (zvl0Var = ((ena) gnaVar3).k) == null) {
                            return null;
                        }
                        String str4 = zvl0Var.m;
                        String str5 = enaVar2.q;
                        ctf0 ctf0Var5 = rjsVar.f30611a;
                        m1v0 m1v0Var = (m1v0) ((fee) rjsVar.J.getValue()).b();
                        str5.getClass();
                        ctf0Var5.getClass();
                        String str6 = zvl0Var.f45064a;
                        Pair pair = str4.length() > 0 ? new Pair(str4, ctf0Var5.b.a(R.string.web_site, Arrays.copyOf(new Object[0], 0))) : new Pair(null, null);
                        String str7 = (String) pair.f46059a;
                        String str8 = (String) pair.b;
                        dja djaVar2 = dja.PENALTY;
                        String str9 = zvl0Var.b;
                        ArrayList arrayList3 = new ArrayList();
                        String str10 = zvl0Var.l;
                        String str11 = zvl0Var.k;
                        String str12 = zvl0Var.j;
                        String str13 = zvl0Var.i;
                        String str14 = zvl0Var.h;
                        String str15 = zvl0Var.g;
                        String str16 = zvl0Var.f;
                        String str17 = zvl0Var.e;
                        String str18 = zvl0Var.d;
                        String str19 = zvl0Var.c;
                        if (str6.length() > 0) {
                            arrayList3.add(l7x.J(ctf0Var5, str6, R.string.address));
                        }
                        if (str19.length() > 0) {
                            arrayList3.add(l7x.J(ctf0Var5, str19, R.string.capacity));
                        }
                        if (str18.length() > 0) {
                            arrayList3.add(l7x.J(ctf0Var5, str18, R.string.covering));
                        }
                        if (str17.length() > 0) {
                            arrayList3.add(l7x.J(ctf0Var5, str17, R.string.city_name));
                        }
                        if (str16.length() > 0) {
                            arrayList3.add(l7x.J(ctf0Var5, str16, R.string.architect));
                        }
                        if (str15.length() > 0) {
                            arrayList3.add(l7x.J(ctf0Var5, str15, R.string.old_name));
                        }
                        if (str14.length() > 0) {
                            arrayList3.add(l7x.J(ctf0Var5, str14, R.string.category));
                        }
                        if (str13.length() > 0) {
                            arrayList3.add(l7x.J(ctf0Var5, str13, R.string.history));
                        }
                        if (str12.length() > 0) {
                            arrayList3.add(l7x.J(ctf0Var5, str12, R.string.opened));
                        }
                        if (str11.length() > 0) {
                            arrayList3.add(l7x.J(ctf0Var5, str11, R.string.zip_code));
                        }
                        if (str10.length() > 0) {
                            arrayList3.add(l7x.J(ctf0Var5, "\u2066" + str10 + "\u2069", R.string.phone));
                        }
                        a4x a4xVarO0 = dyb.o0(arrayList3);
                        List list8 = zvl0Var.n;
                        ArrayList arrayList4 = new ArrayList(r3d.q(list8, 10));
                        Iterator it2 = list8.iterator();
                        while (it2.hasNext()) {
                            arrayList4.add(String.format(Locale.ENGLISH, "%s/sfiles/stadium/%s", Arrays.copyOf(new Object[]{str5, (String) it2.next()}, 2)));
                        }
                        a4x a4xVarO1 = dyb.o0(arrayList4);
                        if (a4xVarO1.isEmpty()) {
                            a4xVarO1 = dyb.g0("");
                        }
                        return new iax(m1v0Var, str9, a4xVarO0, str7, str8, a4xVarO1);
                    case 5:
                        gna gnaVar4 = (gna) obj;
                        if ((gnaVar4 instanceof ena ? (ena) gnaVar4 : null) != null && (yjaVar = ((ena) gnaVar4).i) != null) {
                            List list9 = yjaVar.f42730a;
                            if (!list9.isEmpty()) {
                                long jLongValue = ((Number) ((fee) rjsVar.m.getValue()).c()).longValue();
                                lc00 lc00VarB = kotlin.collections.a.b();
                                Iterator it3 = list9.iterator();
                                while (it3.hasNext()) {
                                    he30 he30Var = (he30) it3.next();
                                    List list10 = he30Var.b;
                                    ArrayList arrayList5 = new ArrayList();
                                    for (Object obj2 : list10) {
                                        if (((ge30) obj2).e.length() > 0) {
                                            arrayList5.add(obj2);
                                        }
                                    }
                                    if (!arrayList5.isEmpty()) {
                                        lc00VarB.add(new uim(he30Var.f12902a));
                                        int i4 = i;
                                        for (Object obj3 : arrayList5) {
                                            int i5 = i4 + 1;
                                            if (i4 < 0) {
                                                q3d.p();
                                                throw null;
                                            }
                                            ge30 ge30Var = (ge30) obj3;
                                            String str20 = ge30Var.f11132a;
                                            String str21 = ge30Var.e;
                                            String str22 = ge30Var.c;
                                            String str23 = ge30Var.d;
                                            tho thoVar = ge30Var.b;
                                            Iterator it4 = it3;
                                            List listSplit$default = StringsKt__StringsKt.split$default(str20, new String[]{"+"}, false, i, 6, null);
                                            long j4 = jLongValue;
                                            List listSplit$default2 = StringsKt__StringsKt.split$default(str20, new String[]{Separators.COLON}, false, i, 6, null);
                                            if (j4 == 1) {
                                                if (listSplit$default.size() == 2 && listSplit$default2.size() == 1) {
                                                    str20 = listSplit$default.get(0) + "'+" + kotlin.text.c.r((String) listSplit$default.get(1), Separators.QUOTE, "", false);
                                                } else if (listSplit$default2.size() == 2) {
                                                    str20 = listSplit$default2.get(0) + Separators.QUOTE;
                                                }
                                            }
                                            y6n y6nVar = ge30Var.j == 0 ? y6n.f42107a : y6n.b;
                                            ggm ggmVar = i4 == 0 ? arrayList5.size() + (-1) == 0 ? ggm.c : ggm.f11256a : i4 == arrayList5.size() + (-1) ? ggm.b : ggm.d;
                                            lc00VarB.add((str23.length() == 0 && str22.length() == 0) ? new sim(str20, str21, thoVar.name(), y6nVar, ggmVar, ge30Var.b()) : new rim(str20, str21, new lnm(str23, str22, 0, "", new s0m("", ""), ge30Var.k), ge30Var.a() ? new lnm(ge30Var.h, ge30Var.g, 0, "", new s0m("", ""), ge30Var.l) : null, thoVar.name(), null, y6nVar, ggmVar, ge30Var.b()));
                                            it3 = it4;
                                            i4 = i5;
                                            jLongValue = j4;
                                            i = 0;
                                        }
                                    }
                                    it3 = it3;
                                    jLongValue = jLongValue;
                                    i = 0;
                                }
                                i4 i4VarR0 = dyb.r0(kotlin.collections.a.a(lc00VarB));
                                dja djaVar3 = dja.PENALTY;
                                return new gax(new sf30(i4VarR0));
                            }
                        }
                        return null;
                    case 6:
                        vzj0 vzj0Var = (vzj0) obj;
                        if (!(((fee) rjsVar.B.getValue()).b() instanceof qrr) && vzj0Var != null) {
                            anq0 anq0Var3 = (anq0) ((fee) rjsVar.H.getValue()).c();
                            ctf0 ctf0Var6 = rjsVar.f30611a;
                            ctf0Var6.getClass();
                            znq0 znq0Var = anq0Var3 != null ? anq0Var3.h : null;
                            if (znq0Var != null) {
                                long j5 = znq0Var.f44687a;
                                if (j5 <= 0) {
                                    qal0Var = null;
                                } else {
                                    long j6 = j5 / 86400;
                                    qal0Var = new qal0(j6 > 0 ? ctf0Var6.b.a(R.string.line_time_before_v2, Arrays.copyOf(new Object[]{String.valueOf(j6)}, 1)) : ctf0Var6.b.a(R.string.before_start, Arrays.copyOf(new Object[0], 0)), yyw.L((((j5 < 0 ? 0L : j5) / 60) / 60) % 24), yyw.L(((j5 < 0 ? 0L : j5) / 60) % 60), yyw.L((j5 >= 0 ? j5 : 0L) % 60));
                                }
                            } else {
                                qal0Var = null;
                            }
                            if (vzj0Var instanceof tzj0) {
                                tzj0 tzj0Var = (tzj0) vzj0Var;
                                b0k0Var = new yzj0(tzj0Var.f34807a, tzj0Var.b, tzj0Var.c, tzj0Var.d, qal0Var);
                            } else if (vzj0Var instanceof uzj0) {
                                uzj0 uzj0Var = (uzj0) vzj0Var;
                                b0k0Var = new b0k0(uzj0Var.f36538a, uzj0Var.b, uzj0Var.c, uzj0Var.d, qal0Var);
                            } else {
                                t9f.b();
                            }
                            return b0k0Var;
                        }
                        return null;
                    case 7:
                        boolean zBooleanValue4 = ((Boolean) obj).booleanValue();
                        long jLongValue2 = ((Number) ((fee) rjsVar.j.getValue()).c()).longValue();
                        boolean zBooleanValue5 = ((Boolean) ((fee) rjsVar.i.getValue()).c()).booleanValue();
                        long jLongValue3 = ((Number) ((fee) rjsVar.k.getValue()).c()).longValue();
                        long jLongValue4 = ((Number) ((fee) rjsVar.m.getValue()).c()).longValue();
                        Long l = (Long) ((fee) rjsVar.l.getValue()).c();
                        long jLongValue5 = l != null ? l.longValue() : -1L;
                        if (zBooleanValue4) {
                            return new sym0(new MarketsCategoriesParams(jLongValue2, jLongValue3, jLongValue4, new zq2(), "", zBooleanValue5));
                        }
                        tef0 tef0Var = tef0.f33818a;
                        xuz xuzVar = pb10.c;
                        return new vym0(new RelatedParams(zBooleanValue5, jLongValue2, jLongValue4, -1L, jLongValue5, tef0Var));
                    case 8:
                        return a(obj);
                    case 9:
                        fsr fsrVar = (fsr) obj;
                        if ((fsrVar == null || !fsrVar.b) && (fsrVar == null || !fsrVar.c)) {
                            return k49.f17656a;
                        }
                        o49 o49Var = (o49) ((fee) rjsVar.y.getValue()).c();
                        ctf0 ctf0Var7 = rjsVar.f30611a;
                        zvh0 zvh0Var2 = rjsVar.b;
                        fsrVar.getClass();
                        ctf0Var7.getClass();
                        ArrayList arrayList6 = new ArrayList();
                        if (fsrVar.b) {
                            arrayList6.add(new g49(ctf0Var7.b.a(R.string.video, Arrays.copyOf(new Object[0], 0))));
                        }
                        if (fsrVar.c) {
                            arrayList6.add(new h49(ctf0Var7.b.a(R.string.play_zone, Arrays.copyOf(new Object[0], 0))));
                        }
                        if (o49Var == null) {
                            g49Var = (i49) CollectionsKt.U(arrayList6);
                        } else {
                            int iOrdinal = o49Var.ordinal();
                            if (iOrdinal == 0) {
                                g49Var = new g49(ctf0Var7.b.a(R.string.video, Arrays.copyOf(new Object[0], 0)));
                            } else {
                                if (iOrdinal != 1) {
                                    t9f.b();
                                    return null;
                                }
                                g49Var = new h49(ctf0Var7.b.a(R.string.play_zone, Arrays.copyOf(new Object[0], 0)));
                            }
                            if (arrayList6.isEmpty()) {
                                g49Var = null;
                            } else {
                                Iterator it5 = arrayList6.iterator();
                                do {
                                    if (!it5.hasNext()) {
                                        g49Var = null;
                                    }
                                } while (!Intrinsics.d((i49) it5.next(), g49Var));
                            }
                            if (g49Var == null) {
                                g49Var = (i49) CollectionsKt.U(arrayList6);
                            }
                        }
                        bfu0 bfu0Var = fsrVar.f10077a;
                        GameBroadcastingParams gameBroadcastingParams = new GameBroadcastingParams(bfu0Var.f2522a, bfu0Var.c, bfu0Var.f, bfu0Var.b, bfu0Var.e, bfu0Var.d, bfu0Var.g, null);
                        Iterator it6 = arrayList6.iterator();
                        int i6 = 0;
                        while (true) {
                            if (!it6.hasNext()) {
                                i6 = -1;
                            } else if (!Intrinsics.d((i49) it6.next(), g49Var)) {
                                i6++;
                            }
                        }
                        int i7 = i6;
                        i4 i4VarR1 = dyb.r0(arrayList6);
                        boolean z5 = arrayList6.size() > 1;
                        int iOrdinal2 = zvh0Var2.ordinal();
                        if (iOrdinal2 == 0) {
                            dxh0Var = axh0.f1625a;
                        } else if (iOrdinal2 == 1) {
                            dxh0Var = zwh0.f45106a;
                        } else if (iOrdinal2 == 2) {
                            dxh0Var = cxh0.f5122a;
                        } else {
                            if (iOrdinal2 != 3) {
                                t9f.b();
                                return null;
                            }
                            dxh0Var = bxh0.f3376a;
                        }
                        dxh0 dxh0Var2 = dxh0Var;
                        ArrayList arrayList7 = new ArrayList(r3d.q(arrayList6, 10));
                        Iterator it7 = arrayList6.iterator();
                        while (it7.hasNext()) {
                            arrayList7.add(new yvh0(((i49) it7.next()).getDescription(), bwh0.f3325a));
                        }
                        return new j49(gameBroadcastingParams, i7, g49Var, i4VarR1, z5, dxh0Var2, dyb.r0(arrayList7));
                    case 10:
                        return b(obj);
                    default:
                        gna gnaVar5 = (gna) obj;
                        if ((gnaVar5 instanceof ena ? (ena) gnaVar5 : null) == null || (hnaVar = ((ena) gnaVar5).j) == null) {
                            return null;
                        }
                        boolean zContains4 = ((List) ((fee) rjsVar.o.getValue()).c()).contains(ch00.SHORT_STATISTIC);
                        ctf0 ctf0Var8 = rjsVar.f30611a;
                        ctf0Var8.getClass();
                        List<vrj0> list11 = hnaVar.f;
                        ArrayList arrayList8 = new ArrayList(r3d.q(list11, 10));
                        for (vrj0 vrj0Var : list11) {
                            float fS = r7x.s(vrj0Var.b);
                            float fS2 = r7x.s(vrj0Var.c);
                            String str24 = vrj0Var.f37902a;
                            String str25 = vrj0Var.b;
                            String str26 = vrj0Var.c;
                            if (fS == 0.0f && fS2 == 0.0f) {
                                fS = 0.0f;
                            }
                            arrayList8.add(new srj0(fS, (fS == 0.0f && fS2 == 0.0f) ? 0.0f : fS2, str24, str25, str26));
                        }
                        dja djaVar4 = dja.PENALTY;
                        ch00 ch00Var4 = ch00.SHORT_STATISTIC;
                        i4 i4VarR2 = zContains4 ? dyb.r0(arrayList8) : dyb.r0(CollectionsKt.D0(arrayList8, 3));
                        if (arrayList8.size() - 1 > 3) {
                            lsm0 lsm0Var = ctf0Var8.b;
                            lmoVar = new lmo(lsm0Var.a(R.string.expand, Arrays.copyOf(new Object[0], 0)), lsm0Var.a(R.string.collapse, Arrays.copyOf(new Object[0], 0)), zContains4);
                        } else {
                            lmoVar = null;
                        }
                        return new hax(i4VarR2, lmoVar);
                }
            }
        }, (byte) 20));
        final byte b2 = 7;
        this.A = maz.b(new yw9(Boolean.valueOf(njsVar.I), new Function1(this) { // from class: a.qjs
            public final /* synthetic */ rjs b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:260:0x08d4  */
            /* JADX WARN: Code duplicated, block: B:262:0x08e4  */
            /* JADX WARN: Code duplicated, block: B:265:0x090f  */
            /* JADX WARN: Code duplicated, block: B:268:0x0932  */
            /* JADX WARN: Code duplicated, block: B:270:0x0936  */
            /* JADX WARN: Code duplicated, block: B:272:0x094e  */
            private final Object a(Object obj) {
                n0o0 n0o0Var;
                n0o0 n0o0Var2;
                String str;
                String str2;
                mqr kqrVar;
                String strG;
                d3h0 pekVar;
                String strN;
                d3h0 xakVar;
                Integer num;
                String strN2;
                int i;
                iul0 iul0Var;
                yd90 yd90Var;
                yd90 yd90Var2;
                iul0 iul0Var2;
                String str3;
                String str4;
                d3h0 bekVar;
                String strA;
                String strB;
                String strN3;
                rjs rjsVar = this.b;
                n0o0 n0o0Var3 = rjsVar.v;
                n0o0 n0o0Var4 = rjsVar.m;
                n0o0 n0o0Var5 = rjsVar.H;
                n0o0 n0o0Var6 = rjsVar.I;
                ctf0 ctf0Var2 = rjsVar.f30611a;
                gna gnaVar = (gna) obj;
                if (gnaVar != null) {
                    if (!(gnaVar instanceof ena)) {
                        if (gnaVar instanceof fna) {
                            ctf0Var2.getClass();
                            return new orr(d9x.L(((fna) gnaVar).f9825a, ctf0Var2));
                        }
                        t9f.b();
                        return null;
                    }
                    ena enaVar = (ena) gnaVar;
                    mca mcaVar = enaVar.f8084a;
                    List list = (List) ((fee) rjsVar.n.getValue()).c();
                    boolean zBooleanValue = ((Boolean) ((fee) rjsVar.e.getValue()).c()).booleanValue();
                    mpm mpmVar = (mpm) ((fee) n0o0Var6.getValue()).b();
                    boolean z = enaVar.p;
                    String str5 = (String) ((fee) rjsVar.p.getValue()).c();
                    String str6 = (String) ((fee) rjsVar.q.getValue()).c();
                    String str7 = (String) ((fee) rjsVar.r.getValue()).c();
                    String str8 = (String) ((fee) rjsVar.s.getValue()).c();
                    jg30 jg30Var = (jg30) ((fee) n0o0Var5.getValue()).b();
                    bg30 bg30Var = (bg30) ((fee) n0o0Var6.getValue()).c();
                    znq0 znq0Var = (znq0) ((fee) rjsVar.t.getValue()).c();
                    bha bhaVar = enaVar.o;
                    ui9 ui9Var = (ui9) ((fee) rjsVar.u.getValue()).c();
                    long jLongValue = ((Number) ((fee) n0o0Var4.getValue()).c()).longValue();
                    boolean zBooleanValue2 = ((Boolean) ((fee) n0o0Var3.getValue()).c()).booleanValue();
                    ctf0Var2.getClass();
                    if (ui9Var != null) {
                        int i2 = ui9Var.c;
                        int i3 = ui9Var.d;
                        n0o0Var = n0o0Var4;
                        String strN4 = (cy7.c() && zBooleanValue2) ? w6x.n(i3, i2, " : ") : w6x.n(i2, i3, " : ");
                        String strX = j0x.x(jLongValue, ctf0Var2);
                        ArrayList arrayList = ui9Var.f35720a;
                        n0o0Var2 = n0o0Var5;
                        str = str5;
                        str2 = str6;
                        ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
                        int i4 = 0;
                        for (Object obj2 : arrayList) {
                            int i5 = i4 + 1;
                            if (i4 < 0) {
                                q3d.p();
                                throw null;
                            }
                            arrayList2.add(piz.W((sc90) obj2, jLongValue, i4));
                            i4 = i5;
                        }
                        i4 i4VarR0 = dyb.r0(arrayList2);
                        ArrayList arrayList3 = ui9Var.b;
                        ArrayList arrayList4 = new ArrayList(r3d.q(arrayList3, 10));
                        int i6 = 0;
                        for (Object obj3 : arrayList3) {
                            int i7 = i6 + 1;
                            if (i6 < 0) {
                                q3d.p();
                                throw null;
                            }
                            arrayList4.add(piz.W((sc90) obj3, jLongValue, i6));
                            i6 = i7;
                        }
                        kqrVar = new iqr(strN4, strX, i4VarR0, dyb.r0(arrayList4));
                    } else {
                        n0o0Var = n0o0Var4;
                        n0o0Var2 = n0o0Var5;
                        str = str5;
                        str2 = str6;
                        if (bhaVar != null) {
                            float f = bhaVar.d;
                            float f2 = bhaVar.e;
                            float f3 = bhaVar.f;
                            Object[] objArr = {Float.valueOf(f3)};
                            lsm0 lsm0Var = ctf0Var2.b;
                            String strA2 = lsm0Var.a(R.string.n_percents, Arrays.copyOf(objArr, 1));
                            k3w0 g3w0Var = (f3 <= f2 || f3 <= f) ? new g3w0(strA2) : new i3w0(strA2);
                            String strA3 = lsm0Var.a(R.string.n_percents, Arrays.copyOf(new Object[]{Float.valueOf(f2)}, 1));
                            k3w0 g3w0Var2 = (f2 <= f3 || f2 <= f) ? new g3w0(strA3) : new i3w0(strA3);
                            String strA4 = lsm0Var.a(R.string.n_percents, Arrays.copyOf(new Object[]{Float.valueOf(f)}, 1));
                            kqrVar = new kqr(g3w0Var, g3w0Var2, (f <= f3 || f <= f2) ? new g3w0(strA4) : new i3w0(strA4));
                        } else {
                            kqrVar = null;
                        }
                    }
                    anq0 anq0Var2 = (anq0) ((fee) n0o0Var2.getValue()).c();
                    boolean z2 = anq0Var2 != null ? anq0Var2.f1167a : false;
                    long jLongValue2 = ((Number) ((fee) n0o0Var.getValue()).c()).longValue();
                    boolean zBooleanValue3 = ((Boolean) ((fee) n0o0Var3.getValue()).c()).booleanValue();
                    list.getClass();
                    mpmVar.getClass();
                    String strA5 = "";
                    if (mcaVar instanceof pca) {
                        pca pcaVar = (pca) mcaVar;
                        uqr uqrVarR0 = pzb.r0(mcaVar, str, str2, str7, str8, jg30Var);
                        if (bg30Var == null || (bekVar = bg30Var.b) == null) {
                            bekVar = bg30Var != null ? bg30Var.f2536a : new bek();
                        }
                        d3h0 d3h0Var = bekVar;
                        boolean z3 = d3h0Var instanceof lz10;
                        lz10 lz10Var = z3 ? (lz10) d3h0Var : null;
                        if (lz10Var != null) {
                            strA = vzb.T(lz10Var, zBooleanValue3);
                        } else {
                            hzm0 hzm0Var = d3h0Var instanceof hzm0 ? (hzm0) d3h0Var : null;
                            if (hzm0Var != null) {
                                String str9 = hzm0Var.g;
                                String str10 = hzm0Var.i;
                                StringBuilder sb = new StringBuilder("\u2066");
                                if (cy7.c() && zBooleanValue3) {
                                    if (str10 != null) {
                                        hne.B(sb, "(ov ", str10, Separators.RPAREN);
                                    }
                                    sb.append(vzb.i0(str9));
                                } else {
                                    sb.append(str9);
                                    if (str10 != null) {
                                        hne.B(sb, Separators.LPAREN, str10, " ov)");
                                    }
                                }
                                sb.append("\u2069");
                                strA = sb.toString();
                            } else {
                                strA = d3h0Var.a();
                            }
                        }
                        String str11 = strA;
                        lz10 lz10Var2 = z3 ? (lz10) d3h0Var : null;
                        if (lz10Var2 != null) {
                            strB = vzb.U(lz10Var2, zBooleanValue3);
                        } else {
                            hzm0 hzm0Var2 = d3h0Var instanceof hzm0 ? (hzm0) d3h0Var : null;
                            if (hzm0Var2 != null) {
                                String str12 = hzm0Var2.h;
                                String str13 = hzm0Var2.j;
                                StringBuilder sb2 = new StringBuilder("\u2066");
                                if (cy7.c() && zBooleanValue3) {
                                    if (str13 != null) {
                                        hne.B(sb2, "(ov ", str13, Separators.RPAREN);
                                    }
                                    sb2.append(vzb.i0(str12));
                                } else {
                                    sb2.append(str12);
                                    if (str13 != null) {
                                        hne.B(sb2, Separators.LPAREN, str13, " ov)");
                                    }
                                }
                                sb2.append("\u2069");
                                strB = sb2.toString();
                            } else {
                                strB = d3h0Var.b();
                            }
                        }
                        String str14 = strB;
                        boolean z4 = pcaVar.d;
                        rpp0 rpp0Var = pcaVar.f26749a;
                        j83 j83VarH = vzb.H(ctf0Var2, d3h0Var, pcaVar.e, pcaVar.f, pcaVar.g, (bg30Var == null || (strN3 = bg30Var.f2536a.n()) == null) ? "" : strN3, z4, zBooleanValue3);
                        String strB2 = rpp0Var.b();
                        c280 c280Var = new c280(vsm0.s(rpp0Var.a(), pcaVar.b), R.drawable.ic_glyph_placeholder_player);
                        long jA = rpp0Var.a();
                        bap bapVar = bap.b;
                        jdp0 jdp0Var = new jdp0(strB2, n6x.o0(c280Var, jA, list, zBooleanValue, bapVar), null);
                        jdp0 jdp0Var2 = new jdp0(rpp0Var.d(), n6x.o0(new c280(vsm0.s(rpp0Var.c(), pcaVar.c), R.drawable.ic_glyph_placeholder_player), rpp0Var.c(), list, zBooleanValue, bapVar), null);
                        lz10 lz10Var3 = z3 ? (lz10) d3h0Var : null;
                        return new mrr(uqrVarR0, jdp0Var, jdp0Var2, j83VarH, lz10Var3 != null ? vzb.G(lz10Var3.i) : eex.c, str11, d3h0Var.j(), str14, d3h0Var.i());
                    }
                    boolean z5 = z2;
                    String str15 = str;
                    String str16 = str2;
                    boolean z6 = mcaVar instanceof tca;
                    qpm qpmVar = qpm.f29126a;
                    if (z6) {
                        tca tcaVar = (tca) mcaVar;
                        uqr uqrVarR1 = pzb.r0(mcaVar, str15, str16, str7, str8, jg30Var);
                        znq0 znq0Var2 = new znq0(znq0Var != null ? znq0Var.f44687a : 0L);
                        rpp0 rpp0Var2 = tcaVar.f33711a;
                        boolean z7 = tcaVar.i;
                        if (rpp0Var2 instanceof qpp0) {
                            qpp0 qpp0Var = (qpp0) rpp0Var2;
                            jdp0 jdp0Var3 = new jdp0(qpp0Var.g, n6x.o0(u1c.C(tcaVar, true), qpp0Var.e, list, zBooleanValue || z7, bap.b), null);
                            jdp0 jdp0Var4 = new jdp0(qpp0Var.h, n6x.o0(u1c.C(tcaVar, false), qpp0Var.f, list, zBooleanValue || z7, bap.f2271a), null);
                            lpm lpmVar = new lpm(qpmVar, new hpm(0L, 3));
                            dpi0 dpi0Var = new dpi0((byte) 15);
                            rdj rdjVar = rdj.f30294a;
                            vzb.E(dpi0Var, rdj.g(znq0Var2, efj.UNIVERSAL, Boolean.valueOf(z), false, 56));
                            return new trr(uqrVarR1, jdp0Var3, jdp0Var4, lpmVar, ((h83) dpi0Var.f6468a).h(), kqrVar);
                        }
                        if (!(rpp0Var2 instanceof ppp0)) {
                            t9f.b();
                            return null;
                        }
                        ppp0 ppp0Var = (ppp0) rpp0Var2;
                        xcp0 xcp0VarC0 = b8k0.c0(ppp0Var.e, ppp0Var.g, tcaVar.b);
                        xcp0 xcp0VarC1 = b8k0.c0(ppp0Var.f, ppp0Var.h, tcaVar.c);
                        lpm lpmVar2 = new lpm(qpmVar, new hpm(0L, 3));
                        dpi0 dpi0Var2 = new dpi0((byte) 15);
                        rdj rdjVar2 = rdj.f30294a;
                        vzb.E(dpi0Var2, rdj.g(znq0Var2, efj.UNIVERSAL, Boolean.valueOf(z), false, 56));
                        return new trr(uqrVarR1, xcp0VarC0, xcp0VarC1, lpmVar2, ((h83) dpi0Var2.f6468a).h(), kqrVar);
                    }
                    if (!(mcaVar instanceof xca)) {
                        if (mcaVar instanceof gda) {
                            gda gdaVar = (gda) mcaVar;
                            uqr uqrVarR2 = pzb.r0(mcaVar, str15, str16, str7, str8, jg30Var);
                            znq0 znq0Var3 = new znq0(znq0Var != null ? znq0Var.f44687a : 0L);
                            String strB0 = CollectionsKt.b0(gdaVar.f11094a, Separators.SLASH, null, null, null, 62);
                            String strB1 = CollectionsKt.b0(gdaVar.b, Separators.SLASH, null, null, null, 62);
                            lpm lpmVar3 = new lpm(qpmVar, new hpm(0L, 3));
                            dpi0 dpi0Var3 = new dpi0((byte) 15);
                            rdj rdjVar3 = rdj.f30294a;
                            vzb.E(dpi0Var3, rdj.g(znq0Var3, efj.UNIVERSAL, Boolean.valueOf(z), false, 56));
                            return new rrr(uqrVarR2, strB0, strB1, lpmVar3, ((h83) dpi0Var3.f6468a).h());
                        }
                        if (mcaVar instanceof hda) {
                            hda hdaVar = (hda) mcaVar;
                            uqr uqrVarR3 = pzb.r0(mcaVar, str15, str16, str7, str8, jg30Var);
                            if (bg30Var == null || (pekVar = bg30Var.b) == null) {
                                pekVar = bg30Var != null ? bg30Var.f2536a : new pek();
                            }
                            return new rrr(uqrVarR3, CollectionsKt.b0(hdaVar.f12861a, Separators.SLASH, null, null, null, 62), CollectionsKt.b0(hdaVar.b, Separators.SLASH, null, null, null, 62), mpmVar, vzb.H(ctf0Var2, pekVar, hdaVar.h, hdaVar.i, hdaVar.j, (bg30Var == null || (strN = bg30Var.f2536a.n()) == null) ? "" : strN, hdaVar.g, zBooleanValue3));
                        }
                        if (!(mcaVar instanceof ida)) {
                            t9f.b();
                            return null;
                        }
                        ida idaVar = (ida) mcaVar;
                        uqr uqrVarR4 = pzb.r0(mcaVar, str15, str16, str7, str8, jg30Var);
                        if (!idaVar.g) {
                            if (znq0Var != null) {
                                rdj rdjVar4 = rdj.f30294a;
                                strG = rdj.g(znq0Var, efj.UNIVERSAL, Boolean.valueOf(z), false, 56);
                                if (strG == null) {
                                }
                            }
                            dpi0 dpi0Var5 = new dpi0((byte) 15);
                            vzb.E(dpi0Var5, strG);
                            return new vrr(uqrVarR4, idaVar.e, ((h83) dpi0Var5.f6468a).h());
                        }
                        strA5 = ctf0Var2.b.a(R.string.game_end, Arrays.copyOf(new Object[0], 0));
                        strG = strA5;
                        dpi0 dpi0Var6 = new dpi0((byte) 15);
                        vzb.E(dpi0Var6, strG);
                        return new vrr(uqrVarR4, idaVar.e, ((h83) dpi0Var6.f6468a).h());
                    }
                    if (!gql0.d().contains(Long.valueOf(jLongValue2))) {
                        xca xcaVar = (xca) mcaVar;
                        uqr uqrVarR5 = pzb.r0(mcaVar, str15, str16, str7, str8, jg30Var);
                        if (bg30Var == null || (xakVar = bg30Var.b) == null) {
                            xakVar = bg30Var != null ? bg30Var.f2536a : new xak((byte) 22);
                        }
                        boolean z8 = xcaVar.l;
                        boolean z9 = xcaVar.q;
                        rpp0 rpp0Var3 = xcaVar.f40636a;
                        j83 j83VarH2 = vzb.H(ctf0Var2, xakVar, xcaVar.n, xcaVar.o, xcaVar.p, (bg30Var == null || (strN2 = bg30Var.f2536a.n()) == null) ? "" : strN2, z8, zBooleanValue3);
                        if (!(rpp0Var3 instanceof qpp0)) {
                            if (rpp0Var3 instanceof ppp0) {
                                ppp0 ppp0Var2 = (ppp0) rpp0Var3;
                                return new trr(uqrVarR5, b8k0.c0(ppp0Var2.e, ppp0Var2.g, xcaVar.h), b8k0.c0(ppp0Var2.f, ppp0Var2.h, xcaVar.i), mpmVar, j83VarH2, kqrVar);
                            }
                            t9f.b();
                            return null;
                        }
                        int i8 = xcaVar.b;
                        int i9 = xcaVar.g;
                        int i10 = xcaVar.f;
                        int i11 = xcaVar.d;
                        int i12 = xcaVar.c;
                        vy vyVar = (i8 == 0 && i12 == 0 && i11 == 0) ? null : new vy(i8 > 0 ? Integer.valueOf(i8) : null, i12 > 0 ? Integer.valueOf(i12) : null, i11 > 0 ? Integer.valueOf(i11) : null);
                        int i13 = xcaVar.e;
                        vy vyVar2 = (i13 == 0 && i10 == 0 && i9 == 0) ? null : new vy(i13 > 0 ? Integer.valueOf(i13) : null, i10 > 0 ? Integer.valueOf(i10) : null, i9 > 0 ? Integer.valueOf(i9) : null);
                        boolean z10 = (vyVar == null && vyVar2 == null) ? false : true;
                        if (z10 && vyVar == null) {
                            num = null;
                            vyVar = new vy(null, null, null);
                        } else {
                            num = null;
                        }
                        if (z10 && vyVar2 == null) {
                            vyVar2 = new vy(num, num, num);
                        }
                        qpp0 qpp0Var2 = (qpp0) rpp0Var3;
                        return new trr(uqrVarR5, new jdp0(qpp0Var2.g, n6x.o0(u1c.D(xcaVar, true), qpp0Var2.e, list, zBooleanValue || z9, bap.b), vyVar), new jdp0(qpp0Var2.h, n6x.o0(u1c.D(xcaVar, false), qpp0Var2.f, list, zBooleanValue || z9, bap.f2271a), vyVar2), mpmVar, j83VarH2, kqrVar);
                    }
                    xca xcaVar2 = (xca) mcaVar;
                    long j = znq0Var != null ? znq0Var.f44687a : 0L;
                    uqr uqrVarR6 = pzb.r0(mcaVar, str15, str16, str7, str8, jg30Var);
                    znq0 znq0Var4 = new znq0(j);
                    pz10 pz10Var = bg30Var != null ? bg30Var.f2536a : null;
                    if (pz10Var instanceof nz10) {
                        izm0 izm0Var = bg30Var.b;
                        String str17 = xcaVar2.s;
                        List list2 = xcaVar2.i;
                        List list3 = xcaVar2.h;
                        rpp0 rpp0Var4 = xcaVar2.f40636a;
                        boolean z11 = xcaVar2.l;
                        String str18 = xcaVar2.p;
                        rdj rdjVar5 = rdj.f30294a;
                        pz10 pz10Var2 = pz10Var;
                        String strG2 = rdj.g(znq0Var4, efj.UNIVERSAL, Boolean.valueOf(z), false, 56);
                        str18.getClass();
                        strG2.getClass();
                        dpi0 dpi0Var7 = new dpi0((byte) 15);
                        if (str17 != null) {
                            vzb.E(dpi0Var7, str17);
                            vzb.E(dpi0Var7, ": ");
                            boolean z12 = cy7.c() && zBooleanValue3;
                            if (izm0Var == null) {
                                vzb.E(dpi0Var7, "0");
                                vzb.C(dpi0Var7);
                                vzb.E(dpi0Var7, "0");
                            } else {
                                if (!(izm0Var instanceof gzm0) && !(izm0Var instanceof hzm0)) {
                                    t9f.b();
                                    return null;
                                }
                                boolean z13 = izm0Var instanceof hzm0;
                                String strA6 = z13 ? ((hzm0) izm0Var).g : izm0Var.a();
                                String strB3 = z13 ? ((hzm0) izm0Var).h : izm0Var.b();
                                vzb.E(dpi0Var7, "\u2066");
                                if (z12) {
                                    vzb.D(dpi0Var7, strB3, vzb.L(izm0Var.i()));
                                    vzb.C(dpi0Var7);
                                    vzb.D(dpi0Var7, strA6, vzb.L(izm0Var.j()));
                                } else {
                                    vzb.D(dpi0Var7, strA6, vzb.L(izm0Var.j()));
                                    vzb.C(dpi0Var7);
                                    vzb.D(dpi0Var7, strB3, vzb.L(izm0Var.i()));
                                }
                                vzb.E(dpi0Var7, "\u2069");
                            }
                        } else {
                            vzb.E(dpi0Var7, strG2);
                            if (str18.length() > 0) {
                                vzb.A(dpi0Var7);
                                vzb.E(dpi0Var7, str18);
                            }
                            if (z11) {
                                vzb.A(dpi0Var7);
                                i = 0;
                                vzb.E(dpi0Var7, ctf0Var2.b.a(R.string.game_end, Arrays.copyOf(new Object[0], 0)));
                            } else {
                                i = 0;
                            }
                            if (z5) {
                                vzb.A(dpi0Var7);
                                vzb.E(dpi0Var7, ctf0Var2.b.a(R.string.card_cricket_break, Arrays.copyOf(new Object[i], i)));
                            }
                        }
                        j83 j83VarH3 = ((h83) dpi0Var7.f6468a).h();
                        nz10 nz10Var = (nz10) pz10Var2;
                        boolean z14 = nz10Var instanceof mz10;
                        k5q0 k5q0Var = k5q0.b;
                        if (!z14) {
                            if (nz10Var instanceof oz10) {
                                oz10 oz10Var = (oz10) nz10Var;
                                String str19 = oz10Var.i;
                                String str20 = oz10Var.g;
                                String str21 = oz10Var.m;
                                String str22 = oz10Var.k;
                                boolean z15 = ((StringsKt.W(str22) || str22.equals("0")) && (StringsKt.W(str21) || str21.equals("0"))) ? false : true;
                                boolean z16 = str20.length() > 0 || str19.length() > 0;
                                eex eexVarG = vzb.G(oz10Var.o);
                                ArrayList arrayList5 = oz10Var.f;
                                ArrayList arrayList6 = new ArrayList(r3d.q(arrayList5, 10));
                                Iterator it = arrayList5.iterator();
                                while (it.hasNext()) {
                                    te90 te90Var = (te90) it.next();
                                    arrayList6.add(new yd90(vzb.O(te90Var), vzb.Q(te90Var), te90Var.f33809a));
                                    it = it;
                                    z15 = z15;
                                }
                                boolean z17 = z15;
                                i4 i4VarR1 = dyb.r0(arrayList6);
                                j83 j83VarN = vzb.N(nz10Var);
                                j83 j83VarP = vzb.P(nz10Var);
                                lsm0 lsm0Var2 = ctf0Var2.b;
                                yd90 yd90Var3 = new yd90(j83VarN, j83VarP, lsm0Var2.a(R.string.total_count, Arrays.copyOf(new Object[0], 0)));
                                if (z17) {
                                    h83 h83Var = new h83();
                                    long j2 = y3d.g;
                                    long j3 = daq0.c;
                                    smk0 smk0Var = new smk0(vzb.L(oz10Var.l), j3, null, null, null, null, null, j3, new j56(0.0f), null, null, j2, k5q0Var, null, null, 17424);
                                    h83Var.c(str22);
                                    j83 j83VarC = kng0.c(h83Var.f12607a, h83Var, smk0Var, 0);
                                    h83 h83Var2 = new h83();
                                    smk0 smk0Var2 = new smk0(vzb.L(oz10Var.n), j3, null, null, null, null, null, j3, new j56(0.0f), null, null, j2, k5q0Var, null, null, 17424);
                                    h83Var2.c(str21);
                                    yd90Var = new yd90(j83VarC, kng0.c(h83Var2.f12607a, h83Var2, smk0Var2, 0), lsm0Var2.a(R.string.dt_points, Arrays.copyOf(new Object[0], 0)));
                                } else {
                                    yd90Var = null;
                                }
                                if (z16) {
                                    h83 h83Var3 = new h83();
                                    long j4 = y3d.g;
                                    long j5 = daq0.c;
                                    smk0 smk0Var3 = new smk0(vzb.L(oz10Var.h), j5, null, null, null, null, null, j5, new j56(0.0f), null, null, j4, k5q0Var, null, null, 17424);
                                    h83Var3.c(str20);
                                    j83 j83VarC2 = kng0.c(h83Var3.f12607a, h83Var3, smk0Var3, 0);
                                    h83 h83Var4 = new h83();
                                    smk0 smk0Var4 = new smk0(vzb.L(oz10Var.j), j5, null, null, null, null, null, j5, new j56(0.0f), null, null, j4, k5q0Var, null, null, 17424);
                                    h83Var4.c(str19);
                                    yd90Var2 = new yd90(j83VarC2, kng0.c(h83Var4.f12607a, h83Var4, smk0Var4, 0), lsm0Var2.a(R.string.tennis_game_column, Arrays.copyOf(new Object[0], 0)));
                                } else {
                                    yd90Var2 = null;
                                }
                                iul0Var2 = new iul0(eexVarG, i4VarR1, yd90Var3, yd90Var2, yd90Var);
                            } else {
                                if (!(nz10Var instanceof kz10)) {
                                    t9f.b();
                                    return null;
                                }
                                kz10 kz10Var = (kz10) nz10Var;
                                eex eexVarG2 = vzb.G(kz10Var.g);
                                ArrayList<te90> arrayList7 = kz10Var.f;
                                ArrayList arrayList8 = new ArrayList(r3d.q(arrayList7, 10));
                                for (te90 te90Var2 : arrayList7) {
                                    arrayList8.add(new yd90(vzb.O(te90Var2), vzb.Q(te90Var2), te90Var2.f33809a));
                                }
                                iul0Var = new iul0(eexVarG2, dyb.r0(arrayList8), new yd90(vzb.N(nz10Var), vzb.P(nz10Var), ctf0Var2.b.a(R.string.total_count, Arrays.copyOf(new Object[0], 0))), null, null);
                            }
                            if (rpp0Var4 instanceof qpp0) {
                                if (rpp0Var4 instanceof ppp0) {
                                    ppp0 ppp0Var4 = (ppp0) rpp0Var4;
                                    return new xrr(uqrVarR6, b8k0.c0(ppp0Var4.e, ppp0Var4.g, list3), b8k0.c0(ppp0Var4.f, ppp0Var4.h, list2), j83VarH3, iul0Var2);
                                }
                                t9f.b();
                                return null;
                            }
                            qpp0 qpp0Var4 = (qpp0) rpp0Var4;
                            String str27 = qpp0Var4.g;
                            str3 = (String) CollectionsKt.firstOrNull(list3);
                            if (str3 == null) {
                                str3 = "";
                            }
                            c280 c280Var3 = new c280(vsm0.s(qpp0Var4.e, str3), R.drawable.ic_glyph_placeholder_player);
                            long j9 = qpp0Var4.e;
                            bap bapVar3 = bap.b;
                            jdp0 jdp0Var6 = new jdp0(str27, n6x.o0(c280Var3, j9, list, zBooleanValue, bapVar3), null);
                            String str28 = qpp0Var4.h;
                            str4 = (String) CollectionsKt.firstOrNull(list2);
                            if (str4 == null) {
                                str4 = "";
                            }
                            return new xrr(uqrVarR6, jdp0Var6, new jdp0(str28, n6x.o0(new c280(vsm0.s(qpp0Var4.f, str4), R.drawable.ic_glyph_placeholder_player), qpp0Var4.f, list, zBooleanValue, bapVar3), null), j83VarH3, iul0Var2);
                        }
                        mz10 mz10Var = (mz10) nz10Var;
                        eex eexVarG3 = vzb.G(mz10Var.g);
                        ArrayList<te90> arrayList9 = mz10Var.f;
                        ArrayList arrayList10 = new ArrayList(r3d.q(arrayList9, 10));
                        for (te90 te90Var3 : arrayList9) {
                            arrayList10.add(new yd90(vzb.O(te90Var3), vzb.Q(te90Var3), te90Var3.f33809a));
                        }
                        i4 i4VarR2 = dyb.r0(arrayList10);
                        j83 j83VarN2 = vzb.N(nz10Var);
                        j83 j83VarP2 = vzb.P(nz10Var);
                        lsm0 lsm0Var3 = ctf0Var2.b;
                        yd90 yd90Var4 = new yd90(j83VarN2, j83VarP2, lsm0Var3.a(R.string.total_count, Arrays.copyOf(new Object[0], 0)));
                        h83 h83Var5 = new h83();
                        String str25 = mz10Var.h;
                        long j7 = y3d.g;
                        long j8 = daq0.c;
                        smk0 smk0Var5 = new smk0(vzb.L(mz10Var.i), j8, null, null, null, null, null, j8, new j56(0.0f), null, null, j7, k5q0Var, null, null, 17424);
                        h83Var5.c(str25);
                        j83 j83VarC3 = kng0.c(h83Var5.f12607a, h83Var5, smk0Var5, 0);
                        h83 h83Var6 = new h83();
                        String str26 = mz10Var.j;
                        smk0 smk0Var6 = new smk0(vzb.L(mz10Var.k), j8, null, null, null, null, null, j8, new j56(0.0f), null, null, j7, k5q0Var, null, null, 17424);
                        h83Var6.c(str26);
                        iul0Var = new iul0(eexVarG3, i4VarR2, yd90Var4, null, new yd90(j83VarC3, kng0.c(h83Var6.f12607a, h83Var6, smk0Var6, 0), lsm0Var3.a(R.string.dt_points, Arrays.copyOf(new Object[0], 0))));
                        iul0Var2 = iul0Var;
                        if (rpp0Var4 instanceof qpp0) {
                            if (rpp0Var4 instanceof ppp0) {
                                ppp0 ppp0Var5 = (ppp0) rpp0Var4;
                                return new xrr(uqrVarR6, b8k0.c0(ppp0Var5.e, ppp0Var5.g, list3), b8k0.c0(ppp0Var5.f, ppp0Var5.h, list2), j83VarH3, iul0Var2);
                            }
                            t9f.b();
                            return null;
                        }
                        qpp0 qpp0Var5 = (qpp0) rpp0Var4;
                        String str29 = qpp0Var5.g;
                        str3 = (String) CollectionsKt.firstOrNull(list3);
                        if (str3 == null) {
                            str3 = "";
                        }
                        c280 c280Var4 = new c280(vsm0.s(qpp0Var5.e, str3), R.drawable.ic_glyph_placeholder_player);
                        long j10 = qpp0Var5.e;
                        bap bapVar4 = bap.b;
                        jdp0 jdp0Var7 = new jdp0(str29, n6x.o0(c280Var4, j10, list, zBooleanValue, bapVar4), null);
                        String str210 = qpp0Var5.h;
                        str4 = (String) CollectionsKt.firstOrNull(list2);
                        if (str4 == null) {
                            str4 = "";
                        }
                        return new xrr(uqrVarR6, jdp0Var7, new jdp0(str210, n6x.o0(new c280(vsm0.s(qpp0Var5.f, str4), R.drawable.ic_glyph_placeholder_player), qpp0Var5.f, list, zBooleanValue, bapVar4), null), j83VarH3, iul0Var2);
                    }
                }
                return qrr.f29223a;
            }

            /* JADX WARN: Code duplicated, block: B:18:0x008a  */
            private final Object b(Object obj) {
                String strG;
                lz10 lz10Var;
                float f;
                fad dadVar;
                sad qadVar;
                j83 j83VarC;
                j83 j83VarC2;
                gna gnaVar = (gna) obj;
                if (gnaVar == null) {
                    return null;
                }
                if (!(gnaVar instanceof ena)) {
                    if (gnaVar instanceof fna) {
                        return null;
                    }
                    t9f.b();
                    return null;
                }
                ena enaVar = (ena) gnaVar;
                mca mcaVar = enaVar.f8084a;
                rjs rjsVar = this.b;
                jg30 jg30Var = (jg30) ((fee) rjsVar.H.getValue()).b();
                bg30 bg30Var = (bg30) ((fee) rjsVar.I.getValue()).c();
                pz10 pz10Var = bg30Var != null ? bg30Var.f2536a : null;
                ctf0 ctf0Var2 = rjsVar.f30611a;
                boolean z = enaVar.p;
                znq0 znq0Var = (znq0) ((fee) rjsVar.t.getValue()).c();
                boolean zBooleanValue = ((Boolean) ((fee) rjsVar.v.getValue()).c()).booleanValue();
                ctf0Var2.getClass();
                dja djaVar = dja.PENALTY;
                k5q0 k5q0Var = k5q0.b;
                if (jg30Var != null) {
                    dadVar = new ead(jg30Var);
                    f = 0.0f;
                    lz10Var = null;
                } else {
                    h83 h83Var = new h83();
                    if (znq0Var != null) {
                        rdj rdjVar = rdj.f30294a;
                        strG = rdj.g(znq0Var, efj.UNIVERSAL, Boolean.valueOf(z), false, 56);
                        if (strG == null) {
                            strG = "";
                        }
                    } else {
                        strG = "";
                    }
                    pz40 pz40Var = s6t0.f31722a;
                    long textPrimary = s6t0.b().f33626a.getTextPrimary();
                    h83 h83Var2 = new h83();
                    long j = y3d.g;
                    long j2 = daq0.c;
                    lz10Var = null;
                    f = 0.0f;
                    smk0 smk0Var = new smk0(textPrimary, j2, null, null, null, null, null, j2, new j56(0.0f), null, null, j, k5q0Var, null, null, 17424);
                    h83Var2.c(strG);
                    StringBuilder sb = h83Var2.f12607a;
                    h83Var2.a(smk0Var, 0, sb.length());
                    sb.length();
                    h83Var.b(h83Var2.h());
                    dadVar = new dad(h83Var.h());
                }
                d3h0 cl5Var = pz10Var;
                if (mcaVar instanceof pca) {
                    if (pz10Var == null) {
                        cl5Var = new cl5((byte) 28);
                    }
                    rpp0 rpp0Var = ((pca) mcaVar).f26749a;
                    String strB = rpp0Var.b();
                    String strD = rpp0Var.d();
                    boolean z2 = cl5Var instanceof lz10;
                    lz10 lz10Var2 = z2 ? (lz10) cl5Var : lz10Var;
                    String strT = lz10Var2 != null ? vzb.T(lz10Var2, zBooleanValue) : "0";
                    lz10 lz10Var3 = z2 ? (lz10) cl5Var : lz10Var;
                    qadVar = new pad(strB, strD, strT, lz10Var3 != null ? vzb.U(lz10Var3, zBooleanValue) : "0", cl5Var.j(), cl5Var.i());
                } else if (mcaVar instanceof tca) {
                    rpp0 rpp0Var2 = ((tca) mcaVar).f33711a;
                    String strB2 = rpp0Var2.b();
                    String strD2 = rpp0Var2.d();
                    h83 h83Var3 = new h83();
                    String strA = ctf0Var2.b.a(R.string.vs, Arrays.copyOf(new Object[0], 0));
                    long j3 = y3d.g;
                    long j4 = daq0.c;
                    pz40 pz40Var2 = s6t0.f31722a;
                    smk0 smk0Var2 = new smk0(s6t0.b().f33626a.getTextPrimary(), j4, null, null, null, null, null, j4, new j56(f), null, null, j3, k5q0Var, null, null, 17424);
                    h83Var3.c(strA);
                    qadVar = new rad(kng0.c(h83Var3.f12607a, h83Var3, smk0Var2, 0), strB2, strD2);
                } else if (mcaVar instanceof xca) {
                    rpp0 rpp0Var3 = ((xca) mcaVar).f40636a;
                    String strB3 = rpp0Var3.b();
                    String strD3 = rpp0Var3.d();
                    if (pz10Var != null) {
                        j83VarC2 = vzb.M(pz10Var);
                    } else {
                        h83 h83Var4 = new h83();
                        String strA2 = ctf0Var2.b.a(R.string.vs, Arrays.copyOf(new Object[0], 0));
                        long j5 = y3d.g;
                        long j6 = daq0.c;
                        pz40 pz40Var3 = s6t0.f31722a;
                        smk0 smk0Var3 = new smk0(s6t0.b().f33626a.getTextPrimary(), j6, null, null, null, null, null, j6, new j56(f), null, null, j5, k5q0Var, null, null, 17424);
                        h83Var4.c(strA2);
                        j83VarC2 = kng0.c(h83Var4.f12607a, h83Var4, smk0Var3, 0);
                    }
                    qadVar = new rad(j83VarC2, strB3, strD3);
                } else if (mcaVar instanceof gda) {
                    gda gdaVar = (gda) mcaVar;
                    String strB0 = CollectionsKt.b0(gdaVar.f11094a, Separators.SLASH, null, null, null, 62);
                    String strB1 = CollectionsKt.b0(gdaVar.b, Separators.SLASH, null, null, null, 62);
                    h83 h83Var5 = new h83();
                    String strA3 = ctf0Var2.b.a(R.string.vs, Arrays.copyOf(new Object[0], 0));
                    long j7 = y3d.g;
                    long j8 = daq0.c;
                    pz40 pz40Var4 = s6t0.f31722a;
                    smk0 smk0Var4 = new smk0(s6t0.b().f33626a.getTextPrimary(), j8, null, null, null, null, null, j8, new j56(f), null, null, j7, k5q0Var, null, null, 17424);
                    h83Var5.c(strA3);
                    qadVar = new rad(kng0.c(h83Var5.f12607a, h83Var5, smk0Var4, 0), strB0, strB1);
                } else if (mcaVar instanceof hda) {
                    hda hdaVar = (hda) mcaVar;
                    String strB4 = CollectionsKt.b0(hdaVar.f12861a, Separators.SLASH, null, null, null, 62);
                    String strB5 = CollectionsKt.b0(hdaVar.b, Separators.SLASH, null, null, null, 62);
                    if (pz10Var != null) {
                        j83VarC = vzb.M(pz10Var);
                    } else {
                        h83 h83Var6 = new h83();
                        String strA4 = ctf0Var2.b.a(R.string.vs, Arrays.copyOf(new Object[0], 0));
                        long j9 = y3d.g;
                        long j10 = daq0.c;
                        pz40 pz40Var5 = s6t0.f31722a;
                        smk0 smk0Var5 = new smk0(s6t0.b().f33626a.getTextPrimary(), j10, null, null, null, null, null, j10, new j56(f), null, null, j9, k5q0Var, null, null, 17424);
                        h83Var6.c(strA4);
                        j83VarC = kng0.c(h83Var6.f12607a, h83Var6, smk0Var5, 0);
                    }
                    qadVar = new rad(j83VarC, strB4, strB5);
                } else {
                    if (!(mcaVar instanceof ida)) {
                        t9f.b();
                        return lz10Var;
                    }
                    qadVar = new qad(((ida) mcaVar).e);
                }
                return new dax(dadVar, qadVar);
            }

            /* JADX WARN: Code duplicated, block: B:140:0x0381  */
            /* JADX WARN: Code duplicated, block: B:70:0x01a8  */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                kc50 kc50Var;
                p700 p700Var;
                ena enaVar;
                uia uiaVar;
                String strA;
                String strC;
                String strC2;
                zvl0 zvl0Var;
                yja yjaVar;
                qal0 qal0Var;
                Object b0k0Var;
                i49 g49Var;
                dxh0 dxh0Var;
                hna hnaVar;
                lmo lmoVar;
                byte b3 = b2;
                int i = 0;
                rjs rjsVar = this.b;
                switch (b3) {
                    case 0:
                        List list = (List) obj;
                        list.getClass();
                        boolean zBooleanValue = ((Boolean) ((fee) rjsVar.c.getValue()).c()).booleanValue();
                        boolean zBooleanValue2 = ((Boolean) ((fee) rjsVar.e.getValue()).c()).booleanValue();
                        boolean zBooleanValue3 = ((Boolean) ((fee) rjsVar.f.getValue()).c()).booleanValue();
                        tf50 tf50Var = (tf50) ((fee) rjsVar.d.getValue()).c();
                        tf50Var.getClass();
                        if (!list.contains(tf50Var)) {
                            tf50Var = tf50.f33851a;
                        }
                        boolean z = !zBooleanValue2;
                        kc50 kc50Var2 = new kc50(R.drawable.ic_glyph_rectangular_scoreboard, tf50Var == tf50.f33851a);
                        tf50 tf50Var2 = tf50.b;
                        kc50 kc50Var3 = list.contains(tf50Var2) ? new kc50(R.drawable.ic_glyph_rectangular_broadcast, tf50Var == tf50Var2) : null;
                        tf50 tf50Var3 = tf50.c;
                        if (list.contains(tf50Var3)) {
                            kc50Var = new kc50(R.drawable.ic_glyph_rectangular_statistic, tf50Var == tf50Var3);
                        } else {
                            kc50Var = null;
                        }
                        return new ojs(zBooleanValue, z, zBooleanValue, zBooleanValue3, new hjs(kc50Var2, kc50Var3, kc50Var, tf50Var));
                    case 1:
                        n0o0 n0o0Var = rjsVar.o;
                        gna gnaVar = (gna) obj;
                        if ((gnaVar instanceof ena ? (ena) gnaVar : null) == null || (p700Var = ((ena) gnaVar).l) == null) {
                            return null;
                        }
                        List list2 = p700Var.e;
                        List list3 = (List) ((fee) n0o0Var.getValue()).c();
                        ch00 ch00Var = ch00.LAST_GAMES;
                        boolean zContains = list3.contains(ch00Var);
                        List list4 = (List) ((fee) n0o0Var.getValue()).c();
                        ch00 ch00Var2 = ch00.LAST_GAMES_OPP_ONE;
                        boolean zContains2 = list4.contains(ch00Var2);
                        List list5 = (List) ((fee) n0o0Var.getValue()).c();
                        ch00 ch00Var3 = ch00.LAST_GAMES_OPP_TWO;
                        boolean zContains3 = list5.contains(ch00Var3);
                        ctf0 ctf0Var2 = rjsVar.f30611a;
                        ctf0Var2.getClass();
                        ArrayList arrayList = new ArrayList();
                        List list6 = p700Var.g;
                        List list7 = p700Var.f;
                        if (!list2.isEmpty()) {
                            arrayList.add(z1x.T(list2, ctf0Var2, ctf0Var2.b.a(R.string.previous_meetings, Arrays.copyOf(new Object[0], 0)), ch00Var, zContains));
                        }
                        if (!list7.isEmpty()) {
                            arrayList.add(z1x.T(list7, ctf0Var2, kng0.l(ctf0Var2.b.a(R.string.last_games, Arrays.copyOf(new Object[0], 0)), ": ", p700Var.c), ch00Var2, zContains2));
                        }
                        if (!list6.isEmpty()) {
                            arrayList.add(z1x.T(list6, ctf0Var2, kng0.l(ctf0Var2.b.a(R.string.last_games, Arrays.copyOf(new Object[0], 0)), ": ", p700Var.d), ch00Var3, zContains3));
                        }
                        return arrayList;
                    case 2:
                        gna gnaVar2 = (gna) obj;
                        if ((gnaVar2 instanceof ena ? (ena) gnaVar2 : null) == null || (uiaVar = (enaVar = (ena) gnaVar2).h) == null) {
                            return null;
                        }
                        ctf0 ctf0Var3 = rjsVar.f30611a;
                        boolean z2 = enaVar.p;
                        ctf0Var3.getClass();
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it = uiaVar.c.iterator();
                        int i2 = 0;
                        while (it.hasNext()) {
                            Object next = it.next();
                            int i3 = i2 + 1;
                            if (i2 < 0) {
                                q3d.p();
                                throw null;
                            }
                            bsw bswVar = (bsw) next;
                            String str = bswVar.b;
                            String str2 = bswVar.e;
                            String strA2 = (str.length() <= 0 || str2.length() <= 0) ? ctf0Var3.b.a(R.string.vs, Arrays.copyOf(new Object[0], 0)) : w6x.q(bswVar.b, " : ", str2);
                            odp0 odp0Var = new odp0(new d5a0(new c280(bswVar.c, R.drawable.ic_glyph_placeholder_player)));
                            String strM = dw9.m(i3, ". ", bswVar.f3153a);
                            odp0 odp0Var2 = new odp0(new d5a0(new c280(bswVar.f, R.drawable.ic_glyph_placeholder_player)));
                            String strM2 = dw9.m(i3, ". ", bswVar.d);
                            rdj rdjVar = rdj.f30294a;
                            arrayList2.add(new hzy(odp0Var, strM, odp0Var2, strM2, rdj.g(new znq0(bswVar.g), efj.UNIVERSAL, Boolean.valueOf(z2), false, 56), strA2, "", null, null));
                            it = it;
                            i2 = i3;
                        }
                        dja djaVar = dja.PENALTY;
                        return new eax(dyb.o0(arrayList2), uiaVar.f35722a, uiaVar.b);
                    case 3:
                        anq0 anq0Var2 = (anq0) obj;
                        if (anq0Var2 != null) {
                            boolean z3 = ((Boolean) ((fee) rjsVar.g.getValue()).c()).booleanValue() || ((Boolean) ((fee) rjsVar.h.getValue()).c()).booleanValue();
                            ctf0 ctf0Var4 = rjsVar.f30611a;
                            ctf0Var4.getClass();
                            long j = anq0Var2.e;
                            long j2 = anq0Var2.d;
                            boolean z4 = anq0Var2.j;
                            if (j != 0 || !z4) {
                                String str3 = anq0Var2.c;
                                if (z4) {
                                    if (str3.length() > 0) {
                                        strA = ctf0Var4.b.a(R.string.live_additional_min_v2, Arrays.copyOf(new Object[]{str3}, 1));
                                    } else if (anq0Var2.f1167a) {
                                        strA = "";
                                    } else {
                                        strA = anq0Var2.b ? ctf0Var4.b.a(R.string.line_live_time_period_back_v2, Arrays.copyOf(new Object[]{""}, 1)) : ctf0Var4.b.a(R.string.line_live_time_period_capitalized_v2, Arrays.copyOf(new Object[]{""}, 1));
                                    }
                                } else if (j2 < 0) {
                                    strA = ctf0Var4.b.a(R.string.game_started, Arrays.copyOf(new Object[0], 0));
                                } else {
                                    long j3 = j2 / 86400;
                                    strA = j3 > 0 ? ctf0Var4.b.a(R.string.line_time_before_v2, Arrays.copyOf(new Object[]{String.valueOf(j3)}, 1)) : ctf0Var4.b.a(R.string.before_start, Arrays.copyOf(new Object[0], 0));
                                }
                                String strC3 = (z3 || z4 || j2 < 0) ? null : n2x.C((((j2 < 0 ? 0L : j2) / 60) / 60) % 24);
                                if (z3) {
                                    strC = null;
                                } else {
                                    long jB = (z4 ? vzb.V(anq0Var2).b() : j2 < 0 ? 0L : j2) / 60;
                                    if (!z4) {
                                        jB %= 60;
                                    }
                                    strC = n2x.C(jB);
                                }
                                if (z3) {
                                    strC2 = null;
                                } else {
                                    strC2 = n2x.C((z4 ? vzb.V(anq0Var2).b() : j2 >= 0 ? j2 : 0L) % 60);
                                }
                                return new jg30(strA, strC3, strC, strC2);
                            }
                        }
                        return null;
                    case 4:
                        gna gnaVar3 = (gna) obj;
                        ena enaVar2 = gnaVar3 instanceof ena ? (ena) gnaVar3 : null;
                        if (enaVar2 == null || (zvl0Var = ((ena) gnaVar3).k) == null) {
                            return null;
                        }
                        String str4 = zvl0Var.m;
                        String str5 = enaVar2.q;
                        ctf0 ctf0Var5 = rjsVar.f30611a;
                        m1v0 m1v0Var = (m1v0) ((fee) rjsVar.J.getValue()).b();
                        str5.getClass();
                        ctf0Var5.getClass();
                        String str6 = zvl0Var.f45064a;
                        Pair pair = str4.length() > 0 ? new Pair(str4, ctf0Var5.b.a(R.string.web_site, Arrays.copyOf(new Object[0], 0))) : new Pair(null, null);
                        String str7 = (String) pair.f46059a;
                        String str8 = (String) pair.b;
                        dja djaVar2 = dja.PENALTY;
                        String str9 = zvl0Var.b;
                        ArrayList arrayList3 = new ArrayList();
                        String str10 = zvl0Var.l;
                        String str11 = zvl0Var.k;
                        String str12 = zvl0Var.j;
                        String str13 = zvl0Var.i;
                        String str14 = zvl0Var.h;
                        String str15 = zvl0Var.g;
                        String str16 = zvl0Var.f;
                        String str17 = zvl0Var.e;
                        String str18 = zvl0Var.d;
                        String str19 = zvl0Var.c;
                        if (str6.length() > 0) {
                            arrayList3.add(l7x.J(ctf0Var5, str6, R.string.address));
                        }
                        if (str19.length() > 0) {
                            arrayList3.add(l7x.J(ctf0Var5, str19, R.string.capacity));
                        }
                        if (str18.length() > 0) {
                            arrayList3.add(l7x.J(ctf0Var5, str18, R.string.covering));
                        }
                        if (str17.length() > 0) {
                            arrayList3.add(l7x.J(ctf0Var5, str17, R.string.city_name));
                        }
                        if (str16.length() > 0) {
                            arrayList3.add(l7x.J(ctf0Var5, str16, R.string.architect));
                        }
                        if (str15.length() > 0) {
                            arrayList3.add(l7x.J(ctf0Var5, str15, R.string.old_name));
                        }
                        if (str14.length() > 0) {
                            arrayList3.add(l7x.J(ctf0Var5, str14, R.string.category));
                        }
                        if (str13.length() > 0) {
                            arrayList3.add(l7x.J(ctf0Var5, str13, R.string.history));
                        }
                        if (str12.length() > 0) {
                            arrayList3.add(l7x.J(ctf0Var5, str12, R.string.opened));
                        }
                        if (str11.length() > 0) {
                            arrayList3.add(l7x.J(ctf0Var5, str11, R.string.zip_code));
                        }
                        if (str10.length() > 0) {
                            arrayList3.add(l7x.J(ctf0Var5, "\u2066" + str10 + "\u2069", R.string.phone));
                        }
                        a4x a4xVarO0 = dyb.o0(arrayList3);
                        List list8 = zvl0Var.n;
                        ArrayList arrayList4 = new ArrayList(r3d.q(list8, 10));
                        Iterator it2 = list8.iterator();
                        while (it2.hasNext()) {
                            arrayList4.add(String.format(Locale.ENGLISH, "%s/sfiles/stadium/%s", Arrays.copyOf(new Object[]{str5, (String) it2.next()}, 2)));
                        }
                        a4x a4xVarO1 = dyb.o0(arrayList4);
                        if (a4xVarO1.isEmpty()) {
                            a4xVarO1 = dyb.g0("");
                        }
                        return new iax(m1v0Var, str9, a4xVarO0, str7, str8, a4xVarO1);
                    case 5:
                        gna gnaVar4 = (gna) obj;
                        if ((gnaVar4 instanceof ena ? (ena) gnaVar4 : null) != null && (yjaVar = ((ena) gnaVar4).i) != null) {
                            List list9 = yjaVar.f42730a;
                            if (!list9.isEmpty()) {
                                long jLongValue = ((Number) ((fee) rjsVar.m.getValue()).c()).longValue();
                                lc00 lc00VarB = kotlin.collections.a.b();
                                Iterator it3 = list9.iterator();
                                while (it3.hasNext()) {
                                    he30 he30Var = (he30) it3.next();
                                    List list10 = he30Var.b;
                                    ArrayList arrayList5 = new ArrayList();
                                    for (Object obj2 : list10) {
                                        if (((ge30) obj2).e.length() > 0) {
                                            arrayList5.add(obj2);
                                        }
                                    }
                                    if (!arrayList5.isEmpty()) {
                                        lc00VarB.add(new uim(he30Var.f12902a));
                                        int i4 = i;
                                        for (Object obj3 : arrayList5) {
                                            int i5 = i4 + 1;
                                            if (i4 < 0) {
                                                q3d.p();
                                                throw null;
                                            }
                                            ge30 ge30Var = (ge30) obj3;
                                            String str20 = ge30Var.f11132a;
                                            String str21 = ge30Var.e;
                                            String str22 = ge30Var.c;
                                            String str23 = ge30Var.d;
                                            tho thoVar = ge30Var.b;
                                            Iterator it4 = it3;
                                            List listSplit$default = StringsKt__StringsKt.split$default(str20, new String[]{"+"}, false, i, 6, null);
                                            long j4 = jLongValue;
                                            List listSplit$default2 = StringsKt__StringsKt.split$default(str20, new String[]{Separators.COLON}, false, i, 6, null);
                                            if (j4 == 1) {
                                                if (listSplit$default.size() == 2 && listSplit$default2.size() == 1) {
                                                    str20 = listSplit$default.get(0) + "'+" + kotlin.text.c.r((String) listSplit$default.get(1), Separators.QUOTE, "", false);
                                                } else if (listSplit$default2.size() == 2) {
                                                    str20 = listSplit$default2.get(0) + Separators.QUOTE;
                                                }
                                            }
                                            y6n y6nVar = ge30Var.j == 0 ? y6n.f42107a : y6n.b;
                                            ggm ggmVar = i4 == 0 ? arrayList5.size() + (-1) == 0 ? ggm.c : ggm.f11256a : i4 == arrayList5.size() + (-1) ? ggm.b : ggm.d;
                                            lc00VarB.add((str23.length() == 0 && str22.length() == 0) ? new sim(str20, str21, thoVar.name(), y6nVar, ggmVar, ge30Var.b()) : new rim(str20, str21, new lnm(str23, str22, 0, "", new s0m("", ""), ge30Var.k), ge30Var.a() ? new lnm(ge30Var.h, ge30Var.g, 0, "", new s0m("", ""), ge30Var.l) : null, thoVar.name(), null, y6nVar, ggmVar, ge30Var.b()));
                                            it3 = it4;
                                            i4 = i5;
                                            jLongValue = j4;
                                            i = 0;
                                        }
                                    }
                                    it3 = it3;
                                    jLongValue = jLongValue;
                                    i = 0;
                                }
                                i4 i4VarR0 = dyb.r0(kotlin.collections.a.a(lc00VarB));
                                dja djaVar3 = dja.PENALTY;
                                return new gax(new sf30(i4VarR0));
                            }
                        }
                        return null;
                    case 6:
                        vzj0 vzj0Var = (vzj0) obj;
                        if (!(((fee) rjsVar.B.getValue()).b() instanceof qrr) && vzj0Var != null) {
                            anq0 anq0Var3 = (anq0) ((fee) rjsVar.H.getValue()).c();
                            ctf0 ctf0Var6 = rjsVar.f30611a;
                            ctf0Var6.getClass();
                            znq0 znq0Var = anq0Var3 != null ? anq0Var3.h : null;
                            if (znq0Var != null) {
                                long j5 = znq0Var.f44687a;
                                if (j5 <= 0) {
                                    qal0Var = null;
                                } else {
                                    long j6 = j5 / 86400;
                                    qal0Var = new qal0(j6 > 0 ? ctf0Var6.b.a(R.string.line_time_before_v2, Arrays.copyOf(new Object[]{String.valueOf(j6)}, 1)) : ctf0Var6.b.a(R.string.before_start, Arrays.copyOf(new Object[0], 0)), yyw.L((((j5 < 0 ? 0L : j5) / 60) / 60) % 24), yyw.L(((j5 < 0 ? 0L : j5) / 60) % 60), yyw.L((j5 >= 0 ? j5 : 0L) % 60));
                                }
                            } else {
                                qal0Var = null;
                            }
                            if (vzj0Var instanceof tzj0) {
                                tzj0 tzj0Var = (tzj0) vzj0Var;
                                b0k0Var = new yzj0(tzj0Var.f34807a, tzj0Var.b, tzj0Var.c, tzj0Var.d, qal0Var);
                            } else if (vzj0Var instanceof uzj0) {
                                uzj0 uzj0Var = (uzj0) vzj0Var;
                                b0k0Var = new b0k0(uzj0Var.f36538a, uzj0Var.b, uzj0Var.c, uzj0Var.d, qal0Var);
                            } else {
                                t9f.b();
                            }
                            return b0k0Var;
                        }
                        return null;
                    case 7:
                        boolean zBooleanValue4 = ((Boolean) obj).booleanValue();
                        long jLongValue2 = ((Number) ((fee) rjsVar.j.getValue()).c()).longValue();
                        boolean zBooleanValue5 = ((Boolean) ((fee) rjsVar.i.getValue()).c()).booleanValue();
                        long jLongValue3 = ((Number) ((fee) rjsVar.k.getValue()).c()).longValue();
                        long jLongValue4 = ((Number) ((fee) rjsVar.m.getValue()).c()).longValue();
                        Long l = (Long) ((fee) rjsVar.l.getValue()).c();
                        long jLongValue5 = l != null ? l.longValue() : -1L;
                        if (zBooleanValue4) {
                            return new sym0(new MarketsCategoriesParams(jLongValue2, jLongValue3, jLongValue4, new zq2(), "", zBooleanValue5));
                        }
                        tef0 tef0Var = tef0.f33818a;
                        xuz xuzVar = pb10.c;
                        return new vym0(new RelatedParams(zBooleanValue5, jLongValue2, jLongValue4, -1L, jLongValue5, tef0Var));
                    case 8:
                        return a(obj);
                    case 9:
                        fsr fsrVar = (fsr) obj;
                        if ((fsrVar == null || !fsrVar.b) && (fsrVar == null || !fsrVar.c)) {
                            return k49.f17656a;
                        }
                        o49 o49Var = (o49) ((fee) rjsVar.y.getValue()).c();
                        ctf0 ctf0Var7 = rjsVar.f30611a;
                        zvh0 zvh0Var2 = rjsVar.b;
                        fsrVar.getClass();
                        ctf0Var7.getClass();
                        ArrayList arrayList6 = new ArrayList();
                        if (fsrVar.b) {
                            arrayList6.add(new g49(ctf0Var7.b.a(R.string.video, Arrays.copyOf(new Object[0], 0))));
                        }
                        if (fsrVar.c) {
                            arrayList6.add(new h49(ctf0Var7.b.a(R.string.play_zone, Arrays.copyOf(new Object[0], 0))));
                        }
                        if (o49Var == null) {
                            g49Var = (i49) CollectionsKt.U(arrayList6);
                        } else {
                            int iOrdinal = o49Var.ordinal();
                            if (iOrdinal == 0) {
                                g49Var = new g49(ctf0Var7.b.a(R.string.video, Arrays.copyOf(new Object[0], 0)));
                            } else {
                                if (iOrdinal != 1) {
                                    t9f.b();
                                    return null;
                                }
                                g49Var = new h49(ctf0Var7.b.a(R.string.play_zone, Arrays.copyOf(new Object[0], 0)));
                            }
                            if (arrayList6.isEmpty()) {
                                g49Var = null;
                            } else {
                                Iterator it5 = arrayList6.iterator();
                                do {
                                    if (!it5.hasNext()) {
                                        g49Var = null;
                                    }
                                } while (!Intrinsics.d((i49) it5.next(), g49Var));
                            }
                            if (g49Var == null) {
                                g49Var = (i49) CollectionsKt.U(arrayList6);
                            }
                        }
                        bfu0 bfu0Var = fsrVar.f10077a;
                        GameBroadcastingParams gameBroadcastingParams = new GameBroadcastingParams(bfu0Var.f2522a, bfu0Var.c, bfu0Var.f, bfu0Var.b, bfu0Var.e, bfu0Var.d, bfu0Var.g, null);
                        Iterator it6 = arrayList6.iterator();
                        int i6 = 0;
                        while (true) {
                            if (!it6.hasNext()) {
                                i6 = -1;
                            } else if (!Intrinsics.d((i49) it6.next(), g49Var)) {
                                i6++;
                            }
                        }
                        int i7 = i6;
                        i4 i4VarR1 = dyb.r0(arrayList6);
                        boolean z5 = arrayList6.size() > 1;
                        int iOrdinal2 = zvh0Var2.ordinal();
                        if (iOrdinal2 == 0) {
                            dxh0Var = axh0.f1625a;
                        } else if (iOrdinal2 == 1) {
                            dxh0Var = zwh0.f45106a;
                        } else if (iOrdinal2 == 2) {
                            dxh0Var = cxh0.f5122a;
                        } else {
                            if (iOrdinal2 != 3) {
                                t9f.b();
                                return null;
                            }
                            dxh0Var = bxh0.f3376a;
                        }
                        dxh0 dxh0Var2 = dxh0Var;
                        ArrayList arrayList7 = new ArrayList(r3d.q(arrayList6, 10));
                        Iterator it7 = arrayList6.iterator();
                        while (it7.hasNext()) {
                            arrayList7.add(new yvh0(((i49) it7.next()).getDescription(), bwh0.f3325a));
                        }
                        return new j49(gameBroadcastingParams, i7, g49Var, i4VarR1, z5, dxh0Var2, dyb.r0(arrayList7));
                    case 10:
                        return b(obj);
                    default:
                        gna gnaVar5 = (gna) obj;
                        if ((gnaVar5 instanceof ena ? (ena) gnaVar5 : null) == null || (hnaVar = ((ena) gnaVar5).j) == null) {
                            return null;
                        }
                        boolean zContains4 = ((List) ((fee) rjsVar.o.getValue()).c()).contains(ch00.SHORT_STATISTIC);
                        ctf0 ctf0Var8 = rjsVar.f30611a;
                        ctf0Var8.getClass();
                        List<vrj0> list11 = hnaVar.f;
                        ArrayList arrayList8 = new ArrayList(r3d.q(list11, 10));
                        for (vrj0 vrj0Var : list11) {
                            float fS = r7x.s(vrj0Var.b);
                            float fS2 = r7x.s(vrj0Var.c);
                            String str24 = vrj0Var.f37902a;
                            String str25 = vrj0Var.b;
                            String str26 = vrj0Var.c;
                            if (fS == 0.0f && fS2 == 0.0f) {
                                fS = 0.0f;
                            }
                            arrayList8.add(new srj0(fS, (fS == 0.0f && fS2 == 0.0f) ? 0.0f : fS2, str24, str25, str26));
                        }
                        dja djaVar4 = dja.PENALTY;
                        ch00 ch00Var4 = ch00.SHORT_STATISTIC;
                        i4 i4VarR2 = zContains4 ? dyb.r0(arrayList8) : dyb.r0(CollectionsKt.D0(arrayList8, 3));
                        if (arrayList8.size() - 1 > 3) {
                            lsm0 lsm0Var = ctf0Var8.b;
                            lmoVar = new lmo(lsm0Var.a(R.string.expand, Arrays.copyOf(new Object[0], 0)), lsm0Var.a(R.string.collapse, Arrays.copyOf(new Object[0], 0)), zContains4);
                        } else {
                            lmoVar = null;
                        }
                        return new hax(i4VarR2, lmoVar);
                }
            }
        }, (byte) 20));
        final byte b3 = 8;
        this.B = bkb.G(a().d, new Function1(this) { // from class: a.qjs
            public final /* synthetic */ rjs b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:260:0x08d4  */
            /* JADX WARN: Code duplicated, block: B:262:0x08e4  */
            /* JADX WARN: Code duplicated, block: B:265:0x090f  */
            /* JADX WARN: Code duplicated, block: B:268:0x0932  */
            /* JADX WARN: Code duplicated, block: B:270:0x0936  */
            /* JADX WARN: Code duplicated, block: B:272:0x094e  */
            private final Object a(Object obj) {
                n0o0 n0o0Var;
                n0o0 n0o0Var2;
                String str;
                String str2;
                mqr kqrVar;
                String strG;
                d3h0 pekVar;
                String strN;
                d3h0 xakVar;
                Integer num;
                String strN2;
                int i;
                iul0 iul0Var;
                yd90 yd90Var;
                yd90 yd90Var2;
                iul0 iul0Var2;
                String str3;
                String str4;
                d3h0 bekVar;
                String strA;
                String strB;
                String strN3;
                rjs rjsVar = this.b;
                n0o0 n0o0Var3 = rjsVar.v;
                n0o0 n0o0Var4 = rjsVar.m;
                n0o0 n0o0Var5 = rjsVar.H;
                n0o0 n0o0Var6 = rjsVar.I;
                ctf0 ctf0Var2 = rjsVar.f30611a;
                gna gnaVar = (gna) obj;
                if (gnaVar != null) {
                    if (!(gnaVar instanceof ena)) {
                        if (gnaVar instanceof fna) {
                            ctf0Var2.getClass();
                            return new orr(d9x.L(((fna) gnaVar).f9825a, ctf0Var2));
                        }
                        t9f.b();
                        return null;
                    }
                    ena enaVar = (ena) gnaVar;
                    mca mcaVar = enaVar.f8084a;
                    List list = (List) ((fee) rjsVar.n.getValue()).c();
                    boolean zBooleanValue = ((Boolean) ((fee) rjsVar.e.getValue()).c()).booleanValue();
                    mpm mpmVar = (mpm) ((fee) n0o0Var6.getValue()).b();
                    boolean z = enaVar.p;
                    String str5 = (String) ((fee) rjsVar.p.getValue()).c();
                    String str6 = (String) ((fee) rjsVar.q.getValue()).c();
                    String str7 = (String) ((fee) rjsVar.r.getValue()).c();
                    String str8 = (String) ((fee) rjsVar.s.getValue()).c();
                    jg30 jg30Var = (jg30) ((fee) n0o0Var5.getValue()).b();
                    bg30 bg30Var = (bg30) ((fee) n0o0Var6.getValue()).c();
                    znq0 znq0Var = (znq0) ((fee) rjsVar.t.getValue()).c();
                    bha bhaVar = enaVar.o;
                    ui9 ui9Var = (ui9) ((fee) rjsVar.u.getValue()).c();
                    long jLongValue = ((Number) ((fee) n0o0Var4.getValue()).c()).longValue();
                    boolean zBooleanValue2 = ((Boolean) ((fee) n0o0Var3.getValue()).c()).booleanValue();
                    ctf0Var2.getClass();
                    if (ui9Var != null) {
                        int i2 = ui9Var.c;
                        int i3 = ui9Var.d;
                        n0o0Var = n0o0Var4;
                        String strN4 = (cy7.c() && zBooleanValue2) ? w6x.n(i3, i2, " : ") : w6x.n(i2, i3, " : ");
                        String strX = j0x.x(jLongValue, ctf0Var2);
                        ArrayList arrayList = ui9Var.f35720a;
                        n0o0Var2 = n0o0Var5;
                        str = str5;
                        str2 = str6;
                        ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
                        int i4 = 0;
                        for (Object obj2 : arrayList) {
                            int i5 = i4 + 1;
                            if (i4 < 0) {
                                q3d.p();
                                throw null;
                            }
                            arrayList2.add(piz.W((sc90) obj2, jLongValue, i4));
                            i4 = i5;
                        }
                        i4 i4VarR0 = dyb.r0(arrayList2);
                        ArrayList arrayList3 = ui9Var.b;
                        ArrayList arrayList4 = new ArrayList(r3d.q(arrayList3, 10));
                        int i6 = 0;
                        for (Object obj3 : arrayList3) {
                            int i7 = i6 + 1;
                            if (i6 < 0) {
                                q3d.p();
                                throw null;
                            }
                            arrayList4.add(piz.W((sc90) obj3, jLongValue, i6));
                            i6 = i7;
                        }
                        kqrVar = new iqr(strN4, strX, i4VarR0, dyb.r0(arrayList4));
                    } else {
                        n0o0Var = n0o0Var4;
                        n0o0Var2 = n0o0Var5;
                        str = str5;
                        str2 = str6;
                        if (bhaVar != null) {
                            float f = bhaVar.d;
                            float f2 = bhaVar.e;
                            float f3 = bhaVar.f;
                            Object[] objArr = {Float.valueOf(f3)};
                            lsm0 lsm0Var = ctf0Var2.b;
                            String strA2 = lsm0Var.a(R.string.n_percents, Arrays.copyOf(objArr, 1));
                            k3w0 g3w0Var = (f3 <= f2 || f3 <= f) ? new g3w0(strA2) : new i3w0(strA2);
                            String strA3 = lsm0Var.a(R.string.n_percents, Arrays.copyOf(new Object[]{Float.valueOf(f2)}, 1));
                            k3w0 g3w0Var2 = (f2 <= f3 || f2 <= f) ? new g3w0(strA3) : new i3w0(strA3);
                            String strA4 = lsm0Var.a(R.string.n_percents, Arrays.copyOf(new Object[]{Float.valueOf(f)}, 1));
                            kqrVar = new kqr(g3w0Var, g3w0Var2, (f <= f3 || f <= f2) ? new g3w0(strA4) : new i3w0(strA4));
                        } else {
                            kqrVar = null;
                        }
                    }
                    anq0 anq0Var2 = (anq0) ((fee) n0o0Var2.getValue()).c();
                    boolean z2 = anq0Var2 != null ? anq0Var2.f1167a : false;
                    long jLongValue2 = ((Number) ((fee) n0o0Var.getValue()).c()).longValue();
                    boolean zBooleanValue3 = ((Boolean) ((fee) n0o0Var3.getValue()).c()).booleanValue();
                    list.getClass();
                    mpmVar.getClass();
                    String strA5 = "";
                    if (mcaVar instanceof pca) {
                        pca pcaVar = (pca) mcaVar;
                        uqr uqrVarR0 = pzb.r0(mcaVar, str, str2, str7, str8, jg30Var);
                        if (bg30Var == null || (bekVar = bg30Var.b) == null) {
                            bekVar = bg30Var != null ? bg30Var.f2536a : new bek();
                        }
                        d3h0 d3h0Var = bekVar;
                        boolean z3 = d3h0Var instanceof lz10;
                        lz10 lz10Var = z3 ? (lz10) d3h0Var : null;
                        if (lz10Var != null) {
                            strA = vzb.T(lz10Var, zBooleanValue3);
                        } else {
                            hzm0 hzm0Var = d3h0Var instanceof hzm0 ? (hzm0) d3h0Var : null;
                            if (hzm0Var != null) {
                                String str9 = hzm0Var.g;
                                String str10 = hzm0Var.i;
                                StringBuilder sb = new StringBuilder("\u2066");
                                if (cy7.c() && zBooleanValue3) {
                                    if (str10 != null) {
                                        hne.B(sb, "(ov ", str10, Separators.RPAREN);
                                    }
                                    sb.append(vzb.i0(str9));
                                } else {
                                    sb.append(str9);
                                    if (str10 != null) {
                                        hne.B(sb, Separators.LPAREN, str10, " ov)");
                                    }
                                }
                                sb.append("\u2069");
                                strA = sb.toString();
                            } else {
                                strA = d3h0Var.a();
                            }
                        }
                        String str11 = strA;
                        lz10 lz10Var2 = z3 ? (lz10) d3h0Var : null;
                        if (lz10Var2 != null) {
                            strB = vzb.U(lz10Var2, zBooleanValue3);
                        } else {
                            hzm0 hzm0Var2 = d3h0Var instanceof hzm0 ? (hzm0) d3h0Var : null;
                            if (hzm0Var2 != null) {
                                String str12 = hzm0Var2.h;
                                String str13 = hzm0Var2.j;
                                StringBuilder sb2 = new StringBuilder("\u2066");
                                if (cy7.c() && zBooleanValue3) {
                                    if (str13 != null) {
                                        hne.B(sb2, "(ov ", str13, Separators.RPAREN);
                                    }
                                    sb2.append(vzb.i0(str12));
                                } else {
                                    sb2.append(str12);
                                    if (str13 != null) {
                                        hne.B(sb2, Separators.LPAREN, str13, " ov)");
                                    }
                                }
                                sb2.append("\u2069");
                                strB = sb2.toString();
                            } else {
                                strB = d3h0Var.b();
                            }
                        }
                        String str14 = strB;
                        boolean z4 = pcaVar.d;
                        rpp0 rpp0Var = pcaVar.f26749a;
                        j83 j83VarH = vzb.H(ctf0Var2, d3h0Var, pcaVar.e, pcaVar.f, pcaVar.g, (bg30Var == null || (strN3 = bg30Var.f2536a.n()) == null) ? "" : strN3, z4, zBooleanValue3);
                        String strB2 = rpp0Var.b();
                        c280 c280Var = new c280(vsm0.s(rpp0Var.a(), pcaVar.b), R.drawable.ic_glyph_placeholder_player);
                        long jA = rpp0Var.a();
                        bap bapVar = bap.b;
                        jdp0 jdp0Var = new jdp0(strB2, n6x.o0(c280Var, jA, list, zBooleanValue, bapVar), null);
                        jdp0 jdp0Var2 = new jdp0(rpp0Var.d(), n6x.o0(new c280(vsm0.s(rpp0Var.c(), pcaVar.c), R.drawable.ic_glyph_placeholder_player), rpp0Var.c(), list, zBooleanValue, bapVar), null);
                        lz10 lz10Var3 = z3 ? (lz10) d3h0Var : null;
                        return new mrr(uqrVarR0, jdp0Var, jdp0Var2, j83VarH, lz10Var3 != null ? vzb.G(lz10Var3.i) : eex.c, str11, d3h0Var.j(), str14, d3h0Var.i());
                    }
                    boolean z5 = z2;
                    String str15 = str;
                    String str16 = str2;
                    boolean z6 = mcaVar instanceof tca;
                    qpm qpmVar = qpm.f29126a;
                    if (z6) {
                        tca tcaVar = (tca) mcaVar;
                        uqr uqrVarR1 = pzb.r0(mcaVar, str15, str16, str7, str8, jg30Var);
                        znq0 znq0Var2 = new znq0(znq0Var != null ? znq0Var.f44687a : 0L);
                        rpp0 rpp0Var2 = tcaVar.f33711a;
                        boolean z7 = tcaVar.i;
                        if (rpp0Var2 instanceof qpp0) {
                            qpp0 qpp0Var = (qpp0) rpp0Var2;
                            jdp0 jdp0Var3 = new jdp0(qpp0Var.g, n6x.o0(u1c.C(tcaVar, true), qpp0Var.e, list, zBooleanValue || z7, bap.b), null);
                            jdp0 jdp0Var4 = new jdp0(qpp0Var.h, n6x.o0(u1c.C(tcaVar, false), qpp0Var.f, list, zBooleanValue || z7, bap.f2271a), null);
                            lpm lpmVar = new lpm(qpmVar, new hpm(0L, 3));
                            dpi0 dpi0Var = new dpi0((byte) 15);
                            rdj rdjVar = rdj.f30294a;
                            vzb.E(dpi0Var, rdj.g(znq0Var2, efj.UNIVERSAL, Boolean.valueOf(z), false, 56));
                            return new trr(uqrVarR1, jdp0Var3, jdp0Var4, lpmVar, ((h83) dpi0Var.f6468a).h(), kqrVar);
                        }
                        if (!(rpp0Var2 instanceof ppp0)) {
                            t9f.b();
                            return null;
                        }
                        ppp0 ppp0Var = (ppp0) rpp0Var2;
                        xcp0 xcp0VarC0 = b8k0.c0(ppp0Var.e, ppp0Var.g, tcaVar.b);
                        xcp0 xcp0VarC1 = b8k0.c0(ppp0Var.f, ppp0Var.h, tcaVar.c);
                        lpm lpmVar2 = new lpm(qpmVar, new hpm(0L, 3));
                        dpi0 dpi0Var2 = new dpi0((byte) 15);
                        rdj rdjVar2 = rdj.f30294a;
                        vzb.E(dpi0Var2, rdj.g(znq0Var2, efj.UNIVERSAL, Boolean.valueOf(z), false, 56));
                        return new trr(uqrVarR1, xcp0VarC0, xcp0VarC1, lpmVar2, ((h83) dpi0Var2.f6468a).h(), kqrVar);
                    }
                    if (!(mcaVar instanceof xca)) {
                        if (mcaVar instanceof gda) {
                            gda gdaVar = (gda) mcaVar;
                            uqr uqrVarR2 = pzb.r0(mcaVar, str15, str16, str7, str8, jg30Var);
                            znq0 znq0Var3 = new znq0(znq0Var != null ? znq0Var.f44687a : 0L);
                            String strB0 = CollectionsKt.b0(gdaVar.f11094a, Separators.SLASH, null, null, null, 62);
                            String strB1 = CollectionsKt.b0(gdaVar.b, Separators.SLASH, null, null, null, 62);
                            lpm lpmVar3 = new lpm(qpmVar, new hpm(0L, 3));
                            dpi0 dpi0Var3 = new dpi0((byte) 15);
                            rdj rdjVar3 = rdj.f30294a;
                            vzb.E(dpi0Var3, rdj.g(znq0Var3, efj.UNIVERSAL, Boolean.valueOf(z), false, 56));
                            return new rrr(uqrVarR2, strB0, strB1, lpmVar3, ((h83) dpi0Var3.f6468a).h());
                        }
                        if (mcaVar instanceof hda) {
                            hda hdaVar = (hda) mcaVar;
                            uqr uqrVarR3 = pzb.r0(mcaVar, str15, str16, str7, str8, jg30Var);
                            if (bg30Var == null || (pekVar = bg30Var.b) == null) {
                                pekVar = bg30Var != null ? bg30Var.f2536a : new pek();
                            }
                            return new rrr(uqrVarR3, CollectionsKt.b0(hdaVar.f12861a, Separators.SLASH, null, null, null, 62), CollectionsKt.b0(hdaVar.b, Separators.SLASH, null, null, null, 62), mpmVar, vzb.H(ctf0Var2, pekVar, hdaVar.h, hdaVar.i, hdaVar.j, (bg30Var == null || (strN = bg30Var.f2536a.n()) == null) ? "" : strN, hdaVar.g, zBooleanValue3));
                        }
                        if (!(mcaVar instanceof ida)) {
                            t9f.b();
                            return null;
                        }
                        ida idaVar = (ida) mcaVar;
                        uqr uqrVarR4 = pzb.r0(mcaVar, str15, str16, str7, str8, jg30Var);
                        if (!idaVar.g) {
                            if (znq0Var != null) {
                                rdj rdjVar4 = rdj.f30294a;
                                strG = rdj.g(znq0Var, efj.UNIVERSAL, Boolean.valueOf(z), false, 56);
                                if (strG == null) {
                                }
                            }
                            dpi0 dpi0Var6 = new dpi0((byte) 15);
                            vzb.E(dpi0Var6, strG);
                            return new vrr(uqrVarR4, idaVar.e, ((h83) dpi0Var6.f6468a).h());
                        }
                        strA5 = ctf0Var2.b.a(R.string.game_end, Arrays.copyOf(new Object[0], 0));
                        strG = strA5;
                        dpi0 dpi0Var7 = new dpi0((byte) 15);
                        vzb.E(dpi0Var7, strG);
                        return new vrr(uqrVarR4, idaVar.e, ((h83) dpi0Var7.f6468a).h());
                    }
                    if (!gql0.d().contains(Long.valueOf(jLongValue2))) {
                        xca xcaVar = (xca) mcaVar;
                        uqr uqrVarR5 = pzb.r0(mcaVar, str15, str16, str7, str8, jg30Var);
                        if (bg30Var == null || (xakVar = bg30Var.b) == null) {
                            xakVar = bg30Var != null ? bg30Var.f2536a : new xak((byte) 22);
                        }
                        boolean z8 = xcaVar.l;
                        boolean z9 = xcaVar.q;
                        rpp0 rpp0Var3 = xcaVar.f40636a;
                        j83 j83VarH2 = vzb.H(ctf0Var2, xakVar, xcaVar.n, xcaVar.o, xcaVar.p, (bg30Var == null || (strN2 = bg30Var.f2536a.n()) == null) ? "" : strN2, z8, zBooleanValue3);
                        if (!(rpp0Var3 instanceof qpp0)) {
                            if (rpp0Var3 instanceof ppp0) {
                                ppp0 ppp0Var2 = (ppp0) rpp0Var3;
                                return new trr(uqrVarR5, b8k0.c0(ppp0Var2.e, ppp0Var2.g, xcaVar.h), b8k0.c0(ppp0Var2.f, ppp0Var2.h, xcaVar.i), mpmVar, j83VarH2, kqrVar);
                            }
                            t9f.b();
                            return null;
                        }
                        int i8 = xcaVar.b;
                        int i9 = xcaVar.g;
                        int i10 = xcaVar.f;
                        int i11 = xcaVar.d;
                        int i12 = xcaVar.c;
                        vy vyVar = (i8 == 0 && i12 == 0 && i11 == 0) ? null : new vy(i8 > 0 ? Integer.valueOf(i8) : null, i12 > 0 ? Integer.valueOf(i12) : null, i11 > 0 ? Integer.valueOf(i11) : null);
                        int i13 = xcaVar.e;
                        vy vyVar2 = (i13 == 0 && i10 == 0 && i9 == 0) ? null : new vy(i13 > 0 ? Integer.valueOf(i13) : null, i10 > 0 ? Integer.valueOf(i10) : null, i9 > 0 ? Integer.valueOf(i9) : null);
                        boolean z10 = (vyVar == null && vyVar2 == null) ? false : true;
                        if (z10 && vyVar == null) {
                            num = null;
                            vyVar = new vy(null, null, null);
                        } else {
                            num = null;
                        }
                        if (z10 && vyVar2 == null) {
                            vyVar2 = new vy(num, num, num);
                        }
                        qpp0 qpp0Var2 = (qpp0) rpp0Var3;
                        return new trr(uqrVarR5, new jdp0(qpp0Var2.g, n6x.o0(u1c.D(xcaVar, true), qpp0Var2.e, list, zBooleanValue || z9, bap.b), vyVar), new jdp0(qpp0Var2.h, n6x.o0(u1c.D(xcaVar, false), qpp0Var2.f, list, zBooleanValue || z9, bap.f2271a), vyVar2), mpmVar, j83VarH2, kqrVar);
                    }
                    xca xcaVar2 = (xca) mcaVar;
                    long j = znq0Var != null ? znq0Var.f44687a : 0L;
                    uqr uqrVarR6 = pzb.r0(mcaVar, str15, str16, str7, str8, jg30Var);
                    znq0 znq0Var4 = new znq0(j);
                    pz10 pz10Var = bg30Var != null ? bg30Var.f2536a : null;
                    if (pz10Var instanceof nz10) {
                        izm0 izm0Var = bg30Var.b;
                        String str17 = xcaVar2.s;
                        List list2 = xcaVar2.i;
                        List list3 = xcaVar2.h;
                        rpp0 rpp0Var4 = xcaVar2.f40636a;
                        boolean z11 = xcaVar2.l;
                        String str18 = xcaVar2.p;
                        rdj rdjVar5 = rdj.f30294a;
                        pz10 pz10Var2 = pz10Var;
                        String strG2 = rdj.g(znq0Var4, efj.UNIVERSAL, Boolean.valueOf(z), false, 56);
                        str18.getClass();
                        strG2.getClass();
                        dpi0 dpi0Var8 = new dpi0((byte) 15);
                        if (str17 != null) {
                            vzb.E(dpi0Var8, str17);
                            vzb.E(dpi0Var8, ": ");
                            boolean z12 = cy7.c() && zBooleanValue3;
                            if (izm0Var == null) {
                                vzb.E(dpi0Var8, "0");
                                vzb.C(dpi0Var8);
                                vzb.E(dpi0Var8, "0");
                            } else {
                                if (!(izm0Var instanceof gzm0) && !(izm0Var instanceof hzm0)) {
                                    t9f.b();
                                    return null;
                                }
                                boolean z13 = izm0Var instanceof hzm0;
                                String strA6 = z13 ? ((hzm0) izm0Var).g : izm0Var.a();
                                String strB3 = z13 ? ((hzm0) izm0Var).h : izm0Var.b();
                                vzb.E(dpi0Var8, "\u2066");
                                if (z12) {
                                    vzb.D(dpi0Var8, strB3, vzb.L(izm0Var.i()));
                                    vzb.C(dpi0Var8);
                                    vzb.D(dpi0Var8, strA6, vzb.L(izm0Var.j()));
                                } else {
                                    vzb.D(dpi0Var8, strA6, vzb.L(izm0Var.j()));
                                    vzb.C(dpi0Var8);
                                    vzb.D(dpi0Var8, strB3, vzb.L(izm0Var.i()));
                                }
                                vzb.E(dpi0Var8, "\u2069");
                            }
                        } else {
                            vzb.E(dpi0Var8, strG2);
                            if (str18.length() > 0) {
                                vzb.A(dpi0Var8);
                                vzb.E(dpi0Var8, str18);
                            }
                            if (z11) {
                                vzb.A(dpi0Var8);
                                i = 0;
                                vzb.E(dpi0Var8, ctf0Var2.b.a(R.string.game_end, Arrays.copyOf(new Object[0], 0)));
                            } else {
                                i = 0;
                            }
                            if (z5) {
                                vzb.A(dpi0Var8);
                                vzb.E(dpi0Var8, ctf0Var2.b.a(R.string.card_cricket_break, Arrays.copyOf(new Object[i], i)));
                            }
                        }
                        j83 j83VarH3 = ((h83) dpi0Var8.f6468a).h();
                        nz10 nz10Var = (nz10) pz10Var2;
                        boolean z14 = nz10Var instanceof mz10;
                        k5q0 k5q0Var = k5q0.b;
                        if (!z14) {
                            if (nz10Var instanceof oz10) {
                                oz10 oz10Var = (oz10) nz10Var;
                                String str19 = oz10Var.i;
                                String str20 = oz10Var.g;
                                String str21 = oz10Var.m;
                                String str22 = oz10Var.k;
                                boolean z15 = ((StringsKt.W(str22) || str22.equals("0")) && (StringsKt.W(str21) || str21.equals("0"))) ? false : true;
                                boolean z16 = str20.length() > 0 || str19.length() > 0;
                                eex eexVarG = vzb.G(oz10Var.o);
                                ArrayList arrayList5 = oz10Var.f;
                                ArrayList arrayList6 = new ArrayList(r3d.q(arrayList5, 10));
                                Iterator it = arrayList5.iterator();
                                while (it.hasNext()) {
                                    te90 te90Var = (te90) it.next();
                                    arrayList6.add(new yd90(vzb.O(te90Var), vzb.Q(te90Var), te90Var.f33809a));
                                    it = it;
                                    z15 = z15;
                                }
                                boolean z17 = z15;
                                i4 i4VarR1 = dyb.r0(arrayList6);
                                j83 j83VarN = vzb.N(nz10Var);
                                j83 j83VarP = vzb.P(nz10Var);
                                lsm0 lsm0Var2 = ctf0Var2.b;
                                yd90 yd90Var3 = new yd90(j83VarN, j83VarP, lsm0Var2.a(R.string.total_count, Arrays.copyOf(new Object[0], 0)));
                                if (z17) {
                                    h83 h83Var = new h83();
                                    long j2 = y3d.g;
                                    long j3 = daq0.c;
                                    smk0 smk0Var = new smk0(vzb.L(oz10Var.l), j3, null, null, null, null, null, j3, new j56(0.0f), null, null, j2, k5q0Var, null, null, 17424);
                                    h83Var.c(str22);
                                    j83 j83VarC = kng0.c(h83Var.f12607a, h83Var, smk0Var, 0);
                                    h83 h83Var2 = new h83();
                                    smk0 smk0Var2 = new smk0(vzb.L(oz10Var.n), j3, null, null, null, null, null, j3, new j56(0.0f), null, null, j2, k5q0Var, null, null, 17424);
                                    h83Var2.c(str21);
                                    yd90Var = new yd90(j83VarC, kng0.c(h83Var2.f12607a, h83Var2, smk0Var2, 0), lsm0Var2.a(R.string.dt_points, Arrays.copyOf(new Object[0], 0)));
                                } else {
                                    yd90Var = null;
                                }
                                if (z16) {
                                    h83 h83Var3 = new h83();
                                    long j4 = y3d.g;
                                    long j5 = daq0.c;
                                    smk0 smk0Var3 = new smk0(vzb.L(oz10Var.h), j5, null, null, null, null, null, j5, new j56(0.0f), null, null, j4, k5q0Var, null, null, 17424);
                                    h83Var3.c(str20);
                                    j83 j83VarC2 = kng0.c(h83Var3.f12607a, h83Var3, smk0Var3, 0);
                                    h83 h83Var4 = new h83();
                                    smk0 smk0Var4 = new smk0(vzb.L(oz10Var.j), j5, null, null, null, null, null, j5, new j56(0.0f), null, null, j4, k5q0Var, null, null, 17424);
                                    h83Var4.c(str19);
                                    yd90Var2 = new yd90(j83VarC2, kng0.c(h83Var4.f12607a, h83Var4, smk0Var4, 0), lsm0Var2.a(R.string.tennis_game_column, Arrays.copyOf(new Object[0], 0)));
                                } else {
                                    yd90Var2 = null;
                                }
                                iul0Var2 = new iul0(eexVarG, i4VarR1, yd90Var3, yd90Var2, yd90Var);
                            } else {
                                if (!(nz10Var instanceof kz10)) {
                                    t9f.b();
                                    return null;
                                }
                                kz10 kz10Var = (kz10) nz10Var;
                                eex eexVarG2 = vzb.G(kz10Var.g);
                                ArrayList<te90> arrayList7 = kz10Var.f;
                                ArrayList arrayList8 = new ArrayList(r3d.q(arrayList7, 10));
                                for (te90 te90Var2 : arrayList7) {
                                    arrayList8.add(new yd90(vzb.O(te90Var2), vzb.Q(te90Var2), te90Var2.f33809a));
                                }
                                iul0Var = new iul0(eexVarG2, dyb.r0(arrayList8), new yd90(vzb.N(nz10Var), vzb.P(nz10Var), ctf0Var2.b.a(R.string.total_count, Arrays.copyOf(new Object[0], 0))), null, null);
                            }
                            if (rpp0Var4 instanceof qpp0) {
                                if (rpp0Var4 instanceof ppp0) {
                                    ppp0 ppp0Var5 = (ppp0) rpp0Var4;
                                    return new xrr(uqrVarR6, b8k0.c0(ppp0Var5.e, ppp0Var5.g, list3), b8k0.c0(ppp0Var5.f, ppp0Var5.h, list2), j83VarH3, iul0Var2);
                                }
                                t9f.b();
                                return null;
                            }
                            qpp0 qpp0Var5 = (qpp0) rpp0Var4;
                            String str29 = qpp0Var5.g;
                            str3 = (String) CollectionsKt.firstOrNull(list3);
                            if (str3 == null) {
                                str3 = "";
                            }
                            c280 c280Var4 = new c280(vsm0.s(qpp0Var5.e, str3), R.drawable.ic_glyph_placeholder_player);
                            long j10 = qpp0Var5.e;
                            bap bapVar4 = bap.b;
                            jdp0 jdp0Var7 = new jdp0(str29, n6x.o0(c280Var4, j10, list, zBooleanValue, bapVar4), null);
                            String str210 = qpp0Var5.h;
                            str4 = (String) CollectionsKt.firstOrNull(list2);
                            if (str4 == null) {
                                str4 = "";
                            }
                            return new xrr(uqrVarR6, jdp0Var7, new jdp0(str210, n6x.o0(new c280(vsm0.s(qpp0Var5.f, str4), R.drawable.ic_glyph_placeholder_player), qpp0Var5.f, list, zBooleanValue, bapVar4), null), j83VarH3, iul0Var2);
                        }
                        mz10 mz10Var = (mz10) nz10Var;
                        eex eexVarG3 = vzb.G(mz10Var.g);
                        ArrayList<te90> arrayList9 = mz10Var.f;
                        ArrayList arrayList10 = new ArrayList(r3d.q(arrayList9, 10));
                        for (te90 te90Var3 : arrayList9) {
                            arrayList10.add(new yd90(vzb.O(te90Var3), vzb.Q(te90Var3), te90Var3.f33809a));
                        }
                        i4 i4VarR2 = dyb.r0(arrayList10);
                        j83 j83VarN2 = vzb.N(nz10Var);
                        j83 j83VarP2 = vzb.P(nz10Var);
                        lsm0 lsm0Var3 = ctf0Var2.b;
                        yd90 yd90Var4 = new yd90(j83VarN2, j83VarP2, lsm0Var3.a(R.string.total_count, Arrays.copyOf(new Object[0], 0)));
                        h83 h83Var5 = new h83();
                        String str25 = mz10Var.h;
                        long j7 = y3d.g;
                        long j8 = daq0.c;
                        smk0 smk0Var5 = new smk0(vzb.L(mz10Var.i), j8, null, null, null, null, null, j8, new j56(0.0f), null, null, j7, k5q0Var, null, null, 17424);
                        h83Var5.c(str25);
                        j83 j83VarC3 = kng0.c(h83Var5.f12607a, h83Var5, smk0Var5, 0);
                        h83 h83Var6 = new h83();
                        String str26 = mz10Var.j;
                        smk0 smk0Var6 = new smk0(vzb.L(mz10Var.k), j8, null, null, null, null, null, j8, new j56(0.0f), null, null, j7, k5q0Var, null, null, 17424);
                        h83Var6.c(str26);
                        iul0Var = new iul0(eexVarG3, i4VarR2, yd90Var4, null, new yd90(j83VarC3, kng0.c(h83Var6.f12607a, h83Var6, smk0Var6, 0), lsm0Var3.a(R.string.dt_points, Arrays.copyOf(new Object[0], 0))));
                        iul0Var2 = iul0Var;
                        if (rpp0Var4 instanceof qpp0) {
                            if (rpp0Var4 instanceof ppp0) {
                                ppp0 ppp0Var6 = (ppp0) rpp0Var4;
                                return new xrr(uqrVarR6, b8k0.c0(ppp0Var6.e, ppp0Var6.g, list3), b8k0.c0(ppp0Var6.f, ppp0Var6.h, list2), j83VarH3, iul0Var2);
                            }
                            t9f.b();
                            return null;
                        }
                        qpp0 qpp0Var6 = (qpp0) rpp0Var4;
                        String str211 = qpp0Var6.g;
                        str3 = (String) CollectionsKt.firstOrNull(list3);
                        if (str3 == null) {
                            str3 = "";
                        }
                        c280 c280Var5 = new c280(vsm0.s(qpp0Var6.e, str3), R.drawable.ic_glyph_placeholder_player);
                        long j11 = qpp0Var6.e;
                        bap bapVar5 = bap.b;
                        jdp0 jdp0Var8 = new jdp0(str211, n6x.o0(c280Var5, j11, list, zBooleanValue, bapVar5), null);
                        String str212 = qpp0Var6.h;
                        str4 = (String) CollectionsKt.firstOrNull(list2);
                        if (str4 == null) {
                            str4 = "";
                        }
                        return new xrr(uqrVarR6, jdp0Var8, new jdp0(str212, n6x.o0(new c280(vsm0.s(qpp0Var6.f, str4), R.drawable.ic_glyph_placeholder_player), qpp0Var6.f, list, zBooleanValue, bapVar5), null), j83VarH3, iul0Var2);
                    }
                }
                return qrr.f29223a;
            }

            /* JADX WARN: Code duplicated, block: B:18:0x008a  */
            private final Object b(Object obj) {
                String strG;
                lz10 lz10Var;
                float f;
                fad dadVar;
                sad qadVar;
                j83 j83VarC;
                j83 j83VarC2;
                gna gnaVar = (gna) obj;
                if (gnaVar == null) {
                    return null;
                }
                if (!(gnaVar instanceof ena)) {
                    if (gnaVar instanceof fna) {
                        return null;
                    }
                    t9f.b();
                    return null;
                }
                ena enaVar = (ena) gnaVar;
                mca mcaVar = enaVar.f8084a;
                rjs rjsVar = this.b;
                jg30 jg30Var = (jg30) ((fee) rjsVar.H.getValue()).b();
                bg30 bg30Var = (bg30) ((fee) rjsVar.I.getValue()).c();
                pz10 pz10Var = bg30Var != null ? bg30Var.f2536a : null;
                ctf0 ctf0Var2 = rjsVar.f30611a;
                boolean z = enaVar.p;
                znq0 znq0Var = (znq0) ((fee) rjsVar.t.getValue()).c();
                boolean zBooleanValue = ((Boolean) ((fee) rjsVar.v.getValue()).c()).booleanValue();
                ctf0Var2.getClass();
                dja djaVar = dja.PENALTY;
                k5q0 k5q0Var = k5q0.b;
                if (jg30Var != null) {
                    dadVar = new ead(jg30Var);
                    f = 0.0f;
                    lz10Var = null;
                } else {
                    h83 h83Var = new h83();
                    if (znq0Var != null) {
                        rdj rdjVar = rdj.f30294a;
                        strG = rdj.g(znq0Var, efj.UNIVERSAL, Boolean.valueOf(z), false, 56);
                        if (strG == null) {
                            strG = "";
                        }
                    } else {
                        strG = "";
                    }
                    pz40 pz40Var = s6t0.f31722a;
                    long textPrimary = s6t0.b().f33626a.getTextPrimary();
                    h83 h83Var2 = new h83();
                    long j = y3d.g;
                    long j2 = daq0.c;
                    lz10Var = null;
                    f = 0.0f;
                    smk0 smk0Var = new smk0(textPrimary, j2, null, null, null, null, null, j2, new j56(0.0f), null, null, j, k5q0Var, null, null, 17424);
                    h83Var2.c(strG);
                    StringBuilder sb = h83Var2.f12607a;
                    h83Var2.a(smk0Var, 0, sb.length());
                    sb.length();
                    h83Var.b(h83Var2.h());
                    dadVar = new dad(h83Var.h());
                }
                d3h0 cl5Var = pz10Var;
                if (mcaVar instanceof pca) {
                    if (pz10Var == null) {
                        cl5Var = new cl5((byte) 28);
                    }
                    rpp0 rpp0Var = ((pca) mcaVar).f26749a;
                    String strB = rpp0Var.b();
                    String strD = rpp0Var.d();
                    boolean z2 = cl5Var instanceof lz10;
                    lz10 lz10Var2 = z2 ? (lz10) cl5Var : lz10Var;
                    String strT = lz10Var2 != null ? vzb.T(lz10Var2, zBooleanValue) : "0";
                    lz10 lz10Var3 = z2 ? (lz10) cl5Var : lz10Var;
                    qadVar = new pad(strB, strD, strT, lz10Var3 != null ? vzb.U(lz10Var3, zBooleanValue) : "0", cl5Var.j(), cl5Var.i());
                } else if (mcaVar instanceof tca) {
                    rpp0 rpp0Var2 = ((tca) mcaVar).f33711a;
                    String strB2 = rpp0Var2.b();
                    String strD2 = rpp0Var2.d();
                    h83 h83Var3 = new h83();
                    String strA = ctf0Var2.b.a(R.string.vs, Arrays.copyOf(new Object[0], 0));
                    long j3 = y3d.g;
                    long j4 = daq0.c;
                    pz40 pz40Var2 = s6t0.f31722a;
                    smk0 smk0Var2 = new smk0(s6t0.b().f33626a.getTextPrimary(), j4, null, null, null, null, null, j4, new j56(f), null, null, j3, k5q0Var, null, null, 17424);
                    h83Var3.c(strA);
                    qadVar = new rad(kng0.c(h83Var3.f12607a, h83Var3, smk0Var2, 0), strB2, strD2);
                } else if (mcaVar instanceof xca) {
                    rpp0 rpp0Var3 = ((xca) mcaVar).f40636a;
                    String strB3 = rpp0Var3.b();
                    String strD3 = rpp0Var3.d();
                    if (pz10Var != null) {
                        j83VarC2 = vzb.M(pz10Var);
                    } else {
                        h83 h83Var4 = new h83();
                        String strA2 = ctf0Var2.b.a(R.string.vs, Arrays.copyOf(new Object[0], 0));
                        long j5 = y3d.g;
                        long j6 = daq0.c;
                        pz40 pz40Var3 = s6t0.f31722a;
                        smk0 smk0Var3 = new smk0(s6t0.b().f33626a.getTextPrimary(), j6, null, null, null, null, null, j6, new j56(f), null, null, j5, k5q0Var, null, null, 17424);
                        h83Var4.c(strA2);
                        j83VarC2 = kng0.c(h83Var4.f12607a, h83Var4, smk0Var3, 0);
                    }
                    qadVar = new rad(j83VarC2, strB3, strD3);
                } else if (mcaVar instanceof gda) {
                    gda gdaVar = (gda) mcaVar;
                    String strB0 = CollectionsKt.b0(gdaVar.f11094a, Separators.SLASH, null, null, null, 62);
                    String strB1 = CollectionsKt.b0(gdaVar.b, Separators.SLASH, null, null, null, 62);
                    h83 h83Var5 = new h83();
                    String strA3 = ctf0Var2.b.a(R.string.vs, Arrays.copyOf(new Object[0], 0));
                    long j7 = y3d.g;
                    long j8 = daq0.c;
                    pz40 pz40Var4 = s6t0.f31722a;
                    smk0 smk0Var4 = new smk0(s6t0.b().f33626a.getTextPrimary(), j8, null, null, null, null, null, j8, new j56(f), null, null, j7, k5q0Var, null, null, 17424);
                    h83Var5.c(strA3);
                    qadVar = new rad(kng0.c(h83Var5.f12607a, h83Var5, smk0Var4, 0), strB0, strB1);
                } else if (mcaVar instanceof hda) {
                    hda hdaVar = (hda) mcaVar;
                    String strB4 = CollectionsKt.b0(hdaVar.f12861a, Separators.SLASH, null, null, null, 62);
                    String strB5 = CollectionsKt.b0(hdaVar.b, Separators.SLASH, null, null, null, 62);
                    if (pz10Var != null) {
                        j83VarC = vzb.M(pz10Var);
                    } else {
                        h83 h83Var6 = new h83();
                        String strA4 = ctf0Var2.b.a(R.string.vs, Arrays.copyOf(new Object[0], 0));
                        long j9 = y3d.g;
                        long j10 = daq0.c;
                        pz40 pz40Var5 = s6t0.f31722a;
                        smk0 smk0Var5 = new smk0(s6t0.b().f33626a.getTextPrimary(), j10, null, null, null, null, null, j10, new j56(f), null, null, j9, k5q0Var, null, null, 17424);
                        h83Var6.c(strA4);
                        j83VarC = kng0.c(h83Var6.f12607a, h83Var6, smk0Var5, 0);
                    }
                    qadVar = new rad(j83VarC, strB4, strB5);
                } else {
                    if (!(mcaVar instanceof ida)) {
                        t9f.b();
                        return lz10Var;
                    }
                    qadVar = new qad(((ida) mcaVar).e);
                }
                return new dax(dadVar, qadVar);
            }

            /* JADX WARN: Code duplicated, block: B:140:0x0381  */
            /* JADX WARN: Code duplicated, block: B:70:0x01a8  */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                kc50 kc50Var;
                p700 p700Var;
                ena enaVar;
                uia uiaVar;
                String strA;
                String strC;
                String strC2;
                zvl0 zvl0Var;
                yja yjaVar;
                qal0 qal0Var;
                Object b0k0Var;
                i49 g49Var;
                dxh0 dxh0Var;
                hna hnaVar;
                lmo lmoVar;
                byte b4 = b3;
                int i = 0;
                rjs rjsVar = this.b;
                switch (b4) {
                    case 0:
                        List list = (List) obj;
                        list.getClass();
                        boolean zBooleanValue = ((Boolean) ((fee) rjsVar.c.getValue()).c()).booleanValue();
                        boolean zBooleanValue2 = ((Boolean) ((fee) rjsVar.e.getValue()).c()).booleanValue();
                        boolean zBooleanValue3 = ((Boolean) ((fee) rjsVar.f.getValue()).c()).booleanValue();
                        tf50 tf50Var = (tf50) ((fee) rjsVar.d.getValue()).c();
                        tf50Var.getClass();
                        if (!list.contains(tf50Var)) {
                            tf50Var = tf50.f33851a;
                        }
                        boolean z = !zBooleanValue2;
                        kc50 kc50Var2 = new kc50(R.drawable.ic_glyph_rectangular_scoreboard, tf50Var == tf50.f33851a);
                        tf50 tf50Var2 = tf50.b;
                        kc50 kc50Var3 = list.contains(tf50Var2) ? new kc50(R.drawable.ic_glyph_rectangular_broadcast, tf50Var == tf50Var2) : null;
                        tf50 tf50Var3 = tf50.c;
                        if (list.contains(tf50Var3)) {
                            kc50Var = new kc50(R.drawable.ic_glyph_rectangular_statistic, tf50Var == tf50Var3);
                        } else {
                            kc50Var = null;
                        }
                        return new ojs(zBooleanValue, z, zBooleanValue, zBooleanValue3, new hjs(kc50Var2, kc50Var3, kc50Var, tf50Var));
                    case 1:
                        n0o0 n0o0Var = rjsVar.o;
                        gna gnaVar = (gna) obj;
                        if ((gnaVar instanceof ena ? (ena) gnaVar : null) == null || (p700Var = ((ena) gnaVar).l) == null) {
                            return null;
                        }
                        List list2 = p700Var.e;
                        List list3 = (List) ((fee) n0o0Var.getValue()).c();
                        ch00 ch00Var = ch00.LAST_GAMES;
                        boolean zContains = list3.contains(ch00Var);
                        List list4 = (List) ((fee) n0o0Var.getValue()).c();
                        ch00 ch00Var2 = ch00.LAST_GAMES_OPP_ONE;
                        boolean zContains2 = list4.contains(ch00Var2);
                        List list5 = (List) ((fee) n0o0Var.getValue()).c();
                        ch00 ch00Var3 = ch00.LAST_GAMES_OPP_TWO;
                        boolean zContains3 = list5.contains(ch00Var3);
                        ctf0 ctf0Var2 = rjsVar.f30611a;
                        ctf0Var2.getClass();
                        ArrayList arrayList = new ArrayList();
                        List list6 = p700Var.g;
                        List list7 = p700Var.f;
                        if (!list2.isEmpty()) {
                            arrayList.add(z1x.T(list2, ctf0Var2, ctf0Var2.b.a(R.string.previous_meetings, Arrays.copyOf(new Object[0], 0)), ch00Var, zContains));
                        }
                        if (!list7.isEmpty()) {
                            arrayList.add(z1x.T(list7, ctf0Var2, kng0.l(ctf0Var2.b.a(R.string.last_games, Arrays.copyOf(new Object[0], 0)), ": ", p700Var.c), ch00Var2, zContains2));
                        }
                        if (!list6.isEmpty()) {
                            arrayList.add(z1x.T(list6, ctf0Var2, kng0.l(ctf0Var2.b.a(R.string.last_games, Arrays.copyOf(new Object[0], 0)), ": ", p700Var.d), ch00Var3, zContains3));
                        }
                        return arrayList;
                    case 2:
                        gna gnaVar2 = (gna) obj;
                        if ((gnaVar2 instanceof ena ? (ena) gnaVar2 : null) == null || (uiaVar = (enaVar = (ena) gnaVar2).h) == null) {
                            return null;
                        }
                        ctf0 ctf0Var3 = rjsVar.f30611a;
                        boolean z2 = enaVar.p;
                        ctf0Var3.getClass();
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it = uiaVar.c.iterator();
                        int i2 = 0;
                        while (it.hasNext()) {
                            Object next = it.next();
                            int i3 = i2 + 1;
                            if (i2 < 0) {
                                q3d.p();
                                throw null;
                            }
                            bsw bswVar = (bsw) next;
                            String str = bswVar.b;
                            String str2 = bswVar.e;
                            String strA2 = (str.length() <= 0 || str2.length() <= 0) ? ctf0Var3.b.a(R.string.vs, Arrays.copyOf(new Object[0], 0)) : w6x.q(bswVar.b, " : ", str2);
                            odp0 odp0Var = new odp0(new d5a0(new c280(bswVar.c, R.drawable.ic_glyph_placeholder_player)));
                            String strM = dw9.m(i3, ". ", bswVar.f3153a);
                            odp0 odp0Var2 = new odp0(new d5a0(new c280(bswVar.f, R.drawable.ic_glyph_placeholder_player)));
                            String strM2 = dw9.m(i3, ". ", bswVar.d);
                            rdj rdjVar = rdj.f30294a;
                            arrayList2.add(new hzy(odp0Var, strM, odp0Var2, strM2, rdj.g(new znq0(bswVar.g), efj.UNIVERSAL, Boolean.valueOf(z2), false, 56), strA2, "", null, null));
                            it = it;
                            i2 = i3;
                        }
                        dja djaVar = dja.PENALTY;
                        return new eax(dyb.o0(arrayList2), uiaVar.f35722a, uiaVar.b);
                    case 3:
                        anq0 anq0Var2 = (anq0) obj;
                        if (anq0Var2 != null) {
                            boolean z3 = ((Boolean) ((fee) rjsVar.g.getValue()).c()).booleanValue() || ((Boolean) ((fee) rjsVar.h.getValue()).c()).booleanValue();
                            ctf0 ctf0Var4 = rjsVar.f30611a;
                            ctf0Var4.getClass();
                            long j = anq0Var2.e;
                            long j2 = anq0Var2.d;
                            boolean z4 = anq0Var2.j;
                            if (j != 0 || !z4) {
                                String str3 = anq0Var2.c;
                                if (z4) {
                                    if (str3.length() > 0) {
                                        strA = ctf0Var4.b.a(R.string.live_additional_min_v2, Arrays.copyOf(new Object[]{str3}, 1));
                                    } else if (anq0Var2.f1167a) {
                                        strA = "";
                                    } else {
                                        strA = anq0Var2.b ? ctf0Var4.b.a(R.string.line_live_time_period_back_v2, Arrays.copyOf(new Object[]{""}, 1)) : ctf0Var4.b.a(R.string.line_live_time_period_capitalized_v2, Arrays.copyOf(new Object[]{""}, 1));
                                    }
                                } else if (j2 < 0) {
                                    strA = ctf0Var4.b.a(R.string.game_started, Arrays.copyOf(new Object[0], 0));
                                } else {
                                    long j3 = j2 / 86400;
                                    strA = j3 > 0 ? ctf0Var4.b.a(R.string.line_time_before_v2, Arrays.copyOf(new Object[]{String.valueOf(j3)}, 1)) : ctf0Var4.b.a(R.string.before_start, Arrays.copyOf(new Object[0], 0));
                                }
                                String strC3 = (z3 || z4 || j2 < 0) ? null : n2x.C((((j2 < 0 ? 0L : j2) / 60) / 60) % 24);
                                if (z3) {
                                    strC = null;
                                } else {
                                    long jB = (z4 ? vzb.V(anq0Var2).b() : j2 < 0 ? 0L : j2) / 60;
                                    if (!z4) {
                                        jB %= 60;
                                    }
                                    strC = n2x.C(jB);
                                }
                                if (z3) {
                                    strC2 = null;
                                } else {
                                    strC2 = n2x.C((z4 ? vzb.V(anq0Var2).b() : j2 >= 0 ? j2 : 0L) % 60);
                                }
                                return new jg30(strA, strC3, strC, strC2);
                            }
                        }
                        return null;
                    case 4:
                        gna gnaVar3 = (gna) obj;
                        ena enaVar2 = gnaVar3 instanceof ena ? (ena) gnaVar3 : null;
                        if (enaVar2 == null || (zvl0Var = ((ena) gnaVar3).k) == null) {
                            return null;
                        }
                        String str4 = zvl0Var.m;
                        String str5 = enaVar2.q;
                        ctf0 ctf0Var5 = rjsVar.f30611a;
                        m1v0 m1v0Var = (m1v0) ((fee) rjsVar.J.getValue()).b();
                        str5.getClass();
                        ctf0Var5.getClass();
                        String str6 = zvl0Var.f45064a;
                        Pair pair = str4.length() > 0 ? new Pair(str4, ctf0Var5.b.a(R.string.web_site, Arrays.copyOf(new Object[0], 0))) : new Pair(null, null);
                        String str7 = (String) pair.f46059a;
                        String str8 = (String) pair.b;
                        dja djaVar2 = dja.PENALTY;
                        String str9 = zvl0Var.b;
                        ArrayList arrayList3 = new ArrayList();
                        String str10 = zvl0Var.l;
                        String str11 = zvl0Var.k;
                        String str12 = zvl0Var.j;
                        String str13 = zvl0Var.i;
                        String str14 = zvl0Var.h;
                        String str15 = zvl0Var.g;
                        String str16 = zvl0Var.f;
                        String str17 = zvl0Var.e;
                        String str18 = zvl0Var.d;
                        String str19 = zvl0Var.c;
                        if (str6.length() > 0) {
                            arrayList3.add(l7x.J(ctf0Var5, str6, R.string.address));
                        }
                        if (str19.length() > 0) {
                            arrayList3.add(l7x.J(ctf0Var5, str19, R.string.capacity));
                        }
                        if (str18.length() > 0) {
                            arrayList3.add(l7x.J(ctf0Var5, str18, R.string.covering));
                        }
                        if (str17.length() > 0) {
                            arrayList3.add(l7x.J(ctf0Var5, str17, R.string.city_name));
                        }
                        if (str16.length() > 0) {
                            arrayList3.add(l7x.J(ctf0Var5, str16, R.string.architect));
                        }
                        if (str15.length() > 0) {
                            arrayList3.add(l7x.J(ctf0Var5, str15, R.string.old_name));
                        }
                        if (str14.length() > 0) {
                            arrayList3.add(l7x.J(ctf0Var5, str14, R.string.category));
                        }
                        if (str13.length() > 0) {
                            arrayList3.add(l7x.J(ctf0Var5, str13, R.string.history));
                        }
                        if (str12.length() > 0) {
                            arrayList3.add(l7x.J(ctf0Var5, str12, R.string.opened));
                        }
                        if (str11.length() > 0) {
                            arrayList3.add(l7x.J(ctf0Var5, str11, R.string.zip_code));
                        }
                        if (str10.length() > 0) {
                            arrayList3.add(l7x.J(ctf0Var5, "\u2066" + str10 + "\u2069", R.string.phone));
                        }
                        a4x a4xVarO0 = dyb.o0(arrayList3);
                        List list8 = zvl0Var.n;
                        ArrayList arrayList4 = new ArrayList(r3d.q(list8, 10));
                        Iterator it2 = list8.iterator();
                        while (it2.hasNext()) {
                            arrayList4.add(String.format(Locale.ENGLISH, "%s/sfiles/stadium/%s", Arrays.copyOf(new Object[]{str5, (String) it2.next()}, 2)));
                        }
                        a4x a4xVarO1 = dyb.o0(arrayList4);
                        if (a4xVarO1.isEmpty()) {
                            a4xVarO1 = dyb.g0("");
                        }
                        return new iax(m1v0Var, str9, a4xVarO0, str7, str8, a4xVarO1);
                    case 5:
                        gna gnaVar4 = (gna) obj;
                        if ((gnaVar4 instanceof ena ? (ena) gnaVar4 : null) != null && (yjaVar = ((ena) gnaVar4).i) != null) {
                            List list9 = yjaVar.f42730a;
                            if (!list9.isEmpty()) {
                                long jLongValue = ((Number) ((fee) rjsVar.m.getValue()).c()).longValue();
                                lc00 lc00VarB = kotlin.collections.a.b();
                                Iterator it3 = list9.iterator();
                                while (it3.hasNext()) {
                                    he30 he30Var = (he30) it3.next();
                                    List list10 = he30Var.b;
                                    ArrayList arrayList5 = new ArrayList();
                                    for (Object obj2 : list10) {
                                        if (((ge30) obj2).e.length() > 0) {
                                            arrayList5.add(obj2);
                                        }
                                    }
                                    if (!arrayList5.isEmpty()) {
                                        lc00VarB.add(new uim(he30Var.f12902a));
                                        int i4 = i;
                                        for (Object obj3 : arrayList5) {
                                            int i5 = i4 + 1;
                                            if (i4 < 0) {
                                                q3d.p();
                                                throw null;
                                            }
                                            ge30 ge30Var = (ge30) obj3;
                                            String str20 = ge30Var.f11132a;
                                            String str21 = ge30Var.e;
                                            String str22 = ge30Var.c;
                                            String str23 = ge30Var.d;
                                            tho thoVar = ge30Var.b;
                                            Iterator it4 = it3;
                                            List listSplit$default = StringsKt__StringsKt.split$default(str20, new String[]{"+"}, false, i, 6, null);
                                            long j4 = jLongValue;
                                            List listSplit$default2 = StringsKt__StringsKt.split$default(str20, new String[]{Separators.COLON}, false, i, 6, null);
                                            if (j4 == 1) {
                                                if (listSplit$default.size() == 2 && listSplit$default2.size() == 1) {
                                                    str20 = listSplit$default.get(0) + "'+" + kotlin.text.c.r((String) listSplit$default.get(1), Separators.QUOTE, "", false);
                                                } else if (listSplit$default2.size() == 2) {
                                                    str20 = listSplit$default2.get(0) + Separators.QUOTE;
                                                }
                                            }
                                            y6n y6nVar = ge30Var.j == 0 ? y6n.f42107a : y6n.b;
                                            ggm ggmVar = i4 == 0 ? arrayList5.size() + (-1) == 0 ? ggm.c : ggm.f11256a : i4 == arrayList5.size() + (-1) ? ggm.b : ggm.d;
                                            lc00VarB.add((str23.length() == 0 && str22.length() == 0) ? new sim(str20, str21, thoVar.name(), y6nVar, ggmVar, ge30Var.b()) : new rim(str20, str21, new lnm(str23, str22, 0, "", new s0m("", ""), ge30Var.k), ge30Var.a() ? new lnm(ge30Var.h, ge30Var.g, 0, "", new s0m("", ""), ge30Var.l) : null, thoVar.name(), null, y6nVar, ggmVar, ge30Var.b()));
                                            it3 = it4;
                                            i4 = i5;
                                            jLongValue = j4;
                                            i = 0;
                                        }
                                    }
                                    it3 = it3;
                                    jLongValue = jLongValue;
                                    i = 0;
                                }
                                i4 i4VarR0 = dyb.r0(kotlin.collections.a.a(lc00VarB));
                                dja djaVar3 = dja.PENALTY;
                                return new gax(new sf30(i4VarR0));
                            }
                        }
                        return null;
                    case 6:
                        vzj0 vzj0Var = (vzj0) obj;
                        if (!(((fee) rjsVar.B.getValue()).b() instanceof qrr) && vzj0Var != null) {
                            anq0 anq0Var3 = (anq0) ((fee) rjsVar.H.getValue()).c();
                            ctf0 ctf0Var6 = rjsVar.f30611a;
                            ctf0Var6.getClass();
                            znq0 znq0Var = anq0Var3 != null ? anq0Var3.h : null;
                            if (znq0Var != null) {
                                long j5 = znq0Var.f44687a;
                                if (j5 <= 0) {
                                    qal0Var = null;
                                } else {
                                    long j6 = j5 / 86400;
                                    qal0Var = new qal0(j6 > 0 ? ctf0Var6.b.a(R.string.line_time_before_v2, Arrays.copyOf(new Object[]{String.valueOf(j6)}, 1)) : ctf0Var6.b.a(R.string.before_start, Arrays.copyOf(new Object[0], 0)), yyw.L((((j5 < 0 ? 0L : j5) / 60) / 60) % 24), yyw.L(((j5 < 0 ? 0L : j5) / 60) % 60), yyw.L((j5 >= 0 ? j5 : 0L) % 60));
                                }
                            } else {
                                qal0Var = null;
                            }
                            if (vzj0Var instanceof tzj0) {
                                tzj0 tzj0Var = (tzj0) vzj0Var;
                                b0k0Var = new yzj0(tzj0Var.f34807a, tzj0Var.b, tzj0Var.c, tzj0Var.d, qal0Var);
                            } else if (vzj0Var instanceof uzj0) {
                                uzj0 uzj0Var = (uzj0) vzj0Var;
                                b0k0Var = new b0k0(uzj0Var.f36538a, uzj0Var.b, uzj0Var.c, uzj0Var.d, qal0Var);
                            } else {
                                t9f.b();
                            }
                            return b0k0Var;
                        }
                        return null;
                    case 7:
                        boolean zBooleanValue4 = ((Boolean) obj).booleanValue();
                        long jLongValue2 = ((Number) ((fee) rjsVar.j.getValue()).c()).longValue();
                        boolean zBooleanValue5 = ((Boolean) ((fee) rjsVar.i.getValue()).c()).booleanValue();
                        long jLongValue3 = ((Number) ((fee) rjsVar.k.getValue()).c()).longValue();
                        long jLongValue4 = ((Number) ((fee) rjsVar.m.getValue()).c()).longValue();
                        Long l = (Long) ((fee) rjsVar.l.getValue()).c();
                        long jLongValue5 = l != null ? l.longValue() : -1L;
                        if (zBooleanValue4) {
                            return new sym0(new MarketsCategoriesParams(jLongValue2, jLongValue3, jLongValue4, new zq2(), "", zBooleanValue5));
                        }
                        tef0 tef0Var = tef0.f33818a;
                        xuz xuzVar = pb10.c;
                        return new vym0(new RelatedParams(zBooleanValue5, jLongValue2, jLongValue4, -1L, jLongValue5, tef0Var));
                    case 8:
                        return a(obj);
                    case 9:
                        fsr fsrVar = (fsr) obj;
                        if ((fsrVar == null || !fsrVar.b) && (fsrVar == null || !fsrVar.c)) {
                            return k49.f17656a;
                        }
                        o49 o49Var = (o49) ((fee) rjsVar.y.getValue()).c();
                        ctf0 ctf0Var7 = rjsVar.f30611a;
                        zvh0 zvh0Var2 = rjsVar.b;
                        fsrVar.getClass();
                        ctf0Var7.getClass();
                        ArrayList arrayList6 = new ArrayList();
                        if (fsrVar.b) {
                            arrayList6.add(new g49(ctf0Var7.b.a(R.string.video, Arrays.copyOf(new Object[0], 0))));
                        }
                        if (fsrVar.c) {
                            arrayList6.add(new h49(ctf0Var7.b.a(R.string.play_zone, Arrays.copyOf(new Object[0], 0))));
                        }
                        if (o49Var == null) {
                            g49Var = (i49) CollectionsKt.U(arrayList6);
                        } else {
                            int iOrdinal = o49Var.ordinal();
                            if (iOrdinal == 0) {
                                g49Var = new g49(ctf0Var7.b.a(R.string.video, Arrays.copyOf(new Object[0], 0)));
                            } else {
                                if (iOrdinal != 1) {
                                    t9f.b();
                                    return null;
                                }
                                g49Var = new h49(ctf0Var7.b.a(R.string.play_zone, Arrays.copyOf(new Object[0], 0)));
                            }
                            if (arrayList6.isEmpty()) {
                                g49Var = null;
                            } else {
                                Iterator it5 = arrayList6.iterator();
                                do {
                                    if (!it5.hasNext()) {
                                        g49Var = null;
                                    }
                                } while (!Intrinsics.d((i49) it5.next(), g49Var));
                            }
                            if (g49Var == null) {
                                g49Var = (i49) CollectionsKt.U(arrayList6);
                            }
                        }
                        bfu0 bfu0Var = fsrVar.f10077a;
                        GameBroadcastingParams gameBroadcastingParams = new GameBroadcastingParams(bfu0Var.f2522a, bfu0Var.c, bfu0Var.f, bfu0Var.b, bfu0Var.e, bfu0Var.d, bfu0Var.g, null);
                        Iterator it6 = arrayList6.iterator();
                        int i6 = 0;
                        while (true) {
                            if (!it6.hasNext()) {
                                i6 = -1;
                            } else if (!Intrinsics.d((i49) it6.next(), g49Var)) {
                                i6++;
                            }
                        }
                        int i7 = i6;
                        i4 i4VarR1 = dyb.r0(arrayList6);
                        boolean z5 = arrayList6.size() > 1;
                        int iOrdinal2 = zvh0Var2.ordinal();
                        if (iOrdinal2 == 0) {
                            dxh0Var = axh0.f1625a;
                        } else if (iOrdinal2 == 1) {
                            dxh0Var = zwh0.f45106a;
                        } else if (iOrdinal2 == 2) {
                            dxh0Var = cxh0.f5122a;
                        } else {
                            if (iOrdinal2 != 3) {
                                t9f.b();
                                return null;
                            }
                            dxh0Var = bxh0.f3376a;
                        }
                        dxh0 dxh0Var2 = dxh0Var;
                        ArrayList arrayList7 = new ArrayList(r3d.q(arrayList6, 10));
                        Iterator it7 = arrayList6.iterator();
                        while (it7.hasNext()) {
                            arrayList7.add(new yvh0(((i49) it7.next()).getDescription(), bwh0.f3325a));
                        }
                        return new j49(gameBroadcastingParams, i7, g49Var, i4VarR1, z5, dxh0Var2, dyb.r0(arrayList7));
                    case 10:
                        return b(obj);
                    default:
                        gna gnaVar5 = (gna) obj;
                        if ((gnaVar5 instanceof ena ? (ena) gnaVar5 : null) == null || (hnaVar = ((ena) gnaVar5).j) == null) {
                            return null;
                        }
                        boolean zContains4 = ((List) ((fee) rjsVar.o.getValue()).c()).contains(ch00.SHORT_STATISTIC);
                        ctf0 ctf0Var8 = rjsVar.f30611a;
                        ctf0Var8.getClass();
                        List<vrj0> list11 = hnaVar.f;
                        ArrayList arrayList8 = new ArrayList(r3d.q(list11, 10));
                        for (vrj0 vrj0Var : list11) {
                            float fS = r7x.s(vrj0Var.b);
                            float fS2 = r7x.s(vrj0Var.c);
                            String str24 = vrj0Var.f37902a;
                            String str25 = vrj0Var.b;
                            String str26 = vrj0Var.c;
                            if (fS == 0.0f && fS2 == 0.0f) {
                                fS = 0.0f;
                            }
                            arrayList8.add(new srj0(fS, (fS == 0.0f && fS2 == 0.0f) ? 0.0f : fS2, str24, str25, str26));
                        }
                        dja djaVar4 = dja.PENALTY;
                        ch00 ch00Var4 = ch00.SHORT_STATISTIC;
                        i4 i4VarR2 = zContains4 ? dyb.r0(arrayList8) : dyb.r0(CollectionsKt.D0(arrayList8, 3));
                        if (arrayList8.size() - 1 > 3) {
                            lsm0 lsm0Var = ctf0Var8.b;
                            lmoVar = new lmo(lsm0Var.a(R.string.expand, Arrays.copyOf(new Object[0], 0)), lsm0Var.a(R.string.collapse, Arrays.copyOf(new Object[0], 0)), zContains4);
                        } else {
                            lmoVar = null;
                        }
                        return new hax(i4VarR2, lmoVar);
                }
            }
        });
        final byte b4 = 9;
        this.C = maz.b(new yw9(njsVar.L, new Function1(this) { // from class: a.qjs
            public final /* synthetic */ rjs b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:260:0x08d4  */
            /* JADX WARN: Code duplicated, block: B:262:0x08e4  */
            /* JADX WARN: Code duplicated, block: B:265:0x090f  */
            /* JADX WARN: Code duplicated, block: B:268:0x0932  */
            /* JADX WARN: Code duplicated, block: B:270:0x0936  */
            /* JADX WARN: Code duplicated, block: B:272:0x094e  */
            private final Object a(Object obj) {
                n0o0 n0o0Var;
                n0o0 n0o0Var2;
                String str;
                String str2;
                mqr kqrVar;
                String strG;
                d3h0 pekVar;
                String strN;
                d3h0 xakVar;
                Integer num;
                String strN2;
                int i;
                iul0 iul0Var;
                yd90 yd90Var;
                yd90 yd90Var2;
                iul0 iul0Var2;
                String str3;
                String str4;
                d3h0 bekVar;
                String strA;
                String strB;
                String strN3;
                rjs rjsVar = this.b;
                n0o0 n0o0Var3 = rjsVar.v;
                n0o0 n0o0Var4 = rjsVar.m;
                n0o0 n0o0Var5 = rjsVar.H;
                n0o0 n0o0Var6 = rjsVar.I;
                ctf0 ctf0Var2 = rjsVar.f30611a;
                gna gnaVar = (gna) obj;
                if (gnaVar != null) {
                    if (!(gnaVar instanceof ena)) {
                        if (gnaVar instanceof fna) {
                            ctf0Var2.getClass();
                            return new orr(d9x.L(((fna) gnaVar).f9825a, ctf0Var2));
                        }
                        t9f.b();
                        return null;
                    }
                    ena enaVar = (ena) gnaVar;
                    mca mcaVar = enaVar.f8084a;
                    List list = (List) ((fee) rjsVar.n.getValue()).c();
                    boolean zBooleanValue = ((Boolean) ((fee) rjsVar.e.getValue()).c()).booleanValue();
                    mpm mpmVar = (mpm) ((fee) n0o0Var6.getValue()).b();
                    boolean z = enaVar.p;
                    String str5 = (String) ((fee) rjsVar.p.getValue()).c();
                    String str6 = (String) ((fee) rjsVar.q.getValue()).c();
                    String str7 = (String) ((fee) rjsVar.r.getValue()).c();
                    String str8 = (String) ((fee) rjsVar.s.getValue()).c();
                    jg30 jg30Var = (jg30) ((fee) n0o0Var5.getValue()).b();
                    bg30 bg30Var = (bg30) ((fee) n0o0Var6.getValue()).c();
                    znq0 znq0Var = (znq0) ((fee) rjsVar.t.getValue()).c();
                    bha bhaVar = enaVar.o;
                    ui9 ui9Var = (ui9) ((fee) rjsVar.u.getValue()).c();
                    long jLongValue = ((Number) ((fee) n0o0Var4.getValue()).c()).longValue();
                    boolean zBooleanValue2 = ((Boolean) ((fee) n0o0Var3.getValue()).c()).booleanValue();
                    ctf0Var2.getClass();
                    if (ui9Var != null) {
                        int i2 = ui9Var.c;
                        int i3 = ui9Var.d;
                        n0o0Var = n0o0Var4;
                        String strN4 = (cy7.c() && zBooleanValue2) ? w6x.n(i3, i2, " : ") : w6x.n(i2, i3, " : ");
                        String strX = j0x.x(jLongValue, ctf0Var2);
                        ArrayList arrayList = ui9Var.f35720a;
                        n0o0Var2 = n0o0Var5;
                        str = str5;
                        str2 = str6;
                        ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
                        int i4 = 0;
                        for (Object obj2 : arrayList) {
                            int i5 = i4 + 1;
                            if (i4 < 0) {
                                q3d.p();
                                throw null;
                            }
                            arrayList2.add(piz.W((sc90) obj2, jLongValue, i4));
                            i4 = i5;
                        }
                        i4 i4VarR0 = dyb.r0(arrayList2);
                        ArrayList arrayList3 = ui9Var.b;
                        ArrayList arrayList4 = new ArrayList(r3d.q(arrayList3, 10));
                        int i6 = 0;
                        for (Object obj3 : arrayList3) {
                            int i7 = i6 + 1;
                            if (i6 < 0) {
                                q3d.p();
                                throw null;
                            }
                            arrayList4.add(piz.W((sc90) obj3, jLongValue, i6));
                            i6 = i7;
                        }
                        kqrVar = new iqr(strN4, strX, i4VarR0, dyb.r0(arrayList4));
                    } else {
                        n0o0Var = n0o0Var4;
                        n0o0Var2 = n0o0Var5;
                        str = str5;
                        str2 = str6;
                        if (bhaVar != null) {
                            float f = bhaVar.d;
                            float f2 = bhaVar.e;
                            float f3 = bhaVar.f;
                            Object[] objArr = {Float.valueOf(f3)};
                            lsm0 lsm0Var = ctf0Var2.b;
                            String strA2 = lsm0Var.a(R.string.n_percents, Arrays.copyOf(objArr, 1));
                            k3w0 g3w0Var = (f3 <= f2 || f3 <= f) ? new g3w0(strA2) : new i3w0(strA2);
                            String strA3 = lsm0Var.a(R.string.n_percents, Arrays.copyOf(new Object[]{Float.valueOf(f2)}, 1));
                            k3w0 g3w0Var2 = (f2 <= f3 || f2 <= f) ? new g3w0(strA3) : new i3w0(strA3);
                            String strA4 = lsm0Var.a(R.string.n_percents, Arrays.copyOf(new Object[]{Float.valueOf(f)}, 1));
                            kqrVar = new kqr(g3w0Var, g3w0Var2, (f <= f3 || f <= f2) ? new g3w0(strA4) : new i3w0(strA4));
                        } else {
                            kqrVar = null;
                        }
                    }
                    anq0 anq0Var2 = (anq0) ((fee) n0o0Var2.getValue()).c();
                    boolean z2 = anq0Var2 != null ? anq0Var2.f1167a : false;
                    long jLongValue2 = ((Number) ((fee) n0o0Var.getValue()).c()).longValue();
                    boolean zBooleanValue3 = ((Boolean) ((fee) n0o0Var3.getValue()).c()).booleanValue();
                    list.getClass();
                    mpmVar.getClass();
                    String strA5 = "";
                    if (mcaVar instanceof pca) {
                        pca pcaVar = (pca) mcaVar;
                        uqr uqrVarR0 = pzb.r0(mcaVar, str, str2, str7, str8, jg30Var);
                        if (bg30Var == null || (bekVar = bg30Var.b) == null) {
                            bekVar = bg30Var != null ? bg30Var.f2536a : new bek();
                        }
                        d3h0 d3h0Var = bekVar;
                        boolean z3 = d3h0Var instanceof lz10;
                        lz10 lz10Var = z3 ? (lz10) d3h0Var : null;
                        if (lz10Var != null) {
                            strA = vzb.T(lz10Var, zBooleanValue3);
                        } else {
                            hzm0 hzm0Var = d3h0Var instanceof hzm0 ? (hzm0) d3h0Var : null;
                            if (hzm0Var != null) {
                                String str9 = hzm0Var.g;
                                String str10 = hzm0Var.i;
                                StringBuilder sb = new StringBuilder("\u2066");
                                if (cy7.c() && zBooleanValue3) {
                                    if (str10 != null) {
                                        hne.B(sb, "(ov ", str10, Separators.RPAREN);
                                    }
                                    sb.append(vzb.i0(str9));
                                } else {
                                    sb.append(str9);
                                    if (str10 != null) {
                                        hne.B(sb, Separators.LPAREN, str10, " ov)");
                                    }
                                }
                                sb.append("\u2069");
                                strA = sb.toString();
                            } else {
                                strA = d3h0Var.a();
                            }
                        }
                        String str11 = strA;
                        lz10 lz10Var2 = z3 ? (lz10) d3h0Var : null;
                        if (lz10Var2 != null) {
                            strB = vzb.U(lz10Var2, zBooleanValue3);
                        } else {
                            hzm0 hzm0Var2 = d3h0Var instanceof hzm0 ? (hzm0) d3h0Var : null;
                            if (hzm0Var2 != null) {
                                String str12 = hzm0Var2.h;
                                String str13 = hzm0Var2.j;
                                StringBuilder sb2 = new StringBuilder("\u2066");
                                if (cy7.c() && zBooleanValue3) {
                                    if (str13 != null) {
                                        hne.B(sb2, "(ov ", str13, Separators.RPAREN);
                                    }
                                    sb2.append(vzb.i0(str12));
                                } else {
                                    sb2.append(str12);
                                    if (str13 != null) {
                                        hne.B(sb2, Separators.LPAREN, str13, " ov)");
                                    }
                                }
                                sb2.append("\u2069");
                                strB = sb2.toString();
                            } else {
                                strB = d3h0Var.b();
                            }
                        }
                        String str14 = strB;
                        boolean z4 = pcaVar.d;
                        rpp0 rpp0Var = pcaVar.f26749a;
                        j83 j83VarH = vzb.H(ctf0Var2, d3h0Var, pcaVar.e, pcaVar.f, pcaVar.g, (bg30Var == null || (strN3 = bg30Var.f2536a.n()) == null) ? "" : strN3, z4, zBooleanValue3);
                        String strB2 = rpp0Var.b();
                        c280 c280Var = new c280(vsm0.s(rpp0Var.a(), pcaVar.b), R.drawable.ic_glyph_placeholder_player);
                        long jA = rpp0Var.a();
                        bap bapVar = bap.b;
                        jdp0 jdp0Var = new jdp0(strB2, n6x.o0(c280Var, jA, list, zBooleanValue, bapVar), null);
                        jdp0 jdp0Var2 = new jdp0(rpp0Var.d(), n6x.o0(new c280(vsm0.s(rpp0Var.c(), pcaVar.c), R.drawable.ic_glyph_placeholder_player), rpp0Var.c(), list, zBooleanValue, bapVar), null);
                        lz10 lz10Var3 = z3 ? (lz10) d3h0Var : null;
                        return new mrr(uqrVarR0, jdp0Var, jdp0Var2, j83VarH, lz10Var3 != null ? vzb.G(lz10Var3.i) : eex.c, str11, d3h0Var.j(), str14, d3h0Var.i());
                    }
                    boolean z5 = z2;
                    String str15 = str;
                    String str16 = str2;
                    boolean z6 = mcaVar instanceof tca;
                    qpm qpmVar = qpm.f29126a;
                    if (z6) {
                        tca tcaVar = (tca) mcaVar;
                        uqr uqrVarR1 = pzb.r0(mcaVar, str15, str16, str7, str8, jg30Var);
                        znq0 znq0Var2 = new znq0(znq0Var != null ? znq0Var.f44687a : 0L);
                        rpp0 rpp0Var2 = tcaVar.f33711a;
                        boolean z7 = tcaVar.i;
                        if (rpp0Var2 instanceof qpp0) {
                            qpp0 qpp0Var = (qpp0) rpp0Var2;
                            jdp0 jdp0Var3 = new jdp0(qpp0Var.g, n6x.o0(u1c.C(tcaVar, true), qpp0Var.e, list, zBooleanValue || z7, bap.b), null);
                            jdp0 jdp0Var4 = new jdp0(qpp0Var.h, n6x.o0(u1c.C(tcaVar, false), qpp0Var.f, list, zBooleanValue || z7, bap.f2271a), null);
                            lpm lpmVar = new lpm(qpmVar, new hpm(0L, 3));
                            dpi0 dpi0Var = new dpi0((byte) 15);
                            rdj rdjVar = rdj.f30294a;
                            vzb.E(dpi0Var, rdj.g(znq0Var2, efj.UNIVERSAL, Boolean.valueOf(z), false, 56));
                            return new trr(uqrVarR1, jdp0Var3, jdp0Var4, lpmVar, ((h83) dpi0Var.f6468a).h(), kqrVar);
                        }
                        if (!(rpp0Var2 instanceof ppp0)) {
                            t9f.b();
                            return null;
                        }
                        ppp0 ppp0Var = (ppp0) rpp0Var2;
                        xcp0 xcp0VarC0 = b8k0.c0(ppp0Var.e, ppp0Var.g, tcaVar.b);
                        xcp0 xcp0VarC1 = b8k0.c0(ppp0Var.f, ppp0Var.h, tcaVar.c);
                        lpm lpmVar2 = new lpm(qpmVar, new hpm(0L, 3));
                        dpi0 dpi0Var2 = new dpi0((byte) 15);
                        rdj rdjVar2 = rdj.f30294a;
                        vzb.E(dpi0Var2, rdj.g(znq0Var2, efj.UNIVERSAL, Boolean.valueOf(z), false, 56));
                        return new trr(uqrVarR1, xcp0VarC0, xcp0VarC1, lpmVar2, ((h83) dpi0Var2.f6468a).h(), kqrVar);
                    }
                    if (!(mcaVar instanceof xca)) {
                        if (mcaVar instanceof gda) {
                            gda gdaVar = (gda) mcaVar;
                            uqr uqrVarR2 = pzb.r0(mcaVar, str15, str16, str7, str8, jg30Var);
                            znq0 znq0Var3 = new znq0(znq0Var != null ? znq0Var.f44687a : 0L);
                            String strB0 = CollectionsKt.b0(gdaVar.f11094a, Separators.SLASH, null, null, null, 62);
                            String strB1 = CollectionsKt.b0(gdaVar.b, Separators.SLASH, null, null, null, 62);
                            lpm lpmVar3 = new lpm(qpmVar, new hpm(0L, 3));
                            dpi0 dpi0Var3 = new dpi0((byte) 15);
                            rdj rdjVar3 = rdj.f30294a;
                            vzb.E(dpi0Var3, rdj.g(znq0Var3, efj.UNIVERSAL, Boolean.valueOf(z), false, 56));
                            return new rrr(uqrVarR2, strB0, strB1, lpmVar3, ((h83) dpi0Var3.f6468a).h());
                        }
                        if (mcaVar instanceof hda) {
                            hda hdaVar = (hda) mcaVar;
                            uqr uqrVarR3 = pzb.r0(mcaVar, str15, str16, str7, str8, jg30Var);
                            if (bg30Var == null || (pekVar = bg30Var.b) == null) {
                                pekVar = bg30Var != null ? bg30Var.f2536a : new pek();
                            }
                            return new rrr(uqrVarR3, CollectionsKt.b0(hdaVar.f12861a, Separators.SLASH, null, null, null, 62), CollectionsKt.b0(hdaVar.b, Separators.SLASH, null, null, null, 62), mpmVar, vzb.H(ctf0Var2, pekVar, hdaVar.h, hdaVar.i, hdaVar.j, (bg30Var == null || (strN = bg30Var.f2536a.n()) == null) ? "" : strN, hdaVar.g, zBooleanValue3));
                        }
                        if (!(mcaVar instanceof ida)) {
                            t9f.b();
                            return null;
                        }
                        ida idaVar = (ida) mcaVar;
                        uqr uqrVarR4 = pzb.r0(mcaVar, str15, str16, str7, str8, jg30Var);
                        if (!idaVar.g) {
                            if (znq0Var != null) {
                                rdj rdjVar4 = rdj.f30294a;
                                strG = rdj.g(znq0Var, efj.UNIVERSAL, Boolean.valueOf(z), false, 56);
                                if (strG == null) {
                                }
                            }
                            dpi0 dpi0Var7 = new dpi0((byte) 15);
                            vzb.E(dpi0Var7, strG);
                            return new vrr(uqrVarR4, idaVar.e, ((h83) dpi0Var7.f6468a).h());
                        }
                        strA5 = ctf0Var2.b.a(R.string.game_end, Arrays.copyOf(new Object[0], 0));
                        strG = strA5;
                        dpi0 dpi0Var8 = new dpi0((byte) 15);
                        vzb.E(dpi0Var8, strG);
                        return new vrr(uqrVarR4, idaVar.e, ((h83) dpi0Var8.f6468a).h());
                    }
                    if (!gql0.d().contains(Long.valueOf(jLongValue2))) {
                        xca xcaVar = (xca) mcaVar;
                        uqr uqrVarR5 = pzb.r0(mcaVar, str15, str16, str7, str8, jg30Var);
                        if (bg30Var == null || (xakVar = bg30Var.b) == null) {
                            xakVar = bg30Var != null ? bg30Var.f2536a : new xak((byte) 22);
                        }
                        boolean z8 = xcaVar.l;
                        boolean z9 = xcaVar.q;
                        rpp0 rpp0Var3 = xcaVar.f40636a;
                        j83 j83VarH2 = vzb.H(ctf0Var2, xakVar, xcaVar.n, xcaVar.o, xcaVar.p, (bg30Var == null || (strN2 = bg30Var.f2536a.n()) == null) ? "" : strN2, z8, zBooleanValue3);
                        if (!(rpp0Var3 instanceof qpp0)) {
                            if (rpp0Var3 instanceof ppp0) {
                                ppp0 ppp0Var2 = (ppp0) rpp0Var3;
                                return new trr(uqrVarR5, b8k0.c0(ppp0Var2.e, ppp0Var2.g, xcaVar.h), b8k0.c0(ppp0Var2.f, ppp0Var2.h, xcaVar.i), mpmVar, j83VarH2, kqrVar);
                            }
                            t9f.b();
                            return null;
                        }
                        int i8 = xcaVar.b;
                        int i9 = xcaVar.g;
                        int i10 = xcaVar.f;
                        int i11 = xcaVar.d;
                        int i12 = xcaVar.c;
                        vy vyVar = (i8 == 0 && i12 == 0 && i11 == 0) ? null : new vy(i8 > 0 ? Integer.valueOf(i8) : null, i12 > 0 ? Integer.valueOf(i12) : null, i11 > 0 ? Integer.valueOf(i11) : null);
                        int i13 = xcaVar.e;
                        vy vyVar2 = (i13 == 0 && i10 == 0 && i9 == 0) ? null : new vy(i13 > 0 ? Integer.valueOf(i13) : null, i10 > 0 ? Integer.valueOf(i10) : null, i9 > 0 ? Integer.valueOf(i9) : null);
                        boolean z10 = (vyVar == null && vyVar2 == null) ? false : true;
                        if (z10 && vyVar == null) {
                            num = null;
                            vyVar = new vy(null, null, null);
                        } else {
                            num = null;
                        }
                        if (z10 && vyVar2 == null) {
                            vyVar2 = new vy(num, num, num);
                        }
                        qpp0 qpp0Var2 = (qpp0) rpp0Var3;
                        return new trr(uqrVarR5, new jdp0(qpp0Var2.g, n6x.o0(u1c.D(xcaVar, true), qpp0Var2.e, list, zBooleanValue || z9, bap.b), vyVar), new jdp0(qpp0Var2.h, n6x.o0(u1c.D(xcaVar, false), qpp0Var2.f, list, zBooleanValue || z9, bap.f2271a), vyVar2), mpmVar, j83VarH2, kqrVar);
                    }
                    xca xcaVar2 = (xca) mcaVar;
                    long j = znq0Var != null ? znq0Var.f44687a : 0L;
                    uqr uqrVarR6 = pzb.r0(mcaVar, str15, str16, str7, str8, jg30Var);
                    znq0 znq0Var4 = new znq0(j);
                    pz10 pz10Var = bg30Var != null ? bg30Var.f2536a : null;
                    if (pz10Var instanceof nz10) {
                        izm0 izm0Var = bg30Var.b;
                        String str17 = xcaVar2.s;
                        List list2 = xcaVar2.i;
                        List list3 = xcaVar2.h;
                        rpp0 rpp0Var4 = xcaVar2.f40636a;
                        boolean z11 = xcaVar2.l;
                        String str18 = xcaVar2.p;
                        rdj rdjVar5 = rdj.f30294a;
                        pz10 pz10Var2 = pz10Var;
                        String strG2 = rdj.g(znq0Var4, efj.UNIVERSAL, Boolean.valueOf(z), false, 56);
                        str18.getClass();
                        strG2.getClass();
                        dpi0 dpi0Var9 = new dpi0((byte) 15);
                        if (str17 != null) {
                            vzb.E(dpi0Var9, str17);
                            vzb.E(dpi0Var9, ": ");
                            boolean z12 = cy7.c() && zBooleanValue3;
                            if (izm0Var == null) {
                                vzb.E(dpi0Var9, "0");
                                vzb.C(dpi0Var9);
                                vzb.E(dpi0Var9, "0");
                            } else {
                                if (!(izm0Var instanceof gzm0) && !(izm0Var instanceof hzm0)) {
                                    t9f.b();
                                    return null;
                                }
                                boolean z13 = izm0Var instanceof hzm0;
                                String strA6 = z13 ? ((hzm0) izm0Var).g : izm0Var.a();
                                String strB3 = z13 ? ((hzm0) izm0Var).h : izm0Var.b();
                                vzb.E(dpi0Var9, "\u2066");
                                if (z12) {
                                    vzb.D(dpi0Var9, strB3, vzb.L(izm0Var.i()));
                                    vzb.C(dpi0Var9);
                                    vzb.D(dpi0Var9, strA6, vzb.L(izm0Var.j()));
                                } else {
                                    vzb.D(dpi0Var9, strA6, vzb.L(izm0Var.j()));
                                    vzb.C(dpi0Var9);
                                    vzb.D(dpi0Var9, strB3, vzb.L(izm0Var.i()));
                                }
                                vzb.E(dpi0Var9, "\u2069");
                            }
                        } else {
                            vzb.E(dpi0Var9, strG2);
                            if (str18.length() > 0) {
                                vzb.A(dpi0Var9);
                                vzb.E(dpi0Var9, str18);
                            }
                            if (z11) {
                                vzb.A(dpi0Var9);
                                i = 0;
                                vzb.E(dpi0Var9, ctf0Var2.b.a(R.string.game_end, Arrays.copyOf(new Object[0], 0)));
                            } else {
                                i = 0;
                            }
                            if (z5) {
                                vzb.A(dpi0Var9);
                                vzb.E(dpi0Var9, ctf0Var2.b.a(R.string.card_cricket_break, Arrays.copyOf(new Object[i], i)));
                            }
                        }
                        j83 j83VarH3 = ((h83) dpi0Var9.f6468a).h();
                        nz10 nz10Var = (nz10) pz10Var2;
                        boolean z14 = nz10Var instanceof mz10;
                        k5q0 k5q0Var = k5q0.b;
                        if (!z14) {
                            if (nz10Var instanceof oz10) {
                                oz10 oz10Var = (oz10) nz10Var;
                                String str19 = oz10Var.i;
                                String str20 = oz10Var.g;
                                String str21 = oz10Var.m;
                                String str22 = oz10Var.k;
                                boolean z15 = ((StringsKt.W(str22) || str22.equals("0")) && (StringsKt.W(str21) || str21.equals("0"))) ? false : true;
                                boolean z16 = str20.length() > 0 || str19.length() > 0;
                                eex eexVarG = vzb.G(oz10Var.o);
                                ArrayList arrayList5 = oz10Var.f;
                                ArrayList arrayList6 = new ArrayList(r3d.q(arrayList5, 10));
                                Iterator it = arrayList5.iterator();
                                while (it.hasNext()) {
                                    te90 te90Var = (te90) it.next();
                                    arrayList6.add(new yd90(vzb.O(te90Var), vzb.Q(te90Var), te90Var.f33809a));
                                    it = it;
                                    z15 = z15;
                                }
                                boolean z17 = z15;
                                i4 i4VarR1 = dyb.r0(arrayList6);
                                j83 j83VarN = vzb.N(nz10Var);
                                j83 j83VarP = vzb.P(nz10Var);
                                lsm0 lsm0Var2 = ctf0Var2.b;
                                yd90 yd90Var3 = new yd90(j83VarN, j83VarP, lsm0Var2.a(R.string.total_count, Arrays.copyOf(new Object[0], 0)));
                                if (z17) {
                                    h83 h83Var = new h83();
                                    long j2 = y3d.g;
                                    long j3 = daq0.c;
                                    smk0 smk0Var = new smk0(vzb.L(oz10Var.l), j3, null, null, null, null, null, j3, new j56(0.0f), null, null, j2, k5q0Var, null, null, 17424);
                                    h83Var.c(str22);
                                    j83 j83VarC = kng0.c(h83Var.f12607a, h83Var, smk0Var, 0);
                                    h83 h83Var2 = new h83();
                                    smk0 smk0Var2 = new smk0(vzb.L(oz10Var.n), j3, null, null, null, null, null, j3, new j56(0.0f), null, null, j2, k5q0Var, null, null, 17424);
                                    h83Var2.c(str21);
                                    yd90Var = new yd90(j83VarC, kng0.c(h83Var2.f12607a, h83Var2, smk0Var2, 0), lsm0Var2.a(R.string.dt_points, Arrays.copyOf(new Object[0], 0)));
                                } else {
                                    yd90Var = null;
                                }
                                if (z16) {
                                    h83 h83Var3 = new h83();
                                    long j4 = y3d.g;
                                    long j5 = daq0.c;
                                    smk0 smk0Var3 = new smk0(vzb.L(oz10Var.h), j5, null, null, null, null, null, j5, new j56(0.0f), null, null, j4, k5q0Var, null, null, 17424);
                                    h83Var3.c(str20);
                                    j83 j83VarC2 = kng0.c(h83Var3.f12607a, h83Var3, smk0Var3, 0);
                                    h83 h83Var4 = new h83();
                                    smk0 smk0Var4 = new smk0(vzb.L(oz10Var.j), j5, null, null, null, null, null, j5, new j56(0.0f), null, null, j4, k5q0Var, null, null, 17424);
                                    h83Var4.c(str19);
                                    yd90Var2 = new yd90(j83VarC2, kng0.c(h83Var4.f12607a, h83Var4, smk0Var4, 0), lsm0Var2.a(R.string.tennis_game_column, Arrays.copyOf(new Object[0], 0)));
                                } else {
                                    yd90Var2 = null;
                                }
                                iul0Var2 = new iul0(eexVarG, i4VarR1, yd90Var3, yd90Var2, yd90Var);
                            } else {
                                if (!(nz10Var instanceof kz10)) {
                                    t9f.b();
                                    return null;
                                }
                                kz10 kz10Var = (kz10) nz10Var;
                                eex eexVarG2 = vzb.G(kz10Var.g);
                                ArrayList<te90> arrayList7 = kz10Var.f;
                                ArrayList arrayList8 = new ArrayList(r3d.q(arrayList7, 10));
                                for (te90 te90Var2 : arrayList7) {
                                    arrayList8.add(new yd90(vzb.O(te90Var2), vzb.Q(te90Var2), te90Var2.f33809a));
                                }
                                iul0Var = new iul0(eexVarG2, dyb.r0(arrayList8), new yd90(vzb.N(nz10Var), vzb.P(nz10Var), ctf0Var2.b.a(R.string.total_count, Arrays.copyOf(new Object[0], 0))), null, null);
                            }
                            if (rpp0Var4 instanceof qpp0) {
                                if (rpp0Var4 instanceof ppp0) {
                                    ppp0 ppp0Var6 = (ppp0) rpp0Var4;
                                    return new xrr(uqrVarR6, b8k0.c0(ppp0Var6.e, ppp0Var6.g, list3), b8k0.c0(ppp0Var6.f, ppp0Var6.h, list2), j83VarH3, iul0Var2);
                                }
                                t9f.b();
                                return null;
                            }
                            qpp0 qpp0Var6 = (qpp0) rpp0Var4;
                            String str211 = qpp0Var6.g;
                            str3 = (String) CollectionsKt.firstOrNull(list3);
                            if (str3 == null) {
                                str3 = "";
                            }
                            c280 c280Var5 = new c280(vsm0.s(qpp0Var6.e, str3), R.drawable.ic_glyph_placeholder_player);
                            long j11 = qpp0Var6.e;
                            bap bapVar5 = bap.b;
                            jdp0 jdp0Var8 = new jdp0(str211, n6x.o0(c280Var5, j11, list, zBooleanValue, bapVar5), null);
                            String str212 = qpp0Var6.h;
                            str4 = (String) CollectionsKt.firstOrNull(list2);
                            if (str4 == null) {
                                str4 = "";
                            }
                            return new xrr(uqrVarR6, jdp0Var8, new jdp0(str212, n6x.o0(new c280(vsm0.s(qpp0Var6.f, str4), R.drawable.ic_glyph_placeholder_player), qpp0Var6.f, list, zBooleanValue, bapVar5), null), j83VarH3, iul0Var2);
                        }
                        mz10 mz10Var = (mz10) nz10Var;
                        eex eexVarG3 = vzb.G(mz10Var.g);
                        ArrayList<te90> arrayList9 = mz10Var.f;
                        ArrayList arrayList10 = new ArrayList(r3d.q(arrayList9, 10));
                        for (te90 te90Var3 : arrayList9) {
                            arrayList10.add(new yd90(vzb.O(te90Var3), vzb.Q(te90Var3), te90Var3.f33809a));
                        }
                        i4 i4VarR2 = dyb.r0(arrayList10);
                        j83 j83VarN2 = vzb.N(nz10Var);
                        j83 j83VarP2 = vzb.P(nz10Var);
                        lsm0 lsm0Var3 = ctf0Var2.b;
                        yd90 yd90Var4 = new yd90(j83VarN2, j83VarP2, lsm0Var3.a(R.string.total_count, Arrays.copyOf(new Object[0], 0)));
                        h83 h83Var5 = new h83();
                        String str25 = mz10Var.h;
                        long j7 = y3d.g;
                        long j8 = daq0.c;
                        smk0 smk0Var5 = new smk0(vzb.L(mz10Var.i), j8, null, null, null, null, null, j8, new j56(0.0f), null, null, j7, k5q0Var, null, null, 17424);
                        h83Var5.c(str25);
                        j83 j83VarC3 = kng0.c(h83Var5.f12607a, h83Var5, smk0Var5, 0);
                        h83 h83Var6 = new h83();
                        String str26 = mz10Var.j;
                        smk0 smk0Var6 = new smk0(vzb.L(mz10Var.k), j8, null, null, null, null, null, j8, new j56(0.0f), null, null, j7, k5q0Var, null, null, 17424);
                        h83Var6.c(str26);
                        iul0Var = new iul0(eexVarG3, i4VarR2, yd90Var4, null, new yd90(j83VarC3, kng0.c(h83Var6.f12607a, h83Var6, smk0Var6, 0), lsm0Var3.a(R.string.dt_points, Arrays.copyOf(new Object[0], 0))));
                        iul0Var2 = iul0Var;
                        if (rpp0Var4 instanceof qpp0) {
                            if (rpp0Var4 instanceof ppp0) {
                                ppp0 ppp0Var7 = (ppp0) rpp0Var4;
                                return new xrr(uqrVarR6, b8k0.c0(ppp0Var7.e, ppp0Var7.g, list3), b8k0.c0(ppp0Var7.f, ppp0Var7.h, list2), j83VarH3, iul0Var2);
                            }
                            t9f.b();
                            return null;
                        }
                        qpp0 qpp0Var7 = (qpp0) rpp0Var4;
                        String str213 = qpp0Var7.g;
                        str3 = (String) CollectionsKt.firstOrNull(list3);
                        if (str3 == null) {
                            str3 = "";
                        }
                        c280 c280Var6 = new c280(vsm0.s(qpp0Var7.e, str3), R.drawable.ic_glyph_placeholder_player);
                        long j12 = qpp0Var7.e;
                        bap bapVar6 = bap.b;
                        jdp0 jdp0Var9 = new jdp0(str213, n6x.o0(c280Var6, j12, list, zBooleanValue, bapVar6), null);
                        String str214 = qpp0Var7.h;
                        str4 = (String) CollectionsKt.firstOrNull(list2);
                        if (str4 == null) {
                            str4 = "";
                        }
                        return new xrr(uqrVarR6, jdp0Var9, new jdp0(str214, n6x.o0(new c280(vsm0.s(qpp0Var7.f, str4), R.drawable.ic_glyph_placeholder_player), qpp0Var7.f, list, zBooleanValue, bapVar6), null), j83VarH3, iul0Var2);
                    }
                }
                return qrr.f29223a;
            }

            /* JADX WARN: Code duplicated, block: B:18:0x008a  */
            private final Object b(Object obj) {
                String strG;
                lz10 lz10Var;
                float f;
                fad dadVar;
                sad qadVar;
                j83 j83VarC;
                j83 j83VarC2;
                gna gnaVar = (gna) obj;
                if (gnaVar == null) {
                    return null;
                }
                if (!(gnaVar instanceof ena)) {
                    if (gnaVar instanceof fna) {
                        return null;
                    }
                    t9f.b();
                    return null;
                }
                ena enaVar = (ena) gnaVar;
                mca mcaVar = enaVar.f8084a;
                rjs rjsVar = this.b;
                jg30 jg30Var = (jg30) ((fee) rjsVar.H.getValue()).b();
                bg30 bg30Var = (bg30) ((fee) rjsVar.I.getValue()).c();
                pz10 pz10Var = bg30Var != null ? bg30Var.f2536a : null;
                ctf0 ctf0Var2 = rjsVar.f30611a;
                boolean z = enaVar.p;
                znq0 znq0Var = (znq0) ((fee) rjsVar.t.getValue()).c();
                boolean zBooleanValue = ((Boolean) ((fee) rjsVar.v.getValue()).c()).booleanValue();
                ctf0Var2.getClass();
                dja djaVar = dja.PENALTY;
                k5q0 k5q0Var = k5q0.b;
                if (jg30Var != null) {
                    dadVar = new ead(jg30Var);
                    f = 0.0f;
                    lz10Var = null;
                } else {
                    h83 h83Var = new h83();
                    if (znq0Var != null) {
                        rdj rdjVar = rdj.f30294a;
                        strG = rdj.g(znq0Var, efj.UNIVERSAL, Boolean.valueOf(z), false, 56);
                        if (strG == null) {
                            strG = "";
                        }
                    } else {
                        strG = "";
                    }
                    pz40 pz40Var = s6t0.f31722a;
                    long textPrimary = s6t0.b().f33626a.getTextPrimary();
                    h83 h83Var2 = new h83();
                    long j = y3d.g;
                    long j2 = daq0.c;
                    lz10Var = null;
                    f = 0.0f;
                    smk0 smk0Var = new smk0(textPrimary, j2, null, null, null, null, null, j2, new j56(0.0f), null, null, j, k5q0Var, null, null, 17424);
                    h83Var2.c(strG);
                    StringBuilder sb = h83Var2.f12607a;
                    h83Var2.a(smk0Var, 0, sb.length());
                    sb.length();
                    h83Var.b(h83Var2.h());
                    dadVar = new dad(h83Var.h());
                }
                d3h0 cl5Var = pz10Var;
                if (mcaVar instanceof pca) {
                    if (pz10Var == null) {
                        cl5Var = new cl5((byte) 28);
                    }
                    rpp0 rpp0Var = ((pca) mcaVar).f26749a;
                    String strB = rpp0Var.b();
                    String strD = rpp0Var.d();
                    boolean z2 = cl5Var instanceof lz10;
                    lz10 lz10Var2 = z2 ? (lz10) cl5Var : lz10Var;
                    String strT = lz10Var2 != null ? vzb.T(lz10Var2, zBooleanValue) : "0";
                    lz10 lz10Var3 = z2 ? (lz10) cl5Var : lz10Var;
                    qadVar = new pad(strB, strD, strT, lz10Var3 != null ? vzb.U(lz10Var3, zBooleanValue) : "0", cl5Var.j(), cl5Var.i());
                } else if (mcaVar instanceof tca) {
                    rpp0 rpp0Var2 = ((tca) mcaVar).f33711a;
                    String strB2 = rpp0Var2.b();
                    String strD2 = rpp0Var2.d();
                    h83 h83Var3 = new h83();
                    String strA = ctf0Var2.b.a(R.string.vs, Arrays.copyOf(new Object[0], 0));
                    long j3 = y3d.g;
                    long j4 = daq0.c;
                    pz40 pz40Var2 = s6t0.f31722a;
                    smk0 smk0Var2 = new smk0(s6t0.b().f33626a.getTextPrimary(), j4, null, null, null, null, null, j4, new j56(f), null, null, j3, k5q0Var, null, null, 17424);
                    h83Var3.c(strA);
                    qadVar = new rad(kng0.c(h83Var3.f12607a, h83Var3, smk0Var2, 0), strB2, strD2);
                } else if (mcaVar instanceof xca) {
                    rpp0 rpp0Var3 = ((xca) mcaVar).f40636a;
                    String strB3 = rpp0Var3.b();
                    String strD3 = rpp0Var3.d();
                    if (pz10Var != null) {
                        j83VarC2 = vzb.M(pz10Var);
                    } else {
                        h83 h83Var4 = new h83();
                        String strA2 = ctf0Var2.b.a(R.string.vs, Arrays.copyOf(new Object[0], 0));
                        long j5 = y3d.g;
                        long j6 = daq0.c;
                        pz40 pz40Var3 = s6t0.f31722a;
                        smk0 smk0Var3 = new smk0(s6t0.b().f33626a.getTextPrimary(), j6, null, null, null, null, null, j6, new j56(f), null, null, j5, k5q0Var, null, null, 17424);
                        h83Var4.c(strA2);
                        j83VarC2 = kng0.c(h83Var4.f12607a, h83Var4, smk0Var3, 0);
                    }
                    qadVar = new rad(j83VarC2, strB3, strD3);
                } else if (mcaVar instanceof gda) {
                    gda gdaVar = (gda) mcaVar;
                    String strB0 = CollectionsKt.b0(gdaVar.f11094a, Separators.SLASH, null, null, null, 62);
                    String strB1 = CollectionsKt.b0(gdaVar.b, Separators.SLASH, null, null, null, 62);
                    h83 h83Var5 = new h83();
                    String strA3 = ctf0Var2.b.a(R.string.vs, Arrays.copyOf(new Object[0], 0));
                    long j7 = y3d.g;
                    long j8 = daq0.c;
                    pz40 pz40Var4 = s6t0.f31722a;
                    smk0 smk0Var4 = new smk0(s6t0.b().f33626a.getTextPrimary(), j8, null, null, null, null, null, j8, new j56(f), null, null, j7, k5q0Var, null, null, 17424);
                    h83Var5.c(strA3);
                    qadVar = new rad(kng0.c(h83Var5.f12607a, h83Var5, smk0Var4, 0), strB0, strB1);
                } else if (mcaVar instanceof hda) {
                    hda hdaVar = (hda) mcaVar;
                    String strB4 = CollectionsKt.b0(hdaVar.f12861a, Separators.SLASH, null, null, null, 62);
                    String strB5 = CollectionsKt.b0(hdaVar.b, Separators.SLASH, null, null, null, 62);
                    if (pz10Var != null) {
                        j83VarC = vzb.M(pz10Var);
                    } else {
                        h83 h83Var6 = new h83();
                        String strA4 = ctf0Var2.b.a(R.string.vs, Arrays.copyOf(new Object[0], 0));
                        long j9 = y3d.g;
                        long j10 = daq0.c;
                        pz40 pz40Var5 = s6t0.f31722a;
                        smk0 smk0Var5 = new smk0(s6t0.b().f33626a.getTextPrimary(), j10, null, null, null, null, null, j10, new j56(f), null, null, j9, k5q0Var, null, null, 17424);
                        h83Var6.c(strA4);
                        j83VarC = kng0.c(h83Var6.f12607a, h83Var6, smk0Var5, 0);
                    }
                    qadVar = new rad(j83VarC, strB4, strB5);
                } else {
                    if (!(mcaVar instanceof ida)) {
                        t9f.b();
                        return lz10Var;
                    }
                    qadVar = new qad(((ida) mcaVar).e);
                }
                return new dax(dadVar, qadVar);
            }

            /* JADX WARN: Code duplicated, block: B:140:0x0381  */
            /* JADX WARN: Code duplicated, block: B:70:0x01a8  */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                kc50 kc50Var;
                p700 p700Var;
                ena enaVar;
                uia uiaVar;
                String strA;
                String strC;
                String strC2;
                zvl0 zvl0Var;
                yja yjaVar;
                qal0 qal0Var;
                Object b0k0Var;
                i49 g49Var;
                dxh0 dxh0Var;
                hna hnaVar;
                lmo lmoVar;
                byte b5 = b4;
                int i = 0;
                rjs rjsVar = this.b;
                switch (b5) {
                    case 0:
                        List list = (List) obj;
                        list.getClass();
                        boolean zBooleanValue = ((Boolean) ((fee) rjsVar.c.getValue()).c()).booleanValue();
                        boolean zBooleanValue2 = ((Boolean) ((fee) rjsVar.e.getValue()).c()).booleanValue();
                        boolean zBooleanValue3 = ((Boolean) ((fee) rjsVar.f.getValue()).c()).booleanValue();
                        tf50 tf50Var = (tf50) ((fee) rjsVar.d.getValue()).c();
                        tf50Var.getClass();
                        if (!list.contains(tf50Var)) {
                            tf50Var = tf50.f33851a;
                        }
                        boolean z = !zBooleanValue2;
                        kc50 kc50Var2 = new kc50(R.drawable.ic_glyph_rectangular_scoreboard, tf50Var == tf50.f33851a);
                        tf50 tf50Var2 = tf50.b;
                        kc50 kc50Var3 = list.contains(tf50Var2) ? new kc50(R.drawable.ic_glyph_rectangular_broadcast, tf50Var == tf50Var2) : null;
                        tf50 tf50Var3 = tf50.c;
                        if (list.contains(tf50Var3)) {
                            kc50Var = new kc50(R.drawable.ic_glyph_rectangular_statistic, tf50Var == tf50Var3);
                        } else {
                            kc50Var = null;
                        }
                        return new ojs(zBooleanValue, z, zBooleanValue, zBooleanValue3, new hjs(kc50Var2, kc50Var3, kc50Var, tf50Var));
                    case 1:
                        n0o0 n0o0Var = rjsVar.o;
                        gna gnaVar = (gna) obj;
                        if ((gnaVar instanceof ena ? (ena) gnaVar : null) == null || (p700Var = ((ena) gnaVar).l) == null) {
                            return null;
                        }
                        List list2 = p700Var.e;
                        List list3 = (List) ((fee) n0o0Var.getValue()).c();
                        ch00 ch00Var = ch00.LAST_GAMES;
                        boolean zContains = list3.contains(ch00Var);
                        List list4 = (List) ((fee) n0o0Var.getValue()).c();
                        ch00 ch00Var2 = ch00.LAST_GAMES_OPP_ONE;
                        boolean zContains2 = list4.contains(ch00Var2);
                        List list5 = (List) ((fee) n0o0Var.getValue()).c();
                        ch00 ch00Var3 = ch00.LAST_GAMES_OPP_TWO;
                        boolean zContains3 = list5.contains(ch00Var3);
                        ctf0 ctf0Var2 = rjsVar.f30611a;
                        ctf0Var2.getClass();
                        ArrayList arrayList = new ArrayList();
                        List list6 = p700Var.g;
                        List list7 = p700Var.f;
                        if (!list2.isEmpty()) {
                            arrayList.add(z1x.T(list2, ctf0Var2, ctf0Var2.b.a(R.string.previous_meetings, Arrays.copyOf(new Object[0], 0)), ch00Var, zContains));
                        }
                        if (!list7.isEmpty()) {
                            arrayList.add(z1x.T(list7, ctf0Var2, kng0.l(ctf0Var2.b.a(R.string.last_games, Arrays.copyOf(new Object[0], 0)), ": ", p700Var.c), ch00Var2, zContains2));
                        }
                        if (!list6.isEmpty()) {
                            arrayList.add(z1x.T(list6, ctf0Var2, kng0.l(ctf0Var2.b.a(R.string.last_games, Arrays.copyOf(new Object[0], 0)), ": ", p700Var.d), ch00Var3, zContains3));
                        }
                        return arrayList;
                    case 2:
                        gna gnaVar2 = (gna) obj;
                        if ((gnaVar2 instanceof ena ? (ena) gnaVar2 : null) == null || (uiaVar = (enaVar = (ena) gnaVar2).h) == null) {
                            return null;
                        }
                        ctf0 ctf0Var3 = rjsVar.f30611a;
                        boolean z2 = enaVar.p;
                        ctf0Var3.getClass();
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it = uiaVar.c.iterator();
                        int i2 = 0;
                        while (it.hasNext()) {
                            Object next = it.next();
                            int i3 = i2 + 1;
                            if (i2 < 0) {
                                q3d.p();
                                throw null;
                            }
                            bsw bswVar = (bsw) next;
                            String str = bswVar.b;
                            String str2 = bswVar.e;
                            String strA2 = (str.length() <= 0 || str2.length() <= 0) ? ctf0Var3.b.a(R.string.vs, Arrays.copyOf(new Object[0], 0)) : w6x.q(bswVar.b, " : ", str2);
                            odp0 odp0Var = new odp0(new d5a0(new c280(bswVar.c, R.drawable.ic_glyph_placeholder_player)));
                            String strM = dw9.m(i3, ". ", bswVar.f3153a);
                            odp0 odp0Var2 = new odp0(new d5a0(new c280(bswVar.f, R.drawable.ic_glyph_placeholder_player)));
                            String strM2 = dw9.m(i3, ". ", bswVar.d);
                            rdj rdjVar = rdj.f30294a;
                            arrayList2.add(new hzy(odp0Var, strM, odp0Var2, strM2, rdj.g(new znq0(bswVar.g), efj.UNIVERSAL, Boolean.valueOf(z2), false, 56), strA2, "", null, null));
                            it = it;
                            i2 = i3;
                        }
                        dja djaVar = dja.PENALTY;
                        return new eax(dyb.o0(arrayList2), uiaVar.f35722a, uiaVar.b);
                    case 3:
                        anq0 anq0Var2 = (anq0) obj;
                        if (anq0Var2 != null) {
                            boolean z3 = ((Boolean) ((fee) rjsVar.g.getValue()).c()).booleanValue() || ((Boolean) ((fee) rjsVar.h.getValue()).c()).booleanValue();
                            ctf0 ctf0Var4 = rjsVar.f30611a;
                            ctf0Var4.getClass();
                            long j = anq0Var2.e;
                            long j2 = anq0Var2.d;
                            boolean z4 = anq0Var2.j;
                            if (j != 0 || !z4) {
                                String str3 = anq0Var2.c;
                                if (z4) {
                                    if (str3.length() > 0) {
                                        strA = ctf0Var4.b.a(R.string.live_additional_min_v2, Arrays.copyOf(new Object[]{str3}, 1));
                                    } else if (anq0Var2.f1167a) {
                                        strA = "";
                                    } else {
                                        strA = anq0Var2.b ? ctf0Var4.b.a(R.string.line_live_time_period_back_v2, Arrays.copyOf(new Object[]{""}, 1)) : ctf0Var4.b.a(R.string.line_live_time_period_capitalized_v2, Arrays.copyOf(new Object[]{""}, 1));
                                    }
                                } else if (j2 < 0) {
                                    strA = ctf0Var4.b.a(R.string.game_started, Arrays.copyOf(new Object[0], 0));
                                } else {
                                    long j3 = j2 / 86400;
                                    strA = j3 > 0 ? ctf0Var4.b.a(R.string.line_time_before_v2, Arrays.copyOf(new Object[]{String.valueOf(j3)}, 1)) : ctf0Var4.b.a(R.string.before_start, Arrays.copyOf(new Object[0], 0));
                                }
                                String strC3 = (z3 || z4 || j2 < 0) ? null : n2x.C((((j2 < 0 ? 0L : j2) / 60) / 60) % 24);
                                if (z3) {
                                    strC = null;
                                } else {
                                    long jB = (z4 ? vzb.V(anq0Var2).b() : j2 < 0 ? 0L : j2) / 60;
                                    if (!z4) {
                                        jB %= 60;
                                    }
                                    strC = n2x.C(jB);
                                }
                                if (z3) {
                                    strC2 = null;
                                } else {
                                    strC2 = n2x.C((z4 ? vzb.V(anq0Var2).b() : j2 >= 0 ? j2 : 0L) % 60);
                                }
                                return new jg30(strA, strC3, strC, strC2);
                            }
                        }
                        return null;
                    case 4:
                        gna gnaVar3 = (gna) obj;
                        ena enaVar2 = gnaVar3 instanceof ena ? (ena) gnaVar3 : null;
                        if (enaVar2 == null || (zvl0Var = ((ena) gnaVar3).k) == null) {
                            return null;
                        }
                        String str4 = zvl0Var.m;
                        String str5 = enaVar2.q;
                        ctf0 ctf0Var5 = rjsVar.f30611a;
                        m1v0 m1v0Var = (m1v0) ((fee) rjsVar.J.getValue()).b();
                        str5.getClass();
                        ctf0Var5.getClass();
                        String str6 = zvl0Var.f45064a;
                        Pair pair = str4.length() > 0 ? new Pair(str4, ctf0Var5.b.a(R.string.web_site, Arrays.copyOf(new Object[0], 0))) : new Pair(null, null);
                        String str7 = (String) pair.f46059a;
                        String str8 = (String) pair.b;
                        dja djaVar2 = dja.PENALTY;
                        String str9 = zvl0Var.b;
                        ArrayList arrayList3 = new ArrayList();
                        String str10 = zvl0Var.l;
                        String str11 = zvl0Var.k;
                        String str12 = zvl0Var.j;
                        String str13 = zvl0Var.i;
                        String str14 = zvl0Var.h;
                        String str15 = zvl0Var.g;
                        String str16 = zvl0Var.f;
                        String str17 = zvl0Var.e;
                        String str18 = zvl0Var.d;
                        String str19 = zvl0Var.c;
                        if (str6.length() > 0) {
                            arrayList3.add(l7x.J(ctf0Var5, str6, R.string.address));
                        }
                        if (str19.length() > 0) {
                            arrayList3.add(l7x.J(ctf0Var5, str19, R.string.capacity));
                        }
                        if (str18.length() > 0) {
                            arrayList3.add(l7x.J(ctf0Var5, str18, R.string.covering));
                        }
                        if (str17.length() > 0) {
                            arrayList3.add(l7x.J(ctf0Var5, str17, R.string.city_name));
                        }
                        if (str16.length() > 0) {
                            arrayList3.add(l7x.J(ctf0Var5, str16, R.string.architect));
                        }
                        if (str15.length() > 0) {
                            arrayList3.add(l7x.J(ctf0Var5, str15, R.string.old_name));
                        }
                        if (str14.length() > 0) {
                            arrayList3.add(l7x.J(ctf0Var5, str14, R.string.category));
                        }
                        if (str13.length() > 0) {
                            arrayList3.add(l7x.J(ctf0Var5, str13, R.string.history));
                        }
                        if (str12.length() > 0) {
                            arrayList3.add(l7x.J(ctf0Var5, str12, R.string.opened));
                        }
                        if (str11.length() > 0) {
                            arrayList3.add(l7x.J(ctf0Var5, str11, R.string.zip_code));
                        }
                        if (str10.length() > 0) {
                            arrayList3.add(l7x.J(ctf0Var5, "\u2066" + str10 + "\u2069", R.string.phone));
                        }
                        a4x a4xVarO0 = dyb.o0(arrayList3);
                        List list8 = zvl0Var.n;
                        ArrayList arrayList4 = new ArrayList(r3d.q(list8, 10));
                        Iterator it2 = list8.iterator();
                        while (it2.hasNext()) {
                            arrayList4.add(String.format(Locale.ENGLISH, "%s/sfiles/stadium/%s", Arrays.copyOf(new Object[]{str5, (String) it2.next()}, 2)));
                        }
                        a4x a4xVarO1 = dyb.o0(arrayList4);
                        if (a4xVarO1.isEmpty()) {
                            a4xVarO1 = dyb.g0("");
                        }
                        return new iax(m1v0Var, str9, a4xVarO0, str7, str8, a4xVarO1);
                    case 5:
                        gna gnaVar4 = (gna) obj;
                        if ((gnaVar4 instanceof ena ? (ena) gnaVar4 : null) != null && (yjaVar = ((ena) gnaVar4).i) != null) {
                            List list9 = yjaVar.f42730a;
                            if (!list9.isEmpty()) {
                                long jLongValue = ((Number) ((fee) rjsVar.m.getValue()).c()).longValue();
                                lc00 lc00VarB = kotlin.collections.a.b();
                                Iterator it3 = list9.iterator();
                                while (it3.hasNext()) {
                                    he30 he30Var = (he30) it3.next();
                                    List list10 = he30Var.b;
                                    ArrayList arrayList5 = new ArrayList();
                                    for (Object obj2 : list10) {
                                        if (((ge30) obj2).e.length() > 0) {
                                            arrayList5.add(obj2);
                                        }
                                    }
                                    if (!arrayList5.isEmpty()) {
                                        lc00VarB.add(new uim(he30Var.f12902a));
                                        int i4 = i;
                                        for (Object obj3 : arrayList5) {
                                            int i5 = i4 + 1;
                                            if (i4 < 0) {
                                                q3d.p();
                                                throw null;
                                            }
                                            ge30 ge30Var = (ge30) obj3;
                                            String str20 = ge30Var.f11132a;
                                            String str21 = ge30Var.e;
                                            String str22 = ge30Var.c;
                                            String str23 = ge30Var.d;
                                            tho thoVar = ge30Var.b;
                                            Iterator it4 = it3;
                                            List listSplit$default = StringsKt__StringsKt.split$default(str20, new String[]{"+"}, false, i, 6, null);
                                            long j4 = jLongValue;
                                            List listSplit$default2 = StringsKt__StringsKt.split$default(str20, new String[]{Separators.COLON}, false, i, 6, null);
                                            if (j4 == 1) {
                                                if (listSplit$default.size() == 2 && listSplit$default2.size() == 1) {
                                                    str20 = listSplit$default.get(0) + "'+" + kotlin.text.c.r((String) listSplit$default.get(1), Separators.QUOTE, "", false);
                                                } else if (listSplit$default2.size() == 2) {
                                                    str20 = listSplit$default2.get(0) + Separators.QUOTE;
                                                }
                                            }
                                            y6n y6nVar = ge30Var.j == 0 ? y6n.f42107a : y6n.b;
                                            ggm ggmVar = i4 == 0 ? arrayList5.size() + (-1) == 0 ? ggm.c : ggm.f11256a : i4 == arrayList5.size() + (-1) ? ggm.b : ggm.d;
                                            lc00VarB.add((str23.length() == 0 && str22.length() == 0) ? new sim(str20, str21, thoVar.name(), y6nVar, ggmVar, ge30Var.b()) : new rim(str20, str21, new lnm(str23, str22, 0, "", new s0m("", ""), ge30Var.k), ge30Var.a() ? new lnm(ge30Var.h, ge30Var.g, 0, "", new s0m("", ""), ge30Var.l) : null, thoVar.name(), null, y6nVar, ggmVar, ge30Var.b()));
                                            it3 = it4;
                                            i4 = i5;
                                            jLongValue = j4;
                                            i = 0;
                                        }
                                    }
                                    it3 = it3;
                                    jLongValue = jLongValue;
                                    i = 0;
                                }
                                i4 i4VarR0 = dyb.r0(kotlin.collections.a.a(lc00VarB));
                                dja djaVar3 = dja.PENALTY;
                                return new gax(new sf30(i4VarR0));
                            }
                        }
                        return null;
                    case 6:
                        vzj0 vzj0Var = (vzj0) obj;
                        if (!(((fee) rjsVar.B.getValue()).b() instanceof qrr) && vzj0Var != null) {
                            anq0 anq0Var3 = (anq0) ((fee) rjsVar.H.getValue()).c();
                            ctf0 ctf0Var6 = rjsVar.f30611a;
                            ctf0Var6.getClass();
                            znq0 znq0Var = anq0Var3 != null ? anq0Var3.h : null;
                            if (znq0Var != null) {
                                long j5 = znq0Var.f44687a;
                                if (j5 <= 0) {
                                    qal0Var = null;
                                } else {
                                    long j6 = j5 / 86400;
                                    qal0Var = new qal0(j6 > 0 ? ctf0Var6.b.a(R.string.line_time_before_v2, Arrays.copyOf(new Object[]{String.valueOf(j6)}, 1)) : ctf0Var6.b.a(R.string.before_start, Arrays.copyOf(new Object[0], 0)), yyw.L((((j5 < 0 ? 0L : j5) / 60) / 60) % 24), yyw.L(((j5 < 0 ? 0L : j5) / 60) % 60), yyw.L((j5 >= 0 ? j5 : 0L) % 60));
                                }
                            } else {
                                qal0Var = null;
                            }
                            if (vzj0Var instanceof tzj0) {
                                tzj0 tzj0Var = (tzj0) vzj0Var;
                                b0k0Var = new yzj0(tzj0Var.f34807a, tzj0Var.b, tzj0Var.c, tzj0Var.d, qal0Var);
                            } else if (vzj0Var instanceof uzj0) {
                                uzj0 uzj0Var = (uzj0) vzj0Var;
                                b0k0Var = new b0k0(uzj0Var.f36538a, uzj0Var.b, uzj0Var.c, uzj0Var.d, qal0Var);
                            } else {
                                t9f.b();
                            }
                            return b0k0Var;
                        }
                        return null;
                    case 7:
                        boolean zBooleanValue4 = ((Boolean) obj).booleanValue();
                        long jLongValue2 = ((Number) ((fee) rjsVar.j.getValue()).c()).longValue();
                        boolean zBooleanValue5 = ((Boolean) ((fee) rjsVar.i.getValue()).c()).booleanValue();
                        long jLongValue3 = ((Number) ((fee) rjsVar.k.getValue()).c()).longValue();
                        long jLongValue4 = ((Number) ((fee) rjsVar.m.getValue()).c()).longValue();
                        Long l = (Long) ((fee) rjsVar.l.getValue()).c();
                        long jLongValue5 = l != null ? l.longValue() : -1L;
                        if (zBooleanValue4) {
                            return new sym0(new MarketsCategoriesParams(jLongValue2, jLongValue3, jLongValue4, new zq2(), "", zBooleanValue5));
                        }
                        tef0 tef0Var = tef0.f33818a;
                        xuz xuzVar = pb10.c;
                        return new vym0(new RelatedParams(zBooleanValue5, jLongValue2, jLongValue4, -1L, jLongValue5, tef0Var));
                    case 8:
                        return a(obj);
                    case 9:
                        fsr fsrVar = (fsr) obj;
                        if ((fsrVar == null || !fsrVar.b) && (fsrVar == null || !fsrVar.c)) {
                            return k49.f17656a;
                        }
                        o49 o49Var = (o49) ((fee) rjsVar.y.getValue()).c();
                        ctf0 ctf0Var7 = rjsVar.f30611a;
                        zvh0 zvh0Var2 = rjsVar.b;
                        fsrVar.getClass();
                        ctf0Var7.getClass();
                        ArrayList arrayList6 = new ArrayList();
                        if (fsrVar.b) {
                            arrayList6.add(new g49(ctf0Var7.b.a(R.string.video, Arrays.copyOf(new Object[0], 0))));
                        }
                        if (fsrVar.c) {
                            arrayList6.add(new h49(ctf0Var7.b.a(R.string.play_zone, Arrays.copyOf(new Object[0], 0))));
                        }
                        if (o49Var == null) {
                            g49Var = (i49) CollectionsKt.U(arrayList6);
                        } else {
                            int iOrdinal = o49Var.ordinal();
                            if (iOrdinal == 0) {
                                g49Var = new g49(ctf0Var7.b.a(R.string.video, Arrays.copyOf(new Object[0], 0)));
                            } else {
                                if (iOrdinal != 1) {
                                    t9f.b();
                                    return null;
                                }
                                g49Var = new h49(ctf0Var7.b.a(R.string.play_zone, Arrays.copyOf(new Object[0], 0)));
                            }
                            if (arrayList6.isEmpty()) {
                                g49Var = null;
                            } else {
                                Iterator it5 = arrayList6.iterator();
                                do {
                                    if (!it5.hasNext()) {
                                        g49Var = null;
                                    }
                                } while (!Intrinsics.d((i49) it5.next(), g49Var));
                            }
                            if (g49Var == null) {
                                g49Var = (i49) CollectionsKt.U(arrayList6);
                            }
                        }
                        bfu0 bfu0Var = fsrVar.f10077a;
                        GameBroadcastingParams gameBroadcastingParams = new GameBroadcastingParams(bfu0Var.f2522a, bfu0Var.c, bfu0Var.f, bfu0Var.b, bfu0Var.e, bfu0Var.d, bfu0Var.g, null);
                        Iterator it6 = arrayList6.iterator();
                        int i6 = 0;
                        while (true) {
                            if (!it6.hasNext()) {
                                i6 = -1;
                            } else if (!Intrinsics.d((i49) it6.next(), g49Var)) {
                                i6++;
                            }
                        }
                        int i7 = i6;
                        i4 i4VarR1 = dyb.r0(arrayList6);
                        boolean z5 = arrayList6.size() > 1;
                        int iOrdinal2 = zvh0Var2.ordinal();
                        if (iOrdinal2 == 0) {
                            dxh0Var = axh0.f1625a;
                        } else if (iOrdinal2 == 1) {
                            dxh0Var = zwh0.f45106a;
                        } else if (iOrdinal2 == 2) {
                            dxh0Var = cxh0.f5122a;
                        } else {
                            if (iOrdinal2 != 3) {
                                t9f.b();
                                return null;
                            }
                            dxh0Var = bxh0.f3376a;
                        }
                        dxh0 dxh0Var2 = dxh0Var;
                        ArrayList arrayList7 = new ArrayList(r3d.q(arrayList6, 10));
                        Iterator it7 = arrayList6.iterator();
                        while (it7.hasNext()) {
                            arrayList7.add(new yvh0(((i49) it7.next()).getDescription(), bwh0.f3325a));
                        }
                        return new j49(gameBroadcastingParams, i7, g49Var, i4VarR1, z5, dxh0Var2, dyb.r0(arrayList7));
                    case 10:
                        return b(obj);
                    default:
                        gna gnaVar5 = (gna) obj;
                        if ((gnaVar5 instanceof ena ? (ena) gnaVar5 : null) == null || (hnaVar = ((ena) gnaVar5).j) == null) {
                            return null;
                        }
                        boolean zContains4 = ((List) ((fee) rjsVar.o.getValue()).c()).contains(ch00.SHORT_STATISTIC);
                        ctf0 ctf0Var8 = rjsVar.f30611a;
                        ctf0Var8.getClass();
                        List<vrj0> list11 = hnaVar.f;
                        ArrayList arrayList8 = new ArrayList(r3d.q(list11, 10));
                        for (vrj0 vrj0Var : list11) {
                            float fS = r7x.s(vrj0Var.b);
                            float fS2 = r7x.s(vrj0Var.c);
                            String str24 = vrj0Var.f37902a;
                            String str25 = vrj0Var.b;
                            String str26 = vrj0Var.c;
                            if (fS == 0.0f && fS2 == 0.0f) {
                                fS = 0.0f;
                            }
                            arrayList8.add(new srj0(fS, (fS == 0.0f && fS2 == 0.0f) ? 0.0f : fS2, str24, str25, str26));
                        }
                        dja djaVar4 = dja.PENALTY;
                        ch00 ch00Var4 = ch00.SHORT_STATISTIC;
                        i4 i4VarR2 = zContains4 ? dyb.r0(arrayList8) : dyb.r0(CollectionsKt.D0(arrayList8, 3));
                        if (arrayList8.size() - 1 > 3) {
                            lsm0 lsm0Var = ctf0Var8.b;
                            lmoVar = new lmo(lsm0Var.a(R.string.expand, Arrays.copyOf(new Object[0], 0)), lsm0Var.a(R.string.collapse, Arrays.copyOf(new Object[0], 0)), zContains4);
                        } else {
                            lmoVar = null;
                        }
                        return new hax(i4VarR2, lmoVar);
                }
            }
        }, (byte) 20));
        final byte b5 = 10;
        this.D = bkb.G(a().d, new Function1(this) { // from class: a.qjs
            public final /* synthetic */ rjs b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:260:0x08d4  */
            /* JADX WARN: Code duplicated, block: B:262:0x08e4  */
            /* JADX WARN: Code duplicated, block: B:265:0x090f  */
            /* JADX WARN: Code duplicated, block: B:268:0x0932  */
            /* JADX WARN: Code duplicated, block: B:270:0x0936  */
            /* JADX WARN: Code duplicated, block: B:272:0x094e  */
            private final Object a(Object obj) {
                n0o0 n0o0Var;
                n0o0 n0o0Var2;
                String str;
                String str2;
                mqr kqrVar;
                String strG;
                d3h0 pekVar;
                String strN;
                d3h0 xakVar;
                Integer num;
                String strN2;
                int i;
                iul0 iul0Var;
                yd90 yd90Var;
                yd90 yd90Var2;
                iul0 iul0Var2;
                String str3;
                String str4;
                d3h0 bekVar;
                String strA;
                String strB;
                String strN3;
                rjs rjsVar = this.b;
                n0o0 n0o0Var3 = rjsVar.v;
                n0o0 n0o0Var4 = rjsVar.m;
                n0o0 n0o0Var5 = rjsVar.H;
                n0o0 n0o0Var6 = rjsVar.I;
                ctf0 ctf0Var2 = rjsVar.f30611a;
                gna gnaVar = (gna) obj;
                if (gnaVar != null) {
                    if (!(gnaVar instanceof ena)) {
                        if (gnaVar instanceof fna) {
                            ctf0Var2.getClass();
                            return new orr(d9x.L(((fna) gnaVar).f9825a, ctf0Var2));
                        }
                        t9f.b();
                        return null;
                    }
                    ena enaVar = (ena) gnaVar;
                    mca mcaVar = enaVar.f8084a;
                    List list = (List) ((fee) rjsVar.n.getValue()).c();
                    boolean zBooleanValue = ((Boolean) ((fee) rjsVar.e.getValue()).c()).booleanValue();
                    mpm mpmVar = (mpm) ((fee) n0o0Var6.getValue()).b();
                    boolean z = enaVar.p;
                    String str5 = (String) ((fee) rjsVar.p.getValue()).c();
                    String str6 = (String) ((fee) rjsVar.q.getValue()).c();
                    String str7 = (String) ((fee) rjsVar.r.getValue()).c();
                    String str8 = (String) ((fee) rjsVar.s.getValue()).c();
                    jg30 jg30Var = (jg30) ((fee) n0o0Var5.getValue()).b();
                    bg30 bg30Var = (bg30) ((fee) n0o0Var6.getValue()).c();
                    znq0 znq0Var = (znq0) ((fee) rjsVar.t.getValue()).c();
                    bha bhaVar = enaVar.o;
                    ui9 ui9Var = (ui9) ((fee) rjsVar.u.getValue()).c();
                    long jLongValue = ((Number) ((fee) n0o0Var4.getValue()).c()).longValue();
                    boolean zBooleanValue2 = ((Boolean) ((fee) n0o0Var3.getValue()).c()).booleanValue();
                    ctf0Var2.getClass();
                    if (ui9Var != null) {
                        int i2 = ui9Var.c;
                        int i3 = ui9Var.d;
                        n0o0Var = n0o0Var4;
                        String strN4 = (cy7.c() && zBooleanValue2) ? w6x.n(i3, i2, " : ") : w6x.n(i2, i3, " : ");
                        String strX = j0x.x(jLongValue, ctf0Var2);
                        ArrayList arrayList = ui9Var.f35720a;
                        n0o0Var2 = n0o0Var5;
                        str = str5;
                        str2 = str6;
                        ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
                        int i4 = 0;
                        for (Object obj2 : arrayList) {
                            int i5 = i4 + 1;
                            if (i4 < 0) {
                                q3d.p();
                                throw null;
                            }
                            arrayList2.add(piz.W((sc90) obj2, jLongValue, i4));
                            i4 = i5;
                        }
                        i4 i4VarR0 = dyb.r0(arrayList2);
                        ArrayList arrayList3 = ui9Var.b;
                        ArrayList arrayList4 = new ArrayList(r3d.q(arrayList3, 10));
                        int i6 = 0;
                        for (Object obj3 : arrayList3) {
                            int i7 = i6 + 1;
                            if (i6 < 0) {
                                q3d.p();
                                throw null;
                            }
                            arrayList4.add(piz.W((sc90) obj3, jLongValue, i6));
                            i6 = i7;
                        }
                        kqrVar = new iqr(strN4, strX, i4VarR0, dyb.r0(arrayList4));
                    } else {
                        n0o0Var = n0o0Var4;
                        n0o0Var2 = n0o0Var5;
                        str = str5;
                        str2 = str6;
                        if (bhaVar != null) {
                            float f = bhaVar.d;
                            float f2 = bhaVar.e;
                            float f3 = bhaVar.f;
                            Object[] objArr = {Float.valueOf(f3)};
                            lsm0 lsm0Var = ctf0Var2.b;
                            String strA2 = lsm0Var.a(R.string.n_percents, Arrays.copyOf(objArr, 1));
                            k3w0 g3w0Var = (f3 <= f2 || f3 <= f) ? new g3w0(strA2) : new i3w0(strA2);
                            String strA3 = lsm0Var.a(R.string.n_percents, Arrays.copyOf(new Object[]{Float.valueOf(f2)}, 1));
                            k3w0 g3w0Var2 = (f2 <= f3 || f2 <= f) ? new g3w0(strA3) : new i3w0(strA3);
                            String strA4 = lsm0Var.a(R.string.n_percents, Arrays.copyOf(new Object[]{Float.valueOf(f)}, 1));
                            kqrVar = new kqr(g3w0Var, g3w0Var2, (f <= f3 || f <= f2) ? new g3w0(strA4) : new i3w0(strA4));
                        } else {
                            kqrVar = null;
                        }
                    }
                    anq0 anq0Var2 = (anq0) ((fee) n0o0Var2.getValue()).c();
                    boolean z2 = anq0Var2 != null ? anq0Var2.f1167a : false;
                    long jLongValue2 = ((Number) ((fee) n0o0Var.getValue()).c()).longValue();
                    boolean zBooleanValue3 = ((Boolean) ((fee) n0o0Var3.getValue()).c()).booleanValue();
                    list.getClass();
                    mpmVar.getClass();
                    String strA5 = "";
                    if (mcaVar instanceof pca) {
                        pca pcaVar = (pca) mcaVar;
                        uqr uqrVarR0 = pzb.r0(mcaVar, str, str2, str7, str8, jg30Var);
                        if (bg30Var == null || (bekVar = bg30Var.b) == null) {
                            bekVar = bg30Var != null ? bg30Var.f2536a : new bek();
                        }
                        d3h0 d3h0Var = bekVar;
                        boolean z3 = d3h0Var instanceof lz10;
                        lz10 lz10Var = z3 ? (lz10) d3h0Var : null;
                        if (lz10Var != null) {
                            strA = vzb.T(lz10Var, zBooleanValue3);
                        } else {
                            hzm0 hzm0Var = d3h0Var instanceof hzm0 ? (hzm0) d3h0Var : null;
                            if (hzm0Var != null) {
                                String str9 = hzm0Var.g;
                                String str10 = hzm0Var.i;
                                StringBuilder sb = new StringBuilder("\u2066");
                                if (cy7.c() && zBooleanValue3) {
                                    if (str10 != null) {
                                        hne.B(sb, "(ov ", str10, Separators.RPAREN);
                                    }
                                    sb.append(vzb.i0(str9));
                                } else {
                                    sb.append(str9);
                                    if (str10 != null) {
                                        hne.B(sb, Separators.LPAREN, str10, " ov)");
                                    }
                                }
                                sb.append("\u2069");
                                strA = sb.toString();
                            } else {
                                strA = d3h0Var.a();
                            }
                        }
                        String str11 = strA;
                        lz10 lz10Var2 = z3 ? (lz10) d3h0Var : null;
                        if (lz10Var2 != null) {
                            strB = vzb.U(lz10Var2, zBooleanValue3);
                        } else {
                            hzm0 hzm0Var2 = d3h0Var instanceof hzm0 ? (hzm0) d3h0Var : null;
                            if (hzm0Var2 != null) {
                                String str12 = hzm0Var2.h;
                                String str13 = hzm0Var2.j;
                                StringBuilder sb2 = new StringBuilder("\u2066");
                                if (cy7.c() && zBooleanValue3) {
                                    if (str13 != null) {
                                        hne.B(sb2, "(ov ", str13, Separators.RPAREN);
                                    }
                                    sb2.append(vzb.i0(str12));
                                } else {
                                    sb2.append(str12);
                                    if (str13 != null) {
                                        hne.B(sb2, Separators.LPAREN, str13, " ov)");
                                    }
                                }
                                sb2.append("\u2069");
                                strB = sb2.toString();
                            } else {
                                strB = d3h0Var.b();
                            }
                        }
                        String str14 = strB;
                        boolean z4 = pcaVar.d;
                        rpp0 rpp0Var = pcaVar.f26749a;
                        j83 j83VarH = vzb.H(ctf0Var2, d3h0Var, pcaVar.e, pcaVar.f, pcaVar.g, (bg30Var == null || (strN3 = bg30Var.f2536a.n()) == null) ? "" : strN3, z4, zBooleanValue3);
                        String strB2 = rpp0Var.b();
                        c280 c280Var = new c280(vsm0.s(rpp0Var.a(), pcaVar.b), R.drawable.ic_glyph_placeholder_player);
                        long jA = rpp0Var.a();
                        bap bapVar = bap.b;
                        jdp0 jdp0Var = new jdp0(strB2, n6x.o0(c280Var, jA, list, zBooleanValue, bapVar), null);
                        jdp0 jdp0Var2 = new jdp0(rpp0Var.d(), n6x.o0(new c280(vsm0.s(rpp0Var.c(), pcaVar.c), R.drawable.ic_glyph_placeholder_player), rpp0Var.c(), list, zBooleanValue, bapVar), null);
                        lz10 lz10Var3 = z3 ? (lz10) d3h0Var : null;
                        return new mrr(uqrVarR0, jdp0Var, jdp0Var2, j83VarH, lz10Var3 != null ? vzb.G(lz10Var3.i) : eex.c, str11, d3h0Var.j(), str14, d3h0Var.i());
                    }
                    boolean z5 = z2;
                    String str15 = str;
                    String str16 = str2;
                    boolean z6 = mcaVar instanceof tca;
                    qpm qpmVar = qpm.f29126a;
                    if (z6) {
                        tca tcaVar = (tca) mcaVar;
                        uqr uqrVarR1 = pzb.r0(mcaVar, str15, str16, str7, str8, jg30Var);
                        znq0 znq0Var2 = new znq0(znq0Var != null ? znq0Var.f44687a : 0L);
                        rpp0 rpp0Var2 = tcaVar.f33711a;
                        boolean z7 = tcaVar.i;
                        if (rpp0Var2 instanceof qpp0) {
                            qpp0 qpp0Var = (qpp0) rpp0Var2;
                            jdp0 jdp0Var3 = new jdp0(qpp0Var.g, n6x.o0(u1c.C(tcaVar, true), qpp0Var.e, list, zBooleanValue || z7, bap.b), null);
                            jdp0 jdp0Var4 = new jdp0(qpp0Var.h, n6x.o0(u1c.C(tcaVar, false), qpp0Var.f, list, zBooleanValue || z7, bap.f2271a), null);
                            lpm lpmVar = new lpm(qpmVar, new hpm(0L, 3));
                            dpi0 dpi0Var = new dpi0((byte) 15);
                            rdj rdjVar = rdj.f30294a;
                            vzb.E(dpi0Var, rdj.g(znq0Var2, efj.UNIVERSAL, Boolean.valueOf(z), false, 56));
                            return new trr(uqrVarR1, jdp0Var3, jdp0Var4, lpmVar, ((h83) dpi0Var.f6468a).h(), kqrVar);
                        }
                        if (!(rpp0Var2 instanceof ppp0)) {
                            t9f.b();
                            return null;
                        }
                        ppp0 ppp0Var = (ppp0) rpp0Var2;
                        xcp0 xcp0VarC0 = b8k0.c0(ppp0Var.e, ppp0Var.g, tcaVar.b);
                        xcp0 xcp0VarC1 = b8k0.c0(ppp0Var.f, ppp0Var.h, tcaVar.c);
                        lpm lpmVar2 = new lpm(qpmVar, new hpm(0L, 3));
                        dpi0 dpi0Var2 = new dpi0((byte) 15);
                        rdj rdjVar2 = rdj.f30294a;
                        vzb.E(dpi0Var2, rdj.g(znq0Var2, efj.UNIVERSAL, Boolean.valueOf(z), false, 56));
                        return new trr(uqrVarR1, xcp0VarC0, xcp0VarC1, lpmVar2, ((h83) dpi0Var2.f6468a).h(), kqrVar);
                    }
                    if (!(mcaVar instanceof xca)) {
                        if (mcaVar instanceof gda) {
                            gda gdaVar = (gda) mcaVar;
                            uqr uqrVarR2 = pzb.r0(mcaVar, str15, str16, str7, str8, jg30Var);
                            znq0 znq0Var3 = new znq0(znq0Var != null ? znq0Var.f44687a : 0L);
                            String strB0 = CollectionsKt.b0(gdaVar.f11094a, Separators.SLASH, null, null, null, 62);
                            String strB1 = CollectionsKt.b0(gdaVar.b, Separators.SLASH, null, null, null, 62);
                            lpm lpmVar3 = new lpm(qpmVar, new hpm(0L, 3));
                            dpi0 dpi0Var3 = new dpi0((byte) 15);
                            rdj rdjVar3 = rdj.f30294a;
                            vzb.E(dpi0Var3, rdj.g(znq0Var3, efj.UNIVERSAL, Boolean.valueOf(z), false, 56));
                            return new rrr(uqrVarR2, strB0, strB1, lpmVar3, ((h83) dpi0Var3.f6468a).h());
                        }
                        if (mcaVar instanceof hda) {
                            hda hdaVar = (hda) mcaVar;
                            uqr uqrVarR3 = pzb.r0(mcaVar, str15, str16, str7, str8, jg30Var);
                            if (bg30Var == null || (pekVar = bg30Var.b) == null) {
                                pekVar = bg30Var != null ? bg30Var.f2536a : new pek();
                            }
                            return new rrr(uqrVarR3, CollectionsKt.b0(hdaVar.f12861a, Separators.SLASH, null, null, null, 62), CollectionsKt.b0(hdaVar.b, Separators.SLASH, null, null, null, 62), mpmVar, vzb.H(ctf0Var2, pekVar, hdaVar.h, hdaVar.i, hdaVar.j, (bg30Var == null || (strN = bg30Var.f2536a.n()) == null) ? "" : strN, hdaVar.g, zBooleanValue3));
                        }
                        if (!(mcaVar instanceof ida)) {
                            t9f.b();
                            return null;
                        }
                        ida idaVar = (ida) mcaVar;
                        uqr uqrVarR4 = pzb.r0(mcaVar, str15, str16, str7, str8, jg30Var);
                        if (!idaVar.g) {
                            if (znq0Var != null) {
                                rdj rdjVar4 = rdj.f30294a;
                                strG = rdj.g(znq0Var, efj.UNIVERSAL, Boolean.valueOf(z), false, 56);
                                if (strG == null) {
                                }
                            }
                            dpi0 dpi0Var8 = new dpi0((byte) 15);
                            vzb.E(dpi0Var8, strG);
                            return new vrr(uqrVarR4, idaVar.e, ((h83) dpi0Var8.f6468a).h());
                        }
                        strA5 = ctf0Var2.b.a(R.string.game_end, Arrays.copyOf(new Object[0], 0));
                        strG = strA5;
                        dpi0 dpi0Var9 = new dpi0((byte) 15);
                        vzb.E(dpi0Var9, strG);
                        return new vrr(uqrVarR4, idaVar.e, ((h83) dpi0Var9.f6468a).h());
                    }
                    if (!gql0.d().contains(Long.valueOf(jLongValue2))) {
                        xca xcaVar = (xca) mcaVar;
                        uqr uqrVarR5 = pzb.r0(mcaVar, str15, str16, str7, str8, jg30Var);
                        if (bg30Var == null || (xakVar = bg30Var.b) == null) {
                            xakVar = bg30Var != null ? bg30Var.f2536a : new xak((byte) 22);
                        }
                        boolean z8 = xcaVar.l;
                        boolean z9 = xcaVar.q;
                        rpp0 rpp0Var3 = xcaVar.f40636a;
                        j83 j83VarH2 = vzb.H(ctf0Var2, xakVar, xcaVar.n, xcaVar.o, xcaVar.p, (bg30Var == null || (strN2 = bg30Var.f2536a.n()) == null) ? "" : strN2, z8, zBooleanValue3);
                        if (!(rpp0Var3 instanceof qpp0)) {
                            if (rpp0Var3 instanceof ppp0) {
                                ppp0 ppp0Var2 = (ppp0) rpp0Var3;
                                return new trr(uqrVarR5, b8k0.c0(ppp0Var2.e, ppp0Var2.g, xcaVar.h), b8k0.c0(ppp0Var2.f, ppp0Var2.h, xcaVar.i), mpmVar, j83VarH2, kqrVar);
                            }
                            t9f.b();
                            return null;
                        }
                        int i8 = xcaVar.b;
                        int i9 = xcaVar.g;
                        int i10 = xcaVar.f;
                        int i11 = xcaVar.d;
                        int i12 = xcaVar.c;
                        vy vyVar = (i8 == 0 && i12 == 0 && i11 == 0) ? null : new vy(i8 > 0 ? Integer.valueOf(i8) : null, i12 > 0 ? Integer.valueOf(i12) : null, i11 > 0 ? Integer.valueOf(i11) : null);
                        int i13 = xcaVar.e;
                        vy vyVar2 = (i13 == 0 && i10 == 0 && i9 == 0) ? null : new vy(i13 > 0 ? Integer.valueOf(i13) : null, i10 > 0 ? Integer.valueOf(i10) : null, i9 > 0 ? Integer.valueOf(i9) : null);
                        boolean z10 = (vyVar == null && vyVar2 == null) ? false : true;
                        if (z10 && vyVar == null) {
                            num = null;
                            vyVar = new vy(null, null, null);
                        } else {
                            num = null;
                        }
                        if (z10 && vyVar2 == null) {
                            vyVar2 = new vy(num, num, num);
                        }
                        qpp0 qpp0Var2 = (qpp0) rpp0Var3;
                        return new trr(uqrVarR5, new jdp0(qpp0Var2.g, n6x.o0(u1c.D(xcaVar, true), qpp0Var2.e, list, zBooleanValue || z9, bap.b), vyVar), new jdp0(qpp0Var2.h, n6x.o0(u1c.D(xcaVar, false), qpp0Var2.f, list, zBooleanValue || z9, bap.f2271a), vyVar2), mpmVar, j83VarH2, kqrVar);
                    }
                    xca xcaVar2 = (xca) mcaVar;
                    long j = znq0Var != null ? znq0Var.f44687a : 0L;
                    uqr uqrVarR6 = pzb.r0(mcaVar, str15, str16, str7, str8, jg30Var);
                    znq0 znq0Var4 = new znq0(j);
                    pz10 pz10Var = bg30Var != null ? bg30Var.f2536a : null;
                    if (pz10Var instanceof nz10) {
                        izm0 izm0Var = bg30Var.b;
                        String str17 = xcaVar2.s;
                        List list2 = xcaVar2.i;
                        List list3 = xcaVar2.h;
                        rpp0 rpp0Var4 = xcaVar2.f40636a;
                        boolean z11 = xcaVar2.l;
                        String str18 = xcaVar2.p;
                        rdj rdjVar5 = rdj.f30294a;
                        pz10 pz10Var2 = pz10Var;
                        String strG2 = rdj.g(znq0Var4, efj.UNIVERSAL, Boolean.valueOf(z), false, 56);
                        str18.getClass();
                        strG2.getClass();
                        dpi0 dpi0Var10 = new dpi0((byte) 15);
                        if (str17 != null) {
                            vzb.E(dpi0Var10, str17);
                            vzb.E(dpi0Var10, ": ");
                            boolean z12 = cy7.c() && zBooleanValue3;
                            if (izm0Var == null) {
                                vzb.E(dpi0Var10, "0");
                                vzb.C(dpi0Var10);
                                vzb.E(dpi0Var10, "0");
                            } else {
                                if (!(izm0Var instanceof gzm0) && !(izm0Var instanceof hzm0)) {
                                    t9f.b();
                                    return null;
                                }
                                boolean z13 = izm0Var instanceof hzm0;
                                String strA6 = z13 ? ((hzm0) izm0Var).g : izm0Var.a();
                                String strB3 = z13 ? ((hzm0) izm0Var).h : izm0Var.b();
                                vzb.E(dpi0Var10, "\u2066");
                                if (z12) {
                                    vzb.D(dpi0Var10, strB3, vzb.L(izm0Var.i()));
                                    vzb.C(dpi0Var10);
                                    vzb.D(dpi0Var10, strA6, vzb.L(izm0Var.j()));
                                } else {
                                    vzb.D(dpi0Var10, strA6, vzb.L(izm0Var.j()));
                                    vzb.C(dpi0Var10);
                                    vzb.D(dpi0Var10, strB3, vzb.L(izm0Var.i()));
                                }
                                vzb.E(dpi0Var10, "\u2069");
                            }
                        } else {
                            vzb.E(dpi0Var10, strG2);
                            if (str18.length() > 0) {
                                vzb.A(dpi0Var10);
                                vzb.E(dpi0Var10, str18);
                            }
                            if (z11) {
                                vzb.A(dpi0Var10);
                                i = 0;
                                vzb.E(dpi0Var10, ctf0Var2.b.a(R.string.game_end, Arrays.copyOf(new Object[0], 0)));
                            } else {
                                i = 0;
                            }
                            if (z5) {
                                vzb.A(dpi0Var10);
                                vzb.E(dpi0Var10, ctf0Var2.b.a(R.string.card_cricket_break, Arrays.copyOf(new Object[i], i)));
                            }
                        }
                        j83 j83VarH3 = ((h83) dpi0Var10.f6468a).h();
                        nz10 nz10Var = (nz10) pz10Var2;
                        boolean z14 = nz10Var instanceof mz10;
                        k5q0 k5q0Var = k5q0.b;
                        if (!z14) {
                            if (nz10Var instanceof oz10) {
                                oz10 oz10Var = (oz10) nz10Var;
                                String str19 = oz10Var.i;
                                String str20 = oz10Var.g;
                                String str21 = oz10Var.m;
                                String str22 = oz10Var.k;
                                boolean z15 = ((StringsKt.W(str22) || str22.equals("0")) && (StringsKt.W(str21) || str21.equals("0"))) ? false : true;
                                boolean z16 = str20.length() > 0 || str19.length() > 0;
                                eex eexVarG = vzb.G(oz10Var.o);
                                ArrayList arrayList5 = oz10Var.f;
                                ArrayList arrayList6 = new ArrayList(r3d.q(arrayList5, 10));
                                Iterator it = arrayList5.iterator();
                                while (it.hasNext()) {
                                    te90 te90Var = (te90) it.next();
                                    arrayList6.add(new yd90(vzb.O(te90Var), vzb.Q(te90Var), te90Var.f33809a));
                                    it = it;
                                    z15 = z15;
                                }
                                boolean z17 = z15;
                                i4 i4VarR1 = dyb.r0(arrayList6);
                                j83 j83VarN = vzb.N(nz10Var);
                                j83 j83VarP = vzb.P(nz10Var);
                                lsm0 lsm0Var2 = ctf0Var2.b;
                                yd90 yd90Var3 = new yd90(j83VarN, j83VarP, lsm0Var2.a(R.string.total_count, Arrays.copyOf(new Object[0], 0)));
                                if (z17) {
                                    h83 h83Var = new h83();
                                    long j2 = y3d.g;
                                    long j3 = daq0.c;
                                    smk0 smk0Var = new smk0(vzb.L(oz10Var.l), j3, null, null, null, null, null, j3, new j56(0.0f), null, null, j2, k5q0Var, null, null, 17424);
                                    h83Var.c(str22);
                                    j83 j83VarC = kng0.c(h83Var.f12607a, h83Var, smk0Var, 0);
                                    h83 h83Var2 = new h83();
                                    smk0 smk0Var2 = new smk0(vzb.L(oz10Var.n), j3, null, null, null, null, null, j3, new j56(0.0f), null, null, j2, k5q0Var, null, null, 17424);
                                    h83Var2.c(str21);
                                    yd90Var = new yd90(j83VarC, kng0.c(h83Var2.f12607a, h83Var2, smk0Var2, 0), lsm0Var2.a(R.string.dt_points, Arrays.copyOf(new Object[0], 0)));
                                } else {
                                    yd90Var = null;
                                }
                                if (z16) {
                                    h83 h83Var3 = new h83();
                                    long j4 = y3d.g;
                                    long j5 = daq0.c;
                                    smk0 smk0Var3 = new smk0(vzb.L(oz10Var.h), j5, null, null, null, null, null, j5, new j56(0.0f), null, null, j4, k5q0Var, null, null, 17424);
                                    h83Var3.c(str20);
                                    j83 j83VarC2 = kng0.c(h83Var3.f12607a, h83Var3, smk0Var3, 0);
                                    h83 h83Var4 = new h83();
                                    smk0 smk0Var4 = new smk0(vzb.L(oz10Var.j), j5, null, null, null, null, null, j5, new j56(0.0f), null, null, j4, k5q0Var, null, null, 17424);
                                    h83Var4.c(str19);
                                    yd90Var2 = new yd90(j83VarC2, kng0.c(h83Var4.f12607a, h83Var4, smk0Var4, 0), lsm0Var2.a(R.string.tennis_game_column, Arrays.copyOf(new Object[0], 0)));
                                } else {
                                    yd90Var2 = null;
                                }
                                iul0Var2 = new iul0(eexVarG, i4VarR1, yd90Var3, yd90Var2, yd90Var);
                            } else {
                                if (!(nz10Var instanceof kz10)) {
                                    t9f.b();
                                    return null;
                                }
                                kz10 kz10Var = (kz10) nz10Var;
                                eex eexVarG2 = vzb.G(kz10Var.g);
                                ArrayList<te90> arrayList7 = kz10Var.f;
                                ArrayList arrayList8 = new ArrayList(r3d.q(arrayList7, 10));
                                for (te90 te90Var2 : arrayList7) {
                                    arrayList8.add(new yd90(vzb.O(te90Var2), vzb.Q(te90Var2), te90Var2.f33809a));
                                }
                                iul0Var = new iul0(eexVarG2, dyb.r0(arrayList8), new yd90(vzb.N(nz10Var), vzb.P(nz10Var), ctf0Var2.b.a(R.string.total_count, Arrays.copyOf(new Object[0], 0))), null, null);
                            }
                            if (rpp0Var4 instanceof qpp0) {
                                if (rpp0Var4 instanceof ppp0) {
                                    ppp0 ppp0Var7 = (ppp0) rpp0Var4;
                                    return new xrr(uqrVarR6, b8k0.c0(ppp0Var7.e, ppp0Var7.g, list3), b8k0.c0(ppp0Var7.f, ppp0Var7.h, list2), j83VarH3, iul0Var2);
                                }
                                t9f.b();
                                return null;
                            }
                            qpp0 qpp0Var7 = (qpp0) rpp0Var4;
                            String str213 = qpp0Var7.g;
                            str3 = (String) CollectionsKt.firstOrNull(list3);
                            if (str3 == null) {
                                str3 = "";
                            }
                            c280 c280Var6 = new c280(vsm0.s(qpp0Var7.e, str3), R.drawable.ic_glyph_placeholder_player);
                            long j12 = qpp0Var7.e;
                            bap bapVar6 = bap.b;
                            jdp0 jdp0Var9 = new jdp0(str213, n6x.o0(c280Var6, j12, list, zBooleanValue, bapVar6), null);
                            String str214 = qpp0Var7.h;
                            str4 = (String) CollectionsKt.firstOrNull(list2);
                            if (str4 == null) {
                                str4 = "";
                            }
                            return new xrr(uqrVarR6, jdp0Var9, new jdp0(str214, n6x.o0(new c280(vsm0.s(qpp0Var7.f, str4), R.drawable.ic_glyph_placeholder_player), qpp0Var7.f, list, zBooleanValue, bapVar6), null), j83VarH3, iul0Var2);
                        }
                        mz10 mz10Var = (mz10) nz10Var;
                        eex eexVarG3 = vzb.G(mz10Var.g);
                        ArrayList<te90> arrayList9 = mz10Var.f;
                        ArrayList arrayList10 = new ArrayList(r3d.q(arrayList9, 10));
                        for (te90 te90Var3 : arrayList9) {
                            arrayList10.add(new yd90(vzb.O(te90Var3), vzb.Q(te90Var3), te90Var3.f33809a));
                        }
                        i4 i4VarR2 = dyb.r0(arrayList10);
                        j83 j83VarN2 = vzb.N(nz10Var);
                        j83 j83VarP2 = vzb.P(nz10Var);
                        lsm0 lsm0Var3 = ctf0Var2.b;
                        yd90 yd90Var4 = new yd90(j83VarN2, j83VarP2, lsm0Var3.a(R.string.total_count, Arrays.copyOf(new Object[0], 0)));
                        h83 h83Var5 = new h83();
                        String str25 = mz10Var.h;
                        long j7 = y3d.g;
                        long j8 = daq0.c;
                        smk0 smk0Var5 = new smk0(vzb.L(mz10Var.i), j8, null, null, null, null, null, j8, new j56(0.0f), null, null, j7, k5q0Var, null, null, 17424);
                        h83Var5.c(str25);
                        j83 j83VarC3 = kng0.c(h83Var5.f12607a, h83Var5, smk0Var5, 0);
                        h83 h83Var6 = new h83();
                        String str26 = mz10Var.j;
                        smk0 smk0Var6 = new smk0(vzb.L(mz10Var.k), j8, null, null, null, null, null, j8, new j56(0.0f), null, null, j7, k5q0Var, null, null, 17424);
                        h83Var6.c(str26);
                        iul0Var = new iul0(eexVarG3, i4VarR2, yd90Var4, null, new yd90(j83VarC3, kng0.c(h83Var6.f12607a, h83Var6, smk0Var6, 0), lsm0Var3.a(R.string.dt_points, Arrays.copyOf(new Object[0], 0))));
                        iul0Var2 = iul0Var;
                        if (rpp0Var4 instanceof qpp0) {
                            if (rpp0Var4 instanceof ppp0) {
                                ppp0 ppp0Var8 = (ppp0) rpp0Var4;
                                return new xrr(uqrVarR6, b8k0.c0(ppp0Var8.e, ppp0Var8.g, list3), b8k0.c0(ppp0Var8.f, ppp0Var8.h, list2), j83VarH3, iul0Var2);
                            }
                            t9f.b();
                            return null;
                        }
                        qpp0 qpp0Var8 = (qpp0) rpp0Var4;
                        String str215 = qpp0Var8.g;
                        str3 = (String) CollectionsKt.firstOrNull(list3);
                        if (str3 == null) {
                            str3 = "";
                        }
                        c280 c280Var7 = new c280(vsm0.s(qpp0Var8.e, str3), R.drawable.ic_glyph_placeholder_player);
                        long j13 = qpp0Var8.e;
                        bap bapVar7 = bap.b;
                        jdp0 jdp0Var10 = new jdp0(str215, n6x.o0(c280Var7, j13, list, zBooleanValue, bapVar7), null);
                        String str216 = qpp0Var8.h;
                        str4 = (String) CollectionsKt.firstOrNull(list2);
                        if (str4 == null) {
                            str4 = "";
                        }
                        return new xrr(uqrVarR6, jdp0Var10, new jdp0(str216, n6x.o0(new c280(vsm0.s(qpp0Var8.f, str4), R.drawable.ic_glyph_placeholder_player), qpp0Var8.f, list, zBooleanValue, bapVar7), null), j83VarH3, iul0Var2);
                    }
                }
                return qrr.f29223a;
            }

            /* JADX WARN: Code duplicated, block: B:18:0x008a  */
            private final Object b(Object obj) {
                String strG;
                lz10 lz10Var;
                float f;
                fad dadVar;
                sad qadVar;
                j83 j83VarC;
                j83 j83VarC2;
                gna gnaVar = (gna) obj;
                if (gnaVar == null) {
                    return null;
                }
                if (!(gnaVar instanceof ena)) {
                    if (gnaVar instanceof fna) {
                        return null;
                    }
                    t9f.b();
                    return null;
                }
                ena enaVar = (ena) gnaVar;
                mca mcaVar = enaVar.f8084a;
                rjs rjsVar = this.b;
                jg30 jg30Var = (jg30) ((fee) rjsVar.H.getValue()).b();
                bg30 bg30Var = (bg30) ((fee) rjsVar.I.getValue()).c();
                pz10 pz10Var = bg30Var != null ? bg30Var.f2536a : null;
                ctf0 ctf0Var2 = rjsVar.f30611a;
                boolean z = enaVar.p;
                znq0 znq0Var = (znq0) ((fee) rjsVar.t.getValue()).c();
                boolean zBooleanValue = ((Boolean) ((fee) rjsVar.v.getValue()).c()).booleanValue();
                ctf0Var2.getClass();
                dja djaVar = dja.PENALTY;
                k5q0 k5q0Var = k5q0.b;
                if (jg30Var != null) {
                    dadVar = new ead(jg30Var);
                    f = 0.0f;
                    lz10Var = null;
                } else {
                    h83 h83Var = new h83();
                    if (znq0Var != null) {
                        rdj rdjVar = rdj.f30294a;
                        strG = rdj.g(znq0Var, efj.UNIVERSAL, Boolean.valueOf(z), false, 56);
                        if (strG == null) {
                            strG = "";
                        }
                    } else {
                        strG = "";
                    }
                    pz40 pz40Var = s6t0.f31722a;
                    long textPrimary = s6t0.b().f33626a.getTextPrimary();
                    h83 h83Var2 = new h83();
                    long j = y3d.g;
                    long j2 = daq0.c;
                    lz10Var = null;
                    f = 0.0f;
                    smk0 smk0Var = new smk0(textPrimary, j2, null, null, null, null, null, j2, new j56(0.0f), null, null, j, k5q0Var, null, null, 17424);
                    h83Var2.c(strG);
                    StringBuilder sb = h83Var2.f12607a;
                    h83Var2.a(smk0Var, 0, sb.length());
                    sb.length();
                    h83Var.b(h83Var2.h());
                    dadVar = new dad(h83Var.h());
                }
                d3h0 cl5Var = pz10Var;
                if (mcaVar instanceof pca) {
                    if (pz10Var == null) {
                        cl5Var = new cl5((byte) 28);
                    }
                    rpp0 rpp0Var = ((pca) mcaVar).f26749a;
                    String strB = rpp0Var.b();
                    String strD = rpp0Var.d();
                    boolean z2 = cl5Var instanceof lz10;
                    lz10 lz10Var2 = z2 ? (lz10) cl5Var : lz10Var;
                    String strT = lz10Var2 != null ? vzb.T(lz10Var2, zBooleanValue) : "0";
                    lz10 lz10Var3 = z2 ? (lz10) cl5Var : lz10Var;
                    qadVar = new pad(strB, strD, strT, lz10Var3 != null ? vzb.U(lz10Var3, zBooleanValue) : "0", cl5Var.j(), cl5Var.i());
                } else if (mcaVar instanceof tca) {
                    rpp0 rpp0Var2 = ((tca) mcaVar).f33711a;
                    String strB2 = rpp0Var2.b();
                    String strD2 = rpp0Var2.d();
                    h83 h83Var3 = new h83();
                    String strA = ctf0Var2.b.a(R.string.vs, Arrays.copyOf(new Object[0], 0));
                    long j3 = y3d.g;
                    long j4 = daq0.c;
                    pz40 pz40Var2 = s6t0.f31722a;
                    smk0 smk0Var2 = new smk0(s6t0.b().f33626a.getTextPrimary(), j4, null, null, null, null, null, j4, new j56(f), null, null, j3, k5q0Var, null, null, 17424);
                    h83Var3.c(strA);
                    qadVar = new rad(kng0.c(h83Var3.f12607a, h83Var3, smk0Var2, 0), strB2, strD2);
                } else if (mcaVar instanceof xca) {
                    rpp0 rpp0Var3 = ((xca) mcaVar).f40636a;
                    String strB3 = rpp0Var3.b();
                    String strD3 = rpp0Var3.d();
                    if (pz10Var != null) {
                        j83VarC2 = vzb.M(pz10Var);
                    } else {
                        h83 h83Var4 = new h83();
                        String strA2 = ctf0Var2.b.a(R.string.vs, Arrays.copyOf(new Object[0], 0));
                        long j5 = y3d.g;
                        long j6 = daq0.c;
                        pz40 pz40Var3 = s6t0.f31722a;
                        smk0 smk0Var3 = new smk0(s6t0.b().f33626a.getTextPrimary(), j6, null, null, null, null, null, j6, new j56(f), null, null, j5, k5q0Var, null, null, 17424);
                        h83Var4.c(strA2);
                        j83VarC2 = kng0.c(h83Var4.f12607a, h83Var4, smk0Var3, 0);
                    }
                    qadVar = new rad(j83VarC2, strB3, strD3);
                } else if (mcaVar instanceof gda) {
                    gda gdaVar = (gda) mcaVar;
                    String strB0 = CollectionsKt.b0(gdaVar.f11094a, Separators.SLASH, null, null, null, 62);
                    String strB1 = CollectionsKt.b0(gdaVar.b, Separators.SLASH, null, null, null, 62);
                    h83 h83Var5 = new h83();
                    String strA3 = ctf0Var2.b.a(R.string.vs, Arrays.copyOf(new Object[0], 0));
                    long j7 = y3d.g;
                    long j8 = daq0.c;
                    pz40 pz40Var4 = s6t0.f31722a;
                    smk0 smk0Var4 = new smk0(s6t0.b().f33626a.getTextPrimary(), j8, null, null, null, null, null, j8, new j56(f), null, null, j7, k5q0Var, null, null, 17424);
                    h83Var5.c(strA3);
                    qadVar = new rad(kng0.c(h83Var5.f12607a, h83Var5, smk0Var4, 0), strB0, strB1);
                } else if (mcaVar instanceof hda) {
                    hda hdaVar = (hda) mcaVar;
                    String strB4 = CollectionsKt.b0(hdaVar.f12861a, Separators.SLASH, null, null, null, 62);
                    String strB5 = CollectionsKt.b0(hdaVar.b, Separators.SLASH, null, null, null, 62);
                    if (pz10Var != null) {
                        j83VarC = vzb.M(pz10Var);
                    } else {
                        h83 h83Var6 = new h83();
                        String strA4 = ctf0Var2.b.a(R.string.vs, Arrays.copyOf(new Object[0], 0));
                        long j9 = y3d.g;
                        long j10 = daq0.c;
                        pz40 pz40Var5 = s6t0.f31722a;
                        smk0 smk0Var5 = new smk0(s6t0.b().f33626a.getTextPrimary(), j10, null, null, null, null, null, j10, new j56(f), null, null, j9, k5q0Var, null, null, 17424);
                        h83Var6.c(strA4);
                        j83VarC = kng0.c(h83Var6.f12607a, h83Var6, smk0Var5, 0);
                    }
                    qadVar = new rad(j83VarC, strB4, strB5);
                } else {
                    if (!(mcaVar instanceof ida)) {
                        t9f.b();
                        return lz10Var;
                    }
                    qadVar = new qad(((ida) mcaVar).e);
                }
                return new dax(dadVar, qadVar);
            }

            /* JADX WARN: Code duplicated, block: B:140:0x0381  */
            /* JADX WARN: Code duplicated, block: B:70:0x01a8  */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                kc50 kc50Var;
                p700 p700Var;
                ena enaVar;
                uia uiaVar;
                String strA;
                String strC;
                String strC2;
                zvl0 zvl0Var;
                yja yjaVar;
                qal0 qal0Var;
                Object b0k0Var;
                i49 g49Var;
                dxh0 dxh0Var;
                hna hnaVar;
                lmo lmoVar;
                byte b6 = b5;
                int i = 0;
                rjs rjsVar = this.b;
                switch (b6) {
                    case 0:
                        List list = (List) obj;
                        list.getClass();
                        boolean zBooleanValue = ((Boolean) ((fee) rjsVar.c.getValue()).c()).booleanValue();
                        boolean zBooleanValue2 = ((Boolean) ((fee) rjsVar.e.getValue()).c()).booleanValue();
                        boolean zBooleanValue3 = ((Boolean) ((fee) rjsVar.f.getValue()).c()).booleanValue();
                        tf50 tf50Var = (tf50) ((fee) rjsVar.d.getValue()).c();
                        tf50Var.getClass();
                        if (!list.contains(tf50Var)) {
                            tf50Var = tf50.f33851a;
                        }
                        boolean z = !zBooleanValue2;
                        kc50 kc50Var2 = new kc50(R.drawable.ic_glyph_rectangular_scoreboard, tf50Var == tf50.f33851a);
                        tf50 tf50Var2 = tf50.b;
                        kc50 kc50Var3 = list.contains(tf50Var2) ? new kc50(R.drawable.ic_glyph_rectangular_broadcast, tf50Var == tf50Var2) : null;
                        tf50 tf50Var3 = tf50.c;
                        if (list.contains(tf50Var3)) {
                            kc50Var = new kc50(R.drawable.ic_glyph_rectangular_statistic, tf50Var == tf50Var3);
                        } else {
                            kc50Var = null;
                        }
                        return new ojs(zBooleanValue, z, zBooleanValue, zBooleanValue3, new hjs(kc50Var2, kc50Var3, kc50Var, tf50Var));
                    case 1:
                        n0o0 n0o0Var = rjsVar.o;
                        gna gnaVar = (gna) obj;
                        if ((gnaVar instanceof ena ? (ena) gnaVar : null) == null || (p700Var = ((ena) gnaVar).l) == null) {
                            return null;
                        }
                        List list2 = p700Var.e;
                        List list3 = (List) ((fee) n0o0Var.getValue()).c();
                        ch00 ch00Var = ch00.LAST_GAMES;
                        boolean zContains = list3.contains(ch00Var);
                        List list4 = (List) ((fee) n0o0Var.getValue()).c();
                        ch00 ch00Var2 = ch00.LAST_GAMES_OPP_ONE;
                        boolean zContains2 = list4.contains(ch00Var2);
                        List list5 = (List) ((fee) n0o0Var.getValue()).c();
                        ch00 ch00Var3 = ch00.LAST_GAMES_OPP_TWO;
                        boolean zContains3 = list5.contains(ch00Var3);
                        ctf0 ctf0Var2 = rjsVar.f30611a;
                        ctf0Var2.getClass();
                        ArrayList arrayList = new ArrayList();
                        List list6 = p700Var.g;
                        List list7 = p700Var.f;
                        if (!list2.isEmpty()) {
                            arrayList.add(z1x.T(list2, ctf0Var2, ctf0Var2.b.a(R.string.previous_meetings, Arrays.copyOf(new Object[0], 0)), ch00Var, zContains));
                        }
                        if (!list7.isEmpty()) {
                            arrayList.add(z1x.T(list7, ctf0Var2, kng0.l(ctf0Var2.b.a(R.string.last_games, Arrays.copyOf(new Object[0], 0)), ": ", p700Var.c), ch00Var2, zContains2));
                        }
                        if (!list6.isEmpty()) {
                            arrayList.add(z1x.T(list6, ctf0Var2, kng0.l(ctf0Var2.b.a(R.string.last_games, Arrays.copyOf(new Object[0], 0)), ": ", p700Var.d), ch00Var3, zContains3));
                        }
                        return arrayList;
                    case 2:
                        gna gnaVar2 = (gna) obj;
                        if ((gnaVar2 instanceof ena ? (ena) gnaVar2 : null) == null || (uiaVar = (enaVar = (ena) gnaVar2).h) == null) {
                            return null;
                        }
                        ctf0 ctf0Var3 = rjsVar.f30611a;
                        boolean z2 = enaVar.p;
                        ctf0Var3.getClass();
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it = uiaVar.c.iterator();
                        int i2 = 0;
                        while (it.hasNext()) {
                            Object next = it.next();
                            int i3 = i2 + 1;
                            if (i2 < 0) {
                                q3d.p();
                                throw null;
                            }
                            bsw bswVar = (bsw) next;
                            String str = bswVar.b;
                            String str2 = bswVar.e;
                            String strA2 = (str.length() <= 0 || str2.length() <= 0) ? ctf0Var3.b.a(R.string.vs, Arrays.copyOf(new Object[0], 0)) : w6x.q(bswVar.b, " : ", str2);
                            odp0 odp0Var = new odp0(new d5a0(new c280(bswVar.c, R.drawable.ic_glyph_placeholder_player)));
                            String strM = dw9.m(i3, ". ", bswVar.f3153a);
                            odp0 odp0Var2 = new odp0(new d5a0(new c280(bswVar.f, R.drawable.ic_glyph_placeholder_player)));
                            String strM2 = dw9.m(i3, ". ", bswVar.d);
                            rdj rdjVar = rdj.f30294a;
                            arrayList2.add(new hzy(odp0Var, strM, odp0Var2, strM2, rdj.g(new znq0(bswVar.g), efj.UNIVERSAL, Boolean.valueOf(z2), false, 56), strA2, "", null, null));
                            it = it;
                            i2 = i3;
                        }
                        dja djaVar = dja.PENALTY;
                        return new eax(dyb.o0(arrayList2), uiaVar.f35722a, uiaVar.b);
                    case 3:
                        anq0 anq0Var2 = (anq0) obj;
                        if (anq0Var2 != null) {
                            boolean z3 = ((Boolean) ((fee) rjsVar.g.getValue()).c()).booleanValue() || ((Boolean) ((fee) rjsVar.h.getValue()).c()).booleanValue();
                            ctf0 ctf0Var4 = rjsVar.f30611a;
                            ctf0Var4.getClass();
                            long j = anq0Var2.e;
                            long j2 = anq0Var2.d;
                            boolean z4 = anq0Var2.j;
                            if (j != 0 || !z4) {
                                String str3 = anq0Var2.c;
                                if (z4) {
                                    if (str3.length() > 0) {
                                        strA = ctf0Var4.b.a(R.string.live_additional_min_v2, Arrays.copyOf(new Object[]{str3}, 1));
                                    } else if (anq0Var2.f1167a) {
                                        strA = "";
                                    } else {
                                        strA = anq0Var2.b ? ctf0Var4.b.a(R.string.line_live_time_period_back_v2, Arrays.copyOf(new Object[]{""}, 1)) : ctf0Var4.b.a(R.string.line_live_time_period_capitalized_v2, Arrays.copyOf(new Object[]{""}, 1));
                                    }
                                } else if (j2 < 0) {
                                    strA = ctf0Var4.b.a(R.string.game_started, Arrays.copyOf(new Object[0], 0));
                                } else {
                                    long j3 = j2 / 86400;
                                    strA = j3 > 0 ? ctf0Var4.b.a(R.string.line_time_before_v2, Arrays.copyOf(new Object[]{String.valueOf(j3)}, 1)) : ctf0Var4.b.a(R.string.before_start, Arrays.copyOf(new Object[0], 0));
                                }
                                String strC3 = (z3 || z4 || j2 < 0) ? null : n2x.C((((j2 < 0 ? 0L : j2) / 60) / 60) % 24);
                                if (z3) {
                                    strC = null;
                                } else {
                                    long jB = (z4 ? vzb.V(anq0Var2).b() : j2 < 0 ? 0L : j2) / 60;
                                    if (!z4) {
                                        jB %= 60;
                                    }
                                    strC = n2x.C(jB);
                                }
                                if (z3) {
                                    strC2 = null;
                                } else {
                                    strC2 = n2x.C((z4 ? vzb.V(anq0Var2).b() : j2 >= 0 ? j2 : 0L) % 60);
                                }
                                return new jg30(strA, strC3, strC, strC2);
                            }
                        }
                        return null;
                    case 4:
                        gna gnaVar3 = (gna) obj;
                        ena enaVar2 = gnaVar3 instanceof ena ? (ena) gnaVar3 : null;
                        if (enaVar2 == null || (zvl0Var = ((ena) gnaVar3).k) == null) {
                            return null;
                        }
                        String str4 = zvl0Var.m;
                        String str5 = enaVar2.q;
                        ctf0 ctf0Var5 = rjsVar.f30611a;
                        m1v0 m1v0Var = (m1v0) ((fee) rjsVar.J.getValue()).b();
                        str5.getClass();
                        ctf0Var5.getClass();
                        String str6 = zvl0Var.f45064a;
                        Pair pair = str4.length() > 0 ? new Pair(str4, ctf0Var5.b.a(R.string.web_site, Arrays.copyOf(new Object[0], 0))) : new Pair(null, null);
                        String str7 = (String) pair.f46059a;
                        String str8 = (String) pair.b;
                        dja djaVar2 = dja.PENALTY;
                        String str9 = zvl0Var.b;
                        ArrayList arrayList3 = new ArrayList();
                        String str10 = zvl0Var.l;
                        String str11 = zvl0Var.k;
                        String str12 = zvl0Var.j;
                        String str13 = zvl0Var.i;
                        String str14 = zvl0Var.h;
                        String str15 = zvl0Var.g;
                        String str16 = zvl0Var.f;
                        String str17 = zvl0Var.e;
                        String str18 = zvl0Var.d;
                        String str19 = zvl0Var.c;
                        if (str6.length() > 0) {
                            arrayList3.add(l7x.J(ctf0Var5, str6, R.string.address));
                        }
                        if (str19.length() > 0) {
                            arrayList3.add(l7x.J(ctf0Var5, str19, R.string.capacity));
                        }
                        if (str18.length() > 0) {
                            arrayList3.add(l7x.J(ctf0Var5, str18, R.string.covering));
                        }
                        if (str17.length() > 0) {
                            arrayList3.add(l7x.J(ctf0Var5, str17, R.string.city_name));
                        }
                        if (str16.length() > 0) {
                            arrayList3.add(l7x.J(ctf0Var5, str16, R.string.architect));
                        }
                        if (str15.length() > 0) {
                            arrayList3.add(l7x.J(ctf0Var5, str15, R.string.old_name));
                        }
                        if (str14.length() > 0) {
                            arrayList3.add(l7x.J(ctf0Var5, str14, R.string.category));
                        }
                        if (str13.length() > 0) {
                            arrayList3.add(l7x.J(ctf0Var5, str13, R.string.history));
                        }
                        if (str12.length() > 0) {
                            arrayList3.add(l7x.J(ctf0Var5, str12, R.string.opened));
                        }
                        if (str11.length() > 0) {
                            arrayList3.add(l7x.J(ctf0Var5, str11, R.string.zip_code));
                        }
                        if (str10.length() > 0) {
                            arrayList3.add(l7x.J(ctf0Var5, "\u2066" + str10 + "\u2069", R.string.phone));
                        }
                        a4x a4xVarO0 = dyb.o0(arrayList3);
                        List list8 = zvl0Var.n;
                        ArrayList arrayList4 = new ArrayList(r3d.q(list8, 10));
                        Iterator it2 = list8.iterator();
                        while (it2.hasNext()) {
                            arrayList4.add(String.format(Locale.ENGLISH, "%s/sfiles/stadium/%s", Arrays.copyOf(new Object[]{str5, (String) it2.next()}, 2)));
                        }
                        a4x a4xVarO1 = dyb.o0(arrayList4);
                        if (a4xVarO1.isEmpty()) {
                            a4xVarO1 = dyb.g0("");
                        }
                        return new iax(m1v0Var, str9, a4xVarO0, str7, str8, a4xVarO1);
                    case 5:
                        gna gnaVar4 = (gna) obj;
                        if ((gnaVar4 instanceof ena ? (ena) gnaVar4 : null) != null && (yjaVar = ((ena) gnaVar4).i) != null) {
                            List list9 = yjaVar.f42730a;
                            if (!list9.isEmpty()) {
                                long jLongValue = ((Number) ((fee) rjsVar.m.getValue()).c()).longValue();
                                lc00 lc00VarB = kotlin.collections.a.b();
                                Iterator it3 = list9.iterator();
                                while (it3.hasNext()) {
                                    he30 he30Var = (he30) it3.next();
                                    List list10 = he30Var.b;
                                    ArrayList arrayList5 = new ArrayList();
                                    for (Object obj2 : list10) {
                                        if (((ge30) obj2).e.length() > 0) {
                                            arrayList5.add(obj2);
                                        }
                                    }
                                    if (!arrayList5.isEmpty()) {
                                        lc00VarB.add(new uim(he30Var.f12902a));
                                        int i4 = i;
                                        for (Object obj3 : arrayList5) {
                                            int i5 = i4 + 1;
                                            if (i4 < 0) {
                                                q3d.p();
                                                throw null;
                                            }
                                            ge30 ge30Var = (ge30) obj3;
                                            String str20 = ge30Var.f11132a;
                                            String str21 = ge30Var.e;
                                            String str22 = ge30Var.c;
                                            String str23 = ge30Var.d;
                                            tho thoVar = ge30Var.b;
                                            Iterator it4 = it3;
                                            List listSplit$default = StringsKt__StringsKt.split$default(str20, new String[]{"+"}, false, i, 6, null);
                                            long j4 = jLongValue;
                                            List listSplit$default2 = StringsKt__StringsKt.split$default(str20, new String[]{Separators.COLON}, false, i, 6, null);
                                            if (j4 == 1) {
                                                if (listSplit$default.size() == 2 && listSplit$default2.size() == 1) {
                                                    str20 = listSplit$default.get(0) + "'+" + kotlin.text.c.r((String) listSplit$default.get(1), Separators.QUOTE, "", false);
                                                } else if (listSplit$default2.size() == 2) {
                                                    str20 = listSplit$default2.get(0) + Separators.QUOTE;
                                                }
                                            }
                                            y6n y6nVar = ge30Var.j == 0 ? y6n.f42107a : y6n.b;
                                            ggm ggmVar = i4 == 0 ? arrayList5.size() + (-1) == 0 ? ggm.c : ggm.f11256a : i4 == arrayList5.size() + (-1) ? ggm.b : ggm.d;
                                            lc00VarB.add((str23.length() == 0 && str22.length() == 0) ? new sim(str20, str21, thoVar.name(), y6nVar, ggmVar, ge30Var.b()) : new rim(str20, str21, new lnm(str23, str22, 0, "", new s0m("", ""), ge30Var.k), ge30Var.a() ? new lnm(ge30Var.h, ge30Var.g, 0, "", new s0m("", ""), ge30Var.l) : null, thoVar.name(), null, y6nVar, ggmVar, ge30Var.b()));
                                            it3 = it4;
                                            i4 = i5;
                                            jLongValue = j4;
                                            i = 0;
                                        }
                                    }
                                    it3 = it3;
                                    jLongValue = jLongValue;
                                    i = 0;
                                }
                                i4 i4VarR0 = dyb.r0(kotlin.collections.a.a(lc00VarB));
                                dja djaVar3 = dja.PENALTY;
                                return new gax(new sf30(i4VarR0));
                            }
                        }
                        return null;
                    case 6:
                        vzj0 vzj0Var = (vzj0) obj;
                        if (!(((fee) rjsVar.B.getValue()).b() instanceof qrr) && vzj0Var != null) {
                            anq0 anq0Var3 = (anq0) ((fee) rjsVar.H.getValue()).c();
                            ctf0 ctf0Var6 = rjsVar.f30611a;
                            ctf0Var6.getClass();
                            znq0 znq0Var = anq0Var3 != null ? anq0Var3.h : null;
                            if (znq0Var != null) {
                                long j5 = znq0Var.f44687a;
                                if (j5 <= 0) {
                                    qal0Var = null;
                                } else {
                                    long j6 = j5 / 86400;
                                    qal0Var = new qal0(j6 > 0 ? ctf0Var6.b.a(R.string.line_time_before_v2, Arrays.copyOf(new Object[]{String.valueOf(j6)}, 1)) : ctf0Var6.b.a(R.string.before_start, Arrays.copyOf(new Object[0], 0)), yyw.L((((j5 < 0 ? 0L : j5) / 60) / 60) % 24), yyw.L(((j5 < 0 ? 0L : j5) / 60) % 60), yyw.L((j5 >= 0 ? j5 : 0L) % 60));
                                }
                            } else {
                                qal0Var = null;
                            }
                            if (vzj0Var instanceof tzj0) {
                                tzj0 tzj0Var = (tzj0) vzj0Var;
                                b0k0Var = new yzj0(tzj0Var.f34807a, tzj0Var.b, tzj0Var.c, tzj0Var.d, qal0Var);
                            } else if (vzj0Var instanceof uzj0) {
                                uzj0 uzj0Var = (uzj0) vzj0Var;
                                b0k0Var = new b0k0(uzj0Var.f36538a, uzj0Var.b, uzj0Var.c, uzj0Var.d, qal0Var);
                            } else {
                                t9f.b();
                            }
                            return b0k0Var;
                        }
                        return null;
                    case 7:
                        boolean zBooleanValue4 = ((Boolean) obj).booleanValue();
                        long jLongValue2 = ((Number) ((fee) rjsVar.j.getValue()).c()).longValue();
                        boolean zBooleanValue5 = ((Boolean) ((fee) rjsVar.i.getValue()).c()).booleanValue();
                        long jLongValue3 = ((Number) ((fee) rjsVar.k.getValue()).c()).longValue();
                        long jLongValue4 = ((Number) ((fee) rjsVar.m.getValue()).c()).longValue();
                        Long l = (Long) ((fee) rjsVar.l.getValue()).c();
                        long jLongValue5 = l != null ? l.longValue() : -1L;
                        if (zBooleanValue4) {
                            return new sym0(new MarketsCategoriesParams(jLongValue2, jLongValue3, jLongValue4, new zq2(), "", zBooleanValue5));
                        }
                        tef0 tef0Var = tef0.f33818a;
                        xuz xuzVar = pb10.c;
                        return new vym0(new RelatedParams(zBooleanValue5, jLongValue2, jLongValue4, -1L, jLongValue5, tef0Var));
                    case 8:
                        return a(obj);
                    case 9:
                        fsr fsrVar = (fsr) obj;
                        if ((fsrVar == null || !fsrVar.b) && (fsrVar == null || !fsrVar.c)) {
                            return k49.f17656a;
                        }
                        o49 o49Var = (o49) ((fee) rjsVar.y.getValue()).c();
                        ctf0 ctf0Var7 = rjsVar.f30611a;
                        zvh0 zvh0Var2 = rjsVar.b;
                        fsrVar.getClass();
                        ctf0Var7.getClass();
                        ArrayList arrayList6 = new ArrayList();
                        if (fsrVar.b) {
                            arrayList6.add(new g49(ctf0Var7.b.a(R.string.video, Arrays.copyOf(new Object[0], 0))));
                        }
                        if (fsrVar.c) {
                            arrayList6.add(new h49(ctf0Var7.b.a(R.string.play_zone, Arrays.copyOf(new Object[0], 0))));
                        }
                        if (o49Var == null) {
                            g49Var = (i49) CollectionsKt.U(arrayList6);
                        } else {
                            int iOrdinal = o49Var.ordinal();
                            if (iOrdinal == 0) {
                                g49Var = new g49(ctf0Var7.b.a(R.string.video, Arrays.copyOf(new Object[0], 0)));
                            } else {
                                if (iOrdinal != 1) {
                                    t9f.b();
                                    return null;
                                }
                                g49Var = new h49(ctf0Var7.b.a(R.string.play_zone, Arrays.copyOf(new Object[0], 0)));
                            }
                            if (arrayList6.isEmpty()) {
                                g49Var = null;
                            } else {
                                Iterator it5 = arrayList6.iterator();
                                do {
                                    if (!it5.hasNext()) {
                                        g49Var = null;
                                    }
                                } while (!Intrinsics.d((i49) it5.next(), g49Var));
                            }
                            if (g49Var == null) {
                                g49Var = (i49) CollectionsKt.U(arrayList6);
                            }
                        }
                        bfu0 bfu0Var = fsrVar.f10077a;
                        GameBroadcastingParams gameBroadcastingParams = new GameBroadcastingParams(bfu0Var.f2522a, bfu0Var.c, bfu0Var.f, bfu0Var.b, bfu0Var.e, bfu0Var.d, bfu0Var.g, null);
                        Iterator it6 = arrayList6.iterator();
                        int i6 = 0;
                        while (true) {
                            if (!it6.hasNext()) {
                                i6 = -1;
                            } else if (!Intrinsics.d((i49) it6.next(), g49Var)) {
                                i6++;
                            }
                        }
                        int i7 = i6;
                        i4 i4VarR1 = dyb.r0(arrayList6);
                        boolean z5 = arrayList6.size() > 1;
                        int iOrdinal2 = zvh0Var2.ordinal();
                        if (iOrdinal2 == 0) {
                            dxh0Var = axh0.f1625a;
                        } else if (iOrdinal2 == 1) {
                            dxh0Var = zwh0.f45106a;
                        } else if (iOrdinal2 == 2) {
                            dxh0Var = cxh0.f5122a;
                        } else {
                            if (iOrdinal2 != 3) {
                                t9f.b();
                                return null;
                            }
                            dxh0Var = bxh0.f3376a;
                        }
                        dxh0 dxh0Var2 = dxh0Var;
                        ArrayList arrayList7 = new ArrayList(r3d.q(arrayList6, 10));
                        Iterator it7 = arrayList6.iterator();
                        while (it7.hasNext()) {
                            arrayList7.add(new yvh0(((i49) it7.next()).getDescription(), bwh0.f3325a));
                        }
                        return new j49(gameBroadcastingParams, i7, g49Var, i4VarR1, z5, dxh0Var2, dyb.r0(arrayList7));
                    case 10:
                        return b(obj);
                    default:
                        gna gnaVar5 = (gna) obj;
                        if ((gnaVar5 instanceof ena ? (ena) gnaVar5 : null) == null || (hnaVar = ((ena) gnaVar5).j) == null) {
                            return null;
                        }
                        boolean zContains4 = ((List) ((fee) rjsVar.o.getValue()).c()).contains(ch00.SHORT_STATISTIC);
                        ctf0 ctf0Var8 = rjsVar.f30611a;
                        ctf0Var8.getClass();
                        List<vrj0> list11 = hnaVar.f;
                        ArrayList arrayList8 = new ArrayList(r3d.q(list11, 10));
                        for (vrj0 vrj0Var : list11) {
                            float fS = r7x.s(vrj0Var.b);
                            float fS2 = r7x.s(vrj0Var.c);
                            String str24 = vrj0Var.f37902a;
                            String str25 = vrj0Var.b;
                            String str26 = vrj0Var.c;
                            if (fS == 0.0f && fS2 == 0.0f) {
                                fS = 0.0f;
                            }
                            arrayList8.add(new srj0(fS, (fS == 0.0f && fS2 == 0.0f) ? 0.0f : fS2, str24, str25, str26));
                        }
                        dja djaVar4 = dja.PENALTY;
                        ch00 ch00Var4 = ch00.SHORT_STATISTIC;
                        i4 i4VarR2 = zContains4 ? dyb.r0(arrayList8) : dyb.r0(CollectionsKt.D0(arrayList8, 3));
                        if (arrayList8.size() - 1 > 3) {
                            lsm0 lsm0Var = ctf0Var8.b;
                            lmoVar = new lmo(lsm0Var.a(R.string.expand, Arrays.copyOf(new Object[0], 0)), lsm0Var.a(R.string.collapse, Arrays.copyOf(new Object[0], 0)), zContains4);
                        } else {
                            lmoVar = null;
                        }
                        return new hax(i4VarR2, lmoVar);
                }
            }
        });
        final byte b6 = 11;
        this.E = bkb.G(a().d, new Function1(this) { // from class: a.qjs
            public final /* synthetic */ rjs b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:260:0x08d4  */
            /* JADX WARN: Code duplicated, block: B:262:0x08e4  */
            /* JADX WARN: Code duplicated, block: B:265:0x090f  */
            /* JADX WARN: Code duplicated, block: B:268:0x0932  */
            /* JADX WARN: Code duplicated, block: B:270:0x0936  */
            /* JADX WARN: Code duplicated, block: B:272:0x094e  */
            private final Object a(Object obj) {
                n0o0 n0o0Var;
                n0o0 n0o0Var2;
                String str;
                String str2;
                mqr kqrVar;
                String strG;
                d3h0 pekVar;
                String strN;
                d3h0 xakVar;
                Integer num;
                String strN2;
                int i;
                iul0 iul0Var;
                yd90 yd90Var;
                yd90 yd90Var2;
                iul0 iul0Var2;
                String str3;
                String str4;
                d3h0 bekVar;
                String strA;
                String strB;
                String strN3;
                rjs rjsVar = this.b;
                n0o0 n0o0Var3 = rjsVar.v;
                n0o0 n0o0Var4 = rjsVar.m;
                n0o0 n0o0Var5 = rjsVar.H;
                n0o0 n0o0Var6 = rjsVar.I;
                ctf0 ctf0Var2 = rjsVar.f30611a;
                gna gnaVar = (gna) obj;
                if (gnaVar != null) {
                    if (!(gnaVar instanceof ena)) {
                        if (gnaVar instanceof fna) {
                            ctf0Var2.getClass();
                            return new orr(d9x.L(((fna) gnaVar).f9825a, ctf0Var2));
                        }
                        t9f.b();
                        return null;
                    }
                    ena enaVar = (ena) gnaVar;
                    mca mcaVar = enaVar.f8084a;
                    List list = (List) ((fee) rjsVar.n.getValue()).c();
                    boolean zBooleanValue = ((Boolean) ((fee) rjsVar.e.getValue()).c()).booleanValue();
                    mpm mpmVar = (mpm) ((fee) n0o0Var6.getValue()).b();
                    boolean z = enaVar.p;
                    String str5 = (String) ((fee) rjsVar.p.getValue()).c();
                    String str6 = (String) ((fee) rjsVar.q.getValue()).c();
                    String str7 = (String) ((fee) rjsVar.r.getValue()).c();
                    String str8 = (String) ((fee) rjsVar.s.getValue()).c();
                    jg30 jg30Var = (jg30) ((fee) n0o0Var5.getValue()).b();
                    bg30 bg30Var = (bg30) ((fee) n0o0Var6.getValue()).c();
                    znq0 znq0Var = (znq0) ((fee) rjsVar.t.getValue()).c();
                    bha bhaVar = enaVar.o;
                    ui9 ui9Var = (ui9) ((fee) rjsVar.u.getValue()).c();
                    long jLongValue = ((Number) ((fee) n0o0Var4.getValue()).c()).longValue();
                    boolean zBooleanValue2 = ((Boolean) ((fee) n0o0Var3.getValue()).c()).booleanValue();
                    ctf0Var2.getClass();
                    if (ui9Var != null) {
                        int i2 = ui9Var.c;
                        int i3 = ui9Var.d;
                        n0o0Var = n0o0Var4;
                        String strN4 = (cy7.c() && zBooleanValue2) ? w6x.n(i3, i2, " : ") : w6x.n(i2, i3, " : ");
                        String strX = j0x.x(jLongValue, ctf0Var2);
                        ArrayList arrayList = ui9Var.f35720a;
                        n0o0Var2 = n0o0Var5;
                        str = str5;
                        str2 = str6;
                        ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
                        int i4 = 0;
                        for (Object obj2 : arrayList) {
                            int i5 = i4 + 1;
                            if (i4 < 0) {
                                q3d.p();
                                throw null;
                            }
                            arrayList2.add(piz.W((sc90) obj2, jLongValue, i4));
                            i4 = i5;
                        }
                        i4 i4VarR0 = dyb.r0(arrayList2);
                        ArrayList arrayList3 = ui9Var.b;
                        ArrayList arrayList4 = new ArrayList(r3d.q(arrayList3, 10));
                        int i6 = 0;
                        for (Object obj3 : arrayList3) {
                            int i7 = i6 + 1;
                            if (i6 < 0) {
                                q3d.p();
                                throw null;
                            }
                            arrayList4.add(piz.W((sc90) obj3, jLongValue, i6));
                            i6 = i7;
                        }
                        kqrVar = new iqr(strN4, strX, i4VarR0, dyb.r0(arrayList4));
                    } else {
                        n0o0Var = n0o0Var4;
                        n0o0Var2 = n0o0Var5;
                        str = str5;
                        str2 = str6;
                        if (bhaVar != null) {
                            float f = bhaVar.d;
                            float f2 = bhaVar.e;
                            float f3 = bhaVar.f;
                            Object[] objArr = {Float.valueOf(f3)};
                            lsm0 lsm0Var = ctf0Var2.b;
                            String strA2 = lsm0Var.a(R.string.n_percents, Arrays.copyOf(objArr, 1));
                            k3w0 g3w0Var = (f3 <= f2 || f3 <= f) ? new g3w0(strA2) : new i3w0(strA2);
                            String strA3 = lsm0Var.a(R.string.n_percents, Arrays.copyOf(new Object[]{Float.valueOf(f2)}, 1));
                            k3w0 g3w0Var2 = (f2 <= f3 || f2 <= f) ? new g3w0(strA3) : new i3w0(strA3);
                            String strA4 = lsm0Var.a(R.string.n_percents, Arrays.copyOf(new Object[]{Float.valueOf(f)}, 1));
                            kqrVar = new kqr(g3w0Var, g3w0Var2, (f <= f3 || f <= f2) ? new g3w0(strA4) : new i3w0(strA4));
                        } else {
                            kqrVar = null;
                        }
                    }
                    anq0 anq0Var2 = (anq0) ((fee) n0o0Var2.getValue()).c();
                    boolean z2 = anq0Var2 != null ? anq0Var2.f1167a : false;
                    long jLongValue2 = ((Number) ((fee) n0o0Var.getValue()).c()).longValue();
                    boolean zBooleanValue3 = ((Boolean) ((fee) n0o0Var3.getValue()).c()).booleanValue();
                    list.getClass();
                    mpmVar.getClass();
                    String strA5 = "";
                    if (mcaVar instanceof pca) {
                        pca pcaVar = (pca) mcaVar;
                        uqr uqrVarR0 = pzb.r0(mcaVar, str, str2, str7, str8, jg30Var);
                        if (bg30Var == null || (bekVar = bg30Var.b) == null) {
                            bekVar = bg30Var != null ? bg30Var.f2536a : new bek();
                        }
                        d3h0 d3h0Var = bekVar;
                        boolean z3 = d3h0Var instanceof lz10;
                        lz10 lz10Var = z3 ? (lz10) d3h0Var : null;
                        if (lz10Var != null) {
                            strA = vzb.T(lz10Var, zBooleanValue3);
                        } else {
                            hzm0 hzm0Var = d3h0Var instanceof hzm0 ? (hzm0) d3h0Var : null;
                            if (hzm0Var != null) {
                                String str9 = hzm0Var.g;
                                String str10 = hzm0Var.i;
                                StringBuilder sb = new StringBuilder("\u2066");
                                if (cy7.c() && zBooleanValue3) {
                                    if (str10 != null) {
                                        hne.B(sb, "(ov ", str10, Separators.RPAREN);
                                    }
                                    sb.append(vzb.i0(str9));
                                } else {
                                    sb.append(str9);
                                    if (str10 != null) {
                                        hne.B(sb, Separators.LPAREN, str10, " ov)");
                                    }
                                }
                                sb.append("\u2069");
                                strA = sb.toString();
                            } else {
                                strA = d3h0Var.a();
                            }
                        }
                        String str11 = strA;
                        lz10 lz10Var2 = z3 ? (lz10) d3h0Var : null;
                        if (lz10Var2 != null) {
                            strB = vzb.U(lz10Var2, zBooleanValue3);
                        } else {
                            hzm0 hzm0Var2 = d3h0Var instanceof hzm0 ? (hzm0) d3h0Var : null;
                            if (hzm0Var2 != null) {
                                String str12 = hzm0Var2.h;
                                String str13 = hzm0Var2.j;
                                StringBuilder sb2 = new StringBuilder("\u2066");
                                if (cy7.c() && zBooleanValue3) {
                                    if (str13 != null) {
                                        hne.B(sb2, "(ov ", str13, Separators.RPAREN);
                                    }
                                    sb2.append(vzb.i0(str12));
                                } else {
                                    sb2.append(str12);
                                    if (str13 != null) {
                                        hne.B(sb2, Separators.LPAREN, str13, " ov)");
                                    }
                                }
                                sb2.append("\u2069");
                                strB = sb2.toString();
                            } else {
                                strB = d3h0Var.b();
                            }
                        }
                        String str14 = strB;
                        boolean z4 = pcaVar.d;
                        rpp0 rpp0Var = pcaVar.f26749a;
                        j83 j83VarH = vzb.H(ctf0Var2, d3h0Var, pcaVar.e, pcaVar.f, pcaVar.g, (bg30Var == null || (strN3 = bg30Var.f2536a.n()) == null) ? "" : strN3, z4, zBooleanValue3);
                        String strB2 = rpp0Var.b();
                        c280 c280Var = new c280(vsm0.s(rpp0Var.a(), pcaVar.b), R.drawable.ic_glyph_placeholder_player);
                        long jA = rpp0Var.a();
                        bap bapVar = bap.b;
                        jdp0 jdp0Var = new jdp0(strB2, n6x.o0(c280Var, jA, list, zBooleanValue, bapVar), null);
                        jdp0 jdp0Var2 = new jdp0(rpp0Var.d(), n6x.o0(new c280(vsm0.s(rpp0Var.c(), pcaVar.c), R.drawable.ic_glyph_placeholder_player), rpp0Var.c(), list, zBooleanValue, bapVar), null);
                        lz10 lz10Var3 = z3 ? (lz10) d3h0Var : null;
                        return new mrr(uqrVarR0, jdp0Var, jdp0Var2, j83VarH, lz10Var3 != null ? vzb.G(lz10Var3.i) : eex.c, str11, d3h0Var.j(), str14, d3h0Var.i());
                    }
                    boolean z5 = z2;
                    String str15 = str;
                    String str16 = str2;
                    boolean z6 = mcaVar instanceof tca;
                    qpm qpmVar = qpm.f29126a;
                    if (z6) {
                        tca tcaVar = (tca) mcaVar;
                        uqr uqrVarR1 = pzb.r0(mcaVar, str15, str16, str7, str8, jg30Var);
                        znq0 znq0Var2 = new znq0(znq0Var != null ? znq0Var.f44687a : 0L);
                        rpp0 rpp0Var2 = tcaVar.f33711a;
                        boolean z7 = tcaVar.i;
                        if (rpp0Var2 instanceof qpp0) {
                            qpp0 qpp0Var = (qpp0) rpp0Var2;
                            jdp0 jdp0Var3 = new jdp0(qpp0Var.g, n6x.o0(u1c.C(tcaVar, true), qpp0Var.e, list, zBooleanValue || z7, bap.b), null);
                            jdp0 jdp0Var4 = new jdp0(qpp0Var.h, n6x.o0(u1c.C(tcaVar, false), qpp0Var.f, list, zBooleanValue || z7, bap.f2271a), null);
                            lpm lpmVar = new lpm(qpmVar, new hpm(0L, 3));
                            dpi0 dpi0Var = new dpi0((byte) 15);
                            rdj rdjVar = rdj.f30294a;
                            vzb.E(dpi0Var, rdj.g(znq0Var2, efj.UNIVERSAL, Boolean.valueOf(z), false, 56));
                            return new trr(uqrVarR1, jdp0Var3, jdp0Var4, lpmVar, ((h83) dpi0Var.f6468a).h(), kqrVar);
                        }
                        if (!(rpp0Var2 instanceof ppp0)) {
                            t9f.b();
                            return null;
                        }
                        ppp0 ppp0Var = (ppp0) rpp0Var2;
                        xcp0 xcp0VarC0 = b8k0.c0(ppp0Var.e, ppp0Var.g, tcaVar.b);
                        xcp0 xcp0VarC1 = b8k0.c0(ppp0Var.f, ppp0Var.h, tcaVar.c);
                        lpm lpmVar2 = new lpm(qpmVar, new hpm(0L, 3));
                        dpi0 dpi0Var2 = new dpi0((byte) 15);
                        rdj rdjVar2 = rdj.f30294a;
                        vzb.E(dpi0Var2, rdj.g(znq0Var2, efj.UNIVERSAL, Boolean.valueOf(z), false, 56));
                        return new trr(uqrVarR1, xcp0VarC0, xcp0VarC1, lpmVar2, ((h83) dpi0Var2.f6468a).h(), kqrVar);
                    }
                    if (!(mcaVar instanceof xca)) {
                        if (mcaVar instanceof gda) {
                            gda gdaVar = (gda) mcaVar;
                            uqr uqrVarR2 = pzb.r0(mcaVar, str15, str16, str7, str8, jg30Var);
                            znq0 znq0Var3 = new znq0(znq0Var != null ? znq0Var.f44687a : 0L);
                            String strB0 = CollectionsKt.b0(gdaVar.f11094a, Separators.SLASH, null, null, null, 62);
                            String strB1 = CollectionsKt.b0(gdaVar.b, Separators.SLASH, null, null, null, 62);
                            lpm lpmVar3 = new lpm(qpmVar, new hpm(0L, 3));
                            dpi0 dpi0Var3 = new dpi0((byte) 15);
                            rdj rdjVar3 = rdj.f30294a;
                            vzb.E(dpi0Var3, rdj.g(znq0Var3, efj.UNIVERSAL, Boolean.valueOf(z), false, 56));
                            return new rrr(uqrVarR2, strB0, strB1, lpmVar3, ((h83) dpi0Var3.f6468a).h());
                        }
                        if (mcaVar instanceof hda) {
                            hda hdaVar = (hda) mcaVar;
                            uqr uqrVarR3 = pzb.r0(mcaVar, str15, str16, str7, str8, jg30Var);
                            if (bg30Var == null || (pekVar = bg30Var.b) == null) {
                                pekVar = bg30Var != null ? bg30Var.f2536a : new pek();
                            }
                            return new rrr(uqrVarR3, CollectionsKt.b0(hdaVar.f12861a, Separators.SLASH, null, null, null, 62), CollectionsKt.b0(hdaVar.b, Separators.SLASH, null, null, null, 62), mpmVar, vzb.H(ctf0Var2, pekVar, hdaVar.h, hdaVar.i, hdaVar.j, (bg30Var == null || (strN = bg30Var.f2536a.n()) == null) ? "" : strN, hdaVar.g, zBooleanValue3));
                        }
                        if (!(mcaVar instanceof ida)) {
                            t9f.b();
                            return null;
                        }
                        ida idaVar = (ida) mcaVar;
                        uqr uqrVarR4 = pzb.r0(mcaVar, str15, str16, str7, str8, jg30Var);
                        if (!idaVar.g) {
                            if (znq0Var != null) {
                                rdj rdjVar4 = rdj.f30294a;
                                strG = rdj.g(znq0Var, efj.UNIVERSAL, Boolean.valueOf(z), false, 56);
                                if (strG == null) {
                                }
                            }
                            dpi0 dpi0Var9 = new dpi0((byte) 15);
                            vzb.E(dpi0Var9, strG);
                            return new vrr(uqrVarR4, idaVar.e, ((h83) dpi0Var9.f6468a).h());
                        }
                        strA5 = ctf0Var2.b.a(R.string.game_end, Arrays.copyOf(new Object[0], 0));
                        strG = strA5;
                        dpi0 dpi0Var10 = new dpi0((byte) 15);
                        vzb.E(dpi0Var10, strG);
                        return new vrr(uqrVarR4, idaVar.e, ((h83) dpi0Var10.f6468a).h());
                    }
                    if (!gql0.d().contains(Long.valueOf(jLongValue2))) {
                        xca xcaVar = (xca) mcaVar;
                        uqr uqrVarR5 = pzb.r0(mcaVar, str15, str16, str7, str8, jg30Var);
                        if (bg30Var == null || (xakVar = bg30Var.b) == null) {
                            xakVar = bg30Var != null ? bg30Var.f2536a : new xak((byte) 22);
                        }
                        boolean z8 = xcaVar.l;
                        boolean z9 = xcaVar.q;
                        rpp0 rpp0Var3 = xcaVar.f40636a;
                        j83 j83VarH2 = vzb.H(ctf0Var2, xakVar, xcaVar.n, xcaVar.o, xcaVar.p, (bg30Var == null || (strN2 = bg30Var.f2536a.n()) == null) ? "" : strN2, z8, zBooleanValue3);
                        if (!(rpp0Var3 instanceof qpp0)) {
                            if (rpp0Var3 instanceof ppp0) {
                                ppp0 ppp0Var2 = (ppp0) rpp0Var3;
                                return new trr(uqrVarR5, b8k0.c0(ppp0Var2.e, ppp0Var2.g, xcaVar.h), b8k0.c0(ppp0Var2.f, ppp0Var2.h, xcaVar.i), mpmVar, j83VarH2, kqrVar);
                            }
                            t9f.b();
                            return null;
                        }
                        int i8 = xcaVar.b;
                        int i9 = xcaVar.g;
                        int i10 = xcaVar.f;
                        int i11 = xcaVar.d;
                        int i12 = xcaVar.c;
                        vy vyVar = (i8 == 0 && i12 == 0 && i11 == 0) ? null : new vy(i8 > 0 ? Integer.valueOf(i8) : null, i12 > 0 ? Integer.valueOf(i12) : null, i11 > 0 ? Integer.valueOf(i11) : null);
                        int i13 = xcaVar.e;
                        vy vyVar2 = (i13 == 0 && i10 == 0 && i9 == 0) ? null : new vy(i13 > 0 ? Integer.valueOf(i13) : null, i10 > 0 ? Integer.valueOf(i10) : null, i9 > 0 ? Integer.valueOf(i9) : null);
                        boolean z10 = (vyVar == null && vyVar2 == null) ? false : true;
                        if (z10 && vyVar == null) {
                            num = null;
                            vyVar = new vy(null, null, null);
                        } else {
                            num = null;
                        }
                        if (z10 && vyVar2 == null) {
                            vyVar2 = new vy(num, num, num);
                        }
                        qpp0 qpp0Var2 = (qpp0) rpp0Var3;
                        return new trr(uqrVarR5, new jdp0(qpp0Var2.g, n6x.o0(u1c.D(xcaVar, true), qpp0Var2.e, list, zBooleanValue || z9, bap.b), vyVar), new jdp0(qpp0Var2.h, n6x.o0(u1c.D(xcaVar, false), qpp0Var2.f, list, zBooleanValue || z9, bap.f2271a), vyVar2), mpmVar, j83VarH2, kqrVar);
                    }
                    xca xcaVar2 = (xca) mcaVar;
                    long j = znq0Var != null ? znq0Var.f44687a : 0L;
                    uqr uqrVarR6 = pzb.r0(mcaVar, str15, str16, str7, str8, jg30Var);
                    znq0 znq0Var4 = new znq0(j);
                    pz10 pz10Var = bg30Var != null ? bg30Var.f2536a : null;
                    if (pz10Var instanceof nz10) {
                        izm0 izm0Var = bg30Var.b;
                        String str17 = xcaVar2.s;
                        List list2 = xcaVar2.i;
                        List list3 = xcaVar2.h;
                        rpp0 rpp0Var4 = xcaVar2.f40636a;
                        boolean z11 = xcaVar2.l;
                        String str18 = xcaVar2.p;
                        rdj rdjVar5 = rdj.f30294a;
                        pz10 pz10Var2 = pz10Var;
                        String strG2 = rdj.g(znq0Var4, efj.UNIVERSAL, Boolean.valueOf(z), false, 56);
                        str18.getClass();
                        strG2.getClass();
                        dpi0 dpi0Var11 = new dpi0((byte) 15);
                        if (str17 != null) {
                            vzb.E(dpi0Var11, str17);
                            vzb.E(dpi0Var11, ": ");
                            boolean z12 = cy7.c() && zBooleanValue3;
                            if (izm0Var == null) {
                                vzb.E(dpi0Var11, "0");
                                vzb.C(dpi0Var11);
                                vzb.E(dpi0Var11, "0");
                            } else {
                                if (!(izm0Var instanceof gzm0) && !(izm0Var instanceof hzm0)) {
                                    t9f.b();
                                    return null;
                                }
                                boolean z13 = izm0Var instanceof hzm0;
                                String strA6 = z13 ? ((hzm0) izm0Var).g : izm0Var.a();
                                String strB3 = z13 ? ((hzm0) izm0Var).h : izm0Var.b();
                                vzb.E(dpi0Var11, "\u2066");
                                if (z12) {
                                    vzb.D(dpi0Var11, strB3, vzb.L(izm0Var.i()));
                                    vzb.C(dpi0Var11);
                                    vzb.D(dpi0Var11, strA6, vzb.L(izm0Var.j()));
                                } else {
                                    vzb.D(dpi0Var11, strA6, vzb.L(izm0Var.j()));
                                    vzb.C(dpi0Var11);
                                    vzb.D(dpi0Var11, strB3, vzb.L(izm0Var.i()));
                                }
                                vzb.E(dpi0Var11, "\u2069");
                            }
                        } else {
                            vzb.E(dpi0Var11, strG2);
                            if (str18.length() > 0) {
                                vzb.A(dpi0Var11);
                                vzb.E(dpi0Var11, str18);
                            }
                            if (z11) {
                                vzb.A(dpi0Var11);
                                i = 0;
                                vzb.E(dpi0Var11, ctf0Var2.b.a(R.string.game_end, Arrays.copyOf(new Object[0], 0)));
                            } else {
                                i = 0;
                            }
                            if (z5) {
                                vzb.A(dpi0Var11);
                                vzb.E(dpi0Var11, ctf0Var2.b.a(R.string.card_cricket_break, Arrays.copyOf(new Object[i], i)));
                            }
                        }
                        j83 j83VarH3 = ((h83) dpi0Var11.f6468a).h();
                        nz10 nz10Var = (nz10) pz10Var2;
                        boolean z14 = nz10Var instanceof mz10;
                        k5q0 k5q0Var = k5q0.b;
                        if (!z14) {
                            if (nz10Var instanceof oz10) {
                                oz10 oz10Var = (oz10) nz10Var;
                                String str19 = oz10Var.i;
                                String str20 = oz10Var.g;
                                String str21 = oz10Var.m;
                                String str22 = oz10Var.k;
                                boolean z15 = ((StringsKt.W(str22) || str22.equals("0")) && (StringsKt.W(str21) || str21.equals("0"))) ? false : true;
                                boolean z16 = str20.length() > 0 || str19.length() > 0;
                                eex eexVarG = vzb.G(oz10Var.o);
                                ArrayList arrayList5 = oz10Var.f;
                                ArrayList arrayList6 = new ArrayList(r3d.q(arrayList5, 10));
                                Iterator it = arrayList5.iterator();
                                while (it.hasNext()) {
                                    te90 te90Var = (te90) it.next();
                                    arrayList6.add(new yd90(vzb.O(te90Var), vzb.Q(te90Var), te90Var.f33809a));
                                    it = it;
                                    z15 = z15;
                                }
                                boolean z17 = z15;
                                i4 i4VarR1 = dyb.r0(arrayList6);
                                j83 j83VarN = vzb.N(nz10Var);
                                j83 j83VarP = vzb.P(nz10Var);
                                lsm0 lsm0Var2 = ctf0Var2.b;
                                yd90 yd90Var3 = new yd90(j83VarN, j83VarP, lsm0Var2.a(R.string.total_count, Arrays.copyOf(new Object[0], 0)));
                                if (z17) {
                                    h83 h83Var = new h83();
                                    long j2 = y3d.g;
                                    long j3 = daq0.c;
                                    smk0 smk0Var = new smk0(vzb.L(oz10Var.l), j3, null, null, null, null, null, j3, new j56(0.0f), null, null, j2, k5q0Var, null, null, 17424);
                                    h83Var.c(str22);
                                    j83 j83VarC = kng0.c(h83Var.f12607a, h83Var, smk0Var, 0);
                                    h83 h83Var2 = new h83();
                                    smk0 smk0Var2 = new smk0(vzb.L(oz10Var.n), j3, null, null, null, null, null, j3, new j56(0.0f), null, null, j2, k5q0Var, null, null, 17424);
                                    h83Var2.c(str21);
                                    yd90Var = new yd90(j83VarC, kng0.c(h83Var2.f12607a, h83Var2, smk0Var2, 0), lsm0Var2.a(R.string.dt_points, Arrays.copyOf(new Object[0], 0)));
                                } else {
                                    yd90Var = null;
                                }
                                if (z16) {
                                    h83 h83Var3 = new h83();
                                    long j4 = y3d.g;
                                    long j5 = daq0.c;
                                    smk0 smk0Var3 = new smk0(vzb.L(oz10Var.h), j5, null, null, null, null, null, j5, new j56(0.0f), null, null, j4, k5q0Var, null, null, 17424);
                                    h83Var3.c(str20);
                                    j83 j83VarC2 = kng0.c(h83Var3.f12607a, h83Var3, smk0Var3, 0);
                                    h83 h83Var4 = new h83();
                                    smk0 smk0Var4 = new smk0(vzb.L(oz10Var.j), j5, null, null, null, null, null, j5, new j56(0.0f), null, null, j4, k5q0Var, null, null, 17424);
                                    h83Var4.c(str19);
                                    yd90Var2 = new yd90(j83VarC2, kng0.c(h83Var4.f12607a, h83Var4, smk0Var4, 0), lsm0Var2.a(R.string.tennis_game_column, Arrays.copyOf(new Object[0], 0)));
                                } else {
                                    yd90Var2 = null;
                                }
                                iul0Var2 = new iul0(eexVarG, i4VarR1, yd90Var3, yd90Var2, yd90Var);
                            } else {
                                if (!(nz10Var instanceof kz10)) {
                                    t9f.b();
                                    return null;
                                }
                                kz10 kz10Var = (kz10) nz10Var;
                                eex eexVarG2 = vzb.G(kz10Var.g);
                                ArrayList<te90> arrayList7 = kz10Var.f;
                                ArrayList arrayList8 = new ArrayList(r3d.q(arrayList7, 10));
                                for (te90 te90Var2 : arrayList7) {
                                    arrayList8.add(new yd90(vzb.O(te90Var2), vzb.Q(te90Var2), te90Var2.f33809a));
                                }
                                iul0Var = new iul0(eexVarG2, dyb.r0(arrayList8), new yd90(vzb.N(nz10Var), vzb.P(nz10Var), ctf0Var2.b.a(R.string.total_count, Arrays.copyOf(new Object[0], 0))), null, null);
                            }
                            if (rpp0Var4 instanceof qpp0) {
                                if (rpp0Var4 instanceof ppp0) {
                                    ppp0 ppp0Var8 = (ppp0) rpp0Var4;
                                    return new xrr(uqrVarR6, b8k0.c0(ppp0Var8.e, ppp0Var8.g, list3), b8k0.c0(ppp0Var8.f, ppp0Var8.h, list2), j83VarH3, iul0Var2);
                                }
                                t9f.b();
                                return null;
                            }
                            qpp0 qpp0Var8 = (qpp0) rpp0Var4;
                            String str215 = qpp0Var8.g;
                            str3 = (String) CollectionsKt.firstOrNull(list3);
                            if (str3 == null) {
                                str3 = "";
                            }
                            c280 c280Var7 = new c280(vsm0.s(qpp0Var8.e, str3), R.drawable.ic_glyph_placeholder_player);
                            long j13 = qpp0Var8.e;
                            bap bapVar7 = bap.b;
                            jdp0 jdp0Var10 = new jdp0(str215, n6x.o0(c280Var7, j13, list, zBooleanValue, bapVar7), null);
                            String str216 = qpp0Var8.h;
                            str4 = (String) CollectionsKt.firstOrNull(list2);
                            if (str4 == null) {
                                str4 = "";
                            }
                            return new xrr(uqrVarR6, jdp0Var10, new jdp0(str216, n6x.o0(new c280(vsm0.s(qpp0Var8.f, str4), R.drawable.ic_glyph_placeholder_player), qpp0Var8.f, list, zBooleanValue, bapVar7), null), j83VarH3, iul0Var2);
                        }
                        mz10 mz10Var = (mz10) nz10Var;
                        eex eexVarG3 = vzb.G(mz10Var.g);
                        ArrayList<te90> arrayList9 = mz10Var.f;
                        ArrayList arrayList10 = new ArrayList(r3d.q(arrayList9, 10));
                        for (te90 te90Var3 : arrayList9) {
                            arrayList10.add(new yd90(vzb.O(te90Var3), vzb.Q(te90Var3), te90Var3.f33809a));
                        }
                        i4 i4VarR2 = dyb.r0(arrayList10);
                        j83 j83VarN2 = vzb.N(nz10Var);
                        j83 j83VarP2 = vzb.P(nz10Var);
                        lsm0 lsm0Var3 = ctf0Var2.b;
                        yd90 yd90Var4 = new yd90(j83VarN2, j83VarP2, lsm0Var3.a(R.string.total_count, Arrays.copyOf(new Object[0], 0)));
                        h83 h83Var5 = new h83();
                        String str25 = mz10Var.h;
                        long j7 = y3d.g;
                        long j8 = daq0.c;
                        smk0 smk0Var5 = new smk0(vzb.L(mz10Var.i), j8, null, null, null, null, null, j8, new j56(0.0f), null, null, j7, k5q0Var, null, null, 17424);
                        h83Var5.c(str25);
                        j83 j83VarC3 = kng0.c(h83Var5.f12607a, h83Var5, smk0Var5, 0);
                        h83 h83Var6 = new h83();
                        String str26 = mz10Var.j;
                        smk0 smk0Var6 = new smk0(vzb.L(mz10Var.k), j8, null, null, null, null, null, j8, new j56(0.0f), null, null, j7, k5q0Var, null, null, 17424);
                        h83Var6.c(str26);
                        iul0Var = new iul0(eexVarG3, i4VarR2, yd90Var4, null, new yd90(j83VarC3, kng0.c(h83Var6.f12607a, h83Var6, smk0Var6, 0), lsm0Var3.a(R.string.dt_points, Arrays.copyOf(new Object[0], 0))));
                        iul0Var2 = iul0Var;
                        if (rpp0Var4 instanceof qpp0) {
                            if (rpp0Var4 instanceof ppp0) {
                                ppp0 ppp0Var9 = (ppp0) rpp0Var4;
                                return new xrr(uqrVarR6, b8k0.c0(ppp0Var9.e, ppp0Var9.g, list3), b8k0.c0(ppp0Var9.f, ppp0Var9.h, list2), j83VarH3, iul0Var2);
                            }
                            t9f.b();
                            return null;
                        }
                        qpp0 qpp0Var9 = (qpp0) rpp0Var4;
                        String str217 = qpp0Var9.g;
                        str3 = (String) CollectionsKt.firstOrNull(list3);
                        if (str3 == null) {
                            str3 = "";
                        }
                        c280 c280Var8 = new c280(vsm0.s(qpp0Var9.e, str3), R.drawable.ic_glyph_placeholder_player);
                        long j14 = qpp0Var9.e;
                        bap bapVar8 = bap.b;
                        jdp0 jdp0Var11 = new jdp0(str217, n6x.o0(c280Var8, j14, list, zBooleanValue, bapVar8), null);
                        String str218 = qpp0Var9.h;
                        str4 = (String) CollectionsKt.firstOrNull(list2);
                        if (str4 == null) {
                            str4 = "";
                        }
                        return new xrr(uqrVarR6, jdp0Var11, new jdp0(str218, n6x.o0(new c280(vsm0.s(qpp0Var9.f, str4), R.drawable.ic_glyph_placeholder_player), qpp0Var9.f, list, zBooleanValue, bapVar8), null), j83VarH3, iul0Var2);
                    }
                }
                return qrr.f29223a;
            }

            /* JADX WARN: Code duplicated, block: B:18:0x008a  */
            private final Object b(Object obj) {
                String strG;
                lz10 lz10Var;
                float f;
                fad dadVar;
                sad qadVar;
                j83 j83VarC;
                j83 j83VarC2;
                gna gnaVar = (gna) obj;
                if (gnaVar == null) {
                    return null;
                }
                if (!(gnaVar instanceof ena)) {
                    if (gnaVar instanceof fna) {
                        return null;
                    }
                    t9f.b();
                    return null;
                }
                ena enaVar = (ena) gnaVar;
                mca mcaVar = enaVar.f8084a;
                rjs rjsVar = this.b;
                jg30 jg30Var = (jg30) ((fee) rjsVar.H.getValue()).b();
                bg30 bg30Var = (bg30) ((fee) rjsVar.I.getValue()).c();
                pz10 pz10Var = bg30Var != null ? bg30Var.f2536a : null;
                ctf0 ctf0Var2 = rjsVar.f30611a;
                boolean z = enaVar.p;
                znq0 znq0Var = (znq0) ((fee) rjsVar.t.getValue()).c();
                boolean zBooleanValue = ((Boolean) ((fee) rjsVar.v.getValue()).c()).booleanValue();
                ctf0Var2.getClass();
                dja djaVar = dja.PENALTY;
                k5q0 k5q0Var = k5q0.b;
                if (jg30Var != null) {
                    dadVar = new ead(jg30Var);
                    f = 0.0f;
                    lz10Var = null;
                } else {
                    h83 h83Var = new h83();
                    if (znq0Var != null) {
                        rdj rdjVar = rdj.f30294a;
                        strG = rdj.g(znq0Var, efj.UNIVERSAL, Boolean.valueOf(z), false, 56);
                        if (strG == null) {
                            strG = "";
                        }
                    } else {
                        strG = "";
                    }
                    pz40 pz40Var = s6t0.f31722a;
                    long textPrimary = s6t0.b().f33626a.getTextPrimary();
                    h83 h83Var2 = new h83();
                    long j = y3d.g;
                    long j2 = daq0.c;
                    lz10Var = null;
                    f = 0.0f;
                    smk0 smk0Var = new smk0(textPrimary, j2, null, null, null, null, null, j2, new j56(0.0f), null, null, j, k5q0Var, null, null, 17424);
                    h83Var2.c(strG);
                    StringBuilder sb = h83Var2.f12607a;
                    h83Var2.a(smk0Var, 0, sb.length());
                    sb.length();
                    h83Var.b(h83Var2.h());
                    dadVar = new dad(h83Var.h());
                }
                d3h0 cl5Var = pz10Var;
                if (mcaVar instanceof pca) {
                    if (pz10Var == null) {
                        cl5Var = new cl5((byte) 28);
                    }
                    rpp0 rpp0Var = ((pca) mcaVar).f26749a;
                    String strB = rpp0Var.b();
                    String strD = rpp0Var.d();
                    boolean z2 = cl5Var instanceof lz10;
                    lz10 lz10Var2 = z2 ? (lz10) cl5Var : lz10Var;
                    String strT = lz10Var2 != null ? vzb.T(lz10Var2, zBooleanValue) : "0";
                    lz10 lz10Var3 = z2 ? (lz10) cl5Var : lz10Var;
                    qadVar = new pad(strB, strD, strT, lz10Var3 != null ? vzb.U(lz10Var3, zBooleanValue) : "0", cl5Var.j(), cl5Var.i());
                } else if (mcaVar instanceof tca) {
                    rpp0 rpp0Var2 = ((tca) mcaVar).f33711a;
                    String strB2 = rpp0Var2.b();
                    String strD2 = rpp0Var2.d();
                    h83 h83Var3 = new h83();
                    String strA = ctf0Var2.b.a(R.string.vs, Arrays.copyOf(new Object[0], 0));
                    long j3 = y3d.g;
                    long j4 = daq0.c;
                    pz40 pz40Var2 = s6t0.f31722a;
                    smk0 smk0Var2 = new smk0(s6t0.b().f33626a.getTextPrimary(), j4, null, null, null, null, null, j4, new j56(f), null, null, j3, k5q0Var, null, null, 17424);
                    h83Var3.c(strA);
                    qadVar = new rad(kng0.c(h83Var3.f12607a, h83Var3, smk0Var2, 0), strB2, strD2);
                } else if (mcaVar instanceof xca) {
                    rpp0 rpp0Var3 = ((xca) mcaVar).f40636a;
                    String strB3 = rpp0Var3.b();
                    String strD3 = rpp0Var3.d();
                    if (pz10Var != null) {
                        j83VarC2 = vzb.M(pz10Var);
                    } else {
                        h83 h83Var4 = new h83();
                        String strA2 = ctf0Var2.b.a(R.string.vs, Arrays.copyOf(new Object[0], 0));
                        long j5 = y3d.g;
                        long j6 = daq0.c;
                        pz40 pz40Var3 = s6t0.f31722a;
                        smk0 smk0Var3 = new smk0(s6t0.b().f33626a.getTextPrimary(), j6, null, null, null, null, null, j6, new j56(f), null, null, j5, k5q0Var, null, null, 17424);
                        h83Var4.c(strA2);
                        j83VarC2 = kng0.c(h83Var4.f12607a, h83Var4, smk0Var3, 0);
                    }
                    qadVar = new rad(j83VarC2, strB3, strD3);
                } else if (mcaVar instanceof gda) {
                    gda gdaVar = (gda) mcaVar;
                    String strB0 = CollectionsKt.b0(gdaVar.f11094a, Separators.SLASH, null, null, null, 62);
                    String strB1 = CollectionsKt.b0(gdaVar.b, Separators.SLASH, null, null, null, 62);
                    h83 h83Var5 = new h83();
                    String strA3 = ctf0Var2.b.a(R.string.vs, Arrays.copyOf(new Object[0], 0));
                    long j7 = y3d.g;
                    long j8 = daq0.c;
                    pz40 pz40Var4 = s6t0.f31722a;
                    smk0 smk0Var4 = new smk0(s6t0.b().f33626a.getTextPrimary(), j8, null, null, null, null, null, j8, new j56(f), null, null, j7, k5q0Var, null, null, 17424);
                    h83Var5.c(strA3);
                    qadVar = new rad(kng0.c(h83Var5.f12607a, h83Var5, smk0Var4, 0), strB0, strB1);
                } else if (mcaVar instanceof hda) {
                    hda hdaVar = (hda) mcaVar;
                    String strB4 = CollectionsKt.b0(hdaVar.f12861a, Separators.SLASH, null, null, null, 62);
                    String strB5 = CollectionsKt.b0(hdaVar.b, Separators.SLASH, null, null, null, 62);
                    if (pz10Var != null) {
                        j83VarC = vzb.M(pz10Var);
                    } else {
                        h83 h83Var6 = new h83();
                        String strA4 = ctf0Var2.b.a(R.string.vs, Arrays.copyOf(new Object[0], 0));
                        long j9 = y3d.g;
                        long j10 = daq0.c;
                        pz40 pz40Var5 = s6t0.f31722a;
                        smk0 smk0Var5 = new smk0(s6t0.b().f33626a.getTextPrimary(), j10, null, null, null, null, null, j10, new j56(f), null, null, j9, k5q0Var, null, null, 17424);
                        h83Var6.c(strA4);
                        j83VarC = kng0.c(h83Var6.f12607a, h83Var6, smk0Var5, 0);
                    }
                    qadVar = new rad(j83VarC, strB4, strB5);
                } else {
                    if (!(mcaVar instanceof ida)) {
                        t9f.b();
                        return lz10Var;
                    }
                    qadVar = new qad(((ida) mcaVar).e);
                }
                return new dax(dadVar, qadVar);
            }

            /* JADX WARN: Code duplicated, block: B:140:0x0381  */
            /* JADX WARN: Code duplicated, block: B:70:0x01a8  */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                kc50 kc50Var;
                p700 p700Var;
                ena enaVar;
                uia uiaVar;
                String strA;
                String strC;
                String strC2;
                zvl0 zvl0Var;
                yja yjaVar;
                qal0 qal0Var;
                Object b0k0Var;
                i49 g49Var;
                dxh0 dxh0Var;
                hna hnaVar;
                lmo lmoVar;
                byte b7 = b6;
                int i = 0;
                rjs rjsVar = this.b;
                switch (b7) {
                    case 0:
                        List list = (List) obj;
                        list.getClass();
                        boolean zBooleanValue = ((Boolean) ((fee) rjsVar.c.getValue()).c()).booleanValue();
                        boolean zBooleanValue2 = ((Boolean) ((fee) rjsVar.e.getValue()).c()).booleanValue();
                        boolean zBooleanValue3 = ((Boolean) ((fee) rjsVar.f.getValue()).c()).booleanValue();
                        tf50 tf50Var = (tf50) ((fee) rjsVar.d.getValue()).c();
                        tf50Var.getClass();
                        if (!list.contains(tf50Var)) {
                            tf50Var = tf50.f33851a;
                        }
                        boolean z = !zBooleanValue2;
                        kc50 kc50Var2 = new kc50(R.drawable.ic_glyph_rectangular_scoreboard, tf50Var == tf50.f33851a);
                        tf50 tf50Var2 = tf50.b;
                        kc50 kc50Var3 = list.contains(tf50Var2) ? new kc50(R.drawable.ic_glyph_rectangular_broadcast, tf50Var == tf50Var2) : null;
                        tf50 tf50Var3 = tf50.c;
                        if (list.contains(tf50Var3)) {
                            kc50Var = new kc50(R.drawable.ic_glyph_rectangular_statistic, tf50Var == tf50Var3);
                        } else {
                            kc50Var = null;
                        }
                        return new ojs(zBooleanValue, z, zBooleanValue, zBooleanValue3, new hjs(kc50Var2, kc50Var3, kc50Var, tf50Var));
                    case 1:
                        n0o0 n0o0Var = rjsVar.o;
                        gna gnaVar = (gna) obj;
                        if ((gnaVar instanceof ena ? (ena) gnaVar : null) == null || (p700Var = ((ena) gnaVar).l) == null) {
                            return null;
                        }
                        List list2 = p700Var.e;
                        List list3 = (List) ((fee) n0o0Var.getValue()).c();
                        ch00 ch00Var = ch00.LAST_GAMES;
                        boolean zContains = list3.contains(ch00Var);
                        List list4 = (List) ((fee) n0o0Var.getValue()).c();
                        ch00 ch00Var2 = ch00.LAST_GAMES_OPP_ONE;
                        boolean zContains2 = list4.contains(ch00Var2);
                        List list5 = (List) ((fee) n0o0Var.getValue()).c();
                        ch00 ch00Var3 = ch00.LAST_GAMES_OPP_TWO;
                        boolean zContains3 = list5.contains(ch00Var3);
                        ctf0 ctf0Var2 = rjsVar.f30611a;
                        ctf0Var2.getClass();
                        ArrayList arrayList = new ArrayList();
                        List list6 = p700Var.g;
                        List list7 = p700Var.f;
                        if (!list2.isEmpty()) {
                            arrayList.add(z1x.T(list2, ctf0Var2, ctf0Var2.b.a(R.string.previous_meetings, Arrays.copyOf(new Object[0], 0)), ch00Var, zContains));
                        }
                        if (!list7.isEmpty()) {
                            arrayList.add(z1x.T(list7, ctf0Var2, kng0.l(ctf0Var2.b.a(R.string.last_games, Arrays.copyOf(new Object[0], 0)), ": ", p700Var.c), ch00Var2, zContains2));
                        }
                        if (!list6.isEmpty()) {
                            arrayList.add(z1x.T(list6, ctf0Var2, kng0.l(ctf0Var2.b.a(R.string.last_games, Arrays.copyOf(new Object[0], 0)), ": ", p700Var.d), ch00Var3, zContains3));
                        }
                        return arrayList;
                    case 2:
                        gna gnaVar2 = (gna) obj;
                        if ((gnaVar2 instanceof ena ? (ena) gnaVar2 : null) == null || (uiaVar = (enaVar = (ena) gnaVar2).h) == null) {
                            return null;
                        }
                        ctf0 ctf0Var3 = rjsVar.f30611a;
                        boolean z2 = enaVar.p;
                        ctf0Var3.getClass();
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it = uiaVar.c.iterator();
                        int i2 = 0;
                        while (it.hasNext()) {
                            Object next = it.next();
                            int i3 = i2 + 1;
                            if (i2 < 0) {
                                q3d.p();
                                throw null;
                            }
                            bsw bswVar = (bsw) next;
                            String str = bswVar.b;
                            String str2 = bswVar.e;
                            String strA2 = (str.length() <= 0 || str2.length() <= 0) ? ctf0Var3.b.a(R.string.vs, Arrays.copyOf(new Object[0], 0)) : w6x.q(bswVar.b, " : ", str2);
                            odp0 odp0Var = new odp0(new d5a0(new c280(bswVar.c, R.drawable.ic_glyph_placeholder_player)));
                            String strM = dw9.m(i3, ". ", bswVar.f3153a);
                            odp0 odp0Var2 = new odp0(new d5a0(new c280(bswVar.f, R.drawable.ic_glyph_placeholder_player)));
                            String strM2 = dw9.m(i3, ". ", bswVar.d);
                            rdj rdjVar = rdj.f30294a;
                            arrayList2.add(new hzy(odp0Var, strM, odp0Var2, strM2, rdj.g(new znq0(bswVar.g), efj.UNIVERSAL, Boolean.valueOf(z2), false, 56), strA2, "", null, null));
                            it = it;
                            i2 = i3;
                        }
                        dja djaVar = dja.PENALTY;
                        return new eax(dyb.o0(arrayList2), uiaVar.f35722a, uiaVar.b);
                    case 3:
                        anq0 anq0Var2 = (anq0) obj;
                        if (anq0Var2 != null) {
                            boolean z3 = ((Boolean) ((fee) rjsVar.g.getValue()).c()).booleanValue() || ((Boolean) ((fee) rjsVar.h.getValue()).c()).booleanValue();
                            ctf0 ctf0Var4 = rjsVar.f30611a;
                            ctf0Var4.getClass();
                            long j = anq0Var2.e;
                            long j2 = anq0Var2.d;
                            boolean z4 = anq0Var2.j;
                            if (j != 0 || !z4) {
                                String str3 = anq0Var2.c;
                                if (z4) {
                                    if (str3.length() > 0) {
                                        strA = ctf0Var4.b.a(R.string.live_additional_min_v2, Arrays.copyOf(new Object[]{str3}, 1));
                                    } else if (anq0Var2.f1167a) {
                                        strA = "";
                                    } else {
                                        strA = anq0Var2.b ? ctf0Var4.b.a(R.string.line_live_time_period_back_v2, Arrays.copyOf(new Object[]{""}, 1)) : ctf0Var4.b.a(R.string.line_live_time_period_capitalized_v2, Arrays.copyOf(new Object[]{""}, 1));
                                    }
                                } else if (j2 < 0) {
                                    strA = ctf0Var4.b.a(R.string.game_started, Arrays.copyOf(new Object[0], 0));
                                } else {
                                    long j3 = j2 / 86400;
                                    strA = j3 > 0 ? ctf0Var4.b.a(R.string.line_time_before_v2, Arrays.copyOf(new Object[]{String.valueOf(j3)}, 1)) : ctf0Var4.b.a(R.string.before_start, Arrays.copyOf(new Object[0], 0));
                                }
                                String strC3 = (z3 || z4 || j2 < 0) ? null : n2x.C((((j2 < 0 ? 0L : j2) / 60) / 60) % 24);
                                if (z3) {
                                    strC = null;
                                } else {
                                    long jB = (z4 ? vzb.V(anq0Var2).b() : j2 < 0 ? 0L : j2) / 60;
                                    if (!z4) {
                                        jB %= 60;
                                    }
                                    strC = n2x.C(jB);
                                }
                                if (z3) {
                                    strC2 = null;
                                } else {
                                    strC2 = n2x.C((z4 ? vzb.V(anq0Var2).b() : j2 >= 0 ? j2 : 0L) % 60);
                                }
                                return new jg30(strA, strC3, strC, strC2);
                            }
                        }
                        return null;
                    case 4:
                        gna gnaVar3 = (gna) obj;
                        ena enaVar2 = gnaVar3 instanceof ena ? (ena) gnaVar3 : null;
                        if (enaVar2 == null || (zvl0Var = ((ena) gnaVar3).k) == null) {
                            return null;
                        }
                        String str4 = zvl0Var.m;
                        String str5 = enaVar2.q;
                        ctf0 ctf0Var5 = rjsVar.f30611a;
                        m1v0 m1v0Var = (m1v0) ((fee) rjsVar.J.getValue()).b();
                        str5.getClass();
                        ctf0Var5.getClass();
                        String str6 = zvl0Var.f45064a;
                        Pair pair = str4.length() > 0 ? new Pair(str4, ctf0Var5.b.a(R.string.web_site, Arrays.copyOf(new Object[0], 0))) : new Pair(null, null);
                        String str7 = (String) pair.f46059a;
                        String str8 = (String) pair.b;
                        dja djaVar2 = dja.PENALTY;
                        String str9 = zvl0Var.b;
                        ArrayList arrayList3 = new ArrayList();
                        String str10 = zvl0Var.l;
                        String str11 = zvl0Var.k;
                        String str12 = zvl0Var.j;
                        String str13 = zvl0Var.i;
                        String str14 = zvl0Var.h;
                        String str15 = zvl0Var.g;
                        String str16 = zvl0Var.f;
                        String str17 = zvl0Var.e;
                        String str18 = zvl0Var.d;
                        String str19 = zvl0Var.c;
                        if (str6.length() > 0) {
                            arrayList3.add(l7x.J(ctf0Var5, str6, R.string.address));
                        }
                        if (str19.length() > 0) {
                            arrayList3.add(l7x.J(ctf0Var5, str19, R.string.capacity));
                        }
                        if (str18.length() > 0) {
                            arrayList3.add(l7x.J(ctf0Var5, str18, R.string.covering));
                        }
                        if (str17.length() > 0) {
                            arrayList3.add(l7x.J(ctf0Var5, str17, R.string.city_name));
                        }
                        if (str16.length() > 0) {
                            arrayList3.add(l7x.J(ctf0Var5, str16, R.string.architect));
                        }
                        if (str15.length() > 0) {
                            arrayList3.add(l7x.J(ctf0Var5, str15, R.string.old_name));
                        }
                        if (str14.length() > 0) {
                            arrayList3.add(l7x.J(ctf0Var5, str14, R.string.category));
                        }
                        if (str13.length() > 0) {
                            arrayList3.add(l7x.J(ctf0Var5, str13, R.string.history));
                        }
                        if (str12.length() > 0) {
                            arrayList3.add(l7x.J(ctf0Var5, str12, R.string.opened));
                        }
                        if (str11.length() > 0) {
                            arrayList3.add(l7x.J(ctf0Var5, str11, R.string.zip_code));
                        }
                        if (str10.length() > 0) {
                            arrayList3.add(l7x.J(ctf0Var5, "\u2066" + str10 + "\u2069", R.string.phone));
                        }
                        a4x a4xVarO0 = dyb.o0(arrayList3);
                        List list8 = zvl0Var.n;
                        ArrayList arrayList4 = new ArrayList(r3d.q(list8, 10));
                        Iterator it2 = list8.iterator();
                        while (it2.hasNext()) {
                            arrayList4.add(String.format(Locale.ENGLISH, "%s/sfiles/stadium/%s", Arrays.copyOf(new Object[]{str5, (String) it2.next()}, 2)));
                        }
                        a4x a4xVarO1 = dyb.o0(arrayList4);
                        if (a4xVarO1.isEmpty()) {
                            a4xVarO1 = dyb.g0("");
                        }
                        return new iax(m1v0Var, str9, a4xVarO0, str7, str8, a4xVarO1);
                    case 5:
                        gna gnaVar4 = (gna) obj;
                        if ((gnaVar4 instanceof ena ? (ena) gnaVar4 : null) != null && (yjaVar = ((ena) gnaVar4).i) != null) {
                            List list9 = yjaVar.f42730a;
                            if (!list9.isEmpty()) {
                                long jLongValue = ((Number) ((fee) rjsVar.m.getValue()).c()).longValue();
                                lc00 lc00VarB = kotlin.collections.a.b();
                                Iterator it3 = list9.iterator();
                                while (it3.hasNext()) {
                                    he30 he30Var = (he30) it3.next();
                                    List list10 = he30Var.b;
                                    ArrayList arrayList5 = new ArrayList();
                                    for (Object obj2 : list10) {
                                        if (((ge30) obj2).e.length() > 0) {
                                            arrayList5.add(obj2);
                                        }
                                    }
                                    if (!arrayList5.isEmpty()) {
                                        lc00VarB.add(new uim(he30Var.f12902a));
                                        int i4 = i;
                                        for (Object obj3 : arrayList5) {
                                            int i5 = i4 + 1;
                                            if (i4 < 0) {
                                                q3d.p();
                                                throw null;
                                            }
                                            ge30 ge30Var = (ge30) obj3;
                                            String str20 = ge30Var.f11132a;
                                            String str21 = ge30Var.e;
                                            String str22 = ge30Var.c;
                                            String str23 = ge30Var.d;
                                            tho thoVar = ge30Var.b;
                                            Iterator it4 = it3;
                                            List listSplit$default = StringsKt__StringsKt.split$default(str20, new String[]{"+"}, false, i, 6, null);
                                            long j4 = jLongValue;
                                            List listSplit$default2 = StringsKt__StringsKt.split$default(str20, new String[]{Separators.COLON}, false, i, 6, null);
                                            if (j4 == 1) {
                                                if (listSplit$default.size() == 2 && listSplit$default2.size() == 1) {
                                                    str20 = listSplit$default.get(0) + "'+" + kotlin.text.c.r((String) listSplit$default.get(1), Separators.QUOTE, "", false);
                                                } else if (listSplit$default2.size() == 2) {
                                                    str20 = listSplit$default2.get(0) + Separators.QUOTE;
                                                }
                                            }
                                            y6n y6nVar = ge30Var.j == 0 ? y6n.f42107a : y6n.b;
                                            ggm ggmVar = i4 == 0 ? arrayList5.size() + (-1) == 0 ? ggm.c : ggm.f11256a : i4 == arrayList5.size() + (-1) ? ggm.b : ggm.d;
                                            lc00VarB.add((str23.length() == 0 && str22.length() == 0) ? new sim(str20, str21, thoVar.name(), y6nVar, ggmVar, ge30Var.b()) : new rim(str20, str21, new lnm(str23, str22, 0, "", new s0m("", ""), ge30Var.k), ge30Var.a() ? new lnm(ge30Var.h, ge30Var.g, 0, "", new s0m("", ""), ge30Var.l) : null, thoVar.name(), null, y6nVar, ggmVar, ge30Var.b()));
                                            it3 = it4;
                                            i4 = i5;
                                            jLongValue = j4;
                                            i = 0;
                                        }
                                    }
                                    it3 = it3;
                                    jLongValue = jLongValue;
                                    i = 0;
                                }
                                i4 i4VarR0 = dyb.r0(kotlin.collections.a.a(lc00VarB));
                                dja djaVar3 = dja.PENALTY;
                                return new gax(new sf30(i4VarR0));
                            }
                        }
                        return null;
                    case 6:
                        vzj0 vzj0Var = (vzj0) obj;
                        if (!(((fee) rjsVar.B.getValue()).b() instanceof qrr) && vzj0Var != null) {
                            anq0 anq0Var3 = (anq0) ((fee) rjsVar.H.getValue()).c();
                            ctf0 ctf0Var6 = rjsVar.f30611a;
                            ctf0Var6.getClass();
                            znq0 znq0Var = anq0Var3 != null ? anq0Var3.h : null;
                            if (znq0Var != null) {
                                long j5 = znq0Var.f44687a;
                                if (j5 <= 0) {
                                    qal0Var = null;
                                } else {
                                    long j6 = j5 / 86400;
                                    qal0Var = new qal0(j6 > 0 ? ctf0Var6.b.a(R.string.line_time_before_v2, Arrays.copyOf(new Object[]{String.valueOf(j6)}, 1)) : ctf0Var6.b.a(R.string.before_start, Arrays.copyOf(new Object[0], 0)), yyw.L((((j5 < 0 ? 0L : j5) / 60) / 60) % 24), yyw.L(((j5 < 0 ? 0L : j5) / 60) % 60), yyw.L((j5 >= 0 ? j5 : 0L) % 60));
                                }
                            } else {
                                qal0Var = null;
                            }
                            if (vzj0Var instanceof tzj0) {
                                tzj0 tzj0Var = (tzj0) vzj0Var;
                                b0k0Var = new yzj0(tzj0Var.f34807a, tzj0Var.b, tzj0Var.c, tzj0Var.d, qal0Var);
                            } else if (vzj0Var instanceof uzj0) {
                                uzj0 uzj0Var = (uzj0) vzj0Var;
                                b0k0Var = new b0k0(uzj0Var.f36538a, uzj0Var.b, uzj0Var.c, uzj0Var.d, qal0Var);
                            } else {
                                t9f.b();
                            }
                            return b0k0Var;
                        }
                        return null;
                    case 7:
                        boolean zBooleanValue4 = ((Boolean) obj).booleanValue();
                        long jLongValue2 = ((Number) ((fee) rjsVar.j.getValue()).c()).longValue();
                        boolean zBooleanValue5 = ((Boolean) ((fee) rjsVar.i.getValue()).c()).booleanValue();
                        long jLongValue3 = ((Number) ((fee) rjsVar.k.getValue()).c()).longValue();
                        long jLongValue4 = ((Number) ((fee) rjsVar.m.getValue()).c()).longValue();
                        Long l = (Long) ((fee) rjsVar.l.getValue()).c();
                        long jLongValue5 = l != null ? l.longValue() : -1L;
                        if (zBooleanValue4) {
                            return new sym0(new MarketsCategoriesParams(jLongValue2, jLongValue3, jLongValue4, new zq2(), "", zBooleanValue5));
                        }
                        tef0 tef0Var = tef0.f33818a;
                        xuz xuzVar = pb10.c;
                        return new vym0(new RelatedParams(zBooleanValue5, jLongValue2, jLongValue4, -1L, jLongValue5, tef0Var));
                    case 8:
                        return a(obj);
                    case 9:
                        fsr fsrVar = (fsr) obj;
                        if ((fsrVar == null || !fsrVar.b) && (fsrVar == null || !fsrVar.c)) {
                            return k49.f17656a;
                        }
                        o49 o49Var = (o49) ((fee) rjsVar.y.getValue()).c();
                        ctf0 ctf0Var7 = rjsVar.f30611a;
                        zvh0 zvh0Var2 = rjsVar.b;
                        fsrVar.getClass();
                        ctf0Var7.getClass();
                        ArrayList arrayList6 = new ArrayList();
                        if (fsrVar.b) {
                            arrayList6.add(new g49(ctf0Var7.b.a(R.string.video, Arrays.copyOf(new Object[0], 0))));
                        }
                        if (fsrVar.c) {
                            arrayList6.add(new h49(ctf0Var7.b.a(R.string.play_zone, Arrays.copyOf(new Object[0], 0))));
                        }
                        if (o49Var == null) {
                            g49Var = (i49) CollectionsKt.U(arrayList6);
                        } else {
                            int iOrdinal = o49Var.ordinal();
                            if (iOrdinal == 0) {
                                g49Var = new g49(ctf0Var7.b.a(R.string.video, Arrays.copyOf(new Object[0], 0)));
                            } else {
                                if (iOrdinal != 1) {
                                    t9f.b();
                                    return null;
                                }
                                g49Var = new h49(ctf0Var7.b.a(R.string.play_zone, Arrays.copyOf(new Object[0], 0)));
                            }
                            if (arrayList6.isEmpty()) {
                                g49Var = null;
                            } else {
                                Iterator it5 = arrayList6.iterator();
                                do {
                                    if (!it5.hasNext()) {
                                        g49Var = null;
                                    }
                                } while (!Intrinsics.d((i49) it5.next(), g49Var));
                            }
                            if (g49Var == null) {
                                g49Var = (i49) CollectionsKt.U(arrayList6);
                            }
                        }
                        bfu0 bfu0Var = fsrVar.f10077a;
                        GameBroadcastingParams gameBroadcastingParams = new GameBroadcastingParams(bfu0Var.f2522a, bfu0Var.c, bfu0Var.f, bfu0Var.b, bfu0Var.e, bfu0Var.d, bfu0Var.g, null);
                        Iterator it6 = arrayList6.iterator();
                        int i6 = 0;
                        while (true) {
                            if (!it6.hasNext()) {
                                i6 = -1;
                            } else if (!Intrinsics.d((i49) it6.next(), g49Var)) {
                                i6++;
                            }
                        }
                        int i7 = i6;
                        i4 i4VarR1 = dyb.r0(arrayList6);
                        boolean z5 = arrayList6.size() > 1;
                        int iOrdinal2 = zvh0Var2.ordinal();
                        if (iOrdinal2 == 0) {
                            dxh0Var = axh0.f1625a;
                        } else if (iOrdinal2 == 1) {
                            dxh0Var = zwh0.f45106a;
                        } else if (iOrdinal2 == 2) {
                            dxh0Var = cxh0.f5122a;
                        } else {
                            if (iOrdinal2 != 3) {
                                t9f.b();
                                return null;
                            }
                            dxh0Var = bxh0.f3376a;
                        }
                        dxh0 dxh0Var2 = dxh0Var;
                        ArrayList arrayList7 = new ArrayList(r3d.q(arrayList6, 10));
                        Iterator it7 = arrayList6.iterator();
                        while (it7.hasNext()) {
                            arrayList7.add(new yvh0(((i49) it7.next()).getDescription(), bwh0.f3325a));
                        }
                        return new j49(gameBroadcastingParams, i7, g49Var, i4VarR1, z5, dxh0Var2, dyb.r0(arrayList7));
                    case 10:
                        return b(obj);
                    default:
                        gna gnaVar5 = (gna) obj;
                        if ((gnaVar5 instanceof ena ? (ena) gnaVar5 : null) == null || (hnaVar = ((ena) gnaVar5).j) == null) {
                            return null;
                        }
                        boolean zContains4 = ((List) ((fee) rjsVar.o.getValue()).c()).contains(ch00.SHORT_STATISTIC);
                        ctf0 ctf0Var8 = rjsVar.f30611a;
                        ctf0Var8.getClass();
                        List<vrj0> list11 = hnaVar.f;
                        ArrayList arrayList8 = new ArrayList(r3d.q(list11, 10));
                        for (vrj0 vrj0Var : list11) {
                            float fS = r7x.s(vrj0Var.b);
                            float fS2 = r7x.s(vrj0Var.c);
                            String str24 = vrj0Var.f37902a;
                            String str25 = vrj0Var.b;
                            String str26 = vrj0Var.c;
                            if (fS == 0.0f && fS2 == 0.0f) {
                                fS = 0.0f;
                            }
                            arrayList8.add(new srj0(fS, (fS == 0.0f && fS2 == 0.0f) ? 0.0f : fS2, str24, str25, str26));
                        }
                        dja djaVar4 = dja.PENALTY;
                        ch00 ch00Var4 = ch00.SHORT_STATISTIC;
                        i4 i4VarR2 = zContains4 ? dyb.r0(arrayList8) : dyb.r0(CollectionsKt.D0(arrayList8, 3));
                        if (arrayList8.size() - 1 > 3) {
                            lsm0 lsm0Var = ctf0Var8.b;
                            lmoVar = new lmo(lsm0Var.a(R.string.expand, Arrays.copyOf(new Object[0], 0)), lsm0Var.a(R.string.collapse, Arrays.copyOf(new Object[0], 0)), zContains4);
                        } else {
                            lmoVar = null;
                        }
                        return new hax(i4VarR2, lmoVar);
                }
            }
        });
        final byte b7 = 1;
        this.F = bkb.G(a().d, new Function1(this) { // from class: a.qjs
            public final /* synthetic */ rjs b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:260:0x08d4  */
            /* JADX WARN: Code duplicated, block: B:262:0x08e4  */
            /* JADX WARN: Code duplicated, block: B:265:0x090f  */
            /* JADX WARN: Code duplicated, block: B:268:0x0932  */
            /* JADX WARN: Code duplicated, block: B:270:0x0936  */
            /* JADX WARN: Code duplicated, block: B:272:0x094e  */
            private final Object a(Object obj) {
                n0o0 n0o0Var;
                n0o0 n0o0Var2;
                String str;
                String str2;
                mqr kqrVar;
                String strG;
                d3h0 pekVar;
                String strN;
                d3h0 xakVar;
                Integer num;
                String strN2;
                int i;
                iul0 iul0Var;
                yd90 yd90Var;
                yd90 yd90Var2;
                iul0 iul0Var2;
                String str3;
                String str4;
                d3h0 bekVar;
                String strA;
                String strB;
                String strN3;
                rjs rjsVar = this.b;
                n0o0 n0o0Var3 = rjsVar.v;
                n0o0 n0o0Var4 = rjsVar.m;
                n0o0 n0o0Var5 = rjsVar.H;
                n0o0 n0o0Var6 = rjsVar.I;
                ctf0 ctf0Var2 = rjsVar.f30611a;
                gna gnaVar = (gna) obj;
                if (gnaVar != null) {
                    if (!(gnaVar instanceof ena)) {
                        if (gnaVar instanceof fna) {
                            ctf0Var2.getClass();
                            return new orr(d9x.L(((fna) gnaVar).f9825a, ctf0Var2));
                        }
                        t9f.b();
                        return null;
                    }
                    ena enaVar = (ena) gnaVar;
                    mca mcaVar = enaVar.f8084a;
                    List list = (List) ((fee) rjsVar.n.getValue()).c();
                    boolean zBooleanValue = ((Boolean) ((fee) rjsVar.e.getValue()).c()).booleanValue();
                    mpm mpmVar = (mpm) ((fee) n0o0Var6.getValue()).b();
                    boolean z = enaVar.p;
                    String str5 = (String) ((fee) rjsVar.p.getValue()).c();
                    String str6 = (String) ((fee) rjsVar.q.getValue()).c();
                    String str7 = (String) ((fee) rjsVar.r.getValue()).c();
                    String str8 = (String) ((fee) rjsVar.s.getValue()).c();
                    jg30 jg30Var = (jg30) ((fee) n0o0Var5.getValue()).b();
                    bg30 bg30Var = (bg30) ((fee) n0o0Var6.getValue()).c();
                    znq0 znq0Var = (znq0) ((fee) rjsVar.t.getValue()).c();
                    bha bhaVar = enaVar.o;
                    ui9 ui9Var = (ui9) ((fee) rjsVar.u.getValue()).c();
                    long jLongValue = ((Number) ((fee) n0o0Var4.getValue()).c()).longValue();
                    boolean zBooleanValue2 = ((Boolean) ((fee) n0o0Var3.getValue()).c()).booleanValue();
                    ctf0Var2.getClass();
                    if (ui9Var != null) {
                        int i2 = ui9Var.c;
                        int i3 = ui9Var.d;
                        n0o0Var = n0o0Var4;
                        String strN4 = (cy7.c() && zBooleanValue2) ? w6x.n(i3, i2, " : ") : w6x.n(i2, i3, " : ");
                        String strX = j0x.x(jLongValue, ctf0Var2);
                        ArrayList arrayList = ui9Var.f35720a;
                        n0o0Var2 = n0o0Var5;
                        str = str5;
                        str2 = str6;
                        ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
                        int i4 = 0;
                        for (Object obj2 : arrayList) {
                            int i5 = i4 + 1;
                            if (i4 < 0) {
                                q3d.p();
                                throw null;
                            }
                            arrayList2.add(piz.W((sc90) obj2, jLongValue, i4));
                            i4 = i5;
                        }
                        i4 i4VarR0 = dyb.r0(arrayList2);
                        ArrayList arrayList3 = ui9Var.b;
                        ArrayList arrayList4 = new ArrayList(r3d.q(arrayList3, 10));
                        int i6 = 0;
                        for (Object obj3 : arrayList3) {
                            int i7 = i6 + 1;
                            if (i6 < 0) {
                                q3d.p();
                                throw null;
                            }
                            arrayList4.add(piz.W((sc90) obj3, jLongValue, i6));
                            i6 = i7;
                        }
                        kqrVar = new iqr(strN4, strX, i4VarR0, dyb.r0(arrayList4));
                    } else {
                        n0o0Var = n0o0Var4;
                        n0o0Var2 = n0o0Var5;
                        str = str5;
                        str2 = str6;
                        if (bhaVar != null) {
                            float f = bhaVar.d;
                            float f2 = bhaVar.e;
                            float f3 = bhaVar.f;
                            Object[] objArr = {Float.valueOf(f3)};
                            lsm0 lsm0Var = ctf0Var2.b;
                            String strA2 = lsm0Var.a(R.string.n_percents, Arrays.copyOf(objArr, 1));
                            k3w0 g3w0Var = (f3 <= f2 || f3 <= f) ? new g3w0(strA2) : new i3w0(strA2);
                            String strA3 = lsm0Var.a(R.string.n_percents, Arrays.copyOf(new Object[]{Float.valueOf(f2)}, 1));
                            k3w0 g3w0Var2 = (f2 <= f3 || f2 <= f) ? new g3w0(strA3) : new i3w0(strA3);
                            String strA4 = lsm0Var.a(R.string.n_percents, Arrays.copyOf(new Object[]{Float.valueOf(f)}, 1));
                            kqrVar = new kqr(g3w0Var, g3w0Var2, (f <= f3 || f <= f2) ? new g3w0(strA4) : new i3w0(strA4));
                        } else {
                            kqrVar = null;
                        }
                    }
                    anq0 anq0Var2 = (anq0) ((fee) n0o0Var2.getValue()).c();
                    boolean z2 = anq0Var2 != null ? anq0Var2.f1167a : false;
                    long jLongValue2 = ((Number) ((fee) n0o0Var.getValue()).c()).longValue();
                    boolean zBooleanValue3 = ((Boolean) ((fee) n0o0Var3.getValue()).c()).booleanValue();
                    list.getClass();
                    mpmVar.getClass();
                    String strA5 = "";
                    if (mcaVar instanceof pca) {
                        pca pcaVar = (pca) mcaVar;
                        uqr uqrVarR0 = pzb.r0(mcaVar, str, str2, str7, str8, jg30Var);
                        if (bg30Var == null || (bekVar = bg30Var.b) == null) {
                            bekVar = bg30Var != null ? bg30Var.f2536a : new bek();
                        }
                        d3h0 d3h0Var = bekVar;
                        boolean z3 = d3h0Var instanceof lz10;
                        lz10 lz10Var = z3 ? (lz10) d3h0Var : null;
                        if (lz10Var != null) {
                            strA = vzb.T(lz10Var, zBooleanValue3);
                        } else {
                            hzm0 hzm0Var = d3h0Var instanceof hzm0 ? (hzm0) d3h0Var : null;
                            if (hzm0Var != null) {
                                String str9 = hzm0Var.g;
                                String str10 = hzm0Var.i;
                                StringBuilder sb = new StringBuilder("\u2066");
                                if (cy7.c() && zBooleanValue3) {
                                    if (str10 != null) {
                                        hne.B(sb, "(ov ", str10, Separators.RPAREN);
                                    }
                                    sb.append(vzb.i0(str9));
                                } else {
                                    sb.append(str9);
                                    if (str10 != null) {
                                        hne.B(sb, Separators.LPAREN, str10, " ov)");
                                    }
                                }
                                sb.append("\u2069");
                                strA = sb.toString();
                            } else {
                                strA = d3h0Var.a();
                            }
                        }
                        String str11 = strA;
                        lz10 lz10Var2 = z3 ? (lz10) d3h0Var : null;
                        if (lz10Var2 != null) {
                            strB = vzb.U(lz10Var2, zBooleanValue3);
                        } else {
                            hzm0 hzm0Var2 = d3h0Var instanceof hzm0 ? (hzm0) d3h0Var : null;
                            if (hzm0Var2 != null) {
                                String str12 = hzm0Var2.h;
                                String str13 = hzm0Var2.j;
                                StringBuilder sb2 = new StringBuilder("\u2066");
                                if (cy7.c() && zBooleanValue3) {
                                    if (str13 != null) {
                                        hne.B(sb2, "(ov ", str13, Separators.RPAREN);
                                    }
                                    sb2.append(vzb.i0(str12));
                                } else {
                                    sb2.append(str12);
                                    if (str13 != null) {
                                        hne.B(sb2, Separators.LPAREN, str13, " ov)");
                                    }
                                }
                                sb2.append("\u2069");
                                strB = sb2.toString();
                            } else {
                                strB = d3h0Var.b();
                            }
                        }
                        String str14 = strB;
                        boolean z4 = pcaVar.d;
                        rpp0 rpp0Var = pcaVar.f26749a;
                        j83 j83VarH = vzb.H(ctf0Var2, d3h0Var, pcaVar.e, pcaVar.f, pcaVar.g, (bg30Var == null || (strN3 = bg30Var.f2536a.n()) == null) ? "" : strN3, z4, zBooleanValue3);
                        String strB2 = rpp0Var.b();
                        c280 c280Var = new c280(vsm0.s(rpp0Var.a(), pcaVar.b), R.drawable.ic_glyph_placeholder_player);
                        long jA = rpp0Var.a();
                        bap bapVar = bap.b;
                        jdp0 jdp0Var = new jdp0(strB2, n6x.o0(c280Var, jA, list, zBooleanValue, bapVar), null);
                        jdp0 jdp0Var2 = new jdp0(rpp0Var.d(), n6x.o0(new c280(vsm0.s(rpp0Var.c(), pcaVar.c), R.drawable.ic_glyph_placeholder_player), rpp0Var.c(), list, zBooleanValue, bapVar), null);
                        lz10 lz10Var3 = z3 ? (lz10) d3h0Var : null;
                        return new mrr(uqrVarR0, jdp0Var, jdp0Var2, j83VarH, lz10Var3 != null ? vzb.G(lz10Var3.i) : eex.c, str11, d3h0Var.j(), str14, d3h0Var.i());
                    }
                    boolean z5 = z2;
                    String str15 = str;
                    String str16 = str2;
                    boolean z6 = mcaVar instanceof tca;
                    qpm qpmVar = qpm.f29126a;
                    if (z6) {
                        tca tcaVar = (tca) mcaVar;
                        uqr uqrVarR1 = pzb.r0(mcaVar, str15, str16, str7, str8, jg30Var);
                        znq0 znq0Var2 = new znq0(znq0Var != null ? znq0Var.f44687a : 0L);
                        rpp0 rpp0Var2 = tcaVar.f33711a;
                        boolean z7 = tcaVar.i;
                        if (rpp0Var2 instanceof qpp0) {
                            qpp0 qpp0Var = (qpp0) rpp0Var2;
                            jdp0 jdp0Var3 = new jdp0(qpp0Var.g, n6x.o0(u1c.C(tcaVar, true), qpp0Var.e, list, zBooleanValue || z7, bap.b), null);
                            jdp0 jdp0Var4 = new jdp0(qpp0Var.h, n6x.o0(u1c.C(tcaVar, false), qpp0Var.f, list, zBooleanValue || z7, bap.f2271a), null);
                            lpm lpmVar = new lpm(qpmVar, new hpm(0L, 3));
                            dpi0 dpi0Var = new dpi0((byte) 15);
                            rdj rdjVar = rdj.f30294a;
                            vzb.E(dpi0Var, rdj.g(znq0Var2, efj.UNIVERSAL, Boolean.valueOf(z), false, 56));
                            return new trr(uqrVarR1, jdp0Var3, jdp0Var4, lpmVar, ((h83) dpi0Var.f6468a).h(), kqrVar);
                        }
                        if (!(rpp0Var2 instanceof ppp0)) {
                            t9f.b();
                            return null;
                        }
                        ppp0 ppp0Var = (ppp0) rpp0Var2;
                        xcp0 xcp0VarC0 = b8k0.c0(ppp0Var.e, ppp0Var.g, tcaVar.b);
                        xcp0 xcp0VarC1 = b8k0.c0(ppp0Var.f, ppp0Var.h, tcaVar.c);
                        lpm lpmVar2 = new lpm(qpmVar, new hpm(0L, 3));
                        dpi0 dpi0Var2 = new dpi0((byte) 15);
                        rdj rdjVar2 = rdj.f30294a;
                        vzb.E(dpi0Var2, rdj.g(znq0Var2, efj.UNIVERSAL, Boolean.valueOf(z), false, 56));
                        return new trr(uqrVarR1, xcp0VarC0, xcp0VarC1, lpmVar2, ((h83) dpi0Var2.f6468a).h(), kqrVar);
                    }
                    if (!(mcaVar instanceof xca)) {
                        if (mcaVar instanceof gda) {
                            gda gdaVar = (gda) mcaVar;
                            uqr uqrVarR2 = pzb.r0(mcaVar, str15, str16, str7, str8, jg30Var);
                            znq0 znq0Var3 = new znq0(znq0Var != null ? znq0Var.f44687a : 0L);
                            String strB0 = CollectionsKt.b0(gdaVar.f11094a, Separators.SLASH, null, null, null, 62);
                            String strB1 = CollectionsKt.b0(gdaVar.b, Separators.SLASH, null, null, null, 62);
                            lpm lpmVar3 = new lpm(qpmVar, new hpm(0L, 3));
                            dpi0 dpi0Var3 = new dpi0((byte) 15);
                            rdj rdjVar3 = rdj.f30294a;
                            vzb.E(dpi0Var3, rdj.g(znq0Var3, efj.UNIVERSAL, Boolean.valueOf(z), false, 56));
                            return new rrr(uqrVarR2, strB0, strB1, lpmVar3, ((h83) dpi0Var3.f6468a).h());
                        }
                        if (mcaVar instanceof hda) {
                            hda hdaVar = (hda) mcaVar;
                            uqr uqrVarR3 = pzb.r0(mcaVar, str15, str16, str7, str8, jg30Var);
                            if (bg30Var == null || (pekVar = bg30Var.b) == null) {
                                pekVar = bg30Var != null ? bg30Var.f2536a : new pek();
                            }
                            return new rrr(uqrVarR3, CollectionsKt.b0(hdaVar.f12861a, Separators.SLASH, null, null, null, 62), CollectionsKt.b0(hdaVar.b, Separators.SLASH, null, null, null, 62), mpmVar, vzb.H(ctf0Var2, pekVar, hdaVar.h, hdaVar.i, hdaVar.j, (bg30Var == null || (strN = bg30Var.f2536a.n()) == null) ? "" : strN, hdaVar.g, zBooleanValue3));
                        }
                        if (!(mcaVar instanceof ida)) {
                            t9f.b();
                            return null;
                        }
                        ida idaVar = (ida) mcaVar;
                        uqr uqrVarR4 = pzb.r0(mcaVar, str15, str16, str7, str8, jg30Var);
                        if (!idaVar.g) {
                            if (znq0Var != null) {
                                rdj rdjVar4 = rdj.f30294a;
                                strG = rdj.g(znq0Var, efj.UNIVERSAL, Boolean.valueOf(z), false, 56);
                                if (strG == null) {
                                }
                            }
                            dpi0 dpi0Var10 = new dpi0((byte) 15);
                            vzb.E(dpi0Var10, strG);
                            return new vrr(uqrVarR4, idaVar.e, ((h83) dpi0Var10.f6468a).h());
                        }
                        strA5 = ctf0Var2.b.a(R.string.game_end, Arrays.copyOf(new Object[0], 0));
                        strG = strA5;
                        dpi0 dpi0Var11 = new dpi0((byte) 15);
                        vzb.E(dpi0Var11, strG);
                        return new vrr(uqrVarR4, idaVar.e, ((h83) dpi0Var11.f6468a).h());
                    }
                    if (!gql0.d().contains(Long.valueOf(jLongValue2))) {
                        xca xcaVar = (xca) mcaVar;
                        uqr uqrVarR5 = pzb.r0(mcaVar, str15, str16, str7, str8, jg30Var);
                        if (bg30Var == null || (xakVar = bg30Var.b) == null) {
                            xakVar = bg30Var != null ? bg30Var.f2536a : new xak((byte) 22);
                        }
                        boolean z8 = xcaVar.l;
                        boolean z9 = xcaVar.q;
                        rpp0 rpp0Var3 = xcaVar.f40636a;
                        j83 j83VarH2 = vzb.H(ctf0Var2, xakVar, xcaVar.n, xcaVar.o, xcaVar.p, (bg30Var == null || (strN2 = bg30Var.f2536a.n()) == null) ? "" : strN2, z8, zBooleanValue3);
                        if (!(rpp0Var3 instanceof qpp0)) {
                            if (rpp0Var3 instanceof ppp0) {
                                ppp0 ppp0Var2 = (ppp0) rpp0Var3;
                                return new trr(uqrVarR5, b8k0.c0(ppp0Var2.e, ppp0Var2.g, xcaVar.h), b8k0.c0(ppp0Var2.f, ppp0Var2.h, xcaVar.i), mpmVar, j83VarH2, kqrVar);
                            }
                            t9f.b();
                            return null;
                        }
                        int i8 = xcaVar.b;
                        int i9 = xcaVar.g;
                        int i10 = xcaVar.f;
                        int i11 = xcaVar.d;
                        int i12 = xcaVar.c;
                        vy vyVar = (i8 == 0 && i12 == 0 && i11 == 0) ? null : new vy(i8 > 0 ? Integer.valueOf(i8) : null, i12 > 0 ? Integer.valueOf(i12) : null, i11 > 0 ? Integer.valueOf(i11) : null);
                        int i13 = xcaVar.e;
                        vy vyVar2 = (i13 == 0 && i10 == 0 && i9 == 0) ? null : new vy(i13 > 0 ? Integer.valueOf(i13) : null, i10 > 0 ? Integer.valueOf(i10) : null, i9 > 0 ? Integer.valueOf(i9) : null);
                        boolean z10 = (vyVar == null && vyVar2 == null) ? false : true;
                        if (z10 && vyVar == null) {
                            num = null;
                            vyVar = new vy(null, null, null);
                        } else {
                            num = null;
                        }
                        if (z10 && vyVar2 == null) {
                            vyVar2 = new vy(num, num, num);
                        }
                        qpp0 qpp0Var2 = (qpp0) rpp0Var3;
                        return new trr(uqrVarR5, new jdp0(qpp0Var2.g, n6x.o0(u1c.D(xcaVar, true), qpp0Var2.e, list, zBooleanValue || z9, bap.b), vyVar), new jdp0(qpp0Var2.h, n6x.o0(u1c.D(xcaVar, false), qpp0Var2.f, list, zBooleanValue || z9, bap.f2271a), vyVar2), mpmVar, j83VarH2, kqrVar);
                    }
                    xca xcaVar2 = (xca) mcaVar;
                    long j = znq0Var != null ? znq0Var.f44687a : 0L;
                    uqr uqrVarR6 = pzb.r0(mcaVar, str15, str16, str7, str8, jg30Var);
                    znq0 znq0Var4 = new znq0(j);
                    pz10 pz10Var = bg30Var != null ? bg30Var.f2536a : null;
                    if (pz10Var instanceof nz10) {
                        izm0 izm0Var = bg30Var.b;
                        String str17 = xcaVar2.s;
                        List list2 = xcaVar2.i;
                        List list3 = xcaVar2.h;
                        rpp0 rpp0Var4 = xcaVar2.f40636a;
                        boolean z11 = xcaVar2.l;
                        String str18 = xcaVar2.p;
                        rdj rdjVar5 = rdj.f30294a;
                        pz10 pz10Var2 = pz10Var;
                        String strG2 = rdj.g(znq0Var4, efj.UNIVERSAL, Boolean.valueOf(z), false, 56);
                        str18.getClass();
                        strG2.getClass();
                        dpi0 dpi0Var12 = new dpi0((byte) 15);
                        if (str17 != null) {
                            vzb.E(dpi0Var12, str17);
                            vzb.E(dpi0Var12, ": ");
                            boolean z12 = cy7.c() && zBooleanValue3;
                            if (izm0Var == null) {
                                vzb.E(dpi0Var12, "0");
                                vzb.C(dpi0Var12);
                                vzb.E(dpi0Var12, "0");
                            } else {
                                if (!(izm0Var instanceof gzm0) && !(izm0Var instanceof hzm0)) {
                                    t9f.b();
                                    return null;
                                }
                                boolean z13 = izm0Var instanceof hzm0;
                                String strA6 = z13 ? ((hzm0) izm0Var).g : izm0Var.a();
                                String strB3 = z13 ? ((hzm0) izm0Var).h : izm0Var.b();
                                vzb.E(dpi0Var12, "\u2066");
                                if (z12) {
                                    vzb.D(dpi0Var12, strB3, vzb.L(izm0Var.i()));
                                    vzb.C(dpi0Var12);
                                    vzb.D(dpi0Var12, strA6, vzb.L(izm0Var.j()));
                                } else {
                                    vzb.D(dpi0Var12, strA6, vzb.L(izm0Var.j()));
                                    vzb.C(dpi0Var12);
                                    vzb.D(dpi0Var12, strB3, vzb.L(izm0Var.i()));
                                }
                                vzb.E(dpi0Var12, "\u2069");
                            }
                        } else {
                            vzb.E(dpi0Var12, strG2);
                            if (str18.length() > 0) {
                                vzb.A(dpi0Var12);
                                vzb.E(dpi0Var12, str18);
                            }
                            if (z11) {
                                vzb.A(dpi0Var12);
                                i = 0;
                                vzb.E(dpi0Var12, ctf0Var2.b.a(R.string.game_end, Arrays.copyOf(new Object[0], 0)));
                            } else {
                                i = 0;
                            }
                            if (z5) {
                                vzb.A(dpi0Var12);
                                vzb.E(dpi0Var12, ctf0Var2.b.a(R.string.card_cricket_break, Arrays.copyOf(new Object[i], i)));
                            }
                        }
                        j83 j83VarH3 = ((h83) dpi0Var12.f6468a).h();
                        nz10 nz10Var = (nz10) pz10Var2;
                        boolean z14 = nz10Var instanceof mz10;
                        k5q0 k5q0Var = k5q0.b;
                        if (!z14) {
                            if (nz10Var instanceof oz10) {
                                oz10 oz10Var = (oz10) nz10Var;
                                String str19 = oz10Var.i;
                                String str20 = oz10Var.g;
                                String str21 = oz10Var.m;
                                String str22 = oz10Var.k;
                                boolean z15 = ((StringsKt.W(str22) || str22.equals("0")) && (StringsKt.W(str21) || str21.equals("0"))) ? false : true;
                                boolean z16 = str20.length() > 0 || str19.length() > 0;
                                eex eexVarG = vzb.G(oz10Var.o);
                                ArrayList arrayList5 = oz10Var.f;
                                ArrayList arrayList6 = new ArrayList(r3d.q(arrayList5, 10));
                                Iterator it = arrayList5.iterator();
                                while (it.hasNext()) {
                                    te90 te90Var = (te90) it.next();
                                    arrayList6.add(new yd90(vzb.O(te90Var), vzb.Q(te90Var), te90Var.f33809a));
                                    it = it;
                                    z15 = z15;
                                }
                                boolean z17 = z15;
                                i4 i4VarR1 = dyb.r0(arrayList6);
                                j83 j83VarN = vzb.N(nz10Var);
                                j83 j83VarP = vzb.P(nz10Var);
                                lsm0 lsm0Var2 = ctf0Var2.b;
                                yd90 yd90Var3 = new yd90(j83VarN, j83VarP, lsm0Var2.a(R.string.total_count, Arrays.copyOf(new Object[0], 0)));
                                if (z17) {
                                    h83 h83Var = new h83();
                                    long j2 = y3d.g;
                                    long j3 = daq0.c;
                                    smk0 smk0Var = new smk0(vzb.L(oz10Var.l), j3, null, null, null, null, null, j3, new j56(0.0f), null, null, j2, k5q0Var, null, null, 17424);
                                    h83Var.c(str22);
                                    j83 j83VarC = kng0.c(h83Var.f12607a, h83Var, smk0Var, 0);
                                    h83 h83Var2 = new h83();
                                    smk0 smk0Var2 = new smk0(vzb.L(oz10Var.n), j3, null, null, null, null, null, j3, new j56(0.0f), null, null, j2, k5q0Var, null, null, 17424);
                                    h83Var2.c(str21);
                                    yd90Var = new yd90(j83VarC, kng0.c(h83Var2.f12607a, h83Var2, smk0Var2, 0), lsm0Var2.a(R.string.dt_points, Arrays.copyOf(new Object[0], 0)));
                                } else {
                                    yd90Var = null;
                                }
                                if (z16) {
                                    h83 h83Var3 = new h83();
                                    long j4 = y3d.g;
                                    long j5 = daq0.c;
                                    smk0 smk0Var3 = new smk0(vzb.L(oz10Var.h), j5, null, null, null, null, null, j5, new j56(0.0f), null, null, j4, k5q0Var, null, null, 17424);
                                    h83Var3.c(str20);
                                    j83 j83VarC2 = kng0.c(h83Var3.f12607a, h83Var3, smk0Var3, 0);
                                    h83 h83Var4 = new h83();
                                    smk0 smk0Var4 = new smk0(vzb.L(oz10Var.j), j5, null, null, null, null, null, j5, new j56(0.0f), null, null, j4, k5q0Var, null, null, 17424);
                                    h83Var4.c(str19);
                                    yd90Var2 = new yd90(j83VarC2, kng0.c(h83Var4.f12607a, h83Var4, smk0Var4, 0), lsm0Var2.a(R.string.tennis_game_column, Arrays.copyOf(new Object[0], 0)));
                                } else {
                                    yd90Var2 = null;
                                }
                                iul0Var2 = new iul0(eexVarG, i4VarR1, yd90Var3, yd90Var2, yd90Var);
                            } else {
                                if (!(nz10Var instanceof kz10)) {
                                    t9f.b();
                                    return null;
                                }
                                kz10 kz10Var = (kz10) nz10Var;
                                eex eexVarG2 = vzb.G(kz10Var.g);
                                ArrayList<te90> arrayList7 = kz10Var.f;
                                ArrayList arrayList8 = new ArrayList(r3d.q(arrayList7, 10));
                                for (te90 te90Var2 : arrayList7) {
                                    arrayList8.add(new yd90(vzb.O(te90Var2), vzb.Q(te90Var2), te90Var2.f33809a));
                                }
                                iul0Var = new iul0(eexVarG2, dyb.r0(arrayList8), new yd90(vzb.N(nz10Var), vzb.P(nz10Var), ctf0Var2.b.a(R.string.total_count, Arrays.copyOf(new Object[0], 0))), null, null);
                            }
                            if (rpp0Var4 instanceof qpp0) {
                                if (rpp0Var4 instanceof ppp0) {
                                    ppp0 ppp0Var9 = (ppp0) rpp0Var4;
                                    return new xrr(uqrVarR6, b8k0.c0(ppp0Var9.e, ppp0Var9.g, list3), b8k0.c0(ppp0Var9.f, ppp0Var9.h, list2), j83VarH3, iul0Var2);
                                }
                                t9f.b();
                                return null;
                            }
                            qpp0 qpp0Var9 = (qpp0) rpp0Var4;
                            String str217 = qpp0Var9.g;
                            str3 = (String) CollectionsKt.firstOrNull(list3);
                            if (str3 == null) {
                                str3 = "";
                            }
                            c280 c280Var8 = new c280(vsm0.s(qpp0Var9.e, str3), R.drawable.ic_glyph_placeholder_player);
                            long j14 = qpp0Var9.e;
                            bap bapVar8 = bap.b;
                            jdp0 jdp0Var11 = new jdp0(str217, n6x.o0(c280Var8, j14, list, zBooleanValue, bapVar8), null);
                            String str218 = qpp0Var9.h;
                            str4 = (String) CollectionsKt.firstOrNull(list2);
                            if (str4 == null) {
                                str4 = "";
                            }
                            return new xrr(uqrVarR6, jdp0Var11, new jdp0(str218, n6x.o0(new c280(vsm0.s(qpp0Var9.f, str4), R.drawable.ic_glyph_placeholder_player), qpp0Var9.f, list, zBooleanValue, bapVar8), null), j83VarH3, iul0Var2);
                        }
                        mz10 mz10Var = (mz10) nz10Var;
                        eex eexVarG3 = vzb.G(mz10Var.g);
                        ArrayList<te90> arrayList9 = mz10Var.f;
                        ArrayList arrayList10 = new ArrayList(r3d.q(arrayList9, 10));
                        for (te90 te90Var3 : arrayList9) {
                            arrayList10.add(new yd90(vzb.O(te90Var3), vzb.Q(te90Var3), te90Var3.f33809a));
                        }
                        i4 i4VarR2 = dyb.r0(arrayList10);
                        j83 j83VarN2 = vzb.N(nz10Var);
                        j83 j83VarP2 = vzb.P(nz10Var);
                        lsm0 lsm0Var3 = ctf0Var2.b;
                        yd90 yd90Var4 = new yd90(j83VarN2, j83VarP2, lsm0Var3.a(R.string.total_count, Arrays.copyOf(new Object[0], 0)));
                        h83 h83Var5 = new h83();
                        String str25 = mz10Var.h;
                        long j7 = y3d.g;
                        long j8 = daq0.c;
                        smk0 smk0Var5 = new smk0(vzb.L(mz10Var.i), j8, null, null, null, null, null, j8, new j56(0.0f), null, null, j7, k5q0Var, null, null, 17424);
                        h83Var5.c(str25);
                        j83 j83VarC3 = kng0.c(h83Var5.f12607a, h83Var5, smk0Var5, 0);
                        h83 h83Var6 = new h83();
                        String str26 = mz10Var.j;
                        smk0 smk0Var6 = new smk0(vzb.L(mz10Var.k), j8, null, null, null, null, null, j8, new j56(0.0f), null, null, j7, k5q0Var, null, null, 17424);
                        h83Var6.c(str26);
                        iul0Var = new iul0(eexVarG3, i4VarR2, yd90Var4, null, new yd90(j83VarC3, kng0.c(h83Var6.f12607a, h83Var6, smk0Var6, 0), lsm0Var3.a(R.string.dt_points, Arrays.copyOf(new Object[0], 0))));
                        iul0Var2 = iul0Var;
                        if (rpp0Var4 instanceof qpp0) {
                            if (rpp0Var4 instanceof ppp0) {
                                ppp0 ppp0Var10 = (ppp0) rpp0Var4;
                                return new xrr(uqrVarR6, b8k0.c0(ppp0Var10.e, ppp0Var10.g, list3), b8k0.c0(ppp0Var10.f, ppp0Var10.h, list2), j83VarH3, iul0Var2);
                            }
                            t9f.b();
                            return null;
                        }
                        qpp0 qpp0Var10 = (qpp0) rpp0Var4;
                        String str219 = qpp0Var10.g;
                        str3 = (String) CollectionsKt.firstOrNull(list3);
                        if (str3 == null) {
                            str3 = "";
                        }
                        c280 c280Var9 = new c280(vsm0.s(qpp0Var10.e, str3), R.drawable.ic_glyph_placeholder_player);
                        long j15 = qpp0Var10.e;
                        bap bapVar9 = bap.b;
                        jdp0 jdp0Var12 = new jdp0(str219, n6x.o0(c280Var9, j15, list, zBooleanValue, bapVar9), null);
                        String str2110 = qpp0Var10.h;
                        str4 = (String) CollectionsKt.firstOrNull(list2);
                        if (str4 == null) {
                            str4 = "";
                        }
                        return new xrr(uqrVarR6, jdp0Var12, new jdp0(str2110, n6x.o0(new c280(vsm0.s(qpp0Var10.f, str4), R.drawable.ic_glyph_placeholder_player), qpp0Var10.f, list, zBooleanValue, bapVar9), null), j83VarH3, iul0Var2);
                    }
                }
                return qrr.f29223a;
            }

            /* JADX WARN: Code duplicated, block: B:18:0x008a  */
            private final Object b(Object obj) {
                String strG;
                lz10 lz10Var;
                float f;
                fad dadVar;
                sad qadVar;
                j83 j83VarC;
                j83 j83VarC2;
                gna gnaVar = (gna) obj;
                if (gnaVar == null) {
                    return null;
                }
                if (!(gnaVar instanceof ena)) {
                    if (gnaVar instanceof fna) {
                        return null;
                    }
                    t9f.b();
                    return null;
                }
                ena enaVar = (ena) gnaVar;
                mca mcaVar = enaVar.f8084a;
                rjs rjsVar = this.b;
                jg30 jg30Var = (jg30) ((fee) rjsVar.H.getValue()).b();
                bg30 bg30Var = (bg30) ((fee) rjsVar.I.getValue()).c();
                pz10 pz10Var = bg30Var != null ? bg30Var.f2536a : null;
                ctf0 ctf0Var2 = rjsVar.f30611a;
                boolean z = enaVar.p;
                znq0 znq0Var = (znq0) ((fee) rjsVar.t.getValue()).c();
                boolean zBooleanValue = ((Boolean) ((fee) rjsVar.v.getValue()).c()).booleanValue();
                ctf0Var2.getClass();
                dja djaVar = dja.PENALTY;
                k5q0 k5q0Var = k5q0.b;
                if (jg30Var != null) {
                    dadVar = new ead(jg30Var);
                    f = 0.0f;
                    lz10Var = null;
                } else {
                    h83 h83Var = new h83();
                    if (znq0Var != null) {
                        rdj rdjVar = rdj.f30294a;
                        strG = rdj.g(znq0Var, efj.UNIVERSAL, Boolean.valueOf(z), false, 56);
                        if (strG == null) {
                            strG = "";
                        }
                    } else {
                        strG = "";
                    }
                    pz40 pz40Var = s6t0.f31722a;
                    long textPrimary = s6t0.b().f33626a.getTextPrimary();
                    h83 h83Var2 = new h83();
                    long j = y3d.g;
                    long j2 = daq0.c;
                    lz10Var = null;
                    f = 0.0f;
                    smk0 smk0Var = new smk0(textPrimary, j2, null, null, null, null, null, j2, new j56(0.0f), null, null, j, k5q0Var, null, null, 17424);
                    h83Var2.c(strG);
                    StringBuilder sb = h83Var2.f12607a;
                    h83Var2.a(smk0Var, 0, sb.length());
                    sb.length();
                    h83Var.b(h83Var2.h());
                    dadVar = new dad(h83Var.h());
                }
                d3h0 cl5Var = pz10Var;
                if (mcaVar instanceof pca) {
                    if (pz10Var == null) {
                        cl5Var = new cl5((byte) 28);
                    }
                    rpp0 rpp0Var = ((pca) mcaVar).f26749a;
                    String strB = rpp0Var.b();
                    String strD = rpp0Var.d();
                    boolean z2 = cl5Var instanceof lz10;
                    lz10 lz10Var2 = z2 ? (lz10) cl5Var : lz10Var;
                    String strT = lz10Var2 != null ? vzb.T(lz10Var2, zBooleanValue) : "0";
                    lz10 lz10Var3 = z2 ? (lz10) cl5Var : lz10Var;
                    qadVar = new pad(strB, strD, strT, lz10Var3 != null ? vzb.U(lz10Var3, zBooleanValue) : "0", cl5Var.j(), cl5Var.i());
                } else if (mcaVar instanceof tca) {
                    rpp0 rpp0Var2 = ((tca) mcaVar).f33711a;
                    String strB2 = rpp0Var2.b();
                    String strD2 = rpp0Var2.d();
                    h83 h83Var3 = new h83();
                    String strA = ctf0Var2.b.a(R.string.vs, Arrays.copyOf(new Object[0], 0));
                    long j3 = y3d.g;
                    long j4 = daq0.c;
                    pz40 pz40Var2 = s6t0.f31722a;
                    smk0 smk0Var2 = new smk0(s6t0.b().f33626a.getTextPrimary(), j4, null, null, null, null, null, j4, new j56(f), null, null, j3, k5q0Var, null, null, 17424);
                    h83Var3.c(strA);
                    qadVar = new rad(kng0.c(h83Var3.f12607a, h83Var3, smk0Var2, 0), strB2, strD2);
                } else if (mcaVar instanceof xca) {
                    rpp0 rpp0Var3 = ((xca) mcaVar).f40636a;
                    String strB3 = rpp0Var3.b();
                    String strD3 = rpp0Var3.d();
                    if (pz10Var != null) {
                        j83VarC2 = vzb.M(pz10Var);
                    } else {
                        h83 h83Var4 = new h83();
                        String strA2 = ctf0Var2.b.a(R.string.vs, Arrays.copyOf(new Object[0], 0));
                        long j5 = y3d.g;
                        long j6 = daq0.c;
                        pz40 pz40Var3 = s6t0.f31722a;
                        smk0 smk0Var3 = new smk0(s6t0.b().f33626a.getTextPrimary(), j6, null, null, null, null, null, j6, new j56(f), null, null, j5, k5q0Var, null, null, 17424);
                        h83Var4.c(strA2);
                        j83VarC2 = kng0.c(h83Var4.f12607a, h83Var4, smk0Var3, 0);
                    }
                    qadVar = new rad(j83VarC2, strB3, strD3);
                } else if (mcaVar instanceof gda) {
                    gda gdaVar = (gda) mcaVar;
                    String strB0 = CollectionsKt.b0(gdaVar.f11094a, Separators.SLASH, null, null, null, 62);
                    String strB1 = CollectionsKt.b0(gdaVar.b, Separators.SLASH, null, null, null, 62);
                    h83 h83Var5 = new h83();
                    String strA3 = ctf0Var2.b.a(R.string.vs, Arrays.copyOf(new Object[0], 0));
                    long j7 = y3d.g;
                    long j8 = daq0.c;
                    pz40 pz40Var4 = s6t0.f31722a;
                    smk0 smk0Var4 = new smk0(s6t0.b().f33626a.getTextPrimary(), j8, null, null, null, null, null, j8, new j56(f), null, null, j7, k5q0Var, null, null, 17424);
                    h83Var5.c(strA3);
                    qadVar = new rad(kng0.c(h83Var5.f12607a, h83Var5, smk0Var4, 0), strB0, strB1);
                } else if (mcaVar instanceof hda) {
                    hda hdaVar = (hda) mcaVar;
                    String strB4 = CollectionsKt.b0(hdaVar.f12861a, Separators.SLASH, null, null, null, 62);
                    String strB5 = CollectionsKt.b0(hdaVar.b, Separators.SLASH, null, null, null, 62);
                    if (pz10Var != null) {
                        j83VarC = vzb.M(pz10Var);
                    } else {
                        h83 h83Var6 = new h83();
                        String strA4 = ctf0Var2.b.a(R.string.vs, Arrays.copyOf(new Object[0], 0));
                        long j9 = y3d.g;
                        long j10 = daq0.c;
                        pz40 pz40Var5 = s6t0.f31722a;
                        smk0 smk0Var5 = new smk0(s6t0.b().f33626a.getTextPrimary(), j10, null, null, null, null, null, j10, new j56(f), null, null, j9, k5q0Var, null, null, 17424);
                        h83Var6.c(strA4);
                        j83VarC = kng0.c(h83Var6.f12607a, h83Var6, smk0Var5, 0);
                    }
                    qadVar = new rad(j83VarC, strB4, strB5);
                } else {
                    if (!(mcaVar instanceof ida)) {
                        t9f.b();
                        return lz10Var;
                    }
                    qadVar = new qad(((ida) mcaVar).e);
                }
                return new dax(dadVar, qadVar);
            }

            /* JADX WARN: Code duplicated, block: B:140:0x0381  */
            /* JADX WARN: Code duplicated, block: B:70:0x01a8  */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                kc50 kc50Var;
                p700 p700Var;
                ena enaVar;
                uia uiaVar;
                String strA;
                String strC;
                String strC2;
                zvl0 zvl0Var;
                yja yjaVar;
                qal0 qal0Var;
                Object b0k0Var;
                i49 g49Var;
                dxh0 dxh0Var;
                hna hnaVar;
                lmo lmoVar;
                byte b8 = b7;
                int i = 0;
                rjs rjsVar = this.b;
                switch (b8) {
                    case 0:
                        List list = (List) obj;
                        list.getClass();
                        boolean zBooleanValue = ((Boolean) ((fee) rjsVar.c.getValue()).c()).booleanValue();
                        boolean zBooleanValue2 = ((Boolean) ((fee) rjsVar.e.getValue()).c()).booleanValue();
                        boolean zBooleanValue3 = ((Boolean) ((fee) rjsVar.f.getValue()).c()).booleanValue();
                        tf50 tf50Var = (tf50) ((fee) rjsVar.d.getValue()).c();
                        tf50Var.getClass();
                        if (!list.contains(tf50Var)) {
                            tf50Var = tf50.f33851a;
                        }
                        boolean z = !zBooleanValue2;
                        kc50 kc50Var2 = new kc50(R.drawable.ic_glyph_rectangular_scoreboard, tf50Var == tf50.f33851a);
                        tf50 tf50Var2 = tf50.b;
                        kc50 kc50Var3 = list.contains(tf50Var2) ? new kc50(R.drawable.ic_glyph_rectangular_broadcast, tf50Var == tf50Var2) : null;
                        tf50 tf50Var3 = tf50.c;
                        if (list.contains(tf50Var3)) {
                            kc50Var = new kc50(R.drawable.ic_glyph_rectangular_statistic, tf50Var == tf50Var3);
                        } else {
                            kc50Var = null;
                        }
                        return new ojs(zBooleanValue, z, zBooleanValue, zBooleanValue3, new hjs(kc50Var2, kc50Var3, kc50Var, tf50Var));
                    case 1:
                        n0o0 n0o0Var = rjsVar.o;
                        gna gnaVar = (gna) obj;
                        if ((gnaVar instanceof ena ? (ena) gnaVar : null) == null || (p700Var = ((ena) gnaVar).l) == null) {
                            return null;
                        }
                        List list2 = p700Var.e;
                        List list3 = (List) ((fee) n0o0Var.getValue()).c();
                        ch00 ch00Var = ch00.LAST_GAMES;
                        boolean zContains = list3.contains(ch00Var);
                        List list4 = (List) ((fee) n0o0Var.getValue()).c();
                        ch00 ch00Var2 = ch00.LAST_GAMES_OPP_ONE;
                        boolean zContains2 = list4.contains(ch00Var2);
                        List list5 = (List) ((fee) n0o0Var.getValue()).c();
                        ch00 ch00Var3 = ch00.LAST_GAMES_OPP_TWO;
                        boolean zContains3 = list5.contains(ch00Var3);
                        ctf0 ctf0Var2 = rjsVar.f30611a;
                        ctf0Var2.getClass();
                        ArrayList arrayList = new ArrayList();
                        List list6 = p700Var.g;
                        List list7 = p700Var.f;
                        if (!list2.isEmpty()) {
                            arrayList.add(z1x.T(list2, ctf0Var2, ctf0Var2.b.a(R.string.previous_meetings, Arrays.copyOf(new Object[0], 0)), ch00Var, zContains));
                        }
                        if (!list7.isEmpty()) {
                            arrayList.add(z1x.T(list7, ctf0Var2, kng0.l(ctf0Var2.b.a(R.string.last_games, Arrays.copyOf(new Object[0], 0)), ": ", p700Var.c), ch00Var2, zContains2));
                        }
                        if (!list6.isEmpty()) {
                            arrayList.add(z1x.T(list6, ctf0Var2, kng0.l(ctf0Var2.b.a(R.string.last_games, Arrays.copyOf(new Object[0], 0)), ": ", p700Var.d), ch00Var3, zContains3));
                        }
                        return arrayList;
                    case 2:
                        gna gnaVar2 = (gna) obj;
                        if ((gnaVar2 instanceof ena ? (ena) gnaVar2 : null) == null || (uiaVar = (enaVar = (ena) gnaVar2).h) == null) {
                            return null;
                        }
                        ctf0 ctf0Var3 = rjsVar.f30611a;
                        boolean z2 = enaVar.p;
                        ctf0Var3.getClass();
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it = uiaVar.c.iterator();
                        int i2 = 0;
                        while (it.hasNext()) {
                            Object next = it.next();
                            int i3 = i2 + 1;
                            if (i2 < 0) {
                                q3d.p();
                                throw null;
                            }
                            bsw bswVar = (bsw) next;
                            String str = bswVar.b;
                            String str2 = bswVar.e;
                            String strA2 = (str.length() <= 0 || str2.length() <= 0) ? ctf0Var3.b.a(R.string.vs, Arrays.copyOf(new Object[0], 0)) : w6x.q(bswVar.b, " : ", str2);
                            odp0 odp0Var = new odp0(new d5a0(new c280(bswVar.c, R.drawable.ic_glyph_placeholder_player)));
                            String strM = dw9.m(i3, ". ", bswVar.f3153a);
                            odp0 odp0Var2 = new odp0(new d5a0(new c280(bswVar.f, R.drawable.ic_glyph_placeholder_player)));
                            String strM2 = dw9.m(i3, ". ", bswVar.d);
                            rdj rdjVar = rdj.f30294a;
                            arrayList2.add(new hzy(odp0Var, strM, odp0Var2, strM2, rdj.g(new znq0(bswVar.g), efj.UNIVERSAL, Boolean.valueOf(z2), false, 56), strA2, "", null, null));
                            it = it;
                            i2 = i3;
                        }
                        dja djaVar = dja.PENALTY;
                        return new eax(dyb.o0(arrayList2), uiaVar.f35722a, uiaVar.b);
                    case 3:
                        anq0 anq0Var2 = (anq0) obj;
                        if (anq0Var2 != null) {
                            boolean z3 = ((Boolean) ((fee) rjsVar.g.getValue()).c()).booleanValue() || ((Boolean) ((fee) rjsVar.h.getValue()).c()).booleanValue();
                            ctf0 ctf0Var4 = rjsVar.f30611a;
                            ctf0Var4.getClass();
                            long j = anq0Var2.e;
                            long j2 = anq0Var2.d;
                            boolean z4 = anq0Var2.j;
                            if (j != 0 || !z4) {
                                String str3 = anq0Var2.c;
                                if (z4) {
                                    if (str3.length() > 0) {
                                        strA = ctf0Var4.b.a(R.string.live_additional_min_v2, Arrays.copyOf(new Object[]{str3}, 1));
                                    } else if (anq0Var2.f1167a) {
                                        strA = "";
                                    } else {
                                        strA = anq0Var2.b ? ctf0Var4.b.a(R.string.line_live_time_period_back_v2, Arrays.copyOf(new Object[]{""}, 1)) : ctf0Var4.b.a(R.string.line_live_time_period_capitalized_v2, Arrays.copyOf(new Object[]{""}, 1));
                                    }
                                } else if (j2 < 0) {
                                    strA = ctf0Var4.b.a(R.string.game_started, Arrays.copyOf(new Object[0], 0));
                                } else {
                                    long j3 = j2 / 86400;
                                    strA = j3 > 0 ? ctf0Var4.b.a(R.string.line_time_before_v2, Arrays.copyOf(new Object[]{String.valueOf(j3)}, 1)) : ctf0Var4.b.a(R.string.before_start, Arrays.copyOf(new Object[0], 0));
                                }
                                String strC3 = (z3 || z4 || j2 < 0) ? null : n2x.C((((j2 < 0 ? 0L : j2) / 60) / 60) % 24);
                                if (z3) {
                                    strC = null;
                                } else {
                                    long jB = (z4 ? vzb.V(anq0Var2).b() : j2 < 0 ? 0L : j2) / 60;
                                    if (!z4) {
                                        jB %= 60;
                                    }
                                    strC = n2x.C(jB);
                                }
                                if (z3) {
                                    strC2 = null;
                                } else {
                                    strC2 = n2x.C((z4 ? vzb.V(anq0Var2).b() : j2 >= 0 ? j2 : 0L) % 60);
                                }
                                return new jg30(strA, strC3, strC, strC2);
                            }
                        }
                        return null;
                    case 4:
                        gna gnaVar3 = (gna) obj;
                        ena enaVar2 = gnaVar3 instanceof ena ? (ena) gnaVar3 : null;
                        if (enaVar2 == null || (zvl0Var = ((ena) gnaVar3).k) == null) {
                            return null;
                        }
                        String str4 = zvl0Var.m;
                        String str5 = enaVar2.q;
                        ctf0 ctf0Var5 = rjsVar.f30611a;
                        m1v0 m1v0Var = (m1v0) ((fee) rjsVar.J.getValue()).b();
                        str5.getClass();
                        ctf0Var5.getClass();
                        String str6 = zvl0Var.f45064a;
                        Pair pair = str4.length() > 0 ? new Pair(str4, ctf0Var5.b.a(R.string.web_site, Arrays.copyOf(new Object[0], 0))) : new Pair(null, null);
                        String str7 = (String) pair.f46059a;
                        String str8 = (String) pair.b;
                        dja djaVar2 = dja.PENALTY;
                        String str9 = zvl0Var.b;
                        ArrayList arrayList3 = new ArrayList();
                        String str10 = zvl0Var.l;
                        String str11 = zvl0Var.k;
                        String str12 = zvl0Var.j;
                        String str13 = zvl0Var.i;
                        String str14 = zvl0Var.h;
                        String str15 = zvl0Var.g;
                        String str16 = zvl0Var.f;
                        String str17 = zvl0Var.e;
                        String str18 = zvl0Var.d;
                        String str19 = zvl0Var.c;
                        if (str6.length() > 0) {
                            arrayList3.add(l7x.J(ctf0Var5, str6, R.string.address));
                        }
                        if (str19.length() > 0) {
                            arrayList3.add(l7x.J(ctf0Var5, str19, R.string.capacity));
                        }
                        if (str18.length() > 0) {
                            arrayList3.add(l7x.J(ctf0Var5, str18, R.string.covering));
                        }
                        if (str17.length() > 0) {
                            arrayList3.add(l7x.J(ctf0Var5, str17, R.string.city_name));
                        }
                        if (str16.length() > 0) {
                            arrayList3.add(l7x.J(ctf0Var5, str16, R.string.architect));
                        }
                        if (str15.length() > 0) {
                            arrayList3.add(l7x.J(ctf0Var5, str15, R.string.old_name));
                        }
                        if (str14.length() > 0) {
                            arrayList3.add(l7x.J(ctf0Var5, str14, R.string.category));
                        }
                        if (str13.length() > 0) {
                            arrayList3.add(l7x.J(ctf0Var5, str13, R.string.history));
                        }
                        if (str12.length() > 0) {
                            arrayList3.add(l7x.J(ctf0Var5, str12, R.string.opened));
                        }
                        if (str11.length() > 0) {
                            arrayList3.add(l7x.J(ctf0Var5, str11, R.string.zip_code));
                        }
                        if (str10.length() > 0) {
                            arrayList3.add(l7x.J(ctf0Var5, "\u2066" + str10 + "\u2069", R.string.phone));
                        }
                        a4x a4xVarO0 = dyb.o0(arrayList3);
                        List list8 = zvl0Var.n;
                        ArrayList arrayList4 = new ArrayList(r3d.q(list8, 10));
                        Iterator it2 = list8.iterator();
                        while (it2.hasNext()) {
                            arrayList4.add(String.format(Locale.ENGLISH, "%s/sfiles/stadium/%s", Arrays.copyOf(new Object[]{str5, (String) it2.next()}, 2)));
                        }
                        a4x a4xVarO1 = dyb.o0(arrayList4);
                        if (a4xVarO1.isEmpty()) {
                            a4xVarO1 = dyb.g0("");
                        }
                        return new iax(m1v0Var, str9, a4xVarO0, str7, str8, a4xVarO1);
                    case 5:
                        gna gnaVar4 = (gna) obj;
                        if ((gnaVar4 instanceof ena ? (ena) gnaVar4 : null) != null && (yjaVar = ((ena) gnaVar4).i) != null) {
                            List list9 = yjaVar.f42730a;
                            if (!list9.isEmpty()) {
                                long jLongValue = ((Number) ((fee) rjsVar.m.getValue()).c()).longValue();
                                lc00 lc00VarB = kotlin.collections.a.b();
                                Iterator it3 = list9.iterator();
                                while (it3.hasNext()) {
                                    he30 he30Var = (he30) it3.next();
                                    List list10 = he30Var.b;
                                    ArrayList arrayList5 = new ArrayList();
                                    for (Object obj2 : list10) {
                                        if (((ge30) obj2).e.length() > 0) {
                                            arrayList5.add(obj2);
                                        }
                                    }
                                    if (!arrayList5.isEmpty()) {
                                        lc00VarB.add(new uim(he30Var.f12902a));
                                        int i4 = i;
                                        for (Object obj3 : arrayList5) {
                                            int i5 = i4 + 1;
                                            if (i4 < 0) {
                                                q3d.p();
                                                throw null;
                                            }
                                            ge30 ge30Var = (ge30) obj3;
                                            String str20 = ge30Var.f11132a;
                                            String str21 = ge30Var.e;
                                            String str22 = ge30Var.c;
                                            String str23 = ge30Var.d;
                                            tho thoVar = ge30Var.b;
                                            Iterator it4 = it3;
                                            List listSplit$default = StringsKt__StringsKt.split$default(str20, new String[]{"+"}, false, i, 6, null);
                                            long j4 = jLongValue;
                                            List listSplit$default2 = StringsKt__StringsKt.split$default(str20, new String[]{Separators.COLON}, false, i, 6, null);
                                            if (j4 == 1) {
                                                if (listSplit$default.size() == 2 && listSplit$default2.size() == 1) {
                                                    str20 = listSplit$default.get(0) + "'+" + kotlin.text.c.r((String) listSplit$default.get(1), Separators.QUOTE, "", false);
                                                } else if (listSplit$default2.size() == 2) {
                                                    str20 = listSplit$default2.get(0) + Separators.QUOTE;
                                                }
                                            }
                                            y6n y6nVar = ge30Var.j == 0 ? y6n.f42107a : y6n.b;
                                            ggm ggmVar = i4 == 0 ? arrayList5.size() + (-1) == 0 ? ggm.c : ggm.f11256a : i4 == arrayList5.size() + (-1) ? ggm.b : ggm.d;
                                            lc00VarB.add((str23.length() == 0 && str22.length() == 0) ? new sim(str20, str21, thoVar.name(), y6nVar, ggmVar, ge30Var.b()) : new rim(str20, str21, new lnm(str23, str22, 0, "", new s0m("", ""), ge30Var.k), ge30Var.a() ? new lnm(ge30Var.h, ge30Var.g, 0, "", new s0m("", ""), ge30Var.l) : null, thoVar.name(), null, y6nVar, ggmVar, ge30Var.b()));
                                            it3 = it4;
                                            i4 = i5;
                                            jLongValue = j4;
                                            i = 0;
                                        }
                                    }
                                    it3 = it3;
                                    jLongValue = jLongValue;
                                    i = 0;
                                }
                                i4 i4VarR0 = dyb.r0(kotlin.collections.a.a(lc00VarB));
                                dja djaVar3 = dja.PENALTY;
                                return new gax(new sf30(i4VarR0));
                            }
                        }
                        return null;
                    case 6:
                        vzj0 vzj0Var = (vzj0) obj;
                        if (!(((fee) rjsVar.B.getValue()).b() instanceof qrr) && vzj0Var != null) {
                            anq0 anq0Var3 = (anq0) ((fee) rjsVar.H.getValue()).c();
                            ctf0 ctf0Var6 = rjsVar.f30611a;
                            ctf0Var6.getClass();
                            znq0 znq0Var = anq0Var3 != null ? anq0Var3.h : null;
                            if (znq0Var != null) {
                                long j5 = znq0Var.f44687a;
                                if (j5 <= 0) {
                                    qal0Var = null;
                                } else {
                                    long j6 = j5 / 86400;
                                    qal0Var = new qal0(j6 > 0 ? ctf0Var6.b.a(R.string.line_time_before_v2, Arrays.copyOf(new Object[]{String.valueOf(j6)}, 1)) : ctf0Var6.b.a(R.string.before_start, Arrays.copyOf(new Object[0], 0)), yyw.L((((j5 < 0 ? 0L : j5) / 60) / 60) % 24), yyw.L(((j5 < 0 ? 0L : j5) / 60) % 60), yyw.L((j5 >= 0 ? j5 : 0L) % 60));
                                }
                            } else {
                                qal0Var = null;
                            }
                            if (vzj0Var instanceof tzj0) {
                                tzj0 tzj0Var = (tzj0) vzj0Var;
                                b0k0Var = new yzj0(tzj0Var.f34807a, tzj0Var.b, tzj0Var.c, tzj0Var.d, qal0Var);
                            } else if (vzj0Var instanceof uzj0) {
                                uzj0 uzj0Var = (uzj0) vzj0Var;
                                b0k0Var = new b0k0(uzj0Var.f36538a, uzj0Var.b, uzj0Var.c, uzj0Var.d, qal0Var);
                            } else {
                                t9f.b();
                            }
                            return b0k0Var;
                        }
                        return null;
                    case 7:
                        boolean zBooleanValue4 = ((Boolean) obj).booleanValue();
                        long jLongValue2 = ((Number) ((fee) rjsVar.j.getValue()).c()).longValue();
                        boolean zBooleanValue5 = ((Boolean) ((fee) rjsVar.i.getValue()).c()).booleanValue();
                        long jLongValue3 = ((Number) ((fee) rjsVar.k.getValue()).c()).longValue();
                        long jLongValue4 = ((Number) ((fee) rjsVar.m.getValue()).c()).longValue();
                        Long l = (Long) ((fee) rjsVar.l.getValue()).c();
                        long jLongValue5 = l != null ? l.longValue() : -1L;
                        if (zBooleanValue4) {
                            return new sym0(new MarketsCategoriesParams(jLongValue2, jLongValue3, jLongValue4, new zq2(), "", zBooleanValue5));
                        }
                        tef0 tef0Var = tef0.f33818a;
                        xuz xuzVar = pb10.c;
                        return new vym0(new RelatedParams(zBooleanValue5, jLongValue2, jLongValue4, -1L, jLongValue5, tef0Var));
                    case 8:
                        return a(obj);
                    case 9:
                        fsr fsrVar = (fsr) obj;
                        if ((fsrVar == null || !fsrVar.b) && (fsrVar == null || !fsrVar.c)) {
                            return k49.f17656a;
                        }
                        o49 o49Var = (o49) ((fee) rjsVar.y.getValue()).c();
                        ctf0 ctf0Var7 = rjsVar.f30611a;
                        zvh0 zvh0Var2 = rjsVar.b;
                        fsrVar.getClass();
                        ctf0Var7.getClass();
                        ArrayList arrayList6 = new ArrayList();
                        if (fsrVar.b) {
                            arrayList6.add(new g49(ctf0Var7.b.a(R.string.video, Arrays.copyOf(new Object[0], 0))));
                        }
                        if (fsrVar.c) {
                            arrayList6.add(new h49(ctf0Var7.b.a(R.string.play_zone, Arrays.copyOf(new Object[0], 0))));
                        }
                        if (o49Var == null) {
                            g49Var = (i49) CollectionsKt.U(arrayList6);
                        } else {
                            int iOrdinal = o49Var.ordinal();
                            if (iOrdinal == 0) {
                                g49Var = new g49(ctf0Var7.b.a(R.string.video, Arrays.copyOf(new Object[0], 0)));
                            } else {
                                if (iOrdinal != 1) {
                                    t9f.b();
                                    return null;
                                }
                                g49Var = new h49(ctf0Var7.b.a(R.string.play_zone, Arrays.copyOf(new Object[0], 0)));
                            }
                            if (arrayList6.isEmpty()) {
                                g49Var = null;
                            } else {
                                Iterator it5 = arrayList6.iterator();
                                do {
                                    if (!it5.hasNext()) {
                                        g49Var = null;
                                    }
                                } while (!Intrinsics.d((i49) it5.next(), g49Var));
                            }
                            if (g49Var == null) {
                                g49Var = (i49) CollectionsKt.U(arrayList6);
                            }
                        }
                        bfu0 bfu0Var = fsrVar.f10077a;
                        GameBroadcastingParams gameBroadcastingParams = new GameBroadcastingParams(bfu0Var.f2522a, bfu0Var.c, bfu0Var.f, bfu0Var.b, bfu0Var.e, bfu0Var.d, bfu0Var.g, null);
                        Iterator it6 = arrayList6.iterator();
                        int i6 = 0;
                        while (true) {
                            if (!it6.hasNext()) {
                                i6 = -1;
                            } else if (!Intrinsics.d((i49) it6.next(), g49Var)) {
                                i6++;
                            }
                        }
                        int i7 = i6;
                        i4 i4VarR1 = dyb.r0(arrayList6);
                        boolean z5 = arrayList6.size() > 1;
                        int iOrdinal2 = zvh0Var2.ordinal();
                        if (iOrdinal2 == 0) {
                            dxh0Var = axh0.f1625a;
                        } else if (iOrdinal2 == 1) {
                            dxh0Var = zwh0.f45106a;
                        } else if (iOrdinal2 == 2) {
                            dxh0Var = cxh0.f5122a;
                        } else {
                            if (iOrdinal2 != 3) {
                                t9f.b();
                                return null;
                            }
                            dxh0Var = bxh0.f3376a;
                        }
                        dxh0 dxh0Var2 = dxh0Var;
                        ArrayList arrayList7 = new ArrayList(r3d.q(arrayList6, 10));
                        Iterator it7 = arrayList6.iterator();
                        while (it7.hasNext()) {
                            arrayList7.add(new yvh0(((i49) it7.next()).getDescription(), bwh0.f3325a));
                        }
                        return new j49(gameBroadcastingParams, i7, g49Var, i4VarR1, z5, dxh0Var2, dyb.r0(arrayList7));
                    case 10:
                        return b(obj);
                    default:
                        gna gnaVar5 = (gna) obj;
                        if ((gnaVar5 instanceof ena ? (ena) gnaVar5 : null) == null || (hnaVar = ((ena) gnaVar5).j) == null) {
                            return null;
                        }
                        boolean zContains4 = ((List) ((fee) rjsVar.o.getValue()).c()).contains(ch00.SHORT_STATISTIC);
                        ctf0 ctf0Var8 = rjsVar.f30611a;
                        ctf0Var8.getClass();
                        List<vrj0> list11 = hnaVar.f;
                        ArrayList arrayList8 = new ArrayList(r3d.q(list11, 10));
                        for (vrj0 vrj0Var : list11) {
                            float fS = r7x.s(vrj0Var.b);
                            float fS2 = r7x.s(vrj0Var.c);
                            String str24 = vrj0Var.f37902a;
                            String str25 = vrj0Var.b;
                            String str26 = vrj0Var.c;
                            if (fS == 0.0f && fS2 == 0.0f) {
                                fS = 0.0f;
                            }
                            arrayList8.add(new srj0(fS, (fS == 0.0f && fS2 == 0.0f) ? 0.0f : fS2, str24, str25, str26));
                        }
                        dja djaVar4 = dja.PENALTY;
                        ch00 ch00Var4 = ch00.SHORT_STATISTIC;
                        i4 i4VarR2 = zContains4 ? dyb.r0(arrayList8) : dyb.r0(CollectionsKt.D0(arrayList8, 3));
                        if (arrayList8.size() - 1 > 3) {
                            lsm0 lsm0Var = ctf0Var8.b;
                            lmoVar = new lmo(lsm0Var.a(R.string.expand, Arrays.copyOf(new Object[0], 0)), lsm0Var.a(R.string.collapse, Arrays.copyOf(new Object[0], 0)), zContains4);
                        } else {
                            lmoVar = null;
                        }
                        return new hax(i4VarR2, lmoVar);
                }
            }
        });
        final byte b8 = 2;
        this.G = bkb.G(a().d, new Function1(this) { // from class: a.qjs
            public final /* synthetic */ rjs b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:260:0x08d4  */
            /* JADX WARN: Code duplicated, block: B:262:0x08e4  */
            /* JADX WARN: Code duplicated, block: B:265:0x090f  */
            /* JADX WARN: Code duplicated, block: B:268:0x0932  */
            /* JADX WARN: Code duplicated, block: B:270:0x0936  */
            /* JADX WARN: Code duplicated, block: B:272:0x094e  */
            private final Object a(Object obj) {
                n0o0 n0o0Var;
                n0o0 n0o0Var2;
                String str;
                String str2;
                mqr kqrVar;
                String strG;
                d3h0 pekVar;
                String strN;
                d3h0 xakVar;
                Integer num;
                String strN2;
                int i;
                iul0 iul0Var;
                yd90 yd90Var;
                yd90 yd90Var2;
                iul0 iul0Var2;
                String str3;
                String str4;
                d3h0 bekVar;
                String strA;
                String strB;
                String strN3;
                rjs rjsVar = this.b;
                n0o0 n0o0Var3 = rjsVar.v;
                n0o0 n0o0Var4 = rjsVar.m;
                n0o0 n0o0Var5 = rjsVar.H;
                n0o0 n0o0Var6 = rjsVar.I;
                ctf0 ctf0Var2 = rjsVar.f30611a;
                gna gnaVar = (gna) obj;
                if (gnaVar != null) {
                    if (!(gnaVar instanceof ena)) {
                        if (gnaVar instanceof fna) {
                            ctf0Var2.getClass();
                            return new orr(d9x.L(((fna) gnaVar).f9825a, ctf0Var2));
                        }
                        t9f.b();
                        return null;
                    }
                    ena enaVar = (ena) gnaVar;
                    mca mcaVar = enaVar.f8084a;
                    List list = (List) ((fee) rjsVar.n.getValue()).c();
                    boolean zBooleanValue = ((Boolean) ((fee) rjsVar.e.getValue()).c()).booleanValue();
                    mpm mpmVar = (mpm) ((fee) n0o0Var6.getValue()).b();
                    boolean z = enaVar.p;
                    String str5 = (String) ((fee) rjsVar.p.getValue()).c();
                    String str6 = (String) ((fee) rjsVar.q.getValue()).c();
                    String str7 = (String) ((fee) rjsVar.r.getValue()).c();
                    String str8 = (String) ((fee) rjsVar.s.getValue()).c();
                    jg30 jg30Var = (jg30) ((fee) n0o0Var5.getValue()).b();
                    bg30 bg30Var = (bg30) ((fee) n0o0Var6.getValue()).c();
                    znq0 znq0Var = (znq0) ((fee) rjsVar.t.getValue()).c();
                    bha bhaVar = enaVar.o;
                    ui9 ui9Var = (ui9) ((fee) rjsVar.u.getValue()).c();
                    long jLongValue = ((Number) ((fee) n0o0Var4.getValue()).c()).longValue();
                    boolean zBooleanValue2 = ((Boolean) ((fee) n0o0Var3.getValue()).c()).booleanValue();
                    ctf0Var2.getClass();
                    if (ui9Var != null) {
                        int i2 = ui9Var.c;
                        int i3 = ui9Var.d;
                        n0o0Var = n0o0Var4;
                        String strN4 = (cy7.c() && zBooleanValue2) ? w6x.n(i3, i2, " : ") : w6x.n(i2, i3, " : ");
                        String strX = j0x.x(jLongValue, ctf0Var2);
                        ArrayList arrayList = ui9Var.f35720a;
                        n0o0Var2 = n0o0Var5;
                        str = str5;
                        str2 = str6;
                        ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
                        int i4 = 0;
                        for (Object obj2 : arrayList) {
                            int i5 = i4 + 1;
                            if (i4 < 0) {
                                q3d.p();
                                throw null;
                            }
                            arrayList2.add(piz.W((sc90) obj2, jLongValue, i4));
                            i4 = i5;
                        }
                        i4 i4VarR0 = dyb.r0(arrayList2);
                        ArrayList arrayList3 = ui9Var.b;
                        ArrayList arrayList4 = new ArrayList(r3d.q(arrayList3, 10));
                        int i6 = 0;
                        for (Object obj3 : arrayList3) {
                            int i7 = i6 + 1;
                            if (i6 < 0) {
                                q3d.p();
                                throw null;
                            }
                            arrayList4.add(piz.W((sc90) obj3, jLongValue, i6));
                            i6 = i7;
                        }
                        kqrVar = new iqr(strN4, strX, i4VarR0, dyb.r0(arrayList4));
                    } else {
                        n0o0Var = n0o0Var4;
                        n0o0Var2 = n0o0Var5;
                        str = str5;
                        str2 = str6;
                        if (bhaVar != null) {
                            float f = bhaVar.d;
                            float f2 = bhaVar.e;
                            float f3 = bhaVar.f;
                            Object[] objArr = {Float.valueOf(f3)};
                            lsm0 lsm0Var = ctf0Var2.b;
                            String strA2 = lsm0Var.a(R.string.n_percents, Arrays.copyOf(objArr, 1));
                            k3w0 g3w0Var = (f3 <= f2 || f3 <= f) ? new g3w0(strA2) : new i3w0(strA2);
                            String strA3 = lsm0Var.a(R.string.n_percents, Arrays.copyOf(new Object[]{Float.valueOf(f2)}, 1));
                            k3w0 g3w0Var2 = (f2 <= f3 || f2 <= f) ? new g3w0(strA3) : new i3w0(strA3);
                            String strA4 = lsm0Var.a(R.string.n_percents, Arrays.copyOf(new Object[]{Float.valueOf(f)}, 1));
                            kqrVar = new kqr(g3w0Var, g3w0Var2, (f <= f3 || f <= f2) ? new g3w0(strA4) : new i3w0(strA4));
                        } else {
                            kqrVar = null;
                        }
                    }
                    anq0 anq0Var2 = (anq0) ((fee) n0o0Var2.getValue()).c();
                    boolean z2 = anq0Var2 != null ? anq0Var2.f1167a : false;
                    long jLongValue2 = ((Number) ((fee) n0o0Var.getValue()).c()).longValue();
                    boolean zBooleanValue3 = ((Boolean) ((fee) n0o0Var3.getValue()).c()).booleanValue();
                    list.getClass();
                    mpmVar.getClass();
                    String strA5 = "";
                    if (mcaVar instanceof pca) {
                        pca pcaVar = (pca) mcaVar;
                        uqr uqrVarR0 = pzb.r0(mcaVar, str, str2, str7, str8, jg30Var);
                        if (bg30Var == null || (bekVar = bg30Var.b) == null) {
                            bekVar = bg30Var != null ? bg30Var.f2536a : new bek();
                        }
                        d3h0 d3h0Var = bekVar;
                        boolean z3 = d3h0Var instanceof lz10;
                        lz10 lz10Var = z3 ? (lz10) d3h0Var : null;
                        if (lz10Var != null) {
                            strA = vzb.T(lz10Var, zBooleanValue3);
                        } else {
                            hzm0 hzm0Var = d3h0Var instanceof hzm0 ? (hzm0) d3h0Var : null;
                            if (hzm0Var != null) {
                                String str9 = hzm0Var.g;
                                String str10 = hzm0Var.i;
                                StringBuilder sb = new StringBuilder("\u2066");
                                if (cy7.c() && zBooleanValue3) {
                                    if (str10 != null) {
                                        hne.B(sb, "(ov ", str10, Separators.RPAREN);
                                    }
                                    sb.append(vzb.i0(str9));
                                } else {
                                    sb.append(str9);
                                    if (str10 != null) {
                                        hne.B(sb, Separators.LPAREN, str10, " ov)");
                                    }
                                }
                                sb.append("\u2069");
                                strA = sb.toString();
                            } else {
                                strA = d3h0Var.a();
                            }
                        }
                        String str11 = strA;
                        lz10 lz10Var2 = z3 ? (lz10) d3h0Var : null;
                        if (lz10Var2 != null) {
                            strB = vzb.U(lz10Var2, zBooleanValue3);
                        } else {
                            hzm0 hzm0Var2 = d3h0Var instanceof hzm0 ? (hzm0) d3h0Var : null;
                            if (hzm0Var2 != null) {
                                String str12 = hzm0Var2.h;
                                String str13 = hzm0Var2.j;
                                StringBuilder sb2 = new StringBuilder("\u2066");
                                if (cy7.c() && zBooleanValue3) {
                                    if (str13 != null) {
                                        hne.B(sb2, "(ov ", str13, Separators.RPAREN);
                                    }
                                    sb2.append(vzb.i0(str12));
                                } else {
                                    sb2.append(str12);
                                    if (str13 != null) {
                                        hne.B(sb2, Separators.LPAREN, str13, " ov)");
                                    }
                                }
                                sb2.append("\u2069");
                                strB = sb2.toString();
                            } else {
                                strB = d3h0Var.b();
                            }
                        }
                        String str14 = strB;
                        boolean z4 = pcaVar.d;
                        rpp0 rpp0Var = pcaVar.f26749a;
                        j83 j83VarH = vzb.H(ctf0Var2, d3h0Var, pcaVar.e, pcaVar.f, pcaVar.g, (bg30Var == null || (strN3 = bg30Var.f2536a.n()) == null) ? "" : strN3, z4, zBooleanValue3);
                        String strB2 = rpp0Var.b();
                        c280 c280Var = new c280(vsm0.s(rpp0Var.a(), pcaVar.b), R.drawable.ic_glyph_placeholder_player);
                        long jA = rpp0Var.a();
                        bap bapVar = bap.b;
                        jdp0 jdp0Var = new jdp0(strB2, n6x.o0(c280Var, jA, list, zBooleanValue, bapVar), null);
                        jdp0 jdp0Var2 = new jdp0(rpp0Var.d(), n6x.o0(new c280(vsm0.s(rpp0Var.c(), pcaVar.c), R.drawable.ic_glyph_placeholder_player), rpp0Var.c(), list, zBooleanValue, bapVar), null);
                        lz10 lz10Var3 = z3 ? (lz10) d3h0Var : null;
                        return new mrr(uqrVarR0, jdp0Var, jdp0Var2, j83VarH, lz10Var3 != null ? vzb.G(lz10Var3.i) : eex.c, str11, d3h0Var.j(), str14, d3h0Var.i());
                    }
                    boolean z5 = z2;
                    String str15 = str;
                    String str16 = str2;
                    boolean z6 = mcaVar instanceof tca;
                    qpm qpmVar = qpm.f29126a;
                    if (z6) {
                        tca tcaVar = (tca) mcaVar;
                        uqr uqrVarR1 = pzb.r0(mcaVar, str15, str16, str7, str8, jg30Var);
                        znq0 znq0Var2 = new znq0(znq0Var != null ? znq0Var.f44687a : 0L);
                        rpp0 rpp0Var2 = tcaVar.f33711a;
                        boolean z7 = tcaVar.i;
                        if (rpp0Var2 instanceof qpp0) {
                            qpp0 qpp0Var = (qpp0) rpp0Var2;
                            jdp0 jdp0Var3 = new jdp0(qpp0Var.g, n6x.o0(u1c.C(tcaVar, true), qpp0Var.e, list, zBooleanValue || z7, bap.b), null);
                            jdp0 jdp0Var4 = new jdp0(qpp0Var.h, n6x.o0(u1c.C(tcaVar, false), qpp0Var.f, list, zBooleanValue || z7, bap.f2271a), null);
                            lpm lpmVar = new lpm(qpmVar, new hpm(0L, 3));
                            dpi0 dpi0Var = new dpi0((byte) 15);
                            rdj rdjVar = rdj.f30294a;
                            vzb.E(dpi0Var, rdj.g(znq0Var2, efj.UNIVERSAL, Boolean.valueOf(z), false, 56));
                            return new trr(uqrVarR1, jdp0Var3, jdp0Var4, lpmVar, ((h83) dpi0Var.f6468a).h(), kqrVar);
                        }
                        if (!(rpp0Var2 instanceof ppp0)) {
                            t9f.b();
                            return null;
                        }
                        ppp0 ppp0Var = (ppp0) rpp0Var2;
                        xcp0 xcp0VarC0 = b8k0.c0(ppp0Var.e, ppp0Var.g, tcaVar.b);
                        xcp0 xcp0VarC1 = b8k0.c0(ppp0Var.f, ppp0Var.h, tcaVar.c);
                        lpm lpmVar2 = new lpm(qpmVar, new hpm(0L, 3));
                        dpi0 dpi0Var2 = new dpi0((byte) 15);
                        rdj rdjVar2 = rdj.f30294a;
                        vzb.E(dpi0Var2, rdj.g(znq0Var2, efj.UNIVERSAL, Boolean.valueOf(z), false, 56));
                        return new trr(uqrVarR1, xcp0VarC0, xcp0VarC1, lpmVar2, ((h83) dpi0Var2.f6468a).h(), kqrVar);
                    }
                    if (!(mcaVar instanceof xca)) {
                        if (mcaVar instanceof gda) {
                            gda gdaVar = (gda) mcaVar;
                            uqr uqrVarR2 = pzb.r0(mcaVar, str15, str16, str7, str8, jg30Var);
                            znq0 znq0Var3 = new znq0(znq0Var != null ? znq0Var.f44687a : 0L);
                            String strB0 = CollectionsKt.b0(gdaVar.f11094a, Separators.SLASH, null, null, null, 62);
                            String strB1 = CollectionsKt.b0(gdaVar.b, Separators.SLASH, null, null, null, 62);
                            lpm lpmVar3 = new lpm(qpmVar, new hpm(0L, 3));
                            dpi0 dpi0Var3 = new dpi0((byte) 15);
                            rdj rdjVar3 = rdj.f30294a;
                            vzb.E(dpi0Var3, rdj.g(znq0Var3, efj.UNIVERSAL, Boolean.valueOf(z), false, 56));
                            return new rrr(uqrVarR2, strB0, strB1, lpmVar3, ((h83) dpi0Var3.f6468a).h());
                        }
                        if (mcaVar instanceof hda) {
                            hda hdaVar = (hda) mcaVar;
                            uqr uqrVarR3 = pzb.r0(mcaVar, str15, str16, str7, str8, jg30Var);
                            if (bg30Var == null || (pekVar = bg30Var.b) == null) {
                                pekVar = bg30Var != null ? bg30Var.f2536a : new pek();
                            }
                            return new rrr(uqrVarR3, CollectionsKt.b0(hdaVar.f12861a, Separators.SLASH, null, null, null, 62), CollectionsKt.b0(hdaVar.b, Separators.SLASH, null, null, null, 62), mpmVar, vzb.H(ctf0Var2, pekVar, hdaVar.h, hdaVar.i, hdaVar.j, (bg30Var == null || (strN = bg30Var.f2536a.n()) == null) ? "" : strN, hdaVar.g, zBooleanValue3));
                        }
                        if (!(mcaVar instanceof ida)) {
                            t9f.b();
                            return null;
                        }
                        ida idaVar = (ida) mcaVar;
                        uqr uqrVarR4 = pzb.r0(mcaVar, str15, str16, str7, str8, jg30Var);
                        if (!idaVar.g) {
                            if (znq0Var != null) {
                                rdj rdjVar4 = rdj.f30294a;
                                strG = rdj.g(znq0Var, efj.UNIVERSAL, Boolean.valueOf(z), false, 56);
                                if (strG == null) {
                                }
                            }
                            dpi0 dpi0Var11 = new dpi0((byte) 15);
                            vzb.E(dpi0Var11, strG);
                            return new vrr(uqrVarR4, idaVar.e, ((h83) dpi0Var11.f6468a).h());
                        }
                        strA5 = ctf0Var2.b.a(R.string.game_end, Arrays.copyOf(new Object[0], 0));
                        strG = strA5;
                        dpi0 dpi0Var12 = new dpi0((byte) 15);
                        vzb.E(dpi0Var12, strG);
                        return new vrr(uqrVarR4, idaVar.e, ((h83) dpi0Var12.f6468a).h());
                    }
                    if (!gql0.d().contains(Long.valueOf(jLongValue2))) {
                        xca xcaVar = (xca) mcaVar;
                        uqr uqrVarR5 = pzb.r0(mcaVar, str15, str16, str7, str8, jg30Var);
                        if (bg30Var == null || (xakVar = bg30Var.b) == null) {
                            xakVar = bg30Var != null ? bg30Var.f2536a : new xak((byte) 22);
                        }
                        boolean z8 = xcaVar.l;
                        boolean z9 = xcaVar.q;
                        rpp0 rpp0Var3 = xcaVar.f40636a;
                        j83 j83VarH2 = vzb.H(ctf0Var2, xakVar, xcaVar.n, xcaVar.o, xcaVar.p, (bg30Var == null || (strN2 = bg30Var.f2536a.n()) == null) ? "" : strN2, z8, zBooleanValue3);
                        if (!(rpp0Var3 instanceof qpp0)) {
                            if (rpp0Var3 instanceof ppp0) {
                                ppp0 ppp0Var2 = (ppp0) rpp0Var3;
                                return new trr(uqrVarR5, b8k0.c0(ppp0Var2.e, ppp0Var2.g, xcaVar.h), b8k0.c0(ppp0Var2.f, ppp0Var2.h, xcaVar.i), mpmVar, j83VarH2, kqrVar);
                            }
                            t9f.b();
                            return null;
                        }
                        int i8 = xcaVar.b;
                        int i9 = xcaVar.g;
                        int i10 = xcaVar.f;
                        int i11 = xcaVar.d;
                        int i12 = xcaVar.c;
                        vy vyVar = (i8 == 0 && i12 == 0 && i11 == 0) ? null : new vy(i8 > 0 ? Integer.valueOf(i8) : null, i12 > 0 ? Integer.valueOf(i12) : null, i11 > 0 ? Integer.valueOf(i11) : null);
                        int i13 = xcaVar.e;
                        vy vyVar2 = (i13 == 0 && i10 == 0 && i9 == 0) ? null : new vy(i13 > 0 ? Integer.valueOf(i13) : null, i10 > 0 ? Integer.valueOf(i10) : null, i9 > 0 ? Integer.valueOf(i9) : null);
                        boolean z10 = (vyVar == null && vyVar2 == null) ? false : true;
                        if (z10 && vyVar == null) {
                            num = null;
                            vyVar = new vy(null, null, null);
                        } else {
                            num = null;
                        }
                        if (z10 && vyVar2 == null) {
                            vyVar2 = new vy(num, num, num);
                        }
                        qpp0 qpp0Var2 = (qpp0) rpp0Var3;
                        return new trr(uqrVarR5, new jdp0(qpp0Var2.g, n6x.o0(u1c.D(xcaVar, true), qpp0Var2.e, list, zBooleanValue || z9, bap.b), vyVar), new jdp0(qpp0Var2.h, n6x.o0(u1c.D(xcaVar, false), qpp0Var2.f, list, zBooleanValue || z9, bap.f2271a), vyVar2), mpmVar, j83VarH2, kqrVar);
                    }
                    xca xcaVar2 = (xca) mcaVar;
                    long j = znq0Var != null ? znq0Var.f44687a : 0L;
                    uqr uqrVarR6 = pzb.r0(mcaVar, str15, str16, str7, str8, jg30Var);
                    znq0 znq0Var4 = new znq0(j);
                    pz10 pz10Var = bg30Var != null ? bg30Var.f2536a : null;
                    if (pz10Var instanceof nz10) {
                        izm0 izm0Var = bg30Var.b;
                        String str17 = xcaVar2.s;
                        List list2 = xcaVar2.i;
                        List list3 = xcaVar2.h;
                        rpp0 rpp0Var4 = xcaVar2.f40636a;
                        boolean z11 = xcaVar2.l;
                        String str18 = xcaVar2.p;
                        rdj rdjVar5 = rdj.f30294a;
                        pz10 pz10Var2 = pz10Var;
                        String strG2 = rdj.g(znq0Var4, efj.UNIVERSAL, Boolean.valueOf(z), false, 56);
                        str18.getClass();
                        strG2.getClass();
                        dpi0 dpi0Var13 = new dpi0((byte) 15);
                        if (str17 != null) {
                            vzb.E(dpi0Var13, str17);
                            vzb.E(dpi0Var13, ": ");
                            boolean z12 = cy7.c() && zBooleanValue3;
                            if (izm0Var == null) {
                                vzb.E(dpi0Var13, "0");
                                vzb.C(dpi0Var13);
                                vzb.E(dpi0Var13, "0");
                            } else {
                                if (!(izm0Var instanceof gzm0) && !(izm0Var instanceof hzm0)) {
                                    t9f.b();
                                    return null;
                                }
                                boolean z13 = izm0Var instanceof hzm0;
                                String strA6 = z13 ? ((hzm0) izm0Var).g : izm0Var.a();
                                String strB3 = z13 ? ((hzm0) izm0Var).h : izm0Var.b();
                                vzb.E(dpi0Var13, "\u2066");
                                if (z12) {
                                    vzb.D(dpi0Var13, strB3, vzb.L(izm0Var.i()));
                                    vzb.C(dpi0Var13);
                                    vzb.D(dpi0Var13, strA6, vzb.L(izm0Var.j()));
                                } else {
                                    vzb.D(dpi0Var13, strA6, vzb.L(izm0Var.j()));
                                    vzb.C(dpi0Var13);
                                    vzb.D(dpi0Var13, strB3, vzb.L(izm0Var.i()));
                                }
                                vzb.E(dpi0Var13, "\u2069");
                            }
                        } else {
                            vzb.E(dpi0Var13, strG2);
                            if (str18.length() > 0) {
                                vzb.A(dpi0Var13);
                                vzb.E(dpi0Var13, str18);
                            }
                            if (z11) {
                                vzb.A(dpi0Var13);
                                i = 0;
                                vzb.E(dpi0Var13, ctf0Var2.b.a(R.string.game_end, Arrays.copyOf(new Object[0], 0)));
                            } else {
                                i = 0;
                            }
                            if (z5) {
                                vzb.A(dpi0Var13);
                                vzb.E(dpi0Var13, ctf0Var2.b.a(R.string.card_cricket_break, Arrays.copyOf(new Object[i], i)));
                            }
                        }
                        j83 j83VarH3 = ((h83) dpi0Var13.f6468a).h();
                        nz10 nz10Var = (nz10) pz10Var2;
                        boolean z14 = nz10Var instanceof mz10;
                        k5q0 k5q0Var = k5q0.b;
                        if (!z14) {
                            if (nz10Var instanceof oz10) {
                                oz10 oz10Var = (oz10) nz10Var;
                                String str19 = oz10Var.i;
                                String str20 = oz10Var.g;
                                String str21 = oz10Var.m;
                                String str22 = oz10Var.k;
                                boolean z15 = ((StringsKt.W(str22) || str22.equals("0")) && (StringsKt.W(str21) || str21.equals("0"))) ? false : true;
                                boolean z16 = str20.length() > 0 || str19.length() > 0;
                                eex eexVarG = vzb.G(oz10Var.o);
                                ArrayList arrayList5 = oz10Var.f;
                                ArrayList arrayList6 = new ArrayList(r3d.q(arrayList5, 10));
                                Iterator it = arrayList5.iterator();
                                while (it.hasNext()) {
                                    te90 te90Var = (te90) it.next();
                                    arrayList6.add(new yd90(vzb.O(te90Var), vzb.Q(te90Var), te90Var.f33809a));
                                    it = it;
                                    z15 = z15;
                                }
                                boolean z17 = z15;
                                i4 i4VarR1 = dyb.r0(arrayList6);
                                j83 j83VarN = vzb.N(nz10Var);
                                j83 j83VarP = vzb.P(nz10Var);
                                lsm0 lsm0Var2 = ctf0Var2.b;
                                yd90 yd90Var3 = new yd90(j83VarN, j83VarP, lsm0Var2.a(R.string.total_count, Arrays.copyOf(new Object[0], 0)));
                                if (z17) {
                                    h83 h83Var = new h83();
                                    long j2 = y3d.g;
                                    long j3 = daq0.c;
                                    smk0 smk0Var = new smk0(vzb.L(oz10Var.l), j3, null, null, null, null, null, j3, new j56(0.0f), null, null, j2, k5q0Var, null, null, 17424);
                                    h83Var.c(str22);
                                    j83 j83VarC = kng0.c(h83Var.f12607a, h83Var, smk0Var, 0);
                                    h83 h83Var2 = new h83();
                                    smk0 smk0Var2 = new smk0(vzb.L(oz10Var.n), j3, null, null, null, null, null, j3, new j56(0.0f), null, null, j2, k5q0Var, null, null, 17424);
                                    h83Var2.c(str21);
                                    yd90Var = new yd90(j83VarC, kng0.c(h83Var2.f12607a, h83Var2, smk0Var2, 0), lsm0Var2.a(R.string.dt_points, Arrays.copyOf(new Object[0], 0)));
                                } else {
                                    yd90Var = null;
                                }
                                if (z16) {
                                    h83 h83Var3 = new h83();
                                    long j4 = y3d.g;
                                    long j5 = daq0.c;
                                    smk0 smk0Var3 = new smk0(vzb.L(oz10Var.h), j5, null, null, null, null, null, j5, new j56(0.0f), null, null, j4, k5q0Var, null, null, 17424);
                                    h83Var3.c(str20);
                                    j83 j83VarC2 = kng0.c(h83Var3.f12607a, h83Var3, smk0Var3, 0);
                                    h83 h83Var4 = new h83();
                                    smk0 smk0Var4 = new smk0(vzb.L(oz10Var.j), j5, null, null, null, null, null, j5, new j56(0.0f), null, null, j4, k5q0Var, null, null, 17424);
                                    h83Var4.c(str19);
                                    yd90Var2 = new yd90(j83VarC2, kng0.c(h83Var4.f12607a, h83Var4, smk0Var4, 0), lsm0Var2.a(R.string.tennis_game_column, Arrays.copyOf(new Object[0], 0)));
                                } else {
                                    yd90Var2 = null;
                                }
                                iul0Var2 = new iul0(eexVarG, i4VarR1, yd90Var3, yd90Var2, yd90Var);
                            } else {
                                if (!(nz10Var instanceof kz10)) {
                                    t9f.b();
                                    return null;
                                }
                                kz10 kz10Var = (kz10) nz10Var;
                                eex eexVarG2 = vzb.G(kz10Var.g);
                                ArrayList<te90> arrayList7 = kz10Var.f;
                                ArrayList arrayList8 = new ArrayList(r3d.q(arrayList7, 10));
                                for (te90 te90Var2 : arrayList7) {
                                    arrayList8.add(new yd90(vzb.O(te90Var2), vzb.Q(te90Var2), te90Var2.f33809a));
                                }
                                iul0Var = new iul0(eexVarG2, dyb.r0(arrayList8), new yd90(vzb.N(nz10Var), vzb.P(nz10Var), ctf0Var2.b.a(R.string.total_count, Arrays.copyOf(new Object[0], 0))), null, null);
                            }
                            if (rpp0Var4 instanceof qpp0) {
                                if (rpp0Var4 instanceof ppp0) {
                                    ppp0 ppp0Var10 = (ppp0) rpp0Var4;
                                    return new xrr(uqrVarR6, b8k0.c0(ppp0Var10.e, ppp0Var10.g, list3), b8k0.c0(ppp0Var10.f, ppp0Var10.h, list2), j83VarH3, iul0Var2);
                                }
                                t9f.b();
                                return null;
                            }
                            qpp0 qpp0Var10 = (qpp0) rpp0Var4;
                            String str219 = qpp0Var10.g;
                            str3 = (String) CollectionsKt.firstOrNull(list3);
                            if (str3 == null) {
                                str3 = "";
                            }
                            c280 c280Var9 = new c280(vsm0.s(qpp0Var10.e, str3), R.drawable.ic_glyph_placeholder_player);
                            long j15 = qpp0Var10.e;
                            bap bapVar9 = bap.b;
                            jdp0 jdp0Var12 = new jdp0(str219, n6x.o0(c280Var9, j15, list, zBooleanValue, bapVar9), null);
                            String str2110 = qpp0Var10.h;
                            str4 = (String) CollectionsKt.firstOrNull(list2);
                            if (str4 == null) {
                                str4 = "";
                            }
                            return new xrr(uqrVarR6, jdp0Var12, new jdp0(str2110, n6x.o0(new c280(vsm0.s(qpp0Var10.f, str4), R.drawable.ic_glyph_placeholder_player), qpp0Var10.f, list, zBooleanValue, bapVar9), null), j83VarH3, iul0Var2);
                        }
                        mz10 mz10Var = (mz10) nz10Var;
                        eex eexVarG3 = vzb.G(mz10Var.g);
                        ArrayList<te90> arrayList9 = mz10Var.f;
                        ArrayList arrayList10 = new ArrayList(r3d.q(arrayList9, 10));
                        for (te90 te90Var3 : arrayList9) {
                            arrayList10.add(new yd90(vzb.O(te90Var3), vzb.Q(te90Var3), te90Var3.f33809a));
                        }
                        i4 i4VarR2 = dyb.r0(arrayList10);
                        j83 j83VarN2 = vzb.N(nz10Var);
                        j83 j83VarP2 = vzb.P(nz10Var);
                        lsm0 lsm0Var3 = ctf0Var2.b;
                        yd90 yd90Var4 = new yd90(j83VarN2, j83VarP2, lsm0Var3.a(R.string.total_count, Arrays.copyOf(new Object[0], 0)));
                        h83 h83Var5 = new h83();
                        String str25 = mz10Var.h;
                        long j7 = y3d.g;
                        long j8 = daq0.c;
                        smk0 smk0Var5 = new smk0(vzb.L(mz10Var.i), j8, null, null, null, null, null, j8, new j56(0.0f), null, null, j7, k5q0Var, null, null, 17424);
                        h83Var5.c(str25);
                        j83 j83VarC3 = kng0.c(h83Var5.f12607a, h83Var5, smk0Var5, 0);
                        h83 h83Var6 = new h83();
                        String str26 = mz10Var.j;
                        smk0 smk0Var6 = new smk0(vzb.L(mz10Var.k), j8, null, null, null, null, null, j8, new j56(0.0f), null, null, j7, k5q0Var, null, null, 17424);
                        h83Var6.c(str26);
                        iul0Var = new iul0(eexVarG3, i4VarR2, yd90Var4, null, new yd90(j83VarC3, kng0.c(h83Var6.f12607a, h83Var6, smk0Var6, 0), lsm0Var3.a(R.string.dt_points, Arrays.copyOf(new Object[0], 0))));
                        iul0Var2 = iul0Var;
                        if (rpp0Var4 instanceof qpp0) {
                            if (rpp0Var4 instanceof ppp0) {
                                ppp0 ppp0Var11 = (ppp0) rpp0Var4;
                                return new xrr(uqrVarR6, b8k0.c0(ppp0Var11.e, ppp0Var11.g, list3), b8k0.c0(ppp0Var11.f, ppp0Var11.h, list2), j83VarH3, iul0Var2);
                            }
                            t9f.b();
                            return null;
                        }
                        qpp0 qpp0Var11 = (qpp0) rpp0Var4;
                        String str2111 = qpp0Var11.g;
                        str3 = (String) CollectionsKt.firstOrNull(list3);
                        if (str3 == null) {
                            str3 = "";
                        }
                        c280 c280Var10 = new c280(vsm0.s(qpp0Var11.e, str3), R.drawable.ic_glyph_placeholder_player);
                        long j16 = qpp0Var11.e;
                        bap bapVar10 = bap.b;
                        jdp0 jdp0Var13 = new jdp0(str2111, n6x.o0(c280Var10, j16, list, zBooleanValue, bapVar10), null);
                        String str2112 = qpp0Var11.h;
                        str4 = (String) CollectionsKt.firstOrNull(list2);
                        if (str4 == null) {
                            str4 = "";
                        }
                        return new xrr(uqrVarR6, jdp0Var13, new jdp0(str2112, n6x.o0(new c280(vsm0.s(qpp0Var11.f, str4), R.drawable.ic_glyph_placeholder_player), qpp0Var11.f, list, zBooleanValue, bapVar10), null), j83VarH3, iul0Var2);
                    }
                }
                return qrr.f29223a;
            }

            /* JADX WARN: Code duplicated, block: B:18:0x008a  */
            private final Object b(Object obj) {
                String strG;
                lz10 lz10Var;
                float f;
                fad dadVar;
                sad qadVar;
                j83 j83VarC;
                j83 j83VarC2;
                gna gnaVar = (gna) obj;
                if (gnaVar == null) {
                    return null;
                }
                if (!(gnaVar instanceof ena)) {
                    if (gnaVar instanceof fna) {
                        return null;
                    }
                    t9f.b();
                    return null;
                }
                ena enaVar = (ena) gnaVar;
                mca mcaVar = enaVar.f8084a;
                rjs rjsVar = this.b;
                jg30 jg30Var = (jg30) ((fee) rjsVar.H.getValue()).b();
                bg30 bg30Var = (bg30) ((fee) rjsVar.I.getValue()).c();
                pz10 pz10Var = bg30Var != null ? bg30Var.f2536a : null;
                ctf0 ctf0Var2 = rjsVar.f30611a;
                boolean z = enaVar.p;
                znq0 znq0Var = (znq0) ((fee) rjsVar.t.getValue()).c();
                boolean zBooleanValue = ((Boolean) ((fee) rjsVar.v.getValue()).c()).booleanValue();
                ctf0Var2.getClass();
                dja djaVar = dja.PENALTY;
                k5q0 k5q0Var = k5q0.b;
                if (jg30Var != null) {
                    dadVar = new ead(jg30Var);
                    f = 0.0f;
                    lz10Var = null;
                } else {
                    h83 h83Var = new h83();
                    if (znq0Var != null) {
                        rdj rdjVar = rdj.f30294a;
                        strG = rdj.g(znq0Var, efj.UNIVERSAL, Boolean.valueOf(z), false, 56);
                        if (strG == null) {
                            strG = "";
                        }
                    } else {
                        strG = "";
                    }
                    pz40 pz40Var = s6t0.f31722a;
                    long textPrimary = s6t0.b().f33626a.getTextPrimary();
                    h83 h83Var2 = new h83();
                    long j = y3d.g;
                    long j2 = daq0.c;
                    lz10Var = null;
                    f = 0.0f;
                    smk0 smk0Var = new smk0(textPrimary, j2, null, null, null, null, null, j2, new j56(0.0f), null, null, j, k5q0Var, null, null, 17424);
                    h83Var2.c(strG);
                    StringBuilder sb = h83Var2.f12607a;
                    h83Var2.a(smk0Var, 0, sb.length());
                    sb.length();
                    h83Var.b(h83Var2.h());
                    dadVar = new dad(h83Var.h());
                }
                d3h0 cl5Var = pz10Var;
                if (mcaVar instanceof pca) {
                    if (pz10Var == null) {
                        cl5Var = new cl5((byte) 28);
                    }
                    rpp0 rpp0Var = ((pca) mcaVar).f26749a;
                    String strB = rpp0Var.b();
                    String strD = rpp0Var.d();
                    boolean z2 = cl5Var instanceof lz10;
                    lz10 lz10Var2 = z2 ? (lz10) cl5Var : lz10Var;
                    String strT = lz10Var2 != null ? vzb.T(lz10Var2, zBooleanValue) : "0";
                    lz10 lz10Var3 = z2 ? (lz10) cl5Var : lz10Var;
                    qadVar = new pad(strB, strD, strT, lz10Var3 != null ? vzb.U(lz10Var3, zBooleanValue) : "0", cl5Var.j(), cl5Var.i());
                } else if (mcaVar instanceof tca) {
                    rpp0 rpp0Var2 = ((tca) mcaVar).f33711a;
                    String strB2 = rpp0Var2.b();
                    String strD2 = rpp0Var2.d();
                    h83 h83Var3 = new h83();
                    String strA = ctf0Var2.b.a(R.string.vs, Arrays.copyOf(new Object[0], 0));
                    long j3 = y3d.g;
                    long j4 = daq0.c;
                    pz40 pz40Var2 = s6t0.f31722a;
                    smk0 smk0Var2 = new smk0(s6t0.b().f33626a.getTextPrimary(), j4, null, null, null, null, null, j4, new j56(f), null, null, j3, k5q0Var, null, null, 17424);
                    h83Var3.c(strA);
                    qadVar = new rad(kng0.c(h83Var3.f12607a, h83Var3, smk0Var2, 0), strB2, strD2);
                } else if (mcaVar instanceof xca) {
                    rpp0 rpp0Var3 = ((xca) mcaVar).f40636a;
                    String strB3 = rpp0Var3.b();
                    String strD3 = rpp0Var3.d();
                    if (pz10Var != null) {
                        j83VarC2 = vzb.M(pz10Var);
                    } else {
                        h83 h83Var4 = new h83();
                        String strA2 = ctf0Var2.b.a(R.string.vs, Arrays.copyOf(new Object[0], 0));
                        long j5 = y3d.g;
                        long j6 = daq0.c;
                        pz40 pz40Var3 = s6t0.f31722a;
                        smk0 smk0Var3 = new smk0(s6t0.b().f33626a.getTextPrimary(), j6, null, null, null, null, null, j6, new j56(f), null, null, j5, k5q0Var, null, null, 17424);
                        h83Var4.c(strA2);
                        j83VarC2 = kng0.c(h83Var4.f12607a, h83Var4, smk0Var3, 0);
                    }
                    qadVar = new rad(j83VarC2, strB3, strD3);
                } else if (mcaVar instanceof gda) {
                    gda gdaVar = (gda) mcaVar;
                    String strB0 = CollectionsKt.b0(gdaVar.f11094a, Separators.SLASH, null, null, null, 62);
                    String strB1 = CollectionsKt.b0(gdaVar.b, Separators.SLASH, null, null, null, 62);
                    h83 h83Var5 = new h83();
                    String strA3 = ctf0Var2.b.a(R.string.vs, Arrays.copyOf(new Object[0], 0));
                    long j7 = y3d.g;
                    long j8 = daq0.c;
                    pz40 pz40Var4 = s6t0.f31722a;
                    smk0 smk0Var4 = new smk0(s6t0.b().f33626a.getTextPrimary(), j8, null, null, null, null, null, j8, new j56(f), null, null, j7, k5q0Var, null, null, 17424);
                    h83Var5.c(strA3);
                    qadVar = new rad(kng0.c(h83Var5.f12607a, h83Var5, smk0Var4, 0), strB0, strB1);
                } else if (mcaVar instanceof hda) {
                    hda hdaVar = (hda) mcaVar;
                    String strB4 = CollectionsKt.b0(hdaVar.f12861a, Separators.SLASH, null, null, null, 62);
                    String strB5 = CollectionsKt.b0(hdaVar.b, Separators.SLASH, null, null, null, 62);
                    if (pz10Var != null) {
                        j83VarC = vzb.M(pz10Var);
                    } else {
                        h83 h83Var6 = new h83();
                        String strA4 = ctf0Var2.b.a(R.string.vs, Arrays.copyOf(new Object[0], 0));
                        long j9 = y3d.g;
                        long j10 = daq0.c;
                        pz40 pz40Var5 = s6t0.f31722a;
                        smk0 smk0Var5 = new smk0(s6t0.b().f33626a.getTextPrimary(), j10, null, null, null, null, null, j10, new j56(f), null, null, j9, k5q0Var, null, null, 17424);
                        h83Var6.c(strA4);
                        j83VarC = kng0.c(h83Var6.f12607a, h83Var6, smk0Var5, 0);
                    }
                    qadVar = new rad(j83VarC, strB4, strB5);
                } else {
                    if (!(mcaVar instanceof ida)) {
                        t9f.b();
                        return lz10Var;
                    }
                    qadVar = new qad(((ida) mcaVar).e);
                }
                return new dax(dadVar, qadVar);
            }

            /* JADX WARN: Code duplicated, block: B:140:0x0381  */
            /* JADX WARN: Code duplicated, block: B:70:0x01a8  */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                kc50 kc50Var;
                p700 p700Var;
                ena enaVar;
                uia uiaVar;
                String strA;
                String strC;
                String strC2;
                zvl0 zvl0Var;
                yja yjaVar;
                qal0 qal0Var;
                Object b0k0Var;
                i49 g49Var;
                dxh0 dxh0Var;
                hna hnaVar;
                lmo lmoVar;
                byte b9 = b8;
                int i = 0;
                rjs rjsVar = this.b;
                switch (b9) {
                    case 0:
                        List list = (List) obj;
                        list.getClass();
                        boolean zBooleanValue = ((Boolean) ((fee) rjsVar.c.getValue()).c()).booleanValue();
                        boolean zBooleanValue2 = ((Boolean) ((fee) rjsVar.e.getValue()).c()).booleanValue();
                        boolean zBooleanValue3 = ((Boolean) ((fee) rjsVar.f.getValue()).c()).booleanValue();
                        tf50 tf50Var = (tf50) ((fee) rjsVar.d.getValue()).c();
                        tf50Var.getClass();
                        if (!list.contains(tf50Var)) {
                            tf50Var = tf50.f33851a;
                        }
                        boolean z = !zBooleanValue2;
                        kc50 kc50Var2 = new kc50(R.drawable.ic_glyph_rectangular_scoreboard, tf50Var == tf50.f33851a);
                        tf50 tf50Var2 = tf50.b;
                        kc50 kc50Var3 = list.contains(tf50Var2) ? new kc50(R.drawable.ic_glyph_rectangular_broadcast, tf50Var == tf50Var2) : null;
                        tf50 tf50Var3 = tf50.c;
                        if (list.contains(tf50Var3)) {
                            kc50Var = new kc50(R.drawable.ic_glyph_rectangular_statistic, tf50Var == tf50Var3);
                        } else {
                            kc50Var = null;
                        }
                        return new ojs(zBooleanValue, z, zBooleanValue, zBooleanValue3, new hjs(kc50Var2, kc50Var3, kc50Var, tf50Var));
                    case 1:
                        n0o0 n0o0Var = rjsVar.o;
                        gna gnaVar = (gna) obj;
                        if ((gnaVar instanceof ena ? (ena) gnaVar : null) == null || (p700Var = ((ena) gnaVar).l) == null) {
                            return null;
                        }
                        List list2 = p700Var.e;
                        List list3 = (List) ((fee) n0o0Var.getValue()).c();
                        ch00 ch00Var = ch00.LAST_GAMES;
                        boolean zContains = list3.contains(ch00Var);
                        List list4 = (List) ((fee) n0o0Var.getValue()).c();
                        ch00 ch00Var2 = ch00.LAST_GAMES_OPP_ONE;
                        boolean zContains2 = list4.contains(ch00Var2);
                        List list5 = (List) ((fee) n0o0Var.getValue()).c();
                        ch00 ch00Var3 = ch00.LAST_GAMES_OPP_TWO;
                        boolean zContains3 = list5.contains(ch00Var3);
                        ctf0 ctf0Var2 = rjsVar.f30611a;
                        ctf0Var2.getClass();
                        ArrayList arrayList = new ArrayList();
                        List list6 = p700Var.g;
                        List list7 = p700Var.f;
                        if (!list2.isEmpty()) {
                            arrayList.add(z1x.T(list2, ctf0Var2, ctf0Var2.b.a(R.string.previous_meetings, Arrays.copyOf(new Object[0], 0)), ch00Var, zContains));
                        }
                        if (!list7.isEmpty()) {
                            arrayList.add(z1x.T(list7, ctf0Var2, kng0.l(ctf0Var2.b.a(R.string.last_games, Arrays.copyOf(new Object[0], 0)), ": ", p700Var.c), ch00Var2, zContains2));
                        }
                        if (!list6.isEmpty()) {
                            arrayList.add(z1x.T(list6, ctf0Var2, kng0.l(ctf0Var2.b.a(R.string.last_games, Arrays.copyOf(new Object[0], 0)), ": ", p700Var.d), ch00Var3, zContains3));
                        }
                        return arrayList;
                    case 2:
                        gna gnaVar2 = (gna) obj;
                        if ((gnaVar2 instanceof ena ? (ena) gnaVar2 : null) == null || (uiaVar = (enaVar = (ena) gnaVar2).h) == null) {
                            return null;
                        }
                        ctf0 ctf0Var3 = rjsVar.f30611a;
                        boolean z2 = enaVar.p;
                        ctf0Var3.getClass();
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it = uiaVar.c.iterator();
                        int i2 = 0;
                        while (it.hasNext()) {
                            Object next = it.next();
                            int i3 = i2 + 1;
                            if (i2 < 0) {
                                q3d.p();
                                throw null;
                            }
                            bsw bswVar = (bsw) next;
                            String str = bswVar.b;
                            String str2 = bswVar.e;
                            String strA2 = (str.length() <= 0 || str2.length() <= 0) ? ctf0Var3.b.a(R.string.vs, Arrays.copyOf(new Object[0], 0)) : w6x.q(bswVar.b, " : ", str2);
                            odp0 odp0Var = new odp0(new d5a0(new c280(bswVar.c, R.drawable.ic_glyph_placeholder_player)));
                            String strM = dw9.m(i3, ". ", bswVar.f3153a);
                            odp0 odp0Var2 = new odp0(new d5a0(new c280(bswVar.f, R.drawable.ic_glyph_placeholder_player)));
                            String strM2 = dw9.m(i3, ". ", bswVar.d);
                            rdj rdjVar = rdj.f30294a;
                            arrayList2.add(new hzy(odp0Var, strM, odp0Var2, strM2, rdj.g(new znq0(bswVar.g), efj.UNIVERSAL, Boolean.valueOf(z2), false, 56), strA2, "", null, null));
                            it = it;
                            i2 = i3;
                        }
                        dja djaVar = dja.PENALTY;
                        return new eax(dyb.o0(arrayList2), uiaVar.f35722a, uiaVar.b);
                    case 3:
                        anq0 anq0Var2 = (anq0) obj;
                        if (anq0Var2 != null) {
                            boolean z3 = ((Boolean) ((fee) rjsVar.g.getValue()).c()).booleanValue() || ((Boolean) ((fee) rjsVar.h.getValue()).c()).booleanValue();
                            ctf0 ctf0Var4 = rjsVar.f30611a;
                            ctf0Var4.getClass();
                            long j = anq0Var2.e;
                            long j2 = anq0Var2.d;
                            boolean z4 = anq0Var2.j;
                            if (j != 0 || !z4) {
                                String str3 = anq0Var2.c;
                                if (z4) {
                                    if (str3.length() > 0) {
                                        strA = ctf0Var4.b.a(R.string.live_additional_min_v2, Arrays.copyOf(new Object[]{str3}, 1));
                                    } else if (anq0Var2.f1167a) {
                                        strA = "";
                                    } else {
                                        strA = anq0Var2.b ? ctf0Var4.b.a(R.string.line_live_time_period_back_v2, Arrays.copyOf(new Object[]{""}, 1)) : ctf0Var4.b.a(R.string.line_live_time_period_capitalized_v2, Arrays.copyOf(new Object[]{""}, 1));
                                    }
                                } else if (j2 < 0) {
                                    strA = ctf0Var4.b.a(R.string.game_started, Arrays.copyOf(new Object[0], 0));
                                } else {
                                    long j3 = j2 / 86400;
                                    strA = j3 > 0 ? ctf0Var4.b.a(R.string.line_time_before_v2, Arrays.copyOf(new Object[]{String.valueOf(j3)}, 1)) : ctf0Var4.b.a(R.string.before_start, Arrays.copyOf(new Object[0], 0));
                                }
                                String strC3 = (z3 || z4 || j2 < 0) ? null : n2x.C((((j2 < 0 ? 0L : j2) / 60) / 60) % 24);
                                if (z3) {
                                    strC = null;
                                } else {
                                    long jB = (z4 ? vzb.V(anq0Var2).b() : j2 < 0 ? 0L : j2) / 60;
                                    if (!z4) {
                                        jB %= 60;
                                    }
                                    strC = n2x.C(jB);
                                }
                                if (z3) {
                                    strC2 = null;
                                } else {
                                    strC2 = n2x.C((z4 ? vzb.V(anq0Var2).b() : j2 >= 0 ? j2 : 0L) % 60);
                                }
                                return new jg30(strA, strC3, strC, strC2);
                            }
                        }
                        return null;
                    case 4:
                        gna gnaVar3 = (gna) obj;
                        ena enaVar2 = gnaVar3 instanceof ena ? (ena) gnaVar3 : null;
                        if (enaVar2 == null || (zvl0Var = ((ena) gnaVar3).k) == null) {
                            return null;
                        }
                        String str4 = zvl0Var.m;
                        String str5 = enaVar2.q;
                        ctf0 ctf0Var5 = rjsVar.f30611a;
                        m1v0 m1v0Var = (m1v0) ((fee) rjsVar.J.getValue()).b();
                        str5.getClass();
                        ctf0Var5.getClass();
                        String str6 = zvl0Var.f45064a;
                        Pair pair = str4.length() > 0 ? new Pair(str4, ctf0Var5.b.a(R.string.web_site, Arrays.copyOf(new Object[0], 0))) : new Pair(null, null);
                        String str7 = (String) pair.f46059a;
                        String str8 = (String) pair.b;
                        dja djaVar2 = dja.PENALTY;
                        String str9 = zvl0Var.b;
                        ArrayList arrayList3 = new ArrayList();
                        String str10 = zvl0Var.l;
                        String str11 = zvl0Var.k;
                        String str12 = zvl0Var.j;
                        String str13 = zvl0Var.i;
                        String str14 = zvl0Var.h;
                        String str15 = zvl0Var.g;
                        String str16 = zvl0Var.f;
                        String str17 = zvl0Var.e;
                        String str18 = zvl0Var.d;
                        String str19 = zvl0Var.c;
                        if (str6.length() > 0) {
                            arrayList3.add(l7x.J(ctf0Var5, str6, R.string.address));
                        }
                        if (str19.length() > 0) {
                            arrayList3.add(l7x.J(ctf0Var5, str19, R.string.capacity));
                        }
                        if (str18.length() > 0) {
                            arrayList3.add(l7x.J(ctf0Var5, str18, R.string.covering));
                        }
                        if (str17.length() > 0) {
                            arrayList3.add(l7x.J(ctf0Var5, str17, R.string.city_name));
                        }
                        if (str16.length() > 0) {
                            arrayList3.add(l7x.J(ctf0Var5, str16, R.string.architect));
                        }
                        if (str15.length() > 0) {
                            arrayList3.add(l7x.J(ctf0Var5, str15, R.string.old_name));
                        }
                        if (str14.length() > 0) {
                            arrayList3.add(l7x.J(ctf0Var5, str14, R.string.category));
                        }
                        if (str13.length() > 0) {
                            arrayList3.add(l7x.J(ctf0Var5, str13, R.string.history));
                        }
                        if (str12.length() > 0) {
                            arrayList3.add(l7x.J(ctf0Var5, str12, R.string.opened));
                        }
                        if (str11.length() > 0) {
                            arrayList3.add(l7x.J(ctf0Var5, str11, R.string.zip_code));
                        }
                        if (str10.length() > 0) {
                            arrayList3.add(l7x.J(ctf0Var5, "\u2066" + str10 + "\u2069", R.string.phone));
                        }
                        a4x a4xVarO0 = dyb.o0(arrayList3);
                        List list8 = zvl0Var.n;
                        ArrayList arrayList4 = new ArrayList(r3d.q(list8, 10));
                        Iterator it2 = list8.iterator();
                        while (it2.hasNext()) {
                            arrayList4.add(String.format(Locale.ENGLISH, "%s/sfiles/stadium/%s", Arrays.copyOf(new Object[]{str5, (String) it2.next()}, 2)));
                        }
                        a4x a4xVarO1 = dyb.o0(arrayList4);
                        if (a4xVarO1.isEmpty()) {
                            a4xVarO1 = dyb.g0("");
                        }
                        return new iax(m1v0Var, str9, a4xVarO0, str7, str8, a4xVarO1);
                    case 5:
                        gna gnaVar4 = (gna) obj;
                        if ((gnaVar4 instanceof ena ? (ena) gnaVar4 : null) != null && (yjaVar = ((ena) gnaVar4).i) != null) {
                            List list9 = yjaVar.f42730a;
                            if (!list9.isEmpty()) {
                                long jLongValue = ((Number) ((fee) rjsVar.m.getValue()).c()).longValue();
                                lc00 lc00VarB = kotlin.collections.a.b();
                                Iterator it3 = list9.iterator();
                                while (it3.hasNext()) {
                                    he30 he30Var = (he30) it3.next();
                                    List list10 = he30Var.b;
                                    ArrayList arrayList5 = new ArrayList();
                                    for (Object obj2 : list10) {
                                        if (((ge30) obj2).e.length() > 0) {
                                            arrayList5.add(obj2);
                                        }
                                    }
                                    if (!arrayList5.isEmpty()) {
                                        lc00VarB.add(new uim(he30Var.f12902a));
                                        int i4 = i;
                                        for (Object obj3 : arrayList5) {
                                            int i5 = i4 + 1;
                                            if (i4 < 0) {
                                                q3d.p();
                                                throw null;
                                            }
                                            ge30 ge30Var = (ge30) obj3;
                                            String str20 = ge30Var.f11132a;
                                            String str21 = ge30Var.e;
                                            String str22 = ge30Var.c;
                                            String str23 = ge30Var.d;
                                            tho thoVar = ge30Var.b;
                                            Iterator it4 = it3;
                                            List listSplit$default = StringsKt__StringsKt.split$default(str20, new String[]{"+"}, false, i, 6, null);
                                            long j4 = jLongValue;
                                            List listSplit$default2 = StringsKt__StringsKt.split$default(str20, new String[]{Separators.COLON}, false, i, 6, null);
                                            if (j4 == 1) {
                                                if (listSplit$default.size() == 2 && listSplit$default2.size() == 1) {
                                                    str20 = listSplit$default.get(0) + "'+" + kotlin.text.c.r((String) listSplit$default.get(1), Separators.QUOTE, "", false);
                                                } else if (listSplit$default2.size() == 2) {
                                                    str20 = listSplit$default2.get(0) + Separators.QUOTE;
                                                }
                                            }
                                            y6n y6nVar = ge30Var.j == 0 ? y6n.f42107a : y6n.b;
                                            ggm ggmVar = i4 == 0 ? arrayList5.size() + (-1) == 0 ? ggm.c : ggm.f11256a : i4 == arrayList5.size() + (-1) ? ggm.b : ggm.d;
                                            lc00VarB.add((str23.length() == 0 && str22.length() == 0) ? new sim(str20, str21, thoVar.name(), y6nVar, ggmVar, ge30Var.b()) : new rim(str20, str21, new lnm(str23, str22, 0, "", new s0m("", ""), ge30Var.k), ge30Var.a() ? new lnm(ge30Var.h, ge30Var.g, 0, "", new s0m("", ""), ge30Var.l) : null, thoVar.name(), null, y6nVar, ggmVar, ge30Var.b()));
                                            it3 = it4;
                                            i4 = i5;
                                            jLongValue = j4;
                                            i = 0;
                                        }
                                    }
                                    it3 = it3;
                                    jLongValue = jLongValue;
                                    i = 0;
                                }
                                i4 i4VarR0 = dyb.r0(kotlin.collections.a.a(lc00VarB));
                                dja djaVar3 = dja.PENALTY;
                                return new gax(new sf30(i4VarR0));
                            }
                        }
                        return null;
                    case 6:
                        vzj0 vzj0Var = (vzj0) obj;
                        if (!(((fee) rjsVar.B.getValue()).b() instanceof qrr) && vzj0Var != null) {
                            anq0 anq0Var3 = (anq0) ((fee) rjsVar.H.getValue()).c();
                            ctf0 ctf0Var6 = rjsVar.f30611a;
                            ctf0Var6.getClass();
                            znq0 znq0Var = anq0Var3 != null ? anq0Var3.h : null;
                            if (znq0Var != null) {
                                long j5 = znq0Var.f44687a;
                                if (j5 <= 0) {
                                    qal0Var = null;
                                } else {
                                    long j6 = j5 / 86400;
                                    qal0Var = new qal0(j6 > 0 ? ctf0Var6.b.a(R.string.line_time_before_v2, Arrays.copyOf(new Object[]{String.valueOf(j6)}, 1)) : ctf0Var6.b.a(R.string.before_start, Arrays.copyOf(new Object[0], 0)), yyw.L((((j5 < 0 ? 0L : j5) / 60) / 60) % 24), yyw.L(((j5 < 0 ? 0L : j5) / 60) % 60), yyw.L((j5 >= 0 ? j5 : 0L) % 60));
                                }
                            } else {
                                qal0Var = null;
                            }
                            if (vzj0Var instanceof tzj0) {
                                tzj0 tzj0Var = (tzj0) vzj0Var;
                                b0k0Var = new yzj0(tzj0Var.f34807a, tzj0Var.b, tzj0Var.c, tzj0Var.d, qal0Var);
                            } else if (vzj0Var instanceof uzj0) {
                                uzj0 uzj0Var = (uzj0) vzj0Var;
                                b0k0Var = new b0k0(uzj0Var.f36538a, uzj0Var.b, uzj0Var.c, uzj0Var.d, qal0Var);
                            } else {
                                t9f.b();
                            }
                            return b0k0Var;
                        }
                        return null;
                    case 7:
                        boolean zBooleanValue4 = ((Boolean) obj).booleanValue();
                        long jLongValue2 = ((Number) ((fee) rjsVar.j.getValue()).c()).longValue();
                        boolean zBooleanValue5 = ((Boolean) ((fee) rjsVar.i.getValue()).c()).booleanValue();
                        long jLongValue3 = ((Number) ((fee) rjsVar.k.getValue()).c()).longValue();
                        long jLongValue4 = ((Number) ((fee) rjsVar.m.getValue()).c()).longValue();
                        Long l = (Long) ((fee) rjsVar.l.getValue()).c();
                        long jLongValue5 = l != null ? l.longValue() : -1L;
                        if (zBooleanValue4) {
                            return new sym0(new MarketsCategoriesParams(jLongValue2, jLongValue3, jLongValue4, new zq2(), "", zBooleanValue5));
                        }
                        tef0 tef0Var = tef0.f33818a;
                        xuz xuzVar = pb10.c;
                        return new vym0(new RelatedParams(zBooleanValue5, jLongValue2, jLongValue4, -1L, jLongValue5, tef0Var));
                    case 8:
                        return a(obj);
                    case 9:
                        fsr fsrVar = (fsr) obj;
                        if ((fsrVar == null || !fsrVar.b) && (fsrVar == null || !fsrVar.c)) {
                            return k49.f17656a;
                        }
                        o49 o49Var = (o49) ((fee) rjsVar.y.getValue()).c();
                        ctf0 ctf0Var7 = rjsVar.f30611a;
                        zvh0 zvh0Var2 = rjsVar.b;
                        fsrVar.getClass();
                        ctf0Var7.getClass();
                        ArrayList arrayList6 = new ArrayList();
                        if (fsrVar.b) {
                            arrayList6.add(new g49(ctf0Var7.b.a(R.string.video, Arrays.copyOf(new Object[0], 0))));
                        }
                        if (fsrVar.c) {
                            arrayList6.add(new h49(ctf0Var7.b.a(R.string.play_zone, Arrays.copyOf(new Object[0], 0))));
                        }
                        if (o49Var == null) {
                            g49Var = (i49) CollectionsKt.U(arrayList6);
                        } else {
                            int iOrdinal = o49Var.ordinal();
                            if (iOrdinal == 0) {
                                g49Var = new g49(ctf0Var7.b.a(R.string.video, Arrays.copyOf(new Object[0], 0)));
                            } else {
                                if (iOrdinal != 1) {
                                    t9f.b();
                                    return null;
                                }
                                g49Var = new h49(ctf0Var7.b.a(R.string.play_zone, Arrays.copyOf(new Object[0], 0)));
                            }
                            if (arrayList6.isEmpty()) {
                                g49Var = null;
                            } else {
                                Iterator it5 = arrayList6.iterator();
                                do {
                                    if (!it5.hasNext()) {
                                        g49Var = null;
                                    }
                                } while (!Intrinsics.d((i49) it5.next(), g49Var));
                            }
                            if (g49Var == null) {
                                g49Var = (i49) CollectionsKt.U(arrayList6);
                            }
                        }
                        bfu0 bfu0Var = fsrVar.f10077a;
                        GameBroadcastingParams gameBroadcastingParams = new GameBroadcastingParams(bfu0Var.f2522a, bfu0Var.c, bfu0Var.f, bfu0Var.b, bfu0Var.e, bfu0Var.d, bfu0Var.g, null);
                        Iterator it6 = arrayList6.iterator();
                        int i6 = 0;
                        while (true) {
                            if (!it6.hasNext()) {
                                i6 = -1;
                            } else if (!Intrinsics.d((i49) it6.next(), g49Var)) {
                                i6++;
                            }
                        }
                        int i7 = i6;
                        i4 i4VarR1 = dyb.r0(arrayList6);
                        boolean z5 = arrayList6.size() > 1;
                        int iOrdinal2 = zvh0Var2.ordinal();
                        if (iOrdinal2 == 0) {
                            dxh0Var = axh0.f1625a;
                        } else if (iOrdinal2 == 1) {
                            dxh0Var = zwh0.f45106a;
                        } else if (iOrdinal2 == 2) {
                            dxh0Var = cxh0.f5122a;
                        } else {
                            if (iOrdinal2 != 3) {
                                t9f.b();
                                return null;
                            }
                            dxh0Var = bxh0.f3376a;
                        }
                        dxh0 dxh0Var2 = dxh0Var;
                        ArrayList arrayList7 = new ArrayList(r3d.q(arrayList6, 10));
                        Iterator it7 = arrayList6.iterator();
                        while (it7.hasNext()) {
                            arrayList7.add(new yvh0(((i49) it7.next()).getDescription(), bwh0.f3325a));
                        }
                        return new j49(gameBroadcastingParams, i7, g49Var, i4VarR1, z5, dxh0Var2, dyb.r0(arrayList7));
                    case 10:
                        return b(obj);
                    default:
                        gna gnaVar5 = (gna) obj;
                        if ((gnaVar5 instanceof ena ? (ena) gnaVar5 : null) == null || (hnaVar = ((ena) gnaVar5).j) == null) {
                            return null;
                        }
                        boolean zContains4 = ((List) ((fee) rjsVar.o.getValue()).c()).contains(ch00.SHORT_STATISTIC);
                        ctf0 ctf0Var8 = rjsVar.f30611a;
                        ctf0Var8.getClass();
                        List<vrj0> list11 = hnaVar.f;
                        ArrayList arrayList8 = new ArrayList(r3d.q(list11, 10));
                        for (vrj0 vrj0Var : list11) {
                            float fS = r7x.s(vrj0Var.b);
                            float fS2 = r7x.s(vrj0Var.c);
                            String str24 = vrj0Var.f37902a;
                            String str25 = vrj0Var.b;
                            String str26 = vrj0Var.c;
                            if (fS == 0.0f && fS2 == 0.0f) {
                                fS = 0.0f;
                            }
                            arrayList8.add(new srj0(fS, (fS == 0.0f && fS2 == 0.0f) ? 0.0f : fS2, str24, str25, str26));
                        }
                        dja djaVar4 = dja.PENALTY;
                        ch00 ch00Var4 = ch00.SHORT_STATISTIC;
                        i4 i4VarR2 = zContains4 ? dyb.r0(arrayList8) : dyb.r0(CollectionsKt.D0(arrayList8, 3));
                        if (arrayList8.size() - 1 > 3) {
                            lsm0 lsm0Var = ctf0Var8.b;
                            lmoVar = new lmo(lsm0Var.a(R.string.expand, Arrays.copyOf(new Object[0], 0)), lsm0Var.a(R.string.collapse, Arrays.copyOf(new Object[0], 0)), zContains4);
                        } else {
                            lmoVar = null;
                        }
                        return new hax(i4VarR2, lmoVar);
                }
            }
        });
        final byte b9 = 3;
        this.H = maz.b(new yw9(anq0Var, new Function1(this) { // from class: a.qjs
            public final /* synthetic */ rjs b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:260:0x08d4  */
            /* JADX WARN: Code duplicated, block: B:262:0x08e4  */
            /* JADX WARN: Code duplicated, block: B:265:0x090f  */
            /* JADX WARN: Code duplicated, block: B:268:0x0932  */
            /* JADX WARN: Code duplicated, block: B:270:0x0936  */
            /* JADX WARN: Code duplicated, block: B:272:0x094e  */
            private final Object a(Object obj) {
                n0o0 n0o0Var;
                n0o0 n0o0Var2;
                String str;
                String str2;
                mqr kqrVar;
                String strG;
                d3h0 pekVar;
                String strN;
                d3h0 xakVar;
                Integer num;
                String strN2;
                int i;
                iul0 iul0Var;
                yd90 yd90Var;
                yd90 yd90Var2;
                iul0 iul0Var2;
                String str3;
                String str4;
                d3h0 bekVar;
                String strA;
                String strB;
                String strN3;
                rjs rjsVar = this.b;
                n0o0 n0o0Var3 = rjsVar.v;
                n0o0 n0o0Var4 = rjsVar.m;
                n0o0 n0o0Var5 = rjsVar.H;
                n0o0 n0o0Var6 = rjsVar.I;
                ctf0 ctf0Var2 = rjsVar.f30611a;
                gna gnaVar = (gna) obj;
                if (gnaVar != null) {
                    if (!(gnaVar instanceof ena)) {
                        if (gnaVar instanceof fna) {
                            ctf0Var2.getClass();
                            return new orr(d9x.L(((fna) gnaVar).f9825a, ctf0Var2));
                        }
                        t9f.b();
                        return null;
                    }
                    ena enaVar = (ena) gnaVar;
                    mca mcaVar = enaVar.f8084a;
                    List list = (List) ((fee) rjsVar.n.getValue()).c();
                    boolean zBooleanValue = ((Boolean) ((fee) rjsVar.e.getValue()).c()).booleanValue();
                    mpm mpmVar = (mpm) ((fee) n0o0Var6.getValue()).b();
                    boolean z = enaVar.p;
                    String str5 = (String) ((fee) rjsVar.p.getValue()).c();
                    String str6 = (String) ((fee) rjsVar.q.getValue()).c();
                    String str7 = (String) ((fee) rjsVar.r.getValue()).c();
                    String str8 = (String) ((fee) rjsVar.s.getValue()).c();
                    jg30 jg30Var = (jg30) ((fee) n0o0Var5.getValue()).b();
                    bg30 bg30Var = (bg30) ((fee) n0o0Var6.getValue()).c();
                    znq0 znq0Var = (znq0) ((fee) rjsVar.t.getValue()).c();
                    bha bhaVar = enaVar.o;
                    ui9 ui9Var = (ui9) ((fee) rjsVar.u.getValue()).c();
                    long jLongValue = ((Number) ((fee) n0o0Var4.getValue()).c()).longValue();
                    boolean zBooleanValue2 = ((Boolean) ((fee) n0o0Var3.getValue()).c()).booleanValue();
                    ctf0Var2.getClass();
                    if (ui9Var != null) {
                        int i2 = ui9Var.c;
                        int i3 = ui9Var.d;
                        n0o0Var = n0o0Var4;
                        String strN4 = (cy7.c() && zBooleanValue2) ? w6x.n(i3, i2, " : ") : w6x.n(i2, i3, " : ");
                        String strX = j0x.x(jLongValue, ctf0Var2);
                        ArrayList arrayList = ui9Var.f35720a;
                        n0o0Var2 = n0o0Var5;
                        str = str5;
                        str2 = str6;
                        ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
                        int i4 = 0;
                        for (Object obj2 : arrayList) {
                            int i5 = i4 + 1;
                            if (i4 < 0) {
                                q3d.p();
                                throw null;
                            }
                            arrayList2.add(piz.W((sc90) obj2, jLongValue, i4));
                            i4 = i5;
                        }
                        i4 i4VarR0 = dyb.r0(arrayList2);
                        ArrayList arrayList3 = ui9Var.b;
                        ArrayList arrayList4 = new ArrayList(r3d.q(arrayList3, 10));
                        int i6 = 0;
                        for (Object obj3 : arrayList3) {
                            int i7 = i6 + 1;
                            if (i6 < 0) {
                                q3d.p();
                                throw null;
                            }
                            arrayList4.add(piz.W((sc90) obj3, jLongValue, i6));
                            i6 = i7;
                        }
                        kqrVar = new iqr(strN4, strX, i4VarR0, dyb.r0(arrayList4));
                    } else {
                        n0o0Var = n0o0Var4;
                        n0o0Var2 = n0o0Var5;
                        str = str5;
                        str2 = str6;
                        if (bhaVar != null) {
                            float f = bhaVar.d;
                            float f2 = bhaVar.e;
                            float f3 = bhaVar.f;
                            Object[] objArr = {Float.valueOf(f3)};
                            lsm0 lsm0Var = ctf0Var2.b;
                            String strA2 = lsm0Var.a(R.string.n_percents, Arrays.copyOf(objArr, 1));
                            k3w0 g3w0Var = (f3 <= f2 || f3 <= f) ? new g3w0(strA2) : new i3w0(strA2);
                            String strA3 = lsm0Var.a(R.string.n_percents, Arrays.copyOf(new Object[]{Float.valueOf(f2)}, 1));
                            k3w0 g3w0Var2 = (f2 <= f3 || f2 <= f) ? new g3w0(strA3) : new i3w0(strA3);
                            String strA4 = lsm0Var.a(R.string.n_percents, Arrays.copyOf(new Object[]{Float.valueOf(f)}, 1));
                            kqrVar = new kqr(g3w0Var, g3w0Var2, (f <= f3 || f <= f2) ? new g3w0(strA4) : new i3w0(strA4));
                        } else {
                            kqrVar = null;
                        }
                    }
                    anq0 anq0Var2 = (anq0) ((fee) n0o0Var2.getValue()).c();
                    boolean z2 = anq0Var2 != null ? anq0Var2.f1167a : false;
                    long jLongValue2 = ((Number) ((fee) n0o0Var.getValue()).c()).longValue();
                    boolean zBooleanValue3 = ((Boolean) ((fee) n0o0Var3.getValue()).c()).booleanValue();
                    list.getClass();
                    mpmVar.getClass();
                    String strA5 = "";
                    if (mcaVar instanceof pca) {
                        pca pcaVar = (pca) mcaVar;
                        uqr uqrVarR0 = pzb.r0(mcaVar, str, str2, str7, str8, jg30Var);
                        if (bg30Var == null || (bekVar = bg30Var.b) == null) {
                            bekVar = bg30Var != null ? bg30Var.f2536a : new bek();
                        }
                        d3h0 d3h0Var = bekVar;
                        boolean z3 = d3h0Var instanceof lz10;
                        lz10 lz10Var = z3 ? (lz10) d3h0Var : null;
                        if (lz10Var != null) {
                            strA = vzb.T(lz10Var, zBooleanValue3);
                        } else {
                            hzm0 hzm0Var = d3h0Var instanceof hzm0 ? (hzm0) d3h0Var : null;
                            if (hzm0Var != null) {
                                String str9 = hzm0Var.g;
                                String str10 = hzm0Var.i;
                                StringBuilder sb = new StringBuilder("\u2066");
                                if (cy7.c() && zBooleanValue3) {
                                    if (str10 != null) {
                                        hne.B(sb, "(ov ", str10, Separators.RPAREN);
                                    }
                                    sb.append(vzb.i0(str9));
                                } else {
                                    sb.append(str9);
                                    if (str10 != null) {
                                        hne.B(sb, Separators.LPAREN, str10, " ov)");
                                    }
                                }
                                sb.append("\u2069");
                                strA = sb.toString();
                            } else {
                                strA = d3h0Var.a();
                            }
                        }
                        String str11 = strA;
                        lz10 lz10Var2 = z3 ? (lz10) d3h0Var : null;
                        if (lz10Var2 != null) {
                            strB = vzb.U(lz10Var2, zBooleanValue3);
                        } else {
                            hzm0 hzm0Var2 = d3h0Var instanceof hzm0 ? (hzm0) d3h0Var : null;
                            if (hzm0Var2 != null) {
                                String str12 = hzm0Var2.h;
                                String str13 = hzm0Var2.j;
                                StringBuilder sb2 = new StringBuilder("\u2066");
                                if (cy7.c() && zBooleanValue3) {
                                    if (str13 != null) {
                                        hne.B(sb2, "(ov ", str13, Separators.RPAREN);
                                    }
                                    sb2.append(vzb.i0(str12));
                                } else {
                                    sb2.append(str12);
                                    if (str13 != null) {
                                        hne.B(sb2, Separators.LPAREN, str13, " ov)");
                                    }
                                }
                                sb2.append("\u2069");
                                strB = sb2.toString();
                            } else {
                                strB = d3h0Var.b();
                            }
                        }
                        String str14 = strB;
                        boolean z4 = pcaVar.d;
                        rpp0 rpp0Var = pcaVar.f26749a;
                        j83 j83VarH = vzb.H(ctf0Var2, d3h0Var, pcaVar.e, pcaVar.f, pcaVar.g, (bg30Var == null || (strN3 = bg30Var.f2536a.n()) == null) ? "" : strN3, z4, zBooleanValue3);
                        String strB2 = rpp0Var.b();
                        c280 c280Var = new c280(vsm0.s(rpp0Var.a(), pcaVar.b), R.drawable.ic_glyph_placeholder_player);
                        long jA = rpp0Var.a();
                        bap bapVar = bap.b;
                        jdp0 jdp0Var = new jdp0(strB2, n6x.o0(c280Var, jA, list, zBooleanValue, bapVar), null);
                        jdp0 jdp0Var2 = new jdp0(rpp0Var.d(), n6x.o0(new c280(vsm0.s(rpp0Var.c(), pcaVar.c), R.drawable.ic_glyph_placeholder_player), rpp0Var.c(), list, zBooleanValue, bapVar), null);
                        lz10 lz10Var3 = z3 ? (lz10) d3h0Var : null;
                        return new mrr(uqrVarR0, jdp0Var, jdp0Var2, j83VarH, lz10Var3 != null ? vzb.G(lz10Var3.i) : eex.c, str11, d3h0Var.j(), str14, d3h0Var.i());
                    }
                    boolean z5 = z2;
                    String str15 = str;
                    String str16 = str2;
                    boolean z6 = mcaVar instanceof tca;
                    qpm qpmVar = qpm.f29126a;
                    if (z6) {
                        tca tcaVar = (tca) mcaVar;
                        uqr uqrVarR1 = pzb.r0(mcaVar, str15, str16, str7, str8, jg30Var);
                        znq0 znq0Var2 = new znq0(znq0Var != null ? znq0Var.f44687a : 0L);
                        rpp0 rpp0Var2 = tcaVar.f33711a;
                        boolean z7 = tcaVar.i;
                        if (rpp0Var2 instanceof qpp0) {
                            qpp0 qpp0Var = (qpp0) rpp0Var2;
                            jdp0 jdp0Var3 = new jdp0(qpp0Var.g, n6x.o0(u1c.C(tcaVar, true), qpp0Var.e, list, zBooleanValue || z7, bap.b), null);
                            jdp0 jdp0Var4 = new jdp0(qpp0Var.h, n6x.o0(u1c.C(tcaVar, false), qpp0Var.f, list, zBooleanValue || z7, bap.f2271a), null);
                            lpm lpmVar = new lpm(qpmVar, new hpm(0L, 3));
                            dpi0 dpi0Var = new dpi0((byte) 15);
                            rdj rdjVar = rdj.f30294a;
                            vzb.E(dpi0Var, rdj.g(znq0Var2, efj.UNIVERSAL, Boolean.valueOf(z), false, 56));
                            return new trr(uqrVarR1, jdp0Var3, jdp0Var4, lpmVar, ((h83) dpi0Var.f6468a).h(), kqrVar);
                        }
                        if (!(rpp0Var2 instanceof ppp0)) {
                            t9f.b();
                            return null;
                        }
                        ppp0 ppp0Var = (ppp0) rpp0Var2;
                        xcp0 xcp0VarC0 = b8k0.c0(ppp0Var.e, ppp0Var.g, tcaVar.b);
                        xcp0 xcp0VarC1 = b8k0.c0(ppp0Var.f, ppp0Var.h, tcaVar.c);
                        lpm lpmVar2 = new lpm(qpmVar, new hpm(0L, 3));
                        dpi0 dpi0Var2 = new dpi0((byte) 15);
                        rdj rdjVar2 = rdj.f30294a;
                        vzb.E(dpi0Var2, rdj.g(znq0Var2, efj.UNIVERSAL, Boolean.valueOf(z), false, 56));
                        return new trr(uqrVarR1, xcp0VarC0, xcp0VarC1, lpmVar2, ((h83) dpi0Var2.f6468a).h(), kqrVar);
                    }
                    if (!(mcaVar instanceof xca)) {
                        if (mcaVar instanceof gda) {
                            gda gdaVar = (gda) mcaVar;
                            uqr uqrVarR2 = pzb.r0(mcaVar, str15, str16, str7, str8, jg30Var);
                            znq0 znq0Var3 = new znq0(znq0Var != null ? znq0Var.f44687a : 0L);
                            String strB0 = CollectionsKt.b0(gdaVar.f11094a, Separators.SLASH, null, null, null, 62);
                            String strB1 = CollectionsKt.b0(gdaVar.b, Separators.SLASH, null, null, null, 62);
                            lpm lpmVar3 = new lpm(qpmVar, new hpm(0L, 3));
                            dpi0 dpi0Var3 = new dpi0((byte) 15);
                            rdj rdjVar3 = rdj.f30294a;
                            vzb.E(dpi0Var3, rdj.g(znq0Var3, efj.UNIVERSAL, Boolean.valueOf(z), false, 56));
                            return new rrr(uqrVarR2, strB0, strB1, lpmVar3, ((h83) dpi0Var3.f6468a).h());
                        }
                        if (mcaVar instanceof hda) {
                            hda hdaVar = (hda) mcaVar;
                            uqr uqrVarR3 = pzb.r0(mcaVar, str15, str16, str7, str8, jg30Var);
                            if (bg30Var == null || (pekVar = bg30Var.b) == null) {
                                pekVar = bg30Var != null ? bg30Var.f2536a : new pek();
                            }
                            return new rrr(uqrVarR3, CollectionsKt.b0(hdaVar.f12861a, Separators.SLASH, null, null, null, 62), CollectionsKt.b0(hdaVar.b, Separators.SLASH, null, null, null, 62), mpmVar, vzb.H(ctf0Var2, pekVar, hdaVar.h, hdaVar.i, hdaVar.j, (bg30Var == null || (strN = bg30Var.f2536a.n()) == null) ? "" : strN, hdaVar.g, zBooleanValue3));
                        }
                        if (!(mcaVar instanceof ida)) {
                            t9f.b();
                            return null;
                        }
                        ida idaVar = (ida) mcaVar;
                        uqr uqrVarR4 = pzb.r0(mcaVar, str15, str16, str7, str8, jg30Var);
                        if (!idaVar.g) {
                            if (znq0Var != null) {
                                rdj rdjVar4 = rdj.f30294a;
                                strG = rdj.g(znq0Var, efj.UNIVERSAL, Boolean.valueOf(z), false, 56);
                                if (strG == null) {
                                }
                            }
                            dpi0 dpi0Var12 = new dpi0((byte) 15);
                            vzb.E(dpi0Var12, strG);
                            return new vrr(uqrVarR4, idaVar.e, ((h83) dpi0Var12.f6468a).h());
                        }
                        strA5 = ctf0Var2.b.a(R.string.game_end, Arrays.copyOf(new Object[0], 0));
                        strG = strA5;
                        dpi0 dpi0Var13 = new dpi0((byte) 15);
                        vzb.E(dpi0Var13, strG);
                        return new vrr(uqrVarR4, idaVar.e, ((h83) dpi0Var13.f6468a).h());
                    }
                    if (!gql0.d().contains(Long.valueOf(jLongValue2))) {
                        xca xcaVar = (xca) mcaVar;
                        uqr uqrVarR5 = pzb.r0(mcaVar, str15, str16, str7, str8, jg30Var);
                        if (bg30Var == null || (xakVar = bg30Var.b) == null) {
                            xakVar = bg30Var != null ? bg30Var.f2536a : new xak((byte) 22);
                        }
                        boolean z8 = xcaVar.l;
                        boolean z9 = xcaVar.q;
                        rpp0 rpp0Var3 = xcaVar.f40636a;
                        j83 j83VarH2 = vzb.H(ctf0Var2, xakVar, xcaVar.n, xcaVar.o, xcaVar.p, (bg30Var == null || (strN2 = bg30Var.f2536a.n()) == null) ? "" : strN2, z8, zBooleanValue3);
                        if (!(rpp0Var3 instanceof qpp0)) {
                            if (rpp0Var3 instanceof ppp0) {
                                ppp0 ppp0Var2 = (ppp0) rpp0Var3;
                                return new trr(uqrVarR5, b8k0.c0(ppp0Var2.e, ppp0Var2.g, xcaVar.h), b8k0.c0(ppp0Var2.f, ppp0Var2.h, xcaVar.i), mpmVar, j83VarH2, kqrVar);
                            }
                            t9f.b();
                            return null;
                        }
                        int i8 = xcaVar.b;
                        int i9 = xcaVar.g;
                        int i10 = xcaVar.f;
                        int i11 = xcaVar.d;
                        int i12 = xcaVar.c;
                        vy vyVar = (i8 == 0 && i12 == 0 && i11 == 0) ? null : new vy(i8 > 0 ? Integer.valueOf(i8) : null, i12 > 0 ? Integer.valueOf(i12) : null, i11 > 0 ? Integer.valueOf(i11) : null);
                        int i13 = xcaVar.e;
                        vy vyVar2 = (i13 == 0 && i10 == 0 && i9 == 0) ? null : new vy(i13 > 0 ? Integer.valueOf(i13) : null, i10 > 0 ? Integer.valueOf(i10) : null, i9 > 0 ? Integer.valueOf(i9) : null);
                        boolean z10 = (vyVar == null && vyVar2 == null) ? false : true;
                        if (z10 && vyVar == null) {
                            num = null;
                            vyVar = new vy(null, null, null);
                        } else {
                            num = null;
                        }
                        if (z10 && vyVar2 == null) {
                            vyVar2 = new vy(num, num, num);
                        }
                        qpp0 qpp0Var2 = (qpp0) rpp0Var3;
                        return new trr(uqrVarR5, new jdp0(qpp0Var2.g, n6x.o0(u1c.D(xcaVar, true), qpp0Var2.e, list, zBooleanValue || z9, bap.b), vyVar), new jdp0(qpp0Var2.h, n6x.o0(u1c.D(xcaVar, false), qpp0Var2.f, list, zBooleanValue || z9, bap.f2271a), vyVar2), mpmVar, j83VarH2, kqrVar);
                    }
                    xca xcaVar2 = (xca) mcaVar;
                    long j = znq0Var != null ? znq0Var.f44687a : 0L;
                    uqr uqrVarR6 = pzb.r0(mcaVar, str15, str16, str7, str8, jg30Var);
                    znq0 znq0Var4 = new znq0(j);
                    pz10 pz10Var = bg30Var != null ? bg30Var.f2536a : null;
                    if (pz10Var instanceof nz10) {
                        izm0 izm0Var = bg30Var.b;
                        String str17 = xcaVar2.s;
                        List list2 = xcaVar2.i;
                        List list3 = xcaVar2.h;
                        rpp0 rpp0Var4 = xcaVar2.f40636a;
                        boolean z11 = xcaVar2.l;
                        String str18 = xcaVar2.p;
                        rdj rdjVar5 = rdj.f30294a;
                        pz10 pz10Var2 = pz10Var;
                        String strG2 = rdj.g(znq0Var4, efj.UNIVERSAL, Boolean.valueOf(z), false, 56);
                        str18.getClass();
                        strG2.getClass();
                        dpi0 dpi0Var14 = new dpi0((byte) 15);
                        if (str17 != null) {
                            vzb.E(dpi0Var14, str17);
                            vzb.E(dpi0Var14, ": ");
                            boolean z12 = cy7.c() && zBooleanValue3;
                            if (izm0Var == null) {
                                vzb.E(dpi0Var14, "0");
                                vzb.C(dpi0Var14);
                                vzb.E(dpi0Var14, "0");
                            } else {
                                if (!(izm0Var instanceof gzm0) && !(izm0Var instanceof hzm0)) {
                                    t9f.b();
                                    return null;
                                }
                                boolean z13 = izm0Var instanceof hzm0;
                                String strA6 = z13 ? ((hzm0) izm0Var).g : izm0Var.a();
                                String strB3 = z13 ? ((hzm0) izm0Var).h : izm0Var.b();
                                vzb.E(dpi0Var14, "\u2066");
                                if (z12) {
                                    vzb.D(dpi0Var14, strB3, vzb.L(izm0Var.i()));
                                    vzb.C(dpi0Var14);
                                    vzb.D(dpi0Var14, strA6, vzb.L(izm0Var.j()));
                                } else {
                                    vzb.D(dpi0Var14, strA6, vzb.L(izm0Var.j()));
                                    vzb.C(dpi0Var14);
                                    vzb.D(dpi0Var14, strB3, vzb.L(izm0Var.i()));
                                }
                                vzb.E(dpi0Var14, "\u2069");
                            }
                        } else {
                            vzb.E(dpi0Var14, strG2);
                            if (str18.length() > 0) {
                                vzb.A(dpi0Var14);
                                vzb.E(dpi0Var14, str18);
                            }
                            if (z11) {
                                vzb.A(dpi0Var14);
                                i = 0;
                                vzb.E(dpi0Var14, ctf0Var2.b.a(R.string.game_end, Arrays.copyOf(new Object[0], 0)));
                            } else {
                                i = 0;
                            }
                            if (z5) {
                                vzb.A(dpi0Var14);
                                vzb.E(dpi0Var14, ctf0Var2.b.a(R.string.card_cricket_break, Arrays.copyOf(new Object[i], i)));
                            }
                        }
                        j83 j83VarH3 = ((h83) dpi0Var14.f6468a).h();
                        nz10 nz10Var = (nz10) pz10Var2;
                        boolean z14 = nz10Var instanceof mz10;
                        k5q0 k5q0Var = k5q0.b;
                        if (!z14) {
                            if (nz10Var instanceof oz10) {
                                oz10 oz10Var = (oz10) nz10Var;
                                String str19 = oz10Var.i;
                                String str20 = oz10Var.g;
                                String str21 = oz10Var.m;
                                String str22 = oz10Var.k;
                                boolean z15 = ((StringsKt.W(str22) || str22.equals("0")) && (StringsKt.W(str21) || str21.equals("0"))) ? false : true;
                                boolean z16 = str20.length() > 0 || str19.length() > 0;
                                eex eexVarG = vzb.G(oz10Var.o);
                                ArrayList arrayList5 = oz10Var.f;
                                ArrayList arrayList6 = new ArrayList(r3d.q(arrayList5, 10));
                                Iterator it = arrayList5.iterator();
                                while (it.hasNext()) {
                                    te90 te90Var = (te90) it.next();
                                    arrayList6.add(new yd90(vzb.O(te90Var), vzb.Q(te90Var), te90Var.f33809a));
                                    it = it;
                                    z15 = z15;
                                }
                                boolean z17 = z15;
                                i4 i4VarR1 = dyb.r0(arrayList6);
                                j83 j83VarN = vzb.N(nz10Var);
                                j83 j83VarP = vzb.P(nz10Var);
                                lsm0 lsm0Var2 = ctf0Var2.b;
                                yd90 yd90Var3 = new yd90(j83VarN, j83VarP, lsm0Var2.a(R.string.total_count, Arrays.copyOf(new Object[0], 0)));
                                if (z17) {
                                    h83 h83Var = new h83();
                                    long j2 = y3d.g;
                                    long j3 = daq0.c;
                                    smk0 smk0Var = new smk0(vzb.L(oz10Var.l), j3, null, null, null, null, null, j3, new j56(0.0f), null, null, j2, k5q0Var, null, null, 17424);
                                    h83Var.c(str22);
                                    j83 j83VarC = kng0.c(h83Var.f12607a, h83Var, smk0Var, 0);
                                    h83 h83Var2 = new h83();
                                    smk0 smk0Var2 = new smk0(vzb.L(oz10Var.n), j3, null, null, null, null, null, j3, new j56(0.0f), null, null, j2, k5q0Var, null, null, 17424);
                                    h83Var2.c(str21);
                                    yd90Var = new yd90(j83VarC, kng0.c(h83Var2.f12607a, h83Var2, smk0Var2, 0), lsm0Var2.a(R.string.dt_points, Arrays.copyOf(new Object[0], 0)));
                                } else {
                                    yd90Var = null;
                                }
                                if (z16) {
                                    h83 h83Var3 = new h83();
                                    long j4 = y3d.g;
                                    long j5 = daq0.c;
                                    smk0 smk0Var3 = new smk0(vzb.L(oz10Var.h), j5, null, null, null, null, null, j5, new j56(0.0f), null, null, j4, k5q0Var, null, null, 17424);
                                    h83Var3.c(str20);
                                    j83 j83VarC2 = kng0.c(h83Var3.f12607a, h83Var3, smk0Var3, 0);
                                    h83 h83Var4 = new h83();
                                    smk0 smk0Var4 = new smk0(vzb.L(oz10Var.j), j5, null, null, null, null, null, j5, new j56(0.0f), null, null, j4, k5q0Var, null, null, 17424);
                                    h83Var4.c(str19);
                                    yd90Var2 = new yd90(j83VarC2, kng0.c(h83Var4.f12607a, h83Var4, smk0Var4, 0), lsm0Var2.a(R.string.tennis_game_column, Arrays.copyOf(new Object[0], 0)));
                                } else {
                                    yd90Var2 = null;
                                }
                                iul0Var2 = new iul0(eexVarG, i4VarR1, yd90Var3, yd90Var2, yd90Var);
                            } else {
                                if (!(nz10Var instanceof kz10)) {
                                    t9f.b();
                                    return null;
                                }
                                kz10 kz10Var = (kz10) nz10Var;
                                eex eexVarG2 = vzb.G(kz10Var.g);
                                ArrayList<te90> arrayList7 = kz10Var.f;
                                ArrayList arrayList8 = new ArrayList(r3d.q(arrayList7, 10));
                                for (te90 te90Var2 : arrayList7) {
                                    arrayList8.add(new yd90(vzb.O(te90Var2), vzb.Q(te90Var2), te90Var2.f33809a));
                                }
                                iul0Var = new iul0(eexVarG2, dyb.r0(arrayList8), new yd90(vzb.N(nz10Var), vzb.P(nz10Var), ctf0Var2.b.a(R.string.total_count, Arrays.copyOf(new Object[0], 0))), null, null);
                            }
                            if (rpp0Var4 instanceof qpp0) {
                                if (rpp0Var4 instanceof ppp0) {
                                    ppp0 ppp0Var11 = (ppp0) rpp0Var4;
                                    return new xrr(uqrVarR6, b8k0.c0(ppp0Var11.e, ppp0Var11.g, list3), b8k0.c0(ppp0Var11.f, ppp0Var11.h, list2), j83VarH3, iul0Var2);
                                }
                                t9f.b();
                                return null;
                            }
                            qpp0 qpp0Var11 = (qpp0) rpp0Var4;
                            String str2111 = qpp0Var11.g;
                            str3 = (String) CollectionsKt.firstOrNull(list3);
                            if (str3 == null) {
                                str3 = "";
                            }
                            c280 c280Var10 = new c280(vsm0.s(qpp0Var11.e, str3), R.drawable.ic_glyph_placeholder_player);
                            long j16 = qpp0Var11.e;
                            bap bapVar10 = bap.b;
                            jdp0 jdp0Var13 = new jdp0(str2111, n6x.o0(c280Var10, j16, list, zBooleanValue, bapVar10), null);
                            String str2112 = qpp0Var11.h;
                            str4 = (String) CollectionsKt.firstOrNull(list2);
                            if (str4 == null) {
                                str4 = "";
                            }
                            return new xrr(uqrVarR6, jdp0Var13, new jdp0(str2112, n6x.o0(new c280(vsm0.s(qpp0Var11.f, str4), R.drawable.ic_glyph_placeholder_player), qpp0Var11.f, list, zBooleanValue, bapVar10), null), j83VarH3, iul0Var2);
                        }
                        mz10 mz10Var = (mz10) nz10Var;
                        eex eexVarG3 = vzb.G(mz10Var.g);
                        ArrayList<te90> arrayList9 = mz10Var.f;
                        ArrayList arrayList10 = new ArrayList(r3d.q(arrayList9, 10));
                        for (te90 te90Var3 : arrayList9) {
                            arrayList10.add(new yd90(vzb.O(te90Var3), vzb.Q(te90Var3), te90Var3.f33809a));
                        }
                        i4 i4VarR2 = dyb.r0(arrayList10);
                        j83 j83VarN2 = vzb.N(nz10Var);
                        j83 j83VarP2 = vzb.P(nz10Var);
                        lsm0 lsm0Var3 = ctf0Var2.b;
                        yd90 yd90Var4 = new yd90(j83VarN2, j83VarP2, lsm0Var3.a(R.string.total_count, Arrays.copyOf(new Object[0], 0)));
                        h83 h83Var5 = new h83();
                        String str25 = mz10Var.h;
                        long j7 = y3d.g;
                        long j8 = daq0.c;
                        smk0 smk0Var5 = new smk0(vzb.L(mz10Var.i), j8, null, null, null, null, null, j8, new j56(0.0f), null, null, j7, k5q0Var, null, null, 17424);
                        h83Var5.c(str25);
                        j83 j83VarC3 = kng0.c(h83Var5.f12607a, h83Var5, smk0Var5, 0);
                        h83 h83Var6 = new h83();
                        String str26 = mz10Var.j;
                        smk0 smk0Var6 = new smk0(vzb.L(mz10Var.k), j8, null, null, null, null, null, j8, new j56(0.0f), null, null, j7, k5q0Var, null, null, 17424);
                        h83Var6.c(str26);
                        iul0Var = new iul0(eexVarG3, i4VarR2, yd90Var4, null, new yd90(j83VarC3, kng0.c(h83Var6.f12607a, h83Var6, smk0Var6, 0), lsm0Var3.a(R.string.dt_points, Arrays.copyOf(new Object[0], 0))));
                        iul0Var2 = iul0Var;
                        if (rpp0Var4 instanceof qpp0) {
                            if (rpp0Var4 instanceof ppp0) {
                                ppp0 ppp0Var12 = (ppp0) rpp0Var4;
                                return new xrr(uqrVarR6, b8k0.c0(ppp0Var12.e, ppp0Var12.g, list3), b8k0.c0(ppp0Var12.f, ppp0Var12.h, list2), j83VarH3, iul0Var2);
                            }
                            t9f.b();
                            return null;
                        }
                        qpp0 qpp0Var12 = (qpp0) rpp0Var4;
                        String str2113 = qpp0Var12.g;
                        str3 = (String) CollectionsKt.firstOrNull(list3);
                        if (str3 == null) {
                            str3 = "";
                        }
                        c280 c280Var11 = new c280(vsm0.s(qpp0Var12.e, str3), R.drawable.ic_glyph_placeholder_player);
                        long j17 = qpp0Var12.e;
                        bap bapVar11 = bap.b;
                        jdp0 jdp0Var14 = new jdp0(str2113, n6x.o0(c280Var11, j17, list, zBooleanValue, bapVar11), null);
                        String str2114 = qpp0Var12.h;
                        str4 = (String) CollectionsKt.firstOrNull(list2);
                        if (str4 == null) {
                            str4 = "";
                        }
                        return new xrr(uqrVarR6, jdp0Var14, new jdp0(str2114, n6x.o0(new c280(vsm0.s(qpp0Var12.f, str4), R.drawable.ic_glyph_placeholder_player), qpp0Var12.f, list, zBooleanValue, bapVar11), null), j83VarH3, iul0Var2);
                    }
                }
                return qrr.f29223a;
            }

            /* JADX WARN: Code duplicated, block: B:18:0x008a  */
            private final Object b(Object obj) {
                String strG;
                lz10 lz10Var;
                float f;
                fad dadVar;
                sad qadVar;
                j83 j83VarC;
                j83 j83VarC2;
                gna gnaVar = (gna) obj;
                if (gnaVar == null) {
                    return null;
                }
                if (!(gnaVar instanceof ena)) {
                    if (gnaVar instanceof fna) {
                        return null;
                    }
                    t9f.b();
                    return null;
                }
                ena enaVar = (ena) gnaVar;
                mca mcaVar = enaVar.f8084a;
                rjs rjsVar = this.b;
                jg30 jg30Var = (jg30) ((fee) rjsVar.H.getValue()).b();
                bg30 bg30Var = (bg30) ((fee) rjsVar.I.getValue()).c();
                pz10 pz10Var = bg30Var != null ? bg30Var.f2536a : null;
                ctf0 ctf0Var2 = rjsVar.f30611a;
                boolean z = enaVar.p;
                znq0 znq0Var = (znq0) ((fee) rjsVar.t.getValue()).c();
                boolean zBooleanValue = ((Boolean) ((fee) rjsVar.v.getValue()).c()).booleanValue();
                ctf0Var2.getClass();
                dja djaVar = dja.PENALTY;
                k5q0 k5q0Var = k5q0.b;
                if (jg30Var != null) {
                    dadVar = new ead(jg30Var);
                    f = 0.0f;
                    lz10Var = null;
                } else {
                    h83 h83Var = new h83();
                    if (znq0Var != null) {
                        rdj rdjVar = rdj.f30294a;
                        strG = rdj.g(znq0Var, efj.UNIVERSAL, Boolean.valueOf(z), false, 56);
                        if (strG == null) {
                            strG = "";
                        }
                    } else {
                        strG = "";
                    }
                    pz40 pz40Var = s6t0.f31722a;
                    long textPrimary = s6t0.b().f33626a.getTextPrimary();
                    h83 h83Var2 = new h83();
                    long j = y3d.g;
                    long j2 = daq0.c;
                    lz10Var = null;
                    f = 0.0f;
                    smk0 smk0Var = new smk0(textPrimary, j2, null, null, null, null, null, j2, new j56(0.0f), null, null, j, k5q0Var, null, null, 17424);
                    h83Var2.c(strG);
                    StringBuilder sb = h83Var2.f12607a;
                    h83Var2.a(smk0Var, 0, sb.length());
                    sb.length();
                    h83Var.b(h83Var2.h());
                    dadVar = new dad(h83Var.h());
                }
                d3h0 cl5Var = pz10Var;
                if (mcaVar instanceof pca) {
                    if (pz10Var == null) {
                        cl5Var = new cl5((byte) 28);
                    }
                    rpp0 rpp0Var = ((pca) mcaVar).f26749a;
                    String strB = rpp0Var.b();
                    String strD = rpp0Var.d();
                    boolean z2 = cl5Var instanceof lz10;
                    lz10 lz10Var2 = z2 ? (lz10) cl5Var : lz10Var;
                    String strT = lz10Var2 != null ? vzb.T(lz10Var2, zBooleanValue) : "0";
                    lz10 lz10Var3 = z2 ? (lz10) cl5Var : lz10Var;
                    qadVar = new pad(strB, strD, strT, lz10Var3 != null ? vzb.U(lz10Var3, zBooleanValue) : "0", cl5Var.j(), cl5Var.i());
                } else if (mcaVar instanceof tca) {
                    rpp0 rpp0Var2 = ((tca) mcaVar).f33711a;
                    String strB2 = rpp0Var2.b();
                    String strD2 = rpp0Var2.d();
                    h83 h83Var3 = new h83();
                    String strA = ctf0Var2.b.a(R.string.vs, Arrays.copyOf(new Object[0], 0));
                    long j3 = y3d.g;
                    long j4 = daq0.c;
                    pz40 pz40Var2 = s6t0.f31722a;
                    smk0 smk0Var2 = new smk0(s6t0.b().f33626a.getTextPrimary(), j4, null, null, null, null, null, j4, new j56(f), null, null, j3, k5q0Var, null, null, 17424);
                    h83Var3.c(strA);
                    qadVar = new rad(kng0.c(h83Var3.f12607a, h83Var3, smk0Var2, 0), strB2, strD2);
                } else if (mcaVar instanceof xca) {
                    rpp0 rpp0Var3 = ((xca) mcaVar).f40636a;
                    String strB3 = rpp0Var3.b();
                    String strD3 = rpp0Var3.d();
                    if (pz10Var != null) {
                        j83VarC2 = vzb.M(pz10Var);
                    } else {
                        h83 h83Var4 = new h83();
                        String strA2 = ctf0Var2.b.a(R.string.vs, Arrays.copyOf(new Object[0], 0));
                        long j5 = y3d.g;
                        long j6 = daq0.c;
                        pz40 pz40Var3 = s6t0.f31722a;
                        smk0 smk0Var3 = new smk0(s6t0.b().f33626a.getTextPrimary(), j6, null, null, null, null, null, j6, new j56(f), null, null, j5, k5q0Var, null, null, 17424);
                        h83Var4.c(strA2);
                        j83VarC2 = kng0.c(h83Var4.f12607a, h83Var4, smk0Var3, 0);
                    }
                    qadVar = new rad(j83VarC2, strB3, strD3);
                } else if (mcaVar instanceof gda) {
                    gda gdaVar = (gda) mcaVar;
                    String strB0 = CollectionsKt.b0(gdaVar.f11094a, Separators.SLASH, null, null, null, 62);
                    String strB1 = CollectionsKt.b0(gdaVar.b, Separators.SLASH, null, null, null, 62);
                    h83 h83Var5 = new h83();
                    String strA3 = ctf0Var2.b.a(R.string.vs, Arrays.copyOf(new Object[0], 0));
                    long j7 = y3d.g;
                    long j8 = daq0.c;
                    pz40 pz40Var4 = s6t0.f31722a;
                    smk0 smk0Var4 = new smk0(s6t0.b().f33626a.getTextPrimary(), j8, null, null, null, null, null, j8, new j56(f), null, null, j7, k5q0Var, null, null, 17424);
                    h83Var5.c(strA3);
                    qadVar = new rad(kng0.c(h83Var5.f12607a, h83Var5, smk0Var4, 0), strB0, strB1);
                } else if (mcaVar instanceof hda) {
                    hda hdaVar = (hda) mcaVar;
                    String strB4 = CollectionsKt.b0(hdaVar.f12861a, Separators.SLASH, null, null, null, 62);
                    String strB5 = CollectionsKt.b0(hdaVar.b, Separators.SLASH, null, null, null, 62);
                    if (pz10Var != null) {
                        j83VarC = vzb.M(pz10Var);
                    } else {
                        h83 h83Var6 = new h83();
                        String strA4 = ctf0Var2.b.a(R.string.vs, Arrays.copyOf(new Object[0], 0));
                        long j9 = y3d.g;
                        long j10 = daq0.c;
                        pz40 pz40Var5 = s6t0.f31722a;
                        smk0 smk0Var5 = new smk0(s6t0.b().f33626a.getTextPrimary(), j10, null, null, null, null, null, j10, new j56(f), null, null, j9, k5q0Var, null, null, 17424);
                        h83Var6.c(strA4);
                        j83VarC = kng0.c(h83Var6.f12607a, h83Var6, smk0Var5, 0);
                    }
                    qadVar = new rad(j83VarC, strB4, strB5);
                } else {
                    if (!(mcaVar instanceof ida)) {
                        t9f.b();
                        return lz10Var;
                    }
                    qadVar = new qad(((ida) mcaVar).e);
                }
                return new dax(dadVar, qadVar);
            }

            /* JADX WARN: Code duplicated, block: B:140:0x0381  */
            /* JADX WARN: Code duplicated, block: B:70:0x01a8  */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                kc50 kc50Var;
                p700 p700Var;
                ena enaVar;
                uia uiaVar;
                String strA;
                String strC;
                String strC2;
                zvl0 zvl0Var;
                yja yjaVar;
                qal0 qal0Var;
                Object b0k0Var;
                i49 g49Var;
                dxh0 dxh0Var;
                hna hnaVar;
                lmo lmoVar;
                byte b10 = b9;
                int i = 0;
                rjs rjsVar = this.b;
                switch (b10) {
                    case 0:
                        List list = (List) obj;
                        list.getClass();
                        boolean zBooleanValue = ((Boolean) ((fee) rjsVar.c.getValue()).c()).booleanValue();
                        boolean zBooleanValue2 = ((Boolean) ((fee) rjsVar.e.getValue()).c()).booleanValue();
                        boolean zBooleanValue3 = ((Boolean) ((fee) rjsVar.f.getValue()).c()).booleanValue();
                        tf50 tf50Var = (tf50) ((fee) rjsVar.d.getValue()).c();
                        tf50Var.getClass();
                        if (!list.contains(tf50Var)) {
                            tf50Var = tf50.f33851a;
                        }
                        boolean z = !zBooleanValue2;
                        kc50 kc50Var2 = new kc50(R.drawable.ic_glyph_rectangular_scoreboard, tf50Var == tf50.f33851a);
                        tf50 tf50Var2 = tf50.b;
                        kc50 kc50Var3 = list.contains(tf50Var2) ? new kc50(R.drawable.ic_glyph_rectangular_broadcast, tf50Var == tf50Var2) : null;
                        tf50 tf50Var3 = tf50.c;
                        if (list.contains(tf50Var3)) {
                            kc50Var = new kc50(R.drawable.ic_glyph_rectangular_statistic, tf50Var == tf50Var3);
                        } else {
                            kc50Var = null;
                        }
                        return new ojs(zBooleanValue, z, zBooleanValue, zBooleanValue3, new hjs(kc50Var2, kc50Var3, kc50Var, tf50Var));
                    case 1:
                        n0o0 n0o0Var = rjsVar.o;
                        gna gnaVar = (gna) obj;
                        if ((gnaVar instanceof ena ? (ena) gnaVar : null) == null || (p700Var = ((ena) gnaVar).l) == null) {
                            return null;
                        }
                        List list2 = p700Var.e;
                        List list3 = (List) ((fee) n0o0Var.getValue()).c();
                        ch00 ch00Var = ch00.LAST_GAMES;
                        boolean zContains = list3.contains(ch00Var);
                        List list4 = (List) ((fee) n0o0Var.getValue()).c();
                        ch00 ch00Var2 = ch00.LAST_GAMES_OPP_ONE;
                        boolean zContains2 = list4.contains(ch00Var2);
                        List list5 = (List) ((fee) n0o0Var.getValue()).c();
                        ch00 ch00Var3 = ch00.LAST_GAMES_OPP_TWO;
                        boolean zContains3 = list5.contains(ch00Var3);
                        ctf0 ctf0Var2 = rjsVar.f30611a;
                        ctf0Var2.getClass();
                        ArrayList arrayList = new ArrayList();
                        List list6 = p700Var.g;
                        List list7 = p700Var.f;
                        if (!list2.isEmpty()) {
                            arrayList.add(z1x.T(list2, ctf0Var2, ctf0Var2.b.a(R.string.previous_meetings, Arrays.copyOf(new Object[0], 0)), ch00Var, zContains));
                        }
                        if (!list7.isEmpty()) {
                            arrayList.add(z1x.T(list7, ctf0Var2, kng0.l(ctf0Var2.b.a(R.string.last_games, Arrays.copyOf(new Object[0], 0)), ": ", p700Var.c), ch00Var2, zContains2));
                        }
                        if (!list6.isEmpty()) {
                            arrayList.add(z1x.T(list6, ctf0Var2, kng0.l(ctf0Var2.b.a(R.string.last_games, Arrays.copyOf(new Object[0], 0)), ": ", p700Var.d), ch00Var3, zContains3));
                        }
                        return arrayList;
                    case 2:
                        gna gnaVar2 = (gna) obj;
                        if ((gnaVar2 instanceof ena ? (ena) gnaVar2 : null) == null || (uiaVar = (enaVar = (ena) gnaVar2).h) == null) {
                            return null;
                        }
                        ctf0 ctf0Var3 = rjsVar.f30611a;
                        boolean z2 = enaVar.p;
                        ctf0Var3.getClass();
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it = uiaVar.c.iterator();
                        int i2 = 0;
                        while (it.hasNext()) {
                            Object next = it.next();
                            int i3 = i2 + 1;
                            if (i2 < 0) {
                                q3d.p();
                                throw null;
                            }
                            bsw bswVar = (bsw) next;
                            String str = bswVar.b;
                            String str2 = bswVar.e;
                            String strA2 = (str.length() <= 0 || str2.length() <= 0) ? ctf0Var3.b.a(R.string.vs, Arrays.copyOf(new Object[0], 0)) : w6x.q(bswVar.b, " : ", str2);
                            odp0 odp0Var = new odp0(new d5a0(new c280(bswVar.c, R.drawable.ic_glyph_placeholder_player)));
                            String strM = dw9.m(i3, ". ", bswVar.f3153a);
                            odp0 odp0Var2 = new odp0(new d5a0(new c280(bswVar.f, R.drawable.ic_glyph_placeholder_player)));
                            String strM2 = dw9.m(i3, ". ", bswVar.d);
                            rdj rdjVar = rdj.f30294a;
                            arrayList2.add(new hzy(odp0Var, strM, odp0Var2, strM2, rdj.g(new znq0(bswVar.g), efj.UNIVERSAL, Boolean.valueOf(z2), false, 56), strA2, "", null, null));
                            it = it;
                            i2 = i3;
                        }
                        dja djaVar = dja.PENALTY;
                        return new eax(dyb.o0(arrayList2), uiaVar.f35722a, uiaVar.b);
                    case 3:
                        anq0 anq0Var2 = (anq0) obj;
                        if (anq0Var2 != null) {
                            boolean z3 = ((Boolean) ((fee) rjsVar.g.getValue()).c()).booleanValue() || ((Boolean) ((fee) rjsVar.h.getValue()).c()).booleanValue();
                            ctf0 ctf0Var4 = rjsVar.f30611a;
                            ctf0Var4.getClass();
                            long j = anq0Var2.e;
                            long j2 = anq0Var2.d;
                            boolean z4 = anq0Var2.j;
                            if (j != 0 || !z4) {
                                String str3 = anq0Var2.c;
                                if (z4) {
                                    if (str3.length() > 0) {
                                        strA = ctf0Var4.b.a(R.string.live_additional_min_v2, Arrays.copyOf(new Object[]{str3}, 1));
                                    } else if (anq0Var2.f1167a) {
                                        strA = "";
                                    } else {
                                        strA = anq0Var2.b ? ctf0Var4.b.a(R.string.line_live_time_period_back_v2, Arrays.copyOf(new Object[]{""}, 1)) : ctf0Var4.b.a(R.string.line_live_time_period_capitalized_v2, Arrays.copyOf(new Object[]{""}, 1));
                                    }
                                } else if (j2 < 0) {
                                    strA = ctf0Var4.b.a(R.string.game_started, Arrays.copyOf(new Object[0], 0));
                                } else {
                                    long j3 = j2 / 86400;
                                    strA = j3 > 0 ? ctf0Var4.b.a(R.string.line_time_before_v2, Arrays.copyOf(new Object[]{String.valueOf(j3)}, 1)) : ctf0Var4.b.a(R.string.before_start, Arrays.copyOf(new Object[0], 0));
                                }
                                String strC3 = (z3 || z4 || j2 < 0) ? null : n2x.C((((j2 < 0 ? 0L : j2) / 60) / 60) % 24);
                                if (z3) {
                                    strC = null;
                                } else {
                                    long jB = (z4 ? vzb.V(anq0Var2).b() : j2 < 0 ? 0L : j2) / 60;
                                    if (!z4) {
                                        jB %= 60;
                                    }
                                    strC = n2x.C(jB);
                                }
                                if (z3) {
                                    strC2 = null;
                                } else {
                                    strC2 = n2x.C((z4 ? vzb.V(anq0Var2).b() : j2 >= 0 ? j2 : 0L) % 60);
                                }
                                return new jg30(strA, strC3, strC, strC2);
                            }
                        }
                        return null;
                    case 4:
                        gna gnaVar3 = (gna) obj;
                        ena enaVar2 = gnaVar3 instanceof ena ? (ena) gnaVar3 : null;
                        if (enaVar2 == null || (zvl0Var = ((ena) gnaVar3).k) == null) {
                            return null;
                        }
                        String str4 = zvl0Var.m;
                        String str5 = enaVar2.q;
                        ctf0 ctf0Var5 = rjsVar.f30611a;
                        m1v0 m1v0Var = (m1v0) ((fee) rjsVar.J.getValue()).b();
                        str5.getClass();
                        ctf0Var5.getClass();
                        String str6 = zvl0Var.f45064a;
                        Pair pair = str4.length() > 0 ? new Pair(str4, ctf0Var5.b.a(R.string.web_site, Arrays.copyOf(new Object[0], 0))) : new Pair(null, null);
                        String str7 = (String) pair.f46059a;
                        String str8 = (String) pair.b;
                        dja djaVar2 = dja.PENALTY;
                        String str9 = zvl0Var.b;
                        ArrayList arrayList3 = new ArrayList();
                        String str10 = zvl0Var.l;
                        String str11 = zvl0Var.k;
                        String str12 = zvl0Var.j;
                        String str13 = zvl0Var.i;
                        String str14 = zvl0Var.h;
                        String str15 = zvl0Var.g;
                        String str16 = zvl0Var.f;
                        String str17 = zvl0Var.e;
                        String str18 = zvl0Var.d;
                        String str19 = zvl0Var.c;
                        if (str6.length() > 0) {
                            arrayList3.add(l7x.J(ctf0Var5, str6, R.string.address));
                        }
                        if (str19.length() > 0) {
                            arrayList3.add(l7x.J(ctf0Var5, str19, R.string.capacity));
                        }
                        if (str18.length() > 0) {
                            arrayList3.add(l7x.J(ctf0Var5, str18, R.string.covering));
                        }
                        if (str17.length() > 0) {
                            arrayList3.add(l7x.J(ctf0Var5, str17, R.string.city_name));
                        }
                        if (str16.length() > 0) {
                            arrayList3.add(l7x.J(ctf0Var5, str16, R.string.architect));
                        }
                        if (str15.length() > 0) {
                            arrayList3.add(l7x.J(ctf0Var5, str15, R.string.old_name));
                        }
                        if (str14.length() > 0) {
                            arrayList3.add(l7x.J(ctf0Var5, str14, R.string.category));
                        }
                        if (str13.length() > 0) {
                            arrayList3.add(l7x.J(ctf0Var5, str13, R.string.history));
                        }
                        if (str12.length() > 0) {
                            arrayList3.add(l7x.J(ctf0Var5, str12, R.string.opened));
                        }
                        if (str11.length() > 0) {
                            arrayList3.add(l7x.J(ctf0Var5, str11, R.string.zip_code));
                        }
                        if (str10.length() > 0) {
                            arrayList3.add(l7x.J(ctf0Var5, "\u2066" + str10 + "\u2069", R.string.phone));
                        }
                        a4x a4xVarO0 = dyb.o0(arrayList3);
                        List list8 = zvl0Var.n;
                        ArrayList arrayList4 = new ArrayList(r3d.q(list8, 10));
                        Iterator it2 = list8.iterator();
                        while (it2.hasNext()) {
                            arrayList4.add(String.format(Locale.ENGLISH, "%s/sfiles/stadium/%s", Arrays.copyOf(new Object[]{str5, (String) it2.next()}, 2)));
                        }
                        a4x a4xVarO1 = dyb.o0(arrayList4);
                        if (a4xVarO1.isEmpty()) {
                            a4xVarO1 = dyb.g0("");
                        }
                        return new iax(m1v0Var, str9, a4xVarO0, str7, str8, a4xVarO1);
                    case 5:
                        gna gnaVar4 = (gna) obj;
                        if ((gnaVar4 instanceof ena ? (ena) gnaVar4 : null) != null && (yjaVar = ((ena) gnaVar4).i) != null) {
                            List list9 = yjaVar.f42730a;
                            if (!list9.isEmpty()) {
                                long jLongValue = ((Number) ((fee) rjsVar.m.getValue()).c()).longValue();
                                lc00 lc00VarB = kotlin.collections.a.b();
                                Iterator it3 = list9.iterator();
                                while (it3.hasNext()) {
                                    he30 he30Var = (he30) it3.next();
                                    List list10 = he30Var.b;
                                    ArrayList arrayList5 = new ArrayList();
                                    for (Object obj2 : list10) {
                                        if (((ge30) obj2).e.length() > 0) {
                                            arrayList5.add(obj2);
                                        }
                                    }
                                    if (!arrayList5.isEmpty()) {
                                        lc00VarB.add(new uim(he30Var.f12902a));
                                        int i4 = i;
                                        for (Object obj3 : arrayList5) {
                                            int i5 = i4 + 1;
                                            if (i4 < 0) {
                                                q3d.p();
                                                throw null;
                                            }
                                            ge30 ge30Var = (ge30) obj3;
                                            String str20 = ge30Var.f11132a;
                                            String str21 = ge30Var.e;
                                            String str22 = ge30Var.c;
                                            String str23 = ge30Var.d;
                                            tho thoVar = ge30Var.b;
                                            Iterator it4 = it3;
                                            List listSplit$default = StringsKt__StringsKt.split$default(str20, new String[]{"+"}, false, i, 6, null);
                                            long j4 = jLongValue;
                                            List listSplit$default2 = StringsKt__StringsKt.split$default(str20, new String[]{Separators.COLON}, false, i, 6, null);
                                            if (j4 == 1) {
                                                if (listSplit$default.size() == 2 && listSplit$default2.size() == 1) {
                                                    str20 = listSplit$default.get(0) + "'+" + kotlin.text.c.r((String) listSplit$default.get(1), Separators.QUOTE, "", false);
                                                } else if (listSplit$default2.size() == 2) {
                                                    str20 = listSplit$default2.get(0) + Separators.QUOTE;
                                                }
                                            }
                                            y6n y6nVar = ge30Var.j == 0 ? y6n.f42107a : y6n.b;
                                            ggm ggmVar = i4 == 0 ? arrayList5.size() + (-1) == 0 ? ggm.c : ggm.f11256a : i4 == arrayList5.size() + (-1) ? ggm.b : ggm.d;
                                            lc00VarB.add((str23.length() == 0 && str22.length() == 0) ? new sim(str20, str21, thoVar.name(), y6nVar, ggmVar, ge30Var.b()) : new rim(str20, str21, new lnm(str23, str22, 0, "", new s0m("", ""), ge30Var.k), ge30Var.a() ? new lnm(ge30Var.h, ge30Var.g, 0, "", new s0m("", ""), ge30Var.l) : null, thoVar.name(), null, y6nVar, ggmVar, ge30Var.b()));
                                            it3 = it4;
                                            i4 = i5;
                                            jLongValue = j4;
                                            i = 0;
                                        }
                                    }
                                    it3 = it3;
                                    jLongValue = jLongValue;
                                    i = 0;
                                }
                                i4 i4VarR0 = dyb.r0(kotlin.collections.a.a(lc00VarB));
                                dja djaVar3 = dja.PENALTY;
                                return new gax(new sf30(i4VarR0));
                            }
                        }
                        return null;
                    case 6:
                        vzj0 vzj0Var = (vzj0) obj;
                        if (!(((fee) rjsVar.B.getValue()).b() instanceof qrr) && vzj0Var != null) {
                            anq0 anq0Var3 = (anq0) ((fee) rjsVar.H.getValue()).c();
                            ctf0 ctf0Var6 = rjsVar.f30611a;
                            ctf0Var6.getClass();
                            znq0 znq0Var = anq0Var3 != null ? anq0Var3.h : null;
                            if (znq0Var != null) {
                                long j5 = znq0Var.f44687a;
                                if (j5 <= 0) {
                                    qal0Var = null;
                                } else {
                                    long j6 = j5 / 86400;
                                    qal0Var = new qal0(j6 > 0 ? ctf0Var6.b.a(R.string.line_time_before_v2, Arrays.copyOf(new Object[]{String.valueOf(j6)}, 1)) : ctf0Var6.b.a(R.string.before_start, Arrays.copyOf(new Object[0], 0)), yyw.L((((j5 < 0 ? 0L : j5) / 60) / 60) % 24), yyw.L(((j5 < 0 ? 0L : j5) / 60) % 60), yyw.L((j5 >= 0 ? j5 : 0L) % 60));
                                }
                            } else {
                                qal0Var = null;
                            }
                            if (vzj0Var instanceof tzj0) {
                                tzj0 tzj0Var = (tzj0) vzj0Var;
                                b0k0Var = new yzj0(tzj0Var.f34807a, tzj0Var.b, tzj0Var.c, tzj0Var.d, qal0Var);
                            } else if (vzj0Var instanceof uzj0) {
                                uzj0 uzj0Var = (uzj0) vzj0Var;
                                b0k0Var = new b0k0(uzj0Var.f36538a, uzj0Var.b, uzj0Var.c, uzj0Var.d, qal0Var);
                            } else {
                                t9f.b();
                            }
                            return b0k0Var;
                        }
                        return null;
                    case 7:
                        boolean zBooleanValue4 = ((Boolean) obj).booleanValue();
                        long jLongValue2 = ((Number) ((fee) rjsVar.j.getValue()).c()).longValue();
                        boolean zBooleanValue5 = ((Boolean) ((fee) rjsVar.i.getValue()).c()).booleanValue();
                        long jLongValue3 = ((Number) ((fee) rjsVar.k.getValue()).c()).longValue();
                        long jLongValue4 = ((Number) ((fee) rjsVar.m.getValue()).c()).longValue();
                        Long l = (Long) ((fee) rjsVar.l.getValue()).c();
                        long jLongValue5 = l != null ? l.longValue() : -1L;
                        if (zBooleanValue4) {
                            return new sym0(new MarketsCategoriesParams(jLongValue2, jLongValue3, jLongValue4, new zq2(), "", zBooleanValue5));
                        }
                        tef0 tef0Var = tef0.f33818a;
                        xuz xuzVar = pb10.c;
                        return new vym0(new RelatedParams(zBooleanValue5, jLongValue2, jLongValue4, -1L, jLongValue5, tef0Var));
                    case 8:
                        return a(obj);
                    case 9:
                        fsr fsrVar = (fsr) obj;
                        if ((fsrVar == null || !fsrVar.b) && (fsrVar == null || !fsrVar.c)) {
                            return k49.f17656a;
                        }
                        o49 o49Var = (o49) ((fee) rjsVar.y.getValue()).c();
                        ctf0 ctf0Var7 = rjsVar.f30611a;
                        zvh0 zvh0Var2 = rjsVar.b;
                        fsrVar.getClass();
                        ctf0Var7.getClass();
                        ArrayList arrayList6 = new ArrayList();
                        if (fsrVar.b) {
                            arrayList6.add(new g49(ctf0Var7.b.a(R.string.video, Arrays.copyOf(new Object[0], 0))));
                        }
                        if (fsrVar.c) {
                            arrayList6.add(new h49(ctf0Var7.b.a(R.string.play_zone, Arrays.copyOf(new Object[0], 0))));
                        }
                        if (o49Var == null) {
                            g49Var = (i49) CollectionsKt.U(arrayList6);
                        } else {
                            int iOrdinal = o49Var.ordinal();
                            if (iOrdinal == 0) {
                                g49Var = new g49(ctf0Var7.b.a(R.string.video, Arrays.copyOf(new Object[0], 0)));
                            } else {
                                if (iOrdinal != 1) {
                                    t9f.b();
                                    return null;
                                }
                                g49Var = new h49(ctf0Var7.b.a(R.string.play_zone, Arrays.copyOf(new Object[0], 0)));
                            }
                            if (arrayList6.isEmpty()) {
                                g49Var = null;
                            } else {
                                Iterator it5 = arrayList6.iterator();
                                do {
                                    if (!it5.hasNext()) {
                                        g49Var = null;
                                    }
                                } while (!Intrinsics.d((i49) it5.next(), g49Var));
                            }
                            if (g49Var == null) {
                                g49Var = (i49) CollectionsKt.U(arrayList6);
                            }
                        }
                        bfu0 bfu0Var = fsrVar.f10077a;
                        GameBroadcastingParams gameBroadcastingParams = new GameBroadcastingParams(bfu0Var.f2522a, bfu0Var.c, bfu0Var.f, bfu0Var.b, bfu0Var.e, bfu0Var.d, bfu0Var.g, null);
                        Iterator it6 = arrayList6.iterator();
                        int i6 = 0;
                        while (true) {
                            if (!it6.hasNext()) {
                                i6 = -1;
                            } else if (!Intrinsics.d((i49) it6.next(), g49Var)) {
                                i6++;
                            }
                        }
                        int i7 = i6;
                        i4 i4VarR1 = dyb.r0(arrayList6);
                        boolean z5 = arrayList6.size() > 1;
                        int iOrdinal2 = zvh0Var2.ordinal();
                        if (iOrdinal2 == 0) {
                            dxh0Var = axh0.f1625a;
                        } else if (iOrdinal2 == 1) {
                            dxh0Var = zwh0.f45106a;
                        } else if (iOrdinal2 == 2) {
                            dxh0Var = cxh0.f5122a;
                        } else {
                            if (iOrdinal2 != 3) {
                                t9f.b();
                                return null;
                            }
                            dxh0Var = bxh0.f3376a;
                        }
                        dxh0 dxh0Var2 = dxh0Var;
                        ArrayList arrayList7 = new ArrayList(r3d.q(arrayList6, 10));
                        Iterator it7 = arrayList6.iterator();
                        while (it7.hasNext()) {
                            arrayList7.add(new yvh0(((i49) it7.next()).getDescription(), bwh0.f3325a));
                        }
                        return new j49(gameBroadcastingParams, i7, g49Var, i4VarR1, z5, dxh0Var2, dyb.r0(arrayList7));
                    case 10:
                        return b(obj);
                    default:
                        gna gnaVar5 = (gna) obj;
                        if ((gnaVar5 instanceof ena ? (ena) gnaVar5 : null) == null || (hnaVar = ((ena) gnaVar5).j) == null) {
                            return null;
                        }
                        boolean zContains4 = ((List) ((fee) rjsVar.o.getValue()).c()).contains(ch00.SHORT_STATISTIC);
                        ctf0 ctf0Var8 = rjsVar.f30611a;
                        ctf0Var8.getClass();
                        List<vrj0> list11 = hnaVar.f;
                        ArrayList arrayList8 = new ArrayList(r3d.q(list11, 10));
                        for (vrj0 vrj0Var : list11) {
                            float fS = r7x.s(vrj0Var.b);
                            float fS2 = r7x.s(vrj0Var.c);
                            String str24 = vrj0Var.f37902a;
                            String str25 = vrj0Var.b;
                            String str26 = vrj0Var.c;
                            if (fS == 0.0f && fS2 == 0.0f) {
                                fS = 0.0f;
                            }
                            arrayList8.add(new srj0(fS, (fS == 0.0f && fS2 == 0.0f) ? 0.0f : fS2, str24, str25, str26));
                        }
                        dja djaVar4 = dja.PENALTY;
                        ch00 ch00Var4 = ch00.SHORT_STATISTIC;
                        i4 i4VarR2 = zContains4 ? dyb.r0(arrayList8) : dyb.r0(CollectionsKt.D0(arrayList8, 3));
                        if (arrayList8.size() - 1 > 3) {
                            lsm0 lsm0Var = ctf0Var8.b;
                            lmoVar = new lmo(lsm0Var.a(R.string.expand, Arrays.copyOf(new Object[0], 0)), lsm0Var.a(R.string.collapse, Arrays.copyOf(new Object[0], 0)), zContains4);
                        } else {
                            lmoVar = null;
                        }
                        return new hax(i4VarR2, lmoVar);
                }
            }
        }, (byte) 20));
        this.I = maz.b(new yw9(njsVar.R, new dcr((byte) 28), (byte) 20));
        this.J = bkb.G(a().d, new dcr((byte) 29));
        final byte b10 = 4;
        this.K = bkb.G(a().d, new Function1(this) { // from class: a.qjs
            public final /* synthetic */ rjs b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:260:0x08d4  */
            /* JADX WARN: Code duplicated, block: B:262:0x08e4  */
            /* JADX WARN: Code duplicated, block: B:265:0x090f  */
            /* JADX WARN: Code duplicated, block: B:268:0x0932  */
            /* JADX WARN: Code duplicated, block: B:270:0x0936  */
            /* JADX WARN: Code duplicated, block: B:272:0x094e  */
            private final Object a(Object obj) {
                n0o0 n0o0Var;
                n0o0 n0o0Var2;
                String str;
                String str2;
                mqr kqrVar;
                String strG;
                d3h0 pekVar;
                String strN;
                d3h0 xakVar;
                Integer num;
                String strN2;
                int i;
                iul0 iul0Var;
                yd90 yd90Var;
                yd90 yd90Var2;
                iul0 iul0Var2;
                String str3;
                String str4;
                d3h0 bekVar;
                String strA;
                String strB;
                String strN3;
                rjs rjsVar = this.b;
                n0o0 n0o0Var3 = rjsVar.v;
                n0o0 n0o0Var4 = rjsVar.m;
                n0o0 n0o0Var5 = rjsVar.H;
                n0o0 n0o0Var6 = rjsVar.I;
                ctf0 ctf0Var2 = rjsVar.f30611a;
                gna gnaVar = (gna) obj;
                if (gnaVar != null) {
                    if (!(gnaVar instanceof ena)) {
                        if (gnaVar instanceof fna) {
                            ctf0Var2.getClass();
                            return new orr(d9x.L(((fna) gnaVar).f9825a, ctf0Var2));
                        }
                        t9f.b();
                        return null;
                    }
                    ena enaVar = (ena) gnaVar;
                    mca mcaVar = enaVar.f8084a;
                    List list = (List) ((fee) rjsVar.n.getValue()).c();
                    boolean zBooleanValue = ((Boolean) ((fee) rjsVar.e.getValue()).c()).booleanValue();
                    mpm mpmVar = (mpm) ((fee) n0o0Var6.getValue()).b();
                    boolean z = enaVar.p;
                    String str5 = (String) ((fee) rjsVar.p.getValue()).c();
                    String str6 = (String) ((fee) rjsVar.q.getValue()).c();
                    String str7 = (String) ((fee) rjsVar.r.getValue()).c();
                    String str8 = (String) ((fee) rjsVar.s.getValue()).c();
                    jg30 jg30Var = (jg30) ((fee) n0o0Var5.getValue()).b();
                    bg30 bg30Var = (bg30) ((fee) n0o0Var6.getValue()).c();
                    znq0 znq0Var = (znq0) ((fee) rjsVar.t.getValue()).c();
                    bha bhaVar = enaVar.o;
                    ui9 ui9Var = (ui9) ((fee) rjsVar.u.getValue()).c();
                    long jLongValue = ((Number) ((fee) n0o0Var4.getValue()).c()).longValue();
                    boolean zBooleanValue2 = ((Boolean) ((fee) n0o0Var3.getValue()).c()).booleanValue();
                    ctf0Var2.getClass();
                    if (ui9Var != null) {
                        int i2 = ui9Var.c;
                        int i3 = ui9Var.d;
                        n0o0Var = n0o0Var4;
                        String strN4 = (cy7.c() && zBooleanValue2) ? w6x.n(i3, i2, " : ") : w6x.n(i2, i3, " : ");
                        String strX = j0x.x(jLongValue, ctf0Var2);
                        ArrayList arrayList = ui9Var.f35720a;
                        n0o0Var2 = n0o0Var5;
                        str = str5;
                        str2 = str6;
                        ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
                        int i4 = 0;
                        for (Object obj2 : arrayList) {
                            int i5 = i4 + 1;
                            if (i4 < 0) {
                                q3d.p();
                                throw null;
                            }
                            arrayList2.add(piz.W((sc90) obj2, jLongValue, i4));
                            i4 = i5;
                        }
                        i4 i4VarR0 = dyb.r0(arrayList2);
                        ArrayList arrayList3 = ui9Var.b;
                        ArrayList arrayList4 = new ArrayList(r3d.q(arrayList3, 10));
                        int i6 = 0;
                        for (Object obj3 : arrayList3) {
                            int i7 = i6 + 1;
                            if (i6 < 0) {
                                q3d.p();
                                throw null;
                            }
                            arrayList4.add(piz.W((sc90) obj3, jLongValue, i6));
                            i6 = i7;
                        }
                        kqrVar = new iqr(strN4, strX, i4VarR0, dyb.r0(arrayList4));
                    } else {
                        n0o0Var = n0o0Var4;
                        n0o0Var2 = n0o0Var5;
                        str = str5;
                        str2 = str6;
                        if (bhaVar != null) {
                            float f = bhaVar.d;
                            float f2 = bhaVar.e;
                            float f3 = bhaVar.f;
                            Object[] objArr = {Float.valueOf(f3)};
                            lsm0 lsm0Var = ctf0Var2.b;
                            String strA2 = lsm0Var.a(R.string.n_percents, Arrays.copyOf(objArr, 1));
                            k3w0 g3w0Var = (f3 <= f2 || f3 <= f) ? new g3w0(strA2) : new i3w0(strA2);
                            String strA3 = lsm0Var.a(R.string.n_percents, Arrays.copyOf(new Object[]{Float.valueOf(f2)}, 1));
                            k3w0 g3w0Var2 = (f2 <= f3 || f2 <= f) ? new g3w0(strA3) : new i3w0(strA3);
                            String strA4 = lsm0Var.a(R.string.n_percents, Arrays.copyOf(new Object[]{Float.valueOf(f)}, 1));
                            kqrVar = new kqr(g3w0Var, g3w0Var2, (f <= f3 || f <= f2) ? new g3w0(strA4) : new i3w0(strA4));
                        } else {
                            kqrVar = null;
                        }
                    }
                    anq0 anq0Var2 = (anq0) ((fee) n0o0Var2.getValue()).c();
                    boolean z2 = anq0Var2 != null ? anq0Var2.f1167a : false;
                    long jLongValue2 = ((Number) ((fee) n0o0Var.getValue()).c()).longValue();
                    boolean zBooleanValue3 = ((Boolean) ((fee) n0o0Var3.getValue()).c()).booleanValue();
                    list.getClass();
                    mpmVar.getClass();
                    String strA5 = "";
                    if (mcaVar instanceof pca) {
                        pca pcaVar = (pca) mcaVar;
                        uqr uqrVarR0 = pzb.r0(mcaVar, str, str2, str7, str8, jg30Var);
                        if (bg30Var == null || (bekVar = bg30Var.b) == null) {
                            bekVar = bg30Var != null ? bg30Var.f2536a : new bek();
                        }
                        d3h0 d3h0Var = bekVar;
                        boolean z3 = d3h0Var instanceof lz10;
                        lz10 lz10Var = z3 ? (lz10) d3h0Var : null;
                        if (lz10Var != null) {
                            strA = vzb.T(lz10Var, zBooleanValue3);
                        } else {
                            hzm0 hzm0Var = d3h0Var instanceof hzm0 ? (hzm0) d3h0Var : null;
                            if (hzm0Var != null) {
                                String str9 = hzm0Var.g;
                                String str10 = hzm0Var.i;
                                StringBuilder sb = new StringBuilder("\u2066");
                                if (cy7.c() && zBooleanValue3) {
                                    if (str10 != null) {
                                        hne.B(sb, "(ov ", str10, Separators.RPAREN);
                                    }
                                    sb.append(vzb.i0(str9));
                                } else {
                                    sb.append(str9);
                                    if (str10 != null) {
                                        hne.B(sb, Separators.LPAREN, str10, " ov)");
                                    }
                                }
                                sb.append("\u2069");
                                strA = sb.toString();
                            } else {
                                strA = d3h0Var.a();
                            }
                        }
                        String str11 = strA;
                        lz10 lz10Var2 = z3 ? (lz10) d3h0Var : null;
                        if (lz10Var2 != null) {
                            strB = vzb.U(lz10Var2, zBooleanValue3);
                        } else {
                            hzm0 hzm0Var2 = d3h0Var instanceof hzm0 ? (hzm0) d3h0Var : null;
                            if (hzm0Var2 != null) {
                                String str12 = hzm0Var2.h;
                                String str13 = hzm0Var2.j;
                                StringBuilder sb2 = new StringBuilder("\u2066");
                                if (cy7.c() && zBooleanValue3) {
                                    if (str13 != null) {
                                        hne.B(sb2, "(ov ", str13, Separators.RPAREN);
                                    }
                                    sb2.append(vzb.i0(str12));
                                } else {
                                    sb2.append(str12);
                                    if (str13 != null) {
                                        hne.B(sb2, Separators.LPAREN, str13, " ov)");
                                    }
                                }
                                sb2.append("\u2069");
                                strB = sb2.toString();
                            } else {
                                strB = d3h0Var.b();
                            }
                        }
                        String str14 = strB;
                        boolean z4 = pcaVar.d;
                        rpp0 rpp0Var = pcaVar.f26749a;
                        j83 j83VarH = vzb.H(ctf0Var2, d3h0Var, pcaVar.e, pcaVar.f, pcaVar.g, (bg30Var == null || (strN3 = bg30Var.f2536a.n()) == null) ? "" : strN3, z4, zBooleanValue3);
                        String strB2 = rpp0Var.b();
                        c280 c280Var = new c280(vsm0.s(rpp0Var.a(), pcaVar.b), R.drawable.ic_glyph_placeholder_player);
                        long jA = rpp0Var.a();
                        bap bapVar = bap.b;
                        jdp0 jdp0Var = new jdp0(strB2, n6x.o0(c280Var, jA, list, zBooleanValue, bapVar), null);
                        jdp0 jdp0Var2 = new jdp0(rpp0Var.d(), n6x.o0(new c280(vsm0.s(rpp0Var.c(), pcaVar.c), R.drawable.ic_glyph_placeholder_player), rpp0Var.c(), list, zBooleanValue, bapVar), null);
                        lz10 lz10Var3 = z3 ? (lz10) d3h0Var : null;
                        return new mrr(uqrVarR0, jdp0Var, jdp0Var2, j83VarH, lz10Var3 != null ? vzb.G(lz10Var3.i) : eex.c, str11, d3h0Var.j(), str14, d3h0Var.i());
                    }
                    boolean z5 = z2;
                    String str15 = str;
                    String str16 = str2;
                    boolean z6 = mcaVar instanceof tca;
                    qpm qpmVar = qpm.f29126a;
                    if (z6) {
                        tca tcaVar = (tca) mcaVar;
                        uqr uqrVarR1 = pzb.r0(mcaVar, str15, str16, str7, str8, jg30Var);
                        znq0 znq0Var2 = new znq0(znq0Var != null ? znq0Var.f44687a : 0L);
                        rpp0 rpp0Var2 = tcaVar.f33711a;
                        boolean z7 = tcaVar.i;
                        if (rpp0Var2 instanceof qpp0) {
                            qpp0 qpp0Var = (qpp0) rpp0Var2;
                            jdp0 jdp0Var3 = new jdp0(qpp0Var.g, n6x.o0(u1c.C(tcaVar, true), qpp0Var.e, list, zBooleanValue || z7, bap.b), null);
                            jdp0 jdp0Var4 = new jdp0(qpp0Var.h, n6x.o0(u1c.C(tcaVar, false), qpp0Var.f, list, zBooleanValue || z7, bap.f2271a), null);
                            lpm lpmVar = new lpm(qpmVar, new hpm(0L, 3));
                            dpi0 dpi0Var = new dpi0((byte) 15);
                            rdj rdjVar = rdj.f30294a;
                            vzb.E(dpi0Var, rdj.g(znq0Var2, efj.UNIVERSAL, Boolean.valueOf(z), false, 56));
                            return new trr(uqrVarR1, jdp0Var3, jdp0Var4, lpmVar, ((h83) dpi0Var.f6468a).h(), kqrVar);
                        }
                        if (!(rpp0Var2 instanceof ppp0)) {
                            t9f.b();
                            return null;
                        }
                        ppp0 ppp0Var = (ppp0) rpp0Var2;
                        xcp0 xcp0VarC0 = b8k0.c0(ppp0Var.e, ppp0Var.g, tcaVar.b);
                        xcp0 xcp0VarC1 = b8k0.c0(ppp0Var.f, ppp0Var.h, tcaVar.c);
                        lpm lpmVar2 = new lpm(qpmVar, new hpm(0L, 3));
                        dpi0 dpi0Var2 = new dpi0((byte) 15);
                        rdj rdjVar2 = rdj.f30294a;
                        vzb.E(dpi0Var2, rdj.g(znq0Var2, efj.UNIVERSAL, Boolean.valueOf(z), false, 56));
                        return new trr(uqrVarR1, xcp0VarC0, xcp0VarC1, lpmVar2, ((h83) dpi0Var2.f6468a).h(), kqrVar);
                    }
                    if (!(mcaVar instanceof xca)) {
                        if (mcaVar instanceof gda) {
                            gda gdaVar = (gda) mcaVar;
                            uqr uqrVarR2 = pzb.r0(mcaVar, str15, str16, str7, str8, jg30Var);
                            znq0 znq0Var3 = new znq0(znq0Var != null ? znq0Var.f44687a : 0L);
                            String strB0 = CollectionsKt.b0(gdaVar.f11094a, Separators.SLASH, null, null, null, 62);
                            String strB1 = CollectionsKt.b0(gdaVar.b, Separators.SLASH, null, null, null, 62);
                            lpm lpmVar3 = new lpm(qpmVar, new hpm(0L, 3));
                            dpi0 dpi0Var3 = new dpi0((byte) 15);
                            rdj rdjVar3 = rdj.f30294a;
                            vzb.E(dpi0Var3, rdj.g(znq0Var3, efj.UNIVERSAL, Boolean.valueOf(z), false, 56));
                            return new rrr(uqrVarR2, strB0, strB1, lpmVar3, ((h83) dpi0Var3.f6468a).h());
                        }
                        if (mcaVar instanceof hda) {
                            hda hdaVar = (hda) mcaVar;
                            uqr uqrVarR3 = pzb.r0(mcaVar, str15, str16, str7, str8, jg30Var);
                            if (bg30Var == null || (pekVar = bg30Var.b) == null) {
                                pekVar = bg30Var != null ? bg30Var.f2536a : new pek();
                            }
                            return new rrr(uqrVarR3, CollectionsKt.b0(hdaVar.f12861a, Separators.SLASH, null, null, null, 62), CollectionsKt.b0(hdaVar.b, Separators.SLASH, null, null, null, 62), mpmVar, vzb.H(ctf0Var2, pekVar, hdaVar.h, hdaVar.i, hdaVar.j, (bg30Var == null || (strN = bg30Var.f2536a.n()) == null) ? "" : strN, hdaVar.g, zBooleanValue3));
                        }
                        if (!(mcaVar instanceof ida)) {
                            t9f.b();
                            return null;
                        }
                        ida idaVar = (ida) mcaVar;
                        uqr uqrVarR4 = pzb.r0(mcaVar, str15, str16, str7, str8, jg30Var);
                        if (!idaVar.g) {
                            if (znq0Var != null) {
                                rdj rdjVar4 = rdj.f30294a;
                                strG = rdj.g(znq0Var, efj.UNIVERSAL, Boolean.valueOf(z), false, 56);
                                if (strG == null) {
                                }
                            }
                            dpi0 dpi0Var13 = new dpi0((byte) 15);
                            vzb.E(dpi0Var13, strG);
                            return new vrr(uqrVarR4, idaVar.e, ((h83) dpi0Var13.f6468a).h());
                        }
                        strA5 = ctf0Var2.b.a(R.string.game_end, Arrays.copyOf(new Object[0], 0));
                        strG = strA5;
                        dpi0 dpi0Var14 = new dpi0((byte) 15);
                        vzb.E(dpi0Var14, strG);
                        return new vrr(uqrVarR4, idaVar.e, ((h83) dpi0Var14.f6468a).h());
                    }
                    if (!gql0.d().contains(Long.valueOf(jLongValue2))) {
                        xca xcaVar = (xca) mcaVar;
                        uqr uqrVarR5 = pzb.r0(mcaVar, str15, str16, str7, str8, jg30Var);
                        if (bg30Var == null || (xakVar = bg30Var.b) == null) {
                            xakVar = bg30Var != null ? bg30Var.f2536a : new xak((byte) 22);
                        }
                        boolean z8 = xcaVar.l;
                        boolean z9 = xcaVar.q;
                        rpp0 rpp0Var3 = xcaVar.f40636a;
                        j83 j83VarH2 = vzb.H(ctf0Var2, xakVar, xcaVar.n, xcaVar.o, xcaVar.p, (bg30Var == null || (strN2 = bg30Var.f2536a.n()) == null) ? "" : strN2, z8, zBooleanValue3);
                        if (!(rpp0Var3 instanceof qpp0)) {
                            if (rpp0Var3 instanceof ppp0) {
                                ppp0 ppp0Var2 = (ppp0) rpp0Var3;
                                return new trr(uqrVarR5, b8k0.c0(ppp0Var2.e, ppp0Var2.g, xcaVar.h), b8k0.c0(ppp0Var2.f, ppp0Var2.h, xcaVar.i), mpmVar, j83VarH2, kqrVar);
                            }
                            t9f.b();
                            return null;
                        }
                        int i8 = xcaVar.b;
                        int i9 = xcaVar.g;
                        int i10 = xcaVar.f;
                        int i11 = xcaVar.d;
                        int i12 = xcaVar.c;
                        vy vyVar = (i8 == 0 && i12 == 0 && i11 == 0) ? null : new vy(i8 > 0 ? Integer.valueOf(i8) : null, i12 > 0 ? Integer.valueOf(i12) : null, i11 > 0 ? Integer.valueOf(i11) : null);
                        int i13 = xcaVar.e;
                        vy vyVar2 = (i13 == 0 && i10 == 0 && i9 == 0) ? null : new vy(i13 > 0 ? Integer.valueOf(i13) : null, i10 > 0 ? Integer.valueOf(i10) : null, i9 > 0 ? Integer.valueOf(i9) : null);
                        boolean z10 = (vyVar == null && vyVar2 == null) ? false : true;
                        if (z10 && vyVar == null) {
                            num = null;
                            vyVar = new vy(null, null, null);
                        } else {
                            num = null;
                        }
                        if (z10 && vyVar2 == null) {
                            vyVar2 = new vy(num, num, num);
                        }
                        qpp0 qpp0Var2 = (qpp0) rpp0Var3;
                        return new trr(uqrVarR5, new jdp0(qpp0Var2.g, n6x.o0(u1c.D(xcaVar, true), qpp0Var2.e, list, zBooleanValue || z9, bap.b), vyVar), new jdp0(qpp0Var2.h, n6x.o0(u1c.D(xcaVar, false), qpp0Var2.f, list, zBooleanValue || z9, bap.f2271a), vyVar2), mpmVar, j83VarH2, kqrVar);
                    }
                    xca xcaVar2 = (xca) mcaVar;
                    long j = znq0Var != null ? znq0Var.f44687a : 0L;
                    uqr uqrVarR6 = pzb.r0(mcaVar, str15, str16, str7, str8, jg30Var);
                    znq0 znq0Var4 = new znq0(j);
                    pz10 pz10Var = bg30Var != null ? bg30Var.f2536a : null;
                    if (pz10Var instanceof nz10) {
                        izm0 izm0Var = bg30Var.b;
                        String str17 = xcaVar2.s;
                        List list2 = xcaVar2.i;
                        List list3 = xcaVar2.h;
                        rpp0 rpp0Var4 = xcaVar2.f40636a;
                        boolean z11 = xcaVar2.l;
                        String str18 = xcaVar2.p;
                        rdj rdjVar5 = rdj.f30294a;
                        pz10 pz10Var2 = pz10Var;
                        String strG2 = rdj.g(znq0Var4, efj.UNIVERSAL, Boolean.valueOf(z), false, 56);
                        str18.getClass();
                        strG2.getClass();
                        dpi0 dpi0Var15 = new dpi0((byte) 15);
                        if (str17 != null) {
                            vzb.E(dpi0Var15, str17);
                            vzb.E(dpi0Var15, ": ");
                            boolean z12 = cy7.c() && zBooleanValue3;
                            if (izm0Var == null) {
                                vzb.E(dpi0Var15, "0");
                                vzb.C(dpi0Var15);
                                vzb.E(dpi0Var15, "0");
                            } else {
                                if (!(izm0Var instanceof gzm0) && !(izm0Var instanceof hzm0)) {
                                    t9f.b();
                                    return null;
                                }
                                boolean z13 = izm0Var instanceof hzm0;
                                String strA6 = z13 ? ((hzm0) izm0Var).g : izm0Var.a();
                                String strB3 = z13 ? ((hzm0) izm0Var).h : izm0Var.b();
                                vzb.E(dpi0Var15, "\u2066");
                                if (z12) {
                                    vzb.D(dpi0Var15, strB3, vzb.L(izm0Var.i()));
                                    vzb.C(dpi0Var15);
                                    vzb.D(dpi0Var15, strA6, vzb.L(izm0Var.j()));
                                } else {
                                    vzb.D(dpi0Var15, strA6, vzb.L(izm0Var.j()));
                                    vzb.C(dpi0Var15);
                                    vzb.D(dpi0Var15, strB3, vzb.L(izm0Var.i()));
                                }
                                vzb.E(dpi0Var15, "\u2069");
                            }
                        } else {
                            vzb.E(dpi0Var15, strG2);
                            if (str18.length() > 0) {
                                vzb.A(dpi0Var15);
                                vzb.E(dpi0Var15, str18);
                            }
                            if (z11) {
                                vzb.A(dpi0Var15);
                                i = 0;
                                vzb.E(dpi0Var15, ctf0Var2.b.a(R.string.game_end, Arrays.copyOf(new Object[0], 0)));
                            } else {
                                i = 0;
                            }
                            if (z5) {
                                vzb.A(dpi0Var15);
                                vzb.E(dpi0Var15, ctf0Var2.b.a(R.string.card_cricket_break, Arrays.copyOf(new Object[i], i)));
                            }
                        }
                        j83 j83VarH3 = ((h83) dpi0Var15.f6468a).h();
                        nz10 nz10Var = (nz10) pz10Var2;
                        boolean z14 = nz10Var instanceof mz10;
                        k5q0 k5q0Var = k5q0.b;
                        if (!z14) {
                            if (nz10Var instanceof oz10) {
                                oz10 oz10Var = (oz10) nz10Var;
                                String str19 = oz10Var.i;
                                String str20 = oz10Var.g;
                                String str21 = oz10Var.m;
                                String str22 = oz10Var.k;
                                boolean z15 = ((StringsKt.W(str22) || str22.equals("0")) && (StringsKt.W(str21) || str21.equals("0"))) ? false : true;
                                boolean z16 = str20.length() > 0 || str19.length() > 0;
                                eex eexVarG = vzb.G(oz10Var.o);
                                ArrayList arrayList5 = oz10Var.f;
                                ArrayList arrayList6 = new ArrayList(r3d.q(arrayList5, 10));
                                Iterator it = arrayList5.iterator();
                                while (it.hasNext()) {
                                    te90 te90Var = (te90) it.next();
                                    arrayList6.add(new yd90(vzb.O(te90Var), vzb.Q(te90Var), te90Var.f33809a));
                                    it = it;
                                    z15 = z15;
                                }
                                boolean z17 = z15;
                                i4 i4VarR1 = dyb.r0(arrayList6);
                                j83 j83VarN = vzb.N(nz10Var);
                                j83 j83VarP = vzb.P(nz10Var);
                                lsm0 lsm0Var2 = ctf0Var2.b;
                                yd90 yd90Var3 = new yd90(j83VarN, j83VarP, lsm0Var2.a(R.string.total_count, Arrays.copyOf(new Object[0], 0)));
                                if (z17) {
                                    h83 h83Var = new h83();
                                    long j2 = y3d.g;
                                    long j3 = daq0.c;
                                    smk0 smk0Var = new smk0(vzb.L(oz10Var.l), j3, null, null, null, null, null, j3, new j56(0.0f), null, null, j2, k5q0Var, null, null, 17424);
                                    h83Var.c(str22);
                                    j83 j83VarC = kng0.c(h83Var.f12607a, h83Var, smk0Var, 0);
                                    h83 h83Var2 = new h83();
                                    smk0 smk0Var2 = new smk0(vzb.L(oz10Var.n), j3, null, null, null, null, null, j3, new j56(0.0f), null, null, j2, k5q0Var, null, null, 17424);
                                    h83Var2.c(str21);
                                    yd90Var = new yd90(j83VarC, kng0.c(h83Var2.f12607a, h83Var2, smk0Var2, 0), lsm0Var2.a(R.string.dt_points, Arrays.copyOf(new Object[0], 0)));
                                } else {
                                    yd90Var = null;
                                }
                                if (z16) {
                                    h83 h83Var3 = new h83();
                                    long j4 = y3d.g;
                                    long j5 = daq0.c;
                                    smk0 smk0Var3 = new smk0(vzb.L(oz10Var.h), j5, null, null, null, null, null, j5, new j56(0.0f), null, null, j4, k5q0Var, null, null, 17424);
                                    h83Var3.c(str20);
                                    j83 j83VarC2 = kng0.c(h83Var3.f12607a, h83Var3, smk0Var3, 0);
                                    h83 h83Var4 = new h83();
                                    smk0 smk0Var4 = new smk0(vzb.L(oz10Var.j), j5, null, null, null, null, null, j5, new j56(0.0f), null, null, j4, k5q0Var, null, null, 17424);
                                    h83Var4.c(str19);
                                    yd90Var2 = new yd90(j83VarC2, kng0.c(h83Var4.f12607a, h83Var4, smk0Var4, 0), lsm0Var2.a(R.string.tennis_game_column, Arrays.copyOf(new Object[0], 0)));
                                } else {
                                    yd90Var2 = null;
                                }
                                iul0Var2 = new iul0(eexVarG, i4VarR1, yd90Var3, yd90Var2, yd90Var);
                            } else {
                                if (!(nz10Var instanceof kz10)) {
                                    t9f.b();
                                    return null;
                                }
                                kz10 kz10Var = (kz10) nz10Var;
                                eex eexVarG2 = vzb.G(kz10Var.g);
                                ArrayList<te90> arrayList7 = kz10Var.f;
                                ArrayList arrayList8 = new ArrayList(r3d.q(arrayList7, 10));
                                for (te90 te90Var2 : arrayList7) {
                                    arrayList8.add(new yd90(vzb.O(te90Var2), vzb.Q(te90Var2), te90Var2.f33809a));
                                }
                                iul0Var = new iul0(eexVarG2, dyb.r0(arrayList8), new yd90(vzb.N(nz10Var), vzb.P(nz10Var), ctf0Var2.b.a(R.string.total_count, Arrays.copyOf(new Object[0], 0))), null, null);
                            }
                            if (rpp0Var4 instanceof qpp0) {
                                if (rpp0Var4 instanceof ppp0) {
                                    ppp0 ppp0Var12 = (ppp0) rpp0Var4;
                                    return new xrr(uqrVarR6, b8k0.c0(ppp0Var12.e, ppp0Var12.g, list3), b8k0.c0(ppp0Var12.f, ppp0Var12.h, list2), j83VarH3, iul0Var2);
                                }
                                t9f.b();
                                return null;
                            }
                            qpp0 qpp0Var12 = (qpp0) rpp0Var4;
                            String str2113 = qpp0Var12.g;
                            str3 = (String) CollectionsKt.firstOrNull(list3);
                            if (str3 == null) {
                                str3 = "";
                            }
                            c280 c280Var11 = new c280(vsm0.s(qpp0Var12.e, str3), R.drawable.ic_glyph_placeholder_player);
                            long j17 = qpp0Var12.e;
                            bap bapVar11 = bap.b;
                            jdp0 jdp0Var14 = new jdp0(str2113, n6x.o0(c280Var11, j17, list, zBooleanValue, bapVar11), null);
                            String str2114 = qpp0Var12.h;
                            str4 = (String) CollectionsKt.firstOrNull(list2);
                            if (str4 == null) {
                                str4 = "";
                            }
                            return new xrr(uqrVarR6, jdp0Var14, new jdp0(str2114, n6x.o0(new c280(vsm0.s(qpp0Var12.f, str4), R.drawable.ic_glyph_placeholder_player), qpp0Var12.f, list, zBooleanValue, bapVar11), null), j83VarH3, iul0Var2);
                        }
                        mz10 mz10Var = (mz10) nz10Var;
                        eex eexVarG3 = vzb.G(mz10Var.g);
                        ArrayList<te90> arrayList9 = mz10Var.f;
                        ArrayList arrayList10 = new ArrayList(r3d.q(arrayList9, 10));
                        for (te90 te90Var3 : arrayList9) {
                            arrayList10.add(new yd90(vzb.O(te90Var3), vzb.Q(te90Var3), te90Var3.f33809a));
                        }
                        i4 i4VarR2 = dyb.r0(arrayList10);
                        j83 j83VarN2 = vzb.N(nz10Var);
                        j83 j83VarP2 = vzb.P(nz10Var);
                        lsm0 lsm0Var3 = ctf0Var2.b;
                        yd90 yd90Var4 = new yd90(j83VarN2, j83VarP2, lsm0Var3.a(R.string.total_count, Arrays.copyOf(new Object[0], 0)));
                        h83 h83Var5 = new h83();
                        String str25 = mz10Var.h;
                        long j7 = y3d.g;
                        long j8 = daq0.c;
                        smk0 smk0Var5 = new smk0(vzb.L(mz10Var.i), j8, null, null, null, null, null, j8, new j56(0.0f), null, null, j7, k5q0Var, null, null, 17424);
                        h83Var5.c(str25);
                        j83 j83VarC3 = kng0.c(h83Var5.f12607a, h83Var5, smk0Var5, 0);
                        h83 h83Var6 = new h83();
                        String str26 = mz10Var.j;
                        smk0 smk0Var6 = new smk0(vzb.L(mz10Var.k), j8, null, null, null, null, null, j8, new j56(0.0f), null, null, j7, k5q0Var, null, null, 17424);
                        h83Var6.c(str26);
                        iul0Var = new iul0(eexVarG3, i4VarR2, yd90Var4, null, new yd90(j83VarC3, kng0.c(h83Var6.f12607a, h83Var6, smk0Var6, 0), lsm0Var3.a(R.string.dt_points, Arrays.copyOf(new Object[0], 0))));
                        iul0Var2 = iul0Var;
                        if (rpp0Var4 instanceof qpp0) {
                            if (rpp0Var4 instanceof ppp0) {
                                ppp0 ppp0Var13 = (ppp0) rpp0Var4;
                                return new xrr(uqrVarR6, b8k0.c0(ppp0Var13.e, ppp0Var13.g, list3), b8k0.c0(ppp0Var13.f, ppp0Var13.h, list2), j83VarH3, iul0Var2);
                            }
                            t9f.b();
                            return null;
                        }
                        qpp0 qpp0Var13 = (qpp0) rpp0Var4;
                        String str2115 = qpp0Var13.g;
                        str3 = (String) CollectionsKt.firstOrNull(list3);
                        if (str3 == null) {
                            str3 = "";
                        }
                        c280 c280Var12 = new c280(vsm0.s(qpp0Var13.e, str3), R.drawable.ic_glyph_placeholder_player);
                        long j18 = qpp0Var13.e;
                        bap bapVar12 = bap.b;
                        jdp0 jdp0Var15 = new jdp0(str2115, n6x.o0(c280Var12, j18, list, zBooleanValue, bapVar12), null);
                        String str2116 = qpp0Var13.h;
                        str4 = (String) CollectionsKt.firstOrNull(list2);
                        if (str4 == null) {
                            str4 = "";
                        }
                        return new xrr(uqrVarR6, jdp0Var15, new jdp0(str2116, n6x.o0(new c280(vsm0.s(qpp0Var13.f, str4), R.drawable.ic_glyph_placeholder_player), qpp0Var13.f, list, zBooleanValue, bapVar12), null), j83VarH3, iul0Var2);
                    }
                }
                return qrr.f29223a;
            }

            /* JADX WARN: Code duplicated, block: B:18:0x008a  */
            private final Object b(Object obj) {
                String strG;
                lz10 lz10Var;
                float f;
                fad dadVar;
                sad qadVar;
                j83 j83VarC;
                j83 j83VarC2;
                gna gnaVar = (gna) obj;
                if (gnaVar == null) {
                    return null;
                }
                if (!(gnaVar instanceof ena)) {
                    if (gnaVar instanceof fna) {
                        return null;
                    }
                    t9f.b();
                    return null;
                }
                ena enaVar = (ena) gnaVar;
                mca mcaVar = enaVar.f8084a;
                rjs rjsVar = this.b;
                jg30 jg30Var = (jg30) ((fee) rjsVar.H.getValue()).b();
                bg30 bg30Var = (bg30) ((fee) rjsVar.I.getValue()).c();
                pz10 pz10Var = bg30Var != null ? bg30Var.f2536a : null;
                ctf0 ctf0Var2 = rjsVar.f30611a;
                boolean z = enaVar.p;
                znq0 znq0Var = (znq0) ((fee) rjsVar.t.getValue()).c();
                boolean zBooleanValue = ((Boolean) ((fee) rjsVar.v.getValue()).c()).booleanValue();
                ctf0Var2.getClass();
                dja djaVar = dja.PENALTY;
                k5q0 k5q0Var = k5q0.b;
                if (jg30Var != null) {
                    dadVar = new ead(jg30Var);
                    f = 0.0f;
                    lz10Var = null;
                } else {
                    h83 h83Var = new h83();
                    if (znq0Var != null) {
                        rdj rdjVar = rdj.f30294a;
                        strG = rdj.g(znq0Var, efj.UNIVERSAL, Boolean.valueOf(z), false, 56);
                        if (strG == null) {
                            strG = "";
                        }
                    } else {
                        strG = "";
                    }
                    pz40 pz40Var = s6t0.f31722a;
                    long textPrimary = s6t0.b().f33626a.getTextPrimary();
                    h83 h83Var2 = new h83();
                    long j = y3d.g;
                    long j2 = daq0.c;
                    lz10Var = null;
                    f = 0.0f;
                    smk0 smk0Var = new smk0(textPrimary, j2, null, null, null, null, null, j2, new j56(0.0f), null, null, j, k5q0Var, null, null, 17424);
                    h83Var2.c(strG);
                    StringBuilder sb = h83Var2.f12607a;
                    h83Var2.a(smk0Var, 0, sb.length());
                    sb.length();
                    h83Var.b(h83Var2.h());
                    dadVar = new dad(h83Var.h());
                }
                d3h0 cl5Var = pz10Var;
                if (mcaVar instanceof pca) {
                    if (pz10Var == null) {
                        cl5Var = new cl5((byte) 28);
                    }
                    rpp0 rpp0Var = ((pca) mcaVar).f26749a;
                    String strB = rpp0Var.b();
                    String strD = rpp0Var.d();
                    boolean z2 = cl5Var instanceof lz10;
                    lz10 lz10Var2 = z2 ? (lz10) cl5Var : lz10Var;
                    String strT = lz10Var2 != null ? vzb.T(lz10Var2, zBooleanValue) : "0";
                    lz10 lz10Var3 = z2 ? (lz10) cl5Var : lz10Var;
                    qadVar = new pad(strB, strD, strT, lz10Var3 != null ? vzb.U(lz10Var3, zBooleanValue) : "0", cl5Var.j(), cl5Var.i());
                } else if (mcaVar instanceof tca) {
                    rpp0 rpp0Var2 = ((tca) mcaVar).f33711a;
                    String strB2 = rpp0Var2.b();
                    String strD2 = rpp0Var2.d();
                    h83 h83Var3 = new h83();
                    String strA = ctf0Var2.b.a(R.string.vs, Arrays.copyOf(new Object[0], 0));
                    long j3 = y3d.g;
                    long j4 = daq0.c;
                    pz40 pz40Var2 = s6t0.f31722a;
                    smk0 smk0Var2 = new smk0(s6t0.b().f33626a.getTextPrimary(), j4, null, null, null, null, null, j4, new j56(f), null, null, j3, k5q0Var, null, null, 17424);
                    h83Var3.c(strA);
                    qadVar = new rad(kng0.c(h83Var3.f12607a, h83Var3, smk0Var2, 0), strB2, strD2);
                } else if (mcaVar instanceof xca) {
                    rpp0 rpp0Var3 = ((xca) mcaVar).f40636a;
                    String strB3 = rpp0Var3.b();
                    String strD3 = rpp0Var3.d();
                    if (pz10Var != null) {
                        j83VarC2 = vzb.M(pz10Var);
                    } else {
                        h83 h83Var4 = new h83();
                        String strA2 = ctf0Var2.b.a(R.string.vs, Arrays.copyOf(new Object[0], 0));
                        long j5 = y3d.g;
                        long j6 = daq0.c;
                        pz40 pz40Var3 = s6t0.f31722a;
                        smk0 smk0Var3 = new smk0(s6t0.b().f33626a.getTextPrimary(), j6, null, null, null, null, null, j6, new j56(f), null, null, j5, k5q0Var, null, null, 17424);
                        h83Var4.c(strA2);
                        j83VarC2 = kng0.c(h83Var4.f12607a, h83Var4, smk0Var3, 0);
                    }
                    qadVar = new rad(j83VarC2, strB3, strD3);
                } else if (mcaVar instanceof gda) {
                    gda gdaVar = (gda) mcaVar;
                    String strB0 = CollectionsKt.b0(gdaVar.f11094a, Separators.SLASH, null, null, null, 62);
                    String strB1 = CollectionsKt.b0(gdaVar.b, Separators.SLASH, null, null, null, 62);
                    h83 h83Var5 = new h83();
                    String strA3 = ctf0Var2.b.a(R.string.vs, Arrays.copyOf(new Object[0], 0));
                    long j7 = y3d.g;
                    long j8 = daq0.c;
                    pz40 pz40Var4 = s6t0.f31722a;
                    smk0 smk0Var4 = new smk0(s6t0.b().f33626a.getTextPrimary(), j8, null, null, null, null, null, j8, new j56(f), null, null, j7, k5q0Var, null, null, 17424);
                    h83Var5.c(strA3);
                    qadVar = new rad(kng0.c(h83Var5.f12607a, h83Var5, smk0Var4, 0), strB0, strB1);
                } else if (mcaVar instanceof hda) {
                    hda hdaVar = (hda) mcaVar;
                    String strB4 = CollectionsKt.b0(hdaVar.f12861a, Separators.SLASH, null, null, null, 62);
                    String strB5 = CollectionsKt.b0(hdaVar.b, Separators.SLASH, null, null, null, 62);
                    if (pz10Var != null) {
                        j83VarC = vzb.M(pz10Var);
                    } else {
                        h83 h83Var6 = new h83();
                        String strA4 = ctf0Var2.b.a(R.string.vs, Arrays.copyOf(new Object[0], 0));
                        long j9 = y3d.g;
                        long j10 = daq0.c;
                        pz40 pz40Var5 = s6t0.f31722a;
                        smk0 smk0Var5 = new smk0(s6t0.b().f33626a.getTextPrimary(), j10, null, null, null, null, null, j10, new j56(f), null, null, j9, k5q0Var, null, null, 17424);
                        h83Var6.c(strA4);
                        j83VarC = kng0.c(h83Var6.f12607a, h83Var6, smk0Var5, 0);
                    }
                    qadVar = new rad(j83VarC, strB4, strB5);
                } else {
                    if (!(mcaVar instanceof ida)) {
                        t9f.b();
                        return lz10Var;
                    }
                    qadVar = new qad(((ida) mcaVar).e);
                }
                return new dax(dadVar, qadVar);
            }

            /* JADX WARN: Code duplicated, block: B:140:0x0381  */
            /* JADX WARN: Code duplicated, block: B:70:0x01a8  */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                kc50 kc50Var;
                p700 p700Var;
                ena enaVar;
                uia uiaVar;
                String strA;
                String strC;
                String strC2;
                zvl0 zvl0Var;
                yja yjaVar;
                qal0 qal0Var;
                Object b0k0Var;
                i49 g49Var;
                dxh0 dxh0Var;
                hna hnaVar;
                lmo lmoVar;
                byte b11 = b10;
                int i = 0;
                rjs rjsVar = this.b;
                switch (b11) {
                    case 0:
                        List list = (List) obj;
                        list.getClass();
                        boolean zBooleanValue = ((Boolean) ((fee) rjsVar.c.getValue()).c()).booleanValue();
                        boolean zBooleanValue2 = ((Boolean) ((fee) rjsVar.e.getValue()).c()).booleanValue();
                        boolean zBooleanValue3 = ((Boolean) ((fee) rjsVar.f.getValue()).c()).booleanValue();
                        tf50 tf50Var = (tf50) ((fee) rjsVar.d.getValue()).c();
                        tf50Var.getClass();
                        if (!list.contains(tf50Var)) {
                            tf50Var = tf50.f33851a;
                        }
                        boolean z = !zBooleanValue2;
                        kc50 kc50Var2 = new kc50(R.drawable.ic_glyph_rectangular_scoreboard, tf50Var == tf50.f33851a);
                        tf50 tf50Var2 = tf50.b;
                        kc50 kc50Var3 = list.contains(tf50Var2) ? new kc50(R.drawable.ic_glyph_rectangular_broadcast, tf50Var == tf50Var2) : null;
                        tf50 tf50Var3 = tf50.c;
                        if (list.contains(tf50Var3)) {
                            kc50Var = new kc50(R.drawable.ic_glyph_rectangular_statistic, tf50Var == tf50Var3);
                        } else {
                            kc50Var = null;
                        }
                        return new ojs(zBooleanValue, z, zBooleanValue, zBooleanValue3, new hjs(kc50Var2, kc50Var3, kc50Var, tf50Var));
                    case 1:
                        n0o0 n0o0Var = rjsVar.o;
                        gna gnaVar = (gna) obj;
                        if ((gnaVar instanceof ena ? (ena) gnaVar : null) == null || (p700Var = ((ena) gnaVar).l) == null) {
                            return null;
                        }
                        List list2 = p700Var.e;
                        List list3 = (List) ((fee) n0o0Var.getValue()).c();
                        ch00 ch00Var = ch00.LAST_GAMES;
                        boolean zContains = list3.contains(ch00Var);
                        List list4 = (List) ((fee) n0o0Var.getValue()).c();
                        ch00 ch00Var2 = ch00.LAST_GAMES_OPP_ONE;
                        boolean zContains2 = list4.contains(ch00Var2);
                        List list5 = (List) ((fee) n0o0Var.getValue()).c();
                        ch00 ch00Var3 = ch00.LAST_GAMES_OPP_TWO;
                        boolean zContains3 = list5.contains(ch00Var3);
                        ctf0 ctf0Var2 = rjsVar.f30611a;
                        ctf0Var2.getClass();
                        ArrayList arrayList = new ArrayList();
                        List list6 = p700Var.g;
                        List list7 = p700Var.f;
                        if (!list2.isEmpty()) {
                            arrayList.add(z1x.T(list2, ctf0Var2, ctf0Var2.b.a(R.string.previous_meetings, Arrays.copyOf(new Object[0], 0)), ch00Var, zContains));
                        }
                        if (!list7.isEmpty()) {
                            arrayList.add(z1x.T(list7, ctf0Var2, kng0.l(ctf0Var2.b.a(R.string.last_games, Arrays.copyOf(new Object[0], 0)), ": ", p700Var.c), ch00Var2, zContains2));
                        }
                        if (!list6.isEmpty()) {
                            arrayList.add(z1x.T(list6, ctf0Var2, kng0.l(ctf0Var2.b.a(R.string.last_games, Arrays.copyOf(new Object[0], 0)), ": ", p700Var.d), ch00Var3, zContains3));
                        }
                        return arrayList;
                    case 2:
                        gna gnaVar2 = (gna) obj;
                        if ((gnaVar2 instanceof ena ? (ena) gnaVar2 : null) == null || (uiaVar = (enaVar = (ena) gnaVar2).h) == null) {
                            return null;
                        }
                        ctf0 ctf0Var3 = rjsVar.f30611a;
                        boolean z2 = enaVar.p;
                        ctf0Var3.getClass();
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it = uiaVar.c.iterator();
                        int i2 = 0;
                        while (it.hasNext()) {
                            Object next = it.next();
                            int i3 = i2 + 1;
                            if (i2 < 0) {
                                q3d.p();
                                throw null;
                            }
                            bsw bswVar = (bsw) next;
                            String str = bswVar.b;
                            String str2 = bswVar.e;
                            String strA2 = (str.length() <= 0 || str2.length() <= 0) ? ctf0Var3.b.a(R.string.vs, Arrays.copyOf(new Object[0], 0)) : w6x.q(bswVar.b, " : ", str2);
                            odp0 odp0Var = new odp0(new d5a0(new c280(bswVar.c, R.drawable.ic_glyph_placeholder_player)));
                            String strM = dw9.m(i3, ". ", bswVar.f3153a);
                            odp0 odp0Var2 = new odp0(new d5a0(new c280(bswVar.f, R.drawable.ic_glyph_placeholder_player)));
                            String strM2 = dw9.m(i3, ". ", bswVar.d);
                            rdj rdjVar = rdj.f30294a;
                            arrayList2.add(new hzy(odp0Var, strM, odp0Var2, strM2, rdj.g(new znq0(bswVar.g), efj.UNIVERSAL, Boolean.valueOf(z2), false, 56), strA2, "", null, null));
                            it = it;
                            i2 = i3;
                        }
                        dja djaVar = dja.PENALTY;
                        return new eax(dyb.o0(arrayList2), uiaVar.f35722a, uiaVar.b);
                    case 3:
                        anq0 anq0Var2 = (anq0) obj;
                        if (anq0Var2 != null) {
                            boolean z3 = ((Boolean) ((fee) rjsVar.g.getValue()).c()).booleanValue() || ((Boolean) ((fee) rjsVar.h.getValue()).c()).booleanValue();
                            ctf0 ctf0Var4 = rjsVar.f30611a;
                            ctf0Var4.getClass();
                            long j = anq0Var2.e;
                            long j2 = anq0Var2.d;
                            boolean z4 = anq0Var2.j;
                            if (j != 0 || !z4) {
                                String str3 = anq0Var2.c;
                                if (z4) {
                                    if (str3.length() > 0) {
                                        strA = ctf0Var4.b.a(R.string.live_additional_min_v2, Arrays.copyOf(new Object[]{str3}, 1));
                                    } else if (anq0Var2.f1167a) {
                                        strA = "";
                                    } else {
                                        strA = anq0Var2.b ? ctf0Var4.b.a(R.string.line_live_time_period_back_v2, Arrays.copyOf(new Object[]{""}, 1)) : ctf0Var4.b.a(R.string.line_live_time_period_capitalized_v2, Arrays.copyOf(new Object[]{""}, 1));
                                    }
                                } else if (j2 < 0) {
                                    strA = ctf0Var4.b.a(R.string.game_started, Arrays.copyOf(new Object[0], 0));
                                } else {
                                    long j3 = j2 / 86400;
                                    strA = j3 > 0 ? ctf0Var4.b.a(R.string.line_time_before_v2, Arrays.copyOf(new Object[]{String.valueOf(j3)}, 1)) : ctf0Var4.b.a(R.string.before_start, Arrays.copyOf(new Object[0], 0));
                                }
                                String strC3 = (z3 || z4 || j2 < 0) ? null : n2x.C((((j2 < 0 ? 0L : j2) / 60) / 60) % 24);
                                if (z3) {
                                    strC = null;
                                } else {
                                    long jB = (z4 ? vzb.V(anq0Var2).b() : j2 < 0 ? 0L : j2) / 60;
                                    if (!z4) {
                                        jB %= 60;
                                    }
                                    strC = n2x.C(jB);
                                }
                                if (z3) {
                                    strC2 = null;
                                } else {
                                    strC2 = n2x.C((z4 ? vzb.V(anq0Var2).b() : j2 >= 0 ? j2 : 0L) % 60);
                                }
                                return new jg30(strA, strC3, strC, strC2);
                            }
                        }
                        return null;
                    case 4:
                        gna gnaVar3 = (gna) obj;
                        ena enaVar2 = gnaVar3 instanceof ena ? (ena) gnaVar3 : null;
                        if (enaVar2 == null || (zvl0Var = ((ena) gnaVar3).k) == null) {
                            return null;
                        }
                        String str4 = zvl0Var.m;
                        String str5 = enaVar2.q;
                        ctf0 ctf0Var5 = rjsVar.f30611a;
                        m1v0 m1v0Var = (m1v0) ((fee) rjsVar.J.getValue()).b();
                        str5.getClass();
                        ctf0Var5.getClass();
                        String str6 = zvl0Var.f45064a;
                        Pair pair = str4.length() > 0 ? new Pair(str4, ctf0Var5.b.a(R.string.web_site, Arrays.copyOf(new Object[0], 0))) : new Pair(null, null);
                        String str7 = (String) pair.f46059a;
                        String str8 = (String) pair.b;
                        dja djaVar2 = dja.PENALTY;
                        String str9 = zvl0Var.b;
                        ArrayList arrayList3 = new ArrayList();
                        String str10 = zvl0Var.l;
                        String str11 = zvl0Var.k;
                        String str12 = zvl0Var.j;
                        String str13 = zvl0Var.i;
                        String str14 = zvl0Var.h;
                        String str15 = zvl0Var.g;
                        String str16 = zvl0Var.f;
                        String str17 = zvl0Var.e;
                        String str18 = zvl0Var.d;
                        String str19 = zvl0Var.c;
                        if (str6.length() > 0) {
                            arrayList3.add(l7x.J(ctf0Var5, str6, R.string.address));
                        }
                        if (str19.length() > 0) {
                            arrayList3.add(l7x.J(ctf0Var5, str19, R.string.capacity));
                        }
                        if (str18.length() > 0) {
                            arrayList3.add(l7x.J(ctf0Var5, str18, R.string.covering));
                        }
                        if (str17.length() > 0) {
                            arrayList3.add(l7x.J(ctf0Var5, str17, R.string.city_name));
                        }
                        if (str16.length() > 0) {
                            arrayList3.add(l7x.J(ctf0Var5, str16, R.string.architect));
                        }
                        if (str15.length() > 0) {
                            arrayList3.add(l7x.J(ctf0Var5, str15, R.string.old_name));
                        }
                        if (str14.length() > 0) {
                            arrayList3.add(l7x.J(ctf0Var5, str14, R.string.category));
                        }
                        if (str13.length() > 0) {
                            arrayList3.add(l7x.J(ctf0Var5, str13, R.string.history));
                        }
                        if (str12.length() > 0) {
                            arrayList3.add(l7x.J(ctf0Var5, str12, R.string.opened));
                        }
                        if (str11.length() > 0) {
                            arrayList3.add(l7x.J(ctf0Var5, str11, R.string.zip_code));
                        }
                        if (str10.length() > 0) {
                            arrayList3.add(l7x.J(ctf0Var5, "\u2066" + str10 + "\u2069", R.string.phone));
                        }
                        a4x a4xVarO0 = dyb.o0(arrayList3);
                        List list8 = zvl0Var.n;
                        ArrayList arrayList4 = new ArrayList(r3d.q(list8, 10));
                        Iterator it2 = list8.iterator();
                        while (it2.hasNext()) {
                            arrayList4.add(String.format(Locale.ENGLISH, "%s/sfiles/stadium/%s", Arrays.copyOf(new Object[]{str5, (String) it2.next()}, 2)));
                        }
                        a4x a4xVarO1 = dyb.o0(arrayList4);
                        if (a4xVarO1.isEmpty()) {
                            a4xVarO1 = dyb.g0("");
                        }
                        return new iax(m1v0Var, str9, a4xVarO0, str7, str8, a4xVarO1);
                    case 5:
                        gna gnaVar4 = (gna) obj;
                        if ((gnaVar4 instanceof ena ? (ena) gnaVar4 : null) != null && (yjaVar = ((ena) gnaVar4).i) != null) {
                            List list9 = yjaVar.f42730a;
                            if (!list9.isEmpty()) {
                                long jLongValue = ((Number) ((fee) rjsVar.m.getValue()).c()).longValue();
                                lc00 lc00VarB = kotlin.collections.a.b();
                                Iterator it3 = list9.iterator();
                                while (it3.hasNext()) {
                                    he30 he30Var = (he30) it3.next();
                                    List list10 = he30Var.b;
                                    ArrayList arrayList5 = new ArrayList();
                                    for (Object obj2 : list10) {
                                        if (((ge30) obj2).e.length() > 0) {
                                            arrayList5.add(obj2);
                                        }
                                    }
                                    if (!arrayList5.isEmpty()) {
                                        lc00VarB.add(new uim(he30Var.f12902a));
                                        int i4 = i;
                                        for (Object obj3 : arrayList5) {
                                            int i5 = i4 + 1;
                                            if (i4 < 0) {
                                                q3d.p();
                                                throw null;
                                            }
                                            ge30 ge30Var = (ge30) obj3;
                                            String str20 = ge30Var.f11132a;
                                            String str21 = ge30Var.e;
                                            String str22 = ge30Var.c;
                                            String str23 = ge30Var.d;
                                            tho thoVar = ge30Var.b;
                                            Iterator it4 = it3;
                                            List listSplit$default = StringsKt__StringsKt.split$default(str20, new String[]{"+"}, false, i, 6, null);
                                            long j4 = jLongValue;
                                            List listSplit$default2 = StringsKt__StringsKt.split$default(str20, new String[]{Separators.COLON}, false, i, 6, null);
                                            if (j4 == 1) {
                                                if (listSplit$default.size() == 2 && listSplit$default2.size() == 1) {
                                                    str20 = listSplit$default.get(0) + "'+" + kotlin.text.c.r((String) listSplit$default.get(1), Separators.QUOTE, "", false);
                                                } else if (listSplit$default2.size() == 2) {
                                                    str20 = listSplit$default2.get(0) + Separators.QUOTE;
                                                }
                                            }
                                            y6n y6nVar = ge30Var.j == 0 ? y6n.f42107a : y6n.b;
                                            ggm ggmVar = i4 == 0 ? arrayList5.size() + (-1) == 0 ? ggm.c : ggm.f11256a : i4 == arrayList5.size() + (-1) ? ggm.b : ggm.d;
                                            lc00VarB.add((str23.length() == 0 && str22.length() == 0) ? new sim(str20, str21, thoVar.name(), y6nVar, ggmVar, ge30Var.b()) : new rim(str20, str21, new lnm(str23, str22, 0, "", new s0m("", ""), ge30Var.k), ge30Var.a() ? new lnm(ge30Var.h, ge30Var.g, 0, "", new s0m("", ""), ge30Var.l) : null, thoVar.name(), null, y6nVar, ggmVar, ge30Var.b()));
                                            it3 = it4;
                                            i4 = i5;
                                            jLongValue = j4;
                                            i = 0;
                                        }
                                    }
                                    it3 = it3;
                                    jLongValue = jLongValue;
                                    i = 0;
                                }
                                i4 i4VarR0 = dyb.r0(kotlin.collections.a.a(lc00VarB));
                                dja djaVar3 = dja.PENALTY;
                                return new gax(new sf30(i4VarR0));
                            }
                        }
                        return null;
                    case 6:
                        vzj0 vzj0Var = (vzj0) obj;
                        if (!(((fee) rjsVar.B.getValue()).b() instanceof qrr) && vzj0Var != null) {
                            anq0 anq0Var3 = (anq0) ((fee) rjsVar.H.getValue()).c();
                            ctf0 ctf0Var6 = rjsVar.f30611a;
                            ctf0Var6.getClass();
                            znq0 znq0Var = anq0Var3 != null ? anq0Var3.h : null;
                            if (znq0Var != null) {
                                long j5 = znq0Var.f44687a;
                                if (j5 <= 0) {
                                    qal0Var = null;
                                } else {
                                    long j6 = j5 / 86400;
                                    qal0Var = new qal0(j6 > 0 ? ctf0Var6.b.a(R.string.line_time_before_v2, Arrays.copyOf(new Object[]{String.valueOf(j6)}, 1)) : ctf0Var6.b.a(R.string.before_start, Arrays.copyOf(new Object[0], 0)), yyw.L((((j5 < 0 ? 0L : j5) / 60) / 60) % 24), yyw.L(((j5 < 0 ? 0L : j5) / 60) % 60), yyw.L((j5 >= 0 ? j5 : 0L) % 60));
                                }
                            } else {
                                qal0Var = null;
                            }
                            if (vzj0Var instanceof tzj0) {
                                tzj0 tzj0Var = (tzj0) vzj0Var;
                                b0k0Var = new yzj0(tzj0Var.f34807a, tzj0Var.b, tzj0Var.c, tzj0Var.d, qal0Var);
                            } else if (vzj0Var instanceof uzj0) {
                                uzj0 uzj0Var = (uzj0) vzj0Var;
                                b0k0Var = new b0k0(uzj0Var.f36538a, uzj0Var.b, uzj0Var.c, uzj0Var.d, qal0Var);
                            } else {
                                t9f.b();
                            }
                            return b0k0Var;
                        }
                        return null;
                    case 7:
                        boolean zBooleanValue4 = ((Boolean) obj).booleanValue();
                        long jLongValue2 = ((Number) ((fee) rjsVar.j.getValue()).c()).longValue();
                        boolean zBooleanValue5 = ((Boolean) ((fee) rjsVar.i.getValue()).c()).booleanValue();
                        long jLongValue3 = ((Number) ((fee) rjsVar.k.getValue()).c()).longValue();
                        long jLongValue4 = ((Number) ((fee) rjsVar.m.getValue()).c()).longValue();
                        Long l = (Long) ((fee) rjsVar.l.getValue()).c();
                        long jLongValue5 = l != null ? l.longValue() : -1L;
                        if (zBooleanValue4) {
                            return new sym0(new MarketsCategoriesParams(jLongValue2, jLongValue3, jLongValue4, new zq2(), "", zBooleanValue5));
                        }
                        tef0 tef0Var = tef0.f33818a;
                        xuz xuzVar = pb10.c;
                        return new vym0(new RelatedParams(zBooleanValue5, jLongValue2, jLongValue4, -1L, jLongValue5, tef0Var));
                    case 8:
                        return a(obj);
                    case 9:
                        fsr fsrVar = (fsr) obj;
                        if ((fsrVar == null || !fsrVar.b) && (fsrVar == null || !fsrVar.c)) {
                            return k49.f17656a;
                        }
                        o49 o49Var = (o49) ((fee) rjsVar.y.getValue()).c();
                        ctf0 ctf0Var7 = rjsVar.f30611a;
                        zvh0 zvh0Var2 = rjsVar.b;
                        fsrVar.getClass();
                        ctf0Var7.getClass();
                        ArrayList arrayList6 = new ArrayList();
                        if (fsrVar.b) {
                            arrayList6.add(new g49(ctf0Var7.b.a(R.string.video, Arrays.copyOf(new Object[0], 0))));
                        }
                        if (fsrVar.c) {
                            arrayList6.add(new h49(ctf0Var7.b.a(R.string.play_zone, Arrays.copyOf(new Object[0], 0))));
                        }
                        if (o49Var == null) {
                            g49Var = (i49) CollectionsKt.U(arrayList6);
                        } else {
                            int iOrdinal = o49Var.ordinal();
                            if (iOrdinal == 0) {
                                g49Var = new g49(ctf0Var7.b.a(R.string.video, Arrays.copyOf(new Object[0], 0)));
                            } else {
                                if (iOrdinal != 1) {
                                    t9f.b();
                                    return null;
                                }
                                g49Var = new h49(ctf0Var7.b.a(R.string.play_zone, Arrays.copyOf(new Object[0], 0)));
                            }
                            if (arrayList6.isEmpty()) {
                                g49Var = null;
                            } else {
                                Iterator it5 = arrayList6.iterator();
                                do {
                                    if (!it5.hasNext()) {
                                        g49Var = null;
                                    }
                                } while (!Intrinsics.d((i49) it5.next(), g49Var));
                            }
                            if (g49Var == null) {
                                g49Var = (i49) CollectionsKt.U(arrayList6);
                            }
                        }
                        bfu0 bfu0Var = fsrVar.f10077a;
                        GameBroadcastingParams gameBroadcastingParams = new GameBroadcastingParams(bfu0Var.f2522a, bfu0Var.c, bfu0Var.f, bfu0Var.b, bfu0Var.e, bfu0Var.d, bfu0Var.g, null);
                        Iterator it6 = arrayList6.iterator();
                        int i6 = 0;
                        while (true) {
                            if (!it6.hasNext()) {
                                i6 = -1;
                            } else if (!Intrinsics.d((i49) it6.next(), g49Var)) {
                                i6++;
                            }
                        }
                        int i7 = i6;
                        i4 i4VarR1 = dyb.r0(arrayList6);
                        boolean z5 = arrayList6.size() > 1;
                        int iOrdinal2 = zvh0Var2.ordinal();
                        if (iOrdinal2 == 0) {
                            dxh0Var = axh0.f1625a;
                        } else if (iOrdinal2 == 1) {
                            dxh0Var = zwh0.f45106a;
                        } else if (iOrdinal2 == 2) {
                            dxh0Var = cxh0.f5122a;
                        } else {
                            if (iOrdinal2 != 3) {
                                t9f.b();
                                return null;
                            }
                            dxh0Var = bxh0.f3376a;
                        }
                        dxh0 dxh0Var2 = dxh0Var;
                        ArrayList arrayList7 = new ArrayList(r3d.q(arrayList6, 10));
                        Iterator it7 = arrayList6.iterator();
                        while (it7.hasNext()) {
                            arrayList7.add(new yvh0(((i49) it7.next()).getDescription(), bwh0.f3325a));
                        }
                        return new j49(gameBroadcastingParams, i7, g49Var, i4VarR1, z5, dxh0Var2, dyb.r0(arrayList7));
                    case 10:
                        return b(obj);
                    default:
                        gna gnaVar5 = (gna) obj;
                        if ((gnaVar5 instanceof ena ? (ena) gnaVar5 : null) == null || (hnaVar = ((ena) gnaVar5).j) == null) {
                            return null;
                        }
                        boolean zContains4 = ((List) ((fee) rjsVar.o.getValue()).c()).contains(ch00.SHORT_STATISTIC);
                        ctf0 ctf0Var8 = rjsVar.f30611a;
                        ctf0Var8.getClass();
                        List<vrj0> list11 = hnaVar.f;
                        ArrayList arrayList8 = new ArrayList(r3d.q(list11, 10));
                        for (vrj0 vrj0Var : list11) {
                            float fS = r7x.s(vrj0Var.b);
                            float fS2 = r7x.s(vrj0Var.c);
                            String str24 = vrj0Var.f37902a;
                            String str25 = vrj0Var.b;
                            String str26 = vrj0Var.c;
                            if (fS == 0.0f && fS2 == 0.0f) {
                                fS = 0.0f;
                            }
                            arrayList8.add(new srj0(fS, (fS == 0.0f && fS2 == 0.0f) ? 0.0f : fS2, str24, str25, str26));
                        }
                        dja djaVar4 = dja.PENALTY;
                        ch00 ch00Var4 = ch00.SHORT_STATISTIC;
                        i4 i4VarR2 = zContains4 ? dyb.r0(arrayList8) : dyb.r0(CollectionsKt.D0(arrayList8, 3));
                        if (arrayList8.size() - 1 > 3) {
                            lsm0 lsm0Var = ctf0Var8.b;
                            lmoVar = new lmo(lsm0Var.a(R.string.expand, Arrays.copyOf(new Object[0], 0)), lsm0Var.a(R.string.collapse, Arrays.copyOf(new Object[0], 0)), zContains4);
                        } else {
                            lmoVar = null;
                        }
                        return new hax(i4VarR2, lmoVar);
                }
            }
        });
        final byte b11 = 5;
        this.L = bkb.G(a().d, new Function1(this) { // from class: a.qjs
            public final /* synthetic */ rjs b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:260:0x08d4  */
            /* JADX WARN: Code duplicated, block: B:262:0x08e4  */
            /* JADX WARN: Code duplicated, block: B:265:0x090f  */
            /* JADX WARN: Code duplicated, block: B:268:0x0932  */
            /* JADX WARN: Code duplicated, block: B:270:0x0936  */
            /* JADX WARN: Code duplicated, block: B:272:0x094e  */
            private final Object a(Object obj) {
                n0o0 n0o0Var;
                n0o0 n0o0Var2;
                String str;
                String str2;
                mqr kqrVar;
                String strG;
                d3h0 pekVar;
                String strN;
                d3h0 xakVar;
                Integer num;
                String strN2;
                int i;
                iul0 iul0Var;
                yd90 yd90Var;
                yd90 yd90Var2;
                iul0 iul0Var2;
                String str3;
                String str4;
                d3h0 bekVar;
                String strA;
                String strB;
                String strN3;
                rjs rjsVar = this.b;
                n0o0 n0o0Var3 = rjsVar.v;
                n0o0 n0o0Var4 = rjsVar.m;
                n0o0 n0o0Var5 = rjsVar.H;
                n0o0 n0o0Var6 = rjsVar.I;
                ctf0 ctf0Var2 = rjsVar.f30611a;
                gna gnaVar = (gna) obj;
                if (gnaVar != null) {
                    if (!(gnaVar instanceof ena)) {
                        if (gnaVar instanceof fna) {
                            ctf0Var2.getClass();
                            return new orr(d9x.L(((fna) gnaVar).f9825a, ctf0Var2));
                        }
                        t9f.b();
                        return null;
                    }
                    ena enaVar = (ena) gnaVar;
                    mca mcaVar = enaVar.f8084a;
                    List list = (List) ((fee) rjsVar.n.getValue()).c();
                    boolean zBooleanValue = ((Boolean) ((fee) rjsVar.e.getValue()).c()).booleanValue();
                    mpm mpmVar = (mpm) ((fee) n0o0Var6.getValue()).b();
                    boolean z = enaVar.p;
                    String str5 = (String) ((fee) rjsVar.p.getValue()).c();
                    String str6 = (String) ((fee) rjsVar.q.getValue()).c();
                    String str7 = (String) ((fee) rjsVar.r.getValue()).c();
                    String str8 = (String) ((fee) rjsVar.s.getValue()).c();
                    jg30 jg30Var = (jg30) ((fee) n0o0Var5.getValue()).b();
                    bg30 bg30Var = (bg30) ((fee) n0o0Var6.getValue()).c();
                    znq0 znq0Var = (znq0) ((fee) rjsVar.t.getValue()).c();
                    bha bhaVar = enaVar.o;
                    ui9 ui9Var = (ui9) ((fee) rjsVar.u.getValue()).c();
                    long jLongValue = ((Number) ((fee) n0o0Var4.getValue()).c()).longValue();
                    boolean zBooleanValue2 = ((Boolean) ((fee) n0o0Var3.getValue()).c()).booleanValue();
                    ctf0Var2.getClass();
                    if (ui9Var != null) {
                        int i2 = ui9Var.c;
                        int i3 = ui9Var.d;
                        n0o0Var = n0o0Var4;
                        String strN4 = (cy7.c() && zBooleanValue2) ? w6x.n(i3, i2, " : ") : w6x.n(i2, i3, " : ");
                        String strX = j0x.x(jLongValue, ctf0Var2);
                        ArrayList arrayList = ui9Var.f35720a;
                        n0o0Var2 = n0o0Var5;
                        str = str5;
                        str2 = str6;
                        ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
                        int i4 = 0;
                        for (Object obj2 : arrayList) {
                            int i5 = i4 + 1;
                            if (i4 < 0) {
                                q3d.p();
                                throw null;
                            }
                            arrayList2.add(piz.W((sc90) obj2, jLongValue, i4));
                            i4 = i5;
                        }
                        i4 i4VarR0 = dyb.r0(arrayList2);
                        ArrayList arrayList3 = ui9Var.b;
                        ArrayList arrayList4 = new ArrayList(r3d.q(arrayList3, 10));
                        int i6 = 0;
                        for (Object obj3 : arrayList3) {
                            int i7 = i6 + 1;
                            if (i6 < 0) {
                                q3d.p();
                                throw null;
                            }
                            arrayList4.add(piz.W((sc90) obj3, jLongValue, i6));
                            i6 = i7;
                        }
                        kqrVar = new iqr(strN4, strX, i4VarR0, dyb.r0(arrayList4));
                    } else {
                        n0o0Var = n0o0Var4;
                        n0o0Var2 = n0o0Var5;
                        str = str5;
                        str2 = str6;
                        if (bhaVar != null) {
                            float f = bhaVar.d;
                            float f2 = bhaVar.e;
                            float f3 = bhaVar.f;
                            Object[] objArr = {Float.valueOf(f3)};
                            lsm0 lsm0Var = ctf0Var2.b;
                            String strA2 = lsm0Var.a(R.string.n_percents, Arrays.copyOf(objArr, 1));
                            k3w0 g3w0Var = (f3 <= f2 || f3 <= f) ? new g3w0(strA2) : new i3w0(strA2);
                            String strA3 = lsm0Var.a(R.string.n_percents, Arrays.copyOf(new Object[]{Float.valueOf(f2)}, 1));
                            k3w0 g3w0Var2 = (f2 <= f3 || f2 <= f) ? new g3w0(strA3) : new i3w0(strA3);
                            String strA4 = lsm0Var.a(R.string.n_percents, Arrays.copyOf(new Object[]{Float.valueOf(f)}, 1));
                            kqrVar = new kqr(g3w0Var, g3w0Var2, (f <= f3 || f <= f2) ? new g3w0(strA4) : new i3w0(strA4));
                        } else {
                            kqrVar = null;
                        }
                    }
                    anq0 anq0Var2 = (anq0) ((fee) n0o0Var2.getValue()).c();
                    boolean z2 = anq0Var2 != null ? anq0Var2.f1167a : false;
                    long jLongValue2 = ((Number) ((fee) n0o0Var.getValue()).c()).longValue();
                    boolean zBooleanValue3 = ((Boolean) ((fee) n0o0Var3.getValue()).c()).booleanValue();
                    list.getClass();
                    mpmVar.getClass();
                    String strA5 = "";
                    if (mcaVar instanceof pca) {
                        pca pcaVar = (pca) mcaVar;
                        uqr uqrVarR0 = pzb.r0(mcaVar, str, str2, str7, str8, jg30Var);
                        if (bg30Var == null || (bekVar = bg30Var.b) == null) {
                            bekVar = bg30Var != null ? bg30Var.f2536a : new bek();
                        }
                        d3h0 d3h0Var = bekVar;
                        boolean z3 = d3h0Var instanceof lz10;
                        lz10 lz10Var = z3 ? (lz10) d3h0Var : null;
                        if (lz10Var != null) {
                            strA = vzb.T(lz10Var, zBooleanValue3);
                        } else {
                            hzm0 hzm0Var = d3h0Var instanceof hzm0 ? (hzm0) d3h0Var : null;
                            if (hzm0Var != null) {
                                String str9 = hzm0Var.g;
                                String str10 = hzm0Var.i;
                                StringBuilder sb = new StringBuilder("\u2066");
                                if (cy7.c() && zBooleanValue3) {
                                    if (str10 != null) {
                                        hne.B(sb, "(ov ", str10, Separators.RPAREN);
                                    }
                                    sb.append(vzb.i0(str9));
                                } else {
                                    sb.append(str9);
                                    if (str10 != null) {
                                        hne.B(sb, Separators.LPAREN, str10, " ov)");
                                    }
                                }
                                sb.append("\u2069");
                                strA = sb.toString();
                            } else {
                                strA = d3h0Var.a();
                            }
                        }
                        String str11 = strA;
                        lz10 lz10Var2 = z3 ? (lz10) d3h0Var : null;
                        if (lz10Var2 != null) {
                            strB = vzb.U(lz10Var2, zBooleanValue3);
                        } else {
                            hzm0 hzm0Var2 = d3h0Var instanceof hzm0 ? (hzm0) d3h0Var : null;
                            if (hzm0Var2 != null) {
                                String str12 = hzm0Var2.h;
                                String str13 = hzm0Var2.j;
                                StringBuilder sb2 = new StringBuilder("\u2066");
                                if (cy7.c() && zBooleanValue3) {
                                    if (str13 != null) {
                                        hne.B(sb2, "(ov ", str13, Separators.RPAREN);
                                    }
                                    sb2.append(vzb.i0(str12));
                                } else {
                                    sb2.append(str12);
                                    if (str13 != null) {
                                        hne.B(sb2, Separators.LPAREN, str13, " ov)");
                                    }
                                }
                                sb2.append("\u2069");
                                strB = sb2.toString();
                            } else {
                                strB = d3h0Var.b();
                            }
                        }
                        String str14 = strB;
                        boolean z4 = pcaVar.d;
                        rpp0 rpp0Var = pcaVar.f26749a;
                        j83 j83VarH = vzb.H(ctf0Var2, d3h0Var, pcaVar.e, pcaVar.f, pcaVar.g, (bg30Var == null || (strN3 = bg30Var.f2536a.n()) == null) ? "" : strN3, z4, zBooleanValue3);
                        String strB2 = rpp0Var.b();
                        c280 c280Var = new c280(vsm0.s(rpp0Var.a(), pcaVar.b), R.drawable.ic_glyph_placeholder_player);
                        long jA = rpp0Var.a();
                        bap bapVar = bap.b;
                        jdp0 jdp0Var = new jdp0(strB2, n6x.o0(c280Var, jA, list, zBooleanValue, bapVar), null);
                        jdp0 jdp0Var2 = new jdp0(rpp0Var.d(), n6x.o0(new c280(vsm0.s(rpp0Var.c(), pcaVar.c), R.drawable.ic_glyph_placeholder_player), rpp0Var.c(), list, zBooleanValue, bapVar), null);
                        lz10 lz10Var3 = z3 ? (lz10) d3h0Var : null;
                        return new mrr(uqrVarR0, jdp0Var, jdp0Var2, j83VarH, lz10Var3 != null ? vzb.G(lz10Var3.i) : eex.c, str11, d3h0Var.j(), str14, d3h0Var.i());
                    }
                    boolean z5 = z2;
                    String str15 = str;
                    String str16 = str2;
                    boolean z6 = mcaVar instanceof tca;
                    qpm qpmVar = qpm.f29126a;
                    if (z6) {
                        tca tcaVar = (tca) mcaVar;
                        uqr uqrVarR1 = pzb.r0(mcaVar, str15, str16, str7, str8, jg30Var);
                        znq0 znq0Var2 = new znq0(znq0Var != null ? znq0Var.f44687a : 0L);
                        rpp0 rpp0Var2 = tcaVar.f33711a;
                        boolean z7 = tcaVar.i;
                        if (rpp0Var2 instanceof qpp0) {
                            qpp0 qpp0Var = (qpp0) rpp0Var2;
                            jdp0 jdp0Var3 = new jdp0(qpp0Var.g, n6x.o0(u1c.C(tcaVar, true), qpp0Var.e, list, zBooleanValue || z7, bap.b), null);
                            jdp0 jdp0Var4 = new jdp0(qpp0Var.h, n6x.o0(u1c.C(tcaVar, false), qpp0Var.f, list, zBooleanValue || z7, bap.f2271a), null);
                            lpm lpmVar = new lpm(qpmVar, new hpm(0L, 3));
                            dpi0 dpi0Var = new dpi0((byte) 15);
                            rdj rdjVar = rdj.f30294a;
                            vzb.E(dpi0Var, rdj.g(znq0Var2, efj.UNIVERSAL, Boolean.valueOf(z), false, 56));
                            return new trr(uqrVarR1, jdp0Var3, jdp0Var4, lpmVar, ((h83) dpi0Var.f6468a).h(), kqrVar);
                        }
                        if (!(rpp0Var2 instanceof ppp0)) {
                            t9f.b();
                            return null;
                        }
                        ppp0 ppp0Var = (ppp0) rpp0Var2;
                        xcp0 xcp0VarC0 = b8k0.c0(ppp0Var.e, ppp0Var.g, tcaVar.b);
                        xcp0 xcp0VarC1 = b8k0.c0(ppp0Var.f, ppp0Var.h, tcaVar.c);
                        lpm lpmVar2 = new lpm(qpmVar, new hpm(0L, 3));
                        dpi0 dpi0Var2 = new dpi0((byte) 15);
                        rdj rdjVar2 = rdj.f30294a;
                        vzb.E(dpi0Var2, rdj.g(znq0Var2, efj.UNIVERSAL, Boolean.valueOf(z), false, 56));
                        return new trr(uqrVarR1, xcp0VarC0, xcp0VarC1, lpmVar2, ((h83) dpi0Var2.f6468a).h(), kqrVar);
                    }
                    if (!(mcaVar instanceof xca)) {
                        if (mcaVar instanceof gda) {
                            gda gdaVar = (gda) mcaVar;
                            uqr uqrVarR2 = pzb.r0(mcaVar, str15, str16, str7, str8, jg30Var);
                            znq0 znq0Var3 = new znq0(znq0Var != null ? znq0Var.f44687a : 0L);
                            String strB0 = CollectionsKt.b0(gdaVar.f11094a, Separators.SLASH, null, null, null, 62);
                            String strB1 = CollectionsKt.b0(gdaVar.b, Separators.SLASH, null, null, null, 62);
                            lpm lpmVar3 = new lpm(qpmVar, new hpm(0L, 3));
                            dpi0 dpi0Var3 = new dpi0((byte) 15);
                            rdj rdjVar3 = rdj.f30294a;
                            vzb.E(dpi0Var3, rdj.g(znq0Var3, efj.UNIVERSAL, Boolean.valueOf(z), false, 56));
                            return new rrr(uqrVarR2, strB0, strB1, lpmVar3, ((h83) dpi0Var3.f6468a).h());
                        }
                        if (mcaVar instanceof hda) {
                            hda hdaVar = (hda) mcaVar;
                            uqr uqrVarR3 = pzb.r0(mcaVar, str15, str16, str7, str8, jg30Var);
                            if (bg30Var == null || (pekVar = bg30Var.b) == null) {
                                pekVar = bg30Var != null ? bg30Var.f2536a : new pek();
                            }
                            return new rrr(uqrVarR3, CollectionsKt.b0(hdaVar.f12861a, Separators.SLASH, null, null, null, 62), CollectionsKt.b0(hdaVar.b, Separators.SLASH, null, null, null, 62), mpmVar, vzb.H(ctf0Var2, pekVar, hdaVar.h, hdaVar.i, hdaVar.j, (bg30Var == null || (strN = bg30Var.f2536a.n()) == null) ? "" : strN, hdaVar.g, zBooleanValue3));
                        }
                        if (!(mcaVar instanceof ida)) {
                            t9f.b();
                            return null;
                        }
                        ida idaVar = (ida) mcaVar;
                        uqr uqrVarR4 = pzb.r0(mcaVar, str15, str16, str7, str8, jg30Var);
                        if (!idaVar.g) {
                            if (znq0Var != null) {
                                rdj rdjVar4 = rdj.f30294a;
                                strG = rdj.g(znq0Var, efj.UNIVERSAL, Boolean.valueOf(z), false, 56);
                                if (strG == null) {
                                }
                            }
                            dpi0 dpi0Var14 = new dpi0((byte) 15);
                            vzb.E(dpi0Var14, strG);
                            return new vrr(uqrVarR4, idaVar.e, ((h83) dpi0Var14.f6468a).h());
                        }
                        strA5 = ctf0Var2.b.a(R.string.game_end, Arrays.copyOf(new Object[0], 0));
                        strG = strA5;
                        dpi0 dpi0Var15 = new dpi0((byte) 15);
                        vzb.E(dpi0Var15, strG);
                        return new vrr(uqrVarR4, idaVar.e, ((h83) dpi0Var15.f6468a).h());
                    }
                    if (!gql0.d().contains(Long.valueOf(jLongValue2))) {
                        xca xcaVar = (xca) mcaVar;
                        uqr uqrVarR5 = pzb.r0(mcaVar, str15, str16, str7, str8, jg30Var);
                        if (bg30Var == null || (xakVar = bg30Var.b) == null) {
                            xakVar = bg30Var != null ? bg30Var.f2536a : new xak((byte) 22);
                        }
                        boolean z8 = xcaVar.l;
                        boolean z9 = xcaVar.q;
                        rpp0 rpp0Var3 = xcaVar.f40636a;
                        j83 j83VarH2 = vzb.H(ctf0Var2, xakVar, xcaVar.n, xcaVar.o, xcaVar.p, (bg30Var == null || (strN2 = bg30Var.f2536a.n()) == null) ? "" : strN2, z8, zBooleanValue3);
                        if (!(rpp0Var3 instanceof qpp0)) {
                            if (rpp0Var3 instanceof ppp0) {
                                ppp0 ppp0Var2 = (ppp0) rpp0Var3;
                                return new trr(uqrVarR5, b8k0.c0(ppp0Var2.e, ppp0Var2.g, xcaVar.h), b8k0.c0(ppp0Var2.f, ppp0Var2.h, xcaVar.i), mpmVar, j83VarH2, kqrVar);
                            }
                            t9f.b();
                            return null;
                        }
                        int i8 = xcaVar.b;
                        int i9 = xcaVar.g;
                        int i10 = xcaVar.f;
                        int i11 = xcaVar.d;
                        int i12 = xcaVar.c;
                        vy vyVar = (i8 == 0 && i12 == 0 && i11 == 0) ? null : new vy(i8 > 0 ? Integer.valueOf(i8) : null, i12 > 0 ? Integer.valueOf(i12) : null, i11 > 0 ? Integer.valueOf(i11) : null);
                        int i13 = xcaVar.e;
                        vy vyVar2 = (i13 == 0 && i10 == 0 && i9 == 0) ? null : new vy(i13 > 0 ? Integer.valueOf(i13) : null, i10 > 0 ? Integer.valueOf(i10) : null, i9 > 0 ? Integer.valueOf(i9) : null);
                        boolean z10 = (vyVar == null && vyVar2 == null) ? false : true;
                        if (z10 && vyVar == null) {
                            num = null;
                            vyVar = new vy(null, null, null);
                        } else {
                            num = null;
                        }
                        if (z10 && vyVar2 == null) {
                            vyVar2 = new vy(num, num, num);
                        }
                        qpp0 qpp0Var2 = (qpp0) rpp0Var3;
                        return new trr(uqrVarR5, new jdp0(qpp0Var2.g, n6x.o0(u1c.D(xcaVar, true), qpp0Var2.e, list, zBooleanValue || z9, bap.b), vyVar), new jdp0(qpp0Var2.h, n6x.o0(u1c.D(xcaVar, false), qpp0Var2.f, list, zBooleanValue || z9, bap.f2271a), vyVar2), mpmVar, j83VarH2, kqrVar);
                    }
                    xca xcaVar2 = (xca) mcaVar;
                    long j = znq0Var != null ? znq0Var.f44687a : 0L;
                    uqr uqrVarR6 = pzb.r0(mcaVar, str15, str16, str7, str8, jg30Var);
                    znq0 znq0Var4 = new znq0(j);
                    pz10 pz10Var = bg30Var != null ? bg30Var.f2536a : null;
                    if (pz10Var instanceof nz10) {
                        izm0 izm0Var = bg30Var.b;
                        String str17 = xcaVar2.s;
                        List list2 = xcaVar2.i;
                        List list3 = xcaVar2.h;
                        rpp0 rpp0Var4 = xcaVar2.f40636a;
                        boolean z11 = xcaVar2.l;
                        String str18 = xcaVar2.p;
                        rdj rdjVar5 = rdj.f30294a;
                        pz10 pz10Var2 = pz10Var;
                        String strG2 = rdj.g(znq0Var4, efj.UNIVERSAL, Boolean.valueOf(z), false, 56);
                        str18.getClass();
                        strG2.getClass();
                        dpi0 dpi0Var16 = new dpi0((byte) 15);
                        if (str17 != null) {
                            vzb.E(dpi0Var16, str17);
                            vzb.E(dpi0Var16, ": ");
                            boolean z12 = cy7.c() && zBooleanValue3;
                            if (izm0Var == null) {
                                vzb.E(dpi0Var16, "0");
                                vzb.C(dpi0Var16);
                                vzb.E(dpi0Var16, "0");
                            } else {
                                if (!(izm0Var instanceof gzm0) && !(izm0Var instanceof hzm0)) {
                                    t9f.b();
                                    return null;
                                }
                                boolean z13 = izm0Var instanceof hzm0;
                                String strA6 = z13 ? ((hzm0) izm0Var).g : izm0Var.a();
                                String strB3 = z13 ? ((hzm0) izm0Var).h : izm0Var.b();
                                vzb.E(dpi0Var16, "\u2066");
                                if (z12) {
                                    vzb.D(dpi0Var16, strB3, vzb.L(izm0Var.i()));
                                    vzb.C(dpi0Var16);
                                    vzb.D(dpi0Var16, strA6, vzb.L(izm0Var.j()));
                                } else {
                                    vzb.D(dpi0Var16, strA6, vzb.L(izm0Var.j()));
                                    vzb.C(dpi0Var16);
                                    vzb.D(dpi0Var16, strB3, vzb.L(izm0Var.i()));
                                }
                                vzb.E(dpi0Var16, "\u2069");
                            }
                        } else {
                            vzb.E(dpi0Var16, strG2);
                            if (str18.length() > 0) {
                                vzb.A(dpi0Var16);
                                vzb.E(dpi0Var16, str18);
                            }
                            if (z11) {
                                vzb.A(dpi0Var16);
                                i = 0;
                                vzb.E(dpi0Var16, ctf0Var2.b.a(R.string.game_end, Arrays.copyOf(new Object[0], 0)));
                            } else {
                                i = 0;
                            }
                            if (z5) {
                                vzb.A(dpi0Var16);
                                vzb.E(dpi0Var16, ctf0Var2.b.a(R.string.card_cricket_break, Arrays.copyOf(new Object[i], i)));
                            }
                        }
                        j83 j83VarH3 = ((h83) dpi0Var16.f6468a).h();
                        nz10 nz10Var = (nz10) pz10Var2;
                        boolean z14 = nz10Var instanceof mz10;
                        k5q0 k5q0Var = k5q0.b;
                        if (!z14) {
                            if (nz10Var instanceof oz10) {
                                oz10 oz10Var = (oz10) nz10Var;
                                String str19 = oz10Var.i;
                                String str20 = oz10Var.g;
                                String str21 = oz10Var.m;
                                String str22 = oz10Var.k;
                                boolean z15 = ((StringsKt.W(str22) || str22.equals("0")) && (StringsKt.W(str21) || str21.equals("0"))) ? false : true;
                                boolean z16 = str20.length() > 0 || str19.length() > 0;
                                eex eexVarG = vzb.G(oz10Var.o);
                                ArrayList arrayList5 = oz10Var.f;
                                ArrayList arrayList6 = new ArrayList(r3d.q(arrayList5, 10));
                                Iterator it = arrayList5.iterator();
                                while (it.hasNext()) {
                                    te90 te90Var = (te90) it.next();
                                    arrayList6.add(new yd90(vzb.O(te90Var), vzb.Q(te90Var), te90Var.f33809a));
                                    it = it;
                                    z15 = z15;
                                }
                                boolean z17 = z15;
                                i4 i4VarR1 = dyb.r0(arrayList6);
                                j83 j83VarN = vzb.N(nz10Var);
                                j83 j83VarP = vzb.P(nz10Var);
                                lsm0 lsm0Var2 = ctf0Var2.b;
                                yd90 yd90Var3 = new yd90(j83VarN, j83VarP, lsm0Var2.a(R.string.total_count, Arrays.copyOf(new Object[0], 0)));
                                if (z17) {
                                    h83 h83Var = new h83();
                                    long j2 = y3d.g;
                                    long j3 = daq0.c;
                                    smk0 smk0Var = new smk0(vzb.L(oz10Var.l), j3, null, null, null, null, null, j3, new j56(0.0f), null, null, j2, k5q0Var, null, null, 17424);
                                    h83Var.c(str22);
                                    j83 j83VarC = kng0.c(h83Var.f12607a, h83Var, smk0Var, 0);
                                    h83 h83Var2 = new h83();
                                    smk0 smk0Var2 = new smk0(vzb.L(oz10Var.n), j3, null, null, null, null, null, j3, new j56(0.0f), null, null, j2, k5q0Var, null, null, 17424);
                                    h83Var2.c(str21);
                                    yd90Var = new yd90(j83VarC, kng0.c(h83Var2.f12607a, h83Var2, smk0Var2, 0), lsm0Var2.a(R.string.dt_points, Arrays.copyOf(new Object[0], 0)));
                                } else {
                                    yd90Var = null;
                                }
                                if (z16) {
                                    h83 h83Var3 = new h83();
                                    long j4 = y3d.g;
                                    long j5 = daq0.c;
                                    smk0 smk0Var3 = new smk0(vzb.L(oz10Var.h), j5, null, null, null, null, null, j5, new j56(0.0f), null, null, j4, k5q0Var, null, null, 17424);
                                    h83Var3.c(str20);
                                    j83 j83VarC2 = kng0.c(h83Var3.f12607a, h83Var3, smk0Var3, 0);
                                    h83 h83Var4 = new h83();
                                    smk0 smk0Var4 = new smk0(vzb.L(oz10Var.j), j5, null, null, null, null, null, j5, new j56(0.0f), null, null, j4, k5q0Var, null, null, 17424);
                                    h83Var4.c(str19);
                                    yd90Var2 = new yd90(j83VarC2, kng0.c(h83Var4.f12607a, h83Var4, smk0Var4, 0), lsm0Var2.a(R.string.tennis_game_column, Arrays.copyOf(new Object[0], 0)));
                                } else {
                                    yd90Var2 = null;
                                }
                                iul0Var2 = new iul0(eexVarG, i4VarR1, yd90Var3, yd90Var2, yd90Var);
                            } else {
                                if (!(nz10Var instanceof kz10)) {
                                    t9f.b();
                                    return null;
                                }
                                kz10 kz10Var = (kz10) nz10Var;
                                eex eexVarG2 = vzb.G(kz10Var.g);
                                ArrayList<te90> arrayList7 = kz10Var.f;
                                ArrayList arrayList8 = new ArrayList(r3d.q(arrayList7, 10));
                                for (te90 te90Var2 : arrayList7) {
                                    arrayList8.add(new yd90(vzb.O(te90Var2), vzb.Q(te90Var2), te90Var2.f33809a));
                                }
                                iul0Var = new iul0(eexVarG2, dyb.r0(arrayList8), new yd90(vzb.N(nz10Var), vzb.P(nz10Var), ctf0Var2.b.a(R.string.total_count, Arrays.copyOf(new Object[0], 0))), null, null);
                            }
                            if (rpp0Var4 instanceof qpp0) {
                                if (rpp0Var4 instanceof ppp0) {
                                    ppp0 ppp0Var13 = (ppp0) rpp0Var4;
                                    return new xrr(uqrVarR6, b8k0.c0(ppp0Var13.e, ppp0Var13.g, list3), b8k0.c0(ppp0Var13.f, ppp0Var13.h, list2), j83VarH3, iul0Var2);
                                }
                                t9f.b();
                                return null;
                            }
                            qpp0 qpp0Var13 = (qpp0) rpp0Var4;
                            String str2115 = qpp0Var13.g;
                            str3 = (String) CollectionsKt.firstOrNull(list3);
                            if (str3 == null) {
                                str3 = "";
                            }
                            c280 c280Var12 = new c280(vsm0.s(qpp0Var13.e, str3), R.drawable.ic_glyph_placeholder_player);
                            long j18 = qpp0Var13.e;
                            bap bapVar12 = bap.b;
                            jdp0 jdp0Var15 = new jdp0(str2115, n6x.o0(c280Var12, j18, list, zBooleanValue, bapVar12), null);
                            String str2116 = qpp0Var13.h;
                            str4 = (String) CollectionsKt.firstOrNull(list2);
                            if (str4 == null) {
                                str4 = "";
                            }
                            return new xrr(uqrVarR6, jdp0Var15, new jdp0(str2116, n6x.o0(new c280(vsm0.s(qpp0Var13.f, str4), R.drawable.ic_glyph_placeholder_player), qpp0Var13.f, list, zBooleanValue, bapVar12), null), j83VarH3, iul0Var2);
                        }
                        mz10 mz10Var = (mz10) nz10Var;
                        eex eexVarG3 = vzb.G(mz10Var.g);
                        ArrayList<te90> arrayList9 = mz10Var.f;
                        ArrayList arrayList10 = new ArrayList(r3d.q(arrayList9, 10));
                        for (te90 te90Var3 : arrayList9) {
                            arrayList10.add(new yd90(vzb.O(te90Var3), vzb.Q(te90Var3), te90Var3.f33809a));
                        }
                        i4 i4VarR2 = dyb.r0(arrayList10);
                        j83 j83VarN2 = vzb.N(nz10Var);
                        j83 j83VarP2 = vzb.P(nz10Var);
                        lsm0 lsm0Var3 = ctf0Var2.b;
                        yd90 yd90Var4 = new yd90(j83VarN2, j83VarP2, lsm0Var3.a(R.string.total_count, Arrays.copyOf(new Object[0], 0)));
                        h83 h83Var5 = new h83();
                        String str25 = mz10Var.h;
                        long j7 = y3d.g;
                        long j8 = daq0.c;
                        smk0 smk0Var5 = new smk0(vzb.L(mz10Var.i), j8, null, null, null, null, null, j8, new j56(0.0f), null, null, j7, k5q0Var, null, null, 17424);
                        h83Var5.c(str25);
                        j83 j83VarC3 = kng0.c(h83Var5.f12607a, h83Var5, smk0Var5, 0);
                        h83 h83Var6 = new h83();
                        String str26 = mz10Var.j;
                        smk0 smk0Var6 = new smk0(vzb.L(mz10Var.k), j8, null, null, null, null, null, j8, new j56(0.0f), null, null, j7, k5q0Var, null, null, 17424);
                        h83Var6.c(str26);
                        iul0Var = new iul0(eexVarG3, i4VarR2, yd90Var4, null, new yd90(j83VarC3, kng0.c(h83Var6.f12607a, h83Var6, smk0Var6, 0), lsm0Var3.a(R.string.dt_points, Arrays.copyOf(new Object[0], 0))));
                        iul0Var2 = iul0Var;
                        if (rpp0Var4 instanceof qpp0) {
                            if (rpp0Var4 instanceof ppp0) {
                                ppp0 ppp0Var14 = (ppp0) rpp0Var4;
                                return new xrr(uqrVarR6, b8k0.c0(ppp0Var14.e, ppp0Var14.g, list3), b8k0.c0(ppp0Var14.f, ppp0Var14.h, list2), j83VarH3, iul0Var2);
                            }
                            t9f.b();
                            return null;
                        }
                        qpp0 qpp0Var14 = (qpp0) rpp0Var4;
                        String str2117 = qpp0Var14.g;
                        str3 = (String) CollectionsKt.firstOrNull(list3);
                        if (str3 == null) {
                            str3 = "";
                        }
                        c280 c280Var13 = new c280(vsm0.s(qpp0Var14.e, str3), R.drawable.ic_glyph_placeholder_player);
                        long j19 = qpp0Var14.e;
                        bap bapVar13 = bap.b;
                        jdp0 jdp0Var16 = new jdp0(str2117, n6x.o0(c280Var13, j19, list, zBooleanValue, bapVar13), null);
                        String str2118 = qpp0Var14.h;
                        str4 = (String) CollectionsKt.firstOrNull(list2);
                        if (str4 == null) {
                            str4 = "";
                        }
                        return new xrr(uqrVarR6, jdp0Var16, new jdp0(str2118, n6x.o0(new c280(vsm0.s(qpp0Var14.f, str4), R.drawable.ic_glyph_placeholder_player), qpp0Var14.f, list, zBooleanValue, bapVar13), null), j83VarH3, iul0Var2);
                    }
                }
                return qrr.f29223a;
            }

            /* JADX WARN: Code duplicated, block: B:18:0x008a  */
            private final Object b(Object obj) {
                String strG;
                lz10 lz10Var;
                float f;
                fad dadVar;
                sad qadVar;
                j83 j83VarC;
                j83 j83VarC2;
                gna gnaVar = (gna) obj;
                if (gnaVar == null) {
                    return null;
                }
                if (!(gnaVar instanceof ena)) {
                    if (gnaVar instanceof fna) {
                        return null;
                    }
                    t9f.b();
                    return null;
                }
                ena enaVar = (ena) gnaVar;
                mca mcaVar = enaVar.f8084a;
                rjs rjsVar = this.b;
                jg30 jg30Var = (jg30) ((fee) rjsVar.H.getValue()).b();
                bg30 bg30Var = (bg30) ((fee) rjsVar.I.getValue()).c();
                pz10 pz10Var = bg30Var != null ? bg30Var.f2536a : null;
                ctf0 ctf0Var2 = rjsVar.f30611a;
                boolean z = enaVar.p;
                znq0 znq0Var = (znq0) ((fee) rjsVar.t.getValue()).c();
                boolean zBooleanValue = ((Boolean) ((fee) rjsVar.v.getValue()).c()).booleanValue();
                ctf0Var2.getClass();
                dja djaVar = dja.PENALTY;
                k5q0 k5q0Var = k5q0.b;
                if (jg30Var != null) {
                    dadVar = new ead(jg30Var);
                    f = 0.0f;
                    lz10Var = null;
                } else {
                    h83 h83Var = new h83();
                    if (znq0Var != null) {
                        rdj rdjVar = rdj.f30294a;
                        strG = rdj.g(znq0Var, efj.UNIVERSAL, Boolean.valueOf(z), false, 56);
                        if (strG == null) {
                            strG = "";
                        }
                    } else {
                        strG = "";
                    }
                    pz40 pz40Var = s6t0.f31722a;
                    long textPrimary = s6t0.b().f33626a.getTextPrimary();
                    h83 h83Var2 = new h83();
                    long j = y3d.g;
                    long j2 = daq0.c;
                    lz10Var = null;
                    f = 0.0f;
                    smk0 smk0Var = new smk0(textPrimary, j2, null, null, null, null, null, j2, new j56(0.0f), null, null, j, k5q0Var, null, null, 17424);
                    h83Var2.c(strG);
                    StringBuilder sb = h83Var2.f12607a;
                    h83Var2.a(smk0Var, 0, sb.length());
                    sb.length();
                    h83Var.b(h83Var2.h());
                    dadVar = new dad(h83Var.h());
                }
                d3h0 cl5Var = pz10Var;
                if (mcaVar instanceof pca) {
                    if (pz10Var == null) {
                        cl5Var = new cl5((byte) 28);
                    }
                    rpp0 rpp0Var = ((pca) mcaVar).f26749a;
                    String strB = rpp0Var.b();
                    String strD = rpp0Var.d();
                    boolean z2 = cl5Var instanceof lz10;
                    lz10 lz10Var2 = z2 ? (lz10) cl5Var : lz10Var;
                    String strT = lz10Var2 != null ? vzb.T(lz10Var2, zBooleanValue) : "0";
                    lz10 lz10Var3 = z2 ? (lz10) cl5Var : lz10Var;
                    qadVar = new pad(strB, strD, strT, lz10Var3 != null ? vzb.U(lz10Var3, zBooleanValue) : "0", cl5Var.j(), cl5Var.i());
                } else if (mcaVar instanceof tca) {
                    rpp0 rpp0Var2 = ((tca) mcaVar).f33711a;
                    String strB2 = rpp0Var2.b();
                    String strD2 = rpp0Var2.d();
                    h83 h83Var3 = new h83();
                    String strA = ctf0Var2.b.a(R.string.vs, Arrays.copyOf(new Object[0], 0));
                    long j3 = y3d.g;
                    long j4 = daq0.c;
                    pz40 pz40Var2 = s6t0.f31722a;
                    smk0 smk0Var2 = new smk0(s6t0.b().f33626a.getTextPrimary(), j4, null, null, null, null, null, j4, new j56(f), null, null, j3, k5q0Var, null, null, 17424);
                    h83Var3.c(strA);
                    qadVar = new rad(kng0.c(h83Var3.f12607a, h83Var3, smk0Var2, 0), strB2, strD2);
                } else if (mcaVar instanceof xca) {
                    rpp0 rpp0Var3 = ((xca) mcaVar).f40636a;
                    String strB3 = rpp0Var3.b();
                    String strD3 = rpp0Var3.d();
                    if (pz10Var != null) {
                        j83VarC2 = vzb.M(pz10Var);
                    } else {
                        h83 h83Var4 = new h83();
                        String strA2 = ctf0Var2.b.a(R.string.vs, Arrays.copyOf(new Object[0], 0));
                        long j5 = y3d.g;
                        long j6 = daq0.c;
                        pz40 pz40Var3 = s6t0.f31722a;
                        smk0 smk0Var3 = new smk0(s6t0.b().f33626a.getTextPrimary(), j6, null, null, null, null, null, j6, new j56(f), null, null, j5, k5q0Var, null, null, 17424);
                        h83Var4.c(strA2);
                        j83VarC2 = kng0.c(h83Var4.f12607a, h83Var4, smk0Var3, 0);
                    }
                    qadVar = new rad(j83VarC2, strB3, strD3);
                } else if (mcaVar instanceof gda) {
                    gda gdaVar = (gda) mcaVar;
                    String strB0 = CollectionsKt.b0(gdaVar.f11094a, Separators.SLASH, null, null, null, 62);
                    String strB1 = CollectionsKt.b0(gdaVar.b, Separators.SLASH, null, null, null, 62);
                    h83 h83Var5 = new h83();
                    String strA3 = ctf0Var2.b.a(R.string.vs, Arrays.copyOf(new Object[0], 0));
                    long j7 = y3d.g;
                    long j8 = daq0.c;
                    pz40 pz40Var4 = s6t0.f31722a;
                    smk0 smk0Var4 = new smk0(s6t0.b().f33626a.getTextPrimary(), j8, null, null, null, null, null, j8, new j56(f), null, null, j7, k5q0Var, null, null, 17424);
                    h83Var5.c(strA3);
                    qadVar = new rad(kng0.c(h83Var5.f12607a, h83Var5, smk0Var4, 0), strB0, strB1);
                } else if (mcaVar instanceof hda) {
                    hda hdaVar = (hda) mcaVar;
                    String strB4 = CollectionsKt.b0(hdaVar.f12861a, Separators.SLASH, null, null, null, 62);
                    String strB5 = CollectionsKt.b0(hdaVar.b, Separators.SLASH, null, null, null, 62);
                    if (pz10Var != null) {
                        j83VarC = vzb.M(pz10Var);
                    } else {
                        h83 h83Var6 = new h83();
                        String strA4 = ctf0Var2.b.a(R.string.vs, Arrays.copyOf(new Object[0], 0));
                        long j9 = y3d.g;
                        long j10 = daq0.c;
                        pz40 pz40Var5 = s6t0.f31722a;
                        smk0 smk0Var5 = new smk0(s6t0.b().f33626a.getTextPrimary(), j10, null, null, null, null, null, j10, new j56(f), null, null, j9, k5q0Var, null, null, 17424);
                        h83Var6.c(strA4);
                        j83VarC = kng0.c(h83Var6.f12607a, h83Var6, smk0Var5, 0);
                    }
                    qadVar = new rad(j83VarC, strB4, strB5);
                } else {
                    if (!(mcaVar instanceof ida)) {
                        t9f.b();
                        return lz10Var;
                    }
                    qadVar = new qad(((ida) mcaVar).e);
                }
                return new dax(dadVar, qadVar);
            }

            /* JADX WARN: Code duplicated, block: B:140:0x0381  */
            /* JADX WARN: Code duplicated, block: B:70:0x01a8  */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                kc50 kc50Var;
                p700 p700Var;
                ena enaVar;
                uia uiaVar;
                String strA;
                String strC;
                String strC2;
                zvl0 zvl0Var;
                yja yjaVar;
                qal0 qal0Var;
                Object b0k0Var;
                i49 g49Var;
                dxh0 dxh0Var;
                hna hnaVar;
                lmo lmoVar;
                byte b12 = b11;
                int i = 0;
                rjs rjsVar = this.b;
                switch (b12) {
                    case 0:
                        List list = (List) obj;
                        list.getClass();
                        boolean zBooleanValue = ((Boolean) ((fee) rjsVar.c.getValue()).c()).booleanValue();
                        boolean zBooleanValue2 = ((Boolean) ((fee) rjsVar.e.getValue()).c()).booleanValue();
                        boolean zBooleanValue3 = ((Boolean) ((fee) rjsVar.f.getValue()).c()).booleanValue();
                        tf50 tf50Var = (tf50) ((fee) rjsVar.d.getValue()).c();
                        tf50Var.getClass();
                        if (!list.contains(tf50Var)) {
                            tf50Var = tf50.f33851a;
                        }
                        boolean z = !zBooleanValue2;
                        kc50 kc50Var2 = new kc50(R.drawable.ic_glyph_rectangular_scoreboard, tf50Var == tf50.f33851a);
                        tf50 tf50Var2 = tf50.b;
                        kc50 kc50Var3 = list.contains(tf50Var2) ? new kc50(R.drawable.ic_glyph_rectangular_broadcast, tf50Var == tf50Var2) : null;
                        tf50 tf50Var3 = tf50.c;
                        if (list.contains(tf50Var3)) {
                            kc50Var = new kc50(R.drawable.ic_glyph_rectangular_statistic, tf50Var == tf50Var3);
                        } else {
                            kc50Var = null;
                        }
                        return new ojs(zBooleanValue, z, zBooleanValue, zBooleanValue3, new hjs(kc50Var2, kc50Var3, kc50Var, tf50Var));
                    case 1:
                        n0o0 n0o0Var = rjsVar.o;
                        gna gnaVar = (gna) obj;
                        if ((gnaVar instanceof ena ? (ena) gnaVar : null) == null || (p700Var = ((ena) gnaVar).l) == null) {
                            return null;
                        }
                        List list2 = p700Var.e;
                        List list3 = (List) ((fee) n0o0Var.getValue()).c();
                        ch00 ch00Var = ch00.LAST_GAMES;
                        boolean zContains = list3.contains(ch00Var);
                        List list4 = (List) ((fee) n0o0Var.getValue()).c();
                        ch00 ch00Var2 = ch00.LAST_GAMES_OPP_ONE;
                        boolean zContains2 = list4.contains(ch00Var2);
                        List list5 = (List) ((fee) n0o0Var.getValue()).c();
                        ch00 ch00Var3 = ch00.LAST_GAMES_OPP_TWO;
                        boolean zContains3 = list5.contains(ch00Var3);
                        ctf0 ctf0Var2 = rjsVar.f30611a;
                        ctf0Var2.getClass();
                        ArrayList arrayList = new ArrayList();
                        List list6 = p700Var.g;
                        List list7 = p700Var.f;
                        if (!list2.isEmpty()) {
                            arrayList.add(z1x.T(list2, ctf0Var2, ctf0Var2.b.a(R.string.previous_meetings, Arrays.copyOf(new Object[0], 0)), ch00Var, zContains));
                        }
                        if (!list7.isEmpty()) {
                            arrayList.add(z1x.T(list7, ctf0Var2, kng0.l(ctf0Var2.b.a(R.string.last_games, Arrays.copyOf(new Object[0], 0)), ": ", p700Var.c), ch00Var2, zContains2));
                        }
                        if (!list6.isEmpty()) {
                            arrayList.add(z1x.T(list6, ctf0Var2, kng0.l(ctf0Var2.b.a(R.string.last_games, Arrays.copyOf(new Object[0], 0)), ": ", p700Var.d), ch00Var3, zContains3));
                        }
                        return arrayList;
                    case 2:
                        gna gnaVar2 = (gna) obj;
                        if ((gnaVar2 instanceof ena ? (ena) gnaVar2 : null) == null || (uiaVar = (enaVar = (ena) gnaVar2).h) == null) {
                            return null;
                        }
                        ctf0 ctf0Var3 = rjsVar.f30611a;
                        boolean z2 = enaVar.p;
                        ctf0Var3.getClass();
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it = uiaVar.c.iterator();
                        int i2 = 0;
                        while (it.hasNext()) {
                            Object next = it.next();
                            int i3 = i2 + 1;
                            if (i2 < 0) {
                                q3d.p();
                                throw null;
                            }
                            bsw bswVar = (bsw) next;
                            String str = bswVar.b;
                            String str2 = bswVar.e;
                            String strA2 = (str.length() <= 0 || str2.length() <= 0) ? ctf0Var3.b.a(R.string.vs, Arrays.copyOf(new Object[0], 0)) : w6x.q(bswVar.b, " : ", str2);
                            odp0 odp0Var = new odp0(new d5a0(new c280(bswVar.c, R.drawable.ic_glyph_placeholder_player)));
                            String strM = dw9.m(i3, ". ", bswVar.f3153a);
                            odp0 odp0Var2 = new odp0(new d5a0(new c280(bswVar.f, R.drawable.ic_glyph_placeholder_player)));
                            String strM2 = dw9.m(i3, ". ", bswVar.d);
                            rdj rdjVar = rdj.f30294a;
                            arrayList2.add(new hzy(odp0Var, strM, odp0Var2, strM2, rdj.g(new znq0(bswVar.g), efj.UNIVERSAL, Boolean.valueOf(z2), false, 56), strA2, "", null, null));
                            it = it;
                            i2 = i3;
                        }
                        dja djaVar = dja.PENALTY;
                        return new eax(dyb.o0(arrayList2), uiaVar.f35722a, uiaVar.b);
                    case 3:
                        anq0 anq0Var2 = (anq0) obj;
                        if (anq0Var2 != null) {
                            boolean z3 = ((Boolean) ((fee) rjsVar.g.getValue()).c()).booleanValue() || ((Boolean) ((fee) rjsVar.h.getValue()).c()).booleanValue();
                            ctf0 ctf0Var4 = rjsVar.f30611a;
                            ctf0Var4.getClass();
                            long j = anq0Var2.e;
                            long j2 = anq0Var2.d;
                            boolean z4 = anq0Var2.j;
                            if (j != 0 || !z4) {
                                String str3 = anq0Var2.c;
                                if (z4) {
                                    if (str3.length() > 0) {
                                        strA = ctf0Var4.b.a(R.string.live_additional_min_v2, Arrays.copyOf(new Object[]{str3}, 1));
                                    } else if (anq0Var2.f1167a) {
                                        strA = "";
                                    } else {
                                        strA = anq0Var2.b ? ctf0Var4.b.a(R.string.line_live_time_period_back_v2, Arrays.copyOf(new Object[]{""}, 1)) : ctf0Var4.b.a(R.string.line_live_time_period_capitalized_v2, Arrays.copyOf(new Object[]{""}, 1));
                                    }
                                } else if (j2 < 0) {
                                    strA = ctf0Var4.b.a(R.string.game_started, Arrays.copyOf(new Object[0], 0));
                                } else {
                                    long j3 = j2 / 86400;
                                    strA = j3 > 0 ? ctf0Var4.b.a(R.string.line_time_before_v2, Arrays.copyOf(new Object[]{String.valueOf(j3)}, 1)) : ctf0Var4.b.a(R.string.before_start, Arrays.copyOf(new Object[0], 0));
                                }
                                String strC3 = (z3 || z4 || j2 < 0) ? null : n2x.C((((j2 < 0 ? 0L : j2) / 60) / 60) % 24);
                                if (z3) {
                                    strC = null;
                                } else {
                                    long jB = (z4 ? vzb.V(anq0Var2).b() : j2 < 0 ? 0L : j2) / 60;
                                    if (!z4) {
                                        jB %= 60;
                                    }
                                    strC = n2x.C(jB);
                                }
                                if (z3) {
                                    strC2 = null;
                                } else {
                                    strC2 = n2x.C((z4 ? vzb.V(anq0Var2).b() : j2 >= 0 ? j2 : 0L) % 60);
                                }
                                return new jg30(strA, strC3, strC, strC2);
                            }
                        }
                        return null;
                    case 4:
                        gna gnaVar3 = (gna) obj;
                        ena enaVar2 = gnaVar3 instanceof ena ? (ena) gnaVar3 : null;
                        if (enaVar2 == null || (zvl0Var = ((ena) gnaVar3).k) == null) {
                            return null;
                        }
                        String str4 = zvl0Var.m;
                        String str5 = enaVar2.q;
                        ctf0 ctf0Var5 = rjsVar.f30611a;
                        m1v0 m1v0Var = (m1v0) ((fee) rjsVar.J.getValue()).b();
                        str5.getClass();
                        ctf0Var5.getClass();
                        String str6 = zvl0Var.f45064a;
                        Pair pair = str4.length() > 0 ? new Pair(str4, ctf0Var5.b.a(R.string.web_site, Arrays.copyOf(new Object[0], 0))) : new Pair(null, null);
                        String str7 = (String) pair.f46059a;
                        String str8 = (String) pair.b;
                        dja djaVar2 = dja.PENALTY;
                        String str9 = zvl0Var.b;
                        ArrayList arrayList3 = new ArrayList();
                        String str10 = zvl0Var.l;
                        String str11 = zvl0Var.k;
                        String str12 = zvl0Var.j;
                        String str13 = zvl0Var.i;
                        String str14 = zvl0Var.h;
                        String str15 = zvl0Var.g;
                        String str16 = zvl0Var.f;
                        String str17 = zvl0Var.e;
                        String str18 = zvl0Var.d;
                        String str19 = zvl0Var.c;
                        if (str6.length() > 0) {
                            arrayList3.add(l7x.J(ctf0Var5, str6, R.string.address));
                        }
                        if (str19.length() > 0) {
                            arrayList3.add(l7x.J(ctf0Var5, str19, R.string.capacity));
                        }
                        if (str18.length() > 0) {
                            arrayList3.add(l7x.J(ctf0Var5, str18, R.string.covering));
                        }
                        if (str17.length() > 0) {
                            arrayList3.add(l7x.J(ctf0Var5, str17, R.string.city_name));
                        }
                        if (str16.length() > 0) {
                            arrayList3.add(l7x.J(ctf0Var5, str16, R.string.architect));
                        }
                        if (str15.length() > 0) {
                            arrayList3.add(l7x.J(ctf0Var5, str15, R.string.old_name));
                        }
                        if (str14.length() > 0) {
                            arrayList3.add(l7x.J(ctf0Var5, str14, R.string.category));
                        }
                        if (str13.length() > 0) {
                            arrayList3.add(l7x.J(ctf0Var5, str13, R.string.history));
                        }
                        if (str12.length() > 0) {
                            arrayList3.add(l7x.J(ctf0Var5, str12, R.string.opened));
                        }
                        if (str11.length() > 0) {
                            arrayList3.add(l7x.J(ctf0Var5, str11, R.string.zip_code));
                        }
                        if (str10.length() > 0) {
                            arrayList3.add(l7x.J(ctf0Var5, "\u2066" + str10 + "\u2069", R.string.phone));
                        }
                        a4x a4xVarO0 = dyb.o0(arrayList3);
                        List list8 = zvl0Var.n;
                        ArrayList arrayList4 = new ArrayList(r3d.q(list8, 10));
                        Iterator it2 = list8.iterator();
                        while (it2.hasNext()) {
                            arrayList4.add(String.format(Locale.ENGLISH, "%s/sfiles/stadium/%s", Arrays.copyOf(new Object[]{str5, (String) it2.next()}, 2)));
                        }
                        a4x a4xVarO1 = dyb.o0(arrayList4);
                        if (a4xVarO1.isEmpty()) {
                            a4xVarO1 = dyb.g0("");
                        }
                        return new iax(m1v0Var, str9, a4xVarO0, str7, str8, a4xVarO1);
                    case 5:
                        gna gnaVar4 = (gna) obj;
                        if ((gnaVar4 instanceof ena ? (ena) gnaVar4 : null) != null && (yjaVar = ((ena) gnaVar4).i) != null) {
                            List list9 = yjaVar.f42730a;
                            if (!list9.isEmpty()) {
                                long jLongValue = ((Number) ((fee) rjsVar.m.getValue()).c()).longValue();
                                lc00 lc00VarB = kotlin.collections.a.b();
                                Iterator it3 = list9.iterator();
                                while (it3.hasNext()) {
                                    he30 he30Var = (he30) it3.next();
                                    List list10 = he30Var.b;
                                    ArrayList arrayList5 = new ArrayList();
                                    for (Object obj2 : list10) {
                                        if (((ge30) obj2).e.length() > 0) {
                                            arrayList5.add(obj2);
                                        }
                                    }
                                    if (!arrayList5.isEmpty()) {
                                        lc00VarB.add(new uim(he30Var.f12902a));
                                        int i4 = i;
                                        for (Object obj3 : arrayList5) {
                                            int i5 = i4 + 1;
                                            if (i4 < 0) {
                                                q3d.p();
                                                throw null;
                                            }
                                            ge30 ge30Var = (ge30) obj3;
                                            String str20 = ge30Var.f11132a;
                                            String str21 = ge30Var.e;
                                            String str22 = ge30Var.c;
                                            String str23 = ge30Var.d;
                                            tho thoVar = ge30Var.b;
                                            Iterator it4 = it3;
                                            List listSplit$default = StringsKt__StringsKt.split$default(str20, new String[]{"+"}, false, i, 6, null);
                                            long j4 = jLongValue;
                                            List listSplit$default2 = StringsKt__StringsKt.split$default(str20, new String[]{Separators.COLON}, false, i, 6, null);
                                            if (j4 == 1) {
                                                if (listSplit$default.size() == 2 && listSplit$default2.size() == 1) {
                                                    str20 = listSplit$default.get(0) + "'+" + kotlin.text.c.r((String) listSplit$default.get(1), Separators.QUOTE, "", false);
                                                } else if (listSplit$default2.size() == 2) {
                                                    str20 = listSplit$default2.get(0) + Separators.QUOTE;
                                                }
                                            }
                                            y6n y6nVar = ge30Var.j == 0 ? y6n.f42107a : y6n.b;
                                            ggm ggmVar = i4 == 0 ? arrayList5.size() + (-1) == 0 ? ggm.c : ggm.f11256a : i4 == arrayList5.size() + (-1) ? ggm.b : ggm.d;
                                            lc00VarB.add((str23.length() == 0 && str22.length() == 0) ? new sim(str20, str21, thoVar.name(), y6nVar, ggmVar, ge30Var.b()) : new rim(str20, str21, new lnm(str23, str22, 0, "", new s0m("", ""), ge30Var.k), ge30Var.a() ? new lnm(ge30Var.h, ge30Var.g, 0, "", new s0m("", ""), ge30Var.l) : null, thoVar.name(), null, y6nVar, ggmVar, ge30Var.b()));
                                            it3 = it4;
                                            i4 = i5;
                                            jLongValue = j4;
                                            i = 0;
                                        }
                                    }
                                    it3 = it3;
                                    jLongValue = jLongValue;
                                    i = 0;
                                }
                                i4 i4VarR0 = dyb.r0(kotlin.collections.a.a(lc00VarB));
                                dja djaVar3 = dja.PENALTY;
                                return new gax(new sf30(i4VarR0));
                            }
                        }
                        return null;
                    case 6:
                        vzj0 vzj0Var = (vzj0) obj;
                        if (!(((fee) rjsVar.B.getValue()).b() instanceof qrr) && vzj0Var != null) {
                            anq0 anq0Var3 = (anq0) ((fee) rjsVar.H.getValue()).c();
                            ctf0 ctf0Var6 = rjsVar.f30611a;
                            ctf0Var6.getClass();
                            znq0 znq0Var = anq0Var3 != null ? anq0Var3.h : null;
                            if (znq0Var != null) {
                                long j5 = znq0Var.f44687a;
                                if (j5 <= 0) {
                                    qal0Var = null;
                                } else {
                                    long j6 = j5 / 86400;
                                    qal0Var = new qal0(j6 > 0 ? ctf0Var6.b.a(R.string.line_time_before_v2, Arrays.copyOf(new Object[]{String.valueOf(j6)}, 1)) : ctf0Var6.b.a(R.string.before_start, Arrays.copyOf(new Object[0], 0)), yyw.L((((j5 < 0 ? 0L : j5) / 60) / 60) % 24), yyw.L(((j5 < 0 ? 0L : j5) / 60) % 60), yyw.L((j5 >= 0 ? j5 : 0L) % 60));
                                }
                            } else {
                                qal0Var = null;
                            }
                            if (vzj0Var instanceof tzj0) {
                                tzj0 tzj0Var = (tzj0) vzj0Var;
                                b0k0Var = new yzj0(tzj0Var.f34807a, tzj0Var.b, tzj0Var.c, tzj0Var.d, qal0Var);
                            } else if (vzj0Var instanceof uzj0) {
                                uzj0 uzj0Var = (uzj0) vzj0Var;
                                b0k0Var = new b0k0(uzj0Var.f36538a, uzj0Var.b, uzj0Var.c, uzj0Var.d, qal0Var);
                            } else {
                                t9f.b();
                            }
                            return b0k0Var;
                        }
                        return null;
                    case 7:
                        boolean zBooleanValue4 = ((Boolean) obj).booleanValue();
                        long jLongValue2 = ((Number) ((fee) rjsVar.j.getValue()).c()).longValue();
                        boolean zBooleanValue5 = ((Boolean) ((fee) rjsVar.i.getValue()).c()).booleanValue();
                        long jLongValue3 = ((Number) ((fee) rjsVar.k.getValue()).c()).longValue();
                        long jLongValue4 = ((Number) ((fee) rjsVar.m.getValue()).c()).longValue();
                        Long l = (Long) ((fee) rjsVar.l.getValue()).c();
                        long jLongValue5 = l != null ? l.longValue() : -1L;
                        if (zBooleanValue4) {
                            return new sym0(new MarketsCategoriesParams(jLongValue2, jLongValue3, jLongValue4, new zq2(), "", zBooleanValue5));
                        }
                        tef0 tef0Var = tef0.f33818a;
                        xuz xuzVar = pb10.c;
                        return new vym0(new RelatedParams(zBooleanValue5, jLongValue2, jLongValue4, -1L, jLongValue5, tef0Var));
                    case 8:
                        return a(obj);
                    case 9:
                        fsr fsrVar = (fsr) obj;
                        if ((fsrVar == null || !fsrVar.b) && (fsrVar == null || !fsrVar.c)) {
                            return k49.f17656a;
                        }
                        o49 o49Var = (o49) ((fee) rjsVar.y.getValue()).c();
                        ctf0 ctf0Var7 = rjsVar.f30611a;
                        zvh0 zvh0Var2 = rjsVar.b;
                        fsrVar.getClass();
                        ctf0Var7.getClass();
                        ArrayList arrayList6 = new ArrayList();
                        if (fsrVar.b) {
                            arrayList6.add(new g49(ctf0Var7.b.a(R.string.video, Arrays.copyOf(new Object[0], 0))));
                        }
                        if (fsrVar.c) {
                            arrayList6.add(new h49(ctf0Var7.b.a(R.string.play_zone, Arrays.copyOf(new Object[0], 0))));
                        }
                        if (o49Var == null) {
                            g49Var = (i49) CollectionsKt.U(arrayList6);
                        } else {
                            int iOrdinal = o49Var.ordinal();
                            if (iOrdinal == 0) {
                                g49Var = new g49(ctf0Var7.b.a(R.string.video, Arrays.copyOf(new Object[0], 0)));
                            } else {
                                if (iOrdinal != 1) {
                                    t9f.b();
                                    return null;
                                }
                                g49Var = new h49(ctf0Var7.b.a(R.string.play_zone, Arrays.copyOf(new Object[0], 0)));
                            }
                            if (arrayList6.isEmpty()) {
                                g49Var = null;
                            } else {
                                Iterator it5 = arrayList6.iterator();
                                do {
                                    if (!it5.hasNext()) {
                                        g49Var = null;
                                    }
                                } while (!Intrinsics.d((i49) it5.next(), g49Var));
                            }
                            if (g49Var == null) {
                                g49Var = (i49) CollectionsKt.U(arrayList6);
                            }
                        }
                        bfu0 bfu0Var = fsrVar.f10077a;
                        GameBroadcastingParams gameBroadcastingParams = new GameBroadcastingParams(bfu0Var.f2522a, bfu0Var.c, bfu0Var.f, bfu0Var.b, bfu0Var.e, bfu0Var.d, bfu0Var.g, null);
                        Iterator it6 = arrayList6.iterator();
                        int i6 = 0;
                        while (true) {
                            if (!it6.hasNext()) {
                                i6 = -1;
                            } else if (!Intrinsics.d((i49) it6.next(), g49Var)) {
                                i6++;
                            }
                        }
                        int i7 = i6;
                        i4 i4VarR1 = dyb.r0(arrayList6);
                        boolean z5 = arrayList6.size() > 1;
                        int iOrdinal2 = zvh0Var2.ordinal();
                        if (iOrdinal2 == 0) {
                            dxh0Var = axh0.f1625a;
                        } else if (iOrdinal2 == 1) {
                            dxh0Var = zwh0.f45106a;
                        } else if (iOrdinal2 == 2) {
                            dxh0Var = cxh0.f5122a;
                        } else {
                            if (iOrdinal2 != 3) {
                                t9f.b();
                                return null;
                            }
                            dxh0Var = bxh0.f3376a;
                        }
                        dxh0 dxh0Var2 = dxh0Var;
                        ArrayList arrayList7 = new ArrayList(r3d.q(arrayList6, 10));
                        Iterator it7 = arrayList6.iterator();
                        while (it7.hasNext()) {
                            arrayList7.add(new yvh0(((i49) it7.next()).getDescription(), bwh0.f3325a));
                        }
                        return new j49(gameBroadcastingParams, i7, g49Var, i4VarR1, z5, dxh0Var2, dyb.r0(arrayList7));
                    case 10:
                        return b(obj);
                    default:
                        gna gnaVar5 = (gna) obj;
                        if ((gnaVar5 instanceof ena ? (ena) gnaVar5 : null) == null || (hnaVar = ((ena) gnaVar5).j) == null) {
                            return null;
                        }
                        boolean zContains4 = ((List) ((fee) rjsVar.o.getValue()).c()).contains(ch00.SHORT_STATISTIC);
                        ctf0 ctf0Var8 = rjsVar.f30611a;
                        ctf0Var8.getClass();
                        List<vrj0> list11 = hnaVar.f;
                        ArrayList arrayList8 = new ArrayList(r3d.q(list11, 10));
                        for (vrj0 vrj0Var : list11) {
                            float fS = r7x.s(vrj0Var.b);
                            float fS2 = r7x.s(vrj0Var.c);
                            String str24 = vrj0Var.f37902a;
                            String str25 = vrj0Var.b;
                            String str26 = vrj0Var.c;
                            if (fS == 0.0f && fS2 == 0.0f) {
                                fS = 0.0f;
                            }
                            arrayList8.add(new srj0(fS, (fS == 0.0f && fS2 == 0.0f) ? 0.0f : fS2, str24, str25, str26));
                        }
                        dja djaVar4 = dja.PENALTY;
                        ch00 ch00Var4 = ch00.SHORT_STATISTIC;
                        i4 i4VarR2 = zContains4 ? dyb.r0(arrayList8) : dyb.r0(CollectionsKt.D0(arrayList8, 3));
                        if (arrayList8.size() - 1 > 3) {
                            lsm0 lsm0Var = ctf0Var8.b;
                            lmoVar = new lmo(lsm0Var.a(R.string.expand, Arrays.copyOf(new Object[0], 0)), lsm0Var.a(R.string.collapse, Arrays.copyOf(new Object[0], 0)), zContains4);
                        } else {
                            lmoVar = null;
                        }
                        return new hax(i4VarR2, lmoVar);
                }
            }
        });
        final byte b12 = 6;
        this.M = maz.b(new yw9(njsVar.y, new Function1(this) { // from class: a.qjs
            public final /* synthetic */ rjs b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:260:0x08d4  */
            /* JADX WARN: Code duplicated, block: B:262:0x08e4  */
            /* JADX WARN: Code duplicated, block: B:265:0x090f  */
            /* JADX WARN: Code duplicated, block: B:268:0x0932  */
            /* JADX WARN: Code duplicated, block: B:270:0x0936  */
            /* JADX WARN: Code duplicated, block: B:272:0x094e  */
            private final Object a(Object obj) {
                n0o0 n0o0Var;
                n0o0 n0o0Var2;
                String str;
                String str2;
                mqr kqrVar;
                String strG;
                d3h0 pekVar;
                String strN;
                d3h0 xakVar;
                Integer num;
                String strN2;
                int i;
                iul0 iul0Var;
                yd90 yd90Var;
                yd90 yd90Var2;
                iul0 iul0Var2;
                String str3;
                String str4;
                d3h0 bekVar;
                String strA;
                String strB;
                String strN3;
                rjs rjsVar = this.b;
                n0o0 n0o0Var3 = rjsVar.v;
                n0o0 n0o0Var4 = rjsVar.m;
                n0o0 n0o0Var5 = rjsVar.H;
                n0o0 n0o0Var6 = rjsVar.I;
                ctf0 ctf0Var2 = rjsVar.f30611a;
                gna gnaVar = (gna) obj;
                if (gnaVar != null) {
                    if (!(gnaVar instanceof ena)) {
                        if (gnaVar instanceof fna) {
                            ctf0Var2.getClass();
                            return new orr(d9x.L(((fna) gnaVar).f9825a, ctf0Var2));
                        }
                        t9f.b();
                        return null;
                    }
                    ena enaVar = (ena) gnaVar;
                    mca mcaVar = enaVar.f8084a;
                    List list = (List) ((fee) rjsVar.n.getValue()).c();
                    boolean zBooleanValue = ((Boolean) ((fee) rjsVar.e.getValue()).c()).booleanValue();
                    mpm mpmVar = (mpm) ((fee) n0o0Var6.getValue()).b();
                    boolean z = enaVar.p;
                    String str5 = (String) ((fee) rjsVar.p.getValue()).c();
                    String str6 = (String) ((fee) rjsVar.q.getValue()).c();
                    String str7 = (String) ((fee) rjsVar.r.getValue()).c();
                    String str8 = (String) ((fee) rjsVar.s.getValue()).c();
                    jg30 jg30Var = (jg30) ((fee) n0o0Var5.getValue()).b();
                    bg30 bg30Var = (bg30) ((fee) n0o0Var6.getValue()).c();
                    znq0 znq0Var = (znq0) ((fee) rjsVar.t.getValue()).c();
                    bha bhaVar = enaVar.o;
                    ui9 ui9Var = (ui9) ((fee) rjsVar.u.getValue()).c();
                    long jLongValue = ((Number) ((fee) n0o0Var4.getValue()).c()).longValue();
                    boolean zBooleanValue2 = ((Boolean) ((fee) n0o0Var3.getValue()).c()).booleanValue();
                    ctf0Var2.getClass();
                    if (ui9Var != null) {
                        int i2 = ui9Var.c;
                        int i3 = ui9Var.d;
                        n0o0Var = n0o0Var4;
                        String strN4 = (cy7.c() && zBooleanValue2) ? w6x.n(i3, i2, " : ") : w6x.n(i2, i3, " : ");
                        String strX = j0x.x(jLongValue, ctf0Var2);
                        ArrayList arrayList = ui9Var.f35720a;
                        n0o0Var2 = n0o0Var5;
                        str = str5;
                        str2 = str6;
                        ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
                        int i4 = 0;
                        for (Object obj2 : arrayList) {
                            int i5 = i4 + 1;
                            if (i4 < 0) {
                                q3d.p();
                                throw null;
                            }
                            arrayList2.add(piz.W((sc90) obj2, jLongValue, i4));
                            i4 = i5;
                        }
                        i4 i4VarR0 = dyb.r0(arrayList2);
                        ArrayList arrayList3 = ui9Var.b;
                        ArrayList arrayList4 = new ArrayList(r3d.q(arrayList3, 10));
                        int i6 = 0;
                        for (Object obj3 : arrayList3) {
                            int i7 = i6 + 1;
                            if (i6 < 0) {
                                q3d.p();
                                throw null;
                            }
                            arrayList4.add(piz.W((sc90) obj3, jLongValue, i6));
                            i6 = i7;
                        }
                        kqrVar = new iqr(strN4, strX, i4VarR0, dyb.r0(arrayList4));
                    } else {
                        n0o0Var = n0o0Var4;
                        n0o0Var2 = n0o0Var5;
                        str = str5;
                        str2 = str6;
                        if (bhaVar != null) {
                            float f = bhaVar.d;
                            float f2 = bhaVar.e;
                            float f3 = bhaVar.f;
                            Object[] objArr = {Float.valueOf(f3)};
                            lsm0 lsm0Var = ctf0Var2.b;
                            String strA2 = lsm0Var.a(R.string.n_percents, Arrays.copyOf(objArr, 1));
                            k3w0 g3w0Var = (f3 <= f2 || f3 <= f) ? new g3w0(strA2) : new i3w0(strA2);
                            String strA3 = lsm0Var.a(R.string.n_percents, Arrays.copyOf(new Object[]{Float.valueOf(f2)}, 1));
                            k3w0 g3w0Var2 = (f2 <= f3 || f2 <= f) ? new g3w0(strA3) : new i3w0(strA3);
                            String strA4 = lsm0Var.a(R.string.n_percents, Arrays.copyOf(new Object[]{Float.valueOf(f)}, 1));
                            kqrVar = new kqr(g3w0Var, g3w0Var2, (f <= f3 || f <= f2) ? new g3w0(strA4) : new i3w0(strA4));
                        } else {
                            kqrVar = null;
                        }
                    }
                    anq0 anq0Var2 = (anq0) ((fee) n0o0Var2.getValue()).c();
                    boolean z2 = anq0Var2 != null ? anq0Var2.f1167a : false;
                    long jLongValue2 = ((Number) ((fee) n0o0Var.getValue()).c()).longValue();
                    boolean zBooleanValue3 = ((Boolean) ((fee) n0o0Var3.getValue()).c()).booleanValue();
                    list.getClass();
                    mpmVar.getClass();
                    String strA5 = "";
                    if (mcaVar instanceof pca) {
                        pca pcaVar = (pca) mcaVar;
                        uqr uqrVarR0 = pzb.r0(mcaVar, str, str2, str7, str8, jg30Var);
                        if (bg30Var == null || (bekVar = bg30Var.b) == null) {
                            bekVar = bg30Var != null ? bg30Var.f2536a : new bek();
                        }
                        d3h0 d3h0Var = bekVar;
                        boolean z3 = d3h0Var instanceof lz10;
                        lz10 lz10Var = z3 ? (lz10) d3h0Var : null;
                        if (lz10Var != null) {
                            strA = vzb.T(lz10Var, zBooleanValue3);
                        } else {
                            hzm0 hzm0Var = d3h0Var instanceof hzm0 ? (hzm0) d3h0Var : null;
                            if (hzm0Var != null) {
                                String str9 = hzm0Var.g;
                                String str10 = hzm0Var.i;
                                StringBuilder sb = new StringBuilder("\u2066");
                                if (cy7.c() && zBooleanValue3) {
                                    if (str10 != null) {
                                        hne.B(sb, "(ov ", str10, Separators.RPAREN);
                                    }
                                    sb.append(vzb.i0(str9));
                                } else {
                                    sb.append(str9);
                                    if (str10 != null) {
                                        hne.B(sb, Separators.LPAREN, str10, " ov)");
                                    }
                                }
                                sb.append("\u2069");
                                strA = sb.toString();
                            } else {
                                strA = d3h0Var.a();
                            }
                        }
                        String str11 = strA;
                        lz10 lz10Var2 = z3 ? (lz10) d3h0Var : null;
                        if (lz10Var2 != null) {
                            strB = vzb.U(lz10Var2, zBooleanValue3);
                        } else {
                            hzm0 hzm0Var2 = d3h0Var instanceof hzm0 ? (hzm0) d3h0Var : null;
                            if (hzm0Var2 != null) {
                                String str12 = hzm0Var2.h;
                                String str13 = hzm0Var2.j;
                                StringBuilder sb2 = new StringBuilder("\u2066");
                                if (cy7.c() && zBooleanValue3) {
                                    if (str13 != null) {
                                        hne.B(sb2, "(ov ", str13, Separators.RPAREN);
                                    }
                                    sb2.append(vzb.i0(str12));
                                } else {
                                    sb2.append(str12);
                                    if (str13 != null) {
                                        hne.B(sb2, Separators.LPAREN, str13, " ov)");
                                    }
                                }
                                sb2.append("\u2069");
                                strB = sb2.toString();
                            } else {
                                strB = d3h0Var.b();
                            }
                        }
                        String str14 = strB;
                        boolean z4 = pcaVar.d;
                        rpp0 rpp0Var = pcaVar.f26749a;
                        j83 j83VarH = vzb.H(ctf0Var2, d3h0Var, pcaVar.e, pcaVar.f, pcaVar.g, (bg30Var == null || (strN3 = bg30Var.f2536a.n()) == null) ? "" : strN3, z4, zBooleanValue3);
                        String strB2 = rpp0Var.b();
                        c280 c280Var = new c280(vsm0.s(rpp0Var.a(), pcaVar.b), R.drawable.ic_glyph_placeholder_player);
                        long jA = rpp0Var.a();
                        bap bapVar = bap.b;
                        jdp0 jdp0Var = new jdp0(strB2, n6x.o0(c280Var, jA, list, zBooleanValue, bapVar), null);
                        jdp0 jdp0Var2 = new jdp0(rpp0Var.d(), n6x.o0(new c280(vsm0.s(rpp0Var.c(), pcaVar.c), R.drawable.ic_glyph_placeholder_player), rpp0Var.c(), list, zBooleanValue, bapVar), null);
                        lz10 lz10Var3 = z3 ? (lz10) d3h0Var : null;
                        return new mrr(uqrVarR0, jdp0Var, jdp0Var2, j83VarH, lz10Var3 != null ? vzb.G(lz10Var3.i) : eex.c, str11, d3h0Var.j(), str14, d3h0Var.i());
                    }
                    boolean z5 = z2;
                    String str15 = str;
                    String str16 = str2;
                    boolean z6 = mcaVar instanceof tca;
                    qpm qpmVar = qpm.f29126a;
                    if (z6) {
                        tca tcaVar = (tca) mcaVar;
                        uqr uqrVarR1 = pzb.r0(mcaVar, str15, str16, str7, str8, jg30Var);
                        znq0 znq0Var2 = new znq0(znq0Var != null ? znq0Var.f44687a : 0L);
                        rpp0 rpp0Var2 = tcaVar.f33711a;
                        boolean z7 = tcaVar.i;
                        if (rpp0Var2 instanceof qpp0) {
                            qpp0 qpp0Var = (qpp0) rpp0Var2;
                            jdp0 jdp0Var3 = new jdp0(qpp0Var.g, n6x.o0(u1c.C(tcaVar, true), qpp0Var.e, list, zBooleanValue || z7, bap.b), null);
                            jdp0 jdp0Var4 = new jdp0(qpp0Var.h, n6x.o0(u1c.C(tcaVar, false), qpp0Var.f, list, zBooleanValue || z7, bap.f2271a), null);
                            lpm lpmVar = new lpm(qpmVar, new hpm(0L, 3));
                            dpi0 dpi0Var = new dpi0((byte) 15);
                            rdj rdjVar = rdj.f30294a;
                            vzb.E(dpi0Var, rdj.g(znq0Var2, efj.UNIVERSAL, Boolean.valueOf(z), false, 56));
                            return new trr(uqrVarR1, jdp0Var3, jdp0Var4, lpmVar, ((h83) dpi0Var.f6468a).h(), kqrVar);
                        }
                        if (!(rpp0Var2 instanceof ppp0)) {
                            t9f.b();
                            return null;
                        }
                        ppp0 ppp0Var = (ppp0) rpp0Var2;
                        xcp0 xcp0VarC0 = b8k0.c0(ppp0Var.e, ppp0Var.g, tcaVar.b);
                        xcp0 xcp0VarC1 = b8k0.c0(ppp0Var.f, ppp0Var.h, tcaVar.c);
                        lpm lpmVar2 = new lpm(qpmVar, new hpm(0L, 3));
                        dpi0 dpi0Var2 = new dpi0((byte) 15);
                        rdj rdjVar2 = rdj.f30294a;
                        vzb.E(dpi0Var2, rdj.g(znq0Var2, efj.UNIVERSAL, Boolean.valueOf(z), false, 56));
                        return new trr(uqrVarR1, xcp0VarC0, xcp0VarC1, lpmVar2, ((h83) dpi0Var2.f6468a).h(), kqrVar);
                    }
                    if (!(mcaVar instanceof xca)) {
                        if (mcaVar instanceof gda) {
                            gda gdaVar = (gda) mcaVar;
                            uqr uqrVarR2 = pzb.r0(mcaVar, str15, str16, str7, str8, jg30Var);
                            znq0 znq0Var3 = new znq0(znq0Var != null ? znq0Var.f44687a : 0L);
                            String strB0 = CollectionsKt.b0(gdaVar.f11094a, Separators.SLASH, null, null, null, 62);
                            String strB1 = CollectionsKt.b0(gdaVar.b, Separators.SLASH, null, null, null, 62);
                            lpm lpmVar3 = new lpm(qpmVar, new hpm(0L, 3));
                            dpi0 dpi0Var3 = new dpi0((byte) 15);
                            rdj rdjVar3 = rdj.f30294a;
                            vzb.E(dpi0Var3, rdj.g(znq0Var3, efj.UNIVERSAL, Boolean.valueOf(z), false, 56));
                            return new rrr(uqrVarR2, strB0, strB1, lpmVar3, ((h83) dpi0Var3.f6468a).h());
                        }
                        if (mcaVar instanceof hda) {
                            hda hdaVar = (hda) mcaVar;
                            uqr uqrVarR3 = pzb.r0(mcaVar, str15, str16, str7, str8, jg30Var);
                            if (bg30Var == null || (pekVar = bg30Var.b) == null) {
                                pekVar = bg30Var != null ? bg30Var.f2536a : new pek();
                            }
                            return new rrr(uqrVarR3, CollectionsKt.b0(hdaVar.f12861a, Separators.SLASH, null, null, null, 62), CollectionsKt.b0(hdaVar.b, Separators.SLASH, null, null, null, 62), mpmVar, vzb.H(ctf0Var2, pekVar, hdaVar.h, hdaVar.i, hdaVar.j, (bg30Var == null || (strN = bg30Var.f2536a.n()) == null) ? "" : strN, hdaVar.g, zBooleanValue3));
                        }
                        if (!(mcaVar instanceof ida)) {
                            t9f.b();
                            return null;
                        }
                        ida idaVar = (ida) mcaVar;
                        uqr uqrVarR4 = pzb.r0(mcaVar, str15, str16, str7, str8, jg30Var);
                        if (!idaVar.g) {
                            if (znq0Var != null) {
                                rdj rdjVar4 = rdj.f30294a;
                                strG = rdj.g(znq0Var, efj.UNIVERSAL, Boolean.valueOf(z), false, 56);
                                if (strG == null) {
                                }
                            }
                            dpi0 dpi0Var15 = new dpi0((byte) 15);
                            vzb.E(dpi0Var15, strG);
                            return new vrr(uqrVarR4, idaVar.e, ((h83) dpi0Var15.f6468a).h());
                        }
                        strA5 = ctf0Var2.b.a(R.string.game_end, Arrays.copyOf(new Object[0], 0));
                        strG = strA5;
                        dpi0 dpi0Var16 = new dpi0((byte) 15);
                        vzb.E(dpi0Var16, strG);
                        return new vrr(uqrVarR4, idaVar.e, ((h83) dpi0Var16.f6468a).h());
                    }
                    if (!gql0.d().contains(Long.valueOf(jLongValue2))) {
                        xca xcaVar = (xca) mcaVar;
                        uqr uqrVarR5 = pzb.r0(mcaVar, str15, str16, str7, str8, jg30Var);
                        if (bg30Var == null || (xakVar = bg30Var.b) == null) {
                            xakVar = bg30Var != null ? bg30Var.f2536a : new xak((byte) 22);
                        }
                        boolean z8 = xcaVar.l;
                        boolean z9 = xcaVar.q;
                        rpp0 rpp0Var3 = xcaVar.f40636a;
                        j83 j83VarH2 = vzb.H(ctf0Var2, xakVar, xcaVar.n, xcaVar.o, xcaVar.p, (bg30Var == null || (strN2 = bg30Var.f2536a.n()) == null) ? "" : strN2, z8, zBooleanValue3);
                        if (!(rpp0Var3 instanceof qpp0)) {
                            if (rpp0Var3 instanceof ppp0) {
                                ppp0 ppp0Var2 = (ppp0) rpp0Var3;
                                return new trr(uqrVarR5, b8k0.c0(ppp0Var2.e, ppp0Var2.g, xcaVar.h), b8k0.c0(ppp0Var2.f, ppp0Var2.h, xcaVar.i), mpmVar, j83VarH2, kqrVar);
                            }
                            t9f.b();
                            return null;
                        }
                        int i8 = xcaVar.b;
                        int i9 = xcaVar.g;
                        int i10 = xcaVar.f;
                        int i11 = xcaVar.d;
                        int i12 = xcaVar.c;
                        vy vyVar = (i8 == 0 && i12 == 0 && i11 == 0) ? null : new vy(i8 > 0 ? Integer.valueOf(i8) : null, i12 > 0 ? Integer.valueOf(i12) : null, i11 > 0 ? Integer.valueOf(i11) : null);
                        int i13 = xcaVar.e;
                        vy vyVar2 = (i13 == 0 && i10 == 0 && i9 == 0) ? null : new vy(i13 > 0 ? Integer.valueOf(i13) : null, i10 > 0 ? Integer.valueOf(i10) : null, i9 > 0 ? Integer.valueOf(i9) : null);
                        boolean z10 = (vyVar == null && vyVar2 == null) ? false : true;
                        if (z10 && vyVar == null) {
                            num = null;
                            vyVar = new vy(null, null, null);
                        } else {
                            num = null;
                        }
                        if (z10 && vyVar2 == null) {
                            vyVar2 = new vy(num, num, num);
                        }
                        qpp0 qpp0Var2 = (qpp0) rpp0Var3;
                        return new trr(uqrVarR5, new jdp0(qpp0Var2.g, n6x.o0(u1c.D(xcaVar, true), qpp0Var2.e, list, zBooleanValue || z9, bap.b), vyVar), new jdp0(qpp0Var2.h, n6x.o0(u1c.D(xcaVar, false), qpp0Var2.f, list, zBooleanValue || z9, bap.f2271a), vyVar2), mpmVar, j83VarH2, kqrVar);
                    }
                    xca xcaVar2 = (xca) mcaVar;
                    long j = znq0Var != null ? znq0Var.f44687a : 0L;
                    uqr uqrVarR6 = pzb.r0(mcaVar, str15, str16, str7, str8, jg30Var);
                    znq0 znq0Var4 = new znq0(j);
                    pz10 pz10Var = bg30Var != null ? bg30Var.f2536a : null;
                    if (pz10Var instanceof nz10) {
                        izm0 izm0Var = bg30Var.b;
                        String str17 = xcaVar2.s;
                        List list2 = xcaVar2.i;
                        List list3 = xcaVar2.h;
                        rpp0 rpp0Var4 = xcaVar2.f40636a;
                        boolean z11 = xcaVar2.l;
                        String str18 = xcaVar2.p;
                        rdj rdjVar5 = rdj.f30294a;
                        pz10 pz10Var2 = pz10Var;
                        String strG2 = rdj.g(znq0Var4, efj.UNIVERSAL, Boolean.valueOf(z), false, 56);
                        str18.getClass();
                        strG2.getClass();
                        dpi0 dpi0Var17 = new dpi0((byte) 15);
                        if (str17 != null) {
                            vzb.E(dpi0Var17, str17);
                            vzb.E(dpi0Var17, ": ");
                            boolean z12 = cy7.c() && zBooleanValue3;
                            if (izm0Var == null) {
                                vzb.E(dpi0Var17, "0");
                                vzb.C(dpi0Var17);
                                vzb.E(dpi0Var17, "0");
                            } else {
                                if (!(izm0Var instanceof gzm0) && !(izm0Var instanceof hzm0)) {
                                    t9f.b();
                                    return null;
                                }
                                boolean z13 = izm0Var instanceof hzm0;
                                String strA6 = z13 ? ((hzm0) izm0Var).g : izm0Var.a();
                                String strB3 = z13 ? ((hzm0) izm0Var).h : izm0Var.b();
                                vzb.E(dpi0Var17, "\u2066");
                                if (z12) {
                                    vzb.D(dpi0Var17, strB3, vzb.L(izm0Var.i()));
                                    vzb.C(dpi0Var17);
                                    vzb.D(dpi0Var17, strA6, vzb.L(izm0Var.j()));
                                } else {
                                    vzb.D(dpi0Var17, strA6, vzb.L(izm0Var.j()));
                                    vzb.C(dpi0Var17);
                                    vzb.D(dpi0Var17, strB3, vzb.L(izm0Var.i()));
                                }
                                vzb.E(dpi0Var17, "\u2069");
                            }
                        } else {
                            vzb.E(dpi0Var17, strG2);
                            if (str18.length() > 0) {
                                vzb.A(dpi0Var17);
                                vzb.E(dpi0Var17, str18);
                            }
                            if (z11) {
                                vzb.A(dpi0Var17);
                                i = 0;
                                vzb.E(dpi0Var17, ctf0Var2.b.a(R.string.game_end, Arrays.copyOf(new Object[0], 0)));
                            } else {
                                i = 0;
                            }
                            if (z5) {
                                vzb.A(dpi0Var17);
                                vzb.E(dpi0Var17, ctf0Var2.b.a(R.string.card_cricket_break, Arrays.copyOf(new Object[i], i)));
                            }
                        }
                        j83 j83VarH3 = ((h83) dpi0Var17.f6468a).h();
                        nz10 nz10Var = (nz10) pz10Var2;
                        boolean z14 = nz10Var instanceof mz10;
                        k5q0 k5q0Var = k5q0.b;
                        if (!z14) {
                            if (nz10Var instanceof oz10) {
                                oz10 oz10Var = (oz10) nz10Var;
                                String str19 = oz10Var.i;
                                String str20 = oz10Var.g;
                                String str21 = oz10Var.m;
                                String str22 = oz10Var.k;
                                boolean z15 = ((StringsKt.W(str22) || str22.equals("0")) && (StringsKt.W(str21) || str21.equals("0"))) ? false : true;
                                boolean z16 = str20.length() > 0 || str19.length() > 0;
                                eex eexVarG = vzb.G(oz10Var.o);
                                ArrayList arrayList5 = oz10Var.f;
                                ArrayList arrayList6 = new ArrayList(r3d.q(arrayList5, 10));
                                Iterator it = arrayList5.iterator();
                                while (it.hasNext()) {
                                    te90 te90Var = (te90) it.next();
                                    arrayList6.add(new yd90(vzb.O(te90Var), vzb.Q(te90Var), te90Var.f33809a));
                                    it = it;
                                    z15 = z15;
                                }
                                boolean z17 = z15;
                                i4 i4VarR1 = dyb.r0(arrayList6);
                                j83 j83VarN = vzb.N(nz10Var);
                                j83 j83VarP = vzb.P(nz10Var);
                                lsm0 lsm0Var2 = ctf0Var2.b;
                                yd90 yd90Var3 = new yd90(j83VarN, j83VarP, lsm0Var2.a(R.string.total_count, Arrays.copyOf(new Object[0], 0)));
                                if (z17) {
                                    h83 h83Var = new h83();
                                    long j2 = y3d.g;
                                    long j3 = daq0.c;
                                    smk0 smk0Var = new smk0(vzb.L(oz10Var.l), j3, null, null, null, null, null, j3, new j56(0.0f), null, null, j2, k5q0Var, null, null, 17424);
                                    h83Var.c(str22);
                                    j83 j83VarC = kng0.c(h83Var.f12607a, h83Var, smk0Var, 0);
                                    h83 h83Var2 = new h83();
                                    smk0 smk0Var2 = new smk0(vzb.L(oz10Var.n), j3, null, null, null, null, null, j3, new j56(0.0f), null, null, j2, k5q0Var, null, null, 17424);
                                    h83Var2.c(str21);
                                    yd90Var = new yd90(j83VarC, kng0.c(h83Var2.f12607a, h83Var2, smk0Var2, 0), lsm0Var2.a(R.string.dt_points, Arrays.copyOf(new Object[0], 0)));
                                } else {
                                    yd90Var = null;
                                }
                                if (z16) {
                                    h83 h83Var3 = new h83();
                                    long j4 = y3d.g;
                                    long j5 = daq0.c;
                                    smk0 smk0Var3 = new smk0(vzb.L(oz10Var.h), j5, null, null, null, null, null, j5, new j56(0.0f), null, null, j4, k5q0Var, null, null, 17424);
                                    h83Var3.c(str20);
                                    j83 j83VarC2 = kng0.c(h83Var3.f12607a, h83Var3, smk0Var3, 0);
                                    h83 h83Var4 = new h83();
                                    smk0 smk0Var4 = new smk0(vzb.L(oz10Var.j), j5, null, null, null, null, null, j5, new j56(0.0f), null, null, j4, k5q0Var, null, null, 17424);
                                    h83Var4.c(str19);
                                    yd90Var2 = new yd90(j83VarC2, kng0.c(h83Var4.f12607a, h83Var4, smk0Var4, 0), lsm0Var2.a(R.string.tennis_game_column, Arrays.copyOf(new Object[0], 0)));
                                } else {
                                    yd90Var2 = null;
                                }
                                iul0Var2 = new iul0(eexVarG, i4VarR1, yd90Var3, yd90Var2, yd90Var);
                            } else {
                                if (!(nz10Var instanceof kz10)) {
                                    t9f.b();
                                    return null;
                                }
                                kz10 kz10Var = (kz10) nz10Var;
                                eex eexVarG2 = vzb.G(kz10Var.g);
                                ArrayList<te90> arrayList7 = kz10Var.f;
                                ArrayList arrayList8 = new ArrayList(r3d.q(arrayList7, 10));
                                for (te90 te90Var2 : arrayList7) {
                                    arrayList8.add(new yd90(vzb.O(te90Var2), vzb.Q(te90Var2), te90Var2.f33809a));
                                }
                                iul0Var = new iul0(eexVarG2, dyb.r0(arrayList8), new yd90(vzb.N(nz10Var), vzb.P(nz10Var), ctf0Var2.b.a(R.string.total_count, Arrays.copyOf(new Object[0], 0))), null, null);
                            }
                            if (rpp0Var4 instanceof qpp0) {
                                if (rpp0Var4 instanceof ppp0) {
                                    ppp0 ppp0Var14 = (ppp0) rpp0Var4;
                                    return new xrr(uqrVarR6, b8k0.c0(ppp0Var14.e, ppp0Var14.g, list3), b8k0.c0(ppp0Var14.f, ppp0Var14.h, list2), j83VarH3, iul0Var2);
                                }
                                t9f.b();
                                return null;
                            }
                            qpp0 qpp0Var14 = (qpp0) rpp0Var4;
                            String str2117 = qpp0Var14.g;
                            str3 = (String) CollectionsKt.firstOrNull(list3);
                            if (str3 == null) {
                                str3 = "";
                            }
                            c280 c280Var13 = new c280(vsm0.s(qpp0Var14.e, str3), R.drawable.ic_glyph_placeholder_player);
                            long j19 = qpp0Var14.e;
                            bap bapVar13 = bap.b;
                            jdp0 jdp0Var16 = new jdp0(str2117, n6x.o0(c280Var13, j19, list, zBooleanValue, bapVar13), null);
                            String str2118 = qpp0Var14.h;
                            str4 = (String) CollectionsKt.firstOrNull(list2);
                            if (str4 == null) {
                                str4 = "";
                            }
                            return new xrr(uqrVarR6, jdp0Var16, new jdp0(str2118, n6x.o0(new c280(vsm0.s(qpp0Var14.f, str4), R.drawable.ic_glyph_placeholder_player), qpp0Var14.f, list, zBooleanValue, bapVar13), null), j83VarH3, iul0Var2);
                        }
                        mz10 mz10Var = (mz10) nz10Var;
                        eex eexVarG3 = vzb.G(mz10Var.g);
                        ArrayList<te90> arrayList9 = mz10Var.f;
                        ArrayList arrayList10 = new ArrayList(r3d.q(arrayList9, 10));
                        for (te90 te90Var3 : arrayList9) {
                            arrayList10.add(new yd90(vzb.O(te90Var3), vzb.Q(te90Var3), te90Var3.f33809a));
                        }
                        i4 i4VarR2 = dyb.r0(arrayList10);
                        j83 j83VarN2 = vzb.N(nz10Var);
                        j83 j83VarP2 = vzb.P(nz10Var);
                        lsm0 lsm0Var3 = ctf0Var2.b;
                        yd90 yd90Var4 = new yd90(j83VarN2, j83VarP2, lsm0Var3.a(R.string.total_count, Arrays.copyOf(new Object[0], 0)));
                        h83 h83Var5 = new h83();
                        String str25 = mz10Var.h;
                        long j7 = y3d.g;
                        long j8 = daq0.c;
                        smk0 smk0Var5 = new smk0(vzb.L(mz10Var.i), j8, null, null, null, null, null, j8, new j56(0.0f), null, null, j7, k5q0Var, null, null, 17424);
                        h83Var5.c(str25);
                        j83 j83VarC3 = kng0.c(h83Var5.f12607a, h83Var5, smk0Var5, 0);
                        h83 h83Var6 = new h83();
                        String str26 = mz10Var.j;
                        smk0 smk0Var6 = new smk0(vzb.L(mz10Var.k), j8, null, null, null, null, null, j8, new j56(0.0f), null, null, j7, k5q0Var, null, null, 17424);
                        h83Var6.c(str26);
                        iul0Var = new iul0(eexVarG3, i4VarR2, yd90Var4, null, new yd90(j83VarC3, kng0.c(h83Var6.f12607a, h83Var6, smk0Var6, 0), lsm0Var3.a(R.string.dt_points, Arrays.copyOf(new Object[0], 0))));
                        iul0Var2 = iul0Var;
                        if (rpp0Var4 instanceof qpp0) {
                            if (rpp0Var4 instanceof ppp0) {
                                ppp0 ppp0Var15 = (ppp0) rpp0Var4;
                                return new xrr(uqrVarR6, b8k0.c0(ppp0Var15.e, ppp0Var15.g, list3), b8k0.c0(ppp0Var15.f, ppp0Var15.h, list2), j83VarH3, iul0Var2);
                            }
                            t9f.b();
                            return null;
                        }
                        qpp0 qpp0Var15 = (qpp0) rpp0Var4;
                        String str2119 = qpp0Var15.g;
                        str3 = (String) CollectionsKt.firstOrNull(list3);
                        if (str3 == null) {
                            str3 = "";
                        }
                        c280 c280Var14 = new c280(vsm0.s(qpp0Var15.e, str3), R.drawable.ic_glyph_placeholder_player);
                        long j110 = qpp0Var15.e;
                        bap bapVar14 = bap.b;
                        jdp0 jdp0Var17 = new jdp0(str2119, n6x.o0(c280Var14, j110, list, zBooleanValue, bapVar14), null);
                        String str21110 = qpp0Var15.h;
                        str4 = (String) CollectionsKt.firstOrNull(list2);
                        if (str4 == null) {
                            str4 = "";
                        }
                        return new xrr(uqrVarR6, jdp0Var17, new jdp0(str21110, n6x.o0(new c280(vsm0.s(qpp0Var15.f, str4), R.drawable.ic_glyph_placeholder_player), qpp0Var15.f, list, zBooleanValue, bapVar14), null), j83VarH3, iul0Var2);
                    }
                }
                return qrr.f29223a;
            }

            /* JADX WARN: Code duplicated, block: B:18:0x008a  */
            private final Object b(Object obj) {
                String strG;
                lz10 lz10Var;
                float f;
                fad dadVar;
                sad qadVar;
                j83 j83VarC;
                j83 j83VarC2;
                gna gnaVar = (gna) obj;
                if (gnaVar == null) {
                    return null;
                }
                if (!(gnaVar instanceof ena)) {
                    if (gnaVar instanceof fna) {
                        return null;
                    }
                    t9f.b();
                    return null;
                }
                ena enaVar = (ena) gnaVar;
                mca mcaVar = enaVar.f8084a;
                rjs rjsVar = this.b;
                jg30 jg30Var = (jg30) ((fee) rjsVar.H.getValue()).b();
                bg30 bg30Var = (bg30) ((fee) rjsVar.I.getValue()).c();
                pz10 pz10Var = bg30Var != null ? bg30Var.f2536a : null;
                ctf0 ctf0Var2 = rjsVar.f30611a;
                boolean z = enaVar.p;
                znq0 znq0Var = (znq0) ((fee) rjsVar.t.getValue()).c();
                boolean zBooleanValue = ((Boolean) ((fee) rjsVar.v.getValue()).c()).booleanValue();
                ctf0Var2.getClass();
                dja djaVar = dja.PENALTY;
                k5q0 k5q0Var = k5q0.b;
                if (jg30Var != null) {
                    dadVar = new ead(jg30Var);
                    f = 0.0f;
                    lz10Var = null;
                } else {
                    h83 h83Var = new h83();
                    if (znq0Var != null) {
                        rdj rdjVar = rdj.f30294a;
                        strG = rdj.g(znq0Var, efj.UNIVERSAL, Boolean.valueOf(z), false, 56);
                        if (strG == null) {
                            strG = "";
                        }
                    } else {
                        strG = "";
                    }
                    pz40 pz40Var = s6t0.f31722a;
                    long textPrimary = s6t0.b().f33626a.getTextPrimary();
                    h83 h83Var2 = new h83();
                    long j = y3d.g;
                    long j2 = daq0.c;
                    lz10Var = null;
                    f = 0.0f;
                    smk0 smk0Var = new smk0(textPrimary, j2, null, null, null, null, null, j2, new j56(0.0f), null, null, j, k5q0Var, null, null, 17424);
                    h83Var2.c(strG);
                    StringBuilder sb = h83Var2.f12607a;
                    h83Var2.a(smk0Var, 0, sb.length());
                    sb.length();
                    h83Var.b(h83Var2.h());
                    dadVar = new dad(h83Var.h());
                }
                d3h0 cl5Var = pz10Var;
                if (mcaVar instanceof pca) {
                    if (pz10Var == null) {
                        cl5Var = new cl5((byte) 28);
                    }
                    rpp0 rpp0Var = ((pca) mcaVar).f26749a;
                    String strB = rpp0Var.b();
                    String strD = rpp0Var.d();
                    boolean z2 = cl5Var instanceof lz10;
                    lz10 lz10Var2 = z2 ? (lz10) cl5Var : lz10Var;
                    String strT = lz10Var2 != null ? vzb.T(lz10Var2, zBooleanValue) : "0";
                    lz10 lz10Var3 = z2 ? (lz10) cl5Var : lz10Var;
                    qadVar = new pad(strB, strD, strT, lz10Var3 != null ? vzb.U(lz10Var3, zBooleanValue) : "0", cl5Var.j(), cl5Var.i());
                } else if (mcaVar instanceof tca) {
                    rpp0 rpp0Var2 = ((tca) mcaVar).f33711a;
                    String strB2 = rpp0Var2.b();
                    String strD2 = rpp0Var2.d();
                    h83 h83Var3 = new h83();
                    String strA = ctf0Var2.b.a(R.string.vs, Arrays.copyOf(new Object[0], 0));
                    long j3 = y3d.g;
                    long j4 = daq0.c;
                    pz40 pz40Var2 = s6t0.f31722a;
                    smk0 smk0Var2 = new smk0(s6t0.b().f33626a.getTextPrimary(), j4, null, null, null, null, null, j4, new j56(f), null, null, j3, k5q0Var, null, null, 17424);
                    h83Var3.c(strA);
                    qadVar = new rad(kng0.c(h83Var3.f12607a, h83Var3, smk0Var2, 0), strB2, strD2);
                } else if (mcaVar instanceof xca) {
                    rpp0 rpp0Var3 = ((xca) mcaVar).f40636a;
                    String strB3 = rpp0Var3.b();
                    String strD3 = rpp0Var3.d();
                    if (pz10Var != null) {
                        j83VarC2 = vzb.M(pz10Var);
                    } else {
                        h83 h83Var4 = new h83();
                        String strA2 = ctf0Var2.b.a(R.string.vs, Arrays.copyOf(new Object[0], 0));
                        long j5 = y3d.g;
                        long j6 = daq0.c;
                        pz40 pz40Var3 = s6t0.f31722a;
                        smk0 smk0Var3 = new smk0(s6t0.b().f33626a.getTextPrimary(), j6, null, null, null, null, null, j6, new j56(f), null, null, j5, k5q0Var, null, null, 17424);
                        h83Var4.c(strA2);
                        j83VarC2 = kng0.c(h83Var4.f12607a, h83Var4, smk0Var3, 0);
                    }
                    qadVar = new rad(j83VarC2, strB3, strD3);
                } else if (mcaVar instanceof gda) {
                    gda gdaVar = (gda) mcaVar;
                    String strB0 = CollectionsKt.b0(gdaVar.f11094a, Separators.SLASH, null, null, null, 62);
                    String strB1 = CollectionsKt.b0(gdaVar.b, Separators.SLASH, null, null, null, 62);
                    h83 h83Var5 = new h83();
                    String strA3 = ctf0Var2.b.a(R.string.vs, Arrays.copyOf(new Object[0], 0));
                    long j7 = y3d.g;
                    long j8 = daq0.c;
                    pz40 pz40Var4 = s6t0.f31722a;
                    smk0 smk0Var4 = new smk0(s6t0.b().f33626a.getTextPrimary(), j8, null, null, null, null, null, j8, new j56(f), null, null, j7, k5q0Var, null, null, 17424);
                    h83Var5.c(strA3);
                    qadVar = new rad(kng0.c(h83Var5.f12607a, h83Var5, smk0Var4, 0), strB0, strB1);
                } else if (mcaVar instanceof hda) {
                    hda hdaVar = (hda) mcaVar;
                    String strB4 = CollectionsKt.b0(hdaVar.f12861a, Separators.SLASH, null, null, null, 62);
                    String strB5 = CollectionsKt.b0(hdaVar.b, Separators.SLASH, null, null, null, 62);
                    if (pz10Var != null) {
                        j83VarC = vzb.M(pz10Var);
                    } else {
                        h83 h83Var6 = new h83();
                        String strA4 = ctf0Var2.b.a(R.string.vs, Arrays.copyOf(new Object[0], 0));
                        long j9 = y3d.g;
                        long j10 = daq0.c;
                        pz40 pz40Var5 = s6t0.f31722a;
                        smk0 smk0Var5 = new smk0(s6t0.b().f33626a.getTextPrimary(), j10, null, null, null, null, null, j10, new j56(f), null, null, j9, k5q0Var, null, null, 17424);
                        h83Var6.c(strA4);
                        j83VarC = kng0.c(h83Var6.f12607a, h83Var6, smk0Var5, 0);
                    }
                    qadVar = new rad(j83VarC, strB4, strB5);
                } else {
                    if (!(mcaVar instanceof ida)) {
                        t9f.b();
                        return lz10Var;
                    }
                    qadVar = new qad(((ida) mcaVar).e);
                }
                return new dax(dadVar, qadVar);
            }

            /* JADX WARN: Code duplicated, block: B:140:0x0381  */
            /* JADX WARN: Code duplicated, block: B:70:0x01a8  */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                kc50 kc50Var;
                p700 p700Var;
                ena enaVar;
                uia uiaVar;
                String strA;
                String strC;
                String strC2;
                zvl0 zvl0Var;
                yja yjaVar;
                qal0 qal0Var;
                Object b0k0Var;
                i49 g49Var;
                dxh0 dxh0Var;
                hna hnaVar;
                lmo lmoVar;
                byte b13 = b12;
                int i = 0;
                rjs rjsVar = this.b;
                switch (b13) {
                    case 0:
                        List list = (List) obj;
                        list.getClass();
                        boolean zBooleanValue = ((Boolean) ((fee) rjsVar.c.getValue()).c()).booleanValue();
                        boolean zBooleanValue2 = ((Boolean) ((fee) rjsVar.e.getValue()).c()).booleanValue();
                        boolean zBooleanValue3 = ((Boolean) ((fee) rjsVar.f.getValue()).c()).booleanValue();
                        tf50 tf50Var = (tf50) ((fee) rjsVar.d.getValue()).c();
                        tf50Var.getClass();
                        if (!list.contains(tf50Var)) {
                            tf50Var = tf50.f33851a;
                        }
                        boolean z = !zBooleanValue2;
                        kc50 kc50Var2 = new kc50(R.drawable.ic_glyph_rectangular_scoreboard, tf50Var == tf50.f33851a);
                        tf50 tf50Var2 = tf50.b;
                        kc50 kc50Var3 = list.contains(tf50Var2) ? new kc50(R.drawable.ic_glyph_rectangular_broadcast, tf50Var == tf50Var2) : null;
                        tf50 tf50Var3 = tf50.c;
                        if (list.contains(tf50Var3)) {
                            kc50Var = new kc50(R.drawable.ic_glyph_rectangular_statistic, tf50Var == tf50Var3);
                        } else {
                            kc50Var = null;
                        }
                        return new ojs(zBooleanValue, z, zBooleanValue, zBooleanValue3, new hjs(kc50Var2, kc50Var3, kc50Var, tf50Var));
                    case 1:
                        n0o0 n0o0Var = rjsVar.o;
                        gna gnaVar = (gna) obj;
                        if ((gnaVar instanceof ena ? (ena) gnaVar : null) == null || (p700Var = ((ena) gnaVar).l) == null) {
                            return null;
                        }
                        List list2 = p700Var.e;
                        List list3 = (List) ((fee) n0o0Var.getValue()).c();
                        ch00 ch00Var = ch00.LAST_GAMES;
                        boolean zContains = list3.contains(ch00Var);
                        List list4 = (List) ((fee) n0o0Var.getValue()).c();
                        ch00 ch00Var2 = ch00.LAST_GAMES_OPP_ONE;
                        boolean zContains2 = list4.contains(ch00Var2);
                        List list5 = (List) ((fee) n0o0Var.getValue()).c();
                        ch00 ch00Var3 = ch00.LAST_GAMES_OPP_TWO;
                        boolean zContains3 = list5.contains(ch00Var3);
                        ctf0 ctf0Var2 = rjsVar.f30611a;
                        ctf0Var2.getClass();
                        ArrayList arrayList = new ArrayList();
                        List list6 = p700Var.g;
                        List list7 = p700Var.f;
                        if (!list2.isEmpty()) {
                            arrayList.add(z1x.T(list2, ctf0Var2, ctf0Var2.b.a(R.string.previous_meetings, Arrays.copyOf(new Object[0], 0)), ch00Var, zContains));
                        }
                        if (!list7.isEmpty()) {
                            arrayList.add(z1x.T(list7, ctf0Var2, kng0.l(ctf0Var2.b.a(R.string.last_games, Arrays.copyOf(new Object[0], 0)), ": ", p700Var.c), ch00Var2, zContains2));
                        }
                        if (!list6.isEmpty()) {
                            arrayList.add(z1x.T(list6, ctf0Var2, kng0.l(ctf0Var2.b.a(R.string.last_games, Arrays.copyOf(new Object[0], 0)), ": ", p700Var.d), ch00Var3, zContains3));
                        }
                        return arrayList;
                    case 2:
                        gna gnaVar2 = (gna) obj;
                        if ((gnaVar2 instanceof ena ? (ena) gnaVar2 : null) == null || (uiaVar = (enaVar = (ena) gnaVar2).h) == null) {
                            return null;
                        }
                        ctf0 ctf0Var3 = rjsVar.f30611a;
                        boolean z2 = enaVar.p;
                        ctf0Var3.getClass();
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it = uiaVar.c.iterator();
                        int i2 = 0;
                        while (it.hasNext()) {
                            Object next = it.next();
                            int i3 = i2 + 1;
                            if (i2 < 0) {
                                q3d.p();
                                throw null;
                            }
                            bsw bswVar = (bsw) next;
                            String str = bswVar.b;
                            String str2 = bswVar.e;
                            String strA2 = (str.length() <= 0 || str2.length() <= 0) ? ctf0Var3.b.a(R.string.vs, Arrays.copyOf(new Object[0], 0)) : w6x.q(bswVar.b, " : ", str2);
                            odp0 odp0Var = new odp0(new d5a0(new c280(bswVar.c, R.drawable.ic_glyph_placeholder_player)));
                            String strM = dw9.m(i3, ". ", bswVar.f3153a);
                            odp0 odp0Var2 = new odp0(new d5a0(new c280(bswVar.f, R.drawable.ic_glyph_placeholder_player)));
                            String strM2 = dw9.m(i3, ". ", bswVar.d);
                            rdj rdjVar = rdj.f30294a;
                            arrayList2.add(new hzy(odp0Var, strM, odp0Var2, strM2, rdj.g(new znq0(bswVar.g), efj.UNIVERSAL, Boolean.valueOf(z2), false, 56), strA2, "", null, null));
                            it = it;
                            i2 = i3;
                        }
                        dja djaVar = dja.PENALTY;
                        return new eax(dyb.o0(arrayList2), uiaVar.f35722a, uiaVar.b);
                    case 3:
                        anq0 anq0Var2 = (anq0) obj;
                        if (anq0Var2 != null) {
                            boolean z3 = ((Boolean) ((fee) rjsVar.g.getValue()).c()).booleanValue() || ((Boolean) ((fee) rjsVar.h.getValue()).c()).booleanValue();
                            ctf0 ctf0Var4 = rjsVar.f30611a;
                            ctf0Var4.getClass();
                            long j = anq0Var2.e;
                            long j2 = anq0Var2.d;
                            boolean z4 = anq0Var2.j;
                            if (j != 0 || !z4) {
                                String str3 = anq0Var2.c;
                                if (z4) {
                                    if (str3.length() > 0) {
                                        strA = ctf0Var4.b.a(R.string.live_additional_min_v2, Arrays.copyOf(new Object[]{str3}, 1));
                                    } else if (anq0Var2.f1167a) {
                                        strA = "";
                                    } else {
                                        strA = anq0Var2.b ? ctf0Var4.b.a(R.string.line_live_time_period_back_v2, Arrays.copyOf(new Object[]{""}, 1)) : ctf0Var4.b.a(R.string.line_live_time_period_capitalized_v2, Arrays.copyOf(new Object[]{""}, 1));
                                    }
                                } else if (j2 < 0) {
                                    strA = ctf0Var4.b.a(R.string.game_started, Arrays.copyOf(new Object[0], 0));
                                } else {
                                    long j3 = j2 / 86400;
                                    strA = j3 > 0 ? ctf0Var4.b.a(R.string.line_time_before_v2, Arrays.copyOf(new Object[]{String.valueOf(j3)}, 1)) : ctf0Var4.b.a(R.string.before_start, Arrays.copyOf(new Object[0], 0));
                                }
                                String strC3 = (z3 || z4 || j2 < 0) ? null : n2x.C((((j2 < 0 ? 0L : j2) / 60) / 60) % 24);
                                if (z3) {
                                    strC = null;
                                } else {
                                    long jB = (z4 ? vzb.V(anq0Var2).b() : j2 < 0 ? 0L : j2) / 60;
                                    if (!z4) {
                                        jB %= 60;
                                    }
                                    strC = n2x.C(jB);
                                }
                                if (z3) {
                                    strC2 = null;
                                } else {
                                    strC2 = n2x.C((z4 ? vzb.V(anq0Var2).b() : j2 >= 0 ? j2 : 0L) % 60);
                                }
                                return new jg30(strA, strC3, strC, strC2);
                            }
                        }
                        return null;
                    case 4:
                        gna gnaVar3 = (gna) obj;
                        ena enaVar2 = gnaVar3 instanceof ena ? (ena) gnaVar3 : null;
                        if (enaVar2 == null || (zvl0Var = ((ena) gnaVar3).k) == null) {
                            return null;
                        }
                        String str4 = zvl0Var.m;
                        String str5 = enaVar2.q;
                        ctf0 ctf0Var5 = rjsVar.f30611a;
                        m1v0 m1v0Var = (m1v0) ((fee) rjsVar.J.getValue()).b();
                        str5.getClass();
                        ctf0Var5.getClass();
                        String str6 = zvl0Var.f45064a;
                        Pair pair = str4.length() > 0 ? new Pair(str4, ctf0Var5.b.a(R.string.web_site, Arrays.copyOf(new Object[0], 0))) : new Pair(null, null);
                        String str7 = (String) pair.f46059a;
                        String str8 = (String) pair.b;
                        dja djaVar2 = dja.PENALTY;
                        String str9 = zvl0Var.b;
                        ArrayList arrayList3 = new ArrayList();
                        String str10 = zvl0Var.l;
                        String str11 = zvl0Var.k;
                        String str12 = zvl0Var.j;
                        String str13 = zvl0Var.i;
                        String str14 = zvl0Var.h;
                        String str15 = zvl0Var.g;
                        String str16 = zvl0Var.f;
                        String str17 = zvl0Var.e;
                        String str18 = zvl0Var.d;
                        String str19 = zvl0Var.c;
                        if (str6.length() > 0) {
                            arrayList3.add(l7x.J(ctf0Var5, str6, R.string.address));
                        }
                        if (str19.length() > 0) {
                            arrayList3.add(l7x.J(ctf0Var5, str19, R.string.capacity));
                        }
                        if (str18.length() > 0) {
                            arrayList3.add(l7x.J(ctf0Var5, str18, R.string.covering));
                        }
                        if (str17.length() > 0) {
                            arrayList3.add(l7x.J(ctf0Var5, str17, R.string.city_name));
                        }
                        if (str16.length() > 0) {
                            arrayList3.add(l7x.J(ctf0Var5, str16, R.string.architect));
                        }
                        if (str15.length() > 0) {
                            arrayList3.add(l7x.J(ctf0Var5, str15, R.string.old_name));
                        }
                        if (str14.length() > 0) {
                            arrayList3.add(l7x.J(ctf0Var5, str14, R.string.category));
                        }
                        if (str13.length() > 0) {
                            arrayList3.add(l7x.J(ctf0Var5, str13, R.string.history));
                        }
                        if (str12.length() > 0) {
                            arrayList3.add(l7x.J(ctf0Var5, str12, R.string.opened));
                        }
                        if (str11.length() > 0) {
                            arrayList3.add(l7x.J(ctf0Var5, str11, R.string.zip_code));
                        }
                        if (str10.length() > 0) {
                            arrayList3.add(l7x.J(ctf0Var5, "\u2066" + str10 + "\u2069", R.string.phone));
                        }
                        a4x a4xVarO0 = dyb.o0(arrayList3);
                        List list8 = zvl0Var.n;
                        ArrayList arrayList4 = new ArrayList(r3d.q(list8, 10));
                        Iterator it2 = list8.iterator();
                        while (it2.hasNext()) {
                            arrayList4.add(String.format(Locale.ENGLISH, "%s/sfiles/stadium/%s", Arrays.copyOf(new Object[]{str5, (String) it2.next()}, 2)));
                        }
                        a4x a4xVarO1 = dyb.o0(arrayList4);
                        if (a4xVarO1.isEmpty()) {
                            a4xVarO1 = dyb.g0("");
                        }
                        return new iax(m1v0Var, str9, a4xVarO0, str7, str8, a4xVarO1);
                    case 5:
                        gna gnaVar4 = (gna) obj;
                        if ((gnaVar4 instanceof ena ? (ena) gnaVar4 : null) != null && (yjaVar = ((ena) gnaVar4).i) != null) {
                            List list9 = yjaVar.f42730a;
                            if (!list9.isEmpty()) {
                                long jLongValue = ((Number) ((fee) rjsVar.m.getValue()).c()).longValue();
                                lc00 lc00VarB = kotlin.collections.a.b();
                                Iterator it3 = list9.iterator();
                                while (it3.hasNext()) {
                                    he30 he30Var = (he30) it3.next();
                                    List list10 = he30Var.b;
                                    ArrayList arrayList5 = new ArrayList();
                                    for (Object obj2 : list10) {
                                        if (((ge30) obj2).e.length() > 0) {
                                            arrayList5.add(obj2);
                                        }
                                    }
                                    if (!arrayList5.isEmpty()) {
                                        lc00VarB.add(new uim(he30Var.f12902a));
                                        int i4 = i;
                                        for (Object obj3 : arrayList5) {
                                            int i5 = i4 + 1;
                                            if (i4 < 0) {
                                                q3d.p();
                                                throw null;
                                            }
                                            ge30 ge30Var = (ge30) obj3;
                                            String str20 = ge30Var.f11132a;
                                            String str21 = ge30Var.e;
                                            String str22 = ge30Var.c;
                                            String str23 = ge30Var.d;
                                            tho thoVar = ge30Var.b;
                                            Iterator it4 = it3;
                                            List listSplit$default = StringsKt__StringsKt.split$default(str20, new String[]{"+"}, false, i, 6, null);
                                            long j4 = jLongValue;
                                            List listSplit$default2 = StringsKt__StringsKt.split$default(str20, new String[]{Separators.COLON}, false, i, 6, null);
                                            if (j4 == 1) {
                                                if (listSplit$default.size() == 2 && listSplit$default2.size() == 1) {
                                                    str20 = listSplit$default.get(0) + "'+" + kotlin.text.c.r((String) listSplit$default.get(1), Separators.QUOTE, "", false);
                                                } else if (listSplit$default2.size() == 2) {
                                                    str20 = listSplit$default2.get(0) + Separators.QUOTE;
                                                }
                                            }
                                            y6n y6nVar = ge30Var.j == 0 ? y6n.f42107a : y6n.b;
                                            ggm ggmVar = i4 == 0 ? arrayList5.size() + (-1) == 0 ? ggm.c : ggm.f11256a : i4 == arrayList5.size() + (-1) ? ggm.b : ggm.d;
                                            lc00VarB.add((str23.length() == 0 && str22.length() == 0) ? new sim(str20, str21, thoVar.name(), y6nVar, ggmVar, ge30Var.b()) : new rim(str20, str21, new lnm(str23, str22, 0, "", new s0m("", ""), ge30Var.k), ge30Var.a() ? new lnm(ge30Var.h, ge30Var.g, 0, "", new s0m("", ""), ge30Var.l) : null, thoVar.name(), null, y6nVar, ggmVar, ge30Var.b()));
                                            it3 = it4;
                                            i4 = i5;
                                            jLongValue = j4;
                                            i = 0;
                                        }
                                    }
                                    it3 = it3;
                                    jLongValue = jLongValue;
                                    i = 0;
                                }
                                i4 i4VarR0 = dyb.r0(kotlin.collections.a.a(lc00VarB));
                                dja djaVar3 = dja.PENALTY;
                                return new gax(new sf30(i4VarR0));
                            }
                        }
                        return null;
                    case 6:
                        vzj0 vzj0Var = (vzj0) obj;
                        if (!(((fee) rjsVar.B.getValue()).b() instanceof qrr) && vzj0Var != null) {
                            anq0 anq0Var3 = (anq0) ((fee) rjsVar.H.getValue()).c();
                            ctf0 ctf0Var6 = rjsVar.f30611a;
                            ctf0Var6.getClass();
                            znq0 znq0Var = anq0Var3 != null ? anq0Var3.h : null;
                            if (znq0Var != null) {
                                long j5 = znq0Var.f44687a;
                                if (j5 <= 0) {
                                    qal0Var = null;
                                } else {
                                    long j6 = j5 / 86400;
                                    qal0Var = new qal0(j6 > 0 ? ctf0Var6.b.a(R.string.line_time_before_v2, Arrays.copyOf(new Object[]{String.valueOf(j6)}, 1)) : ctf0Var6.b.a(R.string.before_start, Arrays.copyOf(new Object[0], 0)), yyw.L((((j5 < 0 ? 0L : j5) / 60) / 60) % 24), yyw.L(((j5 < 0 ? 0L : j5) / 60) % 60), yyw.L((j5 >= 0 ? j5 : 0L) % 60));
                                }
                            } else {
                                qal0Var = null;
                            }
                            if (vzj0Var instanceof tzj0) {
                                tzj0 tzj0Var = (tzj0) vzj0Var;
                                b0k0Var = new yzj0(tzj0Var.f34807a, tzj0Var.b, tzj0Var.c, tzj0Var.d, qal0Var);
                            } else if (vzj0Var instanceof uzj0) {
                                uzj0 uzj0Var = (uzj0) vzj0Var;
                                b0k0Var = new b0k0(uzj0Var.f36538a, uzj0Var.b, uzj0Var.c, uzj0Var.d, qal0Var);
                            } else {
                                t9f.b();
                            }
                            return b0k0Var;
                        }
                        return null;
                    case 7:
                        boolean zBooleanValue4 = ((Boolean) obj).booleanValue();
                        long jLongValue2 = ((Number) ((fee) rjsVar.j.getValue()).c()).longValue();
                        boolean zBooleanValue5 = ((Boolean) ((fee) rjsVar.i.getValue()).c()).booleanValue();
                        long jLongValue3 = ((Number) ((fee) rjsVar.k.getValue()).c()).longValue();
                        long jLongValue4 = ((Number) ((fee) rjsVar.m.getValue()).c()).longValue();
                        Long l = (Long) ((fee) rjsVar.l.getValue()).c();
                        long jLongValue5 = l != null ? l.longValue() : -1L;
                        if (zBooleanValue4) {
                            return new sym0(new MarketsCategoriesParams(jLongValue2, jLongValue3, jLongValue4, new zq2(), "", zBooleanValue5));
                        }
                        tef0 tef0Var = tef0.f33818a;
                        xuz xuzVar = pb10.c;
                        return new vym0(new RelatedParams(zBooleanValue5, jLongValue2, jLongValue4, -1L, jLongValue5, tef0Var));
                    case 8:
                        return a(obj);
                    case 9:
                        fsr fsrVar = (fsr) obj;
                        if ((fsrVar == null || !fsrVar.b) && (fsrVar == null || !fsrVar.c)) {
                            return k49.f17656a;
                        }
                        o49 o49Var = (o49) ((fee) rjsVar.y.getValue()).c();
                        ctf0 ctf0Var7 = rjsVar.f30611a;
                        zvh0 zvh0Var2 = rjsVar.b;
                        fsrVar.getClass();
                        ctf0Var7.getClass();
                        ArrayList arrayList6 = new ArrayList();
                        if (fsrVar.b) {
                            arrayList6.add(new g49(ctf0Var7.b.a(R.string.video, Arrays.copyOf(new Object[0], 0))));
                        }
                        if (fsrVar.c) {
                            arrayList6.add(new h49(ctf0Var7.b.a(R.string.play_zone, Arrays.copyOf(new Object[0], 0))));
                        }
                        if (o49Var == null) {
                            g49Var = (i49) CollectionsKt.U(arrayList6);
                        } else {
                            int iOrdinal = o49Var.ordinal();
                            if (iOrdinal == 0) {
                                g49Var = new g49(ctf0Var7.b.a(R.string.video, Arrays.copyOf(new Object[0], 0)));
                            } else {
                                if (iOrdinal != 1) {
                                    t9f.b();
                                    return null;
                                }
                                g49Var = new h49(ctf0Var7.b.a(R.string.play_zone, Arrays.copyOf(new Object[0], 0)));
                            }
                            if (arrayList6.isEmpty()) {
                                g49Var = null;
                            } else {
                                Iterator it5 = arrayList6.iterator();
                                do {
                                    if (!it5.hasNext()) {
                                        g49Var = null;
                                    }
                                } while (!Intrinsics.d((i49) it5.next(), g49Var));
                            }
                            if (g49Var == null) {
                                g49Var = (i49) CollectionsKt.U(arrayList6);
                            }
                        }
                        bfu0 bfu0Var = fsrVar.f10077a;
                        GameBroadcastingParams gameBroadcastingParams = new GameBroadcastingParams(bfu0Var.f2522a, bfu0Var.c, bfu0Var.f, bfu0Var.b, bfu0Var.e, bfu0Var.d, bfu0Var.g, null);
                        Iterator it6 = arrayList6.iterator();
                        int i6 = 0;
                        while (true) {
                            if (!it6.hasNext()) {
                                i6 = -1;
                            } else if (!Intrinsics.d((i49) it6.next(), g49Var)) {
                                i6++;
                            }
                        }
                        int i7 = i6;
                        i4 i4VarR1 = dyb.r0(arrayList6);
                        boolean z5 = arrayList6.size() > 1;
                        int iOrdinal2 = zvh0Var2.ordinal();
                        if (iOrdinal2 == 0) {
                            dxh0Var = axh0.f1625a;
                        } else if (iOrdinal2 == 1) {
                            dxh0Var = zwh0.f45106a;
                        } else if (iOrdinal2 == 2) {
                            dxh0Var = cxh0.f5122a;
                        } else {
                            if (iOrdinal2 != 3) {
                                t9f.b();
                                return null;
                            }
                            dxh0Var = bxh0.f3376a;
                        }
                        dxh0 dxh0Var2 = dxh0Var;
                        ArrayList arrayList7 = new ArrayList(r3d.q(arrayList6, 10));
                        Iterator it7 = arrayList6.iterator();
                        while (it7.hasNext()) {
                            arrayList7.add(new yvh0(((i49) it7.next()).getDescription(), bwh0.f3325a));
                        }
                        return new j49(gameBroadcastingParams, i7, g49Var, i4VarR1, z5, dxh0Var2, dyb.r0(arrayList7));
                    case 10:
                        return b(obj);
                    default:
                        gna gnaVar5 = (gna) obj;
                        if ((gnaVar5 instanceof ena ? (ena) gnaVar5 : null) == null || (hnaVar = ((ena) gnaVar5).j) == null) {
                            return null;
                        }
                        boolean zContains4 = ((List) ((fee) rjsVar.o.getValue()).c()).contains(ch00.SHORT_STATISTIC);
                        ctf0 ctf0Var8 = rjsVar.f30611a;
                        ctf0Var8.getClass();
                        List<vrj0> list11 = hnaVar.f;
                        ArrayList arrayList8 = new ArrayList(r3d.q(list11, 10));
                        for (vrj0 vrj0Var : list11) {
                            float fS = r7x.s(vrj0Var.b);
                            float fS2 = r7x.s(vrj0Var.c);
                            String str24 = vrj0Var.f37902a;
                            String str25 = vrj0Var.b;
                            String str26 = vrj0Var.c;
                            if (fS == 0.0f && fS2 == 0.0f) {
                                fS = 0.0f;
                            }
                            arrayList8.add(new srj0(fS, (fS == 0.0f && fS2 == 0.0f) ? 0.0f : fS2, str24, str25, str26));
                        }
                        dja djaVar4 = dja.PENALTY;
                        ch00 ch00Var4 = ch00.SHORT_STATISTIC;
                        i4 i4VarR2 = zContains4 ? dyb.r0(arrayList8) : dyb.r0(CollectionsKt.D0(arrayList8, 3));
                        if (arrayList8.size() - 1 > 3) {
                            lsm0 lsm0Var = ctf0Var8.b;
                            lmoVar = new lmo(lsm0Var.a(R.string.expand, Arrays.copyOf(new Object[0], 0)), lsm0Var.a(R.string.collapse, Arrays.copyOf(new Object[0], 0)), zContains4);
                        } else {
                            lmoVar = null;
                        }
                        return new hax(i4VarR2, lmoVar);
                }
            }
        }, (byte) 20));
    }

    public final fee a() {
        return (fee) this.x.getValue();
    }

    @Override // a.v6t0
    public final Object invoke(Object obj) {
        njs njsVar = (njs) obj;
        njsVar.getClass();
        ((fee) this.c.getValue()).d(Boolean.valueOf(njsVar.r));
        ((fee) this.e.getValue()).d(Boolean.valueOf(njsVar.i));
        ((fee) this.f.getValue()).d(Boolean.valueOf(njsVar.q));
        ((fee) this.i.getValue()).d(Boolean.valueOf(njsVar.d));
        ((fee) this.j.getValue()).d(Long.valueOf(njsVar.f23650a));
        ((fee) this.l.getValue()).d(njsVar.g);
        ((fee) this.d.getValue()).d(njsVar.j);
        ((fee) this.m.getValue()).d(Long.valueOf(njsVar.e));
        ((fee) this.k.getValue()).d(Long.valueOf(njsVar.f));
        ((fee) this.g.getValue()).d(Boolean.valueOf(njsVar.K));
        ((fee) this.h.getValue()).d(Boolean.valueOf(njsVar.J));
        ((fee) this.n.getValue()).d(njsVar.T);
        a().d(njsVar.P);
        ((fee) this.y.getValue()).d(njsVar.k);
        ((fee) this.o.getValue()).d(njsVar.l);
        ((fee) this.p.getValue()).d(njsVar.m);
        ((fee) this.q.getValue()).d(njsVar.n);
        ((fee) this.r.getValue()).d(njsVar.o);
        ((fee) this.s.getValue()).d(njsVar.p);
        fee feeVar = (fee) this.t.getValue();
        anq0 anq0Var = njsVar.Q;
        feeVar.d(anq0Var != null ? new znq0(anq0Var.f) : null);
        ((fee) this.u.getValue()).d(njsVar.S);
        n0o0 n0o0Var = this.v;
        ((fee) n0o0Var.getValue()).d(Boolean.valueOf(njsVar.U));
        n0o0 n0o0Var2 = this.w;
        ((fee) n0o0Var2.getValue()).d(njsVar.V);
        ((fee) this.I.getValue()).d(njsVar.R);
        n0o0 n0o0Var3 = this.C;
        fee feeVar2 = (fee) n0o0Var3.getValue();
        feeVar2.getClass();
        pz40 pz40VarA = feeVar2.a();
        pz40VarA.setValue(njsVar.L);
        ((fee) this.H.getValue()).d(anq0Var);
        n0o0 n0o0Var4 = this.z;
        ((fee) n0o0Var4.getValue()).d(njsVar.b());
        n0o0 n0o0Var5 = this.A;
        ((fee) n0o0Var5.getValue()).d(Boolean.valueOf(njsVar.I));
        n0o0 n0o0Var6 = this.M;
        ((fee) n0o0Var6.getValue()).d(njsVar.y);
        Pair pair = new Pair(dja.COMMON, q3d.k(((fee) this.D.getValue()).b()));
        Pair pair2 = new Pair(dja.HOSTS_AND_GUESTS, q3d.k(((fee) this.G.getValue()).b()));
        dja djaVar = dja.LAST_GAMES;
        Object obj2 = (List) ((fee) this.F.getValue()).b();
        if (obj2 == null) {
            obj2 = iun.f15405a;
        }
        Map mapF = xp20.f(pair, pair2, new Pair(djaVar, obj2), new Pair(dja.SHORT_STATISTIC, q3d.k(((fee) this.E.getValue()).b())), new Pair(dja.LIVE_EVENTS, q3d.k(((fee) this.L.getValue()).b())), new Pair(dja.STADIUM_WEATHER, q3d.k(((fee) this.K.getValue()).b())));
        Iterable iterable = (Iterable) ((fee) n0o0Var2.getValue()).c();
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Iterable iterable2 = (List) mapF.get((dja) it.next());
            if (iterable2 == null) {
                iterable2 = iun.f15405a;
            }
            w3d.u(arrayList, iterable2);
        }
        a4x a4xVarO0 = dyb.o0(arrayList);
        ojs ojsVar = (ojs) ((fee) n0o0Var4.getValue()).e.getValue();
        yym0 yym0Var = (yym0) ((fee) n0o0Var5.getValue()).e.getValue();
        tf50 tf50Var = ((ojs) ((fee) n0o0Var4.getValue()).e.getValue()).e.d;
        zrr zrrVar = (zrr) ((fee) this.B.getValue()).e.getValue();
        l49 l49Var = (l49) ((fee) n0o0Var3.getValue()).e.getValue();
        e0k0 e0k0Var = (e0k0) ((fee) n0o0Var6.getValue()).e.getValue();
        boolean zBooleanValue = ((Boolean) ((fee) n0o0Var.getValue()).c()).booleanValue();
        ArrayList arrayList2 = new ArrayList(r3d.q(a4xVarO0, 10));
        Iterator<E> it2 = a4xVarO0.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((jax) it2.next()).getType());
        }
        return new pjs(ojsVar, yym0Var, tf50Var, zrrVar, l49Var, e0k0Var, a4xVarO0, zBooleanValue, dyb.o0(arrayList2));
    }
}
