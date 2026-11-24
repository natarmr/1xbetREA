package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class qpe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final qpe f29113a;
    public static final qpe b;
    public static final qpe c;
    public static final /* synthetic */ qpe[] d;

    static {
        qpe qpeVar = new qpe("START", 0);
        f29113a = qpeVar;
        qpe qpeVar2 = new qpe("END", 1);
        b = qpeVar2;
        qpe qpeVar3 = new qpe("STOPPED", 2);
        c = qpeVar3;
        d = new qpe[]{qpeVar, qpeVar2, qpeVar3};
    }

    public static qpe valueOf(String str) {
        return (qpe) Enum.valueOf(qpe.class, str);
    }

    public static qpe[] values() {
        return (qpe[]) d.clone();
    }
}
