.class public final enum La/gkj;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum b:La/gkj;

.field public static final enum c:La/gkj;

.field public static final enum d:La/gkj;

.field public static final enum e:La/gkj;

.field public static final enum f:La/gkj;

.field public static final enum g:La/gkj;

.field public static final enum h:La/gkj;

.field public static final enum i:La/gkj;

.field public static final enum j:La/gkj;

.field public static final enum k:La/gkj;

.field public static final enum l:La/gkj;

.field public static final synthetic m:[La/gkj;


# instance fields
.field public final a:Ljava/lang/Class;


# direct methods
.method static constructor <clinit>()V
    .locals 15

    .line 1
    new-instance v0, La/gkj;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-class v2, Ljava/lang/Object;

    .line 5
    .line 6
    const-string v3, "OTHER"

    .line 7
    .line 8
    invoke-direct {v0, v1, v2, v3}, La/gkj;-><init>(ILjava/lang/Class;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v1, La/gkj;

    .line 12
    .line 13
    const/4 v2, 0x1

    .line 14
    const-class v3, Ljava/lang/Void;

    .line 15
    .line 16
    const-string v4, "PURE_BARCODE"

    .line 17
    .line 18
    invoke-direct {v1, v2, v3, v4}, La/gkj;-><init>(ILjava/lang/Class;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    sput-object v1, La/gkj;->b:La/gkj;

    .line 22
    .line 23
    new-instance v2, La/gkj;

    .line 24
    .line 25
    const/4 v4, 0x2

    .line 26
    const-class v5, Ljava/util/List;

    .line 27
    .line 28
    const-string v6, "POSSIBLE_FORMATS"

    .line 29
    .line 30
    invoke-direct {v2, v4, v5, v6}, La/gkj;-><init>(ILjava/lang/Class;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    sput-object v2, La/gkj;->c:La/gkj;

    .line 34
    .line 35
    move-object v4, v3

    .line 36
    new-instance v3, La/gkj;

    .line 37
    .line 38
    const-string v5, "TRY_HARDER"

    .line 39
    .line 40
    const/4 v6, 0x3

    .line 41
    invoke-direct {v3, v6, v4, v5}, La/gkj;-><init>(ILjava/lang/Class;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    sput-object v3, La/gkj;->d:La/gkj;

    .line 45
    .line 46
    move-object v5, v4

    .line 47
    new-instance v4, La/gkj;

    .line 48
    .line 49
    const/4 v6, 0x4

    .line 50
    const-class v7, Ljava/lang/String;

    .line 51
    .line 52
    const-string v8, "CHARACTER_SET"

    .line 53
    .line 54
    invoke-direct {v4, v6, v7, v8}, La/gkj;-><init>(ILjava/lang/Class;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    sput-object v4, La/gkj;->e:La/gkj;

    .line 58
    .line 59
    move-object v6, v5

    .line 60
    new-instance v5, La/gkj;

    .line 61
    .line 62
    const/4 v7, 0x5

    .line 63
    const-class v8, [I

    .line 64
    .line 65
    const-string v9, "ALLOWED_LENGTHS"

    .line 66
    .line 67
    invoke-direct {v5, v7, v8, v9}, La/gkj;-><init>(ILjava/lang/Class;Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    sput-object v5, La/gkj;->f:La/gkj;

    .line 71
    .line 72
    move-object v7, v6

    .line 73
    new-instance v6, La/gkj;

    .line 74
    .line 75
    const-string v9, "ASSUME_CODE_39_CHECK_DIGIT"

    .line 76
    .line 77
    const/4 v10, 0x6

    .line 78
    invoke-direct {v6, v10, v7, v9}, La/gkj;-><init>(ILjava/lang/Class;Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    sput-object v6, La/gkj;->g:La/gkj;

    .line 82
    .line 83
    move-object v9, v7

    .line 84
    new-instance v7, La/gkj;

    .line 85
    .line 86
    const-string v10, "ASSUME_GS1"

    .line 87
    .line 88
    const/4 v11, 0x7

    .line 89
    invoke-direct {v7, v11, v9, v10}, La/gkj;-><init>(ILjava/lang/Class;Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    sput-object v7, La/gkj;->h:La/gkj;

    .line 93
    .line 94
    move-object v10, v8

    .line 95
    new-instance v8, La/gkj;

    .line 96
    .line 97
    const-string v11, "RETURN_CODABAR_START_END"

    .line 98
    .line 99
    const/16 v12, 0x8

    .line 100
    .line 101
    invoke-direct {v8, v12, v9, v11}, La/gkj;-><init>(ILjava/lang/Class;Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    sput-object v8, La/gkj;->i:La/gkj;

    .line 105
    .line 106
    move-object v11, v9

    .line 107
    new-instance v9, La/gkj;

    .line 108
    .line 109
    const/16 v12, 0x9

    .line 110
    .line 111
    const-class v13, La/e3g0;

    .line 112
    .line 113
    const-string v14, "NEED_RESULT_POINT_CALLBACK"

    .line 114
    .line 115
    invoke-direct {v9, v12, v13, v14}, La/gkj;-><init>(ILjava/lang/Class;Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    sput-object v9, La/gkj;->j:La/gkj;

    .line 119
    .line 120
    move-object v12, v10

    .line 121
    new-instance v10, La/gkj;

    .line 122
    .line 123
    const-string v13, "ALLOWED_EAN_EXTENSIONS"

    .line 124
    .line 125
    const/16 v14, 0xa

    .line 126
    .line 127
    invoke-direct {v10, v14, v12, v13}, La/gkj;-><init>(ILjava/lang/Class;Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    sput-object v10, La/gkj;->k:La/gkj;

    .line 131
    .line 132
    move-object v12, v11

    .line 133
    new-instance v11, La/gkj;

    .line 134
    .line 135
    const-string v13, "ALSO_INVERTED"

    .line 136
    .line 137
    const/16 v14, 0xb

    .line 138
    .line 139
    invoke-direct {v11, v14, v12, v13}, La/gkj;-><init>(ILjava/lang/Class;Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    sput-object v11, La/gkj;->l:La/gkj;

    .line 143
    .line 144
    filled-new-array/range {v0 .. v11}, [La/gkj;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    sput-object v0, La/gkj;->m:[La/gkj;

    .line 149
    .line 150
    return-void
.end method

.method public constructor <init>(ILjava/lang/Class;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p3, p1}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, La/gkj;->a:Ljava/lang/Class;

    .line 5
    .line 6
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)La/gkj;
    .locals 1

    .line 1
    const-class v0, La/gkj;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/gkj;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[La/gkj;
    .locals 1

    .line 1
    sget-object v0, La/gkj;->m:[La/gkj;

    .line 2
    .line 3
    invoke-virtual {v0}, [La/gkj;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [La/gkj;

    .line 8
    .line 9
    return-object v0
.end method
