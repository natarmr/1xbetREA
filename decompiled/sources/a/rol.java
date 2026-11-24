package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class rol {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final rol f30844a;
    public static final rol b;
    public static final rol c;
    public static final rol d;
    public static final /* synthetic */ rol[] e;

    static {
        rol rolVar = new rol("DAYS", 0);
        f30844a = rolVar;
        rol rolVar2 = new rol("HOURS", 1);
        b = rolVar2;
        rol rolVar3 = new rol("MINUTES", 2);
        c = rolVar3;
        rol rolVar4 = new rol("SECONDS", 3);
        d = rolVar4;
        e = new rol[]{rolVar, rolVar2, rolVar3, rolVar4};
    }

    public static rol valueOf(String str) {
        return (rol) Enum.valueOf(rol.class, str);
    }

    public static rol[] values() {
        return (rol[]) e.clone();
    }
}
