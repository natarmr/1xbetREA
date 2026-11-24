package a;

import android.content.ComponentCallbacks2;
import android.content.DialogInterface;
import android.view.View;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import java.util.Collections;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import org.xbet.client1.R;
import org.xplatform.core.navigation.dialog.DialogScreen;
import org.xplatform.responsible_game.impl.navigation.ResponsibleGamblingScreens$ResponsibleGamblingFragmentScreen;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"La/zuf0;", "La/qw5;", "La/avf0;", "<init>", "()V", "a/gne0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class zuf0 extends qw5<avf0> {
    public final nae0 b2 = ltt0.p(this, yuf0.f43266a);
    public fiu0 c2;
    public final kiu0 d2;
    public static final /* synthetic */ iiy[] f2 = {new j0d0(zuf0.class, "binding", "getBinding()Lorg/xplatform/responsible_game_impl/databinding/ResponsibleGameDialogBinding;", 0)};
    public static final gne0 e2 = new gne0((byte) 7);
    public static final String g2 = zuf0.class.getSimpleName();

    public zuf0() {
        tie0 tie0Var = new tie0(this, (byte) 24);
        a8z a8zVarA = maz.a(wez.b, new lce0(new lce0(this, (byte) 23), (byte) 24));
        this.d2 = agc.G(this, sre0.f32672a.b(cvf0.class), new wbe0(a8zVarA, (byte) 24), new wbe0(a8zVarA, (byte) 25), tie0Var);
    }

    @Override // a.qw5
    public final int I0() {
        return R.attr.uikitBackgroundContent;
    }

    @Override // a.qw5
    public final yfu0 J0() {
        Object objN = this.b2.n(f2[0], this);
        objN.getClass();
        return (avf0) objN;
    }

    @Override // a.qw5
    public final void M0() {
        iiy[] iiyVarArr = f2;
        final byte b = 0;
        iiy iiyVar = iiyVarArr[0];
        nae0 nae0Var = this.b2;
        Object objN = nae0Var.n(iiyVar, this);
        objN.getClass();
        ((avf0) objN).b.setOnClickListener(new View.OnClickListener(this) { // from class: a.xuf0
            public final /* synthetic */ zuf0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b2 = b;
                zuf0 zuf0Var = this.b;
                switch (b2) {
                    case 0:
                        i1w0 i1w0Var = ((cvf0) zuf0Var.d2.getValue()).b;
                        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
                        FragmentScreen responsibleGamblingScreens$ResponsibleGamblingFragmentScreen = new ResponsibleGamblingScreens$ResponsibleGamblingFragmentScreen();
                        if (responsibleGamblingScreens$ResponsibleGamblingFragmentScreen instanceof DialogScreen) {
                            copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) responsibleGamblingScreens$ResponsibleGamblingFragmentScreen)));
                        } else {
                            copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new w0w0(responsibleGamblingScreens$ResponsibleGamblingFragmentScreen)));
                        }
                        ListIterator listIteratorO = b1j.o(i1w0Var, copyOnWriteArrayListQ, 0);
                        while (true) {
                            paw pawVar = (paw) listIteratorO;
                            if (!pawVar.hasNext()) {
                                zuf0Var.x0();
                            } else {
                                i1w0Var.a((oe50) pawVar.next());
                            }
                            break;
                        }
                        break;
                    default:
                        gne0 gne0Var = zuf0.e2;
                        zuf0Var.x0();
                        break;
                }
            }
        });
        Object objN2 = nae0Var.n(iiyVarArr[0], this);
        objN2.getClass();
        final byte b2 = 1;
        ((avf0) objN2).c.setOnClickListener(new View.OnClickListener(this) { // from class: a.xuf0
            public final /* synthetic */ zuf0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b3 = b2;
                zuf0 zuf0Var = this.b;
                switch (b3) {
                    case 0:
                        i1w0 i1w0Var = ((cvf0) zuf0Var.d2.getValue()).b;
                        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
                        FragmentScreen responsibleGamblingScreens$ResponsibleGamblingFragmentScreen = new ResponsibleGamblingScreens$ResponsibleGamblingFragmentScreen();
                        if (responsibleGamblingScreens$ResponsibleGamblingFragmentScreen instanceof DialogScreen) {
                            copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) responsibleGamblingScreens$ResponsibleGamblingFragmentScreen)));
                        } else {
                            copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new w0w0(responsibleGamblingScreens$ResponsibleGamblingFragmentScreen)));
                        }
                        ListIterator listIteratorO = b1j.o(i1w0Var, copyOnWriteArrayListQ, 0);
                        while (true) {
                            paw pawVar = (paw) listIteratorO;
                            if (!pawVar.hasNext()) {
                                zuf0Var.x0();
                            } else {
                                i1w0Var.a((oe50) pawVar.next());
                            }
                            break;
                        }
                        break;
                    default:
                        gne0 gne0Var = zuf0.e2;
                        zuf0Var.x0();
                        break;
                }
            }
        });
    }

    @Override // a.qw5
    public final void N0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(bvf0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            if (((bvf0) (ze3Var instanceof bvf0 ? ze3Var : null)) != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                i1w0VarF.getClass();
                this.c2 = new fiu0(Collections.singletonMap(cvf0.class, (fri) new zri(i1w0VarF).c));
                return;
            }
        }
        jf4.n(b1j.i(bvf0.class, "Cannot create dependency "));
    }

    @Override // a.qw5
    public final int O0() {
        return R.id.parent;
    }

    @Override // a.qw5
    public final String P0() {
        String strH = H(R.string.responsible_game);
        strH.getClass();
        return strH;
    }

    @Override // a.sik, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        dialogInterface.getClass();
        vcc.f0(i120.U(), this, g2);
        super.onDismiss(dialogInterface);
    }
}
