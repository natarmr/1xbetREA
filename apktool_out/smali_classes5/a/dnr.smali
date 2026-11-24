.class public final La/dnr;
.super La/yx5;
.source "SourceFile"

# interfaces
.implements La/ers;
.implements La/ocl0;
.implements La/odf0;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u0007B\u0007\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0008"
    }
    d2 = {
        "La/dnr;",
        "La/yx5;",
        "La/ers;",
        "La/ocl0;",
        "La/odf0;",
        "<init>",
        "()V",
        "a/ddk",
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
.field public static final c2:La/ddk;

.field public static final synthetic d2:[La/iiy;


# instance fields
.field public final K1:La/e9o0;

.field public L1:La/mhi;

.field public M1:La/gfk0;

.field public N1:La/xi70;

.field public O1:La/wdk0;

.field public P1:La/ndf0;

.field public Q1:La/nek;

.field public R1:La/xak;

.field public S1:La/zx10;

.field public U1:La/uuz;

.field public V1:La/poq0;

.field public final W1:Z

.field public final X1:La/a8z;

.field public final Y1:La/s0r;

.field public final Z1:La/khf0;

.field public a2:Landroidx/compose/ui/platform/ComposeView;

.field public final b2:La/phf0;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/dnr;

    .line 4
    .line 5
    const-string v2, "viewBinding"

    .line 6
    .line 7
    const-string v3, "getViewBinding()Lorg/xplatform/sportgame/advanced/impl/databinding/FragmentGameAdvancedBinding;"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, La/j0d0;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    new-instance v2, La/ez40;

    .line 14
    .line 15
    const-string v3, "screenParams"

    .line 16
    .line 17
    const-string v5, "getScreenParams()Lorg/xplatform/sportgame/advanced/api/SportGameAdvancedScreenParams;"

    .line 18
    .line 19
    invoke-direct {v2, v1, v3, v5, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    new-instance v3, La/ez40;

    .line 23
    .line 24
    const-string v5, "storedComponentKey"

    .line 25
    .line 26
    const-string v6, "getStoredComponentKey()Ljava/lang/String;"

    .line 27
    .line 28
    invoke-direct {v3, v1, v5, v6, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

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
    sput-object v1, La/dnr;->d2:[La/iiy;

    .line 43
    .line 44
    new-instance v0, La/ddk;

    .line 45
    .line 46
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 47
    .line 48
    .line 49
    sput-object v0, La/dnr;->c2:La/ddk;

    .line 50
    .line 51
    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .line 1
    const v0, 0x7f0d023b

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    new-instance v0, La/e9o0;

    .line 8
    .line 9
    sget-object v1, La/bp3;->a:La/bp3;

    .line 10
    .line 11
    const/16 v1, 0x8

    .line 12
    .line 13
    const v2, 0x7f040b5d

    .line 14
    .line 15
    .line 16
    const v3, 0x7f040ae3

    .line 17
    .line 18
    .line 19
    invoke-direct {v0, v2, v3, v1}, La/e9o0;-><init>(III)V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, La/dnr;->K1:La/e9o0;

    .line 23
    .line 24
    const/4 v0, 0x1

    .line 25
    iput-boolean v0, p0, La/dnr;->W1:Z

    .line 26
    .line 27
    const-class v0, La/spr;

    .line 28
    .line 29
    sget-object v1, La/sre0;->a:La/tre0;

    .line 30
    .line 31
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    new-instance v1, La/ymr;

    .line 36
    .line 37
    const/4 v2, 0x3

    .line 38
    invoke-direct {v1, p0, v2}, La/ymr;-><init>(La/dnr;B)V

    .line 39
    .line 40
    .line 41
    const/16 v2, 0xe

    .line 42
    .line 43
    const/4 v3, 0x0

    .line 44
    invoke-static {p0, v0, v3, v1, v2}, La/xbc;->a0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;I)La/a8z;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    iput-object v0, p0, La/dnr;->X1:La/a8z;

    .line 49
    .line 50
    sget-object v0, La/cnr;->a:La/cnr;

    .line 51
    .line 52
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    iput-object v0, p0, La/dnr;->Y1:La/s0r;

    .line 57
    .line 58
    new-instance v0, La/khf0;

    .line 59
    .line 60
    const-string v1, "GAME_ADVANCED_SCREEN_PARAMS_KEY"

    .line 61
    .line 62
    invoke-direct {v0, v1}, La/khf0;-><init>(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    iput-object v0, p0, La/dnr;->Z1:La/khf0;

    .line 66
    .line 67
    new-instance v0, La/phf0;

    .line 68
    .line 69
    const-string v1, "GAME_ADVANCED_SCREEN_COMPONENT_KEY"

    .line 70
    .line 71
    invoke-direct {v0, v1}, La/phf0;-><init>(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    iput-object v0, p0, La/dnr;->b2:La/phf0;

    .line 75
    .line 76
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 5

    .line 1
    sget-object p1, La/o7k0;->c:La/n0q;

    .line 2
    .line 3
    new-instance v0, La/ymr;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-direct {v0, p0, v1}, La/ymr;-><init>(La/dnr;B)V

    .line 7
    .line 8
    .line 9
    invoke-static {p0, v0}, La/qcc;->X(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function0;)V

    .line 10
    .line 11
    .line 12
    sget-object v0, La/dnr;->d2:[La/iiy;

    .line 13
    .line 14
    aget-object v2, v0, v1

    .line 15
    .line 16
    iget-object v3, p0, La/dnr;->Y1:La/s0r;

    .line 17
    .line 18
    invoke-virtual {v3, v2, p0}, La/s0r;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    check-cast v2, La/b0r;

    .line 26
    .line 27
    iget-object v2, v2, La/b0r;->b:Landroidx/compose/ui/platform/ComposeView;

    .line 28
    .line 29
    iput-object v2, p0, La/dnr;->a2:Landroidx/compose/ui/platform/ComposeView;

    .line 30
    .line 31
    aget-object v0, v0, v1

    .line 32
    .line 33
    invoke-virtual {v3, v0, p0}, La/s0r;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    check-cast v0, La/b0r;

    .line 41
    .line 42
    iget-object v0, v0, La/b0r;->b:Landroidx/compose/ui/platform/ComposeView;

    .line 43
    .line 44
    sget-object v1, La/qek0;->h:La/qek0;

    .line 45
    .line 46
    new-instance v2, La/gup;

    .line 47
    .line 48
    const/16 v3, 0x10

    .line 49
    .line 50
    invoke-direct {v2, p0, p1, v3}, La/gup;-><init>(Ljava/lang/Object;La/mm40;B)V

    .line 51
    .line 52
    .line 53
    new-instance p1, La/ugd;

    .line 54
    .line 55
    const v3, -0x28257ab1

    .line 56
    .line 57
    .line 58
    const/4 v4, 0x1

    .line 59
    invoke-direct {p1, v3, v4, v2}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    const/4 v2, 0x0

    .line 63
    invoke-static {v0, v1, v2, p1}, La/pkd;->h(Landroidx/compose/ui/platform/ComposeView;La/vgu0;La/shd;La/ugd;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0}, La/dnr;->I0()La/k3t0;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    sget-object p1, La/lmr;->a:La/lmr;

    .line 71
    .line 72
    invoke-virtual {p0, p1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    return-void
.end method

.method public final C0()V
    .locals 4

    .line 1
    invoke-virtual {p0}, La/dnr;->H0()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x2

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    sget-object v0, La/j9l0;->a:Ljava/util/LinkedHashMap;

    .line 13
    .line 14
    invoke-virtual {p0}, La/dnr;->G0()Lorg/xplatform/sportgame/advanced/api/SportGameAdvancedScreenParams;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iget-wide v2, v0, Lorg/xplatform/sportgame/advanced/api/SportGameAdvancedScreenParams;->c:J

    .line 19
    .line 20
    invoke-static {p0}, La/efx;->v(Landroidx/fragment/app/Fragment;)La/cb50;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    iget-object v0, v0, La/cb50;->a:Ljava/lang/String;

    .line 28
    .line 29
    invoke-static {v2, v3, v0}, La/dw9;->o(JLjava/lang/String;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    sget-object v2, La/dnr;->d2:[La/iiy;

    .line 34
    .line 35
    aget-object v2, v2, v1

    .line 36
    .line 37
    iget-object v3, p0, La/dnr;->b2:La/phf0;

    .line 38
    .line 39
    invoke-virtual {v3, p0, v2, v0}, La/phf0;->x(Landroidx/fragment/app/Fragment;La/iiy;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    :cond_0
    sget-object v0, La/j9l0;->a:Ljava/util/LinkedHashMap;

    .line 43
    .line 44
    invoke-virtual {p0}, La/dnr;->G0()Lorg/xplatform/sportgame/advanced/api/SportGameAdvancedScreenParams;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-virtual {p0}, La/dnr;->H0()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    new-instance v3, La/ymr;

    .line 53
    .line 54
    invoke-direct {v3, p0, v1}, La/ymr;-><init>(La/dnr;B)V

    .line 55
    .line 56
    .line 57
    invoke-static {v0, v3, p0, v2}, La/j9l0;->a(Lorg/xplatform/sportgame/advanced/api/SportGameAdvancedScreenParams;Lkotlin/jvm/functions/Function0;La/dnr;Ljava/lang/String;)La/nhi;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    iget-object v1, v0, La/nhi;->F:La/n5d0;

    .line 62
    .line 63
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    check-cast v1, La/mhi;

    .line 68
    .line 69
    iput-object v1, p0, La/dnr;->L1:La/mhi;

    .line 70
    .line 71
    iget-object v1, v0, La/nhi;->B:La/gfk0;

    .line 72
    .line 73
    iput-object v1, p0, La/dnr;->M1:La/gfk0;

    .line 74
    .line 75
    iget-object v1, v0, La/nhi;->h:La/rmd0;

    .line 76
    .line 77
    invoke-interface {v1}, La/rmd0;->f()La/xi70;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    iput-object v1, p0, La/dnr;->N1:La/xi70;

    .line 82
    .line 83
    iget-object v1, v0, La/nhi;->C:La/wdk0;

    .line 84
    .line 85
    iput-object v1, p0, La/dnr;->O1:La/wdk0;

    .line 86
    .line 87
    iget-object v1, v0, La/nhi;->D:La/ndf0;

    .line 88
    .line 89
    iput-object v1, p0, La/dnr;->P1:La/ndf0;

    .line 90
    .line 91
    new-instance v1, La/nek;

    .line 92
    .line 93
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 94
    .line 95
    .line 96
    iput-object v1, p0, La/dnr;->Q1:La/nek;

    .line 97
    .line 98
    new-instance v1, La/xak;

    .line 99
    .line 100
    const/16 v2, 0x1a

    .line 101
    .line 102
    invoke-direct {v1, v2}, La/xak;-><init>(B)V

    .line 103
    .line 104
    .line 105
    iput-object v1, p0, La/dnr;->R1:La/xak;

    .line 106
    .line 107
    iget-object v1, v0, La/nhi;->o:La/zx10;

    .line 108
    .line 109
    iput-object v1, p0, La/dnr;->S1:La/zx10;

    .line 110
    .line 111
    iget-object v1, v0, La/nhi;->E:La/uuz;

    .line 112
    .line 113
    iput-object v1, p0, La/dnr;->U1:La/uuz;

    .line 114
    .line 115
    iget-object v0, v0, La/nhi;->r:La/poq0;

    .line 116
    .line 117
    iput-object v0, p0, La/dnr;->V1:La/poq0;

    .line 118
    .line 119
    return-void
.end method

.method public final G0()Lorg/xplatform/sportgame/advanced/api/SportGameAdvancedScreenParams;
    .locals 2

    .line 1
    sget-object v0, La/dnr;->d2:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/dnr;->Z1:La/khf0;

    .line 7
    .line 8
    invoke-virtual {v1, p0, v0}, La/khf0;->w(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, Lorg/xplatform/sportgame/advanced/api/SportGameAdvancedScreenParams;

    .line 13
    .line 14
    return-object p0
.end method

.method public final H0()Ljava/lang/String;
    .locals 2

    .line 1
    sget-object v0, La/dnr;->d2:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/dnr;->b2:La/phf0;

    .line 7
    .line 8
    invoke-virtual {v1, p0, v0}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0
.end method

.method public final I0()La/k3t0;
    .locals 0

    .line 1
    iget-object p0, p0, La/dnr;->X1:La/a8z;

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

.method public final Y()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Landroidx/fragment/app/Fragment;->B:Ljava/lang/String;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const/4 v1, 0x1

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->B()La/kxq;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-ne v0, v1, :cond_1

    .line 25
    .line 26
    :cond_0
    invoke-virtual {p0}, La/dnr;->H0()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-lez v0, :cond_1

    .line 35
    .line 36
    sget-object v0, La/j9l0;->a:Ljava/util/LinkedHashMap;

    .line 37
    .line 38
    invoke-virtual {p0}, La/dnr;->H0()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    sget-object v2, La/j9l0;->a:Ljava/util/LinkedHashMap;

    .line 46
    .line 47
    invoke-interface {v2, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    :cond_1
    iput-boolean v1, p0, Landroidx/fragment/app/Fragment;->j1:Z

    .line 51
    .line 52
    return-void
.end method

.method public final Z()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, La/dnr;->a2:Landroidx/compose/ui/platform/ComposeView;

    .line 3
    .line 4
    invoke-super {p0}, La/yx5;->Z()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final a()J
    .locals 2

    .line 1
    invoke-virtual {p0}, La/dnr;->G0()Lorg/xplatform/sportgame/advanced/api/SportGameAdvancedScreenParams;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-wide v0, p0, Lorg/xplatform/sportgame/advanced/api/SportGameAdvancedScreenParams;->c:J

    .line 6
    .line 7
    return-wide v0
.end method

.method public final b()La/pdf0;
    .locals 0

    .line 1
    iget-object p0, p0, La/dnr;->S1:La/zx10;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    const-string p0, "relatedGamesFeature"

    .line 7
    .line 8
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    throw p0
.end method

.method public final d0()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->q0()Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, La/hxm0;->m(Landroid/view/View;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, La/dnr;->I0()La/k3t0;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    sget-object v1, La/lmr;->f:La/lmr;

    .line 13
    .line 14
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    iput-boolean v0, p0, Landroidx/fragment/app/Fragment;->j1:Z

    .line 19
    .line 20
    return-void
.end method

.method public final e0()V
    .locals 1

    .line 1
    invoke-super {p0}, La/yx5;->e0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->q0()Landroid/view/View;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-static {v0}, La/hxm0;->n(Landroid/view/View;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, La/dnr;->I0()La/k3t0;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    sget-object v0, La/lmr;->e:La/lmr;

    .line 16
    .line 17
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
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
    iget-boolean v0, p0, Landroidx/fragment/app/Fragment;->m:Z

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-object p0, p0, La/dnr;->a2:Landroidx/compose/ui/platform/ComposeView;

    .line 9
    .line 10
    if-eqz p0, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0}, La/x1;->e()V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
.end method

.method public final i0(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-super {p0, p1, p2}, La/yx5;->i0(Landroid/view/View;Landroid/os/Bundle;)V

    .line 5
    .line 6
    .line 7
    iget-object p1, p0, La/dnr;->O1:La/wdk0;

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    iget-boolean p2, p0, La/dnr;->W1:Z

    .line 12
    .line 13
    invoke-static {p1, p0, p2}, La/wdk0;->l(La/wdk0;Landroidx/fragment/app/Fragment;Z)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    const-string p0, "snackbarManager"

    .line 18
    .line 19
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const/4 p0, 0x0

    .line 23
    throw p0
.end method

.method public final u(Lkotlin/jvm/functions/Function0;)La/pcl0;
    .locals 3

    .line 1
    invoke-virtual {p0}, La/dnr;->H0()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    sget-object v0, La/j9l0;->a:Ljava/util/LinkedHashMap;

    .line 12
    .line 13
    invoke-virtual {p0}, La/dnr;->G0()Lorg/xplatform/sportgame/advanced/api/SportGameAdvancedScreenParams;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iget-wide v0, v0, Lorg/xplatform/sportgame/advanced/api/SportGameAdvancedScreenParams;->c:J

    .line 18
    .line 19
    invoke-static {p0}, La/efx;->v(Landroidx/fragment/app/Fragment;)La/cb50;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    iget-object v2, v2, La/cb50;->a:Ljava/lang/String;

    .line 27
    .line 28
    invoke-static {v0, v1, v2}, La/dw9;->o(JLjava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    sget-object v1, La/dnr;->d2:[La/iiy;

    .line 33
    .line 34
    const/4 v2, 0x2

    .line 35
    aget-object v1, v1, v2

    .line 36
    .line 37
    iget-object v2, p0, La/dnr;->b2:La/phf0;

    .line 38
    .line 39
    invoke-virtual {v2, p0, v1, v0}, La/phf0;->x(Landroidx/fragment/app/Fragment;La/iiy;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    :cond_0
    sget-object v0, La/j9l0;->a:Ljava/util/LinkedHashMap;

    .line 43
    .line 44
    invoke-virtual {p0}, La/dnr;->G0()Lorg/xplatform/sportgame/advanced/api/SportGameAdvancedScreenParams;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-virtual {p0}, La/dnr;->H0()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    invoke-static {v0, p1, p0, v1}, La/j9l0;->a(Lorg/xplatform/sportgame/advanced/api/SportGameAdvancedScreenParams;Lkotlin/jvm/functions/Function0;La/dnr;Ljava/lang/String;)La/nhi;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    iget-object p0, p0, La/nhi;->a:La/ugf0;

    .line 57
    .line 58
    return-object p0
.end method

.method public final x0()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, La/dnr;->W1:Z

    .line 2
    .line 3
    return p0
.end method

.method public final z0()La/j9o0;
    .locals 0

    .line 1
    iget-object p0, p0, La/dnr;->K1:La/e9o0;

    .line 2
    .line 3
    return-object p0
.end method
