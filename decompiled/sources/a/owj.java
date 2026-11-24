package a;

import androidx.media3.common.Timeline$Window;
import java.util.HashMap;
import java.util.Random;

/* JADX INFO: loaded from: classes.dex */
public final class owj {
    public static final m44 h = new m44(1);
    public static final Random i = new Random();
    public kn30 d;
    public String f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Timeline$Window f25968a = new Timeline$Window();
    public final amq0 b = new amq0();
    public final HashMap c = new HashMap();
    public bmq0 e = bmq0.f2849a;
    public long g = -1;

    public final void a(nwj nwjVar) {
        long j = nwjVar.c;
        if (j != -1 && nwjVar.e) {
            this.g = j;
        }
        this.f = null;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x004b  */
    /* JADX WARN: Code duplicated, block: B:41:0x008e  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a0 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    public final nwj b(int i2, vn30 vn30Var) {
        long j;
        long j2;
        long j3;
        HashMap map = this.c;
        nwj nwjVar = null;
        long j4 = Long.MAX_VALUE;
        for (nwj nwjVar2 : map.values()) {
            long j5 = nwjVar2.c;
            vn30 vn30Var2 = nwjVar2.d;
            if (j5 == -1 && i2 == nwjVar2.b && vn30Var != null) {
                long j6 = vn30Var.d;
                owj owjVar = nwjVar2.g;
                j = -1;
                nwj nwjVar3 = (nwj) owjVar.c.get(owjVar.f);
                if (nwjVar3 != null) {
                    j3 = nwjVar3.c;
                    if (j3 == -1) {
                        j3 = owjVar.g + 1;
                    }
                } else {
                    j3 = owjVar.g + 1;
                }
                if (j6 >= j3) {
                    nwjVar2.c = j6;
                }
            } else {
                j = -1;
            }
            if (vn30Var != null) {
                long j7 = vn30Var.d;
                if (j7 != j) {
                    if (vn30Var2 == null) {
                        if (!vn30Var.c() && j7 == nwjVar2.c) {
                            j2 = nwjVar2.c;
                            if (j2 != j || j2 < j4) {
                                nwjVar = nwjVar2;
                                j4 = j2;
                            } else if (j2 == j4) {
                                String str = vtt0.f38024a;
                                if (nwjVar.d != null && vn30Var2 != null) {
                                    nwjVar = nwjVar2;
                                }
                            }
                        }
                    } else if (j7 == vn30Var2.d && vn30Var.b == vn30Var2.b && vn30Var.c == vn30Var2.c) {
                        j2 = nwjVar2.c;
                        if (j2 != j) {
                        }
                        nwjVar = nwjVar2;
                        j4 = j2;
                    }
                }
            }
            if (i2 == nwjVar2.b) {
                j2 = nwjVar2.c;
                if (j2 != j) {
                }
                nwjVar = nwjVar2;
                j4 = j2;
            }
        }
        if (nwjVar != null) {
            return nwjVar;
        }
        String str2 = (String) h.get();
        nwj nwjVar4 = new nwj(this, str2, i2, vn30Var);
        map.put(str2, nwjVar4);
        return nwjVar4;
    }

    public final synchronized String c(bmq0 bmq0Var, vn30 vn30Var) {
        return b(bmq0Var.g(vn30Var.f37698a, this.b).c, vn30Var).f24237a;
    }

    public final void d(ft2 ft2Var) {
        vn30 vn30Var;
        bmq0 bmq0Var = ft2Var.b;
        int i2 = ft2Var.c;
        vn30 vn30Var2 = ft2Var.d;
        boolean zP = bmq0Var.p();
        String str = this.f;
        HashMap map = this.c;
        if (zP) {
            if (str != null) {
                nwj nwjVar = (nwj) map.get(str);
                nwjVar.getClass();
                a(nwjVar);
                return;
            }
            return;
        }
        nwj nwjVar2 = (nwj) map.get(str);
        this.f = b(i2, vn30Var2).f24237a;
        e(ft2Var);
        if (vn30Var2 != null) {
            long j = vn30Var2.d;
            if (vn30Var2.c()) {
                if (nwjVar2 != null && nwjVar2.c == j && (vn30Var = nwjVar2.d) != null && vn30Var.b == vn30Var2.b && vn30Var.c == vn30Var2.c) {
                    return;
                }
                b(i2, new vn30(vn30Var2.f37698a, j));
                this.d.getClass();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002f A[Catch: all -> 0x0054, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0010, B:9:0x0014, B:11:0x001c, B:13:0x0028, B:16:0x002f, B:22:0x003a, B:24:0x0046, B:26:0x004c, B:32:0x0056, B:34:0x0062, B:35:0x0066, B:37:0x006b, B:39:0x0071, B:41:0x0088, B:42:0x00a5, B:44:0x00a9, B:45:0x00b0, B:47:0x00ba, B:49:0x00be), top: B:54:0x0001 }] */
    public final synchronized void e(ft2 ft2Var) {
        long j;
        this.d.getClass();
        if (ft2Var.b.p()) {
            return;
        }
        vn30 vn30Var = ft2Var.d;
        if (vn30Var != null) {
            long j2 = vn30Var.d;
            if (j2 != -1) {
                nwj nwjVar = (nwj) this.c.get(this.f);
                if (nwjVar != null) {
                    j = nwjVar.c;
                    if (j == -1) {
                        j = this.g + 1;
                    }
                } else {
                    j = this.g + 1;
                }
                if (j2 < j) {
                    return;
                }
            }
            nwj nwjVar2 = (nwj) this.c.get(this.f);
            if (nwjVar2 != null && nwjVar2.c == -1 && nwjVar2.b != ft2Var.c) {
                return;
            }
        }
        nwj nwjVarB = b(ft2Var.c, ft2Var.d);
        if (this.f == null) {
            this.f = nwjVarB.f24237a;
        }
        vn30 vn30Var2 = ft2Var.d;
        if (vn30Var2 != null && vn30Var2.c()) {
            vn30 vn30Var3 = ft2Var.d;
            nwj nwjVarB2 = b(ft2Var.c, new vn30(vn30Var3.f37698a, vn30Var3.b, vn30Var3.d));
            if (!nwjVarB2.e) {
                nwjVarB2.e = true;
                ft2Var.b.g(ft2Var.d.f37698a, this.b);
                this.b.d(ft2Var.d.b);
                String str = vtt0.f38024a;
                this.d.getClass();
            }
        }
        if (!nwjVarB.e) {
            nwjVarB.e = true;
            this.d.getClass();
        }
        if (nwjVarB.f24237a.equals(this.f) && !nwjVarB.f) {
            nwjVarB.f = true;
            this.d.e(ft2Var, nwjVarB.f24237a);
        }
    }
}
