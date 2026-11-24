package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class ais {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ais f939a;
    public static final ais b;
    public static final ais c;
    public static final ais d;
    public static final /* synthetic */ ais[] e;

    static {
        ais aisVar = new ais("NO_ERROR", 0);
        f939a = aisVar;
        ais aisVar2 = new ais("CONTENT_ERROR", 1);
        b = aisVar2;
        ais aisVar3 = new ais("CONTENT_EMPTY_ERROR", 2);
        c = aisVar3;
        ais aisVar4 = new ais("CONTENT_EMPTY_SEARCH_ERROR", 3);
        d = aisVar4;
        e = new ais[]{aisVar, aisVar2, aisVar3, aisVar4};
    }

    public static ais valueOf(String str) {
        return (ais) Enum.valueOf(ais.class, str);
    }

    public static ais[] values() {
        return (ais[]) e.clone();
    }
}
