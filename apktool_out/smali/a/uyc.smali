.class public final enum La/uyc;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final b:La/bj5;

.field public static final enum c:La/uyc;

.field public static final enum d:La/uyc;

.field public static final enum e:La/uyc;

.field public static final synthetic f:[La/uyc;

.field public static final synthetic g:La/c0o;


# instance fields
.field public final a:I


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/uyc;

    .line 2
    .line 3
    const-string v1, "IDLE"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2, v2}, La/uyc;-><init>(Ljava/lang/String;II)V

    .line 7
    .line 8
    .line 9
    sput-object v0, La/uyc;->c:La/uyc;

    .line 10
    .line 11
    new-instance v1, La/uyc;

    .line 12
    .line 13
    const-string v2, "AVAILABLE"

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    invoke-direct {v1, v2, v3, v3}, La/uyc;-><init>(Ljava/lang/String;II)V

    .line 17
    .line 18
    .line 19
    sput-object v1, La/uyc;->d:La/uyc;

    .line 20
    .line 21
    new-instance v2, La/uyc;

    .line 22
    .line 23
    const/4 v3, 0x2

    .line 24
    const/4 v4, -0x1

    .line 25
    const-string v5, "UNAVAILABLE"

    .line 26
    .line 27
    invoke-direct {v2, v5, v3, v4}, La/uyc;-><init>(Ljava/lang/String;II)V

    .line 28
    .line 29
    .line 30
    sput-object v2, La/uyc;->e:La/uyc;

    .line 31
    .line 32
    filled-new-array {v0, v1, v2}, [La/uyc;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    sput-object v0, La/uyc;->f:[La/uyc;

    .line 37
    .line 38
    new-instance v1, La/c0o;

    .line 39
    .line 40
    invoke-direct {v1, v0}, La/c0o;-><init>([Ljava/lang/Enum;)V

    .line 41
    .line 42
    .line 43
    sput-object v1, La/uyc;->g:La/c0o;

    .line 44
    .line 45
    new-instance v0, La/bj5;

    .line 46
    .line 47
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 48
    .line 49
    .line 50
    sput-object v0, La/uyc;->b:La/bj5;

    .line 51
    .line 52
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput p3, p0, La/uyc;->a:I

    .line 5
    .line 6
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)La/uyc;
    .locals 1

    .line 1
    const-class v0, La/uyc;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/uyc;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[La/uyc;
    .locals 1

    .line 1
    sget-object v0, La/uyc;->f:[La/uyc;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [La/uyc;

    .line 8
    .line 9
    return-object v0
.end method
