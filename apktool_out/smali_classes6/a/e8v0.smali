.class public final enum La/e8v0;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation runtime La/ahi0;
    with = La/f8v0;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "La/e8v0;",
        ">;"
    }
.end annotation


# static fields
.field public static final Companion:La/d8v0;

.field public static final enum b:La/e8v0;

.field public static final synthetic c:[La/e8v0;

.field public static final synthetic d:La/c0o;


# instance fields
.field public final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 16

    .line 1
    new-instance v0, La/e8v0;

    .line 2
    .line 3
    const-string v1, "UNKNOWN"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2, v1}, La/e8v0;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 7
    .line 8
    .line 9
    sput-object v0, La/e8v0;->b:La/e8v0;

    .line 10
    .line 11
    new-instance v1, La/e8v0;

    .line 12
    .line 13
    const-string v2, "FLYWEIGHT"

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    invoke-direct {v1, v2, v3, v2}, La/e8v0;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 17
    .line 18
    .line 19
    new-instance v2, La/e8v0;

    .line 20
    .line 21
    const-string v3, "BANTAMWEIGHT"

    .line 22
    .line 23
    const/4 v4, 0x2

    .line 24
    invoke-direct {v2, v3, v4, v3}, La/e8v0;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 25
    .line 26
    .line 27
    new-instance v3, La/e8v0;

    .line 28
    .line 29
    const-string v4, "FEATHERWEIGHT"

    .line 30
    .line 31
    const/4 v5, 0x3

    .line 32
    invoke-direct {v3, v4, v5, v4}, La/e8v0;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 33
    .line 34
    .line 35
    new-instance v4, La/e8v0;

    .line 36
    .line 37
    const-string v5, "LIGHTWEIGHT"

    .line 38
    .line 39
    const/4 v6, 0x4

    .line 40
    invoke-direct {v4, v5, v6, v5}, La/e8v0;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 41
    .line 42
    .line 43
    new-instance v5, La/e8v0;

    .line 44
    .line 45
    const-string v6, "WELTERWEIGHT"

    .line 46
    .line 47
    const/4 v7, 0x5

    .line 48
    invoke-direct {v5, v6, v7, v6}, La/e8v0;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 49
    .line 50
    .line 51
    new-instance v6, La/e8v0;

    .line 52
    .line 53
    const-string v7, "MIDDLEWEIGHT"

    .line 54
    .line 55
    const/4 v8, 0x6

    .line 56
    invoke-direct {v6, v7, v8, v7}, La/e8v0;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 57
    .line 58
    .line 59
    new-instance v7, La/e8v0;

    .line 60
    .line 61
    const-string v8, "LIGHT_HEAVYWEIGHT"

    .line 62
    .line 63
    const/4 v9, 0x7

    .line 64
    invoke-direct {v7, v8, v9, v8}, La/e8v0;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 65
    .line 66
    .line 67
    new-instance v8, La/e8v0;

    .line 68
    .line 69
    const-string v9, "HEAVYWEIGHT"

    .line 70
    .line 71
    const/16 v10, 0x8

    .line 72
    .line 73
    invoke-direct {v8, v9, v10, v9}, La/e8v0;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 74
    .line 75
    .line 76
    new-instance v9, La/e8v0;

    .line 77
    .line 78
    const-string v10, "MENS_POUND_FOR_POUND"

    .line 79
    .line 80
    const/16 v11, 0x9

    .line 81
    .line 82
    invoke-direct {v9, v10, v11, v10}, La/e8v0;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 83
    .line 84
    .line 85
    new-instance v10, La/e8v0;

    .line 86
    .line 87
    const-string v11, "WOMENS_SW"

    .line 88
    .line 89
    const/16 v12, 0xa

    .line 90
    .line 91
    invoke-direct {v10, v11, v12, v11}, La/e8v0;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 92
    .line 93
    .line 94
    new-instance v11, La/e8v0;

    .line 95
    .line 96
    const-string v12, "WOMENS_FLW"

    .line 97
    .line 98
    const/16 v13, 0xb

    .line 99
    .line 100
    invoke-direct {v11, v12, v13, v12}, La/e8v0;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 101
    .line 102
    .line 103
    new-instance v12, La/e8v0;

    .line 104
    .line 105
    const-string v13, "WOMENS_BW"

    .line 106
    .line 107
    const/16 v14, 0xc

    .line 108
    .line 109
    invoke-direct {v12, v13, v14, v13}, La/e8v0;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 110
    .line 111
    .line 112
    new-instance v13, La/e8v0;

    .line 113
    .line 114
    const-string v14, "WOMENS_POUND_FOR_POUND"

    .line 115
    .line 116
    const/16 v15, 0xd

    .line 117
    .line 118
    invoke-direct {v13, v14, v15, v14}, La/e8v0;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 119
    .line 120
    .line 121
    filled-new-array/range {v0 .. v13}, [La/e8v0;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    sput-object v0, La/e8v0;->c:[La/e8v0;

    .line 126
    .line 127
    new-instance v1, La/c0o;

    .line 128
    .line 129
    invoke-direct {v1, v0}, La/c0o;-><init>([Ljava/lang/Enum;)V

    .line 130
    .line 131
    .line 132
    sput-object v1, La/e8v0;->d:La/c0o;

    .line 133
    .line 134
    new-instance v0, La/d8v0;

    .line 135
    .line 136
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 137
    .line 138
    .line 139
    sput-object v0, La/e8v0;->Companion:La/d8v0;

    .line 140
    .line 141
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, La/e8v0;->a:Ljava/lang/String;

    .line 5
    .line 6
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)La/e8v0;
    .locals 1

    .line 1
    const-class v0, La/e8v0;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/e8v0;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[La/e8v0;
    .locals 1

    .line 1
    sget-object v0, La/e8v0;->c:[La/e8v0;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [La/e8v0;

    .line 8
    .line 9
    return-object v0
.end method
