.class public final La/iuf0;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0001\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "La/iuf0;",
        "La/yx5;",
        "<init>",
        "()V",
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
.field public static final synthetic R1:[La/iiy;


# instance fields
.field public final K1:La/hnm0;

.field public L1:La/yri;

.field public M1:La/wdk0;

.field public final N1:La/kiu0;

.field public final O1:La/s0r;

.field public final P1:La/n0o0;

.field public Q1:La/ndk0;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/iuf0;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/responsible_game_impl/databinding/FragmentResponsibleGameBinding;"

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
    sput-object v1, La/iuf0;->R1:[La/iiy;

    .line 19
    .line 20
    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    const v0, 0x7f0d02be

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sget-object v0, La/hnm0;->a:La/hnm0;

    .line 8
    .line 9
    iput-object v0, p0, La/iuf0;->K1:La/hnm0;

    .line 10
    .line 11
    new-instance v0, La/guf0;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-direct {v0, p0, v1}, La/guf0;-><init>(La/iuf0;B)V

    .line 15
    .line 16
    .line 17
    new-instance v1, La/lce0;

    .line 18
    .line 19
    const/16 v2, 0x15

    .line 20
    .line 21
    invoke-direct {v1, p0, v2}, La/lce0;-><init>(Ljava/lang/Object;B)V

    .line 22
    .line 23
    .line 24
    sget-object v2, La/wez;->b:La/wez;

    .line 25
    .line 26
    new-instance v3, La/lce0;

    .line 27
    .line 28
    const/16 v4, 0x16

    .line 29
    .line 30
    invoke-direct {v3, v1, v4}, La/lce0;-><init>(Ljava/lang/Object;B)V

    .line 31
    .line 32
    .line 33
    invoke-static {v2, v3}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    const-class v2, La/wuf0;

    .line 38
    .line 39
    sget-object v3, La/sre0;->a:La/tre0;

    .line 40
    .line 41
    invoke-virtual {v3, v2}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    new-instance v3, La/wbe0;

    .line 46
    .line 47
    invoke-direct {v3, v1, v4}, La/wbe0;-><init>(La/a8z;B)V

    .line 48
    .line 49
    .line 50
    new-instance v4, La/wbe0;

    .line 51
    .line 52
    const/16 v5, 0x17

    .line 53
    .line 54
    invoke-direct {v4, v1, v5}, La/wbe0;-><init>(La/a8z;B)V

    .line 55
    .line 56
    .line 57
    invoke-static {p0, v2, v3, v4, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    iput-object v0, p0, La/iuf0;->N1:La/kiu0;

    .line 62
    .line 63
    sget-object v0, La/huf0;->a:La/huf0;

    .line 64
    .line 65
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    iput-object v0, p0, La/iuf0;->O1:La/s0r;

    .line 70
    .line 71
    new-instance v0, La/guf0;

    .line 72
    .line 73
    const/4 v1, 0x1

    .line 74
    invoke-direct {v0, p0, v1}, La/guf0;-><init>(La/iuf0;B)V

    .line 75
    .line 76
    .line 77
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    iput-object v0, p0, La/iuf0;->P1:La/n0o0;

    .line 82
    .line 83
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, La/iuf0;->G0()La/g4r;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object p1, p1, La/g4r;->h:Lcom/google/android/material/appbar/MaterialToolbar;

    .line 6
    .line 7
    new-instance v0, La/jpe0;

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    invoke-direct {v0, p0, v1}, La/jpe0;-><init>(Ljava/lang/Object;B)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/Toolbar;->setNavigationOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, La/iuf0;->G0()La/g4r;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iget-object p1, p1, La/g4r;->g:Landroidx/recyclerview/widget/RecyclerView;

    .line 21
    .line 22
    new-instance v0, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 23
    .line 24
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-direct {v0, v2}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/b;)V

    .line 32
    .line 33
    .line 34
    iget-object v0, p0, La/iuf0;->P1:La/n0o0;

    .line 35
    .line 36
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    check-cast v0, La/ttf0;

    .line 41
    .line 42
    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(La/yge0;)V

    .line 43
    .line 44
    .line 45
    const/4 v0, 0x3

    .line 46
    const/4 v2, 0x0

    .line 47
    invoke-static {p1, v2, v0}, La/vvw;->o(Landroidx/recyclerview/widget/RecyclerView;ZI)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0}, La/iuf0;->G0()La/g4r;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    iget-object p1, p1, La/g4r;->c:Lcom/google/android/material/button/MaterialButton;

    .line 55
    .line 56
    new-instance v0, La/fuf0;

    .line 57
    .line 58
    invoke-direct {v0, p0, v2}, La/fuf0;-><init>(La/iuf0;B)V

    .line 59
    .line 60
    .line 61
    invoke-static {p1, v0}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 62
    .line 63
    .line 64
    invoke-virtual {p0}, La/iuf0;->G0()La/g4r;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    iget-object p1, p1, La/g4r;->b:Lcom/google/android/material/button/MaterialButton;

    .line 69
    .line 70
    new-instance v0, La/fuf0;

    .line 71
    .line 72
    invoke-direct {v0, p0, v1}, La/fuf0;-><init>(La/iuf0;B)V

    .line 73
    .line 74
    .line 75
    invoke-static {p1, v0}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 76
    .line 77
    .line 78
    return-void
.end method

.method public final C0()V
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    instance-of v2, v1, La/af3;

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    if-eqz v2, :cond_0

    .line 18
    .line 19
    check-cast v1, La/af3;

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move-object v1, v3

    .line 23
    :goto_0
    const-class v2, La/juf0;

    .line 24
    .line 25
    if-eqz v1, :cond_3

    .line 26
    .line 27
    invoke-interface {v1}, La/af3;->d()La/wcf0;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-virtual {v1, v2}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    check-cast v1, La/o5d0;

    .line 36
    .line 37
    if-eqz v1, :cond_1

    .line 38
    .line 39
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    check-cast v1, La/ze3;

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_1
    move-object v1, v3

    .line 47
    :goto_1
    instance-of v4, v1, La/juf0;

    .line 48
    .line 49
    if-nez v4, :cond_2

    .line 50
    .line 51
    goto :goto_2

    .line 52
    :cond_2
    move-object v3, v1

    .line 53
    :goto_2
    check-cast v3, La/juf0;

    .line 54
    .line 55
    if-eqz v3, :cond_3

    .line 56
    .line 57
    iget-object v5, v3, La/juf0;->o:La/pyu;

    .line 58
    .line 59
    iget-object v12, v3, La/juf0;->b:La/uf3;

    .line 60
    .line 61
    iget-object v13, v3, La/juf0;->a:La/duj;

    .line 62
    .line 63
    iget-object v14, v3, La/juf0;->c:La/btt0;

    .line 64
    .line 65
    iget-object v15, v3, La/juf0;->d:La/b8u;

    .line 66
    .line 67
    iget-object v1, v3, La/juf0;->e:La/sek;

    .line 68
    .line 69
    iget-object v2, v3, La/juf0;->f:La/vd1;

    .line 70
    .line 71
    iget-object v4, v3, La/juf0;->g:La/vby;

    .line 72
    .line 73
    iget-object v6, v3, La/juf0;->h:La/sa10;

    .line 74
    .line 75
    iget-object v7, v3, La/juf0;->i:La/knf0;

    .line 76
    .line 77
    iget-object v8, v3, La/juf0;->j:La/m1e;

    .line 78
    .line 79
    iget-object v9, v3, La/juf0;->l:La/gii0;

    .line 80
    .line 81
    iget-object v11, v3, La/juf0;->k:La/ii;

    .line 82
    .line 83
    iget-object v10, v3, La/juf0;->m:La/pru;

    .line 84
    .line 85
    move-object/from16 v16, v1

    .line 86
    .line 87
    iget-object v1, v3, La/juf0;->n:La/wdk0;

    .line 88
    .line 89
    move-object/from16 v19, v6

    .line 90
    .line 91
    iget-object v6, v3, La/juf0;->p:La/wsz;

    .line 92
    .line 93
    move-object/from16 v20, v7

    .line 94
    .line 95
    iget-object v7, v3, La/juf0;->q:La/uuz;

    .line 96
    .line 97
    move-object/from16 v21, v8

    .line 98
    .line 99
    iget-object v8, v3, La/juf0;->r:La/jru;

    .line 100
    .line 101
    move-object/from16 v22, v9

    .line 102
    .line 103
    iget-object v9, v3, La/juf0;->s:La/onv;

    .line 104
    .line 105
    iget-object v3, v3, La/juf0;->t:La/xsu;

    .line 106
    .line 107
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 114
    .line 115
    .line 116
    invoke-virtual/range {v20 .. v20}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 117
    .line 118
    .line 119
    invoke-virtual/range {v21 .. v21}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 120
    .line 121
    .line 122
    invoke-virtual/range {v22 .. v22}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 123
    .line 124
    .line 125
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 126
    .line 127
    .line 128
    move-object/from16 v18, v4

    .line 129
    .line 130
    new-instance v4, La/qv2;

    .line 131
    .line 132
    move-object/from16 v24, v1

    .line 133
    .line 134
    move-object/from16 v17, v2

    .line 135
    .line 136
    move-object/from16 v23, v10

    .line 137
    .line 138
    move-object v10, v3

    .line 139
    invoke-direct/range {v4 .. v24}, La/qv2;-><init>(La/pyu;La/wsz;La/uuz;La/jru;La/onv;La/xsu;La/ii;La/uf3;La/duj;La/btt0;La/b8u;La/sek;La/vd1;La/vby;La/sa10;La/knf0;La/m1e;La/gii0;La/pru;La/wdk0;)V

    .line 140
    .line 141
    .line 142
    iget-object v2, v4, La/qv2;->n:Ljava/lang/Object;

    .line 143
    .line 144
    check-cast v2, La/n5d0;

    .line 145
    .line 146
    invoke-interface {v2}, La/o5d0;->get()Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v2

    .line 150
    check-cast v2, La/yri;

    .line 151
    .line 152
    iput-object v2, v0, La/iuf0;->L1:La/yri;

    .line 153
    .line 154
    iput-object v1, v0, La/iuf0;->M1:La/wdk0;

    .line 155
    .line 156
    return-void

    .line 157
    :cond_3
    const-string v0, "Cannot create dependency "

    .line 158
    .line 159
    invoke-static {v2, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    return-void
.end method

.method public final D0()V
    .locals 17

    .line 1
    invoke-virtual/range {p0 .. p0}, La/iuf0;->H0()La/wuf0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/wuf0;->r:La/p7m0;

    .line 6
    .line 7
    new-instance v1, La/jjc0;

    .line 8
    .line 9
    const/4 v7, 0x4

    .line 10
    const/16 v8, 0x15

    .line 11
    .line 12
    const/4 v2, 0x2

    .line 13
    const-class v12, La/iuf0;

    .line 14
    .line 15
    const-string v5, "handleViewState"

    .line 16
    .line 17
    const-string v6, "handleViewState(Lorg/xplatform/responsible_game/impl/presentation/responsible_game/ResponsibleGamblingViewModel$ViewState;)V"

    .line 18
    .line 19
    move-object/from16 v3, p0

    .line 20
    .line 21
    move-object v4, v12

    .line 22
    invoke-direct/range {v1 .. v8}, La/jjc0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 23
    .line 24
    .line 25
    sget-object v2, La/lkz;->a:La/lkz;

    .line 26
    .line 27
    invoke-static/range {p0 .. p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    invoke-interface {v2}, La/clz;->x()La/glz;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    invoke-static {v3}, La/x0x;->Q(La/glz;)La/tkz;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    new-instance v4, La/w7f0;

    .line 40
    .line 41
    const/4 v5, 0x0

    .line 42
    invoke-direct {v4, v0, v2, v1, v5}, La/w7f0;-><init>(La/gmq;La/clz;La/jjc0;La/yje;)V

    .line 43
    .line 44
    .line 45
    const/4 v0, 0x3

    .line 46
    invoke-static {v3, v5, v5, v4, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 47
    .line 48
    .line 49
    invoke-virtual/range {p0 .. p0}, La/iuf0;->H0()La/wuf0;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    iget-object v6, v1, La/wuf0;->s:La/p7m0;

    .line 54
    .line 55
    new-instance v8, La/jjc0;

    .line 56
    .line 57
    const/4 v15, 0x4

    .line 58
    const/16 v16, 0x16

    .line 59
    .line 60
    const/4 v10, 0x2

    .line 61
    const-string v13, "handleContactsState"

    .line 62
    .line 63
    const-string v14, "handleContactsState(Lorg/xplatform/responsible_game/impl/presentation/responsible_game/ResponsibleGamblingViewModel$ContactsState;)V"

    .line 64
    .line 65
    move-object/from16 v11, p0

    .line 66
    .line 67
    move-object v9, v8

    .line 68
    invoke-direct/range {v9 .. v16}, La/jjc0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 69
    .line 70
    .line 71
    invoke-static/range {p0 .. p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 72
    .line 73
    .line 74
    move-result-object v7

    .line 75
    invoke-interface {v7}, La/clz;->x()La/glz;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    invoke-static {v1}, La/x0x;->Q(La/glz;)La/tkz;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    move-object v9, v5

    .line 84
    new-instance v5, La/w7f0;

    .line 85
    .line 86
    const/4 v10, 0x0

    .line 87
    invoke-direct/range {v5 .. v10}, La/w7f0;-><init>(La/gmq;La/clz;La/jjc0;La/yje;B)V

    .line 88
    .line 89
    .line 90
    move-object v2, v9

    .line 91
    invoke-static {v1, v2, v2, v5, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 92
    .line 93
    .line 94
    invoke-virtual/range {p0 .. p0}, La/iuf0;->H0()La/wuf0;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    iget-object v6, v1, La/wuf0;->q:La/p7m0;

    .line 99
    .line 100
    new-instance v8, La/jjc0;

    .line 101
    .line 102
    const/16 v16, 0x17

    .line 103
    .line 104
    const/4 v10, 0x2

    .line 105
    const-string v13, "handlePolicyState"

    .line 106
    .line 107
    const-string v14, "handlePolicyState(Lorg/xplatform/responsible_game/impl/presentation/responsible_game/ResponsibleGamblingViewModel$PolicyUiState;)V"

    .line 108
    .line 109
    move-object v9, v8

    .line 110
    invoke-direct/range {v9 .. v16}, La/jjc0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 111
    .line 112
    .line 113
    invoke-static/range {p0 .. p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 114
    .line 115
    .line 116
    move-result-object v7

    .line 117
    invoke-interface {v7}, La/clz;->x()La/glz;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    invoke-static {v1}, La/x0x;->Q(La/glz;)La/tkz;

    .line 122
    .line 123
    .line 124
    move-result-object v1

    .line 125
    new-instance v5, La/w7f0;

    .line 126
    .line 127
    const/4 v10, 0x0

    .line 128
    move-object v9, v2

    .line 129
    invoke-direct/range {v5 .. v10}, La/w7f0;-><init>(La/gmq;La/clz;La/jjc0;La/yje;C)V

    .line 130
    .line 131
    .line 132
    invoke-static {v1, v2, v2, v5, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 133
    .line 134
    .line 135
    invoke-virtual/range {p0 .. p0}, La/iuf0;->H0()La/wuf0;

    .line 136
    .line 137
    .line 138
    move-result-object v1

    .line 139
    iget-object v6, v1, La/wuf0;->t:La/qoj0;

    .line 140
    .line 141
    new-instance v8, La/jjc0;

    .line 142
    .line 143
    const/16 v16, 0x18

    .line 144
    .line 145
    const/4 v10, 0x2

    .line 146
    const-string v13, "handlePhoneUri"

    .line 147
    .line 148
    const-string v14, "handlePhoneUri(Landroid/net/Uri;)V"

    .line 149
    .line 150
    move-object v9, v8

    .line 151
    invoke-direct/range {v9 .. v16}, La/jjc0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 152
    .line 153
    .line 154
    invoke-static/range {p0 .. p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 155
    .line 156
    .line 157
    move-result-object v7

    .line 158
    invoke-interface {v7}, La/clz;->x()La/glz;

    .line 159
    .line 160
    .line 161
    move-result-object v1

    .line 162
    invoke-static {v1}, La/x0x;->Q(La/glz;)La/tkz;

    .line 163
    .line 164
    .line 165
    move-result-object v1

    .line 166
    new-instance v5, La/w7f0;

    .line 167
    .line 168
    const/4 v10, 0x0

    .line 169
    move-object v9, v2

    .line 170
    invoke-direct/range {v5 .. v10}, La/w7f0;-><init>(La/gmq;La/clz;La/jjc0;La/yje;I)V

    .line 171
    .line 172
    .line 173
    invoke-static {v1, v9, v9, v5, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 174
    .line 175
    .line 176
    return-void
.end method

.method public final G0()La/g4r;
    .locals 2

    .line 1
    sget-object v0, La/iuf0;->R1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/iuf0;->O1:La/s0r;

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
    check-cast p0, La/g4r;

    .line 16
    .line 17
    return-object p0
.end method

.method public final H0()La/wuf0;
    .locals 0

    .line 1
    iget-object p0, p0, La/iuf0;->N1:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/wuf0;

    .line 8
    .line 9
    return-object p0
.end method

.method public final y0()La/jnm0;
    .locals 0

    .line 1
    iget-object p0, p0, La/iuf0;->K1:La/hnm0;

    .line 2
    .line 3
    return-object p0
.end method
