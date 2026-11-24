package a;

import android.gov.nist.core.Separators;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final class ee2 implements v6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f7647a = 0;
    public final n0o0 b;
    public final n0o0 c;
    public final n0o0 d;
    public final n0o0 e;
    public final n0o0 f;
    public final n0o0 g;
    public final n0o0 h;
    public final n0o0 i;
    public final n0o0 j;
    public final n0o0 k;
    public final n0o0 l;
    public final Object m;
    public final Object n;
    public final Object o;

    public ee2(o79 o79Var, ctf0 ctf0Var) {
        final byte b = 1;
        ctf0Var.getClass();
        Locale locale = Locale.ENGLISH;
        Long lValueOf = Long.valueOf(o79Var.b);
        int i = o79Var.c;
        Integer numValueOf = Integer.valueOf(i);
        String upperCase = o79Var.f.toUpperCase(Locale.ROOT);
        upperCase.getClass();
        this.n = String.format(locale, "javascript:startGameZone(%d, \"%d\", \"%s\")", Arrays.copyOf(new Object[]{lValueOf, numValueOf, upperCase}, 3));
        this.o = String.format(locale, "javascript:changeViewZone(\"%d\")", Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1));
        this.b = bkb.H(o79Var.e);
        n0o0 n0o0VarH = bkb.H(Boolean.valueOf(o79Var.g));
        this.c = n0o0VarH;
        n0o0 n0o0VarH2 = bkb.H(Boolean.valueOf(o79Var.h));
        this.d = n0o0VarH2;
        n0o0 n0o0VarH3 = bkb.H(Boolean.valueOf(o79Var.i));
        this.e = n0o0VarH3;
        n0o0 n0o0VarH4 = bkb.H(Boolean.valueOf(o79Var.j));
        this.f = n0o0VarH4;
        this.g = bkb.H(o79Var.k);
        this.h = bkb.H(o79Var.l);
        this.i = bkb.H(Boolean.valueOf(o79Var.m));
        final byte b2 = 0;
        this.j = bkb.G(((fee) n0o0VarH2.getValue()).d, new Function1(this) { // from class: a.q79
            public final /* synthetic */ ee2 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b3 = b2;
                ee2 ee2Var = this.b;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                switch (b3) {
                    case 0:
                        return Boolean.valueOf((zBooleanValue || !((Boolean) ((fee) ee2Var.c.getValue()).c()).booleanValue() || ((Boolean) ((fee) ee2Var.f.getValue()).c()).booleanValue()) ? false : true);
                    case 1:
                        if (((Boolean) ((fee) ee2Var.f.getValue()).c()).booleanValue()) {
                            return null;
                        }
                        String str = (String) ((fee) ee2Var.b.getValue()).c();
                        boolean zBooleanValue2 = ((Boolean) ((fee) ee2Var.d.getValue()).c()).booleanValue();
                        String str2 = (String) ee2Var.n;
                        String str3 = (String) ee2Var.o;
                        w3w0 w3w0Var = (w3w0) ((fee) ee2Var.g.getValue()).c();
                        w3w0 w3w0Var2 = (w3w0) ((fee) ee2Var.h.getValue()).c();
                        str.getClass();
                        str2.getClass();
                        str3.getClass();
                        w3w0Var.getClass();
                        w3w0Var2.getClass();
                        if (!zBooleanValue) {
                            str = "";
                        }
                        return new y3w0(str, zBooleanValue2, str2, str3, w3w0Var, w3w0Var2);
                    default:
                        boolean zBooleanValue3 = ((Boolean) ((fee) ee2Var.c.getValue()).c()).booleanValue();
                        w3w0 w3w0Var3 = (w3w0) ((fee) ee2Var.g.getValue()).c();
                        boolean zBooleanValue4 = ((Boolean) ((fee) ee2Var.i.getValue()).c()).booleanValue();
                        w3w0Var3.getClass();
                        return new v3w0(zBooleanValue, zBooleanValue3, w3w0Var3, zBooleanValue4);
                }
            }
        });
        this.k = bkb.G(((fee) n0o0VarH4.getValue()).d, new ep4(ctf0Var, (byte) 11));
        this.l = bkb.G(((fee) n0o0VarH.getValue()).d, new Function1(this) { // from class: a.q79
            public final /* synthetic */ ee2 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b3 = b;
                ee2 ee2Var = this.b;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                switch (b3) {
                    case 0:
                        return Boolean.valueOf((zBooleanValue || !((Boolean) ((fee) ee2Var.c.getValue()).c()).booleanValue() || ((Boolean) ((fee) ee2Var.f.getValue()).c()).booleanValue()) ? false : true);
                    case 1:
                        if (((Boolean) ((fee) ee2Var.f.getValue()).c()).booleanValue()) {
                            return null;
                        }
                        String str = (String) ((fee) ee2Var.b.getValue()).c();
                        boolean zBooleanValue2 = ((Boolean) ((fee) ee2Var.d.getValue()).c()).booleanValue();
                        String str2 = (String) ee2Var.n;
                        String str3 = (String) ee2Var.o;
                        w3w0 w3w0Var = (w3w0) ((fee) ee2Var.g.getValue()).c();
                        w3w0 w3w0Var2 = (w3w0) ((fee) ee2Var.h.getValue()).c();
                        str.getClass();
                        str2.getClass();
                        str3.getClass();
                        w3w0Var.getClass();
                        w3w0Var2.getClass();
                        if (!zBooleanValue) {
                            str = "";
                        }
                        return new y3w0(str, zBooleanValue2, str2, str3, w3w0Var, w3w0Var2);
                    default:
                        boolean zBooleanValue3 = ((Boolean) ((fee) ee2Var.c.getValue()).c()).booleanValue();
                        w3w0 w3w0Var3 = (w3w0) ((fee) ee2Var.g.getValue()).c();
                        boolean zBooleanValue4 = ((Boolean) ((fee) ee2Var.i.getValue()).c()).booleanValue();
                        w3w0Var3.getClass();
                        return new v3w0(zBooleanValue, zBooleanValue3, w3w0Var3, zBooleanValue4);
                }
            }
        });
        final byte b3 = 2;
        this.m = bkb.G(((fee) n0o0VarH3.getValue()).d, new Function1(this) { // from class: a.q79
            public final /* synthetic */ ee2 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b4 = b3;
                ee2 ee2Var = this.b;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                switch (b4) {
                    case 0:
                        return Boolean.valueOf((zBooleanValue || !((Boolean) ((fee) ee2Var.c.getValue()).c()).booleanValue() || ((Boolean) ((fee) ee2Var.f.getValue()).c()).booleanValue()) ? false : true);
                    case 1:
                        if (((Boolean) ((fee) ee2Var.f.getValue()).c()).booleanValue()) {
                            return null;
                        }
                        String str = (String) ((fee) ee2Var.b.getValue()).c();
                        boolean zBooleanValue2 = ((Boolean) ((fee) ee2Var.d.getValue()).c()).booleanValue();
                        String str2 = (String) ee2Var.n;
                        String str3 = (String) ee2Var.o;
                        w3w0 w3w0Var = (w3w0) ((fee) ee2Var.g.getValue()).c();
                        w3w0 w3w0Var2 = (w3w0) ((fee) ee2Var.h.getValue()).c();
                        str.getClass();
                        str2.getClass();
                        str3.getClass();
                        w3w0Var.getClass();
                        w3w0Var2.getClass();
                        if (!zBooleanValue) {
                            str = "";
                        }
                        return new y3w0(str, zBooleanValue2, str2, str3, w3w0Var, w3w0Var2);
                    default:
                        boolean zBooleanValue3 = ((Boolean) ((fee) ee2Var.c.getValue()).c()).booleanValue();
                        w3w0 w3w0Var3 = (w3w0) ((fee) ee2Var.g.getValue()).c();
                        boolean zBooleanValue4 = ((Boolean) ((fee) ee2Var.i.getValue()).c()).booleanValue();
                        w3w0Var3.getClass();
                        return new v3w0(zBooleanValue, zBooleanValue3, w3w0Var3, zBooleanValue4);
                }
            }
        });
    }

    private final Object b(Object obj) {
        o79 o79Var = (o79) obj;
        o79Var.getClass();
        ((fee) this.b.getValue()).d(o79Var.e);
        ((fee) this.c.getValue()).d(Boolean.valueOf(o79Var.g));
        ((fee) this.d.getValue()).d(Boolean.valueOf(o79Var.h));
        ((fee) this.e.getValue()).d(Boolean.valueOf(o79Var.i));
        ((fee) this.f.getValue()).d(Boolean.valueOf(o79Var.j));
        ((fee) this.g.getValue()).d(o79Var.k);
        ((fee) this.h.getValue()).d(o79Var.l);
        ((fee) this.i.getValue()).d(Boolean.valueOf(o79Var.m));
        return new p79((y3w0) ((fee) this.l.getValue()).b(), (v3w0) ((fee) ((n0o0) this.m).getValue()).b(), ((Boolean) ((fee) this.j.getValue()).b()).booleanValue(), (String) ((fee) this.k.getValue()).b());
    }

    private final Object c(Object obj) {
        ftr0 ftr0Var = (ftr0) obj;
        ftr0Var.getClass();
        ((fee) this.b.getValue()).d(ftr0Var.d);
        ((fee) this.c.getValue()).d(ftr0Var.e);
        fee feeVar = (fee) this.d.getValue();
        pur0 pur0Var = ftr0Var.f;
        feeVar.d(pur0Var);
        n0o0 n0o0Var = this.e;
        fee feeVar2 = (fee) n0o0Var.getValue();
        jur0 jur0Var = ftr0Var.h;
        feeVar2.d(jur0Var);
        n0o0 n0o0Var2 = this.f;
        ((fee) n0o0Var2.getValue()).d(ftr0Var.f10129a);
        n0o0 n0o0Var3 = this.i;
        ((fee) n0o0Var3.getValue()).d(ftr0Var.c);
        n0o0 n0o0Var4 = this.l;
        ((fee) n0o0Var4.getValue()).d(pur0Var);
        n0o0 n0o0Var5 = (n0o0) this.m;
        ((fee) n0o0Var5.getValue()).d(jur0Var);
        n0o0 n0o0Var6 = (n0o0) this.o;
        fee feeVar3 = (fee) n0o0Var6.getValue();
        feeVar3.getClass();
        pz40 pz40VarA = feeVar3.a();
        ((ftr0) feeVar3.a().getValue()).getClass();
        pz40VarA.setValue(ftr0Var);
        ug20 ug20Var = ug20.c;
        y00 y00Var = (y00) ((fee) this.g.getValue()).b();
        r820 r820Var = new r820((yy6) ((fee) n0o0Var2.getValue()).b(), null);
        n0o0 n0o0Var7 = this.h;
        List list = (List) ((fee) n0o0Var7.getValue()).b();
        jur0 jur0Var2 = (jur0) ((fee) n0o0Var.getValue()).c();
        list.getClass();
        lc00 lc00VarB = kotlin.collections.a.b();
        lc00VarB.add(new oj80(ij80.f14862a, (yvh0) CollectionsKt.U(list)));
        if (jur0Var2 != null) {
            lc00VarB.add(new oj80(fj80.f9626a, (yvh0) CollectionsKt.d0(list)));
        }
        return new d820(ug20Var, null, null, new zbr(y00Var, r820Var, new wwh0(dyb.r0(kotlin.collections.a.a(lc00VarB)), (a4x) ((fee) n0o0Var7.getValue()).b(), (dxh0) ((fee) n0o0Var3.getValue()).b(), ((Number) ((fee) this.j.getValue()).b()).intValue()), (gf6) ((fee) this.k.getValue()).b(), (bwj0) ((fee) n0o0Var4.getValue()).b(), (b7c0) ((fee) n0o0Var5.getValue()).b(), null, (mtl) ((fee) n0o0Var6.getValue()).b(), true, 1.0f, null), 6);
    }

    private final Object d(Object obj) {
        f2k0 f2k0Var = (f2k0) obj;
        f2k0Var.getClass();
        fee feeVar = (fee) this.b.getValue();
        feeVar.getClass();
        pz40 pz40VarA = feeVar.a();
        pz40VarA.setValue(f2k0Var.b);
        ((fee) this.c.getValue()).d(f2k0Var.f8816a);
        ((fee) this.g.getValue()).d(f2k0Var.c);
        fee feeVar2 = (fee) this.d.getValue();
        feeVar2.getClass();
        pz40 pz40VarA2 = feeVar2.a();
        ((ui5) feeVar2.a().getValue()).getClass();
        pz40VarA2.setValue(f2k0Var.d);
        fee feeVar3 = (fee) this.e.getValue();
        feeVar3.getClass();
        pz40 pz40VarA3 = feeVar3.a();
        ((Boolean) feeVar3.a().getValue()).getClass();
        pz40VarA3.setValue(Boolean.valueOf(f2k0Var.e));
        n0o0 n0o0Var = this.f;
        fee feeVar4 = (fee) n0o0Var.getValue();
        feeVar4.getClass();
        pz40 pz40VarA4 = feeVar4.a();
        ((Integer) feeVar4.a().getValue()).getClass();
        pz40VarA4.setValue(Integer.valueOf(f2k0Var.f));
        return new wk5((imm) this.m, (imm) ((fee) this.h.getValue()).b(), (mi5) ((fee) this.l.getValue()).b(), ((Number) ((fee) n0o0Var.getValue()).c()).intValue());
    }

    private final Object e(Object obj) {
        yan0 van0Var;
        l0l0 l0l0Var;
        yan0 xan0Var;
        tbn0 tbn0Var = (tbn0) obj;
        tbn0Var.getClass();
        fee feeVar = (fee) this.c.getValue();
        feeVar.getClass();
        pz40 pz40VarA = feeVar.a();
        pz40VarA.setValue(tbn0Var.e);
        fee feeVar2 = (fee) this.d.getValue();
        feeVar2.getClass();
        pz40 pz40VarA2 = feeVar2.a();
        ((List) feeVar2.a().getValue()).getClass();
        pz40VarA2.setValue(tbn0Var.f);
        fee feeVar3 = (fee) this.e.getValue();
        feeVar3.getClass();
        pz40 pz40VarA3 = feeVar3.a();
        ((Boolean) feeVar3.a().getValue()).getClass();
        pz40VarA3.setValue(Boolean.valueOf(tbn0Var.g));
        n0o0 n0o0Var = (n0o0) this.o;
        fee feeVar4 = (fee) n0o0Var.getValue();
        feeVar4.getClass();
        pz40 pz40VarA4 = feeVar4.a();
        ((List) feeVar4.a().getValue()).getClass();
        pz40VarA4.setValue(tbn0Var.f33673a);
        n0o0 n0o0Var2 = (n0o0) this.n;
        fee feeVar5 = (fee) n0o0Var2.getValue();
        feeVar5.getClass();
        pz40 pz40VarA5 = feeVar5.a();
        ((zan0) feeVar5.a().getValue()).getClass();
        pz40VarA5.setValue(tbn0Var.d);
        n0o0 n0o0Var3 = this.g;
        fee feeVar6 = (fee) n0o0Var3.getValue();
        feeVar6.getClass();
        pz40 pz40VarA6 = feeVar6.a();
        ((Boolean) feeVar6.a().getValue()).getClass();
        pz40VarA6.setValue(Boolean.valueOf(tbn0Var.h));
        fee feeVar7 = (fee) this.h.getValue();
        feeVar7.getClass();
        pz40 pz40VarA7 = feeVar7.a();
        ((Boolean) feeVar7.a().getValue()).getClass();
        pz40VarA7.setValue(Boolean.valueOf(tbn0Var.i));
        n0o0 n0o0Var4 = this.f;
        fee feeVar8 = (fee) n0o0Var4.getValue();
        feeVar8.getClass();
        pz40 pz40VarA8 = feeVar8.a();
        ((v5l0) feeVar8.a().getValue()).getClass();
        pz40VarA8.setValue(tbn0Var.j);
        n0o0 n0o0Var5 = this.i;
        fee feeVar9 = (fee) n0o0Var5.getValue();
        feeVar9.getClass();
        pz40 pz40VarA9 = feeVar9.a();
        ((Boolean) feeVar9.a().getValue()).getClass();
        pz40VarA9.setValue(Boolean.valueOf(tbn0Var.k));
        n0o0 n0o0Var6 = this.j;
        fee feeVar10 = (fee) n0o0Var6.getValue();
        feeVar10.getClass();
        pz40 pz40VarA10 = feeVar10.a();
        ((tan0) feeVar10.a().getValue()).getClass();
        pz40VarA10.setValue(tbn0Var.c);
        n0o0 n0o0Var7 = this.k;
        fee feeVar11 = (fee) n0o0Var7.getValue();
        feeVar11.getClass();
        pz40 pz40VarA11 = feeVar11.a();
        ((Boolean) feeVar11.a().getValue()).getClass();
        pz40VarA11.setValue(Boolean.valueOf(tbn0Var.b));
        n0o0 n0o0Var8 = this.l;
        fee feeVar12 = (fee) n0o0Var8.getValue();
        feeVar12.getClass();
        pz40 pz40VarA12 = feeVar12.a();
        ((Boolean) feeVar12.a().getValue()).getClass();
        pz40VarA12.setValue(Boolean.valueOf(tbn0Var.l));
        n0o0 n0o0Var9 = (n0o0) this.m;
        fee feeVar13 = (fee) n0o0Var9.getValue();
        feeVar13.getClass();
        pz40 pz40VarA13 = feeVar13.a();
        ((Boolean) feeVar13.a().getValue()).getClass();
        pz40VarA13.setValue(Boolean.valueOf(tbn0Var.m));
        mdm mdmVar = (mdm) ((fee) n0o0Var2.getValue()).b();
        boolean z = false;
        if (((fee) n0o0Var2.getValue()).c() == zan0.f44079a || mdmVar == null) {
            if (!((Collection) ((fee) n0o0Var.getValue()).c()).isEmpty() && ((fee) n0o0Var6.getValue()).c() == tan0.b) {
                xan0Var = new wan0((a4x) ((fee) n0o0Var.getValue()).b(), ((Boolean) ((fee) n0o0Var9.getValue()).c()).booleanValue());
            } else if (((Collection) ((fee) n0o0Var.getValue()).c()).isEmpty() || ((fee) n0o0Var6.getValue()).c() != tan0.c) {
                int i = ((Boolean) ((fee) n0o0Var5.getValue()).c()).booleanValue() ? 12 : 4;
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    int iOrdinal = ((v5l0) ((fee) n0o0Var4.getValue()).c()).ordinal();
                    if (iOrdinal == 0) {
                        l0l0Var = g0l0.f10465a;
                    } else if (iOrdinal == 1) {
                        l0l0Var = k0l0.f17474a;
                    } else if (iOrdinal == 2) {
                        l0l0Var = j0l0.f15687a;
                    } else if (iOrdinal == 3) {
                        l0l0Var = i0l0.f13953a;
                    } else {
                        if (iOrdinal != 4) {
                            t9f.b();
                            return null;
                        }
                        l0l0Var = h0l0.f12241a;
                    }
                    arrayList.add(new x56(l0l0Var));
                }
                van0Var = new van0(dyb.o0(arrayList));
            } else {
                xan0Var = new xan0((a4x) ((fee) n0o0Var.getValue()).b(), ((Boolean) ((fee) n0o0Var7.getValue()).c()).booleanValue(), ((Boolean) ((fee) n0o0Var9.getValue()).c()).booleanValue());
            }
            van0Var = xan0Var;
        } else {
            van0Var = new uan0(mdmVar);
        }
        if (((Boolean) ((fee) n0o0Var8.getValue()).c()).booleanValue() && (van0Var instanceof wan0)) {
            z = true;
        }
        return new ubn0((String) ((fee) this.b.getValue()).c(), ((Boolean) ((fee) n0o0Var3.getValue()).c()).booleanValue(), z, van0Var);
    }

    public qim a() {
        dxh0 dxh0Var;
        ctf0 ctf0Var = (ctf0) this.n;
        String strL = kng0.l(ctf0Var.b.a(R.string.champ_results, Arrays.copyOf(new Object[0], 0)), Separators.SP, ctf0Var.b.a(R.string.live_new, Arrays.copyOf(new Object[0], 0)));
        String strA = ctf0Var.b.a(R.string.feed_title_game_list, Arrays.copyOf(new Object[0], 0));
        n0o0 n0o0Var = this.j;
        boolean zBooleanValue = ((Boolean) ((fee) n0o0Var.getValue()).c()).booleanValue();
        String str = (String) ((fee) this.h.getValue()).c();
        String strA2 = ctf0Var.b.a(R.string.search, Arrays.copyOf(new Object[0], 0));
        n0o0 n0o0Var2 = this.k;
        int i = de2.f5925a[((h8l0) ((fee) n0o0Var2.getValue()).c()).ordinal()];
        gmm dmmVar = fmm.f9790a;
        if (i == 4) {
            skm skmVar = new skm(2, R.drawable.ic_glyph_search, true, (y3d) null, 48);
            if (!((Boolean) ((fee) n0o0Var.getValue()).c()).booleanValue()) {
                dmmVar = new emm(new la50(skmVar));
            }
        } else {
            pz40 pz40Var = s6t0.f31722a;
            wkm wkmVar = new wkm(2, R.drawable.ic_glyph_search, true, ra50.f30118a, s6t0.b().f33626a.getSecondary());
            if (!((Boolean) ((fee) n0o0Var.getValue()).c()).booleanValue()) {
                dmmVar = new dmm(new ta50(wkmVar));
            }
        }
        gmm gmmVar = dmmVar;
        int iOrdinal = ((h8l0) ((fee) n0o0Var2.getValue()).c()).ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return new mim(0, gmmVar, (a4x) lak0.c, strA2, str, strA, strL, zBooleanValue, true);
            }
            if (iOrdinal == 2) {
                return new lim(0, gmmVar, lak0.c, strA, strA2, str, strL, zBooleanValue, true);
            }
            if (iOrdinal == 3) {
                return new nim(0, gmmVar, lak0.c, strA, strA2, str, strL, zBooleanValue, true);
            }
            t9f.b();
            return null;
        }
        lak0 lak0Var = lak0.c;
        int iOrdinal2 = ((zvh0) ((fee) this.i.getValue()).c()).ordinal();
        if (iOrdinal2 == 0) {
            dxh0Var = axh0.f1625a;
        } else if (iOrdinal2 == 1) {
            dxh0Var = zwh0.f45106a;
        } else if (iOrdinal2 == 2) {
            dxh0Var = cxh0.f5122a;
        } else {
            if (iOrdinal2 != 3) {
                t9f.b();
                return null;
            }
            dxh0Var = bxh0.f3376a;
        }
        return new oim(strA, zBooleanValue, strA2, str, true, gmmVar, 0, lak0Var, dxh0Var, strL);
    }

    /* JADX WARN: Code duplicated, block: B:108:0x04d2  */
    /* JADX WARN: Code duplicated, block: B:111:0x0523  */
    /* JADX WARN: Code duplicated, block: B:113:0x052d  */
    /* JADX WARN: Code duplicated, block: B:115:0x0530  */
    /* JADX WARN: Code duplicated, block: B:117:0x0533  */
    /* JADX WARN: Code duplicated, block: B:119:0x0536  */
    /* JADX WARN: Code duplicated, block: B:121:0x0539  */
    /* JADX WARN: Code duplicated, block: B:123:0x055b  */
    /* JADX WARN: Code duplicated, block: B:124:0x0560  */
    /* JADX WARN: Code duplicated, block: B:127:0x056e  */
    /* JADX WARN: Code duplicated, block: B:129:0x0571  */
    /* JADX WARN: Code duplicated, block: B:131:0x0577  */
    /* JADX WARN: Code duplicated, block: B:136:0x05a0  */
    /* JADX WARN: Code duplicated, block: B:138:0x05d6  */
    /* JADX WARN: Code duplicated, block: B:140:0x05f0  */
    /* JADX WARN: Code duplicated, block: B:142:0x0608  */
    /* JADX WARN: Code duplicated, block: B:144:0x062c  */
    /* JADX WARN: Code duplicated, block: B:145:0x062f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:146:0x0631  */
    /* JADX WARN: Code duplicated, block: B:147:0x0634  */
    /* JADX WARN: Code duplicated, block: B:150:0x063c  */
    /* JADX WARN: Code duplicated, block: B:152:0x0640  */
    /* JADX WARN: Code duplicated, block: B:154:0x0646  */
    /* JADX WARN: Code duplicated, block: B:155:0x065a  */
    /* JADX WARN: Code duplicated, block: B:157:0x066f  */
    /* JADX WARN: Code duplicated, block: B:159:0x069e  */
    /* JADX WARN: Code duplicated, block: B:160:0x06b2  */
    /* JADX WARN: Code duplicated, block: B:162:0x06bf  */
    /* JADX WARN: Code duplicated, block: B:164:0x06e1  */
    /* JADX WARN: Code duplicated, block: B:165:0x06e6  */
    /* JADX WARN: Code duplicated, block: B:168:0x06f4  */
    /* JADX WARN: Code duplicated, block: B:169:0x06f6  */
    /* JADX WARN: Code duplicated, block: B:171:0x06fc  */
    /* JADX WARN: Code duplicated, block: B:173:0x0717  */
    /* JADX WARN: Code duplicated, block: B:175:0x071e  */
    /* JADX WARN: Code duplicated, block: B:177:0x0728 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:178:0x072a  */
    /* JADX WARN: Code duplicated, block: B:180:0x072d  */
    /* JADX WARN: Code duplicated, block: B:182:0x0730  */
    /* JADX WARN: Code duplicated, block: B:184:0x0733  */
    /* JADX WARN: Code duplicated, block: B:186:0x0751  */
    /* JADX WARN: Code duplicated, block: B:187:0x0753  */
    /* JADX WARN: Code duplicated, block: B:190:0x0785  */
    /* JADX WARN: Code duplicated, block: B:194:0x078f  */
    /* JADX WARN: Code duplicated, block: B:197:0x07a8  */
    /* JADX WARN: Code duplicated, block: B:199:0x07ac  */
    /* JADX WARN: Code duplicated, block: B:201:0x07b2  */
    /* JADX WARN: Code duplicated, block: B:207:0x07e4  */
    /* JADX WARN: Code duplicated, block: B:209:0x07ea  */
    /* JADX WARN: Code duplicated, block: B:210:0x07ec  */
    /* JADX WARN: Code duplicated, block: B:213:0x07fc  */
    /* JADX WARN: Code duplicated, block: B:217:0x0806  */
    /* JADX WARN: Code duplicated, block: B:220:0x083b  */
    /* JADX WARN: Code duplicated, block: B:222:0x0859  */
    /* JADX WARN: Code duplicated, block: B:225:0x08a4  */
    /* JADX WARN: Code duplicated, block: B:227:0x08c2  */
    /* JADX WARN: Code duplicated, block: B:228:0x08c4  */
    /* JADX WARN: Code duplicated, block: B:231:0x0913  */
    /* JADX WARN: Code duplicated, block: B:235:0x091d  */
    /* JADX WARN: Code duplicated, block: B:238:0x0936  */
    /* JADX WARN: Code duplicated, block: B:241:0x093c  */
    /* JADX WARN: Code duplicated, block: B:243:0x0942  */
    /* JADX WARN: Code duplicated, block: B:244:0x0958  */
    /* JADX WARN: Code duplicated, block: B:247:0x0966  */
    /* JADX WARN: Code duplicated, block: B:248:0x0969 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:249:0x096b  */
    /* JADX WARN: Code duplicated, block: B:250:0x096e  */
    /* JADX WARN: Code duplicated, block: B:252:0x098f  */
    /* JADX WARN: Code duplicated, block: B:254:0x09b6  */
    /* JADX WARN: Code duplicated, block: B:255:0x09b8  */
    /* JADX WARN: Code duplicated, block: B:258:0x0a00  */
    /* JADX WARN: Code duplicated, block: B:262:0x0a0a  */
    /* JADX WARN: Code duplicated, block: B:265:0x0a23  */
    /* JADX WARN: Code duplicated, block: B:266:0x0a35  */
    /* JADX WARN: Code duplicated, block: B:268:0x0a4b  */
    /* JADX WARN: Code duplicated, block: B:270:0x0a69  */
    /* JADX WARN: Code duplicated, block: B:271:0x0a6b  */
    /* JADX WARN: Code duplicated, block: B:274:0x0a9d  */
    /* JADX WARN: Code duplicated, block: B:278:0x0aa7  */
    /* JADX WARN: Code duplicated, block: B:281:0x0ac0  */
    /* JADX WARN: Code duplicated, block: B:282:0x0ac7  */
    /* JADX WARN: Code duplicated, block: B:284:0x0acd  */
    /* JADX WARN: Code duplicated, block: B:287:0x0aec  */
    /* JADX WARN: Code duplicated, block: B:289:0x0af2  */
    /* JADX WARN: Code duplicated, block: B:291:0x0af8  */
    /* JADX WARN: Code duplicated, block: B:293:0x0aff  */
    /* JADX WARN: Code duplicated, block: B:312:0x0b4c  */
    /* JADX WARN: Code duplicated, block: B:315:0x0b63  */
    /* JADX WARN: Code duplicated, block: B:318:0x0b6d  */
    /* JADX WARN: Code duplicated, block: B:324:0x0b84  */
    /* JADX WARN: Code duplicated, block: B:329:0x0b96  */
    /* JADX WARN: Code duplicated, block: B:331:0x0b9c  */
    /* JADX WARN: Code duplicated, block: B:359:0x0bee  */
    /* JADX WARN: Code duplicated, block: B:362:0x0bfd  */
    /* JADX WARN: Code duplicated, block: B:364:0x0c00  */
    /* JADX WARN: Code duplicated, block: B:366:0x0c07  */
    /* JADX WARN: Code duplicated, block: B:368:0x0c0a  */
    /* JADX WARN: Code duplicated, block: B:370:0x0c0d  */
    /* JADX WARN: Code duplicated, block: B:373:0x0c31  */
    /* JADX WARN: Code duplicated, block: B:379:0x0c45  */
    /* JADX WARN: Code duplicated, block: B:383:0x0c51  */
    /* JADX WARN: Code duplicated, block: B:389:0x0c66  */
    /* JADX WARN: Code duplicated, block: B:391:0x0c6b  */
    /* JADX WARN: Code duplicated, block: B:394:0x0cc1  */
    /* JADX WARN: Code duplicated, block: B:396:0x0cc5  */
    /* JADX WARN: Code duplicated, block: B:398:0x0ccb  */
    /* JADX WARN: Code duplicated, block: B:399:0x0cd9  */
    /* JADX WARN: Code duplicated, block: B:402:0x0cff  */
    /* JADX WARN: Code duplicated, block: B:404:0x0d3e  */
    /* JADX WARN: Code duplicated, block: B:406:0x0d58  */
    /* JADX WARN: Code duplicated, block: B:410:0x0d6d  */
    /* JADX WARN: Code duplicated, block: B:416:0x0d80  */
    /* JADX WARN: Code duplicated, block: B:420:0x0d8c  */
    /* JADX WARN: Code duplicated, block: B:426:0x0d9f  */
    /* JADX WARN: Code duplicated, block: B:428:0x0df2  */
    /* JADX WARN: Code duplicated, block: B:431:0x0e22  */
    /* JADX WARN: Code duplicated, block: B:437:0x0e39  */
    /* JADX WARN: Code duplicated, block: B:438:0x0e3c  */
    /* JADX WARN: Code duplicated, block: B:442:0x0e48  */
    /* JADX WARN: Code duplicated, block: B:448:0x0e5f  */
    /* JADX WARN: Code duplicated, block: B:450:0x0e64  */
    /* JADX WARN: Code duplicated, block: B:453:0x0eb4  */
    /* JADX WARN: Code duplicated, block: B:455:0x0eb8  */
    /* JADX WARN: Code duplicated, block: B:457:0x0ebe  */
    /* JADX WARN: Code duplicated, block: B:458:0x0ecc  */
    /* JADX WARN: Code duplicated, block: B:461:0x0eda  */
    /* JADX WARN: Code duplicated, block: B:462:0x0edd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:463:0x0edf  */
    /* JADX WARN: Code duplicated, block: B:464:0x0ee2  */
    /* JADX WARN: Code duplicated, block: B:466:0x0eff  */
    /* JADX WARN: Code duplicated, block: B:468:0x0f44  */
    /* JADX WARN: Code duplicated, block: B:470:0x0f4f  */
    /* JADX WARN: Code duplicated, block: B:472:0x0f5a  */
    /* JADX WARN: Code duplicated, block: B:474:0x0f65  */
    /* JADX WARN: Code duplicated, block: B:477:0x0f81  */
    /* JADX WARN: Code duplicated, block: B:478:0x0f8f  */
    /* JADX WARN: Code duplicated, block: B:480:0x0fa3  */
    /* JADX WARN: Code duplicated, block: B:483:0x0fd4  */
    /* JADX WARN: Code duplicated, block: B:489:0x0fe7  */
    /* JADX WARN: Code duplicated, block: B:493:0x0ff3  */
    /* JADX WARN: Code duplicated, block: B:499:0x1007  */
    /* JADX WARN: Code duplicated, block: B:502:0x1044  */
    /* JADX WARN: Code duplicated, block: B:503:0x1047  */
    /* JADX WARN: Code duplicated, block: B:505:0x104d  */
    /* JADX WARN: Code duplicated, block: B:506:0x105b  */
    /* JADX WARN: Code duplicated, block: B:524:0x059b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:525:0x07df A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:526:0x0cfa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:533:0x04c9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:536:0x04c4 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:541:0x0b52 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:542:0x0aff A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:543:? A[LOOP:7: B:316:0x0b67->B:543:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:544:0x0c40 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:548:0x0c60 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:550:0x0d7b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:553:0x0d9a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:557:0x0e31 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:559:0x0e57 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:562:0x0fe2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:565:0x1002 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x0414 A[LOOP:4: B:71:0x040e->B:73:0x0414, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:76:0x0454  */
    /* JADX WARN: Code duplicated, block: B:79:0x0463  */
    /* JADX WARN: Code duplicated, block: B:80:0x0466  */
    /* JADX WARN: Code duplicated, block: B:83:0x046e  */
    /* JADX WARN: Code duplicated, block: B:84:0x0473  */
    /* JADX WARN: Code duplicated, block: B:86:0x0477  */
    /* JADX WARN: Code duplicated, block: B:87:0x047c  */
    /* JADX WARN: Code duplicated, block: B:89:0x0480  */
    /* JADX WARN: Code duplicated, block: B:90:0x0483  */
    /* JADX WARN: Code duplicated, block: B:92:0x0486  */
    /* JADX WARN: Code duplicated, block: B:93:0x0489  */
    /* JADX WARN: Code duplicated, block: B:97:0x04a6  */
    /* JADX WARN: Code duplicated, block: B:99:0x04b7  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r13v30 java.lang.Object, still in use, count: 2, list:
          (r13v30 java.lang.Object) from 0x03d5: PHI (r13 I:??) = (r13v3 java.lang.Object), (r13v30 java.lang.Object) binds: [B:69:0x03d4, B:530:0x03d5] A[DONT_GENERATE, DONT_INLINE]
          (r13v30 java.lang.Object) from 0x03cb: CHECK_CAST (a.lok0) (r13v30 java.lang.Object)
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
    @Override // a.v6t0
    public final java.lang.Object invoke(java.lang.Object r75) {
        /*
            Method dump skipped, instruction units count: 4316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.ee2.invoke(java.lang.Object):java.lang.Object");
    }

    public ee2(f2k0 f2k0Var, ctf0 ctf0Var, ocl oclVar) {
        final byte b = 3;
        ctf0Var.getClass();
        this.n = ctf0Var;
        this.o = oclVar;
        n0o0 n0o0VarH = bkb.H(f2k0Var.b);
        this.b = n0o0VarH;
        n0o0 n0o0VarH2 = bkb.H(f2k0Var.f8816a);
        this.c = n0o0VarH2;
        n0o0 n0o0VarH3 = bkb.H(f2k0Var.d);
        this.d = n0o0VarH3;
        this.e = bkb.H(Boolean.valueOf(f2k0Var.e));
        this.f = bkb.H(Integer.valueOf(f2k0Var.f));
        n0o0 n0o0VarH4 = bkb.H(f2k0Var.c);
        this.g = n0o0VarH4;
        this.m = bfb.K(ctf0Var);
        final byte b2 = 0;
        this.h = bkb.G(((fee) n0o0VarH2.getValue()).d, new Function1(this) { // from class: a.g2k0
            public final /* synthetic */ ee2 b;

            {
                this.b = this;
            }

            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r11v23 a.m2k0, still in use, count: 2, list:
                  (r11v23 a.m2k0) from 0x01cd: PHI (r11v24 a.m2k0) = (r11v23 a.m2k0), (r11v25 a.m2k0) binds: [B:36:0x01c0, B:127:0x040c] A[DONT_GENERATE, DONT_INLINE]
                  (r11v23 a.m2k0) from 0x0106: MOVE (r38v5 a.m2k0) = (r11v23 a.m2k0) (LINE:263)
                	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
                	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:59)
                	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
                	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
                */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object r61) {
                /*
                    Method dump skipped, instruction units count: 1868
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: a.g2k0.invoke(java.lang.Object):java.lang.Object");
            }
        });
        final byte b3 = 1;
        this.i = bkb.G(((fee) n0o0VarH.getValue()).d, new Function1(this) { // from class: a.g2k0
            public final /* synthetic */ ee2 b;

            {
                this.b = this;
            }

            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r11v23 a.m2k0, still in use, count: 2, list:
                  (r11v23 a.m2k0) from 0x01cd: PHI (r11v24 a.m2k0) = (r11v23 a.m2k0), (r11v25 a.m2k0) binds: [B:36:0x01c0, B:127:0x040c] A[DONT_GENERATE, DONT_INLINE]
                  (r11v23 a.m2k0) from 0x0106: MOVE (r38v5 a.m2k0) = (r11v23 a.m2k0) (LINE:263)
                	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
                	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:59)
                	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
                */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object r61) {
                /*
                    Method dump skipped, instruction units count: 1868
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: a.g2k0.invoke(java.lang.Object):java.lang.Object");
            }
        });
        final byte b4 = 2;
        this.j = bkb.G(((fee) n0o0VarH.getValue()).d, new Function1(this) { // from class: a.g2k0
            public final /* synthetic */ ee2 b;

            {
                this.b = this;
            }

            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r11v23 a.m2k0, still in use, count: 2, list:
                  (r11v23 a.m2k0) from 0x01cd: PHI (r11v24 a.m2k0) = (r11v23 a.m2k0), (r11v25 a.m2k0) binds: [B:36:0x01c0, B:127:0x040c] A[DONT_GENERATE, DONT_INLINE]
                  (r11v23 a.m2k0) from 0x0106: MOVE (r38v5 a.m2k0) = (r11v23 a.m2k0) (LINE:263)
                	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
                	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:59)
                */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object r61) {
                /*
                    Method dump skipped, instruction units count: 1868
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: a.g2k0.invoke(java.lang.Object):java.lang.Object");
            }
        });
        this.k = bkb.G(((fee) n0o0VarH4.getValue()).d, new Function1(this) { // from class: a.g2k0
            public final /* synthetic */ ee2 b;

            {
                this.b = this;
            }

            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r11v23 a.m2k0, still in use, count: 2, list:
                  (r11v23 a.m2k0) from 0x01cd: PHI (r11v24 a.m2k0) = (r11v23 a.m2k0), (r11v25 a.m2k0) binds: [B:36:0x01c0, B:127:0x040c] A[DONT_GENERATE, DONT_INLINE]
                  (r11v23 a.m2k0) from 0x0106: MOVE (r38v5 a.m2k0) = (r11v23 a.m2k0) (LINE:263)
                	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
                */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object r61) {
                /*
                    Method dump skipped, instruction units count: 1868
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: a.g2k0.invoke(java.lang.Object):java.lang.Object");
            }
        });
        final byte b5 = 4;
        this.l = bkb.G(((fee) n0o0VarH3.getValue()).d, new Function1(this) { // from class: a.g2k0
            public final /* synthetic */ ee2 b;

            {
                this.b = this;
            }

            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r11v23 a.m2k0, still in use, count: 2, list:
                  (r11v23 a.m2k0) from 0x01cd: PHI (r11v24 a.m2k0) = (r11v23 a.m2k0), (r11v25 a.m2k0) binds: [B:36:0x01c0, B:127:0x040c] A[DONT_GENERATE, DONT_INLINE]
                  (r11v23 a.m2k0) from 0x0106: MOVE (r38v5 a.m2k0) = (r11v23 a.m2k0) (LINE:263)
                	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object r61) {
                /*
                    Method dump skipped, instruction units count: 1868
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: a.g2k0.invoke(java.lang.Object):java.lang.Object");
            }
        });
    }

    public ee2(ftr0 ftr0Var, ctf0 ctf0Var) {
        final byte b = 2;
        ctf0Var.getClass();
        this.n = ctf0Var;
        n0o0 n0o0VarH = bkb.H(ftr0Var.d);
        this.b = n0o0VarH;
        n0o0 n0o0VarH2 = bkb.H(ftr0Var.e);
        this.c = n0o0VarH2;
        pur0 pur0Var = ftr0Var.f;
        this.d = bkb.H(pur0Var);
        jur0 jur0Var = ftr0Var.h;
        n0o0 n0o0VarH3 = bkb.H(jur0Var);
        this.e = n0o0VarH3;
        final byte b2 = 0;
        n0o0 n0o0VarB = maz.b(new yw9(ftr0Var.f10129a, new Function1(this) { // from class: a.acr
            public final /* synthetic */ ee2 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                BigDecimal bigDecimal;
                rln0 jln0Var;
                lx6 lx6Var;
                lrm jrmVar;
                boolean z;
                byte b3 = b2;
                ee2 ee2Var = this.b;
                switch (b3) {
                    case 0:
                        tjr0 tjr0Var = (tjr0) obj;
                        tjr0Var.getClass();
                        ctf0 ctf0Var2 = (ctf0) ee2Var.n;
                        ctf0Var2.getClass();
                        return new vy6(new vf40(new ngs(ctf0Var2.b.a(R.string.options_selected, Arrays.copyOf(new Object[0], 0))), new j43(String.valueOf(tjr0Var.c), "", c0d.f3518a, false)));
                    case 1:
                        jur0 jur0Var2 = (jur0) obj;
                        ctf0 ctf0Var3 = (ctf0) ee2Var.n;
                        ctf0Var3.getClass();
                        lc00 lc00VarB = kotlin.collections.a.b();
                        lsm0 lsm0Var = ctf0Var3.b;
                        String strA = lsm0Var.a(R.string.bet_type_simple, Arrays.copyOf(new Object[0], 0));
                        bwh0 bwh0Var = bwh0.f3325a;
                        lc00VarB.add(new yvh0(strA, bwh0Var));
                        if (jur0Var2 != null) {
                            lc00VarB.add(new yvh0(lsm0Var.a(R.string.bet_type_promo, Arrays.copyOf(new Object[0], 0)), bwh0Var));
                        }
                        return dyb.r0(kotlin.collections.a.a(lc00VarB));
                    case 2:
                        boolean z2 = true;
                        rm5 rm5Var = (rm5) obj;
                        rm5Var.getClass();
                        BigDecimal bigDecimal2 = ((pur0) ((fee) ee2Var.d.getValue()).c()).f27632a.b;
                        vsr0 vsr0Var = (vsr0) ((fee) ee2Var.b.getValue()).c();
                        ctf0 ctf0Var4 = (ctf0) ee2Var.n;
                        vsr0Var.getClass();
                        ctf0Var4.getClass();
                        lsm0 lsm0Var2 = ctf0Var4.b;
                        vtn vtnVar = new vtn(lsm0Var2.a(R.string.insufficient_funds, Arrays.copyOf(new Object[0], 0)), lsm0Var2.a(R.string.top_up_balance_and_make_bets, Arrays.copyOf(new Object[0], 0)), lsm0Var2.a(R.string.top_up, Arrays.copyOf(new Object[0], 0)));
                        double d = rm5Var.b;
                        if (d != 0.0d) {
                            vtnVar = null;
                        }
                        pn40 pn40Var = pn40.f27267a;
                        String strC = pn40.c(d, p3u0.c);
                        String str = rm5Var.c;
                        if ((d != 0.0d && bigDecimal2.compareTo(new BigDecimal(String.valueOf(d))) <= 0) || rm5Var.f30729a == 0 || !ctf0Var4.i()) {
                            z2 = false;
                        }
                        Boolean boolValueOf = vsr0Var != vsr0.PROMO ? Boolean.valueOf(z2) : null;
                        return new gf6(vtnVar, i30.f14073a, new tw7(strC, str, lsm0Var2.a(R.string.balance, Arrays.copyOf(new Object[0], 0)), boolValueOf != null ? boolValueOf.booleanValue() : false, false));
                    case 3:
                        pur0 pur0Var2 = (pur0) obj;
                        pur0Var2.getClass();
                        ctf0 ctf0Var5 = (ctf0) ee2Var.n;
                        ctf0Var5.getClass();
                        rjr0 rjr0Var = pur0Var2.f27632a;
                        a8q0 a8q0Var = rjr0Var.f30610a;
                        boolean z3 = rjr0Var.h;
                        po7 po7Var = new po7(a8q0Var);
                        lsm0 lsm0Var3 = ctf0Var5.b;
                        sx6 sx6Var = new sx6(po7Var, lsm0Var3.a(R.string.pf_input_sum_title, Arrays.copyOf(new Object[0], 0)), rjr0Var.g, true, false);
                        String str2 = rjr0Var.f;
                        BigDecimal bigDecimal3 = rjr0Var.b;
                        BigDecimal bigDecimal4 = rjr0Var.d;
                        BigDecimal bigDecimal5 = rjr0Var.e;
                        j83 j83Var = a8q0Var.f440a;
                        String str3 = j83Var.b;
                        if ((bigDecimal3.compareTo(bigDecimal4) >= 0 && bigDecimal3.compareTo(bigDecimal5) <= 0) || str3.length() == 0) {
                            jln0Var = new jln0("");
                            bigDecimal = bigDecimal5;
                        } else if (bigDecimal3.compareTo(bigDecimal4) < 0) {
                            int i = cy7.f5159a;
                            pn40 pn40Var2 = pn40.f27267a;
                            jln0Var = new mln0(lsm0Var3.a(R.string.min_sum_v2, Arrays.copyOf(new Object[]{cy7.e(pn40.d(bigDecimal4.doubleValue(), str2, p3u0.c))}, 1)), "");
                            bigDecimal = bigDecimal5;
                        } else {
                            bigDecimal = bigDecimal5;
                            if (bigDecimal3.compareTo(bigDecimal) > 0) {
                                int i2 = cy7.f5159a;
                                pn40 pn40Var3 = pn40.f27267a;
                                jln0Var = new mln0(lsm0Var3.a(R.string.max_sum_v2, Arrays.copyOf(new Object[]{cy7.e(pn40.d(bigDecimal.doubleValue(), str2, p3u0.c))}, 1)), "");
                            } else {
                                jln0Var = new jln0("");
                            }
                        }
                        nke nkeVar = new nke(false, false, bigDecimal3.compareTo(bigDecimal4) > 0 && !z3, bigDecimal3.compareTo(bigDecimal) < 0 && !z3);
                        if (z3) {
                            lx6Var = lx6.c;
                        } else {
                            lx6Var = ((bigDecimal3.compareTo(bigDecimal4) < 0 || bigDecimal3.compareTo(bigDecimal) > 0) && j83Var.b.length() != 0) ? lx6.b : lx6.f20799a;
                        }
                        lx6 lx6Var2 = lx6Var;
                        float fC = 0.0f;
                        if (bigDecimal.compareTo(bigDecimal4) > 0) {
                            BigDecimal bigDecimalSubtract = bigDecimal3.subtract(bigDecimal4);
                            bigDecimalSubtract.getClass();
                            BigDecimal bigDecimalSubtract2 = bigDecimal.subtract(bigDecimal4);
                            bigDecimalSubtract2.getClass();
                            BigDecimal bigDecimalDivide = bigDecimalSubtract.divide(bigDecimalSubtract2, RoundingMode.HALF_EVEN);
                            bigDecimalDivide.getClass();
                            BigDecimal bigDecimalMultiply = bigDecimalDivide.multiply(new BigDecimal(String.valueOf(100.0d)));
                            bigDecimalMultiply.getClass();
                            fC = l1e0.c(bigDecimalMultiply.floatValue(), 0.0f, 100.0f);
                        }
                        float f = fC;
                        if (z3) {
                            jrmVar = krm.f18772a;
                        } else {
                            int i3 = cy7.f5159a;
                            pn40 pn40Var4 = pn40.f27267a;
                            double dDoubleValue = bigDecimal4.doubleValue();
                            p3u0 p3u0Var = p3u0.c;
                            jrmVar = new jrm(new g8k0(6, cy7.e(pn40.d(dDoubleValue, str2, p3u0Var)), null), new g8k0(6, cy7.e(pn40.d(bigDecimal.doubleValue(), str2, p3u0Var)), null));
                        }
                        return new bwj0(new aw6(sx6Var, jln0Var, nkeVar, lx6Var2, new prm(f, jrmVar, null, null, !z3, 118), str2), pur0Var2.b.length() > 0 ? new gxo0(lsm0Var3.a(R.string.tax_bonus_empty, Arrays.copyOf(new Object[0], 0)), lsm0Var3.a(R.string.finaly_sum_bet_description, Arrays.copyOf(new Object[0], 0)), null, false, lak0.c) : null, null);
                    case 4:
                        jur0 jur0Var3 = (jur0) obj;
                        if (jur0Var3 == null) {
                            return null;
                        }
                        ctf0 ctf0Var6 = (ctf0) ee2Var.n;
                        ctf0Var6.getClass();
                        return new b7c0(new bzc0(jur0Var3.b, ctf0Var6.b.a(R.string.enter_promocode, Arrays.copyOf(new Object[0], 0)), false, false), jur0Var3.c ? xyc0.f41702a : xyc0.b, null, null);
                    default:
                        ((ftr0) obj).getClass();
                        rjr0 rjr0Var2 = ((pur0) ((fee) ee2Var.d.getValue()).c()).f27632a;
                        vsr0 vsr0Var2 = (vsr0) ((fee) ee2Var.b.getValue()).c();
                        jur0 jur0Var4 = (jur0) ((fee) ee2Var.e.getValue()).c();
                        boolean z4 = jur0Var4 != null ? jur0Var4.d : false;
                        ctf0 ctf0Var7 = (ctf0) ee2Var.n;
                        vsr0Var2.getClass();
                        ctf0Var7.getClass();
                        iul iulVar = iul.e;
                        oe9 oe9Var = oe9.f25112a;
                        ue9 ue9Var = new ue9(ctf0Var7.b.a(R.string.coupon_make_bet_make, Arrays.copyOf(new Object[0], 0)));
                        if (vsr0Var2 == vsr0.SIMPLE) {
                            BigDecimal bigDecimal6 = rjr0Var2.d;
                            BigDecimal bigDecimal7 = rjr0Var2.e;
                            BigDecimal bigDecimal8 = rjr0Var2.b;
                            z = bigDecimal8.compareTo(bigDecimal6) >= 0 && bigDecimal8.compareTo(bigDecimal7) <= 0 && !rjr0Var2.h;
                        } else {
                            z = z4;
                        }
                        return new mtl(dyb.g0(new itl(new wul(iulVar, oe9Var, ue9Var, z, false, true), ybr.f42352a)));
                }
            }
        }, (byte) 20));
        this.f = n0o0VarB;
        this.g = bkb.G(((fee) n0o0VarB.getValue()).d, new rnp((byte) 29));
        final byte b3 = 1;
        this.h = bkb.G(((fee) n0o0VarH3.getValue()).d, new Function1(this) { // from class: a.acr
            public final /* synthetic */ ee2 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                BigDecimal bigDecimal;
                rln0 jln0Var;
                lx6 lx6Var;
                lrm jrmVar;
                boolean z;
                byte b4 = b3;
                ee2 ee2Var = this.b;
                switch (b4) {
                    case 0:
                        tjr0 tjr0Var = (tjr0) obj;
                        tjr0Var.getClass();
                        ctf0 ctf0Var2 = (ctf0) ee2Var.n;
                        ctf0Var2.getClass();
                        return new vy6(new vf40(new ngs(ctf0Var2.b.a(R.string.options_selected, Arrays.copyOf(new Object[0], 0))), new j43(String.valueOf(tjr0Var.c), "", c0d.f3518a, false)));
                    case 1:
                        jur0 jur0Var2 = (jur0) obj;
                        ctf0 ctf0Var3 = (ctf0) ee2Var.n;
                        ctf0Var3.getClass();
                        lc00 lc00VarB = kotlin.collections.a.b();
                        lsm0 lsm0Var = ctf0Var3.b;
                        String strA = lsm0Var.a(R.string.bet_type_simple, Arrays.copyOf(new Object[0], 0));
                        bwh0 bwh0Var = bwh0.f3325a;
                        lc00VarB.add(new yvh0(strA, bwh0Var));
                        if (jur0Var2 != null) {
                            lc00VarB.add(new yvh0(lsm0Var.a(R.string.bet_type_promo, Arrays.copyOf(new Object[0], 0)), bwh0Var));
                        }
                        return dyb.r0(kotlin.collections.a.a(lc00VarB));
                    case 2:
                        boolean z2 = true;
                        rm5 rm5Var = (rm5) obj;
                        rm5Var.getClass();
                        BigDecimal bigDecimal2 = ((pur0) ((fee) ee2Var.d.getValue()).c()).f27632a.b;
                        vsr0 vsr0Var = (vsr0) ((fee) ee2Var.b.getValue()).c();
                        ctf0 ctf0Var4 = (ctf0) ee2Var.n;
                        vsr0Var.getClass();
                        ctf0Var4.getClass();
                        lsm0 lsm0Var2 = ctf0Var4.b;
                        vtn vtnVar = new vtn(lsm0Var2.a(R.string.insufficient_funds, Arrays.copyOf(new Object[0], 0)), lsm0Var2.a(R.string.top_up_balance_and_make_bets, Arrays.copyOf(new Object[0], 0)), lsm0Var2.a(R.string.top_up, Arrays.copyOf(new Object[0], 0)));
                        double d = rm5Var.b;
                        if (d != 0.0d) {
                            vtnVar = null;
                        }
                        pn40 pn40Var = pn40.f27267a;
                        String strC = pn40.c(d, p3u0.c);
                        String str = rm5Var.c;
                        if ((d != 0.0d && bigDecimal2.compareTo(new BigDecimal(String.valueOf(d))) <= 0) || rm5Var.f30729a == 0 || !ctf0Var4.i()) {
                            z2 = false;
                        }
                        Boolean boolValueOf = vsr0Var != vsr0.PROMO ? Boolean.valueOf(z2) : null;
                        return new gf6(vtnVar, i30.f14073a, new tw7(strC, str, lsm0Var2.a(R.string.balance, Arrays.copyOf(new Object[0], 0)), boolValueOf != null ? boolValueOf.booleanValue() : false, false));
                    case 3:
                        pur0 pur0Var2 = (pur0) obj;
                        pur0Var2.getClass();
                        ctf0 ctf0Var5 = (ctf0) ee2Var.n;
                        ctf0Var5.getClass();
                        rjr0 rjr0Var = pur0Var2.f27632a;
                        a8q0 a8q0Var = rjr0Var.f30610a;
                        boolean z3 = rjr0Var.h;
                        po7 po7Var = new po7(a8q0Var);
                        lsm0 lsm0Var3 = ctf0Var5.b;
                        sx6 sx6Var = new sx6(po7Var, lsm0Var3.a(R.string.pf_input_sum_title, Arrays.copyOf(new Object[0], 0)), rjr0Var.g, true, false);
                        String str2 = rjr0Var.f;
                        BigDecimal bigDecimal3 = rjr0Var.b;
                        BigDecimal bigDecimal4 = rjr0Var.d;
                        BigDecimal bigDecimal5 = rjr0Var.e;
                        j83 j83Var = a8q0Var.f440a;
                        String str3 = j83Var.b;
                        if ((bigDecimal3.compareTo(bigDecimal4) >= 0 && bigDecimal3.compareTo(bigDecimal5) <= 0) || str3.length() == 0) {
                            jln0Var = new jln0("");
                            bigDecimal = bigDecimal5;
                        } else if (bigDecimal3.compareTo(bigDecimal4) < 0) {
                            int i = cy7.f5159a;
                            pn40 pn40Var2 = pn40.f27267a;
                            jln0Var = new mln0(lsm0Var3.a(R.string.min_sum_v2, Arrays.copyOf(new Object[]{cy7.e(pn40.d(bigDecimal4.doubleValue(), str2, p3u0.c))}, 1)), "");
                            bigDecimal = bigDecimal5;
                        } else {
                            bigDecimal = bigDecimal5;
                            if (bigDecimal3.compareTo(bigDecimal) > 0) {
                                int i2 = cy7.f5159a;
                                pn40 pn40Var3 = pn40.f27267a;
                                jln0Var = new mln0(lsm0Var3.a(R.string.max_sum_v2, Arrays.copyOf(new Object[]{cy7.e(pn40.d(bigDecimal.doubleValue(), str2, p3u0.c))}, 1)), "");
                            } else {
                                jln0Var = new jln0("");
                            }
                        }
                        nke nkeVar = new nke(false, false, bigDecimal3.compareTo(bigDecimal4) > 0 && !z3, bigDecimal3.compareTo(bigDecimal) < 0 && !z3);
                        if (z3) {
                            lx6Var = lx6.c;
                        } else {
                            lx6Var = ((bigDecimal3.compareTo(bigDecimal4) < 0 || bigDecimal3.compareTo(bigDecimal) > 0) && j83Var.b.length() != 0) ? lx6.b : lx6.f20799a;
                        }
                        lx6 lx6Var2 = lx6Var;
                        float fC = 0.0f;
                        if (bigDecimal.compareTo(bigDecimal4) > 0) {
                            BigDecimal bigDecimalSubtract = bigDecimal3.subtract(bigDecimal4);
                            bigDecimalSubtract.getClass();
                            BigDecimal bigDecimalSubtract2 = bigDecimal.subtract(bigDecimal4);
                            bigDecimalSubtract2.getClass();
                            BigDecimal bigDecimalDivide = bigDecimalSubtract.divide(bigDecimalSubtract2, RoundingMode.HALF_EVEN);
                            bigDecimalDivide.getClass();
                            BigDecimal bigDecimalMultiply = bigDecimalDivide.multiply(new BigDecimal(String.valueOf(100.0d)));
                            bigDecimalMultiply.getClass();
                            fC = l1e0.c(bigDecimalMultiply.floatValue(), 0.0f, 100.0f);
                        }
                        float f = fC;
                        if (z3) {
                            jrmVar = krm.f18772a;
                        } else {
                            int i3 = cy7.f5159a;
                            pn40 pn40Var4 = pn40.f27267a;
                            double dDoubleValue = bigDecimal4.doubleValue();
                            p3u0 p3u0Var = p3u0.c;
                            jrmVar = new jrm(new g8k0(6, cy7.e(pn40.d(dDoubleValue, str2, p3u0Var)), null), new g8k0(6, cy7.e(pn40.d(bigDecimal.doubleValue(), str2, p3u0Var)), null));
                        }
                        return new bwj0(new aw6(sx6Var, jln0Var, nkeVar, lx6Var2, new prm(f, jrmVar, null, null, !z3, 118), str2), pur0Var2.b.length() > 0 ? new gxo0(lsm0Var3.a(R.string.tax_bonus_empty, Arrays.copyOf(new Object[0], 0)), lsm0Var3.a(R.string.finaly_sum_bet_description, Arrays.copyOf(new Object[0], 0)), null, false, lak0.c) : null, null);
                    case 4:
                        jur0 jur0Var3 = (jur0) obj;
                        if (jur0Var3 == null) {
                            return null;
                        }
                        ctf0 ctf0Var6 = (ctf0) ee2Var.n;
                        ctf0Var6.getClass();
                        return new b7c0(new bzc0(jur0Var3.b, ctf0Var6.b.a(R.string.enter_promocode, Arrays.copyOf(new Object[0], 0)), false, false), jur0Var3.c ? xyc0.f41702a : xyc0.b, null, null);
                    default:
                        ((ftr0) obj).getClass();
                        rjr0 rjr0Var2 = ((pur0) ((fee) ee2Var.d.getValue()).c()).f27632a;
                        vsr0 vsr0Var2 = (vsr0) ((fee) ee2Var.b.getValue()).c();
                        jur0 jur0Var4 = (jur0) ((fee) ee2Var.e.getValue()).c();
                        boolean z4 = jur0Var4 != null ? jur0Var4.d : false;
                        ctf0 ctf0Var7 = (ctf0) ee2Var.n;
                        vsr0Var2.getClass();
                        ctf0Var7.getClass();
                        iul iulVar = iul.e;
                        oe9 oe9Var = oe9.f25112a;
                        ue9 ue9Var = new ue9(ctf0Var7.b.a(R.string.coupon_make_bet_make, Arrays.copyOf(new Object[0], 0)));
                        if (vsr0Var2 == vsr0.SIMPLE) {
                            BigDecimal bigDecimal6 = rjr0Var2.d;
                            BigDecimal bigDecimal7 = rjr0Var2.e;
                            BigDecimal bigDecimal8 = rjr0Var2.b;
                            z = bigDecimal8.compareTo(bigDecimal6) >= 0 && bigDecimal8.compareTo(bigDecimal7) <= 0 && !rjr0Var2.h;
                        } else {
                            z = z4;
                        }
                        return new mtl(dyb.g0(new itl(new wul(iulVar, oe9Var, ue9Var, z, false, true), ybr.f42352a)));
                }
            }
        });
        this.i = maz.b(new yw9(ftr0Var.c, new dcr((byte) 0), (byte) 20));
        this.j = bkb.G(((fee) n0o0VarH.getValue()).d, new dcr((byte) 1));
        this.k = bkb.G(((fee) n0o0VarH2.getValue()).d, new Function1(this) { // from class: a.acr
            public final /* synthetic */ ee2 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                BigDecimal bigDecimal;
                rln0 jln0Var;
                lx6 lx6Var;
                lrm jrmVar;
                boolean z;
                byte b4 = b;
                ee2 ee2Var = this.b;
                switch (b4) {
                    case 0:
                        tjr0 tjr0Var = (tjr0) obj;
                        tjr0Var.getClass();
                        ctf0 ctf0Var2 = (ctf0) ee2Var.n;
                        ctf0Var2.getClass();
                        return new vy6(new vf40(new ngs(ctf0Var2.b.a(R.string.options_selected, Arrays.copyOf(new Object[0], 0))), new j43(String.valueOf(tjr0Var.c), "", c0d.f3518a, false)));
                    case 1:
                        jur0 jur0Var2 = (jur0) obj;
                        ctf0 ctf0Var3 = (ctf0) ee2Var.n;
                        ctf0Var3.getClass();
                        lc00 lc00VarB = kotlin.collections.a.b();
                        lsm0 lsm0Var = ctf0Var3.b;
                        String strA = lsm0Var.a(R.string.bet_type_simple, Arrays.copyOf(new Object[0], 0));
                        bwh0 bwh0Var = bwh0.f3325a;
                        lc00VarB.add(new yvh0(strA, bwh0Var));
                        if (jur0Var2 != null) {
                            lc00VarB.add(new yvh0(lsm0Var.a(R.string.bet_type_promo, Arrays.copyOf(new Object[0], 0)), bwh0Var));
                        }
                        return dyb.r0(kotlin.collections.a.a(lc00VarB));
                    case 2:
                        boolean z2 = true;
                        rm5 rm5Var = (rm5) obj;
                        rm5Var.getClass();
                        BigDecimal bigDecimal2 = ((pur0) ((fee) ee2Var.d.getValue()).c()).f27632a.b;
                        vsr0 vsr0Var = (vsr0) ((fee) ee2Var.b.getValue()).c();
                        ctf0 ctf0Var4 = (ctf0) ee2Var.n;
                        vsr0Var.getClass();
                        ctf0Var4.getClass();
                        lsm0 lsm0Var2 = ctf0Var4.b;
                        vtn vtnVar = new vtn(lsm0Var2.a(R.string.insufficient_funds, Arrays.copyOf(new Object[0], 0)), lsm0Var2.a(R.string.top_up_balance_and_make_bets, Arrays.copyOf(new Object[0], 0)), lsm0Var2.a(R.string.top_up, Arrays.copyOf(new Object[0], 0)));
                        double d = rm5Var.b;
                        if (d != 0.0d) {
                            vtnVar = null;
                        }
                        pn40 pn40Var = pn40.f27267a;
                        String strC = pn40.c(d, p3u0.c);
                        String str = rm5Var.c;
                        if ((d != 0.0d && bigDecimal2.compareTo(new BigDecimal(String.valueOf(d))) <= 0) || rm5Var.f30729a == 0 || !ctf0Var4.i()) {
                            z2 = false;
                        }
                        Boolean boolValueOf = vsr0Var != vsr0.PROMO ? Boolean.valueOf(z2) : null;
                        return new gf6(vtnVar, i30.f14073a, new tw7(strC, str, lsm0Var2.a(R.string.balance, Arrays.copyOf(new Object[0], 0)), boolValueOf != null ? boolValueOf.booleanValue() : false, false));
                    case 3:
                        pur0 pur0Var2 = (pur0) obj;
                        pur0Var2.getClass();
                        ctf0 ctf0Var5 = (ctf0) ee2Var.n;
                        ctf0Var5.getClass();
                        rjr0 rjr0Var = pur0Var2.f27632a;
                        a8q0 a8q0Var = rjr0Var.f30610a;
                        boolean z3 = rjr0Var.h;
                        po7 po7Var = new po7(a8q0Var);
                        lsm0 lsm0Var3 = ctf0Var5.b;
                        sx6 sx6Var = new sx6(po7Var, lsm0Var3.a(R.string.pf_input_sum_title, Arrays.copyOf(new Object[0], 0)), rjr0Var.g, true, false);
                        String str2 = rjr0Var.f;
                        BigDecimal bigDecimal3 = rjr0Var.b;
                        BigDecimal bigDecimal4 = rjr0Var.d;
                        BigDecimal bigDecimal5 = rjr0Var.e;
                        j83 j83Var = a8q0Var.f440a;
                        String str3 = j83Var.b;
                        if ((bigDecimal3.compareTo(bigDecimal4) >= 0 && bigDecimal3.compareTo(bigDecimal5) <= 0) || str3.length() == 0) {
                            jln0Var = new jln0("");
                            bigDecimal = bigDecimal5;
                        } else if (bigDecimal3.compareTo(bigDecimal4) < 0) {
                            int i = cy7.f5159a;
                            pn40 pn40Var2 = pn40.f27267a;
                            jln0Var = new mln0(lsm0Var3.a(R.string.min_sum_v2, Arrays.copyOf(new Object[]{cy7.e(pn40.d(bigDecimal4.doubleValue(), str2, p3u0.c))}, 1)), "");
                            bigDecimal = bigDecimal5;
                        } else {
                            bigDecimal = bigDecimal5;
                            if (bigDecimal3.compareTo(bigDecimal) > 0) {
                                int i2 = cy7.f5159a;
                                pn40 pn40Var3 = pn40.f27267a;
                                jln0Var = new mln0(lsm0Var3.a(R.string.max_sum_v2, Arrays.copyOf(new Object[]{cy7.e(pn40.d(bigDecimal.doubleValue(), str2, p3u0.c))}, 1)), "");
                            } else {
                                jln0Var = new jln0("");
                            }
                        }
                        nke nkeVar = new nke(false, false, bigDecimal3.compareTo(bigDecimal4) > 0 && !z3, bigDecimal3.compareTo(bigDecimal) < 0 && !z3);
                        if (z3) {
                            lx6Var = lx6.c;
                        } else {
                            lx6Var = ((bigDecimal3.compareTo(bigDecimal4) < 0 || bigDecimal3.compareTo(bigDecimal) > 0) && j83Var.b.length() != 0) ? lx6.b : lx6.f20799a;
                        }
                        lx6 lx6Var2 = lx6Var;
                        float fC = 0.0f;
                        if (bigDecimal.compareTo(bigDecimal4) > 0) {
                            BigDecimal bigDecimalSubtract = bigDecimal3.subtract(bigDecimal4);
                            bigDecimalSubtract.getClass();
                            BigDecimal bigDecimalSubtract2 = bigDecimal.subtract(bigDecimal4);
                            bigDecimalSubtract2.getClass();
                            BigDecimal bigDecimalDivide = bigDecimalSubtract.divide(bigDecimalSubtract2, RoundingMode.HALF_EVEN);
                            bigDecimalDivide.getClass();
                            BigDecimal bigDecimalMultiply = bigDecimalDivide.multiply(new BigDecimal(String.valueOf(100.0d)));
                            bigDecimalMultiply.getClass();
                            fC = l1e0.c(bigDecimalMultiply.floatValue(), 0.0f, 100.0f);
                        }
                        float f = fC;
                        if (z3) {
                            jrmVar = krm.f18772a;
                        } else {
                            int i3 = cy7.f5159a;
                            pn40 pn40Var4 = pn40.f27267a;
                            double dDoubleValue = bigDecimal4.doubleValue();
                            p3u0 p3u0Var = p3u0.c;
                            jrmVar = new jrm(new g8k0(6, cy7.e(pn40.d(dDoubleValue, str2, p3u0Var)), null), new g8k0(6, cy7.e(pn40.d(bigDecimal.doubleValue(), str2, p3u0Var)), null));
                        }
                        return new bwj0(new aw6(sx6Var, jln0Var, nkeVar, lx6Var2, new prm(f, jrmVar, null, null, !z3, 118), str2), pur0Var2.b.length() > 0 ? new gxo0(lsm0Var3.a(R.string.tax_bonus_empty, Arrays.copyOf(new Object[0], 0)), lsm0Var3.a(R.string.finaly_sum_bet_description, Arrays.copyOf(new Object[0], 0)), null, false, lak0.c) : null, null);
                    case 4:
                        jur0 jur0Var3 = (jur0) obj;
                        if (jur0Var3 == null) {
                            return null;
                        }
                        ctf0 ctf0Var6 = (ctf0) ee2Var.n;
                        ctf0Var6.getClass();
                        return new b7c0(new bzc0(jur0Var3.b, ctf0Var6.b.a(R.string.enter_promocode, Arrays.copyOf(new Object[0], 0)), false, false), jur0Var3.c ? xyc0.f41702a : xyc0.b, null, null);
                    default:
                        ((ftr0) obj).getClass();
                        rjr0 rjr0Var2 = ((pur0) ((fee) ee2Var.d.getValue()).c()).f27632a;
                        vsr0 vsr0Var2 = (vsr0) ((fee) ee2Var.b.getValue()).c();
                        jur0 jur0Var4 = (jur0) ((fee) ee2Var.e.getValue()).c();
                        boolean z4 = jur0Var4 != null ? jur0Var4.d : false;
                        ctf0 ctf0Var7 = (ctf0) ee2Var.n;
                        vsr0Var2.getClass();
                        ctf0Var7.getClass();
                        iul iulVar = iul.e;
                        oe9 oe9Var = oe9.f25112a;
                        ue9 ue9Var = new ue9(ctf0Var7.b.a(R.string.coupon_make_bet_make, Arrays.copyOf(new Object[0], 0)));
                        if (vsr0Var2 == vsr0.SIMPLE) {
                            BigDecimal bigDecimal6 = rjr0Var2.d;
                            BigDecimal bigDecimal7 = rjr0Var2.e;
                            BigDecimal bigDecimal8 = rjr0Var2.b;
                            z = bigDecimal8.compareTo(bigDecimal6) >= 0 && bigDecimal8.compareTo(bigDecimal7) <= 0 && !rjr0Var2.h;
                        } else {
                            z = z4;
                        }
                        return new mtl(dyb.g0(new itl(new wul(iulVar, oe9Var, ue9Var, z, false, true), ybr.f42352a)));
                }
            }
        });
        final byte b4 = 3;
        this.l = maz.b(new yw9(pur0Var, new Function1(this) { // from class: a.acr
            public final /* synthetic */ ee2 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                BigDecimal bigDecimal;
                rln0 jln0Var;
                lx6 lx6Var;
                lrm jrmVar;
                boolean z;
                byte b5 = b4;
                ee2 ee2Var = this.b;
                switch (b5) {
                    case 0:
                        tjr0 tjr0Var = (tjr0) obj;
                        tjr0Var.getClass();
                        ctf0 ctf0Var2 = (ctf0) ee2Var.n;
                        ctf0Var2.getClass();
                        return new vy6(new vf40(new ngs(ctf0Var2.b.a(R.string.options_selected, Arrays.copyOf(new Object[0], 0))), new j43(String.valueOf(tjr0Var.c), "", c0d.f3518a, false)));
                    case 1:
                        jur0 jur0Var2 = (jur0) obj;
                        ctf0 ctf0Var3 = (ctf0) ee2Var.n;
                        ctf0Var3.getClass();
                        lc00 lc00VarB = kotlin.collections.a.b();
                        lsm0 lsm0Var = ctf0Var3.b;
                        String strA = lsm0Var.a(R.string.bet_type_simple, Arrays.copyOf(new Object[0], 0));
                        bwh0 bwh0Var = bwh0.f3325a;
                        lc00VarB.add(new yvh0(strA, bwh0Var));
                        if (jur0Var2 != null) {
                            lc00VarB.add(new yvh0(lsm0Var.a(R.string.bet_type_promo, Arrays.copyOf(new Object[0], 0)), bwh0Var));
                        }
                        return dyb.r0(kotlin.collections.a.a(lc00VarB));
                    case 2:
                        boolean z2 = true;
                        rm5 rm5Var = (rm5) obj;
                        rm5Var.getClass();
                        BigDecimal bigDecimal2 = ((pur0) ((fee) ee2Var.d.getValue()).c()).f27632a.b;
                        vsr0 vsr0Var = (vsr0) ((fee) ee2Var.b.getValue()).c();
                        ctf0 ctf0Var4 = (ctf0) ee2Var.n;
                        vsr0Var.getClass();
                        ctf0Var4.getClass();
                        lsm0 lsm0Var2 = ctf0Var4.b;
                        vtn vtnVar = new vtn(lsm0Var2.a(R.string.insufficient_funds, Arrays.copyOf(new Object[0], 0)), lsm0Var2.a(R.string.top_up_balance_and_make_bets, Arrays.copyOf(new Object[0], 0)), lsm0Var2.a(R.string.top_up, Arrays.copyOf(new Object[0], 0)));
                        double d = rm5Var.b;
                        if (d != 0.0d) {
                            vtnVar = null;
                        }
                        pn40 pn40Var = pn40.f27267a;
                        String strC = pn40.c(d, p3u0.c);
                        String str = rm5Var.c;
                        if ((d != 0.0d && bigDecimal2.compareTo(new BigDecimal(String.valueOf(d))) <= 0) || rm5Var.f30729a == 0 || !ctf0Var4.i()) {
                            z2 = false;
                        }
                        Boolean boolValueOf = vsr0Var != vsr0.PROMO ? Boolean.valueOf(z2) : null;
                        return new gf6(vtnVar, i30.f14073a, new tw7(strC, str, lsm0Var2.a(R.string.balance, Arrays.copyOf(new Object[0], 0)), boolValueOf != null ? boolValueOf.booleanValue() : false, false));
                    case 3:
                        pur0 pur0Var2 = (pur0) obj;
                        pur0Var2.getClass();
                        ctf0 ctf0Var5 = (ctf0) ee2Var.n;
                        ctf0Var5.getClass();
                        rjr0 rjr0Var = pur0Var2.f27632a;
                        a8q0 a8q0Var = rjr0Var.f30610a;
                        boolean z3 = rjr0Var.h;
                        po7 po7Var = new po7(a8q0Var);
                        lsm0 lsm0Var3 = ctf0Var5.b;
                        sx6 sx6Var = new sx6(po7Var, lsm0Var3.a(R.string.pf_input_sum_title, Arrays.copyOf(new Object[0], 0)), rjr0Var.g, true, false);
                        String str2 = rjr0Var.f;
                        BigDecimal bigDecimal3 = rjr0Var.b;
                        BigDecimal bigDecimal4 = rjr0Var.d;
                        BigDecimal bigDecimal5 = rjr0Var.e;
                        j83 j83Var = a8q0Var.f440a;
                        String str3 = j83Var.b;
                        if ((bigDecimal3.compareTo(bigDecimal4) >= 0 && bigDecimal3.compareTo(bigDecimal5) <= 0) || str3.length() == 0) {
                            jln0Var = new jln0("");
                            bigDecimal = bigDecimal5;
                        } else if (bigDecimal3.compareTo(bigDecimal4) < 0) {
                            int i = cy7.f5159a;
                            pn40 pn40Var2 = pn40.f27267a;
                            jln0Var = new mln0(lsm0Var3.a(R.string.min_sum_v2, Arrays.copyOf(new Object[]{cy7.e(pn40.d(bigDecimal4.doubleValue(), str2, p3u0.c))}, 1)), "");
                            bigDecimal = bigDecimal5;
                        } else {
                            bigDecimal = bigDecimal5;
                            if (bigDecimal3.compareTo(bigDecimal) > 0) {
                                int i2 = cy7.f5159a;
                                pn40 pn40Var3 = pn40.f27267a;
                                jln0Var = new mln0(lsm0Var3.a(R.string.max_sum_v2, Arrays.copyOf(new Object[]{cy7.e(pn40.d(bigDecimal.doubleValue(), str2, p3u0.c))}, 1)), "");
                            } else {
                                jln0Var = new jln0("");
                            }
                        }
                        nke nkeVar = new nke(false, false, bigDecimal3.compareTo(bigDecimal4) > 0 && !z3, bigDecimal3.compareTo(bigDecimal) < 0 && !z3);
                        if (z3) {
                            lx6Var = lx6.c;
                        } else {
                            lx6Var = ((bigDecimal3.compareTo(bigDecimal4) < 0 || bigDecimal3.compareTo(bigDecimal) > 0) && j83Var.b.length() != 0) ? lx6.b : lx6.f20799a;
                        }
                        lx6 lx6Var2 = lx6Var;
                        float fC = 0.0f;
                        if (bigDecimal.compareTo(bigDecimal4) > 0) {
                            BigDecimal bigDecimalSubtract = bigDecimal3.subtract(bigDecimal4);
                            bigDecimalSubtract.getClass();
                            BigDecimal bigDecimalSubtract2 = bigDecimal.subtract(bigDecimal4);
                            bigDecimalSubtract2.getClass();
                            BigDecimal bigDecimalDivide = bigDecimalSubtract.divide(bigDecimalSubtract2, RoundingMode.HALF_EVEN);
                            bigDecimalDivide.getClass();
                            BigDecimal bigDecimalMultiply = bigDecimalDivide.multiply(new BigDecimal(String.valueOf(100.0d)));
                            bigDecimalMultiply.getClass();
                            fC = l1e0.c(bigDecimalMultiply.floatValue(), 0.0f, 100.0f);
                        }
                        float f = fC;
                        if (z3) {
                            jrmVar = krm.f18772a;
                        } else {
                            int i3 = cy7.f5159a;
                            pn40 pn40Var4 = pn40.f27267a;
                            double dDoubleValue = bigDecimal4.doubleValue();
                            p3u0 p3u0Var = p3u0.c;
                            jrmVar = new jrm(new g8k0(6, cy7.e(pn40.d(dDoubleValue, str2, p3u0Var)), null), new g8k0(6, cy7.e(pn40.d(bigDecimal.doubleValue(), str2, p3u0Var)), null));
                        }
                        return new bwj0(new aw6(sx6Var, jln0Var, nkeVar, lx6Var2, new prm(f, jrmVar, null, null, !z3, 118), str2), pur0Var2.b.length() > 0 ? new gxo0(lsm0Var3.a(R.string.tax_bonus_empty, Arrays.copyOf(new Object[0], 0)), lsm0Var3.a(R.string.finaly_sum_bet_description, Arrays.copyOf(new Object[0], 0)), null, false, lak0.c) : null, null);
                    case 4:
                        jur0 jur0Var3 = (jur0) obj;
                        if (jur0Var3 == null) {
                            return null;
                        }
                        ctf0 ctf0Var6 = (ctf0) ee2Var.n;
                        ctf0Var6.getClass();
                        return new b7c0(new bzc0(jur0Var3.b, ctf0Var6.b.a(R.string.enter_promocode, Arrays.copyOf(new Object[0], 0)), false, false), jur0Var3.c ? xyc0.f41702a : xyc0.b, null, null);
                    default:
                        ((ftr0) obj).getClass();
                        rjr0 rjr0Var2 = ((pur0) ((fee) ee2Var.d.getValue()).c()).f27632a;
                        vsr0 vsr0Var2 = (vsr0) ((fee) ee2Var.b.getValue()).c();
                        jur0 jur0Var4 = (jur0) ((fee) ee2Var.e.getValue()).c();
                        boolean z4 = jur0Var4 != null ? jur0Var4.d : false;
                        ctf0 ctf0Var7 = (ctf0) ee2Var.n;
                        vsr0Var2.getClass();
                        ctf0Var7.getClass();
                        iul iulVar = iul.e;
                        oe9 oe9Var = oe9.f25112a;
                        ue9 ue9Var = new ue9(ctf0Var7.b.a(R.string.coupon_make_bet_make, Arrays.copyOf(new Object[0], 0)));
                        if (vsr0Var2 == vsr0.SIMPLE) {
                            BigDecimal bigDecimal6 = rjr0Var2.d;
                            BigDecimal bigDecimal7 = rjr0Var2.e;
                            BigDecimal bigDecimal8 = rjr0Var2.b;
                            z = bigDecimal8.compareTo(bigDecimal6) >= 0 && bigDecimal8.compareTo(bigDecimal7) <= 0 && !rjr0Var2.h;
                        } else {
                            z = z4;
                        }
                        return new mtl(dyb.g0(new itl(new wul(iulVar, oe9Var, ue9Var, z, false, true), ybr.f42352a)));
                }
            }
        }, (byte) 20));
        final byte b5 = 4;
        this.m = maz.b(new yw9(jur0Var, new Function1(this) { // from class: a.acr
            public final /* synthetic */ ee2 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                BigDecimal bigDecimal;
                rln0 jln0Var;
                lx6 lx6Var;
                lrm jrmVar;
                boolean z;
                byte b6 = b5;
                ee2 ee2Var = this.b;
                switch (b6) {
                    case 0:
                        tjr0 tjr0Var = (tjr0) obj;
                        tjr0Var.getClass();
                        ctf0 ctf0Var2 = (ctf0) ee2Var.n;
                        ctf0Var2.getClass();
                        return new vy6(new vf40(new ngs(ctf0Var2.b.a(R.string.options_selected, Arrays.copyOf(new Object[0], 0))), new j43(String.valueOf(tjr0Var.c), "", c0d.f3518a, false)));
                    case 1:
                        jur0 jur0Var2 = (jur0) obj;
                        ctf0 ctf0Var3 = (ctf0) ee2Var.n;
                        ctf0Var3.getClass();
                        lc00 lc00VarB = kotlin.collections.a.b();
                        lsm0 lsm0Var = ctf0Var3.b;
                        String strA = lsm0Var.a(R.string.bet_type_simple, Arrays.copyOf(new Object[0], 0));
                        bwh0 bwh0Var = bwh0.f3325a;
                        lc00VarB.add(new yvh0(strA, bwh0Var));
                        if (jur0Var2 != null) {
                            lc00VarB.add(new yvh0(lsm0Var.a(R.string.bet_type_promo, Arrays.copyOf(new Object[0], 0)), bwh0Var));
                        }
                        return dyb.r0(kotlin.collections.a.a(lc00VarB));
                    case 2:
                        boolean z2 = true;
                        rm5 rm5Var = (rm5) obj;
                        rm5Var.getClass();
                        BigDecimal bigDecimal2 = ((pur0) ((fee) ee2Var.d.getValue()).c()).f27632a.b;
                        vsr0 vsr0Var = (vsr0) ((fee) ee2Var.b.getValue()).c();
                        ctf0 ctf0Var4 = (ctf0) ee2Var.n;
                        vsr0Var.getClass();
                        ctf0Var4.getClass();
                        lsm0 lsm0Var2 = ctf0Var4.b;
                        vtn vtnVar = new vtn(lsm0Var2.a(R.string.insufficient_funds, Arrays.copyOf(new Object[0], 0)), lsm0Var2.a(R.string.top_up_balance_and_make_bets, Arrays.copyOf(new Object[0], 0)), lsm0Var2.a(R.string.top_up, Arrays.copyOf(new Object[0], 0)));
                        double d = rm5Var.b;
                        if (d != 0.0d) {
                            vtnVar = null;
                        }
                        pn40 pn40Var = pn40.f27267a;
                        String strC = pn40.c(d, p3u0.c);
                        String str = rm5Var.c;
                        if ((d != 0.0d && bigDecimal2.compareTo(new BigDecimal(String.valueOf(d))) <= 0) || rm5Var.f30729a == 0 || !ctf0Var4.i()) {
                            z2 = false;
                        }
                        Boolean boolValueOf = vsr0Var != vsr0.PROMO ? Boolean.valueOf(z2) : null;
                        return new gf6(vtnVar, i30.f14073a, new tw7(strC, str, lsm0Var2.a(R.string.balance, Arrays.copyOf(new Object[0], 0)), boolValueOf != null ? boolValueOf.booleanValue() : false, false));
                    case 3:
                        pur0 pur0Var2 = (pur0) obj;
                        pur0Var2.getClass();
                        ctf0 ctf0Var5 = (ctf0) ee2Var.n;
                        ctf0Var5.getClass();
                        rjr0 rjr0Var = pur0Var2.f27632a;
                        a8q0 a8q0Var = rjr0Var.f30610a;
                        boolean z3 = rjr0Var.h;
                        po7 po7Var = new po7(a8q0Var);
                        lsm0 lsm0Var3 = ctf0Var5.b;
                        sx6 sx6Var = new sx6(po7Var, lsm0Var3.a(R.string.pf_input_sum_title, Arrays.copyOf(new Object[0], 0)), rjr0Var.g, true, false);
                        String str2 = rjr0Var.f;
                        BigDecimal bigDecimal3 = rjr0Var.b;
                        BigDecimal bigDecimal4 = rjr0Var.d;
                        BigDecimal bigDecimal5 = rjr0Var.e;
                        j83 j83Var = a8q0Var.f440a;
                        String str3 = j83Var.b;
                        if ((bigDecimal3.compareTo(bigDecimal4) >= 0 && bigDecimal3.compareTo(bigDecimal5) <= 0) || str3.length() == 0) {
                            jln0Var = new jln0("");
                            bigDecimal = bigDecimal5;
                        } else if (bigDecimal3.compareTo(bigDecimal4) < 0) {
                            int i = cy7.f5159a;
                            pn40 pn40Var2 = pn40.f27267a;
                            jln0Var = new mln0(lsm0Var3.a(R.string.min_sum_v2, Arrays.copyOf(new Object[]{cy7.e(pn40.d(bigDecimal4.doubleValue(), str2, p3u0.c))}, 1)), "");
                            bigDecimal = bigDecimal5;
                        } else {
                            bigDecimal = bigDecimal5;
                            if (bigDecimal3.compareTo(bigDecimal) > 0) {
                                int i2 = cy7.f5159a;
                                pn40 pn40Var3 = pn40.f27267a;
                                jln0Var = new mln0(lsm0Var3.a(R.string.max_sum_v2, Arrays.copyOf(new Object[]{cy7.e(pn40.d(bigDecimal.doubleValue(), str2, p3u0.c))}, 1)), "");
                            } else {
                                jln0Var = new jln0("");
                            }
                        }
                        nke nkeVar = new nke(false, false, bigDecimal3.compareTo(bigDecimal4) > 0 && !z3, bigDecimal3.compareTo(bigDecimal) < 0 && !z3);
                        if (z3) {
                            lx6Var = lx6.c;
                        } else {
                            lx6Var = ((bigDecimal3.compareTo(bigDecimal4) < 0 || bigDecimal3.compareTo(bigDecimal) > 0) && j83Var.b.length() != 0) ? lx6.b : lx6.f20799a;
                        }
                        lx6 lx6Var2 = lx6Var;
                        float fC = 0.0f;
                        if (bigDecimal.compareTo(bigDecimal4) > 0) {
                            BigDecimal bigDecimalSubtract = bigDecimal3.subtract(bigDecimal4);
                            bigDecimalSubtract.getClass();
                            BigDecimal bigDecimalSubtract2 = bigDecimal.subtract(bigDecimal4);
                            bigDecimalSubtract2.getClass();
                            BigDecimal bigDecimalDivide = bigDecimalSubtract.divide(bigDecimalSubtract2, RoundingMode.HALF_EVEN);
                            bigDecimalDivide.getClass();
                            BigDecimal bigDecimalMultiply = bigDecimalDivide.multiply(new BigDecimal(String.valueOf(100.0d)));
                            bigDecimalMultiply.getClass();
                            fC = l1e0.c(bigDecimalMultiply.floatValue(), 0.0f, 100.0f);
                        }
                        float f = fC;
                        if (z3) {
                            jrmVar = krm.f18772a;
                        } else {
                            int i3 = cy7.f5159a;
                            pn40 pn40Var4 = pn40.f27267a;
                            double dDoubleValue = bigDecimal4.doubleValue();
                            p3u0 p3u0Var = p3u0.c;
                            jrmVar = new jrm(new g8k0(6, cy7.e(pn40.d(dDoubleValue, str2, p3u0Var)), null), new g8k0(6, cy7.e(pn40.d(bigDecimal.doubleValue(), str2, p3u0Var)), null));
                        }
                        return new bwj0(new aw6(sx6Var, jln0Var, nkeVar, lx6Var2, new prm(f, jrmVar, null, null, !z3, 118), str2), pur0Var2.b.length() > 0 ? new gxo0(lsm0Var3.a(R.string.tax_bonus_empty, Arrays.copyOf(new Object[0], 0)), lsm0Var3.a(R.string.finaly_sum_bet_description, Arrays.copyOf(new Object[0], 0)), null, false, lak0.c) : null, null);
                    case 4:
                        jur0 jur0Var3 = (jur0) obj;
                        if (jur0Var3 == null) {
                            return null;
                        }
                        ctf0 ctf0Var6 = (ctf0) ee2Var.n;
                        ctf0Var6.getClass();
                        return new b7c0(new bzc0(jur0Var3.b, ctf0Var6.b.a(R.string.enter_promocode, Arrays.copyOf(new Object[0], 0)), false, false), jur0Var3.c ? xyc0.f41702a : xyc0.b, null, null);
                    default:
                        ((ftr0) obj).getClass();
                        rjr0 rjr0Var2 = ((pur0) ((fee) ee2Var.d.getValue()).c()).f27632a;
                        vsr0 vsr0Var2 = (vsr0) ((fee) ee2Var.b.getValue()).c();
                        jur0 jur0Var4 = (jur0) ((fee) ee2Var.e.getValue()).c();
                        boolean z4 = jur0Var4 != null ? jur0Var4.d : false;
                        ctf0 ctf0Var7 = (ctf0) ee2Var.n;
                        vsr0Var2.getClass();
                        ctf0Var7.getClass();
                        iul iulVar = iul.e;
                        oe9 oe9Var = oe9.f25112a;
                        ue9 ue9Var = new ue9(ctf0Var7.b.a(R.string.coupon_make_bet_make, Arrays.copyOf(new Object[0], 0)));
                        if (vsr0Var2 == vsr0.SIMPLE) {
                            BigDecimal bigDecimal6 = rjr0Var2.d;
                            BigDecimal bigDecimal7 = rjr0Var2.e;
                            BigDecimal bigDecimal8 = rjr0Var2.b;
                            z = bigDecimal8.compareTo(bigDecimal6) >= 0 && bigDecimal8.compareTo(bigDecimal7) <= 0 && !rjr0Var2.h;
                        } else {
                            z = z4;
                        }
                        return new mtl(dyb.g0(new itl(new wul(iulVar, oe9Var, ue9Var, z, false, true), ybr.f42352a)));
                }
            }
        }, (byte) 20));
        final byte b6 = 5;
        this.o = maz.b(new yw9(ftr0Var, new Function1(this) { // from class: a.acr
            public final /* synthetic */ ee2 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                BigDecimal bigDecimal;
                rln0 jln0Var;
                lx6 lx6Var;
                lrm jrmVar;
                boolean z;
                byte b7 = b6;
                ee2 ee2Var = this.b;
                switch (b7) {
                    case 0:
                        tjr0 tjr0Var = (tjr0) obj;
                        tjr0Var.getClass();
                        ctf0 ctf0Var2 = (ctf0) ee2Var.n;
                        ctf0Var2.getClass();
                        return new vy6(new vf40(new ngs(ctf0Var2.b.a(R.string.options_selected, Arrays.copyOf(new Object[0], 0))), new j43(String.valueOf(tjr0Var.c), "", c0d.f3518a, false)));
                    case 1:
                        jur0 jur0Var2 = (jur0) obj;
                        ctf0 ctf0Var3 = (ctf0) ee2Var.n;
                        ctf0Var3.getClass();
                        lc00 lc00VarB = kotlin.collections.a.b();
                        lsm0 lsm0Var = ctf0Var3.b;
                        String strA = lsm0Var.a(R.string.bet_type_simple, Arrays.copyOf(new Object[0], 0));
                        bwh0 bwh0Var = bwh0.f3325a;
                        lc00VarB.add(new yvh0(strA, bwh0Var));
                        if (jur0Var2 != null) {
                            lc00VarB.add(new yvh0(lsm0Var.a(R.string.bet_type_promo, Arrays.copyOf(new Object[0], 0)), bwh0Var));
                        }
                        return dyb.r0(kotlin.collections.a.a(lc00VarB));
                    case 2:
                        boolean z2 = true;
                        rm5 rm5Var = (rm5) obj;
                        rm5Var.getClass();
                        BigDecimal bigDecimal2 = ((pur0) ((fee) ee2Var.d.getValue()).c()).f27632a.b;
                        vsr0 vsr0Var = (vsr0) ((fee) ee2Var.b.getValue()).c();
                        ctf0 ctf0Var4 = (ctf0) ee2Var.n;
                        vsr0Var.getClass();
                        ctf0Var4.getClass();
                        lsm0 lsm0Var2 = ctf0Var4.b;
                        vtn vtnVar = new vtn(lsm0Var2.a(R.string.insufficient_funds, Arrays.copyOf(new Object[0], 0)), lsm0Var2.a(R.string.top_up_balance_and_make_bets, Arrays.copyOf(new Object[0], 0)), lsm0Var2.a(R.string.top_up, Arrays.copyOf(new Object[0], 0)));
                        double d = rm5Var.b;
                        if (d != 0.0d) {
                            vtnVar = null;
                        }
                        pn40 pn40Var = pn40.f27267a;
                        String strC = pn40.c(d, p3u0.c);
                        String str = rm5Var.c;
                        if ((d != 0.0d && bigDecimal2.compareTo(new BigDecimal(String.valueOf(d))) <= 0) || rm5Var.f30729a == 0 || !ctf0Var4.i()) {
                            z2 = false;
                        }
                        Boolean boolValueOf = vsr0Var != vsr0.PROMO ? Boolean.valueOf(z2) : null;
                        return new gf6(vtnVar, i30.f14073a, new tw7(strC, str, lsm0Var2.a(R.string.balance, Arrays.copyOf(new Object[0], 0)), boolValueOf != null ? boolValueOf.booleanValue() : false, false));
                    case 3:
                        pur0 pur0Var2 = (pur0) obj;
                        pur0Var2.getClass();
                        ctf0 ctf0Var5 = (ctf0) ee2Var.n;
                        ctf0Var5.getClass();
                        rjr0 rjr0Var = pur0Var2.f27632a;
                        a8q0 a8q0Var = rjr0Var.f30610a;
                        boolean z3 = rjr0Var.h;
                        po7 po7Var = new po7(a8q0Var);
                        lsm0 lsm0Var3 = ctf0Var5.b;
                        sx6 sx6Var = new sx6(po7Var, lsm0Var3.a(R.string.pf_input_sum_title, Arrays.copyOf(new Object[0], 0)), rjr0Var.g, true, false);
                        String str2 = rjr0Var.f;
                        BigDecimal bigDecimal3 = rjr0Var.b;
                        BigDecimal bigDecimal4 = rjr0Var.d;
                        BigDecimal bigDecimal5 = rjr0Var.e;
                        j83 j83Var = a8q0Var.f440a;
                        String str3 = j83Var.b;
                        if ((bigDecimal3.compareTo(bigDecimal4) >= 0 && bigDecimal3.compareTo(bigDecimal5) <= 0) || str3.length() == 0) {
                            jln0Var = new jln0("");
                            bigDecimal = bigDecimal5;
                        } else if (bigDecimal3.compareTo(bigDecimal4) < 0) {
                            int i = cy7.f5159a;
                            pn40 pn40Var2 = pn40.f27267a;
                            jln0Var = new mln0(lsm0Var3.a(R.string.min_sum_v2, Arrays.copyOf(new Object[]{cy7.e(pn40.d(bigDecimal4.doubleValue(), str2, p3u0.c))}, 1)), "");
                            bigDecimal = bigDecimal5;
                        } else {
                            bigDecimal = bigDecimal5;
                            if (bigDecimal3.compareTo(bigDecimal) > 0) {
                                int i2 = cy7.f5159a;
                                pn40 pn40Var3 = pn40.f27267a;
                                jln0Var = new mln0(lsm0Var3.a(R.string.max_sum_v2, Arrays.copyOf(new Object[]{cy7.e(pn40.d(bigDecimal.doubleValue(), str2, p3u0.c))}, 1)), "");
                            } else {
                                jln0Var = new jln0("");
                            }
                        }
                        nke nkeVar = new nke(false, false, bigDecimal3.compareTo(bigDecimal4) > 0 && !z3, bigDecimal3.compareTo(bigDecimal) < 0 && !z3);
                        if (z3) {
                            lx6Var = lx6.c;
                        } else {
                            lx6Var = ((bigDecimal3.compareTo(bigDecimal4) < 0 || bigDecimal3.compareTo(bigDecimal) > 0) && j83Var.b.length() != 0) ? lx6.b : lx6.f20799a;
                        }
                        lx6 lx6Var2 = lx6Var;
                        float fC = 0.0f;
                        if (bigDecimal.compareTo(bigDecimal4) > 0) {
                            BigDecimal bigDecimalSubtract = bigDecimal3.subtract(bigDecimal4);
                            bigDecimalSubtract.getClass();
                            BigDecimal bigDecimalSubtract2 = bigDecimal.subtract(bigDecimal4);
                            bigDecimalSubtract2.getClass();
                            BigDecimal bigDecimalDivide = bigDecimalSubtract.divide(bigDecimalSubtract2, RoundingMode.HALF_EVEN);
                            bigDecimalDivide.getClass();
                            BigDecimal bigDecimalMultiply = bigDecimalDivide.multiply(new BigDecimal(String.valueOf(100.0d)));
                            bigDecimalMultiply.getClass();
                            fC = l1e0.c(bigDecimalMultiply.floatValue(), 0.0f, 100.0f);
                        }
                        float f = fC;
                        if (z3) {
                            jrmVar = krm.f18772a;
                        } else {
                            int i3 = cy7.f5159a;
                            pn40 pn40Var4 = pn40.f27267a;
                            double dDoubleValue = bigDecimal4.doubleValue();
                            p3u0 p3u0Var = p3u0.c;
                            jrmVar = new jrm(new g8k0(6, cy7.e(pn40.d(dDoubleValue, str2, p3u0Var)), null), new g8k0(6, cy7.e(pn40.d(bigDecimal.doubleValue(), str2, p3u0Var)), null));
                        }
                        return new bwj0(new aw6(sx6Var, jln0Var, nkeVar, lx6Var2, new prm(f, jrmVar, null, null, !z3, 118), str2), pur0Var2.b.length() > 0 ? new gxo0(lsm0Var3.a(R.string.tax_bonus_empty, Arrays.copyOf(new Object[0], 0)), lsm0Var3.a(R.string.finaly_sum_bet_description, Arrays.copyOf(new Object[0], 0)), null, false, lak0.c) : null, null);
                    case 4:
                        jur0 jur0Var3 = (jur0) obj;
                        if (jur0Var3 == null) {
                            return null;
                        }
                        ctf0 ctf0Var6 = (ctf0) ee2Var.n;
                        ctf0Var6.getClass();
                        return new b7c0(new bzc0(jur0Var3.b, ctf0Var6.b.a(R.string.enter_promocode, Arrays.copyOf(new Object[0], 0)), false, false), jur0Var3.c ? xyc0.f41702a : xyc0.b, null, null);
                    default:
                        ((ftr0) obj).getClass();
                        rjr0 rjr0Var2 = ((pur0) ((fee) ee2Var.d.getValue()).c()).f27632a;
                        vsr0 vsr0Var2 = (vsr0) ((fee) ee2Var.b.getValue()).c();
                        jur0 jur0Var4 = (jur0) ((fee) ee2Var.e.getValue()).c();
                        boolean z4 = jur0Var4 != null ? jur0Var4.d : false;
                        ctf0 ctf0Var7 = (ctf0) ee2Var.n;
                        vsr0Var2.getClass();
                        ctf0Var7.getClass();
                        iul iulVar = iul.e;
                        oe9 oe9Var = oe9.f25112a;
                        ue9 ue9Var = new ue9(ctf0Var7.b.a(R.string.coupon_make_bet_make, Arrays.copyOf(new Object[0], 0)));
                        if (vsr0Var2 == vsr0.SIMPLE) {
                            BigDecimal bigDecimal6 = rjr0Var2.d;
                            BigDecimal bigDecimal7 = rjr0Var2.e;
                            BigDecimal bigDecimal8 = rjr0Var2.b;
                            z = bigDecimal8.compareTo(bigDecimal6) >= 0 && bigDecimal8.compareTo(bigDecimal7) <= 0 && !rjr0Var2.h;
                        } else {
                            z = z4;
                        }
                        return new mtl(dyb.g0(new itl(new wul(iulVar, oe9Var, ue9Var, z, false, true), ybr.f42352a)));
                }
            }
        }, (byte) 20));
    }

    public ee2(ifs0 ifs0Var, ctf0 ctf0Var, ocl oclVar) {
        ctf0Var.getClass();
        this.o = ifs0Var;
        this.n = ctf0Var;
        this.m = oclVar;
        n0o0 n0o0VarH = bkb.H(ifs0Var.c);
        this.b = n0o0VarH;
        n0o0 n0o0VarH2 = bkb.H(ifs0Var.i);
        this.c = n0o0VarH2;
        n0o0 n0o0VarH3 = bkb.H(ifs0Var.b);
        this.d = n0o0VarH3;
        n0o0 n0o0VarH4 = bkb.H(ifs0Var.d);
        this.e = n0o0VarH4;
        n0o0 n0o0VarH5 = bkb.H(Boolean.valueOf(ifs0Var.e));
        this.f = n0o0VarH5;
        this.g = maz.b(new yw9((fee) n0o0VarH4.getValue(), new g4s0((byte) 16), (byte) 20));
        this.h = maz.b(new yw9((fee) n0o0VarH.getValue(), new g4s0((byte) 17), (byte) 20));
        this.i = maz.b(new yw9((fee) n0o0VarH3.getValue(), new g4s0((byte) 18), (byte) 20));
        this.j = maz.b(new yw9((fee) n0o0VarH5.getValue(), new g4s0((byte) 19), (byte) 20));
        final byte b = 0;
        this.k = maz.b(new yw9((fee) n0o0VarH.getValue(), new Function1(this) { // from class: a.nfs0
            public final /* synthetic */ ee2 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:73:0x0269  */
            /* JADX WARN: Code duplicated, block: B:74:0x026d  */
            /* JADX WARN: Code duplicated, block: B:80:0x028c  */
            /* JADX WARN: Code duplicated, block: B:82:0x0293  */
            /* JADX WARN: Code duplicated, block: B:83:0x02a1  */
            /* JADX WARN: Code duplicated, block: B:88:0x02b7  */
            /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v11 java.lang.Object, still in use, count: 2, list:
                  (r5v11 java.lang.Object) from 0x0221: PHI (r5 I:??) = (r5v4 java.lang.Object), (r5v11 java.lang.Object) binds: [B:70:0x021f, B:102:0x0221] A[DONT_GENERATE, DONT_INLINE]
                  (r5v11 java.lang.Object) from 0x0211: CHECK_CAST (a.xco) (r5v11 java.lang.Object)
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
            public final java.lang.Object invoke(java.lang.Object r27) {
                /*
                    Method dump skipped, instruction units count: 876
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: a.nfs0.invoke(java.lang.Object):java.lang.Object");
            }
        }, (byte) 20));
        fee feeVar = (fee) n0o0VarH2.getValue();
        final byte b2 = 1;
        this.l = maz.b(new yw9(feeVar, new Function1(this) { // from class: a.nfs0
            public final /* synthetic */ ee2 b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:73:0x0269  */
            /* JADX WARN: Code duplicated, block: B:74:0x026d  */
            /* JADX WARN: Code duplicated, block: B:80:0x028c  */
            /* JADX WARN: Code duplicated, block: B:82:0x0293  */
            /* JADX WARN: Code duplicated, block: B:83:0x02a1  */
            /* JADX WARN: Code duplicated, block: B:88:0x02b7  */
            /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v11 java.lang.Object, still in use, count: 2, list:
                  (r5v11 java.lang.Object) from 0x0221: PHI (r5 I:??) = (r5v4 java.lang.Object), (r5v11 java.lang.Object) binds: [B:70:0x021f, B:102:0x0221] A[DONT_GENERATE, DONT_INLINE]
                  (r5v11 java.lang.Object) from 0x0211: CHECK_CAST (a.xco) (r5v11 java.lang.Object)
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
            public final java.lang.Object invoke(java.lang.Object r27) {
                /*
                    Method dump skipped, instruction units count: 876
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: a.nfs0.invoke(java.lang.Object):java.lang.Object");
            }
        }, (byte) 20));
    }

    public ee2(tbn0 tbn0Var, ctf0 ctf0Var, y78 y78Var, g2v g2vVar) {
        ctf0Var.getClass();
        this.b = bkb.H(ctf0Var.b.a(R.string.notifications_title, Arrays.copyOf(new Object[0], 0)));
        this.c = bkb.H(tbn0Var.e);
        this.d = bkb.H(tbn0Var.f);
        this.e = bkb.H(Boolean.valueOf(tbn0Var.g));
        this.f = bkb.H(tbn0Var.j);
        this.g = bkb.H(Boolean.valueOf(tbn0Var.h));
        this.h = bkb.H(Boolean.valueOf(tbn0Var.i));
        this.i = bkb.H(Boolean.valueOf(tbn0Var.k));
        this.j = bkb.H(tbn0Var.c);
        this.k = bkb.H(Boolean.valueOf(tbn0Var.b));
        this.l = bkb.H(Boolean.valueOf(tbn0Var.l));
        this.m = bkb.H(Boolean.valueOf(tbn0Var.m));
        this.n = maz.b(new yw9(tbn0Var.d, new rib(g2vVar, (byte) 6), (byte) 20));
        this.o = maz.b(new yw9(tbn0Var.f33673a, new nej0((Object) this, (Object) ctf0Var, (Object) y78Var, (byte) 13), (byte) 20));
    }

    public ee2(ctf0 ctf0Var, y78 y78Var, ce2 ce2Var) {
        ctf0Var.getClass();
        this.n = ctf0Var;
        this.o = y78Var;
        this.b = bkb.H(ce2Var.k);
        this.c = bkb.H(ce2Var.i);
        this.d = bkb.H(Boolean.valueOf(ce2Var.l));
        this.e = bkb.H(ce2Var.d);
        this.f = bkb.H(Boolean.valueOf(ce2Var.m));
        this.g = bkb.H(Boolean.valueOf(ce2Var.b));
        this.h = bkb.H(ce2Var.f4192a);
        this.i = bkb.H(ce2Var.f);
        this.j = bkb.H(Boolean.valueOf(ce2Var.h));
        this.k = bkb.H(ce2Var.e);
        this.l = bkb.H(Integer.valueOf(ce2Var.g));
        this.m = bkb.H(Boolean.valueOf(ce2Var.n));
    }
}
