package a;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.xplatform.ui_core.viewcomponents.tabs.TabLayoutChips;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class xn30 implements rbe, ybo0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41153a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ xn30(zhl zhlVar, wn00 wn00Var, in30 in30Var, int i) {
        this.b = zhlVar;
        this.c = wn00Var;
        this.d = in30Var;
        this.f41153a = i;
    }

    @Override // a.rbe
    public void accept(Object obj) {
        zhl zhlVar = (zhl) this.b;
        ((bo30) obj).i(zhlVar.f44398a, zhlVar.b, (wn00) this.c, (in30) this.d, this.f41153a);
    }

    @Override // a.ybo0
    public void g(tbo0 tbo0Var, final int i) {
        gym0 gym0Var = (gym0) this.b;
        final l5r l5rVar = (l5r) this.c;
        final j1l0 j1l0Var = (j1l0) this.d;
        final swm0 swm0Var = (swm0) gym0Var.e.get(i);
        String strA = swm0Var.a();
        if (TextUtils.isEmpty(null) && !TextUtils.isEmpty(strA)) {
            tbo0Var.e.setContentDescription(strA);
        }
        tbo0Var.f33675a = strA;
        vbo0 vbo0Var = tbo0Var.e;
        if (vbo0Var != null) {
            vbo0Var.f();
        }
        boolean z = swm0Var instanceof pwm0;
        vbo0 vbo0Var2 = tbo0Var.e;
        if (z) {
            vbo0Var2.getOrCreateBadge().getClass();
        } else {
            int i2 = vbo0.l;
            if (vbo0Var2.d != null) {
                vbo0Var2.c();
            }
            vbo0Var2.e = null;
        }
        a4n0.l(tbo0Var.e, null);
        Context context = tbo0Var.e.getContext();
        context.getClass();
        boolean z2 = context.getResources().getConfiguration().getLayoutDirection() == 1;
        if (gym0Var.e.size() == 1) {
            tbo0Var.e.setPadding(0, 0, 0, 0);
        } else {
            int i3 = this.f41153a;
            if (i == 0 && z2) {
                tbo0Var.e.setPadding(0, 0, i3, 0);
            } else if (i == 0 && !z2) {
                tbo0Var.e.setPadding(i3, 0, 0, 0);
            } else if (i == q3d.i(gym0Var.e) && z2) {
                tbo0Var.e.setPadding(i3, 0, 0, 0);
            } else if (i != q3d.i(gym0Var.e) || z2) {
                tbo0Var.e.setPadding(0, 0, 0, 0);
            } else {
                tbo0Var.e.setPadding(0, 0, i3, 0);
            }
        }
        tbo0Var.e.setOnClickListener(new View.OnClickListener() { // from class: a.fym0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (((TabLayoutChips) l5rVar.c.e).getSelectedTabPosition() != i) {
                    j1l0Var.invoke(swm0Var);
                }
            }
        });
    }

    public /* synthetic */ xn30(gym0 gym0Var, int i, l5r l5rVar, j1l0 j1l0Var) {
        this.b = gym0Var;
        this.f41153a = i;
        this.c = l5rVar;
        this.d = j1l0Var;
    }
}
