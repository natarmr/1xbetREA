package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class cap {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final cap f4022a;
    public static final cap b;
    public static final /* synthetic */ cap[] c;

    static {
        cap capVar = new cap("RIGHT_BOTTOM", 0);
        f4022a = capVar;
        cap capVar2 = new cap("LEFT_BOTTOM", 1);
        b = capVar2;
        c = new cap[]{capVar, capVar2};
    }

    public static cap valueOf(String str) {
        return (cap) Enum.valueOf(cap.class, str);
    }

    public static cap[] values() {
        return (cap[]) c.clone();
    }
}
