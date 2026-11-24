package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.cyber.game.mlbb.api.MlbbPostGameStatScreenParams;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/ik40;", "La/yx5;", "<init>", "()V", "a/uuz", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ik40 extends yx5 {
    public vli K1;
    public g2v L1;
    public wdk0 M1;
    public final usd N1;
    public final kiu0 O1;
    public final s0r P1;
    public final khf0 Q1;
    public final boolean R1;
    public static final /* synthetic */ iiy[] U1 = {new j0d0(ik40.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0), new ez40(ik40.class, "screenParams", "getScreenParams()Lorg/xplatform/cyber/game/mlbb/api/MlbbPostGameStatScreenParams;", 0)};
    public static final uuz S1 = new uuz();

    public ik40() {
        super(R.layout.compose_fragment);
        this.N1 = new usd();
        fk40 fk40Var = new fk40(this, (byte) 0);
        a8z a8zVarA = maz.a(wez.b, new pv10(new pv10(this, (byte) 25), (byte) 26));
        this.O1 = agc.G(this, sre0.f32672a.b(wk40.class), new y620(a8zVarA, (byte) 16), new y620(a8zVarA, (byte) 17), fk40Var);
        this.P1 = ltt0.o(this, gk40.f11428a);
        this.Q1 = new khf0("KEY_SCREEN_PARAMS");
        this.R1 = true;
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        this.N1.getClass();
        usd.d(this);
        wdk0 wdk0Var = this.M1;
        if (wdk0Var == null) {
            Intrinsics.h("snackbarManager");
            throw null;
        }
        wdk0.l(wdk0Var, this, this.R1);
        Object objN = this.P1.n(U1[0], this);
        objN.getClass();
        pkd.h(((aid) objN).f919a, new owp0(this), null, new ugd(892137962, true, new pi40(this, (byte) 2)));
    }

    @Override // a.yx5
    public final void C0() {
        LinkedHashMap linkedHashMap = kk40.f18420a;
        iiy[] iiyVarArr = U1;
        iiy iiyVar = iiyVarArr[1];
        khf0 khf0Var = this.Q1;
        String str = ((MlbbPostGameStatScreenParams) khf0Var.n(this, iiyVar)).f46518a;
        cb50 cb50VarV = efx.v(this);
        str.getClass();
        cb50VarV.getClass();
        String strConcat = str.concat(cb50VarV.f4046a);
        MlbbPostGameStatScreenParams mlbbPostGameStatScreenParams = (MlbbPostGameStatScreenParams) khf0Var.n(this, iiyVarArr[1]);
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        LinkedHashMap linkedHashMap2 = kk40.f18420a;
        wli wliVar = (wli) linkedHashMap2.get(strConcat);
        if (wliVar == null) {
            af3 af3Var = application instanceof af3 ? (af3) application : null;
            if (af3Var != null) {
                o5d0 o5d0Var = (o5d0) af3Var.d().get(jk40.class);
                ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                jk40 jk40Var = (jk40) (ze3Var instanceof jk40 ? ze3Var : null);
                if (jk40Var != null) {
                    duj dujVar = jk40Var.f16649a;
                    g2v g2vVar = jk40Var.b;
                    cad cadVar = jk40Var.c;
                    m1e m1eVar = jk40Var.d;
                    oeg0 oeg0Var = jk40Var.e;
                    pyg pygVar = jk40Var.f;
                    clc clcVar = jk40Var.g;
                    ctf0 ctf0Var = jk40Var.h;
                    iip iipVar = jk40Var.i;
                    epi0 epi0Var = jk40Var.j;
                    wdk0 wdk0Var = jk40Var.k;
                    ugf0 ugf0Var = jk40Var.l;
                    kt2 kt2Var = jk40Var.m;
                    zr1 zr1Var = jk40Var.n;
                    lbu lbuVar = jk40Var.o;
                    bwl bwlVar = jk40Var.p;
                    a1d a1dVar = jk40Var.q;
                    pygVar.getClass();
                    iipVar.getClass();
                    m1eVar.getClass();
                    oeg0Var.getClass();
                    ctf0Var.getClass();
                    wdk0Var.getClass();
                    kt2Var.getClass();
                    wli wliVar2 = new wli(cadVar, clcVar, pygVar, iipVar, ugf0Var, epi0Var, bwlVar, a1dVar, dujVar, mlbbPostGameStatScreenParams, g2vVar, m1eVar, oeg0Var, strConcat, ctf0Var, wdk0Var, kt2Var, zr1Var, lbuVar);
                    linkedHashMap2.put(strConcat, wliVar2);
                    wliVar = wliVar2;
                }
            }
            jf4.n(b1j.i(jk40.class, "Cannot create dependency "));
            return;
        }
        this.K1 = (vli) wliVar.t.get();
        this.L1 = wliVar.i;
        this.M1 = wliVar.s;
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        ol60 ol60Var = ((wk40) this.O1.getValue()).x;
        xr10 xr10Var = new xr10((Object) this, (yje) null, (byte) 14);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new hk40(ol60Var, clzVarW, xr10Var, (yje) null), 3);
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getL1() {
        return this.R1;
    }
}
