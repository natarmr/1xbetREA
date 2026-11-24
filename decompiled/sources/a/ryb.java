package a;

import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class ryb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ykh f31305a;

    public ryb(ykh ykhVar) {
        ykhVar.getClass();
        this.f31305a = ykhVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(long j, zje zjeVar, String str) {
        qyb qybVar;
        boolean z;
        List list;
        List list2;
        List list3;
        if (zjeVar instanceof qyb) {
            qybVar = (qyb) zjeVar;
            int i = qybVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                qybVar.k = i - Integer.MIN_VALUE;
            } else {
                qybVar = new qyb(this, zjeVar);
            }
        } else {
            qybVar = new qyb(this, zjeVar);
        }
        Object objA = qybVar.i;
        Object obj = wne.f39444a;
        int i2 = qybVar.k;
        if (i2 == 0) {
            z1x.P(objA);
            qybVar.k = 1;
            objA = this.f31305a.a(j, qybVar, str);
            if (objA == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objA);
        }
        List list4 = (List) objA;
        rkh rkhVar = (rkh) CollectionsKt.firstOrNull(list4);
        boolean z2 = (rkhVar == null || (list3 = rkhVar.r) == null) ? false : !list3.isEmpty();
        rkh rkhVar2 = (rkh) CollectionsKt.firstOrNull(list4);
        if (rkhVar2 == null || (list = rkhVar2.r) == null || list.isEmpty()) {
            z = false;
        } else {
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    xlh xlhVar = (xlh) it.next();
                    if (xlhVar != null) {
                        if (xlhVar instanceof wlh) {
                            List list5 = ((wlh) xlhVar).b;
                            if (list5 == null || !list5.isEmpty()) {
                                Iterator it2 = list5.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        List list6 = ((cjh) it2.next()).b;
                                        if (list6 == null || !list6.isEmpty()) {
                                            Iterator it3 = list6.iterator();
                                            while (true) {
                                                if (it3.hasNext()) {
                                                    List list7 = ((klh) it3.next()).c;
                                                    if (list7 == null || !list7.isEmpty()) {
                                                        Iterator it4 = list7.iterator();
                                                        while (true) {
                                                            if (it4.hasNext()) {
                                                                List list8 = ((ojh) it4.next()).f;
                                                                if (list8 == null || !list8.isEmpty()) {
                                                                    Iterator it5 = list8.iterator();
                                                                    while (true) {
                                                                        if (it5.hasNext()) {
                                                                            zjh zjhVar = (zjh) it5.next();
                                                                            if (zjhVar.d.b.length() > 0 || zjhVar.e.b.length() > 0) {
                                                                                z = true;
                                                                            }
                                                                        } else {
                                                                            continue;
                                                                        }
                                                                    }
                                                                }
                                                            } else {
                                                                continue;
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    continue;
                                                }
                                            }
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                            }
                        } else if ((xlhVar instanceof vlh) && ((list2 = ((vlh) xlhVar).b) == null || !list2.isEmpty())) {
                            Iterator it6 = list2.iterator();
                            while (true) {
                                if (it6.hasNext()) {
                                    List list9 = ((yih) it6.next()).b;
                                    if (list9 == null || !list9.isEmpty()) {
                                        Iterator it7 = list9.iterator();
                                        while (true) {
                                            if (it7.hasNext()) {
                                                List list10 = ((glh) it7.next()).d;
                                                if (list10 == null || !list10.isEmpty()) {
                                                    Iterator it8 = list10.iterator();
                                                    while (true) {
                                                        if (it8.hasNext()) {
                                                            zjh zjhVar2 = (zjh) it8.next();
                                                            if (zjhVar2.d.b.length() > 0 || zjhVar2.e.b.length() > 0) {
                                                                z = true;
                                                            }
                                                        } else {
                                                            continue;
                                                        }
                                                    }
                                                }
                                            } else {
                                                continue;
                                            }
                                        }
                                    }
                                } else {
                                    continue;
                                }
                            }
                        }
                    }
                } else {
                    z = false;
                }
            }
        }
        return Boolean.valueOf(z2 && z);
    }
}
