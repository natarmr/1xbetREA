package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class zmb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zmb f44617a;
    public static final zmb b;
    public static final /* synthetic */ zmb[] c;

    static {
        zmb zmbVar = new zmb("DEFAULT", 0);
        f44617a = zmbVar;
        zmb zmbVar2 = new zmb("BY_COUNTRIES", 1);
        b = zmbVar2;
        c = new zmb[]{zmbVar, zmbVar2};
    }

    public static zmb valueOf(String str) {
        return (zmb) Enum.valueOf(zmb.class, str);
    }

    public static zmb[] values() {
        return (zmb[]) c.clone();
    }
}
