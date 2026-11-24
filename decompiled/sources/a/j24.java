package a;

import com.huawei.hms.push.constant.RemoteMessageConst;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public abstract class j24 {
    public static final c5k A;
    public static final c5k B;
    public static final c5k C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ iiy[] f15764a = {new ez40(j24.class, "hasAnnotations", "getHasAnnotations(Lkotlin/metadata/KmClass;)Z", 1), new ez40(j24.class, "hasAnnotations", "getHasAnnotations(Lkotlin/metadata/KmConstructor;)Z", 1), new ez40(j24.class, "hasAnnotations", "getHasAnnotations(Lkotlin/metadata/KmFunction;)Z", 1), new ez40(j24.class, "hasAnnotations", "getHasAnnotations(Lkotlin/metadata/KmProperty;)Z", 1), new ez40(j24.class, "hasAnnotations", "getHasAnnotations(Lkotlin/metadata/KmPropertyAccessorAttributes;)Z", 1), new ez40(j24.class, "hasAnnotations", "getHasAnnotations(Lkotlin/metadata/KmValueParameter;)Z", 1), new ez40(j24.class, "hasAnnotations", "getHasAnnotations(Lkotlin/metadata/KmTypeAlias;)Z", 1), new ez40(j24.class, "modality", "getModality(Lkotlin/metadata/KmClass;)Lkotlin/reflect/jvm/internal/impl/km/Modality;", 1), new ez40(j24.class, RemoteMessageConst.Notification.VISIBILITY, "getVisibility(Lkotlin/metadata/KmClass;)Lkotlin/reflect/jvm/internal/impl/km/Visibility;", 1), new ez40(j24.class, "kind", "getKind(Lkotlin/metadata/KmClass;)Lkotlin/reflect/jvm/internal/impl/km/ClassKind;", 1), new ez40(j24.class, "isInner", "isInner(Lkotlin/metadata/KmClass;)Z", 1), new ez40(j24.class, "isData", "isData(Lkotlin/metadata/KmClass;)Z", 1), new ez40(j24.class, "isExternal", "isExternal(Lkotlin/metadata/KmClass;)Z", 1), new ez40(j24.class, "isExpect", "isExpect(Lkotlin/metadata/KmClass;)Z", 1), new ez40(j24.class, "isValue", "isValue(Lkotlin/metadata/KmClass;)Z", 1), new ez40(j24.class, "isFunInterface", "isFunInterface(Lkotlin/metadata/KmClass;)Z", 1), new ez40(j24.class, "hasEnumEntries", "getHasEnumEntries(Lkotlin/metadata/KmClass;)Z", 1), new ez40(j24.class, RemoteMessageConst.Notification.VISIBILITY, "getVisibility(Lkotlin/metadata/KmConstructor;)Lkotlin/reflect/jvm/internal/impl/km/Visibility;", 1), new ez40(j24.class, "isSecondary", "isSecondary(Lkotlin/metadata/KmConstructor;)Z", 1), new ez40(j24.class, "hasNonStableParameterNames", "getHasNonStableParameterNames(Lkotlin/metadata/KmConstructor;)Z", 1), new ez40(j24.class, "returnValueStatus", "getReturnValueStatus(Lkotlin/metadata/KmConstructor;)Lkotlin/reflect/jvm/internal/impl/km/ReturnValueStatus;", 1), new ez40(j24.class, "kind", "getKind(Lkotlin/metadata/KmFunction;)Lkotlin/reflect/jvm/internal/impl/km/MemberKind;", 1), new ez40(j24.class, RemoteMessageConst.Notification.VISIBILITY, "getVisibility(Lkotlin/metadata/KmFunction;)Lkotlin/reflect/jvm/internal/impl/km/Visibility;", 1), new ez40(j24.class, "modality", "getModality(Lkotlin/metadata/KmFunction;)Lkotlin/reflect/jvm/internal/impl/km/Modality;", 1), new ez40(j24.class, "isOperator", "isOperator(Lkotlin/metadata/KmFunction;)Z", 1), new ez40(j24.class, "isInfix", "isInfix(Lkotlin/metadata/KmFunction;)Z", 1), new ez40(j24.class, "isInline", "isInline(Lkotlin/metadata/KmFunction;)Z", 1), new ez40(j24.class, "isTailrec", "isTailrec(Lkotlin/metadata/KmFunction;)Z", 1), new ez40(j24.class, "isExternal", "isExternal(Lkotlin/metadata/KmFunction;)Z", 1), new ez40(j24.class, "isSuspend", "isSuspend(Lkotlin/metadata/KmFunction;)Z", 1), new ez40(j24.class, "isExpect", "isExpect(Lkotlin/metadata/KmFunction;)Z", 1), new ez40(j24.class, "hasNonStableParameterNames", "getHasNonStableParameterNames(Lkotlin/metadata/KmFunction;)Z", 1), new ez40(j24.class, "returnValueStatus", "getReturnValueStatus(Lkotlin/metadata/KmFunction;)Lkotlin/reflect/jvm/internal/impl/km/ReturnValueStatus;", 1), new ez40(j24.class, "isStatic", "isStatic(Lkotlin/metadata/KmFunction;)Z", 1), new ez40(j24.class, RemoteMessageConst.Notification.VISIBILITY, "getVisibility(Lkotlin/metadata/KmProperty;)Lkotlin/reflect/jvm/internal/impl/km/Visibility;", 1), new ez40(j24.class, "modality", "getModality(Lkotlin/metadata/KmProperty;)Lkotlin/reflect/jvm/internal/impl/km/Modality;", 1), new ez40(j24.class, "kind", "getKind(Lkotlin/metadata/KmProperty;)Lkotlin/reflect/jvm/internal/impl/km/MemberKind;", 1), new ez40(j24.class, "isVar", "isVar(Lkotlin/metadata/KmProperty;)Z", 1), new ez40(j24.class, "isConst", "isConst(Lkotlin/metadata/KmProperty;)Z", 1), new ez40(j24.class, "isLateinit", "isLateinit(Lkotlin/metadata/KmProperty;)Z", 1), new ez40(j24.class, "hasConstant", "getHasConstant(Lkotlin/metadata/KmProperty;)Z", 1), new ez40(j24.class, "isExternal", "isExternal(Lkotlin/metadata/KmProperty;)Z", 1), new ez40(j24.class, "isDelegated", "isDelegated(Lkotlin/metadata/KmProperty;)Z", 1), new ez40(j24.class, "isExpect", "isExpect(Lkotlin/metadata/KmProperty;)Z", 1), new ez40(j24.class, "returnValueStatus", "getReturnValueStatus(Lkotlin/metadata/KmProperty;)Lkotlin/reflect/jvm/internal/impl/km/ReturnValueStatus;", 1), new ez40(j24.class, "isStatic", "isStatic(Lkotlin/metadata/KmProperty;)Z", 1), new ez40(j24.class, RemoteMessageConst.Notification.VISIBILITY, "getVisibility(Lkotlin/metadata/KmPropertyAccessorAttributes;)Lkotlin/reflect/jvm/internal/impl/km/Visibility;", 1), new ez40(j24.class, "modality", "getModality(Lkotlin/metadata/KmPropertyAccessorAttributes;)Lkotlin/reflect/jvm/internal/impl/km/Modality;", 1), new ez40(j24.class, "isNotDefault", "isNotDefault(Lkotlin/metadata/KmPropertyAccessorAttributes;)Z", 1), new ez40(j24.class, "isExternal", "isExternal(Lkotlin/metadata/KmPropertyAccessorAttributes;)Z", 1), new ez40(j24.class, "isInline", "isInline(Lkotlin/metadata/KmPropertyAccessorAttributes;)Z", 1), new ez40(j24.class, "isNullable", "isNullable(Lkotlin/metadata/KmType;)Z", 1), new ez40(j24.class, "isSuspend", "isSuspend(Lkotlin/metadata/KmType;)Z", 1), new ez40(j24.class, "isDefinitelyNonNull", "isDefinitelyNonNull(Lkotlin/metadata/KmType;)Z", 1), new ez40(j24.class, "isReified", "isReified(Lkotlin/metadata/KmTypeParameter;)Z", 1), new ez40(j24.class, RemoteMessageConst.Notification.VISIBILITY, "getVisibility(Lkotlin/metadata/KmTypeAlias;)Lkotlin/reflect/jvm/internal/impl/km/Visibility;", 1), new ez40(j24.class, "declaresDefaultValue", "getDeclaresDefaultValue(Lkotlin/metadata/KmValueParameter;)Z", 1), new ez40(j24.class, "isCrossinline", "isCrossinline(Lkotlin/metadata/KmValueParameter;)Z", 1), new ez40(j24.class, "isNoinline", "isNoinline(Lkotlin/metadata/KmValueParameter;)Z", 1), new ez40(j24.class, "isNegated", "isNegated(Lkotlin/metadata/KmEffectExpression;)Z", 1), new ez40(j24.class, "isNullCheckPredicate", "isNullCheckPredicate(Lkotlin/metadata/KmEffectExpression;)Z", 1)};
    public static final pmi b;
    public static final pmi c;
    public static final pmi d;
    public static final c5k e;
    public static final c5k f;
    public static final pmi g;
    public static final pmi h;
    public static final pmi i;
    public static final c5k j;
    public static final c5k k;
    public static final c5k l;
    public static final c5k m;
    public static final c5k n;
    public static final c5k o;
    public static final pmi p;
    public static final pmi q;
    public static final c5k r;
    public static final c5k s;
    public static final c5k t;
    public static final pmi u;
    public static final pmi v;
    public static final c5k w;
    public static final c5k x;
    public static final c5k y;
    public static final c5k z;

    static {
        kjq kjqVar = njq.c;
        kjqVar.getClass();
        ijq ijqVar = new ijq(kjqVar, 1);
        bjq bjqVar = bjq.b;
        if (ijqVar.b != 1 || ijqVar.c != 1) {
            c99.s(rw2.l("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", ijqVar, " was passed"));
            return;
        }
        ijq ijqVar2 = new ijq(kjqVar, 1);
        int i2 = cjq.b;
        if (ijqVar2.b != 1) {
            c99.s(rw2.l("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", ijqVar2, " was passed"));
            return;
        }
        ijq ijqVar3 = new ijq(kjqVar, 1);
        djq djqVar = djq.b;
        if (ijqVar3.b != 1 || ijqVar3.c != 1) {
            c99.s(rw2.l("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", ijqVar3, " was passed"));
            return;
        }
        ijq ijqVar4 = new ijq(kjqVar, 1);
        fjq fjqVar = fjq.b;
        if (ijqVar4.b != 1 || ijqVar4.c != 1) {
            c99.s(rw2.l("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", ijqVar4, " was passed"));
            return;
        }
        ijq ijqVar5 = new ijq(kjqVar, 1);
        ejq ejqVar = ejq.b;
        if (ijqVar5.b != 1 || ijqVar5.c != 1) {
            c99.s(rw2.l("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", ijqVar5, " was passed"));
            return;
        }
        ijq ijqVar6 = new ijq(kjqVar, 1);
        hjq hjqVar = hjq.b;
        if (ijqVar6.b != 1 || ijqVar6.c != 1) {
            c99.s(rw2.l("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", ijqVar6, " was passed"));
            return;
        }
        ijq ijqVar7 = new ijq(kjqVar, 1);
        int i3 = r14.d;
        if (ijqVar7.b != 1) {
            c99.s(rw2.l("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", ijqVar7, " was passed"));
            return;
        }
        b = bfb.d0(y14.b);
        c = bfb.s0(h24.b);
        u14 u14Var = u14.b;
        ljq ljqVar = njq.f;
        ljqVar.getClass();
        c0o c0oVar = rlc.j;
        ArrayList arrayList = new ArrayList(r3d.q(c0oVar, 10));
        y2 y2Var = new y2(c0oVar, (byte) 0);
        while (y2Var.hasNext()) {
            arrayList.add(((rlc) y2Var.next()).f30689a);
        }
        d = new pmi(u14Var, ljqVar, c0oVar, arrayList);
        kjq kjqVar2 = njq.g;
        kjqVar2.getClass();
        ijq ijqVar8 = new ijq(kjqVar2, 1);
        bjq bjqVar2 = bjq.b;
        e = new c5k((thy) bjqVar2, ijqVar8);
        kjq kjqVar3 = njq.h;
        kjqVar3.getClass();
        ijq ijqVar9 = new ijq(kjqVar3, 1);
        if (ijqVar9.b != 1 || ijqVar9.c != 1) {
            c99.s(rw2.l("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", ijqVar9, " was passed"));
            return;
        }
        kjq kjqVar4 = njq.i;
        kjqVar4.getClass();
        ijq ijqVar10 = new ijq(kjqVar4, 1);
        if (ijqVar10.b != 1 || ijqVar10.c != 1) {
            c99.s(rw2.l("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", ijqVar10, " was passed"));
            return;
        }
        kjq kjqVar5 = njq.j;
        kjqVar5.getClass();
        ijq ijqVar11 = new ijq(kjqVar5, 1);
        if (ijqVar11.b != 1 || ijqVar11.c != 1) {
            c99.s(rw2.l("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", ijqVar11, " was passed"));
            return;
        }
        kjq kjqVar6 = njq.k;
        kjqVar6.getClass();
        f = new c5k((thy) bjqVar2, new ijq(kjqVar6, 1));
        kjq kjqVar7 = njq.l;
        kjqVar7.getClass();
        ijq ijqVar12 = new ijq(kjqVar7, 1);
        if (ijqVar12.b != 1 || ijqVar12.c != 1) {
            c99.s(rw2.l("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", ijqVar12, " was passed"));
            return;
        }
        kjq kjqVar8 = njq.m;
        kjqVar8.getClass();
        ijq ijqVar13 = new ijq(kjqVar8, 1);
        if (ijqVar13.b != 1 || ijqVar13.c != 1) {
            c99.s(rw2.l("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", ijqVar13, " was passed"));
            return;
        }
        g = bfb.s0(i24.b);
        kjq kjqVar9 = njq.n;
        kjqVar9.getClass();
        ijq ijqVar14 = new ijq(kjqVar9, 1);
        int i4 = cjq.b;
        if (ijqVar14.b != 1) {
            c99.s(rw2.l("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", ijqVar14, " was passed"));
            return;
        }
        kjq kjqVar10 = njq.o;
        kjqVar10.getClass();
        ijq ijqVar15 = new ijq(kjqVar10, 1);
        if (ijqVar15.b != 1) {
            c99.s(rw2.l("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", ijqVar15, " was passed"));
            return;
        }
        b24 b24Var = b24.b;
        ljq ljqVar2 = njq.p;
        ljqVar2.getClass();
        bfb.m0(b24Var, ljqVar2);
        bfb.c0(v14.b);
        h = bfb.s0(d24.b);
        i = bfb.d0(z14.b);
        kjq kjqVar11 = njq.r;
        kjqVar11.getClass();
        ijq ijqVar16 = new ijq(kjqVar11, 1);
        djq djqVar2 = djq.b;
        j = new c5k((thy) djqVar2, ijqVar16);
        kjq kjqVar12 = njq.s;
        kjqVar12.getClass();
        k = new c5k((thy) djqVar2, new ijq(kjqVar12, 1));
        kjq kjqVar13 = njq.t;
        kjqVar13.getClass();
        l = new c5k((thy) djqVar2, new ijq(kjqVar13, 1));
        kjq kjqVar14 = njq.u;
        kjqVar14.getClass();
        ijq ijqVar17 = new ijq(kjqVar14, 1);
        if (ijqVar17.b != 1 || ijqVar17.c != 1) {
            c99.s(rw2.l("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", ijqVar17, " was passed"));
            return;
        }
        kjq kjqVar15 = njq.v;
        kjqVar15.getClass();
        m = new c5k((thy) djqVar2, new ijq(kjqVar15, 1));
        kjq kjqVar16 = njq.w;
        kjqVar16.getClass();
        n = new c5k((thy) djqVar2, new ijq(kjqVar16, 1));
        kjq kjqVar17 = njq.x;
        kjqVar17.getClass();
        ijq ijqVar18 = new ijq(kjqVar17, 1);
        if (ijqVar18.b != 1 || ijqVar18.c != 1) {
            c99.s(rw2.l("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", ijqVar18, " was passed"));
            return;
        }
        kjq kjqVar18 = njq.y;
        kjqVar18.getClass();
        ijq ijqVar19 = new ijq(kjqVar18, 1);
        if (ijqVar19.b != 1 || ijqVar19.c != 1) {
            c99.s(rw2.l("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", ijqVar19, " was passed"));
            return;
        }
        c24 c24Var = c24.b;
        ljq ljqVar3 = njq.z;
        ljqVar3.getClass();
        bfb.m0(c24Var, ljqVar3);
        kjq kjqVar19 = njq.A;
        kjqVar19.getClass();
        o = new c5k((thy) djqVar2, new ijq(kjqVar19, 1));
        p = bfb.s0(e24.b);
        q = bfb.d0(w14.b);
        bfb.c0(t14.b);
        kjq kjqVar20 = njq.B;
        kjqVar20.getClass();
        ijq ijqVar20 = new ijq(kjqVar20, 1);
        fjq fjqVar2 = fjq.b;
        r = new c5k((thy) fjqVar2, ijqVar20);
        kjq kjqVar21 = njq.E;
        kjqVar21.getClass();
        ijq ijqVar21 = new ijq(kjqVar21, 1);
        if (ijqVar21.b != 1 || ijqVar21.c != 1) {
            c99.s(rw2.l("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", ijqVar21, " was passed"));
            return;
        }
        kjq kjqVar22 = njq.F;
        kjqVar22.getClass();
        ijq ijqVar22 = new ijq(kjqVar22, 1);
        if (ijqVar22.b != 1 || ijqVar22.c != 1) {
            c99.s(rw2.l("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", ijqVar22, " was passed"));
            return;
        }
        kjq kjqVar23 = njq.G;
        kjqVar23.getClass();
        ijq ijqVar23 = new ijq(kjqVar23, 1);
        if (ijqVar23.b != 1 || ijqVar23.c != 1) {
            c99.s(rw2.l("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", ijqVar23, " was passed"));
            return;
        }
        kjq kjqVar24 = njq.H;
        kjqVar24.getClass();
        ijq ijqVar24 = new ijq(kjqVar24, 1);
        if (ijqVar24.b != 1 || ijqVar24.c != 1) {
            c99.s(rw2.l("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", ijqVar24, " was passed"));
            return;
        }
        kjq kjqVar25 = njq.I;
        kjqVar25.getClass();
        s = new c5k((thy) fjqVar2, new ijq(kjqVar25, 1));
        kjq kjqVar26 = njq.J;
        kjqVar26.getClass();
        ijq ijqVar25 = new ijq(kjqVar26, 1);
        if (ijqVar25.b != 1 || ijqVar25.c != 1) {
            c99.s(rw2.l("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", ijqVar25, " was passed"));
            return;
        }
        a24 a24Var = a24.b;
        ljq ljqVar4 = njq.K;
        ljqVar4.getClass();
        bfb.m0(a24Var, ljqVar4);
        kjq kjqVar27 = njq.L;
        kjqVar27.getClass();
        t = new c5k((thy) fjqVar2, new ijq(kjqVar27, 1));
        u = bfb.s0(f24.b);
        v = bfb.d0(x14.b);
        kjq kjqVar28 = njq.P;
        kjqVar28.getClass();
        ijq ijqVar26 = new ijq(kjqVar28, 1);
        ejq ejqVar2 = ejq.b;
        if (ijqVar26.b != 1 || ijqVar26.c != 1) {
            c99.s(rw2.l("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", ijqVar26, " was passed"));
            return;
        }
        kjq kjqVar29 = njq.Q;
        kjqVar29.getClass();
        w = new c5k((thy) ejqVar2, new ijq(kjqVar29, 1));
        kjq kjqVar30 = njq.R;
        kjqVar30.getClass();
        x = new c5k((thy) ejqVar2, new ijq(kjqVar30, 1));
        ijq ijqVar27 = new ijq(0, 1, 1);
        gjq gjqVar = gjq.b;
        y = new c5k((thy) gjqVar, ijqVar27);
        kjq kjqVar31 = njq.f23648a;
        z = new c5k((thy) gjqVar, new ijq(kjqVar31.b + 1, kjqVar31.c, 1));
        kjq kjqVar32 = njq.b;
        A = new c5k((thy) gjqVar, new ijq(kjqVar32.b + 1, kjqVar32.c, 1));
        B = new c5k((thy) s14.b, new ijq(0, 1, 1));
        bfb.s0(g24.b);
        kjq kjqVar33 = njq.M;
        kjqVar33.getClass();
        C = new c5k((thy) hjq.b, new ijq(kjqVar33, 1));
        kjq kjqVar34 = njq.N;
        kjqVar34.getClass();
        ijq ijqVar28 = new ijq(kjqVar34, 1);
        if (ijqVar28.b != 1 || ijqVar28.c != 1) {
            c99.s(rw2.l("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", ijqVar28, " was passed"));
            return;
        }
        kjq kjqVar35 = njq.O;
        kjqVar35.getClass();
        ijq ijqVar29 = new ijq(kjqVar35, 1);
        if (ijqVar29.b != 1 || ijqVar29.c != 1) {
            c99.s(rw2.l("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", ijqVar29, " was passed"));
            return;
        }
        int i5 = r14.d;
        kjq kjqVar36 = njq.S;
        kjqVar36.getClass();
        ijq ijqVar30 = new ijq(kjqVar36, 1);
        if (ijqVar30.b != 1) {
            c99.s(rw2.l("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", ijqVar30, " was passed"));
            return;
        }
        int i6 = r14.d;
        kjq kjqVar37 = njq.T;
        kjqVar37.getClass();
        ijq ijqVar31 = new ijq(kjqVar37, 1);
        if (ijqVar31.b == 1) {
            return;
        }
        c99.s(rw2.l("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", ijqVar31, " was passed"));
    }

    public static final rlc a(qpy qpyVar) {
        return (rlc) d.v(f15764a[9], qpyVar);
    }

    public static final nuu0 b(dqy dqyVar) {
        dqyVar.getClass();
        return (nuu0) p.v(f15764a[34], dqyVar);
    }
}
