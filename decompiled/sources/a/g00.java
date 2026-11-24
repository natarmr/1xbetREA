package a;

import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.jvm.functions.Function2;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes5.dex */
public final class g00 extends w46 {
    public final p7m0 A;
    public final Regex B;
    public c4m0 C;
    public boolean D;
    public kbn E;
    public final vzg0 b;
    public final chf0 c;
    public final fvt0 d;
    public final joc e;
    public final vqb f;
    public final pru g;
    public final qgd h;
    public final zn00 i;
    public final jh70 j;
    public final gnu k;
    public final iw20 l;
    public final i1w0 m;
    public final rjo n;
    public final ctf0 o;
    public final mne p;
    public final duj q;
    public final ntu r;
    public final joc s;
    public final m1e t;
    public final cad u;
    public final rpt v;
    public final pmi w;
    public final Pattern x;
    public final ol60 y;
    public final ol60 z;

    public g00(vzg0 vzg0Var, chf0 chf0Var, fvt0 fvt0Var, joc jocVar, vqb vqbVar, pru pruVar, qgd qgdVar, zn00 zn00Var, jh70 jh70Var, gnu gnuVar, iw20 iw20Var, i1w0 i1w0Var, rjo rjoVar, ctf0 ctf0Var, mne mneVar, duj dujVar, ntu ntuVar, joc jocVar2, m1e m1eVar, cad cadVar, rpt rptVar, pmi pmiVar) {
        ctf0Var.getClass();
        m1eVar.getClass();
        this.b = vzg0Var;
        this.c = chf0Var;
        this.d = fvt0Var;
        this.e = jocVar;
        this.f = vqbVar;
        this.g = pruVar;
        this.h = qgdVar;
        this.i = zn00Var;
        this.j = jh70Var;
        this.k = gnuVar;
        this.l = iw20Var;
        this.m = i1w0Var;
        this.n = rjoVar;
        this.o = ctf0Var;
        this.p = mneVar;
        this.q = dujVar;
        this.r = ntuVar;
        this.s = jocVar2;
        this.t = m1eVar;
        this.u = cadVar;
        this.v = rptVar;
        this.w = pmiVar;
        this.x = d390.f5393a;
        this.y = new ol60(1, i99.b);
        this.z = new ol60(3);
        this.A = q7m0.a(iun.f15405a);
        this.B = new Regex("\\D+");
        cm90.Companion.getClass();
        this.E = new kbn(0, "", "", "", am90.a(), true);
    }

    public final int w() {
        Object next;
        Iterable iterable = (Iterable) this.A.getValue();
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (obj instanceof itc) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((itc) next).c != vqp.e);
        itc itcVar = (itc) next;
        if (itcVar != null) {
            return itcVar.f15347a;
        }
        return 0;
    }

    public final int x() {
        Object next;
        Iterable iterable = (Iterable) this.A.getValue();
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (obj instanceof itc) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((itc) next).c != vqp.f);
        itc itcVar = (itc) next;
        if (itcVar != null) {
            return itcVar.f15347a;
        }
        return 0;
    }

    public final void y(Throwable th, Function2 function2) {
        duj dujVar = this.q;
        if (th != null) {
            boolean z = th instanceof SocketTimeoutException;
            ol60 ol60Var = this.z;
            if (z || (th instanceof UnknownHostException)) {
                ol60Var.f(xz.f41730a);
                return;
            }
            if (th instanceof zhi0) {
                if (((zhi0) th).c != i2o.TokenExpiredError) {
                    dujVar.b(th, function2);
                    return;
                }
                String message = th.getMessage();
                if (message == null) {
                    message = "";
                }
                ol60Var.f(new uz(message));
                return;
            }
        }
        dujVar.b(th, function2);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0040  */
    /* JADX WARN: Code duplicated, block: B:16:0x0044  */
    /* JADX WARN: Code duplicated, block: B:18:0x004b  */
    /* JADX WARN: Code duplicated, block: B:19:0x0055 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x0057  */
    /* JADX WARN: Code duplicated, block: B:22:0x005e  */
    /* JADX WARN: Code duplicated, block: B:33:0x0063 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x0063 A[SYNTHETIC] */
    public final void z(rue0 rue0Var, vqp vqpVar) {
        p7m0 p7m0Var;
        Object value;
        ArrayList arrayList;
        vqp vqpVar2;
        itc itcVar;
        itc itcVar2;
        long j = rue0Var.f31124a;
        String str = rue0Var.b;
        do {
            p7m0Var = this.A;
            value = p7m0Var.getValue();
            List<Object> list = (List) value;
            arrayList = new ArrayList(r3d.q(list, 10));
            for (Object objC : list) {
                if (objC instanceof itc) {
                    vqp vqpVar3 = vqp.g;
                    if (vqpVar == vqpVar3) {
                        itc itcVar3 = (itc) objC;
                        if (itcVar3.c == vqpVar3) {
                            objC = itc.c(itcVar3, (int) j, str, 54);
                        } else {
                            vqpVar2 = vqp.f;
                            if (vqpVar == vqpVar2) {
                                itcVar2 = (itc) objC;
                                if (itcVar2.c == vqpVar3) {
                                    objC = itc.c(itcVar2, 0, "", 52);
                                } else if (vqpVar == vqpVar2) {
                                    itcVar = (itc) objC;
                                    if (itcVar.c == vqpVar2) {
                                        objC = itc.c(itcVar, (int) j, str, 54);
                                    }
                                }
                            } else if (vqpVar == vqpVar2) {
                                itcVar = (itc) objC;
                                if (itcVar.c == vqpVar2) {
                                    objC = itc.c(itcVar, (int) j, str, 54);
                                }
                            }
                        }
                    } else {
                        vqpVar2 = vqp.f;
                        if (vqpVar == vqpVar2) {
                            itcVar2 = (itc) objC;
                            if (itcVar2.c == vqpVar3) {
                                objC = itc.c(itcVar2, 0, "", 52);
                            } else if (vqpVar == vqpVar2) {
                                itcVar = (itc) objC;
                                if (itcVar.c == vqpVar2) {
                                    objC = itc.c(itcVar, (int) j, str, 54);
                                }
                            }
                        } else if (vqpVar == vqpVar2) {
                            itcVar = (itc) objC;
                            if (itcVar.c == vqpVar2) {
                                objC = itc.c(itcVar, (int) j, str, 54);
                            }
                        }
                    }
                }
                arrayList.add(objC);
            }
        } while (!p7m0Var.m(value, arrayList));
    }
}
