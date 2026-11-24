package a;

/* JADX INFO: loaded from: classes.dex */
public final class sge0 implements lge {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f32157a = 0;
    public final String b;
    public final v33 c;
    public final boolean d;
    public final b43 e;
    public final Object f;

    public sge0(String str, v33 v33Var, v33 v33Var2, z33 z33Var, boolean z) {
        this.b = str;
        this.c = v33Var;
        this.e = v33Var2;
        this.f = z33Var;
        this.d = z;
    }

    @Override // a.lge
    public final qde a(bb10 bb10Var, fa10 fa10Var, tz5 tz5Var) {
        switch (this.f32157a) {
            case 0:
                return new rge0(bb10Var, tz5Var, this);
            default:
                return new vkf0(bb10Var, tz5Var, this);
        }
    }

    public String toString() {
        switch (this.f32157a) {
            case 0:
                return "RectangleShape{position=" + this.e + ", size=" + ((b43) this.f) + '}';
            default:
                return super.toString();
        }
    }

    public sge0(String str, b43 b43Var, u33 u33Var, v33 v33Var, boolean z) {
        this.b = str;
        this.e = b43Var;
        this.f = u33Var;
        this.c = v33Var;
        this.d = z;
    }
}
