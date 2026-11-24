.class public final La/c9k;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/c9k;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/nwd",
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
.field public static final Q1:La/nwd;

.field public static final synthetic R1:[La/iiy;


# instance fields
.field public K1:La/hfi;

.field public L1:La/ii;

.field public final M1:La/kiu0;

.field public final N1:La/a8z;

.field public final O1:La/zz2;

.field public final P1:La/s0r;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/c9k;

    .line 4
    .line 5
    const-string v2, "limitType"

    .line 6
    .line 7
    const-string v3, "getLimitType()I"

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
    const-string v5, "getBinding()Lorg/xplatform/responsible_game_impl/databinding/FragmentLimitsDepositRsBinding;"

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
    sput-object v1, La/c9k;->R1:[La/iiy;

    .line 31
    .line 32
    new-instance v0, La/nwd;

    .line 33
    .line 34
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 35
    .line 36
    .line 37
    sput-object v0, La/c9k;->Q1:La/nwd;

    .line 38
    .line 39
    return-void
.end method

.method public constructor <init>()V
    .locals 7

    .line 1
    const v0, 0x7f0d0255

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    new-instance v0, La/x8k;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-direct {v0, p0, v1}, La/x8k;-><init>(La/c9k;B)V

    .line 11
    .line 12
    .line 13
    new-instance v2, La/q7g;

    .line 14
    .line 15
    const/16 v3, 0x1c

    .line 16
    .line 17
    invoke-direct {v2, p0, v3}, La/q7g;-><init>(Ljava/lang/Object;B)V

    .line 18
    .line 19
    .line 20
    sget-object v3, La/wez;->b:La/wez;

    .line 21
    .line 22
    new-instance v4, La/q7g;

    .line 23
    .line 24
    const/16 v5, 0x1d

    .line 25
    .line 26
    invoke-direct {v4, v2, v5}, La/q7g;-><init>(Ljava/lang/Object;B)V

    .line 27
    .line 28
    .line 29
    invoke-static {v3, v4}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    const-class v4, La/p9k;

    .line 34
    .line 35
    sget-object v5, La/sre0;->a:La/tre0;

    .line 36
    .line 37
    invoke-virtual {v5, v4}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    new-instance v5, La/b9k;

    .line 42
    .line 43
    invoke-direct {v5, v2, v1}, La/b9k;-><init>(La/a8z;B)V

    .line 44
    .line 45
    .line 46
    new-instance v1, La/b9k;

    .line 47
    .line 48
    const/4 v6, 0x1

    .line 49
    invoke-direct {v1, v2, v6}, La/b9k;-><init>(La/a8z;B)V

    .line 50
    .line 51
    .line 52
    invoke-static {p0, v4, v5, v1, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    iput-object v0, p0, La/c9k;->M1:La/kiu0;

    .line 57
    .line 58
    new-instance v0, La/x8k;

    .line 59
    .line 60
    invoke-direct {v0, p0, v6}, La/x8k;-><init>(La/c9k;B)V

    .line 61
    .line 62
    .line 63
    invoke-static {v3, v0}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    iput-object v0, p0, La/c9k;->N1:La/a8z;

    .line 68
    .line 69
    new-instance v0, La/zz2;

    .line 70
    .line 71
    const-string v1, "LIMIT_TYPE"

    .line 72
    .line 73
    invoke-direct {v0, v1}, La/zz2;-><init>(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    iput-object v0, p0, La/c9k;->O1:La/zz2;

    .line 77
    .line 78
    sget-object v0, La/z8k;->a:La/z8k;

    .line 79
    .line 80
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    iput-object v0, p0, La/c9k;->P1:La/s0r;

    .line 85
    .line 86
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, La/c9k;->G0()La/a1r;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object p1, p1, La/a1r;->g:Lcom/google/android/material/appbar/MaterialToolbar;

    .line 6
    .line 7
    new-instance v0, La/y8k;

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    invoke-direct {v0, p0, v1}, La/y8k;-><init>(La/c9k;B)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/Toolbar;->setNavigationOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 14
    .line 15
    .line 16
    new-instance p1, La/x8k;

    .line 17
    .line 18
    const/4 v0, 0x2

    .line 19
    invoke-direct {p1, p0, v0}, La/x8k;-><init>(La/c9k;B)V

    .line 20
    .line 21
    .line 22
    const-string v0, "SET_LIMIT_REQUEST_KEY"

    .line 23
    .line 24
    invoke-static {p0, v0, p1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 25
    .line 26
    .line 27
    new-instance p1, La/x8k;

    .line 28
    .line 29
    const/4 v0, 0x3

    .line 30
    invoke-direct {p1, p0, v0}, La/x8k;-><init>(La/c9k;B)V

    .line 31
    .line 32
    .line 33
    const-string v0, "LIMIT_ACCEPTED_REQUEST_KEY"

    .line 34
    .line 35
    invoke-static {p0, v0, p1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 36
    .line 37
    .line 38
    new-instance p1, La/wn8;

    .line 39
    .line 40
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    const v1, 0x7f080487

    .line 45
    .line 46
    .line 47
    invoke-static {v1, v0}, La/epv0;->U(ILandroid/content/Context;)Landroid/graphics/drawable/Drawable;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    const/4 v1, 0x0

    .line 52
    invoke-direct {p1, v0, v1}, La/wn8;-><init>(Landroid/graphics/drawable/Drawable;B)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0}, La/c9k;->G0()La/a1r;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    iget-object v0, v0, La/a1r;->f:Landroidx/recyclerview/widget/RecyclerView;

    .line 60
    .line 61
    iget-object v2, p0, La/c9k;->N1:La/a8z;

    .line 62
    .line 63
    invoke-interface {v2}, La/a8z;->getValue()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    check-cast v2, La/w8k;

    .line 68
    .line 69
    invoke-virtual {v0, v2}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(La/yge0;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p0}, La/c9k;->G0()La/a1r;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    iget-object v0, v0, La/a1r;->f:Landroidx/recyclerview/widget/RecyclerView;

    .line 77
    .line 78
    invoke-virtual {v0, p1}, Landroidx/recyclerview/widget/RecyclerView;->m(La/fhe0;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {p0}, La/c9k;->G0()La/a1r;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    iget-object p1, p1, La/a1r;->b:Landroid/widget/Button;

    .line 86
    .line 87
    new-instance v0, La/y8k;

    .line 88
    .line 89
    invoke-direct {v0, p0, v1}, La/y8k;-><init>(La/c9k;B)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 93
    .line 94
    .line 95
    return-void
.end method

.method public final C0()V
    .locals 15

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
    const-class v1, La/d9k;

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
    instance-of v3, v0, La/d9k;

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
    check-cast v2, La/d9k;

    .line 52
    .line 53
    if-eqz v2, :cond_3

    .line 54
    .line 55
    sget-object v0, La/c9k;->R1:[La/iiy;

    .line 56
    .line 57
    const/4 v1, 0x0

    .line 58
    aget-object v0, v0, v1

    .line 59
    .line 60
    iget-object v1, p0, La/c9k;->O1:La/zz2;

    .line 61
    .line 62
    invoke-virtual {v1, p0, v0}, La/zz2;->w(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Integer;

    .line 63
    .line 64
    .line 65
    move-result-object v14

    .line 66
    iget-object v6, v2, La/d9k;->a:La/ctf0;

    .line 67
    .line 68
    iget-object v7, v2, La/d9k;->b:La/sa10;

    .line 69
    .line 70
    iget-object v4, v2, La/d9k;->c:La/wsf0;

    .line 71
    .line 72
    iget-object v8, v2, La/d9k;->d:La/xio;

    .line 73
    .line 74
    iget-object v9, v2, La/d9k;->e:La/czz;

    .line 75
    .line 76
    iget-object v5, v2, La/d9k;->f:La/ii;

    .line 77
    .line 78
    iget-object v10, v2, La/d9k;->g:La/dzz;

    .line 79
    .line 80
    iget-object v11, v2, La/d9k;->h:La/knf0;

    .line 81
    .line 82
    iget-object v12, v2, La/d9k;->i:La/btt0;

    .line 83
    .line 84
    iget-object v13, v2, La/d9k;->j:La/gii0;

    .line 85
    .line 86
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 105
    .line 106
    .line 107
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 108
    .line 109
    .line 110
    new-instance v3, La/o3c;

    .line 111
    .line 112
    invoke-direct/range {v3 .. v14}, La/o3c;-><init>(La/wsf0;La/ii;La/ctf0;La/sa10;La/xio;La/czz;La/dzz;La/knf0;La/btt0;La/gii0;Ljava/lang/Integer;)V

    .line 113
    .line 114
    .line 115
    iget-object v0, v3, La/o3c;->k:Ljava/lang/Object;

    .line 116
    .line 117
    check-cast v0, La/n5d0;

    .line 118
    .line 119
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    check-cast v0, La/hfi;

    .line 124
    .line 125
    iput-object v0, p0, La/c9k;->K1:La/hfi;

    .line 126
    .line 127
    iput-object v5, p0, La/c9k;->L1:La/ii;

    .line 128
    .line 129
    return-void

    .line 130
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 131
    .line 132
    invoke-static {v1, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object p0

    .line 136
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    return-void
.end method

.method public final D0()V
    .locals 9

    .line 1
    invoke-virtual {p0}, La/c9k;->H0()La/p9k;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/p9k;->o:La/p7m0;

    .line 6
    .line 7
    new-instance v1, La/a9k;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    const/4 v7, 0x0

    .line 11
    invoke-direct {v1, p0, v7, v2}, La/a9k;-><init>(La/c9k;La/yje;B)V

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
    invoke-direct {v4, v0, v2, v1, v7}, La/xsj;-><init>(La/gmq;La/clz;La/a9k;La/yje;)V

    .line 31
    .line 32
    .line 33
    const/4 v0, 0x3

    .line 34
    invoke-static {v3, v7, v7, v4, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, La/c9k;->H0()La/p9k;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    iget-object v4, v1, La/p9k;->p:La/p7m0;

    .line 42
    .line 43
    new-instance v6, La/a9k;

    .line 44
    .line 45
    const/4 v1, 0x1

    .line 46
    invoke-direct {v6, p0, v7, v1}, La/a9k;-><init>(La/c9k;La/yje;B)V

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
    move-result-object v1

    .line 57
    invoke-static {v1}, La/x0x;->Q(La/glz;)La/tkz;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    new-instance v3, La/xsj;

    .line 62
    .line 63
    const/4 v8, 0x0

    .line 64
    invoke-direct/range {v3 .. v8}, La/xsj;-><init>(La/gmq;La/clz;La/a9k;La/yje;B)V

    .line 65
    .line 66
    .line 67
    invoke-static {v1, v7, v7, v3, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0}, La/c9k;->H0()La/p9k;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    iget-object v4, v1, La/p9k;->q:La/ol60;

    .line 75
    .line 76
    new-instance v6, La/a9k;

    .line 77
    .line 78
    const/4 v1, 0x2

    .line 79
    invoke-direct {v6, p0, v7, v1}, La/a9k;-><init>(La/c9k;La/yje;B)V

    .line 80
    .line 81
    .line 82
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 83
    .line 84
    .line 85
    move-result-object v5

    .line 86
    invoke-interface {v5}, La/clz;->x()La/glz;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    invoke-static {p0}, La/x0x;->Q(La/glz;)La/tkz;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    new-instance v3, La/xsj;

    .line 95
    .line 96
    invoke-direct/range {v3 .. v8}, La/xsj;-><init>(La/gmq;La/clz;La/a9k;La/yje;C)V

    .line 97
    .line 98
    .line 99
    invoke-static {p0, v7, v7, v3, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 100
    .line 101
    .line 102
    return-void
.end method

.method public final G0()La/a1r;
    .locals 2

    .line 1
    sget-object v0, La/c9k;->R1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/c9k;->P1:La/s0r;

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
    check-cast p0, La/a1r;

    .line 16
    .line 17
    return-object p0
.end method

.method public final H0()La/p9k;
    .locals 0

    .line 1
    iget-object p0, p0, La/c9k;->M1:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/p9k;

    .line 8
    .line 9
    return-object p0
.end method
