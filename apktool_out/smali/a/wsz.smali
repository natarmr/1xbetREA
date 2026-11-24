.class public final La/wsz;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/wlu0;
.implements La/zul0;
.implements La/r460;


# direct methods
.method public static i(Landroidx/fragment/app/e;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, La/i630;->k2:La/evz;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    const-class v0, La/i630;

    .line 10
    .line 11
    sget-object v1, La/sre0;->a:La/tre0;

    .line 12
    .line 13
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-interface {v0}, La/sgy;->J()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {p0, v0}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    if-nez v1, :cond_0

    .line 26
    .line 27
    new-instance v1, La/i630;

    .line 28
    .line 29
    invoke-direct {v1}, La/i630;-><init>()V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1, p0, v0}, La/sik;->H0(Landroidx/fragment/app/e;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    :cond_0
    return-void
.end method


# virtual methods
.method public a()I
    .locals 0

    .line 1
    const p0, 0x7f0a142a

    .line 2
    .line 3
    .line 4
    return p0
.end method

.method public b()I
    .locals 0

    .line 1
    const/16 p0, 0x8

    .line 2
    .line 3
    return p0
.end method

.method public c(La/e7z;)Z
    .locals 1

    .line 1
    invoke-virtual {p1}, La/e7z;->x()La/nai0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 p1, 0x0

    .line 6
    const/4 v0, 0x1

    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    iget-boolean p0, p0, La/nai0;->d:Z

    .line 10
    .line 11
    if-ne p0, v0, :cond_0

    .line 12
    .line 13
    move p1, v0

    .line 14
    :cond_0
    xor-int/lit8 p0, p1, 0x1

    .line 15
    .line 16
    return p0
.end method

.method public d(La/raw;La/e7z;)Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public e(La/lm40;)Z
    .locals 0

    .line 1
    invoke-static {p1}, La/vcc;->Z(La/yzj;)La/e7z;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 p1, 0x0

    .line 6
    invoke-static {p0, p1}, La/x0x;->o(La/e7z;Z)La/tai0;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-static {p0}, La/phu0;->S(La/tai0;)Z

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    return p0
.end method

.method public f([Ljava/lang/StackTraceElement;)[Ljava/lang/StackTraceElement;
    .locals 2

    .line 1
    array-length p0, p1

    .line 2
    const/16 v0, 0x400

    .line 3
    .line 4
    if-gt p0, v0, :cond_0

    .line 5
    .line 6
    return-object p1

    .line 7
    :cond_0
    new-array p0, v0, [Ljava/lang/StackTraceElement;

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    const/16 v1, 0x200

    .line 11
    .line 12
    invoke-static {p1, v0, p0, v0, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 13
    .line 14
    .line 15
    array-length v0, p1

    .line 16
    sub-int/2addr v0, v1

    .line 17
    invoke-static {p1, v0, p0, v1, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 18
    .line 19
    .line 20
    return-object p0
.end method

.method public g(La/e7z;JLa/raw;IZ)V
    .locals 7

    .line 1
    iget-object p0, p1, La/e7z;->h1:La/tzi;

    .line 2
    .line 3
    iget-object p1, p0, La/tzi;->e:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p1, La/s460;

    .line 6
    .line 7
    sget-object p5, La/s460;->w1:La/mb50;

    .line 8
    .line 9
    invoke-virtual {p1, p2, p3}, La/s460;->d1(J)J

    .line 10
    .line 11
    .line 12
    move-result-wide v2

    .line 13
    iget-object p0, p0, La/tzi;->e:Ljava/lang/Object;

    .line 14
    .line 15
    move-object v0, p0

    .line 16
    check-cast v0, La/s460;

    .line 17
    .line 18
    sget-object v1, La/s460;->C1:La/wsz;

    .line 19
    .line 20
    const/4 v5, 0x1

    .line 21
    move-object v4, p4

    .line 22
    move v6, p6

    .line 23
    invoke-virtual/range {v0 .. v6}, La/s460;->m1(La/r460;JLa/raw;IZ)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public h(La/lm40;)Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method
