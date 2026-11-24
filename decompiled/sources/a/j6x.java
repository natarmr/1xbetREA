package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class j6x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j6x f16011a;
    public static final /* synthetic */ j6x[] b;

    /* JADX INFO: Fake field, exist only in values array */
    j6x EF0;

    static {
        j6x j6xVar = new j6x("TOP", 0);
        j6x j6xVar2 = new j6x("BOTTOM", 1);
        f16011a = j6xVar2;
        b = new j6x[]{j6xVar, j6xVar2};
    }

    public static j6x valueOf(String str) {
        return (j6x) Enum.valueOf(j6x.class, str);
    }

    public static j6x[] values() {
        return (j6x[]) b.clone();
    }
}
