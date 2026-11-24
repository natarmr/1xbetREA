package a;

import android.gov.nist.core.Separators;
import org.xplatform.picker.api.presentation.PickerParams;

/* JADX INFO: loaded from: classes5.dex */
public final class hb4 implements lb4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PickerParams.Phone f12753a;

    public hb4(PickerParams.Phone phone) {
        this.f12753a = phone;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hb4) && this.f12753a.equals(((hb4) obj).f12753a);
    }

    public final int hashCode() {
        return this.f12753a.hashCode();
    }

    public final String toString() {
        return "ShowAuthPickerDialog(pickerParams=" + this.f12753a + Separators.RPAREN;
    }
}
