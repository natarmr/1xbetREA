package a;

import android.gov.nist.core.Separators;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes5.dex */
public abstract class yum0 {
    public static final void a(int i, fet fetVar, Function0 function0) {
        function0.getClass();
        fetVar.g0(19422470);
        int i2 = (fetVar.i(function0) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(jm40.b, 0.0f, 0.0f, 0.0f, 8.0f, 7);
            zfn zfnVar = m8m0.f21378a;
            imm immVar = new imm(new ilm(((StaticColors) fetVar.k(zfnVar)).m123getWhite0d7_KjU()), new olm(xsm0.s(R.string.toto_jackpot_title, fetVar), xsm0.s(R.string.toto_draws, fetVar), ((StaticColors) fetVar.k(zfnVar)).m123getWhite0d7_KjU(), ((StaticColors) fetVar.k(zfnVar)).m123getWhite0d7_KjU(), fa50.f9191a), fmm.f9790a, ((StaticColors) fetVar.k(zfnVar)).m121getTransparent0d7_KjU(), false, null);
            boolean z = (i2 & 14) == 4;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new xhl0(function0, (byte) 15);
                fetVar.o0(objP);
            }
            hlm.c(mm40VarN, immVar, null, (Function0) objP, null, null, null, null, null, null, null, jar0.f, fetVar, 0, 48, 2036);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wr4((byte) 11, i, function0);
        }
    }

    public static final void b(mm40 mm40Var, Function1 function1, ugd ugdVar, fet fetVar, int i) {
        fetVar.g0(-1688127740);
        int i2 = i | 54 | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            Object obj = (mwv0) fetVar.k(ps00.f27491a);
            if (obj == null) {
                throw new tiu0("XBottomSheetScreen должен быть хостом сцены навигации, предоставляющей LocalXBottomSheetSceneState", (byte) 1);
            }
            fetVar.e0(1206891540);
            w6k w6kVar = (w6k) fetVar.k(bmd.h);
            long jB = ((yez) ((rhv0) fetVar.k(bmd.u))).b();
            WeakHashMap weakHashMap = djv0.w;
            int i3 = zcm0.i(fetVar).e.e().d;
            int i4 = zcm0.i(fetVar).f.e().b;
            Object objP = fetVar.P();
            Object obj2 = ukd.f35823a;
            if (objP == obj2) {
                objP = m0x0.I(kotlin.coroutines.g.f46065a, fetVar);
                fetVar.o0(objP);
            }
            vne vneVar = (vne) objP;
            Object objP2 = fetVar.P();
            if (objP2 == obj2) {
                objP2 = new wwv0();
                function1.invoke(objP2);
                fetVar.o0(objP2);
            }
            Object obj3 = (wwv0) objP2;
            Object euv0Var = new euv0(w6kVar, jB, i3, i4, vneVar);
            Object[] objArr = new Object[0];
            v0h0 v0h0Var = zwv0.f45129a;
            boolean zI = fetVar.i(obj3) | fetVar.g(euv0Var);
            Object objP3 = fetVar.P();
            if (zI || objP3 == obj2) {
                objP3 = new ugu0(obj3, euv0Var, (byte) 10);
                fetVar.o0(objP3);
            }
            ywv0 ywv0Var = (ywv0) e9x.R(objArr, v0h0Var, (Function0) objP3, fetVar, 0);
            boolean zG = fetVar.g(ywv0Var) | fetVar.g(euv0Var);
            Object objP4 = fetVar.P();
            if (zG || objP4 == obj2) {
                objP4 = new ugu0(ywv0Var, euv0Var, (byte) 11);
                fetVar.o0(objP4);
            }
            m0x0.D((Function0) objP4, fetVar);
            boolean zG2 = fetVar.g(ywv0Var);
            Object objP5 = fetVar.P();
            if (zG2 || objP5 == obj2) {
                objP5 = new gtv0(ywv0Var, (byte) 4);
                fetVar.o0(objP5);
            }
            m0x0.o(ywv0Var, (Function1) objP5, fetVar);
            fetVar.r(false);
            boolean zG3 = fetVar.g(obj) | fetVar.g(ywv0Var);
            Object objP6 = fetVar.P();
            if (zG3 || objP6 == obj2) {
                objP6 = new zfv0(obj, ywv0Var, (byte) 15);
                fetVar.o0(objP6);
            }
            m0x0.n(ywv0Var, obj, (Function1) objP6, fetVar);
            boolean zG4 = fetVar.g(ywv0Var) | fetVar.g(obj);
            Object objP7 = fetVar.P();
            yje yjeVar = null;
            if (zG4 || objP7 == obj2) {
                objP7 = new wbl0(obj, ywv0Var, yjeVar, (byte) 19);
                fetVar.o0(objP7);
            }
            m0x0.t(fetVar, ywv0Var, (Function2) objP7);
            boolean zG5 = fetVar.g(obj);
            Object objP8 = fetVar.P();
            if (zG5 || objP8 == obj2) {
                objP8 = new m91(obj, yjeVar, (byte) 26);
                fetVar.o0(objP8);
            }
            tlb.j(ywv0Var, (Function1) objP8, ugdVar, fetVar, 24582);
            mm40Var = jm40.b;
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gdr0(mm40Var, function1, ugdVar, i);
        }
    }

    public static final void c(lc00 lc00Var, ctf0 ctf0Var, String str) {
        lc00Var.add(m2x.t(ctf0Var, R.string.special_event_all_opponents, ar40.c, str.concat("WhoWin")));
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0020  */
    public static final e2z d(f2h f2hVar) {
        String str = f2hVar.d;
        str.getClass();
        if (!kotlin.text.c.x(str, ujn.h, false)) {
            if (str.length() == 0) {
                str = "";
            } else {
                List list = u0d.f34849a;
                if (u0d.c(str)) {
                    str = "";
                } else {
                    str = String.format(Locale.ENGLISH, StringsKt.O(str, "playerlogo/", true) ? "%s/%s" : "%s/playerlogo/%s", Arrays.copyOf(new Object[]{ujn.h, str}, 2));
                }
            }
        }
        return new e2z(str);
    }

    public static final dao e(long j, List list) {
        Object next;
        list.getClass();
        bkq bkqVar = new bkq(pgi0.k(pgi0.k(pgi0.k(new sx3(list, (byte) 1), new f8l0((byte) 16)), new f8l0((byte) 17)), new f8l0((byte) 18)));
        while (bkqVar.hasNext()) {
            next = bkqVar.next();
            if (((dao) next).m.f32198a == j) {
                return (dao) next;
            }
        }
        next = null;
        return (dao) next;
    }

    public static View f(View view, int i) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View viewFindViewById = viewGroup.getChildAt(i2).findViewById(i);
            if (viewFindViewById != null) {
                return viewFindViewById;
            }
        }
        return null;
    }

    public static final jge0 g(ou90 ou90Var, int i, nls0 nls0Var, a9q0 a9q0Var, boolean z, int i2) {
        jge0 jge0VarC = a9q0Var != null ? a9q0Var.c(nls0Var.b.s(i)) : jge0.e;
        int iT = ou90Var.T(2.0f);
        float f = jge0VarC.f16474a;
        return jge0.b(jge0VarC, z ? (i2 - f) - iT : f, z ? i2 - f : iT + f, 10);
    }

    public static int h(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return i ^ (i2 << 8);
    }

    public static int i(byte[] bArr, int i, int i2) {
        byte b = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 == 0) {
            if (b > -12) {
                return -1;
            }
            return b;
        }
        if (i3 == 1) {
            return h(b, bArr[i]);
        }
        if (i3 != 2) {
            throw new AssertionError();
        }
        byte b2 = bArr[i];
        byte b3 = bArr[i + 1];
        if (b > -12 || b2 > -65 || b3 > -65) {
            return -1;
        }
        return (b3 << 16) ^ ((b2 << 8) ^ b);
    }

    public static final void j(String str, String str2, String str3) {
        str.getClass();
        System.out.println((Object) (str + Separators.COLON + str2 + Separators.SP + str3));
    }

    public static int k(byte[] bArr, int i, int i2) {
        while (i < i2 && bArr[i] >= 0) {
            i++;
        }
        if (i >= i2) {
            return 0;
        }
        while (i < i2) {
            int i3 = i + 1;
            byte b = bArr[i];
            if (b >= 0) {
                i = i3;
            } else if (b < -32) {
                if (i3 >= i2) {
                    return b;
                }
                if (b < -62) {
                    return -1;
                }
                i += 2;
                if (bArr[i3] > -65) {
                    return -1;
                }
            } else if (b < -16) {
                if (i3 >= i2 - 1) {
                    return i(bArr, i3, i2);
                }
                int i4 = i + 2;
                byte b2 = bArr[i3];
                if (b2 > -65) {
                    return -1;
                }
                if (b == -32 && b2 < -96) {
                    return -1;
                }
                if (b == -19 && b2 >= -96) {
                    return -1;
                }
                i += 3;
                if (bArr[i4] > -65) {
                    return -1;
                }
            } else {
                if (i3 >= i2 - 2) {
                    return i(bArr, i3, i2);
                }
                int i5 = i + 2;
                byte b3 = bArr[i3];
                if (b3 > -65) {
                    return -1;
                }
                if ((((b3 + 112) + (b << 28)) >> 30) != 0) {
                    return -1;
                }
                int i6 = i + 3;
                if (bArr[i5] > -65) {
                    return -1;
                }
                i += 4;
                if (bArr[i6] > -65) {
                    return -1;
                }
            }
        }
        return 0;
    }

    public static ess0 l(ess0 ess0Var, String[] strArr, Map map) {
        int i = 0;
        if (ess0Var == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return (ess0) map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                ess0 ess0Var2 = new ess0();
                int length = strArr.length;
                while (i < length) {
                    ess0Var2.a((ess0) map.get(strArr[i]));
                    i++;
                }
                return ess0Var2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                ess0Var.a((ess0) map.get(strArr[0]));
                return ess0Var;
            }
            if (strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i < length2) {
                    ess0Var.a((ess0) map.get(strArr[i]));
                    i++;
                }
            }
        }
        return ess0Var;
    }

    public static void m(androidx.fragment.app.e eVar) {
        eVar.getClass();
        if (eVar.J("TotoBetTypeBottomSheetTag") != null) {
            return;
        }
        new ylr0().H0(eVar, "TotoBetTypeBottomSheetTag");
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0075  */
    public static final ixo0 n(kwo0 kwo0Var, String str, boolean z) {
        xwo0 xwo0Var;
        bxo0 zwo0Var;
        tn7 sn7Var;
        str.getClass();
        boolean z2 = kwo0Var.f19012a;
        double d = kwo0Var.d;
        String str2 = kwo0Var.c;
        boolean z3 = kwo0Var.b;
        if (!z3 && !z) {
            if (d == 0.0d) {
                xwo0Var = null;
            } else {
                int i = cy7.f5159a;
                pn40 pn40Var = pn40.f27267a;
                zwo0Var = new zwo0(cy7.e(pn40.p(str, d)), d > 0.0d ? d4d.COMMERCE : d4d.TEXT_PRIMARY);
            }
            String str3 = kwo0Var.e;
            if (!z3 || z) {
                sn7Var = rn7.f30774a;
            } else {
                List<mvo0> list = kwo0Var.f;
                ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                for (mvo0 mvo0Var : list) {
                    arrayList.add(new fuy(mvo0Var.f22468a, mvo0Var.b));
                }
                sn7Var = new sn7(dyb.r0(arrayList));
            }
            return new ixo0(z2, str2, zwo0Var, str3, sn7Var);
        }
        xwo0Var = xwo0.f41619a;
        zwo0Var = xwo0Var;
        String str4 = kwo0Var.e;
        if (z3) {
            sn7Var = rn7.f30774a;
        } else {
            sn7Var = rn7.f30774a;
        }
        return new ixo0(z2, str2, zwo0Var, str4, sn7Var);
    }

    public static final w2s0 o(z2s0 z2s0Var) {
        z2s0Var.getClass();
        Long l = z2s0Var.f43687a;
        if (l == null) {
            jf4.k(null);
            return null;
        }
        long jLongValue = l.longValue();
        Boolean bool = z2s0Var.b;
        if (bool == null) {
            jf4.k(null);
            return null;
        }
        boolean zBooleanValue = bool.booleanValue();
        Long l2 = z2s0Var.c;
        long jLongValue2 = l2 != null ? l2.longValue() : 0L;
        Boolean bool2 = z2s0Var.d;
        if (bool2 != null) {
            return new w2s0(jLongValue, jLongValue2, zBooleanValue, bool2.booleanValue());
        }
        jf4.k(null);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final List p(ctf0 ctf0Var, List list) throws Throwable {
        Iterator it;
        Object next;
        hjm hjmVar;
        Iterator it2;
        efb efbVar;
        Object next2;
        Throwable th;
        Object next3;
        list.getClass();
        ctf0Var.getClass();
        if (list.isEmpty()) {
            return iun.f15405a;
        }
        lc00 lc00VarB = kotlin.collections.a.b();
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            ifb ifbVar = (ifb) it3.next();
            Throwable th2 = null;
            if (ifbVar != null) {
                int i = 10;
                int i2 = 0;
                if (ifbVar instanceof ffb) {
                    ffb ffbVar = (ffb) ifbVar;
                    List list2 = ffbVar.f9441a;
                    if (!list2.isEmpty()) {
                        String strA = ctf0Var.b.a(R.string.special_events_who_win_in_final, Arrays.copyOf(new Object[0], 0));
                        pz40 pz40Var = s6t0.f31722a;
                        lc00VarB.add(new eok0(new hjm(strA, null, new y3d(s6t0.b().f33626a.getTextPrimary()), null, null, null, false, null, null, false, null, null, 8186), null, i9h0.f14386a));
                        List listD0 = CollectionsKt.D0(list2, 4);
                        ArrayList arrayList = new ArrayList(r3d.q(listD0, 10));
                        for (Object obj : listD0) {
                            int i3 = i2 + 1;
                            if (i2 < 0) {
                                Throwable th3 = th2;
                                q3d.p();
                                throw th3;
                            }
                            f280 f280Var = (f280) obj;
                            String strI = f140.i(f280Var.f8801a, "_FINAL_SECTION_KEY");
                            Iterator it4 = ffbVar.b.iterator();
                            while (true) {
                                if (!it4.hasNext()) {
                                    th = th2;
                                    next3 = th;
                                    break;
                                }
                                next3 = it4.next();
                                th = th2;
                                if (((nms) next3).f23786a == f280Var.d.i) {
                                    break;
                                }
                                th2 = th;
                            }
                            nms nmsVar = (nms) next3;
                            arrayList.add(new lcv0(strI, jtt0.u(f280Var, nmsVar != null ? Integer.valueOf(nmsVar.f23786a) : th, unh0.i0(i2, listD0), i2)));
                            th2 = th;
                            i2 = i3;
                        }
                        lc00VarB.addAll(arrayList);
                        if (list2.size() > 4) {
                            c(lc00VarB, ctf0Var, "FINAL_SECTION_KEY");
                        }
                    }
                } else {
                    if (ifbVar instanceof efb) {
                        efb efbVar2 = (efb) ifbVar;
                        List list3 = efbVar2.f7714a;
                        if (!list3.isEmpty()) {
                            String strA2 = ctf0Var.b.a(R.string.special_events_who_win, Arrays.copyOf(new Object[0], 0));
                            pz40 pz40Var2 = s6t0.f31722a;
                            lc00VarB.add(new eok0(new hjm(strA2, null, new y3d(s6t0.b().f33626a.getTextPrimary()), null, null, null, false, null, null, false, null, null, 8186), null, i9h0.f14386a));
                            ArrayList arrayList2 = new ArrayList(r3d.q(list3, 10));
                            int i4 = 0;
                            for (Object obj2 : list3) {
                                int i5 = i4 + 1;
                                if (i4 < 0) {
                                    q3d.p();
                                    throw null;
                                }
                                dfb dfbVar = (dfb) obj2;
                                List list4 = efbVar2.b;
                                dfbVar.getClass();
                                String str = dfbVar.f5992a;
                                list4.getClass();
                                List listD1 = CollectionsKt.D0(dfbVar.b, 4);
                                if (str.length() > 0) {
                                    pz40 pz40Var3 = s6t0.f31722a;
                                    hjmVar = new hjm(str, null, new y3d(s6t0.b().f33626a.getTextPrimary()), null, null, null, false, null, null, false, null, null, 8186);
                                } else {
                                    hjmVar = null;
                                }
                                ArrayList arrayList3 = new ArrayList(r3d.q(listD1, i));
                                int i6 = 0;
                                for (Object obj3 : listD1) {
                                    int i7 = i6 + 1;
                                    if (i6 < 0) {
                                        q3d.p();
                                        throw null;
                                    }
                                    f280 f280Var2 = (f280) obj3;
                                    Iterator it5 = list4.iterator();
                                    while (true) {
                                        if (!it5.hasNext()) {
                                            it2 = it3;
                                            efbVar = efbVar2;
                                            next2 = null;
                                            break;
                                        }
                                        next2 = it5.next();
                                        it2 = it3;
                                        efbVar = efbVar2;
                                        if (((nms) next2).f23786a == f280Var2.d.i) {
                                            break;
                                        }
                                        it3 = it2;
                                        efbVar2 = efbVar;
                                    }
                                    nms nmsVar2 = (nms) next2;
                                    arrayList3.add(jtt0.u(f280Var2, nmsVar2 != null ? Integer.valueOf(nmsVar2.f23786a) : null, unh0.i0(i6, listD1), i6));
                                    i6 = i7;
                                    it3 = it2;
                                    efbVar2 = efbVar;
                                }
                                arrayList2.add(new ecv0(i4, hjmVar, dyb.r0(arrayList3)));
                                i4 = i5;
                                it3 = it3;
                                efbVar2 = efbVar2;
                                i = 10;
                            }
                            it = it3;
                            lc00VarB.add(new kcv0(dyb.r0(arrayList2)));
                            if (!list3.isEmpty()) {
                                Iterator it6 = list3.iterator();
                                while (it6.hasNext()) {
                                    if (((dfb) it6.next()).b.size() > 4) {
                                        c(lc00VarB, ctf0Var, "GROUP_STAGE_SECTION_KEY");
                                        break;
                                    }
                                }
                            }
                        }
                    } else {
                        it = it3;
                        if (ifbVar instanceof gfb) {
                            gfb gfbVar = (gfb) ifbVar;
                            List list5 = gfbVar.f11200a;
                            if (list5.isEmpty()) {
                                continue;
                            } else {
                                int i8 = 0;
                                String strA3 = ctf0Var.b.a(R.string.special_events_who_win_in_play_off, Arrays.copyOf(new Object[0], 0));
                                pz40 pz40Var4 = s6t0.f31722a;
                                lc00VarB.add(new eok0(new hjm(strA3, null, new y3d(s6t0.b().f33626a.getTextPrimary()), null, null, null, false, null, null, false, null, null, 8186), null, i9h0.f14386a));
                                List listD2 = CollectionsKt.D0(list5, 4);
                                ArrayList arrayList4 = new ArrayList(r3d.q(listD2, 10));
                                for (Object obj4 : listD2) {
                                    int i9 = i8 + 1;
                                    if (i8 < 0) {
                                        q3d.p();
                                        throw null;
                                    }
                                    f280 f280Var3 = (f280) obj4;
                                    String strI2 = f140.i(f280Var3.f8801a, "_PLAY_OFF_SECTION_KEY");
                                    Iterator it7 = gfbVar.b.iterator();
                                    do {
                                        if (!it7.hasNext()) {
                                            next = null;
                                            break;
                                        }
                                        next = it7.next();
                                    } while (((nms) next).f23786a != f280Var3.d.i);
                                    nms nmsVar3 = (nms) next;
                                    arrayList4.add(new lcv0(strI2, jtt0.u(f280Var3, nmsVar3 != null ? Integer.valueOf(nmsVar3.f23786a) : null, unh0.i0(i8, listD2), i8)));
                                    i8 = i9;
                                }
                                lc00VarB.addAll(arrayList4);
                                if (list5.size() > 4) {
                                    c(lc00VarB, ctf0Var, "PLAY_OFF_SECTION_KEY");
                                }
                            }
                        }
                    }
                    it3 = it;
                }
                it = it3;
                it3 = it;
            }
            t9f.b();
            return null;
        }
        return kotlin.collections.a.a(lc00VarB);
    }

    public static int q(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i != 3) {
            return i != 4 ? 0 : 5;
        }
        return 4;
    }
}
