package org.xplatform.cyber.section.impl.championships.esports_world_cup.presentation.discipline.discipline_banner;

import a.hny;
import a.jk3;
import a.rnk;
import a.t9f;
import a.yum0;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import org.xbet.client1.R;
import org.xplatform.uikit.components.tag.DsTag;
import org.xplatform.uikit.components.views.LoadableShapeableImageView;

/* JADX INFO: loaded from: classes4.dex */
public final class DisciplineBannerView extends ConstraintLayout {
    public final jk3 q;
    public final float r;
    public final float s;
    public String t;
    public String u;

    /* JADX WARN: Illegal instructions before constructor call */
    public DisciplineBannerView(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, 0);
        LayoutInflater.from(context).inflate(R.layout.cyber_discipline_banner_layout, this);
        int i2 = R.id.ivBanner;
        LoadableShapeableImageView loadableShapeableImageView = (LoadableShapeableImageView) yum0.f(this, R.id.ivBanner);
        if (loadableShapeableImageView != null) {
            i2 = R.id.tvSubtitle;
            TextView textView = (TextView) yum0.f(this, R.id.tvSubtitle);
            if (textView != null) {
                i2 = R.id.tvTitle;
                TextView textView2 = (TextView) yum0.f(this, R.id.tvTitle);
                if (textView2 != null) {
                    i2 = R.id.vTag;
                    DsTag dsTag = (DsTag) yum0.f(this, R.id.vTag);
                    if (dsTag != null) {
                        this.q = new jk3(this, loadableShapeableImageView, textView, textView2, dsTag, (byte) 5);
                        this.r = context.getResources().getDimension(R.dimen.size_128);
                        this.s = context.getResources().getDimension(R.dimen.size_188);
                        setClipToPadding(false);
                        setClipChildren(false);
                        return;
                    }
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) this.r, 1073741824), View.MeasureSpec.makeMeasureSpec((int) this.s, 1073741824));
    }

    public final void setBannerType(rnk rnkVar) {
        int i;
        rnkVar.getClass();
        int iOrdinal = rnkVar.ordinal();
        if (iOrdinal == 0) {
            i = R.style.Widget_DSTag_Rounded_Green;
        } else if (iOrdinal == 1) {
            i = R.style.Widget_DSTag_Rounded_Red;
        } else {
            if (iOrdinal != 2) {
                t9f.b();
                return;
            }
            i = R.style.Widget_DSTag_Rounded_Gray;
        }
        jk3 jk3Var = this.q;
        DsTag dsTag = (DsTag) jk3Var.f;
        DsTag dsTag2 = (DsTag) jk3Var.f;
        dsTag.setStyle(i);
        dsTag2.setAllCaps(true);
        dsTag2.setText(rnkVar.f30791a);
    }

    public final void setSubtitle(String str) {
        str.getClass();
        if (str.equals(this.u)) {
            return;
        }
        this.u = str;
        ((TextView) this.q.d).setText(str);
    }

    public final void setTitle(String str) {
        str.getClass();
        if (str.equals(this.t)) {
            return;
        }
        this.t = str;
        ((TextView) this.q.e).setText(str);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DisciplineBannerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DisciplineBannerView(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
