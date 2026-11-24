package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class l6e implements p6e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f19503a;

    public l6e(ArrayList arrayList) {
        this.f19503a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l6e) && this.f19503a.equals(((l6e) obj).f19503a);
    }

    public final int hashCode() {
        return this.f19503a.hashCode();
    }

    public final String toString() {
        return hne.o("ShowErrorBottomDialog(messageErrorStateList=", Separators.RPAREN, this.f19503a);
    }
}
