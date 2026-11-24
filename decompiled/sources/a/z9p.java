package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class z9p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z9p f44030a;
    public static final z9p b;
    public static final /* synthetic */ z9p[] c;

    static {
        z9p z9pVar = new z9p("RIGHT", 0);
        f44030a = z9pVar;
        z9p z9pVar2 = new z9p("LEFT", 1);
        b = z9pVar2;
        c = new z9p[]{z9pVar, z9pVar2};
    }

    public static z9p valueOf(String str) {
        return (z9p) Enum.valueOf(z9p.class, str);
    }

    public static z9p[] values() {
        return (z9p[]) c.clone();
    }
}
