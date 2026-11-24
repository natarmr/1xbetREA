package a;

import android.view.View;
import android.widget.ImageView;
import android.widget.PopupWindow;
import androidx.media3.ui.PlayerControlView;

/* JADX INFO: loaded from: classes.dex */
public final class z0a0 implements ky90, View.OnClickListener, PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PlayerControlView f43557a;

    public z0a0(PlayerControlView playerControlView) {
        this.f43557a = playerControlView;
    }

    @Override // a.ky90
    public final void h(jy90 jy90Var) {
        boolean zA = jy90Var.a(4, 5, 13);
        PlayerControlView playerControlView = this.f43557a;
        if (zA) {
            float[] fArr = PlayerControlView.i2;
            playerControlView.q();
        }
        if (jy90Var.a(4, 5, 7, 13)) {
            float[] fArr2 = PlayerControlView.i2;
            playerControlView.s();
        }
        if (jy90Var.a(8, 13)) {
            float[] fArr3 = PlayerControlView.i2;
            playerControlView.t();
        }
        if (jy90Var.a(9, 13)) {
            float[] fArr4 = PlayerControlView.i2;
            playerControlView.v();
        }
        if (jy90Var.a(8, 9, 11, 0, 16, 17, 13)) {
            float[] fArr5 = PlayerControlView.i2;
            playerControlView.p();
        }
        if (jy90Var.a(11, 0, 13)) {
            float[] fArr6 = PlayerControlView.i2;
            playerControlView.w();
        }
        if (jy90Var.a(12, 13)) {
            float[] fArr7 = PlayerControlView.i2;
            playerControlView.r();
        }
        if (jy90Var.a(2, 13)) {
            float[] fArr8 = PlayerControlView.i2;
            playerControlView.x();
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        PlayerControlView playerControlView = this.f43557a;
        ImageView imageView = playerControlView.g1;
        View view2 = playerControlView.l1;
        View view3 = playerControlView.k1;
        View view4 = playerControlView.j1;
        n1a0 n1a0Var = playerControlView.f45391a;
        my90 my90Var = playerControlView.Q1;
        if (my90Var == null) {
            return;
        }
        n1a0Var.g();
        if (playerControlView.u == view) {
            ulo uloVar = (ulo) my90Var;
            if (uloVar.w(9)) {
                uloVar.K();
                return;
            }
            return;
        }
        if (playerControlView.t == view) {
            ulo uloVar2 = (ulo) my90Var;
            if (uloVar2.w(7)) {
                uloVar2.L();
                return;
            }
            return;
        }
        if (playerControlView.w == view) {
            ulo uloVar3 = (ulo) my90Var;
            if (uloVar3.s() == 4 || !uloVar3.w(12)) {
                return;
            }
            uloVar3.c0();
            long jL = uloVar3.l() + ((long) uloVar3.k0);
            long jQ = uloVar3.q();
            if (jQ != -9223372036854775807L) {
                jL = Math.min(jL, jQ);
            }
            uloVar3.J(Math.max(jL, 0L));
            return;
        }
        if (playerControlView.x == view) {
            ulo uloVar4 = (ulo) my90Var;
            if (uloVar4.w(11)) {
                uloVar4.c0();
                long jL2 = uloVar4.l() + (-uloVar4.j0);
                long jQ2 = uloVar4.q();
                if (jQ2 != -9223372036854775807L) {
                    jL2 = Math.min(jL2, jQ2);
                }
                uloVar4.J(Math.max(jL2, 0L));
                return;
            }
            return;
        }
        if (playerControlView.v == view) {
            if (vtt0.V(my90Var, playerControlView.V1)) {
                vtt0.E(my90Var);
                return;
            }
            ulo uloVar5 = (ulo) my90Var;
            if (uloVar5.w(1)) {
                uloVar5.P(false);
                return;
            }
            return;
        }
        if (playerControlView.A == view) {
            ulo uloVar6 = (ulo) my90Var;
            if (uloVar6.w(15)) {
                uloVar6.c0();
                int i = uloVar6.H;
                int i2 = playerControlView.b2;
                for (int i3 = 1; i3 <= 2; i3++) {
                    int i4 = (i + i3) % 3;
                    if (i4 != 0) {
                        if (i4 != 1) {
                            if (i4 != 2 || (i2 & 2) == 0) {
                            }
                        } else if ((i2 & 1) == 0) {
                        }
                    }
                    i = i4;
                }
                uloVar6.Q(i);
                return;
            }
            return;
        }
        if (playerControlView.B == view) {
            ulo uloVar7 = (ulo) my90Var;
            if (uloVar7.w(14)) {
                uloVar7.c0();
                boolean z = !uloVar7.I;
                vg00 vg00Var = uloVar7.m;
                uloVar7.c0();
                if (uloVar7.I != z) {
                    uloVar7.I = z;
                    uloVar7.l.g.b(12, z ? 1 : 0, 0).b();
                    vg00Var.c(9, new mlo((byte) 0, z));
                    uloVar7.Y();
                    vg00Var.b();
                    return;
                }
                return;
            }
            return;
        }
        if (view4 == view) {
            n1a0Var.f();
            playerControlView.d(playerControlView.m, view4);
            return;
        }
        if (view3 == view) {
            n1a0Var.f();
            playerControlView.d(playerControlView.n, view3);
        } else if (view2 == view) {
            n1a0Var.f();
            playerControlView.d(playerControlView.p, view2);
        } else if (imageView == view) {
            n1a0Var.f();
            playerControlView.d(playerControlView.o, imageView);
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        PlayerControlView playerControlView = this.f43557a;
        if (playerControlView.h2) {
            playerControlView.f45391a.g();
        }
    }
}
