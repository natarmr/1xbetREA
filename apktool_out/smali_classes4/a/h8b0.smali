.class public final La/h8b0;
.super La/yx5;
.source "SourceFile"

# interfaces
.implements La/tah0;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0006"
    }
    d2 = {
        "La/h8b0;",
        "La/yx5;",
        "La/tah0;",
        "<init>",
        "()V",
        "a/rl70",
        "popular_classic"
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
.field public static final R1:La/rl70;

.field public static final synthetic S1:[La/iiy;


# instance fields
.field public final K1:Z

.field public L1:La/api;

.field public M1:La/wdk0;

.field public final N1:La/kiu0;

.field public final O1:La/s0r;

.field public final P1:La/d930;

.field public final Q1:La/a8z;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/h8b0;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/games_section/feature/popular_classic/databinding/FragmentPopularClassicOneXGamesBinding;"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, La/j0d0;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    new-array v1, v1, [La/iiy;

    .line 15
    .line 16
    aput-object v0, v1, v4

    .line 17
    .line 18
    sput-object v1, La/h8b0;->S1:[La/iiy;

    .line 19
    .line 20
    new-instance v0, La/rl70;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    sput-object v0, La/h8b0;->R1:La/rl70;

    .line 26
    .line 27
    return-void
.end method

.method public constructor <init>()V
    .locals 8

    .line 1
    const v0, 0x7f0d028e

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    iput-boolean v0, p0, La/h8b0;->K1:Z

    .line 9
    .line 10
    new-instance v1, La/d8b0;

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    invoke-direct {v1, p0, v2}, La/d8b0;-><init>(La/h8b0;B)V

    .line 14
    .line 15
    .line 16
    new-instance v3, La/g8b0;

    .line 17
    .line 18
    invoke-direct {v3, p0, v2}, La/g8b0;-><init>(Ljava/lang/Object;B)V

    .line 19
    .line 20
    .line 21
    sget-object v2, La/wez;->b:La/wez;

    .line 22
    .line 23
    new-instance v4, La/g8b0;

    .line 24
    .line 25
    invoke-direct {v4, v3, v0}, La/g8b0;-><init>(Ljava/lang/Object;B)V

    .line 26
    .line 27
    .line 28
    invoke-static {v2, v4}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    const-class v4, La/g9b0;

    .line 33
    .line 34
    sget-object v5, La/sre0;->a:La/tre0;

    .line 35
    .line 36
    invoke-virtual {v5, v4}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    new-instance v5, La/x6b0;

    .line 41
    .line 42
    const/4 v6, 0x2

    .line 43
    invoke-direct {v5, v3, v6}, La/x6b0;-><init>(La/a8z;B)V

    .line 44
    .line 45
    .line 46
    new-instance v6, La/x6b0;

    .line 47
    .line 48
    const/4 v7, 0x3

    .line 49
    invoke-direct {v6, v3, v7}, La/x6b0;-><init>(La/a8z;B)V

    .line 50
    .line 51
    .line 52
    invoke-static {p0, v4, v5, v6, v1}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    iput-object v1, p0, La/h8b0;->N1:La/kiu0;

    .line 57
    .line 58
    sget-object v1, La/e8b0;->a:La/e8b0;

    .line 59
    .line 60
    invoke-static {p0, v1}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    iput-object v1, p0, La/h8b0;->O1:La/s0r;

    .line 65
    .line 66
    new-instance v1, La/d930;

    .line 67
    .line 68
    invoke-direct {v1, v0}, La/d930;-><init>(B)V

    .line 69
    .line 70
    .line 71
    iput-object v1, p0, La/h8b0;->P1:La/d930;

    .line 72
    .line 73
    new-instance v1, La/d8b0;

    .line 74
    .line 75
    invoke-direct {v1, p0, v0}, La/d8b0;-><init>(La/h8b0;B)V

    .line 76
    .line 77
    .line 78
    invoke-static {v2, v1}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    iput-object v0, p0, La/h8b0;->Q1:La/a8z;

    .line 83
    .line 84
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 17

    .line 1
    invoke-virtual/range {p0 .. p0}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, La/wma0;

    .line 6
    .line 7
    invoke-virtual/range {p0 .. p0}, La/h8b0;->H0()La/g9b0;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    const/4 v7, 0x0

    .line 12
    const/16 v8, 0x1a

    .line 13
    .line 14
    const/4 v2, 0x1

    .line 15
    const-class v12, La/g9b0;

    .line 16
    .line 17
    const-string v5, "onOneXGamesGameUMResultReceive"

    .line 18
    .line 19
    const-string v6, "onOneXGamesGameUMResultReceive$popular_classic(J)V"

    .line 20
    .line 21
    move-object v4, v12

    .line 22
    invoke-direct/range {v1 .. v8}, La/wma0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 23
    .line 24
    .line 25
    new-instance v3, La/cz60;

    .line 26
    .line 27
    invoke-virtual/range {p0 .. p0}, La/h8b0;->H0()La/g9b0;

    .line 28
    .line 29
    .line 30
    move-result-object v11

    .line 31
    const/4 v15, 0x0

    .line 32
    const/16 v16, 0x1b

    .line 33
    .line 34
    const/4 v10, 0x0

    .line 35
    const-string v13, "onOneXGamesUMResultReceive"

    .line 36
    .line 37
    const-string v14, "onOneXGamesUMResultReceive$popular_classic()V"

    .line 38
    .line 39
    move-object v9, v3

    .line 40
    invoke-direct/range {v9 .. v16}, La/cz60;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 41
    .line 42
    .line 43
    const/4 v4, 0x0

    .line 44
    const/16 v5, 0x12

    .line 45
    .line 46
    move-object v2, v1

    .line 47
    move-object/from16 v1, p0

    .line 48
    .line 49
    invoke-static/range {v0 .. v5}, La/o2t;->e(Landroidx/fragment/app/e;La/clz;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;La/bm60;I)V

    .line 50
    .line 51
    .line 52
    invoke-virtual/range {p0 .. p0}, La/h8b0;->G0()La/y2r;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    iget-object v0, v0, La/y2r;->d:Landroidx/recyclerview/widget/RecyclerView;

    .line 57
    .line 58
    iget-object v2, v1, La/h8b0;->Q1:La/a8z;

    .line 59
    .line 60
    invoke-interface {v2}, La/a8z;->getValue()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    check-cast v2, La/ceb0;

    .line 65
    .line 66
    invoke-virtual {v0, v2}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(La/yge0;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v1}, La/h8b0;->G0()La/y2r;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    iget-object v0, v0, La/y2r;->d:Landroidx/recyclerview/widget/RecyclerView;

    .line 74
    .line 75
    const/4 v2, 0x1

    .line 76
    invoke-static {v0, v2, v2}, La/vvw;->o(Landroidx/recyclerview/widget/RecyclerView;ZI)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v1}, La/h8b0;->G0()La/y2r;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    iget-object v0, v0, La/y2r;->b:Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;

    .line 84
    .line 85
    new-instance v9, La/cz60;

    .line 86
    .line 87
    invoke-virtual {v1}, La/h8b0;->H0()La/g9b0;

    .line 88
    .line 89
    .line 90
    move-result-object v11

    .line 91
    const/16 v16, 0x1a

    .line 92
    .line 93
    const-string v13, "onLottieButtonClick"

    .line 94
    .line 95
    const-string v14, "onLottieButtonClick()V"

    .line 96
    .line 97
    invoke-direct/range {v9 .. v16}, La/cz60;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v0, v9}, Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;->setButtonOnClickListener(Lkotlin/jvm/functions/Function0;)V

    .line 101
    .line 102
    .line 103
    return-void
.end method

.method public final C0()V
    .locals 3

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
    instance-of v1, v0, La/vmv;

    .line 10
    .line 11
    const-string v2, "Can not find dependencies provider for "

    .line 12
    .line 13
    if-eqz v1, :cond_2

    .line 14
    .line 15
    check-cast v0, La/vmv;

    .line 16
    .line 17
    check-cast v0, Lorg/platform/app/ApplicationLoader;

    .line 18
    .line 19
    invoke-virtual {v0}, Lorg/platform/app/ApplicationLoader;->c()La/g8i;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    invoke-virtual {v0}, Lorg/platform/app/ApplicationLoader;->c()La/g8i;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    if-eqz v0, :cond_0

    .line 30
    .line 31
    new-instance v1, La/pmi;

    .line 32
    .line 33
    new-instance v2, La/jh70;

    .line 34
    .line 35
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 36
    .line 37
    .line 38
    invoke-direct {v1, v2, v0}, La/pmi;-><init>(La/jh70;La/g8i;)V

    .line 39
    .line 40
    .line 41
    iget-object v1, v1, La/pmi;->e:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v1, La/n5d0;

    .line 44
    .line 45
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    check-cast v1, La/api;

    .line 50
    .line 51
    iput-object v1, p0, La/h8b0;->L1:La/api;

    .line 52
    .line 53
    invoke-virtual {v0}, La/g8i;->I9()La/wdk0;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-static {v0}, La/x1x;->x(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    iput-object v0, p0, La/h8b0;->M1:La/wdk0;

    .line 61
    .line 62
    return-void

    .line 63
    :cond_0
    const-string p0, "null cannot be cast to non-null type org.xplatform.core.di.dependencies.PopularClassicOneXGamesDependencies"

    .line 64
    .line 65
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    return-void

    .line 69
    :cond_1
    invoke-static {p0, v2}, La/e9d0;->v(Ljava/lang/Object;Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    return-void

    .line 73
    :cond_2
    invoke-static {p0, v2}, La/e9d0;->v(Ljava/lang/Object;Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    return-void
.end method

.method public final D0()V
    .locals 24

    .line 1
    invoke-virtual/range {p0 .. p0}, La/h8b0;->H0()La/g9b0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, v0, La/g9b0;->F:La/p7m0;

    .line 6
    .line 7
    new-instance v2, La/a9b0;

    .line 8
    .line 9
    const/4 v7, 0x0

    .line 10
    const/4 v3, 0x0

    .line 11
    invoke-direct {v2, v0, v7, v3}, La/a9b0;-><init>(La/g9b0;La/yje;B)V

    .line 12
    .line 13
    .line 14
    new-instance v4, La/fnq;

    .line 15
    .line 16
    const/4 v5, 0x4

    .line 17
    invoke-direct {v4, v1, v2, v5}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 18
    .line 19
    .line 20
    new-instance v1, La/d7a0;

    .line 21
    .line 22
    invoke-direct {v1, v0, v7, v5}, La/d7a0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 23
    .line 24
    .line 25
    new-instance v2, La/fnq;

    .line 26
    .line 27
    invoke-direct {v2, v4, v1}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;)V

    .line 28
    .line 29
    .line 30
    new-instance v1, La/gbv;

    .line 31
    .line 32
    const/16 v4, 0x17

    .line 33
    .line 34
    invoke-direct {v1, v0, v7, v4}, La/gbv;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 35
    .line 36
    .line 37
    new-instance v0, La/dnq;

    .line 38
    .line 39
    invoke-direct {v0, v2, v1, v3}, La/dnq;-><init>(La/gmq;La/xdr;B)V

    .line 40
    .line 41
    .line 42
    sget-object v1, La/lkz;->a:La/lkz;

    .line 43
    .line 44
    new-instance v8, La/p6b0;

    .line 45
    .line 46
    const/4 v14, 0x4

    .line 47
    const/16 v15, 0x10

    .line 48
    .line 49
    const/4 v9, 0x2

    .line 50
    const-class v19, La/h8b0;

    .line 51
    .line 52
    const-string v12, "handleViewState"

    .line 53
    .line 54
    const-string v13, "handleViewState(Lorg/xplatform/games_section/feature/popular_classic/presentation/PopularClassicOneXGamesViewModel$ViewState;)V"

    .line 55
    .line 56
    move-object/from16 v10, p0

    .line 57
    .line 58
    move-object/from16 v11, v19

    .line 59
    .line 60
    invoke-direct/range {v8 .. v15}, La/p6b0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 61
    .line 62
    .line 63
    invoke-static/range {p0 .. p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    invoke-interface {v1}, La/clz;->x()La/glz;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    invoke-static {v2}, La/x0x;->Q(La/glz;)La/tkz;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    new-instance v3, La/f8b0;

    .line 76
    .line 77
    invoke-direct {v3, v0, v1, v8, v7}, La/f8b0;-><init>(La/dnq;La/clz;La/p6b0;La/yje;)V

    .line 78
    .line 79
    .line 80
    const/4 v0, 0x3

    .line 81
    invoke-static {v2, v7, v7, v3, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 82
    .line 83
    .line 84
    invoke-virtual/range {p0 .. p0}, La/h8b0;->H0()La/g9b0;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    iget-object v1, v1, La/g9b0;->V:La/xae0;

    .line 89
    .line 90
    new-instance v16, La/p6b0;

    .line 91
    .line 92
    const/16 v22, 0x4

    .line 93
    .line 94
    const/16 v23, 0x11

    .line 95
    .line 96
    const/16 v17, 0x2

    .line 97
    .line 98
    const-string v20, "handleGamesContent"

    .line 99
    .line 100
    const-string v21, "handleGamesContent(Ljava/util/List;)V"

    .line 101
    .line 102
    move-object/from16 v18, p0

    .line 103
    .line 104
    invoke-direct/range {v16 .. v23}, La/p6b0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 105
    .line 106
    .line 107
    move-object/from16 v2, v16

    .line 108
    .line 109
    sget-object v3, La/lkz;->a:La/lkz;

    .line 110
    .line 111
    invoke-static/range {p0 .. p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 112
    .line 113
    .line 114
    move-result-object v3

    .line 115
    invoke-interface {v3}, La/clz;->x()La/glz;

    .line 116
    .line 117
    .line 118
    move-result-object v4

    .line 119
    invoke-static {v4}, La/x0x;->Q(La/glz;)La/tkz;

    .line 120
    .line 121
    .line 122
    move-result-object v4

    .line 123
    new-instance v5, La/f8b0;

    .line 124
    .line 125
    invoke-direct {v5, v1, v3, v2, v7}, La/f8b0;-><init>(La/gmq;La/clz;La/p6b0;La/yje;)V

    .line 126
    .line 127
    .line 128
    invoke-static {v4, v7, v7, v5, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 129
    .line 130
    .line 131
    invoke-virtual/range {p0 .. p0}, La/h8b0;->H0()La/g9b0;

    .line 132
    .line 133
    .line 134
    move-result-object v1

    .line 135
    iget-object v1, v1, La/g9b0;->G:La/ol60;

    .line 136
    .line 137
    new-instance v2, La/s980;

    .line 138
    .line 139
    const/16 v3, 0x19

    .line 140
    .line 141
    invoke-direct {v2, v10, v7, v3}, La/s980;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 142
    .line 143
    .line 144
    invoke-static {v10}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 145
    .line 146
    .line 147
    move-result-object v3

    .line 148
    invoke-interface {v3}, La/clz;->x()La/glz;

    .line 149
    .line 150
    .line 151
    move-result-object v4

    .line 152
    invoke-static {v4}, La/x0x;->Q(La/glz;)La/tkz;

    .line 153
    .line 154
    .line 155
    move-result-object v4

    .line 156
    new-instance v5, La/f8b0;

    .line 157
    .line 158
    invoke-direct {v5, v1, v3, v2, v7}, La/f8b0;-><init>(La/gmq;La/clz;La/s980;La/yje;)V

    .line 159
    .line 160
    .line 161
    invoke-static {v4, v7, v7, v5, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 162
    .line 163
    .line 164
    invoke-virtual {v10}, La/h8b0;->H0()La/g9b0;

    .line 165
    .line 166
    .line 167
    move-result-object v1

    .line 168
    iget-object v4, v1, La/g9b0;->H:La/ol60;

    .line 169
    .line 170
    new-instance v16, La/p6b0;

    .line 171
    .line 172
    const/16 v23, 0x12

    .line 173
    .line 174
    const-string v20, "handleBannerEvent"

    .line 175
    .line 176
    const-string v21, "handleBannerEvent(Lorg/xplatform/games_section/feature/popular_classic/presentation/PopularClassicOneXGamesViewModel$ActionBannerEvent;)V"

    .line 177
    .line 178
    move-object/from16 v18, v10

    .line 179
    .line 180
    invoke-direct/range {v16 .. v23}, La/p6b0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 181
    .line 182
    .line 183
    invoke-static/range {p0 .. p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 184
    .line 185
    .line 186
    move-result-object v5

    .line 187
    invoke-interface {v5}, La/clz;->x()La/glz;

    .line 188
    .line 189
    .line 190
    move-result-object v1

    .line 191
    invoke-static {v1}, La/x0x;->Q(La/glz;)La/tkz;

    .line 192
    .line 193
    .line 194
    move-result-object v1

    .line 195
    new-instance v3, La/f8b0;

    .line 196
    .line 197
    const/4 v8, 0x0

    .line 198
    move-object/from16 v6, v16

    .line 199
    .line 200
    invoke-direct/range {v3 .. v8}, La/f8b0;-><init>(La/gmq;La/clz;La/p6b0;La/yje;B)V

    .line 201
    .line 202
    .line 203
    invoke-static {v1, v7, v7, v3, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 204
    .line 205
    .line 206
    return-void
.end method

.method public final G0()La/y2r;
    .locals 2

    .line 1
    sget-object v0, La/h8b0;->S1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/h8b0;->O1:La/s0r;

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
    check-cast p0, La/y2r;

    .line 16
    .line 17
    return-object p0
.end method

.method public final H0()La/g9b0;
    .locals 0

    .line 1
    iget-object p0, p0, La/h8b0;->N1:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/g9b0;

    .line 8
    .line 9
    return-object p0
.end method

.method public final Z()V
    .locals 2

    .line 1
    invoke-super {p0}, La/yx5;->Z()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, La/h8b0;->G0()La/y2r;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget-object v0, v0, La/y2r;->d:Landroidx/recyclerview/widget/RecyclerView;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(La/yge0;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-static {p0}, La/o2t;->a(Landroidx/fragment/app/e;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public final p()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, La/h8b0;->G0()La/y2r;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object p0, p0, La/y2r;->d:Landroidx/recyclerview/widget/RecyclerView;

    .line 6
    .line 7
    const/4 v0, -0x1

    .line 8
    invoke-virtual {p0, v0}, Landroid/view/View;->canScrollVertically(I)Z

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    return p0
.end method

.method public final w()V
    .locals 1

    .line 1
    invoke-virtual {p0}, La/h8b0;->G0()La/y2r;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object p0, p0, La/y2r;->d:Landroidx/recyclerview/widget/RecyclerView;

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    invoke-static {p0, v0}, La/kcx;->G(Landroidx/recyclerview/widget/RecyclerView;I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final x0()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, La/h8b0;->K1:Z

    .line 2
    .line 3
    return p0
.end method
