package a;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.text.CharsKt;

/* JADX INFO: loaded from: classes.dex */
public final class gzg0 implements fzg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function1 f12177a;
    public final hz40 b;
    public hz40 c;

    public gzg0(Map map, Function1 function1) {
        hz40 hz40Var;
        this.f12177a = function1;
        if (map == null || map.isEmpty()) {
            hz40Var = null;
        } else {
            hz40Var = new hz40(map.size());
            for (Map.Entry entry : map.entrySet()) {
                hz40Var.n(entry.getKey(), entry.getValue());
            }
        }
        this.b = hz40Var;
    }

    @Override // a.fzg0
    public final ezg0 a(String str, Function0 function0) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!CharsKt.d(str.charAt(i))) {
                hz40 hz40Var = this.c;
                if (hz40Var == null) {
                    long[] jArr = u1h0.f34903a;
                    hz40Var = new hz40();
                    this.c = hz40Var;
                }
                Object objG = hz40Var.g(str);
                if (objG == null) {
                    objG = new ArrayList();
                    hz40Var.n(str, objG);
                }
                ((List) objG).add(function0);
                return new nvu(hz40Var, str, function0, (byte) 18);
            }
        }
        jf4.o("Registered key is empty or blank");
        return null;
    }

    @Override // a.fzg0
    public final boolean d(Object obj) {
        return ((Boolean) this.f12177a.invoke(obj)).booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0091  */
    @Override // a.fzg0
    public final Map e() {
        char c;
        long j;
        long j2;
        long j3;
        long[] jArr;
        int i;
        long[] jArr2;
        int i2;
        hz40 hz40Var = this.b;
        if (hz40Var == null && this.c == null) {
            lun lunVar = lun.f20680a;
            lunVar.getClass();
            return lunVar;
        }
        int i3 = 0;
        int i4 = hz40Var != null ? hz40Var.e : 0;
        hz40 hz40Var2 = this.c;
        HashMap map = new HashMap(i4 + (hz40Var2 != null ? hz40Var2.e : 0));
        char c2 = 7;
        long j4 = -9187201950435737472L;
        int i5 = 8;
        if (hz40Var != null) {
            Object[] objArr = hz40Var.b;
            Object[] objArr2 = hz40Var.c;
            long[] jArr3 = hz40Var.f13891a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i6 = 0;
                j2 = 128;
                while (true) {
                    long j5 = jArr3[i6];
                    j3 = 255;
                    if ((((~j5) << c2) & j5 & j4) != j4) {
                        int i7 = 8 - ((~(i6 - length)) >>> 31);
                        int i8 = 0;
                        while (i8 < i7) {
                            if ((j5 & 255) < 128) {
                                int i9 = (i6 << 3) + i8;
                                map.put((String) objArr[i9], (List) objArr2[i9]);
                            }
                            j5 >>= 8;
                            i8++;
                            c2 = c2;
                            j4 = j4;
                        }
                        c = c2;
                        j = j4;
                        if (i7 != 8) {
                            break;
                        }
                    } else {
                        c = c2;
                        j = j4;
                    }
                    if (i6 == length) {
                        break;
                    }
                    i6++;
                    c2 = c;
                    j4 = j;
                }
            } else {
                c = 7;
                j = -9187201950435737472L;
                j2 = 128;
                j3 = 255;
            }
        } else {
            c = 7;
            j = -9187201950435737472L;
            j2 = 128;
            j3 = 255;
        }
        hz40 hz40Var3 = this.c;
        if (hz40Var3 != null) {
            Object[] objArr3 = hz40Var3.b;
            Object[] objArr4 = hz40Var3.c;
            long[] jArr4 = hz40Var3.f13891a;
            int length2 = jArr4.length - 2;
            if (length2 >= 0) {
                int i10 = 0;
                while (true) {
                    long j6 = jArr4[i10];
                    if ((((~j6) << c) & j6 & j) != j) {
                        int i11 = 8 - ((~(i10 - length2)) >>> 31);
                        int i12 = i3;
                        while (i12 < i11) {
                            if ((j6 & j3) < j2) {
                                int i13 = (i10 << 3) + i12;
                                Object obj = objArr3[i13];
                                List list = (List) objArr4[i13];
                                String str = (String) obj;
                                i2 = i5;
                                if (list.size() == 1) {
                                    Object objInvoke = ((Function0) list.get(i3)).invoke();
                                    if (objInvoke != null) {
                                        if (!d(objInvoke)) {
                                            c99.v(e9x.L(objInvoke));
                                            return null;
                                        }
                                        map.put(str, q3d.e(objInvoke));
                                    }
                                    jArr2 = jArr4;
                                } else {
                                    int size = list.size();
                                    ArrayList arrayList = new ArrayList(size);
                                    while (i3 < size) {
                                        long[] jArr5 = jArr4;
                                        Object objInvoke2 = ((Function0) list.get(i3)).invoke();
                                        if (objInvoke2 != null && !d(objInvoke2)) {
                                            c99.v(e9x.L(objInvoke2));
                                            return null;
                                        }
                                        arrayList.add(objInvoke2);
                                        i3++;
                                        jArr4 = jArr5;
                                    }
                                    jArr2 = jArr4;
                                    map.put(str, arrayList);
                                }
                            } else {
                                jArr2 = jArr4;
                                i2 = i5;
                            }
                            j6 >>= i2;
                            i12++;
                            i5 = i2;
                            jArr4 = jArr2;
                            i3 = 0;
                        }
                        jArr = jArr4;
                        i = i5;
                        if (i11 != i) {
                            break;
                        }
                    } else {
                        jArr = jArr4;
                        i = i5;
                    }
                    if (i10 == length2) {
                        break;
                    }
                    i10++;
                    i5 = i;
                    jArr4 = jArr;
                    i3 = 0;
                }
            }
        }
        return map;
    }

    @Override // a.fzg0
    public final Object f(String str) {
        hz40 hz40Var = this.b;
        List list = hz40Var != null ? (List) hz40Var.l(str) : null;
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (list.size() > 1 && hz40Var != null) {
            List listSubList = list.subList(1, list.size());
            int iF = hz40Var.f(str);
            if (iF < 0) {
                iF = ~iF;
            }
            Object[] objArr = hz40Var.c;
            Object obj = objArr[iF];
            hz40Var.b[iF] = str;
            objArr[iF] = listSubList;
        }
        return list.get(0);
    }
}
