package a;

/* JADX INFO: loaded from: classes3.dex */
public final class ulk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vwb0 f35876a;

    public ulk(vwb0 vwb0Var, byte b) {
        vwb0Var.getClass();
        switch (b) {
            case 1:
                this.f35876a = vwb0Var;
                break;
            case 2:
                this.f35876a = vwb0Var;
                break;
            default:
                this.f35876a = vwb0Var;
                break;
        }
    }

    public void a() {
        c0o c0oVar = slk.c;
        y2 y2VarH = ohs0.h(c0oVar, c0oVar);
        while (y2VarH.hasNext()) {
            this.f35876a.g(((slk) y2VarH.next()).f32403a, 0L);
        }
    }
}
