.class public final La/eld;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/bo30;
.implements La/ail;


# instance fields
.field public final a:Ljava/lang/Object;

.field public b:La/zhl;

.field public c:La/zhl;

.field public final synthetic d:La/gld;


# direct methods
.method public constructor <init>(La/gld;Ljava/lang/Object;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/eld;->d:La/gld;

    .line 5
    .line 6
    iget-object v0, p1, La/e06;->c:La/zhl;

    .line 7
    .line 8
    new-instance v1, La/zhl;

    .line 9
    .line 10
    iget-object v0, v0, La/zhl;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    const/4 v3, 0x0

    .line 14
    invoke-direct {v1, v0, v2, v3}, La/zhl;-><init>(Ljava/util/concurrent/CopyOnWriteArrayList;ILa/vn30;)V

    .line 15
    .line 16
    .line 17
    iput-object v1, p0, La/eld;->b:La/zhl;

    .line 18
    .line 19
    iget-object p1, p1, La/e06;->d:La/zhl;

    .line 20
    .line 21
    new-instance v0, La/zhl;

    .line 22
    .line 23
    iget-object p1, p1, La/zhl;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 24
    .line 25
    invoke-direct {v0, p1, v2, v3}, La/zhl;-><init>(Ljava/util/concurrent/CopyOnWriteArrayList;ILa/vn30;)V

    .line 26
    .line 27
    .line 28
    iput-object v0, p0, La/eld;->c:La/zhl;

    .line 29
    .line 30
    iput-object p2, p0, La/eld;->a:Ljava/lang/Object;

    .line 31
    .line 32
    return-void
.end method


# virtual methods
.method public final B(ILa/vn30;La/wn00;La/in30;Ljava/io/IOException;Z)V
    .locals 6

    .line 1
    invoke-virtual {p0, p1, p2}, La/eld;->a(ILa/vn30;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    iget-object v1, p0, La/eld;->b:La/zhl;

    .line 8
    .line 9
    invoke-virtual {p0, p4, p2}, La/eld;->b(La/in30;La/vn30;)La/in30;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    new-instance v0, La/zn30;

    .line 14
    .line 15
    move-object v2, p3

    .line 16
    move-object v4, p5

    .line 17
    move v5, p6

    .line 18
    invoke-direct/range {v0 .. v5}, La/zn30;-><init>(La/zhl;La/wn00;La/in30;Ljava/io/IOException;Z)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1, v0}, La/zhl;->a(La/rbe;)V

    .line 22
    .line 23
    .line 24
    :cond_0
    return-void
.end method

.method public final a(ILa/vn30;)Z
    .locals 3

    .line 1
    iget-object v0, p0, La/eld;->a:Ljava/lang/Object;

    .line 2
    .line 3
    iget-object v1, p0, La/eld;->d:La/gld;

    .line 4
    .line 5
    if-eqz p2, :cond_0

    .line 6
    .line 7
    invoke-virtual {v1, v0, p2}, La/gld;->s(Ljava/lang/Object;La/vn30;)La/vn30;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    if-nez p2, :cond_1

    .line 12
    .line 13
    const/4 p0, 0x0

    .line 14
    return p0

    .line 15
    :cond_0
    const/4 p2, 0x0

    .line 16
    :cond_1
    invoke-virtual {v1, p1, v0}, La/gld;->u(ILjava/lang/Object;)I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    iget-object v0, p0, La/eld;->b:La/zhl;

    .line 21
    .line 22
    iget v2, v0, La/zhl;->a:I

    .line 23
    .line 24
    if-ne v2, p1, :cond_2

    .line 25
    .line 26
    iget-object v0, v0, La/zhl;->b:La/vn30;

    .line 27
    .line 28
    invoke-static {v0, p2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-nez v0, :cond_3

    .line 33
    .line 34
    :cond_2
    iget-object v0, v1, La/e06;->c:La/zhl;

    .line 35
    .line 36
    new-instance v2, La/zhl;

    .line 37
    .line 38
    iget-object v0, v0, La/zhl;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 39
    .line 40
    invoke-direct {v2, v0, p1, p2}, La/zhl;-><init>(Ljava/util/concurrent/CopyOnWriteArrayList;ILa/vn30;)V

    .line 41
    .line 42
    .line 43
    iput-object v2, p0, La/eld;->b:La/zhl;

    .line 44
    .line 45
    :cond_3
    iget-object v0, p0, La/eld;->c:La/zhl;

    .line 46
    .line 47
    iget v2, v0, La/zhl;->a:I

    .line 48
    .line 49
    if-ne v2, p1, :cond_4

    .line 50
    .line 51
    iget-object v0, v0, La/zhl;->b:La/vn30;

    .line 52
    .line 53
    invoke-static {v0, p2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-nez v0, :cond_5

    .line 58
    .line 59
    :cond_4
    iget-object v0, v1, La/e06;->d:La/zhl;

    .line 60
    .line 61
    new-instance v1, La/zhl;

    .line 62
    .line 63
    iget-object v0, v0, La/zhl;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 64
    .line 65
    invoke-direct {v1, v0, p1, p2}, La/zhl;-><init>(Ljava/util/concurrent/CopyOnWriteArrayList;ILa/vn30;)V

    .line 66
    .line 67
    .line 68
    iput-object v1, p0, La/eld;->c:La/zhl;

    .line 69
    .line 70
    :cond_5
    const/4 p0, 0x1

    .line 71
    return p0
.end method

.method public final b(La/in30;La/vn30;)La/in30;
    .locals 12

    .line 1
    iget-wide v0, p1, La/in30;->f:J

    .line 2
    .line 3
    iget-object p2, p0, La/eld;->d:La/gld;

    .line 4
    .line 5
    iget-object p0, p0, La/eld;->a:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-virtual {p2, p0, v0, v1}, La/gld;->t(Ljava/lang/Object;J)J

    .line 8
    .line 9
    .line 10
    move-result-wide v8

    .line 11
    iget-wide v2, p1, La/in30;->g:J

    .line 12
    .line 13
    invoke-virtual {p2, p0, v2, v3}, La/gld;->t(Ljava/lang/Object;J)J

    .line 14
    .line 15
    .line 16
    move-result-wide v10

    .line 17
    cmp-long p0, v8, v0

    .line 18
    .line 19
    if-nez p0, :cond_0

    .line 20
    .line 21
    cmp-long p0, v10, v2

    .line 22
    .line 23
    if-nez p0, :cond_0

    .line 24
    .line 25
    return-object p1

    .line 26
    :cond_0
    new-instance v2, La/in30;

    .line 27
    .line 28
    iget-byte v3, p1, La/in30;->a:B

    .line 29
    .line 30
    iget v4, p1, La/in30;->b:I

    .line 31
    .line 32
    iget-object v5, p1, La/in30;->c:Landroidx/media3/common/b;

    .line 33
    .line 34
    iget v6, p1, La/in30;->d:I

    .line 35
    .line 36
    iget-object v7, p1, La/in30;->e:Ljava/lang/Object;

    .line 37
    .line 38
    invoke-direct/range {v2 .. v11}, La/in30;-><init>(IILandroidx/media3/common/b;ILjava/lang/Object;JJ)V

    .line 39
    .line 40
    .line 41
    return-object v2
.end method

.method public final i(ILa/vn30;La/wn00;La/in30;I)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, La/eld;->a(ILa/vn30;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    iget-object p1, p0, La/eld;->b:La/zhl;

    .line 8
    .line 9
    invoke-virtual {p0, p4, p2}, La/eld;->b(La/in30;La/vn30;)La/in30;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    new-instance p2, La/xn30;

    .line 14
    .line 15
    invoke-direct {p2, p1, p3, p0, p5}, La/xn30;-><init>(La/zhl;La/wn00;La/in30;I)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1, p2}, La/zhl;->a(La/rbe;)V

    .line 19
    .line 20
    .line 21
    :cond_0
    return-void
.end method

.method public final j(ILa/vn30;La/wn00;La/in30;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, La/eld;->a(ILa/vn30;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    iget-object p1, p0, La/eld;->b:La/zhl;

    .line 8
    .line 9
    invoke-virtual {p0, p4, p2}, La/eld;->b(La/in30;La/vn30;)La/in30;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    new-instance p2, La/yn30;

    .line 14
    .line 15
    const/4 p4, 0x1

    .line 16
    invoke-direct {p2, p1, p3, p0, p4}, La/yn30;-><init>(La/zhl;La/wn00;La/in30;B)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1, p2}, La/zhl;->a(La/rbe;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    return-void
.end method

.method public final p(ILa/vn30;La/in30;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, La/eld;->a(ILa/vn30;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    iget-object p1, p0, La/eld;->b:La/zhl;

    .line 8
    .line 9
    invoke-virtual {p0, p3, p2}, La/eld;->b(La/in30;La/vn30;)La/in30;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    new-instance p2, La/uq;

    .line 14
    .line 15
    const/16 p3, 0x14

    .line 16
    .line 17
    invoke-direct {p2, p1, p0, p3}, La/uq;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1, p2}, La/zhl;->a(La/rbe;)V

    .line 21
    .line 22
    .line 23
    :cond_0
    return-void
.end method

.method public final r(ILa/vn30;La/wn00;La/in30;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, La/eld;->a(ILa/vn30;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    iget-object p1, p0, La/eld;->b:La/zhl;

    .line 8
    .line 9
    invoke-virtual {p0, p4, p2}, La/eld;->b(La/in30;La/vn30;)La/in30;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    new-instance p2, La/yn30;

    .line 14
    .line 15
    const/4 p4, 0x0

    .line 16
    invoke-direct {p2, p1, p3, p0, p4}, La/yn30;-><init>(La/zhl;La/wn00;La/in30;B)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1, p2}, La/zhl;->a(La/rbe;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    return-void
.end method

.method public final z(ILa/vn30;La/in30;)V
    .locals 1

    .line 1
    invoke-virtual {p0, p1, p2}, La/eld;->a(ILa/vn30;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    iget-object p1, p0, La/eld;->b:La/zhl;

    .line 8
    .line 9
    invoke-virtual {p0, p3, p2}, La/eld;->b(La/in30;La/vn30;)La/in30;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    iget-object p2, p1, La/zhl;->b:La/vn30;

    .line 14
    .line 15
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    new-instance p3, La/hi;

    .line 19
    .line 20
    const/16 v0, 0x9

    .line 21
    .line 22
    invoke-direct {p3, p1, p2, p0, v0}, La/hi;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1, p3}, La/zhl;->a(La/rbe;)V

    .line 26
    .line 27
    .line 28
    :cond_0
    return-void
.end method
