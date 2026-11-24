.class public final La/br9;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/br9;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/kl5",
        "impl"
    }
    k = 0x1
    mv = {
        0x2,
        0x4,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final S1:La/kl5;

.field public static final synthetic U1:[La/iiy;


# instance fields
.field public K1:La/fiu0;

.field public L1:La/ii;

.field public M1:La/wdk0;

.field public final N1:La/kiu0;

.field public final O1:La/s0r;

.field public final P1:La/phf0;

.field public final Q1:La/cgx0;

.field public final R1:La/n0o0;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/br9;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/callback/impl/databinding/FragmentCallbackHistoryBinding;"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, La/j0d0;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    new-instance v2, La/ez40;

    .line 14
    .line 15
    const-string v3, "requestKey"

    .line 16
    .line 17
    const-string v5, "getRequestKey()Ljava/lang/String;"

    .line 18
    .line 19
    invoke-direct {v2, v1, v3, v5, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    new-instance v3, La/ez40;

    .line 23
    .line 24
    const-string v5, "showNavBarArg"

    .line 25
    .line 26
    const-string v6, "getShowNavBarArg()Z"

    .line 27
    .line 28
    invoke-direct {v3, v1, v5, v6, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 29
    .line 30
    .line 31
    const/4 v1, 0x3

    .line 32
    new-array v1, v1, [La/iiy;

    .line 33
    .line 34
    aput-object v0, v1, v4

    .line 35
    .line 36
    const/4 v0, 0x1

    .line 37
    aput-object v2, v1, v0

    .line 38
    .line 39
    const/4 v0, 0x2

    .line 40
    aput-object v3, v1, v0

    .line 41
    .line 42
    sput-object v1, La/br9;->U1:[La/iiy;

    .line 43
    .line 44
    new-instance v0, La/kl5;

    .line 45
    .line 46
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 47
    .line 48
    .line 49
    sput-object v0, La/br9;->S1:La/kl5;

    .line 50
    .line 51
    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    const v0, 0x7f0d0210

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    new-instance v0, La/zq9;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-direct {v0, p0, v1}, La/zq9;-><init>(La/br9;B)V

    .line 11
    .line 12
    .line 13
    new-instance v1, La/h79;

    .line 14
    .line 15
    const/4 v2, 0x5

    .line 16
    invoke-direct {v1, p0, v2}, La/h79;-><init>(Ljava/lang/Object;B)V

    .line 17
    .line 18
    .line 19
    sget-object v2, La/wez;->b:La/wez;

    .line 20
    .line 21
    new-instance v3, La/h79;

    .line 22
    .line 23
    const/4 v4, 0x6

    .line 24
    invoke-direct {v3, v1, v4}, La/h79;-><init>(Ljava/lang/Object;B)V

    .line 25
    .line 26
    .line 27
    invoke-static {v2, v3}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    const-class v2, La/mr9;

    .line 32
    .line 33
    sget-object v3, La/sre0;->a:La/tre0;

    .line 34
    .line 35
    invoke-virtual {v3, v2}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    new-instance v3, La/rt6;

    .line 40
    .line 41
    const/16 v4, 0x14

    .line 42
    .line 43
    invoke-direct {v3, v1, v4}, La/rt6;-><init>(La/a8z;B)V

    .line 44
    .line 45
    .line 46
    new-instance v4, La/rt6;

    .line 47
    .line 48
    const/16 v5, 0x15

    .line 49
    .line 50
    invoke-direct {v4, v1, v5}, La/rt6;-><init>(La/a8z;B)V

    .line 51
    .line 52
    .line 53
    invoke-static {p0, v2, v3, v4, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    iput-object v0, p0, La/br9;->N1:La/kiu0;

    .line 58
    .line 59
    sget-object v0, La/ar9;->a:La/ar9;

    .line 60
    .line 61
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    iput-object v0, p0, La/br9;->O1:La/s0r;

    .line 66
    .line 67
    new-instance v0, La/phf0;

    .line 68
    .line 69
    const-string v1, "BUNDLE_REQUEST_KEY"

    .line 70
    .line 71
    invoke-direct {v0, v1}, La/phf0;-><init>(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    iput-object v0, p0, La/br9;->P1:La/phf0;

    .line 75
    .line 76
    new-instance v0, La/cgx0;

    .line 77
    .line 78
    const-string v1, "SHOW_NAV_BAR"

    .line 79
    .line 80
    invoke-direct {v0, v1}, La/cgx0;-><init>(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    iput-object v0, p0, La/br9;->Q1:La/cgx0;

    .line 84
    .line 85
    new-instance v0, La/zq9;

    .line 86
    .line 87
    const/4 v1, 0x1

    .line 88
    invoke-direct {v0, p0, v1}, La/zq9;-><init>(La/br9;B)V

    .line 89
    .line 90
    .line 91
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    iput-object v0, p0, La/br9;->R1:La/n0o0;

    .line 96
    .line 97
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    new-instance p1, La/zq9;

    .line 2
    .line 3
    const/4 v0, 0x2

    .line 4
    invoke-direct {p1, p0, v0}, La/zq9;-><init>(La/br9;B)V

    .line 5
    .line 6
    .line 7
    const-string v0, "CANCEL_REQUEST_DIALOG_KEY"

    .line 8
    .line 9
    invoke-static {p0, v0, p1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 10
    .line 11
    .line 12
    new-instance p1, La/zq9;

    .line 13
    .line 14
    const/4 v1, 0x3

    .line 15
    invoke-direct {p1, p0, v1}, La/zq9;-><init>(La/br9;B)V

    .line 16
    .line 17
    .line 18
    invoke-static {p0, v0, p1}, La/ccq0;->T(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 19
    .line 20
    .line 21
    sget-object p1, La/br9;->U1:[La/iiy;

    .line 22
    .line 23
    const/4 v0, 0x1

    .line 24
    aget-object p1, p1, v0

    .line 25
    .line 26
    iget-object v1, p0, La/br9;->P1:La/phf0;

    .line 27
    .line 28
    invoke-virtual {v1, p0, p1}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    new-instance v1, La/m87;

    .line 33
    .line 34
    const/16 v2, 0x1a

    .line 35
    .line 36
    invoke-direct {v1, p0, v2}, La/m87;-><init>(Ljava/lang/Object;B)V

    .line 37
    .line 38
    .line 39
    invoke-static {p0, p1, v1}, La/vcc;->g0(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0}, La/br9;->G0()La/wyq;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    iget-object p1, p1, La/wyq;->c:Lorg/xplatform/uikit/components/views/OptimizedScrollRecyclerView;

    .line 47
    .line 48
    iget-object v1, p0, La/br9;->R1:La/n0o0;

    .line 49
    .line 50
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    check-cast v1, La/cyv;

    .line 55
    .line 56
    invoke-virtual {p1, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(La/yge0;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->G()Landroid/content/res/Resources;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    const v1, 0x7f07072d

    .line 64
    .line 65
    .line 66
    invoke-virtual {p1, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 67
    .line 68
    .line 69
    move-result p1

    .line 70
    invoke-virtual {p0}, La/br9;->G0()La/wyq;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    iget-object p0, p0, La/wyq;->c:Lorg/xplatform/uikit/components/views/OptimizedScrollRecyclerView;

    .line 75
    .line 76
    new-instance v1, La/kq8;

    .line 77
    .line 78
    invoke-direct {v1, p1, v0}, La/kq8;-><init>(IB)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/RecyclerView;->m(La/fhe0;)V

    .line 82
    .line 83
    .line 84
    return-void
.end method

.method public final C0()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    instance-of v1, v0, La/af3;

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    check-cast v0, La/af3;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move-object v0, v2

    .line 21
    :goto_0
    const-class v1, La/oq9;

    .line 22
    .line 23
    if-eqz v0, :cond_3

    .line 24
    .line 25
    invoke-interface {v0}, La/af3;->d()La/wcf0;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {v0, v1}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    check-cast v0, La/o5d0;

    .line 34
    .line 35
    if-eqz v0, :cond_1

    .line 36
    .line 37
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    check-cast v0, La/ze3;

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_1
    move-object v0, v2

    .line 45
    :goto_1
    instance-of v3, v0, La/oq9;

    .line 46
    .line 47
    if-nez v3, :cond_2

    .line 48
    .line 49
    goto :goto_2

    .line 50
    :cond_2
    move-object v2, v0

    .line 51
    :goto_2
    check-cast v2, La/oq9;

    .line 52
    .line 53
    if-eqz v2, :cond_3

    .line 54
    .line 55
    const-wide/16 v0, -0x1

    .line 56
    .line 57
    invoke-virtual {v2, v0, v1}, La/oq9;->a(J)La/bbi;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    new-instance v1, La/fiu0;

    .line 62
    .line 63
    const-class v2, La/mr9;

    .line 64
    .line 65
    iget-object v3, v0, La/bbi;->o:La/r5i;

    .line 66
    .line 67
    invoke-static {v2, v3}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    invoke-direct {v1, v2}, La/fiu0;-><init>(Ljava/util/Map;)V

    .line 72
    .line 73
    .line 74
    iput-object v1, p0, La/br9;->K1:La/fiu0;

    .line 75
    .line 76
    iget-object v1, v0, La/bbi;->j:La/ii;

    .line 77
    .line 78
    iput-object v1, p0, La/br9;->L1:La/ii;

    .line 79
    .line 80
    iget-object v0, v0, La/bbi;->k:La/wdk0;

    .line 81
    .line 82
    iput-object v0, p0, La/br9;->M1:La/wdk0;

    .line 83
    .line 84
    return-void

    .line 85
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 86
    .line 87
    invoke-static {v1, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    return-void
.end method

.method public final D0()V
    .locals 20

    .line 1
    invoke-virtual/range {p0 .. p0}, La/br9;->H0()La/mr9;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, v0, La/mr9;->l:La/p7m0;

    .line 6
    .line 7
    new-instance v2, La/c00;

    .line 8
    .line 9
    const/16 v3, 0x15

    .line 10
    .line 11
    invoke-direct {v2, v1, v0, v3}, La/c00;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 12
    .line 13
    .line 14
    new-instance v4, La/c48;

    .line 15
    .line 16
    const/4 v10, 0x4

    .line 17
    const/4 v11, 0x7

    .line 18
    const/4 v5, 0x2

    .line 19
    const-class v15, La/br9;

    .line 20
    .line 21
    const-string v8, "handleUiState"

    .line 22
    .line 23
    const-string v9, "handleUiState(Lorg/xplatform/callback/impl/presentation/history/model/CallbackHistoryUiState;)V"

    .line 24
    .line 25
    move-object/from16 v6, p0

    .line 26
    .line 27
    move-object v7, v15

    .line 28
    invoke-direct/range {v4 .. v11}, La/c48;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 29
    .line 30
    .line 31
    sget-object v0, La/lkz;->a:La/lkz;

    .line 32
    .line 33
    invoke-static/range {p0 .. p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-interface {v0}, La/clz;->x()La/glz;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-static {v1}, La/x0x;->Q(La/glz;)La/tkz;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    new-instance v3, La/l19;

    .line 46
    .line 47
    const/4 v9, 0x0

    .line 48
    invoke-direct {v3, v2, v0, v4, v9}, La/l19;-><init>(La/c00;La/clz;La/c48;La/yje;)V

    .line 49
    .line 50
    .line 51
    const/4 v0, 0x3

    .line 52
    invoke-static {v1, v9, v9, v3, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 53
    .line 54
    .line 55
    invoke-virtual/range {p0 .. p0}, La/br9;->H0()La/mr9;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    iget-object v6, v1, La/mr9;->n:La/p7m0;

    .line 60
    .line 61
    new-instance v8, La/c48;

    .line 62
    .line 63
    const/16 v18, 0x4

    .line 64
    .line 65
    const/16 v19, 0x8

    .line 66
    .line 67
    const/4 v13, 0x2

    .line 68
    const-string v16, "handleEvent"

    .line 69
    .line 70
    const-string v17, "handleEvent(Lorg/xplatform/callback/impl/presentation/history/model/CallbackHistoryEvent;)V"

    .line 71
    .line 72
    move-object/from16 v14, p0

    .line 73
    .line 74
    move-object v12, v8

    .line 75
    invoke-direct/range {v12 .. v19}, La/c48;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 76
    .line 77
    .line 78
    invoke-static/range {p0 .. p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 79
    .line 80
    .line 81
    move-result-object v7

    .line 82
    invoke-interface {v7}, La/clz;->x()La/glz;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    invoke-static {v1}, La/x0x;->Q(La/glz;)La/tkz;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    new-instance v5, La/l19;

    .line 91
    .line 92
    const/4 v10, 0x0

    .line 93
    invoke-direct/range {v5 .. v10}, La/l19;-><init>(La/gmq;La/clz;La/c48;La/yje;B)V

    .line 94
    .line 95
    .line 96
    invoke-static {v1, v9, v9, v5, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 97
    .line 98
    .line 99
    return-void
.end method

.method public final G0()La/wyq;
    .locals 2

    .line 1
    sget-object v0, La/br9;->U1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/br9;->O1:La/s0r;

    .line 7
    .line 8
    invoke-virtual {v1, v0, p0}, La/s0r;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    check-cast p0, La/wyq;

    .line 16
    .line 17
    return-object p0
.end method

.method public final H0()La/mr9;
    .locals 0

    .line 1
    iget-object p0, p0, La/br9;->N1:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/mr9;

    .line 8
    .line 9
    return-object p0
.end method

.method public final e0()V
    .locals 6

    .line 1
    invoke-super {p0}, La/yx5;->e0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, La/br9;->H0()La/mr9;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    iget-object v0, p0, La/mr9;->j:La/c4m0;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0}, La/pby;->isActive()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-ne v0, v1, :cond_0

    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    iget-object v0, p0, La/mr9;->f:La/m1e;

    .line 21
    .line 22
    invoke-interface {v0}, La/m1e;->b()La/gmq;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    iget-object v2, p0, La/mr9;->m:La/p7m0;

    .line 27
    .line 28
    new-instance v3, La/jr9;

    .line 29
    .line 30
    const/4 v4, 0x0

    .line 31
    const/4 v5, 0x0

    .line 32
    invoke-direct {v3, p0, v4, v5}, La/jr9;-><init>(La/diu0;La/yje;B)V

    .line 33
    .line 34
    .line 35
    new-instance v4, La/p6d;

    .line 36
    .line 37
    invoke-direct {v4, v0, v2, v3, v1}, La/p6d;-><init>(La/gmq;La/gmq;La/xdr;B)V

    .line 38
    .line 39
    .line 40
    sget-object v0, La/kr9;->h:La/kr9;

    .line 41
    .line 42
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    iget-object v2, p0, La/mr9;->e:La/mne;

    .line 47
    .line 48
    iget-object v2, v2, La/mne;->c:La/vs10;

    .line 49
    .line 50
    invoke-static {v1, v2}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    invoke-static {v4, v1, v0}, La/sac;->T(La/gmq;La/vne;Lkotlin/jvm/functions/Function2;)La/c4m0;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    iput-object v0, p0, La/mr9;->j:La/c4m0;

    .line 59
    .line 60
    return-void
.end method

.method public final h0()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->j1:Z

    .line 3
    .line 4
    invoke-virtual {p0}, La/br9;->H0()La/mr9;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    iget-object p0, p0, La/mr9;->j:La/c4m0;

    .line 9
    .line 10
    invoke-static {p0}, La/v3c;->N(La/bby;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final x0()Z
    .locals 2

    .line 1
    sget-object v0, La/br9;->U1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/br9;->Q1:La/cgx0;

    .line 7
    .line 8
    invoke-virtual {v1, p0, v0}, La/cgx0;->r(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Boolean;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    return p0
.end method
