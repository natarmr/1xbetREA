package a;

import android.util.Base64;
import android.util.JsonReader;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.io.IOException;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class v9f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g2v f37032a;

    static {
        hcy hcyVar = new hcy();
        my4 my4Var = my4.f22587a;
        hcyVar.a(r9f.class, my4Var);
        hcyVar.a(w15.class, my4Var);
        uy4 uy4Var = uy4.f36471a;
        hcyVar.a(q9f.class, uy4Var);
        hcyVar.a(h25.class, uy4Var);
        ry4 ry4Var = ry4.f31294a;
        hcyVar.a(y8f.class, ry4Var);
        hcyVar.a(i25.class, ry4Var);
        sy4 sy4Var = sy4.f33008a;
        hcyVar.a(x8f.class, sy4Var);
        hcyVar.a(j25.class, sy4Var);
        kz4 kz4Var = kz4.f19137a;
        hcyVar.a(p9f.class, kz4Var);
        hcyVar.a(h35.class, kz4Var);
        jz4 jz4Var = jz4.f17392a;
        hcyVar.a(o9f.class, jz4Var);
        hcyVar.a(g35.class, jz4Var);
        ty4 ty4Var = ty4.f34734a;
        hcyVar.a(z8f.class, ty4Var);
        hcyVar.a(l25.class, ty4Var);
        ez4 ez4Var = ez4.f8656a;
        hcyVar.a(n9f.class, ez4Var);
        hcyVar.a(n25.class, ez4Var);
        vy4 vy4Var = vy4.f38231a;
        hcyVar.a(h9f.class, vy4Var);
        hcyVar.a(p25.class, vy4Var);
        xy4 xy4Var = xy4.f41689a;
        hcyVar.a(f9f.class, xy4Var);
        hcyVar.a(q25.class, xy4Var);
        az4 az4Var = az4.f1699a;
        hcyVar.a(e9f.class, az4Var);
        hcyVar.a(u25.class, az4Var);
        bz4 bz4Var = bz4.f3447a;
        hcyVar.a(d9f.class, bz4Var);
        hcyVar.a(w25.class, bz4Var);
        yy4 yy4Var = yy4.f43450a;
        hcyVar.a(b9f.class, yy4Var);
        hcyVar.a(s25.class, yy4Var);
        ky4 ky4Var = ky4.f19089a;
        hcyVar.a(r8f.class, ky4Var);
        hcyVar.a(z15.class, ky4Var);
        jy4 jy4Var = jy4.f17341a;
        hcyVar.a(q8f.class, jy4Var);
        hcyVar.a(a25.class, jy4Var);
        py4 py4Var = py4.f27788a;
        hcyVar.a(w8f.class, py4Var);
        hcyVar.a(e25.class, py4Var);
        qy4 qy4Var = qy4.f29516a;
        hcyVar.a(v8f.class, qy4Var);
        hcyVar.a(f25.class, qy4Var);
        zy4 zy4Var = zy4.f45187a;
        hcyVar.a(c9f.class, zy4Var);
        hcyVar.a(t25.class, zy4Var);
        wy4 wy4Var = wy4.f39959a;
        hcyVar.a(a9f.class, wy4Var);
        hcyVar.a(r25.class, wy4Var);
        ly4 ly4Var = ly4.f20848a;
        hcyVar.a(s8f.class, ly4Var);
        hcyVar.a(b25.class, ly4Var);
        cz4 cz4Var = cz4.f5208a;
        hcyVar.a(g9f.class, cz4Var);
        hcyVar.a(x25.class, cz4Var);
        dz4 dz4Var = dz4.f6923a;
        hcyVar.a(i9f.class, dz4Var);
        hcyVar.a(z25.class, dz4Var);
        fz4 fz4Var = fz4.f10392a;
        hcyVar.a(j9f.class, fz4Var);
        hcyVar.a(a35.class, fz4Var);
        iz4 iz4Var = iz4.f15619a;
        hcyVar.a(m9f.class, iz4Var);
        hcyVar.a(e35.class, iz4Var);
        gz4 gz4Var = gz4.f12162a;
        hcyVar.a(l9f.class, gz4Var);
        hcyVar.a(c35.class, gz4Var);
        hz4 hz4Var = hz4.f13890a;
        hcyVar.a(k9f.class, hz4Var);
        hcyVar.a(d35.class, hz4Var);
        ny4 ny4Var = ny4.f24312a;
        hcyVar.a(u8f.class, ny4Var);
        hcyVar.a(c25.class, ny4Var);
        oy4 oy4Var = oy4.f26044a;
        hcyVar.a(t8f.class, oy4Var);
        hcyVar.a(d25.class, oy4Var);
        hcyVar.d = true;
        f37032a = new g2v(hcyVar);
    }

    public static z15 a(JsonReader jsonReader) throws IOException {
        y15 y15Var = new y15();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "buildIdMappingForArch":
                    y15Var.i = b(jsonReader, new c99((byte) 27));
                    break;
                case "pid":
                    y15Var.f41838a = jsonReader.nextInt();
                    y15Var.j = (byte) (y15Var.j | 1);
                    break;
                case "pss":
                    y15Var.e = jsonReader.nextLong();
                    y15Var.j = (byte) (y15Var.j | 8);
                    break;
                case "rss":
                    y15Var.f = jsonReader.nextLong();
                    y15Var.j = (byte) (y15Var.j | 16);
                    break;
                case "timestamp":
                    y15Var.g = jsonReader.nextLong();
                    y15Var.j = (byte) (y15Var.j | 32);
                    break;
                case "processName":
                    String strNextString = jsonReader.nextString();
                    if (strNextString == null) {
                        hny.u("Null processName");
                        return null;
                    }
                    y15Var.b = strNextString;
                    break;
                    break;
                case "reasonCode":
                    y15Var.c = jsonReader.nextInt();
                    y15Var.j = (byte) (y15Var.j | 2);
                    break;
                case "traceFile":
                    y15Var.h = jsonReader.nextString();
                    break;
                case "importance":
                    y15Var.d = jsonReader.nextInt();
                    y15Var.j = (byte) (y15Var.j | 4);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return y15Var.a();
    }

    public static List b(JsonReader jsonReader, u9f u9fVar) {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(u9fVar.a(jsonReader));
        }
        jsonReader.endArray();
        return Collections.unmodifiableList(arrayList);
    }

    public static b25 c(JsonReader jsonReader) throws IOException {
        jsonReader.beginObject();
        String strNextString = null;
        String strNextString2 = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (strNextName.equals("key")) {
                strNextString = jsonReader.nextString();
                if (strNextString == null) {
                    hny.u("Null key");
                    return null;
                }
            } else if (strNextName.equals("value")) {
                strNextString2 = jsonReader.nextString();
                if (strNextString2 == null) {
                    hny.u("Null value");
                    return null;
                }
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        if (strNextString != null && strNextString2 != null) {
            return new b25(strNextString, strNextString2);
        }
        StringBuilder sb = new StringBuilder();
        if (strNextString == null) {
            sb.append(" key");
        }
        if (strNextString2 == null) {
            sb.append(" value");
        }
        jf4.n(vqd.o("Missing required properties:", sb));
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:111:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:162:0x025e  */
    /* JADX WARN: Code duplicated, block: B:247:0x03d2  */
    /* JADX WARN: Code duplicated, block: B:62:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:7:0x0020  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r22v0 */
    /* JADX WARN: Type inference failed for: r22v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r22v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r22v3 */
    /* JADX WARN: Type inference failed for: r23v0 */
    /* JADX WARN: Type inference failed for: r23v1, types: [a.b9f] */
    /* JADX WARN: Type inference failed for: r23v3 */
    /* JADX WARN: Type inference failed for: r23v4 */
    /* JADX WARN: Type inference failed for: r23v5 */
    /* JADX WARN: Type inference failed for: r23v6 */
    /* JADX WARN: Type inference failed for: r23v7 */
    /* JADX WARN: Type inference failed for: r23v8 */
    /* JADX WARN: Type inference failed for: r24v0 */
    /* JADX WARN: Type inference failed for: r24v1, types: [a.r8f] */
    /* JADX WARN: Type inference failed for: r24v2, types: [a.z15] */
    /* JADX WARN: Type inference failed for: r24v3 */
    /* JADX WARN: Type inference failed for: r25v0 */
    /* JADX WARN: Type inference failed for: r25v1, types: [a.w8f] */
    /* JADX WARN: Type inference failed for: r25v3 */
    /* JADX WARN: Type inference failed for: r25v4 */
    /* JADX WARN: Type inference failed for: r25v5 */
    /* JADX WARN: Type inference failed for: r25v6 */
    /* JADX WARN: Type inference failed for: r25v7 */
    /* JADX WARN: Type inference failed for: r25v8 */
    /* JADX WARN: Type inference failed for: r26v0 */
    /* JADX WARN: Type inference failed for: r26v1, types: [a.t25] */
    /* JADX WARN: Type inference failed for: r26v2 */
    /* JADX WARN: Type inference failed for: r26v3 */
    /* JADX WARN: Type inference failed for: r27v0 */
    /* JADX WARN: Type inference failed for: r27v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r27v3 */
    /* JADX WARN: Type inference failed for: r27v4 */
    /* JADX WARN: Type inference failed for: r27v5 */
    /* JADX WARN: Type inference failed for: r27v6 */
    /* JADX WARN: Type inference failed for: r27v7 */
    /* JADX WARN: Type inference failed for: r27v8 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v3 */
    public static n25 d(JsonReader jsonReader) throws IOException {
        byte b;
        m25 m25Var = new m25();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "device":
                    b = 0;
                    break;
                case "rollouts":
                    b = 1;
                    break;
                case "app":
                    b = 2;
                    break;
                case "log":
                    b = 3;
                    break;
                case "type":
                    b = 4;
                    break;
                case "timestamp":
                    b = 5;
                    break;
                default:
                    b = -1;
                    break;
            }
            n25 n25Var = null;
            switch (b) {
                case 0:
                    y25 y25Var = new y25();
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String strNextName2 = jsonReader.nextName();
                        strNextName2.getClass();
                        switch (strNextName2) {
                            case "batteryLevel":
                                y25Var.f41889a = Double.valueOf(jsonReader.nextDouble());
                                break;
                            case "batteryVelocity":
                                y25Var.b = jsonReader.nextInt();
                                y25Var.g = (byte) (y25Var.g | 1);
                                break;
                            case "orientation":
                                y25Var.d = jsonReader.nextInt();
                                y25Var.g = (byte) (y25Var.g | 4);
                                break;
                            case "diskUsed":
                                y25Var.f = jsonReader.nextLong();
                                y25Var.g = (byte) (y25Var.g | 16);
                                break;
                            case "ramUsed":
                                y25Var.e = jsonReader.nextLong();
                                y25Var.g = (byte) (y25Var.g | 8);
                                break;
                            case "proximityOn":
                                y25Var.c = jsonReader.nextBoolean();
                                y25Var.g = (byte) (y25Var.g | 2);
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    m25Var.d = y25Var.a();
                    break;
                case 1:
                    jsonReader.beginObject();
                    List listB = null;
                    while (jsonReader.hasNext()) {
                        String strNextName3 = jsonReader.nextName();
                        strNextName3.getClass();
                        if (strNextName3.equals("assignments")) {
                            listB = b(jsonReader, new c99((byte) 29));
                            if (listB == null) {
                                hny.u("Null rolloutAssignments");
                                return null;
                            }
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    if (listB == null) {
                        jf4.n("Missing required properties: rolloutAssignments");
                        return null;
                    }
                    m25Var.f = new e35(listB);
                    break;
                    break;
                case 2:
                    jsonReader.beginObject();
                    q25 q25Var = null;
                    List listUnmodifiableList = null;
                    List listUnmodifiableList2 = null;
                    Boolean boolValueOf = null;
                    x25 x25VarG = null;
                    List listUnmodifiableList3 = null;
                    boolean z = false;
                    int iNextInt = 0;
                    while (true) {
                        n25 n25Var2 = n25Var;
                        if (!jsonReader.hasNext()) {
                            jsonReader.endObject();
                            if (z && q25Var != null) {
                                m25Var.c = new p25(q25Var, listUnmodifiableList, listUnmodifiableList2, boolValueOf, x25VarG, listUnmodifiableList3, iNextInt);
                                break;
                            }
                            StringBuilder sb = new StringBuilder();
                            if (q25Var == null) {
                                sb.append(" execution");
                            }
                            if (!z) {
                                sb.append(" uiOrientation");
                            }
                            jf4.n(vqd.o("Missing required properties:", sb));
                            return n25Var2;
                        }
                        String strNextName4 = jsonReader.nextName();
                        strNextName4.getClass();
                        switch (strNextName4) {
                            case "appProcessDetails":
                                ArrayList arrayList = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList.add(g(jsonReader));
                                }
                                jsonReader.endArray();
                                listUnmodifiableList3 = Collections.unmodifiableList(arrayList);
                                n25Var = n25Var2;
                                break;
                            case "background":
                                boolValueOf = Boolean.valueOf(jsonReader.nextBoolean());
                                n25Var = n25Var2;
                                break;
                            case "execution":
                                jsonReader.beginObject();
                                ?? B = n25Var2;
                                ?? E = B;
                                ?? A = E;
                                ?? H = A;
                                ?? t25Var = H;
                                ?? r27 = t25Var;
                                while (jsonReader.hasNext()) {
                                    String strNextName5 = jsonReader.nextName();
                                    strNextName5.getClass();
                                    switch (strNextName5) {
                                        case "appExitInfo":
                                            A = a(jsonReader);
                                            break;
                                        case "threads":
                                            B = b(jsonReader, new t9f((byte) 0));
                                            break;
                                        case "signal":
                                            jsonReader.beginObject();
                                            long jNextLong = 0;
                                            byte b2 = 0;
                                            ?? NextString = n25Var2;
                                            ?? NextString2 = NextString;
                                            while (jsonReader.hasNext()) {
                                                String strNextName6 = jsonReader.nextName();
                                                strNextName6.getClass();
                                                switch (strNextName6) {
                                                    case "address":
                                                        b2 = (byte) (b2 | 1);
                                                        jNextLong = jsonReader.nextLong();
                                                        break;
                                                    case "code":
                                                        NextString2 = jsonReader.nextString();
                                                        if (NextString2 == 0) {
                                                            hny.u("Null code");
                                                            return n25Var2;
                                                        }
                                                        break;
                                                        break;
                                                    case "name":
                                                        NextString = jsonReader.nextString();
                                                        if (NextString == 0) {
                                                            hny.u("Null name");
                                                            return n25Var2;
                                                        }
                                                        break;
                                                        break;
                                                    default:
                                                        jsonReader.skipValue();
                                                        break;
                                                }
                                            }
                                            jsonReader.endObject();
                                            if (b2 == 1 && NextString != 0 && NextString2 != 0) {
                                                t25Var = new t25(NextString, NextString2, jNextLong);
                                                break;
                                            } else {
                                                StringBuilder sb2 = new StringBuilder();
                                                if (NextString == 0) {
                                                    sb2.append(" name");
                                                }
                                                if (NextString2 == 0) {
                                                    sb2.append(" code");
                                                }
                                                if ((b2 & 1) == 0) {
                                                    sb2.append(" address");
                                                }
                                                jf4.n(vqd.o("Missing required properties:", sb2));
                                                return n25Var2;
                                            }
                                            break;
                                        case "binaries":
                                            List listB2 = b(jsonReader, new t9f((byte) 1));
                                            E = E;
                                            H = H;
                                            r27 = listB2;
                                            if (listB2 == null) {
                                                hny.u("Null binaries");
                                                return n25Var2;
                                            }
                                            break;
                                        case "profilingManagerInfo":
                                            E = E;
                                            H = h(jsonReader);
                                            r27 = r27;
                                            break;
                                        case "exception":
                                            E = e(jsonReader);
                                            H = H;
                                            r27 = r27;
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            E = E;
                                            H = H;
                                            r27 = r27;
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                if (t25Var != 0 && r27 != 0) {
                                    q25Var = new q25(B, E, A, H, t25Var, r27);
                                    n25Var = n25Var2;
                                    break;
                                } else {
                                    StringBuilder sb3 = new StringBuilder();
                                    if (t25Var == 0) {
                                        sb3.append(" signal");
                                    }
                                    if (r27 == 0) {
                                        sb3.append(" binaries");
                                    }
                                    jf4.n(vqd.o("Missing required properties:", sb3));
                                    return n25Var2;
                                }
                                break;
                            case "internalKeys":
                                ArrayList arrayList2 = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList2.add(c(jsonReader));
                                }
                                jsonReader.endArray();
                                listUnmodifiableList2 = Collections.unmodifiableList(arrayList2);
                                n25Var = n25Var2;
                                break;
                            case "customAttributes":
                                ArrayList arrayList3 = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList3.add(c(jsonReader));
                                }
                                jsonReader.endArray();
                                listUnmodifiableList = Collections.unmodifiableList(arrayList3);
                                n25Var = n25Var2;
                                break;
                            case "uiOrientation":
                                iNextInt = jsonReader.nextInt();
                                z = true;
                                n25Var = n25Var2;
                                break;
                            case "currentProcessDetails":
                                x25VarG = g(jsonReader);
                                n25Var = n25Var2;
                                break;
                            default:
                                jsonReader.skipValue();
                                n25Var = n25Var2;
                                break;
                        }
                    }
                    break;
                case 3:
                    jsonReader.beginObject();
                    String strNextString = null;
                    while (jsonReader.hasNext()) {
                        if (jsonReader.nextName().equals(RemoteMessageConst.Notification.CONTENT)) {
                            strNextString = jsonReader.nextString();
                            if (strNextString == null) {
                                hny.u("Null content");
                                return null;
                            }
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    if (strNextString == null) {
                        jf4.n("Missing required properties: content");
                        return null;
                    }
                    m25Var.e = new a35(strNextString);
                    break;
                    break;
                case 4:
                    String strNextString2 = jsonReader.nextString();
                    if (strNextString2 == null) {
                        hny.u("Null type");
                        return null;
                    }
                    m25Var.b = strNextString2;
                    break;
                    break;
                case 5:
                    m25Var.f21039a = jsonReader.nextLong();
                    m25Var.g = (byte) (m25Var.g | 1);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return m25Var.a();
    }

    public static s25 e(JsonReader jsonReader) throws IOException {
        jsonReader.beginObject();
        byte b = 0;
        int iNextInt = 0;
        String strNextString = null;
        String strNextString2 = null;
        List listB = null;
        s25 s25VarE = null;
        while (true) {
            if (!jsonReader.hasNext()) {
                jsonReader.endObject();
                if (b == 1 && strNextString != null && listB != null) {
                    return new s25(strNextString, strNextString2, listB, s25VarE, iNextInt);
                }
                StringBuilder sb = new StringBuilder();
                if (strNextString == null) {
                    sb.append(" type");
                }
                if (listB == null) {
                    sb.append(" frames");
                }
                if ((b & 1) == 0) {
                    sb.append(" overflowCount");
                }
                jf4.n(vqd.o("Missing required properties:", sb));
                return null;
            }
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "frames":
                    listB = b(jsonReader, new t9f((byte) 2));
                    if (listB == null) {
                        hny.u("Null frames");
                        return null;
                    }
                    break;
                    break;
                case "reason":
                    strNextString2 = jsonReader.nextString();
                    break;
                case "type":
                    strNextString = jsonReader.nextString();
                    if (strNextString == null) {
                        hny.u("Null type");
                        return null;
                    }
                    break;
                    break;
                case "causedBy":
                    s25VarE = e(jsonReader);
                    break;
                case "overflowCount":
                    iNextInt = jsonReader.nextInt();
                    b = (byte) (b | 1);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
    }

    public static w25 f(JsonReader jsonReader) throws IOException {
        v25 v25Var = new v25();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "offset":
                    v25Var.d = jsonReader.nextLong();
                    v25Var.f = (byte) (v25Var.f | 2);
                    break;
                case "symbol":
                    String strNextString = jsonReader.nextString();
                    if (strNextString == null) {
                        hny.u("Null symbol");
                        return null;
                    }
                    v25Var.b = strNextString;
                    break;
                    break;
                case "pc":
                    v25Var.f36667a = jsonReader.nextLong();
                    v25Var.f = (byte) (v25Var.f | 1);
                    break;
                case "file":
                    v25Var.c = jsonReader.nextString();
                    break;
                case "importance":
                    v25Var.e = jsonReader.nextInt();
                    v25Var.f = (byte) (v25Var.f | 4);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return v25Var.a();
    }

    public static x25 g(JsonReader jsonReader) throws IOException {
        kjv kjvVar = new kjv();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "pid":
                    kjvVar.f18405a = jsonReader.nextInt();
                    kjvVar.d = (byte) (kjvVar.d | 1);
                    break;
                case "processName":
                    String strNextString = jsonReader.nextString();
                    if (strNextString == null) {
                        hny.u("Null processName");
                        return null;
                    }
                    kjvVar.e = strNextString;
                    break;
                    break;
                case "defaultProcess":
                    kjvVar.c = jsonReader.nextBoolean();
                    kjvVar.d = (byte) (kjvVar.d | 4);
                    break;
                case "importance":
                    kjvVar.b = jsonReader.nextInt();
                    kjvVar.d = (byte) (kjvVar.d | 2);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return kjvVar.a();
    }

    public static e25 h(JsonReader jsonReader) throws IOException {
        jsonReader.beginObject();
        f25 f25Var = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (strNextName.equals("profilingTrigger")) {
                jsonReader.beginObject();
                boolean z = false;
                int iNextInt = 0;
                while (jsonReader.hasNext()) {
                    String strNextName2 = jsonReader.nextName();
                    strNextName2.getClass();
                    if (strNextName2.equals("trigger")) {
                        iNextInt = jsonReader.nextInt();
                        z = true;
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
                if (!z) {
                    jf4.n("Missing required properties: trigger");
                    return null;
                }
                f25Var = new f25(iNextInt);
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        if (f25Var != null) {
            return new e25(f25Var);
        }
        jf4.n("Missing required properties: profilingTrigger");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:170:0x0256  */
    public static w15 i(JsonReader jsonReader) throws IOException {
        byte b;
        Charset charset = r9f.f30077a;
        v15 v15Var = new v15();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "ndkPayload":
                    jsonReader.beginObject();
                    List listB = null;
                    String strNextString = null;
                    while (jsonReader.hasNext()) {
                        String strNextName2 = jsonReader.nextName();
                        strNextName2.getClass();
                        if (strNextName2.equals("files")) {
                            listB = b(jsonReader, new c99((byte) 28));
                            if (listB == null) {
                                hny.u("Null files");
                                return null;
                            }
                        } else if (strNextName2.equals("orgId")) {
                            strNextString = jsonReader.nextString();
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    if (listB == null) {
                        jf4.n("Missing required properties: files");
                        return null;
                    }
                    v15Var.k = new c25(listB, strNextString);
                    continue;
                    break;
                    break;
                case "sdkVersion":
                    String strNextString2 = jsonReader.nextString();
                    if (strNextString2 == null) {
                        hny.u("Null sdkVersion");
                        return null;
                    }
                    v15Var.f36612a = strNextString2;
                    break;
                    break;
                case "appQualitySessionId":
                    v15Var.g = jsonReader.nextString();
                    break;
                case "appExitInfo":
                    v15Var.l = a(jsonReader);
                    break;
                case "buildVersion":
                    String strNextString3 = jsonReader.nextString();
                    if (strNextString3 == null) {
                        hny.u("Null buildVersion");
                        return null;
                    }
                    v15Var.h = strNextString3;
                    break;
                    break;
                case "firebaseAuthenticationToken":
                    v15Var.f = jsonReader.nextString();
                    break;
                case "gmpAppId":
                    String strNextString4 = jsonReader.nextString();
                    if (strNextString4 == null) {
                        hny.u("Null gmpAppId");
                        return null;
                    }
                    v15Var.b = strNextString4;
                    break;
                    break;
                case "installationUuid":
                    String strNextString5 = jsonReader.nextString();
                    if (strNextString5 == null) {
                        hny.u("Null installationUuid");
                        return null;
                    }
                    v15Var.d = strNextString5;
                    break;
                    break;
                case "firebaseInstallationId":
                    v15Var.e = jsonReader.nextString();
                    break;
                case "platform":
                    v15Var.c = jsonReader.nextInt();
                    v15Var.m = (byte) (v15Var.m | 1);
                    break;
                case "displayVersion":
                    String strNextString6 = jsonReader.nextString();
                    if (strNextString6 == null) {
                        hny.u("Null displayVersion");
                        return null;
                    }
                    v15Var.i = strNextString6;
                    break;
                    break;
                case "session":
                    g25 g25Var = new g25();
                    g25Var.f = false;
                    g25Var.m = (byte) (g25Var.m | 2);
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String strNextName3 = jsonReader.nextName();
                        strNextName3.getClass();
                        switch (strNextName3) {
                            case "startedAt":
                                g25Var.d = jsonReader.nextLong();
                                g25Var.m = (byte) (g25Var.m | 1);
                                break;
                            case "appQualitySessionId":
                                g25Var.c = jsonReader.nextString();
                                break;
                            case "identifier":
                                g25Var.b = new String(Base64.decode(jsonReader.nextString(), 2), r9f.f30077a);
                                break;
                            case "endedAt":
                                g25Var.e = Long.valueOf(jsonReader.nextLong());
                                break;
                            case "device":
                                k25 k25Var = new k25();
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String strNextName4 = jsonReader.nextName();
                                    strNextName4.getClass();
                                    switch (strNextName4) {
                                        case "simulator":
                                            k25Var.f = jsonReader.nextBoolean();
                                            k25Var.j = (byte) (k25Var.j | 16);
                                            break;
                                        case "manufacturer":
                                            String strNextString7 = jsonReader.nextString();
                                            if (strNextString7 == null) {
                                                hny.u("Null manufacturer");
                                                return null;
                                            }
                                            k25Var.h = strNextString7;
                                            break;
                                            break;
                                        case "ram":
                                            k25Var.d = jsonReader.nextLong();
                                            k25Var.j = (byte) (k25Var.j | 4);
                                            break;
                                        case "arch":
                                            k25Var.f17558a = jsonReader.nextInt();
                                            k25Var.j = (byte) (k25Var.j | 1);
                                            break;
                                        case "diskSpace":
                                            k25Var.e = jsonReader.nextLong();
                                            k25Var.j = (byte) (k25Var.j | 8);
                                            break;
                                        case "cores":
                                            k25Var.c = jsonReader.nextInt();
                                            k25Var.j = (byte) (k25Var.j | 2);
                                            break;
                                        case "model":
                                            String strNextString8 = jsonReader.nextString();
                                            if (strNextString8 == null) {
                                                hny.u("Null model");
                                                return null;
                                            }
                                            k25Var.b = strNextString8;
                                            break;
                                            break;
                                        case "state":
                                            k25Var.g = jsonReader.nextInt();
                                            k25Var.j = (byte) (k25Var.j | 32);
                                            break;
                                        case "modelClass":
                                            String strNextString9 = jsonReader.nextString();
                                            if (strNextString9 == null) {
                                                hny.u("Null modelClass");
                                                return null;
                                            }
                                            k25Var.i = strNextString9;
                                            break;
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                g25Var.j = k25Var.a();
                                break;
                            case "events":
                                ArrayList arrayList = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList.add(d(jsonReader));
                                }
                                jsonReader.endArray();
                                g25Var.k = Collections.unmodifiableList(arrayList);
                                break;
                            case "os":
                                f35 f35Var = new f35();
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String strNextName5 = jsonReader.nextName();
                                    strNextName5.getClass();
                                    switch (strNextName5) {
                                        case "buildVersion":
                                            String strNextString10 = jsonReader.nextString();
                                            if (strNextString10 == null) {
                                                hny.u("Null buildVersion");
                                                return null;
                                            }
                                            f35Var.c = strNextString10;
                                            break;
                                            break;
                                        case "jailbroken":
                                            f35Var.d = jsonReader.nextBoolean();
                                            f35Var.e = (byte) (f35Var.e | 2);
                                            break;
                                        case "version":
                                            String strNextString11 = jsonReader.nextString();
                                            if (strNextString11 == null) {
                                                hny.u("Null version");
                                                return null;
                                            }
                                            f35Var.b = strNextString11;
                                            break;
                                            break;
                                        case "platform":
                                            f35Var.f8844a = jsonReader.nextInt();
                                            f35Var.e = (byte) (f35Var.e | 1);
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                g25Var.i = f35Var.a();
                                break;
                            case "app":
                                jsonReader.beginObject();
                                String strNextString12 = null;
                                String strNextString13 = null;
                                String strNextString14 = null;
                                String strNextString15 = null;
                                String strNextString16 = null;
                                String strNextString17 = null;
                                while (jsonReader.hasNext()) {
                                    String strNextName6 = jsonReader.nextName();
                                    strNextName6.getClass();
                                    switch (strNextName6.hashCode()) {
                                        case -1618432855:
                                            if (!strNextName6.equals("identifier")) {
                                                b = -1;
                                            } else {
                                                b = 0;
                                            }
                                            break;
                                        case -519438642:
                                            if (!strNextName6.equals("developmentPlatform")) {
                                                b = -1;
                                            } else {
                                                b = 1;
                                            }
                                            break;
                                        case 213652010:
                                            if (!strNextName6.equals("developmentPlatformVersion")) {
                                                b = -1;
                                            } else {
                                                b = 2;
                                            }
                                            break;
                                        case 351608024:
                                            b = !strNextName6.equals("version") ? (byte) -1 : (byte) 3;
                                            break;
                                        case 719853845:
                                            b = !strNextName6.equals("installationUuid") ? (byte) -1 : (byte) 4;
                                            break;
                                        case 1975623094:
                                            b = !strNextName6.equals("displayVersion") ? (byte) -1 : (byte) 5;
                                            break;
                                        default:
                                            b = -1;
                                            break;
                                    }
                                    switch (b) {
                                        case 0:
                                            strNextString17 = jsonReader.nextString();
                                            if (strNextString17 == null) {
                                                hny.u("Null identifier");
                                                return null;
                                            }
                                            break;
                                            break;
                                        case 1:
                                            strNextString15 = jsonReader.nextString();
                                            break;
                                        case 2:
                                            strNextString16 = jsonReader.nextString();
                                            break;
                                        case 3:
                                            strNextString12 = jsonReader.nextString();
                                            if (strNextString12 == null) {
                                                hny.u("Null version");
                                                return null;
                                            }
                                            break;
                                            break;
                                        case 4:
                                            strNextString14 = jsonReader.nextString();
                                            break;
                                        case 5:
                                            strNextString13 = jsonReader.nextString();
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                if (strNextString17 != null && strNextString12 != null) {
                                    g25Var.g = new i25(strNextString17, strNextString12, strNextString13, strNextString14, strNextString15, strNextString16);
                                    break;
                                } else {
                                    StringBuilder sb = new StringBuilder();
                                    if (strNextString17 == null) {
                                        sb.append(" identifier");
                                    }
                                    if (strNextString12 == null) {
                                        sb.append(" version");
                                    }
                                    jf4.n(vqd.o("Missing required properties:", sb));
                                    return null;
                                }
                                break;
                            case "user":
                                jsonReader.beginObject();
                                String strNextString18 = null;
                                while (jsonReader.hasNext()) {
                                    if (jsonReader.nextName().equals("identifier")) {
                                        strNextString18 = jsonReader.nextString();
                                        if (strNextString18 == null) {
                                            hny.u("Null identifier");
                                            return null;
                                        }
                                    } else {
                                        jsonReader.skipValue();
                                    }
                                }
                                jsonReader.endObject();
                                if (strNextString18 == null) {
                                    jf4.n("Missing required properties: identifier");
                                    return null;
                                }
                                g25Var.h = new h35(strNextString18);
                                break;
                                break;
                            case "generator":
                                String strNextString19 = jsonReader.nextString();
                                if (strNextString19 == null) {
                                    hny.u("Null generator");
                                    return null;
                                }
                                g25Var.f10545a = strNextString19;
                                break;
                                break;
                            case "crashed":
                                g25Var.f = jsonReader.nextBoolean();
                                g25Var.m = (byte) (g25Var.m | 2);
                                break;
                            case "generatorType":
                                g25Var.l = jsonReader.nextInt();
                                g25Var.m = (byte) (g25Var.m | 4);
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    v15Var.j = g25Var.a();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return v15Var.a();
    }

    public static w15 j(String str) throws IOException {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            try {
                w15 w15VarI = i(jsonReader);
                jsonReader.close();
                return w15VarI;
            } catch (Throwable th) {
                try {
                    jsonReader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IllegalStateException e) {
            throw new IOException(e);
        }
    }
}
