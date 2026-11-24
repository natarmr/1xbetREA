package org.xplatform.promo.impl.promocodes.presentation.components;

import a.bqd0;
import a.c0;
import a.hny;
import a.vd7;
import a.yum0;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.imageview.ShapeableImageView;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.xbet.client1.R;
import org.xplatform.uikit.components.shimmer.DsShimmerView;
import org.xplatform.uikit.components.views.CustomEndEllipsizeTextView;

/* JADX INFO: loaded from: classes4.dex */
public final class PromoBanner extends FrameLayout {
    public static final /* synthetic */ int b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vd7 f46831a;

    /* JADX WARN: Illegal instructions before constructor call */
    public PromoBanner(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, 0);
        LayoutInflater.from(context).inflate(R.layout.promo_banner_view, this);
        int i2 = R.id.uiKitBannerShapeableImageViewBackground;
        ShapeableImageView shapeableImageView = (ShapeableImageView) yum0.f(this, R.id.uiKitBannerShapeableImageViewBackground);
        if (shapeableImageView != null) {
            i2 = R.id.uiKitBannerShimmerView;
            if (((DsShimmerView) yum0.f(this, R.id.uiKitBannerShimmerView)) != null) {
                i2 = R.id.uiKitPromoBannerData;
                if (((LinearLayout) yum0.f(this, R.id.uiKitPromoBannerData)) != null) {
                    i2 = R.id.uiKitPromoBannerLabelText;
                    AppCompatTextView appCompatTextView = (AppCompatTextView) yum0.f(this, R.id.uiKitPromoBannerLabelText);
                    if (appCompatTextView != null) {
                        i2 = R.id.uiKitPromoBannerValueText;
                        CustomEndEllipsizeTextView customEndEllipsizeTextView = (CustomEndEllipsizeTextView) yum0.f(this, R.id.uiKitPromoBannerValueText);
                        if (customEndEllipsizeTextView != null) {
                            this.f46831a = new vd7(this, shapeableImageView, appCompatTextView, customEndEllipsizeTextView, (byte) 21);
                            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bqd0.f0, 0, 0);
                            String string = typedArrayObtainStyledAttributes.getString(0);
                            setLabel(string == null ? "" : string);
                            String string2 = typedArrayObtainStyledAttributes.getString(2);
                            string2 = string2 == null ? "" : string2;
                            String string3 = typedArrayObtainStyledAttributes.getString(1);
                            a(string2, string3 != null ? string3 : "");
                            setValueVisibility(typedArrayObtainStyledAttributes.getBoolean(3, true));
                            typedArrayObtainStyledAttributes.recycle();
                            shapeableImageView.setScaleX(shapeableImageView.getContext().getResources().getConfiguration().getLayoutDirection() == 1 ? -1.0f : 1.0f);
                            return;
                        }
                    }
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    public final void a(String str, String str2) {
        str.getClass();
        vd7 vd7Var = this.f46831a;
        ((CustomEndEllipsizeTextView) vd7Var.d).setText(String.format("%s %s", Arrays.copyOf(new Object[]{str, str2}, 2)));
        ((CustomEndEllipsizeTextView) vd7Var.d).setEllipsisValue("... ".concat(str2));
    }

    public final void setLabel(String str) {
        str.getClass();
        ((AppCompatTextView) this.f46831a.c).setText(str);
    }

    public final void setOnClickListener(Function0<Unit> function0) {
        function0.getClass();
        ((PromoBanner) this.f46831a.b).setOnClickListener(new c0(function0, (byte) 12));
    }

    public final void setValueVisibility(boolean z) {
        ((CustomEndEllipsizeTextView) this.f46831a.d).setVisibility(z ? 0 : 8);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PromoBanner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PromoBanner(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
