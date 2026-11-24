package a;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes2.dex */
public final class ah30 extends b3 {
    public final /* synthetic */ byte b = 0;
    public final Object c;

    public ah30(List list) {
        list.getClass();
        this.c = list;
    }

    @Override // a.u1
    public final int b() {
        byte b = this.b;
        Object obj = this.c;
        switch (b) {
            case 0:
                return ((bh30) obj).f2586a.groupCount() + 1;
            default:
                return ((List) obj).size();
        }
    }

    @Override // a.u1, java.util.Collection, java.util.List
    public /* bridge */ boolean contains(Object obj) {
        switch (this.b) {
            case 0:
                if (obj instanceof String) {
                    return super.contains((String) obj);
                }
                return false;
            default:
                return super.contains(obj);
        }
    }

    @Override // java.util.List
    public final Object get(int i) {
        byte b = this.b;
        Object obj = this.c;
        switch (b) {
            case 0:
                String strGroup = ((bh30) obj).f2586a.group(i);
                return strGroup == null ? "" : strGroup;
            default:
                return ((List) obj).get(x3d.B(i, this));
        }
    }

    @Override // a.b3, java.util.List
    public /* bridge */ int indexOf(Object obj) {
        switch (this.b) {
            case 0:
                if (obj instanceof String) {
                    return super.indexOf((String) obj);
                }
                return -1;
            default:
                return super.indexOf(obj);
        }
    }

    @Override // a.b3, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        switch (this.b) {
            case 1:
                return new xag0(this, 0);
            default:
                return super.iterator();
        }
    }

    @Override // a.b3, java.util.List
    public /* bridge */ int lastIndexOf(Object obj) {
        switch (this.b) {
            case 0:
                if (obj instanceof String) {
                    return super.lastIndexOf((String) obj);
                }
                return -1;
            default:
                return super.lastIndexOf(obj);
        }
    }

    @Override // a.b3, java.util.List
    public ListIterator listIterator() {
        switch (this.b) {
            case 1:
                return new xag0(this, 0);
            default:
                return super.listIterator();
        }
    }

    public ah30(bh30 bh30Var) {
        this.c = bh30Var;
    }

    @Override // a.b3, java.util.List
    public ListIterator listIterator(int i) {
        switch (this.b) {
            case 1:
                return new xag0(this, i);
            default:
                return super.listIterator(i);
        }
    }
}
