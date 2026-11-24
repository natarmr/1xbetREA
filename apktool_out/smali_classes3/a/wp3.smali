.class public final La/wp3;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0000\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "La/wp3;",
        "La/yx5;",
        "<init>",
        "()V",
        "apple_fortune"
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
    const-class v1, La/wp3;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/apple_fortune/databinding/FragmentAppleFortuneBinding;"

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
    sput-object v1, La/wp3;->O1:[La/iiy;

    .line 19
    .line 20
    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    const v0, 0x7f0d01f3

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
    iput-object v0, p0, La/wp3;->K1:La/i9o0;

    .line 10
    .line 11
    new-instance v0, La/a13;

    .line 12
    .line 13
    const/16 v1, 0x11

    .line 14
    .line 15
    invoke-direct {v0, p0, v1}, La/a13;-><init>(Ljava/lang/Object;B)V

    .line 16
    .line 17
    .line 18
    new-instance v1, La/f80;

    .line 19
    .line 20
    const/16 v2, 0x16

    .line 21
    .line 22
    invoke-direct {v1, p0, v2}, La/f80;-><init>(Ljava/lang/Object;B)V

    .line 23
    .line 24
    .line 25
    sget-object v2, La/wez;->b:La/wez;

    .line 26
    .line 27
    new-instance v3, La/f80;

    .line 28
    .line 29
    const/16 v4, 0x17

    .line 30
    .line 31
    invoke-direct {v3, v1, v4}, La/f80;-><init>(Ljava/lang/Object;B)V

    .line 32
    .line 33
    .line 34
    invoke-static {v2, v3}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    const-class v2, La/kq3;

    .line 39
    .line 40
    sget-object v3, La/sre0;->a:La/tre0;

    .line 41
    .line 42
    invoke-virtual {v3, v2}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    new-instance v3, La/t51;

    .line 47
    .line 48
    const/16 v4, 0xe

    .line 49
    .line 50
    invoke-direct {v3, v1, v4}, La/t51;-><init>(La/a8z;B)V

    .line 51
    .line 52
    .line 53
    new-instance v4, La/t51;

    .line 54
    .line 55
    const/16 v5, 0xf

    .line 56
    .line 57
    invoke-direct {v4, v1, v5}, La/t51;-><init>(La/a8z;B)V

    .line 58
    .line 59
    .line 60
    invoke-static {p0, v2, v3, v4, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    iput-object v0, p0, La/wp3;->M1:La/kiu0;

    .line 65
    .line 66
    sget-object v0, La/up3;->a:La/up3;

    .line 67
    .line 68
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    iput-object v0, p0, La/wp3;->N1:La/s0r;

    .line 73
    .line 74
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 6

    .line 1
    invoke-virtual {p0}, La/wp3;->G0()La/ayq;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object v0, p1, La/ayq;->b:Lorg/xplatform/apple_fortune/presentation/views/AppleFortuneCellGameView;

    .line 6
    .line 7
    new-instance v1, La/df1;

    .line 8
    .line 9
    const/16 v2, 0x1c

    .line 10
    .line 11
    invoke-direct {v1, p1, p0, v2}, La/df1;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 12
    .line 13
    .line 14
    new-instance v2, La/tp3;

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    invoke-direct {v2, p1, p0, v3}, La/tp3;-><init>(La/ayq;La/wp3;B)V

    .line 18
    .line 19
    .line 20
    new-instance v3, La/tp3;

    .line 21
    .line 22
    const/4 v4, 0x1

    .line 23
    invoke-direct {v3, p1, p0, v4}, La/tp3;-><init>(La/ayq;La/wp3;B)V

    .line 24
    .line 25
    .line 26
    new-instance v4, La/tp3;

    .line 27
    .line 28
    const/4 v5, 0x2

    .line 29
    invoke-direct {v4, p1, p0, v5}, La/tp3;-><init>(La/ayq;La/wp3;B)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, v1, v2, v3, v4}, Lorg/xplatform/apple_fortune/presentation/views/AppleFortuneCellGameView;->x(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public final C0()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->y:Landroidx/fragment/app/Fragment;

    .line 2
    .line 3
    instance-of v1, v0, La/rp3;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    check-cast v0, La/rp3;

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
    iget-object v0, v0, La/rp3;->W1:La/n0o0;

    .line 14
    .line 15
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, La/q8i;

    .line 20
    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    new-instance v1, La/fiu0;

    .line 24
    .line 25
    const-class v2, La/kq3;

    .line 26
    .line 27
    iget-object v0, v0, La/q8i;->j0:La/r5i;

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
    iput-object v1, p0, La/wp3;->L1:La/fiu0;

    .line 37
    .line 38
    :cond_1
    return-void
.end method

.method public final D0()V
    .locals 17

    .line 1
    invoke-virtual/range {p0 .. p0}, La/wp3;->H0()La/kq3;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/kq3;->y:La/p7m0;

    .line 6
    .line 7
    new-instance v1, La/vp3;

    .line 8
    .line 9
    const/4 v7, 0x4

    .line 10
    const/4 v8, 0x0

    .line 11
    const/4 v2, 0x2

    .line 12
    const-class v4, La/wp3;

    .line 13
    .line 14
    const-string v5, "handleConnectionState"

    .line 15
    .line 16
    const-string v6, "handleConnectionState(Z)V"

    .line 17
    .line 18
    move-object/from16 v3, p0

    .line 19
    .line 20
    invoke-direct/range {v1 .. v8}, La/vp3;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 21
    .line 22
    .line 23
    sget-object v2, La/lkz;->a:La/lkz;

    .line 24
    .line 25
    invoke-static/range {p0 .. p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-interface {v2}, La/clz;->x()La/glz;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    invoke-static {v3}, La/x0x;->Q(La/glz;)La/tkz;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    new-instance v5, La/tg3;

    .line 38
    .line 39
    const/4 v6, 0x0

    .line 40
    invoke-direct {v5, v0, v2, v1, v6}, La/tg3;-><init>(La/gmq;La/clz;La/vp3;La/yje;)V

    .line 41
    .line 42
    .line 43
    const/4 v0, 0x3

    .line 44
    invoke-static {v3, v6, v6, v5, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 45
    .line 46
    .line 47
    invoke-virtual/range {p0 .. p0}, La/wp3;->H0()La/kq3;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    iget-object v7, v1, La/kq3;->x:La/p7m0;

    .line 52
    .line 53
    new-instance v9, La/vp3;

    .line 54
    .line 55
    const/4 v15, 0x4

    .line 56
    const/16 v16, 0x1

    .line 57
    .line 58
    const/4 v10, 0x2

    .line 59
    const-string v13, "handleAppleFortuneScreen"

    .line 60
    .line 61
    const-string v14, "handleAppleFortuneScreen(Lorg/xplatform/apple_fortune/presentation/models/AppleFortuneScreenState;)V"

    .line 62
    .line 63
    move-object/from16 v11, p0

    .line 64
    .line 65
    move-object v12, v4

    .line 66
    invoke-direct/range {v9 .. v16}, La/vp3;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 67
    .line 68
    .line 69
    invoke-static/range {p0 .. p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 70
    .line 71
    .line 72
    move-result-object v8

    .line 73
    invoke-interface {v8}, La/clz;->x()La/glz;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    invoke-static {v1}, La/x0x;->Q(La/glz;)La/tkz;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    move-object v10, v6

    .line 82
    new-instance v6, La/tg3;

    .line 83
    .line 84
    const/4 v11, 0x0

    .line 85
    invoke-direct/range {v6 .. v11}, La/tg3;-><init>(La/gmq;La/clz;La/vp3;La/yje;B)V

    .line 86
    .line 87
    .line 88
    invoke-static {v1, v10, v10, v6, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 89
    .line 90
    .line 91
    return-void
.end method

.method public final G0()La/ayq;
    .locals 2

    .line 1
    sget-object v0, La/wp3;->O1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/wp3;->N1:La/s0r;

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
    check-cast p0, La/ayq;

    .line 16
    .line 17
    return-object p0
.end method

.method public final H0()La/kq3;
    .locals 0

    .line 1
    iget-object p0, p0, La/wp3;->M1:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/kq3;

    .line 8
    .line 9
    return-object p0
.end method

.method public final Z()V
    .locals 7

    .line 1
    invoke-virtual {p0}, La/wp3;->H0()La/kq3;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, v0, La/kq3;->x:La/p7m0;

    .line 6
    .line 7
    iget-object v2, v0, La/kq3;->w:La/p7m0;

    .line 8
    .line 9
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    sget-object v4, La/sp3;->c:La/sp3;

    .line 14
    .line 15
    if-ne v3, v4, :cond_0

    .line 16
    .line 17
    invoke-virtual {v0}, La/kq3;->E()V

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    sget-object v4, La/sp3;->e:La/sp3;

    .line 26
    .line 27
    const/4 v5, 0x0

    .line 28
    if-ne v3, v4, :cond_1

    .line 29
    .line 30
    new-instance v3, La/zq3;

    .line 31
    .line 32
    new-instance v4, La/cr3;

    .line 33
    .line 34
    iget-object v6, v0, La/kq3;->v:Ljava/lang/String;

    .line 35
    .line 36
    iget-object v0, v0, La/kq3;->q:La/mp3;

    .line 37
    .line 38
    invoke-virtual {v0}, La/mp3;->a()La/dr3;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-direct {v4, v6, v0}, La/cr3;-><init>(Ljava/lang/String;La/dr3;)V

    .line 43
    .line 44
    .line 45
    invoke-direct {v3, v4}, La/zq3;-><init>(La/cr3;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1, v5, v3}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    sget-object v0, La/sp3;->f:La/sp3;

    .line 55
    .line 56
    invoke-virtual {v2, v5, v0}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_1
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    sget-object v3, La/sp3;->a:La/sp3;

    .line 65
    .line 66
    if-ne v0, v3, :cond_2

    .line 67
    .line 68
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    sget-object v0, La/ar3;->a:La/ar3;

    .line 72
    .line 73
    invoke-virtual {v1, v5, v0}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v5, v3}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    :cond_2
    :goto_0
    invoke-super {p0}, La/yx5;->Z()V

    .line 80
    .line 81
    .line 82
    return-void
.end method

.method public final d0()V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->j1:Z

    .line 3
    .line 4
    invoke-virtual {p0}, La/wp3;->H0()La/kq3;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    iget-object v0, p0, La/kq3;->w:La/p7m0;

    .line 9
    .line 10
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    sget-object v1, La/sp3;->c:La/sp3;

    .line 15
    .line 16
    if-ne v0, v1, :cond_0

    .line 17
    .line 18
    invoke-virtual {p0}, La/kq3;->E()V

    .line 19
    .line 20
    .line 21
    :cond_0
    return-void
.end method

.method public final z0()La/j9o0;
    .locals 0

    .line 1
    iget-object p0, p0, La/wp3;->K1:La/i9o0;

    .line 2
    .line 3
    return-object p0
.end method
