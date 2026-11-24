package a;

import android.gov.nist.core.Separators;
import org.xplatform.picker.api.presentation.PickerParams;

/* JADX INFO: loaded from: classes3.dex */
public final class v880 implements w880 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PickerParams.Language f36970a;

    public v880(PickerParams.Language language) {
        this.f36970a = language;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v880) && this.f36970a.equals(((v880) obj).f36970a);
    }

    public final int hashCode() {
        return this.f36970a.hashCode();
    }

    public final String toString() {
        return "ShowPickerRedesignDialog(pickerParams=" + this.f36970a + Separators.RPAREN;
    }
}
