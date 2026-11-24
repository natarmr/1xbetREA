.class public final enum La/sw5;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final b:La/cl5;

.field public static final enum c:La/sw5;

.field public static final enum d:La/sw5;

.field public static final enum e:La/sw5;

.field public static final enum f:La/sw5;

.field public static final synthetic g:[La/sw5;

.field public static final synthetic h:La/c0o;


# instance fields
.field public final a:B


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, La/sw5;

    .line 2
    .line 3
    const-string v1, "ROUND_ZERO"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2, v2}, La/sw5;-><init>(Ljava/lang/String;II)V

    .line 7
    .line 8
    .line 9
    new-instance v1, La/sw5;

    .line 10
    .line 11
    const-string v2, "ROUND_8"

    .line 12
    .line 13
    const/4 v3, 0x1

    .line 14
    invoke-direct {v1, v2, v3, v3}, La/sw5;-><init>(Ljava/lang/String;II)V

    .line 15
    .line 16
    .line 17
    sput-object v1, La/sw5;->c:La/sw5;

    .line 18
    .line 19
    new-instance v2, La/sw5;

    .line 20
    .line 21
    const-string v3, "ROUND_16"

    .line 22
    .line 23
    const/4 v4, 0x2

    .line 24
    invoke-direct {v2, v3, v4, v4}, La/sw5;-><init>(Ljava/lang/String;II)V

    .line 25
    .line 26
    .line 27
    sput-object v2, La/sw5;->d:La/sw5;

    .line 28
    .line 29
    new-instance v3, La/sw5;

    .line 30
    .line 31
    const-string v4, "ROUND_360"

    .line 32
    .line 33
    const/4 v5, 0x3

    .line 34
    invoke-direct {v3, v4, v5, v5}, La/sw5;-><init>(Ljava/lang/String;II)V

    .line 35
    .line 36
    .line 37
    sput-object v3, La/sw5;->e:La/sw5;

    .line 38
    .line 39
    new-instance v4, La/sw5;

    .line 40
    .line 41
    const-string v5, "ROUND_12"

    .line 42
    .line 43
    const/4 v6, 0x4

    .line 44
    invoke-direct {v4, v5, v6, v6}, La/sw5;-><init>(Ljava/lang/String;II)V

    .line 45
    .line 46
    .line 47
    sput-object v4, La/sw5;->f:La/sw5;

    .line 48
    .line 49
    filled-new-array {v0, v1, v2, v3, v4}, [La/sw5;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    sput-object v0, La/sw5;->g:[La/sw5;

    .line 54
    .line 55
    new-instance v1, La/c0o;

    .line 56
    .line 57
    invoke-direct {v1, v0}, La/c0o;-><init>([Ljava/lang/Enum;)V

    .line 58
    .line 59
    .line 60
    sput-object v1, La/sw5;->h:La/c0o;

    .line 61
    .line 62
    new-instance v0, La/cl5;

    .line 63
    .line 64
    const/4 v1, 0x2

    .line 65
    invoke-direct {v0, v1}, La/cl5;-><init>(B)V

    .line 66
    .line 67
    .line 68
    sput-object v0, La/sw5;->b:La/cl5;

    .line 69
    .line 70
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-byte p3, p0, La/sw5;->a:B

    .line 5
    .line 6
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)La/sw5;
    .locals 1

    .line 1
    const-class v0, La/sw5;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/sw5;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[La/sw5;
    .locals 1

    .line 1
    sget-object v0, La/sw5;->g:[La/sw5;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [La/sw5;

    .line 8
    .line 9
    return-object v0
.end method
