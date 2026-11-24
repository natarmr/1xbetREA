package a;

import kotlin.jvm.functions.Function1;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes6.dex */
public abstract class i2m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ iiy[] f14055a = {new ez40(i2m.class, "isActive", "isActive(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1)};
    public static final zai0 b = new zai0("IsActive");

    public static final void a(mm40 mm40Var, long j, long j2, fet fetVar, int i) {
        fetVar.g0(1960962165);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i | (fetVar.f(j) ? 32 : 16) | (fetVar.f(j2) ? 256 : 128);
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            zcl zclVar = qmk.f28987a;
            zq8.a(0, fetVar, o2e.e0(i120.S(i120.Q(o7k0.e(o7k0.s(mm40Var, 8.0f), 6.0f), j, vgg0.a(2.0f)), 1.0f, j2, vgg0.a(2.0f)), "DS_CUSTOM_VERTICAL_INDICATOR_ITEM_BOX"));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new hzh(mm40Var, j, j2, i, (byte) 1);
        }
    }

    public static final void b(mm40 mm40Var, j2m j2mVar, fet fetVar, int i) {
        int i2;
        long backgroundContent;
        long separator;
        j2mVar.getClass();
        fetVar.g0(958174347);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? fetVar.g(j2mVar) : fetVar.i(j2mVar) ? 32 : 16;
        }
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            int iE = l1e0.e(j2mVar.f15786a, new IntRange(1, 4, 1));
            int iE2 = l1e0.e(j2mVar.b, new IntRange(0, 4, 1));
            IntRange intRange = new IntRange(1, iE, 1);
            IntRange intRange2 = new IntRange(0, iE2, 1);
            zcl zclVar = qmk.f28987a;
            x5d x5dVarA = w5d.a(new qw3(2.0f, true, new jf4((byte) 14)), gqw0.m, fetVar, 0);
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
            jpm0.o(fetVar, x5dVarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            jpm0.o(fetVar, mm40VarC0, gqw0.v);
            fetVar.e0(-1789828111);
            int i3 = intRange.b;
            if (1 <= i3) {
                int i4 = 1;
                while (true) {
                    boolean z = i4 <= intRange2.b && intRange2.f46068a <= i4;
                    boolean zH = fetVar.h(z);
                    Object objP = fetVar.P();
                    if (zH || objP == ukd.f35823a) {
                        objP = new z((byte) 19, z);
                        fetVar.o0(objP);
                    }
                    mm40 mm40VarA = pai0.a(jm40.b, false, (Function1) objP);
                    if (z) {
                        backgroundContent = cs0.e(fetVar, -1789820996, fetVar, false);
                    } else {
                        fetVar.e0(-1789819994);
                        backgroundContent = afn0.m(fetVar).getBackgroundContent();
                        fetVar.r(false);
                    }
                    if (z) {
                        separator = cs0.e(fetVar, -1789817412, fetVar, false);
                    } else {
                        fetVar.e0(-1789816418);
                        separator = afn0.m(fetVar).getSeparator();
                        fetVar.r(false);
                    }
                    a(mm40VarA, backgroundContent, separator, fetVar, 0);
                    if (i4 == i3) {
                        break;
                    } else {
                        i4++;
                    }
                }
            }
            fetVar.r(false);
            fetVar.r(true);
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new kkl((Object) mm40Var, (Object) j2mVar, i, (byte) 12);
        }
    }
}
