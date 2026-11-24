package a;

import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b3b0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f1894a;
    public final /* synthetic */ v3b0 b;

    public /* synthetic */ b3b0(v3b0 v3b0Var, byte b) {
        this.f1894a = b;
        this.b = v3b0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f1894a;
        v3b0 v3b0Var = this.b;
        switch (b) {
            case 0:
                Throwable th = (Throwable) obj;
                th.getClass();
                v3b0Var.H(new jfa0((byte) 25));
                th.printStackTrace();
                break;
            case 1:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                v3b0Var.H(new jfa0((byte) 26));
                th2.printStackTrace();
                break;
            case 2:
                ((Throwable) obj).getClass();
                v3b0Var.H(new jfa0((byte) 27));
                break;
            case 3:
                Throwable th3 = (Throwable) obj;
                th3.getClass();
                v3b0Var.v.b(th3, new jfa0((byte) 24));
                break;
            case 4:
                Throwable th4 = (Throwable) obj;
                th4.getClass();
                boolean z = th4 instanceof jfp;
                ctf0 ctf0Var = v3b0Var.s;
                if (z) {
                    v3b0Var.G(new r2b0(ctf0Var.b.a(R.string.error, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.casino_favorites_limit_error, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.ok_new, Arrays.copyOf(new Object[0], 0))));
                } else {
                    v3b0Var.G(new q2b0(jwb.G(th4, ctf0Var)));
                }
                break;
            case 5:
                k0w0 k0w0Var = (k0w0) obj;
                k0w0Var.getClass();
                k0w0Var.h(v3b0Var.t.q(new fr1(null, null, 3)));
                break;
            case 6:
                Throwable th5 = (Throwable) obj;
                th5.getClass();
                v3b0Var.v.b(th5, new jfa0((byte) 23));
                break;
            case 7:
                k0w0 k0w0Var2 = (k0w0) obj;
                k0w0Var2.getClass();
                k0w0Var2.h(v3b0Var.t.q(new hr1(0L, 3)));
                break;
            default:
                Throwable th6 = (Throwable) obj;
                th6.getClass();
                boolean z2 = th6 instanceof jfp;
                ctf0 ctf0Var2 = v3b0Var.s;
                if (z2) {
                    v3b0Var.G(new r2b0(ctf0Var2.b.a(R.string.error, Arrays.copyOf(new Object[0], 0)), ctf0Var2.b.a(R.string.casino_favorites_limit_error, Arrays.copyOf(new Object[0], 0)), ctf0Var2.b.a(R.string.ok_new, Arrays.copyOf(new Object[0], 0))));
                } else {
                    v3b0Var.G(new q2b0(jwb.G(th6, ctf0Var2)));
                }
                break;
        }
        return Unit.f46060a;
    }
}
