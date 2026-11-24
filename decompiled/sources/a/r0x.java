package a;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.gov.nist.core.Separators;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
public final class r0x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageView f29650a;
    public ColorStateList b;
    public Drawable c;

    public r0x(ImageView imageView) {
        imageView.getClass();
        this.f29650a = imageView;
    }

    public static String b(String str) {
        if (!kotlin.text.c.x(str, "http", false)) {
            return str;
        }
        try {
            String strSubstring = str.substring(StringsKt.V(str, "//", 0, false, 6) + 2);
            return strSubstring.substring(StringsKt.V(strSubstring, Separators.SLASH, 0, false, 6));
        } catch (Exception unused) {
            return str;
        }
    }

    public static /* synthetic */ void d(r0x r0xVar, o0x o0xVar, m0x m0xVar, Function1 function1, int i) {
        if ((i & 4) != 0) {
            function1 = new h7w((byte) 18);
        }
        r0xVar.c(o0xVar, m0xVar, function1, new ljc0((byte) 14));
    }

    public static void g(r0x r0xVar, String str, Drawable drawable, Function1 function1, Function1 function2, int i) {
        iun iunVar = iun.f15405a;
        if ((i & 8) != 0) {
            function1 = new h7w((byte) 20);
        }
        Function1 function3 = function1;
        if ((i & 16) != 0) {
            function2 = new ljc0((byte) 14);
        }
        r0xVar.getClass();
        str.getClass();
        iunVar.getClass();
        h(r0xVar.f29650a, new bg0(r0xVar, str, drawable, iunVar, function2, function3));
    }

    public static void h(View view, Function1 function1) {
        Context context = view.getContext();
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (activity == null || !activity.isDestroyed()) {
            Context applicationContext = view.getContext().getApplicationContext();
            applicationContext.getClass();
            function1.invoke(applicationContext);
        }
    }

    public final void a(o0x o0xVar) {
        ColorFilter colorFilterJ;
        o0xVar.getClass();
        Integer numB = o0xVar.b();
        if (numB != null) {
            int iIntValue = numB.intValue();
            bzw bzwVarD = o0xVar.d();
            if (bzwVarD == null) {
                bzwVarD = bzw.f3493a;
            }
            colorFilterJ = dwi0.J(iIntValue, n78.valueOf(bzwVarD.name()));
        } else {
            colorFilterJ = null;
        }
        this.f29650a.setColorFilter(colorFilterJ);
    }

    public final void c(o0x o0xVar, o0x o0xVar2, Function1 function1, Function1 function2) {
        o0xVar.getClass();
        function1.getClass();
        h(this.f29650a, new dg(this, o0xVar, o0xVar2, function2, function1, (byte) 21));
    }

    public final void e(AttributeSet attributeSet, int i) {
        ImageView imageView = this.f29650a;
        Context context = imageView.getContext();
        context.getClass();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bqd0.w, i, 0);
        Context context2 = imageView.getContext();
        context2.getClass();
        this.b = ktt0.m(18, context2, typedArrayObtainStyledAttributes);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(17);
        if (drawable != null) {
            drawable.mutate();
            drawable.setTintList(this.b);
        } else {
            drawable = null;
        }
        this.c = drawable;
        Context context3 = imageView.getContext();
        context3.getClass();
        String strP = ktt0.p(typedArrayObtainStyledAttributes, context3, 40);
        if (strP != null) {
            g(this, strP.toString(), this.c, null, null, 28);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void f(String str, int i, Function1 function1, Function1 function2) {
        Object g0g0Var;
        try {
            e0g0 e0g0Var = j0g0.b;
            g0g0Var = this.f29650a.getContext().getDrawable(i);
        } catch (Throwable th) {
            e0g0 e0g0Var2 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        if (j0g0.a(g0g0Var) != null) {
            g0g0Var = this.c;
        }
        g(this, str, (Drawable) g0g0Var, function1, function2, 4);
    }
}
