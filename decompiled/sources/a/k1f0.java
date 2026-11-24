package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class k1f0 extends vw5 {
    public final emt0 d;
    public final jru e;
    public final pru f;
    public final xte0 g;
    public final mne h;
    public final kh3 i;
    public final tc80 j;
    public final p7m0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1f0(o8f o8fVar, emt0 emt0Var, jru jruVar, pru pruVar, xte0 xte0Var, mne mneVar, duj dujVar) {
        super(o8fVar, mneVar, dujVar);
        o8fVar.getClass();
        this.d = emt0Var;
        this.e = jruVar;
        this.f = pruVar;
        this.g = xte0Var;
        this.h = mneVar;
        this.i = kh3.OTHER;
        this.j = tc80.REGISTRATION_FIELDS;
        this.k = q7m0.a(i8d.f14333a);
    }

    @Override // a.vw5
    public final void a(sje sjeVar) {
        sjeVar.getClass();
        this.k.o(null, i8d.b);
        sac.V(sjeVar, new xwe0(this, sjeVar, (byte) 7), null, this.h.c, new z8b0(this, null, (byte) 8), 10);
    }

    @Override // a.vw5
    public final kh3 b() {
        return this.i;
    }

    @Override // a.vw5
    public final p7m0 c() {
        return this.k;
    }

    @Override // a.vw5
    public final List d() {
        return null;
    }

    @Override // a.vw5
    public final fnf0 e() {
        return this.j;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
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
    public final Object h(zje zjeVar) {
        j1f0 j1f0Var;
        k1f0 k1f0Var;
        List list;
        if (zjeVar instanceof j1f0) {
            j1f0Var = (j1f0) zjeVar;
            int i = j1f0Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                j1f0Var.m = i - Integer.MIN_VALUE;
            } else {
                j1f0Var = new j1f0(this, zjeVar);
            }
        } else {
            j1f0Var = new j1f0(this, zjeVar);
        }
        Object objD = j1f0Var.k;
        Object obj = wne.f39444a;
        int i2 = j1f0Var.m;
        try {
            if (i2 == 0) {
                z1x.P(objD);
                e0g0 e0g0Var = j0g0.b;
                sff0 sff0VarA = this.f.a();
                List list2 = sff0VarA.N.r;
                boolean z = sff0VarA.k.h;
                jru jruVar = this.e;
                c0o c0oVar = q7f0.j;
                ArrayList arrayList = new ArrayList(r3d.q(c0oVar, 10));
                y2 y2Var = new y2(c0oVar, (byte) 0);
                while (y2Var.hasNext()) {
                    arrayList.add(new Integer(((q7f0) y2Var.next()).f28247a));
                }
                j1f0Var.i = this;
                j1f0Var.j = list2;
                j1f0Var.m = 1;
                objD = jruVar.d(j1f0Var, arrayList, z);
                if (objD == obj) {
                    return obj;
                }
                k1f0Var = this;
                list = list2;
            } else {
                if (i2 != 1) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                list = j1f0Var.j;
                k1f0Var = j1f0Var.i;
                z1x.P(objD);
            }
            Iterable iterable = (Iterable) objD;
            ArrayList arrayList2 = new ArrayList(r3d.q(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList2.add(new Integer(((q7f0) it.next()).f28247a));
            }
            if (CollectionsKt.Z(arrayList2, CollectionsKt.P0(list)).isEmpty()) {
                k1f0Var.g.c(arrayList2, list);
            }
            e0g0 e0g0Var2 = j0g0.b;
        } catch (Throwable unused) {
            e0g0 e0g0Var3 = j0g0.b;
        }
        return Unit.f46060a;
    }
}
