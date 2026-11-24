package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.cyber.game.valorant.api.ValorantPostGameScreenParams;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/czt0;", "La/yx5;", "<init>", "()V", "a/wxs0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class czt0 extends yx5 {
    public ryi K1;
    public g2v L1;
    public wdk0 M1;
    public final usd N1;
    public final kiu0 O1;
    public final s0r P1;
    public final qdz Q1;
    public final khf0 R1;
    public final boolean S1;
    public static final /* synthetic */ iiy[] V1 = {new j0d0(czt0.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0), new ez40(czt0.class, "screenParams", "getScreenParams()Lorg/xplatform/cyber/game/valorant/api/ValorantPostGameScreenParams;", 0)};
    public static final wxs0 U1 = new wxs0((byte) 6);

    public czt0() {
        super(R.layout.compose_fragment);
        this.N1 = new usd();
        azt0 azt0Var = new azt0(this, (byte) 0);
        a8z a8zVarA = maz.a(wez.b, new cvs0(new cvs0(this, (byte) 6), (byte) 7));
        this.O1 = agc.G(this, sre0.f32672a.b(tzt0.class), new p7r0(a8zVarA, (byte) 28), new p7r0(a8zVarA, (byte) 29), azt0Var);
        this.P1 = ltt0.o(this, bzt0.f3489a);
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
        pkd.h(((aid) objN).f919a, new owp0(this), null, new ugd(1706595226, true, new ggt0(this, (byte) 3)));
    }

    @Override // a.yx5
    public final void C0() {
        LinkedHashMap linkedHashMap = ezt0.f8686a;
        iiy[] iiyVarArr = V1;
        iiy iiyVar = iiyVarArr[1];
        khf0 khf0Var = this.R1;
        String str = ((ValorantPostGameScreenParams) khf0Var.n(this, iiyVar)).f46543a;
        cb50 cb50VarV = efx.v(this);
        str.getClass();
        cb50VarV.getClass();
        String strConcat = str.concat(cb50VarV.f4046a);
        ValorantPostGameScreenParams valorantPostGameScreenParams = (ValorantPostGameScreenParams) khf0Var.n(this, iiyVarArr[1]);
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        LinkedHashMap linkedHashMap2 = ezt0.f8686a;
        syi syiVar = (syi) linkedHashMap2.get(strConcat);
        if (syiVar == null) {
            af3 af3Var = application instanceof af3 ? (af3) application : null;
            if (af3Var != null) {
                o5d0 o5d0Var = (o5d0) af3Var.d().get(dzt0.class);
                ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                dzt0 dzt0Var = (dzt0) (ze3Var instanceof dzt0 ? ze3Var : null);
                if (dzt0Var != null) {
                    duj dujVar = dzt0Var.f6957a;
                    g2v g2vVar = dzt0Var.b;
                    cad cadVar = dzt0Var.c;
                    m1e m1eVar = dzt0Var.d;
                    gii0 gii0Var = dzt0Var.e;
                    oeg0 oeg0Var = dzt0Var.f;
                    pyg pygVar = dzt0Var.g;
                    clc clcVar = dzt0Var.h;
                    ctf0 ctf0Var = dzt0Var.i;
                    roi0 roi0Var = dzt0Var.j;
                    xri xriVar = dzt0Var.k;
                    iip iipVar = dzt0Var.l;
                    epi0 epi0Var = dzt0Var.p;
                    wdk0 wdk0Var = dzt0Var.m;
                    knf0 knf0Var = dzt0Var.n;
                    ugf0 ugf0Var = dzt0Var.o;
                    dwu dwuVar = dzt0Var.q;
                    kt2 kt2Var = dzt0Var.r;
                    zr1 zr1Var = dzt0Var.s;
                    lbu lbuVar = dzt0Var.t;
                    bwl bwlVar = dzt0Var.u;
                    a1d a1dVar = dzt0Var.v;
                    qgh qghVar = dzt0Var.w;
                    pygVar.getClass();
                    xriVar.getClass();
                    iipVar.getClass();
                    m1eVar.getClass();
                    gii0Var.getClass();
                    oeg0Var.getClass();
                    ctf0Var.getClass();
                    wdk0Var.getClass();
                    knf0Var.getClass();
                    kt2Var.getClass();
                    syi syiVar2 = new syi(cadVar, clcVar, pygVar, roi0Var, xriVar, iipVar, ugf0Var, epi0Var, bwlVar, a1dVar, dujVar, valorantPostGameScreenParams, g2vVar, m1eVar, gii0Var, oeg0Var, strConcat, ctf0Var, wdk0Var, dwuVar, kt2Var, zr1Var, lbuVar, qghVar);
                    linkedHashMap2.put(strConcat, syiVar2);
                    syiVar = syiVar2;
                }
            }
            jf4.n(b1j.i(dzt0.class, "Cannot create dependency "));
            return;
        }
        this.K1 = (ryi) syiVar.z.get();
        this.L1 = syiVar.k;
        this.M1 = syiVar.x;
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        ol60 ol60Var = ((tzt0) this.O1.getValue()).E;
        rtq0 rtq0Var = new rtq0(this, null, (byte) 17);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new tsr0((gmq) ol60Var, clzVarW, rtq0Var, (yje) null, (byte) 0, false), 3);
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getL1() {
        return this.S1;
    }
}
