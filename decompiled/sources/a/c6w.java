package a;

import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class c6w extends bnn0 implements Function2 {
    public final /* synthetic */ s77 A;
    public final /* synthetic */ String B;
    public final /* synthetic */ int Y;
    public final /* synthetic */ boolean Z;
    public final /* synthetic */ List f1;
    public final /* synthetic */ List g1;
    public final /* synthetic */ List h1;
    public i050 i;
    public final /* synthetic */ boolean i1;
    public rrd j;
    public final /* synthetic */ boolean j1;
    public String k;
    public final /* synthetic */ boolean k1;
    public s77 l;
    public String m;
    public List n;
    public List o;
    public List p;
    public long q;
    public int r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public byte w;
    public final /* synthetic */ rrd x;
    public final /* synthetic */ String y;
    public final /* synthetic */ long z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c6w(rrd rrdVar, String str, long j, s77 s77Var, String str2, int i, boolean z, List list, List list2, List list3, boolean z2, boolean z3, boolean z4, yje yjeVar) {
        super(2, yjeVar);
        this.x = rrdVar;
        this.y = str;
        this.z = j;
        this.A = s77Var;
        this.B = str2;
        this.Y = i;
        this.Z = z;
        this.f1 = list;
        this.g1 = list2;
        this.h1 = list3;
        this.i1 = z2;
        this.j1 = z3;
        this.k1 = z4;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new c6w(this.x, this.y, this.z, this.A, this.B, this.Y, this.Z, this.f1, this.g1, this.h1, this.i1, this.j1, this.k1, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c6w) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:107:0x01d6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x0165  */
    /* JADX WARN: Code duplicated, block: B:66:0x01e0 A[Catch: all -> 0x0225, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0225, blocks: (B:59:0x01d0, B:66:0x01e0), top: B:95:0x01d0 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x0210  */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str;
        s77 s77Var;
        String str2;
        i050 i050Var;
        s77 s77Var2;
        long j;
        boolean z;
        boolean z2;
        boolean z3;
        int i;
        boolean z4;
        rrd rrdVar;
        List list;
        List list2;
        List list3;
        boolean z5;
        boolean z6;
        List list4;
        List list5;
        List list6;
        String str3;
        i050 i050Var2;
        boolean z7;
        int i2;
        boolean z8;
        rrd rrdVar2;
        String str4;
        long j2;
        i050 i050Var3;
        Object obj2;
        Object objL;
        i050 i050Var4;
        i050 i050Var5;
        rg7 rg7VarA;
        n3w n3wVarR0;
        Object objK;
        wne wneVar = wne.f39444a;
        byte b = this.w;
        Object obj3 = null;
        if (b == 0) {
            z1x.P(obj);
            rrd rrdVar3 = this.x;
            m0w m0wVar = (m0w) rrdVar3.g;
            m0wVar.getClass();
            str = this.y;
            str.getClass();
            LinkedHashMap linkedHashMap = m0wVar.g;
            Object k050Var = linkedHashMap.get(str);
            if (k050Var == null) {
                if (linkedHashMap.size() > 5) {
                    linkedHashMap.remove(CollectionsKt.T(linkedHashMap.keySet()));
                }
                k050Var = new k050();
                linkedHashMap.put(str, k050Var);
            }
            i050 i050Var6 = (i050) k050Var;
            boolean zA = i050Var6.a();
            boolean z9 = this.k1;
            boolean z10 = this.j1;
            boolean z11 = this.i1;
            List list7 = this.h1;
            List list8 = this.g1;
            List list9 = this.f1;
            boolean z12 = this.Z;
            int i3 = this.Y;
            String str5 = this.B;
            s77Var = this.A;
            long j3 = this.z;
            if (zA) {
                this.i = i050Var6;
                this.j = rrdVar3;
                this.k = str;
                this.l = s77Var;
                this.m = str5;
                this.n = list9;
                this.o = list8;
                this.p = list7;
                this.s = z12;
                this.t = z11;
                this.u = z10;
                this.v = z9;
                this.q = j3;
                this.r = i3;
                this.w = (byte) 3;
                if (i050Var6.d(this) != wneVar) {
                    str2 = str5;
                    i050Var = i050Var6;
                    s77Var2 = s77Var;
                    j = j3;
                    z = z11;
                    z2 = z9;
                    z3 = z10;
                    i = i3;
                    z4 = z12;
                    rrdVar = rrdVar3;
                    list = list7;
                    list2 = list8;
                    list3 = list9;
                    rg7VarA = ((m0w) rrdVar.g).a(str);
                    if (rg7VarA == null) {
                        n3wVarR0 = bkb.r0(rg7VarA, s77Var2, str2, z4, list3, list2, z, list, z3, z2);
                    } else {
                        this.i = i050Var;
                        obj3 = null;
                        this.j = null;
                        this.k = null;
                        this.l = null;
                        this.m = null;
                        this.n = null;
                        this.o = null;
                        this.p = null;
                        this.w = (byte) 4;
                        i050Var4 = i050Var;
                        objK = rrdVar.k(str, j, s77Var2, str2, i, z4, list3, list2, list, z, z3, z2, this);
                        if (objK != wneVar) {
                            i050Var5 = i050Var4;
                            n3wVarR0 = (n3w) objK;
                            i050Var = i050Var5;
                        }
                    }
                    i050Var.c(null);
                    return n3wVarR0;
                }
            } else {
                this.i = i050Var6;
                this.j = rrdVar3;
                this.k = str;
                this.l = s77Var;
                this.m = str5;
                this.n = list9;
                this.o = list8;
                this.p = list7;
                this.q = j3;
                this.r = i3;
                this.s = z12;
                this.t = z11;
                this.u = z10;
                z5 = z9;
                this.v = z5;
                this.w = (byte) 1;
                if (i050Var6.d(this) != wneVar) {
                    z6 = z11;
                    list4 = list9;
                    list5 = list7;
                    list6 = list8;
                    str3 = str;
                    i050Var2 = i050Var6;
                    z7 = z12;
                    i2 = i3;
                    z8 = z10;
                    rrdVar2 = rrdVar3;
                    str4 = str5;
                    j2 = j3;
                    this.i = i050Var2;
                    i050Var3 = i050Var2;
                    this.j = null;
                    this.k = null;
                    this.l = null;
                    this.m = null;
                    this.n = null;
                    this.o = null;
                    this.p = null;
                    this.w = (byte) 2;
                    objL = rrdVar2.l(str3, j2, s77Var, str4, i2, z7, list4, list6, list5, z6, z8, z5, this);
                    if (objL != wneVar) {
                        i050Var2 = i050Var3;
                        n3w n3wVar = (n3w) objL;
                        i050Var2.c(null);
                        return n3wVar;
                    }
                }
            }
            return wneVar;
        }
        if (b == 1) {
            boolean z13 = this.v;
            boolean z14 = this.u;
            boolean z15 = this.t;
            boolean z16 = this.s;
            int i4 = this.r;
            long j4 = this.q;
            List list10 = this.p;
            list6 = this.o;
            List list11 = this.n;
            String str6 = this.m;
            s77 s77Var3 = this.l;
            String str7 = this.k;
            rrd rrdVar4 = this.j;
            i050 i050Var7 = this.i;
            z1x.P(obj);
            list5 = list10;
            list4 = list11;
            str3 = str7;
            z5 = z13;
            i050Var2 = i050Var7;
            rrdVar2 = rrdVar4;
            z8 = z14;
            z6 = z15;
            j2 = j4;
            z7 = z16;
            i2 = i4;
            str4 = str6;
            s77Var = s77Var3;
            try {
                this.i = i050Var2;
                i050Var3 = i050Var2;
                try {
                    this.j = null;
                    this.k = null;
                    this.l = null;
                    this.m = null;
                    this.n = null;
                    this.o = null;
                    this.p = null;
                    try {
                        this.w = (byte) 2;
                        objL = rrdVar2.l(str3, j2, s77Var, str4, i2, z7, list4, list6, list5, z6, z8, z5, this);
                        if (objL != wneVar) {
                            i050Var2 = i050Var3;
                            n3w n3wVar2 = (n3w) objL;
                            i050Var2.c(null);
                            return n3wVar2;
                        }
                        return wneVar;
                    } catch (Throwable th) {
                        th = th;
                        obj2 = null;
                        i050Var2 = i050Var3;
                        i050Var2.c(obj2);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    obj2 = null;
                }
            } catch (Throwable th3) {
                th = th3;
                obj2 = null;
                i050Var2.c(obj2);
                throw th;
            }
        } else {
            if (b == 2) {
                i050Var2 = this.i;
                try {
                    z1x.P(obj);
                    objL = obj;
                    n3w n3wVar3 = (n3w) objL;
                    i050Var2.c(null);
                    return n3wVar3;
                } catch (Throwable th4) {
                    th = th4;
                    obj2 = null;
                    i050Var2.c(obj2);
                    throw th;
                }
            }
            if (b == 3) {
                int i5 = this.r;
                long j5 = this.q;
                boolean z17 = this.v;
                boolean z18 = this.u;
                boolean z19 = this.t;
                boolean z20 = this.s;
                List list12 = this.p;
                List list13 = this.o;
                List list14 = this.n;
                String str8 = this.m;
                s77 s77Var4 = this.l;
                str = this.k;
                rrd rrdVar5 = this.j;
                i050 i050Var8 = this.i;
                z1x.P(obj);
                z2 = z17;
                z3 = z18;
                z = z19;
                z4 = z20;
                str2 = str8;
                s77Var2 = s77Var4;
                i = i5;
                j = j5;
                i050Var = i050Var8;
                list = list12;
                list2 = list13;
                list3 = list14;
                rrdVar = rrdVar5;
                try {
                    try {
                        rg7VarA = ((m0w) rrdVar.g).a(str);
                        if (rg7VarA == null) {
                            this.i = i050Var;
                            obj3 = null;
                            try {
                                this.j = null;
                                this.k = null;
                                this.l = null;
                                this.m = null;
                                this.n = null;
                                this.o = null;
                                this.p = null;
                                this.w = (byte) 4;
                                i050Var4 = i050Var;
                                try {
                                    objK = rrdVar.k(str, j, s77Var2, str2, i, z4, list3, list2, list, z, z3, z2, this);
                                    if (objK != wneVar) {
                                        i050Var5 = i050Var4;
                                        n3wVarR0 = (n3w) objK;
                                        i050Var = i050Var5;
                                    }
                                    return wneVar;
                                } catch (Throwable th5) {
                                    th = th5;
                                    obj3 = null;
                                    i050Var5 = i050Var4;
                                    i050Var5.c(obj3);
                                    throw th;
                                }
                            } catch (Throwable th6) {
                                th = th6;
                                i050Var4 = i050Var;
                                i050Var5 = i050Var4;
                                i050Var5.c(obj3);
                                throw th;
                            }
                        }
                        try {
                            n3wVarR0 = bkb.r0(rg7VarA, s77Var2, str2, z4, list3, list2, z, list, z3, z2);
                        } catch (Throwable th7) {
                            th = th7;
                            i050Var5 = i050Var;
                            obj3 = null;
                            i050Var5.c(obj3);
                            throw th;
                        }
                        i050Var.c(null);
                        return n3wVarR0;
                    } catch (Throwable th8) {
                        th = th8;
                        i050Var4 = i050Var;
                    }
                } catch (Throwable th9) {
                    th = th9;
                    i050Var4 = i050Var;
                }
            } else {
                if (b != 4) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i050Var5 = this.i;
                try {
                    z1x.P(obj);
                    objK = obj;
                    try {
                        n3wVarR0 = (n3w) objK;
                        i050Var = i050Var5;
                        i050Var.c(null);
                        return n3wVarR0;
                    } catch (Throwable th10) {
                        th = th10;
                        obj3 = null;
                        i050Var5.c(obj3);
                        throw th;
                    }
                } catch (Throwable th11) {
                    th = th11;
                }
            }
        }
        i050Var5.c(obj3);
        throw th;
    }
}
