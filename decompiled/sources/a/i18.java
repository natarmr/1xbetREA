package a;

import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public abstract class i18 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f13985a;
    public static final float b;
    public static final float c;
    public static final float d;

    static {
        zcl zclVar = qmk.f28987a;
        f13985a = 8.0f;
        b = 60.0f;
        c = 84.0f;
        d = 16.0f;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 9361. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public static final void a(a.rz7 r44, a.iz7 r45, kotlin.jvm.functions.Function0 r46, a.fet r47, int r48) {
        /*
            Method dump skipped, instruction units count: 936
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.i18.a(a.rz7, a.iz7, kotlin.jvm.functions.Function0, a.fet, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(final a4x a4xVar, final Function0 function0, fet fetVar, final int i) {
        final byte b2;
        yfe0 yfe0VarU;
        Function2 function2;
        fetVar.g0(-2102885471);
        int i2 = 4;
        int i3 = 32;
        int i4 = (fetVar.i(a4xVar) ? 4 : 2) | i | (fetVar.i(function0) ? 32 : 16);
        final byte b3 = 0;
        byte b4 = 1;
        if (fetVar.U(i4 & 1, (i4 & 19) != 18)) {
            if (a4xVar.isEmpty()) {
                yfe0VarU = fetVar.u();
                if (yfe0VarU == null) {
                    return;
                } else {
                    function2 = new Function2(a4xVar, function0, i, b3) { // from class: a.f18

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final /* synthetic */ byte f8754a;
                        public final /* synthetic */ a4x b;
                        public final /* synthetic */ Function0 c;

                        {
                            this.f8754a = b3;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            byte b5 = this.f8754a;
                            Function0 function1 = this.c;
                            a4x a4xVar2 = this.b;
                            fet fetVar2 = (fet) obj;
                            ((Integer) obj2).getClass();
                            switch (b5) {
                                case 0:
                                    i18.b(a4xVar2, function1, fetVar2, x8x.L(9));
                                    break;
                                default:
                                    i18.b(a4xVar2, function1, fetVar2, x8x.L(9));
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    };
                }
            } else {
                zcl zclVar = qmk.f28987a;
                mm40 mm40VarN = o7k0.n(jm40.b, 46.0f);
                tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
                int iHashCode = Long.hashCode(fetVar.T);
                bh90 bh90VarM = fetVar.m();
                mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarN);
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
                Iterator itO = h97.o(fetVar, mm40VarC0, gqw0.v, 1010701071, a4xVar);
                int i5 = 0;
                while (itO.hasNext()) {
                    Object next = itO.next();
                    int i6 = i5 + 1;
                    if (i5 < 0) {
                        q3d.p();
                        throw null;
                    }
                    pm80 pm80Var = (pm80) next;
                    n0q n0qVar = o7k0.c;
                    int i7 = ((i4 & 112) == i3 ? b4 : b3) | (((i4 & 14) == i2 || fetVar.i(a4xVar)) ? b4 : b3) | (fetVar.e(i5) ? 1 : 0);
                    Object objP = fetVar.P();
                    if (i7 != 0 || objP == ukd.f35823a) {
                        objP = new g18(function0, a4xVar, i5, b3);
                        fetVar.o0(objP);
                    }
                    j0x.b(pm80Var, null, i4w0.T(n0qVar, (Function1) objP), null, null, 0.0f, null, fetVar, 56, 120);
                    b3 = b3;
                    b4 = b4;
                    i5 = i6;
                    i2 = 4;
                    i3 = 32;
                }
                boolean z = b4;
                fetVar.r(b3);
                fetVar.r(z);
                b2 = z;
            }
            yfe0VarU.d = function2;
        }
        b2 = 1;
        fetVar.X();
        yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            function2 = new Function2(a4xVar, function0, i, b2) { // from class: a.f18

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ byte f8754a;
                public final /* synthetic */ a4x b;
                public final /* synthetic */ Function0 c;

                {
                    this.f8754a = b2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    byte b5 = this.f8754a;
                    Function0 function1 = this.c;
                    a4x a4xVar2 = this.b;
                    fet fetVar2 = (fet) obj;
                    ((Integer) obj2).getClass();
                    switch (b5) {
                        case 0:
                            i18.b(a4xVar2, function1, fetVar2, x8x.L(9));
                            break;
                        default:
                            i18.b(a4xVar2, function1, fetVar2, x8x.L(9));
                            break;
                    }
                    return Unit.f46060a;
                }
            };
            yfe0VarU.d = function2;
        }
    }

    public static final void c(int i, fet fetVar, mm40 mm40Var) {
        fetVar.g0(-1103549439);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            mm40 mm40VarN = o7k0.n(mm40Var, c);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = new nk7((byte) 11);
                fetVar.o0(objP);
            }
            mm40 mm40VarT = i4w0.T(mm40VarN, (Function1) objP);
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = new nk7((byte) 12);
                fetVar.o0(objP2);
            }
            p8a.k(mm40VarT, (Function1) objP2, fetVar, 48);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new eg(mm40Var, i, (byte) 24);
        }
    }
}
