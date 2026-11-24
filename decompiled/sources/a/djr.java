package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class djr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final djr f6200a;
    public static final djr b;
    public static final djr c;
    public static final /* synthetic */ djr[] d;

    static {
        djr djrVar = new djr("NONE", 0);
        f6200a = djrVar;
        djr djrVar2 = new djr("NEGATIVE", 1);
        b = djrVar2;
        djr djrVar3 = new djr("POSITIVE", 2);
        c = djrVar3;
        d = new djr[]{djrVar, djrVar2, djrVar3};
    }

    public static djr valueOf(String str) {
        return (djr) Enum.valueOf(djr.class, str);
    }

    public static djr[] values() {
        return (djr[]) d.clone();
    }
}
