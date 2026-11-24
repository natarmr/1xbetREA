.class public final enum La/ozc;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum b:La/ozc;

.field public static final enum c:La/ozc;

.field public static final enum d:La/ozc;

.field public static final synthetic e:[La/ozc;

.field public static final synthetic f:La/c0o;


# instance fields
.field public final a:B


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/ozc;

    .line 2
    .line 3
    const-string v1, "MAX_PAYOUT"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2, v2}, La/ozc;-><init>(Ljava/lang/String;II)V

    .line 7
    .line 8
    .line 9
    sput-object v0, La/ozc;->b:La/ozc;

    .line 10
    .line 11
    new-instance v1, La/ozc;

    .line 12
    .line 13
    const-string v2, "MIN_PAYOUT"

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    invoke-direct {v1, v2, v3, v3}, La/ozc;-><init>(Ljava/lang/String;II)V

    .line 17
    .line 18
    .line 19
    sput-object v1, La/ozc;->c:La/ozc;

    .line 20
    .line 21
    new-instance v2, La/ozc;

    .line 22
    .line 23
    const-string v3, "POSSIBLE_PAYOUT"

    .line 24
    .line 25
    const/4 v4, 0x2

    .line 26
    invoke-direct {v2, v3, v4, v4}, La/ozc;-><init>(Ljava/lang/String;II)V

    .line 27
    .line 28
    .line 29
    sput-object v2, La/ozc;->d:La/ozc;

    .line 30
    .line 31
    filled-new-array {v0, v1, v2}, [La/ozc;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    sput-object v0, La/ozc;->e:[La/ozc;

    .line 36
    .line 37
    new-instance v1, La/c0o;

    .line 38
    .line 39
    invoke-direct {v1, v0}, La/c0o;-><init>([Ljava/lang/Enum;)V

    .line 40
    .line 41
    .line 42
    sput-object v1, La/ozc;->f:La/c0o;

    .line 43
    .line 44
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-byte p3, p0, La/ozc;->a:B

    .line 5
    .line 6
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)La/ozc;
    .locals 1

    .line 1
    const-class v0, La/ozc;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/ozc;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[La/ozc;
    .locals 1

    .line 1
    sget-object v0, La/ozc;->e:[La/ozc;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [La/ozc;

    .line 8
    .line 9
    return-object v0
.end method
