package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class bzl0 implements czl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f3475a;

    public bzl0(ArrayList arrayList) {
        this.f3475a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bzl0) && this.f3475a.equals(((bzl0) obj).f3475a);
    }

    public final int hashCode() {
        return this.f3475a.hashCode();
    }

    public final String toString() {
        return hne.o("Success(legendUiModelList=", Separators.RPAREN, this.f3475a);
    }
}
