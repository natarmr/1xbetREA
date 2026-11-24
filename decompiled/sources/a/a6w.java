package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class a6w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a6w f336a;
    public static final a6w b;
    public static final /* synthetic */ a6w[] c;

    static {
        a6w a6wVar = new a6w("WHOLE_PAYOUT", 0);
        f336a = a6wVar;
        a6w a6wVar2 = new a6w("FREE_BET_PAYOUT", 1);
        b = a6wVar2;
        c = new a6w[]{a6wVar, a6wVar2};
    }

    public static a6w valueOf(String str) {
        return (a6w) Enum.valueOf(a6w.class, str);
    }

    public static a6w[] values() {
        return (a6w[]) c.clone();
    }
}
