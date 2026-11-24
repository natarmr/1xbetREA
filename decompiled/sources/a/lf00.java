package a;

/* JADX INFO: loaded from: classes.dex */
public final class lf00 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f19929a;
    public final /* synthetic */ of00 b;

    public /* synthetic */ lf00(of00 of00Var, byte b) {
        this.f19929a = b;
        this.b = of00Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.f19929a;
        of00 of00Var = this.b;
        switch (b) {
            case 0:
                hil hilVar = of00Var.c;
                if (hilVar != null) {
                    hilVar.setListSelectionHidden(true);
                    hilVar.requestLayout();
                }
                break;
            default:
                hil hilVar2 = of00Var.c;
                if (hilVar2 != null && hilVar2.isAttachedToWindow() && of00Var.c.getCount() > of00Var.c.getChildCount() && of00Var.c.getChildCount() <= of00Var.m) {
                    of00Var.z.setInputMethodMode(2);
                    of00Var.q();
                    break;
                }
                break;
        }
    }
}
