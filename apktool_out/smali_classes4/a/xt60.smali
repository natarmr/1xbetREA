.class public final La/xt60;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/xt60;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/xuz",
        "cashback"
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
.field public static final V1:La/xuz;

.field public static final synthetic W1:[La/iiy;


# instance fields
.field public final K1:La/phf0;

.field public final L1:La/s0r;

.field public M1:La/fiu0;

.field public N1:La/ii;

.field public O1:La/wdk0;

.field public P1:La/peg0;

.field public final Q1:La/kiu0;

.field public final R1:La/a8z;

.field public final S1:La/hnm0;

.field public final U1:La/n0o0;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/xt60;

    .line 4
    .line 5
    const-string v2, "umResultKey"

    .line 6
    .line 7
    const-string v3, "getUmResultKey()Ljava/lang/String;"

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
    const-string v5, "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;"

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
    sput-object v1, La/xt60;->W1:[La/iiy;

    .line 31
    .line 32
    new-instance v0, La/xuz;

    .line 33
    .line 34
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 35
    .line 36
    .line 37
    sput-object v0, La/xt60;->V1:La/xuz;

    .line 38
    .line 39
    return-void
.end method

.method public constructor <init>()V
    .locals 7

    .line 1
    const v0, 0x7f0d0089

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
    const-string v1, "UM_RESULT_KEY"

    .line 10
    .line 11
    invoke-direct {v0, v1}, La/phf0;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, La/xt60;->K1:La/phf0;

    .line 15
    .line 16
    sget-object v0, La/wt60;->a:La/wt60;

    .line 17
    .line 18
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iput-object v0, p0, La/xt60;->L1:La/s0r;

    .line 23
    .line 24
    new-instance v0, La/ut60;

    .line 25
    .line 26
    const/4 v1, 0x0

    .line 27
    invoke-direct {v0, p0, v1}, La/ut60;-><init>(La/xt60;B)V

    .line 28
    .line 29
    .line 30
    sget-object v1, La/wez;->b:La/wez;

    .line 31
    .line 32
    new-instance v2, La/ej50;

    .line 33
    .line 34
    const/16 v3, 0x10

    .line 35
    .line 36
    invoke-direct {v2, v0, v3}, La/ej50;-><init>(Ljava/lang/Object;B)V

    .line 37
    .line 38
    .line 39
    invoke-static {v1, v2}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    sget-object v1, La/sre0;->a:La/tre0;

    .line 44
    .line 45
    const-class v2, La/k370;

    .line 46
    .line 47
    invoke-virtual {v1, v2}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    new-instance v3, La/co60;

    .line 52
    .line 53
    const/4 v4, 0x6

    .line 54
    invoke-direct {v3, v0, v4}, La/co60;-><init>(La/a8z;B)V

    .line 55
    .line 56
    .line 57
    new-instance v4, La/co60;

    .line 58
    .line 59
    const/4 v5, 0x7

    .line 60
    invoke-direct {v4, v0, v5}, La/co60;-><init>(La/a8z;B)V

    .line 61
    .line 62
    .line 63
    new-instance v5, La/ha30;

    .line 64
    .line 65
    const/16 v6, 0xd

    .line 66
    .line 67
    invoke-direct {v5, p0, v0, v6}, La/ha30;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 68
    .line 69
    .line 70
    invoke-static {p0, v2, v3, v4, v5}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    iput-object v0, p0, La/xt60;->Q1:La/kiu0;

    .line 75
    .line 76
    const-class v0, La/hv60;

    .line 77
    .line 78
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    new-instance v1, La/ut60;

    .line 83
    .line 84
    const/4 v2, 0x2

    .line 85
    invoke-direct {v1, p0, v2}, La/ut60;-><init>(La/xt60;B)V

    .line 86
    .line 87
    .line 88
    invoke-static {p0, v0, v1}, La/xbc;->b0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    iput-object v0, p0, La/xt60;->R1:La/a8z;

    .line 93
    .line 94
    sget-object v0, La/hnm0;->a:La/hnm0;

    .line 95
    .line 96
    iput-object v0, p0, La/xt60;->S1:La/hnm0;

    .line 97
    .line 98
    new-instance v0, La/ut60;

    .line 99
    .line 100
    const/4 v1, 0x3

    .line 101
    invoke-direct {v0, p0, v1}, La/ut60;-><init>(La/xt60;B)V

    .line 102
    .line 103
    .line 104
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    iput-object v0, p0, La/xt60;->U1:La/n0o0;

    .line 109
    .line 110
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 4

    .line 1
    new-instance p1, La/ut60;

    .line 2
    .line 3
    const/4 v0, 0x4

    .line 4
    invoke-direct {p1, p0, v0}, La/ut60;-><init>(La/xt60;B)V

    .line 5
    .line 6
    .line 7
    const-string v0, "REQUEST_FREE_SPIN"

    .line 8
    .line 9
    invoke-static {p0, v0, p1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 10
    .line 11
    .line 12
    sget-object p1, La/xt60;->W1:[La/iiy;

    .line 13
    .line 14
    const/4 v0, 0x1

    .line 15
    aget-object p1, p1, v0

    .line 16
    .line 17
    iget-object v1, p0, La/xt60;->L1:La/s0r;

    .line 18
    .line 19
    invoke-virtual {v1, p1, p0}, La/s0r;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    check-cast p1, La/aid;

    .line 27
    .line 28
    iget-object p1, p1, La/aid;->a:Landroidx/compose/ui/platform/ComposeView;

    .line 29
    .line 30
    sget-object v1, La/qek0;->h:La/qek0;

    .line 31
    .line 32
    new-instance v2, La/ds60;

    .line 33
    .line 34
    invoke-direct {v2, p0, v0}, La/ds60;-><init>(Ljava/lang/Object;B)V

    .line 35
    .line 36
    .line 37
    new-instance p0, La/ugd;

    .line 38
    .line 39
    const v3, 0x91682d4

    .line 40
    .line 41
    .line 42
    invoke-direct {p0, v3, v0, v2}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    new-instance v0, La/shd;

    .line 46
    .line 47
    const/16 v2, 0xe

    .line 48
    .line 49
    invoke-direct {v0, v2}, La/shd;-><init>(B)V

    .line 50
    .line 51
    .line 52
    invoke-static {p1, v1, v0, p0}, La/pkd;->h(Landroidx/compose/ui/platform/ComposeView;La/vgu0;La/shd;La/ugd;)V

    .line 53
    .line 54
    .line 55
    return-void
.end method

.method public final C0()V
    .locals 2

    .line 1
    iget-object v0, p0, La/xt60;->U1:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, La/rbi;

    .line 8
    .line 9
    invoke-virtual {v0}, La/rbi;->a()La/fiu0;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iput-object v1, p0, La/xt60;->M1:La/fiu0;

    .line 14
    .line 15
    iget-object v1, v0, La/rbi;->R:La/ii;

    .line 16
    .line 17
    iput-object v1, p0, La/xt60;->N1:La/ii;

    .line 18
    .line 19
    iget-object v1, v0, La/rbi;->S:La/wdk0;

    .line 20
    .line 21
    iput-object v1, p0, La/xt60;->O1:La/wdk0;

    .line 22
    .line 23
    iget-object v0, v0, La/rbi;->T:La/peg0;

    .line 24
    .line 25
    iput-object v0, p0, La/xt60;->P1:La/peg0;

    .line 26
    .line 27
    return-void
.end method

.method public final D0()V
    .locals 5

    .line 1
    iget-object v0, p0, La/xt60;->Q1:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {v0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, La/k370;

    .line 8
    .line 9
    invoke-virtual {v0}, La/k370;->w()La/gmq;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    new-instance v1, La/nf60;

    .line 14
    .line 15
    const/16 v2, 0x9

    .line 16
    .line 17
    const/4 v3, 0x0

    .line 18
    invoke-direct {v1, p0, v3, v2}, La/nf60;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 19
    .line 20
    .line 21
    sget-object v2, La/lkz;->a:La/lkz;

    .line 22
    .line 23
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-interface {p0}, La/clz;->x()La/glz;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    invoke-static {v2}, La/x0x;->Q(La/glz;)La/tkz;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    new-instance v4, La/yd60;

    .line 36
    .line 37
    check-cast v0, La/i89;

    .line 38
    .line 39
    invoke-direct {v4, v0, p0, v1, v3}, La/yd60;-><init>(La/i89;La/clz;La/nf60;La/yje;)V

    .line 40
    .line 41
    .line 42
    const/4 p0, 0x3

    .line 43
    invoke-static {v2, v3, v3, v4, p0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 44
    .line 45
    .line 46
    return-void
.end method

.method public final G0()La/k3t0;
    .locals 0

    .line 1
    iget-object p0, p0, La/xt60;->R1:La/a8z;

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

.method public final x0()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public final y0()La/jnm0;
    .locals 0

    .line 1
    iget-object p0, p0, La/xt60;->S1:La/hnm0;

    .line 2
    .line 3
    return-object p0
.end method
