package a;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class cdu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f4180a;
    public final pbt b;
    public final gst0 c;

    public cdu(pbt pbtVar, gst0 gst0Var, byte b) {
        this.f4180a = b;
        switch (b) {
            case 1:
                pbtVar.getClass();
                gst0Var.getClass();
                this.b = pbtVar;
                this.c = gst0Var;
                break;
            case 2:
                pbtVar.getClass();
                gst0Var.getClass();
                this.b = pbtVar;
                this.c = gst0Var;
                break;
            case 3:
                this.b = pbtVar;
                this.c = gst0Var;
                break;
            default:
                pbtVar.getClass();
                gst0Var.getClass();
                this.b = pbtVar;
                this.c = gst0Var;
                break;
        }
    }

    public static /* synthetic */ Serializable c(cdu cduVar, int i, String str, yje yjeVar, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return cduVar.a(false, i, str, true, yjeVar);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public Serializable a(boolean z, int i, String str, boolean z2, yje yjeVar) {
        keu keuVar;
        if (yjeVar instanceof keu) {
            keuVar = (keu) yjeVar;
            int i2 = keuVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                keuVar.m = i2 - Integer.MIN_VALUE;
            } else {
                keuVar = new keu(this, yjeVar);
            }
        } else {
            keuVar = new keu(this, yjeVar);
        }
        keu keuVar2 = keuVar;
        Object objO = keuVar2.k;
        wne wneVar = wne.f39444a;
        int i3 = keuVar2.m;
        if (i3 == 0) {
            z1x.P(objO);
            boolean zA = this.c.a();
            keuVar2.i = z;
            keuVar2.j = i;
            keuVar2.m = 1;
            objO = this.b.o(false, str, zA, z2, keuVar2);
            if (objO == wneVar) {
                return wneVar;
            }
        } else {
            if (i3 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = keuVar2.j;
            z = keuVar2.i;
            z1x.P(objO);
        }
        List list = ((p070) objO).f26136a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (i == 0 ? true : rz4.C(i, ((pbv) obj).b)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            pbv pbvVar = (pbv) obj2;
            if (!z || pbvVar.g) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : arrayList2) {
            if (x1x.G(((pbv) obj3).e)) {
                arrayList3.add(obj3);
            }
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList4 = new ArrayList();
        for (Object obj4 : arrayList3) {
            if (hashSet.add(new Long(((pbv) obj4).f26728a))) {
                arrayList4.add(obj4);
            }
        }
        return arrayList4;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006f  */
    /* JADX WARN: Code duplicated, block: B:28:0x007c  */
    /* JADX WARN: Code duplicated, block: B:35:0x0095  */
    /* JADX WARN: Code duplicated, block: B:52:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:9:0x0020  */
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
    public Object b(zje zjeVar) throws Throwable {
        umv umvVar;
        dfb0 dfb0Var;
        rq60 rq60Var;
        byte b = this.f4180a;
        gst0 gst0Var = this.c;
        pbt pbtVar = this.b;
        Object obj = null;
        switch (b) {
            case 2:
                if (zjeVar instanceof umv) {
                    umvVar = (umv) zjeVar;
                    int i = umvVar.k;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        umvVar.k = i - Integer.MIN_VALUE;
                    } else {
                        umvVar = new umv(this, zjeVar);
                    }
                } else {
                    umvVar = new umv(this, zjeVar);
                }
                Object objK = umvVar.i;
                wne wneVar = wne.f39444a;
                int i2 = umvVar.k;
                if (i2 == 0) {
                    z1x.P(objK);
                    boolean zA = gst0Var.a();
                    umvVar.k = 1;
                    objK = pbtVar.k(zA, umvVar);
                    if (objK == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (i2 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(objK);
                }
                for (Object obj2 : (Iterable) objK) {
                    evz evzVar = d270.b;
                    int i3 = ((rq60) obj2).f30917a;
                    evzVar.getClass();
                    if (evz.c(i3) == d270.CASHBACK) {
                        obj = obj2;
                        return Boolean.valueOf(obj != null);
                    }
                }
                return Boolean.valueOf(obj != null);
            default:
                if (zjeVar instanceof dfb0) {
                    dfb0Var = (dfb0) zjeVar;
                    int i4 = dfb0Var.k;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        dfb0Var.k = i4 - Integer.MIN_VALUE;
                    } else {
                        dfb0Var = new dfb0(this, zjeVar);
                    }
                } else {
                    dfb0Var = new dfb0(this, zjeVar);
                }
                Object objK2 = dfb0Var.i;
                wne wneVar2 = wne.f39444a;
                int i5 = dfb0Var.k;
                if (i5 == 0) {
                    z1x.P(objK2);
                    boolean zA2 = gst0Var.a();
                    dfb0Var.k = 1;
                    objK2 = pbtVar.k(zA2, dfb0Var);
                    if (objK2 == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (i5 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(objK2);
                }
                for (Object obj3 : (Iterable) objK2) {
                    evz evzVar2 = d270.b;
                    int i6 = ((rq60) obj3).f30917a;
                    evzVar2.getClass();
                    if (evz.c(i6) == d270.LUCKY_WHEEL) {
                        obj = obj3;
                        rq60Var = (rq60) obj;
                        if (rq60Var != null) {
                            return new bfb0(rq60Var.b, rq60Var.c, rq60Var.d);
                        }
                        throw new Throwable("No LuckyWheel from popular OneXGames");
                    }
                }
                rq60Var = (rq60) obj;
                if (rq60Var != null) {
                    return new bfb0(rq60Var.b, rq60Var.c, rq60Var.d);
                }
                throw new Throwable("No LuckyWheel from popular OneXGames");
        }
    }
}
