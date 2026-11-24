package a;

import java.util.Arrays;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class hde0 extends w46 {
    public final i1w0 b;
    public final xqc c;
    public final f5a d;
    public final woc e;
    public final xqt f;
    public final duj g;
    public final p7m0 h;
    public final ol60 i;
    public final p7m0 j;

    public hde0(i1w0 i1w0Var, xqc xqcVar, f5a f5aVar, f5a f5aVar2, woc wocVar, xqt xqtVar, ctf0 ctf0Var, duj dujVar) {
        i1w0Var.getClass();
        ctf0Var.getClass();
        this.b = i1w0Var;
        this.c = xqcVar;
        this.d = f5aVar2;
        this.e = wocVar;
        this.f = xqtVar;
        this.g = dujVar;
        this.h = q7m0.a(String.format(ctf0Var.f(R.string.reality_lock_description_v2, new Object[0]), Arrays.copyOf(new Object[]{Integer.valueOf(((dzz) f5aVar.f8952a.b).e)}, 1)));
        this.i = new ol60(1, i99.b);
        this.j = q7m0.a(Boolean.FALSE);
    }

    public final void w(boolean z) {
        if (z) {
            ((dzz) this.d.f8952a.b).h = true;
        } else {
            this.f.b();
        }
        i1w0 i1w0Var = this.b;
        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
        ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0.f26173a), i1w0Var, copyOnWriteArrayListQ, 0);
        while (true) {
            paw pawVar = (paw) listIteratorP;
            if (!pawVar.hasNext()) {
                return;
            } else {
                i1w0Var.a((oe50) pawVar.next());
            }
        }
    }

    public final Object x(zbe0 zbe0Var, bnn0 bnn0Var) {
        int i;
        pzu pzuVar = this.c.f41310a;
        uen uenVar = wen.b;
        long jL = wen.l(ibc.w0(((dzz) pzuVar.b).d, bfn.MILLISECONDS), bfn.SECONDS);
        abu abuVar = (abu) pzuVar.f27863a;
        String strA = ((btt0) pzuVar.e).a();
        int iOrdinal = zbe0Var.ordinal();
        if (iOrdinal != 0) {
            i = 1;
            if (iOrdinal != 1) {
                i = 2;
                if (iOrdinal != 2) {
                    i = 3;
                    if (iOrdinal != 3) {
                        i = 4;
                        if (iOrdinal != 4) {
                            t9f.b();
                            return null;
                        }
                    }
                }
            }
        } else {
            i = 0;
        }
        Object objB = ((kuz) ((rcz) abuVar.c).invoke()).b(strA, new fce0(jL, i), bnn0Var);
        wne wneVar = wne.f39444a;
        if (objB != wneVar) {
            objB = Unit.f46060a;
        }
        if (objB != wneVar) {
            objB = Unit.f46060a;
        }
        if (objB != wneVar) {
            objB = Unit.f46060a;
        }
        return objB == wneVar ? objB : Unit.f46060a;
    }
}
