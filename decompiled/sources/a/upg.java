package a;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import java.util.LinkedHashMap;
import java.util.WeakHashMap;
import kotlin.Metadata;
import org.xbet.client1.R;
import org.xplatform.cyber.cyberstatistic.api.navigation.CyberGameStatisticScreenParams;
import org.xplatform.cyber.cyberstatistic.impl.presentation.dota.StickyHeaderLayoutManager;
import org.xplatform.cyber.game.core.InterceptTouchRecyclerView;
import org.xplatform.uikit.components.toolbar.statical.DsNavigationBarStatic;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/upg;", "La/yx5;", "<init>", "()V", "a/kwd", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class upg extends yx5 {
    public nei K1;
    public g2v L1;
    public wdk0 M1;
    public final cgx0 N1;
    public final usd O1;
    public final qud P1;
    public final kiu0 Q1;
    public final s0r R1;
    public final khf0 S1;
    public h5m U1;
    public final a8z V1;
    public final boolean W1;
    public static final /* synthetic */ iiy[] Y1 = {new j0d0(upg.class, "binding", "getBinding()Lorg/xplatform/cyber/cyberstatistic/impl/databinding/CybergameStatisticFragmentBinding;", 0), new ez40(upg.class, "screenParams", "getScreenParams()Lorg/xplatform/cyber/cyberstatistic/api/navigation/CyberGameStatisticScreenParams;", 0)};
    public static final kwd X1 = new kwd();

    public upg() {
        super(R.layout.cybergame_statistic_fragment);
        this.N1 = new cgx0((byte) 5, false);
        this.O1 = new usd();
        this.P1 = new qud();
        mpg mpgVar = new mpg(this, (byte) 1);
        q7g q7gVar = new q7g(this, (byte) 14);
        wez wezVar = wez.b;
        a8z a8zVarA = maz.a(wezVar, new q7g(q7gVar, (byte) 15));
        this.Q1 = agc.G(this, sre0.f32672a.b(vqg.class), new r7g(a8zVarA, (byte) 14), new r7g(a8zVarA, (byte) 15), mpgVar);
        this.R1 = ltt0.o(this, npg.f23912a);
        this.S1 = new khf0("KEY_SCREEN_PARAMS");
        this.V1 = maz.a(wezVar, new mpg(this, (byte) 2));
        this.W1 = true;
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        this.U1 = new h5m(false);
        View viewQ0 = q0();
        psc pscVar = new psc((Object) this, (byte) 9);
        WeakHashMap weakHashMap = rgu0.f30456a;
        igu0.c(viewQ0, pscVar);
        this.O1.getClass();
        usd.d(this);
        DsNavigationBarStatic dsNavigationBarStatic = G0().e;
        mpg mpgVar = new mpg(this, (byte) 0);
        s96 s96Var = dsNavigationBarStatic.b;
        if (s96Var != null) {
            s96Var.c(mpgVar);
        }
        InterceptTouchRecyclerView interceptTouchRecyclerView = G0().f;
        jpg jpgVar = (jpg) this.V1.getValue();
        cgx0 cgx0Var = this.N1;
        cgx0Var.getClass();
        jpgVar.getClass();
        cgx0Var.c = jpgVar;
        cgx0Var.d = new StickyHeaderLayoutManager(interceptTouchRecyclerView);
        interceptTouchRecyclerView.setItemAnimator(null);
        Resources resources = interceptTouchRecyclerView.getResources();
        resources.getClass();
        interceptTouchRecyclerView.m(new aqg(resources));
        vvw.o(interceptTouchRecyclerView, true, 1);
        interceptTouchRecyclerView.setLayoutManager((StickyHeaderLayoutManager) cgx0Var.d);
        interceptTouchRecyclerView.setAdapter(jpgVar);
        interceptTouchRecyclerView.setShouldInterceptTouch(new hfg(jpgVar, (byte) 8));
    }

    @Override // a.yx5
    public final void C0() {
        Resources resources;
        DisplayMetrics displayMetrics;
        LinkedHashMap linkedHashMap = wpg.f39543a;
        iiy[] iiyVarArr = Y1;
        iiy iiyVar = iiyVarArr[1];
        khf0 khf0Var = this.S1;
        String str = ((CyberGameStatisticScreenParams) khf0Var.n(this, iiyVar)).f46490a;
        cb50 cb50VarV = efx.v(this);
        str.getClass();
        cb50VarV.getClass();
        String strConcat = str.concat(cb50VarV.f4046a);
        CyberGameStatisticScreenParams cyberGameStatisticScreenParams = (CyberGameStatisticScreenParams) khf0Var.n(this, iiyVarArr[1]);
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        Context contextD = D();
        int i = (contextD == null || (resources = contextD.getResources()) == null || (displayMetrics = resources.getDisplayMetrics()) == null) ? 0 : displayMetrics.widthPixels;
        LinkedHashMap linkedHashMap2 = wpg.f39543a;
        oei oeiVar = (oei) linkedHashMap2.get(strConcat);
        if (oeiVar == null) {
            af3 af3Var = application instanceof af3 ? (af3) application : null;
            if (af3Var != null) {
                o5d0 o5d0Var = (o5d0) af3Var.d().get(vpg.class);
                ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                vpg vpgVar = (vpg) (ze3Var instanceof vpg ? ze3Var : null);
                if (vpgVar != null) {
                    duj dujVar = vpgVar.f37803a;
                    g2v g2vVar = vpgVar.b;
                    cad cadVar = vpgVar.c;
                    m1e m1eVar = vpgVar.d;
                    gii0 gii0Var = vpgVar.e;
                    oeg0 oeg0Var = vpgVar.f;
                    pyg pygVar = vpgVar.g;
                    clc clcVar = vpgVar.h;
                    ctf0 ctf0Var = vpgVar.i;
                    roi0 roi0Var = vpgVar.j;
                    knf0 knf0Var = vpgVar.k;
                    pru pruVar = vpgVar.l;
                    xri xriVar = vpgVar.m;
                    iip iipVar = vpgVar.n;
                    r9u r9uVar = vpgVar.o;
                    wdk0 wdk0Var = vpgVar.p;
                    ugf0 ugf0Var = vpgVar.q;
                    dwu dwuVar = vpgVar.r;
                    kt2 kt2Var = vpgVar.s;
                    zr1 zr1Var = vpgVar.t;
                    lbu lbuVar = vpgVar.u;
                    bwl bwlVar = vpgVar.v;
                    a1d a1dVar = vpgVar.w;
                    qgh qghVar = vpgVar.x;
                    pygVar.getClass();
                    xriVar.getClass();
                    iipVar.getClass();
                    m1eVar.getClass();
                    gii0Var.getClass();
                    oeg0Var.getClass();
                    ctf0Var.getClass();
                    knf0Var.getClass();
                    r9uVar.getClass();
                    wdk0Var.getClass();
                    kt2Var.getClass();
                    oei oeiVar2 = new oei(cadVar, clcVar, pygVar, roi0Var, xriVar, iipVar, ugf0Var, bwlVar, a1dVar, dujVar, cyberGameStatisticScreenParams, g2vVar, m1eVar, gii0Var, oeg0Var, strConcat, ctf0Var, Integer.valueOf(i), pruVar, r9uVar, wdk0Var, dwuVar, kt2Var, zr1Var, lbuVar, qghVar);
                    linkedHashMap2.put(strConcat, oeiVar2);
                    oeiVar = oeiVar2;
                }
            }
            jf4.n(b1j.i(vpg.class, "Cannot create dependency "));
            return;
        }
        this.K1 = (nei) oeiVar.A.get();
        this.L1 = oeiVar.l;
        this.M1 = oeiVar.z;
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        p7m0 p7m0Var = H0().I;
        yje yjeVar = null;
        tpg tpgVar = new tpg(this, yjeVar, (byte) 0);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new g8g(p7m0Var, clzVarW, tpgVar, (yje) null), 3);
        p7m0 p7m0Var2 = H0().J;
        tpg tpgVar2 = new tpg(this, yjeVar, (byte) 1);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new g8g(p7m0Var2, clzVarW2, tpgVar2, (yje) null, (byte) 0), 3);
        ol60 ol60Var = H0().D;
        tpg tpgVar3 = new tpg(this, yjeVar, (byte) 2);
        clz clzVarW3 = aac.W(this);
        qjj.W(x0x.Q(clzVarW3.x()), null, null, new g8g((gmq) ol60Var, clzVarW3, tpgVar3, (yje) null, (char) 0), 3);
    }

    public final rth G0() {
        Object objN = this.R1.n(Y1[0], this);
        objN.getClass();
        return (rth) objN;
    }

    public final vqg H0() {
        return (vqg) this.Q1.getValue();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void Z() {
        super.Z();
        InterceptTouchRecyclerView interceptTouchRecyclerView = G0().f;
        cgx0 cgx0Var = this.N1;
        cgx0Var.getClass();
        interceptTouchRecyclerView.setAdapter(null);
        cgx0Var.d = null;
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getQ1() {
        return this.W1;
    }
}
