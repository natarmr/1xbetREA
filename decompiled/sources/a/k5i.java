package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class k5i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k5i f17721a;
    public static final k5i b;
    public static final k5i c;
    public static final /* synthetic */ k5i[] d;

    static {
        k5i k5iVar = new k5i("SUBTITLE_TITLE", 0);
        f17721a = k5iVar;
        k5i k5iVar2 = new k5i("TITLE", 1);
        b = k5iVar2;
        k5i k5iVar3 = new k5i("TITLE_SUBTITLE", 2);
        c = k5iVar3;
        d = new k5i[]{k5iVar, k5iVar2, k5iVar3};
    }

    public static k5i valueOf(String str) {
        return (k5i) Enum.valueOf(k5i.class, str);
    }

    public static k5i[] values() {
        return (k5i[]) d.clone();
    }
}
