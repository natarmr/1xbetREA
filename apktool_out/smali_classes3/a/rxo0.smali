.class public final La/rxo0;
.super La/nw5;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "La/nw5<",
        "La/ojk;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0006"
    }
    d2 = {
        "La/rxo0;",
        "La/nw5;",
        "La/ojk;",
        "<init>",
        "()V",
        "a/y2m0",
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
.field public static final j2:La/y2m0;

.field public static final synthetic k2:[La/iiy;


# instance fields
.field public final e2:La/nae0;

.field public final f2:La/phf0;

.field public final g2:La/zz2;

.field public final h2:La/zz2;

.field public final i2:La/zz2;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/rxo0;

    .line 4
    .line 5
    const-string v2, "binding"

    .line 6
    .line 7
    const-string v3, "getBinding()Lorg/xplatform/bet_constructor/impl/databinding/DialogTeamActionBinding;"

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
    const-string v3, "requestKey"

    .line 16
    .line 17
    const-string v5, "getRequestKey()Ljava/lang/String;"

    .line 18
    .line 19
    invoke-direct {v2, v1, v3, v5, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    new-instance v3, La/ez40;

    .line 23
    .line 24
    const-string v5, "currentTeam"

    .line 25
    .line 26
    const-string v6, "getCurrentTeam()I"

    .line 27
    .line 28
    invoke-direct {v3, v1, v5, v6, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 29
    .line 30
    .line 31
    new-instance v5, La/ez40;

    .line 32
    .line 33
    const-string v6, "gameId"

    .line 34
    .line 35
    const-string v7, "getGameId()I"

    .line 36
    .line 37
    invoke-direct {v5, v1, v6, v7, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 38
    .line 39
    .line 40
    new-instance v6, La/ez40;

    .line 41
    .line 42
    const-string v7, "playerId"

    .line 43
    .line 44
    const-string v8, "getPlayerId()I"

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
    sput-object v1, La/rxo0;->k2:[La/iiy;

    .line 67
    .line 68
    new-instance v0, La/y2m0;

    .line 69
    .line 70
    const/16 v1, 0xd

    .line 71
    .line 72
    invoke-direct {v0, v1}, La/y2m0;-><init>(B)V

    .line 73
    .line 74
    .line 75
    sput-object v0, La/rxo0;->j2:La/y2m0;

    .line 76
    .line 77
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, La/nw5;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, La/qxo0;->a:La/qxo0;

    .line 5
    .line 6
    invoke-static {p0, v0}, La/ltt0;->p(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;)La/nae0;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iput-object v0, p0, La/rxo0;->e2:La/nae0;

    .line 11
    .line 12
    new-instance v0, La/phf0;

    .line 13
    .line 14
    const-string v1, "EXTRA_REQUEST_KEY"

    .line 15
    .line 16
    invoke-direct {v0, v1}, La/phf0;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, La/rxo0;->f2:La/phf0;

    .line 20
    .line 21
    new-instance v0, La/zz2;

    .line 22
    .line 23
    const-string v1, "EXTRA_CURRENT_TEAM"

    .line 24
    .line 25
    invoke-direct {v0, v1}, La/zz2;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    iput-object v0, p0, La/rxo0;->g2:La/zz2;

    .line 29
    .line 30
    new-instance v0, La/zz2;

    .line 31
    .line 32
    const-string v1, "EXTRA_GAME_ID"

    .line 33
    .line 34
    invoke-direct {v0, v1}, La/zz2;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    iput-object v0, p0, La/rxo0;->h2:La/zz2;

    .line 38
    .line 39
    new-instance v0, La/zz2;

    .line 40
    .line 41
    const-string v1, "EXTRA_PLAYER_ID"

    .line 42
    .line 43
    invoke-direct {v0, v1}, La/zz2;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    iput-object v0, p0, La/rxo0;->i2:La/zz2;

    .line 47
    .line 48
    return-void
.end method


# virtual methods
.method public final I0()I
    .locals 0

    .line 1
    const p0, 0x7f040ae3

    .line 2
    .line 3
    .line 4
    return p0
.end method

.method public final L0()La/yfu0;
    .locals 2

    .line 1
    sget-object v0, La/rxo0;->k2:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, La/rxo0;->e2:La/nae0;

    .line 7
    .line 8
    invoke-interface {v1, v0, p0}, La/nae0;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    check-cast p0, La/ojk;

    .line 16
    .line 17
    return-object p0
.end method

.method public final O0()V
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    sget-object v1, La/rxo0;->k2:[La/iiy;

    .line 3
    .line 4
    aget-object v0, v1, v0

    .line 5
    .line 6
    iget-object v2, p0, La/rxo0;->e2:La/nae0;

    .line 7
    .line 8
    invoke-interface {v2, v0, p0}, La/nae0;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    check-cast v0, La/ojk;

    .line 16
    .line 17
    const/4 v2, 0x2

    .line 18
    aget-object v1, v1, v2

    .line 19
    .line 20
    iget-object v3, p0, La/rxo0;->g2:La/zz2;

    .line 21
    .line 22
    invoke-virtual {v3, p0, v1}, La/zz2;->w(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Integer;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    sget-object v3, La/bop0;->b:La/m6m0;

    .line 31
    .line 32
    const/4 v3, 0x1

    .line 33
    if-ne v1, v3, :cond_0

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    move v2, v3

    .line 37
    :goto_0
    iget-object v1, v0, La/ojk;->e:Landroid/widget/TextView;

    .line 38
    .line 39
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    const v4, 0x7f130d52

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0, v4, v3}, Landroidx/fragment/app/Fragment;->I(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 55
    .line 56
    .line 57
    iget-object v1, v0, La/ojk;->c:Landroidx/appcompat/widget/LinearLayoutCompat;

    .line 58
    .line 59
    new-instance v3, La/z08;

    .line 60
    .line 61
    const/16 v4, 0x15

    .line 62
    .line 63
    invoke-direct {v3, p0, v2, v4}, La/z08;-><init>(Ljava/lang/Object;IB)V

    .line 64
    .line 65
    .line 66
    invoke-static {v1, v3}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 67
    .line 68
    .line 69
    iget-object v0, v0, La/ojk;->b:Landroidx/appcompat/widget/LinearLayoutCompat;

    .line 70
    .line 71
    new-instance v1, La/ttn0;

    .line 72
    .line 73
    const/16 v2, 0xf

    .line 74
    .line 75
    invoke-direct {v1, p0, v2}, La/ttn0;-><init>(Ljava/lang/Object;B)V

    .line 76
    .line 77
    .line 78
    invoke-static {v0, v1}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 79
    .line 80
    .line 81
    return-void
.end method

.method public final Q0()I
    .locals 0

    .line 1
    const p0, 0x7f0a0c40

    .line 2
    .line 3
    .line 4
    return p0
.end method

.method public final S0()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->G()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const v0, 0x7f131226

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    return-object p0
.end method

.method public final T0(I)V
    .locals 5

    .line 1
    const/4 v0, 0x1

    .line 2
    sget-object v1, La/rxo0;->k2:[La/iiy;

    .line 3
    .line 4
    aget-object v0, v1, v0

    .line 5
    .line 6
    iget-object v2, p0, La/rxo0;->f2:La/phf0;

    .line 7
    .line 8
    invoke-virtual {v2, p0, v0}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    new-instance v2, La/ojp0;

    .line 13
    .line 14
    const/4 v3, 0x3

    .line 15
    aget-object v3, v1, v3

    .line 16
    .line 17
    iget-object v4, p0, La/rxo0;->h2:La/zz2;

    .line 18
    .line 19
    invoke-virtual {v4, p0, v3}, La/zz2;->w(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Integer;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    const/4 v4, 0x4

    .line 28
    aget-object v1, v1, v4

    .line 29
    .line 30
    iget-object v4, p0, La/rxo0;->i2:La/zz2;

    .line 31
    .line 32
    invoke-virtual {v4, p0, v1}, La/zz2;->w(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Integer;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    invoke-direct {v2, v3, v1, p1}, La/ojp0;-><init>(III)V

    .line 41
    .line 42
    .line 43
    new-instance p1, Lkotlin/Pair;

    .line 44
    .line 45
    const-string v1, "RESULT_ON_ITEM_ACTION_LISTENER_KEY"

    .line 46
    .line 47
    invoke-direct {p1, v1, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    filled-new-array {p1}, [Lkotlin/Pair;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    invoke-static {p1}, La/i120;->V([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    invoke-static {p1, p0, v0}, La/vcc;->f0(Landroid/os/Bundle;Landroidx/fragment/app/Fragment;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p0}, La/yo8;->x0()V

    .line 62
    .line 63
    .line 64
    return-void
.end method
