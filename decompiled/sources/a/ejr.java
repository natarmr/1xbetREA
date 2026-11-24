package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class ejr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ejr f7921a;
    public static final ejr b;
    public static final ejr c;
    public static final /* synthetic */ ejr[] d;

    static {
        ejr ejrVar = new ejr("NOT_ANSWERED", 0);
        f7921a = ejrVar;
        ejr ejrVar2 = new ejr("ANSWER_NEGATIVE", 1);
        b = ejrVar2;
        ejr ejrVar3 = new ejr("ANSWER_POSITIVE", 2);
        c = ejrVar3;
        d = new ejr[]{ejrVar, ejrVar2, ejrVar3};
    }

    public static ejr valueOf(String str) {
        return (ejr) Enum.valueOf(ejr.class, str);
    }

    public static ejr[] values() {
        return (ejr[]) d.clone();
    }
}
