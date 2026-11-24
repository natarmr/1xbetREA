package a;

import com.github.terrakok.cicerone.androidx.FragmentScreen;
import java.io.File;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.core.navigation.dialog.DialogScreen;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class r590 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f29874a;
    public final /* synthetic */ w590 b;

    public /* synthetic */ r590(w590 w590Var, byte b) {
        this.f29874a = b;
        this.b = w590Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f29874a;
        byte b2 = 0;
        yje yjeVar = null;
        w590 w590Var = this.b;
        switch (b) {
            case 0:
                mi70 mi70Var = w590.W1;
                w590Var.I0().w();
                return Unit.f46060a;
            case 1:
                mi70 mi70Var2 = w590.W1;
                w590Var.G0();
                return Unit.f46060a;
            case 2:
                fiu0 fiu0Var = w590Var.M1;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 3:
                mi70 mi70Var3 = w590.W1;
                return m7x.P(w590Var, "android.permission.CAMERA", j120.V()).d();
            case 4:
                mi70 mi70Var4 = w590.W1;
                w590Var.G0();
                return Unit.f46060a;
            case 5:
                mi70 mi70Var5 = w590.W1;
                s690 s690VarI0 = w590Var.I0();
                File filesDir = w590Var.o0().getFilesDir();
                filesDir.getClass();
                sac.V(jiu0.a(s690VarI0), new ev80((byte) 11), null, null, new o690(s690VarI0, filesDir, yjeVar, b2), 14);
                return Unit.f46060a;
            case 6:
                mi70 mi70Var6 = w590.W1;
                s690 s690VarI1 = w590Var.I0();
                i1w0 i1w0Var = s690VarI1.i;
                CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
                FragmentScreen fragmentScreenJ = jh70.j(s690VarI1.h, true);
                if (fragmentScreenJ instanceof DialogScreen) {
                    copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) fragmentScreenJ)));
                } else {
                    copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new w0w0(fragmentScreenJ)));
                }
                ListIterator listIteratorO = b1j.o(i1w0Var, copyOnWriteArrayListQ, 0);
                while (true) {
                    paw pawVar = (paw) listIteratorO;
                    if (!pawVar.hasNext()) {
                        return Unit.f46060a;
                    }
                    i1w0Var.a((oe50) pawVar.next());
                }
                break;
            default:
                mi70 mi70Var7 = w590.W1;
                s690 s690VarI2 = w590Var.I0();
                p7m0 p7m0Var = s690VarI2.v;
                k690 k690Var = new k690(s690VarI2.z);
                p7m0Var.getClass();
                p7m0Var.o(null, k690Var);
                return Unit.f46060a;
        }
    }
}
