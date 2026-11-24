package a;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.appsflyer.share.attribution.RequestError;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class r3e {
    public static final int[] h = {0, 4, 8};
    public static final SparseIntArray i;
    public static final SparseIntArray j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f29782a;
    public String b = "";
    public String[] c = new String[0];
    public int d = 0;
    public final HashMap e = new HashMap();
    public boolean f = true;
    public final HashMap g = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        i = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        j = sparseIntArray2;
        sparseIntArray.append(82, 25);
        sparseIntArray.append(83, 26);
        sparseIntArray.append(85, 29);
        sparseIntArray.append(86, 30);
        sparseIntArray.append(92, 36);
        sparseIntArray.append(91, 35);
        sparseIntArray.append(63, 4);
        sparseIntArray.append(62, 3);
        sparseIntArray.append(58, 1);
        sparseIntArray.append(60, 91);
        sparseIntArray.append(59, 92);
        sparseIntArray.append(101, 6);
        sparseIntArray.append(102, 7);
        sparseIntArray.append(70, 17);
        sparseIntArray.append(71, 18);
        sparseIntArray.append(72, 19);
        sparseIntArray.append(54, 99);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(87, 32);
        sparseIntArray.append(88, 33);
        sparseIntArray.append(69, 10);
        sparseIntArray.append(68, 9);
        sparseIntArray.append(106, 13);
        sparseIntArray.append(109, 16);
        sparseIntArray.append(107, 14);
        sparseIntArray.append(104, 11);
        sparseIntArray.append(108, 15);
        sparseIntArray.append(105, 12);
        sparseIntArray.append(95, 40);
        sparseIntArray.append(80, 39);
        sparseIntArray.append(79, 41);
        sparseIntArray.append(94, 42);
        sparseIntArray.append(78, 20);
        sparseIntArray.append(93, 37);
        sparseIntArray.append(67, 5);
        sparseIntArray.append(81, 87);
        sparseIntArray.append(90, 87);
        sparseIntArray.append(84, 87);
        sparseIntArray.append(61, 87);
        sparseIntArray.append(57, 87);
        sparseIntArray.append(5, 24);
        sparseIntArray.append(7, 28);
        sparseIntArray.append(23, 31);
        sparseIntArray.append(24, 8);
        sparseIntArray.append(6, 34);
        sparseIntArray.append(8, 2);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(4, 21);
        sparseIntArray.append(96, 95);
        sparseIntArray.append(73, 96);
        sparseIntArray.append(2, 22);
        sparseIntArray.append(13, 43);
        sparseIntArray.append(26, 44);
        sparseIntArray.append(21, 45);
        sparseIntArray.append(22, 46);
        sparseIntArray.append(20, 60);
        sparseIntArray.append(18, 47);
        sparseIntArray.append(19, 48);
        sparseIntArray.append(14, 49);
        sparseIntArray.append(15, 50);
        sparseIntArray.append(16, 51);
        sparseIntArray.append(17, 52);
        sparseIntArray.append(25, 53);
        sparseIntArray.append(97, 54);
        sparseIntArray.append(74, 55);
        sparseIntArray.append(98, 56);
        sparseIntArray.append(75, 57);
        sparseIntArray.append(99, 58);
        sparseIntArray.append(76, 59);
        sparseIntArray.append(64, 61);
        sparseIntArray.append(66, 62);
        sparseIntArray.append(65, 63);
        sparseIntArray.append(28, 64);
        sparseIntArray.append(121, 65);
        sparseIntArray.append(35, 66);
        sparseIntArray.append(122, 67);
        sparseIntArray.append(113, 79);
        sparseIntArray.append(1, 38);
        sparseIntArray.append(112, 68);
        sparseIntArray.append(100, 69);
        sparseIntArray.append(77, 70);
        sparseIntArray.append(111, 97);
        sparseIntArray.append(32, 71);
        sparseIntArray.append(30, 72);
        sparseIntArray.append(31, 73);
        sparseIntArray.append(33, 74);
        sparseIntArray.append(29, 75);
        sparseIntArray.append(114, 76);
        sparseIntArray.append(89, 77);
        sparseIntArray.append(123, 78);
        sparseIntArray.append(56, 80);
        sparseIntArray.append(55, 81);
        sparseIntArray.append(116, 82);
        sparseIntArray.append(120, 83);
        sparseIntArray.append(119, 84);
        sparseIntArray.append(118, 85);
        sparseIntArray.append(117, 86);
        sparseIntArray2.append(85, 6);
        sparseIntArray2.append(85, 7);
        sparseIntArray2.append(0, 27);
        sparseIntArray2.append(89, 13);
        sparseIntArray2.append(92, 16);
        sparseIntArray2.append(90, 14);
        sparseIntArray2.append(87, 11);
        sparseIntArray2.append(91, 15);
        sparseIntArray2.append(88, 12);
        sparseIntArray2.append(78, 40);
        sparseIntArray2.append(71, 39);
        sparseIntArray2.append(70, 41);
        sparseIntArray2.append(77, 42);
        sparseIntArray2.append(69, 20);
        sparseIntArray2.append(76, 37);
        sparseIntArray2.append(60, 5);
        sparseIntArray2.append(72, 87);
        sparseIntArray2.append(75, 87);
        sparseIntArray2.append(73, 87);
        sparseIntArray2.append(57, 87);
        sparseIntArray2.append(56, 87);
        sparseIntArray2.append(5, 24);
        sparseIntArray2.append(7, 28);
        sparseIntArray2.append(23, 31);
        sparseIntArray2.append(24, 8);
        sparseIntArray2.append(6, 34);
        sparseIntArray2.append(8, 2);
        sparseIntArray2.append(3, 23);
        sparseIntArray2.append(4, 21);
        sparseIntArray2.append(79, 95);
        sparseIntArray2.append(64, 96);
        sparseIntArray2.append(2, 22);
        sparseIntArray2.append(13, 43);
        sparseIntArray2.append(26, 44);
        sparseIntArray2.append(21, 45);
        sparseIntArray2.append(22, 46);
        sparseIntArray2.append(20, 60);
        sparseIntArray2.append(18, 47);
        sparseIntArray2.append(19, 48);
        sparseIntArray2.append(14, 49);
        sparseIntArray2.append(15, 50);
        sparseIntArray2.append(16, 51);
        sparseIntArray2.append(17, 52);
        sparseIntArray2.append(25, 53);
        sparseIntArray2.append(80, 54);
        sparseIntArray2.append(65, 55);
        sparseIntArray2.append(81, 56);
        sparseIntArray2.append(66, 57);
        sparseIntArray2.append(82, 58);
        sparseIntArray2.append(67, 59);
        sparseIntArray2.append(59, 62);
        sparseIntArray2.append(58, 63);
        sparseIntArray2.append(28, 64);
        sparseIntArray2.append(105, 65);
        sparseIntArray2.append(34, 66);
        sparseIntArray2.append(106, 67);
        sparseIntArray2.append(96, 79);
        sparseIntArray2.append(1, 38);
        sparseIntArray2.append(97, 98);
        sparseIntArray2.append(95, 68);
        sparseIntArray2.append(83, 69);
        sparseIntArray2.append(68, 70);
        sparseIntArray2.append(32, 71);
        sparseIntArray2.append(30, 72);
        sparseIntArray2.append(31, 73);
        sparseIntArray2.append(33, 74);
        sparseIntArray2.append(29, 75);
        sparseIntArray2.append(98, 76);
        sparseIntArray2.append(74, 77);
        sparseIntArray2.append(107, 78);
        sparseIntArray2.append(55, 80);
        sparseIntArray2.append(54, 81);
        sparseIntArray2.append(100, 82);
        sparseIntArray2.append(104, 83);
        sparseIntArray2.append(103, 84);
        sparseIntArray2.append(102, 85);
        sparseIntArray2.append(101, 86);
        sparseIntArray2.append(94, 97);
    }

    public static m3e d(Context context, XmlResourceParser xmlResourceParser) {
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlResourceParser);
        m3e m3eVar = new m3e();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSetAsAttributeSet, fqd0.c);
        o(m3eVar, typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
        return m3eVar;
    }

    public static int[] f(Barrier barrier, String str) {
        int iIntValue;
        String[] strArrSplit = str.split(Separators.COMMA);
        Context context = barrier.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i2 = 0;
        int i3 = 0;
        while (i2 < strArrSplit.length) {
            String strTrim = strArrSplit[i2].trim();
            Object obj = null;
            try {
                iIntValue = lpd0.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, ParameterNames.ID, context.getPackageName());
            }
            if (iIntValue == 0 && barrier.isInEditMode() && (barrier.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) barrier.getParent();
                if (strTrim != null) {
                    HashMap map = constraintLayout.m;
                    if (map != null && map.containsKey(strTrim)) {
                        obj = constraintLayout.m.get(strTrim);
                    }
                } else {
                    constraintLayout.getClass();
                }
                if (obj != null && (obj instanceof Integer)) {
                    iIntValue = ((Integer) obj).intValue();
                }
            }
            iArr[i3] = iIntValue;
            i2++;
            i3++;
        }
        return i3 != strArrSplit.length ? Arrays.copyOf(iArr, i3) : iArr;
    }

    public static m3e g(Context context, AttributeSet attributeSet, boolean z) {
        m3e m3eVar = new m3e();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z ? fqd0.c : fqd0.f9970a);
        if (z) {
            o(m3eVar, typedArrayObtainStyledAttributes);
        } else {
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            int i2 = 0;
            while (true) {
                n3e n3eVar = m3eVar.e;
                if (i2 < indexCount) {
                    int index = typedArrayObtainStyledAttributes.getIndex(i2);
                    p3e p3eVar = m3eVar.c;
                    q3e q3eVar = m3eVar.f;
                    o3e o3eVar = m3eVar.d;
                    if (index != 1 && 23 != index && 24 != index) {
                        o3eVar.f24579a = true;
                        n3eVar.b = true;
                        p3eVar.f26295a = true;
                        q3eVar.f28048a = true;
                    }
                    SparseIntArray sparseIntArray = i;
                    switch (sparseIntArray.get(index)) {
                        case 1:
                            n3eVar.q = l(typedArrayObtainStyledAttributes, index, n3eVar.q);
                            break;
                        case 2:
                            n3eVar.J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, n3eVar.J);
                            break;
                        case 3:
                            n3eVar.p = l(typedArrayObtainStyledAttributes, index, n3eVar.p);
                            break;
                        case 4:
                            n3eVar.o = l(typedArrayObtainStyledAttributes, index, n3eVar.o);
                            break;
                        case 5:
                            n3eVar.z = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        case 6:
                            n3eVar.D = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, n3eVar.D);
                            break;
                        case 7:
                            n3eVar.E = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, n3eVar.E);
                            break;
                        case 8:
                            n3eVar.K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, n3eVar.K);
                            break;
                        case 9:
                            n3eVar.w = l(typedArrayObtainStyledAttributes, index, n3eVar.w);
                            break;
                        case 10:
                            n3eVar.v = l(typedArrayObtainStyledAttributes, index, n3eVar.v);
                            break;
                        case 11:
                            n3eVar.Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, n3eVar.Q);
                            break;
                        case 12:
                            n3eVar.R = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, n3eVar.R);
                            break;
                        case 13:
                            n3eVar.N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, n3eVar.N);
                            break;
                        case 14:
                            n3eVar.P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, n3eVar.P);
                            break;
                        case 15:
                            n3eVar.S = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, n3eVar.S);
                            break;
                        case 16:
                            n3eVar.O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, n3eVar.O);
                            break;
                        case 17:
                            n3eVar.e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, n3eVar.e);
                            break;
                        case 18:
                            n3eVar.f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, n3eVar.f);
                            break;
                        case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                            n3eVar.g = typedArrayObtainStyledAttributes.getFloat(index, n3eVar.g);
                            break;
                        case 20:
                            n3eVar.x = typedArrayObtainStyledAttributes.getFloat(index, n3eVar.x);
                            break;
                        case 21:
                            n3eVar.d = typedArrayObtainStyledAttributes.getLayoutDimension(index, n3eVar.d);
                            break;
                        case 22:
                            int i3 = typedArrayObtainStyledAttributes.getInt(index, p3eVar.b);
                            p3eVar.b = i3;
                            p3eVar.b = h[i3];
                            break;
                        case 23:
                            n3eVar.c = typedArrayObtainStyledAttributes.getLayoutDimension(index, n3eVar.c);
                            break;
                        case 24:
                            n3eVar.G = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, n3eVar.G);
                            break;
                        case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                            n3eVar.i = l(typedArrayObtainStyledAttributes, index, n3eVar.i);
                            break;
                        case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                            n3eVar.j = l(typedArrayObtainStyledAttributes, index, n3eVar.j);
                            break;
                        case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                            n3eVar.F = typedArrayObtainStyledAttributes.getInt(index, n3eVar.F);
                            break;
                        case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                            n3eVar.H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, n3eVar.H);
                            break;
                        case AvailableCode.HMS_IS_SPOOF /* 29 */:
                            n3eVar.k = l(typedArrayObtainStyledAttributes, index, n3eVar.k);
                            break;
                        case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
                            n3eVar.l = l(typedArrayObtainStyledAttributes, index, n3eVar.l);
                            break;
                        case AvailableCode.CURRENT_SHOWING_SERVICE_UNAVAILABLE /* 31 */:
                            n3eVar.L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, n3eVar.L);
                            break;
                        case 32:
                            n3eVar.t = l(typedArrayObtainStyledAttributes, index, n3eVar.t);
                            break;
                        case 33:
                            n3eVar.u = l(typedArrayObtainStyledAttributes, index, n3eVar.u);
                            break;
                        case 34:
                            n3eVar.I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, n3eVar.I);
                            break;
                        case 35:
                            n3eVar.n = l(typedArrayObtainStyledAttributes, index, n3eVar.n);
                            break;
                        case 36:
                            n3eVar.m = l(typedArrayObtainStyledAttributes, index, n3eVar.m);
                            break;
                        case 37:
                            n3eVar.y = typedArrayObtainStyledAttributes.getFloat(index, n3eVar.y);
                            break;
                        case 38:
                            m3eVar.f21110a = typedArrayObtainStyledAttributes.getResourceId(index, m3eVar.f21110a);
                            break;
                        case 39:
                            n3eVar.V = typedArrayObtainStyledAttributes.getFloat(index, n3eVar.V);
                            break;
                        case 40:
                            n3eVar.U = typedArrayObtainStyledAttributes.getFloat(index, n3eVar.U);
                            break;
                        case 41:
                            n3eVar.W = typedArrayObtainStyledAttributes.getInt(index, n3eVar.W);
                            break;
                        case 42:
                            n3eVar.X = typedArrayObtainStyledAttributes.getInt(index, n3eVar.X);
                            break;
                        case 43:
                            p3eVar.d = typedArrayObtainStyledAttributes.getFloat(index, p3eVar.d);
                            break;
                        case 44:
                            q3eVar.m = true;
                            q3eVar.n = typedArrayObtainStyledAttributes.getDimension(index, q3eVar.n);
                            break;
                        case 45:
                            q3eVar.c = typedArrayObtainStyledAttributes.getFloat(index, q3eVar.c);
                            break;
                        case 46:
                            q3eVar.d = typedArrayObtainStyledAttributes.getFloat(index, q3eVar.d);
                            break;
                        case 47:
                            q3eVar.e = typedArrayObtainStyledAttributes.getFloat(index, q3eVar.e);
                            break;
                        case 48:
                            q3eVar.f = typedArrayObtainStyledAttributes.getFloat(index, q3eVar.f);
                            break;
                        case 49:
                            q3eVar.g = typedArrayObtainStyledAttributes.getDimension(index, q3eVar.g);
                            break;
                        case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                            q3eVar.h = typedArrayObtainStyledAttributes.getDimension(index, q3eVar.h);
                            break;
                        case 51:
                            q3eVar.j = typedArrayObtainStyledAttributes.getDimension(index, q3eVar.j);
                            break;
                        case 52:
                            q3eVar.k = typedArrayObtainStyledAttributes.getDimension(index, q3eVar.k);
                            break;
                        case 53:
                            q3eVar.l = typedArrayObtainStyledAttributes.getDimension(index, q3eVar.l);
                            break;
                        case 54:
                            n3eVar.Y = typedArrayObtainStyledAttributes.getInt(index, n3eVar.Y);
                            break;
                        case 55:
                            n3eVar.Z = typedArrayObtainStyledAttributes.getInt(index, n3eVar.Z);
                            break;
                        case 56:
                            n3eVar.a0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, n3eVar.a0);
                            break;
                        case 57:
                            n3eVar.b0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, n3eVar.b0);
                            break;
                        case 58:
                            n3eVar.c0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, n3eVar.c0);
                            break;
                        case 59:
                            n3eVar.d0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, n3eVar.d0);
                            break;
                        case 60:
                            q3eVar.b = typedArrayObtainStyledAttributes.getFloat(index, q3eVar.b);
                            break;
                        case 61:
                            n3eVar.A = l(typedArrayObtainStyledAttributes, index, n3eVar.A);
                            break;
                        case 62:
                            n3eVar.B = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, n3eVar.B);
                            break;
                        case 63:
                            n3eVar.C = typedArrayObtainStyledAttributes.getFloat(index, n3eVar.C);
                            break;
                        case 64:
                            o3eVar.b = l(typedArrayObtainStyledAttributes, index, o3eVar.b);
                            break;
                        case 65:
                            if (typedArrayObtainStyledAttributes.peekValue(index).type != 3) {
                                o3eVar.d = fhn.d[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                            } else {
                                o3eVar.d = typedArrayObtainStyledAttributes.getString(index);
                            }
                            break;
                        case 66:
                            o3eVar.f = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case 67:
                            o3eVar.h = typedArrayObtainStyledAttributes.getFloat(index, o3eVar.h);
                            break;
                        case 68:
                            p3eVar.e = typedArrayObtainStyledAttributes.getFloat(index, p3eVar.e);
                            break;
                        case 69:
                            n3eVar.e0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                            break;
                        case 70:
                            n3eVar.f0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                            break;
                        case 71:
                            Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                            break;
                        case 72:
                            n3eVar.g0 = typedArrayObtainStyledAttributes.getInt(index, n3eVar.g0);
                            break;
                        case 73:
                            n3eVar.h0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, n3eVar.h0);
                            break;
                        case 74:
                            n3eVar.k0 = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        case 75:
                            n3eVar.o0 = typedArrayObtainStyledAttributes.getBoolean(index, n3eVar.o0);
                            break;
                        case 76:
                            o3eVar.e = typedArrayObtainStyledAttributes.getInt(index, o3eVar.e);
                            break;
                        case 77:
                            n3eVar.l0 = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        case 78:
                            p3eVar.c = typedArrayObtainStyledAttributes.getInt(index, p3eVar.c);
                            break;
                        case 79:
                            o3eVar.g = typedArrayObtainStyledAttributes.getFloat(index, o3eVar.g);
                            break;
                        case 80:
                            n3eVar.m0 = typedArrayObtainStyledAttributes.getBoolean(index, n3eVar.m0);
                            break;
                        case 81:
                            n3eVar.n0 = typedArrayObtainStyledAttributes.getBoolean(index, n3eVar.n0);
                            break;
                        case 82:
                            o3eVar.c = typedArrayObtainStyledAttributes.getInteger(index, o3eVar.c);
                            break;
                        case 83:
                            q3eVar.i = l(typedArrayObtainStyledAttributes, index, q3eVar.i);
                            break;
                        case 84:
                            o3eVar.j = typedArrayObtainStyledAttributes.getInteger(index, o3eVar.j);
                            break;
                        case 85:
                            o3eVar.i = typedArrayObtainStyledAttributes.getFloat(index, o3eVar.i);
                            break;
                        case 86:
                            int i4 = typedArrayObtainStyledAttributes.peekValue(index).type;
                            if (i4 == 1) {
                                int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                o3eVar.m = resourceId;
                                if (resourceId != -1) {
                                    o3eVar.l = -2;
                                }
                            } else if (i4 != 3) {
                                o3eVar.l = typedArrayObtainStyledAttributes.getInteger(index, o3eVar.m);
                            } else {
                                String string = typedArrayObtainStyledAttributes.getString(index);
                                o3eVar.k = string;
                                if (string.indexOf(Separators.SLASH) <= 0) {
                                    o3eVar.l = -1;
                                } else {
                                    o3eVar.m = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                    o3eVar.l = -2;
                                }
                            }
                            break;
                        case 87:
                            Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                            break;
                        case 88:
                        case 89:
                        case SubsamplingScaleImageView.ORIENTATION_90 /* 90 */:
                        default:
                            Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                            break;
                        case 91:
                            n3eVar.r = l(typedArrayObtainStyledAttributes, index, n3eVar.r);
                            break;
                        case 92:
                            n3eVar.s = l(typedArrayObtainStyledAttributes, index, n3eVar.s);
                            break;
                        case 93:
                            n3eVar.M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, n3eVar.M);
                            break;
                        case 94:
                            n3eVar.T = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, n3eVar.T);
                            break;
                        case 95:
                            m(n3eVar, typedArrayObtainStyledAttributes, index, 0);
                            break;
                        case 96:
                            m(n3eVar, typedArrayObtainStyledAttributes, index, 1);
                            break;
                        case 97:
                            n3eVar.p0 = typedArrayObtainStyledAttributes.getInt(index, n3eVar.p0);
                            break;
                    }
                    i2++;
                } else if (n3eVar.k0 != null) {
                    n3eVar.j0 = null;
                }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return m3eVar;
    }

    public static int l(TypedArray typedArray, int i2, int i3) {
        int resourceId = typedArray.getResourceId(i2, i3);
        return resourceId == -1 ? typedArray.getInt(i2, -1) : resourceId;
    }

    /* JADX WARN: Code duplicated, block: B:121:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:18:0x0032  */
    /* JADX WARN: Code duplicated, block: B:20:0x0036  */
    /* JADX WARN: Code duplicated, block: B:22:0x003b  */
    /* JADX WARN: Code duplicated, block: B:24:0x0040  */
    /* JADX WARN: Code duplicated, block: B:26:0x0044  */
    /* JADX WARN: Code duplicated, block: B:28:0x0048  */
    /* JADX WARN: Code duplicated, block: B:30:0x004d  */
    /* JADX WARN: Code duplicated, block: B:32:0x0052  */
    /* JADX WARN: Code duplicated, block: B:34:0x0056  */
    /* JADX WARN: Code duplicated, block: B:36:0x005a  */
    /* JADX WARN: Code duplicated, block: B:38:0x0063  */
    public static void m(Object obj, TypedArray typedArray, int i2, int i3) {
        int dimensionPixelSize;
        l3e l3eVar;
        n3e n3eVar;
        a3e a3eVar;
        int i4 = typedArray.peekValue(i2).type;
        boolean z = true;
        int i5 = 0;
        if (i4 != 3) {
            if (i4 != 5) {
                dimensionPixelSize = typedArray.getInt(i2, 0);
                if (dimensionPixelSize == -4) {
                    i5 = -2;
                } else if (dimensionPixelSize == -3 || (dimensionPixelSize != -2 && dimensionPixelSize != -1)) {
                    z = false;
                }
                if (obj instanceof a3e) {
                    a3eVar = (a3e) obj;
                    if (i3 == 0) {
                        ((ViewGroup.MarginLayoutParams) a3eVar).width = i5;
                        a3eVar.W = z;
                        return;
                    } else {
                        ((ViewGroup.MarginLayoutParams) a3eVar).height = i5;
                        a3eVar.X = z;
                        return;
                    }
                }
                if (obj instanceof n3e) {
                    n3eVar = (n3e) obj;
                    if (i3 == 0) {
                        n3eVar.c = i5;
                        n3eVar.m0 = z;
                        return;
                    } else {
                        n3eVar.d = i5;
                        n3eVar.n0 = z;
                        return;
                    }
                }
                if (obj instanceof l3e) {
                    l3eVar = (l3e) obj;
                    if (i3 == 0) {
                        l3eVar.b(23, i5);
                        l3eVar.d(80, z);
                        return;
                    } else {
                        l3eVar.b(21, i5);
                        l3eVar.d(81, z);
                        return;
                    }
                }
                return;
            }
            dimensionPixelSize = typedArray.getDimensionPixelSize(i2, 0);
            z = false;
            i5 = dimensionPixelSize;
            if (obj instanceof a3e) {
                a3eVar = (a3e) obj;
                if (i3 == 0) {
                    ((ViewGroup.MarginLayoutParams) a3eVar).width = i5;
                    a3eVar.W = z;
                    return;
                } else {
                    ((ViewGroup.MarginLayoutParams) a3eVar).height = i5;
                    a3eVar.X = z;
                    return;
                }
            }
            if (obj instanceof n3e) {
                n3eVar = (n3e) obj;
                if (i3 == 0) {
                    n3eVar.c = i5;
                    n3eVar.m0 = z;
                    return;
                } else {
                    n3eVar.d = i5;
                    n3eVar.n0 = z;
                    return;
                }
            }
            if (obj instanceof l3e) {
                l3eVar = (l3e) obj;
                if (i3 == 0) {
                    l3eVar.b(23, i5);
                    l3eVar.d(80, z);
                    return;
                } else {
                    l3eVar.b(21, i5);
                    l3eVar.d(81, z);
                    return;
                }
            }
            return;
        }
        String string = typedArray.getString(i2);
        if (string == null) {
            return;
        }
        int iIndexOf = string.indexOf(61);
        int length = string.length();
        if (iIndexOf <= 0 || iIndexOf >= length - 1) {
            return;
        }
        String strSubstring = string.substring(0, iIndexOf);
        String strSubstring2 = string.substring(iIndexOf + 1);
        if (strSubstring2.length() > 0) {
            String strTrim = strSubstring.trim();
            String strTrim2 = strSubstring2.trim();
            if ("ratio".equalsIgnoreCase(strTrim)) {
                if (obj instanceof a3e) {
                    a3e a3eVar2 = (a3e) obj;
                    if (i3 == 0) {
                        ((ViewGroup.MarginLayoutParams) a3eVar2).width = 0;
                    } else {
                        ((ViewGroup.MarginLayoutParams) a3eVar2).height = 0;
                    }
                    n(a3eVar2, strTrim2);
                    return;
                }
                if (obj instanceof n3e) {
                    ((n3e) obj).z = strTrim2;
                    return;
                } else {
                    if (obj instanceof l3e) {
                        ((l3e) obj).c(5, strTrim2);
                        return;
                    }
                    return;
                }
            }
            try {
                if ("weight".equalsIgnoreCase(strTrim)) {
                    float f = Float.parseFloat(strTrim2);
                    if (obj instanceof a3e) {
                        a3e a3eVar3 = (a3e) obj;
                        if (i3 == 0) {
                            ((ViewGroup.MarginLayoutParams) a3eVar3).width = 0;
                            a3eVar3.H = f;
                            return;
                        } else {
                            ((ViewGroup.MarginLayoutParams) a3eVar3).height = 0;
                            a3eVar3.I = f;
                            return;
                        }
                    }
                    if (obj instanceof n3e) {
                        n3e n3eVar2 = (n3e) obj;
                        if (i3 == 0) {
                            n3eVar2.c = 0;
                            n3eVar2.V = f;
                            return;
                        } else {
                            n3eVar2.d = 0;
                            n3eVar2.U = f;
                            return;
                        }
                    }
                    if (obj instanceof l3e) {
                        l3e l3eVar2 = (l3e) obj;
                        if (i3 == 0) {
                            l3eVar2.b(23, 0);
                            l3eVar2.a(f, 39);
                            return;
                        } else {
                            l3eVar2.b(21, 0);
                            l3eVar2.a(f, 40);
                            return;
                        }
                    }
                    return;
                }
                if ("parent".equalsIgnoreCase(strTrim)) {
                    float fMax = Math.max(0.0f, Math.min(1.0f, Float.parseFloat(strTrim2)));
                    if (obj instanceof a3e) {
                        a3e a3eVar4 = (a3e) obj;
                        if (i3 == 0) {
                            ((ViewGroup.MarginLayoutParams) a3eVar4).width = 0;
                            a3eVar4.R = fMax;
                            a3eVar4.L = 2;
                            return;
                        } else {
                            ((ViewGroup.MarginLayoutParams) a3eVar4).height = 0;
                            a3eVar4.S = fMax;
                            a3eVar4.M = 2;
                            return;
                        }
                    }
                    if (obj instanceof n3e) {
                        n3e n3eVar3 = (n3e) obj;
                        if (i3 == 0) {
                            n3eVar3.c = 0;
                            n3eVar3.e0 = fMax;
                            n3eVar3.Y = 2;
                            return;
                        } else {
                            n3eVar3.d = 0;
                            n3eVar3.f0 = fMax;
                            n3eVar3.Z = 2;
                            return;
                        }
                    }
                    if (obj instanceof l3e) {
                        l3e l3eVar3 = (l3e) obj;
                        if (i3 == 0) {
                            l3eVar3.b(23, 0);
                            l3eVar3.b(54, 2);
                        } else {
                            l3eVar3.b(21, 0);
                            l3eVar3.b(55, 2);
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
    }

    public static void n(a3e a3eVar, String str) {
        if (str != null) {
            int length = str.length();
            int iIndexOf = str.indexOf(44);
            int i2 = 0;
            int i3 = -1;
            if (iIndexOf > 0 && iIndexOf < length - 1) {
                String strSubstring = str.substring(0, iIndexOf);
                if (!strSubstring.equalsIgnoreCase("W")) {
                    i2 = strSubstring.equalsIgnoreCase("H") ? 1 : -1;
                }
                i3 = i2;
                i2 = iIndexOf + 1;
            }
            int iIndexOf2 = str.indexOf(58);
            try {
                if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                    String strSubstring2 = str.substring(i2);
                    if (strSubstring2.length() > 0) {
                        Float.parseFloat(strSubstring2);
                    }
                } else {
                    String strSubstring3 = str.substring(i2, iIndexOf2);
                    String strSubstring4 = str.substring(iIndexOf2 + 1);
                    if (strSubstring3.length() > 0 && strSubstring4.length() > 0) {
                        float f = Float.parseFloat(strSubstring3);
                        float f2 = Float.parseFloat(strSubstring4);
                        if (f > 0.0f && f2 > 0.0f) {
                            if (i3 == 1) {
                                Math.abs(f2 / f);
                            } else {
                                Math.abs(f / f2);
                            }
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        a3eVar.G = str;
    }

    public static void o(m3e m3eVar, TypedArray typedArray) {
        char c;
        int indexCount = typedArray.getIndexCount();
        l3e l3eVar = new l3e();
        l3eVar.f19353a = new int[10];
        l3eVar.b = new int[10];
        l3eVar.c = 0;
        l3eVar.d = new int[10];
        l3eVar.e = new float[10];
        l3eVar.f = 0;
        l3eVar.g = new int[5];
        l3eVar.h = new String[5];
        l3eVar.i = 0;
        l3eVar.j = new int[4];
        l3eVar.k = new boolean[4];
        l3eVar.l = 0;
        m3eVar.h = l3eVar;
        o3e o3eVar = m3eVar.d;
        o3eVar.f24579a = false;
        n3e n3eVar = m3eVar.e;
        n3eVar.b = false;
        p3e p3eVar = m3eVar.c;
        p3eVar.f26295a = false;
        q3e q3eVar = m3eVar.f;
        q3eVar.f28048a = false;
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = typedArray.getIndex(i2);
            int i3 = j.get(index);
            SparseIntArray sparseIntArray = i;
            switch (i3) {
                case 2:
                    c = 5;
                    l3eVar.b(2, typedArray.getDimensionPixelSize(index, n3eVar.J));
                    break;
                case 3:
                case 4:
                case 9:
                case 10:
                case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                case AvailableCode.HMS_IS_SPOOF /* 29 */:
                case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
                case 32:
                case 33:
                case 35:
                case 36:
                case 61:
                case 88:
                case 89:
                case SubsamplingScaleImageView.ORIENTATION_90 /* 90 */:
                case 91:
                case 92:
                default:
                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                    c = 5;
                    break;
                case 5:
                    c = 5;
                    l3eVar.c(5, typedArray.getString(index));
                    break;
                case 6:
                    l3eVar.b(6, typedArray.getDimensionPixelOffset(index, n3eVar.D));
                    c = 5;
                    break;
                case 7:
                    l3eVar.b(7, typedArray.getDimensionPixelOffset(index, n3eVar.E));
                    c = 5;
                    break;
                case 8:
                    l3eVar.b(8, typedArray.getDimensionPixelSize(index, n3eVar.K));
                    c = 5;
                    break;
                case 11:
                    l3eVar.b(11, typedArray.getDimensionPixelSize(index, n3eVar.Q));
                    c = 5;
                    break;
                case 12:
                    l3eVar.b(12, typedArray.getDimensionPixelSize(index, n3eVar.R));
                    c = 5;
                    break;
                case 13:
                    l3eVar.b(13, typedArray.getDimensionPixelSize(index, n3eVar.N));
                    c = 5;
                    break;
                case 14:
                    l3eVar.b(14, typedArray.getDimensionPixelSize(index, n3eVar.P));
                    c = 5;
                    break;
                case 15:
                    l3eVar.b(15, typedArray.getDimensionPixelSize(index, n3eVar.S));
                    c = 5;
                    break;
                case 16:
                    l3eVar.b(16, typedArray.getDimensionPixelSize(index, n3eVar.O));
                    c = 5;
                    break;
                case 17:
                    l3eVar.b(17, typedArray.getDimensionPixelOffset(index, n3eVar.e));
                    c = 5;
                    break;
                case 18:
                    l3eVar.b(18, typedArray.getDimensionPixelOffset(index, n3eVar.f));
                    c = 5;
                    break;
                case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                    l3eVar.a(typedArray.getFloat(index, n3eVar.g), 19);
                    c = 5;
                    break;
                case 20:
                    l3eVar.a(typedArray.getFloat(index, n3eVar.x), 20);
                    c = 5;
                    break;
                case 21:
                    l3eVar.b(21, typedArray.getLayoutDimension(index, n3eVar.d));
                    c = 5;
                    break;
                case 22:
                    l3eVar.b(22, h[typedArray.getInt(index, p3eVar.b)]);
                    c = 5;
                    break;
                case 23:
                    l3eVar.b(23, typedArray.getLayoutDimension(index, n3eVar.c));
                    c = 5;
                    break;
                case 24:
                    l3eVar.b(24, typedArray.getDimensionPixelSize(index, n3eVar.G));
                    c = 5;
                    break;
                case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                    l3eVar.b(27, typedArray.getInt(index, n3eVar.F));
                    c = 5;
                    break;
                case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                    l3eVar.b(28, typedArray.getDimensionPixelSize(index, n3eVar.H));
                    c = 5;
                    break;
                case AvailableCode.CURRENT_SHOWING_SERVICE_UNAVAILABLE /* 31 */:
                    l3eVar.b(31, typedArray.getDimensionPixelSize(index, n3eVar.L));
                    c = 5;
                    break;
                case 34:
                    l3eVar.b(34, typedArray.getDimensionPixelSize(index, n3eVar.I));
                    c = 5;
                    break;
                case 37:
                    l3eVar.a(typedArray.getFloat(index, n3eVar.y), 37);
                    c = 5;
                    break;
                case 38:
                    int resourceId = typedArray.getResourceId(index, m3eVar.f21110a);
                    m3eVar.f21110a = resourceId;
                    l3eVar.b(38, resourceId);
                    c = 5;
                    break;
                case 39:
                    l3eVar.a(typedArray.getFloat(index, n3eVar.V), 39);
                    c = 5;
                    break;
                case 40:
                    l3eVar.a(typedArray.getFloat(index, n3eVar.U), 40);
                    c = 5;
                    break;
                case 41:
                    l3eVar.b(41, typedArray.getInt(index, n3eVar.W));
                    c = 5;
                    break;
                case 42:
                    l3eVar.b(42, typedArray.getInt(index, n3eVar.X));
                    c = 5;
                    break;
                case 43:
                    l3eVar.a(typedArray.getFloat(index, p3eVar.d), 43);
                    c = 5;
                    break;
                case 44:
                    l3eVar.d(44, true);
                    l3eVar.a(typedArray.getDimension(index, q3eVar.n), 44);
                    c = 5;
                    break;
                case 45:
                    l3eVar.a(typedArray.getFloat(index, q3eVar.c), 45);
                    c = 5;
                    break;
                case 46:
                    l3eVar.a(typedArray.getFloat(index, q3eVar.d), 46);
                    c = 5;
                    break;
                case 47:
                    l3eVar.a(typedArray.getFloat(index, q3eVar.e), 47);
                    c = 5;
                    break;
                case 48:
                    l3eVar.a(typedArray.getFloat(index, q3eVar.f), 48);
                    c = 5;
                    break;
                case 49:
                    l3eVar.a(typedArray.getDimension(index, q3eVar.g), 49);
                    c = 5;
                    break;
                case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
                    l3eVar.a(typedArray.getDimension(index, q3eVar.h), 50);
                    c = 5;
                    break;
                case 51:
                    l3eVar.a(typedArray.getDimension(index, q3eVar.j), 51);
                    c = 5;
                    break;
                case 52:
                    l3eVar.a(typedArray.getDimension(index, q3eVar.k), 52);
                    c = 5;
                    break;
                case 53:
                    l3eVar.a(typedArray.getDimension(index, q3eVar.l), 53);
                    c = 5;
                    break;
                case 54:
                    l3eVar.b(54, typedArray.getInt(index, n3eVar.Y));
                    c = 5;
                    break;
                case 55:
                    l3eVar.b(55, typedArray.getInt(index, n3eVar.Z));
                    c = 5;
                    break;
                case 56:
                    l3eVar.b(56, typedArray.getDimensionPixelSize(index, n3eVar.a0));
                    c = 5;
                    break;
                case 57:
                    l3eVar.b(57, typedArray.getDimensionPixelSize(index, n3eVar.b0));
                    c = 5;
                    break;
                case 58:
                    l3eVar.b(58, typedArray.getDimensionPixelSize(index, n3eVar.c0));
                    c = 5;
                    break;
                case 59:
                    l3eVar.b(59, typedArray.getDimensionPixelSize(index, n3eVar.d0));
                    c = 5;
                    break;
                case 60:
                    l3eVar.a(typedArray.getFloat(index, q3eVar.b), 60);
                    c = 5;
                    break;
                case 62:
                    l3eVar.b(62, typedArray.getDimensionPixelSize(index, n3eVar.B));
                    c = 5;
                    break;
                case 63:
                    l3eVar.a(typedArray.getFloat(index, n3eVar.C), 63);
                    c = 5;
                    break;
                case 64:
                    l3eVar.b(64, l(typedArray, index, o3eVar.b));
                    c = 5;
                    break;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        l3eVar.c(65, typedArray.getString(index));
                    } else {
                        l3eVar.c(65, fhn.d[typedArray.getInteger(index, 0)]);
                    }
                    c = 5;
                    break;
                case 66:
                    l3eVar.b(66, typedArray.getInt(index, 0));
                    c = 5;
                    break;
                case 67:
                    l3eVar.a(typedArray.getFloat(index, o3eVar.h), 67);
                    c = 5;
                    break;
                case 68:
                    l3eVar.a(typedArray.getFloat(index, p3eVar.e), 68);
                    c = 5;
                    break;
                case 69:
                    l3eVar.a(typedArray.getFloat(index, 1.0f), 69);
                    c = 5;
                    break;
                case 70:
                    l3eVar.a(typedArray.getFloat(index, 1.0f), 70);
                    c = 5;
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    c = 5;
                    break;
                case 72:
                    l3eVar.b(72, typedArray.getInt(index, n3eVar.g0));
                    c = 5;
                    break;
                case 73:
                    l3eVar.b(73, typedArray.getDimensionPixelSize(index, n3eVar.h0));
                    c = 5;
                    break;
                case 74:
                    l3eVar.c(74, typedArray.getString(index));
                    c = 5;
                    break;
                case 75:
                    l3eVar.d(75, typedArray.getBoolean(index, n3eVar.o0));
                    c = 5;
                    break;
                case 76:
                    l3eVar.b(76, typedArray.getInt(index, o3eVar.e));
                    c = 5;
                    break;
                case 77:
                    l3eVar.c(77, typedArray.getString(index));
                    c = 5;
                    break;
                case 78:
                    l3eVar.b(78, typedArray.getInt(index, p3eVar.c));
                    c = 5;
                    break;
                case 79:
                    l3eVar.a(typedArray.getFloat(index, o3eVar.g), 79);
                    c = 5;
                    break;
                case 80:
                    l3eVar.d(80, typedArray.getBoolean(index, n3eVar.m0));
                    c = 5;
                    break;
                case 81:
                    l3eVar.d(81, typedArray.getBoolean(index, n3eVar.n0));
                    c = 5;
                    break;
                case 82:
                    l3eVar.b(82, typedArray.getInteger(index, o3eVar.c));
                    c = 5;
                    break;
                case 83:
                    l3eVar.b(83, l(typedArray, index, q3eVar.i));
                    c = 5;
                    break;
                case 84:
                    l3eVar.b(84, typedArray.getInteger(index, o3eVar.j));
                    c = 5;
                    break;
                case 85:
                    l3eVar.a(typedArray.getFloat(index, o3eVar.i), 85);
                    c = 5;
                    break;
                case 86:
                    int i4 = typedArray.peekValue(index).type;
                    if (i4 == 1) {
                        int resourceId2 = typedArray.getResourceId(index, -1);
                        o3eVar.m = resourceId2;
                        l3eVar.b(89, resourceId2);
                        if (o3eVar.m != -1) {
                            o3eVar.l = -2;
                            l3eVar.b(88, -2);
                        }
                    } else if (i4 == 3) {
                        String string = typedArray.getString(index);
                        o3eVar.k = string;
                        l3eVar.c(90, string);
                        if (o3eVar.k.indexOf(Separators.SLASH) > 0) {
                            int resourceId3 = typedArray.getResourceId(index, -1);
                            o3eVar.m = resourceId3;
                            l3eVar.b(89, resourceId3);
                            o3eVar.l = -2;
                            l3eVar.b(88, -2);
                        } else {
                            o3eVar.l = -1;
                            l3eVar.b(88, -1);
                        }
                    } else {
                        int integer = typedArray.getInteger(index, o3eVar.m);
                        o3eVar.l = integer;
                        l3eVar.b(88, integer);
                    }
                    c = 5;
                    break;
                case 87:
                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                    c = 5;
                    break;
                case 93:
                    l3eVar.b(93, typedArray.getDimensionPixelSize(index, n3eVar.M));
                    c = 5;
                    break;
                case 94:
                    l3eVar.b(94, typedArray.getDimensionPixelSize(index, n3eVar.T));
                    c = 5;
                    break;
                case 95:
                    m(l3eVar, typedArray, index, 0);
                    c = 5;
                    break;
                case 96:
                    m(l3eVar, typedArray, index, 1);
                    c = 5;
                    break;
                case 97:
                    l3eVar.b(97, typedArray.getInt(index, n3eVar.p0));
                    c = 5;
                    break;
                case 98:
                    if (MotionLayout.Y1) {
                        int resourceId4 = typedArray.getResourceId(index, m3eVar.f21110a);
                        m3eVar.f21110a = resourceId4;
                        if (resourceId4 == -1) {
                            m3eVar.b = typedArray.getString(index);
                        }
                    } else if (typedArray.peekValue(index).type == 3) {
                        m3eVar.b = typedArray.getString(index);
                    } else {
                        m3eVar.f21110a = typedArray.getResourceId(index, m3eVar.f21110a);
                    }
                    c = 5;
                    break;
                case 99:
                    l3eVar.d(99, typedArray.getBoolean(index, n3eVar.h));
                    c = 5;
                    break;
            }
        }
    }

    public final void a(MotionLayout motionLayout) {
        m3e m3eVar;
        int childCount = motionLayout.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = motionLayout.getChildAt(i2);
            int id = childAt.getId();
            Integer numValueOf = Integer.valueOf(id);
            HashMap map = this.g;
            if (!map.containsKey(numValueOf)) {
                Log.w("ConstraintSet", "id unknown " + ozb.U(childAt));
            } else if (this.f && id == -1) {
                itt0.k("All children of ConstraintLayout must have ids to use ConstraintSet");
                return;
            } else if (map.containsKey(Integer.valueOf(id)) && (m3eVar = (m3e) map.get(Integer.valueOf(id))) != null) {
                x2e.e(childAt, m3eVar.g);
            }
        }
    }

    public final void b(ConstraintLayout constraintLayout) {
        c(constraintLayout);
        constraintLayout.setConstraintSet(null);
        constraintLayout.requestLayout();
    }

    public final void c(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        HashMap map = this.g;
        HashSet<Integer> hashSet = new HashSet(map.keySet());
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = constraintLayout.getChildAt(i2);
            int id = childAt.getId();
            if (!map.containsKey(Integer.valueOf(id))) {
                Log.w("ConstraintSet", "id unknown " + ozb.U(childAt));
            } else {
                if (this.f && id == -1) {
                    itt0.k("All children of ConstraintLayout must have ids to use ConstraintSet");
                    return;
                }
                if (id != -1) {
                    if (map.containsKey(Integer.valueOf(id))) {
                        hashSet.remove(Integer.valueOf(id));
                        m3e m3eVar = (m3e) map.get(Integer.valueOf(id));
                        if (m3eVar != null) {
                            p3e p3eVar = m3eVar.c;
                            n3e n3eVar = m3eVar.e;
                            q3e q3eVar = m3eVar.f;
                            if (childAt instanceof Barrier) {
                                n3eVar.i0 = 1;
                                Barrier barrier = (Barrier) childAt;
                                barrier.setId(id);
                                barrier.setType(n3eVar.g0);
                                barrier.setMargin(n3eVar.h0);
                                barrier.setAllowsGoneWidget(n3eVar.o0);
                                int[] iArr = n3eVar.j0;
                                if (iArr != null) {
                                    barrier.setReferencedIds(iArr);
                                } else {
                                    String str = n3eVar.k0;
                                    if (str != null) {
                                        int[] iArrF = f(barrier, str);
                                        n3eVar.j0 = iArrF;
                                        barrier.setReferencedIds(iArrF);
                                    }
                                }
                            }
                            a3e a3eVar = (a3e) childAt.getLayoutParams();
                            a3eVar.a();
                            m3eVar.a(a3eVar);
                            x2e.e(childAt, m3eVar.g);
                            childAt.setLayoutParams(a3eVar);
                            if (p3eVar.c == 0) {
                                childAt.setVisibility(p3eVar.b);
                            }
                            childAt.setAlpha(p3eVar.d);
                            childAt.setRotation(q3eVar.b);
                            childAt.setRotationX(q3eVar.c);
                            childAt.setRotationY(q3eVar.d);
                            childAt.setScaleX(q3eVar.e);
                            childAt.setScaleY(q3eVar.f);
                            if (q3eVar.i != -1) {
                                View viewFindViewById = ((View) childAt.getParent()).findViewById(q3eVar.i);
                                if (viewFindViewById != null) {
                                    float bottom = (viewFindViewById.getBottom() + viewFindViewById.getTop()) / 2.0f;
                                    float right = (viewFindViewById.getRight() + viewFindViewById.getLeft()) / 2.0f;
                                    if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                        float left = right - childAt.getLeft();
                                        float top = bottom - childAt.getTop();
                                        childAt.setPivotX(left);
                                        childAt.setPivotY(top);
                                    }
                                }
                            } else {
                                if (!Float.isNaN(q3eVar.g)) {
                                    childAt.setPivotX(q3eVar.g);
                                }
                                if (!Float.isNaN(q3eVar.h)) {
                                    childAt.setPivotY(q3eVar.h);
                                }
                            }
                            childAt.setTranslationX(q3eVar.j);
                            childAt.setTranslationY(q3eVar.k);
                            childAt.setTranslationZ(q3eVar.l);
                            if (q3eVar.m) {
                                childAt.setElevation(q3eVar.n);
                            }
                        }
                    } else {
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id);
                    }
                }
            }
        }
        for (Integer num : hashSet) {
            m3e m3eVar2 = (m3e) map.get(num);
            if (m3eVar2 != null) {
                n3e n3eVar2 = m3eVar2.e;
                if (n3eVar2.i0 == 1) {
                    Barrier barrier2 = new Barrier(constraintLayout.getContext());
                    barrier2.setId(num.intValue());
                    int[] iArr2 = n3eVar2.j0;
                    if (iArr2 != null) {
                        barrier2.setReferencedIds(iArr2);
                    } else {
                        String str2 = n3eVar2.k0;
                        if (str2 != null) {
                            int[] iArrF2 = f(barrier2, str2);
                            n3eVar2.j0 = iArrF2;
                            barrier2.setReferencedIds(iArrF2);
                        }
                    }
                    barrier2.setType(n3eVar2.g0);
                    barrier2.setMargin(n3eVar2.h0);
                    ipj0 ipj0Var = ConstraintLayout.p;
                    a3e a3eVar2 = new a3e(-2, -2);
                    barrier2.m();
                    m3eVar2.a(a3eVar2);
                    constraintLayout.addView(barrier2, a3eVar2);
                }
                if (n3eVar2.f22844a) {
                    View guideline = new Guideline(constraintLayout.getContext());
                    guideline.setId(num.intValue());
                    ipj0 ipj0Var2 = ConstraintLayout.p;
                    a3e a3eVar3 = new a3e(-2, -2);
                    m3eVar2.a(a3eVar3);
                    constraintLayout.addView(guideline, a3eVar3);
                }
            }
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt2 = constraintLayout.getChildAt(i3);
            if (childAt2 instanceof ConstraintHelper) {
                ((ConstraintHelper) childAt2).f(constraintLayout);
            }
        }
    }

    public final void e(ConstraintLayout constraintLayout) {
        int i2;
        HashMap map;
        int i3;
        r3e r3eVar = this;
        int childCount = constraintLayout.getChildCount();
        HashMap map2 = r3eVar.g;
        map2.clear();
        int i4 = 0;
        while (i4 < childCount) {
            View childAt = constraintLayout.getChildAt(i4);
            a3e a3eVar = (a3e) childAt.getLayoutParams();
            int id = childAt.getId();
            if (r3eVar.f && id == -1) {
                itt0.k("All children of ConstraintLayout must have ids to use ConstraintSet");
                return;
            }
            if (!map2.containsKey(Integer.valueOf(id))) {
                map2.put(Integer.valueOf(id), new m3e());
            }
            m3e m3eVar = (m3e) map2.get(Integer.valueOf(id));
            if (m3eVar == null) {
                i2 = childCount;
                map = map2;
                i3 = i4;
            } else {
                p3e p3eVar = m3eVar.c;
                n3e n3eVar = m3eVar.e;
                q3e q3eVar = m3eVar.f;
                i2 = childCount;
                HashMap map3 = new HashMap();
                map = map2;
                Class<?> cls = childAt.getClass();
                i3 = i4;
                HashMap map4 = r3eVar.e;
                for (String str : map4.keySet()) {
                    x2e x2eVar = (x2e) map4.get(str);
                    HashMap map5 = map4;
                    try {
                        if (str.equals("BackgroundColor")) {
                            map3.put(str, new x2e(x2eVar, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                        } else {
                            map3.put(str, new x2e(x2eVar, cls.getMethod("getMap" + str, null).invoke(childAt, null)));
                        }
                    } catch (IllegalAccessException e) {
                        StringBuilder sbT = kng0.t(" Custom Attribute \"", str, "\" not found on ");
                        sbT.append(cls.getName());
                        Log.e("TransitionLayout", sbT.toString(), e);
                    } catch (NoSuchMethodException e2) {
                        Log.e("TransitionLayout", cls.getName() + " must have a method " + str, e2);
                    } catch (InvocationTargetException e3) {
                        StringBuilder sbT2 = kng0.t(" Custom Attribute \"", str, "\" not found on ");
                        sbT2.append(cls.getName());
                        Log.e("TransitionLayout", sbT2.toString(), e3);
                    }
                    map4 = map5;
                }
                m3eVar.g = map3;
                m3eVar.c(id, a3eVar);
                p3eVar.b = childAt.getVisibility();
                p3eVar.d = childAt.getAlpha();
                q3eVar.b = childAt.getRotation();
                q3eVar.c = childAt.getRotationX();
                q3eVar.d = childAt.getRotationY();
                q3eVar.e = childAt.getScaleX();
                q3eVar.f = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    q3eVar.g = pivotX;
                    q3eVar.h = pivotY;
                }
                q3eVar.j = childAt.getTranslationX();
                q3eVar.k = childAt.getTranslationY();
                q3eVar.l = childAt.getTranslationZ();
                if (q3eVar.m) {
                    q3eVar.n = childAt.getElevation();
                }
                if (childAt instanceof Barrier) {
                    Barrier barrier = (Barrier) childAt;
                    n3eVar.o0 = barrier.getAllowsGoneWidget();
                    n3eVar.j0 = barrier.getReferencedIds();
                    n3eVar.g0 = barrier.getType();
                    n3eVar.h0 = barrier.getMargin();
                }
            }
            i4 = i3 + 1;
            r3eVar = this;
            childCount = i2;
            map2 = map;
        }
    }

    public final m3e h(int i2) {
        Integer numValueOf = Integer.valueOf(i2);
        HashMap map = this.g;
        if (!map.containsKey(numValueOf)) {
            map.put(Integer.valueOf(i2), new m3e());
        }
        return (m3e) map.get(Integer.valueOf(i2));
    }

    public final m3e i(int i2) {
        Integer numValueOf = Integer.valueOf(i2);
        HashMap map = this.g;
        if (map.containsKey(numValueOf)) {
            return (m3e) map.get(Integer.valueOf(i2));
        }
        return null;
    }

    public final void j(int i2, Context context) {
        XmlResourceParser xml = context.getResources().getXml(i2);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    m3e m3eVarG = g(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        m3eVarG.e.f22844a = true;
                    }
                    this.g.put(Integer.valueOf(m3eVarG.f21110a), m3eVarG);
                }
            }
        } catch (IOException e) {
            Log.e("ConstraintSet", "Error parsing resource: " + i2, e);
        } catch (XmlPullParserException e2) {
            Log.e("ConstraintSet", "Error parsing resource: " + i2, e2);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void k(Context context, XmlResourceParser xmlResourceParser) {
        try {
            int eventType = xmlResourceParser.getEventType();
            m3e m3eVarG = null;
            while (eventType != 1) {
                if (eventType == 0) {
                    xmlResourceParser.getName();
                } else if (eventType == 2) {
                    String name = xmlResourceParser.getName();
                    switch (name.hashCode()) {
                        case -2025855158:
                            if (!name.equals("Layout")) {
                                continue;
                            } else {
                                if (m3eVarG == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                }
                                m3eVarG.e.b(context, Xml.asAttributeSet(xmlResourceParser));
                            }
                            break;
                        case -1984451626:
                            if (!name.equals("Motion")) {
                                continue;
                            } else {
                                if (m3eVarG == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                }
                                m3eVarG.d.b(context, Xml.asAttributeSet(xmlResourceParser));
                            }
                            break;
                        case -1962203927:
                            if (!name.equals("ConstraintOverride")) {
                                continue;
                            } else {
                                m3eVarG = g(context, Xml.asAttributeSet(xmlResourceParser), true);
                            }
                            break;
                        case -1269513683:
                            if (!name.equals("PropertySet")) {
                                continue;
                            } else {
                                if (m3eVarG == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                }
                                m3eVarG.c.a(context, Xml.asAttributeSet(xmlResourceParser));
                            }
                            break;
                        case -1238332596:
                            if (!name.equals("Transform")) {
                                continue;
                            } else {
                                if (m3eVarG == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                }
                                m3eVarG.f.b(context, Xml.asAttributeSet(xmlResourceParser));
                            }
                            break;
                        case -71750448:
                            if (!name.equals("Guideline")) {
                                continue;
                            } else {
                                m3eVarG = g(context, Xml.asAttributeSet(xmlResourceParser), false);
                                n3e n3eVar = m3eVarG.e;
                                n3eVar.f22844a = true;
                                n3eVar.b = true;
                            }
                            break;
                        case 366511058:
                            if (!name.equals("CustomMethod")) {
                                continue;
                            }
                            break;
                        case 1331510167:
                            if (!name.equals("Barrier")) {
                                continue;
                            } else {
                                m3eVarG = g(context, Xml.asAttributeSet(xmlResourceParser), false);
                                m3eVarG.e.i0 = 1;
                            }
                            break;
                        case 1791837707:
                            if (!name.equals("CustomAttribute")) {
                                continue;
                            }
                            break;
                        case 1803088381:
                            if (!name.equals("Constraint")) {
                                continue;
                            } else {
                                m3eVarG = g(context, Xml.asAttributeSet(xmlResourceParser), false);
                            }
                            break;
                        default:
                            continue;
                    }
                    if (m3eVarG == null) {
                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                    }
                    x2e.d(context, xmlResourceParser, m3eVarG.g);
                } else if (eventType == 3) {
                    String lowerCase = xmlResourceParser.getName().toLowerCase(Locale.ROOT);
                    switch (lowerCase.hashCode()) {
                        case -2075718416:
                            if (!lowerCase.equals("guideline")) {
                                break;
                            }
                            break;
                        case -190376483:
                            if (!lowerCase.equals("constraint")) {
                            }
                            break;
                        case 426575017:
                            if (!lowerCase.equals("constraintoverride")) {
                            }
                            break;
                        case 2146106725:
                            if (!lowerCase.equals("constraintset")) {
                                continue;
                            } else {
                                return;
                            }
                            break;
                        default:
                            continue;
                    }
                    this.g.put(Integer.valueOf(m3eVarG.f21110a), m3eVarG);
                    m3eVarG = null;
                }
                eventType = xmlResourceParser.next();
            }
        } catch (IOException e) {
            Log.e("ConstraintSet", "Error parsing XML resource", e);
        } catch (XmlPullParserException e2) {
            Log.e("ConstraintSet", "Error parsing XML resource", e2);
        }
    }
}
