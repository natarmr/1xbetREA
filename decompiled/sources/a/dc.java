package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class dc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final dc f5825a;
    public static final /* synthetic */ dc[] b;
    public static final /* synthetic */ c0o c;

    static {
        dc dcVar = new dc("PRIMARY", 0);
        f5825a = dcVar;
        dc[] dcVarArr = {dcVar, new dc("SECONDARY", 1), new dc("CLEAR", 2)};
        b = dcVarArr;
        c = new c0o(dcVarArr);
    }

    public static dc valueOf(String str) {
        return (dc) Enum.valueOf(dc.class, str);
    }

    public static dc[] values() {
        return (dc[]) b.clone();
    }
}
