package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class y9c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y9c f42237a;
    public static final y9c b;
    public static final /* synthetic */ y9c[] c;

    static {
        y9c y9cVar = new y9c("Opened", 0);
        f42237a = y9cVar;
        y9c y9cVar2 = new y9c("Closed", 1);
        b = y9cVar2;
        c = new y9c[]{y9cVar, y9cVar2};
    }

    public static y9c valueOf(String str) {
        return (y9c) Enum.valueOf(y9c.class, str);
    }

    public static y9c[] values() {
        return (y9c[]) c.clone();
    }
}
