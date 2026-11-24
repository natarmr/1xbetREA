package a;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final class tpb0 extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f34324a;
    public final int b;
    public final float c;
    public final s1g d;
    public opb0 e;
    public iqb0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tpb0(Context context) {
        super(context, null, 0);
        context.getClass();
        this.f34324a = getResources().getDimensionPixelSize(R.dimen.size_32);
        this.b = getResources().getDimensionPixelSize(R.dimen.space_8);
        this.c = getResources().getDimension(R.dimen.corner_radius_8);
        this.d = new s1g(this, R.color.static_black_40);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.getClass();
        this.d.a(canvas);
        opb0 opb0Var = this.e;
        if (opb0Var != null) {
            opb0Var.k(canvas);
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        opb0 opb0Var = this.e;
        if (opb0Var != null) {
            opb0Var.a();
        }
        this.d.b(0, 0, getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int iD;
        if (View.MeasureSpec.getMode(i) == 1073741824) {
            iD = View.MeasureSpec.getSize(i);
        } else {
            opb0 opb0Var = this.e;
            iD = (opb0Var != null ? opb0Var.d() : 0) + (this.b * 2);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(iD, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f34324a, 1073741824));
    }

    public final void setCellItem(iqb0 iqb0Var) {
        opb0 spb0Var;
        iqb0Var.getClass();
        if (Intrinsics.d(this.f, iqb0Var)) {
            return;
        }
        float f = this.c;
        s1g s1gVar = this.d;
        s1gVar.c(f);
        dqb0 dqb0Var = iqb0Var.f15203a;
        if (dqb0Var instanceof bqb0) {
            int i = ((bqb0) dqb0Var).c;
            s1gVar.b = i;
            Paint paint = s1gVar.c;
            Context context = s1gVar.f31455a.getContext();
            context.getClass();
            paint.setColor(sj3.P(i, context));
            spb0Var = this.e;
            if (spb0Var == null) {
                spb0Var = new w5z(this);
            }
        } else if (dqb0Var instanceof aqb0) {
            spb0Var = this.e;
            if (spb0Var == null) {
                spb0Var = new yuu(this);
            }
        } else if (!(dqb0Var instanceof cqb0)) {
            t9f.b();
            return;
        } else {
            spb0Var = this.e;
            if (spb0Var == null) {
                spb0Var = new spb0(this);
            }
        }
        this.e = spb0Var;
        spb0Var.c(dqb0Var);
        cqb0 cqb0Var = dqb0Var instanceof cqb0 ? (cqb0) dqb0Var : null;
        setContentDescription(cqb0Var != null ? cqb0Var.f4785a : null);
        this.f = iqb0Var;
    }
}
