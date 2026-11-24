package a;

import android.content.ComponentCallbacks2;
import android.view.View;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.verification.status.impl.navigation.VerificationStatusScreens$AdditionalVerificationStatusFragmentScreen;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"La/w7u0;", "La/qw5;", "La/x7u0;", "<init>", "()V", "a/svs0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class w7u0 extends qw5<x7u0> {
    public final nae0 b2 = ltt0.p(this, v7u0.f36947a);
    public vyi c2;
    public final kiu0 d2;
    public static final /* synthetic */ iiy[] f2 = {new j0d0(w7u0.class, "binding", "getBinding()Lorg/xplatform/verification/status/impl/databinding/VerificationNotifyDialogBinding;", 0)};
    public static final svs0 e2 = new svs0((byte) 7);

    public w7u0() {
        rbt0 rbt0Var = new rbt0(this, (byte) 8);
        a8z a8zVarA = maz.a(wez.b, new cvs0(new cvs0(this, (byte) 11), (byte) 12));
        this.d2 = agc.G(this, sre0.f32672a.b(z7u0.class), new w6u0(a8zVarA, (byte) 2), new w6u0(a8zVarA, (byte) 3), rbt0Var);
    }

    @Override // a.qw5
    public final int I0() {
        return R.attr.uikitBackgroundContent;
    }

    @Override // a.qw5
    public final void M0() {
        final byte b = 0;
        dyb.O(J0().d, new Function1(this) { // from class: a.u7u0
            public final /* synthetic */ w7u0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b2 = b;
                w7u0 w7u0Var = this.b;
                View view = (View) obj;
                switch (b2) {
                    case 0:
                        svs0 svs0Var = w7u0.e2;
                        view.getClass();
                        z7u0 z7u0Var = (z7u0) w7u0Var.d2.getValue();
                        i1w0 i1w0Var = z7u0Var.b;
                        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
                        ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0.f26173a), i1w0Var, copyOnWriteArrayListQ, 0);
                        while (true) {
                            paw pawVar = (paw) listIteratorP;
                            if (!pawVar.hasNext()) {
                                k0w0 k0w0Var = new k0w0(i1w0Var);
                                svs0 svs0Var2 = mbu0.b;
                                k0w0Var.m(new VerificationStatusScreens$AdditionalVerificationStatusFragmentScreen(0, z7u0Var.c));
                                ListIterator listIteratorO = b1j.o(i1w0Var, k0w0Var.f17489a, 0);
                                while (true) {
                                    paw pawVar2 = (paw) listIteratorO;
                                    if (pawVar2.hasNext()) {
                                        i1w0Var.a((oe50) pawVar2.next());
                                    }
                                }
                            } else {
                                i1w0Var.a((oe50) pawVar.next());
                            }
                            break;
                        }
                        break;
                    default:
                        svs0 svs0Var3 = w7u0.e2;
                        view.getClass();
                        w7u0Var.x0();
                        break;
                }
                return Unit.f46060a;
            }
        });
        final byte b2 = 1;
        dyb.O(J0().c, new Function1(this) { // from class: a.u7u0
            public final /* synthetic */ w7u0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b3 = b2;
                w7u0 w7u0Var = this.b;
                View view = (View) obj;
                switch (b3) {
                    case 0:
                        svs0 svs0Var = w7u0.e2;
                        view.getClass();
                        z7u0 z7u0Var = (z7u0) w7u0Var.d2.getValue();
                        i1w0 i1w0Var = z7u0Var.b;
                        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
                        ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0.f26173a), i1w0Var, copyOnWriteArrayListQ, 0);
                        while (true) {
                            paw pawVar = (paw) listIteratorP;
                            if (!pawVar.hasNext()) {
                                k0w0 k0w0Var = new k0w0(i1w0Var);
                                svs0 svs0Var2 = mbu0.b;
                                k0w0Var.m(new VerificationStatusScreens$AdditionalVerificationStatusFragmentScreen(0, z7u0Var.c));
                                ListIterator listIteratorO = b1j.o(i1w0Var, k0w0Var.f17489a, 0);
                                while (true) {
                                    paw pawVar2 = (paw) listIteratorO;
                                    if (pawVar2.hasNext()) {
                                        i1w0Var.a((oe50) pawVar2.next());
                                    }
                                }
                            } else {
                                i1w0Var.a((oe50) pawVar.next());
                            }
                            break;
                        }
                        break;
                    default:
                        svs0 svs0Var3 = w7u0.e2;
                        view.getClass();
                        w7u0Var.x0();
                        break;
                }
                return Unit.f46060a;
            }
        });
    }

    @Override // a.qw5
    public final void N0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(y7u0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            y7u0 y7u0Var = (y7u0) (ze3Var instanceof y7u0 ? ze3Var : null);
            if (y7u0Var != null) {
                r9u r9uVar = y7u0Var.f42171a;
                r9uVar.getClass();
                this.c2 = (vyi) ((n5d0) new iqi(r9uVar).b).get();
                return;
            }
        }
        jf4.n(b1j.i(y7u0.class, "Cannot create dependency "));
    }

    @Override // a.qw5
    public final int O0() {
        return J0().b.getId();
    }

    @Override // a.qw5
    public final String P0() {
        String strH = H(R.string.verification);
        strH.getClass();
        return strH;
    }

    @Override // a.qw5
    /* JADX INFO: renamed from: Q0, reason: merged with bridge method [inline-methods] */
    public final x7u0 J0() {
        Object objN = this.b2.n(f2[0], this);
        objN.getClass();
        return (x7u0) objN;
    }
}
