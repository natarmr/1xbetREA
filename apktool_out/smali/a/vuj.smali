.class public final La/vuj;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/iq00;


# static fields
.field public static final w:La/csj;


# instance fields
.field public final a:La/psc;

.field public final b:La/qbw;

.field public final c:La/x860;

.field public final d:Ljava/util/HashMap;

.field public final e:Ljava/util/concurrent/CopyOnWriteArrayList;

.field public f:La/zhl;

.field public g:La/lhf0;

.field public h:Landroid/os/Handler;

.field public i:La/jbw;

.field public j:La/rsj;

.field public k:La/mbw;

.field public l:La/kq80;

.field public m:La/xaw;

.field public n:La/b4x;

.field public o:La/b4x;

.field public p:La/b4x;

.field public q:La/b4x;

.field public r:Landroid/net/Uri;

.field public s:La/ibw;

.field public t:Landroid/net/Uri;

.field public u:Z

.field public v:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, La/csj;

    .line 2
    .line 3
    const/16 v1, 0x1a

    .line 4
    .line 5
    invoke-direct {v0, v1}, La/csj;-><init>(B)V

    .line 6
    .line 7
    .line 8
    sput-object v0, La/vuj;->w:La/csj;

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>(La/psc;La/x860;La/qbw;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/vuj;->a:La/psc;

    .line 5
    .line 6
    iput-object p3, p0, La/vuj;->b:La/qbw;

    .line 7
    .line 8
    iput-object p2, p0, La/vuj;->c:La/x860;

    .line 9
    .line 10
    new-instance p1, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 11
    .line 12
    invoke-direct {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, La/vuj;->e:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 16
    .line 17
    new-instance p1, Ljava/util/HashMap;

    .line 18
    .line 19
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, La/vuj;->d:Ljava/util/HashMap;

    .line 23
    .line 24
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    iput-wide p1, p0, La/vuj;->v:J

    .line 30
    .line 31
    return-void
.end method


# virtual methods
.method public final a(La/kq00;JJI)V
    .locals 14

    .line 1
    move-object v0, p1

    .line 2
    check-cast v0, La/mq80;

    .line 3
    .line 4
    new-instance v1, La/vn00;

    .line 5
    .line 6
    iget-wide v2, v0, La/mq80;->a:J

    .line 7
    .line 8
    iget-object v4, v0, La/mq80;->b:La/mbj;

    .line 9
    .line 10
    move-wide/from16 v5, p2

    .line 11
    .line 12
    invoke-direct/range {v1 .. v6}, La/vn00;-><init>(JLa/mbj;J)V

    .line 13
    .line 14
    .line 15
    if-eqz p6, :cond_0

    .line 16
    .line 17
    iget-object v2, v0, La/mq80;->d:La/enm0;

    .line 18
    .line 19
    iget-object v3, v2, La/enm0;->c:Landroid/net/Uri;

    .line 20
    .line 21
    iput-object v3, v1, La/vn00;->f:Ljava/lang/Object;

    .line 22
    .line 23
    iget-object v3, v2, La/enm0;->d:Ljava/util/Map;

    .line 24
    .line 25
    iput-object v3, v1, La/vn00;->g:Ljava/lang/Object;

    .line 26
    .line 27
    move-wide/from16 v3, p4

    .line 28
    .line 29
    iput-wide v3, v1, La/vn00;->c:J

    .line 30
    .line 31
    iget-wide v2, v2, La/enm0;->b:J

    .line 32
    .line 33
    iput-wide v2, v1, La/vn00;->d:J

    .line 34
    .line 35
    :cond_0
    iget-object v2, p0, La/vuj;->f:La/zhl;

    .line 36
    .line 37
    new-instance v3, La/wn00;

    .line 38
    .line 39
    invoke-direct {v3, v1}, La/wn00;-><init>(La/vn00;)V

    .line 40
    .line 41
    .line 42
    iget-byte v4, v0, La/mq80;->c:B

    .line 43
    .line 44
    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    const-wide v11, -0x7fffffffffffffffL    # -4.9E-324

    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    const/4 v5, -0x1

    .line 55
    const/4 v6, 0x0

    .line 56
    const/4 v7, 0x0

    .line 57
    const/4 v8, 0x0

    .line 58
    move/from16 v13, p6

    .line 59
    .line 60
    invoke-virtual/range {v2 .. v13}, La/zhl;->f(La/wn00;IILandroidx/media3/common/b;ILjava/lang/Object;JJI)V

    .line 61
    .line 62
    .line 63
    return-void
.end method

.method public final b(Ljava/util/List;Z)V
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    if-ge v0, v1, :cond_1

    .line 7
    .line 8
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    check-cast v1, La/tbw;

    .line 13
    .line 14
    new-instance v2, La/uuj;

    .line 15
    .line 16
    invoke-direct {v2, p0, v1, p2}, La/uuj;-><init>(La/vuj;La/tbw;Z)V

    .line 17
    .line 18
    .line 19
    iget-object v1, v1, La/tbw;->b:Ljava/util/HashMap;

    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-static {v1}, La/f4x;->m(Ljava/util/Collection;)La/f4x;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-virtual {v1}, La/s3x;->j()La/eet0;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    if-eqz v3, :cond_0

    .line 38
    .line 39
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    check-cast v3, Landroid/net/Uri;

    .line 44
    .line 45
    iget-object v4, p0, La/vuj;->d:Ljava/util/HashMap;

    .line 46
    .line 47
    invoke-virtual {v4, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_1
    return-void
.end method

.method public final c(ZLandroid/net/Uri;)La/ibw;
    .locals 2

    .line 1
    iget-object v0, p0, La/vuj;->d:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-virtual {v0, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, La/uuj;

    .line 8
    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    return-object p0

    .line 13
    :cond_0
    invoke-virtual {v1, p2}, La/uuj;->b(Landroid/net/Uri;)La/ibw;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    if-eqz v1, :cond_2

    .line 18
    .line 19
    if-eqz p1, :cond_2

    .line 20
    .line 21
    const/4 p1, 0x0

    .line 22
    invoke-virtual {p0, p1, p2}, La/vuj;->i(ZLandroid/net/Uri;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    check-cast p0, La/uuj;

    .line 30
    .line 31
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    iget-object p1, p0, La/uuj;->b:Ljava/util/HashMap;

    .line 35
    .line 36
    invoke-virtual {p1, p2}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    invoke-static {v0}, La/x0x;->K(Z)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    check-cast v0, La/tuj;

    .line 48
    .line 49
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    iget-boolean v0, v0, La/tuj;->l:Z

    .line 53
    .line 54
    if-eqz v0, :cond_1

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_1
    invoke-virtual {p1, p2}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    invoke-static {v0}, La/x0x;->K(Z)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {p1, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    check-cast p1, La/tuj;

    .line 69
    .line 70
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    const/4 v0, 0x1

    .line 74
    iput-boolean v0, p1, La/tuj;->l:Z

    .line 75
    .line 76
    invoke-virtual {p0, p2}, La/uuj;->b(Landroid/net/Uri;)La/ibw;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    if-eqz p1, :cond_2

    .line 81
    .line 82
    iget-boolean p1, p1, La/ibw;->o:Z

    .line 83
    .line 84
    if-nez p1, :cond_2

    .line 85
    .line 86
    invoke-virtual {p0, v0, p2}, La/uuj;->e(ZLandroid/net/Uri;)V

    .line 87
    .line 88
    .line 89
    :cond_2
    :goto_0
    return-object v1
.end method

.method public final d(I)La/b4x;
    .locals 1

    .line 1
    if-eqz p1, :cond_3

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    if-eq p1, v0, :cond_2

    .line 5
    .line 6
    const/4 v0, 0x2

    .line 7
    if-eq p1, v0, :cond_1

    .line 8
    .line 9
    const/4 v0, 0x3

    .line 10
    if-eq p1, v0, :cond_0

    .line 11
    .line 12
    const/4 p0, 0x0

    .line 13
    return-object p0

    .line 14
    :cond_0
    iget-object p0, p0, La/vuj;->q:La/b4x;

    .line 15
    .line 16
    return-object p0

    .line 17
    :cond_1
    iget-object p0, p0, La/vuj;->p:La/b4x;

    .line 18
    .line 19
    return-object p0

    .line 20
    :cond_2
    iget-object p0, p0, La/vuj;->o:La/b4x;

    .line 21
    .line 22
    return-object p0

    .line 23
    :cond_3
    iget-object p0, p0, La/vuj;->n:La/b4x;

    .line 24
    .line 25
    return-object p0
.end method

.method public final e(Landroid/net/Uri;)Landroid/net/Uri;
    .locals 2

    .line 1
    iget-object p0, p0, La/vuj;->s:La/ibw;

    .line 2
    .line 3
    if-eqz p0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, La/ibw;->v:La/hbw;

    .line 6
    .line 7
    iget-boolean v0, v0, La/hbw;->e:Z

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    iget-object p0, p0, La/ibw;->t:La/wcf0;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, La/ebw;

    .line 18
    .line 19
    if-eqz p0, :cond_1

    .line 20
    .line 21
    invoke-virtual {p1}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    iget-wide v0, p0, La/ebw;->b:J

    .line 26
    .line 27
    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    const-string v1, "_HLS_msn"

    .line 32
    .line 33
    invoke-virtual {p1, v1, v0}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 34
    .line 35
    .line 36
    iget p0, p0, La/ebw;->c:I

    .line 37
    .line 38
    const/4 v0, -0x1

    .line 39
    if-eq p0, v0, :cond_0

    .line 40
    .line 41
    const-string v0, "_HLS_part"

    .line 42
    .line 43
    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    invoke-virtual {p1, v0, p0}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 48
    .line 49
    .line 50
    :cond_0
    invoke-virtual {p1}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    return-object p0

    .line 55
    :cond_1
    return-object p1
.end method

.method public final f(La/tbw;J)Z
    .locals 4

    .line 1
    iget-object p0, p0, La/vuj;->d:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-virtual {p1}, La/tbw;->b()Landroid/net/Uri;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    check-cast p0, La/uuj;

    .line 12
    .line 13
    const/4 p1, 0x0

    .line 14
    if-eqz p0, :cond_2

    .line 15
    .line 16
    iget-object p0, p0, La/uuj;->b:Ljava/util/HashMap;

    .line 17
    .line 18
    invoke-virtual {p0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    const/4 v0, 0x1

    .line 27
    move v1, v0

    .line 28
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-eqz v2, :cond_1

    .line 33
    .line 34
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    check-cast v2, La/tuj;

    .line 39
    .line 40
    iget-wide v2, v2, La/tuj;->i:J

    .line 41
    .line 42
    cmp-long v2, p2, v2

    .line 43
    .line 44
    if-gtz v2, :cond_0

    .line 45
    .line 46
    move v2, v0

    .line 47
    goto :goto_1

    .line 48
    :cond_0
    move v2, p1

    .line 49
    :goto_1
    and-int/2addr v1, v2

    .line 50
    goto :goto_0

    .line 51
    :cond_1
    return v1

    .line 52
    :cond_2
    return p1
.end method

.method public final g(Landroid/net/Uri;J)Z
    .locals 0

    .line 1
    iget-object p0, p0, La/vuj;->d:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/uuj;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0, p1, p2, p3}, La/uuj;->c(Landroid/net/Uri;J)Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0

    .line 16
    :cond_0
    const/4 p0, 0x0

    .line 17
    return p0
.end method

.method public final h(Landroid/net/Uri;)Z
    .locals 6

    .line 1
    iget-object p0, p0, La/vuj;->d:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/uuj;

    .line 8
    .line 9
    if-nez p0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget-object p0, p0, La/uuj;->b:Ljava/util/HashMap;

    .line 13
    .line 14
    invoke-virtual {p0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    invoke-static {v0}, La/x0x;->K(Z)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    check-cast p0, La/tuj;

    .line 26
    .line 27
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    iget-object p1, p0, La/tuj;->e:La/ibw;

    .line 31
    .line 32
    if-nez p1, :cond_1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 36
    .line 37
    .line 38
    move-result-wide v0

    .line 39
    iget-object p1, p0, La/tuj;->e:La/ibw;

    .line 40
    .line 41
    iget-wide v2, p1, La/ibw;->u:J

    .line 42
    .line 43
    invoke-static {v2, v3}, La/vtt0;->Y(J)J

    .line 44
    .line 45
    .line 46
    move-result-wide v2

    .line 47
    const-wide/16 v4, 0x7530

    .line 48
    .line 49
    invoke-static {v4, v5, v2, v3}, Ljava/lang/Math;->max(JJ)J

    .line 50
    .line 51
    .line 52
    move-result-wide v2

    .line 53
    iget-object p1, p0, La/tuj;->e:La/ibw;

    .line 54
    .line 55
    iget-boolean v4, p1, La/ibw;->o:Z

    .line 56
    .line 57
    const/4 v5, 0x1

    .line 58
    if-nez v4, :cond_3

    .line 59
    .line 60
    iget p1, p1, La/ibw;->d:I

    .line 61
    .line 62
    const/4 v4, 0x2

    .line 63
    if-eq p1, v4, :cond_3

    .line 64
    .line 65
    if-eq p1, v5, :cond_3

    .line 66
    .line 67
    iget-wide p0, p0, La/tuj;->f:J

    .line 68
    .line 69
    add-long/2addr p0, v2

    .line 70
    cmp-long p0, p0, v0

    .line 71
    .line 72
    if-lez p0, :cond_2

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_2
    :goto_0
    const/4 p0, 0x0

    .line 76
    return p0

    .line 77
    :cond_3
    :goto_1
    return v5
.end method

.method public final i(ZLandroid/net/Uri;)V
    .locals 4

    .line 1
    iget-object v0, p0, La/vuj;->r:Landroid/net/Uri;

    .line 2
    .line 3
    invoke-virtual {p2, v0}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_5

    .line 8
    .line 9
    iget-object v0, p0, La/vuj;->d:Ljava/util/HashMap;

    .line 10
    .line 11
    invoke-virtual {v0, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    check-cast v1, La/uuj;

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    iget-boolean v1, v1, La/uuj;->c:Z

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    move v1, v2

    .line 24
    :goto_0
    if-eqz v1, :cond_5

    .line 25
    .line 26
    iget-object v1, p0, La/vuj;->s:La/ibw;

    .line 27
    .line 28
    if-eqz v1, :cond_1

    .line 29
    .line 30
    iget-boolean v1, v1, La/ibw;->o:Z

    .line 31
    .line 32
    if-eqz v1, :cond_1

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_1
    invoke-virtual {v0, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    check-cast v0, La/uuj;

    .line 40
    .line 41
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, p2}, La/uuj;->b(Landroid/net/Uri;)La/ibw;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    if-eqz v1, :cond_2

    .line 49
    .line 50
    iget-boolean v3, v1, La/ibw;->o:Z

    .line 51
    .line 52
    if-eqz v3, :cond_2

    .line 53
    .line 54
    const/4 v2, 0x1

    .line 55
    :cond_2
    if-nez v2, :cond_3

    .line 56
    .line 57
    if-eqz p1, :cond_3

    .line 58
    .line 59
    invoke-virtual {p0, p2}, La/vuj;->e(Landroid/net/Uri;)Landroid/net/Uri;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    invoke-virtual {v0, p2, p1}, La/uuj;->d(Landroid/net/Uri;Landroid/net/Uri;)V

    .line 64
    .line 65
    .line 66
    iput-object p2, p0, La/vuj;->t:Landroid/net/Uri;

    .line 67
    .line 68
    return-void

    .line 69
    :cond_3
    iput-object p2, p0, La/vuj;->r:Landroid/net/Uri;

    .line 70
    .line 71
    if-eqz v2, :cond_4

    .line 72
    .line 73
    iput-object v1, p0, La/vuj;->s:La/ibw;

    .line 74
    .line 75
    iget-object p0, p0, La/vuj;->i:La/jbw;

    .line 76
    .line 77
    invoke-virtual {p0, v1}, La/jbw;->t(La/ibw;)V

    .line 78
    .line 79
    .line 80
    return-void

    .line 81
    :cond_4
    invoke-virtual {p0, p2}, La/vuj;->e(Landroid/net/Uri;)Landroid/net/Uri;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    invoke-virtual {v0, p2, p0}, La/uuj;->d(Landroid/net/Uri;Landroid/net/Uri;)V

    .line 86
    .line 87
    .line 88
    :cond_5
    :goto_1
    return-void
.end method

.method public final j(Landroid/net/Uri;)V
    .locals 2

    .line 1
    iget-object p0, p0, La/vuj;->d:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/uuj;

    .line 8
    .line 9
    if-eqz p0, :cond_4

    .line 10
    .line 11
    iget-object p0, p0, La/uuj;->b:Ljava/util/HashMap;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    invoke-static {v0}, La/x0x;->K(Z)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    check-cast p0, La/tuj;

    .line 25
    .line 26
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    iget-object p1, p0, La/tuj;->c:La/lhf0;

    .line 30
    .line 31
    iget-object v0, p1, La/lhf0;->d:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v0, Ljava/io/IOException;

    .line 34
    .line 35
    if-nez v0, :cond_3

    .line 36
    .line 37
    iget-object p1, p1, La/lhf0;->c:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast p1, La/jq00;

    .line 40
    .line 41
    if-eqz p1, :cond_1

    .line 42
    .line 43
    iget v0, p1, La/jq00;->a:I

    .line 44
    .line 45
    iget-object v1, p1, La/jq00;->e:Ljava/io/IOException;

    .line 46
    .line 47
    if-eqz v1, :cond_1

    .line 48
    .line 49
    iget p1, p1, La/jq00;->f:I

    .line 50
    .line 51
    if-gt p1, v0, :cond_0

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_0
    throw v1

    .line 55
    :cond_1
    :goto_0
    iget-object p0, p0, La/tuj;->k:Ljava/io/IOException;

    .line 56
    .line 57
    if-nez p0, :cond_2

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_2
    throw p0

    .line 61
    :cond_3
    throw v0

    .line 62
    :cond_4
    :goto_1
    return-void
.end method

.method public final n(La/kq00;JJZ)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, La/mq80;

    .line 6
    .line 7
    new-instance v2, La/vn00;

    .line 8
    .line 9
    iget-wide v3, v1, La/mq80;->a:J

    .line 10
    .line 11
    iget-object v5, v1, La/mq80;->b:La/mbj;

    .line 12
    .line 13
    move-wide/from16 v6, p2

    .line 14
    .line 15
    invoke-direct/range {v2 .. v7}, La/vn00;-><init>(JLa/mbj;J)V

    .line 16
    .line 17
    .line 18
    iget-object v1, v1, La/mq80;->d:La/enm0;

    .line 19
    .line 20
    iget-object v3, v1, La/enm0;->c:Landroid/net/Uri;

    .line 21
    .line 22
    iput-object v3, v2, La/vn00;->f:Ljava/lang/Object;

    .line 23
    .line 24
    iget-object v3, v1, La/enm0;->d:Ljava/util/Map;

    .line 25
    .line 26
    iput-object v3, v2, La/vn00;->g:Ljava/lang/Object;

    .line 27
    .line 28
    move-wide/from16 v3, p4

    .line 29
    .line 30
    iput-wide v3, v2, La/vn00;->c:J

    .line 31
    .line 32
    iget-wide v3, v1, La/enm0;->b:J

    .line 33
    .line 34
    iput-wide v3, v2, La/vn00;->d:J

    .line 35
    .line 36
    new-instance v6, La/wn00;

    .line 37
    .line 38
    invoke-direct {v6, v2}, La/wn00;-><init>(La/vn00;)V

    .line 39
    .line 40
    .line 41
    iget-object v1, v0, La/vuj;->c:La/x860;

    .line 42
    .line 43
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    iget-object v5, v0, La/vuj;->f:La/zhl;

    .line 47
    .line 48
    const-wide v12, -0x7fffffffffffffffL    # -4.9E-324

    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    const-wide v14, -0x7fffffffffffffffL    # -4.9E-324

    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    const/4 v7, 0x4

    .line 59
    const/4 v8, -0x1

    .line 60
    const/4 v9, 0x0

    .line 61
    const/4 v10, 0x0

    .line 62
    const/4 v11, 0x0

    .line 63
    invoke-virtual/range {v5 .. v15}, La/zhl;->b(La/wn00;IILandroidx/media3/common/b;ILjava/lang/Object;JJ)V

    .line 64
    .line 65
    .line 66
    return-void
.end method

.method public final u(La/kq00;JJ)V
    .locals 21

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    check-cast v0, La/mq80;

    .line 6
    .line 7
    iget-object v2, v0, La/mq80;->f:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v2, La/nbw;

    .line 10
    .line 11
    instance-of v3, v2, La/ibw;

    .line 12
    .line 13
    if-eqz v3, :cond_0

    .line 14
    .line 15
    iget-object v4, v2, La/nbw;->a:Ljava/lang/String;

    .line 16
    .line 17
    sget-object v5, La/mbw;->o:La/mbw;

    .line 18
    .line 19
    invoke-static {v4}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 20
    .line 21
    .line 22
    move-result-object v7

    .line 23
    new-instance v4, La/awq;

    .line 24
    .line 25
    invoke-direct {v4}, La/awq;-><init>()V

    .line 26
    .line 27
    .line 28
    const-string v5, "0"

    .line 29
    .line 30
    iput-object v5, v4, La/awq;->a:Ljava/lang/String;

    .line 31
    .line 32
    const-string v5, "application/x-mpegURL"

    .line 33
    .line 34
    invoke-static {v5}, La/mg40;->n(Ljava/lang/String;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v5

    .line 38
    iput-object v5, v4, La/awq;->n:Ljava/lang/String;

    .line 39
    .line 40
    new-instance v8, Landroidx/media3/common/b;

    .line 41
    .line 42
    invoke-direct {v8, v4}, Landroidx/media3/common/b;-><init>(La/awq;)V

    .line 43
    .line 44
    .line 45
    new-instance v6, La/lbw;

    .line 46
    .line 47
    const/4 v13, 0x0

    .line 48
    const/4 v14, 0x0

    .line 49
    const/4 v9, 0x0

    .line 50
    const/4 v10, 0x0

    .line 51
    const/4 v11, 0x0

    .line 52
    const/4 v12, 0x0

    .line 53
    invoke-direct/range {v6 .. v14}, La/lbw;-><init>(Landroid/net/Uri;Landroidx/media3/common/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    invoke-static {v6}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 57
    .line 58
    .line 59
    move-result-object v10

    .line 60
    new-instance v7, La/mbw;

    .line 61
    .line 62
    sget-object v9, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 63
    .line 64
    sget-object v18, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 65
    .line 66
    const/16 v20, 0x0

    .line 67
    .line 68
    const-string v8, ""

    .line 69
    .line 70
    const/4 v15, 0x0

    .line 71
    const/16 v16, 0x0

    .line 72
    .line 73
    const/16 v17, 0x0

    .line 74
    .line 75
    move-object v11, v9

    .line 76
    move-object v12, v9

    .line 77
    move-object v13, v9

    .line 78
    move-object v14, v9

    .line 79
    move-object/from16 v19, v9

    .line 80
    .line 81
    invoke-direct/range {v7 .. v20}, La/mbw;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Landroidx/media3/common/b;Ljava/util/List;ZLjava/util/Map;Ljava/util/List;La/lbu;)V

    .line 82
    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_0
    move-object v7, v2

    .line 86
    check-cast v7, La/mbw;

    .line 87
    .line 88
    :goto_0
    iput-object v7, v1, La/vuj;->k:La/mbw;

    .line 89
    .line 90
    new-instance v4, La/grd;

    .line 91
    .line 92
    invoke-direct {v4, v7}, La/grd;-><init>(La/mbw;)V

    .line 93
    .line 94
    .line 95
    :try_start_0
    invoke-virtual {v4}, La/grd;->d()V

    .line 96
    .line 97
    .line 98
    iget-object v5, v4, La/grd;->f:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast v5, La/b4x;

    .line 101
    .line 102
    iput-object v5, v1, La/vuj;->n:La/b4x;

    .line 103
    .line 104
    const/4 v5, 0x1

    .line 105
    invoke-virtual {v4, v5}, La/grd;->c(I)La/b4x;

    .line 106
    .line 107
    .line 108
    move-result-object v6

    .line 109
    iput-object v6, v1, La/vuj;->o:La/b4x;

    .line 110
    .line 111
    const/4 v6, 0x2

    .line 112
    invoke-virtual {v4, v6}, La/grd;->c(I)La/b4x;

    .line 113
    .line 114
    .line 115
    move-result-object v6

    .line 116
    iput-object v6, v1, La/vuj;->p:La/b4x;

    .line 117
    .line 118
    const/4 v6, 0x3

    .line 119
    invoke-virtual {v4, v6}, La/grd;->c(I)La/b4x;

    .line 120
    .line 121
    .line 122
    move-result-object v4

    .line 123
    iput-object v4, v1, La/vuj;->q:La/b4x;
    :try_end_0
    .catch La/kq80; {:try_start_0 .. :try_end_0} :catch_0

    .line 124
    .line 125
    iget-object v4, v1, La/vuj;->k:La/mbw;

    .line 126
    .line 127
    iget-object v4, v4, La/mbw;->n:La/lbu;

    .line 128
    .line 129
    if-eqz v4, :cond_2

    .line 130
    .line 131
    new-instance v6, La/xaw;

    .line 132
    .line 133
    iget-object v7, v1, La/vuj;->a:La/psc;

    .line 134
    .line 135
    new-instance v8, La/prc;

    .line 136
    .line 137
    const/16 v9, 0x18

    .line 138
    .line 139
    invoke-direct {v8, v1, v9}, La/prc;-><init>(Ljava/lang/Object;B)V

    .line 140
    .line 141
    .line 142
    iget-object v9, v1, La/vuj;->j:La/rsj;

    .line 143
    .line 144
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 145
    .line 146
    .line 147
    invoke-direct {v6, v7, v1, v8, v9}, La/xaw;-><init>(La/psc;La/vuj;La/prc;La/rsj;)V

    .line 148
    .line 149
    .line 150
    iput-object v6, v1, La/vuj;->m:La/xaw;

    .line 151
    .line 152
    iget-object v7, v4, La/lbu;->b:Ljava/lang/Object;

    .line 153
    .line 154
    check-cast v7, Landroid/net/Uri;

    .line 155
    .line 156
    iget-object v4, v4, La/lbu;->c:Ljava/lang/Object;

    .line 157
    .line 158
    check-cast v4, Ljava/lang/String;

    .line 159
    .line 160
    iget-object v8, v1, La/vuj;->f:La/zhl;

    .line 161
    .line 162
    if-eqz v4, :cond_1

    .line 163
    .line 164
    iget-object v9, v6, La/xaw;->h:Ljava/util/HashSet;

    .line 165
    .line 166
    invoke-virtual {v9, v4}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 167
    .line 168
    .line 169
    move-result v9

    .line 170
    invoke-static {v9}, La/x0x;->K(Z)V

    .line 171
    .line 172
    .line 173
    iput-object v4, v6, La/xaw;->l:Ljava/lang/String;

    .line 174
    .line 175
    :cond_1
    iput-boolean v5, v6, La/xaw;->k:Z

    .line 176
    .line 177
    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    invoke-virtual {v6, v9, v10}, La/xaw;->c(J)V

    .line 183
    .line 184
    .line 185
    iget-object v4, v6, La/xaw;->a:La/jrs0;

    .line 186
    .line 187
    new-instance v9, La/hru;

    .line 188
    .line 189
    invoke-direct {v9, v6}, La/hru;-><init>(Ljava/lang/Object;)V

    .line 190
    .line 191
    .line 192
    iput-object v7, v4, La/jrs0;->e:Ljava/lang/Object;

    .line 193
    .line 194
    iput-object v9, v4, La/jrs0;->f:Ljava/lang/Object;

    .line 195
    .line 196
    iput-object v8, v4, La/jrs0;->g:Ljava/lang/Object;

    .line 197
    .line 198
    invoke-static {}, La/vtt0;->u()Landroid/os/Looper;

    .line 199
    .line 200
    .line 201
    move-result-object v6

    .line 202
    new-instance v7, La/q9o0;

    .line 203
    .line 204
    new-instance v8, Landroid/os/Handler;

    .line 205
    .line 206
    const/4 v9, 0x0

    .line 207
    invoke-direct {v8, v6, v9}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    .line 208
    .line 209
    .line 210
    invoke-direct {v7, v8}, La/q9o0;-><init>(Landroid/os/Handler;)V

    .line 211
    .line 212
    .line 213
    iput-object v7, v4, La/jrs0;->i:Ljava/lang/Object;

    .line 214
    .line 215
    new-instance v6, La/lhf0;

    .line 216
    .line 217
    const-string v7, "SteeringManifestTracker"

    .line 218
    .line 219
    invoke-direct {v6, v7, v5}, La/lhf0;-><init>(Ljava/lang/String;B)V

    .line 220
    .line 221
    .line 222
    iput-object v6, v4, La/jrs0;->j:Ljava/lang/Object;

    .line 223
    .line 224
    iput-boolean v5, v4, La/jrs0;->a:Z

    .line 225
    .line 226
    invoke-virtual {v4}, La/jrs0;->g()V

    .line 227
    .line 228
    .line 229
    :cond_2
    iget-object v4, v1, La/vuj;->n:La/b4x;

    .line 230
    .line 231
    const/4 v6, 0x0

    .line 232
    invoke-interface {v4, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    move-result-object v4

    .line 236
    check-cast v4, La/tbw;

    .line 237
    .line 238
    invoke-virtual {v4}, La/tbw;->b()Landroid/net/Uri;

    .line 239
    .line 240
    .line 241
    move-result-object v4

    .line 242
    iput-object v4, v1, La/vuj;->r:Landroid/net/Uri;

    .line 243
    .line 244
    iget-object v4, v1, La/vuj;->e:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 245
    .line 246
    new-instance v7, La/suj;

    .line 247
    .line 248
    invoke-direct {v7, v1}, La/suj;-><init>(La/vuj;)V

    .line 249
    .line 250
    .line 251
    invoke-virtual {v4, v7}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 252
    .line 253
    .line 254
    iget-object v4, v1, La/vuj;->n:La/b4x;

    .line 255
    .line 256
    invoke-virtual {v1, v4, v5}, La/vuj;->b(Ljava/util/List;Z)V

    .line 257
    .line 258
    .line 259
    iget-object v4, v1, La/vuj;->o:La/b4x;

    .line 260
    .line 261
    invoke-virtual {v1, v4, v6}, La/vuj;->b(Ljava/util/List;Z)V

    .line 262
    .line 263
    .line 264
    iget-object v4, v1, La/vuj;->p:La/b4x;

    .line 265
    .line 266
    invoke-virtual {v1, v4, v6}, La/vuj;->b(Ljava/util/List;Z)V

    .line 267
    .line 268
    .line 269
    iget-object v4, v1, La/vuj;->q:La/b4x;

    .line 270
    .line 271
    invoke-virtual {v1, v4, v6}, La/vuj;->b(Ljava/util/List;Z)V

    .line 272
    .line 273
    .line 274
    new-instance v7, La/vn00;

    .line 275
    .line 276
    iget-wide v8, v0, La/mq80;->a:J

    .line 277
    .line 278
    iget-object v10, v0, La/mq80;->b:La/mbj;

    .line 279
    .line 280
    move-wide/from16 v11, p2

    .line 281
    .line 282
    invoke-direct/range {v7 .. v12}, La/vn00;-><init>(JLa/mbj;J)V

    .line 283
    .line 284
    .line 285
    iget-object v4, v0, La/mq80;->d:La/enm0;

    .line 286
    .line 287
    iget-object v5, v4, La/enm0;->c:Landroid/net/Uri;

    .line 288
    .line 289
    iput-object v5, v7, La/vn00;->f:Ljava/lang/Object;

    .line 290
    .line 291
    iget-object v5, v4, La/enm0;->d:Ljava/util/Map;

    .line 292
    .line 293
    iput-object v5, v7, La/vn00;->g:Ljava/lang/Object;

    .line 294
    .line 295
    move-wide/from16 v8, p4

    .line 296
    .line 297
    iput-wide v8, v7, La/vn00;->c:J

    .line 298
    .line 299
    iget-wide v4, v4, La/enm0;->b:J

    .line 300
    .line 301
    iput-wide v4, v7, La/vn00;->d:J

    .line 302
    .line 303
    new-instance v9, La/wn00;

    .line 304
    .line 305
    invoke-direct {v9, v7}, La/wn00;-><init>(La/vn00;)V

    .line 306
    .line 307
    .line 308
    iget-object v4, v1, La/vuj;->d:Ljava/util/HashMap;

    .line 309
    .line 310
    iget-object v5, v1, La/vuj;->r:Landroid/net/Uri;

    .line 311
    .line 312
    invoke-virtual {v4, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 313
    .line 314
    .line 315
    move-result-object v4

    .line 316
    check-cast v4, La/uuj;

    .line 317
    .line 318
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 319
    .line 320
    .line 321
    if-eqz v3, :cond_3

    .line 322
    .line 323
    iget-object v0, v0, La/mq80;->d:La/enm0;

    .line 324
    .line 325
    iget-object v0, v0, La/enm0;->c:Landroid/net/Uri;

    .line 326
    .line 327
    check-cast v2, La/ibw;

    .line 328
    .line 329
    iget-object v3, v4, La/uuj;->b:Ljava/util/HashMap;

    .line 330
    .line 331
    invoke-virtual {v3, v0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 332
    .line 333
    .line 334
    move-result v4

    .line 335
    invoke-static {v4}, La/x0x;->K(Z)V

    .line 336
    .line 337
    .line 338
    invoke-virtual {v3, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 339
    .line 340
    .line 341
    move-result-object v0

    .line 342
    check-cast v0, La/tuj;

    .line 343
    .line 344
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 345
    .line 346
    .line 347
    invoke-virtual {v0, v2, v9}, La/tuj;->e(La/ibw;La/wn00;)V

    .line 348
    .line 349
    .line 350
    goto :goto_1

    .line 351
    :cond_3
    iget-object v0, v1, La/vuj;->r:Landroid/net/Uri;

    .line 352
    .line 353
    invoke-virtual {v4, v6, v0}, La/uuj;->e(ZLandroid/net/Uri;)V

    .line 354
    .line 355
    .line 356
    :goto_1
    iget-object v0, v1, La/vuj;->c:La/x860;

    .line 357
    .line 358
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 359
    .line 360
    .line 361
    iget-object v8, v1, La/vuj;->f:La/zhl;

    .line 362
    .line 363
    const-wide v15, -0x7fffffffffffffffL    # -4.9E-324

    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    const-wide v17, -0x7fffffffffffffffL    # -4.9E-324

    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    const/4 v10, 0x4

    .line 374
    const/4 v11, -0x1

    .line 375
    const/4 v12, 0x0

    .line 376
    const/4 v13, 0x0

    .line 377
    const/4 v14, 0x0

    .line 378
    invoke-virtual/range {v8 .. v18}, La/zhl;->c(La/wn00;IILandroidx/media3/common/b;ILjava/lang/Object;JJ)V

    .line 379
    .line 380
    .line 381
    return-void

    .line 382
    :catch_0
    move-exception v0

    .line 383
    iput-object v0, v1, La/vuj;->l:La/kq80;

    .line 384
    .line 385
    return-void
.end method

.method public final w(La/kq00;JJLjava/io/IOException;I)La/ejx;
    .locals 6

    .line 1
    check-cast p1, La/mq80;

    .line 2
    .line 3
    new-instance v0, La/vn00;

    .line 4
    .line 5
    iget-wide v1, p1, La/mq80;->a:J

    .line 6
    .line 7
    iget-object v3, p1, La/mq80;->b:La/mbj;

    .line 8
    .line 9
    move-wide v4, p2

    .line 10
    invoke-direct/range {v0 .. v5}, La/vn00;-><init>(JLa/mbj;J)V

    .line 11
    .line 12
    .line 13
    iget-object p2, p1, La/mq80;->d:La/enm0;

    .line 14
    .line 15
    iget-object p3, p2, La/enm0;->c:Landroid/net/Uri;

    .line 16
    .line 17
    iput-object p3, v0, La/vn00;->f:Ljava/lang/Object;

    .line 18
    .line 19
    iget-object p3, p2, La/enm0;->d:Ljava/util/Map;

    .line 20
    .line 21
    iput-object p3, v0, La/vn00;->g:Ljava/lang/Object;

    .line 22
    .line 23
    iput-wide p4, v0, La/vn00;->c:J

    .line 24
    .line 25
    iget-wide p2, p2, La/enm0;->b:J

    .line 26
    .line 27
    iput-wide p2, v0, La/vn00;->d:J

    .line 28
    .line 29
    new-instance p2, La/wn00;

    .line 30
    .line 31
    invoke-direct {p2, v0}, La/wn00;-><init>(La/vn00;)V

    .line 32
    .line 33
    .line 34
    iget-byte p1, p1, La/mq80;->c:B

    .line 35
    .line 36
    new-instance p3, La/y78;

    .line 37
    .line 38
    const/4 p4, 0x7

    .line 39
    invoke-direct {p3, p6, p7, p4}, La/y78;-><init>(Ljava/lang/Object;IB)V

    .line 40
    .line 41
    .line 42
    iget-object p4, p0, La/vuj;->c:La/x860;

    .line 43
    .line 44
    invoke-virtual {p4, p3}, La/x860;->f(La/y78;)J

    .line 45
    .line 46
    .line 47
    move-result-wide p3

    .line 48
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    cmp-long p5, p3, v0

    .line 54
    .line 55
    const/4 p7, 0x0

    .line 56
    if-nez p5, :cond_0

    .line 57
    .line 58
    const/4 p5, 0x1

    .line 59
    goto :goto_0

    .line 60
    :cond_0
    move p5, p7

    .line 61
    :goto_0
    iget-object p0, p0, La/vuj;->f:La/zhl;

    .line 62
    .line 63
    invoke-virtual {p0, p2, p1, p6, p5}, La/zhl;->e(La/wn00;ILjava/io/IOException;Z)V

    .line 64
    .line 65
    .line 66
    if-eqz p5, :cond_1

    .line 67
    .line 68
    sget-object p0, La/lhf0;->g:La/ejx;

    .line 69
    .line 70
    return-object p0

    .line 71
    :cond_1
    new-instance p0, La/ejx;

    .line 72
    .line 73
    invoke-direct {p0, p7, p3, p4}, La/ejx;-><init>(IJ)V

    .line 74
    .line 75
    .line 76
    return-object p0
.end method
