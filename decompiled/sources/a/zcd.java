package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class zcd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ zcd[] f44160a = {new zcd("WIN", 0), new zcd("LOSE", 1), new zcd("KILLS", 2), new zcd("DEATH", 3), new zcd("ASSIST", 4), new zcd("GOLD", 5), new zcd("BARON", 6), new zcd("DRAGON", 7), new zcd("TOWER", 8)};

    /* JADX INFO: Fake field, exist only in values array */
    zcd EF5;

    public static zcd valueOf(String str) {
        return (zcd) Enum.valueOf(zcd.class, str);
    }

    public static zcd[] values() {
        return (zcd[]) f44160a.clone();
    }
}
