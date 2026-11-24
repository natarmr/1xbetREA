.class public final enum La/l810;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements La/urz;


# static fields
.field public static final enum b:La/l810;

.field public static final enum c:La/l810;

.field public static final synthetic d:[La/l810;


# instance fields
.field public final a:B


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/l810;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/16 v2, 0xb

    .line 5
    .line 6
    const-string v3, "LOSE_LIMIT_7_DAY"

    .line 7
    .line 8
    invoke-direct {v0, v3, v1, v2}, La/l810;-><init>(Ljava/lang/String;II)V

    .line 9
    .line 10
    .line 11
    sput-object v0, La/l810;->b:La/l810;

    .line 12
    .line 13
    new-instance v1, La/l810;

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    const/16 v3, 0xc

    .line 17
    .line 18
    const-string v4, "LOSE_LIMIT_30_DAY"

    .line 19
    .line 20
    invoke-direct {v1, v4, v2, v3}, La/l810;-><init>(Ljava/lang/String;II)V

    .line 21
    .line 22
    .line 23
    sput-object v1, La/l810;->c:La/l810;

    .line 24
    .line 25
    filled-new-array {v0, v1}, [La/l810;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    sput-object v0, La/l810;->d:[La/l810;

    .line 30
    .line 31
    new-instance v0, La/c0o;

    .line 32
    .line 33
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-byte p3, p0, La/l810;->a:B

    .line 5
    .line 6
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)La/l810;
    .locals 1

    .line 1
    const-class v0, La/l810;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/l810;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[La/l810;
    .locals 1

    .line 1
    sget-object v0, La/l810;->d:[La/l810;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [La/l810;

    .line 8
    .line 9
    return-object v0
.end method
