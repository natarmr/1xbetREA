package a;

import android.gov.nist.core.Separators;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class sjl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tgl0 f32309a;
    public final vby b;
    public final mne c;

    public sjl0(tgl0 tgl0Var, vby vbyVar, mne mneVar) {
        tgl0Var.getClass();
        vbyVar.getClass();
        this.f32309a = tgl0Var;
        this.b = vbyVar;
        this.c = mneVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable a(List list, zje zjeVar) {
        ijl0 ijl0Var;
        if (zjeVar instanceof ijl0) {
            ijl0Var = (ijl0) zjeVar;
            int i = ijl0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                ijl0Var.k = i - Integer.MIN_VALUE;
            } else {
                ijl0Var = new ijl0(this, zjeVar);
            }
        } else {
            ijl0Var = new ijl0(this, zjeVar);
        }
        Object objW0 = ijl0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = ijl0Var.k;
        yje yjeVar = null;
        if (i2 == 0) {
            z1x.P(objW0);
            ijl0Var.k = 1;
            m4l0 m4l0Var = this.f32309a.f33918a;
            m4l0Var.getClass();
            StringBuilder sb = new StringBuilder();
            sb.append("select * from sports where id in (");
            tnq0.h(list.size(), sb);
            sb.append(Separators.RPAREN);
            objW0 = sj3.w0(ijl0Var, m4l0Var.f21177a, new iu6(sb.toString(), list, yjeVar, (byte) 2), true, false);
            if (objW0 == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objW0);
        }
        Iterable iterable = (Iterable) objW0;
        ArrayList arrayList = new ArrayList(r3d.q(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(k9x.W((h5l0) it.next(), this.b));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable b(zje zjeVar) {
        jjl0 jjl0Var;
        if (zjeVar instanceof jjl0) {
            jjl0Var = (jjl0) zjeVar;
            int i = jjl0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                jjl0Var.k = i - Integer.MIN_VALUE;
            } else {
                jjl0Var = new jjl0(this, zjeVar);
            }
        } else {
            jjl0Var = new jjl0(this, zjeVar);
        }
        Object objA = jjl0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = jjl0Var.k;
        if (i2 == 0) {
            z1x.P(objA);
            jjl0Var.k = 1;
            objA = this.f32309a.a(40L, jjl0Var);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objA);
        }
        List<f3n0> listF = k9x.F(this.b, ((h5l0) objA).o);
        ArrayList arrayList = new ArrayList(r3d.q(listF, 10));
        for (f3n0 f3n0Var : listF) {
            f3n0Var.getClass();
            arrayList.add(new ypl0(f3n0Var.f8872a, f3n0Var.b, f3n0Var.c));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(long j, zje zjeVar) {
        kjl0 kjl0Var;
        if (zjeVar instanceof kjl0) {
            kjl0Var = (kjl0) zjeVar;
            int i = kjl0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                kjl0Var.k = i - Integer.MIN_VALUE;
            } else {
                kjl0Var = new kjl0(this, zjeVar);
            }
        } else {
            kjl0Var = new kjl0(this, zjeVar);
        }
        Object objA = kjl0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = kjl0Var.k;
        if (i2 == 0) {
            z1x.P(objA);
            kjl0Var.k = 1;
            objA = this.f32309a.a(j, kjl0Var);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objA);
        }
        return k9x.W((h5l0) objA, this.b);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable d(zje zjeVar) {
        mjl0 mjl0Var;
        if (zjeVar instanceof mjl0) {
            mjl0Var = (mjl0) zjeVar;
            int i = mjl0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                mjl0Var.k = i - Integer.MIN_VALUE;
            } else {
                mjl0Var = new mjl0(this, zjeVar);
            }
        } else {
            mjl0Var = new mjl0(this, zjeVar);
        }
        Object objW0 = mjl0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = mjl0Var.k;
        byte b = 10;
        yje yjeVar = null;
        if (i2 == 0) {
            z1x.P(objW0);
            mjl0Var.k = 1;
            objW0 = sj3.w0(mjl0Var, this.f32309a.f33918a.f21177a, new tri0(2, yjeVar, b), true, false);
            if (objW0 == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objW0);
        }
        Iterable iterable = (Iterable) objW0;
        ArrayList arrayList = new ArrayList(r3d.q(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(k9x.W((h5l0) it.next(), this.b));
        }
        return arrayList;
    }

    public final omi0 e() {
        return new omi0(wwb.C(this.f32309a.f33918a.f21177a, new String[]{"sports"}, new tri0(2, null, (byte) 11)), this, (byte) 6);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(long j, long j2, zje zjeVar) {
        pjl0 pjl0Var;
        Object next;
        if (zjeVar instanceof pjl0) {
            pjl0Var = (pjl0) zjeVar;
            int i = pjl0Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                pjl0Var.m = i - Integer.MIN_VALUE;
            } else {
                pjl0Var = new pjl0(this, zjeVar);
            }
        } else {
            pjl0Var = new pjl0(this, zjeVar);
        }
        Object objA = pjl0Var.k;
        wne wneVar = wne.f39444a;
        int i2 = pjl0Var.m;
        if (i2 == 0) {
            z1x.P(objA);
            pjl0Var.i = j;
            pjl0Var.j = j2;
            pjl0Var.m = 1;
            objA = this.f32309a.a(j, pjl0Var);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j2 = pjl0Var.j;
            j = pjl0Var.i;
            z1x.P(objA);
        }
        h5l0 h5l0Var = (h5l0) objA;
        if (j != 40 || j2 == -1) {
            h5l0Var.getClass();
            return new ypl0(h5l0Var.f12486a, h5l0Var.b, k9x.V(h5l0Var));
        }
        Iterator it = k9x.F(this.b, h5l0Var.o).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((f3n0) next).f8872a != j2);
        f3n0 f3n0Var = (f3n0) next;
        ypl0 ypl0Var = f3n0Var != null ? new ypl0(f3n0Var.f8872a, f3n0Var.b, f3n0Var.c) : null;
        if (ypl0Var != null) {
            return ypl0Var;
        }
        jf4.n("Required value was null.");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable g(zje zjeVar) {
        qjl0 qjl0Var;
        if (zjeVar instanceof qjl0) {
            qjl0Var = (qjl0) zjeVar;
            int i = qjl0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                qjl0Var.k = i - Integer.MIN_VALUE;
            } else {
                qjl0Var = new qjl0(this, zjeVar);
            }
        } else {
            qjl0Var = new qjl0(this, zjeVar);
        }
        Object objW0 = qjl0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = qjl0Var.k;
        byte b = 10;
        yje yjeVar = null;
        if (i2 == 0) {
            z1x.P(objW0);
            qjl0Var.k = 1;
            objW0 = sj3.w0(qjl0Var, this.f32309a.f33918a.f21177a, new tri0(2, yjeVar, b), true, false);
            if (objW0 == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objW0);
        }
        Iterable<h5l0> iterable = (Iterable) objW0;
        ArrayList arrayList = new ArrayList(r3d.q(iterable, 10));
        for (h5l0 h5l0Var : iterable) {
            h5l0Var.getClass();
            arrayList.add(new ypl0(h5l0Var.f12486a, h5l0Var.b, k9x.V(h5l0Var)));
        }
        return arrayList;
    }
}
