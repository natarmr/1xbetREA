package a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class sdl0 extends bnn0 implements Function2 {
    public r9s i;
    public k9s j;
    public pqs k;
    public ArrayList l;
    public byte m;
    public /* synthetic */ Object n;
    public final /* synthetic */ tdl0 o;
    public final /* synthetic */ qdl0 p;
    public final /* synthetic */ are q;
    public final /* synthetic */ byte r;
    public final /* synthetic */ boolean s;
    public final /* synthetic */ boolean t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public sdl0(tdl0 tdl0Var, qdl0 qdl0Var, are areVar, int i, boolean z, boolean z2, yje yjeVar) {
        super(2, yjeVar);
        this.o = tdl0Var;
        this.p = qdl0Var;
        this.q = areVar;
        this.r = i;
        this.s = z;
        this.t = z2;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        sdl0 sdl0Var = new sdl0(this.o, this.p, this.q, this.r, this.s, this.t, yjeVar);
        sdl0Var.n = obj;
        return sdl0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((sdl0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x020f  */
    /* JADX WARN: Code duplicated, block: B:102:0x0212  */
    /* JADX WARN: Code duplicated, block: B:105:0x0218  */
    /* JADX WARN: Code duplicated, block: B:106:0x021b  */
    /* JADX WARN: Code duplicated, block: B:108:0x021e  */
    /* JADX WARN: Code duplicated, block: B:110:0x0222  */
    /* JADX WARN: Code duplicated, block: B:112:0x0228  */
    /* JADX WARN: Code duplicated, block: B:113:0x022b  */
    /* JADX WARN: Code duplicated, block: B:116:0x0233  */
    /* JADX WARN: Code duplicated, block: B:117:0x0236  */
    /* JADX WARN: Code duplicated, block: B:119:0x0239  */
    /* JADX WARN: Code duplicated, block: B:120:0x023c  */
    /* JADX WARN: Code duplicated, block: B:122:0x0240  */
    /* JADX WARN: Code duplicated, block: B:123:0x0243  */
    /* JADX WARN: Code duplicated, block: B:125:0x0246  */
    /* JADX WARN: Code duplicated, block: B:126:0x0249  */
    /* JADX WARN: Code duplicated, block: B:129:0x024f  */
    /* JADX WARN: Code duplicated, block: B:130:0x0252  */
    /* JADX WARN: Code duplicated, block: B:133:0x0258  */
    /* JADX WARN: Code duplicated, block: B:134:0x025b  */
    /* JADX WARN: Code duplicated, block: B:137:0x0263  */
    /* JADX WARN: Code duplicated, block: B:138:0x0266  */
    /* JADX WARN: Code duplicated, block: B:140:0x0269  */
    /* JADX WARN: Code duplicated, block: B:141:0x026c  */
    /* JADX WARN: Code duplicated, block: B:143:0x0270  */
    /* JADX WARN: Code duplicated, block: B:144:0x0273  */
    /* JADX WARN: Code duplicated, block: B:146:0x0276  */
    /* JADX WARN: Code duplicated, block: B:147:0x0279  */
    /* JADX WARN: Code duplicated, block: B:149:0x027d  */
    /* JADX WARN: Code duplicated, block: B:150:0x0280  */
    /* JADX WARN: Code duplicated, block: B:152:0x0283  */
    /* JADX WARN: Code duplicated, block: B:153:0x0286  */
    /* JADX WARN: Code duplicated, block: B:156:0x028c  */
    /* JADX WARN: Code duplicated, block: B:157:0x028f  */
    /* JADX WARN: Code duplicated, block: B:159:0x0292  */
    /* JADX WARN: Code duplicated, block: B:160:0x0295  */
    /* JADX WARN: Code duplicated, block: B:162:0x0299  */
    /* JADX WARN: Code duplicated, block: B:163:0x029c  */
    /* JADX WARN: Code duplicated, block: B:165:0x029f  */
    /* JADX WARN: Code duplicated, block: B:166:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:168:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:169:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:171:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:172:0x02af  */
    /* JADX WARN: Code duplicated, block: B:174:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:175:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:177:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:178:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:180:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:181:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:183:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:184:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:186:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:187:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:189:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:190:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:192:0x02de  */
    /* JADX WARN: Code duplicated, block: B:198:0x0311 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:199:0x0313  */
    /* JADX WARN: Code duplicated, block: B:200:0x0316  */
    /* JADX WARN: Code duplicated, block: B:202:0x0319  */
    /* JADX WARN: Code duplicated, block: B:208:0x032d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:209:0x032f  */
    /* JADX WARN: Code duplicated, block: B:210:0x0332  */
    /* JADX WARN: Code duplicated, block: B:212:0x0335  */
    /* JADX WARN: Code duplicated, block: B:215:0x0343  */
    /* JADX WARN: Code duplicated, block: B:216:0x0348  */
    /* JADX WARN: Code duplicated, block: B:218:0x034b  */
    /* JADX WARN: Code duplicated, block: B:221:0x0351  */
    /* JADX WARN: Code duplicated, block: B:222:0x0356  */
    /* JADX WARN: Code duplicated, block: B:224:0x0359  */
    /* JADX WARN: Code duplicated, block: B:230:0x036a  */
    /* JADX WARN: Code duplicated, block: B:235:0x0379  */
    /* JADX WARN: Code duplicated, block: B:238:0x037f  */
    /* JADX WARN: Code duplicated, block: B:239:0x0386  */
    /* JADX WARN: Code duplicated, block: B:242:0x038c  */
    /* JADX WARN: Code duplicated, block: B:243:0x038f  */
    /* JADX WARN: Code duplicated, block: B:246:0x0395  */
    /* JADX WARN: Code duplicated, block: B:247:0x0398  */
    /* JADX WARN: Code duplicated, block: B:249:0x039b  */
    /* JADX WARN: Code duplicated, block: B:250:0x039e  */
    /* JADX WARN: Code duplicated, block: B:253:0x03a4  */
    /* JADX WARN: Code duplicated, block: B:254:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:258:0x03b7  */
    /* JADX WARN: Code duplicated, block: B:269:0x03d5  */
    /* JADX WARN: Code duplicated, block: B:270:0x03d8  */
    /* JADX WARN: Code duplicated, block: B:272:0x03db  */
    /* JADX WARN: Code duplicated, block: B:273:0x03de  */
    /* JADX WARN: Code duplicated, block: B:278:0x03ed  */
    /* JADX WARN: Code duplicated, block: B:281:0x03f3  */
    /* JADX WARN: Code duplicated, block: B:284:0x0408  */
    /* JADX WARN: Code duplicated, block: B:286:0x0417  */
    /* JADX WARN: Code duplicated, block: B:288:0x041b  */
    /* JADX WARN: Code duplicated, block: B:289:0x041e  */
    /* JADX WARN: Code duplicated, block: B:291:0x0421  */
    /* JADX WARN: Code duplicated, block: B:292:0x0424  */
    /* JADX WARN: Code duplicated, block: B:297:0x0431  */
    /* JADX WARN: Code duplicated, block: B:300:0x0438  */
    /* JADX WARN: Code duplicated, block: B:301:0x043b  */
    /* JADX WARN: Code duplicated, block: B:303:0x043e  */
    /* JADX WARN: Code duplicated, block: B:306:0x0448  */
    /* JADX WARN: Code duplicated, block: B:307:0x044b  */
    /* JADX WARN: Code duplicated, block: B:309:0x0455  */
    /* JADX WARN: Code duplicated, block: B:310:0x0458  */
    /* JADX WARN: Code duplicated, block: B:312:0x045b  */
    /* JADX WARN: Code duplicated, block: B:313:0x045e  */
    /* JADX WARN: Code duplicated, block: B:318:0x046b  */
    /* JADX WARN: Code duplicated, block: B:321:0x0472  */
    /* JADX WARN: Code duplicated, block: B:322:0x0475  */
    /* JADX WARN: Code duplicated, block: B:324:0x0478  */
    /* JADX WARN: Code duplicated, block: B:327:0x0480  */
    /* JADX WARN: Code duplicated, block: B:328:0x0483  */
    /* JADX WARN: Code duplicated, block: B:330:0x0494  */
    /* JADX WARN: Code duplicated, block: B:332:0x0498  */
    /* JADX WARN: Code duplicated, block: B:333:0x049b  */
    /* JADX WARN: Code duplicated, block: B:335:0x049e  */
    /* JADX WARN: Code duplicated, block: B:336:0x04a1  */
    /* JADX WARN: Code duplicated, block: B:338:0x04a5  */
    /* JADX WARN: Code duplicated, block: B:339:0x04a8  */
    /* JADX WARN: Code duplicated, block: B:341:0x04ab  */
    /* JADX WARN: Code duplicated, block: B:344:0x04b5  */
    /* JADX WARN: Code duplicated, block: B:345:0x04b8  */
    /* JADX WARN: Code duplicated, block: B:347:0x04c2  */
    /* JADX WARN: Code duplicated, block: B:348:0x04c5  */
    /* JADX WARN: Code duplicated, block: B:350:0x04c8  */
    /* JADX WARN: Code duplicated, block: B:351:0x04cb  */
    /* JADX WARN: Code duplicated, block: B:353:0x04cf  */
    /* JADX WARN: Code duplicated, block: B:354:0x04d2  */
    /* JADX WARN: Code duplicated, block: B:356:0x04d5  */
    /* JADX WARN: Code duplicated, block: B:359:0x04dd  */
    /* JADX WARN: Code duplicated, block: B:360:0x04e0  */
    /* JADX WARN: Code duplicated, block: B:363:0x04ec  */
    /* JADX WARN: Code duplicated, block: B:364:0x04f3  */
    /* JADX WARN: Code duplicated, block: B:368:0x0506  */
    /* JADX WARN: Code duplicated, block: B:371:0x050d  */
    /* JADX WARN: Code duplicated, block: B:372:0x0514  */
    /* JADX WARN: Code duplicated, block: B:375:0x0522  */
    /* JADX WARN: Code duplicated, block: B:376:0x0529  */
    /* JADX WARN: Code duplicated, block: B:381:0x0538  */
    /* JADX WARN: Code duplicated, block: B:384:0x053e  */
    /* JADX WARN: Code duplicated, block: B:385:0x0541  */
    /* JADX WARN: Code duplicated, block: B:388:0x054b  */
    /* JADX WARN: Code duplicated, block: B:390:0x0550  */
    /* JADX WARN: Code duplicated, block: B:392:0x0556  */
    /* JADX WARN: Code duplicated, block: B:393:0x0559  */
    /* JADX WARN: Code duplicated, block: B:405:0x057a  */
    /* JADX WARN: Code duplicated, block: B:408:0x0583  */
    /* JADX WARN: Code duplicated, block: B:409:0x058a  */
    /* JADX WARN: Code duplicated, block: B:416:0x059d  */
    /* JADX WARN: Code duplicated, block: B:41:0x0160  */
    /* JADX WARN: Code duplicated, block: B:424:0x05b6  */
    /* JADX WARN: Code duplicated, block: B:42:0x0165  */
    /* JADX WARN: Code duplicated, block: B:434:0x05cd  */
    /* JADX WARN: Code duplicated, block: B:441:0x05e0  */
    /* JADX WARN: Code duplicated, block: B:443:0x05e4  */
    /* JADX WARN: Code duplicated, block: B:444:0x05e7  */
    /* JADX WARN: Code duplicated, block: B:446:0x05ea  */
    /* JADX WARN: Code duplicated, block: B:447:0x05ed  */
    /* JADX WARN: Code duplicated, block: B:44:0x0169  */
    /* JADX WARN: Code duplicated, block: B:458:0x0637  */
    /* JADX WARN: Code duplicated, block: B:46:0x016d  */
    /* JADX WARN: Code duplicated, block: B:47:0x0172  */
    /* JADX WARN: Code duplicated, block: B:485:0x06cb  */
    /* JADX WARN: Code duplicated, block: B:490:0x06dd  */
    /* JADX WARN: Code duplicated, block: B:494:0x06e5  */
    /* JADX WARN: Code duplicated, block: B:497:0x06ed  */
    /* JADX WARN: Code duplicated, block: B:498:0x06f0  */
    /* JADX WARN: Code duplicated, block: B:49:0x0176  */
    /* JADX WARN: Code duplicated, block: B:503:0x06fd  */
    /* JADX WARN: Code duplicated, block: B:528:0x074e  */
    /* JADX WARN: Code duplicated, block: B:52:0x017e  */
    /* JADX WARN: Code duplicated, block: B:531:0x0755  */
    /* JADX WARN: Code duplicated, block: B:532:0x0758  */
    /* JADX WARN: Code duplicated, block: B:53:0x0183  */
    /* JADX WARN: Code duplicated, block: B:556:0x07a1  */
    /* JADX WARN: Code duplicated, block: B:56:0x0189  */
    /* JADX WARN: Code duplicated, block: B:57:0x018e  */
    /* JADX WARN: Code duplicated, block: B:598:0x083f  */
    /* JADX WARN: Code duplicated, block: B:601:0x0849  */
    /* JADX WARN: Code duplicated, block: B:602:0x0850  */
    /* JADX WARN: Code duplicated, block: B:608:0x0873  */
    /* JADX WARN: Code duplicated, block: B:609:0x0876  */
    /* JADX WARN: Code duplicated, block: B:612:0x087b  */
    /* JADX WARN: Code duplicated, block: B:613:0x087e  */
    /* JADX WARN: Code duplicated, block: B:615:0x0881  */
    /* JADX WARN: Code duplicated, block: B:616:0x0884  */
    /* JADX WARN: Code duplicated, block: B:619:0x0889  */
    /* JADX WARN: Code duplicated, block: B:623:0x089a  */
    /* JADX WARN: Code duplicated, block: B:625:0x08a8  */
    /* JADX WARN: Code duplicated, block: B:628:0x08bc  */
    /* JADX WARN: Code duplicated, block: B:629:0x08bf  */
    /* JADX WARN: Code duplicated, block: B:635:0x08d7  */
    /* JADX WARN: Code duplicated, block: B:639:0x08f7  */
    /* JADX WARN: Code duplicated, block: B:63:0x019c  */
    /* JADX WARN: Code duplicated, block: B:642:0x0904  */
    /* JADX WARN: Code duplicated, block: B:643:0x0909  */
    /* JADX WARN: Code duplicated, block: B:649:0x092a  */
    /* JADX WARN: Code duplicated, block: B:652:0x0934  */
    /* JADX WARN: Code duplicated, block: B:654:0x0950 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:655:0x0952  */
    /* JADX WARN: Code duplicated, block: B:657:0x0958  */
    /* JADX WARN: Code duplicated, block: B:658:0x095f  */
    /* JADX WARN: Code duplicated, block: B:660:0x0971  */
    /* JADX WARN: Code duplicated, block: B:662:0x0979 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:663:0x097b  */
    /* JADX WARN: Code duplicated, block: B:664:0x0982  */
    /* JADX WARN: Code duplicated, block: B:666:0x0986  */
    /* JADX WARN: Code duplicated, block: B:667:0x098d  */
    /* JADX WARN: Code duplicated, block: B:670:0x0993  */
    /* JADX WARN: Code duplicated, block: B:671:0x099a  */
    /* JADX WARN: Code duplicated, block: B:673:0x09aa A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:674:0x09ac  */
    /* JADX WARN: Code duplicated, block: B:676:0x09b8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:677:0x09ba  */
    /* JADX WARN: Code duplicated, block: B:678:0x09c1  */
    /* JADX WARN: Code duplicated, block: B:681:0x09c7  */
    /* JADX WARN: Code duplicated, block: B:682:0x09ce  */
    /* JADX WARN: Code duplicated, block: B:685:0x09da A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:686:0x09dc  */
    /* JADX WARN: Code duplicated, block: B:687:0x09e3  */
    /* JADX WARN: Code duplicated, block: B:690:0x09e9  */
    /* JADX WARN: Code duplicated, block: B:691:0x09f0  */
    /* JADX WARN: Code duplicated, block: B:697:0x0a0b  */
    /* JADX WARN: Code duplicated, block: B:69:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:704:0x0a2d  */
    /* JADX WARN: Code duplicated, block: B:707:0x0a35  */
    /* JADX WARN: Code duplicated, block: B:708:0x0a3d  */
    /* JADX WARN: Code duplicated, block: B:711:0x0a43  */
    /* JADX WARN: Code duplicated, block: B:713:0x0a4d  */
    /* JADX WARN: Code duplicated, block: B:714:0x0a52  */
    /* JADX WARN: Code duplicated, block: B:716:0x0a59 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:717:0x0a5b  */
    /* JADX WARN: Code duplicated, block: B:719:0x0a61  */
    /* JADX WARN: Code duplicated, block: B:723:0x0a6d  */
    /* JADX WARN: Code duplicated, block: B:725:0x0a80  */
    /* JADX WARN: Code duplicated, block: B:728:0x0a8f  */
    /* JADX WARN: Code duplicated, block: B:72:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:730:0x0a9b  */
    /* JADX WARN: Code duplicated, block: B:733:0x0aa6  */
    /* JADX WARN: Code duplicated, block: B:736:0x0ab1  */
    /* JADX WARN: Code duplicated, block: B:740:0x0aba  */
    /* JADX WARN: Code duplicated, block: B:748:0x0afb  */
    /* JADX WARN: Code duplicated, block: B:750:0x0b03  */
    /* JADX WARN: Code duplicated, block: B:754:0x0b14  */
    /* JADX WARN: Code duplicated, block: B:757:0x0b19  */
    /* JADX WARN: Code duplicated, block: B:75:0x01be  */
    /* JADX WARN: Code duplicated, block: B:760:0x0b1f  */
    /* JADX WARN: Code duplicated, block: B:763:0x0b26  */
    /* JADX WARN: Code duplicated, block: B:765:0x0b3a  */
    /* JADX WARN: Code duplicated, block: B:768:0x0b4f  */
    /* JADX WARN: Code duplicated, block: B:76:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:770:0x0b59  */
    /* JADX WARN: Code duplicated, block: B:771:0x0b60  */
    /* JADX WARN: Code duplicated, block: B:774:0x0b68  */
    /* JADX WARN: Code duplicated, block: B:777:0x0b73  */
    /* JADX WARN: Code duplicated, block: B:779:0x0b7d  */
    /* JADX WARN: Code duplicated, block: B:782:0x0b83  */
    /* JADX WARN: Code duplicated, block: B:783:0x0b88  */
    /* JADX WARN: Code duplicated, block: B:787:0x0b97  */
    /* JADX WARN: Code duplicated, block: B:78:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:790:0x0b9c  */
    /* JADX WARN: Code duplicated, block: B:793:0x0ba1  */
    /* JADX WARN: Code duplicated, block: B:796:0x0ba9  */
    /* JADX WARN: Code duplicated, block: B:799:0x0bb1  */
    /* JADX WARN: Code duplicated, block: B:802:0x0bbb  */
    /* JADX WARN: Code duplicated, block: B:806:0x0bc8  */
    /* JADX WARN: Code duplicated, block: B:809:0x0bd7  */
    /* JADX WARN: Code duplicated, block: B:811:0x0be6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:814:0x0bf3  */
    /* JADX WARN: Code duplicated, block: B:818:0x0bfc  */
    /* JADX WARN: Code duplicated, block: B:821:0x0c0d  */
    /* JADX WARN: Code duplicated, block: B:828:0x0bf6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:830:0x0bd1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:834:0x0baf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:835:0x0bc5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:836:? A[LOOP:2: B:800:0x0bb5->B:836:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:840:0x09fd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:843:0x09fd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:846:0x0afe A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:851:0x03d0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:852:0x03c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:856:0x03b1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:93:0x0200  */
    /* JADX WARN: Code duplicated, block: B:94:0x0203  */
    /* JADX WARN: Code duplicated, block: B:96:0x0206  */
    /* JADX WARN: Code duplicated, block: B:99:0x020c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v16, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r10v17, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v18, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v102, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v83, types: [a.qoj0] */
    /* JADX WARN: Type inference failed for: r2v87, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r2v88, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v91, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v98, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r2v99, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r3v23, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v63, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v2, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v6, types: [a.qoj0] */
    /* JADX WARN: Type inference failed for: r74v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r79v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v45, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r7v46 */
    /* JADX WARN: Type inference failed for: r7v65, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r82v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v19, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v3, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r9v4 */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object objA;
        r9s r9sVar;
        Object objE;
        boolean z;
        b5h0 b5h0Var;
        h380 h380Var;
        q1v0 q1v0Var;
        lbr lbrVar;
        gmz gmzVar;
        oem0 oem0Var;
        ukl0 ukl0Var;
        h380 h380Var2;
        List listB;
        List listB2;
        Long l;
        long jLongValue;
        Long l2;
        long jLongValue2;
        List listB3;
        List listB4;
        String str;
        String str2;
        String str3;
        String str4;
        boolean zBooleanValue;
        String str5;
        boolean zBooleanValue2;
        String str6;
        String str7;
        String str8;
        String str9;
        ma30 ma30Var;
        String str10;
        String string;
        String str11;
        String string2;
        List listA;
        List listA2;
        long jLongValue3;
        long jLongValue4;
        Boolean bool;
        boolean zBooleanValue3;
        String str12;
        String str13;
        fxs fxsVar;
        String str14;
        String str15;
        Long l3;
        long jLongValue5;
        Iterator it;
        Object next;
        h5l0 h5l0Var;
        String str16;
        String str17;
        long jLongValue6;
        List<bo2> list;
        ?? arrayList;
        Integer num;
        int iIntValue;
        Boolean bool2;
        Boolean bool3;
        boolean zBooleanValue4;
        int iIntValue2;
        String str18;
        String str19;
        s9s s9sVar;
        Long l4;
        Long l5;
        long jLongValue7;
        Long lT0;
        long jLongValue8;
        boolean z2;
        boolean zBooleanValue5;
        String str20;
        String str21;
        ?? arrayList2;
        Long l6;
        List list2;
        boolean zBooleanValue6;
        String str22;
        Long l7;
        boolean z3;
        long jLongValue9;
        ?? arrayList3;
        Integer num2;
        vzj0 vzj0Var;
        Boolean bool4;
        boolean zBooleanValue7;
        k9s k9sVar;
        pqs pqsVarD0;
        nqj0 nqj0Var;
        Unit unit;
        k9s k9sVar2;
        bd90 bd90Var;
        Integer num3;
        xc90 xc90Var;
        Integer num4;
        Integer num5;
        Iterable<ad90> iterable;
        LinkedHashMap linkedHashMap;
        cd90 cd90VarZ;
        long j;
        Integer num6;
        Object arrayList4;
        rc90 rc90Var;
        k0k0 k0k0Var;
        boolean z4;
        vzj0 tzj0Var;
        boolean z5;
        Map map;
        Collection collectionValues;
        List<u4h0> list3;
        String str23;
        String str24;
        String str25;
        Long l8;
        Boolean bool5;
        Map map2;
        Long l9;
        Iterator it2;
        ?? arrayList5;
        o4h0 o4h0Var;
        Map map3;
        a5h0 a5h0Var;
        Boolean bool6;
        a5h0 a5h0Var2;
        Integer num7;
        a5h0 a5h0Var3;
        Long l10;
        qt00 qt00Var;
        String str26;
        Integer num8;
        p380 p380Var;
        p380 p380Var2;
        String str27;
        String str28;
        String str29;
        String strN;
        String str30;
        String str31;
        String str32;
        String strN2;
        Long l11;
        long jLongValue10;
        bsw bswVar;
        String str33;
        String str34;
        int iIntValue3;
        String str35;
        String strN3;
        String str36;
        String str37;
        int iIntValue4;
        String str38;
        String strN4;
        Integer num9;
        Integer num10;
        Long l12;
        h5l0 h5l0Var2;
        Long l13;
        Long l14;
        Long l15;
        String str39;
        String str40;
        qt00 qt00Var2;
        String str41;
        String str42;
        String str43;
        String str44;
        String str45;
        String str46;
        String str47;
        String str48;
        cvh0 cvh0Var;
        String str49;
        String str50;
        String str51;
        String str52;
        String str53;
        String str54;
        t1v0 t1v0Var;
        String str55;
        String str56;
        String str57;
        String str58;
        String str59;
        String str60;
        String str61;
        String str62;
        String str63;
        String str64;
        String str65;
        String str66;
        Boolean bool7;
        Boolean bool8;
        Boolean bool9;
        ukl0 ukl0Var2;
        Long l16;
        List<awm0> list4;
        boolean zBooleanValue8;
        p7m0 p7m0Var;
        Object value;
        boolean z6;
        ArrayList arrayList6;
        Long l17;
        Long l18;
        k3h0 k3h0Var;
        long jLongValue11;
        pqs pqsVar;
        Long l19;
        boolean z7;
        pqs pqsVar2;
        List<dv20> list5;
        ?? arrayList7;
        long jLongValue12;
        Object objA2;
        wne wneVar;
        r9s r9sVar2;
        ArrayList arrayList8;
        long jLongValue13;
        long jLongValue14;
        Long l20;
        ?? arrayList9;
        Object objA3;
        wne wneVar2;
        Iterator it3;
        long jLongValue15;
        List list6;
        boolean z8;
        xm7 xm7Var;
        Long l21;
        long jLongValue16;
        Boolean bool10;
        Integer num11;
        Long l22;
        Boolean bool11;
        long jLongValue17;
        long jLongValue18;
        int iIntValue5;
        xvm0 vvm0Var;
        long jLongValue19;
        int iIntValue6;
        long jLongValue20;
        long jLongValue21;
        int iIntValue7;
        long jLongValue22;
        List<ms20> list7;
        Iterator it4;
        boolean z9;
        ?? arrayList10;
        ArrayList arrayListL;
        p7m0 p7m0Var2;
        Object value2;
        Long l23;
        Object is20Var;
        tdl0 tdl0Var = this.o;
        us3 us3Var = tdl0Var.l;
        k3h0 k3h0Var2 = tdl0Var.c;
        vne vneVar = (vne) this.n;
        wne wneVar3 = wne.f39444a;
        byte b = this.m;
        qdl0 qdl0Var = this.p;
        if (b == 0) {
            z1x.P(obj);
            int iA = tdl0Var.f.a();
            knf0 knf0Var = tdl0Var.g;
            int iB = knf0Var.b();
            are areVar = this.q;
            int i = areVar.f1342a;
            long j2 = qdl0Var.f28540a;
            String strC = knf0Var.c();
            boolean z10 = qdl0Var.c;
            long j3 = qdl0Var.b;
            Long l24 = qdl0Var.e;
            boolean z11 = areVar.b;
            jo20 jo20Var = new jo20();
            jo20Var.put("cfView", Integer.valueOf(iA));
            if (!z11) {
                jo20Var.put("country", Integer.valueOf(i));
            }
            jo20Var.put("fcountry", Integer.valueOf(iB));
            jo20Var.put("gameId", Long.valueOf(j2));
            jo20Var.put("gr", 1357);
            jo20Var.put("lng", strC);
            if (l24 != null) {
                jo20Var.put("marketType", l24);
            }
            jo20Var.put("ref", 1);
            byte b2 = this.r;
            if (b2 > 0) {
                jo20Var.put("supportedSpecialType", Integer.valueOf(b2));
            }
            if (z10 && j3 > 0) {
                jo20Var.put("userId", Long.valueOf(j3));
            }
            jo20 jo20VarJ = w6x.j(22, jo20Var, "whence");
            dpi0 dpi0Var = tdl0Var.b;
            boolean z12 = qdl0Var.d;
            this.n = vneVar;
            this.m = (byte) 1;
            objA = ((k9l0) ((enj0) dpi0Var.f6468a).invoke()).a(z12 ? "Live" : "Line", jo20VarJ, this);
            if (objA != wneVar3) {
            }
            return wneVar3;
        }
        if (b == 1) {
            z1x.P(obj);
            objA = obj;
        } else {
            if (b == 2) {
                r9sVar = this.i;
                z1x.P(obj);
                us3Var = us3Var;
                objE = obj;
                List list8 = (List) objE;
                z = qdl0Var.d;
                r9sVar.getClass();
                b5h0Var = r9sVar.k;
                list8.getClass();
                h380Var = r9sVar.n;
                q1v0Var = r9sVar.F;
                lbrVar = r9sVar.j;
                gmzVar = r9sVar.i;
                oem0Var = r9sVar.C;
                ukl0Var = r9sVar.p;
                h380Var2 = r9sVar.o;
                if (h380Var != null) {
                    listB = h380Var.b();
                } else {
                    listB = null;
                }
                if (listB == null) {
                    listB = iun.f15405a;
                }
                if (h380Var2 != null) {
                    listB2 = h380Var2.b();
                } else {
                    listB2 = null;
                }
                if (listB2 == null) {
                    listB2 = iun.f15405a;
                }
                l = r9sVar.e;
                if (l != null) {
                    jLongValue = l.longValue();
                } else {
                    jLongValue = 0;
                }
                l2 = r9sVar.c;
                if (l2 != null) {
                    jLongValue2 = l2.longValue();
                } else {
                    jLongValue2 = 0;
                }
                if (h380Var != null || (listB3 = h380Var.b()) == null) {
                    listB3 = iun.f15405a;
                }
                List list9 = listB3;
                if (h380Var2 != null || (listB4 = h380Var2.b()) == null) {
                    listB4 = iun.f15405a;
                }
                List list10 = listB4;
                String str67 = r9sVar.f;
                str = r9sVar.g;
                if (str == null) {
                    str = "";
                }
                String str68 = str;
                if (oem0Var != null) {
                    str2 = oem0Var.f25130a;
                } else {
                    str2 = null;
                }
                if (str2 == null) {
                    str2 = "";
                }
                str3 = str2;
                if (oem0Var != null || (bool8 = oem0Var.b) == null) {
                    str4 = str3;
                    zBooleanValue = false;
                } else {
                    zBooleanValue = bool8.booleanValue();
                    str4 = str3;
                }
                if (oem0Var != null || (bool7 = oem0Var.c) == null) {
                    str5 = "";
                    zBooleanValue2 = false;
                } else {
                    zBooleanValue2 = bool7.booleanValue();
                    str5 = "";
                }
                str6 = str5;
                if (gmzVar != null) {
                    str7 = gmzVar.b;
                } else {
                    str7 = null;
                }
                if (str7 == null) {
                    str7 = str6;
                }
                String str69 = str7;
                if (gmzVar != null) {
                    str8 = gmzVar.c;
                } else {
                    str8 = null;
                }
                if (str8 == null) {
                    str8 = str6;
                }
                String str70 = str8;
                if (gmzVar != null) {
                    str9 = gmzVar.d;
                } else {
                    str9 = null;
                }
                if (str9 == null) {
                    str9 = str6;
                }
                if (lbrVar != null) {
                    str39 = lbrVar.f19764a;
                    if (str39 == null) {
                        str40 = str6;
                    } else {
                        str40 = str39;
                    }
                    qt00Var2 = lbrVar.e;
                    if (qt00Var2 != null) {
                        str41 = qt00Var2.f29277a;
                    } else {
                        str41 = null;
                    }
                    if (str41 == null) {
                        str42 = str6;
                    } else {
                        str42 = str41;
                    }
                    if (qt00Var2 != null) {
                        str43 = qt00Var2.e;
                    } else {
                        str43 = null;
                    }
                    if (str43 == null) {
                        str44 = str6;
                    } else {
                        str44 = str43;
                    }
                    str45 = lbrVar.b;
                    if (str45 == null) {
                        str46 = str6;
                    } else {
                        str46 = str45;
                    }
                    str47 = lbrVar.c;
                    if (str47 == null) {
                        str48 = str6;
                    } else {
                        str48 = str47;
                    }
                    cvh0Var = lbrVar.d;
                    if (cvh0Var != null) {
                        str49 = cvh0Var.f5028a;
                    } else {
                        str49 = null;
                    }
                    if (str49 == null) {
                        str50 = str6;
                    } else {
                        str50 = str49;
                    }
                    if (cvh0Var != null) {
                        str51 = cvh0Var.b;
                    } else {
                        str51 = null;
                    }
                    if (str51 == null) {
                        str52 = str6;
                    } else {
                        str52 = str51;
                    }
                    if (qt00Var2 != null) {
                        str53 = qt00Var2.b;
                    } else {
                        str53 = null;
                    }
                    if (str53 == null) {
                        str54 = str6;
                    } else {
                        str54 = str53;
                    }
                    t1v0Var = lbrVar.f;
                    if (t1v0Var != null) {
                        str55 = t1v0Var.f33187a;
                    } else {
                        str55 = null;
                    }
                    if (str55 == null) {
                        str56 = str6;
                    } else {
                        str56 = str55;
                    }
                    if (qt00Var2 != null) {
                        str57 = qt00Var2.c;
                    } else {
                        str57 = null;
                    }
                    if (str57 == null) {
                        str58 = str6;
                    } else {
                        str58 = str57;
                    }
                    if (t1v0Var != null) {
                        str59 = t1v0Var.b;
                    } else {
                        str59 = null;
                    }
                    if (str59 == null) {
                        str60 = str6;
                    } else {
                        str60 = str59;
                    }
                    if (t1v0Var != null) {
                        str61 = t1v0Var.c;
                    } else {
                        str61 = null;
                    }
                    if (str61 == null) {
                        str62 = str6;
                    } else {
                        str62 = str61;
                    }
                    if (t1v0Var != null) {
                        str63 = t1v0Var.d;
                    } else {
                        str63 = null;
                    }
                    if (str63 == null) {
                        str64 = str6;
                    } else {
                        str64 = str63;
                    }
                    if (t1v0Var != null) {
                        str65 = t1v0Var.e;
                    } else {
                        str65 = null;
                    }
                    if (str65 == null) {
                        str66 = str6;
                    } else {
                        str66 = str65;
                    }
                    ma30Var = new ma30(str40, str42, str46, str48, str50, str52, str44, str54, str56, str58, str60, str62, str64, str66);
                } else {
                    ma30Var = new ma30("", "", "", "", "", "", "", "", "", "", "", "", "", "");
                }
                if (q1v0Var != null || (string = q1v0Var.f27972a) == null) {
                    if (h380Var != null) {
                        str10 = h380Var.f12372a;
                    } else {
                        str10 = null;
                    }
                    if (str10 == null) {
                        str10 = str6;
                    }
                    string = StringsKt.u0(str10).toString();
                }
                String str71 = string;
                if (q1v0Var != null || q1v0Var.f27972a == null) {
                    if (h380Var2 != null) {
                        str11 = h380Var2.f12372a;
                    } else {
                        str11 = null;
                    }
                    if (str11 == null) {
                        str11 = str6;
                    }
                    string2 = StringsKt.u0(str11).toString();
                } else {
                    string2 = str6;
                }
                if (h380Var != null) {
                    listA = h380Var.a();
                } else {
                    listA = null;
                }
                if (listA == null) {
                    listA = iun.f15405a;
                }
                List list11 = listA;
                if (h380Var2 != null) {
                    listA2 = h380Var2.a();
                } else {
                    listA2 = null;
                }
                if (listA2 == null) {
                    listA2 = iun.f15405a;
                }
                List list12 = listA2;
                if (ukl0Var != null || (l15 = ukl0Var.f35833a) == null) {
                    jLongValue3 = 0;
                } else {
                    jLongValue3 = l15.longValue();
                }
                if (ukl0Var != null || (l14 = ukl0Var.b) == null) {
                    jLongValue4 = 0;
                } else {
                    jLongValue4 = l14.longValue();
                }
                bool = r9sVar.t;
                if (bool != null) {
                    zBooleanValue3 = bool.booleanValue();
                } else {
                    zBooleanValue3 = false;
                }
                str12 = r9sVar.u;
                if (str12 == null) {
                    str13 = str6;
                } else {
                    str13 = str12;
                }
                fxsVar = r9sVar.v;
                if (fxsVar != null) {
                    str14 = fxsVar.f10325a;
                } else {
                    str14 = null;
                }
                if (str14 == null) {
                    str15 = str6;
                } else {
                    str15 = str14;
                }
                l3 = r9sVar.q;
                if (l3 != null) {
                    jLongValue5 = l3.longValue();
                } else {
                    jLongValue5 = 0;
                }
                it = list8.iterator();
                while (true) {
                    if (it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    h5l0Var2 = (h5l0) next;
                    if (ukl0Var != null) {
                        long j4 = h5l0Var2.f12486a;
                        l13 = ukl0Var.f35833a;
                        if (l13 != null && j4 == l13.longValue()) {
                            break;
                        }
                    }
                }
                h5l0Var = (h5l0) next;
                if (h5l0Var != null) {
                    str16 = h5l0Var.b;
                } else {
                    str16 = null;
                }
                if (str16 == null) {
                    str17 = str6;
                } else {
                    str17 = str16;
                }
                if (gmzVar != null || (l12 = gmzVar.f11563a) == null) {
                    jLongValue6 = 0;
                } else {
                    jLongValue6 = l12.longValue();
                }
                list = r9sVar.A;
                if (list != null) {
                    arrayList = new ArrayList(r3d.q(list, 10));
                    for (bo2 bo2Var : list) {
                        bo2Var.getClass();
                        p380Var = bo2Var.c;
                        p380Var2 = bo2Var.b;
                        if (z) {
                            if (p380Var2 != null) {
                                str33 = p380Var2.b;
                            } else {
                                str33 = null;
                            }
                            if (str33 == null) {
                                str34 = str6;
                            } else {
                                str34 = str33;
                            }
                            if (p380Var2 != null || (num10 = p380Var2.d) == null) {
                                iIntValue3 = 0;
                            } else {
                                iIntValue3 = num10.intValue();
                            }
                            String strValueOf = String.valueOf(iIntValue3);
                            if (p380Var2 != null) {
                                str35 = p380Var2.c;
                            } else {
                                str35 = null;
                            }
                            if (str35 == null) {
                                str35 = str6;
                            }
                            List list13 = u0d.f34849a;
                            if (u0d.c(str35)) {
                                strN3 = str6;
                            } else {
                                strN3 = ohs0.n(ujn.h, str35);
                            }
                            if (p380Var != null) {
                                str36 = p380Var.b;
                            } else {
                                str36 = null;
                            }
                            if (str36 == null) {
                                str37 = str6;
                            } else {
                                str37 = str36;
                            }
                            if (p380Var != null || (num9 = p380Var.d) == null) {
                                iIntValue4 = 0;
                            } else {
                                iIntValue4 = num9.intValue();
                            }
                            String strValueOf2 = String.valueOf(iIntValue4);
                            if (p380Var != null) {
                                str38 = p380Var.c;
                            } else {
                                str38 = null;
                            }
                            if (str38 == null) {
                                str38 = str6;
                            }
                            if (u0d.c(str38)) {
                                strN4 = str6;
                            } else {
                                strN4 = ohs0.n(ujn.h, str38);
                            }
                            bswVar = new bsw(str34, strValueOf, strN3, str37, strValueOf2, strN4, 0L);
                        } else {
                            if (p380Var2 != null) {
                                str27 = p380Var2.b;
                            } else {
                                str27 = null;
                            }
                            if (str27 == null) {
                                str28 = str6;
                            } else {
                                str28 = str27;
                            }
                            if (p380Var2 != null) {
                                str29 = p380Var2.c;
                            } else {
                                str29 = null;
                            }
                            if (str29 == null) {
                                str29 = str6;
                            }
                            List list14 = u0d.f34849a;
                            if (u0d.c(str29)) {
                                strN = str6;
                            } else {
                                strN = ohs0.n(ujn.h, str29);
                            }
                            if (p380Var != null) {
                                str30 = p380Var.b;
                            } else {
                                str30 = null;
                            }
                            if (str30 == null) {
                                str31 = str6;
                            } else {
                                str31 = str30;
                            }
                            if (p380Var != null) {
                                str32 = p380Var.c;
                            } else {
                                str32 = null;
                            }
                            if (str32 == null) {
                                str32 = str6;
                            }
                            if (u0d.c(str32)) {
                                strN2 = str6;
                            } else {
                                strN2 = ohs0.n(ujn.h, str32);
                            }
                            l11 = bo2Var.f2911a;
                            if (l11 != null) {
                                jLongValue10 = l11.longValue();
                            } else {
                                jLongValue10 = 0;
                            }
                            bswVar = new bsw(str28, "", strN, str31, "", strN2, jLongValue10);
                        }
                        arrayList.add(bswVar);
                    }
                } else {
                    arrayList = iun.f15405a;
                }
                ?? r82 = arrayList;
                num = r9sVar.z;
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = 0;
                }
                Boolean bool12 = r9sVar.r;
                bool2 = Boolean.TRUE;
                boolean zD = Intrinsics.d(bool12, bool2);
                bool3 = r9sVar.B;
                if (bool3 != null) {
                    zBooleanValue4 = bool3.booleanValue();
                } else {
                    zBooleanValue4 = false;
                }
                if (oem0Var != null || (num8 = oem0Var.e) == null) {
                    iIntValue2 = 0;
                } else {
                    iIntValue2 = num8.intValue();
                }
                str18 = r9sVar.d;
                if (str18 == null) {
                    str19 = str6;
                } else {
                    str19 = str18;
                }
                if (Intrinsics.d(r9sVar.h, bool2)) {
                    s9sVar = s9s.f31862a;
                } else if (listB2.isEmpty()) {
                    s9sVar = s9s.d;
                } else if (listB.size() != 2 || listB2.size() == 2) {
                    s9sVar = s9s.b;
                } else {
                    s9sVar = (listB.size() > 2 || listB2.size() > 2) ? s9s.c : s9s.e;
                }
                s9s s9sVar2 = s9sVar;
                l4 = r9sVar.w;
                l5 = r9sVar.E;
                if (l5 != null) {
                    jLongValue7 = l5.longValue();
                } else {
                    jLongValue7 = -1;
                }
                if (lbrVar != null || (qt00Var = lbrVar.e) == null || (str26 = qt00Var.d) == null) {
                    lT0 = null;
                } else {
                    lT0 = StringsKt.t0(str26);
                }
                boolean zD2 = Intrinsics.d(r9sVar.y, bool2);
                if (b5h0Var != null || (a5h0Var3 = b5h0Var.j) == null || (l10 = a5h0Var3.f271a) == null) {
                    jLongValue8 = 0;
                } else {
                    jLongValue8 = l10.longValue();
                }
                if (b5h0Var != null || (a5h0Var2 = b5h0Var.j) == null || (num7 = a5h0Var2.b) == null || num7.intValue() != -1) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (b5h0Var != null || (a5h0Var = b5h0Var.j) == null || (bool6 = a5h0Var.c) == null) {
                    zBooleanValue5 = false;
                } else {
                    zBooleanValue5 = bool6.booleanValue();
                }
                if (b5h0Var != null) {
                    str20 = b5h0Var.k;
                } else {
                    str20 = null;
                }
                if (str20 == null) {
                    str21 = str6;
                } else {
                    str21 = str20;
                }
                if (b5h0Var != null || (o4h0Var = b5h0Var.l) == null || (map3 = o4h0Var.f24635a) == null) {
                    arrayList2 = iun.f15405a;
                } else {
                    arrayList2 = new ArrayList(map3.size());
                    for (Map.Entry entry : map3.entrySet()) {
                        m6m0 m6m0Var = rem0.f30343a;
                        String str72 = (String) entry.getKey();
                        m6m0Var.getClass();
                        arrayList2.add(new sem0(m6m0.h(str72), (String) entry.getValue()));
                    }
                }
                ?? r74 = arrayList2;
                if (b5h0Var != null || (map2 = b5h0Var.m) == null) {
                    l6 = l4;
                    list2 = iun.f15405a;
                } else {
                    ArrayList arrayList11 = new ArrayList(map2.size());
                    Iterator it5 = map2.entrySet().iterator();
                    while (it5.hasNext()) {
                        List<u4h0> list15 = (List) ((Map.Entry) it5.next()).getValue();
                        if (list15 != null) {
                            arrayList5 = new ArrayList(r3d.q(list15, 10));
                            for (u4h0 u4h0Var : list15) {
                                g9m0 g9m0Var = ano0.f1166a;
                                Long l25 = l4;
                                Integer num12 = u4h0Var.f35049a;
                                g9m0Var.getClass();
                                ano0 ano0VarD = g9m0.d(num12);
                                String str73 = u4h0Var.d;
                                if (str73 == null) {
                                    str73 = str6;
                                }
                                Iterator it6 = it5;
                                String str74 = u4h0Var.b;
                                if (str74 == null) {
                                    str74 = str6;
                                }
                                String str75 = u4h0Var.c;
                                if (str75 == null) {
                                    str75 = str6;
                                }
                                arrayList5.add(new bno0(ano0VarD, str73, str74, str75));
                                it5 = it6;
                                l4 = l25;
                            }
                            l9 = l4;
                            it2 = it5;
                        } else {
                            l9 = l4;
                            it2 = it5;
                            arrayList5 = iun.f15405a;
                        }
                        arrayList11.add(new cno0(arrayList5));
                        it5 = it2;
                        l4 = l9;
                    }
                    l6 = l4;
                    list2 = arrayList11;
                }
                List list16 = list2;
                if (b5h0Var != null || (bool5 = b5h0Var.n) == null) {
                    zBooleanValue6 = false;
                } else {
                    zBooleanValue6 = bool5.booleanValue();
                }
                if (b5h0Var != null || (str22 = b5h0Var.f2004a) == null) {
                    str22 = str6;
                }
                l7 = r9sVar.x;
                if (r9sVar.s == null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (ukl0Var != null || (l8 = ukl0Var.f35833a) == null) {
                    jLongValue9 = 0;
                } else {
                    jLongValue9 = l8.longValue();
                }
                pqs pqsVarD1 = xkb.d0(b5h0Var, jLongValue9);
                if (b5h0Var != null || (map = b5h0Var.m) == null || (collectionValues = map.values()) == null || (list3 = (List) CollectionsKt.V(collectionValues)) == null) {
                    arrayList3 = iun.f15405a;
                } else {
                    arrayList3 = new ArrayList();
                    for (u4h0 u4h0Var2 : list3) {
                        vrj0 vrj0Var = (u4h0Var2.f35049a == null || (str23 = u4h0Var2.d) == null || (str24 = u4h0Var2.b) == null || (str25 = u4h0Var2.c) == null) ? null : new vrj0(str23, str24, str25);
                        if (vrj0Var != null) {
                            arrayList3.add(vrj0Var);
                        }
                    }
                }
                ?? r79 = arrayList3;
                qud qudVar = boh.b;
                if (gmzVar != null) {
                    num2 = gmzVar.e;
                } else {
                    num2 = null;
                }
                qudVar.getClass();
                boh bohVarC = qud.c(num2);
                if (this.s || (k0k0Var = r9sVar.G) == null) {
                    str22 = str22;
                    l7 = l7;
                    vzj0Var = null;
                } else {
                    Long l26 = k0k0Var.c;
                    Long l27 = k0k0Var.d;
                    Long l28 = k0k0Var.f17472a;
                    Long l29 = k0k0Var.e;
                    Integer num13 = k0k0Var.b;
                    Long l30 = k0k0Var.f;
                    if ((l26 != null && l26.longValue() == 0) || ((l29 != null && l29.longValue() == 0) || ((num13 != null && num13.intValue() == 0) || ((l28 != null && l28.longValue() == 0) || l26 == null)))) {
                        tzj0Var = null;
                    } else if (l28 != null) {
                        long jLongValue23 = l28.longValue();
                        if (num13 != null && num13.intValue() == 1) {
                            z5 = true;
                        } else if (num13 != null && num13.intValue() == 3) {
                            z5 = false;
                        } else {
                            tzj0Var = null;
                        }
                        tzj0Var = new uzj0(jLongValue23, z5, l26.longValue(), l27 != null ? l27.longValue() : 0L, l30 != null ? new znq0(l30.longValue()) : null);
                    } else if (l29 != null) {
                        long jLongValue24 = l29.longValue();
                        if (num13 != null && num13.intValue() == 1) {
                            z4 = true;
                        } else if (num13 != null && num13.intValue() == 3) {
                            z4 = false;
                        } else {
                            tzj0Var = null;
                        }
                        tzj0Var = new tzj0(jLongValue24, z4, l26.longValue(), l27 != 0 ? l27.longValue() : 0L, l30 != null ? new znq0(l30.longValue()) : null);
                    } else {
                        tzj0Var = null;
                    }
                    vzj0Var = tzj0Var;
                }
                bool4 = r9sVar.H;
                if (bool4 != null) {
                    zBooleanValue7 = bool4.booleanValue();
                } else {
                    zBooleanValue7 = false;
                }
                k9sVar = new k9s(jLongValue, jLongValue2, list9, list10, str67, str68, str4, zBooleanValue, zBooleanValue2, str69, str70, str9, ma30Var, str22, str71, string2, list11, list12, jLongValue3, jLongValue4, zBooleanValue3, zD2, str13, str15, jLongValue5, z, str17, jLongValue6, iIntValue, zD, iIntValue2, str19, s9sVar2, jLongValue7, lT0, jLongValue8, z2, zBooleanValue5, str21, r74, list16, zBooleanValue6, z3, pqsVarD1, r79, bohVarC, zBooleanValue7, r82, zBooleanValue4, l6, l7, vzj0Var);
                pqsVarD0 = xkb.d0(b5h0Var, jLongValue3);
                nqj0Var = r9sVar.l;
                if (nqj0Var != null && (bd90Var = nqj0Var.f23963a) != null) {
                    if (b5h0Var != null) {
                        num3 = b5h0Var.g;
                    } else {
                        num3 = null;
                    }
                    xc90Var = bd90Var.f2388a;
                    if (xc90Var != null) {
                        num4 = xc90Var.f40635a;
                    } else {
                        num4 = null;
                    }
                    if (xc90Var != null) {
                        num5 = xc90Var.b;
                    } else {
                        num5 = null;
                    }
                    iterable = bd90Var.b;
                    if (iterable == null) {
                        iterable = iun.f15405a;
                    }
                    linkedHashMap = new LinkedHashMap();
                    for (ad90 ad90Var : iterable) {
                        num6 = ad90Var.f667a;
                        arrayList4 = linkedHashMap.get(num6);
                        if (arrayList4 == null) {
                            arrayList4 = new ArrayList();
                            linkedHashMap.put(num6, arrayList4);
                        }
                        List list17 = (List) arrayList4;
                        if (Intrinsics.d(ad90Var.b, Boolean.TRUE)) {
                            rc90Var = rc90.f30227a;
                        } else {
                            rc90Var = rc90.b;
                        }
                        list17.add(rc90Var);
                    }
                    cd90VarZ = pzw.z(num4, num5, linkedHashMap, num3);
                    j = k9sVar.s;
                    if (j != 1 || j == 2) {
                        tdl0Var.h.a(cd90VarZ);
                    }
                }
                i9s i9sVar = tdl0Var.e;
                this.n = vneVar;
                this.i = r9sVar;
                this.j = k9sVar;
                this.k = pqsVarD0;
                this.m = (byte) 3;
                i9sVar.f14403a.o(null, k9sVar);
                unit = Unit.f46060a;
                wne wneVar4 = wne.f39444a;
                if (unit != wneVar3) {
                    k9sVar2 = k9sVar;
                    nf6 nf6Var = tdl0Var.n;
                    bool9 = r9sVar.K;
                    ukl0Var2 = r9sVar.p;
                    l16 = r9sVar.f30100a;
                    list4 = r9sVar.m;
                    if (bool9 != null) {
                        zBooleanValue8 = bool9.booleanValue();
                    } else {
                        zBooleanValue8 = false;
                    }
                    p7m0Var = nf6Var.f23420a;
                    do {
                        value = p7m0Var.getValue();
                    } while (!p7m0Var.m(value, Boolean.valueOf(zBooleanValue8)));
                    qdl0 qdl0Var2 = qdl0Var;
                    z6 = qdl0Var2.d;
                    arrayList6 = new ArrayList();
                    l17 = r9sVar.e;
                    if (list4 != null) {
                        for (awm0 awm0Var : list4) {
                            boolean z13 = z6;
                            bool10 = awm0Var.f;
                            Long l31 = l16;
                            num11 = awm0Var.e;
                            l22 = awm0Var.b;
                            bool11 = Boolean.TRUE;
                            if (Intrinsics.d(bool10, bool11)) {
                                if (l17 != null) {
                                    long jLongValue25 = l17.longValue();
                                    if (l22 != null) {
                                        jLongValue22 = l22.longValue();
                                    } else {
                                        jLongValue22 = -1;
                                    }
                                    arrayList6.add(new rvm0(jLongValue22, jLongValue25, awm0Var.f1582a));
                                }
                            } else if (!(CollectionsKt.firstOrNull(arrayList6) instanceof tvm0)) {
                                if (l22 != null) {
                                    jLongValue20 = l22.longValue();
                                } else {
                                    jLongValue20 = -1;
                                }
                                if (l22 != null) {
                                    jLongValue21 = l22.longValue();
                                } else {
                                    jLongValue21 = -1;
                                }
                                String str76 = awm0Var.f1582a;
                                if (num11 != null) {
                                    iIntValue7 = num11.intValue();
                                } else {
                                    iIntValue7 = 1;
                                }
                                arrayList6.add(0, new tvm0(str76, jLongValue20, jLongValue21, iIntValue7));
                            } else if (l17 != null) {
                                jLongValue17 = l17.longValue();
                                if (Intrinsics.d(awm0Var.h, bool11)) {
                                    if (l22 != null) {
                                        jLongValue19 = l22.longValue();
                                    } else {
                                        jLongValue19 = -1;
                                    }
                                    String str77 = awm0Var.f1582a;
                                    if (num11 != null) {
                                        iIntValue6 = num11.intValue();
                                    } else {
                                        iIntValue6 = 1;
                                    }
                                    vvm0Var = new uvm0(str77, jLongValue19, jLongValue17, iIntValue6);
                                } else {
                                    if (l22 != null) {
                                        jLongValue18 = l22.longValue();
                                    } else {
                                        jLongValue18 = -1;
                                    }
                                    String str78 = awm0Var.f1582a;
                                    if (num11 != null) {
                                        iIntValue5 = num11.intValue();
                                    } else {
                                        iIntValue5 = 1;
                                    }
                                    vvm0Var = new vvm0(str78, jLongValue18, jLongValue17, iIntValue5);
                                }
                                arrayList6.add(vvm0Var);
                            }
                            z6 = z13;
                            l16 = l31;
                        }
                    }
                    boolean z14 = z6;
                    l18 = l16;
                    if (!this.t) {
                    }
                    tdl0Var.d.b(arrayList6);
                    if (pqsVarD0 != null) {
                        k3h0Var = k3h0Var2;
                        k3h0Var.c(pqsVarD0, k9sVar2.s);
                    } else {
                        k3h0Var = k3h0Var2;
                    }
                    if (r9sVar.s != null) {
                        dwm0 dwm0VarW = ewm0.w(r9sVar.I, k9sVar2.s);
                        if (l18 != null) {
                            jLongValue16 = l18.longValue();
                        } else {
                            jLongValue16 = -1;
                        }
                        k3h0Var.d(dwm0VarW, jLongValue16);
                        pqsVar = null;
                    } else {
                        if (l18 != null) {
                            jLongValue11 = l18.longValue();
                        } else {
                            jLongValue11 = -1;
                        }
                        pqsVar = null;
                        k3h0Var.d(null, jLongValue11);
                    }
                    l19 = qdl0Var2.e;
                    z7 = qdl0Var2.d;
                    if (l19 != null) {
                        long jLongValue26 = l19.longValue();
                        this.n = vneVar;
                        this.i = r9sVar;
                        this.j = k9sVar2;
                        this.k = pqsVar;
                        this.l = arrayList6;
                        this.m = (byte) 4;
                        if (list4 != 0) {
                            arrayList9 = new ArrayList();
                            it3 = list4.iterator();
                            while (it3.hasNext()) {
                                awm0 awm0Var2 = (awm0) it3.next();
                                String strA = us3Var.a();
                                if (ukl0Var2 != null) {
                                    jLongValue15 = -1;
                                } else {
                                    jLongValue15 = -1;
                                }
                                awm0Var2.getClass();
                                list6 = awm0Var2.g;
                                Long l32 = awm0Var2.b;
                                if (list6 != null) {
                                    z8 = z7;
                                    xm7Var = null;
                                } else {
                                    z8 = z7;
                                    xm7Var = null;
                                }
                                if (xm7Var != null) {
                                    arrayList9.add(xm7Var);
                                }
                                it3 = it3;
                                z7 = z8;
                            }
                        } else {
                            arrayList9 = iun.f15405a;
                        }
                        objA3 = tdl0Var.k.b(jLongValue26).a(arrayList9, this);
                        wneVar2 = wne.f39444a;
                        if (objA3 != wneVar2) {
                            objA3 = Unit.f46060a;
                        }
                        if (objA3 != wneVar2) {
                            objA3 = Unit.f46060a;
                        }
                        if (objA3 != wneVar3) {
                            r9sVar2 = r9sVar;
                            arrayList8 = arrayList6;
                            pqsVar2 = null;
                        }
                    } else {
                        pqsVar2 = pqsVar;
                        this.n = pqsVar2;
                        this.i = r9sVar;
                        this.j = k9sVar2;
                        this.k = pqsVar2;
                        this.l = arrayList6;
                        this.m = (byte) 5;
                        list5 = r9sVar.J;
                        if (list5 != null) {
                            arrayList7 = new ArrayList(r3d.q(list5, 10));
                            for (dv20 dv20Var : list5) {
                                if (l18 != null) {
                                    jLongValue13 = l18.longValue();
                                } else {
                                    jLongValue13 = -1;
                                }
                                String strA2 = us3Var.a();
                                if (ukl0Var2 != null) {
                                    jLongValue14 = -1;
                                } else {
                                    jLongValue14 = -1;
                                }
                                arrayList7.add(cfx0.P(dv20Var, z7, jLongValue13, strA2, jLongValue14));
                            }
                        } else {
                            arrayList7 = iun.f15405a;
                        }
                        m530 m530Var = tdl0Var.j;
                        if (l18 != null) {
                            jLongValue12 = l18.longValue();
                        } else {
                            jLongValue12 = -1;
                        }
                        objA2 = m530Var.c(jLongValue12).a(arrayList7, this);
                        wneVar = wne.f39444a;
                        if (objA2 != wneVar) {
                            objA2 = Unit.f46060a;
                        }
                        if (objA2 != wneVar) {
                            objA2 = Unit.f46060a;
                        }
                        if (objA2 != wneVar3) {
                            r9sVar2 = r9sVar;
                            arrayList8 = arrayList6;
                        }
                    }
                }
                return wneVar3;
            }
            if (b == 3) {
                pqs pqsVar3 = this.k;
                k9s k9sVar3 = this.j;
                r9s r9sVar3 = this.i;
                z1x.P(obj);
                us3Var = us3Var;
                k3h0Var2 = k3h0Var2;
                pqsVarD0 = pqsVar3;
                qdl0Var = qdl0Var;
                k9sVar2 = k9sVar3;
                r9sVar = r9sVar3;
                nf6 nf6Var2 = tdl0Var.n;
                bool9 = r9sVar.K;
                ukl0Var2 = r9sVar.p;
                l16 = r9sVar.f30100a;
                list4 = r9sVar.m;
                if (bool9 != null) {
                    zBooleanValue8 = bool9.booleanValue();
                } else {
                    zBooleanValue8 = false;
                }
                p7m0Var = nf6Var2.f23420a;
                do {
                    value = p7m0Var.getValue();
                } while (!p7m0Var.m(value, Boolean.valueOf(zBooleanValue8)));
                qdl0 qdl0Var3 = qdl0Var;
                z6 = qdl0Var3.d;
                arrayList6 = new ArrayList();
                l17 = r9sVar.e;
                if (list4 != null) {
                    while (r14.hasNext()) {
                        boolean z15 = z6;
                        bool10 = awm0Var.f;
                        Long l33 = l16;
                        num11 = awm0Var.e;
                        l22 = awm0Var.b;
                        bool11 = Boolean.TRUE;
                        if (Intrinsics.d(bool10, bool11)) {
                            if (l17 != null) {
                                long jLongValue27 = l17.longValue();
                                if (l22 != null) {
                                    jLongValue22 = l22.longValue();
                                } else {
                                    jLongValue22 = -1;
                                }
                                arrayList6.add(new rvm0(jLongValue22, jLongValue27, awm0Var.f1582a));
                            }
                        } else if (!(CollectionsKt.firstOrNull(arrayList6) instanceof tvm0)) {
                            if (l22 != null) {
                                jLongValue20 = l22.longValue();
                            } else {
                                jLongValue20 = -1;
                            }
                            if (l22 != null) {
                                jLongValue21 = l22.longValue();
                            } else {
                                jLongValue21 = -1;
                            }
                            String str79 = awm0Var.f1582a;
                            if (num11 != null) {
                                iIntValue7 = num11.intValue();
                            } else {
                                iIntValue7 = 1;
                            }
                            arrayList6.add(0, new tvm0(str79, jLongValue20, jLongValue21, iIntValue7));
                        } else if (l17 != null) {
                            jLongValue17 = l17.longValue();
                            if (Intrinsics.d(awm0Var.h, bool11)) {
                                if (l22 != null) {
                                    jLongValue19 = l22.longValue();
                                } else {
                                    jLongValue19 = -1;
                                }
                                String str710 = awm0Var.f1582a;
                                if (num11 != null) {
                                    iIntValue6 = num11.intValue();
                                } else {
                                    iIntValue6 = 1;
                                }
                                vvm0Var = new uvm0(str710, jLongValue19, jLongValue17, iIntValue6);
                            } else {
                                if (l22 != null) {
                                    jLongValue18 = l22.longValue();
                                } else {
                                    jLongValue18 = -1;
                                }
                                String str711 = awm0Var.f1582a;
                                if (num11 != null) {
                                    iIntValue5 = num11.intValue();
                                } else {
                                    iIntValue5 = 1;
                                }
                                vvm0Var = new vvm0(str711, jLongValue18, jLongValue17, iIntValue5);
                            }
                            arrayList6.add(vvm0Var);
                        }
                        z6 = z15;
                        l16 = l33;
                    }
                }
                boolean z16 = z6;
                l18 = l16;
                if (!this.t && Intrinsics.d(r9sVar.D, Boolean.TRUE) && !z16) {
                    arrayList6.add(1, new svm0(-746L, l17 != null ? l17.longValue() : -1L));
                }
                tdl0Var.d.b(arrayList6);
                if (pqsVarD0 != null) {
                    k3h0Var = k3h0Var2;
                    k3h0Var.c(pqsVarD0, k9sVar2.s);
                } else {
                    k3h0Var = k3h0Var2;
                }
                if (r9sVar.s != null) {
                    dwm0 dwm0VarW2 = ewm0.w(r9sVar.I, k9sVar2.s);
                    if (l18 != null) {
                        jLongValue16 = l18.longValue();
                    } else {
                        jLongValue16 = -1;
                    }
                    k3h0Var.d(dwm0VarW2, jLongValue16);
                    pqsVar = null;
                } else {
                    if (l18 != null) {
                        jLongValue11 = l18.longValue();
                    } else {
                        jLongValue11 = -1;
                    }
                    pqsVar = null;
                    k3h0Var.d(null, jLongValue11);
                }
                l19 = qdl0Var3.e;
                z7 = qdl0Var3.d;
                if (l19 != null) {
                    long jLongValue28 = l19.longValue();
                    this.n = vneVar;
                    this.i = r9sVar;
                    this.j = k9sVar2;
                    this.k = pqsVar;
                    this.l = arrayList6;
                    this.m = (byte) 4;
                    if (list4 != 0) {
                        arrayList9 = new ArrayList();
                        it3 = list4.iterator();
                        while (it3.hasNext()) {
                            awm0 awm0Var3 = (awm0) it3.next();
                            String strA3 = us3Var.a();
                            if (ukl0Var2 != null || (l21 = ukl0Var2.f35833a) == null) {
                                jLongValue15 = -1;
                            } else {
                                jLongValue15 = l21.longValue();
                            }
                            awm0Var3.getClass();
                            list6 = awm0Var3.g;
                            Long l34 = awm0Var3.b;
                            if (list6 != null || list6.isEmpty() || l34 == null) {
                                z8 = z7;
                                xm7Var = null;
                            } else {
                                z8 = z7;
                                ArrayList arrayList12 = new ArrayList(r3d.q(list6, 10));
                                Iterator it7 = list6.iterator();
                                while (it7.hasNext()) {
                                    arrayList12.add(cfx0.P((dv20) it7.next(), z8, l34.longValue(), strA3, jLongValue15));
                                }
                                xm7Var = new xm7(l34.longValue(), awm0Var3.f1582a, arrayList12);
                            }
                            if (xm7Var != null) {
                                arrayList9.add(xm7Var);
                            }
                            it3 = it3;
                            z7 = z8;
                        }
                    } else {
                        arrayList9 = iun.f15405a;
                    }
                    objA3 = tdl0Var.k.b(jLongValue28).a(arrayList9, this);
                    wneVar2 = wne.f39444a;
                    if (objA3 != wneVar2) {
                        objA3 = Unit.f46060a;
                    }
                    if (objA3 != wneVar2) {
                        objA3 = Unit.f46060a;
                    }
                    if (objA3 != wneVar3) {
                        r9sVar2 = r9sVar;
                        arrayList8 = arrayList6;
                        pqsVar2 = null;
                    }
                } else {
                    pqsVar2 = pqsVar;
                    this.n = pqsVar2;
                    this.i = r9sVar;
                    this.j = k9sVar2;
                    this.k = pqsVar2;
                    this.l = arrayList6;
                    this.m = (byte) 5;
                    list5 = r9sVar.J;
                    if (list5 != null) {
                        arrayList7 = new ArrayList(r3d.q(list5, 10));
                        while (r2.hasNext()) {
                            if (l18 != null) {
                                jLongValue13 = l18.longValue();
                            } else {
                                jLongValue13 = -1;
                            }
                            String strA4 = us3Var.a();
                            if (ukl0Var2 != null || (l20 = ukl0Var2.f35833a) == null) {
                                jLongValue14 = -1;
                            } else {
                                jLongValue14 = l20.longValue();
                            }
                            arrayList7.add(cfx0.P(dv20Var, z7, jLongValue13, strA4, jLongValue14));
                        }
                    } else {
                        arrayList7 = iun.f15405a;
                    }
                    m530 m530Var2 = tdl0Var.j;
                    if (l18 != null) {
                        jLongValue12 = l18.longValue();
                    } else {
                        jLongValue12 = -1;
                    }
                    objA2 = m530Var2.c(jLongValue12).a(arrayList7, this);
                    wneVar = wne.f39444a;
                    if (objA2 != wneVar) {
                        objA2 = Unit.f46060a;
                    }
                    if (objA2 != wneVar) {
                        objA2 = Unit.f46060a;
                    }
                    if (objA2 != wneVar3) {
                        r9sVar2 = r9sVar;
                        arrayList8 = arrayList6;
                    }
                }
                return wneVar3;
            }
            if (b == 4) {
                arrayList8 = this.l;
                k9sVar2 = this.j;
                r9sVar2 = this.i;
                z1x.P(obj);
                pqsVar2 = null;
            } else {
                if (b != 5) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                arrayList8 = this.l;
                k9sVar2 = this.j;
                r9sVar2 = this.i;
                z1x.P(obj);
                pqsVar2 = null;
            }
        }
        k9s k9sVar4 = k9sVar2;
        list7 = r9sVar2.L;
        if (arrayList8 != null || !arrayList8.isEmpty()) {
            it4 = arrayList8.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    z9 = false;
                    break;
                }
                if (((xvm0) it4.next()) instanceof uvm0) {
                    z9 = true;
                    break;
                }
            }
        } else {
            z9 = false;
            break;
        }
        if (list7 != null) {
            arrayList10 = new ArrayList();
            for (ms20 ms20Var : list7) {
                ms20Var.getClass();
                l23 = ms20Var.f22299a;
                String str80 = ms20Var.b;
                if (l23 != null || str80 == null) {
                    is20Var = pqsVar2;
                } else {
                    is20Var = new is20(l23.longValue(), str80);
                }
                if (is20Var != null) {
                    arrayList10.add(is20Var);
                }
            }
        } else {
            arrayList10 = iun.f15405a;
        }
        arrayListL = q3d.l(gs20.f11808a);
        if (z9) {
            arrayListL.add(hs20.f13560a);
        }
        arrayListL.addAll(arrayList10);
        yr20 yr20Var = tdl0Var.m;
        yr20Var.getClass();
        p7m0Var2 = yr20Var.f43101a;
        do {
            value2 = p7m0Var2.getValue();
        } while (!p7m0Var2.m(value2, arrayListL));
        return k9sVar4;
        r9sVar = (r9s) ((dx5) objA).a();
        he1 he1Var = tdl0Var.f33774a;
        this.n = vneVar;
        this.i = r9sVar;
        this.m = (byte) 2;
        objE = he1Var.e(this);
        if (objE != wneVar3) {
            List list18 = (List) objE;
            z = qdl0Var.d;
            r9sVar.getClass();
            b5h0Var = r9sVar.k;
            list18.getClass();
            h380Var = r9sVar.n;
            q1v0Var = r9sVar.F;
            lbrVar = r9sVar.j;
            gmzVar = r9sVar.i;
            oem0Var = r9sVar.C;
            ukl0Var = r9sVar.p;
            h380Var2 = r9sVar.o;
            if (h380Var != null) {
                listB = h380Var.b();
            } else {
                listB = null;
            }
            if (listB == null) {
                listB = iun.f15405a;
            }
            if (h380Var2 != null) {
                listB2 = h380Var2.b();
            } else {
                listB2 = null;
            }
            if (listB2 == null) {
                listB2 = iun.f15405a;
            }
            l = r9sVar.e;
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = 0;
            }
            l2 = r9sVar.c;
            if (l2 != null) {
                jLongValue2 = l2.longValue();
            } else {
                jLongValue2 = 0;
            }
            if (h380Var != null) {
                listB3 = iun.f15405a;
            } else {
                listB3 = iun.f15405a;
            }
            List list19 = listB3;
            if (h380Var2 != null) {
                listB4 = iun.f15405a;
            } else {
                listB4 = iun.f15405a;
            }
            List list110 = listB4;
            String str610 = r9sVar.f;
            str = r9sVar.g;
            if (str == null) {
                str = "";
            }
            String str611 = str;
            if (oem0Var != null) {
                str2 = oem0Var.f25130a;
            } else {
                str2 = null;
            }
            if (str2 == null) {
                str2 = "";
            }
            str3 = str2;
            if (oem0Var != null) {
                str4 = str3;
                zBooleanValue = false;
            } else {
                str4 = str3;
                zBooleanValue = false;
            }
            if (oem0Var != null) {
                str5 = "";
                zBooleanValue2 = false;
            } else {
                str5 = "";
                zBooleanValue2 = false;
            }
            str6 = str5;
            if (gmzVar != null) {
                str7 = gmzVar.b;
            } else {
                str7 = null;
            }
            if (str7 == null) {
                str7 = str6;
            }
            String str612 = str7;
            if (gmzVar != null) {
                str8 = gmzVar.c;
            } else {
                str8 = null;
            }
            if (str8 == null) {
                str8 = str6;
            }
            String str712 = str8;
            if (gmzVar != null) {
                str9 = gmzVar.d;
            } else {
                str9 = null;
            }
            if (str9 == null) {
                str9 = str6;
            }
            if (lbrVar != null) {
                str39 = lbrVar.f19764a;
                if (str39 == null) {
                    str40 = str6;
                } else {
                    str40 = str39;
                }
                qt00Var2 = lbrVar.e;
                if (qt00Var2 != null) {
                    str41 = qt00Var2.f29277a;
                } else {
                    str41 = null;
                }
                if (str41 == null) {
                    str42 = str6;
                } else {
                    str42 = str41;
                }
                if (qt00Var2 != null) {
                    str43 = qt00Var2.e;
                } else {
                    str43 = null;
                }
                if (str43 == null) {
                    str44 = str6;
                } else {
                    str44 = str43;
                }
                str45 = lbrVar.b;
                if (str45 == null) {
                    str46 = str6;
                } else {
                    str46 = str45;
                }
                str47 = lbrVar.c;
                if (str47 == null) {
                    str48 = str6;
                } else {
                    str48 = str47;
                }
                cvh0Var = lbrVar.d;
                if (cvh0Var != null) {
                    str49 = cvh0Var.f5028a;
                } else {
                    str49 = null;
                }
                if (str49 == null) {
                    str50 = str6;
                } else {
                    str50 = str49;
                }
                if (cvh0Var != null) {
                    str51 = cvh0Var.b;
                } else {
                    str51 = null;
                }
                if (str51 == null) {
                    str52 = str6;
                } else {
                    str52 = str51;
                }
                if (qt00Var2 != null) {
                    str53 = qt00Var2.b;
                } else {
                    str53 = null;
                }
                if (str53 == null) {
                    str54 = str6;
                } else {
                    str54 = str53;
                }
                t1v0Var = lbrVar.f;
                if (t1v0Var != null) {
                    str55 = t1v0Var.f33187a;
                } else {
                    str55 = null;
                }
                if (str55 == null) {
                    str56 = str6;
                } else {
                    str56 = str55;
                }
                if (qt00Var2 != null) {
                    str57 = qt00Var2.c;
                } else {
                    str57 = null;
                }
                if (str57 == null) {
                    str58 = str6;
                } else {
                    str58 = str57;
                }
                if (t1v0Var != null) {
                    str59 = t1v0Var.b;
                } else {
                    str59 = null;
                }
                if (str59 == null) {
                    str60 = str6;
                } else {
                    str60 = str59;
                }
                if (t1v0Var != null) {
                    str61 = t1v0Var.c;
                } else {
                    str61 = null;
                }
                if (str61 == null) {
                    str62 = str6;
                } else {
                    str62 = str61;
                }
                if (t1v0Var != null) {
                    str63 = t1v0Var.d;
                } else {
                    str63 = null;
                }
                if (str63 == null) {
                    str64 = str6;
                } else {
                    str64 = str63;
                }
                if (t1v0Var != null) {
                    str65 = t1v0Var.e;
                } else {
                    str65 = null;
                }
                if (str65 == null) {
                    str66 = str6;
                } else {
                    str66 = str65;
                }
                ma30Var = new ma30(str40, str42, str46, str48, str50, str52, str44, str54, str56, str58, str60, str62, str64, str66);
            } else {
                ma30Var = new ma30("", "", "", "", "", "", "", "", "", "", "", "", "", "");
            }
            if (q1v0Var != null) {
                if (h380Var != null) {
                    str10 = h380Var.f12372a;
                } else {
                    str10 = null;
                }
                if (str10 == null) {
                    str10 = str6;
                }
                string = StringsKt.u0(str10).toString();
            } else {
                if (h380Var != null) {
                    str10 = h380Var.f12372a;
                } else {
                    str10 = null;
                }
                if (str10 == null) {
                    str10 = str6;
                }
                string = StringsKt.u0(str10).toString();
            }
            String str713 = string;
            if (q1v0Var != null) {
                if (h380Var2 != null) {
                    str11 = h380Var2.f12372a;
                } else {
                    str11 = null;
                }
                if (str11 == null) {
                    str11 = str6;
                }
                string2 = StringsKt.u0(str11).toString();
            } else {
                if (h380Var2 != null) {
                    str11 = h380Var2.f12372a;
                } else {
                    str11 = null;
                }
                if (str11 == null) {
                    str11 = str6;
                }
                string2 = StringsKt.u0(str11).toString();
            }
            if (h380Var != null) {
                listA = h380Var.a();
            } else {
                listA = null;
            }
            if (listA == null) {
                listA = iun.f15405a;
            }
            List list111 = listA;
            if (h380Var2 != null) {
                listA2 = h380Var2.a();
            } else {
                listA2 = null;
            }
            if (listA2 == null) {
                listA2 = iun.f15405a;
            }
            List list112 = listA2;
            if (ukl0Var != null) {
                jLongValue3 = 0;
            } else {
                jLongValue3 = 0;
            }
            if (ukl0Var != null) {
                jLongValue4 = 0;
            } else {
                jLongValue4 = 0;
            }
            bool = r9sVar.t;
            if (bool != null) {
                zBooleanValue3 = bool.booleanValue();
            } else {
                zBooleanValue3 = false;
            }
            str12 = r9sVar.u;
            if (str12 == null) {
                str13 = str6;
            } else {
                str13 = str12;
            }
            fxsVar = r9sVar.v;
            if (fxsVar != null) {
                str14 = fxsVar.f10325a;
            } else {
                str14 = null;
            }
            if (str14 == null) {
                str15 = str6;
            } else {
                str15 = str14;
            }
            l3 = r9sVar.q;
            if (l3 != null) {
                jLongValue5 = l3.longValue();
            } else {
                jLongValue5 = 0;
            }
            it = list18.iterator();
            while (true) {
                if (it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                h5l0Var2 = (h5l0) next;
                if (ukl0Var != null) {
                    long j5 = h5l0Var2.f12486a;
                    l13 = ukl0Var.f35833a;
                    if (l13 != null) {
                        break;
                        break;
                    }
                    continue;
                }
            }
            h5l0Var = (h5l0) next;
            if (h5l0Var != null) {
                str16 = h5l0Var.b;
            } else {
                str16 = null;
            }
            if (str16 == null) {
                str17 = str6;
            } else {
                str17 = str16;
            }
            if (gmzVar != null) {
                jLongValue6 = 0;
            } else {
                jLongValue6 = 0;
            }
            list = r9sVar.A;
            if (list != null) {
                arrayList = new ArrayList(r3d.q(list, 10));
                while (r2.hasNext()) {
                    bo2Var.getClass();
                    p380Var = bo2Var.c;
                    p380Var2 = bo2Var.b;
                    if (z) {
                        if (p380Var2 != null) {
                            str33 = p380Var2.b;
                        } else {
                            str33 = null;
                        }
                        if (str33 == null) {
                            str34 = str6;
                        } else {
                            str34 = str33;
                        }
                        if (p380Var2 != null) {
                            iIntValue3 = 0;
                        } else {
                            iIntValue3 = 0;
                        }
                        String strValueOf3 = String.valueOf(iIntValue3);
                        if (p380Var2 != null) {
                            str35 = p380Var2.c;
                        } else {
                            str35 = null;
                        }
                        if (str35 == null) {
                            str35 = str6;
                        }
                        List list113 = u0d.f34849a;
                        if (u0d.c(str35)) {
                            strN3 = str6;
                        } else {
                            strN3 = ohs0.n(ujn.h, str35);
                        }
                        if (p380Var != null) {
                            str36 = p380Var.b;
                        } else {
                            str36 = null;
                        }
                        if (str36 == null) {
                            str37 = str6;
                        } else {
                            str37 = str36;
                        }
                        if (p380Var != null) {
                            iIntValue4 = 0;
                        } else {
                            iIntValue4 = 0;
                        }
                        String strValueOf4 = String.valueOf(iIntValue4);
                        if (p380Var != null) {
                            str38 = p380Var.c;
                        } else {
                            str38 = null;
                        }
                        if (str38 == null) {
                            str38 = str6;
                        }
                        if (u0d.c(str38)) {
                            strN4 = str6;
                        } else {
                            strN4 = ohs0.n(ujn.h, str38);
                        }
                        bswVar = new bsw(str34, strValueOf3, strN3, str37, strValueOf4, strN4, 0L);
                    } else {
                        if (p380Var2 != null) {
                            str27 = p380Var2.b;
                        } else {
                            str27 = null;
                        }
                        if (str27 == null) {
                            str28 = str6;
                        } else {
                            str28 = str27;
                        }
                        if (p380Var2 != null) {
                            str29 = p380Var2.c;
                        } else {
                            str29 = null;
                        }
                        if (str29 == null) {
                            str29 = str6;
                        }
                        List list114 = u0d.f34849a;
                        if (u0d.c(str29)) {
                            strN = str6;
                        } else {
                            strN = ohs0.n(ujn.h, str29);
                        }
                        if (p380Var != null) {
                            str30 = p380Var.b;
                        } else {
                            str30 = null;
                        }
                        if (str30 == null) {
                            str31 = str6;
                        } else {
                            str31 = str30;
                        }
                        if (p380Var != null) {
                            str32 = p380Var.c;
                        } else {
                            str32 = null;
                        }
                        if (str32 == null) {
                            str32 = str6;
                        }
                        if (u0d.c(str32)) {
                            strN2 = str6;
                        } else {
                            strN2 = ohs0.n(ujn.h, str32);
                        }
                        l11 = bo2Var.f2911a;
                        if (l11 != null) {
                            jLongValue10 = l11.longValue();
                        } else {
                            jLongValue10 = 0;
                        }
                        bswVar = new bsw(str28, "", strN, str31, "", strN2, jLongValue10);
                    }
                    arrayList.add(bswVar);
                }
            } else {
                arrayList = iun.f15405a;
            }
            ?? r83 = arrayList;
            num = r9sVar.z;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            Boolean bool13 = r9sVar.r;
            bool2 = Boolean.TRUE;
            boolean zD3 = Intrinsics.d(bool13, bool2);
            bool3 = r9sVar.B;
            if (bool3 != null) {
                zBooleanValue4 = bool3.booleanValue();
            } else {
                zBooleanValue4 = false;
            }
            if (oem0Var != null) {
                iIntValue2 = 0;
            } else {
                iIntValue2 = 0;
            }
            str18 = r9sVar.d;
            if (str18 == null) {
                str19 = str6;
            } else {
                str19 = str18;
            }
            if (Intrinsics.d(r9sVar.h, bool2)) {
                s9sVar = s9s.f31862a;
            } else if (listB2.isEmpty()) {
                s9sVar = s9s.d;
            } else if (listB.size() != 2) {
                s9sVar = s9s.b;
            } else {
                s9sVar = s9s.b;
            }
            s9s s9sVar3 = s9sVar;
            l4 = r9sVar.w;
            l5 = r9sVar.E;
            if (l5 != null) {
                jLongValue7 = l5.longValue();
            } else {
                jLongValue7 = -1;
            }
            if (lbrVar != null) {
                lT0 = null;
            } else {
                lT0 = null;
            }
            boolean zD4 = Intrinsics.d(r9sVar.y, bool2);
            if (b5h0Var != null) {
                jLongValue8 = 0;
            } else {
                jLongValue8 = 0;
            }
            if (b5h0Var != null) {
                z2 = false;
            } else {
                z2 = false;
            }
            if (b5h0Var != null) {
                zBooleanValue5 = false;
            } else {
                zBooleanValue5 = false;
            }
            if (b5h0Var != null) {
                str20 = b5h0Var.k;
            } else {
                str20 = null;
            }
            if (str20 == null) {
                str21 = str6;
            } else {
                str21 = str20;
            }
            if (b5h0Var != null) {
                arrayList2 = iun.f15405a;
            } else {
                arrayList2 = iun.f15405a;
            }
            ?? r75 = arrayList2;
            if (b5h0Var != null) {
                l6 = l4;
                list2 = iun.f15405a;
            } else {
                l6 = l4;
                list2 = iun.f15405a;
            }
            List list115 = list2;
            if (b5h0Var != null) {
                zBooleanValue6 = false;
            } else {
                zBooleanValue6 = false;
            }
            if (b5h0Var != null) {
                str22 = str6;
            } else {
                str22 = str6;
            }
            l7 = r9sVar.x;
            if (r9sVar.s == null) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (ukl0Var != null) {
                jLongValue9 = 0;
            } else {
                jLongValue9 = 0;
            }
            pqs pqsVarD2 = xkb.d0(b5h0Var, jLongValue9);
            if (b5h0Var != null) {
                arrayList3 = iun.f15405a;
            } else {
                arrayList3 = iun.f15405a;
            }
            ?? r710 = arrayList3;
            qud qudVar2 = boh.b;
            if (gmzVar != null) {
                num2 = gmzVar.e;
            } else {
                num2 = null;
            }
            qudVar2.getClass();
            boh bohVarC2 = qud.c(num2);
            if (this.s) {
                str22 = str22;
                l7 = l7;
                vzj0Var = null;
            } else {
                str22 = str22;
                l7 = l7;
                vzj0Var = null;
            }
            bool4 = r9sVar.H;
            if (bool4 != null) {
                zBooleanValue7 = bool4.booleanValue();
            } else {
                zBooleanValue7 = false;
            }
            k9sVar = new k9s(jLongValue, jLongValue2, list19, list110, str610, str611, str4, zBooleanValue, zBooleanValue2, str612, str712, str9, ma30Var, str22, str713, string2, list111, list112, jLongValue3, jLongValue4, zBooleanValue3, zD4, str13, str15, jLongValue5, z, str17, jLongValue6, iIntValue, zD3, iIntValue2, str19, s9sVar3, jLongValue7, lT0, jLongValue8, z2, zBooleanValue5, str21, r75, list115, zBooleanValue6, z3, pqsVarD2, r710, bohVarC2, zBooleanValue7, r83, zBooleanValue4, l6, l7, vzj0Var);
            pqsVarD0 = xkb.d0(b5h0Var, jLongValue3);
            nqj0Var = r9sVar.l;
            if (nqj0Var != null) {
                if (b5h0Var != null) {
                    num3 = b5h0Var.g;
                } else {
                    num3 = null;
                }
                xc90Var = bd90Var.f2388a;
                if (xc90Var != null) {
                    num4 = xc90Var.f40635a;
                } else {
                    num4 = null;
                }
                if (xc90Var != null) {
                    num5 = xc90Var.b;
                } else {
                    num5 = null;
                }
                iterable = bd90Var.b;
                if (iterable == null) {
                    iterable = iun.f15405a;
                }
                linkedHashMap = new LinkedHashMap();
                while (r3.hasNext()) {
                    num6 = ad90Var.f667a;
                    arrayList4 = linkedHashMap.get(num6);
                    if (arrayList4 == null) {
                        arrayList4 = new ArrayList();
                        linkedHashMap.put(num6, arrayList4);
                    }
                    List list116 = (List) arrayList4;
                    if (Intrinsics.d(ad90Var.b, Boolean.TRUE)) {
                        rc90Var = rc90.f30227a;
                    } else {
                        rc90Var = rc90.b;
                    }
                    list116.add(rc90Var);
                }
                cd90VarZ = pzw.z(num4, num5, linkedHashMap, num3);
                j = k9sVar.s;
                if (j != 1) {
                    tdl0Var.h.a(cd90VarZ);
                } else {
                    tdl0Var.h.a(cd90VarZ);
                }
            }
            i9s i9sVar2 = tdl0Var.e;
            this.n = vneVar;
            this.i = r9sVar;
            this.j = k9sVar;
            this.k = pqsVarD0;
            this.m = (byte) 3;
            i9sVar2.f14403a.o(null, k9sVar);
            unit = Unit.f46060a;
            wne wneVar5 = wne.f39444a;
            if (unit != wneVar3) {
                k9sVar2 = k9sVar;
                nf6 nf6Var3 = tdl0Var.n;
                bool9 = r9sVar.K;
                ukl0Var2 = r9sVar.p;
                l16 = r9sVar.f30100a;
                list4 = r9sVar.m;
                if (bool9 != null) {
                    zBooleanValue8 = bool9.booleanValue();
                } else {
                    zBooleanValue8 = false;
                }
                p7m0Var = nf6Var3.f23420a;
                do {
                    value = p7m0Var.getValue();
                } while (!p7m0Var.m(value, Boolean.valueOf(zBooleanValue8)));
                qdl0 qdl0Var4 = qdl0Var;
                z6 = qdl0Var4.d;
                arrayList6 = new ArrayList();
                l17 = r9sVar.e;
                if (list4 != null) {
                    while (r14.hasNext()) {
                        boolean z17 = z6;
                        bool10 = awm0Var.f;
                        Long l35 = l16;
                        num11 = awm0Var.e;
                        l22 = awm0Var.b;
                        bool11 = Boolean.TRUE;
                        if (Intrinsics.d(bool10, bool11)) {
                            if (l17 != null) {
                                long jLongValue29 = l17.longValue();
                                if (l22 != null) {
                                    jLongValue22 = l22.longValue();
                                } else {
                                    jLongValue22 = -1;
                                }
                                arrayList6.add(new rvm0(jLongValue22, jLongValue29, awm0Var.f1582a));
                            }
                        } else if (!(CollectionsKt.firstOrNull(arrayList6) instanceof tvm0)) {
                            if (l22 != null) {
                                jLongValue20 = l22.longValue();
                            } else {
                                jLongValue20 = -1;
                            }
                            if (l22 != null) {
                                jLongValue21 = l22.longValue();
                            } else {
                                jLongValue21 = -1;
                            }
                            String str714 = awm0Var.f1582a;
                            if (num11 != null) {
                                iIntValue7 = num11.intValue();
                            } else {
                                iIntValue7 = 1;
                            }
                            arrayList6.add(0, new tvm0(str714, jLongValue20, jLongValue21, iIntValue7));
                        } else if (l17 != null) {
                            jLongValue17 = l17.longValue();
                            if (Intrinsics.d(awm0Var.h, bool11)) {
                                if (l22 != null) {
                                    jLongValue19 = l22.longValue();
                                } else {
                                    jLongValue19 = -1;
                                }
                                String str715 = awm0Var.f1582a;
                                if (num11 != null) {
                                    iIntValue6 = num11.intValue();
                                } else {
                                    iIntValue6 = 1;
                                }
                                vvm0Var = new uvm0(str715, jLongValue19, jLongValue17, iIntValue6);
                            } else {
                                if (l22 != null) {
                                    jLongValue18 = l22.longValue();
                                } else {
                                    jLongValue18 = -1;
                                }
                                String str716 = awm0Var.f1582a;
                                if (num11 != null) {
                                    iIntValue5 = num11.intValue();
                                } else {
                                    iIntValue5 = 1;
                                }
                                vvm0Var = new vvm0(str716, jLongValue18, jLongValue17, iIntValue5);
                            }
                            arrayList6.add(vvm0Var);
                        }
                        z6 = z17;
                        l16 = l35;
                    }
                }
                boolean z18 = z6;
                l18 = l16;
                if (!this.t) {
                }
                tdl0Var.d.b(arrayList6);
                if (pqsVarD0 != null) {
                    k3h0Var = k3h0Var2;
                    k3h0Var.c(pqsVarD0, k9sVar2.s);
                } else {
                    k3h0Var = k3h0Var2;
                }
                if (r9sVar.s != null) {
                    dwm0 dwm0VarW3 = ewm0.w(r9sVar.I, k9sVar2.s);
                    if (l18 != null) {
                        jLongValue16 = l18.longValue();
                    } else {
                        jLongValue16 = -1;
                    }
                    k3h0Var.d(dwm0VarW3, jLongValue16);
                    pqsVar = null;
                } else {
                    if (l18 != null) {
                        jLongValue11 = l18.longValue();
                    } else {
                        jLongValue11 = -1;
                    }
                    pqsVar = null;
                    k3h0Var.d(null, jLongValue11);
                }
                l19 = qdl0Var4.e;
                z7 = qdl0Var4.d;
                if (l19 != null) {
                    long jLongValue210 = l19.longValue();
                    this.n = vneVar;
                    this.i = r9sVar;
                    this.j = k9sVar2;
                    this.k = pqsVar;
                    this.l = arrayList6;
                    this.m = (byte) 4;
                    if (list4 != 0) {
                        arrayList9 = new ArrayList();
                        it3 = list4.iterator();
                        while (it3.hasNext()) {
                            awm0 awm0Var4 = (awm0) it3.next();
                            String strA5 = us3Var.a();
                            if (ukl0Var2 != null) {
                                jLongValue15 = -1;
                            } else {
                                jLongValue15 = -1;
                            }
                            awm0Var4.getClass();
                            list6 = awm0Var4.g;
                            Long l36 = awm0Var4.b;
                            if (list6 != null) {
                                z8 = z7;
                                xm7Var = null;
                            } else {
                                z8 = z7;
                                xm7Var = null;
                            }
                            if (xm7Var != null) {
                                arrayList9.add(xm7Var);
                            }
                            it3 = it3;
                            z7 = z8;
                        }
                    } else {
                        arrayList9 = iun.f15405a;
                    }
                    objA3 = tdl0Var.k.b(jLongValue210).a(arrayList9, this);
                    wneVar2 = wne.f39444a;
                    if (objA3 != wneVar2) {
                        objA3 = Unit.f46060a;
                    }
                    if (objA3 != wneVar2) {
                        objA3 = Unit.f46060a;
                    }
                    if (objA3 != wneVar3) {
                        r9sVar2 = r9sVar;
                        arrayList8 = arrayList6;
                        pqsVar2 = null;
                        k9s k9sVar5 = k9sVar2;
                        list7 = r9sVar2.L;
                        if (arrayList8 != null) {
                            it4 = arrayList8.iterator();
                            while (true) {
                                if (!it4.hasNext()) {
                                    z9 = false;
                                    break;
                                }
                                if (((xvm0) it4.next()) instanceof uvm0) {
                                    z9 = true;
                                    break;
                                }
                            }
                        } else {
                            it4 = arrayList8.iterator();
                            while (true) {
                                if (!it4.hasNext()) {
                                    z9 = false;
                                    break;
                                }
                                if (((xvm0) it4.next()) instanceof uvm0) {
                                    z9 = true;
                                    break;
                                }
                            }
                        }
                        if (list7 != null) {
                            arrayList10 = new ArrayList();
                            while (r0.hasNext()) {
                                ms20Var.getClass();
                                l23 = ms20Var.f22299a;
                                String str81 = ms20Var.b;
                                if (l23 != null) {
                                    is20Var = pqsVar2;
                                } else {
                                    is20Var = pqsVar2;
                                }
                                if (is20Var != null) {
                                    arrayList10.add(is20Var);
                                }
                            }
                        } else {
                            arrayList10 = iun.f15405a;
                        }
                        arrayListL = q3d.l(gs20.f11808a);
                        if (z9) {
                            arrayListL.add(hs20.f13560a);
                        }
                        arrayListL.addAll(arrayList10);
                        yr20 yr20Var2 = tdl0Var.m;
                        yr20Var2.getClass();
                        p7m0Var2 = yr20Var2.f43101a;
                        do {
                            value2 = p7m0Var2.getValue();
                        } while (!p7m0Var2.m(value2, arrayListL));
                        return k9sVar5;
                    }
                } else {
                    pqsVar2 = pqsVar;
                    this.n = pqsVar2;
                    this.i = r9sVar;
                    this.j = k9sVar2;
                    this.k = pqsVar2;
                    this.l = arrayList6;
                    this.m = (byte) 5;
                    list5 = r9sVar.J;
                    if (list5 != null) {
                        arrayList7 = new ArrayList(r3d.q(list5, 10));
                        while (r2.hasNext()) {
                            if (l18 != null) {
                                jLongValue13 = l18.longValue();
                            } else {
                                jLongValue13 = -1;
                            }
                            String strA6 = us3Var.a();
                            if (ukl0Var2 != null) {
                                jLongValue14 = -1;
                            } else {
                                jLongValue14 = -1;
                            }
                            arrayList7.add(cfx0.P(dv20Var, z7, jLongValue13, strA6, jLongValue14));
                        }
                    } else {
                        arrayList7 = iun.f15405a;
                    }
                    m530 m530Var3 = tdl0Var.j;
                    if (l18 != null) {
                        jLongValue12 = l18.longValue();
                    } else {
                        jLongValue12 = -1;
                    }
                    objA2 = m530Var3.c(jLongValue12).a(arrayList7, this);
                    wneVar = wne.f39444a;
                    if (objA2 != wneVar) {
                        objA2 = Unit.f46060a;
                    }
                    if (objA2 != wneVar) {
                        objA2 = Unit.f46060a;
                    }
                    if (objA2 != wneVar3) {
                        r9sVar2 = r9sVar;
                        arrayList8 = arrayList6;
                        k9s k9sVar6 = k9sVar2;
                        list7 = r9sVar2.L;
                        if (arrayList8 != null) {
                            it4 = arrayList8.iterator();
                            while (true) {
                                if (!it4.hasNext()) {
                                    z9 = false;
                                    break;
                                }
                                if (((xvm0) it4.next()) instanceof uvm0) {
                                    z9 = true;
                                    break;
                                }
                            }
                        } else {
                            it4 = arrayList8.iterator();
                            while (true) {
                                if (!it4.hasNext()) {
                                    z9 = false;
                                    break;
                                }
                                if (((xvm0) it4.next()) instanceof uvm0) {
                                    z9 = true;
                                    break;
                                }
                            }
                        }
                        if (list7 != null) {
                            arrayList10 = new ArrayList();
                            while (r0.hasNext()) {
                                ms20Var.getClass();
                                l23 = ms20Var.f22299a;
                                String str82 = ms20Var.b;
                                if (l23 != null) {
                                    is20Var = pqsVar2;
                                } else {
                                    is20Var = pqsVar2;
                                }
                                if (is20Var != null) {
                                    arrayList10.add(is20Var);
                                }
                            }
                        } else {
                            arrayList10 = iun.f15405a;
                        }
                        arrayListL = q3d.l(gs20.f11808a);
                        if (z9) {
                            arrayListL.add(hs20.f13560a);
                        }
                        arrayListL.addAll(arrayList10);
                        yr20 yr20Var3 = tdl0Var.m;
                        yr20Var3.getClass();
                        p7m0Var2 = yr20Var3.f43101a;
                        do {
                            value2 = p7m0Var2.getValue();
                        } while (!p7m0Var2.m(value2, arrayListL));
                        return k9sVar6;
                    }
                }
            }
        }
        return wneVar3;
    }
}
