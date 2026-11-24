package a;

import android.graphics.Canvas;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final class spb0 implements opb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tpb0 f32584a;
    public final float b;
    public final int c;
    public final n0o0 d = maz.b(new ssa0(this, (byte) 9));
    public StaticLayout e;
    public cqb0 f;
    public float g;

    public spb0(tpb0 tpb0Var) {
        this.f32584a = tpb0Var;
        this.b = tpb0Var.getContext().getResources().getDimensionPixelSize(R.dimen.text_12);
        this.c = tpb0Var.getResources().getDimensionPixelSize(R.dimen.space_8);
    }

    @Override // a.opb0
    public final void a() {
        Layout.Alignment alignment;
        cqb0 cqb0Var = this.f;
        String str = cqb0Var != null ? cqb0Var.f4785a : null;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        TextPaint textPaint = (TextPaint) this.d.getValue();
        tpb0 tpb0Var = this.f32584a;
        int measuredWidth = tpb0Var.getMeasuredWidth() - (this.c * 2);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        cqb0 cqb0Var2 = this.f;
        zpb0 zpb0Var = cqb0Var2 != null ? cqb0Var2.b : null;
        int i = zpb0Var == null ? -1 : rpb0.f30879a[zpb0Var.ordinal()];
        if (i == -1) {
            alignment = Layout.Alignment.ALIGN_OPPOSITE;
        } else if (i == 1) {
            alignment = tpb0Var.getLayoutDirection() == 0 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE;
        } else {
            if (i != 2) {
                t9f.b();
                return;
            }
            alignment = Layout.Alignment.ALIGN_CENTER;
        }
        this.e = xdx.I(str2, textPaint, measuredWidth, 1, truncateAt, 0, alignment, 1264);
        int measuredHeight = tpb0Var.getMeasuredHeight();
        StaticLayout staticLayout = this.e;
        this.g = (measuredHeight - (staticLayout != null ? staticLayout.getHeight() : 0)) / 2;
    }

    @Override // a.opb0
    public final void c(dqb0 dqb0Var) {
        cqb0 cqb0Var = dqb0Var instanceof cqb0 ? (cqb0) dqb0Var : null;
        if (cqb0Var == null) {
            return;
        }
        this.f = cqb0Var;
        this.f32584a.requestLayout();
    }

    @Override // a.opb0
    public final int d() {
        TextPaint textPaint = (TextPaint) this.d.getValue();
        cqb0 cqb0Var = this.f;
        return (int) textPaint.measureText(cqb0Var != null ? cqb0Var.f4785a : null);
    }

    @Override // a.opb0
    public final void k(Canvas canvas) {
        canvas.save();
        canvas.translate(this.c, this.g);
        StaticLayout staticLayout = this.e;
        if (staticLayout != null) {
            staticLayout.draw(canvas);
        }
        canvas.restore();
    }
}
