package a;

import android.os.Handler;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class jo30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4a0 f16839a;
    public final rsj b;
    public final dmo f;
    public final fsj i;
    public final q9o0 j;
    public boolean l;
    public itj0 k = new itj0();
    public final IdentityHashMap d = new IdentityHashMap();
    public final HashMap e = new HashMap();
    public final ArrayList c = new ArrayList();
    public final HashMap g = new HashMap();
    public final HashSet h = new HashSet();

    public jo30(dmo dmoVar, fsj fsjVar, q9o0 q9o0Var, a4a0 a4a0Var, rsj rsjVar) {
        this.f16839a = a4a0Var;
        this.b = rsjVar;
        this.f = dmoVar;
        this.i = fsjVar;
        this.j = q9o0Var;
    }

    public final bmq0 a(int i, ArrayList arrayList, itj0 itj0Var) {
        if (!arrayList.isEmpty()) {
            this.k = itj0Var;
            for (int i2 = i; i2 < arrayList.size() + i; i2++) {
                io30 io30Var = (io30) arrayList.get(i2 - i);
                ArrayList arrayList2 = this.c;
                if (i2 > 0) {
                    io30 io30Var2 = (io30) arrayList2.get(i2 - 1);
                    io30Var.d = io30Var2.f15100a.o.b.o() + io30Var2.d;
                    io30Var.e = false;
                    io30Var.c.clear();
                } else {
                    io30Var.d = 0;
                    io30Var.e = false;
                    io30Var.c.clear();
                }
                int iO = io30Var.f15100a.o.b.o();
                for (int i3 = i2; i3 < arrayList2.size(); i3++) {
                    ((io30) arrayList2.get(i3)).d += iO;
                }
                arrayList2.add(i2, io30Var);
                this.e.put(io30Var.b, io30Var);
                if (this.l) {
                    e(io30Var);
                    if (this.d.isEmpty()) {
                        this.h.add(io30Var);
                    } else {
                        ho30 ho30Var = (ho30) this.g.get(io30Var);
                        if (ho30Var != null) {
                            ho30Var.f13375a.b(ho30Var.b);
                        }
                    }
                }
            }
        }
        return b();
    }

    public final bmq0 b() {
        ArrayList arrayList = this.c;
        if (arrayList.isEmpty()) {
            return bmq0.f2849a;
        }
        int iO = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            io30 io30Var = (io30) arrayList.get(i);
            io30Var.d = iO;
            iO += io30Var.f15100a.o.b.o();
        }
        return new wna0(arrayList, this.k);
    }

    public final void c() {
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            io30 io30Var = (io30) it.next();
            if (io30Var.c.isEmpty()) {
                ho30 ho30Var = (ho30) this.g.get(io30Var);
                if (ho30Var != null) {
                    ho30Var.f13375a.b(ho30Var.b);
                }
                it.remove();
            }
        }
    }

    public final void d(io30 io30Var) {
        if (io30Var.e && io30Var.c.isEmpty()) {
            ho30 ho30Var = (ho30) this.g.remove(io30Var);
            ho30Var.getClass();
            go30 go30Var = ho30Var.c;
            e06 e06Var = ho30Var.f13375a;
            e06Var.n(ho30Var.b);
            e06Var.q(go30Var);
            e06Var.p(go30Var);
            this.h.remove(io30Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [a.do30, a.wn30] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void e(io30 io30Var) {
        i930 i930Var = io30Var.f15100a;
        ?? r1 = new wn30() { // from class: a.do30
            @Override // a.wn30
            public final void a(e06 e06Var, bmq0 bmq0Var) {
                q9o0 q9o0Var = this.f6398a.f.g;
                q9o0Var.g(2);
                q9o0Var.h(22);
            }
        };
        go30 go30Var = new go30(this, io30Var);
        this.g.put(io30Var, new ho30(i930Var, r1, go30Var));
        Handler handler = new Handler(vtt0.u(), null);
        CopyOnWriteArrayList copyOnWriteArrayList = i930Var.c.c;
        ao30 ao30Var = new ao30();
        ao30Var.f1182a = handler;
        ao30Var.b = go30Var;
        copyOnWriteArrayList.add(ao30Var);
        new Handler(vtt0.u(), null);
        CopyOnWriteArrayList copyOnWriteArrayList2 = i930Var.d.c;
        yhl yhlVar = new yhl();
        yhlVar.f42642a = go30Var;
        copyOnWriteArrayList2.add(yhlVar);
        i930Var.j(r1, this.f16839a, this.b);
    }

    public final void f(int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            ArrayList arrayList = this.c;
            io30 io30Var = (io30) arrayList.remove(i3);
            this.e.remove(io30Var.b);
            int i4 = -io30Var.f15100a.o.b.o();
            for (int i5 = i3; i5 < arrayList.size(); i5++) {
                ((io30) arrayList.get(i5)).d += i4;
            }
            io30Var.e = true;
            if (this.l) {
                d(io30Var);
            }
        }
    }
}
