package a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.xbet.client1.R;
import org.xplatform.uikit.components.badges.DsBadge;
import org.xplatform.uikit.components.counter.DsCounter;

/* JADX INFO: loaded from: classes6.dex */
public final class ukm extends FrameLayout implements xoe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f35834a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public ic50 f;
    public final AppCompatImageView g;
    public final if5 h;
    public final yoe i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ukm(Context context) {
        super(context, null, 0);
        context.getClass();
        this.f35834a = "generate";
        this.b = getResources().getDimensionPixelSize(R.dimen.size_24);
        this.c = getResources().getDimensionPixelSize(R.dimen.size_48);
        this.d = getResources().getDimensionPixelSize(R.dimen.space_4);
        this.e = getResources().getDimensionPixelSize(R.dimen.space_6);
        getResources().getDimensionPixelSize(R.dimen.space_4);
        ic50 ic50Var = ic50.b;
        this.f = ic50Var;
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setId(View.generateViewId());
        appCompatImageView.setBackground(null);
        this.g = appCompatImageView;
        this.h = new if5(appCompatImageView, null);
        yoe yoeVar = new yoe(appCompatImageView, null);
        this.i = yoeVar;
        yoeVar.b(null, 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, bqd0.F, 0, 0);
        int i = typedArrayObtainStyledAttributes.getInt(2, 1);
        if (i == 0) {
            ic50Var = ic50.f14520a;
        } else if (i != 1 && i == 2) {
            ic50Var = ic50.c;
        }
        this.f = ic50Var;
        setNavigationBarButtonAlpha(typedArrayObtainStyledAttributes.getBoolean(3, false));
        a();
        setNavigationBarButtonImageResource(typedArrayObtainStyledAttributes.getResourceId(1, R.drawable.ic_glyph_favourite_active));
        setNavigationBarButtonTint(ktt0.m(0, context, typedArrayObtainStyledAttributes));
        typedArrayObtainStyledAttributes.recycle();
        addView(appCompatImageView);
        setTag("DsNavigationBarButton");
    }

    public final void a() {
        ColorStateList colorStateListValueOf;
        int iOrdinal = this.f.ordinal();
        if (iOrdinal == 0) {
            Context context = getContext();
            context.getClass();
            colorStateListValueOf = ColorStateList.valueOf(m5d.b(R.attr.uikitStaticWhite, context));
        } else if (iOrdinal == 1) {
            Context context2 = getContext();
            context2.getClass();
            colorStateListValueOf = ColorStateList.valueOf(m5d.b(R.attr.uikitPrimary, context2));
        } else if (iOrdinal != 2) {
            t9f.b();
            return;
        } else {
            Context context3 = getContext();
            context3.getClass();
            colorStateListValueOf = ColorStateList.valueOf(m5d.b(R.attr.uikitSecondary, context3));
        }
        this.g.setImageTintList(colorStateListValueOf);
    }

    public final String getButtonIconId() {
        return this.f35834a;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = this.c;
        int i6 = this.b;
        int i7 = (i5 - i6) / 2;
        int i8 = (i5 - i6) / 2;
        this.g.layout(i7, i8, i7 + i6, i6 + i8);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3 = this.b;
        this.g.measure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(i3, 1073741824));
        int i4 = this.c;
        setMeasuredDimension(View.MeasureSpec.getSize(i4), View.MeasureSpec.getSize(i4));
    }

    public void setBadgeBackgroundTint(int i) {
        this.h.j(i);
    }

    public void setBadgeVisible(boolean z) {
        DsBadge dsBadge = this.h.c;
        if (dsBadge != null) {
            dsBadge.setVisibility(z ? 0 : 8);
        }
    }

    public final void setButtonIconId(String str) {
        str.getClass();
        this.f35834a = str;
    }

    @Override // a.xoe
    public void setCount(Integer num) {
        this.i.e(num, this.e, this.d);
    }

    public final void setCounterStyle(r0m r0mVar) {
        r0mVar.getClass();
        yoe yoeVar = this.i;
        yoeVar.getClass();
        yoeVar.d = r0mVar;
    }

    public final void setCounterVisible(boolean z) {
        DsCounter dsCounter = this.i.c;
        if (dsCounter != null) {
            dsCounter.setVisibility(z ? 0 : 8);
        }
    }

    public final void setNavigationBarButtonAlpha(boolean z) {
        if (this.f == ic50.f14520a) {
            return;
        }
        this.g.setAlpha(z ? 0.5f : 1.0f);
    }

    public final void setNavigationBarButtonClickable(boolean z) {
        this.g.setClickable(z);
    }

    public final void setNavigationBarButtonEnable(boolean z) {
        this.g.setEnabled(z);
    }

    public final void setNavigationBarButtonImageDrawable(Drawable drawable) {
        this.g.setImageDrawable(drawable);
        requestLayout();
    }

    public final void setNavigationBarButtonImageResource(int i) {
        this.g.setImageResource(i);
        requestLayout();
    }

    public final void setNavigationBarButtonStyle(ic50 ic50Var) {
        ic50Var.getClass();
        this.f = ic50Var;
        a();
        requestLayout();
    }

    public final void setNavigationBarButtonTint(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.g.setImageTintList(colorStateList);
        }
    }

    public final void setOnNavigationBarButtonClickListener(Function0<Unit> function0) {
        function0.getClass();
        this.g.setOnClickListener(new c0(function0, (byte) 3));
    }
}
