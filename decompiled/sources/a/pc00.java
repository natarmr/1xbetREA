package a;

import android.animation.ValueAnimator;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class pc00 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f26735a;
    public final /* synthetic */ qc00 b;

    public /* synthetic */ pc00(qc00 qc00Var, byte b) {
        this.f26735a = b;
        this.b = qc00Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.f26735a;
        qc00 qc00Var = this.b;
        Object objM = w6x.m(valueAnimator);
        switch (b) {
            case 0:
                qc00Var.k = ((Float) objM).floatValue();
                qc00Var.f28464a.invalidate();
                break;
            case 1:
                qc00Var.m = ((Float) objM).floatValue();
                qc00Var.f28464a.invalidate();
                break;
            case 2:
                qc00Var.e = ((Integer) objM).intValue();
                qc00Var.f28464a.invalidate();
                break;
            default:
                qc00Var.i = ((Float) objM).floatValue();
                qc00Var.f28464a.invalidate();
                break;
        }
    }
}
