package a;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class a1p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a1p f82a;
    public static final a1p b;
    public static final a1p c;
    public static final a1p d;
    public static final /* synthetic */ a1p[] e;

    static {
        a1p a1pVar = new a1p("PERFECT_WIN", 0);
        f82a = a1pVar;
        a1p a1pVar2 = new a1p("TIMEOUT_WIN", 1);
        b = a1pVar2;
        a1p a1pVar3 = new a1p("KNOCKOUT_WIN", 2);
        c = a1pVar3;
        a1p a1pVar4 = new a1p(GrsBaseInfo.CountryCodeSource.UNKNOWN, 3);
        d = a1pVar4;
        e = new a1p[]{a1pVar, a1pVar2, a1pVar3, a1pVar4};
    }

    public static a1p valueOf(String str) {
        return (a1p) Enum.valueOf(a1p.class, str);
    }

    public static a1p[] values() {
        return (a1p[]) e.clone();
    }
}
