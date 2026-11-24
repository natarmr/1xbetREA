package a;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class kz7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final kz7 f19141a;
    public static final kz7 b;
    public static final kz7 c;
    public static final kz7 d;
    public static final kz7 e;
    public static final /* synthetic */ kz7[] f;

    static {
        kz7 kz7Var = new kz7("PRE_MATCH", 0);
        f19141a = kz7Var;
        kz7 kz7Var2 = new kz7("THROW_IS_MADE", 1);
        b = kz7Var2;
        kz7 kz7Var3 = new kz7("WAITING_THROW", 2);
        c = kz7Var3;
        kz7 kz7Var4 = new kz7("GAME_FINISHED", 3);
        d = kz7Var4;
        kz7 kz7Var5 = new kz7(GrsBaseInfo.CountryCodeSource.UNKNOWN, 4);
        e = kz7Var5;
        f = new kz7[]{kz7Var, kz7Var2, kz7Var3, kz7Var4, kz7Var5};
    }

    public static kz7 valueOf(String str) {
        return (kz7) Enum.valueOf(kz7.class, str);
    }

    public static kz7[] values() {
        return (kz7[]) f.clone();
    }
}
