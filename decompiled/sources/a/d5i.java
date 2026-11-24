package a;

import android.content.Context;
import android.content.res.TypedArray;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d5i extends AppCompatTextView implements e5i {
    public boolean i;
    public int j;
    public int k;
    public CharSequence l;
    public CharSequence m;

    @Override // a.e5i
    public final void e(TypedArray typedArray) {
        int iB;
        int iB2;
        setTag("DSTextFieldHelperView");
        typedArray.getDrawable(18);
        int type = typedArray.getType(19);
        if (type != 1) {
            iB = (type == 28 || type == 29) ? typedArray.getColor(19, this.j) : this.j;
        } else {
            Context context = getContext();
            context.getClass();
            iB = m5d.b(typedArray.getResourceId(19, this.j), context);
        }
        this.j = iB;
        int type2 = typedArray.getType(22);
        if (type2 != 1) {
            iB2 = (type2 == 28 || type2 == 29) ? typedArray.getColor(22, this.j) : this.k;
        } else {
            Context context2 = getContext();
            context2.getClass();
            iB2 = m5d.b(typedArray.getResourceId(22, this.k), context2);
        }
        this.k = iB2;
        Context context3 = getContext();
        context3.getClass();
        this.m = ktt0.p(typedArray, context3, 21);
        Context context4 = getContext();
        context4.getClass();
        this.l = ktt0.p(typedArray, context4, 17);
        setTextSize(0, typedArray.getDimension(23, getTextSize()));
        boolean z = typedArray.getBoolean(31, this.i);
        this.i = z;
        setTextColor(z ? this.j : this.k);
        j();
    }

    public final void j() {
        CharSequence charSequence;
        setText((!this.i || (charSequence = this.l) == null || charSequence.length() == 0) ? this.m : this.l);
        requestLayout();
    }

    public final void setErrorText(CharSequence charSequence) {
        this.l = charSequence;
        j();
    }

    public final void setValue(CharSequence charSequence) {
        CharSequence charSequence2 = this.m;
        if (charSequence2 != null && charSequence2.length() != 0 && charSequence != null && charSequence.length() != 0 && !Intrinsics.d(this.m, charSequence)) {
            requestLayout();
        }
        this.m = charSequence;
        j();
    }
}
