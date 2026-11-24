package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class aph {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final aph f1252a;
    public static final aph b;
    public static final aph c;
    public static final /* synthetic */ aph[] d;

    static {
        aph aphVar = new aph("HEAD", 0);
        f1252a = aphVar;
        aph aphVar2 = new aph("BODY", 1);
        b = aphVar2;
        aph aphVar3 = new aph("LEGS", 2);
        c = aphVar3;
        d = new aph[]{aphVar, aphVar2, aphVar3};
    }

    public static aph valueOf(String str) {
        return (aph) Enum.valueOf(aph.class, str);
    }

    public static aph[] values() {
        return (aph[]) d.clone();
    }
}
