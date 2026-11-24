.class public final La/j6u0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/r34;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, La/r34;

    .line 5
    .line 6
    const/4 v1, 0x3

    .line 7
    invoke-direct {v0, v1}, La/r34;-><init>(B)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, La/j6u0;->a:La/r34;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final a(J)J
    .locals 2

    .line 1
    invoke-static {p1, p2}, La/g6u0;->b(J)F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    cmpl-float v0, v0, v1

    .line 7
    .line 8
    if-lez v0, :cond_0

    .line 9
    .line 10
    invoke-static {p1, p2}, La/g6u0;->c(J)F

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    cmpl-float v0, v0, v1

    .line 15
    .line 16
    if-lez v0, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    invoke-static {p1, p2}, La/g6u0;->g(J)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    const-string v1, "maximumVelocity should be a positive value. You specified="

    .line 24
    .line 25
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-static {v0}, La/xcx;->b(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    :goto_0
    iget-object p0, p0, La/j6u0;->a:La/r34;

    .line 33
    .line 34
    iget-object v0, p0, La/r34;->b:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v0, La/i6u0;

    .line 37
    .line 38
    invoke-static {p1, p2}, La/g6u0;->b(J)F

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    invoke-virtual {v0, v1}, La/i6u0;->c(F)F

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    iget-object p0, p0, La/r34;->c:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast p0, La/i6u0;

    .line 49
    .line 50
    invoke-static {p1, p2}, La/g6u0;->c(J)F

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    invoke-virtual {p0, p1}, La/i6u0;->c(F)F

    .line 55
    .line 56
    .line 57
    move-result p0

    .line 58
    invoke-static {v0, p0}, La/wpm0;->g(FF)J

    .line 59
    .line 60
    .line 61
    move-result-wide p0

    .line 62
    return-wide p0
.end method
