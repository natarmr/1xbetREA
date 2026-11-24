package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class eyh0 implements hyh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f8629a;

    public final boolean equals(Object obj) {
        if (obj instanceof eyh0) {
            return this.f8629a.equals(((eyh0) obj).f8629a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f8629a.hashCode();
    }

    public final String toString() {
        return hne.o("SecondPlayerCards(value=", Separators.RPAREN, this.f8629a);
    }
}
