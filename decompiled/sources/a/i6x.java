package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class i6x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i6x f14263a;
    public static final /* synthetic */ i6x[] b;

    /* JADX INFO: Fake field, exist only in values array */
    i6x EF0;

    static {
        i6x i6xVar = new i6x("TOP", 0);
        i6x i6xVar2 = new i6x("BOTTOM", 1);
        f14263a = i6xVar2;
        b = new i6x[]{i6xVar, i6xVar2};
    }

    public static i6x valueOf(String str) {
        return (i6x) Enum.valueOf(i6x.class, str);
    }

    public static i6x[] values() {
        return (i6x[]) b.clone();
    }
}
