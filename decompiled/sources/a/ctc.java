package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class ctc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ctc f4929a;
    public static final ctc b;
    public static final ctc c;
    public static final /* synthetic */ ctc[] d;

    static {
        ctc ctcVar = new ctc("SimpleTap", 0);
        f4929a = ctcVar;
        ctc ctcVar2 = new ctc("LongTap", 1);
        b = ctcVar2;
        ctc ctcVar3 = new ctc("None", 2);
        c = ctcVar3;
        d = new ctc[]{ctcVar, ctcVar2, ctcVar3};
    }

    public static ctc valueOf(String str) {
        return (ctc) Enum.valueOf(ctc.class, str);
    }

    public static ctc[] values() {
        return (ctc[]) d.clone();
    }
}
