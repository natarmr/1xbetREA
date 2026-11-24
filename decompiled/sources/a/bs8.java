package a;

import android.content.Context;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final class bs8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3116a;
    public final TextPaint b;
    public final TextPaint c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public final int n;
    public final int o;
    public final int p;
    public final int q;
    public final int r;
    public final int s;
    public final int t;
    public final int u;
    public final int v;
    public final int w;
    public final int x;
    public final int y;
    public final int z;

    public bs8(Context context, int i) {
        this.f3116a = i;
        TextPaint textPaint = new TextPaint();
        r7x.r(textPaint, context, R.style.TextStyle_Caption_Medium_L);
        textPaint.setAntiAlias(true);
        this.b = textPaint;
        TextPaint textPaint2 = new TextPaint();
        r7x.r(textPaint2, context, R.style.TextStyle_Text_Regular);
        textPaint2.setAntiAlias(true);
        this.c = textPaint2;
        context.getResources().getDimensionPixelSize(R.dimen.size_6);
        this.d = context.getResources().getDimensionPixelSize(R.dimen.size_8);
        this.e = context.getResources().getDimensionPixelSize(R.dimen.size_12);
        this.f = context.getResources().getDimensionPixelSize(R.dimen.size_14);
        this.g = context.getResources().getDimensionPixelSize(R.dimen.size_16);
        context.getResources().getDimensionPixelSize(R.dimen.size_20);
        this.h = context.getResources().getDimensionPixelSize(R.dimen.size_22);
        this.i = context.getResources().getDimensionPixelSize(R.dimen.size_24);
        context.getResources().getDimensionPixelSize(R.dimen.size_28);
        this.j = context.getResources().getDimensionPixelSize(R.dimen.size_32);
        context.getResources().getDimensionPixelSize(R.dimen.size_36);
        this.k = context.getResources().getDimensionPixelSize(R.dimen.size_80);
        this.l = context.getResources().getDimensionPixelSize(R.dimen.size_92);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.size_52);
        this.m = dimensionPixelSize;
        context.getResources().getDimensionPixelSize(R.dimen.size_64);
        context.getResources().getDimensionPixelSize(R.dimen.size_60);
        this.n = context.getResources().getDimensionPixelSize(R.dimen.size_72);
        this.o = dimensionPixelSize;
        this.p = context.getResources().getDimensionPixelSize(R.dimen.size_70);
        this.q = context.getResources().getDimensionPixelSize(R.dimen.size_54);
        this.r = context.getResources().getDimensionPixelSize(R.dimen.size_86);
        this.s = context.getResources().getDimensionPixelSize(R.dimen.size_54);
        this.t = context.getResources().getDimensionPixelSize(R.dimen.size_54);
        this.u = context.getResources().getDimensionPixelSize(R.dimen.size_64);
        this.v = context.getResources().getDimensionPixelSize(R.dimen.size_68);
        this.w = context.getResources().getDimensionPixelSize(R.dimen.size_32);
        this.x = context.getResources().getDimensionPixelSize(R.dimen.size_50);
        this.y = context.getResources().getDimensionPixelSize(R.dimen.size_40);
        this.z = context.getResources().getDimensionPixelSize(R.dimen.size_72);
        sj3.X(69);
    }

    public static boolean c(lk50 lk50Var) {
        u0m0 u0m0Var = (u0m0) CollectionsKt.firstOrNull(lk50Var.i);
        return u0m0Var == null || u0m0Var.i == lho.GAME_STATUS_LINE;
    }

    public static boolean d(lk50 lk50Var) {
        List list = lk50Var.i;
        if (list != null && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((u0m0) it.next()).i == lho.GAME_STATUS_LIVE) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:109:0x012f  */
    /* JADX WARN: Code duplicated, block: B:123:0x0155  */
    /* JADX WARN: Code duplicated, block: B:39:0x006f  */
    /* JADX WARN: Code duplicated, block: B:40:0x0072  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:92:0x00ff  */
    public final int a(lk50 lk50Var, v5l0 v5l0Var) {
        String str = lk50Var.c;
        String str2 = lk50Var.b;
        boolean z = lk50Var.o;
        int iB = this.l;
        if (z) {
            return iB;
        }
        boolean zD = d(lk50Var);
        cys0 cys0Var = lk50Var.j;
        boolean z2 = true;
        int i = zD ? as8.f1380a[v5l0Var.ordinal()] == 1 ? this.h : this.g : 0;
        int iOrdinal = v5l0Var.ordinal();
        int i2 = this.v;
        int i3 = this.m;
        if (iOrdinal != 0) {
            int i4 = this.f;
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    int i5 = this.k;
                    int i6 = this.n;
                    if (iOrdinal == 3) {
                        switch (cys0Var.ordinal()) {
                            case 0:
                                iB = i6;
                                break;
                            case 1:
                                if (!c(lk50Var)) {
                                    iB = i2;
                                } else {
                                    iB = i6;
                                }
                                break;
                            case 2:
                                if (!c(lk50Var)) {
                                    iB = i2;
                                } else {
                                    iB = i3;
                                }
                                break;
                            case 3:
                                iB = !c(lk50Var) ? i3 : i6;
                                break;
                            case 4:
                                if (!c(lk50Var)) {
                                    iB = i2;
                                } else {
                                    iB = i6;
                                }
                                break;
                            case 5:
                                iB = i5;
                                break;
                            case 6:
                                break;
                            default:
                                t9f.b();
                                return 0;
                        }
                    } else {
                        if (iOrdinal != 4) {
                            t9f.b();
                            return 0;
                        }
                        switch (cys0Var.ordinal()) {
                            case 0:
                                iB = this.z;
                                break;
                            case 1:
                                if (!c(lk50Var)) {
                                    iB = i2;
                                } else {
                                    iB = i6;
                                }
                                break;
                            case 2:
                                if (!c(lk50Var)) {
                                    iB = i2;
                                } else {
                                    iB = i3;
                                }
                                break;
                            case 3:
                                if (!c(lk50Var)) {
                                    iB = i3;
                                } else {
                                    iB = this.z;
                                }
                                break;
                            case 4:
                                if (!c(lk50Var)) {
                                    iB = i2;
                                } else {
                                    iB = this.z;
                                }
                                break;
                            case 5:
                                iB = i5;
                                break;
                            case 6:
                                break;
                            default:
                                t9f.b();
                                return 0;
                        }
                    }
                } else {
                    switch (cys0Var.ordinal()) {
                        case 0:
                        case 2:
                        case 4:
                            if (!c(lk50Var)) {
                                iB = this.p;
                            } else {
                                iB = this.o;
                            }
                            break;
                        case 1:
                            if (!c(lk50Var)) {
                                iB = i2;
                            } else {
                                iB = this.o;
                            }
                            break;
                        case 3:
                            if (!c(lk50Var)) {
                                iB = i3;
                            } else {
                                iB = this.o;
                            }
                            break;
                        case 5:
                            if (str2.length() != 0) {
                                str = str2;
                            }
                            iB = i4 * b(str, this.c, 3);
                            int i7 = this.i;
                            if (i7 >= iB) {
                                iB = i7;
                            }
                            break;
                        case 6:
                            break;
                        default:
                            t9f.b();
                            return 0;
                    }
                }
            } else if (c(lk50Var)) {
                iB = this.w;
            } else {
                switch (cys0Var.ordinal()) {
                    case 0:
                    case 2:
                    case 4:
                        iB = this.x;
                        break;
                    case 1:
                        iB = this.y;
                        break;
                    case 3:
                        iB = this.w;
                        break;
                    case 5:
                        if (str2.length() != 0) {
                            str = str2;
                        }
                        iB = b(str, this.b, 2) * i4;
                        break;
                    case 6:
                        break;
                    default:
                        t9f.b();
                        return 0;
                }
            }
        } else {
            switch (cys0Var.ordinal()) {
                case 0:
                    iB = this.q;
                    break;
                case 1:
                    if (!c(lk50Var)) {
                        iB = i2;
                    } else {
                        iB = this.t;
                    }
                    break;
                case 2:
                case 4:
                    iB = !d(lk50Var) ? this.s : this.r;
                    break;
                case 3:
                    if (!c(lk50Var)) {
                        iB = this.u;
                    } else {
                        iB = this.t;
                    }
                    break;
                case 5:
                    iB = i3;
                    break;
                case 6:
                    break;
                default:
                    t9f.b();
                    return 0;
            }
        }
        int i8 = i + iB;
        boolean z3 = cys0Var == cys0.b;
        boolean z4 = lk50Var.m.c;
        boolean z5 = CollectionsKt.firstOrNull(lk50Var.i) != null;
        if (z3) {
            if (c(lk50Var)) {
                z2 = z4;
            } else {
                z2 = false;
            }
        } else if (!z5 && !z4) {
            z2 = false;
        }
        return i8 + (z2 ? this.j : 0) + ((as8.f1380a[v5l0Var.ordinal()] == 2 ? this.d : this.e) * 2);
    }

    public final int b(String str, TextPaint textPaint, int i) {
        return xdx.I(f1t0.L(str), textPaint, this.f3116a - this.i, i, TextUtils.TruncateAt.END, 0, Layout.Alignment.ALIGN_NORMAL, 1264).getLineCount();
    }
}
