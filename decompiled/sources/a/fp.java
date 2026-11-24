package a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
public class fp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f9907a;
    public int b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;

    public fp(onv onvVar) {
        this.f9907a = (byte) 0;
        this.c = new awa0(30);
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.b = 0;
        this.f = onvVar;
        this.g = new nr00(this);
    }

    public static /* synthetic */ void t(fp fpVar, String str, int i, String str2, int i2) {
        if ((i2 & 2) != 0) {
            i = fpVar.b;
        }
        if ((i2 & 4) != 0) {
            str2 = null;
        }
        fpVar.s(i, str, str2);
        throw null;
    }

    public void A(AttributeSet attributeSet, int i) {
        ColorStateList colorStateListG;
        View view = (View) this.c;
        Context context = view.getContext();
        int[] iArr = mqd0.A;
        ywu ywuVarY = ywu.y(i, 0, context, attributeSet, iArr);
        TypedArray typedArray = (TypedArray) ywuVarY.c;
        View view2 = (View) this.c;
        rgu0.n(view2, view2.getContext(), iArr, attributeSet, (TypedArray) ywuVarY.c, i, 0);
        try {
            if (typedArray.hasValue(0)) {
                this.b = typedArray.getResourceId(0, -1);
                td3 td3Var = (td3) this.d;
                Context context2 = view.getContext();
                int i2 = this.b;
                synchronized (td3Var) {
                    colorStateListG = td3Var.f33746a.g(i2, context2);
                }
                if (colorStateListG != null) {
                    N(colorStateListG);
                }
            }
            if (typedArray.hasValue(1)) {
                view.setBackgroundTintList(ywuVarY.m(1));
            }
            if (typedArray.hasValue(2)) {
                view.setBackgroundTintMode(qhl.c(typedArray.getInt(2, -1), null));
            }
            ywuVarY.A();
        } catch (Throwable th) {
            ywuVarY.A();
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ep B(Object obj, int i, int i2, int i3) {
        ep epVar = (ep) ((awa0) this.c).a();
        if (epVar != null) {
            epVar.f8161a = i;
            epVar.b = i2;
            epVar.d = i3;
            epVar.c = obj;
            return epVar;
        }
        ep epVar2 = new ep();
        epVar2.f8161a = i;
        epVar2.b = i2;
        epVar2.d = i3;
        epVar2.c = obj;
        return epVar2;
    }

    public void C() {
        this.b = -1;
        N(null);
        c();
    }

    public void D(int i) {
        ColorStateList colorStateListG;
        this.b = i;
        td3 td3Var = (td3) this.d;
        if (td3Var != null) {
            Context context = ((View) this.c).getContext();
            synchronized (td3Var) {
                colorStateListG = td3Var.f33746a.g(i, context);
            }
        } else {
            colorStateListG = null;
        }
        N(colorStateListG);
        c();
    }

    public String E(String str, boolean z) {
        str.getClass();
        int i = this.b;
        try {
            if (h() == 6 && Intrinsics.d(G(z), str)) {
                this.e = null;
                if (h() == 5) {
                    return G(z);
                }
            }
            return null;
        } finally {
            this.b = i;
            this.e = null;
        }
    }

    public byte F() {
        String str = (String) this.g;
        int i = this.b;
        while (true) {
            int iJ = J(i);
            if (iJ == -1) {
                this.b = iJ;
                return (byte) 10;
            }
            char cCharAt = str.charAt(iJ);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != ' ') {
                this.b = iJ;
                return rq8.H(cCharAt);
            }
            i = iJ + 1;
        }
    }

    public String G(boolean z) {
        String strM;
        byte bF = F();
        if (z) {
            if (bF != 1 && bF != 0) {
                return null;
            }
            strM = n();
        } else {
            if (bF != 1) {
                return null;
            }
            strM = m();
        }
        this.e = strM;
        return strM;
    }

    public void H(ep epVar) {
        onv onvVar = (onv) this.f;
        ((ArrayList) this.e).add(epVar);
        byte b = epVar.f8161a;
        if (b == 1) {
            onvVar.t(epVar.b, epVar.d);
            return;
        }
        if (b == 2) {
            int i = epVar.b;
            int i2 = epVar.d;
            RecyclerView recyclerView = (RecyclerView) onvVar.f25567a;
            recyclerView.f0(i, i2, false);
            recyclerView.K1 = true;
            return;
        }
        if (b == 4) {
            onvVar.s(epVar.b, epVar.d, epVar.c);
        } else if (b == 8) {
            onvVar.u(epVar.b, epVar.d);
        } else {
            e9d0.i(epVar, "Unknown update op type for ");
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x018a  */
    /* JADX WARN: Code duplicated, block: B:103:0x0198  */
    /* JADX WARN: Code duplicated, block: B:104:0x019c  */
    /* JADX WARN: Code duplicated, block: B:188:0x00ae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:189:0x0130 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:192:0x0123 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:193:0x01a1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:202:0x0012 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:206:0x0012 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x0079  */
    /* JADX WARN: Code duplicated, block: B:30:0x007e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0083  */
    /* JADX WARN: Code duplicated, block: B:36:0x009a  */
    /* JADX WARN: Code duplicated, block: B:37:0x009e  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:75:0x0132  */
    /* JADX WARN: Code duplicated, block: B:76:0x0134  */
    /* JADX WARN: Code duplicated, block: B:78:0x013a  */
    /* JADX WARN: Code duplicated, block: B:81:0x0145  */
    /* JADX WARN: Code duplicated, block: B:84:0x0150  */
    /* JADX WARN: Code duplicated, block: B:87:0x015b  */
    /* JADX WARN: Code duplicated, block: B:88:0x0161  */
    /* JADX WARN: Code duplicated, block: B:89:0x0163  */
    /* JADX WARN: Code duplicated, block: B:91:0x0169  */
    /* JADX WARN: Code duplicated, block: B:94:0x0174  */
    /* JADX WARN: Code duplicated, block: B:97:0x017f  */
    public void I() {
        boolean z;
        byte b;
        ep epVarB;
        int i;
        int i2;
        int i3;
        ep epVarB2;
        boolean z2;
        boolean z3;
        Object obj;
        ep epVar;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        awa0 awa0Var = (awa0) this.c;
        onv onvVar = (onv) this.f;
        nr00 nr00Var = (nr00) this.g;
        ArrayList arrayList = (ArrayList) this.d;
        while (true) {
            int size = arrayList.size() - 1;
            boolean z4 = false;
            while (true) {
                if (size < 0) {
                    size = -1;
                    break;
                }
                if (((ep) arrayList.get(size)).f8161a == 8) {
                    if (z4) {
                        break;
                    }
                } else {
                    z4 = true;
                }
                size--;
            }
            if (size == -1) {
                break;
            }
            int i12 = size + 1;
            fp fpVar = (fp) nr00Var.f23980a;
            awa0 awa0Var2 = (awa0) fpVar.c;
            ep epVar2 = (ep) arrayList.get(size);
            ep epVar3 = (ep) arrayList.get(i12);
            byte b2 = epVar3.f8161a;
            if (b2 == 1) {
                int i13 = epVar2.d;
                int i14 = epVar3.b;
                int i15 = i13 < i14 ? -1 : 0;
                int i16 = epVar2.b;
                if (i16 < i14) {
                    i15++;
                }
                if (i14 <= i16) {
                    epVar2.b = i16 + epVar3.d;
                }
                int i17 = epVar3.b;
                if (i17 <= i13) {
                    epVar2.d = i13 + epVar3.d;
                }
                epVar3.b = i17 + i15;
                arrayList.set(size, epVar3);
                arrayList.set(i12, epVar2);
            } else if (b2 == 2) {
                int i18 = epVar2.b;
                int i19 = epVar2.d;
                int i20 = epVar3.b;
                if (i18 < i19) {
                    if (i20 == i18 && epVar3.d == i19 - i18) {
                        z2 = false;
                        z3 = true;
                    } else {
                        z2 = false;
                        z3 = false;
                    }
                } else if (i20 == i19 + 1 && epVar3.d == i18 - i19) {
                    z2 = true;
                    z3 = true;
                } else {
                    z2 = true;
                    z3 = false;
                }
                if (i19 < i20) {
                    i20--;
                    epVar3.b = i20;
                } else {
                    int i21 = epVar3.d;
                    if (i19 < i20 + i21) {
                        epVar3.d = i21 - 1;
                        epVar2.f8161a = (byte) 2;
                        epVar2.d = 1;
                        if (epVar3.d == 0) {
                            arrayList.remove(i12);
                            epVar3.c = null;
                            awa0Var2.c(epVar3);
                        }
                    }
                }
                int i22 = epVar2.b;
                if (i22 <= i20) {
                    epVar3.b = i20 + 1;
                } else {
                    int i23 = i20 + epVar3.d;
                    if (i22 < i23) {
                        obj = null;
                        ep epVarB3 = fpVar.B(null, 2, i22 + 1, i23 - i22);
                        epVar3.d = epVar2.b - epVar3.b;
                        epVar = epVarB3;
                    }
                    if (z3) {
                        arrayList.set(size, epVar3);
                        arrayList.remove(i12);
                        epVar2.c = obj;
                        awa0Var2.c(epVar2);
                    } else {
                        if (z2) {
                            if (epVar != null) {
                                i10 = epVar2.b;
                                if (i10 > epVar.b) {
                                    epVar2.b = i10 - epVar.d;
                                }
                                i11 = epVar2.d;
                                if (i11 > epVar.b) {
                                    epVar2.d = i11 - epVar.d;
                                }
                            }
                            i8 = epVar2.b;
                            if (i8 > epVar3.b) {
                                epVar2.b = i8 - epVar3.d;
                            }
                            i9 = epVar2.d;
                            if (i9 > epVar3.b) {
                                epVar2.d = i9 - epVar3.d;
                            }
                        } else {
                            if (epVar != null) {
                                i6 = epVar2.b;
                                if (i6 >= epVar.b) {
                                    epVar2.b = i6 - epVar.d;
                                }
                                i7 = epVar2.d;
                                if (i7 >= epVar.b) {
                                    epVar2.d = i7 - epVar.d;
                                }
                            }
                            i4 = epVar2.b;
                            if (i4 >= epVar3.b) {
                                epVar2.b = i4 - epVar3.d;
                            }
                            i5 = epVar2.d;
                            if (i5 >= epVar3.b) {
                                epVar2.d = i5 - epVar3.d;
                            }
                        }
                        arrayList.set(size, epVar3);
                        if (epVar2.b != epVar2.d) {
                            arrayList.set(i12, epVar2);
                        } else {
                            arrayList.remove(i12);
                        }
                        if (epVar != null) {
                            arrayList.add(size, epVar);
                        }
                    }
                }
                obj = null;
                epVar = null;
                if (z3) {
                    arrayList.set(size, epVar3);
                    arrayList.remove(i12);
                    epVar2.c = obj;
                    awa0Var2.c(epVar2);
                } else {
                    if (z2) {
                        if (epVar != null) {
                            i10 = epVar2.b;
                            if (i10 > epVar.b) {
                                epVar2.b = i10 - epVar.d;
                            }
                            i11 = epVar2.d;
                            if (i11 > epVar.b) {
                                epVar2.d = i11 - epVar.d;
                            }
                        }
                        i8 = epVar2.b;
                        if (i8 > epVar3.b) {
                            epVar2.b = i8 - epVar3.d;
                        }
                        i9 = epVar2.d;
                        if (i9 > epVar3.b) {
                            epVar2.d = i9 - epVar3.d;
                        }
                    } else {
                        if (epVar != null) {
                            i6 = epVar2.b;
                            if (i6 >= epVar.b) {
                                epVar2.b = i6 - epVar.d;
                            }
                            i7 = epVar2.d;
                            if (i7 >= epVar.b) {
                                epVar2.d = i7 - epVar.d;
                            }
                        }
                        i4 = epVar2.b;
                        if (i4 >= epVar3.b) {
                            epVar2.b = i4 - epVar3.d;
                        }
                        i5 = epVar2.d;
                        if (i5 >= epVar3.b) {
                            epVar2.d = i5 - epVar3.d;
                        }
                    }
                    arrayList.set(size, epVar3);
                    if (epVar2.b != epVar2.d) {
                        arrayList.set(i12, epVar2);
                    } else {
                        arrayList.remove(i12);
                    }
                    if (epVar != null) {
                        arrayList.add(size, epVar);
                    }
                }
            } else if (b2 == 4) {
                int i24 = epVar2.d;
                int i25 = epVar3.b;
                if (i24 < i25) {
                    epVar3.b = i25 - 1;
                } else {
                    int i26 = epVar3.d;
                    if (i24 < i25 + i26) {
                        epVar3.d = i26 - 1;
                        epVarB = fpVar.B(epVar3.c, 4, epVar2.b, 1);
                    }
                    i = epVar2.b;
                    i2 = epVar3.b;
                    if (i <= i2) {
                        epVar3.b = i2 + 1;
                    } else {
                        i3 = i2 + epVar3.d;
                        if (i < i3) {
                            int i27 = i3 - i;
                            epVarB2 = fpVar.B(epVar3.c, 4, i + 1, i27);
                            epVar3.d -= i27;
                        }
                        arrayList.set(i12, epVar2);
                        if (epVar3.d > 0) {
                            arrayList.set(size, epVar3);
                        } else {
                            arrayList.remove(size);
                            epVar3.c = null;
                            awa0Var2.c(epVar3);
                        }
                        if (epVarB != null) {
                            arrayList.add(size, epVarB);
                        }
                        if (epVarB2 != null) {
                            arrayList.add(size, epVarB2);
                        }
                    }
                    epVarB2 = null;
                    arrayList.set(i12, epVar2);
                    if (epVar3.d > 0) {
                        arrayList.set(size, epVar3);
                    } else {
                        arrayList.remove(size);
                        epVar3.c = null;
                        awa0Var2.c(epVar3);
                    }
                    if (epVarB != null) {
                        arrayList.add(size, epVarB);
                    }
                    if (epVarB2 != null) {
                        arrayList.add(size, epVarB2);
                    }
                }
                epVarB = null;
                i = epVar2.b;
                i2 = epVar3.b;
                if (i <= i2) {
                    epVar3.b = i2 + 1;
                } else {
                    i3 = i2 + epVar3.d;
                    if (i < i3) {
                        int i28 = i3 - i;
                        epVarB2 = fpVar.B(epVar3.c, 4, i + 1, i28);
                        epVar3.d -= i28;
                    }
                    arrayList.set(i12, epVar2);
                    if (epVar3.d > 0) {
                        arrayList.set(size, epVar3);
                    } else {
                        arrayList.remove(size);
                        epVar3.c = null;
                        awa0Var2.c(epVar3);
                    }
                    if (epVarB != null) {
                        arrayList.add(size, epVarB);
                    }
                    if (epVarB2 != null) {
                        arrayList.add(size, epVarB2);
                    }
                }
                epVarB2 = null;
                arrayList.set(i12, epVar2);
                if (epVar3.d > 0) {
                    arrayList.set(size, epVar3);
                } else {
                    arrayList.remove(size);
                    epVar3.c = null;
                    awa0Var2.c(epVar3);
                }
                if (epVarB != null) {
                    arrayList.add(size, epVarB);
                }
                if (epVarB2 != null) {
                    arrayList.add(size, epVarB2);
                }
            }
        }
        int size2 = arrayList.size();
        for (int i29 = 0; i29 < size2; i29++) {
            ep epVarB4 = (ep) arrayList.get(i29);
            byte b3 = epVarB4.f8161a;
            if (b3 == 1) {
                H(epVarB4);
            } else if (b3 == 2) {
                int i30 = epVarB4.b;
                int i31 = epVarB4.d + i30;
                int i32 = i30;
                int i33 = 0;
                byte b4 = -1;
                while (i32 < i31) {
                    if (onvVar.p(i32) != null || e(i32)) {
                        if (b4 == 0) {
                            q(B(null, 2, i30, i33));
                            z = true;
                        } else {
                            z = false;
                        }
                        b = 1;
                    } else {
                        if (b4 == 1) {
                            H(B(null, 2, i30, i33));
                            z = true;
                        } else {
                            z = false;
                        }
                        b = 0;
                    }
                    if (z) {
                        i32 -= i33;
                        i31 -= i33;
                        i33 = 1;
                    } else {
                        i33++;
                    }
                    i32++;
                    b4 = b;
                }
                if (i33 != epVarB4.d) {
                    epVarB4.c = null;
                    awa0Var.c(epVarB4);
                    epVarB4 = B(null, 2, i30, i33);
                }
                if (b4 == 0) {
                    q(epVarB4);
                } else {
                    H(epVarB4);
                }
            } else if (b3 == 4) {
                int i34 = epVarB4.b;
                int i35 = epVarB4.d + i34;
                int i36 = i34;
                int i37 = 0;
                byte b5 = -1;
                while (i34 < i35) {
                    if (onvVar.p(i34) != null || e(i34)) {
                        if (b5 == 0) {
                            q(B(epVarB4.c, 4, i36, i37));
                            i36 = i34;
                            i37 = 0;
                        }
                        b5 = 1;
                    } else {
                        if (b5 == 1) {
                            H(B(epVarB4.c, 4, i36, i37));
                            i36 = i34;
                            i37 = 0;
                        }
                        b5 = 0;
                    }
                    i37++;
                    i34++;
                }
                if (i37 != epVarB4.d) {
                    Object obj2 = epVarB4.c;
                    epVarB4.c = null;
                    awa0Var.c(epVarB4);
                    epVarB4 = B(obj2, 4, i36, i37);
                }
                if (b5 == 0) {
                    q(epVarB4);
                } else {
                    H(epVarB4);
                }
            } else if (b3 == 8) {
                H(epVarB4);
            }
        }
        arrayList.clear();
    }

    public int J(int i) {
        if (i < ((String) this.g).length()) {
            return i;
        }
        return -1;
    }

    public void K(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ep epVar = (ep) arrayList.get(i);
            epVar.c = null;
            ((awa0) this.c).c(epVar);
        }
        arrayList.clear();
    }

    public void L(xlw xlwVar) {
        int iH = tx3.H(xlwVar, (xlw[]) this.c);
        if (iH >= 0) {
            xlw[] xlwVarArr = (xlw[]) this.c;
            int i = iH + 1;
            qx3.e(iH, i, this.b, xlwVarArr, xlwVarArr);
            xlw[] xlwVarArr2 = (xlw[]) this.c;
            int i2 = this.b;
            xlwVarArr2[i2 - 1] = null;
            float[] fArr = (float[]) this.d;
            System.arraycopy(fArr, i, fArr, iH, i2 - i);
            byte[] bArr = (byte[]) this.e;
            qx3.f(bArr, iH, bArr, i, this.b);
            this.b--;
        }
    }

    public void M(Runnable runnable) {
        q9o0 q9o0Var = (q9o0) this.c;
        if (q9o0Var.f28360a.getLooper().getThread().isAlive()) {
            q9o0Var.e(runnable);
        }
    }

    public void N(ColorStateList colorStateList) {
        if (colorStateList != null) {
            goq0 goq0Var = (goq0) this.e;
            if (goq0Var == null) {
                goq0Var = new goq0();
                this.e = goq0Var;
            }
            goq0Var.f11644a = colorStateList;
            goq0Var.d = true;
        } else {
            this.e = null;
        }
        c();
    }

    public void O(int i) {
        x0x.K(i >= 0);
        this.b = i;
        v(i);
    }

    public void P(ColorStateList colorStateList) {
        goq0 goq0Var = (goq0) this.f;
        if (goq0Var == null) {
            goq0Var = new goq0();
            this.f = goq0Var;
        }
        goq0Var.f11644a = colorStateList;
        goq0Var.d = true;
        c();
    }

    public void Q(PorterDuff.Mode mode) {
        goq0 goq0Var = (goq0) this.f;
        if (goq0Var == null) {
            goq0Var = new goq0();
            this.f = goq0Var;
        }
        goq0Var.b = mode;
        goq0Var.c = true;
        c();
    }

    public int R() {
        char cCharAt;
        int i = this.b;
        if (i == -1) {
            return i;
        }
        String str = (String) this.g;
        while (i < str.length() && ((cCharAt = str.charAt(i)) == ' ' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == '\t')) {
            i++;
        }
        this.b = i;
        return i;
    }

    public boolean S() {
        int iR = R();
        String str = (String) this.g;
        if (iR >= str.length() || iR == -1 || str.charAt(iR) != ',') {
            return false;
        }
        this.b++;
        return true;
    }

    public boolean T(boolean z) {
        int iJ = J(R());
        String str = (String) this.g;
        int length = str.length() - iJ;
        if (length >= 4 && iJ != -1) {
            for (int i = 0; i < 4; i++) {
                if ("null".charAt(i) == str.charAt(iJ + i)) {
                }
            }
            if (length <= 4 || rq8.H(str.charAt(iJ + 4)) != 0) {
                if (z) {
                    this.b = iJ + 4;
                }
                return true;
            }
        }
        return false;
    }

    public void U(char c) {
        String str = (String) this.g;
        int i = this.b;
        if (i > 0 && c == '\"') {
            try {
                this.b = i - 1;
                String strN = n();
                this.b = i;
                if (Intrinsics.d(strN, "null")) {
                    s(this.b - 1, "Expected string literal but 'null' literal was found", "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.");
                    throw null;
                }
            } catch (Throwable th) {
                this.b = i;
                throw th;
            }
        }
        String strY = rq8.Y(rq8.H(c));
        int i2 = this.b;
        int i3 = i2 > 0 ? i2 - 1 : i2;
        t(this, b1j.k("Expected ", strY, ", but had '", (i2 == str.length() || i3 < 0) ? "EOF" : String.valueOf(str.charAt(i3)), "' instead"), i3, null, 4);
        throw null;
    }

    public int V(int i, int i2) {
        int i3;
        int i4;
        awa0 awa0Var = (awa0) this.c;
        ArrayList arrayList = (ArrayList) this.e;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ep epVar = (ep) arrayList.get(size);
            byte b = epVar.f8161a;
            int i5 = epVar.b;
            if (b == 8) {
                int i6 = epVar.d;
                if (i5 < i6) {
                    i4 = i6;
                    i3 = i5;
                } else {
                    i3 = i6;
                    i4 = i5;
                }
                if (i < i3 || i > i4) {
                    if (i < i5) {
                        if (i2 == 1) {
                            epVar.b = i5 + 1;
                            epVar.d = i6 + 1;
                        } else if (i2 == 2) {
                            epVar.b = i5 - 1;
                            epVar.d = i6 - 1;
                        }
                    }
                } else if (i3 == i5) {
                    if (i2 == 1) {
                        epVar.d = i6 + 1;
                    } else if (i2 == 2) {
                        epVar.d = i6 - 1;
                    }
                    i++;
                } else {
                    if (i2 == 1) {
                        epVar.b = i5 + 1;
                    } else if (i2 == 2) {
                        epVar.b = i5 - 1;
                    }
                    i--;
                }
            } else if (i5 <= i) {
                if (b == 1) {
                    i -= epVar.d;
                } else if (b == 2) {
                    i += epVar.d;
                }
            } else if (i2 == 1) {
                epVar.b = i5 + 1;
            } else if (i2 == 2) {
                epVar.b = i5 - 1;
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            ep epVar2 = (ep) arrayList.get(size2);
            byte b2 = epVar2.f8161a;
            int i7 = epVar2.d;
            if (b2 == 8) {
                if (i7 == epVar2.b || i7 < 0) {
                    arrayList.remove(size2);
                    epVar2.c = null;
                    awa0Var.c(epVar2);
                }
            } else if (i7 <= 0) {
                arrayList.remove(size2);
                epVar2.c = null;
                awa0Var.c(epVar2);
            }
        }
        return i;
    }

    public void W(Object obj) {
        Object obj2 = this.f;
        this.f = obj;
        if (obj2.equals(obj)) {
            return;
        }
        ulo uloVar = ((klo) this.e).f18500a;
        ((Integer) obj2).getClass();
        int iIntValue = ((Integer) obj).intValue();
        uloVar.c0();
        uloVar.l.g.b(40, iIntValue, 0).b();
        uloVar.m.e(21, new bsj(iIntValue, (byte) 2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002c, code lost:
    
        if (r10 < r3.b) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(long r10, a.fq80 r12) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.e
            java.util.ArrayDeque r0 = (java.util.ArrayDeque) r0
            java.lang.Object r1 = r9.f
            java.util.PriorityQueue r1 = (java.util.PriorityQueue) r1
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r2 == 0) goto L9f
            int r3 = r9.b
            if (r3 == 0) goto L9f
            r4 = -1
            if (r3 == r4) goto L2f
            int r3 = r1.size()
            int r5 = r9.b
            if (r3 < r5) goto L2f
            java.lang.Object r3 = r1.peek()
            a.hkf0 r3 = (a.hkf0) r3
            java.lang.String r5 = a.vtt0.f38024a
            long r5 = r3.b
            int r3 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r3 >= 0) goto L2f
            goto L9f
        L2f:
            java.lang.Object r3 = r9.d
            java.util.ArrayDeque r3 = (java.util.ArrayDeque) r3
            boolean r5 = r3.isEmpty()
            if (r5 == 0) goto L3f
            a.fq80 r3 = new a.fq80
            r3.<init>()
            goto L45
        L3f:
            java.lang.Object r3 = r3.pop()
            a.fq80 r3 = (a.fq80) r3
        L45:
            int r5 = r12.a()
            r3.J(r5)
            byte[] r5 = r12.f9961a
            int r12 = r12.b
            byte[] r6 = r3.f9961a
            int r7 = r3.a()
            r8 = 0
            java.lang.System.arraycopy(r5, r12, r6, r8, r7)
            java.lang.Object r12 = r9.g
            a.hkf0 r12 = (a.hkf0) r12
            if (r12 == 0) goto L6c
            long r5 = r12.b
            int r5 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r5 != 0) goto L6c
            java.util.ArrayList r9 = r12.f13206a
            r9.add(r3)
            return
        L6c:
            boolean r12 = r0.isEmpty()
            if (r12 == 0) goto L78
            a.hkf0 r12 = new a.hkf0
            r12.<init>()
            goto L7e
        L78:
            java.lang.Object r12 = r0.pop()
            a.hkf0 r12 = (a.hkf0) r12
        L7e:
            java.util.ArrayList r0 = r12.f13206a
            if (r2 == 0) goto L83
            r8 = 1
        L83:
            a.x0x.A(r8)
            boolean r2 = r0.isEmpty()
            a.x0x.K(r2)
            r12.b = r10
            r0.add(r3)
            r1.add(r12)
            r9.g = r12
            int r10 = r9.b
            if (r10 == r4) goto L9e
            r9.v(r10)
        L9e:
            return
        L9f:
            java.lang.Object r9 = r9.c
            a.ikf0 r9 = (a.ikf0) r9
            r9.f(r10, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a.fp.a(long, a.fq80):void");
    }

    public int b(int i, CharSequence charSequence) {
        int i2 = i + 4;
        if (i2 < charSequence.length()) {
            ((StringBuilder) this.f).append((char) (w(i + 3, charSequence) + (w(i, charSequence) << 12) + (w(i + 1, charSequence) << 8) + (w(i + 2, charSequence) << 4)));
            return i2;
        }
        this.b = i;
        if (i2 < charSequence.length()) {
            return b(this.b, charSequence);
        }
        t(this, "Unexpected EOF during unicode escape", 0, null, 6);
        throw null;
    }

    public void c() {
        View view = (View) this.c;
        Drawable background = view.getBackground();
        if (background != null) {
            if (((goq0) this.e) != null) {
                goq0 goq0Var = (goq0) this.g;
                if (goq0Var == null) {
                    goq0Var = new goq0();
                    this.g = goq0Var;
                }
                goq0Var.f11644a = null;
                goq0Var.d = false;
                goq0Var.b = null;
                goq0Var.c = false;
                WeakHashMap weakHashMap = rgu0.f30456a;
                ColorStateList backgroundTintList = view.getBackgroundTintList();
                if (backgroundTintList != null) {
                    goq0Var.d = true;
                    goq0Var.f11644a = backgroundTintList;
                }
                PorterDuff.Mode backgroundTintMode = view.getBackgroundTintMode();
                if (backgroundTintMode != null) {
                    goq0Var.c = true;
                    goq0Var.b = backgroundTintMode;
                }
                if (goq0Var.d || goq0Var.c) {
                    int[] drawableState = view.getDrawableState();
                    PorterDuff.Mode mode = td3.b;
                    dtf0.i(background, goq0Var, drawableState);
                    return;
                }
            }
            goq0 goq0Var2 = (goq0) this.f;
            if (goq0Var2 != null) {
                int[] drawableState2 = view.getDrawableState();
                PorterDuff.Mode mode2 = td3.b;
                dtf0.i(background, goq0Var2, drawableState2);
            } else {
                goq0 goq0Var3 = (goq0) this.e;
                if (goq0Var3 != null) {
                    int[] drawableState3 = view.getDrawableState();
                    PorterDuff.Mode mode3 = td3.b;
                    dtf0.i(background, goq0Var3, drawableState3);
                }
            }
        }
    }

    public boolean d() {
        int i = this.b;
        if (i == -1) {
            return false;
        }
        String str = (String) this.g;
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.b = i;
                return (cCharAt == ',' || cCharAt == ':' || cCharAt == ']' || cCharAt == '}') ? false : true;
            }
            i++;
        }
        this.b = i;
        return false;
    }

    public boolean e(int i) {
        ArrayList arrayList = (ArrayList) this.e;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ep epVar = (ep) arrayList.get(i2);
            byte b = epVar.f8161a;
            if (b != 8) {
                if (b == 1) {
                    int i3 = epVar.b;
                    int i4 = epVar.d + i3;
                    while (i3 < i4) {
                        if (u(i3, i2 + 1) == i) {
                            return true;
                        }
                        i3++;
                    }
                } else {
                    continue;
                }
            } else {
                if (u(epVar.d, i2 + 1) == i) {
                    return true;
                }
            }
        }
        return false;
    }

    public void f(int i, String str) {
        String str2 = (String) this.g;
        if (str2.length() - i < str.length()) {
            t(this, "Unexpected end of boolean literal", 0, null, 6);
            throw null;
        }
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            if (str.charAt(i2) != (str2.charAt(i + i2) | ' ')) {
                t(this, "Expected valid boolean literal prefix, but had '" + n() + '\'', 0, null, 6);
                throw null;
            }
        }
        this.b = str.length() + i;
    }

    public String g() {
        String string;
        StringBuilder sb = (StringBuilder) this.f;
        String str = (String) this.g;
        j('\"');
        int i = this.b;
        int iU = StringsKt.U('\"', i, 4, str);
        if (iU == -1) {
            n();
            int i2 = this.b;
            t(this, kng0.l("Expected quotation mark '\"', but had '", (i2 == str.length() || i2 < 0) ? "EOF" : String.valueOf(str.charAt(i2)), "' instead"), i2, null, 4);
            throw null;
        }
        int i3 = i;
        while (i3 < iU) {
            if (str.charAt(i3) == '\\') {
                int iJ = this.b;
                char cCharAt = str.charAt(i3);
                boolean z = false;
                while (cCharAt != '\"') {
                    if (cCharAt == '\\') {
                        sb.append((CharSequence) str, iJ, i3);
                        int iJ2 = J(i3 + 1);
                        if (iJ2 == -1) {
                            t(this, "Expected escape sequence to continue, got EOF", 0, null, 6);
                            throw null;
                        }
                        int iB = iJ2 + 1;
                        char cCharAt2 = str.charAt(iJ2);
                        if (cCharAt2 == 'u') {
                            iB = b(iB, str);
                        } else {
                            char c = cCharAt2 < 'u' ? tub.f34543a[cCharAt2] : (char) 0;
                            if (c == 0) {
                                t(this, "Invalid escaped char '" + cCharAt2 + '\'', 0, null, 6);
                                throw null;
                            }
                            sb.append(c);
                        }
                        iJ = J(iB);
                        if (iJ == -1) {
                            t(this, "Unexpected EOF", iJ, null, 4);
                            throw null;
                        }
                    } else {
                        i3++;
                        if (i3 >= str.length()) {
                            sb.append((CharSequence) str, iJ, i3);
                            iJ = J(i3);
                            if (iJ == -1) {
                                t(this, "Unexpected EOF", iJ, null, 4);
                                throw null;
                            }
                        } else {
                            continue;
                        }
                        cCharAt = str.charAt(i3);
                    }
                    i3 = iJ;
                    z = true;
                    cCharAt = str.charAt(i3);
                }
                if (z) {
                    sb.append((CharSequence) str, iJ, i3);
                    String string2 = sb.toString();
                    sb.setLength(0);
                    string = string2;
                } else {
                    string = str.subSequence(iJ, i3).toString();
                }
                this.b = i3 + 1;
                return string;
            }
            i3++;
        }
        this.b = iU + 1;
        return str.substring(i, iU);
    }

    public byte h() {
        String str = (String) this.g;
        int i = this.b;
        while (i != -1 && i < str.length()) {
            int i2 = i + 1;
            char cCharAt = str.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.b = i2;
                return rq8.H(cCharAt);
            }
            i = i2;
        }
        this.b = str.length();
        return (byte) 10;
    }

    public byte i(byte b) {
        String str = (String) this.g;
        byte bH = h();
        if (bH == b) {
            return bH;
        }
        String strY = rq8.Y(b);
        int i = this.b;
        int i2 = i > 0 ? i - 1 : i;
        t(this, b1j.k("Expected ", strY, ", but had '", (i == str.length() || i2 < 0) ? "EOF" : String.valueOf(str.charAt(i2)), "' instead"), i2, null, 4);
        throw null;
    }

    public void j(char c) {
        int i = this.b;
        if (i == -1) {
            U(c);
            throw null;
        }
        String str = (String) this.g;
        while (i < str.length()) {
            int i2 = i + 1;
            char cCharAt = str.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                this.b = i2;
                if (cCharAt == c) {
                    return;
                }
                U(c);
                throw null;
            }
            i = i2;
        }
        this.b = -1;
        U(c);
        throw null;
    }

    public long k() {
        boolean z;
        boolean z2;
        boolean z3;
        long j;
        double dPow;
        int iJ = J(R());
        String str = (String) this.g;
        if (iJ >= str.length() || iJ == -1) {
            t(this, "EOF", 0, null, 6);
            throw null;
        }
        if (str.charAt(iJ) == '\"') {
            iJ++;
            if (iJ == str.length()) {
                t(this, "EOF", 0, null, 6);
                throw null;
            }
            z = true;
        } else {
            z = false;
        }
        int i = iJ;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        long j2 = 0;
        long j3 = 0;
        while (true) {
            if (i == str.length()) {
                z2 = z;
                z3 = z5;
                break;
            }
            char cCharAt = str.charAt(i);
            if ((cCharAt != 'e' && cCharAt != 'E') || z5) {
                z2 = z;
                if (cCharAt == '-' && z5) {
                    if (i == iJ) {
                        t(this, "Unexpected symbol '-' in numeric literal", i, null, 4);
                        throw null;
                    }
                    i++;
                    z = z2;
                    z4 = false;
                } else if (cCharAt != '+' || !z5) {
                    z3 = z5;
                    if (cCharAt != '-') {
                        if (rq8.H(cCharAt) != 0) {
                            break;
                        }
                        int i2 = i + 1;
                        int i3 = cCharAt - '0';
                        if (i3 < 0 || i3 >= 10) {
                            t(this, "Unexpected symbol '" + cCharAt + "' in numeric literal", i, null, 4);
                            throw null;
                        }
                        if (z3) {
                            j2 = (j2 * 10) + ((long) i3);
                        } else {
                            j3 = (j3 * 10) - ((long) i3);
                            if (j3 > 0) {
                                t(this, "Numeric value overflow", 0, null, 6);
                                throw null;
                            }
                        }
                        i = i2;
                        z = z2;
                        z5 = z3;
                    } else {
                        if (i != iJ) {
                            t(this, "Unexpected symbol '-' in numeric literal", i, null, 4);
                            throw null;
                        }
                        i++;
                        z = z2;
                        z5 = z3;
                        z6 = true;
                    }
                } else {
                    if (i == iJ) {
                        t(this, "Unexpected symbol '+' in numeric literal", i, null, 4);
                        throw null;
                    }
                    i++;
                    z = z2;
                    z4 = true;
                }
            } else {
                if (i == iJ) {
                    t(this, "Unexpected symbol '" + cCharAt + "' in numeric literal", i, null, 4);
                    throw null;
                }
                i++;
                z4 = true;
                z5 = true;
            }
        }
        boolean z7 = i != iJ;
        if (iJ == i || (z6 && iJ == i - 1)) {
            t(this, "Expected numeric literal", i, null, 4);
            throw null;
        }
        if (z2) {
            if (!z7) {
                t(this, "EOF", 0, null, 6);
                throw null;
            }
            if (str.charAt(i) != '\"') {
                t(this, "Expected closing quotation mark", i, null, 4);
                throw null;
            }
            i++;
        }
        this.b = i;
        long j4 = j3;
        if (z3) {
            double d = j4;
            if (!z4) {
                dPow = Math.pow(10.0d, -j2);
            } else {
                if (!z4) {
                    t9f.b();
                    return 0L;
                }
                dPow = Math.pow(10.0d, j2);
            }
            double d2 = d * dPow;
            if (d2 > 9.223372036854776E18d || d2 < -9.223372036854776E18d) {
                t(this, "Numeric value overflow", 0, null, 6);
                throw null;
            }
            if (Math.floor(d2) != d2) {
                t(this, "Can't convert " + d2 + " to Long", 0, null, 6);
                throw null;
            }
            j = (long) d2;
        } else {
            j = j4;
        }
        if (z6) {
            return j;
        }
        if (j != Long.MIN_VALUE) {
            return -j;
        }
        t(this, "Numeric value overflow", 0, null, 6);
        throw null;
    }

    public void l() {
        ArrayList arrayList = (ArrayList) this.e;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((onv) this.f).o((ep) arrayList.get(i));
        }
        K(arrayList);
        this.b = 0;
    }

    public String m() {
        String str = (String) this.e;
        if (str == null) {
            return g();
        }
        str.getClass();
        this.e = null;
        return str;
    }

    public String n() {
        String string;
        StringBuilder sb = (StringBuilder) this.f;
        String str = (String) this.g;
        String str2 = (String) this.e;
        if (str2 != null) {
            str2.getClass();
            this.e = null;
            return str2;
        }
        int iR = R();
        if (iR >= str.length() || iR == -1) {
            t(this, "EOF", iR, null, 4);
            throw null;
        }
        byte bH = rq8.H(str.charAt(iR));
        if (bH == 1) {
            return m();
        }
        if (bH != 0) {
            t(this, "Expected beginning of the string, but got " + str.charAt(iR), 0, null, 6);
            throw null;
        }
        boolean z = false;
        while (rq8.H(str.charAt(iR)) == 0) {
            iR++;
            if (iR >= str.length()) {
                sb.append((CharSequence) str, this.b, iR);
                int iJ = J(iR);
                if (iJ == -1) {
                    this.b = iR;
                    sb.append((CharSequence) str, 0, 0);
                    String string2 = sb.toString();
                    sb.setLength(0);
                    return string2;
                }
                iR = iJ;
                z = true;
            }
        }
        int i = this.b;
        if (z) {
            sb.append((CharSequence) str, i, iR);
            String string3 = sb.toString();
            sb.setLength(0);
            string = string3;
        } else {
            string = str.subSequence(i, iR).toString();
        }
        this.b = iR;
        return string;
    }

    public String o() {
        String strN = n();
        if (!Intrinsics.d(strN, "null") || ((String) this.g).charAt(this.b - 1) == '\"') {
            return strN;
        }
        t(this, "Unexpected 'null' value instead of string literal", 0, null, 6);
        throw null;
    }

    public void p() {
        onv onvVar = (onv) this.f;
        l();
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ep epVar = (ep) arrayList.get(i);
            byte b = epVar.f8161a;
            if (b == 1) {
                onvVar.o(epVar);
                onvVar.t(epVar.b, epVar.d);
            } else if (b == 2) {
                onvVar.o(epVar);
                int i2 = epVar.b;
                int i3 = epVar.d;
                RecyclerView recyclerView = (RecyclerView) onvVar.f25567a;
                recyclerView.f0(i2, i3, true);
                recyclerView.K1 = true;
                recyclerView.H1.c += i3;
            } else if (b == 4) {
                onvVar.o(epVar);
                onvVar.s(epVar.b, epVar.d, epVar.c);
            } else if (b == 8) {
                onvVar.o(epVar);
                onvVar.u(epVar.b, epVar.d);
            }
        }
        K(arrayList);
        this.b = 0;
    }

    public void q(ep epVar) {
        int i;
        awa0 awa0Var = (awa0) this.c;
        byte b = epVar.f8161a;
        if (b == 1 || b == 8) {
            jf4.o("should not dispatch add or move for pre layout");
            return;
        }
        int iV = V(epVar.b, b);
        int i2 = epVar.b;
        byte b2 = epVar.f8161a;
        if (b2 == 2) {
            i = 0;
        } else {
            if (b2 != 4) {
                e9d0.i(epVar, "op should be remove or update.");
                return;
            }
            i = 1;
        }
        int i3 = 1;
        for (int i4 = 1; i4 < epVar.d; i4++) {
            int iV2 = V((i * i4) + epVar.b, epVar.f8161a);
            byte b3 = epVar.f8161a;
            if (b3 == 2 ? iV2 != iV : !(b3 == 4 && iV2 == iV + 1)) {
                ep epVarB = B(epVar.c, b3, iV, i3);
                r(epVarB, i2);
                epVarB.c = null;
                awa0Var.c(epVarB);
                if (epVar.f8161a == 4) {
                    i2 += i3;
                }
                i3 = 1;
                iV = iV2;
            } else {
                i3++;
            }
        }
        Object obj = epVar.c;
        epVar.c = null;
        awa0Var.c(epVar);
        if (i3 > 0) {
            ep epVarB2 = B(obj, epVar.f8161a, iV, i3);
            r(epVarB2, i2);
            epVarB2.c = null;
            awa0Var.c(epVarB2);
        }
    }

    public void r(ep epVar, int i) {
        onv onvVar = (onv) this.f;
        onvVar.o(epVar);
        byte b = epVar.f8161a;
        if (b != 2) {
            if (b == 4) {
                onvVar.s(i, epVar.d, epVar.c);
                return;
            } else {
                jf4.o("only remove and update ops can be dispatched in first pass");
                return;
            }
        }
        int i2 = epVar.d;
        RecyclerView recyclerView = (RecyclerView) onvVar.f25567a;
        recyclerView.f0(i, i2, true);
        recyclerView.K1 = true;
        recyclerView.H1.c += i2;
    }

    public void s(int i, String str, String str2) {
        String strF = ((sbx0) this.d).f();
        String str3 = (String) this.g;
        str3.getClass();
        throw new kcy(xww.B(i, str, strF, str2, ((dcy) this.c).i ? xww.R(i, str3).toString() : null));
    }

    public String toString() {
        switch (this.f9907a) {
            case 5:
                StringBuilder sb = new StringBuilder("JsonReader(source='");
                sb.append(this.g);
                sb.append("', currentPosition=");
                return brm0.n(sb, this.b, ')');
            default:
                return super.toString();
        }
    }

    public int u(int i, int i2) {
        ArrayList arrayList = (ArrayList) this.e;
        int size = arrayList.size();
        while (i2 < size) {
            ep epVar = (ep) arrayList.get(i2);
            byte b = epVar.f8161a;
            int i3 = epVar.b;
            if (b == 8) {
                if (i3 == i) {
                    i = epVar.d;
                } else {
                    if (i3 < i) {
                        i--;
                    }
                    if (epVar.d <= i) {
                        i++;
                    }
                }
            } else if (i3 > i) {
                continue;
            } else if (b == 2) {
                int i4 = epVar.d;
                if (i < i3 + i4) {
                    return -1;
                }
                i -= i4;
            } else if (b == 1) {
                i += epVar.d;
            }
            i2++;
        }
        return i;
    }

    public void v(int i) {
        ArrayList arrayList;
        PriorityQueue priorityQueue = (PriorityQueue) this.f;
        while (priorityQueue.size() > i) {
            hkf0 hkf0Var = (hkf0) priorityQueue.poll();
            String str = vtt0.f38024a;
            int i2 = 0;
            while (true) {
                arrayList = hkf0Var.f13206a;
                if (i2 >= arrayList.size()) {
                    break;
                }
                ((ikf0) this.c).f(hkf0Var.b, (fq80) arrayList.get(i2));
                ((ArrayDeque) this.d).push((fq80) arrayList.get(i2));
                i2++;
            }
            arrayList.clear();
            hkf0 hkf0Var2 = (hkf0) this.g;
            if (hkf0Var2 != null && hkf0Var2.b == hkf0Var.b) {
                this.g = null;
            }
            ((ArrayDeque) this.e).push(hkf0Var);
        }
    }

    public int w(int i, CharSequence charSequence) {
        char cCharAt = charSequence.charAt(i);
        if ('0' <= cCharAt && cCharAt < ':') {
            return cCharAt - '0';
        }
        if ('a' <= cCharAt && cCharAt < 'g') {
            return cCharAt - 'W';
        }
        if ('A' <= cCharAt && cCharAt < 'G') {
            return cCharAt - '7';
        }
        t(this, "Invalid toHexChar char '" + cCharAt + "' in unicode escape", 0, null, 6);
        throw null;
    }

    public ColorStateList x() {
        goq0 goq0Var = (goq0) this.f;
        if (goq0Var != null) {
            return goq0Var.f11644a;
        }
        return null;
    }

    public PorterDuff.Mode y() {
        goq0 goq0Var = (goq0) this.f;
        if (goq0Var != null) {
            return goq0Var.b;
        }
        return null;
    }

    public boolean z() {
        return ((ArrayList) this.d).size() > 0;
    }

    public fp(ikf0 ikf0Var) {
        this.f9907a = (byte) 3;
        this.c = ikf0Var;
        this.d = new ArrayDeque();
        this.e = new ArrayDeque();
        this.f = new PriorityQueue();
        this.b = -1;
    }

    public fp(View view) {
        this.f9907a = (byte) 1;
        this.b = -1;
        this.c = view;
        this.d = td3.a();
    }

    public fp(Object obj, Looper looper, Looper looper2, l9o0 l9o0Var, klo kloVar) {
        this.f9907a = (byte) 2;
        this.c = l9o0Var.a(looper, null);
        this.d = l9o0Var.a(looper2, null);
        this.f = obj;
        this.g = obj;
        this.e = kloVar;
    }

    public fp(String str, dcy dcyVar) {
        this.f9907a = (byte) 5;
        str.getClass();
        this.c = dcyVar;
        this.d = new sbx0(dcyVar);
        this.f = new StringBuilder();
        this.g = str;
    }

    public fp() {
        this.f9907a = (byte) 4;
        this.c = new xlw[32];
        this.d = new float[32];
        this.e = new byte[32];
        iz40 iz40Var = v1h0.f36630a;
        this.f = new iz40();
        this.g = new iz40();
    }
}
