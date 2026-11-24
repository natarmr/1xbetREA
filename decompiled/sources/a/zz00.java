package a;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class zz00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zz00 f45230a;
    public static final zz00 b;
    public static final zz00 c;
    public static final zz00 d;
    public static final zz00 e;
    public static final /* synthetic */ zz00[] f;

    static {
        zz00 zz00Var = new zz00(GrsBaseInfo.CountryCodeSource.UNKNOWN, 0);
        f45230a = zz00Var;
        zz00 zz00Var2 = new zz00("IN_HERO_SELECTION", 1);
        b = zz00Var2;
        zz00 zz00Var3 = new zz00("WAITING_FOR_START", 2);
        c = zz00Var3;
        zz00 zz00Var4 = new zz00("PLAY", 3);
        d = zz00Var4;
        zz00 zz00Var5 = new zz00("MAP_FINISHED", 4);
        e = zz00Var5;
        f = new zz00[]{zz00Var, zz00Var2, zz00Var3, zz00Var4, zz00Var5};
    }

    public static zz00 valueOf(String str) {
        return (zz00) Enum.valueOf(zz00.class, str);
    }

    public static zz00[] values() {
        return (zz00[]) f.clone();
    }
}
