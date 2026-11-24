package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class yeu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final yeu f42508a;
    public static final /* synthetic */ yeu[] b;
    public static final /* synthetic */ c0o c;

    static {
        yeu yeuVar = new yeu("LIVE", 0);
        f42508a = yeuVar;
        yeu[] yeuVarArr = {yeuVar, new yeu("LINE", 1)};
        b = yeuVarArr;
        c = new c0o(yeuVarArr);
    }

    public static yeu valueOf(String str) {
        return (yeu) Enum.valueOf(yeu.class, str);
    }

    public static yeu[] values() {
        return (yeu[]) b.clone();
    }
}
