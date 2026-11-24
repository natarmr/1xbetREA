package a;

import java.util.ListIterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ykv implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f42810a;
    public final /* synthetic */ alv b;

    public /* synthetic */ ykv(alv alvVar, byte b) {
        this.f42810a = b;
        this.b = alvVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f42810a;
        alv alvVar = this.b;
        switch (b) {
            case 0:
                i1w0 i1w0Var = alvVar.g;
                k0w0 k0w0Var = new k0w0(i1w0Var);
                k0w0Var.h(oct.f(alvVar.h, 0L, null, 0, null, null, 31));
                ListIterator listIteratorO = b1j.o(i1w0Var, k0w0Var.f17489a, 0);
                while (true) {
                    paw pawVar = (paw) listIteratorO;
                    if (!pawVar.hasNext()) {
                        alvVar.v(rkv.GAMES);
                    } else {
                        i1w0Var.a((oe50) pawVar.next());
                    }
                    break;
                }
                break;
            default:
                v88.b(alvVar.f, alvVar.g, 0L, 4);
                break;
        }
        return Unit.f46060a;
    }
}
