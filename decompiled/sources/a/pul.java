package a;

import java.util.List;
import java.util.ServiceLoader;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes2.dex */
public final class pul implements Function0 {
    public static final pul b = new pul(0);
    public static final pul c = new pul(1);
    public static final pul d = new pul(2);
    public static final pul e = new pul(3);
    public static final pul f = new pul(4);
    public static final pul g = new pul(5);
    public static final pul h = new pul(6);
    public static final pul i = new pul(7);
    public static final pul j = new pul(8);
    public static final pul k = new pul(9);
    public static final pul l = new pul(10);
    public static final pul m = new pul(11);
    public static final pul n = new pul(12);
    public static final pul o = new pul(13);
    public static final pul p = new pul(14);
    public static final pul q = new pul(15);
    public static final pul r = new pul(16);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f27622a;

    public /* synthetic */ pul(byte b2) {
        this.f27622a = b2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f27622a) {
            case 0:
                pz40 pz40Var = s6t0.f31722a;
                return new y3d(s6t0.b().f33626a.getPrimary());
            case 1:
                pz40 pz40Var2 = s6t0.f31722a;
                return new y3d(StaticColors.INSTANCE.m121getTransparent0d7_KjU());
            case 2:
                pz40 pz40Var3 = s6t0.f31722a;
                return new y3d(s6t0.b().f33626a.getSecondary20());
            case 3:
                pz40 pz40Var4 = s6t0.f31722a;
                return new y3d(s6t0.b().f33626a.getWarningTint());
            case 4:
                pz40 pz40Var5 = s6t0.f31722a;
                return new y3d(s6t0.b().f33626a.getWarning());
            case 5:
                pz40 pz40Var6 = s6t0.f31722a;
                return new y3d(s6t0.b().f33626a.getSecondary10());
            case 6:
                pz40 pz40Var7 = s6t0.f31722a;
                return new y3d(s6t0.b().f33626a.getSecondary20());
            case 7:
                o1o o1oVar = o1o.f24491a;
                return (ftj) ftj.f.getValue();
            case 8:
                return null;
            case 9:
                iiy[] iiyVarArr = v8y.g;
                return wp20.b(new Pair(l8y.f19626a, new htm0("Deprecated in Java")));
            case 10:
                jd40 jd40Var = jd40.f16313a;
                ServiceLoader serviceLoaderLoad = ServiceLoader.load(kd40.class, kd40.class.getClassLoader());
                serviceLoaderLoad.getClass();
                List listL0 = CollectionsKt.L0(serviceLoaderLoad);
                if (!listL0.isEmpty()) {
                    return listL0;
                }
                jf4.n("No MetadataExtensions instances found in the classpath. Please ensure that the META-INF/services/ is not stripped from your application and that the Java virtual machine is not running under a security manager");
                return null;
            case 11:
                return Unit.f46060a;
            case 12:
                return null;
            case 13:
                return new y3d(y3d.f);
            case 14:
                return new y3d(y3d.f);
            case 15:
                kiy kiyVar = g4m0.f10674a;
                Class cls = Void.TYPE;
                cls.getClass();
                return cls;
            case 16:
                pz40 pz40Var8 = s6t0.f31722a;
                return new y3d(s6t0.b().f33626a.getSecondary());
            case 17:
                return new Object[6];
            default:
                throw null;
        }
    }

    public /* synthetic */ pul(Object obj, byte b2) {
        this.f27622a = b2;
    }
}
