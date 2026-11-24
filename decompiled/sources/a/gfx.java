package a;

import android.content.Context;
import android.gov.nist.core.Separators;
import android.graphics.Path;
import com.appsflyer.share.attribution.RequestError;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.io.IOException;
import java.io.InputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.cyber.statistics_blocks.api.StatisticBlockModel;
import org.xplatform.cyber.statistics_blocks.api.StatisticBlocksParams;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public abstract class gfx {
    public static tlc A(Class cls) {
        int i = 0;
        while (cls.isArray()) {
            i++;
            cls = cls.getComponentType();
            cls.getClass();
        }
        if (!cls.isPrimitive()) {
            qlc qlcVarA = bqe0.a(cls);
            String str = bay.f2281a;
            qlc qlcVarG = bay.g(qlcVarA.a());
            if (qlcVarG != null) {
                qlcVarA = qlcVarG;
            }
            return new tlc(qlcVarA, i);
        }
        if (cls.equals(Void.TYPE)) {
            swq swqVarI = i4m0.d.i();
            return new tlc(new qlc(swqVarI.b(), swqVarI.f32934a.g()), i);
        }
        iwb0 iwb0VarD = mfy.b(cls.getName()).d();
        iwb0VarD.getClass();
        if (i > 0) {
            swq swqVar = (swq) iwb0VarD.d.getValue();
            swqVar.getClass();
            return new tlc(new qlc(swqVar.b(), swqVar.f32934a.g()), i - 1);
        }
        swq swqVar2 = (swq) iwb0VarD.c.getValue();
        swqVar2.getClass();
        return new tlc(new qlc(swqVar2.b(), swqVar2.f32934a.g()), i);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00af  */
    public static final jiy B(Class cls, jiy... jiyVarArr) {
        Object obj;
        jiy jiyVar;
        Field field;
        Object obj2;
        jiy jiyVarI;
        Field field2;
        if (cls.isEnum() && cls.getAnnotation(ahi0.class) == null && cls.getAnnotation(sua0.class) == null) {
            Object[] enumConstants = cls.getEnumConstants();
            String canonicalName = cls.getCanonicalName();
            canonicalName.getClass();
            enumConstants.getClass();
            return new g0o(canonicalName, (Enum[]) enumConstants);
        }
        jiy[] jiyVarArr2 = (jiy[]) Arrays.copyOf(jiyVarArr, jiyVarArr.length);
        try {
            Field declaredField = cls.getDeclaredField("Companion");
            declaredField.setAccessible(true);
            obj = declaredField.get(null);
        } catch (Throwable unused) {
            obj = null;
        }
        jiy jiyVarI2 = obj == null ? null : I(obj, (jiy[]) Arrays.copyOf(jiyVarArr2, jiyVarArr2.length));
        if (jiyVarI2 != null) {
            return jiyVarI2;
        }
        String canonicalName2 = cls.getCanonicalName();
        if (canonicalName2 == null || kotlin.text.c.x(canonicalName2, "java.", false) || kotlin.text.c.x(canonicalName2, "kotlin.", false)) {
            jiyVar = null;
        } else {
            Field[] declaredFields = cls.getDeclaredFields();
            declaredFields.getClass();
            int length = declaredFields.length;
            Field field3 = null;
            int i = 0;
            boolean z = false;
            while (true) {
                if (i >= length) {
                    if (!z) {
                        break;
                    }
                    break;
                }
                Field field4 = declaredFields[i];
                if (Intrinsics.d(field4.getName(), "INSTANCE") && Intrinsics.d(field4.getType(), cls) && Modifier.isStatic(field4.getModifiers())) {
                    if (!z) {
                        z = true;
                        field3 = field4;
                    }
                }
                i++;
                field3 = null;
                break;
            }
            if (field3 == null) {
                jiyVar = null;
            } else {
                Object obj3 = field3.get(null);
                Method[] methods = cls.getMethods();
                methods.getClass();
                int length2 = methods.length;
                Method method = null;
                int i2 = 0;
                boolean z2 = false;
                while (true) {
                    if (i2 >= length2) {
                        if (!z2) {
                            break;
                        }
                        break;
                    }
                    Method method2 = methods[i2];
                    if (Intrinsics.d(method2.getName(), "serializer")) {
                        Class<?>[] parameterTypes = method2.getParameterTypes();
                        parameterTypes.getClass();
                        if (parameterTypes.length == 0 && Intrinsics.d(method2.getReturnType(), jiy.class)) {
                            if (!z2) {
                                z2 = true;
                                method = method2;
                            }
                        }
                    }
                    i2++;
                    method = null;
                    break;
                }
                if (method == null) {
                    jiyVar = null;
                } else {
                    Object objInvoke = method.invoke(obj3, null);
                    if (objInvoke instanceof jiy) {
                        jiyVar = (jiy) objInvoke;
                    } else {
                        jiyVar = null;
                    }
                }
            }
        }
        if (jiyVar != null) {
            return jiyVar;
        }
        jiy[] jiyVarArr3 = (jiy[]) Arrays.copyOf(jiyVarArr, jiyVarArr.length);
        Field[] declaredFields2 = cls.getDeclaredFields();
        declaredFields2.getClass();
        int length3 = declaredFields2.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length3) {
                field = null;
                break;
            }
            field = declaredFields2[i3];
            if (Modifier.isStatic(field.getModifiers()) && field.getType().getAnnotation(m950.class) != null) {
                break;
            }
            i3++;
        }
        if (field == null) {
            obj2 = null;
        } else {
            try {
                field.setAccessible(true);
                obj2 = field.get(null);
            } catch (Throwable unused2) {
                obj2 = null;
            }
        }
        if (obj2 == null || (jiyVarI = I(obj2, (jiy[]) Arrays.copyOf(jiyVarArr3, jiyVarArr3.length))) == null) {
            try {
                Class<?>[] declaredClasses = cls.getDeclaredClasses();
                declaredClasses.getClass();
                int length4 = declaredClasses.length;
                Class<?> cls2 = null;
                int i4 = 0;
                boolean z3 = false;
                while (true) {
                    if (i4 < length4) {
                        Class<?> cls3 = declaredClasses[i4];
                        if (cls3.getSimpleName().equals("$serializer")) {
                            if (!z3) {
                                z3 = true;
                                cls2 = cls3;
                            }
                        }
                        i4++;
                    } else if (!z3) {
                    }
                    cls2 = null;
                    break;
                }
                Object obj4 = (cls2 == null || (field2 = cls2.getField("INSTANCE")) == null) ? null : field2.get(null);
                jiyVarI = obj4 instanceof jiy ? (jiy) obj4 : null;
            } catch (NoSuchFieldException unused3) {
            }
        }
        if (jiyVarI != null) {
            return jiyVarI;
        }
        if (cls.getAnnotation(sua0.class) == null) {
            ahi0 ahi0Var = (ahi0) cls.getAnnotation(ahi0.class);
            if (ahi0Var == null) {
                return null;
            }
            Class clsWith = ahi0Var.with();
            tre0 tre0Var = sre0.f32672a;
            if (!tre0Var.b(clsWith).equals(tre0Var.b(uua0.class))) {
                return null;
            }
        }
        return new uua0(sre0.f32672a.b(cls));
    }

    public static float[] C(int i, float[] fArr) {
        if (i < 0) {
            e9d0.o();
            return null;
        }
        int length = fArr.length;
        if (length < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int iMin = Math.min(i, length);
        float[] fArr2 = new float[i];
        System.arraycopy(fArr, 0, fArr2, 0, iMin);
        return fArr2;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002c  */
    /* JADX WARN: Code duplicated, block: B:17:0x0042  */
    /* JADX WARN: Code duplicated, block: B:41:0x0091  */
    /* JADX WARN: Code duplicated, block: B:46:0x009c A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:44:0x0096, B:46:0x009c, B:52:0x00b1, B:53:0x00b4), top: B:68:0x0054 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b1 A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:44:0x0096, B:46:0x009c, B:52:0x00b1, B:53:0x00b4), top: B:68:0x0054 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d6 A[SYNTHETIC] */
    public static a390[] D(String str) {
        int i;
        String strTrim;
        float[] fArrC;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        int i3 = 0;
        int i4 = 1;
        while (i4 < str.length()) {
            while (i4 < str.length()) {
                char cCharAt = str.charAt(i4);
                if ((cCharAt - 'Z') * (cCharAt - 'A') > 0) {
                    if ((cCharAt - 'z') * (cCharAt - 'a') > 0) {
                        continue;
                    } else if (cCharAt != 'e' && cCharAt != 'E') {
                        strTrim = str.substring(i3, i4).trim();
                        if (strTrim.isEmpty()) {
                            if (strTrim.charAt(i2) != 'z' || strTrim.charAt(i2) == 'Z') {
                                fArrC = new float[i2];
                            } else {
                                try {
                                    float[] fArr = new float[strTrim.length()];
                                    int length = strTrim.length();
                                    int i5 = i2;
                                    int i6 = 1;
                                    while (i6 < length) {
                                        int i7 = i2;
                                        int i8 = i7;
                                        int i9 = i8;
                                        int i10 = i9;
                                        for (int i11 = i6; i11 < strTrim.length(); i11++) {
                                            char cCharAt2 = strTrim.charAt(i11);
                                            if (cCharAt2 == ' ') {
                                                i7 = 0;
                                                i9 = 1;
                                            } else if (cCharAt2 != 'E' && cCharAt2 != 'e') {
                                                switch (cCharAt2) {
                                                    case ',':
                                                        i7 = 0;
                                                        i9 = 1;
                                                        break;
                                                    case '-':
                                                        if (i11 == i6 || i7 != 0) {
                                                            i7 = 0;
                                                        } else {
                                                            i7 = 0;
                                                            i9 = 1;
                                                            i10 = 1;
                                                        }
                                                        break;
                                                    case '.':
                                                        if (i8 == 0) {
                                                            i7 = 0;
                                                            i8 = 1;
                                                        } else {
                                                            i7 = 0;
                                                            i9 = 1;
                                                            i10 = 1;
                                                        }
                                                        break;
                                                    default:
                                                        i7 = 0;
                                                        break;
                                                }
                                            } else {
                                                i7 = 1;
                                            }
                                            if (i9 != 0) {
                                                if (i6 < i11) {
                                                    fArr[i5] = Float.parseFloat(strTrim.substring(i6, i11));
                                                    i5++;
                                                }
                                                if (i10 != 0) {
                                                    i6 = i11;
                                                } else {
                                                    i6 = i11 + 1;
                                                }
                                                i2 = 0;
                                            }
                                        }
                                        if (i6 < i11) {
                                            fArr[i5] = Float.parseFloat(strTrim.substring(i6, i11));
                                            i5++;
                                        }
                                        if (i10 != 0) {
                                            i6 = i11;
                                        } else {
                                            i6 = i11 + 1;
                                        }
                                        i2 = 0;
                                    }
                                    fArrC = C(i5, fArr);
                                    i2 = 0;
                                } catch (NumberFormatException e) {
                                    e9d0.m(kng0.l("error in parsing \"", strTrim, Separators.DOUBLE_QUOTE), e);
                                    return null;
                                }
                            }
                            arrayList.add(new a390(strTrim.charAt(i2), fArrC));
                        }
                        i3 = i4;
                        i4++;
                        i2 = 0;
                    }
                } else if (cCharAt != 'e') {
                    continue;
                }
                i4++;
            }
            strTrim = str.substring(i3, i4).trim();
            if (strTrim.isEmpty()) {
                if (strTrim.charAt(i2) != 'z') {
                    fArrC = new float[i2];
                } else {
                    fArrC = new float[i2];
                }
                arrayList.add(new a390(strTrim.charAt(i2), fArrC));
            }
            i3 = i4;
            i4++;
            i2 = 0;
        }
        if (i4 - i3 != 1 || i3 >= str.length()) {
            i = 0;
        } else {
            i = 0;
            arrayList.add(new a390(str.charAt(i3), new float[0]));
        }
        return (a390[]) arrayList.toArray(new a390[i]);
    }

    public static Path E(String str) {
        Path path = new Path();
        try {
            K(D(str), path);
            return path;
        } catch (RuntimeException e) {
            e9d0.m("Error in parsing ".concat(str), e);
            return null;
        }
    }

    public static final String F(ozc ozcVar, boolean z, boolean z2, boolean z3, ctf0 ctf0Var) {
        int i;
        ctf0Var.getClass();
        if (ozcVar == ozc.MIN_PAYOUT && z3) {
            i = R.string.coupon_min_bet_possible_win;
        } else if (ozcVar == ozc.MAX_PAYOUT && z3) {
            i = R.string.max_win_possible;
        } else if (z) {
            i = R.string.summary_possible_win;
        } else {
            i = z2 ? R.string.make_bet_max_possible_win : R.string.history_possible_win;
        }
        return ctf0Var.f(i, new Object[0]);
    }

    public static final String G(q4f q4fVar, boolean z, boolean z2, ctf0 ctf0Var) {
        int i;
        q4fVar.getClass();
        ctf0Var.getClass();
        if (q4fVar == q4f.e) {
            i = R.string.coupon_min_bet_possible_win;
        } else if (z) {
            i = R.string.summary_possible_win;
        } else {
            i = z2 ? R.string.make_bet_max_possible_win : R.string.history_possible_win;
        }
        return ctf0Var.f(i, new Object[0]);
    }

    public static final String H(sip sipVar, t9m0 t9m0Var, ctf0 ctf0Var) {
        int i;
        int iOrdinal = t9m0Var.ordinal();
        int i2 = R.string.graphs;
        switch (iOrdinal) {
            case 0:
                i2 = R.string.selected_heroes;
                break;
            case 1:
                i2 = R.string.mini_map_with_hyphen;
                break;
            case 2:
                i2 = R.string.statistic_items_and_skills;
                break;
            case 3:
                i2 = R.string.gold_experience_and_etc;
                break;
            case 4:
            case 39:
            case 48:
            case 72:
                i2 = R.string.bans_and_picks;
                break;
            case 5:
            case 20:
            case 38:
                i2 = R.string.game_progress;
                break;
            case 6:
            case 34:
                break;
            case 7:
            case 35:
            case 76:
                i2 = R.string.previous_maps;
                break;
            case 8:
            case 23:
            case 36:
            case RequestError.RESPONSE_CODE_FAILURE /* 50 */:
            case 58:
            case 73:
                i2 = R.string.composition;
                break;
            case 9:
            case 37:
                i2 = R.string.best_heroes;
                break;
            case 10:
            case 24:
            case 41:
            case 53:
            case 60:
                i2 = R.string.last_matches;
                break;
            case 11:
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
            case 43:
            case 54:
            case 64:
                i2 = R.string.cyber_future_matches;
                break;
            case 12:
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
            case 44:
            case 55:
            case 65:
                i2 = R.string.stage_table;
                break;
            case 13:
                i2 = R.string.minimap_selected_heroes;
                break;
            case 14:
            case 61:
            case 80:
                i2 = R.string.statistic;
                break;
            case 15:
                i2 = R.string.player_abilities;
                break;
            case 16:
                i2 = R.string.item_statistics;
                break;
            case 17:
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
            case 45:
            case 56:
            case 68:
                i2 = R.string.cyber_about_map;
                break;
            case 18:
                i2 = R.string.statistics_and_weapons;
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
            case 47:
            case 62:
                i2 = R.string.round_statistics;
                break;
            case 21:
            case 49:
            case 57:
                i2 = R.string.series_map;
                break;
            case 22:
                int iOrdinal2 = sipVar.ordinal();
                if (iOrdinal2 == 0) {
                    i = R.string.statistic_maps_line;
                } else {
                    if (iOrdinal2 != 1) {
                        t9f.b();
                        return null;
                    }
                    i = R.string.statistic_maps;
                }
                i2 = i;
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
            case 46:
                i2 = R.string.statistic_info_players_stat;
                break;
            case AvailableCode.HMS_IS_SPOOF /* 29 */:
            case 69:
                i2 = R.string.statistic_teams_title;
                break;
            case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
            case 70:
                i2 = R.string.team_statistics_red;
                break;
            case AvailableCode.CURRENT_SHOWING_SERVICE_UNAVAILABLE /* 31 */:
            case 75:
                i2 = R.string.mini_map;
                break;
            case 32:
            case 71:
                i2 = R.string.team_statistics_blue;
                break;
            case 33:
            case 74:
                i2 = R.string.statistics_and_items;
                break;
            case 40:
                i2 = R.string.popular_champions;
                break;
            case 42:
            case 52:
                i2 = R.string.compare_team;
                break;
            case 51:
                i2 = R.string.ban_statistics;
                break;
            case 59:
                i2 = R.string.economy;
                break;
            case 63:
                i2 = R.string.win_rate_map_statistic;
                break;
            case 66:
                i2 = R.string.valorant_aim_players;
                break;
            case 67:
                i2 = R.string.valorant_team_advantage;
                break;
            case 77:
                i2 = R.string.cyber_statistic_net_worth;
                break;
            case 78:
                i2 = R.string.general_statistic;
                break;
            case 79:
                i2 = R.string.last_fights;
                break;
            case 81:
                i2 = R.string.shot_map;
                break;
            default:
                t9f.b();
                return null;
        }
        return ctf0Var.b.a(i2, Arrays.copyOf(new Object[0], 0));
    }

    public static final jiy I(Object obj, jiy... jiyVarArr) throws IllegalAccessException, InvocationTargetException {
        Class[] clsArr;
        try {
            if (jiyVarArr.length == 0) {
                clsArr = new Class[0];
            } else {
                int length = jiyVarArr.length;
                Class[] clsArr2 = new Class[length];
                for (int i = 0; i < length; i++) {
                    clsArr2[i] = jiy.class;
                }
                clsArr = clsArr2;
            }
            Object objInvoke = obj.getClass().getDeclaredMethod("serializer", (Class[]) Arrays.copyOf(clsArr, clsArr.length)).invoke(obj, Arrays.copyOf(jiyVarArr, jiyVarArr.length));
            if (objInvoke instanceof jiy) {
                return (jiy) objInvoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        } catch (InvocationTargetException e) {
            Throwable cause = e.getCause();
            if (cause == null) {
                throw e;
            }
            String message = cause.getMessage();
            if (message == null) {
                message = e.getMessage();
            }
            throw new InvocationTargetException(cause, message);
        }
    }

    public static final boolean J(d0d0 d0d0Var) {
        d0d0Var.getClass();
        return d0d0Var.d() == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void K(a390[] a390VarArr, Path path) {
        int i;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        a390[] a390VarArr2 = a390VarArr;
        float[] fArr = new float[6];
        int length = a390VarArr2.length;
        int i2 = 0;
        int i3 = 0;
        char c = 'm';
        while (i3 < length) {
            a390 a390Var = a390VarArr2[i3];
            char c2 = a390Var.f161a;
            float[] fArr2 = a390Var.b;
            float f11 = fArr[i2];
            float f12 = fArr[1];
            float f13 = fArr[2];
            float f14 = fArr[3];
            float f15 = fArr[4];
            int i4 = i2;
            float f16 = fArr[5];
            switch (c2) {
                case 'A':
                case 'a':
                    i = 7;
                    break;
                case 'C':
                case 'c':
                    i = 6;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i = 1;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i = 4;
                    break;
                case SubsamplingScaleImageView.ORIENTATION_90 /* 90 */:
                case 'z':
                    path.close();
                    path.moveTo(f15, f16);
                    f11 = f15;
                    f13 = f11;
                    f12 = f16;
                    f14 = f12;
                default:
                    i = 2;
                    break;
            }
            float f17 = f15;
            float f18 = f16;
            float f19 = f11;
            float f20 = f12;
            int i5 = i4;
            while (i5 < fArr2.length) {
                if (c2 == 'A') {
                    fArr2 = fArr2;
                    i5 = i5;
                    a390Var = a390Var;
                    float f21 = f20;
                    i3 = i3;
                    int i6 = i5 + 5;
                    int i7 = i5 + 6;
                    a390.a(path, f19, f21, fArr2[i6], fArr2[i7], fArr2[i5], fArr2[i5 + 1], fArr2[i5 + 2], fArr2[i5 + 3] != 0.0f ? 1 : i4, fArr2[i5 + 4] != 0.0f ? 1 : i4);
                    f13 = fArr2[i6];
                    f = fArr2[i7];
                    f14 = f;
                    f2 = f13;
                } else if (c2 == 'C') {
                    fArr2 = fArr2;
                    i5 = i5;
                    i3 = i3;
                    a390Var = a390Var;
                    int i8 = i5 + 2;
                    int i9 = i5 + 3;
                    int i10 = i5 + 4;
                    int i11 = i5 + 5;
                    path.cubicTo(fArr2[i5], fArr2[i5 + 1], fArr2[i8], fArr2[i9], fArr2[i10], fArr2[i11]);
                    float f22 = fArr2[i10];
                    float f23 = fArr2[i11];
                    f13 = fArr2[i8];
                    f14 = fArr2[i9];
                    f = f23;
                    f2 = f22;
                } else if (c2 == 'H') {
                    fArr2 = fArr2;
                    i5 = i5;
                    a390Var = a390Var;
                    f = f20;
                    i3 = i3;
                    path.lineTo(fArr2[i5], f);
                    f2 = fArr2[i5];
                } else if (c2 == 'Q') {
                    fArr2 = fArr2;
                    i5 = i5;
                    i3 = i3;
                    a390Var = a390Var;
                    int i12 = i5 + 1;
                    int i13 = i5 + 2;
                    int i14 = i5 + 3;
                    path.quadTo(fArr2[i5], fArr2[i12], fArr2[i13], fArr2[i14]);
                    float f24 = fArr2[i5];
                    float f25 = fArr2[i12];
                    float f26 = fArr2[i13];
                    float f27 = fArr2[i14];
                    f13 = f24;
                    f14 = f25;
                    f2 = f26;
                    f = f27;
                } else if (c2 == 'V') {
                    fArr2 = fArr2;
                    i5 = i5;
                    i3 = i3;
                    a390Var = a390Var;
                    f2 = f19;
                    path.lineTo(f2, fArr2[i5]);
                    f = fArr2[i5];
                } else if (c2 != 'a') {
                    if (c2 == 'c') {
                        fArr2 = fArr2;
                        i5 = i5;
                        int i15 = i5 + 2;
                        int i16 = i5 + 3;
                        int i17 = i5 + 4;
                        int i18 = i5 + 5;
                        path.rCubicTo(fArr2[i5], fArr2[i5 + 1], fArr2[i15], fArr2[i16], fArr2[i17], fArr2[i18]);
                        float f28 = fArr2[i15] + f19;
                        float f29 = fArr2[i16] + f20;
                        f19 += fArr2[i17];
                        f20 += fArr2[i18];
                        f13 = f28;
                        f14 = f29;
                    } else if (c2 != 'h') {
                        if (c2 != 'q') {
                            if (c2 != 'v') {
                                if (c2 == 'L') {
                                    fArr2 = fArr2;
                                    i5 = i5;
                                    int i19 = i5 + 1;
                                    path.lineTo(fArr2[i5], fArr2[i19]);
                                    f2 = fArr2[i5];
                                    f = fArr2[i19];
                                } else if (c2 == 'M') {
                                    fArr2 = fArr2;
                                    i5 = i5;
                                    f2 = fArr2[i5];
                                    f = fArr2[i5 + 1];
                                    if (i5 > 0) {
                                        path.lineTo(f2, f);
                                    } else {
                                        path.moveTo(f2, f);
                                        f17 = f2;
                                        f18 = f;
                                    }
                                } else if (c2 == 'S') {
                                    fArr2 = fArr2;
                                    i5 = i5;
                                    if (c == 'c' || c == 's' || c == 'C' || c == 'S') {
                                        f19 = (f19 * 2.0f) - f13;
                                        f20 = (f20 * 2.0f) - f14;
                                    }
                                    float f30 = f19;
                                    float f31 = f20;
                                    int i20 = i5 + 1;
                                    int i21 = i5 + 2;
                                    int i22 = i5 + 3;
                                    path.cubicTo(f30, f31, fArr2[i5], fArr2[i20], fArr2[i21], fArr2[i22]);
                                    f13 = fArr2[i5];
                                    f14 = fArr2[i20];
                                    f2 = fArr2[i21];
                                    f = fArr2[i22];
                                } else if (c2 == 'T') {
                                    fArr2 = fArr2;
                                    i5 = i5;
                                    if (c == 'q' || c == 't' || c == 'Q' || c == 'T') {
                                        f19 = (f19 * 2.0f) - f13;
                                        f20 = (f20 * 2.0f) - f14;
                                    }
                                    int i23 = i5 + 1;
                                    path.quadTo(f19, f20, fArr2[i5], fArr2[i23]);
                                    f2 = fArr2[i5];
                                    f = fArr2[i23];
                                    a390Var = a390Var;
                                    f13 = f19;
                                    f14 = f20;
                                } else if (c2 == 'l') {
                                    fArr2 = fArr2;
                                    i5 = i5;
                                    int i24 = i5 + 1;
                                    path.rLineTo(fArr2[i5], fArr2[i24]);
                                    f19 += fArr2[i5];
                                    f6 = fArr2[i24];
                                } else if (c2 == 'm') {
                                    fArr2 = fArr2;
                                    i5 = i5;
                                    float f32 = fArr2[i5];
                                    f19 += f32;
                                    float f33 = fArr2[i5 + 1];
                                    f20 += f33;
                                    if (i5 > 0) {
                                        path.rLineTo(f32, f33);
                                    } else {
                                        path.rMoveTo(f32, f33);
                                        a390Var = a390Var;
                                        f2 = f19;
                                        f17 = f2;
                                        f = f20;
                                        f18 = f;
                                    }
                                } else if (c2 != 's') {
                                    if (c2 != 't') {
                                        f2 = f19;
                                    } else {
                                        if (c == 'q' || c == 't' || c == 'Q' || c == 'T') {
                                            f9 = f19 - f13;
                                            f10 = f20 - f14;
                                        } else {
                                            f10 = 0.0f;
                                            f9 = 0.0f;
                                        }
                                        int i25 = i5 + 1;
                                        path.rQuadTo(f9, f10, fArr2[i5], fArr2[i25]);
                                        float f34 = f9 + f19;
                                        float f35 = f10 + f20;
                                        float f36 = f19 + fArr2[i5];
                                        f20 += fArr2[i25];
                                        f14 = f35;
                                        f2 = f36;
                                        f13 = f34;
                                    }
                                    f = f20;
                                } else {
                                    if (c == 'c' || c == 's' || c == 'C' || c == 'S') {
                                        f7 = f20 - f14;
                                        f8 = f19 - f13;
                                    } else {
                                        f8 = 0.0f;
                                        f7 = 0.0f;
                                    }
                                    int i26 = i5;
                                    int i27 = i26 + 1;
                                    int i28 = i26 + 2;
                                    int i29 = i26 + 3;
                                    fArr2 = fArr2;
                                    i5 = i26;
                                    path.rCubicTo(f8, f7, fArr2[i26], fArr2[i27], fArr2[i28], fArr2[i29]);
                                    f3 = fArr2[i5] + f19;
                                    f4 = fArr2[i27] + f20;
                                    f19 += fArr2[i28];
                                    f5 = fArr2[i29];
                                }
                                a390Var = a390Var;
                            } else {
                                fArr2 = fArr2;
                                i5 = i5;
                                path.rLineTo(0.0f, fArr2[i5]);
                                f6 = fArr2[i5];
                            }
                            f20 += f6;
                        } else {
                            fArr2 = fArr2;
                            i5 = i5;
                            int i30 = i5 + 1;
                            int i31 = i5 + 2;
                            int i32 = i5 + 3;
                            path.rQuadTo(fArr2[i5], fArr2[i30], fArr2[i31], fArr2[i32]);
                            f3 = fArr2[i5] + f19;
                            f4 = fArr2[i30] + f20;
                            f19 += fArr2[i31];
                            f5 = fArr2[i32];
                        }
                        f20 += f5;
                        f13 = f3;
                        f14 = f4;
                    } else {
                        fArr2 = fArr2;
                        i5 = i5;
                        path.rLineTo(fArr2[i5], 0.0f);
                        f19 += fArr2[i5];
                    }
                    a390Var = a390Var;
                    f2 = f19;
                    f = f20;
                } else {
                    fArr2 = fArr2;
                    i5 = i5;
                    int i33 = i5 + 5;
                    float f37 = fArr2[i33] + f19;
                    int i34 = i5 + 6;
                    float f38 = fArr2[i34] + f20;
                    a390Var = a390Var;
                    float f39 = f19;
                    float f40 = f20;
                    i3 = i3;
                    a390.a(path, f39, f40, f37, f38, fArr2[i5], fArr2[i5 + 1], fArr2[i5 + 2], fArr2[i5 + 3] != 0.0f ? 1 : i4, fArr2[i5 + 4] != 0.0f ? 1 : i4);
                    f2 = f39 + fArr2[i33];
                    f = f40 + fArr2[i34];
                    f13 = f2;
                    f14 = f;
                }
                i5 += i;
                path = path;
                a390Var = a390Var;
                c2 = c2;
                i3 = i3;
                f19 = f2;
                f20 = f;
                c = c2;
                fArr2 = fArr2;
            }
            fArr[i4] = f19;
            fArr[1] = f20;
            fArr[2] = f13;
            fArr[3] = f14;
            fArr[4] = f17;
            fArr[5] = f18;
            c = a390Var.f161a;
            i3++;
            a390VarArr2 = a390VarArr;
            i2 = i4;
        }
    }

    public static vr00 L(wvq0 wvq0Var) {
        int i;
        ar20 ar20Var;
        wvq0Var.getClass();
        ar20 ar20VarE = wvq0Var.e();
        ar20 ar20Var2 = cy2.F;
        if (!Intrinsics.d(ar20VarE, ar20Var2)) {
            return null;
        }
        int i2 = wvq0Var.f39851a;
        ArrayList arrayList = new ArrayList();
        wvq0 wvq0VarA = wvq0Var.a();
        int i3 = -239;
        int i4 = -239;
        while (true) {
            ar20 ar20VarE2 = wvq0VarA.e();
            i = wvq0VarA.f39851a;
            ar20Var = cy2.G;
            if (Intrinsics.d(ar20VarE2, ar20Var) || wvq0VarA.e() == null) {
                break;
            }
            if (i3 + 1 != i) {
                if (i4 != -239) {
                    arrayList.add(new IntRange(i4, i3, 1));
                }
                i4 = i;
            }
            if (Intrinsics.d(wvq0VarA.e(), ar20Var2)) {
                i3 = i;
                break;
            }
            wvq0VarA = wvq0VarA.a();
            i3 = i;
        }
        if (!Intrinsics.d(wvq0VarA.e(), ar20Var) || i == i2 + 1) {
            return null;
        }
        List listC = kotlin.collections.a.c(new sgi0(new IntRange(i2, i + 1, 1), wb.z));
        if (i4 != -239) {
            arrayList.add(new IntRange(i4, i3, 1));
        }
        return new vr00(wvq0VarA, listC, arrayList);
    }

    public static vr00 M(wvq0 wvq0Var) {
        int i;
        ar20 ar20Var = cy2.G;
        wvq0Var.getClass();
        ar20 ar20VarE = wvq0Var.e();
        ar20 ar20Var2 = cy2.F;
        if (!Intrinsics.d(ar20VarE, ar20Var2)) {
            return null;
        }
        int i2 = wvq0Var.f39851a;
        ArrayList arrayList = new ArrayList();
        wvq0 wvq0VarA = wvq0Var.a();
        int i3 = -239;
        int i4 = -239;
        int i5 = 1;
        while (true) {
            ar20 ar20VarE2 = wvq0VarA.e();
            i = wvq0VarA.f39851a;
            if (ar20VarE2 == null || (Intrinsics.d(wvq0VarA.e(), ar20Var) && (i5 = i5 - 1) == 0)) {
                break;
            }
            if (i3 + 1 != i) {
                if (i4 != -239) {
                    arrayList.add(new IntRange(i4, i3, 1));
                }
                i4 = i;
            }
            if (Intrinsics.d(wvq0VarA.e(), ar20Var2)) {
                i5++;
            }
            wvq0VarA = wvq0VarA.a();
            i3 = i;
        }
        if (!Intrinsics.d(wvq0VarA.e(), ar20Var)) {
            return null;
        }
        List listC = kotlin.collections.a.c(new sgi0(new IntRange(i2, i + 1, 1), wb.C));
        if (i4 != -239) {
            arrayList.add(new IntRange(i4, i3, 1));
        }
        return new vr00(wvq0VarA, listC, arrayList);
    }

    public static void N(nry nryVar, Annotation annotation) {
        Class clsG = azw.G(azw.F(annotation));
        lry lryVarB = nryVar.b(bqe0.a(clsG), new zpe0(annotation));
        if (lryVarB != null) {
            O(lryVarB, annotation, clsG);
        }
    }

    public static void O(lry lryVar, Annotation annotation, Class cls) {
        Method[] declaredMethods = cls.getDeclaredMethods();
        declaredMethods.getClass();
        for (Method method : declaredMethods) {
            try {
                Object objInvoke = method.invoke(annotation, null);
                objInvoke.getClass();
                g950 g950VarE = g950.e(method.getName());
                Class<?> enclosingClass = objInvoke.getClass();
                if (enclosingClass.equals(Class.class)) {
                    lryVar.n(g950VarE, A((Class) objInvoke));
                } else if (kre0.f18762a.contains(enclosingClass)) {
                    lryVar.c(g950VarE, objInvoke);
                } else {
                    List list = bqe0.f3025a;
                    if (Enum.class.isAssignableFrom(enclosingClass)) {
                        if (!enclosingClass.isEnum()) {
                            enclosingClass = enclosingClass.getEnclosingClass();
                        }
                        enclosingClass.getClass();
                        lryVar.b(g950VarE, bqe0.a(enclosingClass), g950.e(((Enum) objInvoke).name()));
                    } else if (Annotation.class.isAssignableFrom(enclosingClass)) {
                        Class<?>[] interfaces = enclosingClass.getInterfaces();
                        interfaces.getClass();
                        Class cls2 = (Class) tx3.W(interfaces);
                        cls2.getClass();
                        lry lryVarI = lryVar.i(bqe0.a(cls2), g950VarE);
                        if (lryVarI != null) {
                            O(lryVarI, (Annotation) objInvoke, cls2);
                        }
                    } else {
                        if (!enclosingClass.isArray()) {
                            throw new UnsupportedOperationException("Unsupported annotation argument value (" + enclosingClass + "): " + objInvoke);
                        }
                        mry mryVarJ = lryVar.j(g950VarE);
                        if (mryVarJ != null) {
                            Class<?> componentType = enclosingClass.getComponentType();
                            if (componentType.isEnum()) {
                                qlc qlcVarA = bqe0.a(componentType);
                                for (Object obj : (Object[]) objInvoke) {
                                    obj.getClass();
                                    mryVarJ.d(qlcVarA, g950.e(((Enum) obj).name()));
                                }
                            } else if (componentType.equals(Class.class)) {
                                for (Object obj2 : (Object[]) objInvoke) {
                                    obj2.getClass();
                                    mryVarJ.c(A((Class) obj2));
                                }
                            } else if (Annotation.class.isAssignableFrom(componentType)) {
                                for (Object obj3 : (Object[]) objInvoke) {
                                    lry lryVarF = mryVarJ.f(bqe0.a(componentType));
                                    if (lryVarF != null) {
                                        obj3.getClass();
                                        O(lryVarF, (Annotation) obj3, componentType);
                                    }
                                }
                            } else {
                                for (Object obj4 : (Object[]) objInvoke) {
                                    mryVarJ.e(obj4);
                                }
                            }
                            mryVarJ.a();
                        }
                    }
                }
            } catch (IllegalAccessException unused) {
            }
        }
        lryVar.a();
    }

    public static String P(InputStream inputStream) throws IOException {
        Charset charset = Charsets.UTF_8;
        charset.getClass();
        try {
            zae0 zae0Var = new zae0(w9x.L(inputStream));
            try {
                String strH0 = zae0Var.H0(charset);
                zae0Var.close();
                inputStream.close();
                return strH0;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    bkb.E(zae0Var, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                bkb.E(inputStream, th3);
                throw th4;
            }
        }
    }

    public static final mez Q(fet fetVar) {
        Object[] objArr = new Object[0];
        v0h0 v0h0Var = mez.x;
        boolean zE = fetVar.e(0) | fetVar.e(0);
        Object objP = fetVar.P();
        if (zE || objP == ukd.f35823a) {
            objP = new pcy((byte) 21);
            fetVar.o0(objP);
        }
        return (mez) e9x.R(objArr, v0h0Var, (Function0) objP, fetVar, 0);
    }

    public static vsg0 R(or30 or30Var, long j, Function0 function0, Function1 function1, int i) {
        long j2 = cag0.f4009a;
        long j3 = cag0.b;
        boolean z = (i & 32) == 0;
        boolean z2 = (i & 64) == 0;
        Function0 b4f0Var = (i & 128) != 0 ? new b4f0((byte) 9) : function0;
        or30Var.getClass();
        return new vsg0(new tkf0(function1, or30Var, j, 3L, j2, j3, z, z2, b4f0Var, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r17v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r27v0 */
    /* JADX WARN: Type inference failed for: r27v1 */
    /* JADX WARN: Type inference failed for: r27v2 */
    /* JADX WARN: Type inference failed for: r27v4 */
    /* JADX WARN: Type inference failed for: r27v5 */
    /* JADX WARN: Type inference failed for: r27v7 */
    /* JADX WARN: Type inference failed for: r27v8 */
    /* JADX WARN: Type inference failed for: r27v9 */
    /* JADX WARN: Type inference failed for: r28v0 */
    /* JADX WARN: Type inference failed for: r28v1 */
    /* JADX WARN: Type inference failed for: r28v2 */
    /* JADX WARN: Type inference failed for: r28v3 */
    /* JADX WARN: Type inference failed for: r28v4 */
    /* JADX WARN: Type inference failed for: r28v5 */
    /* JADX WARN: Type inference failed for: r28v6 */
    /* JADX WARN: Type inference failed for: r28v7 */
    /* JADX WARN: Type inference failed for: r5v0, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v0, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r6v21, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v8 */
    public static final p310 S(a110 a110Var, jch jchVar) {
        ?? arrayList;
        ?? arrayList2;
        Collection collection;
        Iterable iterable;
        a610 a610Var;
        ArrayList arrayList3;
        zz00 zz00Var;
        List listO;
        List listO2;
        ?? r28;
        ?? r27;
        zz00 zz00Var2;
        List listT0;
        ?? r29;
        ?? r210;
        Map map;
        pz00 pz00Var;
        qz00 qz00Var;
        t4h t4hVar;
        t4h t4hVar2;
        Long l;
        j3h j3hVar;
        Long l2;
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        Integer num5;
        t4h t4hVar3;
        t4h t4hVar4;
        t4h t4hVar5;
        List list;
        t4h t4hVar6;
        List list2;
        List list3;
        a110Var.getClass();
        p4h p4hVar = a110Var.f48a;
        List listL = (jchVar == null || (list3 = jchVar.b) == null) ? iun.f15405a : nkb.L(list3);
        if (p4hVar == null || (t4hVar6 = p4hVar.f) == null || (list2 = t4hVar6.f33319a) == null) {
            arrayList = iun.f15405a;
        } else {
            arrayList = new ArrayList(r3d.q(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(t9x.P((w3h) it.next()));
            }
        }
        if (p4hVar == null || (t4hVar5 = p4hVar.g) == null || (list = t4hVar5.f33319a) == null) {
            arrayList2 = iun.f15405a;
        } else {
            arrayList2 = new ArrayList(r3d.q(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList2.add(t9x.P((w3h) it2.next()));
            }
        }
        if (p4hVar == null || (t4hVar4 = p4hVar.f) == null || (collection = t4hVar4.h) == null) {
            collection = iun.f15405a;
        }
        if (p4hVar == null || (t4hVar3 = p4hVar.g) == null || (iterable = t4hVar3.h) == null) {
            iterable = iun.f15405a;
        }
        long jIntValue = (p4hVar == null || (num5 = p4hVar.f26352a) == null) ? 0L : num5.intValue();
        long jIntValue2 = (p4hVar == null || (num4 = p4hVar.b) == null) ? 0L : num4.intValue();
        int iIntValue = (p4hVar == null || (num3 = p4hVar.c) == null) ? 0 : num3.intValue();
        int iIntValue2 = (p4hVar == null || (num2 = p4hVar.d) == null) ? 0 : num2.intValue();
        int iIntValue3 = (p4hVar == null || (num = p4hVar.e) == null) ? 0 : num.intValue();
        a610 a610VarB0 = vdx.b0(p4hVar != null ? p4hVar.f : null);
        a610 a610VarB1 = vdx.b0(p4hVar != null ? p4hVar.g : null);
        ArrayList arrayListQ0 = CollectionsKt.q0(arrayList, arrayList2);
        ArrayList arrayListQ1 = CollectionsKt.q0(collection, iterable);
        j3h j3hVar2 = p4hVar != null ? p4hVar.h : null;
        Integer num6 = j3hVar2 != null ? j3hVar2.b : null;
        if (num6 != null && num6.intValue() == 0) {
            zz00Var = zz00.f45230a;
            a610Var = a610VarB1;
            arrayList3 = arrayListQ1;
        } else {
            a610Var = a610VarB1;
            if (num6 == null) {
                arrayList3 = arrayListQ1;
            } else {
                arrayList3 = arrayListQ1;
                if (num6.intValue() == 1) {
                    zz00Var = zz00.b;
                }
            }
            if (num6 != null && num6.intValue() == 2) {
                zz00Var = zz00.c;
            } else if (num6 != null && num6.intValue() == 3) {
                zz00Var = zz00.d;
            } else {
                zz00Var = (num6 != null && num6.intValue() == 4) ? zz00.e : zz00.f45230a;
            }
        }
        long jLongValue = (p4hVar == null || (j3hVar = p4hVar.h) == null || (l2 = j3hVar.f15832a) == null) ? 0L : l2.longValue();
        long jLongValue2 = (p4hVar == null || (l = p4hVar.i) == null) ? 0L : l.longValue();
        if (p4hVar == null || (t4hVar2 = p4hVar.f) == null) {
            listO = iun.f15405a;
        } else {
            Integer num7 = t4hVar2.i;
            listO = w9x.O(t4hVar2, num7 != null ? num7.intValue() : 0);
        }
        List list4 = listO;
        if (p4hVar == null || (t4hVar = p4hVar.g) == null) {
            listO2 = iun.f15405a;
        } else {
            Integer num8 = t4hVar.i;
            listO2 = w9x.O(t4hVar, num8 != null ? num8.intValue() : 0);
        }
        List list5 = listO2;
        if (p4hVar != null && (map = p4hVar.j) != null) {
            ArrayList arrayList4 = new ArrayList();
            Set setEntrySet = map.entrySet();
            if (setEntrySet != null) {
                Iterator it3 = setEntrySet.iterator();
                arrayList = arrayList;
                while (it3.hasNext()) {
                    arrayList4.addAll(CollectionsKt.A0(CollectionsKt.t0((Iterable) ((Map.Entry) it3.next()).getValue()), new wpv((byte) 28)));
                    it3 = it3;
                    arrayList = arrayList;
                }
            }
            ?? r211 = arrayList;
            ArrayList arrayList5 = new ArrayList(r3d.q(arrayList4, 10));
            Iterator it4 = arrayList4.iterator();
            ?? r6 = arrayList2;
            while (it4.hasNext()) {
                gls glsVar = (gls) it4.next();
                Iterator it5 = it4;
                Integer num9 = glsVar.f11509a;
                int iIntValue4 = num9 != null ? num9.intValue() : 0;
                ?? r212 = r6;
                a3h a3hVar = glsVar.b;
                if (a3hVar != null) {
                    switch (a3hVar) {
                        case a3h.UNKNOWN:
                            pz00Var = pz00.f27823a;
                            break;
                        case a3h.FIRST_EVENT:
                            pz00Var = pz00.b;
                            break;
                        case a3h.SECOND_EVENT:
                            pz00Var = pz00.c;
                            break;
                        case a3h.THIRD_EVENT:
                            pz00Var = pz00.d;
                            break;
                        case a3h.FOURTH_EVENT:
                            pz00Var = pz00.e;
                            break;
                        case a3h.FIFTH_EVENT:
                            pz00Var = pz00.f;
                            break;
                        case a3h.SIXTH_EVENT:
                            pz00Var = pz00.g;
                            break;
                        case a3h.SEVENTH_EVENT:
                            pz00Var = pz00.h;
                            break;
                        case a3h.EIGHTH_EVENT:
                            pz00Var = pz00.i;
                            break;
                        case a3h.NINTH_EVENT:
                            pz00Var = pz00.j;
                            break;
                        case a3h.TENTH_EVENT:
                            pz00Var = pz00.k;
                            break;
                        default:
                            t9f.b();
                            return null;
                    }
                } else {
                    pz00Var = pz00.f27823a;
                }
                zz00 zz00Var3 = zz00Var;
                d310 d310VarA0 = vdx.a0(glsVar.c);
                d3h d3hVar = glsVar.d;
                if (d3hVar != null) {
                    switch (d3hVar.ordinal()) {
                        case 0:
                            qz00Var = qz00.f29558a;
                            break;
                        case 1:
                            qz00Var = qz00.b;
                            break;
                        case 2:
                            qz00Var = qz00.c;
                            break;
                        case 3:
                            qz00Var = qz00.d;
                            break;
                        case 4:
                            qz00Var = qz00.e;
                            break;
                        case 5:
                            qz00Var = qz00.f;
                            break;
                        case 6:
                            qz00Var = qz00.g;
                            break;
                        case 7:
                            qz00Var = qz00.h;
                            break;
                        case 8:
                            qz00Var = qz00.i;
                            break;
                        case 9:
                            qz00Var = qz00.j;
                            break;
                        case 10:
                            qz00Var = qz00.k;
                            break;
                        case 11:
                            qz00Var = qz00.l;
                            break;
                        case 12:
                            qz00Var = qz00.m;
                            break;
                        case 13:
                            qz00Var = qz00.n;
                            break;
                        case 14:
                            qz00Var = qz00.o;
                            break;
                        case 15:
                            qz00Var = qz00.p;
                            break;
                        case 16:
                            qz00Var = qz00.q;
                            break;
                        case 17:
                            qz00Var = qz00.r;
                            break;
                        case 18:
                            qz00Var = qz00.s;
                            break;
                        case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                            qz00Var = qz00.t;
                            break;
                        case 20:
                            qz00Var = qz00.u;
                            break;
                        case 21:
                            qz00Var = qz00.v;
                            break;
                        case 22:
                            qz00Var = qz00.w;
                            break;
                        case 23:
                            qz00Var = qz00.x;
                            break;
                        case 24:
                            qz00Var = qz00.y;
                            break;
                        case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                            qz00Var = qz00.z;
                            break;
                        default:
                            t9f.b();
                            return null;
                    }
                } else {
                    qz00Var = qz00.f29558a;
                }
                arrayList5.add(new xz00(iIntValue4, pz00Var, d310VarA0, qz00Var));
                it4 = it5;
                r6 = r212;
                zz00Var = zz00Var3;
            }
            ?? r213 = r6;
            zz00Var2 = zz00Var;
            ArrayList arrayList6 = new ArrayList();
            for (Object obj : arrayList5) {
                xz00 xz00Var = (xz00) obj;
                if (xz00Var.d != qz00.f29558a && xz00Var.f41731a != 0) {
                    arrayList6.add(obj);
                }
            }
            listT0 = CollectionsKt.t0(arrayList6);
            r210 = r213;
            r29 = r211;
            r27 = r213;
            r28 = r211;
            if (listT0 == null) {
            }
            return new p310(new o310(jIntValue, jIntValue2, iIntValue, iIntValue2, iIntValue3, a610VarB0, a610Var, r29, r210, arrayListQ0, arrayList3, zz00Var2, jLongValue, jLongValue2, list4, list5, listT0), listL);
        }
        r28 = arrayList;
        r27 = arrayList2;
        zz00Var2 = zz00Var;
        listT0 = iun.f15405a;
        r210 = r27;
        r29 = r28;
        return new p310(new o310(jIntValue, jIntValue2, iIntValue, iIntValue2, iIntValue3, a610VarB0, a610Var, r29, r210, arrayListQ0, arrayList3, zz00Var2, jLongValue, jLongValue2, list4, list5, listT0), listL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [a.e4i] */
    /* JADX WARN: Type inference failed for: r37v1, types: [a.f2i] */
    /* JADX WARN: Type inference failed for: r5v9, types: [a.uxm] */
    public static final w56 T(y78 y78Var, d0t d0tVar, ctf0 ctf0Var, m5l0 m5l0Var, v5l0 v5l0Var, String str, String str2, List list, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        wxm wxmVar;
        w56 r56Var;
        wxm wxmVar2;
        d0tVar.getClass();
        f0t f0tVar = d0tVar.q;
        Date date = d0tVar.P;
        str.getClass();
        list.getClass();
        y78Var.getClass();
        v5l0Var.getClass();
        ctf0Var.getClass();
        str2.getClass();
        int iOrdinal = v5l0Var.ordinal();
        wxm uxmVar = txm.f34707a;
        vxm vxmVar = vxm.f38206a;
        if (iOrdinal != 0) {
            Object uxmVar2 = null;
            if (iOrdinal == 1) {
                long j = d0tVar.f5282a;
                j4i j4iVarU = w7n0.u(new y3d(StaticColors.INSTANCE.m113getRed0d7_KjU()), d0tVar, str, str2, list, z2, z3, kpb.b0(d0tVar, z), kpb.d0(d0tVar, z));
                String strC0 = qzb.c0(d0tVar);
                if (kpb.g0(d0tVar)) {
                    long jS0 = kpb.s0(d0tVar);
                    fgm fgmVar = fgm.f9498a;
                    uxmVar2 = new uxm(jS0, kpb.j0(d0tVar), date.getTime());
                }
                r56Var = new v56(j, j4iVarU, new d96(strC0, uxmVar2, kpb.H(d0tVar, y78Var, z5), qem.f28591a), jn8.a(d0tVar, v5l0Var, ctf0Var, m5l0Var));
            } else if (iOrdinal == 2) {
                long j2 = d0tVar.f5282a;
                k4i k4iVarT = w7n0.t(d0tVar, str, list, z2, z3, str2, kpb.b0(d0tVar, z), kpb.d0(d0tVar, z));
                boolean zA0 = kpb.a0(d0tVar, z, z4);
                boolean zF0 = kpb.f0(d0tVar, z);
                String strC1 = qzb.c0(d0tVar);
                String strH = kpb.H(d0tVar, y78Var, z5);
                if (zA0) {
                    uxmVar2 = c2i.f3624a;
                } else if (zF0) {
                    uxmVar2 = e2i.f7087a;
                }
                if (kpb.e0(d0tVar)) {
                    uxmVar = vxmVar;
                } else if (kpb.g0(d0tVar)) {
                    long jS1 = kpb.s0(d0tVar);
                    fgm fgmVar2 = fgm.f9498a;
                    uxmVar = new uxm(jS1, kpb.j0(d0tVar), date.getTime());
                }
                r56Var = new u56(j2, k4iVarT, new v86(strC1, strH, uxmVar, ctf0Var.b.a(R.string.live_new, Arrays.copyOf(new Object[0], 0)), uxmVar2), jn8.a(d0tVar, v5l0Var, ctf0Var, m5l0Var));
            } else if (iOrdinal == 3) {
                long j3 = d0tVar.f5282a;
                n0x n0xVar = new n0x(dtb.F(str));
                String strH2 = kpb.H(d0tVar, y78Var, z5);
                boolean zE0 = kpb.e0(d0tVar);
                String strA = ctf0Var.b.a(R.string.live_new, Arrays.copyOf(new Object[0], 0));
                boolean zB0 = kpb.b0(d0tVar, z);
                boolean zD0 = kpb.d0(d0tVar, z);
                boolean zA1 = kpb.a0(d0tVar, z, z4);
                if (kpb.g0(d0tVar)) {
                    long jS2 = kpb.s0(d0tVar);
                    fgm fgmVar3 = fgm.f9498a;
                    uxmVar2 = new e4i(8, jS2, date.getTime(), kpb.j0(d0tVar));
                }
                r56Var = new t56(j3, w7n0.s(uxmVar2, d0tVar, str, strH2, strA, str2, list, z2, z3, zE0, zB0, zD0, zA1, kpb.f0(d0tVar, z)), new n86(qzb.c0(d0tVar)), jn8.a(d0tVar, v5l0Var, ctf0Var, m5l0Var), n0xVar);
            } else {
                if (iOrdinal != 4) {
                    t9f.b();
                    return null;
                }
                long j4 = d0tVar.f5282a;
                k4i k4iVarR = w7n0.r(d0tVar, str, list, z2, z3, str2, kpb.b0(d0tVar, z), kpb.d0(d0tVar, z), kpb.a0(d0tVar, z, z4), kpb.f0(d0tVar, z));
                String strC2 = f0tVar.b.length() > 0 ? qzb.c0(d0tVar) : qzb.r0(d0tVar);
                String strH3 = kpb.H(d0tVar, y78Var, z5);
                if (kpb.e0(d0tVar)) {
                    wxmVar2 = vxmVar;
                } else {
                    if (kpb.g0(d0tVar)) {
                        long jS3 = kpb.s0(d0tVar);
                        fgm fgmVar4 = fgm.f9498a;
                        uxmVar = new uxm(jS3, kpb.j0(d0tVar), date.getTime());
                    }
                    wxmVar2 = uxmVar;
                }
                r56Var = new s56(j4, k4iVarR, new f86(strC2, strH3, wxmVar2, ctf0Var.b.a(R.string.live_new, Arrays.copyOf(new Object[0], 0))), jn8.a(d0tVar, v5l0Var, ctf0Var, m5l0Var));
            }
        } else {
            long j5 = d0tVar.f5282a;
            i4i i4iVarQ = w7n0.q(d0tVar, str, list, z2, z3, str2, kpb.b0(d0tVar, z), kpb.d0(d0tVar, z), kpb.a0(d0tVar, z, z4), kpb.f0(d0tVar, z));
            String strC3 = f0tVar.b.length() > 0 ? qzb.c0(d0tVar) : qzb.r0(d0tVar);
            String strH4 = kpb.H(d0tVar, y78Var, z5);
            if (kpb.e0(d0tVar)) {
                wxmVar = vxmVar;
            } else {
                if (kpb.g0(d0tVar)) {
                    long jS4 = kpb.s0(d0tVar);
                    fgm fgmVar5 = fgm.f9498a;
                    uxmVar = new uxm(jS4, kpb.j0(d0tVar), date.getTime());
                }
                wxmVar = uxmVar;
            }
            r56Var = new r56(j5, i4iVarQ, new x76(strC3, strH4, wxmVar), jn8.a(d0tVar, v5l0Var, ctf0Var, m5l0Var));
        }
        return r56Var;
    }

    public static final p5h0 U(zdx zdxVar) {
        if (zdxVar instanceof l3h0) {
            l3h0 l3h0Var = (l3h0) zdxVar;
            return new n5h0(l3h0Var.b, l3h0Var.c, false, false);
        }
        if (zdxVar.equals(m3h0.b)) {
            return o5h0.f24687a;
        }
        t9f.b();
        return null;
    }

    public static final dxh0 V(zvh0 zvh0Var) {
        int iOrdinal = zvh0Var.ordinal();
        if (iOrdinal == 0) {
            return axh0.f1625a;
        }
        if (iOrdinal == 1) {
            return zwh0.f45106a;
        }
        if (iOrdinal == 2) {
            return cxh0.f5122a;
        }
        if (iOrdinal == 3) {
            return bxh0.f3376a;
        }
        t9f.b();
        return null;
    }

    public static final int W(cl40 cl40Var) {
        int iOrdinal = cl40Var.ordinal();
        if (iOrdinal == 0) {
            return R.drawable.ic_glyph_cyber_color_side_blue;
        }
        if (iOrdinal == 1 || iOrdinal == 2) {
            return R.drawable.ic_glyph_cyber_color_side_red;
        }
        t9f.b();
        return 0;
    }

    public static final void a(mm40 mm40Var, v2n v2nVar, Function1 function1, fet fetVar, int i) {
        fet fetVar2;
        mm40 mm40Var2;
        pm80 pm80VarF;
        pm80 pm80Var;
        fetVar.g0(-1635923204);
        int i2 = i | 6 | (fetVar.g(v2nVar) ? 32 : 16) | (fetVar.i(function1) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarS = o7k0.s(o7k0.e(jm40Var, 128.0f), 84.0f);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarE = h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarS);
            boolean z = ((i2 & 112) == 32) | ((i2 & 896) == 256);
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new d8l0(function1, v2nVar, (byte) 0);
                fetVar.o0(objP);
            }
            mm40 mm40VarW = y860.W(mm40VarE, null, null, false, null, (Function0) objP, 28);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarW);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            o0x o0xVar = v2nVar.b;
            Integer num = v2nVar.d;
            Object objA = o0xVar.a();
            if (num == null) {
                fetVar.e0(-284816296);
                fetVar.r(false);
                pm80VarF = null;
            } else {
                fetVar.e0(-284816295);
                pm80VarF = a8k0.F(num.intValue(), 0, fetVar);
                fetVar.r(false);
            }
            if (num == null) {
                fetVar.e0(-284733960);
                fetVar.r(false);
                pm80Var = null;
            } else {
                fetVar.e0(-284733959);
                pm80 pm80VarF2 = a8k0.F(num.intValue(), 0, fetVar);
                fetVar.r(false);
                pm80Var = pm80VarF2;
            }
            k7x.b(objA, null, o7k0.s(o7k0.e(jm40Var, 128.0f), 84.0f), pm80VarF, pm80Var, null, null, null, null, null, gqw0.A, null, fetVar, 36912, 6, 27616);
            v8q0.a(v2nVar.c, jr8.f16991a.b(s5x0.N(jm40Var, 8.0f, 0.0f, 8.0f, 8.0f, 2), gqw0.g), ((StaticColors) fetVar.k(m8m0.f21378a)).m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, new y9q0(0L, qmk.q, null, j1t0.f15753a, 0L, null, 0, 0, qmk.D, 16646109), fetVar, 0, 24960, 110584);
            fetVar2 = fetVar;
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new e8l0(mm40Var2, v2nVar, function1, i, (byte) 0);
        }
    }

    public static final void b(mm40 mm40Var, jvy jvyVar, Function2 function2, fet fetVar, int i) {
        int i2;
        fet fetVar2 = fetVar;
        fetVar2.g0(14202901);
        if ((i & 6) == 0) {
            i2 = i | (fetVar2.g(mm40Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        int i3 = i2 | (fetVar2.g(jvyVar) ? 32 : 16) | (fetVar2.i(function2) ? 256 : 128);
        if (fetVar2.U(i3 & 1, (i3 & 147) != 146)) {
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                y3d y3dVar = new y3d(y3d.f);
                pz40 pz40Var = s6t0.f31722a;
                objP = q3d.j(y3dVar, new y3d(StaticColors.INSTANCE.m78getBlack800d7_KjU()));
                fetVar2.o0(objP);
            }
            List list = (List) objP;
            Object objP2 = fetVar2.P();
            if (objP2 == cl5Var) {
                objP2 = androidx.compose.runtime.e.e(null);
                fetVar2.o0(objP2);
            }
            pz40 pz40Var2 = (pz40) objP2;
            mm40 mm40VarO = ny9.O(1.5f, mm40Var, false);
            Object objP3 = fetVar2.P();
            if (objP3 == cl5Var) {
                objP3 = dw9.j(fetVar2);
            }
            gy40 gy40Var = (gy40) objP3;
            boolean z = ((i3 & 112) == 32) | ((i3 & 896) == 256);
            Object objP4 = fetVar2.P();
            if (z || objP4 == cl5Var) {
                objP4 = new g8l(function2, jvyVar, pz40Var2, (byte) 17);
                fetVar2.o0(objP4);
            }
            mm40 mm40VarW = y860.W(mm40VarO, gy40Var, null, false, null, (Function0) objP4, 28);
            zx7 zx7Var = gqw0.f11754a;
            tj30 tj30VarC = zq8.c(zx7Var, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarW);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z2 = fetVar2.S;
            pcy pcyVar = e7z.u1;
            if (z2) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar2, tj30VarC, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            n0x n0xVar = jvyVar.c;
            n0x n0xVar2 = jvyVar.d;
            m0x m0xVar = jvyVar.e;
            Object objP5 = fetVar2.P();
            if (objP5 == cl5Var) {
                objP5 = new y9v(pz40Var2, (byte) 8);
                fetVar2.o0(objP5);
            }
            y9a.f(n0xVar, n0xVar2, m0xVar, (Function1) objP5, jar0.d, fetVar2, 27648, 0);
            zx7 zx7Var2 = gqw0.h;
            jr8 jr8Var = jr8.f16991a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarB = jr8Var.b(jm40Var, zx7Var2);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarM = s5x0.M(i120.P(o7k0.d(o7k0.e(mm40VarB, 80.0f), 1.0f), yk5.n(list, 0.0f, 0.0f, 14), vgg0.c(0.0f, 0.0f, 24.0f, 24.0f, 3), 4), 16.0f, 6.0f, 16.0f, 16.0f);
            tj30 tj30VarC2 = zq8.c(zx7Var, false);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarM);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC2, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar4);
            mm40 mm40VarD = o7k0.d(jr8Var.b(jm40Var, zx7Var2), 1.0f);
            String str = jvyVar.b;
            long j = qmk.w;
            ((g1t0) fetVar2.k(j1t0.e)).getClass();
            v8q0.a(str, mm40VarD, ((StaticColors) fetVar2.k(m8m0.f21378a)).m123getWhite0d7_KjU(), null, j, null, null, null, 0L, null, 0L, 2, false, 2, 0, null, g1t0.p(), fetVar, 0, 24960, 110568);
            fetVar2 = fetVar;
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new l51((Object) mm40Var, (Object) jvyVar, (Object) function2, i, (byte) 9);
        }
    }

    public static final void c(mm40 mm40Var, w2n w2nVar, float f, Function1 function1, fet fetVar, int i) {
        fetVar.g0(1777547663);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= fetVar.g(w2nVar) ? 32 : 16;
        }
        int i3 = i2 | (fetVar.d(f) ? 256 : 128);
        if ((i & 3072) == 0) {
            i3 |= fetVar.i(function1) ? 2048 : 1024;
        }
        byte b = 1;
        if (fetVar.U(i3 & 1, (i3 & 1171) != 1170)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarD = o7k0.d(o7k0.e(mm40Var, 128.0f), 1.0f);
            lh80 lh80VarT = s5x0.t(f, 0.0f, 2);
            qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
            boolean z = ((i3 & 112) == 32) | ((i3 & 7168) == 2048);
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new u5l0(b, w2nVar, function1);
                fetVar.o0(objP);
            }
            b8k0.f(mm40VarD, null, lh80VarT, false, qw3Var, null, null, false, null, (Function1) objP, fetVar, 0, 490);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new c8l0(mm40Var, w2nVar, f, function1, i, (byte) 0);
        }
    }

    public static final void d(final mm40 mm40Var, float f, float f2, final float f3, ugd ugdVar, fet fetVar, final int i, final int i2) {
        int i3;
        final ugd ugdVar2;
        final float f4;
        fetVar.g0(-1411623456);
        int i4 = i | (fetVar.g(mm40Var) ? 4 : 2);
        int i5 = i2 & 2;
        if (i5 != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= fetVar.d(f) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 = i4 | 384;
        } else {
            i3 = i4 | (fetVar.d(f2) ? 256 : 128);
        }
        int i7 = i3 | (fetVar.d(f3) ? 2048 : 1024);
        if (fetVar.U(i7 & 1, (i7 & 9363) != 9362)) {
            if (i5 != 0) {
                f = 0.0f;
            }
            float f5 = i6 != 0 ? 1.0f : f2;
            mm40 mm40VarI = a8k0.I(mm40Var, f);
            boolean z = ((i7 & 7168) == 2048) | ((i7 & 896) == 256);
            Object objP = fetVar.P();
            byte b = 6;
            if (z || objP == ukd.f35823a) {
                objP = new ih10(f5, f3, b);
                fetVar.o0(objP);
            }
            mm40 mm40VarT = i4w0.T(mm40VarI, (Function1) objP);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarT);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            ugdVar2 = ugdVar;
            twn.v(6, ugdVar2, fetVar, true);
            f4 = f5;
        } else {
            ugdVar2 = ugdVar;
            fetVar.X();
            f4 = f2;
        }
        final float f6 = f;
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new Function2() { // from class: a.sig0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    gfx.d(mm40Var, f6, f4, f3, ugdVar2, (fet) obj, x8x.L(i | 1), i2);
                    return Unit.f46060a;
                }
            };
        }
    }

    public static final void e(mm40 mm40Var, kvy kvyVar, xdr xdrVar, fet fetVar, int i) {
        int i2;
        boolean z;
        ArrayList arrayList = kvyVar.f18977a;
        xdrVar.getClass();
        fetVar.g0(-1132494992);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(kvyVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(xdrVar) ? 256 : 128;
        }
        byte b = 0;
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            int size = arrayList.size();
            jm40 jm40Var = jm40.b;
            cl5 cl5Var = ukd.f35823a;
            if (size == 1) {
                fetVar.e0(413236471);
                rhv0 rhv0Var = (rhv0) fetVar.k(bmd.u);
                Object objP = fetVar.P();
                if (objP == cl5Var) {
                    float fB = bdl.b(((yez) rhv0Var).a());
                    zcl zclVar = qmk.f28987a;
                    if (ycl.a(fB, 448.0f) > 0) {
                        fB /= 2.0f;
                    }
                    objP = twn.j(fB, fetVar);
                }
                mm40 mm40VarW = o7k0.w(o7k0.s(jm40Var, ((ycl) objP).f42389a), null, false, 3);
                zcl zclVar2 = qmk.f28987a;
                mm40 mm40VarL = s5x0.L(mm40VarW, qmk.a(fetVar).c, 0.0f, 2);
                jvy jvyVar = (jvy) CollectionsKt.U(arrayList);
                boolean z2 = (i2 & 896) == 256;
                Object objP2 = fetVar.P();
                if (z2 || objP2 == cl5Var) {
                    objP2 = new cvy(xdrVar, b);
                    fetVar.o0(objP2);
                }
                b(mm40VarL, jvyVar, (Function2) objP2, fetVar, 0);
                fetVar.r(false);
                z = true;
            } else {
                fetVar.e0(414010479);
                zcl zclVar3 = qmk.f28987a;
                mm40 mm40VarD = o7k0.d(o7k0.e(jm40Var, 188.0f), 1.0f);
                lh80 lh80VarT = s5x0.t(qmk.a(fetVar).c, 0.0f, 2);
                qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
                boolean z3 = ((i2 & 896) == 256) | ((i2 & 112) == 32);
                Object objP3 = fetVar.P();
                if (z3 || objP3 == cl5Var) {
                    objP3 = new okw(kvyVar, xdrVar, (byte) 15);
                    fetVar.o0(objP3);
                }
                z = true;
                b8k0.f(mm40VarD, null, lh80VarT, false, qw3Var, null, null, false, null, (Function1) objP3, fetVar, 0, 490);
                fetVar.r(false);
            }
            fetVar.r(z);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new r3o((Object) mm40Var, (Object) kvyVar, (Object) xdrVar, i, (byte) 21);
        }
    }

    public static final void f(mm40 mm40Var, final pw20 pw20Var, Function1 function1, final Function1 function2, final Function1 function3, final Function1 function4, final Function1 function5, final Function1 function6, fet fetVar, int i) {
        int i2;
        fet fetVar2 = fetVar;
        function1.getClass();
        function2.getClass();
        function3.getClass();
        function4.getClass();
        function5.getClass();
        function6.getClass();
        fetVar2.g0(-212822153);
        if ((i & 6) == 0) {
            i2 = (fetVar2.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(pw20Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.i(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar2.i(function2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar2.i(function3) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= fetVar2.i(function4) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= fetVar2.i(function5) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= fetVar2.i(function6) ? 8388608 : 4194304;
        }
        if (fetVar2.U(i2 & 1, (4793491 & i2) != 4793490)) {
            mm40 mm40VarA = o7k0.A(o7k0.d(mm40Var, 1.0f), gqw0.n, 2);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarK = s5x0.K(o7k0.u(i120.Q(s5x0.L(mm40VarA, qmk.a(fetVar2).c, 0.0f, 2).e(new dyj0(vgg0.a(20.0f), new kjj0(20.0f, 60, ((StaticColors) fetVar2.k(m8m0.f21378a)).m71getBlack300d7_KjU(), 0L))), ((ThemeColors) fetVar2.k(zaq0.b)).getBackgroundContent(), vgg0.a(20.0f)), 0.0f, 512.0f, 1), qmk.a(fetVar2).d, 12.0f);
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarK);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            a4x a4xVar = pw20Var.f27691a.f43324a;
            boolean z = (i2 & 112) == 32;
            Object objP = fetVar2.P();
            if (z || objP == ukd.f35823a) {
                objP = new rx00(pw20Var, (byte) 20);
                fetVar2.o0(objP);
            }
            int i3 = (i2 << 12) & 3670016;
            final byte b = 0;
            ibc.n(null, a4xVar, gxh0.f12078a, cxh0.f5122a, false, (Function0) objP, function1, fetVar, i3, 17);
            x2x.i(null, pw20Var.b.f29980a.size(), 8.0f, p8a.e, u1c.M(928502498, new xdr() { // from class: a.k630
                @Override // a.xdr
                public final Object F(Object obj, Object obj2, Object obj3) {
                    byte b2 = b;
                    cl5 cl5Var = ukd.f35823a;
                    jm40 jm40Var = jm40.b;
                    Function1 function7 = function2;
                    pw20 pw20Var2 = pw20Var;
                    yhg0 yhg0Var = (yhg0) obj;
                    fet fetVar3 = (fet) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    switch (b2) {
                        case 0:
                            yhg0Var.getClass();
                            if ((iIntValue & 6) == 0) {
                                iIntValue |= fetVar3.g(yhg0Var) ? 4 : 2;
                            }
                            if (fetVar3.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                                int i4 = 0;
                                for (Object obj4 : pw20Var2.b.f29980a) {
                                    int i5 = i4 + 1;
                                    if (i4 < 0) {
                                        q3d.p();
                                        throw null;
                                    }
                                    cub0 cub0Var = (cub0) obj4;
                                    mm40 mm40VarA2 = yhg0Var.a(1.0f, jm40Var, true);
                                    boolean zG = fetVar3.g(function7) | fetVar3.e(i4);
                                    Object objP2 = fetVar3.P();
                                    if (zG || objP2 == cl5Var) {
                                        objP2 = new re1(function7, i4, (byte) 11);
                                        fetVar3.o0(objP2);
                                    }
                                    r7x.n(mm40VarA2, cub0Var, (Function0) objP2, fetVar3, 0);
                                    i4 = i5;
                                }
                            } else {
                                fetVar3.X();
                            }
                            return Unit.f46060a;
                        default:
                            yhg0Var.getClass();
                            if ((iIntValue & 6) == 0) {
                                iIntValue |= fetVar3.g(yhg0Var) ? 4 : 2;
                            }
                            if (fetVar3.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                                int i6 = 0;
                                for (Object obj5 : pw20Var2.f.f24682a) {
                                    int i7 = i6 + 1;
                                    if (i6 < 0) {
                                        q3d.p();
                                        throw null;
                                    }
                                    m4d m4dVar = (m4d) obj5;
                                    mm40 mm40VarA3 = yhg0Var.a(1.0f, jm40Var, true);
                                    boolean zG2 = fetVar3.g(function7) | fetVar3.e(i6);
                                    Object objP3 = fetVar3.P();
                                    if (zG2 || objP3 == cl5Var) {
                                        objP3 = new re1(function7, i6, (byte) 12);
                                        fetVar3.o0(objP3);
                                    }
                                    nia0.s(mm40VarA3, m4dVar, (Function0) objP3, fetVar3, 0);
                                    i6 = i7;
                                }
                            } else {
                                fetVar3.X();
                            }
                            return Unit.f46060a;
                    }
                }
            }, fetVar), fetVar, 27648);
            g8x.p(null, p8a.f, u1c.M(-1205931839, new Function2() { // from class: a.l630
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    byte b2 = b;
                    pw20 pw20Var2 = pw20Var;
                    switch (b2) {
                        case 0:
                            fet fetVar3 = (fet) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (fetVar3.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                                qcc.k(null, pw20Var2.c, function3, fetVar3, 0, 1);
                            } else {
                                fetVar3.X();
                            }
                            break;
                        case 1:
                            fet fetVar4 = (fet) obj;
                            int iIntValue2 = ((Integer) obj2).intValue();
                            if (fetVar4.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                qcc.k(null, pw20Var2.d, function3, fetVar4, 0, 1);
                            } else {
                                fetVar4.X();
                            }
                            break;
                        default:
                            fet fetVar5 = (fet) obj;
                            int iIntValue3 = ((Integer) obj2).intValue();
                            if (fetVar5.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                qcc.k(null, pw20Var2.e, function3, fetVar5, 0, 1);
                            } else {
                                fetVar5.X();
                            }
                            break;
                    }
                    return Unit.f46060a;
                }
            }, fetVar), fetVar, 432, 1);
            jm40 jm40Var = jm40.b;
            final byte b2 = 1;
            g8x.p(s5x0.N(jm40Var, 0.0f, 4.0f, 0.0f, 0.0f, 13), p8a.g, u1c.M(1532187754, new Function2() { // from class: a.l630
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    byte b3 = b2;
                    pw20 pw20Var2 = pw20Var;
                    switch (b3) {
                        case 0:
                            fet fetVar3 = (fet) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (fetVar3.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                                qcc.k(null, pw20Var2.c, function4, fetVar3, 0, 1);
                            } else {
                                fetVar3.X();
                            }
                            break;
                        case 1:
                            fet fetVar4 = (fet) obj;
                            int iIntValue2 = ((Integer) obj2).intValue();
                            if (fetVar4.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                qcc.k(null, pw20Var2.d, function4, fetVar4, 0, 1);
                            } else {
                                fetVar4.X();
                            }
                            break;
                        default:
                            fet fetVar5 = (fet) obj;
                            int iIntValue3 = ((Integer) obj2).intValue();
                            if (fetVar5.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                qcc.k(null, pw20Var2.e, function4, fetVar5, 0, 1);
                            } else {
                                fetVar5.X();
                            }
                            break;
                    }
                    return Unit.f46060a;
                }
            }, fetVar), fetVar, 432, 0);
            final byte b3 = 2;
            g8x.p(s5x0.N(jm40Var, 0.0f, 4.0f, 0.0f, 0.0f, 13), p8a.h, u1c.M(1290490441, new Function2() { // from class: a.l630
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    byte b4 = b3;
                    pw20 pw20Var2 = pw20Var;
                    switch (b4) {
                        case 0:
                            fet fetVar3 = (fet) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            if (fetVar3.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                                qcc.k(null, pw20Var2.c, function5, fetVar3, 0, 1);
                            } else {
                                fetVar3.X();
                            }
                            break;
                        case 1:
                            fet fetVar4 = (fet) obj;
                            int iIntValue2 = ((Integer) obj2).intValue();
                            if (fetVar4.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                qcc.k(null, pw20Var2.d, function5, fetVar4, 0, 1);
                            } else {
                                fetVar4.X();
                            }
                            break;
                        default:
                            fet fetVar5 = (fet) obj;
                            int iIntValue3 = ((Integer) obj2).intValue();
                            if (fetVar5.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                qcc.k(null, pw20Var2.e, function5, fetVar5, 0, 1);
                            } else {
                                fetVar5.X();
                            }
                            break;
                    }
                    return Unit.f46060a;
                }
            }, fetVar), fetVar, 432, 0);
            x2x.i(null, pw20Var.f.f24682a.size(), 8.0f, p8a.i, u1c.M(-270781877, new xdr() { // from class: a.k630
                @Override // a.xdr
                public final Object F(Object obj, Object obj2, Object obj3) {
                    byte b4 = b2;
                    cl5 cl5Var = ukd.f35823a;
                    jm40 jm40Var2 = jm40.b;
                    Function1 function7 = function6;
                    pw20 pw20Var2 = pw20Var;
                    yhg0 yhg0Var = (yhg0) obj;
                    fet fetVar3 = (fet) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    switch (b4) {
                        case 0:
                            yhg0Var.getClass();
                            if ((iIntValue & 6) == 0) {
                                iIntValue |= fetVar3.g(yhg0Var) ? 4 : 2;
                            }
                            if (fetVar3.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                                int i4 = 0;
                                for (Object obj4 : pw20Var2.b.f29980a) {
                                    int i5 = i4 + 1;
                                    if (i4 < 0) {
                                        q3d.p();
                                        throw null;
                                    }
                                    cub0 cub0Var = (cub0) obj4;
                                    mm40 mm40VarA2 = yhg0Var.a(1.0f, jm40Var2, true);
                                    boolean zG = fetVar3.g(function7) | fetVar3.e(i4);
                                    Object objP2 = fetVar3.P();
                                    if (zG || objP2 == cl5Var) {
                                        objP2 = new re1(function7, i4, (byte) 11);
                                        fetVar3.o0(objP2);
                                    }
                                    r7x.n(mm40VarA2, cub0Var, (Function0) objP2, fetVar3, 0);
                                    i4 = i5;
                                }
                            } else {
                                fetVar3.X();
                            }
                            return Unit.f46060a;
                        default:
                            yhg0Var.getClass();
                            if ((iIntValue & 6) == 0) {
                                iIntValue |= fetVar3.g(yhg0Var) ? 4 : 2;
                            }
                            if (fetVar3.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                                int i6 = 0;
                                for (Object obj5 : pw20Var2.f.f24682a) {
                                    int i7 = i6 + 1;
                                    if (i6 < 0) {
                                        q3d.p();
                                        throw null;
                                    }
                                    m4d m4dVar = (m4d) obj5;
                                    mm40 mm40VarA3 = yhg0Var.a(1.0f, jm40Var2, true);
                                    boolean zG2 = fetVar3.g(function7) | fetVar3.e(i6);
                                    Object objP3 = fetVar3.P();
                                    if (zG2 || objP3 == cl5Var) {
                                        objP3 = new re1(function7, i6, (byte) 12);
                                        fetVar3.o0(objP3);
                                    }
                                    nia0.s(mm40VarA3, m4dVar, (Function0) objP3, fetVar3, 0);
                                    i6 = i7;
                                }
                            } else {
                                fetVar3.X();
                            }
                            return Unit.f46060a;
                    }
                }
            }, fetVar), fetVar, 27648);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ff4(mm40Var, pw20Var, function1, function2, function3, function4, function5, function6, i);
        }
    }

    public static final void g(int i, fet fetVar, mm40 mm40Var, Function0 function0, boolean z) {
        int i2;
        mm40 mm40Var2;
        function0.getClass();
        fetVar.g0(1690878815);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function0) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            mm40Var2 = mm40Var;
            dww.c(iom0.r(jpm0.t(R.drawable.ic_glyph_more_vertically, 6, fetVar), fetVar), null, o2e.e0(y860.W(epv0.N(mm40Var2, z ? 1.0f : 0.5f), null, null, z, null, function0, 24), "MENU_ICON"), obc.O(R.color.static_white, fetVar), fetVar, 56, 0);
        } else {
            mm40Var2 = mm40Var;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ed(mm40Var2, z, function0, i, (byte) 9);
        }
    }

    public static final void h(int i, fet fetVar, boolean z) {
        int i2;
        fet fetVar2;
        yfe0 yfe0VarU;
        fb50 fb50Var;
        fetVar.g0(-215652236);
        byte b = 4;
        if ((i & 6) == 0) {
            i2 = (fetVar.h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        byte b2 = 0;
        byte b3 = 1;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            if (((ja50) fetVar.k(ka50.f17948a)) == null) {
                yfe0VarU = fetVar.u();
                if (yfe0VarU == null) {
                    return;
                } else {
                    fb50Var = new fb50(b2, i, z);
                }
            } else {
                ba50 ba50Var = (ba50) fetVar.k(ca50.f3992a);
                int i3 = i2 & 14;
                boolean z2 = i3 == 4;
                Object objP = fetVar.P();
                cl5 cl5Var = ukd.f35823a;
                Object obj = objP;
                if (z2 || objP == cl5Var) {
                    Boolean boolValueOf = Boolean.valueOf(((db50) ba50Var.f2242a.getValue()).f5786a);
                    fetVar.o0(boolValueOf);
                    obj = boolValueOf;
                }
                Boolean bool = (Boolean) obj;
                boolean zBooleanValue = bool.booleanValue();
                Boolean boolValueOf2 = Boolean.valueOf(z);
                int i4 = (fetVar.g(ba50Var) ? 1 : 0) | (i3 == 4 ? (byte) 1 : (byte) 0) | (fetVar.h(zBooleanValue) ? 1 : 0);
                Object objP2 = fetVar.P();
                Object obj2 = objP2;
                if (i4 != 0 || objP2 == cl5Var) {
                    cj cjVar = new cj(b, ba50Var, z, zBooleanValue);
                    fetVar.o0(cjVar);
                    obj2 = cjVar;
                }
                fetVar2 = fetVar;
                s0x.g(i3, fetVar2, null, boolValueOf2, bool, ba50Var, (Function1) obj2);
            }
            yfe0VarU.d = fb50Var;
        }
        fetVar2 = fetVar;
        fetVar2.X();
        yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            fb50Var = new fb50(b3, i, z);
            yfe0VarU.d = fb50Var;
        }
    }

    public static final void i(String str, j43 j43Var, fet fetVar, int i) {
        byte b;
        boolean z;
        j43 j43Var2 = j43Var;
        fet fetVar2 = fetVar;
        fetVar2.g0(1469225423);
        int i2 = i | (fetVar2.g(str) ? 4 : 2) | (fetVar2.g(j43Var2) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            zcl zclVar = qmk.f28987a;
            thg0 thg0VarA = shg0.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.k, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarD);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            long jT = idm0.t(8);
            zfn zfnVar = j1t0.e;
            ((g1t0) fetVar2.k(zfnVar)).getClass();
            n05 n05Var = new n05(jT, g1t0.g().f42262a.b, idm0.t(1));
            ((g1t0) fetVar2.k(zfnVar)).getClass();
            v8q0.a(str, null, 0L, n05Var, 0L, null, null, null, 0L, null, 0L, 0, false, 1, 0, null, ibm0.n(g1t0.g(), fetVar2), fetVar, i2 & 14, 24576, 114678);
            j43Var2 = j43Var;
            fetVar2 = fetVar;
            if (j43Var2.d) {
                fetVar2.e0(1507830067);
                mm40 mm40VarP = o7k0.p(jm40Var, 72.0f, 18.0f);
                zcl zclVar2 = qmk.m;
                ugg0 ugg0Var = vgg0.f37379a;
                z = true;
                b = 0;
                h97.s(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarP), vbc.d0(null, fetVar2, 0, 1), fetVar2, false);
            } else {
                z = true;
                b = 0;
                fetVar2.e0(1508117096);
                plc.d(null, j43Var2, new fxe(), fetVar2, i2 & 112, 1);
                fetVar2.r(false);
            }
            fetVar2.r(z);
        } else {
            b = 0;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new m680(str, j43Var2, i, b);
        }
    }

    public static final void j(mm40 mm40Var, j680 j680Var, fet fetVar, int i) {
        j680Var.getClass();
        fetVar.g0(224768112);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.g(j680Var) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarL = s5x0.L(mm40Var, 0.0f, 2.0f, 1);
            x5d x5dVarA = w5d.a(new qw3(2.0f, true, new jf4((byte) 14)), gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarL);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            i(rsm0.w(R.string.edit_coupon_maximum_coef, 0, fetVar), j680Var.f15972a, fetVar, 0);
            i(rsm0.w(R.string.edit_coupon_optional_coef, 0, fetVar), j680Var.b, fetVar, 0);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new jt50(mm40Var, j680Var, i, (byte) 25);
        }
    }

    public static final void k(mm40 mm40Var, efa0 efa0Var, boolean z, fet fetVar, int i) {
        mm40 mm40Var2;
        fetVar.g0(804293194);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? fetVar.g(efa0Var) : fetVar.i(efa0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.h(z) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarL = s5x0.L(jm40Var, 8.0f, 0.0f, 2);
            thg0 thg0VarA = shg0.a(z ? uc9.g : uc9.e, gqw0.j, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarL);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            int i3 = ((i2 << 3) & 7168) | 390;
            s(efa0Var.f7713a, gqw0.m, z, fetVar, i3);
            u(efa0Var, fetVar, (i2 >> 3) & 14);
            s(efa0Var.b, gqw0.o, z, fetVar, i3);
            fetVar.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new yzx((Object) mm40Var2, (Object) efa0Var, z, i, (byte) 7);
        }
    }

    public static final void l(mm40 mm40Var, frc0 frc0Var, Function1 function1, Function1 function2, fet fetVar, int i) {
        mm40 mm40Var2;
        pcy pcyVar;
        pcy pcyVar2;
        int i2;
        jm40 jm40Var;
        boolean z;
        Function1 function3 = function2;
        fet fetVar2 = fetVar;
        frc0Var.getClass();
        function1.getClass();
        function3.getClass();
        fetVar2.g0(938021827);
        int i3 = i | 6 | (fetVar2.g(frc0Var) ? 32 : 16) | (fetVar2.i(function1) ? 256 : 128) | (fetVar2.i(function3) ? 2048 : 1024);
        if (fetVar2.U(i3 & 1, (i3 & 1171) != 1170)) {
            jm40 jm40Var2 = jm40.b;
            mm40 mm40VarD = o7k0.d(jm40Var2, 1.0f);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarN = s5x0.N(mm40VarD, 8.0f, 12.0f, 8.0f, 0.0f, 8);
            pz40 pz40Var = s6t0.f31722a;
            long backgroundContent = s6t0.b().f33626a.getBackgroundContent();
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarE0 = o2e.e0(i120.Q(mm40VarN, backgroundContent, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), "PROMO_CODE_PURCHASE_COLUMN");
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarE0);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z2 = fetVar2.S;
            pcy pcyVar3 = e7z.u1;
            if (z2) {
                fetVar2.l(pcyVar3);
            } else {
                fetVar2.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar2, x5dVarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            v8q0.a(rsm0.w(R.string.player_info_purchase, 0, fetVar2), o2e.e0(s5x0.N(jm40Var2, 16.0f, 16.0f, 16.0f, 0.0f, 8), "PROMO_CODE_PURCHASE_TEXT"), s6t0.b().f33626a.getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.m(), fetVar, 0, 0, 131064);
            mm40 mm40VarN2 = s5x0.N(o7k0.d(jm40Var2, 1.0f), 16.0f, 16.0f, 16.0f, 0.0f, 8);
            nw3 nw3Var = uc9.g;
            yx7 yx7Var = gqw0.k;
            thg0 thg0VarA = shg0.a(nw3Var, yx7Var, fetVar, 54);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarN2);
            fetVar.i0();
            if (fetVar.S) {
                pcyVar = pcyVar3;
                fetVar.l(pcyVar);
            } else {
                pcyVar = pcyVar3;
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            pcy pcyVar4 = pcyVar;
            v8q0.a(rsm0.w(R.string.promo_bonus_title, 0, fetVar), jm40Var2, s6t0.b().f33626a.getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.n(), fetVar, 48, 0, 131064);
            v8q0.a(frc0Var.e, o2e.e0(jm40Var2, "PROMO_CODE_PURCHASE_BALANCE"), s6t0.b().f33626a.getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.v(), fetVar, 48, 0, 131064);
            fetVar.r(true);
            mm40 mm40VarN3 = s5x0.N(o7k0.d(jm40Var2, 1.0f), 16.0f, 16.0f, 16.0f, 0.0f, 8);
            thg0 thg0VarA2 = shg0.a(nw3Var, yx7Var, fetVar, 54);
            int iHashCode3 = Long.hashCode(fetVar.T);
            bh90 bh90VarM3 = fetVar.m();
            mm40 mm40VarC2 = kbc.c0(fetVar, mm40VarN3);
            fetVar.i0();
            if (fetVar.S) {
                pcyVar2 = pcyVar4;
                fetVar.l(pcyVar2);
            } else {
                pcyVar2 = pcyVar4;
                fetVar.r0();
            }
            jpm0.o(fetVar, thg0VarA2, shdVar);
            jpm0.o(fetVar, bh90VarM3, shdVar2);
            vqd.u(iHashCode3, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC2, shdVar4);
            pcy pcyVar5 = pcyVar2;
            v8q0.a(frc0Var.c, jm40Var2, s6t0.b().f33626a.getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.n(), fetVar, 48, 0, 131064);
            fetVar2 = fetVar;
            v(null, frc0Var, function1, fetVar2, i3 & 1008);
            fetVar2.r(true);
            if (frc0Var.i.length() > 0) {
                fetVar2.e0(-1770012749);
                mm40 mm40VarN4 = s5x0.N(o7k0.d(jm40Var2, 1.0f), 16.0f, 16.0f, 16.0f, 0.0f, 8);
                thg0 thg0VarA3 = shg0.a(nw3Var, yx7Var, fetVar2, 54);
                int iHashCode4 = Long.hashCode(fetVar2.T);
                bh90 bh90VarM4 = fetVar2.m();
                mm40 mm40VarC3 = kbc.c0(fetVar2, mm40VarN4);
                fetVar2.i0();
                if (fetVar2.S) {
                    fetVar2.l(pcyVar5);
                } else {
                    fetVar2.r0();
                }
                jpm0.o(fetVar2, thg0VarA3, shdVar);
                jpm0.o(fetVar2, bh90VarM4, shdVar2);
                vqd.u(iHashCode4, fetVar2, shdVar3, fetVar2);
                jpm0.o(fetVar2, mm40VarC3, shdVar4);
                i2 = i3;
                v8q0.a(rsm0.w(R.string.promo_count_of_fs, 0, fetVar2), jm40Var2, s6t0.b().f33626a.getSecondary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.n(), fetVar2, 48, 0, 131064);
                jm40Var = jm40Var2;
                v8q0.a(frc0Var.i, o2e.e0(jm40Var, "PROMO_CODE_FREESPIN_BALANCE"), s6t0.b().f33626a.getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, g1t0.v(), fetVar, 48, 0, 131064);
                fetVar2 = fetVar;
                fetVar2.r(true);
                z = false;
                fetVar2.r(false);
            } else {
                i2 = i3;
                jm40Var = jm40Var2;
                z = false;
                fetVar2.e0(-1769149771);
                fetVar2.r(false);
            }
            mm40 mm40VarE1 = o2e.e0(s5x0.J(o7k0.d(jm40Var, 1.0f), 16.0f), "PROMO_SHOP_DETAIL_BUY_BUTTON");
            wul wulVar = frc0Var.f;
            if ((i2 & 7168) == 2048) {
                z = true;
            }
            Object objP = fetVar2.P();
            if (z || objP == ukd.f35823a) {
                function3 = function2;
                objP = new bac0(function3, (byte) 8);
                fetVar2.o0(objP);
            } else {
                function3 = function2;
            }
            qzb.n(mm40VarE1, wulVar, (Function0) objP, fetVar2, 0, 0);
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dfc0((byte) 0, i, (Object) mm40Var2, (Object) frc0Var, (Object) function1, (Object) function3);
        }
    }

    public static final void m(mm40 mm40Var, boolean z, boolean z2, Function0 function0, fet fetVar, int i) {
        mm40 mm40Var2;
        int i2;
        function0.getClass();
        fetVar.g0(-1327221473);
        if ((i & 6) == 0) {
            mm40Var2 = mm40Var;
            i2 = (fetVar.g(mm40Var2) ? 4 : 2) | i;
        } else {
            mm40Var2 = mm40Var;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.h(z2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(function0) ? 2048 : 1024;
        }
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            dww.c(z2 ? iom0.r(jpm0.t(R.drawable.ic_glyph_quick_bet_active, 6, fetVar), fetVar) : iom0.r(jpm0.t(R.drawable.ic_glyph_quick_bet_inactive, 6, fetVar), fetVar), null, epv0.N(y860.W(mm40Var2, null, null, z, null, function0, 24), z ? 1.0f : 0.5f), ((ThemeColors) fetVar.k(zaq0.b)).getSecondary(), fetVar, 56, 0);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new and0(mm40Var, z, z2, function0, i, (byte) 2);
        }
    }

    public static final void n(mig0 mig0Var, nkg0 nkg0Var, fet fetVar, int i) {
        float f;
        fet fetVar2 = fetVar;
        mig0Var.getClass();
        fetVar2.g0(1645790170);
        int i2 = (fetVar2.g(mig0Var) ? 4 : 2) | i | (fetVar2.g(nkg0Var) ? 32 : 16);
        byte b = 0;
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            if (mig0Var.g) {
                fetVar2.e0(-1611510108);
                fetVar2.r(false);
                f = 0.0f;
            } else {
                fetVar2.e0(1056394755);
                f = -pkd.b(nkg0Var.k, fetVar2);
                fetVar2.r(false);
            }
            l7m0 l7m0VarB = d43.b(f, mig0Var.j ? new jfk0() : ro4.m0(500, 0, null, 6), null, null, fetVar, 0, 28);
            fetVar2 = fetVar;
            float f2 = nkg0Var.d;
            float f3 = nkg0Var.j;
            float f4 = nkg0Var.e;
            float f5 = nkg0Var.c;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarP = o7k0.p(jm40Var, f2, f5);
            zx7 zx7Var = gqw0.f11754a;
            tj30 tj30VarC = zq8.c(zx7Var, false);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarP);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, tj30VarC, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            jr8 jr8Var = jr8.f16991a;
            mm40 mm40VarB = jr8Var.b(jm40Var, zx7Var);
            zcl zclVar = qmk.f28987a;
            xvw.p(ffb0.Q(mm40VarB, f3, 12.0f), mig0Var.d, f4, fetVar2, 0);
            zx7 zx7Var2 = gqw0.c;
            xvw.p(ffb0.Q(jr8Var.b(jm40Var, zx7Var2), -f3, 12.0f), mig0Var.e, f4, fetVar2, 0);
            zx7 zx7Var3 = gqw0.h;
            mm40 mm40VarB2 = jr8Var.b(jm40Var, zx7Var3);
            boolean zG = fetVar2.g(l7m0VarB);
            Object objP = fetVar2.P();
            if (zG || objP == ukd.f35823a) {
                objP = new ufp(l7m0VarB, (byte) 22);
                fetVar2.o0(objP);
            }
            xvw.p(ffb0.R(i4w0.T(mm40VarB2, (Function1) objP), 0.0f, -12.0f, 1), mig0Var.f, f4, fetVar2, 0);
            d(s5x0.N(jm40Var, nkg0Var.i, 0.0f, 0.0f, 0.0f, 14), 150.0f, -1.0f, nkg0Var.g, u1c.M(-1326048957, new rig0(mig0Var, nkg0Var, b), fetVar2), fetVar2, 24624, 0);
            d(s5x0.N(jr8Var.b(jm40Var, zx7Var2), 0.0f, 0.0f, nkg0Var.i, 0.0f, 11), 210.0f, 0.0f, nkg0Var.g, u1c.M(1136850362, new rig0(mig0Var, nkg0Var, (byte) 1), fetVar2), fetVar2, 24624, 4);
            d(jr8Var.b(jm40Var, zx7Var3), 0.0f, 0.0f, nkg0Var.h, u1c.M(-1903334917, new rig0(mig0Var, nkg0Var, (byte) 2), fetVar2), fetVar2, 24576, 6);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new rig0(mig0Var, nkg0Var, i, (byte) 3);
        }
    }

    public static final void o(Function1 function1, wgj0 wgj0Var, mm40 mm40Var, fet fetVar, int i) {
        function1.getClass();
        wgj0Var.getClass();
        fetVar.g0(-227899664);
        int i2 = i | (fetVar.i(function1) ? 4 : 2) | (fetVar.g(wgj0Var) ? 32 : 16) | (fetVar.g(mm40Var) ? 256 : 128);
        byte b = 0;
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = uhj0.f35682a;
                fetVar.o0(objP);
            }
            xdr xdrVar = (xdr) ((jhy) objP);
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = new thj0(b);
                fetVar.o0(objP2);
            }
            Function1 function2 = (Function1) objP2;
            int i3 = ((i2 & 112) == 32 ? (byte) 1 : (byte) 0) | ((i2 & 14) == 4 ? (byte) 1 : (byte) 0);
            Object objP3 = fetVar.P();
            byte b2 = 3;
            if (i3 != 0 || objP3 == cl5Var) {
                objP3 = new pb(wgj0Var, function1, b2);
                fetVar.o0(objP3);
            }
            y860.g(xdrVar, mm40Var, function2, null, (Function1) objP3, fetVar, ((i2 >> 3) & 112) | 390, 8);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new fzi0(function1, (hej0) wgj0Var, mm40Var, i, (byte) 9);
        }
    }

    public static final void p(mm40 mm40Var, float f, fet fetVar, int i) {
        fetVar.g0(1083677567);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= fetVar.d(f) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            lh80 lh80VarT = s5x0.t(f, 0.0f, 2);
            zcl zclVar = qmk.f28987a;
            qw3 qw3Var = new qw3(8.0f, true, new jf4((byte) 14));
            Object objP = fetVar.P();
            if (objP == ukd.f35823a) {
                objP = new ejk0((byte) 29);
                fetVar.o0(objP);
            }
            b8k0.f(mm40VarD, null, lh80VarT, false, qw3Var, null, null, false, null, (Function1) objP, fetVar, 805306368, 490);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new d0i(mm40Var, f, i, (byte) 2);
        }
    }

    public static final void q(int i, fet fetVar, mm40 mm40Var) {
        fetVar.g0(146020892);
        int i2 = i | 6;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarS = o7k0.s(o7k0.e(jm40Var, 128.0f), 84.0f);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarC0 = xbc.c0(h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarS), vbc.d0(null, fetVar, 0, 1));
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarC0);
            mkd.c0.getClass();
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(e7z.u1);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC1, gqw0.v);
            fetVar.r(true);
            mm40Var = jm40Var;
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new eqj0(mm40Var, i, (byte) 19);
        }
    }

    public static final void r(mm40 mm40Var, chk0 chk0Var, Function1 function1, fet fetVar, int i) {
        int i2;
        dn8 dn8VarH;
        mm40 mm40VarT;
        fet fetVar2 = fetVar;
        zgk0 zgk0Var = chk0Var.c;
        function1.getClass();
        fetVar2.g0(-357516194);
        if ((i & 6) == 0) {
            i2 = (fetVar2.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(chk0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.i(function1) ? 256 : 128;
        }
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            zfn zfnVar = zaq0.b;
            long primary = ((ThemeColors) fetVar2.k(zfnVar)).getPrimary();
            long warning = ((ThemeColors) fetVar2.k(zfnVar)).getWarning();
            boolean zE = fetVar2.e(zgk0Var.ordinal());
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (zE || objP == cl5Var) {
                int iOrdinal = zgk0Var.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal == 1) {
                        zcl zclVar = qmk.f28987a;
                        dn8VarH = j120.h(1.0f, warning);
                    } else {
                        if (iOrdinal != 2) {
                            t9f.b();
                            return;
                        }
                        dn8VarH = null;
                    }
                    objP = dn8VarH;
                } else {
                    zcl zclVar2 = qmk.f28987a;
                    objP = j120.h(2.0f, primary);
                }
                fetVar2.o0(objP);
            }
            dn8 dn8Var = (dn8) objP;
            zcl zclVar3 = qmk.f28987a;
            mm40 mm40VarN = o7k0.n(mm40Var, 56.0f);
            jm40 jm40Var = jm40.b;
            if (dn8Var != null) {
                zcl zclVar4 = qmk.g;
                ugg0 ugg0Var = vgg0.f37379a;
                mm40VarT = i120.T(jm40Var, dn8Var.f6356a, dn8Var.b, new ugg0(zclVar4, zclVar4, zclVar4, zclVar4));
            } else {
                mm40VarT = jm40Var;
            }
            mm40 mm40VarE = mm40VarN.e(mm40VarT);
            long backgroundGroup = ((ThemeColors) fetVar2.k(zfnVar)).getBackgroundGroup();
            zcl zclVar5 = qmk.g;
            ugg0 ugg0Var2 = vgg0.f37379a;
            mm40 mm40VarQ = i120.Q(mm40VarE, backgroundGroup, new ugg0(zclVar5, zclVar5, zclVar5, zclVar5));
            Object objP2 = fetVar2.P();
            if (objP2 == cl5Var) {
                objP2 = dw9.j(fetVar2);
            }
            gy40 gy40Var = (gy40) objP2;
            boolean z = ((i2 & 896) == 256) | ((i2 & 112) == 32);
            Object objP3 = fetVar2.P();
            if (z || objP3 == cl5Var) {
                objP3 = new o0k0((Object) function1, (Object) chk0Var, (byte) 6);
                fetVar2.o0(objP3);
            }
            mm40 mm40VarK = s5x0.K(y860.W(mm40VarQ, gy40Var, null, false, null, (Function0) objP3, 28), 2.0f, 8.0f);
            x5d x5dVarA = w5d.a(uc9.e, gqw0.n, fetVar2, 54);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarK);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            dww.c(a8k0.F(chk0Var.b, 0, fetVar2), null, o7k0.n(jm40Var, 20.0f), y3d.g, fetVar2, 3128, 0);
            mm40 mm40VarN2 = s5x0.N(jm40Var, 0.0f, 4.0f, 0.0f, 0.0f, 13);
            String str = chk0Var.d;
            ((g1t0) fetVar2.k(j1t0.e)).getClass();
            v8q0.a(str, mm40VarN2, ((ThemeColors) fetVar2.k(zfnVar)).getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, g1t0.e(), fetVar, 0, 24960, 110584);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wbg0((Object) mm40Var, (Object) chk0Var, (Object) function1, i, (byte) 22);
        }
    }

    public static final void s(dfa0 dfa0Var, xx7 xx7Var, boolean z, fet fetVar, int i) {
        int i2;
        mm40 mm40VarS;
        fetVar.g0(1754490209);
        int i3 = i & 6;
        zhg0 zhg0Var = zhg0.f44392a;
        if (i3 == 0) {
            i2 = (fetVar.g(zhg0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? fetVar.g(dfa0Var) : fetVar.i(dfa0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.g(xx7Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.h(z) ? 2048 : 1024;
        }
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            String str = dfa0Var.f5991a;
            if (StringsKt.W(str)) {
                str = null;
            }
            k1x k1xVar = new k1x((Context) fetVar.k(dy2.b));
            k1xVar.c = str;
            lls0[] lls0VarArr = {new mrs0()};
            kuo kuoVar = q1x.f27974a;
            q1x.b(k1xVar, tx3.g0(lls0VarArr));
            o1x o1xVarA = k1xVar.a();
            pge pgeVar = gqw0.f1;
            mz3 mz3VarX = l7x.X(o1xVarA, null, pgeVar, fetVar, 3072, 22);
            long jM123getWhite0d7_KjU = StaticColors.INSTANCE.m123getWhite0d7_KjU();
            jm40 jm40Var = jm40.b;
            if (z) {
                zcl zclVar = qmk.f28987a;
                mm40VarS = o7k0.A(o7k0.e(jm40Var, 144.0f), xx7Var, 2);
            } else {
                zcl zclVar2 = qmk.f28987a;
                mm40VarS = o7k0.s(o7k0.e(s5x0.N(jm40Var, 0.0f, 0.0f, 0.0f, 12.0f, 7), 106.0f), 78.0f);
            }
            yx7 yx7Var = gqw0.l;
            mm40 mm40VarA = zhg0Var.a(1.0f, zhg0Var.b(yx7Var, mm40VarS), true);
            mm40 mm40VarB = zhg0Var.b(yx7Var, jm40Var);
            lgb.u(mm40VarA, zhg0Var.a(1.0f, z ? o7k0.n(o7k0.A(s5x0.N(mm40VarB, 12.0f, 0.0f, 12.0f, 26.0f, 2), xx7Var, 2), 74.0f) : o7k0.n(o7k0.y(o7k0.e(s5x0.N(mm40VarB, 0.0f, 0.0f, 0.0f, 12.0f, 7), 106.0f), gqw0.e, 2), 40.0f), true), mz3VarX, jM123getWhite0d7_KjU, pgeVar, fetVar, 196608);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new yzx((Object) dfa0Var, (Object) xx7Var, z, i, (byte) 8);
        }
    }

    public static final void t(a4x a4xVar, int i, float f, fet fetVar, int i2) {
        fet fetVar2 = fetVar;
        fetVar2.g0(-1389086142);
        int i3 = i2 | (fetVar2.g(a4xVar) ? 32 : 16) | (fetVar2.e(i) ? 256 : 128) | (fetVar2.d(f) ? 2048 : 1024);
        boolean z = false;
        boolean z2 = true;
        if (fetVar2.U(i3 & 1, (i3 & 1171) != 1170)) {
            jm40 jm40Var = jm40.b;
            mm40 mm40VarL = twn.l(gqw0.k, o7k0.s(jm40Var, f));
            zcl zclVar = qmk.f28987a;
            byte b = 14;
            x5d x5dVarA = w5d.a(new qw3(4.0f, true, new jf4(b)), gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarL);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, x5dVarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            Iterator itO = h97.o(fetVar2, mm40VarC0, gqw0.v, 716796863, a4xVar);
            while (itO.hasNext()) {
                ffa0 ffa0Var = (ffa0) itO.next();
                v8q0.a(ffa0Var.f9440a, o2e.e0(o7k0.d(jm40Var, 1.0f), "StatisticValueText"), ffa0Var.b, null, 0L, null, null, null, 0L, new f2q0(i), 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.p, null, j1t0.f15753a, 0L, null, 0, 0, qmk.C, 16646109), fetVar, 48, ((i3 >> 6) & b) | 24960, 109560);
                z2 = true;
                z = z;
                fetVar2 = fetVar;
                i3 = i3;
                b = b;
                jm40Var = jm40Var;
            }
            fetVar2.r(z);
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new d0i(f, i, i2, a4xVar);
        }
    }

    public static final void u(efa0 efa0Var, fet fetVar, int i) {
        int i2;
        efa0 efa0Var2;
        fet fetVar2 = fetVar;
        fetVar2.g0(1889695571);
        if ((i & 6) == 0) {
            i2 = i | ((i & 8) == 0 ? fetVar2.g(efa0Var) : fetVar2.i(efa0Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (fetVar2.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE0 = o2e.e0(o7k0.s(o7k0.c(s5x0.K(jm40Var, 10.0f, 12.0f), 1.0f), 168.0f), "StatisticValueTableTestTag");
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarE0);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z = fetVar2.S;
            pcy pcyVar = e7z.u1;
            if (z) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar2, x5dVarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            v8q0.a(efa0Var.d, o2e.e0(o7k0.d(jm40Var, 1.0f), "StatisticHeader"), StaticColors.INSTANCE.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(3), 0L, 2, false, 1, 0, null, new y9q0(0L, qmk.p, null, j1t0.b, 0L, null, 0, 0, qmk.C, 16646109), fetVar, 48, 24960, 109560);
            fetVar2 = fetVar;
            mm40 mm40VarE1 = o2e.e0(o7k0.e(s5x0.N(jm40Var, 0.0f, 4.0f, 0.0f, 0.0f, 13), 106.0f), "RowStatistic");
            thg0 thg0VarA = shg0.a(new qw3(24.0f, true, new jf4((byte) 14)), gqw0.k, fetVar2, 48);
            int iHashCode2 = Long.hashCode(fetVar2.T);
            bh90 bh90VarM2 = fetVar2.m();
            mm40 mm40VarC1 = kbc.c0(fetVar2, mm40VarE1);
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA, shdVar);
            jpm0.o(fetVar2, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar2, shdVar3, fetVar2);
            jpm0.o(fetVar2, mm40VarC1, shdVar4);
            efa0Var2 = efa0Var;
            t(efa0Var2.f7713a.b, 6, 34.0f, fetVar2, 6);
            t(efa0Var2.c, 3, 52.0f, fetVar2, 6);
            t(efa0Var2.b.b, 5, 34.0f, fetVar2, 6);
            fetVar2.r(true);
            fetVar2.r(true);
        } else {
            efa0Var2 = efa0Var;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new nb50(efa0Var2, i, (byte) 7);
        }
    }

    public static final void v(mm40 mm40Var, frc0 frc0Var, Function1 function1, fet fetVar, int i) {
        mm40 mm40Var2;
        Function1 function2 = function1;
        fet fetVar2 = fetVar;
        fetVar2.g0(534214428);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(frc0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar2.i(function2) ? 256 : 128;
        }
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarE = o7k0.e(o7k0.s(jm40Var, 150.0f), 36.0f);
            pz40 pz40Var = s6t0.f31722a;
            long backgroundLight60 = s6t0.b().f33626a.getBackgroundLight60();
            zcl zclVar2 = qmk.g;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarE0 = o2e.e0(i120.Q(mm40VarE, backgroundLight60, new ugg0(zclVar2, zclVar2, zclVar2, zclVar2)), "PROMO_CODE_PURCHASE_STEPPER");
            thg0 thg0VarA = shg0.a(uc9.g, gqw0.k, fetVar2, 54);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarE0);
            mkd.c0.getClass();
            fetVar2.i0();
            if (fetVar2.S) {
                fetVar2.l(e7z.u1);
            } else {
                fetVar2.r0();
            }
            jpm0.o(fetVar2, thg0VarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            mm40 mm40VarE1 = o2e.e0(s5x0.N(jm40Var, 2.0f, 0.0f, 0.0f, 0.0f, 14), "PROMO_CODE_PURCHASE_STEPPER_MINUS_BUTTON");
            wul wulVar = frc0Var.h;
            int i3 = i2 & 896;
            boolean z = i3 == 256;
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (z || objP == cl5Var) {
                objP = new bac0(function2, (byte) 9);
                fetVar2.o0(objP);
            }
            qzb.n(mm40VarE1, wulVar, (Function0) objP, fetVar2, 0, 0);
            v8q0.a(frc0Var.d, o2e.e0(jm40Var, "PROMO_CODE_PURCHASE_STEPPER_COUNTER_TEXT"), s6t0.b().f33626a.getTextPrimary(), null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, new y9q0(0L, qmk.t, null, j1t0.b, 0L, null, 0, 0, idm0.t(22), 16646109), fetVar, 48, 0, 131064);
            fetVar2 = fetVar;
            mm40 mm40VarE2 = o2e.e0(s5x0.N(jm40Var, 0.0f, 0.0f, 2.0f, 0.0f, 11), "PROMO_CODE_PURCHASE_STEPPER_PLUS_BUTTON");
            wul wulVar2 = frc0Var.g;
            boolean z2 = i3 == 256;
            Object objP2 = fetVar2.P();
            if (z2 || objP2 == cl5Var) {
                function2 = function1;
                objP2 = new bac0(function2, (byte) 10);
                fetVar2.o0(objP2);
            } else {
                function2 = function1;
            }
            qzb.n(mm40VarE2, wulVar2, (Function0) objP2, fetVar2, 0, 0);
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new la70(mm40Var2, frc0Var, function2, i, (byte) 22);
        }
    }

    public static final void w(wdp0 wdp0Var, mm40 mm40Var, l7m0 l7m0Var, Function2 function2, fet fetVar, int i) {
        l7m0Var.getClass();
        fetVar.g0(1804787126);
        int i2 = (fetVar.g(wdp0Var) ? 4 : 2) | i | 48 | (fetVar.g(l7m0Var) ? 256 : 128) | (fetVar.i(function2) ? 2048 : 1024);
        if (fetVar.U(i2 & 1, (i2 & 1171) != 1170)) {
            Object[] objArr = new Object[0];
            boolean z = (i2 & 896) == 256;
            Object objP = fetVar.P();
            if (z || objP == ukd.f35823a) {
                objP = new f7f0(l7m0Var, (byte) 22);
                fetVar.o0(objP);
            }
            obc.d(ggp0.d.a(v3c.Y(objArr, (Function0) objP, fetVar).getValue()), u1c.M(368456310, new a5k0(wdp0Var, function2), fetVar), fetVar, 56);
            mm40Var = jm40.b;
        } else {
            fetVar.X();
        }
        mm40 mm40Var2 = mm40Var;
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new stl0((byte) 2, i, wdp0Var, mm40Var2, l7m0Var, function2);
        }
    }

    public static void x(ukn0 ukn0Var, Object[] objArr) {
        if (objArr == null) {
            return;
        }
        int length = objArr.length;
        int i = 0;
        while (i < length) {
            Object obj = objArr[i];
            i++;
            if (obj == null) {
                ukn0Var.s(i);
            } else if (obj instanceof byte[]) {
                ukn0Var.i((byte[]) obj, i);
            } else if (obj instanceof Float) {
                ukn0Var.p(((Number) obj).floatValue(), i);
            } else if (obj instanceof Double) {
                ukn0Var.p(((Number) obj).doubleValue(), i);
            } else if (obj instanceof Long) {
                ukn0Var.o(i, ((Number) obj).longValue());
            } else if (obj instanceof Integer) {
                ukn0Var.o(i, ((Number) obj).intValue());
            } else if (obj instanceof Short) {
                ukn0Var.o(i, ((Number) obj).shortValue());
            } else if (obj instanceof Byte) {
                ukn0Var.o(i, ((Number) obj).byteValue());
            } else if (obj instanceof String) {
                ukn0Var.r0(i, (String) obj);
            } else {
                if (!(obj instanceof Boolean)) {
                    throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i + " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
                }
                ukn0Var.o(i, ((Boolean) obj).booleanValue() ? 1L : 0L);
            }
        }
    }

    public static final bsv y(int i, int i2, String str, dam0 dam0Var, ctf0 ctf0Var) {
        String strL;
        str.getClass();
        dam0Var.getClass();
        ctf0Var.getClass();
        int i3 = i - i2;
        int iOrdinal = dam0Var.ordinal();
        if (iOrdinal == 0) {
            lsm0 lsm0Var = ctf0Var.b;
            strL = kng0.l(lsm0Var.a(R.string.blocks_v2, Arrays.copyOf(new Object[]{str}, 1)), Separators.SP, lsm0Var.a(R.string.line_and_live, Arrays.copyOf(new Object[0], 0)));
        } else {
            if (iOrdinal != 1) {
                t9f.b();
                return null;
            }
            strL = ctf0Var.b.a(R.string.blocks_v2, Arrays.copyOf(new Object[]{str}, 1));
        }
        return new bsv(strL, ctf0Var.b.a(R.string.hidden_blocks_v2, Arrays.copyOf(new Object[]{Integer.valueOf(i3), Integer.valueOf(i)}, 2)));
    }

    public static final ArrayList z(StatisticBlocksParams statisticBlocksParams, List list, ctf0 ctf0Var) {
        statisticBlocksParams.getClass();
        list.getClass();
        ctf0Var.getClass();
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            StatisticBlockModel statisticBlockModel = (StatisticBlockModel) it.next();
            t9m0 t9m0Var = statisticBlockModel.f46623a;
            arrayList.add(new iam0(t9m0Var, H(statisticBlocksParams.f46624a, t9m0Var, ctf0Var), statisticBlockModel.c, statisticBlocksParams.g.contains(Integer.valueOf(statisticBlockModel.f46623a.f33572a))));
        }
        return arrayList;
    }
}
