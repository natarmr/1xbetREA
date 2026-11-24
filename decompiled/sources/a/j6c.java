package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class j6c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j6c f15977a;
    public static final /* synthetic */ j6c[] b;

    static {
        j6c j6cVar = new j6c("NAVIGATE_TO_CHOICE", 0);
        f15977a = j6cVar;
        b = new j6c[]{j6cVar};
    }

    public static j6c valueOf(String str) {
        return (j6c) Enum.valueOf(j6c.class, str);
    }

    public static j6c[] values() {
        return (j6c[]) b.clone();
    }
}
