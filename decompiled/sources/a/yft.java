package a;

import android.gov.nist.core.Separators;
import java.io.Serializable;

/* JADX INFO: loaded from: classes5.dex */
public final class yft implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f42556a;

    public yft(int i) {
        this.f42556a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yft) && this.f42556a == ((yft) obj).f42556a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f42556a) - 2107601939;
    }

    public final String toString() {
        return ua80.e(this.f42556a, "GenderChoiceScreenParams(requestKey=GENDER_CHOICE_ITEM_KEY, selectedGenderId=", Separators.RPAREN);
    }
}
