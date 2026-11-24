package a;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import androidx.camera.core.ImageProcessingUtil;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import org.xplatform.bet_history.history.domain.model.HistoryTypeModel;

/* JADX INFO: loaded from: classes.dex */
public final class bst {
    public /* synthetic */ bst(Object obj) {
    }

    public static prz b(String str) {
        str.getClass();
        prz przVar = prz.ACTIVE;
        if (str.equals("ACTIVE")) {
            return przVar;
        }
        prz przVar2 = prz.PENDING;
        if (str.equals("PENDING")) {
            return przVar2;
        }
        prz przVar3 = prz.INACTIVE;
        str.equals("INACTIVE");
        return przVar3;
    }

    public static trz c(int i) {
        bsz bszVar = bsz.b;
        if (i != -1) {
            he7 he7Var = he7.BET_LIMIT_1_DAY;
            if (i == 1) {
                return he7Var;
            }
            he7 he7Var2 = he7.BET_LIMIT_7_DAY;
            if (i == 2) {
                return he7Var2;
            }
            he7 he7Var3 = he7.BET_LIMIT_30_DAY;
            if (i == 3) {
                return he7Var3;
            }
            q7k q7kVar = q7k.DEPOSIT_LIMIT_1_DAY;
            if (i == 20) {
                return q7kVar;
            }
            q7k q7kVar2 = q7k.DEPOSIT_LIMIT_7_DAY;
            if (i == 21) {
                return q7kVar2;
            }
            q7k q7kVar3 = q7k.DEPOSIT_LIMIT_30_DAY;
            if (i == 22) {
                return q7kVar3;
            }
            miq0 miq0Var = miq0.f21857a;
            if (i == 30) {
                return miq0Var;
            }
        }
        return bszVar;
    }

    public static i4 d(ql5 ql5Var, sff0 sff0Var) {
        ql5Var.getClass();
        ArrayList arrayListL = q3d.l(HistoryTypeModel.EVENTS);
        gx7 gx7Var = sff0Var.f32117a;
        q57 q57Var = gx7Var.b;
        txs0 txs0Var = ql5Var.i;
        boolean zE = txs0Var.e();
        if (gx7Var.e && zE) {
            arrayListL.add(HistoryTypeModel.TOTO);
        }
        if (sff0Var.Y != 0) {
            arrayListL.add(HistoryTypeModel.JACKPOT);
        }
        if (txs0Var.e() && gx7Var.f12063a.i) {
            arrayListL.add(HistoryTypeModel.AUTO);
        }
        if (q57Var.e) {
            arrayListL.add(HistoryTypeModel.AGGREGATOR);
        }
        if (q57Var.c) {
            arrayListL.add(HistoryTypeModel.UNSETTLED);
        }
        if (q57Var.i && txs0Var.e()) {
            arrayListL.add(HistoryTypeModel.LOTTO);
        }
        return dyb.r0(arrayListL);
    }

    public static boolean g(q4f q4fVar) {
        q4fVar.getClass();
        return !q3d.j(q4f.m, q4f.g, q4f.h, q4f.k, q4f.j, q4f.f).contains(q4fVar);
    }

    public Object a(Object obj) throws Throwable {
        UnsupportedOperationException unsupportedOperationException;
        Throwable th;
        Bitmap bitmapCreateBitmap;
        n45 n45Var = (n45) obj;
        int i = n45Var.c;
        Object obj2 = n45Var.f22883a;
        int i2 = n45Var.f;
        ibe0 ibe0Var = null;
        try {
            try {
                if (i == 35) {
                    b1x b1xVar = (b1x) obj2;
                    boolean z = i2 % 180 != 0;
                    ibe0 ibe0Var2 = new ibe0(g1x.r(z ? b1xVar.f() : b1xVar.j(), z ? b1xVar.j() : b1xVar.f(), 1, 2));
                    try {
                        oyw oywVarC = ImageProcessingUtil.c(b1xVar, ibe0Var2, ByteBuffer.allocateDirect(b1xVar.j() * b1xVar.f() * 4), i2);
                        b1xVar.close();
                        if (oywVarC == null) {
                            throw new ozw(0, "Can't covert YUV to RGB", null);
                        }
                        bitmapCreateBitmap = m2x.q(oywVarC);
                        oywVarC.close();
                        ibe0Var = ibe0Var2;
                    } catch (UnsupportedOperationException e) {
                        unsupportedOperationException = e;
                        throw new ozw(0, "Can't convert " + (i == 35 ? "YUV" : "JPEG") + " to bitmap", unsupportedOperationException);
                    } catch (Throwable th2) {
                        th = th2;
                        ibe0Var = ibe0Var2;
                        if (ibe0Var == null) {
                            throw th;
                        }
                        ibe0Var.close();
                        throw th;
                    }
                } else {
                    if (i != 256 && i != 4101) {
                        throw new IllegalArgumentException("Invalid postview image format : " + i);
                    }
                    b1x b1xVar2 = (b1x) obj2;
                    Bitmap bitmapQ = m2x.q(b1xVar2);
                    b1xVar2.close();
                    Matrix matrix = new Matrix();
                    matrix.postRotate(i2);
                    bitmapCreateBitmap = Bitmap.createBitmap(bitmapQ, 0, 0, bitmapQ.getWidth(), bitmapQ.getHeight(), matrix, true);
                }
                if (ibe0Var != null) {
                    ibe0Var.close();
                }
                return bitmapCreateBitmap;
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (UnsupportedOperationException e2) {
            unsupportedOperationException = e2;
        }
    }

    public String e(long j, String str) {
        str.getClass();
        return wxs0.g(j, str);
    }

    public List f(uaq0 uaq0Var) {
        uaq0.f35345a.getClass();
        String str = "/static/img/android/instructions/onboarding_statistic_chart_screen/1_l.png";
        if (!s9m0.j(uaq0Var)) {
            if (s9m0.i(uaq0Var)) {
                str = "/static/img/android/instructions/onboarding_statistic_chart_screen/1_d.png";
            } else if (s9m0.k(uaq0Var)) {
                str = "/static/img/android/instructions/onboarding_statistic_chart_screen/1_n.png";
            }
        }
        return kotlin.collections.a.c(new ifm0(str));
    }
}
