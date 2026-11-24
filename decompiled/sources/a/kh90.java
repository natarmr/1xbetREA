package a;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class kh90 extends g4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f18279a;
    public final f4 b;

    public /* synthetic */ kh90(f4 f4Var, byte b) {
        this.f18279a = b;
        this.b = f4Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.f18279a) {
            case 0:
                ((Map.Entry) obj).getClass();
                throw new UnsupportedOperationException();
            default:
                ((Map.Entry) obj).getClass();
                throw new UnsupportedOperationException();
        }
    }

    @Override // a.g4
    public final int b() {
        byte b = this.f18279a;
        f4 f4Var = this.b;
        switch (b) {
            case 0:
                return ((gh90) f4Var).g;
            default:
                return ((vh90) f4Var).d.c();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        byte b = this.f18279a;
        f4 f4Var = this.b;
        switch (b) {
            case 0:
                ((gh90) f4Var).clear();
                break;
            default:
                ((vh90) f4Var).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        byte b = this.f18279a;
        f4 f4Var = this.b;
        switch (b) {
            case 0:
                return r8x.F((gh90) f4Var, entry);
            default:
                return r8x.F((vh90) f4Var, entry);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        byte b = this.f18279a;
        f4 f4Var = this.b;
        switch (b) {
            case 0:
                return new s3d((gh90) f4Var);
            default:
                return new wh90((vh90) f4Var, (byte) 0);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        byte b = this.f18279a;
        f4 f4Var = this.b;
        switch (b) {
            case 0:
                return ((gh90) f4Var).remove(entry.getKey(), entry.getValue());
            default:
                return ((vh90) f4Var).remove(entry.getKey(), entry.getValue());
        }
    }
}
