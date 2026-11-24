package a;

/* JADX INFO: loaded from: classes6.dex */
public final class mrc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gxu f22263a;

    public /* synthetic */ mrc(gxu gxuVar) {
        this.f22263a = gxuVar;
    }

    public int a(String str) {
        str.getClass();
        eia0 eia0Var = (eia0) this.f22263a.b;
        eia0Var.getClass();
        Integer num = (Integer) eia0Var.b.get(str);
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public String b() {
        return ((eia0) this.f22263a.b).f;
    }
}
