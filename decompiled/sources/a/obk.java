package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class obk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final obk f24984a;
    public static final /* synthetic */ obk[] b;

    /* JADX INFO: Fake field, exist only in values array */
    obk EF0;

    static {
        obk obkVar = new obk("WARNING", 0);
        obk obkVar2 = new obk("ERROR", 1);
        f24984a = obkVar2;
        b = new obk[]{obkVar, obkVar2, new obk("HIDDEN", 2)};
    }

    public static obk valueOf(String str) {
        return (obk) Enum.valueOf(obk.class, str);
    }

    public static obk[] values() {
        return (obk[]) b.clone();
    }
}
