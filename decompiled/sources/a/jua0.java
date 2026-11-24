package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class jua0 extends mua0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f17144a;

    public jua0(ArrayList arrayList) {
        this.f17144a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jua0) && this.f17144a.equals(((jua0) obj).f17144a);
    }

    public final int hashCode() {
        return this.f17144a.hashCode();
    }

    public final String toString() {
        return hne.o("Content(polybetInfoUiModelList=", Separators.RPAREN, this.f17144a);
    }
}
