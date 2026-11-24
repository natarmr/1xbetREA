package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class vao {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final vao f37100a;
    public static final vao b;
    public static final vao c;
    public static final /* synthetic */ vao[] d;

    static {
        vao vaoVar = new vao("MARKET", 0);
        f37100a = vaoVar;
        vao vaoVar2 = new vao("BLOCK", 1);
        b = vaoVar2;
        vao vaoVar3 = new vao("SHOW_MORE", 2);
        c = vaoVar3;
        d = new vao[]{vaoVar, vaoVar2, vaoVar3};
    }

    public static vao valueOf(String str) {
        return (vao) Enum.valueOf(vao.class, str);
    }

    public static vao[] values() {
        return (vao[]) d.clone();
    }
}
