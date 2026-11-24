package a;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ykj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f42791a;
    public final String b;
    public final List c;
    public final String d;
    public Integer e;
    public Integer f;
    public Object g;
    public final int h;
    public final int i;
    public final int j;

    public ykj(byte[] bArr, String str, ArrayList arrayList, String str2, int i, int i2, int i3) {
        this.f42791a = bArr;
        this.b = str;
        this.c = arrayList;
        this.d = str2;
        this.h = i2;
        this.i = i;
        this.j = i3;
    }

    public ykj(String str, String str2, byte[] bArr) {
        this(bArr, str, null, str2, -1, -1, 0);
    }
}
