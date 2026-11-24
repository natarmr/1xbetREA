package a;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.Property;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final class zdq0 extends AppCompatImageView {
    public final n0o0 d;
    public final n0o0 e;
    public Function0 f;
    public boolean g;
    public Function0 h;
    public int i;
    public int j;
    public s470 k;
    public lgq0 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zdq0(Context context) {
        super(context, null, 0);
        context.getClass();
        this.d = maz.b(new ydq0(this, (byte) 0));
        this.e = maz.b(new ydq0(this, (byte) 2));
        this.f = new ozp0((byte) 19);
        this.h = new ozp0((byte) 20);
        this.k = s470.FRUIT_BLAST;
        this.l = lgq0.f20020a;
        setEnabled(false);
        setScaleType(ImageView.ScaleType.FIT_XY);
        setOnClickListener(new jpe0(this, (byte) 13));
    }

    public static final Unit a(zdq0 zdq0Var) {
        zdq0Var.getDisappearAnimator().start();
        return Unit.f46060a;
    }

    private final Animator getDisappearAnimator() {
        return (Animator) this.e.getValue();
    }

    private final Animator getWinAnimator() {
        return (Animator) this.d.getValue();
    }

    private final void setDefaultScale(Function0<Unit> function0) {
        if (getScaleX() == 1.0f) {
            function0.invoke();
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(getScaleX(), 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new fd5(this, (byte) 24));
        valueAnimatorOfFloat.addListener(new x73(null, new xhl0(function0, (byte) 13), 11));
        valueAnimatorOfFloat.start();
    }

    public final void d(zbg0 zbg0Var) {
        getWinAnimator().cancel();
        this.f = zbg0Var;
        setDefaultScale(new ydq0(this, (byte) 3));
    }

    public final void g() {
        int[] iArr;
        s470 s470Var = this.k;
        s470Var.getClass();
        int iOrdinal = s470Var.ordinal();
        if (iOrdinal != 15) {
            iArr = iOrdinal != 16 ? new int[0] : new int[]{R.drawable.fruit_blast_blueberries_field_highlighted_icon, R.drawable.fruit_blast_cherry_field_highlighted_icon, R.drawable.fruit_blast_grape_field_highlighted_icon, R.drawable.fruit_blast_lemon_highlighted_field_icon, R.drawable.fruit_blast_strawberry_field_highlighted_icon, R.drawable.fruit_blast_bonus_highlighted_field_icon};
        } else {
            iArr = new int[]{R.drawable.ic_odyssey_crystal_red_selected, R.drawable.ic_odyssey_crystal_blue_selected, R.drawable.ic_odyssey_crystal_yellow_selected, R.drawable.ic_odyssey_crystal_purple_selected, R.drawable.ic_odyssey_crystal_green_selected, R.drawable.ic_odyssey_crystal_pink_selected};
        }
        setImageResource(iArr[this.l.a()]);
        this.g = true;
        setEnabled(true);
        getDisappearAnimator().cancel();
        getWinAnimator().start();
    }

    public final int getColumn$tile_matching() {
        return this.j;
    }

    public final int getRow$tile_matching() {
        return this.i;
    }

    public final lgq0 getType$tile_matching() {
        return this.l;
    }

    public final void h(float f, Function0 function0) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, (Property<zdq0, Float>) View.Y, f);
        objectAnimatorOfFloat.addListener(new x73(null, new xhl0(function0, (byte) 14), 11));
        objectAnimatorOfFloat.setDuration(650L).start();
    }

    public final void i() {
        int[] iArr;
        getWinAnimator().cancel();
        getDisappearAnimator().cancel();
        s470 s470Var = this.k;
        s470Var.getClass();
        int iOrdinal = s470Var.ordinal();
        if (iOrdinal != 15) {
            iArr = iOrdinal != 16 ? new int[0] : new int[]{R.drawable.fruit_blast_blueberries_field_icon, R.drawable.fruit_blast_cherry_field_icon, R.drawable.fruit_blast_grape_field_icon, R.drawable.fruit_blast_lemon_field_icon, R.drawable.fruit_blast_strawberry_field_icon, R.drawable.fruit_blast_bonus_field_icon};
        } else {
            iArr = new int[]{R.drawable.ic_odyssey_crystal_red, R.drawable.ic_odyssey_crystal_blue, R.drawable.ic_odyssey_crystal_yellow, R.drawable.ic_odyssey_crystal_purple, R.drawable.ic_odyssey_crystal_green, R.drawable.ic_odyssey_crystal_pink};
        }
        setImageResource(iArr[this.l.a()]);
        setEnabled(false);
        this.g = false;
        setAlpha(1.0f);
        setScaleX(1.0f);
        setScaleY(1.0f);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getDisappearAnimator().cancel();
        getWinAnimator().cancel();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setMeasuredDimension(getMeasuredWidth(), getMeasuredWidth());
    }

    public final void setColumn$tile_matching(int i) {
        this.j = i;
    }

    public final void setRow$tile_matching(int i) {
        this.i = i;
    }

    public final void setType$tile_matching(lgq0 lgq0Var) {
        lgq0Var.getClass();
        this.l = lgq0Var;
        i();
    }

    public final void setYByLine$tile_matching(int i) {
        setY(i * getHeight());
    }
}
