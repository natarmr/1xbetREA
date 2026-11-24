package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class tmk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f34198a = idm0.t(14);
    public static final long b = idm0.t(0);
    public static final long c = y3d.f;
    public static final e8q0 d;

    static {
        long j = y3d.b;
        d = j != 16 ? new g5d(j) : pek0.d;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0173 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:108:0x0185  */
    /* JADX WARN: Code duplicated, block: B:110:0x018a  */
    /* JADX WARN: Code duplicated, block: B:111:0x018d  */
    /* JADX WARN: Code duplicated, block: B:113:0x0191  */
    /* JADX WARN: Code duplicated, block: B:114:0x0194  */
    /* JADX WARN: Code duplicated, block: B:116:0x0198  */
    /* JADX WARN: Code duplicated, block: B:118:0x019c  */
    /* JADX WARN: Code duplicated, block: B:120:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:123:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:125:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:128:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:129:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:131:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:132:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:136:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:139:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:13:0x004b A[PHI: r19
  0x004b: PHI (r19v6 a.pek0) = 
  (r19v0 a.pek0)
  (r19v7 a.pek0)
  (r19v7 a.pek0)
  (r19v7 a.pek0)
  (r19v7 a.pek0)
  (r19v7 a.pek0)
  (r19v7 a.pek0)
  (r19v7 a.pek0)
  (r19v7 a.pek0)
  (r19v7 a.pek0)
  (r19v7 a.pek0)
 binds: [B:6:0x0034, B:35:0x0092, B:44:0x00b2, B:41:0x00a8, B:38:0x009e, B:33:0x0086, B:30:0x007c, B:25:0x006d, B:22:0x0067, B:19:0x005d, B:11:0x0048] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:140:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:142:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:144:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:145:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:14:0x004d A[PHI: r15 r19
  0x004d: PHI (r15v6 a.j56) = (r15v7 a.j56), (r15v9 a.j56), (r15v9 a.j56), (r15v10 a.j56) binds: [B:13:0x004b, B:57:0x00dc, B:52:0x00cd, B:47:0x00be] A[DONT_GENERATE, DONT_INLINE]
  0x004d: PHI (r19v5 a.pek0) = (r19v6 a.pek0), (r19v7 a.pek0), (r19v7 a.pek0), (r19v7 a.pek0) binds: [B:13:0x004b, B:57:0x00dc, B:52:0x00cd, B:47:0x00be] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:15:0x004f A[PHI: r4 r15 r19
  0x004f: PHI (r4v5 long) = (r4v6 long), (r4v9 long) binds: [B:14:0x004d, B:63:0x00f0] A[DONT_GENERATE, DONT_INLINE]
  0x004f: PHI (r15v5 a.j56) = (r15v6 a.j56), (r15v9 a.j56) binds: [B:14:0x004d, B:63:0x00f0] A[DONT_GENERATE, DONT_INLINE]
  0x004f: PHI (r19v4 a.pek0) = (r19v5 a.pek0), (r19v7 a.pek0) binds: [B:14:0x004d, B:63:0x00f0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:17:0x0055  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:56:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:59:0x00e1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:62:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:66:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:70:0x0102  */
    /* JADX WARN: Code duplicated, block: B:75:0x010e  */
    /* JADX WARN: Code duplicated, block: B:77:0x0112  */
    /* JADX WARN: Code duplicated, block: B:79:0x0121  */
    /* JADX WARN: Code duplicated, block: B:80:0x0127  */
    /* JADX WARN: Code duplicated, block: B:81:0x012a  */
    /* JADX WARN: Code duplicated, block: B:83:0x0130  */
    /* JADX WARN: Code duplicated, block: B:84:0x013a  */
    /* JADX WARN: Code duplicated, block: B:86:0x013f  */
    /* JADX WARN: Code duplicated, block: B:88:0x0143  */
    /* JADX WARN: Code duplicated, block: B:97:0x016c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:98:0x016e  */
    public static final smk0 a(smk0 smk0Var, long j, t89 t89Var, float f, long j2, psq psqVar, lsq lsqVar, msq msqVar, nrq nrqVar, String str, long j3, j56 j56Var, f8q0 f8q0Var, rs00 rs00Var, long j4, k5q0 k5q0Var, ljj0 ljj0Var, agc agcVar) {
        pek0 pek0Var;
        j56 j56Var2;
        agc agcVar2;
        ljj0 ljj0Var2;
        long j5;
        e8q0 g5dVar;
        e8q0 e8q0Var;
        boolean z;
        long j6;
        psq psqVar2;
        f8q0 f8q0Var2;
        rs00 rs00Var2;
        k5q0 k5q0Var2;
        agc agcVar3;
        long jO;
        long j7;
        lsq lsqVar2 = lsqVar;
        msq msqVar2 = msqVar;
        nrq nrqVar2 = nrqVar;
        String str2 = str;
        long j8 = j3;
        pek0 pek0Var2 = pek0.d;
        eaq0[] eaq0VarArr = daq0.b;
        long j9 = j2 & 1095216660480L;
        if (j9 != 0) {
            pek0Var = pek0Var2;
            if (!daq0.a(j2, smk0Var.b)) {
                j56Var2 = j56Var;
                j5 = j4;
                ljj0Var2 = ljj0Var;
                agcVar2 = agcVar;
            }
            if (t89Var != null) {
                if (t89Var instanceof skk0) {
                    jO = jtt0.o(f, ((skk0) t89Var).f32354a);
                    if (jO != 16) {
                        g5dVar = new g5d(jO);
                    } else {
                        g5dVar = pek0Var;
                    }
                } else {
                    if (t89Var instanceof ijj0) {
                        t9f.b();
                        return null;
                    }
                    g5dVar = new w89((ijj0) t89Var, f);
                }
            } else if (j != 16) {
                g5dVar = new g5d(j);
            } else {
                g5dVar = pek0Var;
            }
            e8q0Var = smk0Var.f32451a;
            e8q0Var.getClass();
            z = g5dVar instanceof w89;
            if (!z && (e8q0Var instanceof w89)) {
                w89 w89Var = (w89) g5dVar;
                ijj0 ijj0Var = w89Var.f38711a;
                float f2 = w89Var.b;
                if (Float.isNaN(f2)) {
                    f2 = ((w89) e8q0Var).b;
                }
                g5dVar = new w89(ijj0Var, f2);
            } else if ((z || (e8q0Var instanceof w89)) && ((!z && (e8q0Var instanceof w89)) || g5dVar.equals(pek0Var))) {
            }
            if (nrqVar2 == null) {
                nrqVar2 = smk0Var.f;
            }
            if (j9 == 0) {
                j6 = smk0Var.b;
            } else {
                j6 = j2;
            }
            if (psqVar == null) {
                psqVar2 = smk0Var.c;
            } else {
                psqVar2 = psqVar;
            }
            if (lsqVar2 == null) {
                lsqVar2 = smk0Var.d;
            }
            if (msqVar2 == null) {
                msqVar2 = smk0Var.e;
            }
            if (str2 == null) {
                str2 = smk0Var.g;
            }
            if ((j8 & 1095216660480L) == 0) {
                j8 = smk0Var.h;
            }
            if (j56Var2 == null) {
                j56Var2 = smk0Var.i;
            }
            long j10 = j6;
            if (f8q0Var == null) {
                f8q0Var2 = smk0Var.j;
            } else {
                f8q0Var2 = f8q0Var;
            }
            if (rs00Var == null) {
                rs00Var2 = smk0Var.k;
            } else {
                rs00Var2 = rs00Var;
            }
            if (j5 == 16) {
                j5 = smk0Var.l;
            }
            f8q0 f8q0Var3 = f8q0Var2;
            if (k5q0Var == null) {
                k5q0Var2 = smk0Var.m;
            } else {
                k5q0Var2 = k5q0Var;
            }
            if (ljj0Var2 == null) {
                ljj0Var2 = smk0Var.n;
            }
            if (agcVar2 == null) {
                agcVar3 = smk0Var.o;
            } else {
                agcVar3 = agcVar2;
            }
            return new smk0(g5dVar, j10, psqVar2, lsqVar2, msqVar2, nrqVar2, str2, j8, j56Var2, f8q0Var3, rs00Var2, j5, k5q0Var2, ljj0Var2, agcVar3);
        }
        pek0Var = pek0Var2;
        if (t89Var != null || j == 16) {
            if ((lsqVar2 != null || lsqVar2.equals(smk0Var.d)) && ((psqVar == null || psqVar.equals(smk0Var.c)) && ((nrqVar2 == null || nrqVar2 == smk0Var.f) && (((j8 & 1095216660480L) == 0 || daq0.a(j8, smk0Var.h)) && ((k5q0Var == null || k5q0Var.equals(smk0Var.m)) && Intrinsics.d(t89Var, smk0Var.f32451a.l()) && ((t89Var == null || f == smk0Var.f32451a.g()) && ((msqVar2 == null || msqVar2.equals(smk0Var.e)) && (str2 == null || str2.equals(smk0Var.g))))))))) {
                if (j56Var != null) {
                    j56Var2 = j56Var;
                    if (j56Var2.equals(smk0Var.i)) {
                    }
                } else {
                    j56Var2 = j56Var;
                }
                if (f8q0Var != null || f8q0Var.equals(smk0Var.j)) {
                    if (rs00Var != null || rs00Var.equals(smk0Var.k)) {
                        j5 = j4;
                        if (j5 != 16) {
                            j7 = smk0Var.l;
                            int i = y3d.h;
                            if (h2t0.a(j5, j7)) {
                            }
                            agcVar2 = agcVar;
                        }
                        ljj0Var2 = ljj0Var;
                        if (ljj0Var2 != null || ljj0Var2.equals(smk0Var.n)) {
                            agcVar2 = agcVar;
                            if (agcVar2 != null || agcVar2.equals(smk0Var.o)) {
                                return smk0Var;
                            }
                        } else {
                            agcVar2 = agcVar;
                        }
                    }
                    ljj0Var2 = ljj0Var;
                    agcVar2 = agcVar;
                }
            } else {
                j56Var2 = j56Var;
            }
            j5 = j4;
            ljj0Var2 = ljj0Var;
            agcVar2 = agcVar;
        } else {
            long jH = smk0Var.f32451a.h();
            int i2 = y3d.h;
            if (h2t0.a(j, jH)) {
                if (lsqVar2 != null) {
                    if (j56Var != null) {
                        j56Var2 = j56Var;
                        if (j56Var2.equals(smk0Var.i)) {
                            j5 = j4;
                            ljj0Var2 = ljj0Var;
                            agcVar2 = agcVar;
                        }
                    } else {
                        j56Var2 = j56Var;
                    }
                    if (f8q0Var != null) {
                    }
                    if (rs00Var != null) {
                    }
                    j5 = j4;
                    if (j5 != 16) {
                        j7 = smk0Var.l;
                        int i3 = y3d.h;
                        if (h2t0.a(j5, j7)) {
                            ljj0Var2 = ljj0Var;
                        }
                        agcVar2 = agcVar;
                    }
                    ljj0Var2 = ljj0Var;
                    if (ljj0Var2 != null) {
                    }
                    agcVar2 = agcVar;
                    if (agcVar2 != null) {
                    }
                    return smk0Var;
                }
                if (j56Var != null) {
                    j56Var2 = j56Var;
                    if (j56Var2.equals(smk0Var.i)) {
                        j5 = j4;
                        ljj0Var2 = ljj0Var;
                        agcVar2 = agcVar;
                    }
                } else {
                    j56Var2 = j56Var;
                }
                if (f8q0Var != null) {
                }
                if (rs00Var != null) {
                }
                j5 = j4;
                if (j5 != 16) {
                    j7 = smk0Var.l;
                    int i4 = y3d.h;
                    if (h2t0.a(j5, j7)) {
                        ljj0Var2 = ljj0Var;
                    }
                    agcVar2 = agcVar;
                }
                ljj0Var2 = ljj0Var;
                if (ljj0Var2 != null) {
                }
                agcVar2 = agcVar;
                if (agcVar2 != null) {
                }
                return smk0Var;
            }
            j56Var2 = j56Var;
            j5 = j4;
            ljj0Var2 = ljj0Var;
            agcVar2 = agcVar;
        }
        if (t89Var != null) {
            if (t89Var instanceof skk0) {
                jO = jtt0.o(f, ((skk0) t89Var).f32354a);
                if (jO != 16) {
                    g5dVar = new g5d(jO);
                } else {
                    g5dVar = pek0Var;
                }
            } else {
                if (t89Var instanceof ijj0) {
                    t9f.b();
                    return null;
                }
                g5dVar = new w89((ijj0) t89Var, f);
            }
        } else if (j != 16) {
            g5dVar = new g5d(j);
        } else {
            g5dVar = pek0Var;
        }
        e8q0Var = smk0Var.f32451a;
        e8q0Var.getClass();
        z = g5dVar instanceof w89;
        if (!z) {
            g5dVar = z ? e8q0Var : e8q0Var;
        } else if (z) {
        }
        if (nrqVar2 == null) {
            nrqVar2 = smk0Var.f;
        }
        if (j9 == 0) {
            j6 = smk0Var.b;
        } else {
            j6 = j2;
        }
        if (psqVar == null) {
            psqVar2 = smk0Var.c;
        } else {
            psqVar2 = psqVar;
        }
        if (lsqVar2 == null) {
            lsqVar2 = smk0Var.d;
        }
        if (msqVar2 == null) {
            msqVar2 = smk0Var.e;
        }
        if (str2 == null) {
            str2 = smk0Var.g;
        }
        if ((j8 & 1095216660480L) == 0) {
            j8 = smk0Var.h;
        }
        if (j56Var2 == null) {
            j56Var2 = smk0Var.i;
        }
        long j11 = j6;
        if (f8q0Var == null) {
            f8q0Var2 = smk0Var.j;
        } else {
            f8q0Var2 = f8q0Var;
        }
        if (rs00Var == null) {
            rs00Var2 = smk0Var.k;
        } else {
            rs00Var2 = rs00Var;
        }
        if (j5 == 16) {
            j5 = smk0Var.l;
        }
        f8q0 f8q0Var4 = f8q0Var2;
        if (k5q0Var == null) {
            k5q0Var2 = smk0Var.m;
        } else {
            k5q0Var2 = k5q0Var;
        }
        if (ljj0Var2 == null) {
            ljj0Var2 = smk0Var.n;
        }
        if (agcVar2 == null) {
            agcVar3 = smk0Var.o;
        } else {
            agcVar3 = agcVar2;
        }
        return new smk0(g5dVar, j11, psqVar2, lsqVar2, msqVar2, nrqVar2, str2, j8, j56Var2, f8q0Var4, rs00Var2, j5, k5q0Var2, ljj0Var2, agcVar3);
    }
}
