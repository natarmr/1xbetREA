package a;

/* JADX INFO: loaded from: classes2.dex */
public final class t5w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n5d0 f33389a;
    public final n5d0 b;
    public final n5d0 c;

    public t5w0(kys0 kys0Var, Integer num, yjh0 yjh0Var) {
        zix zixVarA = zix.a(yjh0Var);
        this.f33389a = mbl.b(new x6w0(kys0Var, mbl.b(new t6w0(kys0Var, zixVarA, (byte) 1)), mbl.b(new t6w0(kys0Var, zixVarA, (byte) 2)), mbl.b(new t6w0(kys0Var, zixVarA, (byte) 0))));
        zix zixVarA2 = zix.a("org.xbet.client1");
        byte b = 3;
        this.b = mbl.b(new d7w0(kys0Var, zixVarA2, zix.a(num), b));
        this.c = mbl.b(new t6w0(kys0Var, zixVarA2, b));
    }

    public final mmy a() {
        return (mmy) this.b.get();
    }
}
