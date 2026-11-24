.class public final enum La/ih2;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum b:La/ih2;

.field public static final enum c:La/ih2;

.field public static final enum d:La/ih2;

.field public static final enum e:La/ih2;

.field public static final enum f:La/ih2;

.field public static final synthetic g:[La/ih2;

.field public static final synthetic h:La/c0o;


# instance fields
.field public final a:B


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 1
    new-instance v0, La/ih2;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-wide/16 v2, 0x1

    .line 5
    .line 6
    const-string v4, "Events"

    .line 7
    .line 8
    invoke-direct {v0, v4, v1, v2, v3}, La/ih2;-><init>(Ljava/lang/String;IJ)V

    .line 9
    .line 10
    .line 11
    sput-object v0, La/ih2;->b:La/ih2;

    .line 12
    .line 13
    new-instance v1, La/ih2;

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    const-wide/16 v3, 0x2

    .line 17
    .line 18
    const-string v5, "Teams"

    .line 19
    .line 20
    invoke-direct {v1, v5, v2, v3, v4}, La/ih2;-><init>(Ljava/lang/String;IJ)V

    .line 21
    .line 22
    .line 23
    sput-object v1, La/ih2;->c:La/ih2;

    .line 24
    .line 25
    new-instance v2, La/ih2;

    .line 26
    .line 27
    const/4 v3, 0x2

    .line 28
    const-wide/16 v4, 0x3

    .line 29
    .line 30
    const-string v6, "Tournaments"

    .line 31
    .line 32
    invoke-direct {v2, v6, v3, v4, v5}, La/ih2;-><init>(Ljava/lang/String;IJ)V

    .line 33
    .line 34
    .line 35
    sput-object v2, La/ih2;->d:La/ih2;

    .line 36
    .line 37
    new-instance v3, La/ih2;

    .line 38
    .line 39
    const/4 v4, 0x3

    .line 40
    const-wide/16 v5, 0x4

    .line 41
    .line 42
    const-string v7, "Tracked"

    .line 43
    .line 44
    invoke-direct {v3, v7, v4, v5, v6}, La/ih2;-><init>(Ljava/lang/String;IJ)V

    .line 45
    .line 46
    .line 47
    sput-object v3, La/ih2;->e:La/ih2;

    .line 48
    .line 49
    new-instance v4, La/ih2;

    .line 50
    .line 51
    const/4 v5, 0x4

    .line 52
    const-wide/16 v6, 0x5

    .line 53
    .line 54
    const-string v8, "Viewed"

    .line 55
    .line 56
    invoke-direct {v4, v8, v5, v6, v7}, La/ih2;-><init>(Ljava/lang/String;IJ)V

    .line 57
    .line 58
    .line 59
    sput-object v4, La/ih2;->f:La/ih2;

    .line 60
    .line 61
    filled-new-array {v0, v1, v2, v3, v4}, [La/ih2;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    sput-object v0, La/ih2;->g:[La/ih2;

    .line 66
    .line 67
    new-instance v1, La/c0o;

    .line 68
    .line 69
    invoke-direct {v1, v0}, La/c0o;-><init>([Ljava/lang/Enum;)V

    .line 70
    .line 71
    .line 72
    sput-object v1, La/ih2;->h:La/c0o;

    .line 73
    .line 74
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;IJ)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    long-to-int p1, p3

    .line 5
    iput-byte p1, p0, La/ih2;->a:B

    .line 6
    .line 7
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)La/ih2;
    .locals 1

    .line 1
    const-class v0, La/ih2;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/ih2;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[La/ih2;
    .locals 1

    .line 1
    sget-object v0, La/ih2;->g:[La/ih2;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [La/ih2;

    .line 8
    .line 9
    return-object v0
.end method
