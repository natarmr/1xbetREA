package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.cyber.game.rainbow.api.RainbowPostGameScreenParams;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/rwd0;", "La/yx5;", "<init>", "()V", "a/rl70", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class rwd0 extends yx5 {
    public zqi K1;
    public g2v L1;
    public wdk0 M1;
    public final usd N1;
    public final kiu0 O1;
    public final s0r P1;
    public final qdz Q1;
    public final khf0 R1;
    public final boolean S1;
    public static final /* synthetic */ iiy[] V1 = {new j0d0(rwd0.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0), new ez40(rwd0.class, "screenParams", "getScreenParams()Lorg/xplatform/cyber/game/rainbow/api/RainbowPostGameScreenParams;", 0)};
    public static final rl70 U1 = new rl70();

    public rwd0() {
        super(R.layout.compose_fragment);
        this.N1 = new usd();
        pwd0 pwd0Var = new pwd0(this, (byte) 0);
        a8z a8zVarA = maz.a(wez.b, new f1d0(new f1d0(this, (byte) 25), (byte) 26));
        this.O1 = agc.G(this, sre0.f32672a.b(hxd0.class), new ync0(a8zVarA, (byte) 28), new ync0(a8zVarA, (byte) 29), pwd0Var);
        this.P1 = ltt0.o(this, qwd0.f29430a);
        this.Q1 = new qdz();
        this.R1 = new khf0("KEY_SCREEN_PARAMS");
        this.S1 = true;
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
        wdk0.l(wdk0Var, this, this.S1);
        Object objN = this.P1.n(V1[0], this);
        objN.getClass();
        pkd.h(((aid) objN).f919a, new owp0(this), null, new ugd(776815605, true, new nrc0(this, (byte) 14)));
    }

    @Override // a.yx5
    public final void C0() {
        LinkedHashMap linkedHashMap = twd0.f34646a;
        iiy[] iiyVarArr = V1;
        iiy iiyVar = iiyVarArr[1];
        khf0 khf0Var = this.R1;
        String str = ((RainbowPostGameScreenParams) khf0Var.n(this, iiyVar)).f46521a;
        cb50 cb50VarV = efx.v(this);
        str.getClass();
        cb50VarV.getClass();
        String strConcat = str.concat(cb50VarV.f4046a);
        RainbowPostGameScreenParams rainbowPostGameScreenParams = (RainbowPostGameScreenParams) khf0Var.n(this, iiyVarArr[1]);
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        LinkedHashMap linkedHashMap2 = twd0.f34646a;
        ari ariVar = (ari) linkedHashMap2.get(strConcat);
        if (ariVar == null) {
            af3 af3Var = application instanceof af3 ? (af3) application : null;
            if (af3Var != null) {
                o5d0 o5d0Var = (o5d0) af3Var.d().get(swd0.class);
                ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                swd0 swd0Var = (swd0) (ze3Var instanceof swd0 ? ze3Var : null);
                if (swd0Var != null) {
                    duj dujVar = swd0Var.f32918a;
                    g2v g2vVar = swd0Var.b;
                    cad cadVar = swd0Var.c;
                    m1e m1eVar = swd0Var.d;
                    gii0 gii0Var = swd0Var.e;
                    oeg0 oeg0Var = swd0Var.f;
                    pyg pygVar = swd0Var.g;
                    clc clcVar = swd0Var.h;
                    ctf0 ctf0Var = swd0Var.i;
                    roi0 roi0Var = swd0Var.j;
                    xri xriVar = swd0Var.k;
                    iip iipVar = swd0Var.l;
                    epi0 epi0Var = swd0Var.m;
                    wdk0 wdk0Var = swd0Var.o;
                    j1q0 j1q0Var = swd0Var.n;
                    knf0 knf0Var = swd0Var.p;
                    ugf0 ugf0Var = swd0Var.q;
                    dwu dwuVar = swd0Var.r;
                    kt2 kt2Var = swd0Var.s;
                    zr1 zr1Var = swd0Var.t;
                    lbu lbuVar = swd0Var.u;
                    bwl bwlVar = swd0Var.v;
                    a1d a1dVar = swd0Var.w;
                    qgh qghVar = swd0Var.x;
                    pygVar.getClass();
                    xriVar.getClass();
                    iipVar.getClass();
                    m1eVar.getClass();
                    gii0Var.getClass();
                    oeg0Var.getClass();
                    ctf0Var.getClass();
                    wdk0Var.getClass();
                    j1q0Var.getClass();
                    knf0Var.getClass();
                    kt2Var.getClass();
                    ari ariVar2 = new ari(cadVar, clcVar, pygVar, roi0Var, xriVar, iipVar, ugf0Var, epi0Var, bwlVar, a1dVar, dujVar, rainbowPostGameScreenParams, g2vVar, m1eVar, gii0Var, oeg0Var, strConcat, ctf0Var, wdk0Var, dwuVar, kt2Var, zr1Var, lbuVar, qghVar);
                    linkedHashMap2.put(strConcat, ariVar2);
                    ariVar = ariVar2;
                }
            }
            jf4.n(b1j.i(swd0.class, "Cannot create dependency "));
            return;
        }
        this.K1 = (zqi) ariVar.z.get();
        this.L1 = ariVar.k;
        this.M1 = ariVar.x;
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        ol60 ol60Var = ((hxd0) this.O1.getValue()).E;
        s9c0 s9c0Var = new s9c0(this, null, (byte) 19);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new fxc0(ol60Var, clzVarW, s9c0Var, (yje) null), 3);
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getL1() {
        return this.S1;
    }
}
