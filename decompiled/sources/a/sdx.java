package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class sdx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final sdx f32052a;
    public static final sdx b;
    public static final sdx c;
    public static final sdx d;
    public static final /* synthetic */ sdx[] e;

    static {
        sdx sdxVar = new sdx("LEFT", 0);
        f32052a = sdxVar;
        sdx sdxVar2 = new sdx("RIGHT", 1);
        b = sdxVar2;
        sdx sdxVar3 = new sdx("LEFT_BOTTOM", 2);
        c = sdxVar3;
        sdx sdxVar4 = new sdx("RIGHT_BOTTOM", 3);
        d = sdxVar4;
        e = new sdx[]{sdxVar, sdxVar2, sdxVar3, sdxVar4};
    }

    public static sdx valueOf(String str) {
        return (sdx) Enum.valueOf(sdx.class, str);
    }

    public static sdx[] values() {
        return (sdx[]) e.clone();
    }
}
