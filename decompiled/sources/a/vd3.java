package a;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class vd3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f37213a;
    public final rrc b;

    public vd3(TextView textView) {
        this.f37213a = textView;
        this.b = new rrc(textView);
    }

    public final InputFilter[] a(InputFilter[] inputFilterArr) {
        return ((feb) this.b.b).T(inputFilterArr);
    }

    public final void b(AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = this.f37213a.getContext().obtainStyledAttributes(attributeSet, mqd0.i, i, 0);
        try {
            boolean z = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            d(z);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void c(boolean z) {
        ((feb) this.b.b).f0(z);
    }

    public final void d(boolean z) {
        ((feb) this.b.b).g0(z);
    }
}
