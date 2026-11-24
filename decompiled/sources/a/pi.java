package a;

import android.content.ComponentCallbacks2;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import java.util.Collections;
import kotlin.Metadata;
import org.xbet.client1.R;
import org.xplatform.sportgame.action_menu.api.ActionMenuDialogParams;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"La/pi;", "La/nw5;", "La/gik;", "<init>", "()V", "a/rek0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class pi extends nw5<gik> {
    public uuz e2;
    public wdk0 f2;
    public final nae0 g2 = ltt0.p(this, oi.f25289a);
    public fiu0 h2;
    public final kiu0 i2;
    public final khf0 j2;
    public final n0o0 k2;
    public static final /* synthetic */ iiy[] m2 = {new j0d0(pi.class, "binding", "getBinding()Lorg/xplatform/sportgame/action_menu/impl/databinding/DialogActionMenuBinding;", 0), new ez40(pi.class, "params", "getParams()Lorg/xplatform/sportgame/action_menu/api/ActionMenuDialogParams;", 0)};
    public static final rek0 l2 = new rek0((byte) 10);

    public pi() {
        ni niVar = new ni(this, (byte) 1);
        a8z a8zVarA = maz.a(wez.b, new o5(new o5(this, (byte) 19), (byte) 20));
        this.i2 = agc.G(this, sre0.f32672a.b(wj.class), new k8(a8zVarA, (byte) 12), new k8(a8zVarA, (byte) 13), niVar);
        this.j2 = new khf0("params_key");
        this.k2 = maz.b(new ni(this, (byte) 2));
    }

    @Override // a.nw5
    public final int I0() {
        return R.attr.uikitBackgroundContent;
    }

    @Override // a.nw5
    public final yfu0 L0() {
        Object objN = this.g2.n(m2[0], this);
        objN.getClass();
        return (gik) objN;
    }

    @Override // a.nw5
    public final void O0() {
        iiy[] iiyVarArr = m2;
        iiy iiyVar = iiyVarArr[0];
        nae0 nae0Var = this.g2;
        Object objN = nae0Var.n(iiyVar, this);
        objN.getClass();
        ((gik) objN).b.setAdapter((uh) this.k2.getValue());
        Drawable drawableU = epv0.U(R.drawable.divider_shape_base, o0());
        if (drawableU != null) {
            twk twkVar = new twk(drawableU);
            Object objN2 = nae0Var.n(iiyVarArr[0], this);
            objN2.getClass();
            ((gik) objN2).b.m(twkVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.nw5
    public final void P0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(qi.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            qi qiVar = (qi) (ze3Var instanceof qi ? ze3Var : null);
            if (qiVar != null) {
                ActionMenuDialogParams actionMenuDialogParams = (ActionMenuDialogParams) this.j2.n(this, m2[1]);
                i1w0 i1w0VarF = a4n0.f(this);
                for (Fragment fragment = this; fragment != 0; fragment = fragment.y) {
                    if (fragment instanceof ocl0) {
                        ni niVar = new ni(this, (byte) 0);
                        i1w0VarF.getClass();
                        cad cadVar = qiVar.f28766a;
                        pcl0 pcl0VarU = ((ocl0) fragment).u(niVar);
                        roi0 roi0Var = qiVar.d;
                        atz atzVar = qiVar.c;
                        duj dujVar = qiVar.b;
                        bn6 bn6Var = qiVar.e;
                        lbu lbuVar = qiVar.h;
                        a1d a1dVar = qiVar.f;
                        iip iipVar = qiVar.g;
                        gl5 gl5Var = qiVar.i;
                        wdk0 wdk0Var = qiVar.j;
                        uuz uuzVar = qiVar.k;
                        jw20 jw20Var = qiVar.l;
                        je jeVar = qiVar.m;
                        ctf0 ctf0Var = qiVar.n;
                        j1q0 j1q0Var = qiVar.o;
                        cl5 cl5Var = qiVar.p;
                        evz evzVar = qiVar.q;
                        gua guaVar = qiVar.r;
                        wsf0 wsf0Var = qiVar.s;
                        pru pruVar = qiVar.t;
                        pcl0VarU.getClass();
                        iipVar.getClass();
                        wdk0Var.getClass();
                        ctf0Var.getClass();
                        j1q0Var.getClass();
                        guaVar.getClass();
                        v5i v5iVar = new v5i(cadVar, pcl0VarU, roi0Var, a1dVar, iipVar, jw20Var, wsf0Var, gl5Var, i1w0VarF, actionMenuDialogParams, atzVar, dujVar, bn6Var, lbuVar, wdk0Var, uuzVar, jeVar, ctf0Var, cl5Var, evzVar, guaVar, pruVar);
                        this.e2 = uuzVar;
                        this.f2 = wdk0Var;
                        this.h2 = new fiu0(Collections.singletonMap(wj.class, (t5i) v5iVar.v));
                        return;
                    }
                }
                jf4.n("Can't find feature provider!");
                return;
            }
        }
        jf4.n(b1j.i(qi.class, "Cannot create dependency "));
    }

    @Override // a.nw5
    public final int Q0() {
        return R.id.gameScreenActionMenuDialog;
    }

    @Override // a.nw5
    public final String S0() {
        String strH = H(R.string.settings);
        strH.getClass();
        return strH;
    }

    @Override // a.nw5, androidx.fragment.app.Fragment
    public final void i0(View view, Bundle bundle) throws Exception {
        view.getClass();
        super.i0(view, bundle);
        kiu0 kiu0Var = this.i2;
        wj wjVar = (wj) kiu0Var.getValue();
        lj ljVar = new lj(wjVar.w, wjVar, (byte) 0);
        qa qaVar = new qa(this, null, (byte) 3);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new m1(ljVar, clzVarW, qaVar, (yje) null), 3);
        qoj0 qoj0Var = ((wj) kiu0Var.getValue()).x;
        i8 i8Var = new i8(2, this, pi.class, "handleEvents", "handleEvents(Lorg/xplatform/sportgame/action_menu/impl/presentation/ActionMenuViewModel$Event;)V", 4, (byte) 4);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new m1(qoj0Var, clzVarW2, i8Var, (yje) null), 3);
    }
}
