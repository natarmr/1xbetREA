.class public abstract La/lcg0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:La/zfn;

.field public static final b:La/ncg0;

.field public static final c:La/ncg0;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/j6g0;

    .line 2
    .line 3
    const/16 v1, 0xd

    .line 4
    .line 5
    invoke-direct {v0, v1}, La/j6g0;-><init>(B)V

    .line 6
    .line 7
    .line 8
    new-instance v1, La/zfn;

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    invoke-direct {v1, v0, v2}, La/zfn;-><init>(Lkotlin/jvm/functions/Function0;B)V

    .line 12
    .line 13
    .line 14
    sput-object v1, La/lcg0;->a:La/zfn;

    .line 15
    .line 16
    new-instance v0, La/ncg0;

    .line 17
    .line 18
    sget-wide v1, La/y3d;->g:J

    .line 19
    .line 20
    const/4 v3, 0x1

    .line 21
    const/high16 v4, 0x7fc00000    # Float.NaN

    .line 22
    .line 23
    invoke-direct {v0, v3, v4, v1, v2}, La/ncg0;-><init>(ZFJ)V

    .line 24
    .line 25
    .line 26
    sput-object v0, La/lcg0;->b:La/ncg0;

    .line 27
    .line 28
    new-instance v0, La/ncg0;

    .line 29
    .line 30
    const/4 v3, 0x0

    .line 31
    invoke-direct {v0, v3, v4, v1, v2}, La/ncg0;-><init>(ZFJ)V

    .line 32
    .line 33
    .line 34
    sput-object v0, La/lcg0;->c:La/ncg0;

    .line 35
    .line 36
    return-void
.end method

.method public static a(FI)La/ncg0;
    .locals 4

    .line 1
    and-int/lit8 v0, p1, 0x1

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    :goto_0
    and-int/lit8 p1, p1, 0x2

    .line 9
    .line 10
    const/high16 v1, 0x7fc00000    # Float.NaN

    .line 11
    .line 12
    if-eqz p1, :cond_1

    .line 13
    .line 14
    move p0, v1

    .line 15
    :cond_1
    sget-wide v2, La/y3d;->g:J

    .line 16
    .line 17
    invoke-static {p0, v1}, La/ycl;->b(FF)Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    if-eqz p1, :cond_3

    .line 22
    .line 23
    invoke-static {v2, v3, v2, v3}, La/h2t0;->a(JJ)Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    if-eqz p1, :cond_3

    .line 28
    .line 29
    if-eqz v0, :cond_2

    .line 30
    .line 31
    sget-object p0, La/lcg0;->b:La/ncg0;

    .line 32
    .line 33
    return-object p0

    .line 34
    :cond_2
    sget-object p0, La/lcg0;->c:La/ncg0;

    .line 35
    .line 36
    return-object p0

    .line 37
    :cond_3
    new-instance p1, La/ncg0;

    .line 38
    .line 39
    invoke-direct {p1, v0, p0, v2, v3}, La/ncg0;-><init>(ZFJ)V

    .line 40
    .line 41
    .line 42
    return-object p1
.end method
