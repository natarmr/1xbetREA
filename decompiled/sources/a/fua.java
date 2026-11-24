package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class fua {
    public static final List e;
    public static final List f;
    public static final List g;
    public static final List h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mta f10153a;
    public final zvf b;
    public final kta c;
    public final mne d;

    static {
        dja djaVar = dja.PENALTY;
        dja djaVar2 = dja.COMMON;
        dja djaVar3 = dja.PERIODS;
        dja djaVar4 = dja.HOSTS_AND_GUESTS;
        dja djaVar5 = dja.LAST_GAMES;
        dja djaVar6 = dja.SHORT_STATISTIC;
        dja djaVar7 = dja.LIVE_EVENTS;
        dja djaVar8 = dja.ACTIVE_ZONES;
        dja djaVar9 = dja.STADIUM;
        dja djaVar10 = dja.WEATHER;
        e = q3d.j(djaVar, djaVar2, djaVar3, djaVar4, djaVar5, djaVar6, djaVar7, djaVar8, djaVar9, djaVar10);
        f = q3d.j(djaVar, djaVar2, dja.BROADCASTING_VIDEO, dja.BROADCASTING_ZONE, djaVar4, djaVar5, djaVar6, djaVar7, djaVar8, djaVar9, djaVar10);
        dja djaVar11 = dja.BROADCASTING;
        dja djaVar12 = dja.STADIUM_WEATHER;
        g = q3d.j(djaVar2, djaVar11, djaVar4, djaVar5, djaVar6, djaVar7, djaVar12);
        h = q3d.j(djaVar2, djaVar4, djaVar5, djaVar6, djaVar7, djaVar12);
    }

    public fua(mta mtaVar, zvf zvfVar, kta ktaVar, mne mneVar) {
        mtaVar.getClass();
        zvfVar.getClass();
        ktaVar.getClass();
        this.f10153a = mtaVar;
        this.b = zvfVar;
        this.c = ktaVar;
        this.d = mneVar;
    }

    public static List b(udl0 udl0Var) {
        int iOrdinal = udl0Var.ordinal();
        if (iOrdinal == 0) {
            return e;
        }
        if (iOrdinal == 1) {
            return f;
        }
        if (iOrdinal == 2) {
            return g;
        }
        if (iOrdinal == 3) {
            return h;
        }
        t9f.b();
        return null;
    }

    public final List a(udl0 udl0Var) {
        String string;
        List<String> listSplit$default;
        Object g0g0Var;
        mta mtaVar = this.f10153a;
        mtaVar.getClass();
        q7d0 q7d0Var = mtaVar.f22361a;
        String strC = q7d0.c(q7d0Var, "KEY_CARDS_INFO_SETTINGS_SPORT_GAME_TYPE");
        ArrayList arrayList = null;
        if (!Intrinsics.d(strC, udl0Var.name())) {
            strC = null;
        }
        if (strC != null && (string = q7d0Var.a().getString("KEY_CARDS_INFO_SETTINGS_ORDER", "")) != null) {
            if (StringsKt.W(string)) {
                string = null;
            }
            if (string != null && (listSplit$default = StringsKt__StringsKt.split$default(string, new String[]{Separators.COMMA}, false, 0, 6, null)) != null) {
                ArrayList arrayList2 = new ArrayList();
                for (String str : listSplit$default) {
                    try {
                        e0g0 e0g0Var = j0g0.b;
                        g0g0Var = dja.valueOf(str);
                    } catch (Throwable th) {
                        e0g0 e0g0Var2 = j0g0.b;
                        g0g0Var = new g0g0(th);
                    }
                    if (g0g0Var instanceof g0g0) {
                        g0g0Var = null;
                    }
                    dja djaVar = (dja) g0g0Var;
                    if (djaVar != null) {
                        arrayList2.add(djaVar);
                    }
                }
                arrayList = arrayList2;
            }
        }
        return arrayList == null ? b(udl0Var) : arrayList;
    }
}
