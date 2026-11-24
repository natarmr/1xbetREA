package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class l5i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l5i f19457a;
    public static final l5i b;
    public static final l5i c;
    public static final l5i d;
    public static final /* synthetic */ l5i[] e;

    static {
        l5i l5iVar = new l5i("RADIAL", 0);
        f19457a = l5iVar;
        l5i l5iVar2 = new l5i("CLOCK", 1);
        b = l5iVar2;
        l5i l5iVar3 = new l5i("NUMBER", 2);
        c = l5iVar3;
        l5i l5iVar4 = new l5i("PROGRESS_LINE", 3);
        d = l5iVar4;
        e = new l5i[]{l5iVar, l5iVar2, l5iVar3, l5iVar4};
    }

    public static l5i valueOf(String str) {
        return (l5i) Enum.valueOf(l5i.class, str);
    }

    public static l5i[] values() {
        return (l5i[]) e.clone();
    }
}
