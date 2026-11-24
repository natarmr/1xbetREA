package a;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class ax3 extends AbstractSet {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f1604a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ax3(Object obj, byte b) {
        this.f1604a = b;
        this.b = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        byte b = this.f1604a;
        Object obj2 = this.b;
        switch (b) {
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                if (contains(entry)) {
                    return false;
                }
                ((nak0) obj2).put((Comparable) entry.getKey(), entry.getValue());
                return true;
            case 2:
                Map.Entry entry2 = (Map.Entry) obj;
                if (contains(entry2)) {
                    return false;
                }
                ((oak0) obj2).put((Comparable) entry2.getKey(), entry2.getValue());
                return true;
            case 3:
                Map.Entry entry3 = (Map.Entry) obj;
                if (contains(entry3)) {
                    return false;
                }
                ((pak0) obj2).put((Comparable) entry3.getKey(), entry3.getValue());
                return true;
            case 4:
                Map.Entry entry4 = (Map.Entry) obj;
                if (contains(entry4)) {
                    return false;
                }
                ((ggw0) obj2).put((Comparable) entry4.getKey(), entry4.getValue());
                return true;
            default:
                return super.add(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        byte b = this.f1604a;
        Object obj = this.b;
        switch (b) {
            case 1:
                ((nak0) obj).clear();
                break;
            case 2:
                ((oak0) obj).clear();
                break;
            case 3:
                ((pak0) obj).clear();
                break;
            case 4:
                ((ggw0) obj).clear();
                break;
            default:
                super.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        byte b = this.f1604a;
        Object obj2 = this.b;
        switch (b) {
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                Object obj3 = ((nak0) obj2).get(entry.getKey());
                Object value = entry.getValue();
                if (obj3 != value) {
                    return obj3 != null && obj3.equals(value);
                }
                return true;
            case 2:
                Map.Entry entry2 = (Map.Entry) obj;
                Object obj4 = ((oak0) obj2).get(entry2.getKey());
                Object value2 = entry2.getValue();
                if (obj4 != value2) {
                    return obj4 != null && obj4.equals(value2);
                }
                return true;
            case 3:
                Map.Entry entry3 = (Map.Entry) obj;
                Object obj5 = ((pak0) obj2).get(entry3.getKey());
                Object value3 = entry3.getValue();
                if (obj5 != value3) {
                    return obj5 != null && obj5.equals(value3);
                }
                return true;
            case 4:
                Map.Entry entry4 = (Map.Entry) obj;
                Object obj6 = ((ggw0) obj2).get(entry4.getKey());
                Object value4 = entry4.getValue();
                if (obj6 != value4) {
                    return obj6 != null && obj6.equals(value4);
                }
                return true;
            default:
                return super.contains(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        byte b = this.f1604a;
        byte b2 = 1;
        Object obj = this.b;
        switch (b) {
            case 0:
                return new dx3((gx3) obj);
            case 1:
                return new uak0((nak0) obj, (byte) 0);
            case 2:
                return new uak0((oak0) obj, b2);
            case 3:
                return new uak0((pak0) obj, (byte) 2);
            case 4:
                return new uak0((ggw0) obj, (byte) 3);
            default:
                return new ocw0(this, b2);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        byte b = this.f1604a;
        Object obj2 = this.b;
        switch (b) {
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                if (!contains(entry)) {
                    return false;
                }
                ((nak0) obj2).remove(entry.getKey());
                return true;
            case 2:
                Map.Entry entry2 = (Map.Entry) obj;
                if (!contains(entry2)) {
                    return false;
                }
                ((oak0) obj2).remove(entry2.getKey());
                return true;
            case 3:
                Map.Entry entry3 = (Map.Entry) obj;
                if (!contains(entry3)) {
                    return false;
                }
                ((pak0) obj2).remove(entry3.getKey());
                return true;
            case 4:
                Map.Entry entry4 = (Map.Entry) obj;
                if (!contains(entry4)) {
                    return false;
                }
                ((ggw0) obj2).remove(entry4.getKey());
                return true;
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        byte b = this.f1604a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return ((gx3) obj).c;
            case 1:
                return ((nak0) obj).size();
            case 2:
                return ((oak0) obj).size();
            case 3:
                return ((pak0) obj).size();
            case 4:
                return ((ggw0) obj).size();
            default:
                return ((mix0) obj).e;
        }
    }
}
