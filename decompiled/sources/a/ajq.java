package a;

import com.huawei.hms.support.api.entity.core.JosStatusCodes;
import java.nio.ByteOrder;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class ajq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f989a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final long j;
    public final jtj k;
    public final ed40 l;

    public ajq(byte[] bArr, int i) {
        q8b q8bVar = new q8b(bArr, bArr.length);
        q8bVar.m(i * 8);
        this.f989a = q8bVar.g(16);
        this.b = q8bVar.g(16);
        this.c = q8bVar.g(24);
        this.d = q8bVar.g(24);
        int iG = q8bVar.g(20);
        this.e = iG;
        this.f = d(iG);
        this.g = q8bVar.g(3) + 1;
        int iG2 = q8bVar.g(5) + 1;
        this.h = iG2;
        this.i = a(iG2);
        this.j = q8bVar.i(36);
        this.k = null;
        this.l = null;
    }

    public static int a(int i) {
        if (i == 8) {
            return 1;
        }
        if (i == 12) {
            return 2;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 20) {
            return 5;
        }
        if (i != 24) {
            return i != 32 ? -1 : 7;
        }
        return 6;
    }

    public static int d(int i) {
        switch (i) {
            case JosStatusCodes.RTN_CODE_COMMON_ERROR /* 8000 */:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public final long b() {
        long j = this.j;
        if (j == 0) {
            return -9223372036854775807L;
        }
        return (j * 1000000) / ((long) this.e);
    }

    public final androidx.media3.common.b c(byte[] bArr, ed40 ed40Var) {
        bArr[4] = -128;
        int i = this.d;
        if (i <= 0) {
            i = -1;
        }
        ed40 ed40Var2 = this.l;
        if (ed40Var2 != null) {
            ed40Var = ed40Var2.b(ed40Var);
        }
        awq awqVar = new awq();
        awqVar.o = mg40.n("audio/flac");
        awqVar.p = i;
        awqVar.I = this.g;
        awqVar.K = this.e;
        String str = vtt0.f38024a;
        awqVar.L = vtt0.z(this.h, ByteOrder.LITTLE_ENDIAN);
        awqVar.r = Collections.singletonList(bArr);
        awqVar.l = ed40Var;
        return new androidx.media3.common.b(awqVar);
    }

    public ajq(int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, jtj jtjVar, ed40 ed40Var) {
        this.f989a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = d(i5);
        this.g = i6;
        this.h = i7;
        this.i = a(i7);
        this.j = j;
        this.k = jtjVar;
        this.l = ed40Var;
    }
}
