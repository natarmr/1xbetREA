.class public final La/g9z;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:La/cgk0;

.field public b:La/cgk0;


# direct methods
.method public static synthetic b(La/g9z;La/mm40;La/nul0;I)La/mm40;
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    const/high16 v1, 0x43c80000    # 400.0f

    .line 3
    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x5

    .line 6
    invoke-static {v0, v1, v2, v3}, La/ro4;->g0(FFLjava/lang/Object;I)La/nul0;

    .line 7
    .line 8
    .line 9
    move-result-object v4

    .line 10
    and-int/lit8 p3, p3, 0x2

    .line 11
    .line 12
    if-eqz p3, :cond_0

    .line 13
    .line 14
    sget-object p2, La/quu0;->a:Ljava/util/Map;

    .line 15
    .line 16
    new-instance p2, La/ikx;

    .line 17
    .line 18
    const-wide v5, 0x100000001L

    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    invoke-direct {p2, v5, v6}, La/ikx;-><init>(J)V

    .line 24
    .line 25
    .line 26
    const/4 p3, 0x1

    .line 27
    invoke-static {v0, v1, p2, p3}, La/ro4;->g0(FFLjava/lang/Object;I)La/nul0;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    :cond_0
    invoke-static {v0, v1, v2, v3}, La/ro4;->g0(FFLjava/lang/Object;I)La/nul0;

    .line 32
    .line 33
    .line 34
    move-result-object p3

    .line 35
    invoke-virtual {p0, p1, v4, p2, p3}, La/g9z;->a(La/mm40;La/cfq;La/cfq;La/cfq;)La/mm40;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0
.end method

.method public static c(La/g9z;)La/mm40;
    .locals 3

    .line 1
    iget-object v0, p0, La/g9z;->a:La/cgk0;

    .line 2
    .line 3
    iget-object p0, p0, La/g9z;->b:La/cgk0;

    .line 4
    .line 5
    new-instance v1, La/lp80;

    .line 6
    .line 7
    const/high16 v2, 0x3f800000    # 1.0f

    .line 8
    .line 9
    invoke-direct {v1, v2, v0, p0}, La/lp80;-><init>(FLa/l7m0;La/l7m0;)V

    .line 10
    .line 11
    .line 12
    return-object v1
.end method

.method public static synthetic e(La/g9z;)La/mm40;
    .locals 1

    .line 1
    const/high16 v0, 0x3f800000    # 1.0f

    .line 2
    .line 3
    invoke-virtual {p0, v0}, La/g9z;->d(F)La/mm40;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method


# virtual methods
.method public final a(La/mm40;La/cfq;La/cfq;La/cfq;)La/mm40;
    .locals 0

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    if-nez p3, :cond_0

    .line 4
    .line 5
    if-nez p4, :cond_0

    .line 6
    .line 7
    return-object p1

    .line 8
    :cond_0
    new-instance p0, La/naz;

    .line 9
    .line 10
    invoke-direct {p0, p2, p3, p4}, La/naz;-><init>(La/cfq;La/cfq;La/cfq;)V

    .line 11
    .line 12
    .line 13
    invoke-interface {p1, p0}, La/mm40;->e(La/mm40;)La/mm40;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final d(F)La/mm40;
    .locals 3

    .line 1
    iget-object p0, p0, La/g9z;->a:La/cgk0;

    .line 2
    .line 3
    new-instance v0, La/lp80;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x4

    .line 7
    invoke-direct {v0, p1, p0, v1, v2}, La/lp80;-><init>(FLa/l7m0;La/l7m0;I)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method
