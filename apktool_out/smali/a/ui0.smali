.class public final enum La/ui0;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final synthetic b:[La/ui0;

.field public static final synthetic c:La/c0o;


# instance fields
.field public final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 14

    .line 1
    new-instance v0, La/ui0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "daily_tasks"

    .line 5
    .line 6
    const-string v3, "DAILY_TASK_WIDGET"

    .line 7
    .line 8
    invoke-direct {v0, v3, v1, v2}, La/ui0;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v1, La/ui0;

    .line 12
    .line 13
    const/4 v2, 0x1

    .line 14
    const-string v3, "recommended"

    .line 15
    .line 16
    const-string v4, "RECOMMENDED_CAROUSEL"

    .line 17
    .line 18
    invoke-direct {v1, v4, v2, v3}, La/ui0;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 19
    .line 20
    .line 21
    new-instance v2, La/ui0;

    .line 22
    .line 23
    const/4 v3, 0x2

    .line 24
    const-string v4, "favorites"

    .line 25
    .line 26
    const-string v5, "FAVORITES_CAROUSEL"

    .line 27
    .line 28
    invoke-direct {v2, v5, v3, v4}, La/ui0;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 29
    .line 30
    .line 31
    new-instance v3, La/ui0;

    .line 32
    .line 33
    const/4 v4, 0x3

    .line 34
    const-string v5, "viewed"

    .line 35
    .line 36
    const-string v6, "VIEWED_CAROUSEL"

    .line 37
    .line 38
    invoke-direct {v3, v6, v4, v5}, La/ui0;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 39
    .line 40
    .line 41
    new-instance v4, La/ui0;

    .line 42
    .line 43
    const/4 v5, 0x4

    .line 44
    const-string v6, "slots_popular"

    .line 45
    .line 46
    const-string v7, "SLOTS_POPULAR_CAROUSEL"

    .line 47
    .line 48
    invoke-direct {v4, v7, v5, v6}, La/ui0;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 49
    .line 50
    .line 51
    new-instance v5, La/ui0;

    .line 52
    .line 53
    const/4 v6, 0x5

    .line 54
    const-string v7, "live_popular"

    .line 55
    .line 56
    const-string v8, "LIVE_POPULAR_CAROUSEL"

    .line 57
    .line 58
    invoke-direct {v5, v8, v6, v7}, La/ui0;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 59
    .line 60
    .line 61
    new-instance v6, La/ui0;

    .line 62
    .line 63
    const/4 v7, 0x6

    .line 64
    const-string v8, "crash_popular"

    .line 65
    .line 66
    const-string v9, "CRASH_POPULAR_CAROUSEL"

    .line 67
    .line 68
    invoke-direct {v6, v9, v7, v8}, La/ui0;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 69
    .line 70
    .line 71
    new-instance v7, La/ui0;

    .line 72
    .line 73
    const/4 v8, 0x7

    .line 74
    const-string v9, "top_games"

    .line 75
    .line 76
    const-string v10, "TOP_GAMES_CAROUSEL"

    .line 77
    .line 78
    invoke-direct {v7, v10, v8, v9}, La/ui0;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 79
    .line 80
    .line 81
    new-instance v8, La/ui0;

    .line 82
    .line 83
    const/16 v9, 0x8

    .line 84
    .line 85
    const-string v10, "promotions"

    .line 86
    .line 87
    const-string v11, "PROMOTIONS_CAROUSEL"

    .line 88
    .line 89
    invoke-direct {v8, v11, v9, v10}, La/ui0;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 90
    .line 91
    .line 92
    new-instance v9, La/ui0;

    .line 93
    .line 94
    const/16 v10, 0x9

    .line 95
    .line 96
    const-string v11, "tournament_month"

    .line 97
    .line 98
    const-string v12, "TOURNAMENTS_MONTH_CAROUSEL"

    .line 99
    .line 100
    invoke-direct {v9, v12, v10, v11}, La/ui0;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 101
    .line 102
    .line 103
    new-instance v10, La/ui0;

    .line 104
    .line 105
    const/16 v11, 0xa

    .line 106
    .line 107
    const-string v12, "user_tournaments"

    .line 108
    .line 109
    const-string v13, "USER_TOURNAMENTS_CAROUSEL"

    .line 110
    .line 111
    invoke-direct {v10, v13, v11, v12}, La/ui0;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 112
    .line 113
    .line 114
    filled-new-array/range {v0 .. v10}, [La/ui0;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    sput-object v0, La/ui0;->b:[La/ui0;

    .line 119
    .line 120
    new-instance v1, La/c0o;

    .line 121
    .line 122
    invoke-direct {v1, v0}, La/c0o;-><init>([Ljava/lang/Enum;)V

    .line 123
    .line 124
    .line 125
    sput-object v1, La/ui0;->c:La/c0o;

    .line 126
    .line 127
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, La/ui0;->a:Ljava/lang/String;

    .line 5
    .line 6
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)La/ui0;
    .locals 1

    .line 1
    const-class v0, La/ui0;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/ui0;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[La/ui0;
    .locals 1

    .line 1
    sget-object v0, La/ui0;->b:[La/ui0;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [La/ui0;

    .line 8
    .line 9
    return-object v0
.end method
