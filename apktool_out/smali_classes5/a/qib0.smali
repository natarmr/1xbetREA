.class public final La/qib0;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/qib0;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/rl70",
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
.field public static final Q1:La/rl70;

.field public static final synthetic R1:[La/iiy;


# instance fields
.field public final K1:La/hnm0;

.field public L1:La/fiu0;

.field public M1:La/ii;

.field public final N1:La/a8z;

.field public final O1:La/s0r;

.field public final P1:La/n0o0;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/qib0;

    .line 4
    .line 5
    const-string v2, "viewBinding"

    .line 6
    .line 7
    const-string v3, "getViewBinding()Lorg/xplatform/popular/setting/impl/databinding/FragmentPopularSettingsBinding;"

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
    sput-object v1, La/qib0;->R1:[La/iiy;

    .line 19
    .line 20
    new-instance v0, La/rl70;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    sput-object v0, La/qib0;->Q1:La/rl70;

    .line 26
    .line 27
    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    const v0, 0x7f0d0290

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
    iput-object v0, p0, La/qib0;->K1:La/hnm0;

    .line 10
    .line 11
    const-class v0, La/xib0;

    .line 12
    .line 13
    sget-object v1, La/sre0;->a:La/tre0;

    .line 14
    .line 15
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    new-instance v1, La/nib0;

    .line 20
    .line 21
    const/4 v2, 0x3

    .line 22
    invoke-direct {v1, p0, v2}, La/nib0;-><init>(La/qib0;B)V

    .line 23
    .line 24
    .line 25
    invoke-static {p0, v0, v1}, La/xbc;->b0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    iput-object v0, p0, La/qib0;->N1:La/a8z;

    .line 30
    .line 31
    sget-object v0, La/pib0;->a:La/pib0;

    .line 32
    .line 33
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    iput-object v0, p0, La/qib0;->O1:La/s0r;

    .line 38
    .line 39
    new-instance v0, La/nib0;

    .line 40
    .line 41
    const/4 v1, 0x4

    .line 42
    invoke-direct {v0, p0, v1}, La/nib0;-><init>(La/qib0;B)V

    .line 43
    .line 44
    .line 45
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    iput-object v0, p0, La/qib0;->P1:La/n0o0;

    .line 50
    .line 51
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 6

    .line 1
    invoke-virtual {p0}, La/qib0;->G0()La/z2r;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object p1, p1, La/z2r;->b:Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;

    .line 6
    .line 7
    new-instance v0, La/hc50;

    .line 8
    .line 9
    sget-object v2, La/ybg0;->a:La/ybg0;

    .line 10
    .line 11
    new-instance v4, La/nib0;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-direct {v4, p0, v1}, La/nib0;-><init>(La/qib0;B)V

    .line 15
    .line 16
    .line 17
    const/16 v5, 0x7f0

    .line 18
    .line 19
    const-string v1, "REFRESH_BUTTON"

    .line 20
    .line 21
    const v3, 0x7f080bd0

    .line 22
    .line 23
    .line 24
    invoke-direct/range {v0 .. v5}, La/hc50;-><init>(Ljava/lang/String;La/ybg0;ILkotlin/jvm/functions/Function0;I)V

    .line 25
    .line 26
    .line 27
    filled-new-array {v0}, [La/hc50;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-static {v0}, La/q3d;->e([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-virtual {p1, v0}, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->setNavigationBarButtons(Ljava/util/ArrayList;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0}, La/qib0;->G0()La/z2r;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    iget-object p1, p1, La/z2r;->b:Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;

    .line 43
    .line 44
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    const v1, 0x7f040b0b

    .line 49
    .line 50
    .line 51
    invoke-static {v1, v0}, La/m5d;->b(ILandroid/content/Context;)I

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    invoke-static {v0}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-virtual {p1, v0}, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->setNavigationBarButtonsColorStateList(Landroid/content/res/ColorStateList;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0}, La/qib0;->G0()La/z2r;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    iget-object p1, p1, La/z2r;->b:Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;

    .line 67
    .line 68
    new-instance v0, La/nib0;

    .line 69
    .line 70
    const/4 v1, 0x1

    .line 71
    invoke-direct {v0, p0, v1}, La/nib0;-><init>(La/qib0;B)V

    .line 72
    .line 73
    .line 74
    invoke-static {p1, v0}, La/mc50;->a(La/mc50;Lkotlin/jvm/functions/Function0;)V

    .line 75
    .line 76
    .line 77
    new-instance p1, La/nib0;

    .line 78
    .line 79
    const/4 v0, 0x2

    .line 80
    invoke-direct {p1, p0, v0}, La/nib0;-><init>(La/qib0;B)V

    .line 81
    .line 82
    .line 83
    invoke-static {p0, p1}, La/qcc;->X(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function0;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->G()Landroid/content/res/Resources;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    const v0, 0x7f070717

    .line 91
    .line 92
    .line 93
    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 94
    .line 95
    .line 96
    move-result p1

    .line 97
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->G()Landroid/content/res/Resources;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    const v1, 0x7f0706f8

    .line 102
    .line 103
    .line 104
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 105
    .line 106
    .line 107
    move-result v0

    .line 108
    invoke-virtual {p0}, La/qib0;->G0()La/z2r;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    iget-object v1, v1, La/z2r;->c:Landroidx/recyclerview/widget/RecyclerView;

    .line 113
    .line 114
    new-instance v2, La/yrh;

    .line 115
    .line 116
    const/4 v3, 0x5

    .line 117
    invoke-direct {v2, p1, v0, v3}, La/yrh;-><init>(IIB)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {v1, v2}, Landroidx/recyclerview/widget/RecyclerView;->m(La/fhe0;)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {p0}, La/qib0;->G0()La/z2r;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    iget-object p1, p1, La/z2r;->c:Landroidx/recyclerview/widget/RecyclerView;

    .line 128
    .line 129
    iget-object v0, p0, La/qib0;->P1:La/n0o0;

    .line 130
    .line 131
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    check-cast v0, La/iib0;

    .line 136
    .line 137
    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(La/yge0;)V

    .line 138
    .line 139
    .line 140
    new-instance p1, La/nib0;

    .line 141
    .line 142
    invoke-direct {p1, p0, v3}, La/nib0;-><init>(La/qib0;B)V

    .line 143
    .line 144
    .line 145
    const-string v0, "REQUEST_SET_DEFAULT_SETTINGS_DIALOG_KEY"

    .line 146
    .line 147
    invoke-static {p0, v0, p1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 148
    .line 149
    .line 150
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
    const-class v1, La/sib0;

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
    instance-of v3, v0, La/sib0;

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
    check-cast v2, La/sib0;

    .line 52
    .line 53
    if-eqz v2, :cond_3

    .line 54
    .line 55
    invoke-static {p0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 56
    .line 57
    .line 58
    move-result-object v8

    .line 59
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    iget-object v4, v2, La/sib0;->a:La/cad;

    .line 63
    .line 64
    iget-object v10, v2, La/sib0;->b:La/pru;

    .line 65
    .line 66
    iget-object v7, v2, La/sib0;->f:La/ii;

    .line 67
    .line 68
    iget-object v11, v2, La/sib0;->c:La/lbu;

    .line 69
    .line 70
    iget-object v0, v2, La/sib0;->d:La/v6j0;

    .line 71
    .line 72
    iget-object v12, v2, La/sib0;->e:La/ctf0;

    .line 73
    .line 74
    iget-object v9, v2, La/sib0;->g:La/q7d0;

    .line 75
    .line 76
    iget-object v5, v2, La/sib0;->h:La/kib0;

    .line 77
    .line 78
    iget-object v6, v2, La/sib0;->i:La/ngb0;

    .line 79
    .line 80
    iget-object v13, v2, La/sib0;->j:La/nw20;

    .line 81
    .line 82
    iget-object v14, v2, La/sib0;->k:La/dq00;

    .line 83
    .line 84
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    new-instance v3, La/o3c;

    .line 103
    .line 104
    invoke-direct/range {v3 .. v14}, La/o3c;-><init>(La/cad;La/kib0;La/ngb0;La/ii;La/i1w0;La/q7d0;La/pru;La/lbu;La/ctf0;La/nw20;La/dq00;)V

    .line 105
    .line 106
    .line 107
    new-instance v0, La/fiu0;

    .line 108
    .line 109
    iget-object v1, v3, La/o3c;->k:Ljava/lang/Object;

    .line 110
    .line 111
    check-cast v1, La/eni;

    .line 112
    .line 113
    const-class v2, La/xib0;

    .line 114
    .line 115
    invoke-static {v2, v1}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    invoke-direct {v0, v1}, La/fiu0;-><init>(Ljava/util/Map;)V

    .line 120
    .line 121
    .line 122
    iput-object v0, p0, La/qib0;->L1:La/fiu0;

    .line 123
    .line 124
    iput-object v7, p0, La/qib0;->M1:La/ii;

    .line 125
    .line 126
    return-void

    .line 127
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 128
    .line 129
    invoke-static {v1, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

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

.method public final D0()V
    .locals 13

    .line 1
    invoke-virtual {p0}, La/qib0;->H0()La/k3t0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v3, La/oib0;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-direct {v3, p0, v1}, La/oib0;-><init>(La/qib0;B)V

    .line 9
    .line 10
    .line 11
    new-instance v9, La/oib0;

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    invoke-direct {v9, p0, v1}, La/oib0;-><init>(La/qib0;B)V

    .line 15
    .line 16
    .line 17
    sget-object v1, La/lkz;->a:La/lkz;

    .line 18
    .line 19
    invoke-virtual {v0}, La/k3t0;->w()La/gmq;

    .line 20
    .line 21
    .line 22
    move-result-object v10

    .line 23
    new-instance v1, La/yn90;

    .line 24
    .line 25
    const/4 v7, 0x0

    .line 26
    const/16 v8, 0xc

    .line 27
    .line 28
    const/4 v2, 0x2

    .line 29
    const-class v4, La/knx;

    .line 30
    .line 31
    const-string v5, "suspendConversion0"

    .line 32
    .line 33
    const-string v6, "suspendConversion0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"

    .line 34
    .line 35
    invoke-direct/range {v1 .. v8}, La/yn90;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 36
    .line 37
    .line 38
    iget-object v2, p0, Landroidx/fragment/app/Fragment;->u1:La/glz;

    .line 39
    .line 40
    invoke-static {v2}, La/x0x;->Q(La/glz;)La/tkz;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    new-instance v3, La/f8b0;

    .line 45
    .line 46
    const/4 v12, 0x0

    .line 47
    invoke-direct {v3, v10, p0, v1, v12}, La/f8b0;-><init>(La/gmq;La/qib0;La/yn90;La/yje;)V

    .line 48
    .line 49
    .line 50
    const/4 v1, 0x3

    .line 51
    invoke-static {v2, v12, v12, v3, v1}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 52
    .line 53
    .line 54
    check-cast v0, La/i3t0;

    .line 55
    .line 56
    invoke-virtual {v0}, La/i3t0;->C()La/gmq;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    move-object v7, v4

    .line 61
    new-instance v4, La/yn90;

    .line 62
    .line 63
    const/4 v10, 0x0

    .line 64
    const/16 v11, 0xd

    .line 65
    .line 66
    const/4 v5, 0x2

    .line 67
    const-string v8, "suspendConversion0"

    .line 68
    .line 69
    move-object v6, v9

    .line 70
    const-string v9, "suspendConversion0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"

    .line 71
    .line 72
    invoke-direct/range {v4 .. v11}, La/yn90;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 73
    .line 74
    .line 75
    iget-object v2, p0, Landroidx/fragment/app/Fragment;->u1:La/glz;

    .line 76
    .line 77
    invoke-static {v2}, La/x0x;->Q(La/glz;)La/tkz;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    new-instance v3, La/f8b0;

    .line 82
    .line 83
    check-cast v0, La/i89;

    .line 84
    .line 85
    invoke-direct {v3, v0, p0, v4, v12}, La/f8b0;-><init>(La/i89;La/qib0;La/yn90;La/yje;)V

    .line 86
    .line 87
    .line 88
    invoke-static {v2, v12, v12, v3, v1}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 89
    .line 90
    .line 91
    return-void
.end method

.method public final G0()La/z2r;
    .locals 2

    .line 1
    sget-object v0, La/qib0;->R1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/qib0;->O1:La/s0r;

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
    check-cast p0, La/z2r;

    .line 16
    .line 17
    return-object p0
.end method

.method public final H0()La/k3t0;
    .locals 0

    .line 1
    iget-object p0, p0, La/qib0;->N1:La/a8z;

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

.method public final y0()La/jnm0;
    .locals 0

    .line 1
    iget-object p0, p0, La/qib0;->K1:La/hnm0;

    .line 2
    .line 3
    return-object p0
.end method
