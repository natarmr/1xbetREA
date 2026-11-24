package org.xplatform.uikit_web_games.top_games_collection;

import a.aem0;
import a.cem0;
import a.dqd0;
import a.g5s;
import a.jmu0;
import a.lmc;
import a.m5d;
import a.o4s;
import a.pmk0;
import a.xdr;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;
import org.xbet.client1.R;
import org.xplatform.uikit.components.shimmer.DsShimmerView;
import org.xplatform.uikit_web_games.game_collection.WebGamesGameCollection;

/* JADX INFO: loaded from: classes6.dex */
public final class WebGamesTopGamesCollection extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f47308a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final AppCompatTextView h;
    public final WebGamesGameCollection i;
    public final ImageView j;
    public final DsShimmerView k;
    public final View l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebGamesTopGamesCollection(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.space_8);
        this.f47308a = dimensionPixelSize;
        this.b = getResources().getDimensionPixelSize(R.dimen.space_16);
        this.c = getResources().getDimensionPixelSize(R.dimen.space_96);
        this.d = getResources().getDimensionPixelSize(R.dimen.size_40);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.size_128);
        this.e = dimensionPixelSize2;
        int dimensionPixelSize3 = getResources().getDimensionPixelSize(R.dimen.radius_24);
        this.f = View.MeasureSpec.makeMeasureSpec(dimensionPixelSize2, 1073741824);
        this.g = getResources().getDimensionPixelSize(R.dimen.one_x_games_top_games_collection_skeleton_height);
        g5s g5sVar = g5s.Rectangle;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        cem0.n(R.style.TextStyle_Title_Bold_M_StaticWhite, appCompatTextView);
        appCompatTextView.setLines(1);
        aem0.r(appCompatTextView, 10, 20, 10, 1);
        appCompatTextView.setGravity(16);
        appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
        appCompatTextView.setTextDirection(5);
        this.h = appCompatTextView;
        WebGamesGameCollection webGamesGameCollection = new WebGamesGameCollection(context, null, 6);
        this.i = webGamesGameCollection;
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setVisibility(8);
        this.j = imageView;
        DsShimmerView dsShimmerView = new DsShimmerView(context, null, 6);
        dsShimmerView.setVisibility(8);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(ColorStateList.valueOf(m5d.b(R.attr.uikitSecondary20, context)));
        dsShimmerView.setBackground(gradientDrawable);
        this.k = dsShimmerView;
        View view = new View(context);
        this.l = view;
        jmu0.i(this, dimensionPixelSize3);
        addView(view);
        addView(imageView);
        addView(appCompatTextView);
        addView(webGamesGameCollection);
        addView(dsShimmerView);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, dqd0.c, 0, 0);
        setTitle(typedArrayObtainStyledAttributes.getString(2));
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        setBackgroundPictureResource(resourceId);
        webGamesGameCollection.setAdapter(new o4s(g5sVar, lmc.G(context, g5sVar, 0, resourceId == 0 ? R.drawable.ic_games_placeholder : resourceId), null));
        typedArrayObtainStyledAttributes.recycle();
        webGamesGameCollection.m(new pmk0(0, 0, 0, 0, dimensionPixelSize, 0, 192));
    }

    public final WebGamesGameCollection getGameCollection() {
        return this.i;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.l.layout(0, 0, getMeasuredWidth(), getMeasuredHeight());
        this.k.layout(0, 0, getMeasuredWidth(), getMeasuredHeight());
        int measuredWidth = getMeasuredWidth() - this.c;
        AppCompatTextView appCompatTextView = this.h;
        jmu0.f(this.b, this.f47308a, measuredWidth, appCompatTextView.getMeasuredHeight() + this.f47308a, appCompatTextView, this);
        jmu0.f(getMeasuredWidth() - this.e, 0, getMeasuredWidth(), this.e, this.j, this);
        WebGamesGameCollection webGamesGameCollection = this.i;
        jmu0.f(0, this.d, webGamesGameCollection.getMeasuredWidth(), webGamesGameCollection.getMeasuredHeight() + this.d, webGamesGameCollection, this);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int i3 = this.g;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        this.k.measure(i, iMakeMeasureSpec);
        this.l.measure(i, iMakeMeasureSpec);
        this.h.measure(View.MeasureSpec.makeMeasureSpec((size - this.b) - this.c, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        this.i.measure(i, i2);
        ImageView imageView = this.j;
        int i4 = this.f;
        imageView.measure(i4, i4);
        setMeasuredDimension(size, i3);
    }

    public final void setBackgroundPictureResource(int i) {
        ImageView imageView = this.j;
        imageView.setImageResource(i);
        imageView.setVisibility(i != 0 ? 0 : 8);
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        this.l.setBackgroundResource(i);
    }

    public final void setOnItemClickListener(xdr xdrVar) {
        xdrVar.getClass();
        this.i.setOnItemClickListener(xdrVar);
    }

    public final void setTitle(CharSequence charSequence) {
        this.h.setText(charSequence);
    }

    public final void setTitleColor(int i) {
        this.h.setTextColor(getContext().getColor(i));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WebGamesTopGamesCollection(Context context) {
        this(context, null);
        context.getClass();
    }
}
