package a;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class d0l0 implements Iterable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f5273a = 1;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public d0l0(b7x0 b7x0Var, List list, List list2) {
        this.b = list;
        this.c = list2;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        byte b = this.f5273a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                qo8 qo8Var = (qo8) obj;
                return ((e0l0) qo8Var.e).d(qo8Var, (String) obj2);
            default:
                return new idw0(((List) obj2).iterator(), ((List) obj).iterator());
        }
    }

    public String toString() {
        switch (this.f5273a) {
            case 0:
                pfw pfwVar = new pfw(", ");
                StringBuilder sb = new StringBuilder();
                sb.append('[');
                pfwVar.a(sb, iterator());
                sb.append(']');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public d0l0(qo8 qo8Var, String str) {
        this.b = str;
        this.c = qo8Var;
    }
}
