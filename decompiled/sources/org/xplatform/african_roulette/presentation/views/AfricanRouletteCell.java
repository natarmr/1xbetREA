package org.xplatform.african_roulette.presentation.views;

import a.b5;
import a.hny;
import a.jf4;
import a.vd7;
import a.wg;
import a.yum0;
import a.z70;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.appsflyer.share.attribution.RequestError;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes2.dex */
public final class AfricanRouletteCell extends FrameLayout {
    public static final /* synthetic */ int c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vd7 f46268a;
    public Function1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AfricanRouletteCell(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        attributeSet.getClass();
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.cell_african_roulette, (ViewGroup) this, false);
        addView(viewInflate);
        int i = R.id.imgChip;
        ImageView imageView = (ImageView) yum0.f(viewInflate, R.id.imgChip);
        if (imageView != null) {
            i = R.id.txtCell;
            TextView textView = (TextView) yum0.f(viewInflate, R.id.txtCell);
            if (textView != null) {
                this.f46268a = new vd7((FrameLayout) viewInflate, imageView, textView, (byte) 2);
                this.b = new b5((byte) 13);
                setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                return;
            }
        }
        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        throw null;
    }

    public final void a(z70 z70Var) {
        int i;
        z70Var.getClass();
        vd7 vd7Var = this.f46268a;
        ((TextView) vd7Var.d).setText(z70Var.a());
        FrameLayout frameLayout = (FrameLayout) vd7Var.b;
        int iOrdinal = z70Var.ordinal();
        byte b = 3;
        if (iOrdinal == 0) {
            i = R.drawable.cell_green;
        } else if (iOrdinal != 1 && iOrdinal != 3 && iOrdinal != 5 && iOrdinal != 7 && iOrdinal != 9 && iOrdinal != 11) {
            switch (iOrdinal) {
                case 13:
                case 14:
                    i = R.drawable.cell_empty_big;
                    break;
                case 15:
                case 16:
                case 17:
                    i = R.drawable.cell_empty;
                    break;
                case 18:
                    i = R.drawable.cell_red_big;
                    break;
                case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                    i = R.drawable.cell_black_big;
                    break;
                default:
                    i = R.drawable.cell_black;
                    break;
            }
        } else {
            i = R.drawable.cell_red;
        }
        frameLayout.setBackgroundResource(i);
        frameLayout.setOnClickListener(new wg(this, z70Var, b));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final z70 getBetType$african_roulette() {
        String string = ((TextView) this.f46268a.d).getText().toString();
        int iHashCode = string.hashCode();
        switch (iHashCode) {
            case 48:
                if (string.equals("0")) {
                    return z70.b;
                }
                break;
            case 49:
                if (string.equals("1")) {
                    return z70.c;
                }
                break;
            case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                if (string.equals("2")) {
                    return z70.d;
                }
                break;
            case 51:
                if (string.equals("3")) {
                    return z70.e;
                }
                break;
            case 52:
                if (string.equals("4")) {
                    return z70.f;
                }
                break;
            case 53:
                if (string.equals("5")) {
                    return z70.g;
                }
                break;
            case 54:
                if (string.equals("6")) {
                    return z70.h;
                }
                break;
            case 55:
                if (string.equals("7")) {
                    return z70.i;
                }
                break;
            case 56:
                if (string.equals("8")) {
                    return z70.j;
                }
                break;
            case 57:
                if (string.equals("9")) {
                    return z70.k;
                }
                break;
            default:
                switch (iHashCode) {
                    case 1567:
                        if (string.equals("10")) {
                            return z70.l;
                        }
                        break;
                    case 1568:
                        if (string.equals("11")) {
                            return z70.m;
                        }
                        break;
                    case 1569:
                        if (string.equals("12")) {
                            return z70.n;
                        }
                        break;
                    default:
                        switch (iHashCode) {
                            case 2305:
                                if (string.equals("HI")) {
                                    return z70.s;
                                }
                                break;
                            case 2435:
                                if (string.equals("LO")) {
                                    return z70.q;
                                }
                                break;
                            case 48538:
                                if (string.equals("1-6")) {
                                    return z70.o;
                                }
                                break;
                            case 76328:
                                if (string.equals("MID")) {
                                    return z70.r;
                                }
                                break;
                            case 81009:
                                if (string.equals("RED")) {
                                    return z70.t;
                                }
                                break;
                            case 1683319:
                                if (string.equals("7-12")) {
                                    return z70.p;
                                }
                                break;
                            case 63281119:
                                if (string.equals("BLACK")) {
                                    return z70.u;
                                }
                                break;
                        }
                        break;
                }
                break;
        }
        jf4.o("Unknown bet type: ".concat(string));
        return null;
    }

    public final void setCellClickListener$african_roulette(Function1<? super z70, Unit> function1) {
        function1.getClass();
        this.b = function1;
    }
}
