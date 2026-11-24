package org.xplatform.cyber.game.core.presentation.dota.banpick.view;

import a.a8z;
import a.e3j;
import a.hxm0;
import a.maz;
import a.u0d;
import a.wez;
import a.yg3;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.javax.sip.message.Response;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.imageview.ShapeableImageView;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.xbet.client1.R;
import org.xplatform.cyber.game.core.presentation.dota.banpick.view.DotaBanPickHeroItemView;

/* JADX INFO: loaded from: classes4.dex */
public final class DotaBanPickHeroItemView extends FrameLayout {
    public static final /* synthetic */ int l = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f46508a;
    public final int b;
    public final int c;
    public final int d;
    public final float e;
    public final int f;
    public final int g;
    public final a8z h;
    public final a8z i;
    public final a8z j;
    public final a8z k;

    /* JADX WARN: Illegal instructions before constructor call */
    public DotaBanPickHeroItemView(final Context context, AttributeSet attributeSet, int i) {
        final byte b = 2;
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        final byte b2 = 0;
        super(context, attributeSet, 0);
        this.f46508a = getResources().getDimensionPixelSize(R.dimen.space_4);
        this.b = getResources().getDimensionPixelSize(R.dimen.space_2);
        this.c = getResources().getDimensionPixelSize(R.dimen.space_2);
        this.d = getResources().getDimensionPixelSize(R.dimen.space_1);
        this.e = getResources().getDimension(R.dimen.text_8);
        this.f = getResources().getDimensionPixelOffset(R.dimen.size_32);
        this.g = getResources().getDimensionPixelOffset(R.dimen.size_56);
        wez wezVar = wez.b;
        this.h = maz.a(wezVar, new Function0() { // from class: a.a2l
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b3 = b2;
                DotaBanPickHeroItemView dotaBanPickHeroItemView = this;
                Context context2 = context;
                switch (b3) {
                    case 0:
                        int i2 = DotaBanPickHeroItemView.l;
                        TextView textView = new TextView(context2);
                        textView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
                        textView.setTextColor(context2.getColor(R.color.static_white));
                        textView.setGravity(17);
                        textView.setIncludeFontPadding(false);
                        int i3 = dotaBanPickHeroItemView.c;
                        int i4 = dotaBanPickHeroItemView.d;
                        textView.setPadding(i3, i4, i3, i4);
                        textView.setTextSize(0, dotaBanPickHeroItemView.e);
                        textView.setBackgroundResource(R.drawable.dota_ban_pick_number_bg);
                        textView.setTag("PickNumberTextView");
                        return textView;
                    case 1:
                        int i5 = DotaBanPickHeroItemView.l;
                        ShapeableImageView shapeableImageView = new ShapeableImageView(new tje(context2, R.style.DotaBanPickHeroLogoStyle));
                        shapeableImageView.setLayoutParams(new FrameLayout.LayoutParams(dotaBanPickHeroItemView.g, dotaBanPickHeroItemView.f));
                        shapeableImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                        shapeableImageView.setTag("HeroLogoImageView");
                        return shapeableImageView;
                    default:
                        int i6 = DotaBanPickHeroItemView.l;
                        ShapeableImageView shapeableImageView2 = new ShapeableImageView(new tje(context2, R.style.DotaBanPickHeroLogoStyle));
                        shapeableImageView2.setLayoutParams(new FrameLayout.LayoutParams(dotaBanPickHeroItemView.g, dotaBanPickHeroItemView.f));
                        shapeableImageView2.setBackground(sj3.U(R.drawable.dota_ban_pick_hero_item_gradien_bg, context2));
                        return shapeableImageView2;
                }
            }
        });
        this.i = maz.a(wezVar, new yg3(context, (byte) 23));
        final byte b3 = 1;
        this.j = maz.a(wezVar, new Function0() { // from class: a.a2l
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b4 = b3;
                DotaBanPickHeroItemView dotaBanPickHeroItemView = this;
                Context context2 = context;
                switch (b4) {
                    case 0:
                        int i2 = DotaBanPickHeroItemView.l;
                        TextView textView = new TextView(context2);
                        textView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
                        textView.setTextColor(context2.getColor(R.color.static_white));
                        textView.setGravity(17);
                        textView.setIncludeFontPadding(false);
                        int i3 = dotaBanPickHeroItemView.c;
                        int i4 = dotaBanPickHeroItemView.d;
                        textView.setPadding(i3, i4, i3, i4);
                        textView.setTextSize(0, dotaBanPickHeroItemView.e);
                        textView.setBackgroundResource(R.drawable.dota_ban_pick_number_bg);
                        textView.setTag("PickNumberTextView");
                        return textView;
                    case 1:
                        int i5 = DotaBanPickHeroItemView.l;
                        ShapeableImageView shapeableImageView = new ShapeableImageView(new tje(context2, R.style.DotaBanPickHeroLogoStyle));
                        shapeableImageView.setLayoutParams(new FrameLayout.LayoutParams(dotaBanPickHeroItemView.g, dotaBanPickHeroItemView.f));
                        shapeableImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                        shapeableImageView.setTag("HeroLogoImageView");
                        return shapeableImageView;
                    default:
                        int i6 = DotaBanPickHeroItemView.l;
                        ShapeableImageView shapeableImageView2 = new ShapeableImageView(new tje(context2, R.style.DotaBanPickHeroLogoStyle));
                        shapeableImageView2.setLayoutParams(new FrameLayout.LayoutParams(dotaBanPickHeroItemView.g, dotaBanPickHeroItemView.f));
                        shapeableImageView2.setBackground(sj3.U(R.drawable.dota_ban_pick_hero_item_gradien_bg, context2));
                        return shapeableImageView2;
                }
            }
        });
        this.k = maz.a(wezVar, new Function0() { // from class: a.a2l
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b4 = b;
                DotaBanPickHeroItemView dotaBanPickHeroItemView = this;
                Context context2 = context;
                switch (b4) {
                    case 0:
                        int i2 = DotaBanPickHeroItemView.l;
                        TextView textView = new TextView(context2);
                        textView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
                        textView.setTextColor(context2.getColor(R.color.static_white));
                        textView.setGravity(17);
                        textView.setIncludeFontPadding(false);
                        int i3 = dotaBanPickHeroItemView.c;
                        int i4 = dotaBanPickHeroItemView.d;
                        textView.setPadding(i3, i4, i3, i4);
                        textView.setTextSize(0, dotaBanPickHeroItemView.e);
                        textView.setBackgroundResource(R.drawable.dota_ban_pick_number_bg);
                        textView.setTag("PickNumberTextView");
                        return textView;
                    case 1:
                        int i5 = DotaBanPickHeroItemView.l;
                        ShapeableImageView shapeableImageView = new ShapeableImageView(new tje(context2, R.style.DotaBanPickHeroLogoStyle));
                        shapeableImageView.setLayoutParams(new FrameLayout.LayoutParams(dotaBanPickHeroItemView.g, dotaBanPickHeroItemView.f));
                        shapeableImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                        shapeableImageView.setTag("HeroLogoImageView");
                        return shapeableImageView;
                    default:
                        int i6 = DotaBanPickHeroItemView.l;
                        ShapeableImageView shapeableImageView2 = new ShapeableImageView(new tje(context2, R.style.DotaBanPickHeroLogoStyle));
                        shapeableImageView2.setLayoutParams(new FrameLayout.LayoutParams(dotaBanPickHeroItemView.g, dotaBanPickHeroItemView.f));
                        shapeableImageView2.setBackground(sj3.U(R.drawable.dota_ban_pick_hero_item_gradien_bg, context2));
                        return shapeableImageView2;
                }
            }
        });
    }

    public static final Unit c(DotaBanPickHeroItemView dotaBanPickHeroItemView, Drawable drawable) {
        dotaBanPickHeroItemView.getHeroLogoImageView().setImageDrawable(drawable);
        if (dotaBanPickHeroItemView.getHeroLogoGradientImageView().getParent() == null) {
            dotaBanPickHeroItemView.addView(dotaBanPickHeroItemView.getHeroLogoGradientImageView());
        }
        if (dotaBanPickHeroItemView.getPickNumberTextView().getParent() == null) {
            dotaBanPickHeroItemView.addView(dotaBanPickHeroItemView.getPickNumberTextView());
        }
        if (dotaBanPickHeroItemView.getPickLabelImageView().getParent() == null) {
            dotaBanPickHeroItemView.addView(dotaBanPickHeroItemView.getPickLabelImageView());
        }
        return Unit.f46060a;
    }

    private final ShapeableImageView getHeroLogoGradientImageView() {
        return (ShapeableImageView) this.k.getValue();
    }

    private final ShapeableImageView getHeroLogoImageView() {
        return (ShapeableImageView) this.j.getValue();
    }

    private final ImageView getPickLabelImageView() {
        return (ImageView) this.i.getValue();
    }

    private final TextView getPickNumberTextView() {
        return (TextView) this.h.getValue();
    }

    public final void a() {
        List list = u0d.f34849a;
        u0d.a(getHeroLogoImageView());
        removeView(getHeroLogoGradientImageView());
        removeView(getPickNumberTextView());
        removeView(getPickLabelImageView());
    }

    public final void b(int i, String str) {
        if (getHeroLogoImageView().getParent() == null) {
            addView(getHeroLogoImageView());
        }
        if (str.length() > 0) {
            List list = u0d.f34849a;
            u0d.j(getHeroLogoImageView(), str, i, 0, null, new e3j(this, (byte) 25), null, Response.ALTERNATIVE_SERVICE);
        } else {
            ShapeableImageView heroLogoImageView = getHeroLogoImageView();
            Context context = getContext();
            context.getClass();
            heroLogoImageView.setImageDrawable(context.getDrawable(i));
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (getPickNumberTextView().getParent() != null) {
            int width = getWidth() - getPickNumberTextView().getWidth();
            int i5 = this.f46508a;
            int i6 = width - i5;
            getPickNumberTextView().layout(i6, i5, getPickNumberTextView().getWidth() + i6, getPickNumberTextView().getHeight() + i5);
        }
        if (getPickLabelImageView().getParent() != null) {
            int width2 = (getWidth() / 2) - (getPickLabelImageView().getWidth() / 2);
            int height = ((getHeight() - getPickLabelImageView().getHeight()) - this.b) - this.d;
            getPickLabelImageView().layout(width2, height, getPickLabelImageView().getWidth() + width2, getPickLabelImageView().getHeight() + height);
        }
    }

    public final void setPickLabel(boolean z) {
        if (z) {
            hxm0.B(getHeroLogoImageView());
            getPickLabelImageView().setImageResource(R.drawable.dota_ban_ic);
        } else {
            getHeroLogoImageView().setColorFilter((ColorFilter) null);
            getPickLabelImageView().setImageResource(R.drawable.dota_pick_ic);
        }
    }

    public final void setPickNumber(String str) {
        str.getClass();
        getPickNumberTextView().setText(str);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DotaBanPickHeroItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DotaBanPickHeroItemView(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
