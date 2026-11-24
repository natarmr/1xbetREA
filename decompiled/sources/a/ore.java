package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ore {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ore f25731a;
    public static final ore b;
    public static final ore c;
    public static final ore d;
    public static final ore e;
    public static final /* synthetic */ ore[] f;

    static {
        ore oreVar = new ore("SAVE", 0);
        f25731a = oreVar;
        ore oreVar2 = new ore("LOAD", 1);
        b = oreVar2;
        ore oreVar3 = new ore("GENERATE", 2);
        c = oreVar3;
        ore oreVar4 = new ore("REMOVE", 3);
        d = oreVar4;
        ore oreVar5 = new ore("SHARE", 4);
        e = oreVar5;
        f = new ore[]{oreVar, oreVar2, oreVar3, oreVar4, oreVar5};
    }

    public static ore valueOf(String str) {
        return (ore) Enum.valueOf(ore.class, str);
    }

    public static ore[] values() {
        return (ore[]) f.clone();
    }
}
