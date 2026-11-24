package a;

import android.content.ComponentCallbacks2;
import android.content.Context;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xplatform.wallet.impl.presentation.dialogs.bonusaccountaction.params.BonusAccountScreenParams;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"La/wb8;", "La/iw5;", "<init>", "()V", "a/kj5", "La/dc8;", CommonConstant.ReqAccessTokenParam.STATE_LABEL, "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class wb8 extends iw5 {
    public fiu0 k2;
    public final a8z l2 = xbc.b0(this, sre0.f32672a.b(ec8.class), new vb8(this, (byte) 0));
    public final khf0 m2 = new khf0("BONUS_ACCOUNT_SCREEN_PARAMS");
    public static final /* synthetic */ iiy[] o2 = {new ez40(wb8.class, "params", "getParams()Lorg/xplatform/wallet/impl/presentation/dialogs/bonusaccountaction/params/BonusAccountScreenParams;", 0)};
    public static final kj5 n2 = new kj5();
    public static final String p2 = wb8.class.getName();

    @Override // a.iw5
    public final bw5 J0(fet fetVar) {
        clz clzVar;
        fetVar.e0(199323829);
        a8z a8zVar = this.l2;
        pz40 pz40VarY = ((i3t0) ((k3t0) a8zVar.getValue())).y(fetVar);
        k3t0 k3t0Var = (k3t0) a8zVar.getValue();
        boolean zI = fetVar.i(this);
        Object objP = fetVar.P();
        Object obj = ukd.f35823a;
        if (zI || objP == obj) {
            objP = new d38(this, (byte) 3);
            fetVar.o0(objP);
        }
        clz clzVar2 = (clz) fetVar.k(or00.f25714a);
        lkz lkzVar = lkz.f20223a;
        pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) objP, fetVar);
        boolean zE = fetVar.e(3) | fetVar.i(k3t0Var) | fetVar.i(clzVar2) | fetVar.g(pz40VarF);
        Object objP2 = fetVar.P();
        if (zE || objP2 == obj) {
            clzVar = clzVar2;
            Object pcVar = new pc(k3t0Var, clzVar, pz40VarF, null, (byte) 3);
            fetVar.o0(pcVar);
            objP2 = pcVar;
        } else {
            clzVar = clzVar2;
        }
        m0x0.t(fetVar, clzVar, (Function2) objP2);
        bw5 bw5Var = new bw5(iw5.O0(1, fetVar), u1c.M(-649758554, new v7i0(pz40VarY, (byte) 12), fetVar), (ugd) null, u1c.M(-1522169116, new ab4((Object) this, (Object) pz40VarY, (byte) 8), fetVar), 10);
        fetVar.r(false);
        return bw5Var;
    }

    @Override // a.sik, androidx.fragment.app.Fragment
    public final void V(Context context) {
        super.V(context);
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(yb8.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            yb8 yb8Var = (yb8) (ze3Var instanceof yb8 ? ze3Var : null);
            if (yb8Var != null) {
                BonusAccountScreenParams bonusAccountScreenParams = (BonusAccountScreenParams) this.m2.n(this, o2[0]);
                cad cadVar = yb8Var.f42329a;
                ctf0 ctf0Var = yb8Var.b;
                ctf0Var.getClass();
                this.k2 = new fiu0(Collections.singletonMap(ec8.class, (n8i) new mii0(cadVar, bonusAccountScreenParams, ctf0Var).e));
                return;
            }
        }
        jf4.n(b1j.i(yb8.class, "Cannot create dependency "));
    }
}
