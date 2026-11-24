.class public final enum La/cl40;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum b:La/cl40;

.field public static final enum c:La/cl40;

.field public static final enum d:La/cl40;

.field public static final synthetic e:[La/cl40;

.field public static final synthetic f:La/c0o;


# instance fields
.field public final a:B


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/cl40;

    .line 2
    .line 3
    const-string v1, "BLUE"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    invoke-direct {v0, v1, v2, v3}, La/cl40;-><init>(Ljava/lang/String;II)V

    .line 8
    .line 9
    .line 10
    sput-object v0, La/cl40;->b:La/cl40;

    .line 11
    .line 12
    new-instance v1, La/cl40;

    .line 13
    .line 14
    const-string v4, "RED"

    .line 15
    .line 16
    const/4 v5, 0x2

    .line 17
    invoke-direct {v1, v4, v3, v5}, La/cl40;-><init>(Ljava/lang/String;II)V

    .line 18
    .line 19
    .line 20
    sput-object v1, La/cl40;->c:La/cl40;

    .line 21
    .line 22
    new-instance v3, La/cl40;

    .line 23
    .line 24
    const-string v4, "UNKNOWN"

    .line 25
    .line 26
    invoke-direct {v3, v4, v5, v2}, La/cl40;-><init>(Ljava/lang/String;II)V

    .line 27
    .line 28
    .line 29
    sput-object v3, La/cl40;->d:La/cl40;

    .line 30
    .line 31
    filled-new-array {v0, v1, v3}, [La/cl40;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    sput-object v0, La/cl40;->e:[La/cl40;

    .line 36
    .line 37
    new-instance v1, La/c0o;

    .line 38
    .line 39
    invoke-direct {v1, v0}, La/c0o;-><init>([Ljava/lang/Enum;)V

    .line 40
    .line 41
    .line 42
    sput-object v1, La/cl40;->f:La/c0o;

    .line 43
    .line 44
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-byte p3, p0, La/cl40;->a:B

    .line 5
    .line 6
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)La/cl40;
    .locals 1

    .line 1
    const-class v0, La/cl40;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/cl40;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[La/cl40;
    .locals 1

    .line 1
    sget-object v0, La/cl40;->e:[La/cl40;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [La/cl40;

    .line 8
    .line 9
    return-object v0
.end method
