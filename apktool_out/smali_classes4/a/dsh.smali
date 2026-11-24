.class public final La/dsh;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/dsh;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/usd",
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
.field public static final V1:La/usd;

.field public static final synthetic W1:[La/iiy;


# instance fields
.field public final K1:La/i9o0;

.field public L1:La/fiu0;

.field public M1:La/wdk0;

.field public final N1:Z

.field public final O1:La/kiu0;

.field public final P1:La/s0r;

.field public final Q1:La/yqc;

.field public final R1:La/ash;

.field public final S1:La/ash;

.field public final U1:La/a8z;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/dsh;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/cyber/section/impl/databinding/CybergamesWorldCupBinding;"

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
    sput-object v1, La/dsh;->W1:[La/iiy;

    .line 19
    .line 20
    new-instance v0, La/usd;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    sput-object v0, La/dsh;->V1:La/usd;

    .line 26
    .line 27
    return-void
.end method

.method public constructor <init>()V
    .locals 8

    .line 1
    const v0, 0x7f0d00f4

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
    iput-object v0, p0, La/dsh;->K1:La/i9o0;

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    iput-boolean v0, p0, La/dsh;->N1:Z

    .line 13
    .line 14
    new-instance v1, La/zrh;

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    invoke-direct {v1, p0, v2}, La/zrh;-><init>(La/dsh;B)V

    .line 18
    .line 19
    .line 20
    new-instance v2, La/q7g;

    .line 21
    .line 22
    const/16 v3, 0x12

    .line 23
    .line 24
    invoke-direct {v2, p0, v3}, La/q7g;-><init>(Ljava/lang/Object;B)V

    .line 25
    .line 26
    .line 27
    sget-object v3, La/wez;->b:La/wez;

    .line 28
    .line 29
    new-instance v4, La/q7g;

    .line 30
    .line 31
    const/16 v5, 0x13

    .line 32
    .line 33
    invoke-direct {v4, v2, v5}, La/q7g;-><init>(Ljava/lang/Object;B)V

    .line 34
    .line 35
    .line 36
    invoke-static {v3, v4}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    const-class v4, La/rsh;

    .line 41
    .line 42
    sget-object v5, La/sre0;->a:La/tre0;

    .line 43
    .line 44
    invoke-virtual {v5, v4}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    new-instance v5, La/r7g;

    .line 49
    .line 50
    const/16 v6, 0x14

    .line 51
    .line 52
    invoke-direct {v5, v2, v6}, La/r7g;-><init>(La/a8z;B)V

    .line 53
    .line 54
    .line 55
    new-instance v6, La/r7g;

    .line 56
    .line 57
    const/16 v7, 0x15

    .line 58
    .line 59
    invoke-direct {v6, v2, v7}, La/r7g;-><init>(La/a8z;B)V

    .line 60
    .line 61
    .line 62
    invoke-static {p0, v4, v5, v6, v1}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    iput-object v1, p0, La/dsh;->O1:La/kiu0;

    .line 67
    .line 68
    sget-object v1, La/bsh;->a:La/bsh;

    .line 69
    .line 70
    invoke-static {p0, v1}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    iput-object v1, p0, La/dsh;->P1:La/s0r;

    .line 75
    .line 76
    new-instance v1, La/yqc;

    .line 77
    .line 78
    const/16 v2, 0xf

    .line 79
    .line 80
    invoke-direct {v1, v2}, La/yqc;-><init>(B)V

    .line 81
    .line 82
    .line 83
    iput-object v1, p0, La/dsh;->Q1:La/yqc;

    .line 84
    .line 85
    new-instance v1, La/ash;

    .line 86
    .line 87
    invoke-direct {v1, p0}, La/ash;-><init>(La/dsh;)V

    .line 88
    .line 89
    .line 90
    iput-object v1, p0, La/dsh;->R1:La/ash;

    .line 91
    .line 92
    new-instance v1, La/ash;

    .line 93
    .line 94
    invoke-direct {v1, p0}, La/ash;-><init>(La/dsh;)V

    .line 95
    .line 96
    .line 97
    iput-object v1, p0, La/dsh;->S1:La/ash;

    .line 98
    .line 99
    new-instance v1, La/zrh;

    .line 100
    .line 101
    invoke-direct {v1, p0, v0}, La/zrh;-><init>(La/dsh;B)V

    .line 102
    .line 103
    .line 104
    invoke-static {v3, v1}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    iput-object v0, p0, La/dsh;->U1:La/a8z;

    .line 109
    .line 110
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 8

    .line 1
    invoke-virtual {p0}, La/dsh;->G0()La/buh;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object p1, p1, La/buh;->b:Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;

    .line 6
    .line 7
    new-instance v0, La/oye;

    .line 8
    .line 9
    invoke-virtual {p0}, La/dsh;->H0()La/rsh;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    const/4 v6, 0x0

    .line 14
    const/16 v7, 0x1a

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    const-class v3, La/rsh;

    .line 18
    .line 19
    const-string v4, "onRefreshClick"

    .line 20
    .line 21
    const-string v5, "onRefreshClick()V"

    .line 22
    .line 23
    invoke-direct/range {v0 .. v7}, La/oye;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1, v0}, Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;->setButtonOnClickListener(Lkotlin/jvm/functions/Function0;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, La/dsh;->G0()La/buh;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    iget-object p1, p1, La/buh;->c:Landroidx/recyclerview/widget/RecyclerView;

    .line 34
    .line 35
    iget-object v0, p0, La/dsh;->U1:La/a8z;

    .line 36
    .line 37
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    check-cast v0, La/xrh;

    .line 42
    .line 43
    iget-object p0, p0, La/dsh;->Q1:La/yqc;

    .line 44
    .line 45
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    iput-object v0, p0, La/yqc;->b:Ljava/lang/Object;

    .line 52
    .line 53
    new-instance p0, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 54
    .line 55
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    invoke-direct {p0, v1}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p1, p0}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/b;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(La/yge0;)V

    .line 66
    .line 67
    .line 68
    new-instance p0, La/yrh;

    .line 69
    .line 70
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    const/4 v1, 0x0

    .line 78
    invoke-direct {p0, v0, v1}, La/yrh;-><init>(Landroid/content/Context;B)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {p1, p0}, Landroidx/recyclerview/widget/RecyclerView;->m(La/fhe0;)V

    .line 82
    .line 83
    .line 84
    return-void
.end method

.method public final C0()V
    .locals 2

    .line 1
    invoke-static {p0}, La/t9x;->K(La/yx5;)La/fei;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, La/fei;->a()La/fiu0;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iput-object v1, p0, La/dsh;->L1:La/fiu0;

    .line 10
    .line 11
    iget-object v0, v0, La/fei;->s:La/wdk0;

    .line 12
    .line 13
    iput-object v0, p0, La/dsh;->M1:La/wdk0;

    .line 14
    .line 15
    return-void
.end method

.method public final D0()V
    .locals 9

    .line 1
    invoke-virtual {p0}, La/dsh;->H0()La/rsh;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/rsh;->k:La/p7m0;

    .line 6
    .line 7
    new-instance v1, La/csh;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    const/4 v7, 0x0

    .line 11
    invoke-direct {v1, p0, v7, v2}, La/csh;-><init>(La/dsh;La/yje;B)V

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
    new-instance v4, La/g8g;

    .line 29
    .line 30
    invoke-direct {v4, v0, v2, v1, v7}, La/g8g;-><init>(La/gmq;La/clz;La/csh;La/yje;)V

    .line 31
    .line 32
    .line 33
    const/4 v0, 0x3

    .line 34
    invoke-static {v3, v7, v7, v4, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, La/dsh;->H0()La/rsh;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    iget-object v4, v1, La/rsh;->l:La/ol60;

    .line 42
    .line 43
    new-instance v6, La/csh;

    .line 44
    .line 45
    const/4 v1, 0x1

    .line 46
    invoke-direct {v6, p0, v7, v1}, La/csh;-><init>(La/dsh;La/yje;B)V

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
    new-instance v3, La/g8g;

    .line 62
    .line 63
    const/4 v8, 0x0

    .line 64
    invoke-direct/range {v3 .. v8}, La/g8g;-><init>(La/gmq;La/clz;La/csh;La/yje;B)V

    .line 65
    .line 66
    .line 67
    invoke-static {p0, v7, v7, v3, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 68
    .line 69
    .line 70
    return-void
.end method

.method public final G0()La/buh;
    .locals 2

    .line 1
    sget-object v0, La/dsh;->W1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/dsh;->P1:La/s0r;

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
    check-cast p0, La/buh;

    .line 16
    .line 17
    return-object p0
.end method

.method public final H0()La/rsh;
    .locals 0

    .line 1
    iget-object p0, p0, La/dsh;->O1:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/rsh;

    .line 8
    .line 9
    return-object p0
.end method

.method public final x0()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, La/dsh;->N1:Z

    .line 2
    .line 3
    return p0
.end method

.method public final z0()La/j9o0;
    .locals 0

    .line 1
    iget-object p0, p0, La/dsh;->K1:La/i9o0;

    .line 2
    .line 3
    return-object p0
.end method
