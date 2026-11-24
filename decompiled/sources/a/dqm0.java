package a;

import android.gov.nist.core.Separators;
import android.javax.sip.message.Response;
import android.net.Uri;
import android.os.Build;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.CharsKt;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes4.dex */
public abstract class dqm0 {
    public static final hl50 A(byte[] bArr) throws IOException {
        bArr.getClass();
        if (Build.VERSION.SDK_INT < 28 || bArr.length == 0) {
            return new hl50(null);
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
            try {
                int i = objectInputStream.readInt();
                int[] iArr = new int[i];
                for (int i2 = 0; i2 < i; i2++) {
                    iArr[i2] = objectInputStream.readInt();
                }
                int i3 = objectInputStream.readInt();
                int[] iArr2 = new int[i3];
                for (int i4 = 0; i4 < i3; i4++) {
                    iArr2[i4] = objectInputStream.readInt();
                }
                hl50 hl50VarA = x1x.A(iArr2, iArr);
                objectInputStream.close();
                byteArrayInputStream.close();
                return hl50VarA;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    bkb.E(objectInputStream, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                bkb.E(byteArrayInputStream, th3);
                throw th4;
            }
        }
    }

    public static final udp0 B(rpp0 rpp0Var, List list, boolean z, List list2, boolean z2, int i) {
        list.getClass();
        if (!(rpp0Var instanceof ppp0)) {
            if (!(rpp0Var instanceof qpp0)) {
                t9f.b();
                return null;
            }
            String str = (String) CollectionsKt.firstOrNull(list);
            qpp0 qpp0Var = (qpp0) rpp0Var;
            return new kdp0(C(str == null ? "" : str, qpp0Var.e, z, R.drawable.ic_home, list2, z2, z9p.b), qpp0Var.g, new rpe(i));
        }
        String str2 = (String) CollectionsKt.firstOrNull(list);
        String str3 = str2 == null ? "" : str2;
        Pair pair = ((ppp0) rpp0Var).e;
        long jLongValue = ((Number) pair.f46059a).longValue();
        z9p z9pVar = z9p.b;
        g5a0 g5a0VarC = C(str3, jLongValue, z, R.drawable.ic_home, list2, z2, z9pVar);
        String str4 = (String) CollectionsKt.W(1, list);
        return new rcp0(g5a0VarC, C(str4 == null ? "" : str4, ((Number) pair.b).longValue(), z, R.drawable.ic_home, list2, z2, z9pVar), rpp0Var.c);
    }

    public static final g5a0 C(String str, long j, boolean z, int i, List list, boolean z2, z9p z9pVar) {
        zfp zfpVar;
        d280 b280Var = z ? new b280(i) : new c280(vsm0.s(j, str), R.drawable.ic_glyph_placeholder_player);
        if (z || z2) {
            zfpVar = null;
        } else {
            boolean z3 = false;
            if (!list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (((xcp) it.next()).f40657a == j) {
                        z3 = true;
                        break;
                    }
                }
            }
            zfpVar = new zfp(j, z3, z9pVar);
        }
        return new g5a0(b280Var, zfpVar);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0032  */
    public static final qks0 D(tks0 tks0Var) {
        String strE;
        Boolean bool;
        String str;
        Long l;
        long jLongValue = (tks0Var == null || (l = tks0Var.f34112a) == null) ? 0L : l.longValue();
        String str2 = tks0Var != null ? tks0Var.b : null;
        String str3 = str2 == null ? "" : str2;
        if (tks0Var == null || (str = tks0Var.c) == null) {
            strE = null;
        } else {
            if (StringsKt.W(str)) {
                str = null;
            }
            if (str != null) {
                strE = lmc.E(str);
            } else {
                strE = null;
            }
        }
        String str4 = strE == null ? "" : strE;
        String str5 = tks0Var != null ? tks0Var.d : null;
        String str6 = str5 == null ? "" : str5;
        g9m0 g9m0Var = fks0.b;
        String str7 = tks0Var != null ? tks0Var.e : null;
        g9m0Var.getClass();
        return new qks0(jLongValue, str3, str4, str6, g9m0.e(str7), (tks0Var == null || (bool = tks0Var.f) == null) ? false : bool.booleanValue());
    }

    public static final udp0 E(rpp0 rpp0Var, List list, boolean z, List list2, boolean z2, int i) {
        list.getClass();
        if (!(rpp0Var instanceof ppp0)) {
            if (!(rpp0Var instanceof qpp0)) {
                t9f.b();
                return null;
            }
            String str = (String) CollectionsKt.firstOrNull(list);
            qpp0 qpp0Var = (qpp0) rpp0Var;
            return new kdp0(C(str == null ? "" : str, qpp0Var.f, z, R.drawable.ic_away, list2, z2, z9p.f44030a), qpp0Var.h, new rpe(i));
        }
        String str2 = (String) CollectionsKt.firstOrNull(list);
        String str3 = str2 == null ? "" : str2;
        Pair pair = ((ppp0) rpp0Var).f;
        long jLongValue = ((Number) pair.f46059a).longValue();
        z9p z9pVar = z9p.f44030a;
        g5a0 g5a0VarC = C(str3, jLongValue, z, R.drawable.ic_away, list2, z2, z9pVar);
        String str4 = (String) CollectionsKt.W(1, list);
        return new rcp0(g5a0VarC, C(str4 == null ? "" : str4, ((Number) pair.b).longValue(), z, R.drawable.ic_away, list2, z2, z9pVar), rpp0Var.d);
    }

    public static final w56 F(d0t d0tVar, ctf0 ctf0Var, m5l0 m5l0Var, v5l0 v5l0Var, String str, String str2, List list, boolean z, boolean z2, boolean z3, boolean z4) {
        p6x p6xVar;
        w56 r56Var;
        xem xemVar;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        xem xemVar2;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        p6x p6xVar2;
        p6x p6xVar3;
        d0tVar.getClass();
        rqs rqsVar = d0tVar.p;
        ctf0Var.getClass();
        str.getClass();
        list.getClass();
        v5l0Var.getClass();
        str2.getClass();
        int iOrdinal = v5l0Var.ordinal();
        dzm dzmVar = dzm.f6947a;
        gzm gzmVar = fzm.f10414a;
        if (iOrdinal != 0) {
            tem temVar = tem.f33827a;
            wem wemVar = wem.f39025a;
            vem vemVar = vem.f37292a;
            if (iOrdinal != 1) {
                f2i f2iVar = null;
                if (iOrdinal == 2) {
                    boolean z5 = true;
                    long j = d0tVar.f5282a;
                    k4i k4iVarT = w7n0.t(d0tVar, str, list, z3, z4, str2, kpb.b0(d0tVar, z), kpb.d0(d0tVar, z));
                    boolean zF0 = kpb.f0(d0tVar, z);
                    boolean zA0 = kpb.a0(d0tVar, z, z2);
                    int i = gql0.f11739a;
                    int i2 = rqsVar.g;
                    boolean z6 = i2 > 0;
                    boolean z7 = i2 == 1;
                    boolean z8 = z6 && z7;
                    if (!z6 || z7) {
                        z5 = false;
                    }
                    String strS0 = qzb.s0(d0tVar);
                    d280 d280Var = wpm0.n(d0tVar).b;
                    tym tymVarR = fxb.R(d0tVar, ctf0Var);
                    String str15 = (tymVarR == null || (str14 = tymVarR.b) == null) ? "" : str14;
                    tym tymVarS = fxb.S(d0tVar);
                    String str16 = (tymVarS == null || (str13 = tymVarS.b) == null) ? "" : str13;
                    String str17 = fxb.T(d0tVar, ctf0Var).b;
                    tym tymVarR2 = fxb.R(d0tVar, ctf0Var);
                    boolean z9 = tymVarR2 != null ? tymVarR2.d : false;
                    tym tymVarS2 = fxb.S(d0tVar);
                    wws0 wws0Var = new wws0(strS0, d280Var, 0, str15, str16, str17, fxb.T(d0tVar, ctf0Var).d, z9, tymVarS2 != null ? tymVarS2.d : false);
                    String strT0 = qzb.t0(d0tVar);
                    d280 d280Var2 = wpm0.o(d0tVar).b;
                    tym tymVarR3 = fxb.R(d0tVar, ctf0Var);
                    String str18 = (tymVarR3 == null || (str12 = tymVarR3.c) == null) ? "" : str12;
                    tym tymVarS3 = fxb.S(d0tVar);
                    String str19 = (tymVarS3 == null || (str11 = tymVarS3.c) == null) ? "" : str11;
                    String str20 = fxb.T(d0tVar, ctf0Var).c;
                    tym tymVarR4 = fxb.R(d0tVar, ctf0Var);
                    boolean z10 = tymVarR4 != null ? tymVarR4.e : false;
                    tym tymVarS4 = fxb.S(d0tVar);
                    wws0 wws0Var2 = new wws0(strT0, d280Var2, 0, str18, str19, str20, fxb.T(d0tVar, ctf0Var).e, z10, tymVarS4 != null ? tymVarS4.e : false);
                    String strU = fxb.U(d0tVar, ctf0Var);
                    tym tymVarR5 = fxb.R(d0tVar, ctf0Var);
                    String str21 = (tymVarR5 == null || (str10 = tymVarR5.f34762a) == null) ? "" : str10;
                    tym tymVarS5 = fxb.S(d0tVar);
                    String str22 = (tymVarS5 == null || (str9 = tymVarS5.f34762a) == null) ? "" : str9;
                    String str23 = fxb.T(d0tVar, ctf0Var).f34762a;
                    if (z8) {
                        xemVar2 = vemVar;
                    } else {
                        xemVar2 = z5 ? wemVar : temVar;
                    }
                    if (zF0) {
                        f2iVar = e2i.f7087a;
                    } else if (zA0) {
                        f2iVar = c2i.f3624a;
                    }
                    r56Var = new u56(j, k4iVarT, new w86(wws0Var, wws0Var2, f2iVar, ctf0Var.b.a(R.string.live_new, Arrays.copyOf(new Object[0], 0)), strU, str21, str22, str23, kpb.e0(d0tVar) ? q0n.f27908a : o0n.f24435a, xemVar2), jn8.a(d0tVar, v5l0Var, ctf0Var, m5l0Var));
                } else if (iOrdinal == 3) {
                    long j2 = d0tVar.f5282a;
                    n0x n0xVar = new n0x(dtb.F(str));
                    l4i l4iVarS = w7n0.s(null, d0tVar, str, fxb.U(d0tVar, ctf0Var), ctf0Var.b.a(R.string.live_new, Arrays.copyOf(new Object[0], 0)), str2, list, z3, z4, kpb.e0(d0tVar), kpb.b0(d0tVar, z), kpb.d0(d0tVar, z), kpb.a0(d0tVar, z, z2), kpb.f0(d0tVar, z));
                    int i3 = gql0.f11739a;
                    int i4 = rqsVar.g;
                    boolean z11 = i4 > 0;
                    boolean z12 = i4 == 1;
                    boolean z13 = z11 && z12;
                    boolean z14 = z11 && !z12;
                    czm czmVarN = wpm0.n(d0tVar);
                    czm czmVarO = wpm0.o(d0tVar);
                    tym tymVarR6 = fxb.R(d0tVar, ctf0Var);
                    tym tymVarS6 = fxb.S(d0tVar);
                    tym tymVarT = fxb.T(d0tVar, ctf0Var);
                    if (z13) {
                        p6xVar2 = p6x.f26478a;
                    } else {
                        p6xVar2 = z14 ? p6x.b : p6x.c;
                    }
                    r56Var = new t56(j2, l4iVarS, new o86(czmVarN, czmVarO, tymVarR6, tymVarS6, tymVarT, p6xVar2), jn8.a(d0tVar, v5l0Var, ctf0Var, m5l0Var), n0xVar);
                } else {
                    if (iOrdinal != 4) {
                        t9f.b();
                        return null;
                    }
                    long j3 = d0tVar.f5282a;
                    k4i k4iVarR = w7n0.r(d0tVar, str, list, z3, z4, str2, kpb.b0(d0tVar, z), kpb.d0(d0tVar, z), kpb.a0(d0tVar, z, z2), kpb.f0(d0tVar, z));
                    int i5 = gql0.f11739a;
                    int i6 = rqsVar.g;
                    boolean z15 = i6 > 0;
                    boolean z16 = i6 == 1;
                    boolean z17 = z15 && z16;
                    boolean z18 = z15 && !z16;
                    czm czmVarN2 = wpm0.n(d0tVar);
                    czm czmVarO2 = wpm0.o(d0tVar);
                    tym tymVarR7 = fxb.R(d0tVar, ctf0Var);
                    tym tymVarS7 = fxb.S(d0tVar);
                    tym tymVarT2 = fxb.T(d0tVar, ctf0Var);
                    if (z17) {
                        p6xVar3 = p6x.f26478a;
                    } else {
                        p6xVar3 = z18 ? p6x.b : p6x.c;
                    }
                    r56Var = new s56(j3, k4iVarR, new g86(czmVarN2, czmVarO2, tymVarR7, tymVarS7, tymVarT2, p6xVar3, new sym(ctf0Var.b.a(R.string.live_new, Arrays.copyOf(new Object[0], 0)), fxb.U(d0tVar, ctf0Var), kpb.e0(d0tVar) ? gzmVar : dzmVar)), jn8.a(d0tVar, v5l0Var, ctf0Var, m5l0Var));
                }
            } else {
                long j4 = d0tVar.f5282a;
                j4i j4iVarU = w7n0.u(new y3d(StaticColors.INSTANCE.m113getRed0d7_KjU()), d0tVar, str, str2, list, z3, z4, kpb.b0(d0tVar, z), kpb.d0(d0tVar, z));
                int i7 = gql0.f11739a;
                int i8 = rqsVar.g;
                boolean z19 = i8 > 0;
                boolean z20 = i8 == 1;
                boolean z21 = z19 && z20;
                boolean z22 = z19 && !z20;
                String strS1 = qzb.s0(d0tVar);
                tym tymVarR8 = fxb.R(d0tVar, ctf0Var);
                String str24 = (tymVarR8 == null || (str8 = tymVarR8.b) == null) ? "" : str8;
                tym tymVarS8 = fxb.S(d0tVar);
                String str25 = (tymVarS8 == null || (str7 = tymVarS8.b) == null) ? "" : str7;
                String str26 = fxb.T(d0tVar, ctf0Var).b;
                tym tymVarR9 = fxb.R(d0tVar, ctf0Var);
                boolean z23 = tymVarR9 != null ? tymVarR9.d : false;
                tym tymVarS9 = fxb.S(d0tVar);
                vws0 vws0Var = new vws0(strS1, 0, str24, str25, str26, fxb.T(d0tVar, ctf0Var).d, z23, tymVarS9 != null ? tymVarS9.d : false);
                String strT1 = qzb.t0(d0tVar);
                tym tymVarR10 = fxb.R(d0tVar, ctf0Var);
                String str27 = (tymVarR10 == null || (str6 = tymVarR10.c) == null) ? "" : str6;
                tym tymVarS10 = fxb.S(d0tVar);
                String str28 = (tymVarS10 == null || (str5 = tymVarS10.c) == null) ? "" : str5;
                String str29 = fxb.T(d0tVar, ctf0Var).c;
                tym tymVarR11 = fxb.R(d0tVar, ctf0Var);
                boolean z24 = tymVarR11 != null ? tymVarR11.e : false;
                tym tymVarS11 = fxb.S(d0tVar);
                vws0 vws0Var2 = new vws0(strT1, 0, str27, str28, str29, fxb.T(d0tVar, ctf0Var).e, z24, tymVarS11 != null ? tymVarS11.e : false);
                String strU2 = fxb.U(d0tVar, ctf0Var);
                tym tymVarR12 = fxb.R(d0tVar, ctf0Var);
                String str30 = (tymVarR12 == null || (str4 = tymVarR12.f34762a) == null) ? "" : str4;
                tym tymVarS12 = fxb.S(d0tVar);
                String str31 = (tymVarS12 == null || (str3 = tymVarS12.f34762a) == null) ? "" : str3;
                String str32 = fxb.T(d0tVar, ctf0Var).f34762a;
                if (z21) {
                    xemVar = vemVar;
                } else {
                    xemVar = z22 ? wemVar : temVar;
                }
                r56Var = new v56(j4, j4iVarU, new e96(vws0Var, vws0Var2, strU2, str30, str31, str32, qem.f28591a, xemVar), jn8.a(d0tVar, v5l0Var, ctf0Var, m5l0Var));
            }
        } else {
            long j5 = d0tVar.f5282a;
            i4i i4iVarQ = w7n0.q(d0tVar, str, list, z3, z4, str2, kpb.b0(d0tVar, z), kpb.d0(d0tVar, z), kpb.a0(d0tVar, z, z2), kpb.f0(d0tVar, z));
            int i9 = gql0.f11739a;
            int i10 = rqsVar.g;
            boolean z25 = i10 > 0;
            boolean z26 = i10 == 1;
            boolean z27 = z25 && z26;
            boolean z28 = z25 && !z26;
            czm czmVarN3 = wpm0.n(d0tVar);
            czm czmVarO3 = wpm0.o(d0tVar);
            tym tymVarR13 = fxb.R(d0tVar, ctf0Var);
            tym tymVarS13 = fxb.S(d0tVar);
            tym tymVarT3 = fxb.T(d0tVar, ctf0Var);
            if (z27) {
                p6xVar = p6x.f26478a;
            } else {
                p6xVar = z28 ? p6x.b : p6x.c;
            }
            p6x p6xVar4 = p6xVar;
            String strU3 = fxb.U(d0tVar, ctf0Var);
            if (!kpb.e0(d0tVar)) {
                gzmVar = dzmVar;
            }
            r56Var = new r56(j5, i4iVarQ, new y76(czmVarN3, czmVarO3, tymVarR13, tymVarS13, tymVarT3, p6xVar4, new rym(strU3, gzmVar)), jn8.a(d0tVar, v5l0Var, ctf0Var, m5l0Var));
        }
        return r56Var;
    }

    public static final ArrayList G(List list, List list2) {
        list.getClass();
        list2.getClass();
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            uog uogVar = (uog) it.next();
            int i = uogVar.f36012a;
            arrayList.add(new cqm0(i, uogVar.e, uogVar.b, uogVar.d, uogVar.f, uogVar.g, uogVar.h, uogVar.i, uogVar.j, uogVar.k, !list2.contains(String.valueOf(i))));
        }
        return arrayList;
    }

    public static aot0 H(String str) {
        String strSubstring;
        String strSubstring2;
        String str2 = y190.b;
        String strR = !Intrinsics.d(str2, Separators.SLASH) ? kotlin.text.c.r(str, str2, Separators.SLASH, false) : str;
        boolean z = true;
        int i = 0;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        int i6 = -1;
        while (i < strR.length()) {
            char cCharAt = strR.charAt(i);
            if (cCharAt != '#') {
                if (cCharAt != '/') {
                    if (cCharAt != ':') {
                        if (cCharAt == '?' && i4 == -1 && i2 == -1) {
                            i4 = i + 1;
                        }
                    } else if (z && i4 == -1 && i2 == -1) {
                        int i7 = i + 2;
                        if (i7 < str.length() && str.charAt(i + 1) == '/' && str.charAt(i7) == '/' && i3 == -1) {
                            i5 = i + 3;
                            z = false;
                            i6 = i;
                            i = i7;
                        } else if (strR.equals(str)) {
                            i3 = i + 1;
                            i6 = i;
                            i = i3;
                            i5 = i;
                        }
                    }
                } else if (i3 == -1 && i4 == -1 && i2 == -1) {
                    i3 = i5 == -1 ? 0 : i;
                    z = false;
                }
            } else if (i2 == -1) {
                i2 = i + 1;
            }
            i++;
        }
        int iMin = Math.min(i2 == -1 ? Integer.MAX_VALUE : i2 - 1, strR.length());
        int iMin2 = Math.min(i4 == -1 ? Integer.MAX_VALUE : i4 - 1, iMin);
        if (i5 != -1) {
            strSubstring2 = strR.substring(0, i6);
            strSubstring = strR.substring(i5, Math.min(i3 != -1 ? i3 : Integer.MAX_VALUE, iMin2));
        } else {
            strSubstring = null;
            strSubstring2 = null;
        }
        String strSubstring3 = i3 != -1 ? strR.substring(i3, iMin2) : null;
        String strSubstring4 = i4 != -1 ? strR.substring(i4, iMin) : null;
        String strSubstring5 = i2 != -1 ? strR.substring(i2, strR.length()) : null;
        byte[] bArr = new byte[Math.max(0, Math.max(strSubstring2 != null ? strSubstring2.length() : 0, Math.max(strSubstring != null ? strSubstring.length() : 0, Math.max(strSubstring3 != null ? strSubstring3.length() : 0, Math.max(strSubstring4 != null ? strSubstring4.length() : 0, strSubstring5 != null ? strSubstring5.length() : 0)))) - 2)];
        String str3 = strSubstring4;
        String strW = strSubstring2 != null ? w(strSubstring2, bArr) : null;
        String strW2 = strSubstring != null ? w(strSubstring, bArr) : null;
        String strW3 = strSubstring3 != null ? w(strSubstring3, bArr) : null;
        if (str3 != null) {
            w(str3, bArr);
        }
        if (strSubstring5 != null) {
            w(strSubstring5, bArr);
        }
        return new aot0(strR, str2, strW, strW2, strW3);
    }

    public static int I(String str, byte[] bArr, int i, int i2) {
        int i3;
        int length;
        int i4;
        char cCharAt;
        int length2 = str.length();
        int i5 = i + i2;
        int i6 = 0;
        while (i6 < length2 && (i4 = i6 + i) < i5 && (cCharAt = str.charAt(i6)) < 128) {
            bArr[i4] = (byte) cCharAt;
            i6++;
        }
        if (i6 == length2) {
            return i + length2;
        }
        int i7 = i + i6;
        while (i6 < length2) {
            char cCharAt2 = str.charAt(i6);
            if (cCharAt2 < 128 && i7 < i5) {
                bArr[i7] = (byte) cCharAt2;
                i7++;
            } else if (cCharAt2 < 2048 && i7 <= i5 - 2) {
                int i8 = i7 + 1;
                bArr[i7] = (byte) ((cCharAt2 >>> 6) | 960);
                i7 += 2;
                bArr[i8] = (byte) ((cCharAt2 & '?') | 128);
            } else {
                if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || i7 > i5 - 3) {
                    if (i7 <= i5 - 4) {
                        i6++;
                        if (i6 != str.length()) {
                            char cCharAt3 = str.charAt(i6);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                bArr[i7] = (byte) ((codePoint >>> 18) | 240);
                                bArr[i7 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                int i9 = i7 + 3;
                                bArr[i7 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                i7 += 4;
                                bArr[i9] = (byte) ((codePoint & 63) | 128);
                            }
                        }
                        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
                        if (bytes.length - i > i2) {
                            throw new ArrayIndexOutOfBoundsException("Not enough space in output buffer to encode UTF-8 string");
                        }
                        System.arraycopy(bytes, 0, bArr, i, bytes.length);
                        length = bytes.length;
                    } else {
                        if (55296 > cCharAt2 || cCharAt2 > 57343 || ((i3 = i6 + 1) != str.length() && Character.isSurrogatePair(cCharAt2, str.charAt(i3)))) {
                            throw new ArrayIndexOutOfBoundsException("Not enough space in output buffer to encode UTF-8 string");
                        }
                        byte[] bytes2 = str.getBytes(StandardCharsets.UTF_8);
                        if (bytes2.length - i > i2) {
                            throw new ArrayIndexOutOfBoundsException("Not enough space in output buffer to encode UTF-8 string");
                        }
                        System.arraycopy(bytes2, 0, bArr, i, bytes2.length);
                        length = bytes2.length;
                    }
                    return i + length;
                }
                bArr[i7] = (byte) ((cCharAt2 >>> '\f') | Response.TEMPORARILY_UNAVAILABLE);
                int i10 = i7 + 2;
                bArr[i7 + 1] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                i7 += 3;
                bArr[i10] = (byte) ((cCharAt2 & '?') | 128);
            }
            i6++;
        }
        return i7;
    }

    public static String J(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return "";
        }
        if ((i | i2 | ((bArr.length - i) - i2)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
        }
        int i3 = i + i2;
        char[] cArr = new char[i2];
        int i4 = 0;
        while (i < i3) {
            byte b = bArr[i];
            if (b < 0) {
                break;
            }
            i++;
            cArr[i4] = (char) b;
            i4++;
        }
        while (i < i3) {
            int i5 = i + 1;
            byte b2 = bArr[i];
            if (b2 >= 0) {
                int i6 = i4 + 1;
                cArr[i4] = (char) b2;
                while (i5 < i3) {
                    byte b3 = bArr[i5];
                    if (b3 < 0) {
                        break;
                    }
                    i5++;
                    cArr[i6] = (char) b3;
                    i6++;
                }
                i4 = i6;
                i = i5;
            } else if (b2 < -32) {
                if (i5 >= i3) {
                    throw qkw0.d();
                }
                i += 2;
                byte b4 = bArr[i5];
                int i7 = i4 + 1;
                if (b2 < -62 || wpm0.s(b4)) {
                    throw qkw0.d();
                }
                cArr[i4] = (char) ((b4 & 63) | ((b2 & 31) << 6));
                i4 = i7;
            } else {
                if (b2 >= -16) {
                    if (i5 >= i3 - 2) {
                        throw qkw0.d();
                    }
                    byte b5 = bArr[i5];
                    int i8 = i + 3;
                    byte b6 = bArr[i + 2];
                    i += 4;
                    byte b7 = bArr[i8];
                    int i9 = i4 + 1;
                    if (!wpm0.s(b5)) {
                        if ((((b5 + 112) + (b2 << 28)) >> 30) == 0 && !wpm0.s(b6) && !wpm0.s(b7)) {
                            int i10 = ((b5 & 63) << 12) | ((b2 & 7) << 18) | ((b6 & 63) << 6) | (b7 & 63);
                            cArr[i4] = (char) ((i10 >>> 10) + 55232);
                            cArr[i9] = (char) ((i10 & 1023) + 56320);
                            i4 += 2;
                        }
                    }
                    throw qkw0.d();
                }
                if (i5 >= i3 - 1) {
                    throw qkw0.d();
                }
                int i11 = i + 2;
                byte b8 = bArr[i5];
                i += 3;
                byte b9 = bArr[i11];
                int i12 = i4 + 1;
                if (wpm0.s(b8) || ((b2 == -32 && b8 < -96) || ((b2 == -19 && b8 >= -96) || wpm0.s(b9)))) {
                    throw qkw0.d();
                }
                cArr[i4] = (char) (((b8 & 63) << 6) | ((b2 & 15) << 12) | (b9 & 63));
                i4 = i12;
            }
        }
        return new String(cArr, 0, i4);
    }

    public static boolean K(byte[] bArr, int i, int i2) {
        while (i < i2 && bArr[i] >= 0) {
            i++;
        }
        if (i >= i2) {
            return true;
        }
        while (i < i2) {
            int i3 = i + 1;
            byte b = bArr[i];
            if (b < 0) {
                if (b < -32) {
                    if (i3 < i2 && b >= -62) {
                        i += 2;
                        if (bArr[i3] > -65) {
                        }
                    }
                    return false;
                }
                if (b < -16) {
                    if (i3 >= i2 - 1) {
                        return false;
                    }
                    int i4 = i + 2;
                    byte b2 = bArr[i3];
                    if (b2 <= -65 && ((b != -32 || b2 >= -96) && (b != -19 || b2 < -96))) {
                        i += 3;
                        if (bArr[i4] > -65) {
                        }
                    }
                    return false;
                }
                if (i3 >= i2 - 2) {
                    return false;
                }
                int i5 = i + 2;
                byte b3 = bArr[i3];
                if (b3 <= -65) {
                    if ((((b3 + 112) + (b << 28)) >> 30) == 0) {
                        int i6 = i + 3;
                        if (bArr[i5] <= -65) {
                            i += 4;
                            if (bArr[i6] > -65) {
                            }
                        }
                    }
                }
                return false;
            }
            i = i3;
        }
        return true;
    }

    public static final void a(mdm mdmVar, Function1 function1, fet fetVar, int i) {
        mdm mdmVar2;
        fet fetVar2;
        fetVar.g0(-1620035610);
        int i2 = (fetVar.g(mdmVar) ? 4 : 2) | i | (fetVar.i(function1) ? 32 : 16);
        byte b = 0;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            boolean z = (i2 & 112) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new sbr0(function1, b);
                fetVar.o0(objP);
            }
            mdmVar2 = mdmVar;
            fetVar2 = fetVar;
            jcb.l(null, mdmVar2, false, (Function0) objP, fetVar2, (i2 << 3) & 112, 5);
        } else {
            mdmVar2 = mdmVar;
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new okp0(mdmVar2, function1, i, (byte) 5);
        }
    }

    public static final void b(int i, fet fetVar) {
        fetVar.g0(1244384079);
        if (fetVar.U(i & 1, i != 0)) {
            zgc.x(0, fetVar);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new shq0(i, (byte) 18);
        }
    }

    public static final void c(mm40 mm40Var, ugd ugdVar, fet fetVar, int i) {
        int i2;
        fetVar.g0(1305045597);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.i(ugdVar) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (objP == obj) {
                objP = m0x0.I(kotlin.coroutines.g.f46065a, fetVar);
                fetVar.o0(objP);
            }
            vne vneVar = (vne) objP;
            d9z d9zVarA = f9z.a(fetVar);
            d9z d9zVarA2 = f9z.a(fetVar);
            Object objP2 = fetVar.P();
            if (objP2 == obj) {
                objP2 = androidx.compose.runtime.e.e(Boolean.FALSE);
                fetVar.o0(objP2);
            }
            pz40 pz40Var = (pz40) objP2;
            boolean zG = fetVar.g(d9zVarA) | fetVar.i(vneVar) | fetVar.g(d9zVarA2);
            Object objP3 = fetVar.P();
            if (zG || objP3 == obj) {
                Object qzn0Var = new qzn0(d9zVarA, d9zVarA2, vneVar, pz40Var, null, (byte) 1);
                fetVar.o0(qzn0Var);
                objP3 = qzn0Var;
            }
            m0x0.t(fetVar, d9zVarA, (Function2) objP3);
            boolean zG2 = fetVar.g(d9zVarA2) | fetVar.i(vneVar) | fetVar.g(d9zVarA);
            Object objP4 = fetVar.P();
            if (zG2 || objP4 == obj) {
                Object qzn0Var2 = new qzn0(d9zVarA2, d9zVarA, vneVar, pz40Var, null, (byte) 3);
                d9zVarA = d9zVarA;
                fetVar.o0(qzn0Var2);
                objP4 = qzn0Var2;
            }
            m0x0.t(fetVar, d9zVarA2, (Function2) objP4);
            ugdVar.O(mm40Var, d9zVarA, d9zVarA2, fetVar, Integer.valueOf(((i2 << 6) & 7168) | (i2 & 14)));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new i23(mm40Var, ugdVar, i, (byte) 9);
        }
    }

    public static final void d(vne vneVar, pz40 pz40Var, d9z d9zVar, d9z d9zVar2) {
        if (((Boolean) pz40Var.getValue()).booleanValue()) {
            return;
        }
        pz40Var.setValue(Boolean.TRUE);
        qjj.W(vneVar, null, null, new rzn0(d9zVar, d9zVar2, null, (byte) 1), 3).invokeOnCompletion(new ryc0(pz40Var, (byte) 29));
    }

    public static final void e(ubr0 ubr0Var, fet fetVar, int i) {
        fetVar.g0(-2138261595);
        byte b = 4;
        int i2 = (fetVar.g(ubr0Var) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
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
            jpm0.o(fetVar, x5dVarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            nar0 nar0Var = ubr0Var.c;
            nar0 nar0Var2 = ubr0Var.d;
            boolean z = ubr0Var.b;
            if (nar0Var != null) {
                fetVar.e0(1789602664);
                iom0.b(jm40Var, z, ubr0Var.c, fetVar, 6);
                fetVar.r(false);
            } else {
                fetVar.e0(1789786215);
                fetVar.r(false);
            }
            if (nar0Var2 != null) {
                fetVar.e0(1789838698);
                zcl zclVar = qmk.f28987a;
                iom0.b(s5x0.N(jm40Var, 0.0f, 8.0f, 0.0f, 0.0f, 13), z, nar0Var2, fetVar, 0);
                fetVar.r(false);
            } else {
                fetVar.e0(1790051079);
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new p6r0(ubr0Var, i, b);
        }
    }

    public static final void f(l7m0 l7m0Var, Function1 function1, fet fetVar, int i) {
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(398196027);
        byte b = 4;
        int i2 = (fetVar.g(l7m0Var) ? 4 : 2) | i | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            f9m0 f9m0Var = new f9m0(R.string.statistic_top_players, fmm.f9790a, 0L, false, false, null, null, false, 252);
            j9m0 j9m0Var = ((xbr0) l7m0Var.getValue()).b().f30203a;
            zdm0 zdm0Var = ((xbr0) l7m0Var.getValue()).b().b;
            boolean zA = ((xbr0) l7m0Var.getValue()).a();
            boolean z = (i2 & 112) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new o0q0(function1, (byte) 29);
                fetVar.o0(objP);
            }
            ffb0.D(null, f9m0Var, zdm0Var, j9m0Var, zA, (Function0) objP, null, null, u1c.M(-339025975, new xs4(l7m0Var, function1, (byte) 14), fetVar), fetVar, 100663296, 193);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ckq0(l7m0Var, function1, i, b);
        }
    }

    public static final void g(int i, fet fetVar, mm40 mm40Var, String str) {
        String str2;
        mm40 mm40Var2;
        str.getClass();
        fetVar.g0(-553500415);
        int i2 = i | 6 | (fetVar.g(str) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            ((g1t0) fetVar.k(j1t0.e)).getClass();
            y9q0 y9q0VarT = ibm0.t(g1t0.g(), fetVar);
            long j = qmk.q;
            mm40Var2 = jm40.b;
            str2 = str;
            v8q0.a(str2, mm40Var2, 0L, new n05(qmk.p, j, idm0.s(0.25d)), 0L, null, null, null, 0L, null, 0L, 2, false, 5, 0, null, y9q0VarT, fetVar, ((i2 >> 3) & 14) | 48, 24960, 110580);
        } else {
            str2 = str;
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cgp0(mm40Var2, str2, i, (byte) 12);
        }
    }

    public static aot0 h(String str) {
        String str2 = y190.b;
        StringBuilder sbR = brm0.r("file:");
        if (str != null) {
            sbR.append(str);
        }
        return new aot0(sbR.toString(), str2, "file", null, str);
    }

    public static final void i(mm40 mm40Var, l1v0 l1v0Var, fet fetVar, int i) {
        l1v0Var.getClass();
        fetVar.g0(-268683282);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(l1v0Var) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            nw3 nw3Var = uc9.e;
            xx7 xx7Var = gqw0.n;
            x5d x5dVarA = w5d.a(nw3Var, xx7Var, fetVar, 54);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z = fetVar.S;
            pcy pcyVar = e7z.u1;
            if (z) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar, x5dVarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar3);
            jpm0.n(fetVar);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar4);
            mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(mm40VarD, 0.0f, 12.0f, 1);
            thg0 thg0VarA = shg0.a(new qw3(24.0f, true, new gne(xx7Var, (byte) 12)), gqw0.j, fetVar, 0);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarL);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            if (l1v0Var.c) {
                fetVar.e0(-1300282728);
                j(0, fetVar, null, l1v0Var.f19278a, l1v0Var.b);
                fetVar.r(false);
            } else {
                fetVar.e0(-1300127046);
                fetVar.r(false);
            }
            if (l1v0Var.e) {
                fetVar.e0(-1300082995);
                j(0, fetVar, null, Integer.valueOf(R.drawable.ic_weather_windy), l1v0Var.d);
                fetVar.r(false);
            } else {
                fetVar.e0(-1299916742);
                fetVar.r(false);
            }
            if (l1v0Var.g) {
                fetVar.e0(-1299868661);
                j(0, fetVar, null, Integer.valueOf(R.drawable.ic_weather_pressure), l1v0Var.f);
                fetVar.r(false);
            } else {
                fetVar.e0(-1299700486);
                fetVar.r(false);
            }
            if (l1v0Var.i) {
                fetVar.e0(-1299652405);
                j(0, fetVar, null, Integer.valueOf(R.drawable.ic_weather_humidity), l1v0Var.h);
                fetVar.r(false);
            } else {
                fetVar.e0(-1299484230);
                fetVar.r(false);
            }
            fetVar.r(true);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new onu0(mm40Var, l1v0Var, i, (byte) 4);
        }
    }

    public static final void j(int i, fet fetVar, mm40 mm40Var, Integer num, String str) {
        String str2;
        mm40 mm40Var2;
        Unit unit;
        fet fetVar2 = fetVar;
        fetVar2.g0(1242757006);
        int i2 = i | 6 | (fetVar2.g(num) ? 32 : 16) | (fetVar2.g(str) ? 256 : 128);
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC0 = kbc.c0(fetVar2, jm40Var);
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
            if (num == null) {
                fetVar2.e0(208839185);
                fetVar2.r(false);
                unit = null;
            } else {
                fetVar2.e0(208839186);
                pm80 pm80VarF = a8k0.F(num.intValue(), (i2 >> 3) & 14, fetVar2);
                pz40 pz40Var = s6t0.f31722a;
                long jM123getWhite0d7_KjU = StaticColors.INSTANCE.m123getWhite0d7_KjU();
                zcl zclVar = qmk.f28987a;
                dww.c(pm80VarF, null, o7k0.n(jm40Var, 20.0f), jM123getWhite0d7_KjU, fetVar2, 56, 0);
                fetVar2.r(false);
                unit = Unit.f46060a;
            }
            if (unit == null) {
                fetVar2.e0(209090441);
                zcl zclVar2 = qmk.f28987a;
                zq8.a(0, fetVar2, o7k0.n(jm40Var, 20.0f));
                fetVar2.r(false);
            } else {
                fetVar2.e0(145283877);
                fetVar2.r(false);
            }
            zcl zclVar3 = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(jm40Var, 4.0f, 0.0f, 0.0f, 0.0f, 14);
            y9q0 y9q0VarA = y9q0.a(new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045), 0L, 0L, null, null, null, 0L, null, null, 0, 1, 0L, null, null, 16711679);
            pz40 pz40Var2 = s6t0.f31722a;
            str2 = str;
            v8q0.a(str2, mm40VarN, StaticColors.INSTANCE.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, y9q0VarA, fetVar, (i2 >> 6) & 14, 0, 131064);
            fetVar2 = fetVar;
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            str2 = str;
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new i1v0(mm40Var2, num, str2, i);
        }
    }

    public static final void k(j6u0 j6u0Var, dpa0 dpa0Var) {
        l(j6u0Var, dpa0Var);
    }

    public static final void l(j6u0 j6u0Var, dpa0 dpa0Var) {
        r34 r34Var = j6u0Var.f16007a;
        i6u0 i6u0Var = (i6u0) r34Var.c;
        i6u0 i6u0Var2 = (i6u0) r34Var.b;
        boolean zJ = x2x.J(dpa0Var);
        long j = dpa0Var.b;
        if (zJ) {
            zaj[] zajVarArr = i6u0Var2.d;
            qx3.l(0, zajVarArr.length, null, zajVarArr);
            i6u0Var2.e = 0;
            zaj[] zajVarArr2 = i6u0Var.d;
            qx3.l(0, zajVarArr2.length, null, zajVarArr2);
            i6u0Var.e = 0;
            r34Var.f29768a = 0L;
        }
        if (!x2x.L(dpa0Var)) {
            List listB = dpa0Var.b();
            int size = listB.size();
            for (int i = 0; i < size; i++) {
                ayv ayvVar = (ayv) listB.get(i);
                r34Var.b(ayvVar.f1688a, ne60.f(ayvVar.e, 0L));
            }
            r34Var.b(j, ne60.f(dpa0Var.n, 0L));
        }
        if (x2x.L(dpa0Var) && j - r34Var.f29768a > 40) {
            zaj[] zajVarArr3 = i6u0Var2.d;
            qx3.l(0, zajVarArr3.length, null, zajVarArr3);
            i6u0Var2.e = 0;
            zaj[] zajVarArr4 = i6u0Var.d;
            qx3.l(0, zajVarArr4.length, null, zajVarArr4);
            i6u0Var.e = 0;
            r34Var.f29768a = 0L;
        }
        r34Var.f29768a = j;
    }

    /* JADX WARN: Code duplicated, block: B:272:0x069f  */
    /* JADX WARN: Code duplicated, block: B:339:0x07f3  */
    /* JADX WARN: Code duplicated, block: B:346:0x080b  */
    /* JADX WARN: Code duplicated, block: B:415:0x06a2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:418:0x080e A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v21, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v26 */
    /* JADX WARN: Type inference failed for: r10v53 */
    /* JADX WARN: Type inference failed for: r12v29, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r9v63, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r9v90 */
    /* JADX WARN: Type inference failed for: r9v93 */
    public static final r5s0 m(yih yihVar, qlh qlhVar, Map map, Map map2, ctf0 ctf0Var, boolean z) throws Throwable {
        Object next;
        Throwable th;
        int i;
        ArrayList arrayList;
        boolean z2;
        int i2;
        int iM;
        String str;
        Iterator it;
        ArrayList arrayList2;
        LinkedHashMap linkedHashMap;
        ArrayList arrayListX;
        boolean z3;
        LinkedHashMap linkedHashMap2;
        boolean z4;
        twr0 twr0Var;
        String str2;
        zjh zjhVar;
        String str3;
        Integer numV;
        Iterator it2;
        String str4;
        twr0 twr0Var2;
        String str5;
        Object twr0Var3;
        Iterator it3;
        String str6;
        rwr0 rwr0Var;
        float f;
        int size;
        ArrayList arrayList3;
        List list;
        qlh qlhVar2 = qlhVar;
        boolean z5 = z;
        map.getClass();
        map2.getClass();
        ctf0Var.getClass();
        List list2 = yihVar.b;
        ArrayList arrayList4 = new ArrayList();
        for (Object obj : list2) {
            if (!((glh) obj).b) {
                arrayList4.add(obj);
            }
        }
        Iterator it4 = list2.iterator();
        do {
            if (!it4.hasNext()) {
                next = null;
                break;
            }
            next = it4.next();
        } while (!((glh) next).b);
        glh glhVar = (glh) next;
        zjh zjhVar2 = (glhVar == null || (list = glhVar.d) == null) ? null : (zjh) CollectionsKt.firstOrNull(list);
        ArrayList<List> arrayList5 = new ArrayList(r3d.q(arrayList4, 10));
        Iterator it5 = arrayList4.iterator();
        while (it5.hasNext()) {
            arrayList5.add(((glh) it5.next()).d);
        }
        Iterator it6 = arrayList5.iterator();
        int i3 = 0;
        while (true) {
            if (!it6.hasNext()) {
                i3 = -1;
                break;
            }
            if (!((List) it6.next()).isEmpty()) {
                break;
            }
            i3++;
        }
        boolean z6 = true;
        if (i3 == -1) {
            arrayList = new ArrayList(r3d.q(arrayList5, 10));
            for (List list3 : arrayList5) {
                lun lunVar = lun.f20680a;
                lunVar.getClass();
                arrayList.add(lunVar);
            }
            th = null;
            i = 2;
        } else {
            ArrayList arrayList6 = new ArrayList(arrayList5.size());
            for (int i4 = 0; i4 < i3; i4++) {
                lun lunVar2 = lun.f20680a;
                lunVar2.getClass();
                arrayList6.add(lunVar2);
            }
            th = null;
            List list4 = (List) arrayList5.get(i3);
            HashMap map3 = new HashMap(list4.size());
            int i5 = 0;
            for (Object obj2 : list4) {
                int i6 = i5 + 1;
                if (i5 < 0) {
                    q3d.p();
                    throw null;
                }
                map3.put(((zjh) obj2).f44481a, Integer.valueOf((i5 * 2) + 1));
                i5 = i6;
            }
            i = 2;
            arrayList6.add(map3);
            int i7 = i3 + 1;
            int size2 = arrayList5.size();
            while (i7 < size2) {
                int i8 = i7 - 1;
                Object obj3 = arrayList6.get(i8);
                obj3.getClass();
                Map map4 = (Map) obj3;
                if (StringsKt.W(((glh) arrayList4.get(i7)).f11490a)) {
                    arrayList6.add(map4);
                    i2 = size2;
                    z2 = z6;
                } else {
                    List list5 = (List) arrayList5.get(i8);
                    List list6 = (List) arrayList5.get(i7);
                    z2 = z6;
                    boolean z7 = list5.size() == list6.size() ? z2 : false;
                    HashMap map5 = new HashMap(list6.size());
                    Iterator it7 = list6.iterator();
                    int i9 = 0;
                    while (it7.hasNext()) {
                        Object next2 = it7.next();
                        int i10 = i9 + 1;
                        if (i9 < 0) {
                            q3d.p();
                            throw null;
                        }
                        int i11 = size2;
                        zjh zjhVar3 = (zjh) next2;
                        Iterator it8 = it7;
                        Integer numO = ipm0.o(zjhVar3.f, map4, map);
                        Integer numO2 = ipm0.o(zjhVar3.g, map4, map);
                        String str7 = zjhVar3.f44481a;
                        if (numO != null && numO2 != null) {
                            iM = (Math.max(numO.intValue(), numO2.intValue()) + Math.min(numO.intValue(), numO2.intValue())) / 2;
                        } else if (numO != null) {
                            iM = numO.intValue();
                        } else if (numO2 != null) {
                            iM = numO2.intValue();
                        } else if (z7) {
                            zjh zjhVar4 = (zjh) CollectionsKt.W(i9, list5);
                            Integer numO3 = ipm0.o(zjhVar4 != null ? zjhVar4.f44481a : null, map4, map);
                            iM = numO3 != null ? numO3.intValue() : knm0.m(map5, map4);
                        } else {
                            iM = knm0.m(map5, map4);
                        }
                        map5.put(str7, Integer.valueOf(iM));
                        it7 = it8;
                        i9 = i10;
                        size2 = i11;
                    }
                    i2 = size2;
                    arrayList6.add(map5);
                }
                i7++;
                z6 = z2;
                size2 = i2;
            }
            arrayList = arrayList6;
        }
        boolean z8 = z6;
        String str8 = qlhVar2.f28933a;
        ArrayList arrayList7 = new ArrayList(r3d.q(arrayList4, 10));
        Iterator it9 = arrayList4.iterator();
        int i12 = 0;
        while (it9.hasNext()) {
            Object next3 = it9.next();
            int i13 = i12 + 1;
            if (i12 < 0) {
                q3d.p();
                throw th;
            }
            glh glhVar2 = (glh) next3;
            if (StringsKt.W(glhVar2.f11490a)) {
                int size3 = arrayList4.size();
                int i14 = i13;
                while (true) {
                    if (i14 >= size3) {
                        it3 = it9;
                        f = 2.0f;
                        i14 = -1;
                        break;
                    }
                    f = 2.0f;
                    glh glhVar3 = (glh) CollectionsKt.W(i14, arrayList4);
                    if (glhVar3 != null) {
                        it3 = it9;
                        if ((!StringsKt.W(glhVar3.f11490a)) == z8) {
                            break;
                        }
                    } else {
                        it3 = it9;
                    }
                    i14++;
                    it9 = it3;
                    z8 = true;
                }
                ?? ValueOf = Integer.valueOf(i14);
                if (i14 == -1) {
                    ValueOf = th;
                }
                if (ValueOf != 0) {
                    size = ValueOf.intValue();
                } else {
                    size = arrayList4.size() - 1;
                    if (i13 <= size) {
                        size = i13;
                    }
                }
                Map map6 = (Map) CollectionsKt.W(size, arrayList);
                if (map6 == null) {
                    map6 = lun.f20680a;
                    map6.getClass();
                }
                Iterable iterable = (List) CollectionsKt.W(size, arrayList5);
                if (iterable == null) {
                    iterable = iun.f15405a;
                }
                List listA0 = CollectionsKt.A0(iterable, new swr0(map6, (byte) 1));
                if (ipm0.n(i12, arrayList4, z5)) {
                    arrayList3 = new ArrayList();
                    int i15 = 0;
                    for (Iterator it10 = listA0.iterator(); it10.hasNext(); it10 = it10) {
                        Integer num = (Integer) map6.get(((zjh) it10.next()).f44481a);
                        if (num != null) {
                            int iIntValue = (num.intValue() - 1) - i15;
                            if (iIntValue > 0) {
                                arrayList3.add(new fxr0(iIntValue * kxr0.f19071a));
                                i15 += iIntValue;
                            }
                            arrayList3.add(new fxr0(kxr0.f19071a * f));
                            i15 += 2;
                        }
                    }
                } else {
                    arrayList3 = new ArrayList();
                    Iterator it11 = listA0.iterator();
                    int i16 = 0;
                    while (it11.hasNext()) {
                        zjh zjhVar5 = (zjh) it11.next();
                        Iterator it12 = it11;
                        Integer num2 = (Integer) map6.get(zjhVar5.f44481a);
                        if (num2 != null) {
                            int iIntValue2 = (num2.intValue() - 1) - i16;
                            if (iIntValue2 > 0) {
                                arrayList3.add(new fxr0(iIntValue2 * kxr0.f19071a));
                                i16 += iIntValue2;
                            }
                            vwr0 vwr0Var = new vwr0(str8 != null && ipm0.g(zjhVar5, str8));
                            int i17 = i;
                            arrayList3.add(new xwr0(vwr0Var, i17));
                            i16 += i17;
                        }
                        it11 = it12;
                        map6 = map6;
                        i = 2;
                    }
                }
                rwr0Var = new rwr0(pr8.b, dyb.r0(arrayList3));
                str6 = str8;
            } else {
                it3 = it9;
                Map map7 = (Map) CollectionsKt.W(i12, arrayList);
                if (map7 == null) {
                    map7 = lun.f20680a;
                    map7.getClass();
                }
                List listA1 = CollectionsKt.A0((Iterable) arrayList5.get(i12), new swr0(map7, (byte) 2));
                boolean z9 = glhVar2.b;
                boolean z10 = glhVar2.c;
                ArrayList arrayList8 = new ArrayList();
                Iterator it13 = listA1.iterator();
                int i18 = 0;
                while (it13.hasNext()) {
                    Iterator it14 = it13;
                    zjh zjhVar6 = (zjh) it13.next();
                    Integer num3 = (Integer) map7.get(zjhVar6.f44481a);
                    if (num3 != null) {
                        int iIntValue3 = (num3.intValue() - 1) - i18;
                        if (iIntValue3 > 0) {
                            arrayList8.add(new fxr0(iIntValue3 * kxr0.f19071a));
                            i18 += iIntValue3;
                        }
                        arrayList8.add(gnm0.z(zjhVar6, qlhVar2, z10, z9, ctf0Var));
                        i18 += 2;
                    } else {
                        str8 = str8;
                        map7 = map7;
                    }
                    map7 = map7;
                    it13 = it14;
                    str8 = str8;
                }
                str6 = str8;
                ArrayList arrayList9 = new ArrayList(arrayList8);
                if (i12 == arrayList4.size() - 1 && zjhVar2 != null) {
                    arrayList9.add(gnm0.z(zjhVar2, qlhVar2, false, true, ctf0Var));
                }
                rwr0Var = new rwr0(pr8.b, dyb.r0(arrayList9));
            }
            arrayList7.add(rwr0Var);
            it9 = it3;
            i12 = i13;
            str8 = str6;
            z8 = true;
            i = 2;
        }
        String str9 = str8;
        ArrayList arrayList10 = new ArrayList();
        for (Object obj4 : arrayList4) {
            if (!((glh) obj4).b) {
                arrayList10.add(obj4);
            }
        }
        ArrayList arrayList11 = new ArrayList();
        Iterator it15 = arrayList10.iterator();
        while (it15.hasNext()) {
            w3d.u(arrayList11, ((glh) it15.next()).d);
        }
        int iA = wp20.a(r3d.q(arrayList11, 10));
        if (iA < 16) {
            iA = 16;
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(iA);
        for (Object obj5 : arrayList11) {
            linkedHashMap3.put(((zjh) obj5).f44481a, obj5);
        }
        LinkedHashMap linkedHashMapJ = xp20.j(linkedHashMap3, map2);
        IntRange intRangeO = l1e0.o(0, arrayList4.size() - 1);
        ArrayList arrayList12 = new ArrayList(r3d.q(intRangeO, 10));
        Iterator it16 = intRangeO.iterator();
        while (((kkx) it16).c) {
            int iNextInt = ((bkx) it16).nextInt();
            glh glhVar4 = (glh) arrayList4.get(iNextInt);
            int i19 = iNextInt + 1;
            List list7 = (List) arrayList5.get(iNextInt);
            List<zjh> list8 = (List) arrayList5.get(i19);
            Map map8 = (Map) arrayList.get(iNextInt);
            Map map9 = (Map) arrayList.get(i19);
            boolean zW = StringsKt.W(glhVar4.f11490a);
            glh glhVar5 = (glh) CollectionsKt.W(i19, arrayList4);
            boolean z11 = glhVar5 != null && StringsKt.W(glhVar5.f11490a);
            if (ipm0.n(iNextInt, arrayList4, z5)) {
                List listA2 = CollectionsKt.A0(list8, new swr0(map9, (byte) 0));
                arrayListX = new ArrayList();
                Iterator it17 = listA2.iterator();
                int i20 = 0;
                while (it17.hasNext()) {
                    Integer num4 = (Integer) map9.get(((zjh) it17.next()).f44481a);
                    if (num4 != null) {
                        int iIntValue4 = (num4.intValue() - 1) - i20;
                        if (iIntValue4 > 0) {
                            arrayListX.add(new fxr0(iIntValue4 * kxr0.f19071a));
                            i20 += iIntValue4;
                        }
                        arrayListX.add(new fxr0(2.0f * kxr0.f19071a));
                        i20 += 2;
                    }
                }
                it = it16;
                arrayList2 = arrayList4;
                str = str9;
            } else if (zW) {
                list8.getClass();
                map9.getClass();
                ArrayList arrayList13 = new ArrayList();
                for (zjh zjhVar7 : list8) {
                    Integer num5 = (Integer) map9.get(zjhVar7.f44481a);
                    if (num5 != null) {
                        int iIntValue5 = num5.intValue() - 1;
                        if (iIntValue5 < 0) {
                            iIntValue5 = 0;
                        }
                        str5 = str9;
                        twr0Var3 = new twr0(iIntValue5, 2, new vwr0(str9 != null && ipm0.g(zjhVar7, str5)));
                    } else {
                        str5 = str9;
                        twr0Var3 = th;
                    }
                    if (twr0Var3 != null) {
                        arrayList13.add(twr0Var3);
                    }
                    str9 = str5;
                }
                str = str9;
                arrayListX = ohm0.x(arrayList13);
                it = it16;
                arrayList2 = arrayList4;
            } else {
                str = str9;
                if (z11) {
                    String str10 = qlhVar2.f28933a;
                    list7.getClass();
                    map8.getClass();
                    int i21 = 2;
                    ArrayList<List> arrayListQ0 = CollectionsKt.Q0(list7, 2, 2);
                    ArrayList arrayList14 = new ArrayList();
                    for (List list9 : arrayListQ0) {
                        int size4 = list9.size();
                        ?? r10 = list9;
                        if (size4 != i21) {
                            r10 = th;
                        }
                        if (r10 != 0) {
                            zjh zjhVar8 = (zjh) r10.get(0);
                            zjh zjhVar9 = (zjh) r10.get(1);
                            Integer num6 = (Integer) map8.get(zjhVar8.f44481a);
                            it2 = it16;
                            Integer num7 = (Integer) map8.get(zjhVar9.f44481a);
                            if (num6 != null && num7 != null) {
                                int iMin = Math.min(num6.intValue(), num7.intValue());
                                int iMax = Math.max(num6.intValue(), num7.intValue());
                                str4 = str10;
                                qt8 qt8VarI = ihm0.i(str4, (str10 == null || ipm0.g(zjhVar8, str10) || !ipm0.g(zjhVar9, str10)) ? zjhVar8 : zjhVar9, zjhVar8.f44481a, zjhVar9.f44481a, num6.intValue(), num7.intValue(), linkedHashMapJ);
                                int i22 = iMax - iMin;
                                if (i22 < 1) {
                                    i22 = 1;
                                }
                                twr0Var2 = new twr0(iMin, i22, new uwr0(qt8VarI, th));
                            }
                            if (twr0Var2 != null) {
                                arrayList14.add(twr0Var2);
                            }
                            it16 = it2;
                            arrayList4 = arrayList4;
                            str10 = str4;
                            th = null;
                            i21 = 2;
                        } else {
                            it2 = it16;
                        }
                        str4 = str10;
                        twr0Var2 = null;
                        if (twr0Var2 != null) {
                            arrayList14.add(twr0Var2);
                        }
                        it16 = it2;
                        arrayList4 = arrayList4;
                        str10 = str4;
                        th = null;
                        i21 = 2;
                    }
                    it = it16;
                    arrayList2 = arrayList4;
                    arrayListX = ohm0.x(arrayList14);
                } else {
                    it = it16;
                    arrayList2 = arrayList4;
                    boolean z12 = list7.size() == list8.size();
                    map9.getClass();
                    map8.getClass();
                    ArrayList arrayList15 = new ArrayList();
                    Iterator it18 = list8.iterator();
                    int i23 = 0;
                    while (it18.hasNext()) {
                        Object next4 = it18.next();
                        int i24 = i23 + 1;
                        if (i23 < 0) {
                            q3d.p();
                            throw null;
                        }
                        zjh zjhVar10 = (zjh) next4;
                        String str11 = zjhVar10.f;
                        Iterator it19 = it18;
                        String str12 = zjhVar10.g;
                        if (StringsKt.W(str11)) {
                            str11 = null;
                        }
                        String str13 = !StringsKt.W(str12) ? str12 : null;
                        ArrayList arrayList16 = arrayList7;
                        Integer numV2 = h8x.v(str11, map8, map);
                        Integer numV3 = h8x.v(str13, map8, map);
                        if (str11 == null || str13 == null || numV2 == null || numV3 == null) {
                            z3 = z12;
                            linkedHashMap2 = linkedHashMapJ;
                            Pair pairQ = h8x.Q(zjhVar10.f, map8, map);
                            if (pairQ == null) {
                                pairQ = h8x.Q(str12, map8, map);
                            }
                            if (pairQ == null) {
                                pairQ = (!z3 || (zjhVar = (zjh) CollectionsKt.W(i23, list7)) == null || (numV = h8x.v((str3 = zjhVar.f44481a), map8, map)) == null) ? null : new Pair(str3, Integer.valueOf(numV.intValue()));
                            }
                            if (pairQ == null) {
                                twr0Var = null;
                            } else {
                                String str14 = (String) pairQ.f46059a;
                                int iIntValue6 = ((Number) pairQ.b).intValue();
                                zjh zjhVar11 = (zjh) linkedHashMap2.get(str14);
                                if (str == null || zjhVar11 == null || !ipm0.g(zjhVar10, str)) {
                                    z4 = false;
                                } else {
                                    mkh mkhVar = zjhVar11.d;
                                    if (mkhVar.e) {
                                        str2 = mkhVar.b;
                                    } else {
                                        mkh mkhVar2 = zjhVar11.e;
                                        str2 = mkhVar2.e ? mkhVar2.b : null;
                                    }
                                    if (Intrinsics.d(str2, str) || (str2 == null && ipm0.g(zjhVar11, str))) {
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                }
                                int i25 = iIntValue6 - 1;
                                if (i25 < 0) {
                                    i25 = 0;
                                }
                                twr0Var = new twr0(i25, 2, new vwr0(z4));
                            }
                            if (twr0Var != null) {
                                arrayList15.add(twr0Var);
                            }
                            qlhVar2 = qlhVar;
                            it18 = it19;
                            linkedHashMapJ = linkedHashMap2;
                            i23 = i24;
                            arrayList7 = arrayList16;
                            z12 = z3;
                        } else {
                            int iMin2 = Math.min(numV2.intValue(), numV3.intValue());
                            String str15 = str13;
                            int iMax2 = Math.max(numV2.intValue(), numV3.intValue()) - iMin2;
                            if (iMax2 < 1) {
                                iMax2 = 1;
                            }
                            Integer num8 = (Integer) map9.get(zjhVar10.f44481a);
                            Integer numValueOf = num8 != null ? Integer.valueOf(l1e0.d(num8.intValue() - iMin2, 0, iMax2)) : null;
                            qt8 qt8VarI2 = ihm0.i(qlhVar2.f28933a, zjhVar10, str11, str15, numV2.intValue(), numV3.intValue(), linkedHashMapJ);
                            linkedHashMap2 = linkedHashMapJ;
                            z3 = z12;
                            twr0Var = new twr0(iMin2, iMax2, new uwr0(qt8VarI2, numValueOf));
                        }
                        if (twr0Var != null) {
                            arrayList15.add(twr0Var);
                        }
                        qlhVar2 = qlhVar;
                        it18 = it19;
                        linkedHashMapJ = linkedHashMap2;
                        i23 = i24;
                        arrayList7 = arrayList16;
                        z12 = z3;
                    }
                    arrayList7 = arrayList7;
                    linkedHashMap = linkedHashMapJ;
                    arrayListX = ohm0.x(CollectionsKt.A0(arrayList15, new mjf0((byte) 2)));
                }
                arrayList12.add(new rwr0(pr8.c, dyb.r0(arrayListX)));
                qlhVar2 = qlhVar;
                it16 = it;
                z5 = z;
                linkedHashMapJ = linkedHashMap;
                str9 = str;
                arrayList4 = arrayList2;
                arrayList7 = arrayList7;
                th = null;
            }
            linkedHashMap = linkedHashMapJ;
            arrayList12.add(new rwr0(pr8.c, dyb.r0(arrayListX)));
            qlhVar2 = qlhVar;
            it16 = it;
            z5 = z;
            linkedHashMapJ = linkedHashMap;
            str9 = str;
            arrayList4 = arrayList2;
            arrayList7 = arrayList7;
            th = null;
        }
        lc00 lc00VarB = kotlin.collections.a.b();
        int i26 = 0;
        for (Object obj6 : arrayList7) {
            int i27 = i26 + 1;
            if (i26 < 0) {
                q3d.p();
                throw null;
            }
            lc00VarB.add((rwr0) obj6);
            if (i26 < arrayList12.size()) {
                lc00VarB.add(arrayList12.get(i26));
            }
            i26 = i27;
        }
        return new r5s0(arrayList5, arrayList, dyb.r0(kotlin.collections.a.a(lc00VarB)));
    }

    public static final LinkedHashSet n(byte[] bArr) throws IOException {
        bArr.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (bArr.length == 0) {
            return linkedHashSet;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            try {
                ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                try {
                    int i = objectInputStream.readInt();
                    for (int i2 = 0; i2 < i; i2++) {
                        Uri uri = Uri.parse(objectInputStream.readUTF());
                        boolean z = objectInputStream.readBoolean();
                        uri.getClass();
                        linkedHashSet.add(new m4e(z, uri));
                    }
                    objectInputStream.close();
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        bkb.E(objectInputStream, th);
                        throw th2;
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            byteArrayInputStream.close();
            return linkedHashSet;
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                bkb.E(byteArrayInputStream, th3);
                throw th4;
            }
        }
    }

    public static final float o(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        float f = 0.0f;
        for (int i = 0; i < length; i++) {
            f += fArr[i] * fArr2[i];
        }
        return f;
    }

    public static final String p(aot0 aot0Var) {
        List listQ = q(aot0Var);
        String str = aot0Var.b;
        if (listQ.isEmpty()) {
            return null;
        }
        String str2 = aot0Var.e;
        str2.getClass();
        if (!kotlin.text.c.x(str2, str, false)) {
            str = "";
        }
        return CollectionsKt.b0(listQ, aot0Var.b, str, null, null, 60);
    }

    public static final List q(aot0 aot0Var) {
        String str = aot0Var.e;
        if (str == null) {
            return iun.f15405a;
        }
        ArrayList arrayList = new ArrayList();
        int i = -1;
        while (i < str.length()) {
            int i2 = i + 1;
            int iU = StringsKt.U('/', i2, 4, str);
            if (iU == -1) {
                iU = str.length();
            }
            String strSubstring = str.substring(i2, iU);
            if (strSubstring.length() > 0) {
                arrayList.add(strSubstring);
            }
            i = iU;
        }
        return arrayList;
    }

    public static final vhq0 r(int i, ArrayList arrayList) {
        arrayList.getClass();
        if (arrayList.size() != 2) {
            return vhq0.d;
        }
        if (i == 0) {
            return vhq0.c;
        }
        if (i == 1) {
            return vhq0.d;
        }
        throw new ss3();
    }

    public static final af5 s(int i) {
        if (i == 0) {
            return af5.f761a;
        }
        if (i == 1) {
            return af5.b;
        }
        jf4.o(ua80.e(i, "Could not convert ", " to BackoffPolicy"));
        return null;
    }

    public static final sl50 t(int i) {
        if (i == 0) {
            return sl50.f32381a;
        }
        if (i == 1) {
            return sl50.b;
        }
        if (i == 2) {
            return sl50.c;
        }
        if (i == 3) {
            return sl50.d;
        }
        if (i == 4) {
            return sl50.e;
        }
        if (Build.VERSION.SDK_INT >= 30 && i == 5) {
            return sl50.f;
        }
        jf4.o(ua80.e(i, "Could not convert ", " to NetworkType"));
        return null;
    }

    public static final od80 u(int i) {
        if (i == 0) {
            return od80.f25065a;
        }
        if (i == 1) {
            return od80.b;
        }
        jf4.o(ua80.e(i, "Could not convert ", " to OutOfQuotaPolicy"));
        return null;
    }

    public static final zov0 v(int i) {
        if (i == 0) {
            return zov0.f44733a;
        }
        if (i == 1) {
            return zov0.b;
        }
        if (i == 2) {
            return zov0.c;
        }
        if (i == 3) {
            return zov0.d;
        }
        if (i == 4) {
            return zov0.e;
        }
        if (i == 5) {
            return zov0.f;
        }
        jf4.o(ua80.e(i, "Could not convert ", " to State"));
        return null;
    }

    public static final String w(String str, byte[] bArr) {
        int length = str.length();
        int iMax = Math.max(0, length - 2);
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= iMax) {
                if (i == i2) {
                    return str;
                }
                if (i >= length) {
                    x2 x2Var = b3.f1878a;
                    int length2 = bArr.length;
                    x2Var.getClass();
                    x2.a(0, i2, length2);
                    return new String(bArr, 0, i2, Charsets.UTF_8);
                }
            } else if (str.charAt(i) == '%') {
                int i3 = i + 3;
                try {
                    bArr[i2] = (byte) Integer.parseInt(str.substring(i + 1, i3), CharsKt.checkRadix(16));
                    i2++;
                    i = i3;
                } catch (NumberFormatException unused) {
                    bArr[i2] = (byte) str.charAt(i);
                    i2++;
                    i++;
                }
            }
            bArr[i2] = (byte) str.charAt(i);
            i2++;
            i++;
        }
    }

    public static final void x(float[] fArr, float[] fArr2, int i, float[] fArr3) {
        if (i == 0) {
            xcx.a("At least one point must be provided");
        }
        int i2 = 2 >= i ? i - 1 : 2;
        int i3 = i2 + 1;
        float[][] fArr4 = new float[i3][];
        for (int i4 = 0; i4 < i3; i4++) {
            fArr4[i4] = new float[i];
        }
        for (int i5 = 0; i5 < i; i5++) {
            fArr4[0][i5] = 1.0f;
            for (int i6 = 1; i6 < i3; i6++) {
                fArr4[i6][i5] = fArr4[i6 - 1][i5] * fArr[i5];
            }
        }
        float[][] fArr5 = new float[i3][];
        for (int i7 = 0; i7 < i3; i7++) {
            fArr5[i7] = new float[i];
        }
        float[][] fArr6 = new float[i3][];
        for (int i8 = 0; i8 < i3; i8++) {
            fArr6[i8] = new float[i3];
        }
        int i9 = 0;
        while (i9 < i3) {
            float[] fArr7 = fArr5[i9];
            float[] fArr8 = fArr4[i9];
            fArr8.getClass();
            fArr7.getClass();
            System.arraycopy(fArr8, 0, fArr7, 0, i);
            for (int i10 = 0; i10 < i9; i10++) {
                float[] fArr9 = fArr5[i10];
                float fO = o(fArr7, fArr9);
                for (int i11 = 0; i11 < i; i11++) {
                    fArr7[i11] = fArr7[i11] - (fArr9[i11] * fO);
                }
            }
            float fSqrt = (float) Math.sqrt(o(fArr7, fArr7));
            if (fSqrt < 1.0E-6f) {
                fSqrt = 1.0E-6f;
            }
            float f = 1.0f / fSqrt;
            for (int i12 = 0; i12 < i; i12++) {
                fArr7[i12] = fArr7[i12] * f;
            }
            float[] fArr10 = fArr6[i9];
            int i13 = 0;
            while (i13 < i3) {
                fArr10[i13] = i13 < i9 ? 0.0f : o(fArr7, fArr4[i13]);
                i13++;
            }
            i9++;
        }
        for (int i14 = i2; -1 < i14; i14--) {
            float fO2 = o(fArr5[i14], fArr2);
            float[] fArr11 = fArr6[i14];
            int i15 = i14 + 1;
            if (i15 <= i2) {
                int i16 = i2;
                while (true) {
                    fO2 -= fArr11[i16] * fArr3[i16];
                    if (i16 != i15) {
                        i16--;
                    }
                }
            }
            fArr3[i14] = fO2 / fArr11[i14];
        }
    }

    public static void y(Status status, Object obj, TaskCompletionSource taskCompletionSource) {
        if (status.m()) {
            taskCompletionSource.setResult(obj);
        } else {
            taskCompletionSource.setException(status.c != null ? new lsf0(status) : new qa3(status));
        }
    }

    public static final int z(zov0 zov0Var) {
        zov0Var.getClass();
        int iOrdinal = zov0Var.ordinal();
        if (iOrdinal == 0) {
            return 0;
        }
        int i = 1;
        if (iOrdinal != 1) {
            i = 2;
            if (iOrdinal != 2) {
                i = 3;
                if (iOrdinal != 3) {
                    i = 4;
                    if (iOrdinal != 4) {
                        if (iOrdinal == 5) {
                            return 5;
                        }
                        t9f.b();
                        return 0;
                    }
                }
            }
        }
        return i;
    }
}
