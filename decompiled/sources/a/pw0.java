package a;

import java.util.Arrays;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class pw0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f27686a;
    public final /* synthetic */ tw0 b;

    public /* synthetic */ pw0(tw0 tw0Var, byte b) {
        this.f27686a = b;
        this.b = tw0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object value;
        byte b = this.f27686a;
        tw0 tw0Var = this.b;
        switch (b) {
            case 0:
                p7m0 p7m0Var = tw0Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    tw0Var.f.getClass();
                } while (!p7m0Var.m(value, jw0.a((jw0) value, false, false, false, null, 3327)));
                i1w0 i1w0VarC = tw0Var.r.c();
                CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0VarC);
                ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, u0w0.f34875a), i1w0VarC, copyOnWriteArrayListQ, 0);
                while (true) {
                    paw pawVar = (paw) listIteratorP;
                    if (pawVar.hasNext()) {
                        i1w0VarC.a((oe50) pawVar.next());
                    }
                    break;
                }
                break;
            case 1:
                int i = tw0.x;
                tw0Var.M();
                break;
            case 2:
                int i2 = tw0.x;
                tw0Var.M();
                break;
            case 3:
                tw0Var.G(new hw0(tw0Var.o.b.a(R.string.error_not_installed_v2, Arrays.copyOf(new Object[]{"WebView"}, 1))));
                break;
            default:
                int i3 = tw0.x;
                tw0Var.N();
                break;
        }
        return Unit.f46060a;
    }
}
