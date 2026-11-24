.class public final La/ol5;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/ol5;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/kl5",
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
.field public static final R1:La/kl5;

.field public static final synthetic S1:[La/iiy;


# instance fields
.field public K1:La/l9i;

.field public L1:La/ynb;

.field public M1:La/ii;

.field public N1:La/wdk0;

.field public O1:Ljava/lang/String;

.field public final P1:La/kiu0;

.field public final Q1:La/s0r;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/ol5;

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
    sput-object v1, La/ol5;->S1:[La/iiy;

    .line 19
    .line 20
    new-instance v0, La/kl5;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    sput-object v0, La/ol5;->R1:La/kl5;

    .line 26
    .line 27
    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    const v0, 0x7f0d0089

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    const-string v0, ""

    .line 8
    .line 9
    iput-object v0, p0, La/ol5;->O1:Ljava/lang/String;

    .line 10
    .line 11
    new-instance v0, La/zo4;

    .line 12
    .line 13
    const/16 v1, 0xb

    .line 14
    .line 15
    invoke-direct {v0, p0, v1}, La/zo4;-><init>(Ljava/lang/Object;B)V

    .line 16
    .line 17
    .line 18
    new-instance v1, La/pp4;

    .line 19
    .line 20
    const/16 v2, 0x19

    .line 21
    .line 22
    invoke-direct {v1, p0, v2}, La/pp4;-><init>(Ljava/lang/Object;B)V

    .line 23
    .line 24
    .line 25
    sget-object v2, La/wez;->b:La/wez;

    .line 26
    .line 27
    new-instance v3, La/pp4;

    .line 28
    .line 29
    const/16 v4, 0x1a

    .line 30
    .line 31
    invoke-direct {v3, v1, v4}, La/pp4;-><init>(Ljava/lang/Object;B)V

    .line 32
    .line 33
    .line 34
    invoke-static {v2, v3}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    const-class v2, La/dk5;

    .line 39
    .line 40
    sget-object v3, La/sre0;->a:La/tre0;

    .line 41
    .line 42
    invoke-virtual {v3, v2}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    new-instance v3, La/qw4;

    .line 47
    .line 48
    const/16 v4, 0xe

    .line 49
    .line 50
    invoke-direct {v3, v1, v4}, La/qw4;-><init>(La/a8z;B)V

    .line 51
    .line 52
    .line 53
    new-instance v4, La/qw4;

    .line 54
    .line 55
    const/16 v5, 0xf

    .line 56
    .line 57
    invoke-direct {v4, v1, v5}, La/qw4;-><init>(La/a8z;B)V

    .line 58
    .line 59
    .line 60
    invoke-static {p0, v2, v3, v4, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    iput-object v0, p0, La/ol5;->P1:La/kiu0;

    .line 65
    .line 66
    sget-object v0, La/ll5;->a:La/ll5;

    .line 67
    .line 68
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    iput-object v0, p0, La/ol5;->Q1:La/s0r;

    .line 73
    .line 74
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance v0, La/jl5;

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    invoke-direct {v0, p0, v1}, La/jl5;-><init>(La/ol5;B)V

    .line 9
    .line 10
    .line 11
    const-string v2, "CHANGE_BALANCE_KEY"

    .line 12
    .line 13
    invoke-virtual {p1, v2, p0, v0}, Landroidx/fragment/app/e;->u0(Ljava/lang/String;La/clz;La/k4r;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    new-instance v0, La/jl5;

    .line 21
    .line 22
    const/4 v2, 0x0

    .line 23
    invoke-direct {v0, p0, v2}, La/jl5;-><init>(La/ol5;B)V

    .line 24
    .line 25
    .line 26
    const-string v3, "CHANGE_BALANCE_REQUEST_KEY"

    .line 27
    .line 28
    invoke-virtual {p1, v3, p0, v0}, Landroidx/fragment/app/e;->u0(Ljava/lang/String;La/clz;La/k4r;)V

    .line 29
    .line 30
    .line 31
    sget-object p1, La/ol5;->S1:[La/iiy;

    .line 32
    .line 33
    aget-object p1, p1, v2

    .line 34
    .line 35
    iget-object v0, p0, La/ol5;->Q1:La/s0r;

    .line 36
    .line 37
    invoke-virtual {v0, p1, p0}, La/s0r;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    check-cast p1, La/aid;

    .line 45
    .line 46
    iget-object p1, p1, La/aid;->a:Landroidx/compose/ui/platform/ComposeView;

    .line 47
    .line 48
    new-instance v0, La/fa2;

    .line 49
    .line 50
    const/16 v2, 0x16

    .line 51
    .line 52
    invoke-direct {v0, p0, v2}, La/fa2;-><init>(Ljava/lang/Object;B)V

    .line 53
    .line 54
    .line 55
    new-instance p0, La/ugd;

    .line 56
    .line 57
    const v2, -0x4798b170

    .line 58
    .line 59
    .line 60
    invoke-direct {p0, v2, v1, v0}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    invoke-static {p1, p0}, La/b1j;->t(Landroidx/compose/ui/platform/ComposeView;La/ugd;)V

    .line 64
    .line 65
    .line 66
    return-void
.end method

.method public final C0()V
    .locals 5

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
    const-class v1, La/ti5;

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
    instance-of v3, v0, La/ti5;

    .line 46
    .line 47
    if-nez v3, :cond_2

    .line 48
    .line 49
    move-object v0, v2

    .line 50
    :cond_2
    check-cast v0, La/ti5;

    .line 51
    .line 52
    if-eqz v0, :cond_3

    .line 53
    .line 54
    iget-object v1, p0, La/ol5;->O1:Ljava/lang/String;

    .line 55
    .line 56
    const/4 v3, 0x7

    .line 57
    const/4 v4, 0x0

    .line 58
    invoke-static {v0, v2, v4, v1, v3}, La/ti5;->a(La/ti5;La/l4b;ZLjava/lang/String;I)La/n9i;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    iget-object v1, v0, La/n9i;->J:La/n5d0;

    .line 63
    .line 64
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    check-cast v1, La/l9i;

    .line 69
    .line 70
    iput-object v1, p0, La/ol5;->K1:La/l9i;

    .line 71
    .line 72
    iget-object v1, v0, La/n9i;->H:La/peg0;

    .line 73
    .line 74
    iget-object v1, v1, La/peg0;->b:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v1, La/yzn0;

    .line 77
    .line 78
    invoke-virtual {v1}, La/yzn0;->i()La/ynb;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    invoke-static {v1}, La/x1x;->x(Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    iput-object v1, p0, La/ol5;->L1:La/ynb;

    .line 86
    .line 87
    iget-object v1, v0, La/n9i;->F:La/ii;

    .line 88
    .line 89
    iput-object v1, p0, La/ol5;->M1:La/ii;

    .line 90
    .line 91
    iget-object v0, v0, La/n9i;->G:La/wdk0;

    .line 92
    .line 93
    iput-object v0, p0, La/ol5;->N1:La/wdk0;

    .line 94
    .line 95
    return-void

    .line 96
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 97
    .line 98
    invoke-static {v1, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    return-void
.end method

.method public final D0()V
    .locals 6

    .line 1
    invoke-virtual {p0}, La/ol5;->G0()La/dk5;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/dk5;->b0:La/ol60;

    .line 6
    .line 7
    new-instance v1, La/nl5;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    const/4 v3, 0x0

    .line 11
    invoke-direct {v1, p0, v3, v2}, La/nl5;-><init>(La/ol5;La/yje;B)V

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
    move-result-object v4

    .line 24
    invoke-static {v4}, La/x0x;->Q(La/glz;)La/tkz;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    new-instance v5, La/me5;

    .line 29
    .line 30
    invoke-direct {v5, v0, v2, v1, v3}, La/me5;-><init>(La/gmq;La/clz;La/nl5;La/yje;)V

    .line 31
    .line 32
    .line 33
    const/4 v0, 0x3

    .line 34
    invoke-static {v4, v3, v3, v5, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, La/ol5;->G0()La/dk5;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    iget-object v1, v1, La/dk5;->a0:La/p7m0;

    .line 42
    .line 43
    invoke-static {v1}, La/vtb;->N(La/qz40;)La/xae0;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    new-instance v2, La/nl5;

    .line 48
    .line 49
    const/4 v4, 0x1

    .line 50
    invoke-direct {v2, p0, v3, v4}, La/nl5;-><init>(La/ol5;La/yje;B)V

    .line 51
    .line 52
    .line 53
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    invoke-interface {p0}, La/clz;->x()La/glz;

    .line 58
    .line 59
    .line 60
    move-result-object v4

    .line 61
    invoke-static {v4}, La/x0x;->Q(La/glz;)La/tkz;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    new-instance v5, La/me5;

    .line 66
    .line 67
    invoke-direct {v5, v1, p0, v2, v3}, La/me5;-><init>(La/xae0;La/clz;La/nl5;La/yje;)V

    .line 68
    .line 69
    .line 70
    invoke-static {v4, v3, v3, v5, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 71
    .line 72
    .line 73
    return-void
.end method

.method public final G0()La/dk5;
    .locals 0

    .line 1
    iget-object p0, p0, La/ol5;->P1:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/dk5;

    .line 8
    .line 9
    return-object p0
.end method

.method public final e0()V
    .locals 0

    .line 1
    invoke-super {p0}, La/yx5;->e0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, La/ol5;->G0()La/dk5;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-virtual {p0}, La/dk5;->x()V

    .line 9
    .line 10
    .line 11
    return-void
.end method
