package a;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class n9j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n9j f23142a;
    public static final n9j b;
    public static final n9j c;
    public static final /* synthetic */ n9j[] d;

    static {
        n9j n9jVar = new n9j("FIRST_PLAYER_WIN", 0);
        f23142a = n9jVar;
        n9j n9jVar2 = new n9j("SECOND_PLAYER_WIN", 1);
        b = n9jVar2;
        n9j n9jVar3 = new n9j(GrsBaseInfo.CountryCodeSource.UNKNOWN, 2);
        c = n9jVar3;
        d = new n9j[]{n9jVar, n9jVar2, n9jVar3};
    }

    public static n9j valueOf(String str) {
        return (n9j) Enum.valueOf(n9j.class, str);
    }

    public static n9j[] values() {
        return (n9j[]) d.clone();
    }
}
