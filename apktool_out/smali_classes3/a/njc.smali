.class public final enum La/njc;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final b:La/gl5;

.field public static final enum c:La/njc;

.field public static final enum d:La/njc;

.field public static final enum e:La/njc;

.field public static final enum f:La/njc;

.field public static final synthetic g:[La/njc;


# instance fields
.field public final a:F


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, La/njc;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/high16 v2, -0x3d4c0000    # -90.0f

    .line 5
    .line 6
    const-string v3, "TOP"

    .line 7
    .line 8
    invoke-direct {v0, v2, v1, v3}, La/njc;-><init>(FILjava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sput-object v0, La/njc;->c:La/njc;

    .line 12
    .line 13
    new-instance v1, La/njc;

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    const/high16 v3, -0x3ccc0000    # -180.0f

    .line 17
    .line 18
    const-string v4, "LEFT"

    .line 19
    .line 20
    invoke-direct {v1, v3, v2, v4}, La/njc;-><init>(FILjava/lang/String;)V

    .line 21
    .line 22
    .line 23
    sput-object v1, La/njc;->d:La/njc;

    .line 24
    .line 25
    new-instance v2, La/njc;

    .line 26
    .line 27
    const/4 v3, 0x2

    .line 28
    const/4 v4, 0x0

    .line 29
    const-string v5, "RIGHT"

    .line 30
    .line 31
    invoke-direct {v2, v4, v3, v5}, La/njc;-><init>(FILjava/lang/String;)V

    .line 32
    .line 33
    .line 34
    sput-object v2, La/njc;->e:La/njc;

    .line 35
    .line 36
    new-instance v3, La/njc;

    .line 37
    .line 38
    const/4 v4, 0x3

    .line 39
    const/high16 v5, -0x3c790000    # -270.0f

    .line 40
    .line 41
    const-string v6, "BOTTOM"

    .line 42
    .line 43
    invoke-direct {v3, v5, v4, v6}, La/njc;-><init>(FILjava/lang/String;)V

    .line 44
    .line 45
    .line 46
    sput-object v3, La/njc;->f:La/njc;

    .line 47
    .line 48
    filled-new-array {v0, v1, v2, v3}, [La/njc;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    sput-object v0, La/njc;->g:[La/njc;

    .line 53
    .line 54
    new-instance v0, La/c0o;

    .line 55
    .line 56
    new-instance v0, La/gl5;

    .line 57
    .line 58
    const/16 v1, 0x19

    .line 59
    .line 60
    invoke-direct {v0, v1}, La/gl5;-><init>(B)V

    .line 61
    .line 62
    .line 63
    sput-object v0, La/njc;->b:La/gl5;

    .line 64
    .line 65
    return-void
.end method

.method public constructor <init>(FILjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p3, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput p1, p0, La/njc;->a:F

    .line 5
    .line 6
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)La/njc;
    .locals 1

    .line 1
    const-class v0, La/njc;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/njc;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[La/njc;
    .locals 1

    .line 1
    sget-object v0, La/njc;->g:[La/njc;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [La/njc;

    .line 8
    .line 9
    return-object v0
.end method
