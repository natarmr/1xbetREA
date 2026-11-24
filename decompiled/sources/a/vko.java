package a;

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class vko extends FilterOutputStream {
    public static final byte[] g = "Exif\u0000\u0000".getBytes(gko.d);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lko f37582a;
    public final byte[] b;
    public final ByteBuffer c;
    public byte d;
    public int e;
    public int f;

    public vko(ByteArrayOutputStream byteArrayOutputStream, lko lkoVar) {
        super(new BufferedOutputStream(byteArrayOutputStream, 65536));
        this.b = new byte[1];
        this.c = ByteBuffer.allocate(4);
        this.d = (byte) 0;
        this.f37582a = lkoVar;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        lko lkoVar;
        int i3 = i;
        int i4 = i2;
        while (true) {
            int i5 = this.e;
            if ((i5 <= 0 && this.f <= 0 && this.d == 2) || i4 <= 0) {
                break;
            }
            if (i5 > 0) {
                int iMin = Math.min(i4, i5);
                i4 -= iMin;
                this.e -= iMin;
                i3 += iMin;
            }
            int i6 = this.f;
            if (i6 > 0) {
                int iMin2 = Math.min(i4, i6);
                ((FilterOutputStream) this).out.write(bArr, i3, iMin2);
                i4 -= iMin2;
                this.f -= iMin2;
                i3 += iMin2;
            }
            if (i4 == 0) {
                return;
            }
            byte b = this.d;
            int i7 = 4;
            ByteBuffer byteBuffer = this.c;
            if (b == 0) {
                int iMin3 = Math.min(i4, 2 - byteBuffer.position());
                byteBuffer.put(bArr, i3, iMin3);
                i3 += iMin3;
                i4 -= iMin3;
                if (byteBuffer.position() < 2) {
                    return;
                }
                byteBuffer.rewind();
                if (byteBuffer.getShort() != -40) {
                    ohq.l("Not a valid jpeg image, cannot write exif");
                    return;
                }
                ((FilterOutputStream) this).out.write(byteBuffer.array(), 0, 2);
                this.d = (byte) 1;
                byteBuffer.rewind();
                OutputStream outputStream = ((FilterOutputStream) this).out;
                ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
                zf9 zf9Var = new zf9(outputStream);
                zf9Var.c((short) -31);
                int[] iArr = new int[4];
                int[] iArr2 = new int[4];
                wko[] wkoVarArr = lko.b;
                int i8 = 0;
                while (true) {
                    lkoVar = this.f37582a;
                    if (i8 >= i7) {
                        break;
                    }
                    wko wkoVar = wkoVarArr[i8];
                    int i9 = 0;
                    while (true) {
                        wko[] wkoVarArr2 = lko.b;
                        if (i9 < i7) {
                            lkoVar.a(i9).remove(wkoVar.b);
                            i9++;
                            i7 = 4;
                        }
                    }
                    i8++;
                    i7 = 4;
                }
                Map mapA = lkoVar.a(1);
                ByteOrder byteOrder2 = ByteOrder.BIG_ENDIAN;
                if (!mapA.isEmpty()) {
                    lkoVar.a(0).put(lko.b[1].b, gko.a(0L, byteOrder2));
                }
                if (!lkoVar.a(2).isEmpty()) {
                    lkoVar.a(0).put(lko.b[2].b, gko.a(0L, byteOrder2));
                }
                if (!lkoVar.a(3).isEmpty()) {
                    lkoVar.a(1).put(lko.b[3].b, gko.a(0L, byteOrder2));
                }
                int i10 = 0;
                while (true) {
                    wko[] wkoVarArr3 = lko.b;
                    if (i10 >= 4) {
                        break;
                    }
                    Iterator it = lkoVar.a(i10).entrySet().iterator();
                    int i11 = 0;
                    while (it.hasNext()) {
                        gko gkoVar = (gko) ((Map.Entry) it.next()).getValue();
                        int i12 = gko.f[gkoVar.f11453a] * gkoVar.b;
                        if (i12 > 4) {
                            i11 += i12;
                        }
                    }
                    iArr2[i10] = iArr2[i10] + i11;
                    i10++;
                }
                int i13 = 0;
                int size = 8;
                while (true) {
                    wko[] wkoVarArr4 = lko.b;
                    if (i13 >= 4) {
                        break;
                    }
                    if (!lkoVar.a(i13).isEmpty()) {
                        iArr[i13] = size;
                        size += (lkoVar.a(i13).size() * 12) + 6 + iArr2[i13];
                    }
                    i13++;
                }
                int i14 = size + 8;
                if (!lkoVar.a(1).isEmpty()) {
                    lkoVar.a(0).put(lko.b[1].b, gko.a(iArr[1], byteOrder2));
                }
                if (!lkoVar.a(2).isEmpty()) {
                    lkoVar.a(0).put(lko.b[2].b, gko.a(iArr[2], byteOrder2));
                }
                if (!lkoVar.a(3).isEmpty()) {
                    lkoVar.a(1).put(lko.b[3].b, gko.a(iArr[3], byteOrder2));
                }
                zf9Var.c((short) i14);
                zf9Var.write(g);
                ByteOrder byteOrder3 = ByteOrder.BIG_ENDIAN;
                zf9Var.c((short) 19789);
                zf9Var.c((short) 42);
                zf9Var.a(8);
                int i15 = 0;
                while (true) {
                    wko[] wkoVarArr5 = lko.b;
                    if (i15 >= 4) {
                        break;
                    }
                    if (!lkoVar.a(i15).isEmpty()) {
                        zf9Var.c((short) lkoVar.a(i15).size());
                        int size2 = (lkoVar.a(i15).size() * 12) + iArr[i15] + 2 + 4;
                        for (Map.Entry entry : lkoVar.a(i15).entrySet()) {
                            wko wkoVar2 = (wko) ((HashMap) jko.e.get(i15)).get(entry.getKey());
                            z1x.x(wkoVar2, "Tag not supported: " + ((String) entry.getKey()) + ". Tag needs to be ported from ExifInterface to ExifData.");
                            char c = wkoVar2.f39316a;
                            gko gkoVar2 = (gko) entry.getValue();
                            int[] iArr3 = gko.f;
                            byte b2 = gkoVar2.f11453a;
                            int i16 = gkoVar2.b;
                            int i17 = iArr3[b2] * i16;
                            zf9Var.c((short) c);
                            zf9Var.c(gkoVar2.f11453a);
                            zf9Var.a(i16);
                            if (i17 > 4) {
                                zf9Var.a(size2);
                                size2 += i17;
                            } else {
                                zf9Var.write(gkoVar2.c);
                                if (i17 < 4) {
                                    for (int i18 = 4; i17 < i18; i18 = 4) {
                                        zf9Var.f44291a.write(0);
                                        i17++;
                                    }
                                }
                            }
                        }
                        zf9Var.a(0);
                        Iterator it2 = lkoVar.a(i15).entrySet().iterator();
                        while (it2.hasNext()) {
                            byte[] bArr2 = ((gko) ((Map.Entry) it2.next()).getValue()).c;
                            if (bArr2.length > 4) {
                                zf9Var.write(bArr2, 0, bArr2.length);
                            }
                        }
                    }
                    i15++;
                }
                ByteOrder byteOrder4 = ByteOrder.BIG_ENDIAN;
            } else if (b != 1) {
                continue;
            } else {
                int iMin4 = Math.min(i4, 4 - byteBuffer.position());
                byteBuffer.put(bArr, i3, iMin4);
                i3 += iMin4;
                i4 -= iMin4;
                if (byteBuffer.position() == 2 && byteBuffer.getShort() == -39) {
                    ((FilterOutputStream) this).out.write(byteBuffer.array(), 0, 2);
                    byteBuffer.rewind();
                }
                if (byteBuffer.position() < 4) {
                    return;
                }
                byteBuffer.rewind();
                short s = byteBuffer.getShort();
                if (s == -31) {
                    this.e = (byteBuffer.getShort() & 65535) - 2;
                    this.d = (byte) 2;
                } else if (s < -64 || s > -49 || s == -60 || s == -56 || s == -52) {
                    ((FilterOutputStream) this).out.write(byteBuffer.array(), 0, 4);
                    this.f = (byteBuffer.getShort() & 65535) - 2;
                } else {
                    ((FilterOutputStream) this).out.write(byteBuffer.array(), 0, 4);
                    this.d = (byte) 2;
                }
                byteBuffer.rewind();
            }
        }
        if (i4 > 0) {
            ((FilterOutputStream) this).out.write(bArr, i3, i4);
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i) throws IOException {
        byte[] bArr = this.b;
        bArr[0] = (byte) (i & 255);
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }
}
