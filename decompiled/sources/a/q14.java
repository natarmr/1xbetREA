package a;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import java.io.Closeable;

/* JADX INFO: loaded from: classes4.dex */
public final class q14 implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f27932a;
    public final TypedArray b;

    public q14(Context context, AttributeSet attributeSet, int[] iArr) {
        context.getClass();
        this.f27932a = context;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        typedArrayObtainStyledAttributes.getClass();
        this.b = typedArrayObtainStyledAttributes;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.b.recycle();
    }
}
