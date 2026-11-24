package a;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class yeq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final yeq0 f42501a;
    public static final yeq0 b;
    public static final yeq0 c;
    public static final yeq0 d;
    public static final yeq0 e;
    public static final /* synthetic */ yeq0[] f;

    static {
        yeq0 yeq0Var = new yeq0("ACTIVE", 0);
        f42501a = yeq0Var;
        yeq0 yeq0Var2 = new yeq0("WIN", 1);
        b = yeq0Var2;
        yeq0 yeq0Var3 = new yeq0("LOSE", 2);
        c = yeq0Var3;
        yeq0 yeq0Var4 = new yeq0("RETURN", 3);
        d = yeq0Var4;
        yeq0 yeq0Var5 = new yeq0(GrsBaseInfo.CountryCodeSource.UNKNOWN, 4);
        e = yeq0Var5;
        f = new yeq0[]{yeq0Var, yeq0Var2, yeq0Var3, yeq0Var4, yeq0Var5};
    }

    public static yeq0 valueOf(String str) {
        return (yeq0) Enum.valueOf(yeq0.class, str);
    }

    public static yeq0[] values() {
        return (yeq0[]) f.clone();
    }
}
