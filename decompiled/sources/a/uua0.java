package a;

import java.lang.annotation.Annotation;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class uua0 extends l4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sgy f36290a;
    public final List b;
    public final a8z c;

    public uua0(sgy sgyVar) {
        sgyVar.getClass();
        this.f36290a = sgyVar;
        this.b = iun.f15405a;
        this.c = maz.a(wez.f39042a, new ssa0(this, (byte) 2));
    }

    @Override // a.l4
    public final sgy c() {
        return this.f36290a;
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return (ugi0) this.c.getValue();
    }

    public final String toString() {
        return "kotlinx.serialization.PolymorphicSerializer(baseClass: " + this.f36290a + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public uua0(sgy sgyVar, Annotation[] annotationArr) {
        this(sgyVar);
        sgyVar.getClass();
        List listAsList = Arrays.asList(annotationArr);
        listAsList.getClass();
        this.b = listAsList;
    }
}
