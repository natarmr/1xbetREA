package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/uw8;", "La/yx5;", "<init>", "()V", "a/cl5", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class uw8 extends yx5 {
    public oai K1;
    public ynb L1;
    public wdk0 M1;
    public ii N1;
    public final a8z O1;
    public final s0r P1;
    public final yzn0 Q1;
    public final e9o0 R1;
    public static final /* synthetic */ iiy[] U1 = {new j0d0(uw8.class, "binding", "getBinding()Lorg/xplatform/aggregator/impl/databinding/FragmentBrandGamesRedesignBinding;", 0), new ez40(uw8.class, "brandModel", "getBrandModel()Lorg/xplatform/aggregator/api/navigation/AggregatorBrandItemModel;", 0)};
    public static final cl5 S1 = new cl5((byte) 11);

    public uw8() {
        super(R.layout.fragment_brand_games_redesign);
        this.O1 = xbc.a0(this, sre0.f32672a.b(ty8.class), null, new qw8(this, (byte) 0), 14);
        this.P1 = ltt0.o(this, tw8.f34637a);
        this.Q1 = new yzn0("BRAND_MODEL_KEY");
        this.R1 = new e9o0(R.attr.uikitStaticTransparent, R.attr.uikitStaticTransparent, 12);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        final byte b = 1;
        n0().r().u0("REQUEST_KEY_CLOSE_GAME", this, new k4r(this) { // from class: a.rw8
            public final /* synthetic */ uw8 b;

            {
                this.b = this;
            }

            @Override // a.k4r
            public final void i(Bundle bundle2, String str) {
                byte b2 = b;
                uw8 uw8Var = this.b;
                switch (b2) {
                    case 0:
                        cl5 cl5Var = uw8.S1;
                        str.getClass();
                        if (bundle2.getBoolean("PRESSED_INFO_BACK_BUTTON_KEY")) {
                            uw8Var.G0().x(bu8.f3219a);
                        }
                        break;
                    default:
                        cl5 cl5Var2 = uw8.S1;
                        str.getClass();
                        uw8Var.G0().x(gu8.f11917a);
                        break;
                }
            }
        });
        ccq0.T(this, "REQUEST_BONUS_BALANCE_WARNING_DIALOG_KEY", new qw8(this, (byte) 1));
        final byte b2 = 0;
        F().u0("PRESSED_INFO_BACK_BUTTON_KEY", this, new k4r(this) { // from class: a.rw8
            public final /* synthetic */ uw8 b;

            {
                this.b = this;
            }

            @Override // a.k4r
            public final void i(Bundle bundle2, String str) {
                byte b3 = b2;
                uw8 uw8Var = this.b;
                switch (b3) {
                    case 0:
                        cl5 cl5Var = uw8.S1;
                        str.getClass();
                        if (bundle2.getBoolean("PRESSED_INFO_BACK_BUTTON_KEY")) {
                            uw8Var.G0().x(bu8.f3219a);
                        }
                        break;
                    default:
                        cl5 cl5Var2 = uw8.S1;
                        str.getClass();
                        uw8Var.G0().x(gu8.f11917a);
                        break;
                }
            }
        });
        Object objN = this.P1.n(U1[0], this);
        objN.getClass();
        pkd.h(((ryq) objN).f31325a, new owp0(this), null, new ugd(1361148061, true, new tx(this, (byte) 11)));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(wu8.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            wu8 wu8Var = (wu8) (ze3Var instanceof wu8 ? ze3Var : null);
            if (wu8Var != null) {
                uc0 uc0Var = (uc0) this.Q1.n(this, U1[1]);
                u58 u58Var = wu8Var.b;
                ehf0 ehf0Var = wu8Var.f39777a;
                cad cadVar = wu8Var.l;
                oeg0 oeg0Var = wu8Var.m;
                gii0 gii0Var = wu8Var.c;
                r9u r9uVar = wu8Var.d;
                m1e m1eVar = wu8Var.e;
                s91 s91Var = wu8Var.f;
                v88 v88Var = wu8Var.g;
                wsf0 wsf0Var = wu8Var.r;
                ii iiVar = wu8Var.o;
                ih5 ih5Var = wu8Var.j;
                ih5 ih5Var2 = wu8Var.h;
                gg5 gg5Var = wu8Var.i;
                duj dujVar = wu8Var.k;
                peg0 peg0Var = wu8Var.u;
                ctf0 ctf0Var = wu8Var.n;
                ntu ntuVar = wu8Var.p;
                l7k l7kVar = wu8Var.q;
                pru pruVar = wu8Var.s;
                gst0 gst0Var = wu8Var.t;
                peg0 peg0Var2 = wu8Var.v;
                wdk0 wdk0Var = wu8Var.w;
                dmt dmtVar = wu8Var.x;
                lrc lrcVar = wu8Var.y;
                au0 au0Var = wu8Var.z;
                wyu wyuVar = wu8Var.A;
                ix0 ix0Var = wu8Var.B;
                bzt bztVar = wu8Var.C;
                wsf0 wsf0Var2 = wu8Var.D;
                peg0 peg0Var3 = wu8Var.E;
                ytt yttVar = wu8Var.F;
                gw8 gw8Var = wu8Var.G;
                cmt cmtVar = wu8Var.H;
                iiVar.getClass();
                oeg0Var.getClass();
                gii0Var.getClass();
                r9uVar.getClass();
                m1eVar.getClass();
                s91Var.getClass();
                ctf0Var.getClass();
                gst0Var.getClass();
                wdk0Var.getClass();
                wyuVar.getClass();
                gw8Var.getClass();
                this.K1 = (oai) ((n5d0) new o9i(cadVar, ehf0Var, peg0Var, wsf0Var, lrcVar, wsf0Var2, peg0Var3, iiVar, oeg0Var, u58Var, ih5Var2, gg5Var, m1eVar, s91Var, v88Var, ih5Var, dujVar, ctf0Var, ntuVar, l7kVar, pruVar, gst0Var, peg0Var2, wdk0Var, dmtVar, au0Var, ix0Var, uc0Var, bztVar, yttVar, gw8Var, cmtVar).n).get();
                ynb ynbVarI = ((yzn0) peg0Var.b).i();
                x1x.x(ynbVarI);
                this.L1 = ynbVarI;
                this.M1 = wdk0Var;
                this.N1 = iiVar;
                return;
            }
        }
        jf4.n(b1j.i(wu8.class, "Cannot create dependency "));
    }

    public final k3t0 G0() {
        return (k3t0) this.O1.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final void d0() {
        this.j1 = true;
        hxm0.m(q0());
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void e0() {
        super.e0();
        hxm0.n(q0());
        G0().x(yt8.f43205a);
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0 */
    public final boolean getP1() {
        return !((uc0) this.Q1.n(this, U1[1])).i;
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: z0 */
    public final j9o0 getK1() {
        return this.R1;
    }
}
