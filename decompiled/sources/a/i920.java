package a;

import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i920 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f14368a;
    public final /* synthetic */ x920 b;

    public /* synthetic */ i920(x920 x920Var, byte b) {
        this.f14368a = b;
        this.b = x920Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f14368a;
        x920 x920Var = this.b;
        Throwable th = (Throwable) obj;
        String str = (String) obj2;
        switch (b) {
            case 0:
                b1j.z(str, th);
                if (th instanceof zhi0) {
                    x920Var.x(((zhi0) th).c, str);
                } else if (hic.C(th)) {
                    ol60 ol60Var = x920Var.y;
                    ctf0 ctf0Var = x920Var.f;
                    ol60Var.f(new l6c0(new xdk0(pek0.f26859a, ctf0Var.b.a(R.string.no_connection_title_with_hyphen, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.no_connection_description, Arrays.copyOf(new Object[0], 0)), null, null, null, 120)));
                } else {
                    x920Var.y.f(new l6c0(new xdk0(rek0.b, str, null, null, null, null, 124)));
                }
                break;
            default:
                x920Var.y.f(new l6c0(new xdk0(rek0.b, str, null, null, null, null, 124)));
                break;
        }
        return Unit.f46060a;
    }
}
