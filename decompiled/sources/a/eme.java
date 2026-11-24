package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class eme {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final eme f8041a;
    public static final eme b;
    public static final eme c;
    public static final /* synthetic */ eme[] d;

    static {
        eme emeVar = new eme("PLAIN_TEAM_INFO", 0);
        f8041a = emeVar;
        eme emeVar2 = new eme("ALT_TABS_WIDGET", 1);
        b = emeVar2;
        eme emeVar3 = new eme("ALT_LIST_WIDGET", 2);
        c = emeVar3;
        d = new eme[]{emeVar, emeVar2, emeVar3};
    }

    public static eme valueOf(String str) {
        return (eme) Enum.valueOf(eme.class, str);
    }

    public static eme[] values() {
        return (eme[]) d.clone();
    }
}
