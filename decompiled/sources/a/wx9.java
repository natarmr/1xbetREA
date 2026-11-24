package a;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class wx9 extends vx9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f39921a;
    public final Object b;

    public wx9(List list) {
        this.f39921a = (byte) 0;
        this.b = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            vx9 vx9Var = (vx9) it.next();
            if (!(vx9Var instanceof xx9)) {
                ((ArrayList) this.b).add(vx9Var);
            }
        }
    }

    @Override // a.vx9
    public void a(int i) {
        switch (this.f39921a) {
            case 0:
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ((vx9) it.next()).a(i);
                }
                break;
        }
    }

    @Override // a.vx9
    public void b(int i, cy9 cy9Var) {
        switch (this.f39921a) {
            case 0:
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ((vx9) it.next()).b(i, cy9Var);
                }
                return;
            case 1:
            default:
                return;
            case 2:
                ld40 ld40Var = (ld40) this.b;
                synchronized (ld40Var.f19832a) {
                    try {
                        if (ld40Var.e) {
                            return;
                        }
                        ld40Var.i.put(cy9Var.h(), new dy9(cy9Var));
                        ld40Var.g();
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            case 3:
                fnu0 fnu0Var = (fnu0) ((WeakReference) this.b).get();
                if (fnu0Var != null) {
                    Iterator it2 = fnu0Var.f9855a.iterator();
                    while (it2.hasNext()) {
                        xii0 xii0Var = ((fot0) it2.next()).p;
                        Iterator it3 = xii0Var.g.d.iterator();
                        while (it3.hasNext()) {
                            ((vx9) it3.next()).b(i, new r34(cy9Var, xii0Var.g.e, -1L));
                        }
                    }
                    return;
                }
                return;
        }
    }

    @Override // a.vx9
    public void c(int i, yk5 yk5Var) {
        switch (this.f39921a) {
            case 0:
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ((vx9) it.next()).c(i, yk5Var);
                }
                break;
        }
    }

    @Override // a.vx9
    public void d(int i, int i2) {
        switch (this.f39921a) {
            case 0:
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ((vx9) it.next()).d(i, i2);
                }
                break;
            case 1:
                ((lmv) j120.T()).execute(new n23(this, i2, (byte) 5));
                break;
        }
    }

    @Override // a.vx9
    public void e(int i) {
        switch (this.f39921a) {
            case 0:
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ((vx9) it.next()).e(i);
                }
                break;
            case 1:
                ((lmv) j120.T()).execute(new w1(this, (byte) 24));
                break;
        }
    }

    public wx9(fnu0 fnu0Var) {
        this.f39921a = (byte) 3;
        this.b = new WeakReference(fnu0Var);
    }

    public /* synthetic */ wx9(Object obj, byte b) {
        this.f39921a = b;
        this.b = obj;
    }
}
