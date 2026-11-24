package a;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final class x18 extends FrameLayout implements due {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f40108a;
    public final s4k0 b;
    public final s4k0 c;
    public boolean d;
    public int e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x18(Context context) {
        super(context, null, 0);
        context.getClass();
        this.f40108a = getResources().getDimensionPixelSize(R.dimen.size_4);
        this.b = new s4k0(context);
        s4k0 s4k0Var = new s4k0(context);
        s4k0Var.setReversedOrder(true);
        this.c = s4k0Var;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (getMeasuredWidth() <= 0 || getMeasuredHeight() <= 0) {
            return;
        }
        boolean z2 = this.d;
        s4k0 s4k0Var = this.b;
        s4k0 s4k0Var2 = this.c;
        s4k0 s4k0Var3 = this.b;
        if (!z2) {
            s4k0Var3.layout(0, 0, s4k0Var3.getMeasuredWidth(), s4k0Var.getMeasuredHeight());
            int i5 = this.f;
            s4k0Var2.layout(i5, 0, s4k0Var2.getMeasuredWidth() + i5, s4k0Var2.getMeasuredHeight());
        } else {
            jmu0.f(0, 0, s4k0Var3.getMeasuredWidth(), s4k0Var.getMeasuredHeight(), s4k0Var3, this);
            int i6 = this.f;
            s4k0 s4k0Var4 = this.c;
            jmu0.f(i6, 0, s4k0Var4.getMeasuredWidth() + i6, s4k0Var2.getMeasuredHeight(), s4k0Var4, this);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i) - this.e;
        int i3 = this.f40108a;
        int i4 = (size - (i3 * 2)) / 2;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        s4k0 s4k0Var = this.b;
        s4k0Var.measure(iMakeMeasureSpec, i2);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        s4k0 s4k0Var2 = this.c;
        s4k0Var2.measure(iMakeMeasureSpec2, i2);
        int iMax = Math.max(s4k0Var.getMeasuredHeight(), s4k0Var2.getMeasuredHeight());
        this.f = (i3 * 2) + s4k0Var.getMeasuredWidth() + this.e;
        setMeasuredDimension(i, View.MeasureSpec.makeMeasureSpec(iMax, 1073741824));
    }

    public final void setRtlSupportEnabled(boolean z) {
        this.d = z;
        this.b.setRtlSupportEnabled(z);
        this.c.setRtlSupportEnabled(z);
        requestLayout();
    }

    public final void setScoreViewOccupiedWidth(int i) {
        this.e = i;
    }

    @Override // a.due
    public void setTeamsUiModel(cue cueVar) {
        cueVar.getClass();
        bue bueVar = cueVar instanceof bue ? (bue) cueVar : null;
        if (bueVar == null) {
            return;
        }
        String str = bueVar.f3226a;
        efp0 efp0Var = bueVar.c;
        s4k0 s4k0Var = this.b;
        s4k0Var.b(str, efp0Var);
        String str2 = bueVar.b;
        efp0 efp0Var2 = bueVar.d;
        s4k0 s4k0Var2 = this.c;
        s4k0Var2.b(str2, efp0Var2);
        if (s4k0Var.getParent() == null) {
            addView(s4k0Var);
        }
        if (s4k0Var2.getParent() == null) {
            addView(s4k0Var2);
        }
    }
}
