package a;

import android.content.Context;
import android.gov.nist.core.Separators;
import android.graphics.Bitmap;
import android.os.Build;
import android.text.BidiFormatter;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import org.xbet.client1.R;
import org.xplatform.betting.core.zip.model.zip.BetPlayerZip;
import org.xplatform.betting.core.zip.model.zip.EventParams;
import org.xplatform.betting.core.zip.model.zip.PlayersDuelZip;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes4.dex */
public abstract class vzb {
    public static void A(dpi0 dpi0Var) {
        long j = y3d.g;
        if (dpi0Var.k()) {
            D(dpi0Var, Separators.COMMA, j);
            E(dpi0Var, Separators.SP);
        }
    }

    public static final orq B(Context context) {
        return new orq(new hz2(context, (byte) 0), new iz2(Build.VERSION.SDK_INT >= 31 ? qsq.f29269a.a(context) : 0));
    }

    public static void C(dpi0 dpi0Var) {
        D(dpi0Var, "-", y3d.g);
    }

    public static final void D(dpi0 dpi0Var, String str, long j) {
        dpi0Var.getClass();
        str.getClass();
        h83 h83Var = new h83();
        long j2 = y3d.g;
        long j3 = daq0.c;
        smk0 smk0Var = new smk0(j, j3, null, null, null, null, null, j3, new j56(0.0f), null, null, j2, k5q0.b, null, null, 17424);
        h83Var.c(str);
        ((h83) dpi0Var.f6468a).b(kng0.c(h83Var.f12607a, h83Var, smk0Var, 0));
    }

    public static void E(dpi0 dpi0Var, String str) {
        D(dpi0Var, str, y3d.g);
    }

    public static final void F(dpi0 dpi0Var, String str, y9q0 y9q0Var) {
        smk0 smk0Var = y9q0Var.f42262a;
        boolean zK = dpi0Var.k();
        h83 h83Var = (h83) dpi0Var.f6468a;
        k5q0 k5q0Var = k5q0.b;
        if (zK) {
            h83 h83Var2 = new h83();
            long j = y3d.g;
            long j2 = daq0.c;
            pz40 pz40Var = s6t0.f31722a;
            smk0 smk0Var2 = new smk0(s6t0.b().f33626a.getSecondary(), smk0Var.b, null, smk0Var.d, null, null, null, j2, new j56(0.0f), null, null, j, k5q0Var, null, null, 17424);
            h83Var2.c(". ");
            StringBuilder sb = h83Var2.f12607a;
            h83Var2.a(smk0Var2, 0, sb.length());
            sb.length();
            h83Var.b(h83Var2.h());
        }
        h83 h83Var3 = new h83();
        str.getClass();
        long j3 = y3d.g;
        long j4 = daq0.c;
        pz40 pz40Var2 = s6t0.f31722a;
        long secondary = s6t0.b().f33626a.getSecondary();
        long j5 = smk0Var.b;
        lsq lsqVar = smk0Var.d;
        smk0 smk0Var3 = new smk0(secondary, j5, smk0Var.c, lsqVar, null, smk0Var.f, null, j4, new j56(0.0f), null, null, j3, k5q0Var, null, smk0Var.o, 17424);
        h83Var3.c(str);
        StringBuilder sb2 = h83Var3.f12607a;
        h83Var3.a(smk0Var3, 0, sb2.length());
        sb2.length();
        h83Var.b(h83Var3.h());
    }

    public static final eex G(int i) {
        if (i != 1) {
            return i != 2 ? eex.c : eex.b;
        }
        return eex.f7695a;
    }

    /* JADX WARN: Code duplicated, block: B:114:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:116:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:118:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:122:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:126:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:128:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:130:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:153:0x0207 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:155:0x0205 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:97:0x0171  */
    public static final j83 H(ctf0 ctf0Var, d3h0 d3h0Var, String str, String str2, String str3, String str4, boolean z, boolean z2) {
        izm0 izm0Var;
        List listD;
        int i;
        ctf0Var.getClass();
        str2.getClass();
        str3.getClass();
        d3h0Var.getClass();
        dpi0 dpi0Var = new dpi0((byte) 15);
        int i2 = 0;
        if (z) {
            E(dpi0Var, ctf0Var.b.a(R.string.game_end, Arrays.copyOf(new Object[0], 0)));
        } else {
            if (str.length() > 0) {
                E(dpi0Var, str);
            }
            if (str2.length() > 0 && !kotlin.text.c.l(StringsKt.u0(str4).toString(), StringsKt.u0(str2).toString())) {
                if (dpi0Var.k()) {
                    E(dpi0Var, Separators.SP);
                }
                E(dpi0Var, str2);
            }
            if (str4.length() > 0) {
                A(dpi0Var);
                E(dpi0Var, str4);
            }
            if (d3h0Var instanceof pz10) {
                pz10 pz10Var = (pz10) d3h0Var;
                if (!pz10Var.d().isEmpty()) {
                    A(dpi0Var);
                    D(dpi0Var, Separators.LPAREN, y3d.g);
                    E(dpi0Var, "\u2066");
                    if (pz10Var instanceof kz10) {
                        kz10 kz10Var = (kz10) pz10Var;
                        boolean z3 = cy7.c() && z2;
                        List listT0 = kz10Var.f;
                        if (z3) {
                            listT0 = CollectionsKt.t0(listT0);
                        }
                        int i3 = z3 ? 0 : q3d.i(listT0);
                        for (Object obj : listT0) {
                            int i4 = i2 + 1;
                            if (i2 < 0) {
                                q3d.p();
                                throw null;
                            }
                            te90 te90Var = (te90) obj;
                            if (i2 == i3) {
                                int i5 = gql0.f11739a;
                                int i6 = kz10Var.g;
                                if (i6 <= 0) {
                                    f0(dpi0Var, te90Var, z2);
                                } else if (i6 == 1) {
                                    d0(dpi0Var, te90Var, z2);
                                } else {
                                    e0(dpi0Var, te90Var, z2);
                                }
                            } else {
                                f0(dpi0Var, te90Var, z2);
                            }
                            if (i2 != listT0.size() - 1) {
                                z(dpi0Var);
                                E(dpi0Var, Separators.SP);
                            }
                            i2 = i4;
                        }
                    } else if (pz10Var instanceof lz10) {
                        List listT1 = ((lz10) pz10Var).f;
                        if (cy7.c() && z2) {
                            listT1 = CollectionsKt.t0(listT1);
                        }
                        for (Object obj2 : listT1) {
                            int i7 = i2 + 1;
                            if (i2 < 0) {
                                q3d.p();
                                throw null;
                            }
                            f0(dpi0Var, (te90) obj2, z2);
                            if (i2 != listT1.size() - 1) {
                                z(dpi0Var);
                                E(dpi0Var, Separators.SP);
                            }
                            i2 = i7;
                        }
                    } else if (pz10Var instanceof mz10) {
                        mz10 mz10Var = (mz10) pz10Var;
                        boolean z4 = cy7.c() && z2;
                        List listT2 = mz10Var.f;
                        if (z4) {
                            listT2 = CollectionsKt.t0(listT2);
                        }
                        int i8 = z4 ? 0 : q3d.i(listT2);
                        for (Object obj3 : listT2) {
                            int i9 = i2 + 1;
                            if (i2 < 0) {
                                q3d.p();
                                throw null;
                            }
                            te90 te90Var2 = (te90) obj3;
                            if (i2 == i8) {
                                int i10 = gql0.f11739a;
                                int i11 = mz10Var.g;
                                if (i11 <= 0) {
                                    f0(dpi0Var, te90Var2, z2);
                                } else if (i11 == 1) {
                                    d0(dpi0Var, te90Var2, z2);
                                } else {
                                    e0(dpi0Var, te90Var2, z2);
                                }
                            } else {
                                f0(dpi0Var, te90Var2, z2);
                            }
                            if (i2 != listT2.size() - 1) {
                                z(dpi0Var);
                                E(dpi0Var, Separators.SP);
                            }
                            i2 = i9;
                        }
                    } else {
                        if (!(pz10Var instanceof oz10)) {
                            t9f.b();
                            return null;
                        }
                        if (cy7.c() && z2) {
                            oz10 oz10Var = (oz10) pz10Var;
                            l0(dpi0Var, oz10Var, z2);
                            k0(dpi0Var, oz10Var, z2);
                        } else {
                            oz10 oz10Var2 = (oz10) pz10Var;
                            k0(dpi0Var, oz10Var2, z2);
                            l0(dpi0Var, oz10Var2, z2);
                        }
                    }
                    E(dpi0Var, "\u2069");
                    D(dpi0Var, Separators.RPAREN, y3d.g);
                } else if (d3h0Var instanceof izm0) {
                    izm0Var = (izm0) d3h0Var;
                    if (!izm0Var.d().isEmpty()) {
                        A(dpi0Var);
                        D(dpi0Var, Separators.LPAREN, y3d.g);
                        E(dpi0Var, "\u2066");
                        if (cy7.c() || !z2) {
                            listD = izm0Var.d();
                        } else {
                            listD = CollectionsKt.t0(izm0Var.d());
                        }
                        for (Object obj4 : listD) {
                            i = i2 + 1;
                            if (i2 >= 0) {
                                q3d.p();
                                throw null;
                            }
                            f0(dpi0Var, (te90) obj4, z2);
                            if (i2 != listD.size() - 1) {
                                z(dpi0Var);
                                E(dpi0Var, Separators.SP);
                            }
                            i2 = i;
                        }
                        E(dpi0Var, "\u2069");
                        D(dpi0Var, Separators.RPAREN, y3d.g);
                    }
                }
            } else if (d3h0Var instanceof izm0) {
                izm0Var = (izm0) d3h0Var;
                if (!izm0Var.d().isEmpty()) {
                    A(dpi0Var);
                    D(dpi0Var, Separators.LPAREN, y3d.g);
                    E(dpi0Var, "\u2066");
                    if (cy7.c()) {
                        listD = izm0Var.d();
                    } else {
                        listD = izm0Var.d();
                    }
                    while (r9.hasNext()) {
                        i = i2 + 1;
                        if (i2 >= 0) {
                            q3d.p();
                            throw null;
                        }
                        f0(dpi0Var, (te90) obj4, z2);
                        if (i2 != listD.size() - 1) {
                            z(dpi0Var);
                            E(dpi0Var, Separators.SP);
                        }
                        i2 = i;
                    }
                    E(dpi0Var, "\u2069");
                    D(dpi0Var, Separators.RPAREN, y3d.g);
                }
            }
            if (str3.length() > 0) {
                A(dpi0Var);
                E(dpi0Var, str3);
            }
        }
        return ((h83) dpi0Var.f6468a).h();
    }

    public static final String I(int i, ctf0 ctf0Var) {
        if (i <= 0) {
            return "";
        }
        if (i < 1000) {
            return ctf0Var.b.a(R.string.dota_net_worth_less, Arrays.copyOf(new Object[]{1}, 1));
        }
        return ctf0Var.b.a(R.string.dota_net_worth_more, Arrays.copyOf(new Object[]{Integer.valueOf(i / 1000)}, 1));
    }

    public static final ArrayList J(j0g0 j0g0Var) {
        Object obj = j0g0Var.f15681a;
        if (obj instanceof g0g0) {
            obj = null;
        }
        Iterable<tiw> iterable = (List) obj;
        if (iterable == null) {
            iterable = iun.f15405a;
        }
        ArrayList arrayList = new ArrayList(r3d.q(iterable, 10));
        for (tiw tiwVar : iterable) {
            List list = tiwVar.f34025a;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : list) {
                if (pvm0.w((d0t) obj2)) {
                    arrayList2.add(obj2);
                }
            }
            String str = tiwVar.b;
            String str2 = tiwVar.c;
            long j = tiwVar.d;
            String str3 = tiwVar.e;
            List list2 = tiwVar.f;
            Set set = tiwVar.g;
            str.getClass();
            list2.getClass();
            set.getClass();
            arrayList.add(new tiw(j, str, str2, str3, arrayList2, list2, set));
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : arrayList) {
            if (!((tiw) obj3).f34025a.isEmpty()) {
                arrayList3.add(obj3);
            }
        }
        return arrayList3;
    }

    public static final long K(boolean z, long j) {
        return z ? StaticColors.INSTANCE.m98getGreen0d7_KjU() : j;
    }

    public static long L(boolean z) {
        pz40 pz40Var = s6t0.f31722a;
        return K(z, s6t0.b().f33626a.getSecondary());
    }

    public static final j83 M(pz10 pz10Var) {
        h83 h83Var = new h83();
        h83 h83Var2 = new h83();
        String strA = pz10Var.a();
        strA.getClass();
        long j = y3d.g;
        long j2 = daq0.c;
        boolean zJ = pz10Var.j();
        pz40 pz40Var = s6t0.f31722a;
        long jK = K(zJ, s6t0.b().f33626a.getTextPrimary());
        j56 j56Var = new j56(0.0f);
        k5q0 k5q0Var = k5q0.b;
        smk0 smk0Var = new smk0(jK, j2, null, null, null, null, null, j2, j56Var, null, null, j, k5q0Var, null, null, 17424);
        h83Var2.c(strA);
        StringBuilder sb = h83Var2.f12607a;
        h83Var2.a(smk0Var, 0, sb.length());
        sb.length();
        h83Var.b(h83Var2.h());
        h83 h83Var3 = new h83();
        smk0 smk0Var2 = new smk0(K(pz10Var.j(), s6t0.b().f33626a.getTextPrimary()), j2, null, null, null, null, null, j2, new j56(0.0f), null, null, j, k5q0Var, null, null, 17424);
        h83Var3.c(" : ");
        StringBuilder sb2 = h83Var3.f12607a;
        h83Var3.a(smk0Var2, 0, sb2.length());
        sb2.length();
        h83Var.b(h83Var3.h());
        h83 h83Var4 = new h83();
        String strB = pz10Var.b();
        strB.getClass();
        smk0 smk0Var3 = new smk0(K(pz10Var.i(), s6t0.b().f33626a.getTextPrimary()), j2, null, null, null, null, null, j2, new j56(0.0f), null, null, j, k5q0Var, null, null, 17424);
        h83Var4.c(strB);
        StringBuilder sb3 = h83Var4.f12607a;
        h83Var4.a(smk0Var3, 0, sb3.length());
        sb3.length();
        h83Var.b(h83Var4.h());
        return h83Var.h();
    }

    public static final j83 N(nz10 nz10Var) {
        h83 h83Var = new h83();
        String strA = nz10Var.a();
        strA.getClass();
        long j = y3d.g;
        long j2 = daq0.c;
        boolean zJ = nz10Var.j();
        pz40 pz40Var = s6t0.f31722a;
        smk0 smk0Var = new smk0(K(zJ, s6t0.b().f33626a.getTextPrimary()), j2, null, null, null, null, null, j2, new j56(0.0f), null, null, j, k5q0.b, null, null, 17424);
        h83Var.c(strA);
        return kng0.c(h83Var.f12607a, h83Var, smk0Var, 0);
    }

    public static final j83 O(te90 te90Var) {
        te90Var.getClass();
        h83 h83Var = new h83();
        String str = te90Var.b;
        long j = y3d.g;
        long j2 = daq0.c;
        smk0 smk0Var = new smk0(L(te90Var.c), j2, null, null, null, null, null, j2, new j56(0.0f), null, null, j, k5q0.b, null, null, 17424);
        h83Var.c(str);
        return kng0.c(h83Var.f12607a, h83Var, smk0Var, 0);
    }

    public static final j83 P(nz10 nz10Var) {
        h83 h83Var = new h83();
        String strB = nz10Var.b();
        strB.getClass();
        long j = y3d.g;
        long j2 = daq0.c;
        boolean zI = nz10Var.i();
        pz40 pz40Var = s6t0.f31722a;
        smk0 smk0Var = new smk0(K(zI, s6t0.b().f33626a.getTextPrimary()), j2, null, null, null, null, null, j2, new j56(0.0f), null, null, j, k5q0.b, null, null, 17424);
        h83Var.c(strB);
        return kng0.c(h83Var.f12607a, h83Var, smk0Var, 0);
    }

    public static final j83 Q(te90 te90Var) {
        h83 h83Var = new h83();
        String str = te90Var.d;
        long j = y3d.g;
        long j2 = daq0.c;
        smk0 smk0Var = new smk0(L(te90Var.e), j2, null, null, null, null, null, j2, new j56(0.0f), null, null, j, k5q0.b, null, null, 17424);
        h83Var.c(str);
        return kng0.c(h83Var.f12607a, h83Var, smk0Var, 0);
    }

    public static final long R(y9l y9lVar) {
        Object next;
        Iterator it = y9lVar.b.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((z4l) next).l);
        z4l z4lVar = (z4l) next;
        if (z4lVar != null) {
            return z4lVar.o;
        }
        return 0L;
    }

    public static final String S(c5l c5lVar, m9s m9sVar, i6l i6lVar) {
        String str = c5lVar.b.f42253a == i6lVar ? (String) CollectionsKt.firstOrNull(m9sVar.m) : (String) CollectionsKt.firstOrNull(m9sVar.n);
        if (str == null) {
            str = "";
        }
        if (kotlin.text.c.x(str, ujn.h, false)) {
            return str;
        }
        if (str.length() != 0) {
            List list = u0d.f34849a;
            if (!u0d.c(str)) {
                return String.format(Locale.ENGLISH, StringsKt.O(str, "playerlogo/", true) ? "%s/%s" : "%s/playerlogo/%s", Arrays.copyOf(new Object[]{ujn.h, str}, 2));
            }
        }
        return "";
    }

    public static final String T(lz10 lz10Var, boolean z) {
        String str = lz10Var.g;
        String str2 = lz10Var.j;
        StringBuilder sb = new StringBuilder("\u2066");
        if (cy7.c() && z) {
            if (str2 != null) {
                hne.B(sb, "(ov ", str2, Separators.RPAREN);
            }
            sb.append(i0(str));
        } else {
            sb.append(str);
            if (str2 != null) {
                hne.B(sb, Separators.LPAREN, str2, " ov)");
            }
        }
        sb.append("\u2069");
        return sb.toString();
    }

    public static final String U(lz10 lz10Var, boolean z) {
        String str = lz10Var.h;
        String str2 = lz10Var.k;
        StringBuilder sb = new StringBuilder("\u2066");
        if (cy7.c() && z) {
            if (str2 != null) {
                hne.B(sb, "(ov ", str2, Separators.RPAREN);
            }
            sb.append(i0(str));
        } else {
            sb.append(str);
            if (str2 != null) {
                hne.B(sb, Separators.LPAREN, str2, " ov)");
            }
        }
        sb.append("\u2069");
        return sb.toString();
    }

    public static final znq0 V(anq0 anq0Var) {
        boolean z = anq0Var.b;
        long j = anq0Var.d;
        long j2 = anq0Var.e;
        if (!z) {
            return new znq0(j2 + j);
        }
        long j3 = j2 - j;
        if (j3 < 0) {
            j3 = 0;
        }
        return new znq0(j3);
    }

    public static final evq0 W(boolean z) {
        return z ? evq0.f8484a : evq0.b;
    }

    public static final dho X(wmr0 wmr0Var, ctf0 ctf0Var) {
        ctf0Var.getClass();
        boolean zIsRtlContext = BidiFormatter.getInstance().isRtlContext();
        String strH = h97.h(wmr0Var.e, "getTotoBetDescription");
        String strA = ctf0Var.b.a(R.string.stake_title, Arrays.copyOf(new Object[0], 0));
        String strB0 = wmr0Var.o;
        if (zIsRtlContext) {
            strB0 = CollectionsKt.b0(StringsKt__StringsKt.split$default(strB0, new String[]{", "}, false, 0, 6, null), null, null, null, new umu((byte) 5), 31);
        }
        String str = strB0;
        pz40 pz40Var = s6t0.f31722a;
        return new dho(s6t0.b().f33626a.getTextPrimary(), strH, strA, str);
    }

    public static String Y(String str) {
        str.getClass();
        try {
            double d = Double.parseDouble(str);
            int iV = StringsKt.V(str, Separators.DOT, 0, false, 6);
            int length = iV != -1 ? (str.length() - iV) - 1 : 0;
            pn40 pn40Var = pn40.f27267a;
            return pn40.i(d, length);
        } catch (NumberFormatException unused) {
            return str;
        }
    }

    public static final boolean Z(mxp mxpVar) {
        fyp fypVar = mxpVar.M;
        return c0(fypVar.f10370a) && c0(fypVar.b) && c0(fypVar.c);
    }

    public static final void a(mm40 mm40Var, a4x a4xVar, long j, String str, String str2, Function1 function1, fet fetVar, int i) {
        int i2;
        a4xVar.getClass();
        function1.getClass();
        fetVar.g0(1269684240);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(a4xVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.f(j) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.g(str) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.g(str2) ? 16384 : 8192;
        }
        Function1 function2 = function1;
        if ((196608 & i) == 0) {
            i2 |= fetVar.i(function2) ? 131072 : 65536;
        }
        int i3 = i2;
        boolean z = false;
        byte b = 1;
        if (fetVar.U(i3 & 1, (74899 & i3) != 74898)) {
            w6k w6kVar = (w6k) fetVar.k(bmd.h);
            zcl zclVar = qmk.f28987a;
            int iT = w6kVar.T(4.0f);
            boolean zE = fetVar.e(iT);
            Object objP = fetVar.P();
            if (zE || objP == ukd.f35823a) {
                objP = new mq8(iT, b);
                fetVar.o0(objP);
            }
            tj30 tj30Var = (tj30) objP;
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
            jpm0.o(fetVar, tj30Var, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            if (str2 != null) {
                fetVar.e0(1435563659);
                uzb.k(((i3 >> 9) & 112) | ((i3 >> 3) & 896), 1, fetVar, null, str2, str);
                fetVar.r(false);
            } else {
                fetVar.e0(1435732795);
                fetVar.r(false);
            }
            fetVar.e0(2124525202);
            Iterator it = a4xVar.iterator();
            int i4 = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i5 = i4 + 1;
                String str3 = null;
                if (i4 < 0) {
                    q3d.p();
                    throw null;
                }
                b7h b7hVar = (b7h) next;
                Iterator it2 = it;
                fetVar.b0(783660822, fetVar.G(Integer.valueOf(i4), Long.valueOf(b7hVar.f2108a)));
                mm40 mm40VarW = o7k0.w(o7k0.d(jm40.b, 1.0f), null, true, 1);
                if (i4 == 0 && str2 == null) {
                    str3 = str;
                }
                uzb.a(mm40VarW, j, b7hVar, false, str3, function2, fetVar, ((i3 >> 3) & 112) | 3078 | (458752 & i3), 0);
                fetVar.r(false);
                function2 = function1;
                z = false;
                i4 = i5;
                it = it2;
            }
            fetVar.r(z);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new jp(mm40Var, a4xVar, j, str, str2, function1, i);
        }
    }

    public static final boolean a0(mxp mxpVar) {
        rxp rxpVar = mxpVar.K;
        return c0(rxpVar.f31275a) || c0(rxpVar.b) || c0(rxpVar.c);
    }

    public static final void b(final mm40 mm40Var, final a4x a4xVar, boolean z, final Function1 function1, fet fetVar, final int i, final int i2) {
        int i3;
        final boolean z2;
        yfe0 yfe0VarU;
        Function2 function2;
        a4xVar.getClass();
        function1.getClass();
        fetVar.g0(163325707);
        if ((i & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= fetVar.g(a4xVar) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= fetVar.h(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= fetVar.i(function1) ? 2048 : 1024;
        }
        int i5 = i3;
        if (fetVar.U(i5 & 1, (i5 & 1171) != 1170)) {
            boolean z3 = i4 != 0 ? true : z;
            if (a4xVar.isEmpty()) {
                yfe0VarU = fetVar.u();
                if (yfe0VarU == null) {
                    return;
                }
                final byte b = 0;
                final boolean z4 = z3;
                function2 = new Function2() { // from class: a.noh
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        switch (b) {
                            case 0:
                                ((Integer) obj2).getClass();
                                vzb.b(mm40Var, a4xVar, z4, function1, (fet) obj, x8x.L(i | 1), i2);
                                break;
                            default:
                                ((Integer) obj2).getClass();
                                vzb.b(mm40Var, a4xVar, z4, function1, (fet) obj, x8x.L(i | 1), i2);
                                break;
                        }
                        return Unit.f46060a;
                    }
                };
            } else {
                mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
                long jM73getBlack400d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m73getBlack400d7_KjU();
                zcl zclVar = qmk.i;
                ugg0 ugg0Var = vgg0.f37379a;
                mm40 mm40VarJ = s5x0.J(i120.Q(mm40VarD, jM73getBlack400d7_KjU, new ugg0(zclVar, zclVar, zclVar, zclVar)), 8.0f);
                x5d x5dVarA = w5d.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.m, fetVar, 0);
                int iHashCode = Long.hashCode(fetVar.T);
                bh90 bh90VarM = fetVar.m();
                mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarJ);
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
                fetVar.e0(2067741635);
                Iterator it = CollectionsKt.D0(a4xVar, 3).iterator();
                while (it.hasNext()) {
                    wzb.k(null, (qoh) it.next(), z3, function1, fetVar, i5 & 8064);
                }
                fetVar.r(false);
                fetVar.r(true);
                z2 = z3;
            }
            yfe0VarU.d = function2;
        }
        fetVar.X();
        z2 = z;
        yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            final byte b2 = 1;
            function2 = new Function2() { // from class: a.noh
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    switch (b2) {
                        case 0:
                            ((Integer) obj2).getClass();
                            vzb.b(mm40Var, a4xVar, z2, function1, (fet) obj, x8x.L(i | 1), i2);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            vzb.b(mm40Var, a4xVar, z2, function1, (fet) obj, x8x.L(i | 1), i2);
                            break;
                    }
                    return Unit.f46060a;
                }
            };
            yfe0VarU.d = function2;
        }
    }

    public static final boolean b0(mxp mxpVar) {
        vxp vxpVar = mxpVar.L;
        return c0(vxpVar.f38211a) && c0(vxpVar.b) && c0(vxpVar.c);
    }

    public static final void c(mm40 mm40Var, p4i p4iVar, fet fetVar, int i) {
        k6z k6zVar;
        fetVar.g0(-808575736);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(p4iVar) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            if (p4iVar.e) {
                fetVar.e0(347804239);
                k6zVar = (k6z) fetVar.k(bmd.n);
                fetVar.r(false);
            } else {
                fetVar.e0(347805163);
                fetVar.r(false);
                k6zVar = k6z.f17794a;
            }
            obc.d(bmd.n.a(k6zVar), u1c.M(2067571144, new o1i(mm40Var, p4iVar), fetVar), fetVar, 56);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o1i(mm40Var, p4iVar, i);
        }
    }

    public static final boolean c0(byp bypVar) {
        bypVar.getClass();
        return bypVar.f3429a >= 0 && bypVar.b >= 0.0f;
    }

    public static final void d(int i, fet fetVar, a4x a4xVar, mm40 mm40Var, boolean z) {
        fetVar.g0(-187311479);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? fetVar.g(a4xVar) : fetVar.i(a4xVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.h(z) ? 256 : 128;
        }
        byte b = 1;
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            zfn zfnVar = bmd.n;
            Object objK = fetVar.k(zfnVar);
            k6z k6zVar = k6z.b;
            boolean z2 = objK == k6zVar;
            if (z2 != z) {
                k6zVar = k6z.f17794a;
            }
            obc.d(zfnVar.a(k6zVar), u1c.M(-1345176119, new hwm(b, ozb.b0(a4xVar, fetVar, (i2 >> 3) & 14), z2), fetVar), fetVar, 56);
            mm40Var = jm40.b;
        } else {
            fetVar.X();
        }
        mm40 mm40Var2 = mm40Var;
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new yvm(mm40Var2, a4xVar, z, i, (byte) 2);
        }
    }

    public static final void d0(dpi0 dpi0Var, te90 te90Var, boolean z) {
        if (cy7.c() && z) {
            D(dpi0Var, te90Var.d, L(te90Var.e));
            C(dpi0Var);
            D(dpi0Var, te90Var.b, L(te90Var.c));
            j0(dpi0Var);
            return;
        }
        j0(dpi0Var);
        D(dpi0Var, te90Var.b, L(te90Var.c));
        C(dpi0Var);
        D(dpi0Var, te90Var.d, L(te90Var.e));
    }

    public static final void e(mm40 mm40Var, final tpl tplVar, float f, final float f2, final Function1 function1, fet fetVar, final int i) {
        final mm40 mm40Var2;
        final float f3;
        int i2;
        mm40 mm40Var3;
        float f4;
        fetVar.g0(557975115);
        int i3 = i | 6 | (fetVar.g(tplVar) ? 32 : 16) | 128 | (fetVar.d(f2) ? 2048 : 1024) | (fetVar.i(function1) ? 16384 : 8192);
        if (fetVar.U(i3 & 1, (i3 & 9363) != 9362)) {
            fetVar.Z();
            if ((i & 1) == 0 || fetVar.B()) {
                float f5 = xfn.a(fetVar).c;
                i2 = i3 & (-897);
                mm40Var3 = jm40.b;
                f4 = f5;
            } else {
                fetVar.X();
                i2 = i3 & (-897);
                mm40Var3 = mm40Var;
                f4 = f;
            }
            fetVar.s();
            if (tplVar instanceof gpl) {
                fetVar.e0(1113618292);
                pzb.i(mm40Var3, (gpl) tplVar, f4, f2, function1, fetVar, i2 & 65534);
                fetVar.r(false);
            } else if (tplVar instanceof jpl) {
                fetVar.e0(1113995283);
                uzb.p(mm40Var3, (jpl) tplVar, f4, f2, function1, fetVar, i2 & 65534);
                fetVar.r(false);
            } else if (tplVar instanceof spl) {
                fetVar.e0(1114373235);
                n4c.g(mm40Var3, (spl) tplVar, f4, f2, function1, fetVar, i2 & 65534);
                fetVar.r(false);
            } else if (tplVar instanceof mpl) {
                fetVar.e0(1114764486);
                u1c.d(mm40Var3, (mpl) tplVar, f4, f2, function1, fetVar, i2 & 65534);
                fetVar.r(false);
            } else {
                if (!(tplVar instanceof ppl)) {
                    throw b1j.f(-656814113, fetVar, false);
                }
                fetVar.e0(1115166184);
                v3c.k(mm40Var3, (ppl) tplVar, f4, f2, function1, fetVar, i2 & 65534);
                fetVar.r(false);
            }
            mm40Var2 = mm40Var3;
            f3 = f4;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
            f3 = f;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2(tplVar, f3, f2, function1, i) { // from class: a.cpl
                public final /* synthetic */ tpl b;
                public final /* synthetic */ float c;
                public final /* synthetic */ float d;
                public final /* synthetic */ Function1 e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = x8x.L(1);
                    vzb.e(this.f4753a, this.b, this.c, this.d, this.e, (fet) obj, iL);
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final void e0(dpi0 dpi0Var, te90 te90Var, boolean z) {
        if (cy7.c() && z) {
            D(dpi0Var, te90Var.d, L(te90Var.e));
            j0(dpi0Var);
            C(dpi0Var);
            D(dpi0Var, te90Var.b, L(te90Var.c));
            return;
        }
        D(dpi0Var, te90Var.b, L(te90Var.c));
        C(dpi0Var);
        j0(dpi0Var);
        D(dpi0Var, te90Var.d, L(te90Var.e));
    }

    public static final void f(jca jcaVar, boolean z, Function0 function0, Function0 function1, fet fetVar) {
        function0.getClass();
        function1.getClass();
        boolean z2 = jcaVar instanceof eca;
        jm40 jm40Var = jm40.b;
        if (z2) {
            fetVar.e0(1445681391);
            zcl zclVar = qmk.f28987a;
            u1c.c(o2e.e0(s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 2.0f, 7), "DS_SPORT_EVENT_CARD_BET_CONSTRUCTOR_TOP"), ((eca) jcaVar).f7555a, z, function0, function1, fetVar);
            fetVar.r(false);
            return;
        }
        if (jcaVar instanceof fca) {
            fetVar.e0(1446145461);
            u1c.c(jm40Var, ((fca) jcaVar).f9302a, z, function0, function1, fetVar);
            fetVar.r(false);
            return;
        }
        if (jcaVar instanceof gca) {
            fetVar.e0(1446507541);
            u1c.c(jm40Var, ((gca) jcaVar).f11049a, z, function0, function1, fetVar);
            fetVar.r(false);
        } else if (jcaVar instanceof hca) {
            fetVar.e0(1446874581);
            u1c.c(jm40Var, ((hca) jcaVar).f12811a, z, function0, function1, fetVar);
            fetVar.r(false);
        } else {
            if (!(jcaVar instanceof ica)) {
                throw b1j.f(-507555542, fetVar, false);
            }
            fetVar.e0(1447237653);
            u1c.c(jm40Var, ((ica) jcaVar).f14526a, z, function0, function1, fetVar);
            fetVar.r(false);
        }
    }

    public static final void f0(dpi0 dpi0Var, te90 te90Var, boolean z) {
        if (cy7.c() && z) {
            D(dpi0Var, te90Var.d, L(te90Var.e));
            C(dpi0Var);
            D(dpi0Var, te90Var.b, L(te90Var.c));
        } else {
            D(dpi0Var, te90Var.b, L(te90Var.c));
            C(dpi0Var);
            D(dpi0Var, te90Var.d, L(te90Var.e));
        }
    }

    public static final void g(mm40 mm40Var, l8m l8mVar, fet fetVar, int i) {
        int i2;
        fet fetVar2;
        l8mVar.getClass();
        fetVar.g0(911105365);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(l8mVar) ? 32 : 16;
        }
        byte b = 18;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40Var, 40.0f);
            thg0 thg0VarA = shg0.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.k, fetVar, 48);
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
            l9m l9mVar = l8mVar.f19611a;
            fetVar.e0(-1125099599);
            k9m.a(null, l9mVar, fetVar, 0, 1);
            fetVar.r(false);
            fetVar2 = fetVar;
            p(6, fetVar2, o7k0.d(jm40.b, 1.0f), l8mVar.b, l8mVar.c, l8mVar.d);
            fetVar2.r(true);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new kkl(mm40Var, l8mVar, i, b);
        }
    }

    public static final void g0(jzj jzjVar, ndd nddVar) {
        jzjVar.getClass();
        nddVar.getClass();
        jzjVar.invokeOnCompletion(new h6c(jzjVar, nddVar, (byte) 21));
    }

    public static final void h(int i, fet fetVar, mm40 mm40Var) {
        fetVar.g0(-361611643);
        int i2 = i | 6;
        boolean z = false;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            zq8.a(0, fetVar, i120.Q(o7k0.n(jm40Var, 6.0f), ((StaticColors) fetVar.k(m8m0.f21378a)).m113getRed0d7_KjU(), vgg0.f37379a));
            mm40Var = jm40Var;
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xml(mm40Var, z, i, (byte) 12);
        }
    }

    public static final f3d h0(fet fetVar) {
        Object[] objArr = new Object[0];
        Object objP = fetVar.P();
        if (objP == ukd.f35823a) {
            objP = new zxb((byte) 26);
            fetVar.o0(objP);
        }
        return (f3d) e9x.R(objArr, f3d.j, (Function0) objP, fetVar, 384);
    }

    public static final void i(mm40 mm40Var, dwm dwmVar, fet fetVar, int i) {
        int i2;
        k6z k6zVar;
        fetVar.g0(1151343918);
        byte b = 2;
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(dwmVar) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            if (dwmVar.i) {
                fetVar.e0(-1660050987);
                k6zVar = (k6z) fetVar.k(bmd.n);
                fetVar.r(false);
            } else {
                fetVar.e0(-1660050063);
                fetVar.r(false);
                k6zVar = k6z.f17794a;
            }
            obc.d(bmd.n.a(k6zVar), u1c.M(-1345646098, new wvm(mm40Var, dwmVar, b), fetVar), fetVar, 56);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xvm(b, i, mm40Var, dwmVar);
        }
    }

    public static final String i0(String str) {
        List listT0;
        List listSplit$default = StringsKt__StringsKt.split$default(str, new String[]{" & "}, false, 0, 6, null);
        if (listSplit$default.size() != 2) {
            listSplit$default = null;
        }
        return (listSplit$default == null || (listT0 = CollectionsKt.t0(listSplit$default)) == null) ? str : CollectionsKt.b0(listT0, " & ", null, null, null, 62);
    }

    public static final void j(mm40 mm40Var, k0n k0nVar, fet fetVar, int i) {
        k0n k0nVar2;
        fet fetVar2 = fetVar;
        fetVar2.g0(1406856964);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(k0nVar) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarG = o7k0.g(mm40Var, 152.0f, 0.0f, 2);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.n, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarG);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z = fetVar2.S;
            pcy pcyVar = e7z.u1;
            if (z) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar2, x5dVarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarL = s5x0.L(jm40Var, 8.0f, 0.0f, 2);
            String str = k0nVar.c;
            ((g1t0) fetVar2.k(j1t0.e)).getClass();
            v8q0.a(str, mm40VarL, ((ThemeColors) fetVar2.k(zaq0.b)).getTextPrimary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 3, 0, null, g1t0.p(), fetVar, 0, 24960, 109560);
            fetVar2 = fetVar;
            mm40 mm40VarM = s5x0.M(jm40Var, 8.0f, 10.0f, 8.0f, 8.0f);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar2, 0);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarM);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar4);
            zhg0 zhg0Var = zhg0.f44392a;
            k0nVar2 = k0nVar;
            r(zhg0Var.a(0.33f, jm40Var, true), true, k0nVar2.e, fetVar2, 48);
            q(zhg0Var.a(0.33f, jm40Var, true), k0nVar2, fetVar2, i2 & 112);
            r(zhg0Var.a(0.33f, jm40Var, true), false, k0nVar2.f, fetVar2, 48);
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            k0nVar2 = k0nVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new d0n((byte) 3, i, mm40Var, k0nVar2);
        }
    }

    public static void j0(dpi0 dpi0Var) {
        D(dpi0Var, Separators.STAR, y3d.g);
    }

    public static final void k(int i, fet fetVar) {
        fetVar.g0(1380401401);
        if (fetVar.U(i & 1, i != 0)) {
            zcl zclVar = qmk.f28987a;
            long jI = qbc.i(56.0f, 84.0f);
            lh80 lh80Var = new lh80(4.0f, 6.0f, 4.0f, 6.0f);
            long jI2 = qbc.i(48.0f, 12.0f);
            ugg0 ugg0VarA = vgg0.a(360.0f);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarO = o7k0.o(jI, jm40Var);
            x5d x5dVarA = w5d.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.n, fetVar, 48);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarO);
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
            zq8.a(0, fetVar, xbc.c0(lgb.J(o7k0.n(jm40Var, 56.0f), vgg0.f37379a), vbc.d0(null, fetVar, 0, 1)));
            dw9.x(lgb.J(o7k0.o(jI2, s5x0.I(o7k0.d(jm40Var, 1.0f), lh80Var)), ugg0VarA), vbc.d0(null, fetVar, 0, 1), fetVar, 0, true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new f4m(i, (byte) 16);
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0043  */
    public static final void k0(dpi0 dpi0Var, oz10 oz10Var, boolean z) {
        int i = 0;
        boolean z2 = cy7.c() && z;
        List listT0 = oz10Var.f;
        if (z2) {
            listT0 = CollectionsKt.t0(listT0);
        }
        int i2 = z2 ? 0 : q3d.i(listT0);
        for (Object obj : listT0) {
            int i3 = i + 1;
            if (i < 0) {
                q3d.p();
                throw null;
            }
            te90 te90Var = (te90) obj;
            if (i == i2) {
                int i4 = gql0.f11739a;
                int i5 = oz10Var.o;
                if (i5 <= 0) {
                    f0(dpi0Var, te90Var, z);
                } else if (i5 == 1) {
                    d0(dpi0Var, te90Var, z);
                } else {
                    e0(dpi0Var, te90Var, z);
                }
            } else {
                f0(dpi0Var, te90Var, z);
            }
            if (i != listT0.size() - 1) {
                z(dpi0Var);
                E(dpi0Var, Separators.SP);
            }
            i = i3;
        }
    }

    public static final void l(mgf mgfVar, fet fetVar, int i) {
        int i2;
        fet fetVar2;
        fetVar.g0(-1329133950);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mgfVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            Context context = (Context) fetVar.k(dy2.b);
            mm40 mm40Var = (mm40) fetVar.k(t0h.f33118a);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = y4o.f42012a;
                fetVar.o0(objP);
            }
            xdr xdrVar = (xdr) ((jhy) objP);
            boolean zI = fetVar.i(context) | ((i2 & 14) == 4);
            Object objP2 = fetVar.P();
            if (zI || objP2 == cl5Var) {
                objP2 = new y1o(context, mgfVar);
                fetVar.o0(objP2);
            }
            fetVar2 = fetVar;
            y860.f(xdrVar, mm40Var, (Function1) objP2, fetVar2, 6, 0);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o2l(mgfVar, i, (byte) 28);
        }
    }

    public static final void l0(dpi0 dpi0Var, oz10 oz10Var, boolean z) {
        String str = oz10Var.g;
        boolean z2 = oz10Var.h;
        boolean z3 = oz10Var.j;
        String str2 = oz10Var.i;
        if (str.length() <= 0 && str2.length() <= 0) {
            return;
        }
        if (cy7.c() && z) {
            D(dpi0Var, str2, L(z3));
            C(dpi0Var);
            D(dpi0Var, str, L(z2));
            D(dpi0Var, Separators.COLON, y3d.g);
            return;
        }
        D(dpi0Var, Separators.COLON, y3d.g);
        D(dpi0Var, str, L(z2));
        C(dpi0Var);
        D(dpi0Var, str2, L(z3));
    }

    public static final void m(mm40 mm40Var, qdz qdzVar, jco jcoVar, Function0 function0, Function1 function1, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        qdzVar.getClass();
        jcoVar.getClass();
        function0.getClass();
        function1.getClass();
        fetVar2.g0(-265157284);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(qdzVar) ? 32 : 16) | (fetVar2.g(jcoVar) ? 256 : 128) | (fetVar2.i(function0) ? 2048 : 1024) | (fetVar2.i(function1) ? 16384 : 8192);
        if (fetVar2.U(i2 & 1, (i2 & 9363) != 9362)) {
            xcz xczVarB = qdzVar.b(jcoVar.f16286a, new x6o((byte) 8), fetVar2, (i2 << 3) & 896);
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 228.0f);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarQ = i120.Q(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE), ((ThemeColors) fetVar2.k(zaq0.b)).getBackgroundContent(), jd8.n);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarQ);
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
            int i3 = i2 >> 3;
            nkb.e(s5x0.N(jm40.b, 0.0f, 8.0f, 0.0f, 0.0f, 13), xczVarB, jcoVar.c, function1, fetVar2, i3 & 7168);
            fetVar2 = fetVar;
            e3c.b(null, k3g.f17616a, function0, fetVar2, i3 & 896, 1);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cqk(mm40Var, (Object) qdzVar, (Object) jcoVar, (Object) function0, (Object) function1, i, (byte) 21);
        }
    }

    public static final fgd m0(egd egdVar) {
        egdVar.getClass();
        rkx rkxVar = egdVar.f7758a;
        long j = (((long) rkxVar.f30670a) << 32) | (((long) rkxVar.b) & 4294967295L);
        pge0 pge0Var = egdVar.e;
        jge0 jge0Var = new jge0(pge0Var.f26952a, pge0Var.b, pge0Var.c, pge0Var.d);
        pge0 pge0Var2 = egdVar.f;
        return new fgd(j, egdVar.b, egdVar.c, egdVar.d, jge0Var, new jge0(pge0Var2.f26952a, pge0Var2.b, pge0Var2.c, pge0Var2.d), egdVar.g, egdVar.h);
    }

    public static final void n(mm40 mm40Var, List list, fet fetVar) {
        list.getClass();
        kr00.a(u1c.M(1742510903, new ika((byte) 1, mm40Var, list), fetVar), fetVar, 6);
    }

    public static final xif n0(ajf ajfVar, List list) {
        Object next;
        String string;
        list.getClass();
        if (ajfVar == null) {
            return new xif("", "", "", "", "", 0L);
        }
        String str = ajfVar.f972a;
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.d(((kjf) next).f18383a, str));
        kjf kjfVar = (kjf) next;
        String str2 = kjfVar != null ? kjfVar.b : null;
        String string2 = "";
        String str3 = str == null ? "" : str;
        String str4 = ajfVar.b;
        String str5 = str4 == null ? "" : str4;
        Long l = ajfVar.c;
        long jLongValue = l != null ? l.longValue() : 0L;
        String str6 = ajfVar.d;
        String str7 = str6 == null ? "" : str6;
        sif sifVar = ajfVar.e;
        String str8 = sifVar != null ? sifVar.b : null;
        if (str8 == null || str8.length() == 0) {
            string = "";
        } else {
            StringBuilder sb = new StringBuilder(ujn.h);
            String strConcat = "playerlogo/".concat(str8);
            if (strConcat.length() == 0) {
                sb.setLength(0);
            } else if (StringsKt.O(strConcat, ujn.h, false) || kotlin.text.c.x(strConcat, "https://", false)) {
                sb.setLength(0);
                sb.append(strConcat);
            } else {
                if (sb.length() > 0 && !StringsKt.S(sb, Separators.SLASH)) {
                    sb.append('/');
                }
                sb.append(StringsKt.y0(strConcat, '/'));
            }
            string = sb.toString();
        }
        if (str2 != null && str2.length() != 0) {
            StringBuilder sb2 = new StringBuilder(ujn.h);
            String strConcat2 = "sfiles/statistics/esport/".concat(str2);
            if (strConcat2.length() == 0) {
                sb2.setLength(0);
            } else if (StringsKt.O(strConcat2, ujn.h, false) || kotlin.text.c.x(strConcat2, "https://", false)) {
                sb2.setLength(0);
                sb2.append(strConcat2);
            } else {
                if (sb2.length() > 0 && !StringsKt.S(sb2, Separators.SLASH)) {
                    sb2.append('/');
                }
                sb2.append(StringsKt.y0(strConcat2, '/'));
            }
            string2 = sb2.toString();
        }
        return new xif(str3, str5, str7, string, string2, jLongValue);
    }

    public static final void o(int i, fet fetVar, mm40 mm40Var, String str) {
        int i2;
        fet fetVar2 = fetVar;
        String str2 = str;
        str2.getClass();
        fetVar2.g0(955027181);
        if ((i & 6) == 0) {
            i2 = i | (fetVar.g(mm40Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(str2) ? 32 : 16;
        }
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z = fetVar2.S;
            pcy pcyVar = e7z.u1;
            if (z) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar2, tj30VarC, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            jr8 jr8Var = jr8.f16991a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarA = jr8Var.a(jm40Var);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarQ = ffb0.Q(mm40VarA, 2.0f, 2.0f);
            StaticColors staticColors = StaticColors.INSTANCE;
            long jM62getBlack0d7_KjU = staticColors.m62getBlack0d7_KjU();
            zcl zclVar2 = qmk.c;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar2, i120.S(mm40VarQ, 4.0f, jM62getBlack0d7_KjU, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)));
            mm40 mm40VarQ2 = i120.Q(i120.S(jr8Var.a(jm40Var), 2.0f, staticColors.m62getBlack0d7_KjU(), new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), kkg.F, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2));
            tj30 tj30VarC2 = zq8.c(gqw0.e, false);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarQ2);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC2, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar4);
            v8q0.a(str, o2e.e0(jm40Var, "TIC_TAC_TOE_GAME_STATUS_TITLE"), staticColors.m123getWhite0d7_KjU(), null, qmk.p, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045), fetVar2, ((i2 >> 3) & 14) | 48, 0, 131048);
            str2 = str;
            fetVar2 = fetVar2;
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cx(mm40Var, str2, i, (byte) 15);
        }
    }

    public static final q56 o0(d0t d0tVar, ctf0 ctf0Var, m5l0 m5l0Var, v5l0 v5l0Var, String str, String str2, List list, boolean z, boolean z2, boolean z3, boolean z4) {
        q56 l56Var;
        d0tVar.getClass();
        long j = d0tVar.v;
        str.getClass();
        list.getClass();
        ctf0Var.getClass();
        v5l0Var.getClass();
        str2.getClass();
        int iOrdinal = v5l0Var.ordinal();
        if (iOrdinal == 0) {
            l56Var = new l56(d0tVar.f5282a, s7n0.n(d0tVar, str, str2, list, z2, z3, z4, kpb.b0(d0tVar, z), kpb.d0(d0tVar, z)), new a66(new pws0(qzb.c0(d0tVar), kpb.D(d0tVar)), new pws0(qzb.r0(d0tVar), kpb.U(d0tVar)), new lpm(opm.f25648a, new hpm(0L, 3)), dyb.U(d0tVar), j == 40 ? kpb.G(d0tVar, ctf0Var) : kpb.X(d0tVar)), jn8.a(d0tVar, v5l0Var, ctf0Var, m5l0Var));
        } else if (iOrdinal != 1) {
            d2i d2iVar = null;
            if (iOrdinal != 2) {
                c2m c2mVar = c2m.f3631a;
                if (iOrdinal == 3) {
                    l56Var = new n56(d0tVar.f5282a, s7n0.p(d0tVar, str, (j > 40L ? 1 : (j == 40L ? 0 : -1)) == 0 ? kpb.G(d0tVar, ctf0Var) : kpb.X(d0tVar), list, z2, z3, z4, uzb.s0(d0tVar) || kpb.j0(d0tVar), str2, kpb.b0(d0tVar, z), kpb.d0(d0tVar, z)), new q66(new sws0(qzb.c0(d0tVar), kpb.D(d0tVar)), new sws0(qzb.r0(d0tVar), kpb.U(d0tVar)), new z1m(c2mVar)), jn8.a(d0tVar, v5l0Var, ctf0Var, m5l0Var), new n0x(dtb.F(str)));
                } else {
                    if (iOrdinal != 4) {
                        t9f.b();
                        return null;
                    }
                    l56Var = new m56(d0tVar.f5282a, s7n0.o(d0tVar, str, str2, list, z2, z3, z4, kpb.b0(d0tVar, z), kpb.d0(d0tVar, z)), new i66(new z1m(c2mVar), dyb.U(d0tVar), new tws0(qzb.c0(d0tVar), kpb.D(d0tVar)), new tws0(qzb.r0(d0tVar), kpb.U(d0tVar)), j == 40 ? kpb.G(d0tVar, ctf0Var) : kpb.X(d0tVar)), jn8.a(d0tVar, v5l0Var, ctf0Var, m5l0Var));
                }
            } else {
                long j2 = d0tVar.f5282a;
                k4i k4iVarQ = s7n0.q(d0tVar, str, list, z2, z3, str2, kpb.b0(d0tVar, z), kpb.d0(d0tVar, z));
                boolean z5 = j == 40;
                rws0 rws0Var = new rws0(qzb.c0(d0tVar), kpb.D(d0tVar));
                rws0 rws0Var2 = new rws0(qzb.r0(d0tVar), kpb.U(d0tVar));
                p0n p0nVarU = dyb.U(d0tVar);
                String strG = z5 ? kpb.G(d0tVar, ctf0Var) : kpb.X(d0tVar);
                if (d0tVar.S && z4) {
                    d2iVar = new d2i();
                }
                l56Var = new o56(j2, k4iVarQ, new y66(d2iVar, p0nVarU, rws0Var, rws0Var2, strG), jn8.a(d0tVar, v5l0Var, ctf0Var, m5l0Var));
            }
        } else {
            l56Var = new p56(d0tVar.f5282a, s7n0.r(d0tVar, str, list, z2, z3, str2, kpb.b0(d0tVar, z), kpb.d0(d0tVar, z)), new g76(new qws0(qzb.c0(d0tVar)), new qws0(qzb.r0(d0tVar)), dyb.U(d0tVar), j == 40 ? kpb.G(d0tVar, ctf0Var) : kpb.X(d0tVar), pem.f26861a), jn8.a(d0tVar, v5l0Var, ctf0Var, m5l0Var));
        }
        return l56Var;
    }

    public static final void p(int i, fet fetVar, mm40 mm40Var, String str, String str2, boolean z) {
        int i2;
        boolean z2;
        boolean z3;
        long jM129getWhite400d7_KjU;
        boolean z4;
        long jM130getWhite600d7_KjU;
        fet fetVar2 = fetVar;
        fetVar2.g0(-1873838683);
        int i3 = i | (fetVar2.g(str) ? 32 : 16) | (fetVar2.g("") ? 256 : 128) | (fetVar2.g(str2) ? 2048 : 1024) | (fetVar2.h(z) ? 16384 : 8192);
        if (fetVar2.U(i3 & 1, (i3 & 9363) != 9362)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarU = o7k0.u(mm40Var, 116.0f, 0.0f, 2);
            yx7 yx7Var = gqw0.k;
            x5d x5dVarA = w5d.a(new qw3(4.0f, false, new gne(yx7Var, (byte) 11)), gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarU);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z5 = fetVar2.S;
            pcy pcyVar = e7z.u1;
            if (z5) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar2, x5dVarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            if (str.length() > 0) {
                fetVar2.e0(-196747510);
                thg0 thg0VarA = shg0.a(new qw3(4.0f, true, new jf4((byte) 14)), yx7Var, fetVar2, 48);
                int iHashCode2 = Long.hashCode(fetVar2.T);
                bh90 bh90VarM2 = fetVar2.m();
                mm40 mm40VarC1 = kbc.c0(fetVar2, jm40.b);
                fetVar2.i0();
                if (fetVar2.S) {
                    fetVar2.l(pcyVar);
                } else {
                    fetVar2.r0();
                }
                jpm0.o(fetVar2, thg0VarA, shdVar);
                jpm0.o(fetVar2, bh90VarM2, shdVar2);
                vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
                jpm0.o(fetVar2, mm40VarC1, shdVar4);
                if (str.length() > 0) {
                    x7z x7zVarF = rz4.f(fetVar2, -1892736304, 1.0f, false);
                    ((g1t0) fetVar2.k(j1t0.e)).getClass();
                    y9q0 y9q0VarM = g1t0.m();
                    if (z) {
                        fetVar2.e0(-199595531);
                        jM130getWhite600d7_KjU = ((StaticColors) fetVar2.k(m8m0.f21378a)).m123getWhite0d7_KjU();
                        z4 = false;
                    } else {
                        z4 = false;
                        fetVar2.e0(-199594409);
                        jM130getWhite600d7_KjU = ((StaticColors) fetVar2.k(m8m0.f21378a)).m130getWhite600d7_KjU();
                    }
                    fetVar2.r(z4);
                    i2 = i3;
                    v8q0.a(str, x7zVarF, jM130getWhite600d7_KjU, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, y9q0VarM, fetVar2, (i3 >> 3) & 14, 24960, 110584);
                    fetVar2 = fetVar2;
                    z2 = false;
                    fetVar2.r(false);
                } else {
                    i2 = i3;
                    z2 = false;
                    fetVar2.e0(-1892316750);
                    fetVar2.r(false);
                }
                fetVar2.e0(-1892087598);
                fetVar2.r(z2);
                z3 = true;
                fetVar2.r(true);
                fetVar2.r(z2);
            } else {
                i2 = i3;
                z2 = false;
                z3 = true;
                fetVar2.e0(-195867885);
                fetVar2.r(false);
            }
            if (str2.length() > 0) {
                fetVar2.e0(-195809977);
                ((g1t0) fetVar2.k(j1t0.e)).getClass();
                y9q0 y9q0VarG = g1t0.g();
                if (z) {
                    fetVar2.e0(2071898390);
                    jM129getWhite400d7_KjU = ((StaticColors) fetVar2.k(m8m0.f21378a)).m130getWhite600d7_KjU();
                } else {
                    fetVar2.e0(2071899574);
                    jM129getWhite400d7_KjU = ((StaticColors) fetVar2.k(m8m0.f21378a)).m129getWhite400d7_KjU();
                }
                fetVar2.r(z2);
                fet fetVar3 = fetVar2;
                v8q0.a(str2, null, jM129getWhite400d7_KjU, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, y9q0VarG, fetVar3, (i2 >> 9) & 14, 24960, 110586);
                fetVar2 = fetVar3;
                fetVar2.r(false);
            } else {
                fetVar2.e0(-195511757);
                fetVar2.r(z2);
            }
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new eza((byte) 2, i, mm40Var, str, str2, z);
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x002a  */
    /* JADX WARN: Code duplicated, block: B:35:0x004e  */
    public static final sqk p0(ksk kskVar) {
        btk btkVar;
        btk btkVar2;
        j0g0 j0g0Var;
        j0g0 j0g0Var2;
        j0g0 j0g0Var3 = kskVar.d;
        boolean z = j0g0Var3 == null;
        j0g0 j0g0Var4 = kskVar.c;
        if (j0g0Var3 != null) {
            Object obj = j0g0Var3.f15681a;
            if (obj instanceof g0g0) {
                obj = null;
            }
            kuk kukVar = (kuk) obj;
            if (kukVar == null || (j0g0Var2 = kukVar.c) == null) {
                btkVar = new btk(iun.f15405a, "");
            } else {
                Object obj2 = j0g0Var2.f15681a;
                if (obj2 instanceof g0g0) {
                    obj2 = null;
                }
                btkVar = (btk) obj2;
                if (btkVar == null) {
                    btkVar = new btk(iun.f15405a, "");
                }
            }
        } else {
            btkVar = new btk(iun.f15405a, "");
        }
        if (j0g0Var3 != null) {
            Object obj3 = j0g0Var3.f15681a;
            if (obj3 instanceof g0g0) {
                obj3 = null;
            }
            kuk kukVar2 = (kuk) obj3;
            if (kukVar2 == null || (j0g0Var = kukVar2.d) == null) {
                btkVar2 = new btk(iun.f15405a, "");
            } else {
                Object obj4 = j0g0Var.f15681a;
                btkVar2 = (btk) (obj4 instanceof g0g0 ? null : obj4);
                if (btkVar2 == null) {
                    btkVar2 = new btk(iun.f15405a, "");
                }
            }
        } else {
            btkVar2 = new btk(iun.f15405a, "");
        }
        return new sqk(z, j0g0Var4, btkVar, btkVar2);
    }

    public static final void q(mm40 mm40Var, k0n k0nVar, fet fetVar, int i) {
        int i2;
        boolean z;
        fet fetVar2 = fetVar;
        fetVar2.g0(-515701022);
        if ((i & 6) == 0) {
            i2 = i | (fetVar2.g(mm40Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(k0nVar) ? 32 : 16;
        }
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            x5d x5dVarA = w5d.a(uc9.c, gqw0.n, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40Var);
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
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarN = s5x0.N(jm40Var, 0.0f, 12.0f, 0.0f, 8.0f, 5);
            a2m a2mVar = k0nVar.d;
            g0n g0nVar = k0nVar.b;
            w(mm40VarN, a2mVar, k0nVar.f17477a, fetVar2, 0);
            if (g0nVar instanceof e0n) {
                fetVar2.e0(821182985);
                e0n e0nVar = (e0n) g0nVar;
                rcb.x(null, e0nVar.f6996a, h2m.b, e0nVar.b, e0nVar.d, null, fetVar, 384);
                mm40 mm40VarN2 = s5x0.N(jm40Var, 0.0f, 4.0f, 0.0f, 0.0f, 13);
                String str = e0nVar.c;
                ((g1t0) fetVar.k(j1t0.e)).getClass();
                z = true;
                v8q0.a(str, mm40VarN2, ((ThemeColors) fetVar.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.h(), fetVar, 0, 24960, 110584);
                fetVar2 = fetVar;
                fetVar2.r(false);
            } else {
                z = true;
                if (Intrinsics.d(g0nVar, f0n.f8723a)) {
                    fetVar2.e0(821963286);
                    j6n.h("VAR", kro0.f18776a, null, 0, 0, fetVar2, 54, 28);
                    fetVar2.r(false);
                } else {
                    if (g0nVar != null) {
                        throw b1j.f(-666249724, fetVar2, false);
                    }
                    fetVar2.e0(822121076);
                    fetVar2.r(false);
                }
            }
            fetVar2.r(z);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xvm((byte) 29, i, mm40Var, k0nVar);
        }
    }

    public static final v9s q0(oq7 oq7Var) {
        BetPlayerZip betPlayerZip;
        PlayersDuelZip playersDuelZip;
        uoy uoyVarJ;
        oq7Var.getClass();
        wh7 wh7Var = oq7Var.i;
        if (wh7Var != null) {
            Long l = wh7Var.f39152a;
            long jLongValue = l != null ? l.longValue() : 0L;
            String str = wh7Var.b;
            if (str == null) {
                str = "";
            }
            betPlayerZip = new BetPlayerZip(jLongValue, str);
        } else {
            betPlayerZip = null;
        }
        kga0 kga0Var = oq7Var.u;
        if (kga0Var != null) {
            List list = kga0Var.f18229a;
            if (list == null) {
                list = iun.f15405a;
            }
            List list2 = kga0Var.b;
            if (list2 == null) {
                list2 = iun.f15405a;
            }
            playersDuelZip = new PlayersDuelZip(list, list2);
        } else {
            playersDuelZip = null;
        }
        long j = oq7Var.f25674a;
        double d = oq7Var.b;
        Long l2 = oq7Var.c;
        long jLongValue2 = l2 != null ? l2.longValue() : 0L;
        double d2 = oq7Var.d;
        String str2 = oq7Var.e;
        Double dValueOf = Double.valueOf(d2);
        BigDecimal bigDecimalH = str2 != null ? kotlin.text.b.h(str2) : null;
        if (bigDecimalH == null) {
            bigDecimalH = kotlin.text.b.h(String.valueOf(dValueOf));
        }
        if (bigDecimalH == null) {
            bigDecimalH = new BigDecimal(0);
        }
        BigDecimal bigDecimal = bigDecimalH;
        boolean zD = Intrinsics.d(oq7Var.f, Boolean.TRUE);
        String str3 = oq7Var.g;
        String str4 = oq7Var.h;
        Integer num = oq7Var.j;
        Long l3 = oq7Var.k;
        Integer num2 = oq7Var.l;
        Integer num3 = oq7Var.m;
        if (num3 != null) {
            int iIntValue = num3.intValue();
            uoy.b.getClass();
            uoyVarJ = tqt.j(iIntValue);
        } else {
            uoyVarJ = null;
        }
        Long l4 = oq7Var.n;
        Integer num4 = oq7Var.o;
        Long l5 = oq7Var.p;
        Boolean bool = oq7Var.q;
        Long l6 = oq7Var.r;
        Boolean bool2 = oq7Var.s;
        Integer num5 = oq7Var.v;
        nq7 nq7Var = oq7Var.y;
        List list3 = nq7Var != null ? nq7Var.f23946a : null;
        if (list3 == null) {
            list3 = iun.f15405a;
        }
        List list4 = nq7Var != null ? nq7Var.b : null;
        if (list4 == null) {
            list4 = iun.f15405a;
        }
        return new v9s(j, d, jLongValue2, d2, str2, bigDecimal, zD, str3, str4, betPlayerZip, num, l3, num2, uoyVarJ, l4, num4, l5, bool, l6, bool2, playersDuelZip, num5, new EventParams(list3, list4));
    }

    public static final void r(mm40 mm40Var, boolean z, ows0 ows0Var, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        int i2 = ows0Var.b;
        fetVar2.g0(-1002163480);
        int i3 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(ows0Var) ? 256 : 128);
        if (fetVar2.U(i3 & 1, (i3 & 147) != 146)) {
            x5d x5dVarA = w5d.a(uc9.c, gqw0.n, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40Var);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z2 = fetVar2.S;
            pcy pcyVar = e7z.u1;
            if (z2) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar2, x5dVarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarN = o7k0.n(jm40Var, 64.0f);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarN);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar4);
            boolean z3 = (i3 & 896) == 256;
            Object objP = fetVar2.P();
            if (z3 || objP == ukd.f35823a) {
                objP = new b0n(ows0Var, (byte) 3);
                fetVar2.o0(objP);
            }
            kkb.p(1, fetVar2, null, (Function0) objP);
            if (i2 > 0) {
                fetVar2.e0(-1275328425);
                tdc.e(new rpe(i2), ipe.f15159a, ffb0.Q(jr8.f16991a.b(jm40Var, z ? gqw0.i : gqw0.g), z ? 3.0f : -3.0f, 2.0f), fetVar2, 48, 0);
                fetVar2.r(false);
            } else {
                fetVar2.e0(-1274706658);
                fetVar2.r(false);
            }
            fetVar2.r(true);
            kc5.N(ows0Var.f25981a, o7k0.e(s5x0.N(jm40Var, 0.0f, 4.0f, 0.0f, 0.0f, 13), 36.0f), 0L, null, null, 0L, qmk.q, g1t0.m().f42262a.b, null, null, 0L, gqw0.e, 2, false, 2, 0, false, null, y9q0.a(ibm0.t(g1t0.l(), fetVar2), 0L, 0L, null, null, null, 0L, null, null, 3, 0, 0L, null, null, 16744447), 0.0f, fetVar, 0, 1600512, 0, 3055420);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new c0n(mm40Var, z, ows0Var, i, (byte) 3);
        }
    }

    public static final f0t r0(oas oasVar) {
        Long l = oasVar.f24944a;
        long jLongValue = l != null ? l.longValue() : 0L;
        String str = oasVar.b;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        List list = oasVar.c;
        if (list == null) {
            list = iun.f15405a;
        }
        List list2 = list;
        List list3 = oasVar.d;
        if (list3 == null) {
            list3 = iun.f15405a;
        }
        List list4 = list3;
        Integer num = oasVar.e;
        return new f0t(num != null ? num.intValue() : 0, jLongValue, str2, list2, list4);
    }

    public static final void s(mm40 mm40Var, String str, a4x a4xVar, String str2, boolean z, fet fetVar, int i) {
        int i2;
        String str3;
        fet fetVar2 = fetVar;
        fetVar2.g0(-1946521607);
        if ((i & 6) == 0) {
            i2 = (fetVar2.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            str3 = str;
            i2 |= fetVar2.g(str3) ? 32 : 16;
        } else {
            str3 = str;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? fetVar2.g(a4xVar) : fetVar2.i(a4xVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar2.g(str2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar2.h(z) ? 16384 : 8192;
        }
        if (fetVar2.U(i2 & 1, (i2 & 9363) != 9362)) {
            xx7 xx7Var = z ? gqw0.m : gqw0.o;
            zcl zclVar = qmk.f28987a;
            x5d x5dVarA = w5d.a(new qw3(2.0f, true, new jf4((byte) 14)), xx7Var, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40Var);
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
            zfn zfnVar = zaq0.b;
            long textPrimary = ((ThemeColors) fetVar2.k(zfnVar)).getTextPrimary();
            zfn zfnVar2 = j1t0.e;
            ((g1t0) fetVar2.k(zfnVar2)).getClass();
            int i3 = i2 >> 3;
            v8q0.a(str3, null, textPrimary, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.d(), fetVar2, i3 & 14, 24960, 110586);
            d((i3 & 112) | ((i2 >> 6) & 896), fetVar2, a4xVar, null, z);
            if (str2.length() > 0) {
                fetVar2.e0(2079638143);
                long secondary = ((ThemeColors) fetVar2.k(zfnVar)).getSecondary();
                ((g1t0) fetVar2.k(zfnVar2)).getClass();
                v8q0.a(str2, null, secondary, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.g(), fetVar2, (i2 >> 9) & 14, 24960, 110586);
                fetVar2 = fetVar2;
                fetVar2.r(false);
            } else {
                fetVar2 = fetVar2;
                fetVar2.e0(2079894079);
                fetVar2.r(false);
            }
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new mtm(mm40Var, str, a4xVar, str2, z, i, (byte) 2);
        }
    }

    public static final Bitmap s0(Bitmap bitmap) {
        if (Build.VERSION.SDK_INT < 26 || bitmap.getConfig() != Bitmap.Config.HARDWARE) {
            return bitmap;
        }
        Bitmap bitmapCopy = bitmap.copy(Bitmap.Config.ARGB_8888, false);
        bitmapCopy.getClass();
        return bitmapCopy;
    }

    public static final void t(mm40 mm40Var, o4i o4iVar, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        fetVar2.g0(-272427257);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(o4iVar) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 54.0f);
            thg0 thg0VarA = shg0.a(uc9.b, gqw0.k, fetVar2, 54);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarE);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z = fetVar2.S;
            pcy pcyVar = e7z.u1;
            if (z) {
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
            jm40 jm40Var = jm40.b;
            mm40 mm40VarH = dw9.h(1.0f, s5x0.N(jm40Var, 0.0f, 0.0f, 8.0f, 0.0f, 11), true);
            String str = o4iVar.f24636a;
            zfn zfnVar = j1t0.e;
            ((g1t0) fetVar2.k(zfnVar)).getClass();
            y9q0 y9q0VarM = g1t0.m();
            zx7 zx7Var = gqw0.f;
            long j = qmk.q;
            ((g1t0) fetVar2.k(zfnVar)).getClass();
            kc5.N(str, mm40VarH, ((ThemeColors) fetVar2.k(zaq0.b)).getTextPrimary(), null, null, 0L, j, g1t0.m().f42262a.b, null, null, 0L, zx7Var, 2, false, 3, 0, false, null, y9q0VarM, 0.0f, fetVar, 0, 1600512, 0, 3055416);
            fetVar2 = fetVar;
            x5d x5dVarA = w5d.a(new qw3(2.0f, true, new jf4((byte) 14)), gqw0.m, fetVar2, 0);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, jm40Var);
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
            int i3 = i2 & 112;
            boolean z2 = i3 == 32;
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (z2 || objP == cl5Var) {
                objP = new p1i(o4iVar, (byte) 0);
                fetVar2.o0(objP);
            }
            kkb.p(1, fetVar2, null, (Function0) objP);
            boolean z3 = i3 == 32;
            Object objP2 = fetVar2.P();
            if (z3 || objP2 == cl5Var) {
                objP2 = new p1i(o4iVar, (byte) 1);
                fetVar2.o0(objP2);
            }
            kkb.p(1, fetVar2, null, (Function0) objP2);
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new q1i(mm40Var, o4iVar, i, (byte) 0);
        }
    }

    public static final void u(mm40 mm40Var, o4i o4iVar, fet fetVar, int i) {
        byte b;
        fet fetVar2 = fetVar;
        fetVar2.g0(-1257802643);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(o4iVar) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 54.0f);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarE);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z = fetVar2.S;
            pcy pcyVar = e7z.u1;
            if (z) {
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
            x5d x5dVarA = w5d.a(new qw3(2.0f, true, new jf4((byte) 14)), gqw0.m, fetVar2, 0);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC1 = kbc.c0(fetVar2, jm40Var);
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
            int i3 = i2 & 112;
            boolean z2 = i3 == 32;
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (z2 || objP == cl5Var) {
                objP = new p1i(o4iVar, (byte) 2);
                fetVar2.o0(objP);
            }
            kkb.p(1, fetVar2, null, (Function0) objP);
            boolean z3 = i3 == 32;
            Object objP2 = fetVar2.P();
            if (z3 || objP2 == cl5Var) {
                objP2 = new p1i(o4iVar, (byte) 3);
                fetVar2.o0(objP2);
            }
            kkb.p(1, fetVar2, null, (Function0) objP2);
            fetVar2.r(true);
            mm40 mm40VarH = dw9.h(1.0f, s5x0.N(jm40Var, 8.0f, 0.0f, 0.0f, 0.0f, 14), true);
            String str = o4iVar.f24636a;
            zfn zfnVar = j1t0.e;
            ((g1t0) fetVar2.k(zfnVar)).getClass();
            y9q0 y9q0VarM = g1t0.m();
            long j = qmk.q;
            ((g1t0) fetVar2.k(zfnVar)).getClass();
            b = 1;
            kc5.N(str, mm40VarH, ((ThemeColors) fetVar2.k(zaq0.b)).getTextPrimary(), null, null, 0L, j, g1t0.m().f42262a.b, null, null, 0L, null, 2, false, 3, 0, false, null, y9q0VarM, 0.0f, fetVar, 0, 1597440, 0, 3063608);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            b = 1;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new q1i(mm40Var, o4iVar, i, b);
        }
    }

    public static final void v(mm40 mm40Var, String str, String str2, a4x a4xVar, a4x a4xVar2, String str3, String str4, y1m y1mVar, boolean z, fet fetVar, int i) {
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        fetVar2.g0(658272793);
        int i2 = i | 6 | (fetVar2.g(str) ? 32 : 16) | (fetVar2.g(str2) ? 256 : 128) | (fetVar2.g(a4xVar) ? 2048 : 1024) | (fetVar2.g(a4xVar2) ? 16384 : 8192) | (fetVar2.g(str3) ? 131072 : 65536) | (fetVar2.g(str4) ? 1048576 : 524288) | (fetVar2.g(y1mVar) ? 8388608 : 4194304) | (fetVar2.h(z) ? 67108864 : 33554432);
        if (fetVar2.U(i2 & 1, (38347923 & i2) != 38347922)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            thg0 thg0VarA = shg0.a(new qw3(8.0f, true, new gne(gqw0.n, (byte) 12)), gqw0.j, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarD);
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
            zhg0 zhg0Var = zhg0.f44392a;
            int i3 = i2 >> 3;
            int i4 = i2 >> 6;
            s(zhg0Var.a(1.0f, jm40Var, true), str, a4xVar, str3, true, fetVar2, (i2 & 112) | 24576 | (i3 & 896) | (i4 & 7168));
            obb.q(zhg0Var.b(gqw0.k, jm40Var), y1mVar, z, fetVar, (i2 >> 18) & 1008, 0);
            fetVar2 = fetVar;
            s(zhg0Var.a(1.0f, jm40Var, true), str2, a4xVar2, str4, false, fetVar2, (i3 & 112) | 24576 | (i4 & 896) | ((i2 >> 9) & 7168));
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new iwm(mm40Var2, str, str2, a4xVar, a4xVar2, str3, str4, y1mVar, z, i, (byte) 0);
        }
    }

    public static final void w(mm40 mm40Var, a2m a2mVar, boolean z, fet fetVar, int i) {
        mm40 mm40Var2;
        a2m a2mVar2;
        boolean z2;
        fet fetVar2;
        fetVar.g0(1978892594);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(a2mVar) ? 32 : 16) | (fetVar.h(z) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            fetVar2 = fetVar;
            obb.q(mm40Var, a2mVar, z, fetVar2, i2 & 1022, 0);
            mm40Var2 = mm40Var;
            a2mVar2 = a2mVar;
            z2 = z;
        } else {
            mm40Var2 = mm40Var;
            a2mVar2 = a2mVar;
            z2 = z;
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wwm(mm40Var2, a2mVar2, z2, i, (byte) 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00f4  */
    public static final void x(mm40 mm40Var, String str, z1n z1nVar, fet fetVar, int i) {
        fet fetVar2;
        mm40 mm40Var2;
        long j;
        boolean z;
        jm40 jm40Var;
        boolean z2;
        fetVar.g0(1382051903);
        int i2 = i | 6 | (fetVar.g(str) ? 32 : 16) | (fetVar.g(z1nVar) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            jm40 jm40Var2 = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var2, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(o7k0.e(mm40VarD, 40.0f), 0.0f, 2.0f, 1);
            x5d x5dVarA = w5d.a(new qw3(4.0f, false, new gne(gqw0.k, (byte) 11)), gqw0.n, fetVar, 48);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarL);
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
            boolean z3 = z1nVar instanceof x1n;
            if (z3) {
                fetVar.e0(-893083027);
                fetVar.r(false);
                z = false;
            } else {
                if (!(z1nVar instanceof y1n)) {
                    throw b1j.f(-893084729, fetVar, false);
                }
                fetVar.e0(-1915681554);
                boolean z4 = (i2 & 896) == 256;
                Object objP = fetVar.P();
                if (z4 || objP == ukd.f35823a) {
                    y1n y1nVar = (y1n) z1nVar;
                    r7n r7nVarY = nsm0.y(fgm.b);
                    a8n a8nVar = new a8n();
                    long j2 = y1nVar.f41864a;
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (y1nVar.c) {
                        j = j2 - jCurrentTimeMillis;
                        if (j < 0) {
                            j = 0;
                        }
                    } else {
                        j = j2 - (jCurrentTimeMillis - y1nVar.b);
                        if (j < 0) {
                            j = 0;
                        }
                    }
                    objP = new c8n(r7nVarY, new w7n(a8nVar, j, true, 0, false, null, 56));
                    fetVar.o0(objP);
                }
                v7n.c(null, (c8n) objP, null, fetVar, 5);
                z = false;
                fetVar.r(false);
            }
            if (str.length() > 0) {
                fetVar.e0(-1914845391);
                ((g1t0) fetVar.k(j1t0.e)).getClass();
                z2 = true;
                jm40Var = jm40Var2;
                v8q0.a(str, null, ((ThemeColors) fetVar.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, z3 ? 2 : 1, 0, null, g1t0.g(), fetVar, (i2 >> 3) & 14, 384, 109562);
                fetVar2 = fetVar;
                fetVar2.r(z);
            } else {
                fetVar2 = fetVar;
                jm40Var = jm40Var2;
                z2 = true;
                fetVar2.e0(-1914489511);
                fetVar2.r(z);
            }
            fetVar2.r(z2);
            mm40Var2 = jm40Var;
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new coh(mm40Var2, str, z1nVar, i, (byte) 6);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object y(jzj jzjVar, long j, zje zjeVar) {
        ine ineVar;
        if (zjeVar instanceof ine) {
            ineVar = (ine) zjeVar;
            int i = ineVar.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                ineVar.j = i - Integer.MIN_VALUE;
            } else {
                ineVar = new ine(zjeVar);
            }
        } else {
            ineVar = new ine(zjeVar);
        }
        Object objU = ineVar.i;
        wne wneVar = wne.f39444a;
        int i2 = ineVar.j;
        yje yjeVar = null;
        if (i2 == 0) {
            z1x.P(objU);
            igb igbVar = new igb((Object) jzjVar, yjeVar, (byte) 12);
            ineVar.j = 1;
            objU = msm0.u(j, igbVar, ineVar);
            if (objU == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objU);
        }
        return Boolean.valueOf(objU != null);
    }

    public static void z(dpi0 dpi0Var) {
        D(dpi0Var, Separators.COMMA, y3d.g);
    }
}
