package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class opa extends spa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f25631a;

    public opa(ArrayList arrayList) {
        this.f25631a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof opa) && this.f25631a.equals(((opa) obj).f25631a);
    }

    public final int hashCode() {
        return this.f25631a.hashCode();
    }

    public final String toString() {
        return hne.o("TeamOnePenaltyListChanged(penaltyUiModelList=", Separators.RPAREN, this.f25631a);
    }
}
