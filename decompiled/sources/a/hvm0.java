package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import java.util.Collections;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"La/hvm0;", "La/nw5;", "La/njk;", "<init>", "()V", "a/y2m0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class hvm0 extends nw5<njk> {
    public fiu0 e2;
    public final nae0 f2 = ltt0.p(this, fvm0.f10223a);
    public final kiu0 g2;
    public final j1l0 h2;
    public final a8z i2;
    public static final /* synthetic */ iiy[] k2 = {new j0d0(hvm0.class, "binding", "getBinding()Lorg/xplatform/sportgame/filters/impl/databinding/DialogSubGameFiltersBinding;", 0)};
    public static final y2m0 j2 = new y2m0((byte) 3);

    public hvm0() {
        evm0 evm0Var = new evm0(this, (byte) 0);
        fyk0 fyk0Var = new fyk0(this, (byte) 12);
        wez wezVar = wez.b;
        a8z a8zVarA = maz.a(wezVar, new fyk0(fyk0Var, (byte) 13));
        this.g2 = agc.G(this, sre0.f32672a.b(jvm0.class), new cdl0(a8zVarA, (byte) 10), new cdl0(a8zVarA, (byte) 11), evm0Var);
        this.h2 = new j1l0(this, (byte) 15);
        this.i2 = maz.a(wezVar, new evm0(this, (byte) 1));
    }

    @Override // a.nw5
    public final int I0() {
        return R.attr.uikitBackgroundContent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.nw5
    public final void P0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(ivm0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            ivm0 ivm0Var = (ivm0) (ze3Var instanceof ivm0 ? ze3Var : null);
            if (ivm0Var != null) {
                for (Fragment fragment = this; fragment != 0; fragment = fragment.y) {
                    if (fragment instanceof ocl0) {
                        pcl0 pcl0VarU = ((ocl0) fragment).u(new evm0(this, (byte) 2));
                        sa10 sa10Var = ivm0Var.b;
                        cad cadVar = ivm0Var.f15452a;
                        ctf0 ctf0Var = ivm0Var.c;
                        pcl0VarU.getClass();
                        ctf0Var.getClass();
                        this.e2 = new fiu0(Collections.singletonMap(jvm0.class, (rti) new kki(pcl0VarU, cadVar, sa10Var, ctf0Var).f));
                        return;
                    }
                }
                jf4.n("Can't find feature provider!");
                return;
            }
        }
        jf4.n(b1j.i(ivm0.class, "Cannot create dependency "));
    }

    @Override // a.nw5
    public final int Q0() {
        return R.id.root;
    }

    @Override // a.nw5
    /* JADX INFO: renamed from: T0, reason: merged with bridge method [inline-methods] */
    public final njk L0() {
        Object objN = this.f2.n(k2[0], this);
        objN.getClass();
        return (njk) objN;
    }

    @Override // a.nw5, androidx.fragment.app.Fragment
    public final void i0(View view, Bundle bundle) throws Exception {
        view.getClass();
        super.i0(view, bundle);
        kiu0 kiu0Var = this.g2;
        gmq gmqVar = ((jvm0) kiu0Var.getValue()).f;
        yje yjeVar = null;
        gvm0 gvm0Var = new gvm0(this, yjeVar, (byte) 0);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new zol0(gmqVar, clzVarW, gvm0Var, (yje) null), 3);
        qoj0 qoj0Var = ((jvm0) kiu0Var.getValue()).e;
        gvm0 gvm0Var2 = new gvm0(this, yjeVar, (byte) 1);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new zol0((gmq) qoj0Var, clzVarW2, gvm0Var2, (yje) null, (byte) 0), 3);
        L0().c.setAdapter((fxm0) this.i2.getValue());
        L0().c.m(new wn8(o0().getDrawable(R.drawable.divider_with_spaces), (byte) 1));
        L0().d.setHint(H(R.string.sub_games_search_hint));
        L0().d.getEditText().addTextChangedListener(new jt6(this, (byte) 18));
    }
}
