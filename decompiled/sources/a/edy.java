package a;

import android.gov.nist.core.Separators;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@ahi0(with = gdy.class)
public final class edy extends mcy implements Map<String, mcy>, khy {
    public static final ddy Companion = new ddy();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f7643a;

    public edy(Map map) {
        map.getClass();
        this.f7643a = map;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ mcy compute(String str, BiFunction<? super String, ? super mcy, ? extends mcy> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ mcy computeIfAbsent(String str, Function<? super String, ? extends mcy> function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ mcy computeIfPresent(String str, BiFunction<? super String, ? super mcy, ? extends mcy> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        return this.f7643a.containsKey((String) obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        if (!(obj instanceof mcy)) {
            return false;
        }
        return this.f7643a.containsValue((mcy) obj);
    }

    @Override // java.util.Map
    public final Set<Map.Entry<String, mcy>> entrySet() {
        return this.f7643a.entrySet();
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return Intrinsics.d(this.f7643a, obj);
    }

    @Override // java.util.Map
    public final mcy get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        return (mcy) this.f7643a.get((String) obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.f7643a.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f7643a.isEmpty();
    }

    @Override // java.util.Map
    public final Set<String> keySet() {
        return this.f7643a.keySet();
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ mcy merge(String str, mcy mcyVar, BiFunction<? super mcy, ? super mcy, ? extends mcy> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ mcy put(String str, mcy mcyVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends String, ? extends mcy> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ mcy putIfAbsent(String str, mcy mcyVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final mcy remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ mcy replace(String str, mcy mcyVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void replaceAll(BiFunction<? super String, ? super mcy, ? extends mcy> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final int size() {
        return this.f7643a.size();
    }

    public final String toString() {
        return CollectionsKt.b0(this.f7643a.entrySet(), Separators.COMMA, "{", "}", new djx((byte) 13), 24);
    }

    @Override // java.util.Map
    public final Collection<mcy> values() {
        return this.f7643a.values();
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ boolean replace(String str, mcy mcyVar, mcy mcyVar2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
