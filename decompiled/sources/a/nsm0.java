package a;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.gov.nist.core.Separators;
import android.javax.sip.message.Response;
import android.text.TextUtils;
import java.io.File;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes6.dex */
public abstract class nsm0 {
    /* JADX WARN: Code duplicated, block: B:24:0x003e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0082 A[Catch: SQLiteException -> 0x00b7, TryCatch #1 {SQLiteException -> 0x00b7, blocks: (B:26:0x0044, B:28:0x0074, B:30:0x0082, B:32:0x008a, B:33:0x008d, B:34:0x00b6, B:38:0x00bc, B:40:0x00bf, B:42:0x00c7, B:43:0x00ce, B:44:0x00d1, B:46:0x00d7, B:49:0x00e6, B:50:0x00ea, B:27:0x006d), top: B:60:0x0044, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x008a A[Catch: SQLiteException -> 0x00b7, LOOP:0: B:29:0x0080->B:32:0x008a, LOOP_END, TryCatch #1 {SQLiteException -> 0x00b7, blocks: (B:26:0x0044, B:28:0x0074, B:30:0x0082, B:32:0x008a, B:33:0x008d, B:34:0x00b6, B:38:0x00bc, B:40:0x00bf, B:42:0x00c7, B:43:0x00ce, B:44:0x00d1, B:46:0x00d7, B:49:0x00e6, B:50:0x00ea, B:27:0x006d), top: B:60:0x0044, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00bc A[Catch: SQLiteException -> 0x00b7, LOOP:1: B:38:0x00bc->B:43:0x00ce, LOOP_START, PHI: r1
  0x00bc: PHI (r1v5 int) = (r1v4 int), (r1v6 int) binds: [B:37:0x00ba, B:43:0x00ce] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {SQLiteException -> 0x00b7, blocks: (B:26:0x0044, B:28:0x0074, B:30:0x0082, B:32:0x008a, B:33:0x008d, B:34:0x00b6, B:38:0x00bc, B:40:0x00bf, B:42:0x00c7, B:43:0x00ce, B:44:0x00d1, B:46:0x00d7, B:49:0x00e6, B:50:0x00ea, B:27:0x006d), top: B:60:0x0044, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00bf A[Catch: SQLiteException -> 0x00b7, TryCatch #1 {SQLiteException -> 0x00b7, blocks: (B:26:0x0044, B:28:0x0074, B:30:0x0082, B:32:0x008a, B:33:0x008d, B:34:0x00b6, B:38:0x00bc, B:40:0x00bf, B:42:0x00c7, B:43:0x00ce, B:44:0x00d1, B:46:0x00d7, B:49:0x00e6, B:50:0x00ea, B:27:0x006d), top: B:60:0x0044, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00c7 A[Catch: SQLiteException -> 0x00b7, TryCatch #1 {SQLiteException -> 0x00b7, blocks: (B:26:0x0044, B:28:0x0074, B:30:0x0082, B:32:0x008a, B:33:0x008d, B:34:0x00b6, B:38:0x00bc, B:40:0x00bf, B:42:0x00c7, B:43:0x00ce, B:44:0x00d1, B:46:0x00d7, B:49:0x00e6, B:50:0x00ea, B:27:0x006d), top: B:60:0x0044, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00d7 A[Catch: SQLiteException -> 0x00b7, TryCatch #1 {SQLiteException -> 0x00b7, blocks: (B:26:0x0044, B:28:0x0074, B:30:0x0082, B:32:0x008a, B:33:0x008d, B:34:0x00b6, B:38:0x00bc, B:40:0x00bf, B:42:0x00c7, B:43:0x00ce, B:44:0x00d1, B:46:0x00d7, B:49:0x00e6, B:50:0x00ea, B:27:0x006d), top: B:60:0x0044, inners: #3 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:69:0x008d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x00ce A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:? A[SYNTHETIC] */
    public static void A(uuw0 uuw0Var, SQLiteDatabase sQLiteDatabase, String str, String str2, String str3, String[] strArr) throws Throwable {
        SQLiteDatabase sQLiteDatabase2;
        Throwable th;
        Cursor cursorQuery;
        HashSet hashSet;
        Cursor cursorRawQuery;
        int i;
        int i2;
        if (uuw0Var == null) {
            jf4.o("Monitor must not be null");
            return;
        }
        Cursor cursor = null;
        try {
            try {
                try {
                    try {
                        sQLiteDatabase2 = sQLiteDatabase;
                        try {
                            cursorQuery = sQLiteDatabase2.query("SQLITE_MASTER", new String[]{"name"}, "name=?", new String[]{str}, null, null, null);
                            try {
                                try {
                                    boolean zMoveToFirst = cursorQuery.moveToFirst();
                                    cursorQuery.close();
                                    if (!zMoveToFirst) {
                                        sQLiteDatabase2.execSQL(str2);
                                    }
                                } catch (SQLiteException e) {
                                    e = e;
                                    uuw0Var.j.c(str, e, "Error querying for table");
                                    if (cursorQuery != null) {
                                        cursorQuery.close();
                                    }
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                cursor = cursorQuery;
                                if (cursor != null) {
                                    throw th;
                                }
                                cursor.close();
                                throw th;
                            }
                        } catch (SQLiteException e2) {
                            e = e2;
                            cursorQuery = null;
                            uuw0Var.j.c(str, e, "Error querying for table");
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            sQLiteDatabase2.execSQL(str2);
                            hashSet = new HashSet();
                            StringBuilder sb = new StringBuilder(str.length() + 22);
                            sb.append("SELECT * FROM ");
                            sb.append(str);
                            sb.append(" LIMIT 0");
                            cursorRawQuery = sQLiteDatabase2.rawQuery(sb.toString(), null);
                            Collections.addAll(hashSet, cursorRawQuery.getColumnNames());
                            cursorRawQuery.close();
                            for (String str4 : str3.split(Separators.COMMA)) {
                                if (hashSet.remove(str4)) {
                                    StringBuilder sb2 = new StringBuilder(str.length() + 35 + String.valueOf(str4).length());
                                    sb2.append("Table ");
                                    sb2.append(str);
                                    sb2.append(" is missing required column: ");
                                    sb2.append(str4);
                                    throw new SQLiteException(sb2.toString());
                                }
                            }
                            if (strArr != null) {
                                for (i = 0; i < strArr.length; i += 2) {
                                    if (!hashSet.remove(strArr[i])) {
                                        sQLiteDatabase2.execSQL(strArr[i + 1]);
                                    }
                                }
                            }
                            if (hashSet.isEmpty()) {
                                return;
                            }
                            uuw0Var.j.c(str, TextUtils.join(", ", hashSet), "Table has extra columns. table, columns");
                            return;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        if (cursor != null) {
                            throw th;
                        }
                        cursor.close();
                        throw th;
                    }
                } catch (SQLiteException e3) {
                    e = e3;
                    sQLiteDatabase2 = sQLiteDatabase;
                }
                Collections.addAll(hashSet, cursorRawQuery.getColumnNames());
                cursorRawQuery.close();
                while (i2 < r0) {
                    if (hashSet.remove(str4)) {
                        StringBuilder sb3 = new StringBuilder(str.length() + 35 + String.valueOf(str4).length());
                        sb3.append("Table ");
                        sb3.append(str);
                        sb3.append(" is missing required column: ");
                        sb3.append(str4);
                        throw new SQLiteException(sb3.toString());
                    }
                }
                if (strArr != null) {
                    while (i < strArr.length) {
                        if (!hashSet.remove(strArr[i])) {
                            sQLiteDatabase2.execSQL(strArr[i + 1]);
                        }
                    }
                }
                if (hashSet.isEmpty()) {
                    uuw0Var.j.c(str, TextUtils.join(", ", hashSet), "Table has extra columns. table, columns");
                    return;
                }
                return;
            } catch (Throwable th4) {
                cursorRawQuery.close();
                throw th4;
            }
            hashSet = new HashSet();
            StringBuilder sb4 = new StringBuilder(str.length() + 22);
            sb4.append("SELECT * FROM ");
            sb4.append(str);
            sb4.append(" LIMIT 0");
            cursorRawQuery = sQLiteDatabase2.rawQuery(sb4.toString(), null);
        } catch (SQLiteException e4) {
            uuw0Var.g.b(str, "Failed to verify columns on table that was just created");
            throw e4;
        }
    }

    public static void B(uuw0 uuw0Var, SQLiteDatabase sQLiteDatabase) {
        if (uuw0Var == null) {
            jf4.o("Monitor must not be null");
            return;
        }
        quw0 quw0Var = uuw0Var.j;
        File file = new File(sQLiteDatabase.getPath());
        if (!file.setReadable(false, false)) {
            quw0Var.a("Failed to turn off database read permission");
        }
        if (!file.setWritable(false, false)) {
            quw0Var.a("Failed to turn off database write permission");
        }
        if (!file.setReadable(true, true)) {
            quw0Var.a("Failed to turn on database read permission for owner");
        }
        if (file.setWritable(true, true)) {
            return;
        }
        quw0Var.a("Failed to turn on database write permission for owner");
    }

    public static final void a(int i, fet fetVar, mm40 mm40Var) {
        fetVar.g0(1333997337);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarE = o7k0.e(mm40Var, 14.0f);
            zcl zclVar2 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarE2 = h97.e(zclVar2, zclVar2, zclVar2, zclVar2, mm40VarE);
            pz40 pz40Var = s6t0.f31722a;
            zq8.a(0, fetVar, xbc.c0(i120.Q(mm40VarE2, s6t0.b().f33626a.getSecondary20(), jd8.n), vbc.d0(null, fetVar, 0, 1)));
        } else {
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cpl0(mm40Var, i, (byte) 6);
        }
    }

    public static final void b(mm40 mm40Var, uvo0 uvo0Var, fet fetVar, int i) {
        byte b;
        fet fetVar2 = fetVar;
        fetVar2.g0(-635726004);
        int i2 = i | (fetVar2.g(mm40Var) ? 4 : 2) | (fetVar2.g(uvo0Var) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40Var);
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
            v8q0.a(rsm0.w(R.string.finaly_sum_bet_description, 0, fetVar2), null, 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, ibm0.n(new y9q0(0L, qmk.r, null, j1t0.c, 0L, null, 0, 0, qmk.F, 16646109), fetVar2), fetVar, 0, 0, 131070);
            fetVar2 = fetVar;
            boolean zEquals = uvo0Var.equals(svo0.f32879a);
            jm40 jm40Var = jm40.b;
            if (zEquals) {
                fetVar2.e0(1286298047);
                g(0, fetVar2, s5x0.N(jm40Var, 0.0f, 8.0f, 0.0f, 0.0f, 13));
                fetVar2.r(false);
            } else {
                if (!(uvo0Var instanceof tvo0)) {
                    throw b1j.f(1286296001, fetVar2, false);
                }
                fetVar2.e0(1286303524);
                f(6, fetVar2, ((tvo0) uvo0Var).b, o7k0.d(jm40Var, 1.0f));
                fetVar2.r(false);
            }
            b = 1;
            fetVar2.r(true);
        } else {
            b = 1;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gvo0(mm40Var, uvo0Var, i, b);
        }
    }

    public static final void c(mm40 mm40Var, uvo0 uvo0Var, fet fetVar, int i) {
        uvo0 uvo0Var2;
        fet fetVar2 = fetVar;
        fetVar2.g0(-955801947);
        byte b = 2;
        int i2 = (fetVar2.g(mm40Var) ? 4 : 2) | i | (fetVar2.g(uvo0Var) ? 32 : 16) | 384;
        byte b2 = 0;
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            Object[] objArr = {false};
            Object objP = fetVar2.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = new fno0((byte) 3);
                fetVar2.o0(objP);
            }
            pz40 pz40Var = (pz40) e9x.Q(objArr, (Function0) objP, fetVar2, 0);
            Object objP2 = fetVar2.P();
            if (objP2 == cl5Var) {
                objP2 = new zsf(0.0f, 0.0f, 0.58f, 1.0f);
                fetVar2.o0(objP2);
            }
            zsf zsfVar = (zsf) objP2;
            mm40 mm40VarD = o7k0.d(mm40Var, 1.0f);
            pz40 pz40Var2 = s6t0.f31722a;
            long background = s6t0.b().f33626a.getBackground();
            zcl zclVar = qmk.f;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarQ = i120.Q(mm40VarD, background, new ugg0(zclVar, zclVar, zclVar, zclVar));
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarQ);
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
            mm40 mm40VarN = s5x0.N(jm40.b, 12.0f, 0.0f, 0.0f, 0.0f, 14);
            boolean zBooleanValue = ((Boolean) pz40Var.getValue()).booleanValue();
            boolean zG = fetVar2.g(pz40Var);
            Object objP3 = fetVar2.P();
            if (zG || objP3 == cl5Var) {
                objP3 = new zhl0(pz40Var, (byte) 12);
                fetVar2.o0(objP3);
            }
            d(mm40VarN, uvo0Var, zBooleanValue, (Function0) objP3, fetVar2, i2 & 112);
            uvo0Var2 = uvo0Var;
            boolean zBooleanValue2 = ((Boolean) pz40Var.getValue()).booleanValue();
            uts0 uts0VarM0 = ro4.m0(Response.BAD_REQUEST, 0, zsfVar, 2);
            yx7 yx7Var = gqw0.j;
            b34.e(y5d.f42040a, zBooleanValue2, null, kzn.c(uts0VarM0, yx7Var, 12), kzn.i(ro4.m0(Response.BAD_REQUEST, 0, zsfVar, 2), yx7Var, 12), null, u1c.M(-1408481001, new gcn0(uvo0Var2, b), fetVar2), fetVar, 1600518, 18);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            uvo0Var2 = uvo0Var;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new gvo0(mm40Var, uvo0Var2, i, b2);
        }
    }

    public static final void d(mm40 mm40Var, uvo0 uvo0Var, boolean z, Function0 function0, fet fetVar, int i) {
        int i2;
        boolean z2;
        fet fetVar2 = fetVar;
        fetVar2.g0(1990846290);
        if ((i & 6) == 0) {
            i2 = (fetVar2.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar2.g(uvo0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            z2 = z;
            i2 |= fetVar2.h(z2) ? 256 : 128;
        } else {
            z2 = z;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar2.i(function0) ? 2048 : 1024;
        }
        if (fetVar2.U(i2 & 1, (i2 & 1171) != 1170)) {
            boolean z3 = (i2 & 7168) == 2048;
            Object objP = fetVar2.P();
            if (z3 || objP == ukd.f35823a) {
                objP = new xhl0(function0, (byte) 10);
                fetVar2.o0(objP);
            }
            mm40 mm40VarW = y860.W(mm40Var, null, null, false, null, (Function0) objP, 28);
            zcl zclVar = qmk.f28987a;
            thg0 thg0VarA = shg0.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.k, fetVar2, 48);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarW);
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
            mm40 mm40VarN = o7k0.n(jm40.b, 16.0f);
            pm80 pm80VarF = a8k0.F(R.drawable.ic_glyph_info_circle_filled, 0, fetVar2);
            pz40 pz40Var = s6t0.f31722a;
            dww.c(pm80VarF, null, mm40VarN, s6t0.b().f33626a.getSecondary(), fetVar2, 56, 0);
            v8q0.a(rsm0.w(R.string.tax_bonus_empty, 0, fetVar2), null, 0L, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, ibm0.t(g1t0.n(), fetVar2), fetVar, 0, 24960, 110590);
            if (uvo0Var instanceof tvo0) {
                fetVar.e0(-182755842);
                if (1.0f <= 0.0d) {
                    vcx.a("invalid weight; must be greater than zero");
                }
                v8q0.b(((tvo0) uvo0Var).f34610a, new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 0L, null, 0L, null, 0L, null, 0L, 2, false, 1, 0, null, null, g1t0.m(), fetVar, 0, 24960, 241660);
                fetVar.r(false);
            } else if (uvo0Var instanceof svo0) {
                fetVar.e0(-182467263);
                if (1.0f <= 0.0d) {
                    vcx.a("invalid weight; must be greater than zero");
                }
                a(0, fetVar, new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
                fetVar.r(false);
            } else {
                fetVar.e0(-182395188);
                fetVar.r(false);
            }
            acb.n(new zb(null, null, 7), z2, function0, null, fetVar, (i2 >> 3) & 1008, 8);
            fetVar2 = fetVar;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new l040((byte) 13, i, (Object) mm40Var, (Object) uvo0Var, (Object) function0, z);
        }
    }

    public static final void e(int i, fet fetVar, mm40 mm40Var, String str, String str2) {
        fet fetVar2 = fetVar;
        fetVar2.g0(2057606637);
        int i2 = i | (fetVar2.g(str) ? 32 : 16) | (fetVar2.g(str2) ? 256 : 128);
        if (fetVar2.U(i2 & 1, (i2 & 147) != 146)) {
            thg0 thg0VarA = shg0.a(uc9.g, gqw0.j, fetVar2, 6);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40Var);
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
            v8q0.a(str, new x7z(1.0f, true), 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, ibm0.n(g1t0.n(), fetVar2), fetVar2, (i2 >> 3) & 14, 0, 131068);
            v8q0.a(str2, o7k0.A(jm40.b, null, 3), 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, ibm0.t(g1t0.m(), fetVar2), fetVar2, ((i2 >> 6) & 14) | 48, 0, 131068);
            fetVar2 = fetVar2;
            fetVar2.r(true);
        } else {
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new man(mm40Var, str, str2, i, (byte) 23);
        }
    }

    public static final void f(int i, fet fetVar, a4x a4xVar, mm40 mm40Var) {
        mm40 mm40Var2;
        fetVar.g0(-2122082641);
        int i2 = (fetVar.g(a4xVar) ? 32 : 16) | i;
        if (!fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            mm40Var2 = mm40Var;
            fetVar.X();
        } else if (a4xVar.isEmpty()) {
            mm40Var2 = mm40Var;
            fetVar.e0(-1339723085);
            fetVar.r(false);
        } else {
            fetVar.e0(-1340138237);
            zcl zclVar = qmk.f28987a;
            mm40Var2 = mm40Var;
            mm40 mm40VarN = s5x0.N(mm40Var2, 0.0f, 8.0f, 0.0f, 0.0f, 13);
            x5d x5dVarA = w5d.a(new qw3(8.0f, true, new jf4((byte) 14)), gqw0.m, fetVar, 0);
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
            jpm0.o(fetVar, x5dVarA, gqw0.x);
            jpm0.o(fetVar, bh90VarM, gqw0.w);
            jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar);
            Iterator itO = h97.o(fetVar, mm40VarC0, gqw0.v, 1639800055, a4xVar);
            while (itO.hasNext()) {
                rvo0 rvo0Var = (rvo0) itO.next();
                e(6, fetVar, o7k0.d(jm40.b, 1.0f), rvo0Var.f31181a, rvo0Var.b);
            }
            ohs0.x(fetVar, false, true, false);
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new zw1(mm40Var2, a4xVar, i, (byte) 23);
        }
    }

    public static final void g(int i, fet fetVar, mm40 mm40Var) {
        fet fetVar2;
        fetVar.g0(436186783);
        int i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            zcl zclVar = qmk.f28987a;
            x5d x5dVarA = w5d.a(new qw3(4.0f, true, new jf4((byte) 14)), gqw0.m, fetVar, 0);
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
            fetVar.e0(-1362065556);
            int iB = 0;
            while (iB < 4) {
                mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
                zcl zclVar2 = qmk.f28987a;
                mm40 mm40VarE = o7k0.e(mm40VarD, 14.0f);
                zcl zclVar3 = qmk.i;
                ugg0 ugg0Var = vgg0.f37379a;
                iB = h97.b(h97.e(zclVar3, zclVar3, zclVar3, zclVar3, mm40VarE), vbc.d0(null, fetVar, 0, 1), fetVar, 0, iB, 1);
            }
            fetVar2 = fetVar;
            fetVar2.r(false);
            fetVar2.r(true);
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new cpl0(mm40Var, i, (byte) 7);
        }
    }

    public static final void h(mm40 mm40Var, lep0 lep0Var, fet fetVar, int i) {
        byte b;
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        fetVar2.g0(-1604061646);
        int i2 = i | 6 | (fetVar2.i(lep0Var) ? 32 : 16);
        if (fetVar2.U(i2 & 1, (i2 & 19) != 18)) {
            zcl zclVar = qmk.f28987a;
            jm40 jm40Var = jm40.b;
            mm40 mm40VarL = s5x0.L(o7k0.d(o7k0.e(jm40Var, 32.0f), 1.0f), 8.0f, 0.0f, 2);
            thg0 thg0VarA = shg0.a(uc9.f35418a, gqw0.k, fetVar2, 48);
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
            jpm0.o(fetVar2, thg0VarA, gqw0.x);
            jpm0.o(fetVar2, bh90VarM, gqw0.w);
            jpm0.o(fetVar2, Integer.valueOf(iHashCode), gqw0.y);
            jpm0.n(fetVar2);
            jpm0.o(fetVar2, mm40VarC0, gqw0.v);
            jep0 jep0Var = lep0Var.f19915a;
            iep0 iep0Var = jep0Var.b;
            iep0 iep0Var2 = jep0Var.f16386a;
            fetVar2.e0(-2002895105);
            String str = iep0Var2.f14645a;
            StaticColors staticColors = StaticColors.INSTANCE;
            long jM130getWhite600d7_KjU = staticColors.m130getWhite600d7_KjU();
            pge pgeVar = gqw0.f1;
            lgb.v(o7k0.n(jm40Var, 24.0f), o7k0.n(jm40Var, 24.0f), str, R.drawable.ic_glyph_circle_globe, jM130getWhite600d7_KjU, pgeVar, fetVar2, 196608, 0);
            String str2 = iep0Var2.b;
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            v8q0.a(str2, s5x0.N(new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 8.0f, 0.0f, 2.0f, 0.0f, 10), staticColors.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(5), 0L, 2, false, 2, 0, null, g1t0.e(), fetVar, 0, 24960, 109560);
            String str3 = iep0Var.b;
            if (1.0f <= 0.0d) {
                vcx.a("invalid weight; must be greater than zero");
            }
            v8q0.a(str3, s5x0.N(new x7z(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 2.0f, 0.0f, 8.0f, 0.0f, 10), staticColors.m123getWhite0d7_KjU(), null, 0L, null, null, null, 0L, new f2q0(6), 0L, 2, false, 2, 0, null, g1t0.e(), fetVar, 0, 24960, 109560);
            mm40Var2 = jm40Var;
            fetVar2 = fetVar;
            lgb.v(o7k0.n(mm40Var2, 24.0f), o7k0.n(mm40Var2, 24.0f), iep0Var.f14645a, R.drawable.ic_glyph_circle_globe, staticColors.m130getWhite600d7_KjU(), pgeVar, fetVar2, 196608, 0);
            fetVar2.r(false);
            b = 1;
            fetVar2.r(true);
        } else {
            b = 1;
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new a6p0(mm40Var2, lep0Var, i, b);
        }
    }

    /* JADX WARN: Code duplicated, block: B:79:0x0230  */
    /* JADX WARN: Code duplicated, block: B:80:0x0232  */
    /* JADX WARN: Code duplicated, block: B:84:0x023c  */
    public static final void i(l7m0 l7m0Var, Function1 function1, fet fetVar, int i) {
        Function1 function2;
        byte b;
        cl5 cl5Var;
        boolean z;
        Object objP;
        l7m0Var.getClass();
        function1.getClass();
        fetVar.g0(-1003449140);
        int i2 = i | (fetVar.g(l7m0Var) ? 4 : 2) | (fetVar.i(function1) ? 32 : 16);
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            zfn zfnVar = zaq0.b;
            long secondary = ((ThemeColors) fetVar.k(zfnVar)).getSecondary();
            long backgroundContent = ((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent();
            Object objP2 = fetVar.P();
            cl5 cl5Var2 = ukd.f35823a;
            if (objP2 == cl5Var2) {
                imm immVar = new imm(new ilm(secondary), new nlm(new hmm(10, ((zks0) l7m0Var.getValue()).c, ((zks0) l7m0Var.getValue()).d, false)), fmm.f9790a, backgroundContent, false, null);
                fetVar.o0(immVar);
                objP2 = immVar;
            }
            imm immVar2 = (imm) objP2;
            Object objP3 = fetVar.P();
            if (objP3 == cl5Var2) {
                objP3 = new imm(new ilm(secondary), new plm(((zks0) l7m0Var.getValue()).f44550a, secondary, fa50.f9191a), new dmm(new ta50(new wkm(3, R.drawable.ic_search_new, true, ra50.f30118a, secondary))), backgroundContent, false, null);
                fetVar.o0(objP3);
            }
            imm immVar3 = (imm) objP3;
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            jm40 jm40Var = jm40.b;
            mm40 mm40VarC0 = kbc.c0(fetVar, jm40Var);
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
            mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
            if (!((zks0) l7m0Var.getValue()).b) {
                immVar2 = immVar3;
            }
            int i3 = i2 & 112;
            boolean z2 = i3 == 32;
            Object objP4 = fetVar.P();
            if (z2 || objP4 == cl5Var2) {
                objP4 = new nas0(function1, (byte) 9);
                fetVar.o0(objP4);
            }
            Function0 function0 = (Function0) objP4;
            boolean z3 = i3 == 32;
            Object objP5 = fetVar.P();
            if (z3 || objP5 == cl5Var2) {
                objP5 = new xar0(function1, (byte) 10);
                fetVar.o0(objP5);
            }
            Function1 function3 = (Function1) objP5;
            boolean z4 = i3 == 32;
            Object objP6 = fetVar.P();
            if (z4 || objP6 == cl5Var2) {
                objP6 = new xar0(function1, (byte) 11);
                fetVar.o0(objP6);
            }
            Function1 function4 = (Function1) objP6;
            boolean z5 = i3 == 32;
            Object objP7 = fetVar.P();
            if (z5 || objP7 == cl5Var2) {
                b = 10;
                objP7 = new nas0(function1, b);
                fetVar.o0(objP7);
            } else {
                b = 10;
            }
            hlm.c(mm40VarD, immVar2, null, function0, null, function3, function4, null, (Function0) objP7, null, null, null, fetVar, 6, 0, 3732);
            mm40 mm40VarQ = i120.Q(o7k0.d(jm40Var, 1.0f), ((ThemeColors) fetVar.k(zfnVar)).getBackgroundContent(), jd8.n);
            hyl hylVar = ((zks0) l7m0Var.getValue()).e;
            vxl vxlVar = vxl.b;
            boolean z6 = i3 == 32;
            Object objP8 = fetVar.P();
            if (z6) {
                cl5Var = cl5Var2;
            } else {
                cl5Var = cl5Var2;
                if (objP8 != cl5Var) {
                    function2 = function1;
                }
                Function1 function5 = (Function1) objP8;
                if (i3 == 32) {
                    z = true;
                } else {
                    z = false;
                }
                objP = fetVar.P();
                if (z || objP == cl5Var) {
                    objP = new xar0(function2, (byte) 13);
                    fetVar.o0(objP);
                }
                ebc.r(mm40VarQ, hylVar, vxlVar, function5, (Function1) objP, fetVar, 384, 8);
                mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
                zcl zclVar = qmk.f28987a;
                jcb.v(mm40VarD2, 1.0f, ((ThemeColors) fetVar.k(zfnVar)).getSeparator60(), fetVar, 6, 0);
                fetVar.r(true);
            }
            function2 = function1;
            objP8 = new xar0(function2, (byte) 12);
            fetVar.o0(objP8);
            Function1 function6 = (Function1) objP8;
            if (i3 == 32) {
                z = true;
            } else {
                z = false;
            }
            objP = fetVar.P();
            if (z) {
                objP = new xar0(function2, (byte) 13);
                fetVar.o0(objP);
            } else {
                objP = new xar0(function2, (byte) 13);
                fetVar.o0(objP);
            }
            ebc.r(mm40VarQ, hylVar, vxlVar, function6, (Function1) objP, fetVar, 384, 8);
            mm40 mm40VarD3 = o7k0.d(jm40Var, 1.0f);
            zcl zclVar2 = qmk.f28987a;
            jcb.v(mm40VarD3, 1.0f, ((ThemeColors) fetVar.k(zfnVar)).getSeparator60(), fetVar, 6, 0);
            fetVar.r(true);
        } else {
            function2 = function1;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new ckq0(l7m0Var, function2, i, (byte) 10);
        }
    }

    public static final void j(final q6u0 q6u0Var, final Function1 function1, fet fetVar) {
        float f;
        float f2;
        q6u0Var.getClass();
        function1.getClass();
        boolean z = q6u0Var instanceof o6u0;
        cl5 cl5Var = ukd.f35823a;
        final byte b = 0;
        final byte b2 = 1;
        jm40 jm40Var = jm40.b;
        if (z) {
            fetVar.e0(2009264145);
            o6u0 o6u0Var = (o6u0) q6u0Var;
            int iOrdinal = o6u0Var.f.ordinal();
            if (iOrdinal == 1 || iOrdinal == 2) {
                zcl zclVar = qmk.f28987a;
                f2 = 8.0f;
            } else {
                zcl zclVar2 = qmk.f28987a;
                f2 = 0.0f;
            }
            mm40 mm40VarD = o7k0.d(s5x0.L(s5x0.N(jm40Var, 0.0f, f2, 0.0f, 0.0f, 13), qmk.a(fetVar).c, 0.0f, 2), 1.0f);
            pz40 pz40Var = s6t0.f31722a;
            long backgroundContent = s6t0.b().f33626a.getBackgroundContent();
            zcl zclVar3 = qmk.i;
            ugg0 ugg0Var = vgg0.f37379a;
            mm40 mm40VarE0 = o2e.e0(i120.Q(mm40VarD, backgroundContent, new ugg0(zclVar3, zclVar3, zclVar3, zclVar3)), "VENUE_CELL_DEFAULT");
            boolean zG = fetVar.g(function1) | fetVar.g(q6u0Var);
            Object objP = fetVar.P();
            if (zG || objP == cl5Var) {
                objP = new Function0() { // from class: a.n6u0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        byte b3 = b;
                        q6u0 q6u0Var2 = q6u0Var;
                        Function1 function2 = function1;
                        switch (b3) {
                            case 0:
                                o6u0 o6u0Var2 = (o6u0) q6u0Var2;
                                function2.invoke(new jrk0(o6u0Var2.b, o6u0Var2.c));
                                break;
                            default:
                                p6u0 p6u0Var = (p6u0) q6u0Var2;
                                function2.invoke(new jrk0(p6u0Var.b, p6u0Var.c));
                                break;
                        }
                        return Unit.f46060a;
                    }
                };
                fetVar.o0(objP);
            }
            yqm0.f(mm40VarE0, o6u0Var, (Function0) objP, fetVar, 0);
            fetVar.r(false);
            return;
        }
        if (!(q6u0Var instanceof p6u0)) {
            throw b1j.f(757550695, fetVar, false);
        }
        fetVar.e0(2010216062);
        pz40 pz40VarF = androidx.compose.runtime.e.f(q6u0Var, fetVar);
        v12 v12Var = ((p6u0) q6u0Var).e;
        int iOrdinal2 = v12Var.ordinal();
        if (iOrdinal2 == 1 || iOrdinal2 == 2) {
            zcl zclVar4 = qmk.f28987a;
            f = 4.0f;
        } else {
            zcl zclVar5 = qmk.f28987a;
            f = 0.0f;
        }
        int iOrdinal3 = v12Var.ordinal();
        mm40 mm40VarE = o7k0.e(o7k0.d(s5x0.L(s5x0.N(jm40Var, 0.0f, f, 0.0f, (iOrdinal3 == 2 || iOrdinal3 == 3) ? 8.0f : 0.0f, 5), qmk.a(fetVar).c, 0.0f, 2), 1.0f), 64.0f);
        pz40 pz40Var2 = s6t0.f31722a;
        long backgroundContent2 = s6t0.b().f33626a.getBackgroundContent();
        zcl zclVar6 = qmk.k;
        ugg0 ugg0Var2 = vgg0.f37379a;
        mm40 mm40VarQ = i120.Q(mm40VarE, backgroundContent2, new ugg0(zclVar6, zclVar6, zclVar6, zclVar6));
        boolean zG2 = fetVar.g(function1) | fetVar.g(q6u0Var);
        Object objP2 = fetVar.P();
        if (zG2 || objP2 == cl5Var) {
            objP2 = new Function0() { // from class: a.n6u0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    byte b3 = b2;
                    q6u0 q6u0Var2 = q6u0Var;
                    Function1 function2 = function1;
                    switch (b3) {
                        case 0:
                            o6u0 o6u0Var2 = (o6u0) q6u0Var2;
                            function2.invoke(new jrk0(o6u0Var2.b, o6u0Var2.c));
                            break;
                        default:
                            p6u0 p6u0Var = (p6u0) q6u0Var2;
                            function2.invoke(new jrk0(p6u0Var.b, p6u0Var.c));
                            break;
                    }
                    return Unit.f46060a;
                }
            };
            fetVar.o0(objP2);
        }
        msm0.e(s5x0.L(y860.W(mm40VarQ, null, null, false, null, (Function0) objP2, 28), 12.0f, 0.0f, 2), pz40VarF, fetVar, 0);
        fetVar.r(false);
    }

    public static final void k(o0x o0xVar, o0x o0xVar2, Function1 function1, ugd ugdVar, ugd ugdVar2, fet fetVar, int i) {
        o0x o0xVar3;
        int i2;
        fet fetVar2;
        fetVar.g0(786934347);
        if ((i & 6) == 0) {
            o0xVar3 = o0xVar;
            i2 = (fetVar.g(o0xVar3) ? 4 : 2) | i;
        } else {
            o0xVar3 = o0xVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.g(o0xVar2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= fetVar.i(ugdVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= fetVar.i(ugdVar2) ? 16384 : 8192;
        }
        if (fetVar.U(i2 & 1, (i2 & 9363) != 9362)) {
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (objP == cl5Var) {
                objP = androidx.compose.runtime.e.e(hz3.f13888a);
                fetVar.o0(objP);
            }
            pz40 pz40Var = (pz40) objP;
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = androidx.compose.runtime.e.e(Boolean.FALSE);
                fetVar.o0(objP2);
            }
            pz40 pz40Var2 = (pz40) objP2;
            Object objA = ((Boolean) pz40Var2.getValue()).booleanValue() ? o0xVar2.a() : o0xVar3.a();
            Object objP3 = fetVar.P();
            if (objP3 == cl5Var) {
                objP3 = new cw7(pz40Var, pz40Var2, (byte) 9);
                fetVar.o0(objP3);
            }
            Object obj = objA;
            mz3 mz3VarX = l7x.X(obj, (Function1) objP3, null, fetVar, 384, 26);
            if (((lz3) pz40Var.getValue()) instanceof kz3) {
                fetVar.e0(1630562174);
                boolean z = ((i2 & 896) == 256) | ((i2 & 112) == 32) | ((i2 & 14) == 4);
                Object objP4 = fetVar.P();
                if (z || objP4 == cl5Var) {
                    o0x o0xVar4 = o0xVar3;
                    fetVar2 = fetVar;
                    u6t0 u6t0Var = new u6t0(function1, o0xVar2, o0xVar4, pz40Var2, null, (byte) 1);
                    fetVar2.o0(u6t0Var);
                    objP4 = u6t0Var;
                } else {
                    fetVar2 = fetVar;
                }
                m0x0.t(fetVar2, obj, (Function2) objP4);
                ugdVar.F(mz3VarX, fetVar2, Integer.valueOf((i2 >> 6) & 112));
                fetVar2.r(false);
            } else {
                fetVar2 = fetVar;
                fetVar2.e0(1630727218);
                twn.v((i2 >> 12) & 14, ugdVar2, fetVar2, false);
            }
        } else {
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new p4t0(o0xVar, o0xVar2, function1, ugdVar, ugdVar2, i);
        }
    }

    public static final String l(String str, String str2) {
        str.getClass();
        String query = new URI(str).getQuery();
        return str.concat((query == null || query.length() == 0) ? "?locale=".concat(str2) : "&locale=".concat(str2));
    }

    public static final ouu m(kzj0 kzj0Var, goc gocVar, int i) {
        if (gocVar == null || f2o.f(gocVar)) {
            return null;
        }
        int size = gocVar.M().size() + i;
        if (gocVar.i()) {
            List listSubList = kzj0Var.J().subList(i, size);
            vjj vjjVarJ = gocVar.j();
            return new ouu(gocVar, listSubList, m(kzj0Var, vjjVarJ instanceof goc ? (goc) vjjVarJ : null, size));
        }
        if (size != kzj0Var.J().size()) {
            oek.n(gocVar);
        }
        return new ouu(gocVar, kzj0Var.J().subList(i, kzj0Var.J().size()), (ouu) null);
    }

    public static final String n(String str, List list) {
        Object next;
        String strA;
        list.getClass();
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.d(((a9a0) next).a(), str));
        a9a0 a9a0Var = (a9a0) next;
        return (a9a0Var == null || (strA = a9a0Var.a()) == null) ? t(list) : strA;
    }

    public static final List o(goc gocVar) {
        List parameters;
        Object next;
        iys0 iys0VarH;
        List listM = gocVar.M();
        listM.getClass();
        if (!gocVar.i() && !(gocVar.j() instanceof kp9)) {
            return listM;
        }
        int i = rek.f30339a;
        ske skeVar = ske.r;
        Sequence sequenceG = pgi0.g(lgi0.e(skeVar, gocVar), 1);
        pnk0 pnk0Var = pnk0.j;
        sequenceG.getClass();
        List listT = pgi0.t(pgi0.k(pgi0.h(new tjt(sequenceG, pnk0Var), pnk0.k), pnk0.l));
        Iterator it = pgi0.g(lgi0.e(skeVar, gocVar), 1).iterator();
        do {
            parameters = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(next instanceof wm40));
        wm40 wm40Var = (wm40) next;
        if (wm40Var != null && (iys0VarH = wm40Var.h()) != null) {
            parameters = iys0VarH.getParameters();
        }
        if (parameters == null) {
            parameters = iun.f15405a;
        }
        if (listT.isEmpty() && parameters.isEmpty()) {
            List listM2 = gocVar.M();
            listM2.getClass();
            return listM2;
        }
        ArrayList<hzs0> arrayListQ0 = CollectionsKt.q0(listT, parameters);
        ArrayList arrayList = new ArrayList(r3d.q(arrayListQ0, 10));
        for (hzs0 hzs0Var : arrayListQ0) {
            hzs0Var.getClass();
            arrayList.add(new gaa(hzs0Var, gocVar, listM.size()));
        }
        return CollectionsKt.q0(listM, arrayList);
    }

    public static final int p(int i, CharSequence charSequence) {
        int length = charSequence.length();
        while (i < length) {
            if (charSequence.charAt(i) == '\n') {
                return i;
            }
            i++;
        }
        return charSequence.length();
    }

    public static final int q(int i, CharSequence charSequence) {
        while (i > 0) {
            if (charSequence.charAt(i - 1) == '\n') {
                return i;
            }
            i--;
        }
        return 0;
    }

    public static final a8h0 s(sfp0 sfp0Var) {
        ArrayList arrayList = sfp0Var.c;
        ArrayList arrayList2 = sfp0Var.d;
        String str = sfp0Var.f32128a;
        if (arrayList.isEmpty()) {
            return !arrayList2.isEmpty() ? new a8h0(str, new x7h0(t(arrayList2))) : new a8h0(str, null);
        }
        v800 v800Var = (v800) CollectionsKt.U(arrayList);
        return new a8h0(str, new y7h0(Integer.valueOf(v800Var.b), t(v800Var.c)));
    }

    public static final String t(List list) {
        Object next;
        list.getClass();
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((a9a0) next).e());
        a9a0 a9a0Var = (a9a0) next;
        if (a9a0Var != null) {
            return a9a0Var.a();
        }
        return null;
    }

    public static final sfp0 u(List list) {
        Object next;
        list.getClass();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (!((sfp0) next).d.isEmpty()) {
                return (sfp0) next;
            }
        }
        next = null;
        return (sfp0) next;
    }

    public static final sfp0 v(List list) {
        Object next;
        list.getClass();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (!((sfp0) next).c.isEmpty()) {
                return (sfp0) next;
            }
        }
        next = null;
        return (sfp0) next;
    }

    public static final int w(HashMap map, vcr0 vcr0Var, String str) {
        Object objValueOf = map.get(str);
        if (objValueOf == null) {
            objValueOf = Integer.valueOf((int) (g9q0.a(vcr0Var.g, str, vcr0Var.c, 0, 1, 0L, null, 1004).c >> 32));
            map.put(str, objValueOf);
        }
        return ((Number) objValueOf).intValue();
    }

    public static final hu5 x(cvv0 cvv0Var) {
        fsv0 fsv0Var = new fsv0(kxv0.f19078a, ktt0.r(cvv0Var));
        Integer numO = ktt0.o(cvv0Var);
        List listZ = tx3.z(new fsv0[]{fsv0Var, numO != null ? new fsv0(ixv0.f15562a, numO.intValue()) : null});
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : (ArrayList) listZ) {
            if (hashSet.add(Integer.valueOf(((fsv0) obj).b))) {
                arrayList.add(obj);
            }
        }
        return new hu5(CollectionsKt.A0(arrayList, new jzt0((byte) 4)));
    }

    public static final r7n y(fgm fgmVar) {
        fgmVar.getClass();
        int iOrdinal = fgmVar.ordinal();
        if (iOrdinal == 0) {
            return r7n.f29985a;
        }
        if (iOrdinal == 1) {
            return r7n.b;
        }
        if (iOrdinal == 2) {
            return r7n.c;
        }
        t9f.b();
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r45v3, types: [a.f2i] */
    /* JADX WARN: Type inference failed for: r48v2, types: [a.p0n] */
    public static final cml0 z(d0t d0tVar, String str, ArrayList arrayList, y78 y78Var, v5l0 v5l0Var, ctf0 ctf0Var, boolean z, boolean z2, boolean z3, boolean z4, String str2, boolean z5) {
        p6x p6xVar;
        gzm ezmVar;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        r0n p0nVar;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        e4i e4iVar;
        p6x p6xVar2;
        p6x p6xVar3;
        gzm ezmVar2;
        Date date = d0tVar.P;
        long j = d0tVar.f5282a;
        rqs rqsVar = d0tVar.p;
        ctf0Var.getClass();
        int iOrdinal = v5l0Var.ordinal();
        dzm dzmVar = dzm.f6947a;
        fzm fzmVar = fzm.f10414a;
        if (iOrdinal == 0) {
            fol0 fol0VarP = wdx.P(d0tVar, str, arrayList, z2, z3, str2, kpb.b0(d0tVar, z), kpb.d0(d0tVar, z), kpb.a0(d0tVar, z, z4), kpb.f0(d0tVar, z));
            int i = gql0.f11739a;
            int i2 = rqsVar.g;
            boolean z6 = i2 > 0;
            boolean z7 = i2 == 1;
            boolean z8 = z6 && z7;
            boolean z9 = z6 && !z7;
            czm czmVarR = msm0.r(d0tVar);
            czm czmVarS = msm0.s(d0tVar);
            tym tymVarR = fxb.R(d0tVar, ctf0Var);
            tym tymVarS = fxb.S(d0tVar);
            tym tymVarT = fxb.T(d0tVar, ctf0Var);
            if (z8) {
                p6xVar = p6x.f26478a;
            } else {
                p6xVar = z9 ? p6x.b : p6x.c;
            }
            p6x p6xVar4 = p6xVar;
            String strU = fxb.U(d0tVar, ctf0Var);
            if (kpb.j0(d0tVar)) {
                long jU0 = kpb.u0(d0tVar);
                fgm fgmVar = fgm.f9498a;
                ezmVar = new ezm(jU0, kpb.j0(d0tVar), date.getTime());
            } else {
                ezmVar = kpb.e0(d0tVar) ? fzmVar : dzmVar;
            }
            return new xll0(j, fol0VarP, new oml0(new hzm(czmVarR, czmVarS, tymVarR, tymVarS, tymVarT, p6xVar4, new rym(strU, ezmVar))));
        }
        xem xemVar = tem.f33827a;
        wem wemVar = wem.f39025a;
        vem vemVar = vem.f37292a;
        String str15 = "";
        Object p0nVar2 = null;
        if (iOrdinal == 1) {
            pz40 pz40Var = s6t0.f31722a;
            jol0 jol0VarT = wdx.T(d0tVar, str, arrayList, z2, z3, new y3d(StaticColors.INSTANCE.m113getRed0d7_KjU()), str2, kpb.b0(d0tVar, z), kpb.d0(d0tVar, z));
            int i3 = gql0.f11739a;
            int i4 = rqsVar.g;
            boolean z10 = i4 > 0;
            boolean z11 = i4 == 1;
            boolean z12 = z10 && z11;
            boolean z13 = z10 && !z11;
            String strS0 = qzb.s0(d0tVar);
            tym tymVarR2 = fxb.R(d0tVar, ctf0Var);
            String str16 = (tymVarR2 == null || (str8 = tymVarR2.b) == null) ? "" : str8;
            tym tymVarS2 = fxb.S(d0tVar);
            String str17 = (tymVarS2 == null || (str7 = tymVarS2.b) == null) ? "" : str7;
            String str18 = fxb.T(d0tVar, ctf0Var).b;
            tym tymVarR3 = fxb.R(d0tVar, ctf0Var);
            boolean z14 = tymVarR3 != null ? tymVarR3.d : false;
            tym tymVarS3 = fxb.S(d0tVar);
            z0n z0nVar = new z0n(strS0, 0, str16, str17, str18, fxb.T(d0tVar, ctf0Var).d, z14, tymVarS3 != null ? tymVarS3.d : false);
            String strT0 = qzb.t0(d0tVar);
            tym tymVarR4 = fxb.R(d0tVar, ctf0Var);
            String str19 = (tymVarR4 == null || (str6 = tymVarR4.c) == null) ? "" : str6;
            tym tymVarS4 = fxb.S(d0tVar);
            String str20 = (tymVarS4 == null || (str5 = tymVarS4.c) == null) ? "" : str5;
            String str21 = fxb.T(d0tVar, ctf0Var).c;
            tym tymVarR5 = fxb.R(d0tVar, ctf0Var);
            boolean z15 = tymVarR5 != null ? tymVarR5.e : false;
            tym tymVarS5 = fxb.S(d0tVar);
            z0n z0nVar2 = new z0n(strT0, 0, str19, str20, str21, fxb.T(d0tVar, ctf0Var).e, z15, tymVarS5 != null ? tymVarS5.e : false);
            p0nVar2 = kpb.j0(d0tVar) ? new p0n(kpb.u0(d0tVar), fgm.b, date.getTime(), kpb.j0(d0tVar), 16) : null;
            String strU2 = fxb.U(d0tVar, ctf0Var);
            tym tymVarR6 = fxb.R(d0tVar, ctf0Var);
            if (tymVarR6 == null || (str3 = tymVarR6.f34762a) == null) {
                str3 = "";
            }
            tym tymVarS6 = fxb.S(d0tVar);
            if (tymVarS6 != null && (str4 = tymVarS6.f34762a) != null) {
                str15 = str4;
            }
            String str22 = fxb.T(d0tVar, ctf0Var).f34762a;
            if (z12) {
                xemVar = vemVar;
            } else if (z13) {
                xemVar = wemVar;
            }
            return new bml0(j, jol0VarT, new unl0(z0nVar, z0nVar2, strU2, p0nVar2, str3, str15, str22, xemVar));
        }
        if (iOrdinal != 2) {
            if (iOrdinal != 3) {
                if (iOrdinal != 4) {
                    t9f.b();
                    return null;
                }
                gol0 gol0VarQ = wdx.Q(d0tVar, str, arrayList, z2, z3, str2, kpb.b0(d0tVar, z), kpb.d0(d0tVar, z), kpb.a0(d0tVar, z, z4), kpb.f0(d0tVar, z));
                int i5 = gql0.f11739a;
                int i6 = rqsVar.g;
                boolean z16 = i6 > 0;
                boolean z17 = i6 == 1;
                boolean z18 = z16 && z17;
                boolean z19 = z16 && !z17;
                czm czmVarR2 = msm0.r(d0tVar);
                czm czmVarS2 = msm0.s(d0tVar);
                tym tymVarR7 = fxb.R(d0tVar, ctf0Var);
                tym tymVarS7 = fxb.S(d0tVar);
                tym tymVarT2 = fxb.T(d0tVar, ctf0Var);
                if (z18) {
                    p6xVar3 = p6x.f26478a;
                } else {
                    p6xVar3 = z19 ? p6x.b : p6x.c;
                }
                p6x p6xVar5 = p6xVar3;
                String strA = ctf0Var.b.a(R.string.live_new, Arrays.copyOf(new Object[0], 0));
                String strU3 = fxb.U(d0tVar, ctf0Var);
                if (kpb.e0(d0tVar)) {
                    ezmVar2 = fzmVar;
                } else {
                    ezmVar2 = kpb.j0(d0tVar) ? new ezm(20, kpb.u0(d0tVar), 0L, kpb.j0(d0tVar)) : dzmVar;
                }
                return new yll0(j, gol0VarQ, new wml0(new jzm(czmVarR2, czmVarS2, tymVarR7, tymVarS7, tymVarT2, p6xVar5, new sym(strA, strU3, ezmVar2))));
            }
            long j2 = d0tVar.f5282a;
            n0x n0xVar = new n0x(dtb.F(str));
            String strH = kpb.H(d0tVar, y78Var, z5);
            boolean zE0 = kpb.e0(d0tVar);
            String strA2 = ctf0Var.b.a(R.string.live_new, Arrays.copyOf(new Object[0], 0));
            boolean zB0 = kpb.b0(d0tVar, z);
            boolean zD0 = kpb.d0(d0tVar, z);
            boolean zA0 = kpb.a0(d0tVar, z, z4);
            boolean zF0 = kpb.f0(d0tVar, z);
            if (kpb.j0(d0tVar)) {
                long jU1 = kpb.u0(d0tVar);
                fgm fgmVar2 = fgm.f9498a;
                e4iVar = new e4i(8, jU1, date.getTime(), kpb.j0(d0tVar));
            } else {
                e4iVar = null;
            }
            hol0 hol0VarR = wdx.R(d0tVar, str, arrayList, z2, strH, e4iVar, z3, strA2, zE0, str2, zB0, zD0, zA0, zF0);
            int i7 = gql0.f11739a;
            int i8 = rqsVar.g;
            boolean z20 = i8 > 0;
            boolean z21 = i8 == 1;
            boolean z22 = z20 && z21;
            boolean z23 = z20 && !z21;
            czm czmVarR3 = msm0.r(d0tVar);
            czm czmVarS3 = msm0.s(d0tVar);
            tym tymVarR8 = fxb.R(d0tVar, ctf0Var);
            tym tymVarS8 = fxb.S(d0tVar);
            tym tymVarT3 = fxb.T(d0tVar, ctf0Var);
            if (z22) {
                p6xVar2 = p6x.f26478a;
            } else {
                p6xVar2 = z23 ? p6x.b : p6x.c;
            }
            return new zll0(j2, n0xVar, hol0VarR, new enl0(new izm(czmVarR3, czmVarS3, tymVarR8, tymVarS8, tymVarT3, p6xVar2)));
        }
        boolean z24 = true;
        iol0 iol0VarS = wdx.S(d0tVar, str, arrayList, z2, z3, str2, kpb.b0(d0tVar, z), kpb.d0(d0tVar, z));
        boolean zA1 = kpb.a0(d0tVar, z, z4);
        boolean zF1 = kpb.f0(d0tVar, z);
        int i9 = gql0.f11739a;
        int i10 = rqsVar.g;
        boolean z25 = i10 > 0;
        boolean z26 = i10 == 1;
        boolean z27 = z25 && z26;
        if (!z25 || z26) {
            z24 = false;
        }
        String strS1 = qzb.s0(d0tVar);
        d280 d280Var = msm0.r(d0tVar).b;
        tym tymVarR9 = fxb.R(d0tVar, ctf0Var);
        String str23 = (tymVarR9 == null || (str14 = tymVarR9.b) == null) ? "" : str14;
        tym tymVarS9 = fxb.S(d0tVar);
        String str24 = (tymVarS9 == null || (str13 = tymVarS9.b) == null) ? "" : str13;
        String str25 = fxb.T(d0tVar, ctf0Var).b;
        tym tymVarR10 = fxb.R(d0tVar, ctf0Var);
        boolean z28 = tymVarR10 != null ? tymVarR10.d : false;
        tym tymVarS10 = fxb.S(d0tVar);
        a1n a1nVar = new a1n(strS1, d280Var, 0, str23, str24, str25, fxb.T(d0tVar, ctf0Var).d, z28, tymVarS10 != null ? tymVarS10.d : false);
        String strT1 = qzb.t0(d0tVar);
        d280 d280Var2 = msm0.s(d0tVar).b;
        tym tymVarR11 = fxb.R(d0tVar, ctf0Var);
        String str26 = (tymVarR11 == null || (str12 = tymVarR11.c) == null) ? "" : str12;
        tym tymVarS11 = fxb.S(d0tVar);
        String str27 = (tymVarS11 == null || (str11 = tymVarS11.c) == null) ? "" : str11;
        String str28 = fxb.T(d0tVar, ctf0Var).c;
        tym tymVarR12 = fxb.R(d0tVar, ctf0Var);
        boolean z29 = tymVarR12 != null ? tymVarR12.e : false;
        tym tymVarS12 = fxb.S(d0tVar);
        a1n a1nVar2 = new a1n(strT1, d280Var2, 0, str26, str27, str28, fxb.T(d0tVar, ctf0Var).e, z29, tymVarS12 != null ? tymVarS12.e : false);
        String strU4 = fxb.U(d0tVar, ctf0Var);
        tym tymVarR13 = fxb.R(d0tVar, ctf0Var);
        if (tymVarR13 == null || (str9 = tymVarR13.f34762a) == null) {
            str9 = "";
        }
        tym tymVarS13 = fxb.S(d0tVar);
        if (tymVarS13 != null && (str10 = tymVarS13.f34762a) != null) {
            str15 = str10;
        }
        String str29 = fxb.T(d0tVar, ctf0Var).f34762a;
        if (z27) {
            xemVar = vemVar;
        } else if (z24) {
            xemVar = wemVar;
        }
        if (zF1) {
            p0nVar2 = e2i.f7087a;
        } else if (zA1) {
            p0nVar2 = c2i.f3624a;
        }
        String strA3 = ctf0Var.b.a(R.string.live_new, Arrays.copyOf(new Object[0], 0));
        if (kpb.e0(d0tVar)) {
            p0nVar = q0n.f27908a;
        } else {
            p0nVar = kpb.j0(d0tVar) ? new p0n(kpb.u0(d0tVar), fgm.b, date.getTime(), kpb.j0(d0tVar), 16) : o0n.f24435a;
        }
        return new aml0(j, iol0VarS, new mnl0(p0nVar2, xemVar, p0nVar, a1nVar, a1nVar2, str9, str15, str29, strU4, strA3));
    }

    public abstract a4x r();
}
