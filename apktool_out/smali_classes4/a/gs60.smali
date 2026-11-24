.class public final La/gs60;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/gs60;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/uuz",
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
.field public static final R1:La/uuz;

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
    const-class v1, La/gs60;

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
    sput-object v1, La/gs60;->S1:[La/iiy;

    .line 31
    .line 32
    new-instance v0, La/uuz;

    .line 33
    .line 34
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 35
    .line 36
    .line 37
    sput-object v0, La/gs60;->R1:La/uuz;

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
    iput-object v0, p0, La/gs60;->K1:La/phf0;

    .line 15
    .line 16
    sget-object v0, La/fs60;->a:La/fs60;

    .line 17
    .line 18
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iput-object v0, p0, La/gs60;->L1:La/s0r;

    .line 23
    .line 24
    new-instance v0, La/es60;

    .line 25
    .line 26
    const/4 v1, 0x0

    .line 27
    invoke-direct {v0, p0, v1}, La/es60;-><init>(La/gs60;B)V

    .line 28
    .line 29
    .line 30
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    iput-object v0, p0, La/gs60;->M1:La/n0o0;

    .line 35
    .line 36
    new-instance v0, La/es60;

    .line 37
    .line 38
    const/4 v1, 0x1

    .line 39
    invoke-direct {v0, p0, v1}, La/es60;-><init>(La/gs60;B)V

    .line 40
    .line 41
    .line 42
    sget-object v1, La/wez;->b:La/wez;

    .line 43
    .line 44
    new-instance v2, La/ej50;

    .line 45
    .line 46
    const/16 v3, 0xf

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
    const/4 v4, 0x4

    .line 66
    invoke-direct {v3, v0, v4}, La/co60;-><init>(La/a8z;B)V

    .line 67
    .line 68
    .line 69
    new-instance v4, La/co60;

    .line 70
    .line 71
    const/4 v5, 0x5

    .line 72
    invoke-direct {v4, v0, v5}, La/co60;-><init>(La/a8z;B)V

    .line 73
    .line 74
    .line 75
    new-instance v5, La/ha30;

    .line 76
    .line 77
    const/16 v6, 0xc

    .line 78
    .line 79
    invoke-direct {v5, p0, v0, v6}, La/ha30;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 80
    .line 81
    .line 82
    invoke-static {p0, v2, v3, v4, v5}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    iput-object v0, p0, La/gs60;->P1:La/kiu0;

    .line 87
    .line 88
    const-class v0, La/bs60;

    .line 89
    .line 90
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    new-instance v1, La/es60;

    .line 95
    .line 96
    const/4 v2, 0x2

    .line 97
    invoke-direct {v1, p0, v2}, La/es60;-><init>(La/gs60;B)V

    .line 98
    .line 99
    .line 100
    invoke-static {p0, v0, v1}, La/xbc;->b0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    iput-object v0, p0, La/gs60;->Q1:La/a8z;

    .line 105
    .line 106
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 6

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v2, La/cs60;

    .line 6
    .line 7
    const/4 p1, 0x3

    .line 8
    invoke-direct {v2, p0, p1}, La/cs60;-><init>(La/gs60;B)V

    .line 9
    .line 10
    .line 11
    new-instance v3, La/es60;

    .line 12
    .line 13
    invoke-direct {v3, p0, p1}, La/es60;-><init>(La/gs60;B)V

    .line 14
    .line 15
    .line 16
    const/4 v4, 0x0

    .line 17
    const/16 v5, 0x12

    .line 18
    .line 19
    move-object v1, p0

    .line 20
    invoke-static/range {v0 .. v5}, La/o2t;->e(Landroidx/fragment/app/e;La/clz;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;La/bm60;I)V

    .line 21
    .line 22
    .line 23
    iget-object p0, v1, La/gs60;->M1:La/n0o0;

    .line 24
    .line 25
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    check-cast p0, La/z7i;

    .line 30
    .line 31
    iget-object p0, p0, La/z7i;->j:La/bw60;

    .line 32
    .line 33
    invoke-interface {p0}, La/bw60;->b()La/afm0;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-static {p0}, La/x1x;->x(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    new-instance p0, La/cs60;

    .line 41
    .line 42
    const/4 p1, 0x0

    .line 43
    invoke-direct {p0, v1, p1}, La/cs60;-><init>(La/gs60;B)V

    .line 44
    .line 45
    .line 46
    invoke-static {v1, p0}, La/afm0;->s(La/yx5;Lkotlin/jvm/functions/Function1;)V

    .line 47
    .line 48
    .line 49
    sget-object p0, La/gs60;->S1:[La/iiy;

    .line 50
    .line 51
    const/4 v0, 0x1

    .line 52
    aget-object v2, p0, v0

    .line 53
    .line 54
    iget-object v3, v1, La/gs60;->L1:La/s0r;

    .line 55
    .line 56
    invoke-virtual {v3, v2, v1}, La/s0r;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    check-cast v2, La/aid;

    .line 64
    .line 65
    iget-object v2, v2, La/aid;->a:Landroidx/compose/ui/platform/ComposeView;

    .line 66
    .line 67
    invoke-virtual {v2, v0}, Landroid/view/View;->setFocusable(Z)V

    .line 68
    .line 69
    .line 70
    aget-object p0, p0, v0

    .line 71
    .line 72
    invoke-virtual {v3, p0, v1}, La/s0r;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    check-cast p0, La/aid;

    .line 80
    .line 81
    iget-object p0, p0, La/aid;->a:Landroidx/compose/ui/platform/ComposeView;

    .line 82
    .line 83
    sget-object v2, La/qek0;->h:La/qek0;

    .line 84
    .line 85
    new-instance v3, La/ds60;

    .line 86
    .line 87
    invoke-direct {v3, v1, p1}, La/ds60;-><init>(Ljava/lang/Object;B)V

    .line 88
    .line 89
    .line 90
    new-instance p1, La/ugd;

    .line 91
    .line 92
    const v1, -0x4b8c3b43

    .line 93
    .line 94
    .line 95
    invoke-direct {p1, v1, v0, v3}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    new-instance v0, La/shd;

    .line 99
    .line 100
    const/16 v1, 0xe

    .line 101
    .line 102
    invoke-direct {v0, v1}, La/shd;-><init>(B)V

    .line 103
    .line 104
    .line 105
    invoke-static {p0, v2, v0, p1}, La/pkd;->h(Landroidx/compose/ui/platform/ComposeView;La/vgu0;La/shd;La/ugd;)V

    .line 106
    .line 107
    .line 108
    return-void
.end method

.method public final C0()V
    .locals 4

    .line 1
    iget-object v0, p0, La/gs60;->M1:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, La/z7i;

    .line 8
    .line 9
    new-instance v1, La/fiu0;

    .line 10
    .line 11
    const-class v2, La/bs60;

    .line 12
    .line 13
    iget-object v3, v0, La/z7i;->I:La/t5i;

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
    iput-object v1, p0, La/gs60;->N1:La/fiu0;

    .line 23
    .line 24
    iget-object v0, v0, La/z7i;->H:La/peg0;

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
    iput-object v0, p0, La/gs60;->O1:La/ynb;

    .line 38
    .line 39
    return-void
.end method

.method public final G0()La/k3t0;
    .locals 0

    .line 1
    iget-object p0, p0, La/gs60;->Q1:La/a8z;

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

.method public final Z()V
    .locals 0

    .line 1
    invoke-super {p0}, La/yx5;->Z()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-static {p0}, La/o2t;->a(Landroidx/fragment/app/e;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final g0()V
    .locals 1

    .line 1
    invoke-super {p0}, La/yx5;->g0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, La/gs60;->G0()La/k3t0;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    sget-object v0, La/pp60;->a:La/pp60;

    .line 9
    .line 10
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final h0()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->j1:Z

    .line 3
    .line 4
    invoke-virtual {p0}, La/gs60;->G0()La/k3t0;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    sget-object v0, La/op60;->a:La/op60;

    .line 9
    .line 10
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final x0()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method
