package a;

import android.gov.nist.core.Separators;
import android.javax.sip.message.Response;
import android.net.NetworkRequest;
import android.os.Build;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public abstract class x1x {
    public static hl50 A(int[] iArr, int[] iArr2) {
        NetworkRequest.Builder builder = new NetworkRequest.Builder();
        for (int i : iArr) {
            try {
                builder.addCapability(i);
            } catch (IllegalArgumentException e) {
                wv00 wv00VarF = wv00.f();
                String str = hl50.b;
                wv00VarF.i(e, hl50.b, ua80.e(i, "Ignoring adding capability '", Separators.QUOTE));
            }
        }
        int[] iArr3 = ahy.e;
        for (int i2 = 0; i2 < 3; i2++) {
            int i3 = iArr3[i2];
            if (!tx3.w(iArr, i3)) {
                try {
                    builder.removeCapability(i3);
                } catch (IllegalArgumentException e2) {
                    wv00 wv00VarF2 = wv00.f();
                    String str2 = hl50.b;
                    wv00VarF2.i(e2, hl50.b, ua80.e(i3, "Ignoring removing default capability '", Separators.QUOTE));
                }
            }
        }
        for (int i4 : iArr2) {
            builder.addTransportType(i4);
        }
        NetworkRequest networkRequestBuild = builder.build();
        networkRequestBuild.getClass();
        return new hl50(networkRequestBuild);
    }

    public static diu0 B(Class cls) throws InvocationTargetException {
        try {
            Constructor declaredConstructor = cls.getDeclaredConstructor(null);
            if (!Modifier.isPublic(declaredConstructor.getModifiers())) {
                e9d0.r(cls, "Cannot create an instance of ");
                return null;
            }
            try {
                Object objNewInstance = declaredConstructor.newInstance(null);
                objNewInstance.getClass();
                return (diu0) objNewInstance;
            } catch (IllegalAccessException e) {
                e9d0.l("Cannot create an instance of ", cls, e);
                return null;
            } catch (InstantiationException e2) {
                e9d0.l("Cannot create an instance of ", cls, e2);
                return null;
            }
        } catch (NoSuchMethodException e3) {
            e9d0.l("Cannot create an instance of ", cls, e3);
            return null;
        }
    }

    public static final long D(a570 a570Var) {
        a570Var.getClass();
        if (a570Var != null) {
            if (a570Var instanceof w470) {
                return ((w470) a570Var).f38531a.a();
            }
            if (a570Var instanceof z470) {
                return ((z470) a570Var).f43755a;
            }
        }
        t9f.b();
        return 0L;
    }

    public static final fel0 E(long j, long j2, int i, List list, wcb wcbVar) {
        Object next;
        eel0 ael0Var;
        list.getClass();
        wcbVar.getClass();
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((lok0) next).f20396a != i);
        lok0 lok0Var = (lok0) next;
        String strA = wcbVar.a(j, j2);
        if (lok0Var != null) {
            int i2 = lok0Var.f20396a;
            String strValueOf = lok0Var.u;
            strValueOf.getClass();
            bzu bzuVar = new bzu((byte) 23);
            bzuVar.g("static");
            bzuVar.g("img");
            bzuVar.g("android");
            bzuVar.g("TopChamps");
            if (strValueOf.length() == 0) {
                strValueOf = String.valueOf(i2);
            }
            axq.u(bzuVar, strValueOf, "backgrounds", "icon.svg");
            ael0Var = new cel0(strA, ((StringBuilder) bzuVar.b).toString(), lok0Var.n, lok0Var.p);
        } else {
            ael0Var = new ael0(strA);
        }
        return new fel0(ael0Var);
    }

    public static final a9q0 F(nai0 nai0Var) {
        Function1 function1;
        ArrayList arrayList = new ArrayList();
        Object objG = nai0Var.f23193a.g(mai0.f21459a);
        if (objG == null) {
            objG = null;
        }
        m6 m6Var = (m6) objG;
        if (m6Var == null || (function1 = (Function1) m6Var.b) == null || !((Boolean) function1.invoke(arrayList)).booleanValue()) {
            return null;
        }
        return (a9q0) arrayList.get(0);
    }

    public static final boolean G(a570 a570Var) {
        a570Var.getClass();
        t470 t470Var = a570.Companion;
        long jD = D(a570Var);
        t470Var.getClass();
        return jD > 0;
    }

    public static final long H(long j, long j2) {
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32)) + ((int) (j2 >> 32)))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) + ((int) (j2 & 4294967295L)))) & 4294967295L);
    }

    public static final gbn I() {
        return new gbn(new ksc0((byte) 2), new o5c0(3, (byte) 11), new ljc0((byte) 9), x4c0.n);
    }

    public static final long J(long j) {
        int iRound = Math.round(Float.intBitsToFloat((int) (j >> 32)));
        return (((long) Math.round(Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (((long) iRound) << 32);
    }

    public static final k33 K(p33 p33Var, int i) {
        Object next;
        Iterator<T> it = p33Var.getLayoutNodeToHolder().entrySet().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((e7z) ((Map.Entry) next).getKey()).b != i);
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return (k33) entry.getValue();
        }
        return null;
    }

    public static String L(s760 s760Var) {
        s760Var.getClass();
        evz evzVar = r760.f29964a;
        long j = s760Var.b;
        evzVar.getClass();
        r760 r760VarF = evz.f(j);
        boolean z = s760Var.c;
        int iOrdinal = r760VarF.ordinal();
        if (iOrdinal == 0) {
            return z ? "mb_p_score_on" : "mb_p_score_off";
        }
        if (iOrdinal == 1) {
            return z ? "mb_p_yellow_on" : "mb_p_yellow_off";
        }
        if (iOrdinal == 2) {
            return z ? "mb_p_corner_on" : "mb_p_corner_off";
        }
        if (iOrdinal == 3) {
            return z ? "mb_p_red_on" : "mb_p_red_off";
        }
        if (iOrdinal == 4) {
            return z ? "mb_p_penalty_on" : "mb_p_penalty_off";
        }
        if (iOrdinal != 10) {
            return "";
        }
        return z ? "mb_p_replace_on" : "mb_p_replace_off";
    }

    public static final long M(zi50 zi50Var) {
        zi50Var.getClass();
        int iOrdinal = zi50Var.ordinal();
        if (iOrdinal == 0) {
            pz40 pz40Var = s6t0.f31722a;
            return StaticColors.INSTANCE.m123getWhite0d7_KjU();
        }
        if (iOrdinal == 1) {
            pz40 pz40Var2 = s6t0.f31722a;
            return StaticColors.INSTANCE.m98getGreen0d7_KjU();
        }
        if (iOrdinal == 2) {
            pz40 pz40Var3 = s6t0.f31722a;
            return StaticColors.INSTANCE.m113getRed0d7_KjU();
        }
        t9f.b();
        return 0L;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ea  */
    public static final aaj N(List list, ctf0 ctf0Var, String str, jaj jajVar, boolean z) {
        kmo kmoVar;
        String strA;
        jkv0 jkv0Var;
        jkv0 jkv0Var2;
        list.getClass();
        ctf0Var.getClass();
        str.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = CollectionsKt.A0(list, new wpv((byte) 8)).iterator();
        while (true) {
            kmoVar = null;
            if (!it.hasNext()) {
                break;
            }
            aq30 aq30Var = (aq30) it.next();
            rdj rdjVar = rdj.f30294a;
            long j = aq30Var.b;
            zp30 zp30Var = aq30Var.d;
            zp30 zp30Var2 = aq30Var.c;
            fe30 fe30Var = aq30Var.e;
            String strF = rdj.f(new znq0(j), sdj.UNIVERSAL, null, 60);
            if (fe30Var instanceof ee30) {
                ee30 ee30Var = (ee30) fe30Var;
                strA = ctf0Var.b.a(R.string.placeholder_score_two_teams, Arrays.copyOf(new Object[]{Integer.valueOf(ee30Var.f7650a), Integer.valueOf(ee30Var.b)}, 2));
            } else {
                strA = ctf0Var.b.a(R.string.vs, Arrays.copyOf(new Object[0], 0));
            }
            String str2 = strA;
            String str3 = aq30Var.f1279a;
            ndp0 ndp0Var = new ndp0(new c5a0(new c280(zp30Var2.b, R.drawable.ic_glyph_placeholder_player)));
            String str4 = zp30Var2.c;
            ndp0 ndp0Var2 = new ndp0(new c5a0(new c280(zp30Var.b, R.drawable.ic_glyph_placeholder_player)));
            String str5 = zp30Var.c;
            zg30 zg30VarA = fe30Var.a();
            if (zg30VarA == null) {
                jkv0Var = jkv0.c;
            } else if (zg30VarA instanceof wg30) {
                jkv0Var = jkv0.f16689a;
            } else if (zg30VarA instanceof xg30) {
                jkv0Var = jkv0.b;
            } else if (zg30VarA instanceof vg30) {
                jkv0Var = jkv0.c;
            } else {
                jkv0Var = jkv0.c;
            }
            jkv0 jkv0Var3 = jkv0Var;
            zg30 zg30VarA2 = fe30Var.a();
            if (zg30VarA2 == null) {
                jkv0Var2 = jkv0.c;
            } else if (zg30VarA2 instanceof wg30) {
                jkv0Var2 = jkv0.b;
            } else if (zg30VarA2 instanceof xg30) {
                jkv0Var2 = jkv0.f16689a;
            } else if (zg30VarA2 instanceof vg30) {
                jkv0Var2 = jkv0.c;
            } else {
                jkv0Var2 = jkv0.c;
            }
            arrayList.add(new elo0(ndp0Var, str4, ndp0Var2, str5, strF, str2, str3, jkv0Var3, jkv0Var2));
        }
        a4x a4xVarO0 = z ? dyb.o0(arrayList) : dyb.r0(CollectionsKt.D0(arrayList, 3));
        if (arrayList.size() - 1 > 2) {
            lsm0 lsm0Var = ctf0Var.b;
            kmoVar = new kmo(lsm0Var.a(R.string.expand, Arrays.copyOf(new Object[0], 0)), lsm0Var.a(R.string.collapse, Arrays.copyOf(new Object[0], 0)), z);
        }
        return new aaj(jajVar, str, a4xVarO0, kmoVar);
    }

    public static final String O(int i) {
        if (i == 0) {
            return "android.widget.Button";
        }
        if (i == 1) {
            return "android.widget.CheckBox";
        }
        if (i == 3) {
            return "android.widget.RadioButton";
        }
        if (i == 5) {
            return "android.widget.ImageView";
        }
        if (i == 6) {
            return "android.widget.Spinner";
        }
        if (i == 7) {
            return "android.widget.NumberPicker";
        }
        return null;
    }

    public static final ri10 P(ui10 ui10Var) {
        Object next;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Integer num = ui10Var.f35708a;
        long jIntValue = num != null ? (((long) num.intValue()) * 1000) + jCurrentTimeMillis : jCurrentTimeMillis;
        c0o c0oVar = vi10.e;
        y2 y2VarH = ohs0.h(c0oVar, c0oVar);
        do {
            if (!y2VarH.hasNext()) {
                next = null;
                break;
            }
            next = y2VarH.next();
        } while (!((vi10) next).f37455a.equals(ui10Var.b));
        vi10 vi10Var = (vi10) next;
        if (vi10Var == null) {
            jf4.k(null);
            return null;
        }
        Double d = ui10Var.c;
        if (d == null) {
            jf4.k(null);
            return null;
        }
        double dDoubleValue = d.doubleValue();
        wh10 wh10Var = ui10Var.d;
        if (wh10Var != null) {
            return new ri10(jIntValue, vi10Var, jCurrentTimeMillis, dDoubleValue, g1x.B(wh10Var));
        }
        jf4.k(null);
        return null;
    }

    public static final tna0 Q(ooa ooaVar) {
        sna0 sna0Var;
        rna0 rna0Var;
        if (ooaVar == null) {
            return new tna0(sna0.e, rna0.UNKNOWN);
        }
        Integer num = ooaVar.f25586a;
        int iIntValue = num != null ? num.intValue() : -1;
        if (iIntValue == 0) {
            sna0Var = sna0.f32484a;
        } else if (iIntValue == 1) {
            sna0Var = sna0.b;
        } else if (iIntValue != 2) {
            sna0Var = iIntValue != 3 ? sna0.e : sna0.d;
        } else {
            sna0Var = sna0.c;
        }
        Integer num2 = ooaVar.b;
        switch (num2 != null ? num2.intValue() : -1) {
            case 2:
                rna0Var = rna0.TWO;
                break;
            case 3:
                rna0Var = rna0.THREE;
                break;
            case 4:
                rna0Var = rna0.FOUR;
                break;
            case 5:
                rna0Var = rna0.FIVE;
                break;
            case 6:
                rna0Var = rna0.SIX;
                break;
            case 7:
                rna0Var = rna0.SEVEN;
                break;
            case 8:
                rna0Var = rna0.EIGHT;
                break;
            case 9:
                rna0Var = rna0.NINE;
                break;
            case 10:
                rna0Var = rna0.TEN;
                break;
            case 11:
                rna0Var = rna0.JACK;
                break;
            case 12:
                rna0Var = rna0.QUEEN;
                break;
            case 13:
                rna0Var = rna0.KING;
                break;
            case 14:
                rna0Var = rna0.ACE;
                break;
            case 15:
                rna0Var = rna0.JOKER;
                break;
            default:
                rna0Var = rna0.UNKNOWN;
                break;
        }
        return new tna0(sna0Var, rna0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v3, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.util.ArrayList] */
    public static final oxd0 R(List list) {
        ?? arrayList;
        List list2;
        List list3;
        list.getClass();
        txd0 txd0Var = (txd0) CollectionsKt.firstOrNull(list);
        txd0 txd0Var2 = (txd0) CollectionsKt.W(1, list);
        List list4 = null;
        String str = txd0Var != null ? txd0Var.c : null;
        String str2 = str == null ? "" : str;
        String strE = lmc.E(txd0Var != null ? txd0Var.e : null);
        int i = 0;
        if (txd0Var == null || (list3 = txd0Var.f) == null) {
            arrayList = 0;
        } else {
            arrayList = new ArrayList(r3d.q(list3, 10));
            int i2 = 0;
            for (Object obj : list3) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    q3d.p();
                    throw null;
                }
                arrayList.add(S((wxd0) obj, i2, 0));
                i2 = i3;
            }
        }
        if (arrayList == 0) {
            arrayList = iun.f15405a;
        }
        String str3 = txd0Var2 != null ? txd0Var2.c : null;
        String str4 = str3 == null ? "" : str3;
        String strE2 = lmc.E(txd0Var2 != null ? txd0Var2.e : null);
        if (txd0Var2 != null && (list2 = txd0Var2.f) != null) {
            ArrayList arrayList2 = new ArrayList(r3d.q(list2, 10));
            for (Object obj2 : list2) {
                int i4 = i + 1;
                if (i < 0) {
                    q3d.p();
                    throw null;
                }
                arrayList2.add(S((wxd0) obj2, i, 1));
                i = i4;
            }
            list4 = arrayList2;
        }
        if (list4 == null) {
            list4 = iun.f15405a;
        }
        return new oxd0(str2, strE, arrayList, str4, strE2, list4);
    }

    public static final pxd0 S(wxd0 wxd0Var, int i, int i2) {
        qxd0 qxd0Var;
        String str = wxd0Var.b + i + i2;
        String str2 = wxd0Var.b;
        String str3 = str2 == null ? "" : str2;
        String str4 = wxd0Var.c;
        String str5 = str4 == null ? "" : str4;
        String strE = lmc.E(wxd0Var.d);
        zxd0 zxd0Var = wxd0Var.g;
        if (zxd0Var != null) {
            qxd0Var = new qxd0(zxd0Var.f45152a, zxd0Var.b, zxd0Var.c, zxd0Var.d, zxd0Var.e);
        } else {
            qxd0Var = new qxd0(null, null, null, null, null);
        }
        return new pxd0(str, str3, str5, strE, qxd0Var);
    }

    public static final rue0 T(glt gltVar, uue0 uue0Var, int i) {
        gltVar.getClass();
        int i2 = gltVar.f11511a;
        return new rue0(i2, gltVar.b, i == i2, uue0Var, false, 240);
    }

    public static final String U(uf50 uf50Var, ctf0 ctf0Var) {
        uf50Var.getClass();
        ctf0Var.getClass();
        return ctf0Var.b.a(R.string.vs, Arrays.copyOf(new Object[0], 0));
    }

    public static final j83 V(uf50 uf50Var, bj50 bj50Var) {
        uf50Var.getClass();
        bj50 bj50VarV = q0x.V(uf50Var);
        dpi0 dpi0Var = new dpi0((byte) 15);
        zi50 zi50VarF = pzw.F(bj50VarV, bj50Var);
        zi50 zi50VarG = pzw.G(bj50VarV, bj50Var);
        Long l = bj50VarV.d;
        long jLongValue = l != null ? l.longValue() : 0L;
        Long l2 = bj50VarV.e;
        long jLongValue2 = l2 != null ? l2.longValue() : 0L;
        u(dpi0Var, String.valueOf(jLongValue), M(zi50VarF));
        pz40 pz40Var = s6t0.f31722a;
        u(dpi0Var, " : ", StaticColors.INSTANCE.m123getWhite0d7_KjU());
        u(dpi0Var, String.valueOf(jLongValue2), M(zi50VarG));
        return ((h83) dpi0Var.f6468a).h();
    }

    public static final void a(s820 s820Var, boolean z, qn8 qn8Var, Function0 function0, Function0 function1, fet fetVar, int i) {
        boolean z2;
        fet fetVar2 = fetVar;
        fetVar2.g0(1016925550);
        int i2 = i | (fetVar2.g(s820Var) ? 32 : 16) | (fetVar2.h(z) ? 256 : 128) | (fetVar2.g(qn8Var) ? 2048 : 1024) | (fetVar2.i(function0) ? 16384 : 8192) | (fetVar2.i(function1) ? 131072 : 65536);
        if (fetVar2.U(i2 & 1, (74897 & i2) != 74896)) {
            if (s820Var != null) {
                boolean z3 = s820Var instanceof m820;
                if (z3) {
                    fetVar2.e0(-1469947061);
                    ckb.i(null, vul.f38053a, qn8Var.f29019a, 0L, function0, fetVar2, (i2 & 57344) | 48, 9);
                    fetVar2.r(false);
                    z2 = z3;
                } else if (s820Var instanceof p820) {
                    fetVar2.e0(-1469619360);
                    if (qn8Var.b != null) {
                        fetVar2.e0(-1469556740);
                        z2 = z3;
                        gkb.i(null, vul.f38053a, qn8Var.b, qn8Var.f29019a, 0L, function1, function0, fetVar2, ((i2 << 6) & 3670016) | (458752 & i2) | 48, 17);
                        fetVar2 = fetVar2;
                        fetVar2.r(false);
                    } else {
                        z2 = z3;
                        fetVar2.e0(-1469118989);
                        ckb.i(null, vul.f38053a, qn8Var.f29019a, 0L, function0, fetVar2, (i2 & 57344) | 48, 9);
                        fetVar2.r(false);
                    }
                    fetVar2.r(false);
                }
                if (z && z2) {
                    fetVar2.e0(-1468746958);
                    zcl zclVar = qmk.f28987a;
                    wvb.o(null, 16.0f, 0L, fetVar, 0, 5);
                    fetVar2 = fetVar;
                    fetVar2.r(false);
                } else {
                    fetVar2.e0(-1468675565);
                    zcl zclVar2 = qmk.f28987a;
                    wvb.o(null, 8.0f, 0L, fetVar, 0, 5);
                    fetVar2 = fetVar;
                    fetVar2.r(false);
                }
            }
            throw b1j.f(-1987081500, fetVar2, false);
        }
        fetVar2.X();
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ip0(s820Var, z, qn8Var, function0, function1, i);
        }
    }

    public static final void b(mm40 mm40Var, gh00 gh00Var, Function1 function1, fet fetVar, int i) {
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        fetVar2.g0(252506011);
        int i2 = i | 6 | (fetVar2.g(gh00Var) ? 32 : 16) | (fetVar2.i(function1) ? 256 : 128);
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            float f = 1.0f - gh00Var.h;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarN = epv0.N(jm40Var, f);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarN);
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
            wul wulVar = gh00Var.i;
            if (wulVar == null) {
                fetVar2.e0(-2015291613);
                fetVar2.r(false);
            } else {
                fetVar2.e0(-2015291612);
                mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                zcl zclVar = qmk.f28987a;
                mm40 mm40VarK = s5x0.K(mm40VarD, 16.0f, 8.0f);
                boolean z = (i2 & 896) == 256;
                Object objP = fetVar2.P();
                if (z || objP == ukd.f35823a) {
                    objP = new dg00(function1, (byte) 9);
                    fetVar2.o0(objP);
                }
                qzb.n(mm40VarK, wulVar, (Function0) objP, fetVar2, 0, 0);
                fetVar2.r(false);
            }
            zcl zclVar2 = qmk.f28987a;
            wvb.o(null, 16.0f, 0L, fetVar, 0, 5);
            fetVar2 = fetVar;
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new fh00(mm40Var2, gh00Var, function1, i, (byte) 1);
        }
    }

    public static final void c(mm40 mm40Var, m820 m820Var, fet fetVar, int i) {
        fet fetVar2;
        fetVar.g0(490830994);
        int i2 = (fetVar.g(m820Var) ? 32 : 16) | i;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
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
            d(null, m820Var.f21350a, fetVar, 0);
            i680 i680Var = m820Var.f21350a.e;
            if (i680Var == null) {
                fetVar.e0(1509987367);
                fetVar.r(false);
                fetVar2 = fetVar;
            } else {
                fetVar.e0(1509987368);
                zcl zclVar = qmk.f28987a;
                tfx.i(s5x0.L(jm40.b, 16.0f, 0.0f, 2), i680Var, fetVar, 0);
                fetVar2 = fetVar;
                wvb.o(null, 4.0f, 0L, fetVar2, 0, 5);
                fetVar2.r(false);
            }
            fetVar2.r(true);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new r7y(mm40Var, m820Var, i, (byte) 22);
        }
    }

    public static final void d(mm40 mm40Var, cye cyeVar, fet fetVar, int i) {
        fetVar.g0(-274083196);
        int i2 = i | 6 | (fetVar.g(cyeVar) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            obb.i(cyeVar, null, fetVar, i2 & 126);
            mm40Var = jm40.b;
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new r7y(mm40Var, cyeVar, i, (byte) 20);
        }
    }

    public static final void e(mm40 mm40Var, gh00 gh00Var, Function1 function1, Function1 function2, fet fetVar, int i) {
        int i2;
        long background;
        boolean z;
        fet fetVar2 = fetVar;
        gh00Var.getClass();
        s820 s820Var = gh00Var.f11275a;
        function1.getClass();
        function2.getClass();
        fetVar2.g0(-720545369);
        if ((i & 6) == 0) {
            i2 = (fetVar2.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(gh00Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.i(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar2.i(function2) ? 2048 : 1024;
        }
        if (fetVar2.U(i2 & 1, (i2 & 1171) != 1170)) {
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = androidx.compose.runtime.e.b(0);
                fetVar2.o0(objP);
            }
            cgk0 cgk0Var = (cgk0) objP;
            Object objP2 = fetVar2.P();
            if (objP2 == cl5Var) {
                objP2 = androidx.compose.runtime.e.b(0);
                fetVar2.o0(objP2);
            }
            cgk0 cgk0Var2 = (cgk0) objP2;
            Object objP3 = fetVar2.P();
            if (objP3 == cl5Var) {
                objP3 = androidx.compose.runtime.e.b(0);
                fetVar2.o0(objP3);
            }
            cgk0 cgk0Var3 = (cgk0) objP3;
            Object objP4 = fetVar2.P();
            if (objP4 == cl5Var) {
                objP4 = androidx.compose.runtime.e.b(0);
                fetVar2.o0(objP4);
            }
            cgk0 cgk0Var4 = (cgk0) objP4;
            Object objP5 = fetVar2.P();
            if (objP5 == cl5Var) {
                objP5 = jgk0.b(new mr0(cgk0Var, cgk0Var2, cgk0Var4, cgk0Var3, (byte) 18));
                fetVar2.o0(objP5);
            }
            l7m0 l7m0Var = (l7m0) objP5;
            if (s820Var instanceof m820) {
                fetVar2.e0(480118017);
                background = afn0.m(fetVar2).getBackgroundGroupSecondary();
                fetVar2.r(false);
            } else {
                fetVar2.e0(480181071);
                background = afn0.m(fetVar2).getBackground();
                fetVar2.r(false);
            }
            long j = background;
            Integer numValueOf = Integer.valueOf(((Number) l7m0Var.getValue()).intValue());
            boolean z2 = (i2 & 7168) == 2048;
            Object objP6 = fetVar2.P();
            yje yjeVar = null;
            if (z2 || objP6 == cl5Var) {
                objP6 = new gll((byte) 1, yjeVar, l7m0Var, function2);
                fetVar2.o0(objP6);
            }
            m0x0.t(fetVar2, numValueOf, (Function2) objP6);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarQ = i120.Q(mm40Var, j, vgg0.c(16.0f, 16.0f, 0.0f, 0.0f, 12));
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
            if (s820Var != null) {
                boolean z3 = s820Var instanceof m820;
                jm40 jm40Var = jm40.b;
                if (z3) {
                    fetVar2.e0(-126912394);
                    Object objP7 = fetVar2.P();
                    if (objP7 == cl5Var) {
                        objP7 = new nw6(cgk0Var, (byte) 27);
                        fetVar2.o0(objP7);
                    }
                    c(ro4.d0(jm40Var, (Function1) objP7), (m820) s820Var, fetVar2, 6);
                    fetVar2.r(false);
                } else {
                    z = false;
                    if (s820Var instanceof p820) {
                        fetVar2.e0(-126595791);
                        o(null, (p820) s820Var, function1, fetVar2, i2 & 896);
                        fetVar2.r(false);
                    }
                }
                lnd0 lnd0Var = gh00Var.k;
                boolean z4 = lnd0Var != null && lnd0Var.c && gh00Var.g == null;
                z1x.d(null, z4, u1c.M(2055462478, new eyn(gh00Var, function1, cgk0Var2, (byte) 17), fetVar2), fetVar2, 384, 1);
                if (z4) {
                    fetVar2.e0(-124466649);
                    wvb.o(null, 4.0f, afn0.m(fetVar2).getBackground(), fetVar2, 0, 1);
                    fetVar2 = fetVar2;
                    z1x.d(i120.Q(epv0.N(jm40Var, gh00Var.h), afn0.m(fetVar2).getBackground(), jd8.n), false, u1c.M(-1527690775, new ngz(gh00Var, function1, (byte) 4), fetVar2), fetVar2, 432, 0);
                    fetVar2.r(false);
                } else {
                    fetVar2.e0(-123361499);
                    fetVar2.r(false);
                }
                fetVar2.r(true);
            } else {
                z = false;
            }
            throw b1j.f(272997981, fetVar2, z);
        }
        fetVar2.X();
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new vho((byte) 11, i, (Object) mm40Var, (Object) gh00Var, (Object) function1, (Object) function2);
        }
    }

    public static final void f(yw00 yw00Var, Function1 function1, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        fetVar2.g0(1864893564);
        int i2 = (fetVar2.g(yw00Var) ? 4 : 2) | i | (fetVar2.i(function1) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, jm40.b);
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
            wvb.o(null, 12.0f, 0L, fetVar2, 0, 5);
            g9x g9xVar = yw00Var.f43347a;
            wul wulVar = yw00Var.c;
            String str = g9xVar != null ? g9xVar.f10937a : null;
            if (str == null) {
                fetVar2.e0(-1486862615);
                fetVar2.r(false);
            } else {
                fetVar2.e0(-1486862614);
                e9x.a(0, fetVar2, null, str);
                wvb.o(null, 8.0f, 0L, fetVar2, 0, 5);
                fetVar2.r(false);
            }
            wul wulVar2 = yw00Var.b;
            cl5 cl5Var = ukd.f35823a;
            if (wulVar2 != null) {
                fetVar2.e0(-1486671902);
                vul vulVar = vul.b;
                wul wulVar3 = yw00Var.b;
                int i3 = i2 & 112;
                boolean z = i3 == 32;
                Object objP = fetVar2.P();
                if (z || objP == cl5Var) {
                    objP = new dg00(function1, (byte) 10);
                    fetVar2.o0(objP);
                }
                Function0 function0 = (Function0) objP;
                boolean z2 = i3 == 32;
                Object objP2 = fetVar2.P();
                if (z2 || objP2 == cl5Var) {
                    objP2 = new dg00(function1, (byte) 11);
                    fetVar2.o0(objP2);
                }
                gkb.i(null, vulVar, wulVar3, wulVar, 0L, function0, (Function0) objP2, fetVar, 48, 17);
                fetVar2 = fetVar;
                wvb.o(null, 8.0f, 0L, fetVar2, 0, 5);
                fetVar2.r(false);
            } else {
                fetVar2.e0(-1486180459);
                vul vulVar2 = vul.b;
                boolean z3 = (i2 & 112) == 32;
                Object objP3 = fetVar2.P();
                if (z3 || objP3 == cl5Var) {
                    objP3 = new dg00(function1, (byte) 12);
                    fetVar2.o0(objP3);
                }
                ckb.i(null, vulVar2, wulVar, 0L, (Function0) objP3, fetVar, 48, 9);
                fetVar2 = fetVar;
                wvb.o(null, 16.0f, 0L, fetVar2, 0, 5);
                fetVar2.r(false);
            }
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new r7y(yw00Var, function1, i, (byte) 21);
        }
    }

    /* JADX WARN: Code duplicated, block: B:69:0x014a  */
    /* JADX WARN: Code duplicated, block: B:70:0x014c  */
    /* JADX WARN: Code duplicated, block: B:74:0x0155  */
    public static final void g(mm40 mm40Var, gh00 gh00Var, Function1 function1, fet fetVar, int i) {
        cl5 cl5Var;
        boolean z;
        Object objP;
        fet fetVar2 = fetVar;
        fetVar2.g0(-318751975);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(gh00Var) ? 32 : 16) | (fetVar2.i(function1) ? 256 : 128);
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
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
            zcl zclVar = qmk.f28987a;
            wvb.o(null, 12.0f, 0L, fetVar2, 0, 5);
            pz40 pz40VarF = androidx.compose.runtime.e.f(gh00Var.c.f7706a, fetVar2);
            pz40 pz40VarF2 = androidx.compose.runtime.e.f(gh00Var.c.b, fetVar2);
            int i3 = i2 & 896;
            boolean z2 = i3 == 256;
            Object objP2 = fetVar2.P();
            cl5 cl5Var2 = ukd.f35823a;
            if (z2 || objP2 == cl5Var2) {
                objP2 = new dg00(function1, (byte) 5);
                fetVar2.o0(objP2);
            }
            Function0 function0 = (Function0) objP2;
            boolean z3 = i3 == 256;
            Object objP3 = fetVar2.P();
            if (z3 || objP3 == cl5Var2) {
                objP3 = new dg00(function1, (byte) 6);
                fetVar2.o0(objP3);
            }
            Function0 function2 = (Function0) objP3;
            boolean z4 = i3 == 256;
            Object objP4 = fetVar2.P();
            if (z4 || objP4 == cl5Var2) {
                objP4 = new dg00(function1, (byte) 7);
                fetVar2.o0(objP4);
            }
            ohq0.k(null, pz40VarF, pz40VarF2, function0, function2, (Function0) objP4, fetVar, 0);
            wvb.o(null, 8.0f, 0L, fetVar, 0, 5);
            int i4 = i2 & 112;
            m(null, gh00Var, function1, fetVar, i2 & 1008);
            s820 s820Var = gh00Var.f11275a;
            qn8 qn8Var = gh00Var.j;
            lnd0 lnd0Var = gh00Var.k;
            boolean z5 = lnd0Var != null && (lnd0Var.c ^ true);
            boolean z6 = (i4 == 32) | (i3 == 256);
            Object objP5 = fetVar.P();
            if (z6) {
                cl5Var = cl5Var2;
            } else {
                cl5Var = cl5Var2;
                if (objP5 == cl5Var) {
                }
                Function0 function3 = (Function0) objP5;
                if (i3 == 256) {
                    z = true;
                } else {
                    z = false;
                }
                objP = fetVar.P();
                if (z || objP == cl5Var) {
                    objP = new dg00(function1, (byte) 8);
                    fetVar.o0(objP);
                }
                a(s820Var, z5, qn8Var, function3, (Function0) objP, fetVar, 6);
                fetVar2 = fetVar;
                fetVar2.r(true);
            }
            objP5 = new mbz(gh00Var, function1, (byte) 10);
            fetVar.o0(objP5);
            Function0 function4 = (Function0) objP5;
            if (i3 == 256) {
                z = true;
            } else {
                z = false;
            }
            objP = fetVar.P();
            if (z) {
                objP = new dg00(function1, (byte) 8);
                fetVar.o0(objP);
            } else {
                objP = new dg00(function1, (byte) 8);
                fetVar.o0(objP);
            }
            a(s820Var, z5, qn8Var, function4, (Function0) objP, fetVar, 6);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new fh00(mm40Var, gh00Var, function1, i, (byte) 0);
        }
    }

    public static final void h(mm40 mm40Var, uv20 uv20Var, xdr xdrVar, xdr xdrVar2, Function1 function1, fet fetVar, int i) {
        mm40 mm40Var2;
        xdrVar.getClass();
        xdrVar2.getClass();
        function1.getClass();
        fetVar.g0(-1336293448);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? fetVar.g(uv20Var) : fetVar.i(uv20Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(xdrVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(xdrVar2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.i(function1) ? 16384 : 8192;
        }
        boolean z = false;
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarQ = i120.Q(o7k0.d(jm40Var, 1.0f), ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), jd8.n);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(mm40VarQ, 0.0f, 8.0f, 1);
            boolean z2 = (i2 & 896) == 256;
            int i3 = i2 & 112;
            if (i3 == 32 || ((i2 & 64) != 0 && fetVar.i(uv20Var))) {
                z = true;
            }
            boolean z3 = z2 | z;
            Object objP = fetVar.P();
            if (z3 || objP == ukd.f35823a) {
                objP = new eu20((byte) 8, xdrVar, uv20Var);
                fetVar.o0(objP);
            }
            byte b = 4;
            x0x.i(mm40VarL, uv20Var, (Function0) objP, u1c.M(1001036366, new fu20(uv20Var, b), fetVar), u1c.M(-1467761810, new gu20(uv20Var, (byte) 12), fetVar), u1c.M(452019139, new hu20(uv20Var, function1, b), fetVar), u1c.M(891283628, new iu20(b, xdrVar2, uv20Var), fetVar), u1c.M(-76677301, new gu20(uv20Var, (byte) 13), fetVar), u1c.M(-1044638230, new gu20(uv20Var, (byte) 14), fetVar), fetVar, 115043392 | i3);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ju20(mm40Var2, uv20Var, xdrVar, xdrVar2, function1, i, (byte) 4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r9v1, types: [a.fet] */
    /* JADX WARN: Type inference failed for: r9v11, types: [a.fet] */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v2, types: [a.fet] */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v3, types: [a.fet] */
    /* JADX WARN: Type inference failed for: r9v4, types: [a.fet] */
    /* JADX WARN: Type inference failed for: r9v5, types: [a.fet] */
    public static final void i(mm40 mm40Var, szy szyVar, fet fetVar, int i) {
        ?? r9;
        shd shdVar;
        shd shdVar2;
        jm40 jm40Var;
        pge pgeVar;
        shd shdVar3;
        shd shdVar4;
        pcy pcyVar;
        mw3 mw3Var;
        xx7 xx7Var;
        boolean z;
        int i2;
        ?? r10;
        shd shdVar5;
        pcy pcyVar2;
        mw3 mw3Var2;
        xx7 xx7Var2;
        shd shdVar6;
        ?? r11;
        ?? r1;
        jm40 jm40Var2;
        mw3 mw3Var3;
        xx7 xx7Var3;
        shd shdVar7;
        shd shdVar8;
        shd shdVar9;
        pcy pcyVar3;
        shd shdVar10;
        float f;
        ?? r12;
        boolean z2;
        ?? r13;
        pcy pcyVar4;
        pcy pcyVar5;
        fet fetVar2 = fetVar;
        String str = szyVar.j;
        pge pgeVar2 = gqw0.f1;
        mw3 mw3Var4 = uc9.c;
        xx7 xx7Var4 = gqw0.n;
        fetVar2.g0(653944188);
        int i3 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(szyVar) ? 32 : 16);
        if (fetVar2.U(i3 & 1, (i3 & 19) != 18)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            thg0 thg0VarA = shg0.a(uc9.e, gqw0.j, fetVar2, 6);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarD);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z3 = fetVar2.S;
            pcy pcyVar6 = e7z.u1;
            if (z3) {
                fetVar2.l(pcyVar6);
            } else {
                fetVar2.r0();
            }
            shd shdVar11 = gqw0.x;
            jpm0.o(fetVar2, thg0VarA, shdVar11);
            shd shdVar12 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar12);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar13 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar13);
            jpm0.n(fetVar2);
            shd shdVar14 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar14);
            int length = szyVar.c.length();
            jm40 jm40Var3 = jm40.b;
            if (length > 0) {
                fetVar2.e0(2091276575);
                zcl zclVar = qmk.f28987a;
                mm40 mm40VarL = s5x0.L(jm40Var3, 8.0f, 0.0f, 2);
                x5d x5dVarA = w5d.a(mw3Var4, xx7Var4, fetVar2, 48);
                int iHashCode2 = Long.hashCode(fetVar2.T);
                bh90 bh90VarM2 = fetVar2.m();
                mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarL);
                fetVar2.i0();
                if (fetVar2.S) {
                    fetVar2.l(pcyVar6);
                } else {
                    fetVar2.r0();
                }
                jpm0.o(fetVar2, x5dVarA, shdVar11);
                jpm0.o(fetVar2, bh90VarM2, shdVar12);
                vqd.u(iHashCode2, fetVar2, shdVar13, fetVar2);
                jpm0.o(fetVar2, mm40VarC1, shdVar14);
                pcyVar = pcyVar6;
                shdVar = shdVar12;
                shdVar2 = shdVar14;
                shdVar3 = shdVar13;
                j0x.b(a8k0.F(R.drawable.ic_red_card, 0, fetVar2), null, o7k0.n(jm40Var3, 16.0f), null, pgeVar2, 0.0f, null, fetVar2, 24632, 104);
                pgeVar = pgeVar2;
                mm40 mm40VarN = s5x0.N(jm40Var3, 0.0f, 4.0f, 0.0f, 0.0f, 13);
                String str2 = szyVar.c;
                pz40 pz40Var = s6t0.f31722a;
                mw3Var = mw3Var4;
                xx7Var = xx7Var4;
                shdVar4 = shdVar11;
                jm40Var = jm40Var3;
                v8q0.a(str2, mm40VarN, s6t0.b().f33626a.getSecondary(), null, g1t0.n().f42262a.b, null, null, g1t0.n().f42262a.f, 0L, new f2q0(3), 0L, 0, false, 0, 0, null, null, fetVar, 0, 0, 260968);
                fet fetVar3 = fetVar;
                z = true;
                fetVar3.r(true);
                i2 = 0;
                fetVar3.r(false);
                r10 = fetVar3;
            } else {
                shdVar = shdVar12;
                shdVar2 = shdVar14;
                jm40Var = jm40Var3;
                pgeVar = pgeVar2;
                shdVar3 = shdVar13;
                shdVar4 = shdVar11;
                pcyVar = pcyVar6;
                mw3Var = mw3Var4;
                xx7Var = xx7Var4;
                z = true;
                i2 = 0;
                fetVar2.e0(2092117450);
                fetVar2.r(false);
                r10 = fetVar2;
            }
            if (szyVar.k.length() > 0) {
                r10.e0(2092188409);
                zcl zclVar2 = qmk.f28987a;
                mm40 mm40VarL2 = s5x0.L(jm40Var, 8.0f, 0.0f, 2);
                mw3 mw3Var5 = mw3Var;
                xx7 xx7Var5 = xx7Var;
                x5d x5dVarA2 = w5d.a(mw3Var5, xx7Var5, r10, 48);
                int iHashCode3 = Long.hashCode(r10.T);
                bh90 bh90VarM3 = r10.m();
                mm40 mm40VarC2 = kbc.c0(r10, mm40VarL2);
                r10.i0();
                if (r10.S) {
                    pcyVar5 = pcyVar;
                    r10.l(pcyVar5);
                } else {
                    pcyVar5 = pcyVar;
                    r10.r0();
                }
                shd shdVar15 = shdVar4;
                jpm0.o(r10, x5dVarA2, shdVar15);
                jpm0.o(r10, bh90VarM3, shdVar);
                shd shdVar16 = shdVar3;
                vqd.u(iHashCode3, r10, shdVar16, r10);
                jpm0.o(r10, mm40VarC2, shdVar2);
                pcyVar2 = pcyVar5;
                shdVar5 = shdVar16;
                mw3Var2 = mw3Var5;
                xx7Var2 = xx7Var5;
                j0x.b(a8k0.F(R.drawable.ic_yellow_card, i2, r10), null, o7k0.n(jm40Var, 16.0f), null, pgeVar, 0.0f, null, r10, 24632, 104);
                mm40 mm40VarN2 = s5x0.N(jm40Var, 0.0f, 4.0f, 0.0f, 0.0f, 13);
                String str3 = szyVar.k;
                pz40 pz40Var2 = s6t0.f31722a;
                ?? r2 = i2;
                shdVar6 = shdVar15;
                v8q0.a(str3, mm40VarN2, s6t0.b().f33626a.getSecondary(), null, g1t0.n().f42262a.b, null, null, g1t0.n().f42262a.f, 0L, new f2q0(3), 0L, 0, false, 0, 0, null, null, fetVar, 0, 0, 260968);
                ?? r14 = fetVar;
                r14.r(true);
                r14.r(r2);
                r1 = r2;
                r11 = r14;
            } else {
                ?? r3 = i2;
                shdVar5 = shdVar3;
                pcyVar2 = pcyVar;
                mw3Var2 = mw3Var;
                xx7Var2 = xx7Var;
                shdVar6 = shdVar4;
                r10.e0(2093035050);
                r10.r(r3);
                r1 = r3;
                r11 = r10;
            }
            if (szyVar.b.length() > 0) {
                r11.e0(2093099251);
                zcl zclVar3 = qmk.f28987a;
                jm40 jm40Var4 = jm40Var;
                mm40 mm40VarL3 = s5x0.L(jm40Var4, 8.0f, 0.0f, 2);
                mw3 mw3Var6 = mw3Var2;
                xx7 xx7Var6 = xx7Var2;
                x5d x5dVarA3 = w5d.a(mw3Var6, xx7Var6, r11, 48);
                int iHashCode4 = Long.hashCode(r11.T);
                bh90 bh90VarM4 = r11.m();
                mm40 mm40VarC3 = kbc.c0(r11, mm40VarL3);
                r11.i0();
                if (r11.S) {
                    pcyVar4 = pcyVar2;
                    r11.l(pcyVar4);
                } else {
                    pcyVar4 = pcyVar2;
                    r11.r0();
                }
                shd shdVar17 = shdVar6;
                jpm0.o(r11, x5dVarA3, shdVar17);
                shd shdVar18 = shdVar;
                jpm0.o(r11, bh90VarM4, shdVar18);
                shd shdVar19 = shdVar5;
                vqd.u(iHashCode4, r11, shdVar19, r11);
                shd shdVar20 = shdVar2;
                jpm0.o(r11, mm40VarC3, shdVar20);
                mw3Var3 = mw3Var6;
                pcyVar3 = pcyVar4;
                shdVar8 = shdVar19;
                shdVar7 = shdVar18;
                shdVar9 = shdVar20;
                xx7Var3 = xx7Var6;
                j0x.b(a8k0.F(szyVar.m, r1, r11), null, o7k0.n(jm40Var4, 16.0f), null, pgeVar, 0.0f, null, r11, 24632, 104);
                mm40 mm40VarN3 = s5x0.N(jm40Var4, 0.0f, 4.0f, 0.0f, 0.0f, 13);
                String str4 = szyVar.b;
                pz40 pz40Var3 = s6t0.f31722a;
                shdVar10 = shdVar17;
                jm40Var2 = jm40Var4;
                f = 8.0f;
                v8q0.a(str4, mm40VarN3, s6t0.b().f33626a.getSecondary(), null, g1t0.n().f42262a.b, null, null, g1t0.n().f42262a.f, 0L, new f2q0(3), 0L, 0, false, 0, 0, null, null, fetVar, 0, 0, 260968);
                fet fetVar4 = fetVar;
                fetVar4.r(true);
                fetVar4.r(false);
                r12 = fetVar4;
            } else {
                ?? r15 = r1;
                jm40Var2 = jm40Var;
                mw3Var3 = mw3Var2;
                xx7Var3 = xx7Var2;
                shdVar7 = shdVar;
                shdVar8 = shdVar5;
                shdVar9 = shdVar2;
                pcyVar3 = pcyVar2;
                shdVar10 = shdVar6;
                f = 8.0f;
                r11.e0(2093920906);
                r11.r(r15);
                r12 = r11;
            }
            if (r22.length() > 0) {
                r12.e0(2093984611);
                zcl zclVar4 = qmk.f28987a;
                mm40 mm40VarL4 = s5x0.L(jm40Var2, f, 0.0f, 2);
                x5d x5dVarA4 = w5d.a(mw3Var3, xx7Var3, r12, 48);
                int iHashCode5 = Long.hashCode(r12.T);
                bh90 bh90VarM5 = r12.m();
                mm40 mm40VarC4 = kbc.c0(r12, mm40VarL4);
                r12.i0();
                if (r12.S) {
                    r12.l(pcyVar3);
                } else {
                    r12.r0();
                }
                jpm0.o(r12, x5dVarA4, shdVar10);
                jpm0.o(r12, bh90VarM5, shdVar7);
                vqd.u(iHashCode5, r12, shdVar8, r12);
                jpm0.o(r12, mm40VarC4, shdVar9);
                j0x.b(a8k0.F(R.drawable.ic_results_history, 0, r12), null, o7k0.n(jm40Var2, 16.0f), null, pgeVar, 0.0f, null, r12, 24632, 104);
                mm40 mm40VarN4 = s5x0.N(jm40Var2, 0.0f, 4.0f, 0.0f, 0.0f, 13);
                pz40 pz40Var4 = s6t0.f31722a;
                v8q0.a(str, mm40VarN4, s6t0.b().f33626a.getSecondary(), null, g1t0.n().f42262a.b, null, null, g1t0.n().f42262a.f, 0L, new f2q0(3), 0L, 0, false, 0, 0, null, null, fetVar, 0, 0, 260968);
                fet fetVar5 = fetVar;
                z2 = true;
                fetVar5.r(true);
                fetVar5.r(false);
                r13 = fetVar5;
            } else {
                z2 = true;
                r12.e0(2094821642);
                r12.r(false);
                r13 = r12;
            }
            r13.r(z2);
            r9 = r13;
        } else {
            fetVar2.X();
            r9 = fetVar2;
        }
        yfe0 yfe0VarU = r9.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xd80(mm40Var, szyVar, i, (byte) 26);
        }
    }

    public static final void j(mm40 mm40Var, ugd ugdVar, ugd ugdVar2, ugd ugdVar3, ugd ugdVar4, fet fetVar, int i) {
        int i2;
        ugd ugdVar5;
        ugd ugdVar6;
        fetVar.g0(-1181833461);
        if ((i & 6) == 0) {
            i2 = i | (fetVar.g(mm40Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        byte b = 1;
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            long backgroundGroup = ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundGroup();
            boolean zF = fetVar.f(backgroundGroup);
            Object objP = fetVar.P();
            if (zF || objP == ukd.f35823a) {
                objP = new dls((byte) 24, backgroundGroup);
                fetVar.o0(objP);
            }
            mm40 mm40VarK = rq8.K(mm40Var, (Function1) objP);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(mm40VarK, 4.0f, 0.0f, 2);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarL);
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
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar, 0);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, jm40.b);
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
            ugdVar.F(zhg0.f44392a, fetVar, 54);
            ugdVar5 = ugdVar3;
            ugdVar6 = ugdVar4;
            obc.d(bmd.n.a(k6z.f17794a), u1c.M(1679265205, new gg30(ugdVar2, ugdVar5, ugdVar6, b), fetVar), fetVar, 56);
            fetVar.r(true);
            fetVar.r(true);
        } else {
            ugdVar5 = ugdVar3;
            ugdVar6 = ugdVar4;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new p00(mm40Var, ugdVar, ugdVar2, ugdVar5, ugdVar6, i, (byte) 2);
        }
    }

    public static final void k(mm40 mm40Var, ia40 ia40Var, Function1 function1, fet fetVar, int i) {
        int i2;
        function1.getClass();
        fetVar.g0(1228547644);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(ia40Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function1) ? 256 : 128;
        }
        byte b = 0;
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            float fB = pkd.b(28.0f, fetVar);
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (objP == obj) {
                objP = new d39();
                fetVar.o0(objP);
            }
            d39 d39Var = (d39) objP;
            Object[] objArr = new Object[0];
            Object objP2 = fetVar.P();
            if (objP2 == obj) {
                objP2 = new o240((byte) 5);
                fetVar.o0(objP2);
            }
            Function2 function2 = (Function2) objP2;
            Object objP3 = fetVar.P();
            if (objP3 == obj) {
                objP3 = new da40(b);
                fetVar.o0(objP3);
            }
            v0h0 v0h0Var = new v0h0((Function1) objP3, function2);
            Object objP4 = fetVar.P();
            if (objP4 == obj) {
                objP4 = new gj30((byte) 26);
                fetVar.o0(objP4);
            }
            uz40 uz40Var = (uz40) e9x.R(objArr, v0h0Var, (Function0) objP4, fetVar, 384);
            boolean zI = fetVar.i(uz40Var) | fetVar.i(d39Var) | fetVar.d(fB);
            Object objP5 = fetVar.P();
            if (zI || objP5 == obj) {
                objP5 = new ep8(uz40Var, d39Var, fB, null);
                fetVar.o0(objP5);
            }
            m0x0.t(fetVar, uz40Var, (Function2) objP5);
            long backgroundContent = ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent();
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarL = s5x0.L(i120.Q(mm40Var, backgroundContent, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), 0.0f, 12.0f, 1);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
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
            y9a.H(null, ia40Var, uz40Var, fetVar, i2 & 112);
            b34.f(uz40Var, null, null, null, null, u1c.M(-621572050, new eyn(ia40Var, d39Var, function1, (byte) 25), fetVar), fetVar, 1572870);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new if00((Object) mm40Var, (Object) ia40Var, (Object) function1, i, (byte) 10);
        }
    }

    public static final void l(int i, int i2, fet fetVar, mm40 mm40Var, Function0 function0) {
        int i3;
        fet fetVar2;
        Function0 function1;
        function0.getClass();
        fetVar.g0(865468411);
        if ((i & 6) == 0) {
            i3 = (fetVar.i(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= fetVar.g(mm40Var) ? 32 : 16;
        }
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            if (i4 != 0) {
                mm40Var = jm40.b;
            }
            String strW = rsm0.w(R.string.tournaments_more, 0, fetVar);
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                wul wulVar = new wul(nul.e, oe9.b, new ue9(strW), true, false, false);
                fetVar.o0(wulVar);
                objP = wulVar;
            }
            fetVar2 = fetVar;
            function1 = function0;
            qzb.n(o7k0.d(mm40Var, 1.0f), (wul) objP, function1, fetVar2, ((i3 << 6) & 896) | 48, 0);
        } else {
            fetVar2 = fetVar;
            function1 = function0;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new vty(i, i2, mm40Var, function1);
        }
    }

    public static final void m(mm40 mm40Var, gh00 gh00Var, Function1 function1, fet fetVar, int i) {
        mm40 mm40Var2;
        kwj kwjVar;
        jm40 jm40Var;
        fet fetVar2 = fetVar;
        fetVar2.g0(1802345735);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(gh00Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.i(function1) ? 256 : 128;
        }
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            jm40 jm40Var2 = jm40.b;
            mm40 mm40VarC0 = kbc.c0(fetVar2, jm40Var2);
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
            uwh0 uwh0Var = gh00Var.b;
            int i3 = uwh0Var.c;
            a4x a4xVar = uwh0Var.f36392a;
            boolean zG = fetVar2.g(uwh0Var);
            Object objP = fetVar2.P();
            byte b = 19;
            cl5 cl5Var = ukd.f35823a;
            if (zG || objP == cl5Var) {
                objP = new rcz(uwh0Var, b);
                fetVar2.o0(objP);
            }
            kwj kwjVarB = zk80.b(i3, (Function0) objP, fetVar2, 0, 2);
            Object objP2 = fetVar2.P();
            if (objP2 == cl5Var) {
                objP2 = m0x0.I(kotlin.coroutines.g.f46065a, fetVar2);
                fetVar2.o0(objP2);
            }
            vne vneVar = (vne) objP2;
            Object objP3 = fetVar2.P();
            if (objP3 == cl5Var) {
                objP3 = m0x0.I(kotlin.coroutines.g.f46065a, fetVar2);
                fetVar2.o0(objP3);
            }
            vne vneVar2 = (vne) objP3;
            rwj rwjVar = tvk.f34603a;
            vs10 vs10Var = ys10.f43147a;
            boolean zG2 = fetVar2.g(kwjVarB) | fetVar2.g(uwh0Var);
            Object objP4 = fetVar2.P();
            if (zG2 || objP4 == cl5Var) {
                objP4 = new juy((Object) kwjVarB, (Object) uwh0Var, (yje) null, (byte) 14);
                fetVar2.o0(objP4);
            }
            sac.V(vneVar2, null, null, vs10Var, (Function2) objP4, 11);
            boolean zE = fetVar2.e(a4xVar.size());
            Object objP5 = fetVar2.P();
            if (zE || objP5 == cl5Var) {
                ArrayList arrayList = new ArrayList(r3d.q(a4xVar, 10));
                Iterator<E> it = a4xVar.iterator();
                while (it.hasNext()) {
                    arrayList.add(((mj80) it.next()).b);
                }
                objP5 = dyb.o0(arrayList);
                fetVar2.o0(objP5);
            }
            a4x a4xVar2 = (a4x) objP5;
            if (a4xVar2.size() > 1) {
                fetVar2.e0(-1175945123);
                dxh0 dxh0Var = gh00Var.b.b;
                boolean zG3 = fetVar2.g(kwjVarB);
                Object objP6 = fetVar2.P();
                if (zG3 || objP6 == cl5Var) {
                    objP6 = new s39(kwjVarB, b);
                    fetVar2.o0(objP6);
                }
                Function0 function0 = (Function0) objP6;
                boolean zI = ((i2 & 896) == 256) | fetVar2.i(vneVar) | fetVar2.g(kwjVarB) | fetVar2.g(uwh0Var);
                Object objP7 = fetVar2.P();
                if (zI || objP7 == cl5Var) {
                    enm enmVar = new enm((Object) vneVar, (Object) function1, (Object) uwh0Var, (Object) kwjVarB, (byte) 18);
                    kwjVar = kwjVarB;
                    fetVar2.o0(enmVar);
                    objP7 = enmVar;
                } else {
                    kwjVar = kwjVarB;
                }
                jm40Var = jm40Var2;
                ntb.n(null, a4xVar2, null, dxh0Var, null, 0L, function0, (Function1) objP7, fetVar2, 0, 53);
                mm40 mm40VarQ = i120.Q(jm40Var, ((ThemeColors) fetVar2.k(zaq0.b)).getBackgroundContent(), jd8.n);
                zcl zclVar = qmk.f28987a;
                wvb.o(mm40VarQ, 10.0f, 0L, fetVar2, 0, 4);
                fetVar2.r(false);
            } else {
                kwjVar = kwjVarB;
                uwh0Var = uwh0Var;
                jm40Var = jm40Var2;
                fetVar2.e0(-1175260891);
                fetVar2.r(false);
            }
            q5x.e(kwjVar, null, null, null, 0, 0.0f, null, null, false, null, null, null, null, u1c.M(391244094, new n82(uwh0Var, gh00Var, function1, (byte) 16), fetVar2), fetVar, 100663296, 24576, 16126);
            fetVar2 = fetVar;
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new if00((Object) mm40Var2, (Object) gh00Var, (Object) function1, i, (byte) 2);
        }
    }

    public static final void n(mm40 mm40Var, szy szyVar, boolean z, Function1 function1, fet fetVar, int i) {
        k6z k6zVar;
        mm40Var.getClass();
        function1.getClass();
        fetVar.g0(1434042567);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(szyVar) ? 32 : 16) | (fetVar.h(z) ? 256 : 128) | (fetVar.i(function1) ? 2048 : 1024);
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            if (z) {
                fetVar.e0(-569586898);
                k6zVar = (k6z) fetVar.k(bmd.n);
                fetVar.r(false);
            } else {
                fetVar.e0(-569585974);
                fetVar.r(false);
                k6zVar = k6z.f17794a;
            }
            obc.d(bmd.n.a(k6zVar), u1c.M(801313799, new o090(mm40Var, function1, szyVar), fetVar), fetVar, 56);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new p2n((byte) 27, i, (Object) mm40Var, (Object) szyVar, (Object) function1, z);
        }
    }

    public static final void o(mm40 mm40Var, p820 p820Var, Function1 function1, fet fetVar, int i) {
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        fetVar2.g0(-1842777385);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(p820Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.i(function1) ? 256 : 128;
        }
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            wy6 wy6Var = p820Var.f26535a;
            int i3 = i2 & 896;
            boolean z = i3 == 256;
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new dg00(function1, (byte) 13);
                fetVar2.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean z2 = i3 == 256;
            Object objP2 = fetVar2.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new dg00(function1, (byte) 2);
                fetVar2.o0(objP2);
            }
            Function0 function2 = (Function0) objP2;
            boolean z3 = i3 == 256;
            Object objP3 = fetVar2.P();
            if (z3 || objP3 == cl5Var) {
                objP3 = new dg00(function1, (byte) 3);
                fetVar2.o0(objP3);
            }
            Function0 function3 = (Function0) objP3;
            boolean z4 = i3 == 256;
            Object objP4 = fetVar2.P();
            if (z4 || objP4 == cl5Var) {
                objP4 = new dg00(function1, (byte) 4);
                fetVar2.o0(objP4);
            }
            p(null, wy6Var, function0, function2, function3, (Function0) objP4, fetVar2, 0);
            fetVar2 = fetVar2;
            zcl zclVar = qmk.f28987a;
            zfn zfnVar = zaq0.b;
            wvb.o(null, 4.0f, ((ThemeColors) fetVar2.k(zfnVar)).getBackground(), fetVar2, 0, 1);
            if (!(wy6Var instanceof ry6)) {
                fetVar2.e0(92081605);
                fetVar2.r(false);
                yfe0 yfe0VarU = fetVar2.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new dlw(p820Var, function1, i);
                    return;
                }
                return;
            }
            fetVar2.e0(91718285);
            i680 i680Var = ((ry6) wy6Var).f;
            jm40 jm40Var = jm40.b;
            if (i680Var == null) {
                fetVar2.e0(91718284);
                fetVar2.r(false);
            } else {
                fetVar2.e0(91718285);
                x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
                int iHashCode = Long.hashCode(fetVar2.T);
                bh90 bh90VarM = fetVar2.m();
                mm40 mm40VarC0 = kbc.c0(fetVar2, jm40Var);
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
                ufx.k(null, i680Var, fetVar2, 0);
                wvb.o(null, 4.0f, ((ThemeColors) fetVar2.k(zfnVar)).getBackground(), fetVar2, 0, 1);
                fetVar2.r(true);
                fetVar2.r(false);
            }
            fetVar2.r(false);
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU2 = fetVar2.u();
        if (yfe0VarU2 != null) {
            yfe0VarU2.d = new if00((Object) mm40Var2, (Object) p820Var, (Object) function1, i, (byte) 1);
        }
    }

    public static final void p(mm40 mm40Var, wy6 wy6Var, Function0 function0, Function0 function1, Function0 function2, Function0 function3, fet fetVar, int i) {
        mm40 mm40Var2;
        fetVar.g0(1566231484);
        int i2 = i | 6 | (fetVar.g(wy6Var) ? 32 : 16) | (fetVar.i(function0) ? 256 : 128) | (fetVar.i(function1) ? 2048 : 1024) | (fetVar.i(function2) ? 16384 : 8192) | (fetVar.i(function3) ? 131072 : 65536);
        if (fetVar.U(i2 & 1, (74899 & i2) != 74898)) {
            ugd ugdVarM = u1c.M(511916779, new hgs0(wy6Var, function0, function1, function2, function3, (byte) 8), fetVar);
            jm40 jm40Var = jm40.b;
            z1x.d(jm40Var, true, ugdVarM, fetVar, 438, 0);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new jy6(mm40Var2, wy6Var, function0, function1, function2, function3, i, (byte) 1);
        }
    }

    public static final void q(int i, fet fetVar) {
        yjj0 yjj0VarC;
        fetVar.g0(-1222554364);
        if (fetVar.U(i & 1, i != 0)) {
            rah0 rah0VarT = wha0.T(fetVar);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarA0 = wha0.a0(s5x0.L(o7k0.d(jm40Var, 1.0f), xfn.a(fetVar).d, 0.0f, 2), rah0VarT, false, 14);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 6);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarA0);
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
            fetVar.e0(915154295);
            int i2 = 0;
            while (i2 < 7) {
                boolean z = i2 == 6;
                boolean z2 = i2 == 0;
                boolean z3 = i2 % 2 == 0;
                long backgroundContent = ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent();
                if (z2) {
                    zcl zclVar = qmk.f28987a;
                    yjj0VarC = vgg0.c(16.0f, 16.0f, 0.0f, 0.0f, 12);
                } else if (z) {
                    zcl zclVar2 = qmk.f28987a;
                    yjj0VarC = vgg0.c(0.0f, 0.0f, 16.0f, 16.0f, 3);
                } else {
                    yjj0VarC = jd8.n;
                }
                jwb.f(0, fetVar, i120.Q(jm40Var, backgroundContent, yjj0VarC), z3);
                i2++;
            }
            fetVar.r(false);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ogj0(i, (byte) 10);
        }
    }

    public static final void r(int i, fet fetVar, String str, Function0 function0, boolean z) {
        str.getClass();
        function0.getClass();
        fetVar.g0(-1978309635);
        int i2 = (fetVar.h(z) ? 4 : 2) | i | (fetVar.g(str) ? 32 : 16) | (fetVar.i(function0) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            long jM62getBlack0d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m62getBlack0d7_KjU();
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarH = k7n0.H(o7k0.e(o050.S(o7k0.d(i120.Q(qcc.F(jm40Var, jM62getBlack0d7_KjU, 8.0f, 8.0f, 0.0f, 0.4f, 88), ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), vgg0.c(8.0f, 8.0f, 0.0f, 0.0f, 12)), 1.0f)), 80.0f), 8.0f);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarH);
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
            o050.g(function0, s5x0.J(o7k0.d(jm40Var, 1.0f), 16.0f), z, vgg0.a(8.0f), ozb.a0(fetVar), null, null, u1c.M(624335731, new h0(str, (byte) 7), fetVar), fetVar, ((i2 >> 6) & 14) | 805306368 | ((i2 << 6) & 896), Response.TEMPORARILY_UNAVAILABLE);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ot8(z, str, function0, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004c  */
    /* JADX WARN: Code duplicated, block: B:24:0x004e  */
    /* JADX WARN: Code duplicated, block: B:27:0x0057  */
    /* JADX WARN: Code duplicated, block: B:29:0x005a  */
    /* JADX WARN: Code duplicated, block: B:32:0x007b  */
    /* JADX WARN: Code duplicated, block: B:33:0x0081  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:45:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:51:0x0103  */
    /* JADX WARN: Code duplicated, block: B:54:0x010d  */
    /* JADX WARN: Code duplicated, block: B:56:? A[RETURN, SYNTHETIC] */
    public static final void s(mm40 mm40Var, l7m0 l7m0Var, xdr xdrVar, fet fetVar, int i, int i2) {
        xdr xdrVar2;
        boolean z;
        xdr xdrVar3;
        yfe0 yfe0VarU;
        boolean z2;
        Object objP;
        cl5 cl5Var;
        Object objP2;
        l7m0Var.getClass();
        fetVar.g0(-1672536002);
        byte b = 4;
        int i3 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(l7m0Var) ? 32 : 16);
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                xdrVar2 = xdrVar;
                i3 |= fetVar.i(xdrVar2) ? 256 : 128;
            }
            if ((i3 & 147) != 146) {
                z = true;
            } else {
                z = false;
            }
            if (fetVar.U(i3 & 1, z)) {
                if (i4 != 0) {
                    xdrVar2 = null;
                }
                tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
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
                if ((i3 & 112) == 32) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                objP = fetVar.P();
                cl5Var = ukd.f35823a;
                if (z2 || objP == cl5Var) {
                    objP = new f7f0(l7m0Var, (byte) 12);
                    fetVar.o0(objP);
                }
                kkb.p(1, fetVar, null, (Function0) objP);
                if (xdrVar2 == null) {
                    fetVar.e0(1282315354);
                    fetVar.r(false);
                } else {
                    fetVar.e0(-374276985);
                    mm40 mm40VarB = jr8.f16991a.b(jm40.b, gqw0.i);
                    objP2 = fetVar.P();
                    if (objP2 == cl5Var) {
                        objP2 = new ejk0(b);
                        fetVar.o0(objP2);
                    }
                    mm40 mm40VarP = ffb0.P(mm40VarB, (Function1) objP2);
                    zcl zclVar = qmk.f28987a;
                    w6x.v((i3 >> 3) & 112, xdrVar2, s5x0.J(mm40VarP, 2.0f), fetVar, false);
                }
                fetVar.r(true);
            } else {
                fetVar.X();
            }
            xdrVar3 = xdrVar2;
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new g3n(mm40Var, l7m0Var, xdrVar3, i, i2, (byte) 2);
            }
        }
        i3 |= 384;
        xdrVar2 = xdrVar;
        if ((i3 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (fetVar.U(i3 & 1, z)) {
            if (i4 != 0) {
                xdrVar2 = null;
            }
            tj30 tj30VarC2 = zq8.c(gqw0.f11754a, false);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40Var);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC2, gqw0.x);
            jpm0.o(fetVar, bh90VarM2, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode2), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC1, gqw0.v);
            if ((i3 & 112) == 32) {
                z2 = true;
            } else {
                z2 = false;
            }
            objP = fetVar.P();
            cl5Var = ukd.f35823a;
            if (z2) {
                objP = new f7f0(l7m0Var, (byte) 12);
                fetVar.o0(objP);
            } else {
                objP = new f7f0(l7m0Var, (byte) 12);
                fetVar.o0(objP);
            }
            kkb.p(1, fetVar, null, (Function0) objP);
            if (xdrVar2 == null) {
                fetVar.e0(1282315354);
                fetVar.r(false);
            } else {
                fetVar.e0(-374276985);
                mm40 mm40VarB2 = jr8.f16991a.b(jm40.b, gqw0.i);
                objP2 = fetVar.P();
                if (objP2 == cl5Var) {
                    objP2 = new ejk0(b);
                    fetVar.o0(objP2);
                }
                mm40 mm40VarP2 = ffb0.P(mm40VarB2, (Function1) objP2);
                zcl zclVar2 = qmk.f28987a;
                w6x.v((i3 >> 3) & 112, xdrVar2, s5x0.J(mm40VarP2, 2.0f), fetVar, false);
            }
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        xdrVar3 = xdrVar2;
        yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new g3n(mm40Var, l7m0Var, xdrVar3, i, i2, (byte) 2);
        }
    }

    public static final void t(mm40 mm40Var, final mvl0 mvl0Var, fet fetVar, int i) {
        fetVar.g0(675590453);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(mvl0Var) ? 32 : 16);
        final byte b = 0;
        final byte b2 = 1;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            z1x.m(mm40Var, null, null, u1c.M(-33229334, new xdr() { // from class: a.lvl0
                @Override // a.xdr
                public final Object F(Object obj, Object obj2, Object obj3) {
                    byte b3 = b;
                    mvl0 mvl0Var2 = mvl0Var;
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
                                zcl zclVar = qmk.f28987a;
                                jm40 jm40Var = jm40.b;
                                mm40 mm40VarA = yhg0Var.a(1.0f, s5x0.N(jm40Var, 0.0f, 0.0f, 12.0f, 0.0f, 11), true);
                                x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
                                int iHashCode = Long.hashCode(fetVar2.T);
                                bh90 bh90VarM = fetVar2.m();
                                mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarA);
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
                                mm40 mm40VarN = s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 4.0f, 7);
                                String str = mvl0Var2.b;
                                pz40 pz40Var = s6t0.f31722a;
                                v8q0.a(str, mm40VarN, s6t0.b().f33626a.getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 3, 0, null, g1t0.k(), fetVar2, 0, 24960, 110584);
                                String str2 = mvl0Var2.c;
                                if (str2 == null) {
                                    fetVar2.e0(1238567392);
                                    fetVar2.r(false);
                                } else {
                                    fetVar2.e0(1238567393);
                                    v8q0.a(str2, null, s6t0.b().f33626a.getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.g(), fetVar2, 0, 24960, 110586);
                                    fetVar2.r(false);
                                }
                                fetVar2.r(true);
                            } else {
                                fetVar2.X();
                            }
                            break;
                        default:
                            fet fetVar3 = (fet) obj2;
                            int iIntValue2 = ((Integer) obj3).intValue();
                            ((yhg0) obj).getClass();
                            if (fetVar3.U(1 & iIntValue2, (iIntValue2 & 17) != 16)) {
                                pm80 pm80VarF = a8k0.F(R.drawable.ic_glyph_stadium, 0, fetVar3);
                                Object objP = fetVar3.P();
                                if (objP == ukd.f35823a) {
                                    objP = ju70.T(pm80VarF, null, new gcl0((byte) 17), 6);
                                    fetVar3.o0(objP);
                                }
                                pm80 pm80Var = (pm80) objP;
                                zcl zclVar2 = qmk.f28987a;
                                k7x.b(mvl0Var2.d, null, o7k0.p(jm40.b, 156.0f, 120.0f), pm80Var, pm80Var, pm80Var, null, null, null, null, null, null, fetVar3, 299056, 0, 32704);
                            } else {
                                fetVar3.X();
                            }
                            break;
                    }
                    return Unit.f46060a;
                }
            }, fetVar), null, u1c.M(-2113813012, new xdr() { // from class: a.lvl0
                @Override // a.xdr
                public final Object F(Object obj, Object obj2, Object obj3) {
                    byte b3 = b2;
                    mvl0 mvl0Var2 = mvl0Var;
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
                                zcl zclVar = qmk.f28987a;
                                jm40 jm40Var = jm40.b;
                                mm40 mm40VarA = yhg0Var.a(1.0f, s5x0.N(jm40Var, 0.0f, 0.0f, 12.0f, 0.0f, 11), true);
                                x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
                                int iHashCode = Long.hashCode(fetVar2.T);
                                bh90 bh90VarM = fetVar2.m();
                                mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarA);
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
                                mm40 mm40VarN = s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 4.0f, 7);
                                String str = mvl0Var2.b;
                                pz40 pz40Var = s6t0.f31722a;
                                v8q0.a(str, mm40VarN, s6t0.b().f33626a.getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 3, 0, null, g1t0.k(), fetVar2, 0, 24960, 110584);
                                String str2 = mvl0Var2.c;
                                if (str2 == null) {
                                    fetVar2.e0(1238567392);
                                    fetVar2.r(false);
                                } else {
                                    fetVar2.e0(1238567393);
                                    v8q0.a(str2, null, s6t0.b().f33626a.getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.g(), fetVar2, 0, 24960, 110586);
                                    fetVar2.r(false);
                                }
                                fetVar2.r(true);
                            } else {
                                fetVar2.X();
                            }
                            break;
                        default:
                            fet fetVar3 = (fet) obj2;
                            int iIntValue2 = ((Integer) obj3).intValue();
                            ((yhg0) obj).getClass();
                            if (fetVar3.U(1 & iIntValue2, (iIntValue2 & 17) != 16)) {
                                pm80 pm80VarF = a8k0.F(R.drawable.ic_glyph_stadium, 0, fetVar3);
                                Object objP = fetVar3.P();
                                if (objP == ukd.f35823a) {
                                    objP = ju70.T(pm80VarF, null, new gcl0((byte) 17), 6);
                                    fetVar3.o0(objP);
                                }
                                pm80 pm80Var = (pm80) objP;
                                zcl zclVar2 = qmk.f28987a;
                                k7x.b(mvl0Var2.d, null, o7k0.p(jm40.b, 156.0f, 120.0f), pm80Var, pm80Var, pm80Var, null, null, null, null, null, null, fetVar3, 299056, 0, 32704);
                            } else {
                                fetVar3.X();
                            }
                            break;
                    }
                    return Unit.f46060a;
                }
            }, fetVar), fetVar, (i2 & 14) | 199680, 22);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new a5k0(mm40Var, mvl0Var, i, (byte) 25);
        }
    }

    public static final void u(dpi0 dpi0Var, String str, long j) {
        if (str.length() == 0) {
            return;
        }
        h83 h83Var = new h83();
        long j2 = y3d.g;
        long j3 = daq0.c;
        smk0 smk0Var = new smk0(j, j3, null, null, null, null, null, j3, new j56(0.0f), null, null, j2, k5q0.b, null, null, 17424);
        h83Var.c(str);
        ((h83) dpi0Var.f6468a).b(kng0.c(h83Var.f12607a, h83Var, smk0Var, 0));
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0074  */
    /* JADX WARN: Code duplicated, block: B:36:0x0085  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object v(glz glzVar, zje zjeVar) throws Throwable {
        plz plzVar;
        glz glzVar2;
        mie0 mie0Var;
        Throwable th;
        blz blzVar;
        blz blzVar2;
        if (zjeVar instanceof plz) {
            plzVar = (plz) zjeVar;
            int i = plzVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                plzVar.l = i - Integer.MIN_VALUE;
            } else {
                plzVar = new plz(zjeVar);
            }
        } else {
            plzVar = new plz(zjeVar);
        }
        Object obj = plzVar.k;
        wne wneVar = wne.f39444a;
        int i2 = plzVar.l;
        if (i2 != 0) {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            mie0Var = plzVar.j;
            glzVar2 = plzVar.i;
            try {
                z1x.P(obj);
                blzVar2 = (blz) mie0Var.f21842a;
                if (blzVar2 != null) {
                    glzVar2.f(blzVar2);
                }
                return Unit.f46060a;
            } catch (Throwable th2) {
                th = th2;
                blzVar = (blz) mie0Var.f21842a;
                if (blzVar != null) {
                    glzVar2.f(blzVar);
                }
                throw th;
            }
        }
        z1x.P(obj);
        if (glzVar.i.compareTo(lkz.d) >= 0) {
            return Unit.f46060a;
        }
        mie0 mie0Var2 = new mie0();
        try {
            plzVar.i = glzVar;
            plzVar.j = mie0Var2;
            plzVar.l = 1;
            n5a n5aVar = new n5a(1, pnx.b(plzVar));
            n5aVar.r();
            qlz qlzVar = new qlz(n5aVar);
            mie0Var2.f21842a = qlzVar;
            glzVar.a(qlzVar);
            if (n5aVar.p() == wneVar) {
                return wneVar;
            }
            glzVar2 = glzVar;
            mie0Var = mie0Var2;
            blzVar2 = (blz) mie0Var.f21842a;
            if (blzVar2 != null) {
                glzVar2.f(blzVar2);
            }
            return Unit.f46060a;
        } catch (Throwable th3) {
            glzVar2 = glzVar;
            mie0Var = mie0Var2;
            th = th3;
            blzVar = (blz) mie0Var.f21842a;
            if (blzVar != null) {
                glzVar2.f(blzVar);
            }
            throw th;
        }
    }

    public static final List w(List list, ctf0 ctf0Var, y78 y78Var, boolean z, boolean z2, wcb wcbVar, int i, boolean z3, boolean z4, v5l0 v5l0Var, String str, boolean z5) {
        list.getClass();
        ctf0Var.getClass();
        if (list.isEmpty()) {
            return iun.f15405a;
        }
        lc00 lc00VarB = kotlin.collections.a.b();
        lc00VarB.add(new agh0(new hjm(ctf0Var.f(R.string.events_line, new Object[0]), null, null, null, null, null, false, null, null, false, null, null, 8126)));
        int i2 = 0;
        for (Object obj : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                q3d.p();
                throw null;
            }
            d0t d0tVar = (d0t) obj;
            String strA = wcbVar != null ? wcbVar.a(d0tVar.v, d0tVar.u) : null;
            if (strA == null) {
                strA = "";
            }
            lc00VarB.add(n2x.P(d0tVar, ctf0Var, y78Var, z, z2, strA, i, z3, z4, v5l0Var, str, unh0.i0(i2, lc00VarB), z5));
            i2 = i3;
        }
        return kotlin.collections.a.a(lc00VarB);
    }

    public static void x(Object obj) {
        if (obj != null) {
            return;
        }
        hny.u("Cannot return null from a non-@Nullable component method");
    }

    public static void y(Object obj) {
        if (obj != null) {
            return;
        }
        hny.u("Cannot return null from a non-@Nullable @Provides method");
    }

    public static final int z(xpg0 xpg0Var, String str) {
        xpg0Var.getClass();
        int columnCount = xpg0Var.getColumnCount();
        int i = 0;
        while (true) {
            if (i >= columnCount) {
                i = -1;
                break;
            }
            if (str.equals(xpg0Var.getColumnName(i))) {
                break;
            }
            i++;
        }
        if (i >= 0) {
            return i;
        }
        String strL = kng0.l("`", str, "`");
        int columnCount2 = xpg0Var.getColumnCount();
        int i2 = 0;
        while (true) {
            if (i2 >= columnCount2) {
                i2 = -1;
                break;
            }
            if (strL.equals(xpg0Var.getColumnName(i2))) {
                break;
            }
            i2++;
        }
        if (i2 >= 0) {
            return i2;
        }
        if (Build.VERSION.SDK_INT <= 25 && str.length() != 0) {
            int columnCount3 = xpg0Var.getColumnCount();
            String strConcat = Separators.DOT.concat(str);
            String strL2 = kng0.l(Separators.DOT, str, "`");
            for (int i3 = 0; i3 < columnCount3; i3++) {
                String columnName = xpg0Var.getColumnName(i3);
                if (columnName.length() >= str.length() + 2 && (kotlin.text.c.n(columnName, strConcat, false) || (columnName.charAt(0) == '`' && kotlin.text.c.n(columnName, strL2, false)))) {
                    return i3;
                }
            }
        }
        return -1;
    }

    public abstract jge0 C();
}
