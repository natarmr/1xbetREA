package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class toh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final toh f34283a;
    public static final toh b;
    public static final toh c;
    public static final /* synthetic */ toh[] d;

    static {
        toh tohVar = new toh("FIRST_OPPONENT", 0);
        f34283a = tohVar;
        toh tohVar2 = new toh("SECOND_OPPONENT", 1);
        b = tohVar2;
        toh tohVar3 = new toh("NOBODY", 2);
        c = tohVar3;
        d = new toh[]{tohVar, tohVar2, tohVar3};
    }

    public static toh valueOf(String str) {
        return (toh) Enum.valueOf(toh.class, str);
    }

    public static toh[] values() {
        return (toh[]) d.clone();
    }
}
