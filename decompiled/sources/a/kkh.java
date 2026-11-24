package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.cyber.section.impl.tournament_bracket.presentation.match_diaolog.model.CyberTournamentBracketMatchParams;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class kkh implements lwv0 {
    public static final jkh Companion = new jkh();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CyberTournamentBracketMatchParams f18439a;

    public /* synthetic */ kkh(int i, CyberTournamentBracketMatchParams cyberTournamentBracketMatchParams) {
        if (1 == (i & 1)) {
            this.f18439a = cyberTournamentBracketMatchParams;
        } else {
            m2x.I(i, 1, ikh.f14925a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kkh) && Intrinsics.d(this.f18439a, ((kkh) obj).f18439a);
    }

    public final int hashCode() {
        return this.f18439a.hashCode();
    }

    public final String toString() {
        return "CyberTournamentBracketMatchRoute(params=" + this.f18439a + Separators.RPAREN;
    }

    public kkh(CyberTournamentBracketMatchParams cyberTournamentBracketMatchParams) {
        this.f18439a = cyberTournamentBracketMatchParams;
    }
}
