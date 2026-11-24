package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class r7r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r7r f29990a;
    public static final r7r b;
    public static final r7r c;
    public static final r7r d;
    public static final /* synthetic */ r7r[] e;

    static {
        r7r r7rVar = new r7r("STARTED", 0);
        f29990a = r7rVar;
        r7r r7rVar2 = new r7r("FRAME_INFO_COMPLETE", 1);
        b = r7rVar2;
        r7r r7rVar3 = new r7r("STREAM_RESULTS_COMPLETE", 2);
        c = r7rVar3;
        r7r r7rVar4 = new r7r("COMPLETE", 3);
        d = r7rVar4;
        e = new r7r[]{r7rVar, r7rVar2, r7rVar3, r7rVar4};
    }

    public static r7r valueOf(String str) {
        return (r7r) Enum.valueOf(r7r.class, str);
    }

    public static r7r[] values() {
        return (r7r[]) e.clone();
    }
}
