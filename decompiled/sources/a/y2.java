package a;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public class y2 implements Iterator, khy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f41883a;
    public int b;
    public final Object c;

    public y2(zzn zznVar) {
        this.f41883a = (byte) 2;
        this.c = zznVar;
        this.b = zznVar.c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        byte b = this.f41883a;
        Object obj = this.c;
        switch (b) {
            case 0:
                return this.b < ((b3) obj).b();
            case 1:
                return this.b < ((Object[]) obj).length;
            case 2:
                return this.b > 0;
            case 3:
                return this.b < ((byte[]) obj).length;
            case 4:
                return this.b < ((int[]) obj).length;
            case 5:
                return this.b < ((long[]) obj).length;
            default:
                return this.b < ((short[]) obj).length;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        byte b = this.f41883a;
        Object obj = this.c;
        switch (b) {
            case 0:
                if (!hasNext()) {
                    itt0.a();
                    return null;
                }
                int i = this.b;
                this.b = i + 1;
                return ((b3) obj).get(i);
            case 1:
                try {
                    int i2 = this.b;
                    this.b = i2 + 1;
                    return ((Object[]) obj)[i2];
                } catch (ArrayIndexOutOfBoundsException e) {
                    this.b--;
                    v4i0.o(e.getMessage());
                    return null;
                }
            case 2:
                zzn zznVar = (zzn) obj;
                int i3 = zznVar.c;
                int i4 = this.b;
                this.b = i4 - 1;
                return zznVar.e[i3 - i4];
            case 3:
                int i5 = this.b;
                byte[] bArr = (byte[]) obj;
                if (i5 < bArr.length) {
                    this.b = i5 + 1;
                    return new p1t0(bArr[i5]);
                }
                v4i0.o(String.valueOf(i5));
                return null;
            case 4:
                int i6 = this.b;
                int[] iArr = (int[]) obj;
                if (i6 < iArr.length) {
                    this.b = i6 + 1;
                    return new b2t0(iArr[i6]);
                }
                v4i0.o(String.valueOf(i6));
                return null;
            case 5:
                int i7 = this.b;
                long[] jArr = (long[]) obj;
                if (i7 < jArr.length) {
                    this.b = i7 + 1;
                    return new h2t0(jArr[i7]);
                }
                v4i0.o(String.valueOf(i7));
                return null;
            default:
                int i8 = this.b;
                short[] sArr = (short[]) obj;
                if (i8 < sArr.length) {
                    this.b = i8 + 1;
                    return new q2t0(sArr[i8]);
                }
                v4i0.o(String.valueOf(i8));
                return null;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f41883a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 3:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 4:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 5:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public y2(Object[] objArr) {
        this.f41883a = (byte) 1;
        objArr.getClass();
        this.c = objArr;
    }

    public /* synthetic */ y2(Object obj, byte b) {
        this.f41883a = b;
        this.c = obj;
    }
}
