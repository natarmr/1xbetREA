package a;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class jdg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f16329a;
    public final ArrayList b;

    public jdg0(byte b) {
        this.f16329a = b;
        switch (b) {
            case 1:
                this.b = new ArrayList(9);
                break;
            default:
                this.b = new ArrayList();
                break;
        }
    }

    public void a(Object obj) {
        byte b = this.f16329a;
        ArrayList arrayList = this.b;
        switch (b) {
            case 1:
                if (obj == null) {
                    hny.u("Set contributions cannot be null");
                } else {
                    arrayList.add(obj);
                }
                break;
            default:
                arrayList.add(obj);
                break;
        }
    }

    public void b(Object obj) {
        if (obj == null) {
            return;
        }
        boolean z = obj instanceof Object[];
        ArrayList arrayList = this.b;
        if (z) {
            Object[] objArr = (Object[]) obj;
            if (objArr.length > 0) {
                arrayList.ensureCapacity(arrayList.size() + objArr.length);
                Collections.addAll(arrayList, objArr);
                return;
            }
            return;
        }
        if (obj instanceof Collection) {
            arrayList.addAll((Collection) obj);
            return;
        }
        if (obj instanceof Iterable) {
            Iterator it = ((Iterable) obj).iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
        } else if (obj instanceof Iterator) {
            Iterator it2 = (Iterator) obj;
            while (it2.hasNext()) {
                arrayList.add(it2.next());
            }
        } else {
            throw new UnsupportedOperationException("Don't know how to spread " + obj.getClass());
        }
    }

    public synchronized List c() {
        return Collections.unmodifiableList(new ArrayList(this.b));
    }

    public synchronized boolean d(List list) {
        this.b.clear();
        if (list.size() <= 128) {
            return this.b.addAll(list);
        }
        Log.w("FirebaseCrashlytics", "Ignored 0 entries when adding rollout assignments. Maximum allowable: 128", null);
        return this.b.addAll(list.subList(0, 128));
    }

    public jdg0(int i) {
        this.f16329a = (byte) 2;
        this.b = new ArrayList(i);
    }
}
