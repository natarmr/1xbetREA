package a;

import android.gov.nist.core.Separators;
import android.javax.sip.message.Response;

/* JADX INFO: loaded from: classes.dex */
public final class t8z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f33536a;
    public final cgk0 b;
    public final cgk0 c;
    public boolean d;
    public Object e;
    public final lbz f;

    public t8z(int i, int i2, byte b) {
        this.f33536a = b;
        switch (b) {
            case 1:
                this.b = androidx.compose.runtime.e.b(i);
                this.c = androidx.compose.runtime.e.b(i2);
                this.f = new lbz(i, 30, 100);
                break;
            default:
                this.b = androidx.compose.runtime.e.b(i);
                this.c = androidx.compose.runtime.e.b(i2);
                this.f = new lbz(i, 90, Response.OK);
                break;
        }
    }

    public final void a(int i, int i2) {
        byte b = this.f33536a;
        cgk0 cgk0Var = this.c;
        lbz lbzVar = this.f;
        cgk0 cgk0Var2 = this.b;
        switch (b) {
            case 0:
                if (i < 0.0f) {
                    adx.a("Index should be non-negative");
                }
                cgk0Var2.m(i);
                lbzVar.b(i);
                cgk0Var.m(i2);
                break;
            default:
                if (i < 0.0f) {
                    adx.a("Index should be non-negative (" + i + Separators.RPAREN);
                }
                cgk0Var2.m(i);
                lbzVar.b(i);
                cgk0Var.m(i2);
                break;
        }
    }
}
