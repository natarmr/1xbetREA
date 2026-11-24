package a;

import androidx.media3.common.MediaItem;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class s340 extends gld {
    public static final MediaItem s;
    public final e06[] k;
    public final ArrayList l;
    public final bmq0[] m;
    public final ArrayList n;
    public final kwd o;
    public int p;
    public long[][] q;
    public l52 r;

    static {
        mtc mtcVar = new mtc();
        new xuz((byte) 15);
        List list = Collections.EMPTY_LIST;
        v3x v3xVar = b4x.b;
        rcf0 rcf0Var = rcf0.e;
        cn30 cn30Var = new cn30();
        s = new MediaItem("MergingMediaSource", new bn30(mtcVar), null, new dn30(cn30Var), jn30.C, fn30.f9813a);
    }

    public s340(e06... e06VarArr) {
        kwd kwdVar = new kwd();
        this.k = e06VarArr;
        this.o = kwdVar;
        this.n = new ArrayList(Arrays.asList(e06VarArr));
        this.p = -1;
        this.l = new ArrayList(e06VarArr.length);
        for (int i = 0; i < e06VarArr.length; i++) {
            this.l.add(new ArrayList());
        }
        this.m = new bmq0[e06VarArr.length];
        this.q = new long[0][];
        new HashMap();
        e3c.s(8, "expectedKeys");
        e3c.s(2, "expectedValuesPerKey");
        xad xadVarA = xad.a(8);
        lx40 lx40Var = new lx40();
        e3c.s(2, "expectedValuesPerKey");
        new mx40(xadVarA).f = lx40Var;
    }

    @Override // a.e06
    public final mn30 a(vn30 vn30Var, lhf0 lhf0Var, long j) {
        e06[] e06VarArr = this.k;
        int length = e06VarArr.length;
        mn30[] mn30VarArr = new mn30[length];
        bmq0[] bmq0VarArr = this.m;
        int iB = bmq0VarArr[0].b(vn30Var.f37698a);
        for (int i = 0; i < length; i++) {
            vn30 vn30VarA = vn30Var.a(bmq0VarArr[i].l(iB));
            mn30VarArr[i] = e06VarArr[i].a(vn30VarA, lhf0Var, j - this.q[iB][i]);
            ((List) this.l.get(i)).add(new r340(vn30VarA, mn30VarArr[i]));
        }
        return new q340(this.o, this.q[iB], mn30VarArr);
    }

    @Override // a.e06
    public final MediaItem g() {
        e06[] e06VarArr = this.k;
        return e06VarArr.length > 0 ? e06VarArr[0].g() : s;
    }

    @Override // a.gld, a.e06
    public final void i() throws l52 {
        l52 l52Var = this.r;
        if (l52Var != null) {
            throw l52Var;
        }
        super.i();
    }

    @Override // a.e06
    public final void k(rsj rsjVar) {
        this.j = vtt0.n(null);
        int i = 0;
        while (true) {
            e06[] e06VarArr = this.k;
            if (i >= e06VarArr.length) {
                return;
            }
            w(Integer.valueOf(i), e06VarArr[i]);
            i++;
        }
    }

    @Override // a.e06
    public final void m(mn30 mn30Var) {
        q340 q340Var = (q340) mn30Var;
        int i = 0;
        while (true) {
            e06[] e06VarArr = this.k;
            if (i >= e06VarArr.length) {
                return;
            }
            List list = (List) this.l.get(i);
            boolean[] zArr = q340Var.b;
            mn30[] mn30VarArr = q340Var.f28033a;
            mn30 mn30Var2 = zArr[i] ? ((xkq0) mn30VarArr[i]).f41040a : mn30VarArr[i];
            for (int i2 = 0; i2 < list.size(); i2++) {
                if (((r340) list.get(i2)).b.equals(mn30Var2)) {
                    list.remove(i2);
                    break;
                }
            }
            e06VarArr[i].m(q340Var.b[i] ? ((xkq0) mn30VarArr[i]).f41040a : mn30VarArr[i]);
            i++;
        }
    }

    @Override // a.gld, a.e06
    public final void o() {
        super.o();
        Arrays.fill(this.m, (Object) null);
        this.p = -1;
        this.r = null;
        ArrayList arrayList = this.n;
        arrayList.clear();
        Collections.addAll(arrayList, this.k);
    }

    @Override // a.e06
    public final void r(MediaItem mediaItem) {
        this.k[0].r(mediaItem);
    }

    @Override // a.gld
    public final vn30 s(Object obj, vn30 vn30Var) {
        int iIntValue = ((Integer) obj).intValue();
        ArrayList arrayList = this.l;
        List list = (List) arrayList.get(iIntValue);
        for (int i = 0; i < list.size(); i++) {
            if (((r340) list.get(i)).f29769a.equals(vn30Var)) {
                return ((r340) ((List) arrayList.get(0)).get(i)).f29769a;
            }
        }
        return null;
    }

    @Override // a.gld
    public final void v(Object obj, e06 e06Var, bmq0 bmq0Var) {
        int iH;
        Integer num = (Integer) obj;
        if (this.r != null) {
            return;
        }
        if (this.p == -1) {
            iH = bmq0Var.h();
            this.p = iH;
        } else {
            int iH2 = bmq0Var.h();
            int i = this.p;
            if (iH2 != i) {
                this.r = new l52();
                return;
            }
            iH = i;
        }
        int length = this.q.length;
        bmq0[] bmq0VarArr = this.m;
        if (length == 0) {
            this.q = (long[][]) Array.newInstance((Class<?>) Long.TYPE, iH, bmq0VarArr.length);
        }
        ArrayList arrayList = this.n;
        arrayList.remove(e06Var);
        bmq0VarArr[num.intValue()] = bmq0Var;
        if (arrayList.isEmpty()) {
            l(bmq0VarArr[0]);
        }
    }
}
