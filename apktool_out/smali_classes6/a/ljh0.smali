.class public final La/ljh0;
.super La/iw5;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "La/ljh0;",
        "La/iw5;",
        "<init>",
        "()V",
        "a/lme0",
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
.field public static final m2:La/lme0;

.field public static final synthetic n2:[La/iiy;


# instance fields
.field public final k2:La/es;

.field public final l2:La/phf0;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/ez40;

    .line 2
    .line 3
    const-class v1, La/ljh0;

    .line 4
    .line 5
    const-string v2, "items"

    .line 6
    .line 7
    const-string v3, "getItems()Ljava/util/List;"

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
    sput-object v1, La/ljh0;->n2:[La/iiy;

    .line 31
    .line 32
    new-instance v0, La/lme0;

    .line 33
    .line 34
    const/16 v1, 0xe

    .line 35
    .line 36
    invoke-direct {v0, v1}, La/lme0;-><init>(B)V

    .line 37
    .line 38
    .line 39
    sput-object v0, La/ljh0;->m2:La/lme0;

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
    new-instance v0, La/es;

    .line 5
    .line 6
    const-string v1, "ITEMS"

    .line 7
    .line 8
    invoke-direct {v0, v1}, La/es;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, La/ljh0;->k2:La/es;

    .line 12
    .line 13
    new-instance v0, La/phf0;

    .line 14
    .line 15
    const-string v1, "REQUEST_KEY"

    .line 16
    .line 17
    invoke-direct {v0, v1}, La/phf0;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, La/ljh0;->l2:La/phf0;

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public final J0(La/fet;)La/bw5;
    .locals 8

    .line 1
    const v0, 0x4f52f344

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1, v0}, La/fet;->e0(I)V

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x3

    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-static {v1, v1, p1, v1, v0}, La/ddz;->a(IILa/fet;II)La/xcz;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-static {v0, p1}, La/a8k0;->G(La/bch0;La/fet;)La/ak50;

    .line 14
    .line 15
    .line 16
    new-instance v2, La/bw5;

    .line 17
    .line 18
    const/4 v0, 0x1

    .line 19
    invoke-static {v0, p1}, La/iw5;->O0(ILa/fet;)La/cw5;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    new-instance v4, La/ijh0;

    .line 24
    .line 25
    invoke-direct {v4, p0, v1}, La/ijh0;-><init>(La/ljh0;B)V

    .line 26
    .line 27
    .line 28
    const v5, 0x5a9403f5

    .line 29
    .line 30
    .line 31
    invoke-static {v5, v4, p1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    new-instance v5, La/ijh0;

    .line 36
    .line 37
    invoke-direct {v5, p0, v0}, La/ijh0;-><init>(La/ljh0;B)V

    .line 38
    .line 39
    .line 40
    const p0, -0x1c59e34d

    .line 41
    .line 42
    .line 43
    invoke-static {p0, v5, p1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 44
    .line 45
    .line 46
    move-result-object v6

    .line 47
    const/16 v7, 0xa

    .line 48
    .line 49
    const/4 v5, 0x0

    .line 50
    invoke-direct/range {v2 .. v7}, La/bw5;-><init>(La/cw5;La/xdr;La/ugd;La/ugd;I)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p1, v1}, La/fet;->r(Z)V

    .line 54
    .line 55
    .line 56
    return-object v2
.end method
