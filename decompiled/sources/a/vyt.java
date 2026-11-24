package a;

/* JADX INFO: loaded from: classes5.dex */
public final class vyt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hm7 f38265a;

    public vyt(hm7 hm7Var, byte b) {
        hm7Var.getClass();
        switch (b) {
            case 1:
                this.f38265a = hm7Var;
                break;
            default:
                this.f38265a = hm7Var;
                break;
        }
    }

    public ezc a() {
        vwb0 vwb0Var = (vwb0) this.f38265a.f13293a.b;
        ezc ezcVar = ezc.CONFIRM_ANY_CHANGE;
        vwb0Var.getClass();
        int i = vwb0Var.b().getInt("bet_check_koef", 0);
        if (i != 1) {
            return i != 2 ? ezc.CONFIRM_ANY_CHANGE : ezc.ACCEPT_INCREASE;
        }
        return ezc.ACCEPT_ANY_CHANGE;
    }
}
