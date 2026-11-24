.class public final La/cr50;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/cr50;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/evz",
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
.field public static final R1:La/evz;

.field public static final synthetic S1:[La/iiy;


# instance fields
.field public K1:La/fiu0;

.field public final L1:La/a8z;

.field public final M1:La/zz2;

.field public final N1:La/cgx0;

.field public final O1:Z

.field public final P1:La/s0r;

.field public final Q1:La/v62;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/cr50;

    .line 4
    .line 5
    const-string v2, "bannerId"

    .line 6
    .line 7
    const-string v3, "getBannerId()I"

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
    const-string v3, "fromDeepLink"

    .line 16
    .line 17
    const-string v5, "getFromDeepLink()Z"

    .line 18
    .line 19
    invoke-direct {v2, v1, v3, v5, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    new-instance v3, La/j0d0;

    .line 23
    .line 24
    const-string v5, "binding"

    .line 25
    .line 26
    const-string v6, "getBinding()Lorg/xplatform/promotions/news/impl/databinding/FragmentComposeBinding;"

    .line 27
    .line 28
    invoke-direct {v3, v1, v5, v6, v4}, La/j0d0;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

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
    sput-object v1, La/cr50;->S1:[La/iiy;

    .line 43
    .line 44
    new-instance v0, La/evz;

    .line 45
    .line 46
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 47
    .line 48
    .line 49
    sput-object v0, La/cr50;->R1:La/evz;

    .line 50
    .line 51
    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    const v0, 0x7f0d021b

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    const-class v0, La/qr50;

    .line 8
    .line 9
    sget-object v1, La/sre0;->a:La/tre0;

    .line 10
    .line 11
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    new-instance v1, La/ar50;

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    invoke-direct {v1, p0, v2}, La/ar50;-><init>(La/cr50;B)V

    .line 19
    .line 20
    .line 21
    invoke-static {p0, v0, v1}, La/xbc;->b0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    iput-object v0, p0, La/cr50;->L1:La/a8z;

    .line 26
    .line 27
    new-instance v0, La/zz2;

    .line 28
    .line 29
    const-string v1, "ID"

    .line 30
    .line 31
    invoke-direct {v0, v1, v2}, La/zz2;-><init>(Ljava/lang/String;I)V

    .line 32
    .line 33
    .line 34
    iput-object v0, p0, La/cr50;->M1:La/zz2;

    .line 35
    .line 36
    new-instance v0, La/cgx0;

    .line 37
    .line 38
    const-string v1, "FROM_DEEP_LINK"

    .line 39
    .line 40
    invoke-direct {v0, v1, v2}, La/cgx0;-><init>(Ljava/lang/String;Z)V

    .line 41
    .line 42
    .line 43
    iput-object v0, p0, La/cr50;->N1:La/cgx0;

    .line 44
    .line 45
    const/4 v0, 0x1

    .line 46
    iput-boolean v0, p0, La/cr50;->O1:Z

    .line 47
    .line 48
    sget-object v0, La/br50;->a:La/br50;

    .line 49
    .line 50
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    iput-object v0, p0, La/cr50;->P1:La/s0r;

    .line 55
    .line 56
    new-instance v0, La/v62;

    .line 57
    .line 58
    const/16 v1, 0xf

    .line 59
    .line 60
    invoke-direct {v0, p0, v1}, La/v62;-><init>(Ljava/lang/Object;B)V

    .line 61
    .line 62
    .line 63
    iput-object v0, p0, La/cr50;->Q1:La/v62;

    .line 64
    .line 65
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    sget-object p1, La/o7k0;->c:La/n0q;

    .line 2
    .line 3
    sget-object v0, La/cr50;->S1:[La/iiy;

    .line 4
    .line 5
    const/4 v1, 0x2

    .line 6
    aget-object v0, v0, v1

    .line 7
    .line 8
    iget-object v1, p0, La/cr50;->P1:La/s0r;

    .line 9
    .line 10
    invoke-virtual {v1, v0, p0}, La/s0r;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    check-cast v0, La/ezq;

    .line 18
    .line 19
    iget-object v0, v0, La/ezq;->b:Landroidx/compose/ui/platform/ComposeView;

    .line 20
    .line 21
    new-instance v1, La/ba30;

    .line 22
    .line 23
    const/16 v2, 0x18

    .line 24
    .line 25
    invoke-direct {v1, p0, p1, v2}, La/ba30;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 26
    .line 27
    .line 28
    new-instance p0, La/ugd;

    .line 29
    .line 30
    const p1, 0x5f8d1b49

    .line 31
    .line 32
    .line 33
    const/4 v2, 0x1

    .line 34
    invoke-direct {p0, p1, v2, v1}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    invoke-static {v0, p0}, La/b1j;->t(Landroidx/compose/ui/platform/ComposeView;La/ugd;)V

    .line 38
    .line 39
    .line 40
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
    const-class v1, La/xr50;

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
    instance-of v3, v0, La/xr50;

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
    check-cast v2, La/xr50;

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
    sget-object v1, La/cr50;->S1:[La/iiy;

    .line 60
    .line 61
    const/4 v3, 0x0

    .line 62
    aget-object v4, v1, v3

    .line 63
    .line 64
    iget-object v5, p0, La/cr50;->M1:La/zz2;

    .line 65
    .line 66
    invoke-virtual {v5, p0, v4}, La/zz2;->w(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Integer;

    .line 67
    .line 68
    .line 69
    move-result-object v4

    .line 70
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 71
    .line 72
    .line 73
    move-result v4

    .line 74
    const/4 v6, 0x1

    .line 75
    aget-object v6, v1, v6

    .line 76
    .line 77
    iget-object v7, p0, La/cr50;->N1:La/cgx0;

    .line 78
    .line 79
    invoke-virtual {v7, p0, v6}, La/cgx0;->r(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Boolean;

    .line 80
    .line 81
    .line 82
    move-result-object v6

    .line 83
    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    .line 84
    .line 85
    .line 86
    move-result v6

    .line 87
    invoke-virtual {v2, v4, v0, v6}, La/xr50;->a(ILa/i1w0;Z)La/i7i;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    invoke-virtual {v0}, La/i7i;->x()La/fiu0;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    iput-object v0, p0, La/cr50;->K1:La/fiu0;

    .line 96
    .line 97
    aget-object v0, v1, v3

    .line 98
    .line 99
    invoke-virtual {v5, p0, v0, v3}, La/zz2;->I(Landroidx/fragment/app/Fragment;La/iiy;I)V

    .line 100
    .line 101
    .line 102
    return-void

    .line 103
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 104
    .line 105
    invoke-static {v1, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    return-void
.end method

.method public final W(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, La/yx5;->W(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-virtual {p1}, La/agd;->k()La/jg60;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iget-object v0, p0, La/cr50;->Q1:La/v62;

    .line 13
    .line 14
    invoke-virtual {p1, p0, v0}, La/jg60;->a(La/clz;La/eg60;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final x0()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, La/cr50;->O1:Z

    .line 2
    .line 3
    return p0
.end method
