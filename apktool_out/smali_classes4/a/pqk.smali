.class public abstract La/pqk;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(La/v5l0;Z)La/gqk;
    .locals 6

    .line 1
    sget-object v0, La/q0s;->a:La/q0s;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-eqz p0, :cond_4

    .line 9
    .line 10
    if-eq p0, v1, :cond_3

    .line 11
    .line 12
    const/4 v2, 0x2

    .line 13
    if-eq p0, v2, :cond_2

    .line 14
    .line 15
    const/4 v2, 0x3

    .line 16
    if-eq p0, v2, :cond_1

    .line 17
    .line 18
    const/4 v2, 0x4

    .line 19
    if-ne p0, v2, :cond_0

    .line 20
    .line 21
    sget-object p0, La/h0l0;->a:La/h0l0;

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    invoke-static {}, La/t9f;->b()V

    .line 25
    .line 26
    .line 27
    const/4 p0, 0x0

    .line 28
    return-object p0

    .line 29
    :cond_1
    sget-object p0, La/i0l0;->a:La/i0l0;

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_2
    sget-object p0, La/j0l0;->a:La/j0l0;

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_3
    sget-object p0, La/k0l0;->a:La/k0l0;

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_4
    sget-object p0, La/g0l0;->a:La/g0l0;

    .line 39
    .line 40
    :goto_0
    new-instance v2, La/vb90;

    .line 41
    .line 42
    new-instance v3, La/x56;

    .line 43
    .line 44
    invoke-direct {v3, p0}, La/x56;-><init>(La/l0l0;)V

    .line 45
    .line 46
    .line 47
    new-instance v4, La/x56;

    .line 48
    .line 49
    invoke-direct {v4, p0}, La/x56;-><init>(La/l0l0;)V

    .line 50
    .line 51
    .line 52
    new-instance v5, La/x56;

    .line 53
    .line 54
    invoke-direct {v5, p0}, La/x56;-><init>(La/l0l0;)V

    .line 55
    .line 56
    .line 57
    filled-new-array {v3, v4, v5}, [La/x56;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    invoke-static {p0}, La/dyb;->g0([Ljava/lang/Object;)La/i4;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    const/4 v3, 0x0

    .line 66
    invoke-direct {v2, v0, p0, v3, v1}, La/vb90;-><init>(La/q0s;La/a4x;ZZ)V

    .line 67
    .line 68
    .line 69
    new-instance p0, La/gqk;

    .line 70
    .line 71
    if-eqz p1, :cond_5

    .line 72
    .line 73
    const-string p1, "shimmer_live_events"

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_5
    const-string p1, "shimmer_line_events"

    .line 77
    .line 78
    :goto_1
    sget-object v0, La/w7m;->a:La/w7m;

    .line 79
    .line 80
    sget-object v1, La/l3g;->a:La/l3g;

    .line 81
    .line 82
    invoke-direct {p0, p1, v0, v2, v1}, La/gqk;-><init>(Ljava/lang/String;La/b8m;La/vb90;La/m3g;)V

    .line 83
    .line 84
    .line 85
    return-object p0
.end method
