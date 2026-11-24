package okhttp3.internal.dns;

import a.c99;
import a.e9d0;
import a.f99;
import a.iun;
import a.jrz;
import a.l1e0;
import a.o1t0;
import a.o710;
import a.p1t0;
import a.p2t0;
import a.q2t0;
import a.qg9;
import a.twn;
import a.u99;
import a.zae0;
import java.io.EOFException;
import java.net.InetAddress;
import java.net.ProtocolException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;
import kotlin.Metadata;
import okhttp3.Protocol;
import okhttp3.internal._UtilJvmKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/dns/DnsMessageReader;", "", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DnsMessageReader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f99 f46157a;
    public final u99 b;

    public DnsMessageReader(f99 f99Var) {
        this.f46157a = f99Var;
        this.b = f99Var.x();
    }

    public final DnsMessage a() throws ProtocolException, EOFException, UnknownHostException {
        u99 u99Var = this.b;
        short s = u99Var.readShort();
        short s2 = u99Var.readShort();
        short s3 = u99Var.readShort();
        p2t0 p2t0Var = q2t0.b;
        int i = s3 & 65535;
        int i2 = u99Var.readShort() & 65535;
        int i3 = u99Var.readShort() & 65535;
        int i4 = 65535 & u99Var.readShort();
        ArrayList arrayList = new ArrayList(i);
        for (int i5 = 0; i5 < i; i5++) {
            arrayList.add(new Question(b(u99Var), u99Var.readShort(), u99Var.readShort()));
        }
        ArrayList arrayList2 = new ArrayList(i2);
        for (int i6 = 0; i6 < i2; i6++) {
            ResourceRecord resourceRecordC = c(u99Var);
            if (resourceRecordC != null) {
                arrayList2.add(resourceRecordC);
            }
        }
        ArrayList arrayList3 = new ArrayList(i3);
        for (int i7 = 0; i7 < i3; i7++) {
            ResourceRecord resourceRecordC2 = c(u99Var);
            if (resourceRecordC2 != null) {
                arrayList3.add(resourceRecordC2);
            }
        }
        ArrayList arrayList4 = new ArrayList(i4);
        for (int i8 = 0; i8 < i4; i8++) {
            ResourceRecord resourceRecordC3 = c(u99Var);
            if (resourceRecordC3 != null) {
                arrayList4.add(resourceRecordC3);
            }
        }
        if (!u99Var.v0()) {
            e9d0.j("unexpected trailing data in message");
            return null;
        }
        TimeZone timeZone = _UtilJvmKt.f46122a;
        while (true) {
            f99 f99Var = this.f46157a;
            if (f99Var.v0()) {
                return new DnsMessage(s, s2, arrayList, arrayList2, arrayList3, arrayList4);
            }
            f99Var.skip(f99Var.b);
        }
    }

    public final String b(u99 u99Var) throws ProtocolException, EOFException {
        f99 f99Var = new f99();
        int i = Integer.MAX_VALUE;
        while (true) {
            byte b = u99Var.readByte();
            o1t0 o1t0Var = p1t0.b;
            int i2 = b & 192;
            int i3 = b & 63;
            if (i2 != 0) {
                if (i2 == 64 || i2 == 128) {
                    break;
                }
                if (i2 != 192) {
                    continue;
                } else {
                    int i4 = (u99Var.readByte() & 255) | (i3 << 8);
                    if (i4 >= i) {
                        e9d0.j("malformed DNS message");
                        return null;
                    }
                    zae0 zae0VarX = this.f46157a.x();
                    zae0VarX.skip(i4);
                    i = i4;
                    u99Var = zae0VarX;
                }
            } else {
                if (i3 == 0) {
                    return f99Var.O();
                }
                if (f99Var.b > 0) {
                    f99Var.V(46);
                }
                long j = i3;
                while (j > 0) {
                    long jY = u99Var.Y(f99Var, j);
                    if (jY == -1) {
                        c99.f();
                        return null;
                    }
                    j -= jY;
                }
            }
        }
        e9d0.j("unsupported label type");
        return null;
    }

    public final ResourceRecord c(u99 u99Var) throws ProtocolException, EOFException, UnknownHostException {
        String str;
        int i;
        zae0 zae0Var;
        String str2;
        int i2;
        long j;
        long j2;
        u99Var.getClass();
        String strB = b(u99Var);
        short s = u99Var.readShort();
        short s2 = u99Var.readShort();
        int i3 = u99Var.readInt();
        short s3 = u99Var.readShort();
        p2t0 p2t0Var = q2t0.b;
        long j3 = ((long) s3) & 65535;
        ResourceRecord resourceRecord = null;
        long j4 = 4;
        if (s2 == 1 && s == 1) {
            if (j3 != 4) {
                e9d0.j("unexpected record length");
                return null;
            }
            InetAddress byAddress = InetAddress.getByAddress(u99Var.N(4L));
            byAddress.getClass();
            return new ResourceRecord.IpAddress(strB, byAddress, i3);
        }
        long j5 = 16;
        if (s2 == 1 && s == 28) {
            if (j3 != 16) {
                e9d0.j("unexpected record length");
                return null;
            }
            InetAddress byAddress2 = InetAddress.getByAddress(u99Var.N(16L));
            byAddress2.getClass();
            return new ResourceRecord.IpAddress(strB, byAddress2, i3);
        }
        if (s2 != 1 || s != 65) {
            u99Var.skip(j3);
            return null;
        }
        boolean z = false;
        zae0 zae0Var2 = new zae0(new jrz(u99Var, j3, false));
        short s4 = zae0Var2.readShort();
        String strB2 = b(zae0Var2);
        int i4 = -1;
        int i5 = 443;
        int i6 = i3;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        qg9 qg9VarQ0 = null;
        while (!zae0Var2.v0()) {
            resourceRecord = resourceRecord;
            i4 = zae0Var2.readShort() & 65535;
            if (i4 <= i4) {
                e9d0.j("malformed HTTPS resource record");
                return resourceRecord;
            }
            long j6 = j4;
            long j7 = ((long) zae0Var2.readShort()) & 65535;
            long j8 = j5;
            long j9 = 0;
            switch (i4) {
                case 0:
                    str = strB;
                    i = i6;
                    if (j7 % 2 != 0) {
                        e9d0.j("malformed HTTPS / mandatory");
                        return resourceRecord;
                    }
                    o710 o710VarL = l1e0.l(l1e0.n(j7), 2L);
                    long j10 = o710VarL.f24763a;
                    long j11 = o710VarL.b;
                    long j12 = o710VarL.c;
                    if ((j12 > 0 && j10 <= j11) || (j12 < 0 && j11 <= j10)) {
                        while (true) {
                            int i7 = zae0Var2.readShort() & 65535;
                            if (i7 >= 0) {
                                zae0Var = zae0Var2;
                                if (i7 < 7) {
                                    if (j10 != j11) {
                                        j10 += j12;
                                        zae0Var2 = zae0Var;
                                    }
                                }
                            }
                            throw new ProtocolException(twn.m(i7, "unsupported HTTPS mandatory parameter "));
                        }
                    }
                    zae0Var = zae0Var2;
                    i6 = i;
                    zae0Var2 = zae0Var;
                    i4 = i4;
                    strB = str;
                    resourceRecord = resourceRecord;
                    j4 = 4;
                    j5 = 16;
                    break;
                    break;
                case 1:
                    str2 = strB;
                    i2 = i6;
                    j = j6;
                    arrayList = new ArrayList();
                    while (j9 < j7) {
                        byte b = zae0Var2.readByte();
                        o1t0 o1t0Var = p1t0.b;
                        long j13 = ((long) b) & 255;
                        j9 = j9 + 1 + j13;
                        if (j9 > j7) {
                            e9d0.j("malformed HTTPS / alpn");
                            return resourceRecord;
                        }
                        arrayList.add(zae0Var2.n(j13));
                    }
                    j4 = j;
                    strB = str2;
                    arrayList2 = arrayList2;
                    j5 = 16;
                    i6 = i2;
                    break;
                case 2:
                    String str3 = strB;
                    i2 = i6;
                    if (j7 != 0) {
                        e9d0.j("malformed HTTPS / no-default-alpn");
                        return resourceRecord;
                    }
                    j4 = j6;
                    strB = str3;
                    z = true;
                    arrayList2 = arrayList2;
                    j5 = 16;
                    i6 = i2;
                    break;
                    break;
                case 3:
                    str2 = strB;
                    i2 = i6;
                    j = j6;
                    if (j7 != 2) {
                        e9d0.j("malformed HTTPS / port");
                        return resourceRecord;
                    }
                    i5 = zae0Var2.readShort() & 65535;
                    j4 = j;
                    strB = str2;
                    arrayList2 = arrayList2;
                    j5 = 16;
                    i6 = i2;
                    break;
                    break;
                case 4:
                    str2 = strB;
                    i2 = i6;
                    arrayList2 = new ArrayList();
                    if (j7 % j6 != 0) {
                        e9d0.j("malformed HTTPS / ipv4hint");
                        return resourceRecord;
                    }
                    o710 o710VarL2 = l1e0.l(l1e0.n(j7), j6);
                    long j14 = o710VarL2.f24763a;
                    long j15 = o710VarL2.b;
                    long j16 = o710VarL2.c;
                    if ((j16 <= 0 || j14 > j15) && (j16 >= 0 || j15 > j14)) {
                        j = 4;
                    } else {
                        j = 4;
                        while (true) {
                            arrayList2.add(InetAddress.getByAddress(zae0Var2.N(4L)));
                            if (j14 != j15) {
                                j14 += j16;
                            }
                        }
                    }
                    j4 = j;
                    strB = str2;
                    arrayList2 = arrayList2;
                    j5 = 16;
                    i6 = i2;
                    break;
                    break;
                case 5:
                    j2 = j8;
                    qg9VarQ0 = zae0Var2.q0(j7);
                    arrayList2 = arrayList2;
                    resourceRecord = resourceRecord;
                    j4 = j6;
                    j5 = j2;
                    break;
                case 6:
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    if (j7 % j8 != 0) {
                        e9d0.j("malformed HTTPS / ipv6hint");
                        return resourceRecord;
                    }
                    o710 o710VarL3 = l1e0.l(l1e0.n(j7), j8);
                    long j17 = o710VarL3.f24763a;
                    long j18 = o710VarL3.b;
                    String str4 = strB;
                    int i8 = i6;
                    long j19 = o710VarL3.c;
                    if ((j19 <= 0 || j17 > j18) && (j19 >= 0 || j18 > j17)) {
                        j2 = 16;
                    } else {
                        j2 = 16;
                        while (true) {
                            arrayList2.add(InetAddress.getByAddress(zae0Var2.N(16L)));
                            if (j17 != j18) {
                                j17 += j19;
                            }
                        }
                    }
                    i6 = i8;
                    strB = str4;
                    arrayList2 = arrayList2;
                    resourceRecord = resourceRecord;
                    j4 = j6;
                    j5 = j2;
                    break;
                    break;
                default:
                    zae0Var2.skip(j7);
                    zae0Var = zae0Var2;
                    str = strB;
                    i = i6;
                    i6 = i;
                    zae0Var2 = zae0Var;
                    i4 = i4;
                    strB = str;
                    resourceRecord = resourceRecord;
                    j4 = 4;
                    j5 = 16;
                    break;
            }
        }
        String str5 = strB;
        int i9 = i6;
        ResourceRecord resourceRecord2 = resourceRecord;
        if (z) {
            if (arrayList == null) {
                e9d0.j("malformed HTTPS / no-default-alpn");
                return resourceRecord2;
            }
        } else if (arrayList != null) {
            Protocol.Companion companion = Protocol.b;
            if (!arrayList.contains("http/1.1")) {
                arrayList.add("http/1.1");
            }
        }
        int i10 = s4 & 65535;
        List list = arrayList2;
        if (arrayList2 == null) {
            list = iun.f15405a;
        }
        return new ResourceRecord.Https(str5, i9, i10, strB2, arrayList, i5, list, qg9VarQ0);
    }
}
