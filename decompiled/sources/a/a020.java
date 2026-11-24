package a;

import com.github.terrakok.cicerone.androidx.FragmentScreen;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.core.navigation.dialog.DialogScreen;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class a020 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f5a;
    public final /* synthetic */ c020 b;

    public /* synthetic */ a020(c020 c020Var, byte b) {
        this.f5a = b;
        this.b = c020Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f5a;
        c020 c020Var = this.b;
        switch (b) {
            case 0:
                wsz wszVar = c020.U1;
                i1w0 i1w0Var = c020Var.I0().d;
                CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
                ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0.f26173a), i1w0Var, copyOnWriteArrayListQ, 0);
                while (true) {
                    paw pawVar = (paw) listIteratorP;
                    if (!pawVar.hasNext()) {
                        return Unit.f46060a;
                    }
                    i1w0Var.a((oe50) pawVar.next());
                }
                break;
            case 1:
                wsz wszVar2 = c020.U1;
                return new hc50("PROFILE_BUTTON_ID", ybg0.f42342a, R.drawable.ic_glyph_circle_profile, new a020(c020Var, (byte) 6), 2032);
            case 2:
                wsz wszVar3 = c020.U1;
                return new hc50("INFO_BUTTON_ID", ybg0.f42342a, R.drawable.ic_glyph_info_circle, new a020(c020Var, (byte) 5), 2032);
            case 3:
                fiu0 fiu0Var = c020Var.N1;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 4:
                wsz wszVar4 = c020.U1;
                l020 l020VarI0 = c020Var.I0();
                p7m0 p7m0Var = l020VarI0.t;
                tz10 tz10Var = new tz10(((d020) l020VarI0.s.getValue()).c);
                p7m0Var.getClass();
                p7m0Var.o(null, tz10Var);
                return Unit.f46060a;
            case 5:
                wsz wszVar5 = c020.U1;
                l020 l020VarI1 = c020Var.I0();
                l020VarI1.m.p();
                l020VarI1.n.e("details");
                sac.V(jiu0.a(l020VarI1), new h020(l020VarI1, (byte) 2), null, l020VarI1.h.f22085a, new slx(l020VarI1, null, (byte) 29), 10);
                return Unit.f46060a;
            default:
                wsz wszVar6 = c020.U1;
                l020 l020VarI2 = c020Var.I0();
                i8i.D("screen", "settings", l020VarI2.l.f44322a, "acc_pers_data_move");
                b1j.v("settings", l020VarI2.k.f1455a, 11012L);
                i1w0 i1w0Var2 = l020VarI2.d;
                CopyOnWriteArrayList copyOnWriteArrayListQ2 = b1j.q(i1w0Var2);
                FragmentScreen fragmentScreenJ = jh70.j(l020VarI2.b, false);
                if (fragmentScreenJ instanceof DialogScreen) {
                    copyOnWriteArrayListQ2.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) fragmentScreenJ)));
                } else {
                    copyOnWriteArrayListQ2.add(new c8d(y7d.f42146a, new w0w0(fragmentScreenJ)));
                }
                ListIterator listIteratorO = b1j.o(i1w0Var2, copyOnWriteArrayListQ2, 0);
                while (true) {
                    paw pawVar2 = (paw) listIteratorO;
                    if (!pawVar2.hasNext()) {
                        return Unit.f46060a;
                    }
                    i1w0Var2.a((oe50) pawVar2.next());
                }
                break;
        }
    }
}
