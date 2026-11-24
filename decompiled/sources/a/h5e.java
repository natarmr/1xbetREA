package a;

import java.util.ArrayList;
import java.util.ListIterator;
import org.xplatform.camera.impl.navigation.CameraScreens$CameraFragmentScreen;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class h5e implements rg90, fer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i5e f12476a;

    public h5e(i5e i5eVar) {
        this.f12476a = i5eVar;
    }

    @Override // a.fer
    public final wdr b() {
        return new rer(1, this.f12476a, i5e.class, "onCameraPermissionResult", "onCameraPermissionResult(Ljava/util/List;)V", 0);
    }

    @Override // a.rg90
    public final void d(ArrayList arrayList) {
        kud kudVar = i5e.q2;
        c6e c6eVarW0 = this.f12476a.W0();
        if (!n7x.p(arrayList)) {
            c6eVarW0.y(q5e.f28148a);
            return;
        }
        if (!c6eVarW0.f.a().M0) {
            String strH = c6eVarW0.c.h();
            if (strH.length() > 0) {
                c6eVarW0.e.a();
                c6eVarW0.y(new k5e(strH));
                return;
            }
            return;
        }
        i1w0 i1w0Var = c6eVarW0.b;
        k0w0 k0w0VarI = cs0.i(i1w0Var, i1w0Var);
        kj5 kj5Var = c6eVarW0.d;
        kkd0 kkd0Var = kkd0.LOW;
        kj5Var.getClass();
        k0w0VarI.h(new CameraScreens$CameraFragmentScreen());
        ListIterator listIteratorO = b1j.o(i1w0Var, k0w0VarI.f17489a, 0);
        while (true) {
            paw pawVar = (paw) listIteratorO;
            if (!pawVar.hasNext()) {
                return;
            } else {
                i1w0Var.a((oe50) pawVar.next());
            }
        }
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof rg90) && (obj instanceof fer)) {
            return b().equals(((fer) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return b().hashCode();
    }
}
