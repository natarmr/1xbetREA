package a;

import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class zn6 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f44659a;
    public final /* synthetic */ fo6 b;

    public /* synthetic */ zn6(fo6 fo6Var, byte b) {
        this.f44659a = b;
        this.b = fo6Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f44659a;
        byte b2 = 0;
        fo6 fo6Var = this.b;
        switch (b) {
            case 0:
                fiu0 fiu0Var = fo6Var.K1;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 1:
                kj5 kj5Var = fo6.W1;
                fo6 fo6Var2 = this.b;
                pw4 pw4Var = new pw4(0, fo6Var2.H0(), po6.class, "onTeamsHeaderClicked", "onTeamsHeaderClicked()V", 0, (byte) 5);
                yj5 yj5Var = new yj5(1, fo6Var2, fo6.class, "showSelectActionDialog", "showSelectActionDialog(Lorg/xplatform/bet_constructor/impl/core/domain/models/PlayerModel;)V", 0, (byte) 10);
                yj5 yj5Var2 = new yj5(1, fo6Var2.H0(), po6.class, "onBetHeaderClick", "onBetHeaderClick(J)V", 0, (byte) 11);
                ao6 ao6Var = new ao6(fo6Var2, (byte) 1);
                bo6 bo6Var = new bo6(fo6Var2, (byte) 2);
                z7z z7zVar = fo6Var2.O1;
                if (z7zVar == null) {
                    Intrinsics.h("resourceManager");
                    throw null;
                }
                Object obj = z7zVar.get();
                obj.getClass();
                ctf0 ctf0Var = (ctf0) obj;
                xv6 xv6Var = new xv6(xv6.f);
                gbn gbnVar = new gbn(new zgp0((byte) 11), new asj0(3, (byte) 28), new kpp0(pw4Var, b2), pfo0.g);
                dp dpVar = xv6Var.d;
                dpVar.b(gbnVar);
                dpVar.b(new gbn(new zgp0((byte) 12), new asj0(3, (byte) 29), new nop0(yj5Var, (byte) 3), pfo0.h));
                dpVar.b(new gbn(new os6((byte) 7), new lq4(3, (byte) 9), new os5(yj5Var2, (byte) 15), zx3.s));
                dpVar.b(new gbn(new i87((byte) 6), new lq4(3, (byte) 11), new os5(ao6Var, (byte) 21), zx3.u));
                int iA = ctf0Var.a(R.color.static_transparent);
                int iB = ctf0.b(R.attr.uikitBackground, ctf0Var);
                dpVar.b(new gbn(new gh5((byte) 10), new lq4(3, (byte) 7), new xc6((byte) 0, iA, iB, ao6Var, bo6Var), zx3.q));
                return xv6Var;
            case 2:
                kj5 kj5Var2 = fo6.W1;
                po6 po6VarH0 = fo6Var.H0();
                Long l = po6VarH0.Q;
                if (l != null) {
                    po6VarH0.z(true, l.longValue());
                }
                po6VarH0.Q = null;
                return Unit.f46060a;
            default:
                kj5 kj5Var3 = fo6.W1;
                i1w0 i1w0Var = fo6Var.H0().E;
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
        }
    }
}
