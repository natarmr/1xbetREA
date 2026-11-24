package a;

import android.content.ComponentCallbacks2;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"La/cr4;", "La/iw5;", "<init>", "()V", "a/pek0", "La/fr4;", CommonConstant.ReqAccessTokenParam.STATE_LABEL, "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class cr4 extends iw5 {
    public final phf0 k2 = new phf0("KEY_REQUEST_KEY");
    public final a8z l2;
    public final kiu0 m2;
    public static final /* synthetic */ iiy[] o2 = {new ez40(cr4.class, "requestKey", "getRequestKey()Ljava/lang/String;", 0)};
    public static final pek0 n2 = new pek0();
    public static final String p2 = sre0.f32672a.b(cr4.class).J();

    public cr4() {
        final byte b = 0;
        Function0 function0 = new Function0(this) { // from class: a.br4
            public final /* synthetic */ cr4 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b2 = b;
                cr4 cr4Var = this.b;
                switch (b2) {
                    case 0:
                        pek0 pek0Var = cr4.n2;
                        ComponentCallbacks2 application = cr4Var.n0().getApplication();
                        application.getClass();
                        af3 af3Var = application instanceof af3 ? (af3) application : null;
                        if (af3Var != null) {
                            o5d0 o5d0Var = (o5d0) af3Var.d().get(ar4.class);
                            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                            if (!(ze3Var instanceof ar4)) {
                                ze3Var = null;
                            }
                            ar4 ar4Var = (ar4) ze3Var;
                            if (ar4Var != null) {
                                d1p d1pVar = ar4Var.f1326a;
                                ctf0 ctf0Var = ar4Var.b;
                                yo4 yo4Var = ar4Var.c;
                                mne mneVar = ar4Var.d;
                                d1pVar.getClass();
                                ctf0Var.getClass();
                                return new g9i(d1pVar, ctf0Var, yo4Var, mneVar);
                            }
                        }
                        jf4.n(b1j.i(ar4.class, "Cannot create dependency "));
                        return null;
                    default:
                        return new fiu0(Collections.singletonMap(gr4.class, ((g9i) cr4Var.l2.getValue()).e));
                }
            }
        };
        wez wezVar = wez.b;
        this.l2 = maz.a(wezVar, function0);
        final byte b2 = 1;
        Function0 function1 = new Function0(this) { // from class: a.br4
            public final /* synthetic */ cr4 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b3 = b2;
                cr4 cr4Var = this.b;
                switch (b3) {
                    case 0:
                        pek0 pek0Var = cr4.n2;
                        ComponentCallbacks2 application = cr4Var.n0().getApplication();
                        application.getClass();
                        af3 af3Var = application instanceof af3 ? (af3) application : null;
                        if (af3Var != null) {
                            o5d0 o5d0Var = (o5d0) af3Var.d().get(ar4.class);
                            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                            if (!(ze3Var instanceof ar4)) {
                                ze3Var = null;
                            }
                            ar4 ar4Var = (ar4) ze3Var;
                            if (ar4Var != null) {
                                d1p d1pVar = ar4Var.f1326a;
                                ctf0 ctf0Var = ar4Var.b;
                                yo4 yo4Var = ar4Var.c;
                                mne mneVar = ar4Var.d;
                                d1pVar.getClass();
                                ctf0Var.getClass();
                                return new g9i(d1pVar, ctf0Var, yo4Var, mneVar);
                            }
                        }
                        jf4.n(b1j.i(ar4.class, "Cannot create dependency "));
                        return null;
                    default:
                        return new fiu0(Collections.singletonMap(gr4.class, ((g9i) cr4Var.l2.getValue()).e));
                }
            }
        };
        a8z a8zVarA = maz.a(wezVar, new pp4(new pp4(this, (byte) 6), (byte) 7));
        this.m2 = agc.G(this, sre0.f32672a.b(gr4.class), new t51(a8zVarA, (byte) 26), new t51(a8zVarA, (byte) 27), function1);
    }

    @Override // a.iw5
    public final bw5 J0(fet fetVar) {
        cr4 cr4Var;
        fetVar.e0(-465012043);
        kiu0 kiu0Var = this.m2;
        gr4 gr4Var = (gr4) kiu0Var.getValue();
        boolean zI = fetVar.i(this);
        Object objP = fetVar.P();
        Object obj = ukd.f35823a;
        if (zI || objP == obj) {
            cr4Var = this;
            Object j94Var = new j94(1, cr4Var, cr4.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/authenticator/impl/ui/dialogs/options/models/AuthenticatorOptionsSideEffect;)V", 0, (byte) 14);
            fetVar.o0(j94Var);
            objP = j94Var;
        } else {
            cr4Var = this;
        }
        int i = gr4.q;
        lkz lkzVar = lkz.f20223a;
        pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) ((jhy) objP), fetVar);
        byte b = 3;
        boolean zI2 = fetVar.i(gr4Var) | fetVar.i(cr4Var) | fetVar.e(3) | fetVar.g(pz40VarF);
        Object objP2 = fetVar.P();
        if (zI2 || objP2 == obj) {
            objP2 = new ee0(gr4Var, cr4Var, pz40VarF, (yje) null);
            fetVar.o0(objP2);
        }
        m0x0.t(fetVar, cr4Var, (Function2) objP2);
        bw5 bw5Var = new bw5(iw5.O0(1, fetVar), (xdr) null, (ugd) null, u1c.M(1909437348, new ab4(cr4Var, ((gr4) kiu0Var.getValue()).y(fetVar), b), fetVar), 14);
        fetVar.r(false);
        return bw5Var;
    }
}
