package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class r0o0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f29639a;

    public r0o0(ArrayList arrayList) {
        this.f29639a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r0o0) && this.f29639a.equals(((r0o0) obj).f29639a);
    }

    @Override // a.p6t0
    public final String getKey() {
        return "ASSAULT_SQUAD_ROUND_HEADER_KEY";
    }

    public final int hashCode() {
        return this.f29639a.hashCode() + twn.a(R.drawable.cybergame_synthetic_assault_squad_header_bg, -757923269, 31);
    }

    public final String toString() {
        return "SyntheticAssaultSquadHeaderUiModel(key=ASSAULT_SQUAD_ROUND_HEADER_KEY, background=" + R.drawable.cybergame_synthetic_assault_squad_header_bg + ", roundInfoList=" + this.f29639a + Separators.RPAREN;
    }
}
