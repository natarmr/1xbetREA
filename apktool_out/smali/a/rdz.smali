.class public final La/rdz;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xbz;


# instance fields
.field public final synthetic a:La/d9z;


# direct methods
.method public constructor <init>(La/d9z;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/rdz;->a:La/d9z;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    .line 1
    iget-object p0, p0, La/rdz;->a:La/d9z;

    .line 2
    .line 3
    invoke-virtual {p0}, La/d9z;->j()La/q8z;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget v0, v0, La/q8z;->o:I

    .line 8
    .line 9
    neg-int v0, v0

    .line 10
    invoke-virtual {p0}, La/d9z;->j()La/q8z;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    iget p0, p0, La/q8z;->s:I

    .line 15
    .line 16
    add-int/2addr v0, p0

    .line 17
    return v0
.end method

.method public final b()F
    .locals 2

    .line 1
    iget-object p0, p0, La/rdz;->a:La/d9z;

    .line 2
    .line 3
    invoke-virtual {p0}, La/d9z;->h()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-virtual {p0}, La/d9z;->i()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    invoke-virtual {p0}, La/d9z;->d()Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    if-eqz p0, :cond_0

    .line 16
    .line 17
    mul-int/lit16 v0, v0, 0x1f4

    .line 18
    .line 19
    add-int/2addr v0, v1

    .line 20
    int-to-float p0, v0

    .line 21
    const/high16 v0, 0x42c80000    # 100.0f

    .line 22
    .line 23
    add-float/2addr p0, v0

    .line 24
    return p0

    .line 25
    :cond_0
    mul-int/lit16 v0, v0, 0x1f4

    .line 26
    .line 27
    add-int/2addr v0, v1

    .line 28
    int-to-float p0, v0

    .line 29
    return p0
.end method

.method public final c()La/m3d;
    .locals 1

    .line 1
    new-instance p0, La/m3d;

    .line 2
    .line 3
    const/4 v0, -0x1

    .line 4
    invoke-direct {p0, v0, v0}, La/m3d;-><init>(II)V

    .line 5
    .line 6
    .line 7
    return-object p0
.end method

.method public final d(ILa/u52;)Ljava/lang/Object;
    .locals 1

    .line 1
    sget-object v0, La/d9z;->w:La/v0h0;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    iget-object p0, p0, La/rdz;->a:La/d9z;

    .line 5
    .line 6
    invoke-virtual {p0, p1, v0, p2}, La/d9z;->l(IILa/yje;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    sget-object p1, La/wne;->a:La/wne;

    .line 11
    .line 12
    if-ne p0, p1, :cond_0

    .line 13
    .line 14
    return-object p0

    .line 15
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 16
    .line 17
    return-object p0
.end method

.method public final e()I
    .locals 4

    .line 1
    iget-object p0, p0, La/rdz;->a:La/d9z;

    .line 2
    .line 3
    invoke-virtual {p0}, La/d9z;->j()La/q8z;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v0, v0, La/q8z;->r:La/ma80;

    .line 8
    .line 9
    sget-object v1, La/ma80;->a:La/ma80;

    .line 10
    .line 11
    if-ne v0, v1, :cond_0

    .line 12
    .line 13
    invoke-virtual {p0}, La/d9z;->j()La/q8z;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-virtual {p0}, La/q8z;->h()J

    .line 18
    .line 19
    .line 20
    move-result-wide v0

    .line 21
    const-wide v2, 0xffffffffL

    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    and-long/2addr v0, v2

    .line 27
    :goto_0
    long-to-int p0, v0

    .line 28
    return p0

    .line 29
    :cond_0
    invoke-virtual {p0}, La/d9z;->j()La/q8z;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-virtual {p0}, La/q8z;->h()J

    .line 34
    .line 35
    .line 36
    move-result-wide v0

    .line 37
    const/16 p0, 0x20

    .line 38
    .line 39
    shr-long/2addr v0, p0

    .line 40
    goto :goto_0
.end method

.method public final f()F
    .locals 1

    .line 1
    iget-object p0, p0, La/rdz;->a:La/d9z;

    .line 2
    .line 3
    invoke-virtual {p0}, La/d9z;->h()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-virtual {p0}, La/d9z;->i()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    mul-int/lit16 v0, v0, 0x1f4

    .line 12
    .line 13
    add-int/2addr v0, p0

    .line 14
    int-to-float p0, v0

    .line 15
    return p0
.end method
