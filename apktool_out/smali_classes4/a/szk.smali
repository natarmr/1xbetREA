.class public final La/szk;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "La/szk;",
        "La/yx5;",
        "<init>",
        "()V",
        "domino"
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
.field public static final synthetic Q1:[La/iiy;


# instance fields
.field public final K1:La/i9o0;

.field public L1:La/fiu0;

.field public M1:La/ii;

.field public final N1:La/kiu0;

.field public final O1:La/s0r;

.field public P1:La/n0l;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/szk;

    .line 4
    .line 5
    const-string v2, "viewBinding"

    .line 6
    .line 7
    const-string v3, "getViewBinding()Lorg/xplatform/domino/databinding/FragmentDominoBinding;"

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
    sput-object v1, La/szk;->Q1:[La/iiy;

    .line 19
    .line 20
    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    const v0, 0x7f0d022e

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
    iput-object v0, p0, La/szk;->K1:La/i9o0;

    .line 10
    .line 11
    new-instance v0, La/ucj;

    .line 12
    .line 13
    const/16 v1, 0xf

    .line 14
    .line 15
    invoke-direct {v0, p0, v1}, La/ucj;-><init>(Ljava/lang/Object;B)V

    .line 16
    .line 17
    .line 18
    new-instance v1, La/v9k;

    .line 19
    .line 20
    const/16 v2, 0x1a

    .line 21
    .line 22
    invoke-direct {v1, p0, v2}, La/v9k;-><init>(Ljava/lang/Object;B)V

    .line 23
    .line 24
    .line 25
    sget-object v2, La/wez;->b:La/wez;

    .line 26
    .line 27
    new-instance v3, La/v9k;

    .line 28
    .line 29
    const/16 v4, 0x1b

    .line 30
    .line 31
    invoke-direct {v3, v1, v4}, La/v9k;-><init>(Ljava/lang/Object;B)V

    .line 32
    .line 33
    .line 34
    invoke-static {v2, v3}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    const-class v2, La/l0l;

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
    new-instance v3, La/b9k;

    .line 47
    .line 48
    const/16 v4, 0x10

    .line 49
    .line 50
    invoke-direct {v3, v1, v4}, La/b9k;-><init>(La/a8z;B)V

    .line 51
    .line 52
    .line 53
    new-instance v4, La/b9k;

    .line 54
    .line 55
    const/16 v5, 0x11

    .line 56
    .line 57
    invoke-direct {v4, v1, v5}, La/b9k;-><init>(La/a8z;B)V

    .line 58
    .line 59
    .line 60
    invoke-static {p0, v2, v3, v4, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    iput-object v0, p0, La/szk;->N1:La/kiu0;

    .line 65
    .line 66
    sget-object v0, La/rzk;->a:La/rzk;

    .line 67
    .line 68
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    iput-object v0, p0, La/szk;->O1:La/s0r;

    .line 73
    .line 74
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 7

    .line 1
    invoke-virtual {p0}, La/szk;->I0()La/szq;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object v0, p1, La/szq;->b:La/e0f;

    .line 6
    .line 7
    iget-object v1, v0, La/e0f;->n:Landroid/view/View;

    .line 8
    .line 9
    check-cast v1, Lorg/xplatform/domino/presentation/views/DominoHandView;

    .line 10
    .line 11
    iget-object v2, v0, La/e0f;->k:Landroid/view/View;

    .line 12
    .line 13
    check-cast v2, Lorg/xplatform/domino/presentation/views/DominoTableView;

    .line 14
    .line 15
    invoke-virtual {v1, v2}, Lorg/xplatform/domino/presentation/views/DominoHandView;->setTable(Lorg/xplatform/domino/presentation/views/DominoTableView;)V

    .line 16
    .line 17
    .line 18
    iget-object v1, v0, La/e0f;->h:Landroid/view/View;

    .line 19
    .line 20
    check-cast v1, Lorg/xplatform/domino/presentation/views/DominoHandView;

    .line 21
    .line 22
    iget-object v2, v0, La/e0f;->k:Landroid/view/View;

    .line 23
    .line 24
    check-cast v2, Lorg/xplatform/domino/presentation/views/DominoTableView;

    .line 25
    .line 26
    invoke-virtual {v1, v2}, Lorg/xplatform/domino/presentation/views/DominoHandView;->setTable(Lorg/xplatform/domino/presentation/views/DominoTableView;)V

    .line 27
    .line 28
    .line 29
    new-instance v1, La/nzk;

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    invoke-direct {v1, p0, v3}, La/nzk;-><init>(La/szk;B)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v2, v1}, Lorg/xplatform/domino/presentation/views/DominoTableView;->setPutOnTableListener(Lkotlin/jvm/functions/Function1;)V

    .line 36
    .line 37
    .line 38
    iget-object v1, v0, La/e0f;->n:Landroid/view/View;

    .line 39
    .line 40
    check-cast v1, Lorg/xplatform/domino/presentation/views/DominoHandView;

    .line 41
    .line 42
    new-instance v2, La/pzk;

    .line 43
    .line 44
    invoke-direct {v2, p1, v3}, La/pzk;-><init>(La/szq;B)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v1, v2}, Lorg/xplatform/domino/presentation/views/DominoHandView;->setBonesOverflowListener(Lkotlin/jvm/functions/Function1;)V

    .line 48
    .line 49
    .line 50
    iget-object v2, v0, La/e0f;->l:Landroid/view/View;

    .line 51
    .line 52
    check-cast v2, Landroid/widget/Button;

    .line 53
    .line 54
    sget-object v4, La/ymx;->j:La/ymx;

    .line 55
    .line 56
    new-instance v5, La/nzk;

    .line 57
    .line 58
    const/4 v6, 0x1

    .line 59
    invoke-direct {v5, p0, v6}, La/nzk;-><init>(La/szk;B)V

    .line 60
    .line 61
    .line 62
    invoke-static {v2, v4, v5}, La/dyb;->N(Landroid/view/View;La/ymx;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 63
    .line 64
    .line 65
    iget-object v2, v0, La/e0f;->f:Landroid/view/View;

    .line 66
    .line 67
    check-cast v2, Landroid/widget/Button;

    .line 68
    .line 69
    new-instance v4, La/nzk;

    .line 70
    .line 71
    const/4 v5, 0x2

    .line 72
    invoke-direct {v4, p0, v5}, La/nzk;-><init>(La/szk;B)V

    .line 73
    .line 74
    .line 75
    invoke-static {v2, v4}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 76
    .line 77
    .line 78
    new-instance v2, La/lrk;

    .line 79
    .line 80
    const/4 v4, 0x4

    .line 81
    invoke-direct {v2, p1, p0, v4}, La/lrk;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 82
    .line 83
    .line 84
    const-string v4, "REQUEST_CONCEDE"

    .line 85
    .line 86
    invoke-static {p0, v4, v2}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 87
    .line 88
    .line 89
    iget-object v2, v0, La/e0f;->g:Landroid/view/View;

    .line 90
    .line 91
    check-cast v2, Landroid/widget/ImageView;

    .line 92
    .line 93
    new-instance v4, La/pzk;

    .line 94
    .line 95
    invoke-direct {v4, p1, v6}, La/pzk;-><init>(La/szq;B)V

    .line 96
    .line 97
    .line 98
    invoke-static {v2, v4}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 99
    .line 100
    .line 101
    iget-object v2, v0, La/e0f;->i:Landroid/view/View;

    .line 102
    .line 103
    check-cast v2, Landroid/widget/ImageView;

    .line 104
    .line 105
    new-instance v4, La/pzk;

    .line 106
    .line 107
    invoke-direct {v4, p1, v5}, La/pzk;-><init>(La/szq;B)V

    .line 108
    .line 109
    .line 110
    invoke-static {v2, v4}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 111
    .line 112
    .line 113
    iget-object v0, v0, La/e0f;->j:Landroid/view/View;

    .line 114
    .line 115
    check-cast v0, Landroid/widget/Button;

    .line 116
    .line 117
    new-instance v2, La/nzk;

    .line 118
    .line 119
    const/4 v4, 0x3

    .line 120
    invoke-direct {v2, p0, v4}, La/nzk;-><init>(La/szk;B)V

    .line 121
    .line 122
    .line 123
    invoke-static {v0, v2}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 124
    .line 125
    .line 126
    new-instance v0, La/ngh;

    .line 127
    .line 128
    const/16 v2, 0x13

    .line 129
    .line 130
    invoke-direct {v0, p1, p0, v2}, La/ngh;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 131
    .line 132
    .line 133
    new-instance p0, La/w23;

    .line 134
    .line 135
    invoke-direct {p0, v0, v3}, La/w23;-><init>(Ljava/lang/Object;B)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {v1, p0}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 139
    .line 140
    .line 141
    return-void
.end method

.method public final C0()V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/Fragment;->y:Landroidx/fragment/app/Fragment;

    .line 2
    .line 3
    instance-of v1, v0, La/mzk;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    check-cast v0, La/mzk;

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
    iget-object v0, v0, La/mzk;->W1:La/n0o0;

    .line 14
    .line 15
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, La/pfi;

    .line 20
    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    new-instance v1, La/fiu0;

    .line 24
    .line 25
    const-class v2, La/l0l;

    .line 26
    .line 27
    iget-object v3, v0, La/pfi;->r0:La/dci;

    .line 28
    .line 29
    invoke-static {v2, v3}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    invoke-direct {v1, v2}, La/fiu0;-><init>(Ljava/util/Map;)V

    .line 34
    .line 35
    .line 36
    iput-object v1, p0, La/szk;->L1:La/fiu0;

    .line 37
    .line 38
    iget-object v0, v0, La/pfi;->a:La/g8i;

    .line 39
    .line 40
    invoke-virtual {v0}, La/g8i;->j()La/ii;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    iput-object v0, p0, La/szk;->M1:La/ii;

    .line 45
    .line 46
    :cond_1
    return-void
.end method

.method public final D0()V
    .locals 9

    .line 1
    invoke-virtual {p0}, La/szk;->J0()La/l0l;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/l0l;->s:La/p7m0;

    .line 6
    .line 7
    new-instance v1, La/qzk;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    const/4 v7, 0x0

    .line 11
    invoke-direct {v1, p0, v7, v2}, La/qzk;-><init>(La/szk;La/yje;B)V

    .line 12
    .line 13
    .line 14
    sget-object v2, La/lkz;->a:La/lkz;

    .line 15
    .line 16
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-interface {v2}, La/clz;->x()La/glz;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    invoke-static {v3}, La/x0x;->Q(La/glz;)La/tkz;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    new-instance v4, La/xsj;

    .line 29
    .line 30
    invoke-direct {v4, v0, v2, v1, v7}, La/xsj;-><init>(La/gmq;La/clz;La/qzk;La/yje;)V

    .line 31
    .line 32
    .line 33
    const/4 v0, 0x3

    .line 34
    invoke-static {v3, v7, v7, v4, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, La/szk;->J0()La/l0l;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    iget-object v4, v1, La/l0l;->t:La/p7m0;

    .line 42
    .line 43
    new-instance v6, La/qzk;

    .line 44
    .line 45
    const/4 v1, 0x1

    .line 46
    invoke-direct {v6, p0, v7, v1}, La/qzk;-><init>(La/szk;La/yje;B)V

    .line 47
    .line 48
    .line 49
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 50
    .line 51
    .line 52
    move-result-object v5

    .line 53
    invoke-interface {v5}, La/clz;->x()La/glz;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    invoke-static {p0}, La/x0x;->Q(La/glz;)La/tkz;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    new-instance v3, La/xsj;

    .line 62
    .line 63
    const/4 v8, 0x0

    .line 64
    invoke-direct/range {v3 .. v8}, La/xsj;-><init>(La/gmq;La/clz;La/qzk;La/yje;B)V

    .line 65
    .line 66
    .line 67
    invoke-static {p0, v7, v7, v3, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 68
    .line 69
    .line 70
    return-void
.end method

.method public final G0(La/n0l;)V
    .locals 8

    .line 1
    iget-object p1, p1, La/n0l;->l:Ljava/util/List;

    .line 2
    .line 3
    if-eqz p1, :cond_1

    .line 4
    .line 5
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    return-void

    .line 13
    :cond_1
    :goto_0
    invoke-virtual {p0}, La/szk;->I0()La/szq;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    iget-object p0, p0, La/szq;->b:La/e0f;

    .line 18
    .line 19
    iget-object p1, p0, La/e0f;->b:Landroid/widget/TextView;

    .line 20
    .line 21
    iget-object v0, p0, La/e0f;->n:Landroid/view/View;

    .line 22
    .line 23
    check-cast v0, Lorg/xplatform/domino/presentation/views/DominoHandView;

    .line 24
    .line 25
    iget-object v1, v0, Lorg/xplatform/domino/presentation/views/DominoHandView;->e:Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-nez v2, :cond_2

    .line 32
    .line 33
    goto :goto_3

    .line 34
    :cond_2
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    const/4 v2, 0x0

    .line 39
    move-object v3, v2

    .line 40
    :cond_3
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 41
    .line 42
    .line 43
    move-result v4

    .line 44
    if-eqz v4, :cond_7

    .line 45
    .line 46
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    check-cast v4, La/qb8;

    .line 51
    .line 52
    iget-boolean v5, v4, La/qb8;->d:Z

    .line 53
    .line 54
    if-eqz v5, :cond_4

    .line 55
    .line 56
    if-nez v2, :cond_4

    .line 57
    .line 58
    move-object v2, v4

    .line 59
    :cond_4
    if-nez v5, :cond_5

    .line 60
    .line 61
    if-nez v3, :cond_5

    .line 62
    .line 63
    move-object v3, v4

    .line 64
    :cond_5
    if-eqz v2, :cond_6

    .line 65
    .line 66
    if-eqz v5, :cond_6

    .line 67
    .line 68
    iget v6, v4, La/qb8;->p:I

    .line 69
    .line 70
    iget v7, v2, La/qb8;->p:I

    .line 71
    .line 72
    if-le v6, v7, :cond_6

    .line 73
    .line 74
    move-object v2, v4

    .line 75
    :cond_6
    if-eqz v3, :cond_3

    .line 76
    .line 77
    if-nez v5, :cond_3

    .line 78
    .line 79
    iget v5, v4, La/qb8;->p:I

    .line 80
    .line 81
    iget v6, v4, La/qb8;->q:I

    .line 82
    .line 83
    add-int/2addr v5, v6

    .line 84
    iget v6, v3, La/qb8;->p:I

    .line 85
    .line 86
    iget v7, v3, La/qb8;->q:I

    .line 87
    .line 88
    add-int/2addr v6, v7

    .line 89
    if-le v5, v6, :cond_3

    .line 90
    .line 91
    move-object v3, v4

    .line 92
    goto :goto_1

    .line 93
    :cond_7
    const/4 v1, 0x1

    .line 94
    if-eqz v2, :cond_8

    .line 95
    .line 96
    iput-boolean v1, v2, La/qb8;->s:Z

    .line 97
    .line 98
    goto :goto_2

    .line 99
    :cond_8
    if-eqz v3, :cond_9

    .line 100
    .line 101
    iput-boolean v1, v3, La/qb8;->s:Z

    .line 102
    .line 103
    :cond_9
    :goto_2
    iput v1, v0, Lorg/xplatform/domino/presentation/views/DominoHandView;->r:I

    .line 104
    .line 105
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    .line 106
    .line 107
    .line 108
    :goto_3
    const/4 v0, 0x0

    .line 109
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 110
    .line 111
    .line 112
    const v1, 0x7f1306fd

    .line 113
    .line 114
    .line 115
    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setText(I)V

    .line 116
    .line 117
    .line 118
    iget-object p1, p0, La/e0f;->j:Landroid/view/View;

    .line 119
    .line 120
    check-cast p1, Landroid/widget/Button;

    .line 121
    .line 122
    const/16 v1, 0x8

    .line 123
    .line 124
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 125
    .line 126
    .line 127
    iget-object p1, p0, La/e0f;->m:Landroid/view/View;

    .line 128
    .line 129
    check-cast p1, Landroid/widget/LinearLayout;

    .line 130
    .line 131
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 132
    .line 133
    .line 134
    iget-object p0, p0, La/e0f;->l:Landroid/view/View;

    .line 135
    .line 136
    check-cast p0, Landroid/widget/Button;

    .line 137
    .line 138
    invoke-virtual {p0, v0}, Landroid/view/View;->setEnabled(Z)V

    .line 139
    .line 140
    .line 141
    return-void
.end method

.method public final H0(Z)V
    .locals 1

    .line 1
    invoke-virtual {p0}, La/szk;->I0()La/szq;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/szq;->b:La/e0f;

    .line 6
    .line 7
    iget-object v0, v0, La/e0f;->m:Landroid/view/View;

    .line 8
    .line 9
    check-cast v0, Landroid/widget/LinearLayout;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Landroid/view/View;->setEnabled(Z)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, La/szk;->I0()La/szq;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iget-object v0, v0, La/szq;->b:La/e0f;

    .line 19
    .line 20
    iget-object v0, v0, La/e0f;->j:Landroid/view/View;

    .line 21
    .line 22
    check-cast v0, Landroid/widget/Button;

    .line 23
    .line 24
    invoke-virtual {v0, p1}, Landroid/view/View;->setEnabled(Z)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, La/szk;->I0()La/szq;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    iget-object p0, p0, La/szq;->b:La/e0f;

    .line 32
    .line 33
    iget-object p0, p0, La/e0f;->n:Landroid/view/View;

    .line 34
    .line 35
    check-cast p0, Lorg/xplatform/domino/presentation/views/DominoHandView;

    .line 36
    .line 37
    iput-boolean p1, p0, Lorg/xplatform/domino/presentation/views/DominoHandView;->n:Z

    .line 38
    .line 39
    return-void
.end method

.method public final I0()La/szq;
    .locals 2

    .line 1
    sget-object v0, La/szk;->Q1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/szk;->O1:La/s0r;

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
    check-cast p0, La/szq;

    .line 16
    .line 17
    return-object p0
.end method

.method public final J0()La/l0l;
    .locals 0

    .line 1
    iget-object p0, p0, La/szk;->N1:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/l0l;

    .line 8
    .line 9
    return-object p0
.end method

.method public final K0(Z)V
    .locals 3

    .line 1
    invoke-virtual {p0}, La/szk;->I0()La/szq;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/szq;->c:Landroid/widget/ImageView;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    if-nez p1, :cond_0

    .line 9
    .line 10
    move v2, v1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/16 v2, 0x8

    .line 13
    .line 14
    :goto_0
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, La/szk;->I0()La/szq;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    iget-object p0, p0, La/szq;->b:La/e0f;

    .line 22
    .line 23
    iget-object p0, p0, La/e0f;->e:Landroid/view/ViewGroup;

    .line 24
    .line 25
    check-cast p0, Landroid/widget/FrameLayout;

    .line 26
    .line 27
    if-nez p1, :cond_1

    .line 28
    .line 29
    const/4 v1, 0x4

    .line 30
    :cond_1
    invoke-virtual {p0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public final L0(La/n0l;)V
    .locals 13

    .line 1
    invoke-virtual {p0}, La/szk;->I0()La/szq;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/szq;->b:La/e0f;

    .line 6
    .line 7
    iget-object v1, v0, La/e0f;->c:Landroid/widget/TextView;

    .line 8
    .line 9
    iget v2, p1, La/n0l;->r:I

    .line 10
    .line 11
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    const v3, 0x7f1306fb

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, v3, v2}, Landroidx/fragment/app/Fragment;->I(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 27
    .line 28
    .line 29
    iget-object v1, v0, La/e0f;->j:Landroid/view/View;

    .line 30
    .line 31
    check-cast v1, Landroid/widget/Button;

    .line 32
    .line 33
    iget-object v2, v0, La/e0f;->b:Landroid/widget/TextView;

    .line 34
    .line 35
    iget-object v3, v0, La/e0f;->l:Landroid/view/View;

    .line 36
    .line 37
    check-cast v3, Landroid/widget/Button;

    .line 38
    .line 39
    iget-object v4, v0, La/e0f;->m:Landroid/view/View;

    .line 40
    .line 41
    check-cast v4, Landroid/widget/LinearLayout;

    .line 42
    .line 43
    iget-object v5, v0, La/e0f;->n:Landroid/view/View;

    .line 44
    .line 45
    check-cast v5, Lorg/xplatform/domino/presentation/views/DominoHandView;

    .line 46
    .line 47
    iget-object v6, v5, Lorg/xplatform/domino/presentation/views/DominoHandView;->k:Lorg/xplatform/domino/presentation/views/DominoTableView;

    .line 48
    .line 49
    const/4 v7, 0x0

    .line 50
    const-string v8, "tableView"

    .line 51
    .line 52
    if-eqz v6, :cond_7

    .line 53
    .line 54
    invoke-virtual {v6}, Lorg/xplatform/domino/presentation/views/DominoTableView;->getHeadValue()I

    .line 55
    .line 56
    .line 57
    move-result v6

    .line 58
    iget-object v9, v5, Lorg/xplatform/domino/presentation/views/DominoHandView;->k:Lorg/xplatform/domino/presentation/views/DominoTableView;

    .line 59
    .line 60
    if-eqz v9, :cond_6

    .line 61
    .line 62
    invoke-virtual {v9}, Lorg/xplatform/domino/presentation/views/DominoTableView;->getTailValue()I

    .line 63
    .line 64
    .line 65
    move-result v8

    .line 66
    const/4 v9, 0x0

    .line 67
    iput v9, v5, Lorg/xplatform/domino/presentation/views/DominoHandView;->r:I

    .line 68
    .line 69
    iget-object v10, v5, Lorg/xplatform/domino/presentation/views/DominoHandView;->e:Ljava/util/ArrayList;

    .line 70
    .line 71
    invoke-virtual {v10}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 72
    .line 73
    .line 74
    move-result-object v10

    .line 75
    :goto_0
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 76
    .line 77
    .line 78
    move-result v11

    .line 79
    if-eqz v11, :cond_0

    .line 80
    .line 81
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v11

    .line 85
    check-cast v11, La/qb8;

    .line 86
    .line 87
    invoke-virtual {v11, v6, v8}, La/qb8;->b(II)Z

    .line 88
    .line 89
    .line 90
    move-result v12

    .line 91
    iput-boolean v12, v11, La/qb8;->s:Z

    .line 92
    .line 93
    iget v11, v5, Lorg/xplatform/domino/presentation/views/DominoHandView;->r:I

    .line 94
    .line 95
    add-int/2addr v11, v12

    .line 96
    iput v11, v5, Lorg/xplatform/domino/presentation/views/DominoHandView;->r:I

    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_0
    invoke-virtual {v5}, Landroid/view/View;->invalidate()V

    .line 100
    .line 101
    .line 102
    iget v6, v5, Lorg/xplatform/domino/presentation/views/DominoHandView;->r:I

    .line 103
    .line 104
    const/4 v8, 0x1

    .line 105
    const/16 v10, 0x8

    .line 106
    .line 107
    if-nez v6, :cond_1

    .line 108
    .line 109
    invoke-virtual {v4, v9}, Landroid/view/View;->setVisibility(I)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {v3, v8}, Landroid/view/View;->setEnabled(Z)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v2, v9}, Landroid/view/View;->setVisibility(I)V

    .line 116
    .line 117
    .line 118
    const v0, 0x7f1306fa

    .line 119
    .line 120
    .line 121
    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(I)V

    .line 122
    .line 123
    .line 124
    goto :goto_1

    .line 125
    :cond_1
    iget-object v0, v0, La/e0f;->c:Landroid/widget/TextView;

    .line 126
    .line 127
    invoke-virtual {v0, v7}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {v4, v9}, Landroid/view/View;->setVisibility(I)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {v3, v9}, Landroid/view/View;->setEnabled(Z)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {v2, v10}, Landroid/view/View;->setVisibility(I)V

    .line 137
    .line 138
    .line 139
    :goto_1
    invoke-virtual {v1, v10}, Landroid/view/View;->setVisibility(I)V

    .line 140
    .line 141
    .line 142
    iget v0, p1, La/n0l;->r:I

    .line 143
    .line 144
    if-nez v0, :cond_2

    .line 145
    .line 146
    invoke-virtual {v4, v9}, Landroid/view/View;->setVisibility(I)V

    .line 147
    .line 148
    .line 149
    invoke-virtual {v3, v9}, Landroid/view/View;->setEnabled(Z)V

    .line 150
    .line 151
    .line 152
    iget v0, v5, Lorg/xplatform/domino/presentation/views/DominoHandView;->r:I

    .line 153
    .line 154
    if-nez v0, :cond_2

    .line 155
    .line 156
    invoke-virtual {v1, v9}, Landroid/view/View;->setVisibility(I)V

    .line 157
    .line 158
    .line 159
    :cond_2
    iget-object v0, p1, La/n0l;->e:La/lnm0;

    .line 160
    .line 161
    sget-object v5, La/lnm0;->b:La/lnm0;

    .line 162
    .line 163
    if-ne v0, v5, :cond_4

    .line 164
    .line 165
    iget-boolean v0, p1, La/n0l;->t:Z

    .line 166
    .line 167
    if-eqz v0, :cond_3

    .line 168
    .line 169
    goto :goto_2

    .line 170
    :cond_3
    return-void

    .line 171
    :cond_4
    :goto_2
    iget v0, p1, La/n0l;->f:I

    .line 172
    .line 173
    if-ne v0, v8, :cond_5

    .line 174
    .line 175
    iget-object v0, p1, La/n0l;->n:Ljava/util/List;

    .line 176
    .line 177
    invoke-virtual {p0}, La/szk;->I0()La/szq;

    .line 178
    .line 179
    .line 180
    move-result-object v5

    .line 181
    iget-object v5, v5, La/szq;->b:La/e0f;

    .line 182
    .line 183
    iget-object v5, v5, La/e0f;->h:Landroid/view/View;

    .line 184
    .line 185
    check-cast v5, Lorg/xplatform/domino/presentation/views/DominoHandView;

    .line 186
    .line 187
    new-instance v6, Landroid/os/Handler;

    .line 188
    .line 189
    invoke-direct {v6}, Landroid/os/Handler;-><init>()V

    .line 190
    .line 191
    .line 192
    new-instance v7, La/a4e;

    .line 193
    .line 194
    invoke-direct {v7, v5, v0}, La/a4e;-><init>(Lorg/xplatform/domino/presentation/views/DominoHandView;Ljava/util/List;)V

    .line 195
    .line 196
    .line 197
    const-wide/16 v11, 0x3e8

    .line 198
    .line 199
    invoke-virtual {v6, v7, v11, v12}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 200
    .line 201
    .line 202
    :cond_5
    invoke-virtual {v1, v10}, Landroid/view/View;->setVisibility(I)V

    .line 203
    .line 204
    .line 205
    invoke-virtual {v4, v9}, Landroid/view/View;->setVisibility(I)V

    .line 206
    .line 207
    .line 208
    invoke-virtual {v3, v9}, Landroid/view/View;->setEnabled(Z)V

    .line 209
    .line 210
    .line 211
    invoke-virtual {v2, v10}, Landroid/view/View;->setVisibility(I)V

    .line 212
    .line 213
    .line 214
    invoke-virtual {p0}, La/szk;->J0()La/l0l;

    .line 215
    .line 216
    .line 217
    move-result-object v0

    .line 218
    new-instance v1, La/ozk;

    .line 219
    .line 220
    invoke-direct {v1, p0, p1, v9}, La/ozk;-><init>(La/szk;La/n0l;B)V

    .line 221
    .line 222
    .line 223
    invoke-virtual {v0, v1}, La/l0l;->z(Lkotlin/jvm/functions/Function0;)V

    .line 224
    .line 225
    .line 226
    return-void

    .line 227
    :cond_6
    invoke-static {v8}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 228
    .line 229
    .line 230
    throw v7

    .line 231
    :cond_7
    invoke-static {v8}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 232
    .line 233
    .line 234
    throw v7
.end method

.method public final z0()La/j9o0;
    .locals 0

    .line 1
    iget-object p0, p0, La/szk;->K1:La/i9o0;

    .line 2
    .line 3
    return-object p0
.end method
