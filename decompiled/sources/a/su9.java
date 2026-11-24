package a;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class su9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final kj5 f32810a;
    public static final su9 b;
    public static final su9 c;
    public static final su9 d;
    public static final su9 e;
    public static final su9 f;
    public static final su9 g;
    public static final /* synthetic */ su9[] h;

    static {
        su9 su9Var = new su9(GrsBaseInfo.CountryCodeSource.UNKNOWN, 0);
        b = su9Var;
        su9 su9Var2 = new su9("WAITING", 1);
        c = su9Var2;
        su9 su9Var3 = new su9("ACCEPTED", 2);
        d = su9Var3;
        su9 su9Var4 = new su9("NO_ANSWER", 3);
        e = su9Var4;
        su9 su9Var5 = new su9("CANCELED_BY_USER", 4);
        f = su9Var5;
        su9 su9Var6 = new su9("CANCELED_BY_OPERATOR", 5);
        g = su9Var6;
        h = new su9[]{su9Var, su9Var2, su9Var3, su9Var4, su9Var5, su9Var6};
        f32810a = new kj5();
    }

    public static su9 valueOf(String str) {
        return (su9) Enum.valueOf(su9.class, str);
    }

    public static su9[] values() {
        return (su9[]) h.clone();
    }
}
