.class public final enum La/wpa0;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum b:La/wpa0;

.field public static final enum c:La/wpa0;

.field public static final synthetic d:[La/wpa0;


# instance fields
.field public final a:I


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, La/wpa0;

    .line 2
    .line 3
    const-string v1, "YES"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    invoke-direct {v0, v1, v2, v3}, La/wpa0;-><init>(Ljava/lang/String;II)V

    .line 8
    .line 9
    .line 10
    sput-object v0, La/wpa0;->b:La/wpa0;

    .line 11
    .line 12
    new-instance v1, La/wpa0;

    .line 13
    .line 14
    const-string v4, "NO"

    .line 15
    .line 16
    const/4 v5, 0x2

    .line 17
    invoke-direct {v1, v4, v3, v5}, La/wpa0;-><init>(Ljava/lang/String;II)V

    .line 18
    .line 19
    .line 20
    sput-object v1, La/wpa0;->c:La/wpa0;

    .line 21
    .line 22
    new-instance v3, La/wpa0;

    .line 23
    .line 24
    const-string v4, "NONE"

    .line 25
    .line 26
    const/4 v6, -0x1

    .line 27
    invoke-direct {v3, v4, v5, v6}, La/wpa0;-><init>(Ljava/lang/String;II)V

    .line 28
    .line 29
    .line 30
    filled-new-array {v0, v1, v3}, [La/wpa0;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    sput-object v0, La/wpa0;->d:[La/wpa0;

    .line 35
    .line 36
    new-instance v1, La/c0o;

    .line 37
    .line 38
    invoke-direct {v1, v0}, La/c0o;-><init>([Ljava/lang/Enum;)V

    .line 39
    .line 40
    .line 41
    const/16 v0, 0xa

    .line 42
    .line 43
    invoke-static {v1, v0}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    invoke-static {v0}, La/wp20;->a(I)I

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    const/16 v3, 0x10

    .line 52
    .line 53
    if-ge v0, v3, :cond_0

    .line 54
    .line 55
    move v0, v3

    .line 56
    :cond_0
    new-instance v3, Ljava/util/LinkedHashMap;

    .line 57
    .line 58
    invoke-direct {v3, v0}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 59
    .line 60
    .line 61
    new-instance v0, La/y2;

    .line 62
    .line 63
    invoke-direct {v0, v1, v2}, La/y2;-><init>(Ljava/lang/Object;B)V

    .line 64
    .line 65
    .line 66
    :goto_0
    invoke-virtual {v0}, La/y2;->hasNext()Z

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    if-eqz v1, :cond_1

    .line 71
    .line 72
    invoke-virtual {v0}, La/y2;->next()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    move-object v2, v1

    .line 77
    check-cast v2, La/wpa0;

    .line 78
    .line 79
    iget v2, v2, La/wpa0;->a:I

    .line 80
    .line 81
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    invoke-interface {v3, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_1
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput p3, p0, La/wpa0;->a:I

    .line 5
    .line 6
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)La/wpa0;
    .locals 1

    .line 1
    const-class v0, La/wpa0;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/wpa0;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[La/wpa0;
    .locals 1

    .line 1
    sget-object v0, La/wpa0;->d:[La/wpa0;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [La/wpa0;

    .line 8
    .line 9
    return-object v0
.end method
