package a;

import java.util.Arrays;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class w81 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f38699a;
    public final /* synthetic */ n91 b;

    public /* synthetic */ w81(n91 n91Var, byte b) {
        this.f38699a = b;
        this.b = n91Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object value;
        Object value2;
        byte b = this.f38699a;
        n91 n91Var = this.b;
        switch (b) {
            case 0:
                p7m0 p7m0Var = n91Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    n91Var.f.getClass();
                } while (!p7m0Var.m(value, u81.a((u81) value, null, false, false, false, null, null, 0L, false, false, null, false, false, false, 0, null, 2064367)));
                i1w0 i1w0Var = n91Var.r;
                CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
                ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, u0w0.f34875a), i1w0Var, copyOnWriteArrayListQ, 0);
                while (true) {
                    paw pawVar = (paw) listIteratorP;
                    if (pawVar.hasNext()) {
                        i1w0Var.a((oe50) pawVar.next());
                    }
                    break;
                }
                break;
            case 1:
                p7m0 p7m0Var2 = n91Var.i.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                    n91Var.f.getClass();
                } while (!p7m0Var2.m(value2, u81.a((u81) value2, null, false, false, false, null, null, 0L, false, false, null, false, false, false, 0, null, 2097135)));
                break;
            case 2:
                int i = n91.f0;
                n91Var.P();
                break;
            case 3:
                int i2 = n91.f0;
                n91Var.P();
                break;
            case 4:
                n91Var.G(new r81(n91Var.o.b.a(R.string.error_not_installed_v2, Arrays.copyOf(new Object[]{"WebView"}, 1))));
                break;
            default:
                int i3 = n91.f0;
                n91Var.V();
                break;
        }
        return Unit.f46060a;
    }
}
