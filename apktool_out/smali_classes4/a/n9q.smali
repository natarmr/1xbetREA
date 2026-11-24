.class public final La/n9q;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0001\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "La/n9q;",
        "La/yx5;",
        "<init>",
        "()V",
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
.field public static final synthetic S1:[La/iiy;


# instance fields
.field public final K1:La/s0r;

.field public L1:La/ihi;

.field public M1:La/xi70;

.field public N1:La/wdk0;

.field public O1:La/d720;

.field public P1:La/lgn0;

.field public Q1:La/ii;

.field public final R1:La/a8z;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/n9q;

    .line 4
    .line 5
    const-string v2, "viewBinding"

    .line 6
    .line 7
    const-string v3, "getViewBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;"

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
    sput-object v1, La/n9q;->S1:[La/iiy;

    .line 19
    .line 20
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
    sget-object v0, La/m9q;->a:La/m9q;

    .line 8
    .line 9
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, La/n9q;->K1:La/s0r;

    .line 14
    .line 15
    const-class v0, La/ebq;

    .line 16
    .line 17
    sget-object v1, La/sre0;->a:La/tre0;

    .line 18
    .line 19
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    new-instance v1, La/l9q;

    .line 24
    .line 25
    const/4 v2, 0x0

    .line 26
    invoke-direct {v1, p0, v2}, La/l9q;-><init>(La/n9q;B)V

    .line 27
    .line 28
    .line 29
    const/16 v2, 0xe

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    invoke-static {p0, v0, v3, v1, v2}, La/xbc;->a0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;I)La/a8z;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    iput-object v0, p0, La/n9q;->R1:La/a8z;

    .line 37
    .line 38
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    new-instance p1, La/l9q;

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    invoke-direct {p1, p0, v0}, La/l9q;-><init>(La/n9q;B)V

    .line 5
    .line 6
    .line 7
    const-string v1, "BET_ALREADY_DONE_REQUEST_KEY"

    .line 8
    .line 9
    invoke-static {p0, v1, p1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 10
    .line 11
    .line 12
    new-instance p1, La/l9q;

    .line 13
    .line 14
    const/4 v1, 0x2

    .line 15
    invoke-direct {p1, p0, v1}, La/l9q;-><init>(La/n9q;B)V

    .line 16
    .line 17
    .line 18
    const-string v1, "REQUEST_INSUFFICIENT_FOUNDS_DIALOG_KEY"

    .line 19
    .line 20
    invoke-static {p0, v1, p1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    new-instance v1, La/z9f;

    .line 28
    .line 29
    const/16 v2, 0x1a

    .line 30
    .line 31
    invoke-direct {v1, p0, v2}, La/z9f;-><init>(Ljava/lang/Object;B)V

    .line 32
    .line 33
    .line 34
    const-string v2, "REQUEST_FINISH_MAKE_BET_DIALOG_KEY"

    .line 35
    .line 36
    invoke-virtual {p1, v2, p0, v1}, Landroidx/fragment/app/e;->u0(Ljava/lang/String;La/clz;La/k4r;)V

    .line 37
    .line 38
    .line 39
    sget-object p1, La/n9q;->S1:[La/iiy;

    .line 40
    .line 41
    const/4 v1, 0x0

    .line 42
    aget-object p1, p1, v1

    .line 43
    .line 44
    iget-object v1, p0, La/n9q;->K1:La/s0r;

    .line 45
    .line 46
    invoke-virtual {v1, p1, p0}, La/s0r;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    check-cast p1, La/aid;

    .line 54
    .line 55
    iget-object p1, p1, La/aid;->b:Landroidx/compose/ui/platform/ComposeView;

    .line 56
    .line 57
    new-instance v1, La/f5o;

    .line 58
    .line 59
    const/16 v2, 0x19

    .line 60
    .line 61
    invoke-direct {v1, p0, v2}, La/f5o;-><init>(Ljava/lang/Object;B)V

    .line 62
    .line 63
    .line 64
    new-instance p0, La/ugd;

    .line 65
    .line 66
    const v2, -0x309474a1

    .line 67
    .line 68
    .line 69
    invoke-direct {p0, v2, v0, v1}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    invoke-static {p1, p0}, La/b1j;->t(Landroidx/compose/ui/platform/ComposeView;La/ugd;)V

    .line 73
    .line 74
    .line 75
    return-void
.end method

.method public final C0()V
    .locals 7

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
    const-class v1, La/o9q;

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
    instance-of v3, v0, La/o9q;

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
    check-cast v2, La/o9q;

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
    invoke-virtual {v2, v0}, La/o9q;->a(La/i1w0;)La/tai;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    iget-object v1, v0, La/tai;->j:La/n5d0;

    .line 64
    .line 65
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    check-cast v1, La/ihi;

    .line 70
    .line 71
    iput-object v1, p0, La/n9q;->L1:La/ihi;

    .line 72
    .line 73
    iget-object v1, v0, La/tai;->v:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v1, La/rmd0;

    .line 76
    .line 77
    invoke-interface {v1}, La/rmd0;->f()La/xi70;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    iput-object v1, p0, La/n9q;->M1:La/xi70;

    .line 82
    .line 83
    iget-object v1, v0, La/tai;->C:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast v1, La/wdk0;

    .line 86
    .line 87
    iput-object v1, p0, La/n9q;->N1:La/wdk0;

    .line 88
    .line 89
    new-instance v1, La/d720;

    .line 90
    .line 91
    iget-object v2, v0, La/tai;->D:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast v2, La/lbu;

    .line 94
    .line 95
    new-instance v3, La/lk5;

    .line 96
    .line 97
    iget-object v4, v0, La/tai;->g:La/pru;

    .line 98
    .line 99
    iget-object v5, v0, La/tai;->h:La/r9u;

    .line 100
    .line 101
    const/4 v6, 0x3

    .line 102
    invoke-direct {v3, v4, v5, v6}, La/lk5;-><init>(La/pru;La/r9u;B)V

    .line 103
    .line 104
    .line 105
    invoke-direct {v1, v2, v3}, La/d720;-><init>(La/lbu;La/lk5;)V

    .line 106
    .line 107
    .line 108
    iput-object v1, p0, La/n9q;->O1:La/d720;

    .line 109
    .line 110
    iget-object v1, v0, La/tai;->E:Ljava/lang/Object;

    .line 111
    .line 112
    check-cast v1, La/lgn0;

    .line 113
    .line 114
    iput-object v1, p0, La/n9q;->P1:La/lgn0;

    .line 115
    .line 116
    iget-object v0, v0, La/tai;->F:Ljava/lang/Object;

    .line 117
    .line 118
    check-cast v0, La/ii;

    .line 119
    .line 120
    iput-object v0, p0, La/n9q;->Q1:La/ii;

    .line 121
    .line 122
    return-void

    .line 123
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 124
    .line 125
    invoke-static {v1, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object p0

    .line 129
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    return-void
.end method

.method public final G0()La/k3t0;
    .locals 0

    .line 1
    iget-object p0, p0, La/n9q;->R1:La/a8z;

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
    const/4 p0, 0x0

    .line 2
    return p0
.end method
