package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import org.xbet.client1.R;
import org.xplatform.ufc.api.game.UfcPostGameParams;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/m5t0;", "La/yx5;", "<init>", "()V", "a/wxs0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class m5t0 extends yx5 {
    public myi K1;
    public wdk0 L1;
    public final usd M1;
    public final khf0 N1;
    public final s0r O1;
    public final a8z P1;
    public final boolean Q1;
    public static final /* synthetic */ iiy[] S1 = {new ez40(m5t0.class, "params", "getParams()Lorg/xplatform/ufc/api/game/UfcPostGameParams;", 0), new j0d0(m5t0.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0)};
    public static final wxs0 R1 = new wxs0((byte) 1);

    public m5t0() {
        super(R.layout.compose_fragment);
        this.M1 = new usd();
        this.N1 = new khf0("params_key");
        this.O1 = ltt0.o(this, l5t0.f19477a);
        this.P1 = xbc.a0(this, sre0.f32672a.b(a6t0.class), null, new qir0(this, (byte) 27), 14);
        this.Q1 = true;
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        this.M1.getClass();
        usd.d(this);
        Object objN = this.O1.n(S1[1], this);
        objN.getClass();
        pkd.h(((aid) objN).b, new owp0(this), null, new ugd(-341475990, true, new p6r0(this, (byte) 25)));
    }

    @Override // a.yx5
    public final void C0() {
        LinkedHashMap linkedHashMap = g5t0.f10733a;
        iiy[] iiyVarArr = S1;
        iiy iiyVar = iiyVarArr[0];
        khf0 khf0Var = this.N1;
        UfcPostGameParams ufcPostGameParams = (UfcPostGameParams) khf0Var.n(this, iiyVar);
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        String strK = kng0.k("ufc_post_game_", ((UfcPostGameParams) khf0Var.n(this, iiyVarArr[0])).f47171a);
        LinkedHashMap linkedHashMap2 = g5t0.f10733a;
        oyi oyiVar = (oyi) linkedHashMap2.get(strK);
        if (oyiVar == null) {
            af3 af3Var = application instanceof af3 ? (af3) application : null;
            if (af3Var != null) {
                o5d0 o5d0Var = (o5d0) af3Var.d().get(f5t0.class);
                ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                f5t0 f5t0Var = (f5t0) (ze3Var instanceof f5t0 ? ze3Var : null);
                if (f5t0Var != null) {
                    clc clcVar = f5t0Var.f8980a;
                    cad cadVar = f5t0Var.b;
                    xri xriVar = f5t0Var.c;
                    iip iipVar = f5t0Var.d;
                    bwl bwlVar = f5t0Var.e;
                    a1d a1dVar = f5t0Var.f;
                    oeg0 oeg0Var = f5t0Var.g;
                    gii0 gii0Var = f5t0Var.h;
                    m1e m1eVar = f5t0Var.i;
                    g2v g2vVar = f5t0Var.j;
                    knf0 knf0Var = f5t0Var.k;
                    wdk0 wdk0Var = f5t0Var.l;
                    ctf0 ctf0Var = f5t0Var.m;
                    iqt iqtVar = f5t0Var.n;
                    dwu dwuVar = f5t0Var.o;
                    qgh qghVar = f5t0Var.p;
                    r9u r9uVar = f5t0Var.q;
                    xriVar.getClass();
                    iipVar.getClass();
                    oeg0Var.getClass();
                    gii0Var.getClass();
                    m1eVar.getClass();
                    knf0Var.getClass();
                    wdk0Var.getClass();
                    ctf0Var.getClass();
                    r9uVar.getClass();
                    oyi oyiVar2 = new oyi(clcVar, cadVar, iipVar, bwlVar, a1dVar, oeg0Var, gii0Var, ufcPostGameParams, strK, m1eVar, g2vVar, knf0Var, wdk0Var, ctf0Var, iqtVar, dwuVar, qghVar, r9uVar);
                    linkedHashMap2.put(strK, oyiVar2);
                    oyiVar = oyiVar2;
                }
            }
            jf4.n(b1j.i(f5t0.class, "Cannot create dependency "));
            return;
        }
        this.K1 = (myi) oyiVar.w.get();
        this.L1 = oyiVar.r;
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getQ1() {
        return this.Q1;
    }
}
