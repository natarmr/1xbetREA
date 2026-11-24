package a;

import android.javax.sip.message.Response;
import android.view.Window;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.betting.core.zip.model.zip.BetZip;
import org.xplatform.betting.core.zip.model.zip.bet.BetGroupZip;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public abstract class lvm0 {
    public static final void a(Window window, boolean z, fet fetVar, int i) {
        fetVar.g0(-1138511662);
        int i2 = (fetVar.i(window) ? 4 : 2) | i | (fetVar.h(z) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            Boolean boolValueOf = Boolean.valueOf(z);
            boolean zI = fetVar.i(window) | ((i2 & 112) == 32);
            Object objP = fetVar.P();
            if (zI || objP == ukd.f35823a) {
                objP = new vt8(window, z, (byte) 3);
                fetVar.o0(objP);
            }
            m0x0.n(window, boolValueOf, (Function1) objP, fetVar);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xh20((Object) window, z, i, (byte) 25);
        }
    }

    public static final void b(mm40 mm40Var, i8b i8bVar, Function2 function2, ugd ugdVar, ugd ugdVar2, fet fetVar, int i) {
        mm40 mm40Var2;
        int i2;
        fet fetVar2;
        function2.getClass();
        fetVar.g0(756058797);
        if ((i & 6) == 0) {
            mm40Var2 = mm40Var;
            i2 = (fetVar.g(mm40Var2) ? 4 : 2) | i;
        } else {
            mm40Var2 = mm40Var;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(i8bVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(ugdVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.i(ugdVar2) ? 16384 : 8192;
        }
        int i3 = i2;
        if (fetVar.U(i3 & 1, (i3 & 9363) != 9362)) {
            pz40 pz40VarF = androidx.compose.runtime.e.f(Boolean.valueOf(i8bVar.c), fetVar);
            boolean z = false;
            l7m0 l7m0VarB = d43.b(((Boolean) pz40VarF.getValue()).booleanValue() ? 180.0f : 0.0f, ro4.m0(Response.OK, 0, null, 6), null, null, fetVar, 48, 28);
            boolean zG = ((i3 & 896) == 256) | fetVar.g(pz40VarF);
            if ((i3 & 112) == 32) {
                z = true;
            }
            boolean z2 = zG | z;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z2 || objP == cl5Var) {
                objP = new ck60(function2, pz40VarF, i8bVar, (byte) 17);
                fetVar.o0(objP);
            }
            mm40 mm40Var3 = mm40Var2;
            fetVar2 = fetVar;
            mm40 mm40VarW = y860.W(mm40Var3, null, null, false, null, (Function0) objP, 28);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarW);
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
            Object obj = i8bVar.b;
            Object objValueOf = Integer.valueOf(6 | ((i3 >> 3) & 896));
            Object obj2 = zhg0.f44392a;
            ugdVar.j(obj2, obj, fetVar2, objValueOf);
            boolean zG2 = fetVar2.g(l7m0VarB);
            Object objP2 = fetVar2.P();
            if (zG2 || objP2 == cl5Var) {
                objP2 = new ufp(l7m0VarB, (byte) 26);
                fetVar2.o0(objP2);
            }
            ugdVar2.j(obj2, rq8.M(jm40.b, (Function1) objP2), fetVar2, Integer.valueOf(6 | ((i3 >> 6) & 896)));
            fetVar2.r(true);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wjp((Object) mm40Var, (Object) i8bVar, (Object) function2, (Object) ugdVar, (Object) ugdVar2, i, (byte) 26);
        }
    }

    public static final void c(mm40 mm40Var, ivk0 ivk0Var, ebo0 ebo0Var, Function1 function1, fet fetVar, int i) {
        ugd ugdVarM;
        ivk0Var.getClass();
        function1.getClass();
        fetVar.g0(1977902762);
        int i2 = i | (fetVar.g(mm40Var) ? 4 : 2) | (fetVar.g(ivk0Var) ? 32 : 16) | (fetVar.g(ebo0Var) ? 256 : 128) | (fetVar.i(function1) ? 2048 : 1024);
        byte b = 1;
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            rah0 rah0VarT = wha0.T(fetVar);
            cpm cpmVar = ivk0Var.c;
            ugd ugdVarM2 = null;
            if (cpmVar == null) {
                fetVar.e0(1045230529);
                fetVar.r(false);
                ugdVarM = null;
            } else {
                fetVar.e0(1045230530);
                ugdVarM = u1c.M(1294796419, new uao0(rah0VarT, cpmVar, function1, b), fetVar);
                fetVar.r(false);
            }
            t3r0 t3r0Var = ivk0Var.d;
            if (t3r0Var == null) {
                fetVar.e0(1045790482);
                fetVar.r(false);
            } else {
                fetVar.e0(1045790483);
                ugdVarM2 = u1c.M(446216759, new tao0(t3r0Var, rah0VarT, function1, b), fetVar);
                fetVar.r(false);
            }
            ugd ugdVarM3 = u1c.M(413637793, new vao0(ivk0Var, ebo0Var, function1, b), fetVar);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
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
            y5d y5dVar = y5d.f42040a;
            if (ugdVarM == null) {
                fetVar.e0(876776565);
            } else {
                fetVar.e0(1136661772);
                ugdVarM.F(y5dVar, fetVar, 6);
            }
            fetVar.r(false);
            if (ugdVarM2 == null) {
                fetVar.e0(876812277);
            } else {
                fetVar.e0(1136662924);
                ugdVarM2.F(y5dVar, fetVar, 6);
            }
            fetVar.r(false);
            vqd.t(54, ugdVarM3, y5dVar, fetVar, true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wao0(mm40Var, ivk0Var, ebo0Var, function1, i, (byte) 1);
        }
    }

    public static final void d(mm40 mm40Var, nts0 nts0Var, l7m0 l7m0Var, float f, float f2, fet fetVar, int i) {
        l7m0 l7m0Var2;
        mm40 mm40Var2;
        nts0Var.getClass();
        fetVar.g0(-1436241683);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar.g(nts0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            l7m0Var2 = l7m0Var;
            i2 |= fetVar.g(l7m0Var2) ? 256 : 128;
        } else {
            l7m0Var2 = l7m0Var;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.d(f) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.d(56.0f) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar.d(f2) ? 131072 : 65536;
        }
        byte b = 0;
        if (fetVar.U(i2 & 1, (74899 & i2) != 74898)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarQ = i120.Q(o7k0.d(jm40Var, 1.0f), ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), jd8.n);
            int i3 = 458752 & i2;
            boolean z = ((i2 & 7168) == 2048) | (i3 == 131072);
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (z || objP == obj) {
                objP = new fbn(new ih10(f, f2, (byte) 11));
                fetVar.o0(objP);
            }
            s3e s3eVar = (s3e) objP;
            boolean z2 = ((i2 & 57344) == 16384) | (i3 == 131072);
            Object objP2 = fetVar.P();
            if (z2 || objP2 == obj) {
                objP2 = new fbn(new kss0(f2, b));
                fetVar.o0(objP2);
            }
            s3e s3eVar2 = (s3e) objP2;
            float fFloatValue = ((Number) l7m0Var2.getValue()).floatValue();
            lwf lwfVar = lwf.o;
            Object objP3 = fetVar.P();
            if (objP3 == obj) {
                objP3 = androidx.compose.runtime.e.d(Unit.f46060a, m2a.v);
                fetVar.o0(objP3);
            }
            pz40 pz40Var = (pz40) objP3;
            Object objP4 = fetVar.P();
            Object obj2 = objP4;
            if (objP4 == obj) {
                nie0 nie0Var = new nie0();
                nie0Var.f23583a = cmd.f4598a;
                fetVar.o0(nie0Var);
                obj2 = nie0Var;
            }
            nie0 nie0Var2 = (nie0) obj2;
            mm40Var2 = jm40Var;
            n6x.b(s3eVar, s3eVar2, fFloatValue, false, false, false, mm40VarQ, pz40Var, nie0Var2, lwfVar, u1c.M(284503157, new w43(pz40Var, lwfVar, nie0Var2, nts0Var, (byte) 1), fetVar), fetVar, 24576);
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new n04(mm40Var2, nts0Var, l7m0Var2, f, f2, i);
        }
    }

    public static final void e(int i, fet fetVar, mm40 mm40Var) {
        fetVar.g0(-988698371);
        int i2 = i | 6;
        byte b = 2;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
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
            jpm0.o(fetVar, x5dVarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarS = o7k0.s(o7k0.e(s5x0.K(jm40Var, qmk.a(fetVar).e, 8.0f), 40.0f), 128.0f);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            zq8.a(0, fetVar, xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarS), vbc.d0(null, fetVar, 0, 1)));
            dw9.x(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, o7k0.d(o7k0.e(s5x0.L(jm40Var, qmk.a(fetVar).c, 0.0f, 2), 360.0f), 1.0f)), vbc.d0(null, fetVar, 0, 1), fetVar, 0, true);
            mm40Var = jm40Var;
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new tsu0(mm40Var, i, b);
        }
    }

    public static final jo20 f(String str, String str2) {
        str.getClass();
        str2.getClass();
        jo20 jo20Var = new jo20();
        jo20Var.put("team1", str);
        if (str2.length() > 0) {
            jo20Var.put("team2", str2);
        }
        return jo20Var.b();
    }

    public static final i4 g(s7s0 s7s0Var, long j, ctf0 ctf0Var, String str, boolean z) {
        Object next;
        Collection collectionC;
        i4 i4VarR0;
        s7s0Var.getClass();
        ctf0Var.getClass();
        str.getClass();
        int i = 0;
        if (!(s7s0Var instanceof q7s0)) {
            if (!s7s0Var.equals(r7s0.f29993a)) {
                t9f.b();
                return null;
            }
            lc00 lc00VarB = kotlin.collections.a.b();
            if (z) {
                hrl hrlVar = hrl.f13536a;
                lc00VarB.add(new e3s0(jrl.f17007a, "rules_shimmer_key"));
            }
            while (i < 15) {
                lc00VarB.add(new d3s0(ur1.f36143a, twn.m(i, "card_shimmer_key")));
                i++;
            }
            return dyb.r0(kotlin.collections.a.a(lc00VarB));
        }
        gu1 gu1Var = ((q7s0) s7s0Var).f28266a;
        Iterator it = gu1Var.l.f38767a.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((fzl0) next).c != j);
        fzl0 fzl0Var = (fzl0) next;
        w88 w88Var = fzl0Var != null ? fzl0Var.f10413a : gu1Var.f;
        lc00 lc00VarB2 = kotlin.collections.a.b();
        lsm0 lsm0Var = ctf0Var.b;
        String strA = lsm0Var.a(R.string.tournaments_rules_title, Arrays.copyOf(new Object[0], 0));
        String str2 = fzl0Var != null ? fzl0Var.f10413a.d : null;
        if (str2 == null) {
            str2 = "";
        }
        if (str2.length() > 0) {
            hrl hrlVar2 = hrl.f13536a;
            collectionC = kotlin.collections.a.c(new e3s0(new irl(strA, str2), "rules_content_key"));
        } else {
            collectionC = iun.f15405a;
        }
        lc00VarB2.addAll(collectionC);
        z1s0 z1s0Var = gu1Var.b;
        xxb0 xxb0Var = w88Var.b;
        List list = w88Var.c;
        if (xxb0Var == xxb0.f41650a) {
            String strA2 = lsm0Var.a(R.string.player_info_position, Arrays.copyOf(new Object[0], 0));
            ArrayList arrayList = new ArrayList(r3d.q(list, 10));
            for (Object obj : list) {
                int i2 = i + 1;
                if (i < 0) {
                    q3d.p();
                    throw null;
                }
                pxb0 pxb0Var = (pxb0) obj;
                int i3 = pxb0Var.b;
                int i4 = pxb0Var.c;
                String str3 = i3 == i4 ? strA2 + ": " + i3 : strA2 + ": " + i3 + "-" + i4;
                String str4 = pxb0Var.f27747a;
                Long lT0 = StringsKt.t0(str4);
                arrayList.add(new d3s0(new tr1(lT0 != null ? lT0.longValue() : 0L, str3, cvm0.j(z1s0Var, pxb0Var, str, ctf0Var), false, false, cvm0.i(i2)), str4));
                i = i2;
            }
            i4VarR0 = dyb.r0(arrayList);
        } else {
            String strA3 = lsm0Var.a(R.string.stocks_prizes, Arrays.copyOf(new Object[0], 0));
            ArrayList arrayList2 = new ArrayList(r3d.q(list, 10));
            for (Object obj2 : list) {
                int i5 = i + 1;
                if (i < 0) {
                    q3d.p();
                    throw null;
                }
                pxb0 pxb0Var2 = (pxb0) obj2;
                String str5 = pxb0Var2.f27747a;
                Long lT1 = StringsKt.t0(str5);
                arrayList2.add(new d3s0(new tr1(lT1 != null ? lT1.longValue() : 0L, kng0.l(strA3, ": ", pxb0Var2.h), cvm0.j(z1s0Var, pxb0Var2, str, ctf0Var), false, false, cvm0.i(i5)), str5));
                i = i5;
            }
            i4VarR0 = dyb.r0(arrayList2);
        }
        lc00VarB2.addAll(i4VarR0);
        return dyb.r0(kotlin.collections.a.a(lc00VarB2));
    }

    public static final j83 h(a8q0 a8q0Var) {
        j83 j83Var = a8q0Var.f440a;
        long j = a8q0Var.b;
        j83Var.getClass();
        return j83Var.subSequence(o9q0.f(j), o9q0.e(j));
    }

    public static final j83 i(a8q0 a8q0Var, int i) {
        j83 j83Var = a8q0Var.f440a;
        j83 j83Var2 = a8q0Var.f440a;
        long j = a8q0Var.b;
        int iE = o9q0.e(j);
        int iE2 = o9q0.e(j);
        int length = iE2 + i;
        if (((i ^ length) & (iE2 ^ length)) < 0) {
            length = j83Var2.b.length();
        }
        return j83Var.subSequence(iE, Math.min(length, j83Var2.b.length()));
    }

    public static final j83 j(a8q0 a8q0Var, int i) {
        j83 j83Var = a8q0Var.f440a;
        long j = a8q0Var.b;
        int iF = o9q0.f(j);
        int i2 = iF - i;
        if (((iF ^ i2) & (i ^ iF)) < 0) {
            i2 = 0;
        }
        return j83Var.subSequence(Math.max(0, i2), o9q0.f(j));
    }

    public static final mem k(d0t d0tVar, ctf0 ctf0Var, m5l0 m5l0Var) {
        d0tVar.getClass();
        ctf0Var.getClass();
        boolean z = m5l0Var instanceof i5l0;
        long j = d0tVar.f5282a;
        if (z) {
            return new mem(j, dyb.g0(new dfm(j, j, dyb.g0(new a4n(dyb.g0(new bhl0(ctf0Var.b.a(R.string.all_markets, Arrays.copyOf(new Object[0], 0)))), new ygl0(), 12)))));
        }
        lc00 lc00VarB = kotlin.collections.a.b();
        a4x a4xVarO = o(1, d0tVar.f5282a, d0tVar.K);
        lc00VarB.addAll(a4xVarO);
        int size = 1 - a4xVarO.size();
        if (size > 0) {
            for (d0t d0tVar2 : d0tVar.k) {
                if (size > 0) {
                    String str = d0tVar2.i;
                    a4x a4xVarO2 = o(size, d0tVar2.f5282a, d0tVar2.K);
                    lc00VarB.addAll(a4xVarO2);
                    size -= a4xVarO2.size();
                }
            }
        }
        return new mem(j, dyb.o0(kotlin.collections.a.a(lc00VarB)));
    }

    public static final ugu0 l(x1 x1Var, glz glzVar) {
        if (glzVar.i.compareTo(lkz.f20223a) <= 0) {
            hny.p("Cannot configure ", x1Var, " to disposeComposition at Lifecycle ON_DESTROY: ", glzVar, "is already destroyed");
            return null;
        }
        g02 g02Var = new g02(x1Var, (byte) 4);
        glzVar.a(g02Var);
        return new ugu0(glzVar, g02Var, (byte) 1);
    }

    public static final void m(String str) {
        System.err.println("SLF4J: " + str);
    }

    public static final void n(String str, Throwable th) {
        System.err.println(str);
        System.err.println("Reported exception:");
        th.printStackTrace();
    }

    public static final a4x o(int i, long j, List list) {
        Iterator it;
        List listO0;
        chl0 chl0Var;
        Iterator it2;
        k0d k0dVar;
        lc00 lc00VarB = kotlin.collections.a.b();
        Iterator it3 = list.iterator();
        boolean z = false;
        int i2 = 0;
        while (it3.hasNext()) {
            Object next = it3.next();
            int i3 = i2 + 1;
            if (i2 < 0) {
                q3d.p();
                throw null;
            }
            BetGroupZip betGroupZip = (BetGroupZip) next;
            if (lc00VarB.b() < i) {
                List list2 = betGroupZip.f;
                int i4 = betGroupZip.e;
                if (i4 > 3) {
                    i4 = 3;
                }
                ArrayList arrayList = new ArrayList();
                if (i4 == 0) {
                    listO0 = lak0.c;
                    it = it3;
                } else {
                    for (List<BetZip> list3 : CollectionsKt.K(list2, i4)) {
                        ArrayList arrayList2 = new ArrayList(r3d.q(list3, 10));
                        for (BetZip betZip : list3) {
                            String strM = ju70.M(betZip, z);
                            if (betZip.t.length() == 0 && (strM.length() == 0 || strM.equals("0"))) {
                                it2 = it3;
                                chl0Var = null;
                            } else {
                                String str = betZip.t;
                                izc izcVar = betZip.v;
                                boolean z2 = betZip.f;
                                int iOrdinal = izcVar.ordinal();
                                if (iOrdinal != 0) {
                                    it2 = it3;
                                    if (iOrdinal == 1) {
                                        k0dVar = k0d.d;
                                    } else {
                                        if (iOrdinal != 2) {
                                            t9f.b();
                                            return null;
                                        }
                                        k0dVar = k0d.f17460a;
                                    }
                                } else {
                                    it2 = it3;
                                    k0dVar = k0d.c;
                                }
                                if (z2) {
                                    k0dVar = k0d.b;
                                }
                                chl0Var = new chl0(str, strM, k0dVar, a65.f301a, betZip.y, betZip.w, betZip.h1, false, new xgl0(betZip.f46426a, betZip.d, betZip.b, betZip.t, 0, 0L, 0, 0L, false));
                            }
                            arrayList2.add(chl0Var);
                            it3 = it2;
                            z = false;
                        }
                        Iterator it4 = it3;
                        Object obj = null;
                        if (arrayList2.size() < i4) {
                            int size = i4 - arrayList2.size();
                            ArrayList arrayList3 = new ArrayList(size);
                            int i5 = 0;
                            while (i5 < size) {
                                arrayList3.add(obj);
                                i5++;
                                obj = null;
                            }
                            arrayList2 = CollectionsKt.q0(arrayList2, arrayList3);
                        }
                        arrayList.add(new a4n(dyb.o0(arrayList2), new ygl0(), 12));
                        it3 = it4;
                        z = false;
                    }
                    it = it3;
                    listO0 = dyb.o0(arrayList);
                }
                if (listO0.isEmpty()) {
                    continue;
                } else {
                    int i6 = 0;
                    for (Object obj2 : listO0) {
                        int i7 = i6 + 1;
                        if (i6 < 0) {
                            q3d.p();
                            throw null;
                        }
                        a4n a4nVar = (a4n) obj2;
                        if (lc00VarB.b() < i) {
                            lc00VarB.add(new dfm(j, betGroupZip.b, dyb.g0(a4nVar)));
                        }
                        i6 = i7;
                    }
                }
            } else {
                it = it3;
            }
            i2 = i3;
            it3 = it;
            z = false;
        }
        return dyb.o0(kotlin.collections.a.a(lc00VarB));
    }

    public static final gxo0 p(iwo0 iwo0Var, String str, boolean z) {
        iwo0Var.getClass();
        str.getClass();
        boolean z2 = iwo0Var.f15501a;
        boolean z3 = iwo0Var.b;
        gmk emkVar = null;
        if (!z2) {
            return null;
        }
        String str2 = iwo0Var.c;
        String str3 = iwo0Var.e;
        if (!z3 && !z) {
            double d = iwo0Var.d;
            if (d > 0.0d) {
                pn40 pn40Var = pn40.f27267a;
                emkVar = new fmk(pn40.c(d, p3u0.c), str);
            } else if (d < 0.0d) {
                pn40 pn40Var2 = pn40.f27267a;
                emkVar = new emk(pn40.c(d, p3u0.c), str);
            }
        }
        gmk gmkVar = emkVar;
        boolean z4 = z3 || z;
        List<mvo0> list = iwo0Var.f;
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        for (mvo0 mvo0Var : list) {
            arrayList.add(new dxo0(mvo0Var.f22468a, mvo0Var.b));
        }
        return new gxo0(str2, str3, gmkVar, z4, dyb.r0(arrayList));
    }

    public static final lrq0 q(hlr0 hlr0Var, ulr0 ulr0Var, String str) {
        int i = hlr0Var.g;
        str.getClass();
        return ulr0Var == ulr0.TOTO_1XTOTO ? new jrq0(wzb.p0(String.valueOf(i)), wzb.p0(String.valueOf(hlr0Var.h))) : new krq0(ofm0.n(hlr0Var.d, str), ofm0.n(hlr0Var.e, str), ofm0.n(hlr0Var.f, str), wzb.p0(String.valueOf(i)), wzb.p0(String.valueOf(hlr0Var.i)), wzb.p0(String.valueOf(hlr0Var.j)));
    }

    public static final List r(omr0 omr0Var) {
        List list = omr0Var.f25517a;
        ArrayList arrayList = null;
        if (list != null) {
            ArrayList arrayList2 = new ArrayList(r3d.q(list, 10));
            int i = 0;
            for (Object obj : list) {
                int i2 = i + 1;
                if (i < 0) {
                    q3d.p();
                    throw null;
                }
                kmr0 kmr0Var = (kmr0) obj;
                Integer num = kmr0Var.f18556a;
                int iIntValue = num != null ? num.intValue() : -1;
                String str = kmr0Var.b;
                if (str == null) {
                    str = "";
                }
                ulr0.b.getClass();
                arrayList2.add(new lmr0(iIntValue, str, g9m0.b(iIntValue), i == 0));
                i = i2;
            }
            arrayList = arrayList2;
        }
        return arrayList == null ? iun.f15405a : arrayList;
    }

    public static byte[] s(byte[]... bArr) {
        int i = 0;
        int length = 0;
        while (true) {
            if (i >= bArr.length) {
                break;
            }
            length += bArr[i].length;
            i++;
        }
        byte[] bArr2 = new byte[length];
        int i2 = 0;
        for (byte[] bArr3 : bArr) {
            int length2 = bArr3.length;
            System.arraycopy(bArr3, 0, bArr2, i2, length2);
            i2 += length2;
        }
        return bArr2;
    }
}
