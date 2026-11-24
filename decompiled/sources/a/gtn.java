package a;

import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class gtn extends feb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ftn f11889a;

    public gtn(TextView textView) {
        this.f11889a = new ftn(textView);
    }

    @Override // a.feb
    public final InputFilter[] T(InputFilter[] inputFilterArr) {
        return !qsn.d() ? inputFilterArr : this.f11889a.T(inputFilterArr);
    }

    @Override // a.feb
    public final boolean d0() {
        return this.f11889a.c;
    }

    @Override // a.feb
    public final void f0(boolean z) {
        if (qsn.d()) {
            this.f11889a.f0(z);
        }
    }

    @Override // a.feb
    public final void g0(boolean z) {
        boolean zD = qsn.d();
        ftn ftnVar = this.f11889a;
        if (zD) {
            ftnVar.g0(z);
        } else {
            ftnVar.c = z;
        }
    }

    @Override // a.feb
    public final TransformationMethod k0(TransformationMethod transformationMethod) {
        return !qsn.d() ? transformationMethod : this.f11889a.k0(transformationMethod);
    }
}
