.class public final La/q0w;
.super La/iw5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/q0w;",
        "La/iw5;",
        "<init>",
        "()V",
        "a/tqt",
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
.field public static final m2:La/tqt;

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
    const-class v1, La/q0w;

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
    const-string v3, "historyDateFilterTypeUiModelList"

    .line 16
    .line 17
    const-string v5, "getHistoryDateFilterTypeUiModelList()Ljava/util/List;"

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
    sput-object v1, La/q0w;->n2:[La/iiy;

    .line 31
    .line 32
    new-instance v0, La/tqt;

    .line 33
    .line 34
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 35
    .line 36
    .line 37
    sput-object v0, La/q0w;->m2:La/tqt;

    .line 38
    .line 39
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
    const-string v1, "REQUEST_KEY"

    .line 7
    .line 8
    invoke-direct {v0, v1}, La/phf0;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, La/q0w;->k2:La/phf0;

    .line 12
    .line 13
    new-instance v0, La/lhf0;

    .line 14
    .line 15
    const-string v1, "HISTORY_DATE_FILTER_LIST_KEY"

    .line 16
    .line 17
    const/4 v2, 0x7

    .line 18
    invoke-direct {v0, v1, v2}, La/lhf0;-><init>(Ljava/lang/String;B)V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, La/q0w;->l2:La/lhf0;

    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public final J0(La/fet;)La/bw5;
    .locals 7

    .line 1
    const v0, -0x7d88f4e3

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1, v0}, La/fet;->e0(I)V

    .line 5
    .line 6
    .line 7
    new-instance v1, La/bw5;

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    invoke-static {v0, p1}, La/iw5;->O0(ILa/fet;)La/cw5;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    sget-object v3, La/xia0;->c:La/ugd;

    .line 15
    .line 16
    new-instance v0, La/elm;

    .line 17
    .line 18
    const/16 v4, 0x11

    .line 19
    .line 20
    invoke-direct {v0, p0, v4}, La/elm;-><init>(Ljava/lang/Object;B)V

    .line 21
    .line 22
    .line 23
    const p0, -0x6f44e734

    .line 24
    .line 25
    .line 26
    invoke-static {p0, v0, p1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 27
    .line 28
    .line 29
    move-result-object v5

    .line 30
    const/16 v6, 0xa

    .line 31
    .line 32
    const/4 v4, 0x0

    .line 33
    invoke-direct/range {v1 .. v6}, La/bw5;-><init>(La/cw5;La/xdr;La/ugd;La/ugd;I)V

    .line 34
    .line 35
    .line 36
    const/4 p0, 0x0

    .line 37
    invoke-virtual {p1, p0}, La/fet;->r(Z)V

    .line 38
    .line 39
    .line 40
    return-object v1
.end method

.method public final P0(Lorg/xplatform/bet_history/history/presentation/dialog/history_data_filter/model/HistoryDateFilterTypeModel;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->R()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    sget-object v0, La/q0w;->n2:[La/iiy;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    aget-object v0, v0, v1

    .line 12
    .line 13
    iget-object v1, p0, La/q0w;->k2:La/phf0;

    .line 14
    .line 15
    invoke-virtual {v1, p0, v0}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    new-instance v1, Lkotlin/Pair;

    .line 20
    .line 21
    const-string v2, "HISTORY_DATE_FILTER_REQUEST"

    .line 22
    .line 23
    invoke-direct {v1, v2, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    filled-new-array {v1}, [Lkotlin/Pair;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-static {p1}, La/i120;->V([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-static {p1, p0, v0}, La/vcc;->f0(Landroid/os/Bundle;Landroidx/fragment/app/Fragment;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, La/yo8;->y0()V

    .line 38
    .line 39
    .line 40
    return-void
.end method
