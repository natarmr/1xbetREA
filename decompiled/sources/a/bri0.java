package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import android.text.Editable;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.security.api.presentation.models.TokenRestoreData;
import org.xplatform.uikit.components.bottom_bar.DsBottomBar;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/bri0;", "La/yx5;", "<init>", "()V", "a/lme0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class bri0 extends yx5 {
    public final f9o0 K1;
    public final hnm0 L1;
    public pti M1;
    public ii N1;
    public wdk0 O1;
    public final kiu0 P1;
    public final s0r Q1;
    public final khf0 R1;
    public final r34 S1;
    public final yzn0 U1;
    public static final /* synthetic */ iiy[] W1 = {new j0d0(bri0.class, "binding", "getBinding()Lorg/xplatform/security/impl/databinding/FragmentSetNewPasswordBinding;", 0), new ez40(bri0.class, "tokenRestoreData", "getTokenRestoreData()Lorg/xplatform/security/api/presentation/models/TokenRestoreData;", 0), new ez40(bri0.class, "userId", "getUserId()J", 0), new ez40(bri0.class, "navigation", "getNavigation()Lorg/xplatform/onexuser/presentation/NavigationEnum;", 0)};
    public static final lme0 V1 = new lme0((byte) 19);

    public bri0() {
        super(R.layout.fragment_set_new_password);
        this.K1 = new f9o0(R.attr.uikitBackgroundContent);
        this.L1 = hnm0.f13359a;
        xqi0 xqi0Var = new xqi0(this, (byte) 0);
        a8z a8zVarA = maz.a(wez.b, new l9i0(new l9i0(this, (byte) 8), (byte) 9));
        this.P1 = agc.G(this, sre0.f32672a.b(uri0.class), new s9i0(a8zVarA, (byte) 6), new s9i0(a8zVarA, (byte) 7), xqi0Var);
        this.Q1 = ltt0.o(this, zqi0.f44809a);
        this.R1 = new khf0("TOKEN_RESTORE_DATA");
        this.S1 = new r34(CommonConstant.RETKEY.USERID);
        this.U1 = new yzn0("bundle_navigation");
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) throws Exception {
        G0().f.setTitle(H(R.string.password_requirements));
        final byte b = 1;
        DsBottomBar.u(G0().b, new xqi0(this, b));
        uvw.R(G0().b, this, null);
        qcc.X(this, new xqi0(this, (byte) 2));
        G0().d.b(new xqi0(this, (byte) 3));
        ccq0.V(this, "REQUEST_EXPIRED_TOKEN_ERROR_DIALOG_KEY", new xqi0(this, (byte) 6));
        ccq0.V(this, "REQUEST_BACK_DIALOG_KEY", new xqi0(this, (byte) 7));
        final byte b2 = 0;
        G0().e.a(new da0(new Function1(this) { // from class: a.yqi0
            public final /* synthetic */ bri0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Object value;
                Object value2;
                byte b3 = b2;
                bri0 bri0Var = this.b;
                Editable editable = (Editable) obj;
                switch (b3) {
                    case 0:
                        lme0 lme0Var = bri0.V1;
                        editable.getClass();
                        uri0 uri0VarH0 = bri0Var.H0();
                        String string = editable.toString();
                        string.getClass();
                        p7m0 p7m0Var = uri0VarH0.z;
                        do {
                            value = p7m0Var.getValue();
                        } while (!p7m0Var.m(value, w190.a((w190) value, string, null, 2)));
                        break;
                    default:
                        lme0 lme0Var2 = bri0.V1;
                        editable.getClass();
                        uri0 uri0VarH1 = bri0Var.H0();
                        String string2 = editable.toString();
                        string2.getClass();
                        p7m0 p7m0Var2 = uri0VarH1.z;
                        do {
                            value2 = p7m0Var2.getValue();
                        } while (!p7m0Var2.m(value2, w190.a((w190) value2, null, string2, 1)));
                        break;
                }
                return Unit.f46060a;
            }
        }));
        G0().c.a(new da0(new Function1(this) { // from class: a.yqi0
            public final /* synthetic */ bri0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Object value;
                Object value2;
                byte b3 = b;
                bri0 bri0Var = this.b;
                Editable editable = (Editable) obj;
                switch (b3) {
                    case 0:
                        lme0 lme0Var = bri0.V1;
                        editable.getClass();
                        uri0 uri0VarH0 = bri0Var.H0();
                        String string = editable.toString();
                        string.getClass();
                        p7m0 p7m0Var = uri0VarH0.z;
                        do {
                            value = p7m0Var.getValue();
                        } while (!p7m0Var.m(value, w190.a((w190) value, string, null, 2)));
                        break;
                    default:
                        lme0 lme0Var2 = bri0.V1;
                        editable.getClass();
                        uri0 uri0VarH1 = bri0Var.H0();
                        String string2 = editable.toString();
                        string2.getClass();
                        p7m0 p7m0Var2 = uri0VarH1.z;
                        do {
                            value2 = p7m0Var2.getValue();
                        } while (!p7m0Var2.m(value2, w190.a((w190) value2, null, string2, 1)));
                        break;
                }
                return Unit.f46060a;
            }
        }));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(wqi0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            wqi0 wqi0Var = (wqi0) (ze3Var instanceof wqi0 ? ze3Var : null);
            if (wqi0Var != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                iiy[] iiyVarArr = W1;
                vqi0 vqi0Var = new vqi0((TokenRestoreData) this.R1.n(this, iiyVarArr[1]), this.S1.n(this, iiyVarArr[2]).longValue(), (we50) this.U1.n(this, iiyVarArr[3]));
                i1w0VarF.getClass();
                qgd qgdVar = wqi0Var.f;
                onv onvVar = wqi0Var.g;
                lef0 lef0Var = wqi0Var.h;
                rjo rjoVar = wqi0Var.m;
                duj dujVar = wqi0Var.i;
                cad cadVar = wqi0Var.b;
                d190 d190Var = wqi0Var.c;
                ctf0 ctf0Var = wqi0Var.d;
                ii iiVar = wqi0Var.k;
                gii0 gii0Var = wqi0Var.e;
                je jeVar = wqi0Var.j;
                s31 s31Var = wqi0Var.l;
                owp0 owp0Var = wqi0Var.f39592a;
                m1e m1eVar = wqi0Var.n;
                knf0 knf0Var = wqi0Var.p;
                at4 at4Var = wqi0Var.q;
                btt0 btt0Var = wqi0Var.r;
                wdk0 wdk0Var = wqi0Var.o;
                zn00 zn00Var = wqi0Var.s;
                pv00 pv00Var = wqi0Var.t;
                knf0Var.getClass();
                iiVar.getClass();
                d190Var.getClass();
                ctf0Var.getClass();
                gii0Var.getClass();
                m1eVar.getClass();
                wdk0Var.getClass();
                at4Var.getClass();
                btt0Var.getClass();
                this.M1 = (pti) ((n5d0) new qv2(cadVar, onvVar, lef0Var, pv00Var, iiVar, qgdVar, rjoVar, vqi0Var, dujVar, jeVar, s31Var, owp0Var, m1eVar, wdk0Var, zn00Var).n).get();
                this.N1 = iiVar;
                this.O1 = wdk0Var;
                return;
            }
        }
        jf4.n(b1j.i(wqi0.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        uri0 uri0VarH0 = H0();
        yje yjeVar = null;
        dnq dnqVar = new dnq(new s6n0(uri0VarH0.x, new tmg0(uri0VarH0, yjeVar, (byte) 8)), new sye0(uri0VarH0, yjeVar, (byte) 7), (byte) 0);
        ari0 ari0Var = new ari0(this, yjeVar, (byte) 0);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new r7i0(dnqVar, clzVarW, ari0Var, (yje) null), 3);
        ol60 ol60Var = H0().w;
        ari0 ari0Var2 = new ari0(this, yjeVar, (byte) 1);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new r7i0(ol60Var, clzVarW2, ari0Var2, (yje) null), 3);
        p7m0 p7m0Var = H0().y;
        yng0 yng0Var = new yng0(this, yjeVar, (byte) 13);
        clz clzVarW3 = aac.W(this);
        qjj.W(x0x.Q(clzVarW3.x()), null, null, new r7i0(p7m0Var, clzVarW3, yng0Var, (yje) null), 3);
    }

    public final r4r G0() {
        Object objN = this.Q1.n(W1[0], this);
        objN.getClass();
        return (r4r) objN;
    }

    public final uri0 H0() {
        return (uri0) this.P1.getValue();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void W(Bundle bundle) {
        super.W(bundle);
        ccq0.V(this, "REQUEST_REQUEST_ERROR_KEY", new xqi0(this, (byte) 4));
        ccq0.V(this, "REQUEST_PASSWORD_CHANGED_AUTH_DIALOG_KEY", new xqi0(this, (byte) 5));
    }

    @Override // a.yx5
    public final jnm0 y0() {
        return this.L1;
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: z0 */
    public final j9o0 getK1() {
        return this.K1;
    }
}
