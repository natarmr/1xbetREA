package a;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes2.dex */
public final class b0g extends ii30 {
    public final RectF q;

    public b0g(b0g b0gVar) {
        super(b0gVar);
        this.q = b0gVar.q;
    }

    @Override // a.ii30, android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        d0g d0gVar = new d0g(this);
        d0gVar.i1 = this;
        d0gVar.invalidateSelf();
        return d0gVar;
    }

    public b0g(akj0 akj0Var, RectF rectF) {
        super(akj0Var);
        this.q = rectF;
    }
}
