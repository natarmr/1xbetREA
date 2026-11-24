.class public final La/k1s0;
.super La/yx5;
.source "SourceFile"

# interfaces
.implements La/a0s0;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "La/k1s0;",
        "La/yx5;",
        "La/a0s0;",
        "<init>",
        "()V",
        "daily_tournament"
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
.field public static final synthetic P1:[La/iiy;


# instance fields
.field public final K1:La/i9o0;

.field public L1:La/zxi;

.field public final M1:La/kiu0;

.field public final N1:La/n0o0;

.field public final O1:La/s0r;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/k1s0;

    .line 4
    .line 5
    const-string v2, "viewBinding"

    .line 6
    .line 7
    const-string v3, "getViewBinding()Lorg/xplatform/games_section/feature/daily_tournament/databinding/DailyTournamentScreenFgBinding;"

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
    sput-object v1, La/k1s0;->P1:[La/iiy;

    .line 19
    .line 20
    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    const v0, 0x7f0d00fc

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
    iput-object v0, p0, La/k1s0;->K1:La/i9o0;

    .line 10
    .line 11
    new-instance v0, La/i1s0;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-direct {v0, p0, v1}, La/i1s0;-><init>(La/k1s0;B)V

    .line 15
    .line 16
    .line 17
    new-instance v1, La/moq0;

    .line 18
    .line 19
    const/16 v2, 0x10

    .line 20
    .line 21
    invoke-direct {v1, p0, v2}, La/moq0;-><init>(Ljava/lang/Object;B)V

    .line 22
    .line 23
    .line 24
    sget-object v2, La/wez;->b:La/wez;

    .line 25
    .line 26
    new-instance v3, La/moq0;

    .line 27
    .line 28
    const/16 v4, 0x11

    .line 29
    .line 30
    invoke-direct {v3, v1, v4}, La/moq0;-><init>(Ljava/lang/Object;B)V

    .line 31
    .line 32
    .line 33
    invoke-static {v2, v3}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    const-class v2, La/f7j;

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
    new-instance v3, La/p7r0;

    .line 46
    .line 47
    const/16 v4, 0xa

    .line 48
    .line 49
    invoke-direct {v3, v1, v4}, La/p7r0;-><init>(La/a8z;B)V

    .line 50
    .line 51
    .line 52
    new-instance v4, La/p7r0;

    .line 53
    .line 54
    const/16 v5, 0xb

    .line 55
    .line 56
    invoke-direct {v4, v1, v5}, La/p7r0;-><init>(La/a8z;B)V

    .line 57
    .line 58
    .line 59
    invoke-static {p0, v2, v3, v4, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    iput-object v0, p0, La/k1s0;->M1:La/kiu0;

    .line 64
    .line 65
    new-instance v0, La/i1s0;

    .line 66
    .line 67
    const/4 v1, 0x1

    .line 68
    invoke-direct {v0, p0, v1}, La/i1s0;-><init>(La/k1s0;B)V

    .line 69
    .line 70
    .line 71
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    iput-object v0, p0, La/k1s0;->N1:La/n0o0;

    .line 76
    .line 77
    sget-object v0, La/j1s0;->a:La/j1s0;

    .line 78
    .line 79
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    iput-object v0, p0, La/k1s0;->O1:La/s0r;

    .line 84
    .line 85
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->G()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const v0, 0x7f07072d

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    invoke-virtual {p0}, La/k1s0;->G0()La/x6j;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iget-object v0, v0, La/x6j;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 17
    .line 18
    new-instance v1, La/kq8;

    .line 19
    .line 20
    const/4 v2, 0x4

    .line 21
    invoke-direct {v1, p1, v2}, La/kq8;-><init>(IB)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->m(La/fhe0;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, La/k1s0;->G0()La/x6j;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    iget-object p0, p0, La/x6j;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 32
    .line 33
    const/4 p1, 0x0

    .line 34
    const/4 v0, 0x3

    .line 35
    invoke-static {p0, p1, v0}, La/vvw;->o(Landroidx/recyclerview/widget/RecyclerView;ZI)V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public final C0()V
    .locals 1

    .line 1
    iget-object v0, p0, La/k1s0;->N1:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, La/dyi;

    .line 8
    .line 9
    iget-object v0, v0, La/dyi;->c:La/n5d0;

    .line 10
    .line 11
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, La/zxi;

    .line 16
    .line 17
    iput-object v0, p0, La/k1s0;->L1:La/zxi;

    .line 18
    .line 19
    return-void
.end method

.method public final D0()V
    .locals 5

    .line 1
    iget-object v0, p0, La/k1s0;->M1:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {v0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, La/f7j;

    .line 8
    .line 9
    iget-object v0, v0, La/f7j;->h:La/p7m0;

    .line 10
    .line 11
    new-instance v1, La/rtq0;

    .line 12
    .line 13
    const/4 v2, 0x4

    .line 14
    const/4 v3, 0x0

    .line 15
    invoke-direct {v1, p0, v3, v2}, La/rtq0;-><init>(Ljava/lang/Object;La/yje;B)V

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
    move-result-object p0

    .line 24
    invoke-interface {p0}, La/clz;->x()La/glz;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-static {v2}, La/x0x;->Q(La/glz;)La/tkz;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    new-instance v4, La/tsr0;

    .line 33
    .line 34
    invoke-direct {v4, v0, p0, v1, v3}, La/tsr0;-><init>(La/gmq;La/clz;La/rtq0;La/yje;)V

    .line 35
    .line 36
    .line 37
    const/4 p0, 0x3

    .line 38
    invoke-static {v2, v3, v3, v4, p0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 39
    .line 40
    .line 41
    return-void
.end method

.method public final G0()La/x6j;
    .locals 2

    .line 1
    sget-object v0, La/k1s0;->P1:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/k1s0;->O1:La/s0r;

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
    check-cast p0, La/x6j;

    .line 16
    .line 17
    return-object p0
.end method

.method public final Z()V
    .locals 1

    .line 1
    invoke-super {p0}, La/yx5;->Z()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, La/k1s0;->G0()La/x6j;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    iget-object p0, p0, La/x6j;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(La/yge0;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final s()La/dyi;
    .locals 0

    .line 1
    iget-object p0, p0, La/k1s0;->N1:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/dyi;

    .line 8
    .line 9
    return-object p0
.end method

.method public final z0()La/j9o0;
    .locals 0

    .line 1
    iget-object p0, p0, La/k1s0;->K1:La/i9o0;

    .line 2
    .line 3
    return-object p0
.end method
