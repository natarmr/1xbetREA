package a;

import android.gov.nist.core.Separators;
import org.xplatform.picker.api.presentation.PickerParams;

/* JADX INFO: loaded from: classes3.dex */
public final class u880 implements w880 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PickerParams.Phone f35222a;

    public u880(PickerParams.Phone phone) {
        this.f35222a = phone;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u880) && this.f35222a.equals(((u880) obj).f35222a);
    }

    public final int hashCode() {
        return this.f35222a.hashCode();
    }

    public final String toString() {
        return "ShowPickerDialog(pickerParams=" + this.f35222a + Separators.RPAREN;
    }
}
