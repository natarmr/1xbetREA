package org.xplatform.uikit.components.password_requirement;

import a.bqd0;
import a.ccf;
import a.dc3;
import a.hny;
import a.jw5;
import a.wg;
import a.yum0;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import java.io.IOException;
import java.util.List;
import org.xbet.client1.R;
import org.xplatform.uikit.components.accordion.DsAccordion;

/* JADX INFO: loaded from: classes6.dex */
public final class DsPasswordRequirement extends FrameLayout {
    public static final /* synthetic */ int c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dc3 f47255a;
    public boolean b;

    /* JADX WARN: Illegal instructions before constructor call */
    public DsPasswordRequirement(Context context, AttributeSet attributeSet, int i) {
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet, 0);
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.password_requirement_view, (ViewGroup) this, false);
        addView(viewInflate);
        int i2 = R.id.accordion;
        DsAccordion dsAccordion = (DsAccordion) yum0.f(viewInflate, R.id.accordion);
        if (dsAccordion != null) {
            i2 = R.id.barrier;
            if (((Barrier) yum0.f(viewInflate, R.id.barrier)) != null) {
                i2 = R.id.ivInfo;
                if (((ImageView) yum0.f(viewInflate, R.id.ivInfo)) != null) {
                    i2 = R.id.requirements;
                    DsBulletList dsBulletList = (DsBulletList) yum0.f(viewInflate, R.id.requirements);
                    if (dsBulletList != null) {
                        i2 = R.id.tvTitle;
                        TextView textView = (TextView) yum0.f(viewInflate, R.id.tvTitle);
                        if (textView != null) {
                            this.f47255a = new dc3((ViewGroup) viewInflate, (View) dsAccordion, (Object) dsBulletList, (Object) textView, (byte) 8);
                            this.b = true;
                            setClipToOutline(true);
                            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bqd0.W, 0, 0);
                            setExpandable(typedArrayObtainStyledAttributes.getBoolean(0, this.b));
                            post(new ccf(this, (byte) 16));
                            setOnTouchListener(new jw5(this, (byte) 5));
                            typedArrayObtainStyledAttributes.recycle();
                            return;
                        }
                    }
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
        throw null;
    }

    public final void setExpandable(boolean z) {
        this.b = z;
        dc3 dc3Var = this.f47255a;
        ((DsAccordion) dc3Var.c).setVisibility(z ? 0 : 8);
        ((DsBulletList) dc3Var.d).setVisibility(z ? 8 : 0);
    }

    public final void setOnBlockClickListener(View.OnClickListener onClickListener) {
        ((DsAccordion) this.f47255a.c).setOnClickListener(new wg((Object) onClickListener, (Object) this, (byte) 18));
    }

    public final void setRequirements(List<? extends CharSequence> list) throws IOException {
        list.getClass();
        dc3 dc3Var = this.f47255a;
        ((DsBulletList) dc3Var.d).setText("");
        ((DsBulletList) dc3Var.d).setLabels(list);
    }

    public final void setTitle(int i) {
        setTitle(getContext().getString(i));
    }

    public final void setTitle(CharSequence charSequence) {
        ((TextView) this.f47255a.e).setText(charSequence);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DsPasswordRequirement(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DsPasswordRequirement(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
