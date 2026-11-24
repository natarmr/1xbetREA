package a;

import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class pfe0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f26900a;
    public final /* synthetic */ wfe0 b;

    public /* synthetic */ pfe0(wfe0 wfe0Var, byte b) {
        this.f26900a = b;
        this.b = wfe0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        byte b = this.f26900a;
        wfe0 wfe0Var = this.b;
        switch (b) {
            case 0:
                Throwable th = (Throwable) obj;
                th.getClass();
                boolean z = th instanceof jfp;
                ctf0 ctf0Var = wfe0Var.r;
                if (z) {
                    wfe0Var.G(new lfe0(ctf0Var.b.a(R.string.error, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.casino_favorites_limit_error, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.ok_new, Arrays.copyOf(new Object[0], 0))));
                } else {
                    wfe0Var.G(new kfe0(jwb.G(th, ctf0Var)));
                }
                break;
            default:
                pb0 pb0Var = (pb0) obj;
                pb0Var.getClass();
                p7m0 p7m0Var = wfe0Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    wfe0Var.f.getClass();
                } while (!p7m0Var.m(value, nfe0.a((nfe0) value, null, false, null, pb0Var.f26680a, 255)));
                break;
        }
        return Unit.f46060a;
    }
}
