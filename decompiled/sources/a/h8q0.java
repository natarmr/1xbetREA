package a;

import android.gov.nist.core.Separators;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class h8q0 extends fxw {
    public final String b;
    public final b4x c;

    public h8q0(String str, String str2, rcf0 rcf0Var) {
        super(str);
        x0x.A(!rcf0Var.isEmpty());
        this.b = str2;
        b4x b4xVarO = b4x.o(rcf0Var);
        this.c = b4xVarO;
    }

    public static ArrayList d(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
                return arrayList;
            }
            if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                return arrayList;
            }
            if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    @Override // a.cd40
    public final void b(hbi hbiVar) {
        byte b;
        Integer numValueOf;
        switch (this.f10332a) {
            case "TAL":
                b = 0;
                break;
            case "TCM":
                b = 1;
                break;
            case "TDA":
                b = 2;
                break;
            case "TP1":
                b = 3;
                break;
            case "TP2":
                b = 4;
                break;
            case "TP3":
                b = 5;
                break;
            case "TRK":
                b = 6;
                break;
            case "TT2":
                b = 7;
                break;
            case "TXT":
                b = 8;
                break;
            case "TYE":
                b = 9;
                break;
            case "TALB":
                b = 10;
                break;
            case "TCOM":
                b = 11;
                break;
            case "TCON":
                b = 12;
                break;
            case "TDAT":
                b = 13;
                break;
            case "TDRC":
                b = 14;
                break;
            case "TDRL":
                b = 15;
                break;
            case "TEXT":
                b = 16;
                break;
            case "TIT2":
                b = 17;
                break;
            case "TPE1":
                b = 18;
                break;
            case "TPE2":
                b = 19;
                break;
            case "TPE3":
                b = 20;
                break;
            case "TPOS":
                b = 21;
                break;
            case "TRCK":
                b = 22;
                break;
            case "TSST":
                b = 23;
                break;
            case "TYER":
                b = 24;
                break;
            default:
                b = -1;
                break;
        }
        b4x b4xVar = this.c;
        try {
            switch (b) {
                case 0:
                case 10:
                    hbiVar.d = (CharSequence) b4xVar.get(0);
                    break;
                case 1:
                case 11:
                    hbiVar.s = (CharSequence) b4xVar.get(0);
                    break;
                case 2:
                case 13:
                    String str = (String) b4xVar.get(0);
                    int i = Integer.parseInt(str.substring(2, 4));
                    int i2 = Integer.parseInt(str.substring(0, 2));
                    hbiVar.m = Integer.valueOf(i);
                    hbiVar.n = Integer.valueOf(i2);
                    break;
                case 3:
                case 18:
                    hbiVar.c = (CharSequence) b4xVar.get(0);
                    break;
                case 4:
                case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                    hbiVar.f12771a = (CharSequence) b4xVar.get(0);
                    break;
                case 5:
                case 20:
                    hbiVar.t = (CharSequence) b4xVar.get(0);
                    break;
                case 6:
                case 22:
                    String str2 = (String) b4xVar.get(0);
                    String str3 = vtt0.f38024a;
                    String[] strArrSplit = str2.split(Separators.SLASH, -1);
                    int i3 = Integer.parseInt(strArrSplit[0]);
                    numValueOf = strArrSplit.length > 1 ? Integer.valueOf(Integer.parseInt(strArrSplit[1])) : null;
                    hbiVar.h = Integer.valueOf(i3);
                    hbiVar.i = numValueOf;
                    break;
                case 7:
                case 17:
                    hbiVar.b = (CharSequence) b4xVar.get(0);
                    break;
                case 8:
                case 16:
                    hbiVar.r = (CharSequence) b4xVar.get(0);
                    break;
                case 9:
                case 24:
                    hbiVar.l = Integer.valueOf(Integer.parseInt((String) b4xVar.get(0)));
                    break;
                case 12:
                    Integer numV0 = n6x.v0((String) b4xVar.get(0));
                    if (numV0 != null) {
                        String strA = gxw.a(numV0.intValue());
                        if (strA != null) {
                            hbiVar.x = strA;
                        }
                    } else {
                        hbiVar.x = (CharSequence) b4xVar.get(0);
                    }
                    break;
                case 14:
                    ArrayList arrayListD = d((String) b4xVar.get(0));
                    int size = arrayListD.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size == 3) {
                                hbiVar.n = (Integer) arrayListD.get(2);
                            }
                        }
                        hbiVar.m = (Integer) arrayListD.get(1);
                    }
                    hbiVar.l = (Integer) arrayListD.get(0);
                    break;
                case 15:
                    ArrayList arrayListD2 = d((String) b4xVar.get(0));
                    int size2 = arrayListD2.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 == 3) {
                                hbiVar.q = (Integer) arrayListD2.get(2);
                            }
                        }
                        hbiVar.p = (Integer) arrayListD2.get(1);
                    }
                    hbiVar.o = (Integer) arrayListD2.get(0);
                    break;
                case 21:
                    String str4 = (String) b4xVar.get(0);
                    String str5 = vtt0.f38024a;
                    String[] strArrSplit2 = str4.split(Separators.SLASH, -1);
                    int i4 = Integer.parseInt(strArrSplit2[0]);
                    numValueOf = strArrSplit2.length > 1 ? Integer.valueOf(Integer.parseInt(strArrSplit2[1])) : null;
                    hbiVar.v = Integer.valueOf(i4);
                    hbiVar.w = numValueOf;
                    break;
                case 23:
                    hbiVar.u = (CharSequence) b4xVar.get(0);
                    break;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h8q0.class != obj.getClass()) {
            return false;
        }
        h8q0 h8q0Var = (h8q0) obj;
        return this.f10332a.equals(h8q0Var.f10332a) && Objects.equals(this.b, h8q0Var.b) && this.c.equals(h8q0Var.c);
    }

    public final int hashCode() {
        int iB = ua80.b(527, 31, this.f10332a);
        String str = this.b;
        return this.c.hashCode() + ((iB + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // a.fxw
    public final String toString() {
        return this.f10332a + ": description=" + this.b + ": values=" + this.c;
    }
}
