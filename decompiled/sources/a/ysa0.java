package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final class ysa0 implements kmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f43158a;
    public final /* synthetic */ ata0 b;

    public /* synthetic */ ysa0(ata0 ata0Var, byte b) {
        this.f43158a = b;
        this.b = ata0Var;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00b9  */
    @Override // a.kmq
    public final Object a(Object obj, yje yjeVar) {
        Object value;
        Object value2;
        p7m0 p7m0Var;
        Object value3;
        Object value4;
        Object value5;
        byte b = this.f43158a;
        ata0 ata0Var = this.b;
        switch (b) {
            case 0:
                return b((g4z) obj, yjeVar);
            case 1:
                List list = (List) obj;
                int i = ata0.S;
                p7m0 p7m0Var2 = ata0Var.i.f25029a;
                do {
                    value = p7m0Var2.getValue();
                    value.getClass();
                    ata0Var.f.getClass();
                } while (!p7m0Var2.m(value, nsa0.a((nsa0) value, null, null, null, false, null, false, list, 767)));
                return Unit.f46060a;
            case 2:
                l9s l9sVar = (l9s) obj;
                int i2 = ata0.S;
                p7m0 p7m0Var3 = ata0Var.i.f25029a;
                do {
                    value2 = p7m0Var3.getValue();
                    value2.getClass();
                    ata0Var.f.getClass();
                } while (!p7m0Var3.m(value2, nsa0.a((nsa0) value2, new in00(l9sVar), null, null, false, null, false, null, 1021)));
                return Unit.f46060a;
            case 3:
                List list2 = (List) obj;
                oyg0 oyg0Var = ata0Var.f;
                ocj ocjVar = ata0Var.i;
                ArrayList arrayList = new ArrayList(r3d.q(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    axq.t(((hao) it.next()).v, arrayList);
                }
                int i3 = ata0.S;
                bby bbyVar = ata0Var.Q;
                if (bbyVar == null || !bbyVar.isActive()) {
                    pn00 pn00Var = ((nsa0) ata0Var.D()).e;
                    in00 in00Var = pn00Var instanceof in00 ? (in00) pn00Var : null;
                    List list3 = in00Var != null ? (List) in00Var.f15051a : null;
                    if (list3 != null) {
                        ArrayList arrayList2 = new ArrayList(r3d.q(list3, 10));
                        Iterator it2 = list3.iterator();
                        while (it2.hasNext()) {
                            arrayList2.add(Long.valueOf(((kta0) it2.next()).f18854a));
                        }
                        if (!arrayList2.containsAll(arrayList)) {
                            p7m0Var = ocjVar.f25029a;
                            do {
                                value3 = p7m0Var.getValue();
                                value3.getClass();
                                oyg0Var.getClass();
                            } while (!p7m0Var.m(value3, nsa0.a((nsa0) value3, null, null, new mn00(), false, null, false, null, 1007)));
                            ata0Var.Q = ata0Var.I(ata0Var.q.b, new tsa0(ata0Var, (byte) 0), new gv60(ata0Var, arrayList, null, (byte) 3));
                        }
                    } else {
                        p7m0Var = ocjVar.f25029a;
                        do {
                            value3 = p7m0Var.getValue();
                            value3.getClass();
                            oyg0Var.getClass();
                        } while (!p7m0Var.m(value3, nsa0.a((nsa0) value3, null, null, new mn00(), false, null, false, null, 1007)));
                        ata0Var.Q = ata0Var.I(ata0Var.q.b, new tsa0(ata0Var, (byte) 0), new gv60(ata0Var, arrayList, null, (byte) 3));
                    }
                }
                p7m0 p7m0Var4 = ocjVar.f25029a;
                do {
                    value4 = p7m0Var4.getValue();
                    value4.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var4.m(value4, nsa0.a((nsa0) value4, null, new in00(list2), null, false, null, false, null, 1019)));
                return Unit.f46060a;
            default:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                int i4 = ata0.S;
                p7m0 p7m0Var5 = ata0Var.i.f25029a;
                do {
                    value5 = p7m0Var5.getValue();
                    value5.getClass();
                    ata0Var.f.getClass();
                } while (!p7m0Var5.m(value5, nsa0.a((nsa0) value5, null, null, null, false, null, zBooleanValue, null, 895)));
                return Unit.f46060a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005e, code lost:
    
        if (r7.G(r8, (a.o3w0) r9, r0) == r1) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(a.g4z r8, a.yje r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof a.xsa0
            if (r0 == 0) goto L13
            r0 = r9
            a.xsa0 r0 = (a.xsa0) r0
            int r1 = r0.m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.m = r1
            goto L18
        L13:
            a.xsa0 r0 = new a.xsa0
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.k
            a.wne r1 = a.wne.f39444a
            int r2 = r0.m
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L39
            if (r2 == r4) goto L31
            if (r2 != r3) goto L2b
            a.z1x.P(r9)
            goto L61
        L2b:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r7)
            return r5
        L31:
            a.g4z r8 = r0.j
            a.daf r7 = r0.i
            a.z1x.P(r9)
            goto L52
        L39:
            a.z1x.P(r9)
            a.ata0 r7 = r7.b
            a.daf r9 = r7.s
            a.owp0 r7 = r7.u
            r0.i = r9
            r0.j = r8
            r0.m = r4
            java.lang.Object r7 = r7.e(r0)
            if (r7 != r1) goto L4f
            goto L60
        L4f:
            r6 = r9
            r9 = r7
            r7 = r6
        L52:
            a.o3w0 r9 = (a.o3w0) r9
            r0.i = r5
            r0.j = r5
            r0.m = r3
            java.lang.Object r7 = r7.G(r8, r9, r0)
            if (r7 != r1) goto L61
        L60:
            return r1
        L61:
            kotlin.Unit r7 = kotlin.Unit.f46060a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: a.ysa0.b(a.g4z, a.yje):java.lang.Object");
    }
}
