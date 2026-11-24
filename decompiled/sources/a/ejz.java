package a;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ejz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f7930a;
    public final xex b;
    public djz e;
    public k7q0 f;
    public wgu0 g;
    public Rect l;
    public final viz m;
    public Function1 c = new z8z(12);
    public Function1 d = new z8z(13);
    public a8q0 h = new a8q0("", o9q0.b, 4);
    public k3x i = k3x.g;
    public final ArrayList j = new ArrayList();
    public final a8z k = maz.a(wez.b, new rcz(this, 6));

    public ejz(View view, d03 d03Var, xex xexVar) {
        this.f7930a = view;
        this.b = xexVar;
        this.m = new viz(d03Var, xexVar);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00a5 A[PHI: r15
  0x00a5: PHI (r15v5 int) = (r15v0 int), (r15v4 int) binds: [B:36:0x00a3, B:48:0x00bf] A[DONT_GENERATE, DONT_INLINE]] */
    public final hge0 a(EditorInfo editorInfo) {
        int i;
        int i2;
        a8q0 a8q0Var = this.h;
        String str = a8q0Var.f440a.b;
        long j = a8q0Var.b;
        k3x k3xVar = this.i;
        int i3 = k3xVar.e;
        int i4 = k3xVar.d;
        boolean z = k3xVar.f17640a;
        int i5 = 3;
        if (i3 == 1) {
            i = z ? 6 : 0;
        } else if (i3 == 0) {
            i = 1;
        } else if (i3 == 2) {
            i = 2;
        } else if (i3 == 6) {
            i = 5;
        } else if (i3 == 5) {
            i = 7;
        } else if (i3 == 3) {
            i = 3;
        } else if (i3 == 4) {
            i = 4;
        } else {
            if (i3 != 7) {
                jf4.n("invalid ImeAction");
                return null;
            }
        }
        editorInfo.imeOptions = i;
        rs00 rs00Var = k3xVar.f;
        if (Intrinsics.d(rs00Var, rs00.c)) {
            editorInfo.hintLocales = null;
        } else {
            ArrayList arrayList = new ArrayList(r3d.q(rs00Var, 10));
            Iterator it = rs00Var.f31011a.iterator();
            while (it.hasNext()) {
                arrayList.add(((qs00) it.next()).f29235a);
            }
            Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
            editorInfo.hintLocales = new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length));
        }
        if (i4 == 1) {
            i2 = 1;
        } else if (i4 == 2) {
            editorInfo.imeOptions |= Integer.MIN_VALUE;
            i2 = 1;
        } else if (i4 == 3) {
            i2 = 2;
        } else if (i4 == 4) {
            i2 = i5;
        } else {
            i2 = 17;
            if (i4 != 5) {
                if (i4 == 6) {
                    i2 = 33;
                } else if (i4 == 7) {
                    i2 = 129;
                } else {
                    i5 = 18;
                    if (i4 == 8) {
                        i2 = i5;
                    } else if (i4 == 9) {
                        i2 = 8194;
                    } else if (i4 == 10) {
                        i2 = 145;
                    } else if (i4 == 11) {
                        i2 = 113;
                    } else if (i4 == 12) {
                        i2 = 97;
                    } else if (i4 == 13) {
                        i2 = 49;
                    } else if (i4 == 14) {
                        i2 = 65;
                    } else if (i4 == 15) {
                        i2 = 81;
                    } else if (i4 == 16) {
                        i2 = 177;
                    } else if (i4 == 17) {
                        i2 = 193;
                    } else if (i4 == 18) {
                        i2 = 4;
                    } else {
                        i2 = 20;
                        if (i4 != 19) {
                            if (i4 == 20) {
                                i2 = 36;
                            } else if (i4 == 21) {
                                i2 = 4098;
                            } else if (i4 == 22) {
                                i2 = 12290;
                            } else if (i4 == 23) {
                                i2 = 8210;
                            } else if (i4 == 24) {
                                i2 = 4114;
                            } else {
                                if (i4 != 25) {
                                    jf4.n("Invalid Keyboard Type");
                                    return null;
                                }
                                i2 = 12306;
                            }
                        }
                    }
                }
            }
        }
        editorInfo.inputType = i2;
        if (!z && (i2 & 15) == 1) {
            i2 |= 131072;
            editorInfo.inputType = i2;
            if (k3xVar.e == 1) {
                editorInfo.imeOptions |= 1073741824;
            }
        }
        if ((i2 & 15) == 1) {
            int i6 = k3xVar.b;
            if (i6 == 1) {
                i2 |= 4096;
                editorInfo.inputType = i2;
            } else if (i6 == 2) {
                i2 |= 8192;
                editorInfo.inputType = i2;
            } else if (i6 == 3) {
                i2 |= 16384;
                editorInfo.inputType = i2;
            }
            if (k3xVar.c) {
                i2 |= 32768;
                editorInfo.inputType = i2;
            }
            if (Build.VERSION.SDK_INT >= 37) {
                editorInfo.inputType = 2097152 | i2;
            }
        }
        int i7 = o9q0.c;
        editorInfo.initialSelStart = (int) (j >> 32);
        editorInfo.initialSelEnd = (int) (j & 4294967295L);
        nnw0.H(editorInfo, str);
        editorInfo.imeOptions |= 33554432;
        if (!pum0.f27625a || i4 == 7 || i4 == 10 || i4 == 8 || i4 == 23 || i4 == 24 || i4 == 25) {
            if (Build.VERSION.SDK_INT >= 35) {
                qef.d(editorInfo, false);
            }
            Bundle bundle = editorInfo.extras;
            if (bundle == null) {
                bundle = new Bundle();
                editorInfo.extras = bundle;
            }
            bundle.putBoolean("androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED", false);
        } else {
            if (Build.VERSION.SDK_INT >= 35) {
                qef.d(editorInfo, true);
            }
            Bundle bundle2 = editorInfo.extras;
            if (bundle2 == null) {
                bundle2 = new Bundle();
                editorInfo.extras = bundle2;
            }
            bundle2.putBoolean("androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED", true);
            editorInfo.setSupportedHandwritingGestures(q3d.j(dwf.m(), dwf.z(), dwf.v(), dwf.x(), dwf.B(), dwf.C(), dwf.D()));
            editorInfo.setSupportedHandwritingGesturePreviews(tx3.l0(new Class[]{dwf.m(), dwf.z(), dwf.v(), dwf.x()}));
        }
        ziz zizVar = ajz.f1001a;
        if (qsn.d()) {
            qsn.a().i(editorInfo);
        }
        hge0 hge0Var = new hge0(this.h, new svu(this), this.i.c, this.e, this.f, this.g);
        this.j.add(new WeakReference(hge0Var));
        return hge0Var;
    }
}
