.class public final enum La/s9b0;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements La/sgf0;


# static fields
.field public static final enum b:La/s9b0;

.field public static final enum c:La/s9b0;

.field public static final enum d:La/s9b0;

.field public static final enum e:La/s9b0;

.field public static final enum f:La/s9b0;

.field public static final enum g:La/s9b0;

.field public static final enum h:La/s9b0;

.field public static final enum i:La/s9b0;

.field public static final synthetic j:[La/s9b0;


# instance fields
.field public final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 11

    .line 1
    new-instance v0, La/s9b0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "live"

    .line 5
    .line 6
    const-string v3, "LIVE_GAMES"

    .line 7
    .line 8
    invoke-direct {v0, v3, v1, v2}, La/s9b0;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sput-object v0, La/s9b0;->b:La/s9b0;

    .line 12
    .line 13
    new-instance v1, La/s9b0;

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    const-string v3, "line"

    .line 17
    .line 18
    const-string v4, "LINE_GAMES"

    .line 19
    .line 20
    invoke-direct {v1, v4, v2, v3}, La/s9b0;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 21
    .line 22
    .line 23
    sput-object v1, La/s9b0;->c:La/s9b0;

    .line 24
    .line 25
    new-instance v2, La/s9b0;

    .line 26
    .line 27
    const/4 v3, 0x2

    .line 28
    const-string v4, "cyber"

    .line 29
    .line 30
    const-string v5, "CYBER"

    .line 31
    .line 32
    invoke-direct {v2, v5, v3, v4}, La/s9b0;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 33
    .line 34
    .line 35
    sput-object v2, La/s9b0;->d:La/s9b0;

    .line 36
    .line 37
    new-instance v3, La/s9b0;

    .line 38
    .line 39
    const/4 v4, 0x3

    .line 40
    const-string v5, "xgames"

    .line 41
    .line 42
    const-string v6, "ONE_X_GAMES"

    .line 43
    .line 44
    invoke-direct {v3, v6, v4, v5}, La/s9b0;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 45
    .line 46
    .line 47
    sput-object v3, La/s9b0;->e:La/s9b0;

    .line 48
    .line 49
    new-instance v4, La/s9b0;

    .line 50
    .line 51
    const/4 v5, 0x4

    .line 52
    const-string v6, "casino"

    .line 53
    .line 54
    const-string v7, "AGGREGATOR"

    .line 55
    .line 56
    invoke-direct {v4, v7, v5, v6}, La/s9b0;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 57
    .line 58
    .line 59
    sput-object v4, La/s9b0;->f:La/s9b0;

    .line 60
    .line 61
    new-instance v5, La/s9b0;

    .line 62
    .line 63
    const/4 v6, 0x5

    .line 64
    const-string v7, "express"

    .line 65
    .line 66
    const-string v8, "DAY_EXPRESS"

    .line 67
    .line 68
    invoke-direct {v5, v8, v6, v7}, La/s9b0;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 69
    .line 70
    .line 71
    sput-object v5, La/s9b0;->g:La/s9b0;

    .line 72
    .line 73
    new-instance v6, La/s9b0;

    .line 74
    .line 75
    const/4 v7, 0x6

    .line 76
    const-string v8, "live_champs"

    .line 77
    .line 78
    const-string v9, "LIVE_CHAMPS"

    .line 79
    .line 80
    invoke-direct {v6, v9, v7, v8}, La/s9b0;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 81
    .line 82
    .line 83
    sput-object v6, La/s9b0;->h:La/s9b0;

    .line 84
    .line 85
    new-instance v7, La/s9b0;

    .line 86
    .line 87
    const/4 v8, 0x7

    .line 88
    const-string v9, "line_champs"

    .line 89
    .line 90
    const-string v10, "LINE_CHAMPS"

    .line 91
    .line 92
    invoke-direct {v7, v10, v8, v9}, La/s9b0;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 93
    .line 94
    .line 95
    sput-object v7, La/s9b0;->i:La/s9b0;

    .line 96
    .line 97
    filled-new-array/range {v0 .. v7}, [La/s9b0;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    sput-object v0, La/s9b0;->j:[La/s9b0;

    .line 102
    .line 103
    new-instance v0, La/c0o;

    .line 104
    .line 105
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, La/s9b0;->a:Ljava/lang/String;

    .line 5
    .line 6
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)La/s9b0;
    .locals 1

    .line 1
    const-class v0, La/s9b0;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/s9b0;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[La/s9b0;
    .locals 1

    .line 1
    sget-object v0, La/s9b0;->j:[La/s9b0;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [La/s9b0;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 0

    .line 1
    const-string p0, "popularCategories"

    .line 2
    .line 3
    return-object p0
.end method

.method public final getValue()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, La/s9b0;->a:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method
