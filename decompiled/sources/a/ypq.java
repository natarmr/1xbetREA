package a;

import android.os.Trace;
import android.view.KeyEvent;
import android.view.View;
import androidx.compose.ui.platform.AndroidComposeView;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ypq implements wpq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AndroidComposeView f43042a;
    public final AndroidComposeView b;
    public final tpq d;
    public ky40 f;
    public nqq h;
    public final nqq c = new nqq(2, null, 14);
    public final xpq e = new xpq(this);
    public final vy40 g = new vy40(1);

    public ypq(AndroidComposeView androidComposeView, AndroidComposeView androidComposeView2) {
        this.f43042a = androidComposeView;
        this.b = androidComposeView2;
        this.d = new tpq(this, androidComposeView2);
    }

    public final void b(boolean z) {
        d(8, z, true);
    }

    public final boolean c(boolean z) {
        tzi tziVar;
        if (h() != null) {
            nqq nqqVarH = h();
            k(null);
            if (nqqVarH != null) {
                nqqVarH.a1(iqq.f15221a, iqq.c);
                if (!nqqVarH.f20279a.n) {
                    xcx.b("visitAncestors called on an unattached node");
                }
                lm40 lm40Var = nqqVarH.f20279a.e;
                e7z e7zVarZ = vcc.Z(nqqVarH);
                while (e7zVarZ != null) {
                    if ((((lm40) e7zVarZ.h1.g).d & 1024) != 0) {
                        while (lm40Var != null) {
                            if ((lm40Var.c & 1024) != 0) {
                                lm40 lm40VarV = lm40Var;
                                xz40 xz40Var = null;
                                while (lm40VarV != null) {
                                    if (lm40VarV instanceof nqq) {
                                        ((nqq) lm40VarV).a1(iqq.b, iqq.c);
                                    } else if ((lm40VarV.c & 1024) != 0 && (lm40VarV instanceof f3k)) {
                                        int i = 0;
                                        for (lm40 lm40Var2 = ((f3k) lm40VarV).p; lm40Var2 != null; lm40Var2 = lm40Var2.f) {
                                            if ((lm40Var2.c & 1024) != 0) {
                                                i++;
                                                if (i == 1) {
                                                    lm40VarV = lm40Var2;
                                                } else {
                                                    if (xz40Var == null) {
                                                        xz40Var = new xz40(new lm40[16]);
                                                    }
                                                    if (lm40VarV != null) {
                                                        xz40Var.b(lm40VarV);
                                                        lm40VarV = null;
                                                    }
                                                    xz40Var.b(lm40Var2);
                                                }
                                            }
                                        }
                                        if (i == 1) {
                                        }
                                    }
                                    lm40VarV = vcc.V(xz40Var);
                                }
                            }
                            lm40Var = lm40Var.e;
                        }
                    }
                    e7zVarZ = e7zVarZ.v();
                    lm40Var = (e7zVarZ == null || (tziVar = e7zVarZ.h1) == null) ? null : (wso0) tziVar.f;
                }
            }
        }
        return true;
    }

    public final boolean d(int i, boolean z, boolean z2) {
        int iOrdinal;
        boolean z3 = true;
        if (z || (iOrdinal = qzb.J0(this.c, i).ordinal()) == 0) {
            c(z);
        } else {
            if (iOrdinal != 1 && iOrdinal != 2 && iOrdinal != 3) {
                t9f.b();
                return false;
            }
            z3 = false;
        }
        if (z3 && z2) {
            e();
        }
        return z3;
    }

    public final void e() {
        AndroidComposeView androidComposeView = this.f43042a;
        if (androidComposeView.isFocused() || androidComposeView.hasFocus()) {
            androidComposeView.clearFocus();
        } else if (androidComposeView.hasFocus()) {
            View viewFindFocus = androidComposeView.findFocus();
            if (viewFindFocus != null) {
                viewFindFocus.clearFocus();
            }
            androidComposeView.clearFocus();
        }
    }

    /* JADX WARN: Code duplicated, block: B:116:0x0157 A[Catch: all -> 0x02ee, TryCatch #0 {all -> 0x02ee, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:12:0x0023, B:15:0x002f, B:17:0x0035, B:18:0x003a, B:20:0x0042, B:22:0x0047, B:24:0x004d, B:28:0x0053, B:126:0x016f, B:128:0x0175, B:129:0x0178, B:131:0x0183, B:134:0x0191, B:138:0x019b, B:141:0x01a1, B:142:0x01a6, B:145:0x01ae, B:147:0x01b4, B:149:0x01b8, B:151:0x01c0, B:153:0x01c6, B:157:0x01ce, B:159:0x01d7, B:160:0x01db, B:161:0x01de, B:164:0x01e4, B:165:0x01e9, B:166:0x01ec, B:168:0x01f2, B:170:0x01f6, B:173:0x01ff, B:175:0x0207, B:182:0x021e, B:184:0x0223, B:186:0x0227, B:209:0x0269, B:190:0x0233, B:192:0x0239, B:194:0x023d, B:196:0x0245, B:198:0x024b, B:202:0x0253, B:204:0x025c, B:205:0x0260, B:206:0x0263, B:210:0x026e, B:214:0x027e, B:216:0x0283, B:218:0x0287, B:241:0x02c9, B:222:0x0293, B:224:0x0299, B:226:0x029d, B:228:0x02a5, B:230:0x02ab, B:234:0x02b3, B:236:0x02bc, B:237:0x02c0, B:238:0x02c3, B:243:0x02d0, B:245:0x02d7, B:32:0x005b, B:34:0x0061, B:35:0x0064, B:37:0x006c, B:40:0x007a, B:44:0x0084, B:75:0x00d9, B:77:0x00dd, B:47:0x0089, B:49:0x008f, B:51:0x0093, B:53:0x009b, B:55:0x00a1, B:59:0x00a9, B:61:0x00b2, B:62:0x00b6, B:63:0x00b9, B:66:0x00bf, B:67:0x00c4, B:68:0x00c7, B:70:0x00cd, B:72:0x00d1, B:78:0x00e3, B:80:0x00e9, B:81:0x00ec, B:83:0x00f6, B:86:0x0104, B:90:0x010e, B:121:0x0163, B:123:0x0167, B:93:0x0113, B:95:0x0119, B:97:0x011d, B:99:0x0125, B:101:0x012b, B:105:0x0133, B:107:0x013c, B:108:0x0140, B:109:0x0143, B:112:0x0149, B:113:0x014e, B:114:0x0151, B:116:0x0157, B:118:0x015b), top: B:255:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:123:0x0167 A[Catch: all -> 0x02ee, TryCatch #0 {all -> 0x02ee, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:12:0x0023, B:15:0x002f, B:17:0x0035, B:18:0x003a, B:20:0x0042, B:22:0x0047, B:24:0x004d, B:28:0x0053, B:126:0x016f, B:128:0x0175, B:129:0x0178, B:131:0x0183, B:134:0x0191, B:138:0x019b, B:141:0x01a1, B:142:0x01a6, B:145:0x01ae, B:147:0x01b4, B:149:0x01b8, B:151:0x01c0, B:153:0x01c6, B:157:0x01ce, B:159:0x01d7, B:160:0x01db, B:161:0x01de, B:164:0x01e4, B:165:0x01e9, B:166:0x01ec, B:168:0x01f2, B:170:0x01f6, B:173:0x01ff, B:175:0x0207, B:182:0x021e, B:184:0x0223, B:186:0x0227, B:209:0x0269, B:190:0x0233, B:192:0x0239, B:194:0x023d, B:196:0x0245, B:198:0x024b, B:202:0x0253, B:204:0x025c, B:205:0x0260, B:206:0x0263, B:210:0x026e, B:214:0x027e, B:216:0x0283, B:218:0x0287, B:241:0x02c9, B:222:0x0293, B:224:0x0299, B:226:0x029d, B:228:0x02a5, B:230:0x02ab, B:234:0x02b3, B:236:0x02bc, B:237:0x02c0, B:238:0x02c3, B:243:0x02d0, B:245:0x02d7, B:32:0x005b, B:34:0x0061, B:35:0x0064, B:37:0x006c, B:40:0x007a, B:44:0x0084, B:75:0x00d9, B:77:0x00dd, B:47:0x0089, B:49:0x008f, B:51:0x0093, B:53:0x009b, B:55:0x00a1, B:59:0x00a9, B:61:0x00b2, B:62:0x00b6, B:63:0x00b9, B:66:0x00bf, B:67:0x00c4, B:68:0x00c7, B:70:0x00cd, B:72:0x00d1, B:78:0x00e3, B:80:0x00e9, B:81:0x00ec, B:83:0x00f6, B:86:0x0104, B:90:0x010e, B:121:0x0163, B:123:0x0167, B:93:0x0113, B:95:0x0119, B:97:0x011d, B:99:0x0125, B:101:0x012b, B:105:0x0133, B:107:0x013c, B:108:0x0140, B:109:0x0143, B:112:0x0149, B:113:0x014e, B:114:0x0151, B:116:0x0157, B:118:0x015b), top: B:255:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:124:0x016c  */
    /* JADX WARN: Code duplicated, block: B:316:0x00d8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:317:0x0088 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x0059  */
    /* JADX WARN: Code duplicated, block: B:323:0x00c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:0x005b A[Catch: all -> 0x02ee, TryCatch #0 {all -> 0x02ee, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:12:0x0023, B:15:0x002f, B:17:0x0035, B:18:0x003a, B:20:0x0042, B:22:0x0047, B:24:0x004d, B:28:0x0053, B:126:0x016f, B:128:0x0175, B:129:0x0178, B:131:0x0183, B:134:0x0191, B:138:0x019b, B:141:0x01a1, B:142:0x01a6, B:145:0x01ae, B:147:0x01b4, B:149:0x01b8, B:151:0x01c0, B:153:0x01c6, B:157:0x01ce, B:159:0x01d7, B:160:0x01db, B:161:0x01de, B:164:0x01e4, B:165:0x01e9, B:166:0x01ec, B:168:0x01f2, B:170:0x01f6, B:173:0x01ff, B:175:0x0207, B:182:0x021e, B:184:0x0223, B:186:0x0227, B:209:0x0269, B:190:0x0233, B:192:0x0239, B:194:0x023d, B:196:0x0245, B:198:0x024b, B:202:0x0253, B:204:0x025c, B:205:0x0260, B:206:0x0263, B:210:0x026e, B:214:0x027e, B:216:0x0283, B:218:0x0287, B:241:0x02c9, B:222:0x0293, B:224:0x0299, B:226:0x029d, B:228:0x02a5, B:230:0x02ab, B:234:0x02b3, B:236:0x02bc, B:237:0x02c0, B:238:0x02c3, B:243:0x02d0, B:245:0x02d7, B:32:0x005b, B:34:0x0061, B:35:0x0064, B:37:0x006c, B:40:0x007a, B:44:0x0084, B:75:0x00d9, B:77:0x00dd, B:47:0x0089, B:49:0x008f, B:51:0x0093, B:53:0x009b, B:55:0x00a1, B:59:0x00a9, B:61:0x00b2, B:62:0x00b6, B:63:0x00b9, B:66:0x00bf, B:67:0x00c4, B:68:0x00c7, B:70:0x00cd, B:72:0x00d1, B:78:0x00e3, B:80:0x00e9, B:81:0x00ec, B:83:0x00f6, B:86:0x0104, B:90:0x010e, B:121:0x0163, B:123:0x0167, B:93:0x0113, B:95:0x0119, B:97:0x011d, B:99:0x0125, B:101:0x012b, B:105:0x0133, B:107:0x013c, B:108:0x0140, B:109:0x0143, B:112:0x0149, B:113:0x014e, B:114:0x0151, B:116:0x0157, B:118:0x015b), top: B:255:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:336:0x0162 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:337:0x0112 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:338:0x0160 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:345:0x014e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:349:0x0149 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x0061 A[Catch: all -> 0x02ee, TryCatch #0 {all -> 0x02ee, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:12:0x0023, B:15:0x002f, B:17:0x0035, B:18:0x003a, B:20:0x0042, B:22:0x0047, B:24:0x004d, B:28:0x0053, B:126:0x016f, B:128:0x0175, B:129:0x0178, B:131:0x0183, B:134:0x0191, B:138:0x019b, B:141:0x01a1, B:142:0x01a6, B:145:0x01ae, B:147:0x01b4, B:149:0x01b8, B:151:0x01c0, B:153:0x01c6, B:157:0x01ce, B:159:0x01d7, B:160:0x01db, B:161:0x01de, B:164:0x01e4, B:165:0x01e9, B:166:0x01ec, B:168:0x01f2, B:170:0x01f6, B:173:0x01ff, B:175:0x0207, B:182:0x021e, B:184:0x0223, B:186:0x0227, B:209:0x0269, B:190:0x0233, B:192:0x0239, B:194:0x023d, B:196:0x0245, B:198:0x024b, B:202:0x0253, B:204:0x025c, B:205:0x0260, B:206:0x0263, B:210:0x026e, B:214:0x027e, B:216:0x0283, B:218:0x0287, B:241:0x02c9, B:222:0x0293, B:224:0x0299, B:226:0x029d, B:228:0x02a5, B:230:0x02ab, B:234:0x02b3, B:236:0x02bc, B:237:0x02c0, B:238:0x02c3, B:243:0x02d0, B:245:0x02d7, B:32:0x005b, B:34:0x0061, B:35:0x0064, B:37:0x006c, B:40:0x007a, B:44:0x0084, B:75:0x00d9, B:77:0x00dd, B:47:0x0089, B:49:0x008f, B:51:0x0093, B:53:0x009b, B:55:0x00a1, B:59:0x00a9, B:61:0x00b2, B:62:0x00b6, B:63:0x00b9, B:66:0x00bf, B:67:0x00c4, B:68:0x00c7, B:70:0x00cd, B:72:0x00d1, B:78:0x00e3, B:80:0x00e9, B:81:0x00ec, B:83:0x00f6, B:86:0x0104, B:90:0x010e, B:121:0x0163, B:123:0x0167, B:93:0x0113, B:95:0x0119, B:97:0x011d, B:99:0x0125, B:101:0x012b, B:105:0x0133, B:107:0x013c, B:108:0x0140, B:109:0x0143, B:112:0x0149, B:113:0x014e, B:114:0x0151, B:116:0x0157, B:118:0x015b), top: B:255:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x006c A[Catch: all -> 0x02ee, TryCatch #0 {all -> 0x02ee, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:12:0x0023, B:15:0x002f, B:17:0x0035, B:18:0x003a, B:20:0x0042, B:22:0x0047, B:24:0x004d, B:28:0x0053, B:126:0x016f, B:128:0x0175, B:129:0x0178, B:131:0x0183, B:134:0x0191, B:138:0x019b, B:141:0x01a1, B:142:0x01a6, B:145:0x01ae, B:147:0x01b4, B:149:0x01b8, B:151:0x01c0, B:153:0x01c6, B:157:0x01ce, B:159:0x01d7, B:160:0x01db, B:161:0x01de, B:164:0x01e4, B:165:0x01e9, B:166:0x01ec, B:168:0x01f2, B:170:0x01f6, B:173:0x01ff, B:175:0x0207, B:182:0x021e, B:184:0x0223, B:186:0x0227, B:209:0x0269, B:190:0x0233, B:192:0x0239, B:194:0x023d, B:196:0x0245, B:198:0x024b, B:202:0x0253, B:204:0x025c, B:205:0x0260, B:206:0x0263, B:210:0x026e, B:214:0x027e, B:216:0x0283, B:218:0x0287, B:241:0x02c9, B:222:0x0293, B:224:0x0299, B:226:0x029d, B:228:0x02a5, B:230:0x02ab, B:234:0x02b3, B:236:0x02bc, B:237:0x02c0, B:238:0x02c3, B:243:0x02d0, B:245:0x02d7, B:32:0x005b, B:34:0x0061, B:35:0x0064, B:37:0x006c, B:40:0x007a, B:44:0x0084, B:75:0x00d9, B:77:0x00dd, B:47:0x0089, B:49:0x008f, B:51:0x0093, B:53:0x009b, B:55:0x00a1, B:59:0x00a9, B:61:0x00b2, B:62:0x00b6, B:63:0x00b9, B:66:0x00bf, B:67:0x00c4, B:68:0x00c7, B:70:0x00cd, B:72:0x00d1, B:78:0x00e3, B:80:0x00e9, B:81:0x00ec, B:83:0x00f6, B:86:0x0104, B:90:0x010e, B:121:0x0163, B:123:0x0167, B:93:0x0113, B:95:0x0119, B:97:0x011d, B:99:0x0125, B:101:0x012b, B:105:0x0133, B:107:0x013c, B:108:0x0140, B:109:0x0143, B:112:0x0149, B:113:0x014e, B:114:0x0151, B:116:0x0157, B:118:0x015b), top: B:255:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x0078 A[ADDED_TO_REGION, LOOP:12: B:39:0x0078->B:67:0x00c4, LOOP_START, PHI: r6
  0x0078: PHI (r6v29 a.lm40) = (r6v23 a.lm40), (r6v30 a.lm40) binds: [B:38:0x0076, B:67:0x00c4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:40:0x007a A[Catch: all -> 0x02ee, TryCatch #0 {all -> 0x02ee, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:12:0x0023, B:15:0x002f, B:17:0x0035, B:18:0x003a, B:20:0x0042, B:22:0x0047, B:24:0x004d, B:28:0x0053, B:126:0x016f, B:128:0x0175, B:129:0x0178, B:131:0x0183, B:134:0x0191, B:138:0x019b, B:141:0x01a1, B:142:0x01a6, B:145:0x01ae, B:147:0x01b4, B:149:0x01b8, B:151:0x01c0, B:153:0x01c6, B:157:0x01ce, B:159:0x01d7, B:160:0x01db, B:161:0x01de, B:164:0x01e4, B:165:0x01e9, B:166:0x01ec, B:168:0x01f2, B:170:0x01f6, B:173:0x01ff, B:175:0x0207, B:182:0x021e, B:184:0x0223, B:186:0x0227, B:209:0x0269, B:190:0x0233, B:192:0x0239, B:194:0x023d, B:196:0x0245, B:198:0x024b, B:202:0x0253, B:204:0x025c, B:205:0x0260, B:206:0x0263, B:210:0x026e, B:214:0x027e, B:216:0x0283, B:218:0x0287, B:241:0x02c9, B:222:0x0293, B:224:0x0299, B:226:0x029d, B:228:0x02a5, B:230:0x02ab, B:234:0x02b3, B:236:0x02bc, B:237:0x02c0, B:238:0x02c3, B:243:0x02d0, B:245:0x02d7, B:32:0x005b, B:34:0x0061, B:35:0x0064, B:37:0x006c, B:40:0x007a, B:44:0x0084, B:75:0x00d9, B:77:0x00dd, B:47:0x0089, B:49:0x008f, B:51:0x0093, B:53:0x009b, B:55:0x00a1, B:59:0x00a9, B:61:0x00b2, B:62:0x00b6, B:63:0x00b9, B:66:0x00bf, B:67:0x00c4, B:68:0x00c7, B:70:0x00cd, B:72:0x00d1, B:78:0x00e3, B:80:0x00e9, B:81:0x00ec, B:83:0x00f6, B:86:0x0104, B:90:0x010e, B:121:0x0163, B:123:0x0167, B:93:0x0113, B:95:0x0119, B:97:0x011d, B:99:0x0125, B:101:0x012b, B:105:0x0133, B:107:0x013c, B:108:0x0140, B:109:0x0143, B:112:0x0149, B:113:0x014e, B:114:0x0151, B:116:0x0157, B:118:0x015b), top: B:255:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x0080  */
    /* JADX WARN: Code duplicated, block: B:44:0x0084 A[Catch: all -> 0x02ee, TryCatch #0 {all -> 0x02ee, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:12:0x0023, B:15:0x002f, B:17:0x0035, B:18:0x003a, B:20:0x0042, B:22:0x0047, B:24:0x004d, B:28:0x0053, B:126:0x016f, B:128:0x0175, B:129:0x0178, B:131:0x0183, B:134:0x0191, B:138:0x019b, B:141:0x01a1, B:142:0x01a6, B:145:0x01ae, B:147:0x01b4, B:149:0x01b8, B:151:0x01c0, B:153:0x01c6, B:157:0x01ce, B:159:0x01d7, B:160:0x01db, B:161:0x01de, B:164:0x01e4, B:165:0x01e9, B:166:0x01ec, B:168:0x01f2, B:170:0x01f6, B:173:0x01ff, B:175:0x0207, B:182:0x021e, B:184:0x0223, B:186:0x0227, B:209:0x0269, B:190:0x0233, B:192:0x0239, B:194:0x023d, B:196:0x0245, B:198:0x024b, B:202:0x0253, B:204:0x025c, B:205:0x0260, B:206:0x0263, B:210:0x026e, B:214:0x027e, B:216:0x0283, B:218:0x0287, B:241:0x02c9, B:222:0x0293, B:224:0x0299, B:226:0x029d, B:228:0x02a5, B:230:0x02ab, B:234:0x02b3, B:236:0x02bc, B:237:0x02c0, B:238:0x02c3, B:243:0x02d0, B:245:0x02d7, B:32:0x005b, B:34:0x0061, B:35:0x0064, B:37:0x006c, B:40:0x007a, B:44:0x0084, B:75:0x00d9, B:77:0x00dd, B:47:0x0089, B:49:0x008f, B:51:0x0093, B:53:0x009b, B:55:0x00a1, B:59:0x00a9, B:61:0x00b2, B:62:0x00b6, B:63:0x00b9, B:66:0x00bf, B:67:0x00c4, B:68:0x00c7, B:70:0x00cd, B:72:0x00d1, B:78:0x00e3, B:80:0x00e9, B:81:0x00ec, B:83:0x00f6, B:86:0x0104, B:90:0x010e, B:121:0x0163, B:123:0x0167, B:93:0x0113, B:95:0x0119, B:97:0x011d, B:99:0x0125, B:101:0x012b, B:105:0x0133, B:107:0x013c, B:108:0x0140, B:109:0x0143, B:112:0x0149, B:113:0x014e, B:114:0x0151, B:116:0x0157, B:118:0x015b), top: B:255:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x0089 A[Catch: all -> 0x02ee, TryCatch #0 {all -> 0x02ee, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:12:0x0023, B:15:0x002f, B:17:0x0035, B:18:0x003a, B:20:0x0042, B:22:0x0047, B:24:0x004d, B:28:0x0053, B:126:0x016f, B:128:0x0175, B:129:0x0178, B:131:0x0183, B:134:0x0191, B:138:0x019b, B:141:0x01a1, B:142:0x01a6, B:145:0x01ae, B:147:0x01b4, B:149:0x01b8, B:151:0x01c0, B:153:0x01c6, B:157:0x01ce, B:159:0x01d7, B:160:0x01db, B:161:0x01de, B:164:0x01e4, B:165:0x01e9, B:166:0x01ec, B:168:0x01f2, B:170:0x01f6, B:173:0x01ff, B:175:0x0207, B:182:0x021e, B:184:0x0223, B:186:0x0227, B:209:0x0269, B:190:0x0233, B:192:0x0239, B:194:0x023d, B:196:0x0245, B:198:0x024b, B:202:0x0253, B:204:0x025c, B:205:0x0260, B:206:0x0263, B:210:0x026e, B:214:0x027e, B:216:0x0283, B:218:0x0287, B:241:0x02c9, B:222:0x0293, B:224:0x0299, B:226:0x029d, B:228:0x02a5, B:230:0x02ab, B:234:0x02b3, B:236:0x02bc, B:237:0x02c0, B:238:0x02c3, B:243:0x02d0, B:245:0x02d7, B:32:0x005b, B:34:0x0061, B:35:0x0064, B:37:0x006c, B:40:0x007a, B:44:0x0084, B:75:0x00d9, B:77:0x00dd, B:47:0x0089, B:49:0x008f, B:51:0x0093, B:53:0x009b, B:55:0x00a1, B:59:0x00a9, B:61:0x00b2, B:62:0x00b6, B:63:0x00b9, B:66:0x00bf, B:67:0x00c4, B:68:0x00c7, B:70:0x00cd, B:72:0x00d1, B:78:0x00e3, B:80:0x00e9, B:81:0x00ec, B:83:0x00f6, B:86:0x0104, B:90:0x010e, B:121:0x0163, B:123:0x0167, B:93:0x0113, B:95:0x0119, B:97:0x011d, B:99:0x0125, B:101:0x012b, B:105:0x0133, B:107:0x013c, B:108:0x0140, B:109:0x0143, B:112:0x0149, B:113:0x014e, B:114:0x0151, B:116:0x0157, B:118:0x015b), top: B:255:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x00dd A[Catch: all -> 0x02ee, TryCatch #0 {all -> 0x02ee, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:12:0x0023, B:15:0x002f, B:17:0x0035, B:18:0x003a, B:20:0x0042, B:22:0x0047, B:24:0x004d, B:28:0x0053, B:126:0x016f, B:128:0x0175, B:129:0x0178, B:131:0x0183, B:134:0x0191, B:138:0x019b, B:141:0x01a1, B:142:0x01a6, B:145:0x01ae, B:147:0x01b4, B:149:0x01b8, B:151:0x01c0, B:153:0x01c6, B:157:0x01ce, B:159:0x01d7, B:160:0x01db, B:161:0x01de, B:164:0x01e4, B:165:0x01e9, B:166:0x01ec, B:168:0x01f2, B:170:0x01f6, B:173:0x01ff, B:175:0x0207, B:182:0x021e, B:184:0x0223, B:186:0x0227, B:209:0x0269, B:190:0x0233, B:192:0x0239, B:194:0x023d, B:196:0x0245, B:198:0x024b, B:202:0x0253, B:204:0x025c, B:205:0x0260, B:206:0x0263, B:210:0x026e, B:214:0x027e, B:216:0x0283, B:218:0x0287, B:241:0x02c9, B:222:0x0293, B:224:0x0299, B:226:0x029d, B:228:0x02a5, B:230:0x02ab, B:234:0x02b3, B:236:0x02bc, B:237:0x02c0, B:238:0x02c3, B:243:0x02d0, B:245:0x02d7, B:32:0x005b, B:34:0x0061, B:35:0x0064, B:37:0x006c, B:40:0x007a, B:44:0x0084, B:75:0x00d9, B:77:0x00dd, B:47:0x0089, B:49:0x008f, B:51:0x0093, B:53:0x009b, B:55:0x00a1, B:59:0x00a9, B:61:0x00b2, B:62:0x00b6, B:63:0x00b9, B:66:0x00bf, B:67:0x00c4, B:68:0x00c7, B:70:0x00cd, B:72:0x00d1, B:78:0x00e3, B:80:0x00e9, B:81:0x00ec, B:83:0x00f6, B:86:0x0104, B:90:0x010e, B:121:0x0163, B:123:0x0167, B:93:0x0113, B:95:0x0119, B:97:0x011d, B:99:0x0125, B:101:0x012b, B:105:0x0133, B:107:0x013c, B:108:0x0140, B:109:0x0143, B:112:0x0149, B:113:0x014e, B:114:0x0151, B:116:0x0157, B:118:0x015b), top: B:255:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x00e3 A[Catch: all -> 0x02ee, TryCatch #0 {all -> 0x02ee, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:12:0x0023, B:15:0x002f, B:17:0x0035, B:18:0x003a, B:20:0x0042, B:22:0x0047, B:24:0x004d, B:28:0x0053, B:126:0x016f, B:128:0x0175, B:129:0x0178, B:131:0x0183, B:134:0x0191, B:138:0x019b, B:141:0x01a1, B:142:0x01a6, B:145:0x01ae, B:147:0x01b4, B:149:0x01b8, B:151:0x01c0, B:153:0x01c6, B:157:0x01ce, B:159:0x01d7, B:160:0x01db, B:161:0x01de, B:164:0x01e4, B:165:0x01e9, B:166:0x01ec, B:168:0x01f2, B:170:0x01f6, B:173:0x01ff, B:175:0x0207, B:182:0x021e, B:184:0x0223, B:186:0x0227, B:209:0x0269, B:190:0x0233, B:192:0x0239, B:194:0x023d, B:196:0x0245, B:198:0x024b, B:202:0x0253, B:204:0x025c, B:205:0x0260, B:206:0x0263, B:210:0x026e, B:214:0x027e, B:216:0x0283, B:218:0x0287, B:241:0x02c9, B:222:0x0293, B:224:0x0299, B:226:0x029d, B:228:0x02a5, B:230:0x02ab, B:234:0x02b3, B:236:0x02bc, B:237:0x02c0, B:238:0x02c3, B:243:0x02d0, B:245:0x02d7, B:32:0x005b, B:34:0x0061, B:35:0x0064, B:37:0x006c, B:40:0x007a, B:44:0x0084, B:75:0x00d9, B:77:0x00dd, B:47:0x0089, B:49:0x008f, B:51:0x0093, B:53:0x009b, B:55:0x00a1, B:59:0x00a9, B:61:0x00b2, B:62:0x00b6, B:63:0x00b9, B:66:0x00bf, B:67:0x00c4, B:68:0x00c7, B:70:0x00cd, B:72:0x00d1, B:78:0x00e3, B:80:0x00e9, B:81:0x00ec, B:83:0x00f6, B:86:0x0104, B:90:0x010e, B:121:0x0163, B:123:0x0167, B:93:0x0113, B:95:0x0119, B:97:0x011d, B:99:0x0125, B:101:0x012b, B:105:0x0133, B:107:0x013c, B:108:0x0140, B:109:0x0143, B:112:0x0149, B:113:0x014e, B:114:0x0151, B:116:0x0157, B:118:0x015b), top: B:255:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x00e9 A[Catch: all -> 0x02ee, TryCatch #0 {all -> 0x02ee, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:12:0x0023, B:15:0x002f, B:17:0x0035, B:18:0x003a, B:20:0x0042, B:22:0x0047, B:24:0x004d, B:28:0x0053, B:126:0x016f, B:128:0x0175, B:129:0x0178, B:131:0x0183, B:134:0x0191, B:138:0x019b, B:141:0x01a1, B:142:0x01a6, B:145:0x01ae, B:147:0x01b4, B:149:0x01b8, B:151:0x01c0, B:153:0x01c6, B:157:0x01ce, B:159:0x01d7, B:160:0x01db, B:161:0x01de, B:164:0x01e4, B:165:0x01e9, B:166:0x01ec, B:168:0x01f2, B:170:0x01f6, B:173:0x01ff, B:175:0x0207, B:182:0x021e, B:184:0x0223, B:186:0x0227, B:209:0x0269, B:190:0x0233, B:192:0x0239, B:194:0x023d, B:196:0x0245, B:198:0x024b, B:202:0x0253, B:204:0x025c, B:205:0x0260, B:206:0x0263, B:210:0x026e, B:214:0x027e, B:216:0x0283, B:218:0x0287, B:241:0x02c9, B:222:0x0293, B:224:0x0299, B:226:0x029d, B:228:0x02a5, B:230:0x02ab, B:234:0x02b3, B:236:0x02bc, B:237:0x02c0, B:238:0x02c3, B:243:0x02d0, B:245:0x02d7, B:32:0x005b, B:34:0x0061, B:35:0x0064, B:37:0x006c, B:40:0x007a, B:44:0x0084, B:75:0x00d9, B:77:0x00dd, B:47:0x0089, B:49:0x008f, B:51:0x0093, B:53:0x009b, B:55:0x00a1, B:59:0x00a9, B:61:0x00b2, B:62:0x00b6, B:63:0x00b9, B:66:0x00bf, B:67:0x00c4, B:68:0x00c7, B:70:0x00cd, B:72:0x00d1, B:78:0x00e3, B:80:0x00e9, B:81:0x00ec, B:83:0x00f6, B:86:0x0104, B:90:0x010e, B:121:0x0163, B:123:0x0167, B:93:0x0113, B:95:0x0119, B:97:0x011d, B:99:0x0125, B:101:0x012b, B:105:0x0133, B:107:0x013c, B:108:0x0140, B:109:0x0143, B:112:0x0149, B:113:0x014e, B:114:0x0151, B:116:0x0157, B:118:0x015b), top: B:255:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x00f6 A[Catch: all -> 0x02ee, TryCatch #0 {all -> 0x02ee, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:12:0x0023, B:15:0x002f, B:17:0x0035, B:18:0x003a, B:20:0x0042, B:22:0x0047, B:24:0x004d, B:28:0x0053, B:126:0x016f, B:128:0x0175, B:129:0x0178, B:131:0x0183, B:134:0x0191, B:138:0x019b, B:141:0x01a1, B:142:0x01a6, B:145:0x01ae, B:147:0x01b4, B:149:0x01b8, B:151:0x01c0, B:153:0x01c6, B:157:0x01ce, B:159:0x01d7, B:160:0x01db, B:161:0x01de, B:164:0x01e4, B:165:0x01e9, B:166:0x01ec, B:168:0x01f2, B:170:0x01f6, B:173:0x01ff, B:175:0x0207, B:182:0x021e, B:184:0x0223, B:186:0x0227, B:209:0x0269, B:190:0x0233, B:192:0x0239, B:194:0x023d, B:196:0x0245, B:198:0x024b, B:202:0x0253, B:204:0x025c, B:205:0x0260, B:206:0x0263, B:210:0x026e, B:214:0x027e, B:216:0x0283, B:218:0x0287, B:241:0x02c9, B:222:0x0293, B:224:0x0299, B:226:0x029d, B:228:0x02a5, B:230:0x02ab, B:234:0x02b3, B:236:0x02bc, B:237:0x02c0, B:238:0x02c3, B:243:0x02d0, B:245:0x02d7, B:32:0x005b, B:34:0x0061, B:35:0x0064, B:37:0x006c, B:40:0x007a, B:44:0x0084, B:75:0x00d9, B:77:0x00dd, B:47:0x0089, B:49:0x008f, B:51:0x0093, B:53:0x009b, B:55:0x00a1, B:59:0x00a9, B:61:0x00b2, B:62:0x00b6, B:63:0x00b9, B:66:0x00bf, B:67:0x00c4, B:68:0x00c7, B:70:0x00cd, B:72:0x00d1, B:78:0x00e3, B:80:0x00e9, B:81:0x00ec, B:83:0x00f6, B:86:0x0104, B:90:0x010e, B:121:0x0163, B:123:0x0167, B:93:0x0113, B:95:0x0119, B:97:0x011d, B:99:0x0125, B:101:0x012b, B:105:0x0133, B:107:0x013c, B:108:0x0140, B:109:0x0143, B:112:0x0149, B:113:0x014e, B:114:0x0151, B:116:0x0157, B:118:0x015b), top: B:255:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x0102 A[ADDED_TO_REGION, LOOP:16: B:85:0x0102->B:113:0x014e, LOOP_START, PHI: r12
  0x0102: PHI (r12v14 a.lm40) = (r12v8 a.lm40), (r12v15 a.lm40) binds: [B:84:0x0100, B:113:0x014e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:86:0x0104 A[Catch: all -> 0x02ee, TryCatch #0 {all -> 0x02ee, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:12:0x0023, B:15:0x002f, B:17:0x0035, B:18:0x003a, B:20:0x0042, B:22:0x0047, B:24:0x004d, B:28:0x0053, B:126:0x016f, B:128:0x0175, B:129:0x0178, B:131:0x0183, B:134:0x0191, B:138:0x019b, B:141:0x01a1, B:142:0x01a6, B:145:0x01ae, B:147:0x01b4, B:149:0x01b8, B:151:0x01c0, B:153:0x01c6, B:157:0x01ce, B:159:0x01d7, B:160:0x01db, B:161:0x01de, B:164:0x01e4, B:165:0x01e9, B:166:0x01ec, B:168:0x01f2, B:170:0x01f6, B:173:0x01ff, B:175:0x0207, B:182:0x021e, B:184:0x0223, B:186:0x0227, B:209:0x0269, B:190:0x0233, B:192:0x0239, B:194:0x023d, B:196:0x0245, B:198:0x024b, B:202:0x0253, B:204:0x025c, B:205:0x0260, B:206:0x0263, B:210:0x026e, B:214:0x027e, B:216:0x0283, B:218:0x0287, B:241:0x02c9, B:222:0x0293, B:224:0x0299, B:226:0x029d, B:228:0x02a5, B:230:0x02ab, B:234:0x02b3, B:236:0x02bc, B:237:0x02c0, B:238:0x02c3, B:243:0x02d0, B:245:0x02d7, B:32:0x005b, B:34:0x0061, B:35:0x0064, B:37:0x006c, B:40:0x007a, B:44:0x0084, B:75:0x00d9, B:77:0x00dd, B:47:0x0089, B:49:0x008f, B:51:0x0093, B:53:0x009b, B:55:0x00a1, B:59:0x00a9, B:61:0x00b2, B:62:0x00b6, B:63:0x00b9, B:66:0x00bf, B:67:0x00c4, B:68:0x00c7, B:70:0x00cd, B:72:0x00d1, B:78:0x00e3, B:80:0x00e9, B:81:0x00ec, B:83:0x00f6, B:86:0x0104, B:90:0x010e, B:121:0x0163, B:123:0x0167, B:93:0x0113, B:95:0x0119, B:97:0x011d, B:99:0x0125, B:101:0x012b, B:105:0x0133, B:107:0x013c, B:108:0x0140, B:109:0x0143, B:112:0x0149, B:113:0x014e, B:114:0x0151, B:116:0x0157, B:118:0x015b), top: B:255:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:88:0x010a  */
    /* JADX WARN: Code duplicated, block: B:90:0x010e A[Catch: all -> 0x02ee, TryCatch #0 {all -> 0x02ee, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:12:0x0023, B:15:0x002f, B:17:0x0035, B:18:0x003a, B:20:0x0042, B:22:0x0047, B:24:0x004d, B:28:0x0053, B:126:0x016f, B:128:0x0175, B:129:0x0178, B:131:0x0183, B:134:0x0191, B:138:0x019b, B:141:0x01a1, B:142:0x01a6, B:145:0x01ae, B:147:0x01b4, B:149:0x01b8, B:151:0x01c0, B:153:0x01c6, B:157:0x01ce, B:159:0x01d7, B:160:0x01db, B:161:0x01de, B:164:0x01e4, B:165:0x01e9, B:166:0x01ec, B:168:0x01f2, B:170:0x01f6, B:173:0x01ff, B:175:0x0207, B:182:0x021e, B:184:0x0223, B:186:0x0227, B:209:0x0269, B:190:0x0233, B:192:0x0239, B:194:0x023d, B:196:0x0245, B:198:0x024b, B:202:0x0253, B:204:0x025c, B:205:0x0260, B:206:0x0263, B:210:0x026e, B:214:0x027e, B:216:0x0283, B:218:0x0287, B:241:0x02c9, B:222:0x0293, B:224:0x0299, B:226:0x029d, B:228:0x02a5, B:230:0x02ab, B:234:0x02b3, B:236:0x02bc, B:237:0x02c0, B:238:0x02c3, B:243:0x02d0, B:245:0x02d7, B:32:0x005b, B:34:0x0061, B:35:0x0064, B:37:0x006c, B:40:0x007a, B:44:0x0084, B:75:0x00d9, B:77:0x00dd, B:47:0x0089, B:49:0x008f, B:51:0x0093, B:53:0x009b, B:55:0x00a1, B:59:0x00a9, B:61:0x00b2, B:62:0x00b6, B:63:0x00b9, B:66:0x00bf, B:67:0x00c4, B:68:0x00c7, B:70:0x00cd, B:72:0x00d1, B:78:0x00e3, B:80:0x00e9, B:81:0x00ec, B:83:0x00f6, B:86:0x0104, B:90:0x010e, B:121:0x0163, B:123:0x0167, B:93:0x0113, B:95:0x0119, B:97:0x011d, B:99:0x0125, B:101:0x012b, B:105:0x0133, B:107:0x013c, B:108:0x0140, B:109:0x0143, B:112:0x0149, B:113:0x014e, B:114:0x0151, B:116:0x0157, B:118:0x015b), top: B:255:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x0113 A[Catch: all -> 0x02ee, TryCatch #0 {all -> 0x02ee, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:12:0x0023, B:15:0x002f, B:17:0x0035, B:18:0x003a, B:20:0x0042, B:22:0x0047, B:24:0x004d, B:28:0x0053, B:126:0x016f, B:128:0x0175, B:129:0x0178, B:131:0x0183, B:134:0x0191, B:138:0x019b, B:141:0x01a1, B:142:0x01a6, B:145:0x01ae, B:147:0x01b4, B:149:0x01b8, B:151:0x01c0, B:153:0x01c6, B:157:0x01ce, B:159:0x01d7, B:160:0x01db, B:161:0x01de, B:164:0x01e4, B:165:0x01e9, B:166:0x01ec, B:168:0x01f2, B:170:0x01f6, B:173:0x01ff, B:175:0x0207, B:182:0x021e, B:184:0x0223, B:186:0x0227, B:209:0x0269, B:190:0x0233, B:192:0x0239, B:194:0x023d, B:196:0x0245, B:198:0x024b, B:202:0x0253, B:204:0x025c, B:205:0x0260, B:206:0x0263, B:210:0x026e, B:214:0x027e, B:216:0x0283, B:218:0x0287, B:241:0x02c9, B:222:0x0293, B:224:0x0299, B:226:0x029d, B:228:0x02a5, B:230:0x02ab, B:234:0x02b3, B:236:0x02bc, B:237:0x02c0, B:238:0x02c3, B:243:0x02d0, B:245:0x02d7, B:32:0x005b, B:34:0x0061, B:35:0x0064, B:37:0x006c, B:40:0x007a, B:44:0x0084, B:75:0x00d9, B:77:0x00dd, B:47:0x0089, B:49:0x008f, B:51:0x0093, B:53:0x009b, B:55:0x00a1, B:59:0x00a9, B:61:0x00b2, B:62:0x00b6, B:63:0x00b9, B:66:0x00bf, B:67:0x00c4, B:68:0x00c7, B:70:0x00cd, B:72:0x00d1, B:78:0x00e3, B:80:0x00e9, B:81:0x00ec, B:83:0x00f6, B:86:0x0104, B:90:0x010e, B:121:0x0163, B:123:0x0167, B:93:0x0113, B:95:0x0119, B:97:0x011d, B:99:0x0125, B:101:0x012b, B:105:0x0133, B:107:0x013c, B:108:0x0140, B:109:0x0143, B:112:0x0149, B:113:0x014e, B:114:0x0151, B:116:0x0157, B:118:0x015b), top: B:255:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x0119 A[Catch: all -> 0x02ee, TryCatch #0 {all -> 0x02ee, blocks: (B:3:0x0007, B:5:0x000e, B:8:0x0019, B:12:0x0023, B:15:0x002f, B:17:0x0035, B:18:0x003a, B:20:0x0042, B:22:0x0047, B:24:0x004d, B:28:0x0053, B:126:0x016f, B:128:0x0175, B:129:0x0178, B:131:0x0183, B:134:0x0191, B:138:0x019b, B:141:0x01a1, B:142:0x01a6, B:145:0x01ae, B:147:0x01b4, B:149:0x01b8, B:151:0x01c0, B:153:0x01c6, B:157:0x01ce, B:159:0x01d7, B:160:0x01db, B:161:0x01de, B:164:0x01e4, B:165:0x01e9, B:166:0x01ec, B:168:0x01f2, B:170:0x01f6, B:173:0x01ff, B:175:0x0207, B:182:0x021e, B:184:0x0223, B:186:0x0227, B:209:0x0269, B:190:0x0233, B:192:0x0239, B:194:0x023d, B:196:0x0245, B:198:0x024b, B:202:0x0253, B:204:0x025c, B:205:0x0260, B:206:0x0263, B:210:0x026e, B:214:0x027e, B:216:0x0283, B:218:0x0287, B:241:0x02c9, B:222:0x0293, B:224:0x0299, B:226:0x029d, B:228:0x02a5, B:230:0x02ab, B:234:0x02b3, B:236:0x02bc, B:237:0x02c0, B:238:0x02c3, B:243:0x02d0, B:245:0x02d7, B:32:0x005b, B:34:0x0061, B:35:0x0064, B:37:0x006c, B:40:0x007a, B:44:0x0084, B:75:0x00d9, B:77:0x00dd, B:47:0x0089, B:49:0x008f, B:51:0x0093, B:53:0x009b, B:55:0x00a1, B:59:0x00a9, B:61:0x00b2, B:62:0x00b6, B:63:0x00b9, B:66:0x00bf, B:67:0x00c4, B:68:0x00c7, B:70:0x00cd, B:72:0x00d1, B:78:0x00e3, B:80:0x00e9, B:81:0x00ec, B:83:0x00f6, B:86:0x0104, B:90:0x010e, B:121:0x0163, B:123:0x0167, B:93:0x0113, B:95:0x0119, B:97:0x011d, B:99:0x0125, B:101:0x012b, B:105:0x0133, B:107:0x013c, B:108:0x0140, B:109:0x0143, B:112:0x0149, B:113:0x014e, B:114:0x0151, B:116:0x0157, B:118:0x015b), top: B:255:0x0007 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v20, types: [a.xz40] */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24, types: [a.xz40] */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r12v24, types: [a.lm40] */
    /* JADX WARN: Type inference failed for: r12v25, types: [a.lm40] */
    /* JADX WARN: Type inference failed for: r12v29, types: [a.lm40] */
    /* JADX WARN: Type inference failed for: r12v30, types: [a.lm40] */
    /* JADX WARN: Type inference failed for: r12v34, types: [a.lm40] */
    /* JADX WARN: Type inference failed for: r12v35 */
    /* JADX WARN: Type inference failed for: r12v36, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v37 */
    /* JADX WARN: Type inference failed for: r12v38 */
    /* JADX WARN: Type inference failed for: r12v39 */
    /* JADX WARN: Type inference failed for: r12v40 */
    /* JADX WARN: Type inference failed for: r12v43, types: [a.lm40] */
    /* JADX WARN: Type inference failed for: r12v44 */
    /* JADX WARN: Type inference failed for: r12v45, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v46 */
    /* JADX WARN: Type inference failed for: r12v47 */
    /* JADX WARN: Type inference failed for: r12v48 */
    /* JADX WARN: Type inference failed for: r12v49 */
    /* JADX WARN: Type inference failed for: r12v64 */
    /* JADX WARN: Type inference failed for: r12v65 */
    /* JADX WARN: Type inference failed for: r12v66 */
    /* JADX WARN: Type inference failed for: r12v67 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v10, types: [a.xz40] */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v6, types: [a.xz40] */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r6v39 */
    public final boolean f(KeyEvent keyEvent, Function0 function0) {
        lm40 lm40Var;
        e7z e7zVarZ;
        yzj yzjVar;
        yzj yzjVar2;
        lm40 lm40Var2;
        tzi tziVar;
        lm40 lm40VarV;
        xz40 xz40Var;
        lm40 lm40Var3;
        e7z e7zVarZ2;
        yzj yzjVar3;
        yzj yzjVar4;
        tzi tziVar2;
        xz40 xz40Var2;
        lm40 lm40VarV2;
        int size;
        tzi tziVar3;
        boolean z;
        nqq nqqVar = this.c;
        Trace.beginSection("FocusOwnerImpl:dispatchKeyEvent");
        try {
            if (this.d.e) {
                System.out.println((Object) "FocusRelatedWarning: Dispatching key event while focus system is invalidated.");
                Trace.endSection();
                return false;
            }
            if (!l(keyEvent)) {
                Trace.endSection();
                return false;
            }
            nqq nqqVarZ = uzb.Z(nqqVar);
            if (nqqVarZ != null) {
                if (!nqqVarZ.f20279a.n) {
                    xcx.b("visitLocalDescendants called on an unattached node");
                }
                lm40 lm40Var4 = nqqVarZ.f20279a;
                if ((lm40Var4.d & 9216) != 0) {
                    lm40Var2 = null;
                    for (lm40 lm40Var5 = lm40Var4.f; lm40Var5 != null; lm40Var5 = lm40Var5.f) {
                        int i = lm40Var5.c;
                        if ((i & 9216) != 0) {
                            if ((i & 1024) != 0) {
                                break;
                            }
                            lm40Var2 = lm40Var5;
                        }
                    }
                } else {
                    lm40Var2 = null;
                }
                if (lm40Var2 == null) {
                    if (nqqVarZ == null) {
                        if (!nqqVar.f20279a.n) {
                            xcx.b("visitAncestors called on an unattached node");
                        }
                        lm40Var = nqqVar.f20279a.e;
                        e7zVarZ = vcc.Z(nqqVar);
                        loop15: while (true) {
                            if (e7zVarZ != null) {
                                yzjVar = null;
                                break;
                            }
                            if ((((lm40) e7zVarZ.h1.g).d & 8192) != 0) {
                                while (lm40Var != null) {
                                    if ((lm40Var.c & 8192) != 0) {
                                        lm40VarV = lm40Var;
                                        xz40Var = null;
                                        while (lm40VarV != null) {
                                            if (lm40VarV instanceof lky) {
                                                yzjVar = lm40VarV;
                                                break loop15;
                                            }
                                            if ((lm40VarV.c & 8192) == 0) {
                                            }
                                            lm40VarV = vcc.V(xz40Var);
                                        }
                                    }
                                    lm40Var = lm40Var.e;
                                }
                            }
                            e7zVarZ = e7zVarZ.v();
                            if (e7zVarZ != null) {
                            }
                        }
                        yzjVar2 = (lky) yzjVar;
                        if (yzjVar2 != null) {
                            lm40Var2 = ((lm40) yzjVar2).f20279a;
                        } else {
                            lm40Var2 = null;
                        }
                    } else {
                        if (!nqqVarZ.f20279a.n) {
                            xcx.b("visitAncestors called on an unattached node");
                        }
                        lm40Var3 = nqqVarZ.f20279a;
                        e7zVarZ2 = vcc.Z(nqqVarZ);
                        loop11: while (true) {
                            if (e7zVarZ2 != null) {
                                yzjVar3 = null;
                                break;
                            }
                            if ((((lm40) e7zVarZ2.h1.g).d & 8192) != 0) {
                                while (lm40Var3 != null) {
                                    if ((lm40Var3.c & 8192) != 0) {
                                        xz40Var2 = null;
                                        lm40VarV2 = lm40Var3;
                                        while (lm40VarV2 != null) {
                                            if (lm40VarV2 instanceof lky) {
                                                yzjVar3 = lm40VarV2;
                                                break loop11;
                                            }
                                            if ((lm40VarV2.c & 8192) == 0) {
                                            }
                                            lm40VarV2 = vcc.V(xz40Var2);
                                        }
                                    }
                                    lm40Var3 = lm40Var3.e;
                                }
                            }
                            e7zVarZ2 = e7zVarZ2.v();
                            if (e7zVarZ2 != null) {
                            }
                        }
                        yzjVar4 = (lky) yzjVar3;
                        if (yzjVar4 != null) {
                            lm40Var2 = ((lm40) yzjVar4).f20279a;
                        } else {
                            if (!nqqVar.f20279a.n) {
                                xcx.b("visitAncestors called on an unattached node");
                            }
                            lm40Var = nqqVar.f20279a.e;
                            e7zVarZ = vcc.Z(nqqVar);
                            loop15: while (true) {
                                if (e7zVarZ != null) {
                                    yzjVar = null;
                                    break;
                                }
                                if ((((lm40) e7zVarZ.h1.g).d & 8192) != 0) {
                                    while (lm40Var != null) {
                                        if ((lm40Var.c & 8192) != 0) {
                                            lm40VarV = lm40Var;
                                            xz40Var = null;
                                            while (lm40VarV != null) {
                                                if (lm40VarV instanceof lky) {
                                                    yzjVar = lm40VarV;
                                                    break loop15;
                                                }
                                                if ((lm40VarV.c & 8192) == 0) {
                                                }
                                                lm40VarV = vcc.V(xz40Var);
                                            }
                                        }
                                        lm40Var = lm40Var.e;
                                    }
                                }
                                e7zVarZ = e7zVarZ.v();
                                if (e7zVarZ != null) {
                                }
                            }
                            yzjVar2 = (lky) yzjVar;
                            if (yzjVar2 != null) {
                                lm40Var2 = ((lm40) yzjVar2).f20279a;
                            } else {
                                lm40Var2 = null;
                            }
                        }
                    }
                }
            } else if (nqqVarZ == null) {
                if (!nqqVar.f20279a.n) {
                    xcx.b("visitAncestors called on an unattached node");
                }
                lm40Var = nqqVar.f20279a.e;
                e7zVarZ = vcc.Z(nqqVar);
                loop15: while (true) {
                    if (e7zVarZ != null) {
                        yzjVar = null;
                        break;
                    }
                    if ((((lm40) e7zVarZ.h1.g).d & 8192) != 0) {
                        while (lm40Var != null) {
                            if ((lm40Var.c & 8192) != 0) {
                                lm40VarV = lm40Var;
                                xz40Var = null;
                                while (lm40VarV != null) {
                                    if (lm40VarV instanceof lky) {
                                        yzjVar = lm40VarV;
                                        break loop15;
                                    }
                                    if ((lm40VarV.c & 8192) == 0 && (lm40VarV instanceof f3k)) {
                                        lm40 lm40Var6 = ((f3k) lm40VarV).p;
                                        int i2 = 0;
                                        lm40VarV = lm40VarV;
                                        xz40Var = xz40Var;
                                        while (lm40Var6 != null) {
                                            if ((lm40Var6.c & 8192) != 0) {
                                                i2++;
                                                xz40Var = xz40Var;
                                                if (i2 == 1) {
                                                    lm40VarV = lm40Var6;
                                                } else {
                                                    if (xz40Var == null) {
                                                        xz40Var = new xz40(new lm40[16]);
                                                    }
                                                    if (lm40VarV != null) {
                                                        xz40Var.b(lm40VarV);
                                                        lm40VarV = null;
                                                    }
                                                    xz40Var.b(lm40Var6);
                                                }
                                            }
                                            lm40Var6 = lm40Var6.f;
                                            lm40VarV = lm40VarV;
                                            xz40Var = xz40Var;
                                        }
                                        if (i2 == 1) {
                                        }
                                    }
                                    lm40VarV = vcc.V(xz40Var);
                                }
                            }
                            lm40Var = lm40Var.e;
                        }
                    }
                    e7zVarZ = e7zVarZ.v();
                    lm40Var = (e7zVarZ != null || (tziVar = e7zVarZ.h1) == null) ? null : (wso0) tziVar.f;
                }
                yzjVar2 = (lky) yzjVar;
                if (yzjVar2 != null) {
                    lm40Var2 = ((lm40) yzjVar2).f20279a;
                } else {
                    lm40Var2 = null;
                }
            } else {
                if (!nqqVarZ.f20279a.n) {
                    xcx.b("visitAncestors called on an unattached node");
                }
                lm40Var3 = nqqVarZ.f20279a;
                e7zVarZ2 = vcc.Z(nqqVarZ);
                loop11: while (true) {
                    if (e7zVarZ2 != null) {
                        yzjVar3 = null;
                        break;
                    }
                    if ((((lm40) e7zVarZ2.h1.g).d & 8192) != 0) {
                        while (lm40Var3 != null) {
                            if ((lm40Var3.c & 8192) != 0) {
                                xz40Var2 = null;
                                lm40VarV2 = lm40Var3;
                                while (lm40VarV2 != null) {
                                    if (lm40VarV2 instanceof lky) {
                                        yzjVar3 = lm40VarV2;
                                        break loop11;
                                    }
                                    if ((lm40VarV2.c & 8192) == 0 && (lm40VarV2 instanceof f3k)) {
                                        lm40 lm40Var7 = ((f3k) lm40VarV2).p;
                                        int i3 = 0;
                                        lm40VarV2 = lm40VarV2;
                                        xz40Var2 = xz40Var2;
                                        while (lm40Var7 != null) {
                                            if ((lm40Var7.c & 8192) != 0) {
                                                i3++;
                                                xz40Var2 = xz40Var2;
                                                if (i3 == 1) {
                                                    lm40VarV2 = lm40Var7;
                                                } else {
                                                    if (xz40Var2 == null) {
                                                        xz40Var2 = new xz40(new lm40[16]);
                                                    }
                                                    if (lm40VarV2 != null) {
                                                        xz40Var2.b(lm40VarV2);
                                                        lm40VarV2 = null;
                                                    }
                                                    xz40Var2.b(lm40Var7);
                                                }
                                            }
                                            lm40Var7 = lm40Var7.f;
                                            lm40VarV2 = lm40VarV2;
                                            xz40Var2 = xz40Var2;
                                        }
                                        if (i3 == 1) {
                                        }
                                    }
                                    lm40VarV2 = vcc.V(xz40Var2);
                                }
                            }
                            lm40Var3 = lm40Var3.e;
                        }
                    }
                    e7zVarZ2 = e7zVarZ2.v();
                    lm40Var3 = (e7zVarZ2 != null || (tziVar2 = e7zVarZ2.h1) == null) ? null : (wso0) tziVar2.f;
                }
                yzjVar4 = (lky) yzjVar3;
                if (yzjVar4 != null) {
                    lm40Var2 = ((lm40) yzjVar4).f20279a;
                } else {
                    if (!nqqVar.f20279a.n) {
                        xcx.b("visitAncestors called on an unattached node");
                    }
                    lm40Var = nqqVar.f20279a.e;
                    e7zVarZ = vcc.Z(nqqVar);
                    loop15: while (true) {
                        if (e7zVarZ != null) {
                            yzjVar = null;
                            break;
                        }
                        if ((((lm40) e7zVarZ.h1.g).d & 8192) != 0) {
                            while (lm40Var != null) {
                                if ((lm40Var.c & 8192) != 0) {
                                    lm40VarV = lm40Var;
                                    xz40Var = null;
                                    while (lm40VarV != null) {
                                        if (lm40VarV instanceof lky) {
                                            yzjVar = lm40VarV;
                                            break loop15;
                                        }
                                        if ((lm40VarV.c & 8192) == 0) {
                                        }
                                        lm40VarV = vcc.V(xz40Var);
                                    }
                                }
                                lm40Var = lm40Var.e;
                            }
                        }
                        e7zVarZ = e7zVarZ.v();
                        if (e7zVarZ != null) {
                        }
                    }
                    yzjVar2 = (lky) yzjVar;
                    if (yzjVar2 != null) {
                        lm40Var2 = ((lm40) yzjVar2).f20279a;
                    } else {
                        lm40Var2 = null;
                    }
                }
            }
            if (lm40Var2 != null) {
                if (!lm40Var2.f20279a.n) {
                    xcx.b("visitAncestors called on an unattached node");
                }
                lm40 lm40Var8 = lm40Var2.f20279a.e;
                e7z e7zVarZ3 = vcc.Z(lm40Var2);
                ArrayList arrayList = null;
                while (e7zVarZ3 != null) {
                    if ((((lm40) e7zVarZ3.h1.g).d & 8192) != 0) {
                        while (lm40Var8 != null) {
                            if ((lm40Var8.c & 8192) != 0) {
                                lm40 lm40VarV3 = lm40Var8;
                                xz40 xz40Var3 = null;
                                while (lm40VarV3 != null) {
                                    if (lm40VarV3 instanceof lky) {
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                        }
                                        arrayList.add(lm40VarV3);
                                        z = false;
                                    } else {
                                        z = true;
                                    }
                                    if (z && (lm40VarV3.c & 8192) != 0 && (lm40VarV3 instanceof f3k)) {
                                        int i4 = 0;
                                        for (lm40 lm40Var9 = ((f3k) lm40VarV3).p; lm40Var9 != null; lm40Var9 = lm40Var9.f) {
                                            if ((lm40Var9.c & 8192) != 0) {
                                                i4++;
                                                if (i4 == 1) {
                                                    lm40VarV3 = lm40Var9;
                                                } else {
                                                    if (xz40Var3 == null) {
                                                        xz40Var3 = new xz40(new lm40[16]);
                                                    }
                                                    if (lm40VarV3 != null) {
                                                        xz40Var3.b(lm40VarV3);
                                                        lm40VarV3 = null;
                                                    }
                                                    xz40Var3.b(lm40Var9);
                                                }
                                            }
                                        }
                                        if (i4 == 1) {
                                        }
                                    }
                                    lm40VarV3 = vcc.V(xz40Var3);
                                }
                            }
                            lm40Var8 = lm40Var8.e;
                        }
                    }
                    e7zVarZ3 = e7zVarZ3.v();
                    lm40Var8 = (e7zVarZ3 == null || (tziVar3 = e7zVarZ3.h1) == null) ? null : (wso0) tziVar3.f;
                }
                if (arrayList != null && (size = arrayList.size() - 1) >= 0) {
                    while (true) {
                        int i5 = size - 1;
                        if (((lky) arrayList.get(size)).c0(keyEvent)) {
                            Trace.endSection();
                            return true;
                        }
                        if (i5 < 0) {
                            break;
                        }
                        size = i5;
                    }
                }
                ?? V = lm40Var2.f20279a;
                ?? xz40Var4 = 0;
                while (V != 0) {
                    if (V instanceof lky) {
                        if (((lky) V).c0(keyEvent)) {
                            Trace.endSection();
                            return true;
                        }
                    } else if ((V.c & 8192) != 0 && (V instanceof f3k)) {
                        lm40 lm40Var10 = ((f3k) V).p;
                        int i6 = 0;
                        xz40Var4 = xz40Var4;
                        V = V;
                        while (lm40Var10 != null) {
                            if ((lm40Var10.c & 8192) != 0) {
                                i6++;
                                xz40Var4 = xz40Var4;
                                if (i6 == 1) {
                                    V = lm40Var10;
                                } else {
                                    if (xz40Var4 == 0) {
                                        xz40Var4 = new xz40(new lm40[16]);
                                    }
                                    if (V != 0) {
                                        xz40Var4.b(V);
                                        V = 0;
                                    }
                                    xz40Var4.b(lm40Var10);
                                }
                            }
                            lm40Var10 = lm40Var10.f;
                            xz40Var4 = xz40Var4;
                            V = V;
                        }
                        if (i6 == 1) {
                        }
                    }
                    V = vcc.V(xz40Var4);
                }
                if (((Boolean) function0.invoke()).booleanValue()) {
                    Trace.endSection();
                    return true;
                }
                ?? V2 = lm40Var2.f20279a;
                ?? xz40Var5 = 0;
                while (V2 != 0) {
                    if (V2 instanceof lky) {
                        if (((lky) V2).l0(keyEvent)) {
                            Trace.endSection();
                            return true;
                        }
                    } else if ((V2.c & 8192) != 0 && (V2 instanceof f3k)) {
                        lm40 lm40Var11 = ((f3k) V2).p;
                        int i7 = 0;
                        V2 = V2;
                        xz40Var5 = xz40Var5;
                        while (lm40Var11 != null) {
                            if ((lm40Var11.c & 8192) != 0) {
                                i7++;
                                xz40Var5 = xz40Var5;
                                if (i7 == 1) {
                                    V2 = lm40Var11;
                                } else {
                                    if (xz40Var5 == 0) {
                                        xz40Var5 = new xz40(new lm40[16]);
                                    }
                                    if (V2 != 0) {
                                        xz40Var5.b(V2);
                                        V2 = 0;
                                    }
                                    xz40Var5.b(lm40Var11);
                                }
                            }
                            lm40Var11 = lm40Var11.f;
                            V2 = V2;
                            xz40Var5 = xz40Var5;
                        }
                        if (i7 == 1) {
                        }
                    }
                    V2 = vcc.V(xz40Var5);
                }
                if (arrayList != null) {
                    int size2 = arrayList.size();
                    for (int i8 = 0; i8 < size2; i8++) {
                        if (((lky) arrayList.get(i8)).l0(keyEvent)) {
                            Trace.endSection();
                            return true;
                        }
                    }
                }
            }
            Trace.endSection();
            return false;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final Boolean g(int i, jge0 jge0Var, Function1 function1) {
        boolean zV;
        nqq nqqVar;
        tzi tziVar;
        nqq nqqVar2 = this.c;
        nqq nqqVarZ = uzb.Z(nqqVar2);
        int i2 = 4;
        AndroidComposeView androidComposeView = this.b;
        boolean zBooleanValue = false;
        if (nqqVarZ != null) {
            k6z layoutDirection = androidComposeView.getLayoutDirection();
            aqq aqqVarB1 = nqqVarZ.b1();
            cqq cqqVar = aqqVarB1.h;
            cqq cqqVar2 = aqqVarB1.i;
            if (i == 1) {
                cqqVar = aqqVarB1.b;
            } else if (i == 2) {
                cqqVar = aqqVarB1.c;
            } else if (i == 5) {
                cqqVar = aqqVarB1.d;
            } else if (i == 6) {
                cqqVar = aqqVarB1.e;
            } else if (i == 3) {
                int iOrdinal = layoutDirection.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        t9f.b();
                        return null;
                    }
                    cqqVar = cqqVar2;
                }
                if (cqqVar == cqq.b) {
                    cqqVar = null;
                }
                if (cqqVar == null) {
                    cqqVar = aqqVarB1.f;
                }
            } else if (i == 4) {
                int iOrdinal2 = layoutDirection.ordinal();
                if (iOrdinal2 == 0) {
                    cqqVar = cqqVar2;
                } else if (iOrdinal2 != 1) {
                    t9f.b();
                    return null;
                }
                if (cqqVar == cqq.b) {
                    cqqVar = null;
                }
                if (cqqVar == null) {
                    cqqVar = aqqVarB1.g;
                }
            } else {
                if (i != 7 && i != 8) {
                    jf4.n("invalid FocusDirection");
                    return null;
                }
                d5a d5aVar = new d5a(i);
                ypq ypqVar = (ypq) vcc.a0(nqqVarZ).getFocusOwner();
                nqq nqqVarH = ypqVar.h();
                if (i == 7) {
                    aqqVarB1.j.invoke(d5aVar);
                } else {
                    aqqVarB1.k.invoke(d5aVar);
                }
                cqqVar = d5aVar.b ? cqq.c : nqqVarH != ypqVar.h() ? cqq.d : cqq.b;
            }
            cqq cqqVar3 = cqq.c;
            if (!Intrinsics.d(cqqVar, cqqVar3)) {
                if (Intrinsics.d(cqqVar, cqq.d)) {
                    nqq nqqVarZ2 = uzb.Z(nqqVar2);
                    if (nqqVarZ2 != null) {
                        return (Boolean) function1.invoke(nqqVarZ2);
                    }
                } else {
                    cqq cqqVar4 = cqq.b;
                    if (!Intrinsics.d(cqqVar, cqqVar4)) {
                        if (cqqVar == cqqVar4) {
                            jf4.n("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
                            return null;
                        }
                        if (cqqVar == cqqVar3) {
                            jf4.n("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
                            return null;
                        }
                        xz40 xz40Var = cqqVar.f4808a;
                        int i3 = xz40Var.c;
                        if (i3 == 0) {
                            System.out.println((Object) "FocusRelatedWarning: \n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
                        } else {
                            Object[] objArr = xz40Var.f41739a;
                            boolean z = false;
                            for (int i4 = 0; i4 < i3; i4++) {
                                yzj yzjVar = (eqq) objArr[i4];
                                if (!((lm40) yzjVar).f20279a.n) {
                                    xcx.b("visitChildren called on an unattached node");
                                }
                                xz40 xz40Var2 = new xz40(new lm40[16]);
                                lm40 lm40Var = ((lm40) yzjVar).f20279a;
                                lm40 lm40Var2 = lm40Var.f;
                                if (lm40Var2 == null) {
                                    vcc.v(xz40Var2, lm40Var);
                                } else {
                                    xz40Var2.b(lm40Var2);
                                }
                                while (true) {
                                    int i5 = xz40Var2.c;
                                    if (i5 == 0) {
                                        break;
                                    }
                                    lm40 lm40VarV = (lm40) xz40Var2.k(i5 - 1);
                                    if ((lm40VarV.d & 1024) == 0) {
                                        vcc.v(xz40Var2, lm40VarV);
                                    } else {
                                        while (lm40VarV != null) {
                                            if ((lm40VarV.c & 1024) != 0) {
                                                xz40 xz40Var3 = null;
                                                while (lm40VarV != null) {
                                                    if (lm40VarV instanceof nqq) {
                                                        if (((Boolean) function1.invoke((nqq) lm40VarV)).booleanValue()) {
                                                            z = true;
                                                            break;
                                                        }
                                                    } else if ((lm40VarV.c & 1024) != 0 && (lm40VarV instanceof f3k)) {
                                                        int i6 = 0;
                                                        for (lm40 lm40Var3 = ((f3k) lm40VarV).p; lm40Var3 != null; lm40Var3 = lm40Var3.f) {
                                                            if ((lm40Var3.c & 1024) != 0) {
                                                                i6++;
                                                                if (i6 == 1) {
                                                                    lm40VarV = lm40Var3;
                                                                } else {
                                                                    if (xz40Var3 == null) {
                                                                        xz40Var3 = new xz40(new lm40[16]);
                                                                    }
                                                                    if (lm40VarV != null) {
                                                                        xz40Var3.b(lm40VarV);
                                                                        lm40VarV = null;
                                                                    }
                                                                    xz40Var3.b(lm40Var3);
                                                                }
                                                            }
                                                        }
                                                        if (i6 == 1) {
                                                        }
                                                    }
                                                    lm40VarV = vcc.V(xz40Var3);
                                                }
                                                break;
                                            }
                                            lm40VarV = lm40VarV.f;
                                        }
                                    }
                                }
                            }
                            zBooleanValue = z;
                        }
                        return Boolean.valueOf(zBooleanValue);
                    }
                }
            }
            return null;
        }
        nqqVarZ = null;
        k6z layoutDirection2 = androidComposeView.getLayoutDirection();
        f8m f8mVar = new f8m((Object) nqqVarZ, (Object) this, (Object) function1, (byte) 23);
        if (i == 1 || i == 2) {
            if (i == 1) {
                zV = ydx.H(nqqVar2, f8mVar);
            } else {
                if (i != 2) {
                    jf4.n("This function should only be used for 1-D focus search");
                    return null;
                }
                zV = ydx.v(nqqVar2, f8mVar);
            }
            return Boolean.valueOf(zV);
        }
        if (i == 3 || i == 4 || i == 5 || i == 6) {
            return k7n0.G(i, f8mVar, nqqVar2, jge0Var);
        }
        if (i == 7) {
            int iOrdinal3 = layoutDirection2.ordinal();
            if (iOrdinal3 != 0) {
                if (iOrdinal3 != 1) {
                    t9f.b();
                    return null;
                }
                i2 = 3;
            }
            nqq nqqVarZ3 = uzb.Z(nqqVar2);
            if (nqqVarZ3 != null) {
                return k7n0.G(i2, f8mVar, nqqVarZ3, jge0Var);
            }
            return null;
        }
        if (i != 8) {
            throw new IllegalStateException("Focus search invoked with invalid FocusDirection ".concat(jpq.a(i)).toString());
        }
        nqq nqqVarZ4 = uzb.Z(nqqVar2);
        if (nqqVarZ4 == null) {
            nqqVar = null;
            break;
        }
        if (!nqqVarZ4.f20279a.n) {
            xcx.b("visitAncestors called on an unattached node");
        }
        lm40 lm40Var4 = nqqVarZ4.f20279a.e;
        e7z e7zVarZ = vcc.Z(nqqVarZ4);
        loop5: while (true) {
            if (e7zVarZ == null) {
                nqqVar = null;
                break;
            }
            if ((((lm40) e7zVarZ.h1.g).d & 1024) != 0) {
                while (lm40Var4 != null) {
                    if ((lm40Var4.c & 1024) != 0) {
                        lm40 lm40VarV2 = lm40Var4;
                        xz40 xz40Var4 = null;
                        while (lm40VarV2 != null) {
                            if (lm40VarV2 instanceof nqq) {
                                nqq nqqVar3 = (nqq) lm40VarV2;
                                if (nqqVar3.b1().f1309a) {
                                    nqqVar = nqqVar3;
                                    break loop5;
                                }
                            } else if ((lm40VarV2.c & 1024) != 0 && (lm40VarV2 instanceof f3k)) {
                                int i7 = 0;
                                for (lm40 lm40Var5 = ((f3k) lm40VarV2).p; lm40Var5 != null; lm40Var5 = lm40Var5.f) {
                                    if ((lm40Var5.c & 1024) != 0) {
                                        i7++;
                                        if (i7 == 1) {
                                            lm40VarV2 = lm40Var5;
                                        } else {
                                            if (xz40Var4 == null) {
                                                xz40Var4 = new xz40(new lm40[16]);
                                            }
                                            if (lm40VarV2 != null) {
                                                xz40Var4.b(lm40VarV2);
                                                lm40VarV2 = null;
                                            }
                                            xz40Var4.b(lm40Var5);
                                        }
                                    }
                                }
                                if (i7 != 1) {
                                    lm40VarV2 = vcc.V(xz40Var4);
                                }
                            }
                            lm40VarV2 = vcc.V(xz40Var4);
                        }
                    }
                    lm40Var4 = lm40Var4.e;
                }
            }
            e7zVarZ = e7zVarZ.v();
            lm40Var4 = (e7zVarZ == null || (tziVar = e7zVarZ.h1) == null) ? null : (wso0) tziVar.f;
        }
        if (nqqVar != null && nqqVar != nqqVar2) {
            zBooleanValue = ((Boolean) f8mVar.invoke(nqqVar)).booleanValue();
        }
        return Boolean.valueOf(zBooleanValue);
    }

    public final nqq h() {
        nqq nqqVar = this.h;
        if (nqqVar == null || !nqqVar.n) {
            return null;
        }
        return nqqVar;
    }

    public final boolean i(int i, boolean z) {
        nqq nqqVarH;
        boolean z2 = ebc.f7512a;
        AndroidComposeView androidComposeView = this.f43042a;
        if (!z2 || (nqqVarH = h()) == null || !nqqVarH.o || !androidComposeView.u(i)) {
            mie0 mie0Var = new mie0();
            mie0Var.f21842a = Boolean.FALSE;
            nqq nqqVarH2 = h();
            Boolean boolG = g(i, androidComposeView.getEmbeddedViewFocusRect(), new z08((Object) mie0Var, i, (byte) 3));
            if (!Intrinsics.d(boolG, Boolean.TRUE) || nqqVarH2 == h()) {
                if (boolG != null && mie0Var.f21842a != null) {
                    if (!boolG.booleanValue() || !((Boolean) mie0Var.f21842a).booleanValue()) {
                        if ((i == 1 || i == 2) && z) {
                            if (d(i, false, false)) {
                                Boolean boolG2 = g(i, null, new dx2(i, (byte) 15));
                                if (boolG2 != null ? boolG2.booleanValue() : false) {
                                }
                            }
                        } else if (!ebc.f7512a) {
                            return androidComposeView.u(i);
                        }
                    }
                }
                return false;
            }
        }
        return true;
    }

    public final boolean j(int i) {
        if (!d(i, false, false)) {
            return false;
        }
        Boolean boolG = g(i, null, new dx2(i, (byte) 14));
        boolean zBooleanValue = boolG != null ? boolG.booleanValue() : false;
        if (!zBooleanValue) {
            e();
        }
        return zBooleanValue;
    }

    public final void k(nqq nqqVar) {
        nqq nqqVar2 = this.h;
        this.h = nqqVar;
        vy40 vy40Var = this.g;
        Object[] objArr = vy40Var.f38232a;
        int i = vy40Var.b;
        for (int i2 = 0; i2 < i; i2++) {
            ((upq) objArr[i2]).a(nqqVar2, nqqVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x020f  */
    /* JADX WARN: Code duplicated, block: B:49:0x022b  */
    /* JADX WARN: Code duplicated, block: B:51:0x023b  */
    /* JADX WARN: Code duplicated, block: B:52:0x027f  */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean l(KeyEvent keyEvent) {
        int iNumberOfTrailingZeros;
        int i;
        long j;
        int iNumberOfTrailingZeros2;
        int i2;
        long[] jArr;
        long[] jArr2;
        int i3;
        long[] jArr3;
        long[] jArr4;
        int i4;
        int i5;
        long[] jArr5;
        int i6;
        boolean z;
        long jC = n7x.C(keyEvent);
        int iH = n7x.H(keyEvent);
        int i7 = -862048943;
        long j2 = 0;
        char c = '\b';
        int i8 = 0;
        int i9 = 1;
        if (iH != 2) {
            if (iH != 1) {
                return true;
            }
            ky40 ky40Var = this.f;
            if (ky40Var == null || !ky40Var.a(jC)) {
                return false;
            }
            ky40 ky40Var2 = this.f;
            if (ky40Var2 != null) {
                int iHashCode = Long.hashCode(jC);
                int i10 = (iHashCode ^ (iHashCode >>> 16)) * (-862048943);
                int i11 = i10 ^ (i10 >>> 16);
                int i12 = i11 & 127;
                int i13 = ky40Var2.c;
                int i14 = i11 >>> 7;
                loop5: while (true) {
                    int i15 = i14 & i13;
                    long[] jArr6 = ky40Var2.f19090a;
                    int i16 = i15 >> 3;
                    int i17 = (i15 & 7) << 3;
                    long j3 = ((jArr6[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr6[i16] >>> i17);
                    long j4 = (((long) i12) * 72340172838076673L) ^ j3;
                    for (long j5 = (~j4) & (j4 - 72340172838076673L) & (-9187201950435737472L); j5 != 0; j5 &= j5 - 1) {
                        iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j5) >> 3) + i15) & i13;
                        if (ky40Var2.b[iNumberOfTrailingZeros] == jC) {
                            break loop5;
                        }
                    }
                    if ((j3 & ((~j3) << 6) & (-9187201950435737472L)) != 0) {
                        iNumberOfTrailingZeros = -1;
                        break;
                    }
                    i8 += 8;
                    i14 = i15 + i8;
                }
                if (iNumberOfTrailingZeros >= 0) {
                    ky40Var2.d--;
                    long[] jArr7 = ky40Var2.f19090a;
                    int i18 = ky40Var2.c;
                    int i19 = iNumberOfTrailingZeros >> 3;
                    int i20 = (iNumberOfTrailingZeros & 7) << 3;
                    long j6 = (jArr7[i19] & (~(255 << i20))) | (254 << i20);
                    jArr7[i19] = j6;
                    jArr7[(((iNumberOfTrailingZeros - 7) & i18) + (i18 & 7)) >> 3] = j6;
                    return true;
                }
            }
            return true;
        }
        ky40 ky40Var3 = this.f;
        if (ky40Var3 == null) {
            ky40Var3 = new ky40(3);
            this.f = ky40Var3;
        }
        ky40 ky40Var4 = ky40Var3;
        int iHashCode2 = Long.hashCode(jC);
        int i21 = (iHashCode2 ^ (iHashCode2 >>> 16)) * (-862048943);
        int i22 = i21 ^ (i21 >>> 16);
        int i23 = i22 >>> 7;
        int i24 = i22 & 127;
        int i25 = ky40Var4.c;
        int i26 = i23 & i25;
        int i27 = 0;
        loop0: while (true) {
            long[] jArr8 = ky40Var4.f19090a;
            int i28 = i26 >> 3;
            int i29 = (i26 & 7) << 3;
            long j7 = (jArr8[i28] >>> i29) | ((jArr8[i28 + 1] << (64 - i29)) & ((-i29) >> 63));
            int i30 = i7;
            long j8 = i24;
            long j9 = j7 ^ (j8 * 72340172838076673L);
            long j10 = (j9 - 72340172838076673L) & (~j9) & (-9187201950435737472L);
            while (j10 != j2) {
                iNumberOfTrailingZeros2 = (i26 + (Long.numberOfTrailingZeros(j10) >> 3)) & i25;
                long j11 = j2;
                if (ky40Var4.b[iNumberOfTrailingZeros2] == jC) {
                    z = 1;
                    break loop0;
                }
                j10 &= j10 - 1;
                j2 = j11;
            }
            long j12 = j2;
            if ((j7 & ((~j7) << 6) & (-9187201950435737472L)) != j12) {
                int iB = ky40Var4.b(i23);
                if (ky40Var4.e != 0 || ((ky40Var4.f19090a[iB >> 3] >> ((iB & 7) << 3)) & 255) == 254) {
                    i = 1;
                    j = 128;
                } else {
                    int i31 = ky40Var4.c;
                    if (i31 > 8) {
                        long j13 = ky40Var4.d;
                        g2t0 g2t0Var = h2t0.b;
                        if (Long.compare((j13 * 32) ^ Long.MIN_VALUE, (((long) i31) * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr9 = ky40Var4.f19090a;
                            int i32 = ky40Var4.c;
                            long[] jArr10 = ky40Var4.b;
                            int i33 = (i32 + 7) >> 3;
                            int i34 = 0;
                            while (i34 < i33) {
                                long j14 = jArr9[i34] & (-9187201950435737472L);
                                jArr9[i34] = ((~j14) + (j14 >>> 7)) & (-72340172838076674L);
                                i34++;
                                c = c;
                                i32 = i32;
                            }
                            char c2 = c;
                            int i35 = i32;
                            j = 128;
                            int iD = tx3.D(jArr9);
                            int i36 = iD - 1;
                            long j15 = 72057594037927935L;
                            jArr9[i36] = (jArr9[i36] & 72057594037927935L) | (-72057594037927936L);
                            jArr9[iD] = jArr9[0];
                            int i37 = i35;
                            int i38 = 0;
                            while (i38 != i37) {
                                int i39 = i38 >> 3;
                                int i40 = (i38 & 7) << 3;
                                long j16 = (jArr9[i39] >> i40) & 255;
                                if (j16 != 128 && j16 == 254) {
                                    int iHashCode3 = Long.hashCode(jArr10[i38]);
                                    int i41 = (iHashCode3 ^ (iHashCode3 >>> 16)) * i30;
                                    int i42 = i41 ^ (i41 >>> 16);
                                    long j17 = j15;
                                    int i43 = i42 >>> 7;
                                    int iB2 = ky40Var4.b(i43);
                                    int i44 = i43 & i37;
                                    char c3 = c2;
                                    if (((iB2 - i44) & i37) / 8 == ((i38 - i44) & i37) / 8) {
                                        int i45 = i9;
                                        jArr9[i39] = (jArr9[i39] & (~(255 << i40))) | (((long) (i42 & 127)) << i40);
                                        jArr9[jArr9.length - i45] = (jArr9[0] & j17) | Long.MIN_VALUE;
                                        i38++;
                                        i9 = i45;
                                        j15 = j17;
                                        c2 = c3;
                                    } else {
                                        int i46 = i9;
                                        int i47 = iB2 >> 3;
                                        long j18 = jArr9[i47];
                                        int i48 = (iB2 & 7) << 3;
                                        if (((j18 >> i48) & 255) == 128) {
                                            int i49 = i38;
                                            jArr9[i47] = (j18 & (~(255 << i48))) | (((long) (i42 & 127)) << i48);
                                            jArr9[i39] = (jArr9[i39] & (~(255 << i40))) | (128 << i40);
                                            jArr10[iB2] = jArr10[i49];
                                            jArr10[i49] = j12;
                                            i6 = i49;
                                        } else {
                                            int i50 = i38;
                                            jArr9[i47] = (j18 & (~(255 << i48))) | (((long) (i42 & 127)) << i48);
                                            long j19 = jArr10[iB2];
                                            jArr10[iB2] = jArr10[i50];
                                            jArr10[i50] = j19;
                                            i6 = i50 - 1;
                                        }
                                        jArr9[jArr9.length - i46] = (jArr9[0] & j17) | Long.MIN_VALUE;
                                        i38 = i6 + i46;
                                        i9 = i46;
                                        j15 = j17;
                                        c2 = c3;
                                        i37 = i37;
                                    }
                                } else {
                                    i38++;
                                }
                            }
                            i2 = i9;
                            ky40Var4.e = u1h0.a(ky40Var4.c) - ky40Var4.d;
                        } else {
                            i2 = 1;
                            j = 128;
                            int iB3 = u1h0.b(ky40Var4.c);
                            jArr = ky40Var4.f19090a;
                            jArr2 = ky40Var4.b;
                            i3 = ky40Var4.c;
                            ky40Var4.c(iB3);
                            jArr3 = ky40Var4.f19090a;
                            jArr4 = ky40Var4.b;
                            i4 = ky40Var4.c;
                            i5 = 0;
                            while (i5 < i3) {
                                if (((jArr[i5 >> 3] >> ((i5 & 7) << 3)) & 255) < 128) {
                                    long j20 = jArr2[i5];
                                    int iHashCode4 = Long.hashCode(j20);
                                    int i51 = (iHashCode4 ^ (iHashCode4 >>> 16)) * i30;
                                    int i52 = i51 ^ (i51 >>> 16);
                                    int iB4 = ky40Var4.b(i52 >>> 7);
                                    jArr5 = jArr3;
                                    int i53 = iB4 >> 3;
                                    int i54 = (iB4 & 7) << 3;
                                    long j21 = (jArr5[i53] & (~(255 << i54))) | (((long) (i52 & 127)) << i54);
                                    jArr5[i53] = j21;
                                    jArr5[(((iB4 - 7) & i4) + (i4 & 7)) >> 3] = j21;
                                    jArr4[iB4] = j20;
                                } else {
                                    jArr5 = jArr3;
                                }
                                i5++;
                                jArr = jArr;
                                jArr3 = jArr5;
                                jArr2 = jArr2;
                                i2 = i2;
                            }
                        }
                    } else {
                        i2 = 1;
                        j = 128;
                        int iB5 = u1h0.b(ky40Var4.c);
                        jArr = ky40Var4.f19090a;
                        jArr2 = ky40Var4.b;
                        i3 = ky40Var4.c;
                        ky40Var4.c(iB5);
                        jArr3 = ky40Var4.f19090a;
                        jArr4 = ky40Var4.b;
                        i4 = ky40Var4.c;
                        i5 = 0;
                        while (i5 < i3) {
                            if (((jArr[i5 >> 3] >> ((i5 & 7) << 3)) & 255) < 128) {
                                long j22 = jArr2[i5];
                                int iHashCode5 = Long.hashCode(j22);
                                int i55 = (iHashCode5 ^ (iHashCode5 >>> 16)) * i30;
                                int i56 = i55 ^ (i55 >>> 16);
                                int iB6 = ky40Var4.b(i56 >>> 7);
                                jArr5 = jArr3;
                                int i57 = iB6 >> 3;
                                int i58 = (iB6 & 7) << 3;
                                long j23 = (jArr5[i57] & (~(255 << i58))) | (((long) (i56 & 127)) << i58);
                                jArr5[i57] = j23;
                                jArr5[(((iB6 - 7) & i4) + (i4 & 7)) >> 3] = j23;
                                jArr4[iB6] = j22;
                            } else {
                                jArr5 = jArr3;
                            }
                            i5++;
                            jArr = jArr;
                            jArr3 = jArr5;
                            jArr2 = jArr2;
                            i2 = i2;
                        }
                    }
                    i = i2;
                    iB = ky40Var4.b(i23);
                }
                iNumberOfTrailingZeros2 = iB;
                ky40Var4.d++;
                int i59 = ky40Var4.e;
                long[] jArr11 = ky40Var4.f19090a;
                int i60 = iNumberOfTrailingZeros2 >> 3;
                long j24 = jArr11[i60];
                int i61 = (iNumberOfTrailingZeros2 & 7) << 3;
                ky40Var4.e = i59 - (((j24 >> i61) & 255) == j ? i == true ? 1 : 0 : 0);
                int i62 = ky40Var4.c;
                long j25 = (j24 & (~(255 << i61))) | (j8 << i61);
                jArr11[i60] = j25;
                jArr11[(((iNumberOfTrailingZeros2 - 7) & i62) + (i62 & 7)) >> 3] = j25;
                z = i;
                break;
            }
            i27 += 8;
            i26 = (i26 + i27) & i25;
            i7 = i30;
            j2 = j12;
        }
        ky40Var4.b[iNumberOfTrailingZeros2] = jC;
        return z;
    }
}
