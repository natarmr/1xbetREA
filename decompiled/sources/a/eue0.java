package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import android.view.View;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xplatform.registration_default.impl.presentation.registration_bonus.models.RegistrationBonusDefaultScreenParams;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/eue0;", "La/iw5;", "<init>", "()V", "a/zie0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class eue0 extends iw5 {
    public fiu0 l2;
    public static final /* synthetic */ iiy[] o2 = {new ez40(eue0.class, "screenParams", "getScreenParams()Lorg/xplatform/registration_default/impl/presentation/registration_bonus/models/RegistrationBonusDefaultScreenParams;", 0)};
    public static final zie0 n2 = new zie0();
    public final khf0 k2 = new khf0("REGISTRATION_BONUS_DEFAULT_SCREEN_PARAMS");
    public final a8z m2 = xbc.b0(this, sre0.f32672a.b(gue0.class), new tie0(this, (byte) 8));

    @Override // a.iw5
    public final bw5 J0(fet fetVar) {
        clz clzVar;
        fetVar.e0(-1162277769);
        a8z a8zVar = this.m2;
        k3t0 k3t0Var = (k3t0) a8zVar.getValue();
        boolean zI = fetVar.i(this);
        Object objP = fetVar.P();
        Object obj = ukd.f35823a;
        if (zI || objP == obj) {
            Object d8e0Var = new d8e0(1, this, eue0.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/registration_default/impl/presentation/registration_bonus/models/BonusSelectionDefaultSideEffect;)V", 0, (byte) 18);
            fetVar.o0(d8e0Var);
            objP = d8e0Var;
        }
        clz clzVar2 = (clz) fetVar.k(or00.f25714a);
        lkz lkzVar = lkz.f20223a;
        pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) ((jhy) objP), fetVar);
        boolean zI2 = fetVar.i(k3t0Var) | fetVar.i(clzVar2) | fetVar.e(3) | fetVar.g(pz40VarF);
        Object objP2 = fetVar.P();
        if (zI2 || objP2 == obj) {
            clzVar = clzVar2;
            Object kc70Var = new kc70(k3t0Var, clzVar, pz40VarF, null, (byte) 11);
            fetVar.o0(kc70Var);
            objP2 = kc70Var;
        } else {
            clzVar = clzVar2;
        }
        m0x0.t(fetVar, clzVar, (Function2) objP2);
        pz40 pz40VarY = ((i3t0) ((k3t0) a8zVar.getValue())).y(fetVar);
        bw5 bw5Var = new bw5(iw5.O0(1, fetVar), u1c.M(-1120970200, new tft(pz40VarY, (byte) 14), fetVar), (ugd) null, u1c.M(1397922022, new in80(pz40VarY, this, (byte) 13), fetVar), 10);
        fetVar.r(false);
        return bw5Var;
    }

    @Override // a.sik, androidx.fragment.app.Fragment
    public final void W(Bundle bundle) {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(fue0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            fue0 fue0Var = (fue0) (ze3Var instanceof fue0 ? ze3Var : null);
            if (fue0Var != null) {
                RegistrationBonusDefaultScreenParams registrationBonusDefaultScreenParams = (RegistrationBonusDefaultScreenParams) this.k2.n(this, o2[0]);
                nr00 nr00Var = fue0Var.f10158a;
                cad cadVar = fue0Var.b;
                ctf0 ctf0Var = fue0Var.c;
                duj dujVar = fue0Var.d;
                ctf0Var.getClass();
                this.l2 = new fiu0(Collections.singletonMap(gue0.class, (ppi) new uii(cadVar, nr00Var, registrationBonusDefaultScreenParams, ctf0Var, dujVar).f));
                super.W(bundle);
                return;
            }
        }
        jf4.n(b1j.i(fue0.class, "Cannot create dependency "));
    }

    @Override // a.iw5, androidx.fragment.app.Fragment
    public final void i0(View view, Bundle bundle) {
        view.getClass();
        super.i0(view, bundle);
        L0().N(3);
        L0().K = true;
    }
}
