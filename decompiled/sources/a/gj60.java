package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class gj60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f11381a;

    public gj60(ArrayList arrayList) {
        this.f11381a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gj60) && this.f11381a.equals(((gj60) obj).f11381a);
    }

    public final int hashCode() {
        return this.f11381a.hashCode();
    }

    public final String toString() {
        return hne.o("OnboardingCyberSectionsState(sectionList=", Separators.RPAREN, this.f11381a);
    }
}
