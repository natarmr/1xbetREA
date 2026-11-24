package a;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class ols {

    /* JADX INFO: Fake field, exist only in values array */
    ols EF5;
    public static final /* synthetic */ ols[] b = {new ols(GrsBaseInfo.CountryCodeSource.UNKNOWN, 0), new ols("RUNE", 1), new ols("TOWER_KILL", 2), new ols("HERO_KILL", 3)};
    public static final nls Companion = new nls();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a8z f25473a = maz.a(wez.f39042a, new o9s(15));

    public static ols valueOf(String str) {
        return (ols) Enum.valueOf(ols.class, str);
    }

    public static ols[] values() {
        return (ols[]) b.clone();
    }
}
