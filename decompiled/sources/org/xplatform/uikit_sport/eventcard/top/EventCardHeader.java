package org.xplatform.uikit_sport.eventcard.top;

import a.a8z;
import a.cqd0;
import a.f1t0;
import a.ktt0;
import a.lbo;
import a.maz;
import a.mmn;
import a.q3d;
import a.r7x;
import a.ryl;
import a.wez;
import a.xdx;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.button.MaterialButton;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.uikit.components.views.LoadableImageView;
import org.xplatform.uikit_sport.eventcard.top.EventCardHeader;

/* JADX INFO: loaded from: classes4.dex */
public final class EventCardHeader extends FrameLayout implements lbo {
    public static final /* synthetic */ int A = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a8z f47292a;
    public final a8z b;
    public final a8z c;
    public final a8z d;
    public final a8z e;
    public final a8z f;
    public final a8z g;
    public final TextPaint h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public final int n;
    public final int o;
    public final int p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public CharSequence x;
    public StaticLayout y;
    public float z;

    /* JADX WARN: Illegal instructions before constructor call */
    public EventCardHeader(final Context context, AttributeSet attributeSet, int i) {
        final byte b = 2;
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, R.attr.eventCardHeaderStyle);
        wez wezVar = wez.b;
        final byte b2 = 0;
        this.f47292a = maz.a(wezVar, new Function0() { // from class: a.wao
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b3 = b2;
                AttributeSet attributeSet2 = null;
                EventCardHeader eventCardHeader = this;
                Context context2 = context;
                switch (b3) {
                    case 0:
                        int i2 = EventCardHeader.A;
                        ImageView imageView = new ImageView(context2);
                        imageView.setId(jmu0.d());
                        int i3 = eventCardHeader.n;
                        imageView.setLayoutParams(new FrameLayout.LayoutParams(i3, i3));
                        imageView.setImageResource(R.drawable.ic_glyph_popular_red);
                        return imageView;
                    case 1:
                        int i4 = EventCardHeader.A;
                        LoadableImageView loadableImageView = new LoadableImageView(context2, attributeSet2, 6, 0);
                        loadableImageView.setId(jmu0.d());
                        int i5 = eventCardHeader.n;
                        loadableImageView.setLayoutParams(new FrameLayout.LayoutParams(i5, i5));
                        loadableImageView.setImageTintList(ColorStateList.valueOf(m5d.b(R.attr.uikitSecondary, context2)));
                        return loadableImageView;
                    case 2:
                        int i6 = EventCardHeader.A;
                        MaterialButton materialButton = new MaterialButton(context2, null, R.attr.eventCardHeaderButtonStyle);
                        materialButton.setId(jmu0.d());
                        int i7 = eventCardHeader.p;
                        materialButton.setLayoutParams(new FrameLayout.LayoutParams(i7, i7));
                        materialButton.setIconResource(R.drawable.ic_glyph_broadcast);
                        return materialButton;
                    case 3:
                        int i8 = EventCardHeader.A;
                        MaterialButton materialButton2 = new MaterialButton(context2, null, R.attr.eventCardHeaderButtonStyle);
                        materialButton2.setId(R.id.stream_button_uitest);
                        int i9 = eventCardHeader.p;
                        materialButton2.setLayoutParams(new FrameLayout.LayoutParams(i9, i9));
                        materialButton2.setIconResource(R.drawable.ic_glyph_video_zone);
                        return materialButton2;
                    case 4:
                        int i10 = EventCardHeader.A;
                        MaterialButton materialButton3 = new MaterialButton(context2, null, R.attr.eventCardHeaderButtonStyle);
                        materialButton3.setId(jmu0.d());
                        int i11 = eventCardHeader.p;
                        materialButton3.setLayoutParams(new FrameLayout.LayoutParams(i11, i11));
                        materialButton3.setIconResource(R.drawable.uikit_selector_notifications);
                        return materialButton3;
                    default:
                        int i12 = EventCardHeader.A;
                        MaterialButton materialButton4 = new MaterialButton(context2, null, R.attr.eventCardHeaderButtonStyle);
                        materialButton4.setId(jmu0.d());
                        int i13 = eventCardHeader.p;
                        materialButton4.setLayoutParams(new FrameLayout.LayoutParams(i13, i13));
                        materialButton4.setIconResource(R.drawable.uikit_selector_favorites);
                        return materialButton4;
                }
            }
        });
        final byte b3 = 1;
        this.b = maz.a(wezVar, new Function0() { // from class: a.wao
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b4 = b3;
                AttributeSet attributeSet2 = null;
                EventCardHeader eventCardHeader = this;
                Context context2 = context;
                switch (b4) {
                    case 0:
                        int i2 = EventCardHeader.A;
                        ImageView imageView = new ImageView(context2);
                        imageView.setId(jmu0.d());
                        int i3 = eventCardHeader.n;
                        imageView.setLayoutParams(new FrameLayout.LayoutParams(i3, i3));
                        imageView.setImageResource(R.drawable.ic_glyph_popular_red);
                        return imageView;
                    case 1:
                        int i4 = EventCardHeader.A;
                        LoadableImageView loadableImageView = new LoadableImageView(context2, attributeSet2, 6, 0);
                        loadableImageView.setId(jmu0.d());
                        int i5 = eventCardHeader.n;
                        loadableImageView.setLayoutParams(new FrameLayout.LayoutParams(i5, i5));
                        loadableImageView.setImageTintList(ColorStateList.valueOf(m5d.b(R.attr.uikitSecondary, context2)));
                        return loadableImageView;
                    case 2:
                        int i6 = EventCardHeader.A;
                        MaterialButton materialButton = new MaterialButton(context2, null, R.attr.eventCardHeaderButtonStyle);
                        materialButton.setId(jmu0.d());
                        int i7 = eventCardHeader.p;
                        materialButton.setLayoutParams(new FrameLayout.LayoutParams(i7, i7));
                        materialButton.setIconResource(R.drawable.ic_glyph_broadcast);
                        return materialButton;
                    case 3:
                        int i8 = EventCardHeader.A;
                        MaterialButton materialButton2 = new MaterialButton(context2, null, R.attr.eventCardHeaderButtonStyle);
                        materialButton2.setId(R.id.stream_button_uitest);
                        int i9 = eventCardHeader.p;
                        materialButton2.setLayoutParams(new FrameLayout.LayoutParams(i9, i9));
                        materialButton2.setIconResource(R.drawable.ic_glyph_video_zone);
                        return materialButton2;
                    case 4:
                        int i10 = EventCardHeader.A;
                        MaterialButton materialButton3 = new MaterialButton(context2, null, R.attr.eventCardHeaderButtonStyle);
                        materialButton3.setId(jmu0.d());
                        int i11 = eventCardHeader.p;
                        materialButton3.setLayoutParams(new FrameLayout.LayoutParams(i11, i11));
                        materialButton3.setIconResource(R.drawable.uikit_selector_notifications);
                        return materialButton3;
                    default:
                        int i12 = EventCardHeader.A;
                        MaterialButton materialButton4 = new MaterialButton(context2, null, R.attr.eventCardHeaderButtonStyle);
                        materialButton4.setId(jmu0.d());
                        int i13 = eventCardHeader.p;
                        materialButton4.setLayoutParams(new FrameLayout.LayoutParams(i13, i13));
                        materialButton4.setIconResource(R.drawable.uikit_selector_favorites);
                        return materialButton4;
                }
            }
        });
        this.c = maz.a(wezVar, new Function0() { // from class: a.wao
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b4 = b;
                AttributeSet attributeSet2 = null;
                EventCardHeader eventCardHeader = this;
                Context context2 = context;
                switch (b4) {
                    case 0:
                        int i2 = EventCardHeader.A;
                        ImageView imageView = new ImageView(context2);
                        imageView.setId(jmu0.d());
                        int i3 = eventCardHeader.n;
                        imageView.setLayoutParams(new FrameLayout.LayoutParams(i3, i3));
                        imageView.setImageResource(R.drawable.ic_glyph_popular_red);
                        return imageView;
                    case 1:
                        int i4 = EventCardHeader.A;
                        LoadableImageView loadableImageView = new LoadableImageView(context2, attributeSet2, 6, 0);
                        loadableImageView.setId(jmu0.d());
                        int i5 = eventCardHeader.n;
                        loadableImageView.setLayoutParams(new FrameLayout.LayoutParams(i5, i5));
                        loadableImageView.setImageTintList(ColorStateList.valueOf(m5d.b(R.attr.uikitSecondary, context2)));
                        return loadableImageView;
                    case 2:
                        int i6 = EventCardHeader.A;
                        MaterialButton materialButton = new MaterialButton(context2, null, R.attr.eventCardHeaderButtonStyle);
                        materialButton.setId(jmu0.d());
                        int i7 = eventCardHeader.p;
                        materialButton.setLayoutParams(new FrameLayout.LayoutParams(i7, i7));
                        materialButton.setIconResource(R.drawable.ic_glyph_broadcast);
                        return materialButton;
                    case 3:
                        int i8 = EventCardHeader.A;
                        MaterialButton materialButton2 = new MaterialButton(context2, null, R.attr.eventCardHeaderButtonStyle);
                        materialButton2.setId(R.id.stream_button_uitest);
                        int i9 = eventCardHeader.p;
                        materialButton2.setLayoutParams(new FrameLayout.LayoutParams(i9, i9));
                        materialButton2.setIconResource(R.drawable.ic_glyph_video_zone);
                        return materialButton2;
                    case 4:
                        int i10 = EventCardHeader.A;
                        MaterialButton materialButton3 = new MaterialButton(context2, null, R.attr.eventCardHeaderButtonStyle);
                        materialButton3.setId(jmu0.d());
                        int i11 = eventCardHeader.p;
                        materialButton3.setLayoutParams(new FrameLayout.LayoutParams(i11, i11));
                        materialButton3.setIconResource(R.drawable.uikit_selector_notifications);
                        return materialButton3;
                    default:
                        int i12 = EventCardHeader.A;
                        MaterialButton materialButton4 = new MaterialButton(context2, null, R.attr.eventCardHeaderButtonStyle);
                        materialButton4.setId(jmu0.d());
                        int i13 = eventCardHeader.p;
                        materialButton4.setLayoutParams(new FrameLayout.LayoutParams(i13, i13));
                        materialButton4.setIconResource(R.drawable.uikit_selector_favorites);
                        return materialButton4;
                }
            }
        });
        final byte b4 = 3;
        this.d = maz.a(wezVar, new Function0() { // from class: a.wao
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b5 = b4;
                AttributeSet attributeSet2 = null;
                EventCardHeader eventCardHeader = this;
                Context context2 = context;
                switch (b5) {
                    case 0:
                        int i2 = EventCardHeader.A;
                        ImageView imageView = new ImageView(context2);
                        imageView.setId(jmu0.d());
                        int i3 = eventCardHeader.n;
                        imageView.setLayoutParams(new FrameLayout.LayoutParams(i3, i3));
                        imageView.setImageResource(R.drawable.ic_glyph_popular_red);
                        return imageView;
                    case 1:
                        int i4 = EventCardHeader.A;
                        LoadableImageView loadableImageView = new LoadableImageView(context2, attributeSet2, 6, 0);
                        loadableImageView.setId(jmu0.d());
                        int i5 = eventCardHeader.n;
                        loadableImageView.setLayoutParams(new FrameLayout.LayoutParams(i5, i5));
                        loadableImageView.setImageTintList(ColorStateList.valueOf(m5d.b(R.attr.uikitSecondary, context2)));
                        return loadableImageView;
                    case 2:
                        int i6 = EventCardHeader.A;
                        MaterialButton materialButton = new MaterialButton(context2, null, R.attr.eventCardHeaderButtonStyle);
                        materialButton.setId(jmu0.d());
                        int i7 = eventCardHeader.p;
                        materialButton.setLayoutParams(new FrameLayout.LayoutParams(i7, i7));
                        materialButton.setIconResource(R.drawable.ic_glyph_broadcast);
                        return materialButton;
                    case 3:
                        int i8 = EventCardHeader.A;
                        MaterialButton materialButton2 = new MaterialButton(context2, null, R.attr.eventCardHeaderButtonStyle);
                        materialButton2.setId(R.id.stream_button_uitest);
                        int i9 = eventCardHeader.p;
                        materialButton2.setLayoutParams(new FrameLayout.LayoutParams(i9, i9));
                        materialButton2.setIconResource(R.drawable.ic_glyph_video_zone);
                        return materialButton2;
                    case 4:
                        int i10 = EventCardHeader.A;
                        MaterialButton materialButton3 = new MaterialButton(context2, null, R.attr.eventCardHeaderButtonStyle);
                        materialButton3.setId(jmu0.d());
                        int i11 = eventCardHeader.p;
                        materialButton3.setLayoutParams(new FrameLayout.LayoutParams(i11, i11));
                        materialButton3.setIconResource(R.drawable.uikit_selector_notifications);
                        return materialButton3;
                    default:
                        int i12 = EventCardHeader.A;
                        MaterialButton materialButton4 = new MaterialButton(context2, null, R.attr.eventCardHeaderButtonStyle);
                        materialButton4.setId(jmu0.d());
                        int i13 = eventCardHeader.p;
                        materialButton4.setLayoutParams(new FrameLayout.LayoutParams(i13, i13));
                        materialButton4.setIconResource(R.drawable.uikit_selector_favorites);
                        return materialButton4;
                }
            }
        });
        final byte b5 = 4;
        this.e = maz.a(wezVar, new Function0() { // from class: a.wao
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b6 = b5;
                AttributeSet attributeSet2 = null;
                EventCardHeader eventCardHeader = this;
                Context context2 = context;
                switch (b6) {
                    case 0:
                        int i2 = EventCardHeader.A;
                        ImageView imageView = new ImageView(context2);
                        imageView.setId(jmu0.d());
                        int i3 = eventCardHeader.n;
                        imageView.setLayoutParams(new FrameLayout.LayoutParams(i3, i3));
                        imageView.setImageResource(R.drawable.ic_glyph_popular_red);
                        return imageView;
                    case 1:
                        int i4 = EventCardHeader.A;
                        LoadableImageView loadableImageView = new LoadableImageView(context2, attributeSet2, 6, 0);
                        loadableImageView.setId(jmu0.d());
                        int i5 = eventCardHeader.n;
                        loadableImageView.setLayoutParams(new FrameLayout.LayoutParams(i5, i5));
                        loadableImageView.setImageTintList(ColorStateList.valueOf(m5d.b(R.attr.uikitSecondary, context2)));
                        return loadableImageView;
                    case 2:
                        int i6 = EventCardHeader.A;
                        MaterialButton materialButton = new MaterialButton(context2, null, R.attr.eventCardHeaderButtonStyle);
                        materialButton.setId(jmu0.d());
                        int i7 = eventCardHeader.p;
                        materialButton.setLayoutParams(new FrameLayout.LayoutParams(i7, i7));
                        materialButton.setIconResource(R.drawable.ic_glyph_broadcast);
                        return materialButton;
                    case 3:
                        int i8 = EventCardHeader.A;
                        MaterialButton materialButton2 = new MaterialButton(context2, null, R.attr.eventCardHeaderButtonStyle);
                        materialButton2.setId(R.id.stream_button_uitest);
                        int i9 = eventCardHeader.p;
                        materialButton2.setLayoutParams(new FrameLayout.LayoutParams(i9, i9));
                        materialButton2.setIconResource(R.drawable.ic_glyph_video_zone);
                        return materialButton2;
                    case 4:
                        int i10 = EventCardHeader.A;
                        MaterialButton materialButton3 = new MaterialButton(context2, null, R.attr.eventCardHeaderButtonStyle);
                        materialButton3.setId(jmu0.d());
                        int i11 = eventCardHeader.p;
                        materialButton3.setLayoutParams(new FrameLayout.LayoutParams(i11, i11));
                        materialButton3.setIconResource(R.drawable.uikit_selector_notifications);
                        return materialButton3;
                    default:
                        int i12 = EventCardHeader.A;
                        MaterialButton materialButton4 = new MaterialButton(context2, null, R.attr.eventCardHeaderButtonStyle);
                        materialButton4.setId(jmu0.d());
                        int i13 = eventCardHeader.p;
                        materialButton4.setLayoutParams(new FrameLayout.LayoutParams(i13, i13));
                        materialButton4.setIconResource(R.drawable.uikit_selector_favorites);
                        return materialButton4;
                }
            }
        });
        final byte b6 = 5;
        this.f = maz.a(wezVar, new Function0() { // from class: a.wao
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b7 = b6;
                AttributeSet attributeSet2 = null;
                EventCardHeader eventCardHeader = this;
                Context context2 = context;
                switch (b7) {
                    case 0:
                        int i2 = EventCardHeader.A;
                        ImageView imageView = new ImageView(context2);
                        imageView.setId(jmu0.d());
                        int i3 = eventCardHeader.n;
                        imageView.setLayoutParams(new FrameLayout.LayoutParams(i3, i3));
                        imageView.setImageResource(R.drawable.ic_glyph_popular_red);
                        return imageView;
                    case 1:
                        int i4 = EventCardHeader.A;
                        LoadableImageView loadableImageView = new LoadableImageView(context2, attributeSet2, 6, 0);
                        loadableImageView.setId(jmu0.d());
                        int i5 = eventCardHeader.n;
                        loadableImageView.setLayoutParams(new FrameLayout.LayoutParams(i5, i5));
                        loadableImageView.setImageTintList(ColorStateList.valueOf(m5d.b(R.attr.uikitSecondary, context2)));
                        return loadableImageView;
                    case 2:
                        int i6 = EventCardHeader.A;
                        MaterialButton materialButton = new MaterialButton(context2, null, R.attr.eventCardHeaderButtonStyle);
                        materialButton.setId(jmu0.d());
                        int i7 = eventCardHeader.p;
                        materialButton.setLayoutParams(new FrameLayout.LayoutParams(i7, i7));
                        materialButton.setIconResource(R.drawable.ic_glyph_broadcast);
                        return materialButton;
                    case 3:
                        int i8 = EventCardHeader.A;
                        MaterialButton materialButton2 = new MaterialButton(context2, null, R.attr.eventCardHeaderButtonStyle);
                        materialButton2.setId(R.id.stream_button_uitest);
                        int i9 = eventCardHeader.p;
                        materialButton2.setLayoutParams(new FrameLayout.LayoutParams(i9, i9));
                        materialButton2.setIconResource(R.drawable.ic_glyph_video_zone);
                        return materialButton2;
                    case 4:
                        int i10 = EventCardHeader.A;
                        MaterialButton materialButton3 = new MaterialButton(context2, null, R.attr.eventCardHeaderButtonStyle);
                        materialButton3.setId(jmu0.d());
                        int i11 = eventCardHeader.p;
                        materialButton3.setLayoutParams(new FrameLayout.LayoutParams(i11, i11));
                        materialButton3.setIconResource(R.drawable.uikit_selector_notifications);
                        return materialButton3;
                    default:
                        int i12 = EventCardHeader.A;
                        MaterialButton materialButton4 = new MaterialButton(context2, null, R.attr.eventCardHeaderButtonStyle);
                        materialButton4.setId(jmu0.d());
                        int i13 = eventCardHeader.p;
                        materialButton4.setLayoutParams(new FrameLayout.LayoutParams(i13, i13));
                        materialButton4.setIconResource(R.drawable.uikit_selector_favorites);
                        return materialButton4;
                }
            }
        });
        this.g = maz.a(wezVar, new ryl(context, (byte) 15));
        TextPaint textPaint = new TextPaint();
        r7x.r(textPaint, context, R.style.TextStyle_Caption_Regular_L_Secondary);
        textPaint.setAntiAlias(true);
        this.h = textPaint;
        this.i = getResources().getDimensionPixelSize(R.dimen.space_2);
        this.j = getResources().getDimensionPixelSize(R.dimen.space_2);
        this.k = getResources().getDimensionPixelSize(R.dimen.space_8);
        this.l = getResources().getDimensionPixelSize(R.dimen.space_4);
        this.m = getResources().getDimensionPixelSize(R.dimen.space_8);
        this.n = getResources().getDimensionPixelOffset(R.dimen.size_24);
        this.o = getResources().getDimensionPixelOffset(R.dimen.size_24);
        this.p = getResources().getDimensionPixelOffset(R.dimen.size_36);
        this.x = "";
        setWillNotDraw(false);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, cqd0.b, 0, 0);
        String strP = ktt0.p(typedArrayObtainStyledAttributes, context, 1);
        if (strP != null && strP.length() != 0) {
            setTitle(strP);
        }
        setIcon(typedArrayObtainStyledAttributes.getDrawable(0));
        typedArrayObtainStyledAttributes.recycle();
    }

    public static void b(EventCardHeader eventCardHeader, String str, Drawable drawable) {
        mmn mmnVar = new mmn((byte) 14);
        mmn mmnVar2 = new mmn((byte) 15);
        eventCardHeader.getClass();
        LoadableImageView.i(eventCardHeader.getSportImageView(), str, drawable, mmnVar, mmnVar2);
    }

    private final MaterialButton getFavoriteButton() {
        return (MaterialButton) this.f.getValue();
    }

    private final MaterialButton getNotificationButton() {
        return (MaterialButton) this.e.getValue();
    }

    private final TextView getSoonTextView() {
        return (TextView) this.g.getValue();
    }

    private final LoadableImageView getSportImageView() {
        return (LoadableImageView) this.b.getValue();
    }

    private final MaterialButton getStreamButton() {
        return (MaterialButton) this.c.getValue();
    }

    private final ImageView getTopIcon() {
        return (ImageView) this.f47292a.getValue();
    }

    private final MaterialButton getZoneButton() {
        return (MaterialButton) this.d.getValue();
    }

    public final void a(int i, String str) {
        LoadableImageView.g(getSportImageView(), str, i);
    }

    public final MaterialButton getFavorite() {
        return getFavoriteButton();
    }

    public final ImageView getIcon() {
        return getTopIcon();
    }

    public final MaterialButton getNotification() {
        return getNotificationButton();
    }

    public final MaterialButton getNotificationImage() {
        return getNotificationButton();
    }

    public final LoadableImageView getSportImage() {
        return getSportImageView();
    }

    public final MaterialButton getStream() {
        return getStreamButton();
    }

    public final String getTitleText() {
        return this.x.toString();
    }

    public final MaterialButton getZone() {
        return getZoneButton();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.getClass();
        super.onDraw(canvas);
        StaticLayout staticLayout = this.y;
        if (staticLayout != null) {
            canvas.save();
            canvas.translate(this.z, (getHeight() - staticLayout.getHeight()) * 0.5f);
            staticLayout.draw(canvas);
            canvas.restore();
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Number numberValueOf;
        Number numberValueOf2;
        Number numberValueOf3;
        int width;
        Number numberValueOf4;
        Number numberValueOf5;
        Number numberValueOf6;
        int width2;
        int width3;
        super.onLayout(z, i, i2, i3, i4);
        int layoutDirection = getLayoutDirection();
        int i5 = this.i;
        int i6 = this.l;
        int i7 = this.k;
        if (layoutDirection != 1) {
            int width4 = (getWidth() - i5) - this.p;
            if (this.u) {
                getTopIcon().layout(i7, i7, getTopIcon().getWidth() + i7, getTopIcon().getHeight() + i7);
            }
            if (this.q) {
                if (this.u) {
                    width = (i7 / 2) + getTopIcon().getWidth() + i7;
                } else {
                    width = i7;
                }
                getSportImageView().layout(width, i7, getSportImageView().getWidth() + width, getSportImageView().getHeight() + i7);
            }
            boolean z2 = this.w;
            int i8 = this.j;
            if (z2) {
                getFavoriteButton().layout(width4, i8, getFavoriteButton().getMeasuredWidth() + width4, getFavoriteButton().getHeight() + i8);
            }
            if (this.v) {
                int iIntValue = (this.w ? Float.valueOf((getFavoriteButton().getX() - i6) - getNotificationButton().getMeasuredWidth()) : Integer.valueOf(width4)).intValue();
                getNotificationButton().layout(iIntValue, i8, getNotificationButton().getMeasuredWidth() + iIntValue, getNotificationButton().getHeight() + i8);
            }
            if (this.t) {
                if (this.v) {
                    numberValueOf3 = Float.valueOf((getNotificationButton().getX() - i6) - getZoneButton().getMeasuredWidth());
                } else {
                    numberValueOf3 = this.w ? Float.valueOf((getFavoriteButton().getX() - i6) - getZoneButton().getMeasuredWidth()) : Integer.valueOf(width4);
                }
                int iIntValue2 = numberValueOf3.intValue();
                getZoneButton().layout(iIntValue2, i8, getZoneButton().getMeasuredWidth() + iIntValue2, getZoneButton().getHeight() + i8);
            }
            if (this.r) {
                if (this.t) {
                    numberValueOf2 = Float.valueOf((getZoneButton().getX() - i6) - getStreamButton().getMeasuredWidth());
                } else if (this.v) {
                    numberValueOf2 = Float.valueOf((getNotificationButton().getX() - i6) - getStreamButton().getMeasuredWidth());
                } else {
                    numberValueOf2 = this.w ? Float.valueOf((getFavoriteButton().getX() - i6) - getStreamButton().getMeasuredWidth()) : Integer.valueOf(width4);
                }
                int iIntValue3 = numberValueOf2.intValue();
                getStreamButton().layout(iIntValue3, i8, getStreamButton().getMeasuredWidth() + iIntValue3, getStreamButton().getHeight() + i8);
            }
            if (this.s) {
                if (this.t) {
                    numberValueOf = Float.valueOf((getZoneButton().getX() - i6) - getStreamButton().getMeasuredWidth());
                } else if (this.v) {
                    numberValueOf = Float.valueOf((getNotificationButton().getX() - i6) - getStreamButton().getMeasuredWidth());
                } else {
                    numberValueOf = this.w ? Float.valueOf((getFavoriteButton().getX() - i6) - getStreamButton().getMeasuredWidth()) : Integer.valueOf(width4);
                }
                int measuredWidth = (getSoonTextView().getMeasuredWidth() / 2) + numberValueOf.intValue();
                getSoonTextView().layout(measuredWidth, i8, getSoonTextView().getMeasuredWidth() + measuredWidth, getSoonTextView().getMeasuredHeight() + i8);
                return;
            }
            return;
        }
        if (this.u) {
            int width5 = (getWidth() - i7) - getTopIcon().getWidth();
            getTopIcon().layout(width5, i7, getTopIcon().getWidth() + width5, getTopIcon().getHeight() + i7);
        }
        if (this.q) {
            if (this.u) {
                width2 = ((getWidth() - i7) - getTopIcon().getWidth()) - (i7 / 2);
                width3 = getSportImageView().getWidth();
            } else {
                width2 = getWidth() - i7;
                width3 = getSportImageView().getWidth();
            }
            int i9 = width2 - width3;
            getSportImageView().layout(i9, i7, getSportImageView().getWidth() + i9, getSportImageView().getHeight() + i7);
        }
        if (this.w) {
            getFavoriteButton().layout(i5, i5, getFavoriteButton().getMeasuredWidth() + i5, getFavoriteButton().getHeight() + i5);
        }
        if (this.v) {
            int iIntValue4 = (this.w ? Float.valueOf(getFavoriteButton().getX() + i6 + getNotificationButton().getMeasuredWidth()) : Integer.valueOf(i5)).intValue();
            getNotificationButton().layout(iIntValue4, i5, getNotificationButton().getMeasuredWidth() + iIntValue4, getNotificationButton().getHeight() + i5);
        }
        if (this.t) {
            if (this.v) {
                numberValueOf6 = Float.valueOf(getNotificationButton().getX() + i6 + getZoneButton().getMeasuredWidth());
            } else {
                numberValueOf6 = this.w ? Float.valueOf(getFavoriteButton().getX() + i6 + getZoneButton().getMeasuredWidth()) : Integer.valueOf(i5);
            }
            int iIntValue5 = numberValueOf6.intValue();
            getZoneButton().layout(iIntValue5, i5, getZoneButton().getMeasuredWidth() + iIntValue5, getZoneButton().getHeight() + i5);
        }
        if (this.r) {
            if (this.t) {
                numberValueOf5 = Float.valueOf(getZoneButton().getX() + i6 + getStreamButton().getMeasuredWidth());
            } else if (this.v) {
                numberValueOf5 = Float.valueOf(getNotificationButton().getX() + i6 + getStreamButton().getMeasuredWidth());
            } else {
                numberValueOf5 = this.w ? Float.valueOf(getFavoriteButton().getX() + i6 + getStreamButton().getMeasuredWidth()) : Integer.valueOf(i5);
            }
            int iIntValue6 = numberValueOf5.intValue();
            getStreamButton().layout(iIntValue6, i5, getStreamButton().getMeasuredWidth() + iIntValue6, getStreamButton().getHeight() + i5);
        }
        if (this.s) {
            if (this.t) {
                numberValueOf4 = Float.valueOf((getZoneButton().getX() - i6) - getStreamButton().getMeasuredWidth());
            } else if (this.v) {
                numberValueOf4 = Float.valueOf(getNotificationButton().getX() + i6 + getStreamButton().getMeasuredWidth());
            } else {
                numberValueOf4 = this.w ? Float.valueOf(getFavoriteButton().getX() + i6 + getStreamButton().getMeasuredWidth()) : Integer.valueOf(i5);
            }
            int measuredWidth2 = (getSoonTextView().getMeasuredWidth() / 2) + numberValueOf4.intValue();
            getSoonTextView().layout(measuredWidth2, i5, getSoonTextView().getMeasuredWidth() + measuredWidth2, getSoonTextView().getMeasuredHeight() + i5);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int measuredWidth;
        int measuredWidth2;
        super.onMeasure(i, i2);
        if (this.x.length() == 0) {
            return;
        }
        List listJ = q3d.j(Boolean.valueOf(this.r), Boolean.valueOf(this.t), Boolean.valueOf(this.v), Boolean.valueOf(this.w));
        int i4 = 0;
        if (listJ == null || !listJ.isEmpty()) {
            Iterator it = listJ.iterator();
            while (it.hasNext()) {
                if (((Boolean) it.next()).booleanValue() && (i4 = i4 + 1) < 0) {
                    q3d.o();
                    throw null;
                }
            }
        }
        int layoutDirection = getLayoutDirection();
        boolean z = this.q;
        int i5 = this.l;
        int i6 = this.p;
        int i7 = this.i;
        int i8 = this.o;
        int i9 = this.k;
        int i10 = this.m;
        int i11 = this.n;
        if (layoutDirection == 1) {
            if (!z || this.u) {
                if (z && this.u) {
                    measuredWidth2 = (getMeasuredWidth() - i9) - i8;
                    i9 /= 2;
                } else {
                    measuredWidth = getMeasuredWidth() - i9;
                }
                int i12 = ((i4 - 1) * i5) + (i6 * i4) + i7 + i10;
                this.z = i12;
                i3 = measuredWidth - i12;
            } else {
                measuredWidth2 = getMeasuredWidth();
            }
            measuredWidth = ((measuredWidth2 - i9) - i11) - i10;
            int i13 = ((i4 - 1) * i5) + (i6 * i4) + i7 + i10;
            this.z = i13;
            i3 = measuredWidth - i13;
        } else {
            if (z && !this.u) {
                i9 = i9 + i11 + i10;
            } else if (z && this.u) {
                i9 = (i9 / 2) + i8 + i9;
                i9 = i9 + i11 + i10;
            }
            int measuredWidth3 = (((getMeasuredWidth() - i7) - (i6 * i4)) - ((i4 - 1) * i5)) - i10;
            this.z = i9;
            i3 = measuredWidth3 - i9;
        }
        this.y = xdx.I(f1t0.L(this.x), this.h, i3, 2, TextUtils.TruncateAt.END, 0, Layout.Alignment.ALIGN_NORMAL, 1264);
    }

    public final void setFavoriteButtonClickListener(View.OnClickListener onClickListener) {
        onClickListener.getClass();
        getFavoriteButton().setOnClickListener(onClickListener);
    }

    public final void setFavoriteButtonIconRes(int i) {
        getFavoriteButton().setIconResource(i);
    }

    public final void setFavoriteButtonSelected(boolean z) {
        getFavoriteButton().setSelected(z);
    }

    public final void setFavoriteButtonVisible(boolean z) {
        if (z != this.w) {
            if (getFavoriteButton().getParent() == null) {
                addView(getFavoriteButton());
            }
            getFavoriteButton().setVisibility(z ? 0 : 8);
            this.w = z;
        }
    }

    public final void setIcon(Drawable drawable) {
        if (drawable != null) {
            getSportImageView().setImageDrawable(drawable);
            if (this.q) {
                return;
            }
            this.q = true;
            addView(getSportImageView());
        }
    }

    public final void setIconTint(int i) {
        setIconTint(ColorStateList.valueOf(i));
    }

    public final void setIconVisible(boolean z) {
        if (z != this.q) {
            if (getSportImageView().getParent() == null) {
                addView(getSportImageView());
            }
            getSportImageView().setVisibility(z ? 0 : 8);
            this.q = z;
        }
    }

    public final void setNotificationButtonClickListener(View.OnClickListener onClickListener) {
        onClickListener.getClass();
        getNotificationButton().setOnClickListener(onClickListener);
    }

    public final void setNotificationButtonIconRes(int i) {
        getNotificationButton().setIconResource(i);
    }

    public final void setNotificationButtonSelected(boolean z) {
        getNotificationButton().setSelected(z);
    }

    public final void setNotificationButtonVisible(boolean z) {
        if (z != this.v) {
            if (getNotificationButton().getParent() == null) {
                addView(getNotificationButton());
            }
            getNotificationButton().setVisibility(z ? 0 : 8);
            this.v = z;
        }
    }

    public final void setSoonText(int i) {
        setSoonText(getContext().getString(i));
    }

    public final void setSoonTextViewVisible(boolean z) {
        if (z != this.s) {
            if (getSoonTextView().getParent() == null) {
                addView(getSoonTextView());
            }
            getSoonTextView().setVisibility(z ? 0 : 8);
            this.s = z;
            getStreamButton().setAlpha(0.4f);
        }
    }

    public final void setStreamButtonClickListener(View.OnClickListener onClickListener) {
        onClickListener.getClass();
        getStreamButton().setOnClickListener(onClickListener);
    }

    public final void setStreamButtonIconRes(int i) {
        getStreamButton().setIconResource(i);
    }

    public final void setStreamButtonVisible(boolean z) {
        if (z != this.r) {
            if (getStreamButton().getParent() == null) {
                addView(getStreamButton());
            }
            getStreamButton().setVisibility(z ? 0 : 8);
            this.r = z;
        }
    }

    public final void setTitle(CharSequence charSequence) {
        if (Intrinsics.d(charSequence, this.x)) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        this.x = charSequence;
        setContentDescription(charSequence);
    }

    public final void setTopIconVisible(boolean z) {
        if (z != this.u) {
            if (getTopIcon().getParent() == null) {
                addView(getTopIcon());
            }
            getTopIcon().setVisibility(z ? 0 : 8);
            this.u = z;
        }
    }

    public final void setZoneButtonClickListener(View.OnClickListener onClickListener) {
        onClickListener.getClass();
        getZoneButton().setOnClickListener(onClickListener);
    }

    public final void setZoneButtonIconRes(int i) {
        getZoneButton().setIconResource(i);
    }

    public final void setZoneButtonVisible(boolean z) {
        if (z != this.t) {
            if (getZoneButton().getParent() == null) {
                addView(getZoneButton());
            }
            getZoneButton().setVisibility(z ? 0 : 8);
            this.t = z;
        }
    }

    public final void setIconTint(ColorStateList colorStateList) {
        getSportImageView().setImageTintList(colorStateList);
    }

    public final void setSoonText(CharSequence charSequence) {
        getSoonTextView().setText(charSequence);
    }

    public final void setTitle(int i) {
        setTitle(getContext().getString(i));
    }

    public final void setIcon(int i) {
        setIcon(getContext().getDrawable(i));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EventCardHeader(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EventCardHeader(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
