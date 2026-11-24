package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class fzc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final kj5 f10401a;
    public static final fzc b;
    public static final fzc c;
    public static final fzc d;
    public static final /* synthetic */ fzc[] e;

    static {
        fzc fzcVar = new fzc("NORMAL", 0);
        b = fzcVar;
        fzc fzcVar2 = new fzc("GREEN", 1);
        c = fzcVar2;
        fzc fzcVar3 = new fzc("RED", 2);
        d = fzcVar3;
        e = new fzc[]{fzcVar, fzcVar2, fzcVar3};
        f10401a = new kj5();
    }

    public static fzc valueOf(String str) {
        return (fzc) Enum.valueOf(fzc.class, str);
    }

    public static fzc[] values() {
        return (fzc[]) e.clone();
    }
}
