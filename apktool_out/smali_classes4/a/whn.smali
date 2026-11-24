.class public final La/whn;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0000\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "La/whn;",
        "La/yx5;",
        "<init>",
        "()V",
        "eastern_nights"
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
.field public static final synthetic O1:[La/iiy;


# instance fields
.field public final K1:La/i9o0;

.field public L1:La/fiu0;

.field public final M1:La/kiu0;

.field public final N1:La/s0r;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/whn;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/eastern_nights/databinding/FragmentEasternNightsBinding;"

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
    sput-object v1, La/whn;->O1:[La/iiy;

    .line 19
    .line 20
    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    const v0, 0x7f0d0230

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sget-object v0, La/i9o0;->a:La/i9o0;

    .line 8
    .line 9
    iput-object v0, p0, La/whn;->K1:La/i9o0;

    .line 10
    .line 11
    new-instance v0, La/ntl;

    .line 12
    .line 13
    const/16 v1, 0xc

    .line 14
    .line 15
    invoke-direct {v0, p0, v1}, La/ntl;-><init>(Ljava/lang/Object;B)V

    .line 16
    .line 17
    .line 18
    new-instance v1, La/jfl;

    .line 19
    .line 20
    const/4 v2, 0x3

    .line 21
    invoke-direct {v1, p0, v2}, La/jfl;-><init>(Ljava/lang/Object;B)V

    .line 22
    .line 23
    .line 24
    sget-object v2, La/wez;->b:La/wez;

    .line 25
    .line 26
    new-instance v3, La/jfl;

    .line 27
    .line 28
    const/4 v4, 0x4

    .line 29
    invoke-direct {v3, v1, v4}, La/jfl;-><init>(Ljava/lang/Object;B)V

    .line 30
    .line 31
    .line 32
    invoke-static {v2, v3}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    const-class v2, La/kin;

    .line 37
    .line 38
    sget-object v3, La/sre0;->a:La/tre0;

    .line 39
    .line 40
    invoke-virtual {v3, v2}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    new-instance v3, La/b9k;

    .line 45
    .line 46
    const/16 v4, 0x16

    .line 47
    .line 48
    invoke-direct {v3, v1, v4}, La/b9k;-><init>(La/a8z;B)V

    .line 49
    .line 50
    .line 51
    new-instance v4, La/b9k;

    .line 52
    .line 53
    const/16 v5, 0x17

    .line 54
    .line 55
    invoke-direct {v4, v1, v5}, La/b9k;-><init>(La/a8z;B)V

    .line 56
    .line 57
    .line 58
    invoke-static {p0, v2, v3, v4, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    iput-object v0, p0, La/whn;->M1:La/kiu0;

    .line 63
    .line 64
    sget-object v0, La/vhn;->a:La/vhn;

    .line 65
    .line 66
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    iput-object v0, p0, La/whn;->N1:La/s0r;

    .line 71
    .line 72
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 6

    .line 1
    invoke-virtual {p0}, La/whn;->G0()La/uzq;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object p1, p1, La/uzq;->b:Lorg/xplatform/eastern_nights/presentation/views/EasternNightsCellGameView;

    .line 6
    .line 7
    invoke-virtual {p1}, Lorg/xplatform/eastern_nights/presentation/views/EasternNightsCellGameView;->y()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, La/whn;->G0()La/uzq;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    iget-object v0, p1, La/uzq;->b:Lorg/xplatform/eastern_nights/presentation/views/EasternNightsCellGameView;

    .line 15
    .line 16
    new-instance v1, La/dpl;

    .line 17
    .line 18
    const/16 v2, 0x1a

    .line 19
    .line 20
    invoke-direct {v1, p1, p0, v2}, La/dpl;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 21
    .line 22
    .line 23
    new-instance v2, La/uhn;

    .line 24
    .line 25
    const/4 v3, 0x0

    .line 26
    invoke-direct {v2, p1, p0, v3}, La/uhn;-><init>(La/uzq;La/whn;B)V

    .line 27
    .line 28
    .line 29
    new-instance v3, La/uhn;

    .line 30
    .line 31
    const/4 v4, 0x1

    .line 32
    invoke-direct {v3, p1, p0, v4}, La/uhn;-><init>(La/uzq;La/whn;B)V

    .line 33
    .line 34
    .line 35
    new-instance v4, La/uhn;

    .line 36
    .line 37
    const/4 v5, 0x2

    .line 38
    invoke-direct {v4, p1, p0, v5}, La/uhn;-><init>(La/uzq;La/whn;B)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, v1, v2, v3, v4}, Lorg/xplatform/eastern_nights/presentation/views/EasternNightsCellGameView;->x(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V

    .line 42
    .line 43
    .line 44
    return-void
.end method

.method public final C0()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->y:Landroidx/fragment/app/Fragment;

    .line 2
    .line 3
    instance-of v1, v0, La/min;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    check-cast v0, La/min;

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    :goto_0
    if-eqz v0, :cond_1

    .line 12
    .line 13
    iget-object v0, v0, La/min;->W1:La/n0o0;

    .line 14
    .line 15
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, La/xfi;

    .line 20
    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    new-instance v1, La/fiu0;

    .line 24
    .line 25
    const-class v2, La/kin;

    .line 26
    .line 27
    iget-object v0, v0, La/xfi;->h0:La/dci;

    .line 28
    .line 29
    invoke-static {v2, v0}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-direct {v1, v0}, La/fiu0;-><init>(Ljava/util/Map;)V

    .line 34
    .line 35
    .line 36
    iput-object v1, p0, La/whn;->L1:La/fiu0;

    .line 37
    .line 38
    :cond_1
    return-void
.end method

.method public final D0()V
    .locals 25

    .line 1
    invoke-virtual/range {p0 .. p0}, La/whn;->H0()La/kin;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, v0, La/kin;->w:La/p7m0;

    .line 6
    .line 7
    new-instance v2, La/cin;

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    const/4 v8, 0x0

    .line 11
    invoke-direct {v2, v0, v8, v3}, La/cin;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 12
    .line 13
    .line 14
    new-instance v0, La/u6n0;

    .line 15
    .line 16
    invoke-direct {v0, v1, v2}, La/u6n0;-><init>(La/p7m0;Lkotlin/jvm/functions/Function2;)V

    .line 17
    .line 18
    .line 19
    new-instance v9, La/pfl;

    .line 20
    .line 21
    const/4 v15, 0x4

    .line 22
    const/16 v16, 0x2

    .line 23
    .line 24
    const/4 v10, 0x2

    .line 25
    const-class v20, La/whn;

    .line 26
    .line 27
    const-string v13, "handleEasternNightsScreen"

    .line 28
    .line 29
    const-string v14, "handleEasternNightsScreen(Lorg/xplatform/eastern_nights/presentation/models/EasternNightsScreenState;)V"

    .line 30
    .line 31
    move-object/from16 v11, p0

    .line 32
    .line 33
    move-object/from16 v12, v20

    .line 34
    .line 35
    invoke-direct/range {v9 .. v16}, La/pfl;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 36
    .line 37
    .line 38
    sget-object v1, La/lkz;->a:La/lkz;

    .line 39
    .line 40
    invoke-static/range {p0 .. p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    invoke-interface {v1}, La/clz;->x()La/glz;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    invoke-static {v2}, La/x0x;->Q(La/glz;)La/tkz;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    new-instance v3, La/ofl;

    .line 53
    .line 54
    invoke-direct {v3, v0, v1, v9, v8}, La/ofl;-><init>(La/u6n0;La/clz;La/pfl;La/yje;)V

    .line 55
    .line 56
    .line 57
    const/4 v0, 0x3

    .line 58
    invoke-static {v2, v8, v8, v3, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 59
    .line 60
    .line 61
    invoke-virtual/range {p0 .. p0}, La/whn;->H0()La/kin;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    iget-object v5, v1, La/kin;->x:La/p7m0;

    .line 66
    .line 67
    new-instance v17, La/pfl;

    .line 68
    .line 69
    const/16 v23, 0x4

    .line 70
    .line 71
    const/16 v24, 0x3

    .line 72
    .line 73
    const/16 v18, 0x2

    .line 74
    .line 75
    const-string v21, "handleConnection"

    .line 76
    .line 77
    const-string v22, "handleConnection(Z)V"

    .line 78
    .line 79
    move-object/from16 v19, p0

    .line 80
    .line 81
    invoke-direct/range {v17 .. v24}, La/pfl;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 82
    .line 83
    .line 84
    invoke-static/range {p0 .. p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 85
    .line 86
    .line 87
    move-result-object v6

    .line 88
    invoke-interface {v6}, La/clz;->x()La/glz;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    invoke-static {v1}, La/x0x;->Q(La/glz;)La/tkz;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    new-instance v4, La/ofl;

    .line 97
    .line 98
    const/4 v9, 0x0

    .line 99
    move-object/from16 v7, v17

    .line 100
    .line 101
    invoke-direct/range {v4 .. v9}, La/ofl;-><init>(La/gmq;La/clz;La/pfl;La/yje;B)V

    .line 102
    .line 103
    .line 104
    invoke-static {v1, v8, v8, v4, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 105
    .line 106
    .line 107
    return-void
.end method

.method public final G0()La/uzq;
    .locals 2

    .line 1
    sget-object v0, La/whn;->O1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/whn;->N1:La/s0r;

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
    check-cast p0, La/uzq;

    .line 16
    .line 17
    return-object p0
.end method

.method public final H0()La/kin;
    .locals 0

    .line 1
    iget-object p0, p0, La/whn;->M1:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/kin;

    .line 8
    .line 9
    return-object p0
.end method

.method public final z0()La/j9o0;
    .locals 0

    .line 1
    iget-object p0, p0, La/whn;->K1:La/i9o0;

    .line 2
    .line 3
    return-object p0
.end method
