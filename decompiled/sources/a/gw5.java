package a;

import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class gw5 extends po8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f12009a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gw5(Object obj, byte b) {
        this.f12009a = b;
        this.b = obj;
    }

    @Override // a.po8
    public final void b(View view, float f) {
        byte b = this.f12009a;
        Object obj = this.b;
        switch (b) {
            case 0:
                iw5 iw5Var = (iw5) obj;
                fw5 fw5Var = iw5Var.Z1;
                if (iw5Var.Q()) {
                    float f2 = 0.0f;
                    if (f < 0.0f) {
                        Object objI = fw5Var.b;
                        if (objI == null) {
                            objI = fw5Var.i();
                            fw5Var.b = objI;
                        }
                        f2 = (-((ComposeView) objI).getHeight()) * f;
                    }
                    Object objI2 = fw5Var.b;
                    if (objI2 == null) {
                        objI2 = fw5Var.i();
                        fw5Var.b = objI2;
                    }
                    ((ComposeView) objI2).setTranslationY(f2);
                    CoordinatorLayout coordinatorLayout = iw5Var.d2;
                    if (coordinatorLayout != null) {
                        coordinatorLayout.setTranslationY(f2);
                    }
                    break;
                }
                break;
            case 2:
                kud kudVar = axe.e2;
                kse kseVarK0 = ((axe) obj).K0();
                if (kseVarK0 != null) {
                    kseVarK0.c(f);
                }
                break;
        }
    }

    @Override // a.po8
    public final void c(View view, int i) {
        Object value;
        byte b = this.f12009a;
        Object obj = this.b;
        switch (b) {
            case 0:
                break;
            case 1:
                if (i == 5) {
                    ((wo8) obj).cancel();
                }
                break;
            case 2:
                axe axeVar = (axe) obj;
                if (i == 4) {
                    j120.Y(axeVar);
                    View view2 = axeVar.l1;
                    if (view2 != null) {
                        view2.requestFocus();
                    }
                }
                kud kudVar = axe.e2;
                Float fValueOf = i != 3 ? i != 4 ? null : Float.valueOf(0.0f) : Float.valueOf(1.0f);
                if (fValueOf != null) {
                    float fFloatValue = fValueOf.floatValue();
                    kse kseVarK0 = axeVar.K0();
                    if (kseVarK0 != null) {
                        kseVarK0.c(fFloatValue);
                    }
                }
                break;
            case 3:
                zo90 zo90Var = (zo90) obj;
                fl70 fl70Var = zo90.p2;
                g090 g090Var = zo90Var.W0().i;
                ((cr90) ((p7m0) g090Var.b).getValue()).getClass();
                p7m0 p7m0Var = (p7m0) g090Var.b;
                do {
                    value = p7m0Var.getValue();
                } while (!p7m0Var.m(value, cr90.a((cr90) value, null, null, null, false, null, Integer.valueOf(i), 255)));
                ((vzg0) g090Var.f10448a).e("KEY_BOTTOM_SHEET_STATE_BY_MANUALLY", Integer.valueOf(i));
                if (i == 4) {
                    j120.Y(zo90Var);
                }
                break;
            case 4:
                if (i != 3) {
                    ((et90) obj).J0();
                }
                break;
            default:
                b5r0 b5r0Var = (b5r0) obj;
                if (i == 1 || i == 2) {
                    b5r0Var.l2 = true;
                    break;
                } else if (i == 3) {
                    b5r0Var.l2 = false;
                    break;
                }
                break;
        }
    }

    private final void d(View view, float f) {
    }

    private final void e(View view, float f) {
    }

    private final void f(View view, float f) {
    }

    private final void g(View view, float f) {
    }

    private final void h(View view, int i) {
    }
}
