package a;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class eg9 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f7753a = 0;
    public int b = 0;
    public final int c;
    public final /* synthetic */ Iterable d;

    public eg9(qdw0 qdw0Var) {
        this.d = qdw0Var;
        this.c = qdw0Var.e();
    }

    public byte a() {
        try {
            byte[] bArr = ((nh00) this.d).b;
            int i = this.b;
            this.b = i + 1;
            return bArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            v4i0.o(e.getMessage());
            return (byte) 0;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f7753a) {
            case 0:
                return this.b < this.c;
            case 1:
                return this.b < this.c;
            case 2:
                return this.b < this.c;
            case 3:
                return this.b < this.c;
            case 4:
                return this.b < this.c;
            case 5:
                return this.b < this.c;
            default:
                return this.b < this.c;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        byte b = this.f7753a;
        Iterable iterable = this.d;
        int i = this.c;
        switch (b) {
            case 0:
                int i2 = this.b;
                if (i2 < i) {
                    this.b = i2 + 1;
                    return Byte.valueOf(((kg9) iterable).j(i2));
                }
                itt0.a();
                return null;
            case 1:
                int i3 = this.b;
                if (i3 < i) {
                    this.b = i3 + 1;
                    return Byte.valueOf(((lg9) iterable).g(i3));
                }
                itt0.a();
                return null;
            case 2:
                int i4 = this.b;
                if (i4 < i) {
                    this.b = i4 + 1;
                    return Byte.valueOf(((mg9) iterable).i(i4));
                }
                itt0.a();
                return null;
            case 3:
                return Byte.valueOf(a());
            case 4:
                int i5 = this.b;
                if (i5 < i) {
                    this.b = i5 + 1;
                    return Byte.valueOf(((qdw0) iterable).b(i5));
                }
                itt0.a();
                return null;
            case 5:
                int i6 = this.b;
                if (i6 < i) {
                    this.b = i6 + 1;
                    return Byte.valueOf(((sjw0) iterable).b(i6));
                }
                itt0.a();
                return null;
            default:
                int i7 = this.b;
                if (i7 < i) {
                    this.b = i7 + 1;
                    return Byte.valueOf(((vuw0) iterable).e(i7));
                }
                itt0.a();
                return null;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f7753a) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            case 2:
                throw new UnsupportedOperationException();
            case 3:
                throw new UnsupportedOperationException();
            case 4:
                throw new UnsupportedOperationException();
            case 5:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    public eg9(vuw0 vuw0Var) {
        this.d = vuw0Var;
        this.c = vuw0Var.g();
    }

    public eg9(sjw0 sjw0Var) {
        this.d = sjw0Var;
        this.c = sjw0Var.e();
    }

    public eg9(lg9 lg9Var) {
        this.d = lg9Var;
        this.c = lg9Var.size();
    }

    public eg9(mg9 mg9Var) {
        this.d = mg9Var;
        this.c = mg9Var.size();
    }

    public eg9(kg9 kg9Var) {
        this.d = kg9Var;
        this.c = kg9Var.size();
    }

    public eg9(nh00 nh00Var) {
        this.d = nh00Var;
        this.c = nh00Var.b.length;
    }
}
