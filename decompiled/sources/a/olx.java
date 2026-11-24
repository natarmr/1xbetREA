package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class olx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final olx f25479a;
    public static final olx b;
    public static final olx c;
    public static final /* synthetic */ olx[] d;

    static {
        olx olxVar = new olx("Idle", 0);
        f25479a = olxVar;
        olx olxVar2 = new olx("Dragging", 1);
        b = olxVar2;
        olx olxVar3 = new olx("Settling", 2);
        c = olxVar3;
        d = new olx[]{olxVar, olxVar2, olxVar3};
    }

    public static olx valueOf(String str) {
        return (olx) Enum.valueOf(olx.class, str);
    }

    public static olx[] values() {
        return (olx[]) d.clone();
    }
}
