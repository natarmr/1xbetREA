package a;

import android.javax.sip.message.Response;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;

/* JADX INFO: loaded from: classes4.dex */
public final class u230 extends x2t0 {
    public final qmo h;
    public final nmo i;
    public final eyg0 j;
    public final o470 k;
    public final ljf0 l;
    public final dpi0 m;
    public final bn6 n;
    public final je o;

    public u230(qmo qmoVar, nmo nmoVar, eyg0 eyg0Var, o470 o470Var, ljf0 ljf0Var, wxs0 wxs0Var, dpi0 dpi0Var, bn6 bn6Var, je jeVar) {
        super(new n230((byte) 0));
        this.h = qmoVar;
        this.i = nmoVar;
        this.j = eyg0Var;
        this.k = o470Var;
        this.l = ljf0Var;
        this.m = dpi0Var;
        this.n = bn6Var;
        this.o = jeVar;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x005e  */
    /* JADX WARN: Code duplicated, block: B:19:0x007d  */
    /* JADX WARN: Code duplicated, block: B:23:0x009c A[LOOP:1: B:21:0x0096->B:23:0x009c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:27:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:33:0x00df  */
    /* JADX WARN: Code duplicated, block: B:40:0x00fd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:? A[LOOP:0: B:31:0x00d9->B:42:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x00cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x00b1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00d1 -> B:31:0x00d9). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:23:0x009c
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object i(long r19, a.zje r21) {
        /*
            Method dump skipped, instruction units count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.u230.i(long, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c4, code lost:
    
        if (i(r1, r3) == r4) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(a.i230 r21, a.zje r22) {
        /*
            Method dump skipped, instruction units count: 205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.u230.j(a.i230, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object k(k230 k230Var, zje zjeVar) {
        r230 r230Var;
        Object value;
        g7h g7hVar;
        if (zjeVar instanceof r230) {
            r230Var = (r230) zjeVar;
            int i = r230Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                r230Var.l = i - Integer.MIN_VALUE;
            } else {
                r230Var = new r230(this, zjeVar);
            }
        } else {
            r230Var = new r230(this, zjeVar);
        }
        Object obj = r230Var.j;
        wne wneVar = wne.f39444a;
        int i2 = r230Var.l;
        if (i2 == 0) {
            z1x.P(obj);
            long j = k230Var.f17556a;
            r230Var.i = k230Var;
            r230Var.l = 1;
            if (this.l.b(j, r230Var) == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            k230Var = r230Var.i;
            z1x.P(obj);
        }
        ocj ocjVar = this.b;
        ocjVar.getClass();
        p7m0 p7m0Var = ocjVar.f25029a;
        do {
            value = p7m0Var.getValue();
            g7hVar = (g7h) value;
            g7hVar.getClass();
        } while (!p7m0Var.m(value, g7h.a(g7hVar, null, null, null, g7hVar.d.put((Object) Long.valueOf(g7hVar.i), (Object) Long.valueOf(k230Var.f17556a)), null, null, null, null, 0L, Response.SERVICE_UNAVAILABLE)));
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x010b, code lost:
    
        if (n(r2) == r11) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(final a.l230 r21, a.zje r22) {
        /*
            Method dump skipped, instruction units count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.u230.l(a.l230, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:106:0x020a  */
    /* JADX WARN: Code duplicated, block: B:108:0x020e  */
    /* JADX WARN: Code duplicated, block: B:113:0x023d  */
    /* JADX WARN: Code duplicated, block: B:115:0x0241  */
    /* JADX WARN: Code duplicated, block: B:119:0x027b  */
    /* JADX WARN: Code duplicated, block: B:121:0x027f  */
    /* JADX WARN: Code duplicated, block: B:125:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:127:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:128:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:130:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:142:0x01be A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:143:? A[LOOP:3: B:85:0x01a9->B:143:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x006d  */
    /* JADX WARN: Code duplicated, block: B:28:0x0071  */
    /* JADX WARN: Code duplicated, block: B:33:0x0083  */
    /* JADX WARN: Code duplicated, block: B:35:0x0089  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:51:0x0107  */
    /* JADX WARN: Code duplicated, block: B:56:0x0110  */
    /* JADX WARN: Code duplicated, block: B:58:0x0114  */
    /* JADX WARN: Code duplicated, block: B:63:0x0126  */
    /* JADX WARN: Code duplicated, block: B:65:0x012a  */
    /* JADX WARN: Code duplicated, block: B:70:0x013c  */
    /* JADX WARN: Code duplicated, block: B:72:0x0140  */
    /* JADX WARN: Code duplicated, block: B:76:0x016d  */
    /* JADX WARN: Code duplicated, block: B:78:0x0171  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:80:0x0186  */
    /* JADX WARN: Code duplicated, block: B:81:0x018a  */
    /* JADX WARN: Code duplicated, block: B:83:0x019a  */
    /* JADX WARN: Code duplicated, block: B:84:0x019d  */
    /* JADX WARN: Code duplicated, block: B:87:0x01af  */
    /* JADX WARN: Code duplicated, block: B:92:0x01c4  */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0204, code lost:
    
        if (r0 == r4) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0237, code lost:
    
        if (kotlin.Unit.f46060a == r4) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007c, code lost:
    
        if (l((a.l230) r1, r3) == r4) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a5, code lost:
    
        if (r0 == r4) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0109, code lost:
    
        if (r0 == r4) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x011f, code lost:
    
        if (j((a.i230) r1, r3) == r4) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0135, code lost:
    
        if (k((a.k230) r1, r3) == r4) goto L110;
     */
    @Override // a.j3t0
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(a.m230 r23, a.zje r24) {
        /*
            Method dump skipped, instruction units count: 738
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.u230.a(a.m230, a.zje):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Unit n(long j) {
        Unit unit;
        Object[] objArr;
        if (j == -26) {
            return Unit.f46060a;
        }
        th90 th90Var = (th90) ((g7h) d()).e.get(new Long(j));
        if (th90Var == null) {
            return Unit.f46060a;
        }
        List list = ((g7h) d()).c;
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            axq.t(((xum0) it.next()).b, arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            dx7 dx7Var = (dx7) th90Var.get(new Long(((Number) obj).longValue()));
            if (dx7Var instanceof xw7) {
                ArrayList arrayList3 = ((xw7) dx7Var).f41596a;
                if (!arrayList3.isEmpty()) {
                    Iterator it2 = arrayList3.iterator();
                    while (it2.hasNext()) {
                        List<List> list2 = ((xt20) it2.next()).f41445a;
                        if (list2 == null || !list2.isEmpty()) {
                            for (List list3 : list2) {
                                if (list3 == null || !list3.isEmpty()) {
                                    Iterator it3 = list3.iterator();
                                    while (it3.hasNext()) {
                                        if (!((dao) it3.next()).r) {
                                            arrayList2.add(obj);
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        eyg0 eyg0Var = this.j;
        eyg0Var.getClass();
        if (arrayList2.isEmpty()) {
            unit = Unit.f46060a;
        } else {
            hoo hooVar = (hoo) eyg0Var.b;
            rx3 rx3VarS0 = CollectionsKt.S0(arrayList2);
            int iA = wp20.a(r3d.q(rx3VarS0, 10));
            if (iA < 16) {
                iA = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
            Iterator it4 = rx3VarS0.iterator();
            while (true) {
                iil iilVar = (iil) it4;
                boolean z = false;
                objArr = 0;
                if (!iilVar.b.hasNext()) {
                    break;
                }
                IndexedValue indexedValue = (IndexedValue) iilVar.next();
                int i = indexedValue.f46061a;
                Long l = new Long(((Number) indexedValue.b).longValue());
                if (i < 3) {
                    z = true;
                }
                linkedHashMap.put(l, Boolean.valueOf(z));
            }
            vno vnoVar = hooVar.f13403a;
            vnoVar.getClass();
            vnoVar.c(j, new kno(linkedHashMap, objArr == true ? 1 : 0));
            unit = Unit.f46060a;
            wne wneVar = wne.f39444a;
        }
        return unit == wne.f39444a ? unit : unit;
    }
}
