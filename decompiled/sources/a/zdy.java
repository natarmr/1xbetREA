package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class zdy implements xrz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zdy f44231a;
    public static final /* synthetic */ zdy[] b;
    public static final /* synthetic */ c0o c;

    static {
        bnz bnzVar = bnz.f2907a;
        zdy zdyVar = new zdy("JUDICIAL_EXCLUSION", 0);
        f44231a = zdyVar;
        zdy[] zdyVarArr = {zdyVar};
        b = zdyVarArr;
        c = new c0o(zdyVarArr);
    }

    public static zdy valueOf(String str) {
        return (zdy) Enum.valueOf(zdy.class, str);
    }

    public static zdy[] values() {
        return (zdy[]) b.clone();
    }

    @Override // a.xrz
    public final bnz a() {
        return bnz.i;
    }

    @Override // a.xrz
    public final int getId() {
        return 38;
    }
}
