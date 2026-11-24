package a;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final class n7e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f23038a;
    public final gii0 b;
    public final Function0 c;

    public n7e0(gii0 gii0Var, byte b) {
        this.f23038a = b;
        gii0Var.getClass();
        switch (b) {
            case 1:
                this.b = gii0Var;
                this.c = new goi0(this, (byte) 25);
                break;
            default:
                this.b = gii0Var;
                this.c = new p7d0(this, (byte) 20);
                break;
        }
    }
}
