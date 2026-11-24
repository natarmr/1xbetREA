package a;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class op6 implements v6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f25626a = 0;
    public final ctf0 b;
    public final ocl c;
    public final n0o0 d;
    public final n0o0 e;
    public final n0o0 f;
    public final n0o0 g;
    public final n0o0 h;
    public final n0o0 i;

    public op6(or6 or6Var, ctf0 ctf0Var, ocl oclVar) {
        final byte b = 1;
        ctf0Var.getClass();
        this.b = ctf0Var;
        this.c = oclVar;
        n0o0 n0o0VarH = bkb.H(or6Var.b);
        this.d = n0o0VarH;
        this.e = bkb.H(or6Var.i);
        n0o0 n0o0VarH2 = bkb.H(or6Var.f25720a);
        this.f = n0o0VarH2;
        this.g = bkb.H(Integer.valueOf(or6Var.c));
        final byte b2 = 0;
        this.h = maz.b(new yw9((fee) n0o0VarH.getValue(), new Function1(this) { // from class: a.pr6
            public final /* synthetic */ op6 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b3 = b2;
                op6 op6Var = this.b;
                switch (b3) {
                    case 0:
                        fee feeVar = (fee) obj;
                        feeVar.getClass();
                        List list = (List) feeVar.c();
                        gio gioVar = (gio) ((fee) op6Var.e.getValue()).c();
                        ctf0 ctf0Var2 = op6Var.b;
                        list.getClass();
                        gioVar.getClass();
                        ctf0Var2.getClass();
                        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            mms mmsVar = (mms) it.next();
                            d9a0 d9a0Var = mmsVar.i;
                            d9a0 d9a0Var2 = mmsVar.j;
                            long j = mmsVar.f22057a;
                            y1i y1iVar = new y1i(cjx.P(d9a0Var.f, ctf0Var2), cjx.P(d9a0Var2.f, ctf0Var2));
                            bca bcaVarB0 = cjx.b0(mmsVar, mmsVar.i.c, mmsVar.l);
                            bca bcaVarB1 = cjx.b0(mmsVar, d9a0Var2.c, mmsVar.m);
                            Iterator it2 = it;
                            lpm lpmVar = new lpm(opm.f25648a, new hpm(0L, 3));
                            rdj rdjVar = rdj.f30294a;
                            arrayList.add(new hq6(d9a0Var, d9a0Var2, new pba(j, y1iVar, new vba(bcaVarB0, bcaVarB1, lpmVar, rdj.g(new znq0(mmsVar.e), efj.UNIVERSAL, Boolean.valueOf(ctf0Var2.h()), false, 56)), new mem(j, dyb.g0(new yem(j, 1L, dyb.g0(new a4n(dyb.g0(cjx.O(gioVar.f11358a, mmsVar.f), cjx.O(gioVar.b, mmsVar.h), cjx.O(gioVar.c, mmsVar.g)), new zgl0(), 14)), new lfm(ctf0Var2.b.a(R.string.win_match_text, Arrays.copyOf(new Object[0], 0)), new yfm())))))));
                            it = it2;
                        }
                        return dyb.o0(arrayList);
                    default:
                        fee feeVar2 = (fee) obj;
                        feeVar2.getClass();
                        List<vil0> list2 = (List) feeVar2.c();
                        int iIntValue = ((Number) ((fee) op6Var.g.getValue()).c()).intValue();
                        ArrayList arrayList2 = new ArrayList(r3d.q(list2, 10));
                        for (vil0 vil0Var : list2) {
                            arrayList2.add(new lxl(vil0Var.f37485a, (dyl) new xxl(vil0Var.c), false, vil0Var.f37485a == iIntValue ? uxl.b : uxl.f36445a, (cwl) null, 108));
                        }
                        a4x a4xVarO0 = dyb.o0(arrayList2);
                        float f = xfn.b(op6Var.b.j()).e;
                        return new fyl(a4xVarO0, null, null, s5x0.u(f, 0.0f, f, 0.0f, 10), null, 22);
                }
            }
        }, (byte) 20));
        this.i = maz.b(new yw9((fee) n0o0VarH2.getValue(), new Function1(this) { // from class: a.pr6
            public final /* synthetic */ op6 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b3 = b;
                op6 op6Var = this.b;
                switch (b3) {
                    case 0:
                        fee feeVar = (fee) obj;
                        feeVar.getClass();
                        List list = (List) feeVar.c();
                        gio gioVar = (gio) ((fee) op6Var.e.getValue()).c();
                        ctf0 ctf0Var2 = op6Var.b;
                        list.getClass();
                        gioVar.getClass();
                        ctf0Var2.getClass();
                        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            mms mmsVar = (mms) it.next();
                            d9a0 d9a0Var = mmsVar.i;
                            d9a0 d9a0Var2 = mmsVar.j;
                            long j = mmsVar.f22057a;
                            y1i y1iVar = new y1i(cjx.P(d9a0Var.f, ctf0Var2), cjx.P(d9a0Var2.f, ctf0Var2));
                            bca bcaVarB0 = cjx.b0(mmsVar, mmsVar.i.c, mmsVar.l);
                            bca bcaVarB1 = cjx.b0(mmsVar, d9a0Var2.c, mmsVar.m);
                            Iterator it2 = it;
                            lpm lpmVar = new lpm(opm.f25648a, new hpm(0L, 3));
                            rdj rdjVar = rdj.f30294a;
                            arrayList.add(new hq6(d9a0Var, d9a0Var2, new pba(j, y1iVar, new vba(bcaVarB0, bcaVarB1, lpmVar, rdj.g(new znq0(mmsVar.e), efj.UNIVERSAL, Boolean.valueOf(ctf0Var2.h()), false, 56)), new mem(j, dyb.g0(new yem(j, 1L, dyb.g0(new a4n(dyb.g0(cjx.O(gioVar.f11358a, mmsVar.f), cjx.O(gioVar.b, mmsVar.h), cjx.O(gioVar.c, mmsVar.g)), new zgl0(), 14)), new lfm(ctf0Var2.b.a(R.string.win_match_text, Arrays.copyOf(new Object[0], 0)), new yfm())))))));
                            it = it2;
                        }
                        return dyb.o0(arrayList);
                    default:
                        fee feeVar2 = (fee) obj;
                        feeVar2.getClass();
                        List<vil0> list2 = (List) feeVar2.c();
                        int iIntValue = ((Number) ((fee) op6Var.g.getValue()).c()).intValue();
                        ArrayList arrayList2 = new ArrayList(r3d.q(list2, 10));
                        for (vil0 vil0Var : list2) {
                            arrayList2.add(new lxl(vil0Var.f37485a, (dyl) new xxl(vil0Var.c), false, vil0Var.f37485a == iIntValue ? uxl.b : uxl.f36445a, (cwl) null, 108));
                        }
                        a4x a4xVarO0 = dyb.o0(arrayList2);
                        float f = xfn.b(op6Var.b.j()).e;
                        return new fyl(a4xVarO0, null, null, s5x0.u(f, 0.0f, f, 0.0f, 10), null, 22);
                }
            }
        }, (byte) 20));
    }

    public imm a() {
        pz40 pz40Var = s6t0.f31722a;
        return new imm(new ilm(s6t0.b().f33626a.getSecondary()), new plm(this.b.b.a(R.string.betconstructor, Arrays.copyOf(new Object[0], 0)), s6t0.b().f33626a.getSecondary(), fa50.f9191a), fmm.f9790a, s6t0.b().f33626a.getBackgroundContent(), false, null);
    }

    public imm b(boolean z, boolean z2) {
        pz40 pz40Var = s6t0.f31722a;
        return new imm(new ilm(s6t0.b().f33626a.getSecondary()), new plm(this.b.b.a(R.string.betconstructor, Arrays.copyOf(new Object[0], 0)), s6t0.b().f33626a.getSecondary(), fa50.f9191a), new dmm(new ta50(new wkm(0, z2 ? R.drawable.ic_glyph_quick_bet_active : R.drawable.ic_glyph_quick_bet_inactive, z, ra50.f30118a, z2 ? s6t0.b().f33626a.getPrimary() : s6t0.b().f33626a.getSecondary()))), s6t0.b().f33626a.getBackgroundContent(), false, null);
    }

    @Override // a.v6t0
    public final Object invoke(Object obj) {
        byte b = this.f25626a;
        n0o0 n0o0Var = this.i;
        n0o0 n0o0Var2 = this.h;
        n0o0 n0o0Var3 = this.g;
        n0o0 n0o0Var4 = this.f;
        n0o0 n0o0Var5 = this.e;
        n0o0 n0o0Var6 = this.d;
        switch (b) {
            case 0:
                jp6 jp6Var = (jp6) obj;
                jp6Var.getClass();
                if (jp6Var.f16886a) {
                    return new lp6(b(false, false));
                }
                boolean z = jp6Var.b;
                ocl oclVar = this.c;
                if (z) {
                    return new kp6(ocl.b(oclVar, pb10.g, null, 0, 0, R.string.data_retrieval_error, R.string.try_again_text, 0L, 0L, 862), b(false, false));
                }
                if (jp6Var.c) {
                    return new kp6(ocl.b(oclVar, pb10.g, null, 0, 0, R.string.statistic_empty_data, 0, 0L, 0L, 990), b(false, false));
                }
                ((fee) n0o0Var4.getValue()).d(jp6Var.i);
                ((fee) n0o0Var3.getValue()).d(Boolean.valueOf(jp6Var.j));
                ((fee) n0o0Var2.getValue()).d(Boolean.valueOf(jp6Var.l));
                ((fee) n0o0Var6.getValue()).d(jp6Var.g);
                ((fee) n0o0Var5.getValue()).d(jp6Var.h);
                return new mp6(b(true, jp6Var.n), new fop0(dyb.o0(jp6Var.e), dyb.o0(jp6Var.f), jp6Var.d), (a4x) ((fee) n0o0Var.getValue()).b(), jp6Var.m);
            default:
                or6 or6Var = (or6) obj;
                or6Var.getClass();
                boolean z2 = or6Var.f;
                List list = or6Var.f25720a;
                if (z2) {
                    return new rr6(a());
                }
                boolean z3 = or6Var.g;
                ocl oclVar2 = this.c;
                if (z3) {
                    return new qr6(ocl.b(oclVar2, pb10.g, null, 0, 0, R.string.error_get_data, R.string.try_again_text, 0L, 0L, 862), a());
                }
                if (list.isEmpty()) {
                    return new qr6(ocl.b(oclVar2, pb10.g, null, 0, 0, R.string.currently_no_events, R.string.try_again_text, 0L, 0L, 862), a());
                }
                ((fee) n0o0Var6.getValue()).d(or6Var.b);
                ((fee) n0o0Var5.getValue()).d(or6Var.i);
                ((fee) n0o0Var4.getValue()).d(list);
                ((fee) n0o0Var3.getValue()).d(Integer.valueOf(or6Var.c));
                return new sr6(a(), new mtl(dyb.g0(new itl(new wul(iul.e, oe9.f25112a, new ue9(this.b.b.a(R.string.make_bet, Arrays.copyOf(new Object[0], 0))), true, false, true), rk.l))), (a4x) ((fee) n0o0Var2.getValue()).b(), or6Var.d, or6Var.e, (hyl) ((fee) n0o0Var.getValue()).b());
        }
    }

    public op6(jp6 jp6Var, ctf0 ctf0Var, ocl oclVar) {
        ctf0Var.getClass();
        this.b = ctf0Var;
        this.c = oclVar;
        n0o0 n0o0VarH = bkb.H(jp6Var.g);
        this.d = n0o0VarH;
        this.e = bkb.H(jp6Var.h);
        this.f = bkb.H(jp6Var.i);
        this.g = bkb.H(Boolean.valueOf(jp6Var.j));
        this.h = bkb.H(Boolean.valueOf(jp6Var.l));
        this.i = maz.b(new yw9((fee) n0o0VarH.getValue(), new os5(this, (byte) 10), (byte) 20));
    }
}
