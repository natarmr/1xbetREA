package a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.gov.nist.core.Separators;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.util.Log;
import android.util.TypedValue;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import org.json.JSONObject;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.IndividualColors;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes4.dex */
public abstract class afn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static long f787a;
    public static Method b;
    public static Method c;
    public static Method d;
    public static Method e;

    /* JADX WARN: Code duplicated, block: B:78:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:81:0x0100  */
    /* JADX WARN: Code duplicated, block: B:84:0x010a  */
    /* JADX WARN: Code duplicated, block: B:87:0x0110  */
    /* JADX WARN: Code duplicated, block: B:90:0x0115  */
    public static final y9q0 A(y9q0 y9q0Var, k6z k6zVar) {
        long j;
        g8q0 g8q0Var;
        int i;
        int i2;
        i9q0 i9q0Var;
        smk0 smk0Var = y9q0Var.f42262a;
        e8q0 e8q0Var = tmk0.d;
        e8q0 e8q0Var2 = smk0Var.f32451a;
        if (e8q0Var2.equals(pek0.d)) {
            e8q0Var2 = tmk0.d;
        }
        e8q0 e8q0Var3 = e8q0Var2;
        long j2 = smk0Var.b;
        eaq0[] eaq0VarArr = daq0.b;
        if ((j2 & 1095216660480L) == 0) {
            j2 = tmk0.f34198a;
        }
        long j3 = j2;
        psq psqVar = smk0Var.c;
        if (psqVar == null) {
            psqVar = psq.e;
        }
        psq psqVar2 = psqVar;
        lsq lsqVar = smk0Var.d;
        lsq lsqVar2 = new lsq(lsqVar != null ? lsqVar.f20592a : 0);
        msq msqVar = smk0Var.e;
        msq msqVar2 = new msq(msqVar != null ? msqVar.f22332a : 65535);
        nrq nrqVar = smk0Var.f;
        if (nrqVar == null) {
            nrqVar = nrq.f24016a;
        }
        nrq nrqVar2 = nrqVar;
        String str = smk0Var.g;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        long j4 = smk0Var.h;
        if ((j4 & 1095216660480L) == 0) {
            j4 = tmk0.b;
        }
        long j5 = j4;
        j56 j56Var = smk0Var.i;
        float f = j56Var != null ? j56Var.f15918a : 0.0f;
        j56 j56Var2 = new j56(Float.isNaN(f) ? 0.0f : f);
        f8q0 f8q0Var = smk0Var.j;
        if (f8q0Var == null) {
            f8q0Var = f8q0.c;
        }
        f8q0 f8q0Var2 = f8q0Var;
        rs00 rs00VarU = smk0Var.k;
        if (rs00VarU == null) {
            rs00 rs00Var = rs00.c;
            rs00VarU = wv90.f39830a.u();
        }
        rs00 rs00Var2 = rs00VarU;
        long j6 = smk0Var.l;
        if (j6 == 16) {
            j6 = tmk0.c;
        }
        long j7 = j6;
        k5q0 k5q0Var = smk0Var.m;
        if (k5q0Var == null) {
            k5q0Var = k5q0.b;
        }
        k5q0 k5q0Var2 = k5q0Var;
        ljj0 ljj0Var = smk0Var.n;
        if (ljj0Var == null) {
            ljj0Var = ljj0.d;
        }
        ljj0 ljj0Var2 = ljj0Var;
        agc agcVar = smk0Var.o;
        if (agcVar == null) {
            agcVar = l0q.f19214a;
        }
        smk0 smk0Var2 = new smk0(e8q0Var3, j3, psqVar2, lsqVar2, msqVar2, nrqVar2, str2, j5, j56Var2, f8q0Var2, rs00Var2, j7, k5q0Var2, ljj0Var2, agcVar);
        eo80 eo80Var = y9q0Var.b;
        int i3 = fo80.b;
        int i4 = eo80Var.f8127a;
        int i5 = 5;
        if (i4 == 0) {
            i4 = 5;
        }
        int i6 = eo80Var.b;
        if (i6 != 3) {
            if (i6 == 0) {
                int iOrdinal = k6zVar.ordinal();
                if (iOrdinal == 0) {
                    i6 = 1;
                } else {
                    if (iOrdinal != 1) {
                        t9f.b();
                        return null;
                    }
                    i5 = 2;
                }
            }
            j = eo80Var.c;
            if ((j & 1095216660480L) == 0) {
                j = fo80.f9870a;
            }
            g8q0Var = eo80Var.d;
            if (g8q0Var == null) {
                g8q0Var = g8q0.c;
            }
            ew90 ew90Var = eo80Var.e;
            m600 m600Var = eo80Var.f;
            i = eo80Var.g;
            if (i == 0) {
                i = p500.b;
            }
            i2 = eo80Var.h;
            if (i2 == 0) {
                i2 = 1;
            }
            i9q0Var = eo80Var.i;
            if (i9q0Var == null) {
                i9q0Var = i9q0.c;
            }
            return new y9q0(smk0Var2, new eo80(i4, i6, j, g8q0Var, ew90Var, m600Var, i, i2, i9q0Var), y9q0Var.c);
        }
        int iOrdinal2 = k6zVar.ordinal();
        if (iOrdinal2 == 0) {
            i5 = 4;
        } else if (iOrdinal2 != 1) {
            t9f.b();
            return null;
        }
        i6 = i5;
        j = eo80Var.c;
        if ((j & 1095216660480L) == 0) {
            j = fo80.f9870a;
        }
        g8q0Var = eo80Var.d;
        if (g8q0Var == null) {
            g8q0Var = g8q0.c;
        }
        ew90 ew90Var2 = eo80Var.e;
        m600 m600Var2 = eo80Var.f;
        i = eo80Var.g;
        if (i == 0) {
            i = p500.b;
        }
        i2 = eo80Var.h;
        if (i2 == 0) {
            i2 = 1;
        }
        i9q0Var = eo80Var.i;
        if (i9q0Var == null) {
            i9q0Var = i9q0.c;
        }
        return new y9q0(smk0Var2, new eo80(i4, i6, j, g8q0Var, ew90Var2, m600Var2, i, i2, i9q0Var), y9q0Var.c);
    }

    public static final zen0 B(faa0 faa0Var) {
        faa0Var.getClass();
        String str = faa0Var.f9199a;
        if (str == null) {
            str = "";
        }
        String str2 = faa0Var.b;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = faa0Var.c;
        if (str3 == null) {
            str3 = "";
        }
        String str4 = faa0Var.f;
        String str5 = str4 != null ? str4 : "";
        List list = faa0Var.h;
        return new zen0(str, str2, str3, str5, !(list == null || list.isEmpty()), l8x.A0(faa0Var));
    }

    public static final pgv0 C(e4f e4fVar, ctf0 ctf0Var, String str) {
        ctf0Var.getClass();
        int iOrdinal = e4fVar.ordinal();
        if (iOrdinal == 2) {
            String strF = ctf0Var.f(R.string.win_back_lose_title, new Object[0]);
            String strF2 = ctf0Var.f(R.string.win_back_lose_description, new Object[0]);
            StringBuilder sb = new StringBuilder(ujn.h);
            String strConcat = "static/img/android/win_back/loose/".concat(str);
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
            String string = sb.toString();
            ColorStateList colorStateListValueOf = ColorStateList.valueOf(ctf0.b(R.attr.uikitPrimary, ctf0Var));
            colorStateListValueOf.getClass();
            return new pgv0(strF, strF2, string, colorStateListValueOf, ctf0Var.f(R.string.lose_analytics, new Object[0]));
        }
        if (iOrdinal != 3 && iOrdinal != 4) {
            return null;
        }
        String strF3 = ctf0Var.f(R.string.win_back_win_title, new Object[0]);
        String strF4 = ctf0Var.f(R.string.win_back_win_description, new Object[0]);
        StringBuilder sb2 = new StringBuilder(ujn.h);
        String strConcat2 = "static/img/android/win_back/win/".concat(str);
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
        String string2 = sb2.toString();
        ColorStateList colorStateListValueOf2 = ColorStateList.valueOf(ctf0Var.a(R.color.static_green));
        colorStateListValueOf2.getClass();
        return new pgv0(strF3, strF4, string2, colorStateListValueOf2, ctf0Var.f(R.string.win_analytics, new Object[0]));
    }

    public static m2x0 D(fck0 fck0Var, n7x0 n7x0Var) throws GeneralSecurityException {
        if (!x7x0.a(fck0Var)) {
            hny.o("keyset doesn't contain a valid primary key");
            return null;
        }
        fck0Var.x();
        return new m2x0();
    }

    public static final void a(a4x a4xVar, fet fetVar, int i) {
        shd shdVar = gqw0.v;
        shd shdVar2 = gqw0.y;
        shd shdVar3 = gqw0.w;
        shd shdVar4 = gqw0.x;
        fetVar.g0(1146143858);
        int i2 = (fetVar.g(a4xVar) ? 4 : 2) | i;
        boolean z = true;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            float f = xfn.a(fetVar).c;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarN = s5x0.N(jm40Var, 0.0f, 0.0f, f, 0.0f, 11);
            zcl zclVar = qmk.f28987a;
            byte b2 = 14;
            x5d x5dVarA = w5d.a(new qw3(4.0f, true, new jf4(b2)), gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarN);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z2 = fetVar.S;
            pcy pcyVar = e7z.u1;
            if (z2) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA, shdVar4);
            jpm0.o(fetVar, bh90VarM, shdVar3);
            vqd.u(iHashCode, fetVar, shdVar2, fetVar);
            Iterator itO = h97.o(fetVar, mm40VarC0, shdVar, -969007889, a4xVar);
            while (itO.hasNext()) {
                qgm0 qgm0Var = (qgm0) itO.next();
                zcl zclVar2 = qmk.f28987a;
                thg0 thg0VarA = shg0.a(new qw3(6.0f, z, new jf4(b2)), gqw0.j, fetVar, 0);
                int iHashCode2 = Long.hashCode(fetVar.T);
                bh90 bh90VarM2 = fetVar.m();
                mm40 mm40VarC1 = kbc.c0(fetVar, jm40Var);
                mkd.c0.getClass();
                fetVar.i0();
                if (fetVar.S) {
                    fetVar.l(pcyVar);
                } else {
                    fetVar.r0();
                }
                jpm0.o(fetVar, thg0VarA, shdVar4);
                jpm0.o(fetVar, bh90VarM2, shdVar3);
                vqd.u(iHashCode2, fetVar, shdVar2, fetVar);
                jpm0.o(fetVar, mm40VarC1, shdVar);
                fetVar.e0(-716833403);
                Iterator<E> it = qgm0Var.b.iterator();
                while (it.hasNext()) {
                    cem0.e((wem0) it.next(), fetVar, 0);
                }
                fetVar.r(false);
                fetVar.r(true);
                z = true;
                b2 = 14;
            }
            fetVar.r(false);
            fetVar.r(z);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new eup(a4xVar, i, (byte) 28);
        }
    }

    public static final void b(mm40 mm40Var, kws0 kws0Var, fet fetVar, int i) {
        int i2;
        fet fetVar2 = fetVar;
        fetVar2.g0(-279970102);
        if ((i & 6) == 0) {
            i2 = i | (fetVar2.g(mm40Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(kws0Var) ? 32 : 16;
        }
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
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
            lws0 lws0Var = kws0Var.f19018a;
            i(null, lws0Var.b, lws0Var.f20779a, fetVar2, 0, 1);
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarN = s5x0.N(jm40Var, 0.0f, 4.0f, 0.0f, 0.0f, 13);
            lws0 lws0Var2 = kws0Var.b;
            i(mm40VarN, lws0Var2.b, lws0Var2.f20779a, fetVar, 0, 0);
            v8q0.a(kws0Var.g, s5x0.N(jm40Var, 0.0f, 8.0f, 0.0f, 0.0f, 13), 0L, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, ibm0.n(new y9q0(0L, qmk.p, null, j1t0.c, 0L, null, 0, 0, qmk.C, 16646109), fetVar), fetVar, 0, 24960, 110588);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new nur0((Object) mm40Var, (Object) kws0Var, i, (byte) 11);
        }
    }

    public static final void c(mm40 mm40Var, n5l0 n5l0Var, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        fetVar2.g0(-1934797738);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(n5l0Var) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarS = o7k0.s(mm40Var, 28.0f);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.n, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarS);
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
            d(null, n5l0Var.f22949a, n5l0Var.f, n5l0Var.e, fetVar2, 0, 1);
            jm40 jm40Var = jm40.b;
            d(s5x0.N(jm40Var, 0.0f, 4.0f, 0.0f, 0.0f, 13), n5l0Var.b, n5l0Var.g, n5l0Var.d, fetVar, 0, 0);
            v8q0.a(n5l0Var.c, o7k0.d(s5x0.N(jm40Var, 0.0f, 8.0f, 0.0f, 0.0f, 13), 1.0f), 0L, null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, ibm0.n(new y9q0(0L, qmk.p, null, j1t0.c, 0L, null, 0, 0, qmk.C, 16646109), fetVar), fetVar, 0, 24960, 109564);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new iws0(mm40Var, n5l0Var, i, (byte) 0);
        }
    }

    public static final void d(mm40 mm40Var, String str, boolean z, y3d y3dVar, fet fetVar, int i, int i2) {
        mm40 mm40Var2;
        int i3;
        fet fetVar2;
        y9q0 y9q0Var;
        fetVar.g0(-1492327250);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            mm40Var2 = mm40Var;
        } else {
            mm40Var2 = mm40Var;
            i3 = i | (fetVar.g(mm40Var2) ? 4 : 2);
        }
        int i5 = i3 | (fetVar.g(str) ? 32 : 16) | (fetVar.h(z) ? 256 : 128) | (fetVar.g(y3dVar) ? 2048 : 1024);
        if (fetVar.U(i5 & 1, (i5 & 1171) != 1170)) {
            jm40 jm40Var = jm40.b;
            if (i4 != 0) {
                mm40Var2 = jm40Var;
            }
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarD = o7k0.d(o7k0.e(mm40Var2, 16.0f), 1.0f);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
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
            mm40 mm40VarB = jr8.f16991a.b(jm40Var, gqw0.e);
            if (z) {
                y9q0Var = new y9q0(0L, qmk.q, null, j1t0.f15753a, 0L, null, 0, 0, qmk.D, 16646109);
            } else {
                y9q0Var = new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045);
            }
            fetVar.e0(-445916658);
            fetVar.r(false);
            v8q0.a(str, mm40VarB, y3dVar.f41946a, null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, y9q0Var, fetVar, (i5 >> 3) & 14, 24960, 109560);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new jws0(mm40Var2, str, z, y3dVar, i, i2, (byte) 0);
        }
    }

    public static final void e(mm40 mm40Var, fhm0 fhm0Var, fet fetVar, int i) {
        mm40 mm40Var2;
        fhm0Var.getClass();
        a4x a4xVar = fhm0Var.b;
        fetVar.g0(945118017);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar.g(fhm0Var) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            mm40Var2 = jm40.b;
            mm40 mm40VarQ = knx.Q(s5x0.N(o7k0.d(mm40Var2, 1.0f), xfn.a(fetVar).c, 0.0f, 0.0f, 0.0f, 14), new k82(xfn.a(fetVar).c, (byte) 7));
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarQ);
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
            jpm0.o(fetVar, thg0VarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar3);
            jpm0.n(fetVar);
            shd shdVar4 = gqw0.v;
            x7z x7zVarI = ohs0.i(fetVar, mm40VarC0, shdVar4, 1.0f, true);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(x7zVarI, 0.0f, 0.0f, 6.0f, 0.0f, 11);
            x5d x5dVarA = w5d.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.m, fetVar, 0);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarN);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            Iterator itO = h97.o(fetVar, mm40VarC1, shdVar4, 303417579, a4xVar);
            while (itO.hasNext()) {
                pgm0 pgm0Var = ((qgm0) itO.next()).f28693a;
                if (pgm0Var instanceof ngm0) {
                    fetVar.e0(460732559);
                    idm0.b((ngm0) pgm0Var, fetVar, 0);
                    fetVar.r(false);
                } else {
                    if (!(pgm0Var instanceof ogm0)) {
                        throw b1j.f(460729627, fetVar, false);
                    }
                    fetVar.e0(460737359);
                    dem0.d((ogm0) pgm0Var, fetVar, 0);
                    fetVar.r(false);
                }
            }
            fetVar.r(false);
            fetVar.r(true);
            a(a4xVar, fetVar, 0);
            fetVar.r(true);
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o1l0((Object) mm40Var2, (Object) fhm0Var, i, (byte) 19);
        }
    }

    public static final void f(int i, fet fetVar, a4x a4xVar, mm40 mm40Var, Function1 function1) {
        a4x a4xVar2;
        a4xVar.getClass();
        function1.getClass();
        fetVar.g0(-1563644827);
        byte b2 = 4;
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(a4xVar) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            pz40 pz40Var = s6t0.f31722a;
            long backgroundContent = s6t0.b().f33626a.getBackgroundContent();
            zcl zclVar = qmk.k;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarQ = i120.Q(mm40VarD, backgroundContent, new ugg0(zclVar, zclVar, zclVar, zclVar));
            qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
            lh80 lh80Var = new lh80(12.0f, 12.0f, 12.0f, 12.0f);
            boolean z = ((i2 & 112) == 32) | ((i2 & 896) == 256);
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                a4xVar2 = a4xVar;
                objP = new a7j0(a4xVar2, function1, b2);
                fetVar.o0(objP);
            } else {
                a4xVar2 = a4xVar;
            }
            b8k0.f(mm40VarQ, null, lh80Var, false, qw3Var, null, null, false, null, (Function1) objP, fetVar, 0, 490);
        } else {
            a4xVar2 = a4xVar;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new de9(mm40Var, a4xVar2, function1, i, (byte) 9);
        }
    }

    public static final void g(llp0 llp0Var, fet fetVar, int i) {
        yfe0 yfe0VarU;
        klp0 klp0Var;
        fetVar.g0(-1837303809);
        byte b2 = 2;
        int i2 = (fetVar.g(llp0Var) ? 4 : 2) | i;
        byte b3 = 0;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            if (llp0Var.f20260a) {
                obc.d(bmd.n.a(k6z.f17794a), u1c.M(-262313153, new klp0(llp0Var), fetVar), fetVar, 56);
            } else {
                yfe0VarU = fetVar.u();
                if (yfe0VarU == null) {
                    return;
                } else {
                    klp0Var = new klp0(llp0Var, i, b3);
                }
            }
            yfe0VarU.d = klp0Var;
        }
        fetVar.X();
        yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            klp0Var = new klp0(llp0Var, i, b2);
            yfe0VarU.d = klp0Var;
        }
    }

    public static final void h(mm40 mm40Var, kws0 kws0Var, fet fetVar, int i) {
        fetVar.g0(609429041);
        int i2 = i | 6 | (fetVar.g(kws0Var) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarJ = s5x0.J(mm40VarD, 8.0f);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar, 0);
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
            jpm0.o(fetVar, thg0VarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            b(dw9.h(1.0f, s5x0.N(jm40Var, 0.0f, 0.0f, 8.0f, 0.0f, 11), true), kws0Var, fetVar, i2 & 112);
            gad gadVar = kws0Var.f;
            n5l0 n5l0Var = kws0Var.e;
            n5l0 n5l0Var2 = kws0Var.c;
            n5l0 n5l0Var3 = kws0Var.d;
            kbc.t(null, gadVar, fetVar, 0);
            if (n5l0Var3 != null) {
                fetVar.e0(19909132);
                c(s5x0.L(jm40Var, 4.0f, 0.0f, 2), n5l0Var3, fetVar, 0);
                idx.o(0, fetVar, null);
                fetVar.r(false);
            } else {
                fetVar.e0(20094605);
                fetVar.r(false);
            }
            if (n5l0Var2 != null) {
                fetVar.e0(20137261);
                c(s5x0.L(jm40Var, 4.0f, 0.0f, 2), n5l0Var2, fetVar, 0);
                idx.o(0, fetVar, null);
                fetVar.r(false);
            } else {
                fetVar.e0(20321773);
                fetVar.r(false);
            }
            if (n5l0Var != null) {
                fetVar.e0(20366506);
                c(s5x0.N(jm40Var, 4.0f, 0.0f, 0.0f, 0.0f, 14), n5l0Var, fetVar, 0);
                fetVar.r(false);
            } else {
                fetVar.e0(20523149);
                fetVar.r(false);
            }
            fetVar.r(true);
            mm40Var = jm40Var;
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new htr0(mm40Var, kws0Var, i, (byte) 13);
        }
    }

    public static final void i(mm40 mm40Var, d280 d280Var, String str, fet fetVar, int i, int i2) {
        mm40 mm40Var2;
        int i3;
        fet fetVar2;
        mm40 mm40Var3;
        fetVar.g0(807098089);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            mm40Var2 = mm40Var;
        } else {
            mm40Var2 = mm40Var;
            i3 = i | (fetVar.g(mm40Var2) ? 4 : 2);
        }
        int i5 = i3 | (fetVar.g(d280Var) ? 32 : 16) | (fetVar.g(str) ? 256 : 128);
        byte b2 = 1;
        if (fetVar.U(i5 & 1, (i5 & 147) != 146)) {
            jm40 jm40Var = jm40.b;
            mm40Var3 = i4 != 0 ? jm40Var : mm40Var2;
            yx7 yx7Var = gqw0.k;
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40Var3, 16.0f);
            thg0 thg0VarA = shg0.a(uc9.f35418a, yx7Var, fetVar, 48);
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
            boolean z = (i5 & 112) == 32;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new u6n(d4d.SECONDARY60, w6n.l, d280Var);
                fetVar.o0(objP);
            }
            u6n u6nVar = (u6n) objP;
            boolean zG = fetVar.g(u6nVar);
            Object objP2 = fetVar.P();
            if (zG || objP2 == cl5Var) {
                objP2 = new d1n(u6nVar, b2);
                fetVar.o0(objP2);
            }
            kkb.p(1, fetVar, null, (Function0) objP2);
            v8q0.a(str, dw9.h(1.0f, s5x0.N(jm40Var, 6.0f, 0.0f, 0.0f, 0.0f, 14), true), ((ThemeColors) fetVar.k(zaq0.b)).getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045), fetVar, (i5 >> 6) & 14, 24960, 110584);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
            mm40Var3 = mm40Var2;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new lfc0(mm40Var3, (Object) d280Var, (Object) str, i, i2, (byte) 17);
        }
    }

    public static void j(String str, String str2) {
        Log.e("SecurityComp20000302: ".concat(str), str2);
    }

    public static void k(String str, String str2) {
        Log.i("SecurityComp20000302: ".concat(str), str2);
    }

    public static float l(int i, Context context) {
        return TypedValue.applyDimension(1, i, context.getResources().getDisplayMetrics());
    }

    public static ThemeColors m(fet fetVar) {
        return (ThemeColors) fetVar.k(zaq0.b);
    }

    public static final int n(ulr0 ulr0Var) {
        switch (ulr0Var.ordinal()) {
            case 0:
            case 1:
                return R.drawable.ic_glyph_coefficient;
            case 2:
                return R.drawable.ic_glyph_game_screen;
            case 3:
                return R.drawable.ic_glyph_football_1;
            case 4:
                return R.drawable.ic_ice_hockey;
            case 5:
                return R.drawable.ic_basketball;
            case 6:
                return R.drawable.glyph_cyber_football;
            case 7:
                return R.drawable.ic_glyph_free_toto;
            case 8:
                return R.drawable.ic_cricket;
            case 9:
                return R.drawable.ic_glyph_cyber_gamepad;
            default:
                t9f.b();
                return 0;
        }
    }

    public static IndividualColors o(fet fetVar) {
        return (IndividualColors) fetVar.k(j7x.f16059a);
    }

    public static StaticColors p(fet fetVar) {
        return (StaticColors) fetVar.k(m8m0.f21378a);
    }

    public static final i4i q(d0t d0tVar, String str, List list, boolean z, boolean z2, String str2, boolean z3, boolean z4, boolean z5, boolean z6) {
        u3i x3iVar;
        u3i z3iVar;
        u3i v3iVar;
        d0tVar.getClass();
        str.getClass();
        list.getClass();
        str2.getClass();
        int i = d0tVar.O;
        c4i c4iVar = new c4i(jeb.M(d0tVar.o, d0tVar.b), z2 && list.contains(Integer.valueOf(i)), new n0x(dtb.L(i, str, str2, list, z)), new m0x(dtb.K(d0tVar.A != boh.UNKNOWN, d0tVar.v), null, 6), list.contains(Integer.valueOf(i)) && z ? new y3d(y3d.g) : null, 32);
        if (z3) {
            x3iVar = new x3i(d0tVar.E ? gtj.f11884a : gtj.b);
        } else {
            x3iVar = y3i.f41954a;
        }
        if (z4) {
            z3iVar = new z3i(d0tVar.D ? gtj.f11884a : gtj.b);
        } else {
            z3iVar = a4i.f224a;
        }
        if (z5 || z6) {
            v3iVar = new v3i(z5 ? c2i.f3624a : e2i.f7087a);
        } else {
            v3iVar = w3i.f38503a;
        }
        return new i4i(false, c4iVar, null, v3iVar, z3iVar, x3iVar, null, 68);
    }

    public static k4i r(d0t d0tVar, String str, List list, boolean z, boolean z2, String str2, boolean z3, boolean z4, boolean z5, boolean z6) {
        u3i x3iVar;
        u3i z3iVar;
        u3i v3iVar;
        d0tVar.getClass();
        str.getClass();
        list.getClass();
        str2.getClass();
        int i = d0tVar.O;
        c4i c4iVar = new c4i(jeb.M(d0tVar.o, d0tVar.b), z2 && list.contains(Integer.valueOf(i)), new n0x(dtb.L(i, str, str2, list, z)), new m0x(dtb.K(d0tVar.A != boh.UNKNOWN, d0tVar.v), null, 6), list.contains(Integer.valueOf(i)) && z ? new y3d(y3d.g) : null, 32);
        if (z3) {
            x3iVar = new x3i(d0tVar.E ? gtj.f11884a : gtj.b);
        } else {
            x3iVar = y3i.f41954a;
        }
        if (z4) {
            z3iVar = new z3i(d0tVar.D ? gtj.f11884a : gtj.b);
        } else {
            z3iVar = a4i.f224a;
        }
        if (z5 || z6) {
            v3iVar = new v3i(z5 ? c2i.f3624a : e2i.f7087a);
        } else {
            v3iVar = w3i.f38503a;
        }
        return new k4i(c4iVar, null, v3iVar, z3iVar, x3iVar, t3i.f33268a, 4);
    }

    public static l4i s(e4i e4iVar, d0t d0tVar, String str, String str2, String str3, String str4, List list, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        u3i x3iVar;
        u3i z3iVar;
        u3i v3iVar;
        d0tVar.getClass();
        str.getClass();
        list.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        int i = d0tVar.O;
        c4i c4iVar = new c4i(jeb.K(d0tVar.O, d0tVar.v, list, d0tVar.o, d0tVar.b, z3, d0tVar.y.f26920a).a(), z2 && list.contains(Integer.valueOf(i)), new n0x(dtb.L(i, str, str4, list, z)), new m0x(dtb.K(d0tVar.A != boh.UNKNOWN, d0tVar.v), null, 6), list.contains(Integer.valueOf(i)) && z ? new y3d(y3d.g) : null, 32);
        h4i h4iVar = e4iVar;
        if (e4iVar == null) {
            h4iVar = f4i.f8914a;
        }
        b4i b4iVar = new b4i(str2, h4iVar);
        if (z4) {
            x3iVar = new x3i(d0tVar.E ? gtj.f11884a : gtj.b);
        } else {
            x3iVar = y3i.f41954a;
        }
        if (z5) {
            z3iVar = new z3i(d0tVar.D ? gtj.f11884a : gtj.b);
        } else {
            z3iVar = a4i.f224a;
        }
        if (z6 || z7) {
            v3iVar = new v3i(z6 ? c2i.f3624a : e2i.f7087a);
        } else {
            v3iVar = w3i.f38503a;
        }
        return new l4i(str3, c4iVar, b4iVar, v3iVar, z3iVar, x3iVar, t3i.f33268a);
    }

    public static k4i t(d0t d0tVar, String str, List list, boolean z, boolean z2, String str2, boolean z3, boolean z4) {
        u3i x3iVar;
        u3i z3iVar;
        d0tVar.getClass();
        str.getClass();
        list.getClass();
        str2.getClass();
        int i = d0tVar.O;
        c4i c4iVar = new c4i(jeb.M(d0tVar.o, d0tVar.b), z2 && list.contains(Integer.valueOf(i)), new n0x(dtb.L(i, str, str2, list, z)), new m0x(dtb.K(d0tVar.A != boh.UNKNOWN, d0tVar.v), null, 6), list.contains(Integer.valueOf(i)) && z ? new y3d(y3d.g) : null, 32);
        if (z3) {
            x3iVar = new x3i(d0tVar.E ? gtj.f11884a : gtj.b);
        } else {
            x3iVar = y3i.f41954a;
        }
        if (z4) {
            z3iVar = new z3i(d0tVar.D ? gtj.f11884a : gtj.b);
        } else {
            z3iVar = a4i.f224a;
        }
        return new k4i(c4iVar, null, null, z3iVar, x3iVar, t3i.f33268a, 12);
    }

    public static j4i u(y3d y3dVar, d0t d0tVar, String str, String str2, List list, boolean z, boolean z2, boolean z3, boolean z4) {
        y3d y3dVar2;
        y3d y3dVar3;
        u3i x3iVar;
        u3i z3iVar;
        d0tVar.getClass();
        str.getClass();
        list.getClass();
        str2.getClass();
        int i = d0tVar.O;
        boolean z5 = list.contains(Integer.valueOf(i)) && z;
        String strM = jeb.M(d0tVar.o, d0tVar.b);
        boolean z6 = z2 && list.contains(Integer.valueOf(i));
        n0x n0xVar = new n0x(dtb.L(i, str, str2, list, z));
        m0x m0xVar = new m0x(dtb.K(d0tVar.A != boh.UNKNOWN, d0tVar.v), null, 6);
        if (z5) {
            y3dVar3 = y3dVar;
            y3dVar2 = new y3d(y3d.g);
        } else {
            y3dVar2 = y3dVar;
            y3dVar3 = y3dVar2;
        }
        c4i c4iVar = new c4i(strM, z6, n0xVar, m0xVar, y3dVar2, y3dVar3);
        if (z3) {
            x3iVar = new x3i(d0tVar.E ? gtj.f11884a : gtj.b);
        } else {
            x3iVar = y3i.f41954a;
        }
        if (z4) {
            z3iVar = new z3i(d0tVar.D ? gtj.f11884a : gtj.b);
        } else {
            z3iVar = a4i.f224a;
        }
        return new j4i(c4iVar, null, z3iVar, x3iVar, t3i.f33268a, 12);
    }

    public static g1t0 v(fet fetVar) {
        return (g1t0) fetVar.k(j1t0.e);
    }

    public static final boolean w() throws Throwable {
        if (Build.VERSION.SDK_INT >= 29) {
            return sf3.j();
        }
        try {
            Method method = b;
            if (method == null) {
                f787a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                method = Trace.class.getMethod("isTagEnabled", Long.TYPE);
                b = method;
            }
            if (method == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            Object objInvoke = method.invoke(null, Long.valueOf(f787a));
            objInvoke.getClass();
            return ((Boolean) objInvoke).booleanValue();
        } catch (Exception e2) {
            if (!(e2 instanceof InvocationTargetException)) {
                Log.v("Trace", "Unable to call isTagEnabled via reflection", e2);
                return false;
            }
            Throwable cause = ((InvocationTargetException) e2).getCause();
            if (cause instanceof RuntimeException) {
                throw cause;
            }
            ohq.p(cause);
            return false;
        }
    }

    public static c44 x(JSONObject jSONObject, String str, String str2) {
        jSONObject.getClass();
        try {
            int iOptInt = jSONObject.optInt("error_code");
            Bundle bundle = null;
            if (iOptInt == 5) {
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("ban_info");
                if (jSONObjectOptJSONObject != null) {
                    bundle = new Bundle();
                    bundle.putString("user_ban_info", jSONObjectOptJSONObject.toString());
                }
            } else if (iOptInt == 14) {
                bundle = new Bundle();
                z(bundle, jSONObject);
            } else if (iOptInt == 17) {
                bundle = new Bundle();
                bundle.putString("validation_url", jSONObject.getString(CommonConstant.ReqAccessTokenParam.REDIRECT_URI));
            } else if (iOptInt == 24) {
                bundle = new Bundle();
                bundle.putString("confirmation_text", jSONObject.getString("confirmation_text"));
            } else if (iOptInt == 3609) {
                Bundle bundle2 = new Bundle();
                bundle2.putString("extend_hash", jSONObject.optString("extend_hash", null));
                bundle = bundle2;
            }
            if (str2 != null) {
                if (bundle == null) {
                    bundle = new Bundle(1);
                }
                bundle.putString("access_token", str2);
            }
            int i = yut0.f;
            return n8n0.j(jSONObject, str, bundle);
        } catch (Exception e2) {
            String string = jSONObject.toString();
            string.getClass();
            return new zut0(string, e2, (byte) 15);
        }
    }

    public static PorterDuff.Mode y(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    public static void z(Bundle bundle, JSONObject jSONObject) {
        bundle.putString("captcha_sid", jSONObject.getString("captcha_sid"));
        bundle.putString("captcha_img", jSONObject.getString("captcha_img"));
        bundle.putInt("captcha_height", jSONObject.optInt("captcha_height"));
        bundle.putInt("captcha_width", jSONObject.optInt("captcha_width"));
        bundle.putDouble("captcha_ratio", jSONObject.optDouble("captcha_ratio"));
        if (jSONObject.has("captcha_attempt")) {
            bundle.putInt("captcha_attempt", jSONObject.optInt("captcha_attempt", -1));
        }
        if (jSONObject.has("captcha_ts")) {
            bundle.putDouble("captcha_ts", jSONObject.optDouble("captcha_ts", -1.0d));
        }
        if (jSONObject.has("is_refresh_enabled")) {
            bundle.putBoolean("is_refresh_enabled", jSONObject.optBoolean("is_refresh_enabled", false));
        }
    }
}
