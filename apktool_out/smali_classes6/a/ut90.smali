.class public final enum La/ut90;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum c:La/ut90;

.field public static final enum d:La/ut90;

.field public static final enum e:La/ut90;

.field public static final synthetic f:[La/ut90;


# instance fields
.field public final a:F

.field public final b:F


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, La/ut90;

    .line 2
    .line 3
    sget-object v1, La/qmk;->a:La/zcl;

    .line 4
    .line 5
    const/high16 v1, 0x41c00000    # 24.0f

    .line 6
    .line 7
    const-string v2, "Small"

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    invoke-direct {v0, v2, v3, v1, v1}, La/ut90;-><init>(Ljava/lang/String;IFF)V

    .line 11
    .line 12
    .line 13
    sput-object v0, La/ut90;->c:La/ut90;

    .line 14
    .line 15
    new-instance v1, La/ut90;

    .line 16
    .line 17
    const-string v2, "Medium"

    .line 18
    .line 19
    const/4 v3, 0x1

    .line 20
    const/high16 v4, 0x42000000    # 32.0f

    .line 21
    .line 22
    invoke-direct {v1, v2, v3, v4, v4}, La/ut90;-><init>(Ljava/lang/String;IFF)V

    .line 23
    .line 24
    .line 25
    sput-object v1, La/ut90;->d:La/ut90;

    .line 26
    .line 27
    new-instance v2, La/ut90;

    .line 28
    .line 29
    const/4 v3, 0x2

    .line 30
    const/high16 v5, 0x42600000    # 56.0f

    .line 31
    .line 32
    const-string v6, "Rectangle"

    .line 33
    .line 34
    invoke-direct {v2, v6, v3, v5, v4}, La/ut90;-><init>(Ljava/lang/String;IFF)V

    .line 35
    .line 36
    .line 37
    sput-object v2, La/ut90;->e:La/ut90;

    .line 38
    .line 39
    filled-new-array {v0, v1, v2}, [La/ut90;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    sput-object v0, La/ut90;->f:[La/ut90;

    .line 44
    .line 45
    new-instance v0, La/c0o;

    .line 46
    .line 47
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;IFF)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput p3, p0, La/ut90;->a:F

    .line 5
    .line 6
    iput p4, p0, La/ut90;->b:F

    .line 7
    .line 8
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)La/ut90;
    .locals 1

    .line 1
    const-class v0, La/ut90;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/ut90;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[La/ut90;
    .locals 1

    .line 1
    sget-object v0, La/ut90;->f:[La/ut90;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [La/ut90;

    .line 8
    .line 9
    return-object v0
.end method
