package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class jqm0 implements lqm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f16961a;

    public jqm0(ArrayList arrayList) {
        this.f16961a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jqm0) && this.f16961a.equals(((jqm0) obj).f16961a);
    }

    public final int hashCode() {
        return this.f16961a.hashCode();
    }

    public final String toString() {
        return hne.o("ItemList(itemList=", Separators.RPAREN, this.f16961a);
    }
}
