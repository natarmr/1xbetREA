package a;

import androidx.camera.camera2.compat.quirk.TorchIsClosedAfterImageCapturingQuirk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class i9a implements f8a {
    public static final boolean f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o5d0 f14378a;
    public final tpt0 b;
    public final dgr0 c;
    public final n0o0 d;
    public final n0o0 e;

    static {
        f = mhk.a().b(TorchIsClosedAfterImageCapturingQuirk.class) != null;
    }

    public i9a(l1a l1aVar, o5d0 o5d0Var, tpt0 tpt0Var, dgr0 dgr0Var) {
        l1aVar.getClass();
        o5d0Var.getClass();
        tpt0Var.getClass();
        dgr0Var.getClass();
        this.f14378a = o5d0Var;
        this.b = tpt0Var;
        this.c = dgr0Var;
        byte b = 1;
        this.d = maz.b(new g8a(l1aVar, b));
        this.e = maz.b(new h8a(this, b));
    }

    @Override // a.f8a
    public final r8a a(int i, int i2) {
        g9a g9aVar = (g9a) this.e.getValue();
        g9aVar.getClass();
        return new r8a(g9aVar, i, i2);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    @Override // a.f8a
    public final Object b(List list, int i, drd drdVar, int i2, int i3, int i4, zje zjeVar) {
        h9a h9aVar;
        int i5;
        boolean z;
        boolean z2;
        if (zjeVar instanceof h9a) {
            h9aVar = (h9a) zjeVar;
            int i6 = h9aVar.l;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                h9aVar.l = i6 - Integer.MIN_VALUE;
            } else {
                h9aVar = new h9a(this, zjeVar);
            }
        } else {
            h9aVar = new h9a(this, zjeVar);
        }
        h9a h9aVar2 = h9aVar;
        Object obj = h9aVar2.j;
        wne wneVar = wne.f39444a;
        int i7 = h9aVar2.l;
        byte b = 3;
        yje yjeVar = null;
        if (i7 == 0) {
            z1x.P(obj);
            if (list != null && ((ArrayList) list).isEmpty()) {
                z = false;
                break;
            }
            Iterator it = ((ArrayList) list).iterator();
            while (true) {
                if (it.hasNext()) {
                    t7a t7aVar = (t7a) it.next();
                    boolean zBooleanValue = ((Boolean) this.d.getValue()).booleanValue();
                    t7aVar.getClass();
                    int i8 = t7aVar.c;
                    if (i != 3 || zBooleanValue) {
                        i5 = (i8 == -1 || i8 == 5) ? 2 : -1;
                    } else {
                        i5 = 4;
                    }
                    if (i5 != -1) {
                        i8 = i5;
                    }
                    if (i8 == 2) {
                        Integer num = (Integer) this.c.e.d();
                        if (num != null && num.intValue() == 1) {
                            z = true;
                            break;
                        }
                    }
                }
                z = false;
                break;
            }
            g9a g9aVar = (g9a) this.e.getValue();
            h9aVar2.i = z;
            h9aVar2.l = 1;
            Object objB = g9aVar.b(list, i, drdVar, i2, i3, i4, h9aVar2);
            if (objB == wneVar) {
                return wneVar;
            }
            boolean z3 = z;
            obj = objB;
            z2 = z3;
        } else {
            if (i7 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z2 = h9aVar2.i;
            z1x.P(obj);
        }
        List list2 = (List) obj;
        if (z2) {
            qjj.W(this.b.f, null, null, new fr9(list2, this, yjeVar, b), 3);
        }
        return list2;
    }

    @Override // a.f8a
    public final void c(int i) {
        ((g9a) this.e.getValue()).l = i;
    }
}
