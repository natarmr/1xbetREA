package org.xplatform.uikit.components.header;

import a.bqd0;
import a.ktt0;
import a.l0x;
import a.m5d;
import a.nrv;
import a.orv;
import a.prv;
import a.t9f;
import a.vrv;
import a.w0i;
import a.x0i;
import a.y0i;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.uikit.components.buttons.DsButton;
import org.xplatform.uikit.components.tag.DsTag;

/* JADX INFO: loaded from: classes6.dex */
public final class DsHeader extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public View.OnClickListener f47245a;
    public View.OnClickListener b;
    public vrv c;
    public w0i d;
    public prv e;
    public Object f;

    /* JADX WARN: Illegal instructions before constructor call */
    public DsHeader(Context context, AttributeSet attributeSet, int i) {
        w0i w0iVar;
        AttributeSet attributeSet2 = (i & 2) != 0 ? null : attributeSet;
        context.getClass();
        super(context, attributeSet2, R.attr.headerStyle);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.extra_large_horizontal_margin_dynamic);
        vrv vrvVar = vrv.f37920a;
        this.c = vrvVar;
        this.f = getTag();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet2, bqd0.D, R.attr.headerStyle, 0);
        int i2 = typedArrayObtainStyledAttributes.getInt(3, 0);
        if (i2 != 0 && i2 == 1) {
            vrvVar = vrv.b;
        }
        this.c = vrvVar;
        boolean z = typedArrayObtainStyledAttributes.getBoolean(9, false);
        String strP = ktt0.p(typedArrayObtainStyledAttributes, context, 14);
        String str = strP == null ? "" : strP;
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(7);
        String strP2 = ktt0.p(typedArrayObtainStyledAttributes, context, 1);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        String strP3 = ktt0.p(typedArrayObtainStyledAttributes, context, 13);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(11, false);
        int i3 = typedArrayObtainStyledAttributes.getInt(2, -1);
        Integer numL = ktt0.l(typedArrayObtainStyledAttributes, 12);
        int type = typedArrayObtainStyledAttributes.getType(10);
        Integer numL2 = type != 1 ? (type == 28 || type == 29) ? ktt0.l(typedArrayObtainStyledAttributes, 10) : null : Integer.valueOf(m5d.b(typedArrayObtainStyledAttributes.getResourceId(10, 0), context));
        boolean z3 = typedArrayObtainStyledAttributes.getBoolean(8, true);
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, -1);
        if (dimensionPixelSize2 != -1) {
            c(dimensionPixelSize2, dimensionPixelSize2);
        } else {
            c(typedArrayObtainStyledAttributes.getDimensionPixelSize(6, dimensionPixelSize), typedArrayObtainStyledAttributes.getDimensionPixelSize(5, dimensionPixelSize));
        }
        this.e = new nrv(str, z2, strP3, strP2, Integer.valueOf(resourceId), drawable != null ? new l0x(drawable) : null, null, 192);
        a();
        setTagColor(numL);
        setCounter(Integer.valueOf(i3));
        setLabelColor(numL2);
        b(z3);
        if (z && (w0iVar = this.d) != null) {
            w0iVar.c();
        }
        typedArrayObtainStyledAttributes.recycle();
        setTag("dsHeader");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [a.w0i, android.view.View] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.view.View, android.view.ViewGroup, org.xplatform.uikit.components.header.DsHeader] */
    public final void a() {
        ?? x0iVar;
        int iOrdinal = this.c.ordinal();
        if (iOrdinal == 0) {
            Context context = getContext();
            context.getClass();
            x0iVar = new x0i(context);
        } else if (iOrdinal != 1) {
            t9f.b();
            return;
        } else {
            Context context2 = getContext();
            context2.getClass();
            x0iVar = new y0i(context2);
        }
        x0iVar.setButtonClickListener(this.f47245a);
        x0iVar.setTagClickListener(this.b);
        prv prvVar = this.e;
        if (prvVar == null) {
            Intrinsics.h("currentModel");
            throw null;
        }
        x0iVar.setModel(prvVar);
        Object obj = this.d;
        if (obj != null) {
            removeView((View) obj);
        }
        this.d = x0iVar;
        x0iVar.setTag(this.f);
        addView(x0iVar);
    }

    public final void b(boolean z) {
        w0i w0iVar;
        if (!z || (w0iVar = this.d) == null) {
            return;
        }
        w0iVar.setModel(orv.f25754a);
    }

    public final void c(int i, int i2) {
        setPaddingRelative(i, getPaddingTop(), i2, getPaddingBottom());
    }

    public final DsButton getButton() {
        w0i w0iVar = this.d;
        if (w0iVar != null) {
            return w0iVar.getButton();
        }
        return null;
    }

    public final String getLabel() {
        w0i w0iVar = this.d;
        if (w0iVar != null) {
            return w0iVar.getLabelText();
        }
        return null;
    }

    public final DsTag getTagView() {
        w0i w0iVar = this.d;
        if (w0iVar != null) {
            return w0iVar.getTag();
        }
        return null;
    }

    public final void setButtonClickListener(View.OnClickListener onClickListener) {
        this.f47245a = onClickListener;
        w0i w0iVar = this.d;
        if (w0iVar != null) {
            w0iVar.setButtonClickListener(onClickListener);
        }
    }

    public final void setButtonLabel(CharSequence charSequence) {
        w0i w0iVar = this.d;
        if (w0iVar != null) {
            w0iVar.setButtonLabel(charSequence);
        }
    }

    public final void setCounter(Integer num) {
        w0i w0iVar = this.d;
        if (w0iVar != null) {
            w0iVar.setCounter(num);
        }
    }

    public final void setIconColor(Integer num) {
        w0i w0iVar = this.d;
        if (w0iVar != null) {
            w0iVar.setIconColor(num);
        }
    }

    public final void setLabel(CharSequence charSequence) {
        w0i w0iVar = this.d;
        if (w0iVar != null) {
            w0iVar.setLabel(charSequence);
        }
    }

    public final void setLabelClickListener(View.OnClickListener onClickListener) {
        w0i w0iVar = this.d;
        if (w0iVar != null) {
            w0iVar.setLabelClickListener(onClickListener);
        }
    }

    public final void setLabelColor(Integer num) {
        w0i w0iVar = this.d;
        if (w0iVar != null) {
            w0iVar.setLabelColor(num);
        }
    }

    public final void setModel(prv prvVar) {
        prvVar.getClass();
        this.e = prvVar;
        w0i w0iVar = this.d;
        if (w0iVar != null) {
            w0iVar.setModel(prvVar);
        }
    }

    @Override // android.view.View
    public void setTag(Object obj) {
        super.setTag("dsHeader");
        this.f = obj;
        Object obj2 = this.d;
        View view = obj2 != null ? (View) obj2 : null;
        if (view != null) {
            view.setTag(obj);
        }
    }

    public final void setTagClickListener(View.OnClickListener onClickListener) {
        this.b = onClickListener;
        w0i w0iVar = this.d;
        if (w0iVar != null) {
            w0iVar.setTagClickListener(onClickListener);
        }
    }

    public final void setTagColor(Integer num) {
        w0i w0iVar = this.d;
        if (w0iVar != null) {
            w0iVar.setTagColor(num);
        }
    }

    public final void setTagLabel(CharSequence charSequence) {
        w0i w0iVar = this.d;
        if (w0iVar != null) {
            w0iVar.setTagLabel(charSequence);
        }
    }

    public final void setTagStyle(int i) {
        w0i w0iVar = this.d;
        if (w0iVar != null) {
            w0iVar.setTagStyle(i);
        }
    }

    public final void setType(vrv vrvVar) {
        vrvVar.getClass();
        this.c = vrvVar;
        a();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DsHeader(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DsHeader(Context context) {
        this(context, null, 6);
        context.getClass();
    }
}
