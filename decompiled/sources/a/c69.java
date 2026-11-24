package a;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class c69 implements v6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f3807a = 2;
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
    public final n0o0 m;
    public final Object n;
    public final Object o;
    public final Object p;

    public c69(ctf0 ctf0Var, nfe0 nfe0Var) {
        ctf0Var.getClass();
        this.n = ctf0Var;
        this.b = bkb.H(nfe0Var.f23433a);
        this.c = bkb.H(Long.valueOf(nfe0Var.b));
        n0o0 n0o0VarH = bkb.H(Integer.valueOf(nfe0Var.c));
        this.d = n0o0VarH;
        n0o0 n0o0VarH2 = bkb.H(Boolean.valueOf(nfe0Var.d));
        this.e = n0o0VarH2;
        this.f = bkb.H(Boolean.valueOf(nfe0Var.e));
        this.g = bkb.H(nfe0Var.i);
        this.h = bkb.H(nfe0Var.h);
        this.i = maz.b(new yw9(nfe0Var.f, new bod0((byte) 18), (byte) 20));
        n0o0 n0o0VarB = maz.b(new yw9(nfe0Var.g, new bod0((byte) 19), (byte) 20));
        this.j = n0o0VarB;
        this.k = bkb.G(((fee) n0o0VarH.getValue()).d, new bod0((byte) 20));
        this.l = bkb.G(((fee) n0o0VarH.getValue()).d, new bod0((byte) 21));
        this.o = new aml((pt0) ((fee) n0o0VarB.getValue()).b(), xll.f41078a, true);
        pz40 pz40Var = s6t0.f31722a;
        this.p = new imm(new ilm(s6t0.b().f33626a.getSecondary()), new plm(ctf0Var.b.a(R.string.recommendation, Arrays.copyOf(new Object[0], 0)), s6t0.b().f33626a.getSecondary(), fa50.f9191a), new dmm(new ta50(new wkm(1, R.drawable.ic_glyph_search, true, ra50.f30118a, s6t0.b().f33626a.getSecondary()))), s6t0.b().f33626a.getBackgroundContent(), false, null);
        this.m = bkb.G(((fee) n0o0VarH2.getValue()).d, new v6d0(this, (byte) 21));
    }

    public String a(fwu0 fwu0Var, boolean z) {
        int i;
        int iOrdinal = fwu0Var.f10278a.ordinal();
        if (iOrdinal == 0) {
            i = z ? R.string.top_up : R.string.pay_out_title;
        } else if (iOrdinal == 1) {
            i = R.string.top_up_main_balance;
        } else {
            if (iOrdinal != 2) {
                t9f.b();
                return null;
            }
            i = R.string.top_up_active_balance;
        }
        return ((ctf0) this.p).b.a(i, Arrays.copyOf(new Object[0], 0));
    }

    @Override // a.v6t0
    public final Object invoke(Object obj) {
        Object obj2;
        yee0 wee0Var;
        byte b = this.f3807a;
        Object obj3 = this.p;
        Object obj4 = this.o;
        n0o0 n0o0Var = this.l;
        n0o0 n0o0Var2 = this.k;
        Object obj5 = this.n;
        n0o0 n0o0Var3 = this.m;
        n0o0 n0o0Var4 = this.j;
        n0o0 n0o0Var5 = this.i;
        n0o0 n0o0Var6 = this.h;
        n0o0 n0o0Var7 = this.g;
        n0o0 n0o0Var8 = this.f;
        n0o0 n0o0Var9 = this.e;
        n0o0 n0o0Var10 = this.d;
        n0o0 n0o0Var11 = this.c;
        n0o0 n0o0Var12 = this.b;
        switch (b) {
            case 0:
                z59 z59Var = (z59) obj;
                z59Var.getClass();
                ((fee) n0o0Var12.getValue()).d(z59Var.e);
                ((fee) n0o0Var11.getValue()).d(Boolean.valueOf(z59Var.f));
                ((fee) n0o0Var10.getValue()).d(Boolean.valueOf(z59Var.g));
                ((fee) n0o0Var9.getValue()).d(Boolean.valueOf(z59Var.h));
                ((fee) n0o0Var8.getValue()).d(Boolean.valueOf(z59Var.i));
                ((fee) n0o0Var7.getValue()).d(Boolean.valueOf(z59Var.l));
                ((fee) n0o0Var6.getValue()).d(Boolean.valueOf(z59Var.m));
                ((fee) n0o0Var5.getValue()).d(Boolean.valueOf(z59Var.k));
                ((fee) n0o0Var4.getValue()).d(z59Var.s);
                return new a69((efu0) ((fee) ((n0o0) obj4).getValue()).b(), (eke) ((fee) ((n0o0) obj3).getValue()).b(), ((Boolean) ((fee) n0o0Var3.getValue()).b()).booleanValue(), (mdm) ((fee) ((n0o0) obj5).getValue()).b(), ((Boolean) ((fee) n0o0Var6.getValue()).c()).booleanValue());
            case 1:
                sg20 sg20Var = (sg20) obj;
                sg20Var.getClass();
                fee feeVar = (fee) n0o0Var12.getValue();
                feeVar.getClass();
                pz40 pz40VarA = feeVar.a();
                ((ky6) feeVar.a().getValue()).getClass();
                pz40VarA.setValue(sg20Var.b);
                fee feeVar2 = (fee) n0o0Var11.getValue();
                feeVar2.getClass();
                pz40 pz40VarA2 = feeVar2.a();
                ((ym5) feeVar2.a().getValue()).getClass();
                pz40VarA2.setValue(sg20Var.c);
                fee feeVar3 = (fee) n0o0Var10.getValue();
                feeVar3.getClass();
                pz40 pz40VarA3 = feeVar3.a();
                ((eo7) feeVar3.a().getValue()).getClass();
                pz40VarA3.setValue(sg20Var.d);
                fee feeVar4 = (fee) n0o0Var9.getValue();
                feeVar4.getClass();
                pz40 pz40VarA4 = feeVar4.a();
                ((qvj0) feeVar4.a().getValue()).getClass();
                pz40VarA4.setValue(sg20Var.e);
                fee feeVar5 = (fee) n0o0Var8.getValue();
                feeVar5.getClass();
                pz40 pz40VarA5 = feeVar5.a();
                ((ifc0) feeVar5.a().getValue()).getClass();
                pz40VarA5.setValue(sg20Var.f);
                fee feeVar6 = (fee) n0o0Var7.getValue();
                feeVar6.getClass();
                pz40 pz40VarA6 = feeVar6.a();
                ((Boolean) feeVar6.a().getValue()).getClass();
                pz40VarA6.setValue(Boolean.valueOf(sg20Var.h));
                fee feeVar7 = (fee) n0o0Var6.getValue();
                feeVar7.getClass();
                pz40 pz40VarA7 = feeVar7.a();
                ((Boolean) feeVar7.a().getValue()).getClass();
                pz40VarA7.setValue(Boolean.valueOf(sg20Var.j));
                return new d820((ug20) obj3, null, new jp30(new q820((xy6) ((fee) n0o0Var4.getValue()).b()), (vwh0) ((fee) n0o0Var2.getValue()).b(), (ff6) ((fee) n0o0Var.getValue()).b(), (awj0) ((fee) n0o0Var3.getValue()).b(), (a7c0) ((fee) ((n0o0) obj5).getValue()).b(), null, (xw00) ((fee) n0o0Var5.getValue()).b(), 1.0f, null), null, 8);
            case 2:
                nfe0 nfe0Var = (nfe0) obj;
                nfe0Var.getClass();
                ((fee) n0o0Var12.getValue()).d(nfe0Var.f23433a);
                Object obj6 = obj3;
                ((fee) n0o0Var11.getValue()).d(Long.valueOf(nfe0Var.b));
                ((fee) n0o0Var10.getValue()).d(Integer.valueOf(nfe0Var.c));
                ((fee) n0o0Var9.getValue()).d(Boolean.valueOf(nfe0Var.d));
                ((fee) n0o0Var8.getValue()).d(Boolean.valueOf(nfe0Var.e));
                ((fee) n0o0Var7.getValue()).d(nfe0Var.i);
                ((fee) n0o0Var6.getValue()).d(nfe0Var.h);
                ((fee) n0o0Var5.getValue()).d(nfe0Var.f);
                aie aieVar = (aie) ((fee) n0o0Var12.getValue()).c();
                if (aieVar instanceof uge) {
                    pt0 pt0Var = (pt0) ((fee) n0o0Var4.getValue()).b();
                    List<mlr> list = ((uge) aieVar).f35621a;
                    ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                    for (mlr mlrVar : list) {
                        arrayList.add(ccq0.Z(mlrVar, (ctf0) obj5, ((Boolean) ((fee) n0o0Var9.getValue()).c()).booleanValue(), ((Boolean) ((fee) n0o0Var8.getValue()).c()).booleanValue(), ((Set) ((fee) n0o0Var6.getValue()).c()).contains(Long.valueOf(mlrVar.f22006a)), (pt0) ((fee) n0o0Var4.getValue()).b(), null));
                        obj6 = obj6;
                    }
                    obj2 = obj6;
                    wee0Var = new vee0(new zll(pt0Var, xll.f41078a, arrayList));
                } else {
                    obj2 = obj6;
                    if (aieVar instanceof ohe) {
                        wee0Var = new xee0((aml) obj4);
                    } else if (Intrinsics.d(aieVar, yge.f42579a)) {
                        wee0Var = new wee0((mdm) ((fee) n0o0Var2.getValue()).b());
                    } else {
                        if (!Intrinsics.d(aieVar, fhe.f9537a)) {
                            t9f.b();
                            return null;
                        }
                        wee0Var = new wee0((mdm) ((fee) n0o0Var.getValue()).b());
                    }
                }
                return new ofe0((imm) obj2, (see0) ((fee) n0o0Var3.getValue()).b(), wee0Var);
            default:
                txu0 txu0Var = (txu0) obj;
                txu0Var.getClass();
                fee feeVar8 = (fee) n0o0Var12.getValue();
                feeVar8.getClass();
                pz40 pz40VarA8 = feeVar8.a();
                ((Boolean) feeVar8.a().getValue()).getClass();
                boolean z = txu0Var.f34721a;
                pz40VarA8.setValue(Boolean.valueOf(z));
                fee feeVar9 = (fee) n0o0Var11.getValue();
                feeVar9.getClass();
                pz40 pz40VarA9 = feeVar9.a();
                ((String) feeVar9.a().getValue()).getClass();
                pz40VarA9.setValue(txu0Var.b);
                fee feeVar10 = (fee) n0o0Var10.getValue();
                feeVar10.getClass();
                pz40 pz40VarA10 = feeVar10.a();
                dxu0 dxu0Var = txu0Var.f;
                pz40VarA10.setValue(dxu0Var);
                fee feeVar11 = (fee) n0o0Var9.getValue();
                feeVar11.getClass();
                pz40 pz40VarA11 = feeVar11.a();
                ((Boolean) feeVar11.a().getValue()).getClass();
                pz40VarA11.setValue(Boolean.valueOf(txu0Var.g));
                fee feeVar12 = (fee) n0o0Var8.getValue();
                feeVar12.getClass();
                pz40 pz40VarA12 = feeVar12.a();
                ((axu0) feeVar12.a().getValue()).getClass();
                axu0 axu0Var = txu0Var.d;
                pz40VarA12.setValue(axu0Var);
                fee feeVar13 = (fee) n0o0Var7.getValue();
                feeVar13.getClass();
                pz40 pz40VarA13 = feeVar13.a();
                ((fwu0) feeVar13.a().getValue()).getClass();
                fwu0 fwu0Var = txu0Var.e;
                pz40VarA13.setValue(fwu0Var);
                fee feeVar14 = (fee) n0o0Var6.getValue();
                feeVar14.getClass();
                pz40 pz40VarA14 = feeVar14.a();
                ((Boolean) feeVar14.a().getValue()).getClass();
                pz40VarA14.setValue(Boolean.valueOf(z));
                fee feeVar15 = (fee) n0o0Var5.getValue();
                feeVar15.getClass();
                pz40 pz40VarA15 = feeVar15.a();
                ((Boolean) feeVar15.a().getValue()).getClass();
                pz40VarA15.setValue(Boolean.valueOf(z));
                fee feeVar16 = (fee) n0o0Var4.getValue();
                feeVar16.getClass();
                pz40 pz40VarA16 = feeVar16.a();
                ((Boolean) feeVar16.a().getValue()).getClass();
                pz40VarA16.setValue(Boolean.valueOf(z));
                fee feeVar17 = (fee) n0o0Var2.getValue();
                feeVar17.getClass();
                pz40 pz40VarA17 = feeVar17.a();
                ((axu0) feeVar17.a().getValue()).getClass();
                pz40VarA17.setValue(axu0Var);
                fee feeVar18 = (fee) n0o0Var.getValue();
                feeVar18.getClass();
                pz40 pz40VarA18 = feeVar18.a();
                ((axu0) feeVar18.a().getValue()).getClass();
                pz40VarA18.setValue(axu0Var);
                fee feeVar19 = (fee) n0o0Var3.getValue();
                feeVar19.getClass();
                pz40 pz40VarA19 = feeVar19.a();
                ((axu0) feeVar19.a().getValue()).getClass();
                pz40VarA19.setValue(axu0Var);
                fee feeVar20 = (fee) ((n0o0) obj5).getValue();
                feeVar20.getClass();
                pz40 pz40VarA20 = feeVar20.a();
                ((fwu0) feeVar20.a().getValue()).getClass();
                pz40VarA20.setValue(fwu0Var);
                n0o0 n0o0Var13 = (n0o0) obj4;
                fee feeVar21 = (fee) n0o0Var13.getValue();
                feeVar21.getClass();
                pz40 pz40VarA21 = feeVar21.a();
                pz40VarA21.setValue(dxu0Var);
                return new vxu0((String) ((fee) n0o0Var6.getValue()).b(), (String) ((fee) n0o0Var5.getValue()).b(), (String) ((fee) n0o0Var2.getValue()).b(), (String) ((fee) n0o0Var11.getValue()).c(), (String) ((fee) n0o0Var.getValue()).b(), (String) ((fee) n0o0Var13.getValue()).b(), (String) ((fee) n0o0Var4.getValue()).b(), (String) ((fee) n0o0Var3.getValue()).b(), a(fwu0Var, z), ((fwu0) ((fee) n0o0Var7.getValue()).c()).c, axu0Var.f1639a, ((Boolean) ((fee) n0o0Var9.getValue()).c()).booleanValue());
        }
    }

    public c69(ctf0 ctf0Var, txu0 txu0Var) {
        final byte b = 3;
        ctf0Var.getClass();
        this.p = ctf0Var;
        boolean z = txu0Var.f34721a;
        this.b = bkb.H(Boolean.valueOf(z));
        this.c = bkb.H(txu0Var.b);
        dxu0 dxu0Var = txu0Var.f;
        this.d = bkb.H(dxu0Var);
        this.e = bkb.H(Boolean.valueOf(txu0Var.g));
        axu0 axu0Var = txu0Var.d;
        this.f = bkb.H(axu0Var);
        fwu0 fwu0Var = txu0Var.e;
        this.g = bkb.H(fwu0Var);
        final byte b2 = 0;
        this.h = maz.b(new yw9(Boolean.valueOf(z), new Function1(this) { // from class: a.uxu0
            public final /* synthetic */ c69 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b3 = b2;
                c69 c69Var = this.b;
                switch (b3) {
                    case 0:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        return ((ctf0) c69Var.p).b.a(zBooleanValue ? R.string.refill_account : R.string.pay_out_from_account, Arrays.copyOf(new Object[0], 0));
                    case 1:
                        boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                        return ((ctf0) c69Var.p).b.a(zBooleanValue2 ? R.string.your_balance : R.string.game_balance, Arrays.copyOf(new Object[0], 0));
                    case 2:
                        boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                        return ((ctf0) c69Var.p).b.a(zBooleanValue3 ? R.string.game_account_will_be_credited : R.string.account_will_be_credited, Arrays.copyOf(new Object[0], 0));
                    case 3:
                        axu0 axu0Var2 = (axu0) obj;
                        axu0Var2.getClass();
                        boolean z2 = axu0Var2.f1639a;
                        String str = axu0Var2.c;
                        if (!z2 || str.length() <= 0) {
                            return null;
                        }
                        ctf0 ctf0Var2 = (ctf0) c69Var.p;
                        pn40 pn40Var = pn40.f27267a;
                        return ctf0Var2.b.a(R.string.min_input_amount_v2, Arrays.copyOf(new Object[]{pn40.d(axu0Var2.f, str, p3u0.c)}, 1));
                    default:
                        dxu0 dxu0Var2 = (dxu0) obj;
                        ctf0 ctf0Var3 = (ctf0) c69Var.p;
                        if (dxu0Var2 == null) {
                            return null;
                        }
                        if (dxu0Var2.equals(cxu0.f5142a)) {
                            return ctf0Var3.b.a(R.string.not_enough_money, Arrays.copyOf(new Object[0], 0));
                        }
                        if (!(dxu0Var2 instanceof bxu0)) {
                            t9f.b();
                            return null;
                        }
                        pn40 pn40Var2 = pn40.f27267a;
                        bxu0 bxu0Var = (bxu0) dxu0Var2;
                        return ctf0Var3.b.a(R.string.min_input_amount_v2, Arrays.copyOf(new Object[]{pn40.d(bxu0Var.f3393a, bxu0Var.b, p3u0.c)}, 1));
                }
            }
        }, (byte) 20));
        final byte b3 = 1;
        this.i = maz.b(new yw9(Boolean.valueOf(z), new Function1(this) { // from class: a.uxu0
            public final /* synthetic */ c69 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b4 = b3;
                c69 c69Var = this.b;
                switch (b4) {
                    case 0:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        return ((ctf0) c69Var.p).b.a(zBooleanValue ? R.string.refill_account : R.string.pay_out_from_account, Arrays.copyOf(new Object[0], 0));
                    case 1:
                        boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                        return ((ctf0) c69Var.p).b.a(zBooleanValue2 ? R.string.your_balance : R.string.game_balance, Arrays.copyOf(new Object[0], 0));
                    case 2:
                        boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                        return ((ctf0) c69Var.p).b.a(zBooleanValue3 ? R.string.game_account_will_be_credited : R.string.account_will_be_credited, Arrays.copyOf(new Object[0], 0));
                    case 3:
                        axu0 axu0Var2 = (axu0) obj;
                        axu0Var2.getClass();
                        boolean z2 = axu0Var2.f1639a;
                        String str = axu0Var2.c;
                        if (!z2 || str.length() <= 0) {
                            return null;
                        }
                        ctf0 ctf0Var2 = (ctf0) c69Var.p;
                        pn40 pn40Var = pn40.f27267a;
                        return ctf0Var2.b.a(R.string.min_input_amount_v2, Arrays.copyOf(new Object[]{pn40.d(axu0Var2.f, str, p3u0.c)}, 1));
                    default:
                        dxu0 dxu0Var2 = (dxu0) obj;
                        ctf0 ctf0Var3 = (ctf0) c69Var.p;
                        if (dxu0Var2 == null) {
                            return null;
                        }
                        if (dxu0Var2.equals(cxu0.f5142a)) {
                            return ctf0Var3.b.a(R.string.not_enough_money, Arrays.copyOf(new Object[0], 0));
                        }
                        if (!(dxu0Var2 instanceof bxu0)) {
                            t9f.b();
                            return null;
                        }
                        pn40 pn40Var2 = pn40.f27267a;
                        bxu0 bxu0Var = (bxu0) dxu0Var2;
                        return ctf0Var3.b.a(R.string.min_input_amount_v2, Arrays.copyOf(new Object[]{pn40.d(bxu0Var.f3393a, bxu0Var.b, p3u0.c)}, 1));
                }
            }
        }, (byte) 20));
        final byte b4 = 2;
        this.j = maz.b(new yw9(Boolean.valueOf(z), new Function1(this) { // from class: a.uxu0
            public final /* synthetic */ c69 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b5 = b4;
                c69 c69Var = this.b;
                switch (b5) {
                    case 0:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        return ((ctf0) c69Var.p).b.a(zBooleanValue ? R.string.refill_account : R.string.pay_out_from_account, Arrays.copyOf(new Object[0], 0));
                    case 1:
                        boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                        return ((ctf0) c69Var.p).b.a(zBooleanValue2 ? R.string.your_balance : R.string.game_balance, Arrays.copyOf(new Object[0], 0));
                    case 2:
                        boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                        return ((ctf0) c69Var.p).b.a(zBooleanValue3 ? R.string.game_account_will_be_credited : R.string.account_will_be_credited, Arrays.copyOf(new Object[0], 0));
                    case 3:
                        axu0 axu0Var2 = (axu0) obj;
                        axu0Var2.getClass();
                        boolean z2 = axu0Var2.f1639a;
                        String str = axu0Var2.c;
                        if (!z2 || str.length() <= 0) {
                            return null;
                        }
                        ctf0 ctf0Var2 = (ctf0) c69Var.p;
                        pn40 pn40Var = pn40.f27267a;
                        return ctf0Var2.b.a(R.string.min_input_amount_v2, Arrays.copyOf(new Object[]{pn40.d(axu0Var2.f, str, p3u0.c)}, 1));
                    default:
                        dxu0 dxu0Var2 = (dxu0) obj;
                        ctf0 ctf0Var3 = (ctf0) c69Var.p;
                        if (dxu0Var2 == null) {
                            return null;
                        }
                        if (dxu0Var2.equals(cxu0.f5142a)) {
                            return ctf0Var3.b.a(R.string.not_enough_money, Arrays.copyOf(new Object[0], 0));
                        }
                        if (!(dxu0Var2 instanceof bxu0)) {
                            t9f.b();
                            return null;
                        }
                        pn40 pn40Var2 = pn40.f27267a;
                        bxu0 bxu0Var = (bxu0) dxu0Var2;
                        return ctf0Var3.b.a(R.string.min_input_amount_v2, Arrays.copyOf(new Object[]{pn40.d(bxu0Var.f3393a, bxu0Var.b, p3u0.c)}, 1));
                }
            }
        }, (byte) 20));
        this.k = maz.b(new yw9(axu0Var, new d4u0(this, (byte) 14), (byte) 20));
        this.l = maz.b(new yw9(axu0Var, new Function1(this) { // from class: a.uxu0
            public final /* synthetic */ c69 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b5 = b;
                c69 c69Var = this.b;
                switch (b5) {
                    case 0:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        return ((ctf0) c69Var.p).b.a(zBooleanValue ? R.string.refill_account : R.string.pay_out_from_account, Arrays.copyOf(new Object[0], 0));
                    case 1:
                        boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                        return ((ctf0) c69Var.p).b.a(zBooleanValue2 ? R.string.your_balance : R.string.game_balance, Arrays.copyOf(new Object[0], 0));
                    case 2:
                        boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                        return ((ctf0) c69Var.p).b.a(zBooleanValue3 ? R.string.game_account_will_be_credited : R.string.account_will_be_credited, Arrays.copyOf(new Object[0], 0));
                    case 3:
                        axu0 axu0Var2 = (axu0) obj;
                        axu0Var2.getClass();
                        boolean z2 = axu0Var2.f1639a;
                        String str = axu0Var2.c;
                        if (!z2 || str.length() <= 0) {
                            return null;
                        }
                        ctf0 ctf0Var2 = (ctf0) c69Var.p;
                        pn40 pn40Var = pn40.f27267a;
                        return ctf0Var2.b.a(R.string.min_input_amount_v2, Arrays.copyOf(new Object[]{pn40.d(axu0Var2.f, str, p3u0.c)}, 1));
                    default:
                        dxu0 dxu0Var2 = (dxu0) obj;
                        ctf0 ctf0Var3 = (ctf0) c69Var.p;
                        if (dxu0Var2 == null) {
                            return null;
                        }
                        if (dxu0Var2.equals(cxu0.f5142a)) {
                            return ctf0Var3.b.a(R.string.not_enough_money, Arrays.copyOf(new Object[0], 0));
                        }
                        if (!(dxu0Var2 instanceof bxu0)) {
                            t9f.b();
                            return null;
                        }
                        pn40 pn40Var2 = pn40.f27267a;
                        bxu0 bxu0Var = (bxu0) dxu0Var2;
                        return ctf0Var3.b.a(R.string.min_input_amount_v2, Arrays.copyOf(new Object[]{pn40.d(bxu0Var.f3393a, bxu0Var.b, p3u0.c)}, 1));
                }
            }
        }, (byte) 20));
        this.m = maz.b(new yw9(axu0Var, new d4u0(this, (byte) 15), (byte) 20));
        this.n = maz.b(new yw9(fwu0Var, new xis0((Object) this, (Object) txu0Var, (byte) 24), (byte) 20));
        final byte b5 = 4;
        this.o = maz.b(new yw9(dxu0Var, new Function1(this) { // from class: a.uxu0
            public final /* synthetic */ c69 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b6 = b5;
                c69 c69Var = this.b;
                switch (b6) {
                    case 0:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        return ((ctf0) c69Var.p).b.a(zBooleanValue ? R.string.refill_account : R.string.pay_out_from_account, Arrays.copyOf(new Object[0], 0));
                    case 1:
                        boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                        return ((ctf0) c69Var.p).b.a(zBooleanValue2 ? R.string.your_balance : R.string.game_balance, Arrays.copyOf(new Object[0], 0));
                    case 2:
                        boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                        return ((ctf0) c69Var.p).b.a(zBooleanValue3 ? R.string.game_account_will_be_credited : R.string.account_will_be_credited, Arrays.copyOf(new Object[0], 0));
                    case 3:
                        axu0 axu0Var2 = (axu0) obj;
                        axu0Var2.getClass();
                        boolean z2 = axu0Var2.f1639a;
                        String str = axu0Var2.c;
                        if (!z2 || str.length() <= 0) {
                            return null;
                        }
                        ctf0 ctf0Var2 = (ctf0) c69Var.p;
                        pn40 pn40Var = pn40.f27267a;
                        return ctf0Var2.b.a(R.string.min_input_amount_v2, Arrays.copyOf(new Object[]{pn40.d(axu0Var2.f, str, p3u0.c)}, 1));
                    default:
                        dxu0 dxu0Var2 = (dxu0) obj;
                        ctf0 ctf0Var3 = (ctf0) c69Var.p;
                        if (dxu0Var2 == null) {
                            return null;
                        }
                        if (dxu0Var2.equals(cxu0.f5142a)) {
                            return ctf0Var3.b.a(R.string.not_enough_money, Arrays.copyOf(new Object[0], 0));
                        }
                        if (!(dxu0Var2 instanceof bxu0)) {
                            t9f.b();
                            return null;
                        }
                        pn40 pn40Var2 = pn40.f27267a;
                        bxu0 bxu0Var = (bxu0) dxu0Var2;
                        return ctf0Var3.b.a(R.string.min_input_amount_v2, Arrays.copyOf(new Object[]{pn40.d(bxu0Var.f3393a, bxu0Var.b, p3u0.c)}, 1));
                }
            }
        }, (byte) 20));
    }

    public c69(sg20 sg20Var, ctf0 ctf0Var, zvh0 zvh0Var) {
        ctf0Var.getClass();
        this.o = sg20Var;
        ua20 ua20Var = sg20Var.g;
        ug20 ug20Var = ug20.b;
        int i = ep30.f8167a[ua20Var.ordinal()];
        this.p = ug20Var;
        n0o0 n0o0VarH = bkb.H(sg20Var.b);
        this.b = n0o0VarH;
        n0o0 n0o0VarH2 = bkb.H(sg20Var.c);
        this.c = n0o0VarH2;
        n0o0 n0o0VarH3 = bkb.H(sg20Var.d);
        this.d = n0o0VarH3;
        n0o0 n0o0VarH4 = bkb.H(sg20Var.e);
        this.e = n0o0VarH4;
        n0o0 n0o0VarH5 = bkb.H(sg20Var.f);
        this.f = n0o0VarH5;
        this.g = bkb.H(Boolean.valueOf(sg20Var.h));
        n0o0 n0o0VarH6 = bkb.H(Boolean.valueOf(sg20Var.j));
        this.h = n0o0VarH6;
        this.i = maz.b(new yw9((fee) n0o0VarH6.getValue(), new v510(this, ctf0Var, (byte) 7), (byte) 20));
        this.j = maz.b(new yw9((fee) n0o0VarH.getValue(), new b530((Object) this, (byte) 5), (byte) 20));
        this.k = maz.b(new yw9((fee) n0o0VarH3.getValue(), new k9v((Object) ctf0Var, (Object) this, (Object) zvh0Var, (byte) 26), (byte) 20));
        this.l = maz.b(new yw9((fee) n0o0VarH2.getValue(), new cp30(ctf0Var, this), (byte) 20));
        this.m = maz.b(new yw9((fee) n0o0VarH4.getValue(), new cp30(this, ctf0Var), (byte) 20));
        this.n = maz.b(new yw9((fee) n0o0VarH5.getValue(), new v510(ctf0Var, (byte) 9), (byte) 20));
    }

    public c69(z59 z59Var) {
        final byte b = 0;
        this.b = bkb.H(z59Var.e);
        n0o0 n0o0VarH = bkb.H(Boolean.valueOf(z59Var.f));
        this.c = n0o0VarH;
        n0o0 n0o0VarH2 = bkb.H(Boolean.valueOf(z59Var.g));
        this.d = n0o0VarH2;
        n0o0 n0o0VarH3 = bkb.H(Boolean.valueOf(z59Var.h));
        this.e = n0o0VarH3;
        this.f = bkb.H(Boolean.valueOf(z59Var.i));
        n0o0 n0o0VarH4 = bkb.H(Boolean.valueOf(z59Var.l));
        this.g = n0o0VarH4;
        this.h = bkb.H(Boolean.valueOf(z59Var.m));
        n0o0 n0o0VarH5 = bkb.H(Boolean.valueOf(z59Var.k));
        this.i = n0o0VarH5;
        this.j = bkb.H(z59Var.s);
        this.k = bkb.G(((fee) n0o0VarH4.getValue()).d, new cp8((byte) 29));
        this.l = bkb.G(((fee) n0o0VarH5.getValue()).d, new Function1(this) { // from class: a.b69
            public final /* synthetic */ c69 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b2 = b;
                boolean z = false;
                c69 c69Var = this.b;
                switch (b2) {
                    case 0:
                        if (((Boolean) obj).booleanValue() && !((Boolean) ((fee) c69Var.k.getValue()).b()).booleanValue()) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                    case 1:
                        if (!((Boolean) obj).booleanValue() && ((Boolean) ((fee) c69Var.c.getValue()).c()).booleanValue() && !((Boolean) ((fee) c69Var.k.getValue()).b()).booleanValue() && !((Boolean) ((fee) c69Var.l.getValue()).b()).booleanValue()) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                    case 2:
                        ((Boolean) obj).getClass();
                        if (((Boolean) ((fee) c69Var.k.getValue()).b()).booleanValue()) {
                            return (mdm) ((fee) c69Var.j.getValue()).c();
                        }
                        return null;
                    case 3:
                        n0o0 n0o0Var = c69Var.b;
                        ((l7m0) obj).getClass();
                        if (((Boolean) ((fee) c69Var.k.getValue()).b()).booleanValue() || ((CharSequence) ((fee) n0o0Var.getValue()).c()).length() == 0) {
                            return null;
                        }
                        return new efu0(((Boolean) ((fee) c69Var.m.getValue()).b()).booleanValue() ? (String) ((fee) n0o0Var.getValue()).c() : null, ((Boolean) ((fee) c69Var.f.getValue()).c()).booleanValue(), ((Boolean) ((fee) c69Var.c.getValue()).c()).booleanValue(), ((Boolean) ((fee) c69Var.i.getValue()).c()).booleanValue());
                    default:
                        ((l7m0) obj).getClass();
                        if (((Boolean) ((fee) c69Var.l.getValue()).b()).booleanValue()) {
                            return null;
                        }
                        return new eke(((Boolean) ((fee) c69Var.e.getValue()).c()).booleanValue(), ((Boolean) ((fee) c69Var.f.getValue()).c()).booleanValue(), ((Boolean) ((fee) c69Var.c.getValue()).c()).booleanValue());
                }
            }
        });
        pz40 pz40Var = ((fee) n0o0VarH2.getValue()).d;
        final byte b2 = 1;
        this.m = bkb.G(pz40Var, new Function1(this) { // from class: a.b69
            public final /* synthetic */ c69 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b3 = b2;
                boolean z = false;
                c69 c69Var = this.b;
                switch (b3) {
                    case 0:
                        if (((Boolean) obj).booleanValue() && !((Boolean) ((fee) c69Var.k.getValue()).b()).booleanValue()) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                    case 1:
                        if (!((Boolean) obj).booleanValue() && ((Boolean) ((fee) c69Var.c.getValue()).c()).booleanValue() && !((Boolean) ((fee) c69Var.k.getValue()).b()).booleanValue() && !((Boolean) ((fee) c69Var.l.getValue()).b()).booleanValue()) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                    case 2:
                        ((Boolean) obj).getClass();
                        if (((Boolean) ((fee) c69Var.k.getValue()).b()).booleanValue()) {
                            return (mdm) ((fee) c69Var.j.getValue()).c();
                        }
                        return null;
                    case 3:
                        n0o0 n0o0Var = c69Var.b;
                        ((l7m0) obj).getClass();
                        if (((Boolean) ((fee) c69Var.k.getValue()).b()).booleanValue() || ((CharSequence) ((fee) n0o0Var.getValue()).c()).length() == 0) {
                            return null;
                        }
                        return new efu0(((Boolean) ((fee) c69Var.m.getValue()).b()).booleanValue() ? (String) ((fee) n0o0Var.getValue()).c() : null, ((Boolean) ((fee) c69Var.f.getValue()).c()).booleanValue(), ((Boolean) ((fee) c69Var.c.getValue()).c()).booleanValue(), ((Boolean) ((fee) c69Var.i.getValue()).c()).booleanValue());
                    default:
                        ((l7m0) obj).getClass();
                        if (((Boolean) ((fee) c69Var.l.getValue()).b()).booleanValue()) {
                            return null;
                        }
                        return new eke(((Boolean) ((fee) c69Var.e.getValue()).c()).booleanValue(), ((Boolean) ((fee) c69Var.f.getValue()).c()).booleanValue(), ((Boolean) ((fee) c69Var.c.getValue()).c()).booleanValue());
                }
            }
        });
        final byte b3 = 2;
        this.n = bkb.G(((fee) n0o0VarH4.getValue()).d, new Function1(this) { // from class: a.b69
            public final /* synthetic */ c69 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b4 = b3;
                boolean z = false;
                c69 c69Var = this.b;
                switch (b4) {
                    case 0:
                        if (((Boolean) obj).booleanValue() && !((Boolean) ((fee) c69Var.k.getValue()).b()).booleanValue()) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                    case 1:
                        if (!((Boolean) obj).booleanValue() && ((Boolean) ((fee) c69Var.c.getValue()).c()).booleanValue() && !((Boolean) ((fee) c69Var.k.getValue()).b()).booleanValue() && !((Boolean) ((fee) c69Var.l.getValue()).b()).booleanValue()) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                    case 2:
                        ((Boolean) obj).getClass();
                        if (((Boolean) ((fee) c69Var.k.getValue()).b()).booleanValue()) {
                            return (mdm) ((fee) c69Var.j.getValue()).c();
                        }
                        return null;
                    case 3:
                        n0o0 n0o0Var = c69Var.b;
                        ((l7m0) obj).getClass();
                        if (((Boolean) ((fee) c69Var.k.getValue()).b()).booleanValue() || ((CharSequence) ((fee) n0o0Var.getValue()).c()).length() == 0) {
                            return null;
                        }
                        return new efu0(((Boolean) ((fee) c69Var.m.getValue()).b()).booleanValue() ? (String) ((fee) n0o0Var.getValue()).c() : null, ((Boolean) ((fee) c69Var.f.getValue()).c()).booleanValue(), ((Boolean) ((fee) c69Var.c.getValue()).c()).booleanValue(), ((Boolean) ((fee) c69Var.i.getValue()).c()).booleanValue());
                    default:
                        ((l7m0) obj).getClass();
                        if (((Boolean) ((fee) c69Var.l.getValue()).b()).booleanValue()) {
                            return null;
                        }
                        return new eke(((Boolean) ((fee) c69Var.e.getValue()).c()).booleanValue(), ((Boolean) ((fee) c69Var.f.getValue()).c()).booleanValue(), ((Boolean) ((fee) c69Var.c.getValue()).c()).booleanValue());
                }
            }
        });
        pz40 pz40Var2 = ((fee) n0o0VarH.getValue()).d;
        final byte b4 = 3;
        this.o = maz.b(new yw9(pz40Var2, new Function1(this) { // from class: a.b69
            public final /* synthetic */ c69 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b5 = b4;
                boolean z = false;
                c69 c69Var = this.b;
                switch (b5) {
                    case 0:
                        if (((Boolean) obj).booleanValue() && !((Boolean) ((fee) c69Var.k.getValue()).b()).booleanValue()) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                    case 1:
                        if (!((Boolean) obj).booleanValue() && ((Boolean) ((fee) c69Var.c.getValue()).c()).booleanValue() && !((Boolean) ((fee) c69Var.k.getValue()).b()).booleanValue() && !((Boolean) ((fee) c69Var.l.getValue()).b()).booleanValue()) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                    case 2:
                        ((Boolean) obj).getClass();
                        if (((Boolean) ((fee) c69Var.k.getValue()).b()).booleanValue()) {
                            return (mdm) ((fee) c69Var.j.getValue()).c();
                        }
                        return null;
                    case 3:
                        n0o0 n0o0Var = c69Var.b;
                        ((l7m0) obj).getClass();
                        if (((Boolean) ((fee) c69Var.k.getValue()).b()).booleanValue() || ((CharSequence) ((fee) n0o0Var.getValue()).c()).length() == 0) {
                            return null;
                        }
                        return new efu0(((Boolean) ((fee) c69Var.m.getValue()).b()).booleanValue() ? (String) ((fee) n0o0Var.getValue()).c() : null, ((Boolean) ((fee) c69Var.f.getValue()).c()).booleanValue(), ((Boolean) ((fee) c69Var.c.getValue()).c()).booleanValue(), ((Boolean) ((fee) c69Var.i.getValue()).c()).booleanValue());
                    default:
                        ((l7m0) obj).getClass();
                        if (((Boolean) ((fee) c69Var.l.getValue()).b()).booleanValue()) {
                            return null;
                        }
                        return new eke(((Boolean) ((fee) c69Var.e.getValue()).c()).booleanValue(), ((Boolean) ((fee) c69Var.f.getValue()).c()).booleanValue(), ((Boolean) ((fee) c69Var.c.getValue()).c()).booleanValue());
                }
            }
        }, (byte) 20));
        final byte b5 = 4;
        this.p = maz.b(new yw9(((fee) n0o0VarH3.getValue()).d, new Function1(this) { // from class: a.b69
            public final /* synthetic */ c69 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b6 = b5;
                boolean z = false;
                c69 c69Var = this.b;
                switch (b6) {
                    case 0:
                        if (((Boolean) obj).booleanValue() && !((Boolean) ((fee) c69Var.k.getValue()).b()).booleanValue()) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                    case 1:
                        if (!((Boolean) obj).booleanValue() && ((Boolean) ((fee) c69Var.c.getValue()).c()).booleanValue() && !((Boolean) ((fee) c69Var.k.getValue()).b()).booleanValue() && !((Boolean) ((fee) c69Var.l.getValue()).b()).booleanValue()) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                    case 2:
                        ((Boolean) obj).getClass();
                        if (((Boolean) ((fee) c69Var.k.getValue()).b()).booleanValue()) {
                            return (mdm) ((fee) c69Var.j.getValue()).c();
                        }
                        return null;
                    case 3:
                        n0o0 n0o0Var = c69Var.b;
                        ((l7m0) obj).getClass();
                        if (((Boolean) ((fee) c69Var.k.getValue()).b()).booleanValue() || ((CharSequence) ((fee) n0o0Var.getValue()).c()).length() == 0) {
                            return null;
                        }
                        return new efu0(((Boolean) ((fee) c69Var.m.getValue()).b()).booleanValue() ? (String) ((fee) n0o0Var.getValue()).c() : null, ((Boolean) ((fee) c69Var.f.getValue()).c()).booleanValue(), ((Boolean) ((fee) c69Var.c.getValue()).c()).booleanValue(), ((Boolean) ((fee) c69Var.i.getValue()).c()).booleanValue());
                    default:
                        ((l7m0) obj).getClass();
                        if (((Boolean) ((fee) c69Var.l.getValue()).b()).booleanValue()) {
                            return null;
                        }
                        return new eke(((Boolean) ((fee) c69Var.e.getValue()).c()).booleanValue(), ((Boolean) ((fee) c69Var.f.getValue()).c()).booleanValue(), ((Boolean) ((fee) c69Var.c.getValue()).c()).booleanValue());
                }
            }
        }, (byte) 20));
    }
}
