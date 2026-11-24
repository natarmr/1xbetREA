package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class dqy {
    public static final /* synthetic */ iiy[] q = {new ez40(dqy.class, "_hasSetter", "get_hasSetter()Z", 0), new ez40(dqy.class, "_hasGetter", "get_hasGetter()Z", 0)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f6535a;
    public final String b;
    public final eqy c;
    public final eqy d;
    public final ArrayList e;
    public fqy f;
    public final ArrayList g;
    public final ArrayList h;
    public jqy i;
    public fqy j;
    public final ArrayList k;
    public final LinkedHashMap l;
    public final ArrayList m;
    public final ArrayList n;
    public final ArrayList o;
    public final ArrayList p;

    public dqy(int i, int i2, int i3, String str) {
        int i4;
        str.getClass();
        this.f6535a = i;
        this.b = str;
        kjq kjqVar = njq.D;
        kjqVar.getClass();
        ijq ijqVar = new ijq(kjqVar, 1);
        fjq fjqVar = fjq.b;
        int i5 = ijqVar.b;
        if (i5 != 1 || (i4 = ijqVar.c) != 1) {
            c99.s(rw2.l("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", ijqVar, " was passed"));
            throw null;
        }
        kjq kjqVar2 = njq.C;
        kjqVar2.getClass();
        ijq ijqVar2 = new ijq(kjqVar2, 1);
        if (ijqVar2.b != 1 || ijqVar2.c != 1) {
            c99.s(rw2.l("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", ijqVar2, " was passed"));
            throw null;
        }
        int i6 = 1 << ijqVar2.f14887a;
        eqy eqyVar = new eqy(i2);
        iiy[] iiyVarArr = q;
        iiyVarArr[1].getClass();
        fjqVar.k(this, Integer.valueOf(i6 | this.f6535a));
        this.c = eqyVar;
        iiyVarArr[0].getClass();
        this.d = ((((Number) fjqVar.get(this)).intValue() >>> ijqVar.f14887a) & ((1 << i5) - 1)) == i4 ? new eqy(i3) : null;
        this.e = new ArrayList(0);
        this.g = new ArrayList(0);
        new ArrayList(0);
        this.h = new ArrayList();
        this.k = new ArrayList(0);
        this.l = new LinkedHashMap(0);
        this.m = new ArrayList(0);
        this.n = new ArrayList(0);
        this.o = new ArrayList(0);
        kd40.f18088a.getClass();
        List listA = jd40.a();
        ArrayList arrayList = new ArrayList(r3d.q(listA, 10));
        Iterator it = listA.iterator();
        while (it.hasNext()) {
            ((ffy) ((kd40) it.next())).getClass();
            arrayList.add(new nfy());
        }
        this.p = arrayList;
    }
}
