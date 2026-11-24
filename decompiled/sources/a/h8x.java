package a;

import android.content.Context;
import android.gov.nist.core.LexerCore;
import android.gov.nist.core.Separators;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import com.huawei.hms.framework.common.BundleUtil;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public abstract class h8x {
    public static final d0b0 A(d0b0 d0b0Var, boolean z, boolean z2, List list) {
        d0b0Var.getClass();
        return d0b0.a(d0b0Var, null, null, new yza0(list, z, z2), null, null, false, false, false, false, null, false, 4091);
    }

    public static final d0b0 B(d0b0 d0b0Var, boolean z, boolean z2, List list) {
        d0b0Var.getClass();
        return d0b0.a(d0b0Var, null, new zza0(list, z, z2), null, null, null, false, false, false, false, null, false, LexerCore.ID_NO_WHITESPACE);
    }

    public static d0b0 C(d0b0 d0b0Var, boolean z, boolean z2) {
        return B(d0b0Var, z, z2, d0b0Var.b.c);
    }

    public static final d0b0 D(d0b0 d0b0Var, boolean z, boolean z2, uhc0 uhc0Var) {
        d0b0Var.getClass();
        return d0b0.a(d0b0Var, null, null, null, new b0b0(z, z2, uhc0Var), null, false, false, false, false, null, false, 4087);
    }

    public static final String E(String str, rkj rkjVar) {
        rkjVar.getClass();
        return "Cannot deserialize " + str + " with '" + sre0.f32672a.b(rkjVar.getClass()).J() + "'. This serializer can only be used with SavedStateDecoder. Use 'decodeFromSavedState' instead.";
    }

    public static final int F(tly tlyVar, int i) {
        int iB;
        tlyVar.getClass();
        if (!tlyVar.f34169a || (iB = si30.b(tlyVar.b) - i) < 0) {
            return 0;
        }
        return iB;
    }

    public static final String G(String str, bwn bwnVar) {
        bwnVar.getClass();
        return "Cannot serialize " + str + " with '" + sre0.f32672a.b(bwnVar.getClass()).J() + "'. This serializer can only be used with SavedStateEncoder. Use 'encodeToSavedState' instead.";
    }

    public static final List H(String str, List list) {
        list.getClass();
        if (StringsKt.W(str)) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            gy20 gy20Var = (gy20) obj;
            if (gy20Var != null) {
                boolean zO = true;
                if (!(gy20Var instanceof vwv)) {
                    if (gy20Var instanceof fv20) {
                        zO = StringsKt.O(((fv20) gy20Var).f10194a.b, str, true);
                    } else if (gy20Var instanceof or20) {
                        zO = StringsKt.O(((or20) gy20Var).f25717a.b, str, true);
                    }
                }
                if (zO) {
                    arrayList.add(obj);
                }
            }
            t9f.b();
            return null;
        }
        return arrayList;
    }

    public static final String I(pj30 pj30Var) {
        String string;
        Object objI0 = mrv.i0(pj30Var);
        if (objI0 == null) {
            pj30Var.n();
            objI0 = null;
        }
        return (objI0 == null || (string = objI0.toString()) == null) ? "null" : string;
    }

    public static final SpannableStringBuilder J(ctf0 ctf0Var, String str, int i) {
        by7 by7VarC;
        String strE;
        ctf0Var.getClass();
        str.getClass();
        try {
            by7VarC = by7.c();
        } catch (Throwable unused) {
            by7VarC = null;
        }
        String strR = kotlin.text.c.r(str, Separators.SP, " ", false);
        if (by7VarC != null && (strE = by7VarC.e(strR)) != null) {
            strR = strE;
        }
        String strA = ctf0Var.b.a(i, Arrays.copyOf(new Object[]{strR.toString()}, 1));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strA);
        int iV = StringsKt.V(strA, strR, 0, false, 6);
        if (iV != -1) {
            spannableStringBuilder.setSpan(new StyleSpan(1), iV, strR.length() + iV, 33);
        }
        return spannableStringBuilder;
    }

    public static final long K(ctf0 ctf0Var, boolean z) {
        return z ? fbc.d(ctf0.b(R.attr.uikitSecondary, ctf0Var)) : fbc.d(ctf0.b(R.attr.uikitStaticRed, ctf0Var));
    }

    public static final Object L(gjt gjtVar, ijt ijtVar) {
        gjtVar.getClass();
        ijtVar.getClass();
        if (gjtVar.m(ijtVar)) {
            return gjtVar.l(ijtVar);
        }
        return null;
    }

    public static final Object M(gjt gjtVar, ijt ijtVar, int i) {
        gjtVar.getClass();
        ijtVar.getClass();
        gjtVar.q(ijtVar);
        erp erpVar = gjtVar.f11417a;
        hjt hjtVar = ijtVar.d;
        erpVar.getClass();
        oak0 oak0Var = erpVar.f8293a;
        if (!hjtVar.c) {
            jf4.o("getRepeatedField() can only be called on repeated fields.");
            return null;
        }
        Object obj = oak0Var.get(hjtVar);
        if (i < (obj == null ? 0 : ((List) obj).size())) {
            gjtVar.q(ijtVar);
            if (hjtVar.c) {
                Object obj2 = oak0Var.get(hjtVar);
                if (obj2 != null) {
                    return ijtVar.a(((List) obj2).get(i));
                }
                throw new IndexOutOfBoundsException();
            }
            jf4.o("getRepeatedField() can only be called on repeated fields.");
        }
        return null;
    }

    public static final long N(ctf0 ctf0Var, boolean z) {
        return z ? fbc.d(ctf0.b(R.attr.uikitPrimary, ctf0Var)) : fbc.d(ctf0.b(R.attr.uikitBackground, ctf0Var));
    }

    public static final boolean O(Map map, dsh0 dsh0Var) {
        Boolean bool = (Boolean) map.get(dsh0Var);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003e A[Catch: all -> 0x0058, TryCatch #2 {all -> 0x0058, blocks: (B:2:0x0000, B:9:0x001e, B:11:0x0035, B:12:0x0038, B:14:0x003e, B:23:0x005b, B:15:0x0041, B:16:0x0053, B:18:0x0055, B:19:0x0057), top: B:34:0x0000, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:15:0x0041 A[Catch: all -> 0x0058, TryCatch #2 {all -> 0x0058, blocks: (B:2:0x0000, B:9:0x001e, B:11:0x0035, B:12:0x0038, B:14:0x003e, B:23:0x005b, B:15:0x0041, B:16:0x0053, B:18:0x0055, B:19:0x0057), top: B:34:0x0000, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:22:0x005a  */
    public static final Pair P(InputStream inputStream) {
        n3d0 n3d0Var;
        z3 z3Var;
        try {
            ad9 ad9Var = ad9.f;
            ad9 ad9VarQ0 = ntr.q0(inputStream);
            ad9 ad9Var2 = ad9.f;
            int i = ad9VarQ0.c;
            ad9Var2.getClass();
            int i2 = ad9Var2.c;
            int i3 = ad9VarQ0.b;
            int i4 = ad9Var2.b;
            if (i3 == 0) {
                if (i4 == 0 && i == i2) {
                    sso ssoVarQ = tlb.q(oae0.f24926a);
                    sfy sfyVar = n3d0.l;
                    sfyVar.getClass();
                    pyc pycVar = new pyc(inputStream);
                    z3Var = (z3) sfyVar.b(pycVar, ssoVarQ);
                    try {
                        pycVar.a(0);
                        if (z3Var.b()) {
                            aox aoxVar = new aox(new ss3((byte) 28).getMessage());
                            aoxVar.f1223a = z3Var;
                            throw aoxVar;
                        }
                        n3d0Var = (n3d0) z3Var;
                    } catch (aox e) {
                        e.f1223a = z3Var;
                        throw e;
                    }
                } else {
                    n3d0Var = null;
                }
            } else if (i3 != i4 || i > i2) {
                n3d0Var = null;
            } else {
                sso ssoVarQ2 = tlb.q(oae0.f24926a);
                sfy sfyVar2 = n3d0.l;
                sfyVar2.getClass();
                pyc pycVar2 = new pyc(inputStream);
                z3Var = (z3) sfyVar2.b(pycVar2, ssoVarQ2);
                pycVar2.a(0);
                if (z3Var.b()) {
                    aox aoxVar2 = new aox(new ss3((byte) 28).getMessage());
                    aoxVar2.f1223a = z3Var;
                    throw aoxVar2;
                }
                n3d0Var = (n3d0) z3Var;
            }
            Pair pair = new Pair(n3d0Var, ad9VarQ0);
            inputStream.close();
            return pair;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                bkb.E(inputStream, th);
                throw th2;
            }
        }
    }

    public static final Pair Q(String str, Map map, Map map2) {
        Integer numV;
        if (StringsKt.W(str)) {
            str = null;
        }
        if (str == null || (numV = v(str, map, map2)) == null) {
            return null;
        }
        return new Pair(str, Integer.valueOf(numV.intValue()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [a.qs10] */
    /* JADX WARN: Type inference failed for: r5v2, types: [a.ps10] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [a.ss10] */
    /* JADX WARN: Type inference failed for: r5v5 */
    public static final eye R(txe txeVar, ctf0 ctf0Var, boolean z) {
        gao0 gao0Var = txeVar.c;
        boolean z2 = gao0Var instanceof dao0;
        m0d m0dVar = txeVar.d;
        boolean z3 = m0dVar.g == o0d.b;
        String strA = ctf0Var.b.a(R.string.system, Arrays.copyOf(new Object[0], 0));
        k680 k680Var = null;
        bye vxeVar = zxe.f45153a;
        if ((!z || (gao0Var instanceof dao0)) && !gao0Var.equals(eao0.f7477a)) {
            if (gao0Var.equals(dao0.f5760a)) {
                vxeVar = xxe.f41654a;
            } else {
                if (!(gao0Var instanceof fao0)) {
                    t9f.b();
                    return null;
                }
                en7 en7Var = ((fao0) gao0Var).f9219a;
                vxeVar = new vxe(w6x.n(en7Var.c, en7Var.f8078a, Separators.SLASH));
            }
        }
        ?? qs10Var = new qs10(strA, vxeVar);
        os10 os10Var = new os10(new j43(m0dVar.b, m0dVar.d, kcx.P(m0dVar), z));
        if (!z2 && z3) {
            qs10Var = new rs10(os10Var, qs10Var);
        } else if (z2) {
            qs10Var = z3 ? os10Var : ps10.f27493a;
        }
        String str = txeVar.e;
        h680 h680Var = txeVar.g;
        if (h680Var != null) {
            m0d m0dVar2 = h680Var.f12519a;
            j43 j43Var = new j43(m0dVar2.b, m0dVar2.d, kcx.P(m0dVar2), z);
            m0d m0dVar3 = h680Var.b;
            k680Var = new k680(j43Var, new j43(m0dVar3.b, m0dVar3.d, kcx.P(m0dVar3), z));
        }
        return new eye(qs10Var, str, k680Var, txeVar.f);
    }

    public static final String S(sw70 sw70Var) {
        return kng0.k("://open/openlink?type=external&url=", sw70Var.f32908a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final ArrayList T(ArrayList arrayList, long j, boolean z, ctf0 ctf0Var, List list, udl0 udl0Var, long j2, aw20 aw20Var, ycs ycsVar, boolean z2) {
        ArrayList arrayList2;
        ovm0 ovm0Var;
        Object obj;
        ovm0 mvm0Var;
        gy20 fv20Var;
        List list2;
        Long l;
        Object next;
        ctf0Var.getClass();
        list.getClass();
        aw20Var.getClass();
        ArrayList arrayList3 = new ArrayList();
        if (j != 0) {
            arrayList3.add(new vwv(h97.h(j2, "hidden_groups_"), ctf0Var.b.a(R.string.hidden_groups_count_v2, Arrays.copyOf(new Object[]{Long.valueOf(j)}, 1))));
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ou20 ou20Var = (ou20) it.next();
            List list3 = ou20Var.f25856a;
            List list4 = ou20Var.f25856a;
            long j3 = ou20Var.b;
            if (list3.isEmpty()) {
                arrayList2 = arrayList3;
                it = it;
            } else {
                if (x4d0.d0(ou20Var)) {
                    Iterator it2 = list.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            list2 = list4;
                            l = null;
                            next = null;
                            break;
                        }
                        next = it2.next();
                        l = null;
                        Iterator it3 = it2;
                        list2 = list4;
                        if (((lgr0) next).f20021a == j3) {
                            break;
                        }
                        list4 = list2;
                        it2 = it3;
                    }
                    lgr0 lgr0Var = (lgr0) next;
                    uv20 uv20VarR = m7x.R(ou20Var, z, uzb.J0(aw20Var), z2);
                    Long lValueOf = lgr0Var != null ? Long.valueOf(lgr0Var.b) : l;
                    Double dValueOf = lgr0Var != null ? Double.valueOf(lgr0Var.c) : l;
                    bh bhVar = new bh(slb.S(lValueOf, dValueOf, ou20Var.g, ou20Var.b, r3d.r(list2), udl0Var, aw20Var), dyb.r0(x8f.Z(ctf0Var, lValueOf, dValueOf, r3d.r(list2))));
                    StringBuilder sbQ = kng0.q(j2, "market_accuracy_group_", BundleUtil.UNDERLINE_TAG);
                    sbQ.append(j3);
                    fv20Var = new or20(uv20VarR, bhVar, sbQ.toString());
                } else {
                    if (Intrinsics.d(ycsVar, vcs.f37201a)) {
                        mvm0Var = new mvm0(j2);
                    } else {
                        if (ycsVar instanceof wcs) {
                            Iterator it4 = ((wcs) ycsVar).f38938a.iterator();
                            while (true) {
                                if (!it4.hasNext()) {
                                    obj = null;
                                    break;
                                }
                                Object next2 = it4.next();
                                if (((ovm0) next2).a() == j2) {
                                    obj = next2;
                                    break;
                                }
                            }
                            mvm0Var = (ovm0) obj;
                        } else {
                            if (!Intrinsics.d(ycsVar, xcs.f40662a) && ycsVar != null) {
                                t9f.b();
                                return null;
                            }
                            ovm0Var = null;
                        }
                        uv20 uv20VarR2 = m7x.R(ou20Var, z, uzb.J0(aw20Var), z2);
                        a4x a4xVarJ0 = ro4.j0(list4, ou20Var.b, z, x8x.G(aw20Var), ovm0Var);
                        StringBuilder sbQ2 = kng0.q(j2, "market_group_", BundleUtil.UNDERLINE_TAG);
                        sbQ2.append(j3);
                        fv20Var = new fv20(uv20VarR2, a4xVarJ0, sbQ2.toString());
                    }
                    ovm0Var = mvm0Var;
                    uv20 uv20VarR3 = m7x.R(ou20Var, z, uzb.J0(aw20Var), z2);
                    a4x a4xVarJ1 = ro4.j0(list4, ou20Var.b, z, x8x.G(aw20Var), ovm0Var);
                    StringBuilder sbQ3 = kng0.q(j2, "market_group_", BundleUtil.UNDERLINE_TAG);
                    sbQ3.append(j3);
                    fv20Var = new fv20(uv20VarR3, a4xVarJ1, sbQ3.toString());
                }
                arrayList2 = arrayList3;
                arrayList2.add(fv20Var);
            }
            it = it;
            arrayList3 = arrayList2;
        }
        return arrayList3;
    }

    public static final q56 U(y78 y78Var, d0t d0tVar, ctf0 ctf0Var, m5l0 m5l0Var, v5l0 v5l0Var, String str, String str2, List list, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        q56 l56Var;
        d0tVar.getClass();
        y78Var.getClass();
        list.getClass();
        str.getClass();
        ctf0Var.getClass();
        v5l0Var.getClass();
        str2.getClass();
        int iOrdinal = v5l0Var.ordinal();
        if (iOrdinal == 0) {
            l56Var = new l56(d0tVar.f5282a, s7n0.n(d0tVar, str, str2, list, z2, z3, z4, kpb.b0(d0tVar, z), kpb.d0(d0tVar, z)), new b66(new pws0(qzb.c0(d0tVar), null), new pws0(qzb.r0(d0tVar), null), new lpm(opm.f25648a, new hpm(0L, 3)), dyb.a0(d0tVar), y78.n(y78Var, d0tVar, !qzb.E0(d0tVar), z5, 4).toString()), jn8.a(d0tVar, v5l0Var, ctf0Var, m5l0Var));
        } else if (iOrdinal == 1) {
            l56Var = new p56(d0tVar.f5282a, s7n0.r(d0tVar, str, list, z2, z3, str2, kpb.b0(d0tVar, z), kpb.d0(d0tVar, z)), new h76(new qws0(qzb.c0(d0tVar)), new qws0(qzb.r0(d0tVar)), dyb.a0(d0tVar), y78.n(y78Var, d0tVar, !qzb.E0(d0tVar), z5, 4).toString(), pem.f26861a), jn8.a(d0tVar, v5l0Var, ctf0Var, m5l0Var));
        } else if (iOrdinal == 2) {
            l56Var = new o56(d0tVar.f5282a, s7n0.q(d0tVar, str, list, z2, z3, str2, kpb.b0(d0tVar, z), kpb.d0(d0tVar, z)), new z66((d0tVar.S && z4) ? new d2i() : null, dyb.a0(d0tVar), new rws0(qzb.c0(d0tVar), null), new rws0(qzb.r0(d0tVar), null), y78.n(y78Var, d0tVar, !qzb.E0(d0tVar), z5, 4).toString()), jn8.a(d0tVar, v5l0Var, ctf0Var, m5l0Var));
        } else {
            if (iOrdinal != 3) {
                if (iOrdinal == 4) {
                    return new m56(d0tVar.f5282a, s7n0.o(d0tVar, str, str2, list, z2, z3, z4, kpb.b0(d0tVar, z), kpb.d0(d0tVar, z)), new j66(new czm(qzb.c0(d0tVar), null, null), new czm(qzb.r0(d0tVar), null, null), y78.n(y78Var, d0tVar, !qzb.E0(d0tVar), z5, 4).toString(), dyb.Z(d0tVar)), jn8.a(d0tVar, v5l0Var, ctf0Var, m5l0Var));
                }
                t9f.b();
                return null;
            }
            l56Var = new n56(d0tVar.f5282a, s7n0.p(d0tVar, str, y78.n(y78Var, d0tVar, !qzb.E0(d0tVar), z5, 4).toString(), list, z2, z3, z4, qzb.B0(d0tVar) || kpb.j0(d0tVar), str2, kpb.b0(d0tVar, z), kpb.d0(d0tVar, z)), new r66(new czm(qzb.c0(d0tVar), null, null), new czm(qzb.r0(d0tVar), null, null)), jn8.a(d0tVar, v5l0Var, ctf0Var, m5l0Var), new n0x(dtb.F(str)));
        }
        return l56Var;
    }

    public static final jz30 V(udb udbVar) {
        jnw jnwVar;
        udbVar.getClass();
        String str = udbVar.b;
        int i = udbVar.f35469a;
        if (i != 30) {
            switch (i) {
                case 64:
                    jnwVar = exp0.c;
                    break;
                case 65:
                    jnwVar = fxp0.c;
                    break;
                case 66:
                    jnwVar = hxp0.c;
                    break;
                default:
                    jnwVar = gxp0.c;
                    break;
            }
        } else {
            jnwVar = dxp0.c;
        }
        return new jz30(str, jnwVar);
    }

    public static final edp0 W(long j, boolean z, String str, List list, dap dapVar) {
        return new edp0(d7x.N(new c280(vsm0.s(j, str), R.drawable.ic_glyph_placeholder_player), j, list, z, dapVar));
    }

    public static final void a(mm40 mm40Var, bhl0 bhl0Var, zgl0 zgl0Var, Function0 function0, fet fetVar, int i) {
        int i2;
        fetVar.g0(-1997451801);
        if ((i & 6) == 0) {
            i2 = i | (fetVar.g(mm40Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        int i3 = i2 | (fetVar.g(bhl0Var) ? 32 : 16) | (fetVar.g(zgl0Var) ? 256 : 128) | (fetVar.i(function0) ? 2048 : 1024);
        byte b = 0;
        boolean z = true;
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            int i4 = i3 >> 6;
            if ((((i4 & 14) ^ 6) <= 4 || !fetVar.g(zgl0Var)) && (i4 & 6) != 4) {
                z = false;
            }
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                pz40 pz40Var = s6t0.f31722a;
                r0q r0qVar = new r0q(s6t0.b().f33626a.getBackgroundContent(), s6t0.b().f33626a.getSecondary(), s6t0.b().f33626a.getSecondary());
                fetVar.o0(r0qVar);
                objP = r0qVar;
            }
            r0q r0qVar2 = (r0q) objP;
            b(mm40Var, r0qVar2.f29642a, function0, u1c.M(-1837868228, new nhl0(bhl0Var, r0qVar2, b), fetVar), u1c.M(-2074486053, new rqc0(r0qVar2, (byte) 15), fetVar), fetVar, (i3 & 14) | 27648 | ((i3 >> 3) & 896));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new pr9(mm40Var, (Object) bhl0Var, (ahl0) zgl0Var, function0, i, (byte) 5);
        }
    }

    public static final void b(mm40 mm40Var, long j, Function0 function0, ugd ugdVar, ugd ugdVar2, fet fetVar, int i) {
        int i2;
        fetVar.g0(-962422237);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.f(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(ugdVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.i(ugdVar2) ? 16384 : 8192;
        }
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = dw9.j(fetVar);
            }
            gy40 gy40Var = (gy40) objP;
            boolean z = (i2 & 896) == 256;
            Object objP2 = fetVar.P();
            if (z || objP2 == cl5Var) {
                objP2 = new l3c0(function0, (byte) 22);
                fetVar.o0(objP2);
            }
            jm40 jm40Var = jm40.b;
            mm40 mm40VarW = y860.W(jm40Var, gy40Var, null, false, null, (Function0) objP2, 28);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(o7k0.e(mm40VarW, 40.0f), 0.0f, 8.0f, 1);
            zcl zclVar2 = qmk.e;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarE = i120.Q(mm40VarL, j, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)).e(mm40Var);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
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
            jpm0.o(fetVar, tj30VarC, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar3);
            jpm0.n(fetVar);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar4);
            mm40 mm40VarB = jr8.f16991a.b(s5x0.L(jm40Var, 6.0f, 0.0f, 2), gqw0.e);
            thg0 thg0VarA = shg0.a(new qw3(2.0f, true, new jf4((byte) 14)), gqw0.k, fetVar, 48);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarB);
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
            Object objValueOf = Integer.valueOf(((i2 >> 6) & 112) | 6);
            zhg0 zhg0Var = zhg0.f44392a;
            ugdVar.F(zhg0Var, fetVar, objValueOf);
            h97.p(((i2 >> 9) & 112) | 6, ugdVar2, zhg0Var, fetVar, true);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new lhl0(mm40Var, j, function0, ugdVar, ugdVar2, i, (byte) 0);
        }
    }

    public static final void c(ir8 ir8Var, ugd ugdVar, fet fetVar, int i) {
        int i2;
        fetVar.g0(1748794236);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(ir8Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.i(ugdVar) ? 32 : 16;
        }
        byte b = 0;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            mm40 mm40VarB = ir8Var.b(jm40.b, gqw0.c);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarQ = ffb0.Q(mm40VarB, 2.0f, -8.0f);
            thg0 thg0VarA = shg0.a(new qw3(2.0f, true, new jf4((byte) 14)), gqw0.j, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarQ);
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
            h97.p((i2 & 112) | 6, ugdVar, zhg0.f44392a, fetVar, true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new mhl0(ir8Var, ugdVar, i, b);
        }
    }

    public static final void d(mm40 mm40Var, pz40 pz40Var, bil0 bil0Var, Function0 function0, Function0 function1, fet fetVar, int i) {
        int i2;
        fetVar.g0(-2121382084);
        byte b = 4;
        if ((i & 6) == 0) {
            i2 = i | (fetVar.g(mm40Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        int i3 = i2 | (fetVar.g(pz40Var) ? 32 : 16) | (fetVar.g(bil0Var) ? 256 : 128) | (fetVar.i(function0) ? 2048 : 1024) | (fetVar.i(function1) ? 16384 : 8192);
        if (fetVar.U(i3 & 1, (i3 & 9363) != 9362)) {
            zgl0 zgl0Var = bil0Var.c;
            boolean zG = fetVar.g(zgl0Var);
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (zG || objP == obj) {
                pz40 pz40Var2 = s6t0.f31722a;
                Object s0qVar = new s0q(s6t0.b().f33626a.getBackgroundContent(), s6t0.b().f33626a.getPrimary20(), s6t0.b().f33626a.getPrimary60(), zgl0Var.f44350a, zgl0Var.b, s6t0.b().f33626a.getBackground(), s6t0.b().f33626a.getSecondary(), s6t0.b().f33626a.getSecondary());
                fetVar.o0(s0qVar);
                objP = s0qVar;
            }
            s0q s0qVar2 = (s0q) objP;
            Object objP2 = fetVar.P();
            byte b2 = 9;
            if (objP2 == obj) {
                objP2 = jgk0.b(new m9l0(pz40Var, b2));
                fetVar.o0(objP2);
            }
            l7m0 l7m0Var = (l7m0) objP2;
            Object objP3 = fetVar.P();
            if (objP3 == obj) {
                objP3 = jgk0.b(new m9l0(pz40Var, (byte) 3));
                fetVar.o0(objP3);
            }
            l7m0 l7m0Var2 = (l7m0) objP3;
            Object objP4 = fetVar.P();
            if (objP4 == obj) {
                objP4 = jgk0.b(new m9l0(pz40Var, b));
                fetVar.o0(objP4);
            }
            l7m0 l7m0Var3 = (l7m0) objP4;
            Object objP5 = fetVar.P();
            if (objP5 == obj) {
                objP5 = jgk0.b(new m9l0(pz40Var, (byte) 5));
                fetVar.o0(objP5);
            }
            l7m0 l7m0Var4 = (l7m0) objP5;
            Object objP6 = fetVar.P();
            if (objP6 == obj) {
                objP6 = jgk0.b(new m9l0(pz40Var, (byte) 6));
                fetVar.o0(objP6);
            }
            l7m0 l7m0Var5 = (l7m0) objP6;
            Object objP7 = fetVar.P();
            if (objP7 == obj) {
                objP7 = jgk0.b(new m9l0(pz40Var, (byte) 7));
                fetVar.o0(objP7);
            }
            l7m0 l7m0Var6 = (l7m0) objP7;
            Object objP8 = fetVar.P();
            if (objP8 == obj) {
                objP8 = jgk0.b(new m9l0(pz40Var, (byte) 8));
                fetVar.o0(objP8);
            }
            l7m0 l7m0Var7 = (l7m0) objP8;
            Object objP9 = fetVar.P();
            if (objP9 == obj) {
                objP9 = jgk0.b(new hhl0(pz40Var, l7m0Var5, l7m0Var6, (byte) 0));
                fetVar.o0(objP9);
            }
            l7m0 l7m0Var8 = (l7m0) objP9;
            Object objP10 = fetVar.P();
            if (objP10 == obj) {
                objP10 = jgk0.b(new hhl0(pz40Var, l7m0Var5, l7m0Var6, (byte) 1));
                fetVar.o0(objP10);
            }
            l7m0 l7m0Var9 = (l7m0) objP10;
            long j = s0qVar2.f;
            long j2 = s0qVar2.h;
            long j3 = s0qVar2.g;
            boolean zF = fetVar.f(j) | fetVar.f(j3);
            Object objP11 = fetVar.P();
            if (zF || objP11 == obj) {
                objP11 = new n1m(j, j3);
                fetVar.o0(objP11);
            }
            n1m n1mVar = (n1m) objP11;
            boolean zF2 = fetVar.f(j);
            Object objP12 = fetVar.P();
            if (zF2 || objP12 == obj) {
                objP12 = new h1m(j);
                fetVar.o0(objP12);
            }
            h1m h1mVar = (h1m) objP12;
            boolean zF3 = fetVar.f(j) | fetVar.f(j2);
            Object objP13 = fetVar.P();
            if (zF3 || objP13 == obj) {
                objP13 = new z0m(j, j2);
                fetVar.o0(objP13);
            }
            z0m z0mVar = (z0m) objP13;
            boolean zG2 = fetVar.g(zgl0Var) | fetVar.f(j);
            Object objP14 = fetVar.P();
            if (zG2 || objP14 == obj) {
                objP14 = new f1m(j);
                fetVar.o0(objP14);
            }
            g1m g1mVar = (g1m) objP14;
            boolean zF4 = fetVar.f(j);
            Object objP15 = fetVar.P();
            if (zF4 || objP15 == obj) {
                objP15 = new tsl(new lsl(j));
                fetVar.o0(objP15);
            }
            tsl tslVar = (tsl) objP15;
            boolean zF5 = fetVar.f(j);
            Object objP16 = fetVar.P();
            if (zF5 || objP16 == obj) {
                objP16 = new usl(new lsl(j));
                fetVar.o0(objP16);
            }
            long j4 = s0qVar2.f31420a;
            long j5 = s0qVar2.b;
            long j6 = s0qVar2.c;
            ugd ugdVarM = u1c.M(-1126676528, new ghl0(l7m0Var4, bil0Var, g1mVar, l7m0Var, s0qVar2, l7m0Var3, l7m0Var2, z0mVar, l7m0Var5, n1mVar, l7m0Var6, h1mVar, l7m0Var8, tslVar, l7m0Var9, (usl) objP16), fetVar);
            int i4 = i3 << 9;
            e(mm40Var, l7m0Var3, l7m0Var7, j4, j5, j6, function0, function1, ugdVarM, fetVar, (i3 & 14) | 100663728 | (3670016 & i4) | (i4 & 29360128));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gja(mm40Var, pz40Var, bil0Var, function0, function1, i, (byte) 5);
        }
    }

    public static final void e(mm40 mm40Var, l7m0 l7m0Var, l7m0 l7m0Var2, long j, long j2, long j3, Function0 function0, Function0 function1, ugd ugdVar, fet fetVar, int i) {
        int i2;
        l7m0 l7m0Var3;
        int i3;
        boolean z;
        Pair pair;
        fetVar.g0(-230053514);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(l7m0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            l7m0Var3 = l7m0Var2;
            i2 |= fetVar.g(l7m0Var3) ? 256 : 128;
        } else {
            l7m0Var3 = l7m0Var2;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.f(j) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.f(j2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar.f(j3) ? 131072 : 65536;
        }
        int i4 = i2;
        if ((1572864 & i) == 0) {
            i3 = i4 | (fetVar.i(function0) ? 1048576 : 524288);
        } else {
            i3 = i4;
        }
        if ((i & 12582912) == 0) {
            i3 |= fetVar.i(function1) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= fetVar.i(ugdVar) ? 67108864 : 33554432;
        }
        if (fetVar.U(i3 & 1, (i3 & 38347923) != 38347922)) {
            boolean z2 = l7m0Var.getValue() == k0d.b;
            Context context = (Context) fetVar.k(dy2.b);
            if (((Boolean) l7m0Var3.getValue()).booleanValue()) {
                z = true;
                pair = new Pair(new y3d(j2), new y3d(j3));
            } else {
                z = true;
                y3d y3dVar = new y3d(j);
                pz40 pz40Var = s6t0.f31722a;
                pair = new Pair(y3dVar, new y3d(StaticColors.INSTANCE.m121getTransparent0d7_KjU()));
            }
            long j4 = ((y3d) pair.f46059a).f41946a;
            long j5 = ((y3d) pair.b).f41946a;
            mm40 mm40VarN = epv0.N(jm40.b, z2 != 0 ? 0.5f : 1.0f);
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            Object objJ = objP;
            if (objP == obj) {
                objJ = dw9.j(fetVar);
            }
            gy40 gy40Var = (gy40) objJ;
            boolean z3 = !z2;
            boolean zI = ((29360128 & i3) == 8388608 ? z : false) | fetVar.i(context);
            Object objP2 = fetVar.P();
            Object obj2 = objP2;
            if (zI || objP2 == obj) {
                Object jhl0Var = new jhl0(function1, context, (byte) 0);
                fetVar.o0(jhl0Var);
                obj2 = jhl0Var;
            }
            Function0 function2 = (Function0) obj2;
            boolean z4 = (3670016 & i3) == 1048576 ? z : false;
            Object objP3 = fetVar.P();
            Object obj3 = objP3;
            if (z4 || objP3 == obj) {
                Object l3c0Var = new l3c0(function0, (byte) 21);
                fetVar.o0(l3c0Var);
                obj3 = l3c0Var;
            }
            mm40 mm40VarZ = y860.Z(mm40VarN, gy40Var, z3, function2, (Function0) obj3, 440);
            zcl zclVar = qmk.f28987a;
            boolean z5 = z;
            mm40 mm40VarB = o7k0.b(s5x0.L(mm40VarZ, 0.0f, 8.0f, z5 ? 1 : 0), 0.0f, 24.0f, z5 ? 1 : 0);
            boolean zF = fetVar.f(j4) | fetVar.f(j5);
            Object objP4 = fetVar.P();
            if (zF || objP4 == obj) {
                objP4 = new lf4((byte) 9, j4, j5);
                fetVar.o0(objP4);
            }
            mm40 mm40VarE = rq8.K(mm40VarB, (Function1) objP4).e(mm40Var);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
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
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            ua80.p(((i3 >> 21) & 112) | 6, ugdVar, jr8.f16991a, fetVar, true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new khl0(mm40Var, l7m0Var, l7m0Var2, j, j2, j3, function0, function1, ugdVar, i, (byte) 0);
        }
    }

    public static final void f(mm40 mm40Var, l3w l3wVar, fet fetVar, int i, int i2) {
        mm40 mm40Var2;
        int i3;
        fet fetVar2;
        mm40 mm40Var3;
        fet fetVar3;
        boolean z;
        boolean z2;
        l3wVar.getClass();
        fetVar.g0(-1544843620);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            mm40Var2 = mm40Var;
        } else if ((i & 6) == 0) {
            mm40Var2 = mm40Var;
            i3 = i | (fetVar.g(mm40Var2) ? 4 : 2);
        } else {
            mm40Var2 = mm40Var;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= fetVar.g(l3wVar) ? 32 : 16;
        }
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            mm40 mm40Var4 = i4 != 0 ? jm40.b : mm40Var2;
            long background = ((ThemeColors) fetVar.k(zaq0.b)).getBackground();
            mm40 mm40VarD = o7k0.d(mm40Var4, 1.0f);
            boolean zF = fetVar.f(background);
            Object objP = fetVar.P();
            if (zF || objP == ukd.f35823a) {
                objP = new dls((byte) 9, background);
                fetVar.o0(objP);
            }
            mm40 mm40VarK = rq8.K(mm40VarD, (Function1) objP);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarJ = s5x0.J(mm40VarK, 8.0f);
            x5d x5dVarA = w5d.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.m, fetVar, 0);
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
            if (l3wVar.f19376a.length() > 0) {
                fetVar.e0(-1588749509);
                z = false;
                z2 = true;
                v8q0.a(l3wVar.f19376a, null, 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, ibm0.n(new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045), fetVar), fetVar, 0, 0, 131070);
                fetVar3 = fetVar;
                fetVar3.r(false);
            } else {
                fetVar3 = fetVar;
                z = false;
                z2 = true;
                fetVar3.e0(-1588594788);
                fetVar3.r(false);
            }
            if (l3wVar.b.length() > 0) {
                fetVar3.e0(-1588524077);
                v8q0.a(l3wVar.b, null, 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, ibm0.t(new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045), fetVar3), fetVar, 0, 0, 131070);
                fetVar2 = fetVar;
                fetVar2.r(z);
            } else {
                fetVar2 = fetVar3;
                fetVar2.e0(-1588361668);
                fetVar2.r(z);
            }
            fetVar2.r(z2);
            mm40Var3 = mm40Var4;
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
            mm40Var3 = mm40Var2;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new q02(mm40Var3, (Object) l3wVar, i, i2, (byte) 29);
        }
    }

    public static final void g(String str, fet fetVar, int i) {
        fetVar.g0(391877331);
        int i2 = i | (fetVar.g(str) ? 4 : 2);
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
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
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            pm80 pm80VarF = a8k0.F(R.drawable.default_background, 0, fetVar);
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            k7x.b(str, null, jr8.f16991a.b(o7k0.e(mm40VarD, 316.0f), gqw0.b), pm80VarF, pm80VarF, null, null, null, null, null, gqw0.A, null, fetVar, (i2 & 14) | 36912, 6, 31712);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new hxk((byte) 24, i, str);
        }
    }

    public static final void h(final mm40 mm40Var, d9z d9zVar, final tgv tgvVar, final hh80 hh80Var, boolean z, final qkq qkqVar, final boolean z2, final vf80 vf80Var, final sw3 sw3Var, final ow3 ow3Var, final Function1 function1, fet fetVar, final int i, final int i2) {
        int i3;
        int i4;
        d9z d9zVar2;
        boolean z3;
        int i5;
        d9z d9zVar3;
        boolean z4;
        mm40 mm40VarG0;
        fetVar.g0(708740370);
        if ((i & 6) == 0) {
            i3 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= fetVar.g(d9zVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= (i & 512) == 0 ? fetVar.g(tgvVar) : fetVar.i(tgvVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= fetVar.g(hh80Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= fetVar.h(false) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i3 |= fetVar.h(z) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= fetVar.g(qkqVar) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= fetVar.h(z2) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= fetVar.g(vf80Var) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= fetVar.g(sw3Var) ? 536870912 : 268435456;
        }
        int i6 = i3;
        if ((i2 & 6) == 0) {
            i4 = i2 | (fetVar.g(ow3Var) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= fetVar.i(function1) ? 32 : 16;
        }
        boolean z5 = true;
        if (fetVar.U(i6 & 1, ((i6 & 306783379) == 306783378 && (i4 & 19) == 18) ? false : true)) {
            fetVar.Z();
            if ((i & 1) != 0 && !fetVar.B()) {
                fetVar.X();
            }
            fetVar.s();
            int i7 = i6 >> 3;
            int i8 = i7 & 14;
            int i9 = i8 | (i4 & 112);
            pz40 pz40VarF = androidx.compose.runtime.e.f(function1, fetVar);
            int i10 = i4;
            boolean z6 = (((i9 & 14) ^ 6) > 4 && fetVar.g(d9zVar)) || (i9 & 6) == 4;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z6 || objP == cl5Var) {
                ujn ujnVar = ujn.A;
                rip ripVar = new rip(pz40VarF, (byte) 5);
                nvu nvuVar = jgk0.f16485a;
                objP = new a6g(new zbk(new wqv(new zbk(ripVar, ujnVar), d9zVar, (byte) 29), ujnVar), l7m0.class, "value", "getValue()Ljava/lang/Object;", 0, (byte) 6);
                fetVar.o0(objP);
            }
            eiy eiyVar = (eiy) objP;
            int i11 = i8 | ((i6 >> 9) & 112);
            boolean z7 = ((((i11 & 112) ^ 48) > 32 && fetVar.h(false)) || (i11 & 48) == 32) | ((((i11 & 14) ^ 6) > 4 && fetVar.g(d9zVar)) || (i11 & 6) == 4);
            Object objP2 = fetVar.P();
            if (z7 || objP2 == cl5Var) {
                objP2 = new rdz(d9zVar);
                fetVar.o0(objP2);
            }
            rdz rdzVar = (rdz) objP2;
            Object objP3 = fetVar.P();
            if (objP3 == cl5Var) {
                objP3 = m0x0.I(kotlin.coroutines.g.f46065a, fetVar);
                fetVar.o0(objP3);
            }
            vne vneVar = (vne) objP3;
            afv afvVar = (afv) fetVar.k(bmd.g);
            int i12 = i6 & 112;
            g9m0 g9m0Var = !((Boolean) fetVar.k(bmd.x)).booleanValue() ? tpm0.f34341a : null;
            int i13 = (i6 & 524272) | ((i10 << 18) & 3670016) | ((i6 >> 6) & 29360128);
            boolean zG = ((((i13 & 896) ^ 384) > 256 && fetVar.g(tgvVar)) || (i13 & 384) == 256) | ((((i13 & 112) ^ 48) > 32 && fetVar.g(d9zVar)) || (i13 & 48) == 32) | ((((i13 & 7168) ^ 3072) > 2048 && fetVar.g(hh80Var)) || (i13 & 3072) == 2048) | ((((57344 & i13) ^ 24576) > 16384 && fetVar.h(false)) || (i13 & 24576) == 16384) | ((((458752 & i13) ^ 196608) > 131072 && fetVar.h(z)) || (i13 & 196608) == 131072) | ((((i13 & 3670016) ^ 1572864) > 1048576 && fetVar.g(ow3Var)) || (i13 & 1572864) == 1048576) | ((((i13 & 29360128) ^ 12582912) > 8388608 && fetVar.g(sw3Var)) || (i13 & 12582912) == 8388608) | fetVar.g(afvVar);
            Object objP4 = fetVar.P();
            if (zG || objP4 == cl5Var) {
                i5 = 32;
                Object o8zVar = new o8z(d9zVar, z, hh80Var, eiyVar, tgvVar, sw3Var, ow3Var, vneVar, afvVar, g9m0Var);
                d9zVar3 = d9zVar;
                z3 = z;
                fetVar.o0(o8zVar);
                objP4 = o8zVar;
            } else {
                d9zVar3 = d9zVar;
                z3 = z;
                i5 = 32;
            }
            ibz ibzVar = (ibz) objP4;
            boolean z8 = i12 == i5;
            Object objP5 = fetVar.P();
            if (z8 || objP5 == cl5Var) {
                objP5 = new md0(d9zVar3, (byte) 10);
                fetVar.o0(objP5);
            }
            ppm0 ppm0VarS = d9x.S(false, z3, (Function0) objP5, fetVar, (i6 >> 12) & 126);
            ma80 ma80Var = z3 ? ma80.f21447a : ma80.b;
            if (z2) {
                fetVar.e0(27471107);
                if (((i8 ^ 6) <= 4 || !fetVar.g(d9zVar3)) && (i7 & 6) != 4) {
                    z5 = false;
                }
                Object objP6 = fetVar.P();
                if (z5 || objP6 == cl5Var) {
                    objP6 = new f8z(d9zVar3);
                    fetVar.o0(objP6);
                }
                z4 = false;
                mm40VarG0 = ahy.g0((f8z) objP6, d9zVar3.n, false, ma80Var);
                fetVar.r(false);
            } else {
                z4 = false;
                fetVar.e0(27767312);
                fetVar.r(false);
                mm40VarG0 = jm40.b;
            }
            d9z d9zVar4 = d9zVar3;
            mm40 mm40VarD0 = nia0.d0(i120.c0(o050.Q(mm40Var.e(d9zVar3.k).e(d9zVar3.l), eiyVar, rdzVar, ma80Var, z2, z4).e(mm40VarG0), d9zVar3.m), d9zVar4, ma80Var, vf80Var, z2, z4, qkqVar, d9zVar3.f, ppm0VarS);
            d9zVar2 = d9zVar4;
            t9x.f(eiyVar, mm40VarD0, d9zVar2.o, ibzVar, fetVar, 0);
        } else {
            d9zVar2 = d9zVar;
            z3 = z;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            final d9z d9zVar5 = d9zVar2;
            final boolean z9 = z3;
            yfe0VarU.d = new Function2() { // from class: a.l8z
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iL = x8x.L(i | 1);
                    int iL2 = x8x.L(i2);
                    h8x.h(mm40Var, d9zVar5, tgvVar, hh80Var, z9, qkqVar, z2, vf80Var, sw3Var, ow3Var, function1, (fet) obj, iL, iL2);
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final void i(dy00 dy00Var, Function1 function1, fet fetVar, int i) {
        dy00Var.getClass();
        function1.getClass();
        fetVar.g0(1284402554);
        int i2 = (fetVar.g(dy00Var) ? 4 : 2) | i | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(s5x0.N(jm40.b, 0.0f, 8.0f, 0.0f, 0.0f, 13), 60.0f);
            String str = dy00Var.f6871a;
            zfn zfnVar = zaq0.b;
            rqm rqmVar = new rqm((vui0) new tui0(str, new y3d(((ThemeColors) fetVar.k(zfnVar)).getWarning())), (pui0) new nui0(Integer.valueOf(R.drawable.ic_glyph_log_out), null, new m0x(R.drawable.ic_glyph_log_out, null, 6), new y3d(((ThemeColors) fetVar.k(zfnVar)).getWarning()), null, new pc5(new y3d(((ThemeColors) fetVar.k(zfnVar)).getWarningTint())), 0.0f, 210), (pvi0) null, (d4d) null, (tvi0) null, (wui0) null, false, (e900) null, 508);
            byte b = 14;
            boolean z = ((i2 & 112) == 32) | ((i2 & 14) == 4);
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new mbz(function1, dy00Var, b);
                fetVar.o0(objP);
            }
            obc.q(mm40VarE, rqmVar, false, null, (Function0) objP, null, null, null, fetVar, 0, 236);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new r7y(dy00Var, function1, i, (byte) 27);
        }
    }

    public static final void j(mm40 mm40Var, zgl0 zgl0Var, Function0 function0, fet fetVar, int i) {
        int i2;
        fetVar.g0(-1874161998);
        if ((i & 6) == 0) {
            i2 = i | (fetVar.g(mm40Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        byte b = 16;
        int i3 = i2 | (fetVar.g(zgl0Var) ? 32 : 16) | (fetVar.i(function0) ? 256 : 128);
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            int i4 = i3 >> 3;
            boolean z = (((i4 & 14) ^ 6) > 4 && fetVar.g(zgl0Var)) || (i4 & 6) == 4;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                pz40 pz40Var = s6t0.f31722a;
                objP = new t0q(s6t0.b().f33626a.getBackgroundContent(), s6t0.b().f33626a.getSecondary());
                fetVar.o0(objP);
            }
            t0q t0qVar = (t0q) objP;
            k(mm40Var, t0qVar.f33131a, function0, u1c.M(-1928587157, new rqc0(t0qVar, b), fetVar), fetVar, (i3 & 896) | (i3 & 14) | 3072);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new l51((Object) mm40Var, (Object) zgl0Var, (Object) function0, i, (byte) 16);
        }
    }

    public static final void k(mm40 mm40Var, long j, Function0 function0, ugd ugdVar, fet fetVar, int i) {
        int i2;
        fetVar.g0(-544750750);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.f(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(ugdVar) ? 2048 : 1024;
        }
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = dw9.j(fetVar);
            }
            gy40 gy40Var = (gy40) objP;
            boolean z = (i2 & 896) == 256;
            Object objP2 = fetVar.P();
            if (z || objP2 == cl5Var) {
                objP2 = new l3c0(function0, (byte) 20);
                fetVar.o0(objP2);
            }
            mm40 mm40VarW = y860.W(jm40.b, gy40Var, null, false, null, (Function0) objP2, 28);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(o7k0.e(mm40VarW, 40.0f), 0.0f, 8.0f, 1);
            zcl zclVar2 = qmk.e;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarE = i120.Q(mm40VarL, j, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)).e(mm40Var);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
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
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            ua80.p(((i2 >> 6) & 112) | 6, ugdVar, jr8.f16991a, fetVar, true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ihl0(mm40Var, j, function0, ugdVar, i, (byte) 0);
        }
    }

    public static final void l(mm40 mm40Var, j5a0 j5a0Var, j5a0 j5a0Var2, w6n w6nVar, Function2 function2, fet fetVar, int i) {
        w6nVar.getClass();
        if ((i & 1) != 0) {
            mm40Var = jm40.b;
        }
        obc.d(bmd.n.a(k6z.f17794a), u1c.M(-363229961, new ajw((Object) mm40Var, (Object) j5a0Var, (Object) j5a0Var2, (Object) w6nVar, (Object) function2, (byte) 15), fetVar), fetVar, 56);
    }

    public static final void m(Function1 function1, g4k g4kVar, mm40 mm40Var, fet fetVar, int i) {
        function1.getClass();
        g4kVar.getClass();
        fetVar.g0(455166578);
        int i2 = i | (fetVar.i(function1) ? 4 : 2) | (fetVar.g(g4kVar) ? 32 : 16) | (fetVar.g(mm40Var) ? 256 : 128);
        byte b = 1;
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = n0j0.f22700a;
                fetVar.o0(objP);
            }
            xdr xdrVar = (xdr) ((jhy) objP);
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = new wvi0((byte) 12);
                fetVar.o0(objP2);
            }
            Function1 function2 = (Function1) objP2;
            boolean z = ((i2 & 14) == 4) | ((i2 & 112) == 32);
            Object objP3 = fetVar.P();
            if (z || objP3 == cl5Var) {
                objP3 = new ib(function1, g4kVar, b);
                fetVar.o0(objP3);
            }
            y860.g(xdrVar, mm40Var, function2, null, (Function1) objP3, fetVar, ((i2 >> 3) & 112) | 390, 8);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new fzi0(function1, (hej0) g4kVar, mm40Var, i, (byte) 3);
        }
    }

    public static final void n(f2l0 f2l0Var, mm40 mm40Var, fet fetVar, int i) {
        float f;
        y9q0 y9q0Var;
        int i2;
        fet fetVar2 = fetVar;
        f2l0Var.getClass();
        fetVar2.g0(1633830060);
        int i3 = i | (fetVar2.g(f2l0Var) ? 4 : 2) | (fetVar2.g(mm40Var) ? 32 : 16);
        if (fetVar2.U(i3 & 1, (i3 & 19) != 18)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            boolean z = f2l0Var instanceof d2l0;
            if (z || (f2l0Var instanceof c2l0)) {
                zcl zclVar = qmk.f28987a;
                f = 40.0f;
            } else if ((f2l0Var instanceof b2l0) || (f2l0Var instanceof a2l0)) {
                zcl zclVar2 = qmk.f28987a;
                f = 48.0f;
            } else if ((f2l0Var instanceof z1l0) || (f2l0Var instanceof y1l0)) {
                zcl zclVar3 = qmk.f28987a;
                f = 64.0f;
            } else if (!(f2l0Var instanceof e2l0)) {
                t9f.b();
                return;
            } else {
                zcl zclVar4 = qmk.f28987a;
                f = 66.0f;
            }
            mm40 mm40VarL = s5x0.L(o7k0.g(mm40VarD, f, 0.0f, 2), 8.0f, 0.0f, 2);
            x5d x5dVarA = w5d.a(new qw3(2.0f, false, new gne(gqw0.k, (byte) 11)), gqw0.m, fetVar2, 0);
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
            String strA = f2l0Var.a();
            long jB = f2l0Var.b();
            if (z || (f2l0Var instanceof c2l0) || (f2l0Var instanceof b2l0) || (f2l0Var instanceof a2l0) || (f2l0Var instanceof e2l0)) {
                y9q0Var = new y9q0(0L, qmk.r, null, j1t0.c, 0L, null, 0, 0, qmk.F, 16646109);
            } else {
                if (!(f2l0Var instanceof y1l0) && !(f2l0Var instanceof z1l0)) {
                    t9f.b();
                    return;
                }
                y9q0Var = new y9q0(0L, qmk.r, null, j1t0.b, 0L, null, 0, 0, qmk.F, 16646109);
            }
            y9q0 y9q0Var2 = y9q0Var;
            if (z) {
                i2 = 1;
            } else if ((f2l0Var instanceof b2l0) || (f2l0Var instanceof z1l0)) {
                i2 = 2;
            } else {
                if (!(f2l0Var instanceof c2l0) && !(f2l0Var instanceof a2l0) && !(f2l0Var instanceof y1l0) && !(f2l0Var instanceof e2l0)) {
                    t9f.b();
                    return;
                }
                i2 = 3;
            }
            v8q0.a(strA, o2e.e0(jm40.b, "MIDDLE_CELL_TEXT"), jB, null, 0L, null, null, null, 0L, null, 0L, 2, false, i2, 0, null, y9q0Var2, fetVar, 48, 384, 110584);
            fetVar2 = fetVar;
            if (f2l0Var instanceof y1l0) {
                fetVar2.e0(-1941414465);
                p(0, null, fetVar2, null, ((y1l0) f2l0Var).c);
                fetVar2.r(false);
            } else if (f2l0Var instanceof z1l0) {
                fetVar2.e0(-1941156545);
                z1l0 z1l0Var = (z1l0) f2l0Var;
                p(0, z1l0Var.d, fetVar2, null, z1l0Var.c);
                fetVar2.r(false);
            } else {
                fetVar2.e0(75936410);
                fetVar2.r(false);
            }
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new a5k0(f2l0Var, mm40Var, i, (byte) 13);
        }
    }

    /* JADX WARN: Code duplicated, block: B:57:0x0193  */
    /* JADX WARN: Code duplicated, block: B:58:0x0195  */
    /* JADX WARN: Code duplicated, block: B:62:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:65:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:66:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:70:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:73:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:74:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:78:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:82:0x01ea  */
    public static final void o(l7m0 l7m0Var, Function1 function1, fet fetVar, int i) {
        long secondary;
        long jM123getWhite0d7_KjU;
        boolean z;
        boolean z2;
        int i2;
        boolean z3;
        Object objP;
        boolean z4;
        Object objP2;
        boolean z5;
        Object objP3;
        boolean zI;
        Object objP4;
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(1872820883);
        int i3 = (fetVar.g(l7m0Var) ? 4 : 2) | i | (fetVar.i(function1) ? 32 : 16);
        byte b = 15;
        if (fetVar.U(i3 & 1, (i3 & 19) != 18)) {
            vhh0 vhh0Var = ((q1m0) l7m0Var.getValue()).b().c;
            Pair pairK = g7x.K(vhh0Var);
            String str = (String) pairK.f46059a;
            String str2 = (String) pairK.b;
            if (vhh0Var.equals(lhh0.f20055a)) {
                fetVar.e0(1582071482);
                secondary = ((StaticColors) fetVar.k(m8m0.f21378a)).m123getWhite0d7_KjU();
                fetVar.r(false);
            } else if (vhh0Var.equals(mhh0.f21794a)) {
                fetVar.e0(1582158716);
                secondary = ((ThemeColors) fetVar.k(zaq0.b)).getSecondary();
                fetVar.r(false);
            } else if (vhh0Var instanceof rhh0) {
                fetVar.e0(1582253948);
                secondary = ((ThemeColors) fetVar.k(zaq0.b)).getSecondary();
                fetVar.r(false);
            } else {
                fetVar.e0(189590142);
                fetVar.r(false);
                secondary = y3d.g;
            }
            long j = secondary;
            int iOrdinal = ((q1m0) l7m0Var.getValue()).b().f43575a.a().ordinal();
            if (iOrdinal == 0 || iOrdinal == 1) {
                fetVar.e0(189597752);
                jM123getWhite0d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m123getWhite0d7_KjU();
                fetVar.r(false);
            } else {
                if (iOrdinal != 2) {
                    throw b1j.f(189591785, fetVar, false);
                }
                fetVar.e0(189599932);
                jM123getWhite0d7_KjU = ((ThemeColors) fetVar.k(zaq0.b)).getSecondary();
                fetVar.r(false);
            }
            long j2 = jM123getWhite0d7_KjU;
            wpq wpqVar = (wpq) fetVar.k(bmd.i);
            gmm dmmVar = ((vhh0Var instanceof ihh0) || (vhh0Var instanceof mhh0) || (vhh0Var instanceof lhh0)) ? new dmm(new ta50(new wkm(0, R.drawable.ic_glyph_search, true, ra50.f30118a, j2))) : fmm.f9790a;
            boolean zY = g7x.Y(vhh0Var);
            if (vhh0Var instanceof shh0) {
                z2 = ((shh0) vhh0Var).c;
            } else {
                if (vhh0Var instanceof rhh0) {
                    z2 = ((rhh0) vhh0Var).c;
                } else {
                    z = false;
                }
                f9m0 f9m0Var = new f9m0(R.string.stage_net, dmmVar, j, zY, z, str, str2, false, 128);
                zdm0 zdm0Var = ((q1m0) l7m0Var.getValue()).b().f43575a;
                j9m0 j9m0Var = ((q1m0) l7m0Var.getValue()).b().b;
                boolean zA = ((q1m0) l7m0Var.getValue()).a();
                i2 = i3 & 112;
                if (i2 == 32) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                objP = fetVar.P();
                Object obj = ukd.f35823a;
                if (z3 || objP == obj) {
                    objP = new yhl0(function1, b);
                    fetVar.o0(objP);
                }
                Function0 function0 = (Function0) objP;
                if (i2 == 32) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                objP2 = fetVar.P();
                if (z4 || objP2 == obj) {
                    objP2 = new elk0(function1, (byte) 20);
                    fetVar.o0(objP2);
                }
                Function1 function2 = (Function1) objP2;
                if (i2 == 32) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                objP3 = fetVar.P();
                if (z5 || objP3 == obj) {
                    objP3 = new elk0(function1, (byte) 21);
                    fetVar.o0(objP3);
                }
                Function1 function3 = (Function1) objP3;
                zI = fetVar.i(wpqVar);
                objP4 = fetVar.P();
                if (zI || objP4 == obj) {
                    objP4 = new bz20(wpqVar, (byte) 2);
                    fetVar.o0(objP4);
                }
                ffb0.E(null, f9m0Var, zdm0Var, j9m0Var, zA, function0, function2, function3, (Function0) objP4, u1c.M(-745562372, new cw0(l7m0Var, b), fetVar), fetVar, 805306368);
            }
            z = z2;
            f9m0 f9m0Var2 = new f9m0(R.string.stage_net, dmmVar, j, zY, z, str, str2, false, 128);
            zdm0 zdm0Var2 = ((q1m0) l7m0Var.getValue()).b().f43575a;
            j9m0 j9m0Var2 = ((q1m0) l7m0Var.getValue()).b().b;
            boolean zA2 = ((q1m0) l7m0Var.getValue()).a();
            i2 = i3 & 112;
            if (i2 == 32) {
                z3 = true;
            } else {
                z3 = false;
            }
            objP = fetVar.P();
            Object obj2 = ukd.f35823a;
            if (z3) {
                objP = new yhl0(function1, b);
                fetVar.o0(objP);
            } else {
                objP = new yhl0(function1, b);
                fetVar.o0(objP);
            }
            Function0 function4 = (Function0) objP;
            if (i2 == 32) {
                z4 = true;
            } else {
                z4 = false;
            }
            objP2 = fetVar.P();
            if (z4) {
                objP2 = new elk0(function1, (byte) 20);
                fetVar.o0(objP2);
            } else {
                objP2 = new elk0(function1, (byte) 20);
                fetVar.o0(objP2);
            }
            Function1 function5 = (Function1) objP2;
            if (i2 == 32) {
                z5 = true;
            } else {
                z5 = false;
            }
            objP3 = fetVar.P();
            if (z5) {
                objP3 = new elk0(function1, (byte) 21);
                fetVar.o0(objP3);
            } else {
                objP3 = new elk0(function1, (byte) 21);
                fetVar.o0(objP3);
            }
            Function1 function6 = (Function1) objP3;
            zI = fetVar.i(wpqVar);
            objP4 = fetVar.P();
            if (zI) {
                objP4 = new bz20(wpqVar, (byte) 2);
                fetVar.o0(objP4);
            } else {
                objP4 = new bz20(wpqVar, (byte) 2);
                fetVar.o0(objP4);
            }
            ffb0.E(null, f9m0Var2, zdm0Var2, j9m0Var2, zA2, function4, function5, function6, (Function0) objP4, u1c.M(-745562372, new cw0(l7m0Var, b), fetVar), fetVar, 805306368);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new u7i0(l7m0Var, function1, i, b);
        }
    }

    public static final void p(int i, y3d y3dVar, fet fetVar, mm40 mm40Var, String str) {
        mm40 mm40Var2;
        long secondary;
        fetVar.g0(2126781368);
        int i2 = (fetVar.g(str) ? 4 : 2) | i | (fetVar.g(y3dVar) ? 32 : 16) | 384;
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            byte b = 14;
            if (str == null || str.length() == 0) {
                yfe0 yfe0VarU = fetVar.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new a5k0(str, y3dVar, i, b);
                    return;
                }
                return;
            }
            y9q0 y9q0Var = new y9q0(0L, qmk.q, null, j1t0.c, 0L, null, 0, 0, qmk.D, 16646109);
            if (y3dVar == null) {
                fetVar.e0(-567528991);
                secondary = ((ThemeColors) fetVar.k(zaq0.b)).getSecondary();
                fetVar.r(false);
            } else {
                fetVar.e0(-567530076);
                fetVar.r(false);
                secondary = y3dVar.f41946a;
            }
            jm40 jm40Var = jm40.b;
            v8q0.a(str, jm40Var, secondary, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, y9q0Var, fetVar, (i2 & 14) | 48, 24960, 110584);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU2 = fetVar.u();
        if (yfe0VarU2 != null) {
            yfe0VarU2.d = new aak0(str, y3dVar, mm40Var2, i, (byte) 10);
        }
    }

    public static final void q(cp cpVar) {
        yfu0 yfu0Var = cpVar.u;
        ((q2k) yfu0Var).c.setVisibility(((n5c0) cpVar.u()).b ? 0 : 8);
        ((q2k) yfu0Var).d.setVisibility(((n5c0) cpVar.u()).b ? 0 : 8);
    }

    public static final ank0 r(final boolean z, final double d, final String str, final double d2) {
        ArrayList arrayListU = ohs0.u(str);
        Function1 function1 = new Function1() { // from class: a.x400
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                bnk0 bnk0Var = (bnk0) obj;
                bnk0Var.getClass();
                boolean z2 = z;
                double d3 = d;
                String str2 = str;
                if (z2) {
                    int i = cy7.f5159a;
                    pn40 pn40Var = pn40.f27267a;
                    pzw.E(bnk0Var, cy7.e(pn40.d(d3, str2, p3u0.c)), 0, 0, 0, R.attr.uikitSecondary, 30);
                    pzw.E(bnk0Var, " – ", 0, 0, 0, R.attr.uikitSecondary, 30);
                    pzw.E(bnk0Var, "∞", 0, 0, 0, R.attr.uikitSecondary, 30);
                } else {
                    int i2 = cy7.f5159a;
                    pn40 pn40Var2 = pn40.f27267a;
                    p3u0 p3u0Var = p3u0.c;
                    pzw.E(bnk0Var, cy7.e(pn40.d(d3, str2, p3u0Var)), 0, 0, 0, R.attr.uikitSecondary, 30);
                    pzw.E(bnk0Var, " – ", 0, 0, 0, R.attr.uikitSecondary, 30);
                    pzw.E(bnk0Var, cy7.e(pn40.d(d2, str2, p3u0Var)), 0, 0, 0, R.attr.uikitSecondary, 30);
                }
                return Unit.f46060a;
            }
        };
        bnk0 bnk0Var = new bnk0();
        function1.invoke(bnk0Var);
        return w6x.l(arrayListU, bnk0Var.f2888a, arrayListU);
    }

    public static final ank0 s(ctf0 ctf0Var, double d, String str) {
        ctf0Var.getClass();
        str.getClass();
        ArrayList arrayList = new ArrayList();
        bnk0 bnk0Var = new bnk0();
        int i = cy7.f5159a;
        pn40 pn40Var = pn40.f27267a;
        pzw.E(bnk0Var, ctf0Var.k(R.string.max_sum_v2, cy7.e(pn40.d(d, str, p3u0.c))), 0, R.color.static_red, 0, 0, 54);
        return w6x.l(arrayList, bnk0Var.f2888a, arrayList);
    }

    public static final lc00 t(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        bj10 bj10Var = bj10.f2683a;
        u4t u4tVar = u4t.f35068a;
        int i = 0;
        pbj pbjVar = pbj.f26710a;
        if (z8 && z && z7) {
            lc00 lc00VarB = kotlin.collections.a.b();
            lc00VarB.add(new me40(pbjVar));
            if (z4) {
                lc00VarB.add(new te40(bj10Var, pbjVar));
                lc00VarB.add(new bf40(pbjVar));
            }
            while (i < 5) {
                lc00VarB.add(new qe40(u4tVar, pbjVar));
                i++;
            }
            return kotlin.collections.a.a(lc00VarB);
        }
        aj10 aj10Var = aj10.f952a;
        if (z8 && z7) {
            lc00 lc00VarB2 = kotlin.collections.a.b();
            lc00VarB2.add(new me40(pbjVar));
            if (z4) {
                lc00VarB2.add(new te40(aj10Var, pbjVar));
                lc00VarB2.add(new bf40(pbjVar));
            }
            while (i < 5) {
                lc00VarB2.add(new qe40(u4tVar, pbjVar));
                i++;
            }
            return kotlin.collections.a.a(lc00VarB2);
        }
        if (z8 && !z7) {
            lc00 lc00VarB3 = kotlin.collections.a.b();
            lc00VarB3.add(new me40(pbjVar));
            while (i < 5) {
                lc00VarB3.add(new qe40(u4tVar, pbjVar));
                i++;
            }
            return kotlin.collections.a.a(lc00VarB3);
        }
        if (z2 && !z7) {
            lc00 lc00VarB4 = kotlin.collections.a.b();
            lc00VarB4.add(new ze40(pbjVar));
            lc00VarB4.add(new ye40(pbjVar));
            if (z5) {
                lc00VarB4.add(new af40(pbjVar));
            }
            lc00VarB4.add(new re40(pbjVar));
            lc00VarB4.add(new xe40(pbjVar));
            lc00VarB4.add(new qe40(new l4t(8), pbjVar));
            lc00VarB4.add(new qe40(new i4t(8), pbjVar));
            if (z6) {
                lc00VarB4.add(new se40(pbjVar));
            }
            lc00VarB4.add(new qe40(new o4t(8), pbjVar));
            return kotlin.collections.a.a(lc00VarB4);
        }
        if (!z7) {
            lc00 lc00VarB5 = kotlin.collections.a.b();
            lc00VarB5.add(new me40(pbjVar));
            lc00VarB5.add(new qe40(new l4t(8), pbjVar));
            lc00VarB5.add(new qe40(new i4t(8), pbjVar));
            return kotlin.collections.a.a(lc00VarB5);
        }
        if (z) {
            lc00 lc00VarB6 = kotlin.collections.a.b();
            if (z4) {
                lc00VarB6.add(new te40(bj10Var, pbjVar));
                lc00VarB6.add(new bf40(pbjVar));
            }
            lc00VarB6.add(new we40(pbjVar));
            lc00VarB6.add(new qe40(new v4t(30), pbjVar));
            lc00VarB6.add(new qe40(new p4t(30), pbjVar));
            if (z5) {
                lc00VarB6.add(new cf40(pbjVar));
            }
            lc00VarB6.add(new qe40(new s4t(30), pbjVar));
            lc00VarB6.add(new re40(pbjVar));
            lc00VarB6.add(new qe40(new l4t(30), pbjVar));
            lc00VarB6.add(new qe40(new i4t(30), pbjVar));
            lc00VarB6.add(new qe40(new o4t(30), pbjVar));
            return kotlin.collections.a.a(lc00VarB6);
        }
        lc00 lc00VarB7 = kotlin.collections.a.b();
        lc00VarB7.add(new me40(pbjVar));
        if (z3) {
            lc00VarB7.add(new oe40(pbjVar));
            lc00VarB7.add(new qe40(new v4t(8), pbjVar));
            if (z4) {
                lc00VarB7.add(new te40(aj10Var, pbjVar));
                lc00VarB7.add(new bf40(pbjVar));
            }
        } else {
            if (z4) {
                lc00VarB7.add(new te40(aj10Var, pbjVar));
                lc00VarB7.add(new bf40(pbjVar));
            }
            lc00VarB7.add(new qe40(new v4t(8), pbjVar));
        }
        lc00VarB7.add(new qe40(new p4t(8), pbjVar));
        lc00VarB7.add(new qe40(new s4t(8), pbjVar));
        lc00VarB7.add(new qe40(new l4t(8), pbjVar));
        lc00VarB7.add(new qe40(new i4t(8), pbjVar));
        return kotlin.collections.a.a(lc00VarB7);
    }

    public static final ank0 u(ctf0 ctf0Var, double d, String str) {
        ctf0Var.getClass();
        str.getClass();
        ArrayList arrayList = new ArrayList();
        bnk0 bnk0Var = new bnk0();
        int i = cy7.f5159a;
        pn40 pn40Var = pn40.f27267a;
        pzw.E(bnk0Var, ctf0Var.k(R.string.min_sum_v2, cy7.e(pn40.d(d, str, p3u0.c))), 0, R.color.static_red, 0, 0, 54);
        return w6x.l(arrayList, bnk0Var.f2888a, arrayList);
    }

    public static final Integer v(String str, Map map, Map map2) {
        if (str != null) {
            if (StringsKt.W(str)) {
                str = null;
            }
            if (str != null) {
                Integer num = (Integer) map.get(str);
                return num == null ? (Integer) map2.get(str) : num;
            }
        }
        return null;
    }

    public static void w(int i, Object[] objArr) {
        for (int i2 = 0; i2 < i; i2++) {
            if (objArr[i2] == null) {
                hny.u(twn.m(i2, "at index "));
                return;
            }
        }
    }

    public static final void x(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            c99.s(i != i2 ? ohs0.m("Both size ", i, " and step ", " must be greater than zero.", i2) : ua80.e(i, "size ", " must be greater than zero."));
        }
    }

    public static final d0b0 y(d0b0 d0b0Var, boolean z, boolean z2, List list) {
        d0b0Var.getClass();
        return d0b0.a(d0b0Var, new xza0(list, z, z2), null, null, null, null, false, false, false, false, null, false, 4094);
    }

    public static d0b0 z(d0b0 d0b0Var, boolean z, boolean z2) {
        return y(d0b0Var, z, z2, d0b0Var.f5260a.c);
    }
}
