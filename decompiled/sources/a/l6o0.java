package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class l6o0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f19517a;

    public l6o0(ArrayList arrayList) {
        this.f19517a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l6o0) && this.f19517a.equals(((l6o0) obj).f19517a);
    }

    @Override // a.p6t0
    public final String getKey() {
        return "MARBLE_MMA_ROUND_HEADER_KEY";
    }

    public final int hashCode() {
        return this.f19517a.hashCode() + twn.a(R.drawable.cybergame_synthetic_marble_mma_header_bg, 474641698, 31);
    }

    public final String toString() {
        return "SyntheticMarbleMmaStatisticHeaderUiModel(key=MARBLE_MMA_ROUND_HEADER_KEY, background=" + R.drawable.cybergame_synthetic_marble_mma_header_bg + ", roundInfoList=" + this.f19517a + Separators.RPAREN;
    }
}
