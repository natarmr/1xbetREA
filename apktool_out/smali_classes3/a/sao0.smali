.class public final La/sao0;
.super La/yx5;
.source "SourceFile"

# interfaces
.implements La/cg60;
.implements La/jhg0;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0007"
    }
    d2 = {
        "La/sao0;",
        "La/yx5;",
        "La/cg60;",
        "La/jhg0;",
        "<init>",
        "()V",
        "a/m6m0",
        "app"
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
.field public static final V1:La/m6m0;

.field public static final synthetic W1:[La/iiy;


# instance fields
.field public K1:La/hr00;

.field public L1:La/kt2;

.field public M1:La/oeg0;

.field public N1:La/gle0;

.field public final O1:La/phf0;

.field public final P1:La/cgx0;

.field public final Q1:La/yzn0;

.field public final R1:La/a8z;

.field public final S1:Z

.field public final U1:La/n0o0;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/sao0;

    .line 4
    .line 5
    const-string v2, "screenTag"

    .line 6
    .line 7
    const-string v3, "getScreenTag()Ljava/lang/String;"

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
    const-string v3, "restoredFragment"

    .line 16
    .line 17
    const-string v5, "getRestoredFragment()Z"

    .line 18
    .line 19
    invoke-direct {v2, v1, v3, v5, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    new-instance v3, La/ez40;

    .line 23
    .line 24
    const-string v5, "initialScreenType"

    .line 25
    .line 26
    const-string v6, "getInitialScreenType()Lorg/xplatform/core/navigation/nav_bar/NavBarScreenTypes;"

    .line 27
    .line 28
    invoke-direct {v3, v1, v5, v6, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 29
    .line 30
    .line 31
    const/4 v1, 0x3

    .line 32
    new-array v1, v1, [La/iiy;

    .line 33
    .line 34
    aput-object v0, v1, v4

    .line 35
    .line 36
    const/4 v0, 0x1

    .line 37
    aput-object v2, v1, v0

    .line 38
    .line 39
    const/4 v0, 0x2

    .line 40
    aput-object v3, v1, v0

    .line 41
    .line 42
    sput-object v1, La/sao0;->W1:[La/iiy;

    .line 43
    .line 44
    new-instance v0, La/m6m0;

    .line 45
    .line 46
    const/16 v1, 0xa

    .line 47
    .line 48
    invoke-direct {v0, v1}, La/m6m0;-><init>(B)V

    .line 49
    .line 50
    .line 51
    sput-object v0, La/sao0;->V1:La/m6m0;

    .line 52
    .line 53
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    const v0, 0x7f0d02e7

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    new-instance v0, La/phf0;

    .line 8
    .line 9
    const-string v1, "ARG_SCREEN_TAG"

    .line 10
    .line 11
    invoke-direct {v0, v1}, La/phf0;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, La/sao0;->O1:La/phf0;

    .line 15
    .line 16
    new-instance v0, La/cgx0;

    .line 17
    .line 18
    const-string v1, "ARG_RESTORED_FRAGMENT"

    .line 19
    .line 20
    invoke-direct {v0, v1}, La/cgx0;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, La/sao0;->P1:La/cgx0;

    .line 24
    .line 25
    new-instance v0, La/yzn0;

    .line 26
    .line 27
    const-string v1, "ARG_INITIAL_SCREEN_TYPE"

    .line 28
    .line 29
    invoke-direct {v0, v1}, La/yzn0;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    iput-object v0, p0, La/sao0;->Q1:La/yzn0;

    .line 33
    .line 34
    new-instance v0, La/rao0;

    .line 35
    .line 36
    const/4 v1, 0x0

    .line 37
    invoke-direct {v0, p0, v1}, La/rao0;-><init>(La/sao0;B)V

    .line 38
    .line 39
    .line 40
    sget-object v1, La/wez;->b:La/wez;

    .line 41
    .line 42
    invoke-static {v1, v0}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    iput-object v0, p0, La/sao0;->R1:La/a8z;

    .line 47
    .line 48
    const/4 v0, 0x1

    .line 49
    iput-boolean v0, p0, La/sao0;->S1:Z

    .line 50
    .line 51
    new-instance v1, La/rao0;

    .line 52
    .line 53
    invoke-direct {v1, p0, v0}, La/rao0;-><init>(La/sao0;B)V

    .line 54
    .line 55
    .line 56
    invoke-static {v1}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    iput-object v0, p0, La/sao0;->U1:La/n0o0;

    .line 61
    .line 62
    return-void
.end method


# virtual methods
.method public final C0()V
    .locals 4

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
    const-class v1, La/kvq;

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
    instance-of v3, v0, La/kvq;

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
    check-cast v2, La/kvq;

    .line 52
    .line 53
    if-eqz v2, :cond_3

    .line 54
    .line 55
    sget-object v0, Lorg/platform/app/ApplicationLoader;->v1:Lorg/platform/app/ApplicationLoader;

    .line 56
    .line 57
    invoke-static {}, La/xf0;->N()Lorg/platform/app/ApplicationLoader;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-virtual {v0}, Lorg/platform/app/ApplicationLoader;->c()La/g8i;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    invoke-static {}, La/xf0;->N()Lorg/platform/app/ApplicationLoader;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    iget-object v1, v1, Lorg/platform/app/ApplicationLoader;->p1:La/n0o0;

    .line 70
    .line 71
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    check-cast v1, La/nfi;

    .line 76
    .line 77
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    iget-object v1, v0, La/g8i;->U3:La/n5d0;

    .line 84
    .line 85
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    check-cast v1, La/hr00;

    .line 90
    .line 91
    invoke-static {v1}, La/x1x;->x(Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    iput-object v1, p0, La/sao0;->K1:La/hr00;

    .line 95
    .line 96
    invoke-virtual {v0}, La/g8i;->Q()La/kt2;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    invoke-static {v1}, La/x1x;->x(Ljava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    iput-object v1, p0, La/sao0;->L1:La/kt2;

    .line 104
    .line 105
    iget-object v0, v0, La/g8i;->w3:La/n5d0;

    .line 106
    .line 107
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    check-cast v0, La/oeg0;

    .line 112
    .line 113
    invoke-static {v0}, La/x1x;->x(Ljava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    iput-object v0, p0, La/sao0;->M1:La/oeg0;

    .line 117
    .line 118
    new-instance v0, La/gle0;

    .line 119
    .line 120
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 121
    .line 122
    .line 123
    iput-object v0, p0, La/sao0;->N1:La/gle0;

    .line 124
    .line 125
    return-void

    .line 126
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 127
    .line 128
    invoke-static {v1, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object p0

    .line 132
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    return-void
.end method

.method public final G0()La/ejc;
    .locals 5

    .line 1
    iget-object v0, p0, La/sao0;->K1:La/hr00;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, La/sao0;->H0()La/cb50;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    sget-object v2, La/sao0;->W1:[La/iiy;

    .line 10
    .line 11
    const/4 v3, 0x1

    .line 12
    aget-object v2, v2, v3

    .line 13
    .line 14
    iget-object v4, p0, La/sao0;->P1:La/cgx0;

    .line 15
    .line 16
    invoke-virtual {v4, p0, v2}, La/cgx0;->r(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Boolean;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    xor-int/2addr p0, v3

    .line 25
    invoke-virtual {v0, v1, p0}, La/hr00;->a(La/cb50;Z)La/ejc;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    return-object p0

    .line 30
    :cond_0
    const-string p0, "ciceroneHolder"

    .line 31
    .line 32
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    const/4 p0, 0x0

    .line 36
    throw p0
.end method

.method public final H0()La/cb50;
    .locals 0

    .line 1
    iget-object p0, p0, La/sao0;->R1:La/a8z;

    .line 2
    .line 3
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/cb50;

    .line 8
    .line 9
    return-object p0
.end method

.method public final W(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    move v1, v0

    .line 5
    goto :goto_0

    .line 6
    :cond_0
    const/4 v1, 0x0

    .line 7
    :goto_0
    sget-object v2, La/sao0;->W1:[La/iiy;

    .line 8
    .line 9
    aget-object v0, v2, v0

    .line 10
    .line 11
    iget-object v2, p0, La/sao0;->P1:La/cgx0;

    .line 12
    .line 13
    invoke-virtual {v2, p0, v0, v1}, La/cgx0;->v(Landroidx/fragment/app/Fragment;La/iiy;Z)V

    .line 14
    .line 15
    .line 16
    invoke-super {p0, p1}, La/yx5;->W(Landroid/os/Bundle;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final d0()V
    .locals 2

    .line 1
    invoke-virtual {p0}, La/sao0;->G0()La/ejc;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/ejc;->a:La/i1w0;

    .line 6
    .line 7
    iget-object v0, v0, La/i1w0;->a:La/cu;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    iput-object v1, v0, La/cu;->b:Ljava/lang/Object;

    .line 11
    .line 12
    iget-object v0, p0, La/sao0;->M1:La/oeg0;

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    sget-object v1, La/hhg0;->a:La/hhg0;

    .line 17
    .line 18
    iget-object v0, v0, La/oeg0;->a:Ljava/util/LinkedHashMap;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    const/4 v0, 0x1

    .line 24
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->j1:Z

    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    const-string p0, "rootRouterHolder"

    .line 28
    .line 29
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    throw v1
.end method

.method public final e0()V
    .locals 3

    .line 1
    invoke-super {p0}, La/yx5;->e0()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La/sao0;->M1:La/oeg0;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0}, La/sao0;->G0()La/ejc;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    iget-object v1, v1, La/ejc;->a:La/i1w0;

    .line 13
    .line 14
    sget-object v2, La/hhg0;->a:La/hhg0;

    .line 15
    .line 16
    invoke-virtual {v0, v2, v1}, La/oeg0;->a(La/ihg0;La/i1w0;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, La/sao0;->G0()La/ejc;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iget-object v0, v0, La/ejc;->a:La/i1w0;

    .line 24
    .line 25
    iget-object v0, v0, La/i1w0;->a:La/cu;

    .line 26
    .line 27
    iget-object p0, p0, La/sao0;->U1:La/n0o0;

    .line 28
    .line 29
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    check-cast p0, La/rs3;

    .line 34
    .line 35
    invoke-virtual {v0, p0}, La/cu;->q(La/rs3;)V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :cond_0
    const-string p0, "rootRouterHolder"

    .line 40
    .line 41
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    const/4 p0, 0x0

    .line 45
    throw p0
.end method

.method public final getRouter()La/i1w0;
    .locals 0

    .line 1
    invoke-virtual {p0}, La/sao0;->G0()La/ejc;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object p0, p0, La/ejc;->a:La/i1w0;

    .line 6
    .line 7
    return-object p0
.end method

.method public final j()Z
    .locals 5

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const v1, 0x7f0a0388

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroidx/fragment/app/e;->I(I)Landroidx/fragment/app/Fragment;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    instance-of v1, v0, La/cg60;

    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    check-cast v0, La/cg60;

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 v0, 0x0

    .line 20
    :goto_0
    const/4 v1, 0x1

    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    invoke-interface {v0}, La/cg60;->j()Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    goto :goto_1

    .line 28
    :cond_1
    move v0, v1

    .line 29
    :goto_1
    const/4 v2, 0x0

    .line 30
    if-nez v0, :cond_2

    .line 31
    .line 32
    goto :goto_3

    .line 33
    :cond_2
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-virtual {v0}, Landroidx/fragment/app/e;->P()I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-nez v0, :cond_3

    .line 42
    .line 43
    return v1

    .line 44
    :cond_3
    invoke-virtual {p0}, La/sao0;->G0()La/ejc;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    iget-object p0, p0, La/ejc;->a:La/i1w0;

    .line 49
    .line 50
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 51
    .line 52
    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 53
    .line 54
    .line 55
    new-instance v1, La/c8d;

    .line 56
    .line 57
    sget-object v3, La/y7d;->a:La/v7d;

    .line 58
    .line 59
    sget-object v4, La/p0w0;->a:La/p0w0;

    .line 60
    .line 61
    invoke-direct {v1, v3, v4}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 62
    .line 63
    .line 64
    invoke-static {v0, v1, p0, v0, v2}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    :goto_2
    move-object v1, v0

    .line 69
    check-cast v1, La/paw;

    .line 70
    .line 71
    invoke-virtual {v1}, La/paw;->hasNext()Z

    .line 72
    .line 73
    .line 74
    move-result v3

    .line 75
    if-eqz v3, :cond_4

    .line 76
    .line 77
    invoke-virtual {v1}, La/paw;->next()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    check-cast v1, La/oe50;

    .line 82
    .line 83
    invoke-virtual {p0, v1}, La/i1w0;->a(La/oe50;)V

    .line 84
    .line 85
    .line 86
    goto :goto_2

    .line 87
    :cond_4
    :goto_3
    return v2
.end method

.method public final x0()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, La/sao0;->S1:Z

    .line 2
    .line 3
    return p0
.end method
