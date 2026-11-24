package a;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.animation.Interpolator;
import java.util.Objects;
import java.util.WeakHashMap;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
public final class xhv0 implements View.OnApplyWindowInsetsListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final oyc f40914a;
    public xiv0 b;

    public xhv0(View view, oyc oycVar) {
        xiv0 xiv0VarB;
        this.f40914a = oycVar;
        WeakHashMap weakHashMap = rgu0.f30456a;
        xiv0 xiv0VarA = jgu0.a(view);
        if (xiv0VarA != null) {
            int i = Build.VERSION.SDK_INT;
            xiv0VarB = (i >= 36 ? new kiv0(xiv0VarA) : i >= 35 ? new jiv0(xiv0VarA) : i >= 34 ? new iiv0(xiv0VarA) : i >= 31 ? new hiv0(xiv0VarA) : i >= 30 ? new giv0(xiv0VarA) : i >= 29 ? new fiv0(xiv0VarA) : new eiv0(xiv0VarA)).b();
        } else {
            xiv0VarB = null;
        }
        this.b = xiv0VarB;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        Interpolator interpolator;
        if (!view.isLaidOut()) {
            this.b = xiv0.h(windowInsets, view);
            return view.getTag(R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
        }
        xiv0 xiv0VarH = xiv0.h(windowInsets, view);
        uiv0 uiv0Var = xiv0VarH.f40966a;
        xiv0 xiv0VarA = this.b;
        if (xiv0VarA == null) {
            WeakHashMap weakHashMap = rgu0.f30456a;
            xiv0VarA = jgu0.a(view);
            this.b = xiv0VarA;
        }
        if (xiv0VarA == null) {
            this.b = xiv0VarH;
            if (view.getTag(R.id.tag_on_apply_window_listener) == null) {
                return view.onApplyWindowInsets(windowInsets);
            }
        } else {
            oyc oycVarJ = yhv0.j(view);
            if (oycVarJ == null || !Objects.equals((xiv0) oycVarJ.b, xiv0VarH)) {
                int[] iArr = new int[1];
                int[] iArr2 = new int[1];
                xiv0 xiv0Var = this.b;
                int i = 1;
                while (i <= 512) {
                    pfx pfxVarI = uiv0Var.i(i);
                    pfx pfxVarI2 = xiv0Var.f40966a.i(i);
                    int i2 = pfxVarI.f26926a;
                    int i3 = pfxVarI.d;
                    int i4 = pfxVarI.c;
                    int i5 = pfxVarI.b;
                    int i6 = pfxVarI2.f26926a;
                    int i7 = pfxVarI2.d;
                    int[] iArr3 = iArr;
                    int i8 = pfxVarI2.c;
                    int i9 = pfxVarI2.b;
                    boolean z = i2 > i6 || i5 > i9 || i4 > i8 || i3 > i7;
                    if (z != (i2 < i6 || i5 < i9 || i4 < i8 || i3 < i7)) {
                        if (z) {
                            iArr3[0] = iArr3[0] | i;
                        } else {
                            iArr2[0] = iArr2[0] | i;
                        }
                    }
                    i <<= 1;
                    iArr = iArr3;
                    iArr2 = iArr2;
                }
                int i10 = iArr[0];
                int i11 = iArr2[0];
                int i12 = i10 | i11;
                if (i12 == 0) {
                    this.b = xiv0VarH;
                    if (view.getTag(R.id.tag_on_apply_window_listener) == null) {
                        return view.onApplyWindowInsets(windowInsets);
                    }
                } else {
                    xiv0 xiv0Var2 = this.b;
                    if ((i10 & 8) != 0) {
                        interpolator = yhv0.e;
                    } else if ((i11 & 8) != 0) {
                        interpolator = yhv0.f;
                    } else if ((i10 & 519) != 0) {
                        interpolator = yhv0.g;
                    } else {
                        interpolator = (i11 & 519) != 0 ? yhv0.h : null;
                    }
                    div0 div0Var = new div0(i12, interpolator, (i12 & 8) != 0 ? 160L : 250L);
                    div0Var.f6156a.e(0.0f);
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(div0Var.f6156a.b());
                    pfx pfxVarI3 = uiv0Var.i(i12);
                    pfx pfxVarI4 = xiv0Var2.f40966a.i(i12);
                    int iMin = Math.min(pfxVarI3.f26926a, pfxVarI4.f26926a);
                    int i13 = pfxVarI3.b;
                    int i14 = pfxVarI4.b;
                    int iMin2 = Math.min(i13, i14);
                    int i15 = pfxVarI3.c;
                    int i16 = pfxVarI4.c;
                    int iMin3 = Math.min(i15, i16);
                    int i17 = pfxVarI3.d;
                    int i18 = pfxVarI4.d;
                    hcp0 hcp0Var = new hcp0((Object) pfx.c(iMin, iMin2, iMin3, Math.min(i17, i18)), (Object) pfx.c(Math.max(pfxVarI3.f26926a, pfxVarI4.f26926a), Math.max(i13, i14), Math.max(i15, i16), Math.max(i17, i18)), (byte) 13);
                    yhv0.g(view, div0Var, xiv0VarH, false);
                    duration.addUpdateListener(new whv0(div0Var, xiv0VarH, xiv0Var2, i12, view));
                    duration.addListener(new ywv(div0Var, view, (byte) 4));
                    tl60.a(view, new pb90(view, div0Var, hcp0Var, duration, (byte) 5));
                    this.b = xiv0VarH;
                    if (view.getTag(R.id.tag_on_apply_window_listener) == null) {
                        return view.onApplyWindowInsets(windowInsets);
                    }
                }
            } else if (view.getTag(R.id.tag_on_apply_window_listener) == null) {
                return view.onApplyWindowInsets(windowInsets);
            }
        }
        return windowInsets;
    }
}
