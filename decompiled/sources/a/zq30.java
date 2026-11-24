package a;

/* JADX INFO: loaded from: classes2.dex */
public final class zq30 extends ar30 {
    public static final zq30 d = new zq30("must be a member function", 0);
    public static final zq30 e = new zq30("must be a member or an extension function", 1);
    public final /* synthetic */ byte c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zq30(String str, byte b) {
        super(str, (byte) 0);
        this.c = b;
    }

    @Override // a.eyb
    public final boolean b(u9y u9yVar) {
        switch (this.c) {
            case 0:
                return u9yVar.k != null;
            default:
                return (u9yVar.k == null && u9yVar.j == null) ? false : true;
        }
    }
}
