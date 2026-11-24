package a;

import java.util.Iterator;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class h3c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sjl0 f12377a;

    public h3c(sjl0 sjl0Var, byte b) {
        switch (b) {
            case 1:
                sjl0Var.getClass();
                this.f12377a = sjl0Var;
                break;
            case 2:
                sjl0Var.getClass();
                this.f12377a = sjl0Var;
                break;
            case 3:
                this.f12377a = sjl0Var;
                break;
            default:
                sjl0Var.getClass();
                this.f12377a = sjl0Var;
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object a(long j, long j2, zje zjeVar) {
        hwu hwuVar;
        Object next;
        String str;
        if (zjeVar instanceof hwu) {
            hwuVar = (hwu) zjeVar;
            int i = hwuVar.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                hwuVar.m = i - Integer.MIN_VALUE;
            } else {
                hwuVar = new hwu(this, zjeVar);
            }
        } else {
            hwuVar = new hwu(this, zjeVar);
        }
        Object objD = hwuVar.k;
        Object obj = wne.f39444a;
        int i2 = hwuVar.m;
        Object obj2 = null;
        if (i2 == 0) {
            z1x.P(objD);
            hwuVar.i = j;
            hwuVar.j = j2;
            hwuVar.m = 1;
            objD = this.f12377a.d(hwuVar);
            if (objD == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j2 = hwuVar.j;
            j = hwuVar.i;
            z1x.P(objD);
        }
        Iterator it = ((Iterable) objD).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((ril0) next).f30549a != j);
        ril0 ril0Var = (ril0) next;
        if (ril0Var != null) {
            for (Object obj3 : ril0Var.f) {
                if (((f3n0) obj3).f8872a == j2) {
                    obj2 = obj3;
                    break;
                }
            }
            f3n0 f3n0Var = (f3n0) obj2;
            if (f3n0Var == null || (str = f3n0Var.b) == null) {
                str = ril0Var.b;
            }
            obj2 = str;
        }
        return obj2 == null ? "" : obj2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object b(long j, yje yjeVar) {
        g3c g3cVar;
        Object g0g0Var;
        if (yjeVar instanceof g3c) {
            g3cVar = (g3c) yjeVar;
            int i = g3cVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                g3cVar.k = i - Integer.MIN_VALUE;
            } else {
                g3cVar = new g3c(this, yjeVar);
            }
        } else {
            g3cVar = new g3c(this, yjeVar);
        }
        Object objC = g3cVar.i;
        wne wneVar = wne.f39444a;
        int i2 = g3cVar.k;
        boolean z = true;
        try {
            if (i2 == 0) {
                z1x.P(objC);
                if (j != 40) {
                    e0g0 e0g0Var = j0g0.b;
                    sjl0 sjl0Var = this.f12377a;
                    g3cVar.k = 1;
                    objC = sjl0Var.c(j, g3cVar);
                    if (objC == wneVar) {
                        return wneVar;
                    }
                }
                return Boolean.valueOf(z);
            }
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objC);
            g0g0Var = (ril0) objC;
            e0g0 e0g0Var2 = j0g0.b;
        } catch (Throwable th) {
            e0g0 e0g0Var3 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        ril0 ril0Var = (ril0) (g0g0Var instanceof g0g0 ? null : g0g0Var);
        if (!(ril0Var != null ? ril0Var.e : false)) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object c(o4g o4gVar, zje zjeVar) {
        qqt qqtVar;
        if (zjeVar instanceof qqt) {
            qqtVar = (qqt) zjeVar;
            int i = qqtVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                qqtVar.l = i - Integer.MIN_VALUE;
            } else {
                qqtVar = new qqt(this, zjeVar);
            }
        } else {
            qqtVar = new qqt(this, zjeVar);
        }
        Object objC = qqtVar.j;
        wne wneVar = wne.f39444a;
        int i2 = qqtVar.l;
        if (i2 == 0) {
            z1x.P(objC);
            qqtVar.i = o4gVar;
            qqtVar.l = 1;
            objC = this.f12377a.c(40L, qqtVar);
            if (objC == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o4gVar = qqtVar.i;
            z1x.P(objC);
        }
        return CollectionsKt.A0(((ril0) objC).f, new mto(o4gVar, (byte) 2));
    }
}
