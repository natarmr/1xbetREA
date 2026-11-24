package a;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class fav {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final fav f9228a;
    public static final fav b;
    public static final fav c;
    public static final /* synthetic */ fav[] d;

    static {
        fav favVar = new fav("FIRST_PLAYER_TURN", 0);
        f9228a = favVar;
        fav favVar2 = new fav("SECOND_PLAYER_TURN", 1);
        b = favVar2;
        fav favVar3 = new fav(GrsBaseInfo.CountryCodeSource.UNKNOWN, 2);
        c = favVar3;
        d = new fav[]{favVar, favVar2, favVar3};
    }

    public static fav valueOf(String str) {
        return (fav) Enum.valueOf(fav.class, str);
    }

    public static fav[] values() {
        return (fav[]) d.clone();
    }
}
