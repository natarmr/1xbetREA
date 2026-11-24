package a;

import android.content.ComponentCallbacks2;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.TypedValue;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.app_start.impl.presentation.view.AppStartScreenLayout;
import org.xplatform.client1.features.appactivity.ApplicationActivity;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/vg3;", "La/yx5;", "<init>", "()V", "a/hfk0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class vg3 extends yx5 {
    public final e9o0 K1;
    public j8i L1;
    public wdk0 M1;
    public zav N1;
    public final s0r O1;
    public final kiu0 P1;
    public ndk0 Q1;
    public static final /* synthetic */ iiy[] S1 = {new j0d0(vg3.class, "viewBinding", "getViewBinding()Lorg/xplatform/app_start/impl/databinding/FragmentAppStartBinding;", 0)};
    public static final hfk0 R1 = new hfk0(22);
    public static final String U1 = vg3.class.getSimpleName();

    public vg3() {
        super(R.layout.fragment_app_start);
        bp3 bp3Var = bp3.b;
        this.K1 = new e9o0(R.attr.uikitStaticTransparent, R.attr.uikitStaticTransparent, bp3Var, bp3Var);
        this.O1 = ltt0.o(this, ug3.f35604a);
        qg3 qg3Var = new qg3(this, (byte) 1);
        a8z a8zVarA = maz.a(wez.b, new f80(new f80(this, (byte) 14), (byte) 15));
        this.P1 = agc.G(this, sre0.f32672a.b(ij3.class), new t51(a8zVarA, (byte) 6), new t51(a8zVarA, (byte) 7), qg3Var);
        m0(new rg3((byte) 0), new xn((byte) 5));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(fg3.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            fg3 fg3Var = (fg3) (ze3Var instanceof fg3 ? ze3Var : null);
            if (fg3Var != null) {
                l8i l8iVarA = fg3Var.a(a4n0.f(this), U1);
                this.L1 = (j8i) l8iVarA.k1.get();
                this.M1 = l8iVarA.L0;
                zav zavVarF = ((vqc) l8iVarA.X.f25390a).f();
                x1x.x(zavVarF);
                this.N1 = zavVarF;
                return;
            }
        }
        jf4.n(b1j.i(fg3.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        gmq gmqVarW = i120.W(new lr(H0().j0, (byte) 14));
        lkz lkzVar = lkz.f20223a;
        Class<vg3> cls = vg3.class;
        i8 i8Var = new i8(2, this, cls, "onHandleUiState", "onHandleUiState-rtpOjow(I)V", 4, (byte) 21);
        clz clzVarW = aac.W(this);
        yje yjeVar = null;
        qjj.W(x0x.Q(clzVarW.x()), null, null, new y51(gmqVarW, clzVarW, i8Var, (yje) null), 3);
        ij3 ij3VarH0 = H0();
        p7m0 p7m0Var = ij3VarH0.j0;
        sy2 sy2Var = new sy2((byte) 23);
        jbp jbpVar = i120.g;
        zh3 zh3Var = new zh3(i120.X(p7m0Var, sy2Var, jbpVar), ij3VarH0, (byte) 1);
        lkz lkzVar2 = lkz.f20223a;
        sg3 sg3Var = new sg3(this, yjeVar, (byte) 1);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new y51(zh3Var, clzVarW2, sg3Var, (yje) null), 3);
        lr lrVar = new lr(H0().f0, (byte) 13);
        i8 i8Var2 = new i8(2, this, cls, "onHandleEvent", "onHandleEvent(Lorg/xplatform/app_start/impl/presentation/AppStartEvent;)V", 4, (byte) 22);
        clz clzVarW3 = aac.W(this);
        qjj.W(x0x.Q(clzVarW3.x()), null, null, new tg3(lrVar, clzVarW3, i8Var2, (yje) null), 3);
        ij3 ij3VarH1 = H0();
        zh3 zh3Var2 = new zh3(i120.X(ij3VarH1.j0, new sy2((byte) 24), jbpVar), ij3VarH1, (byte) 2);
        sg3 sg3Var2 = new sg3(this, yjeVar, (byte) 2);
        clz clzVarW4 = aac.W(this);
        qjj.W(x0x.Q(clzVarW4.x()), null, null, new tg3(zh3Var2, clzVarW4, sg3Var2, (yje) null), 3);
        ji3 ji3Var = new ji3(i120.X(H0().j0, new sy2((byte) 21), jbpVar), (byte) 1);
        sg3 sg3Var3 = new sg3(this, yjeVar, (byte) 3);
        clz clzVarW5 = aac.W(this);
        qjj.W(x0x.Q(clzVarW5.x()), null, null, new tg3(ji3Var, clzVarW5, sg3Var3, (yje) null), 3);
        ji3 ji3Var2 = new ji3(i120.X(H0().j0, new sy2((byte) 22), jbpVar), (byte) 0);
        pa paVar = new pa((Object) this, yjeVar, (byte) 28);
        lkz lkzVar3 = lkz.f20223a;
        clz clzVarW6 = aac.W(this);
        qjj.W(x0x.Q(clzVarW6.x()), null, null, new tg3(ji3Var2, clzVarW6, paVar, (yje) null), 3);
        ij3 ij3VarH2 = H0();
        zh3 zh3Var3 = new zh3(i120.X(ij3VarH2.j0, ai3.b, jbpVar), ij3VarH2, (byte) 0);
        int i = 4;
        i8 i8Var3 = new i8(2, this, cls, "onHandleAppBlockState", "onHandleAppBlockState(Lorg/xplatform/app_start/impl/presentation/model/AppBlockUiState;)V", i, (byte) 23);
        clz clzVarW7 = aac.W(this);
        qjj.W(x0x.Q(clzVarW7.x()), null, null, new tg3(zh3Var3, clzVarW7, i8Var3, (yje) null), 3);
        p7m0 p7m0Var2 = H0().l0;
        i8 i8Var4 = new i8(2, this, cls, "onHandleGoogleUpdate", "onHandleGoogleUpdate(Lorg/xplatform/app_start/impl/presentation/model/GoogleUpdateState;)V", i, (byte) 24);
        clz clzVarW8 = aac.W(this);
        qjj.W(x0x.Q(clzVarW8.x()), null, null, new tg3(p7m0Var2, clzVarW8, i8Var4, (yje) null), 3);
    }

    public final zxq G0() {
        Object objN = this.O1.n(S1[0], this);
        objN.getClass();
        return (zxq) objN;
    }

    public final ij3 H0() {
        return (ij3) this.P1.getValue();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void W(Bundle bundle) {
        super.W(bundle);
        ij3 ij3VarH0 = H0();
        ij3VarH0.Q.f809a.c("app_loading");
        ij3VarH0.S.f40143a.a(cui0.b(new j1p(ij3VarH0.T.g(), (byte) 2)), 11318L);
        bcm0.x(n0().getWindow(), false);
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void Z() {
        Object value;
        ij3 ij3VarH0 = H0();
        p7m0 p7m0Var = ij3VarH0.j0;
        do {
            value = p7m0Var.getValue();
        } while (!p7m0Var.m(value, jh3.a((jh3) value, null, null, null, null, null, null, null, null, false, false, 3071)));
        f6m0 f6m0Var = ((g6m0) ij3VarH0.c0.f20148a).f10774a;
        f6m0Var.f9020a.set(-1L);
        f6m0Var.b.set(false);
        AppStartScreenLayout appStartScreenLayout = G0().b;
        org.xplatform.ui_core.viewcomponents.smart_background.c cVar = (org.xplatform.ui_core.viewcomponents.smart_background.c) appStartScreenLayout.findViewById(R.id.smart_background_lottie);
        if ((appStartScreenLayout.u instanceof cbk0) && cVar != null) {
            cVar.a();
        }
        org.xplatform.ui_core.viewcomponents.smart_background.e eVar = (org.xplatform.ui_core.viewcomponents.smart_background.e) appStartScreenLayout.findViewById(R.id.smart_background_video);
        if ((appStartScreenLayout.u instanceof gbk0) && eVar != null) {
            eVar.a();
        }
        super.Z();
    }

    @Override // androidx.fragment.app.Fragment
    public final void d0() {
        this.j1 = true;
        c4m0 c4m0Var = H0().h0;
        if (c4m0Var != null) {
            v3c.N(c4m0Var);
        }
        ArrayList arrayList = H0().i0;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            v3c.N((bby) it.next());
        }
        arrayList.clear();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void e0() {
        super.e0();
        ij3 ij3VarH0 = H0();
        c4m0 c4m0Var = ij3VarH0.h0;
        if (c4m0Var == null || !c4m0Var.isActive()) {
            ij3VarH0.h0 = sac.T(new fnq(ij3VarH0.R.a(), new vh3(ij3VarH0, null, (byte) 2), (byte) 4), jiu0.a(ij3VarH0), cj3.h);
        }
        i0h0 i0h0VarB = B();
        i0h0VarB.getClass();
        TypedValue typedValue = j5d.f15927a;
        int iA = j5d.a(o0(), R.attr.uikitBackgroundContent, false);
        ApplicationActivity applicationActivity = (ApplicationActivity) ((rn) i0h0VarB);
        applicationActivity.y1 = Integer.valueOf(iA);
        applicationActivity.C().b.setBackground(new ColorDrawable(iA));
        applicationActivity.getWindow().setBackgroundDrawable(new ColorDrawable(iA));
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void g0() {
        super.g0();
        ij3 ij3VarH0 = H0();
        p7m0 p7m0Var = ij3VarH0.k0;
        sf50 sf50Var = (sf50) p7m0Var.getValue();
        nf50 nf50Var = nf50.f23419a;
        if (Intrinsics.d(sf50Var, nf50Var)) {
            return;
        }
        if (Intrinsics.d(sf50Var, rf50.f30370a)) {
            g8d g8dVar = (g8d) ij3VarH0.m0.get(kh3.RESOLVE);
            if (g8dVar == null) {
                itt0.a();
                return;
            } else {
                g8dVar.a(ij3VarH0.e);
                p7m0Var.o(null, nf50Var);
                return;
            }
        }
        if (sf50Var instanceof pf50) {
            ij3VarH0.q.g();
            p7m0Var.o(null, nf50Var);
            return;
        }
        if (!(sf50Var instanceof qf50)) {
            if (!(sf50Var instanceof of50)) {
                t9f.b();
                return;
            } else {
                ij3VarH0.x();
                p7m0Var.o(null, nf50Var);
                return;
            }
        }
        qf50 qf50Var = (qf50) sf50Var;
        if (qf50Var.f28614a) {
            p7m0Var.o(null, qf50.a(qf50Var, 2));
        } else if (qf50Var.b) {
            p7m0Var.o(null, qf50.a(qf50Var, 1));
        }
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void i0(View view, Bundle bundle) {
        view.getClass();
        super.i0(view, bundle);
        f6m0 f6m0Var = ((g6m0) H0().a0.f24619a).f10774a;
        f6m0Var.f9020a.compareAndSet(-1L, SystemClock.elapsedRealtime());
        tkz tkzVarQ = x0x.Q(this.u1);
        rwj rwjVar = tvk.f34603a;
        sac.V(tkzVarQ, null, null, ys10.f43147a.x(), new sg3(this, null, (byte) 0), 11);
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: z0 */
    public final j9o0 getK1() {
        return this.K1;
    }
}
