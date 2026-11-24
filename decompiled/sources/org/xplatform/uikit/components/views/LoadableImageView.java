package org.xplatform.uikit.components.views;

import a.enm;
import a.eq00;
import a.maz;
import a.n0o0;
import a.o0x;
import a.r0x;
import a.rcz;
import a.w800;
import a.x800;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public class LoadableImageView extends AppCompatImageView {
    public static final /* synthetic */ int i = 0;
    public final n0o0 d;
    public final Drawable e;
    public Function0 f;
    public Function1 g;
    public Function1 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoadableImageView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        context.getClass();
        this.d = maz.b(new rcz(this, (byte) 26));
        this.e = getLoadHelper().c;
        this.f = new x800((byte) 12);
        this.g = new w800((byte) 16);
        this.h = new w800((byte) 15);
        getLoadHelper().e(attributeSet, i2);
    }

    public static void g(LoadableImageView loadableImageView, String str, int i2) {
        w800 w800Var = new w800((byte) 18);
        w800 w800Var2 = new w800((byte) 15);
        loadableImageView.getClass();
        loadableImageView.f.invoke();
        loadableImageView.getLoadHelper().f(str, i2, new eq00((Function1) w800Var, loadableImageView, (byte) 1), new eq00(loadableImageView, (Function1) w800Var2, (byte) 2));
    }

    private final r0x getLoadHelper() {
        return (r0x) this.d.getValue();
    }

    public static void h(LoadableImageView loadableImageView, String str, Drawable drawable, int i2) {
        if ((i2 & 2) != 0) {
            drawable = loadableImageView.e;
        }
        Drawable drawable2 = drawable;
        w800 w800Var = new w800((byte) 13);
        w800 w800Var2 = new w800((byte) 15);
        loadableImageView.getClass();
        str.getClass();
        loadableImageView.f.invoke();
        r0x.g(loadableImageView.getLoadHelper(), str, drawable2, new eq00((Function1) w800Var, loadableImageView, (byte) 8), new eq00((Function1) w800Var2, loadableImageView, (byte) 0), 4);
    }

    public static void i(LoadableImageView loadableImageView, String str, Drawable drawable, Function1 function1, Function1 function2) {
        w800 w800Var = new w800((byte) 14);
        loadableImageView.getClass();
        loadableImageView.f.invoke();
        r0x.g(loadableImageView.getLoadHelper(), str, drawable, new eq00(loadableImageView, function1, (byte) 3), new enm((Object) loadableImageView, (Object) drawable, function2, (Function1) w800Var, (byte) 19), 4);
    }

    public static final void l(LoadableImageView loadableImageView, Drawable drawable, Function1 function1, Function1 function2) {
        r0x.g(loadableImageView.getLoadHelper(), "", drawable, new eq00(loadableImageView, function1, (byte) 4), new eq00(loadableImageView, function2, (byte) 5), 4);
    }

    public final void a(o0x o0xVar, o0x o0xVar2, Function1 function1, Function1 function2) {
        o0xVar.getClass();
        this.f.invoke();
        getLoadHelper().c(o0xVar, o0xVar2, new eq00(function1, this, (byte) 6), new eq00(function2, this, (byte) 7));
    }

    public final Function1<Throwable, Boolean> getOnError$uikit() {
        return this.h;
    }

    public final Function1<Drawable, Boolean> getOnLoaded$uikit() {
        return this.g;
    }

    public final Function0<Unit> getOnLoading$uikit() {
        return this.f;
    }

    public final Drawable getPlaceholder() {
        return this.e;
    }

    public final void setOnError$uikit(Function1<? super Throwable, Boolean> function1) {
        function1.getClass();
        this.h = function1;
    }

    public final void setOnLoaded$uikit(Function1<? super Drawable, Boolean> function1) {
        function1.getClass();
        this.g = function1;
    }

    public final void setOnLoading$uikit(Function0<Unit> function0) {
        function0.getClass();
        this.f = function0;
    }

    public final void setPlaceholder(Drawable drawable) {
        getLoadHelper().c = drawable;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LoadableImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LoadableImageView(Context context) {
        this(context, null, 6, 0);
        context.getClass();
    }

    public /* synthetic */ LoadableImageView(Context context, AttributeSet attributeSet, int i2, int i3) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, 0);
    }
}
