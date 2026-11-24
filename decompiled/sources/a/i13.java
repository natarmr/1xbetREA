package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import org.xplatform.uikit.components.chips.Chip;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes2.dex */
public final class i13 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f13976a;
    public static final i13 b = new i13(0);
    public static final i13 c = new i13(1);
    public static final i13 d = new i13(2);
    public static final i13 e = new i13(3);
    public static final i13 f = new i13(4);
    public static final i13 g = new i13(5);
    public static final i13 h = new i13(6);
    public static final i13 i = new i13(7);
    public static final i13 j = new i13(8);
    public static final i13 k = new i13(9);
    public static final i13 l = new i13(10);
    public static final i13 m = new i13(11);
    public static final i13 n = new i13(12);
    public static final i13 o = new i13(13);
    public static final i13 p = new i13(14);
    public static final i13 q = new i13(15);
    public static final i13 r = new i13(16);
    public static final i13 s = new i13(17);
    public static final i13 t = new i13(18);
    public static final i13 u = new i13(19);
    public static final i13 v = new i13(20);
    public static final i13 w = new i13(21);
    public static final i13 x = new i13(22);
    public static final i13 y = new i13(23);
    public static final i13 z = new i13(24);
    public static final i13 A = new i13(25);
    public static final i13 B = new i13(26);
    public static final i13 Y = new i13(27);
    public static final i13 Z = new i13(28);
    public static final i13 f1 = new i13(29);

    public /* synthetic */ i13(byte b2) {
        this.f13976a = b2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String string;
        long jM109getOverlayBackground400d7_KjU;
        Class<?> declaringClass;
        boolean z2 = false;
        byte b2 = 1;
        switch (this.f13976a) {
            case 0:
                return Unit.f46060a;
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                if (value instanceof boolean[]) {
                    string = Arrays.toString((boolean[]) value);
                    string.getClass();
                } else if (value instanceof char[]) {
                    string = Arrays.toString((char[]) value);
                    string.getClass();
                } else if (value instanceof byte[]) {
                    string = Arrays.toString((byte[]) value);
                    string.getClass();
                } else if (value instanceof short[]) {
                    string = Arrays.toString((short[]) value);
                    string.getClass();
                } else if (value instanceof int[]) {
                    string = Arrays.toString((int[]) value);
                    string.getClass();
                } else if (value instanceof float[]) {
                    string = Arrays.toString((float[]) value);
                    string.getClass();
                } else if (value instanceof long[]) {
                    string = Arrays.toString((long[]) value);
                    string.getClass();
                } else if (value instanceof double[]) {
                    string = Arrays.toString((double[]) value);
                    string.getClass();
                } else if (value instanceof Object[]) {
                    string = Arrays.toString((Object[]) value);
                    string.getClass();
                } else {
                    string = value.toString();
                }
                return str + '=' + string;
            case 2:
                pf4 pf4Var = (pf4) obj;
                pf4Var.getClass();
                if (pf4Var.q) {
                    pz40 pz40Var = s6t0.f31722a;
                    jM109getOverlayBackground400d7_KjU = StaticColors.INSTANCE.m121getTransparent0d7_KjU();
                } else {
                    pz40 pz40Var2 = s6t0.f31722a;
                    jM109getOverlayBackground400d7_KjU = StaticColors.INSTANCE.m109getOverlayBackground400d7_KjU();
                }
                return new y3d(jM109getOverlayBackground400d7_KjU);
            case 3:
                ((bem) obj).getClass();
                return Unit.f46060a;
            case 4:
                g7z g7zVar = (g7z) obj;
                g7zVar.getClass();
                g7zVar.a();
                pz40 pz40Var3 = s6t0.f31722a;
                StaticColors staticColors = StaticColors.INSTANCE;
                fhl.r(g7zVar, yk5.n(q3d.j(new y3d(staticColors.m70getBlack200d7_KjU()), new y3d(staticColors.m70getBlack200d7_KjU()), new y3d(staticColors.m75getBlack600d7_KjU())), 0.0f, 0.0f, 14), 0L, 0L, 0.0f, null, null, 0, 126);
                return Unit.f46060a;
            case 5:
                mp9 mp9Var = (mp9) obj;
                int i2 = kd9.l;
                mp9Var.getClass();
                return Boolean.valueOf(CollectionsKt.L(jxk0.f, m7x.x(mp9Var)));
            case 6:
                mp9 mp9Var2 = (mp9) obj;
                int i3 = kd9.l;
                mp9Var2.getClass();
                if ((mp9Var2 instanceof mer) && CollectionsKt.L(jxk0.f, m7x.x(mp9Var2))) {
                    z2 = true;
                }
                return Boolean.valueOf(z2);
            case 7:
                Class cls = (Class) obj;
                c5k c5kVar = ck9.f4494a;
                cls.getClass();
                return new xgy(cls);
            case 8:
                Class cls2 = (Class) obj;
                c5k c5kVar2 = ck9.f4494a;
                cls2.getClass();
                return new zhy(cls2);
            case 9:
                Class cls3 = (Class) obj;
                c5k c5kVar3 = ck9.f4494a;
                cls3.getClass();
                xgy xgyVarA = ck9.a(cls3);
                iun iunVar = iun.f15405a;
                return x2x.P(xgyVarA, iunVar, false, iunVar, 8);
            case 10:
                Class cls4 = (Class) obj;
                c5k c5kVar4 = ck9.f4494a;
                cls4.getClass();
                xgy xgyVarA2 = ck9.a(cls4);
                iun iunVar2 = iun.f15405a;
                return x2x.P(xgyVarA2, iunVar2, true, iunVar2, 8);
            case 11:
                c5k c5kVar5 = ck9.f4494a;
                ((Class) obj).getClass();
                return new ConcurrentHashMap();
            case 12:
                sgy sgyVar = (sgy) obj;
                sgyVar.getClass();
                if (!sgyVar.i() || (declaringClass = azw.G(sgyVar).getDeclaringClass()) == null) {
                    return null;
                }
                return sre0.f32672a.b(declaringClass);
            case 13:
                sgy sgyVar2 = (sgy) obj;
                sgyVar2.getClass();
                return sgyVar2.getTypeParameters();
            case 14:
                tft0 tft0Var = (tft0) obj;
                tft0Var.getClass();
                return Boolean.valueOf(tft0Var.S() instanceof baa);
            case 15:
                ((mer) obj).getClass();
                return null;
            case 16:
                ((mer) obj).getClass();
                return null;
            case 17:
                ((mer) obj).getClass();
                return null;
            case 18:
                return Boolean.valueOf(obj instanceof Chip);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return Boolean.valueOf(obj instanceof Chip);
            case 20:
                ((jgc) obj).getClass();
                return "ChooseLanguageRoute";
            case 21:
                jgc jgcVar = (jgc) obj;
                jgcVar.getClass();
                return jtt0.w(jgcVar);
            case 22:
                mp9 mp9Var3 = (mp9) obj;
                mp9Var3.getClass();
                return Boolean.valueOf(lmc.L(mp9Var3));
            case 23:
                g93 g93Var = (g93) obj;
                g93Var.getClass();
                return new sx3(g93Var, b2);
            case 24:
                jhy jhyVar = (jhy) obj;
                jhyVar.getClass();
                return "  - " + jhyVar + " (" + uvw.z(jhyVar) + ')';
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                TypeVariable typeVariable = (TypeVariable) obj;
                typeVariable.getClass();
                Type[] bounds = typeVariable.getBounds();
                bounds.getClass();
                Object objA = tx3.A(bounds);
                if (objA instanceof TypeVariable) {
                    return (TypeVariable) objA;
                }
                return null;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                Class cls5 = (Class) obj;
                cls5.getClass();
                if (Modifier.isStatic(cls5.getModifiers())) {
                    return null;
                }
                return cls5.getDeclaringClass();
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                Class cls6 = (Class) obj;
                cls6.getClass();
                TypeVariable[] typeParameters = cls6.getTypeParameters();
                typeParameters.getClass();
                return tx3.t(typeParameters);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ParameterizedType parameterizedType = (ParameterizedType) obj;
                parameterizedType.getClass();
                Type ownerType = parameterizedType.getOwnerType();
                if (ownerType instanceof ParameterizedType) {
                    return (ParameterizedType) ownerType;
                }
                return null;
            default:
                ParameterizedType parameterizedType2 = (ParameterizedType) obj;
                parameterizedType2.getClass();
                Type[] actualTypeArguments = parameterizedType2.getActualTypeArguments();
                actualTypeArguments.getClass();
                return tx3.g0(actualTypeArguments);
        }
    }
}
