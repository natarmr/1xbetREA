.class public final enum La/frj;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final b:La/kud;

.field public static final enum c:La/frj;

.field public static final synthetic d:[La/frj;

.field public static final synthetic e:La/c0o;


# instance fields
.field public final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 12

    .line 1
    new-instance v0, La/frj;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "1xgames"

    .line 5
    .line 6
    const-string v3, "OneXGames"

    .line 7
    .line 8
    invoke-direct {v0, v3, v1, v2}, La/frj;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v1, La/frj;

    .line 12
    .line 13
    const/4 v2, 0x1

    .line 14
    const-string v3, "casino"

    .line 15
    .line 16
    const-string v4, "Casino"

    .line 17
    .line 18
    invoke-direct {v1, v4, v2, v3}, La/frj;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 19
    .line 20
    .line 21
    new-instance v2, La/frj;

    .line 22
    .line 23
    const/4 v3, 0x2

    .line 24
    const-string v4, "team"

    .line 25
    .line 26
    const-string v5, "Team"

    .line 27
    .line 28
    invoke-direct {v2, v5, v3, v4}, La/frj;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 29
    .line 30
    .line 31
    new-instance v3, La/frj;

    .line 32
    .line 33
    const/4 v4, 0x3

    .line 34
    const-string v5, "champion"

    .line 35
    .line 36
    const-string v6, "Champion"

    .line 37
    .line 38
    invoke-direct {v3, v6, v4, v5}, La/frj;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 39
    .line 40
    .line 41
    new-instance v4, La/frj;

    .line 42
    .line 43
    const/4 v5, 0x4

    .line 44
    const-string v6, "games"

    .line 45
    .line 46
    const-string v7, "Games"

    .line 47
    .line 48
    invoke-direct {v4, v7, v5, v6}, La/frj;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 49
    .line 50
    .line 51
    new-instance v5, La/frj;

    .line 52
    .line 53
    const/4 v6, 0x5

    .line 54
    const-string v7, "other"

    .line 55
    .line 56
    const-string v8, "Other"

    .line 57
    .line 58
    invoke-direct {v5, v8, v6, v7}, La/frj;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 59
    .line 60
    .line 61
    new-instance v6, La/frj;

    .line 62
    .line 63
    const/4 v7, 0x6

    .line 64
    const-string v8, "tracking"

    .line 65
    .line 66
    const-string v9, "Tracking"

    .line 67
    .line 68
    invoke-direct {v6, v9, v7, v8}, La/frj;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 69
    .line 70
    .line 71
    new-instance v7, La/frj;

    .line 72
    .line 73
    const/4 v8, 0x7

    .line 74
    const-string v9, "viewed"

    .line 75
    .line 76
    const-string v10, "Viewed"

    .line 77
    .line 78
    invoke-direct {v7, v10, v8, v9}, La/frj;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 79
    .line 80
    .line 81
    new-instance v8, La/frj;

    .line 82
    .line 83
    const/16 v9, 0x8

    .line 84
    .line 85
    const-string v10, ""

    .line 86
    .line 87
    const-string v11, "Unknown"

    .line 88
    .line 89
    invoke-direct {v8, v11, v9, v10}, La/frj;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 90
    .line 91
    .line 92
    sput-object v8, La/frj;->c:La/frj;

    .line 93
    .line 94
    filled-new-array/range {v0 .. v8}, [La/frj;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    sput-object v0, La/frj;->d:[La/frj;

    .line 99
    .line 100
    new-instance v1, La/c0o;

    .line 101
    .line 102
    invoke-direct {v1, v0}, La/c0o;-><init>([Ljava/lang/Enum;)V

    .line 103
    .line 104
    .line 105
    sput-object v1, La/frj;->e:La/c0o;

    .line 106
    .line 107
    new-instance v0, La/kud;

    .line 108
    .line 109
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 110
    .line 111
    .line 112
    sput-object v0, La/frj;->b:La/kud;

    .line 113
    .line 114
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, La/frj;->a:Ljava/lang/String;

    .line 5
    .line 6
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)La/frj;
    .locals 1

    .line 1
    const-class v0, La/frj;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/frj;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[La/frj;
    .locals 1

    .line 1
    sget-object v0, La/frj;->d:[La/frj;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [La/frj;

    .line 8
    .line 9
    return-object v0
.end method
