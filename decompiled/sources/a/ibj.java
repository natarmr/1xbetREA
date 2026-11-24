package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ibj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ibj f14489a;
    public static final ibj b;
    public static final ibj c;
    public static final ibj d;
    public static final /* synthetic */ ibj[] e;

    static {
        ibj ibjVar = new ibj("MEMORY_CACHE", 0);
        f14489a = ibjVar;
        ibj ibjVar2 = new ibj("MEMORY", 1);
        b = ibjVar2;
        ibj ibjVar3 = new ibj("DISK", 2);
        c = ibjVar3;
        ibj ibjVar4 = new ibj("NETWORK", 3);
        d = ibjVar4;
        e = new ibj[]{ibjVar, ibjVar2, ibjVar3, ibjVar4};
    }

    public static ibj valueOf(String str) {
        return (ibj) Enum.valueOf(ibj.class, str);
    }

    public static ibj[] values() {
        return (ibj[]) e.clone();
    }
}
