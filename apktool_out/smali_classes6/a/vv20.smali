.class public final La/vv20;
.super La/iw5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/vv20;",
        "La/iw5;",
        "<init>",
        "()V",
        "a/xuz",
        "core"
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
.field public static final m2:La/xuz;

.field public static final synthetic n2:[La/iiy;


# instance fields
.field public final k2:La/phf0;

.field public final l2:La/phf0;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/vv20;

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
    const-string v3, "description"

    .line 16
    .line 17
    const-string v5, "getDescription()Ljava/lang/String;"

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
    sput-object v1, La/vv20;->n2:[La/iiy;

    .line 31
    .line 32
    new-instance v0, La/xuz;

    .line 33
    .line 34
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 35
    .line 36
    .line 37
    sput-object v0, La/vv20;->m2:La/xuz;

    .line 38
    .line 39
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
    iput-object v0, p0, La/vv20;->k2:La/phf0;

    .line 12
    .line 13
    new-instance v0, La/phf0;

    .line 14
    .line 15
    const-string v1, "DESCRIPTION"

    .line 16
    .line 17
    invoke-direct {v0, v1}, La/phf0;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, La/vv20;->l2:La/phf0;

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public final J0(La/fet;)La/bw5;
    .locals 7

    .line 1
    const v0, -0x3984dcdf

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
    new-instance v0, La/p0z;

    .line 15
    .line 16
    const/16 v3, 0xb

    .line 17
    .line 18
    invoke-direct {v0, p0, v3}, La/p0z;-><init>(Ljava/lang/Object;B)V

    .line 19
    .line 20
    .line 21
    const p0, -0x7fe230ae

    .line 22
    .line 23
    .line 24
    invoke-static {p0, v0, p1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 25
    .line 26
    .line 27
    move-result-object v5

    .line 28
    const/16 v6, 0xe

    .line 29
    .line 30
    const/4 v3, 0x0

    .line 31
    const/4 v4, 0x0

    .line 32
    invoke-direct/range {v1 .. v6}, La/bw5;-><init>(La/cw5;La/xdr;La/ugd;La/ugd;I)V

    .line 33
    .line 34
    .line 35
    const/4 p0, 0x0

    .line 36
    invoke-virtual {p1, p0}, La/fet;->r(Z)V

    .line 37
    .line 38
    .line 39
    return-object v1
.end method
