package a;

/* JADX INFO: loaded from: classes3.dex */
public final class bf3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q7d0 f2481a;

    public bf3(q7d0 q7d0Var, byte b) {
        switch (b) {
            case 1:
                q7d0Var.getClass();
                this.f2481a = q7d0Var;
                break;
            case 2:
                q7d0Var.getClass();
                this.f2481a = q7d0Var;
                break;
            default:
                this.f2481a = q7d0Var;
                break;
        }
    }

    public String a(String str, String str2) {
        String strConcat = str.concat(str2);
        q7d0 q7d0Var = this.f2481a;
        q7d0Var.getClass();
        String string = q7d0Var.a().getString(strConcat, "");
        return string == null ? "" : string;
    }

    public void b(String str, String str2, String str3) {
        this.f2481a.g(str.concat(str2), str3);
    }
}
