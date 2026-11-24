.class public abstract La/m5k0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:La/nul0;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x7

    .line 3
    const/4 v2, 0x0

    .line 4
    invoke-static {v2, v2, v0, v1}, La/ro4;->g0(FFLjava/lang/Object;I)La/nul0;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    sput-object v0, La/m5k0;->a:La/nul0;

    .line 9
    .line 10
    return-void
.end method

.method public static final a(J)La/t33;
    .locals 4

    .line 1
    new-instance v0, La/t33;

    .line 2
    .line 3
    new-instance v1, La/y3d;

    .line 4
    .line 5
    invoke-direct {v1, p0, p1}, La/y3d;-><init>(J)V

    .line 6
    .line 7
    .line 8
    invoke-static {p0, p1}, La/y3d;->f(J)La/y4d;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    sget-object p1, La/qja;->j:La/qja;

    .line 13
    .line 14
    new-instance v2, La/s43;

    .line 15
    .line 16
    const/4 v3, 0x2

    .line 17
    invoke-direct {v2, p0, v3}, La/s43;-><init>(Ljava/lang/Object;B)V

    .line 18
    .line 19
    .line 20
    new-instance p0, La/lxs0;

    .line 21
    .line 22
    invoke-direct {p0, p1, v2}, La/lxs0;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 23
    .line 24
    .line 25
    const/4 p1, 0x0

    .line 26
    const/16 v2, 0xc

    .line 27
    .line 28
    invoke-direct {v0, v1, p0, p1, v2}, La/t33;-><init>(Ljava/lang/Object;La/lxs0;Ljava/lang/Object;I)V

    .line 29
    .line 30
    .line 31
    return-object v0
.end method

.method public static final b(JLa/j73;La/fet;II)La/l7m0;
    .locals 9

    .line 1
    and-int/lit8 v0, p5, 0x2

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object p2, La/m5k0;->a:La/nul0;

    .line 6
    .line 7
    :cond_0
    move-object v2, p2

    .line 8
    and-int/lit8 p2, p5, 0x4

    .line 9
    .line 10
    if-eqz p2, :cond_1

    .line 11
    .line 12
    const-string p2, "ColorAnimation"

    .line 13
    .line 14
    :goto_0
    move-object v4, p2

    .line 15
    goto :goto_1

    .line 16
    :cond_1
    const-string p2, "PopularIconColor"

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :goto_1
    invoke-static {p0, p1}, La/y3d;->f(J)La/y4d;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    invoke-virtual {p3, p2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result p2

    .line 27
    invoke-virtual {p3}, La/fet;->P()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p5

    .line 31
    if-nez p2, :cond_2

    .line 32
    .line 33
    sget-object p2, La/ukd;->a:La/cl5;

    .line 34
    .line 35
    if-ne p5, p2, :cond_3

    .line 36
    .line 37
    :cond_2
    invoke-static {p0, p1}, La/y3d;->f(J)La/y4d;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    sget-object p5, La/qja;->j:La/qja;

    .line 42
    .line 43
    new-instance v0, La/s43;

    .line 44
    .line 45
    const/4 v1, 0x2

    .line 46
    invoke-direct {v0, p2, v1}, La/s43;-><init>(Ljava/lang/Object;B)V

    .line 47
    .line 48
    .line 49
    invoke-static {p5, v0, p3}, La/kng0;->d(La/qja;La/s43;La/fet;)La/lxs0;

    .line 50
    .line 51
    .line 52
    move-result-object p5

    .line 53
    :cond_3
    move-object v1, p5

    .line 54
    check-cast v1, La/lxs0;

    .line 55
    .line 56
    new-instance v0, La/y3d;

    .line 57
    .line 58
    invoke-direct {v0, p0, p1}, La/y3d;-><init>(J)V

    .line 59
    .line 60
    .line 61
    and-int/lit8 p0, p4, 0xe

    .line 62
    .line 63
    shl-int/lit8 p1, p4, 0x3

    .line 64
    .line 65
    and-int/lit16 p1, p1, 0x380

    .line 66
    .line 67
    or-int/2addr p0, p1

    .line 68
    shl-int/lit8 p1, p4, 0x6

    .line 69
    .line 70
    const p2, 0xe000

    .line 71
    .line 72
    .line 73
    and-int/2addr p2, p1

    .line 74
    or-int/2addr p0, p2

    .line 75
    const/high16 p2, 0x70000

    .line 76
    .line 77
    and-int/2addr p1, p2

    .line 78
    or-int v7, p0, p1

    .line 79
    .line 80
    const/16 v8, 0x8

    .line 81
    .line 82
    const/4 v3, 0x0

    .line 83
    const/4 v5, 0x0

    .line 84
    move-object v6, p3

    .line 85
    invoke-static/range {v0 .. v8}, La/d43;->c(Ljava/lang/Object;La/lxs0;La/j73;Ljava/lang/Float;Ljava/lang/String;Lkotlin/jvm/functions/Function1;La/fet;II)La/l7m0;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    return-object p0
.end method
