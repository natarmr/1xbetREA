package a;

import android.gov.nist.core.Separators;
import org.xplatform.picker.api.presentation.PickerParams;

/* JADX INFO: loaded from: classes3.dex */
public final class v780 implements x780 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PickerParams.Phone f36912a;

    public v780(PickerParams.Phone phone) {
        this.f36912a = phone;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v780) && this.f36912a.equals(((v780) obj).f36912a);
    }

    public final int hashCode() {
        return this.f36912a.hashCode();
    }

    public final String toString() {
        return "ShowPickerDialog(pickerParams=" + this.f36912a + Separators.RPAREN;
    }
}
