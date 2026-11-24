package a;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.ViewParent;
import androidx.constraintlayout.motion.widget.MotionLayout;
import com.google.android.material.appbar.AppBarLayout;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.ui_core.viewcomponents.motion.AppBarMotionLayout;

/* JADX INFO: loaded from: classes.dex */
public abstract class pv5 extends MotionLayout implements ub3 {
    public static final /* synthetic */ iiy[] c2 = {new ez40(pv5.class, "currentProgressState", "getCurrentProgressState()F", 0)};
    public Boolean Z1;
    public Function1 a2;
    public final ov5 b2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pv5(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        context.getClass();
        this.s = null;
        this.t = 0.0f;
        this.u = -1;
        this.v = -1;
        this.w = -1;
        this.x = 0;
        this.y = 0;
        this.z = true;
        this.A = new HashMap();
        this.B = 0L;
        this.f1 = 1.0f;
        this.g1 = 0.0f;
        this.h1 = 0.0f;
        this.j1 = 0.0f;
        this.l1 = false;
        this.m1 = 0;
        this.o1 = false;
        this.p1 = new tqm0();
        this.q1 = new vs40(this);
        this.u1 = false;
        this.z1 = false;
        this.A1 = 0;
        this.B1 = -1L;
        this.C1 = 0.0f;
        this.D1 = false;
        this.L1 = new vjy((byte) 0);
        this.M1 = false;
        this.O1 = null;
        new HashMap();
        this.P1 = new Rect();
        this.Q1 = false;
        this.R1 = zs40.f44890a;
        this.S1 = new ws40(this);
        this.U1 = false;
        this.V1 = new RectF();
        this.W1 = null;
        this.X1 = null;
        new ArrayList();
        z(attributeSet);
        this.b2 = new ov5((AppBarMotionLayout) this);
    }

    private final float getCurrentProgressState() {
        iiy iiyVar = c2[0];
        ov5 ov5Var = this.b2;
        ov5Var.getClass();
        iiyVar.getClass();
        return ((Number) ov5Var.b).floatValue();
    }

    private final void setCurrentProgressState(float f) {
        this.b2.h(c2[0], Float.valueOf(f));
    }

    @Override // a.ub3
    public final void a(AppBarLayout appBarLayout, int i) {
        float totalScrollRange = (-i) / appBarLayout.getTotalScrollRange();
        setCurrentProgressState(totalScrollRange);
        setProgress(totalScrollRange);
        if (getProgress() == 0.0f) {
            Boolean bool = this.Z1;
            Boolean bool2 = Boolean.TRUE;
            if (!Intrinsics.d(bool, bool2)) {
                this.Z1 = bool2;
                return;
            }
        }
        if (getProgress() == 1.0f) {
            Boolean bool3 = this.Z1;
            Boolean bool4 = Boolean.FALSE;
            if (Intrinsics.d(bool3, bool4)) {
                return;
            }
            this.Z1 = bool4;
        }
    }

    public final bc3 getAppBarMotionLayoutCallback() {
        return null;
    }

    public final Function1<Float, Unit> getOnProgressChangeCallback() {
        return this.a2;
    }

    @Override // androidx.constraintlayout.motion.widget.MotionLayout, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        AppBarLayout appBarLayout = parent instanceof AppBarLayout ? (AppBarLayout) parent : null;
        if (appBarLayout != null) {
            appBarLayout.a(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ViewParent parent = getParent();
        AppBarLayout appBarLayout = parent instanceof AppBarLayout ? (AppBarLayout) parent : null;
        if (appBarLayout != null) {
            appBarLayout.f(this);
        }
    }

    public final void setOnProgressChangeCallback(Function1<? super Float, Unit> function1) {
        this.a2 = function1;
    }

    public final void setAppBarMotionLayoutCallback(bc3 bc3Var) {
    }
}
