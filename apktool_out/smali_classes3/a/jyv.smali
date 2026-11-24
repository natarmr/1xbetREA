.class public final La/jyv;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/jyv;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/gst",
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
.field public static final R1:La/gst;

.field public static final synthetic S1:[La/iiy;


# instance fields
.field public final K1:La/s0r;

.field public L1:La/fiu0;

.field public final M1:La/kiu0;

.field public final N1:La/yzn0;

.field public final O1:Landroid/os/Bundle;

.field public final P1:La/n0o0;

.field public final Q1:La/n0o0;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/jyv;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/bethistory/impl/databinding/FragmentAggregatorFilterNewBinding;"

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
    const-string v3, "typeHistoryScreen"

    .line 16
    .line 17
    const-string v5, "getTypeHistoryScreen()Lorg/xplatform/bethistory/domain/model/TypeHistoryScreen;"

    .line 18
    .line 19
    invoke-direct {v2, v1, v3, v5, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

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
    sput-object v1, La/jyv;->S1:[La/iiy;

    .line 31
    .line 32
    new-instance v0, La/gst;

    .line 33
    .line 34
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 35
    .line 36
    .line 37
    sput-object v0, La/jyv;->R1:La/gst;

    .line 38
    .line 39
    return-void
.end method

.method public constructor <init>()V
    .locals 7

    .line 1
    const v0, 0x7f0d01e6

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sget-object v0, La/hyv;->a:La/hyv;

    .line 8
    .line 9
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, La/jyv;->K1:La/s0r;

    .line 14
    .line 15
    new-instance v0, La/fyv;

    .line 16
    .line 17
    const/4 v1, 0x1

    .line 18
    invoke-direct {v0, p0, v1}, La/fyv;-><init>(La/jyv;B)V

    .line 19
    .line 20
    .line 21
    new-instance v1, La/t7t;

    .line 22
    .line 23
    const/16 v2, 0x12

    .line 24
    .line 25
    invoke-direct {v1, p0, v2}, La/t7t;-><init>(Ljava/lang/Object;B)V

    .line 26
    .line 27
    .line 28
    sget-object v2, La/wez;->b:La/wez;

    .line 29
    .line 30
    new-instance v3, La/t7t;

    .line 31
    .line 32
    const/16 v4, 0x13

    .line 33
    .line 34
    invoke-direct {v3, v1, v4}, La/t7t;-><init>(Ljava/lang/Object;B)V

    .line 35
    .line 36
    .line 37
    invoke-static {v2, v3}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    const-class v2, La/vyv;

    .line 42
    .line 43
    sget-object v3, La/sre0;->a:La/tre0;

    .line 44
    .line 45
    invoke-virtual {v3, v2}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    new-instance v3, La/qwv;

    .line 50
    .line 51
    const/4 v4, 0x2

    .line 52
    invoke-direct {v3, v1, v4}, La/qwv;-><init>(La/a8z;B)V

    .line 53
    .line 54
    .line 55
    new-instance v5, La/qwv;

    .line 56
    .line 57
    const/4 v6, 0x3

    .line 58
    invoke-direct {v5, v1, v6}, La/qwv;-><init>(La/a8z;B)V

    .line 59
    .line 60
    .line 61
    invoke-static {p0, v2, v3, v5, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    iput-object v0, p0, La/jyv;->M1:La/kiu0;

    .line 66
    .line 67
    new-instance v0, La/yzn0;

    .line 68
    .line 69
    const-string v1, "TYPE_HISTORY_SCREEN"

    .line 70
    .line 71
    invoke-direct {v0, v1}, La/yzn0;-><init>(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    iput-object v0, p0, La/jyv;->N1:La/yzn0;

    .line 75
    .line 76
    new-instance v0, Landroid/os/Bundle;

    .line 77
    .line 78
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 79
    .line 80
    .line 81
    iput-object v0, p0, La/jyv;->O1:Landroid/os/Bundle;

    .line 82
    .line 83
    new-instance v0, La/fyv;

    .line 84
    .line 85
    invoke-direct {v0, p0, v4}, La/fyv;-><init>(La/jyv;B)V

    .line 86
    .line 87
    .line 88
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    iput-object v0, p0, La/jyv;->P1:La/n0o0;

    .line 93
    .line 94
    new-instance v0, La/fyv;

    .line 95
    .line 96
    invoke-direct {v0, p0, v6}, La/fyv;-><init>(La/jyv;B)V

    .line 97
    .line 98
    .line 99
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    iput-object v0, p0, La/jyv;->Q1:La/n0o0;

    .line 104
    .line 105
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, La/jyv;->G0()La/rxq;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object p1, p1, La/rxq;->h:Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;

    .line 6
    .line 7
    new-instance v0, La/fyv;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-direct {v0, p0, v1}, La/fyv;-><init>(La/jyv;B)V

    .line 11
    .line 12
    .line 13
    invoke-static {p1, v0}, La/mc50;->a(La/mc50;Lkotlin/jvm/functions/Function0;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, La/jyv;->G0()La/rxq;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iget-object p1, p1, La/rxq;->d:Lcom/google/android/material/button/MaterialButton;

    .line 21
    .line 22
    new-instance v0, La/gyv;

    .line 23
    .line 24
    invoke-direct {v0, p0, v1}, La/gyv;-><init>(La/jyv;B)V

    .line 25
    .line 26
    .line 27
    invoke-static {p1, v0}, La/dyb;->c0(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, La/jyv;->G0()La/rxq;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    iget-object p1, p1, La/rxq;->c:Lcom/google/android/material/button/MaterialButton;

    .line 35
    .line 36
    new-instance v0, La/gyv;

    .line 37
    .line 38
    const/4 v1, 0x1

    .line 39
    invoke-direct {v0, p0, v1}, La/gyv;-><init>(La/jyv;B)V

    .line 40
    .line 41
    .line 42
    invoke-static {p1, v0}, La/dyb;->c0(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0}, La/jyv;->G0()La/rxq;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    iget-object p1, p1, La/rxq;->f:Landroidx/recyclerview/widget/RecyclerView;

    .line 50
    .line 51
    iget-object v0, p0, La/jyv;->Q1:La/n0o0;

    .line 52
    .line 53
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    check-cast v0, La/eyv;

    .line 58
    .line 59
    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(La/yge0;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0}, La/jyv;->G0()La/rxq;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    iget-object p1, p1, La/rxq;->g:Landroidx/recyclerview/widget/RecyclerView;

    .line 67
    .line 68
    iget-object p0, p0, La/jyv;->P1:La/n0o0;

    .line 69
    .line 70
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    check-cast p0, La/eyv;

    .line 75
    .line 76
    invoke-virtual {p1, p0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(La/yge0;)V

    .line 77
    .line 78
    .line 79
    return-void
.end method

.method public final C0()V
    .locals 5

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
    const-class v1, La/rnm0;

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
    instance-of v3, v0, La/rnm0;

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
    check-cast v2, La/rnm0;

    .line 52
    .line 53
    if-eqz v2, :cond_3

    .line 54
    .line 55
    sget-object v0, La/s77;->h:La/s77;

    .line 56
    .line 57
    invoke-static {p0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    sget-object v3, La/jyv;->S1:[La/iiy;

    .line 62
    .line 63
    const/4 v4, 0x1

    .line 64
    aget-object v3, v3, v4

    .line 65
    .line 66
    iget-object v4, p0, La/jyv;->N1:La/yzn0;

    .line 67
    .line 68
    invoke-virtual {v4, p0, v3}, La/yzn0;->k(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/io/Serializable;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    check-cast v3, La/sys0;

    .line 73
    .line 74
    invoke-virtual {v2, v0, v1, v3}, La/rnm0;->a(La/s77;La/i1w0;La/sys0;)La/ru;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    invoke-virtual {v0}, La/ru;->y()La/fiu0;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    iput-object v0, p0, La/jyv;->L1:La/fiu0;

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
    .locals 10

    .line 1
    invoke-virtual {p0}, La/jyv;->H0()La/vyv;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/vyv;->g:La/p7m0;

    .line 6
    .line 7
    invoke-static {v0}, La/vtb;->N(La/qz40;)La/xae0;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    new-instance v1, La/iyv;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    const/4 v7, 0x0

    .line 15
    invoke-direct {v1, p0, v7, v2}, La/iyv;-><init>(La/jyv;La/yje;B)V

    .line 16
    .line 17
    .line 18
    sget-object v2, La/lkz;->a:La/lkz;

    .line 19
    .line 20
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-interface {v2}, La/clz;->x()La/glz;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    invoke-static {v3}, La/x0x;->Q(La/glz;)La/tkz;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    new-instance v4, La/hgv;

    .line 33
    .line 34
    invoke-direct {v4, v0, v2, v1, v7}, La/hgv;-><init>(La/xae0;La/clz;La/iyv;La/yje;)V

    .line 35
    .line 36
    .line 37
    const/4 v0, 0x3

    .line 38
    invoke-static {v3, v7, v7, v4, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0}, La/jyv;->H0()La/vyv;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    iget-object v1, v1, La/vyv;->h:La/p7m0;

    .line 46
    .line 47
    invoke-static {v1}, La/vtb;->N(La/qz40;)La/xae0;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    new-instance v6, La/iyv;

    .line 52
    .line 53
    const/4 v1, 0x1

    .line 54
    invoke-direct {v6, p0, v7, v1}, La/iyv;-><init>(La/jyv;La/yje;B)V

    .line 55
    .line 56
    .line 57
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 58
    .line 59
    .line 60
    move-result-object v5

    .line 61
    invoke-interface {v5}, La/clz;->x()La/glz;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    invoke-static {v1}, La/x0x;->Q(La/glz;)La/tkz;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    new-instance v3, La/hgv;

    .line 70
    .line 71
    const/4 v8, 0x0

    .line 72
    invoke-direct/range {v3 .. v8}, La/hgv;-><init>(La/xae0;La/clz;La/iyv;La/yje;B)V

    .line 73
    .line 74
    .line 75
    invoke-static {v1, v7, v7, v3, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 76
    .line 77
    .line 78
    invoke-virtual {p0}, La/jyv;->H0()La/vyv;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    iget-object v1, v1, La/vyv;->j:La/p7m0;

    .line 83
    .line 84
    invoke-static {v1}, La/vtb;->N(La/qz40;)La/xae0;

    .line 85
    .line 86
    .line 87
    move-result-object v4

    .line 88
    new-instance v6, La/iyv;

    .line 89
    .line 90
    const/4 v1, 0x2

    .line 91
    invoke-direct {v6, p0, v7, v1}, La/iyv;-><init>(La/jyv;La/yje;B)V

    .line 92
    .line 93
    .line 94
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 95
    .line 96
    .line 97
    move-result-object v5

    .line 98
    invoke-interface {v5}, La/clz;->x()La/glz;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    invoke-static {v1}, La/x0x;->Q(La/glz;)La/tkz;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    new-instance v3, La/hgv;

    .line 107
    .line 108
    invoke-direct/range {v3 .. v8}, La/hgv;-><init>(La/xae0;La/clz;La/iyv;La/yje;C)V

    .line 109
    .line 110
    .line 111
    invoke-static {v1, v7, v7, v3, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 112
    .line 113
    .line 114
    invoke-virtual {p0}, La/jyv;->H0()La/vyv;

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    iget-object v1, v1, La/vyv;->i:La/p7m0;

    .line 119
    .line 120
    invoke-static {v1}, La/vtb;->N(La/qz40;)La/xae0;

    .line 121
    .line 122
    .line 123
    move-result-object v4

    .line 124
    new-instance v6, La/iyv;

    .line 125
    .line 126
    invoke-direct {v6, p0, v7, v0}, La/iyv;-><init>(La/jyv;La/yje;B)V

    .line 127
    .line 128
    .line 129
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 130
    .line 131
    .line 132
    move-result-object v5

    .line 133
    invoke-interface {v5}, La/clz;->x()La/glz;

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    invoke-static {v1}, La/x0x;->Q(La/glz;)La/tkz;

    .line 138
    .line 139
    .line 140
    move-result-object v1

    .line 141
    new-instance v3, La/hgv;

    .line 142
    .line 143
    invoke-direct/range {v3 .. v8}, La/hgv;-><init>(La/xae0;La/clz;La/iyv;La/yje;I)V

    .line 144
    .line 145
    .line 146
    invoke-static {v1, v7, v7, v3, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 147
    .line 148
    .line 149
    invoke-virtual {p0}, La/jyv;->H0()La/vyv;

    .line 150
    .line 151
    .line 152
    move-result-object v1

    .line 153
    iget-object v1, v1, La/vyv;->k:La/p7m0;

    .line 154
    .line 155
    invoke-static {v1}, La/vtb;->N(La/qz40;)La/xae0;

    .line 156
    .line 157
    .line 158
    move-result-object v4

    .line 159
    new-instance v6, La/iyv;

    .line 160
    .line 161
    const/4 v1, 0x4

    .line 162
    invoke-direct {v6, p0, v7, v1}, La/iyv;-><init>(La/jyv;La/yje;B)V

    .line 163
    .line 164
    .line 165
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 166
    .line 167
    .line 168
    move-result-object v5

    .line 169
    invoke-interface {v5}, La/clz;->x()La/glz;

    .line 170
    .line 171
    .line 172
    move-result-object v1

    .line 173
    invoke-static {v1}, La/x0x;->Q(La/glz;)La/tkz;

    .line 174
    .line 175
    .line 176
    move-result-object v1

    .line 177
    new-instance v3, La/hgv;

    .line 178
    .line 179
    invoke-direct/range {v3 .. v8}, La/hgv;-><init>(La/xae0;La/clz;La/iyv;La/yje;S)V

    .line 180
    .line 181
    .line 182
    invoke-static {v1, v7, v7, v3, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 183
    .line 184
    .line 185
    invoke-virtual {p0}, La/jyv;->H0()La/vyv;

    .line 186
    .line 187
    .line 188
    move-result-object v1

    .line 189
    iget-object v1, v1, La/vyv;->l:La/p7m0;

    .line 190
    .line 191
    invoke-static {v1}, La/vtb;->N(La/qz40;)La/xae0;

    .line 192
    .line 193
    .line 194
    move-result-object v4

    .line 195
    new-instance v6, La/iyv;

    .line 196
    .line 197
    const/4 v1, 0x5

    .line 198
    invoke-direct {v6, p0, v7, v1}, La/iyv;-><init>(La/jyv;La/yje;B)V

    .line 199
    .line 200
    .line 201
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 202
    .line 203
    .line 204
    move-result-object v5

    .line 205
    invoke-interface {v5}, La/clz;->x()La/glz;

    .line 206
    .line 207
    .line 208
    move-result-object p0

    .line 209
    invoke-static {p0}, La/x0x;->Q(La/glz;)La/tkz;

    .line 210
    .line 211
    .line 212
    move-result-object p0

    .line 213
    new-instance v3, La/hgv;

    .line 214
    .line 215
    const/4 v9, 0x0

    .line 216
    invoke-direct/range {v3 .. v9}, La/hgv;-><init>(La/xae0;La/clz;La/iyv;La/yje;BZ)V

    .line 217
    .line 218
    .line 219
    invoke-static {p0, v7, v7, v3, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 220
    .line 221
    .line 222
    return-void
.end method

.method public final G0()La/rxq;
    .locals 2

    .line 1
    sget-object v0, La/jyv;->S1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/jyv;->K1:La/s0r;

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
    check-cast p0, La/rxq;

    .line 16
    .line 17
    return-object p0
.end method

.method public final H0()La/vyv;
    .locals 0

    .line 1
    iget-object p0, p0, La/jyv;->M1:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/vyv;

    .line 8
    .line 9
    return-object p0
.end method

.method public final f0(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    iget-object p0, p0, La/jyv;->O1:Landroid/os/Bundle;

    .line 2
    .line 3
    invoke-virtual {p1, p0}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final j0(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->j1:Z

    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    invoke-virtual {p0}, La/jyv;->H0()La/vyv;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    const-string v0, "selected_bet_type_bundle_key"

    .line 11
    .line 12
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    check-cast v0, La/r21;

    .line 20
    .line 21
    const-string v1, "selected_game_type_bundle_key"

    .line 22
    .line 23
    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    check-cast p1, La/v21;

    .line 31
    .line 32
    iget-object v1, p0, La/vyv;->i:La/p7m0;

    .line 33
    .line 34
    new-instance v2, La/oyv;

    .line 35
    .line 36
    invoke-direct {v2, p1}, La/oyv;-><init>(La/v21;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    const/4 p1, 0x0

    .line 43
    invoke-virtual {v1, p1, v2}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    iget-object v1, p0, La/vyv;->j:La/p7m0;

    .line 47
    .line 48
    new-instance v2, La/nyv;

    .line 49
    .line 50
    invoke-direct {v2, v0}, La/nyv;-><init>(La/r21;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v1, p1, v2}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0}, La/vyv;->x()V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0}, La/vyv;->w()V

    .line 63
    .line 64
    .line 65
    :cond_0
    return-void
.end method
