.class public final La/g1d0;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/g1d0;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/xi70",
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
.field public static final N1:La/xi70;

.field public static final synthetic O1:[La/iiy;


# instance fields
.field public K1:La/fiu0;

.field public final L1:La/kiu0;

.field public final M1:La/s0r;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/g1d0;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/prophylaxis/impl/databinding/FragmentProphylaxisBinding;"

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
    sput-object v1, La/g1d0;->O1:[La/iiy;

    .line 19
    .line 20
    new-instance v0, La/xi70;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    sput-object v0, La/g1d0;->N1:La/xi70;

    .line 26
    .line 27
    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    const v0, 0x7f0d02a2

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    new-instance v0, La/ssa0;

    .line 8
    .line 9
    const/16 v1, 0x1d

    .line 10
    .line 11
    invoke-direct {v0, p0, v1}, La/ssa0;-><init>(Ljava/lang/Object;B)V

    .line 12
    .line 13
    .line 14
    new-instance v2, La/g8b0;

    .line 15
    .line 16
    invoke-direct {v2, p0, v1}, La/g8b0;-><init>(Ljava/lang/Object;B)V

    .line 17
    .line 18
    .line 19
    sget-object v1, La/wez;->b:La/wez;

    .line 20
    .line 21
    new-instance v3, La/f1d0;

    .line 22
    .line 23
    const/4 v4, 0x0

    .line 24
    invoke-direct {v3, v2, v4}, La/f1d0;-><init>(Ljava/lang/Object;B)V

    .line 25
    .line 26
    .line 27
    invoke-static {v1, v3}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    const-class v2, La/g2d0;

    .line 32
    .line 33
    sget-object v3, La/sre0;->a:La/tre0;

    .line 34
    .line 35
    invoke-virtual {v3, v2}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    new-instance v3, La/ync0;

    .line 40
    .line 41
    const/4 v4, 0x2

    .line 42
    invoke-direct {v3, v1, v4}, La/ync0;-><init>(La/a8z;B)V

    .line 43
    .line 44
    .line 45
    new-instance v4, La/ync0;

    .line 46
    .line 47
    const/4 v5, 0x3

    .line 48
    invoke-direct {v4, v1, v5}, La/ync0;-><init>(La/a8z;B)V

    .line 49
    .line 50
    .line 51
    invoke-static {p0, v2, v3, v4, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    iput-object v0, p0, La/g1d0;->L1:La/kiu0;

    .line 56
    .line 57
    sget-object v0, La/e1d0;->a:La/e1d0;

    .line 58
    .line 59
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    iput-object v0, p0, La/g1d0;->M1:La/s0r;

    .line 64
    .line 65
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 4

    .line 1
    iget-object p1, p0, La/g1d0;->L1:La/kiu0;

    .line 2
    .line 3
    invoke-virtual {p1}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, La/g2d0;

    .line 8
    .line 9
    iget-object p1, p1, La/g2d0;->f:La/p7m0;

    .line 10
    .line 11
    invoke-static {p1}, La/vtb;->N(La/qz40;)La/xae0;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    new-instance v0, La/s9c0;

    .line 16
    .line 17
    const/4 v1, 0x7

    .line 18
    const/4 v2, 0x0

    .line 19
    invoke-direct {v0, p0, v2, v1}, La/s9c0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 20
    .line 21
    .line 22
    sget-object v1, La/lkz;->a:La/lkz;

    .line 23
    .line 24
    invoke-static {p0}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-interface {p0}, La/clz;->x()La/glz;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-static {v1}, La/x0x;->Q(La/glz;)La/tkz;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    new-instance v3, La/fxc0;

    .line 37
    .line 38
    invoke-direct {v3, p1, p0, v0, v2}, La/fxc0;-><init>(La/xae0;La/clz;La/s9c0;La/yje;)V

    .line 39
    .line 40
    .line 41
    const/4 p0, 0x3

    .line 42
    invoke-static {v1, v2, v2, v3, p0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 43
    .line 44
    .line 45
    return-void
.end method

.method public final C0()V
    .locals 4

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
    const-class v1, La/h1d0;

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
    instance-of v3, v0, La/h1d0;

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
    check-cast v2, La/h1d0;

    .line 52
    .line 53
    if-eqz v2, :cond_3

    .line 54
    .line 55
    iget-object v0, v2, La/h1d0;->a:La/c1d0;

    .line 56
    .line 57
    iget-object v1, v2, La/h1d0;->b:La/m1e;

    .line 58
    .line 59
    iget-object v2, v2, La/h1d0;->c:La/mne;

    .line 60
    .line 61
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    new-instance v3, La/ali;

    .line 68
    .line 69
    invoke-direct {v3, v0, v1, v2}, La/ali;-><init>(La/c1d0;La/m1e;La/mne;)V

    .line 70
    .line 71
    .line 72
    new-instance v0, La/fiu0;

    .line 73
    .line 74
    iget-object v1, v3, La/ali;->d:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v1, La/ppi;

    .line 77
    .line 78
    const-class v2, La/g2d0;

    .line 79
    .line 80
    invoke-static {v2, v1}, La/wcf0;->h(Ljava/lang/Class;Ljava/lang/Object;)La/wcf0;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    invoke-direct {v0, v1}, La/fiu0;-><init>(Ljava/util/Map;)V

    .line 85
    .line 86
    .line 87
    iput-object v0, p0, La/g1d0;->K1:La/fiu0;

    .line 88
    .line 89
    return-void

    .line 90
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 91
    .line 92
    invoke-static {v1, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    return-void
.end method

.method public final e0()V
    .locals 6

    .line 1
    invoke-super {p0}, La/yx5;->e0()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, La/g1d0;->L1:La/kiu0;

    .line 5
    .line 6
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    check-cast p0, La/g2d0;

    .line 11
    .line 12
    iget-object v0, p0, La/g2d0;->e:La/c4m0;

    .line 13
    .line 14
    const/4 v1, 0x1

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {v0}, La/pby;->isActive()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-ne v0, v1, :cond_0

    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    iget-object v0, p0, La/g2d0;->c:La/orc;

    .line 25
    .line 26
    invoke-virtual {v0}, La/orc;->a()La/p7m0;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    new-instance v2, La/o690;

    .line 31
    .line 32
    const/16 v3, 0x1d

    .line 33
    .line 34
    const/4 v4, 0x0

    .line 35
    invoke-direct {v2, p0, v4, v3}, La/o690;-><init>(La/w46;La/yje;B)V

    .line 36
    .line 37
    .line 38
    new-instance v3, La/fnq;

    .line 39
    .line 40
    const/4 v5, 0x4

    .line 41
    invoke-direct {v3, v0, v2, v5}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 42
    .line 43
    .line 44
    new-instance v0, La/pr60;

    .line 45
    .line 46
    const/4 v2, 0x3

    .line 47
    const/16 v5, 0x14

    .line 48
    .line 49
    invoke-direct {v0, v2, v4, v5}, La/pr60;-><init>(ILa/yje;B)V

    .line 50
    .line 51
    .line 52
    new-instance v2, La/dnq;

    .line 53
    .line 54
    invoke-direct {v2, v3, v0, v1}, La/dnq;-><init>(La/gmq;La/xdr;B)V

    .line 55
    .line 56
    .line 57
    iget-object v0, p0, La/g2d0;->d:La/mne;

    .line 58
    .line 59
    iget-object v0, v0, La/mne;->b:La/dvj;

    .line 60
    .line 61
    invoke-static {v2, v0}, La/ulb;->L(La/gmq;Lkotlin/coroutines/CoroutineContext;)La/gmq;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    invoke-static {v0, v1}, La/slb;->U(La/gmq;La/vne;)La/c4m0;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    iput-object v0, p0, La/g2d0;->e:La/c4m0;

    .line 74
    .line 75
    return-void
.end method
