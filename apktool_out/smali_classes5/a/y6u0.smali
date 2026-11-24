.class public final La/y6u0;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/y6u0;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/bzs0",
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
.field public static final R1:La/bzs0;

.field public static final synthetic S1:[La/iiy;

.field public static final U1:Ljava/lang/String;


# instance fields
.field public final K1:La/hnm0;

.field public final L1:Z

.field public M1:La/tyi;

.field public final N1:La/s0r;

.field public final O1:La/kiu0;

.field public final P1:La/n0o0;

.field public final Q1:La/zz2;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/y6u0;

    .line 4
    .line 5
    const-string v2, "viewBinding"

    .line 6
    .line 7
    const-string v3, "getViewBinding()Lorg/xplatform/special_event/impl/databinding/FragmentVenuesBinding;"

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
    const-string v3, "eventId"

    .line 16
    .line 17
    const-string v5, "getEventId()I"

    .line 18
    .line 19
    invoke-direct {v2, v1, v3, v5, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    const/4 v3, 0x2

    .line 23
    new-array v3, v3, [La/iiy;

    .line 24
    .line 25
    aput-object v0, v3, v4

    .line 26
    .line 27
    const/4 v0, 0x1

    .line 28
    aput-object v2, v3, v0

    .line 29
    .line 30
    sput-object v3, La/y6u0;->S1:[La/iiy;

    .line 31
    .line 32
    new-instance v0, La/bzs0;

    .line 33
    .line 34
    const/4 v2, 0x6

    .line 35
    invoke-direct {v0, v2}, La/bzs0;-><init>(B)V

    .line 36
    .line 37
    .line 38
    sput-object v0, La/y6u0;->R1:La/bzs0;

    .line 39
    .line 40
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    sput-object v0, La/y6u0;->U1:Ljava/lang/String;

    .line 45
    .line 46
    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    const v0, 0x7f0d0301

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
    iput-object v0, p0, La/y6u0;->K1:La/hnm0;

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    iput-boolean v0, p0, La/y6u0;->L1:Z

    .line 13
    .line 14
    sget-object v1, La/x6u0;->a:La/x6u0;

    .line 15
    .line 16
    invoke-static {p0, v1}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    iput-object v1, p0, La/y6u0;->N1:La/s0r;

    .line 21
    .line 22
    new-instance v1, La/v6u0;

    .line 23
    .line 24
    invoke-direct {v1, p0, v0}, La/v6u0;-><init>(La/y6u0;B)V

    .line 25
    .line 26
    .line 27
    new-instance v2, La/cvs0;

    .line 28
    .line 29
    const/16 v3, 0x9

    .line 30
    .line 31
    invoke-direct {v2, p0, v3}, La/cvs0;-><init>(Ljava/lang/Object;B)V

    .line 32
    .line 33
    .line 34
    sget-object v3, La/wez;->b:La/wez;

    .line 35
    .line 36
    new-instance v4, La/cvs0;

    .line 37
    .line 38
    const/16 v5, 0xa

    .line 39
    .line 40
    invoke-direct {v4, v2, v5}, La/cvs0;-><init>(Ljava/lang/Object;B)V

    .line 41
    .line 42
    .line 43
    invoke-static {v3, v4}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    const-class v3, La/g7u0;

    .line 48
    .line 49
    sget-object v4, La/sre0;->a:La/tre0;

    .line 50
    .line 51
    invoke-virtual {v4, v3}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    new-instance v4, La/w6u0;

    .line 56
    .line 57
    const/4 v5, 0x0

    .line 58
    invoke-direct {v4, v2, v5}, La/w6u0;-><init>(La/a8z;B)V

    .line 59
    .line 60
    .line 61
    new-instance v5, La/w6u0;

    .line 62
    .line 63
    invoke-direct {v5, v2, v0}, La/w6u0;-><init>(La/a8z;B)V

    .line 64
    .line 65
    .line 66
    invoke-static {p0, v3, v4, v5, v1}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    iput-object v0, p0, La/y6u0;->O1:La/kiu0;

    .line 71
    .line 72
    new-instance v0, La/v6u0;

    .line 73
    .line 74
    const/4 v1, 0x2

    .line 75
    invoke-direct {v0, p0, v1}, La/v6u0;-><init>(La/y6u0;B)V

    .line 76
    .line 77
    .line 78
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    iput-object v0, p0, La/y6u0;->P1:La/n0o0;

    .line 83
    .line 84
    new-instance v0, La/zz2;

    .line 85
    .line 86
    const-string v1, "SPECIAL_EVENT_ID_BUNDLE_KEY"

    .line 87
    .line 88
    invoke-direct {v0, v1}, La/zz2;-><init>(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    iput-object v0, p0, La/y6u0;->Q1:La/zz2;

    .line 92
    .line 93
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 10

    .line 1
    invoke-virtual {p0}, La/y6u0;->G0()La/k6r;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object p1, p1, La/k6r;->d:Lorg/xplatform/uikit/components/toolbar/base/DsNavigationBarBasic;

    .line 6
    .line 7
    new-instance v0, La/v6u0;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-direct {v0, p0, v1}, La/v6u0;-><init>(La/y6u0;B)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1, v0}, Lorg/xplatform/uikit/components/toolbar/base/DsNavigationBarBasic;->b(Lkotlin/jvm/functions/Function0;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, La/y6u0;->G0()La/k6r;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iget-object p1, p1, La/k6r;->e:Landroidx/recyclerview/widget/RecyclerView;

    .line 21
    .line 22
    iget-object v0, p0, La/y6u0;->P1:La/n0o0;

    .line 23
    .line 24
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    check-cast v0, La/s6u0;

    .line 29
    .line 30
    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(La/yge0;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0}, La/y6u0;->G0()La/k6r;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    iget-object p1, p1, La/k6r;->e:Landroidx/recyclerview/widget/RecyclerView;

    .line 38
    .line 39
    new-instance v0, La/qmk0;

    .line 40
    .line 41
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->G()Landroid/content/res/Resources;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    const v2, 0x7f07072d

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    const/4 v8, 0x0

    .line 53
    const/16 v9, 0x1de

    .line 54
    .line 55
    const/4 v2, 0x0

    .line 56
    const/4 v3, 0x0

    .line 57
    const/4 v4, 0x0

    .line 58
    const/4 v5, 0x0

    .line 59
    const/4 v6, 0x1

    .line 60
    const/4 v7, 0x0

    .line 61
    invoke-direct/range {v0 .. v9}, La/qmk0;-><init>(IIIIIILkotlin/jvm/functions/Function1;La/rmk0;I)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->m(La/fhe0;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {p0}, La/y6u0;->G0()La/k6r;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    iget-object p0, p0, La/k6r;->e:Landroidx/recyclerview/widget/RecyclerView;

    .line 72
    .line 73
    const/4 p1, 0x1

    .line 74
    invoke-static {p0, p1, p1}, La/vvw;->o(Landroidx/recyclerview/widget/RecyclerView;ZI)V

    .line 75
    .line 76
    .line 77
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
    const-class v1, La/t6u0;

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
    instance-of v3, v0, La/t6u0;

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
    check-cast v2, La/t6u0;

    .line 52
    .line 53
    if-eqz v2, :cond_3

    .line 54
    .line 55
    sget-object v0, La/y6u0;->S1:[La/iiy;

    .line 56
    .line 57
    const/4 v1, 0x1

    .line 58
    aget-object v0, v0, v1

    .line 59
    .line 60
    iget-object v1, p0, La/y6u0;->Q1:La/zz2;

    .line 61
    .line 62
    invoke-virtual {v1, p0, v0}, La/zz2;->w(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Integer;

    .line 63
    .line 64
    .line 65
    move-result-object v8

    .line 66
    invoke-static {p0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 67
    .line 68
    .line 69
    move-result-object v7

    .line 70
    const-class v0, La/y6u0;

    .line 71
    .line 72
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v6

    .line 76
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    iget-object v0, v2, La/t6u0;->a:La/j1q0;

    .line 80
    .line 81
    iget-object v4, v2, La/t6u0;->b:La/cad;

    .line 82
    .line 83
    iget-object v9, v2, La/t6u0;->c:La/knf0;

    .line 84
    .line 85
    iget-object v10, v2, La/t6u0;->d:La/gii0;

    .line 86
    .line 87
    iget-object v11, v2, La/t6u0;->e:La/ctf0;

    .line 88
    .line 89
    iget-object v12, v2, La/t6u0;->f:La/g2v;

    .line 90
    .line 91
    iget-object v13, v2, La/t6u0;->g:La/igm0;

    .line 92
    .line 93
    iget-object v14, v2, La/t6u0;->h:La/yo4;

    .line 94
    .line 95
    iget-object v5, v2, La/t6u0;->i:La/d1p;

    .line 96
    .line 97
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    new-instance v3, La/nc0;

    .line 116
    .line 117
    invoke-direct/range {v3 .. v14}, La/nc0;-><init>(La/cad;La/d1p;Ljava/lang/String;La/i1w0;Ljava/lang/Integer;La/knf0;La/gii0;La/ctf0;La/g2v;La/igm0;La/yo4;)V

    .line 118
    .line 119
    .line 120
    iget-object v0, v3, La/nc0;->n:Ljava/lang/Object;

    .line 121
    .line 122
    check-cast v0, La/n5d0;

    .line 123
    .line 124
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    check-cast v0, La/tyi;

    .line 129
    .line 130
    iput-object v0, p0, La/y6u0;->M1:La/tyi;

    .line 131
    .line 132
    return-void

    .line 133
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 134
    .line 135
    invoke-static {v1, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object p0

    .line 139
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    return-void
.end method

.method public final D0()V
    .locals 11

    .line 1
    iget-object v0, p0, La/y6u0;->O1:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {v0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, La/g7u0;

    .line 8
    .line 9
    iget-object v0, v0, La/g7u0;->j:La/p7m0;

    .line 10
    .line 11
    new-instance v1, La/qaf0;

    .line 12
    .line 13
    const/16 v2, 0x12

    .line 14
    .line 15
    invoke-direct {v1, v0, v2}, La/qaf0;-><init>(La/gmq;B)V

    .line 16
    .line 17
    .line 18
    new-instance v3, La/k5r0;

    .line 19
    .line 20
    const/4 v9, 0x4

    .line 21
    const/16 v10, 0xd

    .line 22
    .line 23
    const/4 v4, 0x2

    .line 24
    const-class v6, La/y6u0;

    .line 25
    .line 26
    const-string v7, "handleUiState"

    .line 27
    .line 28
    const-string v8, "handleUiState(Lorg/xplatform/special_event/impl/venues/presentation/VenuesUiStateModel;)V"

    .line 29
    .line 30
    move-object v5, p0

    .line 31
    invoke-direct/range {v3 .. v10}, La/k5r0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 32
    .line 33
    .line 34
    sget-object p0, La/lkz;->a:La/lkz;

    .line 35
    .line 36
    invoke-static {v5}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    invoke-interface {p0}, La/clz;->x()La/glz;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-static {v0}, La/x0x;->Q(La/glz;)La/tkz;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    new-instance v2, La/tsr0;

    .line 49
    .line 50
    const/4 v4, 0x0

    .line 51
    invoke-direct {v2, v1, p0, v3, v4}, La/tsr0;-><init>(La/qaf0;La/clz;La/k5r0;La/yje;)V

    .line 52
    .line 53
    .line 54
    const/4 p0, 0x3

    .line 55
    invoke-static {v0, v4, v4, v2, p0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 56
    .line 57
    .line 58
    return-void
.end method

.method public final G0()La/k6r;
    .locals 2

    .line 1
    sget-object v0, La/y6u0;->S1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/y6u0;->N1:La/s0r;

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
    check-cast p0, La/k6r;

    .line 16
    .line 17
    return-object p0
.end method

.method public final x0()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, La/y6u0;->L1:Z

    .line 2
    .line 3
    return p0
.end method

.method public final y0()La/jnm0;
    .locals 0

    .line 1
    iget-object p0, p0, La/y6u0;->K1:La/hnm0;

    .line 2
    .line 3
    return-object p0
.end method
