package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.ServiceLoader;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes6.dex */
public final class t55 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f33352a;
    public static final t55 b = new t55(0);
    public static final t55 c = new t55(1);
    public static final t55 d = new t55(2);
    public static final t55 e = new t55(3);
    public static final t55 f = new t55(4);
    public static final t55 g = new t55(5);
    public static final t55 h = new t55(6);
    public static final t55 i = new t55(7);
    public static final t55 j = new t55(8);
    public static final t55 k = new t55(9);
    public static final t55 l = new t55(10);
    public static final t55 m = new t55(11);
    public static final t55 n = new t55(12);
    public static final t55 o = new t55(13);
    public static final t55 p = new t55(14);
    public static final t55 q = new t55(15);
    public static final t55 r = new t55(16);
    public static final t55 s = new t55(17);
    public static final t55 t = new t55(18);
    public static final t55 u = new t55(19);
    public static final t55 v = new t55(20);
    public static final t55 w = new t55(21);
    public static final t55 x = new t55(22);
    public static final t55 y = new t55(23);
    public static final t55 z = new t55(24);
    public static final t55 A = new t55(25);
    public static final t55 B = new t55(26);
    public static final t55 Y = new t55(27);
    public static final t55 Z = new t55(28);
    public static final t55 f1 = new t55(29);

    public /* synthetic */ t55(byte b2) {
        this.f33352a = b2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws IllegalAccessException {
        aek aekVar;
        aek aekVar2;
        int i2 = 0;
        switch (this.f33352a) {
            case 0:
                return new y3d(fbc.d(1308617531));
            case 1:
                bd9 bd9Var = bd9.f2387a;
                ServiceLoader serviceLoaderLoad = ServiceLoader.load(cd9.class, cd9.class.getClassLoader());
                serviceLoaderLoad.getClass();
                cd9 cd9Var = (cd9) CollectionsKt.V(serviceLoaderLoad);
                if (cd9Var != null) {
                    return cd9Var;
                }
                jf4.n("No BuiltInsLoader implementation was found. Please ensure that the META-INF/services/ is not stripped from your application and that the Java virtual machine is not running under a security manager");
                return null;
            case 2:
                return new y3d(y3d.b);
            case 3:
                ftj ftjVar = new ftj(new eu00("DefaultBuiltIns"));
                ftjVar.c();
                return ftjVar;
            case 4:
                iiy[] iiyVarArr = hdk.j;
                Class cls = Void.TYPE;
                cls.getClass();
                return cls;
            case 5:
                bek bekVar = cek.c;
                Field[] fields = cek.class.getFields();
                fields.getClass();
                ArrayList<Field> arrayList = new ArrayList();
                int length = fields.length;
                while (i2 < length) {
                    Field field = fields[i2];
                    if (Modifier.isStatic(field.getModifiers())) {
                        arrayList.add(field);
                    }
                    i2++;
                }
                ArrayList arrayList2 = new ArrayList();
                for (Field field2 : arrayList) {
                    Object obj = field2.get(null);
                    cek cekVar = obj instanceof cek ? (cek) obj : null;
                    if (cekVar != null) {
                        int i3 = cekVar.b;
                        String name = field2.getName();
                        name.getClass();
                        aekVar = new aek(i3, name);
                    } else {
                        aekVar = null;
                    }
                    if (aekVar != null) {
                        arrayList2.add(aekVar);
                    }
                }
                return arrayList2;
            case 6:
                bek bekVar2 = cek.c;
                Field[] fields2 = cek.class.getFields();
                fields2.getClass();
                ArrayList arrayList3 = new ArrayList();
                int length2 = fields2.length;
                while (i2 < length2) {
                    Field field3 = fields2[i2];
                    if (Modifier.isStatic(field3.getModifiers())) {
                        arrayList3.add(field3);
                    }
                    i2++;
                }
                ArrayList<Field> arrayList4 = new ArrayList();
                for (Object obj2 : arrayList3) {
                    if (Intrinsics.d(((Field) obj2).getType(), Integer.TYPE)) {
                        arrayList4.add(obj2);
                    }
                }
                ArrayList arrayList5 = new ArrayList();
                for (Field field4 : arrayList4) {
                    Object obj3 = field4.get(null);
                    obj3.getClass();
                    int iIntValue = ((Integer) obj3).intValue();
                    if (iIntValue == ((-iIntValue) & iIntValue)) {
                        String name2 = field4.getName();
                        name2.getClass();
                        aekVar2 = new aek(iIntValue, name2);
                    } else {
                        aekVar2 = null;
                    }
                    if (aekVar2 != null) {
                        arrayList5.add(aekVar2);
                    }
                }
                return arrayList5;
            case 7:
                int i4 = dfk.h;
                return iun.f15405a;
            case 8:
                Set set = jfk.b;
                return iun.f15405a;
            case 9:
                pz40 pz40Var = s6t0.f31722a;
                return new y3d(s6t0.b().f33626a.getCommerce());
            case 10:
                pz40 pz40Var2 = s6t0.f31722a;
                return new y3d(StaticColors.INSTANCE.m123getWhite0d7_KjU());
            case 11:
                pz40 pz40Var3 = s6t0.f31722a;
                return new y3d(s6t0.b().f33626a.getSecondary20());
            case 12:
                pz40 pz40Var4 = s6t0.f31722a;
                return new y3d(s6t0.b().f33626a.getSecondary40());
            case 13:
                pz40 pz40Var5 = s6t0.f31722a;
                return new y3d(s6t0.b().f33626a.getPrimary());
            case 14:
                pz40 pz40Var6 = s6t0.f31722a;
                return new y3d(StaticColors.INSTANCE.m123getWhite0d7_KjU());
            case 15:
                pz40 pz40Var7 = s6t0.f31722a;
                return new y3d(s6t0.b().f33626a.getSecondary20());
            case 16:
                pz40 pz40Var8 = s6t0.f31722a;
                return new y3d(s6t0.b().f33626a.getSecondary40());
            case 17:
                pz40 pz40Var9 = s6t0.f31722a;
                return new y3d(s6t0.b().f33626a.getBackgroundContent());
            case 18:
                pz40 pz40Var10 = s6t0.f31722a;
                return new y3d(s6t0.b().f33626a.getPrimary());
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                pz40 pz40Var11 = s6t0.f31722a;
                return new y3d(s6t0.b().f33626a.getSecondary10());
            case 20:
                pz40 pz40Var12 = s6t0.f31722a;
                return new y3d(s6t0.b().f33626a.getSecondary20());
            case 21:
                pz40 pz40Var13 = s6t0.f31722a;
                return new y3d(s6t0.b().f33626a.getSecondaryButtonBackground());
            case 22:
                pz40 pz40Var14 = s6t0.f31722a;
                return new y3d(s6t0.b().f33626a.getSecondaryButtonForeground());
            case 23:
                pz40 pz40Var15 = s6t0.f31722a;
                return new y3d(s6t0.b().f33626a.getSecondary10());
            case 24:
                pz40 pz40Var16 = s6t0.f31722a;
                return new y3d(s6t0.b().f33626a.getSecondary20());
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                pz40 pz40Var17 = s6t0.f31722a;
                return new y3d(StaticColors.INSTANCE.m126getWhite200d7_KjU());
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                pz40 pz40Var18 = s6t0.f31722a;
                return new y3d(StaticColors.INSTANCE.m123getWhite0d7_KjU());
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                pz40 pz40Var19 = s6t0.f31722a;
                return new y3d(StaticColors.INSTANCE.m125getWhite100d7_KjU());
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                pz40 pz40Var20 = s6t0.f31722a;
                return new y3d(StaticColors.INSTANCE.m129getWhite400d7_KjU());
            default:
                pz40 pz40Var21 = s6t0.f31722a;
                return new y3d(StaticColors.INSTANCE.m121getTransparent0d7_KjU());
        }
    }
}
