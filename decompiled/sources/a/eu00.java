package a;

import android.gov.nist.core.Separators;
import com.appsflyer.sdk_base.referrer.Payload;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes2.dex */
public class eu00 {
    public static final String d;
    public static final wt00 e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jyj0 f8395a;
    public final jtv b;
    public final String c;

    static {
        String canonicalName = eu00.class.getCanonicalName();
        canonicalName.getClass();
        int iY = StringsKt.Y(0, canonicalName, 6, Separators.DOT);
        d = iY == -1 ? "" : canonicalName.substring(0, iY);
        e = new wt00("NO_LOCKS", m2a.l);
    }

    public eu00(String str) {
        this(str, new rrc(new ReentrantLock(), (byte) 18));
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0065  */
    public static /* synthetic */ void a(int i) {
        String str = (i == 10 || i == 13 || i == 20 || i == 37) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 10 || i == 13 || i == 20 || i == 37) ? 2 : 3];
        if (i == 1 || i == 3 || i == 5) {
            objArr[0] = "exceptionHandlingStrategy";
        } else if (i != 6) {
            switch (i) {
                case 8:
                    objArr[0] = "exceptionHandlingStrategy";
                    break;
                case 9:
                case 11:
                case 14:
                case 16:
                case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                case 21:
                    objArr[0] = "compute";
                    break;
                case 10:
                case 13:
                case 20:
                case 37:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager";
                    break;
                case 12:
                case 17:
                case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                    objArr[0] = "onRecursiveCall";
                    break;
                case 15:
                case 18:
                case 22:
                    objArr[0] = "map";
                    break;
                case 23:
                case 24:
                case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
                case AvailableCode.CURRENT_SHOWING_SERVICE_UNAVAILABLE /* 31 */:
                case 32:
                case 34:
                    objArr[0] = "computable";
                    break;
                case AvailableCode.HMS_IS_SPOOF /* 29 */:
                case 33:
                    objArr[0] = "postCompute";
                    break;
                case 35:
                    objArr[0] = Payload.SOURCE;
                    break;
                case 36:
                    objArr[0] = "throwable";
                    break;
                default:
                    objArr[0] = "debugText";
                    break;
            }
        } else {
            objArr[0] = "lock";
        }
        if (i == 10 || i == 13) {
            objArr[1] = "createMemoizedFunction";
        } else if (i == 20) {
            objArr[1] = "createMemoizedFunctionWithNullableValues";
        } else if (i != 37) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager";
        } else {
            objArr[1] = "sanitizeStackTrace";
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
                objArr[2] = "<init>";
                break;
            case 7:
            case 8:
                objArr[2] = "replaceExceptionHandling";
                break;
            case 9:
            case 11:
            case 12:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                objArr[2] = "createMemoizedFunction";
                break;
            case 10:
            case 13:
            case 20:
            case 37:
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
            case 21:
            case 22:
                objArr[2] = "createMemoizedFunctionWithNullableValues";
                break;
            case 23:
            case 24:
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                objArr[2] = "createLazyValue";
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                objArr[2] = "createRecursionTolerantLazyValue";
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
            case AvailableCode.HMS_IS_SPOOF /* 29 */:
                objArr[2] = "createLazyValueWithPostCompute";
                break;
            case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
                objArr[2] = "createNullableLazyValue";
                break;
            case AvailableCode.CURRENT_SHOWING_SERVICE_UNAVAILABLE /* 31 */:
                objArr[2] = "createRecursionTolerantNullableLazyValue";
                break;
            case 32:
            case 33:
                objArr[2] = "createNullableLazyValueWithPostCompute";
                break;
            case 34:
                objArr[2] = "compute";
                break;
            case 35:
                objArr[2] = "recursionDetectedDefault";
                break;
            case 36:
                objArr[2] = "sanitizeStackTrace";
                break;
            default:
                objArr[2] = "createWithExceptionHandling";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 10 && i != 13 && i != 20 && i != 37) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static void f(AssertionError assertionError) {
        StackTraceElement[] stackTrace = assertionError.getStackTrace();
        int length = stackTrace.length;
        int i = 0;
        while (i < length) {
            if (!stackTrace[i].getClassName().startsWith(d)) {
                List listSubList = Arrays.asList(stackTrace).subList(i, length);
                assertionError.setStackTrace((StackTraceElement[]) listSubList.toArray(new StackTraceElement[listSubList.size()]));
            }
            i++;
        }
        i = -1;
        List listSubList2 = Arrays.asList(stackTrace).subList(i, length);
        assertionError.setStackTrace((StackTraceElement[]) listSubList2.toArray(new StackTraceElement[listSubList2.size()]));
    }

    public final cu00 b(Function0 function0) {
        return new cu00(this, function0);
    }

    public final zt00 c(Function1 function1) {
        return new zt00(this, new ConcurrentHashMap(3, 1.0f, 2), function1, (byte) 1);
    }

    public final xg d(Function1 function1) {
        return new xg((Object) this, (Object) new ConcurrentHashMap(3, 1.0f, 2), (Object) function1, (byte) 8);
    }

    public s88 e(Object obj, String str) {
        String str2;
        StringBuilder sbT = brm0.t("Recursion detected ", str);
        if (obj == null) {
            str2 = "";
        } else {
            str2 = "on input: " + obj;
        }
        sbT.append(str2);
        sbT.append(" under ");
        sbT.append(this);
        AssertionError assertionError = new AssertionError(sbT.toString());
        f(assertionError);
        throw assertionError;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(getClass().getSimpleName());
        sb.append(Separators.AT);
        sb.append(Integer.toHexString(hashCode()));
        sb.append(" (");
        return axq.n(sb, this.c, Separators.RPAREN);
    }

    public eu00(String str, jyj0 jyj0Var) {
        jtv jtvVar = jtv.o;
        this.f8395a = jyj0Var;
        this.b = jtvVar;
        this.c = str;
    }
}
