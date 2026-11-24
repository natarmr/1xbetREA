.class public final enum La/uoy;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final b:La/tqt;

.field public static final enum c:La/uoy;

.field public static final enum d:La/uoy;

.field public static final enum e:La/uoy;

.field public static final enum f:La/uoy;

.field public static final enum g:La/uoy;

.field public static final synthetic h:[La/uoy;

.field public static final synthetic i:La/c0o;


# instance fields
.field public final a:B


# direct methods
.method static constructor <clinit>()V
    .locals 12

    .line 1
    new-instance v0, La/uoy;

    .line 2
    .line 3
    const-string v1, "UNKNOWN"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2, v2}, La/uoy;-><init>(Ljava/lang/String;II)V

    .line 7
    .line 8
    .line 9
    sput-object v0, La/uoy;->c:La/uoy;

    .line 10
    .line 11
    new-instance v1, La/uoy;

    .line 12
    .line 13
    const-string v2, "LIVE"

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    invoke-direct {v1, v2, v3, v3}, La/uoy;-><init>(Ljava/lang/String;II)V

    .line 17
    .line 18
    .line 19
    sput-object v1, La/uoy;->d:La/uoy;

    .line 20
    .line 21
    new-instance v2, La/uoy;

    .line 22
    .line 23
    const-string v3, "LIVE_LINE"

    .line 24
    .line 25
    const/4 v4, 0x2

    .line 26
    invoke-direct {v2, v3, v4, v4}, La/uoy;-><init>(Ljava/lang/String;II)V

    .line 27
    .line 28
    .line 29
    new-instance v3, La/uoy;

    .line 30
    .line 31
    const-string v4, "LINE"

    .line 32
    .line 33
    const/4 v5, 0x3

    .line 34
    invoke-direct {v3, v4, v5, v5}, La/uoy;-><init>(Ljava/lang/String;II)V

    .line 35
    .line 36
    .line 37
    sput-object v3, La/uoy;->e:La/uoy;

    .line 38
    .line 39
    new-instance v4, La/uoy;

    .line 40
    .line 41
    const-string v5, "ZONE_PLAY"

    .line 42
    .line 43
    const/4 v6, 0x4

    .line 44
    invoke-direct {v4, v5, v6, v6}, La/uoy;-><init>(Ljava/lang/String;II)V

    .line 45
    .line 46
    .line 47
    new-instance v5, La/uoy;

    .line 48
    .line 49
    const-string v6, "FINANCE_365"

    .line 50
    .line 51
    const/4 v7, 0x5

    .line 52
    const/4 v8, 0x6

    .line 53
    invoke-direct {v5, v6, v7, v8}, La/uoy;-><init>(Ljava/lang/String;II)V

    .line 54
    .line 55
    .line 56
    sput-object v5, La/uoy;->f:La/uoy;

    .line 57
    .line 58
    new-instance v6, La/uoy;

    .line 59
    .line 60
    const-string v7, "BONUS"

    .line 61
    .line 62
    const/4 v9, 0x7

    .line 63
    invoke-direct {v6, v7, v8, v9}, La/uoy;-><init>(Ljava/lang/String;II)V

    .line 64
    .line 65
    .line 66
    sput-object v6, La/uoy;->g:La/uoy;

    .line 67
    .line 68
    new-instance v7, La/uoy;

    .line 69
    .line 70
    const-string v8, "BM"

    .line 71
    .line 72
    const/16 v10, 0x8

    .line 73
    .line 74
    invoke-direct {v7, v8, v9, v10}, La/uoy;-><init>(Ljava/lang/String;II)V

    .line 75
    .line 76
    .line 77
    new-instance v8, La/uoy;

    .line 78
    .line 79
    const-string v9, "BM_LIVE"

    .line 80
    .line 81
    const/16 v11, 0x9

    .line 82
    .line 83
    invoke-direct {v8, v9, v10, v11}, La/uoy;-><init>(Ljava/lang/String;II)V

    .line 84
    .line 85
    .line 86
    filled-new-array/range {v0 .. v8}, [La/uoy;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    sput-object v0, La/uoy;->h:[La/uoy;

    .line 91
    .line 92
    new-instance v1, La/c0o;

    .line 93
    .line 94
    invoke-direct {v1, v0}, La/c0o;-><init>([Ljava/lang/Enum;)V

    .line 95
    .line 96
    .line 97
    sput-object v1, La/uoy;->i:La/c0o;

    .line 98
    .line 99
    new-instance v0, La/tqt;

    .line 100
    .line 101
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 102
    .line 103
    .line 104
    sput-object v0, La/uoy;->b:La/tqt;

    .line 105
    .line 106
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-byte p3, p0, La/uoy;->a:B

    .line 5
    .line 6
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)La/uoy;
    .locals 1

    .line 1
    const-class v0, La/uoy;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/uoy;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[La/uoy;
    .locals 1

    .line 1
    sget-object v0, La/uoy;->h:[La/uoy;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [La/uoy;

    .line 8
    .line 9
    return-object v0
.end method
