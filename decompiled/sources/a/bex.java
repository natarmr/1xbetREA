package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class bex {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final bex f2473a;
    public static final bex b;
    public static final bex c;
    public static final /* synthetic */ bex[] d;

    static {
        bex bexVar = new bex("INNING_FIRST_TEAM", 0);
        f2473a = bexVar;
        bex bexVar2 = new bex("INNING_SECOND_TEAM", 1);
        b = bexVar2;
        bex bexVar3 = new bex("INNING_NO_ONE", 2);
        c = bexVar3;
        d = new bex[]{bexVar, bexVar2, bexVar3};
    }

    public static bex valueOf(String str) {
        return (bex) Enum.valueOf(bex.class, str);
    }

    public static bex[] values() {
        return (bex[]) d.clone();
    }
}
