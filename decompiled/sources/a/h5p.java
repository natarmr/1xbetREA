package a;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class h5p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h5p f12492a;
    public static final h5p b;
    public static final h5p c;
    public static final /* synthetic */ h5p[] d;

    static {
        h5p h5pVar = new h5p(GrsBaseInfo.CountryCodeSource.UNKNOWN, 0);
        f12492a = h5pVar;
        h5p h5pVar2 = new h5p("TOP_CHAMP", 1);
        b = h5pVar2;
        h5p h5pVar3 = new h5p("NEW_CHAMP", 2);
        c = h5pVar3;
        d = new h5p[]{h5pVar, h5pVar2, h5pVar3};
    }

    public static h5p valueOf(String str) {
        return (h5p) Enum.valueOf(h5p.class, str);
    }

    public static h5p[] values() {
        return (h5p[]) d.clone();
    }
}
