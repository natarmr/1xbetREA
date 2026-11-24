package okhttp3.internal.http2;

import a.f99;
import a.ohq;
import a.qg9;
import a.qx3;
import a.zae0;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal._UtilCommonKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/internal/http2/Hpack;", "", "Reader", "Writer", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Hpack {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Header[] f46182a;
    public static final Map b;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/http2/Hpack$Reader;", "", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Reader {
        public long c;
        public final zae0 d;
        public int g;
        public int h;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f46183a = 4096;
        public final ArrayList b = new ArrayList();
        public Header[] e = new Header[8];
        public int f = 7;

        public Reader(Http2Reader.ContinuationSource continuationSource) {
            this.d = new zae0(continuationSource);
        }

        public final void a(Header header) throws IOException {
            this.b.add(header);
            long jE = this.c + ((long) (header.b.e() + header.f46181a.e()));
            this.c = jE;
            if (jE <= 262144) {
                return;
            }
            ohq.l("header byte count limit of 262144 exceeded");
        }

        public final int b(int i) {
            int i2;
            int i3 = 0;
            if (i > 0) {
                int length = this.e.length;
                while (true) {
                    length--;
                    i2 = this.f;
                    if (length < i2 || i <= 0) {
                        break;
                    }
                    Header header = this.e[length];
                    header.getClass();
                    int i4 = header.c;
                    i -= i4;
                    this.h -= i4;
                    this.g--;
                    i3++;
                }
                Header[] headerArr = this.e;
                int i5 = i2 + 1;
                System.arraycopy(headerArr, i5, headerArr, i5 + i3, this.g);
                this.f += i3;
            }
            return i3;
        }

        public final qg9 c(int i) throws IOException {
            if (i >= 0) {
                Header[] headerArr = Hpack.f46182a;
                if (i <= headerArr.length - 1) {
                    return headerArr[i].f46181a;
                }
            }
            int length = this.f + 1 + (i - Hpack.f46182a.length);
            if (length >= 0) {
                Header[] headerArr2 = this.e;
                if (length < headerArr2.length) {
                    Header header = headerArr2[length];
                    header.getClass();
                    return header.f46181a;
                }
            }
            throw new IOException("Header index too large " + (i + 1));
        }

        public final void d(Header header) throws IOException {
            a(header);
            int i = header.c;
            int i2 = this.f46183a;
            if (i > i2) {
                Header[] headerArr = this.e;
                qx3.l(0, headerArr.length, null, headerArr);
                this.f = this.e.length - 1;
                this.g = 0;
                this.h = 0;
                return;
            }
            b((this.h + i) - i2);
            int i3 = this.g + 1;
            Header[] headerArr2 = this.e;
            if (i3 > headerArr2.length) {
                Header[] headerArr3 = new Header[headerArr2.length * 2];
                System.arraycopy(headerArr2, 0, headerArr3, headerArr2.length, headerArr2.length);
                this.f = this.e.length - 1;
                this.e = headerArr3;
                headerArr2 = headerArr3;
            }
            int i4 = this.f;
            this.f = i4 - 1;
            headerArr2[i4] = header;
            this.g++;
            this.h += i;
        }

        public final qg9 e() throws IOException {
            zae0 zae0Var = this.d;
            byte b = zae0Var.readByte();
            byte[] bArr = _UtilCommonKt.f46121a;
            int i = b & 255;
            int i2 = 0;
            boolean z = (b & 128) == 128;
            long jF = f(i, 127);
            if (this.c + jF > 262144) {
                ohq.l("header byte count limit of 262144 exceeded");
                return null;
            }
            if (!z) {
                return zae0Var.q0(jF);
            }
            f99 f99Var = new f99();
            Huffman.Node node = Huffman.c;
            Huffman.Node node2 = node;
            int i3 = 0;
            for (long j = 0; j < jF; j++) {
                byte b2 = zae0Var.readByte();
                byte[] bArr2 = _UtilCommonKt.f46121a;
                i2 = (i2 << 8) | (b2 & 255);
                i3 += 8;
                while (i3 >= 8) {
                    Huffman.Node[] nodeArr = node2.f46198a;
                    nodeArr.getClass();
                    node2 = nodeArr[(i2 >>> (i3 - 8)) & 255];
                    node2.getClass();
                    if (node2.f46198a == null) {
                        f99Var.V(node2.b);
                        i3 -= node2.c;
                        node2 = node;
                    } else {
                        i3 -= 8;
                    }
                }
            }
            while (i3 > 0) {
                Huffman.Node[] nodeArr2 = node2.f46198a;
                nodeArr2.getClass();
                Huffman.Node node3 = nodeArr2[(i2 << (8 - i3)) & 255];
                node3.getClass();
                Huffman.Node[] nodeArr3 = node3.f46198a;
                int i4 = node3.c;
                if (nodeArr3 != null || i4 > i3) {
                    break;
                }
                f99Var.V(node3.b);
                i3 -= i4;
                node2 = node;
            }
            return f99Var.q0(f99Var.b);
        }

        public final int f(int i, int i2) throws IOException {
            int i3 = i & i2;
            if (i3 < i2) {
                return i3;
            }
            long j = i2;
            int i4 = 0;
            int i5 = 0;
            while (i4 != 5) {
                byte b = this.d.readByte();
                byte[] bArr = _UtilCommonKt.f46121a;
                i4++;
                long j2 = ((long) (b & 127)) << i5;
                if (j2 > 2147483647L - j) {
                    ohq.l("HPACK integer overflow");
                    return 0;
                }
                j += j2;
                if ((b & 128) == 0) {
                    return (int) j;
                }
                i5 += 7;
            }
            ohq.l("HPACK integer overflow");
            return 0;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/http2/Hpack$Writer;", "", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Writer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f99 f46184a;
        public boolean c;
        public int g;
        public int h;
        public int b = Integer.MAX_VALUE;
        public int d = 4096;
        public Header[] e = new Header[8];
        public int f = 7;

        public Writer(f99 f99Var) {
            this.f46184a = f99Var;
        }

        public final void a(int i) {
            int i2;
            if (i > 0) {
                int length = this.e.length - 1;
                int i3 = 0;
                while (true) {
                    i2 = this.f;
                    if (length < i2 || i <= 0) {
                        break;
                    }
                    Header header = this.e[length];
                    header.getClass();
                    i -= header.c;
                    int i4 = this.h;
                    Header header2 = this.e[length];
                    header2.getClass();
                    this.h = i4 - header2.c;
                    this.g--;
                    i3++;
                    length--;
                }
                Header[] headerArr = this.e;
                int i5 = i2 + 1;
                System.arraycopy(headerArr, i5, headerArr, i5 + i3, this.g);
                Header[] headerArr2 = this.e;
                int i6 = this.f + 1;
                Arrays.fill(headerArr2, i6, i6 + i3, (Object) null);
                this.f += i3;
            }
        }

        public final void b(Header header) {
            int i = header.c;
            int i2 = this.d;
            if (i > i2) {
                Header[] headerArr = this.e;
                qx3.l(0, headerArr.length, null, headerArr);
                this.f = this.e.length - 1;
                this.g = 0;
                this.h = 0;
                return;
            }
            a((this.h + i) - i2);
            int i3 = this.g + 1;
            Header[] headerArr2 = this.e;
            if (i3 > headerArr2.length) {
                Header[] headerArr3 = new Header[headerArr2.length * 2];
                System.arraycopy(headerArr2, 0, headerArr3, headerArr2.length, headerArr2.length);
                this.f = this.e.length - 1;
                this.e = headerArr3;
                headerArr2 = headerArr3;
            }
            int i4 = this.f;
            this.f = i4 - 1;
            headerArr2[i4] = header;
            this.g++;
            this.h += i;
        }

        public final void c(qg9 qg9Var) {
            qg9Var.getClass();
            int[] iArr = Huffman.f46197a;
            int iE = qg9Var.e();
            long j = 0;
            long j2 = 0;
            for (int i = 0; i < iE; i++) {
                byte bL = qg9Var.l(i);
                byte[] bArr = _UtilCommonKt.f46121a;
                j2 += (long) Huffman.b[bL & 255];
            }
            int i2 = (int) ((j2 + 7) >> 3);
            int iE2 = qg9Var.e();
            f99 f99Var = this.f46184a;
            if (i2 >= iE2) {
                e(qg9Var.e(), 127, 0);
                f99Var.T(qg9Var);
                return;
            }
            f99 f99Var2 = new f99();
            int[] iArr2 = Huffman.f46197a;
            int iE3 = qg9Var.e();
            int i3 = 0;
            for (int i4 = 0; i4 < iE3; i4++) {
                byte bL2 = qg9Var.l(i4);
                byte[] bArr2 = _UtilCommonKt.f46121a;
                int i5 = bL2 & 255;
                int i6 = Huffman.f46197a[i5];
                byte b = Huffman.b[i5];
                j = (j << b) | ((long) i6);
                i3 += b;
                while (i3 >= 8) {
                    i3 -= 8;
                    f99Var2.V((int) (j >> i3));
                }
            }
            if (i3 > 0) {
                f99Var2.V((int) ((j << (8 - i3)) | (255 >>> i3)));
            }
            qg9 qg9VarQ0 = f99Var2.q0(f99Var2.b);
            e(qg9VarQ0.e(), 127, 128);
            f99Var.T(qg9VarQ0);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0069  */
        public final void d(ArrayList arrayList) {
            int length;
            int length2;
            if (this.c) {
                int i = this.b;
                if (i < this.d) {
                    e(i, 31, 32);
                }
                this.c = false;
                this.b = Integer.MAX_VALUE;
                e(this.d, 31, 32);
            }
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                Header header = (Header) arrayList.get(i2);
                qg9 qg9VarV = header.f46181a.v();
                qg9 qg9Var = header.b;
                Integer num = (Integer) Hpack.b.get(qg9VarV);
                if (num != null) {
                    int iIntValue = num.intValue();
                    length2 = iIntValue + 1;
                    if (2 > length2 || length2 >= 8) {
                        length = length2;
                        length2 = -1;
                    } else {
                        Header[] headerArr = Hpack.f46182a;
                        if (Intrinsics.d(headerArr[iIntValue].b, qg9Var)) {
                            length = length2;
                        } else if (Intrinsics.d(headerArr[length2].b, qg9Var)) {
                            length2 = iIntValue + 2;
                            length = length2;
                        } else {
                            length = length2;
                            length2 = -1;
                        }
                    }
                } else {
                    length = -1;
                    length2 = -1;
                }
                if (length2 == -1) {
                    int length3 = this.e.length;
                    for (int i3 = this.f + 1; i3 < length3; i3++) {
                        Header header2 = this.e[i3];
                        header2.getClass();
                        if (Intrinsics.d(header2.f46181a, qg9VarV)) {
                            Header header3 = this.e[i3];
                            header3.getClass();
                            if (Intrinsics.d(header3.b, qg9Var)) {
                                length2 = Hpack.f46182a.length + (i3 - this.f);
                                break;
                            } else if (length == -1) {
                                length = (i3 - this.f) + Hpack.f46182a.length;
                            }
                        }
                    }
                }
                if (length2 != -1) {
                    e(length2, 127, 128);
                } else if (length == -1) {
                    this.f46184a.V(64);
                    c(qg9VarV);
                    c(qg9Var);
                    b(header);
                } else {
                    qg9 qg9Var2 = Header.d;
                    qg9VarV.getClass();
                    qg9Var2.getClass();
                    if (!qg9VarV.o(0, qg9Var2, qg9Var2.e()) || Intrinsics.d(Header.i, qg9VarV)) {
                        e(length, 63, 64);
                        c(qg9Var);
                        b(header);
                    } else {
                        e(length, 15, 0);
                        c(qg9Var);
                    }
                }
            }
        }

        public final void e(int i, int i2, int i3) {
            f99 f99Var = this.f46184a;
            if (i < i2) {
                f99Var.V(i | i3);
                return;
            }
            f99Var.V(i3 | i2);
            int i4 = i - i2;
            while (i4 >= 128) {
                f99Var.V(128 | (i4 & 127));
                i4 >>>= 7;
            }
            f99Var.V(i4);
        }
    }

    static {
        Header header = new Header(Header.i, "");
        qg9 qg9Var = Header.f;
        Header header2 = new Header(qg9Var, "GET");
        Header header3 = new Header(qg9Var, "POST");
        qg9 qg9Var2 = Header.g;
        Header header4 = new Header(qg9Var2, Separators.SLASH);
        Header header5 = new Header(qg9Var2, "/index.html");
        qg9 qg9Var3 = Header.h;
        Header header6 = new Header(qg9Var3, "http");
        Header header7 = new Header(qg9Var3, "https");
        qg9 qg9Var4 = Header.e;
        Header[] headerArr = {header, header2, header3, header4, header5, header6, header7, new Header(qg9Var4, "200"), new Header(qg9Var4, "204"), new Header(qg9Var4, "206"), new Header(qg9Var4, "304"), new Header(qg9Var4, "400"), new Header(qg9Var4, "404"), new Header(qg9Var4, "500"), new Header("accept-charset", ""), new Header("accept-encoding", "gzip, deflate"), new Header("accept-language", ""), new Header("accept-ranges", ""), new Header("accept", ""), new Header("access-control-allow-origin", ""), new Header("age", ""), new Header("allow", ""), new Header("authorization", ""), new Header("cache-control", ""), new Header("content-disposition", ""), new Header("content-encoding", ""), new Header("content-language", ""), new Header("content-length", ""), new Header("content-location", ""), new Header("content-range", ""), new Header("content-type", ""), new Header(ParameterNames.COOKIE, ""), new Header("date", ""), new Header("etag", ""), new Header("expect", ""), new Header("expires", ""), new Header(RemoteMessageConst.FROM, ""), new Header("host", ""), new Header("if-match", ""), new Header("if-modified-since", ""), new Header("if-none-match", ""), new Header("if-range", ""), new Header("if-unmodified-since", ""), new Header("last-modified", ""), new Header("link", ""), new Header("location", ""), new Header("max-forwards", ""), new Header("proxy-authenticate", ""), new Header("proxy-authorization", ""), new Header("range", ""), new Header("referer", ""), new Header("refresh", ""), new Header("retry-after", ""), new Header("server", ""), new Header("set-cookie", ""), new Header("strict-transport-security", ""), new Header("transfer-encoding", ""), new Header("user-agent", ""), new Header("vary", ""), new Header("via", ""), new Header("www-authenticate", "")};
        f46182a = headerArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61, 1.0f);
        for (int i = 0; i < 61; i++) {
            if (!linkedHashMap.containsKey(headerArr[i].f46181a)) {
                linkedHashMap.put(headerArr[i].f46181a, Integer.valueOf(i));
            }
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        mapUnmodifiableMap.getClass();
        b = mapUnmodifiableMap;
    }

    public static void a(qg9 qg9Var) throws IOException {
        qg9Var.getClass();
        int iE = qg9Var.e();
        for (int i = 0; i < iE; i++) {
            byte bL = qg9Var.l(i);
            if (65 <= bL && bL < 91) {
                ohq.l("PROTOCOL_ERROR response malformed: mixed case name: ".concat(qg9Var.x()));
                return;
            }
        }
    }
}
