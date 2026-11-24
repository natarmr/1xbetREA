.class public final La/piw;
.super La/yx5;
.source "SourceFile"

# interfaces
.implements La/tah0;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0006"
    }
    d2 = {
        "La/piw;",
        "La/yx5;",
        "La/tah0;",
        "<init>",
        "()V",
        "a/sqt",
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
.field public static final Y1:La/sqt;

.field public static final synthetic Z1:[La/iiy;


# instance fields
.field public K1:La/fiu0;

.field public L1:La/ujd;

.field public M1:La/pru;

.field public N1:La/wdk0;

.field public O1:La/poq0;

.field public final P1:Z

.field public final Q1:La/a8z;

.field public final R1:La/a8z;

.field public final S1:La/khf0;

.field public final U1:La/s0r;

.field public final V1:La/qdz;

.field public final W1:La/n0o0;

.field public X1:La/bjw;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/piw;

    .line 4
    .line 5
    const-string v2, "params"

    .line 6
    .line 7
    const-string v3, "getParams()Lorg/xplatform/cyber/section/api/home/CyberHomeParams;"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    new-instance v2, La/j0d0;

    .line 14
    .line 15
    const-string v3, "binding"

    .line 16
    .line 17
    const-string v5, "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;"

    .line 18
    .line 19
    invoke-direct {v2, v1, v3, v5, v4}, La/j0d0;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    const/4 v1, 0x2

    .line 23
    new-array v1, v1, [La/iiy;

    .line 24
    .line 25
    aput-object v0, v1, v4

    .line 26
    .line 27
    const/4 v0, 0x1

    .line 28
    aput-object v2, v1, v0

    .line 29
    .line 30
    sput-object v1, La/piw;->Z1:[La/iiy;

    .line 31
    .line 32
    new-instance v0, La/sqt;

    .line 33
    .line 34
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 35
    .line 36
    .line 37
    sput-object v0, La/piw;->Y1:La/sqt;

    .line 38
    .line 39
    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    const v0, 0x7f0d0089

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    iput-boolean v0, p0, La/piw;->P1:Z

    .line 9
    .line 10
    new-instance v1, La/miw;

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    invoke-direct {v1, p0, v2}, La/miw;-><init>(La/piw;B)V

    .line 14
    .line 15
    .line 16
    sget-object v2, La/wez;->b:La/wez;

    .line 17
    .line 18
    invoke-static {v2, v1}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    iput-object v1, p0, La/piw;->Q1:La/a8z;

    .line 23
    .line 24
    const-class v1, La/ukw;

    .line 25
    .line 26
    sget-object v2, La/sre0;->a:La/tre0;

    .line 27
    .line 28
    invoke-virtual {v2, v1}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    new-instance v2, La/miw;

    .line 33
    .line 34
    invoke-direct {v2, p0, v0}, La/miw;-><init>(La/piw;B)V

    .line 35
    .line 36
    .line 37
    invoke-static {p0, v1, v2}, La/xbc;->b0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    iput-object v0, p0, La/piw;->R1:La/a8z;

    .line 42
    .line 43
    new-instance v0, La/khf0;

    .line 44
    .line 45
    const-string v1, "params_key"

    .line 46
    .line 47
    invoke-direct {v0, v1}, La/khf0;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    iput-object v0, p0, La/piw;->S1:La/khf0;

    .line 51
    .line 52
    sget-object v0, La/niw;->a:La/niw;

    .line 53
    .line 54
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    iput-object v0, p0, La/piw;->U1:La/s0r;

    .line 59
    .line 60
    new-instance v0, La/qdz;

    .line 61
    .line 62
    invoke-direct {v0}, La/qdz;-><init>()V

    .line 63
    .line 64
    .line 65
    iput-object v0, p0, La/piw;->V1:La/qdz;

    .line 66
    .line 67
    new-instance v0, La/miw;

    .line 68
    .line 69
    const/4 v1, 0x2

    .line 70
    invoke-direct {v0, p0, v1}, La/miw;-><init>(La/piw;B)V

    .line 71
    .line 72
    .line 73
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    iput-object v0, p0, La/piw;->W1:La/n0o0;

    .line 78
    .line 79
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    new-instance p1, La/miw;

    .line 2
    .line 3
    const/4 v0, 0x3

    .line 4
    invoke-direct {p1, p0, v0}, La/miw;-><init>(La/piw;B)V

    .line 5
    .line 6
    .line 7
    invoke-static {p0, p1}, La/qcc;->X(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function0;)V

    .line 8
    .line 9
    .line 10
    iget-object p1, p0, La/piw;->N1:La/wdk0;

    .line 11
    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    iget-boolean v0, p0, La/piw;->P1:Z

    .line 15
    .line 16
    invoke-static {p1, p0, v0}, La/wdk0;->l(La/wdk0;Landroidx/fragment/app/Fragment;Z)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    const-string p0, "snackbarManager"

    .line 21
    .line 22
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    const/4 p0, 0x0

    .line 26
    throw p0
.end method

.method public final C0()V
    .locals 4

    .line 1
    iget-object v0, p0, La/piw;->Q1:La/a8z;

    .line 2
    .line 3
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, La/yii;

    .line 8
    .line 9
    new-instance v1, La/fiu0;

    .line 10
    .line 11
    const-class v2, La/ukw;

    .line 12
    .line 13
    iget-object v3, v0, La/yii;->L:La/tii;

    .line 14
    .line 15
    invoke-static {v2, v3}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-direct {v1, v2}, La/fiu0;-><init>(Ljava/util/Map;)V

    .line 20
    .line 21
    .line 22
    iput-object v1, p0, La/piw;->K1:La/fiu0;

    .line 23
    .line 24
    iget-object v1, v0, La/yii;->a:La/itr;

    .line 25
    .line 26
    invoke-interface {v1}, La/itr;->d()La/ujd;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-static {v1}, La/x1x;->x(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    iput-object v1, p0, La/piw;->L1:La/ujd;

    .line 34
    .line 35
    iget-object v1, v0, La/yii;->b:La/pru;

    .line 36
    .line 37
    iput-object v1, p0, La/piw;->M1:La/pru;

    .line 38
    .line 39
    iget-object v1, v0, La/yii;->c:La/wdk0;

    .line 40
    .line 41
    iput-object v1, p0, La/piw;->N1:La/wdk0;

    .line 42
    .line 43
    iget-object v0, v0, La/yii;->d:La/poq0;

    .line 44
    .line 45
    iput-object v0, p0, La/piw;->O1:La/poq0;

    .line 46
    .line 47
    return-void
.end method

.method public final D0()V
    .locals 5

    .line 1
    sget-object v0, La/piw;->Z1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v2, p0, La/piw;->U1:La/s0r;

    .line 7
    .line 8
    invoke-virtual {v2, v0, p0}, La/s0r;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    check-cast v0, La/aid;

    .line 16
    .line 17
    iget-object v0, v0, La/aid;->b:Landroidx/compose/ui/platform/ComposeView;

    .line 18
    .line 19
    new-instance v2, La/owp0;

    .line 20
    .line 21
    invoke-direct {v2, p0}, La/owp0;-><init>(La/clz;)V

    .line 22
    .line 23
    .line 24
    new-instance v3, La/xxv;

    .line 25
    .line 26
    const/4 v4, 0x6

    .line 27
    invoke-direct {v3, p0, v4}, La/xxv;-><init>(Ljava/lang/Object;B)V

    .line 28
    .line 29
    .line 30
    new-instance p0, La/ugd;

    .line 31
    .line 32
    const v4, -0x23c46a96

    .line 33
    .line 34
    .line 35
    invoke-direct {p0, v4, v1, v3}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    const/4 v1, 0x0

    .line 39
    invoke-static {v0, v2, v1, p0}, La/pkd;->h(Landroidx/compose/ui/platform/ComposeView;La/vgu0;La/shd;La/ugd;)V

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method public final G0()Lorg/xplatform/cyber/section/api/home/CyberHomeParams;
    .locals 2

    .line 1
    sget-object v0, La/piw;->Z1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/piw;->S1:La/khf0;

    .line 7
    .line 8
    invoke-virtual {v1, p0, v0}, La/khf0;->w(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, Lorg/xplatform/cyber/section/api/home/CyberHomeParams;

    .line 13
    .line 14
    return-object p0
.end method

.method public final H0()La/k3t0;
    .locals 0

    .line 1
    iget-object p0, p0, La/piw;->R1:La/a8z;

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

.method public final e0()V
    .locals 10

    .line 1
    invoke-super {p0}, La/yx5;->e0()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La/piw;->W1:La/n0o0;

    .line 5
    .line 6
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    check-cast v0, La/g5h;

    .line 11
    .line 12
    sget-object v1, La/g5h;->c:La/g5h;

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    const/4 v3, 0x1

    .line 16
    if-ne v0, v1, :cond_0

    .line 17
    .line 18
    invoke-virtual {p0}, La/piw;->G0()Lorg/xplatform/cyber/section/api/home/CyberHomeParams;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iget-object v0, v0, Lorg/xplatform/cyber/section/api/home/CyberHomeParams;->b:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesParentSectionModel;

    .line 23
    .line 24
    instance-of v0, v0, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesParentSectionModel$FromPopular;

    .line 25
    .line 26
    if-nez v0, :cond_0

    .line 27
    .line 28
    invoke-virtual {p0}, La/piw;->G0()Lorg/xplatform/cyber/section/api/home/CyberHomeParams;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    iget-object v0, v0, Lorg/xplatform/cyber/section/api/home/CyberHomeParams;->b:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesParentSectionModel;

    .line 33
    .line 34
    instance-of v0, v0, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesParentSectionModel$FromNewPopular;

    .line 35
    .line 36
    if-nez v0, :cond_0

    .line 37
    .line 38
    move v0, v3

    .line 39
    goto :goto_0

    .line 40
    :cond_0
    move v0, v2

    .line 41
    :goto_0
    if-eqz v0, :cond_1

    .line 42
    .line 43
    const v1, 0x7f060883

    .line 44
    .line 45
    .line 46
    :goto_1
    move v6, v1

    .line 47
    goto :goto_2

    .line 48
    :cond_1
    sget-object v1, La/j5d;->a:Landroid/util/TypedValue;

    .line 49
    .line 50
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    invoke-virtual {p0}, La/piw;->z0()La/j9o0;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    invoke-static {v4}, La/jtm0;->l(La/j9o0;)I

    .line 59
    .line 60
    .line 61
    move-result v4

    .line 62
    invoke-static {v1, v4, v3}, La/j5d;->a(Landroid/content/Context;IZ)I

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    goto :goto_1

    .line 67
    :goto_2
    if-eqz v0, :cond_3

    .line 68
    .line 69
    :cond_2
    move v8, v2

    .line 70
    goto :goto_3

    .line 71
    :cond_3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->B()La/kxq;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    invoke-static {v0}, La/qem0;->r(Landroid/content/Context;)Z

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    if-nez v0, :cond_2

    .line 80
    .line 81
    move v8, v3

    .line 82
    :goto_3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->B()La/kxq;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    if-eqz v0, :cond_4

    .line 87
    .line 88
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 89
    .line 90
    .line 91
    move-result-object v4

    .line 92
    if-eqz v4, :cond_4

    .line 93
    .line 94
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 95
    .line 96
    .line 97
    move-result-object v5

    .line 98
    sget-object v0, La/j5d;->a:Landroid/util/TypedValue;

    .line 99
    .line 100
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    invoke-virtual {p0}, La/piw;->z0()La/j9o0;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    invoke-static {v1}, La/jtm0;->k(La/j9o0;)I

    .line 109
    .line 110
    .line 111
    move-result v1

    .line 112
    invoke-static {v0, v1, v3}, La/j5d;->a(Landroid/content/Context;IZ)I

    .line 113
    .line 114
    .line 115
    move-result v7

    .line 116
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->B()La/kxq;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    invoke-static {p0}, La/qem0;->r(Landroid/content/Context;)Z

    .line 121
    .line 122
    .line 123
    move-result p0

    .line 124
    xor-int/lit8 v9, p0, 0x1

    .line 125
    .line 126
    invoke-static/range {v4 .. v9}, La/ofm0;->A(Landroid/view/Window;Landroid/content/Context;IIZZ)V

    .line 127
    .line 128
    .line 129
    :cond_4
    return-void
.end method

.method public final g0()V
    .locals 4

    .line 1
    invoke-super {p0}, La/yx5;->g0()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La/piw;->L1:La/ujd;

    .line 5
    .line 6
    if-eqz v0, :cond_3

    .line 7
    .line 8
    invoke-virtual {p0}, La/piw;->G0()Lorg/xplatform/cyber/section/api/home/CyberHomeParams;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    iget-object v1, v1, Lorg/xplatform/cyber/section/api/home/CyberHomeParams;->b:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesParentSectionModel;

    .line 13
    .line 14
    if-nez v1, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    instance-of v2, v1, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesParentSectionModel$FromPopular;

    .line 18
    .line 19
    if-eqz v2, :cond_1

    .line 20
    .line 21
    new-instance v1, La/fr2;

    .line 22
    .line 23
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 24
    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_1
    instance-of v1, v1, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesParentSectionModel$FromNewPopular;

    .line 28
    .line 29
    if-eqz v1, :cond_2

    .line 30
    .line 31
    new-instance v1, La/jr2;

    .line 32
    .line 33
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 34
    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_2
    :goto_0
    new-instance v1, La/rq2;

    .line 38
    .line 39
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 40
    .line 41
    .line 42
    :goto_1
    new-instance v2, La/kiw;

    .line 43
    .line 44
    const/4 v3, 0x0

    .line 45
    invoke-direct {v2, p0, v3}, La/kiw;-><init>(La/piw;B)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0, p0, v1, v2}, La/ujd;->c(Landroidx/fragment/app/Fragment;La/ms2;Lkotlin/jvm/functions/Function1;)V

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :cond_3
    const-string p0, "composeGameCardFragmentDelegate"

    .line 53
    .line 54
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    const/4 p0, 0x0

    .line 58
    throw p0
.end method

.method public final p()Z
    .locals 0

    .line 1
    iget-object p0, p0, La/piw;->X1:La/bjw;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, La/bjw;->b:La/xcz;

    .line 6
    .line 7
    invoke-virtual {p0}, La/xcz;->c()Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0

    .line 12
    :cond_0
    const/4 p0, 0x0

    .line 13
    return p0
.end method

.method public final w()V
    .locals 4

    .line 1
    iget-object p0, p0, La/piw;->X1:La/bjw;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, La/bjw;->a:La/vne;

    .line 6
    .line 7
    new-instance v1, La/wi6;

    .line 8
    .line 9
    iget-object p0, p0, La/bjw;->b:La/xcz;

    .line 10
    .line 11
    const/4 v2, 0x4

    .line 12
    const/4 v3, 0x0

    .line 13
    invoke-direct {v1, p0, v3, v2}, La/wi6;-><init>(La/xcz;La/yje;B)V

    .line 14
    .line 15
    .line 16
    const/4 p0, 0x3

    .line 17
    invoke-static {v0, v3, v3, v1, p0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
.end method

.method public final x0()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, La/piw;->P1:Z

    .line 2
    .line 3
    return p0
.end method

.method public final z0()La/j9o0;
    .locals 4

    .line 1
    new-instance v0, La/e9o0;

    .line 2
    .line 3
    iget-object v1, p0, La/piw;->W1:La/n0o0;

    .line 4
    .line 5
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    check-cast v1, La/g5h;

    .line 10
    .line 11
    sget-object v2, La/g5h;->d:La/g5h;

    .line 12
    .line 13
    const v3, 0x7f040ae3

    .line 14
    .line 15
    .line 16
    if-ne v1, v2, :cond_0

    .line 17
    .line 18
    invoke-virtual {p0}, La/piw;->G0()Lorg/xplatform/cyber/section/api/home/CyberHomeParams;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    iget-object v1, v1, Lorg/xplatform/cyber/section/api/home/CyberHomeParams;->b:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesParentSectionModel;

    .line 23
    .line 24
    instance-of v1, v1, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesParentSectionModel$FromPopular;

    .line 25
    .line 26
    if-nez v1, :cond_0

    .line 27
    .line 28
    invoke-virtual {p0}, La/piw;->G0()Lorg/xplatform/cyber/section/api/home/CyberHomeParams;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    iget-object p0, p0, Lorg/xplatform/cyber/section/api/home/CyberHomeParams;->b:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesParentSectionModel;

    .line 33
    .line 34
    instance-of p0, p0, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesParentSectionModel$FromNewPopular;

    .line 35
    .line 36
    if-nez p0, :cond_0

    .line 37
    .line 38
    const p0, 0x7f040ae1

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    move p0, v3

    .line 43
    :goto_0
    const/16 v1, 0xc

    .line 44
    .line 45
    invoke-direct {v0, p0, v3, v1}, La/e9o0;-><init>(III)V

    .line 46
    .line 47
    .line 48
    return-object v0
.end method
