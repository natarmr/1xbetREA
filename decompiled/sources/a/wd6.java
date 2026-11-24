package a;

import android.content.ComponentCallbacks2;
import java.util.Collections;
import kotlin.Metadata;
import org.xbet.client1.R;
import org.xplatform.uikit.components.bottom_sheet.presets.DsPresetButton;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"La/wd6;", "La/stl;", "La/xo8;", "<init>", "()V", "a/cl5", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class wd6 extends stl<xo8> {
    public final nae0 g2 = ltt0.p(this, sd6.f32017a);
    public final zz2 h2 = new zz2("KEY_PARAMS");
    public final phf0 i2 = new phf0("EXTRA_REQUEST_KEY");
    public fiu0 j2;
    public final kiu0 k2;
    public dub0 l2;
    public DsPresetButton m2;
    public pe6 n2;
    public static final /* synthetic */ iiy[] p2 = {new j0d0(wd6.class, "binding", "getBinding()Lorg/xplatform/coupon/impl/databinding/BottomSheetDialogBetAmountBinding;", 0), new ez40(wd6.class, "currentBlockId", "getCurrentBlockId()I", 0), new ez40(wd6.class, "requestKey", "getRequestKey()Ljava/lang/String;", 0)};
    public static final cl5 o2 = new cl5((byte) 3);

    public wd6() {
        qd6 qd6Var = new qd6(this, (byte) 0);
        a8z a8zVarA = maz.a(wez.b, new p46(new p46(this, (byte) 1), (byte) 2));
        this.k2 = agc.G(this, sre0.f32672a.b(me6.class), new qw4(a8zVarA, (byte) 20), new qw4(a8zVarA, (byte) 21), qd6Var);
    }

    @Override // a.stl
    public final void S0() throws Exception {
        dub0 dub0Var = new dub0(o0());
        dub0Var.setPreviousButtonClickAction(new qd6(this, (byte) 1));
        dub0Var.setNextButtonClickAction(new qd6(this, (byte) 2));
        dub0Var.setPreviousButtonEnable(false);
        dub0Var.setNextButtonEnable(false);
        K0(dub0Var);
        this.l2 = dub0Var;
        DsPresetButton dsPresetButton = new DsPresetButton(o0(), null, 6);
        dsPresetButton.setButtonStyle(R.style.DSButton_Large_Primary);
        String strH = H(R.string.coupon_make_bet_make);
        strH.getClass();
        dsPresetButton.setText(strH);
        dsPresetButton.f47226a = 0;
        dsPresetButton.b = dsPresetButton.getResources().getDimensionPixelSize(R.dimen.space_8);
        dyb.O(dsPresetButton, new rd6(this, (byte) 0));
        dsPresetButton.setLoading(true);
        J0(dsPresetButton);
        this.m2 = dsPresetButton;
        p7m0 p7m0Var = W0().w;
        ud6 ud6Var = new ud6(this, null, (byte) 0);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new me5(p7m0Var, clzVarW, ud6Var, (yje) null), 3);
        p7m0 p7m0Var2 = W0().x;
        vd6 vd6Var = new vd6(this, null, (byte) 0);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new me5(p7m0Var2, clzVarW2, vd6Var, (yje) null), 3);
        p7m0 p7m0Var3 = W0().z;
        ud6 ud6Var2 = new ud6(this, null, (byte) 1);
        clz clzVarW3 = aac.W(this);
        qjj.W(x0x.Q(clzVarW3.x()), null, null, new me5((gmq) p7m0Var3, clzVarW3, ud6Var2, (yje) null, (byte) 0), 3);
        p7m0 p7m0Var4 = W0().y;
        ud6 ud6Var3 = new ud6(this, null, (byte) 2);
        clz clzVarW4 = aac.W(this);
        qjj.W(x0x.Q(clzVarW4.x()), null, null, new me5((gmq) p7m0Var4, clzVarW4, ud6Var3, (yje) null, (char) 0), 3);
        p7m0 p7m0Var5 = W0().A;
        ud6 ud6Var4 = new ud6(this, null, (byte) 3);
        clz clzVarW5 = aac.W(this);
        qjj.W(x0x.Q(clzVarW5.x()), null, null, new me5(p7m0Var5, clzVarW5, ud6Var4, (yje) null, 0), 3);
        p7m0 p7m0Var6 = W0().B;
        ud6 ud6Var5 = new ud6(this, null, (byte) 4);
        clz clzVarW6 = aac.W(this);
        qjj.W(x0x.Q(clzVarW6.x()), null, null, new td6(p7m0Var6, clzVarW6, ud6Var5, (yje) null), 3);
        p7m0 p7m0Var7 = W0().C;
        vd6 vd6Var2 = new vd6(this, null, (byte) 1);
        clz clzVarW7 = aac.W(this);
        qjj.W(x0x.Q(clzVarW7.x()), null, null, new td6(p7m0Var7, clzVarW7, vd6Var2, (yje) null), 3);
        p7m0 p7m0Var8 = W0().D;
        ud6 ud6Var6 = new ud6(this, null, (byte) 5);
        clz clzVarW8 = aac.W(this);
        qjj.W(x0x.Q(clzVarW8.x()), null, null, new td6(p7m0Var8, clzVarW8, ud6Var6, (yje) null, (byte) 0), 3);
    }

    @Override // a.stl
    public final void T0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(ne6.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            ne6 ne6Var = (ne6) (ze3Var instanceof ne6 ? ze3Var : null);
            if (ne6Var != null) {
                Integer numN = this.h2.n(this, p2[1]);
                pru pruVar = ne6Var.f23369a;
                zlt0 zlt0Var = ne6Var.b;
                gst0 gst0Var = ne6Var.c;
                mne mneVar = ne6Var.d;
                duj dujVar = ne6Var.e;
                ctf0 ctf0Var = ne6Var.f;
                lye lyeVar = ne6Var.g;
                m0f m0fVar = ne6Var.h;
                ave aveVar = ne6Var.i;
                vwb0 vwb0Var = ne6Var.j;
                us3 us3Var = ne6Var.k;
                knf0 knf0Var = ne6Var.l;
                gii0 gii0Var = ne6Var.m;
                wsf0 wsf0Var = ne6Var.n;
                q7d0 q7d0Var = ne6Var.o;
                rrc rrcVar = ne6Var.p;
                vby vbyVar = ne6Var.q;
                gst0Var.getClass();
                us3Var.getClass();
                gii0Var.getClass();
                knf0Var.getClass();
                vwb0Var.getClass();
                ctf0Var.getClass();
                lyeVar.getClass();
                m0fVar.getClass();
                aveVar.getClass();
                q7d0Var.getClass();
                vbyVar.getClass();
                this.j2 = new fiu0(Collections.singletonMap(me6.class, (f7i) new f6i(wsf0Var, numN, pruVar, zlt0Var, gst0Var, us3Var, gii0Var, mneVar, knf0Var, vwb0Var, dujVar, ctf0Var, lyeVar, m0fVar, aveVar, q7d0Var, rrcVar, vbyVar).u));
                return;
            }
        }
        jf4.n(b1j.i(ne6.class, "Cannot create dependency "));
    }

    @Override // a.stl
    /* JADX INFO: renamed from: V0, reason: merged with bridge method [inline-methods] */
    public final xo8 Q0() {
        Object objN = this.g2.n(p2[0], this);
        objN.getClass();
        return (xo8) objN;
    }

    public final me6 W0() {
        return (me6) this.k2.getValue();
    }
}
