package a;

import java.lang.reflect.Array;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class ho80 extends q8x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f13382a;
    public final /* synthetic */ q8x b;

    public /* synthetic */ ho80(q8x q8xVar, byte b) {
        this.f13382a = b;
        this.b = q8xVar;
    }

    @Override // a.q8x
    public final void y(emf0 emf0Var, Object obj) {
        byte b = this.f13382a;
        q8x q8xVar = this.b;
        switch (b) {
            case 0:
                Iterable iterable = (Iterable) obj;
                if (iterable != null) {
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        q8xVar.y(emf0Var, it.next());
                    }
                    break;
                }
                break;
            default:
                if (obj != null) {
                    int length = Array.getLength(obj);
                    for (int i = 0; i < length; i++) {
                        q8xVar.y(emf0Var, Array.get(obj, i));
                    }
                    break;
                }
                break;
        }
    }
}
