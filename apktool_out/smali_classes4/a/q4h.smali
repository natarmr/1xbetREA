.class public abstract La/q4h;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/util/List;

.field public static final b:Ljava/util/List;

.field public static final c:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    sget-object v0, La/x510;->e:La/x510;

    .line 2
    .line 3
    sget-object v1, La/x510;->f:La/x510;

    .line 4
    .line 5
    filled-new-array {v0, v1}, [La/x510;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    sput-object v0, La/q4h;->a:Ljava/util/List;

    .line 14
    .line 15
    new-instance v0, La/s1h;

    .line 16
    .line 17
    const-wide/16 v1, 0x7

    .line 18
    .line 19
    invoke-direct {v0, v1, v2}, La/u1h;-><init>(J)V

    .line 20
    .line 21
    .line 22
    new-instance v1, La/r1h;

    .line 23
    .line 24
    const-wide/16 v2, 0x8

    .line 25
    .line 26
    invoke-direct {v1, v2, v3}, La/u1h;-><init>(J)V

    .line 27
    .line 28
    .line 29
    new-instance v2, La/t1h;

    .line 30
    .line 31
    const-wide/16 v3, 0x9

    .line 32
    .line 33
    invoke-direct {v2, v3, v4}, La/u1h;-><init>(J)V

    .line 34
    .line 35
    .line 36
    const/4 v3, 0x3

    .line 37
    new-array v3, v3, [La/u1h;

    .line 38
    .line 39
    const/4 v4, 0x0

    .line 40
    aput-object v0, v3, v4

    .line 41
    .line 42
    const/4 v0, 0x1

    .line 43
    aput-object v1, v3, v0

    .line 44
    .line 45
    const/4 v1, 0x2

    .line 46
    aput-object v2, v3, v1

    .line 47
    .line 48
    invoke-static {v3}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    sput-object v2, La/q4h;->b:Ljava/util/List;

    .line 53
    .line 54
    new-instance v2, La/p2g;

    .line 55
    .line 56
    const-wide/16 v5, 0x5

    .line 57
    .line 58
    invoke-direct {v2, v5, v6}, La/r2g;-><init>(J)V

    .line 59
    .line 60
    .line 61
    new-instance v3, La/q2g;

    .line 62
    .line 63
    const-wide/16 v5, 0x6

    .line 64
    .line 65
    invoke-direct {v3, v5, v6}, La/r2g;-><init>(J)V

    .line 66
    .line 67
    .line 68
    new-array v1, v1, [La/r2g;

    .line 69
    .line 70
    aput-object v2, v1, v4

    .line 71
    .line 72
    aput-object v3, v1, v0

    .line 73
    .line 74
    invoke-static {v1}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    sput-object v0, La/q4h;->c:Ljava/util/List;

    .line 79
    .line 80
    return-void
.end method
