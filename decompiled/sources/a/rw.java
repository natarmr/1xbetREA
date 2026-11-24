package a;

import android.gov.nist.core.Separators;
import android.javax.sip.message.Response;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.aggregator.api.model.tournaments.UserActionButtonModel;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes6.dex */
public final class rw implements v6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f31195a = 1;
    public final ctf0 b;
    public final n0o0 c;
    public final n0o0 d;
    public final n0o0 e;
    public final n0o0 f;
    public final n0o0 g;
    public final n0o0 h;
    public final n0o0 i;
    public final n0o0 j;
    public final Object k;
    public final Object l;
    public final Object m;

    public rw(lw lwVar, ctf0 ctf0Var) {
        final byte b = 0;
        ctf0Var.getClass();
        this.b = ctf0Var;
        pz40 pz40Var = s6t0.f31722a;
        this.k = new imm(new ilm(s6t0.b().f33626a.getSecondary()), new plm(ctf0Var.b.a(R.string.add_wallet_title, Arrays.copyOf(new Object[0], 0)), s6t0.b().f33626a.getSecondary(), fa50.f9191a), fmm.f9790a, s6t0.b().f33626a.getBackgroundContent(), true, null);
        this.c = bkb.H(Boolean.valueOf(lwVar.f20736a));
        n0o0 n0o0VarH = bkb.H(lwVar.b);
        this.d = n0o0VarH;
        boolean z = lwVar.d;
        this.e = bkb.H(Boolean.valueOf(z));
        String str = lwVar.e;
        this.f = bkb.H(str);
        String str2 = lwVar.f;
        this.g = bkb.H(str2);
        n0o0 n0o0VarH2 = bkb.H(Boolean.valueOf(lwVar.g));
        this.h = n0o0VarH2;
        this.i = bkb.G(((fee) n0o0VarH.getValue()).d, new Function1(this) { // from class: a.pw
            public final /* synthetic */ rw b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                o0x m0xVar;
                byte b2 = b;
                rw rwVar = this.b;
                switch (b2) {
                    case 0:
                        xuf xufVar = (xuf) obj;
                        xufVar.getClass();
                        return !xufVar.o ? kng0.m(xufVar.c, " (", xufVar.b, Separators.RPAREN) : rwVar.b.b.a(R.string.choose_currency, Arrays.copyOf(new Object[0], 0));
                    case 1:
                        return new mtl(dyb.g0(new itl(new wul(lul.e, oe9.f25112a, new ue9(rwVar.b.b.a(R.string.add_wallet_title, Arrays.copyOf(new Object[0], 0))), ((Boolean) obj).booleanValue(), false, true), rk.c)));
                    case 2:
                        qw qwVar = (qw) obj;
                        qwVar.getClass();
                        return new c6q0(qwVar.f29412a, e6q0.f7299a, o6q0.f24750a, qwVar.b ? new s7q0(qwVar.c) : r7q0.f29989a, true, qwVar.b, null, rwVar.b.b.a(R.string.enter_name_hint, Arrays.copyOf(new Object[0], 0)), null, false, 0, null, 261504);
                    default:
                        xuf xufVar2 = (xuf) obj;
                        xufVar2.getClass();
                        String strM = !xufVar2.o ? kng0.m(xufVar2.c, " (", xufVar2.b, Separators.RPAREN) : rwVar.b.b.a(R.string.choose_currency, Arrays.copyOf(new Object[0], 0));
                        long j = xufVar2.f41508a;
                        if (j != 0) {
                            bzu bzuVarE = rz4.e("static", "img", "android", "icons_currency");
                            rz4.s(j, ".svg", bzuVarE);
                            m0xVar = new n0x(((StringBuilder) bzuVarE.b).toString());
                        } else {
                            m0xVar = new m0x(R.drawable.ic_glyph_plus_small, null, 6);
                        }
                        o0x o0xVar = m0xVar;
                        Integer numValueOf = Integer.valueOf(R.drawable.ic_glyph_plus_small);
                        pz40 pz40Var2 = s6t0.f31722a;
                        return new rqm((vui0) new tui0(strM, null), (pui0) new nui0(numValueOf, null, o0xVar, new y3d(s6t0.b().f33626a.getPrimary()), null, null, 0.0f, 242), (pvi0) new fvi0(null), (d4d) null, (tvi0) qvi0.f29388a, wui0.f39793a, false, (e900) null, Response.REQUEST_TIMEOUT);
                }
            }
        });
        final byte b2 = 1;
        this.j = bkb.G(((fee) n0o0VarH2.getValue()).d, new Function1(this) { // from class: a.pw
            public final /* synthetic */ rw b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                o0x m0xVar;
                byte b3 = b2;
                rw rwVar = this.b;
                switch (b3) {
                    case 0:
                        xuf xufVar = (xuf) obj;
                        xufVar.getClass();
                        return !xufVar.o ? kng0.m(xufVar.c, " (", xufVar.b, Separators.RPAREN) : rwVar.b.b.a(R.string.choose_currency, Arrays.copyOf(new Object[0], 0));
                    case 1:
                        return new mtl(dyb.g0(new itl(new wul(lul.e, oe9.f25112a, new ue9(rwVar.b.b.a(R.string.add_wallet_title, Arrays.copyOf(new Object[0], 0))), ((Boolean) obj).booleanValue(), false, true), rk.c)));
                    case 2:
                        qw qwVar = (qw) obj;
                        qwVar.getClass();
                        return new c6q0(qwVar.f29412a, e6q0.f7299a, o6q0.f24750a, qwVar.b ? new s7q0(qwVar.c) : r7q0.f29989a, true, qwVar.b, null, rwVar.b.b.a(R.string.enter_name_hint, Arrays.copyOf(new Object[0], 0)), null, false, 0, null, 261504);
                    default:
                        xuf xufVar2 = (xuf) obj;
                        xufVar2.getClass();
                        String strM = !xufVar2.o ? kng0.m(xufVar2.c, " (", xufVar2.b, Separators.RPAREN) : rwVar.b.b.a(R.string.choose_currency, Arrays.copyOf(new Object[0], 0));
                        long j = xufVar2.f41508a;
                        if (j != 0) {
                            bzu bzuVarE = rz4.e("static", "img", "android", "icons_currency");
                            rz4.s(j, ".svg", bzuVarE);
                            m0xVar = new n0x(((StringBuilder) bzuVarE.b).toString());
                        } else {
                            m0xVar = new m0x(R.drawable.ic_glyph_plus_small, null, 6);
                        }
                        o0x o0xVar = m0xVar;
                        Integer numValueOf = Integer.valueOf(R.drawable.ic_glyph_plus_small);
                        pz40 pz40Var2 = s6t0.f31722a;
                        return new rqm((vui0) new tui0(strM, null), (pui0) new nui0(numValueOf, null, o0xVar, new y3d(s6t0.b().f33626a.getPrimary()), null, null, 0.0f, 242), (pvi0) new fvi0(null), (d4d) null, (tvi0) qvi0.f29388a, wui0.f39793a, false, (e900) null, Response.REQUEST_TIMEOUT);
                }
            }
        });
        qw qwVar = new qw(str2, z, str);
        final byte b3 = 2;
        this.l = maz.b(new yw9(qwVar, new Function1(this) { // from class: a.pw
            public final /* synthetic */ rw b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                o0x m0xVar;
                byte b4 = b3;
                rw rwVar = this.b;
                switch (b4) {
                    case 0:
                        xuf xufVar = (xuf) obj;
                        xufVar.getClass();
                        return !xufVar.o ? kng0.m(xufVar.c, " (", xufVar.b, Separators.RPAREN) : rwVar.b.b.a(R.string.choose_currency, Arrays.copyOf(new Object[0], 0));
                    case 1:
                        return new mtl(dyb.g0(new itl(new wul(lul.e, oe9.f25112a, new ue9(rwVar.b.b.a(R.string.add_wallet_title, Arrays.copyOf(new Object[0], 0))), ((Boolean) obj).booleanValue(), false, true), rk.c)));
                    case 2:
                        qw qwVar2 = (qw) obj;
                        qwVar2.getClass();
                        return new c6q0(qwVar2.f29412a, e6q0.f7299a, o6q0.f24750a, qwVar2.b ? new s7q0(qwVar2.c) : r7q0.f29989a, true, qwVar2.b, null, rwVar.b.b.a(R.string.enter_name_hint, Arrays.copyOf(new Object[0], 0)), null, false, 0, null, 261504);
                    default:
                        xuf xufVar2 = (xuf) obj;
                        xufVar2.getClass();
                        String strM = !xufVar2.o ? kng0.m(xufVar2.c, " (", xufVar2.b, Separators.RPAREN) : rwVar.b.b.a(R.string.choose_currency, Arrays.copyOf(new Object[0], 0));
                        long j = xufVar2.f41508a;
                        if (j != 0) {
                            bzu bzuVarE = rz4.e("static", "img", "android", "icons_currency");
                            rz4.s(j, ".svg", bzuVarE);
                            m0xVar = new n0x(((StringBuilder) bzuVarE.b).toString());
                        } else {
                            m0xVar = new m0x(R.drawable.ic_glyph_plus_small, null, 6);
                        }
                        o0x o0xVar = m0xVar;
                        Integer numValueOf = Integer.valueOf(R.drawable.ic_glyph_plus_small);
                        pz40 pz40Var2 = s6t0.f31722a;
                        return new rqm((vui0) new tui0(strM, null), (pui0) new nui0(numValueOf, null, o0xVar, new y3d(s6t0.b().f33626a.getPrimary()), null, null, 0.0f, 242), (pvi0) new fvi0(null), (d4d) null, (tvi0) qvi0.f29388a, wui0.f39793a, false, (e900) null, Response.REQUEST_TIMEOUT);
                }
            }
        }, (byte) 20));
        final byte b4 = 3;
        this.m = bkb.G(((fee) n0o0VarH.getValue()).d, new Function1(this) { // from class: a.pw
            public final /* synthetic */ rw b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                o0x m0xVar;
                byte b5 = b4;
                rw rwVar = this.b;
                switch (b5) {
                    case 0:
                        xuf xufVar = (xuf) obj;
                        xufVar.getClass();
                        return !xufVar.o ? kng0.m(xufVar.c, " (", xufVar.b, Separators.RPAREN) : rwVar.b.b.a(R.string.choose_currency, Arrays.copyOf(new Object[0], 0));
                    case 1:
                        return new mtl(dyb.g0(new itl(new wul(lul.e, oe9.f25112a, new ue9(rwVar.b.b.a(R.string.add_wallet_title, Arrays.copyOf(new Object[0], 0))), ((Boolean) obj).booleanValue(), false, true), rk.c)));
                    case 2:
                        qw qwVar2 = (qw) obj;
                        qwVar2.getClass();
                        return new c6q0(qwVar2.f29412a, e6q0.f7299a, o6q0.f24750a, qwVar2.b ? new s7q0(qwVar2.c) : r7q0.f29989a, true, qwVar2.b, null, rwVar.b.b.a(R.string.enter_name_hint, Arrays.copyOf(new Object[0], 0)), null, false, 0, null, 261504);
                    default:
                        xuf xufVar2 = (xuf) obj;
                        xufVar2.getClass();
                        String strM = !xufVar2.o ? kng0.m(xufVar2.c, " (", xufVar2.b, Separators.RPAREN) : rwVar.b.b.a(R.string.choose_currency, Arrays.copyOf(new Object[0], 0));
                        long j = xufVar2.f41508a;
                        if (j != 0) {
                            bzu bzuVarE = rz4.e("static", "img", "android", "icons_currency");
                            rz4.s(j, ".svg", bzuVarE);
                            m0xVar = new n0x(((StringBuilder) bzuVarE.b).toString());
                        } else {
                            m0xVar = new m0x(R.drawable.ic_glyph_plus_small, null, 6);
                        }
                        o0x o0xVar = m0xVar;
                        Integer numValueOf = Integer.valueOf(R.drawable.ic_glyph_plus_small);
                        pz40 pz40Var2 = s6t0.f31722a;
                        return new rqm((vui0) new tui0(strM, null), (pui0) new nui0(numValueOf, null, o0xVar, new y3d(s6t0.b().f33626a.getPrimary()), null, null, 0.0f, 242), (pvi0) new fvi0(null), (d4d) null, (tvi0) qvi0.f29388a, wui0.f39793a, false, (e900) null, Response.REQUEST_TIMEOUT);
                }
            }
        });
    }

    public String a(lyr0 lyr0Var, Locale locale, hyr0 hyr0Var) {
        String strConcat;
        Date date = hyr0Var.e;
        if (!lyr0Var.equals(gy1.f12104a)) {
            rdj rdjVar = rdj.f30294a;
            boolean zH = this.b.h();
            efj efjVar = efj.UNIVERSAL;
            String strD = rdj.d(rdjVar, date, Boolean.valueOf(zH), null, 56);
            strConcat = StringsKt.W(strD) ? null : strD;
            return strConcat == null ? "" : strConcat;
        }
        rdj rdjVar2 = rdj.f30294a;
        String strE = rdj.e(wjo.AGGREGATOR_TOURNAMENTS_DATE_DAY, date, locale);
        String strE2 = rdj.e(wjo.AGGREGATOR_TOURNAMENTS_DATE_MONTH, date, locale);
        String strConcat2 = strE.concat(Separators.SP);
        if (StringsKt.W(strE)) {
            strConcat2 = null;
        }
        if (strConcat2 == null) {
            strConcat2 = "";
        }
        strConcat = StringsKt.W(strE2) ? null : strE2.concat(Separators.SP);
        return strConcat2.concat(strConcat != null ? strConcat : "");
    }

    public String b(Locale locale, hyr0 hyr0Var) {
        String strConcat;
        Date date = hyr0Var.d;
        if (!Intrinsics.d((ky1) this.m, gy1.f12104a)) {
            boolean zH = this.b.h();
            rdj rdjVar = rdj.f30294a;
            efj efjVar = efj.UNIVERSAL;
            String strD = rdj.d(rdjVar, date, Boolean.valueOf(zH), null, 56);
            strConcat = StringsKt.W(strD) ? null : strD;
            return strConcat == null ? "" : strConcat;
        }
        rdj rdjVar2 = rdj.f30294a;
        String strE = rdj.e(wjo.AGGREGATOR_TOURNAMENTS_DATE_DAY, date, locale);
        String strE2 = rdj.e(wjo.AGGREGATOR_TOURNAMENTS_DATE_MONTH, date, locale);
        String strConcat2 = strE.concat(Separators.SP);
        if (StringsKt.W(strE)) {
            strConcat2 = null;
        }
        if (strConcat2 == null) {
            strConcat2 = "";
        }
        strConcat = StringsKt.W(strE2) ? null : strE2.concat(Separators.SP);
        return strConcat2.concat(strConcat != null ? strConcat : "");
    }

    @Override // a.v6t0
    public final Object invoke(Object obj) {
        byte b = this.f31195a;
        Object obj2 = this.k;
        Object obj3 = this.l;
        Object obj4 = this.m;
        n0o0 n0o0Var = this.j;
        n0o0 n0o0Var2 = this.i;
        n0o0 n0o0Var3 = this.h;
        n0o0 n0o0Var4 = this.g;
        n0o0 n0o0Var5 = this.f;
        n0o0 n0o0Var6 = this.e;
        n0o0 n0o0Var7 = this.d;
        n0o0 n0o0Var8 = this.c;
        switch (b) {
            case 0:
                lw lwVar = (lw) obj;
                lwVar.getClass();
                ((fee) n0o0Var8.getValue()).d(Boolean.valueOf(lwVar.f20736a));
                ((fee) n0o0Var7.getValue()).d(lwVar.b);
                fee feeVar = (fee) n0o0Var6.getValue();
                boolean z = lwVar.d;
                feeVar.d(Boolean.valueOf(z));
                fee feeVar2 = (fee) n0o0Var5.getValue();
                String str = lwVar.e;
                feeVar2.d(str);
                fee feeVar3 = (fee) n0o0Var4.getValue();
                String str2 = lwVar.f;
                feeVar3.d(str2);
                ((fee) n0o0Var3.getValue()).d(Boolean.valueOf(lwVar.g));
                n0o0 n0o0Var9 = (n0o0) obj3;
                ((fee) n0o0Var9.getValue()).d(new qw(str2, z, str));
                imm immVar = (imm) obj2;
                return ((Boolean) ((fee) n0o0Var8.getValue()).c()).booleanValue() ? new nw(immVar) : new mw(immVar, (String) ((fee) n0o0Var2.getValue()).b(), ((xuf) ((fee) n0o0Var7.getValue()).c()).f41508a, ((Boolean) ((fee) n0o0Var6.getValue()).c()).booleanValue(), (String) ((fee) n0o0Var5.getValue()).c(), (String) ((fee) n0o0Var4.getValue()).c(), ((Boolean) ((fee) n0o0Var3.getValue()).c()).booleanValue(), (mtl) ((fee) n0o0Var.getValue()).b(), (c6q0) ((fee) n0o0Var9.getValue()).b(), (rqm) ((fee) ((n0o0) obj4).getValue()).b());
            case 1:
                dz1 dz1Var = (dz1) obj;
                dz1Var.getClass();
                ((fee) n0o0Var8.getValue()).d(dz1Var.f6918a);
                ((fee) n0o0Var7.getValue()).d(Boolean.valueOf(dz1Var.c));
                fee feeVar4 = (fee) n0o0Var6.getValue();
                boolean z2 = dz1Var.e;
                feeVar4.d(Boolean.valueOf(z2));
                ((fee) n0o0Var5.getValue()).d(dz1Var.f);
                ((fee) n0o0Var4.getValue()).d(Boolean.valueOf(dz1Var.g));
                ((fee) n0o0Var3.getValue()).d(dz1Var.h);
                ((fee) n0o0Var2.getValue()).d(Boolean.valueOf(z2));
                ((fee) n0o0Var.getValue()).d(dz1Var.l);
                return new kz1((String) ((fee) n0o0Var8.getValue()).c(), ((Boolean) ((fee) n0o0Var7.getValue()).c()).booleanValue(), (ya0) ((fee) n0o0Var2.getValue()).b(), (dbs0) ((fee) n0o0Var.getValue()).b());
            case 2:
                n0o0 n0o0Var10 = (n0o0) obj3;
                qx60 qx60Var = (qx60) obj;
                qx60Var.getClass();
                ((fee) n0o0Var8.getValue()).d(Boolean.valueOf(qx60Var.f));
                ((fee) n0o0Var7.getValue()).d(qx60Var.g);
                ((fee) n0o0Var6.getValue()).d(qx60Var.b);
                ((fee) n0o0Var5.getValue()).d(qx60Var.c);
                ((fee) n0o0Var4.getValue()).d(qx60Var.h);
                List list = ((cfp) ((fee) n0o0Var5.getValue()).c()).f4274a;
                if (((fee) n0o0Var4.getValue()).c() != null) {
                    boolean z3 = ((fee) n0o0Var4.getValue()).c() instanceof sq60;
                    return new tx60((cd50) ((fee) n0o0Var10.getValue()).b(), z3 ? null : (mdm) ((fee) n0o0Var3.getValue()).b(), z3 ? (mdm) ((fee) n0o0Var3.getValue()).b() : null, (in5) ((fee) n0o0Var.getValue()).b(), (ijl) ((fee) n0o0Var2.getValue()).b());
                }
                if (list == null) {
                    return new ux60((cd50) ((fee) n0o0Var10.getValue()).b(), (in5) ((fee) n0o0Var.getValue()).b(), (ijl) ((fee) n0o0Var2.getValue()).b());
                }
                return list.isEmpty() ? new tx60((cd50) ((fee) n0o0Var10.getValue()).b(), g2v.b((g2v) obj2, pb10.h, pdm.f26814a, ldm.f19857a, 0, R.string.empty_favorites_games_title, R.string.casino_favorites_empty, R.string.empty_str, R.string.empty_str, 0L, 0L, 512), null, (in5) ((fee) n0o0Var.getValue()).b(), (ijl) ((fee) n0o0Var2.getValue()).b()) : new sx60((cd50) ((fee) n0o0Var10.getValue()).b(), (htr) ((fee) ((n0o0) obj4).getValue()).b(), (in5) ((fee) n0o0Var.getValue()).b(), (ijl) ((fee) n0o0Var2.getValue()).b());
            case 3:
                yhr0 yhr0Var = (yhr0) obj;
                yhr0Var.getClass();
                ((fee) n0o0Var8.getValue()).d(yhr0Var.f42652a);
                ((fee) n0o0Var7.getValue()).d(yhr0Var.b);
                ((fee) n0o0Var6.getValue()).d(yhr0Var.c);
                ((fee) n0o0Var5.getValue()).d(yhr0Var.d);
                ((fee) n0o0Var4.getValue()).d(Long.valueOf(yhr0Var.g));
                ((fee) n0o0Var3.getValue()).d(Long.valueOf(yhr0Var.h));
                ((fee) n0o0Var2.getValue()).d(yhr0Var.i);
                return new air0((String) ((fee) n0o0Var2.getValue()).c(), (imm) ((fee) ((n0o0) obj3).getValue()).b(), (aor0) ((fee) n0o0Var.getValue()).b(), (iur0) ((fee) ((n0o0) obj4).getValue()).b(), yhr0Var.f, yhr0Var.e);
            default:
                e7s0 e7s0Var = (e7s0) obj;
                e7s0Var.getClass();
                ((fee) n0o0Var8.getValue()).d(Boolean.valueOf(e7s0Var.f));
                ((fee) n0o0Var7.getValue()).d(e7s0Var.e);
                ((fee) n0o0Var6.getValue()).d(e7s0Var.g);
                ((fee) n0o0Var5.getValue()).d(Integer.valueOf(e7s0Var.h));
                ((fee) n0o0Var4.getValue()).d(Boolean.valueOf(e7s0Var.i));
                ((fee) n0o0Var3.getValue()).d(e7s0Var.f7342a);
                if (((Boolean) ((fee) n0o0Var8.getValue()).c()).booleanValue()) {
                    return new g7s0((mdm) ((fee) n0o0Var.getValue()).b(), (imm) n0o0Var2.getValue());
                }
                return new f7s0((imm) n0o0Var2.getValue(), (a4x) ((fee) ((n0o0) obj4).getValue()).b(), (ci) ((fee) ((n0o0) obj3).getValue()).b());
        }
    }

    public rw(qx60 qx60Var, ctf0 ctf0Var, g2v g2vVar) {
        final byte b = 2;
        ctf0Var.getClass();
        this.b = ctf0Var;
        this.k = g2vVar;
        this.c = bkb.H(Boolean.valueOf(qx60Var.f));
        n0o0 n0o0VarH = bkb.H(qx60Var.g);
        this.d = n0o0VarH;
        n0o0 n0o0VarH2 = bkb.H(qx60Var.b);
        this.e = n0o0VarH2;
        n0o0 n0o0VarH3 = bkb.H(qx60Var.c);
        this.f = n0o0VarH3;
        n0o0 n0o0VarH4 = bkb.H(qx60Var.h);
        this.g = n0o0VarH4;
        final byte b2 = 0;
        this.h = bkb.G(((fee) n0o0VarH4.getValue()).d, new Function1(this) { // from class: a.rx60
            public final /* synthetic */ rw b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                y9n y9nVar;
                x9n u9nVar;
                byte b3 = b2;
                rw rwVar = this.b;
                switch (b3) {
                    case 0:
                        g2v g2vVar2 = (g2v) rwVar.k;
                        Throwable th = (Throwable) obj;
                        if (th != null) {
                            if (th instanceof j7t0) {
                                return g2v.b(g2vVar2, pb10.g, pdm.f26814a, ldm.f19857a, R.drawable.ic_glyph_circle_technical_works, 0, R.string.unauthorized_favorites_desc, 0, 0, 0L, 0L, 976);
                            }
                            if (th instanceof sq60) {
                                return g2v.b(g2vVar2, pb10.r1, pdm.b, null, R.drawable.ic_glyph_circle_technical_works, 0, R.string.games_section_technical_works_descr, 0, R.string.continue_action, 0L, 0L, 852);
                            }
                            if ((th instanceof SocketTimeoutException) || (th instanceof UnknownHostException)) {
                                return g2v.b(g2vVar2, pb10.g, pdm.f26814a, ldm.f19857a, 0, R.string.empty_str, R.string.data_retrieval_error, R.string.empty_str, R.string.try_again_text, 10000L, 0L, 512);
                            }
                        }
                        return g2v.b(g2vVar2, pb10.g, pdm.f26814a, ldm.f19857a, 0, R.string.empty_str, R.string.data_retrieval_error, R.string.empty_str, R.string.try_again_text, 10000L, 0L, 512);
                    case 1:
                        gep gepVar = (gep) obj;
                        gepVar.getClass();
                        boolean z = gepVar.d;
                        boolean z2 = !((Boolean) ((fee) rwVar.c.getValue()).c()).booleanValue();
                        String str = gepVar.b;
                        String str2 = gepVar.c;
                        String str3 = gepVar.f11167a;
                        pz40 pz40Var = s6t0.f31722a;
                        long backgroundContent = s6t0.b().f33626a.getBackgroundContent();
                        ctf0 ctf0Var2 = rwVar.b;
                        String strA = ctf0Var2.b.a(R.string.button_login, Arrays.copyOf(new Object[0], 0));
                        lsm0 lsm0Var = ctf0Var2.b;
                        return new in5(backgroundContent, str, str2, str3, strA, lsm0Var.a(R.string.registration, Arrays.copyOf(new Object[0], 0)), lsm0Var.a(R.string.top_up, Arrays.copyOf(new Object[0], 0)), z, z2);
                    case 2:
                        ((kg) obj).getClass();
                        pz40 pz40Var2 = s6t0.f31722a;
                        return new cd50(new imm(new ilm(s6t0.b().f33626a.getSecondary()), new plm(rwVar.b.b.a(R.string.favorites_name, Arrays.copyOf(new Object[0], 0)), ha50.TWO_LINES, s6t0.b().f33626a.getSecondary(), fa50.f9191a), fmm.f9790a, s6t0.b().f33626a.getBackgroundContent(), false, null));
                    default:
                        cfp cfpVar = (cfp) obj;
                        cfpVar.getClass();
                        List<pbv> list = cfpVar.f4274a;
                        if (list == null) {
                            return new gtr(true);
                        }
                        ctf0 ctf0Var3 = rwVar.b;
                        Integer numValueOf = Integer.valueOf(R.drawable.ic_games_placeholder);
                        ctf0Var3.getClass();
                        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                        for (pbv pbvVar : list) {
                            String str4 = pbvVar.f;
                            String str5 = pbvVar.c;
                            hcs hcsVar = pbvVar.d;
                            boolean z3 = pbvVar.o;
                            hds hdsVar = pbvVar.n;
                            if (wvb.O(str4) > 1.0d) {
                                String strA2 = ctf0Var3.b.a(R.string.win_to_xgame_card_title, Arrays.copyOf(new Object[0], 0));
                                pn40 pn40Var = pn40.f27267a;
                                y9nVar = new y9n(strA2, "x".concat(pn40.c(wvb.O(pbvVar.f), p3u0.c)));
                            } else {
                                y9nVar = null;
                            }
                            long j = pbvVar.f26728a;
                            if (pbvVar.p) {
                                u9nVar = new t9n(new n0x(hdsVar.f12884a), new n0x(azw.R(hdsVar.f12884a)), numValueOf, z3 ? p9n.DEMO : null, cww.K(hcsVar));
                            } else {
                                u9nVar = new u9n(new n0x(hdsVar.f12884a), new n0x(azw.R(hdsVar.f12884a)), numValueOf, z3 ? p9n.DEMO : null, cww.K(hcsVar), y9nVar);
                            }
                            arrayList.add(new l9n(j, u9nVar, new g9n(str5, true)));
                        }
                        return new ftr(dyb.o0(arrayList));
                }
            }
        });
        final byte b3 = 3;
        this.i = bkb.G(((fee) n0o0VarH.getValue()).d, new wk60((byte) 3));
        final byte b4 = 1;
        this.j = bkb.G(((fee) n0o0VarH2.getValue()).d, new Function1(this) { // from class: a.rx60
            public final /* synthetic */ rw b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                y9n y9nVar;
                x9n u9nVar;
                byte b5 = b4;
                rw rwVar = this.b;
                switch (b5) {
                    case 0:
                        g2v g2vVar2 = (g2v) rwVar.k;
                        Throwable th = (Throwable) obj;
                        if (th != null) {
                            if (th instanceof j7t0) {
                                return g2v.b(g2vVar2, pb10.g, pdm.f26814a, ldm.f19857a, R.drawable.ic_glyph_circle_technical_works, 0, R.string.unauthorized_favorites_desc, 0, 0, 0L, 0L, 976);
                            }
                            if (th instanceof sq60) {
                                return g2v.b(g2vVar2, pb10.r1, pdm.b, null, R.drawable.ic_glyph_circle_technical_works, 0, R.string.games_section_technical_works_descr, 0, R.string.continue_action, 0L, 0L, 852);
                            }
                            if ((th instanceof SocketTimeoutException) || (th instanceof UnknownHostException)) {
                                return g2v.b(g2vVar2, pb10.g, pdm.f26814a, ldm.f19857a, 0, R.string.empty_str, R.string.data_retrieval_error, R.string.empty_str, R.string.try_again_text, 10000L, 0L, 512);
                            }
                        }
                        return g2v.b(g2vVar2, pb10.g, pdm.f26814a, ldm.f19857a, 0, R.string.empty_str, R.string.data_retrieval_error, R.string.empty_str, R.string.try_again_text, 10000L, 0L, 512);
                    case 1:
                        gep gepVar = (gep) obj;
                        gepVar.getClass();
                        boolean z = gepVar.d;
                        boolean z2 = !((Boolean) ((fee) rwVar.c.getValue()).c()).booleanValue();
                        String str = gepVar.b;
                        String str2 = gepVar.c;
                        String str3 = gepVar.f11167a;
                        pz40 pz40Var = s6t0.f31722a;
                        long backgroundContent = s6t0.b().f33626a.getBackgroundContent();
                        ctf0 ctf0Var2 = rwVar.b;
                        String strA = ctf0Var2.b.a(R.string.button_login, Arrays.copyOf(new Object[0], 0));
                        lsm0 lsm0Var = ctf0Var2.b;
                        return new in5(backgroundContent, str, str2, str3, strA, lsm0Var.a(R.string.registration, Arrays.copyOf(new Object[0], 0)), lsm0Var.a(R.string.top_up, Arrays.copyOf(new Object[0], 0)), z, z2);
                    case 2:
                        ((kg) obj).getClass();
                        pz40 pz40Var2 = s6t0.f31722a;
                        return new cd50(new imm(new ilm(s6t0.b().f33626a.getSecondary()), new plm(rwVar.b.b.a(R.string.favorites_name, Arrays.copyOf(new Object[0], 0)), ha50.TWO_LINES, s6t0.b().f33626a.getSecondary(), fa50.f9191a), fmm.f9790a, s6t0.b().f33626a.getBackgroundContent(), false, null));
                    default:
                        cfp cfpVar = (cfp) obj;
                        cfpVar.getClass();
                        List<pbv> list = cfpVar.f4274a;
                        if (list == null) {
                            return new gtr(true);
                        }
                        ctf0 ctf0Var3 = rwVar.b;
                        Integer numValueOf = Integer.valueOf(R.drawable.ic_games_placeholder);
                        ctf0Var3.getClass();
                        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                        for (pbv pbvVar : list) {
                            String str4 = pbvVar.f;
                            String str5 = pbvVar.c;
                            hcs hcsVar = pbvVar.d;
                            boolean z3 = pbvVar.o;
                            hds hdsVar = pbvVar.n;
                            if (wvb.O(str4) > 1.0d) {
                                String strA2 = ctf0Var3.b.a(R.string.win_to_xgame_card_title, Arrays.copyOf(new Object[0], 0));
                                pn40 pn40Var = pn40.f27267a;
                                y9nVar = new y9n(strA2, "x".concat(pn40.c(wvb.O(pbvVar.f), p3u0.c)));
                            } else {
                                y9nVar = null;
                            }
                            long j = pbvVar.f26728a;
                            if (pbvVar.p) {
                                u9nVar = new t9n(new n0x(hdsVar.f12884a), new n0x(azw.R(hdsVar.f12884a)), numValueOf, z3 ? p9n.DEMO : null, cww.K(hcsVar));
                            } else {
                                u9nVar = new u9n(new n0x(hdsVar.f12884a), new n0x(azw.R(hdsVar.f12884a)), numValueOf, z3 ? p9n.DEMO : null, cww.K(hcsVar), y9nVar);
                            }
                            arrayList.add(new l9n(j, u9nVar, new g9n(str5, true)));
                        }
                        return new ftr(dyb.o0(arrayList));
                }
            }
        });
        this.l = bkb.G(((fee) n0o0VarH.getValue()).d, new Function1(this) { // from class: a.rx60
            public final /* synthetic */ rw b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                y9n y9nVar;
                x9n u9nVar;
                byte b5 = b;
                rw rwVar = this.b;
                switch (b5) {
                    case 0:
                        g2v g2vVar2 = (g2v) rwVar.k;
                        Throwable th = (Throwable) obj;
                        if (th != null) {
                            if (th instanceof j7t0) {
                                return g2v.b(g2vVar2, pb10.g, pdm.f26814a, ldm.f19857a, R.drawable.ic_glyph_circle_technical_works, 0, R.string.unauthorized_favorites_desc, 0, 0, 0L, 0L, 976);
                            }
                            if (th instanceof sq60) {
                                return g2v.b(g2vVar2, pb10.r1, pdm.b, null, R.drawable.ic_glyph_circle_technical_works, 0, R.string.games_section_technical_works_descr, 0, R.string.continue_action, 0L, 0L, 852);
                            }
                            if ((th instanceof SocketTimeoutException) || (th instanceof UnknownHostException)) {
                                return g2v.b(g2vVar2, pb10.g, pdm.f26814a, ldm.f19857a, 0, R.string.empty_str, R.string.data_retrieval_error, R.string.empty_str, R.string.try_again_text, 10000L, 0L, 512);
                            }
                        }
                        return g2v.b(g2vVar2, pb10.g, pdm.f26814a, ldm.f19857a, 0, R.string.empty_str, R.string.data_retrieval_error, R.string.empty_str, R.string.try_again_text, 10000L, 0L, 512);
                    case 1:
                        gep gepVar = (gep) obj;
                        gepVar.getClass();
                        boolean z = gepVar.d;
                        boolean z2 = !((Boolean) ((fee) rwVar.c.getValue()).c()).booleanValue();
                        String str = gepVar.b;
                        String str2 = gepVar.c;
                        String str3 = gepVar.f11167a;
                        pz40 pz40Var = s6t0.f31722a;
                        long backgroundContent = s6t0.b().f33626a.getBackgroundContent();
                        ctf0 ctf0Var2 = rwVar.b;
                        String strA = ctf0Var2.b.a(R.string.button_login, Arrays.copyOf(new Object[0], 0));
                        lsm0 lsm0Var = ctf0Var2.b;
                        return new in5(backgroundContent, str, str2, str3, strA, lsm0Var.a(R.string.registration, Arrays.copyOf(new Object[0], 0)), lsm0Var.a(R.string.top_up, Arrays.copyOf(new Object[0], 0)), z, z2);
                    case 2:
                        ((kg) obj).getClass();
                        pz40 pz40Var2 = s6t0.f31722a;
                        return new cd50(new imm(new ilm(s6t0.b().f33626a.getSecondary()), new plm(rwVar.b.b.a(R.string.favorites_name, Arrays.copyOf(new Object[0], 0)), ha50.TWO_LINES, s6t0.b().f33626a.getSecondary(), fa50.f9191a), fmm.f9790a, s6t0.b().f33626a.getBackgroundContent(), false, null));
                    default:
                        cfp cfpVar = (cfp) obj;
                        cfpVar.getClass();
                        List<pbv> list = cfpVar.f4274a;
                        if (list == null) {
                            return new gtr(true);
                        }
                        ctf0 ctf0Var3 = rwVar.b;
                        Integer numValueOf = Integer.valueOf(R.drawable.ic_games_placeholder);
                        ctf0Var3.getClass();
                        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                        for (pbv pbvVar : list) {
                            String str4 = pbvVar.f;
                            String str5 = pbvVar.c;
                            hcs hcsVar = pbvVar.d;
                            boolean z3 = pbvVar.o;
                            hds hdsVar = pbvVar.n;
                            if (wvb.O(str4) > 1.0d) {
                                String strA2 = ctf0Var3.b.a(R.string.win_to_xgame_card_title, Arrays.copyOf(new Object[0], 0));
                                pn40 pn40Var = pn40.f27267a;
                                y9nVar = new y9n(strA2, "x".concat(pn40.c(wvb.O(pbvVar.f), p3u0.c)));
                            } else {
                                y9nVar = null;
                            }
                            long j = pbvVar.f26728a;
                            if (pbvVar.p) {
                                u9nVar = new t9n(new n0x(hdsVar.f12884a), new n0x(azw.R(hdsVar.f12884a)), numValueOf, z3 ? p9n.DEMO : null, cww.K(hcsVar));
                            } else {
                                u9nVar = new u9n(new n0x(hdsVar.f12884a), new n0x(azw.R(hdsVar.f12884a)), numValueOf, z3 ? p9n.DEMO : null, cww.K(hcsVar), y9nVar);
                            }
                            arrayList.add(new l9n(j, u9nVar, new g9n(str5, true)));
                        }
                        return new ftr(dyb.o0(arrayList));
                }
            }
        });
        this.m = bkb.G(((fee) n0o0VarH3.getValue()).d, new Function1(this) { // from class: a.rx60
            public final /* synthetic */ rw b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                y9n y9nVar;
                x9n u9nVar;
                byte b5 = b3;
                rw rwVar = this.b;
                switch (b5) {
                    case 0:
                        g2v g2vVar2 = (g2v) rwVar.k;
                        Throwable th = (Throwable) obj;
                        if (th != null) {
                            if (th instanceof j7t0) {
                                return g2v.b(g2vVar2, pb10.g, pdm.f26814a, ldm.f19857a, R.drawable.ic_glyph_circle_technical_works, 0, R.string.unauthorized_favorites_desc, 0, 0, 0L, 0L, 976);
                            }
                            if (th instanceof sq60) {
                                return g2v.b(g2vVar2, pb10.r1, pdm.b, null, R.drawable.ic_glyph_circle_technical_works, 0, R.string.games_section_technical_works_descr, 0, R.string.continue_action, 0L, 0L, 852);
                            }
                            if ((th instanceof SocketTimeoutException) || (th instanceof UnknownHostException)) {
                                return g2v.b(g2vVar2, pb10.g, pdm.f26814a, ldm.f19857a, 0, R.string.empty_str, R.string.data_retrieval_error, R.string.empty_str, R.string.try_again_text, 10000L, 0L, 512);
                            }
                        }
                        return g2v.b(g2vVar2, pb10.g, pdm.f26814a, ldm.f19857a, 0, R.string.empty_str, R.string.data_retrieval_error, R.string.empty_str, R.string.try_again_text, 10000L, 0L, 512);
                    case 1:
                        gep gepVar = (gep) obj;
                        gepVar.getClass();
                        boolean z = gepVar.d;
                        boolean z2 = !((Boolean) ((fee) rwVar.c.getValue()).c()).booleanValue();
                        String str = gepVar.b;
                        String str2 = gepVar.c;
                        String str3 = gepVar.f11167a;
                        pz40 pz40Var = s6t0.f31722a;
                        long backgroundContent = s6t0.b().f33626a.getBackgroundContent();
                        ctf0 ctf0Var2 = rwVar.b;
                        String strA = ctf0Var2.b.a(R.string.button_login, Arrays.copyOf(new Object[0], 0));
                        lsm0 lsm0Var = ctf0Var2.b;
                        return new in5(backgroundContent, str, str2, str3, strA, lsm0Var.a(R.string.registration, Arrays.copyOf(new Object[0], 0)), lsm0Var.a(R.string.top_up, Arrays.copyOf(new Object[0], 0)), z, z2);
                    case 2:
                        ((kg) obj).getClass();
                        pz40 pz40Var2 = s6t0.f31722a;
                        return new cd50(new imm(new ilm(s6t0.b().f33626a.getSecondary()), new plm(rwVar.b.b.a(R.string.favorites_name, Arrays.copyOf(new Object[0], 0)), ha50.TWO_LINES, s6t0.b().f33626a.getSecondary(), fa50.f9191a), fmm.f9790a, s6t0.b().f33626a.getBackgroundContent(), false, null));
                    default:
                        cfp cfpVar = (cfp) obj;
                        cfpVar.getClass();
                        List<pbv> list = cfpVar.f4274a;
                        if (list == null) {
                            return new gtr(true);
                        }
                        ctf0 ctf0Var3 = rwVar.b;
                        Integer numValueOf = Integer.valueOf(R.drawable.ic_games_placeholder);
                        ctf0Var3.getClass();
                        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                        for (pbv pbvVar : list) {
                            String str4 = pbvVar.f;
                            String str5 = pbvVar.c;
                            hcs hcsVar = pbvVar.d;
                            boolean z3 = pbvVar.o;
                            hds hdsVar = pbvVar.n;
                            if (wvb.O(str4) > 1.0d) {
                                String strA2 = ctf0Var3.b.a(R.string.win_to_xgame_card_title, Arrays.copyOf(new Object[0], 0));
                                pn40 pn40Var = pn40.f27267a;
                                y9nVar = new y9n(strA2, "x".concat(pn40.c(wvb.O(pbvVar.f), p3u0.c)));
                            } else {
                                y9nVar = null;
                            }
                            long j = pbvVar.f26728a;
                            if (pbvVar.p) {
                                u9nVar = new t9n(new n0x(hdsVar.f12884a), new n0x(azw.R(hdsVar.f12884a)), numValueOf, z3 ? p9n.DEMO : null, cww.K(hcsVar));
                            } else {
                                u9nVar = new u9n(new n0x(hdsVar.f12884a), new n0x(azw.R(hdsVar.f12884a)), numValueOf, z3 ? p9n.DEMO : null, cww.K(hcsVar), y9nVar);
                            }
                            arrayList.add(new l9n(j, u9nVar, new g9n(str5, true)));
                        }
                        return new ftr(dyb.o0(arrayList));
                }
            }
        });
    }

    public rw(e7s0 e7s0Var, ctf0 ctf0Var) {
        ctf0Var.getClass();
        this.k = e7s0Var;
        this.b = ctf0Var;
        this.c = bkb.H(Boolean.valueOf(e7s0Var.f));
        n0o0 n0o0VarH = bkb.H(e7s0Var.e);
        this.d = n0o0VarH;
        n0o0 n0o0VarH2 = bkb.H(e7s0Var.g);
        this.e = n0o0VarH2;
        n0o0 n0o0VarH3 = bkb.H(Integer.valueOf(e7s0Var.h));
        this.f = n0o0VarH3;
        this.g = bkb.H(Boolean.valueOf(e7s0Var.i));
        this.h = bkb.H(e7s0Var.f7342a);
        this.i = maz.b(new qir0(this, (byte) 13));
        this.j = bkb.G(((fee) n0o0VarH3.getValue()).d, new g4s0((byte) 10));
        final byte b = 0;
        this.l = maz.b(new yw9((fee) n0o0VarH2.getValue(), new Function1(this) { // from class: a.i7s0
            public final /* synthetic */ rw b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:46:0x0162  */
            /* JADX WARN: Code duplicated, block: B:47:0x0165  */
            /* JADX WARN: Code duplicated, block: B:50:0x016c  */
            /* JADX WARN: Code duplicated, block: B:51:0x016e  */
            /* JADX WARN: Code duplicated, block: B:61:0x0203  */
            /* JADX WARN: Code duplicated, block: B:63:0x020b  */
            /* JADX WARN: Code duplicated, block: B:64:0x0236  */
            /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r11v16 java.lang.Object, still in use, count: 2, list:
                  (r11v16 java.lang.Object) from 0x015e: PHI (r11 I:??) = (r11v3 java.lang.Object), (r11v16 java.lang.Object) binds: [B:43:0x015d, B:94:0x015e] A[DONT_GENERATE, DONT_INLINE]
                  (r11v16 java.lang.Object) from 0x0156: CHECK_CAST (a.o2g0) (r11v16 java.lang.Object)
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
            public final java.lang.Object invoke(java.lang.Object r25) {
                /*
                    Method dump skipped, instruction units count: 822
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: a.i7s0.invoke(java.lang.Object):java.lang.Object");
            }
        }, (byte) 20));
        final byte b2 = 1;
        this.m = maz.b(new yw9((fee) n0o0VarH.getValue(), new Function1(this) { // from class: a.i7s0
            public final /* synthetic */ rw b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:46:0x0162  */
            /* JADX WARN: Code duplicated, block: B:47:0x0165  */
            /* JADX WARN: Code duplicated, block: B:50:0x016c  */
            /* JADX WARN: Code duplicated, block: B:51:0x016e  */
            /* JADX WARN: Code duplicated, block: B:61:0x0203  */
            /* JADX WARN: Code duplicated, block: B:63:0x020b  */
            /* JADX WARN: Code duplicated, block: B:64:0x0236  */
            /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r11v16 java.lang.Object, still in use, count: 2, list:
                  (r11v16 java.lang.Object) from 0x015e: PHI (r11 I:??) = (r11v3 java.lang.Object), (r11v16 java.lang.Object) binds: [B:43:0x015d, B:94:0x015e] A[DONT_GENERATE, DONT_INLINE]
                  (r11v16 java.lang.Object) from 0x0156: CHECK_CAST (a.o2g0) (r11v16 java.lang.Object)
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
            public final java.lang.Object invoke(java.lang.Object r25) {
                /*
                    Method dump skipped, instruction units count: 822
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: a.i7s0.invoke(java.lang.Object):java.lang.Object");
            }
        }, (byte) 20));
    }

    public rw(yhr0 yhr0Var, ctf0 ctf0Var, ocl oclVar) {
        ctf0Var.getClass();
        this.b = ctf0Var;
        this.k = oclVar;
        n0o0 n0o0VarH = bkb.H(yhr0Var.f42652a);
        this.c = n0o0VarH;
        n0o0 n0o0VarH2 = bkb.H(yhr0Var.b);
        this.d = n0o0VarH2;
        this.e = bkb.H(yhr0Var.c);
        this.f = bkb.H(yhr0Var.d);
        this.g = bkb.H(Long.valueOf(yhr0Var.g));
        this.h = bkb.H(Long.valueOf(yhr0Var.h));
        this.i = bkb.H(yhr0Var.i);
        final byte b = 0;
        this.j = bkb.G(((fee) n0o0VarH.getValue()).d, new Function1(this) { // from class: a.bir0
            public final /* synthetic */ rw b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                gmm dmmVar;
                byte b2 = b;
                ihr0 ihr0Var = ihr0.f14795a;
                rw rwVar = this.b;
                switch (b2) {
                    case 0:
                        lhr0 lhr0Var = (lhr0) obj;
                        lhr0Var.getClass();
                        lmr0 lmr0Var = (lmr0) ((fee) rwVar.d.getValue()).c();
                        long jLongValue = ((Number) ((fee) rwVar.h.getValue()).c()).longValue();
                        ctf0 ctf0Var2 = rwVar.b;
                        lmr0Var.getClass();
                        ctf0Var2.getClass();
                        if (lhr0Var instanceof khr0) {
                            return wnr0.f39462a;
                        }
                        if ((lhr0Var instanceof jhr0) || lhr0Var.equals(ihr0Var)) {
                            return xnr0.f41183a;
                        }
                        if (!(lhr0Var instanceof hhr0)) {
                            t9f.b();
                            return null;
                        }
                        okr0 okr0Var = ((hhr0) lhr0Var).f13079a;
                        if (lmr0Var.c == ulr0.TOTO_1XTOTO) {
                            return new ynr0(o5n0.s(okr0Var, ctf0Var2), o5n0.p(okr0Var, ctf0Var2), o5n0.t(okr0Var, jLongValue, ctf0Var2));
                        }
                        String str = okr0Var.f;
                        String str2 = okr0Var.b;
                        List list = okr0Var.j;
                        String strN = ofm0.n(str, str2);
                        if (list.isEmpty()) {
                            strN = null;
                        }
                        String strN2 = "";
                        if (strN == null) {
                            strN = "";
                        }
                        String strS = o5n0.s(okr0Var, ctf0Var2);
                        String strP = o5n0.p(okr0Var, ctf0Var2);
                        rdj rdjVar = rdj.f30294a;
                        String strH = rdj.h(new znq0(okr0Var.g), ykq0.UNIQUE_1, Boolean.valueOf(ctf0Var2.h()), null, 216);
                        if (list.isEmpty()) {
                            strH = null;
                        }
                        if (strH == null) {
                            strH = "";
                        }
                        String strT = o5n0.t(okr0Var, jLongValue, ctf0Var2);
                        String str3 = okr0Var.e;
                        if (!list.isEmpty()) {
                            strN2 = str3.length() == 0 ? "-" : ofm0.n(str3, str2);
                        }
                        return new znr0(strN, strS, strP, strH, strT, strN2);
                    case 1:
                        lmr0 lmr0Var2 = (lmr0) obj;
                        lmr0Var2.getClass();
                        boolean z = !((Map) ((fee) rwVar.e.getValue()).c()).isEmpty();
                        StaticColors staticColors = StaticColors.INSTANCE;
                        ilm ilmVar = new ilm(staticColors.m123getWhite0d7_KjU());
                        ulr0 ulr0Var = lmr0Var2.c;
                        ulr0 ulr0Var2 = ulr0.NONE;
                        plm plmVar = new plm(lmr0Var2.b, ha50.TWO_LINES, staticColors.m123getWhite0d7_KjU(), ulr0Var != ulr0Var2 ? new ea50(staticColors.m123getWhite0d7_KjU()) : fa50.f9191a);
                        if (ulr0Var != ulr0Var2) {
                            long jM123getWhite0d7_KjU = staticColors.m123getWhite0d7_KjU();
                            ra50 ra50Var = ra50.f30118a;
                            dmmVar = new dmm(new va50(new wkm(0, R.drawable.ic_glyph_clear, z, ra50Var, jM123getWhite0d7_KjU), new wkm(1, R.drawable.ic_glyph_toto, true, ra50Var, staticColors.m123getWhite0d7_KjU())));
                        } else {
                            dmmVar = fmm.f9790a;
                        }
                        return new imm(ilmVar, plmVar, dmmVar, staticColors.m121getTransparent0d7_KjU(), false, null);
                    default:
                        lhr0 lhr0Var2 = (lhr0) obj;
                        lhr0Var2.getClass();
                        ulr0 ulr0Var3 = ((lmr0) ((fee) rwVar.d.getValue()).c()).c;
                        Map map = (Map) ((fee) rwVar.e.getValue()).c();
                        String str4 = (String) ((fee) rwVar.f.getValue()).c();
                        long jLongValue2 = ((Number) ((fee) rwVar.g.getValue()).c()).longValue();
                        ctf0 ctf0Var3 = rwVar.b;
                        ocl oclVar2 = (ocl) rwVar.k;
                        map.getClass();
                        str4.getClass();
                        ctf0Var3.getClass();
                        if (lhr0Var2.equals(jhr0.f16542a)) {
                            return gur0.f11944a;
                        }
                        if (lhr0Var2.equals(khr0.f18306a)) {
                            return hur0.f13695a;
                        }
                        if (lhr0Var2.equals(ihr0Var)) {
                            return new fur0(ocl.b(oclVar2, pb10.g, null, 0, 0, R.string.data_retrieval_error, R.string.try_again_text, jLongValue2, 0L, Response.SESSION_NOT_ACCEPTABLE));
                        }
                        if (!(lhr0Var2 instanceof hhr0)) {
                            t9f.b();
                            return null;
                        }
                        okr0 okr0Var2 = ((hhr0) lhr0Var2).f13079a;
                        if (okr0Var2.j.isEmpty()) {
                            return new eur0(ocl.b(oclVar2, pb10.g, null, 0, 0, R.string.empty_tirage, 0, 0L, 0L, 990));
                        }
                        List list2 = okr0Var2.j;
                        ArrayList arrayList = new ArrayList();
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            w3d.u(arrayList, ((hir0) it.next()).c);
                        }
                        return new dur0(jtm0.t(arrayList, ulr0Var3, map, ctf0Var3), str4, new smr0(w6x.n(map.size(), arrayList.size(), Separators.SLASH), map.size() == arrayList.size()));
                }
            }
        });
        final byte b2 = 1;
        this.l = bkb.G(((fee) n0o0VarH2.getValue()).d, new Function1(this) { // from class: a.bir0
            public final /* synthetic */ rw b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                gmm dmmVar;
                byte b3 = b2;
                ihr0 ihr0Var = ihr0.f14795a;
                rw rwVar = this.b;
                switch (b3) {
                    case 0:
                        lhr0 lhr0Var = (lhr0) obj;
                        lhr0Var.getClass();
                        lmr0 lmr0Var = (lmr0) ((fee) rwVar.d.getValue()).c();
                        long jLongValue = ((Number) ((fee) rwVar.h.getValue()).c()).longValue();
                        ctf0 ctf0Var2 = rwVar.b;
                        lmr0Var.getClass();
                        ctf0Var2.getClass();
                        if (lhr0Var instanceof khr0) {
                            return wnr0.f39462a;
                        }
                        if ((lhr0Var instanceof jhr0) || lhr0Var.equals(ihr0Var)) {
                            return xnr0.f41183a;
                        }
                        if (!(lhr0Var instanceof hhr0)) {
                            t9f.b();
                            return null;
                        }
                        okr0 okr0Var = ((hhr0) lhr0Var).f13079a;
                        if (lmr0Var.c == ulr0.TOTO_1XTOTO) {
                            return new ynr0(o5n0.s(okr0Var, ctf0Var2), o5n0.p(okr0Var, ctf0Var2), o5n0.t(okr0Var, jLongValue, ctf0Var2));
                        }
                        String str = okr0Var.f;
                        String str2 = okr0Var.b;
                        List list = okr0Var.j;
                        String strN = ofm0.n(str, str2);
                        if (list.isEmpty()) {
                            strN = null;
                        }
                        String strN2 = "";
                        if (strN == null) {
                            strN = "";
                        }
                        String strS = o5n0.s(okr0Var, ctf0Var2);
                        String strP = o5n0.p(okr0Var, ctf0Var2);
                        rdj rdjVar = rdj.f30294a;
                        String strH = rdj.h(new znq0(okr0Var.g), ykq0.UNIQUE_1, Boolean.valueOf(ctf0Var2.h()), null, 216);
                        if (list.isEmpty()) {
                            strH = null;
                        }
                        if (strH == null) {
                            strH = "";
                        }
                        String strT = o5n0.t(okr0Var, jLongValue, ctf0Var2);
                        String str3 = okr0Var.e;
                        if (!list.isEmpty()) {
                            strN2 = str3.length() == 0 ? "-" : ofm0.n(str3, str2);
                        }
                        return new znr0(strN, strS, strP, strH, strT, strN2);
                    case 1:
                        lmr0 lmr0Var2 = (lmr0) obj;
                        lmr0Var2.getClass();
                        boolean z = !((Map) ((fee) rwVar.e.getValue()).c()).isEmpty();
                        StaticColors staticColors = StaticColors.INSTANCE;
                        ilm ilmVar = new ilm(staticColors.m123getWhite0d7_KjU());
                        ulr0 ulr0Var = lmr0Var2.c;
                        ulr0 ulr0Var2 = ulr0.NONE;
                        plm plmVar = new plm(lmr0Var2.b, ha50.TWO_LINES, staticColors.m123getWhite0d7_KjU(), ulr0Var != ulr0Var2 ? new ea50(staticColors.m123getWhite0d7_KjU()) : fa50.f9191a);
                        if (ulr0Var != ulr0Var2) {
                            long jM123getWhite0d7_KjU = staticColors.m123getWhite0d7_KjU();
                            ra50 ra50Var = ra50.f30118a;
                            dmmVar = new dmm(new va50(new wkm(0, R.drawable.ic_glyph_clear, z, ra50Var, jM123getWhite0d7_KjU), new wkm(1, R.drawable.ic_glyph_toto, true, ra50Var, staticColors.m123getWhite0d7_KjU())));
                        } else {
                            dmmVar = fmm.f9790a;
                        }
                        return new imm(ilmVar, plmVar, dmmVar, staticColors.m121getTransparent0d7_KjU(), false, null);
                    default:
                        lhr0 lhr0Var2 = (lhr0) obj;
                        lhr0Var2.getClass();
                        ulr0 ulr0Var3 = ((lmr0) ((fee) rwVar.d.getValue()).c()).c;
                        Map map = (Map) ((fee) rwVar.e.getValue()).c();
                        String str4 = (String) ((fee) rwVar.f.getValue()).c();
                        long jLongValue2 = ((Number) ((fee) rwVar.g.getValue()).c()).longValue();
                        ctf0 ctf0Var3 = rwVar.b;
                        ocl oclVar2 = (ocl) rwVar.k;
                        map.getClass();
                        str4.getClass();
                        ctf0Var3.getClass();
                        if (lhr0Var2.equals(jhr0.f16542a)) {
                            return gur0.f11944a;
                        }
                        if (lhr0Var2.equals(khr0.f18306a)) {
                            return hur0.f13695a;
                        }
                        if (lhr0Var2.equals(ihr0Var)) {
                            return new fur0(ocl.b(oclVar2, pb10.g, null, 0, 0, R.string.data_retrieval_error, R.string.try_again_text, jLongValue2, 0L, Response.SESSION_NOT_ACCEPTABLE));
                        }
                        if (!(lhr0Var2 instanceof hhr0)) {
                            t9f.b();
                            return null;
                        }
                        okr0 okr0Var2 = ((hhr0) lhr0Var2).f13079a;
                        if (okr0Var2.j.isEmpty()) {
                            return new eur0(ocl.b(oclVar2, pb10.g, null, 0, 0, R.string.empty_tirage, 0, 0L, 0L, 990));
                        }
                        List list2 = okr0Var2.j;
                        ArrayList arrayList = new ArrayList();
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            w3d.u(arrayList, ((hir0) it.next()).c);
                        }
                        return new dur0(jtm0.t(arrayList, ulr0Var3, map, ctf0Var3), str4, new smr0(w6x.n(map.size(), arrayList.size(), Separators.SLASH), map.size() == arrayList.size()));
                }
            }
        });
        final byte b3 = 2;
        this.m = bkb.G(((fee) n0o0VarH.getValue()).d, new Function1(this) { // from class: a.bir0
            public final /* synthetic */ rw b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                gmm dmmVar;
                byte b4 = b3;
                ihr0 ihr0Var = ihr0.f14795a;
                rw rwVar = this.b;
                switch (b4) {
                    case 0:
                        lhr0 lhr0Var = (lhr0) obj;
                        lhr0Var.getClass();
                        lmr0 lmr0Var = (lmr0) ((fee) rwVar.d.getValue()).c();
                        long jLongValue = ((Number) ((fee) rwVar.h.getValue()).c()).longValue();
                        ctf0 ctf0Var2 = rwVar.b;
                        lmr0Var.getClass();
                        ctf0Var2.getClass();
                        if (lhr0Var instanceof khr0) {
                            return wnr0.f39462a;
                        }
                        if ((lhr0Var instanceof jhr0) || lhr0Var.equals(ihr0Var)) {
                            return xnr0.f41183a;
                        }
                        if (!(lhr0Var instanceof hhr0)) {
                            t9f.b();
                            return null;
                        }
                        okr0 okr0Var = ((hhr0) lhr0Var).f13079a;
                        if (lmr0Var.c == ulr0.TOTO_1XTOTO) {
                            return new ynr0(o5n0.s(okr0Var, ctf0Var2), o5n0.p(okr0Var, ctf0Var2), o5n0.t(okr0Var, jLongValue, ctf0Var2));
                        }
                        String str = okr0Var.f;
                        String str2 = okr0Var.b;
                        List list = okr0Var.j;
                        String strN = ofm0.n(str, str2);
                        if (list.isEmpty()) {
                            strN = null;
                        }
                        String strN2 = "";
                        if (strN == null) {
                            strN = "";
                        }
                        String strS = o5n0.s(okr0Var, ctf0Var2);
                        String strP = o5n0.p(okr0Var, ctf0Var2);
                        rdj rdjVar = rdj.f30294a;
                        String strH = rdj.h(new znq0(okr0Var.g), ykq0.UNIQUE_1, Boolean.valueOf(ctf0Var2.h()), null, 216);
                        if (list.isEmpty()) {
                            strH = null;
                        }
                        if (strH == null) {
                            strH = "";
                        }
                        String strT = o5n0.t(okr0Var, jLongValue, ctf0Var2);
                        String str3 = okr0Var.e;
                        if (!list.isEmpty()) {
                            strN2 = str3.length() == 0 ? "-" : ofm0.n(str3, str2);
                        }
                        return new znr0(strN, strS, strP, strH, strT, strN2);
                    case 1:
                        lmr0 lmr0Var2 = (lmr0) obj;
                        lmr0Var2.getClass();
                        boolean z = !((Map) ((fee) rwVar.e.getValue()).c()).isEmpty();
                        StaticColors staticColors = StaticColors.INSTANCE;
                        ilm ilmVar = new ilm(staticColors.m123getWhite0d7_KjU());
                        ulr0 ulr0Var = lmr0Var2.c;
                        ulr0 ulr0Var2 = ulr0.NONE;
                        plm plmVar = new plm(lmr0Var2.b, ha50.TWO_LINES, staticColors.m123getWhite0d7_KjU(), ulr0Var != ulr0Var2 ? new ea50(staticColors.m123getWhite0d7_KjU()) : fa50.f9191a);
                        if (ulr0Var != ulr0Var2) {
                            long jM123getWhite0d7_KjU = staticColors.m123getWhite0d7_KjU();
                            ra50 ra50Var = ra50.f30118a;
                            dmmVar = new dmm(new va50(new wkm(0, R.drawable.ic_glyph_clear, z, ra50Var, jM123getWhite0d7_KjU), new wkm(1, R.drawable.ic_glyph_toto, true, ra50Var, staticColors.m123getWhite0d7_KjU())));
                        } else {
                            dmmVar = fmm.f9790a;
                        }
                        return new imm(ilmVar, plmVar, dmmVar, staticColors.m121getTransparent0d7_KjU(), false, null);
                    default:
                        lhr0 lhr0Var2 = (lhr0) obj;
                        lhr0Var2.getClass();
                        ulr0 ulr0Var3 = ((lmr0) ((fee) rwVar.d.getValue()).c()).c;
                        Map map = (Map) ((fee) rwVar.e.getValue()).c();
                        String str4 = (String) ((fee) rwVar.f.getValue()).c();
                        long jLongValue2 = ((Number) ((fee) rwVar.g.getValue()).c()).longValue();
                        ctf0 ctf0Var3 = rwVar.b;
                        ocl oclVar2 = (ocl) rwVar.k;
                        map.getClass();
                        str4.getClass();
                        ctf0Var3.getClass();
                        if (lhr0Var2.equals(jhr0.f16542a)) {
                            return gur0.f11944a;
                        }
                        if (lhr0Var2.equals(khr0.f18306a)) {
                            return hur0.f13695a;
                        }
                        if (lhr0Var2.equals(ihr0Var)) {
                            return new fur0(ocl.b(oclVar2, pb10.g, null, 0, 0, R.string.data_retrieval_error, R.string.try_again_text, jLongValue2, 0L, Response.SESSION_NOT_ACCEPTABLE));
                        }
                        if (!(lhr0Var2 instanceof hhr0)) {
                            t9f.b();
                            return null;
                        }
                        okr0 okr0Var2 = ((hhr0) lhr0Var2).f13079a;
                        if (okr0Var2.j.isEmpty()) {
                            return new eur0(ocl.b(oclVar2, pb10.g, null, 0, 0, R.string.empty_tirage, 0, 0L, 0L, 990));
                        }
                        List list2 = okr0Var2.j;
                        ArrayList arrayList = new ArrayList();
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            w3d.u(arrayList, ((hir0) it.next()).c);
                        }
                        return new dur0(jtm0.t(arrayList, ulr0Var3, map, ctf0Var3), str4, new smr0(w6x.n(map.size(), arrayList.size(), Separators.SLASH), map.size() == arrayList.size()));
                }
            }
        });
    }

    public rw(dz1 dz1Var, ctf0 ctf0Var, Locale locale, g2v g2vVar, sff0 sff0Var) {
        Object obj;
        final byte b = 1;
        ctf0Var.getClass();
        this.b = ctf0Var;
        this.k = locale;
        this.l = g2vVar;
        this.c = bkb.H(dz1Var.f6918a);
        this.d = bkb.H(Boolean.valueOf(dz1Var.c));
        boolean z = dz1Var.e;
        this.e = bkb.H(Boolean.valueOf(z));
        this.f = bkb.H(dz1Var.f);
        this.g = bkb.H(Boolean.valueOf(dz1Var.g));
        int iOrdinal = sff0Var.b.w.ordinal();
        if (iOrdinal == 0) {
            obj = hy1.f13840a;
        } else if (iOrdinal == 1) {
            obj = gy1.f12104a;
        } else if (iOrdinal == 2) {
            obj = iy1.f15567a;
        } else {
            if (iOrdinal != 3) {
                t9f.b();
                throw null;
            }
            obj = jy1.f17337a;
        }
        this.m = obj;
        this.h = maz.b(new yw9(dz1Var.h, new dj1(this), (byte) 20));
        final byte b2 = 0;
        this.i = maz.b(new yw9(Boolean.valueOf(z), new Function1(this) { // from class: a.jz1
            public final /* synthetic */ rw b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:42:0x01d3  */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                String strA;
                String strC;
                my1 my1Var;
                char c;
                oy1 oy1Var;
                oy1 oy1Var2;
                int i;
                String strA2;
                byte b3 = b2;
                int i2 = 0;
                rw rwVar = this.b;
                switch (b3) {
                    case 0:
                        n0o0 n0o0Var = rwVar.h;
                        ctf0 ctf0Var2 = rwVar.b;
                        if (!((Boolean) obj2).booleanValue()) {
                            return new xa0(ctf0Var2.b.a(R.string.button_login, Arrays.copyOf(new Object[0], 0)), ctf0Var2.b.a(R.string.registration, Arrays.copyOf(new Object[0], 0)));
                        }
                        ql5 ql5Var = (ql5) ((fee) rwVar.f.getValue()).c();
                        if (ql5Var != null) {
                            strA = ql5Var.j;
                            if (((kg) ((fee) n0o0Var.getValue()).c()) == kg.SECONDARY) {
                                strA = ctf0Var2.b.a(R.string.all_balances, Arrays.copyOf(new Object[0], 0));
                            } else if (strA.length() <= 0) {
                                strA = ql5Var.k;
                            }
                        } else {
                            strA = null;
                        }
                        String str = strA == null ? "" : strA;
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
                        pz40 pz40Var = s6t0.f31722a;
                        return new wa0((ijl) ((fee) n0o0Var.getValue()).b(), new jjl(str2, str4, strA3, str, new y3d(StaticColors.INSTANCE.m121getTransparent0d7_KjU())));
                    default:
                        g2v g2vVar2 = (g2v) rwVar.l;
                        bie bieVar = (bie) obj2;
                        bieVar.getClass();
                        if (bieVar instanceof xhe) {
                            lc00 lc00VarB = kotlin.collections.a.b();
                            while (i2 < 3) {
                                lc00VarB.add(qy1.f29512a);
                                i2++;
                            }
                            return new cbs0(dyb.r0(kotlin.collections.a.a(lc00VarB)));
                        }
                        if (!(bieVar instanceof vge)) {
                            return new bbs0(g2v.b(g2vVar2, pb10.g, null, null, 0, 0, R.string.data_retrieval_error, 0, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE));
                        }
                        a4x a4xVar = ((vge) bieVar).f37377a;
                        if (a4xVar.isEmpty()) {
                            return new bbs0(g2v.b(g2vVar2, pb10.i, null, null, 0, 0, R.string.tournaments_placeholder, 0, 0, 0L, 0L, 990));
                        }
                        ArrayList arrayList = new ArrayList(r3d.q(a4xVar, 10));
                        Iterator it = a4xVar.iterator();
                        while (it.hasNext()) {
                            myr0 myr0Var = (myr0) it.next();
                            ky1 ky1Var = (ky1) rwVar.m;
                            ctf0 ctf0Var3 = rwVar.b;
                            Locale locale2 = (Locale) rwVar.k;
                            myr0Var.getClass();
                            kyr0 kyr0Var = myr0Var.d;
                            ky1Var.getClass();
                            ctf0Var3.getClass();
                            lyr0 lyr0Var = myr0Var.c;
                            hyr0 hyr0Var = myr0Var.f;
                            Date date = hyr0Var.e;
                            Date date2 = hyr0Var.d;
                            if (kyr0Var.equals(pek0.e)) {
                                my1Var = new my1(ctf0Var3.b.a(R.string.tournament_status_waiting, Arrays.copyOf(new Object[i2], i2)), ly1.f20843a);
                            } else {
                                if (!kyr0Var.equals(jdk0.e)) {
                                    if (kyr0Var.equals(jyr0.f17375a)) {
                                        my1Var = new my1(ctf0Var3.b.a(R.string.tournament_status_finished, Arrays.copyOf(new Object[0], 0)), ly1.c);
                                    } else {
                                        t9f.b();
                                    }
                                    return null;
                                }
                                my1Var = new my1(ctf0Var3.b.a(R.string.tournament_status_active, Arrays.copyOf(new Object[0], 0)), ly1.b);
                            }
                            boolean z2 = kyr0Var instanceof jyr0;
                            Iterator it2 = it;
                            long j = myr0Var.f22617a;
                            List list = u0d.f34849a;
                            String strQ = u0d.q(myr0Var.e.c);
                            String str5 = hyr0Var.g;
                            String str6 = hyr0Var.h;
                            String str7 = hyr0Var.f13873a;
                            String strB = rwVar.b(locale2, hyr0Var);
                            String strA4 = rwVar.a(lyr0Var, locale2, hyr0Var);
                            String strB2 = rwVar.b(locale2, hyr0Var);
                            String strA5 = rwVar.a(lyr0Var, locale2, hyr0Var);
                            String strL = by7.c().f3402a ? kng0.l(strA5, " - ", strB2) : kng0.l(strB2, " - ", strA5);
                            fyr0 fyr0Var = hyr0Var.l;
                            String str8 = fyr0Var.e;
                            Date date3 = fyr0Var.c;
                            long jLongValue = fyr0Var.d.longValue();
                            String str9 = strL;
                            lsm0 lsm0Var = ctf0Var3.b;
                            kdm kdmVar = new kdm(str8, date3, jLongValue, new mnl(lsm0Var.a(R.string.day_short, Arrays.copyOf(new Object[0], 0)), lsm0Var.a(R.string.hour_short, Arrays.copyOf(new Object[0], 0)), lsm0Var.a(R.string.minute_short, Arrays.copyOf(new Object[0], 0)), lsm0Var.a(R.string.second_short, Arrays.copyOf(new Object[0], 0))));
                            rdj rdjVar = rdj.f30294a;
                            wjo wjoVar = wjo.AGGREGATOR_TOURNAMENTS_DATE_DAY;
                            String strE = rdj.e(wjoVar, date2, locale2);
                            wjo wjoVar2 = wjo.AGGREGATOR_TOURNAMENTS_DATE_MONTH;
                            String strE2 = rdj.e(wjoVar2, date2, locale2);
                            String strE3 = rdj.e(wjoVar, date, locale2);
                            String strE4 = rdj.e(wjoVar2, date, locale2);
                            UserActionButtonModel userActionButtonModel = myr0Var.i;
                            gqt0 gqt0Var = userActionButtonModel.b;
                            String str10 = userActionButtonModel.f46270a;
                            int iOrdinal2 = gqt0Var.ordinal();
                            if (iOrdinal2 == 0) {
                                c = 3;
                                oy1Var = new oy1(str10, cy1.f5151a);
                                oy1Var2 = oy1Var;
                            } else {
                                if (iOrdinal2 == 1) {
                                    c = 3;
                                    oy1Var = new oy1(str10, cy1.b);
                                } else if (iOrdinal2 != 2) {
                                    c = 3;
                                    if (iOrdinal2 != 3) {
                                        oy1Var2 = z2 ? new oy1(lsm0Var.a(R.string.results, Arrays.copyOf(new Object[0], 0)), cy1.f5151a) : null;
                                    } else {
                                        oy1Var = new oy1(str10, cy1.c);
                                    }
                                } else {
                                    c = 3;
                                    oy1Var = new oy1(str10, cy1.f5151a);
                                }
                                oy1Var2 = oy1Var;
                            }
                            UserActionButtonModel userActionButtonModel2 = myr0Var.k;
                            fy1 fy1Var = new fy1(oy1Var2, fqt0.f9991a[userActionButtonModel2.b.ordinal()] == 1 ? userActionButtonModel2.f46270a : null);
                            if (lyr0Var.equals(rek0.f)) {
                                strA2 = null;
                                i = 0;
                            } else {
                                if (!lyr0Var.equals(qek0.f)) {
                                    t9f.b();
                                    return null;
                                }
                                i = 0;
                                strA2 = lsm0Var.a(R.string.tournament_with_steps, Arrays.copyOf(new Object[0], 0));
                            }
                            arrayList.add(new py1(ky1Var, j, strQ, str5, lsm0Var.a(R.string.dates, Arrays.copyOf(new Object[i], i)), str6, str7, strB, strA4, str9, str8, kdmVar, strE, strE2, strE3, strE4, fy1Var, new ny1(my1Var, strA2)));
                            it = it2;
                            i2 = 0;
                        }
                        return new abs0(dyb.r0(arrayList));
                }
            }
        }, (byte) 20));
        this.j = maz.b(new yw9(dz1Var.l, new Function1(this) { // from class: a.jz1
            public final /* synthetic */ rw b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:42:0x01d3  */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                String strA;
                String strC;
                my1 my1Var;
                char c;
                oy1 oy1Var;
                oy1 oy1Var2;
                int i;
                String strA2;
                byte b3 = b;
                int i2 = 0;
                rw rwVar = this.b;
                switch (b3) {
                    case 0:
                        n0o0 n0o0Var = rwVar.h;
                        ctf0 ctf0Var2 = rwVar.b;
                        if (!((Boolean) obj2).booleanValue()) {
                            return new xa0(ctf0Var2.b.a(R.string.button_login, Arrays.copyOf(new Object[0], 0)), ctf0Var2.b.a(R.string.registration, Arrays.copyOf(new Object[0], 0)));
                        }
                        ql5 ql5Var = (ql5) ((fee) rwVar.f.getValue()).c();
                        if (ql5Var != null) {
                            strA = ql5Var.j;
                            if (((kg) ((fee) n0o0Var.getValue()).c()) == kg.SECONDARY) {
                                strA = ctf0Var2.b.a(R.string.all_balances, Arrays.copyOf(new Object[0], 0));
                            } else if (strA.length() <= 0) {
                                strA = ql5Var.k;
                            }
                        } else {
                            strA = null;
                        }
                        String str = strA == null ? "" : strA;
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
                        pz40 pz40Var = s6t0.f31722a;
                        return new wa0((ijl) ((fee) n0o0Var.getValue()).b(), new jjl(str2, str4, strA3, str, new y3d(StaticColors.INSTANCE.m121getTransparent0d7_KjU())));
                    default:
                        g2v g2vVar2 = (g2v) rwVar.l;
                        bie bieVar = (bie) obj2;
                        bieVar.getClass();
                        if (bieVar instanceof xhe) {
                            lc00 lc00VarB = kotlin.collections.a.b();
                            while (i2 < 3) {
                                lc00VarB.add(qy1.f29512a);
                                i2++;
                            }
                            return new cbs0(dyb.r0(kotlin.collections.a.a(lc00VarB)));
                        }
                        if (!(bieVar instanceof vge)) {
                            return new bbs0(g2v.b(g2vVar2, pb10.g, null, null, 0, 0, R.string.data_retrieval_error, 0, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE));
                        }
                        a4x a4xVar = ((vge) bieVar).f37377a;
                        if (a4xVar.isEmpty()) {
                            return new bbs0(g2v.b(g2vVar2, pb10.i, null, null, 0, 0, R.string.tournaments_placeholder, 0, 0, 0L, 0L, 990));
                        }
                        ArrayList arrayList = new ArrayList(r3d.q(a4xVar, 10));
                        Iterator it = a4xVar.iterator();
                        while (it.hasNext()) {
                            myr0 myr0Var = (myr0) it.next();
                            ky1 ky1Var = (ky1) rwVar.m;
                            ctf0 ctf0Var3 = rwVar.b;
                            Locale locale2 = (Locale) rwVar.k;
                            myr0Var.getClass();
                            kyr0 kyr0Var = myr0Var.d;
                            ky1Var.getClass();
                            ctf0Var3.getClass();
                            lyr0 lyr0Var = myr0Var.c;
                            hyr0 hyr0Var = myr0Var.f;
                            Date date = hyr0Var.e;
                            Date date2 = hyr0Var.d;
                            if (kyr0Var.equals(pek0.e)) {
                                my1Var = new my1(ctf0Var3.b.a(R.string.tournament_status_waiting, Arrays.copyOf(new Object[i2], i2)), ly1.f20843a);
                            } else {
                                if (!kyr0Var.equals(jdk0.e)) {
                                    if (kyr0Var.equals(jyr0.f17375a)) {
                                        my1Var = new my1(ctf0Var3.b.a(R.string.tournament_status_finished, Arrays.copyOf(new Object[0], 0)), ly1.c);
                                    } else {
                                        t9f.b();
                                    }
                                    return null;
                                }
                                my1Var = new my1(ctf0Var3.b.a(R.string.tournament_status_active, Arrays.copyOf(new Object[0], 0)), ly1.b);
                            }
                            boolean z2 = kyr0Var instanceof jyr0;
                            Iterator it2 = it;
                            long j = myr0Var.f22617a;
                            List list = u0d.f34849a;
                            String strQ = u0d.q(myr0Var.e.c);
                            String str5 = hyr0Var.g;
                            String str6 = hyr0Var.h;
                            String str7 = hyr0Var.f13873a;
                            String strB = rwVar.b(locale2, hyr0Var);
                            String strA4 = rwVar.a(lyr0Var, locale2, hyr0Var);
                            String strB2 = rwVar.b(locale2, hyr0Var);
                            String strA5 = rwVar.a(lyr0Var, locale2, hyr0Var);
                            String strL = by7.c().f3402a ? kng0.l(strA5, " - ", strB2) : kng0.l(strB2, " - ", strA5);
                            fyr0 fyr0Var = hyr0Var.l;
                            String str8 = fyr0Var.e;
                            Date date3 = fyr0Var.c;
                            long jLongValue = fyr0Var.d.longValue();
                            String str9 = strL;
                            lsm0 lsm0Var = ctf0Var3.b;
                            kdm kdmVar = new kdm(str8, date3, jLongValue, new mnl(lsm0Var.a(R.string.day_short, Arrays.copyOf(new Object[0], 0)), lsm0Var.a(R.string.hour_short, Arrays.copyOf(new Object[0], 0)), lsm0Var.a(R.string.minute_short, Arrays.copyOf(new Object[0], 0)), lsm0Var.a(R.string.second_short, Arrays.copyOf(new Object[0], 0))));
                            rdj rdjVar = rdj.f30294a;
                            wjo wjoVar = wjo.AGGREGATOR_TOURNAMENTS_DATE_DAY;
                            String strE = rdj.e(wjoVar, date2, locale2);
                            wjo wjoVar2 = wjo.AGGREGATOR_TOURNAMENTS_DATE_MONTH;
                            String strE2 = rdj.e(wjoVar2, date2, locale2);
                            String strE3 = rdj.e(wjoVar, date, locale2);
                            String strE4 = rdj.e(wjoVar2, date, locale2);
                            UserActionButtonModel userActionButtonModel = myr0Var.i;
                            gqt0 gqt0Var = userActionButtonModel.b;
                            String str10 = userActionButtonModel.f46270a;
                            int iOrdinal2 = gqt0Var.ordinal();
                            if (iOrdinal2 == 0) {
                                c = 3;
                                oy1Var = new oy1(str10, cy1.f5151a);
                                oy1Var2 = oy1Var;
                            } else {
                                if (iOrdinal2 == 1) {
                                    c = 3;
                                    oy1Var = new oy1(str10, cy1.b);
                                } else if (iOrdinal2 != 2) {
                                    c = 3;
                                    if (iOrdinal2 != 3) {
                                        oy1Var2 = z2 ? new oy1(lsm0Var.a(R.string.results, Arrays.copyOf(new Object[0], 0)), cy1.f5151a) : null;
                                    } else {
                                        oy1Var = new oy1(str10, cy1.c);
                                    }
                                } else {
                                    c = 3;
                                    oy1Var = new oy1(str10, cy1.f5151a);
                                }
                                oy1Var2 = oy1Var;
                            }
                            UserActionButtonModel userActionButtonModel2 = myr0Var.k;
                            fy1 fy1Var = new fy1(oy1Var2, fqt0.f9991a[userActionButtonModel2.b.ordinal()] == 1 ? userActionButtonModel2.f46270a : null);
                            if (lyr0Var.equals(rek0.f)) {
                                strA2 = null;
                                i = 0;
                            } else {
                                if (!lyr0Var.equals(qek0.f)) {
                                    t9f.b();
                                    return null;
                                }
                                i = 0;
                                strA2 = lsm0Var.a(R.string.tournament_with_steps, Arrays.copyOf(new Object[0], 0));
                            }
                            arrayList.add(new py1(ky1Var, j, strQ, str5, lsm0Var.a(R.string.dates, Arrays.copyOf(new Object[i], i)), str6, str7, strB, strA4, str9, str8, kdmVar, strE, strE2, strE3, strE4, fy1Var, new ny1(my1Var, strA2)));
                            it = it2;
                            i2 = 0;
                        }
                        return new abs0(dyb.r0(arrayList));
                }
            }
        }, (byte) 20));
    }
}
