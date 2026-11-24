package a;

import android.javax.sip.message.Response;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes5.dex */
public final class xa9 implements v6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f40542a = 1;
    public final n0o0 b;
    public final n0o0 c;
    public final n0o0 d;
    public final n0o0 e;
    public final n0o0 f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;
    public final Object k;
    public final Object l;

    public xa9(ctf0 ctf0Var, ntu ntuVar, g2v g2vVar, c270 c270Var) {
        ctf0Var.getClass();
        this.g = ctf0Var;
        this.h = ntuVar;
        this.b = bkb.H(Boolean.valueOf(c270Var.e));
        this.c = bkb.H(Boolean.valueOf(c270Var.d));
        this.d = bkb.H(c270Var.f);
        this.e = bkb.H(c270Var.g);
        this.f = bkb.H(c270Var.h);
        pz40 pz40Var = s6t0.f31722a;
        this.i = new imm(new ilm(s6t0.b().f33626a.getSecondary()), new plm(ctf0Var.b.a(R.string.bonuses, Arrays.copyOf(new Object[0], 0)), s6t0.b().f33626a.getSecondary(), fa50.f9191a), fmm.f9790a, s6t0.b().f33626a.getBackgroundContent(), false, null);
        this.j = new v170(g2v.b(g2vVar, pb10.g, null, null, 0, 0, R.string.data_retrieval_error, 0, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE));
        this.k = new x170(g2v.b(g2vVar, pb10.r1, pdm.b, null, R.drawable.ic_glyph_circle_technical_works, 0, R.string.games_section_technical_works_descr, 0, R.string.continue_action, 0L, 0L, 852));
        z170 z170Var = z170.b;
        a270 a270Var = new a270(z170Var);
        z170 z170Var2 = z170.f43605a;
        List listJ = q3d.j(a270Var, new a270(z170Var2), new a270(z170Var), new a270(z170Var2), new a270(z170Var), new a270(z170Var2));
        vqm vqmVar = vqm.f37862a;
        this.l = new w170(listJ);
    }

    public fee a() {
        return (fee) this.e.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0143 A[PHI: r4
  0x0143: PHI (r4v29 java.lang.String) = (r4v27 java.lang.String), (r4v36 java.lang.String) binds: [B:56:0x0157, B:49:0x0140] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // a.v6t0
    public final Object invoke(Object obj) {
        char c;
        tkb tkbVar;
        List list;
        List list2;
        ijl ijlVar;
        String strC;
        String str;
        long textPrimary;
        int iOrdinal;
        byte b = this.f40542a;
        Object obj2 = this.k;
        Object obj3 = this.j;
        n0o0 n0o0Var = this.e;
        Object obj4 = this.i;
        Object obj5 = this.h;
        Object obj6 = this.l;
        Object obj7 = this.g;
        n0o0 n0o0Var2 = this.f;
        n0o0 n0o0Var3 = this.d;
        n0o0 n0o0Var4 = this.c;
        n0o0 n0o0Var5 = this.b;
        switch (b) {
            case 0:
                pa9 pa9Var = (pa9) obj;
                pa9Var.getClass();
                ((fee) n0o0Var5.getValue()).d(pa9Var.e);
                ((fee) n0o0Var4.getValue()).d(pa9Var.f);
                ((fee) n0o0Var3.getValue()).d(pa9Var.b);
                fee feeVar = (fee) n0o0Var.getValue();
                List list3 = pa9Var.f26644a;
                feeVar.d(list3);
                ((fee) n0o0Var2.getValue()).d(pa9Var.h);
                n0o0 n0o0Var6 = (n0o0) obj7;
                ((fee) n0o0Var6.getValue()).d(pa9Var.c);
                n0o0 n0o0Var7 = (n0o0) obj5;
                fee feeVar2 = (fee) n0o0Var7.getValue();
                wdn wdnVar = pa9Var.g;
                feeVar2.d(wdnVar);
                n0o0 n0o0Var8 = (n0o0) obj4;
                ((fee) n0o0Var8.getValue()).d(wdnVar);
                if (pa9Var.i) {
                    return new ra9((imm) ((fee) n0o0Var6.getValue()).b(), (i4) obj6);
                }
                if (pa9Var.d) {
                    return new ua9((mdm) obj3, (imm) ((fee) n0o0Var6.getValue()).b());
                }
                if (list3 == null || list3.isEmpty()) {
                    return new ta9((mdm) obj2, (imm) ((fee) n0o0Var6.getValue()).b());
                }
                return new sa9((imm) ((fee) n0o0Var6.getValue()).b(), (i4) obj6, wdnVar.f38981a ? 1 : 0, (a4x) ((fee) n0o0Var7.getValue()).b(), ((Boolean) ((fee) n0o0Var8.getValue()).b()).booleanValue());
            case 1:
                n0o0 n0o0Var9 = (n0o0) obj5;
                n0o0 n0o0Var10 = (n0o0) obj7;
                alb albVar = (alb) obj;
                albVar.getClass();
                ((fee) n0o0Var5.getValue()).d(albVar);
                zbk zbkVar = ((fee) n0o0Var5.getValue()).e;
                g2v g2vVar = (g2v) obj3;
                jkb jkbVar = albVar.k;
                j0g0 j0g0Var = albVar.m;
                j0g0 j0g0Var2 = albVar.l;
                if (jkbVar != null || albVar.j) {
                    if (jkbVar != null) {
                        Object obj8 = jkbVar.b;
                        Object obj9 = jkbVar.c;
                        e0g0 e0g0Var = j0g0.b;
                        c = 2;
                        boolean z = obj8 instanceof g0g0;
                        if (!z || !(obj9 instanceof g0g0)) {
                            if (z) {
                                obj8 = null;
                            }
                            ubb ubbVar = (ubb) obj8;
                            if (ubbVar == null || (list2 = ubbVar.f35371a) == null || !list2.isEmpty() || !(obj9 instanceof g0g0)) {
                                if (z) {
                                    if (obj9 instanceof g0g0) {
                                        obj9 = null;
                                    }
                                    ubb ubbVar2 = (ubb) obj9;
                                    if (ubbVar2 == null || (list = ubbVar2.f35371a) == null || !list.isEmpty()) {
                                    }
                                }
                            }
                        }
                        tkbVar = new tkb(new pkb(yyw.N(g2vVar, ldm.f19857a)));
                    } else {
                        c = 2;
                    }
                    okb okbVar = okb.f25399a;
                    if (jkbVar == null || j0g0Var2 == null || j0g0Var == null) {
                        alb albVar2 = (alb) obj4;
                        v5l0 v5l0Var = albVar2.e.g.y;
                        boolean z2 = albVar2.h;
                        akb akbVarS = zjb.s(v5l0Var, true, z2);
                        akb akbVarS2 = zjb.s(v5l0Var, false, z2);
                        ikb ikbVar = new ikb("RESULT_SHIMMERS", new ijm(), dyb.g0(hkb.G(v5l0Var), hkb.G(v5l0Var), hkb.G(v5l0Var)), z2);
                        p6t0[] p6t0VarArr = new p6t0[3];
                        p6t0VarArr[0] = akbVarS;
                        p6t0VarArr[1] = akbVarS2;
                        p6t0VarArr[c] = ikbVar;
                        tkbVar = new tkb(okbVar, dyb.g0(p6t0VarArr));
                    } else {
                        fee feeVar3 = (fee) n0o0Var4.getValue();
                        Object obj10 = jkbVar.b;
                        e0g0 e0g0Var2 = j0g0.b;
                        if (obj10 instanceof g0g0) {
                            obj10 = null;
                        }
                        feeVar3.d((ubb) obj10);
                        fee feeVar4 = (fee) n0o0Var3.getValue();
                        Object obj11 = jkbVar.c;
                        if (obj11 instanceof g0g0) {
                            obj11 = null;
                        }
                        feeVar4.d((ubb) obj11);
                        ((fee) n0o0Var2.getValue()).d(albVar.n);
                        fee feeVar5 = (fee) n0o0Var.getValue();
                        Object obj12 = j0g0Var2.f15681a;
                        if (obj12 instanceof g0g0) {
                            obj12 = null;
                        }
                        Object obj13 = (List) obj12;
                        if (obj13 == null) {
                            obj13 = iun.f15405a;
                        }
                        feeVar5.d(obj13);
                        fee feeVar6 = (fee) n0o0Var10.getValue();
                        Object obj14 = j0g0Var.f15681a;
                        if (obj14 instanceof g0g0) {
                            obj14 = null;
                        }
                        feeVar6.d((yvl0) obj14);
                        fee feeVar7 = (fee) n0o0Var9.getValue();
                        Object obj15 = jkbVar.d;
                        feeVar7.d((List) (obj15 instanceof g0g0 ? null : obj15));
                        lc00 lc00VarB = kotlin.collections.a.b();
                        p6t0 p6t0Var = (p6t0) ((fee) n0o0Var4.getValue()).b();
                        if (p6t0Var != null) {
                            lc00VarB.add(p6t0Var);
                        }
                        p6t0 p6t0Var2 = (p6t0) ((fee) n0o0Var3.getValue()).b();
                        if (p6t0Var2 != null) {
                            lc00VarB.add(p6t0Var2);
                        }
                        p6t0 p6t0Var3 = (p6t0) ((fee) n0o0Var.getValue()).b();
                        if (p6t0Var3 != null) {
                            lc00VarB.add(p6t0Var3);
                        }
                        p6t0 p6t0Var4 = (p6t0) ((fee) n0o0Var10.getValue()).b();
                        if (p6t0Var4 != null) {
                            lc00VarB.add(p6t0Var4);
                        }
                        p6t0 p6t0Var5 = (p6t0) ((fee) n0o0Var9.getValue()).b();
                        if (p6t0Var5 != null) {
                            lc00VarB.add(p6t0Var5);
                        }
                        lc00 lc00VarA = kotlin.collections.a.a(lc00VarB);
                        tkbVar = lc00VarA.isEmpty() ? new tkb(new pkb(yyw.M(g2vVar))) : new tkb(okbVar, dyb.o0(lc00VarA));
                    }
                } else {
                    tkbVar = new tkb(new pkb(yyw.N(g2vVar, ldm.f19857a)));
                }
                return new klb(zbkVar, tkbVar);
            case 2:
                w5j w5jVar = (w5j) obj;
                w5jVar.getClass();
                ((fee) n0o0Var3.getValue()).d(Boolean.valueOf(w5jVar.e));
                ((fee) n0o0Var4.getValue()).d(Integer.valueOf(w5jVar.f38588a));
                ((fee) n0o0Var.getValue()).d(w5jVar.f);
                ((fee) n0o0Var5.getValue()).d(w5jVar.b);
                ((fee) n0o0Var2.getValue()).d(Boolean.valueOf(w5jVar.c));
                ((fee) ((n0o0) obj7).getValue()).d(Boolean.valueOf(w5jVar.d));
                ((fee) ((n0o0) obj5).getValue()).d(w5jVar.g);
                return new x5j((imm) obj2, (g4j) ((fee) ((n0o0) obj6).getValue()).b());
            case 3:
                n0o0 n0o0Var11 = (n0o0) obj6;
                n0o0 n0o0Var12 = (n0o0) obj4;
                n0o0 n0o0Var13 = (n0o0) obj5;
                n0o0 n0o0Var14 = (n0o0) obj7;
                b820 b820Var = (b820) obj;
                b820Var.getClass();
                rvj0 rvj0Var = b820Var.d;
                gx4 gx4Var = b820Var.f;
                an5 an5Var = b820Var.c;
                boolean z3 = b820Var.l;
                fee feeVar8 = (fee) n0o0Var5.getValue();
                ly6 ly6Var = b820Var.f2138a;
                boolean z4 = b820Var.h;
                feeVar8.d(new iy6(ly6Var, z4));
                fee feeVar9 = (fee) n0o0Var4.getValue();
                fo7 fo7Var = b820Var.b;
                czc0 czc0Var = b820Var.e;
                feeVar9.d(new hwh0(fo7Var, czc0Var != null, gx4Var != null));
                ((fee) n0o0Var3.getValue()).d(new bf6(an5Var, z1x.I(b820Var), fo7Var, b820Var.l));
                ((fee) n0o0Var.getValue()).d(new wvj0(rvj0Var, an5Var.c.f, z3));
                ((fee) n0o0Var2.getValue()).d(new w6c0(czc0Var, z3));
                ((fee) n0o0Var14.getValue()).d(new mx4(gx4Var, an5Var.c.f, z3));
                ((fee) n0o0Var13.getValue()).d(new bnd0(rvj0Var.d, rvj0Var.e, fo7Var instanceof co7, z3));
                ((fee) n0o0Var12.getValue()).d(z1x.S(b820Var));
                ((fee) n0o0Var11.getValue()).d(Boolean.valueOf(z4));
                return new d820(ug20.f35603a, new gh00((s820) ((fee) n0o0Var5.getValue()).b(), (uwh0) ((fee) n0o0Var4.getValue()).b(), (ef6) ((fee) n0o0Var3.getValue()).b(), (zvj0) ((fee) n0o0Var.getValue()).b(), (z6c0) ((fee) n0o0Var2.getValue()).b(), (px4) ((fee) n0o0Var14.getValue()).b(), (yw00) ((fee) n0o0Var11.getValue()).b(), 1.0f, null, (qn8) ((fee) n0o0Var12.getValue()).b(), (lnd0) ((fee) n0o0Var13.getValue()).b()), null, null);
            default:
                c270 c270Var = (c270) obj;
                c270Var.getClass();
                ((fee) n0o0Var5.getValue()).d(Boolean.valueOf(c270Var.e));
                ((fee) n0o0Var4.getValue()).d(Boolean.valueOf(c270Var.d));
                ((fee) n0o0Var3.getValue()).d(c270Var.f);
                a().d(c270Var.g);
                ((fee) n0o0Var2.getValue()).d(c270Var.h);
                imm immVar = (imm) obj4;
                ctf0 ctf0Var = (ctf0) obj7;
                boolean z5 = ((k170) a().c()).f17507a;
                kg kgVar = ((k170) a().c()).b;
                if (kgVar == null || (iOrdinal = kgVar.ordinal()) == 0) {
                    ijlVar = ijl.f14880a;
                } else if (iOrdinal == 1) {
                    ijlVar = ijl.b;
                } else if (iOrdinal == 2) {
                    ijlVar = ijl.c;
                } else if (iOrdinal == 3) {
                    ijlVar = ijl.d;
                } else {
                    if (iOrdinal != 4) {
                        t9f.b();
                        return null;
                    }
                    ijlVar = ijl.e;
                }
                ql5 ql5Var = ((k170) a().c()).c;
                if (ql5Var != null) {
                    double d = ql5Var.b;
                    pn40 pn40Var = pn40.f27267a;
                    strC = pn40.c(d, p3u0.c);
                } else {
                    strC = null;
                }
                String strA = "";
                if (strC == null) {
                    strC = "";
                }
                ql5 ql5Var2 = ((k170) a().c()).c;
                String str2 = ql5Var2 != null ? ql5Var2.f : null;
                if (str2 == null) {
                    str2 = "";
                }
                lsm0 lsm0Var = ctf0Var.b;
                lsm0 lsm0Var2 = ctf0Var.b;
                String strA2 = lsm0Var.a(R.string.top_up, Arrays.copyOf(new Object[0], 0));
                if (((k170) a().c()).b == kg.SECONDARY) {
                    strA = lsm0Var2.a(R.string.all_balances, Arrays.copyOf(new Object[0], 0));
                } else {
                    ql5 ql5Var3 = ((k170) a().c()).c;
                    String str3 = ql5Var3 != null ? ql5Var3.j : null;
                    if (str3 == null || str3.length() == 0) {
                        ql5 ql5Var4 = ((k170) a().c()).c;
                        str = ql5Var4 != null ? ql5Var4.k : null;
                        if (str != null) {
                            strA = str;
                        }
                    } else {
                        ql5 ql5Var5 = ((k170) a().c()).c;
                        str = ql5Var5 != null ? ql5Var5.j : null;
                        if (str != null) {
                            strA = str;
                        }
                    }
                }
                q070 q070Var = new q070(z5, ijlVar, new jjl(strC, str2, strA2, strA));
                y170 u170Var = (v170) obj3;
                pz40 pz40Var = s6t0.f31722a;
                if (((Boolean) ((fee) n0o0Var5.getValue()).c()).booleanValue()) {
                    u170Var = (w170) obj6;
                } else if (((fee) n0o0Var3.getValue()).c() == m170.c) {
                    u170Var = (x170) obj2;
                } else if (((fee) n0o0Var3.getValue()).c() != m170.b && !((Collection) ((fee) n0o0Var2.getValue()).c()).isEmpty()) {
                    Iterable<q170> iterable = (Iterable) ((fee) n0o0Var2.getValue()).c();
                    ArrayList arrayList = new ArrayList(r3d.q(iterable, 10));
                    for (q170 q170Var : iterable) {
                        d270 d270Var = q170Var.f27939a;
                        int i = d270Var.f5344a;
                        String strA3 = q170Var.c;
                        if (strA3.length() == 0) {
                            strA3 = d270Var == d270.BONUS_INFO ? lsm0Var2.a(R.string.bonuses_info_name, Arrays.copyOf(new Object[0], 0)) : lsm0Var2.a(R.string.empty_str, Arrays.copyOf(new Object[0], 0));
                        }
                        String str4 = strA3;
                        d270 d270Var2 = d270.LUCKY_WHEEL;
                        if (d270Var == d270Var2) {
                            pz40 pz40Var2 = s6t0.f31722a;
                            textPrimary = StaticColors.INSTANCE.m123getWhite0d7_KjU();
                        } else {
                            pz40 pz40Var3 = s6t0.f31722a;
                            textPrimary = s6t0.b().f33626a.getTextPrimary();
                        }
                        long j = textPrimary;
                        String strA4 = q170Var.d;
                        if (strA4.length() == 0) {
                            strA4 = d270Var == d270.BONUS_INFO ? lsm0Var2.a(R.string.bonuses_info_description, Arrays.copyOf(new Object[0], 0)) : lsm0Var2.a(R.string.empty_str, Arrays.copyOf(new Object[0], 0));
                        }
                        arrayList.add(new r170(i, new gy30(new ux30(j, d270Var == d270Var2 ? StaticColors.INSTANCE.m131getWhite800d7_KjU() : s6t0.b().f33626a.getSecondary(), str4, strA4), new rx30(new m0x(s0x.M(d270Var), null, 6), d270Var == d270Var2 ? StaticColors.INSTANCE.m123getWhite0d7_KjU() : s6t0.b().f33626a.getPrimary(), null, s0x.M(d270Var), 0L, new pc5(new y3d(d270Var == d270Var2 ? StaticColors.INSTANCE.m126getWhite200d7_KjU() : s6t0.b().f33626a.getBackground())), 436), d270Var == d270Var2 ? new zx30(new n0x(ohs0.n(((ntu) obj5).a(), "/static/img/ImgDefault/xGamesImg/LuckyWheelImg.webp")), 3) : ey30.f8608a, 0L, d270Var == d270Var2 ? q3d.j(new y3d(s6t0.b().f33626a.getPromoCardGradientStart()), new y3d(s6t0.b().f33626a.getPromoCardGradientEnd())) : iun.f15405a, null, 216), q170Var.b));
                    }
                    u170Var = new u170(arrayList);
                }
                return new e270(immVar, q070Var, u170Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0085  */
    public xa9(alb albVar, g2v g2vVar, ctf0 ctf0Var, y78 y78Var) {
        ubb ubbVar;
        ubb ubbVar2;
        Object obj;
        yvl0 yvl0Var;
        final byte b = 1;
        ctf0Var.getClass();
        this.i = albVar;
        this.j = g2vVar;
        this.k = ctf0Var;
        this.l = y78Var;
        final byte b2 = 0;
        this.b = maz.b(new yw9(albVar, new Function1(this) { // from class: a.llb
            public final /* synthetic */ xa9 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:160:0x0491  */
            /* JADX WARN: Code duplicated, block: B:161:0x0495  */
            /* JADX WARN: Code duplicated, block: B:163:0x0498  */
            /* JADX WARN: Code duplicated, block: B:165:0x049d  */
            /* JADX WARN: Code duplicated, block: B:169:0x04b6 A[LOOP:8: B:167:0x04b0->B:169:0x04b6, LOOP_END] */
            /* JADX WARN: Code duplicated, block: B:172:0x04ce  */
            /* JADX WARN: Code duplicated, block: B:173:0x04d1  */
            /* JADX WARN: Code duplicated, block: B:175:0x04d4  */
            /* JADX WARN: Code duplicated, block: B:176:0x04d6  */
            /* JADX WARN: Code duplicated, block: B:179:0x04db  */
            /* JADX WARN: Code duplicated, block: B:180:0x04e8  */
            /* JADX WARN: Code duplicated, block: B:182:0x04f0  */
            /* JADX WARN: Code duplicated, block: B:183:0x04f9  */
            /* JADX WARN: Code duplicated, block: B:185:0x04fd  */
            /* JADX WARN: Code duplicated, block: B:186:0x0506  */
            /* JADX WARN: Code duplicated, block: B:188:0x0509  */
            /* JADX WARN: Code duplicated, block: B:225:0x0634 A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:226:0x0636  */
            /* JADX WARN: Code duplicated, block: B:228:0x063c  */
            /* JADX WARN: Code duplicated, block: B:239:0x0658  */
            /* JADX WARN: Code duplicated, block: B:372:0x050c A[SYNTHETIC] */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r11v0 */
            /* JADX WARN: Type inference failed for: r11v27, types: [boolean, int] */
            /* JADX WARN: Type inference failed for: r11v33 */
            /* JADX WARN: Type inference failed for: r6v52, types: [int] */
            /* JADX WARN: Type inference failed for: r6v57 */
            /* JADX WARN: Type inference failed for: r6v61, types: [int] */
            /* JADX WARN: Type inference failed for: r6v65 */
            /* JADX WARN: Type inference failed for: r6v66 */
            /* JADX WARN: Type inference failed for: r9v50, types: [java.lang.CharSequence, java.lang.StringBuilder] */
            /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r10v18 java.lang.Object, still in use, count: 2, list:
                  (r10v18 java.lang.Object) from 0x0481: PHI (r10 I:??) = (r10v9 java.lang.Object), (r10v18 java.lang.Object) binds: [B:157:0x0480, B:374:0x0481] A[DONT_GENERATE, DONT_INLINE]
                  (r10v18 java.lang.Object) from 0x0475: CHECK_CAST (a.lok0) (r10v18 java.lang.Object)
                	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
                	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
                	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
                	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
                	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
                	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
                	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
                */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object r44) {
                /*
                    Method dump skipped, instruction units count: 2122
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: a.llb.invoke(java.lang.Object):java.lang.Object");
            }
        }, (byte) 20));
        jkb jkbVar = albVar.k;
        Object obj2 = null;
        if (jkbVar != null) {
            Object obj3 = jkbVar.b;
            ubb ubbVar3 = new ubb(iun.f15405a, "");
            e0g0 e0g0Var = j0g0.b;
            ubbVar = (ubb) (obj3 instanceof g0g0 ? ubbVar3 : obj3);
        } else {
            ubbVar = null;
        }
        this.c = maz.b(new yw9(ubbVar, new Function1(this) { // from class: a.llb
            public final /* synthetic */ xa9 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:160:0x0491  */
            /* JADX WARN: Code duplicated, block: B:161:0x0495  */
            /* JADX WARN: Code duplicated, block: B:163:0x0498  */
            /* JADX WARN: Code duplicated, block: B:165:0x049d  */
            /* JADX WARN: Code duplicated, block: B:169:0x04b6 A[LOOP:8: B:167:0x04b0->B:169:0x04b6, LOOP_END] */
            /* JADX WARN: Code duplicated, block: B:172:0x04ce  */
            /* JADX WARN: Code duplicated, block: B:173:0x04d1  */
            /* JADX WARN: Code duplicated, block: B:175:0x04d4  */
            /* JADX WARN: Code duplicated, block: B:176:0x04d6  */
            /* JADX WARN: Code duplicated, block: B:179:0x04db  */
            /* JADX WARN: Code duplicated, block: B:180:0x04e8  */
            /* JADX WARN: Code duplicated, block: B:182:0x04f0  */
            /* JADX WARN: Code duplicated, block: B:183:0x04f9  */
            /* JADX WARN: Code duplicated, block: B:185:0x04fd  */
            /* JADX WARN: Code duplicated, block: B:186:0x0506  */
            /* JADX WARN: Code duplicated, block: B:188:0x0509  */
            /* JADX WARN: Code duplicated, block: B:225:0x0634 A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:226:0x0636  */
            /* JADX WARN: Code duplicated, block: B:228:0x063c  */
            /* JADX WARN: Code duplicated, block: B:239:0x0658  */
            /* JADX WARN: Code duplicated, block: B:372:0x050c A[SYNTHETIC] */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r11v0 */
            /* JADX WARN: Type inference failed for: r11v27, types: [boolean, int] */
            /* JADX WARN: Type inference failed for: r11v33 */
            /* JADX WARN: Type inference failed for: r6v52, types: [int] */
            /* JADX WARN: Type inference failed for: r6v57 */
            /* JADX WARN: Type inference failed for: r6v61, types: [int] */
            /* JADX WARN: Type inference failed for: r6v65 */
            /* JADX WARN: Type inference failed for: r6v66 */
            /* JADX WARN: Type inference failed for: r9v50, types: [java.lang.CharSequence, java.lang.StringBuilder] */
            /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r10v18 java.lang.Object, still in use, count: 2, list:
                  (r10v18 java.lang.Object) from 0x0481: PHI (r10 I:??) = (r10v9 java.lang.Object), (r10v18 java.lang.Object) binds: [B:157:0x0480, B:374:0x0481] A[DONT_GENERATE, DONT_INLINE]
                  (r10v18 java.lang.Object) from 0x0475: CHECK_CAST (a.lok0) (r10v18 java.lang.Object)
                	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
                	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
                	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
                	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
                	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
                	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
                */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object r44) {
                /*
                    Method dump skipped, instruction units count: 2122
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: a.llb.invoke(java.lang.Object):java.lang.Object");
            }
        }, (byte) 20));
        if (jkbVar != null) {
            Object obj4 = jkbVar.c;
            ubb ubbVar4 = new ubb(iun.f15405a, "");
            e0g0 e0g0Var2 = j0g0.b;
            ubbVar2 = (ubb) (obj4 instanceof g0g0 ? ubbVar4 : obj4);
        } else {
            ubbVar2 = null;
        }
        final byte b3 = 2;
        this.d = maz.b(new yw9(ubbVar2, new Function1(this) { // from class: a.llb
            public final /* synthetic */ xa9 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:160:0x0491  */
            /* JADX WARN: Code duplicated, block: B:161:0x0495  */
            /* JADX WARN: Code duplicated, block: B:163:0x0498  */
            /* JADX WARN: Code duplicated, block: B:165:0x049d  */
            /* JADX WARN: Code duplicated, block: B:169:0x04b6 A[LOOP:8: B:167:0x04b0->B:169:0x04b6, LOOP_END] */
            /* JADX WARN: Code duplicated, block: B:172:0x04ce  */
            /* JADX WARN: Code duplicated, block: B:173:0x04d1  */
            /* JADX WARN: Code duplicated, block: B:175:0x04d4  */
            /* JADX WARN: Code duplicated, block: B:176:0x04d6  */
            /* JADX WARN: Code duplicated, block: B:179:0x04db  */
            /* JADX WARN: Code duplicated, block: B:180:0x04e8  */
            /* JADX WARN: Code duplicated, block: B:182:0x04f0  */
            /* JADX WARN: Code duplicated, block: B:183:0x04f9  */
            /* JADX WARN: Code duplicated, block: B:185:0x04fd  */
            /* JADX WARN: Code duplicated, block: B:186:0x0506  */
            /* JADX WARN: Code duplicated, block: B:188:0x0509  */
            /* JADX WARN: Code duplicated, block: B:225:0x0634 A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:226:0x0636  */
            /* JADX WARN: Code duplicated, block: B:228:0x063c  */
            /* JADX WARN: Code duplicated, block: B:239:0x0658  */
            /* JADX WARN: Code duplicated, block: B:372:0x050c A[SYNTHETIC] */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r11v0 */
            /* JADX WARN: Type inference failed for: r11v27, types: [boolean, int] */
            /* JADX WARN: Type inference failed for: r11v33 */
            /* JADX WARN: Type inference failed for: r6v52, types: [int] */
            /* JADX WARN: Type inference failed for: r6v57 */
            /* JADX WARN: Type inference failed for: r6v61, types: [int] */
            /* JADX WARN: Type inference failed for: r6v65 */
            /* JADX WARN: Type inference failed for: r6v66 */
            /* JADX WARN: Type inference failed for: r9v50, types: [java.lang.CharSequence, java.lang.StringBuilder] */
            /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r10v18 java.lang.Object, still in use, count: 2, list:
                  (r10v18 java.lang.Object) from 0x0481: PHI (r10 I:??) = (r10v9 java.lang.Object), (r10v18 java.lang.Object) binds: [B:157:0x0480, B:374:0x0481] A[DONT_GENERATE, DONT_INLINE]
                  (r10v18 java.lang.Object) from 0x0475: CHECK_CAST (a.lok0) (r10v18 java.lang.Object)
                	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
                	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
                	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
                	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
                	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
                */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object r44) {
                /*
                    Method dump skipped, instruction units count: 2122
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: a.llb.invoke(java.lang.Object):java.lang.Object");
            }
        }, (byte) 20));
        j0g0 j0g0Var = albVar.l;
        if (j0g0Var != null) {
            Object obj5 = j0g0Var.f15681a;
            obj = (List) (obj5 instanceof g0g0 ? null : obj5);
            obj = obj == null ? iun.f15405a : obj;
        }
        final byte b4 = 3;
        this.e = maz.b(new yw9(obj, new Function1(this) { // from class: a.llb
            public final /* synthetic */ xa9 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:160:0x0491  */
            /* JADX WARN: Code duplicated, block: B:161:0x0495  */
            /* JADX WARN: Code duplicated, block: B:163:0x0498  */
            /* JADX WARN: Code duplicated, block: B:165:0x049d  */
            /* JADX WARN: Code duplicated, block: B:169:0x04b6 A[LOOP:8: B:167:0x04b0->B:169:0x04b6, LOOP_END] */
            /* JADX WARN: Code duplicated, block: B:172:0x04ce  */
            /* JADX WARN: Code duplicated, block: B:173:0x04d1  */
            /* JADX WARN: Code duplicated, block: B:175:0x04d4  */
            /* JADX WARN: Code duplicated, block: B:176:0x04d6  */
            /* JADX WARN: Code duplicated, block: B:179:0x04db  */
            /* JADX WARN: Code duplicated, block: B:180:0x04e8  */
            /* JADX WARN: Code duplicated, block: B:182:0x04f0  */
            /* JADX WARN: Code duplicated, block: B:183:0x04f9  */
            /* JADX WARN: Code duplicated, block: B:185:0x04fd  */
            /* JADX WARN: Code duplicated, block: B:186:0x0506  */
            /* JADX WARN: Code duplicated, block: B:188:0x0509  */
            /* JADX WARN: Code duplicated, block: B:225:0x0634 A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:226:0x0636  */
            /* JADX WARN: Code duplicated, block: B:228:0x063c  */
            /* JADX WARN: Code duplicated, block: B:239:0x0658  */
            /* JADX WARN: Code duplicated, block: B:372:0x050c A[SYNTHETIC] */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r11v0 */
            /* JADX WARN: Type inference failed for: r11v27, types: [boolean, int] */
            /* JADX WARN: Type inference failed for: r11v33 */
            /* JADX WARN: Type inference failed for: r6v52, types: [int] */
            /* JADX WARN: Type inference failed for: r6v57 */
            /* JADX WARN: Type inference failed for: r6v61, types: [int] */
            /* JADX WARN: Type inference failed for: r6v65 */
            /* JADX WARN: Type inference failed for: r6v66 */
            /* JADX WARN: Type inference failed for: r9v50, types: [java.lang.CharSequence, java.lang.StringBuilder] */
            /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r10v18 java.lang.Object, still in use, count: 2, list:
                  (r10v18 java.lang.Object) from 0x0481: PHI (r10 I:??) = (r10v9 java.lang.Object), (r10v18 java.lang.Object) binds: [B:157:0x0480, B:374:0x0481] A[DONT_GENERATE, DONT_INLINE]
                  (r10v18 java.lang.Object) from 0x0475: CHECK_CAST (a.lok0) (r10v18 java.lang.Object)
                	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
                	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
                	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
                	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
                */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object r44) {
                /*
                    Method dump skipped, instruction units count: 2122
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: a.llb.invoke(java.lang.Object):java.lang.Object");
            }
        }, (byte) 20));
        this.f = bkb.H(albVar.n);
        j0g0 j0g0Var2 = albVar.m;
        if (j0g0Var2 != null) {
            Object obj6 = j0g0Var2.f15681a;
            yvl0Var = (yvl0) (obj6 instanceof g0g0 ? null : obj6);
        } else {
            yvl0Var = null;
        }
        final byte b5 = 4;
        this.g = maz.b(new yw9(yvl0Var, new Function1(this) { // from class: a.llb
            public final /* synthetic */ xa9 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:160:0x0491  */
            /* JADX WARN: Code duplicated, block: B:161:0x0495  */
            /* JADX WARN: Code duplicated, block: B:163:0x0498  */
            /* JADX WARN: Code duplicated, block: B:165:0x049d  */
            /* JADX WARN: Code duplicated, block: B:169:0x04b6 A[LOOP:8: B:167:0x04b0->B:169:0x04b6, LOOP_END] */
            /* JADX WARN: Code duplicated, block: B:172:0x04ce  */
            /* JADX WARN: Code duplicated, block: B:173:0x04d1  */
            /* JADX WARN: Code duplicated, block: B:175:0x04d4  */
            /* JADX WARN: Code duplicated, block: B:176:0x04d6  */
            /* JADX WARN: Code duplicated, block: B:179:0x04db  */
            /* JADX WARN: Code duplicated, block: B:180:0x04e8  */
            /* JADX WARN: Code duplicated, block: B:182:0x04f0  */
            /* JADX WARN: Code duplicated, block: B:183:0x04f9  */
            /* JADX WARN: Code duplicated, block: B:185:0x04fd  */
            /* JADX WARN: Code duplicated, block: B:186:0x0506  */
            /* JADX WARN: Code duplicated, block: B:188:0x0509  */
            /* JADX WARN: Code duplicated, block: B:225:0x0634 A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:226:0x0636  */
            /* JADX WARN: Code duplicated, block: B:228:0x063c  */
            /* JADX WARN: Code duplicated, block: B:239:0x0658  */
            /* JADX WARN: Code duplicated, block: B:372:0x050c A[SYNTHETIC] */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r11v0 */
            /* JADX WARN: Type inference failed for: r11v27, types: [boolean, int] */
            /* JADX WARN: Type inference failed for: r11v33 */
            /* JADX WARN: Type inference failed for: r6v52, types: [int] */
            /* JADX WARN: Type inference failed for: r6v57 */
            /* JADX WARN: Type inference failed for: r6v61, types: [int] */
            /* JADX WARN: Type inference failed for: r6v65 */
            /* JADX WARN: Type inference failed for: r6v66 */
            /* JADX WARN: Type inference failed for: r9v50, types: [java.lang.CharSequence, java.lang.StringBuilder] */
            /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r10v18 java.lang.Object, still in use, count: 2, list:
                  (r10v18 java.lang.Object) from 0x0481: PHI (r10 I:??) = (r10v9 java.lang.Object), (r10v18 java.lang.Object) binds: [B:157:0x0480, B:374:0x0481] A[DONT_GENERATE, DONT_INLINE]
                  (r10v18 java.lang.Object) from 0x0475: CHECK_CAST (a.lok0) (r10v18 java.lang.Object)
                	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
                	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
                	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
                	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
                */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object r44) {
                /*
                    Method dump skipped, instruction units count: 2122
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: a.llb.invoke(java.lang.Object):java.lang.Object");
            }
        }, (byte) 20));
        if (jkbVar != null) {
            Object obj7 = jkbVar.d;
            e0g0 e0g0Var3 = j0g0.b;
            obj2 = (List) (obj7 instanceof g0g0 ? null : obj7);
        }
        final byte b6 = 5;
        this.h = maz.b(new yw9(obj2, new Function1(this) { // from class: a.llb
            public final /* synthetic */ xa9 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:160:0x0491  */
            /* JADX WARN: Code duplicated, block: B:161:0x0495  */
            /* JADX WARN: Code duplicated, block: B:163:0x0498  */
            /* JADX WARN: Code duplicated, block: B:165:0x049d  */
            /* JADX WARN: Code duplicated, block: B:169:0x04b6 A[LOOP:8: B:167:0x04b0->B:169:0x04b6, LOOP_END] */
            /* JADX WARN: Code duplicated, block: B:172:0x04ce  */
            /* JADX WARN: Code duplicated, block: B:173:0x04d1  */
            /* JADX WARN: Code duplicated, block: B:175:0x04d4  */
            /* JADX WARN: Code duplicated, block: B:176:0x04d6  */
            /* JADX WARN: Code duplicated, block: B:179:0x04db  */
            /* JADX WARN: Code duplicated, block: B:180:0x04e8  */
            /* JADX WARN: Code duplicated, block: B:182:0x04f0  */
            /* JADX WARN: Code duplicated, block: B:183:0x04f9  */
            /* JADX WARN: Code duplicated, block: B:185:0x04fd  */
            /* JADX WARN: Code duplicated, block: B:186:0x0506  */
            /* JADX WARN: Code duplicated, block: B:188:0x0509  */
            /* JADX WARN: Code duplicated, block: B:225:0x0634 A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:226:0x0636  */
            /* JADX WARN: Code duplicated, block: B:228:0x063c  */
            /* JADX WARN: Code duplicated, block: B:239:0x0658  */
            /* JADX WARN: Code duplicated, block: B:372:0x050c A[SYNTHETIC] */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r11v0 */
            /* JADX WARN: Type inference failed for: r11v27, types: [boolean, int] */
            /* JADX WARN: Type inference failed for: r11v33 */
            /* JADX WARN: Type inference failed for: r6v52, types: [int] */
            /* JADX WARN: Type inference failed for: r6v57 */
            /* JADX WARN: Type inference failed for: r6v61, types: [int] */
            /* JADX WARN: Type inference failed for: r6v65 */
            /* JADX WARN: Type inference failed for: r6v66 */
            /* JADX WARN: Type inference failed for: r9v50, types: [java.lang.CharSequence, java.lang.StringBuilder] */
            /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r10v18 java.lang.Object, still in use, count: 2, list:
                  (r10v18 java.lang.Object) from 0x0481: PHI (r10 I:??) = (r10v9 java.lang.Object), (r10v18 java.lang.Object) binds: [B:157:0x0480, B:374:0x0481] A[DONT_GENERATE, DONT_INLINE]
                  (r10v18 java.lang.Object) from 0x0475: CHECK_CAST (a.lok0) (r10v18 java.lang.Object)
                	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
                	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
                	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
                	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
                */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object r44) {
                /*
                    Method dump skipped, instruction units count: 2122
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: a.llb.invoke(java.lang.Object):java.lang.Object");
            }
        }, (byte) 20));
    }

    public xa9(ctf0 ctf0Var, w5j w5jVar) {
        ctf0Var.getClass();
        this.j = ctf0Var;
        this.b = bkb.H(w5jVar.b);
        n0o0 n0o0VarH = bkb.H(Integer.valueOf(w5jVar.f38588a));
        this.c = n0o0VarH;
        this.d = bkb.H(Boolean.valueOf(w5jVar.e));
        n0o0 n0o0VarH2 = bkb.H(w5jVar.f);
        this.e = n0o0VarH2;
        this.f = bkb.H(Boolean.valueOf(w5jVar.c));
        this.g = bkb.H(Boolean.valueOf(w5jVar.d));
        this.h = bkb.H(w5jVar.g);
        this.i = bkb.G(((fee) n0o0VarH.getValue()).d, new x2i((byte) 5));
        pz40 pz40Var = s6t0.f31722a;
        this.k = new imm(new ilm(s6t0.b().f33626a.getSecondary()), new plm(ctf0Var.b.a(R.string.daily_task_title, Arrays.copyOf(new Object[0], 0)), s6t0.b().f33626a.getSecondary(), fa50.f9191a), new dmm(new ta50(new wkm(0, R.drawable.ic_glyph_info_circle, true, ra50.f30118a, s6t0.b().f33626a.getSecondary()))), s6t0.b().f33626a.getBackgroundContent(), true, null);
        this.l = bkb.G(((fee) n0o0VarH2.getValue()).d, new e3j(this, (byte) 3));
    }

    public xa9(pa9 pa9Var, ctf0 ctf0Var, ocl oclVar) {
        final byte b = 0;
        ctf0Var.getClass();
        this.b = bkb.H(pa9Var.e);
        this.c = bkb.H(pa9Var.f);
        this.d = bkb.H(pa9Var.b);
        this.e = bkb.H(pa9Var.f26644a);
        this.f = bkb.H(pa9Var.h);
        pb10 pb10Var = pb10.g;
        this.j = ocl.b(oclVar, pb10Var, null, 0, 0, R.string.data_retrieval_error, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE);
        this.k = ocl.b(oclVar, pb10Var, null, 0, 0, R.string.currently_no_events, R.string.refresh_data, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE);
        lsm0 lsm0Var = ctf0Var.b;
        this.l = dyb.g0(lsm0Var.a(R.string.team_first, Arrays.copyOf(new Object[0], 0)), lsm0Var.a(R.string.team_sec, Arrays.copyOf(new Object[0], 0)));
        this.g = maz.b(new yw9(pa9Var.c, new Function1(this) { // from class: a.wa9
            public final /* synthetic */ xa9 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0030  */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                List list;
                String str;
                boolean z;
                List list2;
                boolean z2;
                boolean z3;
                boolean z4;
                String str2;
                String str3;
                wui0 wui0Var;
                byte b2 = b;
                boolean z5 = true;
                xa9 xa9Var = this.b;
                switch (b2) {
                    case 0:
                        rvm0 rvm0Var = (rvm0) obj;
                        List list3 = (List) ((fee) xa9Var.d.getValue()).c();
                        List list4 = (List) ((fee) xa9Var.b.getValue()).c();
                        List list5 = (List) ((fee) xa9Var.c.getValue()).c();
                        list3.getClass();
                        list4.getClass();
                        list5.getClass();
                        pz40 pz40Var = s6t0.f31722a;
                        ilm ilmVar = new ilm(s6t0.b().f33626a.getSecondary());
                        String str4 = rvm0Var != null ? rvm0Var.c : null;
                        return new imm(ilmVar, new plm(str4 != null ? str4 : "", s6t0.b().f33626a.getSecondary(), list3.size() > 1 ? new ea50(s6t0.b().f33626a.getSecondary()) : fa50.f9191a), new dmm(new ta50(new wkm(1, R.drawable.ic_glyph_trash, (list4.isEmpty() && list5.isEmpty()) ? false : true, ra50.f30118a, s6t0.b().f33626a.getSecondary()))), s6t0.b().f33626a.getBackgroundContent(), false, null);
                    case 1:
                        wdn wdnVar = (wdn) obj;
                        wdnVar.getClass();
                        List list6 = (List) ((fee) xa9Var.e.getValue()).c();
                        List list7 = (List) ((fee) xa9Var.b.getValue()).c();
                        List list8 = (List) ((fee) xa9Var.c.getValue()).c();
                        l9s l9sVar = (l9s) ((fee) xa9Var.f.getValue()).c();
                        list7.getClass();
                        list8.getClass();
                        String strJ = l9sVar != null ? l9sVar.j() : null;
                        if (strJ == null) {
                            strJ = "";
                        }
                        String strG = l9sVar != null ? l9sVar.g() : null;
                        String str5 = strG != null ? strG : "";
                        int iOrdinal = wdnVar.ordinal();
                        if (iOrdinal != 0) {
                            if (iOrdinal == 1) {
                                list = list8;
                            } else {
                                t9f.b();
                            }
                            return null;
                        }
                        list = list7;
                        int iOrdinal2 = wdnVar.ordinal();
                        if (iOrdinal2 == 0) {
                            list7 = list8;
                        } else if (iOrdinal2 != 1) {
                            t9f.b();
                            return null;
                        }
                        boolean z6 = list.size() < 5;
                        List list9 = list6 == null ? iun.f15405a : list6;
                        ArrayList arrayList = new ArrayList(r3d.q(list9, 10));
                        int i = 0;
                        for (Object obj2 : list9) {
                            int i2 = i + 1;
                            if (i < 0) {
                                q3d.p();
                                throw null;
                            }
                            tdn tdnVar = (tdn) obj2;
                            if (list.isEmpty()) {
                                str = null;
                                z = false;
                            } else {
                                Iterator it = list.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        str = null;
                                        if (((tdn) it.next()).f33777a == tdnVar.f33777a) {
                                            z = true;
                                        }
                                    } else {
                                        str = null;
                                        z = false;
                                    }
                                }
                            }
                            if (list7.isEmpty()) {
                                list2 = list;
                                z2 = z6;
                                z3 = false;
                            } else {
                                Iterator it2 = list7.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        list2 = list;
                                        z2 = z6;
                                        if (((tdn) it2.next()).f33777a == tdnVar.f33777a) {
                                            z3 = true;
                                        } else {
                                            list = list2;
                                            z6 = z2;
                                        }
                                    } else {
                                        list2 = list;
                                        z2 = z6;
                                        z3 = false;
                                    }
                                }
                            }
                            String str6 = str5;
                            long j = tdnVar.f33777a;
                            Integer num = tdnVar.d;
                            if (num == null) {
                                z4 = z3;
                                str2 = str;
                            } else {
                                z4 = z3;
                                str2 = num.intValue() == 1 ? strJ : str6;
                            }
                            boolean z7 = z || z4;
                            boolean z8 = z || (!z4 && z2);
                            if (i == 0) {
                                wui0Var = wui0.b;
                                str3 = str6;
                            } else {
                                if (list6 != null) {
                                    str3 = str6;
                                    if (i == list6.size() - 1) {
                                        wui0Var = wui0.d;
                                    }
                                } else {
                                    str3 = str6;
                                }
                                wui0Var = wui0.c;
                            }
                            arrayList.add(new la9(j, fww.K(tdnVar, str2, z7, z8, wui0Var)));
                            list = list2;
                            i = i2;
                            z6 = z2;
                            str5 = str3;
                        }
                        return dyb.o0(arrayList);
                    default:
                        wdn wdnVar2 = (wdn) obj;
                        wdnVar2.getClass();
                        int iOrdinal3 = wdnVar2.ordinal();
                        if (iOrdinal3 != 0) {
                            if (iOrdinal3 != 1) {
                                t9f.b();
                                return null;
                            }
                            if (((Collection) ((fee) xa9Var.c.getValue()).c()).isEmpty()) {
                                z5 = false;
                            }
                        } else if (((Collection) ((fee) xa9Var.b.getValue()).c()).isEmpty()) {
                            z5 = false;
                        }
                        return Boolean.valueOf(z5);
                }
            }
        }, (byte) 20));
        wdn wdnVar = pa9Var.g;
        final byte b2 = 1;
        this.h = maz.b(new yw9(wdnVar, new Function1(this) { // from class: a.wa9
            public final /* synthetic */ xa9 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0030  */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                List list;
                String str;
                boolean z;
                List list2;
                boolean z2;
                boolean z3;
                boolean z4;
                String str2;
                String str3;
                wui0 wui0Var;
                byte b3 = b2;
                boolean z5 = true;
                xa9 xa9Var = this.b;
                switch (b3) {
                    case 0:
                        rvm0 rvm0Var = (rvm0) obj;
                        List list3 = (List) ((fee) xa9Var.d.getValue()).c();
                        List list4 = (List) ((fee) xa9Var.b.getValue()).c();
                        List list5 = (List) ((fee) xa9Var.c.getValue()).c();
                        list3.getClass();
                        list4.getClass();
                        list5.getClass();
                        pz40 pz40Var = s6t0.f31722a;
                        ilm ilmVar = new ilm(s6t0.b().f33626a.getSecondary());
                        String str4 = rvm0Var != null ? rvm0Var.c : null;
                        return new imm(ilmVar, new plm(str4 != null ? str4 : "", s6t0.b().f33626a.getSecondary(), list3.size() > 1 ? new ea50(s6t0.b().f33626a.getSecondary()) : fa50.f9191a), new dmm(new ta50(new wkm(1, R.drawable.ic_glyph_trash, (list4.isEmpty() && list5.isEmpty()) ? false : true, ra50.f30118a, s6t0.b().f33626a.getSecondary()))), s6t0.b().f33626a.getBackgroundContent(), false, null);
                    case 1:
                        wdn wdnVar2 = (wdn) obj;
                        wdnVar2.getClass();
                        List list6 = (List) ((fee) xa9Var.e.getValue()).c();
                        List list7 = (List) ((fee) xa9Var.b.getValue()).c();
                        List list8 = (List) ((fee) xa9Var.c.getValue()).c();
                        l9s l9sVar = (l9s) ((fee) xa9Var.f.getValue()).c();
                        list7.getClass();
                        list8.getClass();
                        String strJ = l9sVar != null ? l9sVar.j() : null;
                        if (strJ == null) {
                            strJ = "";
                        }
                        String strG = l9sVar != null ? l9sVar.g() : null;
                        String str5 = strG != null ? strG : "";
                        int iOrdinal = wdnVar2.ordinal();
                        if (iOrdinal != 0) {
                            if (iOrdinal == 1) {
                                list = list8;
                            } else {
                                t9f.b();
                            }
                            return null;
                        }
                        list = list7;
                        int iOrdinal2 = wdnVar2.ordinal();
                        if (iOrdinal2 == 0) {
                            list7 = list8;
                        } else if (iOrdinal2 != 1) {
                            t9f.b();
                            return null;
                        }
                        boolean z6 = list.size() < 5;
                        List list9 = list6 == null ? iun.f15405a : list6;
                        ArrayList arrayList = new ArrayList(r3d.q(list9, 10));
                        int i = 0;
                        for (Object obj2 : list9) {
                            int i2 = i + 1;
                            if (i < 0) {
                                q3d.p();
                                throw null;
                            }
                            tdn tdnVar = (tdn) obj2;
                            if (list.isEmpty()) {
                                str = null;
                                z = false;
                            } else {
                                Iterator it = list.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        str = null;
                                        if (((tdn) it.next()).f33777a == tdnVar.f33777a) {
                                            z = true;
                                        }
                                    } else {
                                        str = null;
                                        z = false;
                                    }
                                }
                            }
                            if (list7.isEmpty()) {
                                list2 = list;
                                z2 = z6;
                                z3 = false;
                            } else {
                                Iterator it2 = list7.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        list2 = list;
                                        z2 = z6;
                                        if (((tdn) it2.next()).f33777a == tdnVar.f33777a) {
                                            z3 = true;
                                        } else {
                                            list = list2;
                                            z6 = z2;
                                        }
                                    } else {
                                        list2 = list;
                                        z2 = z6;
                                        z3 = false;
                                    }
                                }
                            }
                            String str6 = str5;
                            long j = tdnVar.f33777a;
                            Integer num = tdnVar.d;
                            if (num == null) {
                                z4 = z3;
                                str2 = str;
                            } else {
                                z4 = z3;
                                str2 = num.intValue() == 1 ? strJ : str6;
                            }
                            boolean z7 = z || z4;
                            boolean z8 = z || (!z4 && z2);
                            if (i == 0) {
                                wui0Var = wui0.b;
                                str3 = str6;
                            } else {
                                if (list6 != null) {
                                    str3 = str6;
                                    if (i == list6.size() - 1) {
                                        wui0Var = wui0.d;
                                    }
                                } else {
                                    str3 = str6;
                                }
                                wui0Var = wui0.c;
                            }
                            arrayList.add(new la9(j, fww.K(tdnVar, str2, z7, z8, wui0Var)));
                            list = list2;
                            i = i2;
                            z6 = z2;
                            str5 = str3;
                        }
                        return dyb.o0(arrayList);
                    default:
                        wdn wdnVar3 = (wdn) obj;
                        wdnVar3.getClass();
                        int iOrdinal3 = wdnVar3.ordinal();
                        if (iOrdinal3 != 0) {
                            if (iOrdinal3 != 1) {
                                t9f.b();
                                return null;
                            }
                            if (((Collection) ((fee) xa9Var.c.getValue()).c()).isEmpty()) {
                                z5 = false;
                            }
                        } else if (((Collection) ((fee) xa9Var.b.getValue()).c()).isEmpty()) {
                            z5 = false;
                        }
                        return Boolean.valueOf(z5);
                }
            }
        }, (byte) 20));
        final byte b3 = 2;
        this.i = maz.b(new yw9(wdnVar, new Function1(this) { // from class: a.wa9
            public final /* synthetic */ xa9 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:10:0x0030  */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                List list;
                String str;
                boolean z;
                List list2;
                boolean z2;
                boolean z3;
                boolean z4;
                String str2;
                String str3;
                wui0 wui0Var;
                byte b4 = b3;
                boolean z5 = true;
                xa9 xa9Var = this.b;
                switch (b4) {
                    case 0:
                        rvm0 rvm0Var = (rvm0) obj;
                        List list3 = (List) ((fee) xa9Var.d.getValue()).c();
                        List list4 = (List) ((fee) xa9Var.b.getValue()).c();
                        List list5 = (List) ((fee) xa9Var.c.getValue()).c();
                        list3.getClass();
                        list4.getClass();
                        list5.getClass();
                        pz40 pz40Var = s6t0.f31722a;
                        ilm ilmVar = new ilm(s6t0.b().f33626a.getSecondary());
                        String str4 = rvm0Var != null ? rvm0Var.c : null;
                        return new imm(ilmVar, new plm(str4 != null ? str4 : "", s6t0.b().f33626a.getSecondary(), list3.size() > 1 ? new ea50(s6t0.b().f33626a.getSecondary()) : fa50.f9191a), new dmm(new ta50(new wkm(1, R.drawable.ic_glyph_trash, (list4.isEmpty() && list5.isEmpty()) ? false : true, ra50.f30118a, s6t0.b().f33626a.getSecondary()))), s6t0.b().f33626a.getBackgroundContent(), false, null);
                    case 1:
                        wdn wdnVar2 = (wdn) obj;
                        wdnVar2.getClass();
                        List list6 = (List) ((fee) xa9Var.e.getValue()).c();
                        List list7 = (List) ((fee) xa9Var.b.getValue()).c();
                        List list8 = (List) ((fee) xa9Var.c.getValue()).c();
                        l9s l9sVar = (l9s) ((fee) xa9Var.f.getValue()).c();
                        list7.getClass();
                        list8.getClass();
                        String strJ = l9sVar != null ? l9sVar.j() : null;
                        if (strJ == null) {
                            strJ = "";
                        }
                        String strG = l9sVar != null ? l9sVar.g() : null;
                        String str5 = strG != null ? strG : "";
                        int iOrdinal = wdnVar2.ordinal();
                        if (iOrdinal != 0) {
                            if (iOrdinal == 1) {
                                list = list8;
                            } else {
                                t9f.b();
                            }
                            return null;
                        }
                        list = list7;
                        int iOrdinal2 = wdnVar2.ordinal();
                        if (iOrdinal2 == 0) {
                            list7 = list8;
                        } else if (iOrdinal2 != 1) {
                            t9f.b();
                            return null;
                        }
                        boolean z6 = list.size() < 5;
                        List list9 = list6 == null ? iun.f15405a : list6;
                        ArrayList arrayList = new ArrayList(r3d.q(list9, 10));
                        int i = 0;
                        for (Object obj2 : list9) {
                            int i2 = i + 1;
                            if (i < 0) {
                                q3d.p();
                                throw null;
                            }
                            tdn tdnVar = (tdn) obj2;
                            if (list.isEmpty()) {
                                str = null;
                                z = false;
                            } else {
                                Iterator it = list.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        str = null;
                                        if (((tdn) it.next()).f33777a == tdnVar.f33777a) {
                                            z = true;
                                        }
                                    } else {
                                        str = null;
                                        z = false;
                                    }
                                }
                            }
                            if (list7.isEmpty()) {
                                list2 = list;
                                z2 = z6;
                                z3 = false;
                            } else {
                                Iterator it2 = list7.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        list2 = list;
                                        z2 = z6;
                                        if (((tdn) it2.next()).f33777a == tdnVar.f33777a) {
                                            z3 = true;
                                        } else {
                                            list = list2;
                                            z6 = z2;
                                        }
                                    } else {
                                        list2 = list;
                                        z2 = z6;
                                        z3 = false;
                                    }
                                }
                            }
                            String str6 = str5;
                            long j = tdnVar.f33777a;
                            Integer num = tdnVar.d;
                            if (num == null) {
                                z4 = z3;
                                str2 = str;
                            } else {
                                z4 = z3;
                                str2 = num.intValue() == 1 ? strJ : str6;
                            }
                            boolean z7 = z || z4;
                            boolean z8 = z || (!z4 && z2);
                            if (i == 0) {
                                wui0Var = wui0.b;
                                str3 = str6;
                            } else {
                                if (list6 != null) {
                                    str3 = str6;
                                    if (i == list6.size() - 1) {
                                        wui0Var = wui0.d;
                                    }
                                } else {
                                    str3 = str6;
                                }
                                wui0Var = wui0.c;
                            }
                            arrayList.add(new la9(j, fww.K(tdnVar, str2, z7, z8, wui0Var)));
                            list = list2;
                            i = i2;
                            z6 = z2;
                            str5 = str3;
                        }
                        return dyb.o0(arrayList);
                    default:
                        wdn wdnVar3 = (wdn) obj;
                        wdnVar3.getClass();
                        int iOrdinal3 = wdnVar3.ordinal();
                        if (iOrdinal3 != 0) {
                            if (iOrdinal3 != 1) {
                                t9f.b();
                                return null;
                            }
                            if (((Collection) ((fee) xa9Var.c.getValue()).c()).isEmpty()) {
                                z5 = false;
                            }
                        } else if (((Collection) ((fee) xa9Var.b.getValue()).c()).isEmpty()) {
                            z5 = false;
                        }
                        return Boolean.valueOf(z5);
                }
            }
        }, (byte) 20));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public xa9(b820 b820Var, ctf0 ctf0Var, zvh0 zvh0Var) {
        final byte b = 3;
        rvj0 rvj0Var = b820Var.d;
        gx4 gx4Var = b820Var.f;
        an5 an5Var = b820Var.c;
        boolean z = b820Var.l;
        ctf0Var.getClass();
        this.j = ctf0Var;
        this.k = zvh0Var;
        ly6 ly6Var = b820Var.f2138a;
        boolean z2 = b820Var.h;
        iy6 iy6Var = new iy6(ly6Var, z2);
        final Object[] objArr = 0 == true ? 1 : 0;
        this.b = maz.b(new yw9(iy6Var, new Function1(this) { // from class: a.hh00
            public final /* synthetic */ xa9 b;

            {
                this.b = this;
            }

            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v6 a.wul, still in use, count: 4, list:
                  (r5v6 a.wul) from 0x00e3: MOVE (r19v1 a.wul) = (r5v6 a.wul) (LINE:228)
                  (r5v6 a.wul) from 0x00ba: MOVE (r19v4 a.wul) = (r5v6 a.wul) (LINE:187)
                  (r5v6 a.wul) from 0x00b7: MOVE (r19v5 a.wul) = (r5v6 a.wul) (LINE:184)
                  (r5v6 a.wul) from 0x007d: MOVE (r19v7 a.wul) = (r5v6 a.wul) (LINE:126)
                	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
                	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:59)
                	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
                	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
                */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object r20) {
                /*
                    Method dump skipped, instruction units count: 694
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: a.hh00.invoke(java.lang.Object):java.lang.Object");
            }
        }, (byte) 20));
        fo7 fo7Var = b820Var.b;
        czc0 czc0Var = b820Var.e;
        final byte b2 = 1;
        this.c = maz.b(new yw9(new hwh0(fo7Var, czc0Var != null, gx4Var != null), new Function1(this) { // from class: a.hh00
            public final /* synthetic */ xa9 b;

            {
                this.b = this;
            }

            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v6 a.wul, still in use, count: 4, list:
                  (r5v6 a.wul) from 0x00e3: MOVE (r19v1 a.wul) = (r5v6 a.wul) (LINE:228)
                  (r5v6 a.wul) from 0x00ba: MOVE (r19v4 a.wul) = (r5v6 a.wul) (LINE:187)
                  (r5v6 a.wul) from 0x00b7: MOVE (r19v5 a.wul) = (r5v6 a.wul) (LINE:184)
                  (r5v6 a.wul) from 0x007d: MOVE (r19v7 a.wul) = (r5v6 a.wul) (LINE:126)
                	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
                	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:59)
                	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
                */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object r20) {
                /*
                    Method dump skipped, instruction units count: 694
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: a.hh00.invoke(java.lang.Object):java.lang.Object");
            }
        }, (byte) 20));
        final byte b3 = 2;
        this.d = maz.b(new yw9(new bf6(an5Var, z1x.I(b820Var), fo7Var, b820Var.l), new Function1(this) { // from class: a.hh00
            public final /* synthetic */ xa9 b;

            {
                this.b = this;
            }

            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v6 a.wul, still in use, count: 4, list:
                  (r5v6 a.wul) from 0x00e3: MOVE (r19v1 a.wul) = (r5v6 a.wul) (LINE:228)
                  (r5v6 a.wul) from 0x00ba: MOVE (r19v4 a.wul) = (r5v6 a.wul) (LINE:187)
                  (r5v6 a.wul) from 0x00b7: MOVE (r19v5 a.wul) = (r5v6 a.wul) (LINE:184)
                  (r5v6 a.wul) from 0x007d: MOVE (r19v7 a.wul) = (r5v6 a.wul) (LINE:126)
                	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
                	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:59)
                */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object r20) {
                /*
                    Method dump skipped, instruction units count: 694
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: a.hh00.invoke(java.lang.Object):java.lang.Object");
            }
        }, (byte) 20));
        this.e = maz.b(new yw9(new wvj0(rvj0Var, an5Var.c.f, z), new Function1(this) { // from class: a.hh00
            public final /* synthetic */ xa9 b;

            {
                this.b = this;
            }

            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v6 a.wul, still in use, count: 4, list:
                  (r5v6 a.wul) from 0x00e3: MOVE (r19v1 a.wul) = (r5v6 a.wul) (LINE:228)
                  (r5v6 a.wul) from 0x00ba: MOVE (r19v4 a.wul) = (r5v6 a.wul) (LINE:187)
                  (r5v6 a.wul) from 0x00b7: MOVE (r19v5 a.wul) = (r5v6 a.wul) (LINE:184)
                  (r5v6 a.wul) from 0x007d: MOVE (r19v7 a.wul) = (r5v6 a.wul) (LINE:126)
                	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
                */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object r20) {
                /*
                    Method dump skipped, instruction units count: 694
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: a.hh00.invoke(java.lang.Object):java.lang.Object");
            }
        }, (byte) 20));
        final byte b4 = 4;
        this.f = maz.b(new yw9(new w6c0(czc0Var, z), new Function1(this) { // from class: a.hh00
            public final /* synthetic */ xa9 b;

            {
                this.b = this;
            }

            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v6 a.wul, still in use, count: 4, list:
                  (r5v6 a.wul) from 0x00e3: MOVE (r19v1 a.wul) = (r5v6 a.wul) (LINE:228)
                  (r5v6 a.wul) from 0x00ba: MOVE (r19v4 a.wul) = (r5v6 a.wul) (LINE:187)
                  (r5v6 a.wul) from 0x00b7: MOVE (r19v5 a.wul) = (r5v6 a.wul) (LINE:184)
                  (r5v6 a.wul) from 0x007d: MOVE (r19v7 a.wul) = (r5v6 a.wul) (LINE:126)
                	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object r20) {
                /*
                    Method dump skipped, instruction units count: 694
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: a.hh00.invoke(java.lang.Object):java.lang.Object");
            }
        }, (byte) 20));
        final byte b5 = 5;
        this.g = maz.b(new yw9(new mx4(gx4Var, an5Var.c.f, z), new Function1(this) { // from class: a.hh00
            public final /* synthetic */ xa9 b;

            {
                this.b = this;
            }

            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v6 a.wul, still in use, count: 4, list:
                  (r5v6 a.wul) from 0x00e3: MOVE (r19v1 a.wul) = (r5v6 a.wul) (LINE:228)
                  (r5v6 a.wul) from 0x00ba: MOVE (r19v4 a.wul) = (r5v6 a.wul) (LINE:187)
                  (r5v6 a.wul) from 0x00b7: MOVE (r19v5 a.wul) = (r5v6 a.wul) (LINE:184)
                  (r5v6 a.wul) from 0x007d: MOVE (r19v7 a.wul) = (r5v6 a.wul) (LINE:126)
                	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object r20) {
                /*
                    Method dump skipped, instruction units count: 694
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: a.hh00.invoke(java.lang.Object):java.lang.Object");
            }
        }, (byte) 20));
        final byte b6 = 6;
        this.h = maz.b(new yw9(new bnd0(rvj0Var.d, rvj0Var.e, fo7Var instanceof co7, z), new Function1(this) { // from class: a.hh00
            public final /* synthetic */ xa9 b;

            {
                this.b = this;
            }

            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v6 a.wul, still in use, count: 4, list:
                  (r5v6 a.wul) from 0x00e3: MOVE (r19v1 a.wul) = (r5v6 a.wul) (LINE:228)
                  (r5v6 a.wul) from 0x00ba: MOVE (r19v4 a.wul) = (r5v6 a.wul) (LINE:187)
                  (r5v6 a.wul) from 0x00b7: MOVE (r19v5 a.wul) = (r5v6 a.wul) (LINE:184)
                  (r5v6 a.wul) from 0x007d: MOVE (r19v7 a.wul) = (r5v6 a.wul) (LINE:126)
                */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object r20) {
                /*
                    Method dump skipped, instruction units count: 694
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: a.hh00.invoke(java.lang.Object):java.lang.Object");
            }
        }, (byte) 20));
        final byte b7 = 7;
        this.i = maz.b(new yw9(z1x.S(b820Var), new Function1(this) { // from class: a.hh00
            public final /* synthetic */ xa9 b;

            {
                this.b = this;
            }

            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v6 a.wul, still in use, count: 4, list:
                  (r5v6 a.wul) from 0x00e3: MOVE (r19v1 a.wul) = (r5v6 a.wul) (LINE:228)
                  (r5v6 a.wul) from 0x00ba: MOVE (r19v4 a.wul) = (r5v6 a.wul) (LINE:187)
                  (r5v6 a.wul) from 0x00b7: MOVE (r19v5 a.wul) = (r5v6 a.wul) (LINE:184)
                  (r5v6 a.wul) from 0x007d: MOVE (r19v7 a.wul) = (r5v6 a.wul) (LINE:126)
                */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object r20) {
                /*
                    Method dump skipped, instruction units count: 694
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: a.hh00.invoke(java.lang.Object):java.lang.Object");
            }
        }, (byte) 20));
        final byte b8 = 8;
        this.l = maz.b(new yw9(Boolean.valueOf(z2), new Function1(this) { // from class: a.hh00
            public final /* synthetic */ xa9 b;

            {
                this.b = this;
            }

            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v6 a.wul, still in use, count: 4, list:
                  (r5v6 a.wul) from 0x00e3: MOVE (r19v1 a.wul) = (r5v6 a.wul) (LINE:228)
                  (r5v6 a.wul) from 0x00ba: MOVE (r19v4 a.wul) = (r5v6 a.wul) (LINE:187)
                  (r5v6 a.wul) from 0x00b7: MOVE (r19v5 a.wul) = (r5v6 a.wul) (LINE:184)
                  (r5v6 a.wul) from 0x007d: MOVE (r19v7 a.wul) = (r5v6 a.wul) (LINE:126)
                */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object r20) {
                /*
                    Method dump skipped, instruction units count: 694
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: a.hh00.invoke(java.lang.Object):java.lang.Object");
            }
        }, (byte) 20));
    }
}
