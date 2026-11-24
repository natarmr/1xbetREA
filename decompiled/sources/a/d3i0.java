package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import java.util.Date;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.xplatform.feed.linelive.presentation.dialogs.select_date_time.params.SelectDateTimeScreenParams;
import org.xplatform.feed.linelive.presentation.dialogs.select_time_filter.params.SelectTimeFilterScreenParams;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/d3i0;", "La/iw5;", "<init>", "()V", "a/gle0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class d3i0 extends iw5 {
    public final khf0 k2 = new khf0("TIME_FILTER_SCREEN_PARAMS");
    public final n0o0 l2;
    public final a8z m2;
    public static final /* synthetic */ iiy[] o2 = {new ez40(d3i0.class, "params", "getParams()Lorg/xplatform/feed/linelive/presentation/dialogs/select_time_filter/params/SelectTimeFilterScreenParams;", 0)};
    public static final gle0 n2 = new gle0();
    public static final String p2 = d3i0.class.getName();

    public d3i0() {
        final byte b = 0;
        this.l2 = maz.b(new Function0(this) { // from class: a.b3i0
            public final /* synthetic */ d3i0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b2 = b;
                d3i0 d3i0Var = this.b;
                switch (b2) {
                    case 0:
                        gle0 gle0Var = d3i0.n2;
                        ComponentCallbacks2 application = d3i0Var.n0().getApplication();
                        application.getClass();
                        af3 af3Var = application instanceof af3 ? (af3) application : null;
                        if (af3Var != null) {
                            o5d0 o5d0Var = (o5d0) af3Var.d().get(e3i0.class);
                            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                            if (!(ze3Var instanceof e3i0)) {
                                ze3Var = null;
                            }
                            e3i0 e3i0Var = (e3i0) ze3Var;
                            if (e3i0Var != null) {
                                SelectTimeFilterScreenParams selectTimeFilterScreenParamsS0 = d3i0Var.S0();
                                cad cadVar = e3i0Var.f7137a;
                                ctf0 ctf0Var = e3i0Var.b;
                                ctf0Var.getClass();
                                return new dti(cadVar, selectTimeFilterScreenParamsS0, ctf0Var);
                            }
                        }
                        jf4.n(b1j.i(e3i0.class, "Cannot create dependency "));
                        return null;
                    default:
                        return new q0h0((cti) ((dti) d3i0Var.l2.getValue()).d.get());
                }
            }
        });
        final byte b2 = 1;
        this.m2 = xbc.a0(this, sre0.f32672a.b(p3i0.class), null, new Function0(this) { // from class: a.b3i0
            public final /* synthetic */ d3i0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b3 = b2;
                d3i0 d3i0Var = this.b;
                switch (b3) {
                    case 0:
                        gle0 gle0Var = d3i0.n2;
                        ComponentCallbacks2 application = d3i0Var.n0().getApplication();
                        application.getClass();
                        af3 af3Var = application instanceof af3 ? (af3) application : null;
                        if (af3Var != null) {
                            o5d0 o5d0Var = (o5d0) af3Var.d().get(e3i0.class);
                            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                            if (!(ze3Var instanceof e3i0)) {
                                ze3Var = null;
                            }
                            e3i0 e3i0Var = (e3i0) ze3Var;
                            if (e3i0Var != null) {
                                SelectTimeFilterScreenParams selectTimeFilterScreenParamsS0 = d3i0Var.S0();
                                cad cadVar = e3i0Var.f7137a;
                                ctf0 ctf0Var = e3i0Var.b;
                                ctf0Var.getClass();
                                return new dti(cadVar, selectTimeFilterScreenParamsS0, ctf0Var);
                            }
                        }
                        jf4.n(b1j.i(e3i0.class, "Cannot create dependency "));
                        return null;
                    default:
                        return new q0h0((cti) ((dti) d3i0Var.l2.getValue()).d.get());
                }
            }
        }, 14);
    }

    @Override // a.iw5
    public final bw5 J0(fet fetVar) {
        d3i0 d3i0Var;
        fetVar.e0(-747506023);
        k3t0 k3t0VarT0 = T0();
        Object objP = fetVar.P();
        Object obj = ukd.f35823a;
        if (objP == obj) {
            objP = m0x0.I(kotlin.coroutines.g.f46065a, fetVar);
            fetVar.o0(objP);
        }
        vne vneVar = (vne) objP;
        boolean zI = fetVar.i(this);
        Object objP2 = fetVar.P();
        if (zI || objP2 == obj) {
            d3i0Var = this;
            Object nxh0Var = new nxh0(1, d3i0Var, d3i0.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/feed/linelive/presentation/dialogs/select_time_filter/models/SelectTimeFilterSideEffect;)V", 0, (byte) 19);
            fetVar.o0(nxh0Var);
            objP2 = nxh0Var;
        } else {
            d3i0Var = this;
        }
        Function1 function1 = (Function1) ((jhy) objP2);
        Unit unit = Unit.f46060a;
        boolean zI2 = fetVar.i(vneVar) | fetVar.i(k3t0VarT0) | fetVar.g(function1) | fetVar.g(null);
        Object objP3 = fetVar.P();
        byte b = 8;
        if (zI2 || objP3 == obj) {
            objP3 = new ggc0(vneVar, k3t0VarT0, function1, b);
            fetVar.o0(objP3);
        }
        m0x0.o(unit, (Function1) objP3, fetVar);
        bw5 bw5Var = new bw5(iw5.O0(1, fetVar), u1c.M(294362122, new rqc0(d3i0Var, b), fetVar), (ugd) null, u1c.M(-1411767480, new in80(d3i0Var, ((i3t0) d3i0Var.T0()).y(fetVar), (byte) 23), fetVar), 10);
        fetVar.r(false);
        return bw5Var;
    }

    /* JADX WARN: Code duplicated, block: B:63:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:64:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:68:0x01ab  */
    public final void P0(mm40 mm40Var, final sgq0 sgq0Var, final Function1 function1, fet fetVar, int i) {
        mm40 mm40Var2;
        cl5 cl5Var;
        boolean z;
        Object objP;
        fet fetVar2 = fetVar;
        fetVar2.g0(1374582952);
        int i2 = i | 6 | (fetVar2.g(sgq0Var) ? 32 : 16) | (fetVar2.i(function1) ? 256 : 128);
        final byte b = 0;
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            mw3 mw3Var = uc9.c;
            xx7 xx7Var = gqw0.m;
            x5d x5dVarA = w5d.a(mw3Var, xx7Var, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC0 = kbc.c0(fetVar2, jm40Var);
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
            mm40 mm40VarN = s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 8.0f, 7);
            rqm rqmVar = sgq0Var.g;
            int i3 = i2 & 896;
            int i4 = i2 & 112;
            boolean z3 = (i3 == 256) | (i4 == 32);
            Object objP2 = fetVar2.P();
            cl5 cl5Var2 = ukd.f35823a;
            if (z3 || objP2 == cl5Var2) {
                objP2 = new Function0() { // from class: a.a3i0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        byte b2 = b;
                        sgq0 sgq0Var2 = sgq0Var;
                        Function1 function2 = function1;
                        switch (b2) {
                            case 0:
                                gle0 gle0Var = d3i0.n2;
                                function2.invoke(new w2i0(sgq0Var2.f32175a));
                                break;
                            default:
                                gle0 gle0Var2 = d3i0.n2;
                                function2.invoke(new w2i0(sgq0Var2.f32175a));
                                break;
                        }
                        return Unit.f46060a;
                    }
                };
                fetVar2.o0(objP2);
            }
            Function0 function0 = (Function0) objP2;
            boolean z4 = (i3 == 256) | (i4 == 32);
            Object objP3 = fetVar2.P();
            if (z4 || objP3 == cl5Var2) {
                final byte b2 = 1;
                objP3 = new Function0() { // from class: a.a3i0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        byte b3 = b2;
                        sgq0 sgq0Var2 = sgq0Var;
                        Function1 function2 = function1;
                        switch (b3) {
                            case 0:
                                gle0 gle0Var = d3i0.n2;
                                function2.invoke(new w2i0(sgq0Var2.f32175a));
                                break;
                            default:
                                gle0 gle0Var2 = d3i0.n2;
                                function2.invoke(new w2i0(sgq0Var2.f32175a));
                                break;
                        }
                        return Unit.f46060a;
                    }
                };
                fetVar2.o0(objP3);
            }
            obc.q(mm40VarN, rqmVar, false, null, function0, null, (Function0) objP3, null, fetVar2, 384, 168);
            mm40 mm40VarN2 = s5x0.N(jm40Var, 12.0f, 0.0f, 12.0f, 16.0f, 2);
            x5d x5dVarA2 = w5d.a(mw3Var, xx7Var, fetVar2, 0);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarN2);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA2, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar4);
            rqm rqmVar2 = sgq0Var.h;
            boolean z5 = i3 == 256;
            Object objP4 = fetVar2.P();
            if (z5) {
                cl5Var = cl5Var2;
            } else {
                cl5Var = cl5Var2;
                if (objP4 == cl5Var) {
                }
                cl5 cl5Var3 = cl5Var;
                fetVar2 = fetVar;
                obc.q(null, rqmVar2, false, null, (Function0) objP4, null, null, null, fetVar2, 0, 237);
                rqm rqmVar3 = sgq0Var.i;
                if (i3 == 256) {
                    z = true;
                } else {
                    z = false;
                }
                objP = fetVar2.P();
                if (z || objP == cl5Var3) {
                    objP = new dng0(function1, (byte) 28);
                    fetVar2.o0(objP);
                }
                obc.q(null, rqmVar3, false, null, (Function0) objP, null, null, null, fetVar2, 0, 237);
                fetVar2.r(true);
                fetVar2.r(true);
                mm40Var2 = jm40Var;
            }
            objP4 = new dng0(function1, (byte) 27);
            fetVar2.o0(objP4);
            cl5 cl5Var4 = cl5Var;
            fetVar2 = fetVar;
            obc.q(null, rqmVar2, false, null, (Function0) objP4, null, null, null, fetVar2, 0, 237);
            rqm rqmVar4 = sgq0Var.i;
            if (i3 == 256) {
                z = true;
            } else {
                z = false;
            }
            objP = fetVar2.P();
            if (z) {
                objP = new dng0(function1, (byte) 28);
                fetVar2.o0(objP);
            } else {
                objP = new dng0(function1, (byte) 28);
                fetVar2.o0(objP);
            }
            obc.q(null, rqmVar4, false, null, (Function0) objP, null, null, null, fetVar2, 0, 237);
            fetVar2.r(true);
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dfc0((Fragment) this, mm40Var2, (Object) sgq0Var, function1, i, (byte) 17);
        }
    }

    public final void Q0(mm40 mm40Var, final phq0 phq0Var, final Function1 function1, fet fetVar, int i) {
        mm40 mm40Var2;
        fetVar.g0(657896827);
        int i2 = i | 6 | (fetVar.g(phq0Var) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        final byte b = 0;
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            rqm rqmVar = phq0Var.d;
            rqm rqmVar2 = phq0Var.d;
            boolean zE = fetVar.e(rqmVar.g.ordinal());
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zE || objP == cl5Var) {
                objP = Boolean.valueOf(tx3.u(rqmVar2.g, new wui0[]{wui0.c, wui0.b}));
                fetVar.o0(objP);
            }
            boolean zBooleanValue = ((Boolean) objP).booleanValue();
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
            int i3 = i2 & 896;
            int i4 = i2 & 112;
            boolean z = (i3 == 256) | (i4 == 32);
            Object objP2 = fetVar.P();
            if (z || objP2 == cl5Var) {
                objP2 = new Function0() { // from class: a.z2i0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        byte b2 = b;
                        phq0 phq0Var2 = phq0Var;
                        Function1 function2 = function1;
                        switch (b2) {
                            case 0:
                                gle0 gle0Var = d3i0.n2;
                                function2.invoke(new w2i0(phq0Var2.f27011a));
                                break;
                            default:
                                gle0 gle0Var2 = d3i0.n2;
                                function2.invoke(new w2i0(phq0Var2.f27011a));
                                break;
                        }
                        return Unit.f46060a;
                    }
                };
                fetVar.o0(objP2);
            }
            Function0 function0 = (Function0) objP2;
            boolean z2 = (i4 == 32) | (i3 == 256);
            Object objP3 = fetVar.P();
            if (z2 || objP3 == cl5Var) {
                final byte b2 = 1;
                objP3 = new Function0() { // from class: a.z2i0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        byte b3 = b2;
                        phq0 phq0Var2 = phq0Var;
                        Function1 function2 = function1;
                        switch (b3) {
                            case 0:
                                gle0 gle0Var = d3i0.n2;
                                function2.invoke(new w2i0(phq0Var2.f27011a));
                                break;
                            default:
                                gle0 gle0Var2 = d3i0.n2;
                                function2.invoke(new w2i0(phq0Var2.f27011a));
                                break;
                        }
                        return Unit.f46060a;
                    }
                };
                fetVar.o0(objP3);
            }
            Function0 function2 = (Function0) objP3;
            mm40Var2 = jm40Var;
            obc.q(null, rqmVar2, false, null, function0, null, function2, null, fetVar, 384, 169);
            if (zBooleanValue) {
                fetVar.e0(62469238);
                mm40 mm40VarB = jr8.f16991a.b(mm40Var2, gqw0.h);
                zcl zclVar = qmk.f28987a;
                mbc.o(agi0.f827a, s5x0.N(mm40VarB, 16.0f, 0.0f, 12.0f, 0.0f, 10), false, fetVar, 6, 4);
                fetVar.r(false);
            } else {
                fetVar.e0(62756577);
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dfc0((Fragment) this, mm40Var2, (Object) phq0Var, function1, i, (byte) 16);
        }
    }

    public final void R0(int i, fet fetVar, a4x a4xVar, mm40 mm40Var, Function1 function1) {
        a4x a4xVar2;
        mm40 mm40Var2;
        fetVar.g0(775439486);
        int i2 = i | 6 | (fetVar.g(a4xVar) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128) | (fetVar.g(this) ? 2048 : 1024);
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            zcl zclVar = qmk.f28987a;
            lh80 lh80VarT = s5x0.t(4.0f, 0.0f, 2);
            boolean z = ((i2 & 112) == 32) | ((i2 & 7168) == 2048) | ((i2 & 896) == 256);
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                a4xVar2 = a4xVar;
                objP = new zlb0(a4xVar2, this, function1, (byte) 26);
                fetVar.o0(objP);
            } else {
                a4xVar2 = a4xVar;
            }
            jm40 jm40Var = jm40.b;
            b8k0.e(jm40Var, null, lh80VarT, null, null, null, false, null, (Function1) objP, fetVar, 6, 506);
            mm40Var2 = jm40Var;
        } else {
            a4xVar2 = a4xVar;
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dfc0((Fragment) this, mm40Var2, (Object) a4xVar2, function1, i, (byte) 18);
        }
    }

    public final SelectTimeFilterScreenParams S0() {
        return (SelectTimeFilterScreenParams) this.k2.n(this, o2[0]);
    }

    public final k3t0 T0() {
        return (k3t0) this.m2.getValue();
    }

    public final void U0(Date date, long j, String str, j2i0 j2i0Var) {
        eke0 eke0Var = f2i0.q2;
        androidx.fragment.app.e eVarC = C();
        eVarC.getClass();
        SelectDateTimeScreenParams selectDateTimeScreenParams = new SelectDateTimeScreenParams(j, date, str, j2i0Var, "DISMISS_DIALOG_KEY", S0().d, S0().f, S0().g, S0().h == jhq0.c);
        eke0Var.getClass();
        String strConcat = "SelectDateTimeBottomSheetDialog".concat(str);
        if (eVarC.J(strConcat) == null) {
            f2i0 f2i0Var = new f2i0();
            f2i0Var.h2.J(f2i0Var, f2i0.r2[1], selectDateTimeScreenParams);
            f2i0Var.H0(eVarC, strConcat);
        }
    }

    @Override // a.iw5, a.sik, androidx.fragment.app.Fragment
    public final void g0() {
        super.g0();
        L0().N(3);
        L0().K = true;
    }

    @Override // a.iw5, androidx.fragment.app.Fragment
    public final void i0(View view, Bundle bundle) {
        view.getClass();
        super.i0(view, bundle);
        final byte b = 0;
        sj3.s0(this, "START_DATE_SELECT_KEY", new Function1(this) { // from class: a.c3i0
            public final /* synthetic */ d3i0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b2 = b;
                d3i0 d3i0Var = this.b;
                Date date = (Date) obj;
                switch (b2) {
                    case 0:
                        gle0 gle0Var = d3i0.n2;
                        date.getClass();
                        d3i0Var.T0().x(new v2i0(date));
                        break;
                    default:
                        gle0 gle0Var2 = d3i0.n2;
                        date.getClass();
                        d3i0Var.T0().x(new s2i0(date));
                        break;
                }
                return Unit.f46060a;
            }
        });
        final byte b2 = 1;
        sj3.s0(this, "END_DATE_SELECT_KEY", new Function1(this) { // from class: a.c3i0
            public final /* synthetic */ d3i0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b3 = b2;
                d3i0 d3i0Var = this.b;
                Date date = (Date) obj;
                switch (b3) {
                    case 0:
                        gle0 gle0Var = d3i0.n2;
                        date.getClass();
                        d3i0Var.T0().x(new v2i0(date));
                        break;
                    default:
                        gle0 gle0Var2 = d3i0.n2;
                        date.getClass();
                        d3i0Var.T0().x(new s2i0(date));
                        break;
                }
                return Unit.f46060a;
            }
        });
        String str = "DISMISS_DIALOG_KEY";
        C().u0("DISMISS_DIALOG_KEY", this, new uq((Object) str, (Object) new uph0((Object) this, (byte) 5), (byte) 15));
    }
}
