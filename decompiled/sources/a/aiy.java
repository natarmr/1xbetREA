package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class aiy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final aiy f949a;
    public static final aiy b;
    public static final aiy c;
    public static final aiy d;
    public static final /* synthetic */ aiy[] e;

    static {
        aiy aiyVar = new aiy("INSTANCE", 0);
        f949a = aiyVar;
        aiy aiyVar2 = new aiy("CONTEXT", 1);
        b = aiyVar2;
        aiy aiyVar3 = new aiy("EXTENSION_RECEIVER", 2);
        c = aiyVar3;
        aiy aiyVar4 = new aiy("VALUE", 3);
        d = aiyVar4;
        e = new aiy[]{aiyVar, aiyVar2, aiyVar3, aiyVar4};
    }

    public static aiy valueOf(String str) {
        return (aiy) Enum.valueOf(aiy.class, str);
    }

    public static aiy[] values() {
        return (aiy[]) e.clone();
    }
}
