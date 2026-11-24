package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
@ahi0
public final class wio {
    public static final uio Companion = new uio();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f39225a;
    public final boolean b;

    public /* synthetic */ wio(int i, int i2, boolean z) {
        if (3 != (i & 3)) {
            m2x.I(i, 3, sio.f32273a.getDescriptor());
            throw null;
        }
        this.f39225a = i2;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wio)) {
            return false;
        }
        wio wioVar = (wio) obj;
        return this.f39225a == wioVar.f39225a && this.b == wioVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Integer.hashCode(this.f39225a) * 31);
    }

    public final String toString() {
        return rz4.i(this.f39225a, "ExamAnswerRequest(id=", ", value=", Separators.RPAREN, this.b);
    }

    public wio(int i, boolean z) {
        this.f39225a = i;
        this.b = z;
    }
}
