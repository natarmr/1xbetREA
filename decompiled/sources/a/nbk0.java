package a;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class nbk0 extends g4 {
    public static final /* synthetic */ int c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f23246a;
    public int b;

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        Object obj2;
        int i = this.b;
        if (i == 0) {
            this.f23246a = obj;
        } else {
            Object obj3 = this.f23246a;
            if (i == 1) {
                if (Intrinsics.d(obj3, obj)) {
                    return false;
                }
                this.f23246a = new Object[]{this.f23246a, obj};
            } else if (i < 5) {
                obj3.getClass();
                Object[] objArr = (Object[]) obj3;
                if (tx3.u(obj, objArr)) {
                    return false;
                }
                int i2 = this.b;
                if (i2 == 4) {
                    Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                    LinkedHashSet linkedHashSet = new LinkedHashSet(wp20.a(objArrCopyOf.length));
                    tx3.Z(objArrCopyOf, linkedHashSet);
                    linkedHashSet.add(obj);
                    obj2 = linkedHashSet;
                } else {
                    Object[] objArrCopyOf2 = Arrays.copyOf(objArr, i2 + 1);
                    objArrCopyOf2[objArrCopyOf2.length - 1] = obj;
                    obj2 = objArrCopyOf2;
                }
                this.f23246a = obj2;
            } else {
                obj3.getClass();
                if (!zys0.d(obj3).add(obj)) {
                    return false;
                }
            }
        }
        this.b++;
        return true;
    }

    @Override // a.g4
    public final int b() {
        return this.b;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f23246a = null;
        this.b = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (b() == 0) {
            return false;
        }
        if (b() == 1) {
            return Intrinsics.d(this.f23246a, obj);
        }
        int iB = b();
        Object obj2 = this.f23246a;
        if (iB < 5) {
            obj2.getClass();
            return tx3.u(obj, (Object[]) obj2);
        }
        obj2.getClass();
        return ((Set) obj2).contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i = this.b;
        if (i == 0) {
            return Collections.EMPTY_SET.iterator();
        }
        Object obj = this.f23246a;
        if (i == 1) {
            return new kgi0(obj, (byte) 1);
        }
        if (i < 5) {
            obj.getClass();
            return new s3d((Object[]) obj);
        }
        obj.getClass();
        return zys0.d(obj).iterator();
    }
}
