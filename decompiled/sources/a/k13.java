package a;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import java.util.UUID;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public abstract class k13 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zfn f17498a = new zfn(new t32(26), (byte) 0);
    public static final zfn b = new zfn(new v9q((byte) 17), (byte) 0);

    /* JADX WARN: Code duplicated, block: B:102:0x020f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:103:0x0211  */
    /* JADX WARN: Code duplicated, block: B:106:0x0235  */
    /* JADX WARN: Code duplicated, block: B:107:0x023b  */
    /* JADX WARN: Code duplicated, block: B:109:0x0262  */
    /* JADX WARN: Code duplicated, block: B:112:0x026d  */
    /* JADX WARN: Code duplicated, block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x003b  */
    /* JADX WARN: Code duplicated, block: B:25:0x0040  */
    /* JADX WARN: Code duplicated, block: B:27:0x0044  */
    /* JADX WARN: Code duplicated, block: B:29:0x004c  */
    /* JADX WARN: Code duplicated, block: B:30:0x004f  */
    /* JADX WARN: Code duplicated, block: B:34:0x0058  */
    /* JADX WARN: Code duplicated, block: B:36:0x005e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0061  */
    /* JADX WARN: Code duplicated, block: B:41:0x006c  */
    /* JADX WARN: Code duplicated, block: B:42:0x006e  */
    /* JADX WARN: Code duplicated, block: B:45:0x0077 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x0079  */
    /* JADX WARN: Code duplicated, block: B:47:0x007c  */
    /* JADX WARN: Code duplicated, block: B:49:0x0080  */
    /* JADX WARN: Code duplicated, block: B:50:0x008a  */
    /* JADX WARN: Code duplicated, block: B:53:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:57:0x0115  */
    /* JADX WARN: Code duplicated, block: B:60:0x0124  */
    /* JADX WARN: Code duplicated, block: B:61:0x0126  */
    /* JADX WARN: Code duplicated, block: B:64:0x012e  */
    /* JADX WARN: Code duplicated, block: B:65:0x0130  */
    /* JADX WARN: Code duplicated, block: B:68:0x0146 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:69:0x0148  */
    /* JADX WARN: Code duplicated, block: B:72:0x0163  */
    /* JADX WARN: Code duplicated, block: B:73:0x0165  */
    /* JADX WARN: Code duplicated, block: B:76:0x016b  */
    /* JADX WARN: Code duplicated, block: B:77:0x016d  */
    /* JADX WARN: Code duplicated, block: B:80:0x0183 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:83:0x0189  */
    /* JADX WARN: Code duplicated, block: B:86:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:87:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:90:0x01b3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:91:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:94:0x01ce A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:95:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:98:0x01ea A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:99:0x01ec  */
    public static final void a(vmb0 vmb0Var, Function0 function0, wmb0 wmb0Var, ugd ugdVar, fet fetVar, int i, int i2) {
        int i3;
        Function0 function1;
        int i4;
        wmb0 wmb0Var2;
        int i5;
        int i6;
        boolean z;
        wmb0 wmb0Var3;
        Function0 function2;
        yfe0 yfe0VarU;
        Function0 function3;
        wmb0 wmb0Var4;
        View view;
        w6k w6kVar;
        String str;
        k6z k6zVar;
        androidx.compose.runtime.a aVarG;
        pz40 pz40VarF;
        Object objP;
        Object obj;
        Object obj2;
        UUID uuid;
        boolean zBooleanValue;
        Object objP2;
        byte b2;
        String str2;
        rmb0 rmb0Var;
        int i7;
        byte b3;
        int i8;
        byte b4;
        boolean z2;
        Object objP3;
        byte b5;
        byte b6;
        boolean z3;
        Object objP4;
        byte b7;
        int i9;
        Object obj3;
        boolean zI;
        Object obj4;
        boolean zI2;
        Object obj5;
        boolean zI3;
        Object obj6;
        int i10;
        vmb0 vmb0Var2 = vmb0Var;
        fetVar.g0(-1772091631);
        if ((i & 6) == 0) {
            i3 = (fetVar.g(vmb0Var2) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i11 = i2 & 2;
        if (i11 == 0) {
            if ((i & 48) == 0) {
                function1 = function0;
                i3 |= fetVar.i(function1) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    wmb0Var2 = wmb0Var;
                    if (fetVar.g(wmb0Var2)) {
                        i5 = 256;
                    } else {
                        i5 = 128;
                    }
                    i3 |= i5;
                }
                if ((i & 3072) == 0) {
                    if (fetVar.i(ugdVar)) {
                        i10 = 2048;
                    } else {
                        i10 = 1024;
                    }
                    i3 |= i10;
                }
                i6 = i3;
                if ((i6 & 1171) != 1170) {
                    z = true;
                } else {
                    z = false;
                }
                if (fetVar.U(i6 & 1, z)) {
                    if (i11 != 0) {
                        function3 = null;
                    } else {
                        function3 = function1;
                    }
                    if (i4 != 0) {
                        wmb0Var4 = new wmb0(31);
                    } else {
                        wmb0Var4 = wmb0Var2;
                    }
                    view = (View) fetVar.k(dy2.f);
                    w6kVar = (w6k) fetVar.k(bmd.h);
                    str = (String) fetVar.k(f17498a);
                    k6zVar = (k6z) fetVar.k(bmd.n);
                    aVarG = e3c.G(fetVar);
                    pz40VarF = androidx.compose.runtime.e.f(ugdVar, fetVar);
                    Object[] objArr = new Object[0];
                    objP = fetVar.P();
                    obj = ukd.f35823a;
                    obj2 = objP;
                    if (objP == obj) {
                        Object t32Var = new t32((byte) 25);
                        fetVar.o0(t32Var);
                        obj2 = t32Var;
                    }
                    uuid = (UUID) e9x.Q(objArr, (Function0) obj2, fetVar, 48);
                    zBooleanValue = ((Boolean) fetVar.k(b)).booleanValue();
                    objP2 = fetVar.P();
                    if (objP2 == obj) {
                        str2 = str;
                        b2 = 0;
                        rmb0 rmb0Var2 = new rmb0(function3, wmb0Var4, str2, view, w6kVar, vmb0Var2, uuid, zBooleanValue);
                        vmb0Var2 = vmb0Var2;
                        rmb0Var2.n(aVarG, new ugd(-297523940, true, new e13(rmb0Var2, pz40VarF, b2)));
                        fetVar.o0(rmb0Var2);
                        objP2 = rmb0Var2;
                    } else {
                        b2 = 0;
                        str2 = str;
                    }
                    rmb0Var = (rmb0) objP2;
                    boolean zI4 = fetVar.i(rmb0Var);
                    i7 = i6 & 112;
                    if (i7 == 32) {
                        b3 = 1;
                    } else {
                        b3 = b2;
                    }
                    int i12 = (zI4 ? 1 : 0) | b3;
                    i8 = i6 & 896;
                    if (i8 == 256) {
                        b4 = 1;
                    } else {
                        b4 = b2;
                    }
                    z2 = (((i12 | b4) | (fetVar.g(str2) ? 1 : 0)) == true ? 1 : 0) | (fetVar.e(k6zVar.ordinal()) ? 1 : 0);
                    objP3 = fetVar.P();
                    if (z2 == 0 || objP3 == obj) {
                        objP3 = new dg(rmb0Var, function3, wmb0Var4, str2, k6zVar);
                        fetVar.o0(objP3);
                    }
                    m0x0.o(rmb0Var, (Function1) objP3, fetVar);
                    boolean zI5 = fetVar.i(rmb0Var);
                    if (i7 == 32) {
                        b5 = 1;
                    } else {
                        b5 = b2;
                    }
                    int i13 = (zI5 ? 1 : 0) | b5;
                    if (i8 == 256) {
                        b6 = 1;
                    } else {
                        b6 = b2;
                    }
                    z3 = (((i13 | b6) | (fetVar.g(str2) ? 1 : 0)) == true ? 1 : 0) | (fetVar.e(k6zVar.ordinal()) ? 1 : 0);
                    objP4 = fetVar.P();
                    if (z3 == 0 || objP4 == obj) {
                        objP4 = new ng0((Object) rmb0Var, (Object) function3, (Object) wmb0Var4, (Object) str2, (Object) k6zVar, (byte) 2);
                        fetVar.o0(objP4);
                    }
                    m0x0.D((Function0) objP4, fetVar);
                    boolean zI6 = fetVar.i(rmb0Var);
                    if ((i6 & 14) == 4) {
                        b7 = 1;
                    } else {
                        b7 = b2;
                    }
                    i9 = (zI6 ? 1 : 0) | b7;
                    Object objP5 = fetVar.P();
                    obj3 = objP5;
                    if (i9 == 0 || objP5 == obj) {
                        Object df1Var = new df1(rmb0Var, vmb0Var2, (byte) 24);
                        fetVar.o0(df1Var);
                        obj3 = df1Var;
                    }
                    m0x0.o(vmb0Var2, (Function1) obj3, fetVar);
                    zI = fetVar.i(rmb0Var);
                    Object objP6 = fetVar.P();
                    obj4 = objP6;
                    if (zI || objP6 == obj) {
                        Object y32Var = new y32(rmb0Var, null, (byte) 9);
                        fetVar.o0(y32Var);
                        obj4 = y32Var;
                    }
                    m0x0.t(fetVar, rmb0Var, (Function2) obj4);
                    zI2 = fetVar.i(rmb0Var);
                    Object objP7 = fetVar.P();
                    obj5 = objP7;
                    if (zI2 || objP7 == obj) {
                        Object f13Var = new f13(rmb0Var, b2);
                        fetVar.o0(f13Var);
                        obj5 = f13Var;
                    }
                    mm40 mm40VarD0 = ro4.d0(jm40.b, (Function1) obj5);
                    zI3 = fetVar.i(rmb0Var) | fetVar.e(k6zVar.ordinal());
                    Object objP8 = fetVar.P();
                    obj6 = objP8;
                    if (zI3 || objP8 == obj) {
                        Object h13Var = new h13(rmb0Var, k6zVar, b2);
                        fetVar.o0(h13Var);
                        obj6 = h13Var;
                    }
                    tj30 tj30Var = (tj30) obj6;
                    int iHashCode = Long.hashCode(fetVar.T);
                    bh90 bh90VarM = fetVar.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarD0);
                    mkd.c0.getClass();
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(e7z.u1);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, tj30Var, gqw0.x);
                    jpm0.o(fetVar, bh90VarM, gqw0.w);
                    jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar);
                    jpm0.o(fetVar, mm40VarC0, gqw0.v);
                    fetVar.r(true);
                    function2 = function3;
                    wmb0Var3 = wmb0Var4;
                } else {
                    fetVar.X();
                    wmb0Var3 = wmb0Var2;
                    function2 = function1;
                }
                yfe0VarU = fetVar.u();
                if (yfe0VarU != null) {
                    yfe0VarU.d = new g13((byte) 0, i, i2, vmb0Var2, function2, wmb0Var3, ugdVar);
                }
            }
            i3 |= 384;
            wmb0Var2 = wmb0Var;
            if ((i & 3072) == 0) {
                if (fetVar.i(ugdVar)) {
                    i10 = 2048;
                } else {
                    i10 = 1024;
                }
                i3 |= i10;
            }
            i6 = i3;
            if ((i6 & 1171) != 1170) {
                z = true;
            } else {
                z = false;
            }
            if (fetVar.U(i6 & 1, z)) {
                if (i11 != 0) {
                    function3 = null;
                } else {
                    function3 = function1;
                }
                if (i4 != 0) {
                    wmb0Var4 = new wmb0(31);
                } else {
                    wmb0Var4 = wmb0Var2;
                }
                view = (View) fetVar.k(dy2.f);
                w6kVar = (w6k) fetVar.k(bmd.h);
                str = (String) fetVar.k(f17498a);
                k6zVar = (k6z) fetVar.k(bmd.n);
                aVarG = e3c.G(fetVar);
                pz40VarF = androidx.compose.runtime.e.f(ugdVar, fetVar);
                Object[] objArr2 = new Object[0];
                objP = fetVar.P();
                obj = ukd.f35823a;
                obj2 = objP;
                if (objP == obj) {
                    Object t32Var2 = new t32((byte) 25);
                    fetVar.o0(t32Var2);
                    obj2 = t32Var2;
                }
                uuid = (UUID) e9x.Q(objArr2, (Function0) obj2, fetVar, 48);
                zBooleanValue = ((Boolean) fetVar.k(b)).booleanValue();
                objP2 = fetVar.P();
                if (objP2 == obj) {
                    str2 = str;
                    b2 = 0;
                    rmb0 rmb0Var3 = new rmb0(function3, wmb0Var4, str2, view, w6kVar, vmb0Var2, uuid, zBooleanValue);
                    vmb0Var2 = vmb0Var2;
                    rmb0Var3.n(aVarG, new ugd(-297523940, true, new e13(rmb0Var3, pz40VarF, b2)));
                    fetVar.o0(rmb0Var3);
                    objP2 = rmb0Var3;
                } else {
                    b2 = 0;
                    str2 = str;
                }
                rmb0Var = (rmb0) objP2;
                boolean zI7 = fetVar.i(rmb0Var);
                i7 = i6 & 112;
                if (i7 == 32) {
                    b3 = 1;
                } else {
                    b3 = b2;
                }
                int i14 = (zI7 ? 1 : 0) | b3;
                i8 = i6 & 896;
                if (i8 == 256) {
                    b4 = 1;
                } else {
                    b4 = b2;
                }
                z2 = (((i14 | b4) | (fetVar.g(str2) ? 1 : 0)) == true ? 1 : 0) | (fetVar.e(k6zVar.ordinal()) ? 1 : 0);
                objP3 = fetVar.P();
                if (z2 == 0) {
                    objP3 = new dg(rmb0Var, function3, wmb0Var4, str2, k6zVar);
                    fetVar.o0(objP3);
                } else {
                    objP3 = new dg(rmb0Var, function3, wmb0Var4, str2, k6zVar);
                    fetVar.o0(objP3);
                }
                m0x0.o(rmb0Var, (Function1) objP3, fetVar);
                boolean zI8 = fetVar.i(rmb0Var);
                if (i7 == 32) {
                    b5 = 1;
                } else {
                    b5 = b2;
                }
                int i15 = (zI8 ? 1 : 0) | b5;
                if (i8 == 256) {
                    b6 = 1;
                } else {
                    b6 = b2;
                }
                z3 = (((i15 | b6) | (fetVar.g(str2) ? 1 : 0)) == true ? 1 : 0) | (fetVar.e(k6zVar.ordinal()) ? 1 : 0);
                objP4 = fetVar.P();
                if (z3 == 0) {
                    objP4 = new ng0((Object) rmb0Var, (Object) function3, (Object) wmb0Var4, (Object) str2, (Object) k6zVar, (byte) 2);
                    fetVar.o0(objP4);
                } else {
                    objP4 = new ng0((Object) rmb0Var, (Object) function3, (Object) wmb0Var4, (Object) str2, (Object) k6zVar, (byte) 2);
                    fetVar.o0(objP4);
                }
                m0x0.D((Function0) objP4, fetVar);
                boolean zI9 = fetVar.i(rmb0Var);
                if ((i6 & 14) == 4) {
                    b7 = 1;
                } else {
                    b7 = b2;
                }
                i9 = (zI9 ? 1 : 0) | b7;
                Object objP9 = fetVar.P();
                obj3 = objP9;
                if (i9 == 0) {
                    Object df1Var2 = new df1(rmb0Var, vmb0Var2, (byte) 24);
                    fetVar.o0(df1Var2);
                    obj3 = df1Var2;
                } else {
                    Object df1Var3 = new df1(rmb0Var, vmb0Var2, (byte) 24);
                    fetVar.o0(df1Var3);
                    obj3 = df1Var3;
                }
                m0x0.o(vmb0Var2, (Function1) obj3, fetVar);
                zI = fetVar.i(rmb0Var);
                Object objP10 = fetVar.P();
                obj4 = objP10;
                if (zI) {
                    Object y32Var2 = new y32(rmb0Var, null, (byte) 9);
                    fetVar.o0(y32Var2);
                    obj4 = y32Var2;
                } else {
                    Object y32Var3 = new y32(rmb0Var, null, (byte) 9);
                    fetVar.o0(y32Var3);
                    obj4 = y32Var3;
                }
                m0x0.t(fetVar, rmb0Var, (Function2) obj4);
                zI2 = fetVar.i(rmb0Var);
                Object objP11 = fetVar.P();
                obj5 = objP11;
                if (zI2) {
                    Object f13Var2 = new f13(rmb0Var, b2);
                    fetVar.o0(f13Var2);
                    obj5 = f13Var2;
                } else {
                    Object f13Var3 = new f13(rmb0Var, b2);
                    fetVar.o0(f13Var3);
                    obj5 = f13Var3;
                }
                mm40 mm40VarD1 = ro4.d0(jm40.b, (Function1) obj5);
                zI3 = fetVar.i(rmb0Var) | fetVar.e(k6zVar.ordinal());
                Object objP12 = fetVar.P();
                obj6 = objP12;
                if (zI3) {
                    Object h13Var2 = new h13(rmb0Var, k6zVar, b2);
                    fetVar.o0(h13Var2);
                    obj6 = h13Var2;
                } else {
                    Object h13Var3 = new h13(rmb0Var, k6zVar, b2);
                    fetVar.o0(h13Var3);
                    obj6 = h13Var3;
                }
                tj30 tj30Var2 = (tj30) obj6;
                int iHashCode2 = Long.hashCode(fetVar.T);
                bh90 bh90VarM2 = fetVar.m();
                mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarD1);
                mkd.c0.getClass();
                fetVar.i0();
                if (fetVar.S) {
                    fetVar.l(e7z.u1);
                } else {
                    fetVar.r0();
                }
                jpm0.o(fetVar, tj30Var2, gqw0.x);
                jpm0.o(fetVar, bh90VarM2, gqw0.w);
                jpm0.o(fetVar, Integer.valueOf(iHashCode2), gqw0.y);
                jpm0.n(fetVar);
                jpm0.o(fetVar, mm40VarC1, gqw0.v);
                fetVar.r(true);
                function2 = function3;
                wmb0Var3 = wmb0Var4;
            } else {
                fetVar.X();
                wmb0Var3 = wmb0Var2;
                function2 = function1;
            }
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new g13((byte) 0, i, i2, vmb0Var2, function2, wmb0Var3, ugdVar);
            }
        }
        i3 |= 48;
        function1 = function0;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 384) == 0) {
                wmb0Var2 = wmb0Var;
                if (fetVar.g(wmb0Var2)) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            if ((i & 3072) == 0) {
                if (fetVar.i(ugdVar)) {
                    i10 = 2048;
                } else {
                    i10 = 1024;
                }
                i3 |= i10;
            }
            i6 = i3;
            if ((i6 & 1171) != 1170) {
                z = true;
            } else {
                z = false;
            }
            if (fetVar.U(i6 & 1, z)) {
                if (i11 != 0) {
                    function3 = null;
                } else {
                    function3 = function1;
                }
                if (i4 != 0) {
                    wmb0Var4 = new wmb0(31);
                } else {
                    wmb0Var4 = wmb0Var2;
                }
                view = (View) fetVar.k(dy2.f);
                w6kVar = (w6k) fetVar.k(bmd.h);
                str = (String) fetVar.k(f17498a);
                k6zVar = (k6z) fetVar.k(bmd.n);
                aVarG = e3c.G(fetVar);
                pz40VarF = androidx.compose.runtime.e.f(ugdVar, fetVar);
                Object[] objArr3 = new Object[0];
                objP = fetVar.P();
                obj = ukd.f35823a;
                obj2 = objP;
                if (objP == obj) {
                    Object t32Var3 = new t32((byte) 25);
                    fetVar.o0(t32Var3);
                    obj2 = t32Var3;
                }
                uuid = (UUID) e9x.Q(objArr3, (Function0) obj2, fetVar, 48);
                zBooleanValue = ((Boolean) fetVar.k(b)).booleanValue();
                objP2 = fetVar.P();
                if (objP2 == obj) {
                    str2 = str;
                    b2 = 0;
                    rmb0 rmb0Var4 = new rmb0(function3, wmb0Var4, str2, view, w6kVar, vmb0Var2, uuid, zBooleanValue);
                    vmb0Var2 = vmb0Var2;
                    rmb0Var4.n(aVarG, new ugd(-297523940, true, new e13(rmb0Var4, pz40VarF, b2)));
                    fetVar.o0(rmb0Var4);
                    objP2 = rmb0Var4;
                } else {
                    b2 = 0;
                    str2 = str;
                }
                rmb0Var = (rmb0) objP2;
                boolean zI10 = fetVar.i(rmb0Var);
                i7 = i6 & 112;
                if (i7 == 32) {
                    b3 = 1;
                } else {
                    b3 = b2;
                }
                int i16 = (zI10 ? 1 : 0) | b3;
                i8 = i6 & 896;
                if (i8 == 256) {
                    b4 = 1;
                } else {
                    b4 = b2;
                }
                z2 = (((i16 | b4) | (fetVar.g(str2) ? 1 : 0)) == true ? 1 : 0) | (fetVar.e(k6zVar.ordinal()) ? 1 : 0);
                objP3 = fetVar.P();
                if (z2 == 0) {
                    objP3 = new dg(rmb0Var, function3, wmb0Var4, str2, k6zVar);
                    fetVar.o0(objP3);
                } else {
                    objP3 = new dg(rmb0Var, function3, wmb0Var4, str2, k6zVar);
                    fetVar.o0(objP3);
                }
                m0x0.o(rmb0Var, (Function1) objP3, fetVar);
                boolean zI11 = fetVar.i(rmb0Var);
                if (i7 == 32) {
                    b5 = 1;
                } else {
                    b5 = b2;
                }
                int i17 = (zI11 ? 1 : 0) | b5;
                if (i8 == 256) {
                    b6 = 1;
                } else {
                    b6 = b2;
                }
                z3 = (((i17 | b6) | (fetVar.g(str2) ? 1 : 0)) == true ? 1 : 0) | (fetVar.e(k6zVar.ordinal()) ? 1 : 0);
                objP4 = fetVar.P();
                if (z3 == 0) {
                    objP4 = new ng0((Object) rmb0Var, (Object) function3, (Object) wmb0Var4, (Object) str2, (Object) k6zVar, (byte) 2);
                    fetVar.o0(objP4);
                } else {
                    objP4 = new ng0((Object) rmb0Var, (Object) function3, (Object) wmb0Var4, (Object) str2, (Object) k6zVar, (byte) 2);
                    fetVar.o0(objP4);
                }
                m0x0.D((Function0) objP4, fetVar);
                boolean zI12 = fetVar.i(rmb0Var);
                if ((i6 & 14) == 4) {
                    b7 = 1;
                } else {
                    b7 = b2;
                }
                i9 = (zI12 ? 1 : 0) | b7;
                Object objP13 = fetVar.P();
                obj3 = objP13;
                if (i9 == 0) {
                    Object df1Var4 = new df1(rmb0Var, vmb0Var2, (byte) 24);
                    fetVar.o0(df1Var4);
                    obj3 = df1Var4;
                } else {
                    Object df1Var5 = new df1(rmb0Var, vmb0Var2, (byte) 24);
                    fetVar.o0(df1Var5);
                    obj3 = df1Var5;
                }
                m0x0.o(vmb0Var2, (Function1) obj3, fetVar);
                zI = fetVar.i(rmb0Var);
                Object objP14 = fetVar.P();
                obj4 = objP14;
                if (zI) {
                    Object y32Var4 = new y32(rmb0Var, null, (byte) 9);
                    fetVar.o0(y32Var4);
                    obj4 = y32Var4;
                } else {
                    Object y32Var5 = new y32(rmb0Var, null, (byte) 9);
                    fetVar.o0(y32Var5);
                    obj4 = y32Var5;
                }
                m0x0.t(fetVar, rmb0Var, (Function2) obj4);
                zI2 = fetVar.i(rmb0Var);
                Object objP15 = fetVar.P();
                obj5 = objP15;
                if (zI2) {
                    Object f13Var4 = new f13(rmb0Var, b2);
                    fetVar.o0(f13Var4);
                    obj5 = f13Var4;
                } else {
                    Object f13Var5 = new f13(rmb0Var, b2);
                    fetVar.o0(f13Var5);
                    obj5 = f13Var5;
                }
                mm40 mm40VarD2 = ro4.d0(jm40.b, (Function1) obj5);
                zI3 = fetVar.i(rmb0Var) | fetVar.e(k6zVar.ordinal());
                Object objP16 = fetVar.P();
                obj6 = objP16;
                if (zI3) {
                    Object h13Var4 = new h13(rmb0Var, k6zVar, b2);
                    fetVar.o0(h13Var4);
                    obj6 = h13Var4;
                } else {
                    Object h13Var5 = new h13(rmb0Var, k6zVar, b2);
                    fetVar.o0(h13Var5);
                    obj6 = h13Var5;
                }
                tj30 tj30Var3 = (tj30) obj6;
                int iHashCode3 = Long.hashCode(fetVar.T);
                bh90 bh90VarM3 = fetVar.m();
                mm40 mm40VarC2 = kbc.c0(fetVar, mm40VarD2);
                mkd.c0.getClass();
                fetVar.i0();
                if (fetVar.S) {
                    fetVar.l(e7z.u1);
                } else {
                    fetVar.r0();
                }
                jpm0.o(fetVar, tj30Var3, gqw0.x);
                jpm0.o(fetVar, bh90VarM3, gqw0.w);
                jpm0.o(fetVar, Integer.valueOf(iHashCode3), gqw0.y);
                jpm0.n(fetVar);
                jpm0.o(fetVar, mm40VarC2, gqw0.v);
                fetVar.r(true);
                function2 = function3;
                wmb0Var3 = wmb0Var4;
            } else {
                fetVar.X();
                wmb0Var3 = wmb0Var2;
                function2 = function1;
            }
            yfe0VarU = fetVar.u();
            if (yfe0VarU != null) {
                yfe0VarU.d = new g13((byte) 0, i, i2, vmb0Var2, function2, wmb0Var3, ugdVar);
            }
        }
        i3 |= 384;
        wmb0Var2 = wmb0Var;
        if ((i & 3072) == 0) {
            if (fetVar.i(ugdVar)) {
                i10 = 2048;
            } else {
                i10 = 1024;
            }
            i3 |= i10;
        }
        i6 = i3;
        if ((i6 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (fetVar.U(i6 & 1, z)) {
            if (i11 != 0) {
                function3 = null;
            } else {
                function3 = function1;
            }
            if (i4 != 0) {
                wmb0Var4 = new wmb0(31);
            } else {
                wmb0Var4 = wmb0Var2;
            }
            view = (View) fetVar.k(dy2.f);
            w6kVar = (w6k) fetVar.k(bmd.h);
            str = (String) fetVar.k(f17498a);
            k6zVar = (k6z) fetVar.k(bmd.n);
            aVarG = e3c.G(fetVar);
            pz40VarF = androidx.compose.runtime.e.f(ugdVar, fetVar);
            Object[] objArr4 = new Object[0];
            objP = fetVar.P();
            obj = ukd.f35823a;
            obj2 = objP;
            if (objP == obj) {
                Object t32Var4 = new t32((byte) 25);
                fetVar.o0(t32Var4);
                obj2 = t32Var4;
            }
            uuid = (UUID) e9x.Q(objArr4, (Function0) obj2, fetVar, 48);
            zBooleanValue = ((Boolean) fetVar.k(b)).booleanValue();
            objP2 = fetVar.P();
            if (objP2 == obj) {
                str2 = str;
                b2 = 0;
                rmb0 rmb0Var5 = new rmb0(function3, wmb0Var4, str2, view, w6kVar, vmb0Var2, uuid, zBooleanValue);
                vmb0Var2 = vmb0Var2;
                rmb0Var5.n(aVarG, new ugd(-297523940, true, new e13(rmb0Var5, pz40VarF, b2)));
                fetVar.o0(rmb0Var5);
                objP2 = rmb0Var5;
            } else {
                b2 = 0;
                str2 = str;
            }
            rmb0Var = (rmb0) objP2;
            boolean zI13 = fetVar.i(rmb0Var);
            i7 = i6 & 112;
            if (i7 == 32) {
                b3 = 1;
            } else {
                b3 = b2;
            }
            int i18 = (zI13 ? 1 : 0) | b3;
            i8 = i6 & 896;
            if (i8 == 256) {
                b4 = 1;
            } else {
                b4 = b2;
            }
            z2 = (((i18 | b4) | (fetVar.g(str2) ? 1 : 0)) == true ? 1 : 0) | (fetVar.e(k6zVar.ordinal()) ? 1 : 0);
            objP3 = fetVar.P();
            if (z2 == 0) {
                objP3 = new dg(rmb0Var, function3, wmb0Var4, str2, k6zVar);
                fetVar.o0(objP3);
            } else {
                objP3 = new dg(rmb0Var, function3, wmb0Var4, str2, k6zVar);
                fetVar.o0(objP3);
            }
            m0x0.o(rmb0Var, (Function1) objP3, fetVar);
            boolean zI14 = fetVar.i(rmb0Var);
            if (i7 == 32) {
                b5 = 1;
            } else {
                b5 = b2;
            }
            int i19 = (zI14 ? 1 : 0) | b5;
            if (i8 == 256) {
                b6 = 1;
            } else {
                b6 = b2;
            }
            z3 = (((i19 | b6) | (fetVar.g(str2) ? 1 : 0)) == true ? 1 : 0) | (fetVar.e(k6zVar.ordinal()) ? 1 : 0);
            objP4 = fetVar.P();
            if (z3 == 0) {
                objP4 = new ng0((Object) rmb0Var, (Object) function3, (Object) wmb0Var4, (Object) str2, (Object) k6zVar, (byte) 2);
                fetVar.o0(objP4);
            } else {
                objP4 = new ng0((Object) rmb0Var, (Object) function3, (Object) wmb0Var4, (Object) str2, (Object) k6zVar, (byte) 2);
                fetVar.o0(objP4);
            }
            m0x0.D((Function0) objP4, fetVar);
            boolean zI15 = fetVar.i(rmb0Var);
            if ((i6 & 14) == 4) {
                b7 = 1;
            } else {
                b7 = b2;
            }
            i9 = (zI15 ? 1 : 0) | b7;
            Object objP17 = fetVar.P();
            obj3 = objP17;
            if (i9 == 0) {
                Object df1Var6 = new df1(rmb0Var, vmb0Var2, (byte) 24);
                fetVar.o0(df1Var6);
                obj3 = df1Var6;
            } else {
                Object df1Var7 = new df1(rmb0Var, vmb0Var2, (byte) 24);
                fetVar.o0(df1Var7);
                obj3 = df1Var7;
            }
            m0x0.o(vmb0Var2, (Function1) obj3, fetVar);
            zI = fetVar.i(rmb0Var);
            Object objP18 = fetVar.P();
            obj4 = objP18;
            if (zI) {
                Object y32Var6 = new y32(rmb0Var, null, (byte) 9);
                fetVar.o0(y32Var6);
                obj4 = y32Var6;
            } else {
                Object y32Var7 = new y32(rmb0Var, null, (byte) 9);
                fetVar.o0(y32Var7);
                obj4 = y32Var7;
            }
            m0x0.t(fetVar, rmb0Var, (Function2) obj4);
            zI2 = fetVar.i(rmb0Var);
            Object objP19 = fetVar.P();
            obj5 = objP19;
            if (zI2) {
                Object f13Var6 = new f13(rmb0Var, b2);
                fetVar.o0(f13Var6);
                obj5 = f13Var6;
            } else {
                Object f13Var7 = new f13(rmb0Var, b2);
                fetVar.o0(f13Var7);
                obj5 = f13Var7;
            }
            mm40 mm40VarD3 = ro4.d0(jm40.b, (Function1) obj5);
            zI3 = fetVar.i(rmb0Var) | fetVar.e(k6zVar.ordinal());
            Object objP110 = fetVar.P();
            obj6 = objP110;
            if (zI3) {
                Object h13Var6 = new h13(rmb0Var, k6zVar, b2);
                fetVar.o0(h13Var6);
                obj6 = h13Var6;
            } else {
                Object h13Var7 = new h13(rmb0Var, k6zVar, b2);
                fetVar.o0(h13Var7);
                obj6 = h13Var7;
            }
            tj30 tj30Var4 = (tj30) obj6;
            int iHashCode4 = Long.hashCode(fetVar.T);
            bh90 bh90VarM4 = fetVar.m();
            mm40 mm40VarC3 = kbc.c0(fetVar, mm40VarD3);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30Var4, gqw0.x);
            jpm0.o(fetVar, bh90VarM4, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode4), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC3, gqw0.v);
            fetVar.r(true);
            function2 = function3;
            wmb0Var3 = wmb0Var4;
        } else {
            fetVar.X();
            wmb0Var3 = wmb0Var2;
            function2 = function1;
        }
        yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new g13((byte) 0, i, i2, vmb0Var2, function2, wmb0Var3, ugdVar);
        }
    }

    public static final boolean b(View view) {
        ViewGroup.LayoutParams layoutParams = view.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        return (layoutParams2 == null || (layoutParams2.flags & 8192) == 0) ? false : true;
    }
}
