package a;

/* JADX INFO: loaded from: classes.dex */
public final class p06 extends dj10 {
    public final /* synthetic */ byte g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p06(int i, byte b) {
        super(i);
        this.g = b;
    }

    @Override // a.dj10
    public void b(Object obj, Object obj2, Object obj3) throws Exception {
        switch (this.g) {
            case 0:
                xpg0 xpg0Var = (xpg0) obj2;
                ((String) obj).getClass();
                if (!(xpg0Var instanceof o06)) {
                    xpg0Var.close();
                } else {
                    jf4.n("Check failed.");
                }
                break;
            default:
                super.b(obj, obj2, obj3);
                break;
        }
    }
}
