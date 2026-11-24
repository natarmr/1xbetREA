package a;

import android.gov.nist.core.Separators;
import org.xplatform.picker.api.presentation.PickerParams;

/* JADX INFO: loaded from: classes4.dex */
public final class u0n0 implements v0n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PickerParams.Country f34862a;

    public u0n0(PickerParams.Country country) {
        this.f34862a = country;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u0n0) && this.f34862a.equals(((u0n0) obj).f34862a);
    }

    public final int hashCode() {
        return this.f34862a.hashCode();
    }

    public final String toString() {
        return "ShowPickerDialog(pickerParams=" + this.f34862a + Separators.RPAREN;
    }
}
