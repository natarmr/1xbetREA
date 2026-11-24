package a;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class jcl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g45 f16283a;

    public gmq a() {
        return i120.W(new a1t(((i7e) this.f16283a.c).f, (byte) 20));
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0095  */
    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    /* JADX WARN: Multi-variable type inference failed */
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
    public Object b(int i, zje zjeVar, boolean z) {
        dl80 dl80Var;
        int iB;
        int i2;
        int i3;
        int i4;
        int i5;
        byte b;
        int i6 = i;
        boolean z2 = z;
        g45 g45Var = this.f16283a;
        i7e i7eVar = (i7e) g45Var.c;
        if (zjeVar instanceof dl80) {
            dl80Var = (dl80) zjeVar;
            int i7 = dl80Var.q;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                dl80Var.q = i7 - Integer.MIN_VALUE;
            } else {
                dl80Var = new dl80(this, zjeVar);
            }
        } else {
            dl80Var = new dl80(this, zjeVar);
        }
        Object obj = dl80Var.o;
        wne wneVar = wne.f39444a;
        int i8 = dl80Var.q;
        Object obj2 = null;
        if (i8 == 0) {
            z1x.P(obj);
            List list = (List) i7eVar.k.getValue();
            if (list == null) {
                list = iun.f15405a;
            }
            if (z2) {
                ListIterator listIterator = list.listIterator(list.size());
                while (listIterator.hasPrevious()) {
                    Object objPrevious = listIterator.previous();
                    if (((a640) objPrevious).b() != -1) {
                        obj2 = objPrevious;
                        break;
                    }
                }
                a640 a640Var = (a640) obj2;
                if (a640Var != null) {
                    iB = a640Var.b() + 1;
                    i2 = iB;
                } else {
                    i2 = 1;
                }
            } else {
                for (Object obj3 : list) {
                    if (((a640) obj3).b() != -1) {
                        obj2 = obj3;
                        break;
                    }
                }
                a640 a640Var2 = (a640) obj2;
                if (a640Var2 != null) {
                    iB = a640Var2.b();
                    i2 = iB;
                } else {
                    i2 = 1;
                }
            }
            int i9 = z2 ? i2 : 1;
            i3 = z2 ? Integer.MAX_VALUE : i2 - 1;
            int i10 = z2 ? 0 : -(i6 == true ? 1 : 0);
            dl80Var.i = z2;
            dl80Var.j = i6 == true ? (byte) 1 : (byte) 0;
            dl80Var.k = i2;
            dl80Var.l = i9;
            dl80Var.m = i3;
            dl80Var.q = 1;
            Serializable serializableR = g45Var.r(i2, i10, i6 == true ? 1 : 0, dl80Var);
            if (serializableR != wneVar) {
                i4 = i2;
                i5 = i9;
                obj = serializableR;
                b = i6;
            }
        }
        if (i8 != 1) {
            if (i8 != 2) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ArrayList arrayList = dl80Var.n;
            z1x.P(obj);
            return arrayList;
        }
        int i11 = dl80Var.m;
        int i12 = dl80Var.l;
        int i13 = dl80Var.k;
        byte b2 = dl80Var.j;
        boolean z3 = dl80Var.i;
        z1x.P(obj);
        i3 = i11;
        b = b2;
        i4 = i13;
        i5 = i12;
        z2 = z3;
        int i14 = i4;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj4 : (Iterable) obj) {
            int iB2 = ((a640) obj4).b();
            if (i5 <= iB2 && iB2 <= i3) {
                arrayList2.add(obj4);
            }
        }
        gxb gxbVar = (gxb) i7eVar.i.getValue();
        a640 a640Var3 = (a640) CollectionsKt.f0(arrayList2);
        if (a640Var3 != null && a640Var3.b() > gxbVar.j.f38222a) {
            g45Var.j0(gxb.a(gxbVar, false, 0, 0, null, false, null, new vxy(a640Var3.b(), a640Var3.e() instanceof srt0), 511));
        }
        Collection collection = (List) i7eVar.k.getValue();
        if (collection == null) {
            collection = iun.f15405a;
        }
        ArrayList arrayListN0 = CollectionsKt.N0(collection);
        if (z2) {
            arrayListN0.addAll(arrayList2);
        } else {
            arrayListN0.addAll(0, arrayList2);
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj5 : arrayListN0) {
            if (hashSet.add(new Integer(((a640) obj5).b()))) {
                arrayList3.add(obj5);
            }
        }
        dl80Var.n = arrayList2;
        dl80Var.i = z2;
        dl80Var.j = b;
        dl80Var.k = i14;
        dl80Var.l = i5;
        dl80Var.m = i3;
        dl80Var.q = 2;
        return g45Var.l0(arrayList3) == wneVar ? wneVar : arrayList2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object c(zje zjeVar) {
        tox toxVar;
        if (zjeVar instanceof tox) {
            toxVar = (tox) zjeVar;
            int i = toxVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                toxVar.k = i - Integer.MIN_VALUE;
            } else {
                toxVar = new tox(this, zjeVar);
            }
        } else {
            toxVar = new tox(this, zjeVar);
        }
        Object obj = toxVar.i;
        wne wneVar = wne.f39444a;
        int i2 = toxVar.k;
        g45 g45Var = this.f16283a;
        if (i2 == 0) {
            z1x.P(obj);
            toxVar.k = 1;
            Object objI = ((vae) g45Var.b).i(toxVar);
            if (objI != wneVar) {
                objI = Unit.f46060a;
            }
            if (objI == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        g45Var.j0(gxb.a((gxb) ((i7e) g45Var.c).i.getValue(), false, 0, 0, null, false, null, null, 1021));
        return Unit.f46060a;
    }
}
