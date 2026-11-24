package a;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class nqy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final nqy f23976a;
    public static final nqy b;
    public static final nqy c;
    public static final nqy d;
    public static final /* synthetic */ nqy[] e;

    static {
        nqy nqyVar = new nqy("LANGUAGE_VERSION", 0);
        f23976a = nqyVar;
        nqy nqyVar2 = new nqy("COMPILER_VERSION", 1);
        b = nqyVar2;
        nqy nqyVar3 = new nqy("API_VERSION", 2);
        c = nqyVar3;
        nqy nqyVar4 = new nqy(GrsBaseInfo.CountryCodeSource.UNKNOWN, 3);
        d = nqyVar4;
        e = new nqy[]{nqyVar, nqyVar2, nqyVar3, nqyVar4};
    }

    public static nqy valueOf(String str) {
        return (nqy) Enum.valueOf(nqy.class, str);
    }

    public static nqy[] values() {
        return (nqy[]) e.clone();
    }
}
