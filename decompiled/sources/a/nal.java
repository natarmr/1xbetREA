package a;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class nal extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f23196a;
    public final int b;
    public final s1g c;
    public final float d;
    public final float e;
    public mal f;
    public StaticLayout g;
    public final TextPaint h;
    public float i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nal(Context context) {
        super(context, null, 0);
        context.getClass();
        this.f23196a = getResources().getDimensionPixelSize(R.dimen.space_4);
        this.b = getResources().getDimensionPixelSize(R.dimen.space_6);
        float dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.text_8);
        this.c = new s1g(this, R.color.static_black_40);
        this.d = getResources().getDimension(R.dimen.corner_radius_8);
        this.e = getResources().getDimension(R.dimen.corner_radius_16);
        TextPaint textPaint = new TextPaint();
        r7x.r(textPaint, context, R.style.TextStyle_Caption_Medium_S);
        textPaint.setAntiAlias(true);
        TypedValue typedValue = j5d.f15927a;
        textPaint.setColor(context.getColor(R.color.static_white));
        textPaint.setTextSize(dimensionPixelSize);
        this.h = textPaint;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.getClass();
        this.c.a(canvas);
        super.onDraw(canvas);
        canvas.save();
        canvas.translate(0.0f, this.i);
        StaticLayout staticLayout = this.g;
        if (staticLayout != null) {
            staticLayout.draw(canvas);
        }
        canvas.restore();
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.c.b(0, 0, getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        mal malVar = this.f;
        this.g = xdx.I(malVar != null ? malVar.f21462a : "", this.h, getMeasuredWidth(), 2, TextUtils.TruncateAt.END, 0, Layout.Alignment.ALIGN_CENTER, 1264);
        int measuredHeight = getMeasuredHeight();
        StaticLayout staticLayout = this.g;
        this.i = (measuredHeight - (staticLayout != null ? staticLayout.getHeight() : 0)) / 2;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void setTitleItem(mal malVar) {
        malVar.getClass();
        if (Intrinsics.d(this.f, malVar)) {
            return;
        }
        b9b b9bVar = b9b.f2200a;
        float f = b9bVar.equals(b9bVar) ? this.e : this.d;
        boolean zEquals = b9bVar.equals(b9bVar);
        int i = this.b;
        if (!zEquals && !b9bVar.equals(c9b.f3954a)) {
            t9f.b();
            return;
        }
        setPadding(i, i, i, i);
        this.c.c(f);
        requestLayout();
        this.f = malVar;
    }
}
