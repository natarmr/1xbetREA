package a;

import android.util.Log;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class oqd extends yge0 {
    public final xzp d;

    public oqd(nqd nqdVar, List list) {
        this.d = new xzp(this, nqdVar);
        Iterator it = list.iterator();
        while (true) {
            int i = 0;
            if (!it.hasNext()) {
                this.d.getClass();
                w(false);
                return;
            }
            yge0 yge0Var = (yge0) it.next();
            xzp xzpVar = this.d;
            ArrayList arrayList = (ArrayList) xzpVar.e;
            int size = arrayList.size();
            if (size < 0 || size > arrayList.size()) {
                ohq.g(arrayList.size(), size, ". Given:", "Index must be between 0 and ");
                throw null;
            }
            if (yge0Var.b) {
                Log.w("ConcatAdapter", "Stable ids in the adapter will be ignored as the ConcatAdapter is configured not to have stable ids");
            }
            int size2 = arrayList.size();
            while (true) {
                if (i >= size2) {
                    i = -1;
                    break;
                } else if (((nj50) arrayList.get(i)).c == yge0Var) {
                    break;
                } else {
                    i++;
                }
            }
            if ((i != -1 ? (nj50) arrayList.get(i) : null) == null) {
                nj50 nj50Var = new nj50(yge0Var, xzpVar, (zlu0) xzpVar.b, (gle0) ((dpi0) xzpVar.g).f6468a);
                arrayList.add(size, nj50Var);
                Iterator it2 = ((ArrayList) xzpVar.c).iterator();
                while (it2.hasNext()) {
                    RecyclerView recyclerView = (RecyclerView) ((WeakReference) it2.next()).get();
                    if (recyclerView != null) {
                        yge0Var.m(recyclerView);
                    }
                }
                if (nj50Var.e > 0) {
                    ((oqd) xzpVar.f41764a).k(xzpVar.m(nj50Var), nj50Var.e);
                }
                xzpVar.f();
            }
        }
    }

    @Override // a.yge0
    public final int c(yge0 yge0Var, xhe0 xhe0Var, int i) {
        xzp xzpVar = this.d;
        nj50 nj50Var = (nj50) ((IdentityHashMap) xzpVar.d).get(xhe0Var);
        if (nj50Var == null) {
            return -1;
        }
        yge0 yge0Var2 = nj50Var.c;
        int iM = i - xzpVar.m(nj50Var);
        int iD = yge0Var2.d();
        if (iM >= 0 && iM < iD) {
            return yge0Var2.c(yge0Var, xhe0Var, iM);
        }
        StringBuilder sbT = dw9.t("Detected inconsistent adapter updates. The local position of the view holder maps to ", iM, " which is out of bounds for the adapter with size ", ".Make sure to immediately call notify methods in your adapter when you change the backing dataviewHolder:", iD);
        sbT.append(xhe0Var);
        sbT.append("adapter:");
        sbT.append(yge0Var);
        throw new IllegalStateException(sbT.toString());
    }

    @Override // a.yge0
    public final int d() {
        Iterator it = ((ArrayList) this.d.e).iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((nj50) it.next()).e;
        }
        return i;
    }

    @Override // a.yge0
    public final long e(int i) {
        xzp xzpVar = this.d;
        u3u0 u3u0VarP = xzpVar.p(i);
        nj50 nj50Var = (nj50) u3u0VarP.c;
        nj50Var.c.e(u3u0VarP.f35015a);
        nj50Var.b.getClass();
        u3u0VarP.b = false;
        u3u0VarP.c = null;
        u3u0VarP.f35015a = -1;
        xzpVar.f = u3u0VarP;
        return -1L;
    }

    @Override // a.yge0
    public final int f(int i) {
        xzp xzpVar = this.d;
        u3u0 u3u0VarP = xzpVar.p(i);
        nj50 nj50Var = (nj50) u3u0VarP.c;
        int iB = nj50Var.f23618a.b(nj50Var.c.f(u3u0VarP.f35015a));
        u3u0VarP.b = false;
        u3u0VarP.c = null;
        u3u0VarP.f35015a = -1;
        xzpVar.f = u3u0VarP;
        return iB;
    }

    @Override // a.yge0
    public final void m(RecyclerView recyclerView) {
        xzp xzpVar = this.d;
        ArrayList arrayList = (ArrayList) xzpVar.c;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((WeakReference) it.next()).get() == recyclerView) {
                return;
            }
        }
        arrayList.add(new WeakReference(recyclerView));
        Iterator it2 = ((ArrayList) xzpVar.e).iterator();
        while (it2.hasNext()) {
            ((nj50) it2.next()).c.m(recyclerView);
        }
    }

    @Override // a.yge0
    public final void n(xhe0 xhe0Var, int i) {
        xzp xzpVar = this.d;
        u3u0 u3u0VarP = xzpVar.p(i);
        ((IdentityHashMap) xzpVar.d).put(xhe0Var, (nj50) u3u0VarP.c);
        nj50 nj50Var = (nj50) u3u0VarP.c;
        nj50Var.c.a(xhe0Var, u3u0VarP.f35015a);
        u3u0VarP.b = false;
        u3u0VarP.c = null;
        u3u0VarP.f35015a = -1;
        xzpVar.f = u3u0VarP;
    }

    @Override // a.yge0
    public final xhe0 p(ViewGroup viewGroup, int i) {
        nj50 nj50VarB = ((zlu0) this.d.b).b(i);
        return nj50VarB.c.p(viewGroup, nj50VarB.f23618a.a(i));
    }

    @Override // a.yge0
    public final void q(RecyclerView recyclerView) {
        xzp xzpVar = this.d;
        ArrayList arrayList = (ArrayList) xzpVar.c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            WeakReference weakReference = (WeakReference) arrayList.get(size);
            if (weakReference.get() != null) {
                if (weakReference.get() == recyclerView) {
                    arrayList.remove(size);
                    break;
                }
            } else {
                arrayList.remove(size);
            }
        }
        Iterator it = ((ArrayList) xzpVar.e).iterator();
        while (it.hasNext()) {
            ((nj50) it.next()).c.q(recyclerView);
        }
    }

    @Override // a.yge0
    public final boolean r(xhe0 xhe0Var) {
        xzp xzpVar = this.d;
        IdentityHashMap identityHashMap = (IdentityHashMap) xzpVar.d;
        nj50 nj50Var = (nj50) identityHashMap.get(xhe0Var);
        if (nj50Var == null) {
            c99.n("Cannot find wrapper for ", xhe0Var, ", seems like it is not bound by this adapter: ", xzpVar);
            return false;
        }
        boolean zR = nj50Var.c.r(xhe0Var);
        identityHashMap.remove(xhe0Var);
        return zR;
    }

    @Override // a.yge0
    public final void s(xhe0 xhe0Var) {
        this.d.K(xhe0Var).c.s(xhe0Var);
    }

    @Override // a.yge0
    public final void t(xhe0 xhe0Var) {
        this.d.K(xhe0Var).c.t(xhe0Var);
    }

    @Override // a.yge0
    public final void u(xhe0 xhe0Var) {
        xzp xzpVar = this.d;
        IdentityHashMap identityHashMap = (IdentityHashMap) xzpVar.d;
        nj50 nj50Var = (nj50) identityHashMap.get(xhe0Var);
        if (nj50Var == null) {
            c99.n("Cannot find wrapper for ", xhe0Var, ", seems like it is not bound by this adapter: ", xzpVar);
        } else {
            nj50Var.c.u(xhe0Var);
            identityHashMap.remove(xhe0Var);
        }
    }

    @Override // a.yge0
    public final void x(int i) {
        throw new UnsupportedOperationException("Calling setStateRestorationPolicy is not allowed on the ConcatAdapter. This value is inferred from added adapters");
    }

    public final void z(int i) {
        super.x(i);
    }
}
