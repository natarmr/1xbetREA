package a;

import android.gov.nist.core.Separators;
import org.xplatform.picker.api.presentation.PickerParams;

/* JADX INFO: loaded from: classes3.dex */
public final class k780 implements p780 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17808a;
    public final PickerParams b;

    public k780(int i, PickerParams pickerParams) {
        this.f17808a = i;
        this.b = pickerParams;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k780)) {
            return false;
        }
        k780 k780Var = (k780) obj;
        return this.f17808a == k780Var.f17808a && this.b.equals(k780Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.f17808a) * 31);
    }

    public final String toString() {
        return "OnPickerModelSelected(pickerModelId=" + this.f17808a + ", pickerParams=" + this.b + Separators.RPAREN;
    }
}
