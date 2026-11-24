package a;

import android.content.Context;
import android.content.res.TypedArray;
import androidx.appcompat.widget.AppCompatTextView;

/* JADX INFO: loaded from: classes6.dex */
public final class j5i extends AppCompatTextView implements e5i {
    @Override // a.e5i
    public final void e(TypedArray typedArray) {
        Context context = getContext();
        context.getClass();
        setValue(ktt0.p(typedArray, context, 37));
    }

    public final boolean j() {
        CharSequence text = getText();
        return !(text == null || text.length() == 0);
    }

    public final void setValue(CharSequence charSequence) {
        setText(charSequence);
        requestLayout();
    }
}
