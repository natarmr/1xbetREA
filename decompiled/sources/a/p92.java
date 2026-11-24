package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.special_event.impl.main.presentation.model.SpecialEventTabs;
import org.xplatform.special_event.impl.special_event_tab.presentation.model.SpecialEventTab;
import org.xplatform.special_event.impl.special_event_tab.presentation.model.SpecialEventTabScreenParams;

/* JADX INFO: loaded from: classes5.dex */
public final class p92 implements v6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f26587a = 0;
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

    public p92(p650 p650Var, ctf0 ctf0Var) {
        final byte b = 1;
        ctf0Var.getClass();
        this.b = ctf0Var;
        mi0 mi0Var = p650Var.f26438a;
        this.c = maz.b(new yw9(mi0Var, new da40((byte) 20), (byte) 20));
        n0o0 n0o0VarH = bkb.H(Boolean.valueOf(p650Var.n));
        this.d = n0o0VarH;
        this.e = maz.b(new yw9(p650Var.e, new da40((byte) 21), (byte) 20));
        final byte b2 = 0;
        this.f = maz.b(new yw9(p650Var.b, new Function1(this) { // from class: a.w650
            public final /* synthetic */ p92 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                String strA;
                String strC;
                byte b3 = b2;
                p92 p92Var = this.b;
                switch (b3) {
                    case 0:
                        h650 h650Var = (h650) obj;
                        h650Var.getClass();
                        return ((Boolean) ((fee) p92Var.c.getValue()).b()).booleanValue() ? new jq5() : x2x.n0(h650Var);
                    case 1:
                        mi0 mi0Var2 = (mi0) obj;
                        mi0Var2.getClass();
                        ctf0 ctf0Var2 = p92Var.b;
                        ctf0Var2.getClass();
                        Integer numValueOf = mi0Var2 == mi0.MY_AGGREGATOR ? Integer.valueOf(R.string.my_casino) : null;
                        String strA2 = ctf0Var2.b.a(numValueOf != null ? numValueOf.intValue() : R.string.my_virtual, Arrays.copyOf(new Object[0], 0));
                        pz40 pz40Var = s6t0.f31722a;
                        return new imm(new ilm(s6t0.b().f33626a.getSecondary()), new plm(strA2, s6t0.b().f33626a.getSecondary(), fa50.f9191a), new dmm(new ta50(new wkm(0, R.drawable.ic_glyph_search, true, ra50.f30118a, s6t0.b().f33626a.getSecondary()))), s6t0.b().f33626a.getBackgroundContent(), false, null);
                    default:
                        ctf0 ctf0Var3 = p92Var.b;
                        if (!((Boolean) obj).booleanValue()) {
                            ctf0Var3.getClass();
                            lsm0 lsm0Var = ctf0Var3.b;
                            return new y250(lsm0Var.a(R.string.button_login, Arrays.copyOf(new Object[0], 0)), lsm0Var.a(R.string.registration, Arrays.copyOf(new Object[0], 0)));
                        }
                        ql5 ql5Var = (ql5) ((fee) p92Var.k.getValue()).c();
                        ijl ijlVar = (ijl) ((fee) p92Var.e.getValue()).b();
                        ijlVar.getClass();
                        ctf0Var3.getClass();
                        if (ql5Var == null) {
                            strA = "";
                        } else {
                            strA = ql5Var.j;
                            if (ijlVar == ijl.b) {
                                strA = ctf0Var3.b.a(R.string.all_balances, Arrays.copyOf(new Object[0], 0));
                            } else if (strA.length() <= 0) {
                                strA = ql5Var.k;
                            }
                        }
                        if (ql5Var != null) {
                            double d = ql5Var.b;
                            pn40 pn40Var = pn40.f27267a;
                            strC = pn40.c(d, p3u0.c);
                        } else {
                            strC = null;
                        }
                        if (strC == null) {
                            strC = "";
                        }
                        String str = ql5Var != null ? ql5Var.f : null;
                        return new x250(ijlVar, new jjl(strC, str != null ? str : "", ctf0Var3.b.a(R.string.top_up, Arrays.copyOf(new Object[0], 0)), strA));
                }
            }
        }, (byte) 20));
        this.g = maz.b(new yw9(p650Var.c, new da40((byte) 22), (byte) 20));
        this.h = maz.b(new yw9(p650Var.d, new da40((byte) 23), (byte) 20));
        this.i = bkb.H(p650Var.i);
        this.j = maz.b(new yw9(mi0Var, new Function1(this) { // from class: a.w650
            public final /* synthetic */ p92 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                String strA;
                String strC;
                byte b3 = b;
                p92 p92Var = this.b;
                switch (b3) {
                    case 0:
                        h650 h650Var = (h650) obj;
                        h650Var.getClass();
                        return ((Boolean) ((fee) p92Var.c.getValue()).b()).booleanValue() ? new jq5() : x2x.n0(h650Var);
                    case 1:
                        mi0 mi0Var2 = (mi0) obj;
                        mi0Var2.getClass();
                        ctf0 ctf0Var2 = p92Var.b;
                        ctf0Var2.getClass();
                        Integer numValueOf = mi0Var2 == mi0.MY_AGGREGATOR ? Integer.valueOf(R.string.my_casino) : null;
                        String strA2 = ctf0Var2.b.a(numValueOf != null ? numValueOf.intValue() : R.string.my_virtual, Arrays.copyOf(new Object[0], 0));
                        pz40 pz40Var = s6t0.f31722a;
                        return new imm(new ilm(s6t0.b().f33626a.getSecondary()), new plm(strA2, s6t0.b().f33626a.getSecondary(), fa50.f9191a), new dmm(new ta50(new wkm(0, R.drawable.ic_glyph_search, true, ra50.f30118a, s6t0.b().f33626a.getSecondary()))), s6t0.b().f33626a.getBackgroundContent(), false, null);
                    default:
                        ctf0 ctf0Var3 = p92Var.b;
                        if (!((Boolean) obj).booleanValue()) {
                            ctf0Var3.getClass();
                            lsm0 lsm0Var = ctf0Var3.b;
                            return new y250(lsm0Var.a(R.string.button_login, Arrays.copyOf(new Object[0], 0)), lsm0Var.a(R.string.registration, Arrays.copyOf(new Object[0], 0)));
                        }
                        ql5 ql5Var = (ql5) ((fee) p92Var.k.getValue()).c();
                        ijl ijlVar = (ijl) ((fee) p92Var.e.getValue()).b();
                        ijlVar.getClass();
                        ctf0Var3.getClass();
                        if (ql5Var == null) {
                            strA = "";
                        } else {
                            strA = ql5Var.j;
                            if (ijlVar == ijl.b) {
                                strA = ctf0Var3.b.a(R.string.all_balances, Arrays.copyOf(new Object[0], 0));
                            } else if (strA.length() <= 0) {
                                strA = ql5Var.k;
                            }
                        }
                        if (ql5Var != null) {
                            double d = ql5Var.b;
                            pn40 pn40Var = pn40.f27267a;
                            strC = pn40.c(d, p3u0.c);
                        } else {
                            strC = null;
                        }
                        if (strC == null) {
                            strC = "";
                        }
                        String str = ql5Var != null ? ql5Var.f : null;
                        return new x250(ijlVar, new jjl(strC, str != null ? str : "", ctf0Var3.b.a(R.string.top_up, Arrays.copyOf(new Object[0], 0)), strA));
                }
            }
        }, (byte) 20));
        this.k = bkb.H(p650Var.g);
        Object objC = ((fee) n0o0VarH.getValue()).c();
        final byte b3 = 2;
        this.l = maz.b(new yw9(objC, new Function1(this) { // from class: a.w650
            public final /* synthetic */ p92 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                String strA;
                String strC;
                byte b4 = b3;
                p92 p92Var = this.b;
                switch (b4) {
                    case 0:
                        h650 h650Var = (h650) obj;
                        h650Var.getClass();
                        return ((Boolean) ((fee) p92Var.c.getValue()).b()).booleanValue() ? new jq5() : x2x.n0(h650Var);
                    case 1:
                        mi0 mi0Var2 = (mi0) obj;
                        mi0Var2.getClass();
                        ctf0 ctf0Var2 = p92Var.b;
                        ctf0Var2.getClass();
                        Integer numValueOf = mi0Var2 == mi0.MY_AGGREGATOR ? Integer.valueOf(R.string.my_casino) : null;
                        String strA2 = ctf0Var2.b.a(numValueOf != null ? numValueOf.intValue() : R.string.my_virtual, Arrays.copyOf(new Object[0], 0));
                        pz40 pz40Var = s6t0.f31722a;
                        return new imm(new ilm(s6t0.b().f33626a.getSecondary()), new plm(strA2, s6t0.b().f33626a.getSecondary(), fa50.f9191a), new dmm(new ta50(new wkm(0, R.drawable.ic_glyph_search, true, ra50.f30118a, s6t0.b().f33626a.getSecondary()))), s6t0.b().f33626a.getBackgroundContent(), false, null);
                    default:
                        ctf0 ctf0Var3 = p92Var.b;
                        if (!((Boolean) obj).booleanValue()) {
                            ctf0Var3.getClass();
                            lsm0 lsm0Var = ctf0Var3.b;
                            return new y250(lsm0Var.a(R.string.button_login, Arrays.copyOf(new Object[0], 0)), lsm0Var.a(R.string.registration, Arrays.copyOf(new Object[0], 0)));
                        }
                        ql5 ql5Var = (ql5) ((fee) p92Var.k.getValue()).c();
                        ijl ijlVar = (ijl) ((fee) p92Var.e.getValue()).b();
                        ijlVar.getClass();
                        ctf0Var3.getClass();
                        if (ql5Var == null) {
                            strA = "";
                        } else {
                            strA = ql5Var.j;
                            if (ijlVar == ijl.b) {
                                strA = ctf0Var3.b.a(R.string.all_balances, Arrays.copyOf(new Object[0], 0));
                            } else if (strA.length() <= 0) {
                                strA = ql5Var.k;
                            }
                        }
                        if (ql5Var != null) {
                            double d = ql5Var.b;
                            pn40 pn40Var = pn40.f27267a;
                            strC = pn40.c(d, p3u0.c);
                        } else {
                            strC = null;
                        }
                        if (strC == null) {
                            strC = "";
                        }
                        String str = ql5Var != null ? ql5Var.f : null;
                        return new x250(ijlVar, new jjl(strC, str != null ? str : "", ctf0Var3.b.a(R.string.top_up, Arrays.copyOf(new Object[0], 0)), strA));
                }
            }
        }, (byte) 20));
        n0o0 n0o0VarH2 = bkb.H(p650Var.h);
        this.m = n0o0VarH2;
        this.n = maz.b(new yw9(((fee) n0o0VarH2.getValue()).c(), new rw40(this, p650Var, (byte) 4), (byte) 20));
    }

    @Override // a.v6t0
    public final Object invoke(Object obj) {
        byte b = this.f26587a;
        n0o0 n0o0Var = this.d;
        n0o0 n0o0Var2 = this.c;
        n0o0 n0o0Var3 = this.m;
        n0o0 n0o0Var4 = this.n;
        n0o0 n0o0Var5 = this.l;
        n0o0 n0o0Var6 = this.k;
        n0o0 n0o0Var7 = this.g;
        n0o0 n0o0Var8 = this.j;
        n0o0 n0o0Var9 = this.i;
        n0o0 n0o0Var10 = this.h;
        n0o0 n0o0Var11 = this.f;
        n0o0 n0o0Var12 = this.e;
        switch (b) {
            case 0:
                d92 d92Var = (d92) obj;
                d92Var.getClass();
                ((fee) n0o0Var6.getValue()).d(d92Var.j);
                ((fee) n0o0Var12.getValue()).d(d92Var.f);
                ((fee) n0o0Var.getValue()).d(d92Var.f5678a);
                ((fee) n0o0Var2.getValue()).d(d92Var.b);
                ((fee) n0o0Var11.getValue()).d(d92Var.d);
                ((fee) n0o0Var7.getValue()).d(Boolean.valueOf(d92Var.e));
                ((fee) n0o0Var8.getValue()).d(d92Var.g);
                ((fee) n0o0Var10.getValue()).d(new ynq0(d92Var.i));
                ((fee) n0o0Var3.getValue()).d(d92Var.c);
                return new f92((e92) ((fee) n0o0Var.getValue()).c(), (z82) ((fee) n0o0Var9.getValue()).b(), (y72) ((fee) n0o0Var5.getValue()).b(), (hyl) ((fee) n0o0Var4.getValue()).b(), (q4i0) ((fee) n0o0Var3.getValue()).b(), d92Var.k);
            case 1:
                p650 p650Var = (p650) obj;
                p650Var.getClass();
                fee feeVar = (fee) n0o0Var.getValue();
                boolean z = p650Var.n;
                feeVar.d(Boolean.valueOf(z));
                fee feeVar2 = (fee) n0o0Var2.getValue();
                mi0 mi0Var = p650Var.f26438a;
                feeVar2.d(mi0Var);
                ((fee) n0o0Var12.getValue()).d(p650Var.e);
                ((fee) n0o0Var11.getValue()).d(p650Var.b);
                ((fee) n0o0Var7.getValue()).d(p650Var.c);
                ((fee) n0o0Var10.getValue()).d(p650Var.d);
                ((fee) n0o0Var9.getValue()).d(p650Var.i);
                ((fee) n0o0Var8.getValue()).d(mi0Var);
                ((fee) n0o0Var6.getValue()).d(p650Var.g);
                ((fee) n0o0Var3.getValue()).d(p650Var.h);
                ((fee) n0o0Var5.getValue()).d(Boolean.valueOf(z));
                ((fee) n0o0Var4.getValue()).d(((fee) n0o0Var3.getValue()).c());
                return new x650((imm) ((fee) n0o0Var8.getValue()).b(), (z250) ((fee) n0o0Var5.getValue()).b(), (n250) ((fee) n0o0Var4.getValue()).b());
            case 2:
                jpk0 jpk0Var = (jpk0) obj;
                jpk0Var.getClass();
                ((fee) n0o0Var12.getValue()).d(jpk0Var.b);
                ((fee) n0o0Var11.getValue()).d(jpk0Var.c);
                ((fee) n0o0Var7.getValue()).d(jpk0Var.d);
                ((fee) n0o0Var10.getValue()).d(jpk0Var.e);
                ((fee) n0o0Var9.getValue()).d(new ynq0(jpk0Var.f));
                fee feeVar3 = (fee) n0o0Var8.getValue();
                lwk0 lwk0Var = jpk0Var.g;
                feeVar3.d(lwk0Var);
                ((fee) n0o0Var6.getValue()).d(lwk0Var);
                return new kpk0((wnk0) ((fee) n0o0Var5.getValue()).b(), (z1d) ((fee) n0o0Var3.getValue()).b(), (owk0) ((fee) n0o0Var4.getValue()).b(), (mwk0) ((fee) n0o0Var8.getValue()).b(), (kwk0) ((fee) n0o0Var6.getValue()).b());
            default:
                e6s0 e6s0Var = (e6s0) obj;
                e6s0Var.getClass();
                ((fee) n0o0Var2.getValue()).d(Boolean.valueOf(e6s0Var.f));
                ((fee) n0o0Var.getValue()).d(e6s0Var.e);
                ((fee) n0o0Var12.getValue()).d(e6s0Var.d);
                ((fee) n0o0Var11.getValue()).d(Long.valueOf(e6s0Var.b));
                ((fee) n0o0Var10.getValue()).d(Integer.valueOf(e6s0Var.h));
                ((fee) n0o0Var9.getValue()).d(e6s0Var.c);
                ((fee) n0o0Var8.getValue()).d(Boolean.valueOf(e6s0Var.i));
                ((fee) n0o0Var7.getValue()).d(e6s0Var.g);
                if (!((Boolean) ((fee) n0o0Var2.getValue()).c()).booleanValue()) {
                    return new f6s0((imm) n0o0Var6.getValue(), (a4x) ((fee) n0o0Var4.getValue()).b(), (ci) ((fee) n0o0Var3.getValue()).b());
                }
                return new g6s0((mdm) ((fee) n0o0Var5.getValue()).b(), (imm) n0o0Var6.getValue());
        }
    }

    public p92(d92 d92Var, ctf0 ctf0Var) {
        final byte b = 0;
        ctf0Var.getClass();
        this.b = ctf0Var;
        n0o0 n0o0VarH = bkb.H(d92Var.b);
        this.c = n0o0VarH;
        this.d = bkb.H(d92Var.f5678a);
        n0o0 n0o0VarH2 = bkb.H(d92Var.f);
        this.e = n0o0VarH2;
        this.f = bkb.H(d92Var.d);
        this.g = bkb.H(Boolean.valueOf(d92Var.e));
        this.h = maz.b(new yw9(new ynq0(d92Var.i), new Function1(this) { // from class: a.o92
            public final /* synthetic */ p92 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Object obj2;
                n3n j3nVar;
                fg50 fg50Var;
                n3n h3nVar;
                zd90 zd90Var;
                jg50 jg50Var;
                Long l;
                jg50 jg50Var2;
                Long l2;
                zd90 zd90VarQ;
                Long l3;
                Long l4;
                SpecialEventTab specialEventTab;
                List list;
                SpecialEventTab specialEventTab2;
                ayl aylVar;
                byte b2 = b;
                int i = 3;
                int i2 = 2;
                int i3 = 0;
                int i4 = 1;
                p92 p92Var = this.b;
                switch (b2) {
                    case 0:
                        long j = ((ynq0) obj).f42952a;
                        ctf0 ctf0Var2 = p92Var.b;
                        ctf0Var2.getClass();
                        long jE = ynq0.e(j);
                        if (jE > 0) {
                            StringBuilder sb = new StringBuilder();
                            long j2 = jE / 86400000;
                            if (j2 > 0) {
                                sb.append(ctf0Var2.b.a(R.string.days_v2, Arrays.copyOf(new Object[]{Long.valueOf(j2)}, 1)));
                            }
                            long jE2 = jE - wen.e(ibc.w0(j2, bfn.DAYS));
                            long j3 = jE2 / 3600000;
                            if (j3 > 0) {
                                if (sb.length() > 0) {
                                    sb.append(Separators.SP);
                                }
                                sb.append(ctf0Var2.b.a(R.string.limit_third_hour_declination_v2, Arrays.copyOf(new Object[]{Long.valueOf(j3)}, 1)));
                            }
                            long jE3 = (jE2 - wen.e(ibc.w0(j3, bfn.HOURS))) / 60000;
                            if (jE3 > 0) {
                                if (sb.length() > 0) {
                                    sb.append(Separators.SP);
                                }
                                sb.append(ctf0Var2.b.a(R.string.reality_minute_v2, Arrays.copyOf(new Object[]{Long.valueOf(jE3)}, 1)));
                            }
                            if (sb.length() != 0) {
                                return ctf0Var2.b.a(R.string.time_before_event, Arrays.copyOf(new Object[0], 0)) + Separators.SP + ((Object) sb);
                            }
                        }
                        return null;
                    case 1:
                        yi50 yi50Var = (yi50) obj;
                        yi50Var.getClass();
                        if (yi50Var instanceof wi50) {
                            return w72.f38650a;
                        }
                        if (yi50Var instanceof vi50) {
                            return new v72(((b92) ((fee) p92Var.c.getValue()).c()).b, (String) ((fee) p92Var.h.getValue()).b());
                        }
                        if (yi50Var instanceof xi50) {
                            uf50 uf50Var = ((xi50) yi50Var).f40928a;
                            ctf0 ctf0Var3 = p92Var.b;
                            List list2 = (List) ((fee) p92Var.f.getValue()).c();
                            boolean zBooleanValue = ((Boolean) ((fee) p92Var.g.getValue()).c()).booleanValue();
                            dj50 dj50Var = (dj50) ((fee) p92Var.j.getValue()).c();
                            bj50 bj50Var = (bj50) ((fee) p92Var.k.getValue()).c();
                            uf50Var.getClass();
                            ctf0Var3.getClass();
                            list2.getClass();
                            if (uf50Var.i()) {
                                if (uf50Var instanceof wf50) {
                                    wf50 wf50Var = (wf50) uf50Var;
                                    j83 j83VarT0 = n6x.t0(wf50Var);
                                    j83 j83VarX = xww.X(wf50Var, ctf0Var3);
                                    qal0 qal0VarU = q5x.U(wf50Var, ctf0Var3, dj50Var);
                                    eh50 eh50Var = wf50Var.m;
                                    cap capVar = cap.b;
                                    Pair pair = wf50Var.o;
                                    int iIntValue = ((Number) pair.f46059a).intValue();
                                    Pair pair2 = wf50Var.p;
                                    int iIntValue2 = ((Number) pair2.f46059a).intValue();
                                    Pair pair3 = wf50Var.q;
                                    int iIntValue3 = ((Number) pair3.f46059a).intValue();
                                    nal0 nal0VarU0 = x2x.u0(eh50Var, list2, zBooleanValue, capVar, (iIntValue == 0 && iIntValue2 == 0 && iIntValue3 == 0) ? null : new kal0(iIntValue, iIntValue2, iIntValue3));
                                    eh50 eh50Var2 = wf50Var.n;
                                    cap capVar2 = cap.f4022a;
                                    int iIntValue4 = ((Number) pair.b).intValue();
                                    int iIntValue5 = ((Number) pair2.b).intValue();
                                    int iIntValue6 = ((Number) pair3.b).intValue();
                                    j3nVar = new i3n(j83VarT0, qal0VarU, j83VarX, nal0VarU0, x2x.u0(eh50Var2, list2, zBooleanValue, capVar2, (iIntValue4 == 0 && iIntValue5 == 0 && iIntValue6 == 0) ? null : new kal0(iIntValue4, iIntValue5, iIntValue6)), new w9l0(x1x.V(wf50Var, bj50Var)));
                                } else if (uf50Var instanceof yf50) {
                                    yf50 yf50Var = (yf50) uf50Var;
                                    j3nVar = new k3n(n6x.t0(yf50Var), q5x.U(yf50Var, ctf0Var3, dj50Var), xww.X(yf50Var, ctf0Var3), yf50Var.m);
                                } else {
                                    if (uf50Var instanceof zf50) {
                                        zf50 zf50Var = (zf50) uf50Var;
                                        aj50 aj50Var = zf50Var.k;
                                        j83 j83VarT1 = n6x.t0(zf50Var);
                                        j83 j83VarX2 = xww.X(zf50Var, ctf0Var3);
                                        long jLongValue = 0;
                                        lsm0 lsm0Var = ctf0Var3.b;
                                        String strA = lsm0Var.a(R.string.live_new, Arrays.copyOf(new Object[0], 0));
                                        String str = aj50Var != null ? aj50Var.i : null;
                                        if (str == null) {
                                            str = "";
                                        }
                                        o9l0 o9l0Var = new o9l0(strA, str);
                                        eh50 eh50Var3 = zf50Var.n;
                                        cap capVar3 = cap.f4022a;
                                        jal0 jal0VarO = m2x.O(eh50Var3, list2, zBooleanValue);
                                        jal0 jal0VarO2 = m2x.O(zf50Var.o, list2, zBooleanValue);
                                        bj50 bj50VarV = q0x.V(zf50Var);
                                        List list3 = aj50Var != null ? aj50Var.c : null;
                                        if (list3 == null) {
                                            list3 = iun.f15405a;
                                        }
                                        int i5 = q3d.i(list3);
                                        ArrayList arrayList = new ArrayList(r3d.q(list3, 10));
                                        int i6 = 0;
                                        for (Object obj3 : list3) {
                                            int i7 = i6 + 1;
                                            if (i6 < 0) {
                                                q3d.p();
                                                throw null;
                                            }
                                            ih50 ih50Var = (ih50) obj3;
                                            if (i6 == i5) {
                                                zd90VarQ = m2x.Q(ih50Var, pzw.O(bj50VarV, bj50Var) ? pzw.B(bj50VarV.h, (bj50Var == null || (l3 = bj50Var.h) == null) ? 0L : l3.longValue()) : zi50.f44426a, pzw.O(bj50VarV, bj50Var) ? pzw.B(bj50VarV.i, (bj50Var == null || (l4 = bj50Var.i) == null) ? 0L : l4.longValue()) : zi50.f44426a);
                                            } else {
                                                zi50 zi50Var = zi50.f44426a;
                                                zd90VarQ = m2x.Q(ih50Var, zi50Var, zi50Var);
                                            }
                                            arrayList.add(zd90VarQ);
                                            i6 = i7;
                                        }
                                        i4 i4VarR0 = dyb.r0(arrayList);
                                        h83 h83Var = new h83();
                                        h83 h83Var2 = new h83();
                                        String strValueOf = String.valueOf((aj50Var == null || (jg50Var2 = aj50Var.d) == null || (l2 = jg50Var2.f16464a) == null) ? 0L : l2.longValue());
                                        strValueOf.getClass();
                                        long j4 = y3d.g;
                                        long j5 = daq0.c;
                                        long jM = x1x.M(pzw.F(bj50VarV, bj50Var));
                                        j56 j56Var = new j56(0.0f);
                                        k5q0 k5q0Var = k5q0.b;
                                        smk0 smk0Var = new smk0(jM, j5, null, null, null, null, null, j5, j56Var, null, null, j4, k5q0Var, null, null, 17424);
                                        h83Var2.c(strValueOf);
                                        StringBuilder sb2 = h83Var2.f12607a;
                                        h83Var2.a(smk0Var, 0, sb2.length());
                                        sb2.length();
                                        h83Var.b(h83Var2.h());
                                        j83 j83VarH = h83Var.h();
                                        h83 h83Var3 = new h83();
                                        h83 h83Var4 = new h83();
                                        if (aj50Var != null && (jg50Var = aj50Var.d) != null && (l = jg50Var.b) != null) {
                                            jLongValue = l.longValue();
                                        }
                                        String strValueOf2 = String.valueOf(jLongValue);
                                        strValueOf2.getClass();
                                        smk0 smk0Var2 = new smk0(x1x.M(pzw.G(bj50VarV, bj50Var)), j5, null, null, null, null, null, j5, new j56(0.0f), null, null, j4, k5q0Var, null, null, 17424);
                                        h83Var4.c(strValueOf2);
                                        StringBuilder sb3 = h83Var4.f12607a;
                                        h83Var4.a(smk0Var2, 0, sb3.length());
                                        sb3.length();
                                        h83Var3.b(h83Var4.h());
                                        zd90 zd90Var2 = new zd90(j83VarH, h83Var3.h(), lsm0Var.a(R.string.total_count, Arrays.copyOf(new Object[0], 0)));
                                        if ((aj50Var != null ? aj50Var.e : null) != null) {
                                            h83 h83Var5 = new h83();
                                            h83 h83Var6 = new h83();
                                            String str2 = aj50Var.e.f2643a;
                                            smk0 smk0Var3 = new smk0(x1x.M(pzw.O(bj50VarV, bj50Var) ? pzw.C(bj50VarV.f, bj50Var != null ? bj50Var.f : null) : zi50.f44426a), j5, null, null, null, null, null, j5, new j56(0.0f), null, null, j4, k5q0Var, null, null, 17424);
                                            h83Var6.c(str2);
                                            StringBuilder sb4 = h83Var6.f12607a;
                                            h83Var6.a(smk0Var3, 0, sb4.length());
                                            sb4.length();
                                            h83Var5.b(h83Var6.h());
                                            j83 j83VarH2 = h83Var5.h();
                                            h83 h83Var7 = new h83();
                                            h83 h83Var8 = new h83();
                                            String str3 = aj50Var.e.b;
                                            smk0 smk0Var4 = new smk0(x1x.M(pzw.O(bj50VarV, bj50Var) ? pzw.C(bj50VarV.g, bj50Var != null ? bj50Var.g : null) : zi50.f44426a), j5, null, null, null, null, null, j5, new j56(0.0f), null, null, j4, k5q0Var, null, null, 17424);
                                            h83Var8.c(str3);
                                            StringBuilder sb5 = h83Var8.f12607a;
                                            h83Var8.a(smk0Var4, 0, sb5.length());
                                            sb5.length();
                                            h83Var7.b(h83Var8.h());
                                            zd90Var = new zd90(j83VarH2, h83Var7.h(), lsm0Var.a(R.string.tennis_game_column, Arrays.copyOf(new Object[0], 0)));
                                        } else {
                                            zd90Var = null;
                                        }
                                        Long lValueOf = aj50Var != null ? Long.valueOf(aj50Var.f) : null;
                                        fex fexVar = (lValueOf != null && lValueOf.longValue() == 1) ? fex.f9426a : (lValueOf != null && lValueOf.longValue() == 2) ? fex.b : fex.c;
                                        if (i4VarR0.isEmpty()) {
                                            i4VarR0 = lak0.c;
                                        }
                                        h3nVar = new m3n(j83VarT1, j83VarX2, o9l0Var, jal0VarO, jal0VarO2, new aal0(fexVar, i4VarR0, zd90Var2, zd90Var, null));
                                    } else if (uf50Var instanceof vf50) {
                                        vf50 vf50Var = (vf50) uf50Var;
                                        aj50 aj50Var2 = vf50Var.k;
                                        if (aj50Var2 == null || (fg50Var = aj50Var2.b) == null) {
                                            j3nVar = yyw.d0(vf50Var, ctf0Var3, list2, zBooleanValue, dj50Var);
                                        } else {
                                            bg50 bg50Var = fg50Var.b;
                                            ri50 ri50Var = bg50Var != null ? bg50Var.f2538a : null;
                                            ng50 ng50Var = fg50Var.f9477a;
                                            if (ng50Var == null) {
                                                j3nVar = yyw.d0(vf50Var, ctf0Var3, list2, zBooleanValue, dj50Var);
                                            } else {
                                                long j6 = ng50Var.f23469a;
                                                bj50 bj50VarV2 = q0x.V(vf50Var);
                                                j83 j83VarT2 = n6x.t0(vf50Var);
                                                j83 j83VarX3 = xww.X(vf50Var, ctf0Var3);
                                                o9l0 o9l0Var2 = new o9l0(ctf0Var3.b.a(R.string.live_new, Arrays.copyOf(new Object[0], 0)), aj50Var2.i);
                                                fex fexVar2 = j6 == 1 ? fex.f9426a : j6 == 2 ? fex.b : fex.c;
                                                eh50 eh50Var4 = vf50Var.m;
                                                cap capVar4 = cap.f4022a;
                                                h3nVar = new h3n(j83VarT2, j83VarX3, o9l0Var2, fexVar2, yyw.e0(eh50Var4, list2, zBooleanValue), yyw.e0(vf50Var.n, list2, zBooleanValue), yyw.b0(ri50Var != null ? ri50Var.f30523a : null, ng50Var, j6 == 1, pzw.D(bj50VarV2, bj50Var, true)), yyw.b0(ri50Var != null ? ri50Var.b : null, ng50Var, j6 == 2, pzw.D(bj50VarV2, bj50Var, false)));
                                            }
                                        }
                                    } else {
                                        if (!(uf50Var instanceof xf50)) {
                                            t9f.b();
                                            return null;
                                        }
                                        xf50 xf50Var = (xf50) uf50Var;
                                        j3nVar = new j3n(n6x.t0(xf50Var), xww.X(xf50Var, ctf0Var3), q5x.U(xf50Var, ctf0Var3, dj50Var), q0x.R(xf50Var.m, pep0.b), q0x.R(xf50Var.n, pep0.f26864a), new w9l0(x1x.V(xf50Var, bj50Var)));
                                    }
                                    j3nVar = h3nVar;
                                }
                            } else if (uf50Var instanceof wf50) {
                                wf50 wf50Var2 = (wf50) uf50Var;
                                j3nVar = new i3n(n6x.t0(wf50Var2), q5x.T(wf50Var2, ctf0Var3, dj50Var), xww.W(wf50Var2, ctf0Var3), x2x.u0(wf50Var2.m, list2, zBooleanValue, cap.b, null), x2x.u0(wf50Var2.n, list2, zBooleanValue, cap.f4022a, null), new v9l0(x1x.U(wf50Var2, ctf0Var3)));
                            } else if (uf50Var instanceof yf50) {
                                yf50 yf50Var2 = (yf50) uf50Var;
                                j3nVar = new k3n(n6x.t0(yf50Var2), q5x.T(yf50Var2, ctf0Var3, dj50Var), xww.W(yf50Var2, ctf0Var3), yf50Var2.m);
                            } else if (uf50Var instanceof zf50) {
                                zf50 zf50Var2 = (zf50) uf50Var;
                                j3nVar = new i3n(n6x.t0(zf50Var2), q5x.T(zf50Var2, ctf0Var3, dj50Var), xww.W(zf50Var2, ctf0Var3), x2x.u0(zf50Var2.n, list2, zBooleanValue, cap.b, null), x2x.u0(zf50Var2.o, list2, zBooleanValue, cap.f4022a, null), new v9l0(x1x.U(zf50Var2, ctf0Var3)));
                            } else if (uf50Var instanceof vf50) {
                                vf50 vf50Var2 = (vf50) uf50Var;
                                j3nVar = new i3n(n6x.t0(vf50Var2), q5x.T(vf50Var2, ctf0Var3, dj50Var), xww.W(vf50Var2, ctf0Var3), x2x.u0(vf50Var2.m, list2, zBooleanValue, cap.b, null), x2x.u0(vf50Var2.n, list2, zBooleanValue, cap.f4022a, null), new v9l0(x1x.U(vf50Var2, ctf0Var3)));
                            } else {
                                obj2 = null;
                                if (uf50Var instanceof xf50) {
                                    xf50 xf50Var2 = (xf50) uf50Var;
                                    j3nVar = new j3n(n6x.t0(xf50Var2), xww.W(xf50Var2, ctf0Var3), q5x.T(xf50Var2, ctf0Var3, dj50Var), q0x.R(xf50Var2.m, pep0.b), q0x.R(xf50Var2.n, pep0.f26864a), new v9l0(x1x.U(xf50Var2, ctf0Var3)));
                                } else {
                                    t9f.b();
                                }
                            }
                            return new x72(j3nVar);
                        }
                        obj2 = null;
                        t9f.b();
                        return obj2;
                    case 2:
                        lwk0 lwk0Var = (lwk0) obj;
                        lwk0Var.getClass();
                        n0o0 n0o0Var = p92Var.c;
                        int i8 = ((b92) ((fee) n0o0Var.getValue()).c()).f2186a;
                        String str4 = ((b92) ((fee) n0o0Var.getValue()).c()).b;
                        str4.getClass();
                        List<SpecialEventTabs> list4 = lwk0Var.b;
                        int iIndexOf = list4.indexOf(lwk0Var.f20768a);
                        ArrayList arrayList2 = new ArrayList(r3d.q(list4, 10));
                        for (SpecialEventTabs specialEventTabs : list4) {
                            int iOrdinal = specialEventTabs.ordinal();
                            SpecialEventTab.Schedule schedule = SpecialEventTab.Schedule.c;
                            if (iOrdinal != 0) {
                                if (iOrdinal == 1) {
                                    specialEventTab2 = SpecialEventTab.MyGames.c;
                                } else {
                                    if (iOrdinal != 2) {
                                        if (iOrdinal == 3) {
                                            specialEventTab2 = SpecialEventTab.Tournament.c;
                                        } else {
                                            t9f.b();
                                        }
                                        return null;
                                    }
                                    specialEventTab2 = SpecialEventTab.Statistic.c;
                                }
                                specialEventTab = specialEventTab2;
                            } else {
                                specialEventTab = schedule;
                            }
                            boolean zEquals = specialEventTab.equals(schedule);
                            int iOrdinal2 = specialEventTabs.ordinal();
                            if (iOrdinal2 == 0) {
                                list = lwk0Var.d;
                            } else if (iOrdinal2 == 1) {
                                list = lwk0Var.e;
                            } else if (iOrdinal2 == 2) {
                                list = lwk0Var.f;
                            } else {
                                if (iOrdinal2 != 3) {
                                    t9f.b();
                                    return null;
                                }
                                list = lwk0Var.g;
                            }
                            arrayList2.add(new SpecialEventTabScreenParams(i8, str4, specialEventTab, zEquals, list));
                        }
                        return new q4i0(iIndexOf, arrayList2);
                    default:
                        lwk0 lwk0Var2 = (lwk0) obj;
                        lwk0Var2.getClass();
                        List list5 = lwk0Var2.b;
                        if (list5.isEmpty() || list5.size() == 1) {
                            return null;
                        }
                        ctf0 ctf0Var4 = p92Var.b;
                        ctf0Var4.getClass();
                        lsm0 lsm0Var2 = ctf0Var4.b;
                        float f = ctf0Var4.j() ? 32.0f : 8.0f;
                        ArrayList arrayList3 = new ArrayList(r3d.q(list5, 10));
                        Iterator it = list5.iterator();
                        int i9 = 0;
                        while (it.hasNext()) {
                            Object next = it.next();
                            int i10 = i9 + 1;
                            if (i9 < 0) {
                                q3d.p();
                                throw null;
                            }
                            SpecialEventTabs specialEventTabs2 = (SpecialEventTabs) next;
                            long j7 = i9;
                            specialEventTabs2.getClass();
                            int iOrdinal3 = specialEventTabs2.ordinal();
                            if (iOrdinal3 == 0) {
                                aylVar = new ayl(lsm0Var2.a(R.string.schedule, Arrays.copyOf(new Object[0], 0)), new m0x(R.drawable.ic_glyph_calendar_inactive, null, 6), null, 28);
                            } else if (iOrdinal3 == i4) {
                                aylVar = new ayl(lsm0Var2.a(R.string.special_event_my_games, Arrays.copyOf(new Object[0], 0)), new m0x(R.drawable.ic_glyph_bookmark, null, 6), null, 28);
                            } else if (iOrdinal3 == i2) {
                                aylVar = new ayl(lsm0Var2.a(R.string.statistic, Arrays.copyOf(new Object[0], 0)), new m0x(R.drawable.ic_glyph_statistics, null, 6), null, 28);
                            } else {
                                if (iOrdinal3 != i) {
                                    t9f.b();
                                    return null;
                                }
                                aylVar = new ayl(lsm0Var2.a(R.string.tournament, Arrays.copyOf(new Object[i3], i3)), new m0x(R.drawable.ic_glyph_tournaments, null, 6), null, 28);
                            }
                            arrayList3.add(new lxl(j7, (dyl) aylVar, false, specialEventTabs2 == lwk0Var2.f20768a ? uxl.b : uxl.f36445a, (cwl) null, 104));
                            it = it;
                            i9 = i10;
                            i = 3;
                            i2 = 2;
                            i3 = 0;
                            i4 = 1;
                        }
                        return new fyl(dyb.o0(arrayList3), null, null, s5x0.u(f, 0.0f, 0.0f, 0.0f, 14), null, 22);
                }
            }
        }, (byte) 20));
        this.i = bkb.G(((fee) n0o0VarH.getValue()).d, new dj1((byte) 26));
        this.j = bkb.H(d92Var.g);
        this.k = bkb.H(d92Var.j);
        pz40 pz40Var = ((fee) n0o0VarH2.getValue()).d;
        final byte b2 = 1;
        this.l = bkb.G(pz40Var, new Function1(this) { // from class: a.o92
            public final /* synthetic */ p92 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Object obj2;
                n3n j3nVar;
                fg50 fg50Var;
                n3n h3nVar;
                zd90 zd90Var;
                jg50 jg50Var;
                Long l;
                jg50 jg50Var2;
                Long l2;
                zd90 zd90VarQ;
                Long l3;
                Long l4;
                SpecialEventTab specialEventTab;
                List list;
                SpecialEventTab specialEventTab2;
                ayl aylVar;
                byte b3 = b2;
                int i = 3;
                int i2 = 2;
                int i3 = 0;
                int i4 = 1;
                p92 p92Var = this.b;
                switch (b3) {
                    case 0:
                        long j = ((ynq0) obj).f42952a;
                        ctf0 ctf0Var2 = p92Var.b;
                        ctf0Var2.getClass();
                        long jE = ynq0.e(j);
                        if (jE > 0) {
                            StringBuilder sb = new StringBuilder();
                            long j2 = jE / 86400000;
                            if (j2 > 0) {
                                sb.append(ctf0Var2.b.a(R.string.days_v2, Arrays.copyOf(new Object[]{Long.valueOf(j2)}, 1)));
                            }
                            long jE2 = jE - wen.e(ibc.w0(j2, bfn.DAYS));
                            long j3 = jE2 / 3600000;
                            if (j3 > 0) {
                                if (sb.length() > 0) {
                                    sb.append(Separators.SP);
                                }
                                sb.append(ctf0Var2.b.a(R.string.limit_third_hour_declination_v2, Arrays.copyOf(new Object[]{Long.valueOf(j3)}, 1)));
                            }
                            long jE3 = (jE2 - wen.e(ibc.w0(j3, bfn.HOURS))) / 60000;
                            if (jE3 > 0) {
                                if (sb.length() > 0) {
                                    sb.append(Separators.SP);
                                }
                                sb.append(ctf0Var2.b.a(R.string.reality_minute_v2, Arrays.copyOf(new Object[]{Long.valueOf(jE3)}, 1)));
                            }
                            if (sb.length() != 0) {
                                return ctf0Var2.b.a(R.string.time_before_event, Arrays.copyOf(new Object[0], 0)) + Separators.SP + ((Object) sb);
                            }
                        }
                        return null;
                    case 1:
                        yi50 yi50Var = (yi50) obj;
                        yi50Var.getClass();
                        if (yi50Var instanceof wi50) {
                            return w72.f38650a;
                        }
                        if (yi50Var instanceof vi50) {
                            return new v72(((b92) ((fee) p92Var.c.getValue()).c()).b, (String) ((fee) p92Var.h.getValue()).b());
                        }
                        if (yi50Var instanceof xi50) {
                            uf50 uf50Var = ((xi50) yi50Var).f40928a;
                            ctf0 ctf0Var3 = p92Var.b;
                            List list2 = (List) ((fee) p92Var.f.getValue()).c();
                            boolean zBooleanValue = ((Boolean) ((fee) p92Var.g.getValue()).c()).booleanValue();
                            dj50 dj50Var = (dj50) ((fee) p92Var.j.getValue()).c();
                            bj50 bj50Var = (bj50) ((fee) p92Var.k.getValue()).c();
                            uf50Var.getClass();
                            ctf0Var3.getClass();
                            list2.getClass();
                            if (uf50Var.i()) {
                                if (uf50Var instanceof wf50) {
                                    wf50 wf50Var = (wf50) uf50Var;
                                    j83 j83VarT0 = n6x.t0(wf50Var);
                                    j83 j83VarX = xww.X(wf50Var, ctf0Var3);
                                    qal0 qal0VarU = q5x.U(wf50Var, ctf0Var3, dj50Var);
                                    eh50 eh50Var = wf50Var.m;
                                    cap capVar = cap.b;
                                    Pair pair = wf50Var.o;
                                    int iIntValue = ((Number) pair.f46059a).intValue();
                                    Pair pair2 = wf50Var.p;
                                    int iIntValue2 = ((Number) pair2.f46059a).intValue();
                                    Pair pair3 = wf50Var.q;
                                    int iIntValue3 = ((Number) pair3.f46059a).intValue();
                                    nal0 nal0VarU0 = x2x.u0(eh50Var, list2, zBooleanValue, capVar, (iIntValue == 0 && iIntValue2 == 0 && iIntValue3 == 0) ? null : new kal0(iIntValue, iIntValue2, iIntValue3));
                                    eh50 eh50Var2 = wf50Var.n;
                                    cap capVar2 = cap.f4022a;
                                    int iIntValue4 = ((Number) pair.b).intValue();
                                    int iIntValue5 = ((Number) pair2.b).intValue();
                                    int iIntValue6 = ((Number) pair3.b).intValue();
                                    j3nVar = new i3n(j83VarT0, qal0VarU, j83VarX, nal0VarU0, x2x.u0(eh50Var2, list2, zBooleanValue, capVar2, (iIntValue4 == 0 && iIntValue5 == 0 && iIntValue6 == 0) ? null : new kal0(iIntValue4, iIntValue5, iIntValue6)), new w9l0(x1x.V(wf50Var, bj50Var)));
                                } else if (uf50Var instanceof yf50) {
                                    yf50 yf50Var = (yf50) uf50Var;
                                    j3nVar = new k3n(n6x.t0(yf50Var), q5x.U(yf50Var, ctf0Var3, dj50Var), xww.X(yf50Var, ctf0Var3), yf50Var.m);
                                } else {
                                    if (uf50Var instanceof zf50) {
                                        zf50 zf50Var = (zf50) uf50Var;
                                        aj50 aj50Var = zf50Var.k;
                                        j83 j83VarT1 = n6x.t0(zf50Var);
                                        j83 j83VarX2 = xww.X(zf50Var, ctf0Var3);
                                        long jLongValue = 0;
                                        lsm0 lsm0Var = ctf0Var3.b;
                                        String strA = lsm0Var.a(R.string.live_new, Arrays.copyOf(new Object[0], 0));
                                        String str = aj50Var != null ? aj50Var.i : null;
                                        if (str == null) {
                                            str = "";
                                        }
                                        o9l0 o9l0Var = new o9l0(strA, str);
                                        eh50 eh50Var3 = zf50Var.n;
                                        cap capVar3 = cap.f4022a;
                                        jal0 jal0VarO = m2x.O(eh50Var3, list2, zBooleanValue);
                                        jal0 jal0VarO2 = m2x.O(zf50Var.o, list2, zBooleanValue);
                                        bj50 bj50VarV = q0x.V(zf50Var);
                                        List list3 = aj50Var != null ? aj50Var.c : null;
                                        if (list3 == null) {
                                            list3 = iun.f15405a;
                                        }
                                        int i5 = q3d.i(list3);
                                        ArrayList arrayList = new ArrayList(r3d.q(list3, 10));
                                        int i6 = 0;
                                        for (Object obj3 : list3) {
                                            int i7 = i6 + 1;
                                            if (i6 < 0) {
                                                q3d.p();
                                                throw null;
                                            }
                                            ih50 ih50Var = (ih50) obj3;
                                            if (i6 == i5) {
                                                zd90VarQ = m2x.Q(ih50Var, pzw.O(bj50VarV, bj50Var) ? pzw.B(bj50VarV.h, (bj50Var == null || (l3 = bj50Var.h) == null) ? 0L : l3.longValue()) : zi50.f44426a, pzw.O(bj50VarV, bj50Var) ? pzw.B(bj50VarV.i, (bj50Var == null || (l4 = bj50Var.i) == null) ? 0L : l4.longValue()) : zi50.f44426a);
                                            } else {
                                                zi50 zi50Var = zi50.f44426a;
                                                zd90VarQ = m2x.Q(ih50Var, zi50Var, zi50Var);
                                            }
                                            arrayList.add(zd90VarQ);
                                            i6 = i7;
                                        }
                                        i4 i4VarR0 = dyb.r0(arrayList);
                                        h83 h83Var = new h83();
                                        h83 h83Var2 = new h83();
                                        String strValueOf = String.valueOf((aj50Var == null || (jg50Var2 = aj50Var.d) == null || (l2 = jg50Var2.f16464a) == null) ? 0L : l2.longValue());
                                        strValueOf.getClass();
                                        long j4 = y3d.g;
                                        long j5 = daq0.c;
                                        long jM = x1x.M(pzw.F(bj50VarV, bj50Var));
                                        j56 j56Var = new j56(0.0f);
                                        k5q0 k5q0Var = k5q0.b;
                                        smk0 smk0Var = new smk0(jM, j5, null, null, null, null, null, j5, j56Var, null, null, j4, k5q0Var, null, null, 17424);
                                        h83Var2.c(strValueOf);
                                        StringBuilder sb2 = h83Var2.f12607a;
                                        h83Var2.a(smk0Var, 0, sb2.length());
                                        sb2.length();
                                        h83Var.b(h83Var2.h());
                                        j83 j83VarH = h83Var.h();
                                        h83 h83Var3 = new h83();
                                        h83 h83Var4 = new h83();
                                        if (aj50Var != null && (jg50Var = aj50Var.d) != null && (l = jg50Var.b) != null) {
                                            jLongValue = l.longValue();
                                        }
                                        String strValueOf2 = String.valueOf(jLongValue);
                                        strValueOf2.getClass();
                                        smk0 smk0Var2 = new smk0(x1x.M(pzw.G(bj50VarV, bj50Var)), j5, null, null, null, null, null, j5, new j56(0.0f), null, null, j4, k5q0Var, null, null, 17424);
                                        h83Var4.c(strValueOf2);
                                        StringBuilder sb3 = h83Var4.f12607a;
                                        h83Var4.a(smk0Var2, 0, sb3.length());
                                        sb3.length();
                                        h83Var3.b(h83Var4.h());
                                        zd90 zd90Var2 = new zd90(j83VarH, h83Var3.h(), lsm0Var.a(R.string.total_count, Arrays.copyOf(new Object[0], 0)));
                                        if ((aj50Var != null ? aj50Var.e : null) != null) {
                                            h83 h83Var5 = new h83();
                                            h83 h83Var6 = new h83();
                                            String str2 = aj50Var.e.f2643a;
                                            smk0 smk0Var3 = new smk0(x1x.M(pzw.O(bj50VarV, bj50Var) ? pzw.C(bj50VarV.f, bj50Var != null ? bj50Var.f : null) : zi50.f44426a), j5, null, null, null, null, null, j5, new j56(0.0f), null, null, j4, k5q0Var, null, null, 17424);
                                            h83Var6.c(str2);
                                            StringBuilder sb4 = h83Var6.f12607a;
                                            h83Var6.a(smk0Var3, 0, sb4.length());
                                            sb4.length();
                                            h83Var5.b(h83Var6.h());
                                            j83 j83VarH2 = h83Var5.h();
                                            h83 h83Var7 = new h83();
                                            h83 h83Var8 = new h83();
                                            String str3 = aj50Var.e.b;
                                            smk0 smk0Var4 = new smk0(x1x.M(pzw.O(bj50VarV, bj50Var) ? pzw.C(bj50VarV.g, bj50Var != null ? bj50Var.g : null) : zi50.f44426a), j5, null, null, null, null, null, j5, new j56(0.0f), null, null, j4, k5q0Var, null, null, 17424);
                                            h83Var8.c(str3);
                                            StringBuilder sb5 = h83Var8.f12607a;
                                            h83Var8.a(smk0Var4, 0, sb5.length());
                                            sb5.length();
                                            h83Var7.b(h83Var8.h());
                                            zd90Var = new zd90(j83VarH2, h83Var7.h(), lsm0Var.a(R.string.tennis_game_column, Arrays.copyOf(new Object[0], 0)));
                                        } else {
                                            zd90Var = null;
                                        }
                                        Long lValueOf = aj50Var != null ? Long.valueOf(aj50Var.f) : null;
                                        fex fexVar = (lValueOf != null && lValueOf.longValue() == 1) ? fex.f9426a : (lValueOf != null && lValueOf.longValue() == 2) ? fex.b : fex.c;
                                        if (i4VarR0.isEmpty()) {
                                            i4VarR0 = lak0.c;
                                        }
                                        h3nVar = new m3n(j83VarT1, j83VarX2, o9l0Var, jal0VarO, jal0VarO2, new aal0(fexVar, i4VarR0, zd90Var2, zd90Var, null));
                                    } else if (uf50Var instanceof vf50) {
                                        vf50 vf50Var = (vf50) uf50Var;
                                        aj50 aj50Var2 = vf50Var.k;
                                        if (aj50Var2 == null || (fg50Var = aj50Var2.b) == null) {
                                            j3nVar = yyw.d0(vf50Var, ctf0Var3, list2, zBooleanValue, dj50Var);
                                        } else {
                                            bg50 bg50Var = fg50Var.b;
                                            ri50 ri50Var = bg50Var != null ? bg50Var.f2538a : null;
                                            ng50 ng50Var = fg50Var.f9477a;
                                            if (ng50Var == null) {
                                                j3nVar = yyw.d0(vf50Var, ctf0Var3, list2, zBooleanValue, dj50Var);
                                            } else {
                                                long j6 = ng50Var.f23469a;
                                                bj50 bj50VarV2 = q0x.V(vf50Var);
                                                j83 j83VarT2 = n6x.t0(vf50Var);
                                                j83 j83VarX3 = xww.X(vf50Var, ctf0Var3);
                                                o9l0 o9l0Var2 = new o9l0(ctf0Var3.b.a(R.string.live_new, Arrays.copyOf(new Object[0], 0)), aj50Var2.i);
                                                fex fexVar2 = j6 == 1 ? fex.f9426a : j6 == 2 ? fex.b : fex.c;
                                                eh50 eh50Var4 = vf50Var.m;
                                                cap capVar4 = cap.f4022a;
                                                h3nVar = new h3n(j83VarT2, j83VarX3, o9l0Var2, fexVar2, yyw.e0(eh50Var4, list2, zBooleanValue), yyw.e0(vf50Var.n, list2, zBooleanValue), yyw.b0(ri50Var != null ? ri50Var.f30523a : null, ng50Var, j6 == 1, pzw.D(bj50VarV2, bj50Var, true)), yyw.b0(ri50Var != null ? ri50Var.b : null, ng50Var, j6 == 2, pzw.D(bj50VarV2, bj50Var, false)));
                                            }
                                        }
                                    } else {
                                        if (!(uf50Var instanceof xf50)) {
                                            t9f.b();
                                            return null;
                                        }
                                        xf50 xf50Var = (xf50) uf50Var;
                                        j3nVar = new j3n(n6x.t0(xf50Var), xww.X(xf50Var, ctf0Var3), q5x.U(xf50Var, ctf0Var3, dj50Var), q0x.R(xf50Var.m, pep0.b), q0x.R(xf50Var.n, pep0.f26864a), new w9l0(x1x.V(xf50Var, bj50Var)));
                                    }
                                    j3nVar = h3nVar;
                                }
                            } else if (uf50Var instanceof wf50) {
                                wf50 wf50Var2 = (wf50) uf50Var;
                                j3nVar = new i3n(n6x.t0(wf50Var2), q5x.T(wf50Var2, ctf0Var3, dj50Var), xww.W(wf50Var2, ctf0Var3), x2x.u0(wf50Var2.m, list2, zBooleanValue, cap.b, null), x2x.u0(wf50Var2.n, list2, zBooleanValue, cap.f4022a, null), new v9l0(x1x.U(wf50Var2, ctf0Var3)));
                            } else if (uf50Var instanceof yf50) {
                                yf50 yf50Var2 = (yf50) uf50Var;
                                j3nVar = new k3n(n6x.t0(yf50Var2), q5x.T(yf50Var2, ctf0Var3, dj50Var), xww.W(yf50Var2, ctf0Var3), yf50Var2.m);
                            } else if (uf50Var instanceof zf50) {
                                zf50 zf50Var2 = (zf50) uf50Var;
                                j3nVar = new i3n(n6x.t0(zf50Var2), q5x.T(zf50Var2, ctf0Var3, dj50Var), xww.W(zf50Var2, ctf0Var3), x2x.u0(zf50Var2.n, list2, zBooleanValue, cap.b, null), x2x.u0(zf50Var2.o, list2, zBooleanValue, cap.f4022a, null), new v9l0(x1x.U(zf50Var2, ctf0Var3)));
                            } else if (uf50Var instanceof vf50) {
                                vf50 vf50Var2 = (vf50) uf50Var;
                                j3nVar = new i3n(n6x.t0(vf50Var2), q5x.T(vf50Var2, ctf0Var3, dj50Var), xww.W(vf50Var2, ctf0Var3), x2x.u0(vf50Var2.m, list2, zBooleanValue, cap.b, null), x2x.u0(vf50Var2.n, list2, zBooleanValue, cap.f4022a, null), new v9l0(x1x.U(vf50Var2, ctf0Var3)));
                            } else {
                                obj2 = null;
                                if (uf50Var instanceof xf50) {
                                    xf50 xf50Var2 = (xf50) uf50Var;
                                    j3nVar = new j3n(n6x.t0(xf50Var2), xww.W(xf50Var2, ctf0Var3), q5x.T(xf50Var2, ctf0Var3, dj50Var), q0x.R(xf50Var2.m, pep0.b), q0x.R(xf50Var2.n, pep0.f26864a), new v9l0(x1x.U(xf50Var2, ctf0Var3)));
                                } else {
                                    t9f.b();
                                }
                            }
                            return new x72(j3nVar);
                        }
                        obj2 = null;
                        t9f.b();
                        return obj2;
                    case 2:
                        lwk0 lwk0Var = (lwk0) obj;
                        lwk0Var.getClass();
                        n0o0 n0o0Var = p92Var.c;
                        int i8 = ((b92) ((fee) n0o0Var.getValue()).c()).f2186a;
                        String str4 = ((b92) ((fee) n0o0Var.getValue()).c()).b;
                        str4.getClass();
                        List<SpecialEventTabs> list4 = lwk0Var.b;
                        int iIndexOf = list4.indexOf(lwk0Var.f20768a);
                        ArrayList arrayList2 = new ArrayList(r3d.q(list4, 10));
                        for (SpecialEventTabs specialEventTabs : list4) {
                            int iOrdinal = specialEventTabs.ordinal();
                            SpecialEventTab.Schedule schedule = SpecialEventTab.Schedule.c;
                            if (iOrdinal != 0) {
                                if (iOrdinal == 1) {
                                    specialEventTab2 = SpecialEventTab.MyGames.c;
                                } else {
                                    if (iOrdinal != 2) {
                                        if (iOrdinal == 3) {
                                            specialEventTab2 = SpecialEventTab.Tournament.c;
                                        } else {
                                            t9f.b();
                                        }
                                        return null;
                                    }
                                    specialEventTab2 = SpecialEventTab.Statistic.c;
                                }
                                specialEventTab = specialEventTab2;
                            } else {
                                specialEventTab = schedule;
                            }
                            boolean zEquals = specialEventTab.equals(schedule);
                            int iOrdinal2 = specialEventTabs.ordinal();
                            if (iOrdinal2 == 0) {
                                list = lwk0Var.d;
                            } else if (iOrdinal2 == 1) {
                                list = lwk0Var.e;
                            } else if (iOrdinal2 == 2) {
                                list = lwk0Var.f;
                            } else {
                                if (iOrdinal2 != 3) {
                                    t9f.b();
                                    return null;
                                }
                                list = lwk0Var.g;
                            }
                            arrayList2.add(new SpecialEventTabScreenParams(i8, str4, specialEventTab, zEquals, list));
                        }
                        return new q4i0(iIndexOf, arrayList2);
                    default:
                        lwk0 lwk0Var2 = (lwk0) obj;
                        lwk0Var2.getClass();
                        List list5 = lwk0Var2.b;
                        if (list5.isEmpty() || list5.size() == 1) {
                            return null;
                        }
                        ctf0 ctf0Var4 = p92Var.b;
                        ctf0Var4.getClass();
                        lsm0 lsm0Var2 = ctf0Var4.b;
                        float f = ctf0Var4.j() ? 32.0f : 8.0f;
                        ArrayList arrayList3 = new ArrayList(r3d.q(list5, 10));
                        Iterator it = list5.iterator();
                        int i9 = 0;
                        while (it.hasNext()) {
                            Object next = it.next();
                            int i10 = i9 + 1;
                            if (i9 < 0) {
                                q3d.p();
                                throw null;
                            }
                            SpecialEventTabs specialEventTabs2 = (SpecialEventTabs) next;
                            long j7 = i9;
                            specialEventTabs2.getClass();
                            int iOrdinal3 = specialEventTabs2.ordinal();
                            if (iOrdinal3 == 0) {
                                aylVar = new ayl(lsm0Var2.a(R.string.schedule, Arrays.copyOf(new Object[0], 0)), new m0x(R.drawable.ic_glyph_calendar_inactive, null, 6), null, 28);
                            } else if (iOrdinal3 == i4) {
                                aylVar = new ayl(lsm0Var2.a(R.string.special_event_my_games, Arrays.copyOf(new Object[0], 0)), new m0x(R.drawable.ic_glyph_bookmark, null, 6), null, 28);
                            } else if (iOrdinal3 == i2) {
                                aylVar = new ayl(lsm0Var2.a(R.string.statistic, Arrays.copyOf(new Object[0], 0)), new m0x(R.drawable.ic_glyph_statistics, null, 6), null, 28);
                            } else {
                                if (iOrdinal3 != i) {
                                    t9f.b();
                                    return null;
                                }
                                aylVar = new ayl(lsm0Var2.a(R.string.tournament, Arrays.copyOf(new Object[i3], i3)), new m0x(R.drawable.ic_glyph_tournaments, null, 6), null, 28);
                            }
                            arrayList3.add(new lxl(j7, (dyl) aylVar, false, specialEventTabs2 == lwk0Var2.f20768a ? uxl.b : uxl.f36445a, (cwl) null, 104));
                            it = it;
                            i9 = i10;
                            i = 3;
                            i2 = 2;
                            i3 = 0;
                            i4 = 1;
                        }
                        return new fyl(dyb.o0(arrayList3), null, null, s5x0.u(f, 0.0f, 0.0f, 0.0f, 14), null, 22);
                }
            }
        });
        final byte b3 = 2;
        n0o0 n0o0VarB = maz.b(new yw9(d92Var.c, new Function1(this) { // from class: a.o92
            public final /* synthetic */ p92 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Object obj2;
                n3n j3nVar;
                fg50 fg50Var;
                n3n h3nVar;
                zd90 zd90Var;
                jg50 jg50Var;
                Long l;
                jg50 jg50Var2;
                Long l2;
                zd90 zd90VarQ;
                Long l3;
                Long l4;
                SpecialEventTab specialEventTab;
                List list;
                SpecialEventTab specialEventTab2;
                ayl aylVar;
                byte b4 = b3;
                int i = 3;
                int i2 = 2;
                int i3 = 0;
                int i4 = 1;
                p92 p92Var = this.b;
                switch (b4) {
                    case 0:
                        long j = ((ynq0) obj).f42952a;
                        ctf0 ctf0Var2 = p92Var.b;
                        ctf0Var2.getClass();
                        long jE = ynq0.e(j);
                        if (jE > 0) {
                            StringBuilder sb = new StringBuilder();
                            long j2 = jE / 86400000;
                            if (j2 > 0) {
                                sb.append(ctf0Var2.b.a(R.string.days_v2, Arrays.copyOf(new Object[]{Long.valueOf(j2)}, 1)));
                            }
                            long jE2 = jE - wen.e(ibc.w0(j2, bfn.DAYS));
                            long j3 = jE2 / 3600000;
                            if (j3 > 0) {
                                if (sb.length() > 0) {
                                    sb.append(Separators.SP);
                                }
                                sb.append(ctf0Var2.b.a(R.string.limit_third_hour_declination_v2, Arrays.copyOf(new Object[]{Long.valueOf(j3)}, 1)));
                            }
                            long jE3 = (jE2 - wen.e(ibc.w0(j3, bfn.HOURS))) / 60000;
                            if (jE3 > 0) {
                                if (sb.length() > 0) {
                                    sb.append(Separators.SP);
                                }
                                sb.append(ctf0Var2.b.a(R.string.reality_minute_v2, Arrays.copyOf(new Object[]{Long.valueOf(jE3)}, 1)));
                            }
                            if (sb.length() != 0) {
                                return ctf0Var2.b.a(R.string.time_before_event, Arrays.copyOf(new Object[0], 0)) + Separators.SP + ((Object) sb);
                            }
                        }
                        return null;
                    case 1:
                        yi50 yi50Var = (yi50) obj;
                        yi50Var.getClass();
                        if (yi50Var instanceof wi50) {
                            return w72.f38650a;
                        }
                        if (yi50Var instanceof vi50) {
                            return new v72(((b92) ((fee) p92Var.c.getValue()).c()).b, (String) ((fee) p92Var.h.getValue()).b());
                        }
                        if (yi50Var instanceof xi50) {
                            uf50 uf50Var = ((xi50) yi50Var).f40928a;
                            ctf0 ctf0Var3 = p92Var.b;
                            List list2 = (List) ((fee) p92Var.f.getValue()).c();
                            boolean zBooleanValue = ((Boolean) ((fee) p92Var.g.getValue()).c()).booleanValue();
                            dj50 dj50Var = (dj50) ((fee) p92Var.j.getValue()).c();
                            bj50 bj50Var = (bj50) ((fee) p92Var.k.getValue()).c();
                            uf50Var.getClass();
                            ctf0Var3.getClass();
                            list2.getClass();
                            if (uf50Var.i()) {
                                if (uf50Var instanceof wf50) {
                                    wf50 wf50Var = (wf50) uf50Var;
                                    j83 j83VarT0 = n6x.t0(wf50Var);
                                    j83 j83VarX = xww.X(wf50Var, ctf0Var3);
                                    qal0 qal0VarU = q5x.U(wf50Var, ctf0Var3, dj50Var);
                                    eh50 eh50Var = wf50Var.m;
                                    cap capVar = cap.b;
                                    Pair pair = wf50Var.o;
                                    int iIntValue = ((Number) pair.f46059a).intValue();
                                    Pair pair2 = wf50Var.p;
                                    int iIntValue2 = ((Number) pair2.f46059a).intValue();
                                    Pair pair3 = wf50Var.q;
                                    int iIntValue3 = ((Number) pair3.f46059a).intValue();
                                    nal0 nal0VarU0 = x2x.u0(eh50Var, list2, zBooleanValue, capVar, (iIntValue == 0 && iIntValue2 == 0 && iIntValue3 == 0) ? null : new kal0(iIntValue, iIntValue2, iIntValue3));
                                    eh50 eh50Var2 = wf50Var.n;
                                    cap capVar2 = cap.f4022a;
                                    int iIntValue4 = ((Number) pair.b).intValue();
                                    int iIntValue5 = ((Number) pair2.b).intValue();
                                    int iIntValue6 = ((Number) pair3.b).intValue();
                                    j3nVar = new i3n(j83VarT0, qal0VarU, j83VarX, nal0VarU0, x2x.u0(eh50Var2, list2, zBooleanValue, capVar2, (iIntValue4 == 0 && iIntValue5 == 0 && iIntValue6 == 0) ? null : new kal0(iIntValue4, iIntValue5, iIntValue6)), new w9l0(x1x.V(wf50Var, bj50Var)));
                                } else if (uf50Var instanceof yf50) {
                                    yf50 yf50Var = (yf50) uf50Var;
                                    j3nVar = new k3n(n6x.t0(yf50Var), q5x.U(yf50Var, ctf0Var3, dj50Var), xww.X(yf50Var, ctf0Var3), yf50Var.m);
                                } else {
                                    if (uf50Var instanceof zf50) {
                                        zf50 zf50Var = (zf50) uf50Var;
                                        aj50 aj50Var = zf50Var.k;
                                        j83 j83VarT1 = n6x.t0(zf50Var);
                                        j83 j83VarX2 = xww.X(zf50Var, ctf0Var3);
                                        long jLongValue = 0;
                                        lsm0 lsm0Var = ctf0Var3.b;
                                        String strA = lsm0Var.a(R.string.live_new, Arrays.copyOf(new Object[0], 0));
                                        String str = aj50Var != null ? aj50Var.i : null;
                                        if (str == null) {
                                            str = "";
                                        }
                                        o9l0 o9l0Var = new o9l0(strA, str);
                                        eh50 eh50Var3 = zf50Var.n;
                                        cap capVar3 = cap.f4022a;
                                        jal0 jal0VarO = m2x.O(eh50Var3, list2, zBooleanValue);
                                        jal0 jal0VarO2 = m2x.O(zf50Var.o, list2, zBooleanValue);
                                        bj50 bj50VarV = q0x.V(zf50Var);
                                        List list3 = aj50Var != null ? aj50Var.c : null;
                                        if (list3 == null) {
                                            list3 = iun.f15405a;
                                        }
                                        int i5 = q3d.i(list3);
                                        ArrayList arrayList = new ArrayList(r3d.q(list3, 10));
                                        int i6 = 0;
                                        for (Object obj3 : list3) {
                                            int i7 = i6 + 1;
                                            if (i6 < 0) {
                                                q3d.p();
                                                throw null;
                                            }
                                            ih50 ih50Var = (ih50) obj3;
                                            if (i6 == i5) {
                                                zd90VarQ = m2x.Q(ih50Var, pzw.O(bj50VarV, bj50Var) ? pzw.B(bj50VarV.h, (bj50Var == null || (l3 = bj50Var.h) == null) ? 0L : l3.longValue()) : zi50.f44426a, pzw.O(bj50VarV, bj50Var) ? pzw.B(bj50VarV.i, (bj50Var == null || (l4 = bj50Var.i) == null) ? 0L : l4.longValue()) : zi50.f44426a);
                                            } else {
                                                zi50 zi50Var = zi50.f44426a;
                                                zd90VarQ = m2x.Q(ih50Var, zi50Var, zi50Var);
                                            }
                                            arrayList.add(zd90VarQ);
                                            i6 = i7;
                                        }
                                        i4 i4VarR0 = dyb.r0(arrayList);
                                        h83 h83Var = new h83();
                                        h83 h83Var2 = new h83();
                                        String strValueOf = String.valueOf((aj50Var == null || (jg50Var2 = aj50Var.d) == null || (l2 = jg50Var2.f16464a) == null) ? 0L : l2.longValue());
                                        strValueOf.getClass();
                                        long j4 = y3d.g;
                                        long j5 = daq0.c;
                                        long jM = x1x.M(pzw.F(bj50VarV, bj50Var));
                                        j56 j56Var = new j56(0.0f);
                                        k5q0 k5q0Var = k5q0.b;
                                        smk0 smk0Var = new smk0(jM, j5, null, null, null, null, null, j5, j56Var, null, null, j4, k5q0Var, null, null, 17424);
                                        h83Var2.c(strValueOf);
                                        StringBuilder sb2 = h83Var2.f12607a;
                                        h83Var2.a(smk0Var, 0, sb2.length());
                                        sb2.length();
                                        h83Var.b(h83Var2.h());
                                        j83 j83VarH = h83Var.h();
                                        h83 h83Var3 = new h83();
                                        h83 h83Var4 = new h83();
                                        if (aj50Var != null && (jg50Var = aj50Var.d) != null && (l = jg50Var.b) != null) {
                                            jLongValue = l.longValue();
                                        }
                                        String strValueOf2 = String.valueOf(jLongValue);
                                        strValueOf2.getClass();
                                        smk0 smk0Var2 = new smk0(x1x.M(pzw.G(bj50VarV, bj50Var)), j5, null, null, null, null, null, j5, new j56(0.0f), null, null, j4, k5q0Var, null, null, 17424);
                                        h83Var4.c(strValueOf2);
                                        StringBuilder sb3 = h83Var4.f12607a;
                                        h83Var4.a(smk0Var2, 0, sb3.length());
                                        sb3.length();
                                        h83Var3.b(h83Var4.h());
                                        zd90 zd90Var2 = new zd90(j83VarH, h83Var3.h(), lsm0Var.a(R.string.total_count, Arrays.copyOf(new Object[0], 0)));
                                        if ((aj50Var != null ? aj50Var.e : null) != null) {
                                            h83 h83Var5 = new h83();
                                            h83 h83Var6 = new h83();
                                            String str2 = aj50Var.e.f2643a;
                                            smk0 smk0Var3 = new smk0(x1x.M(pzw.O(bj50VarV, bj50Var) ? pzw.C(bj50VarV.f, bj50Var != null ? bj50Var.f : null) : zi50.f44426a), j5, null, null, null, null, null, j5, new j56(0.0f), null, null, j4, k5q0Var, null, null, 17424);
                                            h83Var6.c(str2);
                                            StringBuilder sb4 = h83Var6.f12607a;
                                            h83Var6.a(smk0Var3, 0, sb4.length());
                                            sb4.length();
                                            h83Var5.b(h83Var6.h());
                                            j83 j83VarH2 = h83Var5.h();
                                            h83 h83Var7 = new h83();
                                            h83 h83Var8 = new h83();
                                            String str3 = aj50Var.e.b;
                                            smk0 smk0Var4 = new smk0(x1x.M(pzw.O(bj50VarV, bj50Var) ? pzw.C(bj50VarV.g, bj50Var != null ? bj50Var.g : null) : zi50.f44426a), j5, null, null, null, null, null, j5, new j56(0.0f), null, null, j4, k5q0Var, null, null, 17424);
                                            h83Var8.c(str3);
                                            StringBuilder sb5 = h83Var8.f12607a;
                                            h83Var8.a(smk0Var4, 0, sb5.length());
                                            sb5.length();
                                            h83Var7.b(h83Var8.h());
                                            zd90Var = new zd90(j83VarH2, h83Var7.h(), lsm0Var.a(R.string.tennis_game_column, Arrays.copyOf(new Object[0], 0)));
                                        } else {
                                            zd90Var = null;
                                        }
                                        Long lValueOf = aj50Var != null ? Long.valueOf(aj50Var.f) : null;
                                        fex fexVar = (lValueOf != null && lValueOf.longValue() == 1) ? fex.f9426a : (lValueOf != null && lValueOf.longValue() == 2) ? fex.b : fex.c;
                                        if (i4VarR0.isEmpty()) {
                                            i4VarR0 = lak0.c;
                                        }
                                        h3nVar = new m3n(j83VarT1, j83VarX2, o9l0Var, jal0VarO, jal0VarO2, new aal0(fexVar, i4VarR0, zd90Var2, zd90Var, null));
                                    } else if (uf50Var instanceof vf50) {
                                        vf50 vf50Var = (vf50) uf50Var;
                                        aj50 aj50Var2 = vf50Var.k;
                                        if (aj50Var2 == null || (fg50Var = aj50Var2.b) == null) {
                                            j3nVar = yyw.d0(vf50Var, ctf0Var3, list2, zBooleanValue, dj50Var);
                                        } else {
                                            bg50 bg50Var = fg50Var.b;
                                            ri50 ri50Var = bg50Var != null ? bg50Var.f2538a : null;
                                            ng50 ng50Var = fg50Var.f9477a;
                                            if (ng50Var == null) {
                                                j3nVar = yyw.d0(vf50Var, ctf0Var3, list2, zBooleanValue, dj50Var);
                                            } else {
                                                long j6 = ng50Var.f23469a;
                                                bj50 bj50VarV2 = q0x.V(vf50Var);
                                                j83 j83VarT2 = n6x.t0(vf50Var);
                                                j83 j83VarX3 = xww.X(vf50Var, ctf0Var3);
                                                o9l0 o9l0Var2 = new o9l0(ctf0Var3.b.a(R.string.live_new, Arrays.copyOf(new Object[0], 0)), aj50Var2.i);
                                                fex fexVar2 = j6 == 1 ? fex.f9426a : j6 == 2 ? fex.b : fex.c;
                                                eh50 eh50Var4 = vf50Var.m;
                                                cap capVar4 = cap.f4022a;
                                                h3nVar = new h3n(j83VarT2, j83VarX3, o9l0Var2, fexVar2, yyw.e0(eh50Var4, list2, zBooleanValue), yyw.e0(vf50Var.n, list2, zBooleanValue), yyw.b0(ri50Var != null ? ri50Var.f30523a : null, ng50Var, j6 == 1, pzw.D(bj50VarV2, bj50Var, true)), yyw.b0(ri50Var != null ? ri50Var.b : null, ng50Var, j6 == 2, pzw.D(bj50VarV2, bj50Var, false)));
                                            }
                                        }
                                    } else {
                                        if (!(uf50Var instanceof xf50)) {
                                            t9f.b();
                                            return null;
                                        }
                                        xf50 xf50Var = (xf50) uf50Var;
                                        j3nVar = new j3n(n6x.t0(xf50Var), xww.X(xf50Var, ctf0Var3), q5x.U(xf50Var, ctf0Var3, dj50Var), q0x.R(xf50Var.m, pep0.b), q0x.R(xf50Var.n, pep0.f26864a), new w9l0(x1x.V(xf50Var, bj50Var)));
                                    }
                                    j3nVar = h3nVar;
                                }
                            } else if (uf50Var instanceof wf50) {
                                wf50 wf50Var2 = (wf50) uf50Var;
                                j3nVar = new i3n(n6x.t0(wf50Var2), q5x.T(wf50Var2, ctf0Var3, dj50Var), xww.W(wf50Var2, ctf0Var3), x2x.u0(wf50Var2.m, list2, zBooleanValue, cap.b, null), x2x.u0(wf50Var2.n, list2, zBooleanValue, cap.f4022a, null), new v9l0(x1x.U(wf50Var2, ctf0Var3)));
                            } else if (uf50Var instanceof yf50) {
                                yf50 yf50Var2 = (yf50) uf50Var;
                                j3nVar = new k3n(n6x.t0(yf50Var2), q5x.T(yf50Var2, ctf0Var3, dj50Var), xww.W(yf50Var2, ctf0Var3), yf50Var2.m);
                            } else if (uf50Var instanceof zf50) {
                                zf50 zf50Var2 = (zf50) uf50Var;
                                j3nVar = new i3n(n6x.t0(zf50Var2), q5x.T(zf50Var2, ctf0Var3, dj50Var), xww.W(zf50Var2, ctf0Var3), x2x.u0(zf50Var2.n, list2, zBooleanValue, cap.b, null), x2x.u0(zf50Var2.o, list2, zBooleanValue, cap.f4022a, null), new v9l0(x1x.U(zf50Var2, ctf0Var3)));
                            } else if (uf50Var instanceof vf50) {
                                vf50 vf50Var2 = (vf50) uf50Var;
                                j3nVar = new i3n(n6x.t0(vf50Var2), q5x.T(vf50Var2, ctf0Var3, dj50Var), xww.W(vf50Var2, ctf0Var3), x2x.u0(vf50Var2.m, list2, zBooleanValue, cap.b, null), x2x.u0(vf50Var2.n, list2, zBooleanValue, cap.f4022a, null), new v9l0(x1x.U(vf50Var2, ctf0Var3)));
                            } else {
                                obj2 = null;
                                if (uf50Var instanceof xf50) {
                                    xf50 xf50Var2 = (xf50) uf50Var;
                                    j3nVar = new j3n(n6x.t0(xf50Var2), xww.W(xf50Var2, ctf0Var3), q5x.T(xf50Var2, ctf0Var3, dj50Var), q0x.R(xf50Var2.m, pep0.b), q0x.R(xf50Var2.n, pep0.f26864a), new v9l0(x1x.U(xf50Var2, ctf0Var3)));
                                } else {
                                    t9f.b();
                                }
                            }
                            return new x72(j3nVar);
                        }
                        obj2 = null;
                        t9f.b();
                        return obj2;
                    case 2:
                        lwk0 lwk0Var = (lwk0) obj;
                        lwk0Var.getClass();
                        n0o0 n0o0Var = p92Var.c;
                        int i8 = ((b92) ((fee) n0o0Var.getValue()).c()).f2186a;
                        String str4 = ((b92) ((fee) n0o0Var.getValue()).c()).b;
                        str4.getClass();
                        List<SpecialEventTabs> list4 = lwk0Var.b;
                        int iIndexOf = list4.indexOf(lwk0Var.f20768a);
                        ArrayList arrayList2 = new ArrayList(r3d.q(list4, 10));
                        for (SpecialEventTabs specialEventTabs : list4) {
                            int iOrdinal = specialEventTabs.ordinal();
                            SpecialEventTab.Schedule schedule = SpecialEventTab.Schedule.c;
                            if (iOrdinal != 0) {
                                if (iOrdinal == 1) {
                                    specialEventTab2 = SpecialEventTab.MyGames.c;
                                } else {
                                    if (iOrdinal != 2) {
                                        if (iOrdinal == 3) {
                                            specialEventTab2 = SpecialEventTab.Tournament.c;
                                        } else {
                                            t9f.b();
                                        }
                                        return null;
                                    }
                                    specialEventTab2 = SpecialEventTab.Statistic.c;
                                }
                                specialEventTab = specialEventTab2;
                            } else {
                                specialEventTab = schedule;
                            }
                            boolean zEquals = specialEventTab.equals(schedule);
                            int iOrdinal2 = specialEventTabs.ordinal();
                            if (iOrdinal2 == 0) {
                                list = lwk0Var.d;
                            } else if (iOrdinal2 == 1) {
                                list = lwk0Var.e;
                            } else if (iOrdinal2 == 2) {
                                list = lwk0Var.f;
                            } else {
                                if (iOrdinal2 != 3) {
                                    t9f.b();
                                    return null;
                                }
                                list = lwk0Var.g;
                            }
                            arrayList2.add(new SpecialEventTabScreenParams(i8, str4, specialEventTab, zEquals, list));
                        }
                        return new q4i0(iIndexOf, arrayList2);
                    default:
                        lwk0 lwk0Var2 = (lwk0) obj;
                        lwk0Var2.getClass();
                        List list5 = lwk0Var2.b;
                        if (list5.isEmpty() || list5.size() == 1) {
                            return null;
                        }
                        ctf0 ctf0Var4 = p92Var.b;
                        ctf0Var4.getClass();
                        lsm0 lsm0Var2 = ctf0Var4.b;
                        float f = ctf0Var4.j() ? 32.0f : 8.0f;
                        ArrayList arrayList3 = new ArrayList(r3d.q(list5, 10));
                        Iterator it = list5.iterator();
                        int i9 = 0;
                        while (it.hasNext()) {
                            Object next = it.next();
                            int i10 = i9 + 1;
                            if (i9 < 0) {
                                q3d.p();
                                throw null;
                            }
                            SpecialEventTabs specialEventTabs2 = (SpecialEventTabs) next;
                            long j7 = i9;
                            specialEventTabs2.getClass();
                            int iOrdinal3 = specialEventTabs2.ordinal();
                            if (iOrdinal3 == 0) {
                                aylVar = new ayl(lsm0Var2.a(R.string.schedule, Arrays.copyOf(new Object[0], 0)), new m0x(R.drawable.ic_glyph_calendar_inactive, null, 6), null, 28);
                            } else if (iOrdinal3 == i4) {
                                aylVar = new ayl(lsm0Var2.a(R.string.special_event_my_games, Arrays.copyOf(new Object[0], 0)), new m0x(R.drawable.ic_glyph_bookmark, null, 6), null, 28);
                            } else if (iOrdinal3 == i2) {
                                aylVar = new ayl(lsm0Var2.a(R.string.statistic, Arrays.copyOf(new Object[0], 0)), new m0x(R.drawable.ic_glyph_statistics, null, 6), null, 28);
                            } else {
                                if (iOrdinal3 != i) {
                                    t9f.b();
                                    return null;
                                }
                                aylVar = new ayl(lsm0Var2.a(R.string.tournament, Arrays.copyOf(new Object[i3], i3)), new m0x(R.drawable.ic_glyph_tournaments, null, 6), null, 28);
                            }
                            arrayList3.add(new lxl(j7, (dyl) aylVar, false, specialEventTabs2 == lwk0Var2.f20768a ? uxl.b : uxl.f36445a, (cwl) null, 104));
                            it = it;
                            i9 = i10;
                            i = 3;
                            i2 = 2;
                            i3 = 0;
                            i4 = 1;
                        }
                        return new fyl(dyb.o0(arrayList3), null, null, s5x0.u(f, 0.0f, 0.0f, 0.0f, 14), null, 22);
                }
            }
        }, (byte) 20));
        this.m = n0o0VarB;
        final byte b4 = 3;
        this.n = bkb.G(((fee) n0o0VarB.getValue()).d, new Function1(this) { // from class: a.o92
            public final /* synthetic */ p92 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Object obj2;
                n3n j3nVar;
                fg50 fg50Var;
                n3n h3nVar;
                zd90 zd90Var;
                jg50 jg50Var;
                Long l;
                jg50 jg50Var2;
                Long l2;
                zd90 zd90VarQ;
                Long l3;
                Long l4;
                SpecialEventTab specialEventTab;
                List list;
                SpecialEventTab specialEventTab2;
                ayl aylVar;
                byte b5 = b4;
                int i = 3;
                int i2 = 2;
                int i3 = 0;
                int i4 = 1;
                p92 p92Var = this.b;
                switch (b5) {
                    case 0:
                        long j = ((ynq0) obj).f42952a;
                        ctf0 ctf0Var2 = p92Var.b;
                        ctf0Var2.getClass();
                        long jE = ynq0.e(j);
                        if (jE > 0) {
                            StringBuilder sb = new StringBuilder();
                            long j2 = jE / 86400000;
                            if (j2 > 0) {
                                sb.append(ctf0Var2.b.a(R.string.days_v2, Arrays.copyOf(new Object[]{Long.valueOf(j2)}, 1)));
                            }
                            long jE2 = jE - wen.e(ibc.w0(j2, bfn.DAYS));
                            long j3 = jE2 / 3600000;
                            if (j3 > 0) {
                                if (sb.length() > 0) {
                                    sb.append(Separators.SP);
                                }
                                sb.append(ctf0Var2.b.a(R.string.limit_third_hour_declination_v2, Arrays.copyOf(new Object[]{Long.valueOf(j3)}, 1)));
                            }
                            long jE3 = (jE2 - wen.e(ibc.w0(j3, bfn.HOURS))) / 60000;
                            if (jE3 > 0) {
                                if (sb.length() > 0) {
                                    sb.append(Separators.SP);
                                }
                                sb.append(ctf0Var2.b.a(R.string.reality_minute_v2, Arrays.copyOf(new Object[]{Long.valueOf(jE3)}, 1)));
                            }
                            if (sb.length() != 0) {
                                return ctf0Var2.b.a(R.string.time_before_event, Arrays.copyOf(new Object[0], 0)) + Separators.SP + ((Object) sb);
                            }
                        }
                        return null;
                    case 1:
                        yi50 yi50Var = (yi50) obj;
                        yi50Var.getClass();
                        if (yi50Var instanceof wi50) {
                            return w72.f38650a;
                        }
                        if (yi50Var instanceof vi50) {
                            return new v72(((b92) ((fee) p92Var.c.getValue()).c()).b, (String) ((fee) p92Var.h.getValue()).b());
                        }
                        if (yi50Var instanceof xi50) {
                            uf50 uf50Var = ((xi50) yi50Var).f40928a;
                            ctf0 ctf0Var3 = p92Var.b;
                            List list2 = (List) ((fee) p92Var.f.getValue()).c();
                            boolean zBooleanValue = ((Boolean) ((fee) p92Var.g.getValue()).c()).booleanValue();
                            dj50 dj50Var = (dj50) ((fee) p92Var.j.getValue()).c();
                            bj50 bj50Var = (bj50) ((fee) p92Var.k.getValue()).c();
                            uf50Var.getClass();
                            ctf0Var3.getClass();
                            list2.getClass();
                            if (uf50Var.i()) {
                                if (uf50Var instanceof wf50) {
                                    wf50 wf50Var = (wf50) uf50Var;
                                    j83 j83VarT0 = n6x.t0(wf50Var);
                                    j83 j83VarX = xww.X(wf50Var, ctf0Var3);
                                    qal0 qal0VarU = q5x.U(wf50Var, ctf0Var3, dj50Var);
                                    eh50 eh50Var = wf50Var.m;
                                    cap capVar = cap.b;
                                    Pair pair = wf50Var.o;
                                    int iIntValue = ((Number) pair.f46059a).intValue();
                                    Pair pair2 = wf50Var.p;
                                    int iIntValue2 = ((Number) pair2.f46059a).intValue();
                                    Pair pair3 = wf50Var.q;
                                    int iIntValue3 = ((Number) pair3.f46059a).intValue();
                                    nal0 nal0VarU0 = x2x.u0(eh50Var, list2, zBooleanValue, capVar, (iIntValue == 0 && iIntValue2 == 0 && iIntValue3 == 0) ? null : new kal0(iIntValue, iIntValue2, iIntValue3));
                                    eh50 eh50Var2 = wf50Var.n;
                                    cap capVar2 = cap.f4022a;
                                    int iIntValue4 = ((Number) pair.b).intValue();
                                    int iIntValue5 = ((Number) pair2.b).intValue();
                                    int iIntValue6 = ((Number) pair3.b).intValue();
                                    j3nVar = new i3n(j83VarT0, qal0VarU, j83VarX, nal0VarU0, x2x.u0(eh50Var2, list2, zBooleanValue, capVar2, (iIntValue4 == 0 && iIntValue5 == 0 && iIntValue6 == 0) ? null : new kal0(iIntValue4, iIntValue5, iIntValue6)), new w9l0(x1x.V(wf50Var, bj50Var)));
                                } else if (uf50Var instanceof yf50) {
                                    yf50 yf50Var = (yf50) uf50Var;
                                    j3nVar = new k3n(n6x.t0(yf50Var), q5x.U(yf50Var, ctf0Var3, dj50Var), xww.X(yf50Var, ctf0Var3), yf50Var.m);
                                } else {
                                    if (uf50Var instanceof zf50) {
                                        zf50 zf50Var = (zf50) uf50Var;
                                        aj50 aj50Var = zf50Var.k;
                                        j83 j83VarT1 = n6x.t0(zf50Var);
                                        j83 j83VarX2 = xww.X(zf50Var, ctf0Var3);
                                        long jLongValue = 0;
                                        lsm0 lsm0Var = ctf0Var3.b;
                                        String strA = lsm0Var.a(R.string.live_new, Arrays.copyOf(new Object[0], 0));
                                        String str = aj50Var != null ? aj50Var.i : null;
                                        if (str == null) {
                                            str = "";
                                        }
                                        o9l0 o9l0Var = new o9l0(strA, str);
                                        eh50 eh50Var3 = zf50Var.n;
                                        cap capVar3 = cap.f4022a;
                                        jal0 jal0VarO = m2x.O(eh50Var3, list2, zBooleanValue);
                                        jal0 jal0VarO2 = m2x.O(zf50Var.o, list2, zBooleanValue);
                                        bj50 bj50VarV = q0x.V(zf50Var);
                                        List list3 = aj50Var != null ? aj50Var.c : null;
                                        if (list3 == null) {
                                            list3 = iun.f15405a;
                                        }
                                        int i5 = q3d.i(list3);
                                        ArrayList arrayList = new ArrayList(r3d.q(list3, 10));
                                        int i6 = 0;
                                        for (Object obj3 : list3) {
                                            int i7 = i6 + 1;
                                            if (i6 < 0) {
                                                q3d.p();
                                                throw null;
                                            }
                                            ih50 ih50Var = (ih50) obj3;
                                            if (i6 == i5) {
                                                zd90VarQ = m2x.Q(ih50Var, pzw.O(bj50VarV, bj50Var) ? pzw.B(bj50VarV.h, (bj50Var == null || (l3 = bj50Var.h) == null) ? 0L : l3.longValue()) : zi50.f44426a, pzw.O(bj50VarV, bj50Var) ? pzw.B(bj50VarV.i, (bj50Var == null || (l4 = bj50Var.i) == null) ? 0L : l4.longValue()) : zi50.f44426a);
                                            } else {
                                                zi50 zi50Var = zi50.f44426a;
                                                zd90VarQ = m2x.Q(ih50Var, zi50Var, zi50Var);
                                            }
                                            arrayList.add(zd90VarQ);
                                            i6 = i7;
                                        }
                                        i4 i4VarR0 = dyb.r0(arrayList);
                                        h83 h83Var = new h83();
                                        h83 h83Var2 = new h83();
                                        String strValueOf = String.valueOf((aj50Var == null || (jg50Var2 = aj50Var.d) == null || (l2 = jg50Var2.f16464a) == null) ? 0L : l2.longValue());
                                        strValueOf.getClass();
                                        long j4 = y3d.g;
                                        long j5 = daq0.c;
                                        long jM = x1x.M(pzw.F(bj50VarV, bj50Var));
                                        j56 j56Var = new j56(0.0f);
                                        k5q0 k5q0Var = k5q0.b;
                                        smk0 smk0Var = new smk0(jM, j5, null, null, null, null, null, j5, j56Var, null, null, j4, k5q0Var, null, null, 17424);
                                        h83Var2.c(strValueOf);
                                        StringBuilder sb2 = h83Var2.f12607a;
                                        h83Var2.a(smk0Var, 0, sb2.length());
                                        sb2.length();
                                        h83Var.b(h83Var2.h());
                                        j83 j83VarH = h83Var.h();
                                        h83 h83Var3 = new h83();
                                        h83 h83Var4 = new h83();
                                        if (aj50Var != null && (jg50Var = aj50Var.d) != null && (l = jg50Var.b) != null) {
                                            jLongValue = l.longValue();
                                        }
                                        String strValueOf2 = String.valueOf(jLongValue);
                                        strValueOf2.getClass();
                                        smk0 smk0Var2 = new smk0(x1x.M(pzw.G(bj50VarV, bj50Var)), j5, null, null, null, null, null, j5, new j56(0.0f), null, null, j4, k5q0Var, null, null, 17424);
                                        h83Var4.c(strValueOf2);
                                        StringBuilder sb3 = h83Var4.f12607a;
                                        h83Var4.a(smk0Var2, 0, sb3.length());
                                        sb3.length();
                                        h83Var3.b(h83Var4.h());
                                        zd90 zd90Var2 = new zd90(j83VarH, h83Var3.h(), lsm0Var.a(R.string.total_count, Arrays.copyOf(new Object[0], 0)));
                                        if ((aj50Var != null ? aj50Var.e : null) != null) {
                                            h83 h83Var5 = new h83();
                                            h83 h83Var6 = new h83();
                                            String str2 = aj50Var.e.f2643a;
                                            smk0 smk0Var3 = new smk0(x1x.M(pzw.O(bj50VarV, bj50Var) ? pzw.C(bj50VarV.f, bj50Var != null ? bj50Var.f : null) : zi50.f44426a), j5, null, null, null, null, null, j5, new j56(0.0f), null, null, j4, k5q0Var, null, null, 17424);
                                            h83Var6.c(str2);
                                            StringBuilder sb4 = h83Var6.f12607a;
                                            h83Var6.a(smk0Var3, 0, sb4.length());
                                            sb4.length();
                                            h83Var5.b(h83Var6.h());
                                            j83 j83VarH2 = h83Var5.h();
                                            h83 h83Var7 = new h83();
                                            h83 h83Var8 = new h83();
                                            String str3 = aj50Var.e.b;
                                            smk0 smk0Var4 = new smk0(x1x.M(pzw.O(bj50VarV, bj50Var) ? pzw.C(bj50VarV.g, bj50Var != null ? bj50Var.g : null) : zi50.f44426a), j5, null, null, null, null, null, j5, new j56(0.0f), null, null, j4, k5q0Var, null, null, 17424);
                                            h83Var8.c(str3);
                                            StringBuilder sb5 = h83Var8.f12607a;
                                            h83Var8.a(smk0Var4, 0, sb5.length());
                                            sb5.length();
                                            h83Var7.b(h83Var8.h());
                                            zd90Var = new zd90(j83VarH2, h83Var7.h(), lsm0Var.a(R.string.tennis_game_column, Arrays.copyOf(new Object[0], 0)));
                                        } else {
                                            zd90Var = null;
                                        }
                                        Long lValueOf = aj50Var != null ? Long.valueOf(aj50Var.f) : null;
                                        fex fexVar = (lValueOf != null && lValueOf.longValue() == 1) ? fex.f9426a : (lValueOf != null && lValueOf.longValue() == 2) ? fex.b : fex.c;
                                        if (i4VarR0.isEmpty()) {
                                            i4VarR0 = lak0.c;
                                        }
                                        h3nVar = new m3n(j83VarT1, j83VarX2, o9l0Var, jal0VarO, jal0VarO2, new aal0(fexVar, i4VarR0, zd90Var2, zd90Var, null));
                                    } else if (uf50Var instanceof vf50) {
                                        vf50 vf50Var = (vf50) uf50Var;
                                        aj50 aj50Var2 = vf50Var.k;
                                        if (aj50Var2 == null || (fg50Var = aj50Var2.b) == null) {
                                            j3nVar = yyw.d0(vf50Var, ctf0Var3, list2, zBooleanValue, dj50Var);
                                        } else {
                                            bg50 bg50Var = fg50Var.b;
                                            ri50 ri50Var = bg50Var != null ? bg50Var.f2538a : null;
                                            ng50 ng50Var = fg50Var.f9477a;
                                            if (ng50Var == null) {
                                                j3nVar = yyw.d0(vf50Var, ctf0Var3, list2, zBooleanValue, dj50Var);
                                            } else {
                                                long j6 = ng50Var.f23469a;
                                                bj50 bj50VarV2 = q0x.V(vf50Var);
                                                j83 j83VarT2 = n6x.t0(vf50Var);
                                                j83 j83VarX3 = xww.X(vf50Var, ctf0Var3);
                                                o9l0 o9l0Var2 = new o9l0(ctf0Var3.b.a(R.string.live_new, Arrays.copyOf(new Object[0], 0)), aj50Var2.i);
                                                fex fexVar2 = j6 == 1 ? fex.f9426a : j6 == 2 ? fex.b : fex.c;
                                                eh50 eh50Var4 = vf50Var.m;
                                                cap capVar4 = cap.f4022a;
                                                h3nVar = new h3n(j83VarT2, j83VarX3, o9l0Var2, fexVar2, yyw.e0(eh50Var4, list2, zBooleanValue), yyw.e0(vf50Var.n, list2, zBooleanValue), yyw.b0(ri50Var != null ? ri50Var.f30523a : null, ng50Var, j6 == 1, pzw.D(bj50VarV2, bj50Var, true)), yyw.b0(ri50Var != null ? ri50Var.b : null, ng50Var, j6 == 2, pzw.D(bj50VarV2, bj50Var, false)));
                                            }
                                        }
                                    } else {
                                        if (!(uf50Var instanceof xf50)) {
                                            t9f.b();
                                            return null;
                                        }
                                        xf50 xf50Var = (xf50) uf50Var;
                                        j3nVar = new j3n(n6x.t0(xf50Var), xww.X(xf50Var, ctf0Var3), q5x.U(xf50Var, ctf0Var3, dj50Var), q0x.R(xf50Var.m, pep0.b), q0x.R(xf50Var.n, pep0.f26864a), new w9l0(x1x.V(xf50Var, bj50Var)));
                                    }
                                    j3nVar = h3nVar;
                                }
                            } else if (uf50Var instanceof wf50) {
                                wf50 wf50Var2 = (wf50) uf50Var;
                                j3nVar = new i3n(n6x.t0(wf50Var2), q5x.T(wf50Var2, ctf0Var3, dj50Var), xww.W(wf50Var2, ctf0Var3), x2x.u0(wf50Var2.m, list2, zBooleanValue, cap.b, null), x2x.u0(wf50Var2.n, list2, zBooleanValue, cap.f4022a, null), new v9l0(x1x.U(wf50Var2, ctf0Var3)));
                            } else if (uf50Var instanceof yf50) {
                                yf50 yf50Var2 = (yf50) uf50Var;
                                j3nVar = new k3n(n6x.t0(yf50Var2), q5x.T(yf50Var2, ctf0Var3, dj50Var), xww.W(yf50Var2, ctf0Var3), yf50Var2.m);
                            } else if (uf50Var instanceof zf50) {
                                zf50 zf50Var2 = (zf50) uf50Var;
                                j3nVar = new i3n(n6x.t0(zf50Var2), q5x.T(zf50Var2, ctf0Var3, dj50Var), xww.W(zf50Var2, ctf0Var3), x2x.u0(zf50Var2.n, list2, zBooleanValue, cap.b, null), x2x.u0(zf50Var2.o, list2, zBooleanValue, cap.f4022a, null), new v9l0(x1x.U(zf50Var2, ctf0Var3)));
                            } else if (uf50Var instanceof vf50) {
                                vf50 vf50Var2 = (vf50) uf50Var;
                                j3nVar = new i3n(n6x.t0(vf50Var2), q5x.T(vf50Var2, ctf0Var3, dj50Var), xww.W(vf50Var2, ctf0Var3), x2x.u0(vf50Var2.m, list2, zBooleanValue, cap.b, null), x2x.u0(vf50Var2.n, list2, zBooleanValue, cap.f4022a, null), new v9l0(x1x.U(vf50Var2, ctf0Var3)));
                            } else {
                                obj2 = null;
                                if (uf50Var instanceof xf50) {
                                    xf50 xf50Var2 = (xf50) uf50Var;
                                    j3nVar = new j3n(n6x.t0(xf50Var2), xww.W(xf50Var2, ctf0Var3), q5x.T(xf50Var2, ctf0Var3, dj50Var), q0x.R(xf50Var2.m, pep0.b), q0x.R(xf50Var2.n, pep0.f26864a), new v9l0(x1x.U(xf50Var2, ctf0Var3)));
                                } else {
                                    t9f.b();
                                }
                            }
                            return new x72(j3nVar);
                        }
                        obj2 = null;
                        t9f.b();
                        return obj2;
                    case 2:
                        lwk0 lwk0Var = (lwk0) obj;
                        lwk0Var.getClass();
                        n0o0 n0o0Var = p92Var.c;
                        int i8 = ((b92) ((fee) n0o0Var.getValue()).c()).f2186a;
                        String str4 = ((b92) ((fee) n0o0Var.getValue()).c()).b;
                        str4.getClass();
                        List<SpecialEventTabs> list4 = lwk0Var.b;
                        int iIndexOf = list4.indexOf(lwk0Var.f20768a);
                        ArrayList arrayList2 = new ArrayList(r3d.q(list4, 10));
                        for (SpecialEventTabs specialEventTabs : list4) {
                            int iOrdinal = specialEventTabs.ordinal();
                            SpecialEventTab.Schedule schedule = SpecialEventTab.Schedule.c;
                            if (iOrdinal != 0) {
                                if (iOrdinal == 1) {
                                    specialEventTab2 = SpecialEventTab.MyGames.c;
                                } else {
                                    if (iOrdinal != 2) {
                                        if (iOrdinal == 3) {
                                            specialEventTab2 = SpecialEventTab.Tournament.c;
                                        } else {
                                            t9f.b();
                                        }
                                        return null;
                                    }
                                    specialEventTab2 = SpecialEventTab.Statistic.c;
                                }
                                specialEventTab = specialEventTab2;
                            } else {
                                specialEventTab = schedule;
                            }
                            boolean zEquals = specialEventTab.equals(schedule);
                            int iOrdinal2 = specialEventTabs.ordinal();
                            if (iOrdinal2 == 0) {
                                list = lwk0Var.d;
                            } else if (iOrdinal2 == 1) {
                                list = lwk0Var.e;
                            } else if (iOrdinal2 == 2) {
                                list = lwk0Var.f;
                            } else {
                                if (iOrdinal2 != 3) {
                                    t9f.b();
                                    return null;
                                }
                                list = lwk0Var.g;
                            }
                            arrayList2.add(new SpecialEventTabScreenParams(i8, str4, specialEventTab, zEquals, list));
                        }
                        return new q4i0(iIndexOf, arrayList2);
                    default:
                        lwk0 lwk0Var2 = (lwk0) obj;
                        lwk0Var2.getClass();
                        List list5 = lwk0Var2.b;
                        if (list5.isEmpty() || list5.size() == 1) {
                            return null;
                        }
                        ctf0 ctf0Var4 = p92Var.b;
                        ctf0Var4.getClass();
                        lsm0 lsm0Var2 = ctf0Var4.b;
                        float f = ctf0Var4.j() ? 32.0f : 8.0f;
                        ArrayList arrayList3 = new ArrayList(r3d.q(list5, 10));
                        Iterator it = list5.iterator();
                        int i9 = 0;
                        while (it.hasNext()) {
                            Object next = it.next();
                            int i10 = i9 + 1;
                            if (i9 < 0) {
                                q3d.p();
                                throw null;
                            }
                            SpecialEventTabs specialEventTabs2 = (SpecialEventTabs) next;
                            long j7 = i9;
                            specialEventTabs2.getClass();
                            int iOrdinal3 = specialEventTabs2.ordinal();
                            if (iOrdinal3 == 0) {
                                aylVar = new ayl(lsm0Var2.a(R.string.schedule, Arrays.copyOf(new Object[0], 0)), new m0x(R.drawable.ic_glyph_calendar_inactive, null, 6), null, 28);
                            } else if (iOrdinal3 == i4) {
                                aylVar = new ayl(lsm0Var2.a(R.string.special_event_my_games, Arrays.copyOf(new Object[0], 0)), new m0x(R.drawable.ic_glyph_bookmark, null, 6), null, 28);
                            } else if (iOrdinal3 == i2) {
                                aylVar = new ayl(lsm0Var2.a(R.string.statistic, Arrays.copyOf(new Object[0], 0)), new m0x(R.drawable.ic_glyph_statistics, null, 6), null, 28);
                            } else {
                                if (iOrdinal3 != i) {
                                    t9f.b();
                                    return null;
                                }
                                aylVar = new ayl(lsm0Var2.a(R.string.tournament, Arrays.copyOf(new Object[i3], i3)), new m0x(R.drawable.ic_glyph_tournaments, null, 6), null, 28);
                            }
                            arrayList3.add(new lxl(j7, (dyl) aylVar, false, specialEventTabs2 == lwk0Var2.f20768a ? uxl.b : uxl.f36445a, (cwl) null, 104));
                            it = it;
                            i9 = i10;
                            i = 3;
                            i2 = 2;
                            i3 = 0;
                            i4 = 1;
                        }
                        return new fyl(dyb.o0(arrayList3), null, null, s5x0.u(f, 0.0f, 0.0f, 0.0f, 14), null, 22);
                }
            }
        });
    }

    public p92(final jpk0 jpk0Var, ctf0 ctf0Var) {
        final byte b = 2;
        ctf0Var.getClass();
        this.b = ctf0Var;
        final byte b2 = 0;
        this.c = maz.b(new Function0() { // from class: a.lpk0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b3 = b2;
                jpk0 jpk0Var2 = jpk0Var;
                switch (b3) {
                    case 0:
                        return Integer.valueOf(jpk0Var2.h.c ? R.drawable.bg_special_event_tablet : R.drawable.bg_special_event_default);
                    default:
                        ipk0 ipk0Var = jpk0Var2.h;
                        if (ipk0Var.c) {
                            return ohk.c;
                        }
                        return ipk0Var.d ? ohk.f25268a : ohk.b;
                }
            }
        });
        final byte b3 = 1;
        this.d = maz.b(new Function0() { // from class: a.lpk0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b4 = b3;
                jpk0 jpk0Var2 = jpk0Var;
                switch (b4) {
                    case 0:
                        return Integer.valueOf(jpk0Var2.h.c ? R.drawable.bg_special_event_tablet : R.drawable.bg_special_event_default);
                    default:
                        ipk0 ipk0Var = jpk0Var2.h;
                        if (ipk0Var.c) {
                            return ohk.c;
                        }
                        return ipk0Var.d ? ohk.f25268a : ohk.b;
                }
            }
        });
        n0o0 n0o0VarH = bkb.H(jpk0Var.b);
        this.e = n0o0VarH;
        n0o0 n0o0VarH2 = bkb.H(jpk0Var.c);
        this.f = n0o0VarH2;
        this.g = bkb.H(jpk0Var.d);
        this.h = bkb.H(jpk0Var.e);
        this.i = maz.b(new yw9(new ynq0(jpk0Var.f), new Function1(this) { // from class: a.mpk0
            public final /* synthetic */ p92 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i;
                byte b4 = b2;
                p92 p92Var = this.b;
                switch (b4) {
                    case 0:
                        long j = ((ynq0) obj).f42952a;
                        ctf0 ctf0Var2 = p92Var.b;
                        ctf0Var2.getClass();
                        long jE = ynq0.e(j);
                        if (jE <= 0) {
                            return null;
                        }
                        StringBuilder sb = new StringBuilder();
                        long j2 = jE / 86400000;
                        if (j2 > 0) {
                            sb.append(ctf0Var2.b.a(R.string.days_v2, Arrays.copyOf(new Object[]{Long.valueOf(j2)}, 1)));
                        }
                        long jE2 = jE - wen.e(ibc.w0(j2, bfn.DAYS));
                        long j3 = jE2 / 3600000;
                        if (j3 > 0) {
                            if (sb.length() > 0) {
                                sb.append(Separators.SP);
                            }
                            sb.append(ctf0Var2.b.a(R.string.limit_third_hour_declination_v2, Arrays.copyOf(new Object[]{Long.valueOf(j3)}, 1)));
                        }
                        long jE3 = (jE2 - wen.e(ibc.w0(j3, bfn.HOURS))) / 60000;
                        if (jE3 > 0) {
                            if (sb.length() > 0) {
                                sb.append(Separators.SP);
                            }
                            sb.append(ctf0Var2.b.a(R.string.reality_minute_v2, Arrays.copyOf(new Object[]{Long.valueOf(jE3)}, 1)));
                        }
                        if (sb.length() <= 0) {
                            return null;
                        }
                        String string = sb.toString();
                        String upperCase = ctf0Var2.b.a(R.string.time_before_event, Arrays.copyOf(new Object[0], 0)).toUpperCase(Locale.ROOT);
                        upperCase.getClass();
                        return new vnq0(string, upperCase);
                    case 1:
                        lwk0 lwk0Var = (lwk0) obj;
                        lwk0Var.getClass();
                        ctf0 ctf0Var3 = p92Var.b;
                        ctf0Var3.getClass();
                        List<SpecialEventTabs> list = lwk0Var.b;
                        int iIndexOf = list.indexOf(lwk0Var.f20768a);
                        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                        for (SpecialEventTabs specialEventTabs : list) {
                            specialEventTabs.getClass();
                            int iOrdinal = specialEventTabs.ordinal();
                            if (iOrdinal == 0) {
                                i = R.string.schedule;
                            } else if (iOrdinal == 1) {
                                i = R.string.special_event_my_games;
                            } else if (iOrdinal == 2) {
                                i = R.string.statistic;
                            } else {
                                if (iOrdinal != 3) {
                                    t9f.b();
                                    return null;
                                }
                                i = R.string.tournament;
                            }
                            arrayList.add(new yvh0(ctf0Var3.b.a(i, Arrays.copyOf(new Object[0], 0)), bwh0.f3325a));
                        }
                        return new mwk0(iIndexOf, dyb.o0(arrayList), lwk0Var.c);
                    case 2:
                        ((String) obj).getClass();
                        return new wnk0((String) ((fee) p92Var.e.getValue()).c(), (ohk) p92Var.d.getValue(), (vnq0) ((fee) p92Var.i.getValue()).b());
                    case 3:
                        ((String) obj).getClass();
                        return new z1d((String) ((fee) p92Var.f.getValue()).c(), (String) ((fee) p92Var.g.getValue()).c(), (String) ((fee) p92Var.h.getValue()).c(), (ohk) p92Var.d.getValue(), ((Number) p92Var.c.getValue()).intValue());
                    default:
                        ((String) obj).getClass();
                        String str = (String) ((fee) p92Var.e.getValue()).c();
                        vnq0 vnq0Var = (vnq0) ((fee) p92Var.i.getValue()).b();
                        return new owk0(str, vnq0Var != null ? vnq0Var.f37732a : null);
                }
            }
        }, (byte) 20));
        lwk0 lwk0Var = jpk0Var.g;
        this.j = maz.b(new yw9(lwk0Var, new Function1(this) { // from class: a.mpk0
            public final /* synthetic */ p92 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i;
                byte b4 = b3;
                p92 p92Var = this.b;
                switch (b4) {
                    case 0:
                        long j = ((ynq0) obj).f42952a;
                        ctf0 ctf0Var2 = p92Var.b;
                        ctf0Var2.getClass();
                        long jE = ynq0.e(j);
                        if (jE <= 0) {
                            return null;
                        }
                        StringBuilder sb = new StringBuilder();
                        long j2 = jE / 86400000;
                        if (j2 > 0) {
                            sb.append(ctf0Var2.b.a(R.string.days_v2, Arrays.copyOf(new Object[]{Long.valueOf(j2)}, 1)));
                        }
                        long jE2 = jE - wen.e(ibc.w0(j2, bfn.DAYS));
                        long j3 = jE2 / 3600000;
                        if (j3 > 0) {
                            if (sb.length() > 0) {
                                sb.append(Separators.SP);
                            }
                            sb.append(ctf0Var2.b.a(R.string.limit_third_hour_declination_v2, Arrays.copyOf(new Object[]{Long.valueOf(j3)}, 1)));
                        }
                        long jE3 = (jE2 - wen.e(ibc.w0(j3, bfn.HOURS))) / 60000;
                        if (jE3 > 0) {
                            if (sb.length() > 0) {
                                sb.append(Separators.SP);
                            }
                            sb.append(ctf0Var2.b.a(R.string.reality_minute_v2, Arrays.copyOf(new Object[]{Long.valueOf(jE3)}, 1)));
                        }
                        if (sb.length() <= 0) {
                            return null;
                        }
                        String string = sb.toString();
                        String upperCase = ctf0Var2.b.a(R.string.time_before_event, Arrays.copyOf(new Object[0], 0)).toUpperCase(Locale.ROOT);
                        upperCase.getClass();
                        return new vnq0(string, upperCase);
                    case 1:
                        lwk0 lwk0Var2 = (lwk0) obj;
                        lwk0Var2.getClass();
                        ctf0 ctf0Var3 = p92Var.b;
                        ctf0Var3.getClass();
                        List<SpecialEventTabs> list = lwk0Var2.b;
                        int iIndexOf = list.indexOf(lwk0Var2.f20768a);
                        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                        for (SpecialEventTabs specialEventTabs : list) {
                            specialEventTabs.getClass();
                            int iOrdinal = specialEventTabs.ordinal();
                            if (iOrdinal == 0) {
                                i = R.string.schedule;
                            } else if (iOrdinal == 1) {
                                i = R.string.special_event_my_games;
                            } else if (iOrdinal == 2) {
                                i = R.string.statistic;
                            } else {
                                if (iOrdinal != 3) {
                                    t9f.b();
                                    return null;
                                }
                                i = R.string.tournament;
                            }
                            arrayList.add(new yvh0(ctf0Var3.b.a(i, Arrays.copyOf(new Object[0], 0)), bwh0.f3325a));
                        }
                        return new mwk0(iIndexOf, dyb.o0(arrayList), lwk0Var2.c);
                    case 2:
                        ((String) obj).getClass();
                        return new wnk0((String) ((fee) p92Var.e.getValue()).c(), (ohk) p92Var.d.getValue(), (vnq0) ((fee) p92Var.i.getValue()).b());
                    case 3:
                        ((String) obj).getClass();
                        return new z1d((String) ((fee) p92Var.f.getValue()).c(), (String) ((fee) p92Var.g.getValue()).c(), (String) ((fee) p92Var.h.getValue()).c(), (ohk) p92Var.d.getValue(), ((Number) p92Var.c.getValue()).intValue());
                    default:
                        ((String) obj).getClass();
                        String str = (String) ((fee) p92Var.e.getValue()).c();
                        vnq0 vnq0Var = (vnq0) ((fee) p92Var.i.getValue()).b();
                        return new owk0(str, vnq0Var != null ? vnq0Var.f37732a : null);
                }
            }
        }, (byte) 20));
        this.k = maz.b(new yw9(lwk0Var, new rai0(jpk0Var, (byte) 27), (byte) 20));
        this.l = bkb.G(((fee) n0o0VarH.getValue()).d, new Function1(this) { // from class: a.mpk0
            public final /* synthetic */ p92 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i;
                byte b4 = b;
                p92 p92Var = this.b;
                switch (b4) {
                    case 0:
                        long j = ((ynq0) obj).f42952a;
                        ctf0 ctf0Var2 = p92Var.b;
                        ctf0Var2.getClass();
                        long jE = ynq0.e(j);
                        if (jE <= 0) {
                            return null;
                        }
                        StringBuilder sb = new StringBuilder();
                        long j2 = jE / 86400000;
                        if (j2 > 0) {
                            sb.append(ctf0Var2.b.a(R.string.days_v2, Arrays.copyOf(new Object[]{Long.valueOf(j2)}, 1)));
                        }
                        long jE2 = jE - wen.e(ibc.w0(j2, bfn.DAYS));
                        long j3 = jE2 / 3600000;
                        if (j3 > 0) {
                            if (sb.length() > 0) {
                                sb.append(Separators.SP);
                            }
                            sb.append(ctf0Var2.b.a(R.string.limit_third_hour_declination_v2, Arrays.copyOf(new Object[]{Long.valueOf(j3)}, 1)));
                        }
                        long jE3 = (jE2 - wen.e(ibc.w0(j3, bfn.HOURS))) / 60000;
                        if (jE3 > 0) {
                            if (sb.length() > 0) {
                                sb.append(Separators.SP);
                            }
                            sb.append(ctf0Var2.b.a(R.string.reality_minute_v2, Arrays.copyOf(new Object[]{Long.valueOf(jE3)}, 1)));
                        }
                        if (sb.length() <= 0) {
                            return null;
                        }
                        String string = sb.toString();
                        String upperCase = ctf0Var2.b.a(R.string.time_before_event, Arrays.copyOf(new Object[0], 0)).toUpperCase(Locale.ROOT);
                        upperCase.getClass();
                        return new vnq0(string, upperCase);
                    case 1:
                        lwk0 lwk0Var2 = (lwk0) obj;
                        lwk0Var2.getClass();
                        ctf0 ctf0Var3 = p92Var.b;
                        ctf0Var3.getClass();
                        List<SpecialEventTabs> list = lwk0Var2.b;
                        int iIndexOf = list.indexOf(lwk0Var2.f20768a);
                        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                        for (SpecialEventTabs specialEventTabs : list) {
                            specialEventTabs.getClass();
                            int iOrdinal = specialEventTabs.ordinal();
                            if (iOrdinal == 0) {
                                i = R.string.schedule;
                            } else if (iOrdinal == 1) {
                                i = R.string.special_event_my_games;
                            } else if (iOrdinal == 2) {
                                i = R.string.statistic;
                            } else {
                                if (iOrdinal != 3) {
                                    t9f.b();
                                    return null;
                                }
                                i = R.string.tournament;
                            }
                            arrayList.add(new yvh0(ctf0Var3.b.a(i, Arrays.copyOf(new Object[0], 0)), bwh0.f3325a));
                        }
                        return new mwk0(iIndexOf, dyb.o0(arrayList), lwk0Var2.c);
                    case 2:
                        ((String) obj).getClass();
                        return new wnk0((String) ((fee) p92Var.e.getValue()).c(), (ohk) p92Var.d.getValue(), (vnq0) ((fee) p92Var.i.getValue()).b());
                    case 3:
                        ((String) obj).getClass();
                        return new z1d((String) ((fee) p92Var.f.getValue()).c(), (String) ((fee) p92Var.g.getValue()).c(), (String) ((fee) p92Var.h.getValue()).c(), (ohk) p92Var.d.getValue(), ((Number) p92Var.c.getValue()).intValue());
                    default:
                        ((String) obj).getClass();
                        String str = (String) ((fee) p92Var.e.getValue()).c();
                        vnq0 vnq0Var = (vnq0) ((fee) p92Var.i.getValue()).b();
                        return new owk0(str, vnq0Var != null ? vnq0Var.f37732a : null);
                }
            }
        });
        final byte b4 = 3;
        this.m = bkb.G(((fee) n0o0VarH2.getValue()).d, new Function1(this) { // from class: a.mpk0
            public final /* synthetic */ p92 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i;
                byte b5 = b4;
                p92 p92Var = this.b;
                switch (b5) {
                    case 0:
                        long j = ((ynq0) obj).f42952a;
                        ctf0 ctf0Var2 = p92Var.b;
                        ctf0Var2.getClass();
                        long jE = ynq0.e(j);
                        if (jE <= 0) {
                            return null;
                        }
                        StringBuilder sb = new StringBuilder();
                        long j2 = jE / 86400000;
                        if (j2 > 0) {
                            sb.append(ctf0Var2.b.a(R.string.days_v2, Arrays.copyOf(new Object[]{Long.valueOf(j2)}, 1)));
                        }
                        long jE2 = jE - wen.e(ibc.w0(j2, bfn.DAYS));
                        long j3 = jE2 / 3600000;
                        if (j3 > 0) {
                            if (sb.length() > 0) {
                                sb.append(Separators.SP);
                            }
                            sb.append(ctf0Var2.b.a(R.string.limit_third_hour_declination_v2, Arrays.copyOf(new Object[]{Long.valueOf(j3)}, 1)));
                        }
                        long jE3 = (jE2 - wen.e(ibc.w0(j3, bfn.HOURS))) / 60000;
                        if (jE3 > 0) {
                            if (sb.length() > 0) {
                                sb.append(Separators.SP);
                            }
                            sb.append(ctf0Var2.b.a(R.string.reality_minute_v2, Arrays.copyOf(new Object[]{Long.valueOf(jE3)}, 1)));
                        }
                        if (sb.length() <= 0) {
                            return null;
                        }
                        String string = sb.toString();
                        String upperCase = ctf0Var2.b.a(R.string.time_before_event, Arrays.copyOf(new Object[0], 0)).toUpperCase(Locale.ROOT);
                        upperCase.getClass();
                        return new vnq0(string, upperCase);
                    case 1:
                        lwk0 lwk0Var2 = (lwk0) obj;
                        lwk0Var2.getClass();
                        ctf0 ctf0Var3 = p92Var.b;
                        ctf0Var3.getClass();
                        List<SpecialEventTabs> list = lwk0Var2.b;
                        int iIndexOf = list.indexOf(lwk0Var2.f20768a);
                        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                        for (SpecialEventTabs specialEventTabs : list) {
                            specialEventTabs.getClass();
                            int iOrdinal = specialEventTabs.ordinal();
                            if (iOrdinal == 0) {
                                i = R.string.schedule;
                            } else if (iOrdinal == 1) {
                                i = R.string.special_event_my_games;
                            } else if (iOrdinal == 2) {
                                i = R.string.statistic;
                            } else {
                                if (iOrdinal != 3) {
                                    t9f.b();
                                    return null;
                                }
                                i = R.string.tournament;
                            }
                            arrayList.add(new yvh0(ctf0Var3.b.a(i, Arrays.copyOf(new Object[0], 0)), bwh0.f3325a));
                        }
                        return new mwk0(iIndexOf, dyb.o0(arrayList), lwk0Var2.c);
                    case 2:
                        ((String) obj).getClass();
                        return new wnk0((String) ((fee) p92Var.e.getValue()).c(), (ohk) p92Var.d.getValue(), (vnq0) ((fee) p92Var.i.getValue()).b());
                    case 3:
                        ((String) obj).getClass();
                        return new z1d((String) ((fee) p92Var.f.getValue()).c(), (String) ((fee) p92Var.g.getValue()).c(), (String) ((fee) p92Var.h.getValue()).c(), (ohk) p92Var.d.getValue(), ((Number) p92Var.c.getValue()).intValue());
                    default:
                        ((String) obj).getClass();
                        String str = (String) ((fee) p92Var.e.getValue()).c();
                        vnq0 vnq0Var = (vnq0) ((fee) p92Var.i.getValue()).b();
                        return new owk0(str, vnq0Var != null ? vnq0Var.f37732a : null);
                }
            }
        });
        final byte b5 = 4;
        this.n = bkb.G(((fee) n0o0VarH.getValue()).d, new Function1(this) { // from class: a.mpk0
            public final /* synthetic */ p92 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i;
                byte b6 = b5;
                p92 p92Var = this.b;
                switch (b6) {
                    case 0:
                        long j = ((ynq0) obj).f42952a;
                        ctf0 ctf0Var2 = p92Var.b;
                        ctf0Var2.getClass();
                        long jE = ynq0.e(j);
                        if (jE <= 0) {
                            return null;
                        }
                        StringBuilder sb = new StringBuilder();
                        long j2 = jE / 86400000;
                        if (j2 > 0) {
                            sb.append(ctf0Var2.b.a(R.string.days_v2, Arrays.copyOf(new Object[]{Long.valueOf(j2)}, 1)));
                        }
                        long jE2 = jE - wen.e(ibc.w0(j2, bfn.DAYS));
                        long j3 = jE2 / 3600000;
                        if (j3 > 0) {
                            if (sb.length() > 0) {
                                sb.append(Separators.SP);
                            }
                            sb.append(ctf0Var2.b.a(R.string.limit_third_hour_declination_v2, Arrays.copyOf(new Object[]{Long.valueOf(j3)}, 1)));
                        }
                        long jE3 = (jE2 - wen.e(ibc.w0(j3, bfn.HOURS))) / 60000;
                        if (jE3 > 0) {
                            if (sb.length() > 0) {
                                sb.append(Separators.SP);
                            }
                            sb.append(ctf0Var2.b.a(R.string.reality_minute_v2, Arrays.copyOf(new Object[]{Long.valueOf(jE3)}, 1)));
                        }
                        if (sb.length() <= 0) {
                            return null;
                        }
                        String string = sb.toString();
                        String upperCase = ctf0Var2.b.a(R.string.time_before_event, Arrays.copyOf(new Object[0], 0)).toUpperCase(Locale.ROOT);
                        upperCase.getClass();
                        return new vnq0(string, upperCase);
                    case 1:
                        lwk0 lwk0Var2 = (lwk0) obj;
                        lwk0Var2.getClass();
                        ctf0 ctf0Var3 = p92Var.b;
                        ctf0Var3.getClass();
                        List<SpecialEventTabs> list = lwk0Var2.b;
                        int iIndexOf = list.indexOf(lwk0Var2.f20768a);
                        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                        for (SpecialEventTabs specialEventTabs : list) {
                            specialEventTabs.getClass();
                            int iOrdinal = specialEventTabs.ordinal();
                            if (iOrdinal == 0) {
                                i = R.string.schedule;
                            } else if (iOrdinal == 1) {
                                i = R.string.special_event_my_games;
                            } else if (iOrdinal == 2) {
                                i = R.string.statistic;
                            } else {
                                if (iOrdinal != 3) {
                                    t9f.b();
                                    return null;
                                }
                                i = R.string.tournament;
                            }
                            arrayList.add(new yvh0(ctf0Var3.b.a(i, Arrays.copyOf(new Object[0], 0)), bwh0.f3325a));
                        }
                        return new mwk0(iIndexOf, dyb.o0(arrayList), lwk0Var2.c);
                    case 2:
                        ((String) obj).getClass();
                        return new wnk0((String) ((fee) p92Var.e.getValue()).c(), (ohk) p92Var.d.getValue(), (vnq0) ((fee) p92Var.i.getValue()).b());
                    case 3:
                        ((String) obj).getClass();
                        return new z1d((String) ((fee) p92Var.f.getValue()).c(), (String) ((fee) p92Var.g.getValue()).c(), (String) ((fee) p92Var.h.getValue()).c(), (ohk) p92Var.d.getValue(), ((Number) p92Var.c.getValue()).intValue());
                    default:
                        ((String) obj).getClass();
                        String str = (String) ((fee) p92Var.e.getValue()).c();
                        vnq0 vnq0Var = (vnq0) ((fee) p92Var.i.getValue()).b();
                        return new owk0(str, vnq0Var != null ? vnq0Var.f37732a : null);
                }
            }
        });
    }

    public p92(e6s0 e6s0Var, ctf0 ctf0Var) {
        ctf0Var.getClass();
        this.b = ctf0Var;
        this.c = bkb.H(Boolean.valueOf(e6s0Var.f));
        this.d = bkb.H(e6s0Var.e);
        this.e = bkb.H(e6s0Var.d);
        n0o0 n0o0VarH = bkb.H(Long.valueOf(e6s0Var.b));
        this.f = n0o0VarH;
        n0o0 n0o0VarH2 = bkb.H(e6s0Var.g);
        this.g = n0o0VarH2;
        n0o0 n0o0VarH3 = bkb.H(Integer.valueOf(e6s0Var.h));
        this.h = n0o0VarH3;
        this.i = bkb.H(e6s0Var.c);
        this.j = bkb.H(Boolean.valueOf(e6s0Var.i));
        this.k = maz.b(new qir0(this, (byte) 12));
        this.l = bkb.G(((fee) n0o0VarH3.getValue()).d, new g4s0((byte) 5));
        final byte b = 0;
        this.m = maz.b(new yw9((fee) n0o0VarH2.getValue(), new Function1(this) { // from class: a.i6s0
            public final /* synthetic */ p92 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b2 = b;
                p92 p92Var = this.b;
                fee feeVar = (fee) obj;
                switch (b2) {
                    case 0:
                        feeVar.getClass();
                        s7s0 s7s0Var = (s7s0) ((fee) p92Var.d.getValue()).c();
                        gqt0 gqt0Var = (gqt0) ((fee) p92Var.g.getValue()).c();
                        if (!(s7s0Var instanceof q7s0) || gqt0Var == gqt0.h) {
                            return null;
                        }
                        hqt0 hqt0VarB = vsm0.B(gqt0Var);
                        gu1 gu1Var = ((q7s0) s7s0Var).f28266a;
                        return new ci(new mtl(dyb.g0(new itl(new wul(iul.e, oe9.f25112a, new ue9(unh0.o0(gu1Var.o, gqt0Var, p92Var.b)), true, ((Boolean) ((fee) p92Var.j.getValue()).c()).booleanValue(), true), otr0.c))), hqt0VarB, gu1Var.b);
                    default:
                        feeVar.getClass();
                        return lvm0.g((s7s0) ((fee) p92Var.d.getValue()).c(), ((Number) ((fee) p92Var.f.getValue()).c()).longValue(), p92Var.b, (String) ((fee) p92Var.e.getValue()).c(), true);
                }
            }
        }, (byte) 20));
        final byte b2 = 1;
        this.n = maz.b(new yw9((fee) n0o0VarH.getValue(), new Function1(this) { // from class: a.i6s0
            public final /* synthetic */ p92 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b3 = b2;
                p92 p92Var = this.b;
                fee feeVar = (fee) obj;
                switch (b3) {
                    case 0:
                        feeVar.getClass();
                        s7s0 s7s0Var = (s7s0) ((fee) p92Var.d.getValue()).c();
                        gqt0 gqt0Var = (gqt0) ((fee) p92Var.g.getValue()).c();
                        if (!(s7s0Var instanceof q7s0) || gqt0Var == gqt0.h) {
                            return null;
                        }
                        hqt0 hqt0VarB = vsm0.B(gqt0Var);
                        gu1 gu1Var = ((q7s0) s7s0Var).f28266a;
                        return new ci(new mtl(dyb.g0(new itl(new wul(iul.e, oe9.f25112a, new ue9(unh0.o0(gu1Var.o, gqt0Var, p92Var.b)), true, ((Boolean) ((fee) p92Var.j.getValue()).c()).booleanValue(), true), otr0.c))), hqt0VarB, gu1Var.b);
                    default:
                        feeVar.getClass();
                        return lvm0.g((s7s0) ((fee) p92Var.d.getValue()).c(), ((Number) ((fee) p92Var.f.getValue()).c()).longValue(), p92Var.b, (String) ((fee) p92Var.e.getValue()).c(), true);
                }
            }
        }, (byte) 20));
    }
}
