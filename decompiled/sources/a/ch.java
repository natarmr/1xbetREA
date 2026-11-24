package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class ch {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ch f4338a;
    public static final ch b;
    public static final /* synthetic */ ch[] c;

    static {
        ch chVar = new ch("TOTO_ICE_HOCKEY", 0);
        f4338a = chVar;
        ch chVar2 = new ch("TOTO_CORRECT_SCORE", 1);
        b = chVar2;
        c = new ch[]{chVar, chVar2};
    }

    public static ch valueOf(String str) {
        return (ch) Enum.valueOf(ch.class, str);
    }

    public static ch[] values() {
        return (ch[]) c.clone();
    }
}
