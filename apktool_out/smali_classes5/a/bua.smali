.class public final La/bua;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0007\u00b2\u0006\u000c\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"
    }
    d2 = {
        "La/bua;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/gl5",
        "La/mua;",
        "uiState",
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
.field public static final Q1:La/gl5;

.field public static final synthetic R1:[La/iiy;


# instance fields
.field public final K1:La/f9o0;

.field public L1:La/qbi;

.field public M1:La/ii;

.field public N1:La/wdk0;

.field public final O1:La/s0r;

.field public final P1:La/a8z;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/bua;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;"

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
    sput-object v1, La/bua;->R1:[La/iiy;

    .line 19
    .line 20
    new-instance v0, La/gl5;

    .line 21
    .line 22
    const/16 v1, 0x12

    .line 23
    .line 24
    invoke-direct {v0, v1}, La/gl5;-><init>(B)V

    .line 25
    .line 26
    .line 27
    sput-object v0, La/bua;->Q1:La/gl5;

    .line 28
    .line 29
    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .line 1
    const v0, 0x7f0d0089

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    new-instance v0, La/f9o0;

    .line 8
    .line 9
    const v1, 0x7f040ae3

    .line 10
    .line 11
    .line 12
    invoke-direct {v0, v1}, La/f9o0;-><init>(I)V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, La/bua;->K1:La/f9o0;

    .line 16
    .line 17
    sget-object v0, La/aua;->a:La/aua;

    .line 18
    .line 19
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iput-object v0, p0, La/bua;->O1:La/s0r;

    .line 24
    .line 25
    const-class v0, La/nua;

    .line 26
    .line 27
    sget-object v1, La/sre0;->a:La/tre0;

    .line 28
    .line 29
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    new-instance v1, La/zta;

    .line 34
    .line 35
    const/4 v2, 0x0

    .line 36
    invoke-direct {v1, p0, v2}, La/zta;-><init>(La/bua;B)V

    .line 37
    .line 38
    .line 39
    const/16 v2, 0xe

    .line 40
    .line 41
    const/4 v3, 0x0

    .line 42
    invoke-static {p0, v0, v3, v1, v2}, La/xbc;->a0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;I)La/a8z;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    iput-object v0, p0, La/bua;->P1:La/a8z;

    .line 47
    .line 48
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 5

    .line 1
    sget-object p1, La/bua;->R1:[La/iiy;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    aget-object p1, p1, v0

    .line 5
    .line 6
    iget-object v0, p0, La/bua;->O1:La/s0r;

    .line 7
    .line 8
    invoke-virtual {v0, p1, p0}, La/s0r;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    check-cast p1, La/aid;

    .line 16
    .line 17
    iget-object p1, p1, La/aid;->b:Landroidx/compose/ui/platform/ComposeView;

    .line 18
    .line 19
    new-instance v0, La/bna;

    .line 20
    .line 21
    const/4 v1, 0x2

    .line 22
    invoke-direct {v0, p0, v1}, La/bna;-><init>(Ljava/lang/Object;B)V

    .line 23
    .line 24
    .line 25
    new-instance v2, La/ugd;

    .line 26
    .line 27
    const v3, -0x3a541e76

    .line 28
    .line 29
    .line 30
    const/4 v4, 0x1

    .line 31
    invoke-direct {v2, v3, v4, v0}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    new-instance v0, La/shd;

    .line 35
    .line 36
    const/16 v3, 0xf

    .line 37
    .line 38
    invoke-direct {v0, v3}, La/shd;-><init>(B)V

    .line 39
    .line 40
    .line 41
    invoke-static {p1, v0, v2}, La/pkd;->i(Landroidx/compose/ui/platform/ComposeView;Lkotlin/jvm/functions/Function2;La/ugd;)V

    .line 42
    .line 43
    .line 44
    new-instance p1, La/zta;

    .line 45
    .line 46
    invoke-direct {p1, p0, v4}, La/zta;-><init>(La/bua;B)V

    .line 47
    .line 48
    .line 49
    const-string v0, "REQUEST_RESET_CONFIRM_DIALOG_KEY"

    .line 50
    .line 51
    invoke-static {p0, v0, p1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 52
    .line 53
    .line 54
    new-instance p1, La/zta;

    .line 55
    .line 56
    invoke-direct {p1, p0, v1}, La/zta;-><init>(La/bua;B)V

    .line 57
    .line 58
    .line 59
    const-string v0, "REQUEST_EXIT_CONFIRM_DIALOG_KEY"

    .line 60
    .line 61
    invoke-static {p0, v0, p1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 62
    .line 63
    .line 64
    new-instance p1, La/zta;

    .line 65
    .line 66
    const/4 v0, 0x3

    .line 67
    invoke-direct {p1, p0, v0}, La/zta;-><init>(La/bua;B)V

    .line 68
    .line 69
    .line 70
    invoke-static {p0, p1}, La/qcc;->X(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function0;)V

    .line 71
    .line 72
    .line 73
    return-void
.end method

.method public final C0()V
    .locals 8

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
    const-class v1, La/cua;

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
    instance-of v3, v0, La/cua;

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
    check-cast v2, La/cua;

    .line 52
    .line 53
    if-eqz v2, :cond_3

    .line 54
    .line 55
    invoke-static {p0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    iget-object v1, v2, La/cua;->b:La/ctf0;

    .line 63
    .line 64
    iget-object v3, v2, La/cua;->a:La/cad;

    .line 65
    .line 66
    iget-object v4, v2, La/cua;->c:La/wsf0;

    .line 67
    .line 68
    iget-object v5, v2, La/cua;->d:La/pru;

    .line 69
    .line 70
    iget-object v6, v2, La/cua;->e:La/ii;

    .line 71
    .line 72
    iget-object v2, v2, La/cua;->f:La/wdk0;

    .line 73
    .line 74
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    new-instance v7, La/esg0;

    .line 84
    .line 85
    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    .line 86
    .line 87
    .line 88
    iput-object v0, v7, La/esg0;->a:Ljava/lang/Object;

    .line 89
    .line 90
    iput-object v3, v7, La/esg0;->b:Ljava/lang/Object;

    .line 91
    .line 92
    iput-object v1, v7, La/esg0;->c:Ljava/lang/Object;

    .line 93
    .line 94
    iput-object v4, v7, La/esg0;->d:Ljava/lang/Object;

    .line 95
    .line 96
    iput-object v5, v7, La/esg0;->e:Ljava/lang/Object;

    .line 97
    .line 98
    new-instance v0, La/pai;

    .line 99
    .line 100
    const/4 v1, 0x7

    .line 101
    invoke-direct {v0, v7, v1}, La/pai;-><init>(Ljava/lang/Object;B)V

    .line 102
    .line 103
    .line 104
    invoke-static {v0}, La/n0k0;->a(La/n5d0;)La/n5d0;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    iput-object v0, v7, La/esg0;->f:Ljava/lang/Object;

    .line 109
    .line 110
    iget-object v0, v7, La/esg0;->f:Ljava/lang/Object;

    .line 111
    .line 112
    check-cast v0, La/n5d0;

    .line 113
    .line 114
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    check-cast v0, La/qbi;

    .line 119
    .line 120
    iput-object v0, p0, La/bua;->L1:La/qbi;

    .line 121
    .line 122
    iput-object v6, p0, La/bua;->M1:La/ii;

    .line 123
    .line 124
    iput-object v2, p0, La/bua;->N1:La/wdk0;

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

.method public final G0()La/k3t0;
    .locals 0

    .line 1
    iget-object p0, p0, La/bua;->P1:La/a8z;

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

.method public final z0()La/j9o0;
    .locals 0

    .line 1
    iget-object p0, p0, La/bua;->K1:La/f9o0;

    .line 2
    .line 3
    return-object p0
.end method
