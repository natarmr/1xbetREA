.class public final enum La/kj0;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final synthetic b:[La/kj0;

.field public static final synthetic c:La/c0o;


# instance fields
.field public final a:B


# direct methods
.method static constructor <clinit>()V
    .locals 14

    .line 1
    new-instance v0, La/kj0;

    .line 2
    .line 3
    const-string v1, "GAME_CAROUSEL"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x5

    .line 7
    invoke-direct {v0, v1, v2, v3}, La/kj0;-><init>(Ljava/lang/String;II)V

    .line 8
    .line 9
    .line 10
    new-instance v1, La/kj0;

    .line 11
    .line 12
    const-string v2, "VIRTUAL_CAROUSELS"

    .line 13
    .line 14
    const/4 v4, 0x1

    .line 15
    const/4 v5, 0x6

    .line 16
    invoke-direct {v1, v2, v4, v5}, La/kj0;-><init>(Ljava/lang/String;II)V

    .line 17
    .line 18
    .line 19
    new-instance v2, La/kj0;

    .line 20
    .line 21
    const-string v4, "TOURNAMENT_MONTH"

    .line 22
    .line 23
    const/4 v6, 0x2

    .line 24
    const/16 v7, 0x8

    .line 25
    .line 26
    invoke-direct {v2, v4, v6, v7}, La/kj0;-><init>(Ljava/lang/String;II)V

    .line 27
    .line 28
    .line 29
    move v4, v3

    .line 30
    new-instance v3, La/kj0;

    .line 31
    .line 32
    const-string v6, "SLOT_MACHINE"

    .line 33
    .line 34
    const/4 v8, 0x3

    .line 35
    const/16 v9, 0x9

    .line 36
    .line 37
    invoke-direct {v3, v6, v8, v9}, La/kj0;-><init>(Ljava/lang/String;II)V

    .line 38
    .line 39
    .line 40
    move v6, v4

    .line 41
    new-instance v4, La/kj0;

    .line 42
    .line 43
    const/4 v8, 0x4

    .line 44
    const/16 v10, 0xb

    .line 45
    .line 46
    const-string v11, "REGISTRATION_BONUS_BANNER"

    .line 47
    .line 48
    invoke-direct {v4, v11, v8, v10}, La/kj0;-><init>(Ljava/lang/String;II)V

    .line 49
    .line 50
    .line 51
    move v8, v5

    .line 52
    new-instance v5, La/kj0;

    .line 53
    .line 54
    const-string v10, "AUTHORIZATION_BANNER"

    .line 55
    .line 56
    const/16 v11, 0xc

    .line 57
    .line 58
    invoke-direct {v5, v10, v6, v11}, La/kj0;-><init>(Ljava/lang/String;II)V

    .line 59
    .line 60
    .line 61
    new-instance v6, La/kj0;

    .line 62
    .line 63
    const-string v10, "JACKPOT_WIDGET"

    .line 64
    .line 65
    const/16 v11, 0xd

    .line 66
    .line 67
    invoke-direct {v6, v10, v8, v11}, La/kj0;-><init>(Ljava/lang/String;II)V

    .line 68
    .line 69
    .line 70
    move v8, v7

    .line 71
    new-instance v7, La/kj0;

    .line 72
    .line 73
    const/4 v10, 0x7

    .line 74
    const/16 v11, 0xe

    .line 75
    .line 76
    const-string v12, "LOYALTY_WIDGET"

    .line 77
    .line 78
    invoke-direct {v7, v12, v10, v11}, La/kj0;-><init>(Ljava/lang/String;II)V

    .line 79
    .line 80
    .line 81
    move v10, v8

    .line 82
    new-instance v8, La/kj0;

    .line 83
    .line 84
    const-string v11, "PROMOTIONS_CAROUSEL"

    .line 85
    .line 86
    const/16 v12, 0xf

    .line 87
    .line 88
    invoke-direct {v8, v11, v10, v12}, La/kj0;-><init>(Ljava/lang/String;II)V

    .line 89
    .line 90
    .line 91
    move v10, v9

    .line 92
    new-instance v9, La/kj0;

    .line 93
    .line 94
    const-string v11, "USER_TOURNAMENTS"

    .line 95
    .line 96
    const/16 v12, 0x10

    .line 97
    .line 98
    invoke-direct {v9, v11, v10, v12}, La/kj0;-><init>(Ljava/lang/String;II)V

    .line 99
    .line 100
    .line 101
    new-instance v10, La/kj0;

    .line 102
    .line 103
    const/16 v11, 0xa

    .line 104
    .line 105
    const/16 v12, 0x11

    .line 106
    .line 107
    const-string v13, "DAILY_TASK_WIDGET"

    .line 108
    .line 109
    invoke-direct {v10, v13, v11, v12}, La/kj0;-><init>(Ljava/lang/String;II)V

    .line 110
    .line 111
    .line 112
    filled-new-array/range {v0 .. v10}, [La/kj0;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    sput-object v0, La/kj0;->b:[La/kj0;

    .line 117
    .line 118
    new-instance v1, La/c0o;

    .line 119
    .line 120
    invoke-direct {v1, v0}, La/c0o;-><init>([Ljava/lang/Enum;)V

    .line 121
    .line 122
    .line 123
    sput-object v1, La/kj0;->c:La/c0o;

    .line 124
    .line 125
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-byte p3, p0, La/kj0;->a:B

    .line 5
    .line 6
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)La/kj0;
    .locals 1

    .line 1
    const-class v0, La/kj0;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/kj0;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[La/kj0;
    .locals 1

    .line 1
    sget-object v0, La/kj0;->b:[La/kj0;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [La/kj0;

    .line 8
    .line 9
    return-object v0
.end method
