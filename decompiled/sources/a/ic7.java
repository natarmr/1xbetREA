package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class ic7 implements mc7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f14522a;

    public ic7(ArrayList arrayList) {
        this.f14522a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ic7) && this.f14522a.equals(((ic7) obj).f14522a);
    }

    public final int hashCode() {
        return this.f14522a.hashCode();
    }

    public final String toString() {
        return hne.o("ShowMenuItem(historyMenuItemUiModelList=", Separators.RPAREN, this.f14522a);
    }
}
