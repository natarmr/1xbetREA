package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes4.dex */
public abstract class efa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f7712a = q3d.j(new gfa(1, R.string.game_progress), new ffa(2, R.string.card_cricket_card_cost));

    /* JADX WARN: Code duplicated, block: B:101:0x043a  */
    /* JADX WARN: Code duplicated, block: B:102:0x043c  */
    /* JADX WARN: Code duplicated, block: B:107:0x0451  */
    /* JADX WARN: Code duplicated, block: B:109:0x0461 A[PHI: r15
  0x0461: PHI (r15v6 int) = (r15v5 int), (r15v11 int) binds: [B:98:0x0432, B:101:0x043a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:113:0x047e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:114:0x0480  */
    /* JADX WARN: Code duplicated, block: B:116:0x0494  */
    /* JADX WARN: Code duplicated, block: B:118:0x049a  */
    /* JADX WARN: Code duplicated, block: B:119:0x049c  */
    /* JADX WARN: Code duplicated, block: B:124:0x04b1  */
    /* JADX WARN: Code duplicated, block: B:126:0x04c1  */
    /* JADX WARN: Code duplicated, block: B:130:0x04d0  */
    /* JADX WARN: Code duplicated, block: B:132:0x04e4  */
    /* JADX WARN: Code duplicated, block: B:134:0x04ea  */
    /* JADX WARN: Code duplicated, block: B:135:0x04ec  */
    /* JADX WARN: Code duplicated, block: B:140:0x0501  */
    /* JADX WARN: Code duplicated, block: B:142:0x0511 A[PHI: r15
  0x0511: PHI (r15v73 int) = (r15v72 int), (r15v78 int) binds: [B:131:0x04e2, B:134:0x04ea] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:144:0x051c  */
    /* JADX WARN: Code duplicated, block: B:146:0x0530  */
    /* JADX WARN: Code duplicated, block: B:148:0x0536  */
    /* JADX WARN: Code duplicated, block: B:149:0x0538  */
    /* JADX WARN: Code duplicated, block: B:154:0x054d  */
    /* JADX WARN: Code duplicated, block: B:156:0x055d A[PHI: r15
  0x055d: PHI (r15v14 int) = (r15v13 int), (r15v19 int) binds: [B:145:0x052e, B:148:0x0536] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:160:0x0578  */
    /* JADX WARN: Code duplicated, block: B:162:0x057b  */
    /* JADX WARN: Code duplicated, block: B:164:0x0580  */
    /* JADX WARN: Code duplicated, block: B:165:0x0583  */
    /* JADX WARN: Code duplicated, block: B:168:0x0591  */
    /* JADX WARN: Code duplicated, block: B:170:0x0594  */
    /* JADX WARN: Code duplicated, block: B:172:0x0599  */
    /* JADX WARN: Code duplicated, block: B:173:0x059c  */
    /* JADX WARN: Code duplicated, block: B:176:0x05aa  */
    /* JADX WARN: Code duplicated, block: B:178:0x05ae  */
    /* JADX WARN: Code duplicated, block: B:180:0x05c5  */
    /* JADX WARN: Code duplicated, block: B:181:0x05d4  */
    /* JADX WARN: Code duplicated, block: B:182:0x05e3  */
    /* JADX WARN: Code duplicated, block: B:183:0x05f2  */
    /* JADX WARN: Code duplicated, block: B:184:0x0601  */
    /* JADX WARN: Code duplicated, block: B:185:0x0610  */
    /* JADX WARN: Code duplicated, block: B:188:0x0635  */
    /* JADX WARN: Code duplicated, block: B:190:0x063b  */
    /* JADX WARN: Code duplicated, block: B:191:0x063d  */
    /* JADX WARN: Code duplicated, block: B:197:0x0650  */
    /* JADX WARN: Code duplicated, block: B:199:0x0660 A[PHI: r15
  0x0660: PHI (r15v29 ??) = (r15v108 ??), (r15v70 ??) binds: [B:187:0x0633, B:190:0x063b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:202:0x0673  */
    /* JADX WARN: Code duplicated, block: B:204:0x0676  */
    /* JADX WARN: Code duplicated, block: B:206:0x0679  */
    /* JADX WARN: Code duplicated, block: B:207:0x067d  */
    /* JADX WARN: Code duplicated, block: B:209:0x068f  */
    /* JADX WARN: Code duplicated, block: B:211:0x0695  */
    /* JADX WARN: Code duplicated, block: B:212:0x0697  */
    /* JADX WARN: Code duplicated, block: B:218:0x06aa  */
    /* JADX WARN: Code duplicated, block: B:220:0x06ba A[PHI: r15
  0x06ba: PHI (r15v64 int) = (r15v63 int), (r15v67 int) binds: [B:208:0x068d, B:211:0x0695] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:223:0x06c8  */
    /* JADX WARN: Code duplicated, block: B:225:0x06da  */
    /* JADX WARN: Code duplicated, block: B:227:0x06e0  */
    /* JADX WARN: Code duplicated, block: B:228:0x06e2  */
    /* JADX WARN: Code duplicated, block: B:234:0x06f5  */
    /* JADX WARN: Code duplicated, block: B:236:0x0705 A[PHI: r15
  0x0705: PHI (r15v59 int) = (r15v58 int), (r15v62 int) binds: [B:224:0x06d8, B:227:0x06e0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:238:0x0710  */
    /* JADX WARN: Code duplicated, block: B:240:0x0722  */
    /* JADX WARN: Code duplicated, block: B:242:0x0728  */
    /* JADX WARN: Code duplicated, block: B:243:0x072a  */
    /* JADX WARN: Code duplicated, block: B:249:0x073d  */
    /* JADX WARN: Code duplicated, block: B:251:0x074d A[PHI: r15
  0x074d: PHI (r15v32 int) = (r15v31 int), (r15v35 int) binds: [B:239:0x0720, B:242:0x0728] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:255:0x0760  */
    /* JADX WARN: Code duplicated, block: B:257:0x0763  */
    /* JADX WARN: Code duplicated, block: B:259:0x0766  */
    /* JADX WARN: Code duplicated, block: B:261:0x076c  */
    /* JADX WARN: Code duplicated, block: B:263:0x077e  */
    /* JADX WARN: Code duplicated, block: B:265:0x0784  */
    /* JADX WARN: Code duplicated, block: B:266:0x0786  */
    /* JADX WARN: Code duplicated, block: B:268:0x078c  */
    /* JADX WARN: Code duplicated, block: B:272:0x0799  */
    /* JADX WARN: Code duplicated, block: B:274:0x07a9 A[PHI: r15
  0x07a9: PHI (r15v52 int) = (r15v51 int), (r15v56 int) binds: [B:262:0x077c, B:265:0x0784] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:277:0x07b7  */
    /* JADX WARN: Code duplicated, block: B:279:0x07c9  */
    /* JADX WARN: Code duplicated, block: B:281:0x07cf  */
    /* JADX WARN: Code duplicated, block: B:282:0x07d1  */
    /* JADX WARN: Code duplicated, block: B:284:0x07d7  */
    /* JADX WARN: Code duplicated, block: B:288:0x07e4  */
    /* JADX WARN: Code duplicated, block: B:290:0x07f4 A[PHI: r15
  0x07f4: PHI (r15v44 int) = (r15v43 int), (r15v48 int) binds: [B:278:0x07c7, B:281:0x07cf] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:292:0x07ff  */
    /* JADX WARN: Code duplicated, block: B:294:0x0811  */
    /* JADX WARN: Code duplicated, block: B:296:0x0817  */
    /* JADX WARN: Code duplicated, block: B:298:0x081a  */
    /* JADX WARN: Code duplicated, block: B:300:0x0820  */
    /* JADX WARN: Code duplicated, block: B:304:0x082d  */
    /* JADX WARN: Code duplicated, block: B:306:0x083d  */
    /* JADX WARN: Code duplicated, block: B:311:0x0852  */
    /* JADX WARN: Code duplicated, block: B:313:0x0857  */
    /* JADX WARN: Code duplicated, block: B:314:0x085a  */
    /* JADX WARN: Code duplicated, block: B:315:0x085d  */
    /* JADX WARN: Code duplicated, block: B:316:0x0860  */
    /* JADX WARN: Code duplicated, block: B:317:0x0863  */
    /* JADX WARN: Code duplicated, block: B:319:0x0868  */
    /* JADX WARN: Code duplicated, block: B:325:0x0874  */
    /* JADX WARN: Code duplicated, block: B:328:0x0886  */
    /* JADX WARN: Code duplicated, block: B:329:0x0889  */
    /* JADX WARN: Code duplicated, block: B:331:0x088d  */
    /* JADX WARN: Code duplicated, block: B:332:0x0890  */
    /* JADX WARN: Code duplicated, block: B:334:0x0894  */
    /* JADX WARN: Code duplicated, block: B:341:0x08a4  */
    /* JADX WARN: Code duplicated, block: B:67:0x0389 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x038b  */
    /* JADX WARN: Code duplicated, block: B:70:0x039d  */
    /* JADX WARN: Code duplicated, block: B:72:0x03a3  */
    /* JADX WARN: Code duplicated, block: B:73:0x03a5  */
    /* JADX WARN: Code duplicated, block: B:78:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:80:0x03ca A[PHI: r15
  0x03ca: PHI (r15v98 int) = (r15v97 int), (r15v103 int) binds: [B:69:0x039b, B:72:0x03a3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:83:0x03d8  */
    /* JADX WARN: Code duplicated, block: B:85:0x03ea  */
    /* JADX WARN: Code duplicated, block: B:87:0x03f0  */
    /* JADX WARN: Code duplicated, block: B:88:0x03f2  */
    /* JADX WARN: Code duplicated, block: B:93:0x0407  */
    /* JADX WARN: Code duplicated, block: B:95:0x0417 A[PHI: r15
  0x0417: PHI (r15v91 int) = (r15v90 int), (r15v96 int) binds: [B:84:0x03e8, B:87:0x03f0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:97:0x0422  */
    /* JADX WARN: Code duplicated, block: B:99:0x0434  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v108 */
    /* JADX WARN: Type inference failed for: r15v29, types: [int] */
    /* JADX WARN: Type inference failed for: r15v70 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.CharSequence, java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r25v1 */
    /* JADX WARN: Type inference failed for: r25v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r25v4 */
    /* JADX WARN: Type inference failed for: r26v2 */
    /* JADX WARN: Type inference failed for: r26v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r26v4 */
    /* JADX WARN: Type inference failed for: r27v1 */
    /* JADX WARN: Type inference failed for: r27v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r27v3 */
    /* JADX WARN: Type inference failed for: r28v1 */
    /* JADX WARN: Type inference failed for: r28v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r28v3 */
    public static final void a(lc00 lc00Var, wea weaVar, m9s m9sVar, ctf0 ctf0Var, long j, String str) {
        Object next;
        int i;
        int iOrdinal;
        int i2;
        StringBuilder sb;
        String string;
        int i3;
        char c;
        int iOrdinal2;
        int i4;
        StringBuilder sb2;
        String string2;
        int i5;
        char c2;
        int iOrdinal3;
        long jM81getDarkBlue0d7_KjU;
        int iOrdinal4;
        long jM81getDarkBlue0d7_KjU2;
        boolean z;
        String strA;
        ?? sb3;
        boolean zO;
        ?? r15;
        int iOrdinal5;
        int i6;
        StringBuilder sb4;
        String string3;
        char c3;
        String str2;
        int iOrdinal6;
        StringBuilder sb5;
        int i7;
        boolean z2;
        String string4;
        char c4;
        hea heaVar;
        ?? r25;
        ?? r26;
        ?? r27;
        ?? r28;
        int i8;
        StringBuilder sb6;
        String string5;
        char c5;
        StringBuilder sb7;
        char c6;
        int i9;
        StringBuilder sb8;
        char c7;
        StringBuilder sb9;
        int i10;
        char c8;
        char c9;
        int i11;
        StringBuilder sb10;
        int i12;
        char c10;
        StringBuilder sb11;
        int i13;
        int i14;
        char c11;
        int i15;
        StringBuilder sb12;
        int i16;
        char c12;
        StringBuilder sb13;
        int i17;
        int i18;
        char c13;
        m9sVar.getClass();
        ctf0Var.getClass();
        str.getClass();
        List<hfa> list = f7712a;
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        for (hfa hfaVar : list) {
            arrayList.add(new lxl(hfaVar.f12963a, (dyl) new xxl(ctf0Var.b.a(hfaVar.b, Arrays.copyOf(new Object[0], 0))), false, ((long) hfaVar.f12963a) == j ? uxl.b : uxl.f36445a, (cwl) null, 108));
        }
        a4x a4xVarO0 = dyb.o0(arrayList);
        lsm0 lsm0Var = ctf0Var.b;
        boo0 boo0Var = new boo0("CARD_CRICKET_TABS_KEY", new fyl(a4xVarO0, null, null, s5x0.t(xfn.b(ctf0Var.j()).e, 0.0f, 2), new jyl(new y3d(StaticColors.INSTANCE.m81getDarkBlue0d7_KjU()), null, null, 126), 6), pno0.f27299a);
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((hfa) next).f12963a != j);
        hfa gfaVar = (hfa) next;
        if (gfaVar == null) {
            gfaVar = new gfa(1L, R.string.game_progress);
        }
        Pair[] pairArr = {new Pair(new Pair(0, 0), new gea(dyb.g0(new una0(R.drawable.ic_card_2_heart), new una0(R.drawable.ic_card_3_heart), new una0(R.drawable.ic_card_4_heart)), lsm0Var.a(R.string.card_cricket_zero_points, Arrays.copyOf(new Object[0], 0)))), new Pair(new Pair(0, 1), new gea(dyb.g0(new una0(R.drawable.ic_card_5_heart), new una0(R.drawable.ic_card_6_heart), new una0(R.drawable.ic_card_7_heart), new una0(R.drawable.ic_card_8_heart)), lsm0Var.a(R.string.card_cricket_one_point, Arrays.copyOf(new Object[0], 0)))), new Pair(new Pair(1, 0), new gea(dyb.g0(new una0(R.drawable.ic_card_9_heart), new una0(R.drawable.ic_card_10_heart)), lsm0Var.a(R.string.card_cricket_two_point, Arrays.copyOf(new Object[0], 0)))), new Pair(new Pair(1, 1), new gea(dyb.g0(new una0(R.drawable.ic_card_j_heart)), lsm0Var.a(R.string.card_cricket_three_point, Arrays.copyOf(new Object[0], 0)))), new Pair(new Pair(2, 0), new gea(dyb.g0(new una0(R.drawable.ic_card_q_heart), new una0(R.drawable.ic_card_k_heart)), lsm0Var.a(R.string.card_cricket_four_point, Arrays.copyOf(new Object[0], 0)))), new Pair(new Pair(2, 1), new gea(dyb.g0(new una0(R.drawable.ic_card_a_heart)), lsm0Var.a(R.string.card_cricket_six_point, Arrays.copyOf(new Object[0], 0))))};
        uh90 uh90Var = uh90.g;
        uh90Var.getClass();
        vh90 vh90Var = new vh90(uh90Var);
        xp20.l(vh90Var, pairArr);
        th90 th90VarBuild = vh90Var.build();
        uea ueaVar = weaVar.f39010a;
        List list2 = weaVar.g;
        List list3 = weaVar.f;
        lc00 lc00VarB = kotlin.collections.a.b();
        ArrayList arrayList2 = new ArrayList(r3d.q(list3, 10));
        int i19 = 0;
        for (Object obj : list3) {
            int i20 = i19 + 1;
            if (i19 < 0) {
                q3d.p();
                throw null;
            }
            th90 th90Var = th90VarBuild;
            arrayList2.add(unh0.p0((afa) obj, StaticColors.INSTANCE.m113getRed0d7_KjU(), i19 + "firstOpponent"));
            th90VarBuild = th90Var;
            i19 = i20;
            boo0Var = boo0Var;
        }
        th90 th90Var2 = th90VarBuild;
        boo0 boo0Var2 = boo0Var;
        lc00VarB.addAll(arrayList2);
        ArrayList arrayList3 = new ArrayList(r3d.q(list2, 10));
        int i21 = 0;
        for (Object obj2 : list2) {
            int i22 = i21 + 1;
            if (i21 < 0) {
                q3d.p();
                throw null;
            }
            arrayList3.add(unh0.p0((afa) obj2, StaticColors.INSTANCE.m62getBlack0d7_KjU(), i21 + "secondOpponent"));
            i21 = i22;
        }
        lc00VarB.addAll(arrayList3);
        uea ueaVar2 = uea.e;
        if (ueaVar != ueaVar2 && ueaVar != uea.f && ueaVar != uea.g) {
            lc00VarB.add(new tea(R.drawable.transparent, R.drawable.transparent, StaticColors.INSTANCE.m123getWhite0d7_KjU(), "", ""));
        }
        i4 i4VarR0 = dyb.r0(kotlin.collections.a.a(lc00VarB));
        ArrayList arrayListQ0 = CollectionsKt.q0(list3, list2);
        afa afaVar = (afa) CollectionsKt.f0(arrayListQ0);
        tna0 tna0Var = afaVar != null ? afaVar.b : new tna0(sna0.e, rna0.UNKNOWN);
        afa afaVar2 = (afa) CollectionsKt.f0(arrayListQ0);
        tna0 tna0Var2 = afaVar2 != null ? afaVar2.c : new tna0(sna0.e, rna0.UNKNOWN);
        int iF = z1x.F(tna0Var);
        int iF2 = z1x.F(tna0Var2);
        StringBuilder sb14 = new StringBuilder(ujn.h);
        if (!StringsKt.O("static/img/ImgDefault/Esports/Virtual/CardCricket/PlayingField/Field.png", ujn.h, false)) {
            if (kotlin.text.c.x("static/img/ImgDefault/Esports/Virtual/CardCricket/PlayingField/Field.png", "https://", false)) {
                i = 0;
            } else {
                if (sb14.length() > 0 && !StringsKt.S(sb14, Separators.SLASH)) {
                    sb14.append('/');
                }
                sb14.append(StringsKt.y0("static/img/ImgDefault/Esports/Virtual/CardCricket/PlayingField/Field.png", '/'));
            }
            String string6 = sb14.toString();
            iOrdinal = ueaVar.ordinal();
            if (iOrdinal != 1) {
                i2 = 0;
                sb = new StringBuilder(ujn.h);
                if (StringsKt.O("static/img/ImgDefault/Esports/Virtual/CardCricket/RedPlayer/BlueIcon.png", ujn.h, false)) {
                    sb.setLength(i2);
                    sb.append("static/img/ImgDefault/Esports/Virtual/CardCricket/RedPlayer/BlueIcon.png");
                } else if (kotlin.text.c.x("static/img/ImgDefault/Esports/Virtual/CardCricket/RedPlayer/BlueIcon.png", "https://", false)) {
                    i2 = 0;
                    sb.setLength(i2);
                    sb.append("static/img/ImgDefault/Esports/Virtual/CardCricket/RedPlayer/BlueIcon.png");
                } else {
                    if (sb.length() > 0 || StringsKt.S(sb, Separators.SLASH)) {
                        i3 = 1;
                        c = '/';
                    } else {
                        sb.append('/');
                        c = '/';
                        i3 = 1;
                    }
                    char[] cArr = new char[i3];
                    cArr[0] = c;
                    sb.append(StringsKt.y0("static/img/ImgDefault/Esports/Virtual/CardCricket/RedPlayer/BlueIcon.png", cArr));
                }
                string = sb.toString();
            } else if (iOrdinal != 4) {
                sb13 = new StringBuilder(ujn.h);
                i17 = 0;
                if (StringsKt.O("static/img/ImgDefault/Esports/Virtual/CardCricket/RedPlayer/GreyIcon.png", ujn.h, false)) {
                    sb13.setLength(i17);
                    sb13.append("static/img/ImgDefault/Esports/Virtual/CardCricket/RedPlayer/GreyIcon.png");
                } else if (kotlin.text.c.x("static/img/ImgDefault/Esports/Virtual/CardCricket/RedPlayer/GreyIcon.png", "https://", false)) {
                    i17 = 0;
                    sb13.setLength(i17);
                    sb13.append("static/img/ImgDefault/Esports/Virtual/CardCricket/RedPlayer/GreyIcon.png");
                } else {
                    if (sb13.length() > 0 || StringsKt.S(sb13, Separators.SLASH)) {
                        i18 = 1;
                        c13 = '/';
                    } else {
                        sb13.append('/');
                        c13 = '/';
                        i18 = 1;
                    }
                    char[] cArr2 = new char[i18];
                    cArr2[0] = c13;
                    sb13.append(StringsKt.y0("static/img/ImgDefault/Esports/Virtual/CardCricket/RedPlayer/GreyIcon.png", cArr2));
                }
                string = sb13.toString();
            } else {
                i15 = 0;
                sb12 = new StringBuilder(ujn.h);
                if (StringsKt.O("static/img/ImgDefault/Esports/Virtual/CardCricket/RedPlayer/GreenIcon.png", ujn.h, false)) {
                    sb12.setLength(i15);
                    sb12.append("static/img/ImgDefault/Esports/Virtual/CardCricket/RedPlayer/GreenIcon.png");
                } else if (kotlin.text.c.x("static/img/ImgDefault/Esports/Virtual/CardCricket/RedPlayer/GreenIcon.png", "https://", false)) {
                    i15 = 0;
                    sb12.setLength(i15);
                    sb12.append("static/img/ImgDefault/Esports/Virtual/CardCricket/RedPlayer/GreenIcon.png");
                } else {
                    if (sb12.length() > 0 || StringsKt.S(sb12, Separators.SLASH)) {
                        i16 = 1;
                        c12 = '/';
                    } else {
                        sb12.append('/');
                        c12 = '/';
                        i16 = 1;
                    }
                    char[] cArr3 = new char[i16];
                    cArr3[0] = c12;
                    sb12.append(StringsKt.y0("static/img/ImgDefault/Esports/Virtual/CardCricket/RedPlayer/GreenIcon.png", cArr3));
                }
                string = sb12.toString();
            }
            String str3 = string;
            String str4 = m9sVar.i;
            String strValueOf = String.valueOf(weaVar.b);
            iOrdinal2 = ueaVar.ordinal();
            if (iOrdinal2 != 2) {
                i4 = 0;
                sb2 = new StringBuilder(ujn.h);
                if (StringsKt.O("static/img/ImgDefault/Esports/Virtual/CardCricket/BlackPlayer/BlueIcon.png", ujn.h, false)) {
                    sb2.setLength(i4);
                    sb2.append("static/img/ImgDefault/Esports/Virtual/CardCricket/BlackPlayer/BlueIcon.png");
                } else if (kotlin.text.c.x("static/img/ImgDefault/Esports/Virtual/CardCricket/BlackPlayer/BlueIcon.png", "https://", false)) {
                    i4 = 0;
                    sb2.setLength(i4);
                    sb2.append("static/img/ImgDefault/Esports/Virtual/CardCricket/BlackPlayer/BlueIcon.png");
                } else {
                    if (sb2.length() > 0 || StringsKt.S(sb2, Separators.SLASH)) {
                        i5 = 1;
                        c2 = '/';
                    } else {
                        sb2.append('/');
                        c2 = '/';
                        i5 = 1;
                    }
                    char[] cArr4 = new char[i5];
                    cArr4[0] = c2;
                    sb2.append(StringsKt.y0("static/img/ImgDefault/Esports/Virtual/CardCricket/BlackPlayer/BlueIcon.png", cArr4));
                }
                string2 = sb2.toString();
            } else if (iOrdinal2 != 5) {
                sb11 = new StringBuilder(ujn.h);
                if (StringsKt.O("static/img/ImgDefault/Esports/Virtual/CardCricket/BlackPlayer/GreyIcon.png", ujn.h, false)) {
                    i13 = 0;
                } else {
                    if (kotlin.text.c.x("static/img/ImgDefault/Esports/Virtual/CardCricket/BlackPlayer/GreyIcon.png", "https://", false)) {
                        i13 = 0;
                    } else {
                        if (sb11.length() > 0 || StringsKt.S(sb11, Separators.SLASH)) {
                            i14 = 1;
                            c11 = '/';
                        } else {
                            sb11.append('/');
                            c11 = '/';
                            i14 = 1;
                        }
                        char[] cArr5 = new char[i14];
                        cArr5[0] = c11;
                        sb11.append(StringsKt.y0("static/img/ImgDefault/Esports/Virtual/CardCricket/BlackPlayer/GreyIcon.png", cArr5));
                    }
                    string2 = sb11.toString();
                }
                sb11.setLength(i13);
                sb11.append("static/img/ImgDefault/Esports/Virtual/CardCricket/BlackPlayer/GreyIcon.png");
                string2 = sb11.toString();
            } else {
                i11 = 0;
                sb10 = new StringBuilder(ujn.h);
                if (StringsKt.O("static/img/ImgDefault/Esports/Virtual/CardCricket/BlackPlayer/GreenIcon.png", ujn.h, false)) {
                    sb10.setLength(i11);
                    sb10.append("static/img/ImgDefault/Esports/Virtual/CardCricket/BlackPlayer/GreenIcon.png");
                } else if (kotlin.text.c.x("static/img/ImgDefault/Esports/Virtual/CardCricket/BlackPlayer/GreenIcon.png", "https://", false)) {
                    i11 = 0;
                    sb10.setLength(i11);
                    sb10.append("static/img/ImgDefault/Esports/Virtual/CardCricket/BlackPlayer/GreenIcon.png");
                } else {
                    if (sb10.length() > 0 || StringsKt.S(sb10, Separators.SLASH)) {
                        i12 = 1;
                        c10 = '/';
                    } else {
                        sb10.append('/');
                        c10 = '/';
                        i12 = 1;
                    }
                    char[] cArr6 = new char[i12];
                    cArr6[0] = c10;
                    sb10.append(StringsKt.y0("static/img/ImgDefault/Esports/Virtual/CardCricket/BlackPlayer/GreenIcon.png", cArr6));
                }
                string2 = sb10.toString();
            }
            String str5 = string2;
            String str6 = m9sVar.j;
            String strValueOf2 = String.valueOf(weaVar.c);
            iOrdinal3 = ueaVar.ordinal();
            if (iOrdinal3 != 1) {
                jM81getDarkBlue0d7_KjU = StaticColors.INSTANCE.m81getDarkBlue0d7_KjU();
            } else if (iOrdinal3 != 4) {
                jM81getDarkBlue0d7_KjU = y3d.f;
            } else {
                jM81getDarkBlue0d7_KjU = ijg.u0;
            }
            long j2 = jM81getDarkBlue0d7_KjU;
            iOrdinal4 = ueaVar.ordinal();
            if (iOrdinal4 != 2) {
                jM81getDarkBlue0d7_KjU2 = StaticColors.INSTANCE.m81getDarkBlue0d7_KjU();
            } else if (iOrdinal4 != 5) {
                jM81getDarkBlue0d7_KjU2 = y3d.f;
            } else {
                jM81getDarkBlue0d7_KjU2 = ijg.u0;
            }
            long j3 = jM81getDarkBlue0d7_KjU2;
            switch (ueaVar.ordinal()) {
                case 0:
                    z = false;
                    strA = lsm0Var.a(R.string.bet_before_higher_vs_lower_game_start, Arrays.copyOf(new Object[0], 0));
                    break;
                case 1:
                    z = false;
                    strA = lsm0Var.a(R.string.card_cricket_first_team_turn, Arrays.copyOf(new Object[0], 0));
                    break;
                case 2:
                    z = false;
                    strA = lsm0Var.a(R.string.card_cricket_second_team_turn, Arrays.copyOf(new Object[0], 0));
                    break;
                case 3:
                    z = false;
                    strA = lsm0Var.a(R.string.card_cricket_break, Arrays.copyOf(new Object[0], 0));
                    break;
                case 4:
                    z = false;
                    strA = lsm0Var.a(R.string.card_cricket_first_team_win, Arrays.copyOf(new Object[0], 0));
                    break;
                case 5:
                    z = false;
                    strA = lsm0Var.a(R.string.card_cricket_second_team_win, Arrays.copyOf(new Object[0], 0));
                    break;
                case 6:
                    z = false;
                    strA = lsm0Var.a(R.string.draw, Arrays.copyOf(new Object[0], 0));
                    break;
                default:
                    t9f.b();
                    return;
            }
            jea jeaVar = new jea(str3, str4, strValueOf, str5, str6, strValueOf2, j2, j3, strA, str);
            sb3 = new StringBuilder(ujn.h);
            zO = StringsKt.O("static/img/ImgDefault/Esports/Virtual/CardCricket/PlayingField/Gates.png", ujn.h, z);
            r15 = z;
            if (zO) {
                sb3.setLength(r15);
                sb3.append("static/img/ImgDefault/Esports/Virtual/CardCricket/PlayingField/Gates.png");
            } else if (kotlin.text.c.x("static/img/ImgDefault/Esports/Virtual/CardCricket/PlayingField/Gates.png", "https://", z)) {
                r15 = 0;
                sb3.setLength(r15);
                sb3.append("static/img/ImgDefault/Esports/Virtual/CardCricket/PlayingField/Gates.png");
            } else {
                if (sb3.length() > 0 || StringsKt.S(sb3, Separators.SLASH)) {
                    c9 = '/';
                } else {
                    c9 = '/';
                    sb3.append('/');
                }
                sb3.append(StringsKt.y0("static/img/ImgDefault/Esports/Virtual/CardCricket/PlayingField/Gates.png", c9));
            }
            String string7 = sb3.toString();
            iOrdinal5 = ueaVar.ordinal();
            if (iOrdinal5 != 1) {
                i6 = 0;
                sb4 = new StringBuilder(ujn.h);
                if (StringsKt.O("static/img/ImgDefault/Esports/Virtual/CardCricket/Players/BeatsRed.png", ujn.h, false)) {
                    sb4.setLength(i6);
                    sb4.append("static/img/ImgDefault/Esports/Virtual/CardCricket/Players/BeatsRed.png");
                } else if (kotlin.text.c.x("static/img/ImgDefault/Esports/Virtual/CardCricket/Players/BeatsRed.png", "https://", false)) {
                    i6 = 0;
                    sb4.setLength(i6);
                    sb4.append("static/img/ImgDefault/Esports/Virtual/CardCricket/Players/BeatsRed.png");
                } else {
                    if (sb4.length() > 0 || StringsKt.S(sb4, Separators.SLASH)) {
                        c3 = '/';
                    } else {
                        c3 = '/';
                        sb4.append('/');
                    }
                    sb4.append(StringsKt.y0("static/img/ImgDefault/Esports/Virtual/CardCricket/Players/BeatsRed.png", c3));
                }
                string3 = sb4.toString();
            } else {
                if (iOrdinal5 != 2) {
                    if (iOrdinal5 != 4) {
                        str2 = "";
                    } else {
                        sb9 = new StringBuilder(ujn.h);
                        i10 = 0;
                        if (StringsKt.O("static/img/ImgDefault/Esports/Virtual/CardCricket/Players/JoyRed.png", ujn.h, false)) {
                            sb9.setLength(i10);
                            sb9.append("static/img/ImgDefault/Esports/Virtual/CardCricket/Players/JoyRed.png");
                        } else if (kotlin.text.c.x("static/img/ImgDefault/Esports/Virtual/CardCricket/Players/JoyRed.png", "https://", false)) {
                            i10 = 0;
                            sb9.setLength(i10);
                            sb9.append("static/img/ImgDefault/Esports/Virtual/CardCricket/Players/JoyRed.png");
                        } else {
                            if (sb9.length() > 0 || StringsKt.S(sb9, Separators.SLASH)) {
                                c8 = '/';
                            } else {
                                c8 = '/';
                                sb9.append('/');
                            }
                            sb9.append(StringsKt.y0("static/img/ImgDefault/Esports/Virtual/CardCricket/Players/JoyRed.png", c8));
                        }
                        string3 = sb9.toString();
                    }
                    iOrdinal6 = ueaVar.ordinal();
                    if (iOrdinal6 != 1) {
                        if (iOrdinal6 != 2) {
                            if (iOrdinal6 != 5) {
                                string4 = "";
                                i7 = 0;
                            } else {
                                sb7 = new StringBuilder(ujn.h);
                                i8 = 0;
                                if (StringsKt.O("static/img/ImgDefault/Esports/Virtual/CardCricket/Players/JoyBlack.png", ujn.h, false)) {
                                    sb7.setLength(i8);
                                    sb7.append("static/img/ImgDefault/Esports/Virtual/CardCricket/Players/JoyBlack.png");
                                } else if (kotlin.text.c.x("static/img/ImgDefault/Esports/Virtual/CardCricket/Players/JoyBlack.png", "https://", false)) {
                                    i8 = 0;
                                    sb7.setLength(i8);
                                    sb7.append("static/img/ImgDefault/Esports/Virtual/CardCricket/Players/JoyBlack.png");
                                } else {
                                    if (sb7.length() > 0 || StringsKt.S(sb7, Separators.SLASH)) {
                                        c6 = '/';
                                    } else {
                                        c6 = '/';
                                        sb7.append('/');
                                    }
                                    i8 = 0;
                                    sb7.append(StringsKt.y0("static/img/ImgDefault/Esports/Virtual/CardCricket/Players/JoyBlack.png", c6));
                                }
                                string5 = sb7.toString();
                            }
                            z2 = true;
                        } else {
                            i8 = 0;
                            sb6 = new StringBuilder(ujn.h);
                            if (StringsKt.O("static/img/ImgDefault/Esports/Virtual/CardCricket/Players/ThrowRed.png", ujn.h, false)) {
                                sb6.setLength(i8);
                                sb6.append("static/img/ImgDefault/Esports/Virtual/CardCricket/Players/ThrowRed.png");
                            } else if (kotlin.text.c.x("static/img/ImgDefault/Esports/Virtual/CardCricket/Players/ThrowRed.png", "https://", false)) {
                                i8 = 0;
                                sb6.setLength(i8);
                                sb6.append("static/img/ImgDefault/Esports/Virtual/CardCricket/Players/ThrowRed.png");
                            } else {
                                if (sb6.length() > 0 || StringsKt.S(sb6, Separators.SLASH)) {
                                    c5 = '/';
                                } else {
                                    c5 = '/';
                                    sb6.append('/');
                                }
                                i8 = 0;
                                sb6.append(StringsKt.y0("static/img/ImgDefault/Esports/Virtual/CardCricket/Players/ThrowRed.png", c5));
                            }
                            string5 = sb6.toString();
                        }
                        string4 = string5;
                        i7 = i8;
                        z2 = true;
                    } else {
                        sb5 = new StringBuilder(ujn.h);
                        if (StringsKt.O("static/img/ImgDefault/Esports/Virtual/CardCricket/Players/ThrowBlack.png", ujn.h, false)) {
                            i7 = 0;
                        } else {
                            if (kotlin.text.c.x("static/img/ImgDefault/Esports/Virtual/CardCricket/Players/ThrowBlack.png", "https://", false)) {
                                i7 = 0;
                            } else {
                                if (sb5.length() > 0 || StringsKt.S(sb5, Separators.SLASH)) {
                                    c4 = '/';
                                } else {
                                    c4 = '/';
                                    sb5.append('/');
                                }
                                z2 = true;
                                i7 = 0;
                                sb5.append(StringsKt.y0("static/img/ImgDefault/Esports/Virtual/CardCricket/Players/ThrowBlack.png", c4));
                            }
                            string4 = sb5.toString();
                        }
                        z2 = true;
                        sb5.setLength(i7);
                        sb5.append("static/img/ImgDefault/Esports/Virtual/CardCricket/Players/ThrowBlack.png");
                        string4 = sb5.toString();
                    }
                    switch (ueaVar.ordinal()) {
                        case 1:
                        case 2:
                            heaVar = hea.c;
                            break;
                        case 3:
                            heaVar = hea.d;
                            break;
                        case 4:
                            heaVar = hea.f12913a;
                            break;
                        case 5:
                            heaVar = hea.b;
                            break;
                        case 6:
                            heaVar = hea.e;
                            break;
                        default:
                            heaVar = hea.f;
                            break;
                    }
                    hea heaVar2 = heaVar;
                    if (ueaVar != ueaVar2 || ueaVar == uea.f || ueaVar == uea.g) {
                        r25 = z2;
                    } else {
                        r25 = i7;
                    }
                    nea neaVar = new nea(string7, str2, string4, r25, heaVar2);
                    if (iF != R.drawable.card_back) {
                        r26 = z2;
                    } else {
                        r26 = i7;
                    }
                    if (iF2 != R.drawable.card_back) {
                        r27 = z2;
                    } else {
                        r27 = i7;
                    }
                    if (ueaVar != ueaVar2 || ueaVar == uea.f || ueaVar == uea.g) {
                        r28 = z2;
                    } else {
                        r28 = i7;
                    }
                    lc00Var.add(new ifa(boo0Var2, gfaVar, (uh90) th90Var2, i4VarR0, new lea(string6, jeaVar, new iea(iF, iF2, r26, r27, r28), neaVar)));
                }
                i9 = 0;
                sb8 = new StringBuilder(ujn.h);
                if (StringsKt.O("static/img/ImgDefault/Esports/Virtual/CardCricket/Players/BeatsBlack.png", ujn.h, false)) {
                    sb8.setLength(i9);
                    sb8.append("static/img/ImgDefault/Esports/Virtual/CardCricket/Players/BeatsBlack.png");
                } else if (kotlin.text.c.x("static/img/ImgDefault/Esports/Virtual/CardCricket/Players/BeatsBlack.png", "https://", false)) {
                    i9 = 0;
                    sb8.setLength(i9);
                    sb8.append("static/img/ImgDefault/Esports/Virtual/CardCricket/Players/BeatsBlack.png");
                } else {
                    if (sb8.length() > 0 || StringsKt.S(sb8, Separators.SLASH)) {
                        c7 = '/';
                    } else {
                        c7 = '/';
                        sb8.append('/');
                    }
                    sb8.append(StringsKt.y0("static/img/ImgDefault/Esports/Virtual/CardCricket/Players/BeatsBlack.png", c7));
                }
                string3 = sb8.toString();
            }
            str2 = string3;
            iOrdinal6 = ueaVar.ordinal();
            if (iOrdinal6 != 1) {
                if (iOrdinal6 != 2) {
                    if (iOrdinal6 != 5) {
                        string4 = "";
                        i7 = 0;
                    } else {
                        sb7 = new StringBuilder(ujn.h);
                        i8 = 0;
                        if (StringsKt.O("static/img/ImgDefault/Esports/Virtual/CardCricket/Players/JoyBlack.png", ujn.h, false)) {
                            sb7.setLength(i8);
                            sb7.append("static/img/ImgDefault/Esports/Virtual/CardCricket/Players/JoyBlack.png");
                        } else if (kotlin.text.c.x("static/img/ImgDefault/Esports/Virtual/CardCricket/Players/JoyBlack.png", "https://", false)) {
                            i8 = 0;
                            sb7.setLength(i8);
                            sb7.append("static/img/ImgDefault/Esports/Virtual/CardCricket/Players/JoyBlack.png");
                        } else {
                            if (sb7.length() > 0) {
                                c6 = '/';
                            } else {
                                c6 = '/';
                            }
                            i8 = 0;
                            sb7.append(StringsKt.y0("static/img/ImgDefault/Esports/Virtual/CardCricket/Players/JoyBlack.png", c6));
                        }
                        string5 = sb7.toString();
                    }
                    z2 = true;
                } else {
                    i8 = 0;
                    sb6 = new StringBuilder(ujn.h);
                    if (StringsKt.O("static/img/ImgDefault/Esports/Virtual/CardCricket/Players/ThrowRed.png", ujn.h, false)) {
                        sb6.setLength(i8);
                        sb6.append("static/img/ImgDefault/Esports/Virtual/CardCricket/Players/ThrowRed.png");
                    } else if (kotlin.text.c.x("static/img/ImgDefault/Esports/Virtual/CardCricket/Players/ThrowRed.png", "https://", false)) {
                        i8 = 0;
                        sb6.setLength(i8);
                        sb6.append("static/img/ImgDefault/Esports/Virtual/CardCricket/Players/ThrowRed.png");
                    } else {
                        if (sb6.length() > 0) {
                            c5 = '/';
                        } else {
                            c5 = '/';
                        }
                        i8 = 0;
                        sb6.append(StringsKt.y0("static/img/ImgDefault/Esports/Virtual/CardCricket/Players/ThrowRed.png", c5));
                    }
                    string5 = sb6.toString();
                }
                string4 = string5;
                i7 = i8;
                z2 = true;
            } else {
                sb5 = new StringBuilder(ujn.h);
                if (StringsKt.O("static/img/ImgDefault/Esports/Virtual/CardCricket/Players/ThrowBlack.png", ujn.h, false)) {
                    if (kotlin.text.c.x("static/img/ImgDefault/Esports/Virtual/CardCricket/Players/ThrowBlack.png", "https://", false)) {
                        i7 = 0;
                    } else {
                        if (sb5.length() > 0) {
                            c4 = '/';
                        } else {
                            c4 = '/';
                        }
                        z2 = true;
                        i7 = 0;
                        sb5.append(StringsKt.y0("static/img/ImgDefault/Esports/Virtual/CardCricket/Players/ThrowBlack.png", c4));
                    }
                    string4 = sb5.toString();
                } else {
                    i7 = 0;
                }
                z2 = true;
                sb5.setLength(i7);
                sb5.append("static/img/ImgDefault/Esports/Virtual/CardCricket/Players/ThrowBlack.png");
                string4 = sb5.toString();
            }
            switch (ueaVar.ordinal()) {
                case 1:
                case 2:
                    heaVar = hea.c;
                    break;
                case 3:
                    heaVar = hea.d;
                    break;
                case 4:
                    heaVar = hea.f12913a;
                    break;
                case 5:
                    heaVar = hea.b;
                    break;
                case 6:
                    heaVar = hea.e;
                    break;
                default:
                    heaVar = hea.f;
                    break;
            }
            hea heaVar3 = heaVar;
            if (ueaVar != ueaVar2) {
                r25 = z2;
            } else {
                r25 = z2;
            }
            nea neaVar2 = new nea(string7, str2, string4, r25, heaVar3);
            if (iF != R.drawable.card_back) {
                r26 = z2;
            } else {
                r26 = i7;
            }
            if (iF2 != R.drawable.card_back) {
                r27 = z2;
            } else {
                r27 = i7;
            }
            if (ueaVar != ueaVar2) {
                r28 = z2;
            } else {
                r28 = z2;
            }
            lc00Var.add(new ifa(boo0Var2, gfaVar, (uh90) th90Var2, i4VarR0, new lea(string6, jeaVar, new iea(iF, iF2, r26, r27, r28), neaVar2)));
        }
        i = 0;
        sb14.setLength(i);
        sb14.append("static/img/ImgDefault/Esports/Virtual/CardCricket/PlayingField/Field.png");
        String string8 = sb14.toString();
        iOrdinal = ueaVar.ordinal();
        if (iOrdinal != 1) {
            i2 = 0;
            sb = new StringBuilder(ujn.h);
            if (StringsKt.O("static/img/ImgDefault/Esports/Virtual/CardCricket/RedPlayer/BlueIcon.png", ujn.h, false)) {
                sb.setLength(i2);
                sb.append("static/img/ImgDefault/Esports/Virtual/CardCricket/RedPlayer/BlueIcon.png");
            } else if (kotlin.text.c.x("static/img/ImgDefault/Esports/Virtual/CardCricket/RedPlayer/BlueIcon.png", "https://", false)) {
                i2 = 0;
                sb.setLength(i2);
                sb.append("static/img/ImgDefault/Esports/Virtual/CardCricket/RedPlayer/BlueIcon.png");
            } else {
                if (sb.length() > 0) {
                    i3 = 1;
                    c = '/';
                } else {
                    i3 = 1;
                    c = '/';
                }
                char[] cArr7 = new char[i3];
                cArr7[0] = c;
                sb.append(StringsKt.y0("static/img/ImgDefault/Esports/Virtual/CardCricket/RedPlayer/BlueIcon.png", cArr7));
            }
            string = sb.toString();
        } else if (iOrdinal != 4) {
            sb13 = new StringBuilder(ujn.h);
            i17 = 0;
            if (StringsKt.O("static/img/ImgDefault/Esports/Virtual/CardCricket/RedPlayer/GreyIcon.png", ujn.h, false)) {
                sb13.setLength(i17);
                sb13.append("static/img/ImgDefault/Esports/Virtual/CardCricket/RedPlayer/GreyIcon.png");
            } else if (kotlin.text.c.x("static/img/ImgDefault/Esports/Virtual/CardCricket/RedPlayer/GreyIcon.png", "https://", false)) {
                i17 = 0;
                sb13.setLength(i17);
                sb13.append("static/img/ImgDefault/Esports/Virtual/CardCricket/RedPlayer/GreyIcon.png");
            } else {
                if (sb13.length() > 0) {
                    i18 = 1;
                    c13 = '/';
                } else {
                    i18 = 1;
                    c13 = '/';
                }
                char[] cArr8 = new char[i18];
                cArr8[0] = c13;
                sb13.append(StringsKt.y0("static/img/ImgDefault/Esports/Virtual/CardCricket/RedPlayer/GreyIcon.png", cArr8));
            }
            string = sb13.toString();
        } else {
            i15 = 0;
            sb12 = new StringBuilder(ujn.h);
            if (StringsKt.O("static/img/ImgDefault/Esports/Virtual/CardCricket/RedPlayer/GreenIcon.png", ujn.h, false)) {
                sb12.setLength(i15);
                sb12.append("static/img/ImgDefault/Esports/Virtual/CardCricket/RedPlayer/GreenIcon.png");
            } else if (kotlin.text.c.x("static/img/ImgDefault/Esports/Virtual/CardCricket/RedPlayer/GreenIcon.png", "https://", false)) {
                i15 = 0;
                sb12.setLength(i15);
                sb12.append("static/img/ImgDefault/Esports/Virtual/CardCricket/RedPlayer/GreenIcon.png");
            } else {
                if (sb12.length() > 0) {
                    i16 = 1;
                    c12 = '/';
                } else {
                    i16 = 1;
                    c12 = '/';
                }
                char[] cArr9 = new char[i16];
                cArr9[0] = c12;
                sb12.append(StringsKt.y0("static/img/ImgDefault/Esports/Virtual/CardCricket/RedPlayer/GreenIcon.png", cArr9));
            }
            string = sb12.toString();
        }
        String str7 = string;
        String str8 = m9sVar.i;
        String strValueOf3 = String.valueOf(weaVar.b);
        iOrdinal2 = ueaVar.ordinal();
        if (iOrdinal2 != 2) {
            i4 = 0;
            sb2 = new StringBuilder(ujn.h);
            if (StringsKt.O("static/img/ImgDefault/Esports/Virtual/CardCricket/BlackPlayer/BlueIcon.png", ujn.h, false)) {
                sb2.setLength(i4);
                sb2.append("static/img/ImgDefault/Esports/Virtual/CardCricket/BlackPlayer/BlueIcon.png");
            } else if (kotlin.text.c.x("static/img/ImgDefault/Esports/Virtual/CardCricket/BlackPlayer/BlueIcon.png", "https://", false)) {
                i4 = 0;
                sb2.setLength(i4);
                sb2.append("static/img/ImgDefault/Esports/Virtual/CardCricket/BlackPlayer/BlueIcon.png");
            } else {
                if (sb2.length() > 0) {
                    i5 = 1;
                    c2 = '/';
                } else {
                    i5 = 1;
                    c2 = '/';
                }
                char[] cArr10 = new char[i5];
                cArr10[0] = c2;
                sb2.append(StringsKt.y0("static/img/ImgDefault/Esports/Virtual/CardCricket/BlackPlayer/BlueIcon.png", cArr10));
            }
            string2 = sb2.toString();
        } else if (iOrdinal2 != 5) {
            sb11 = new StringBuilder(ujn.h);
            if (StringsKt.O("static/img/ImgDefault/Esports/Virtual/CardCricket/BlackPlayer/GreyIcon.png", ujn.h, false)) {
                if (kotlin.text.c.x("static/img/ImgDefault/Esports/Virtual/CardCricket/BlackPlayer/GreyIcon.png", "https://", false)) {
                    i13 = 0;
                } else {
                    if (sb11.length() > 0) {
                        i14 = 1;
                        c11 = '/';
                    } else {
                        i14 = 1;
                        c11 = '/';
                    }
                    char[] cArr11 = new char[i14];
                    cArr11[0] = c11;
                    sb11.append(StringsKt.y0("static/img/ImgDefault/Esports/Virtual/CardCricket/BlackPlayer/GreyIcon.png", cArr11));
                }
                string2 = sb11.toString();
            } else {
                i13 = 0;
            }
            sb11.setLength(i13);
            sb11.append("static/img/ImgDefault/Esports/Virtual/CardCricket/BlackPlayer/GreyIcon.png");
            string2 = sb11.toString();
        } else {
            i11 = 0;
            sb10 = new StringBuilder(ujn.h);
            if (StringsKt.O("static/img/ImgDefault/Esports/Virtual/CardCricket/BlackPlayer/GreenIcon.png", ujn.h, false)) {
                sb10.setLength(i11);
                sb10.append("static/img/ImgDefault/Esports/Virtual/CardCricket/BlackPlayer/GreenIcon.png");
            } else if (kotlin.text.c.x("static/img/ImgDefault/Esports/Virtual/CardCricket/BlackPlayer/GreenIcon.png", "https://", false)) {
                i11 = 0;
                sb10.setLength(i11);
                sb10.append("static/img/ImgDefault/Esports/Virtual/CardCricket/BlackPlayer/GreenIcon.png");
            } else {
                if (sb10.length() > 0) {
                    i12 = 1;
                    c10 = '/';
                } else {
                    i12 = 1;
                    c10 = '/';
                }
                char[] cArr12 = new char[i12];
                cArr12[0] = c10;
                sb10.append(StringsKt.y0("static/img/ImgDefault/Esports/Virtual/CardCricket/BlackPlayer/GreenIcon.png", cArr12));
            }
            string2 = sb10.toString();
        }
        String str9 = string2;
        String str10 = m9sVar.j;
        String strValueOf4 = String.valueOf(weaVar.c);
        iOrdinal3 = ueaVar.ordinal();
        if (iOrdinal3 != 1) {
            jM81getDarkBlue0d7_KjU = StaticColors.INSTANCE.m81getDarkBlue0d7_KjU();
        } else if (iOrdinal3 != 4) {
            jM81getDarkBlue0d7_KjU = y3d.f;
        } else {
            jM81getDarkBlue0d7_KjU = ijg.u0;
        }
        long j4 = jM81getDarkBlue0d7_KjU;
        iOrdinal4 = ueaVar.ordinal();
        if (iOrdinal4 != 2) {
            jM81getDarkBlue0d7_KjU2 = StaticColors.INSTANCE.m81getDarkBlue0d7_KjU();
        } else if (iOrdinal4 != 5) {
            jM81getDarkBlue0d7_KjU2 = y3d.f;
        } else {
            jM81getDarkBlue0d7_KjU2 = ijg.u0;
        }
        long j5 = jM81getDarkBlue0d7_KjU2;
        switch (ueaVar.ordinal()) {
            case 0:
                z = false;
                strA = lsm0Var.a(R.string.bet_before_higher_vs_lower_game_start, Arrays.copyOf(new Object[0], 0));
                break;
            case 1:
                z = false;
                strA = lsm0Var.a(R.string.card_cricket_first_team_turn, Arrays.copyOf(new Object[0], 0));
                break;
            case 2:
                z = false;
                strA = lsm0Var.a(R.string.card_cricket_second_team_turn, Arrays.copyOf(new Object[0], 0));
                break;
            case 3:
                z = false;
                strA = lsm0Var.a(R.string.card_cricket_break, Arrays.copyOf(new Object[0], 0));
                break;
            case 4:
                z = false;
                strA = lsm0Var.a(R.string.card_cricket_first_team_win, Arrays.copyOf(new Object[0], 0));
                break;
            case 5:
                z = false;
                strA = lsm0Var.a(R.string.card_cricket_second_team_win, Arrays.copyOf(new Object[0], 0));
                break;
            case 6:
                z = false;
                strA = lsm0Var.a(R.string.draw, Arrays.copyOf(new Object[0], 0));
                break;
            default:
                t9f.b();
                return;
        }
        jea jeaVar2 = new jea(str7, str8, strValueOf3, str9, str10, strValueOf4, j4, j5, strA, str);
        sb3 = new StringBuilder(ujn.h);
        zO = StringsKt.O("static/img/ImgDefault/Esports/Virtual/CardCricket/PlayingField/Gates.png", ujn.h, z);
        r15 = z;
        if (zO) {
            sb3.setLength(r15);
            sb3.append("static/img/ImgDefault/Esports/Virtual/CardCricket/PlayingField/Gates.png");
        } else if (kotlin.text.c.x("static/img/ImgDefault/Esports/Virtual/CardCricket/PlayingField/Gates.png", "https://", z)) {
            r15 = 0;
            sb3.setLength(r15);
            sb3.append("static/img/ImgDefault/Esports/Virtual/CardCricket/PlayingField/Gates.png");
        } else {
            if (sb3.length() > 0) {
                c9 = '/';
            } else {
                c9 = '/';
            }
            sb3.append(StringsKt.y0("static/img/ImgDefault/Esports/Virtual/CardCricket/PlayingField/Gates.png", c9));
        }
        String string9 = sb3.toString();
        iOrdinal5 = ueaVar.ordinal();
        if (iOrdinal5 != 1) {
            i6 = 0;
            sb4 = new StringBuilder(ujn.h);
            if (StringsKt.O("static/img/ImgDefault/Esports/Virtual/CardCricket/Players/BeatsRed.png", ujn.h, false)) {
                sb4.setLength(i6);
                sb4.append("static/img/ImgDefault/Esports/Virtual/CardCricket/Players/BeatsRed.png");
            } else if (kotlin.text.c.x("static/img/ImgDefault/Esports/Virtual/CardCricket/Players/BeatsRed.png", "https://", false)) {
                i6 = 0;
                sb4.setLength(i6);
                sb4.append("static/img/ImgDefault/Esports/Virtual/CardCricket/Players/BeatsRed.png");
            } else {
                if (sb4.length() > 0) {
                    c3 = '/';
                } else {
                    c3 = '/';
                }
                sb4.append(StringsKt.y0("static/img/ImgDefault/Esports/Virtual/CardCricket/Players/BeatsRed.png", c3));
            }
            string3 = sb4.toString();
        } else {
            if (iOrdinal5 != 2) {
                if (iOrdinal5 != 4) {
                    str2 = "";
                } else {
                    sb9 = new StringBuilder(ujn.h);
                    i10 = 0;
                    if (StringsKt.O("static/img/ImgDefault/Esports/Virtual/CardCricket/Players/JoyRed.png", ujn.h, false)) {
                        sb9.setLength(i10);
                        sb9.append("static/img/ImgDefault/Esports/Virtual/CardCricket/Players/JoyRed.png");
                    } else if (kotlin.text.c.x("static/img/ImgDefault/Esports/Virtual/CardCricket/Players/JoyRed.png", "https://", false)) {
                        i10 = 0;
                        sb9.setLength(i10);
                        sb9.append("static/img/ImgDefault/Esports/Virtual/CardCricket/Players/JoyRed.png");
                    } else {
                        if (sb9.length() > 0) {
                            c8 = '/';
                        } else {
                            c8 = '/';
                        }
                        sb9.append(StringsKt.y0("static/img/ImgDefault/Esports/Virtual/CardCricket/Players/JoyRed.png", c8));
                    }
                    string3 = sb9.toString();
                }
                iOrdinal6 = ueaVar.ordinal();
                if (iOrdinal6 != 1) {
                    if (iOrdinal6 != 2) {
                        if (iOrdinal6 != 5) {
                            string4 = "";
                            i7 = 0;
                        } else {
                            sb7 = new StringBuilder(ujn.h);
                            i8 = 0;
                            if (StringsKt.O("static/img/ImgDefault/Esports/Virtual/CardCricket/Players/JoyBlack.png", ujn.h, false)) {
                                sb7.setLength(i8);
                                sb7.append("static/img/ImgDefault/Esports/Virtual/CardCricket/Players/JoyBlack.png");
                            } else if (kotlin.text.c.x("static/img/ImgDefault/Esports/Virtual/CardCricket/Players/JoyBlack.png", "https://", false)) {
                                i8 = 0;
                                sb7.setLength(i8);
                                sb7.append("static/img/ImgDefault/Esports/Virtual/CardCricket/Players/JoyBlack.png");
                            } else {
                                if (sb7.length() > 0) {
                                    c6 = '/';
                                } else {
                                    c6 = '/';
                                }
                                i8 = 0;
                                sb7.append(StringsKt.y0("static/img/ImgDefault/Esports/Virtual/CardCricket/Players/JoyBlack.png", c6));
                            }
                            string5 = sb7.toString();
                        }
                        z2 = true;
                    } else {
                        i8 = 0;
                        sb6 = new StringBuilder(ujn.h);
                        if (StringsKt.O("static/img/ImgDefault/Esports/Virtual/CardCricket/Players/ThrowRed.png", ujn.h, false)) {
                            sb6.setLength(i8);
                            sb6.append("static/img/ImgDefault/Esports/Virtual/CardCricket/Players/ThrowRed.png");
                        } else if (kotlin.text.c.x("static/img/ImgDefault/Esports/Virtual/CardCricket/Players/ThrowRed.png", "https://", false)) {
                            i8 = 0;
                            sb6.setLength(i8);
                            sb6.append("static/img/ImgDefault/Esports/Virtual/CardCricket/Players/ThrowRed.png");
                        } else {
                            if (sb6.length() > 0) {
                                c5 = '/';
                            } else {
                                c5 = '/';
                            }
                            i8 = 0;
                            sb6.append(StringsKt.y0("static/img/ImgDefault/Esports/Virtual/CardCricket/Players/ThrowRed.png", c5));
                        }
                        string5 = sb6.toString();
                    }
                    string4 = string5;
                    i7 = i8;
                    z2 = true;
                } else {
                    sb5 = new StringBuilder(ujn.h);
                    if (StringsKt.O("static/img/ImgDefault/Esports/Virtual/CardCricket/Players/ThrowBlack.png", ujn.h, false)) {
                        if (kotlin.text.c.x("static/img/ImgDefault/Esports/Virtual/CardCricket/Players/ThrowBlack.png", "https://", false)) {
                            i7 = 0;
                        } else {
                            if (sb5.length() > 0) {
                                c4 = '/';
                            } else {
                                c4 = '/';
                            }
                            z2 = true;
                            i7 = 0;
                            sb5.append(StringsKt.y0("static/img/ImgDefault/Esports/Virtual/CardCricket/Players/ThrowBlack.png", c4));
                        }
                        string4 = sb5.toString();
                    } else {
                        i7 = 0;
                    }
                    z2 = true;
                    sb5.setLength(i7);
                    sb5.append("static/img/ImgDefault/Esports/Virtual/CardCricket/Players/ThrowBlack.png");
                    string4 = sb5.toString();
                }
                switch (ueaVar.ordinal()) {
                    case 1:
                    case 2:
                        heaVar = hea.c;
                        break;
                    case 3:
                        heaVar = hea.d;
                        break;
                    case 4:
                        heaVar = hea.f12913a;
                        break;
                    case 5:
                        heaVar = hea.b;
                        break;
                    case 6:
                        heaVar = hea.e;
                        break;
                    default:
                        heaVar = hea.f;
                        break;
                }
                hea heaVar4 = heaVar;
                if (ueaVar != ueaVar2) {
                    r25 = z2;
                } else {
                    r25 = z2;
                }
                nea neaVar3 = new nea(string9, str2, string4, r25, heaVar4);
                if (iF != R.drawable.card_back) {
                    r26 = z2;
                } else {
                    r26 = i7;
                }
                if (iF2 != R.drawable.card_back) {
                    r27 = z2;
                } else {
                    r27 = i7;
                }
                if (ueaVar != ueaVar2) {
                    r28 = z2;
                } else {
                    r28 = z2;
                }
                lc00Var.add(new ifa(boo0Var2, gfaVar, (uh90) th90Var2, i4VarR0, new lea(string8, jeaVar2, new iea(iF, iF2, r26, r27, r28), neaVar3)));
            }
            i9 = 0;
            sb8 = new StringBuilder(ujn.h);
            if (StringsKt.O("static/img/ImgDefault/Esports/Virtual/CardCricket/Players/BeatsBlack.png", ujn.h, false)) {
                sb8.setLength(i9);
                sb8.append("static/img/ImgDefault/Esports/Virtual/CardCricket/Players/BeatsBlack.png");
            } else if (kotlin.text.c.x("static/img/ImgDefault/Esports/Virtual/CardCricket/Players/BeatsBlack.png", "https://", false)) {
                i9 = 0;
                sb8.setLength(i9);
                sb8.append("static/img/ImgDefault/Esports/Virtual/CardCricket/Players/BeatsBlack.png");
            } else {
                if (sb8.length() > 0) {
                    c7 = '/';
                } else {
                    c7 = '/';
                }
                sb8.append(StringsKt.y0("static/img/ImgDefault/Esports/Virtual/CardCricket/Players/BeatsBlack.png", c7));
            }
            string3 = sb8.toString();
        }
        str2 = string3;
        iOrdinal6 = ueaVar.ordinal();
        if (iOrdinal6 != 1) {
            if (iOrdinal6 != 2) {
                if (iOrdinal6 != 5) {
                    string4 = "";
                    i7 = 0;
                } else {
                    sb7 = new StringBuilder(ujn.h);
                    i8 = 0;
                    if (StringsKt.O("static/img/ImgDefault/Esports/Virtual/CardCricket/Players/JoyBlack.png", ujn.h, false)) {
                        sb7.setLength(i8);
                        sb7.append("static/img/ImgDefault/Esports/Virtual/CardCricket/Players/JoyBlack.png");
                    } else if (kotlin.text.c.x("static/img/ImgDefault/Esports/Virtual/CardCricket/Players/JoyBlack.png", "https://", false)) {
                        i8 = 0;
                        sb7.setLength(i8);
                        sb7.append("static/img/ImgDefault/Esports/Virtual/CardCricket/Players/JoyBlack.png");
                    } else {
                        if (sb7.length() > 0) {
                            c6 = '/';
                        } else {
                            c6 = '/';
                        }
                        i8 = 0;
                        sb7.append(StringsKt.y0("static/img/ImgDefault/Esports/Virtual/CardCricket/Players/JoyBlack.png", c6));
                    }
                    string5 = sb7.toString();
                }
                z2 = true;
            } else {
                i8 = 0;
                sb6 = new StringBuilder(ujn.h);
                if (StringsKt.O("static/img/ImgDefault/Esports/Virtual/CardCricket/Players/ThrowRed.png", ujn.h, false)) {
                    sb6.setLength(i8);
                    sb6.append("static/img/ImgDefault/Esports/Virtual/CardCricket/Players/ThrowRed.png");
                } else if (kotlin.text.c.x("static/img/ImgDefault/Esports/Virtual/CardCricket/Players/ThrowRed.png", "https://", false)) {
                    i8 = 0;
                    sb6.setLength(i8);
                    sb6.append("static/img/ImgDefault/Esports/Virtual/CardCricket/Players/ThrowRed.png");
                } else {
                    if (sb6.length() > 0) {
                        c5 = '/';
                    } else {
                        c5 = '/';
                    }
                    i8 = 0;
                    sb6.append(StringsKt.y0("static/img/ImgDefault/Esports/Virtual/CardCricket/Players/ThrowRed.png", c5));
                }
                string5 = sb6.toString();
            }
            string4 = string5;
            i7 = i8;
            z2 = true;
        } else {
            sb5 = new StringBuilder(ujn.h);
            if (StringsKt.O("static/img/ImgDefault/Esports/Virtual/CardCricket/Players/ThrowBlack.png", ujn.h, false)) {
                if (kotlin.text.c.x("static/img/ImgDefault/Esports/Virtual/CardCricket/Players/ThrowBlack.png", "https://", false)) {
                    i7 = 0;
                } else {
                    if (sb5.length() > 0) {
                        c4 = '/';
                    } else {
                        c4 = '/';
                    }
                    z2 = true;
                    i7 = 0;
                    sb5.append(StringsKt.y0("static/img/ImgDefault/Esports/Virtual/CardCricket/Players/ThrowBlack.png", c4));
                }
                string4 = sb5.toString();
            } else {
                i7 = 0;
            }
            z2 = true;
            sb5.setLength(i7);
            sb5.append("static/img/ImgDefault/Esports/Virtual/CardCricket/Players/ThrowBlack.png");
            string4 = sb5.toString();
        }
        switch (ueaVar.ordinal()) {
            case 1:
            case 2:
                heaVar = hea.c;
                break;
            case 3:
                heaVar = hea.d;
                break;
            case 4:
                heaVar = hea.f12913a;
                break;
            case 5:
                heaVar = hea.b;
                break;
            case 6:
                heaVar = hea.e;
                break;
            default:
                heaVar = hea.f;
                break;
        }
        hea heaVar5 = heaVar;
        if (ueaVar != ueaVar2) {
            r25 = z2;
        } else {
            r25 = z2;
        }
        nea neaVar4 = new nea(string9, str2, string4, r25, heaVar5);
        if (iF != R.drawable.card_back) {
            r26 = z2;
        } else {
            r26 = i7;
        }
        if (iF2 != R.drawable.card_back) {
            r27 = z2;
        } else {
            r27 = i7;
        }
        if (ueaVar != ueaVar2) {
            r28 = z2;
        } else {
            r28 = z2;
        }
        lc00Var.add(new ifa(boo0Var2, gfaVar, (uh90) th90Var2, i4VarR0, new lea(string8, jeaVar2, new iea(iF, iF2, r26, r27, r28), neaVar4)));
    }
}
