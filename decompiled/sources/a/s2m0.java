package a;

import java.util.List;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final class s2m0 implements ff60 {
    public static t2m0 a(int i) {
        Object next;
        c0o c0oVar = t2m0.l;
        y2 y2VarH = ohs0.h(c0oVar, c0oVar);
        do {
            if (!y2VarH.hasNext()) {
                next = null;
                break;
            }
            next = y2VarH.next();
        } while (((t2m0) next).f33223a != i);
        t2m0 t2m0Var = (t2m0) next;
        return t2m0Var == null ? t2m0.NO_COLOR : t2m0Var;
    }

    public static int b(goo0 goo0Var) {
        goo0Var.getClass();
        switch (goo0Var.ordinal()) {
            case 0:
                return R.style.Widget_DSTag_RectangularL_Filled_Outlined_Primary;
            case 1:
                return R.style.Widget_DSTag_RectangularL_Filled_Outlined_Secondary;
            case 2:
                return R.style.Widget_DSTag_RectangularL_Filled_Outlined_Light;
            case 3:
            default:
                return R.style.Widget_DSTag_RectangularL_Filled_Outlined_Red;
            case 4:
                return R.style.Widget_DSTag_RectangularL_Filled_Outlined_Green;
            case 5:
                return R.style.Widget_DSTag_RectangularL_Filled_Outlined_Violet;
            case 6:
                return R.style.Widget_DSTag_RectangularL_Filled_Outlined_Purple;
            case 7:
                return R.style.Widget_DSTag_RectangularL_Filled_Outlined_Blue;
            case 8:
                return R.style.Widget_DSTag_RectangularL_Filled_Outlined_Teal;
            case 9:
                return R.style.Widget_DSTag_RectangularL_Filled_Outlined_Yellow;
            case 10:
                return R.style.Widget_DSTag_RectangularL_Filled_Outlined_Orange;
            case 11:
                return R.style.Widget_DSTag_RectangularL_Filled_Outlined_DarkOrange;
            case 12:
                return R.style.Widget_DSTag_RectangularL_Filled_Outlined_Pink;
            case 13:
                return R.style.Widget_DSTag_RectangularL_Filled_Outlined_DarkPink;
            case 14:
                return R.style.Widget_DSTag_RectangularL_Filled_Outlined_Gray;
            case 15:
                return R.style.Widget_DSTag_RectangularL_Filled_Outlined_DarkGray;
            case 16:
                return R.style.Widget_DSTag_RectangularL_Filled_Outlined_White;
        }
    }

    public static void c(androidx.fragment.app.e eVar, String str, String str2) {
        eVar.getClass();
        str2.getClass();
        String strJ = sre0.f32672a.b(ilq0.class).J();
        if (eVar.J(strJ) != null) {
            return;
        }
        ilq0 ilq0Var = new ilq0();
        iiy[] iiyVarArr = ilq0.m2;
        ilq0Var.j2.x(ilq0Var, iiyVarArr[1], str);
        ilq0Var.k2.x(ilq0Var, iiyVarArr[2], str2);
        ilq0Var.H0(eVar, strJ);
    }

    public static void e(androidx.fragment.app.e eVar, List list) {
        eVar.getClass();
        String strJ = sre0.f32672a.b(gbq0.class).J();
        if (eVar.J(strJ) == null) {
            gbq0 gbq0Var = new gbq0();
            iiy[] iiyVarArr = gbq0.n2;
            gbq0Var.j2.D(gbq0Var, iiyVarArr[1], list);
            gbq0Var.k2.x(gbq0Var, iiyVarArr[2], "REQUEST_SELECT_THEME_DIALOG_KEY");
            gbq0Var.H0(eVar, strJ);
        }
    }

    @Override // a.ff60
    public long d(guo guoVar) {
        return -1L;
    }

    @Override // a.ff60
    public fvh0 i() {
        return new ca5(-9223372036854775807L);
    }

    @Override // a.ff60
    public void j(long j) {
    }
}
