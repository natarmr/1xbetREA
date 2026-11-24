.class public final La/qv10;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0001\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0006"
    }
    d2 = {
        "La/qv10;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/nv10",
        "a/htz",
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
.field public static final O1:La/htz;

.field public static final synthetic P1:[La/iiy;


# instance fields
.field public final K1:La/cgx0;

.field public L1:La/m9i;

.field public final M1:La/kiu0;

.field public final N1:La/s0r;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/qv10;

    .line 4
    .line 5
    const-string v2, "onlyArchive"

    .line 6
    .line 7
    const-string v3, "getOnlyArchive()Z"

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
    sput-object v1, La/qv10;->P1:[La/iiy;

    .line 31
    .line 32
    new-instance v0, La/htz;

    .line 33
    .line 34
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 35
    .line 36
    .line 37
    sput-object v0, La/qv10;->O1:La/htz;

    .line 38
    .line 39
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
    new-instance v0, La/cgx0;

    .line 8
    .line 9
    const-string v1, "BUNDLE_ARCHIVE"

    .line 10
    .line 11
    invoke-direct {v0, v1}, La/cgx0;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, La/qv10;->K1:La/cgx0;

    .line 15
    .line 16
    new-instance v0, La/mv10;

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    invoke-direct {v0, p0, v1}, La/mv10;-><init>(La/qv10;B)V

    .line 20
    .line 21
    .line 22
    new-instance v2, La/be00;

    .line 23
    .line 24
    const/16 v3, 0x1d

    .line 25
    .line 26
    invoke-direct {v2, p0, v3}, La/be00;-><init>(Ljava/lang/Object;B)V

    .line 27
    .line 28
    .line 29
    sget-object v3, La/wez;->b:La/wez;

    .line 30
    .line 31
    new-instance v4, La/pv10;

    .line 32
    .line 33
    invoke-direct {v4, v2, v1}, La/pv10;-><init>(Ljava/lang/Object;B)V

    .line 34
    .line 35
    .line 36
    invoke-static {v3, v4}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    const-class v2, La/rv10;

    .line 41
    .line 42
    sget-object v3, La/sre0;->a:La/tre0;

    .line 43
    .line 44
    invoke-virtual {v3, v2}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    new-instance v3, La/j210;

    .line 49
    .line 50
    const/16 v4, 0x14

    .line 51
    .line 52
    invoke-direct {v3, v1, v4}, La/j210;-><init>(La/a8z;B)V

    .line 53
    .line 54
    .line 55
    new-instance v4, La/j210;

    .line 56
    .line 57
    const/16 v5, 0x15

    .line 58
    .line 59
    invoke-direct {v4, v1, v5}, La/j210;-><init>(La/a8z;B)V

    .line 60
    .line 61
    .line 62
    invoke-static {p0, v2, v3, v4, v0}, La/agc;->G(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)La/kiu0;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    iput-object v0, p0, La/qv10;->M1:La/kiu0;

    .line 67
    .line 68
    sget-object v0, La/ov10;->a:La/ov10;

    .line 69
    .line 70
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    iput-object v0, p0, La/qv10;->N1:La/s0r;

    .line 75
    .line 76
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 4

    .line 1
    new-instance p1, La/nv10;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->K()La/n6r;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v1}, La/n6r;->b()V

    .line 15
    .line 16
    .line 17
    iget-object v1, v1, La/n6r;->c:La/glz;

    .line 18
    .line 19
    sget-object v2, La/l4b;->i:La/c0o;

    .line 20
    .line 21
    invoke-direct {p1, p0, v0, v1, v2}, La/nv10;-><init>(La/qv10;Landroidx/fragment/app/e;La/glz;La/c0o;)V

    .line 22
    .line 23
    .line 24
    sget-object v0, La/qv10;->P1:[La/iiy;

    .line 25
    .line 26
    const/4 v1, 0x1

    .line 27
    aget-object v0, v0, v1

    .line 28
    .line 29
    iget-object v2, p0, La/qv10;->N1:La/s0r;

    .line 30
    .line 31
    invoke-virtual {v2, v0, p0}, La/s0r;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    check-cast v0, La/aid;

    .line 39
    .line 40
    iget-object v0, v0, La/aid;->a:Landroidx/compose/ui/platform/ComposeView;

    .line 41
    .line 42
    new-instance v2, La/k110;

    .line 43
    .line 44
    const/16 v3, 0xa

    .line 45
    .line 46
    invoke-direct {v2, p1, p0, v3}, La/k110;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 47
    .line 48
    .line 49
    new-instance p0, La/ugd;

    .line 50
    .line 51
    const p1, -0x95b5b3a

    .line 52
    .line 53
    .line 54
    invoke-direct {p0, p1, v1, v2}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    invoke-static {v0, p0}, La/b1j;->t(Landroidx/compose/ui/platform/ComposeView;La/ugd;)V

    .line 58
    .line 59
    .line 60
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
    const/4 v1, 0x0

    .line 55
    const/16 v3, 0xf

    .line 56
    .line 57
    invoke-static {v0, v2, v1, v2, v3}, La/ti5;->a(La/ti5;La/l4b;ZLjava/lang/String;I)La/n9i;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    iget-object v0, v0, La/n9i;->K:La/n5d0;

    .line 62
    .line 63
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    check-cast v0, La/m9i;

    .line 68
    .line 69
    iput-object v0, p0, La/qv10;->L1:La/m9i;

    .line 70
    .line 71
    return-void

    .line 72
    :cond_3
    const-string p0, "Cannot create dependency "

    .line 73
    .line 74
    invoke-static {v1, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    return-void
.end method
