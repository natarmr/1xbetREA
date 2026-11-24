.class public final enum La/vj40;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final synthetic b:[La/vj40;

.field public static final synthetic c:La/c0o;


# instance fields
.field public final a:B


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/vj40;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-wide/16 v2, 0x1

    .line 5
    .line 6
    const-string v4, "STATISTIC"

    .line 7
    .line 8
    invoke-direct {v0, v4, v1, v2, v3}, La/vj40;-><init>(Ljava/lang/String;IJ)V

    .line 9
    .line 10
    .line 11
    new-instance v1, La/vj40;

    .line 12
    .line 13
    const/4 v2, 0x1

    .line 14
    const-wide/16 v3, 0x2

    .line 15
    .line 16
    const-string v5, "ITEMS"

    .line 17
    .line 18
    invoke-direct {v1, v5, v2, v3, v4}, La/vj40;-><init>(Ljava/lang/String;IJ)V

    .line 19
    .line 20
    .line 21
    filled-new-array {v0, v1}, [La/vj40;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    sput-object v0, La/vj40;->b:[La/vj40;

    .line 26
    .line 27
    new-instance v1, La/c0o;

    .line 28
    .line 29
    invoke-direct {v1, v0}, La/c0o;-><init>([Ljava/lang/Enum;)V

    .line 30
    .line 31
    .line 32
    sput-object v1, La/vj40;->c:La/c0o;

    .line 33
    .line 34
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
    iput-byte p1, p0, La/vj40;->a:B

    .line 6
    .line 7
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)La/vj40;
    .locals 1

    .line 1
    const-class v0, La/vj40;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/vj40;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[La/vj40;
    .locals 1

    .line 1
    sget-object v0, La/vj40;->b:[La/vj40;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [La/vj40;

    .line 8
    .line 9
    return-object v0
.end method
