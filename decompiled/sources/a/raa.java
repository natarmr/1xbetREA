package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class raa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final raa f30125a;
    public static final raa b;
    public static final /* synthetic */ raa[] c;

    static {
        raa raaVar = new raa("DEFAULT", 0);
        f30125a = raaVar;
        raa raaVar2 = new raa("MAX", 1);
        b = raaVar2;
        c = new raa[]{raaVar, raaVar2};
    }

    public static raa valueOf(String str) {
        return (raa) Enum.valueOf(raa.class, str);
    }

    public static raa[] values() {
        return (raa[]) c.clone();
    }
}
