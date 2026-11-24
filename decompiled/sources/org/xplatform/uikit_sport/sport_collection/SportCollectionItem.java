package org.xplatform.uikit_sport.sport_collection;

import a.a4l0;
import a.gbe0;
import a.goi0;
import a.jmu0;
import a.k1x;
import a.l0x;
import a.m0x;
import a.m5d;
import a.maz;
import a.n0o0;
import a.n0x;
import a.o0k0;
import a.o0x;
import a.o5k0;
import a.t1x;
import a.t9f;
import a.tje;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.xbet.client1.R;
import org.xplatform.uikit.components.badges.DsBadge;
import org.xplatform.uikit.components.views.LoadableShapeableImageView;

/* JADX INFO: loaded from: classes6.dex */
public final class SportCollectionItem extends FrameLayout {
    public static final /* synthetic */ int c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n0o0 f47300a;
    public final DsBadge b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SportCollectionItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.f47300a = maz.b(new o0k0(context, this, (byte) 9));
        DsBadge dsBadge = new DsBadge(new tje(context, R.style.Widget_DSBadge_Market_Coupon), null, 6);
        FrameLayout frameLayout = getBinding().b;
        frameLayout.getClass();
        dsBadge.a(frameLayout, new goi0(this, (byte) 14));
        this.b = dsBadge;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.space_2);
        setClickable(true);
        if (getLayoutDirection() == 1) {
            dsBadge.d(8388659, dimensionPixelSize, dimensionPixelSize);
        } else {
            dsBadge.d(8388661, dimensionPixelSize, dimensionPixelSize);
        }
    }

    public static final View a(SportCollectionItem sportCollectionItem) {
        Object parent = sportCollectionItem.getBinding().b.getParent().getParent();
        parent.getClass();
        return (View) parent;
    }

    private final a4l0 getBinding() {
        return (a4l0) this.f47300a.getValue();
    }

    public final void setIcon(String str) {
        str.getClass();
        LoadableShapeableImageView loadableShapeableImageView = getBinding().c;
        gbe0 gbe0VarA = o5k0.a(loadableShapeableImageView.getContext());
        k1x k1xVar = new k1x(loadableShapeableImageView.getContext());
        k1xVar.c = str;
        t1x.h(k1xVar, loadableShapeableImageView);
        t1x.f(k1xVar, R.drawable.ic_glyph_category_new);
        gbe0VarA.a(k1xVar.a());
    }

    public final void setItemSelected(boolean z) {
        setSelected(z);
        Context context = getContext();
        context.getClass();
        Integer numValueOf = Integer.valueOf(m5d.b(R.attr.uikitBackgroundContent, context));
        Context context2 = getContext();
        context2.getClass();
        jmu0.j(this, m5d.d(numValueOf, Integer.valueOf(m5d.b(R.attr.uikitPrimary, context2))));
        LoadableShapeableImageView loadableShapeableImageView = getBinding().c;
        Context context3 = getContext();
        context3.getClass();
        int i = R.attr.uikitSecondary;
        loadableShapeableImageView.setColorFilter(m5d.b(z ? R.attr.uikitStaticWhite : R.attr.uikitSecondary, context3));
        TextView textView = getBinding().d;
        Context context4 = getContext();
        context4.getClass();
        if (z) {
            i = R.attr.uikitStaticWhite;
        }
        textView.setTextColor(m5d.b(i, context4));
        if (z) {
            this.b.setVisibility(8);
        }
    }

    public final void setTitle(int i) {
        setTitle(getContext().getString(i));
    }

    public final void setTitle(CharSequence charSequence) {
        getBinding().d.setText(charSequence);
    }

    public final void setIcon(int i) {
        setIcon(getContext().getDrawable(i));
    }

    public final void setIcon(Drawable drawable) {
        getBinding().c.setImageDrawable(drawable);
    }

    public final void setIcon(o0x o0xVar) {
        o0xVar.getClass();
        if (o0xVar != null) {
            if (o0xVar instanceof m0x) {
                setIcon(((m0x) o0xVar).f20977a);
                return;
            } else if (o0xVar instanceof n0x) {
                setIcon(((n0x) o0xVar).f22722a);
                return;
            } else if (o0xVar instanceof l0x) {
                setIcon(((l0x) o0xVar).f19222a);
                return;
            }
        }
        t9f.b();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SportCollectionItem(Context context) {
        this(context, null);
        context.getClass();
    }
}
