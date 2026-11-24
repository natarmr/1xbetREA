package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class wep {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final wep f39029a;
    public static final wep b;
    public static final /* synthetic */ wep[] c;

    static {
        wep wepVar = new wep("EVENTS", 0);
        f39029a = wepVar;
        wep wepVar2 = new wep("OTHER", 1);
        b = wepVar2;
        c = new wep[]{wepVar, wepVar2};
    }

    public static wep valueOf(String str) {
        return (wep) Enum.valueOf(wep.class, str);
    }

    public static wep[] values() {
        return (wep[]) c.clone();
    }
}
