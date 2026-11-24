package a;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class ftn extends feb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f10121a;
    public final zsn b;
    public boolean c = true;

    public ftn(TextView textView) {
        this.f10121a = textView;
        this.b = new zsn(textView);
    }

    @Override // a.feb
    public final InputFilter[] T(InputFilter[] inputFilterArr) {
        if (!this.c) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i = 0; i < inputFilterArr.length; i++) {
                InputFilter inputFilter = inputFilterArr[i];
                if (inputFilter instanceof zsn) {
                    sparseArray.put(i, inputFilter);
                }
            }
            if (sparseArray.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
            int i2 = 0;
            for (int i3 = 0; i3 < length; i3++) {
                if (sparseArray.indexOfKey(i3) < 0) {
                    inputFilterArr2[i2] = inputFilterArr[i3];
                    i2++;
                }
            }
            return inputFilterArr2;
        }
        int length2 = inputFilterArr.length;
        int i4 = 0;
        while (true) {
            zsn zsnVar = this.b;
            if (i4 >= length2) {
                InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = zsnVar;
                return inputFilterArr3;
            }
            if (inputFilterArr[i4] == zsnVar) {
                return inputFilterArr;
            }
            i4++;
        }
    }

    @Override // a.feb
    public final boolean d0() {
        return this.c;
    }

    @Override // a.feb
    public final void f0(boolean z) {
        if (z) {
            TextView textView = this.f10121a;
            textView.setTransformationMethod(k0(textView.getTransformationMethod()));
        }
    }

    @Override // a.feb
    public final void g0(boolean z) {
        this.c = z;
        TextView textView = this.f10121a;
        textView.setTransformationMethod(k0(textView.getTransformationMethod()));
        textView.setFilters(T(textView.getFilters()));
    }

    @Override // a.feb
    public final TransformationMethod k0(TransformationMethod transformationMethod) {
        if (this.c) {
            return ((transformationMethod instanceof jtn) || (transformationMethod instanceof PasswordTransformationMethod)) ? transformationMethod : new jtn(transformationMethod);
        }
        return transformationMethod instanceof jtn ? ((jtn) transformationMethod).f17107a : transformationMethod;
    }
}
