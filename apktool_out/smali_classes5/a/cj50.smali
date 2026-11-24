.class public final enum La/cj50;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final b:La/evz;

.field public static final enum c:La/cj50;

.field public static final enum d:La/cj50;

.field public static final enum e:La/cj50;

.field public static final enum f:La/cj50;

.field public static final synthetic g:[La/cj50;

.field public static final synthetic h:La/c0o;


# instance fields
.field public final a:J


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 1
    new-instance v0, La/cj50;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-wide/16 v2, 0x1a

    .line 5
    .line 6
    const-string v4, "YELLOW_CARDS"

    .line 7
    .line 8
    invoke-direct {v0, v4, v1, v2, v3}, La/cj50;-><init>(Ljava/lang/String;IJ)V

    .line 9
    .line 10
    .line 11
    sput-object v0, La/cj50;->c:La/cj50;

    .line 12
    .line 13
    new-instance v1, La/cj50;

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    const-wide/16 v3, 0x47

    .line 17
    .line 18
    const-string v5, "RED_CARDS"

    .line 19
    .line 20
    invoke-direct {v1, v5, v2, v3, v4}, La/cj50;-><init>(Ljava/lang/String;IJ)V

    .line 21
    .line 22
    .line 23
    sput-object v1, La/cj50;->d:La/cj50;

    .line 24
    .line 25
    new-instance v2, La/cj50;

    .line 26
    .line 27
    const/4 v3, 0x2

    .line 28
    const-wide/16 v4, 0x46

    .line 29
    .line 30
    const-string v6, "CORNERS"

    .line 31
    .line 32
    invoke-direct {v2, v6, v3, v4, v5}, La/cj50;-><init>(Ljava/lang/String;IJ)V

    .line 33
    .line 34
    .line 35
    sput-object v2, La/cj50;->e:La/cj50;

    .line 36
    .line 37
    new-instance v3, La/cj50;

    .line 38
    .line 39
    const/4 v4, 0x3

    .line 40
    const-wide/16 v5, -0x1

    .line 41
    .line 42
    const-string v7, "UNKNOWN"

    .line 43
    .line 44
    invoke-direct {v3, v7, v4, v5, v6}, La/cj50;-><init>(Ljava/lang/String;IJ)V

    .line 45
    .line 46
    .line 47
    sput-object v3, La/cj50;->f:La/cj50;

    .line 48
    .line 49
    filled-new-array {v0, v1, v2, v3}, [La/cj50;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    sput-object v0, La/cj50;->g:[La/cj50;

    .line 54
    .line 55
    new-instance v1, La/c0o;

    .line 56
    .line 57
    invoke-direct {v1, v0}, La/c0o;-><init>([Ljava/lang/Enum;)V

    .line 58
    .line 59
    .line 60
    sput-object v1, La/cj50;->h:La/c0o;

    .line 61
    .line 62
    new-instance v0, La/evz;

    .line 63
    .line 64
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 65
    .line 66
    .line 67
    sput-object v0, La/cj50;->b:La/evz;

    .line 68
    .line 69
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;IJ)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-wide p3, p0, La/cj50;->a:J

    .line 5
    .line 6
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)La/cj50;
    .locals 1

    .line 1
    const-class v0, La/cj50;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/cj50;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[La/cj50;
    .locals 1

    .line 1
    sget-object v0, La/cj50;->g:[La/cj50;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [La/cj50;

    .line 8
    .line 9
    return-object v0
.end method
