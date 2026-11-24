package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class y9s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y9s f42264a;
    public static final y9s b;
    public static final y9s c;
    public static final y9s d;
    public static final /* synthetic */ y9s[] e;
    public static final /* synthetic */ c0o f;

    static {
        y9s y9sVar = new y9s("POPULAR_LINE", 0);
        f42264a = y9sVar;
        y9s y9sVar2 = new y9s("POPULAR_LIVE", 1);
        b = y9sVar2;
        y9s y9sVar3 = new y9s("RECOMMENDED_LINE", 2);
        c = y9sVar3;
        y9s y9sVar4 = new y9s("RECOMMENDED_LIVE", 3);
        d = y9sVar4;
        y9s[] y9sVarArr = {y9sVar, y9sVar2, y9sVar3, y9sVar4};
        e = y9sVarArr;
        f = new c0o(y9sVarArr);
    }

    public static y9s valueOf(String str) {
        return (y9s) Enum.valueOf(y9s.class, str);
    }

    public static y9s[] values() {
        return (y9s[]) e.clone();
    }
}
