package a;

import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class i93 implements g93 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f14369a;
    public final Object b;

    public i93(List list, byte b) {
        this.f14369a = b;
        switch (b) {
            case 1:
                list.getClass();
                this.b = list;
                break;
            default:
                this.b = list;
                break;
        }
    }

    @Override // a.g93
    public final t83 O0(swq swqVar) {
        byte b = this.f14369a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return jar0.R(this, swqVar);
            case 1:
                swqVar.getClass();
                return (t83) pgi0.j(pgi0.q(CollectionsKt.I((List) obj), new ald(swqVar, (byte) 0)));
            default:
                swqVar.getClass();
                if (Intrinsics.d(swqVar, (swq) obj)) {
                    return wyn.f39982a;
                }
                return null;
        }
    }

    @Override // a.g93
    public final boolean isEmpty() {
        byte b = this.f14369a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return ((List) obj).isEmpty();
            case 1:
                List list = (List) obj;
                if (list == null || !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (!((g93) it.next()).isEmpty()) {
                            return false;
                        }
                    }
                }
                return true;
            default:
                return false;
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        byte b = this.f14369a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return ((List) obj).iterator();
            case 1:
                return new bkq(pgi0.k(CollectionsKt.I((List) obj), i13.y));
            default:
                iun.f15405a.getClass();
                return hun.f13690a;
        }
    }

    public String toString() {
        switch (this.f14369a) {
            case 0:
                return ((List) this.b).toString();
            default:
                return super.toString();
        }
    }

    @Override // a.g93
    public final boolean z0(swq swqVar) {
        switch (this.f14369a) {
            case 0:
                return jar0.U(this, swqVar);
            case 1:
                swqVar.getClass();
                Iterator it = ((Iterable) CollectionsKt.I((List) this.b).b).iterator();
                while (it.hasNext()) {
                    if (((g93) it.next()).z0(swqVar)) {
                        return true;
                    }
                }
                return false;
            default:
                return jar0.U(this, swqVar);
        }
    }

    public i93(swq swqVar) {
        this.f14369a = (byte) 2;
        swqVar.getClass();
        this.b = swqVar;
    }
}
