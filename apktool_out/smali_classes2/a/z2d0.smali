.class public final enum La/z2d0;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements La/vlx;


# static fields
.field public static final enum b:La/z2d0;

.field public static final enum c:La/z2d0;

.field public static final enum d:La/z2d0;

.field public static final enum e:La/z2d0;

.field public static final synthetic f:[La/z2d0;


# instance fields
.field public final a:B


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/z2d0;

    .line 2
    .line 3
    const-string v1, "RETURNS_CONSTANT"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2, v2}, La/z2d0;-><init>(Ljava/lang/String;II)V

    .line 7
    .line 8
    .line 9
    sput-object v0, La/z2d0;->b:La/z2d0;

    .line 10
    .line 11
    new-instance v1, La/z2d0;

    .line 12
    .line 13
    const-string v2, "CALLS"

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    invoke-direct {v1, v2, v3, v3}, La/z2d0;-><init>(Ljava/lang/String;II)V

    .line 17
    .line 18
    .line 19
    sput-object v1, La/z2d0;->c:La/z2d0;

    .line 20
    .line 21
    new-instance v2, La/z2d0;

    .line 22
    .line 23
    const-string v3, "RETURNS_NOT_NULL"

    .line 24
    .line 25
    const/4 v4, 0x2

    .line 26
    invoke-direct {v2, v3, v4, v4}, La/z2d0;-><init>(Ljava/lang/String;II)V

    .line 27
    .line 28
    .line 29
    sput-object v2, La/z2d0;->d:La/z2d0;

    .line 30
    .line 31
    new-instance v3, La/z2d0;

    .line 32
    .line 33
    const-string v4, "RETURNS_RESULT_OF"

    .line 34
    .line 35
    const/4 v5, 0x3

    .line 36
    invoke-direct {v3, v4, v5, v5}, La/z2d0;-><init>(Ljava/lang/String;II)V

    .line 37
    .line 38
    .line 39
    sput-object v3, La/z2d0;->e:La/z2d0;

    .line 40
    .line 41
    filled-new-array {v0, v1, v2, v3}, [La/z2d0;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    sput-object v0, La/z2d0;->f:[La/z2d0;

    .line 46
    .line 47
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-byte p3, p0, La/z2d0;->a:B

    .line 5
    .line 6
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)La/z2d0;
    .locals 1

    .line 1
    const-class v0, La/z2d0;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/z2d0;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[La/z2d0;
    .locals 1

    .line 1
    sget-object v0, La/z2d0;->f:[La/z2d0;

    .line 2
    .line 3
    invoke-virtual {v0}, [La/z2d0;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [La/z2d0;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public final a()I
    .locals 0

    .line 1
    iget-byte p0, p0, La/z2d0;->a:B

    .line 2
    .line 3
    return p0
.end method
