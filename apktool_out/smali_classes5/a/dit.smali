.class public final La/dit;
.super La/iw5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/dit;",
        "La/iw5;",
        "<init>",
        "()V",
        "a/xak",
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
.field public static final m2:La/xak;

.field public static final synthetic n2:[La/iiy;


# instance fields
.field public final k2:La/phf0;

.field public final l2:La/lhf0;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/dit;

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
    const-string v3, "timeRangeUiModelList"

    .line 16
    .line 17
    const-string v5, "getTimeRangeUiModelList()Ljava/util/List;"

    .line 18
    .line 19
    invoke-direct {v2, v1, v3, v5, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

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
    sput-object v1, La/dit;->n2:[La/iiy;

    .line 31
    .line 32
    new-instance v0, La/xak;

    .line 33
    .line 34
    const/16 v1, 0x1c

    .line 35
    .line 36
    invoke-direct {v0, v1}, La/xak;-><init>(B)V

    .line 37
    .line 38
    .line 39
    sput-object v0, La/dit;->m2:La/xak;

    .line 40
    .line 41
    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, La/iw5;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, La/phf0;

    .line 5
    .line 6
    const-string v1, "EXTRA_REQUEST_KEY_TIME"

    .line 7
    .line 8
    invoke-direct {v0, v1}, La/phf0;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, La/dit;->k2:La/phf0;

    .line 12
    .line 13
    new-instance v0, La/lhf0;

    .line 14
    .line 15
    const-string v1, "EXTRA_REQUEST_TIME_RANGE"

    .line 16
    .line 17
    const/4 v2, 0x7

    .line 18
    invoke-direct {v0, v1, v2}, La/lhf0;-><init>(Ljava/lang/String;B)V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, La/dit;->l2:La/lhf0;

    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public final J0(La/fet;)La/bw5;
    .locals 8

    .line 1
    const v0, -0x46efe627

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1, v0}, La/fet;->e0(I)V

    .line 5
    .line 6
    .line 7
    sget-object v0, La/dit;->n2:[La/iiy;

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    aget-object v0, v0, v1

    .line 11
    .line 12
    iget-object v2, p0, La/dit;->l2:La/lhf0;

    .line 13
    .line 14
    invoke-virtual {v2, p0, v0}, La/lhf0;->p(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/util/List;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    sub-int/2addr v0, v1

    .line 23
    new-instance v2, La/bw5;

    .line 24
    .line 25
    invoke-static {v1, p1}, La/iw5;->O0(ILa/fet;)La/cw5;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    sget-object v4, La/gq80;->b:La/ugd;

    .line 30
    .line 31
    new-instance v1, La/z30;

    .line 32
    .line 33
    const/4 v5, 0x2

    .line 34
    invoke-direct {v1, p0, v0, v5}, La/z30;-><init>(Ljava/lang/Object;IB)V

    .line 35
    .line 36
    .line 37
    const p0, -0x40dafb76

    .line 38
    .line 39
    .line 40
    invoke-static {p0, v1, p1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 41
    .line 42
    .line 43
    move-result-object v6

    .line 44
    const/16 v7, 0xa

    .line 45
    .line 46
    const/4 v5, 0x0

    .line 47
    invoke-direct/range {v2 .. v7}, La/bw5;-><init>(La/cw5;La/xdr;La/ugd;La/ugd;I)V

    .line 48
    .line 49
    .line 50
    const/4 p0, 0x0

    .line 51
    invoke-virtual {p1, p0}, La/fet;->r(Z)V

    .line 52
    .line 53
    .line 54
    return-object v2
.end method

.method public final P0(I)V
    .locals 4

    .line 1
    sget-object v0, La/dit;->n2:[La/iiy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v2, v0, v1

    .line 5
    .line 6
    iget-object v3, p0, La/dit;->k2:La/phf0;

    .line 7
    .line 8
    invoke-virtual {v3, p0, v2}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-lez v2, :cond_0

    .line 17
    .line 18
    aget-object v2, v0, v1

    .line 19
    .line 20
    invoke-virtual {v3, p0, v2}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    aget-object v0, v0, v1

    .line 25
    .line 26
    invoke-virtual {v3, p0, v0}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    new-instance v1, Lkotlin/Pair;

    .line 35
    .line 36
    invoke-direct {v1, v0, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    filled-new-array {v1}, [Lkotlin/Pair;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-static {p1}, La/i120;->V([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-static {p1, p0, v2}, La/vcc;->f0(Landroid/os/Bundle;Landroidx/fragment/app/Fragment;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    :cond_0
    invoke-virtual {p0}, La/yo8;->y0()V

    .line 51
    .line 52
    .line 53
    return-void
.end method
