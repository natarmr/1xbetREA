package a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ydu extends bnn0 implements Function2 {
    public final /* synthetic */ byte i = 2;
    public boolean j;
    public int k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ int m;
    public Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ydu(a6u a6uVar, yeu yeuVar, int i, int i2, yje yjeVar) {
        super(2, yjeVar);
        this.n = a6uVar;
        this.l = yeuVar;
        this.k = i;
        this.m = i2;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        int i = this.m;
        Object obj2 = this.l;
        switch (b) {
            case 0:
                return new ydu((khf0) this.n, this.k, this.m, (jvn) obj2, yjeVar);
            case 1:
                return new ydu((lbu) this.n, this.k, (jvn) obj2, this.m, yjeVar);
            case 2:
                return new ydu((a6u) this.n, (yeu) obj2, this.k, this.m, yjeVar);
            case 3:
                ydu yduVar = new ydu((xcz) obj2, this.k, i, yjeVar);
                yduVar.n = obj;
                return yduVar;
            default:
                return new ydu((ggm0) obj2, i, yjeVar);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((ydu) create(Long.valueOf(((Number) obj).longValue()), (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((ydu) create(Long.valueOf(((Number) obj).longValue()), (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((ydu) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((ydu) create((qah0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((ydu) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        boolean zD;
        int i;
        Object objA;
        Collection collection;
        wwl0 wwl0Var;
        byte b = this.i;
        int i2 = this.m;
        Object obj2 = this.l;
        byte b2 = 1;
        switch (b) {
            case 0:
                khf0 khf0Var = (khf0) this.n;
                gst0 gst0Var = (gst0) khf0Var.c;
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (z) {
                    if (z) {
                        z1x.P(obj);
                        return obj;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                boolean zA = gst0Var.a();
                long j = zA ? gst0Var.f11847a.a().f18785a : 0L;
                zD = zA ? gst0Var.d(false) : false;
                long jF = ynq0.f(((viu) khf0Var.d).a());
                p6t p6tVar = (p6t) khf0Var.b;
                this.j = true;
                Object objD0 = qjj.d0(p6tVar.d.b, new o6t(p6tVar, this.k, (jvn) obj2, j, zD, this.m, jF, null), this);
                return objD0 == wneVar ? wneVar : objD0;
            case 1:
                lbu lbuVar = (lbu) this.n;
                gst0 gst0Var2 = (gst0) lbuVar.c;
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (z2) {
                    if (z2) {
                        z1x.P(obj);
                        return obj;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                boolean zA2 = gst0Var2.a();
                long j2 = zA2 ? gst0Var2.f11847a.a().f18785a : 0L;
                zD = zA2 ? gst0Var2.d(true) : false;
                u6t u6tVar = (u6t) lbuVar.b;
                this.j = true;
                Object objD1 = qjj.d0(u6tVar.d.b, new t6t(u6tVar, this.k, (jvn) obj2, j2, zD, this.m, null), this);
                return objD1 == wneVar2 ? wneVar2 : objD1;
            case 2:
                wne wneVar3 = wne.f39444a;
                boolean z3 = this.j;
                if (z3) {
                    if (z3) {
                        z1x.P(obj);
                        return obj;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                int i3 = this.k;
                this.j = true;
                Object objM = ((a6u) this.n).M((yeu) obj2, i3, i2, this);
                return objM == wneVar3 ? wneVar3 : objM;
            case 3:
                wne wneVar4 = wne.f39444a;
                boolean z4 = this.j;
                if (!z4) {
                    z1x.P(obj);
                    xcz xczVar = (xcz) obj2;
                    u8z u8zVar = new u8z((qah0) this.n, xczVar, b2);
                    int i4 = this.k;
                    w6k w6kVar = ((mcz) ((hgk0) xczVar.f).getValue()).i;
                    this.j = true;
                    if (kcx.x(u8zVar, i4, this.m, 100, w6kVar, this) == wneVar4) {
                        return wneVar4;
                    }
                } else {
                    if (!z4) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            default:
                ggm0 ggm0Var = (ggm0) obj2;
                wne wneVar5 = wne.f39444a;
                boolean z5 = this.j;
                if (!z5) {
                    z1x.P(obj);
                    Collection collection2 = (List) ggm0Var.d.f14742a.get(Integer.valueOf(i2));
                    if (collection2 == null) {
                        collection2 = iun.f15405a;
                    }
                    if (!collection2.isEmpty()) {
                        return collection2;
                    }
                    fuj0 fuj0Var = ggm0Var.b;
                    knf0 knf0Var = ggm0Var.c;
                    String strC = knf0Var.c();
                    int iB = knf0Var.b();
                    this.n = ggm0Var;
                    i = this.m;
                    this.k = i;
                    this.j = true;
                    objA = ((hgm0) ((jfm0) fuj0Var.b).invoke()).a(i, strC, 1, iB, "application/vnd.xenvelop+json", this);
                    if (objA == wneVar5) {
                        return wneVar5;
                    }
                } else {
                    if (!z5) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i5 = this.k;
                    ggm0Var = (ggm0) this.n;
                    z1x.P(obj);
                    i = i5;
                    objA = obj;
                }
                List<lxl0> list = ((cyl0) ((dx5) objA).a()).b;
                if (list == null) {
                    collection = iun.f15405a;
                } else {
                    ArrayList arrayList = new ArrayList();
                    for (lxl0 lxl0Var : list) {
                        if (lxl0Var != null) {
                            Long l = lxl0Var.f20820a;
                            if (l == null) {
                                jf4.k(null);
                                return null;
                            }
                            long jLongValue = l.longValue();
                            String str = lxl0Var.b;
                            String str2 = str == null ? "" : str;
                            String str3 = lxl0Var.c;
                            String str4 = str3 == null ? "" : str3;
                            String str5 = lxl0Var.d;
                            String str6 = str5 == null ? "" : str5;
                            String str7 = lxl0Var.e;
                            wwl0Var = new wwl0(str2, str4, str6, str7 == null ? "" : str7, jLongValue);
                        } else {
                            wwl0Var = null;
                        }
                        if (wwl0Var != null) {
                            arrayList.add(wwl0Var);
                        }
                    }
                    collection = arrayList;
                }
                ConcurrentHashMap concurrentHashMap = ggm0Var.d.f14742a;
                collection.getClass();
                if (collection.isEmpty() || Intrinsics.d(concurrentHashMap.get(Integer.valueOf(i)), collection)) {
                    return collection;
                }
                concurrentHashMap.remove(Integer.valueOf(i));
                concurrentHashMap.put(Integer.valueOf(i), collection);
                return collection;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ydu(lbu lbuVar, int i, jvn jvnVar, int i2, yje yjeVar) {
        super(2, yjeVar);
        this.n = lbuVar;
        this.k = i;
        this.l = jvnVar;
        this.m = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ydu(xcz xczVar, int i, int i2, yje yjeVar) {
        super(2, yjeVar);
        this.l = xczVar;
        this.k = i;
        this.m = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ydu(khf0 khf0Var, int i, int i2, jvn jvnVar, yje yjeVar) {
        super(2, yjeVar);
        this.n = khf0Var;
        this.k = i;
        this.m = i2;
        this.l = jvnVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ydu(ggm0 ggm0Var, int i, yje yjeVar) {
        super(2, yjeVar);
        this.l = ggm0Var;
        this.m = i;
    }
}
