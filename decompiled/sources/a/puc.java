package a;

import androidx.media3.common.MediaItem;
import androidx.media3.common.Timeline$Window;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class puc extends hrv0 {
    public final ArrayList l;
    public final Timeline$Window m;
    public final an30 n;
    public nuc o;
    public ouc p;
    public long q;
    public long r;

    public puc(cgx0 cgx0Var) {
        super((e06) cgx0Var.c);
        this.n = new an30((mtc) cgx0Var.d);
        this.l = new ArrayList();
        this.m = new Timeline$Window();
    }

    public final void A(bmq0 bmq0Var) {
        long j;
        long j2;
        Timeline$Window timeline$Window = this.m;
        bmq0Var.n(0, timeline$Window);
        long j3 = timeline$Window.o;
        ArrayList arrayList = this.l;
        boolean zIsEmpty = arrayList.isEmpty();
        an30 an30Var = this.n;
        if (zIsEmpty || this.o == null) {
            an30Var.getClass();
            long j4 = an30Var.f1132a;
            this.q = j3;
            this.r = j4 != Long.MIN_VALUE ? j3 + j4 : Long.MIN_VALUE;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                muc mucVar = (muc) arrayList.get(i);
                long j5 = this.q;
                long j6 = this.r;
                mucVar.h = j5;
                mucVar.i = j6;
            }
            j = 0;
            j2 = j4;
        } else {
            an30Var.getClass();
            long j7 = this.q - j3;
            long j8 = this.r;
            j2 = j8 != Long.MIN_VALUE ? j8 - j3 : Long.MIN_VALUE;
            j = j7;
        }
        try {
            an30Var.getClass();
            nuc nucVar = new nuc(bmq0Var, j, j2);
            this.o = nucVar;
            l(nucVar);
        } catch (ouc e) {
            this.p = e;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                ((muc) arrayList.get(i2)).j = this.p;
            }
        }
    }

    @Override // a.e06
    public final mn30 a(vn30 vn30Var, lhf0 lhf0Var, long j) {
        mn30 mn30VarA = this.k.a(vn30Var, lhf0Var, j);
        this.n.getClass();
        muc mucVar = new muc(mn30VarA, true, this.q, this.r, 0);
        this.l.add(mucVar);
        return mucVar;
    }

    @Override // a.gld, a.e06
    public final void i() throws ouc {
        ouc oucVar = this.p;
        if (oucVar != null) {
            throw oucVar;
        }
        super.i();
    }

    @Override // a.e06
    public final void m(mn30 mn30Var) {
        ArrayList arrayList = this.l;
        x0x.K(arrayList.remove(mn30Var));
        this.k.m(((muc) mn30Var).f22408a);
        if (arrayList.isEmpty()) {
            this.n.getClass();
            nuc nucVar = this.o;
            nucVar.getClass();
            A(nucVar.b);
        }
    }

    @Override // a.gld, a.e06
    public final void o() {
        super.o();
        this.p = null;
        this.o = null;
    }

    @Override // a.e06
    public final void r(MediaItem mediaItem) {
        this.k.r(mediaItem);
    }

    @Override // a.hrv0
    public final void y(bmq0 bmq0Var) {
        if (this.p != null) {
            return;
        }
        A(bmq0Var);
    }
}
