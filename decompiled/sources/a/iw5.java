package a;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import androidx.compose.ui.platform.ComposeView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\t²\u0006\u0010\u0010\b\u001a\u0004\u0018\u00010\u00078\n@\nX\u008a\u008e\u0002"}, d2 = {"La/iw5;", "La/yo8;", "<init>", "()V", "a/dw5", "a/cw5", "a/bw5", "Landroidx/compose/ui/platform/ComposeView;", "container", "uikit"}, k = 1, mv = {2, 4, 0}, xi = 48)
public abstract class iw5 extends yo8 {
    public static final /* synthetic */ iiy[] j2 = {new ez40(iw5.class, "fullScreenAnimationFix", "getFullScreenAnimationFix()Z", 0)};
    public boolean b2;
    public boolean c2;
    public CoordinatorLayout d2;
    public boolean e2;
    public View f2;
    public boolean g2;
    public final fw5 Y1 = new fw5(this, 0);
    public final fw5 Z1 = new fw5(this, 1);
    public boolean a2 = true;
    public final fvt0 h2 = new fvt0();
    public final a8z i2 = maz.a(wez.b, new zo4(this, 13));

    public static View K0(View view) {
        if (view.getId() == R.id.container) {
            return view;
        }
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            return K0(view2);
        }
        return null;
    }

    public static cw5 O0(int i, fet fetVar) {
        boolean z = (i & 1) != 0;
        Object objP = fetVar.P();
        if (objP == ukd.f35823a) {
            pz40 pz40Var = s6t0.f31722a;
            cw5 cw5Var = new cw5(true, z, true, true, kel.f18158a, s6t0.b().f33626a.getBackgroundContent());
            fetVar.o0(cw5Var);
            objP = cw5Var;
        }
        return (cw5) objP;
    }

    @Override // a.yo8, a.sd3, a.sik
    public Dialog C0(Bundle bundle) {
        return new hw5(this, o0());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3, types: [kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r8v2, types: [a.fet] */
    /* JADX WARN: Type inference failed for: r8v4, types: [a.fet] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7, types: [boolean, byte] */
    public final void I0(final bw5 bw5Var, fet fetVar, final int i) {
        ?? r8;
        boolean z;
        ?? r11;
        final ?? r9;
        yje yjeVar;
        fetVar.g0(-503208839);
        int i2 = (fetVar.g(bw5Var) ? 4 : 2) | i | (fetVar.i(this) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            BottomSheetBehavior bottomSheetBehaviorL0 = L0();
            cw5 cw5Var = bw5Var.f3310a;
            float f = cw5Var.d ? 0.4f : 0.0f;
            Window window = D0().getWindow();
            if (window != null) {
                window.setDimAmount(f);
            }
            if (!cw5Var.d) {
                ViewParent parent = q0().getParent();
                ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (viewGroup != null) {
                    viewGroup.setClipChildren(false);
                    viewGroup.setClipToPadding(false);
                    ViewParent parent2 = viewGroup.getParent();
                    ViewGroup viewGroup2 = parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null;
                    if (viewGroup2 != null) {
                        viewGroup2.setClipChildren(false);
                        viewGroup2.setClipToPadding(false);
                    }
                }
            }
            boolean z2 = bw5Var.d != null;
            boolean z3 = cw5Var.f5065a;
            boolean z4 = cw5Var.b;
            boolean z5 = cw5Var.c;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = androidx.compose.runtime.e.a(0.1f);
                fetVar.o0(objP);
            }
            agk0 agk0Var = (agk0) objP;
            boolean zI = fetVar.i(bottomSheetBehaviorL0);
            Object objP2 = fetVar.P();
            if (zI || objP2 == cl5Var) {
                objP2 = new qo5(bottomSheetBehaviorL0, agk0Var, (byte) 9);
                fetVar.o0(objP2);
            }
            mm40 mm40VarE0 = o2e.e0(ro4.d0(jm40.b, (Function1) objP2), "BOTTOM_SHEET_DIALOG");
            boolean z6 = !cw5Var.d;
            boolean z7 = z2 ? false : z3;
            boolean z8 = z2 ? false : z4;
            if (z2) {
                z = false;
            } else {
                z = Build.VERSION.SDK_INT > 29;
            }
            i4w0.j(mm40VarE0, bottomSheetBehaviorL0, z6, z, z7, z8, z5, cw5Var.e, cw5Var.f, bw5Var.b, bw5Var.c, bw5Var.e, fetVar, 0);
            ?? r10 = fetVar;
            bottomSheetBehaviorL0.L = z5;
            bottomSheetBehaviorL0.U = agk0Var.l();
            if (z2) {
                r10.e0(-1656177282);
                Object objP3 = r10.P();
                if (objP3 == cl5Var) {
                    objP3 = q7m0.a(0);
                    r10.o0(objP3);
                }
                qz40 qz40Var = (qz40) objP3;
                View view = (View) r10.k(dy2.f);
                Object objP4 = r10.P();
                if (objP4 == cl5Var) {
                    objP4 = androidx.compose.runtime.e.e(null);
                    r10.o0(objP4);
                }
                pz40 pz40Var = (pz40) objP4;
                if (((ComposeView) pz40Var.getValue()) == null) {
                    r10.e0(-1656036015);
                    Unit unit = Unit.f46060a;
                    boolean zI2 = r10.i(this);
                    Object objP5 = r10.P();
                    if (zI2 || objP5 == cl5Var) {
                        objP5 = new cm3(this, pz40Var, null, (byte) 21);
                        r10.o0(objP5);
                        yjeVar = null;
                    } else {
                        yjeVar = null;
                    }
                    m0x0.t(r10, unit, (Function2) objP5);
                    r9 = 0;
                    r10.r(false);
                    r11 = yjeVar;
                } else {
                    r11 = 0;
                    r9 = 0;
                    r10.e0(-1655951447);
                    r10.r(false);
                }
                ComposeView composeView = (ComposeView) pz40Var.getValue();
                if (composeView == null) {
                    r10.r(r9);
                    yfe0 yfe0VarU = r10.u();
                    if (yfe0VarU != null) {
                        yfe0VarU.d = new Function2(this, bw5Var, i, r9) { // from class: a.zv5

                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                            public final /* synthetic */ byte f45040a;
                            public final /* synthetic */ iw5 b;
                            public final /* synthetic */ bw5 c;

                            {
                                this.f45040a = r9;
                                this.b = this;
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                byte b = this.f45040a;
                                bw5 bw5Var2 = this.c;
                                iw5 iw5Var = this.b;
                                fet fetVar2 = (fet) obj;
                                ((Integer) obj2).getClass();
                                iiy[] iiyVarArr = iw5.j2;
                                switch (b) {
                                    case 0:
                                        iw5Var.I0(bw5Var2, fetVar2, x8x.L(1));
                                        break;
                                    default:
                                        iw5Var.I0(bw5Var2, fetVar2, x8x.L(1));
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        };
                        return;
                    }
                    return;
                }
                boolean zI3 = r10.i(composeView) | r10.i(qz40Var) | r10.i(view);
                Object objP6 = r10.P();
                if (zI3 || objP6 == cl5Var) {
                    objP6 = new on((Object) view, (Object) composeView, (Object) qz40Var, (byte) 23);
                    r10.o0(objP6);
                }
                m0x0.o(view, (Function1) objP6, r10);
                WeakHashMap weakHashMap = djv0.w;
                pkd.i(composeView, r11, u1c.M(1758003624, new aw5((Object) qz40Var, (Object) bw5Var, z3, z4, zcm0.i(r10).e.e().d, (byte) 0), r10));
                r10.r(r9);
                r8 = r10;
            } else {
                r10.e0(-1653952567);
                r10.r(false);
                r8 = r10;
            }
        } else {
            fet fetVar2 = fetVar;
            fetVar2.X();
            r8 = fetVar2;
        }
        yfe0 yfe0VarU2 = r8.u();
        if (yfe0VarU2 != null) {
            final byte b = 1;
            yfe0VarU2.d = new Function2(this, bw5Var, i, b) { // from class: a.zv5

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ byte f45040a;
                public final /* synthetic */ iw5 b;
                public final /* synthetic */ bw5 c;

                {
                    this.f45040a = b;
                    this.b = this;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    byte b2 = this.f45040a;
                    bw5 bw5Var2 = this.c;
                    iw5 iw5Var = this.b;
                    fet fetVar3 = (fet) obj;
                    ((Integer) obj2).getClass();
                    iiy[] iiyVarArr = iw5.j2;
                    switch (b2) {
                        case 0:
                            iw5Var.I0(bw5Var2, fetVar3, x8x.L(1));
                            break;
                        default:
                            iw5Var.I0(bw5Var2, fetVar3, x8x.L(1));
                            break;
                    }
                    return Unit.f46060a;
                }
            };
        }
    }

    public abstract bw5 J0(fet fetVar);

    public final BottomSheetBehavior L0() {
        fw5 fw5Var = this.Y1;
        Object objI = fw5Var.b;
        if (objI == null) {
            objI = fw5Var.i();
            fw5Var.b = objI;
        }
        return (BottomSheetBehavior) objI;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void M0() {
        BottomSheetBehavior bottomSheetBehaviorL0 = L0();
        byte b = 0;
        this.g2 = false;
        View viewK0 = K0(q0());
        if (viewK0 != null) {
            View view = this.l1;
            ViewParent parent = view != null ? view.getParent() : null;
            View view2 = parent instanceof View ? (View) parent : null;
            this.f2 = view2;
            if (view2 != null) {
                view2.setOnTouchListener(new yv5(this, bottomSheetBehaviorL0, b));
            }
            b = Build.VERSION.SDK_INT >= 35 ? (byte) 1 : (byte) 0;
            o24 o24Var = new o24();
            o24Var.f24513a = b ^ 1;
            o24Var.b = this;
            o24Var.c = viewK0;
            o24Var.d = bottomSheetBehaviorL0;
            WeakHashMap weakHashMap = rgu0.f30456a;
            igu0.c(viewK0, o24Var);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View X(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        ComposeView composeView = new ComposeView(o0(), null, 6);
        composeView.setClipChildren(false);
        composeView.setClipToPadding(false);
        pkd.i(composeView, null, new ugd(1972778657, true, new wv5(this, (byte) 0)));
        return composeView;
    }

    @Override // a.sik, androidx.fragment.app.Fragment
    public void Z() {
        ycm0 ziv0Var;
        this.d2 = null;
        L0().a0.remove((po8) this.i2.getValue());
        this.Y1.b = null;
        this.Z1.b = null;
        View view = this.f2;
        if (view != null) {
            view.setOnTouchListener(null);
        }
        this.f2 = null;
        if (this.b2) {
            Window window = n0().getWindow();
            View decorView = window.getDecorView();
            decorView.getClass();
            ani0 ani0Var = new ani0(decorView);
            int i = Build.VERSION.SDK_INT;
            if (i >= 35) {
                ziv0Var = new bjv0(window, ani0Var);
            } else if (i >= 30) {
                ziv0Var = new ajv0(window, ani0Var);
            } else {
                ziv0Var = i >= 26 ? new ziv0(window, ani0Var) : new yiv0(window, ani0Var);
            }
            ziv0Var.s(519);
        }
        super.Z();
    }

    @Override // androidx.fragment.app.Fragment
    public void e0() {
        Window window;
        Window window2;
        this.j1 = true;
        kxq kxqVarB = B();
        if (kxqVarB == null || (window = kxqVarB.getWindow()) == null || (window2 = D0().getWindow()) == null) {
            return;
        }
        hfm0.u(window2, window);
    }

    @Override // a.sik, androidx.fragment.app.Fragment
    public void g0() {
        super.g0();
        if (this.c2) {
            Window window = D0().getWindow();
            if (window != null) {
                window.setWindowAnimations(R.style.ThemeOverlay_AppTheme_BottomSheetDialog_Animation_Restore);
            }
        } else {
            this.c2 = true;
            Window window2 = D0().getWindow();
            if (window2 != null) {
                window2.setWindowAnimations(R.style.ThemeOverlay_AppTheme_BottomSheetDialog_Animation);
            }
        }
        View viewK0 = K0(q0());
        if (viewK0 != null) {
            WeakHashMap weakHashMap = rgu0.f30456a;
            viewK0.requestApplyInsets();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void i0(View view, Bundle bundle) {
        Window window;
        ycm0 ziv0Var;
        view.getClass();
        Log.i("onCreateDialog", "Current screen: ".concat(getClass().getName()));
        BottomSheetBehavior bottomSheetBehaviorL0 = L0();
        Context contextO0 = o0();
        mjv0.f21914a.getClass();
        njv0 njv0Var = ljv0.b;
        njv0Var.getClass();
        bottomSheetBehaviorL0.M((int) (njv0Var.b(contextO0).f18406a.c().height() * 0.6666667f));
        view.post(new xv5(view, (byte) 0));
        view.setFocusable(true);
        view.setFocusableInTouchMode(true);
        kie0 kie0Var = new kie0();
        kie0Var.f18333a = 4;
        L0().y(new ew5(kie0Var, this));
        int i = G().getConfiguration().screenWidthDp;
        BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.Y1.b;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.l = i >= 600 ? f7k.M(512) : -1;
        }
        M0();
        N0();
        iiy[] iiyVarArr = j2;
        iiy iiyVar = iiyVarArr[0];
        fvt0 fvt0Var = this.h2;
        if (fvt0Var.n(this, iiyVar).booleanValue()) {
            return;
        }
        iiyVarArr[0].getClass();
        Bundle bundle2 = this.g;
        if (bundle2 == null) {
            bundle2 = new Bundle();
            s0(bundle2);
        }
        bundle2.putBoolean("FULL_SCREEN_ANIMATION_FIX", true);
        fvt0Var.f10231a = Boolean.TRUE;
        View decorView = n0().getWindow().getDecorView();
        decorView.getClass();
        WeakHashMap weakHashMap = rgu0.f30456a;
        xiv0 xiv0VarA = jgu0.a(decorView);
        if (xiv0VarA == null || xiv0VarA.f40966a.u(1) || (window = D0().getWindow()) == null) {
            return;
        }
        ani0 ani0Var = new ani0(window.getDecorView());
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 35) {
            ziv0Var = new bjv0(window, ani0Var);
        } else if (i2 >= 30) {
            ziv0Var = new ajv0(window, ani0Var);
        } else {
            ziv0Var = i2 >= 26 ? new ziv0(window, ani0Var) : new yiv0(window, ani0Var);
        }
        ziv0Var.s(519);
        ziv0Var.x(2);
        this.b2 = true;
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        configuration.getClass();
        this.j1 = true;
        int i = configuration.screenWidthDp;
        BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.Y1.b;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.l = i >= 600 ? f7k.M(512) : -1;
        }
    }

    public void N0() {
    }
}
