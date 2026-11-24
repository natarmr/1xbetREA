package a;

import a.iiy;
import a.m1r;
import a.ufx;
import a.wqz;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.xplatform.core.navigation.dialog.DialogScreen;
import org.xplatform.limits_africa.api.domain.LimitGroupEnum;

/* JADX INFO: loaded from: classes2.dex */
public final class woz extends i3t0 {
    public final i1w0 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public woz(i1w0 i1w0Var, mne mneVar, gtu gtuVar) {
        Object value;
        super(null, new pcy((byte) 22), new z8z((byte) 15), cvm0.p(mneVar.c, mneVar.f22085a), null);
        gtuVar.getClass();
        this.o = i1w0Var;
        oiq0 oiq0Var = (oiq0) gtz.f11904a.f13549a;
        oiq0Var = oiq0Var == null ? new oiq0(LimitGroupEnum.c, miq0.f21857a, 0L, "", 0L, false, false, false, qrz.d, iun.f15405a, false) : oiq0Var;
        p7m0 p7m0Var = this.i.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
            this.f.getClass();
        } while (!p7m0Var.m(value, uoz.a((uoz) value, oiq0Var, null, 6)));
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        y95 y95Var;
        final String str;
        moz mozVar = (moz) obj;
        mozVar.getClass();
        boolean zEquals = mozVar.equals(ioz.f15138a);
        p0w0 p0w0Var = p0w0.f26173a;
        i1w0 i1w0Var = this.o;
        if (zEquals) {
            CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
            ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0Var), i1w0Var, copyOnWriteArrayListQ, 0);
            while (true) {
                paw pawVar = (paw) listIteratorP;
                if (!pawVar.hasNext()) {
                    return;
                } else {
                    i1w0Var.a((oe50) pawVar.next());
                }
            }
        } else if (mozVar.equals(koz.f18652a)) {
            w85 w85Var = ((uoz) D()).b;
            if (w85Var == null) {
                return;
            }
            final int i = w85Var.f38705a;
            w85 w85Var2 = ((uoz) D()).b;
            if (w85Var2 == null || (str = w85Var2.b) == null) {
                return;
            }
            FragmentScreen fragmentScreen = new FragmentScreen(i, str) { // from class: org.xplatform.limits_africa.impl.presentation.LimitsAfricaScreens$LimitSelfExcludeReasonAfricaFragmentScreen

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f46746a;
                public final String b;

                {
                    str.getClass();
                    this.f46746a = i;
                    this.b = str;
                }

                @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                public final Fragment a(m1r m1rVar) {
                    m1rVar.getClass();
                    wqz.Q1.getClass();
                    String str2 = this.b;
                    str2.getClass();
                    wqz wqzVar = new wqz();
                    iiy[] iiyVarArr = wqz.R1;
                    wqzVar.N1.I(wqzVar, iiyVarArr[1], this.f46746a);
                    wqzVar.O1.x(wqzVar, iiyVarArr[2], str2);
                    return wqzVar;
                }

                @Override // a.m7h0
                /* JADX INFO: renamed from: b */
                public final String getF45455a() {
                    return ufx.C(this);
                }

                @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                /* JADX INFO: renamed from: g */
                public final /* bridge */ boolean getB() {
                    return true;
                }
            };
            i1w0Var.getClass();
            CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
            if (fragmentScreen instanceof DialogScreen) {
                copyOnWriteArrayList.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) fragmentScreen)));
            } else {
                copyOnWriteArrayList.add(new c8d(y7d.f42146a, new w0w0(fragmentScreen)));
            }
            ListIterator listIteratorO = b1j.o(i1w0Var, copyOnWriteArrayList, 0);
            while (true) {
                paw pawVar2 = (paw) listIteratorO;
                if (!pawVar2.hasNext()) {
                    return;
                } else {
                    i1w0Var.a((oe50) pawVar2.next());
                }
            }
        } else {
            if (mozVar instanceof loz) {
                p7m0 p7m0Var = this.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    this.f.getClass();
                    y95Var = ((loz) mozVar).f20414a;
                } while (!p7m0Var.m(value, uoz.a((uoz) value, null, new w85(y95Var.f42228a, y95Var.b, y95Var.c), 5)));
                return;
            }
            if (mozVar.equals(hoz.f13416a)) {
                E();
                return;
            }
            if (!mozVar.equals(joz.f16874a)) {
                t9f.b();
                return;
            }
            CopyOnWriteArrayList copyOnWriteArrayListQ2 = b1j.q(i1w0Var);
            ListIterator listIteratorP2 = b1j.p(copyOnWriteArrayListQ2, new c8d(y7d.f42146a, p0w0Var), i1w0Var, copyOnWriteArrayListQ2, 0);
            while (true) {
                paw pawVar3 = (paw) listIteratorP2;
                if (!pawVar3.hasNext()) {
                    return;
                } else {
                    i1w0Var.a((oe50) pawVar3.next());
                }
            }
        }
    }
}
