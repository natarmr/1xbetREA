.class public final enum La/k460;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum b:La/k460;

.field public static final enum c:La/k460;

.field public static final synthetic d:[La/k460;

.field public static final synthetic e:La/c0o;


# instance fields
.field public final a:B


# direct methods
.method static constructor <clinit>()V
    .locals 11

    .line 1
    new-instance v0, La/k460;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-wide/16 v2, 0x0

    .line 5
    .line 6
    const-string v4, "EVENTS"

    .line 7
    .line 8
    invoke-direct {v0, v4, v1, v2, v3}, La/k460;-><init>(Ljava/lang/String;IJ)V

    .line 9
    .line 10
    .line 11
    new-instance v1, La/k460;

    .line 12
    .line 13
    const/4 v2, 0x1

    .line 14
    const-wide/16 v3, 0x1

    .line 15
    .line 16
    const-string v5, "TEAMS"

    .line 17
    .line 18
    invoke-direct {v1, v5, v2, v3, v4}, La/k460;-><init>(Ljava/lang/String;IJ)V

    .line 19
    .line 20
    .line 21
    new-instance v2, La/k460;

    .line 22
    .line 23
    const/4 v3, 0x2

    .line 24
    const-wide/16 v4, 0x2

    .line 25
    .line 26
    const-string v6, "CHAMPS"

    .line 27
    .line 28
    invoke-direct {v2, v6, v3, v4, v5}, La/k460;-><init>(Ljava/lang/String;IJ)V

    .line 29
    .line 30
    .line 31
    new-instance v3, La/k460;

    .line 32
    .line 33
    const/4 v4, 0x3

    .line 34
    const-wide/16 v5, 0x3

    .line 35
    .line 36
    const-string v7, "TRACKED"

    .line 37
    .line 38
    invoke-direct {v3, v7, v4, v5, v6}, La/k460;-><init>(Ljava/lang/String;IJ)V

    .line 39
    .line 40
    .line 41
    new-instance v4, La/k460;

    .line 42
    .line 43
    const/4 v5, 0x4

    .line 44
    const-wide/16 v6, 0x4

    .line 45
    .line 46
    const-string v8, "XGAMES"

    .line 47
    .line 48
    invoke-direct {v4, v8, v5, v6, v7}, La/k460;-><init>(Ljava/lang/String;IJ)V

    .line 49
    .line 50
    .line 51
    sput-object v4, La/k460;->b:La/k460;

    .line 52
    .line 53
    new-instance v5, La/k460;

    .line 54
    .line 55
    const/4 v6, 0x5

    .line 56
    const-wide/16 v7, 0x5

    .line 57
    .line 58
    const-string v9, "AGGREGATOR"

    .line 59
    .line 60
    invoke-direct {v5, v9, v6, v7, v8}, La/k460;-><init>(Ljava/lang/String;IJ)V

    .line 61
    .line 62
    .line 63
    sput-object v5, La/k460;->c:La/k460;

    .line 64
    .line 65
    new-instance v6, La/k460;

    .line 66
    .line 67
    const/4 v7, 0x6

    .line 68
    const-wide/16 v8, 0x6

    .line 69
    .line 70
    const-string v10, "VIEWED"

    .line 71
    .line 72
    invoke-direct {v6, v10, v7, v8, v9}, La/k460;-><init>(Ljava/lang/String;IJ)V

    .line 73
    .line 74
    .line 75
    filled-new-array/range {v0 .. v6}, [La/k460;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    sput-object v0, La/k460;->d:[La/k460;

    .line 80
    .line 81
    new-instance v1, La/c0o;

    .line 82
    .line 83
    invoke-direct {v1, v0}, La/c0o;-><init>([Ljava/lang/Enum;)V

    .line 84
    .line 85
    .line 86
    sput-object v1, La/k460;->e:La/c0o;

    .line 87
    .line 88
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;IJ)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    long-to-int p1, p3

    .line 5
    iput-byte p1, p0, La/k460;->a:B

    .line 6
    .line 7
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)La/k460;
    .locals 1

    .line 1
    const-class v0, La/k460;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/k460;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[La/k460;
    .locals 1

    .line 1
    sget-object v0, La/k460;->d:[La/k460;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [La/k460;

    .line 8
    .line 9
    return-object v0
.end method
