package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class zko {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zko f44542a;
    public static final zko b;
    public static final zko c;
    public static final zko d;
    public static final /* synthetic */ zko[] e;

    static {
        zko zkoVar = new zko("REPLACE", 0);
        f44542a = zkoVar;
        zko zkoVar2 = new zko("KEEP", 1);
        b = zkoVar2;
        zko zkoVar3 = new zko("APPEND", 2);
        c = zkoVar3;
        zko zkoVar4 = new zko("APPEND_OR_REPLACE", 3);
        d = zkoVar4;
        e = new zko[]{zkoVar, zkoVar2, zkoVar3, zkoVar4};
    }

    public static zko valueOf(String str) {
        return (zko) Enum.valueOf(zko.class, str);
    }

    public static zko[] values() {
        return (zko[]) e.clone();
    }
}
