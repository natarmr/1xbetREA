package a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class as4 implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f1375a;
    public final /* synthetic */ ts4 b;
    public final /* synthetic */ String c;

    public /* synthetic */ as4(ts4 ts4Var, String str, byte b) {
        this.f1375a = b;
        this.b = ts4Var;
        this.c = str;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.f1375a;
        String str = this.c;
        ts4 ts4Var = this.b;
        String str2 = (String) obj;
        String str3 = (String) obj2;
        String str4 = (String) obj3;
        brm0.B(str2, str3, str4);
        switch (b) {
            case 0:
                break;
        }
        return ts4Var.k.b(str2, str, str3, str4);
    }
}
