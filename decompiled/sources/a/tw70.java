package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class tw70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final tw70 f34636a;
    public static final /* synthetic */ tw70[] b;
    public static final /* synthetic */ c0o c;

    static {
        tw70 tw70Var = new tw70("EXTERNAL", 0);
        f34636a = tw70Var;
        tw70[] tw70VarArr = {tw70Var, new tw70("INTERNAL", 1), new tw70("IFRAME", 2)};
        b = tw70VarArr;
        c = new c0o(tw70VarArr);
    }

    public static tw70 valueOf(String str) {
        return (tw70) Enum.valueOf(tw70.class, str);
    }

    public static tw70[] values() {
        return (tw70[]) b.clone();
    }
}
