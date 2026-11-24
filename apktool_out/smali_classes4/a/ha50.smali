.class public final enum La/ha50;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum b:La/ha50;

.field public static final enum c:La/ha50;

.field public static final synthetic d:[La/ha50;


# instance fields
.field public final a:B


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/ha50;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x2

    .line 5
    const-string v3, "TWO_LINES"

    .line 6
    .line 7
    invoke-direct {v0, v3, v1, v2}, La/ha50;-><init>(Ljava/lang/String;II)V

    .line 8
    .line 9
    .line 10
    sput-object v0, La/ha50;->b:La/ha50;

    .line 11
    .line 12
    new-instance v1, La/ha50;

    .line 13
    .line 14
    const/4 v2, 0x1

    .line 15
    const/4 v3, 0x3

    .line 16
    const-string v4, "THREE_LINES"

    .line 17
    .line 18
    invoke-direct {v1, v4, v2, v3}, La/ha50;-><init>(Ljava/lang/String;II)V

    .line 19
    .line 20
    .line 21
    sput-object v1, La/ha50;->c:La/ha50;

    .line 22
    .line 23
    filled-new-array {v0, v1}, [La/ha50;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    sput-object v0, La/ha50;->d:[La/ha50;

    .line 28
    .line 29
    new-instance v0, La/c0o;

    .line 30
    .line 31
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-byte p3, p0, La/ha50;->a:B

    .line 5
    .line 6
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)La/ha50;
    .locals 1

    .line 1
    const-class v0, La/ha50;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/ha50;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[La/ha50;
    .locals 1

    .line 1
    sget-object v0, La/ha50;->d:[La/ha50;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [La/ha50;

    .line 8
    .line 9
    return-object v0
.end method
