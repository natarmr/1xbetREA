package a;

import android.content.Context;
import android.content.res.TypedArray;
import androidx.appcompat.widget.AppCompatTextView;

/* JADX INFO: loaded from: classes6.dex */
public final class f5i extends AppCompatTextView implements e5i {
    public boolean i;
    public boolean j;
    public int k;
    public int l;
    public int m;

    @Override // a.e5i
    public final void e(TypedArray typedArray) {
        int iB;
        int iB2;
        int i;
        typedArray.getDrawable(18);
        int type = typedArray.getType(25);
        if (type != 1) {
            iB = (type == 28 || type == 29) ? typedArray.getColor(25, this.k) : this.k;
        } else {
            Context context = getContext();
            context.getClass();
            iB = m5d.b(typedArray.getResourceId(25, this.k), context);
        }
        this.k = iB;
        int type2 = typedArray.getType(26);
        if (type2 != 1) {
            iB2 = (type2 == 28 || type2 == 29) ? typedArray.getColor(26, this.k) : this.l;
        } else {
            Context context2 = getContext();
            context2.getClass();
            iB2 = m5d.b(typedArray.getResourceId(26, this.l), context2);
        }
        this.l = iB2;
        Context context3 = getContext();
        context3.getClass();
        String strP = ktt0.p(typedArray, context3, 24);
        String string = strP != null ? strP.toString() : null;
        if (string == null) {
            string = "";
        }
        setText(string);
        setTextSize(0, typedArray.getDimension(27, getTextSize()));
        boolean z = typedArray.getBoolean(31, this.i);
        this.i = z;
        if (z) {
            i = this.k;
        } else {
            i = this.j ? this.m : this.l;
        }
        setTextColor(i);
    }
}
