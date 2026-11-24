.class public final La/gx60;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/gx60;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/atz",
        "games_list"
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
.field public static final R1:La/atz;

.field public static final synthetic S1:[La/iiy;


# instance fields
.field public final K1:La/phf0;

.field public final L1:La/s0r;

.field public final M1:La/n0o0;

.field public N1:La/fiu0;

.field public O1:La/ynb;

.field public final P1:La/kiu0;

.field public final Q1:La/a8z;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/gx60;

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
    sput-object v1, La/gx60;->S1:[La/iiy;

    .line 31
    .line 32
    new-instance v0, La/atz;

    .line 33
    .line 34
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 35
    .line 36
    .line 37
    sput-object v0, La/gx60;->R1:La/atz;

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
    iput-object v0, p0, La/gx60;->K1:La/phf0;

    .line 15
    .line 16
    sget-object v0, La/fx60;->a:La/fx60;

    .line 17
    .line 18
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iput-object v0, p0, La/gx60;->L1:La/s0r;

    .line 23
    .line 24
    new-instance v0, La/dx60;

    .line 25
    .line 26
    const/4 v1, 0x1

    .line 27
    invoke-direct {v0, p0, v1}, La/dx60;-><init>(La/gx60;B)V

    .line 28
    .line 29
    .line 30
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    iput-object v0, p0, La/gx60;->M1:La/n0o0;

    .line 35
    .line 36
    new-instance v0, La/dx60;

    .line 37
    .line 38
    const/4 v1, 0x2

    .line 39
    invoke-direct {v0, p0, v1}, La/dx60;-><init>(La/gx60;B)V

    .line 40
    .line 41
    .line 42
    sget-object v1, La/wez;->b:La/wez;

    .line 43
    .line 44
    new-instance v2, La/ej50;

    .line 45
    .line 46
    const/16 v3, 0x14

    .line 47
    .line 48
    invoke-direct {v2, v0, v3}, La/ej50;-><init>(Ljava/lang/Object;B)V

    .line 49
    .line 50
    .line 51
    invoke-static {v1, v2}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    sget-object v1, La/sre0;->a:La/tre0;

    .line 56
    .line 57
    const-class v2, La/k370;

    .line 58
    .line 59
    invoke-virtual {v1, v2}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    new-instance v3, La/co60;

    .line 64
    .line 65
    const/16 v4, 0xc

    .line 66
    .line 67
    invoke-direct {v3, v0, v4}, La/co60;-><init>(La/a8z;B)V

    .line 68
    .line 69
    .line 70
    new-instance v4, La/co60;

    .line 71
    .line 72
    const/16 v5, 0xd

    .line 73
    .line 74
    invoke-direct {v4, v0, v5}, La/co60;-><init>(La/a8z;B)V

    .line 75
    .line 76
    .line 77
    new-instance v5, La/ha30;

    .line 78
    .line 79
    const/16 v6, 0xf

    .line 80
    .line 81
    invoke-direct {v5, p0, v0, v6}, La/ha30;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 82
    .line 83
    .line 84
    invoke-static {p0, v2, v3, v4, v5}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    iput-object v0, p0, La/gx60;->P1:La/kiu0;

    .line 89
    .line 90
    const-class v0, La/dy60;

    .line 91
    .line 92
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    new-instance v1, La/dx60;

    .line 97
    .line 98
    const/4 v2, 0x3

    .line 99
    invoke-direct {v1, p0, v2}, La/dx60;-><init>(La/gx60;B)V

    .line 100
    .line 101
    .line 102
    invoke-static {p0, v0, v1}, La/xbc;->b0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    iput-object v0, p0, La/gx60;->Q1:La/a8z;

    .line 107
    .line 108
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 4

    .line 1
    iget-object p1, p0, La/gx60;->M1:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {p1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, La/bii;

    .line 8
    .line 9
    iget-object p1, p1, La/bii;->q:La/bw60;

    .line 10
    .line 11
    invoke-interface {p1}, La/bw60;->b()La/afm0;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-static {p1}, La/x1x;->x(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    new-instance p1, La/cx60;

    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    invoke-direct {p1, p0, v0}, La/cx60;-><init>(La/gx60;B)V

    .line 22
    .line 23
    .line 24
    invoke-static {p0, p1}, La/afm0;->s(La/yx5;Lkotlin/jvm/functions/Function1;)V

    .line 25
    .line 26
    .line 27
    sget-object p1, La/gx60;->S1:[La/iiy;

    .line 28
    .line 29
    const/4 v0, 0x1

    .line 30
    aget-object v1, p1, v0

    .line 31
    .line 32
    iget-object v2, p0, La/gx60;->L1:La/s0r;

    .line 33
    .line 34
    invoke-virtual {v2, v1, p0}, La/s0r;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    check-cast v1, La/aid;

    .line 42
    .line 43
    iget-object v1, v1, La/aid;->a:Landroidx/compose/ui/platform/ComposeView;

    .line 44
    .line 45
    invoke-virtual {v1, v0}, Landroid/view/View;->setFocusable(Z)V

    .line 46
    .line 47
    .line 48
    aget-object p1, p1, v0

    .line 49
    .line 50
    invoke-virtual {v2, p1, p0}, La/s0r;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    check-cast p1, La/aid;

    .line 58
    .line 59
    iget-object p1, p1, La/aid;->a:Landroidx/compose/ui/platform/ComposeView;

    .line 60
    .line 61
    sget-object v1, La/qek0;->h:La/qek0;

    .line 62
    .line 63
    new-instance v2, La/ds60;

    .line 64
    .line 65
    const/4 v3, 0x3

    .line 66
    invoke-direct {v2, p0, v3}, La/ds60;-><init>(Ljava/lang/Object;B)V

    .line 67
    .line 68
    .line 69
    new-instance p0, La/ugd;

    .line 70
    .line 71
    const v3, 0x7a40110f

    .line 72
    .line 73
    .line 74
    invoke-direct {p0, v3, v0, v2}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    new-instance v0, La/shd;

    .line 78
    .line 79
    const/16 v2, 0xe

    .line 80
    .line 81
    invoke-direct {v0, v2}, La/shd;-><init>(B)V

    .line 82
    .line 83
    .line 84
    invoke-static {p1, v1, v0, p0}, La/pkd;->h(Landroidx/compose/ui/platform/ComposeView;La/vgu0;La/shd;La/ugd;)V

    .line 85
    .line 86
    .line 87
    return-void
.end method

.method public final C0()V
    .locals 4

    .line 1
    iget-object v0, p0, La/gx60;->M1:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, La/bii;

    .line 8
    .line 9
    new-instance v1, La/fiu0;

    .line 10
    .line 11
    const-class v2, La/dy60;

    .line 12
    .line 13
    iget-object v3, v0, La/bii;->A:La/ugi;

    .line 14
    .line 15
    invoke-static {v2, v3}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-direct {v1, v2}, La/fiu0;-><init>(Ljava/util/Map;)V

    .line 20
    .line 21
    .line 22
    iput-object v1, p0, La/gx60;->N1:La/fiu0;

    .line 23
    .line 24
    iget-object v0, v0, La/bii;->z:La/peg0;

    .line 25
    .line 26
    iget-object v0, v0, La/peg0;->b:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v0, La/yzn0;

    .line 29
    .line 30
    invoke-virtual {v0}, La/yzn0;->i()La/ynb;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-static {v0}, La/x1x;->x(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    iput-object v0, p0, La/gx60;->O1:La/ynb;

    .line 38
    .line 39
    return-void
.end method

.method public final D0()V
    .locals 7

    .line 1
    iget-object v0, p0, La/gx60;->P1:La/kiu0;

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
    new-instance v4, La/nf60;

    .line 14
    .line 15
    const/16 v1, 0xa

    .line 16
    .line 17
    const/4 v5, 0x0

    .line 18
    invoke-direct {v4, p0, v5, v1}, La/nf60;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 19
    .line 20
    .line 21
    sget-object v1, La/lkz;->a:La/lkz;

    .line 22
    .line 23
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    invoke-interface {v3}, La/clz;->x()La/glz;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-static {p0}, La/x0x;->Q(La/glz;)La/tkz;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    new-instance v1, La/yd60;

    .line 36
    .line 37
    move-object v2, v0

    .line 38
    check-cast v2, La/i89;

    .line 39
    .line 40
    const/4 v6, 0x0

    .line 41
    invoke-direct/range {v1 .. v6}, La/yd60;-><init>(La/i89;La/clz;La/nf60;La/yje;B)V

    .line 42
    .line 43
    .line 44
    const/4 v0, 0x3

    .line 45
    invoke-static {p0, v5, v5, v1, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 46
    .line 47
    .line 48
    return-void
.end method

.method public final G0()La/k3t0;
    .locals 0

    .line 1
    iget-object p0, p0, La/gx60;->Q1:La/a8z;

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
