package org.xplatform.uikit.components.views;

import a.gq00;
import a.maz;
import a.mbz;
import a.n0o0;
import a.o0x;
import a.r0x;
import a.w800;
import a.x800;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.google.android.material.imageview.ShapeableImageView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public class LoadableShapeableImageView extends ShapeableImageView {
    public static final /* synthetic */ int B = 0;
    public Function1 A;
    public final n0o0 v;
    public final Drawable w;
    public Function0 x;
    public Function1 y;
    public Function1 z;

    /* JADX WARN: Illegal instructions before constructor call */
    public LoadableShapeableImageView(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, 0);
        byte b = 13;
        this.v = maz.b(new mbz(this, attributeSet, b));
        this.w = getLoadHelper().c;
        this.x = new x800(b);
        this.y = new w800((byte) 22);
        this.z = new w800((byte) 21);
    }

    private final r0x getLoadHelper() {
        return (r0x) this.v.getValue();
    }

    public static void i(LoadableShapeableImageView loadableShapeableImageView, String str, Drawable drawable, int i) {
        if ((i & 2) != 0) {
            drawable = loadableShapeableImageView.w;
        }
        Drawable drawable2 = drawable;
        w800 w800Var = new w800((byte) 19);
        w800 w800Var2 = new w800((byte) 21);
        loadableShapeableImageView.getClass();
        str.getClass();
        loadableShapeableImageView.x.invoke();
        r0x.g(loadableShapeableImageView.getLoadHelper(), str, drawable2, new gq00(w800Var, loadableShapeableImageView, (byte) 2), new gq00(w800Var2, loadableShapeableImageView, (byte) 3), 4);
    }

    public static void l(LoadableShapeableImageView loadableShapeableImageView, String str, Function1 function1) {
        w800 w800Var = new w800((byte) 23);
        loadableShapeableImageView.getClass();
        loadableShapeableImageView.x.invoke();
        loadableShapeableImageView.getLoadHelper().f(str, R.drawable.ic_glyph_placeholder_player_secondary60, new gq00(w800Var, loadableShapeableImageView, (byte) 0), new gq00(function1, loadableShapeableImageView, (byte) 1));
    }

    public final void g(ImageView imageView) {
        getLoadHelper().getClass();
        imageView.setColorFilter((ColorFilter) null);
    }

    public final Function1<Drawable, Unit> getOnDrawableChangeCallback$uikit() {
        return this.A;
    }

    public final Function1<Throwable, Boolean> getOnError$uikit() {
        return this.z;
    }

    public final Function1<Drawable, Boolean> getOnLoaded$uikit() {
        return this.y;
    }

    public final Function0<Unit> getOnLoading$uikit() {
        return this.x;
    }

    public final Drawable getPlaceholder() {
        return this.w;
    }

    public final void h(o0x o0xVar, o0x o0xVar2, Function1 function1, Function1 function2) {
        o0xVar.getClass();
        this.x.invoke();
        getLoadHelper().c(o0xVar, o0xVar2, new gq00(function1, this, (byte) 4), new gq00(function2, this, (byte) 5));
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        Function1 function1 = this.A;
        if (function1 != null) {
            function1.invoke(drawable);
        }
        super.setImageDrawable(drawable);
    }

    public final void setOnDrawableChangeCallback$uikit(Function1<? super Drawable, Unit> function1) {
        this.A = function1;
    }

    public final void setOnError$uikit(Function1<? super Throwable, Boolean> function1) {
        function1.getClass();
        this.z = function1;
    }

    public final void setOnLoaded$uikit(Function1<? super Drawable, Boolean> function1) {
        function1.getClass();
        this.y = function1;
    }

    public final void setOnLoading$uikit(Function0<Unit> function0) {
        function0.getClass();
        this.x = function0;
    }

    public void setPlaceholder(Drawable drawable) {
        getLoadHelper().c = drawable;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LoadableShapeableImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LoadableShapeableImageView(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
