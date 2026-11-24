.class public final La/qfl;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0000\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "La/qfl;",
        "La/yx5;",
        "<init>",
        "()V",
        "dragons_gold"
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
    const-class v1, La/qfl;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/dragons_gold/databinding/FragmentDragonsGoldBinding;"

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
    sput-object v1, La/qfl;->O1:[La/iiy;

    .line 19
    .line 20
    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    const v0, 0x7f0d022f

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
    iput-object v0, p0, La/qfl;->K1:La/i9o0;

    .line 10
    .line 11
    new-instance v0, La/ucj;

    .line 12
    .line 13
    const/16 v1, 0x1a

    .line 14
    .line 15
    invoke-direct {v0, p0, v1}, La/ucj;-><init>(Ljava/lang/Object;B)V

    .line 16
    .line 17
    .line 18
    new-instance v1, La/jfl;

    .line 19
    .line 20
    const/4 v2, 0x1

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
    const/4 v4, 0x2

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
    const-class v2, La/cgl;

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
    const/16 v4, 0x14

    .line 47
    .line 48
    invoke-direct {v3, v1, v4}, La/b9k;-><init>(La/a8z;B)V

    .line 49
    .line 50
    .line 51
    new-instance v4, La/b9k;

    .line 52
    .line 53
    const/16 v5, 0x15

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
    iput-object v0, p0, La/qfl;->M1:La/kiu0;

    .line 63
    .line 64
    sget-object v0, La/nfl;->a:La/nfl;

    .line 65
    .line 66
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    iput-object v0, p0, La/qfl;->N1:La/s0r;

    .line 71
    .line 72
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 6

    .line 1
    invoke-virtual {p0}, La/qfl;->G0()La/tzq;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object v0, p1, La/tzq;->b:Lorg/xplatform/dragons_gold/presentation/views/DragonsGoldCellGameView;

    .line 6
    .line 7
    new-instance v1, La/ngh;

    .line 8
    .line 9
    const/16 v2, 0x16

    .line 10
    .line 11
    invoke-direct {v1, p1, p0, v2}, La/ngh;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 12
    .line 13
    .line 14
    new-instance v2, La/mfl;

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    invoke-direct {v2, p1, p0, v3}, La/mfl;-><init>(La/tzq;La/qfl;B)V

    .line 18
    .line 19
    .line 20
    new-instance v3, La/mfl;

    .line 21
    .line 22
    const/4 v4, 0x1

    .line 23
    invoke-direct {v3, p1, p0, v4}, La/mfl;-><init>(La/tzq;La/qfl;B)V

    .line 24
    .line 25
    .line 26
    new-instance v4, La/mfl;

    .line 27
    .line 28
    const/4 v5, 0x2

    .line 29
    invoke-direct {v4, p1, p0, v5}, La/mfl;-><init>(La/tzq;La/qfl;B)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, v1, v2, v3, v4}, Lorg/xplatform/dragons_gold/presentation/views/DragonsGoldCellGameView;->x(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V

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
    instance-of v1, v0, La/kfl;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    check-cast v0, La/kfl;

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
    iget-object v0, v0, La/kfl;->W1:La/n0o0;

    .line 14
    .line 15
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, La/ufi;

    .line 20
    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    new-instance v1, La/fiu0;

    .line 24
    .line 25
    const-class v2, La/cgl;

    .line 26
    .line 27
    iget-object v0, v0, La/ufi;->j0:La/dci;

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
    iput-object v1, p0, La/qfl;->L1:La/fiu0;

    .line 37
    .line 38
    :cond_1
    return-void
.end method

.method public final D0()V
    .locals 19

    .line 1
    invoke-virtual/range {p0 .. p0}, La/qfl;->H0()La/cgl;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v2, v0, La/cgl;->z:La/p7m0;

    .line 6
    .line 7
    new-instance v3, La/d7e;

    .line 8
    .line 9
    const/4 v9, 0x4

    .line 10
    const/16 v10, 0x1d

    .line 11
    .line 12
    const/4 v4, 0x2

    .line 13
    const-class v6, La/qfl;

    .line 14
    .line 15
    const-string v7, "handleConnectionState"

    .line 16
    .line 17
    const-string v8, "handleConnectionState(Z)V"

    .line 18
    .line 19
    move-object/from16 v5, p0

    .line 20
    .line 21
    invoke-direct/range {v3 .. v10}, La/d7e;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 22
    .line 23
    .line 24
    move-object v14, v6

    .line 25
    sget-object v0, La/lkz;->a:La/lkz;

    .line 26
    .line 27
    move-object v4, v3

    .line 28
    invoke-static/range {p0 .. p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    invoke-interface {v3}, La/clz;->x()La/glz;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-static {v0}, La/x0x;->Q(La/glz;)La/tkz;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    new-instance v1, La/xsj;

    .line 41
    .line 42
    const/4 v6, 0x0

    .line 43
    const/4 v5, 0x0

    .line 44
    invoke-direct/range {v1 .. v6}, La/xsj;-><init>(La/gmq;La/clz;La/d7e;La/yje;C)V

    .line 45
    .line 46
    .line 47
    const/4 v2, 0x3

    .line 48
    invoke-static {v0, v5, v5, v1, v2}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 49
    .line 50
    .line 51
    invoke-virtual/range {p0 .. p0}, La/qfl;->H0()La/cgl;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    iget-object v0, v0, La/cgl;->y:La/p7m0;

    .line 56
    .line 57
    new-instance v11, La/pfl;

    .line 58
    .line 59
    const/16 v17, 0x4

    .line 60
    .line 61
    const/16 v18, 0x0

    .line 62
    .line 63
    const/4 v12, 0x2

    .line 64
    const-string v15, "handleDragonsGoldScreen"

    .line 65
    .line 66
    const-string v16, "handleDragonsGoldScreen(Lorg/xplatform/dragons_gold/presentation/models/DragonsGoldScreenState;)V"

    .line 67
    .line 68
    move-object/from16 v13, p0

    .line 69
    .line 70
    invoke-direct/range {v11 .. v18}, La/pfl;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 71
    .line 72
    .line 73
    invoke-static/range {p0 .. p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    invoke-interface {v1}, La/clz;->x()La/glz;

    .line 78
    .line 79
    .line 80
    move-result-object v3

    .line 81
    invoke-static {v3}, La/x0x;->Q(La/glz;)La/tkz;

    .line 82
    .line 83
    .line 84
    move-result-object v3

    .line 85
    new-instance v4, La/ofl;

    .line 86
    .line 87
    invoke-direct {v4, v0, v1, v11, v5}, La/ofl;-><init>(La/gmq;La/clz;La/pfl;La/yje;)V

    .line 88
    .line 89
    .line 90
    invoke-static {v3, v5, v5, v4, v2}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 91
    .line 92
    .line 93
    return-void
.end method

.method public final G0()La/tzq;
    .locals 2

    .line 1
    sget-object v0, La/qfl;->O1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/qfl;->N1:La/s0r;

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
    check-cast p0, La/tzq;

    .line 16
    .line 17
    return-object p0
.end method

.method public final H0()La/cgl;
    .locals 0

    .line 1
    iget-object p0, p0, La/qfl;->M1:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/cgl;

    .line 8
    .line 9
    return-object p0
.end method

.method public final Z()V
    .locals 7

    .line 1
    invoke-virtual {p0}, La/qfl;->H0()La/cgl;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, v0, La/cgl;->y:La/p7m0;

    .line 6
    .line 7
    iget-object v2, v0, La/cgl;->x:La/p7m0;

    .line 8
    .line 9
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    sget-object v4, La/lfl;->c:La/lfl;

    .line 14
    .line 15
    if-ne v3, v4, :cond_0

    .line 16
    .line 17
    invoke-virtual {v0}, La/cgl;->E()V

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
    sget-object v4, La/lfl;->e:La/lfl;

    .line 26
    .line 27
    const/4 v5, 0x0

    .line 28
    if-ne v3, v4, :cond_1

    .line 29
    .line 30
    new-instance v3, La/rgl;

    .line 31
    .line 32
    new-instance v4, La/ugl;

    .line 33
    .line 34
    iget-object v6, v0, La/cgl;->w:Ljava/lang/String;

    .line 35
    .line 36
    iget-object v0, v0, La/cgl;->r:La/uyn;

    .line 37
    .line 38
    invoke-virtual {v0}, La/uyn;->i()La/vgl;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-direct {v4, v6, v0}, La/ugl;-><init>(Ljava/lang/String;La/vgl;)V

    .line 43
    .line 44
    .line 45
    invoke-direct {v3, v4}, La/rgl;-><init>(La/ugl;)V

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
    sget-object v0, La/lfl;->f:La/lfl;

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
    sget-object v3, La/lfl;->a:La/lfl;

    .line 65
    .line 66
    if-ne v0, v3, :cond_2

    .line 67
    .line 68
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    sget-object v0, La/sgl;->a:La/sgl;

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
    invoke-virtual {p0}, La/qfl;->H0()La/cgl;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    iget-object v0, p0, La/cgl;->x:La/p7m0;

    .line 9
    .line 10
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    sget-object v1, La/lfl;->c:La/lfl;

    .line 15
    .line 16
    if-ne v0, v1, :cond_0

    .line 17
    .line 18
    invoke-virtual {p0}, La/cgl;->E()V

    .line 19
    .line 20
    .line 21
    :cond_0
    return-void
.end method

.method public final z0()La/j9o0;
    .locals 0

    .line 1
    iget-object p0, p0, La/qfl;->K1:La/i9o0;

    .line 2
    .line 3
    return-object p0
.end method
