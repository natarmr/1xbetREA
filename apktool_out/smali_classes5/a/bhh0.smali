.class public final enum La/bhh0;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum a:La/bhh0;

.field public static final enum b:La/bhh0;

.field public static final enum c:La/bhh0;

.field public static final synthetic d:[La/bhh0;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 1
    new-instance v0, La/bhh0;

    .line 2
    .line 3
    const-string v1, "SPORT"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, La/bhh0;->a:La/bhh0;

    .line 10
    .line 11
    new-instance v1, La/bhh0;

    .line 12
    .line 13
    const-string v2, "ONE_X_GAMES"

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    new-instance v2, La/bhh0;

    .line 20
    .line 21
    const-string v3, "AGGREGATOR_GAMES"

    .line 22
    .line 23
    const/4 v4, 0x2

    .line 24
    invoke-direct {v2, v3, v4}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 25
    .line 26
    .line 27
    new-instance v3, La/bhh0;

    .line 28
    .line 29
    const-string v4, "COUPON_SEARCH"

    .line 30
    .line 31
    const/4 v5, 0x3

    .line 32
    invoke-direct {v3, v4, v5}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 33
    .line 34
    .line 35
    sput-object v3, La/bhh0;->b:La/bhh0;

    .line 36
    .line 37
    new-instance v4, La/bhh0;

    .line 38
    .line 39
    const-string v5, "FAVORITES_TEAM"

    .line 40
    .line 41
    const/4 v6, 0x4

    .line 42
    invoke-direct {v4, v5, v6}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 43
    .line 44
    .line 45
    sput-object v4, La/bhh0;->c:La/bhh0;

    .line 46
    .line 47
    new-instance v5, La/bhh0;

    .line 48
    .line 49
    const-string v6, "AGGREGATOR_BRANDS"

    .line 50
    .line 51
    const/4 v7, 0x5

    .line 52
    invoke-direct {v5, v6, v7}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 53
    .line 54
    .line 55
    filled-new-array/range {v0 .. v5}, [La/bhh0;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    sput-object v0, La/bhh0;->d:[La/bhh0;

    .line 60
    .line 61
    new-instance v0, La/c0o;

    .line 62
    .line 63
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)La/bhh0;
    .locals 1

    .line 1
    const-class v0, La/bhh0;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/bhh0;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[La/bhh0;
    .locals 1

    .line 1
    sget-object v0, La/bhh0;->d:[La/bhh0;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [La/bhh0;

    .line 8
    .line 9
    return-object v0
.end method
