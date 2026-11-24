.class public final enum La/cnz;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum b:La/cnz;

.field public static final synthetic c:[La/cnz;


# instance fields
.field public final a:B


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/cnz;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x3

    .line 5
    const-string v3, "DEPOSIT_LIMITS"

    .line 6
    .line 7
    invoke-direct {v0, v3, v1, v2}, La/cnz;-><init>(Ljava/lang/String;II)V

    .line 8
    .line 9
    .line 10
    sput-object v0, La/cnz;->b:La/cnz;

    .line 11
    .line 12
    new-instance v1, La/cnz;

    .line 13
    .line 14
    const/4 v2, 0x1

    .line 15
    const/4 v3, 0x4

    .line 16
    const-string v4, "SESSION_TIME_LIMITS"

    .line 17
    .line 18
    invoke-direct {v1, v4, v2, v3}, La/cnz;-><init>(Ljava/lang/String;II)V

    .line 19
    .line 20
    .line 21
    new-instance v2, La/cnz;

    .line 22
    .line 23
    const/4 v3, 0x2

    .line 24
    const/4 v4, 0x5

    .line 25
    const-string v5, "REALITY_CHECK_LIMITS"

    .line 26
    .line 27
    invoke-direct {v2, v5, v3, v4}, La/cnz;-><init>(Ljava/lang/String;II)V

    .line 28
    .line 29
    .line 30
    filled-new-array {v0, v1, v2}, [La/cnz;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    sput-object v0, La/cnz;->c:[La/cnz;

    .line 35
    .line 36
    new-instance v0, La/c0o;

    .line 37
    .line 38
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-byte p3, p0, La/cnz;->a:B

    .line 5
    .line 6
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)La/cnz;
    .locals 1

    .line 1
    const-class v0, La/cnz;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/cnz;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[La/cnz;
    .locals 1

    .line 1
    sget-object v0, La/cnz;->c:[La/cnz;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [La/cnz;

    .line 8
    .line 9
    return-object v0
.end method
