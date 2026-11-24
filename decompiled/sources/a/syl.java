package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class syl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final syl f33027a;
    public static final syl b;
    public static final /* synthetic */ syl[] c;

    static {
        syl sylVar = new syl("HORIZONTAL", 0);
        f33027a = sylVar;
        syl sylVar2 = new syl("VERTICAL", 1);
        b = sylVar2;
        c = new syl[]{sylVar, sylVar2};
    }

    public static syl valueOf(String str) {
        return (syl) Enum.valueOf(syl.class, str);
    }

    public static syl[] values() {
        return (syl[]) c.clone();
    }
}
