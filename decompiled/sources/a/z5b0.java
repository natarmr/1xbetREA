package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/z5b0;", "La/yx5;", "<init>", "()V", "a/mi70", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class z5b0 extends yx5 {
    public woi K1;
    public z7z L1;
    public final a8z M1;
    public final s0r N1;
    public final a8z O1;
    public final yzn0 P1;
    public final a8z Q1;
    public static final /* synthetic */ iiy[] S1 = {new j0d0(z5b0.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0), new ez40(z5b0.class, "screenType", "getScreenType()Lorg/xplatform/feed/presentation/models/PopularClassicGamesScreenType;", 0)};
    public static final mi70 R1 = new mi70();

    public z5b0() {
        super(R.layout.compose_fragment);
        final byte b = 0;
        Function0 function0 = new Function0(this) { // from class: a.x5b0
            public final /* synthetic */ z5b0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b2 = b;
                z5b0 z5b0Var = this.b;
                switch (b2) {
                    case 0:
                        mi70 mi70Var = z5b0.R1;
                        List listP = z5b0Var.C().c.p();
                        ArrayList arrayListU = twn.u(listP);
                        for (Object obj : listP) {
                            if (obj instanceof yx5) {
                                arrayListU.add(obj);
                            }
                        }
                        yx5 yx5Var = (yx5) CollectionsKt.firstOrNull(arrayListU);
                        return Boolean.valueOf(yx5Var != null ? yx5Var.getW1() : true);
                    case 1:
                        woi woiVar = z5b0Var.K1;
                        if (woiVar != null) {
                            return new q0h0(woiVar);
                        }
                        Intrinsics.h("viewModelFactory");
                        throw null;
                    default:
                        mi70 mi70Var2 = z5b0.R1;
                        ComponentCallbacks2 application = z5b0Var.n0().getApplication();
                        application.getClass();
                        af3 af3Var = application instanceof af3 ? (af3) application : null;
                        if (af3Var != null) {
                            o5d0 o5d0Var = (o5d0) af3Var.d().get(a6b0.class);
                            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                            if (!(ze3Var instanceof a6b0)) {
                                ze3Var = null;
                            }
                            a6b0 a6b0Var = (a6b0) ze3Var;
                            if (a6b0Var != null) {
                                b7b0 b7b0Var = (b7b0) z5b0Var.P1.n(z5b0Var, z5b0.S1[1]);
                                epi0 epi0Var = a6b0Var.f310a;
                                xri xriVar = a6b0Var.b;
                                ugf0 ugf0Var = a6b0Var.e;
                                jw20 jw20Var = a6b0Var.f;
                                mne mneVar = a6b0Var.d;
                                itr itrVar = a6b0Var.g;
                                ctf0 ctf0Var = a6b0Var.h;
                                bzt bztVar = a6b0Var.m;
                                y78 y78Var = a6b0Var.i;
                                lbu lbuVar = a6b0Var.k;
                                pru pruVar = a6b0Var.l;
                                iip iipVar = a6b0Var.n;
                                m1e m1eVar = a6b0Var.j;
                                nr00 nr00Var = a6b0Var.c;
                                viu viuVar = a6b0Var.o;
                                xriVar.getClass();
                                itrVar.getClass();
                                iipVar.getClass();
                                m1eVar.getClass();
                                ctf0Var.getClass();
                                return new xoi(itrVar, epi0Var, jw20Var, ugf0Var, iipVar, mneVar, xriVar, nr00Var, bztVar, b7b0Var, m1eVar, ctf0Var, y78Var, lbuVar, pruVar, viuVar);
                            }
                        }
                        jf4.n(b1j.i(a6b0.class, "Cannot create dependency "));
                        return null;
                }
            }
        };
        wez wezVar = wez.b;
        this.M1 = maz.a(wezVar, function0);
        this.N1 = ltt0.o(this, y5b0.f42038a);
        final byte b2 = 1;
        this.O1 = xbc.a0(this, sre0.f32672a.b(j6b0.class), null, new Function0(this) { // from class: a.x5b0
            public final /* synthetic */ z5b0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b3 = b2;
                z5b0 z5b0Var = this.b;
                switch (b3) {
                    case 0:
                        mi70 mi70Var = z5b0.R1;
                        List listP = z5b0Var.C().c.p();
                        ArrayList arrayListU = twn.u(listP);
                        for (Object obj : listP) {
                            if (obj instanceof yx5) {
                                arrayListU.add(obj);
                            }
                        }
                        yx5 yx5Var = (yx5) CollectionsKt.firstOrNull(arrayListU);
                        return Boolean.valueOf(yx5Var != null ? yx5Var.getW1() : true);
                    case 1:
                        woi woiVar = z5b0Var.K1;
                        if (woiVar != null) {
                            return new q0h0(woiVar);
                        }
                        Intrinsics.h("viewModelFactory");
                        throw null;
                    default:
                        mi70 mi70Var2 = z5b0.R1;
                        ComponentCallbacks2 application = z5b0Var.n0().getApplication();
                        application.getClass();
                        af3 af3Var = application instanceof af3 ? (af3) application : null;
                        if (af3Var != null) {
                            o5d0 o5d0Var = (o5d0) af3Var.d().get(a6b0.class);
                            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                            if (!(ze3Var instanceof a6b0)) {
                                ze3Var = null;
                            }
                            a6b0 a6b0Var = (a6b0) ze3Var;
                            if (a6b0Var != null) {
                                b7b0 b7b0Var = (b7b0) z5b0Var.P1.n(z5b0Var, z5b0.S1[1]);
                                epi0 epi0Var = a6b0Var.f310a;
                                xri xriVar = a6b0Var.b;
                                ugf0 ugf0Var = a6b0Var.e;
                                jw20 jw20Var = a6b0Var.f;
                                mne mneVar = a6b0Var.d;
                                itr itrVar = a6b0Var.g;
                                ctf0 ctf0Var = a6b0Var.h;
                                bzt bztVar = a6b0Var.m;
                                y78 y78Var = a6b0Var.i;
                                lbu lbuVar = a6b0Var.k;
                                pru pruVar = a6b0Var.l;
                                iip iipVar = a6b0Var.n;
                                m1e m1eVar = a6b0Var.j;
                                nr00 nr00Var = a6b0Var.c;
                                viu viuVar = a6b0Var.o;
                                xriVar.getClass();
                                itrVar.getClass();
                                iipVar.getClass();
                                m1eVar.getClass();
                                ctf0Var.getClass();
                                return new xoi(itrVar, epi0Var, jw20Var, ugf0Var, iipVar, mneVar, xriVar, nr00Var, bztVar, b7b0Var, m1eVar, ctf0Var, y78Var, lbuVar, pruVar, viuVar);
                            }
                        }
                        jf4.n(b1j.i(a6b0.class, "Cannot create dependency "));
                        return null;
                }
            }
        }, 14);
        this.P1 = new yzn0("SCREEN_TYPE_KEY");
        final byte b3 = 2;
        this.Q1 = maz.a(wezVar, new Function0(this) { // from class: a.x5b0
            public final /* synthetic */ z5b0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b4 = b3;
                z5b0 z5b0Var = this.b;
                switch (b4) {
                    case 0:
                        mi70 mi70Var = z5b0.R1;
                        List listP = z5b0Var.C().c.p();
                        ArrayList arrayListU = twn.u(listP);
                        for (Object obj : listP) {
                            if (obj instanceof yx5) {
                                arrayListU.add(obj);
                            }
                        }
                        yx5 yx5Var = (yx5) CollectionsKt.firstOrNull(arrayListU);
                        return Boolean.valueOf(yx5Var != null ? yx5Var.getW1() : true);
                    case 1:
                        woi woiVar = z5b0Var.K1;
                        if (woiVar != null) {
                            return new q0h0(woiVar);
                        }
                        Intrinsics.h("viewModelFactory");
                        throw null;
                    default:
                        mi70 mi70Var2 = z5b0.R1;
                        ComponentCallbacks2 application = z5b0Var.n0().getApplication();
                        application.getClass();
                        af3 af3Var = application instanceof af3 ? (af3) application : null;
                        if (af3Var != null) {
                            o5d0 o5d0Var = (o5d0) af3Var.d().get(a6b0.class);
                            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                            if (!(ze3Var instanceof a6b0)) {
                                ze3Var = null;
                            }
                            a6b0 a6b0Var = (a6b0) ze3Var;
                            if (a6b0Var != null) {
                                b7b0 b7b0Var = (b7b0) z5b0Var.P1.n(z5b0Var, z5b0.S1[1]);
                                epi0 epi0Var = a6b0Var.f310a;
                                xri xriVar = a6b0Var.b;
                                ugf0 ugf0Var = a6b0Var.e;
                                jw20 jw20Var = a6b0Var.f;
                                mne mneVar = a6b0Var.d;
                                itr itrVar = a6b0Var.g;
                                ctf0 ctf0Var = a6b0Var.h;
                                bzt bztVar = a6b0Var.m;
                                y78 y78Var = a6b0Var.i;
                                lbu lbuVar = a6b0Var.k;
                                pru pruVar = a6b0Var.l;
                                iip iipVar = a6b0Var.n;
                                m1e m1eVar = a6b0Var.j;
                                nr00 nr00Var = a6b0Var.c;
                                viu viuVar = a6b0Var.o;
                                xriVar.getClass();
                                itrVar.getClass();
                                iipVar.getClass();
                                m1eVar.getClass();
                                ctf0Var.getClass();
                                return new xoi(itrVar, epi0Var, jw20Var, ugf0Var, iipVar, mneVar, xriVar, nr00Var, bztVar, b7b0Var, m1eVar, ctf0Var, y78Var, lbuVar, pruVar, viuVar);
                            }
                        }
                        jf4.n(b1j.i(a6b0.class, "Cannot create dependency "));
                        return null;
                }
            }
        });
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        Object objN = this.N1.n(S1[0], this);
        objN.getClass();
        pkd.i(((aid) objN).f919a, null, new ugd(1102057442, true, new lma0(this, (byte) 8)));
    }

    @Override // a.yx5
    public final void C0() {
        xoi xoiVar = (xoi) this.Q1.getValue();
        this.K1 = (woi) xoiVar.r.get();
        this.L1 = mbl.a(xoiVar.s);
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        gmq gmqVarC = ((i3t0) ((k3t0) this.O1.getValue())).C();
        s980 s980Var = new s980(this, null, (byte) 23);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new fra0((i89) gmqVarC, clzVarW, s980Var, (yje) null), 3);
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void Z() {
        z7z z7zVar = this.L1;
        if (z7zVar == null) {
            Intrinsics.h("altDesignGameCardFragmentDelegate");
            throw null;
        }
        ((ujd) z7zVar.get()).getClass();
        ujd.a(this);
        super.Z();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void g0() {
        super.g0();
        z7z z7zVar = this.L1;
        if (z7zVar != null) {
            ((ujd) z7zVar.get()).c(this, new ir2(), new yr80(this, (byte) 23));
        } else {
            Intrinsics.h("altDesignGameCardFragmentDelegate");
            throw null;
        }
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0 */
    public final boolean getW1() {
        return ((Boolean) this.M1.getValue()).booleanValue();
    }
}
