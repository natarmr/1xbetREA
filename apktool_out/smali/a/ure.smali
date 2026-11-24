.class public final La/ure;
.super La/u0i;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/ure;",
        "La/u0i;",
        "<init>",
        "()V",
        "a/usd",
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
.field public static final i2:La/usd;

.field public static final synthetic j2:[La/iiy;


# instance fields
.field public final f2:La/phf0;

.field public final g2:La/yzn0;

.field public final h2:La/yzn0;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/ure;

    .line 4
    .line 5
    const-string v2, "requestKey"

    .line 6
    .line 7
    const-string v3, "getRequestKey()Ljava/lang/String;"

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
    const-string v3, "game"

    .line 16
    .line 17
    const-string v5, "getGame()Lorg/xplatform/betting/core/coupon/models/SingleBetGame;"

    .line 18
    .line 19
    invoke-direct {v2, v1, v3, v5, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    new-instance v3, La/ez40;

    .line 23
    .line 24
    const-string v5, "bet"

    .line 25
    .line 26
    const-string v6, "getBet()Lorg/xplatform/betting/core/coupon/models/SimpleBetZip;"

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
    sput-object v1, La/ure;->j2:[La/iiy;

    .line 43
    .line 44
    new-instance v0, La/usd;

    .line 45
    .line 46
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 47
    .line 48
    .line 49
    sput-object v0, La/ure;->i2:La/usd;

    .line 50
    .line 51
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, La/u0i;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, La/phf0;

    .line 5
    .line 6
    const-string v1, "EXTRA_REQUEST_KEY"

    .line 7
    .line 8
    invoke-direct {v0, v1}, La/phf0;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, La/ure;->f2:La/phf0;

    .line 12
    .line 13
    new-instance v0, La/yzn0;

    .line 14
    .line 15
    const-string v1, "EXTRA_SINGLE_BET_GAME"

    .line 16
    .line 17
    invoke-direct {v0, v1}, La/yzn0;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, La/ure;->g2:La/yzn0;

    .line 21
    .line 22
    new-instance v0, La/yzn0;

    .line 23
    .line 24
    const-string v1, "EXTRA_BET_ZIP"

    .line 25
    .line 26
    invoke-direct {v0, v1}, La/yzn0;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    iput-object v0, p0, La/ure;->h2:La/yzn0;

    .line 30
    .line 31
    return-void
.end method


# virtual methods
.method public final N0()V
    .locals 7

    .line 1
    sget-object v0, La/ure;->j2:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v2, v0, v1

    .line 5
    .line 6
    iget-object v3, p0, La/ure;->f2:La/phf0;

    .line 7
    .line 8
    invoke-virtual {v3, p0, v2}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    aget-object v1, v0, v1

    .line 13
    .line 14
    invoke-virtual {v3, p0, v1}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    new-instance v3, La/nre;

    .line 19
    .line 20
    sget-object v4, La/hwe;->b:La/hwe;

    .line 21
    .line 22
    const/4 v5, 0x2

    .line 23
    aget-object v5, v0, v5

    .line 24
    .line 25
    iget-object v6, p0, La/ure;->h2:La/yzn0;

    .line 26
    .line 27
    invoke-virtual {v6, p0, v5}, La/yzn0;->k(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/io/Serializable;

    .line 28
    .line 29
    .line 30
    move-result-object v5

    .line 31
    check-cast v5, La/zxj0;

    .line 32
    .line 33
    const/4 v6, 0x1

    .line 34
    aget-object v0, v0, v6

    .line 35
    .line 36
    iget-object v6, p0, La/ure;->g2:La/yzn0;

    .line 37
    .line 38
    invoke-virtual {v6, p0, v0}, La/yzn0;->k(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/io/Serializable;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    check-cast v0, La/m0k0;

    .line 43
    .line 44
    invoke-direct {v3, v4, v5, v0}, La/nre;-><init>(La/hwe;La/zxj0;La/m0k0;)V

    .line 45
    .line 46
    .line 47
    new-instance v0, Lkotlin/Pair;

    .line 48
    .line 49
    invoke-direct {v0, v1, v3}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    filled-new-array {v0}, [Lkotlin/Pair;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-static {v0}, La/i120;->V([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-static {v0, p0, v2}, La/vcc;->f0(Landroid/os/Bundle;Landroidx/fragment/app/Fragment;Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p0}, La/sik;->y0()V

    .line 64
    .line 65
    .line 66
    return-void
.end method

.method public final O0()V
    .locals 7

    .line 1
    sget-object v0, La/ure;->j2:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v2, v0, v1

    .line 5
    .line 6
    iget-object v3, p0, La/ure;->f2:La/phf0;

    .line 7
    .line 8
    invoke-virtual {v3, p0, v2}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    aget-object v1, v0, v1

    .line 13
    .line 14
    invoke-virtual {v3, p0, v1}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    new-instance v3, La/nre;

    .line 19
    .line 20
    sget-object v4, La/hwe;->a:La/hwe;

    .line 21
    .line 22
    const/4 v5, 0x2

    .line 23
    aget-object v5, v0, v5

    .line 24
    .line 25
    iget-object v6, p0, La/ure;->h2:La/yzn0;

    .line 26
    .line 27
    invoke-virtual {v6, p0, v5}, La/yzn0;->k(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/io/Serializable;

    .line 28
    .line 29
    .line 30
    move-result-object v5

    .line 31
    check-cast v5, La/zxj0;

    .line 32
    .line 33
    const/4 v6, 0x1

    .line 34
    aget-object v0, v0, v6

    .line 35
    .line 36
    iget-object v6, p0, La/ure;->g2:La/yzn0;

    .line 37
    .line 38
    invoke-virtual {v6, p0, v0}, La/yzn0;->k(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/io/Serializable;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    check-cast v0, La/m0k0;

    .line 43
    .line 44
    invoke-direct {v3, v4, v5, v0}, La/nre;-><init>(La/hwe;La/zxj0;La/m0k0;)V

    .line 45
    .line 46
    .line 47
    new-instance v0, Lkotlin/Pair;

    .line 48
    .line 49
    invoke-direct {v0, v1, v3}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    filled-new-array {v0}, [Lkotlin/Pair;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-static {v0}, La/i120;->V([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-static {v0, p0, v2}, La/vcc;->f0(Landroid/os/Bundle;Landroidx/fragment/app/Fragment;Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p0}, La/sik;->y0()V

    .line 64
    .line 65
    .line 66
    return-void
.end method
