package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public abstract class yhh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f42636a;
    public static final /* synthetic */ int b = 0;

    static {
        uen uenVar = wen.b;
        f42636a = ibc.v0(1, bfn.SECONDS);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x004c  */
    /* JADX WARN: Code duplicated, block: B:32:0x0051  */
    /* JADX WARN: Code duplicated, block: B:34:0x0055  */
    /* JADX WARN: Code duplicated, block: B:36:0x005d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0060  */
    /* JADX WARN: Code duplicated, block: B:41:0x0067  */
    /* JADX WARN: Code duplicated, block: B:43:0x006f  */
    /* JADX WARN: Code duplicated, block: B:44:0x0072  */
    /* JADX WARN: Code duplicated, block: B:46:0x0076  */
    /* JADX WARN: Code duplicated, block: B:49:0x007f  */
    /* JADX WARN: Code duplicated, block: B:50:0x0081  */
    /* JADX WARN: Code duplicated, block: B:53:0x008a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x008c  */
    /* JADX WARN: Code duplicated, block: B:56:0x0090  */
    /* JADX WARN: Code duplicated, block: B:57:0x0092  */
    /* JADX WARN: Code duplicated, block: B:59:0x0095  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:62:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:65:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:67:? A[RETURN, SYNTHETIC] */
    public static final void a(final long j, final boolean z, long j2, Long l, final ugd ugdVar, fet fetVar, final int i, final int i2) {
        int i3;
        long j3;
        int i4;
        Long l2;
        int i5;
        ugd ugdVar2;
        boolean z2;
        final long j4;
        final Long l3;
        yfe0 yfe0VarU;
        Long l4;
        int i6;
        fet fetVar2 = fetVar;
        fetVar2.g0(31758449);
        if ((i & 6) == 0) {
            i3 = (fetVar2.f(j) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= fetVar2.h(z) ? 32 : 16;
        }
        int i7 = i2 & 4;
        if (i7 == 0) {
            if ((i & 384) == 0) {
                j3 = j2;
                i3 |= fetVar2.f(j3) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    l2 = l;
                    if (fetVar2.g(l2)) {
                        i5 = 2048;
                    } else {
                        i5 = 1024;
                    }
                    i3 |= i5;
                }
                if ((i & 24576) == 0) {
                    ugdVar2 = ugdVar;
                    if (fetVar2.i(ugdVar2)) {
                        i6 = 16384;
                    } else {
                        i6 = 8192;
                    }
                    i3 |= i6;
                } else {
                    ugdVar2 = ugdVar;
                }
                if ((i3 & 9363) != 9362) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (fetVar2.U(i3 & 1, z2)) {
                    if (i7 != 0) {
                        j3 = f42636a;
                    }
                    if (i4 != 0) {
                        l4 = null;
                    } else {
                        l4 = l2;
                    }
                    if (z) {
                        fetVar2.e0(1223384517);
                        c(j, j3, ugdVar2, fetVar2, (i3 & 14) | ((i3 >> 3) & 112) | ((i3 >> 6) & 896));
                        fetVar2 = fetVar2;
                        fetVar2.r(false);
                        l3 = l4;
                    } else {
                        fetVar2.e0(1223561155);
                        int i8 = i3 & 14;
                        int i9 = i3 >> 6;
                        l3 = l4;
                        b(j, l3, ugdVar, fetVar2, i8 | (i9 & 112) | (i9 & 896));
                        fetVar2.r(false);
                    }
                    j4 = j3;
                } else {
                    fetVar2.X();
                    j4 = j3;
                    l3 = l2;
                }
                yfe0VarU = fetVar2.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new Function2() { // from class: a.uhh
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            yhh.a(j, z, j4, l3, ugdVar, (fet) obj, x8x.L(i | 1), i2);
                            return Unit.f46060a;
                        }
                    };
                }
            }
            i3 |= 3072;
            l2 = l;
            if ((i & 24576) == 0) {
                ugdVar2 = ugdVar;
                if (fetVar2.i(ugdVar2)) {
                    i6 = 16384;
                } else {
                    i6 = 8192;
                }
                i3 |= i6;
            } else {
                ugdVar2 = ugdVar;
            }
            if ((i3 & 9363) != 9362) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (fetVar2.U(i3 & 1, z2)) {
                if (i7 != 0) {
                    j3 = f42636a;
                }
                if (i4 != 0) {
                    l4 = null;
                } else {
                    l4 = l2;
                }
                if (z) {
                    fetVar2.e0(1223384517);
                    c(j, j3, ugdVar2, fetVar2, (i3 & 14) | ((i3 >> 3) & 112) | ((i3 >> 6) & 896));
                    fetVar2 = fetVar2;
                    fetVar2.r(false);
                    l3 = l4;
                } else {
                    fetVar2.e0(1223561155);
                    int i10 = i3 & 14;
                    int i11 = i3 >> 6;
                    l3 = l4;
                    b(j, l3, ugdVar, fetVar2, i10 | (i11 & 112) | (i11 & 896));
                    fetVar2.r(false);
                }
                j4 = j3;
            } else {
                fetVar2.X();
                j4 = j3;
                l3 = l2;
            }
            yfe0VarU = fetVar2.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new Function2() { // from class: a.uhh
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        yhh.a(j, z, j4, l3, ugdVar, (fet) obj, x8x.L(i | 1), i2);
                        return Unit.f46060a;
                    }
                };
            }
        }
        i3 |= 384;
        j3 = j2;
        i4 = i2 & 8;
        if (i4 != 0) {
            if ((i & 3072) == 0) {
                l2 = l;
                if (fetVar2.g(l2)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            if ((i & 24576) == 0) {
                ugdVar2 = ugdVar;
                if (fetVar2.i(ugdVar2)) {
                    i6 = 16384;
                } else {
                    i6 = 8192;
                }
                i3 |= i6;
            } else {
                ugdVar2 = ugdVar;
            }
            if ((i3 & 9363) != 9362) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (fetVar2.U(i3 & 1, z2)) {
                if (i7 != 0) {
                    j3 = f42636a;
                }
                if (i4 != 0) {
                    l4 = null;
                } else {
                    l4 = l2;
                }
                if (z) {
                    fetVar2.e0(1223384517);
                    c(j, j3, ugdVar2, fetVar2, (i3 & 14) | ((i3 >> 3) & 112) | ((i3 >> 6) & 896));
                    fetVar2 = fetVar2;
                    fetVar2.r(false);
                    l3 = l4;
                } else {
                    fetVar2.e0(1223561155);
                    int i12 = i3 & 14;
                    int i13 = i3 >> 6;
                    l3 = l4;
                    b(j, l3, ugdVar, fetVar2, i12 | (i13 & 112) | (i13 & 896));
                    fetVar2.r(false);
                }
                j4 = j3;
            } else {
                fetVar2.X();
                j4 = j3;
                l3 = l2;
            }
            yfe0VarU = fetVar2.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new Function2() { // from class: a.uhh
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        yhh.a(j, z, j4, l3, ugdVar, (fet) obj, x8x.L(i | 1), i2);
                        return Unit.f46060a;
                    }
                };
            }
        }
        i3 |= 3072;
        l2 = l;
        if ((i & 24576) == 0) {
            ugdVar2 = ugdVar;
            if (fetVar2.i(ugdVar2)) {
                i6 = 16384;
            } else {
                i6 = 8192;
            }
            i3 |= i6;
        } else {
            ugdVar2 = ugdVar;
        }
        if ((i3 & 9363) != 9362) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (fetVar2.U(i3 & 1, z2)) {
            if (i7 != 0) {
                j3 = f42636a;
            }
            if (i4 != 0) {
                l4 = null;
            } else {
                l4 = l2;
            }
            if (z) {
                fetVar2.e0(1223384517);
                c(j, j3, ugdVar2, fetVar2, (i3 & 14) | ((i3 >> 3) & 112) | ((i3 >> 6) & 896));
                fetVar2 = fetVar2;
                fetVar2.r(false);
                l3 = l4;
            } else {
                fetVar2.e0(1223561155);
                int i14 = i3 & 14;
                int i15 = i3 >> 6;
                l3 = l4;
                b(j, l3, ugdVar, fetVar2, i14 | (i15 & 112) | (i15 & 896));
                fetVar2.r(false);
            }
            j4 = j3;
        } else {
            fetVar2.X();
            j4 = j3;
            l3 = l2;
        }
        yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2() { // from class: a.uhh
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    yhh.a(j, z, j4, l3, ugdVar, (fet) obj, x8x.L(i | 1), i2);
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final void b(long j, Long l, ugd ugdVar, fet fetVar, int i) {
        int i2;
        Object g8gVar;
        egk0 egk0Var;
        fetVar.g0(312090115);
        if ((i & 6) == 0) {
            i2 = (fetVar.f(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(l) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(ugdVar) ? 256 : 128;
        }
        int i3 = i2;
        byte b2 = 0;
        if (fetVar.U(i3 & 1, (i3 & 147) != 146)) {
            Object[] objArr = {Long.valueOf(j)};
            boolean z = (i3 & 14) == 4;
            Object objP = fetVar.P();
            Object obj = ukd.f35823a;
            if (z || objP == obj) {
                objP = new whh(b2, j);
                fetVar.o0(objP);
            }
            egk0 egk0Var2 = (egk0) e9x.Q(objArr, (Function0) objP, fetVar, 0);
            long jLongValue = l != null ? l.longValue() : egk0Var2.l();
            boolean zF = fetVar.f(jLongValue);
            Object objP2 = fetVar.P();
            if (zF || objP2 == obj) {
                objP2 = androidx.compose.runtime.e.c(d(l, egk0Var2.l()));
                fetVar.o0(objP2);
            }
            egk0 egk0Var3 = (egk0) objP2;
            Long lValueOf = Long.valueOf(jLongValue);
            boolean zG = fetVar.g(egk0Var3) | ((i3 & 112) == 32) | fetVar.g(egk0Var2);
            Object objP3 = fetVar.P();
            if (zG || objP3 == obj) {
                egk0Var = egk0Var3;
                g8gVar = new g8g((Object) l, (pz40) egk0Var, (pz40) egk0Var2, (yje) null, (byte) 17);
                fetVar.o0(g8gVar);
            } else {
                g8gVar = objP3;
                egk0Var = egk0Var3;
            }
            m0x0.t(fetVar, lValueOf, (Function2) g8gVar);
            ugdVar.F(Long.valueOf(egk0Var.l()), fetVar, Integer.valueOf((i3 >> 3) & 112));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new xhh(j, (Object) l, (wdr) ugdVar, i, (byte) 0);
        }
    }

    public static final void c(long j, long j2, ugd ugdVar, fet fetVar, int i) {
        int i2;
        fetVar.g0(757009655);
        if ((i & 6) == 0) {
            i2 = (fetVar.f(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.f(j2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(ugdVar) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            Object[] objArr = {Long.valueOf(j)};
            int i3 = i2 & 112;
            boolean z = ((i2 & 14) == 4) | (i3 == 32);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new al9((byte) 2, j, j2);
                fetVar.o0(objP);
            }
            egk0 egk0Var = (egk0) e9x.Q(objArr, (Function0) objP, fetVar, 0);
            boolean zF = fetVar.f(egk0Var.l());
            Object objP2 = fetVar.P();
            if (zF || objP2 == cl5Var) {
                objP2 = androidx.compose.runtime.e.c(j);
                fetVar.o0(objP2);
            }
            egk0 egk0Var2 = (egk0) objP2;
            Long lValueOf = Long.valueOf(j);
            boolean zG = fetVar.g(egk0Var2) | fetVar.g(egk0Var) | (i3 == 32);
            Object objP3 = fetVar.P();
            if (zG || objP3 == cl5Var) {
                objP3 = new ir(j2, egk0Var, egk0Var2, (yje) null);
                fetVar.o0(objP3);
            }
            m0x0.t(fetVar, lValueOf, (Function2) objP3);
            ugdVar.F(Long.valueOf(egk0Var2.l()), fetVar, Integer.valueOf((i2 >> 3) & 112));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new vhh(j, j2, ugdVar, i);
        }
    }

    public static final long d(Long l, long j) {
        if (l != null) {
            return Math.max(0L, (l.longValue() - System.currentTimeMillis()) / 1000);
        }
        uen uenVar = wen.b;
        return Math.max(0L, j - wen.l(ibc.w0(System.currentTimeMillis(), bfn.MILLISECONDS), bfn.SECONDS));
    }
}
