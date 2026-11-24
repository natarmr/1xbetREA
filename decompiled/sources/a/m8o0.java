package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes2.dex */
public final class m8o0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f21382a;

    public m8o0(ArrayList arrayList) {
        this.f21382a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m8o0) && this.f21382a.equals(((m8o0) obj).f21382a);
    }

    @Override // a.p6t0
    public final String getKey() {
        return "TENNIS_ROUND_HEADER_KEY";
    }

    public final int hashCode() {
        return this.f21382a.hashCode() + twn.a(R.drawable.cybergame_synthetic_tennis_header_bg, 1224544350, 31);
    }

    public final String toString() {
        return "SyntheticTennisHeaderUiModel(key=TENNIS_ROUND_HEADER_KEY, background=" + R.drawable.cybergame_synthetic_tennis_header_bg + ", setInfoList=" + this.f21382a + Separators.RPAREN;
    }
}
