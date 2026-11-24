.class public final enum La/zrs;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum b:La/zrs;

.field public static final enum c:La/zrs;

.field public static final enum d:La/zrs;

.field public static final enum e:La/zrs;

.field public static final synthetic f:[La/zrs;

.field public static final synthetic g:La/c0o;


# instance fields
.field public final a:La/t9m0;


# direct methods
.method static constructor <clinit>()V
    .locals 12

    .line 1
    new-instance v0, La/zrs;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    sget-object v2, La/t9m0;->S1:La/t9m0;

    .line 5
    .line 6
    const-string v3, "TEAMS_RED_BLUE_SIDE_TABLET"

    .line 7
    .line 8
    invoke-direct {v0, v3, v1, v2}, La/zrs;-><init>(Ljava/lang/String;ILa/t9m0;)V

    .line 9
    .line 10
    .line 11
    sput-object v0, La/zrs;->b:La/zrs;

    .line 12
    .line 13
    new-instance v1, La/zrs;

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    sget-object v3, La/t9m0;->U1:La/t9m0;

    .line 17
    .line 18
    const-string v4, "TEAMS_RED_SIDE_MOBILE"

    .line 19
    .line 20
    invoke-direct {v1, v4, v2, v3}, La/zrs;-><init>(Ljava/lang/String;ILa/t9m0;)V

    .line 21
    .line 22
    .line 23
    sput-object v1, La/zrs;->c:La/zrs;

    .line 24
    .line 25
    new-instance v2, La/zrs;

    .line 26
    .line 27
    const/4 v3, 0x2

    .line 28
    sget-object v4, La/t9m0;->Z1:La/t9m0;

    .line 29
    .line 30
    const-string v5, "MINI_MAP"

    .line 31
    .line 32
    invoke-direct {v2, v5, v3, v4}, La/zrs;-><init>(Ljava/lang/String;ILa/t9m0;)V

    .line 33
    .line 34
    .line 35
    sput-object v2, La/zrs;->d:La/zrs;

    .line 36
    .line 37
    new-instance v3, La/zrs;

    .line 38
    .line 39
    const/4 v4, 0x3

    .line 40
    sget-object v5, La/t9m0;->V1:La/t9m0;

    .line 41
    .line 42
    const-string v6, "TEAMS_BLUE_SIDE_MOBILE"

    .line 43
    .line 44
    invoke-direct {v3, v6, v4, v5}, La/zrs;-><init>(Ljava/lang/String;ILa/t9m0;)V

    .line 45
    .line 46
    .line 47
    sput-object v3, La/zrs;->e:La/zrs;

    .line 48
    .line 49
    new-instance v4, La/zrs;

    .line 50
    .line 51
    const/4 v5, 0x4

    .line 52
    sget-object v6, La/t9m0;->Y1:La/t9m0;

    .line 53
    .line 54
    const-string v7, "STATISTIC_AND_ITEMS"

    .line 55
    .line 56
    invoke-direct {v4, v7, v5, v6}, La/zrs;-><init>(Ljava/lang/String;ILa/t9m0;)V

    .line 57
    .line 58
    .line 59
    new-instance v5, La/zrs;

    .line 60
    .line 61
    const/4 v6, 0x5

    .line 62
    sget-object v7, La/t9m0;->W1:La/t9m0;

    .line 63
    .line 64
    const-string v8, "BANS_PICKS"

    .line 65
    .line 66
    invoke-direct {v5, v8, v6, v7}, La/zrs;-><init>(Ljava/lang/String;ILa/t9m0;)V

    .line 67
    .line 68
    .line 69
    new-instance v6, La/zrs;

    .line 70
    .line 71
    const/4 v7, 0x6

    .line 72
    sget-object v8, La/t9m0;->b2:La/t9m0;

    .line 73
    .line 74
    const-string v9, "GOLD_GRAPH"

    .line 75
    .line 76
    invoke-direct {v6, v9, v7, v8}, La/zrs;-><init>(Ljava/lang/String;ILa/t9m0;)V

    .line 77
    .line 78
    .line 79
    new-instance v7, La/zrs;

    .line 80
    .line 81
    const/4 v8, 0x7

    .line 82
    sget-object v9, La/t9m0;->a2:La/t9m0;

    .line 83
    .line 84
    const-string v10, "PREVIOUS_MAPS"

    .line 85
    .line 86
    invoke-direct {v7, v10, v8, v9}, La/zrs;-><init>(Ljava/lang/String;ILa/t9m0;)V

    .line 87
    .line 88
    .line 89
    new-instance v8, La/zrs;

    .line 90
    .line 91
    const/16 v9, 0x8

    .line 92
    .line 93
    sget-object v10, La/t9m0;->X1:La/t9m0;

    .line 94
    .line 95
    const-string v11, "COMPOSITION"

    .line 96
    .line 97
    invoke-direct {v8, v11, v9, v10}, La/zrs;-><init>(Ljava/lang/String;ILa/t9m0;)V

    .line 98
    .line 99
    .line 100
    filled-new-array/range {v0 .. v8}, [La/zrs;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    sput-object v0, La/zrs;->f:[La/zrs;

    .line 105
    .line 106
    new-instance v1, La/c0o;

    .line 107
    .line 108
    invoke-direct {v1, v0}, La/c0o;-><init>([Ljava/lang/Enum;)V

    .line 109
    .line 110
    .line 111
    sput-object v1, La/zrs;->g:La/c0o;

    .line 112
    .line 113
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILa/t9m0;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, La/zrs;->a:La/t9m0;

    .line 5
    .line 6
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)La/zrs;
    .locals 1

    .line 1
    const-class v0, La/zrs;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/zrs;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[La/zrs;
    .locals 1

    .line 1
    sget-object v0, La/zrs;->f:[La/zrs;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [La/zrs;

    .line 8
    .line 9
    return-object v0
.end method
