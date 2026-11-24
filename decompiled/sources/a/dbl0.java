package a;

import android.app.Application;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class dbl0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f5811a;
    public final /* synthetic */ gbl0 b;

    public /* synthetic */ dbl0(gbl0 gbl0Var, byte b) {
        this.f5811a = b;
        this.b = gbl0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f5811a;
        byte b2 = 0;
        gbl0 gbl0Var = this.b;
        byte b3 = 1;
        switch (b) {
            case 0:
                lme0 lme0Var = gbl0.c2;
                Application application = gbl0Var.n0().getApplication();
                application.getClass();
                return application;
            case 1:
                lme0 lme0Var2 = gbl0.c2;
                if (bww.Q(gbl0Var.I0().c.f1)) {
                    gbl0Var.I0().c.B();
                } else {
                    ncl0 ncl0VarJ0 = gbl0Var.J0();
                    lhf0 lhf0Var = ncl0VarJ0.y;
                    long j = ((zqs) ((p7m0) ncl0VarJ0.w()).getValue()).c;
                    boolean z = ((zqs) ((p7m0) ncl0VarJ0.w()).getValue()).f;
                    ((bn6) lhf0Var.b).c(j, true, z);
                    ((je) lhf0Var.d).e(j, true, z);
                    i1w0 i1w0Var = ncl0VarJ0.i;
                    CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
                    ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0.f26173a), i1w0Var, copyOnWriteArrayListQ, 0);
                    while (true) {
                        paw pawVar = (paw) listIteratorP;
                        if (pawVar.hasNext()) {
                            i1w0Var.a((oe50) pawVar.next());
                        }
                    }
                }
                return Unit.f46060a;
            case 2:
                mui muiVar = gbl0Var.L1;
                if (muiVar != null) {
                    return new q0h0(muiVar);
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            default:
                lme0 lme0Var3 = gbl0.c2;
                bbl0 bbl0Var = new bbl0(gbl0Var, (byte) 0);
                cbl0 cbl0Var = new cbl0(gbl0Var, b2);
                bbl0 bbl0Var2 = new bbl0(gbl0Var, (byte) 1);
                cbl0 cbl0Var2 = new cbl0(gbl0Var, b3);
                bbl0 bbl0Var3 = new bbl0(gbl0Var, (byte) 2);
                qfs qfsVar = new qfs(ofs.f25183a);
                byte b4 = 3;
                gbn gbnVar = new gbn(new im8((byte) 16), new lq4(b4, (byte) 17), new vca(bbl0Var, b3), zx3.A);
                dp dpVar = qfsVar.d;
                dpVar.b(gbnVar);
                dpVar.b(new gbn(new im8((byte) 26), new lq4(b4, (byte) 23), new dg(cbl0Var, bbl0Var2, bbl0Var, cbl0Var2, bbl0Var3, (byte) 7), qja.c));
                dpVar.b(new gbn(new im8((byte) 15), new lq4(b4, (byte) 16), new vca(bbl0Var, b2), zx3.z));
                dpVar.b(new gbn(new im8((byte) 21), new lq4(b4, (byte) 21), new vca(bbl0Var, (byte) 2), zx3.f1));
                dpVar.b(new gbn(new im8((byte) 20), new lq4(b4, (byte) 20), new d69((byte) 16), zx3.Z));
                dpVar.b(new gbn(new im8((byte) 22), new lq4(b4, (byte) 22), new d69((byte) 17), qja.b));
                dpVar.b(new gbn(new im8((byte) 17), new lq4(b4, (byte) 18), new d69((byte) 13), zx3.B));
                dpVar.b(new gbn(new im8((byte) 19), new lq4(b4, (byte) 19), new d69((byte) 14), zx3.Y));
                dpVar.b(new gbn(new jbp((byte) 27), new atq(b4, (byte) 1), new vca(bbl0Var, b4), gzn.y));
                return qfsVar;
        }
    }
}
