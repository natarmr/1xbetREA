.class public final La/cko0;
.super La/iw5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/cko0;",
        "La/iw5;",
        "<init>",
        "()V",
        "a/m6m0",
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
.field public static final m2:La/m6m0;

.field public static final synthetic n2:[La/iiy;


# instance fields
.field public final k2:La/phf0;

.field public final l2:La/es;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/cko0;

    .line 4
    .line 5
    const-string v2, "title"

    .line 6
    .line 7
    const-string v3, "getTitle()Ljava/lang/String;"

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
    const-string v3, "items"

    .line 16
    .line 17
    const-string v5, "getItems()Ljava/util/List;"

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
    sput-object v1, La/cko0;->n2:[La/iiy;

    .line 31
    .line 32
    new-instance v0, La/m6m0;

    .line 33
    .line 34
    const/16 v1, 0xb

    .line 35
    .line 36
    invoke-direct {v0, v1}, La/m6m0;-><init>(B)V

    .line 37
    .line 38
    .line 39
    sput-object v0, La/cko0;->m2:La/m6m0;

    .line 40
    .line 41
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, La/iw5;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, La/phf0;

    .line 5
    .line 6
    const-string v1, "TITLE"

    .line 7
    .line 8
    invoke-direct {v0, v1}, La/phf0;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, La/cko0;->k2:La/phf0;

    .line 12
    .line 13
    new-instance v0, La/es;

    .line 14
    .line 15
    const-string v1, "ITEMS"

    .line 16
    .line 17
    invoke-direct {v0, v1}, La/es;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, La/cko0;->l2:La/es;

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public final J0(La/fet;)La/bw5;
    .locals 8

    .line 1
    const v0, -0x17a069a7

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
    new-instance v3, La/bko0;

    .line 15
    .line 16
    const/4 v7, 0x0

    .line 17
    invoke-direct {v3, p0, v7}, La/bko0;-><init>(La/cko0;B)V

    .line 18
    .line 19
    .line 20
    const v4, -0x131e99f6

    .line 21
    .line 22
    .line 23
    invoke-static {v4, v3, p1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    new-instance v4, La/bko0;

    .line 28
    .line 29
    invoke-direct {v4, p0, v0}, La/bko0;-><init>(La/cko0;B)V

    .line 30
    .line 31
    .line 32
    const p0, -0x46da1f38

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
