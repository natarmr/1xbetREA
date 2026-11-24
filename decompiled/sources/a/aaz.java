package a;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class aaz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wsy f554a;
    public final List b;
    public final ArrayList c;
    public final List d;

    public aaz(wsy wsyVar, List list, ArrayList arrayList, List list2) {
        wsyVar.getClass();
        list.getClass();
        list2.getClass();
        this.f554a = wsyVar;
        this.b = list;
        this.c = arrayList;
        this.d = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aaz)) {
            return false;
        }
        aaz aazVar = (aaz) obj;
        return Intrinsics.d(this.f554a, aazVar.f554a) && Intrinsics.d(this.b, aazVar.b) && this.c.equals(aazVar.c) && Intrinsics.d(this.d, aazVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + brm0.e(twn.g(this.c, dw9.a(this.f554a.hashCode() * 961, 31, this.b), 31), 31, false);
    }

    public final String toString() {
        return "MethodSignatureData(returnType=" + this.f554a + ", receiverType=null, valueParameters=" + this.b + ", typeParameters=" + this.c + ", hasStableParameterNames=false, errors=" + this.d + ')';
    }
}
