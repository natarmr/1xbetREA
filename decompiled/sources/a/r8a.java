package a;

/* JADX INFO: loaded from: classes.dex */
public final class r8a implements by9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g9a f30016a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public r8a(g9a g9aVar, int i, int i2) {
        this.f30016a = g9aVar;
        this.b = i;
        this.c = i2;
    }

    @Override // a.by9
    public final ig00 a() {
        g9a g9aVar = this.f30016a;
        sje sjeVar = g9aVar.e.f34352a;
        int i = this.b;
        int i2 = this.c;
        tu9 tu9Var = new tu9();
        tu9Var.c = new msf0();
        wu9 wu9Var = new wu9(tu9Var);
        tu9Var.b = wu9Var;
        tu9Var.f34540a = q8a.class;
        try {
            tu9Var.f34540a = qjj.W(sjeVar, null, null, new o8a(tu9Var, null, g9aVar, i, i2, (byte) 1), 3);
            return wu9Var;
        } catch (Exception e) {
            wu9Var.b(e);
            return wu9Var;
        }
    }

    @Override // a.by9
    public final ig00 b() {
        g9a g9aVar = this.f30016a;
        sje sjeVar = g9aVar.e.f34352a;
        int i = this.b;
        int i2 = this.c;
        tu9 tu9Var = new tu9();
        tu9Var.c = new msf0();
        wu9 wu9Var = new wu9(tu9Var);
        tu9Var.b = wu9Var;
        tu9Var.f34540a = p8a.class;
        try {
            tu9Var.f34540a = qjj.W(sjeVar, null, null, new o8a(tu9Var, null, g9aVar, i, i2, (byte) 0), 3);
            return wu9Var;
        } catch (Exception e) {
            wu9Var.b(e);
            return wu9Var;
        }
    }
}
