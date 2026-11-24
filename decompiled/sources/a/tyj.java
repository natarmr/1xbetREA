package a;

import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.textfield.TextInputLayout;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlin.collections.CollectionsKt;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
public final class tyj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f34759a;
    public int b;

    public tyj(List list, int i, c8x c8xVar) {
        list.getClass();
        this.f34759a = list;
        this.b = i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:39:0x0061  */
    public ass0 a(int i, sbx0 sbx0Var) {
        String str = (String) sbx0Var.c;
        if (i != 2) {
            if (i == 3 || i == 4) {
                return new al90(new lv40(str, sbx0Var.g(), "video/mp2t"));
            }
            if (i == 21) {
                return new al90(new lfn());
            }
            if (i == 27) {
                if (d(4)) {
                    return null;
                }
                return new al90(new pjv(new y3v(b(sbx0Var)), d(1), d(8)));
            }
            if (i == 36) {
                return new al90(new rjv(new y3v(b(sbx0Var))));
            }
            if (i == 45) {
                return new al90(new nv40());
            }
            if (i == 89) {
                return new al90(new lfn((List) sbx0Var.d));
            }
            if (i == 172) {
                return new al90(new g6((byte) 1, sbx0Var.g(), str, "video/mp2t"));
            }
            if (i == 257) {
                return new anh0(new ywu("application/vnd.dvb.ait"));
            }
            if (i != 138) {
                if (i == 139) {
                    return new al90(new hbn(str, sbx0Var.g(), 5408));
                }
                switch (i) {
                    case 15:
                        if (d(2)) {
                            return null;
                        }
                        return new al90(new z20(sbx0Var.g(), str, "video/mp2t", false));
                    case 16:
                        return new al90(new mjv(new cyu(b(sbx0Var))));
                    case 17:
                        if (d(2)) {
                            return null;
                        }
                        return new al90(new v2z(str, sbx0Var.g()));
                    default:
                        switch (i) {
                            case 128:
                                break;
                            case 129:
                                return new al90(new g6((byte) 0, sbx0Var.g(), str, "video/mp2t"));
                            case 130:
                                if (!d(64)) {
                                    return null;
                                }
                                break;
                            default:
                                switch (i) {
                                    case 134:
                                        if (d(16)) {
                                            return null;
                                        }
                                        return new anh0(new ywu("application/x-scte35"));
                                    case 135:
                                        return new al90(new g6((byte) 0, sbx0Var.g(), str, "video/mp2t"));
                                    case 136:
                                        break;
                                    default:
                                        return null;
                                }
                                break;
                        }
                        break;
                }
            }
            return new al90(new hbn(str, sbx0Var.g(), 4096));
        }
        return new al90(new jjv(new cyu(b(sbx0Var)), "video/mp2t"));
    }

    public List b(sbx0 sbx0Var) {
        String str;
        int i;
        List listSingletonList;
        List list = this.f34759a;
        if (d(32)) {
            return list;
        }
        fq80 fq80Var = new fq80((byte[]) sbx0Var.e);
        while (fq80Var.a() > 0) {
            int iZ = fq80Var.z();
            int iZ2 = fq80Var.b + fq80Var.z();
            if (iZ == 134) {
                ArrayList arrayList = new ArrayList();
                int iZ3 = fq80Var.z() & 31;
                for (int i2 = 0; i2 < iZ3; i2++) {
                    String strX = fq80Var.x(3, StandardCharsets.UTF_8);
                    int iZ4 = fq80Var.z();
                    boolean z = (iZ4 & 128) != 0;
                    if (z) {
                        i = iZ4 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i = 1;
                    }
                    byte bZ = (byte) fq80Var.z();
                    fq80Var.N(1);
                    if (z) {
                        boolean z2 = (bZ & 64) != 0;
                        byte[] bArr = jyc.f17352a;
                        listSingletonList = Collections.singletonList(z2 ? new byte[]{1} : new byte[]{0});
                    } else {
                        listSingletonList = null;
                    }
                    awq awqVar = new awq();
                    awqVar.o = mg40.n(str);
                    awqVar.d = strX;
                    awqVar.O = i;
                    awqVar.r = listSingletonList;
                    arrayList.add(new androidx.media3.common.b(awqVar));
                }
                list = arrayList;
            }
            fq80Var.M(iZ2);
        }
        return list;
    }

    public xhh0 c(ctf0 ctf0Var) {
        ctf0Var.getClass();
        List list = this.f34759a;
        String strA = ctf0Var.b.a(R.string.search_result, Arrays.copyOf(new Object[]{Integer.valueOf(list.isEmpty() ? 0 : this.b + 1), Integer.valueOf(list.size())}, 2));
        lk50 lk50Var = (lk50) CollectionsKt.W(this.b, list);
        int i = this.b;
        boolean z = true;
        boolean z2 = i > 0;
        if (i >= list.size() - 1) {
            z = false;
        }
        return new xhh0(strA, lk50Var, list, z2, z);
    }

    public boolean d(int i) {
        return (this.b & i) != 0;
    }

    public d8x e(c8x c8xVar) {
        tlu0 tlu0Var;
        int i = this.b;
        List list = this.f34759a;
        if (i == list.size()) {
            return new d8x((View) c8xVar.e.invoke(), c8xVar.f3935a, c8xVar.b, c8xVar.c);
        }
        tyj tyjVar = new tyj(list, i + 1, c8xVar);
        ((ys00) list.get(i)).getClass();
        d8x d8xVarE = tyjVar.e(c8xVar);
        View view = d8xVarE.f5672a;
        AttributeSet attributeSet = d8xVarE.d;
        if (view != null && attributeSet != null) {
            if (view instanceof Toolbar) {
                tlu0Var = hfk0.e;
            } else if (view instanceof TextView) {
                tlu0Var = gfk0.d;
            } else {
                tlu0Var = view instanceof TextInputLayout ? rek0.e : lwf.k;
            }
            tlu0Var.e(view, attributeSet);
        }
        return d8xVarE;
    }

    public /* synthetic */ tyj(int i, List list) {
        this.b = i;
        this.f34759a = list;
    }

    public tyj(List list) {
        list.getClass();
        this.f34759a = list;
    }
}
