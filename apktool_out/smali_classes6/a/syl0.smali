.class public final La/syl0;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0005\u0008\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0005\u0006B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0007"
    }
    d2 = {
        "La/syl0;",
        "La/yx5;",
        "",
        "<init>",
        "()V",
        "a/nyl0",
        "a/eke0",
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
.field public static final f2:La/eke0;

.field public static final synthetic g2:[La/iiy;


# instance fields
.field public final K1:La/khf0;

.field public final L1:La/r34;

.field public final M1:La/r34;

.field public final N1:La/r34;

.field public final O1:La/yzn0;

.field public P1:I

.field public Q1:Z

.field public R1:Z

.field public S1:I

.field public U1:Z

.field public final V1:Ljava/util/HashMap;

.field public W1:La/zfb;

.field public final X1:La/s0r;

.field public Y1:La/fiu0;

.field public Z1:La/jk3;

.field public final a2:La/a8z;

.field public final b2:La/a8z;

.field public final c2:Z

.field public final d2:La/v62;

.field public final e2:La/tvj;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/syl0;

    .line 4
    .line 5
    const-string v2, "stageId"

    .line 6
    .line 7
    const-string v3, "getStageId()Lorg/xplatform/statistic/stage/api/domain/TypeStageId;"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    new-instance v2, La/ez40;

    .line 14
    .line 15
    const-string v3, "sportId"

    .line 16
    .line 17
    const-string v5, "getSportId()J"

    .line 18
    .line 19
    invoke-direct {v2, v1, v3, v5, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    new-instance v3, La/ez40;

    .line 23
    .line 24
    const-string v5, "subSportId"

    .line 25
    .line 26
    const-string v6, "getSubSportId()J"

    .line 27
    .line 28
    invoke-direct {v3, v1, v5, v6, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 29
    .line 30
    .line 31
    new-instance v5, La/ez40;

    .line 32
    .line 33
    const-string v6, "globalChampId"

    .line 34
    .line 35
    const-string v7, "getGlobalChampId()J"

    .line 36
    .line 37
    invoke-direct {v5, v1, v6, v7, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 38
    .line 39
    .line 40
    new-instance v6, La/ez40;

    .line 41
    .line 42
    const-string v7, "lastStatusBarStyle"

    .line 43
    .line 44
    const-string v8, "getLastStatusBarStyle()Lorg/xplatform/statistic/stage/impl/stage_net/presentation/fragments/StageFragment$ColorStyle;"

    .line 45
    .line 46
    invoke-direct {v6, v1, v7, v8, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 47
    .line 48
    .line 49
    new-instance v7, La/j0d0;

    .line 50
    .line 51
    const-string v8, "viewBinding"

    .line 52
    .line 53
    const-string v9, "getViewBinding()Lorg/xplatform/statistic/stage/impl/databinding/FragmentStageNetComposeBinding;"

    .line 54
    .line 55
    invoke-direct {v7, v1, v8, v9, v4}, La/j0d0;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 56
    .line 57
    .line 58
    const/4 v1, 0x6

    .line 59
    new-array v1, v1, [La/iiy;

    .line 60
    .line 61
    aput-object v0, v1, v4

    .line 62
    .line 63
    const/4 v0, 0x1

    .line 64
    aput-object v2, v1, v0

    .line 65
    .line 66
    const/4 v0, 0x2

    .line 67
    aput-object v3, v1, v0

    .line 68
    .line 69
    const/4 v0, 0x3

    .line 70
    aput-object v5, v1, v0

    .line 71
    .line 72
    const/4 v0, 0x4

    .line 73
    aput-object v6, v1, v0

    .line 74
    .line 75
    const/4 v0, 0x5

    .line 76
    aput-object v7, v1, v0

    .line 77
    .line 78
    sput-object v1, La/syl0;->g2:[La/iiy;

    .line 79
    .line 80
    new-instance v0, La/eke0;

    .line 81
    .line 82
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 83
    .line 84
    .line 85
    sput-object v0, La/syl0;->f2:La/eke0;

    .line 86
    .line 87
    return-void
.end method

.method public constructor <init>()V
    .locals 5

    .line 1
    const v0, 0x7f0d02e2

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    new-instance v0, La/khf0;

    .line 8
    .line 9
    const-string v1, "KEY_STAGE_ID"

    .line 10
    .line 11
    invoke-direct {v0, v1}, La/khf0;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, La/syl0;->K1:La/khf0;

    .line 15
    .line 16
    new-instance v0, La/r34;

    .line 17
    .line 18
    const-string v1, "KEY_SPORT_ID"

    .line 19
    .line 20
    invoke-direct {v0, v1}, La/r34;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, La/syl0;->L1:La/r34;

    .line 24
    .line 25
    new-instance v0, La/r34;

    .line 26
    .line 27
    const-string v1, "KEY_SUB_SPORT_ID"

    .line 28
    .line 29
    invoke-direct {v0, v1}, La/r34;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    iput-object v0, p0, La/syl0;->M1:La/r34;

    .line 33
    .line 34
    new-instance v0, La/r34;

    .line 35
    .line 36
    const-string v1, "KEY_GLOBAL_CHAMP_ID"

    .line 37
    .line 38
    invoke-direct {v0, v1}, La/r34;-><init>(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    iput-object v0, p0, La/syl0;->N1:La/r34;

    .line 42
    .line 43
    new-instance v0, La/yzn0;

    .line 44
    .line 45
    const-string v1, "LAST_STYLE_CODE"

    .line 46
    .line 47
    invoke-direct {v0, v1}, La/yzn0;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    iput-object v0, p0, La/syl0;->O1:La/yzn0;

    .line 51
    .line 52
    new-instance v0, Ljava/util/HashMap;

    .line 53
    .line 54
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 55
    .line 56
    .line 57
    iput-object v0, p0, La/syl0;->V1:Ljava/util/HashMap;

    .line 58
    .line 59
    sget-object v0, La/qyl0;->a:La/qyl0;

    .line 60
    .line 61
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    iput-object v0, p0, La/syl0;->X1:La/s0r;

    .line 66
    .line 67
    new-instance v0, La/lyl0;

    .line 68
    .line 69
    const/4 v1, 0x1

    .line 70
    invoke-direct {v0, p0, v1}, La/lyl0;-><init>(La/syl0;B)V

    .line 71
    .line 72
    .line 73
    sget-object v2, La/wez;->b:La/wez;

    .line 74
    .line 75
    invoke-static {v2, v0}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    iput-object v0, p0, La/syl0;->a2:La/a8z;

    .line 80
    .line 81
    const-class v0, La/w3m0;

    .line 82
    .line 83
    sget-object v2, La/sre0;->a:La/tre0;

    .line 84
    .line 85
    invoke-virtual {v2, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    new-instance v2, La/lyl0;

    .line 90
    .line 91
    const/4 v3, 0x2

    .line 92
    invoke-direct {v2, p0, v3}, La/lyl0;-><init>(La/syl0;B)V

    .line 93
    .line 94
    .line 95
    invoke-static {p0, v0, v2}, La/xbc;->b0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    iput-object v0, p0, La/syl0;->b2:La/a8z;

    .line 100
    .line 101
    iput-boolean v1, p0, La/syl0;->c2:Z

    .line 102
    .line 103
    new-instance v0, La/v62;

    .line 104
    .line 105
    const/16 v1, 0x14

    .line 106
    .line 107
    invoke-direct {v0, p0, v1}, La/v62;-><init>(Ljava/lang/Object;B)V

    .line 108
    .line 109
    .line 110
    iput-object v0, p0, La/syl0;->d2:La/v62;

    .line 111
    .line 112
    new-instance v0, La/tvj;

    .line 113
    .line 114
    new-instance v1, La/kyl0;

    .line 115
    .line 116
    invoke-direct {v1, p0, v3}, La/kyl0;-><init>(La/syl0;B)V

    .line 117
    .line 118
    .line 119
    new-instance v2, La/kyl0;

    .line 120
    .line 121
    const/4 v3, 0x3

    .line 122
    invoke-direct {v2, p0, v3}, La/kyl0;-><init>(La/syl0;B)V

    .line 123
    .line 124
    .line 125
    const/4 v3, 0x0

    .line 126
    const/16 v4, 0x33

    .line 127
    .line 128
    invoke-direct {v0, v1, v2, v3, v4}, La/tvj;-><init>(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;I)V

    .line 129
    .line 130
    .line 131
    iput-object v0, p0, La/syl0;->e2:La/tvj;

    .line 132
    .line 133
    return-void
.end method


# virtual methods
.method public final C0()V
    .locals 1

    .line 1
    iget-object v0, p0, La/syl0;->a2:La/a8z;

    .line 2
    .line 3
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, La/mwi;

    .line 8
    .line 9
    invoke-virtual {v0}, La/mwi;->a()La/fiu0;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, La/syl0;->Y1:La/fiu0;

    .line 14
    .line 15
    return-void
.end method

.method public final D0()V
    .locals 6

    .line 1
    invoke-virtual {p0}, La/syl0;->H0()La/k3t0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, La/k3t0;->w()La/gmq;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sget-object v1, La/lkz;->a:La/lkz;

    .line 10
    .line 11
    new-instance v1, La/ssl0;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    const/4 v3, 0x3

    .line 15
    invoke-direct {v1, p0, v2, v3}, La/ssl0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 16
    .line 17
    .line 18
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-interface {p0}, La/clz;->x()La/glz;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    invoke-static {v4}, La/x0x;->Q(La/glz;)La/tkz;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    new-instance v5, La/zol0;

    .line 31
    .line 32
    invoke-direct {v5, v0, p0, v1, v2}, La/zol0;-><init>(La/gmq;La/clz;La/ssl0;La/yje;)V

    .line 33
    .line 34
    .line 35
    invoke-static {v4, v2, v2, v5, v3}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public final G0()La/c5r;
    .locals 2

    .line 1
    sget-object v0, La/syl0;->g2:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x5

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/syl0;->X1:La/s0r;

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
    check-cast p0, La/c5r;

    .line 16
    .line 17
    return-object p0
.end method

.method public final H0()La/k3t0;
    .locals 0

    .line 1
    iget-object p0, p0, La/syl0;->b2:La/a8z;

    .line 2
    .line 3
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/k3t0;

    .line 8
    .line 9
    return-object p0
.end method

.method public final I0()V
    .locals 7

    .line 1
    sget-object v0, La/nyl0;->c:La/nyl0;

    .line 2
    .line 3
    sget-object v1, La/syl0;->g2:[La/iiy;

    .line 4
    .line 5
    const/4 v2, 0x4

    .line 6
    aget-object v1, v1, v2

    .line 7
    .line 8
    iget-object v2, p0, La/syl0;->O1:La/yzn0;

    .line 9
    .line 10
    invoke-virtual {v2, p0, v1, v0}, La/yzn0;->u(Landroidx/fragment/app/Fragment;La/iiy;Ljava/io/Serializable;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->B()La/kxq;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    sget-object v0, La/j5d;->a:Landroid/util/TypedValue;

    .line 30
    .line 31
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    const v3, 0x7f040ae3

    .line 36
    .line 37
    .line 38
    const/4 v4, 0x1

    .line 39
    invoke-static {v0, v3, v4}, La/j5d;->a(Landroid/content/Context;IZ)I

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 44
    .line 45
    .line 46
    move-result-object v5

    .line 47
    invoke-static {v5, v3, v4}, La/j5d;->a(Landroid/content/Context;IZ)I

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->B()La/kxq;

    .line 52
    .line 53
    .line 54
    move-result-object v5

    .line 55
    invoke-static {v5}, La/qem0;->r(Landroid/content/Context;)Z

    .line 56
    .line 57
    .line 58
    move-result v5

    .line 59
    xor-int/2addr v5, v4

    .line 60
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->B()La/kxq;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    invoke-static {p0}, La/qem0;->r(Landroid/content/Context;)Z

    .line 65
    .line 66
    .line 67
    move-result p0

    .line 68
    xor-int/lit8 v6, p0, 0x1

    .line 69
    .line 70
    move v4, v3

    .line 71
    move v3, v0

    .line 72
    invoke-static/range {v1 .. v6}, La/ofm0;->A(Landroid/view/Window;Landroid/content/Context;IIZZ)V

    .line 73
    .line 74
    .line 75
    :cond_0
    return-void
.end method

.method public final J0()V
    .locals 7

    .line 1
    sget-object v0, La/nyl0;->d:La/nyl0;

    .line 2
    .line 3
    sget-object v1, La/syl0;->g2:[La/iiy;

    .line 4
    .line 5
    const/4 v2, 0x4

    .line 6
    aget-object v1, v1, v2

    .line 7
    .line 8
    iget-object v2, p0, La/syl0;->O1:La/yzn0;

    .line 9
    .line 10
    invoke-virtual {v2, p0, v1, v0}, La/yzn0;->u(Landroidx/fragment/app/Fragment;La/iiy;Ljava/io/Serializable;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->B()La/kxq;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    sget-object v0, La/j5d;->a:Landroid/util/TypedValue;

    .line 30
    .line 31
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    const v3, 0x7f040ae3

    .line 36
    .line 37
    .line 38
    const/4 v4, 0x1

    .line 39
    invoke-static {v0, v3, v4}, La/j5d;->a(Landroid/content/Context;IZ)I

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->B()La/kxq;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    invoke-static {p0}, La/qem0;->r(Landroid/content/Context;)Z

    .line 48
    .line 49
    .line 50
    move-result p0

    .line 51
    xor-int/lit8 v6, p0, 0x1

    .line 52
    .line 53
    const v3, 0x7f0606d8

    .line 54
    .line 55
    .line 56
    const/4 v5, 0x0

    .line 57
    move v4, v0

    .line 58
    invoke-static/range {v1 .. v6}, La/ofm0;->A(Landroid/view/Window;Landroid/content/Context;IIZZ)V

    .line 59
    .line 60
    .line 61
    :cond_0
    return-void
.end method

.method public final K0(Z)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const v1, 0x7f05000f

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getBoolean(I)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    const v0, 0x7f0d0576

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const v0, 0x7f0d0575

    .line 23
    .line 24
    .line 25
    :goto_0
    invoke-virtual {p0}, La/syl0;->G0()La/c5r;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    iget-object p0, p0, La/c5r;->f:Lorg/xplatform/ui_core/viewcomponents/layouts/linear/ShimmerLinearLayout;

    .line 30
    .line 31
    if-eqz p1, :cond_1

    .line 32
    .line 33
    invoke-virtual {p0, v0}, Lorg/xplatform/ui_core/viewcomponents/layouts/linear/ShimmerLinearLayout;->setShimmerItems(I)V

    .line 34
    .line 35
    .line 36
    :cond_1
    if-eqz p1, :cond_2

    .line 37
    .line 38
    const/4 p1, 0x0

    .line 39
    goto :goto_1

    .line 40
    :cond_2
    const/16 p1, 0x8

    .line 41
    .line 42
    :goto_1
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 43
    .line 44
    .line 45
    return-void
.end method

.method public final L0()V
    .locals 7

    .line 1
    sget-object v0, La/nyl0;->b:La/nyl0;

    .line 2
    .line 3
    sget-object v1, La/syl0;->g2:[La/iiy;

    .line 4
    .line 5
    const/4 v2, 0x4

    .line 6
    aget-object v1, v1, v2

    .line 7
    .line 8
    iget-object v2, p0, La/syl0;->O1:La/yzn0;

    .line 9
    .line 10
    invoke-virtual {v2, p0, v1, v0}, La/yzn0;->u(Landroidx/fragment/app/Fragment;La/iiy;Ljava/io/Serializable;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->B()La/kxq;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    sget-object v0, La/j5d;->a:Landroid/util/TypedValue;

    .line 30
    .line 31
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    const v3, 0x7f040ae3

    .line 36
    .line 37
    .line 38
    const/4 v4, 0x1

    .line 39
    invoke-static {v0, v3, v4}, La/j5d;->a(Landroid/content/Context;IZ)I

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->B()La/kxq;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    invoke-static {v3}, La/qem0;->r(Landroid/content/Context;)Z

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    xor-int/lit8 v5, v3, 0x1

    .line 52
    .line 53
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->B()La/kxq;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    invoke-static {p0}, La/qem0;->r(Landroid/content/Context;)Z

    .line 58
    .line 59
    .line 60
    move-result p0

    .line 61
    xor-int/lit8 v6, p0, 0x1

    .line 62
    .line 63
    const v3, 0x7f0606d8

    .line 64
    .line 65
    .line 66
    move v4, v0

    .line 67
    invoke-static/range {v1 .. v6}, La/ofm0;->A(Landroid/view/Window;Landroid/content/Context;IIZZ)V

    .line 68
    .line 69
    .line 70
    :cond_0
    return-void
.end method

.method public final M0(Z)V
    .locals 2

    .line 1
    invoke-virtual {p0}, La/syl0;->G0()La/c5r;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/c5r;->c:Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;

    .line 6
    .line 7
    const/16 v1, 0x8

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;->setVisibility(I)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, La/syl0;->G0()La/c5r;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iget-object v0, v0, La/c5r;->g:Landroidx/recyclerview/widget/RecyclerView;

    .line 17
    .line 18
    if-nez p1, :cond_0

    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    :cond_0
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, p1}, La/syl0;->K0(Z)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public final N0(Z)V
    .locals 4

    .line 1
    iget v0, p0, La/syl0;->S1:I

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->G()Landroid/content/res/Resources;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const v2, 0x7f07065a

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    add-int/2addr v1, v0

    .line 15
    iget v0, p0, La/syl0;->S1:I

    .line 16
    .line 17
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->G()Landroid/content/res/Resources;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    const v3, 0x7f0706c1

    .line 22
    .line 23
    .line 24
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    add-int/2addr v2, v0

    .line 29
    invoke-virtual {p0}, La/syl0;->G0()La/c5r;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    iget-object v0, v0, La/c5r;->d:Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    .line 34
    .line 35
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    check-cast v0, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 43
    .line 44
    if-eqz p1, :cond_0

    .line 45
    .line 46
    move v1, v2

    .line 47
    :cond_0
    iput v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 48
    .line 49
    invoke-virtual {p0}, La/syl0;->G0()La/c5r;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    iget-object p0, p0, La/c5r;->d:Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    .line 54
    .line 55
    invoke-virtual {p0, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 56
    .line 57
    .line 58
    return-void
.end method

.method public final V(Landroid/content/Context;)V
    .locals 11

    .line 1
    invoke-super {p0, p1}, La/yx5;->V(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-virtual {p1}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    instance-of v0, p1, La/af3;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    check-cast p1, La/af3;

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    move-object p1, v1

    .line 24
    :goto_0
    const-class v0, La/hgp0;

    .line 25
    .line 26
    if-eqz p1, :cond_3

    .line 27
    .line 28
    invoke-interface {p1}, La/af3;->d()La/wcf0;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-virtual {p1, v0}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    check-cast p1, La/o5d0;

    .line 37
    .line 38
    if-eqz p1, :cond_1

    .line 39
    .line 40
    invoke-interface {p1}, La/o5d0;->get()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    check-cast p1, La/ze3;

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_1
    move-object p1, v1

    .line 48
    :goto_1
    instance-of v2, p1, La/hgp0;

    .line 49
    .line 50
    if-nez v2, :cond_2

    .line 51
    .line 52
    goto :goto_2

    .line 53
    :cond_2
    move-object v1, p1

    .line 54
    :goto_2
    move-object v2, v1

    .line 55
    check-cast v2, La/hgp0;

    .line 56
    .line 57
    if-eqz v2, :cond_3

    .line 58
    .line 59
    invoke-static {p0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    const/4 p1, 0x0

    .line 64
    sget-object v0, La/syl0;->g2:[La/iiy;

    .line 65
    .line 66
    aget-object p1, v0, p1

    .line 67
    .line 68
    iget-object v1, p0, La/syl0;->K1:La/khf0;

    .line 69
    .line 70
    invoke-virtual {v1, p0, p1}, La/khf0;->w(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    move-object v4, p1

    .line 75
    check-cast v4, Lorg/xplatform/statistic/stage/api/domain/TypeStageId;

    .line 76
    .line 77
    const/4 p1, 0x2

    .line 78
    aget-object p1, v0, p1

    .line 79
    .line 80
    iget-object v1, p0, La/syl0;->M1:La/r34;

    .line 81
    .line 82
    invoke-virtual {v1, p0, p1}, La/r34;->e(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Long;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 87
    .line 88
    .line 89
    move-result-wide v7

    .line 90
    const/4 p1, 0x1

    .line 91
    aget-object p1, v0, p1

    .line 92
    .line 93
    iget-object v1, p0, La/syl0;->L1:La/r34;

    .line 94
    .line 95
    invoke-virtual {v1, p0, p1}, La/r34;->e(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Long;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 100
    .line 101
    .line 102
    move-result-wide v5

    .line 103
    const/4 p1, 0x3

    .line 104
    aget-object p1, v0, p1

    .line 105
    .line 106
    iget-object v0, p0, La/syl0;->N1:La/r34;

    .line 107
    .line 108
    invoke-virtual {v0, p0, p1}, La/r34;->e(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Long;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 113
    .line 114
    .line 115
    move-result-wide v9

    .line 116
    invoke-virtual/range {v2 .. v10}, La/hgp0;->a(La/i1w0;Lorg/xplatform/statistic/stage/api/domain/TypeStageId;JJJ)La/mwi;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    invoke-virtual {p1}, La/mwi;->a()La/fiu0;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    iput-object p1, p0, La/syl0;->Y1:La/fiu0;

    .line 125
    .line 126
    return-void

    .line 127
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 128
    .line 129
    invoke-static {v0, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object p0

    .line 133
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    return-void
.end method

.method public final Z()V
    .locals 3

    .line 1
    invoke-super {p0}, La/yx5;->Z()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, La/syl0;->G0()La/c5r;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget-object v0, v0, La/c5r;->g:Landroidx/recyclerview/widget/RecyclerView;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(La/yge0;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, La/syl0;->G0()La/c5r;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iget-object v0, v0, La/c5r;->g:Landroidx/recyclerview/widget/RecyclerView;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setOnFlingListener(La/jhe0;)V

    .line 21
    .line 22
    .line 23
    iput-object v1, p0, La/syl0;->W1:La/zfb;

    .line 24
    .line 25
    invoke-virtual {p0}, La/syl0;->H0()La/k3t0;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    new-instance v1, La/vzl0;

    .line 30
    .line 31
    const/4 v2, 0x0

    .line 32
    invoke-direct {v1, v2}, La/vzl0;-><init>(Z)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->K()La/n6r;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-virtual {v0}, La/n6r;->b()V

    .line 43
    .line 44
    .line 45
    iget-object v0, v0, La/n6r;->c:La/glz;

    .line 46
    .line 47
    iget-object p0, p0, La/syl0;->e2:La/tvj;

    .line 48
    .line 49
    invoke-virtual {v0, p0}, La/glz;->f(La/blz;)V

    .line 50
    .line 51
    .line 52
    return-void
.end method

.method public final e0()V
    .locals 2

    .line 1
    invoke-super {p0}, La/yx5;->e0()V

    .line 2
    .line 3
    .line 4
    sget-object v0, La/syl0;->g2:[La/iiy;

    .line 5
    .line 6
    const/4 v1, 0x4

    .line 7
    aget-object v0, v0, v1

    .line 8
    .line 9
    iget-object v1, p0, La/syl0;->O1:La/yzn0;

    .line 10
    .line 11
    invoke-virtual {v1, p0, v0}, La/yzn0;->k(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/io/Serializable;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, La/nyl0;

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    const/4 v1, 0x1

    .line 22
    if-eq v0, v1, :cond_2

    .line 23
    .line 24
    const/4 v1, 0x2

    .line 25
    if-eq v0, v1, :cond_1

    .line 26
    .line 27
    const/4 v1, 0x3

    .line 28
    if-eq v0, v1, :cond_0

    .line 29
    .line 30
    return-void

    .line 31
    :cond_0
    invoke-virtual {p0}, La/syl0;->J0()V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :cond_1
    invoke-virtual {p0}, La/syl0;->I0()V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :cond_2
    invoke-virtual {p0}, La/syl0;->L0()V

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method public final g0()V
    .locals 3

    .line 1
    invoke-super {p0}, La/yx5;->g0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    iget v1, v1, Landroid/view/WindowManager$LayoutParams;->softInputMode:I

    .line 17
    .line 18
    iput v1, p0, La/syl0;->P1:I

    .line 19
    .line 20
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 21
    .line 22
    const/16 v2, 0x1d

    .line 23
    .line 24
    if-le v1, v2, :cond_0

    .line 25
    .line 26
    const/16 v1, 0x30

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Landroid/view/Window;->setSoftInputMode(I)V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    const/16 v1, 0x10

    .line 33
    .line 34
    invoke-virtual {v0, v1}, Landroid/view/Window;->setSoftInputMode(I)V

    .line 35
    .line 36
    .line 37
    :goto_0
    invoke-virtual {p0}, La/syl0;->H0()La/k3t0;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    sget-object v0, La/uzl0;->a:La/uzl0;

    .line 42
    .line 43
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    return-void
.end method

.method public final h0()V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->j1:Z

    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iget v1, p0, La/syl0;->P1:I

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Landroid/view/Window;->setSoftInputMode(I)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, La/syl0;->H0()La/k3t0;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    sget-object v0, La/tzl0;->a:La/tzl0;

    .line 22
    .line 23
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public final i0(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-super {p0, p1, p2}, La/yx5;->i0(Landroid/view/View;Landroid/os/Bundle;)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->q0()Landroid/view/View;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    new-instance p2, La/epi0;

    .line 12
    .line 13
    const/16 v0, 0xa

    .line 14
    .line 15
    invoke-direct {p2, p0, v0}, La/epi0;-><init>(Ljava/lang/Object;B)V

    .line 16
    .line 17
    .line 18
    sget-object v0, La/rgu0;->a:Ljava/util/WeakHashMap;

    .line 19
    .line 20
    invoke-static {p1, p2}, La/igu0;->c(Landroid/view/View;La/zf60;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, La/syl0;->G0()La/c5r;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    iget-object p1, p1, La/c5r;->d:Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    .line 28
    .line 29
    const/4 p2, 0x1

    .line 30
    invoke-static {p1, p2}, La/knm0;->h(Landroid/view/View;Z)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0}, La/syl0;->G0()La/c5r;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    iget-object p1, p1, La/c5r;->b:Landroidx/compose/ui/platform/ComposeView;

    .line 38
    .line 39
    new-instance v0, La/owp0;

    .line 40
    .line 41
    invoke-direct {v0, p0}, La/owp0;-><init>(La/clz;)V

    .line 42
    .line 43
    .line 44
    new-instance v1, La/kyl0;

    .line 45
    .line 46
    const/4 v2, 0x0

    .line 47
    invoke-direct {v1, p0, v2}, La/kyl0;-><init>(La/syl0;B)V

    .line 48
    .line 49
    .line 50
    new-instance v3, La/ugd;

    .line 51
    .line 52
    const v4, 0x355d08b3

    .line 53
    .line 54
    .line 55
    invoke-direct {v3, v4, p2, v1}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    const/4 v1, 0x0

    .line 59
    invoke-static {p1, v0, v1, v3}, La/pkd;->h(Landroidx/compose/ui/platform/ComposeView;La/vgu0;La/shd;La/ugd;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->K()La/n6r;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    invoke-virtual {p1}, La/n6r;->b()V

    .line 67
    .line 68
    .line 69
    iget-object p1, p1, La/n6r;->c:La/glz;

    .line 70
    .line 71
    iget-object v0, p0, La/syl0;->e2:La/tvj;

    .line 72
    .line 73
    invoke-virtual {p1, v0}, La/glz;->a(La/blz;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->G()Landroid/content/res/Resources;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    const v0, 0x7f0706f1

    .line 81
    .line 82
    .line 83
    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 84
    .line 85
    .line 86
    move-result p1

    .line 87
    invoke-virtual {p0}, La/syl0;->G0()La/c5r;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    iget-object v0, v0, La/c5r;->e:Landroid/widget/FrameLayout;

    .line 92
    .line 93
    invoke-virtual {v0, p2}, Landroid/view/View;->setClipToOutline(Z)V

    .line 94
    .line 95
    .line 96
    new-instance v1, La/pyl0;

    .line 97
    .line 98
    invoke-direct {v1, p1, v2}, La/pyl0;-><init>(IB)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v0, v1}, Landroid/view/View;->setOutlineProvider(Landroid/view/ViewOutlineProvider;)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {p0}, La/syl0;->G0()La/c5r;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    iget-object p1, p1, La/c5r;->c:Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;

    .line 109
    .line 110
    new-instance v0, La/lyl0;

    .line 111
    .line 112
    invoke-direct {v0, p0, v2}, La/lyl0;-><init>(La/syl0;B)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {p1, v0}, Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;->setButtonOnClickListener(Lkotlin/jvm/functions/Function0;)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {p0}, La/syl0;->G0()La/c5r;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    iget-object p1, p1, La/c5r;->a:Landroid/widget/FrameLayout;

    .line 123
    .line 124
    invoke-static {p1}, La/jk3;->b(Landroid/view/ViewGroup;)La/jk3;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    iput-object p1, p0, La/syl0;->Z1:La/jk3;

    .line 129
    .line 130
    iget-object p1, p1, La/jk3;->d:Landroid/view/View;

    .line 131
    .line 132
    check-cast p1, Landroid/widget/ImageView;

    .line 133
    .line 134
    new-instance v0, La/myl0;

    .line 135
    .line 136
    invoke-direct {v0, p0, v2}, La/myl0;-><init>(La/syl0;B)V

    .line 137
    .line 138
    .line 139
    invoke-static {p1, v0}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 140
    .line 141
    .line 142
    iget-object p1, p0, La/syl0;->Z1:La/jk3;

    .line 143
    .line 144
    if-eqz p1, :cond_0

    .line 145
    .line 146
    iget-object p1, p1, La/jk3;->c:Landroid/view/View;

    .line 147
    .line 148
    check-cast p1, Landroid/widget/ImageView;

    .line 149
    .line 150
    new-instance v0, La/myl0;

    .line 151
    .line 152
    invoke-direct {v0, p0, p2}, La/myl0;-><init>(La/syl0;B)V

    .line 153
    .line 154
    .line 155
    invoke-static {p1, v0}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 156
    .line 157
    .line 158
    :cond_0
    return-void
.end method

.method public final x0()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, La/syl0;->c2:Z

    .line 2
    .line 3
    return p0
.end method
