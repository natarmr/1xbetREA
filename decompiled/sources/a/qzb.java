package a;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.gov.nist.core.Separators;
import android.javax.sip.message.Response;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Pattern;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import org.xbet.client1.R;
import org.xplatform.betting.core.zip.model.zip.game.GameStatistic;
import org.xplatform.betting.core.zip.model.zip.game.StatInfo;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes4.dex */
public abstract class qzb {
    public static final void A(mm40 mm40Var, int i, oe9 oe9Var, fet fetVar, int i2) {
        fet fetVar2;
        fetVar.g0(1949096893);
        int i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2 | (fetVar.e(i) ? 32 : 16) | (fetVar.e(oe9Var.ordinal()) ? 256 : 128);
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            Resources resources = (Resources) fetVar.k(dy2.c);
            fetVar2 = fetVar;
            dww.c(a8k0.F(i, (i3 >> 3) & 14, fetVar), null, o2e.e0(o7k0.o(g0(oe9Var), mm40Var), "SETTINGS_ICON" + resources.getResourceEntryName(i)), 0L, fetVar2, 56, 8);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new uul(mm40Var, i, oe9Var, i2, (byte) 0);
        }
    }

    public static final boolean A0(m9s m9sVar) {
        m9sVar.getClass();
        return m9sVar.j.length() > 0 && !m9sVar.d.isEmpty() && m9sVar.i.length() > 0 && !m9sVar.c.isEmpty();
    }

    public static final void B(int i, int i2, oe9 oe9Var, fet fetVar, mm40 mm40Var, String str) {
        int i3;
        String str2;
        mm40 mm40Var2;
        y9q0 y9q0Var;
        fetVar.g0(141324077);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            str2 = str;
            i3 |= fetVar.g(str2) ? 32 : 16;
        } else {
            str2 = str;
        }
        if ((i & 384) == 0) {
            i3 |= fetVar.e(oe9Var.ordinal()) ? 256 : 128;
        }
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            mm40Var2 = i4 != 0 ? jm40.b : mm40Var;
            int iOrdinal = oe9Var.ordinal();
            if (iOrdinal == 0) {
                y9q0Var = new y9q0(0L, qmk.s, null, j1t0.b, 0L, null, 0, 0, qmk.G, 16646109);
            } else if (iOrdinal == 1 || iOrdinal == 2) {
                y9q0Var = new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109);
            } else {
                if (iOrdinal != 3) {
                    t9f.b();
                    return;
                }
                y9q0Var = new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045);
            }
            v8q0.a(str2, o2e.e0(mm40Var2, "LABEL_CONTAINER_BUTTON_TEXT"), 0L, new n05(qmk.o, y9q0Var.f42262a.b, qmk.n), 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, y9q0Var, fetVar, (i3 >> 3) & 14, 24960, 110580);
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new rn1(mm40Var2, (Object) str, (Object) oe9Var, i, i2, (byte) 12);
        }
    }

    public static final boolean B0(d0t d0tVar) {
        d0tVar.getClass();
        long j = d0tVar.t;
        return j > 0 && j < 21600;
    }

    public static final void C(int i, int i2, oe9 oe9Var, fet fetVar, mm40 mm40Var, String str) {
        fetVar.g0(751026448);
        int i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2 | (fetVar.g(str) ? 32 : 16) | (fetVar.e(i) ? 256 : 128) | (fetVar.e(oe9Var.ordinal()) ? 2048 : 1024);
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            thg0 thg0VarA = shg0.a(new qw3(e0(oe9Var), true, new jf4((byte) 14)), gqw0.k, fetVar, 48);
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
            jpm0.o(fetVar, thg0VarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            dww.c(a8k0.F(i, (i3 >> 6) & 14, fetVar), null, o7k0.o(g0(oe9Var), jm40.b), 0L, fetVar, 56, 8);
            B((i3 & 112) | ((i3 >> 3) & 896), 1, oe9Var, fetVar, null, str);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new tul(mm40Var, str, i, oe9Var, i2, (byte) 1);
        }
    }

    public static final boolean C0(d0t d0tVar) {
        d0tVar.getClass();
        return d0tVar.v == 40;
    }

    public static final void D(int i, int i2, oe9 oe9Var, fet fetVar, mm40 mm40Var, String str) {
        fetVar.g0(-291387783);
        int i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2 | (fetVar.g(str) ? 32 : 16) | (fetVar.e(i) ? 256 : 128) | (fetVar.e(oe9Var.ordinal()) ? 2048 : 1024);
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            thg0 thg0VarA = shg0.a(new qw3(e0(oe9Var), true, new jf4((byte) 14)), gqw0.k, fetVar, 48);
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
            jpm0.o(fetVar, thg0VarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            B((i3 & 112) | ((i3 >> 3) & 896), 1, oe9Var, fetVar, null, str);
            dww.c(a8k0.F(i, (i3 >> 6) & 14, fetVar), null, o7k0.o(g0(oe9Var), jm40.b), 0L, fetVar, 56, 8);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new tul(mm40Var, str, i, oe9Var, i2, (byte) 0);
        }
    }

    public static final boolean D0(d0t d0tVar) {
        d0tVar.getClass();
        f0t f0tVar = d0tVar.q;
        f0t f0tVar2 = d0tVar.r;
        boolean z = f0tVar.b.length() > 0 || f0tVar.f8731a > 0;
        boolean z2 = f0tVar2.b.length() > 0 || f0tVar2.f8731a > 0;
        return (z && !z2) || (!z && z2) || d0tVar.v == 176;
    }

    public static final void E(mm40 mm40Var, i0n i0nVar, fet fetVar, int i) {
        int i2;
        boolean z;
        fet fetVar2 = fetVar;
        fetVar2.g0(-251113114);
        if ((i & 6) == 0) {
            i2 = i | (fetVar2.g(mm40Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(i0nVar) ? 32 : 16;
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
            mpm mpmVar = i0nVar.e;
            e0n e0nVar = i0nVar.b;
            H(mm40VarN, mpmVar, i0nVar.f13955a, fetVar2, 0);
            if (e0nVar != null) {
                fetVar2.e0(1894492427);
                rcb.x(null, e0nVar.f6996a, h2m.f12341a, e0nVar.b, e0nVar.d, null, fetVar2, 384);
                mm40 mm40VarN2 = s5x0.N(jm40Var, 0.0f, 4.0f, 0.0f, 0.0f, 13);
                String str = e0nVar.c;
                ((g1t0) fetVar2.k(j1t0.e)).getClass();
                z = true;
                v8q0.a(str, mm40VarN2, ((ThemeColors) fetVar2.k(zaq0.b)).getSecondary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, g1t0.h(), fetVar, 0, 24960, 109560);
                fetVar2 = fetVar;
                fetVar2.r(false);
            } else {
                z = true;
                fetVar2.e0(1895175698);
                fetVar2.r(false);
            }
            fetVar2.r(z);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xvm((byte) 27, i, mm40Var, i0nVar);
        }
    }

    public static final boolean E0(d0t d0tVar) {
        d0tVar.getClass();
        return d0tVar.t < 21600;
    }

    public static final void F(mm40 mm40Var, boolean z, ows0 ows0Var, fet fetVar, int i) {
        byte b;
        fet fetVar2 = fetVar;
        int i2 = ows0Var.b;
        fetVar2.g0(-1002223062);
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
                b = 1;
                objP = new b0n(ows0Var, b);
                fetVar2.o0(objP);
            } else {
                b = 1;
            }
            kkb.p(b, fetVar2, null, (Function0) objP);
            if (i2 > 0) {
                fetVar2.e0(1244631509);
                tdc.e(new rpe(i2), ipe.f15159a, ffb0.Q(jr8.f16991a.b(jm40Var, z ? gqw0.i : gqw0.g), z ? 3.0f : -3.0f, 2.0f), fetVar2, 48, 0);
                fetVar2.r(false);
            } else {
                fetVar2.e0(1245253276);
                fetVar2.r(false);
            }
            fetVar2.r(true);
            kc5.N(ows0Var.f25981a, o7k0.e(s5x0.N(jm40Var, 0.0f, 4.0f, 0.0f, 0.0f, 13), 32.0f), 0L, null, null, 0L, qmk.q, g1t0.m().f42262a.b, null, null, 0L, gqw0.e, 2, false, 2, 0, false, null, y9q0.a(ibm0.t(g1t0.l(), fetVar2), 0L, 0L, null, null, null, 0L, null, null, 3, 0, 0L, null, null, 16744447), 0.0f, fetVar, 0, 1600512, 0, 3055420);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new c0n(mm40Var, z, ows0Var, i, (byte) 1);
        }
    }

    public static final String F0(d0t d0tVar) {
        Collection collectionD0;
        d0tVar.getClass();
        long j = d0tVar.v;
        String str = d0tVar.p.i;
        if (j == 40 && str.length() > 0) {
            List listI = new Regex(Separators.COMMA).i(kotlin.text.c.r(str, "-", " : ", false));
            if (!listI.isEmpty()) {
                ListIterator listIterator = listI.listIterator(listI.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        collectionD0 = iun.f15405a;
                        break;
                    }
                    if (((String) listIterator.previous()).length() != 0) {
                        collectionD0 = CollectionsKt.D0(listI, listIterator.nextIndex() + 1);
                        break;
                    }
                }
            } else {
                collectionD0 = iun.f15405a;
                break;
            }
            String[] strArr = (String[]) collectionD0.toArray(new String[0]);
            if (strArr.length != 0 && Pattern.compile("([0-9]*) : ([0-9]*)").matcher(strArr[strArr.length - 1]).matches()) {
                return strArr[strArr.length - 1];
            }
        }
        return q0(d0tVar, false);
    }

    public static final void G(mm40 mm40Var, String str, a4x a4xVar, String str2, String str3, boolean z, fet fetVar, int i) {
        fet fetVar2;
        mm40 mm40Var2;
        boolean z2;
        long primary;
        fetVar.g0(1459381006);
        int i2 = i | 6 | (fetVar.g(str) ? 32 : 16) | (fetVar.g(a4xVar) ? 256 : 128) | (fetVar.g(str2) ? 2048 : 1024) | (fetVar.g(str3) ? 16384 : 8192) | (fetVar.h(z) ? 131072 : 65536);
        if (fetVar.U(i2 & 1, (74899 & i2) != 74898)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            byte b = 14;
            x5d x5dVarA = w5d.a(new qw3(2.0f, true, new jf4(b)), gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarD);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z3 = fetVar.S;
            pcy pcyVar = e7z.u1;
            if (z3) {
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
            zfn zfnVar = zaq0.b;
            long textPrimary = ((ThemeColors) fetVar.k(zfnVar)).getTextPrimary();
            zfn zfnVar2 = j1t0.e;
            ((g1t0) fetVar.k(zfnVar2)).getClass();
            f1t0.a(s5x0.N(jm40Var, 0.0f, 0.0f, 20.0f, 0.0f, 11), str, textPrimary, null, 0L, null, 0L, null, 0L, 2, false, 1, 0, g1t0.d(), 0L, fetVar, i2 & 112, 438264);
            thg0 thg0VarA = shg0.a(new qw3(8.0f, true, new jf4(b)), gqw0.k, fetVar, 48);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, jm40Var);
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
            k((i2 >> 3) & 112, fetVar, a4xVar, null);
            long secondary = ((ThemeColors) fetVar.k(zfnVar)).getSecondary();
            ((g1t0) fetVar.k(zfnVar2)).getClass();
            v8q0.a(str2, new x7z(1.0f, true), secondary, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.g(), fetVar, (i2 >> 9) & 14, 24960, 110584);
            fetVar2 = fetVar;
            if (str3.length() > 0) {
                fetVar2.e0(-657387821);
                if (z) {
                    fetVar2.e0(1918460493);
                    primary = ((StaticColors) fetVar2.k(m8m0.f21378a)).m98getGreen0d7_KjU();
                    z2 = false;
                } else {
                    z2 = false;
                    fetVar2.e0(1918461423);
                    primary = ((ThemeColors) fetVar2.k(zfnVar)).getPrimary();
                }
                fetVar2.r(z2);
                ((g1t0) fetVar2.k(zfnVar2)).getClass();
                v8q0.a(str3, null, primary, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.a(), fetVar2, (i2 >> 12) & 14, 0, 131066);
                fetVar2 = fetVar2;
                fetVar2.r(z2);
            } else {
                fetVar2.e0(-657135078);
                fetVar2.r(false);
            }
            fetVar2.r(true);
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zw8(mm40Var2, (Object) str, (Object) a4xVar, str2, (Object) str3, z, i, (byte) 7);
        }
    }

    public static final CharSequence G0(d0t d0tVar, int i, boolean z) {
        List listD0;
        d0tVar.getClass();
        boolean z2 = z && cy7.c();
        long j = d0tVar.v;
        rqs rqsVar = d0tVar.p;
        String str = rqsVar.i;
        if (j == 40 && str.length() > 0) {
            List listSplit$default = StringsKt__StringsKt.split$default(kotlin.text.c.r(str, "-", " : ", false), new String[]{Separators.COMMA}, false, 0, 6, null);
            if (!listSplit$default.isEmpty()) {
                ListIterator listIterator = listSplit$default.listIterator(listSplit$default.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        listD0 = iun.f15405a;
                        break;
                    }
                    if (((String) listIterator.previous()).length() != 0) {
                        listD0 = CollectionsKt.D0(listSplit$default, listIterator.nextIndex() + 1);
                        break;
                    }
                }
            } else {
                listD0 = iun.f15405a;
                break;
            }
            Pattern patternCompile = Pattern.compile("([0-9]*) : ([0-9]*)");
            if (!listD0.isEmpty()) {
                String str2 = (String) (z2 ? CollectionsKt.U(listD0) : CollectionsKt.d0(listD0));
                if (patternCompile.matcher(str2).matches()) {
                    return str2;
                }
            }
        }
        iun iunVar = iun.f15405a;
        if (rqsVar.equals(new rqs("", 0, "", iunVar, 0, 0, 0, new kts("", "", false, false), "", 0L, 0, 0, "", iunVar, iunVar, false, 0, false, false, false, false, false, false, false, false, false, 0, new ubr(0, 0)))) {
            return new SpannableString("");
        }
        SpannableString spannableString = new SpannableString(q0(d0tVar, z));
        List listSplit$default2 = StringsKt__StringsKt.split$default(spannableString, new String[]{" : "}, false, 0, 6, null);
        String str3 = (String) CollectionsKt.W(0, listSplit$default2);
        if (str3 == null) {
            str3 = "";
        }
        String str4 = (String) CollectionsKt.W(1, listSplit$default2);
        String str5 = str4 != null ? str4 : "";
        IntRange intRangeO = !z2 ? l1e0.o(0, str3.length()) : l1e0.o(spannableString.length() - str3.length(), spannableString.length());
        IntRange intRangeO2 = !z2 ? l1e0.o(spannableString.length() - str5.length(), spannableString.length()) : l1e0.o(0, str5.length());
        if (rqsVar.t) {
            spannableString.setSpan(new ForegroundColorSpan(i), intRangeO.f46068a, intRangeO.b + 1, 17);
        }
        if (rqsVar.u) {
            spannableString.setSpan(new ForegroundColorSpan(i), intRangeO2.f46068a, intRangeO2.b + 1, 17);
        }
        return spannableString;
    }

    public static final void H(mm40 mm40Var, mpm mpmVar, boolean z, fet fetVar, int i) {
        fetVar.g0(535636325);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(mpmVar) ? 32 : 16) | (fetVar.h(z) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            n4c.l(mm40Var, mpmVar, z, fetVar, 0);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new uwm(mm40Var, mpmVar, z, i, (byte) 2);
        }
    }

    public static final boolean H0(d0t d0tVar) {
        d0tVar.getClass();
        return d0tVar.C && d0tVar.z && d0tVar.p.j != 0;
    }

    public static final void I(int i, fet fetVar, mm40 mm40Var) {
        int i2;
        fetVar.g0(507505205);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 80.0f);
            zcl zclVar2 = qmk.k;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE), vbc.d0(null, fetVar, 0, 1)));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ujl(mm40Var, i, (byte) 27);
        }
    }

    public static final void I0(dpi0 dpi0Var) {
        S(dpi0Var, Separators.LPAREN, StaticColors.INSTANCE.m123getWhite0d7_KjU());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v6 */
    public static final void J(zsv zsvVar, Function0 function0, Function0 function1, Function0 function2, boolean z, mm40 mm40Var, fet fetVar, int i) {
        int i2;
        mm40 mm40Var2;
        fet fetVar2;
        int i3;
        ?? r5;
        jm40 jm40Var;
        fet fetVar3;
        fet fetVar4;
        fet fetVar5 = fetVar;
        int i4 = zsvVar.d;
        boolean z2 = zsvVar.c;
        function0.getClass();
        function1.getClass();
        function2.getClass();
        fetVar5.g0(-45770924);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? fetVar5.g(zsvVar) : fetVar5.i(zsvVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar5.i(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar5.i(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar5.i(function2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar5.h(z) ? 16384 : 8192;
        }
        int i5 = i2 | 196608;
        if (fetVar5.U(i5 & 1, (74899 & i5) != 74898)) {
            jm40 jm40Var2 = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var2, 1.0f);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar5, 0);
            int iHashCode = Long.hashCode(fetVar5.T);
            bh90 bh90VarM = fetVar5.m();
            mm40 mm40VarC0 = kbc.c0(fetVar5, mm40VarD);
            mkd.c0.getClass();
            fetVar5.i0();
            boolean z3 = fetVar5.S;
            Function0 function3 = e7z.u1;
            if (z3) {
                fetVar5.l(function3);
            } else {
                fetVar5.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar5, x5dVarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar5, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar5, numValueOf, shdVar3);
            jpm0.n(fetVar5);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar5, mm40VarC0, shdVar4);
            mm40 mm40VarD2 = o7k0.d(jm40Var2, 1.0f);
            androidx.compose.runtime.d dVar = zaq0.b;
            long backgroundContent = ((ThemeColors) fetVar5.k(dVar)).getBackgroundContent();
            ljc ljcVar = jd8.n;
            mm40 mm40VarQ = i120.Q(mm40VarD2, backgroundContent, ljcVar);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarG = o7k0.g(mm40VarQ, 0.0f, 56.0f, 1);
            thg0 thg0VarA = shg0.a(uc9.g, gqw0.k, fetVar5, 54);
            int iHashCode2 = Long.hashCode(fetVar5.T);
            bh90 bh90VarM2 = fetVar5.m();
            mm40 mm40VarC1 = kbc.c0(fetVar5, mm40VarG);
            fetVar5.i0();
            if (fetVar5.S) {
                fetVar5.l(function3);
            } else {
                fetVar5.r0();
            }
            jpm0.o(fetVar5, thg0VarA, shdVar);
            jpm0.o(fetVar5, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar5, shdVar3, fetVar5);
            jpm0.o(fetVar5, mm40VarC1, shdVar4);
            dww.c(a8k0.F(R.drawable.ic_glyph_arrow_left, 0, fetVar5), null, o7k0.n(s5x0.J(y860.W(jm40Var2, null, null, false, null, function0, 28), 16.0f), 24.0f), ((ThemeColors) fetVar5.k(dVar)).getSecondary(), fetVar5, 56, 0);
            zhg0 zhg0Var = zhg0.f44392a;
            if (z || !z2) {
                i3 = 56;
                fetVar5.e0(133737193);
                r5 = 0;
                jm40Var = jm40Var2;
                v8q0.a(zsvVar.f44925a, z2 ? zhg0Var.a(1.0f, s5x0.N(jm40Var2, 36.0f, 0.0f, 0.0f, 0.0f, 14), true) : zhg0Var.a(1.0f, jm40Var2, true), ((ThemeColors) fetVar5.k(dVar)).getSecondary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.u, null, j1t0.b, 0L, null, 0, 0, qmk.H, 16646109), fetVar, 0, 24960, 109560);
                fetVar3 = fetVar;
                fetVar3.r(false);
            } else {
                fetVar5.e0(133112388);
                dww.c(a8k0.F(i4, 0, fetVar5), null, o7k0.n(s5x0.J(y860.W(zhg0Var.a(1.0f, jm40Var2, true), null, null, false, null, function2, 28), 8.0f), 40.0f), ((ThemeColors) fetVar5.k(dVar)).getSecondary60(), fetVar, 56, 0);
                i3 = 56;
                fetVar.r(false);
                fetVar3 = fetVar;
                r5 = 0;
                jm40Var = jm40Var2;
            }
            thg0 thg0VarA2 = shg0.a(uc9.f35418a, gqw0.j, fetVar3, r5);
            int iHashCode3 = Long.hashCode(fetVar3.T);
            bh90 bh90VarM3 = fetVar3.m();
            mm40 mm40VarC2 = kbc.c0(fetVar3, jm40Var);
            fetVar3.i0();
            if (fetVar3.S) {
                fetVar3.l(function3);
            } else {
                fetVar3.r0();
            }
            jpm0.o(fetVar3, thg0VarA2, shdVar);
            jpm0.o(fetVar3, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, fetVar3, shdVar3, fetVar3);
            jpm0.o(fetVar3, mm40VarC2, shdVar4);
            fet fetVar6 = fetVar3;
            dww.c(a8k0.F(R.drawable.ic_glyph_info_circle, r5, fetVar3), null, o7k0.n(y860.W(s5x0.J(jm40Var, 12.0f), null, null, false, null, function1, 28), 24.0f), ((ThemeColors) fetVar3.k(dVar)).getSecondary(), fetVar6, i3, 0);
            if (z && z2) {
                fetVar6.e0(1905042517);
                mm40 mm40VarN = o7k0.n(y860.W(s5x0.J(jm40Var, 12.0f), null, null, false, null, function2, 28), 24.0f);
                pm80 pm80VarF = a8k0.F(i4, r5, fetVar6);
                long secondary = ((ThemeColors) fetVar6.k(dVar)).getSecondary();
                fet fetVar7 = fetVar6;
                dww.c(pm80VarF, null, mm40VarN, secondary, fetVar7, i3, 0);
                fetVar7.r(r5);
                fetVar4 = fetVar7;
            } else {
                fet fetVar8 = fetVar6;
                fetVar8.e0(1905639856);
                fetVar8.r(r5);
                fetVar4 = fetVar8;
            }
            fetVar4.r(true);
            fetVar4.r(true);
            if (z) {
                fetVar4.e0(1745186173);
                zq8.a(r5, fetVar4, i120.Q(o7k0.e(o7k0.d(jm40Var, 1.0f), 1.0f), ((ThemeColors) fetVar4.k(dVar)).getSeparator60(), ljcVar));
                fetVar4.r(r5);
            } else {
                fetVar4.e0(1745396632);
                fetVar4.r(r5);
            }
            fetVar4.r(true);
            mm40Var2 = jm40Var;
            fetVar2 = fetVar4;
        } else {
            fetVar5.X();
            mm40Var2 = mm40Var;
            fetVar2 = fetVar5;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ig2(zsvVar, function0, function1, function2, z, mm40Var2, i);
        }
    }

    public static final ixf J0(nqq nqqVar, int i) {
        int iOrdinal = nqqVar.e1().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                nqq nqqVarC0 = uzb.c0(nqqVar);
                if (nqqVarC0 == null) {
                    jf4.o("ActiveParent with no focused child");
                    return null;
                }
                ixf ixfVarJ0 = J0(nqqVarC0, i);
                ixf ixfVar = ixf.f15540a;
                ixf ixfVar2 = ixfVarJ0 != ixfVar ? ixfVarJ0 : null;
                if (ixfVar2 != null) {
                    return ixfVar2;
                }
                if (nqqVar.q) {
                    return ixfVar;
                }
                nqqVar.q = true;
                try {
                    aqq aqqVarB1 = nqqVar.b1();
                    d5a d5aVar = new d5a(i);
                    ypq ypqVar = (ypq) vcc.a0(nqqVar).getFocusOwner();
                    nqq nqqVarH = ypqVar.h();
                    aqqVarB1.k.invoke(d5aVar);
                    nqq nqqVarH2 = ypqVar.h();
                    if (d5aVar.b) {
                        cqq cqqVar = cqq.b;
                        return ixf.b;
                    }
                    if (nqqVarH == nqqVarH2 || nqqVarH2 == null) {
                        return ixfVar;
                    }
                    return cqq.d == cqq.c ? ixf.b : ixf.c;
                } finally {
                    nqqVar.q = false;
                }
            }
            if (iOrdinal == 2) {
                return ixf.b;
            }
            if (iOrdinal != 3) {
                t9f.b();
                return null;
            }
        }
        return ixf.f15540a;
    }

    public static final void K(int i, fet fetVar, mm40 mm40Var, String str) {
        mm40 mm40Var2;
        jm40 jm40Var;
        fet fetVar2 = fetVar;
        fetVar2.g0(-1412272171);
        int i2 = i | 6 | (fetVar2.g(str) ? 32 : 16) | (fetVar2.g(r2n.f29744a) ? 256 : 128);
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            jm40 jm40Var2 = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var2, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 14.0f);
            thg0 thg0VarA = shg0.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.k, fetVar2, 48);
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
            brm0.x(fetVar2, mm40VarC0, gqw0.v, -1384693259, false);
            if (str.length() > 0) {
                fetVar2.e0(24663890);
                long secondary = ((ThemeColors) fetVar2.k(zaq0.b)).getSecondary();
                ((g1t0) fetVar2.k(j1t0.e)).getClass();
                jm40Var = jm40Var2;
                f1t0.a(null, str, secondary, null, 0L, null, 0L, null, 0L, 2, false, 1, 0, g1t0.d(), 0L, fetVar, i2 & 112, 438265);
                fetVar2 = fetVar;
                fetVar2.r(false);
            } else {
                jm40Var = jm40Var2;
                fetVar2.e0(24918865);
                fetVar2.r(false);
            }
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gdm(mm40Var2, str, i, (byte) 12);
        }
    }

    public static final ixf K0(nqq nqqVar, int i) {
        if (!nqqVar.r) {
            nqqVar.r = true;
            try {
                aqq aqqVarB1 = nqqVar.b1();
                d5a d5aVar = new d5a(i);
                ypq ypqVar = (ypq) vcc.a0(nqqVar).getFocusOwner();
                nqq nqqVarH = ypqVar.h();
                aqqVarB1.j.invoke(d5aVar);
                nqq nqqVarH2 = ypqVar.h();
                if (d5aVar.b) {
                    cqq cqqVar = cqq.b;
                    return ixf.b;
                }
                if (nqqVarH != nqqVarH2 && nqqVarH2 != null) {
                    return cqq.d == cqq.c ? ixf.b : ixf.c;
                }
            } finally {
                nqqVar.r = false;
            }
        }
        return ixf.f15540a;
    }

    public static final void L(k2d k2dVar, mm40 mm40Var, ugd ugdVar, fet fetVar, int i) {
        fetVar.g0(-2093651951);
        byte b = 2;
        int i2 = (fetVar.g(k2dVar) ? 4 : 2) | i | (fetVar.g(mm40Var) ? 32 : 16) | (fetVar.i(ugdVar) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            boolean z = (i2 & 14) == 4;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new qf6(k2dVar, b);
                fetVar.o0(objP);
            }
            tj30 tj30Var = (tj30) objP;
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var);
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
            jpm0.o(fetVar, tj30Var, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar3);
            jpm0.n(fetVar);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar4);
            mm40 mm40VarK0 = mrv.k0(jm40.b, RemoteMessageConst.Notification.CONTENT);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarK0);
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
            obc.e(new l5d0[0], ugdVar, fetVar, (i2 >> 3) & 112);
            fetVar.r(true);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ywa(k2dVar, mm40Var, ugdVar, i);
        }
    }

    public static final ixf L0(nqq nqqVar, int i) {
        lm40 lm40VarV;
        tzi tziVar;
        int iOrdinal = nqqVar.e1().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                nqq nqqVarC0 = uzb.c0(nqqVar);
                if (nqqVarC0 != null) {
                    return J0(nqqVarC0, i);
                }
                jf4.o("ActiveParent with no focused child");
                return null;
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    t9f.b();
                    return null;
                }
                if (!nqqVar.f20279a.n) {
                    xcx.b("visitAncestors called on an unattached node");
                }
                lm40 lm40Var = nqqVar.f20279a.e;
                e7z e7zVarZ = vcc.Z(nqqVar);
                loop0: while (true) {
                    if (e7zVarZ == null) {
                        lm40VarV = null;
                        break;
                    }
                    if ((((lm40) e7zVarZ.h1.g).d & 1024) != 0) {
                        while (lm40Var != null) {
                            if ((lm40Var.c & 1024) != 0) {
                                lm40VarV = lm40Var;
                                xz40 xz40Var = null;
                                while (lm40VarV != null) {
                                    if (lm40VarV instanceof nqq) {
                                        break loop0;
                                    }
                                    if ((lm40VarV.c & 1024) != 0 && (lm40VarV instanceof f3k)) {
                                        int i2 = 0;
                                        for (lm40 lm40Var2 = ((f3k) lm40VarV).p; lm40Var2 != null; lm40Var2 = lm40Var2.f) {
                                            if ((lm40Var2.c & 1024) != 0) {
                                                i2++;
                                                if (i2 == 1) {
                                                    lm40VarV = lm40Var2;
                                                } else {
                                                    if (xz40Var == null) {
                                                        xz40Var = new xz40(new lm40[16]);
                                                    }
                                                    if (lm40VarV != null) {
                                                        xz40Var.b(lm40VarV);
                                                        lm40VarV = null;
                                                    }
                                                    xz40Var.b(lm40Var2);
                                                }
                                            }
                                        }
                                        if (i2 == 1) {
                                        }
                                    }
                                    lm40VarV = vcc.V(xz40Var);
                                }
                            }
                            lm40Var = lm40Var.e;
                        }
                    }
                    e7zVarZ = e7zVarZ.v();
                    lm40Var = (e7zVarZ == null || (tziVar = e7zVarZ.h1) == null) ? null : (wso0) tziVar.f;
                }
                nqq nqqVar2 = (nqq) lm40VarV;
                if (nqqVar2 == null) {
                    return ixf.f15540a;
                }
                int iOrdinal2 = nqqVar2.e1().ordinal();
                if (iOrdinal2 == 0) {
                    return K0(nqqVar2, i);
                }
                if (iOrdinal2 == 1) {
                    return L0(nqqVar2, i);
                }
                if (iOrdinal2 == 2) {
                    return ixf.b;
                }
                if (iOrdinal2 != 3) {
                    t9f.b();
                    return null;
                }
                ixf ixfVarL0 = L0(nqqVar2, i);
                ixf ixfVar = ixfVarL0 != ixf.f15540a ? ixfVarL0 : null;
                return ixfVar == null ? K0(nqqVar2, i) : ixfVar;
            }
        }
        return ixf.f15540a;
    }

    public static final ArrayList M(xwp xwpVar) {
        List list;
        uvp uvpVar;
        uvp uvpVar2;
        List list2 = null;
        list2 = null;
        if (xwpVar == null || (uvpVar2 = xwpVar.b) == null) {
            list = null;
        } else {
            Object obj = uvpVar2.f36361a;
            e0g0 e0g0Var = j0g0.b;
            if (obj instanceof g0g0) {
                obj = null;
            }
            list = (List) obj;
        }
        if (list == null) {
            list = iun.f15405a;
        }
        if (xwpVar != null && (uvpVar = xwpVar.c) != null) {
            Object obj2 = uvpVar.f36361a;
            e0g0 e0g0Var2 = j0g0.b;
            list2 = (List) (obj2 instanceof g0g0 ? null : obj2);
        }
        if (list2 == null) {
            list2 = iun.f15405a;
        }
        return CollectionsKt.q0(list, list2);
    }

    public static final boolean M0(nqq nqqVar) {
        xz40 xz40Var;
        tzi tziVar;
        boolean z;
        tzi tziVar2;
        ypq ypqVar = (ypq) vcc.a0(nqqVar).getFocusOwner();
        nqq nqqVarH = ypqVar.h();
        iqq iqqVarE1 = nqqVar.e1();
        if (nqqVarH == nqqVar) {
            nqqVar.a1(iqqVarE1, iqqVarE1);
            return true;
        }
        if (ebc.f7512a) {
            if ((nqqVarH == null || nqqVarH.o) && !nqqVar.o && !((ypq) vcc.a0(nqqVar).getFocusOwner()).f43042a.E()) {
                return false;
            }
        } else if (nqqVarH == null && !((ypq) vcc.a0(nqqVar).getFocusOwner()).f43042a.E()) {
            return false;
        }
        if (nqqVarH != null) {
            xz40Var = new xz40(new nqq[16]);
            if (!nqqVarH.f20279a.n) {
                xcx.b("visitAncestors called on an unattached node");
            }
            lm40 lm40Var = nqqVarH.f20279a.e;
            e7z e7zVarZ = vcc.Z(nqqVarH);
            while (e7zVarZ != null) {
                if ((((lm40) e7zVarZ.h1.g).d & 1024) != 0) {
                    while (lm40Var != null) {
                        if ((lm40Var.c & 1024) != 0) {
                            lm40 lm40VarV = lm40Var;
                            xz40 xz40Var2 = null;
                            while (lm40VarV != null) {
                                if (lm40VarV instanceof nqq) {
                                    xz40Var.b((nqq) lm40VarV);
                                } else if ((lm40VarV.c & 1024) != 0 && (lm40VarV instanceof f3k)) {
                                    int i = 0;
                                    for (lm40 lm40Var2 = ((f3k) lm40VarV).p; lm40Var2 != null; lm40Var2 = lm40Var2.f) {
                                        if ((lm40Var2.c & 1024) != 0) {
                                            i++;
                                            if (i == 1) {
                                                lm40VarV = lm40Var2;
                                            } else {
                                                if (xz40Var2 == null) {
                                                    xz40Var2 = new xz40(new lm40[16]);
                                                }
                                                if (lm40VarV != null) {
                                                    xz40Var2.b(lm40VarV);
                                                    lm40VarV = null;
                                                }
                                                xz40Var2.b(lm40Var2);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                    }
                                }
                                lm40VarV = vcc.V(xz40Var2);
                            }
                        }
                        lm40Var = lm40Var.e;
                    }
                }
                e7zVarZ = e7zVarZ.v();
                lm40Var = (e7zVarZ == null || (tziVar2 = e7zVarZ.h1) == null) ? null : (wso0) tziVar2.f;
            }
        } else {
            xz40Var = null;
        }
        Object[] objArr = new nqq[16];
        Object[] objArr2 = new nqq[16];
        if (!nqqVar.f20279a.n) {
            xcx.b("visitAncestors called on an unattached node");
        }
        lm40 lm40Var3 = nqqVar.f20279a.e;
        e7z e7zVarZ2 = vcc.Z(nqqVar);
        boolean z2 = true;
        int i2 = 0;
        int i3 = 0;
        while (e7zVarZ2 != null) {
            if ((((lm40) e7zVarZ2.h1.g).d & 1024) != 0) {
                while (lm40Var3 != null) {
                    if ((lm40Var3.c & 1024) != 0) {
                        lm40 lm40VarV2 = lm40Var3;
                        xz40 xz40Var3 = null;
                        while (lm40VarV2 != null) {
                            if (lm40VarV2 instanceof nqq) {
                                nqq nqqVar2 = (nqq) lm40VarV2;
                                if (Intrinsics.d(xz40Var != null ? Boolean.valueOf(xz40Var.j(nqqVar2)) : null, Boolean.TRUE)) {
                                    int i4 = i2 + 1;
                                    if (objArr.length < i4) {
                                        int length = objArr.length;
                                        Object[] objArr3 = new Object[Math.max(i4, length * 2)];
                                        System.arraycopy(objArr, 0, objArr3, 0, length);
                                        objArr = objArr3;
                                    }
                                    objArr[i2] = nqqVar2;
                                    i2 = i4;
                                } else {
                                    ypqVar = ypqVar;
                                    int i5 = i3 + 1;
                                    if (objArr2.length < i5) {
                                        int length2 = objArr2.length;
                                        Object[] objArr4 = new Object[Math.max(i5, length2 * 2)];
                                        System.arraycopy(objArr2, 0, objArr4, 0, length2);
                                        objArr2 = objArr4;
                                    }
                                    objArr2[i3] = nqqVar2;
                                    i3 = i5;
                                }
                                if (nqqVar2 == nqqVarH) {
                                    z2 = false;
                                }
                                z = false;
                            } else {
                                ypqVar = ypqVar;
                                z = true;
                            }
                            if (z && (lm40VarV2.c & 1024) != 0 && (lm40VarV2 instanceof f3k)) {
                                int i6 = 0;
                                for (lm40 lm40Var4 = ((f3k) lm40VarV2).p; lm40Var4 != null; lm40Var4 = lm40Var4.f) {
                                    if ((lm40Var4.c & 1024) != 0) {
                                        int i7 = i6 + 1;
                                        if (i7 == 1) {
                                            lm40VarV2 = lm40Var4;
                                            i7 = i7;
                                        } else {
                                            xz40 xz40Var4 = xz40Var3 == null ? new xz40(new lm40[16]) : xz40Var3;
                                            if (lm40VarV2 != null) {
                                                xz40Var4.b(lm40VarV2);
                                                lm40VarV2 = null;
                                            }
                                            xz40Var4.b(lm40Var4);
                                            xz40Var3 = xz40Var4;
                                        }
                                        i6 = i7;
                                    }
                                }
                                if (i6 != 1) {
                                    lm40VarV2 = vcc.V(xz40Var3);
                                }
                            } else {
                                lm40VarV2 = vcc.V(xz40Var3);
                            }
                        }
                    }
                    lm40Var3 = lm40Var3.e;
                    ypqVar = ypqVar;
                }
            }
            ypq ypqVar2 = ypqVar;
            e7zVarZ2 = e7zVarZ2.v();
            lm40Var3 = (e7zVarZ2 == null || (tziVar = e7zVarZ2.h1) == null) ? null : (wso0) tziVar.f;
            ypqVar = ypqVar2;
        }
        ypq ypqVar3 = ypqVar;
        if (z2 && nqqVarH != null && !R0(nqqVarH, false)) {
            return false;
        }
        c9x.B(nqqVar, new yip(nqqVar, (byte) 12));
        int iOrdinal = nqqVar.e1().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                ((ypq) vcc.a0(nqqVar).getFocusOwner()).k(nqqVar);
            } else if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    t9f.b();
                    return false;
                }
                ((ypq) vcc.a0(nqqVar).getFocusOwner()).k(nqqVar);
            }
        }
        if (z2 && nqqVarH != null) {
            nqqVarH.a1(iqq.f15221a, iqq.c);
        }
        if (xz40Var != null) {
            int i8 = xz40Var.c - 1;
            Object[] objArr5 = xz40Var.f41739a;
            if (i8 < objArr5.length) {
                while (i8 >= 0) {
                    nqq nqqVar3 = (nqq) objArr5[i8];
                    if (ypqVar3.h() != nqqVar) {
                        return false;
                    }
                    nqqVar3.a1(iqq.b, iqq.c);
                    i8--;
                }
            }
        }
        int i9 = i3 - 1;
        if (i9 < objArr2.length) {
            while (i9 >= 0) {
                nqq nqqVar4 = (nqq) objArr2[i9];
                if (ypqVar3.h() != nqqVar) {
                    return false;
                }
                nqqVar4.a1(nqqVar4 == nqqVarH ? iqq.f15221a : iqq.c, iqq.b);
                i9--;
            }
        }
        if (ypqVar3.h() != nqqVar) {
            return false;
        }
        nqqVar.a1(iqqVarE1, iqq.f15221a);
        return ypqVar3.h() == nqqVar;
    }

    public static final void N(dpi0 dpi0Var) {
        S(dpi0Var, Separators.RPAREN, StaticColors.INSTANCE.m123getWhite0d7_KjU());
    }

    public static final void N0(dpi0 dpi0Var, te90 te90Var, boolean z) {
        if (cy7.c() && z) {
            S(dpi0Var, te90Var.d, p0(te90Var.e));
            Q(dpi0Var);
            S(dpi0Var, te90Var.b, p0(te90Var.c));
            T0(dpi0Var);
            return;
        }
        T0(dpi0Var);
        S(dpi0Var, te90Var.b, p0(te90Var.c));
        Q(dpi0Var);
        S(dpi0Var, te90Var.d, p0(te90Var.e));
    }

    public static final void O(dpi0 dpi0Var) {
        S(dpi0Var, Separators.COMMA, StaticColors.INSTANCE.m123getWhite0d7_KjU());
    }

    public static final void O0(dpi0 dpi0Var, te90 te90Var, boolean z) {
        if (cy7.c() && z) {
            S(dpi0Var, te90Var.d, p0(te90Var.e));
            T0(dpi0Var);
            Q(dpi0Var);
            S(dpi0Var, te90Var.b, p0(te90Var.c));
            return;
        }
        S(dpi0Var, te90Var.b, p0(te90Var.c));
        Q(dpi0Var);
        T0(dpi0Var);
        S(dpi0Var, te90Var.d, p0(te90Var.e));
    }

    public static final void P(dpi0 dpi0Var) {
        if (dpi0Var.k()) {
            O(dpi0Var);
            T(dpi0Var, Separators.SP);
        }
    }

    public static final void P0(dpi0 dpi0Var, te90 te90Var, boolean z) {
        if (cy7.c() && z) {
            S(dpi0Var, te90Var.d, p0(te90Var.e));
            Q(dpi0Var);
            S(dpi0Var, te90Var.b, p0(te90Var.c));
        } else {
            S(dpi0Var, te90Var.b, p0(te90Var.c));
            Q(dpi0Var);
            S(dpi0Var, te90Var.d, p0(te90Var.e));
        }
    }

    public static final void Q(dpi0 dpi0Var) {
        S(dpi0Var, "-", StaticColors.INSTANCE.m123getWhite0d7_KjU());
    }

    public static final void Q0(dpi0 dpi0Var) {
        S(dpi0Var, ". ", StaticColors.INSTANCE.m123getWhite0d7_KjU());
    }

    public static final void R(dpi0 dpi0Var) {
        S(dpi0Var, Separators.COLON, StaticColors.INSTANCE.m123getWhite0d7_KjU());
    }

    public static final boolean R0(nqq nqqVar, boolean z) {
        int iOrdinal = nqqVar.e1().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                nqq nqqVarC0 = uzb.c0(nqqVar);
                if (!(nqqVarC0 != null ? R0(nqqVarC0, z) : true)) {
                    return false;
                }
                nqqVar.a1(iqq.b, iqq.c);
                return true;
            }
            if (iOrdinal == 2) {
                return z;
            }
            if (iOrdinal != 3) {
                t9f.b();
                return false;
            }
        }
        return true;
    }

    public static final void S(dpi0 dpi0Var, String str, long j) {
        dpi0Var.getClass();
        str.getClass();
        h83 h83Var = new h83();
        long j2 = y3d.g;
        long j3 = daq0.c;
        smk0 smk0Var = new smk0(j, j3, null, null, null, null, null, j3, new j56(0.0f), null, null, j2, k5q0.b, null, null, 17424);
        h83Var.c(str);
        ((h83) dpi0Var.f6468a).b(kng0.c(h83Var.f12607a, h83Var, smk0Var, 0));
    }

    public static final Object S0(Object obj) {
        if (obj instanceof udd) {
            e0g0 e0g0Var = j0g0.b;
            return z1x.C(((udd) obj).f35472a);
        }
        e0g0 e0g0Var2 = j0g0.b;
        return obj;
    }

    public static void T(dpi0 dpi0Var, String str) {
        S(dpi0Var, str, y3d.g);
    }

    public static final void T0(dpi0 dpi0Var) {
        S(dpi0Var, Separators.STAR, StaticColors.INSTANCE.m123getWhite0d7_KjU());
    }

    public static final GameStatistic U(d0t d0tVar) {
        Object next;
        z6m0 z6m0Var = z6m0.b;
        d0tVar.getClass();
        List list = d0tVar.p.o;
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((StatInfo) it.next()).b);
        }
        Iterator it2 = r3d.r(arrayList).iterator();
        do {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
        } while (((GameStatistic) next).f46432a != z6m0Var);
        GameStatistic gameStatistic = (GameStatistic) next;
        return gameStatistic == null ? new GameStatistic(z6m0.c, "", "", "") : gameStatistic;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public static final Object U0(oyq0 oyq0Var, float f, sjj sjjVar, j73 j73Var, zje zjeVar) {
        q2d q2dVar;
        jie0 jie0Var;
        jie0 jie0Var2;
        if (zjeVar instanceof q2d) {
            q2dVar = (q2d) zjeVar;
            int i = q2dVar.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                q2dVar.n = i - Integer.MIN_VALUE;
            } else {
                q2dVar = new q2d(zjeVar);
            }
        } else {
            q2dVar = new q2d(zjeVar);
        }
        q2d q2dVar2 = q2dVar;
        Object obj = q2dVar2.m;
        wne wneVar = wne.f39444a;
        int i2 = q2dVar2.n;
        byte b = 1;
        if (i2 != 0) {
            if (i2 == 1) {
                f = q2dVar2.l;
                jie0 jie0Var3 = q2dVar2.k;
                j73Var = q2dVar2.j;
                oyq0 oyq0Var2 = q2dVar2.i;
                z1x.P(obj);
                jie0Var = jie0Var3;
                oyq0Var = oyq0Var2;
            } else {
                if (i2 != 2) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                jie0Var2 = q2dVar2.k;
                z1x.P(obj);
            }
            jie0Var = jie0Var2;
            return new g6u0(wpm0.g(0.0f, jie0Var.f16571a));
        }
        z1x.P(obj);
        if (oyq0Var.a() < 0.01f || oyq0Var.a() == 1.0f) {
            return new g6u0(0L);
        }
        jie0Var = new jie0();
        jie0Var.f16571a = f;
        if (sjjVar != null && Math.abs(f) > 1.0f) {
            jie0 jie0Var4 = new jie0();
            l73 l73VarD = x4d0.d(0.0f, f, 28);
            ib3 ib3Var = new ib3(jie0Var4, oyq0Var, jie0Var, b);
            q2dVar2.i = oyq0Var;
            q2dVar2.j = j73Var;
            q2dVar2.k = jie0Var;
            q2dVar2.l = f;
            q2dVar2.n = 1;
            if (hhm0.o(l73VarD, sjjVar, false, ib3Var, q2dVar2) != wneVar) {
            }
            return wneVar;
        }
        return new g6u0(wpm0.g(0.0f, jie0Var.f16571a));
        if (j73Var != null) {
            agk0 agk0Var = oyq0Var.c;
            if (agk0Var.l() < 0.0f && agk0Var.l() > oyq0Var.f26070a) {
                l73 l73VarD2 = x4d0.d(agk0Var.l(), 0.0f, 30);
                Float f2 = new Float(oyq0Var.a() < 0.5f ? 0.0f : oyq0Var.f26070a);
                jb3 jb3Var = new jb3(oyq0Var, b);
                q2dVar2.i = null;
                q2dVar2.j = null;
                q2dVar2.k = jie0Var;
                q2dVar2.l = f;
                q2dVar2.n = 2;
                if (hhm0.q(l73VarD2, f2, j73Var, false, jb3Var, q2dVar2, 4) != wneVar) {
                    jie0Var2 = jie0Var;
                    jie0Var = jie0Var2;
                }
                return wneVar;
            }
        }
        return new g6u0(wpm0.g(0.0f, jie0Var.f16571a));
    }

    public static final String V(String str) {
        str.getClass();
        return "\u200e" + str;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0051  */
    /* JADX WARN: Code duplicated, block: B:76:0x00ec  */
    public static final void V0(dpi0 dpi0Var, pz10 pz10Var, boolean z) {
        T(dpi0Var, "\u2066");
        int i = 0;
        if (pz10Var instanceof kz10) {
            kz10 kz10Var = (kz10) pz10Var;
            boolean z2 = cy7.c() && z;
            List listT0 = kz10Var.f;
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
                    int i5 = kz10Var.g;
                    if (i5 <= 0) {
                        P0(dpi0Var, te90Var, z);
                    } else if (i5 == 1) {
                        N0(dpi0Var, te90Var, z);
                    } else {
                        O0(dpi0Var, te90Var, z);
                    }
                } else {
                    P0(dpi0Var, te90Var, z);
                }
                if (i != listT0.size() - 1) {
                    O(dpi0Var);
                    T(dpi0Var, Separators.SP);
                }
                i = i3;
            }
        } else if (pz10Var instanceof lz10) {
            List listT1 = ((lz10) pz10Var).f;
            if (cy7.c() && z) {
                listT1 = CollectionsKt.t0(listT1);
            }
            for (Object obj2 : listT1) {
                int i6 = i + 1;
                if (i < 0) {
                    q3d.p();
                    throw null;
                }
                P0(dpi0Var, (te90) obj2, z);
                if (i != listT1.size() - 1) {
                    O(dpi0Var);
                    T(dpi0Var, Separators.SP);
                }
                i = i6;
            }
        } else if (pz10Var instanceof mz10) {
            mz10 mz10Var = (mz10) pz10Var;
            boolean z3 = cy7.c() && z;
            List listT2 = mz10Var.f;
            if (z3) {
                listT2 = CollectionsKt.t0(listT2);
            }
            int i7 = z3 ? 0 : q3d.i(listT2);
            for (Object obj3 : listT2) {
                int i8 = i + 1;
                if (i < 0) {
                    q3d.p();
                    throw null;
                }
                te90 te90Var2 = (te90) obj3;
                if (i == i7) {
                    int i9 = gql0.f11739a;
                    int i10 = mz10Var.g;
                    if (i10 <= 0) {
                        P0(dpi0Var, te90Var2, z);
                    } else if (i10 == 1) {
                        N0(dpi0Var, te90Var2, z);
                    } else {
                        O0(dpi0Var, te90Var2, z);
                    }
                } else {
                    P0(dpi0Var, te90Var2, z);
                }
                if (i != listT2.size() - 1) {
                    O(dpi0Var);
                    T(dpi0Var, Separators.SP);
                }
                i = i8;
            }
        } else {
            if (!(pz10Var instanceof oz10)) {
                t9f.b();
                return;
            }
            if (cy7.c() && z) {
                oz10 oz10Var = (oz10) pz10Var;
                Y0(dpi0Var, oz10Var, z);
                X0(dpi0Var, oz10Var, z);
            } else {
                oz10 oz10Var2 = (oz10) pz10Var;
                X0(dpi0Var, oz10Var2, z);
                Y0(dpi0Var, oz10Var2, z);
            }
        }
        T(dpi0Var, "\u2069");
    }

    public static final void W(dpi0 dpi0Var, String str) {
        if (dpi0Var.k()) {
            Q0(dpi0Var);
        }
        S(dpi0Var, str, StaticColors.INSTANCE.m123getWhite0d7_KjU());
    }

    public static final void W0(dpi0 dpi0Var, izm0 izm0Var, boolean z) {
        T(dpi0Var, "\u2066");
        List listT0 = (cy7.c() && z) ? CollectionsKt.t0(izm0Var.d()) : izm0Var.d();
        int i = 0;
        for (Object obj : listT0) {
            int i2 = i + 1;
            if (i < 0) {
                q3d.p();
                throw null;
            }
            P0(dpi0Var, (te90) obj, z);
            if (i != listT0.size() - 1) {
                O(dpi0Var);
                T(dpi0Var, Separators.SP);
            }
            i = i2;
        }
        T(dpi0Var, "\u2069");
    }

    public static final qqf X(uof uofVar, String str) {
        if (Intrinsics.d(str, "A")) {
            return uofVar.f36011a.f25307a;
        }
        return Intrinsics.d(str, "B") ? uofVar.f36011a.b : new qqf(0, 0);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0043  */
    public static final void X0(dpi0 dpi0Var, oz10 oz10Var, boolean z) {
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
                    P0(dpi0Var, te90Var, z);
                } else if (i5 == 1) {
                    N0(dpi0Var, te90Var, z);
                } else {
                    O0(dpi0Var, te90Var, z);
                }
            } else {
                P0(dpi0Var, te90Var, z);
            }
            if (i != listT0.size() - 1) {
                O(dpi0Var);
                T(dpi0Var, Separators.SP);
            }
            i = i3;
        }
    }

    public static final String Y(slf slfVar) {
        llf llfVar = slfVar instanceof llf ? (llf) slfVar : null;
        return llfVar != null ? llfVar.d : "";
    }

    public static final void Y0(dpi0 dpi0Var, oz10 oz10Var, boolean z) {
        String str = oz10Var.g;
        boolean z2 = oz10Var.h;
        boolean z3 = oz10Var.j;
        String str2 = oz10Var.i;
        if (str.length() <= 0 && str2.length() <= 0) {
            return;
        }
        if (cy7.c() && z) {
            S(dpi0Var, str2, p0(z3));
            Q(dpi0Var);
            S(dpi0Var, str, p0(z2));
            R(dpi0Var);
            return;
        }
        R(dpi0Var);
        S(dpi0Var, str, p0(z2));
        Q(dpi0Var);
        S(dpi0Var, str2, p0(z3));
    }

    public static final boolean Z0(d0t d0tVar) {
        d0tVar.getClass();
        if (d0tVar.B) {
            return false;
        }
        return d0tVar.q.d.size() > 1 || d0tVar.r.d.size() > 1;
    }

    public static final void a(int i, fet fetVar, boolean z) {
        fet fetVar2;
        long jM113getRed0d7_KjU;
        fetVar.g0(-1911705756);
        int i2 = (fetVar.h(z) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            t53 t53VarK = ffb0.K(fetVar);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = androidx.compose.runtime.e.e(Boolean.FALSE);
                fetVar.o0(objP);
            }
            pz40 pz40Var = (pz40) objP;
            Unit unit = Unit.f46060a;
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = new nbd(pz40Var, null, (byte) 3);
                fetVar.o0(objP2);
            }
            m0x0.t(fetVar, unit, (Function2) objP2);
            s4u0 s4u0VarX = oja0.X(t53VarK, ((Boolean) pz40Var.getValue()).booleanValue(), fetVar);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = o7k0.n(s5x0.N(jm40.b, 4.0f, 0.0f, 0.0f, 0.0f, 14), 20.0f);
            if (z) {
                fetVar.e0(1096789897);
                fetVar.r(false);
                jM113getRed0d7_KjU = StaticColors.INSTANCE.m123getWhite0d7_KjU();
            } else {
                fetVar.e0(1096791015);
                jM113getRed0d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m113getRed0d7_KjU();
                fetVar.r(false);
            }
            fetVar2 = fetVar;
            dww.c(s4u0VarX, null, mm40VarN, jM113getRed0d7_KjU, fetVar2, 56, 0);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new obg((byte) 13, i, z);
        }
    }

    public static final String a0(d0t d0tVar, boolean z) {
        boolean z2 = z && cy7.c();
        rqs rqsVar = d0tVar.p;
        kts ktsVar = rqsVar.h;
        if (rqsVar.h.f18881a.length() <= 0 || ktsVar.b.length() <= 0) {
            return null;
        }
        String str = ktsVar.f18881a;
        String str2 = ktsVar.b;
        return !z2 ? kng0.l(str, " : ", str2) : kng0.l(str2, " : ", str);
    }

    public static final boolean a1(d0t d0tVar) {
        d0tVar.getClass();
        boolean z = d0tVar.B;
        List list = d0tVar.r.d;
        List list2 = d0tVar.q.d;
        if (z || list2.isEmpty() || list.isEmpty() || list2.size() <= 2) {
            return false;
        }
        if (list2 == null || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                if (((String) it.next()).length() == 0) {
                    return false;
                }
            }
        }
        if (list.size() <= 2) {
            return false;
        }
        if (list != null && list.isEmpty()) {
            return true;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            if (((String) it2.next()).length() == 0) {
                return false;
            }
        }
        return true;
    }

    public static final void b(mm40 mm40Var, bwm bwmVar, fet fetVar, int i) {
        byte b;
        mm40 mm40Var2;
        jm40 jm40Var;
        fet fetVar2 = fetVar;
        String str = bwmVar.k;
        fetVar2.g0(-1353853771);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(bwmVar) ? 32 : 16;
        }
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            jm40 jm40Var2 = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var2, 1.0f);
            zcl zclVar = qmk.f28987a;
            x5d x5dVarA = w5d.a(new qw3(4.0f, false, new gne(gqw0.k, (byte) 11)), gqw0.m, fetVar2, 0);
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
            jpm0.o(fetVar2, x5dVarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            if (str.length() > 0) {
                fetVar2.e0(-562791548);
                K(0, fetVar2, null, str);
                fetVar2.r(false);
            } else {
                fetVar2.e0(-562650281);
                fetVar2.r(false);
            }
            G(null, bwmVar.f3332a, bwmVar.c, bwmVar.e, bwmVar.g, bwmVar.i, fetVar2, 0);
            fetVar2 = fetVar;
            G(null, bwmVar.b, bwmVar.d, bwmVar.f, bwmVar.h, bwmVar.j, fetVar2, 0);
            if (bwmVar.l.length() > 0) {
                fetVar2.e0(-561943822);
                String str2 = bwmVar.l;
                long secondary = ((ThemeColors) fetVar2.k(zaq0.b)).getSecondary();
                ((g1t0) fetVar2.k(j1t0.e)).getClass();
                jm40Var = jm40Var2;
                f1t0.a(null, str2, secondary, null, 0L, null, 0L, null, 0L, 2, false, 1, 0, g1t0.d(), 0L, fetVar, 0, 438265);
                fetVar2 = fetVar;
                fetVar2.r(false);
            } else {
                jm40Var = jm40Var2;
                fetVar2.e0(-561683081);
                fetVar2.r(false);
            }
            b = 1;
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            b = 1;
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gwm(mm40Var2, bwmVar, i, b);
        }
    }

    public static final String b0(d0t d0tVar) {
        Object next;
        d0tVar.getClass();
        Iterator it = CollectionsKt.q0(d0tVar.p.n, d0tVar.w).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((cmr) next).f4620a != dmr.b);
        cmr cmrVar = (cmr) next;
        String str = cmrVar != null ? cmrVar.b : null;
        return str == null ? "" : str;
    }

    public static final void b1(dpi0 dpi0Var, kg30 kg30Var) {
        String str = kg30Var.f18223a;
        StaticColors staticColors = StaticColors.INSTANCE;
        S(dpi0Var, str, staticColors.m123getWhite0d7_KjU());
        T(dpi0Var, Separators.SP);
        String str2 = kg30Var.b;
        if (str2 != null) {
            S(dpi0Var, str2, staticColors.m123getWhite0d7_KjU());
            R(dpi0Var);
        }
        String str3 = kg30Var.c;
        if (str3 != null) {
            S(dpi0Var, str3, staticColors.m123getWhite0d7_KjU());
            R(dpi0Var);
        }
        String str4 = kg30Var.d;
        if (str4 != null) {
            S(dpi0Var, str4, staticColors.m123getWhite0d7_KjU());
        }
    }

    public static final void c(mm40 mm40Var, final tzb tzbVar, Function1 function1, fet fetVar, int i) {
        tzbVar.getClass();
        function1.getClass();
        fetVar.g0(-942820526);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(tzbVar) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        final byte b = 0;
        final byte b2 = 1;
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = dw9.j(fetVar);
            }
            gy40 gy40Var = (gy40) objP;
            boolean z = ((i2 & 112) == 32) | ((i2 & 896) == 256);
            Object objP2 = fetVar.P();
            if (z || objP2 == cl5Var) {
                objP2 = new jzb(function1, tzbVar, b);
                fetVar.o0(objP2);
            }
            d(y860.W(mm40Var, gy40Var, null, false, null, (Function0) objP2, 28), u1c.M(754672981, new ab4((Object) tzbVar, (Object) function1, (byte) 22), fetVar), u1c.M(1936905716, new xdr() { // from class: a.mzb
                @Override // a.xdr
                public final Object F(Object obj, Object obj2, Object obj3) {
                    byte b3 = b;
                    tzb tzbVar2 = tzbVar;
                    switch (b3) {
                        case 0:
                            yhg0 yhg0Var = (yhg0) obj;
                            fet fetVar2 = (fet) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            yhg0Var.getClass();
                            if ((iIntValue & 6) == 0) {
                                iIntValue |= fetVar2.g(yhg0Var) ? 4 : 2;
                            }
                            if (fetVar2.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                                mm40 mm40VarA = yhg0Var.a(1.0f, jm40.b, true);
                                zcl zclVar = qmk.f28987a;
                                v8q0.a(tzbVar2.b, s5x0.N(mm40VarA, 0.0f, 10.0f, 16.0f, 10.0f, 1), 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, ibm0.t(new y9q0(0L, qmk.r, null, j1t0.c, 0L, null, 0, 0, qmk.F, 16646109), fetVar2), fetVar2, 0, 0, 131068);
                            } else {
                                fetVar2.X();
                            }
                            break;
                        default:
                            fet fetVar3 = (fet) obj2;
                            int iIntValue2 = ((Integer) obj3).intValue();
                            ((yhg0) obj).getClass();
                            if (!fetVar3.U(1 & iIntValue2, (iIntValue2 & 17) != 16)) {
                                fetVar3.X();
                            } else if (tzbVar2.c.c) {
                                fetVar3.e0(636224856);
                                zcl zclVar2 = qmk.f28987a;
                                j0x.b(a8k0.F(R.drawable.ic_glyph_circle_warning, 0, fetVar3), null, o7k0.n(s5x0.N(jm40.b, 0.0f, 0.0f, 12.0f, 0.0f, 11), 16.0f), null, gqw0.f1, 0.0f, new m78(((ThemeColors) fetVar3.k(zaq0.b)).getWarning(), 5), fetVar3, 24632, 40);
                                fetVar3.r(false);
                            } else {
                                fetVar3.e0(636660623);
                                fetVar3.r(false);
                            }
                            break;
                    }
                    return Unit.f46060a;
                }
            }, fetVar), u1c.M(-1175828845, new xdr() { // from class: a.mzb
                @Override // a.xdr
                public final Object F(Object obj, Object obj2, Object obj3) {
                    byte b3 = b2;
                    tzb tzbVar2 = tzbVar;
                    switch (b3) {
                        case 0:
                            yhg0 yhg0Var = (yhg0) obj;
                            fet fetVar2 = (fet) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            yhg0Var.getClass();
                            if ((iIntValue & 6) == 0) {
                                iIntValue |= fetVar2.g(yhg0Var) ? 4 : 2;
                            }
                            if (fetVar2.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                                mm40 mm40VarA = yhg0Var.a(1.0f, jm40.b, true);
                                zcl zclVar = qmk.f28987a;
                                v8q0.a(tzbVar2.b, s5x0.N(mm40VarA, 0.0f, 10.0f, 16.0f, 10.0f, 1), 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, ibm0.t(new y9q0(0L, qmk.r, null, j1t0.c, 0L, null, 0, 0, qmk.F, 16646109), fetVar2), fetVar2, 0, 0, 131068);
                            } else {
                                fetVar2.X();
                            }
                            break;
                        default:
                            fet fetVar3 = (fet) obj2;
                            int iIntValue2 = ((Integer) obj3).intValue();
                            ((yhg0) obj).getClass();
                            if (!fetVar3.U(1 & iIntValue2, (iIntValue2 & 17) != 16)) {
                                fetVar3.X();
                            } else if (tzbVar2.c.c) {
                                fetVar3.e0(636224856);
                                zcl zclVar2 = qmk.f28987a;
                                j0x.b(a8k0.F(R.drawable.ic_glyph_circle_warning, 0, fetVar3), null, o7k0.n(s5x0.N(jm40.b, 0.0f, 0.0f, 12.0f, 0.0f, 11), 16.0f), null, gqw0.f1, 0.0f, new m78(((ThemeColors) fetVar3.k(zaq0.b)).getWarning(), 5), fetVar3, 24632, 40);
                                fetVar3.r(false);
                            } else {
                                fetVar3.e0(636660623);
                                fetVar3.r(false);
                            }
                            break;
                    }
                    return Unit.f46060a;
                }
            }, fetVar), fetVar, 3504);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ywa(mm40Var, tzbVar, function1, i, (byte) 6);
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0017  */
    public static final String c0(d0t d0tVar) {
        d0tVar.getClass();
        String str = (String) CollectionsKt.firstOrNull(f0(d0tVar));
        if (str == null) {
            str = d0tVar.q.b;
        } else {
            if (!d0tVar.B) {
                str = null;
            }
            if (str == null) {
                str = d0tVar.q.b;
            }
        }
        return StringsKt.u0(str).toString();
    }

    public static final y2m c1(xah xahVar, boolean z) {
        xahVar.getClass();
        long j = xahVar.g;
        int i = xahVar.e;
        int i2 = xahVar.d;
        String strM0 = xahVar.f;
        if (xahVar.i == 243) {
            strM0 = StringsKt.m0(strM0, ". ", strM0);
        }
        n0x n0xVar = new n0x(xahVar.l);
        String strValueOf = String.valueOf(i2);
        String strValueOf2 = String.valueOf(i);
        return new y2m(j, strM0, z ? new n0x(xahVar.b) : new n0x(xahVar.f40554a), z ? new m0x(R.drawable.cybergames_tablet_champ_placeholder, null, 6) : new m0x(R.drawable.cybergames_champ_placeholder, null, 6), xahVar.m, i2 > 0, i > 0, strValueOf, strValueOf2, xahVar.h, xahVar.k, n0xVar, 4096);
    }

    public static final void d(mm40 mm40Var, ugd ugdVar, ugd ugdVar2, ugd ugdVar3, fet fetVar, int i) {
        fetVar.g0(1589789479);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarW = o7k0.w(o7k0.g(mm40VarD, 48.0f, 0.0f, 2), null, false, 3);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar, 48);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarW);
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
            zhg0 zhg0Var = zhg0.f44392a;
            ugdVar.F(zhg0Var, fetVar, 54);
            ugdVar2.F(zhg0Var, fetVar, 54);
            ugdVar3.F(zhg0Var, fetVar, 54);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new nzb(mm40Var, ugdVar, ugdVar2, ugdVar3, i, (byte) 2);
        }
    }

    public static final String d0(d0t d0tVar, String str) {
        d0tVar.getClass();
        str.getClass();
        String str2 = d0tVar.i;
        String str3 = d0tVar.c;
        String str4 = d0tVar.f;
        String str5 = d0tVar.d;
        if (str2.length() > 0) {
            str = str2;
        } else if (str5.length() > 0 && str4.length() > 0) {
            str = String.format("%s.%s", Arrays.copyOf(new Object[]{str5, str4}, 2));
        } else if (str5.length() > 0) {
            str = str5;
        } else if (str4.length() > 0) {
            str = str4;
        } else if (str3.length() > 0) {
            str = String.format("%s %s", Arrays.copyOf(new Object[]{str, str3}, 2));
        }
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean z2 = str.charAt(!z ? i : length) <= ' ';
            if (z) {
                if (!z2) {
                    break;
                }
                length--;
            } else if (z2) {
                i++;
            } else {
                z = true;
            }
        }
        str.subSequence(i, length + 1).toString();
        return str;
    }

    public static final nyg d1(xah xahVar) {
        String str = xahVar.f40554a;
        String str2 = xahVar.b;
        int i = xahVar.c;
        String str3 = xahVar.f;
        long j = xahVar.g;
        int i2 = xahVar.h;
        long j2 = xahVar.i;
        String str4 = xahVar.j;
        return new nyg(i, 0, i2, 2, j, j2, xahVar.k, str, str2, str3, str4, xahVar.l, true, xahVar.n);
    }

    public static final void e(boolean z, Function0 function0, nyq0 nyq0Var, long j, xdr xdrVar, ugd ugdVar, fet fetVar, int i) {
        ugd ugdVar2;
        long j2;
        long jM121getTransparent0d7_KjU;
        int i2;
        fetVar.g0(649535781);
        byte b = 4;
        int i3 = i | (fetVar.h(z) ? 4 : 2) | (fetVar.d(56.0f) ? 32 : 16) | (fetVar.g(nyq0Var) ? 2048 : 1024) | 8192;
        if (fetVar.U(i3 & 1, (599187 & i3) != 599186)) {
            fetVar.Z();
            if ((i & 1) == 0 || fetVar.B()) {
                jM121getTransparent0d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m121getTransparent0d7_KjU();
                i2 = i3 & (-57345);
            } else {
                fetVar.X();
                i2 = i3 & (-57345);
                jM121getTransparent0d7_KjU = j;
            }
            fetVar.s();
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = jgk0.b(new rd7(nyq0Var, z, b));
                fetVar.o0(objP);
            }
            l7m0 l7m0Var = (l7m0) objP;
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, jm40.b);
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
            if (xdrVar == null) {
                fetVar.e0(1765700447);
            } else {
                fetVar.e0(-912873246);
                Boolean bool = (Boolean) l7m0Var.getValue();
                bool.getClass();
                xdrVar.F(bool, fetVar, 48);
            }
            fetVar.r(false);
            if (z) {
                fetVar.e0(1765787279);
                ugdVar2 = ugdVar;
                int i4 = ((i2 >> 3) & 14) | 24576 | (i2 & 7168);
                j2 = jM121getTransparent0d7_KjU;
                g(j2, ((Boolean) function0.invoke()).booleanValue(), nyq0Var, u1c.M(-474353267, new l2d(ugdVar2, nyq0Var), fetVar), fetVar, i4);
                fetVar.r(false);
            } else {
                ugdVar2 = ugdVar;
                j2 = jM121getTransparent0d7_KjU;
                fetVar.e0(1766539091);
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            ugdVar2 = ugdVar;
            fetVar.X();
            j2 = j;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new m2d(z, function0, nyq0Var, j2, xdrVar, ugdVar2, i);
        }
    }

    public static final float e0(oe9 oe9Var) {
        int iOrdinal = oe9Var.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
            zcl zclVar = qmk.f28987a;
            return 8.0f;
        }
        if (iOrdinal == 3) {
            zcl zclVar2 = qmk.f28987a;
            return 4.0f;
        }
        t9f.b();
        return 0.0f;
    }

    public static final ful e1(int i) {
        switch (i) {
            case 0:
                return ful.e;
            case 1:
                return ful.f;
            case 2:
                return ful.g;
            case 3:
                return ful.h;
            case 4:
                return ful.i;
            case 5:
                return ful.j;
            case 6:
                return ful.k;
            default:
                return ful.e;
        }
    }

    public static final void f(mm40 mm40Var, jan janVar, Function1 function1, fet fetVar, int i) {
        int i2;
        jr8 jr8Var;
        boolean z;
        fet fetVar2 = fetVar;
        fetVar2.g0(-267851405);
        if ((i & 6) == 0) {
            i2 = (fetVar2.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(janVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.i(function1) ? 256 : 128;
        }
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zfn zfnVar = zaq0.b;
            long backgroundContent = ((ThemeColors) fetVar2.k(zfnVar)).getBackgroundContent();
            zcl zclVar = qmk.k;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarJ = s5x0.J(i120.Q(mm40VarD, backgroundContent, new ugg0(zclVar, zclVar, zclVar, zclVar)), 8.0f);
            zx7 zx7Var = gqw0.f11754a;
            tj30 tj30VarC = zq8.c(zx7Var, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarJ);
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
            jpm0.o(fetVar2, tj30VarC, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            jr8 jr8Var2 = jr8.f16991a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarN = o7k0.n(jr8Var2.b(jm40Var, zx7Var), 64.0f);
            zcl zclVar2 = qmk.g;
            mm40 mm40VarE = h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarN);
            qan qanVar = janVar.d;
            boolean z3 = janVar.g;
            mm40 mm40VarE2 = mm40VarE.e(i120.Q(jm40Var, qanVar.f28404a, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)));
            nsm0.k(janVar.f16198a, janVar.b, function1, u1c.M(1679782932, new ft0(mm40VarE2, (byte) 5), fetVar2), u1c.M(-822308117, new d0n((Object) janVar, (Object) mm40VarE2, (byte) 21), fetVar2), fetVar2, (i2 & 896) | 27648);
            if (z3) {
                fetVar2.e0(321095771);
                mm40 mm40VarJ2 = s5x0.J(i120.Q(s5x0.J(i120.Q(o7k0.n(jr8Var2.b(jm40Var, zx7Var), 64.0f), ((ThemeColors) fetVar2.k(zfnVar)).getBackgroundLight60(), new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), 16.0f), ((ThemeColors) fetVar2.k(zfnVar)).getBackgroundContent(), vgg0.f37379a), 8.0f);
                jr8Var = jr8Var2;
                j0x.b(a8k0.F(R.drawable.ic_glyph_technical_works, 0, fetVar2), "", mm40VarJ2, null, null, 0.0f, null, fetVar, 56, 120);
                fetVar2 = fetVar;
                fetVar2.r(false);
            } else {
                jr8Var = jr8Var2;
                fetVar2.e0(321795689);
                fetVar2.r(false);
            }
            boolean zH = fetVar2.h(z3);
            Object objP = fetVar2.P();
            if (zH || objP == ukd.f35823a) {
                objP = Float.valueOf(z3 ? 0.6f : 1.0f);
                fetVar2.o0(objP);
            }
            mm40 mm40VarN2 = epv0.N(s5x0.N(jr8Var.b(o7k0.d(jm40Var, 1.0f), gqw0.d), 74.0f, 0.0f, 36.0f, 0.0f, 10), ((Number) objP).floatValue());
            x5d x5dVarA = w5d.a(new qw3(6.0f, true, new jf4((byte) 14)), gqw0.m, fetVar2, 0);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarN2);
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
            if (janVar.e.length() > 0) {
                fetVar2.e0(1605315707);
                j6n.h(janVar.e, rpo0.f30897a, null, 0, 0, fetVar2, 48, 28);
                z = false;
                fetVar2.r(false);
            } else {
                z = false;
                fetVar2.e0(1605492531);
                fetVar2.r(false);
            }
            String str = janVar.f;
            ((g1t0) fetVar2.k(j1t0.e)).getClass();
            v8q0.a(str, null, ((ThemeColors) fetVar2.k(zfnVar)).getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.m(), fetVar, 0, 0, 131066);
            fetVar2 = fetVar;
            fetVar2.r(true);
            if (z3) {
                fetVar2.e0(323102153);
                fetVar2.r(false);
            } else {
                fetVar2.e0(322773181);
                dww.c(a8k0.F(R.drawable.ic_glyph_chevron_right_small, 0, fetVar2), "", s5x0.N(jr8Var.b(jm40Var, gqw0.c), 0.0f, 18.0f, 0.0f, 0.0f, 13), ((ThemeColors) fetVar2.k(zfnVar)).getSecondary(), fetVar2, 56, 0);
                fetVar2.r(false);
            }
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ikl((Object) mm40Var, (Object) janVar, (Object) function1, i, (byte) 26);
        }
    }

    public static final List f0(d0t d0tVar) {
        List listSplit$default;
        Object next;
        String str;
        d0tVar.getClass();
        Iterator it = CollectionsKt.q0(d0tVar.p.n, d0tVar.w).iterator();
        do {
            listSplit$default = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((cmr) next).f4620a != dmr.i);
        cmr cmrVar = (cmr) next;
        if (cmrVar != null && (str = cmrVar.b) != null) {
            listSplit$default = StringsKt__StringsKt.split$default(str, new String[]{Separators.SLASH}, false, 0, 6, null);
        }
        return listSplit$default == null ? iun.f15405a : listSplit$default;
    }

    public static final tqk f1(List list) {
        ArrayList arrayListU = twn.u(list);
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((xah) obj).n) {
                arrayListU.add(obj);
            } else {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(d1((xah) it.next()));
        }
        ArrayList arrayList3 = new ArrayList(r3d.q(arrayListU, 10));
        Iterator it2 = arrayListU.iterator();
        while (it2.hasNext()) {
            arrayList3.add(d1((xah) it2.next()));
        }
        return new tqk(arrayList3, arrayList2);
    }

    public static final void g(long j, boolean z, nyq0 nyq0Var, ugd ugdVar, fet fetVar, int i) {
        int i2;
        boolean z2;
        fetVar.g0(1217783083);
        if ((i & 6) == 0) {
            i2 = (fetVar.d(56.0f) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.f(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            z2 = z;
            i2 |= fetVar.h(z2) ? 256 : 128;
        } else {
            z2 = z;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.g(nyq0Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.i(ugdVar) ? 16384 : 8192;
        }
        byte b = 0;
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            float fW0 = ((w6k) fetVar.k(bmd.h)).w0(56.0f);
            if (fW0 < 0.0f) {
                fW0 = 0.0f;
            }
            Boolean boolValueOf = Boolean.valueOf(z2);
            int i3 = i2 & 7168;
            boolean zD = (i3 == 2048) | fetVar.d(fW0);
            Object objP = fetVar.P();
            yje yjeVar = null;
            cl5 cl5Var = ukd.f35823a;
            if (zD || objP == cl5Var) {
                objP = new o2d(nyq0Var, fW0, yjeVar, b);
                fetVar.o0(objP);
            }
            m0x0.t(fetVar, boolValueOf, (Function2) objP);
            ma80 ma80Var = ma80.f21447a;
            boolean z3 = i3 == 2048;
            Object objP2 = fetVar.P();
            if (z3 || objP2 == cl5Var) {
                objP2 = new lya(nyq0Var, (byte) 23);
                fetVar.o0(objP2);
            }
            wel welVarB = uel.b((Function1) objP2, fetVar);
            boolean z4 = i3 == 2048;
            Object objP3 = fetVar.P();
            if (z4 || objP3 == cl5Var) {
                objP3 = new p2d(nyq0Var, yjeVar, b);
                fetVar.o0(objP3);
            }
            gmn0.a(uel.a(jm40.b, welVarB, ma80Var, false, false, null, (xdr) objP3, 188), null, j, 0L, 0.0f, 0.0f, null, u1c.M(1596965616, new l2d(nyq0Var, ugdVar), fetVar), fetVar, ((i2 << 3) & 896) | 12582912, 122);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new l2m(j, z, nyq0Var, ugdVar, i);
        }
    }

    public static final long g0(oe9 oe9Var) {
        int iOrdinal = oe9Var.ordinal();
        if (iOrdinal == 0) {
            zcl zclVar = qmk.f28987a;
            return qbc.i(24.0f, 24.0f);
        }
        if (iOrdinal == 1 || iOrdinal == 2) {
            zcl zclVar2 = qmk.f28987a;
            return qbc.i(20.0f, 20.0f);
        }
        if (iOrdinal == 3) {
            zcl zclVar3 = qmk.f28987a;
            return qbc.i(16.0f, 16.0f);
        }
        t9f.b();
        return 0L;
    }

    public static final vqr g1(mca mcaVar, ig30 ig30Var) {
        lrr lrrVar;
        if (mcaVar instanceof pca) {
            pca pcaVar = (pca) mcaVar;
            lrrVar = new lrr(pcaVar.e, pcaVar.f, pcaVar.i, pcaVar.j, pcaVar.k, "");
        } else if (mcaVar instanceof tca) {
            tca tcaVar = (tca) mcaVar;
            lrrVar = new lrr(tcaVar.f, tcaVar.h, tcaVar.d, tcaVar.e, tcaVar.j, tcaVar.g);
        } else if (mcaVar instanceof xca) {
            xca xcaVar = (xca) mcaVar;
            lrrVar = new lrr(xcaVar.n, xcaVar.o, xcaVar.j, xcaVar.k, xcaVar.r, xcaVar.m);
        } else if (mcaVar instanceof gda) {
            gda gdaVar = (gda) mcaVar;
            lrrVar = new lrr(gdaVar.g, gdaVar.h, gdaVar.e, gdaVar.f, gdaVar.i, "");
        } else if (mcaVar instanceof hda) {
            hda hdaVar = (hda) mcaVar;
            lrrVar = new lrr(hdaVar.h, hdaVar.i, hdaVar.e, hdaVar.f, hdaVar.l, "");
        } else {
            if (!(mcaVar instanceof ida)) {
                t9f.b();
                return null;
            }
            ida idaVar = (ida) mcaVar;
            lrrVar = new lrr(idaVar.c, idaVar.d, idaVar.f14574a, idaVar.b, idaVar.f, "");
        }
        String str = lrrVar.b;
        str.getClass();
        dpi0 dpi0Var = new dpi0((byte) 15);
        h83 h83Var = (h83) dpi0Var.f6468a;
        String str2 = lrrVar.f20546a;
        if (str2.length() > 0) {
            uzb.b0(dpi0Var, str2);
        }
        if (!StringsKt.W(str)) {
            uzb.b0(dpi0Var, str);
        }
        String str3 = lrrVar.c;
        if (str3.length() > 0) {
            uzb.b0(dpi0Var, str3);
        }
        String str4 = lrrVar.d;
        if (str4.length() > 0) {
            uzb.b0(dpi0Var, str4);
        }
        String str5 = lrrVar.e;
        if (str5.length() > 0) {
            uzb.b0(dpi0Var, str5);
        }
        String str6 = lrrVar.f;
        if (str6.length() > 0) {
            if (dpi0Var.k()) {
                uzb.W(dpi0Var, ". ");
            }
            h83 h83Var2 = new h83();
            long j = y3d.g;
            long j2 = daq0.c;
            pz40 pz40Var = s6t0.f31722a;
            smk0 smk0Var = new smk0(StaticColors.INSTANCE.m123getWhite0d7_KjU(), j2, null, null, null, null, null, j2, new j56(0.0f), null, null, j, k5q0.b, null, null, 17424);
            y9q0 y9q0Var = new y9q0(0L, qmk.p, null, j1t0.f15753a, 0L, null, 0, 0, qmk.C, 16646109);
            h83Var2.c(str6);
            StringBuilder sb = h83Var2.f12607a;
            int length = sb.length();
            h83Var2.a(smk0Var, 0, length);
            h83Var2.a(y9q0Var.f42262a, 0, length);
            sb.length();
            h83Var.b(h83Var2.h());
        }
        return new vqr(h83Var.h(), ig30Var);
    }

    public static final void h(mm40 mm40Var, m5h m5hVar, xcz xczVar, float f, fet fetVar, int i) {
        xcz xczVar2;
        float f2;
        xcz xczVarA;
        int i2;
        float f3;
        fetVar.g0(1878283725);
        int i3 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(m5hVar) ? 32 : 16) | 1152;
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            fetVar.Z();
            if ((i & 1) == 0 || fetVar.B()) {
                xczVarA = ddz.a(0, 0, fetVar, 0, 3);
                i2 = i3 & (-8065);
                f3 = xfn.a(fetVar).c;
            } else {
                fetVar.X();
                xczVarA = xczVar;
                i2 = i3 & (-8065);
                f3 = f;
            }
            fetVar.s();
            fetVar.e0(1116830150);
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            lh80 lh80VarT = s5x0.t(f3, 0.0f, 2);
            zcl zclVar = qmk.f28987a;
            qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
            boolean z = (i2 & 112) == 32;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new hfg(m5hVar, (byte) 12);
                fetVar.o0(objP);
            }
            b8k0.f(mm40VarD, xczVarA, lh80VarT, false, qw3Var, null, null, false, null, (Function1) objP, fetVar, 0, Response.NOT_ACCEPTABLE_HERE);
            fetVar.r(false);
            xczVar2 = xczVarA;
            f2 = f3;
        } else {
            fetVar.X();
            xczVar2 = xczVar;
            f2 = f;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new a2d(mm40Var, (Object) m5hVar, xczVar2, f2, i, (byte) 1);
        }
    }

    public static final cex h0(int i) {
        if (i != 1) {
            return i != 2 ? cex.c : cex.b;
        }
        return cex.f4233a;
    }

    public static final void i(dsv dsvVar, Function1 function1, fet fetVar, int i) {
        int i2;
        long jM121getTransparent0d7_KjU;
        long textPrimary;
        fet fetVar2 = fetVar;
        fetVar2.g0(-1902441570);
        if ((i & 6) == 0) {
            i2 = i | ((i & 8) == 0 ? fetVar2.g(dsvVar) : fetVar2.i(dsvVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.i(function1) ? 32 : 16;
        }
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarT = o7k0.t(o7k0.e(jm40.b, 32.0f), 64.0f, 100.0f);
            boolean z = dsvVar.c;
            if (z) {
                fetVar2.e0(1409729125);
                jM121getTransparent0d7_KjU = ((ThemeColors) fetVar2.k(zaq0.b)).getPrimary();
                fetVar2.r(false);
            } else {
                fetVar2.e0(1409729961);
                fetVar2.r(false);
                jM121getTransparent0d7_KjU = StaticColors.INSTANCE.m121getTransparent0d7_KjU();
            }
            zcl zclVar2 = qmk.e;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarL = s5x0.L(i120.Q(mm40VarT, jM121getTransparent0d7_KjU, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), 8.0f, 0.0f, 2);
            boolean z2 = ((i2 & 14) == 4 || ((i2 & 8) != 0 && fetVar2.i(dsvVar))) | ((i2 & 112) == 32);
            Object objP = fetVar2.P();
            if (z2 || objP == ukd.f35823a) {
                objP = new wqv(function1, dsvVar, (byte) 3);
                fetVar2.o0(objP);
            }
            mm40 mm40VarF = phu0.F(mm40VarL, null, null, false, null, (Function0) objP, fetVar2, 0, 15);
            thg0 thg0VarA = shg0.a(uc9.e, gqw0.k, fetVar2, 54);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarF);
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
            String str = dsvVar.f6632a;
            x7z x7zVar = new x7z(1.0f, false);
            if (z) {
                fetVar2.e0(-1160114317);
                textPrimary = ((ThemeColors) fetVar2.k(zaq0.b)).getPrimaryForeground();
            } else {
                fetVar2.e0(-1160113011);
                textPrimary = ((ThemeColors) fetVar2.k(zaq0.b)).getTextPrimary();
            }
            fetVar2.r(false);
            v8q0.a(str, x7zVar, textPrimary, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.p, null, j1t0.f15753a, 0L, null, 0, 0, qmk.C, 16646109), fetVar, 0, 24960, 110584);
            fetVar2 = fetVar;
            if (kpb.u(dsvVar.b)) {
                fetVar2.e0(-1603589945);
                a(0, fetVar2, z);
                fetVar2.r(false);
            } else {
                fetVar2.e0(-1603535168);
                fetVar2.r(false);
            }
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new n0n((Object) dsvVar, (Object) function1, i, (byte) 24);
        }
    }

    public static final long i0(d0t d0tVar) {
        d0tVar.getClass();
        long j = d0tVar.m;
        return j == 0 ? d0tVar.f5282a : j;
    }

    public static final void j(mm40 mm40Var, moh mohVar, Function1 function1, fet fetVar, int i) {
        function1.getClass();
        fetVar.g0(-287143387);
        int i2 = i | 6 | (fetVar.g(mohVar) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            if (mohVar instanceof koh) {
                fetVar.e0(1286420519);
                pzb.f(((koh) mohVar).f18629a, function1, fetVar, i2 & 910);
                fetVar.r(false);
            } else {
                if (!mohVar.equals(loh.f20389a)) {
                    throw b1j.f(-1066883083, fetVar, false);
                }
                fetVar.e0(1286644184);
                uzb.l(6, fetVar);
                fetVar.r(false);
            }
            mm40Var = jm40.b;
        } else {
            fetVar.X();
        }
        mm40 mm40Var2 = mm40Var;
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new coh(mm40Var2, mohVar, function1, i, (byte) 1);
        }
    }

    public static final long j0(i0t i0tVar) {
        i0tVar.getClass();
        Long l = i0tVar.n;
        if (l != null) {
            return l.longValue();
        }
        bds bdsVar = i0tVar.f13963a;
        Long lValueOf = bdsVar != null ? Long.valueOf(bdsVar.f2414a) : null;
        if (lValueOf != null) {
            return lValueOf.longValue();
        }
        return 0L;
    }

    public static final void k(int i, fet fetVar, a4x a4xVar, mm40 mm40Var) {
        fetVar.g0(-447038097);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? fetVar.g(a4xVar) : fetVar.i(a4xVar) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            int i3 = i2 >> 3;
            byte b = 14;
            l7m0 l7m0VarB0 = ozb.b0(a4xVar, fetVar, i3 & 14);
            boolean z = fetVar.k(bmd.n) == k6z.b;
            zcl zclVar = qmk.f28987a;
            thg0 thg0VarA = shg0.a(new qw3(2.0f, true, new jf4(b)), gqw0.j, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC0 = kbc.c0(fetVar, jm40Var);
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
            fetVar.e0(956644921);
            int i4 = 0;
            for (Object obj : (List) l7m0VarB0.getValue()) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    q3d.p();
                    throw null;
                }
                fetVar.b0(378402096, Integer.valueOf(i4));
                vdb.x(null, (oem) obj, z, fetVar, 0);
                fetVar.r(false);
                i4 = i5;
            }
            fetVar.r(false);
            fetVar.r(true);
            mm40Var = jm40Var;
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zph(mm40Var, a4xVar, i, (byte) 9);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0055, code lost:
    
        if (r1.equals("Dust2") == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x005a, code lost:
    
        return a.mof.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x000f, code lost:
    
        if (r1.equals("Dust_2") == false) goto L50;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final a.uof k0(java.lang.String r1) {
        /*
            int r0 = r1.hashCode()
            switch(r0) {
                case -1990060279: goto L73;
                case -685180305: goto L67;
                case 2439553: goto L5b;
                case 66399136: goto L4f;
                case 81068520: goto L43;
                case 594574085: goto L37;
                case 802060952: goto L2b;
                case 1966065220: goto L1f;
                case 2016290848: goto L13;
                case 2058374661: goto L9;
                default: goto L7;
            }
        L7:
            goto L7b
        L9:
            java.lang.String r0 = "Dust_2"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L58
            goto L7b
        L13:
            java.lang.String r0 = "Vertigo"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L1c
            goto L7b
        L1c:
            a.tof r1 = a.tof.f
            return r1
        L1f:
            java.lang.String r0 = "Anubis"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L28
            goto L7b
        L28:
            a.lof r1 = a.lof.f
            return r1
        L2b:
            java.lang.String r0 = "Ancient"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L34
            goto L7b
        L34:
            a.kof r1 = a.kof.f
            return r1
        L37:
            java.lang.String r0 = "Overpass"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L40
            goto L7b
        L40:
            a.rof r1 = a.rof.f
            return r1
        L43:
            java.lang.String r0 = "Train"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L4c
            goto L7b
        L4c:
            a.sof r1 = a.sof.f
            return r1
        L4f:
            java.lang.String r0 = "Dust2"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L58
            goto L7b
        L58:
            a.mof r1 = a.mof.f
            return r1
        L5b:
            java.lang.String r0 = "Nuke"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L64
            goto L7b
        L64:
            a.qof r1 = a.qof.f
            return r1
        L67:
            java.lang.String r0 = "Inferno"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L70
            goto L7b
        L70:
            a.nof r1 = a.nof.f
            return r1
        L73:
            java.lang.String r0 = "Mirage"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L7e
        L7b:
            a.pof r1 = a.pof.f
            return r1
        L7e:
            a.oof r1 = a.oof.f
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: a.qzb.k0(java.lang.String):a.uof");
    }

    public static final void l(b9l b9lVar, fet fetVar, int i) {
        int i2;
        fetVar.g0(-1614270264);
        byte b = 4;
        if ((i & 6) == 0) {
            i2 = (fetVar.g(b9lVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = m0x0.I(kotlin.coroutines.g.f46065a, fetVar);
                fetVar.o0(objP);
            }
            vne vneVar = (vne) objP;
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE0 = o2e.e0(s5x0.N(o7k0.e(jm40.b, 258.0f), 0.0f, 4.0f, 0.0f, 4.0f, 5), "DOTA_STAGE");
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = new n2l((byte) 9);
                fetVar.o0(objP2);
            }
            Function1 function1 = (Function1) objP2;
            Object objP3 = fetVar.P();
            if (objP3 == cl5Var) {
                objP3 = new n2l((byte) 10);
                fetVar.o0(objP3);
            }
            Function1 function2 = (Function1) objP3;
            Object objP4 = fetVar.P();
            if (objP4 == cl5Var) {
                objP4 = new n2l((byte) 11);
                fetVar.o0(objP4);
            }
            Function1 function3 = (Function1) objP4;
            boolean zI = fetVar.i(vneVar) | ((i2 & 14) == 4);
            Object objP5 = fetVar.P();
            if (zI || objP5 == cl5Var) {
                objP5 = new ngh(b9lVar, vneVar, (byte) 20);
                fetVar.o0(objP5);
            }
            dwi0.c(function1, mm40VarE0, function2, function3, (Function1) objP5, fetVar, 3462, 0);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o2l(b9lVar, i, b);
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x005b  */
    /* JADX WARN: Code duplicated, block: B:17:0x005f  */
    /* JADX WARN: Code duplicated, block: B:19:0x006b  */
    public static final j83 l0(ctf0 ctf0Var, kg30 kg30Var, boolean z, boolean z2, d3h0 d3h0Var, String str, String str2, boolean z3) {
        izm0 izm0Var;
        ctf0Var.getClass();
        dpi0 dpi0Var = new dpi0((byte) 15);
        if (!z) {
            S(dpi0Var, str2, StaticColors.INSTANCE.m123getWhite0d7_KjU());
            if (kg30Var != null) {
                if (dpi0Var.k()) {
                    Q0(dpi0Var);
                }
                b1(dpi0Var, kg30Var);
            }
        } else if (z2) {
            S(dpi0Var, ctf0Var.b.a(R.string.game_end, Arrays.copyOf(new Object[0], 0)), StaticColors.INSTANCE.m123getWhite0d7_KjU());
        } else {
            if (str.length() > 0) {
                P(dpi0Var);
                S(dpi0Var, str, StaticColors.INSTANCE.m123getWhite0d7_KjU());
            }
            if (d3h0Var != null) {
                if (d3h0Var instanceof pz10) {
                    pz10 pz10Var = (pz10) d3h0Var;
                    if (!pz10Var.d().isEmpty()) {
                        P(dpi0Var);
                        I0(dpi0Var);
                        V0(dpi0Var, pz10Var, z3);
                        N(dpi0Var);
                    } else if (d3h0Var instanceof izm0) {
                        izm0Var = (izm0) d3h0Var;
                        if (!izm0Var.d().isEmpty()) {
                            P(dpi0Var);
                            I0(dpi0Var);
                            W0(dpi0Var, izm0Var, z3);
                            N(dpi0Var);
                        }
                    }
                } else if (d3h0Var instanceof izm0) {
                    izm0Var = (izm0) d3h0Var;
                    if (!izm0Var.d().isEmpty()) {
                        P(dpi0Var);
                        I0(dpi0Var);
                        W0(dpi0Var, izm0Var, z3);
                        N(dpi0Var);
                    }
                }
            }
            if (kg30Var != null) {
                if (dpi0Var.k()) {
                    Q0(dpi0Var);
                }
                b1(dpi0Var, kg30Var);
            }
        }
        return ((h83) dpi0Var.f6468a).h();
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0129  */
    /* JADX WARN: Code duplicated, block: B:40:0x012c  */
    /* JADX WARN: Code duplicated, block: B:44:0x013c  */
    public static final void m(mm40 mm40Var, bpl bplVar, Function0 function0, fet fetVar, int i) {
        cl5 cl5Var;
        boolean z;
        boolean zI;
        Object objP;
        fet fetVar2 = fetVar;
        bplVar.getClass();
        fetVar2.g0(1114917919);
        int i2 = i | (fetVar2.g(bplVar) ? 32 : 16) | (fetVar2.i(function0) ? 256 : 128);
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            long backgroundContent = ((ThemeColors) fetVar2.k(zaq0.b)).getBackgroundContent();
            Object objP2 = fetVar2.P();
            cl5 cl5Var2 = ukd.f35823a;
            if (objP2 == cl5Var2) {
                objP2 = new ngk0();
                fetVar2.o0(objP2);
            }
            ngk0 ngk0Var = (ngk0) objP2;
            Object objP3 = fetVar2.P();
            if (objP3 == cl5Var2) {
                objP3 = androidx.compose.runtime.e.e(new y3d(backgroundContent));
                fetVar2.o0(objP3);
            }
            pz40 pz40Var = (pz40) objP3;
            Context context = (Context) fetVar2.k(dy2.b);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = o7k0.n(mm40Var, 56.0f);
            long j = ((y3d) pz40Var.getValue()).f41946a;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarS = i120.S(i120.Q(mm40VarN, j, ugg0Var), 1.0f, ((StaticColors) fetVar2.k(m8m0.f21378a)).m126getWhite200d7_KjU(), ugg0Var);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
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
            jpm0.o(fetVar2, tj30VarC, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            mm40 mm40VarJ = lgb.J(o7k0.d(jm40.b, 1.0f), ugg0Var);
            boolean z2 = (i2 & 896) == 256;
            Object objP4 = fetVar2.P();
            if (z2) {
                cl5Var = cl5Var2;
            } else {
                cl5Var = cl5Var2;
                if (objP4 == cl5Var) {
                }
                mm40 mm40VarW = y860.W(mm40VarJ, null, null, false, null, (Function0) objP4, 28);
                String str = bplVar.c;
                pge pgeVar = gqw0.A;
                if ((i2 & 112) == 32) {
                    z = true;
                } else {
                    z = false;
                }
                zI = z | fetVar2.i(context);
                objP = fetVar2.P();
                if (zI || objP == cl5Var) {
                    xol xolVar = new xol(ngk0Var, bplVar, context, pz40Var, (byte) 0);
                    fetVar2.o0(xolVar);
                    objP = xolVar;
                }
                k7x.b(str, null, mm40VarW, null, null, null, null, (Function1) objP, null, null, pgeVar, null, fetVar, 48, 6, 31608);
                fetVar2 = fetVar;
                fetVar2.r(true);
            }
            objP4 = new unl(function0, (byte) 3);
            fetVar2.o0(objP4);
            mm40 mm40VarW2 = y860.W(mm40VarJ, null, null, false, null, (Function0) objP4, 28);
            String str2 = bplVar.c;
            pge pgeVar2 = gqw0.A;
            if ((i2 & 112) == 32) {
                z = true;
            } else {
                z = false;
            }
            zI = z | fetVar2.i(context);
            objP = fetVar2.P();
            if (zI) {
                xol xolVar2 = new xol(ngk0Var, bplVar, context, pz40Var, (byte) 0);
                fetVar2.o0(xolVar2);
                objP = xolVar2;
            } else {
                xol xolVar3 = new xol(ngk0Var, bplVar, context, pz40Var, (byte) 0);
                fetVar2.o0(xolVar3);
                objP = xolVar3;
            }
            k7x.b(str2, null, mm40VarW2, null, null, null, null, (Function1) objP, null, null, pgeVar2, null, fetVar, 48, 6, 31608);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new yol(mm40Var, bplVar, function0, i, (byte) 0);
        }
    }

    public static final j83 m0(String str, String str2, String str3, String str4, String str5, String str6) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        dpi0 dpi0Var = new dpi0((byte) 15);
        h83 h83Var = (h83) dpi0Var.f6468a;
        if (str.length() > 0) {
            W(dpi0Var, str);
        }
        if (!StringsKt.W(str2)) {
            W(dpi0Var, str2);
        }
        if (str3.length() > 0) {
            W(dpi0Var, str3);
        }
        if (str4.length() > 0) {
            W(dpi0Var, str4);
        }
        if (str5.length() > 0) {
            W(dpi0Var, str5);
        }
        if (str6.length() > 0) {
            if (dpi0Var.k()) {
                Q0(dpi0Var);
            }
            h83 h83Var2 = new h83();
            long j = y3d.g;
            long j2 = daq0.c;
            pz40 pz40Var = s6t0.f31722a;
            smk0 smk0Var = new smk0(StaticColors.INSTANCE.m123getWhite0d7_KjU(), j2, null, null, null, null, null, j2, new j56(0.0f), null, null, j, k5q0.b, null, null, 17424);
            y9q0 y9q0Var = new y9q0(0L, qmk.p, null, j1t0.f15753a, 0L, null, 0, 0, qmk.C, 16646109);
            h83Var2.c(str6);
            StringBuilder sb = h83Var2.f12607a;
            int length = sb.length();
            h83Var2.a(smk0Var, 0, length);
            h83Var2.a(y9q0Var.f42262a, 0, length);
            sb.length();
            h83Var.b(h83Var2.h());
        }
        return h83Var.h();
    }

    public static final void n(mm40 mm40Var, wul wulVar, Function0 function0, fet fetVar, int i, int i2) {
        mm40 mm40Var2;
        int i3;
        mm40 mm40Var3;
        float f;
        float f2;
        float f3;
        mm40 mm40VarE;
        long jI;
        wulVar.getClass();
        function0.getClass();
        fetVar.g0(641275631);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            mm40Var2 = mm40Var;
        } else if ((i & 6) == 0) {
            mm40Var2 = mm40Var;
            i3 = (fetVar.g(mm40Var2) ? 4 : 2) | i;
        } else {
            mm40Var2 = mm40Var;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= fetVar.g(wulVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= fetVar.i(function0) ? 256 : 128;
        }
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            jm40 jm40Var = jm40.b;
            if (i4 != 0) {
                mm40Var2 = jm40Var;
            }
            boolean z = wulVar.f;
            xe9 xe9Var = wulVar.c;
            oe9 oe9Var = wulVar.b;
            if (z) {
                if (xe9Var != null) {
                    if ((xe9Var instanceof ue9) || (xe9Var instanceof ve9) || (xe9Var instanceof we9) || (xe9Var instanceof te9)) {
                        int iOrdinal = oe9Var.ordinal();
                        if (iOrdinal == 0) {
                            zcl zclVar = qmk.f28987a;
                            jI = qbc.i(128.0f, 40.0f);
                        } else if (iOrdinal == 1) {
                            zcl zclVar2 = qmk.f28987a;
                            jI = qbc.i(128.0f, 36.0f);
                        } else if (iOrdinal == 2) {
                            zcl zclVar3 = qmk.f28987a;
                            jI = qbc.i(128.0f, 32.0f);
                        } else if (iOrdinal != 3) {
                            t9f.b();
                            return;
                        } else {
                            zcl zclVar4 = qmk.f28987a;
                            jI = qbc.i(128.0f, 24.0f);
                        }
                    } else if (xe9Var instanceof se9) {
                        int iOrdinal2 = oe9Var.ordinal();
                        if (iOrdinal2 == 0) {
                            zcl zclVar5 = qmk.f28987a;
                            jI = qbc.i(40.0f, 40.0f);
                        } else if (iOrdinal2 == 1) {
                            zcl zclVar6 = qmk.f28987a;
                            jI = qbc.i(36.0f, 36.0f);
                        } else if (iOrdinal2 == 2) {
                            zcl zclVar7 = qmk.f28987a;
                            jI = qbc.i(32.0f, 32.0f);
                        } else if (iOrdinal2 != 3) {
                            t9f.b();
                            return;
                        } else {
                            zcl zclVar8 = qmk.f28987a;
                            jI = qbc.i(24.0f, 24.0f);
                        }
                    }
                    mm40VarE = o7k0.o(jI, jm40Var);
                }
                t9f.b();
                return;
            }
            if (xe9Var != null) {
                boolean z2 = xe9Var instanceof ue9;
                if (z2) {
                    int iOrdinal3 = oe9Var.ordinal();
                    if (iOrdinal3 == 0 || iOrdinal3 == 1 || iOrdinal3 == 2) {
                        zcl zclVar9 = qmk.f28987a;
                        f = 56.0f;
                    } else if (iOrdinal3 != 3) {
                        t9f.b();
                        return;
                    } else {
                        zcl zclVar10 = qmk.f28987a;
                        f = 44.0f;
                    }
                } else if ((xe9Var instanceof ve9) || (xe9Var instanceof we9)) {
                    int iOrdinal4 = oe9Var.ordinal();
                    if (iOrdinal4 == 0 || iOrdinal4 == 1 || iOrdinal4 == 2) {
                        zcl zclVar11 = qmk.f28987a;
                        f = 80.0f;
                    } else if (iOrdinal4 != 3) {
                        t9f.b();
                        return;
                    } else {
                        zcl zclVar12 = qmk.f28987a;
                        f = 60.0f;
                    }
                } else if ((xe9Var instanceof te9) || (xe9Var instanceof se9)) {
                    int iOrdinal5 = oe9Var.ordinal();
                    if (iOrdinal5 == 0) {
                        zcl zclVar13 = qmk.f28987a;
                        f = 40.0f;
                    } else if (iOrdinal5 == 1) {
                        zcl zclVar14 = qmk.f28987a;
                        f = 36.0f;
                    } else if (iOrdinal5 == 2) {
                        zcl zclVar15 = qmk.f28987a;
                        f = 32.0f;
                    } else if (iOrdinal5 != 3) {
                        t9f.b();
                        return;
                    } else {
                        zcl zclVar16 = qmk.f28987a;
                        f = 24.0f;
                    }
                }
                if (z2 || (xe9Var instanceof ve9) || (xe9Var instanceof we9)) {
                    int iOrdinal6 = oe9Var.ordinal();
                    if (iOrdinal6 != 0 && iOrdinal6 != 1 && iOrdinal6 != 2 && iOrdinal6 != 3) {
                        t9f.b();
                        return;
                    }
                    f2 = Float.NaN;
                } else {
                    if (!(xe9Var instanceof te9) && !(xe9Var instanceof se9)) {
                        t9f.b();
                        return;
                    }
                    int iOrdinal7 = oe9Var.ordinal();
                    if (iOrdinal7 == 0) {
                        f2 = 40.0f;
                    } else if (iOrdinal7 == 1) {
                        f2 = 36.0f;
                    } else if (iOrdinal7 == 2) {
                        f2 = 32.0f;
                    } else {
                        if (iOrdinal7 != 3) {
                            t9f.b();
                            return;
                        }
                        f2 = 24.0f;
                    }
                }
                mm40 mm40VarT = o7k0.t(jm40Var, f, f2);
                int iOrdinal8 = oe9Var.ordinal();
                if (iOrdinal8 == 0) {
                    f3 = 40.0f;
                } else if (iOrdinal8 == 1) {
                    f3 = 36.0f;
                } else if (iOrdinal8 == 2) {
                    f3 = 32.0f;
                } else {
                    if (iOrdinal8 != 3) {
                        t9f.b();
                        return;
                    }
                    f3 = 24.0f;
                }
                mm40VarE = o7k0.e(mm40VarT, f3);
            }
            t9f.b();
            return;
            mm40 mm40VarN = epv0.N(jm40Var, wulVar.e ? 0.0f : 1.0f);
            sul sulVar = wulVar.f39796a;
            mm40Var3 = mm40Var2;
            obc.d(yde.f42431a.a(new y3d(((y3d) (wulVar.d ? sulVar.b : sulVar.d).invoke()).f41946a)), u1c.M(1488357935, new acb0((Object) mm40Var3, (Object) wulVar, (Object) function0, (Object) mm40VarE, (Object) sulVar, (Object) mm40VarN, (byte) 15), fetVar), fetVar, 56);
        } else {
            fetVar.X();
            mm40Var3 = mm40Var2;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new rn1(mm40Var3, (Object) wulVar, (Object) function0, i, i2, (byte) 13);
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:26:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:28:0x00b2  */
    public static final j83 n0(ctf0 ctf0Var, d3h0 d3h0Var, String str, String str2, String str3, String str4, boolean z, boolean z2) {
        izm0 izm0Var;
        ctf0Var.getClass();
        str2.getClass();
        str3.getClass();
        d3h0Var.getClass();
        str4.getClass();
        dpi0 dpi0Var = new dpi0((byte) 15);
        if (z) {
            S(dpi0Var, ctf0Var.b.a(R.string.game_end, Arrays.copyOf(new Object[0], 0)), StaticColors.INSTANCE.m123getWhite0d7_KjU());
        } else {
            if (str.length() > 0) {
                S(dpi0Var, str, StaticColors.INSTANCE.m123getWhite0d7_KjU());
            }
            if (str2.length() > 0 && !kotlin.text.c.l(StringsKt.u0(str4).toString(), StringsKt.u0(str2).toString())) {
                if (dpi0Var.k()) {
                    T(dpi0Var, Separators.SP);
                }
                S(dpi0Var, str2, StaticColors.INSTANCE.m123getWhite0d7_KjU());
            }
            if (str4.length() > 0) {
                P(dpi0Var);
                S(dpi0Var, str4, StaticColors.INSTANCE.m123getWhite0d7_KjU());
            }
            if (d3h0Var instanceof pz10) {
                pz10 pz10Var = (pz10) d3h0Var;
                if (!pz10Var.d().isEmpty()) {
                    P(dpi0Var);
                    I0(dpi0Var);
                    V0(dpi0Var, pz10Var, z2);
                    N(dpi0Var);
                } else if (d3h0Var instanceof izm0) {
                    izm0Var = (izm0) d3h0Var;
                    if (!izm0Var.d().isEmpty()) {
                        P(dpi0Var);
                        I0(dpi0Var);
                        W0(dpi0Var, izm0Var, z2);
                        N(dpi0Var);
                    }
                }
            } else if (d3h0Var instanceof izm0) {
                izm0Var = (izm0) d3h0Var;
                if (!izm0Var.d().isEmpty()) {
                    P(dpi0Var);
                    I0(dpi0Var);
                    W0(dpi0Var, izm0Var, z2);
                    N(dpi0Var);
                }
            }
            if (str3.length() > 0) {
                P(dpi0Var);
                S(dpi0Var, str3, StaticColors.INSTANCE.m123getWhite0d7_KjU());
            }
        }
        return ((h83) dpi0Var.f6468a).h();
    }

    public static final void o(mm40 mm40Var, k8m k8mVar, uzb uzbVar, xcz xczVar, Function1 function1, fet fetVar, int i) {
        function1.getClass();
        boolean z = k8mVar instanceof i8m;
        byte b = 14;
        cl5 cl5Var = ukd.f35823a;
        byte b2 = 0;
        byte b3 = 1;
        if (z) {
            fetVar.e0(226169411);
            mm40 mm40VarE0 = o2e.e0(o7k0.d(mm40Var, 1.0f), "LAZY_ROW_DISCIPLINES");
            lh80 lh80VarT = s5x0.t(8.0f, 0.0f, 2);
            zcl zclVar = qmk.f28987a;
            qw3 qw3Var = new qw3(8.0f, true, new jf4(b));
            int i2 = (((((i & 112) ^ 48) <= 32 || !fetVar.g(k8mVar)) && (i & 48) != 32) ? (char) 0 : (char) 1) | (((((i & 896) ^ 384) <= 256 || !fetVar.i(uzbVar)) && (i & 384) != 256) ? (char) 0 : (char) 1);
            if ((((458752 & i) ^ 196608) <= 131072 || !fetVar.g(function1)) && (i & 196608) != 131072) {
                b3 = 0;
            }
            int i3 = i2 | b3;
            Object objP = fetVar.P();
            if (i3 != 0 || objP == cl5Var) {
                objP = new f8m(k8mVar, uzbVar, function1, b2);
                fetVar.o0(objP);
            }
            b8k0.f(mm40VarE0, xczVar, lh80VarT, false, qw3Var, null, null, false, null, (Function1) objP, fetVar, (i >> 6) & 112, Response.NOT_ACCEPTABLE_HERE);
            fetVar.r(false);
            return;
        }
        if (!(k8mVar instanceof j8m)) {
            throw b1j.f(-408347578, fetVar, false);
        }
        fetVar.e0(226936909);
        Configuration configuration = (Configuration) fetVar.k(dy2.f6873a);
        zcl zclVar2 = qmk.f28987a;
        float f = configuration.screenWidthDp / 64.0f;
        mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
        lh80 lh80VarT2 = s5x0.t(8.0f, 0.0f, 2);
        qw3 qw3Var2 = new qw3(8.0f, true, new jf4(b));
        boolean zD = ((((i & 896) ^ 384) > 256 && fetVar.i(uzbVar)) || (i & 384) == 256) | fetVar.d(f);
        Object objP2 = fetVar.P();
        if (zD || objP2 == cl5Var) {
            objP2 = new cel(f, uzbVar, b3);
            fetVar.o0(objP2);
        }
        b8k0.f(mm40VarD, null, lh80VarT2, false, qw3Var2, null, null, false, null, (Function1) objP2, fetVar, 12582912, 362);
        fetVar.r(false);
    }

    public static final String o0(d0t d0tVar) {
        return ohs0.n(c0(d0tVar), r0(d0tVar).length() > 0 ? kng0.k(" - ", r0(d0tVar)) : "");
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0063  */
    /* JADX WARN: Code duplicated, block: B:35:0x0065  */
    /* JADX WARN: Code duplicated, block: B:38:0x006e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x0070  */
    /* JADX WARN: Code duplicated, block: B:40:0x0073  */
    /* JADX WARN: Code duplicated, block: B:42:0x0076  */
    /* JADX WARN: Code duplicated, block: B:43:0x0078  */
    /* JADX WARN: Code duplicated, block: B:46:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:50:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:51:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:53:0x016c  */
    /* JADX WARN: Code duplicated, block: B:56:0x0177  */
    /* JADX WARN: Code duplicated, block: B:58:? A[RETURN, SYNTHETIC] */
    public static final void p(mm40 mm40Var, String str, y3d y3dVar, fet fetVar, int i, int i2) {
        mm40 mm40Var2;
        int i3;
        y3d y3dVar2;
        boolean z;
        mm40 mm40Var3;
        y3d y3dVar3;
        yfe0 yfe0VarU;
        mm40 mm40Var4;
        y3d y3dVar4;
        zfn zfnVar;
        long textPrimary;
        fet fetVar2 = fetVar;
        str.getClass();
        fetVar2.g0(-941619746);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            mm40Var2 = mm40Var;
        } else if ((i & 6) == 0) {
            mm40Var2 = mm40Var;
            i3 = (fetVar2.g(mm40Var2) ? 4 : 2) | i;
        } else {
            mm40Var2 = mm40Var;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= fetVar2.g(str) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 == 0) {
            if ((i & 384) == 0) {
                y3dVar2 = y3dVar;
                i3 |= fetVar2.g(y3dVar2) ? 256 : 128;
            }
            if ((i3 & 147) != 146) {
                z = true;
            } else {
                z = false;
            }
            if (fetVar2.U(i3 & 1, z)) {
                if (i4 != 0) {
                    mm40Var4 = jm40.b;
                } else {
                    mm40Var4 = mm40Var2;
                }
                if (i5 != 0) {
                    y3dVar4 = null;
                } else {
                    y3dVar4 = y3dVar2;
                }
                zcl zclVar = qmk.f28987a;
                mm40 mm40VarS = o7k0.s(o7k0.e(mm40Var4, 24.0f), 28.0f);
                zfnVar = zaq0.b;
                long backgroundLight60 = ((ThemeColors) fetVar2.k(zfnVar)).getBackgroundLight60();
                zcl zclVar2 = qmk.d;
                ugg0 ugg0Var = vgg0.f37379a;
                mm40 mm40VarQ = i120.Q(mm40VarS, backgroundLight60, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2));
                tj30 tj30VarC = zq8.c(gqw0.e, false);
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
                jpm0.o(fetVar2, tj30VarC, gqw0.x);
                jpm0.o(fetVar2, bh90VarM, gqw0.w);
                jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
                jpm0.n(fetVar2);
                jpm0.o(fetVar2, mm40VarC0, gqw0.v);
                if (y3dVar4 == null) {
                    fetVar2.e0(-1336978781);
                    textPrimary = ((ThemeColors) fetVar2.k(zfnVar)).getTextPrimary();
                    fetVar2.r(false);
                } else {
                    fetVar2.e0(-1336979742);
                    fetVar2.r(false);
                    textPrimary = y3dVar4.f41946a;
                }
                v8q0.a(str, null, textPrimary, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045), fetVar2, (i3 >> 3) & 14, 24960, 110586);
                fetVar2 = fetVar2;
                fetVar2.r(true);
                y3dVar3 = y3dVar4;
                mm40Var3 = mm40Var4;
            } else {
                fetVar2.X();
                mm40Var3 = mm40Var2;
                y3dVar3 = y3dVar2;
            }
            yfe0VarU = fetVar2.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new z23(mm40Var3, (Object) str, (Object) y3dVar3, i, i2, (byte) 8);
            }
        }
        i3 |= 384;
        y3dVar2 = y3dVar;
        if ((i3 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (fetVar2.U(i3 & 1, z)) {
            if (i4 != 0) {
                mm40Var4 = jm40.b;
            } else {
                mm40Var4 = mm40Var2;
            }
            if (i5 != 0) {
                y3dVar4 = null;
            } else {
                y3dVar4 = y3dVar2;
            }
            zcl zclVar3 = qmk.f28987a;
            mm40 mm40VarS2 = o7k0.s(o7k0.e(mm40Var4, 24.0f), 28.0f);
            zfnVar = zaq0.b;
            long backgroundLight61 = ((ThemeColors) fetVar2.k(zfnVar)).getBackgroundLight60();
            zcl zclVar4 = qmk.d;
            ugg0 ugg0Var2 = vgg0.f37379a;
            mm40 mm40VarQ2 = i120.Q(mm40VarS2, backgroundLight61, new ugg0(zclVar4, zclVar4, zclVar4, zclVar4));
            tj30 tj30VarC2 = zq8.c(gqw0.e, false);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarQ2);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC2, gqw0.x);
            jpm0.o(fetVar2, bh90VarM2, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode2), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC1, gqw0.v);
            if (y3dVar4 == null) {
                fetVar2.e0(-1336978781);
                textPrimary = ((ThemeColors) fetVar2.k(zfnVar)).getTextPrimary();
                fetVar2.r(false);
            } else {
                fetVar2.e0(-1336979742);
                fetVar2.r(false);
                textPrimary = y3dVar4.f41946a;
            }
            v8q0.a(str, null, textPrimary, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045), fetVar2, (i3 >> 3) & 14, 24960, 110586);
            fetVar2 = fetVar2;
            fetVar2.r(true);
            y3dVar3 = y3dVar4;
            mm40Var3 = mm40Var4;
        } else {
            fetVar2.X();
            mm40Var3 = mm40Var2;
            y3dVar3 = y3dVar2;
        }
        yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new z23(mm40Var3, (Object) str, (Object) y3dVar3, i, i2, (byte) 8);
        }
    }

    public static final long p0(boolean z) {
        return z ? StaticColors.INSTANCE.m98getGreen0d7_KjU() : StaticColors.INSTANCE.m123getWhite0d7_KjU();
    }

    public static final void q(mm40 mm40Var, bwm bwmVar, fet fetVar, int i) {
        int i2;
        float f;
        fetVar.g0(-1800765844);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(bwmVar) ? 32 : 16;
        }
        byte b = 0;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(s5x0.L(mm40VarD, 12.0f, 0.0f, 2), 0.0f, 0.0f, 0.0f, 8.0f, 7);
            thg0 thg0VarA = shg0.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.k, fetVar, 48);
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
            jpm0.o(fetVar, thg0VarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            fetVar.e0(-1410130789);
            String str = bwmVar.l;
            boolean z = bwmVar.k.length() > 0;
            boolean z2 = str.length() > 0;
            boolean zH = fetVar.h(z) | fetVar.h(z2);
            Object objP = fetVar.P();
            if (zH || objP == ukd.f35823a) {
                if (z && z2) {
                    f = 120.0f;
                } else {
                    f = (z || z2) ? 102.0f : 84.0f;
                }
                objP = twn.j(f, fetVar);
            }
            jeb.r(s5x0.L(o7k0.e(jm40.b, ((ycl) objP).f42389a), 4.0f, 0.0f, 2), bhm.b, fetVar, 48);
            fetVar.r(false);
            b(null, bwmVar, fetVar, i2 & 112);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gwm(mm40Var, bwmVar, i, b);
        }
    }

    public static final String q0(d0t d0tVar, boolean z) {
        Object next;
        Object next2;
        d0tVar.getClass();
        boolean z2 = z && cy7.c();
        rqs rqsVar = d0tVar.p;
        List list = d0tVar.w;
        List list2 = rqsVar.n;
        String strU = kotlin.text.c.u(rqsVar.c, "-", " : ", false);
        if (d0tVar.v == 66) {
            String strA0 = a0(d0tVar, z2);
            if (strA0 == null) {
                strA0 = "";
            }
            if (strA0.length() != 0) {
                return strA0;
            }
            List listSplit$default = StringsKt__StringsKt.split$default(strU, new String[]{" : "}, false, 0, 6, null);
            Iterator it = CollectionsKt.q0(list2, list).iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((cmr) next).f4620a != dmr.e);
            cmr cmrVar = (cmr) next;
            String str = cmrVar != null ? cmrVar.b : null;
            if (str == null) {
                str = "";
            }
            if (str.length() == 0) {
                String str2 = (String) CollectionsKt.W(0, listSplit$default);
                str = str2 == null ? "" : str2;
            }
            Iterator it2 = CollectionsKt.q0(list2, list).iterator();
            do {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
            } while (((cmr) next2).f4620a != dmr.f);
            cmr cmrVar2 = (cmr) next2;
            String str3 = cmrVar2 != null ? cmrVar2.b : null;
            if (str3 == null) {
                str3 = "";
            }
            if (str3.length() == 0) {
                String str4 = (String) CollectionsKt.W(1, listSplit$default);
                str3 = str4 != null ? str4 : "";
            }
            if (str3.length() != 0 || str.length() != 0) {
                return !z2 ? kng0.l(str, " : ", str3) : kng0.l(str3, " : ", str);
            }
        }
        return strU;
    }

    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v23 */
    public static final void r(mm40 mm40Var, i0n i0nVar, fet fetVar, int i) {
        byte b;
        i0n i0nVar2;
        float f;
        ?? r3;
        fet fetVar2 = fetVar;
        fetVar2.g0(-1837524534);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(i0nVar) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarG = o7k0.g(mm40Var, 170.0f, 0.0f, 2);
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
            String str = i0nVar.c;
            zfn zfnVar = j1t0.e;
            ((g1t0) fetVar2.k(zfnVar)).getClass();
            y9q0 y9q0VarP = g1t0.p();
            zfn zfnVar2 = zaq0.b;
            v8q0.a(str, mm40VarL, ((ThemeColors) fetVar2.k(zfnVar2)).getTextPrimary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 3, 0, null, y9q0VarP, fetVar, 0, 24960, 109560);
            fetVar2 = fetVar;
            if (i0nVar.d.length() > 0) {
                fetVar2.e0(-1279247850);
                mm40 mm40VarL2 = s5x0.L(s5x0.N(jm40Var, 0.0f, 4.0f, 0.0f, 0.0f, 13), 8.0f, 0.0f, 2);
                String str2 = i0nVar.d;
                ((g1t0) fetVar2.k(zfnVar)).getClass();
                f = 8.0f;
                v8q0.a(str2, mm40VarL2, ((ThemeColors) fetVar2.k(zfnVar2)).getSecondary(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 2, 0, null, g1t0.n(), fetVar2, 0, 24960, 109560);
                fetVar2 = fetVar2;
                r3 = 0;
                fetVar2.r(false);
            } else {
                f = 8.0f;
                r3 = 0;
                fetVar2.e0(-1278815090);
                fetVar2.r(false);
            }
            mm40 mm40VarM = s5x0.M(r36, f, 10.0f, f, f);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar2, r3);
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
            b = 1;
            i0nVar2 = i0nVar;
            F(zhg0Var.a(0.33f, r36, true), true, i0nVar2.f, fetVar2, 48);
            E(zhg0Var.a(0.33f, r36, true), i0nVar2, fetVar2, i2 & 112);
            F(zhg0Var.a(0.33f, jm40Var, true), r3, i0nVar2.g, fetVar2, 48);
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            b = 1;
            i0nVar2 = i0nVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new d0n(b, i, mm40Var, i0nVar2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0017  */
    public static final String r0(d0t d0tVar) {
        d0tVar.getClass();
        String str = (String) CollectionsKt.f0(f0(d0tVar));
        if (str == null) {
            str = d0tVar.r.b;
        } else {
            if (!d0tVar.B) {
                str = null;
            }
            if (str == null) {
                str = d0tVar.r.b;
            }
        }
        return StringsKt.u0(str).toString();
    }

    public static final void s(mm40 mm40Var, lan lanVar, Function1 function1, fet fetVar, int i) {
        mm40 mm40Var2;
        function1.getClass();
        fetVar.g0(-1908944850);
        int i2 = i | (fetVar.g(lanVar) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = androidx.compose.runtime.e.e(null);
                fetVar.o0(objP);
            }
            pz40 pz40Var = (pz40) objP;
            if (lanVar instanceof jan) {
                fetVar.e0(-544954889);
                Object objP2 = fetVar.P();
                if (objP2 == cl5Var) {
                    objP2 = dw9.j(fetVar);
                }
                gy40 gy40Var = (gy40) objP2;
                int i3 = i2 & 112;
                boolean z = (i3 == 32) | ((i2 & 896) == 256);
                Object objP3 = fetVar.P();
                if (z || objP3 == cl5Var) {
                    objP3 = new g8l(lanVar, function1, pz40Var, (byte) 7);
                    fetVar.o0(objP3);
                }
                mm40 mm40VarW = y860.W(mm40Var, gy40Var, null, false, null, (Function0) objP3, 28);
                jan janVar = (jan) lanVar;
                Object objP4 = fetVar.P();
                if (objP4 == cl5Var) {
                    objP4 = new wil(pz40Var, (byte) 20);
                    fetVar.o0(objP4);
                }
                f(mm40VarW, janVar, (Function1) objP4, fetVar, i3 | 384);
                fetVar.r(false);
                mm40Var2 = mm40Var;
            } else {
                if (!(lanVar instanceof kan)) {
                    throw b1j.f(-544957060, fetVar, false);
                }
                fetVar.e0(-544937846);
                mm40Var2 = mm40Var;
                I(6, fetVar, mm40Var2);
                fetVar.r(false);
            }
        } else {
            mm40Var2 = mm40Var;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new d8m(mm40Var2, lanVar, function1, i, (byte) 25);
        }
    }

    public static final String s0(d0t d0tVar) {
        d0tVar.getClass();
        String str = d0tVar.y.d;
        if (str.length() <= 0) {
            str = null;
        }
        String strC0 = c0(d0tVar);
        return str != null ? String.format("%s (%s)", Arrays.copyOf(new Object[]{strC0, str}, 2)) : strC0;
    }

    public static final void t(eia eiaVar, fet fetVar, int i) {
        int i2;
        fetVar.g0(-1963508010);
        byte b = 4;
        if ((i & 6) == 0) {
            i2 = (fetVar.g(eiaVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            clz clzVar = (clz) fetVar.k(or00.f25714a);
            mm40 mm40Var = (mm40) fetVar.k(t0h.f33118a);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = new thd((byte) 19);
                fetVar.o0(objP);
            }
            xdr xdrVar = (xdr) objP;
            int i3 = i2 & 14;
            boolean zI = (i3 == 4) | fetVar.i(clzVar);
            Object objP2 = fetVar.P();
            if (zI || objP2 == cl5Var) {
                objP2 = new qzn(eiaVar, clzVar, b);
                fetVar.o0(objP2);
            }
            Function1 function1 = (Function1) objP2;
            boolean zI2 = fetVar.i(clzVar) | (i3 == 4);
            Object objP3 = fetVar.P();
            byte b2 = 3;
            if (zI2 || objP3 == cl5Var) {
                objP3 = new fun(eiaVar, clzVar, b2);
                fetVar.o0(objP3);
            }
            idm0.j(mm40Var, eiaVar, xdrVar, null, function1, (Function2) objP3, fetVar, ((i2 << 3) & 112) | 384, 8);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new o2l(eiaVar, i, (byte) 26);
        }
    }

    public static final String t0(d0t d0tVar) {
        d0tVar.getClass();
        String str = d0tVar.y.e;
        if (str.length() <= 0) {
            str = null;
        }
        String strR0 = r0(d0tVar);
        return str != null ? String.format("%s (%s)", Arrays.copyOf(new Object[]{strR0, str}, 2)) : strR0;
    }

    public static final void u(mm40 mm40Var, qdz qdzVar, zbo zboVar, Function0 function0, Function1 function1, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        qdzVar.getClass();
        zboVar.getClass();
        function0.getClass();
        function1.getClass();
        fetVar2.g0(-120425841);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(qdzVar) ? 32 : 16) | (fetVar2.g(zboVar) ? 256 : 128) | (fetVar2.i(function0) ? 2048 : 1024) | (fetVar2.i(function1) ? 16384 : 8192);
        if (fetVar2.U(i2 & 1, (i2 & 9363) != 9362)) {
            int i3 = i2 << 3;
            xcz xczVarB = qdzVar.b("EventFocusPartnerTeamsUiModel", new x6o((byte) 6), fetVar2, i3 & 896);
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40VarD, 144.0f);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarE2 = h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE);
            zfn zfnVar = zaq0.b;
            mm40 mm40VarQ = i120.Q(mm40VarE2, ((ThemeColors) fetVar2.k(zfnVar)).getBackgroundContent(), jd8.n);
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
            d5c.k(s5x0.N(jm40.b, 0.0f, 8.0f, 0.0f, 0.0f, 13), zboVar.f44125a, xczVarB, ((ThemeColors) fetVar2.k(zfnVar)).getSecondary10(), function1, fetVar2, i3 & 458752, 0);
            e3c.b(null, k3g.f17616a, function0, fetVar, (i2 >> 3) & 896, 1);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cqk(mm40Var, (Object) qdzVar, (Object) zboVar, (Object) function0, (Object) function1, i, (byte) 20);
        }
    }

    public static final j83 u0(pz10 pz10Var) {
        h83 h83Var = new h83();
        String strA = pz10Var.a();
        strA.getClass();
        long j = y3d.g;
        long j2 = daq0.c;
        smk0 smk0Var = new smk0(p0(pz10Var.j()), j2, null, null, null, null, null, j2, new j56(0.0f), null, null, j, k5q0.b, null, null, 17424);
        h83Var.c(strA);
        return kng0.c(h83Var.f12607a, h83Var, smk0Var, 0);
    }

    public static final void v(a4x a4xVar, Function1 function1, fet fetVar, int i) {
        int i2;
        fetVar.g0(-737964687);
        byte b = 4;
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? fetVar.g(a4xVar) : fetVar.i(a4xVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.i(function1) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE = o7k0.e(s5x0.N(jm40Var, 12.0f, 0.0f, 0.0f, 0.0f, 14), 36.0f);
            zfn zfnVar = zaq0.b;
            long backgroundContent = ((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent();
            zcl zclVar2 = qmk.f;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarS = i120.S(i120.Q(mm40VarE, backgroundContent, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), 1.0f, ((ThemeColors) fetVar.k(zfnVar)).getSeparator60(), new ugg0(zclVar2, zclVar2, zclVar2, zclVar2));
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarS);
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
            jpm0.o(fetVar, tj30VarC, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar3);
            jpm0.n(fetVar);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar4);
            mm40 mm40VarJ = s5x0.J(jm40Var, 2.0f);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar, 0);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarJ);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            Iterator itO = h97.o(fetVar, mm40VarC1, shdVar4, -947371849, a4xVar);
            while (itO.hasNext()) {
                dsv dsvVar = (dsv) itO.next();
                fetVar.b0(1408720328, dsvVar.f6632a);
                i(dsvVar, function1, fetVar, i2 & 112);
                fetVar.r(false);
            }
            ohs0.x(fetVar, false, true, true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new lr0(b, i, a4xVar, function1);
        }
    }

    public static final j83 v0(te90 te90Var) {
        te90Var.getClass();
        h83 h83Var = new h83();
        String str = te90Var.b;
        long j = y3d.g;
        long j2 = daq0.c;
        smk0 smk0Var = new smk0(p0(te90Var.c), j2, null, null, null, null, null, j2, new j56(0.0f), null, null, j, k5q0.b, null, null, 17424);
        h83Var.c(str);
        return kng0.c(h83Var.f12607a, h83Var, smk0Var, 0);
    }

    public static final void w(zsv zsvVar, Function0 function0, mm40 mm40Var, fet fetVar, int i) {
        int i2;
        fet fetVar2 = fetVar;
        function0.getClass();
        fetVar2.g0(-1310561234);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? fetVar2.g(zsvVar) : fetVar2.i(zsvVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.i(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.g(mm40Var) ? 256 : 128;
        }
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarD = o7k0.d(o7k0.e(mm40Var, 56.0f), 1.0f);
            zfn zfnVar = zaq0.b;
            mm40 mm40VarQ = i120.Q(mm40VarD, ((ThemeColors) fetVar2.k(zfnVar)).getBackgroundContent(), vgg0.c(0.0f, 0.0f, 24.0f, 24.0f, 3));
            x5d x5dVarA = w5d.a(uc9.c, gqw0.n, fetVar2, 48);
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
            jm40 jm40Var = jm40.b;
            v8q0.a(zsvVar.f44925a, s5x0.L(y860.W(jm40Var, null, null, false, null, function0, 28), 8.0f, 0.0f, 2), ((ThemeColors) fetVar2.k(zfnVar)).getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.u(), fetVar2, 0, 24960, 110584);
            v8q0.a(zsvVar.b, s5x0.N(y860.W(jm40Var, null, null, false, null, function0, 28), 0.0f, 0.0f, 0.0f, 8.0f, 7), ((ThemeColors) fetVar2.k(zfnVar)).getPrimary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.d(), fetVar, 0, 24960, 110584);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zuc(zsvVar, function0, mm40Var, i, (byte) 6);
        }
    }

    public static final j83 w0(pz10 pz10Var) {
        h83 h83Var = new h83();
        String strB = pz10Var.b();
        strB.getClass();
        long j = y3d.g;
        long j2 = daq0.c;
        smk0 smk0Var = new smk0(p0(pz10Var.i()), j2, null, null, null, null, null, j2, new j56(0.0f), null, null, j, k5q0.b, null, null, 17424);
        h83Var.c(strB);
        return kng0.c(h83Var.f12607a, h83Var, smk0Var, 0);
    }

    public static final void x(mm40 mm40Var, esv esvVar, float f, Function1 function1, Function1 function2, fet fetVar, int i) {
        int i2;
        float f2;
        int i3;
        float f3;
        boolean z;
        a4x a4xVar = esvVar.c;
        function1.getClass();
        function2.getClass();
        fetVar.g0(1957190796);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(esvVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(function1) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.i(function2) ? 16384 : 8192;
        }
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            fetVar.Z();
            if ((i & 1) == 0 || fetVar.B()) {
                zcl zclVar = qmk.f28987a;
                i3 = i2 & (-897);
                f3 = 16.0f;
            } else {
                fetVar.X();
                i3 = i2 & (-897);
                f3 = f;
            }
            fetVar.s();
            zcl zclVar2 = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(o7k0.e(mm40Var, 40.0f), f3, 0.0f, 2);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar, 48);
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
            jpm0.o(fetVar, thg0VarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            fetVar.e0(-782061308);
            b8m b8mVar = esvVar.b;
            zfn zfnVar = zaq0.b;
            long textPrimary = ((ThemeColors) fetVar.k(zfnVar)).getTextPrimary();
            ((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent();
            r7m r7mVar = new r7m(textPrimary, ((ThemeColors) fetVar.k(zfnVar)).getBackground(), ((ThemeColors) fetVar.k(zfnVar)).getPrimary());
            float f4 = f3;
            x7z x7zVar = new x7z(1.0f, true);
            boolean z2 = ((i3 & 7168) == 2048) | ((i3 & 112) == 32);
            Object objP = fetVar.P();
            if (z2 || objP == ukd.f35823a) {
                objP = new wqv(function1, esvVar, (byte) 2);
                fetVar.o0(objP);
            }
            int i4 = i3;
            wwb.j(x7zVar, b8mVar, 0.0f, r7mVar, (Function0) objP, fetVar, 0, 16);
            if (a4xVar.isEmpty()) {
                z = false;
                fetVar.e0(-781346758);
                fetVar.r(false);
            } else {
                fetVar.e0(-781529348);
                v(a4xVar, function2, fetVar, (i4 >> 9) & 112);
                z = false;
                fetVar.r(false);
            }
            fetVar.r(z);
            fetVar.r(true);
            f2 = f4;
        } else {
            fetVar.X();
            f2 = f;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new pt1(mm40Var, esvVar, f2, function1, function2, i, (byte) 7);
        }
    }

    public static final j83 x0(te90 te90Var) {
        h83 h83Var = new h83();
        String str = te90Var.d;
        long j = y3d.g;
        long j2 = daq0.c;
        smk0 smk0Var = new smk0(p0(te90Var.e), j2, null, null, null, null, null, j2, new j56(0.0f), null, null, j, k5q0.b, null, null, 17424);
        h83Var.c(str);
        return kng0.c(h83Var.f12607a, h83Var, smk0Var, 0);
    }

    public static final void y(mm40 mm40Var, ciw ciwVar, qdz qdzVar, Function2 function2, fet fetVar, int i) {
        mm40 mm40Var2;
        qdzVar.getClass();
        function2.getClass();
        fetVar.g0(1613953226);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar.g(ciwVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(qdzVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(function2) ? 2048 : 1024;
        }
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            boolean z = ciwVar instanceof zhw;
            jm40 jm40Var = jm40.b;
            if (z) {
                fetVar.e0(-878024236);
                zhw zhwVar = (zhw) ciwVar;
                etl.e(jm40Var, zhwVar.c, zhwVar.b, false, qdzVar.b(zhwVar.f44413a, new x2w((byte) 12), fetVar, i2 & 896), 0.0f, 0, null, function2, fetVar, (i2 & 14) | ((i2 << 15) & 234881024), 232);
                fetVar.r(false);
            } else {
                if (!(ciwVar instanceof aiw)) {
                    throw b1j.f(525864281, fetVar, false);
                }
                fetVar.e0(-877591352);
                etl.e(jm40Var, lak0.c, ((aiw) ciwVar).f946a, true, null, 0.0f, 0, null, function2, fetVar, (i2 & 14) | 3120 | ((i2 << 15) & 234881024), 240);
                fetVar.r(false);
            }
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new vho((byte) 7, i, (Object) mm40Var2, (Object) ciwVar, (Object) qdzVar, (Object) function2);
        }
    }

    public static final int y0(int i, k6z k6zVar, boolean z) {
        k6zVar.getClass();
        if (z || k6zVar == k6z.f17794a || k6zVar != k6z.b) {
            return i;
        }
        return (i != 6 && i == 5) ? 6 : 5;
    }

    public static final void z(mm40 mm40Var, int i, oe9 oe9Var, fet fetVar, int i2) {
        fet fetVar2;
        fetVar.g0(52285388);
        int i3 = (fetVar.g(mm40Var) ? 4 : 2) | i2 | (fetVar.e(i) ? 32 : 16) | (fetVar.e(oe9Var.ordinal()) ? 256 : 128);
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            fetVar2 = fetVar;
            dww.c(a8k0.F(i, (i3 >> 3) & 14, fetVar), null, o2e.e0(o7k0.o(g0(oe9Var), mm40Var), "ICON_PLUS"), 0L, fetVar2, 56, 8);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new uul(mm40Var, i, oe9Var, i2, (byte) 1);
        }
    }

    public static final znq0 z0(anq0 anq0Var) {
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

    public void Z(gb10 gb10Var, float f, float f2) {
        float f3 = f2 * f;
        gb10Var.d(f3, 180.0f, 90.0f);
        double d = f3;
        gb10Var.c((float) (Math.sin(Math.toRadians(90.0d)) * d), (float) (Math.sin(Math.toRadians(0.0d)) * d));
    }
}
