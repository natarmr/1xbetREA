package a;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final class iqp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final aqp0 f15220a;
    public final ani0 b;
    public final knf0 c;

    public iqp0(aqp0 aqp0Var, ani0 ani0Var, knf0 knf0Var) {
        aqp0Var.getClass();
        knf0Var.getClass();
        this.f15220a = aqp0Var;
        this.b = ani0Var;
        this.c = knf0Var;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00aa A[Catch: all -> 0x0036, TryCatch #1 {all -> 0x0036, blocks: (B:14:0x0031, B:35:0x009e, B:37:0x00aa, B:38:0x00b9, B:40:0x00bf, B:43:0x00d1, B:45:0x00d5, B:47:0x00db, B:50:0x00e0, B:54:0x00e6, B:55:0x00ed, B:56:0x00f6, B:58:0x00fc, B:60:0x010b, B:62:0x010f, B:64:0x0117, B:67:0x0120, B:66:0x011d), top: B:75:0x0031 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00bf A[Catch: all -> 0x0036, TryCatch #1 {all -> 0x0036, blocks: (B:14:0x0031, B:35:0x009e, B:37:0x00aa, B:38:0x00b9, B:40:0x00bf, B:43:0x00d1, B:45:0x00d5, B:47:0x00db, B:50:0x00e0, B:54:0x00e6, B:55:0x00ed, B:56:0x00f6, B:58:0x00fc, B:60:0x010b, B:62:0x010f, B:64:0x0117, B:67:0x0120, B:66:0x011d), top: B:75:0x0031 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:45:0x00d5 A[Catch: all -> 0x0036, TryCatch #1 {all -> 0x0036, blocks: (B:14:0x0031, B:35:0x009e, B:37:0x00aa, B:38:0x00b9, B:40:0x00bf, B:43:0x00d1, B:45:0x00d5, B:47:0x00db, B:50:0x00e0, B:54:0x00e6, B:55:0x00ed, B:56:0x00f6, B:58:0x00fc, B:60:0x010b, B:62:0x010f, B:64:0x0117, B:67:0x0120, B:66:0x011d), top: B:75:0x0031 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00da  */
    /* JADX WARN: Code duplicated, block: B:49:0x00df  */
    /* JADX WARN: Code duplicated, block: B:52:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:53:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:58:0x00fc A[Catch: all -> 0x0036, TryCatch #1 {all -> 0x0036, blocks: (B:14:0x0031, B:35:0x009e, B:37:0x00aa, B:38:0x00b9, B:40:0x00bf, B:43:0x00d1, B:45:0x00d5, B:47:0x00db, B:50:0x00e0, B:54:0x00e6, B:55:0x00ed, B:56:0x00f6, B:58:0x00fc, B:60:0x010b, B:62:0x010f, B:64:0x0117, B:67:0x0120, B:66:0x011d), top: B:75:0x0031 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x011d A[Catch: all -> 0x0036, TryCatch #1 {all -> 0x0036, blocks: (B:14:0x0031, B:35:0x009e, B:37:0x00aa, B:38:0x00b9, B:40:0x00bf, B:43:0x00d1, B:45:0x00d5, B:47:0x00db, B:50:0x00e0, B:54:0x00e6, B:55:0x00ed, B:56:0x00f6, B:58:0x00fc, B:60:0x010b, B:62:0x010f, B:64:0x0117, B:67:0x0120, B:66:0x011d), top: B:75:0x0031 }] */
    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v11, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v16, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object] */
    public final Object a(int i, zje zjeVar) throws Throwable {
        gqp0 gqp0Var;
        i050 i050Var;
        Throwable th;
        i050 i050Var2;
        int i2;
        ?? r2;
        List<eip0> list;
        ?? arrayList;
        ArrayList arrayList2;
        rfp0 rfp0Var;
        String str;
        String str2;
        Integer num;
        int iIntValue;
        String str3;
        String str4;
        knf0 knf0Var = this.c;
        if (zjeVar instanceof gqp0) {
            gqp0Var = (gqp0) zjeVar;
            int i3 = gqp0Var.m;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                gqp0Var.m = i3 - Integer.MIN_VALUE;
            } else {
                gqp0Var = new gqp0(this, zjeVar);
            }
        } else {
            gqp0Var = new gqp0(this, zjeVar);
        }
        gqp0 gqp0Var2 = gqp0Var;
        Object obj = gqp0Var2.k;
        wne wneVar = wne.f39444a;
        int i4 = gqp0Var2.m;
        aqp0 aqp0Var = this.f15220a;
        try {
            if (i4 == 0) {
                z1x.P(obj);
                i050Var = aqp0Var.c;
                gqp0Var2.j = i050Var;
                gqp0Var2.i = i;
                gqp0Var2.m = 1;
                if (i050Var.d(gqp0Var2) != wneVar) {
                }
                return wneVar;
            }
            if (i4 != 1) {
                if (i4 != 2) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i2 = gqp0Var2.i;
                i050Var2 = gqp0Var2.j;
                try {
                    z1x.P(obj);
                    list = ((lqp0) ((dx5) obj).a()).f20497a;
                    if (list != null) {
                        arrayList2 = new ArrayList(r3d.q(list, 10));
                        for (eip0 eip0Var : list) {
                            str = "";
                            eip0Var.getClass();
                            str2 = eip0Var.f7871a;
                            if (str2 == null) {
                                str2 = "";
                            }
                            num = eip0Var.c;
                            if (num != null) {
                                iIntValue = num.intValue();
                            } else {
                                iIntValue = 0;
                            }
                            str3 = eip0Var.b;
                            if (str3 == null) {
                                str3 = "";
                            }
                            str4 = eip0Var.d;
                            if (str4 == null) {
                                str = str4;
                            }
                            arrayList2.add(new rfp0(str2, iIntValue, str3, str));
                        }
                        arrayList = new ArrayList();
                        for (Object obj2 : arrayList2) {
                            rfp0Var = (rfp0) obj2;
                            if (rfp0Var.f30400a.length() <= 0 && rfp0Var.b != 0 && rfp0Var.c.length() > 0) {
                                arrayList.add(obj2);
                            }
                        }
                    } else {
                        arrayList = iun.f15405a;
                    }
                    ?? r3 = arrayList;
                    aqp0Var.getClass();
                    r3.getClass();
                    aqp0Var.d.put(Integer.valueOf(i2), r3);
                    i050Var = i050Var2;
                    r2 = r3;
                    i050Var.c(null);
                    return r2;
                } catch (Throwable th2) {
                    th = th2;
                    i050Var2.c(null);
                    throw th;
                }
            }
            i = gqp0Var2.i;
            i050 i050Var3 = gqp0Var2.j;
            z1x.P(obj);
            i050Var = i050Var3;
            List list2 = (List) aqp0Var.d.get(Integer.valueOf(i));
            if (list2 != null) {
                boolean zIsEmpty = list2.isEmpty();
                r2 = list2;
                if (zIsEmpty) {
                }
                i050Var.c(null);
                return r2;
            }
            ani0 ani0Var = this.b;
            String strC = knf0Var.c();
            int iB = knf0Var.b();
            gqp0Var2.j = i050Var;
            gqp0Var2.i = i;
            gqp0Var2.m = 2;
            int i5 = i;
            Object objA = ((dop0) ((enj0) ani0Var.f1155a).invoke()).a(i5, strC, 1, iB, "application/vnd.xenvelop+json", gqp0Var2);
            if (objA != wneVar) {
                i050Var2 = i050Var;
                obj = objA;
                i2 = i5;
                list = ((lqp0) ((dx5) obj).a()).f20497a;
                if (list != null) {
                    arrayList2 = new ArrayList(r3d.q(list, 10));
                    while (r13.hasNext()) {
                        str = "";
                        eip0Var.getClass();
                        str2 = eip0Var.f7871a;
                        if (str2 == null) {
                            str2 = "";
                        }
                        num = eip0Var.c;
                        if (num != null) {
                            iIntValue = num.intValue();
                        } else {
                            iIntValue = 0;
                        }
                        str3 = eip0Var.b;
                        if (str3 == null) {
                            str3 = "";
                        }
                        str4 = eip0Var.d;
                        if (str4 == null) {
                            str = str4;
                        }
                        arrayList2.add(new rfp0(str2, iIntValue, str3, str));
                    }
                    arrayList = new ArrayList();
                    while (r0.hasNext()) {
                        rfp0Var = (rfp0) obj2;
                        if (rfp0Var.f30400a.length() <= 0) {
                        }
                    }
                } else {
                    arrayList = iun.f15405a;
                }
                ?? r4 = arrayList;
                aqp0Var.getClass();
                r4.getClass();
                aqp0Var.d.put(Integer.valueOf(i2), r4);
                i050Var = i050Var2;
                r2 = r4;
                i050Var.c(null);
                return r2;
            }
            return wneVar;
        } catch (Throwable th3) {
            th = th3;
            i050Var2 = i050Var;
            i050Var2.c(null);
            throw th;
        }
    }

    public final Unit b(int i, List list) {
        aqp0 aqp0Var = this.f15220a;
        p7m0 p7m0Var = aqp0Var.e;
        LinkedHashMap linkedHashMapP = xp20.p((Map) p7m0Var.getValue());
        linkedHashMapP.put(new Integer(i), list);
        vby vbyVar = aqp0Var.b;
        vbyVar.getClass();
        okx okxVar = okx.f25427a;
        aqp0Var.f1308a.g("PREF_KEY_MY_TEAMS", vbyVar.d(new inv(okxVar, new zw3(okxVar, (byte) 0), (byte) 1), linkedHashMapP));
        p7m0Var.o(null, linkedHashMapP);
        Unit unit = Unit.f46060a;
        wne wneVar = wne.f39444a;
        return unit;
    }
}
