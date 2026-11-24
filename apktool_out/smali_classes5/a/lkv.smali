.class public final La/lkv;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0006"
    }
    d2 = {
        "La/lkv;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/v62",
        "a/rqt",
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
.field public static final Q1:La/rqt;

.field public static final synthetic R1:[La/iiy;


# instance fields
.field public final K1:La/hnm0;

.field public L1:La/mii;

.field public final M1:La/kiu0;

.field public final N1:La/s0r;

.field public final O1:La/a8z;

.field public final P1:La/v62;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/lkv;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/shake/impl/databinding/FragmentHandshakeSettingsBinding;"

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
    sput-object v1, La/lkv;->R1:[La/iiy;

    .line 19
    .line 20
    new-instance v0, La/rqt;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    sput-object v0, La/lkv;->Q1:La/rqt;

    .line 26
    .line 27
    return-void
.end method

.method public constructor <init>()V
    .locals 7

    .line 1
    const v0, 0x7f0d024b

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
    iput-object v0, p0, La/lkv;->K1:La/hnm0;

    .line 10
    .line 11
    new-instance v0, La/jkv;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-direct {v0, p0, v1}, La/jkv;-><init>(La/lkv;B)V

    .line 15
    .line 16
    .line 17
    new-instance v1, La/t7t;

    .line 18
    .line 19
    const/16 v2, 0xe

    .line 20
    .line 21
    invoke-direct {v1, p0, v2}, La/t7t;-><init>(Ljava/lang/Object;B)V

    .line 22
    .line 23
    .line 24
    sget-object v2, La/wez;->b:La/wez;

    .line 25
    .line 26
    new-instance v3, La/t7t;

    .line 27
    .line 28
    const/16 v4, 0xf

    .line 29
    .line 30
    invoke-direct {v3, v1, v4}, La/t7t;-><init>(Ljava/lang/Object;B)V

    .line 31
    .line 32
    .line 33
    invoke-static {v2, v3}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    const-class v3, La/xkv;

    .line 38
    .line 39
    sget-object v4, La/sre0;->a:La/tre0;

    .line 40
    .line 41
    invoke-virtual {v4, v3}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    new-instance v4, La/r6p;

    .line 46
    .line 47
    const/16 v5, 0x1c

    .line 48
    .line 49
    invoke-direct {v4, v1, v5}, La/r6p;-><init>(La/a8z;B)V

    .line 50
    .line 51
    .line 52
    new-instance v5, La/r6p;

    .line 53
    .line 54
    const/16 v6, 0x1d

    .line 55
    .line 56
    invoke-direct {v5, v1, v6}, La/r6p;-><init>(La/a8z;B)V

    .line 57
    .line 58
    .line 59
    invoke-static {p0, v3, v4, v5, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    iput-object v0, p0, La/lkv;->M1:La/kiu0;

    .line 64
    .line 65
    sget-object v0, La/kkv;->a:La/kkv;

    .line 66
    .line 67
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    iput-object v0, p0, La/lkv;->N1:La/s0r;

    .line 72
    .line 73
    new-instance v0, La/jkv;

    .line 74
    .line 75
    const/4 v1, 0x1

    .line 76
    invoke-direct {v0, p0, v1}, La/jkv;-><init>(La/lkv;B)V

    .line 77
    .line 78
    .line 79
    invoke-static {v2, v0}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    iput-object v0, p0, La/lkv;->O1:La/a8z;

    .line 84
    .line 85
    new-instance v0, La/v62;

    .line 86
    .line 87
    const/16 v1, 0xb

    .line 88
    .line 89
    invoke-direct {v0, p0, v1}, La/v62;-><init>(Ljava/lang/Object;B)V

    .line 90
    .line 91
    .line 92
    iput-object v0, p0, La/lkv;->P1:La/v62;

    .line 93
    .line 94
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 5

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, La/agd;->k()La/jg60;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->K()La/n6r;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iget-object v1, p0, La/lkv;->P1:La/v62;

    .line 14
    .line 15
    invoke-virtual {p1, v0, v1}, La/jg60;->a(La/clz;La/eg60;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, La/lkv;->G0()La/p0r;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    iget-object p1, p1, La/p0r;->b:Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;

    .line 23
    .line 24
    new-instance v0, La/jkv;

    .line 25
    .line 26
    const/4 v1, 0x2

    .line 27
    invoke-direct {v0, p0, v1}, La/jkv;-><init>(La/lkv;B)V

    .line 28
    .line 29
    .line 30
    invoke-static {p1, v0}, La/mc50;->a(La/mc50;Lkotlin/jvm/functions/Function0;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0}, La/lkv;->G0()La/p0r;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    iget-object p1, p1, La/p0r;->c:Landroidx/recyclerview/widget/RecyclerView;

    .line 38
    .line 39
    iget-object v0, p0, La/lkv;->O1:La/a8z;

    .line 40
    .line 41
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    check-cast v0, La/hkv;

    .line 46
    .line 47
    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(La/yge0;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0}, La/lkv;->G0()La/p0r;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    iget-object p1, p1, La/p0r;->c:Landroidx/recyclerview/widget/RecyclerView;

    .line 55
    .line 56
    new-instance v0, La/qkv;

    .line 57
    .line 58
    const/4 v1, 0x0

    .line 59
    invoke-direct {v0, v1}, La/qkv;-><init>(B)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->m(La/fhe0;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p0}, La/lkv;->G0()La/p0r;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    iget-object p1, p1, La/p0r;->c:Landroidx/recyclerview/widget/RecyclerView;

    .line 70
    .line 71
    const/4 v0, 0x3

    .line 72
    invoke-static {p1, v1, v0}, La/vvw;->o(Landroidx/recyclerview/widget/RecyclerView;ZI)V

    .line 73
    .line 74
    .line 75
    iget-object p1, p0, La/lkv;->M1:La/kiu0;

    .line 76
    .line 77
    invoke-virtual {p1}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    check-cast p1, La/xkv;

    .line 82
    .line 83
    iget-object p1, p1, La/xkv;->l:La/p7m0;

    .line 84
    .line 85
    invoke-static {p1}, La/vtb;->N(La/qz40;)La/xae0;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    new-instance v1, La/j0s;

    .line 90
    .line 91
    const/16 v2, 0x17

    .line 92
    .line 93
    const/4 v3, 0x0

    .line 94
    invoke-direct {v1, p0, v3, v2}, La/j0s;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 95
    .line 96
    .line 97
    sget-object v2, La/lkz;->a:La/lkz;

    .line 98
    .line 99
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    invoke-interface {p0}, La/clz;->x()La/glz;

    .line 104
    .line 105
    .line 106
    move-result-object v2

    .line 107
    invoke-static {v2}, La/x0x;->Q(La/glz;)La/tkz;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    new-instance v4, La/hgv;

    .line 112
    .line 113
    invoke-direct {v4, p1, p0, v1, v3}, La/hgv;-><init>(La/xae0;La/clz;La/j0s;La/yje;)V

    .line 114
    .line 115
    .line 116
    invoke-static {v2, v3, v3, v4, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 117
    .line 118
    .line 119
    return-void
.end method

.method public final C0()V
    .locals 10

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
    const-class v1, La/ikv;

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
    instance-of v3, v0, La/ikv;

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
    check-cast v2, La/ikv;

    .line 52
    .line 53
    if-eqz v2, :cond_3

    .line 54
    .line 55
    const-class v0, La/lkv;

    .line 56
    .line 57
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v5

    .line 61
    iget-object v4, v2, La/ikv;->a:La/d1p;

    .line 62
    .line 63
    iget-object v6, v2, La/ikv;->b:La/zg;

    .line 64
    .line 65
    iget-object v7, v2, La/ikv;->c:La/pru;

    .line 66
    .line 67
    iget-object v8, v2, La/ikv;->d:La/q7d0;

    .line 68
    .line 69
    iget-object v9, v2, La/ikv;->e:La/ctf0;

    .line 70
    .line 71
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    new-instance v3, La/xzp;

    .line 81
    .line 82
    invoke-direct/range {v3 .. v9}, La/xzp;-><init>(La/d1p;Ljava/lang/String;La/zg;La/pru;La/q7d0;La/ctf0;)V

    .line 83
    .line 84
    .line 85
    iget-object v0, v3, La/xzp;->g:Ljava/lang/Object;

    .line 86
    .line 87
    check-cast v0, La/n5d0;

    .line 88
    .line 89
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    check-cast v0, La/mii;

    .line 94
    .line 95
    iput-object v0, p0, La/lkv;->L1:La/mii;

    .line 96
    .line 97
    return-void

    .line 98
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 99
    .line 100
    invoke-static {v1, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    return-void
.end method

.method public final G0()La/p0r;
    .locals 2

    .line 1
    sget-object v0, La/lkv;->R1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/lkv;->N1:La/s0r;

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
    check-cast p0, La/p0r;

    .line 16
    .line 17
    return-object p0
.end method

.method public final y0()La/jnm0;
    .locals 0

    .line 1
    iget-object p0, p0, La/lkv;->K1:La/hnm0;

    .line 2
    .line 3
    return-object p0
.end method
