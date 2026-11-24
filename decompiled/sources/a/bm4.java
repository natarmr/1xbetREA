package a;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;

/* JADX INFO: loaded from: classes3.dex */
public final class bm4 extends bnn0 implements Function1 {
    public final /* synthetic */ byte i;
    public boolean j;
    public Object k;
    public Object l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bm4(Object obj, Object obj2, Object obj3, Serializable serializable, yje yjeVar, byte b) {
        super(1, yjeVar);
        this.i = b;
        this.k = obj;
        this.l = obj2;
        this.m = obj3;
        this.n = serializable;
    }

    @Override // a.zw5
    public final yje create(yje yjeVar) {
        byte b = this.i;
        Object obj = this.n;
        Object obj2 = this.m;
        switch (b) {
            case 0:
                return new bm4((im4) this.k, (uu4) this.l, (String) obj2, (df2) obj, yjeVar, (byte) 0);
            case 1:
                return new bm4((mii0) this.k, (sip) this.l, (CyberGamesPage) obj2, (jo20) obj, yjeVar, (byte) 1);
            case 2:
                return new bm4((g0q) obj2, obj, yjeVar);
            case 3:
                return new bm4((phf0) this.k, (sip) this.l, (CyberGamesPage) obj2, (jo20) obj, yjeVar, (byte) 3);
            case 4:
                return new bm4((mz80) this.l, (String) obj2, (Function2) obj, yjeVar);
            default:
                return new bm4((n660) this.k, (sip) this.l, (CyberGamesPage) obj2, (jo20) obj, yjeVar, (byte) 5);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        yje yjeVar = (yje) obj;
        switch (this.i) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
        }
        return ((bm4) create(yjeVar)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v7, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.util.ArrayList] */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws Exception {
        Throwable th;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2;
        Throwable th2;
        xpg0 xpg0Var;
        ?? arrayList;
        Long l;
        Long l2;
        byte b = this.i;
        Object obj2 = this.n;
        Object obj3 = this.m;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    this.j = true;
                    int i = im4.u;
                    if (((im4) this.k).i((uu4) this.l, (String) obj3, (df2) obj2, "", this) == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 1:
                wne wneVar2 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    this.j = true;
                    obj = ((bbw0) ((mii0) this.k).c).i((sip) this.l, (CyberGamesPage) obj3, (jo20) obj2, this);
                    if (obj == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                web webVar = (web) CollectionsKt.firstOrNull((List) obj);
                List listH0 = webVar != null ? feb.h0(webVar) : null;
                return listH0 == null ? iun.f15405a : listH0;
            case 2:
                g0q g0qVar = (g0q) obj3;
                File file = g0qVar.f24384a;
                wne wneVar3 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    try {
                        FileOutputStream fileOutputStream3 = new FileOutputStream(file);
                        try {
                            mhi0 mhi0Var = g0qVar.b;
                            k7t0 k7t0Var = new k7t0(fileOutputStream3);
                            this.k = fileOutputStream3;
                            this.l = fileOutputStream3;
                            this.j = true;
                            if (mhi0Var.b0(obj2, k7t0Var) == wneVar3) {
                                return wneVar3;
                            }
                            fileOutputStream = fileOutputStream3;
                            fileOutputStream2 = fileOutputStream;
                        } catch (Throwable th3) {
                            th = th3;
                            fileOutputStream = fileOutputStream3;
                            throw th;
                        }
                    } catch (Exception e) {
                        if (e instanceof FileNotFoundException) {
                            throw ntb.e0(file.getParent(), (FileNotFoundException) e);
                        }
                        throw e;
                    }
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fileOutputStream2 = (FileOutputStream) this.l;
                    fileOutputStream = (FileOutputStream) this.k;
                    try {
                        z1x.P(obj);
                    } catch (Throwable th4) {
                        th = th4;
                        try {
                            throw th;
                        } catch (Throwable th5) {
                            bkb.E(fileOutputStream, th);
                            throw th5;
                        }
                    }
                }
                fileOutputStream2.getFD().sync();
                bkb.E(fileOutputStream, null);
                return Unit.f46060a;
            case 3:
                sip sipVar = (sip) this.l;
                wne wneVar4 = wne.f39444a;
                boolean z4 = this.j;
                if (!z4) {
                    z1x.P(obj);
                    this.j = true;
                    obj = ((ocl) ((phf0) this.k).f26994a).c(sipVar, (CyberGamesPage) obj3, (jo20) obj2, this);
                    if (obj == wneVar4) {
                        return wneVar4;
                    }
                } else {
                    if (!z4) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                Iterable<f5h> iterable = (Iterable) obj;
                ArrayList arrayList2 = new ArrayList(r3d.q(iterable, 10));
                for (f5h f5hVar : iterable) {
                    f5hVar.getClass();
                    arrayList2.add(pzb.E(f5hVar, sipVar, 0L, 0L));
                }
                return arrayList2;
            case 4:
                wne wneVar5 = wne.f39444a;
                boolean z5 = this.j;
                if (z5) {
                    if (!z5) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    xpg0Var = (xpg0) this.k;
                    try {
                        z1x.P(obj);
                        ay3.L(xpg0Var, null);
                        return obj;
                    } catch (Throwable th6) {
                        th2 = th6;
                        try {
                            throw th2;
                        } catch (Throwable th7) {
                            ay3.L(xpg0Var, th2);
                            throw th7;
                        }
                    }
                }
                z1x.P(obj);
                xpg0 xpg0VarZ0 = ((mz80) this.l).b.Z0((String) obj3);
                Function2 function2 = (Function2) obj2;
                try {
                    this.k = xpg0VarZ0;
                    this.j = true;
                    Object objInvoke = function2.invoke(xpg0VarZ0, this);
                    if (objInvoke == wneVar5) {
                        return wneVar5;
                    }
                    obj = objInvoke;
                    xpg0Var = xpg0VarZ0;
                    ay3.L(xpg0Var, null);
                    return obj;
                } catch (Throwable th8) {
                    th2 = th8;
                    xpg0Var = xpg0VarZ0;
                    throw th2;
                }
            default:
                sip sipVar2 = (sip) this.l;
                wne wneVar6 = wne.f39444a;
                boolean z6 = this.j;
                if (!z6) {
                    z1x.P(obj);
                    this.j = true;
                    obj = ((pmi0) ((n660) this.k).d).d(sipVar2, (CyberGamesPage) obj3, (jo20) obj2, this);
                    if (obj == wneVar6) {
                        return wneVar6;
                    }
                } else {
                    if (!z6) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                Iterable<l7r0> iterable2 = (Iterable) obj;
                ArrayList arrayList3 = new ArrayList(r3d.q(iterable2, 10));
                for (l7r0 l7r0Var : iterable2) {
                    List<f5h> list = l7r0Var.c;
                    if (list != null) {
                        arrayList = new ArrayList(r3d.q(list, 10));
                        for (f5h f5hVar2 : list) {
                            l26 l26Var = l7r0Var.f19574a;
                            long jLongValue = -1;
                            long jLongValue2 = (l26Var == null || (l2 = l26Var.f19293a) == null) ? -1L : l2.longValue();
                            l26 l26Var2 = l7r0Var.b;
                            if (l26Var2 != null && (l = l26Var2.f19293a) != null) {
                                jLongValue = l.longValue();
                            }
                            f5hVar2.getClass();
                            arrayList.add(pzb.E(f5hVar2, sipVar2, jLongValue2, jLongValue));
                        }
                    } else {
                        arrayList = iun.f15405a;
                    }
                    arrayList3.add(arrayList);
                }
                List list2 = (List) CollectionsKt.firstOrNull(arrayList3);
                return list2 == null ? iun.f15405a : list2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bm4(mz80 mz80Var, String str, Function2 function2, yje yjeVar) {
        super(1, yjeVar);
        this.i = (byte) 4;
        this.l = mz80Var;
        this.m = str;
        this.n = function2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bm4(g0q g0qVar, Object obj, yje yjeVar) {
        super(1, yjeVar);
        this.i = (byte) 2;
        this.m = g0qVar;
        this.n = obj;
    }
}
