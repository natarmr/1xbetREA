package a;

/* JADX INFO: loaded from: classes2.dex */
public final class i3u0 extends ar30 {
    public static final i3u0 d = new i3u0("must have no value parameters", 0);
    public static final i3u0 e = new i3u0("must have a single value parameter", 1);
    public final /* synthetic */ byte c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i3u0(String str, byte b) {
        super(str, (byte) 1);
        this.c = b;
    }

    @Override // a.eyb
    public final boolean b(u9y u9yVar) {
        switch (this.c) {
            case 0:
                return u9yVar.z().isEmpty();
            case 1:
                return u9yVar.z().size() == 1;
            default:
                return u9yVar.z().size() == 2;
        }
    }
}
