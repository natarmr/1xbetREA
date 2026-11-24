package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class w57 implements h77 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f38570a;

    public w57(ArrayList arrayList) {
        this.f38570a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w57) && this.f38570a.equals(((w57) obj).f38570a);
    }

    public final int hashCode() {
        return this.f38570a.hashCode();
    }

    public final String toString() {
        return hne.o("ShowDateFilter(historyDateFilterTypeUiModelList=", Separators.RPAREN, this.f38570a);
    }
}
