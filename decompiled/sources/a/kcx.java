package a;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.clientauthutils.DigestServerAuthenticationHelper;
import android.javax.sip.message.Response;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import okhttp3.MediaType;
import org.xbet.client1.R;
import org.xplatform.betting.core.zip.model.zip.game.GameStatistic;
import org.xplatform.betting.core.zip.model.zip.game.StatInfo;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public abstract class kcx {
    public static final List A(List list, boolean z, ctf0 ctf0Var, npo npoVar) {
        String string;
        ydl0 xdl0Var;
        if (list.isEmpty()) {
            return iun.f15405a;
        }
        int i = z ? R.string.day_express_live_new : R.string.day_express_line;
        lsm0 lsm0Var = ctf0Var.b;
        lsm0 lsm0Var2 = ctf0Var.b;
        lcb0 lcb0Var = new lcb0(z, hcb0.f12814a, new hjm(lsm0Var.a(i, Arrays.copyOf(new Object[0], 0)), null, null, null, null, null, z, null, null, false, new ue9(lsm0Var2.a(R.string.all, Arrays.copyOf(new Object[0], 0))), null, 7102));
        List listD0 = CollectionsKt.D0(list, 5);
        int i2 = 10;
        ArrayList arrayList = new ArrayList(r3d.q(listD0, 10));
        int i3 = 0;
        for (Object obj : listD0) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                q3d.p();
                throw null;
            }
            bhj bhjVar = (bhj) obj;
            List<qhj> list2 = bhjVar.d;
            ArrayList arrayList2 = new ArrayList(r3d.q(list2, i2));
            for (qhj qhjVar : list2) {
                String strC = qhjVar.b;
                if (strC.length() == 0) {
                    pn40 pn40Var = pn40.f27267a;
                    strC = pn40.c(qhjVar.f28742a, p3u0.e);
                }
                if (qhjVar.c == 707) {
                    xdl0Var = new wdl0();
                } else {
                    long j = qhjVar.r;
                    if (j != 0) {
                        bzu bzuVarD = rz4.d("static", "svg", "sports_v2");
                        rz4.s(j, ".svg", bzuVarD);
                        string = ((StringBuilder) bzuVarD.b).toString();
                    } else {
                        string = "";
                    }
                    xdl0Var = new xdl0(string);
                }
                arrayList2.add(new o6l0(xdl0Var, strC));
            }
            arrayList.add(new qpo(bhjVar.f2609a, lsm0Var2.a(R.string.popular_express_day_header_item_v2, Arrays.copyOf(new Object[]{Integer.valueOf(i4)}, 1)), dyb.o0(arrayList2), npoVar, new chl0(lsm0Var2.a(R.string.express_final_coef, Arrays.copyOf(new Object[0], 0)), bhjVar.c, k0d.f17460a, a65.f301a, false, false, false, false, new xgl0(-1L, 0.0d, 0.0d, "", 0, 0L, 0, 0L, false))));
            i3 = i4;
            i2 = 10;
        }
        return q3d.j(lcb0Var, new gij(arrayList, z));
    }

    public static final ArrayList B(fl40 fl40Var) {
        long jQ;
        int iOrdinal = fl40Var.b.ordinal();
        if (iOrdinal == 0) {
            jQ = Q(fi40.f9571a);
        } else {
            if (iOrdinal != 1 && iOrdinal != 2) {
                t9f.b();
                return null;
            }
            jQ = Q(fi40.b);
        }
        long j = jQ;
        List list = fl40Var.f9722a;
        ArrayList<xi40> arrayList = new ArrayList();
        for (Object obj : list) {
            xi40 xi40Var = (xi40) obj;
            if (xi40Var.a() && (xi40Var.g != 0 || xi40Var.h != 0)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
        for (xi40 xi40Var2 : arrayList) {
            arrayList2.add(new di40(new n0x(xi40Var2.c), xi40Var2.g, xi40Var2.h, j));
        }
        return arrayList2;
    }

    public static final wul C(ctf0 ctf0Var) {
        return new wul(iul.e, oe9.f25112a, new ue9(ctf0Var.b.a(R.string.coupon_make_bet_make, Arrays.copyOf(new Object[0], 0))), true, false, true);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:15:0x00a8  */
    public static final List D(boolean z, List list, wcb wcbVar, ctf0 ctf0Var) {
        uf5 pf5Var;
        uf5 uf5Var;
        int i;
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            rbb rbbVar = (rbb) it.next();
            String strA = wcbVar.a(rbbVar.n, 0L);
            String str = rbbVar.g;
            str.getClass();
            pcb pcbVar = new pcb(str);
            String str2 = rbbVar.h;
            str2.getClass();
            String strD0 = rcb.d0(pcbVar, new pcb(str2), rbbVar.k);
            long j = rbbVar.f30176a;
            String str3 = rbbVar.c;
            pz40 pz40Var = s6t0.f31722a;
            e2l0 e2l0Var = new e2l0(str3, s6t0.b().f33626a.getTextPrimary());
            p1l0 p1l0Var = p1l0.CHAMPIONSHIP_ICON;
            p1l0 p1l0Var2 = p1l0.SPORT_ICON;
            long secondary = s6t0.b().f33626a.getSecondary();
            int iOrdinal = rbbVar.o.ordinal();
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    uf5Var = null;
                } else {
                    pf5Var = new of5();
                }
                s1l0 s1l0Var = new s1l0(p1l0Var, uf5Var, strD0, strA, new y3d(secondary), 32);
                kpe kpeVar = new kpe();
                int i2 = (int) rbbVar.f;
                if (rbbVar.l) {
                    i = R.drawable.ic_glyph_favourite_active;
                } else {
                    i = R.drawable.ic_glyph_favourite_inactive;
                }
                e3l0 e3l0Var = new e3l0(i2, kpeVar, i, null);
                zcl zclVar = qmk.f28987a;
                arrayList.add(new h1b0(j, new zrm(e2l0Var, s1l0Var, e3l0Var, (d4d) null, new l3l0(12.0f), 40)));
            } else {
                pf5Var = new pf5(3, null);
            }
            uf5Var = pf5Var;
            s1l0 s1l0Var2 = new s1l0(p1l0Var, uf5Var, strD0, strA, new y3d(secondary), 32);
            kpe kpeVar2 = new kpe();
            int i3 = (int) rbbVar.f;
            if (rbbVar.l) {
                i = R.drawable.ic_glyph_favourite_active;
            } else {
                i = R.drawable.ic_glyph_favourite_inactive;
            }
            e3l0 e3l0Var2 = new e3l0(i3, kpeVar2, i, null);
            zcl zclVar2 = qmk.f28987a;
            arrayList.add(new h1b0(j, new zrm(e2l0Var, s1l0Var2, e3l0Var2, (d4d) null, new l3l0(12.0f), 40)));
        }
        a4x a4xVarO0 = dyb.o0(arrayList);
        String str4 = z ? "CHAMPS_LIVE" : "CHAMPS_LINE";
        if (a4xVarO0.isEmpty()) {
            return a4xVarO0;
        }
        return q3d.j(new lcb0(z, gcb0.f11052a, new hjm(ctf0Var.b.a(z ? R.string.champs_live_new : R.string.champs_line, Arrays.copyOf(new Object[0], 0)), null, null, null, null, null, z, null, null, false, new ue9(ctf0Var.b.a(R.string.all, Arrays.copyOf(new Object[0], 0))), null, 7102)), new alw(a4xVarO0.size() >= 3 ? 3 : a4xVarO0.size() % 3, a4xVarO0, str4, z));
    }

    public static final bvo E(vby vbyVar, MediaType mediaType) {
        vbyVar.getClass();
        return new bvo(mediaType, new lhi0(vbyVar));
    }

    public static final lcb0 F(ctf0 ctf0Var, boolean z) {
        return new lcb0(z, icb0.f14529a, new hjm(ctf0Var.b.a(z ? R.string.popular_live_new : R.string.popular_line_games, Arrays.copyOf(new Object[0], 0)), null, null, null, null, null, z, null, null, false, new ue9(ctf0Var.b.a(R.string.all, Arrays.copyOf(new Object[0], 0))), null, 7102));
    }

    public static final void G(RecyclerView recyclerView, int i) {
        int i2;
        recyclerView.getClass();
        androidx.recyclerview.widget.b layoutManager = recyclerView.getLayoutManager();
        if (layoutManager != null) {
            if (!(layoutManager instanceof LinearLayoutManager)) {
                recyclerView.B0(i);
                return;
            }
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            int iF1 = linearLayoutManager.f1();
            int i3 = iF1 - i;
            if (i3 > 10) {
                i2 = i + 10;
            } else {
                i2 = i3 < -10 ? i - 10 : iF1;
            }
            if (i2 != iF1) {
                linearLayoutManager.H0(i2);
            }
            recyclerView.post(new n23((Object) recyclerView, i, (byte) 12));
        }
    }

    public static final double H(a820 a820Var) {
        ko7 ko7Var = a820Var.c;
        if (ko7Var instanceof ho7) {
            return a820Var.g.c.b.f34633a;
        }
        if (ko7Var.equals(jo7.b)) {
            return a820Var.e.f27665a.b.f34633a;
        }
        if (ko7Var.equals(io7.b)) {
            return 0.0d;
        }
        t9f.b();
        return 0.0d;
    }

    public static final String I(uaq0 uaq0Var) {
        uaq0.f35345a.getClass();
        String str = "_lt";
        if (!s9m0.j(uaq0Var)) {
            if (s9m0.i(uaq0Var)) {
                str = "_dt";
            } else if (s9m0.k(uaq0Var)) {
                str = "_nt";
            }
        }
        return kng0.l("/static/img/android/onboarding/old_os/old_OS", str, ".png");
    }

    public static final Object J(RecyclerView recyclerView, View view) {
        Object g0g0Var;
        view.getClass();
        xhe0 xhe0VarW = recyclerView.W(view);
        if (!(xhe0VarW instanceof cp)) {
            return null;
        }
        try {
            e0g0 e0g0Var = j0g0.b;
            g0g0Var = ((cp) xhe0VarW).u();
        } catch (Throwable th) {
            e0g0 e0g0Var2 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        if (g0g0Var instanceof g0g0) {
            return null;
        }
        return g0g0Var;
    }

    public static final String K(myr0 myr0Var) {
        hyr0 hyr0Var = myr0Var.f;
        String str = hyr0Var.k;
        if (hyr0Var.i.length() <= 0 || str.length() <= 0) {
            return null;
        }
        return str.concat(" FS");
    }

    public static final String L(myr0 myr0Var) {
        hyr0 hyr0Var = myr0Var.f;
        int length = hyr0Var.i.length();
        String str = hyr0Var.k;
        if (length > 0) {
            return kng0.l(hyr0Var.i, Separators.SP, hyr0Var.j);
        }
        return str.length() > 0 ? str.concat(" FS") : "";
    }

    public static final boolean M(u8z u8zVar, int i) {
        return i <= u8zVar.e() && u8zVar.c() <= i;
    }

    public static String N(String str) {
        str.getClass();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(DigestServerAuthenticationHelper.DEFAULT_ALGORITHM);
            byte[] bytes = str.getBytes(Charsets.UTF_8);
            bytes.getClass();
            messageDigest.update(bytes);
            byte[] bArrDigest = messageDigest.digest();
            StringBuffer stringBuffer = new StringBuffer();
            bArrDigest.getClass();
            for (byte b : bArrDigest) {
                String string = Integer.toString((b & 255) + 256, CharsKt.checkRadix(16));
                string.getClass();
                stringBuffer.append(string.substring(1));
            }
            String string2 = stringBuffer.toString();
            string2.getClass();
            return string2;
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return "";
        }
    }

    public static final void O(vx6 vx6Var) {
        pz40 pz40Var = vx6Var.f38186a;
        a8q0 a8q0Var = (a8q0) pz40Var.getValue();
        int iE = o9q0.e(((a8q0) pz40Var.getValue()).b);
        pz40Var.setValue(a8q0.a(a8q0Var, null, s7n0.e(iE, iE), 5));
    }

    public static final c0d P(m0d m0dVar) {
        int i = pp30.f27357a[m0dVar.e.ordinal()];
        if (i == 1) {
            return c0d.f3518a;
        }
        if (i == 2) {
            return c0d.b;
        }
        if (i == 3) {
            return c0d.c;
        }
        if (i == 4 && m0dVar.f20948a != m0dVar.c) {
            return c0d.e;
        }
        if (i == 4) {
            return c0d.d;
        }
        t9f.b();
        return null;
    }

    public static final long Q(fi40 fi40Var) {
        int iOrdinal = fi40Var.ordinal();
        if (iOrdinal == 0) {
            return ijg.J0;
        }
        if (iOrdinal == 1) {
            return ijg.l0;
        }
        t9f.b();
        return 0L;
    }

    public static final dye R(txe txeVar, ctf0 ctf0Var, boolean z, boolean z2) {
        oxe mxeVar;
        ctf0Var.getClass();
        String strValueOf = String.valueOf(txeVar.f34694a);
        gao0 gao0Var = txeVar.c;
        j680 j680Var = null;
        aye uxeVar = yxe.f43415a;
        if ((!z2 || (gao0Var instanceof dao0)) && !gao0Var.equals(eao0.f7477a)) {
            if (gao0Var.equals(dao0.f5760a)) {
                uxeVar = wxe.f39928a;
            } else {
                if (!(gao0Var instanceof fao0)) {
                    t9f.b();
                    return null;
                }
                en7 en7Var = ((fao0) gao0Var).f9219a;
                en7Var.getClass();
                uxeVar = new uxe(twn.m(en7Var.f8078a, String.format(Locale.ENGLISH, "%s %d/", Arrays.copyOf(new Object[]{ctf0Var.b.a(R.string.system, Arrays.copyOf(new Object[0], 0)), Integer.valueOf(en7Var.c)}, 2))));
            }
        }
        m0d m0dVar = txeVar.d;
        int iOrdinal = m0dVar.g.ordinal();
        if (iOrdinal == 0) {
            mxeVar = ixe.f15538a;
        } else {
            if (iOrdinal != 1) {
                t9f.b();
                return null;
            }
            mxeVar = new mxe(new j43(m0dVar.b, m0dVar.d, P(m0dVar), z2));
        }
        String str = txeVar.e;
        lsm0 lsm0Var = ctf0Var.b;
        String strA = lsm0Var.a(R.string.coefficient_with_dots_new, Arrays.copyOf(new Object[0], 0));
        String strA2 = lsm0Var.a(R.string.when_coef_changed, Arrays.copyOf(new Object[0], 0));
        aye ayeVar = uxeVar;
        boolean z3 = txeVar.f;
        String strA3 = lsm0Var.a(R.string.auto_sub_title, Arrays.copyOf(new Object[0], 0));
        h680 h680Var = txeVar.g;
        if (h680Var != null) {
            m0d m0dVar2 = h680Var.f12519a;
            j43 j43Var = new j43(m0dVar2.b, m0dVar2.d, P(m0dVar2), z2);
            m0d m0dVar3 = h680Var.b;
            j680Var = new j680(j43Var, new j43(m0dVar3.b, m0dVar3.d, P(m0dVar3), z2));
        }
        return new dye(strValueOf, ayeVar, mxeVar, str, z, strA, strA2, z3, strA3, j680Var);
    }

    public static final jcx S(ncx ncxVar) {
        ncxVar.getClass();
        String str = ncxVar.c;
        String strL = "";
        if (str == null) {
            str = "";
        }
        String str2 = ncxVar.f23314a;
        String str3 = ncxVar.b;
        if (str2 != null && str3 != null) {
            if (!StringsKt.W(str2) && !StringsKt.W(str3)) {
                strL = kng0.l(str2, " - ", str3);
            } else if (!StringsKt.W(str2) && StringsKt.W(str3)) {
                strL = str2;
            } else if (StringsKt.W(str2) && !StringsKt.W(str3)) {
                strL = str3;
            }
        }
        return new jcx(strL, str);
    }

    public static final gy30 T(nw30 nw30Var) {
        int i;
        wx30 ux30Var;
        if (nw30Var instanceof pv30) {
            return ((pv30) nw30Var).b;
        }
        boolean z = nw30Var instanceof ew30;
        ey30 ey30Var = ey30.f8608a;
        miz kizVar = liz.f20129a;
        if (z) {
            ew30 ew30Var = (ew30) nw30Var;
            ux30 ux30Var2 = new ux30(10, 0L, ew30Var.e, ew30Var.f);
            int i2 = ew30Var.d;
            m0x m0xVar = new m0x(i2, null, 6);
            if (ew30Var.b) {
                kizVar = new kiz(new rf5(3, null));
            }
            return new gy30(ux30Var2, new rx30(m0xVar, 0L, kizVar, i2, 0L, null, 498), ey30Var, 0L, null, null, 248);
        }
        if (nw30Var instanceof mw30) {
            mw30 mw30Var = (mw30) nw30Var;
            ux30 ux30Var3 = new ux30(10, 0L, mw30Var.e, mw30Var.f);
            int i3 = mw30Var.d;
            m0x m0xVar2 = new m0x(i3, null, 6);
            if (mw30Var.f22484a) {
                kizVar = new kiz(new rf5(3, null));
            }
            return new gy30(ux30Var3, new rx30(m0xVar2, 0L, kizVar, i3, 0L, null, 498), new by30(mw30Var.g), 0L, null, null, 248);
        }
        if (nw30Var instanceof fw30) {
            fw30 fw30Var = (fw30) nw30Var;
            ux30 ux30Var4 = new ux30(10, 0L, fw30Var.h, "");
            pz40 pz40Var = s6t0.f31722a;
            qc5 qc5Var = new qc5(null, new n0x(fw30Var.f), new y3d(s6t0.b().f33626a.getBackground()));
            n0x n0xVar = new n0x(fw30Var.e);
            if (fw30Var.f10240a) {
                kizVar = new kiz(new rf5(3, null));
            }
            return new gy30(ux30Var4, new rx30(n0xVar, 0L, kizVar, R.drawable.sport_new, 0L, qc5Var, 434), new zx30(new n0x(fw30Var.i), 3), 0L, null, null, 248);
        }
        if (nw30Var instanceof iw30) {
            iw30 iw30Var = (iw30) nw30Var;
            ux30 ux30Var5 = new ux30(10, 0L, iw30Var.e, iw30Var.f);
            int i4 = iw30Var.d;
            m0x m0xVar3 = new m0x(i4, null, 6);
            if (iw30Var.b) {
                kizVar = new kiz(new rf5(3, null));
            }
            rx30 rx30Var = new rx30(m0xVar3, 0L, kizVar, i4, 0L, null, 498);
            rpe rpeVar = new rpe(iw30Var.g);
            pz40 pz40Var2 = s6t0.f31722a;
            StaticColors staticColors = StaticColors.INSTANCE;
            return new gy30(ux30Var5, rx30Var, new dy30(rpeVar, new kpe(staticColors.m113getRed0d7_KjU(), staticColors.m123getWhite0d7_KjU())), 0L, null, null, 248);
        }
        if (nw30Var instanceof qv30) {
            qv30 qv30Var = (qv30) nw30Var;
            ux30 ux30Var6 = new ux30(10, 0L, qv30Var.e, qv30Var.f);
            int i5 = qv30Var.d;
            m0x m0xVar4 = new m0x(i5, null, 6);
            if (qv30Var.b) {
                kizVar = new kiz(new rf5(3, null));
            }
            return new gy30(ux30Var6, new rx30(m0xVar4, 0L, kizVar, i5, 0L, null, 498), new zx30(new n0x(qv30Var.g), 3), 0L, null, null, 248);
        }
        if (nw30Var instanceof jw30) {
            jw30 jw30Var = (jw30) nw30Var;
            ux30 ux30Var7 = new ux30(10, 0L, jw30Var.e, jw30Var.f);
            int i6 = jw30Var.d;
            m0x m0xVar5 = new m0x(i6, null, 6);
            if (jw30Var.b) {
                kizVar = new kiz(new rf5(3, null));
            }
            return new gy30(ux30Var7, new rx30(m0xVar5, 0L, kizVar, i6, 0L, null, 498), new zx30(new n0x(jw30Var.g), 3), 0L, null, null, 248);
        }
        if (nw30Var instanceof dw30) {
            dw30 dw30Var = (dw30) nw30Var;
            ux30 ux30Var8 = new ux30(10, 0L, dw30Var.e, dw30Var.f);
            int i7 = dw30Var.d;
            m0x m0xVar6 = new m0x(i7, null, 6);
            if (dw30Var.b) {
                kizVar = new kiz(new rf5(3, null));
            }
            return new gy30(ux30Var8, new rx30(m0xVar6, 0L, kizVar, i7, 0L, null, 498), new zx30(new n0x(dw30Var.g), 3), 0L, null, null, 248);
        }
        if (nw30Var instanceof uv30) {
            uv30 uv30Var = (uv30) nw30Var;
            ux30 ux30Var9 = new ux30(10, 0L, uv30Var.e, uv30Var.f);
            int i8 = uv30Var.d;
            m0x m0xVar7 = new m0x(i8, null, 6);
            if (uv30Var.b) {
                kizVar = new kiz(new rf5(3, null));
            }
            return new gy30(ux30Var9, new rx30(m0xVar7, 0L, kizVar, i8, 0L, null, 498), new zx30(new m0x(uv30Var.g, null, 6), 3), 0L, null, null, 248);
        }
        if (nw30Var instanceof ov30) {
            ov30 ov30Var = (ov30) nw30Var;
            ux30 ux30Var10 = new ux30(10, 0L, ov30Var.i, ov30Var.j);
            pc5 pc5Var = new pc5(new y3d(ov30Var.f));
            long j = ov30Var.e;
            long j2 = ov30Var.h;
            int i9 = ov30Var.g;
            n0x n0xVar2 = new n0x(ov30Var.d);
            if (ov30Var.f25907a) {
                kizVar = new kiz(new rf5(3, null));
            }
            return new gy30(ux30Var10, new rx30(n0xVar2, j, kizVar, i9, j2, pc5Var, Response.UNSUPPORTED_URI_SCHEME), ey30Var, 0L, null, null, 248);
        }
        if (nw30Var instanceof rv30) {
            rv30 rv30Var = (rv30) nw30Var;
            List list = rv30Var.k;
            String str = rv30Var.h;
            pz40 pz40Var3 = s6t0.f31722a;
            StaticColors staticColors2 = StaticColors.INSTANCE;
            ux30 ux30Var11 = new ux30(staticColors2.m123getWhite0d7_KjU(), staticColors2.m131getWhite800d7_KjU(), str, rv30Var.i);
            pc5 pc5Var2 = new pc5(new y3d(rv30Var.g));
            int i10 = rv30Var.e;
            long j3 = rv30Var.f;
            m0x m0xVar8 = new m0x(i10, null, 6);
            if (rv30Var.b) {
                kizVar = new kiz(new rf5(3, null));
            }
            return new gy30(ux30Var11, new rx30(m0xVar8, j3, kizVar, i10, 0L, pc5Var2, 432), new zx30(new m0x(rv30Var.j, rv30Var.l, 4), 3), 0L, list, null, 216);
        }
        if (nw30Var instanceof sv30) {
            sv30 sv30Var = (sv30) nw30Var;
            long j4 = sv30Var.j;
            String str2 = sv30Var.g;
            pz40 pz40Var4 = s6t0.f31722a;
            StaticColors staticColors3 = StaticColors.INSTANCE;
            ux30 ux30Var12 = new ux30(staticColors3.m123getWhite0d7_KjU(), staticColors3.m131getWhite800d7_KjU(), str2, sv30Var.h);
            int i11 = sv30Var.d;
            m0x m0xVar9 = new m0x(i11, null, 6);
            pc5 pc5Var3 = new pc5(new y3d(sv30Var.f));
            if (sv30Var.b) {
                kizVar = new kiz(new rf5(3, null));
            }
            return new gy30(ux30Var12, new rx30(m0xVar9, 0L, kizVar, i11, 0L, pc5Var3, 434), new zx30(new m0x(sv30Var.i, null, 6), 3), j4, null, null, 240);
        }
        if (nw30Var instanceof nv30) {
            nv30 nv30Var = (nv30) nw30Var;
            boolean z2 = nv30Var.g;
            String str3 = nv30Var.e;
            wx30 vx30Var = z2 ? new vx30(str3, nv30Var.f, new m0x(R.drawable.ic_status_green_check_circle, null, 6)) : new ux30(10, 0L, str3, nv30Var.f);
            int i12 = nv30Var.d;
            m0x m0xVar10 = new m0x(i12, null, 6);
            if (nv30Var.b) {
                kizVar = new kiz(new rf5(3, null));
            }
            return new gy30(vx30Var, new rx30(m0xVar10, 0L, kizVar, i12, 0L, null, 498), ey30Var, 0L, null, null, 248);
        }
        if (nw30Var instanceof tv30) {
            tv30 tv30Var = (tv30) nw30Var;
            long j5 = tv30Var.i;
            String str4 = tv30Var.f;
            pz40 pz40Var5 = s6t0.f31722a;
            StaticColors staticColors4 = StaticColors.INSTANCE;
            ux30 ux30Var13 = new ux30(staticColors4.m123getWhite0d7_KjU(), staticColors4.m131getWhite800d7_KjU(), str4, tv30Var.g);
            int i13 = tv30Var.c;
            long j6 = tv30Var.d;
            m0x m0xVar11 = new m0x(i13, null, 6);
            pc5 pc5Var4 = new pc5(new y3d(tv30Var.e));
            if (tv30Var.f34580a) {
                kizVar = new kiz(new rf5(3, null));
            }
            return new gy30(ux30Var13, new rx30(m0xVar11, j6, kizVar, i13, 0L, pc5Var4, 432), new zx30(new m0x(tv30Var.h, null, 6), 3), j5, null, null, 240);
        }
        if (nw30Var instanceof lw30) {
            lw30 lw30Var = (lw30) nw30Var;
            ux30 ux30Var14 = new ux30(14, 0L, lw30Var.g, (String) null);
            n0x n0xVar3 = new n0x(lw30Var.f);
            if (lw30Var.f20744a) {
                kizVar = new kiz(new rf5(3, null));
            }
            return new gy30(ux30Var14, new rx30(n0xVar3, 0L, kizVar, R.drawable.ic_glyph_language, 0L, null, 498), ey30Var, 0L, null, null, 248);
        }
        if (nw30Var instanceof vv30) {
            vv30 vv30Var = (vv30) nw30Var;
            boolean z3 = vv30Var.g;
            String str5 = vv30Var.e;
            if (z3) {
                i = 6;
                ux30Var = new vx30(str5, vv30Var.f, new m0x(R.drawable.ic_status_green_check_circle, null, 6));
            } else {
                i = 6;
                ux30Var = new ux30(10, 0L, str5, vv30Var.f);
            }
            int i14 = vv30Var.d;
            m0x m0xVar12 = new m0x(i14, null, i);
            if (vv30Var.b) {
                kizVar = new kiz(new rf5(3, null));
            }
            return new gy30(ux30Var, new rx30(m0xVar12, 0L, kizVar, i14, 0L, null, 498), ey30Var, 0L, null, null, 248);
        }
        if (nw30Var instanceof wv30) {
            wv30 wv30Var = (wv30) nw30Var;
            ux30 ux30Var15 = new ux30(10, 0L, wv30Var.f, wv30Var.g);
            int i15 = wv30Var.e;
            n0x n0xVar4 = new n0x(wv30Var.d);
            if (wv30Var.f39822a) {
                kizVar = new kiz(new rf5(3, null));
            }
            return new gy30(ux30Var15, new rx30(n0xVar4, 0L, kizVar, i15, 0L, null, 498), ey30Var, 0L, null, null, 248);
        }
        if (nw30Var instanceof xv30) {
            xv30 xv30Var = (xv30) nw30Var;
            List list2 = xv30Var.k;
            String str6 = xv30Var.h;
            pz40 pz40Var6 = s6t0.f31722a;
            StaticColors staticColors5 = StaticColors.INSTANCE;
            ux30 ux30Var16 = new ux30(staticColors5.m123getWhite0d7_KjU(), staticColors5.m131getWhite800d7_KjU(), str6, xv30Var.i);
            pc5 pc5Var5 = new pc5(new y3d(xv30Var.g));
            int i16 = xv30Var.e;
            long j7 = xv30Var.f;
            m0x m0xVar13 = new m0x(i16, null, 6);
            if (xv30Var.b) {
                kizVar = new kiz(new rf5(3, null));
            }
            return new gy30(ux30Var16, new rx30(m0xVar13, j7, kizVar, i16, 0L, pc5Var5, 432), new zx30(new m0x(xv30Var.j, xv30Var.l, 4), 3), 0L, list2, null, 216);
        }
        if (nw30Var instanceof yv30) {
            yv30 yv30Var = (yv30) nw30Var;
            long j8 = yv30Var.j;
            String str7 = yv30Var.g;
            pz40 pz40Var7 = s6t0.f31722a;
            StaticColors staticColors6 = StaticColors.INSTANCE;
            ux30 ux30Var17 = new ux30(staticColors6.m123getWhite0d7_KjU(), staticColors6.m131getWhite800d7_KjU(), str7, yv30Var.h);
            int i17 = yv30Var.d;
            long j9 = yv30Var.e;
            m0x m0xVar14 = new m0x(i17, null, 6);
            pc5 pc5Var6 = new pc5(new y3d(yv30Var.f));
            if (yv30Var.b) {
                kizVar = new kiz(new rf5(3, null));
            }
            return new gy30(ux30Var17, new rx30(m0xVar14, j9, kizVar, i17, 0L, pc5Var6, 432), new zx30(new m0x(yv30Var.i, null, 6), 3), j8, null, null, 240);
        }
        if (nw30Var instanceof zv30) {
            zv30 zv30Var = (zv30) nw30Var;
            ux30 ux30Var18 = new ux30(10, 0L, zv30Var.e, zv30Var.f);
            int i18 = zv30Var.d;
            m0x m0xVar15 = new m0x(i18, null, 6);
            if (zv30Var.b) {
                kizVar = new kiz(new rf5(3, null));
            }
            return new gy30(ux30Var18, new rx30(m0xVar15, 0L, kizVar, i18, 0L, null, 498), new zx30(new m0x(zv30Var.g, null, 6), 3), 0L, null, null, 248);
        }
        if (nw30Var instanceof aw30) {
            aw30 aw30Var = (aw30) nw30Var;
            ux30 ux30Var19 = new ux30(10, 0L, aw30Var.e, aw30Var.f);
            int i19 = aw30Var.d;
            m0x m0xVar16 = new m0x(i19, null, 6);
            if (aw30Var.b) {
                kizVar = new kiz(new rf5(3, null));
            }
            return new gy30(ux30Var19, new rx30(m0xVar16, 0L, kizVar, i19, 0L, null, 498), ey30Var, 0L, null, null, 248);
        }
        if (nw30Var instanceof bw30) {
            bw30 bw30Var = (bw30) nw30Var;
            ux30 ux30Var20 = new ux30(14, 0L, bw30Var.g, (String) null);
            n0x n0xVar5 = new n0x(bw30Var.f);
            if (bw30Var.f3307a) {
                kizVar = new kiz(new rf5(3, null));
            }
            return new gy30(ux30Var20, new rx30(n0xVar5, 0L, kizVar, R.drawable.ic_glyph_language, 0L, null, 498), ey30Var, 0L, null, null, 248);
        }
        if (nw30Var instanceof cw30) {
            cw30 cw30Var = (cw30) nw30Var;
            ux30 ux30Var21 = new ux30(10, 0L, cw30Var.e, cw30Var.f);
            int i20 = cw30Var.d;
            m0x m0xVar17 = new m0x(i20, null, 6);
            if (cw30Var.f5062a) {
                kizVar = new kiz(new rf5(3, null));
            }
            return new gy30(ux30Var21, new rx30(m0xVar17, 0L, kizVar, i20, 0L, null, 498), new by30(cw30Var.g), 0L, null, null, 248);
        }
        if (!(nw30Var instanceof gw30)) {
            ux30 ux30Var22 = new ux30(10, 0L, "", "");
            zcl zclVar = qmk.f28987a;
            m0x m0xVar18 = new m0x(0, null, 6);
            pz40 pz40Var8 = s6t0.f31722a;
            return new gy30(ux30Var22, new qx30(m0xVar18, s6t0.b().f33626a.getPrimary(), kizVar, R.drawable.ic_glyph_language, 40.0f, 16), ey30Var, 0L, null, null, 248);
        }
        gw30 gw30Var = (gw30) nw30Var;
        ux30 ux30Var23 = new ux30(10, 0L, gw30Var.h, "");
        pz40 pz40Var9 = s6t0.f31722a;
        qc5 qc5Var2 = new qc5(null, new n0x(gw30Var.f), new y3d(s6t0.b().f33626a.getBackground()));
        n0x n0xVar6 = new n0x(gw30Var.e);
        if (gw30Var.f12006a) {
            kizVar = new kiz(new rf5(3, null));
        }
        return new gy30(ux30Var23, new rx30(n0xVar6, 0L, kizVar, R.drawable.sport_new, 0L, qc5Var2, 434), new zx30(new n0x(gw30Var.i), 3), 0L, null, null, 248);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v3, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.ArrayList] */
    public static final h280 U(d380 d380Var) {
        ?? arrayList;
        d380Var.getClass();
        String str = d380Var.f5391a;
        if (str == null) {
            str = "";
        }
        Integer num = d380Var.b;
        int iIntValue = num != null ? num.intValue() : 0;
        List<b680> list = d380Var.c;
        if (list != null) {
            arrayList = new ArrayList(r3d.q(list, 10));
            for (b680 b680Var : list) {
                b680Var.getClass();
                Integer num2 = b680Var.f2040a;
                int iIntValue2 = num2 != null ? num2.intValue() : 0;
                String str2 = b680Var.b;
                if (str2 == null) {
                    str2 = "";
                }
                String str3 = b680Var.c;
                if (str3 == null) {
                    str3 = "";
                }
                arrayList.add(new w580(iIntValue2, str2, str3));
            }
        } else {
            arrayList = 0;
        }
        if (arrayList == 0) {
            arrayList = iun.f15405a;
        }
        return new h280(str, arrayList, iIntValue);
    }

    public static final b7c0 V(dzc0 dzc0Var, ctf0 ctf0Var, boolean z) {
        xyc0 xyc0Var;
        l85 l85Var;
        ctf0Var.getClass();
        syc0 syc0Var = dzc0Var.f6938a;
        bzc0 bzc0Var = new bzc0(syc0Var.f33019a, syc0Var.b, true, syc0Var.d);
        i4 i4VarR0 = null;
        if (z) {
            xyc0Var = xyc0.b;
        } else {
            int iOrdinal = dzc0Var.b.ordinal();
            if (iOrdinal == 0) {
                xyc0Var = xyc0.f41702a;
            } else {
                if (iOrdinal != 1) {
                    t9f.b();
                    return null;
                }
                xyc0Var = xyc0.b;
            }
        }
        if (syc0Var.e) {
            lsm0 lsm0Var = ctf0Var.b;
            l85Var = new l85(lsm0Var.a(R.string.available_promocodes_title, Arrays.copyOf(new Object[0], 0)), lsm0Var.a(R.string.available_promocodes_info, Arrays.copyOf(new Object[0], 0)));
        } else {
            l85Var = null;
        }
        olc0 olc0Var = dzc0Var.c;
        boolean z2 = olc0Var.h;
        double d = olc0Var.f25446a;
        String str = olc0Var.c;
        if (z2) {
            lsm0 lsm0Var2 = ctf0Var.b;
            String strA = lsm0Var2.a(R.string.bet_sum, Arrays.copyOf(new Object[0], 0));
            int i = cy7.f5159a;
            pn40 pn40Var = pn40.f27267a;
            p3u0 p3u0Var = p3u0.c;
            i4VarR0 = dyb.r0(tx3.z(new nlc0[]{new nlc0(strA, cy7.e(pn40.d(d, str, p3u0Var)), false), new nlc0(lsm0Var2.a(R.string.min_coefficient_title, Arrays.copyOf(new Object[0], 0)), olc0Var.b, false), olc0Var.f ? new nlc0(lsm0Var2.a(R.string.bet_possible_win, Arrays.copyOf(new Object[0], 0)), cy7.e(pn40.d(olc0Var.e, str, p3u0Var)), true) : null, olc0Var.g ? new nlc0(lsm0Var2.a(R.string.bet_possible_payout, Arrays.copyOf(new Object[0], 0)), cy7.e(pn40.d((olc0Var.d - 1.0d) * d, str, p3u0Var)), true) : null}));
        }
        return new b7c0(bzc0Var, xyc0Var, l85Var, i4VarR0);
    }

    public static final e6d0 W(j6d0 j6d0Var) {
        return new e6d0(j6d0Var.f15979a, j6d0Var.b == u6d0.b ? t6d0.c : t6d0.b, j6d0Var.c, j6d0Var.d, j6d0Var.e, j6d0Var.f);
    }

    public static final zxj0 X(hao haoVar) {
        haoVar.getClass();
        long j = haoVar.c;
        rh7 rh7Var = haoVar.m;
        long j2 = rh7Var.f30476a;
        String str = haoVar.l;
        String str2 = rh7Var.b;
        String str3 = haoVar.k;
        double d = haoVar.d;
        double d2 = haoVar.f;
        tqt tqtVar = uoy.b;
        byte b = haoVar.q.f36034a;
        tqtVar.getClass();
        return new zxj0(j, j2, str, str2, str3, d, d2, haoVar.i, tqt.j(b), haoVar.b, haoVar.e, haoVar.r, haoVar.t);
    }

    public static final StatInfo Y(Map.Entry entry) {
        entry.getClass();
        Integer intOrNull = StringsKt.toIntOrNull((String) entry.getKey());
        Integer numValueOf = Integer.valueOf(intOrNull != null ? intOrNull.intValue() : 0);
        Iterable<zmo0> iterable = (Iterable) entry.getValue();
        ArrayList arrayList = new ArrayList(r3d.q(iterable, 10));
        for (zmo0 zmo0Var : iterable) {
            zmo0Var.getClass();
            b7m0 b7m0Var = zmo0Var.f44636a;
            z6m0 z6m0VarP0 = b7m0Var != null ? ucx.p0(b7m0Var) : z6m0.c;
            String str = zmo0Var.b;
            String str2 = "";
            if (str == null) {
                str = "";
            }
            String str3 = zmo0Var.c;
            if (str3 == null) {
                str3 = "";
            }
            String str4 = zmo0Var.d;
            if (str4 != null) {
                str2 = str4;
            }
            arrayList.add(new GameStatistic(z6m0VarP0, str, str3, str2));
        }
        return new StatInfo(numValueOf, arrayList);
    }

    public static final String Z(mcy mcyVar) {
        if (mcyVar == null || (mcyVar instanceof bdy)) {
            return "null";
        }
        ipb.f15154a.getClass();
        int iOrdinal = cl5.s(mcyVar).ordinal();
        if (iOrdinal == 0) {
            return String.valueOf(ncy.e(ncy.j(mcyVar)));
        }
        if (iOrdinal == 1) {
            yby ybyVarH = ncy.h(mcyVar);
            ArrayList arrayList = new ArrayList(r3d.q(ybyVarH, 10));
            Iterator it = ybyVarH.f42361a.iterator();
            while (it.hasNext()) {
                arrayList.add(Z((mcy) it.next()));
            }
            return arrayList.toString();
        }
        if (iOrdinal == 2) {
            Integer numG = ncy.g(ncy.j(mcyVar));
            return String.valueOf(numG != null ? numG.intValue() : 0);
        }
        if (iOrdinal != 3) {
            t9f.b();
            return null;
        }
        if (mcyVar instanceof jdy) {
            jdy jdyVar = (jdy) mcyVar;
            if (jdyVar.c()) {
                return jdyVar.b();
            }
        }
        return mcyVar.toString();
    }

    public static final void a(int i, int i2, fet fetVar, mm40 mm40Var, Function0 function0, boolean z) {
        mm40 mm40Var2;
        fetVar.g0(-952776954);
        int i3 = i2 | 6 | (fetVar.e(i) ? 32 : 16) | (fetVar.h(z) ? 256 : 128) | (fetVar.i(function0) ? 2048 : 1024);
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            boolean z2 = (i3 & 896) == 256;
            Object objP = fetVar.P();
            if (z2 || objP == ukd.f35823a) {
                wul wulVar = new wul(mul.e, oe9.c, new te9(i), z, false, false);
                fetVar.o0(wulVar);
                objP = wulVar;
            }
            int i4 = 6 | ((i3 >> 3) & 896);
            jm40 jm40Var = jm40.b;
            qzb.n(jm40Var, (wul) objP, function0, fetVar, i4, 0);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ed(mm40Var2, i, z, function0, i2, (byte) 6);
        }
    }

    public static final void b(int i, fet fetVar, mm40 mm40Var) {
        Object obj = phd.f26991a;
        fetVar.g0(-977568115);
        int i2 = (i & 6) == 0 ? (fetVar.g(null) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= fetVar.g(mm40Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(obj) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            String strJ = jtt0.j(R.string.m3c_snackbar_pane_title, fetVar);
            Object objP = fetVar.P();
            Object obj2 = objP;
            if (objP == ukd.f35823a) {
                hwo hwoVar = new hwo();
                hwoVar.f13776a = new Object();
                hwoVar.b = new ArrayList();
                fetVar.o0(hwoVar);
                obj2 = hwoVar;
            }
            hwo hwoVar2 = (hwo) obj2;
            Object obj3 = hwoVar2.f13776a;
            ArrayList arrayList = hwoVar2.b;
            if (Intrinsics.d(null, obj3)) {
                fetVar.e0(1443908949);
                fetVar.r(false);
            } else {
                fetVar.e0(1154891761);
                hwoVar2.f13776a = null;
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    ((gwo) arrayList.get(i3)).getClass();
                    arrayList2.add(null);
                }
                ArrayList arrayList3 = new ArrayList(arrayList2);
                if (!arrayList3.contains(null)) {
                    arrayList3.add(null);
                }
                arrayList.clear();
                ArrayList arrayList4 = new ArrayList(arrayList3.size());
                int size2 = arrayList3.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    Object obj4 = arrayList3.get(i4);
                    if (obj4 != null) {
                        arrayList4.add(obj4);
                    }
                }
                int size3 = arrayList4.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    if (arrayList4.get(i5) != null) {
                        hny.b();
                        return;
                    }
                    arrayList.add(new gwo(u1c.M(-1952400805, new ggc(hwoVar2, strJ, (byte) 3), fetVar)));
                }
                fetVar.r(false);
            }
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iX = e3c.x(fetVar);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            shd shdVar = gqw0.y;
            if (fetVar.S || !Intrinsics.d(fetVar.P(), Integer.valueOf(iX))) {
                rw2.t(iX, fetVar, iX, shdVar);
            }
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            yfe0 yfe0VarA = fetVar.A();
            if (yfe0VarA == null) {
                jf4.n("no recompose scope found");
                return;
            }
            yfe0VarA.b |= 1;
            hwoVar2.c = yfe0VarA;
            fetVar.e0(-1888182177);
            int size4 = arrayList.size();
            for (int i6 = 0; i6 < size4; i6++) {
                gwo gwoVar = (gwo) arrayList.get(i6);
                gwoVar.getClass();
                ugd ugdVar = gwoVar.f12036a;
                fetVar.b0(1325010085, null);
                ugd ugdVar2 = phd.f26991a;
                ugdVar.F(u1c.M(-1893791890, new x0((byte) 21), fetVar), fetVar, 6);
                fetVar.r(false);
            }
            fetVar.r(false);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new v2w(mm40Var, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:117:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:119:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:120:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:123:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:124:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:128:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:131:0x02e0  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(mm40 mm40Var, final vx6 vx6Var, ix6 ix6Var, lke lkeVar, String str, String str2, Function1 function1, final Function0 function0, final Function0 function2, fet fetVar, int i) {
        final vx6 vx6Var2;
        mm40 mm40Var2;
        fet fetVar2;
        androidx.compose.runtime.d dVar;
        long background;
        fet fetVar3;
        long background2;
        Object obj;
        float f;
        boolean z;
        fet fetVar4;
        Object obj2;
        int i2;
        fet fetVar5;
        boolean z2;
        boolean z3;
        boolean z4;
        Object objP;
        final byte b;
        fet fetVar6 = fetVar;
        boolean z5 = lkeVar.c;
        fetVar6.g0(-1535327816);
        int i3 = i | 6;
        if ((i & 48) == 0) {
            i3 |= fetVar6.g(vx6Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= fetVar6.e(ix6Var.ordinal()) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= fetVar6.g(lkeVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= fetVar6.g(str) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= fetVar6.g(str2) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= fetVar6.i(function1) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= fetVar6.i(function0) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i3 |= fetVar6.i(function2) ? 67108864 : 33554432;
        }
        int i4 = i3;
        if (fetVar6.U(i4 & 1, (i4 & 38347923) != 38347922)) {
            Object[] objArr = new Object[0];
            Object objP2 = fetVar6.P();
            Object obj3 = ukd.f35823a;
            if (objP2 == obj3) {
                objP2 = new qgx((byte) 25);
                fetVar6.o0(objP2);
            }
            pz40 pz40Var = (pz40) e9x.Q(objArr, (Function0) objP2, fetVar6, 48);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.h;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarE = h97.e(zclVar, zclVar, zclVar, zclVar, mm40VarD);
            if (((Boolean) pz40Var.getValue()).booleanValue()) {
                fetVar6.e0(2018738687);
                dVar = zaq0.b;
                background = ((ThemeColors) fetVar6.k(dVar)).getPrimary();
            } else {
                fetVar6.e0(2018739682);
                dVar = zaq0.b;
                background = ((ThemeColors) fetVar6.k(dVar)).getBackground();
            }
            fetVar6.r(false);
            mm40 mm40VarS = i120.S(mm40VarE, 1.0f, background, new ugg0(zclVar, zclVar, zclVar, zclVar));
            int i5 = i4 >> 6;
            int iOrdinal = ix6Var.ordinal();
            if (iOrdinal == 0) {
                fetVar3 = fetVar;
                fetVar3.e0(-405410347);
                background2 = ((ThemeColors) fetVar3.k(dVar)).getBackground();
                fetVar3.r(false);
            } else if (iOrdinal == 1) {
                fetVar3 = fetVar;
                fetVar3.e0(-405408554);
                background2 = ((ThemeColors) fetVar3.k(dVar)).getWarningTint();
                fetVar3.r(false);
            } else {
                if (iOrdinal != 2) {
                    throw b1j.f(-405412151, fetVar, false);
                }
                fetVar3 = fetVar;
                fetVar3.e0(-405406635);
                background2 = ((ThemeColors) fetVar3.k(dVar)).getBackground();
                fetVar3.r(false);
            }
            mm40 mm40VarK = s5x0.K(i120.Q(mm40VarS, background2, jd8.n), 8.0f, 6.0f);
            thg0 thg0VarA = shg0.a(uc9.e, gqw0.k, fetVar3, 54);
            int iHashCode = Long.hashCode(fetVar3.T);
            bh90 bh90VarM = fetVar3.m();
            mm40 mm40VarC0 = kbc.c0(fetVar3, mm40VarK);
            mkd.c0.getClass();
            fetVar3.i0();
            if (fetVar3.S) {
                fetVar3.l(e7z.u1);
            } else {
                fetVar3.r0();
            }
            jpm0.o(fetVar3, thg0VarA, gqw0.x);
            jpm0.o(fetVar3, bh90VarM, gqw0.w);
            jpm0.o(fetVar3, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar3);
            jpm0.o(fetVar3, mm40VarC0, gqw0.v);
            if (z5) {
                fetVar3.e0(391737732);
                boolean z6 = lkeVar.f20198a;
                boolean z7 = ((i4 & 234881024) == 67108864) | ((i4 & 112) == 32);
                Object objP3 = fetVar3.P();
                if (z7 || objP3 == obj3) {
                    b = 0;
                    objP3 = new Function0() { // from class: a.d7y
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            byte b2 = b;
                            Function0 function3 = function2;
                            vx6 vx6Var3 = vx6Var;
                            switch (b2) {
                                case 0:
                                    kcx.O(vx6Var3);
                                    function3.invoke();
                                    break;
                                default:
                                    kcx.O(vx6Var3);
                                    function3.invoke();
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    };
                    fetVar3.o0(objP3);
                } else {
                    b = 0;
                }
                Function0 function3 = (Function0) objP3;
                fet fetVar7 = fetVar3;
                obj = obj3;
                f = 1.0f;
                z = true;
                a(R.drawable.ic_glyph_minus_small, 0, fetVar7, null, function3, z6);
                fet fetVar8 = fetVar7;
                fetVar8.r(b);
                fetVar4 = fetVar8;
            } else {
                obj = obj3;
                fet fetVar9 = fetVar3;
                f = 1.0f;
                z = true;
                fetVar9.e0(392024110);
                fetVar9.r(false);
                fetVar4 = fetVar9;
            }
            x7z x7zVar = new x7z(f, z);
            boolean zBooleanValue = ((Boolean) pz40Var.getValue()).booleanValue();
            boolean zG = fetVar4.g(pz40Var);
            Object objP4 = fetVar4.P();
            if (zG) {
                obj2 = obj;
            } else {
                obj2 = obj;
                if (objP4 == obj2) {
                }
                Function1 function4 = (Function1) objP4;
                i2 = i4 & 112;
                int i6 = (i5 & 896) | i2 | ((i4 << 3) & 7168) | (57344 & (i4 >> 3)) | (i4 & 3670016);
                Object obj4 = obj2;
                fetVar5 = fetVar4;
                j(x7zVar, vx6Var, str, ix6Var, str2, zBooleanValue, function1, function4, fetVar5, i6);
                vx6Var2 = vx6Var;
                if (z5) {
                    fetVar5.e0(392458823);
                    boolean z8 = lkeVar.b;
                    if (i2 == 32) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if ((i4 & 29360128) == 8388608) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    z4 = z3 | z2;
                    objP = fetVar5.P();
                    if (z4 || objP == obj4) {
                        final byte b2 = 1;
                        objP = new Function0() { // from class: a.d7y
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                byte b3 = b2;
                                Function0 function5 = function0;
                                vx6 vx6Var3 = vx6Var2;
                                switch (b3) {
                                    case 0:
                                        kcx.O(vx6Var3);
                                        function5.invoke();
                                        break;
                                    default:
                                        kcx.O(vx6Var3);
                                        function5.invoke();
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        };
                        fetVar5.o0(objP);
                    }
                    a(R.drawable.ic_glyph_plus_small, 0, fetVar5, null, (Function0) objP, z8);
                    fetVar5.r(false);
                } else {
                    fetVar5.e0(392742318);
                    fetVar5.r(false);
                }
                fetVar5.r(true);
                mm40Var2 = jm40Var;
                fetVar2 = fetVar5;
            }
            objP4 = new y9v(pz40Var, (byte) 7);
            fetVar4.o0(objP4);
            Function1 function5 = (Function1) objP4;
            i2 = i4 & 112;
            int i7 = (i5 & 896) | i2 | ((i4 << 3) & 7168) | (57344 & (i4 >> 3)) | (i4 & 3670016);
            Object obj5 = obj2;
            fetVar5 = fetVar4;
            j(x7zVar, vx6Var, str, ix6Var, str2, zBooleanValue, function1, function5, fetVar5, i7);
            vx6Var2 = vx6Var;
            if (z5) {
                fetVar5.e0(392458823);
                boolean z9 = lkeVar.b;
                if (i2 == 32) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if ((i4 & 29360128) == 8388608) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                z4 = z3 | z2;
                objP = fetVar5.P();
                if (z4) {
                    final byte b3 = 1;
                    objP = new Function0() { // from class: a.d7y
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            byte b4 = b3;
                            Function0 function6 = function0;
                            vx6 vx6Var3 = vx6Var2;
                            switch (b4) {
                                case 0:
                                    kcx.O(vx6Var3);
                                    function6.invoke();
                                    break;
                                default:
                                    kcx.O(vx6Var3);
                                    function6.invoke();
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    };
                    fetVar5.o0(objP);
                } else {
                    final byte b4 = 1;
                    objP = new Function0() { // from class: a.d7y
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            byte b5 = b4;
                            Function0 function6 = function0;
                            vx6 vx6Var3 = vx6Var2;
                            switch (b5) {
                                case 0:
                                    kcx.O(vx6Var3);
                                    function6.invoke();
                                    break;
                                default:
                                    kcx.O(vx6Var3);
                                    function6.invoke();
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    };
                    fetVar5.o0(objP);
                }
                a(R.drawable.ic_glyph_plus_small, 0, fetVar5, null, (Function0) objP, z9);
                fetVar5.r(false);
            } else {
                fetVar5.e0(392742318);
                fetVar5.r(false);
            }
            fetVar5.r(true);
            mm40Var2 = jm40Var;
            fetVar2 = fetVar5;
        } else {
            vx6Var2 = vx6Var;
            fetVar6.X();
            mm40Var2 = mm40Var;
            fetVar2 = fetVar6;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ez3(mm40Var2, (Object) vx6Var2, (Object) ix6Var, (Object) lkeVar, str, (Object) str2, (wdr) function1, (wdr) function0, (wdr) function2, i, (byte) 6);
        }
    }

    public static final void d(mm40 mm40Var, l7m0 l7m0Var, String str, String str2, boolean z, boolean z2, Function1 function1, Function1 function2, fet fetVar, int i) {
        l7m0 l7m0Var2;
        String str3;
        boolean z3;
        mm40 mm40Var2;
        long textPrimary;
        fetVar.g0(-2000998536);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            l7m0Var2 = l7m0Var;
            i2 |= fetVar.g(l7m0Var2) ? 32 : 16;
        } else {
            l7m0Var2 = l7m0Var;
        }
        if ((i & 384) == 0) {
            str3 = str;
            i2 |= fetVar.g(str3) ? 256 : 128;
        } else {
            str3 = str;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.g(str2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            z3 = z;
            i2 |= fetVar.h(z3) ? 16384 : 8192;
        } else {
            z3 = z;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar.h(z2) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= fetVar.i(function1) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= fetVar.i(function2) ? 8388608 : 4194304;
        }
        if (fetVar.U(i2 & 1, (4793491 & i2) != 4793490)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarD);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            a8q0 a8q0Var = (a8q0) l7m0Var2.getValue();
            Object[] objArr = new Object[0];
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (objP == obj) {
                objP = new qgx((byte) 22);
                fetVar.o0(objP);
            }
            pz40 pz40Var = (pz40) e9x.Q(objArr, (Function0) objP, fetVar, 48);
            Object[] objArr2 = new Object[0];
            Object objP2 = fetVar.P();
            if (objP2 == obj) {
                objP2 = new qgx((byte) 24);
                fetVar.o0(objP2);
            }
            pz40 pz40Var2 = (pz40) e9x.Q(objArr2, (Function0) objP2, fetVar, 48);
            if (z2) {
                fetVar.e0(623233147);
                textPrimary = ((ThemeColors) fetVar.k(zaq0.b)).getSecondary60();
                fetVar.r(false);
            } else {
                fetVar.e0(623291675);
                textPrimary = ((ThemeColors) fetVar.k(zaq0.b)).getTextPrimary();
                fetVar.r(false);
            }
            Boolean bool = (Boolean) pz40Var.getValue();
            bool.booleanValue();
            boolean zG = fetVar.g(pz40Var) | ((i2 & 3670016) == 1048576);
            Object objP3 = fetVar.P();
            if (zG || objP3 == obj) {
                objP3 = new ua4(function1, pz40Var, null, (byte) 6);
                fetVar.o0(objP3);
            }
            m0x0.t(fetVar, bool, (Function2) objP3);
            boolean z4 = z3;
            mm40Var2 = jm40Var;
            obc.d(bmd.n.a(k6z.f17794a), u1c.M(-1796931726, new y6y(str2, textPrimary, a8q0Var, pz40Var, pz40Var2, function2, function1, z4, str3, (byte) 1), fetVar), fetVar, 56);
            fetVar.r(true);
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new z6y(mm40Var2, l7m0Var2, str, str2, z, z2, function1, function2, i, (byte) 1);
        }
    }

    public static final void e(mm40 mm40Var, px6 px6Var, Function1 function1, Function0 function0, Function0 function2, fet fetVar, int i) {
        mm40 mm40Var2;
        ix6 ix6Var = px6Var.d;
        function1.getClass();
        function0.getClass();
        function2.getClass();
        fetVar.g0(-344699103);
        int i2 = i | 6 | (fetVar.g(px6Var) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128) | (fetVar.i(function0) ? 2048 : 1024) | (fetVar.i(function2) ? 16384 : 8192);
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarN = epv0.N(s5x0.L(jm40Var, 16.0f, 0.0f, 2), ix6Var == ix6.c ? 0.5f : 1.0f);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarN);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            c(null, px6Var.f27739a, ix6Var, px6Var.c, px6Var.b, px6Var.e, function1, function0, function2, fetVar, (i2 << 12) & 267911168);
            fetVar.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ajw((Object) mm40Var2, (Object) px6Var, (Object) function1, (Object) function0, (Object) function2, i, (byte) 2);
        }
    }

    public static final void f(a4x a4xVar, Function1 function1, fet fetVar, int i) {
        int i2;
        a4x a4xVar2;
        Function1 function2;
        a4xVar.getClass();
        function1.getClass();
        fetVar.g0(27691502);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(a4xVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.i(function1) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zfn zfnVar = bmd.h;
            w6k w6kVar = (w6k) fetVar.k(zfnVar);
            zcl zclVar = qmk.f28987a;
            a4xVar2 = a4xVar;
            function2 = function1;
            obc.d(bmd.n.a(k6z.f17794a), u1c.M(874773806, new ko8(a4xVar2, ((w6k) fetVar.k(zfnVar)).w0(8.0f) * 2.0f, w6kVar.w0(8.0f), ((w6k) fetVar.k(zfnVar)).w0(100.0f), function2), fetVar), fetVar, 56);
        } else {
            a4xVar2 = a4xVar;
            function2 = function1;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new lr0((byte) 5, i, a4xVar2, function2);
        }
    }

    public static final void g(mm40 mm40Var, vx6 vx6Var, ix6 ix6Var, String str, boolean z, Function1 function1, Function1 function2, fet fetVar, int i) {
        int i2;
        fetVar.g0(-408480460);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(vx6Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.e(ix6Var.ordinal()) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.g(str) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.h(z) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar.i(function1) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= fetVar.i(function2) ? 1048576 : 524288;
        }
        boolean z2 = true;
        if (fetVar.U(i2 & 1, (599187 & i2) != 599186)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 22.0f);
            thg0 thg0VarA = shg0.a(new qw3(2.0f, true, new jf4((byte) 14)), gqw0.k, fetVar, 48);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarE);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            pz40 pz40Var = vx6Var.f38186a;
            String str2 = vx6Var.b;
            if (ix6Var == ix6.c) {
                z2 = false;
            }
            boolean z3 = (i2 & 458752) == 131072;
            Object objP = fetVar.P();
            if (z3 || objP == ukd.f35823a) {
                objP = new i1y(function1, (byte) 9);
                fetVar.o0(objP);
            }
            int i3 = i2 & 7168;
            int i4 = i2 << 3;
            d(null, pz40Var, str2, str, z2, z, (Function1) objP, function2, fetVar, i3 | (458752 & i4) | (i4 & 29360128));
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o84(mm40Var, (Object) vx6Var, (Enum) ix6Var, str, z, function1, function2, i, (byte) 14);
        }
    }

    public static final void h(aq20 aq20Var, fet fetVar, int i) {
        int i2;
        fetVar.g0(-925578102);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(aq20Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            obc.d(bmd.n.a(k6z.f17794a), u1c.M(1742516170, new b120(aq20Var, (byte) 10), fetVar), fetVar, 56);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o6o(aq20Var, i, (byte) 26);
        }
    }

    public static final void i(mm40 mm40Var, l7m0 l7m0Var, xcz xczVar, Function1 function1, Function1 function2, xdr xdrVar, xdr xdrVar2, xdr xdrVar3, Function1 function3, fet fetVar, int i) {
        int i2;
        Function1 function4 = function1;
        l7m0Var.getClass();
        function4.getClass();
        function2.getClass();
        xdrVar.getClass();
        xdrVar2.getClass();
        xdrVar3.getClass();
        function3.getClass();
        fetVar.g0(-588589442);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(l7m0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(xczVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(function4) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.i(function2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar.i(xdrVar) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= fetVar.i(xdrVar2) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= fetVar.i(xdrVar3) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= fetVar.i(function3) ? 67108864 : 33554432;
        }
        int i3 = i2;
        if (fetVar.U(i3 & 1, (38347923 & i3) != 38347922)) {
            fetVar.Z();
            if ((i & 1) != 0 && !fetVar.B()) {
                fetVar.X();
            }
            fetVar.s();
            long backgroundContent = ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent();
            pz40 pz40Var = s6t0.f31722a;
            mm40 mm40VarQ = i120.Q(mm40Var, s6t0.b().f33626a.getBackground(), jd8.n);
            zcl zclVar = qmk.f28987a;
            lh80 lh80Var = new lh80(8.0f, 8.0f, 8.0f, 24.0f);
            byte b = 1;
            ugd ugdVarM = u1c.M(-987877640, new vz20(xdrVar2, xdrVar3, function3, b), fetVar);
            function4 = function1;
            c030.a(mm40VarQ, l7m0Var, lh80Var, xczVar, ugdVarM, u1c.M(-1646951668, new kgx(backgroundContent, function4, function2, (byte) 3), fetVar), u1c.M(844026661, new xz20(xdrVar, function4, function2, b), fetVar), dj8.e, dj8.f, fetVar, (i3 & 112) | 115040256 | ((i3 << 3) & 7168), 0);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new yz20(mm40Var, l7m0Var, xczVar, function4, function2, xdrVar, xdrVar2, xdrVar3, function3, i, (byte) 1);
        }
    }

    public static final void j(mm40 mm40Var, vx6 vx6Var, String str, ix6 ix6Var, String str2, boolean z, Function1 function1, Function1 function2, fet fetVar, int i) {
        int i2;
        ix6 ix6Var2;
        fetVar.g0(424467071);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(vx6Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.e(ix6Var.ordinal()) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.g(str2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar.h(z) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= fetVar.i(function1) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= fetVar.i(function2) ? 8388608 : 4194304;
        }
        if (fetVar.U(i2 & 1, (4793491 & i2) != 4793490)) {
            zcl zclVar = qmk.f28987a;
            x5d x5dVarA = w5d.a(new qw3(2.0f, true, new jf4((byte) 14)), gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            int i3 = (i2 & 112) | 6;
            int i4 = i2 >> 3;
            ix6Var2 = ix6Var;
            g(o7k0.d(jm40.b, 1.0f), vx6Var, ix6Var2, str2, z, function1, function2, fetVar, (3670016 & i4) | i3 | (i4 & 896) | (i4 & 7168) | (57344 & i4) | (458752 & i4));
            w(null, str, ix6Var2, fetVar, i4 & 1008);
            fetVar.r(true);
        } else {
            ix6Var2 = ix6Var;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gw6(mm40Var, (Object) vx6Var, str, (Enum) ix6Var2, str2, z, function1, function2, i, (byte) 12);
        }
    }

    public static final void k(c280 c280Var, String str, fet fetVar, int i) {
        int i2;
        fet fetVar2 = fetVar;
        fetVar2.g0(1190886010);
        if ((i & 6) == 0) {
            i2 = i | (fetVar2.g(c280Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(str) ? 32 : 16;
        }
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            yx7 yx7Var = gqw0.k;
            zcl zclVar = qmk.f28987a;
            qw3 qw3Var = new qw3(4.0f, true, new jf4((byte) 14));
            mm40 mm40VarE = o7k0.e(jm40.b, 24.0f);
            thg0 thg0VarA = shg0.a(qw3Var, yx7Var, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarE);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            boolean z = (i2 & 14) == 4;
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new u6n(d4d.SECONDARY60, w6n.j, c280Var);
                fetVar2.o0(objP);
            }
            u6n u6nVar = (u6n) objP;
            boolean zG = fetVar2.g(u6nVar);
            Object objP2 = fetVar2.P();
            if (zG || objP2 == cl5Var) {
                objP2 = new d1n(u6nVar, (byte) 1);
                fetVar2.o0(objP2);
            }
            kkb.p(1, fetVar2, null, (Function0) objP2);
            v8q0.a(str, null, ((ThemeColors) fetVar2.k(zaq0.b)).getTextPrimary(), new n05(qmk.p, g1t0.d().f42262a.b, qmk.n), 0L, null, null, null, 0L, null, qmk.C, 2, false, 2, 0, null, g1t0.d(), fetVar, (i2 >> 3) & 14, 24960, 108530);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new p5l0(c280Var, str, i, (byte) 3);
        }
    }

    public static final void l(int i, long j, long j2, fet fetVar, c280 c280Var, c280 c280Var2, String str, String str2, String str3, String str4, boolean z, boolean z2) {
        c280 c280Var3;
        fet fetVar2 = fetVar;
        fetVar2.g0(573243124);
        int i2 = (fetVar2.f(j2) ? 536870912 : 268435456) | i | (fetVar.g(c280Var) ? 4 : 2) | (fetVar2.g(str) ? 32 : 16) | (fetVar2.g(c280Var2) ? 256 : 128) | (fetVar2.g(str2) ? 2048 : 1024) | (fetVar2.h(z) ? 16384 : 8192) | (fetVar2.g(str3) ? 131072 : 65536) | (fetVar2.f(j) ? 1048576 : 524288) | (fetVar2.h(z2) ? 8388608 : 4194304) | (fetVar2.g(str4) ? 67108864 : 33554432);
        if (fetVar2.U(i2 & 1, (306783379 & i2) != 306783378)) {
            yx7 yx7Var = gqw0.k;
            zcl zclVar = qmk.f28987a;
            qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            thg0 thg0VarA = shg0.a(qw3Var, yx7Var, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarD);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z3 = fetVar2.S;
            pcy pcyVar = e7z.u1;
            if (z3) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar2, thg0VarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            mm40 mm40VarH = dw9.h(1.0f, o7k0.e(jm40Var, 52.0f), true);
            x5d x5dVarA = w5d.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.m, fetVar2, 0);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarH);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar4);
            c280Var3 = c280Var;
            k(c280Var3, str, fetVar2, i2 & 126);
            k(c280Var2, str2, fetVar2, (i2 >> 6) & 126);
            fetVar2.r(true);
            mm40 mm40VarE = o7k0.e(jm40Var, 52.0f);
            x5d x5dVarA2 = w5d.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.o, fetVar2, 48);
            int iHashCode3 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM3 = fetVar2.m();
            mm40 mm40VarC2 = kbc.c0(fetVar2, mm40VarE);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA2, shdVar);
            jpm0.o(fetVar2, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC2, shdVar4);
            q((i2 >> 12) & 1022, j, fetVar2, str3, z);
            fetVar2 = fetVar;
            q((i2 >> 21) & 1022, j2, fetVar2, str4, z2);
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            c280Var3 = c280Var;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new s5l0(c280Var3, str, c280Var2, str2, z, str3, j, z2, str4, j2, i, (byte) 1);
        }
    }

    public static final void m(int i, fet fetVar, mm40 mm40Var) {
        fetVar.g0(-336749179);
        if (fetVar.U(i & 1, (i & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40Var, 80.0f);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            qxw.o(fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE), vbc.d0(null, fetVar, 0, 1)));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new mp50(mm40Var, i, (byte) 14);
        }
    }

    public static final void n(mm40 mm40Var, qhs0 qhs0Var, fet fetVar, int i) {
        byte b;
        pcy pcyVar;
        fet fetVar2 = fetVar;
        Object objValueOf = Integer.valueOf(R.drawable.ic_history_dialog_cancel);
        mm40Var.getClass();
        qhs0Var.getClass();
        fetVar2.g0(-1810135901);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(qhs0Var) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            pz40 pz40Var = s6t0.f31722a;
            mm40 mm40VarQ = i120.Q(mm40VarD, s6t0.b().f33626a.getBackgroundContent(), jd8.n);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(mm40VarQ, 0.0f, 16.0f, 1);
            yx7 yx7Var = gqw0.k;
            lw3 lw3Var = uc9.f35418a;
            thg0 thg0VarA = shg0.a(lw3Var, yx7Var, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarL);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z = fetVar2.S;
            pcy pcyVar2 = e7z.u1;
            if (z) {
                fetVar2.l(pcyVar2);
            } else {
                fetVar2.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar2, thg0VarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            nw3 nw3Var = uc9.e;
            xx7 xx7Var = gqw0.m;
            x5d x5dVarA = w5d.a(nw3Var, xx7Var, fetVar2, 6);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC1 = kbc.c0(fetVar2, jm40Var);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar2);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar4);
            dww.c(a8k0.F(R.drawable.ic_transfer_arrow, 0, fetVar2), null, o7k0.e(o7k0.s(s5x0.N(jm40Var, 16.0f, 0.0f, 0.0f, 0.0f, 14), 10.0f), 50.0f), s6t0.b().f33626a.getSeparator(), fetVar2, 56, 0);
            fetVar2.r(true);
            mm40 mm40VarN = s5x0.N(new x7z(1.0f, true), 8.0f, 0.0f, 8.0f, 0.0f, 10);
            x5d x5dVarA2 = w5d.a(uc9.c, xx7Var, fetVar2, 0);
            int iHashCode3 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM3 = fetVar2.m();
            mm40 mm40VarC2 = kbc.c0(fetVar2, mm40VarN);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar2);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA2, shdVar);
            jpm0.o(fetVar2, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC2, shdVar4);
            mm40 mm40VarN2 = s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 8.0f, 7);
            thg0 thg0VarA2 = shg0.a(lw3Var, yx7Var, fetVar2, 48);
            int iHashCode4 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM4 = fetVar2.m();
            mm40 mm40VarC3 = kbc.c0(fetVar2, mm40VarN2);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar2);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA2, shdVar);
            jpm0.o(fetVar2, bh90VarM4, shdVar2);
            vqd.u(iHashCode4, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC3, shdVar4);
            b = 1;
            k7x.b(qhs0Var.b.length() > 0 ? qhs0Var.d : objValueOf, null, o7k0.n(jm40Var, 24.0f), a8k0.F(R.drawable.ic_team_logo_placeholder, 0, fetVar2), a8k0.F(R.drawable.ic_team_logo_placeholder, 0, fetVar2), null, null, null, null, null, null, null, fetVar, 36912, 0, 32736);
            v8q0.a(qhs0Var.b, s5x0.N(jm40Var, 8.0f, 0.0f, 0.0f, 0.0f, 14), s6t0.b().f33626a.getTextPrimary(), null, 0L, null, null, null, 0L, new f2q0(5), 0L, 0, false, 0, 0, null, g1t0.d(), fetVar, 0, 0, 130040);
            fetVar.r(true);
            mm40 mm40VarN3 = s5x0.N(jm40Var, 0.0f, 8.0f, 0.0f, 0.0f, 13);
            thg0 thg0VarA3 = shg0.a(lw3Var, yx7Var, fetVar, 48);
            int iHashCode5 = Long.hashCode(fetVar.T);
            bh90 bh90VarM5 = fetVar.m();
            mm40 mm40VarC4 = kbc.c0(fetVar, mm40VarN3);
            fetVar.i0();
            if (fetVar.S) {
                pcyVar = pcyVar2;
                fetVar.l(pcyVar);
            } else {
                pcyVar = pcyVar2;
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA3, shdVar);
            jpm0.o(fetVar, bh90VarM5, shdVar2);
            vqd.u(iHashCode5, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC4, shdVar4);
            mm40 mm40VarN4 = o7k0.n(jm40Var, 24.0f);
            if (qhs0Var.c.length() > 0) {
                objValueOf = qhs0Var.e;
            }
            pcy pcyVar3 = pcyVar;
            k7x.b(objValueOf, null, mm40VarN4, a8k0.F(R.drawable.ic_team_logo_placeholder, 0, fetVar), a8k0.F(R.drawable.ic_team_logo_placeholder, 0, fetVar), null, null, null, null, null, null, null, fetVar, 36912, 0, 32736);
            v8q0.a(qhs0Var.c, s5x0.N(jm40Var, 8.0f, 0.0f, 0.0f, 0.0f, 14), s6t0.b().f33626a.getTextPrimary(), null, 0L, null, null, null, 0L, new f2q0(5), 0L, 0, false, 0, 0, null, g1t0.d(), fetVar, 0, 0, 130040);
            fetVar.r(true);
            fetVar.r(true);
            mm40 mm40VarN5 = s5x0.N(jm40Var, 0.0f, 0.0f, 16.0f, 0.0f, 11);
            x5d x5dVarA3 = w5d.a(nw3Var, gqw0.o, fetVar, 54);
            int iHashCode6 = Long.hashCode(fetVar.T);
            bh90 bh90VarM6 = fetVar.m();
            mm40 mm40VarC5 = kbc.c0(fetVar, mm40VarN5);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar3);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA3, shdVar);
            jpm0.o(fetVar, bh90VarM6, shdVar2);
            vqd.u(iHashCode6, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC5, shdVar4);
            v8q0.a(qhs0Var.f28755a, s5x0.N(jm40Var, 8.0f, 0.0f, 0.0f, 2.0f, 6), s6t0.b().f33626a.getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.g(), fetVar, 0, 0, 131064);
            v8q0.a(qhs0Var.f, s5x0.N(jm40Var, 8.0f, 2.0f, 0.0f, 0.0f, 12), s6t0.b().f33626a.getPrimary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.j(), fetVar, 0, 0, 131064);
            fetVar2 = fetVar;
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            b = 1;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new r7a0(mm40Var, qhs0Var, i, b);
        }
    }

    public static final void o(m110 m110Var, mm40 mm40Var, fet fetVar, int i) {
        m110Var.getClass();
        fetVar.g0(-1781086521);
        byte b = 4;
        int i2 = i | (fetVar.g(m110Var) ? 4 : 2) | (fetVar.g(mm40Var) ? 32 : 16);
        byte b2 = 0;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            mbc.f(mm40Var, 0.5f, 0.5f, u1c.M(-58898132, new l110(m110Var, b2), fetVar), null, u1c.M(-1989399958, new l110(m110Var, b), fetVar), null, u1c.M(375065512, new l110(m110Var, (byte) 5), fetVar), u1c.M(1788537962, new l110(m110Var, (byte) 6), fetVar), u1c.M(-1324196599, new l110(m110Var, (byte) 7), fetVar), u1c.M(-141963864, new l110(m110Var, (byte) 8), fetVar), fetVar, ((i2 >> 3) & 14) | 818089344, 438, 338);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new k110((Object) m110Var, (Object) mm40Var, i, (byte) 1);
        }
    }

    public static final void p(int i, fet fetVar) {
        fet fetVar2;
        fetVar.g0(-1149797393);
        if (fetVar.U(i & 1, i != 0)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarS = o7k0.s(jm40Var, 24.0f);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarS);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            fetVar2 = fetVar;
            j0x.b(a8k0.F(R.drawable.ic_valorant_switch_round, 0, fetVar), null, o2e.e0(o7k0.n(s5x0.N(jm40Var, 6.0f, 0.0f, 0.0f, 0.0f, 14), 14.0f), "ROUND_STATISTIC_SWITCH_IMAGE"), null, null, 0.0f, null, fetVar2, 56, 120);
            fetVar2.r(true);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new vtf0(i, (byte) 17);
        }
    }

    public static final void q(int i, long j, fet fetVar, String str, boolean z) {
        int i2;
        long j2;
        fetVar.g0(1408909812);
        if ((i & 6) == 0) {
            i2 = (fetVar.h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            j2 = j;
            i2 |= fetVar.f(j2) ? 256 : 128;
        } else {
            j2 = j;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            yx7 yx7Var = gqw0.k;
            zcl zclVar = qmk.f28987a;
            qw3 qw3Var = new qw3(4.0f, true, new jf4((byte) 14));
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE = o7k0.e(jm40Var, 24.0f);
            thg0 thg0VarA = shg0.a(qw3Var, yx7Var, fetVar, 48);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarE);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z2 = fetVar.S;
            pcy pcyVar = e7z.u1;
            if (z2) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar, thg0VarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar3);
            jpm0.n(fetVar);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar4);
            mm40 mm40VarS = o7k0.s(s5x0.N(o7k0.c(jm40Var, 1.0f), 4.0f, 0.0f, 0.0f, 0.0f, 14), 6.0f);
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarS);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            if (z) {
                fetVar.e0(-238654069);
                vzb.h(0, fetVar, null);
                fetVar.r(false);
            } else {
                fetVar.e0(-238610824);
                fetVar.r(false);
            }
            fetVar.r(true);
            v8q0.a(str, o7k0.u(jm40Var, 0.0f, 144.0f, 1), j2, new n05(qmk.o, g1t0.a().f42262a.b, qmk.n), 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.a(), fetVar, ((i2 >> 3) & 14) | (i2 & 896), 24960, 110576);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new t5l0(z, str, j, i, (byte) 1);
        }
    }

    public static final void r(mm40 mm40Var, j83 j83Var, y9q0 y9q0Var, fet fetVar, int i) {
        int i2;
        fet fetVar2;
        fetVar.g0(2058397465);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(j83Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(y9q0Var) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            v8q0.b(j83Var, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 1, 0, null, null, y9q0Var, fetVar, (i2 >> 3) & 14, ((i2 << 18) & 234881024) | 24576, 245758);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new e3h0(mm40Var, j83Var, y9q0Var, i, (byte) 3);
        }
    }

    public static final void s(Function1 function1, b8j0 b8j0Var, mm40 mm40Var, fet fetVar, int i) {
        function1.getClass();
        b8j0Var.getClass();
        fetVar.g0(426103219);
        int i2 = i | (fetVar.i(function1) ? 4 : 2) | (fetVar.g(b8j0Var) ? 32 : 16) | (fetVar.g(mm40Var) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = c8j0.f3917a;
                fetVar.o0(objP);
            }
            xdr xdrVar = (xdr) ((jhy) objP);
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = new wvi0((byte) 21);
                fetVar.o0(objP2);
            }
            Function1 function2 = (Function1) objP2;
            boolean z = ((i2 & 112) == 32) | ((i2 & 14) == 4);
            Object objP3 = fetVar.P();
            if (z || objP3 == cl5Var) {
                objP3 = new nb(b8j0Var, function1, (byte) 5);
                fetVar.o0(objP3);
            }
            y860.g(xdrVar, mm40Var, function2, null, (Function1) objP3, fetVar, ((i2 >> 3) & 112) | 390, 8);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new fzi0(function1, (hej0) b8j0Var, mm40Var, i, (byte) 7);
        }
    }

    public static final void t(odk0 odk0Var, mm40 mm40Var, xdr xdrVar, fet fetVar, int i) {
        int i2;
        mm40 mm40Var2;
        fetVar.g0(-1077081618);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(odk0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 432;
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            xdrVar = phd.f26991a;
            if (((hgk0) odk0Var.f25080a).getValue() != null) {
                hny.b();
                return;
            }
            w6 w6Var = (w6) fetVar.k(bmd.f2832a);
            yje yjeVar = null;
            boolean zG = fetVar.g(null) | fetVar.i(w6Var);
            Object objP = fetVar.P();
            if (zG || objP == ukd.f35823a) {
                objP = new tmg0(w6Var, yjeVar, (byte) 18);
                fetVar.o0(objP);
            }
            m0x0.t(fetVar, null, (Function2) objP);
            if (((hgk0) odk0Var.f25080a).getValue() != null) {
                hny.b();
                return;
            }
            int i4 = i3 & 1008;
            jm40 jm40Var = jm40.b;
            b(i4, fetVar, jm40Var);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        xdr xdrVar2 = xdrVar;
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wbg0((Object) odk0Var, mm40Var2, (Object) xdrVar2, i, (byte) 20);
        }
    }

    public static final void u(mm40 mm40Var, ztm ztmVar, fet fetVar, int i) {
        int i2;
        fet fetVar2 = fetVar;
        String str = ztmVar.m;
        String str2 = ztmVar.l;
        fetVar2.g0(-1297335042);
        if ((i & 6) == 0) {
            i2 = i | (fetVar2.g(mm40Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(ztmVar) ? 32 : 16;
        }
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(mm40VarD, 12.0f, 0.0f, 2);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarL);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            c280 c280Var = ztmVar.e;
            String str3 = ztmVar.f44968a;
            c280 c280Var2 = ztmVar.f;
            String str4 = ztmVar.g;
            boolean z = ztmVar.b;
            String str5 = ztmVar.c;
            l(0, ztmVar.d, ztmVar.j, fetVar, c280Var, c280Var2, str3, str4, str5, ztmVar.i, z, ztmVar.h);
            fetVar2 = fetVar;
            if (str2.length() <= 0 && str.length() <= 0 && ztmVar.k.length() <= 0) {
                fetVar2.e0(-117737574);
                fetVar2.r(false);
            } else {
                fetVar2.e0(-117965331);
                sj3.p(6, 0, fetVar2, jm40.b, ztmVar.k, str2, str);
                fetVar2.r(false);
            }
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o1l0((Object) mm40Var, (Object) ztmVar, i, (byte) 4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x007b  */
    public static final void v(mm40 mm40Var, wll0 wll0Var, Function1 function1, fet fetVar, int i) {
        mm40 mm40Var2;
        float f;
        wll0Var.getClass();
        v12 v12Var = wll0Var.d;
        function1.getClass();
        fetVar.g0(1939966542);
        int i2 = i | 6 | (fetVar.g(wll0Var) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            float f2 = qmk.a(fetVar).c;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(s5x0.L(jm40Var, f2, 0.0f, 2), 1.0f);
            int iOrdinal = v12Var.ordinal();
            float f3 = (iOrdinal == 0 || iOrdinal == 3) ? 0.0f : 8.0f;
            int iOrdinal2 = wll0Var.c.ordinal();
            if (iOrdinal2 == 0) {
                f = 0.0f;
            } else {
                if (iOrdinal2 != 1) {
                    t9f.b();
                    return;
                }
                int iOrdinal3 = v12Var.ordinal();
                if (iOrdinal3 == 2 || iOrdinal3 == 3) {
                    f = 8.0f;
                } else {
                    f = 0.0f;
                }
            }
            mm40 mm40VarN = s5x0.N(mm40VarD, 0.0f, f3, 0.0f, f, 5);
            lla llaVar = wll0Var.f39360a;
            boolean zBooleanValue = ((Boolean) fetVar.k(kr00.f18743a)).booleanValue();
            boolean z = ((i2 & 112) == 32) | ((i2 & 896) == 256);
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new u5l0((byte) 7, (Object) wll0Var, function1);
                fetVar.o0(objP);
            }
            rcb.C(mm40VarN, llaVar, zBooleanValue, (Function1) objP, fetVar, 0);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new aak0(mm40Var2, wll0Var, function1, i, (byte) 21);
        }
    }

    public static final void w(mm40 mm40Var, String str, ix6 ix6Var, fet fetVar, int i) {
        mm40 mm40Var2;
        long secondary60;
        jm40 jm40Var;
        boolean z;
        fet fetVar2 = fetVar;
        fetVar2.g0(-853340878);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.e(ix6Var.ordinal()) ? 256 : 128;
        }
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            jm40 jm40Var2 = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var2, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 12.0f);
            thg0 thg0VarA = shg0.a(uc9.e, gqw0.k, fetVar2, 54);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarE);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            int iOrdinal = ix6Var.ordinal();
            if (iOrdinal == 0 || iOrdinal == 1) {
                fetVar2.e0(829122279);
                ((g1t0) fetVar2.k(j1t0.e)).getClass();
                y9q0 y9q0VarE = g1t0.e();
                if (ix6Var == ix6.b) {
                    fetVar2.e0(829298979);
                    secondary60 = ((ThemeColors) fetVar2.k(zaq0.b)).getWarning();
                    fetVar2.r(false);
                } else {
                    fetVar2.e0(829377471);
                    secondary60 = ((ThemeColors) fetVar2.k(zaq0.b)).getSecondary60();
                    fetVar2.r(false);
                }
                jm40Var = jm40Var2;
                v8q0.a(str, null, secondary60, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, y9q0VarE, fetVar2, (i2 >> 3) & 14, 24960, 110586);
                fetVar2 = fetVar2;
                fetVar2.r(false);
                z = true;
            } else {
                if (iOrdinal != 2) {
                    throw b1j.f(-943088114, fetVar2, false);
                }
                fetVar2.e0(829620635);
                mm40 mm40VarE2 = o7k0.e(o7k0.s(jm40Var2, 128.0f), 12.0f);
                zcl zclVar2 = qmk.m;
                ugg0 ugg0Var = vgg0.f37379a;
                h97.s(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE2), vbc.d0(null, fetVar2, 0, 1), fetVar2, false);
                jm40Var = jm40Var2;
                z = true;
            }
            fetVar2.r(z);
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new r3o((Object) mm40Var2, (Object) str, (Object) ix6Var, i, (byte) 20);
        }
    }

    /* JADX WARN: Code duplicated, block: B:118:0x00c7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x00cc A[Catch: oux -> 0x01ca, TryCatch #5 {oux -> 0x01ca, blocks: (B:37:0x00c7, B:38:0x00c9, B:39:0x00cc, B:58:0x0127, B:40:0x00d5, B:41:0x00e0), top: B:118:0x00c7 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00d5 A[Catch: oux -> 0x01ca, TryCatch #5 {oux -> 0x01ca, blocks: (B:37:0x00c7, B:38:0x00c9, B:39:0x00cc, B:58:0x0127, B:40:0x00d5, B:41:0x00e0), top: B:118:0x00c7 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00e0 A[Catch: oux -> 0x01ca, TRY_LEAVE, TryCatch #5 {oux -> 0x01ca, blocks: (B:37:0x00c7, B:38:0x00c9, B:39:0x00cc, B:58:0x0127, B:40:0x00d5, B:41:0x00e0), top: B:118:0x00c7 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00ec A[Catch: oux -> 0x01c4, TRY_ENTER, TRY_LEAVE, TryCatch #2 {oux -> 0x01c4, blocks: (B:35:0x00c3, B:43:0x00ec, B:57:0x0116, B:59:0x012c, B:63:0x0141, B:67:0x0149), top: B:112:0x00c3 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:50:0x0107  */
    /* JADX WARN: Code duplicated, block: B:54:0x0111 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:55:0x0113  */
    /* JADX WARN: Code duplicated, block: B:56:0x0115  */
    /* JADX WARN: Code duplicated, block: B:61:0x013e  */
    /* JADX WARN: Code duplicated, block: B:62:0x0140  */
    /* JADX WARN: Code duplicated, block: B:65:0x0144  */
    /* JADX WARN: Code duplicated, block: B:66:0x0147  */
    /* JADX WARN: Code duplicated, block: B:76:0x0199  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:76:0x0199 -> B:18:0x0060). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object x(a.u8z r28, int r29, int r30, int r31, a.w6k r32, a.zje r33) {
        /*
            Method dump skipped, instruction units count: 580
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.kcx.x(a.u8z, int, int, int, a.w6k, a.zje):java.lang.Object");
    }

    public static final boolean y(boolean z, u8z u8zVar, int i, int i2) {
        if (z) {
            if (u8zVar.c() > i) {
                return true;
            }
            return u8zVar.c() == i && u8zVar.d() > i2;
        }
        if (u8zVar.c() < i) {
            return true;
        }
        return u8zVar.c() == i && u8zVar.d() < i2;
    }

    public static final ci40 z(int i, long j, boolean z) {
        Long lValueOf = Long.valueOf(j);
        if (j <= 0) {
            lValueOf = null;
        }
        return new ci40(i, lValueOf, z && j != -1);
    }
}
