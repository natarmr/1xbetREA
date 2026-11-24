package a;

import android.content.Context;
import android.gov.nist.core.Separators;
import android.view.GestureDetector;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes2.dex */
public final class qo8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f29060a;
    public int b;
    public boolean c;
    public final Object d;
    public Object e;

    public qo8(List list) {
        this.f29060a = (byte) 2;
        list.getClass();
        this.d = list;
        this.e = (dhf) CollectionsKt.U(list);
        this.c = list.size() > 1;
        q3d.i(list);
    }

    public static void a(rg40[][][] rg40VarArr, int i, rg40 rg40Var) {
        rg40[] rg40VarArr2 = rg40VarArr[i + rg40Var.d][rg40Var.c];
        hm40 hm40Var = rg40Var.f30415a;
        int iOrdinal = hm40Var.ordinal();
        char c = 2;
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                c = 1;
            } else if (iOrdinal == 4) {
                c = 3;
            } else {
                if (iOrdinal != 6) {
                    e9d0.v(hm40Var, "Illegal mode ");
                    return;
                }
                c = 0;
            }
        }
        rg40 rg40Var2 = rg40VarArr2[c];
        if (rg40Var2 == null || rg40Var2.f > rg40Var.f) {
            rg40VarArr2[c] = rg40Var;
        }
    }

    public static boolean c(hm40 hm40Var, char c) {
        int iOrdinal = hm40Var.ordinal();
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                if ((c < '`' ? awn.f1583a[c] : -1) == -1) {
                    return false;
                }
            } else if (iOrdinal != 4) {
                if (iOrdinal != 6) {
                    return false;
                }
                return awn.b(String.valueOf(c));
            }
        } else if (c < '0' || c > '9') {
            return false;
        }
        return true;
    }

    public static ubu0 f(int i) {
        int iE = hne.E(i);
        if (iE != 0) {
            return iE != 1 ? ubu0.c(40) : ubu0.c(26);
        }
        return ubu0.c(9);
    }

    public static qo8 g(String str) {
        x0x.z("The separator may not be the empty string.", !str.isEmpty());
        if (str.length() != 1) {
            return new qo8(new d9v(str, (byte) 2));
        }
        return new qo8(new b0l0(new vub(str.charAt(0)), (byte) 0));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x002f  */
    public void b(ubu0 ubu0Var, rg40[][][] rg40VarArr, int i, rg40 rg40Var) {
        int i2;
        String str = (String) this.d;
        rgn rgnVar = (rgn) this.e;
        CharsetEncoder[] charsetEncoderArr = rgnVar.f30446a;
        int length = charsetEncoderArr.length;
        int i3 = rgnVar.b;
        if (i3 >= 0) {
            char cCharAt = str.charAt(i);
            if (charsetEncoderArr[i3].canEncode("" + cCharAt)) {
                length = i3 + 1;
            } else {
                i3 = 0;
            }
        } else {
            i3 = 0;
        }
        int i4 = length;
        for (int i5 = i3; i5 < i4; i5++) {
            char cCharAt2 = str.charAt(i);
            if (charsetEncoderArr[i5].canEncode("" + cCharAt2)) {
                a(rg40VarArr, i, new rg40(this, hm40.BYTE, i, i5, 1, rg40Var, ubu0Var));
            }
        }
        char cCharAt3 = str.charAt(i);
        hm40 hm40Var = hm40.KANJI;
        if (c(hm40Var, cCharAt3)) {
            a(rg40VarArr, i, new rg40(this, hm40Var, i, 0, 1, rg40Var, ubu0Var));
        }
        int length2 = str.length();
        char cCharAt4 = str.charAt(i);
        hm40 hm40Var2 = hm40.ALPHANUMERIC;
        int i6 = 2;
        if (c(hm40Var2, cCharAt4)) {
            int i7 = i + 1;
            a(rg40VarArr, i, new rg40(this, hm40Var2, i, 0, (i7 >= length2 || !c(hm40Var2, str.charAt(i7))) ? 1 : 2, rg40Var, ubu0Var));
        }
        char cCharAt5 = str.charAt(i);
        hm40 hm40Var3 = hm40.NUMERIC;
        if (c(hm40Var3, cCharAt5)) {
            int i8 = i + 1;
            if (i8 >= length2 || !c(hm40Var3, str.charAt(i8))) {
                i2 = 1;
            } else {
                int i9 = i + 2;
                if (i9 < length2 && c(hm40Var3, str.charAt(i9))) {
                    i6 = 3;
                }
                i2 = i6;
            }
            a(rg40VarArr, i, new rg40(this, hm40Var3, i, 0, i2, rg40Var, ubu0Var));
        }
    }

    public void d(int i) {
        byte b = this.f29060a;
        Object obj = this.d;
        switch (b) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.e;
                WeakReference weakReference = bottomSheetBehavior.Y;
                if (weakReference != null && weakReference.get() != null) {
                    this.b = i;
                    if (!this.c) {
                        ((View) bottomSheetBehavior.Y.get()).postOnAnimation((mx2) obj);
                        this.c = true;
                    }
                    break;
                }
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.e;
                WeakReference weakReference2 = sideSheetBehavior.p;
                if (weakReference2 != null && weakReference2.get() != null) {
                    this.b = i;
                    if (!this.c) {
                        ((View) sideSheetBehavior.p.get()).postOnAnimation((apj0) obj);
                        this.c = true;
                    }
                    break;
                }
                break;
        }
    }

    public ouu e(ubu0 ubu0Var) throws lrv0 {
        int i;
        String str = (String) this.d;
        int length = str.length();
        CharsetEncoder[] charsetEncoderArr = ((rgn) this.e).f30446a;
        rg40[][][] rg40VarArr = (rg40[][][]) Array.newInstance((Class<?>) rg40.class, length + 1, charsetEncoderArr.length, 4);
        b(ubu0Var, rg40VarArr, 0, null);
        for (int i2 = 1; i2 <= length; i2++) {
            for (int i3 = 0; i3 < charsetEncoderArr.length; i3++) {
                for (int i4 = 0; i4 < 4; i4++) {
                    rg40 rg40Var = rg40VarArr[i2][i3][i4];
                    if (rg40Var != null && i2 < length) {
                        b(ubu0Var, rg40VarArr, i2, rg40Var);
                    }
                }
            }
        }
        int i5 = -1;
        int i6 = Integer.MAX_VALUE;
        int i7 = -1;
        for (int i8 = 0; i8 < charsetEncoderArr.length; i8++) {
            for (int i9 = 0; i9 < 4; i9++) {
                rg40 rg40Var2 = rg40VarArr[length][i8][i9];
                if (rg40Var2 != null && (i = rg40Var2.f) < i6) {
                    i5 = i8;
                    i7 = i9;
                    i6 = i;
                }
            }
        }
        if (i5 >= 0) {
            return new ouu(this, ubu0Var, rg40VarArr[length][i5][i7]);
        }
        throw new lrv0(kng0.l("Internal error: failed to encode \"", str, Separators.DOUBLE_QUOTE));
    }

    public List h(CharSequence charSequence) {
        charSequence.getClass();
        Iterator itD = ((e0l0) this.e).d(this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (true) {
            c0l0 c0l0Var = (c0l0) itD;
            if (!c0l0Var.hasNext()) {
                return Collections.unmodifiableList(arrayList);
            }
            arrayList.add((String) c0l0Var.next());
        }
    }

    public qo8(e0l0 e0l0Var, boolean z, uub uubVar, int i) {
        this.f29060a = (byte) 6;
        this.e = e0l0Var;
        this.c = z;
        this.d = uubVar;
        this.b = i;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public qo8(e0l0 e0l0Var) {
        this(e0l0Var, false, (uub) wub.b, Integer.MAX_VALUE);
        this.f29060a = (byte) 6;
    }

    public qo8(String str, Charset charset, boolean z, int i) {
        this.f29060a = (byte) 4;
        this.d = str;
        this.c = z;
        this.e = new rgn(str, charset);
        this.b = i;
    }

    public qo8(SideSheetBehavior sideSheetBehavior) {
        this.f29060a = (byte) 5;
        this.e = sideSheetBehavior;
        this.d = new apj0((Object) this, (byte) 1);
    }

    public qo8(BottomSheetBehavior bottomSheetBehavior) {
        this.f29060a = (byte) 0;
        this.e = bottomSheetBehavior;
        this.d = new mx2(this, (byte) 3);
    }

    public qo8(int i) {
        this.f29060a = (byte) 1;
        this.d = new vbs0[i];
        this.c = false;
    }

    public qo8(Context context, ax2 ax2Var) {
        this.f29060a = (byte) 3;
        this.d = ax2Var;
        this.b = 0;
        this.e = new GestureDetector(context, new i7x(this));
    }
}
