package a;

import com.github.terrakok.cicerone.androidx.FragmentScreen;
import com.github.terrakok.cicerone.androidx.FragmentScreen$Companion$invoke$1;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class xs3 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f41395a;
    public final /* synthetic */ zu3 b;

    public /* synthetic */ xs3(zu3 zu3Var, byte b) {
        this.f41395a = b;
        this.b = zu3Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        FragmentScreen fragmentScreenA;
        byte b = this.f41395a;
        zu3 zu3Var = this.b;
        switch (b) {
            case 0:
                return ((pru) zu3Var.J.get()).a();
            default:
                z7z z7zVar = zu3Var.u;
                ((u6k) z7zVar.get()).a().getClass();
                ((u6k) z7zVar.get()).c().getClass();
                ((u6k) z7zVar.get()).b().getClass();
                if (((dpx) zu3Var.b.get()).f6487a.i()) {
                    ((y58) zu3Var.d.get()).i();
                    fragmentScreenA = new FragmentScreen$Companion$invoke$1(null, new jf4((byte) 26), true);
                } else {
                    fragmentScreenA = ((bh3) zu3Var.A.get()).a();
                }
                i1w0 i1w0Var = zu3Var.c;
                CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
                ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, new y0w0(fragmentScreenA)), i1w0Var, copyOnWriteArrayListQ, 0);
                while (true) {
                    paw pawVar = (paw) listIteratorP;
                    if (!pawVar.hasNext()) {
                        return Unit.f46060a;
                    }
                    i1w0Var.a((oe50) pawVar.next());
                }
                break;
        }
    }
}
