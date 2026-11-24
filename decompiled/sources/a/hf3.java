package a;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class hf3 extends zdx {
    public final /* synthetic */ byte b;

    public /* synthetic */ hf3(byte b) {
        this.b = b;
    }

    public static peo Q(fq80 fq80Var) {
        String strU = fq80Var.u();
        strU.getClass();
        String strU2 = fq80Var.u();
        strU2.getClass();
        return new peo(strU, strU2, fq80Var.t(), fq80Var.t(), Arrays.copyOfRange(fq80Var.f9961a, fq80Var.b, fq80Var.c));
    }

    @Override // a.zdx
    public final ed40 y(md40 md40Var, ByteBuffer byteBuffer) {
        switch (this.b) {
            case 0:
                if (byteBuffer.get() != 116) {
                    return null;
                }
                q8b q8bVar = new q8b(byteBuffer.array(), byteBuffer.limit());
                q8bVar.o(12);
                int iD = (q8bVar.d() + q8bVar.g(12)) - 4;
                q8bVar.o(44);
                q8bVar.p(q8bVar.g(12));
                q8bVar.o(16);
                ArrayList arrayList = new ArrayList();
                while (q8bVar.d() < iD) {
                    q8bVar.o(48);
                    int iG = q8bVar.g(8);
                    q8bVar.o(4);
                    int iD2 = q8bVar.d() + q8bVar.g(12);
                    String str = null;
                    String str2 = null;
                    while (q8bVar.d() < iD2) {
                        int iG2 = q8bVar.g(8);
                        int iG3 = q8bVar.g(8);
                        int iD3 = q8bVar.d() + iG3;
                        if (iG2 == 2) {
                            int iG4 = q8bVar.g(16);
                            q8bVar.o(8);
                            if (iG4 == 3) {
                                while (q8bVar.d() < iD3) {
                                    int iG5 = q8bVar.g(8);
                                    Charset charset = StandardCharsets.US_ASCII;
                                    byte[] bArr = new byte[iG5];
                                    q8bVar.j(bArr, iG5);
                                    String str3 = new String(bArr, charset);
                                    int iG6 = q8bVar.g(8);
                                    for (int i = 0; i < iG6; i++) {
                                        q8bVar.p(q8bVar.g(8));
                                    }
                                    str = str3;
                                }
                            }
                        } else if (iG2 == 21) {
                            Charset charset2 = StandardCharsets.US_ASCII;
                            byte[] bArr2 = new byte[iG3];
                            q8bVar.j(bArr2, iG3);
                            str2 = new String(bArr2, charset2);
                        }
                        q8bVar.m(iD3 * 8);
                    }
                    q8bVar.m(iD2 * 8);
                    if (str != null && str2 != null) {
                        arrayList.add(new gf3(iG, str.concat(str2)));
                    }
                }
                if (arrayList.isEmpty()) {
                    return null;
                }
                return new ed40(arrayList);
            default:
                return new ed40(Q(new fq80(byteBuffer.array(), byteBuffer.limit())));
        }
    }
}
