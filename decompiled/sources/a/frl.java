package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class frl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final frl f10024a;
    public static final frl b;
    public static final /* synthetic */ frl[] c;

    static {
        frl frlVar = new frl("EXPANDED", 0);
        f10024a = frlVar;
        frl frlVar2 = new frl("COLLAPSED", 1);
        b = frlVar2;
        c = new frl[]{frlVar, frlVar2};
    }

    public static frl valueOf(String str) {
        return (frl) Enum.valueOf(frl.class, str);
    }

    public static frl[] values() {
        return (frl[]) c.clone();
    }
}
