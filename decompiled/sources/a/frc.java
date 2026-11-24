package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class frc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g45 f10012a;

    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public Object a(zje zjeVar) {
        nzn0 nzn0Var;
        int iB;
        int i;
        g45 g45Var = this.f10012a;
        i7e i7eVar = (i7e) g45Var.c;
        if (zjeVar instanceof nzn0) {
            nzn0Var = (nzn0) zjeVar;
            int i2 = nzn0Var.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nzn0Var.n = i2 - Integer.MIN_VALUE;
            } else {
                nzn0Var = new nzn0(this, zjeVar);
            }
        } else {
            nzn0Var = new nzn0(this, zjeVar);
        }
        Object objR = nzn0Var.l;
        Object obj = wne.f39444a;
        int i3 = nzn0Var.n;
        if (i3 == 0) {
            z1x.P(objR);
            Iterable iterable = (List) i7eVar.k.getValue();
            if (iterable == null) {
                iterable = iun.f15405a;
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : iterable) {
                if (((a640) obj2).b() != -1) {
                    arrayList.add(obj2);
                }
            }
            Iterator it = arrayList.iterator();
            if (!it.hasNext()) {
                itt0.a();
                return null;
            }
            int iB2 = ((a640) it.next()).b();
            while (it.hasNext()) {
                int iB3 = ((a640) it.next()).b();
                if (iB2 > iB3) {
                    iB2 = iB3;
                }
            }
            Iterator it2 = arrayList.iterator();
            if (!it2.hasNext()) {
                itt0.a();
                return null;
            }
            iB = ((a640) it2.next()).b();
            while (it2.hasNext()) {
                int iB4 = ((a640) it2.next()).b();
                if (iB < iB4) {
                    iB = iB4;
                }
            }
            nzn0Var.j = iB2;
            nzn0Var.k = iB;
            nzn0Var.n = 1;
            objR = g45Var.r(iB2 - 1, 0, (iB - iB2) + 1, nzn0Var);
            if (objR != obj) {
                i = iB2;
            }
        }
        if (i3 != 1) {
            if (i3 != 2) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ArrayList arrayList2 = nzn0Var.i;
            z1x.P(objR);
            return arrayList2;
        }
        iB = nzn0Var.k;
        i = nzn0Var.j;
        z1x.P(objR);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : (Iterable) objR) {
            int iB5 = ((a640) obj3).b();
            if (i <= iB5 && iB5 <= iB) {
                arrayList3.add(obj3);
            }
        }
        gxb gxbVar = (gxb) i7eVar.i.getValue();
        a640 a640Var = (a640) CollectionsKt.f0(arrayList3);
        if (a640Var != null && a640Var.b() > gxbVar.j.f38222a) {
            g45Var.j0(gxb.a(gxbVar, false, 0, 0, null, false, null, new vxy(a640Var.b(), a640Var.e() instanceof srt0), 511));
        }
        ArrayList arrayList4 = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj4 : arrayList3) {
            Integer num = new Integer(((a640) obj4).b());
            Object arrayList5 = linkedHashMap.get(num);
            if (arrayList5 == null) {
                arrayList5 = new ArrayList();
                linkedHashMap.put(num, arrayList5);
            }
            ((List) arrayList5).add(obj4);
        }
        Iterable<a640> iterable2 = (List) i7eVar.k.getValue();
        if (iterable2 == null) {
            iterable2 = iun.f15405a;
        }
        for (a640 a640Var2 : iterable2) {
            int iB6 = a640Var2.b();
            if (i > iB6 || iB6 > iB) {
                arrayList4.add(a640Var2);
            } else {
                List list = (List) linkedHashMap.get(new Integer(a640Var2.b()));
                if (list != null) {
                    arrayList4.addAll(list);
                }
            }
        }
        nzn0Var.i = arrayList3;
        nzn0Var.j = i;
        nzn0Var.k = iB;
        nzn0Var.n = 2;
        return g45Var.l0(arrayList4) == obj ? obj : arrayList3;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x009b, code lost:
    
        if (r8.l0(r4) == r1) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(a.a640 r9, a.zje r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof a.fmv
            if (r0 == 0) goto L13
            r0 = r10
            a.fmv r0 = (a.fmv) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            a.fmv r0 = new a.fmv
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.j
            a.wne r1 = a.wne.f39444a
            int r2 = r0.l
            a.g45 r8 = r8.f10012a
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2e
            a.z1x.P(r10)
            goto L9e
        L2e:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r8)
            return r5
        L34:
            a.a640 r9 = r0.i
            a.z1x.P(r10)
            goto L4e
        L3a:
            a.z1x.P(r10)
            java.lang.Object r10 = r8.c
            a.i7e r10 = (a.i7e) r10
            a.p7m0 r10 = r10.k
            r0.i = r9
            r0.l = r4
            java.lang.Object r10 = a.ntb.M(r10, r0)
            if (r10 != r1) goto L4e
            goto L9d
        L4e:
            java.util.List r10 = (java.util.List) r10
            if (r10 != 0) goto L55
            kotlin.Unit r8 = kotlin.Unit.f46060a
            return r8
        L55:
            java.util.Iterator r2 = r10.iterator()
        L59:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L71
            java.lang.Object r4 = r2.next()
            r6 = r4
            a.a640 r6 = (a.a640) r6
            int r6 = r6.b()
            int r7 = r9.b()
            if (r6 != r7) goto L59
            goto L72
        L71:
            r4 = r5
        L72:
            a.a640 r4 = (a.a640) r4
            int r2 = r10.indexOf(r4)
            java.lang.Integer r4 = new java.lang.Integer
            r4.<init>(r2)
            int r2 = r4.intValue()
            if (r2 < 0) goto L84
            goto L85
        L84:
            r4 = r5
        L85:
            if (r4 == 0) goto La1
            int r2 = r4.intValue()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r10)
            r4.set(r2, r9)
            r0.i = r5
            r0.l = r3
            kotlin.Unit r8 = r8.l0(r4)
            if (r8 != r1) goto L9e
        L9d:
            return r1
        L9e:
            kotlin.Unit r8 = kotlin.Unit.f46060a
            return r8
        La1:
            kotlin.Unit r8 = kotlin.Unit.f46060a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: a.frc.b(a.a640, a.zje):java.lang.Object");
    }
}
