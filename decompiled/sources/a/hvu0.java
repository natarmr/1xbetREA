package a;

/* JADX INFO: loaded from: classes.dex */
public final class hvu0 implements cd40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13742a;
    public final String b;

    public hvu0(String str, String str2) {
        this.f13742a = j47.I0(str);
        this.b = str2;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // a.cd40
    public final void b(hbi hbiVar) {
        String str = this.f13742a;
        str.getClass();
        byte b = -1;
        switch (str.hashCode()) {
            case -1935137620:
                if (str.equals("TOTALTRACKS")) {
                    b = 0;
                }
                break;
            case -215998278:
                if (str.equals("TOTALDISCS")) {
                    b = 1;
                }
                break;
            case -113312716:
                if (str.equals("TRACKNUMBER")) {
                    b = 2;
                }
                break;
            case 62359119:
                if (str.equals("ALBUM")) {
                    b = 3;
                }
                break;
            case 67703139:
                if (str.equals("GENRE")) {
                    b = 4;
                }
                break;
            case 79833656:
                if (str.equals("TITLE")) {
                    b = 5;
                }
                break;
            case 428414940:
                if (str.equals("DESCRIPTION")) {
                    b = 6;
                }
                break;
            case 905239725:
                if (str.equals("DISCSUBTITLE")) {
                    b = 7;
                }
                break;
            case 993300766:
                if (str.equals("DISCNUMBER")) {
                    b = 8;
                }
                break;
            case 1746739798:
                if (str.equals("ALBUMARTIST")) {
                    b = 9;
                }
                break;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    b = 10;
                }
                break;
        }
        String str2 = this.b;
        switch (b) {
            case 0:
                Integer numV0 = n6x.v0(str2);
                if (numV0 != null) {
                    hbiVar.i = numV0;
                }
                break;
            case 1:
                Integer numV1 = n6x.v0(str2);
                if (numV1 != null) {
                    hbiVar.w = numV1;
                }
                break;
            case 2:
                Integer numV2 = n6x.v0(str2);
                if (numV2 != null) {
                    hbiVar.h = numV2;
                }
                break;
            case 3:
                hbiVar.d = str2;
                break;
            case 4:
                hbiVar.x = str2;
                break;
            case 5:
                hbiVar.b = str2;
                break;
            case 6:
                hbiVar.e = str2;
                break;
            case 7:
                hbiVar.u = str2;
                break;
            case 8:
                Integer numV3 = n6x.v0(str2);
                if (numV3 != null) {
                    hbiVar.v = numV3;
                }
                break;
            case 9:
                hbiVar.f12771a = str2;
                break;
            case 10:
                hbiVar.c = str2;
                break;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && hvu0.class == obj.getClass()) {
            hvu0 hvu0Var = (hvu0) obj;
            if (this.f13742a.equals(hvu0Var.f13742a) && this.b.equals(hvu0Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + ua80.b(527, 31, this.f13742a);
    }

    public final String toString() {
        return "VC: " + this.f13742a + "=" + this.b;
    }
}
