package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class gox {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final gox f11656a;
    public static final gox b;
    public static final gox c;
    public static final gox d;
    public static final /* synthetic */ gox[] e;

    static {
        gox goxVar = new gox("IGNORED", 0);
        f11656a = goxVar;
        gox goxVar2 = new gox("SCHEDULED", 1);
        b = goxVar2;
        gox goxVar3 = new gox("DEFERRED", 2);
        c = goxVar3;
        gox goxVar4 = new gox("IMMINENT", 3);
        d = goxVar4;
        e = new gox[]{goxVar, goxVar2, goxVar3, goxVar4};
    }

    public static gox valueOf(String str) {
        return (gox) Enum.valueOf(gox.class, str);
    }

    public static gox[] values() {
        return (gox[]) e.clone();
    }
}
