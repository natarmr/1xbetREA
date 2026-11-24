package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class mq20 implements pq20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f22203a;

    public final boolean equals(Object obj) {
        if (obj instanceof mq20) {
            return this.f22203a.equals(((mq20) obj).f22203a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f22203a.hashCode();
    }

    public final String toString() {
        return hne.o("ScoreList(value=", Separators.RPAREN, this.f22203a);
    }
}
