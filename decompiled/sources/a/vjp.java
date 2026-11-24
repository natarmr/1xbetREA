package a;

import a.m1r;
import a.nek;
import a.rop;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import org.xplatform.ufc.impl.navigation.UfcScreensFactoryImpl$getChampionshipFragmentScreen$1;

/* JADX INFO: loaded from: classes4.dex */
public final class vjp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pru f37540a;

    public /* synthetic */ vjp(pru pruVar) {
        this.f37540a = pruVar;
    }

    public FragmentScreen a(j700 j700Var) {
        j700Var.getClass();
        return b(j700Var, y8h0.f42195a, xun.f41520a, -1L, "");
    }

    public FragmentScreen b(j700 j700Var, f9h0 f9h0Var, Set set, long j, String str) {
        j700Var.getClass();
        set.getClass();
        str.getClass();
        return c("", j700Var, f9h0Var, set, j, str);
    }

    public FragmentScreen c(final String str, final j700 j700Var, final f9h0 f9h0Var, final Set set, long j, String str2) {
        str.getClass();
        j700Var.getClass();
        set.getClass();
        str2.getClass();
        return (this.f37540a.a().c.d && j == 189 && set.size() == 1) ? new UfcScreensFactoryImpl$getChampionshipFragmentScreen$1(((Number) CollectionsKt.T(set)).longValue(), str2) : new FragmentScreen() { // from class: org.xplatform.feed.navigation.FeedScreenFactoryImpl$getFeedChampionshipScreen$1
            @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
            public final Fragment a(m1r m1rVar) {
                m1rVar.getClass();
                rop.a2.getClass();
                return nek.l(j700Var, f9h0Var, str, set);
            }

            @Override // a.m7h0
            /* JADX INFO: renamed from: b */
            public final String getF45455a() {
                return "FeedsComposeScreenFragment".concat(f9h0Var.getClass().getSimpleName());
            }

            @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
            /* JADX INFO: renamed from: g */
            public final /* bridge */ boolean getB() {
                return true;
            }
        };
    }

    public k77 d() {
        int iOrdinal = this.f37540a.a().g.u.ordinal();
        if (iOrdinal == 0) {
            return k77.NO_TABS_CLASSIC;
        }
        if (iOrdinal == 1) {
            return k77.TABS_EXPANDABLE_CARDS;
        }
        if (iOrdinal == 2) {
            return k77.NO_TABS_EXPANDABLE_CARDS;
        }
        if (iOrdinal != 3) {
            return iOrdinal != 4 ? k77.OLD_HISTORY : k77.TABS_AND_ACCORDEON;
        }
        return k77.COMPACT_NO_EXPAND;
    }

    public v5l0 e() {
        return this.f37540a.a().g.y;
    }

    public vjp(pru pruVar, kys0 kys0Var) {
        this.f37540a = pruVar;
    }
}
