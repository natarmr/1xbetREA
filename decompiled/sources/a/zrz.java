package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class zrz implements vrz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final sqt f44882a;
    public static final zrz b;
    public static final /* synthetic */ zrz[] c;

    static {
        zrz zrzVar = new zrz("EMPTY", 0);
        b = zrzVar;
        c = new zrz[]{zrzVar};
        f44882a = new sqt();
    }

    public static zrz valueOf(String str) {
        return (zrz) Enum.valueOf(zrz.class, str);
    }

    public static zrz[] values() {
        return (zrz[]) c.clone();
    }

    @Override // a.vrz
    public final int getId() {
        return -1;
    }
}
