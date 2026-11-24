package a;

import java.util.Iterator;
import kotlin.Pair;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes2.dex */
public final class m6k implements Iterator, khy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f21274a = -1;
    public int b;
    public int c;
    public IntRange d;
    public int e;
    public final /* synthetic */ n6k f;

    public m6k(n6k n6kVar) {
        this.f = n6kVar;
        int iD = l1e0.d(0, 0, n6kVar.f22999a.length());
        this.b = iD;
        this.c = iD;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001c  */
    /* JADX WARN: Code duplicated, block: B:12:0x0022 A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Code duplicated, block: B:18:0x006f  */
    public final void a() {
        Pair pair;
        n6k n6kVar = this.f;
        CharSequence charSequence = n6kVar.f22999a;
        int i = this.c;
        if (i < 0) {
            this.f21274a = 0;
            this.d = null;
            return;
        }
        int i2 = n6kVar.b;
        if (i2 > 0) {
            int i3 = this.e + 1;
            this.e = i3;
            if (i3 >= i2) {
                this.d = new IntRange(this.b, StringsKt.T(charSequence), 1);
                this.c = -1;
            } else if (i > charSequence.length() && (pair = (Pair) n6kVar.c.invoke(charSequence, Integer.valueOf(this.c))) != null) {
                int iIntValue = ((Number) pair.f46059a).intValue();
                int iIntValue2 = ((Number) pair.b).intValue();
                this.d = l1e0.o(this.b, iIntValue);
                int i4 = iIntValue + iIntValue2;
                this.b = i4;
                this.c = i4 + (iIntValue2 == 0 ? 1 : 0);
            } else {
                this.d = new IntRange(this.b, StringsKt.T(charSequence), 1);
                this.c = -1;
            }
        } else if (i > charSequence.length()) {
            this.d = new IntRange(this.b, StringsKt.T(charSequence), 1);
            this.c = -1;
        } else {
            int iIntValue3 = ((Number) pair.f46059a).intValue();
            int iIntValue4 = ((Number) pair.b).intValue();
            this.d = l1e0.o(this.b, iIntValue3);
            int i5 = iIntValue3 + iIntValue4;
            this.b = i5;
            this.c = i5 + (iIntValue4 == 0 ? 1 : 0);
        }
        this.f21274a = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f21274a == -1) {
            a();
        }
        return this.f21274a == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f21274a == -1) {
            a();
        }
        if (this.f21274a == 0) {
            itt0.a();
            return null;
        }
        IntRange intRange = this.d;
        intRange.getClass();
        this.d = null;
        this.f21274a = -1;
        return intRange;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
