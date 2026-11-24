package a;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes4.dex */
public final class sab extends ConstraintLayout {
    public final a8z q;
    public int r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sab(Context context) {
        super(context, null, 0);
        context.getClass();
        this.q = maz.a(wez.b, new h5((Object) this, (Object) this, (byte) 14));
    }

    private final wfu0 getBinding() {
        return (wfu0) this.q.getValue();
    }

    public static void u(int i, sab sabVar) {
        ImageView imageView = sabVar.getBinding().b;
        imageView.setImageResource(i);
        imageView.setAlpha(1.0f);
    }

    public final int getColumn() {
        return this.s;
    }

    public final Drawable getDrawable() {
        Drawable drawable = getBinding().b.getDrawable();
        drawable.getClass();
        return drawable;
    }

    public final int getRow() {
        return this.r;
    }

    public final void setColumn(int i) {
        this.s = i;
    }

    public final void setMargin(int i) {
        a3e a3eVar = new a3e(-1, -1);
        a3eVar.setMargins(i, i, i, i);
        getBinding().b.setLayoutParams(a3eVar);
    }

    public final void setRow(int i) {
        this.r = i;
    }
}
