.class public final enum La/ohf;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field public static final b:La/std;

.field public static final c:Ljava/util/LinkedHashMap;

.field public static final synthetic d:[La/ohf;


# instance fields
.field public final a:B


# direct methods
.method static constructor <clinit>()V
    .locals 10

    .line 1
    new-instance v0, La/ohf;

    .line 2
    .line 3
    const-string v1, "WILD_COIN"

    .line 4
    .line 5
    const/4 v7, 0x0

    .line 6
    invoke-direct {v0, v1, v7, v7}, La/ohf;-><init>(Ljava/lang/String;II)V

    .line 7
    .line 8
    .line 9
    new-instance v1, La/ohf;

    .line 10
    .line 11
    const-string v2, "RED"

    .line 12
    .line 13
    const/4 v3, 0x1

    .line 14
    invoke-direct {v1, v2, v3, v3}, La/ohf;-><init>(Ljava/lang/String;II)V

    .line 15
    .line 16
    .line 17
    new-instance v2, La/ohf;

    .line 18
    .line 19
    const-string v3, "PURPLE"

    .line 20
    .line 21
    const/4 v4, 0x2

    .line 22
    invoke-direct {v2, v3, v4, v4}, La/ohf;-><init>(Ljava/lang/String;II)V

    .line 23
    .line 24
    .line 25
    new-instance v3, La/ohf;

    .line 26
    .line 27
    const-string v4, "GREEN"

    .line 28
    .line 29
    const/4 v5, 0x3

    .line 30
    invoke-direct {v3, v4, v5, v5}, La/ohf;-><init>(Ljava/lang/String;II)V

    .line 31
    .line 32
    .line 33
    new-instance v4, La/ohf;

    .line 34
    .line 35
    const-string v5, "ORANGE"

    .line 36
    .line 37
    const/4 v6, 0x4

    .line 38
    invoke-direct {v4, v5, v6, v6}, La/ohf;-><init>(Ljava/lang/String;II)V

    .line 39
    .line 40
    .line 41
    new-instance v5, La/ohf;

    .line 42
    .line 43
    const-string v6, "DIAMOND"

    .line 44
    .line 45
    const/4 v8, 0x5

    .line 46
    invoke-direct {v5, v6, v8, v8}, La/ohf;-><init>(Ljava/lang/String;II)V

    .line 47
    .line 48
    .line 49
    new-instance v6, La/ohf;

    .line 50
    .line 51
    const-string v8, "BLUE"

    .line 52
    .line 53
    const/4 v9, 0x6

    .line 54
    invoke-direct {v6, v8, v9, v9}, La/ohf;-><init>(Ljava/lang/String;II)V

    .line 55
    .line 56
    .line 57
    filled-new-array/range {v0 .. v6}, [La/ohf;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    sput-object v0, La/ohf;->d:[La/ohf;

    .line 62
    .line 63
    new-instance v0, La/c0o;

    .line 64
    .line 65
    new-instance v0, La/std;

    .line 66
    .line 67
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 68
    .line 69
    .line 70
    sput-object v0, La/ohf;->b:La/std;

    .line 71
    .line 72
    invoke-static {}, La/ohf;->values()[La/ohf;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    array-length v1, v0

    .line 77
    invoke-static {v1}, La/wp20;->a(I)I

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    const/16 v2, 0x10

    .line 82
    .line 83
    if-ge v1, v2, :cond_0

    .line 84
    .line 85
    move v1, v2

    .line 86
    :cond_0
    new-instance v2, Ljava/util/LinkedHashMap;

    .line 87
    .line 88
    invoke-direct {v2, v1}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 89
    .line 90
    .line 91
    array-length v1, v0

    .line 92
    :goto_0
    if-ge v7, v1, :cond_1

    .line 93
    .line 94
    aget-object v3, v0, v7

    .line 95
    .line 96
    iget-byte v4, v3, La/ohf;->a:B

    .line 97
    .line 98
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 99
    .line 100
    .line 101
    move-result-object v4

    .line 102
    invoke-interface {v2, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    add-int/lit8 v7, v7, 0x1

    .line 106
    .line 107
    goto :goto_0

    .line 108
    :cond_1
    sput-object v2, La/ohf;->c:Ljava/util/LinkedHashMap;

    .line 109
    .line 110
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-byte p3, p0, La/ohf;->a:B

    .line 5
    .line 6
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)La/ohf;
    .locals 1

    .line 1
    const-class v0, La/ohf;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/ohf;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[La/ohf;
    .locals 1

    .line 1
    sget-object v0, La/ohf;->d:[La/ohf;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [La/ohf;

    .line 8
    .line 9
    return-object v0
.end method
