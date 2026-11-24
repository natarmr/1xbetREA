package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class nvl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final nvl f24192a;
    public static final nvl b;
    public static final nvl c;
    public static final /* synthetic */ nvl[] d;

    static {
        nvl nvlVar = new nvl("DRAG_AND_DROP", 0);
        f24192a = nvlVar;
        nvl nvlVar2 = new nvl("DRAG_AND_DROP_BUTTON", 1);
        b = nvlVar2;
        nvl nvlVar3 = new nvl("DRAG_AND_DROP_CHECK_BOX", 2);
        c = nvlVar3;
        d = new nvl[]{nvlVar, nvlVar2, nvlVar3};
    }

    public static nvl valueOf(String str) {
        return (nvl) Enum.valueOf(nvl.class, str);
    }

    public static nvl[] values() {
        return (nvl[]) d.clone();
    }
}
