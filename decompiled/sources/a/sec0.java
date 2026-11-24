package a;

import java.util.Arrays;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class sec0 extends i3t0 {
    public static final List E = q3d.j(Integer.valueOf(i2o.NotFound.getErrorCode()), Integer.valueOf(i2o.Forbidden.getErrorCode()), Integer.valueOf(i2o.BadRequest.getErrorCode()), Integer.valueOf(i2o.l1.getErrorCode()), Integer.valueOf(i2o.TooManyRequests.getErrorCode()));
    public final mne A;
    public bby B;
    public bby C;
    public c4m0 D;
    public final vzg0 o;
    public final hnu p;
    public final lbu q;
    public final rl70 r;
    public final i1w0 s;
    public final m1e t;
    public final duj u;
    public final ctf0 v;
    public final nou w;
    public final j910 x;
    public final b4j y;
    public final x20 z;

    public sec0(vzg0 vzg0Var, hnu hnuVar, lbu lbuVar, rl70 rl70Var, i1w0 i1w0Var, m1e m1eVar, duj dujVar, ctf0 ctf0Var, g2v g2vVar, nou nouVar, j910 j910Var, b4j b4jVar, x20 x20Var, mne mneVar, pru pruVar) {
        m1eVar.getClass();
        ctf0Var.getClass();
        mr0 mr0Var = new mr0(vzg0Var, ctf0Var, pruVar, g2vVar, (byte) 24);
        wyb0 wyb0Var = new wyb0((byte) 21);
        rwj rwjVar = mneVar.f22085a;
        super(null, mr0Var, wyb0Var, cvm0.p(rwjVar, rwjVar), null);
        this.o = vzg0Var;
        this.p = hnuVar;
        this.q = lbuVar;
        this.r = rl70Var;
        this.s = i1w0Var;
        this.t = m1eVar;
        this.u = dujVar;
        this.v = ctf0Var;
        this.w = nouVar;
        this.x = j910Var;
        this.y = b4jVar;
        this.z = x20Var;
        this.A = mneVar;
    }

    public final void M(boolean z, boolean z2) {
        Object value;
        bby bbyVar = this.B;
        if (bbyVar == null || !bbyVar.isActive()) {
            p7m0 p7m0Var = this.i.f25029a;
            do {
                value = p7m0Var.getValue();
                value.getClass();
                this.f.getClass();
            } while (!p7m0Var.m(value, bec0.a((bec0) value, null, null, null, false, false, false, false, z, null, false, null, 65407)));
            this.B = sac.V(jiu0.a(this), new l8c0(1, this, sec0.class, "onDataLoadingError", "onDataLoadingError(Ljava/lang/Throwable;)V", 0, (byte) 14), null, this.A.b, new a220((Object) this, z2, (yje) null, (byte) 11), 10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [a.vzg0] */
    /* JADX WARN: Type inference failed for: r7v0, types: [a.yje] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v3 */
    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        Object value2;
        wdc0 wdc0Var = (wdc0) obj;
        wdc0Var.getClass();
        super.x(wdc0Var);
        boolean zEquals = wdc0Var.equals(udc0.f35471a);
        byte b = 2;
        final byte b2 = 0;
        mne mneVar = this.A;
        final byte b3 = 1;
        ?? r7 = 0;
        Object obj2 = null;
        if (zEquals) {
            c4m0 c4m0Var = this.D;
            if (c4m0Var == null || !c4m0Var.isActive()) {
                this.D = sac.T(new dnq(new fnq(this.t.b(), new qec0(this, r7, b), (byte) 4), new jgb0((Object) this, (yje) r7, (byte) 3), (byte) 1), d5c.S(jiu0.a(this), mneVar.f22085a), rec0.h);
            }
            if (((bec0) D()).e) {
                return;
            }
            if (((bec0) D()).p.f18099a) {
                sac.V(jiu0.a(this), new Function1(this) { // from class: a.oec0
                    public final /* synthetic */ sec0 b;

                    {
                        this.b = this;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        byte b4 = b2;
                        byte b5 = 14;
                        boolean z = false;
                        sec0 sec0Var = this.b;
                        Throwable th = (Throwable) obj3;
                        switch (b4) {
                            case 0:
                                th.getClass();
                                sec0Var.u.b(th, new xh20(sec0Var, z, b5));
                                break;
                            default:
                                th.getClass();
                                if ((th instanceof zhi0) && ((zhi0) th).c == i2o.l1) {
                                    String strA = sec0Var.v.b.a(R.string.error, Arrays.copyOf(new Object[0], 0));
                                    String message = th.getMessage();
                                    if (message == null) {
                                        message = "";
                                    }
                                    sec0Var.G(new gec0(strA, message));
                                } else {
                                    sec0Var.u.b(th, new xh20((Object) sec0Var, true, b5));
                                }
                                break;
                        }
                        return Unit.f46060a;
                    }
                }, null, mneVar.b, new qec0(this, r7, b2), 10);
            }
            M(((bec0) D()).h, ((bec0) D()).d);
            return;
        }
        if (wdc0Var.equals(vdc0.f37224a)) {
            v3c.N(this.B);
            v3c.N(this.C);
            v3c.N(this.D);
            return;
        }
        boolean zEquals2 = wdc0Var.equals(qdc0.f28529a);
        oyg0 oyg0Var = this.f;
        ocj ocjVar = this.i;
        if (zEquals2) {
            v3c.N(this.B);
            p7m0 p7m0Var = ocjVar.f25029a;
            do {
                value2 = p7m0Var.getValue();
                value2.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var.m(value2, bec0.a((bec0) value2, null, null, null, false, false, true, false, false, null, false, null, 65503)));
            M(true, false);
            return;
        }
        if (wdc0Var.equals(rdc0.f30284a)) {
            v3c.N(this.B);
            M(true, true);
            return;
        }
        boolean z = wdc0Var instanceof tdc0;
        ctf0 ctf0Var = this.v;
        ?? r12 = this.o;
        x20 x20Var = this.z;
        b4j b4jVar = this.y;
        if (!z) {
            if (wdc0Var instanceof ndc0) {
                G(new fec0(((ndc0) wdc0Var).f23334a.e, ctf0Var.b.a(R.string.promocode_copied_to_clipboard, Arrays.copyOf(new Object[0], 0))));
                return;
            }
            if (!(wdc0Var instanceof pdc0)) {
                if (wdc0Var instanceof odc0) {
                    v3c.N(this.C);
                    this.C = sac.V(jiu0.a(this), new Function1(this) { // from class: a.oec0
                        public final /* synthetic */ sec0 b;

                        {
                            this.b = this;
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            byte b4 = b3;
                            byte b5 = 14;
                            boolean z2 = false;
                            sec0 sec0Var = this.b;
                            Throwable th = (Throwable) obj3;
                            switch (b4) {
                                case 0:
                                    th.getClass();
                                    sec0Var.u.b(th, new xh20(sec0Var, z2, b5));
                                    break;
                                default:
                                    th.getClass();
                                    if ((th instanceof zhi0) && ((zhi0) th).c == i2o.l1) {
                                        String strA = sec0Var.v.b.a(R.string.error, Arrays.copyOf(new Object[0], 0));
                                        String message = th.getMessage();
                                        if (message == null) {
                                            message = "";
                                        }
                                        sec0Var.G(new gec0(strA, message));
                                    } else {
                                        sec0Var.u.b(th, new xh20((Object) sec0Var, true, b5));
                                    }
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    }, new ssa0(this, (byte) 20), mneVar.b, new qec0(this, r7, b3), 8);
                    return;
                }
                if (wdc0Var.equals(mdc0.f21590a)) {
                    E();
                    return;
                }
                if (!wdc0Var.equals(sdc0.f32028a)) {
                    t9f.b();
                    return;
                }
                p7m0 p7m0Var2 = ocjVar.f25029a;
                do {
                    value = p7m0Var2.getValue();
                    value.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var2.m(value, bec0.a((bec0) value, null, null, null, false, false, false, false, false, null, false, null, 57343)));
                return;
            }
            yrc0 yrc0Var = ((pdc0) wdc0Var).f26802a;
            for (Object obj3 : ((bec0) D()).l) {
                if (((vrc0) obj3).getId() == yrc0Var.getId()) {
                    r7 = obj3;
                    break;
                }
            }
            vrc0 vrc0Var = (vrc0) r7;
            if (vrc0Var == null) {
                return;
            }
            long id = vrc0Var.getId();
            ydc0 ydc0Var = (ydc0) r12.a("KEY_FILTER_STATE");
            if (ydc0Var != null) {
                String strC = ydc0Var.C();
                b4jVar.getClass();
                b4jVar.f1961a.a("promo_list_recomended_call", xp20.f(new Pair("filter", strC), new Pair("promo_id", Long.valueOf(id))));
                String strC2 = ydc0Var.C();
                x20Var.getClass();
                x20Var.f40143a.a(tx3.l0(new k1p[]{new i1p((byte) 2, id), new j1p(strC2, (byte) 0)}), 10662L);
            }
            this.s.d(new oac0(this, vrc0Var, b));
            return;
        }
        long j = ((tdc0) wdc0Var).f33762a;
        ydc0.b.getClass();
        for (Object obj4 : tx3.g0(ydc0.values())) {
            if (((ydc0) obj4).ordinal() == j) {
                obj2 = obj4;
                break;
            }
        }
        ydc0 ydc0Var2 = (ydc0) obj2;
        if (ydc0Var2 == null) {
            ydc0Var2 = ydc0.ALL;
        }
        String strC3 = ydc0Var2.C();
        b4jVar.getClass();
        b4jVar.f1961a.a("promo_list_filter_call", wp20.b(new Pair("filter", strC3)));
        x20Var.getClass();
        b1j.v(strC3, x20Var.f40143a, 3310L);
        r12.e("KEY_FILTER_STATE", ydc0Var2);
        a4x a4xVarC = ydx.C(ydc0Var2, ctf0Var);
        p7m0 p7m0Var3 = ocjVar.f25029a;
        while (true) {
            Object value3 = p7m0Var3.getValue();
            value3.getClass();
            oyg0Var.getClass();
            ydc0 ydc0Var3 = ydc0Var2;
            if (p7m0Var3.m(value3, bec0.a((bec0) value3, null, ydc0Var3, a4xVarC, false, false, false, false, false, null, false, null, 65529))) {
                return;
            } else {
                ydc0Var2 = ydc0Var3;
            }
        }
    }
}
