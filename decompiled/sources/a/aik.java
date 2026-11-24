package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class aik {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final aik f927a;
    public static final aik b;
    public static final aik c;
    public static final /* synthetic */ aik[] d;

    static {
        aik aikVar = new aik("SMALL", 0);
        f927a = aikVar;
        aik aikVar2 = new aik("MEDIUM", 1);
        b = aikVar2;
        aik aikVar3 = new aik("LARGE", 2);
        c = aikVar3;
        d = new aik[]{aikVar, aikVar2, aikVar3};
    }

    public static aik valueOf(String str) {
        return (aik) Enum.valueOf(aik.class, str);
    }

    public static aik[] values() {
        return (aik[]) d.clone();
    }
}
