package a;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class c320 {
    public static final b320 Companion = new b320();
    public static final a8z[] j = {null, null, null, null, null, maz.a(wez.f39042a, new sv10(17)), null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3652a;
    public final int[] b;
    public final int c;
    public final String d;
    public final int e;
    public final List f;
    public final int g;
    public final int h;
    public final String i;

    public /* synthetic */ c320(int i, int i2, int[] iArr, int i3, String str, int i4, List list, int i5, int i6, String str2) {
        if ((i & 1) == 0) {
            this.f3652a = 0;
        } else {
            this.f3652a = i2;
        }
        if ((i & 2) == 0) {
            this.b = new int[2];
        } else {
            this.b = iArr;
        }
        if ((i & 4) == 0) {
            this.c = 0;
        } else {
            this.c = i3;
        }
        if ((i & 8) == 0) {
            this.d = "";
        } else {
            this.d = str;
        }
        if ((i & 16) == 0) {
            this.e = 0;
        } else {
            this.e = i4;
        }
        if ((i & 32) == 0) {
            this.f = kotlin.collections.a.c(0);
        } else {
            this.f = list;
        }
        if ((i & 64) == 0) {
            this.g = 0;
        } else {
            this.g = i5;
        }
        if ((i & 128) == 0) {
            this.h = 0;
        } else {
            this.h = i6;
        }
        if ((i & 256) == 0) {
            this.i = "0";
        } else {
            this.i = str2;
        }
    }

    public c320(int i, int[] iArr, int i2, String str, int i3, String str2) {
        List listC = kotlin.collections.a.c(0);
        iArr.getClass();
        listC.getClass();
        this.f3652a = i;
        this.b = iArr;
        this.c = i2;
        this.d = str;
        this.e = 22;
        this.f = listC;
        this.g = i3;
        this.h = 0;
        this.i = str2;
    }
}
