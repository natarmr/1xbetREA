package a;

import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes2.dex */
public abstract class fgy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final swq f9517a;
    public static final Map b;
    public static final Map c;

    static {
        e4m0.f7189a.a(g950.e("jvm"));
        swq swqVar = new swq("kotlin.jvm.JvmName");
        plc.S(swqVar);
        swqVar.f32934a.g().b().getClass();
        plc.S(new swq("kotlin.jvm.JvmExposeBoxed"));
        f9517a = new swq("kotlin.jvm.internal.BoxingConstructorMarker");
        swq swqVar2 = new swq("kotlin.jvm.JvmMultifileClass");
        plc.S(swqVar2);
        swqVar2.f32934a.g().b().getClass();
        new swq("kotlin.jvm.JvmPackageName").f32934a.g().b().getClass();
        plc.S(new swq("kotlin.jvm.JvmDefault"));
        swq swqVar3 = new swq("kotlin.jvm.JvmDefaultWithoutCompatibility");
        swq swqVar4 = new swq("kotlin.jvm.JvmDefaultWithCompatibility");
        plc.S(swqVar3);
        plc.S(swqVar4);
        plc.S(new swq("kotlin.jvm.JvmOverloads"));
        new swq("kotlin.jvm.JvmStatic");
        new swq("kotlin.jvm.JvmSuppressWildcards");
        new swq("kotlin.jvm.JvmWildcard");
        new swq("kotlin.jvm.JvmSerializableLambda");
        plc.S(new swq("kotlin.jvm.JvmSynthetic"));
        plc.S(new swq("kotlin.jvm.JvmRecord"));
        plc.S(new swq("kotlin.jvm.Synchronized"));
        plc.S(new swq("kotlin.jvm.Throws"));
        plc.S(new swq("kotlin.jvm.Strictfp"));
        plc.S(new swq("kotlin.jvm.Volatile"));
        plc.S(new swq("kotlin.jvm.Transient"));
        qlc qlcVarS = plc.S(new swq("java.util.concurrent.atomic.AtomicBoolean"));
        qlc qlcVarS2 = plc.S(new swq("java.util.concurrent.atomic.AtomicInteger"));
        qlc qlcVarS3 = plc.S(new swq("java.util.concurrent.atomic.AtomicLong"));
        plc.S(new swq("java.util.concurrent.atomic.AtomicReference"));
        Pair pair = new Pair(e4m0.n, qlcVarS);
        qlc qlcVar = e4m0.o;
        Pair pair2 = new Pair(qlcVar, qlcVarS2);
        qlc qlcVar2 = e4m0.p;
        b = xp20.f(pair, pair2, new Pair(qlcVar2, qlcVarS3));
        plc.S(new swq("java.util.concurrent.atomic.AtomicReferenceArray"));
        c = xp20.f(new Pair(qlcVar, plc.S(new swq("java.util.concurrent.atomic.AtomicIntegerArray"))), new Pair(qlcVar2, plc.S(new swq("java.util.concurrent.atomic.AtomicLongArray"))));
    }
}
