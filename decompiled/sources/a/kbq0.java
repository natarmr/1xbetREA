package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class kbq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f18027a;

    public kbq0(ArrayList arrayList) {
        this.f18027a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kbq0) && this.f18027a.equals(((kbq0) obj).f18027a);
    }

    public final int hashCode() {
        return this.f18027a.hashCode();
    }

    public final String toString() {
        return hne.o("ThemeSelectorUiState(content=", Separators.RPAREN, this.f18027a);
    }
}
