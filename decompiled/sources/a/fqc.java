package a;

import com.huawei.hms.android.HwBuildEx;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class fqc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g45 f9968a;
    public final oif0 b;
    public final chf0 c;

    public /* synthetic */ fqc(g45 g45Var, oif0 oif0Var, chf0 chf0Var) {
        this.f9968a = g45Var;
        this.b = oif0Var;
        this.c = chf0Var;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0080  */
    /* JADX WARN: Code duplicated, block: B:30:0x0085  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0087, code lost:
    
        if (r8 == r3) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(a.zje r9) {
        /*
            r8 = this;
            a.g45 r0 = r8.f9968a
            java.lang.Object r1 = r0.c
            a.ave r1 = (a.ave) r1
            boolean r2 = r9 instanceof a.eqc
            if (r2 == 0) goto L19
            r2 = r9
            a.eqc r2 = (a.eqc) r2
            int r3 = r2.k
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L19
            int r3 = r3 - r4
            r2.k = r3
            goto L1e
        L19:
            a.eqc r2 = new a.eqc
            r2.<init>(r8, r9)
        L1e:
            java.lang.Object r9 = r2.i
            a.wne r3 = a.wne.f39444a
            int r4 = r2.k
            r5 = 3
            r6 = 2
            r7 = 1
            if (r4 == 0) goto L42
            if (r4 == r7) goto L3e
            if (r4 == r6) goto L3a
            if (r4 != r5) goto L33
            a.z1x.P(r9)
            goto L8a
        L33:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r8)
            r8 = 0
            return r8
        L3a:
            a.z1x.P(r9)
            goto L60
        L3e:
            a.z1x.P(r9)
            goto L55
        L42:
            a.z1x.P(r9)
            a.q4f r9 = a.q4f.b
            r0.g0(r9)
            r2.k = r7
            a.oif0 r9 = r8.b
            java.lang.Object r9 = r9.e(r2)
            if (r9 != r3) goto L55
            goto L89
        L55:
            r2.k = r6
            a.chf0 r8 = r8.c
            java.lang.Object r8 = r8.s(r2)
            if (r8 != r3) goto L60
            goto L89
        L60:
            java.util.ArrayList r8 = r1.n
            r8.clear()
            java.lang.Object r8 = r0.f
            a.q7d0 r8 = (a.q7d0) r8
            java.lang.String r9 = "COUPON_KEY_PREFERENCE"
            r8.h(r9)
            java.lang.String r9 = "COUPON_TYPE_KEY_PREFERENCE"
            r8.h(r9)
            r2.k = r5
            a.qoj0 r8 = r1.q
            java.lang.Boolean r9 = java.lang.Boolean.TRUE
            java.lang.Object r8 = r8.a(r9, r2)
            if (r8 != r3) goto L80
            goto L82
        L80:
            kotlin.Unit r8 = kotlin.Unit.f46060a
        L82:
            if (r8 != r3) goto L85
            goto L87
        L85:
            kotlin.Unit r8 = kotlin.Unit.f46060a
        L87:
            if (r8 != r3) goto L8a
        L89:
            return r3
        L8a:
            kotlin.Unit r8 = kotlin.Unit.f46060a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: a.fqc.a(a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public Object b(q4f q4fVar, zje zjeVar) {
        z4v z4vVar;
        int i;
        int iA;
        lye lyeVar = (lye) this.f9968a.f10647a;
        if (zjeVar instanceof z4v) {
            z4vVar = (z4v) zjeVar;
            int i2 = z4vVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                z4vVar.m = i2 - Integer.MIN_VALUE;
            } else {
                z4vVar = new z4v(this, zjeVar);
            }
        } else {
            z4vVar = new z4v(this, zjeVar);
        }
        Object objP = z4vVar.k;
        Object obj = wne.f39444a;
        int i3 = z4vVar.m;
        int i4 = 2;
        Object obj2 = null;
        if (i3 == 0) {
            z1x.P(objP);
            List listN = this.b.n();
            en7 en7Var = (en7) lyeVar.n.getValue();
            int i5 = en7Var.c;
            Integer num = lyeVar.g;
            if (num != null) {
                iA = num.intValue();
            } else {
                int iOrdinal = q4fVar.ordinal();
                if (iOrdinal == 3) {
                    z4vVar.i = q4fVar;
                    z4vVar.j = i5;
                    z4vVar.m = 1;
                    objP = this.c.p(z4vVar);
                    if (objP == obj) {
                        return obj;
                    }
                    i = i5;
                } else if (iOrdinal == 5) {
                    int iA2 = q4fVar.a();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : listN) {
                        if (!((hf6) obj3).c.isEmpty()) {
                            arrayList.add(obj3);
                        }
                    }
                    for (Object obj4 : arrayList) {
                        if (((hf6) obj4).e) {
                            obj2 = obj4;
                            break;
                        }
                    }
                    int size = ((hf6) obj2) != null ? arrayList.size() - 1 : arrayList.size();
                    if (i5 > 0 && i5 < size) {
                        i4 = i5;
                    }
                    iA = vqd.a(i4, 100, iA2 * HwBuildEx.VersionCodes.CUR_DEVELOPMENT, size);
                } else if (iOrdinal != 11) {
                    iA = q4fVar.a();
                    en7 en7VarA = en7.a(en7Var, false, 27);
                    lyeVar.g = null;
                    lyeVar.n.o(null, en7VarA);
                } else {
                    iA = q4f.c.a();
                }
            }
            return new Integer(iA);
        }
        if (i3 != 1) {
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        i = z4vVar.j;
        q4fVar = z4vVar.i;
        z1x.P(objP);
        List list = (List) objP;
        int size2 = list.size();
        if (i > 0 && i < size2) {
            i4 = i;
        }
        iA = vqd.a(i4, 100, q4fVar.a() * HwBuildEx.VersionCodes.CUR_DEVELOPMENT, list.size());
        return new Integer(iA);
    }
}
