package org.xplatform.cyber.game.core.presentation.dota.banpick.view;

import a.a8z;
import a.bg5;
import a.e9k;
import a.gbn;
import a.i2l;
import a.j2l;
import a.maz;
import a.s2l;
import a.u0d;
import a.vbk;
import a.wez;
import a.zdh;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.jvm.functions.Function0;
import org.xbet.client1.R;
import org.xplatform.cyber.game.core.presentation.dota.banpick.view.DotaBanPickItemView;

/* JADX INFO: loaded from: classes4.dex */
public final class DotaBanPickItemView extends FrameLayout {
    public static final /* synthetic */ int k = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f46509a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final bg5 f;
    public final int g;
    public final a8z h;
    public final a8z i;
    public final a8z j;

    /* JADX WARN: Illegal instructions before constructor call */
    public DotaBanPickItemView(final Context context, AttributeSet attributeSet, int i) {
        final byte b = 2;
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        final byte b2 = 0;
        super(context, attributeSet, 0);
        this.f46509a = getResources().getDimensionPixelSize(R.dimen.space_8);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.space_8);
        this.b = dimensionPixelSize;
        this.c = getResources().getDimensionPixelSize(R.dimen.space_4);
        this.d = getResources().getDimensionPixelSize(R.dimen.space_12);
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.size_24);
        this.e = dimensionPixelOffset;
        bg5 bg5Var = new bg5();
        bg5Var.d.b(new gbn(new j2l(b2), new e9k(3, (byte) 10), new vbk((byte) 29), zdh.w));
        this.f = bg5Var;
        this.g = dimensionPixelOffset + dimensionPixelSize + dimensionPixelSize;
        wez wezVar = wez.b;
        this.h = maz.a(wezVar, new Function0() { // from class: a.m2l
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b3 = b2;
                DotaBanPickItemView dotaBanPickItemView = this;
                Context context2 = context;
                switch (b3) {
                    case 0:
                        int i2 = DotaBanPickItemView.k;
                        ImageView imageView = new ImageView(context2);
                        int i3 = dotaBanPickItemView.e;
                        imageView.setLayoutParams(new FrameLayout.LayoutParams(i3, i3));
                        dotaBanPickItemView.addView(imageView);
                        imageView.setTag("FirstTeamLogoImage");
                        return imageView;
                    case 1:
                        int i4 = DotaBanPickItemView.k;
                        ImageView imageView2 = new ImageView(context2);
                        int i5 = dotaBanPickItemView.e;
                        imageView2.setLayoutParams(new FrameLayout.LayoutParams(i5, i5));
                        dotaBanPickItemView.addView(imageView2);
                        imageView2.setTag("SecondTeamLogoImage");
                        return imageView2;
                    default:
                        int i6 = DotaBanPickItemView.k;
                        RecyclerView recyclerView = new RecyclerView(context2);
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
                        layoutParams.setMargins(dotaBanPickItemView.g, 0, 0, 0);
                        recyclerView.setLayoutParams(layoutParams);
                        recyclerView.setNestedScrollingEnabled(false);
                        recyclerView.setHasFixedSize(true);
                        recyclerView.setItemAnimator(null);
                        recyclerView.setAdapter(dotaBanPickItemView.f);
                        recyclerView.setLayoutManager(new LinearLayoutManager(context2, 0, false));
                        recyclerView.m(new qmk0(context2.getResources().getDimensionPixelOffset(R.dimen.space_6), 0, 0, context2.getResources().getDimensionPixelOffset(R.dimen.space_6), 0, 0, null, null, 470));
                        return recyclerView;
                }
            }
        });
        final byte b3 = 1;
        this.i = maz.a(wezVar, new Function0() { // from class: a.m2l
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b4 = b3;
                DotaBanPickItemView dotaBanPickItemView = this;
                Context context2 = context;
                switch (b4) {
                    case 0:
                        int i2 = DotaBanPickItemView.k;
                        ImageView imageView = new ImageView(context2);
                        int i3 = dotaBanPickItemView.e;
                        imageView.setLayoutParams(new FrameLayout.LayoutParams(i3, i3));
                        dotaBanPickItemView.addView(imageView);
                        imageView.setTag("FirstTeamLogoImage");
                        return imageView;
                    case 1:
                        int i4 = DotaBanPickItemView.k;
                        ImageView imageView2 = new ImageView(context2);
                        int i5 = dotaBanPickItemView.e;
                        imageView2.setLayoutParams(new FrameLayout.LayoutParams(i5, i5));
                        dotaBanPickItemView.addView(imageView2);
                        imageView2.setTag("SecondTeamLogoImage");
                        return imageView2;
                    default:
                        int i6 = DotaBanPickItemView.k;
                        RecyclerView recyclerView = new RecyclerView(context2);
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
                        layoutParams.setMargins(dotaBanPickItemView.g, 0, 0, 0);
                        recyclerView.setLayoutParams(layoutParams);
                        recyclerView.setNestedScrollingEnabled(false);
                        recyclerView.setHasFixedSize(true);
                        recyclerView.setItemAnimator(null);
                        recyclerView.setAdapter(dotaBanPickItemView.f);
                        recyclerView.setLayoutManager(new LinearLayoutManager(context2, 0, false));
                        recyclerView.m(new qmk0(context2.getResources().getDimensionPixelOffset(R.dimen.space_6), 0, 0, context2.getResources().getDimensionPixelOffset(R.dimen.space_6), 0, 0, null, null, 470));
                        return recyclerView;
                }
            }
        });
        this.j = maz.a(wezVar, new Function0() { // from class: a.m2l
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b4 = b;
                DotaBanPickItemView dotaBanPickItemView = this;
                Context context2 = context;
                switch (b4) {
                    case 0:
                        int i2 = DotaBanPickItemView.k;
                        ImageView imageView = new ImageView(context2);
                        int i3 = dotaBanPickItemView.e;
                        imageView.setLayoutParams(new FrameLayout.LayoutParams(i3, i3));
                        dotaBanPickItemView.addView(imageView);
                        imageView.setTag("FirstTeamLogoImage");
                        return imageView;
                    case 1:
                        int i4 = DotaBanPickItemView.k;
                        ImageView imageView2 = new ImageView(context2);
                        int i5 = dotaBanPickItemView.e;
                        imageView2.setLayoutParams(new FrameLayout.LayoutParams(i5, i5));
                        dotaBanPickItemView.addView(imageView2);
                        imageView2.setTag("SecondTeamLogoImage");
                        return imageView2;
                    default:
                        int i6 = DotaBanPickItemView.k;
                        RecyclerView recyclerView = new RecyclerView(context2);
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
                        layoutParams.setMargins(dotaBanPickItemView.g, 0, 0, 0);
                        recyclerView.setLayoutParams(layoutParams);
                        recyclerView.setNestedScrollingEnabled(false);
                        recyclerView.setHasFixedSize(true);
                        recyclerView.setItemAnimator(null);
                        recyclerView.setAdapter(dotaBanPickItemView.f);
                        recyclerView.setLayoutManager(new LinearLayoutManager(context2, 0, false));
                        recyclerView.m(new qmk0(context2.getResources().getDimensionPixelOffset(R.dimen.space_6), 0, 0, context2.getResources().getDimensionPixelOffset(R.dimen.space_6), 0, 0, null, null, 470));
                        return recyclerView;
                }
            }
        });
    }

    private final ImageView getFirstTeamLogoImageView() {
        return (ImageView) this.h.getValue();
    }

    private final RecyclerView getHeroRecyclerView() {
        return (RecyclerView) this.j.getValue();
    }

    private final ImageView getSecondTeamLogoImageView() {
        return (ImageView) this.i.getValue();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int layoutDirection = getLayoutDirection();
        int i5 = this.c;
        int i6 = this.b;
        int i7 = this.d;
        int i8 = this.f46509a;
        if (layoutDirection != 1) {
            if (getFirstTeamLogoImageView().getParent() != null) {
                getFirstTeamLogoImageView().layout(i6, i7, getFirstTeamLogoImageView().getWidth() + i6, getFirstTeamLogoImageView().getHeight() + i7);
            }
            if (getSecondTeamLogoImageView().getParent() != null) {
                int height = (getHeight() - i7) - getSecondTeamLogoImageView().getHeight();
                getSecondTeamLogoImageView().layout(i6, height, getSecondTeamLogoImageView().getWidth() + i6, getSecondTeamLogoImageView().getHeight() + height);
            }
            if (getHeroRecyclerView().getParent() != null) {
                getHeroRecyclerView().layout(getFirstTeamLogoImageView().getWidth() + i6 + i6, i8, getWidth() - i5, getHeight() - i8);
                return;
            }
            return;
        }
        if (getFirstTeamLogoImageView().getParent() != null) {
            int width = (getWidth() - i6) - getFirstTeamLogoImageView().getWidth();
            getFirstTeamLogoImageView().layout(width, i7, getFirstTeamLogoImageView().getWidth() + width, getFirstTeamLogoImageView().getHeight() + i7);
        }
        if (getSecondTeamLogoImageView().getParent() != null) {
            int width2 = (getWidth() - i6) - getSecondTeamLogoImageView().getWidth();
            int height2 = (getHeight() - i7) - getSecondTeamLogoImageView().getHeight();
            getSecondTeamLogoImageView().layout(width2, height2, getSecondTeamLogoImageView().getWidth() + width2, getSecondTeamLogoImageView().getHeight() + height2);
        }
        if (getHeroRecyclerView().getParent() != null) {
            getHeroRecyclerView().layout(0, i8, (((getWidth() - i6) - i6) - getFirstTeamLogoImageView().getWidth()) - i5, getHeight() - i8);
        }
    }

    public final void setFirstTeamLogo(String str) {
        str.getClass();
        List list = u0d.f34849a;
        u0d.n(getFirstTeamLogoImageView(), str, R.drawable.icon_globe_empty, 3);
    }

    public final void setHeroPick(List<i2l> list) {
        list.getClass();
        if (getHeroRecyclerView().getParent() == null) {
            addView(getHeroRecyclerView());
        }
        this.f.A(list);
    }

    public final void setScrollPosition(s2l s2lVar) {
        s2lVar.getClass();
        if (getHeroRecyclerView().getParent() == null) {
            addView(getHeroRecyclerView());
        }
        if (s2lVar.b) {
            getHeroRecyclerView().B0(s2lVar.f31506a);
        }
    }

    public final void setSecondTeamLogo(String str) {
        str.getClass();
        List list = u0d.f34849a;
        u0d.n(getSecondTeamLogoImageView(), str, R.drawable.icon_globe_empty, 3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DotaBanPickItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DotaBanPickItemView(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
