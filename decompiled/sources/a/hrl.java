package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class hrl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final hrl f13536a;
    public static final hrl b;
    public static final hrl c;
    public static final /* synthetic */ hrl[] d;

    static {
        hrl hrlVar = new hrl("STATIC", 0);
        f13536a = hrlVar;
        hrl hrlVar2 = new hrl("ACCORDION", 1);
        b = hrlVar2;
        hrl hrlVar3 = new hrl("ICON_ACCORDION", 2);
        c = hrlVar3;
        d = new hrl[]{hrlVar, hrlVar2, hrlVar3};
    }

    public static hrl valueOf(String str) {
        return (hrl) Enum.valueOf(hrl.class, str);
    }

    public static hrl[] values() {
        return (hrl[]) d.clone();
    }
}
