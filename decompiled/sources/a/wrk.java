package a;

import kotlin.jvm.internal.Intrinsics;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;

/* JADX INFO: loaded from: classes4.dex */
public abstract class wrk {
    public static final urk a(v5l0 v5l0Var, CyberGamesPage cyberGamesPage, boolean z) {
        l0l0 l0l0Var;
        q0s q0sVar = Intrinsics.d(cyberGamesPage, CyberGamesPage.Virtual.INSTANCE) ? q0s.f27918a : q0s.b;
        int iOrdinal = v5l0Var.ordinal();
        if (iOrdinal == 0) {
            l0l0Var = g0l0.f10465a;
        } else if (iOrdinal == 1) {
            l0l0Var = k0l0.f17474a;
        } else if (iOrdinal == 2) {
            l0l0Var = j0l0.f15687a;
        } else if (iOrdinal == 3) {
            l0l0Var = i0l0.f13953a;
        } else {
            if (iOrdinal != 4) {
                t9f.b();
                return null;
            }
            l0l0Var = h0l0.f12241a;
        }
        return new urk(z ? "shimmer_live_events" : "shimmer_line_events", w7m.f38680a, new vb90(q0sVar, dyb.g0(new x56(l0l0Var), new x56(l0l0Var), new x56(l0l0Var)), false, true));
    }
}
