package a;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class p5 implements iys0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ tfk f26379a;

    public p5(tfk tfkVar) {
        this.f26379a = tfkVar;
    }

    @Override // a.iys0
    public final Collection b() {
        Collection collectionB = this.f26379a.r1().S().b();
        collectionB.getClass();
        return collectionB;
    }

    @Override // a.iys0
    public final ary c() {
        return rek.i(this.f26379a).c();
    }

    @Override // a.iys0
    public final List getParameters() {
        List list = this.f26379a.q;
        if (list != null) {
            return list;
        }
        Intrinsics.h("typeConstructorParameters");
        throw null;
    }

    @Override // a.iys0
    public final foc n() {
        return this.f26379a;
    }

    @Override // a.iys0
    public final boolean p() {
        return true;
    }

    public final String toString() {
        return "[typealias " + this.f26379a.getName().b() + ']';
    }
}
