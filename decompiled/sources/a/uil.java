package a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final class uil extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public sd f35736a;
    public ge b;
    public fe c;
    public final de3 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uil(Context context) {
        super(context, null);
        context.getClass();
        this.f35736a = new sd("", "", "");
        ge geVar = ge.f11126a;
        this.b = geVar;
        getResources().getDimensionPixelSize(R.dimen.space_8);
        this.d = new de3(this, (byte) 4);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, bqd0.b, 0, 0);
        int i = typedArrayObtainStyledAttributes.getInt(0, 0);
        if (i != 0) {
            if (i == 1) {
                geVar = ge.b;
            } else if (i == 2) {
                geVar = ge.c;
            } else if (i == 3) {
                geVar = ge.d;
            } else if (i == 4) {
                geVar = ge.e;
            } else if (i == 5) {
                geVar = ge.f;
            }
        }
        this.b = geVar;
        a();
        typedArrayObtainStyledAttributes.recycle();
        setPaddingRelative(getPaddingStart(), getPaddingTop(), getPaddingEnd(), getPaddingBottom());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v3, types: [a.fe, android.view.View] */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r2v0, types: [a.uil, android.view.View, android.view.ViewGroup] */
    public final void a() {
        ?? tdVar;
        int iOrdinal = this.b.ordinal();
        if (iOrdinal == 0) {
            Context context = getContext();
            context.getClass();
            tdVar = new td(context);
        } else if (iOrdinal == 1) {
            Context context2 = getContext();
            context2.getClass();
            tdVar = new wd(context2);
        } else if (iOrdinal == 2) {
            Context context3 = getContext();
            context3.getClass();
            tdVar = new ie(context3);
        } else if (iOrdinal == 3) {
            Context context4 = getContext();
            context4.getClass();
            tdVar = new ud(context4);
        } else if (iOrdinal == 4) {
            Context context5 = getContext();
            context5.getClass();
            tdVar = new vd(context5);
        } else if (iOrdinal != 5) {
            t9f.b();
            return;
        } else {
            Context context6 = getContext();
            context6.getClass();
            tdVar = new xd(context6);
        }
        removeAllViews();
        addView(tdVar);
        this.c = tdVar;
    }

    public final String getAmount() {
        return this.f35736a.f32009a;
    }

    public final String getAmountAndCurrency() {
        sd sdVar = this.f35736a;
        return ohs0.n(sdVar.f32009a, sdVar.b);
    }

    public final String getVisibleAmount() {
        CharSequence visibleText;
        fe feVar = this.c;
        if (feVar == null || (visibleText = feVar.getVisibleText()) == null) {
            return null;
        }
        return ((Object) visibleText) + this.f35736a.b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        ViewTreeObserver viewTreeObserver;
        super.onAttachedToWindow();
        Object parent = getParent();
        View view = parent instanceof View ? (View) parent : null;
        if (view == null || (viewTreeObserver = view.getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(this.d);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        ViewTreeObserver viewTreeObserver;
        Object parent = getParent();
        View view = parent instanceof View ? (View) parent : null;
        if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(this.d);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        Object obj = this.c;
        View view = obj != null ? (View) obj : null;
        if (view != null) {
            int i5 = i3 - i;
            int i6 = i4 - i2;
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int i7 = (i5 - measuredWidth) / 2;
            int i8 = (i6 - measuredHeight) / 2;
            jmu0.f(i7, i8, measuredWidth + i7, measuredHeight + i8, view, this);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getResources().getDimensionPixelSize(R.dimen.space_48), 1073741824));
    }

    public final void setAccountControlBackground(ColorStateList colorStateList) {
        colorStateList.getClass();
        fe feVar = this.c;
        if (feVar != null) {
            feVar.setBackground(colorStateList);
        }
    }

    public final void setModel(sd sdVar) {
        sdVar.getClass();
        this.f35736a = sdVar;
        fe feVar = this.c;
        if (feVar != null) {
            feVar.setModel(sdVar);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:26:0x0051  */
    public final void setStyle(String str) {
        ge geVar;
        str.getClass();
        str.getClass();
        switch (str) {
            case "quaternary":
                geVar = ge.d;
                break;
            case "tertiary":
                geVar = ge.c;
                break;
            case "senary":
                geVar = ge.f;
                break;
            case "secondary":
                geVar = ge.b;
                break;
            case "primary":
                geVar = ge.f11126a;
                break;
            case "quinary":
                geVar = ge.e;
                break;
            default:
                geVar = ge.f11126a;
                break;
        }
        if (this.b == geVar) {
            return;
        }
        this.b = geVar;
        a();
    }

    public final void setStyle(ge geVar) {
        geVar.getClass();
        if (this.b == geVar) {
            return;
        }
        this.b = geVar;
        a();
    }
}
