package a;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class qlw0 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f28955a;
    public int b = 0;
    public final /* synthetic */ slw0 c;

    public /* synthetic */ qlw0(slw0 slw0Var, byte b) {
        this.f28955a = b;
        this.c = slw0Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        byte b = this.f28955a;
        slw0 slw0Var = this.c;
        switch (b) {
            case 0:
                return this.b < slw0Var.f32420a.length();
            default:
                return this.b < slw0Var.f32420a.length();
        }
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        byte b = this.f28955a;
        slw0 slw0Var = this.c;
        switch (b) {
            case 0:
                String str = slw0Var.f32420a;
                int i = this.b;
                if (i < str.length()) {
                    this.b = i + 1;
                    return new slw0(String.valueOf(i));
                }
                itt0.a();
                return null;
            default:
                String str2 = slw0Var.f32420a;
                int i2 = this.b;
                if (i2 < str2.length()) {
                    this.b = i2 + 1;
                    return new slw0(String.valueOf(str2.charAt(i2)));
                }
                itt0.a();
                return null;
        }
    }
}
