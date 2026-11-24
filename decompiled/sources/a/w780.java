package a;

import android.gov.nist.core.Separators;
import org.xplatform.picker.api.presentation.PickerParams;

/* JADX INFO: loaded from: classes3.dex */
public final class w780 implements x780 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PickerParams.Language f38660a;

    public w780(PickerParams.Language language) {
        this.f38660a = language;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w780) && this.f38660a.equals(((w780) obj).f38660a);
    }

    public final int hashCode() {
        return this.f38660a.hashCode();
    }

    public final String toString() {
        return "ShowPickerRedesignDialog(pickerParams=" + this.f38660a + Separators.RPAREN;
    }
}
