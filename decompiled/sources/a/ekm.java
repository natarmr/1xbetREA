package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class ekm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ekm f7958a;
    public static final ekm b;
    public static final /* synthetic */ ekm[] c;

    static {
        ekm ekmVar = new ekm("SPINNER", 0);
        f7958a = ekmVar;
        ekm ekmVar2 = new ekm("LOTTIE", 1);
        b = ekmVar2;
        c = new ekm[]{ekmVar, ekmVar2};
    }

    public static ekm valueOf(String str) {
        return (ekm) Enum.valueOf(ekm.class, str);
    }

    public static ekm[] values() {
        return (ekm[]) c.clone();
    }
}
