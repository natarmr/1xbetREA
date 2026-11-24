.class public final enum La/eh3;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements La/sgf0;


# static fields
.field public static final enum b:La/eh3;

.field public static final enum c:La/eh3;

.field public static final enum d:La/eh3;

.field public static final enum e:La/eh3;

.field public static final synthetic f:[La/eh3;


# instance fields
.field public final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 1
    new-instance v0, La/eh3;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "img"

    .line 5
    .line 6
    const-string v3, "IMAGE"

    .line 7
    .line 8
    invoke-direct {v0, v3, v1, v2}, La/eh3;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sput-object v0, La/eh3;->b:La/eh3;

    .line 12
    .line 13
    new-instance v1, La/eh3;

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    const-string v3, "remoteImg"

    .line 17
    .line 18
    const-string v4, "REMOTE_IMAGE"

    .line 19
    .line 20
    invoke-direct {v1, v4, v2, v3}, La/eh3;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 21
    .line 22
    .line 23
    sput-object v1, La/eh3;->c:La/eh3;

    .line 24
    .line 25
    new-instance v2, La/eh3;

    .line 26
    .line 27
    const/4 v3, 0x2

    .line 28
    const-string v4, "lottie"

    .line 29
    .line 30
    const-string v5, "LOTTIE"

    .line 31
    .line 32
    invoke-direct {v2, v5, v3, v4}, La/eh3;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 33
    .line 34
    .line 35
    new-instance v3, La/eh3;

    .line 36
    .line 37
    const/4 v4, 0x3

    .line 38
    const-string v5, "video"

    .line 39
    .line 40
    const-string v6, "VIDEO"

    .line 41
    .line 42
    invoke-direct {v3, v6, v4, v5}, La/eh3;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 43
    .line 44
    .line 45
    sput-object v3, La/eh3;->d:La/eh3;

    .line 46
    .line 47
    new-instance v4, La/eh3;

    .line 48
    .line 49
    const/4 v5, 0x4

    .line 50
    const-string v6, "smartImage"

    .line 51
    .line 52
    const-string v7, "SMART_IMAGE"

    .line 53
    .line 54
    invoke-direct {v4, v7, v5, v6}, La/eh3;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 55
    .line 56
    .line 57
    sput-object v4, La/eh3;->e:La/eh3;

    .line 58
    .line 59
    filled-new-array {v0, v1, v2, v3, v4}, [La/eh3;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    sput-object v0, La/eh3;->f:[La/eh3;

    .line 64
    .line 65
    new-instance v0, La/c0o;

    .line 66
    .line 67
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, La/eh3;->a:Ljava/lang/String;

    .line 5
    .line 6
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)La/eh3;
    .locals 1

    .line 1
    const-class v0, La/eh3;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/eh3;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[La/eh3;
    .locals 1

    .line 1
    sget-object v0, La/eh3;->f:[La/eh3;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [La/eh3;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 0

    .line 1
    const-string p0, "startScreenBackgroundDemo"

    .line 2
    .line 3
    return-object p0
.end method

.method public final getValue()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, La/eh3;->a:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method
