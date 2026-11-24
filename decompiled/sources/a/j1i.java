package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class j1i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j1i f15735a;
    public static final j1i b;
    public static final j1i c;
    public static final /* synthetic */ j1i[] d;

    static {
        j1i j1iVar = new j1i("LOGO_CENTER_STYLE", 0);
        f15735a = j1iVar;
        j1i j1iVar2 = new j1i("LOGO_LEFT_STYLE", 1);
        b = j1iVar2;
        j1i j1iVar3 = new j1i("LOGO_RIGHT_STYLE", 2);
        c = j1iVar3;
        d = new j1i[]{j1iVar, j1iVar2, j1iVar3};
    }

    public static j1i valueOf(String str) {
        return (j1i) Enum.valueOf(j1i.class, str);
    }

    public static j1i[] values() {
        return (j1i[]) d.clone();
    }
}
