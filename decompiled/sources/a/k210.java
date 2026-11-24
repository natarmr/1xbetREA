package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.cyber.game.lol.api.LolPostGameStatScreenParams;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/k210;", "La/yx5;", "<init>", "()V", "a/atz", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class k210 extends yx5 {
    public bki K1;
    public g2v L1;
    public wdk0 M1;
    public final usd N1;
    public final kiu0 O1;
    public final s0r P1;
    public final qdz Q1;
    public final khf0 R1;
    public final boolean S1;
    public static final /* synthetic */ iiy[] V1 = {new j0d0(k210.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0), new ez40(k210.class, "screenParams", "getScreenParams()Lorg/xplatform/cyber/game/lol/api/LolPostGameStatScreenParams;", 0)};
    public static final atz U1 = new atz();

    public k210() {
        super(R.layout.compose_fragment);
        this.N1 = new usd();
        h210 h210Var = new h210(this, (byte) 0);
        a8z a8zVarA = maz.a(wez.b, new be00(new be00(this, (byte) 8), (byte) 9));
        this.O1 = agc.G(this, sre0.f32672a.b(b310.class), new j210(a8zVarA, (byte) 0), new j210(a8zVarA, (byte) 1), h210Var);
        this.P1 = ltt0.o(this, i210.f14027a);
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
        pkd.h(((aid) objN).f919a, new owp0(this), null, new ugd(-2120899966, true, new g2z(this, (byte) 19)));
    }

    @Override // a.yx5
    public final void C0() {
        LinkedHashMap linkedHashMap = m210.f21034a;
        iiy[] iiyVarArr = V1;
        iiy iiyVar = iiyVarArr[1];
        khf0 khf0Var = this.R1;
        String str = ((LolPostGameStatScreenParams) khf0Var.n(this, iiyVar)).f46515a;
        cb50 cb50VarV = efx.v(this);
        str.getClass();
        cb50VarV.getClass();
        String strConcat = str.concat(cb50VarV.f4046a);
        LolPostGameStatScreenParams lolPostGameStatScreenParams = (LolPostGameStatScreenParams) khf0Var.n(this, iiyVarArr[1]);
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        LinkedHashMap linkedHashMap2 = m210.f21034a;
        cki ckiVar = (cki) linkedHashMap2.get(strConcat);
        if (ckiVar == null) {
            af3 af3Var = application instanceof af3 ? (af3) application : null;
            if (af3Var != null) {
                o5d0 o5d0Var = (o5d0) af3Var.d().get(l210.class);
                ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                l210 l210Var = (l210) (ze3Var instanceof l210 ? ze3Var : null);
                if (l210Var != null) {
                    duj dujVar = l210Var.f19285a;
                    g2v g2vVar = l210Var.b;
                    cad cadVar = l210Var.c;
                    m1e m1eVar = l210Var.d;
                    gii0 gii0Var = l210Var.e;
                    oeg0 oeg0Var = l210Var.f;
                    pyg pygVar = l210Var.g;
                    clc clcVar = l210Var.h;
                    ctf0 ctf0Var = l210Var.i;
                    roi0 roi0Var = l210Var.j;
                    xri xriVar = l210Var.k;
                    iip iipVar = l210Var.l;
                    epi0 epi0Var = l210Var.m;
                    wdk0 wdk0Var = l210Var.n;
                    knf0 knf0Var = l210Var.o;
                    ugf0 ugf0Var = l210Var.p;
                    dwu dwuVar = l210Var.q;
                    kt2 kt2Var = l210Var.r;
                    zr1 zr1Var = l210Var.s;
                    lbu lbuVar = l210Var.t;
                    bwl bwlVar = l210Var.u;
                    a1d a1dVar = l210Var.v;
                    qgh qghVar = l210Var.w;
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
                    cki ckiVar2 = new cki(cadVar, clcVar, pygVar, roi0Var, xriVar, iipVar, ugf0Var, epi0Var, bwlVar, a1dVar, dujVar, lolPostGameStatScreenParams, g2vVar, m1eVar, gii0Var, oeg0Var, strConcat, ctf0Var, wdk0Var, dwuVar, kt2Var, zr1Var, lbuVar, qghVar);
                    linkedHashMap2.put(strConcat, ckiVar2);
                    ckiVar = ckiVar2;
                }
            }
            jf4.n(b1j.i(l210.class, "Cannot create dependency "));
            return;
        }
        this.K1 = (bki) ckiVar.z.get();
        this.L1 = ckiVar.k;
        this.M1 = ckiVar.x;
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        ol60 ol60Var = ((b310) this.O1.getValue()).E;
        kaw kawVar = new kaw(this, null, (byte) 27);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new zd00((gmq) ol60Var, clzVarW, kawVar, (yje) null, (char) 0), 3);
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getL1() {
        return this.S1;
    }
}
