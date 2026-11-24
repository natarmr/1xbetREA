.class public final La/ip80;
.super La/lm40;
.source "SourceFile"

# interfaces
.implements La/v6z;
.implements La/vld;


# instance fields
.field public o:La/vhv0;


# virtual methods
.method public final c(La/vj30;La/pj30;J)La/uj30;
    .locals 3

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La/ip80;->o:La/vhv0;

    .line 5
    .line 6
    invoke-interface {v0, p1}, La/vhv0;->b(La/w6k;)I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, 0x0

    .line 11
    if-lez v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    sget-object v0, La/dy2;->f:La/zfn;

    .line 15
    .line 16
    invoke-static {p0, v0}, La/mbc;->R(La/vld;Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    check-cast p0, Landroid/view/View;

    .line 21
    .line 22
    sget-object v0, La/rgu0;->a:Ljava/util/WeakHashMap;

    .line 23
    .line 24
    invoke-static {p0}, La/jgu0;->a(Landroid/view/View;)La/xiv0;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    if-eqz p0, :cond_1

    .line 29
    .line 30
    const/4 v0, 0x2

    .line 31
    iget-object p0, p0, La/xiv0;->a:La/uiv0;

    .line 32
    .line 33
    invoke-virtual {p0, v0}, La/uiv0;->i(I)La/pfx;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    if-eqz p0, :cond_1

    .line 38
    .line 39
    iget v0, p0, La/pfx;->d:I

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    move v0, v1

    .line 43
    :goto_0
    neg-int p0, v0

    .line 44
    invoke-static {v1, p0, p3, p4}, La/r4e;->i(IIJ)J

    .line 45
    .line 46
    .line 47
    move-result-wide v1

    .line 48
    invoke-interface {p2, v1, v2}, La/pj30;->S(J)La/pu90;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    iget p2, p0, La/pu90;->b:I

    .line 53
    .line 54
    add-int/2addr p2, v0

    .line 55
    invoke-static {p2, p3, p4}, La/r4e;->f(IJ)I

    .line 56
    .line 57
    .line 58
    move-result p2

    .line 59
    iget p3, p0, La/pu90;->a:I

    .line 60
    .line 61
    new-instance p4, La/cam;

    .line 62
    .line 63
    const/16 v0, 0x11

    .line 64
    .line 65
    invoke-direct {p4, p0, v0}, La/cam;-><init>(La/pu90;B)V

    .line 66
    .line 67
    .line 68
    invoke-static {p1, p3, p2, p4}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    return-object p0
.end method
