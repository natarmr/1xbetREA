package a;

import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class sjt implements Iterator, khy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f32318a;
    public int b;
    public Object c;
    public final /* synthetic */ Object d;

    public sjt(lz40 lz40Var) {
        this.f32318a = (byte) 2;
        this.d = lz40Var;
        this.b = -1;
        this.c = igi0.a(new kz40(lz40Var, this, null));
    }

    public void a() {
        Object objInvoke;
        int i = this.b;
        tjt tjtVar = (tjt) this.d;
        if (i == -2) {
            objInvoke = ((Function0) tjtVar.c).invoke();
        } else {
            Function1 function1 = (Function1) tjtVar.b;
            Object obj = this.c;
            obj.getClass();
            objInvoke = function1.invoke(obj);
        }
        this.c = objInvoke;
        this.b = objInvoke == null ? 0 : 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f32318a) {
            case 0:
                if (this.b < 0) {
                    a();
                }
                return this.b == 1;
            case 1:
                return ((egi0) this.c).hasNext();
            case 2:
                return ((egi0) this.c).hasNext();
            default:
                return ((Iterator) this.c).hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f32318a) {
            case 0:
                if (this.b < 0) {
                    a();
                }
                if (this.b == 0) {
                    itt0.a();
                    return null;
                }
                Object obj = this.c;
                obj.getClass();
                this.b = -1;
                return obj;
            case 1:
                return ((egi0) this.c).next();
            case 2:
                return ((egi0) this.c).next();
            default:
                kh10 kh10Var = (kh10) ((tjt) this.d).b;
                int i = this.b;
                this.b = i + 1;
                if (i >= 0) {
                    return kh10Var.invoke(Integer.valueOf(i), ((Iterator) this.c).next());
                }
                q3d.p();
                throw null;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        byte b = this.f32318a;
        Object obj = this.d;
        switch (b) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                int i = this.b;
                if (i != -1) {
                    ((zy40) obj).b.i(i);
                    this.b = -1;
                    return;
                }
                return;
            case 2:
                int i2 = this.b;
                if (i2 != -1) {
                    ((lz40) obj).b.m(i2);
                    this.b = -1;
                    return;
                }
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public sjt(tjt tjtVar) {
        this.f32318a = (byte) 0;
        this.d = tjtVar;
        this.b = -2;
    }

    public sjt(tjt tjtVar, byte b) {
        this.f32318a = (byte) 3;
        this.d = tjtVar;
        this.c = new bkq((ckq) tjtVar.c);
    }

    public sjt(zy40 zy40Var) {
        this.f32318a = (byte) 1;
        this.d = zy40Var;
        this.b = -1;
        this.c = igi0.a(new yy40(zy40Var, this, null));
    }
}
