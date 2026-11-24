package a;

/* JADX INFO: loaded from: classes.dex */
public final class vu9 extends y4 {
    public final /* synthetic */ wu9 h;

    public vu9(wu9 wu9Var) {
        this.h = wu9Var;
    }

    @Override // a.y4
    public final String j() {
        tu9 tu9Var = (tu9) this.h.f39779a.get();
        if (tu9Var == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + tu9Var.f34540a + "]";
    }
}
