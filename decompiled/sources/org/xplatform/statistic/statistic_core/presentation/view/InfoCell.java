package org.xplatform.statistic.statistic_core.presentation.view;

import a.hny;
import a.j6j;
import a.yum0;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.text.StringsKt;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
public final class InfoCell extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j6j f47081a;

    /* JADX WARN: Illegal instructions before constructor call */
    public InfoCell(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, 0);
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.view_info_cell, (ViewGroup) this, false);
        addView(viewInflate);
        int i2 = R.id.ivIcon;
        ImageView imageView = (ImageView) yum0.f(viewInflate, R.id.ivIcon);
        if (imageView != null) {
            i2 = R.id.tvDescription;
            TextView textView = (TextView) yum0.f(viewInflate, R.id.tvDescription);
            if (textView != null) {
                i2 = R.id.tvTitle;
                TextView textView2 = (TextView) yum0.f(viewInflate, R.id.tvTitle);
                if (textView2 != null) {
                    this.f47081a = new j6j((ConstraintLayout) viewInflate, imageView, textView, textView2, (byte) 5);
                    return;
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
        throw null;
    }

    public final void setDescription(String str) {
        str.getClass();
        j6j j6jVar = this.f47081a;
        j6jVar.c.setVisibility(!StringsKt.W(str) ? 0 : 8);
        j6jVar.c.setText(str);
    }

    public final void setIcon(int i) {
        j6j j6jVar = this.f47081a;
        j6jVar.e.setVisibility(i != 0 ? 0 : 8);
        j6jVar.e.setImageResource(i);
    }

    public final void setTitle(String str) {
        str.getClass();
        j6j j6jVar = this.f47081a;
        j6jVar.d.setVisibility(!StringsKt.W(str) ? 0 : 8);
        j6jVar.d.setText(str);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InfoCell(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InfoCell(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
