.class public final enum La/rss;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum c:La/rss;

.field public static final enum d:La/rss;

.field public static final enum e:La/rss;

.field public static final enum f:La/rss;

.field public static final synthetic g:[La/rss;


# instance fields
.field public final a:I

.field public final b:I


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 1
    new-instance v0, La/rss;

    .line 2
    .line 3
    const v1, 0x7f131091

    .line 4
    .line 5
    .line 6
    const v2, 0x7f0606b0

    .line 7
    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    const-string v4, "MATCH_NOT_STARTED"

    .line 11
    .line 12
    invoke-direct {v0, v3, v1, v2, v4}, La/rss;-><init>(IIILjava/lang/String;)V

    .line 13
    .line 14
    .line 15
    sput-object v0, La/rss;->c:La/rss;

    .line 16
    .line 17
    new-instance v1, La/rss;

    .line 18
    .line 19
    const v2, 0x7f13136d

    .line 20
    .line 21
    .line 22
    const v3, 0x7f0606c1

    .line 23
    .line 24
    .line 25
    const/4 v4, 0x1

    .line 26
    const-string v5, "WIN"

    .line 27
    .line 28
    invoke-direct {v1, v4, v2, v3, v5}, La/rss;-><init>(IIILjava/lang/String;)V

    .line 29
    .line 30
    .line 31
    sput-object v1, La/rss;->d:La/rss;

    .line 32
    .line 33
    new-instance v2, La/rss;

    .line 34
    .line 35
    const v3, 0x7f13136b

    .line 36
    .line 37
    .line 38
    const v4, 0x7f0606e5

    .line 39
    .line 40
    .line 41
    const/4 v5, 0x2

    .line 42
    const-string v6, "DRAW"

    .line 43
    .line 44
    invoke-direct {v2, v5, v3, v4, v6}, La/rss;-><init>(IIILjava/lang/String;)V

    .line 45
    .line 46
    .line 47
    sput-object v2, La/rss;->e:La/rss;

    .line 48
    .line 49
    new-instance v3, La/rss;

    .line 50
    .line 51
    const v4, 0x7f13136c

    .line 52
    .line 53
    .line 54
    const v5, 0x7f0606d0

    .line 55
    .line 56
    .line 57
    const/4 v6, 0x3

    .line 58
    const-string v7, "LOSS"

    .line 59
    .line 60
    invoke-direct {v3, v6, v4, v5, v7}, La/rss;-><init>(IIILjava/lang/String;)V

    .line 61
    .line 62
    .line 63
    sput-object v3, La/rss;->f:La/rss;

    .line 64
    .line 65
    filled-new-array {v0, v1, v2, v3}, [La/rss;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    sput-object v0, La/rss;->g:[La/rss;

    .line 70
    .line 71
    new-instance v0, La/c0o;

    .line 72
    .line 73
    return-void
.end method

.method public constructor <init>(IIILjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p4, p1}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput p2, p0, La/rss;->a:I

    .line 5
    .line 6
    iput p3, p0, La/rss;->b:I

    .line 7
    .line 8
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)La/rss;
    .locals 1

    .line 1
    const-class v0, La/rss;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/rss;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[La/rss;
    .locals 1

    .line 1
    sget-object v0, La/rss;->g:[La/rss;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [La/rss;

    .line 8
    .line 9
    return-object v0
.end method
