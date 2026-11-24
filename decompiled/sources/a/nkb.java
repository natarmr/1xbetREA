package a;

import android.content.Context;
import android.gov.nist.core.Separators;
import android.os.Build;
import android.view.View;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public abstract class nkb {
    public static final float A(long j, long j2) {
        return Math.min(Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)) / Float.intBitsToFloat((int) (j & 4294967295L)));
    }

    public static maj B(byte[] bArr) {
        bArr.getClass();
        if (bArr.length > 10240) {
            jf4.n("Data cannot occupy more than 10240 bytes when serialized");
            return null;
        }
        if (bArr.length == 0) {
            return maj.b;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            byte[] bArr2 = new byte[2];
            byteArrayInputStream.read(bArr2);
            int i = 0;
            boolean z = bArr2[0] == -84 && bArr2[1] == -19;
            byteArrayInputStream.reset();
            if (z) {
                ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                try {
                    int i2 = objectInputStream.readInt();
                    while (i < i2) {
                        linkedHashMap.put(objectInputStream.readUTF(), objectInputStream.readObject());
                        i++;
                    }
                    objectInputStream.close();
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        bkb.E(objectInputStream, th);
                        throw th2;
                    }
                }
            } else {
                DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);
                try {
                    short s = dataInputStream.readShort();
                    if (s == -21521) {
                        short s2 = dataInputStream.readShort();
                        if (s2 != 1) {
                            c99.v(twn.m(s2, "Unsupported version number: "));
                        }
                    } else {
                        c99.v(twn.m(s, "Magic number doesn't match: "));
                    }
                    int i3 = dataInputStream.readInt();
                    while (i < i3) {
                        linkedHashMap.put(dataInputStream.readUTF(), C(dataInputStream, dataInputStream.readByte()));
                        i++;
                    }
                    dataInputStream.close();
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        bkb.E(dataInputStream, th3);
                        throw th4;
                    }
                }
            }
        } catch (IOException e) {
            wv00.f().e(qcj.f28485a, "Error in Data#fromByteArray: ", e);
        } catch (ClassNotFoundException e2) {
            wv00.f().e(qcj.f28485a, "Error in Data#fromByteArray: ", e2);
        }
        return new maj(linkedHashMap);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.io.Serializable, java.lang.Double[]] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.io.Serializable, java.lang.Float[]] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.io.Serializable, java.lang.Long[]] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.io.Serializable, java.lang.Integer[]] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.io.Serializable, java.lang.Byte[]] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.io.Serializable, java.lang.Boolean[]] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.io.Serializable, java.lang.String[]] */
    public static final Serializable C(DataInputStream dataInputStream, byte b) throws IOException {
        if (b == 0) {
            return null;
        }
        if (b == 1) {
            return Boolean.valueOf(dataInputStream.readBoolean());
        }
        if (b == 2) {
            return Byte.valueOf(dataInputStream.readByte());
        }
        if (b == 3) {
            return Integer.valueOf(dataInputStream.readInt());
        }
        if (b == 4) {
            return Long.valueOf(dataInputStream.readLong());
        }
        if (b == 5) {
            return Float.valueOf(dataInputStream.readFloat());
        }
        if (b == 6) {
            return Double.valueOf(dataInputStream.readDouble());
        }
        if (b == 7) {
            return dataInputStream.readUTF();
        }
        int i = 0;
        if (b == 8) {
            int i2 = dataInputStream.readInt();
            ?? r0 = new Boolean[i2];
            while (i < i2) {
                r0[i] = Boolean.valueOf(dataInputStream.readBoolean());
                i++;
            }
            return r0;
        }
        if (b == 9) {
            int i3 = dataInputStream.readInt();
            ?? r1 = new Byte[i3];
            while (i < i3) {
                r1[i] = Byte.valueOf(dataInputStream.readByte());
                i++;
            }
            return r1;
        }
        if (b == 10) {
            int i4 = dataInputStream.readInt();
            ?? r2 = new Integer[i4];
            while (i < i4) {
                r2[i] = Integer.valueOf(dataInputStream.readInt());
                i++;
            }
            return r2;
        }
        if (b == 11) {
            int i5 = dataInputStream.readInt();
            ?? r3 = new Long[i5];
            while (i < i5) {
                r3[i] = Long.valueOf(dataInputStream.readLong());
                i++;
            }
            return r3;
        }
        if (b == 12) {
            int i6 = dataInputStream.readInt();
            ?? r4 = new Float[i6];
            while (i < i6) {
                r4[i] = Float.valueOf(dataInputStream.readFloat());
                i++;
            }
            return r4;
        }
        if (b == 13) {
            int i7 = dataInputStream.readInt();
            ?? r5 = new Double[i7];
            while (i < i7) {
                r5[i] = Double.valueOf(dataInputStream.readDouble());
                i++;
            }
            return r5;
        }
        if (b != 14) {
            jf4.n(twn.m(b, "Unsupported type "));
            return null;
        }
        int i8 = dataInputStream.readInt();
        ?? r6 = new String[i8];
        while (i < i8) {
            String utf = dataInputStream.readUTF();
            if (Intrinsics.d(utf, "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d")) {
                utf = null;
            }
            r6[i] = utf;
            i++;
        }
        return r6;
    }

    public static final lc00 D(List list) {
        boolean z;
        ArrayList arrayListU = twn.u(list);
        for (Object obj : list) {
            if (((z4l) obj).j.f == 0) {
                arrayListU.add(obj);
            }
        }
        boolean z2 = arrayListU.size() != 10;
        if (list.isEmpty()) {
            z = true;
        } else {
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    l1h l1hVar = ((z4l) it.next()).j;
                    if (l1hVar.d > 0 || l1hVar.e > 0) {
                        z = false;
                    }
                } else {
                    z = true;
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (((z4l) obj2).j.g == 0) {
                arrayList.add(obj2);
            }
        }
        boolean z3 = arrayList.size() != 10;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : list) {
            if (((z4l) obj3).j.h == 0) {
                arrayList2.add(obj3);
            }
        }
        boolean z4 = arrayList2.size() != 10;
        lc00 lc00VarB = kotlin.collections.a.b();
        if (z2) {
            lc00VarB.add(aal.TOTAL_VALUE);
        }
        if (!z) {
            lc00VarB.add(aal.CREEPS);
        }
        lc00VarB.add(aal.BUYBACK);
        if (z3) {
            lc00VarB.add(aal.GOLD);
        }
        if (z4) {
            lc00VarB.add(aal.EXPERIENCE);
        }
        return kotlin.collections.a.a(lc00VarB);
    }

    public static final boolean E(n3w n3wVar, s77 s77Var) {
        return ((s77Var == s77.TOTO || s77Var == s77.JACKPOT) && !q3d.j(e4f.e, e4f.f).contains(n3wVar.l)) || n3wVar.f.length() == 0;
    }

    public static final w0w F(Integer num) {
        if (num != null && num.intValue() == 0) {
            return w0w.b;
        }
        if (num != null && num.intValue() == 1) {
            return w0w.c;
        }
        return (num != null && num.intValue() == -1) ? w0w.e : w0w.f38369a;
    }

    public static final boolean G(Function0 function0, Function0 function1) {
        try {
            if (!((Boolean) function0.invoke()).booleanValue()) {
                return false;
            }
            function1.invoke();
            return true;
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    public static final vsg0 H(long j, i2o i2oVar, Function1 function1, Function0 function0, Function1 function2) {
        return new vsg0(new kqs(function2, function1, i2oVar, function0, j, null));
    }

    public static byte[] I(maj majVar) {
        majVar.getClass();
        HashMap map = majVar.f21460a;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            try {
                dataOutputStream.writeShort(-21521);
                dataOutputStream.writeShort(1);
                dataOutputStream.writeInt(map.size());
                for (Map.Entry entry : map.entrySet()) {
                    J(dataOutputStream, (String) entry.getKey(), entry.getValue());
                }
                dataOutputStream.flush();
                if (dataOutputStream.size() > 10240) {
                    throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
                }
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                dataOutputStream.close();
                byteArray.getClass();
                return byteArray;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    bkb.E(dataOutputStream, th);
                    throw th2;
                }
            }
        } catch (IOException e) {
            wv00.f().e(qcj.f28485a, "Error in Data#toByteArray: ", e);
            return new byte[0];
        }
    }

    public static final void J(DataOutputStream dataOutputStream, String str, Object obj) throws IOException {
        int i;
        if (obj == null) {
            dataOutputStream.writeByte(0);
        } else if (obj instanceof Boolean) {
            dataOutputStream.writeByte(1);
            dataOutputStream.writeBoolean(((Boolean) obj).booleanValue());
        } else if (obj instanceof Byte) {
            dataOutputStream.writeByte(2);
            dataOutputStream.writeByte(((Number) obj).byteValue());
        } else if (obj instanceof Integer) {
            dataOutputStream.writeByte(3);
            dataOutputStream.writeInt(((Number) obj).intValue());
        } else if (obj instanceof Long) {
            dataOutputStream.writeByte(4);
            dataOutputStream.writeLong(((Number) obj).longValue());
        } else if (obj instanceof Float) {
            dataOutputStream.writeByte(5);
            dataOutputStream.writeFloat(((Number) obj).floatValue());
        } else if (obj instanceof Double) {
            dataOutputStream.writeByte(6);
            dataOutputStream.writeDouble(((Number) obj).doubleValue());
        } else if (obj instanceof String) {
            dataOutputStream.writeByte(7);
            dataOutputStream.writeUTF((String) obj);
        } else {
            if (!(obj instanceof Object[])) {
                jf4.o(kng0.k("Unsupported value type ", sre0.f32672a.b(obj.getClass()).J()));
                return;
            }
            Object[] objArr = (Object[]) obj;
            Class<?> cls = objArr.getClass();
            tre0 tre0Var = sre0.f32672a;
            sgy sgyVarB = tre0Var.b(cls);
            if (sgyVarB.equals(tre0Var.b(Boolean[].class))) {
                i = 8;
            } else if (sgyVarB.equals(tre0Var.b(Byte[].class))) {
                i = 9;
            } else if (sgyVarB.equals(tre0Var.b(Integer[].class))) {
                i = 10;
            } else if (sgyVarB.equals(tre0Var.b(Long[].class))) {
                i = 11;
            } else if (sgyVarB.equals(tre0Var.b(Float[].class))) {
                i = 12;
            } else if (sgyVarB.equals(tre0Var.b(Double[].class))) {
                i = 13;
            } else {
                if (!sgyVarB.equals(tre0Var.b(String[].class))) {
                    jf4.o(kng0.k("Unsupported value type ", tre0Var.b(objArr.getClass()).v()));
                    return;
                }
                i = 14;
            }
            dataOutputStream.writeByte(i);
            dataOutputStream.writeInt(objArr.length);
            for (Object obj2 : objArr) {
                if (i == 8) {
                    Boolean bool = obj2 instanceof Boolean ? (Boolean) obj2 : null;
                    dataOutputStream.writeBoolean(bool != null ? bool.booleanValue() : false);
                } else if (i == 9) {
                    Byte b = obj2 instanceof Byte ? (Byte) obj2 : null;
                    dataOutputStream.writeByte(b != null ? b.byteValue() : (byte) 0);
                } else if (i == 10) {
                    Integer num = obj2 instanceof Integer ? (Integer) obj2 : null;
                    dataOutputStream.writeInt(num != null ? num.intValue() : 0);
                } else if (i == 11) {
                    Long l = obj2 instanceof Long ? (Long) obj2 : null;
                    dataOutputStream.writeLong(l != null ? l.longValue() : 0L);
                } else if (i == 12) {
                    Float f = obj2 instanceof Float ? (Float) obj2 : null;
                    dataOutputStream.writeFloat(f != null ? f.floatValue() : 0.0f);
                } else if (i == 13) {
                    Double d = obj2 instanceof Double ? (Double) obj2 : null;
                    dataOutputStream.writeDouble(d != null ? d.doubleValue() : 0.0d);
                } else if (i == 14) {
                    String str2 = obj2 instanceof String ? (String) obj2 : null;
                    if (str2 == null) {
                        str2 = "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d";
                    }
                    dataOutputStream.writeUTF(str2);
                }
            }
        }
        dataOutputStream.writeUTF(str);
    }

    public static final q56 K(d0t d0tVar, ctf0 ctf0Var, m5l0 m5l0Var, v5l0 v5l0Var, String str, String str2, List list, boolean z, boolean z2, boolean z3, boolean z4) {
        q56 l56Var;
        d0tVar.getClass();
        str.getClass();
        list.getClass();
        ctf0Var.getClass();
        v5l0Var.getClass();
        str2.getClass();
        int iOrdinal = v5l0Var.ordinal();
        if (iOrdinal != 0) {
            boolean z5 = true;
            if (iOrdinal != 1) {
                d2i d2iVar = null;
                if (iOrdinal != 2) {
                    c2m c2mVar = c2m.f3631a;
                    if (iOrdinal == 3) {
                        long j = d0tVar.f5282a;
                        n0x n0xVar = new n0x(dtb.F(str));
                        String strG = kpb.G(d0tVar, ctf0Var);
                        if (!qzb.B0(d0tVar) && !kpb.j0(d0tVar)) {
                            z5 = false;
                        }
                        l56Var = new n56(j, s7n0.p(d0tVar, str, strG, list, z2, z3, z4, z5, str2, kpb.b0(d0tVar, z), kpb.d0(d0tVar, z)), new p66(new sws0(qzb.c0(d0tVar), kpb.D(d0tVar)), new sws0(qzb.r0(d0tVar), kpb.U(d0tVar)), new z1m(c2mVar)), jn8.a(d0tVar, v5l0Var, ctf0Var, m5l0Var), n0xVar);
                    } else {
                        if (iOrdinal != 4) {
                            t9f.b();
                            return null;
                        }
                        l56Var = new m56(d0tVar.f5282a, s7n0.o(d0tVar, str, str2, list, z2, z3, z4, kpb.b0(d0tVar, z), kpb.d0(d0tVar, z)), new h66(new z1m(c2mVar), dyb.a0(d0tVar), new tws0(qzb.c0(d0tVar), kpb.D(d0tVar)), new tws0(qzb.r0(d0tVar), kpb.U(d0tVar)), kpb.G(d0tVar, ctf0Var)), jn8.a(d0tVar, v5l0Var, ctf0Var, m5l0Var));
                    }
                } else {
                    long j2 = d0tVar.f5282a;
                    k4i k4iVarQ = s7n0.q(d0tVar, str, list, z2, z3, str2, kpb.b0(d0tVar, z), kpb.d0(d0tVar, z));
                    rws0 rws0Var = new rws0(qzb.c0(d0tVar), kpb.D(d0tVar));
                    rws0 rws0Var2 = new rws0(qzb.r0(d0tVar), kpb.U(d0tVar));
                    p0n p0nVarA0 = dyb.a0(d0tVar);
                    String strG2 = kpb.G(d0tVar, ctf0Var);
                    if (d0tVar.S && z4) {
                        d2iVar = new d2i();
                    }
                    l56Var = new o56(j2, k4iVarQ, new x66(d2iVar, p0nVarA0, rws0Var, rws0Var2, strG2), jn8.a(d0tVar, v5l0Var, ctf0Var, m5l0Var));
                }
            } else {
                l56Var = new p56(d0tVar.f5282a, s7n0.r(d0tVar, str, list, z2, z3, str2, kpb.b0(d0tVar, z), kpb.d0(d0tVar, z)), new f76(new qws0(qzb.c0(d0tVar)), new qws0(qzb.r0(d0tVar)), dyb.a0(d0tVar), kpb.G(d0tVar, ctf0Var), pem.f26861a), jn8.a(d0tVar, v5l0Var, ctf0Var, m5l0Var));
            }
        } else {
            l56Var = new l56(d0tVar.f5282a, s7n0.n(d0tVar, str, str2, list, z2, z3, z4, kpb.b0(d0tVar, z), kpb.d0(d0tVar, z)), new z56(new pws0(qzb.c0(d0tVar), kpb.D(d0tVar)), new pws0(qzb.r0(d0tVar), kpb.U(d0tVar)), new lpm(opm.f25648a, new hpm(0L, 3)), dyb.a0(d0tVar), kpb.G(d0tVar, ctf0Var)), jn8.a(d0tVar, v5l0Var, ctf0Var, m5l0Var));
        }
        return l56Var;
    }

    public static final ArrayList L(List list) {
        ArrayList<fah> arrayListU = twn.u(list);
        for (Object obj : list) {
            if (((fah) obj).e != null) {
                arrayListU.add(obj);
            }
        }
        ArrayList arrayList = new ArrayList(r3d.q(arrayListU, 10));
        for (fah fahVar : arrayListU) {
            Integer num = fahVar.b;
            int iIntValue = num != null ? num.intValue() : -1;
            Integer num2 = fahVar.c;
            int iIntValue2 = num2 != null ? num2.intValue() : -1;
            Integer num3 = fahVar.f9207a;
            int iIntValue3 = num3 != null ? num3.intValue() : 0;
            Integer num4 = fahVar.e;
            arrayList.add(new cah(iIntValue, iIntValue2, iIntValue3, (num4 != null && num4.intValue() == 1) ? zf90.f44292a : (num4 != null && num4.intValue() == 2) ? zf90.b : zf90.d));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.util.Collection, java.util.List] */
    public static final hvh M(swh swhVar) {
        ?? arrayList;
        List list;
        byh byhVar = swhVar.b;
        if (byhVar == null || (list = byhVar.g) == null) {
            arrayList = iun.f15405a;
        } else {
            arrayList = new ArrayList(r3d.q(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(azw.X((h040) it.next()));
            }
        }
        ?? r9 = arrayList;
        if (byhVar == null || r9.isEmpty()) {
            return gvh.f11973a;
        }
        String str = byhVar.f3417a;
        String str2 = str == null ? "" : str;
        String str3 = byhVar.b;
        String str4 = str3 == null ? "" : str3;
        String str5 = byhVar.c;
        String str6 = str5 == null ? "" : str5;
        Integer num = byhVar.d;
        int iIntValue = num != null ? num.intValue() : -1;
        pek pekVar = lho.b;
        Integer num2 = byhVar.e;
        int iIntValue2 = num2 != null ? num2.intValue() : -1;
        pekVar.getClass();
        lho lhoVarG = pek.g(iIntValue2);
        Long l = byhVar.f;
        return new fvh(str2, str4, str6, iIntValue, lhoVarG, new znq0(l != null ? l.longValue() : -1L), r9);
    }

    public static final hnl N(c01 c01Var) {
        c01Var.getClass();
        int iOrdinal = c01Var.ordinal();
        if (iOrdinal == 0) {
            return dnl.f6375a;
        }
        if (iOrdinal == 1) {
            return cnl.f4661a;
        }
        if (iOrdinal == 2) {
            return enl.f8099a;
        }
        if (iOrdinal == 3) {
            return fnl.f9842a;
        }
        if (iOrdinal == 4) {
            return gnl.f11594a;
        }
        t9f.b();
        return null;
    }

    public static final azr O(y78 y78Var, d0t d0tVar, String str, String str2, ArrayList arrayList, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        d0tVar.getClass();
        str.getClass();
        y78Var.getClass();
        int i = gql0.f11739a;
        rqs rqsVar = d0tVar.p;
        boolean z6 = d0tVar.C;
        int i2 = rqsVar.g;
        boolean z7 = i2 > 0;
        boolean z8 = i2 == 1;
        int i3 = (z7 && z8) ? 1 : 0;
        int i4 = (!z7 || z8) ? 0 : 1;
        qtr qtrVarF0 = vbc.f0(d0tVar, false, z3, false);
        long j = d0tVar.f5282a;
        dur durVarY = xbc.Y(d0tVar, str, str2, arrayList, z, z2, true, z4, z5);
        f0t f0tVar = d0tVar.q;
        List list = f0tVar.d;
        String str3 = (String) CollectionsKt.W(0, list);
        if (str3 == null) {
            str3 = "";
        }
        String str4 = (String) CollectionsKt.W(1, list);
        if (str4 == null) {
            str4 = "";
        }
        String strC0 = qzb.c0(d0tVar);
        strC0.getClass();
        wyr wyrVar = new wyr(f0tVar.f8731a, new zmk0(strC0, -1, -1.0f, -1, i3, -1), str3, str4, StringsKt__StringsKt.split$default(strC0, new String[]{Separators.SLASH}, false, 0, 6, null).size() > 1);
        f0t f0tVar2 = d0tVar.r;
        List list2 = f0tVar2.d;
        String str5 = (String) CollectionsKt.W(0, list2);
        if (str5 == null) {
            str5 = "";
        }
        String str6 = (String) CollectionsKt.W(1, list2);
        String str7 = str6 != null ? str6 : "";
        String strR0 = qzb.r0(d0tVar);
        strR0.getClass();
        return new azr(j, durVarY, qtrVarF0, wyrVar, new xyr(f0tVar2.f8731a, new zmk0(strR0, -1, -1.0f, -1, i4, -1), str5, str7, StringsKt__StringsKt.split$default(strR0, new String[]{Separators.SLASH}, false, 0, 6, null).size() > 1), new uyr(y78.n(y78Var, d0tVar, !qzb.H0(d0tVar), false, 4).toString(), d0tVar.s, d0tVar.A != boh.UNKNOWN), new vyr(wzb.F0(d0tVar)), new tyr(qtrVarF0.d.c), new fus(z6 ? rqsVar.j : d0tVar.t, d0tVar.P.getTime(), z6 ? qzb.H0(d0tVar) : qzb.E0(d0tVar), true));
    }

    public static final z5w P(jvw jvwVar) {
        jvwVar.getClass();
        if (jvwVar == zw4.f45089a) {
            return z5w.k;
        }
        if (jvwVar == zw4.b) {
            return z5w.v;
        }
        if (jvwVar == zw4.c) {
            return z5w.l;
        }
        if (jvwVar == i0w.b) {
            return z5w.n;
        }
        if (jvwVar == i0w.c) {
            return z5w.o;
        }
        if (jvwVar == i0w.d) {
            return z5w.p;
        }
        if (jvwVar == i0w.e) {
            return z5w.q;
        }
        if (jvwVar == i0w.f) {
            return z5w.r;
        }
        if (jvwVar == i0w.h) {
            return z5w.s;
        }
        return jvwVar == i0w.i ? z5w.t : z5w.b;
    }

    public static final void a(mm40 mm40Var, h6m h6mVar, boolean z, Function0 function0, Function1 function1, Function1 function2, fet fetVar, int i) {
        int i2;
        mm40 mm40VarT;
        mm40 mm40Var2;
        boolean z2;
        f5m f5mVar = h6mVar.h;
        fetVar.g0(736346144);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(h6mVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.h(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(function0) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.i(function1) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar.i(function2) ? 131072 : 65536;
        }
        if (fetVar.U(i2 & 1, (74899 & i2) != 74898)) {
            mw3 mw3Var = uc9.c;
            xx7 xx7Var = gqw0.m;
            x5d x5dVarA = w5d.a(mw3Var, xx7Var, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z3 = fetVar.S;
            pcy pcyVar = e7z.u1;
            if (z3) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar, x5dVarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar3);
            jpm0.n(fetVar);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar4);
            jm40 jm40Var = jm40.b;
            if (z) {
                function0.getClass();
                function1.getClass();
                mm40VarT = i4w0.T(knx.Q(jm40Var, new b5m(function1, function0)), new cjl(function0, (byte) 10));
                mm40Var2 = jm40Var;
            } else {
                mm40VarT = jm40Var;
                mm40Var2 = mm40VarT;
            }
            x5d x5dVarA2 = w5d.a(mw3Var, xx7Var, fetVar, 0);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarT);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA2, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            zcl zclVar = qmk.f28987a;
            qxw.o(fetVar, o7k0.e(mm40Var2, 4.0f));
            if (f5mVar.f8968a == null && f5mVar.b == null) {
                fetVar.e0(-440622122);
                fetVar.r(false);
                z2 = false;
            } else {
                fetVar.e0(-440863333);
                z2 = false;
                thb.m(s5x0.N(o7k0.d(mm40Var2, 1.0f), 0.0f, 8.0f, 0.0f, 0.0f, 13), f5mVar, fetVar, 0);
                fetVar.r(false);
            }
            fetVar.r(true);
            b6m b6mVar = h6mVar.i;
            if (b6mVar == null) {
                fetVar.e0(452553780);
                fetVar.r(z2);
            } else {
                fetVar.e0(452553781);
                hkb.t(o7k0.d(mm40Var2, 1.0f), b6mVar, function2, fetVar, ((i2 >> 9) & 896) | 6);
                fetVar.r(false);
            }
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ig2(mm40Var, (Object) h6mVar, z, (Object) function0, function1, (wdr) function2, i, (byte) 10);
        }
    }

    public static final void b(l7m0 l7m0Var, qdz qdzVar, Function1 function1, fet fetVar, int i) {
        l7m0Var.getClass();
        qdzVar.getClass();
        function1.getClass();
        fetVar.g0(-916902184);
        byte b = 2;
        int i2 = i | (fetVar.g(l7m0Var) ? 4 : 2) | (fetVar.g(qdzVar) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            int i3 = i2 & 896;
            boolean z = i3 == 256;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new dib(function1, b);
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean z2 = i3 == 256;
            Object objP2 = fetVar.P();
            byte b2 = 3;
            if (z2 || objP2 == cl5Var) {
                objP2 = new dib(function1, b2);
                fetVar.o0(objP2);
            }
            v3c.z(function0, (Function0) objP2, null, fetVar, 0, 4);
            float fH0 = lgb.h0(fetVar);
            zcl zclVar = qmk.f28987a;
            float f = 236.0f + fH0;
            float f2 = 56.0f + fH0;
            Object objP3 = fetVar.P();
            if (objP3 == cl5Var) {
                objP3 = jgk0.b(new eka(l7m0Var, (byte) 6));
                fetVar.o0(objP3);
            }
            m0x0.d(null, f, ((StaticColors) fetVar.k(m8m0.f21378a)).m121getTransparent0d7_KjU(), ((ThemeColors) fetVar.k(zaq0.b)).getBackground(), false, 12.0f, null, 0L, 0.0f, null, null, u1c.M(-585864891, new lkb(l7m0Var, f, f2, function1, (byte) 0), fetVar), u1c.M(2057729227, new mkb(ddz.a(0, 0, fetVar, 0, 3), qdzVar, function1, (l7m0) objP3, l7m0Var), fetVar), fetVar, 24576, 432, 1985);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new fn(l7m0Var, qdzVar, function1, i, (byte) 1);
        }
    }

    public static final void c(List list, Function1 function1, fet fetVar, int i) {
        list.getClass();
        function1.getClass();
        fetVar.g0(1967087939);
        int i2 = (fetVar.g(list) ? 4 : 2) | i | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            mez mezVarQ = gfx.Q(fetVar);
            y3m0 y3m0Var = new y3m0(2);
            mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarG = o7k0.g(mm40VarD, 0.0f, 1024.0f, 1);
            lh80 lh80VarU = s5x0.u(xfn.a(fetVar).d, 12.0f, xfn.a(fetVar).d, 0.0f, 8);
            qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
            boolean z = ((i2 & 14) == 4) | ((i2 & 112) == 32);
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new rb(list, function1, (byte) 6);
                fetVar.o0(objP);
            }
            ydx.f(y3m0Var, mm40VarG, mezVarQ, lh80VarU, 8.0f, qw3Var, null, false, null, (Function1) objP, fetVar, 0, 912);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new yx(list, function1, i, (byte) 1);
        }
    }

    public static final void d(mm40 mm40Var, fuf fufVar, fet fetVar, int i) {
        fetVar.g0(2068646238);
        int i2 = i | 6 | (fetVar.d(192.0f) ? 32 : 16) | (fetVar.g(fufVar) ? 256 : 128);
        byte b = 0;
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            mm40Var = jm40.b;
            mm40 mm40VarW = o7k0.w(o7k0.s(mm40Var, 192.0f), null, false, 3);
            long jM75getBlack600d7_KjU = StaticColors.INSTANCE.m75getBlack600d7_KjU();
            zcl zclVar = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarE0 = o2e.e0(i120.Q(mm40VarW, jM75getBlack600d7_KjU, new ugg0(zclVar, zclVar, zclVar, zclVar)), "CUPHEAD_STATISTIC_COLUMN");
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarE0);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            obc.d(bmd.n.a(k6z.f17794a), u1c.M(63133332, new cnc(fufVar, (byte) 25), fetVar), fetVar, 56);
            kkb.h(fufVar.f, fetVar, 0);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new guf(mm40Var, fufVar, i, b);
        }
    }

    public static final void e(mm40 mm40Var, bch0 bch0Var, fnh fnhVar, Function1 function1, fet fetVar, int i) {
        int i2;
        bch0Var.getClass();
        function1.getClass();
        fetVar.g0(-215399562);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? fetVar.g(bch0Var) : fetVar.i(bch0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(fnhVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(function1) ? 2048 : 1024;
        }
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            if (fnhVar instanceof enh) {
                fetVar.e0(-286901285);
                xcz xczVarA = bch0Var instanceof xcz ? (xcz) bch0Var : null;
                if (xczVarA == null) {
                    fetVar.e0(-840534259);
                    xczVarA = ddz.a(0, 0, fetVar, 0, 3);
                } else {
                    fetVar.e0(-840535344);
                }
                fetVar.r(false);
                dtb.e(mm40Var, xczVarA, (enh) fnhVar, function1, fetVar, i2 & 8078);
                fetVar.r(false);
            } else if (fnhVar instanceof bnh) {
                fetVar.e0(-286570949);
                xcz xczVarA2 = bch0Var instanceof xcz ? (xcz) bch0Var : null;
                if (xczVarA2 == null) {
                    fetVar.e0(-840523603);
                    xczVarA2 = ddz.a(0, 0, fetVar, 0, 3);
                } else {
                    fetVar.e0(-840524688);
                }
                fetVar.r(false);
                sj3.g(mm40Var, xczVarA2, (bnh) fnhVar, function1, fetVar, i2 & 8078);
                fetVar.r(false);
            } else {
                if (!(fnhVar instanceof ymh)) {
                    throw b1j.f(-840540486, fetVar, false);
                }
                fetVar.e0(-286225268);
                d9z d9zVarA = bch0Var instanceof d9z ? (d9z) bch0Var : null;
                if (d9zVarA == null) {
                    fetVar.e0(-840512691);
                    d9zVarA = f9z.a(fetVar);
                } else {
                    fetVar.e0(-840513776);
                }
                fetVar.r(false);
                slb.j(mm40Var, (ymh) fnhVar, d9zVarA, function1, fetVar, (i2 & 14) | ((i2 >> 3) & 112) | (i2 & 7168));
                fetVar.r(false);
            }
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dg0((byte) 22, i, (Object) mm40Var, (Object) bch0Var, (Object) fnhVar, (Object) function1);
        }
    }

    public static final void f(mm40 mm40Var, ytl ytlVar, Function0 function0, Function0 function1, Function0 function2, fet fetVar, int i) {
        mm40 mm40Var2;
        function0.getClass();
        function1.getClass();
        function2.getClass();
        fetVar.g0(812617519);
        int i2 = i | (fetVar.g(ytlVar) ? 32 : 16) | (fetVar.i(function0) ? 256 : 128) | (fetVar.i(function1) ? 2048 : 1024) | (fetVar.i(function2) ? 16384 : 8192);
        if (fetVar.U(i2 & 1, (i2 & 9361) != 9360)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarU = o7k0.u(jm40Var, 0.0f, 512.0f, 1);
            boolean z = (i2 & 57344) == 16384;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new unl(function2, (byte) 8);
                fetVar.o0(objP);
            }
            ulb.i((Function0) objP, mm40VarU, false, null, null, null, null, u1c.M(-1618770099, new sd8(ytlVar, (byte) 28), fetVar), null, u1c.M(1565128060, new qb((Object) ytlVar, (Object) function0, (Object) function1, (byte) 29), fetVar), fetVar, 100663296, 764);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cqk(mm40Var2, (Object) ytlVar, function0, function1, function2, i, (byte) 8);
        }
    }

    public static final void g(final h6m h6mVar, h5m h5mVar, final Function0 function0, final Function0 function1, final Function0 function2, final Function1 function3, final Function1 function4, final Function1 function5, fet fetVar, int i) {
        int i2;
        int iL;
        k6z k6zVar;
        h5mVar.getClass();
        function0.getClass();
        function1.getClass();
        function2.getClass();
        function3.getClass();
        function4.getClass();
        function5.getClass();
        fetVar.g0(158693232);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(h6mVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(h5mVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(function1) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.i(function2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar.i(function3) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= fetVar.i(function4) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= fetVar.i(function5) ? 8388608 : 4194304;
        }
        if (fetVar.U(i2 & 1, (4793491 & i2) != 4793490)) {
            boolean z = h6mVar.i != null;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = androidx.compose.runtime.e.b(0);
                fetVar.o0(objP);
            }
            final cgk0 cgk0Var = (cgk0) objP;
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = androidx.compose.runtime.e.b(0);
                fetVar.o0(objP2);
            }
            final cgk0 cgk0Var2 = (cgk0) objP2;
            int i3 = i2 & 112;
            boolean z2 = i3 == 32;
            Object objP3 = fetVar.P();
            if (z2 || objP3 == cl5Var) {
                objP3 = new ntl(h5mVar, (byte) 3);
                fetVar.o0(objP3);
            }
            final Function0 function6 = (Function0) objP3;
            if (z != 0) {
                iL = cgk0Var2.l() + cgk0Var.l();
            } else {
                iL = 0;
            }
            boolean zE = (i3 == 32) | fetVar.e(iL);
            Object objP4 = fetVar.P();
            if (zE || objP4 == cl5Var) {
                objP4 = new x9c(h5mVar, iL, (byte) 6);
                fetVar.o0(objP4);
            }
            m0x0.D((Function0) objP4, fetVar);
            if (h6mVar.j) {
                fetVar.e0(-2114601001);
                k6zVar = (k6z) fetVar.k(bmd.n);
                fetVar.r(false);
            } else {
                fetVar.e0(-2114600077);
                fetVar.r(false);
                k6zVar = k6z.f17794a;
            }
            final boolean z3 = z;
            obc.d(bmd.n.a(k6zVar), u1c.M(2071952432, new Function2() { // from class: a.g6m
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    mm40 mm40VarT;
                    fet fetVar2 = (fet) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (fetVar2.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                        jm40 jm40Var = jm40.b;
                        boolean z4 = z3;
                        Function0 function7 = function6;
                        if (z4) {
                            fetVar2.e0(-1735012507);
                            Object objP5 = fetVar2.P();
                            if (objP5 == ukd.f35823a) {
                                objP5 = new nw6(cgk0Var, (byte) 9);
                                fetVar2.o0(objP5);
                            }
                            Function1 function8 = (Function1) objP5;
                            function7.getClass();
                            function8.getClass();
                            mm40VarT = i4w0.T(knx.Q(jm40Var, new b5m(function8, function7)), new cjl(function7, (byte) 10));
                            fetVar2.r(false);
                        } else {
                            fetVar2.e0(-1734808310);
                            fetVar2.r(false);
                            mm40VarT = jm40Var;
                        }
                        x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
                        int iHashCode = Long.hashCode(fetVar2.T);
                        bh90 bh90VarM = fetVar2.m();
                        mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarT);
                        mkd.c0.getClass();
                        fetVar2.i0();
                        if (fetVar2.S) {
                            fetVar2.l(e7z.u1);
                        } else {
                            fetVar2.r0();
                        }
                        jpm0.o(fetVar2, x5dVarA, gqw0.x);
                        jpm0.o(fetVar2, bh90VarM, gqw0.w);
                        jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
                        jpm0.n(fetVar2);
                        jpm0.o(fetVar2, mm40VarC0, gqw0.v);
                        zcl zclVar = qmk.f28987a;
                        mm40 mm40VarD = ua80.d(jm40Var, 4.0f, fetVar2, jm40Var, 1.0f);
                        h6m h6mVar2 = h6mVar;
                        nkb.w(mm40VarD, h6mVar2, function0, function1, function2, fetVar2, 6);
                        nkb.r(s5x0.N(o7k0.d(jm40Var, 1.0f), 0.0f, 12.0f, 0.0f, 0.0f, 13), h6mVar2, function3, function4, fetVar2, 0);
                        fetVar2.r(true);
                        f5m f5mVar = h6mVar2.h;
                        lgb.r(h6mVar2, (f5mVar.f8968a == null && f5mVar.b == null && h6mVar2.i == null) ? false : true, u1c.M(-128475139, new odv(z4, (Object) function7, (Object) function5, (Object) cgk0Var2, (byte) 3), fetVar2), fetVar2, 384);
                    } else {
                        fetVar2.X();
                    }
                    return Unit.f46060a;
                }
            }, fetVar), fetVar, 56);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ff4(h6mVar, h5mVar, function0, function1, function2, function3, function4, function5, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0163  */
    /* JADX WARN: Code duplicated, block: B:103:0x0187 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:104:0x0189  */
    /* JADX WARN: Code duplicated, block: B:106:0x019d  */
    /* JADX WARN: Code duplicated, block: B:107:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:109:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:111:0x0215  */
    /* JADX WARN: Code duplicated, block: B:113:0x021d  */
    /* JADX WARN: Code duplicated, block: B:115:0x0226  */
    /* JADX WARN: Code duplicated, block: B:117:0x0246  */
    /* JADX WARN: Code duplicated, block: B:118:0x0294  */
    /* JADX WARN: Code duplicated, block: B:120:0x029e  */
    /* JADX WARN: Code duplicated, block: B:123:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:125:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:128:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:130:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x006d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0072  */
    /* JADX WARN: Code duplicated, block: B:44:0x0076  */
    /* JADX WARN: Code duplicated, block: B:46:0x007e  */
    /* JADX WARN: Code duplicated, block: B:47:0x0081  */
    /* JADX WARN: Code duplicated, block: B:51:0x008a  */
    /* JADX WARN: Code duplicated, block: B:53:0x008e  */
    /* JADX WARN: Code duplicated, block: B:55:0x0091  */
    /* JADX WARN: Code duplicated, block: B:57:0x0099  */
    /* JADX WARN: Code duplicated, block: B:58:0x009c  */
    /* JADX WARN: Code duplicated, block: B:62:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:68:0x00be  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:83:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:85:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:87:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:89:0x0104  */
    /* JADX WARN: Code duplicated, block: B:92:0x0112  */
    /* JADX WARN: Code duplicated, block: B:94:0x0118  */
    /* JADX WARN: Code duplicated, block: B:96:0x012b  */
    /* JADX WARN: Code duplicated, block: B:99:0x015d  */
    public static final void h(mm40 mm40Var, jjm jjmVar, kjm kjmVar, Function0 function0, Function0 function1, Function0 function2, fet fetVar, int i, int i2) {
        mm40 mm40VarL;
        int i3;
        Function0 function3;
        int i4;
        Function0 function4;
        int i5;
        int i6;
        Function0 function5;
        int i7;
        boolean z;
        Function0 function6;
        Function0 function7;
        Function0 function8;
        yfe0 yfe0VarU;
        int i8;
        jm40 jm40Var;
        cl5 cl5Var;
        Function0 function9;
        Function0 function10;
        Object objP;
        Function0 function11;
        Function0 function12;
        Object objP2;
        Object objP3;
        int iOrdinal;
        Function0 function13;
        boolean z2;
        int i9;
        int i10;
        boolean z3;
        int i11;
        fet fetVar2 = fetVar;
        jjmVar.getClass();
        fetVar2.g0(570673629);
        if ((i & 6) == 0) {
            if ((i2 & 1) == 0) {
                mm40VarL = mm40Var;
                if (fetVar2.g(mm40VarL)) {
                    i11 = 4;
                }
                i3 = i11 | i;
            } else {
                mm40VarL = mm40Var;
            }
            i11 = 2;
            i3 = i11 | i;
        } else {
            mm40VarL = mm40Var;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= fetVar2.g(jjmVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= fetVar2.e(kjmVar.ordinal()) ? 256 : 128;
        }
        int i12 = i2 & 8;
        if (i12 == 0) {
            if ((i & 3072) == 0) {
                function3 = function0;
                i3 |= fetVar2.i(function3) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 != 0) {
                if ((i & 24576) == 0) {
                    function4 = function1;
                    if (fetVar2.i(function4)) {
                        i5 = 16384;
                    } else {
                        i5 = 8192;
                    }
                    i3 |= i5;
                }
                i6 = i2 & 32;
                if (i6 != 0) {
                    if ((196608 & i) == 0) {
                        function5 = function2;
                        if (fetVar2.i(function5)) {
                            i7 = 131072;
                        } else {
                            i7 = 65536;
                        }
                        i3 |= i7;
                    }
                    if ((74899 & i3) != 74898) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (fetVar2.U(i3 & 1, z)) {
                        fetVar2.Z();
                        i8 = i & 1;
                        jm40Var = jm40.b;
                        if (i8 != 0 || fetVar2.B()) {
                            if ((i2 & 1) != 0) {
                                mm40VarL = s5x0.L(jm40Var, xfn.a(fetVar2).e, 0.0f, 2);
                                i3 &= -15;
                            }
                            cl5Var = ukd.f35823a;
                            if (i12 != 0) {
                                objP3 = fetVar2.P();
                                if (objP3 == cl5Var) {
                                    objP3 = new ndm((byte) 6);
                                    fetVar2.o0(objP3);
                                }
                                function9 = (Function0) objP3;
                            } else {
                                function9 = function3;
                            }
                            if (i4 != 0) {
                                objP2 = fetVar2.P();
                                if (objP2 == cl5Var) {
                                    objP2 = new ndm((byte) 7);
                                    fetVar2.o0(objP2);
                                }
                                function4 = (Function0) objP2;
                            }
                            if (i6 != 0) {
                                objP = fetVar2.P();
                                if (objP == cl5Var) {
                                    objP = new ndm((byte) 8);
                                    fetVar2.o0(objP);
                                }
                                function11 = (Function0) objP;
                                function10 = function9;
                                function12 = function4;
                            } else {
                                function10 = function9;
                            }
                            fetVar2.s();
                            mm40 mm40VarE0 = o2e.e0(o7k0.d(mm40VarL, 1.0f), "DS_HEADER_BOX");
                            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
                            int iHashCode = Long.hashCode(fetVar2.T);
                            bh90 bh90VarM = fetVar2.m();
                            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarE0);
                            mkd.c0.getClass();
                            fetVar2.i0();
                            if (fetVar2.S) {
                                fetVar2.l(e7z.u1);
                            } else {
                                fetVar2.r0();
                            }
                            jpm0.o(fetVar2, tj30VarC, gqw0.x);
                            jpm0.o(fetVar2, bh90VarM, gqw0.w);
                            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
                            jpm0.n(fetVar2);
                            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
                            iOrdinal = kjmVar.ordinal();
                            if (iOrdinal == 0) {
                                mm40VarL = mm40VarL;
                                function13 = function12;
                                z2 = true;
                                fetVar2.e0(1429894545);
                                int i13 = i3 & 112;
                                int i14 = i3 >> 3;
                                i9 = (i14 & 57344) | i13 | (i14 & 896) | (i14 & 7168);
                                if (jjmVar instanceof hjm) {
                                    fetVar2.e0(1636722291);
                                    hjm hjmVar = (hjm) jjmVar;
                                    CharSequence charSequence = hjmVar.f13167a;
                                    o0x o0xVar = hjmVar.d;
                                    y3d y3dVar = hjmVar.e;
                                    xe9 xe9Var = hjmVar.k;
                                    xkb.o(jm40Var, charSequence, hjmVar.g, y3dVar, o0xVar, hjmVar.f, hjmVar.j, hjmVar.h, hjmVar.m, hjmVar.c, xe9Var, hjmVar.i, hjmVar.b, function13, function11, function10, fetVar, 0, (i9 & 64512) | ((i9 << 9) & 458752), 0);
                                    fetVar2 = fetVar;
                                    fetVar2.r(false);
                                } else {
                                    if (!(jjmVar instanceof ijm)) {
                                        throw b1j.f(1992458787, fetVar2, false);
                                    }
                                    fetVar2.e0(1637508141);
                                    xkb.o(jm40Var, "", false, null, null, null, false, null, null, null, null, null, ((ijm) jjmVar).f14881a, null, null, null, fetVar, 920350128, 54, 57344);
                                    fetVar2 = fetVar;
                                    fetVar2.r(false);
                                }
                                fetVar2.r(false);
                            } else {
                                if (iOrdinal != 1) {
                                    throw b1j.f(-1477896380, fetVar2, false);
                                }
                                fetVar2.e0(1430179869);
                                int i15 = i3 & 112;
                                int i16 = i3 >> 3;
                                i10 = i15 | (i16 & 896) | (i16 & 7168);
                                if (jjmVar instanceof hjm) {
                                    fetVar2.e0(2084707219);
                                    hjm hjmVar2 = (hjm) jjmVar;
                                    z3 = false;
                                    z2 = true;
                                    slb.n(jm40Var, hjmVar2.f13167a, hjmVar2.d, hjmVar2.f, hjmVar2.k, hjmVar2.j, hjmVar2.c, hjmVar2.b, function12, function10, fetVar2, ((i10 << 15) & 234881024) | ((i10 << 21) & 1879048192), 0);
                                    fetVar2.r(false);
                                } else {
                                    z3 = false;
                                    z2 = true;
                                    if (!(jjmVar instanceof ijm)) {
                                        throw b1j.f(-902584227, fetVar2, false);
                                    }
                                    fetVar2.e0(2085241907);
                                    slb.n(jm40Var, "", null, null, null, false, null, ((ijm) jjmVar).f14881a, null, null, fetVar2, 1797552, 768);
                                    fetVar2.r(false);
                                }
                                fetVar2.r(z3);
                                function13 = function12;
                                function11 = function11;
                                function10 = function10;
                            }
                            fetVar2.r(z2);
                            mm40VarL = mm40VarL;
                            function6 = function10;
                            function7 = function13;
                            function8 = function11;
                        } else {
                            fetVar2.X();
                            if ((i2 & 1) != 0) {
                                i3 &= -15;
                            }
                            function10 = function3;
                        }
                        function12 = function4;
                        function11 = function5;
                        fetVar2.s();
                        mm40 mm40VarE1 = o2e.e0(o7k0.d(mm40VarL, 1.0f), "DS_HEADER_BOX");
                        tj30 tj30VarC2 = zq8.c(gqw0.f11754a, false);
                        int iHashCode2 = Long.hashCode(fetVar2.T);
                        bh90 bh90VarM2 = fetVar2.m();
                        mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarE1);
                        mkd.c0.getClass();
                        fetVar2.i0();
                        if (fetVar2.S) {
                            fetVar2.l(e7z.u1);
                        } else {
                            fetVar2.r0();
                        }
                        jpm0.o(fetVar2, tj30VarC2, gqw0.x);
                        jpm0.o(fetVar2, bh90VarM2, gqw0.w);
                        jpm0.o(fetVar2, Integer.valueOf(iHashCode2), gqw0.y);
                        jpm0.n(fetVar2);
                        jpm0.o(fetVar2, mm40VarC1, gqw0.v);
                        iOrdinal = kjmVar.ordinal();
                        if (iOrdinal == 0) {
                            mm40VarL = mm40VarL;
                            function13 = function12;
                            z2 = true;
                            fetVar2.e0(1429894545);
                            int i17 = i3 & 112;
                            int i18 = i3 >> 3;
                            i9 = (i18 & 57344) | i17 | (i18 & 896) | (i18 & 7168);
                            if (jjmVar instanceof hjm) {
                                fetVar2.e0(1636722291);
                                hjm hjmVar3 = (hjm) jjmVar;
                                CharSequence charSequence2 = hjmVar3.f13167a;
                                o0x o0xVar2 = hjmVar3.d;
                                y3d y3dVar2 = hjmVar3.e;
                                xe9 xe9Var2 = hjmVar3.k;
                                xkb.o(jm40Var, charSequence2, hjmVar3.g, y3dVar2, o0xVar2, hjmVar3.f, hjmVar3.j, hjmVar3.h, hjmVar3.m, hjmVar3.c, xe9Var2, hjmVar3.i, hjmVar3.b, function13, function11, function10, fetVar, 0, (i9 & 64512) | ((i9 << 9) & 458752), 0);
                                fetVar2 = fetVar;
                                fetVar2.r(false);
                            } else {
                                if (!(jjmVar instanceof ijm)) {
                                    throw b1j.f(1992458787, fetVar2, false);
                                }
                                fetVar2.e0(1637508141);
                                xkb.o(jm40Var, "", false, null, null, null, false, null, null, null, null, null, ((ijm) jjmVar).f14881a, null, null, null, fetVar, 920350128, 54, 57344);
                                fetVar2 = fetVar;
                                fetVar2.r(false);
                            }
                            fetVar2.r(false);
                        } else {
                            if (iOrdinal != 1) {
                                throw b1j.f(-1477896380, fetVar2, false);
                            }
                            fetVar2.e0(1430179869);
                            int i19 = i3 & 112;
                            int i110 = i3 >> 3;
                            i10 = i19 | (i110 & 896) | (i110 & 7168);
                            if (jjmVar instanceof hjm) {
                                fetVar2.e0(2084707219);
                                hjm hjmVar4 = (hjm) jjmVar;
                                z3 = false;
                                z2 = true;
                                slb.n(jm40Var, hjmVar4.f13167a, hjmVar4.d, hjmVar4.f, hjmVar4.k, hjmVar4.j, hjmVar4.c, hjmVar4.b, function12, function10, fetVar2, ((i10 << 15) & 234881024) | ((i10 << 21) & 1879048192), 0);
                                fetVar2.r(false);
                            } else {
                                z3 = false;
                                z2 = true;
                                if (!(jjmVar instanceof ijm)) {
                                    throw b1j.f(-902584227, fetVar2, false);
                                }
                                fetVar2.e0(2085241907);
                                slb.n(jm40Var, "", null, null, null, false, null, ((ijm) jjmVar).f14881a, null, null, fetVar2, 1797552, 768);
                                fetVar2.r(false);
                            }
                            fetVar2.r(z3);
                            function13 = function12;
                            function11 = function11;
                            function10 = function10;
                        }
                        fetVar2.r(z2);
                        mm40VarL = mm40VarL;
                        function6 = function10;
                        function7 = function13;
                        function8 = function11;
                    } else {
                        fetVar2.X();
                        function6 = function3;
                        function7 = function4;
                        function8 = function5;
                    }
                    yfe0VarU = fetVar2.u();
                    if (yfe0VarU != null) {
                        yfe0VarU.d = new hjl(mm40VarL, jjmVar, kjmVar, function6, function7, function8, i, i2, (byte) 2);
                    }
                }
                i3 |= 196608;
                function5 = function2;
                if ((74899 & i3) != 74898) {
                    z = true;
                } else {
                    z = false;
                }
                if (fetVar2.U(i3 & 1, z)) {
                    fetVar2.Z();
                    i8 = i & 1;
                    jm40Var = jm40.b;
                    if (i8 != 0) {
                        if ((i2 & 1) != 0) {
                            mm40VarL = s5x0.L(jm40Var, xfn.a(fetVar2).e, 0.0f, 2);
                            i3 &= -15;
                        }
                        cl5Var = ukd.f35823a;
                        if (i12 != 0) {
                            objP3 = fetVar2.P();
                            if (objP3 == cl5Var) {
                                objP3 = new ndm((byte) 6);
                                fetVar2.o0(objP3);
                            }
                            function9 = (Function0) objP3;
                        } else {
                            function9 = function3;
                        }
                        if (i4 != 0) {
                            objP2 = fetVar2.P();
                            if (objP2 == cl5Var) {
                                objP2 = new ndm((byte) 7);
                                fetVar2.o0(objP2);
                            }
                            function4 = (Function0) objP2;
                        }
                        if (i6 != 0) {
                            objP = fetVar2.P();
                            if (objP == cl5Var) {
                                objP = new ndm((byte) 8);
                                fetVar2.o0(objP);
                            }
                            function11 = (Function0) objP;
                            function10 = function9;
                            function12 = function4;
                        } else {
                            function10 = function9;
                            function12 = function4;
                            function11 = function5;
                        }
                    } else {
                        if ((i2 & 1) != 0) {
                            mm40VarL = s5x0.L(jm40Var, xfn.a(fetVar2).e, 0.0f, 2);
                            i3 &= -15;
                        }
                        cl5Var = ukd.f35823a;
                        if (i12 != 0) {
                            objP3 = fetVar2.P();
                            if (objP3 == cl5Var) {
                                objP3 = new ndm((byte) 6);
                                fetVar2.o0(objP3);
                            }
                            function9 = (Function0) objP3;
                        } else {
                            function9 = function3;
                        }
                        if (i4 != 0) {
                            objP2 = fetVar2.P();
                            if (objP2 == cl5Var) {
                                objP2 = new ndm((byte) 7);
                                fetVar2.o0(objP2);
                            }
                            function4 = (Function0) objP2;
                        }
                        if (i6 != 0) {
                            objP = fetVar2.P();
                            if (objP == cl5Var) {
                                objP = new ndm((byte) 8);
                                fetVar2.o0(objP);
                            }
                            function11 = (Function0) objP;
                            function10 = function9;
                            function12 = function4;
                        } else {
                            function10 = function9;
                            function12 = function4;
                            function11 = function5;
                        }
                    }
                    fetVar2.s();
                    mm40 mm40VarE2 = o2e.e0(o7k0.d(mm40VarL, 1.0f), "DS_HEADER_BOX");
                    tj30 tj30VarC3 = zq8.c(gqw0.f11754a, false);
                    int iHashCode3 = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM3 = fetVar2.m();
                    mm40 mm40VarC2 = kbc.c0(fetVar2, mm40VarE2);
                    mkd.c0.getClass();
                    fetVar2.i0();
                    if (fetVar2.S) {
                        fetVar2.l(e7z.u1);
                    } else {
                        fetVar2.r0();
                    }
                    jpm0.o(fetVar2, tj30VarC3, gqw0.x);
                    jpm0.o(fetVar2, bh90VarM3, gqw0.w);
                    jpm0.o(fetVar2, Integer.valueOf(iHashCode3), gqw0.y);
                    jpm0.n(fetVar2);
                    jpm0.o(fetVar2, mm40VarC2, gqw0.v);
                    iOrdinal = kjmVar.ordinal();
                    if (iOrdinal == 0) {
                        mm40VarL = mm40VarL;
                        function13 = function12;
                        z2 = true;
                        fetVar2.e0(1429894545);
                        int i111 = i3 & 112;
                        int i112 = i3 >> 3;
                        i9 = (i112 & 57344) | i111 | (i112 & 896) | (i112 & 7168);
                        if (jjmVar instanceof hjm) {
                            fetVar2.e0(1636722291);
                            hjm hjmVar5 = (hjm) jjmVar;
                            CharSequence charSequence3 = hjmVar5.f13167a;
                            o0x o0xVar3 = hjmVar5.d;
                            y3d y3dVar3 = hjmVar5.e;
                            xe9 xe9Var3 = hjmVar5.k;
                            xkb.o(jm40Var, charSequence3, hjmVar5.g, y3dVar3, o0xVar3, hjmVar5.f, hjmVar5.j, hjmVar5.h, hjmVar5.m, hjmVar5.c, xe9Var3, hjmVar5.i, hjmVar5.b, function13, function11, function10, fetVar, 0, (i9 & 64512) | ((i9 << 9) & 458752), 0);
                            fetVar2 = fetVar;
                            fetVar2.r(false);
                        } else {
                            if (!(jjmVar instanceof ijm)) {
                                throw b1j.f(1992458787, fetVar2, false);
                            }
                            fetVar2.e0(1637508141);
                            xkb.o(jm40Var, "", false, null, null, null, false, null, null, null, null, null, ((ijm) jjmVar).f14881a, null, null, null, fetVar, 920350128, 54, 57344);
                            fetVar2 = fetVar;
                            fetVar2.r(false);
                        }
                        fetVar2.r(false);
                    } else {
                        if (iOrdinal != 1) {
                            throw b1j.f(-1477896380, fetVar2, false);
                        }
                        fetVar2.e0(1430179869);
                        int i113 = i3 & 112;
                        int i114 = i3 >> 3;
                        i10 = i113 | (i114 & 896) | (i114 & 7168);
                        if (jjmVar instanceof hjm) {
                            fetVar2.e0(2084707219);
                            hjm hjmVar6 = (hjm) jjmVar;
                            z3 = false;
                            z2 = true;
                            slb.n(jm40Var, hjmVar6.f13167a, hjmVar6.d, hjmVar6.f, hjmVar6.k, hjmVar6.j, hjmVar6.c, hjmVar6.b, function12, function10, fetVar2, ((i10 << 15) & 234881024) | ((i10 << 21) & 1879048192), 0);
                            fetVar2.r(false);
                        } else {
                            z3 = false;
                            z2 = true;
                            if (!(jjmVar instanceof ijm)) {
                                throw b1j.f(-902584227, fetVar2, false);
                            }
                            fetVar2.e0(2085241907);
                            slb.n(jm40Var, "", null, null, null, false, null, ((ijm) jjmVar).f14881a, null, null, fetVar2, 1797552, 768);
                            fetVar2.r(false);
                        }
                        fetVar2.r(z3);
                        function13 = function12;
                        function11 = function11;
                        function10 = function10;
                    }
                    fetVar2.r(z2);
                    mm40VarL = mm40VarL;
                    function6 = function10;
                    function7 = function13;
                    function8 = function11;
                } else {
                    fetVar2.X();
                    function6 = function3;
                    function7 = function4;
                    function8 = function5;
                }
                yfe0VarU = fetVar2.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new hjl(mm40VarL, jjmVar, kjmVar, function6, function7, function8, i, i2, (byte) 2);
                }
            }
            i3 |= 24576;
            function4 = function1;
            i6 = i2 & 32;
            if (i6 != 0) {
                if ((196608 & i) == 0) {
                    function5 = function2;
                    if (fetVar2.i(function5)) {
                        i7 = 131072;
                    } else {
                        i7 = 65536;
                    }
                    i3 |= i7;
                }
                if ((74899 & i3) != 74898) {
                    z = true;
                } else {
                    z = false;
                }
                if (fetVar2.U(i3 & 1, z)) {
                    fetVar2.Z();
                    i8 = i & 1;
                    jm40Var = jm40.b;
                    if (i8 != 0) {
                        if ((i2 & 1) != 0) {
                            mm40VarL = s5x0.L(jm40Var, xfn.a(fetVar2).e, 0.0f, 2);
                            i3 &= -15;
                        }
                        cl5Var = ukd.f35823a;
                        if (i12 != 0) {
                            objP3 = fetVar2.P();
                            if (objP3 == cl5Var) {
                                objP3 = new ndm((byte) 6);
                                fetVar2.o0(objP3);
                            }
                            function9 = (Function0) objP3;
                        } else {
                            function9 = function3;
                        }
                        if (i4 != 0) {
                            objP2 = fetVar2.P();
                            if (objP2 == cl5Var) {
                                objP2 = new ndm((byte) 7);
                                fetVar2.o0(objP2);
                            }
                            function4 = (Function0) objP2;
                        }
                        if (i6 != 0) {
                            objP = fetVar2.P();
                            if (objP == cl5Var) {
                                objP = new ndm((byte) 8);
                                fetVar2.o0(objP);
                            }
                            function11 = (Function0) objP;
                            function10 = function9;
                            function12 = function4;
                        } else {
                            function10 = function9;
                            function12 = function4;
                            function11 = function5;
                        }
                    } else {
                        if ((i2 & 1) != 0) {
                            mm40VarL = s5x0.L(jm40Var, xfn.a(fetVar2).e, 0.0f, 2);
                            i3 &= -15;
                        }
                        cl5Var = ukd.f35823a;
                        if (i12 != 0) {
                            objP3 = fetVar2.P();
                            if (objP3 == cl5Var) {
                                objP3 = new ndm((byte) 6);
                                fetVar2.o0(objP3);
                            }
                            function9 = (Function0) objP3;
                        } else {
                            function9 = function3;
                        }
                        if (i4 != 0) {
                            objP2 = fetVar2.P();
                            if (objP2 == cl5Var) {
                                objP2 = new ndm((byte) 7);
                                fetVar2.o0(objP2);
                            }
                            function4 = (Function0) objP2;
                        }
                        if (i6 != 0) {
                            objP = fetVar2.P();
                            if (objP == cl5Var) {
                                objP = new ndm((byte) 8);
                                fetVar2.o0(objP);
                            }
                            function11 = (Function0) objP;
                            function10 = function9;
                            function12 = function4;
                        } else {
                            function10 = function9;
                            function12 = function4;
                            function11 = function5;
                        }
                    }
                    fetVar2.s();
                    mm40 mm40VarE3 = o2e.e0(o7k0.d(mm40VarL, 1.0f), "DS_HEADER_BOX");
                    tj30 tj30VarC4 = zq8.c(gqw0.f11754a, false);
                    int iHashCode4 = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM4 = fetVar2.m();
                    mm40 mm40VarC3 = kbc.c0(fetVar2, mm40VarE3);
                    mkd.c0.getClass();
                    fetVar2.i0();
                    if (fetVar2.S) {
                        fetVar2.l(e7z.u1);
                    } else {
                        fetVar2.r0();
                    }
                    jpm0.o(fetVar2, tj30VarC4, gqw0.x);
                    jpm0.o(fetVar2, bh90VarM4, gqw0.w);
                    jpm0.o(fetVar2, Integer.valueOf(iHashCode4), gqw0.y);
                    jpm0.n(fetVar2);
                    jpm0.o(fetVar2, mm40VarC3, gqw0.v);
                    iOrdinal = kjmVar.ordinal();
                    if (iOrdinal == 0) {
                        mm40VarL = mm40VarL;
                        function13 = function12;
                        z2 = true;
                        fetVar2.e0(1429894545);
                        int i115 = i3 & 112;
                        int i116 = i3 >> 3;
                        i9 = (i116 & 57344) | i115 | (i116 & 896) | (i116 & 7168);
                        if (jjmVar instanceof hjm) {
                            fetVar2.e0(1636722291);
                            hjm hjmVar7 = (hjm) jjmVar;
                            CharSequence charSequence4 = hjmVar7.f13167a;
                            o0x o0xVar4 = hjmVar7.d;
                            y3d y3dVar4 = hjmVar7.e;
                            xe9 xe9Var4 = hjmVar7.k;
                            xkb.o(jm40Var, charSequence4, hjmVar7.g, y3dVar4, o0xVar4, hjmVar7.f, hjmVar7.j, hjmVar7.h, hjmVar7.m, hjmVar7.c, xe9Var4, hjmVar7.i, hjmVar7.b, function13, function11, function10, fetVar, 0, (i9 & 64512) | ((i9 << 9) & 458752), 0);
                            fetVar2 = fetVar;
                            fetVar2.r(false);
                        } else {
                            if (!(jjmVar instanceof ijm)) {
                                throw b1j.f(1992458787, fetVar2, false);
                            }
                            fetVar2.e0(1637508141);
                            xkb.o(jm40Var, "", false, null, null, null, false, null, null, null, null, null, ((ijm) jjmVar).f14881a, null, null, null, fetVar, 920350128, 54, 57344);
                            fetVar2 = fetVar;
                            fetVar2.r(false);
                        }
                        fetVar2.r(false);
                    } else {
                        if (iOrdinal != 1) {
                            throw b1j.f(-1477896380, fetVar2, false);
                        }
                        fetVar2.e0(1430179869);
                        int i117 = i3 & 112;
                        int i118 = i3 >> 3;
                        i10 = i117 | (i118 & 896) | (i118 & 7168);
                        if (jjmVar instanceof hjm) {
                            fetVar2.e0(2084707219);
                            hjm hjmVar8 = (hjm) jjmVar;
                            z3 = false;
                            z2 = true;
                            slb.n(jm40Var, hjmVar8.f13167a, hjmVar8.d, hjmVar8.f, hjmVar8.k, hjmVar8.j, hjmVar8.c, hjmVar8.b, function12, function10, fetVar2, ((i10 << 15) & 234881024) | ((i10 << 21) & 1879048192), 0);
                            fetVar2.r(false);
                        } else {
                            z3 = false;
                            z2 = true;
                            if (!(jjmVar instanceof ijm)) {
                                throw b1j.f(-902584227, fetVar2, false);
                            }
                            fetVar2.e0(2085241907);
                            slb.n(jm40Var, "", null, null, null, false, null, ((ijm) jjmVar).f14881a, null, null, fetVar2, 1797552, 768);
                            fetVar2.r(false);
                        }
                        fetVar2.r(z3);
                        function13 = function12;
                        function11 = function11;
                        function10 = function10;
                    }
                    fetVar2.r(z2);
                    mm40VarL = mm40VarL;
                    function6 = function10;
                    function7 = function13;
                    function8 = function11;
                } else {
                    fetVar2.X();
                    function6 = function3;
                    function7 = function4;
                    function8 = function5;
                }
                yfe0VarU = fetVar2.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new hjl(mm40VarL, jjmVar, kjmVar, function6, function7, function8, i, i2, (byte) 2);
                }
            }
            i3 |= 196608;
            function5 = function2;
            if ((74899 & i3) != 74898) {
                z = true;
            } else {
                z = false;
            }
            if (fetVar2.U(i3 & 1, z)) {
                fetVar2.Z();
                i8 = i & 1;
                jm40Var = jm40.b;
                if (i8 != 0) {
                    if ((i2 & 1) != 0) {
                        mm40VarL = s5x0.L(jm40Var, xfn.a(fetVar2).e, 0.0f, 2);
                        i3 &= -15;
                    }
                    cl5Var = ukd.f35823a;
                    if (i12 != 0) {
                        objP3 = fetVar2.P();
                        if (objP3 == cl5Var) {
                            objP3 = new ndm((byte) 6);
                            fetVar2.o0(objP3);
                        }
                        function9 = (Function0) objP3;
                    } else {
                        function9 = function3;
                    }
                    if (i4 != 0) {
                        objP2 = fetVar2.P();
                        if (objP2 == cl5Var) {
                            objP2 = new ndm((byte) 7);
                            fetVar2.o0(objP2);
                        }
                        function4 = (Function0) objP2;
                    }
                    if (i6 != 0) {
                        objP = fetVar2.P();
                        if (objP == cl5Var) {
                            objP = new ndm((byte) 8);
                            fetVar2.o0(objP);
                        }
                        function11 = (Function0) objP;
                        function10 = function9;
                        function12 = function4;
                    } else {
                        function10 = function9;
                        function12 = function4;
                        function11 = function5;
                    }
                } else {
                    if ((i2 & 1) != 0) {
                        mm40VarL = s5x0.L(jm40Var, xfn.a(fetVar2).e, 0.0f, 2);
                        i3 &= -15;
                    }
                    cl5Var = ukd.f35823a;
                    if (i12 != 0) {
                        objP3 = fetVar2.P();
                        if (objP3 == cl5Var) {
                            objP3 = new ndm((byte) 6);
                            fetVar2.o0(objP3);
                        }
                        function9 = (Function0) objP3;
                    } else {
                        function9 = function3;
                    }
                    if (i4 != 0) {
                        objP2 = fetVar2.P();
                        if (objP2 == cl5Var) {
                            objP2 = new ndm((byte) 7);
                            fetVar2.o0(objP2);
                        }
                        function4 = (Function0) objP2;
                    }
                    if (i6 != 0) {
                        objP = fetVar2.P();
                        if (objP == cl5Var) {
                            objP = new ndm((byte) 8);
                            fetVar2.o0(objP);
                        }
                        function11 = (Function0) objP;
                        function10 = function9;
                        function12 = function4;
                    } else {
                        function10 = function9;
                        function12 = function4;
                        function11 = function5;
                    }
                }
                fetVar2.s();
                mm40 mm40VarE4 = o2e.e0(o7k0.d(mm40VarL, 1.0f), "DS_HEADER_BOX");
                tj30 tj30VarC5 = zq8.c(gqw0.f11754a, false);
                int iHashCode5 = Long.hashCode(fetVar2.T);
                bh90 bh90VarM5 = fetVar2.m();
                mm40 mm40VarC4 = kbc.c0(fetVar2, mm40VarE4);
                mkd.c0.getClass();
                fetVar2.i0();
                if (fetVar2.S) {
                    fetVar2.l(e7z.u1);
                } else {
                    fetVar2.r0();
                }
                jpm0.o(fetVar2, tj30VarC5, gqw0.x);
                jpm0.o(fetVar2, bh90VarM5, gqw0.w);
                jpm0.o(fetVar2, Integer.valueOf(iHashCode5), gqw0.y);
                jpm0.n(fetVar2);
                jpm0.o(fetVar2, mm40VarC4, gqw0.v);
                iOrdinal = kjmVar.ordinal();
                if (iOrdinal == 0) {
                    mm40VarL = mm40VarL;
                    function13 = function12;
                    z2 = true;
                    fetVar2.e0(1429894545);
                    int i119 = i3 & 112;
                    int i1110 = i3 >> 3;
                    i9 = (i1110 & 57344) | i119 | (i1110 & 896) | (i1110 & 7168);
                    if (jjmVar instanceof hjm) {
                        fetVar2.e0(1636722291);
                        hjm hjmVar9 = (hjm) jjmVar;
                        CharSequence charSequence5 = hjmVar9.f13167a;
                        o0x o0xVar5 = hjmVar9.d;
                        y3d y3dVar5 = hjmVar9.e;
                        xe9 xe9Var5 = hjmVar9.k;
                        xkb.o(jm40Var, charSequence5, hjmVar9.g, y3dVar5, o0xVar5, hjmVar9.f, hjmVar9.j, hjmVar9.h, hjmVar9.m, hjmVar9.c, xe9Var5, hjmVar9.i, hjmVar9.b, function13, function11, function10, fetVar, 0, (i9 & 64512) | ((i9 << 9) & 458752), 0);
                        fetVar2 = fetVar;
                        fetVar2.r(false);
                    } else {
                        if (!(jjmVar instanceof ijm)) {
                            throw b1j.f(1992458787, fetVar2, false);
                        }
                        fetVar2.e0(1637508141);
                        xkb.o(jm40Var, "", false, null, null, null, false, null, null, null, null, null, ((ijm) jjmVar).f14881a, null, null, null, fetVar, 920350128, 54, 57344);
                        fetVar2 = fetVar;
                        fetVar2.r(false);
                    }
                    fetVar2.r(false);
                } else {
                    if (iOrdinal != 1) {
                        throw b1j.f(-1477896380, fetVar2, false);
                    }
                    fetVar2.e0(1430179869);
                    int i1111 = i3 & 112;
                    int i1112 = i3 >> 3;
                    i10 = i1111 | (i1112 & 896) | (i1112 & 7168);
                    if (jjmVar instanceof hjm) {
                        fetVar2.e0(2084707219);
                        hjm hjmVar10 = (hjm) jjmVar;
                        z3 = false;
                        z2 = true;
                        slb.n(jm40Var, hjmVar10.f13167a, hjmVar10.d, hjmVar10.f, hjmVar10.k, hjmVar10.j, hjmVar10.c, hjmVar10.b, function12, function10, fetVar2, ((i10 << 15) & 234881024) | ((i10 << 21) & 1879048192), 0);
                        fetVar2.r(false);
                    } else {
                        z3 = false;
                        z2 = true;
                        if (!(jjmVar instanceof ijm)) {
                            throw b1j.f(-902584227, fetVar2, false);
                        }
                        fetVar2.e0(2085241907);
                        slb.n(jm40Var, "", null, null, null, false, null, ((ijm) jjmVar).f14881a, null, null, fetVar2, 1797552, 768);
                        fetVar2.r(false);
                    }
                    fetVar2.r(z3);
                    function13 = function12;
                    function11 = function11;
                    function10 = function10;
                }
                fetVar2.r(z2);
                mm40VarL = mm40VarL;
                function6 = function10;
                function7 = function13;
                function8 = function11;
            } else {
                fetVar2.X();
                function6 = function3;
                function7 = function4;
                function8 = function5;
            }
            yfe0VarU = fetVar2.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new hjl(mm40VarL, jjmVar, kjmVar, function6, function7, function8, i, i2, (byte) 2);
            }
        }
        i3 |= 3072;
        function3 = function0;
        i4 = i2 & 16;
        if (i4 != 0) {
            if ((i & 24576) == 0) {
                function4 = function1;
                if (fetVar2.i(function4)) {
                    i5 = 16384;
                } else {
                    i5 = 8192;
                }
                i3 |= i5;
            }
            i6 = i2 & 32;
            if (i6 != 0) {
                if ((196608 & i) == 0) {
                    function5 = function2;
                    if (fetVar2.i(function5)) {
                        i7 = 131072;
                    } else {
                        i7 = 65536;
                    }
                    i3 |= i7;
                }
                if ((74899 & i3) != 74898) {
                    z = true;
                } else {
                    z = false;
                }
                if (fetVar2.U(i3 & 1, z)) {
                    fetVar2.Z();
                    i8 = i & 1;
                    jm40Var = jm40.b;
                    if (i8 != 0) {
                        if ((i2 & 1) != 0) {
                            mm40VarL = s5x0.L(jm40Var, xfn.a(fetVar2).e, 0.0f, 2);
                            i3 &= -15;
                        }
                        cl5Var = ukd.f35823a;
                        if (i12 != 0) {
                            objP3 = fetVar2.P();
                            if (objP3 == cl5Var) {
                                objP3 = new ndm((byte) 6);
                                fetVar2.o0(objP3);
                            }
                            function9 = (Function0) objP3;
                        } else {
                            function9 = function3;
                        }
                        if (i4 != 0) {
                            objP2 = fetVar2.P();
                            if (objP2 == cl5Var) {
                                objP2 = new ndm((byte) 7);
                                fetVar2.o0(objP2);
                            }
                            function4 = (Function0) objP2;
                        }
                        if (i6 != 0) {
                            objP = fetVar2.P();
                            if (objP == cl5Var) {
                                objP = new ndm((byte) 8);
                                fetVar2.o0(objP);
                            }
                            function11 = (Function0) objP;
                            function10 = function9;
                            function12 = function4;
                        } else {
                            function10 = function9;
                            function12 = function4;
                            function11 = function5;
                        }
                    } else {
                        if ((i2 & 1) != 0) {
                            mm40VarL = s5x0.L(jm40Var, xfn.a(fetVar2).e, 0.0f, 2);
                            i3 &= -15;
                        }
                        cl5Var = ukd.f35823a;
                        if (i12 != 0) {
                            objP3 = fetVar2.P();
                            if (objP3 == cl5Var) {
                                objP3 = new ndm((byte) 6);
                                fetVar2.o0(objP3);
                            }
                            function9 = (Function0) objP3;
                        } else {
                            function9 = function3;
                        }
                        if (i4 != 0) {
                            objP2 = fetVar2.P();
                            if (objP2 == cl5Var) {
                                objP2 = new ndm((byte) 7);
                                fetVar2.o0(objP2);
                            }
                            function4 = (Function0) objP2;
                        }
                        if (i6 != 0) {
                            objP = fetVar2.P();
                            if (objP == cl5Var) {
                                objP = new ndm((byte) 8);
                                fetVar2.o0(objP);
                            }
                            function11 = (Function0) objP;
                            function10 = function9;
                            function12 = function4;
                        } else {
                            function10 = function9;
                            function12 = function4;
                            function11 = function5;
                        }
                    }
                    fetVar2.s();
                    mm40 mm40VarE5 = o2e.e0(o7k0.d(mm40VarL, 1.0f), "DS_HEADER_BOX");
                    tj30 tj30VarC6 = zq8.c(gqw0.f11754a, false);
                    int iHashCode6 = Long.hashCode(fetVar2.T);
                    bh90 bh90VarM6 = fetVar2.m();
                    mm40 mm40VarC5 = kbc.c0(fetVar2, mm40VarE5);
                    mkd.c0.getClass();
                    fetVar2.i0();
                    if (fetVar2.S) {
                        fetVar2.l(e7z.u1);
                    } else {
                        fetVar2.r0();
                    }
                    jpm0.o(fetVar2, tj30VarC6, gqw0.x);
                    jpm0.o(fetVar2, bh90VarM6, gqw0.w);
                    jpm0.o(fetVar2, Integer.valueOf(iHashCode6), gqw0.y);
                    jpm0.n(fetVar2);
                    jpm0.o(fetVar2, mm40VarC5, gqw0.v);
                    iOrdinal = kjmVar.ordinal();
                    if (iOrdinal == 0) {
                        mm40VarL = mm40VarL;
                        function13 = function12;
                        z2 = true;
                        fetVar2.e0(1429894545);
                        int i1113 = i3 & 112;
                        int i1114 = i3 >> 3;
                        i9 = (i1114 & 57344) | i1113 | (i1114 & 896) | (i1114 & 7168);
                        if (jjmVar instanceof hjm) {
                            fetVar2.e0(1636722291);
                            hjm hjmVar11 = (hjm) jjmVar;
                            CharSequence charSequence6 = hjmVar11.f13167a;
                            o0x o0xVar6 = hjmVar11.d;
                            y3d y3dVar6 = hjmVar11.e;
                            xe9 xe9Var6 = hjmVar11.k;
                            xkb.o(jm40Var, charSequence6, hjmVar11.g, y3dVar6, o0xVar6, hjmVar11.f, hjmVar11.j, hjmVar11.h, hjmVar11.m, hjmVar11.c, xe9Var6, hjmVar11.i, hjmVar11.b, function13, function11, function10, fetVar, 0, (i9 & 64512) | ((i9 << 9) & 458752), 0);
                            fetVar2 = fetVar;
                            fetVar2.r(false);
                        } else {
                            if (!(jjmVar instanceof ijm)) {
                                throw b1j.f(1992458787, fetVar2, false);
                            }
                            fetVar2.e0(1637508141);
                            xkb.o(jm40Var, "", false, null, null, null, false, null, null, null, null, null, ((ijm) jjmVar).f14881a, null, null, null, fetVar, 920350128, 54, 57344);
                            fetVar2 = fetVar;
                            fetVar2.r(false);
                        }
                        fetVar2.r(false);
                    } else {
                        if (iOrdinal != 1) {
                            throw b1j.f(-1477896380, fetVar2, false);
                        }
                        fetVar2.e0(1430179869);
                        int i1115 = i3 & 112;
                        int i1116 = i3 >> 3;
                        i10 = i1115 | (i1116 & 896) | (i1116 & 7168);
                        if (jjmVar instanceof hjm) {
                            fetVar2.e0(2084707219);
                            hjm hjmVar12 = (hjm) jjmVar;
                            z3 = false;
                            z2 = true;
                            slb.n(jm40Var, hjmVar12.f13167a, hjmVar12.d, hjmVar12.f, hjmVar12.k, hjmVar12.j, hjmVar12.c, hjmVar12.b, function12, function10, fetVar2, ((i10 << 15) & 234881024) | ((i10 << 21) & 1879048192), 0);
                            fetVar2.r(false);
                        } else {
                            z3 = false;
                            z2 = true;
                            if (!(jjmVar instanceof ijm)) {
                                throw b1j.f(-902584227, fetVar2, false);
                            }
                            fetVar2.e0(2085241907);
                            slb.n(jm40Var, "", null, null, null, false, null, ((ijm) jjmVar).f14881a, null, null, fetVar2, 1797552, 768);
                            fetVar2.r(false);
                        }
                        fetVar2.r(z3);
                        function13 = function12;
                        function11 = function11;
                        function10 = function10;
                    }
                    fetVar2.r(z2);
                    mm40VarL = mm40VarL;
                    function6 = function10;
                    function7 = function13;
                    function8 = function11;
                } else {
                    fetVar2.X();
                    function6 = function3;
                    function7 = function4;
                    function8 = function5;
                }
                yfe0VarU = fetVar2.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new hjl(mm40VarL, jjmVar, kjmVar, function6, function7, function8, i, i2, (byte) 2);
                }
            }
            i3 |= 196608;
            function5 = function2;
            if ((74899 & i3) != 74898) {
                z = true;
            } else {
                z = false;
            }
            if (fetVar2.U(i3 & 1, z)) {
                fetVar2.Z();
                i8 = i & 1;
                jm40Var = jm40.b;
                if (i8 != 0) {
                    if ((i2 & 1) != 0) {
                        mm40VarL = s5x0.L(jm40Var, xfn.a(fetVar2).e, 0.0f, 2);
                        i3 &= -15;
                    }
                    cl5Var = ukd.f35823a;
                    if (i12 != 0) {
                        objP3 = fetVar2.P();
                        if (objP3 == cl5Var) {
                            objP3 = new ndm((byte) 6);
                            fetVar2.o0(objP3);
                        }
                        function9 = (Function0) objP3;
                    } else {
                        function9 = function3;
                    }
                    if (i4 != 0) {
                        objP2 = fetVar2.P();
                        if (objP2 == cl5Var) {
                            objP2 = new ndm((byte) 7);
                            fetVar2.o0(objP2);
                        }
                        function4 = (Function0) objP2;
                    }
                    if (i6 != 0) {
                        objP = fetVar2.P();
                        if (objP == cl5Var) {
                            objP = new ndm((byte) 8);
                            fetVar2.o0(objP);
                        }
                        function11 = (Function0) objP;
                        function10 = function9;
                        function12 = function4;
                    } else {
                        function10 = function9;
                        function12 = function4;
                        function11 = function5;
                    }
                } else {
                    if ((i2 & 1) != 0) {
                        mm40VarL = s5x0.L(jm40Var, xfn.a(fetVar2).e, 0.0f, 2);
                        i3 &= -15;
                    }
                    cl5Var = ukd.f35823a;
                    if (i12 != 0) {
                        objP3 = fetVar2.P();
                        if (objP3 == cl5Var) {
                            objP3 = new ndm((byte) 6);
                            fetVar2.o0(objP3);
                        }
                        function9 = (Function0) objP3;
                    } else {
                        function9 = function3;
                    }
                    if (i4 != 0) {
                        objP2 = fetVar2.P();
                        if (objP2 == cl5Var) {
                            objP2 = new ndm((byte) 7);
                            fetVar2.o0(objP2);
                        }
                        function4 = (Function0) objP2;
                    }
                    if (i6 != 0) {
                        objP = fetVar2.P();
                        if (objP == cl5Var) {
                            objP = new ndm((byte) 8);
                            fetVar2.o0(objP);
                        }
                        function11 = (Function0) objP;
                        function10 = function9;
                        function12 = function4;
                    } else {
                        function10 = function9;
                        function12 = function4;
                        function11 = function5;
                    }
                }
                fetVar2.s();
                mm40 mm40VarE6 = o2e.e0(o7k0.d(mm40VarL, 1.0f), "DS_HEADER_BOX");
                tj30 tj30VarC7 = zq8.c(gqw0.f11754a, false);
                int iHashCode7 = Long.hashCode(fetVar2.T);
                bh90 bh90VarM7 = fetVar2.m();
                mm40 mm40VarC6 = kbc.c0(fetVar2, mm40VarE6);
                mkd.c0.getClass();
                fetVar2.i0();
                if (fetVar2.S) {
                    fetVar2.l(e7z.u1);
                } else {
                    fetVar2.r0();
                }
                jpm0.o(fetVar2, tj30VarC7, gqw0.x);
                jpm0.o(fetVar2, bh90VarM7, gqw0.w);
                jpm0.o(fetVar2, Integer.valueOf(iHashCode7), gqw0.y);
                jpm0.n(fetVar2);
                jpm0.o(fetVar2, mm40VarC6, gqw0.v);
                iOrdinal = kjmVar.ordinal();
                if (iOrdinal == 0) {
                    mm40VarL = mm40VarL;
                    function13 = function12;
                    z2 = true;
                    fetVar2.e0(1429894545);
                    int i1117 = i3 & 112;
                    int i1118 = i3 >> 3;
                    i9 = (i1118 & 57344) | i1117 | (i1118 & 896) | (i1118 & 7168);
                    if (jjmVar instanceof hjm) {
                        fetVar2.e0(1636722291);
                        hjm hjmVar13 = (hjm) jjmVar;
                        CharSequence charSequence7 = hjmVar13.f13167a;
                        o0x o0xVar7 = hjmVar13.d;
                        y3d y3dVar7 = hjmVar13.e;
                        xe9 xe9Var7 = hjmVar13.k;
                        xkb.o(jm40Var, charSequence7, hjmVar13.g, y3dVar7, o0xVar7, hjmVar13.f, hjmVar13.j, hjmVar13.h, hjmVar13.m, hjmVar13.c, xe9Var7, hjmVar13.i, hjmVar13.b, function13, function11, function10, fetVar, 0, (i9 & 64512) | ((i9 << 9) & 458752), 0);
                        fetVar2 = fetVar;
                        fetVar2.r(false);
                    } else {
                        if (!(jjmVar instanceof ijm)) {
                            throw b1j.f(1992458787, fetVar2, false);
                        }
                        fetVar2.e0(1637508141);
                        xkb.o(jm40Var, "", false, null, null, null, false, null, null, null, null, null, ((ijm) jjmVar).f14881a, null, null, null, fetVar, 920350128, 54, 57344);
                        fetVar2 = fetVar;
                        fetVar2.r(false);
                    }
                    fetVar2.r(false);
                } else {
                    if (iOrdinal != 1) {
                        throw b1j.f(-1477896380, fetVar2, false);
                    }
                    fetVar2.e0(1430179869);
                    int i1119 = i3 & 112;
                    int i11110 = i3 >> 3;
                    i10 = i1119 | (i11110 & 896) | (i11110 & 7168);
                    if (jjmVar instanceof hjm) {
                        fetVar2.e0(2084707219);
                        hjm hjmVar14 = (hjm) jjmVar;
                        z3 = false;
                        z2 = true;
                        slb.n(jm40Var, hjmVar14.f13167a, hjmVar14.d, hjmVar14.f, hjmVar14.k, hjmVar14.j, hjmVar14.c, hjmVar14.b, function12, function10, fetVar2, ((i10 << 15) & 234881024) | ((i10 << 21) & 1879048192), 0);
                        fetVar2.r(false);
                    } else {
                        z3 = false;
                        z2 = true;
                        if (!(jjmVar instanceof ijm)) {
                            throw b1j.f(-902584227, fetVar2, false);
                        }
                        fetVar2.e0(2085241907);
                        slb.n(jm40Var, "", null, null, null, false, null, ((ijm) jjmVar).f14881a, null, null, fetVar2, 1797552, 768);
                        fetVar2.r(false);
                    }
                    fetVar2.r(z3);
                    function13 = function12;
                    function11 = function11;
                    function10 = function10;
                }
                fetVar2.r(z2);
                mm40VarL = mm40VarL;
                function6 = function10;
                function7 = function13;
                function8 = function11;
            } else {
                fetVar2.X();
                function6 = function3;
                function7 = function4;
                function8 = function5;
            }
            yfe0VarU = fetVar2.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new hjl(mm40VarL, jjmVar, kjmVar, function6, function7, function8, i, i2, (byte) 2);
            }
        }
        i3 |= 24576;
        function4 = function1;
        i6 = i2 & 32;
        if (i6 != 0) {
            if ((196608 & i) == 0) {
                function5 = function2;
                if (fetVar2.i(function5)) {
                    i7 = 131072;
                } else {
                    i7 = 65536;
                }
                i3 |= i7;
            }
            if ((74899 & i3) != 74898) {
                z = true;
            } else {
                z = false;
            }
            if (fetVar2.U(i3 & 1, z)) {
                fetVar2.Z();
                i8 = i & 1;
                jm40Var = jm40.b;
                if (i8 != 0) {
                    if ((i2 & 1) != 0) {
                        mm40VarL = s5x0.L(jm40Var, xfn.a(fetVar2).e, 0.0f, 2);
                        i3 &= -15;
                    }
                    cl5Var = ukd.f35823a;
                    if (i12 != 0) {
                        objP3 = fetVar2.P();
                        if (objP3 == cl5Var) {
                            objP3 = new ndm((byte) 6);
                            fetVar2.o0(objP3);
                        }
                        function9 = (Function0) objP3;
                    } else {
                        function9 = function3;
                    }
                    if (i4 != 0) {
                        objP2 = fetVar2.P();
                        if (objP2 == cl5Var) {
                            objP2 = new ndm((byte) 7);
                            fetVar2.o0(objP2);
                        }
                        function4 = (Function0) objP2;
                    }
                    if (i6 != 0) {
                        objP = fetVar2.P();
                        if (objP == cl5Var) {
                            objP = new ndm((byte) 8);
                            fetVar2.o0(objP);
                        }
                        function11 = (Function0) objP;
                        function10 = function9;
                        function12 = function4;
                    } else {
                        function10 = function9;
                        function12 = function4;
                        function11 = function5;
                    }
                } else {
                    if ((i2 & 1) != 0) {
                        mm40VarL = s5x0.L(jm40Var, xfn.a(fetVar2).e, 0.0f, 2);
                        i3 &= -15;
                    }
                    cl5Var = ukd.f35823a;
                    if (i12 != 0) {
                        objP3 = fetVar2.P();
                        if (objP3 == cl5Var) {
                            objP3 = new ndm((byte) 6);
                            fetVar2.o0(objP3);
                        }
                        function9 = (Function0) objP3;
                    } else {
                        function9 = function3;
                    }
                    if (i4 != 0) {
                        objP2 = fetVar2.P();
                        if (objP2 == cl5Var) {
                            objP2 = new ndm((byte) 7);
                            fetVar2.o0(objP2);
                        }
                        function4 = (Function0) objP2;
                    }
                    if (i6 != 0) {
                        objP = fetVar2.P();
                        if (objP == cl5Var) {
                            objP = new ndm((byte) 8);
                            fetVar2.o0(objP);
                        }
                        function11 = (Function0) objP;
                        function10 = function9;
                        function12 = function4;
                    } else {
                        function10 = function9;
                        function12 = function4;
                        function11 = function5;
                    }
                }
                fetVar2.s();
                mm40 mm40VarE7 = o2e.e0(o7k0.d(mm40VarL, 1.0f), "DS_HEADER_BOX");
                tj30 tj30VarC8 = zq8.c(gqw0.f11754a, false);
                int iHashCode8 = Long.hashCode(fetVar2.T);
                bh90 bh90VarM8 = fetVar2.m();
                mm40 mm40VarC7 = kbc.c0(fetVar2, mm40VarE7);
                mkd.c0.getClass();
                fetVar2.i0();
                if (fetVar2.S) {
                    fetVar2.l(e7z.u1);
                } else {
                    fetVar2.r0();
                }
                jpm0.o(fetVar2, tj30VarC8, gqw0.x);
                jpm0.o(fetVar2, bh90VarM8, gqw0.w);
                jpm0.o(fetVar2, Integer.valueOf(iHashCode8), gqw0.y);
                jpm0.n(fetVar2);
                jpm0.o(fetVar2, mm40VarC7, gqw0.v);
                iOrdinal = kjmVar.ordinal();
                if (iOrdinal == 0) {
                    mm40VarL = mm40VarL;
                    function13 = function12;
                    z2 = true;
                    fetVar2.e0(1429894545);
                    int i11111 = i3 & 112;
                    int i11112 = i3 >> 3;
                    i9 = (i11112 & 57344) | i11111 | (i11112 & 896) | (i11112 & 7168);
                    if (jjmVar instanceof hjm) {
                        fetVar2.e0(1636722291);
                        hjm hjmVar15 = (hjm) jjmVar;
                        CharSequence charSequence8 = hjmVar15.f13167a;
                        o0x o0xVar8 = hjmVar15.d;
                        y3d y3dVar8 = hjmVar15.e;
                        xe9 xe9Var8 = hjmVar15.k;
                        xkb.o(jm40Var, charSequence8, hjmVar15.g, y3dVar8, o0xVar8, hjmVar15.f, hjmVar15.j, hjmVar15.h, hjmVar15.m, hjmVar15.c, xe9Var8, hjmVar15.i, hjmVar15.b, function13, function11, function10, fetVar, 0, (i9 & 64512) | ((i9 << 9) & 458752), 0);
                        fetVar2 = fetVar;
                        fetVar2.r(false);
                    } else {
                        if (!(jjmVar instanceof ijm)) {
                            throw b1j.f(1992458787, fetVar2, false);
                        }
                        fetVar2.e0(1637508141);
                        xkb.o(jm40Var, "", false, null, null, null, false, null, null, null, null, null, ((ijm) jjmVar).f14881a, null, null, null, fetVar, 920350128, 54, 57344);
                        fetVar2 = fetVar;
                        fetVar2.r(false);
                    }
                    fetVar2.r(false);
                } else {
                    if (iOrdinal != 1) {
                        throw b1j.f(-1477896380, fetVar2, false);
                    }
                    fetVar2.e0(1430179869);
                    int i11113 = i3 & 112;
                    int i11114 = i3 >> 3;
                    i10 = i11113 | (i11114 & 896) | (i11114 & 7168);
                    if (jjmVar instanceof hjm) {
                        fetVar2.e0(2084707219);
                        hjm hjmVar16 = (hjm) jjmVar;
                        z3 = false;
                        z2 = true;
                        slb.n(jm40Var, hjmVar16.f13167a, hjmVar16.d, hjmVar16.f, hjmVar16.k, hjmVar16.j, hjmVar16.c, hjmVar16.b, function12, function10, fetVar2, ((i10 << 15) & 234881024) | ((i10 << 21) & 1879048192), 0);
                        fetVar2.r(false);
                    } else {
                        z3 = false;
                        z2 = true;
                        if (!(jjmVar instanceof ijm)) {
                            throw b1j.f(-902584227, fetVar2, false);
                        }
                        fetVar2.e0(2085241907);
                        slb.n(jm40Var, "", null, null, null, false, null, ((ijm) jjmVar).f14881a, null, null, fetVar2, 1797552, 768);
                        fetVar2.r(false);
                    }
                    fetVar2.r(z3);
                    function13 = function12;
                    function11 = function11;
                    function10 = function10;
                }
                fetVar2.r(z2);
                mm40VarL = mm40VarL;
                function6 = function10;
                function7 = function13;
                function8 = function11;
            } else {
                fetVar2.X();
                function6 = function3;
                function7 = function4;
                function8 = function5;
            }
            yfe0VarU = fetVar2.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new hjl(mm40VarL, jjmVar, kjmVar, function6, function7, function8, i, i2, (byte) 2);
            }
        }
        i3 |= 196608;
        function5 = function2;
        if ((74899 & i3) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (fetVar2.U(i3 & 1, z)) {
            fetVar2.Z();
            i8 = i & 1;
            jm40Var = jm40.b;
            if (i8 != 0) {
                if ((i2 & 1) != 0) {
                    mm40VarL = s5x0.L(jm40Var, xfn.a(fetVar2).e, 0.0f, 2);
                    i3 &= -15;
                }
                cl5Var = ukd.f35823a;
                if (i12 != 0) {
                    objP3 = fetVar2.P();
                    if (objP3 == cl5Var) {
                        objP3 = new ndm((byte) 6);
                        fetVar2.o0(objP3);
                    }
                    function9 = (Function0) objP3;
                } else {
                    function9 = function3;
                }
                if (i4 != 0) {
                    objP2 = fetVar2.P();
                    if (objP2 == cl5Var) {
                        objP2 = new ndm((byte) 7);
                        fetVar2.o0(objP2);
                    }
                    function4 = (Function0) objP2;
                }
                if (i6 != 0) {
                    objP = fetVar2.P();
                    if (objP == cl5Var) {
                        objP = new ndm((byte) 8);
                        fetVar2.o0(objP);
                    }
                    function11 = (Function0) objP;
                    function10 = function9;
                    function12 = function4;
                } else {
                    function10 = function9;
                    function12 = function4;
                    function11 = function5;
                }
            } else {
                if ((i2 & 1) != 0) {
                    mm40VarL = s5x0.L(jm40Var, xfn.a(fetVar2).e, 0.0f, 2);
                    i3 &= -15;
                }
                cl5Var = ukd.f35823a;
                if (i12 != 0) {
                    objP3 = fetVar2.P();
                    if (objP3 == cl5Var) {
                        objP3 = new ndm((byte) 6);
                        fetVar2.o0(objP3);
                    }
                    function9 = (Function0) objP3;
                } else {
                    function9 = function3;
                }
                if (i4 != 0) {
                    objP2 = fetVar2.P();
                    if (objP2 == cl5Var) {
                        objP2 = new ndm((byte) 7);
                        fetVar2.o0(objP2);
                    }
                    function4 = (Function0) objP2;
                }
                if (i6 != 0) {
                    objP = fetVar2.P();
                    if (objP == cl5Var) {
                        objP = new ndm((byte) 8);
                        fetVar2.o0(objP);
                    }
                    function11 = (Function0) objP;
                    function10 = function9;
                    function12 = function4;
                } else {
                    function10 = function9;
                    function12 = function4;
                    function11 = function5;
                }
            }
            fetVar2.s();
            mm40 mm40VarE8 = o2e.e0(o7k0.d(mm40VarL, 1.0f), "DS_HEADER_BOX");
            tj30 tj30VarC9 = zq8.c(gqw0.f11754a, false);
            int iHashCode9 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM9 = fetVar2.m();
            mm40 mm40VarC8 = kbc.c0(fetVar2, mm40VarE8);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC9, gqw0.x);
            jpm0.o(fetVar2, bh90VarM9, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode9), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC8, gqw0.v);
            iOrdinal = kjmVar.ordinal();
            if (iOrdinal == 0) {
                mm40VarL = mm40VarL;
                function13 = function12;
                z2 = true;
                fetVar2.e0(1429894545);
                int i11115 = i3 & 112;
                int i11116 = i3 >> 3;
                i9 = (i11116 & 57344) | i11115 | (i11116 & 896) | (i11116 & 7168);
                if (jjmVar instanceof hjm) {
                    fetVar2.e0(1636722291);
                    hjm hjmVar17 = (hjm) jjmVar;
                    CharSequence charSequence9 = hjmVar17.f13167a;
                    o0x o0xVar9 = hjmVar17.d;
                    y3d y3dVar9 = hjmVar17.e;
                    xe9 xe9Var9 = hjmVar17.k;
                    xkb.o(jm40Var, charSequence9, hjmVar17.g, y3dVar9, o0xVar9, hjmVar17.f, hjmVar17.j, hjmVar17.h, hjmVar17.m, hjmVar17.c, xe9Var9, hjmVar17.i, hjmVar17.b, function13, function11, function10, fetVar, 0, (i9 & 64512) | ((i9 << 9) & 458752), 0);
                    fetVar2 = fetVar;
                    fetVar2.r(false);
                } else {
                    if (!(jjmVar instanceof ijm)) {
                        throw b1j.f(1992458787, fetVar2, false);
                    }
                    fetVar2.e0(1637508141);
                    xkb.o(jm40Var, "", false, null, null, null, false, null, null, null, null, null, ((ijm) jjmVar).f14881a, null, null, null, fetVar, 920350128, 54, 57344);
                    fetVar2 = fetVar;
                    fetVar2.r(false);
                }
                fetVar2.r(false);
            } else {
                if (iOrdinal != 1) {
                    throw b1j.f(-1477896380, fetVar2, false);
                }
                fetVar2.e0(1430179869);
                int i11117 = i3 & 112;
                int i11118 = i3 >> 3;
                i10 = i11117 | (i11118 & 896) | (i11118 & 7168);
                if (jjmVar instanceof hjm) {
                    fetVar2.e0(2084707219);
                    hjm hjmVar18 = (hjm) jjmVar;
                    z3 = false;
                    z2 = true;
                    slb.n(jm40Var, hjmVar18.f13167a, hjmVar18.d, hjmVar18.f, hjmVar18.k, hjmVar18.j, hjmVar18.c, hjmVar18.b, function12, function10, fetVar2, ((i10 << 15) & 234881024) | ((i10 << 21) & 1879048192), 0);
                    fetVar2.r(false);
                } else {
                    z3 = false;
                    z2 = true;
                    if (!(jjmVar instanceof ijm)) {
                        throw b1j.f(-902584227, fetVar2, false);
                    }
                    fetVar2.e0(2085241907);
                    slb.n(jm40Var, "", null, null, null, false, null, ((ijm) jjmVar).f14881a, null, null, fetVar2, 1797552, 768);
                    fetVar2.r(false);
                }
                fetVar2.r(z3);
                function13 = function12;
                function11 = function11;
                function10 = function10;
            }
            fetVar2.r(z2);
            mm40VarL = mm40VarL;
            function6 = function10;
            function7 = function13;
            function8 = function11;
        } else {
            fetVar2.X();
            function6 = function3;
            function7 = function4;
            function8 = function5;
        }
        yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new hjl(mm40VarL, jjmVar, kjmVar, function6, function7, function8, i, i2, (byte) 2);
        }
    }

    public static final void i(mm40 mm40Var, String str, String str2, a4x a4xVar, a4x a4xVar2, String str3, String str4, String str5, String str6, boolean z, boolean z2, fet fetVar, int i) {
        int i2;
        String str7;
        float f;
        fet fetVar2 = fetVar;
        str.getClass();
        str2.getClass();
        a4xVar.getClass();
        a4xVar2.getClass();
        str4.getClass();
        str5.getClass();
        str6.getClass();
        fetVar2.g0(-1906401811);
        if ((i & 6) == 0) {
            i2 = (fetVar2.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.g(str2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar2.g(a4xVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar2.g(a4xVar2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar2.g(str3) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= fetVar2.g(str4) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            str7 = str5;
            i2 |= fetVar2.g(str7) ? 8388608 : 4194304;
        } else {
            str7 = str5;
        }
        if ((i & 100663296) == 0) {
            i2 |= fetVar2.g(str6) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i2 |= fetVar2.h(z) ? 536870912 : 268435456;
        }
        int i3 = (fetVar2.h(z2) ? 4 : 2) | (fetVar2.h(true) ? 32 : 16);
        if (fetVar2.U(i2 & 1, ((i2 & 306783379) == 306783378 && (i3 & 19) == 18) ? false : true)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(s5x0.L(mm40VarD, 12.0f, 0.0f, 2), 0.0f, 0.0f, 0.0f, 8.0f, 7);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarN);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z3 = fetVar2.S;
            pcy pcyVar = e7z.u1;
            if (z3) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar2, thg0VarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            fetVar2.e0(1178309373);
            int i4 = i2;
            boolean z4 = ((458752 & i2) == 131072) | ((i4 & 3670016) == 1048576);
            Object objP = fetVar2.P();
            if (z4 || objP == ukd.f35823a) {
                if (str3.length() <= 0 || str4.length() <= 0) {
                    f = (str3.length() <= 0 && str4.length() <= 0) ? 100.0f : 118.0f;
                } else {
                    f = 136.0f;
                }
                objP = twn.j(f, fetVar2);
            }
            float f2 = ((ycl) objP).f42389a;
            bhm bhmVar = bhm.b;
            jm40 jm40Var = jm40.b;
            jeb.r(o7k0.e(s5x0.L(jm40Var, 4.0f, 0.0f, 2), f2), bhmVar, fetVar2, 48);
            fetVar2.r(false);
            mm40 mm40VarN2 = s5x0.N(o7k0.d(jm40Var, 1.0f), 4.0f, 0.0f, 0.0f, 0.0f, 14);
            x5d x5dVarA = w5d.a(new qw3(4.0f, false, new gne(gqw0.k, (byte) 11)), gqw0.m, fetVar2, 0);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarN2);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar4);
            int i5 = i4 >> 12;
            p(i5 & 112, fetVar2, null, str3);
            int i6 = i4 >> 3;
            int i7 = i4 >> 15;
            s(null, str, a4xVar, str7, z, fetVar2, (i5 & 7168) | (i4 & 112) | (i6 & 896) | (i7 & 57344));
            fetVar2 = fetVar;
            s(null, str2, a4xVar2, str6, z2, fetVar2, (i6 & 112) | ((i4 >> 6) & 896) | (i7 & 7168) | (57344 & (i3 << 12)));
            p(i7 & 112, fetVar2, null, str4);
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new mme(mm40Var, str, str2, a4xVar, a4xVar2, str3, str4, str5, str6, z, z2, i);
        }
    }

    public static final void j(mm40 mm40Var, v1o0 v1o0Var, boolean z, Function1 function1, Function1 function2, fet fetVar, int i) {
        int i2;
        Object obj;
        float f;
        ugd ugdVarM;
        v1o0Var.getClass();
        function1.getClass();
        fetVar.g0(-918280403);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        byte b = 16;
        if ((i & 48) == 0) {
            i2 |= fetVar.g(v1o0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.h(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(function1) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            obj = function2;
            i2 |= fetVar.i(obj) ? 16384 : 8192;
        } else {
            obj = function2;
        }
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            if (v1o0Var instanceof q1o0) {
                zcl zclVar = qmk.f28987a;
                f = 16.0f;
            } else {
                zcl zclVar2 = qmk.f28987a;
                f = 20.0f;
            }
            boolean z2 = ((i2 & 7168) == 2048) | ((i2 & 112) == 32);
            Object objP = fetVar.P();
            if (z2 || objP == ukd.f35823a) {
                objP = new gnm(function1, v1o0Var, (byte) 12);
                fetVar.o0(objP);
            }
            mm40 mm40VarE0 = o2e.e0(y860.W(mm40Var, null, null, false, null, (Function0) objP, 28), "SPORT_SYNTHETIC_EVENT_CARD");
            if (v1o0Var instanceof s1o0) {
                fetVar.e0(-1843995262);
                ugdVarM = u1c.M(-482706572, new mxm(v1o0Var, (byte) 8), fetVar);
                fetVar.r(false);
            } else {
                fetVar.e0(-1843877927);
                fetVar.r(false);
                ugdVarM = null;
            }
            a8k0.n(mm40VarE0, f, 0L, ugdVarM, u1c.M(-1699850802, new wvm(v1o0Var, function1, (byte) 20), fetVar), u1c.M(-798782867, new jv1(v1o0Var, z, b), fetVar), u1c.M(102285068, new i4a0((Object) v1o0Var, z, (Object) function1, obj, (byte) 27), fetVar), fetVar, 1794048, 4);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new mg((Object) mm40Var, (Object) v1o0Var, z, function1, (wdr) function2, i, (byte) 15);
        }
    }

    public static final void k(mm40 mm40Var, u6n u6nVar, fet fetVar, int i) {
        mm40 mm40Var2;
        zcl zclVar;
        u6nVar.getClass();
        fetVar.g0(2054946623);
        int i2 = i | 6 | (fetVar.g(u6nVar) ? 32 : 16);
        byte b = 14;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            d4d d4dVar = u6nVar.f35144a;
            w6n w6nVar = u6nVar.b;
            d4dVar.getClass();
            w6nVar.getClass();
            long jY = ibc.Y(d4dVar, fetVar);
            boolean zE = fetVar.e(d4dVar.ordinal()) | fetVar.e(w6nVar.ordinal());
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (zE || objP == obj) {
                float fI0 = vtb.i0(w6nVar);
                switch (w6nVar.ordinal()) {
                    case 0:
                        zclVar = qmk.l;
                        break;
                    case 1:
                        zclVar = qmk.k;
                        break;
                    case 2:
                        zclVar = qmk.k;
                        break;
                    case 3:
                        zclVar = qmk.i;
                        break;
                    case 4:
                        zclVar = qmk.i;
                        break;
                    case 5:
                        zclVar = qmk.g;
                        break;
                    case 6:
                        zclVar = qmk.g;
                        break;
                    case 7:
                        zclVar = qmk.f;
                        break;
                    case 8:
                        zclVar = qmk.f;
                        break;
                    case 9:
                        zclVar = qmk.e;
                        break;
                    case 10:
                        zclVar = qmk.e;
                        break;
                    case 11:
                        zclVar = qmk.d;
                        break;
                    case 12:
                        zclVar = qmk.d;
                        break;
                    case 13:
                        zclVar = qmk.c;
                        break;
                    default:
                        t9f.b();
                        return;
                }
                objP = new s6n(fI0, jY, zclVar);
                fetVar.o0(objP);
            }
            s6n s6nVar = (s6n) objP;
            boolean zG = fetVar.g(s6nVar);
            Object objP2 = fetVar.P();
            jm40 jm40Var = jm40.b;
            if (zG || objP2 == obj) {
                mm40 mm40VarN = o7k0.n(jm40Var, s6nVar.f31712a);
                zcl zclVar2 = s6nVar.c;
                ugg0 ugg0Var = vgg0.f37379a;
                objP2 = o2e.e0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarN), "DS_SQUARE_TEAM_LOGO").e(jm40Var);
                fetVar.o0(objP2);
            }
            mm40 mm40Var3 = (mm40) objP2;
            Object obj2 = u6nVar.c;
            if (obj2 != null) {
                if (obj2 instanceof b280) {
                    fetVar.e0(-1548484167);
                    boolean zG2 = fetVar.g(obj2);
                    Object objP3 = fetVar.P();
                    if (zG2 || objP3 == obj) {
                        objP3 = new edl(obj2, (byte) 23);
                        fetVar.o0(objP3);
                    }
                    j0x.b(a8k0.F(((b280) obj2).f1842a, 0, fetVar), null, pai0.a(mm40Var3, false, (Function1) objP3), null, null, 0.0f, null, fetVar, 56, 120);
                    fetVar.r(false);
                } else if (obj2 instanceof c280) {
                    fetVar.e0(-1548151847);
                    Object objP4 = fetVar.P();
                    if (objP4 == obj) {
                        objP4 = androidx.compose.runtime.e.e(Boolean.FALSE);
                        fetVar.o0(objP4);
                    }
                    pz40 pz40Var = (pz40) objP4;
                    c280 c280Var = (c280) obj2;
                    oil oilVarT = ju70.T(a8k0.F(c280Var.b, 0, fetVar), new m78(s6nVar.b, 5), null, 10);
                    boolean zG3 = fetVar.g(obj2);
                    Object objP5 = fetVar.P();
                    if (zG3 || objP5 == obj) {
                        objP5 = new dpl(obj2, (Object) pz40Var, (byte) 20);
                        fetVar.o0(objP5);
                    }
                    mm40 mm40VarA = pai0.a(mm40Var3, false, (Function1) objP5);
                    k1x k1xVar = new k1x((Context) fetVar.k(dy2.b));
                    k1xVar.c = c280Var.f3613a;
                    o1x o1xVarA = k1xVar.a();
                    pge pgeVar = gqw0.A;
                    Object objP6 = fetVar.P();
                    if (objP6 == obj) {
                        objP6 = new wil(pz40Var, (byte) 13);
                        fetVar.o0(objP6);
                    }
                    Function1 function1 = (Function1) objP6;
                    Object objP7 = fetVar.P();
                    if (objP7 == obj) {
                        objP7 = new wil(pz40Var, b);
                        fetVar.o0(objP7);
                    }
                    k7x.b(o1xVarA, null, mm40VarA, oilVarT, oilVarT, oilVarT, null, function1, (Function1) objP7, null, pgeVar, null, fetVar, 113545264, 6, 31296);
                    fetVar.r(false);
                }
                mm40Var2 = jm40Var;
            }
            throw b1j.f(-881236986, fetVar, false);
        }
        fetVar.X();
        mm40Var2 = mm40Var;
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new d0n((byte) 14, i, mm40Var2, u6nVar);
        }
    }

    public static final void l(l7m0 l7m0Var, Function0 function0, Function0 function1, fet fetVar, int i) {
        l7m0Var.getClass();
        function0.getClass();
        function1.getClass();
        fetVar.g0(-950117906);
        byte b = 2;
        int i2 = i | (fetVar.g(l7m0Var) ? 4 : 2) | (fetVar.i(function0) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            jyn jynVar = (jyn) l7m0Var.getValue();
            WeakHashMap weakHashMap = djv0.w;
            m8x.y(j120.k0(jm40.b, zcm0.i(fetVar).g), null, u1c.M(1888840179, new ann(jynVar, function0, function1, b), fetVar), null, null, 0, ((ThemeColors) fetVar.k(zaq0.b)).getBackgroundContent(), 0L, null, q8a.c, fetVar, 805306752, 442);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dyn(l7m0Var, function0, function1, i, (byte) 0);
        }
    }

    public static final void m(l7m0 l7m0Var, qdz qdzVar, Function1 function1, Function1 function2, fet fetVar, int i) {
        l7m0Var.getClass();
        qdzVar.getClass();
        function1.getClass();
        function2.getClass();
        fetVar.g0(982132012);
        int i2 = i | (fetVar.g(l7m0Var) ? 4 : 2) | (fetVar.g(qdzVar) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128) | (fetVar.i(function2) ? 2048 : 1024);
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            float fH0 = lgb.h0(fetVar);
            zcl zclVar = qmk.f28987a;
            float f = 176.0f + fH0;
            float f2 = 56.0f + fH0;
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = jgk0.b(new plh(l7m0Var, (byte) 20));
                fetVar.o0(objP);
            }
            m0x0.d(null, f, ((StaticColors) fetVar.k(m8m0.f21378a)).m121getTransparent0d7_KjU(), ((ThemeColors) fetVar.k(zaq0.b)).getBackground(), false, 12.0f, null, 0L, 0.0f, null, null, u1c.M(-453381351, new lkb(l7m0Var, f, f2, function1, (byte) 1), fetVar), u1c.M(-1343920225, new rpk(ddz.a(0, 0, fetVar, 0, 3), qdzVar, function1, function2, (l7m0) objP, l7m0Var, (byte) 1), fetVar), fetVar, 24576, 432, 1985);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new keg(l7m0Var, qdzVar, function1, function2, i, (byte) 9);
        }
    }

    public static final void n(boolean z, Function0 function0, Function0 function1, fet fetVar, int i, int i2) {
        int i3;
        Function0 function2;
        Function0 function3;
        pz40 pz40Var;
        function0.getClass();
        fetVar.g0(-1621370555);
        int i4 = i | (fetVar.h(z) ? 4 : 2) | (fetVar.i(function0) ? 32 : 16);
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 = i4 | 384;
        } else {
            i3 = i4 | (fetVar.i(function1) ? 256 : 128);
        }
        int i6 = i3;
        char c = 1;
        if (fetVar.U(i6 & 1, (i6 & 147) != 146)) {
            cl5 cl5Var = ukd.f35823a;
            if (i5 != 0) {
                Object objP = fetVar.P();
                if (objP == cl5Var) {
                    objP = new dfp(c == true ? 1 : 0);
                    fetVar.o0(objP);
                }
                function3 = (Function0) objP;
            } else {
                function3 = function1;
            }
            wpq wpqVar = (wpq) fetVar.k(bmd.i);
            pz40 pz40VarU = g8x.U(null, fetVar, 1);
            pz40 pz40VarF = androidx.compose.runtime.e.f(function3, fetVar);
            Boolean boolValueOf = Boolean.valueOf(z);
            boolean zG = ((i6 & 14) == 4) | fetVar.g(pz40VarU) | fetVar.i(wpqVar) | fetVar.g(pz40VarF);
            Object objP2 = fetVar.P();
            if (zG || objP2 == cl5Var) {
                pz40Var = pz40VarU;
                tu3 tu3Var = new tu3(z, (Object) pz40Var, (Object) wpqVar, (Object) pz40VarF, (yje) null, (byte) 3);
                fetVar.o0(tu3Var);
                objP2 = tu3Var;
            } else {
                pz40Var = pz40VarU;
            }
            m0x0.t(fetVar, boolValueOf, (Function2) objP2);
            int i7 = i6 & 112;
            t(z, function0, fetVar, i6 & 126);
            if (Build.VERSION.SDK_INT >= 33) {
                fetVar.e0(-1047096140);
                u(z && !((tly) pz40Var.getValue()).f34169a, function0, fetVar, i7);
                fetVar.r(false);
            } else {
                fetVar.e0(-1046933731);
                fetVar.r(false);
            }
            function2 = function3;
        } else {
            fetVar.X();
            function2 = function1;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new y13(z, function0, function2, i, i2);
        }
    }

    public static final void o(mm40 mm40Var, ib30 ib30Var, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        mm40Var.getClass();
        fetVar2.g0(-472969952);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(ib30Var) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            x5d x5dVarA = w5d.a(uc9.c, gqw0.n, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40Var);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z = fetVar2.S;
            pcy pcyVar = e7z.u1;
            if (z) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar2, x5dVarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.j, fetVar2, 0);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC1 = kbc.c0(fetVar2, jm40Var);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar4);
            mm40 mm40VarE0 = o2e.e0(jm40Var, "HEAD_TO_HEAD_FIRST_TEAM_SCORE");
            y9q0 y9q0VarJ = g1t0.j();
            StaticColors staticColors = StaticColors.INSTANCE;
            v8q0.a(ib30Var.b, mm40VarE0, staticColors.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, y9q0VarJ, fetVar, 48, 0, 131064);
            v8q0.a(Separators.COLON, null, staticColors.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.j(), fetVar, 6, 0, 131066);
            v8q0.a(ib30Var.c, o2e.e0(jm40Var, "HEAD_TO_HEAD_SECOND_TEAM_SCORE"), staticColors.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.j(), fetVar, 48, 0, 131064);
            fetVar2 = fetVar;
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new sjs(mm40Var, ib30Var, i, (byte) 10);
        }
    }

    public static final void p(int i, fet fetVar, mm40 mm40Var, String str) {
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        fetVar2.g0(-664061733);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(str) ? 32 : 16;
        }
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            int length = str.length();
            jm40 jm40Var = jm40.b;
            if (length > 0) {
                fetVar2.e0(-443599634);
                f1t0.a(jm40Var, str, ((ThemeColors) fetVar2.k(zaq0.b)).getSecondary(), null, 0L, null, 0L, null, 0L, 2, false, 1, 0, new y9q0(0L, qmk.q, null, j1t0.b, 0L, null, 0, 0, qmk.D, 16646045), 0L, fetVar, i2 & 126, 438264);
                mm40Var2 = jm40Var;
                fetVar2 = fetVar;
                fetVar2.r(false);
            } else {
                mm40Var2 = jm40Var;
                fetVar2.e0(-443354393);
                fetVar2.r(false);
            }
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cx(mm40Var2, str, i, (byte) 13);
        }
    }

    public static final void q(String str, String str2, Function0 function0, Function0 function1, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        fetVar2.g0(380977001);
        int i2 = i | (fetVar2.g(str) ? 4 : 2) | (fetVar2.g(str2) ? 32 : 16) | (fetVar2.i(function0) ? 256 : 128) | (fetVar2.i(function1) ? 2048 : 1024);
        if (fetVar2.U(i2 & 1, (i2 & 1171) != 1170)) {
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC0 = kbc.c0(fetVar2, jm40Var);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(jm40Var, 4.0f, 16.0f, 4.0f, 0.0f, 8);
            tui0 tui0Var = new tui0(str, null);
            Integer numValueOf = Integer.valueOf(R.drawable.ic_glyph_refresh);
            m0x m0xVar = new m0x(R.drawable.ic_glyph_refresh, null, 6);
            zfn zfnVar = zaq0.b;
            rqm rqmVar = new rqm((vui0) tui0Var, (pui0) new oui0(numValueOf, (y3d) null, m0xVar, new y3d(((ThemeColors) fetVar2.k(zfnVar)).getSecondary()), 18), (pvi0) null, (d4d) null, (tvi0) null, (wui0) null, false, (e900) null, 508);
            boolean z = (i2 & 896) == 256;
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new unl(function0, (byte) 9);
                fetVar2.o0(objP);
            }
            obc.q(mm40VarN, rqmVar, false, null, (Function0) objP, null, null, null, fetVar2, 0, 236);
            vtb.t(null, qqm.f29173a, zfi0.f44303a, 0L, fetVar, 432, 9);
            fetVar2 = fetVar;
            mm40 mm40VarL = s5x0.L(jm40Var, 4.0f, 0.0f, 2);
            rqm rqmVar2 = new rqm((vui0) new tui0(str2, null), (pui0) new oui0(Integer.valueOf(R.drawable.ic_glyph_later), (y3d) null, new m0x(R.drawable.ic_glyph_later, null, 6), new y3d(((ThemeColors) fetVar2.k(zfnVar)).getSecondary()), 18), (pvi0) null, (d4d) null, (tvi0) null, (wui0) null, false, (e900) null, 508);
            boolean z2 = (i2 & 7168) == 2048;
            Object objP2 = fetVar2.P();
            if (z2 || objP2 == cl5Var) {
                objP2 = new unl(function1, (byte) 10);
                fetVar2.o0(objP2);
            }
            obc.q(mm40VarL, rqmVar2, false, null, (Function0) objP2, null, null, null, fetVar2, 0, 236);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new eqk((byte) 8, i, (Object) str, (Object) str2, (Object) function0, (Object) function1);
        }
    }

    public static final void r(mm40 mm40Var, h6m h6mVar, Function1 function1, Function1 function2, fet fetVar, int i) {
        fet fetVar2 = fetVar;
        fetVar2.g0(1598635598);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(h6mVar) ? 32 : 16) | (fetVar2.i(function1) ? 256 : 128) | (fetVar2.i(function2) ? 2048 : 1024);
        if (fetVar2.U(i2 & 1, (i2 & 1171) != 1170)) {
            zcl zclVar = qmk.f28987a;
            thg0 thg0VarA = shg0.a(new qw3(8.0f, true, new gne(gqw0.n, (byte) 12)), gqw0.j, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40Var);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            int i3 = i2 << 6;
            int i4 = (57344 & i3) | 3456 | (i3 & 458752);
            d6m.c(new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), h6mVar.e, xjp0.f40998a, false, function1, function2, fetVar2, i4);
            gkb.E(null, h6mVar.g, h6mVar.j, 0.0f, 0.0f, fetVar, 0);
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            fetVar2 = fetVar;
            d6m.c(new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), h6mVar.f, xjp0.b, true, function1, function2, fetVar2, i4);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new eqk((Object) mm40Var, (Object) h6mVar, function1, (wdr) function2, i, (byte) 16);
        }
    }

    public static final void s(mm40 mm40Var, String str, a4x a4xVar, String str2, boolean z, fet fetVar, int i) {
        mm40 mm40Var2;
        float f;
        a4x a4xVar2 = a4xVar;
        fet fetVar2 = fetVar;
        xx7 xx7Var = gqw0.m;
        fetVar2.g0(-1224844909);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.g(a4xVar2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar2.g(str2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar2.h(z) ? 16384 : 8192;
        }
        if (fetVar2.U(i2 & 1, (i2 & 9363) != 9362)) {
            if (a4xVar2.size() <= 3) {
                zcl zclVar = qmk.f28987a;
                f = 2.0f;
            } else {
                zcl zclVar2 = qmk.f28987a;
                f = -8.0f;
            }
            long jD = z ? cs0.D(fetVar2, 687793538, fetVar2, false) : cs0.e(fetVar2, 687844006, fetVar2, false);
            zfn zfnVar = bmd.n;
            xx7 xx7Var2 = fetVar2.k(zfnVar) == k6z.b ? gqw0.o : xx7Var;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE = o7k0.e(o7k0.d(jm40Var, 1.0f), 48.0f);
            x5d x5dVarA = w5d.a(new qw3(2.0f, true, new jf4((byte) 14)), xx7Var, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarE);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z2 = fetVar2.S;
            pcy pcyVar = e7z.u1;
            if (z2) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar2, x5dVarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            xx7 xx7Var3 = xx7Var2;
            float f2 = f;
            int i3 = i2;
            f1t0.a(null, str, afn0.m(fetVar2).getTextPrimary(), null, 0L, null, 0L, null, 0L, 2, false, 1, 0, g1t0.d(), 0L, fetVar2, i2 & 112, 438265);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, jm40Var);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar4);
            a4xVar2 = a4xVar;
            obc.d(zfnVar.a(k6z.f17794a), u1c.M(1944725817, new etm(f2, xx7Var3, a4xVar2, (byte) 1), fetVar2), fetVar2, 56);
            v8q0.a(str2, s5x0.N(jm40Var, 8.0f, 0.0f, 0.0f, 0.0f, 14), jD, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.a(), fetVar2, (i3 >> 9) & 14, 0, 131064);
            fetVar2 = fetVar2;
            fetVar2.r(true);
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new mtm(mm40Var2, str, a4xVar2, str2, z, i, (byte) 0);
        }
    }

    public static final void t(boolean z, Function0 function0, fet fetVar, int i) {
        int i2;
        yfe0 yfe0VarU;
        t5h t5hVar;
        jg60 jg60VarK;
        fetVar.g0(1363928695);
        byte b = 2;
        if ((i & 6) == 0) {
            i2 = (fetVar.h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.i(function0) ? 32 : 16;
        }
        byte b2 = 1;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            pz40 pz40VarF = androidx.compose.runtime.e.f(function0, fetVar);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = new kfp(z, pz40VarF);
                fetVar.o0(objP);
            }
            kfp kfpVar = (kfp) objP;
            boolean zI = ((i2 & 14) == 4) | fetVar.i(kfpVar);
            Object objP2 = fetVar.P();
            if (zI || objP2 == cl5Var) {
                objP2 = new rd7((Object) kfpVar, z, (byte) 8);
                fetVar.o0(objP2);
            }
            m0x0.D((Function0) objP2, fetVar);
            kg60 kg60VarA = tr00.a(fetVar);
            if (kg60VarA == null || (jg60VarK = kg60VarA.k()) == null) {
                yfe0VarU = fetVar.u();
                if (yfe0VarU == null) {
                    return;
                } else {
                    t5hVar = new t5h(z, function0, i, b2);
                }
            } else {
                boolean zI2 = fetVar.i(jg60VarK) | fetVar.i(kfpVar);
                Object objP3 = fetVar.P();
                if (zI2 || objP3 == cl5Var) {
                    objP3 = new f5p(jg60VarK, kfpVar, (byte) 7);
                    fetVar.o0(objP3);
                }
                s0x.d(jg60VarK, null, (Function1) objP3, fetVar, 0);
            }
            yfe0VarU.d = t5hVar;
        }
        fetVar.X();
        yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            t5hVar = new t5h(z, function0, i, b);
            yfe0VarU.d = t5hVar;
        }
    }

    public static final void u(boolean z, Function0 function0, fet fetVar, int i) {
        int i2;
        fetVar.g0(-269651633);
        if ((i & 6) == 0) {
            i2 = (fetVar.h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.i(function0) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            pz40 pz40VarF = androidx.compose.runtime.e.f(function0, fetVar);
            View view = (View) fetVar.k(dy2.f);
            int i3 = i2;
            Boolean boolValueOf = Boolean.valueOf(z);
            int i4 = i3 & 14;
            boolean zI = fetVar.i(view) | (i4 == 4) | fetVar.g(pz40VarF);
            Object objP = fetVar.P();
            if (zI || objP == ukd.f35823a) {
                objP = new r91((Object) view, z, (Object) pz40VarF, (byte) 13);
                fetVar.o0(objP);
            }
            s0x.e(boolValueOf, view, null, (Function1) objP, fetVar, i4, 4);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new t5h(z, function0, i, (byte) 3);
        }
    }

    public static final void v(String str, String str2, String str3, fet fetVar, int i) {
        fetVar.g0(2020956244);
        int i2 = i | (fetVar.g(str) ? 4 : 2) | (fetVar.g(str2) ? 32 : 16) | (fetVar.g(str3) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            wvb.o(null, 12.0f, 0L, fetVar, 0, 5);
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            thg0 thg0VarA = shg0.a(uc9.e, gqw0.k, fetVar, 54);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarD);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            mm40 mm40VarN = s5x0.N(new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 0.0f, 0.0f, 24.0f, 0.0f, 11);
            y9q0 y9q0VarI = g1t0.i();
            zfn zfnVar = zaq0.b;
            v8q0.a(str, mm40VarN, ((ThemeColors) fetVar.k(zfnVar)).getPrimary(), null, 0L, null, null, null, 0L, new f2q0(6), 0L, 2, false, 1, 0, null, y9q0VarI, fetVar, i2 & 14, 24960, 109560);
            dww.c(a8k0.F(R.drawable.ic_glyph_arrow_right, 0, fetVar), null, yyw.V(o7k0.n(jm40Var, 24.0f), fetVar.k(bmd.n) == k6z.b), ((ThemeColors) fetVar.k(zfnVar)).getPrimary(), fetVar, 56, 0);
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            int i3 = i2 >> 3;
            v8q0.a(str2, s5x0.N(new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 24.0f, 0.0f, 0.0f, 0.0f, 14), ((ThemeColors) fetVar.k(zfnVar)).getPrimary(), null, 0L, null, null, null, 0L, new f2q0(5), 0L, 2, false, 1, 0, null, g1t0.i(), fetVar, i3 & 14, 24960, 109560);
            fetVar.r(true);
            wvb.o(null, 20.0f, 0L, fetVar, 0, 5);
            kkb.m(null, str3, null, 0, 0L, 0L, fetVar, i3 & 112, 61);
            wvb.o(null, 16.0f, 0L, fetVar, 0, 5);
            vtb.t(null, qqm.b, zfi0.f44303a, 0L, fetVar, 432, 9);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new tv7(str, str2, str3, i, (byte) 1);
        }
    }

    public static final void w(mm40 mm40Var, h6m h6mVar, Function0 function0, Function0 function1, Function0 function2, fet fetVar, int i) {
        fetVar.g0(319554228);
        int i2 = i | (fetVar.g(h6mVar) ? 32 : 16) | (fetVar.i(function0) ? 256 : 128) | (fetVar.i(function1) ? 2048 : 1024) | (fetVar.i(function2) ? 16384 : 8192);
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            String str = h6mVar.f12536a;
            lgb.r(str, str != null, wb.g, fetVar, 384);
            int i3 = i2 << 6;
            ahb.a(o7k0.d(jm40.b, 1.0f), h6mVar.b, h6mVar.c, h6mVar.d, function0, function1, function2, fetVar, (57344 & i3) | 6 | (458752 & i3) | (i3 & 3670016));
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cqk(mm40Var, (Object) h6mVar, function0, function1, function2, i, (byte) 12);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:110:0x0180  */
    /* JADX WARN: Code duplicated, block: B:114:0x018e  */
    /* JADX WARN: Code duplicated, block: B:142:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:146:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:154:0x020f  */
    /* JADX WARN: Code duplicated, block: B:165:0x0232  */
    public static final cmr x(Map.Entry entry) {
        dmr dmrVar;
        entry.getClass();
        switch ((String) entry.getKey()) {
            case "Team2Scores":
                dmrVar = dmr.f;
                break;
            case "statDay":
                dmrVar = dmr.h;
                break;
            case "statHomeAway":
                dmrVar = dmr.j;
                break;
            case "Status":
                dmrVar = dmr.u;
                break;
            case "CentralActionZones":
                dmrVar = dmr.Z;
                break;
            case "P1Cards":
                dmrVar = dmr.r;
                break;
            case "P2Cards":
                dmrVar = dmr.s;
                break;
            case "AltCaptionsByTeams":
                dmrVar = dmr.g;
                break;
            case "B":
            case "D":
                dmrVar = dmr.s;
                break;
            case "N":
                dmrVar = dmr.i1;
                break;
            case "P":
                dmrVar = dmr.r;
                break;
            case "S":
                dmrVar = dmr.u;
                break;
            case "T":
                dmrVar = dmr.q;
                break;
            case "C1":
                dmrVar = dmr.w;
                break;
            case "C2":
                dmrVar = dmr.z;
                break;
            case "Ch":
                dmrVar = dmr.B;
                break;
            case "F1":
                dmrVar = dmr.x;
                break;
            case "F2":
                dmrVar = dmr.y;
                break;
            case "P1":
                dmrVar = dmr.r;
                break;
            case "P2":
                dmrVar = dmr.s;
                break;
            case "RG":
                dmrVar = dmr.u;
                break;
            case "PC1":
                dmrVar = dmr.g1;
                break;
            case "PC2":
                dmrVar = dmr.h1;
                break;
            case "Board":
                dmrVar = dmr.A;
                break;
            case "STATE":
                dmrVar = dmr.u;
                break;
            case "Stat1":
                dmrVar = dmr.c;
                break;
            case "Stat2":
                dmrVar = dmr.d;
                break;
            case "LeftActionZones":
                dmrVar = dmr.Y;
                break;
            case "IRedCard1":
                dmrVar = dmr.k;
                break;
            case "IRedCard2":
                dmrVar = dmr.l;
                break;
            case "AddTime":
                dmrVar = dmr.b;
                break;
            case "RightActionZones":
                dmrVar = dmr.f1;
                break;
            case "ICorner1":
                dmrVar = dmr.o;
                break;
            case "ICorner2":
                dmrVar = dmr.p;
                break;
            case "Team1Scores":
                dmrVar = dmr.e;
                break;
            case "Combination1":
                dmrVar = dmr.w;
                break;
            case "Combination2":
                dmrVar = dmr.z;
                break;
            case "RoundTable":
                dmrVar = dmr.v;
                break;
            case "InnsStats":
                dmrVar = dmr.t;
                break;
            case "IYellowCard1":
                dmrVar = dmr.m;
                break;
            case "IYellowCard2":
                dmrVar = dmr.n;
                break;
            case "AltOpp":
                dmrVar = dmr.i;
                break;
            default:
                dmrVar = dmr.f6334a;
                break;
        }
        return new cmr(dmrVar, (String) entry.getValue());
    }

    public static final bq9 y(Function2 function2) {
        return new bq9(function2, kotlin.coroutines.g.f46065a, -2, i99.f14377a);
    }

    public static final ltb z(Function2 function2) {
        return new ltb(function2, kotlin.coroutines.g.f46065a, -2, i99.f14377a, (byte) 0);
    }
}
