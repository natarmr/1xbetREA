.class public final enum La/mi0;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum b:La/mi0;

.field public static final enum c:La/mi0;

.field public static final synthetic d:[La/mi0;


# instance fields
.field public final a:B


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/mi0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x2

    .line 5
    const-string v3, "MY_AGGREGATOR"

    .line 6
    .line 7
    invoke-direct {v0, v3, v1, v2}, La/mi0;-><init>(Ljava/lang/String;II)V

    .line 8
    .line 9
    .line 10
    sput-object v0, La/mi0;->b:La/mi0;

    .line 11
    .line 12
    new-instance v1, La/mi0;

    .line 13
    .line 14
    const/4 v2, 0x1

    .line 15
    const/4 v3, 0x3

    .line 16
    const-string v4, "MY_VIRTUAL"

    .line 17
    .line 18
    invoke-direct {v1, v4, v2, v3}, La/mi0;-><init>(Ljava/lang/String;II)V

    .line 19
    .line 20
    .line 21
    sput-object v1, La/mi0;->c:La/mi0;

    .line 22
    .line 23
    filled-new-array {v0, v1}, [La/mi0;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    sput-object v0, La/mi0;->d:[La/mi0;

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
    iput-byte p3, p0, La/mi0;->a:B

    .line 5
    .line 6
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)La/mi0;
    .locals 1

    .line 1
    const-class v0, La/mi0;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/mi0;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[La/mi0;
    .locals 1

    .line 1
    sget-object v0, La/mi0;->d:[La/mi0;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [La/mi0;

    .line 8
    .line 9
    return-object v0
.end method
