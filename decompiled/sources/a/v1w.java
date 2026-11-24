package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class v1w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v1w f36652a;
    public static final v1w b;
    public static final v1w c;
    public static final /* synthetic */ v1w[] d;

    static {
        v1w v1wVar = new v1w("HOME", 0);
        f36652a = v1wVar;
        v1w v1wVar2 = new v1w("AWAY", 1);
        b = v1wVar2;
        v1w v1wVar3 = new v1w("NONE", 2);
        c = v1wVar3;
        d = new v1w[]{v1wVar, v1wVar2, v1wVar3};
    }

    public static v1w valueOf(String str) {
        return (v1w) Enum.valueOf(v1w.class, str);
    }

    public static v1w[] values() {
        return (v1w[]) d.clone();
    }
}
