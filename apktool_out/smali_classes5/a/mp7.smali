.class public final La/mp7;
.super La/yx5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/mp7;",
        "La/yx5;",
        "<init>",
        "()V",
        "a/bj5",
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
.field public static final S1:La/bj5;

.field public static final synthetic U1:[La/iiy;


# instance fields
.field public final K1:La/s0r;

.field public final L1:La/n0o0;

.field public final M1:La/a8z;

.field public final N1:La/phf0;

.field public final O1:La/phf0;

.field public final P1:La/zz2;

.field public final Q1:La/phf0;

.field public final R1:Z


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/mp7;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/promotions/news/impl/databinding/FragmentBetWithoutRiskBinding;"

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
    const-string v3, "title"

    .line 16
    .line 17
    const-string v5, "getTitle()Ljava/lang/String;"

    .line 18
    .line 19
    invoke-direct {v2, v1, v3, v5, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    new-instance v3, La/ez40;

    .line 23
    .line 24
    const-string v5, "bannerId"

    .line 25
    .line 26
    const-string v6, "getBannerId()Ljava/lang/String;"

    .line 27
    .line 28
    invoke-direct {v3, v1, v5, v6, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 29
    .line 30
    .line 31
    new-instance v5, La/ez40;

    .line 32
    .line 33
    const-string v6, "lotteryId"

    .line 34
    .line 35
    const-string v7, "getLotteryId()I"

    .line 36
    .line 37
    invoke-direct {v5, v1, v6, v7, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 38
    .line 39
    .line 40
    new-instance v6, La/ez40;

    .line 41
    .line 42
    const-string v7, "imgUrl"

    .line 43
    .line 44
    const-string v8, "getImgUrl()Ljava/lang/String;"

    .line 45
    .line 46
    invoke-direct {v6, v1, v7, v8, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 47
    .line 48
    .line 49
    const/4 v1, 0x5

    .line 50
    new-array v1, v1, [La/iiy;

    .line 51
    .line 52
    aput-object v0, v1, v4

    .line 53
    .line 54
    const/4 v0, 0x1

    .line 55
    aput-object v2, v1, v0

    .line 56
    .line 57
    const/4 v0, 0x2

    .line 58
    aput-object v3, v1, v0

    .line 59
    .line 60
    const/4 v0, 0x3

    .line 61
    aput-object v5, v1, v0

    .line 62
    .line 63
    const/4 v0, 0x4

    .line 64
    aput-object v6, v1, v0

    .line 65
    .line 66
    sput-object v1, La/mp7;->U1:[La/iiy;

    .line 67
    .line 68
    new-instance v0, La/bj5;

    .line 69
    .line 70
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 71
    .line 72
    .line 73
    sput-object v0, La/mp7;->S1:La/bj5;

    .line 74
    .line 75
    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    const v0, 0x7f0d0201

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, La/yx5;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sget-object v0, La/lp7;->a:La/lp7;

    .line 8
    .line 9
    invoke-static {p0, v0}, La/ltt0;->o(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/s0r;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, La/mp7;->K1:La/s0r;

    .line 14
    .line 15
    new-instance v0, La/kp7;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    invoke-direct {v0, p0, v1}, La/kp7;-><init>(La/mp7;B)V

    .line 19
    .line 20
    .line 21
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    iput-object v0, p0, La/mp7;->L1:La/n0o0;

    .line 26
    .line 27
    const-class v0, La/hq7;

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
    new-instance v1, La/kp7;

    .line 36
    .line 37
    const/4 v2, 0x1

    .line 38
    invoke-direct {v1, p0, v2}, La/kp7;-><init>(La/mp7;B)V

    .line 39
    .line 40
    .line 41
    invoke-static {p0, v0, v1}, La/xbc;->b0(Landroidx/fragment/app/Fragment;La/sgy;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    iput-object v0, p0, La/mp7;->M1:La/a8z;

    .line 46
    .line 47
    new-instance v0, La/phf0;

    .line 48
    .line 49
    const-string v1, "BANNER_TITLE_EXTRA"

    .line 50
    .line 51
    invoke-direct {v0, v1}, La/phf0;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    iput-object v0, p0, La/mp7;->N1:La/phf0;

    .line 55
    .line 56
    new-instance v0, La/phf0;

    .line 57
    .line 58
    const-string v1, "BANNER_ID_EXTRA"

    .line 59
    .line 60
    invoke-direct {v0, v1}, La/phf0;-><init>(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    iput-object v0, p0, La/mp7;->O1:La/phf0;

    .line 64
    .line 65
    new-instance v0, La/zz2;

    .line 66
    .line 67
    const-string v1, "LOTTERY_ID_EXTRA"

    .line 68
    .line 69
    invoke-direct {v0, v1}, La/zz2;-><init>(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    iput-object v0, p0, La/mp7;->P1:La/zz2;

    .line 73
    .line 74
    new-instance v0, La/phf0;

    .line 75
    .line 76
    const-string v1, "IMG_URL_EXTRA"

    .line 77
    .line 78
    invoke-direct {v0, v1}, La/phf0;-><init>(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    iput-object v0, p0, La/mp7;->Q1:La/phf0;

    .line 82
    .line 83
    iput-boolean v2, p0, La/mp7;->R1:Z

    .line 84
    .line 85
    return-void
.end method


# virtual methods
.method public final B0(Landroid/os/Bundle;)V
    .locals 4

    .line 1
    sget-object p1, La/mp7;->U1:[La/iiy;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    aget-object p1, p1, v0

    .line 5
    .line 6
    iget-object v0, p0, La/mp7;->K1:La/s0r;

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
    check-cast p1, La/myq;

    .line 16
    .line 17
    iget-object p1, p1, La/myq;->b:Landroidx/compose/ui/platform/ComposeView;

    .line 18
    .line 19
    new-instance v0, La/owp0;

    .line 20
    .line 21
    invoke-direct {v0, p0}, La/owp0;-><init>(La/clz;)V

    .line 22
    .line 23
    .line 24
    new-instance v1, La/m87;

    .line 25
    .line 26
    const/4 v2, 0x5

    .line 27
    invoke-direct {v1, p0, v2}, La/m87;-><init>(Ljava/lang/Object;B)V

    .line 28
    .line 29
    .line 30
    new-instance p0, La/ugd;

    .line 31
    .line 32
    const v2, -0x568b0c4

    .line 33
    .line 34
    .line 35
    const/4 v3, 0x1

    .line 36
    invoke-direct {p0, v2, v3, v1}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    invoke-static {p1, v0, p0}, La/h97;->t(Landroidx/compose/ui/platform/ComposeView;La/owp0;La/ugd;)V

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method public final C0()V
    .locals 0

    .line 1
    iget-object p0, p0, La/mp7;->L1:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/bai;

    .line 8
    .line 9
    iget-object p0, p0, La/bai;->a:La/wdk0;

    .line 10
    .line 11
    return-void
.end method

.method public final G0()La/k3t0;
    .locals 0

    .line 1
    iget-object p0, p0, La/mp7;->M1:La/a8z;

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
    iget-boolean p0, p0, La/mp7;->R1:Z

    .line 2
    .line 3
    return p0
.end method
