package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class dbd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final dbd f5798a;
    public static final dbd b;
    public static final dbd c;
    public static final /* synthetic */ dbd[] d;

    static {
        dbd dbdVar = new dbd("NONE", 0);
        f5798a = dbdVar;
        dbd dbdVar2 = new dbd("COMPACT", 1);
        b = dbdVar2;
        dbd dbdVar3 = new dbd("FULL", 2);
        c = dbdVar3;
        d = new dbd[]{dbdVar, dbdVar2, dbdVar3};
    }

    public static dbd valueOf(String str) {
        return (dbd) Enum.valueOf(dbd.class, str);
    }

    public static dbd[] values() {
        return (dbd[]) d.clone();
    }
}
