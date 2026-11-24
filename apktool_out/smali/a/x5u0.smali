.class public final La/x5u0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/p5u0;


# instance fields
.field public final synthetic a:La/q5u0;


# direct methods
.method public constructor <init>(FFLa/t73;)V
    .locals 1

    .line 1
    sget-object v0, La/m5u0;->a:[I

    .line 2
    .line 3
    if-nez p3, :cond_0

    .line 4
    .line 5
    const/high16 v0, 0x3f800000    # 1.0f

    .line 6
    .line 7
    cmpg-float v0, p1, v0

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    const v0, 0x44bb8000    # 1500.0f

    .line 12
    .line 13
    .line 14
    cmpg-float v0, p2, v0

    .line 15
    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    sget-object p1, La/pxj;->a:La/pxj;

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    if-eqz p3, :cond_1

    .line 22
    .line 23
    new-instance v0, La/owp0;

    .line 24
    .line 25
    invoke-direct {v0, p1, p2, p3}, La/owp0;-><init>(FFLa/t73;)V

    .line 26
    .line 27
    .line 28
    move-object p1, v0

    .line 29
    goto :goto_0

    .line 30
    :cond_1
    new-instance p3, La/w4p0;

    .line 31
    .line 32
    invoke-direct {p3, p1, p2}, La/w4p0;-><init>(FF)V

    .line 33
    .line 34
    .line 35
    move-object p1, p3

    .line 36
    :goto_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    .line 38
    .line 39
    new-instance p2, La/q5u0;

    .line 40
    .line 41
    invoke-direct {p2, p1}, La/q5u0;-><init>(La/u73;)V

    .line 42
    .line 43
    .line 44
    iput-object p2, p0, La/x5u0;->a:La/q5u0;

    .line 45
    .line 46
    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final b(La/t73;La/t73;La/t73;)J
    .locals 0

    .line 1
    iget-object p0, p0, La/x5u0;->a:La/q5u0;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3}, La/q5u0;->b(La/t73;La/t73;La/t73;)J

    .line 4
    .line 5
    .line 6
    move-result-wide p0

    .line 7
    return-wide p0
.end method

.method public final c(JLa/t73;La/t73;La/t73;)La/t73;
    .locals 0

    .line 1
    iget-object p0, p0, La/x5u0;->a:La/q5u0;

    .line 2
    .line 3
    invoke-virtual/range {p0 .. p5}, La/q5u0;->c(JLa/t73;La/t73;La/t73;)La/t73;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final g(La/t73;La/t73;La/t73;)La/t73;
    .locals 0

    .line 1
    iget-object p0, p0, La/x5u0;->a:La/q5u0;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3}, La/q5u0;->g(La/t73;La/t73;La/t73;)La/t73;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final h(JLa/t73;La/t73;La/t73;)La/t73;
    .locals 0

    .line 1
    iget-object p0, p0, La/x5u0;->a:La/q5u0;

    .line 2
    .line 3
    invoke-virtual/range {p0 .. p5}, La/q5u0;->h(JLa/t73;La/t73;La/t73;)La/t73;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method
