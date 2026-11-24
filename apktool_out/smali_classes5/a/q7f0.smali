.class public final enum La/q7f0;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final b:La/gne0;

.field public static final c:Ljava/util/LinkedHashMap;

.field public static final enum d:La/q7f0;

.field public static final enum e:La/q7f0;

.field public static final enum f:La/q7f0;

.field public static final enum g:La/q7f0;

.field public static final enum h:La/q7f0;

.field public static final synthetic i:[La/q7f0;

.field public static final synthetic j:La/c0o;


# instance fields
.field public final a:B


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 1
    new-instance v0, La/q7f0;

    .line 2
    .line 3
    const-string v1, "FULL"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    invoke-direct {v0, v1, v2, v3}, La/q7f0;-><init>(Ljava/lang/String;II)V

    .line 8
    .line 9
    .line 10
    sput-object v0, La/q7f0;->d:La/q7f0;

    .line 11
    .line 12
    new-instance v1, La/q7f0;

    .line 13
    .line 14
    const-string v4, "PHONE"

    .line 15
    .line 16
    const/4 v5, 0x2

    .line 17
    invoke-direct {v1, v4, v3, v5}, La/q7f0;-><init>(Ljava/lang/String;II)V

    .line 18
    .line 19
    .line 20
    sput-object v1, La/q7f0;->e:La/q7f0;

    .line 21
    .line 22
    new-instance v3, La/q7f0;

    .line 23
    .line 24
    const-string v4, "ONE_CLICK"

    .line 25
    .line 26
    const/4 v6, 0x3

    .line 27
    invoke-direct {v3, v4, v5, v6}, La/q7f0;-><init>(Ljava/lang/String;II)V

    .line 28
    .line 29
    .line 30
    sput-object v3, La/q7f0;->f:La/q7f0;

    .line 31
    .line 32
    new-instance v4, La/q7f0;

    .line 33
    .line 34
    const-string v5, "SOCIAL"

    .line 35
    .line 36
    const/4 v7, 0x4

    .line 37
    invoke-direct {v4, v5, v6, v7}, La/q7f0;-><init>(Ljava/lang/String;II)V

    .line 38
    .line 39
    .line 40
    sput-object v4, La/q7f0;->g:La/q7f0;

    .line 41
    .line 42
    new-instance v5, La/q7f0;

    .line 43
    .line 44
    const-string v6, "REGULATOR"

    .line 45
    .line 46
    const/16 v8, 0x8

    .line 47
    .line 48
    invoke-direct {v5, v6, v7, v8}, La/q7f0;-><init>(Ljava/lang/String;II)V

    .line 49
    .line 50
    .line 51
    sput-object v5, La/q7f0;->h:La/q7f0;

    .line 52
    .line 53
    filled-new-array {v0, v1, v3, v4, v5}, [La/q7f0;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    sput-object v0, La/q7f0;->i:[La/q7f0;

    .line 58
    .line 59
    new-instance v1, La/c0o;

    .line 60
    .line 61
    invoke-direct {v1, v0}, La/c0o;-><init>([Ljava/lang/Enum;)V

    .line 62
    .line 63
    .line 64
    sput-object v1, La/q7f0;->j:La/c0o;

    .line 65
    .line 66
    new-instance v0, La/gne0;

    .line 67
    .line 68
    invoke-direct {v0, v7}, La/gne0;-><init>(B)V

    .line 69
    .line 70
    .line 71
    sput-object v0, La/q7f0;->b:La/gne0;

    .line 72
    .line 73
    const/16 v0, 0xa

    .line 74
    .line 75
    invoke-static {v1, v0}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    invoke-static {v0}, La/wp20;->a(I)I

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    const/16 v3, 0x10

    .line 84
    .line 85
    if-ge v0, v3, :cond_0

    .line 86
    .line 87
    move v0, v3

    .line 88
    :cond_0
    new-instance v3, Ljava/util/LinkedHashMap;

    .line 89
    .line 90
    invoke-direct {v3, v0}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 91
    .line 92
    .line 93
    new-instance v0, La/y2;

    .line 94
    .line 95
    invoke-direct {v0, v1, v2}, La/y2;-><init>(Ljava/lang/Object;B)V

    .line 96
    .line 97
    .line 98
    :goto_0
    invoke-virtual {v0}, La/y2;->hasNext()Z

    .line 99
    .line 100
    .line 101
    move-result v1

    .line 102
    if-eqz v1, :cond_1

    .line 103
    .line 104
    invoke-virtual {v0}, La/y2;->next()Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    move-object v2, v1

    .line 109
    check-cast v2, La/q7f0;

    .line 110
    .line 111
    iget-byte v2, v2, La/q7f0;->a:B

    .line 112
    .line 113
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 114
    .line 115
    .line 116
    move-result-object v2

    .line 117
    invoke-interface {v3, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    goto :goto_0

    .line 121
    :cond_1
    sput-object v3, La/q7f0;->c:Ljava/util/LinkedHashMap;

    .line 122
    .line 123
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-byte p3, p0, La/q7f0;->a:B

    .line 5
    .line 6
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)La/q7f0;
    .locals 1

    .line 1
    const-class v0, La/q7f0;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/q7f0;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[La/q7f0;
    .locals 1

    .line 1
    sget-object v0, La/q7f0;->i:[La/q7f0;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [La/q7f0;

    .line 8
    .line 9
    return-object v0
.end method
