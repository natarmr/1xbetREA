.class public final La/omn;
.super La/iw5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/omn;",
        "La/iw5;",
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
.field public static final p2:La/ddk;

.field public static final synthetic q2:[La/iiy;


# instance fields
.field public final k2:La/es;

.field public final l2:La/phf0;

.field public final m2:La/phf0;

.field public final n2:La/phf0;

.field public final o2:La/zz2;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/omn;

    .line 4
    .line 5
    const-string v2, "optionItemsList"

    .line 6
    .line 7
    const-string v3, "getOptionItemsList()Ljava/util/List;"

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
    const-string v5, "requestKey"

    .line 25
    .line 26
    const-string v6, "getRequestKey()Ljava/lang/String;"

    .line 27
    .line 28
    invoke-direct {v3, v1, v5, v6, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 29
    .line 30
    .line 31
    new-instance v5, La/ez40;

    .line 32
    .line 33
    const-string v6, "selectedPositionResultKey"

    .line 34
    .line 35
    const-string v7, "getSelectedPositionResultKey()Ljava/lang/String;"

    .line 36
    .line 37
    invoke-direct {v5, v1, v6, v7, v4}, La/ez40;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 38
    .line 39
    .line 40
    new-instance v6, La/ez40;

    .line 41
    .line 42
    const-string v7, "initialSelectedPosition"

    .line 43
    .line 44
    const-string v8, "getInitialSelectedPosition()I"

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
    sput-object v1, La/omn;->q2:[La/iiy;

    .line 67
    .line 68
    new-instance v0, La/ddk;

    .line 69
    .line 70
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 71
    .line 72
    .line 73
    sput-object v0, La/omn;->p2:La/ddk;

    .line 74
    .line 75
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, La/iw5;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, La/es;

    .line 5
    .line 6
    const-string v1, "OPTION_ITEMS_LIST_KEY"

    .line 7
    .line 8
    invoke-direct {v0, v1}, La/es;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, La/omn;->k2:La/es;

    .line 12
    .line 13
    new-instance v0, La/phf0;

    .line 14
    .line 15
    const-string v1, "TITLE_KEY"

    .line 16
    .line 17
    invoke-direct {v0, v1}, La/phf0;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, La/omn;->l2:La/phf0;

    .line 21
    .line 22
    new-instance v0, La/phf0;

    .line 23
    .line 24
    const-string v1, "REQUEST_KEY"

    .line 25
    .line 26
    invoke-direct {v0, v1}, La/phf0;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    iput-object v0, p0, La/omn;->m2:La/phf0;

    .line 30
    .line 31
    new-instance v0, La/phf0;

    .line 32
    .line 33
    const-string v1, "SELECTED_POSITION_VALUE_KEY"

    .line 34
    .line 35
    invoke-direct {v0, v1}, La/phf0;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    iput-object v0, p0, La/omn;->n2:La/phf0;

    .line 39
    .line 40
    new-instance v0, La/zz2;

    .line 41
    .line 42
    const-string v1, "INITIAL_SELECTED_POSITION_VALUE_KEY"

    .line 43
    .line 44
    invoke-direct {v0, v1}, La/zz2;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    iput-object v0, p0, La/omn;->o2:La/zz2;

    .line 48
    .line 49
    return-void
.end method


# virtual methods
.method public final J0(La/fet;)La/bw5;
    .locals 8

    .line 1
    const v0, -0x60baa37a

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
    new-instance v3, La/nmn;

    .line 15
    .line 16
    const/4 v7, 0x0

    .line 17
    invoke-direct {v3, p0, v7}, La/nmn;-><init>(La/omn;B)V

    .line 18
    .line 19
    .line 20
    const v4, 0x24606535

    .line 21
    .line 22
    .line 23
    invoke-static {v4, v3, p1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    new-instance v4, La/nmn;

    .line 28
    .line 29
    invoke-direct {v4, p0, v0}, La/nmn;-><init>(La/omn;B)V

    .line 30
    .line 31
    .line 32
    const p0, -0x2c1d3a49

    .line 33
    .line 34
    .line 35
    invoke-static {p0, v4, p1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 36
    .line 37
    .line 38
    move-result-object v5

    .line 39
    const/16 v6, 0xa

    .line 40
    .line 41
    const/4 v4, 0x0

    .line 42
    invoke-direct/range {v1 .. v6}, La/bw5;-><init>(La/cw5;La/xdr;La/ugd;La/ugd;I)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1, v7}, La/fet;->r(Z)V

    .line 46
    .line 47
    .line 48
    return-object v1
.end method
