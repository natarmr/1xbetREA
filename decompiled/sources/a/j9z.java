package a;

import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes2.dex */
public final class j9z implements g93 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f7u f16163a;
    public final m8y b;
    public final boolean c;
    public final xg d;

    public j9z(f7u f7uVar, m8y m8yVar, boolean z) {
        f7uVar.getClass();
        m8yVar.getClass();
        this.f16163a = f7uVar;
        this.b = m8yVar;
        this.c = z;
        this.d = ((eu00) ((v7i) f7uVar.b).i).d(new w0((Object) this, (byte) 28));
    }

    @Override // a.g93
    public final t83 O0(swq swqVar) {
        t83 t83Var;
        swqVar.getClass();
        m8y m8yVar = this.b;
        cqe0 cqe0VarA = m8yVar.a(swqVar);
        if (cqe0VarA != null && (t83Var = (t83) this.d.invoke(cqe0VarA)) != null) {
            return t83Var;
        }
        g950 g950Var = l8y.f19626a;
        return l8y.a(swqVar, m8yVar, this.f16163a);
    }

    @Override // a.g93
    public final boolean isEmpty() {
        return this.b.getAnnotations().isEmpty();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        m8y m8yVar = this.b;
        qls0 qls0VarP = pgi0.p(CollectionsKt.I(m8yVar.getAnnotations()), this.d);
        g950 g950Var = l8y.f19626a;
        Sequence sequenceT = tx3.t(new Sequence[]{qls0VarP, new sx3(l8y.a(i4m0.m, m8yVar, this.f16163a), (byte) 5)});
        sequenceT.getClass();
        return new b5q(new c5q(lgi0.c(sequenceT, new eoh0((byte) 22)), false, new eoh0((byte) 25)));
    }

    @Override // a.g93
    public final /* bridge */ boolean z0(swq swqVar) {
        return jar0.U(this, swqVar);
    }
}
