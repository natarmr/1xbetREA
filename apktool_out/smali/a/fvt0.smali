.class public final La/fvt0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/pf00;
.implements La/nae0;
.implements Lokhttp3/Callback;
.implements La/dfn0;
.implements La/xac;


# instance fields
.field public a:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 6

    .line 1
    invoke-static {}, La/wy40;->l()La/wy40;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    iput-object v0, p0, La/fvt0;->a:Ljava/lang/Object;

    .line 9
    .line 10
    sget-object v1, La/xto0;->A0:La/u15;

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    invoke-virtual {v0, v1, v2}, La/b780;->e(La/u15;Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    check-cast v3, Ljava/lang/Class;

    .line 18
    .line 19
    const-class v4, La/j4a;

    .line 20
    .line 21
    if-eqz v3, :cond_1

    .line 22
    .line 23
    invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v5

    .line 27
    if-eqz v5, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const-string v0, "Invalid target class configuration for "

    .line 31
    .line 32
    const-string v1, ": "

    .line 33
    .line 34
    invoke-static {v0, p0, v1, v3}, La/itt0;->l(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    throw v2

    .line 38
    :cond_1
    :goto_0
    invoke-virtual {v0, v1, v4}, La/wy40;->y(La/u15;Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    sget-object p0, La/xto0;->z0:La/u15;

    .line 42
    .line 43
    invoke-virtual {v0, p0, v2}, La/b780;->e(La/u15;Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    if-nez v1, :cond_2

    .line 48
    .line 49
    new-instance v1, Ljava/lang/StringBuilder;

    .line 50
    .line 51
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v4}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    const-string v2, "-"

    .line 62
    .line 63
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    invoke-virtual {v0, p0, v1}, La/wy40;->y(La/u15;Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    :cond_2
    return-void
.end method

.method public constructor <init>(La/gii0;B)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    packed-switch p2, :pswitch_data_0

    .line 83
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 84
    new-instance p2, La/zm;

    const/16 v0, 0xf

    invoke-direct {p2, p1, v0}, La/zm;-><init>(La/gii0;B)V

    iput-object p2, p0, La/fvt0;->a:Ljava/lang/Object;

    return-void

    .line 85
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 86
    new-instance p2, La/sza;

    const/4 v0, 0x7

    invoke-direct {p2, p1, v0}, La/sza;-><init>(La/gii0;B)V

    iput-object p2, p0, La/fvt0;->a:Ljava/lang/Object;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x17
        :pswitch_0
    .end packed-switch
.end method

.method public constructor <init>(La/sjl0;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 82
    iput-object p1, p0, La/fvt0;->a:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 87
    iput-object p1, p0, La/fvt0;->a:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static m(La/fvt0;FFI)V
    .locals 7

    .line 1
    iget-object v0, p0, La/fvt0;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/nr;

    .line 4
    .line 5
    and-int/lit8 v1, p3, 0x4

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, La/nr;->p()J

    .line 10
    .line 11
    .line 12
    move-result-wide v1

    .line 13
    const/16 p1, 0x20

    .line 14
    .line 15
    shr-long/2addr v1, p1

    .line 16
    long-to-int p1, v1

    .line 17
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    :cond_0
    move v4, p1

    .line 22
    and-int/lit8 p1, p3, 0x8

    .line 23
    .line 24
    if-eqz p1, :cond_1

    .line 25
    .line 26
    invoke-virtual {v0}, La/nr;->p()J

    .line 27
    .line 28
    .line 29
    move-result-wide p1

    .line 30
    const-wide v0, 0xffffffffL

    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    and-long/2addr p1, v0

    .line 36
    long-to-int p1, p1

    .line 37
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 38
    .line 39
    .line 40
    move-result p2

    .line 41
    :cond_1
    move v5, p2

    .line 42
    const/4 v6, 0x1

    .line 43
    const/4 v2, 0x0

    .line 44
    const/4 v3, 0x0

    .line 45
    move-object v1, p0

    .line 46
    invoke-virtual/range {v1 .. v6}, La/fvt0;->k(FFFFI)V

    .line 47
    .line 48
    .line 49
    return-void
.end method


# virtual methods
.method public A(FF)V
    .locals 0

    .line 1
    iget-object p0, p0, La/fvt0;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/nr;

    .line 4
    .line 5
    invoke-virtual {p0}, La/nr;->i()La/x5a;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-interface {p0, p1, p2}, La/x5a;->g(FF)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public a(J)I
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long p0, p1, v0

    .line 4
    .line 5
    if-gez p0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x0

    .line 8
    return p0

    .line 9
    :cond_0
    const/4 p0, -0x1

    .line 10
    return p0
.end method

.method public b(Lokhttp3/Call;Ljava/io/IOException;)V
    .locals 0

    .line 1
    iget-object p0, p0, La/fvt0;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/n5a;

    .line 4
    .line 5
    sget-object p1, La/j0g0;->b:La/e0g0;

    .line 6
    .line 7
    new-instance p1, La/g0g0;

    .line 8
    .line 9
    invoke-direct {p1, p2}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, p1}, La/n5a;->resumeWith(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public c(II)V
    .locals 0

    .line 1
    iget-object p0, p0, La/fvt0;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/yge0;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, La/yge0;->k(II)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public d(II)V
    .locals 0

    .line 1
    iget-object p0, p0, La/fvt0;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/yge0;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, La/yge0;->l(II)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public e(J)Ljava/util/List;
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long p1, p1, v0

    .line 4
    .line 5
    if-ltz p1, :cond_0

    .line 6
    .line 7
    iget-object p0, p0, La/fvt0;->a:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p0, Ljava/util/List;

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    sget-object p0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 13
    .line 14
    return-object p0
.end method

.method public f(IILjava/lang/Object;)V
    .locals 0

    .line 1
    iget-object p0, p0, La/fvt0;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/yge0;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2, p3}, La/yge0;->j(IILjava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public g(II)V
    .locals 0

    .line 1
    iget-object p0, p0, La/fvt0;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/yge0;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, La/yge0;->i(II)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public h(Lokhttp3/Call;Lokhttp3/Response;)V
    .locals 0

    .line 1
    iget-object p0, p0, La/fvt0;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/n5a;

    .line 4
    .line 5
    sget-object p1, La/tv9;->b:La/tv9;

    .line 6
    .line 7
    invoke-virtual {p0, p2, p1}, La/n5a;->v(Ljava/lang/Object;La/xdr;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public i(La/w03;)V
    .locals 0

    .line 1
    iget-object p0, p0, La/fvt0;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/nr;

    .line 4
    .line 5
    invoke-virtual {p0}, La/nr;->i()La/x5a;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-interface {p0, p1}, La/x5a;->c(La/w03;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public j(I)J
    .locals 0

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x1

    .line 4
    goto :goto_0

    .line 5
    :cond_0
    const/4 p0, 0x0

    .line 6
    :goto_0
    invoke-static {p0}, La/x0x;->A(Z)V

    .line 7
    .line 8
    .line 9
    const-wide/16 p0, 0x0

    .line 10
    .line 11
    return-wide p0
.end method

.method public k(FFFFI)V
    .locals 6

    .line 1
    iget-object p0, p0, La/fvt0;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/nr;

    .line 4
    .line 5
    invoke-virtual {p0}, La/nr;->i()La/x5a;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    move v1, p1

    .line 10
    move v2, p2

    .line 11
    move v3, p3

    .line 12
    move v4, p4

    .line 13
    move v5, p5

    .line 14
    invoke-interface/range {v0 .. v5}, La/x5a;->f(FFFFI)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public l()I
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public bridge synthetic n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p2, Landroidx/fragment/app/Fragment;

    .line 2
    .line 3
    invoke-virtual {p0, p2, p1}, La/fvt0;->t(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Boolean;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public o()La/kki;
    .locals 6

    .line 1
    iget-object p0, p0, La/fvt0;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/esg0;

    .line 4
    .line 5
    new-instance v0, La/kki;

    .line 6
    .line 7
    iget-object v1, p0, La/esg0;->a:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, La/rkc0;

    .line 10
    .line 11
    iget-object v2, p0, La/esg0;->b:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v2, La/fhj;

    .line 14
    .line 15
    iget-object v3, p0, La/esg0;->c:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v3, La/ntu;

    .line 18
    .line 19
    iget-object v4, p0, La/esg0;->d:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v4, La/iqt;

    .line 22
    .line 23
    iget-object p0, p0, La/esg0;->e:Ljava/lang/Object;

    .line 24
    .line 25
    move-object v5, p0

    .line 26
    check-cast v5, La/wtt;

    .line 27
    .line 28
    invoke-direct/range {v0 .. v5}, La/kki;-><init>(La/rkc0;La/fhj;La/ntu;La/iqt;La/wtt;)V

    .line 29
    .line 30
    .line 31
    return-object v0
.end method

.method public p()La/wyb;
    .locals 1

    .line 1
    iget-object p0, p0, La/fvt0;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/h7i;

    .line 4
    .line 5
    new-instance v0, La/wyb;

    .line 6
    .line 7
    invoke-virtual {p0}, La/h7i;->a()La/wsf0;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-direct {v0, p0}, La/wyb;-><init>(La/wsf0;)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method

.method public q()La/uut0;
    .locals 5

    .line 1
    sget-object v0, La/uut0;->j:Ljava/util/List;

    .line 2
    .line 3
    iget-object p0, p0, La/fvt0;->a:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, La/nmt0;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    new-instance v0, Ljava/util/HashMap;

    .line 11
    .line 12
    sget-object v1, La/uut0;->j:Ljava/util/List;

    .line 13
    .line 14
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    invoke-direct {v0, v2}, Ljava/util/HashMap;-><init>(I)V

    .line 19
    .line 20
    .line 21
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    const/4 v3, 0x0

    .line 30
    if-eqz v2, :cond_1

    .line 31
    .line 32
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    check-cast v2, Ljava/lang/String;

    .line 37
    .line 38
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    iget-object v4, p0, La/nmt0;->a:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v4, Landroid/content/SharedPreferences;

    .line 44
    .line 45
    invoke-interface {v4, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    if-eqz v3, :cond_0

    .line 50
    .line 51
    invoke-virtual {v0, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_1
    const-string p0, "access_token"

    .line 56
    .line 57
    invoke-virtual {v0, p0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result p0

    .line 61
    if-eqz p0, :cond_2

    .line 62
    .line 63
    const-string p0, "user_id"

    .line 64
    .line 65
    invoke-virtual {v0, p0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result p0

    .line 69
    if-eqz p0, :cond_2

    .line 70
    .line 71
    new-instance p0, La/uut0;

    .line 72
    .line 73
    invoke-direct {p0, v0}, La/uut0;-><init>(Ljava/util/HashMap;)V

    .line 74
    .line 75
    .line 76
    return-object p0

    .line 77
    :cond_2
    return-object v3
.end method

.method public r()La/hsj;
    .locals 8

    .line 1
    iget-object p0, p0, La/fvt0;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/h7i;

    .line 4
    .line 5
    new-instance v0, La/hsj;

    .line 6
    .line 7
    iget-object v1, p0, La/h7i;->c:La/j1q0;

    .line 8
    .line 9
    new-instance v2, La/n31;

    .line 10
    .line 11
    new-instance v3, La/xzp;

    .line 12
    .line 13
    iget-object v4, p0, La/h7i;->h:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v4, La/gii0;

    .line 16
    .line 17
    iget-object v5, p0, La/h7i;->i:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v5, La/x2c0;

    .line 20
    .line 21
    invoke-direct {v3, v4, v5}, La/xzp;-><init>(La/gii0;La/x2c0;)V

    .line 22
    .line 23
    .line 24
    iget-object v4, p0, La/h7i;->j:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v4, La/knf0;

    .line 27
    .line 28
    iget-object v5, p0, La/h7i;->k:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v5, La/j51;

    .line 31
    .line 32
    iget-object v6, p0, La/h7i;->i:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v6, La/x2c0;

    .line 35
    .line 36
    iget-object p0, p0, La/h7i;->l:Ljava/lang/Object;

    .line 37
    .line 38
    move-object v7, p0

    .line 39
    check-cast v7, La/btt0;

    .line 40
    .line 41
    invoke-direct/range {v2 .. v7}, La/n31;-><init>(La/xzp;La/knf0;La/j51;La/x2c0;La/btt0;)V

    .line 42
    .line 43
    .line 44
    invoke-direct {v0, v1, v2}, La/hsj;-><init>(La/j1q0;La/n31;)V

    .line 45
    .line 46
    .line 47
    return-object v0
.end method

.method public s(ILa/zje;)Ljava/io/Serializable;
    .locals 10

    .line 1
    instance-of v0, p2, La/tq1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/tq1;

    .line 7
    .line 8
    iget v1, v0, La/tq1;->o:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La/tq1;->o:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/tq1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, La/tq1;-><init>(La/fvt0;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, La/tq1;->m:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/tq1;->o:I

    .line 30
    .line 31
    const/4 v3, 0x2

    .line 32
    const/4 v4, 0x0

    .line 33
    const/4 v5, 0x1

    .line 34
    if-eqz v2, :cond_4

    .line 35
    .line 36
    if-eq v2, v5, :cond_3

    .line 37
    .line 38
    if-ne v2, v3, :cond_2

    .line 39
    .line 40
    iget p0, v0, La/tq1;->k:I

    .line 41
    .line 42
    iget p1, v0, La/tq1;->j:I

    .line 43
    .line 44
    iget v2, v0, La/tq1;->i:I

    .line 45
    .line 46
    iget-object v6, v0, La/tq1;->l:La/fvt0;

    .line 47
    .line 48
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    :cond_1
    move p2, v2

    .line 52
    move-object v2, v0

    .line 53
    move v0, p1

    .line 54
    move p1, p0

    .line 55
    move-object p0, v6

    .line 56
    goto :goto_1

    .line 57
    :cond_2
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 58
    .line 59
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    const/4 p0, 0x0

    .line 63
    return-object p0

    .line 64
    :cond_3
    iget p0, v0, La/tq1;->k:I

    .line 65
    .line 66
    iget p1, v0, La/tq1;->j:I

    .line 67
    .line 68
    iget v2, v0, La/tq1;->i:I

    .line 69
    .line 70
    iget-object v6, v0, La/tq1;->l:La/fvt0;

    .line 71
    .line 72
    :try_start_0
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 73
    .line 74
    .line 75
    goto :goto_2

    .line 76
    :catchall_0
    move-exception p2

    .line 77
    goto/16 :goto_4

    .line 78
    .line 79
    :cond_4
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    move p2, p1

    .line 83
    move-object v2, v0

    .line 84
    move p1, v4

    .line 85
    move v0, p1

    .line 86
    :goto_1
    :try_start_1
    sget-object v6, La/j0g0;->b:La/e0g0;

    .line 87
    .line 88
    iget-object v6, p0, La/fvt0;->a:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v6, La/yzn0;

    .line 91
    .line 92
    iput-object p0, v2, La/tq1;->l:La/fvt0;

    .line 93
    .line 94
    iput p2, v2, La/tq1;->i:I

    .line 95
    .line 96
    iput v0, v2, La/tq1;->j:I

    .line 97
    .line 98
    iput p1, v2, La/tq1;->k:I

    .line 99
    .line 100
    iput v5, v2, La/tq1;->o:I

    .line 101
    .line 102
    iget-object v6, v6, La/yzn0;->b:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast v6, La/nc;

    .line 105
    .line 106
    invoke-virtual {v6}, La/nc;->invoke()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v6

    .line 110
    check-cast v6, La/ar1;

    .line 111
    .line 112
    new-instance v7, Ljava/lang/Integer;

    .line 113
    .line 114
    invoke-direct {v7, p2}, Ljava/lang/Integer;-><init>(I)V

    .line 115
    .line 116
    .line 117
    new-instance v8, La/fk9;

    .line 118
    .line 119
    invoke-direct {v8, v4}, La/fk9;-><init>(Z)V

    .line 120
    .line 121
    .line 122
    invoke-interface {v6, v7, v8, v2}, La/ar1;->a(Ljava/lang/Integer;La/fk9;La/yje;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 126
    if-ne v6, v1, :cond_5

    .line 127
    .line 128
    goto/16 :goto_8

    .line 129
    .line 130
    :cond_5
    move-object v9, v6

    .line 131
    move-object v6, p0

    .line 132
    move p0, p1

    .line 133
    move p1, v0

    .line 134
    move-object v0, v2

    .line 135
    move v2, p2

    .line 136
    move-object p2, v9

    .line 137
    :goto_2
    :try_start_2
    check-cast p2, La/dx5;

    .line 138
    .line 139
    invoke-virtual {p2}, La/dx5;->a()Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object p2

    .line 143
    check-cast p2, La/dr1;

    .line 144
    .line 145
    invoke-static {p2}, La/kc5;->R0(La/dr1;)Ljava/util/ArrayList;

    .line 146
    .line 147
    .line 148
    move-result-object p2

    .line 149
    sget-object p0, La/j0g0;->b:La/e0g0;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 150
    .line 151
    goto/16 :goto_a

    .line 152
    .line 153
    :goto_3
    move-object v9, v6

    .line 154
    move-object v6, p0

    .line 155
    move p0, p1

    .line 156
    move p1, v0

    .line 157
    move-object v0, v2

    .line 158
    move v2, p2

    .line 159
    move-object p2, v9

    .line 160
    goto :goto_4

    .line 161
    :catchall_1
    move-exception v6

    .line 162
    goto :goto_3

    .line 163
    :goto_4
    if-eqz p1, :cond_6

    .line 164
    .line 165
    instance-of v7, p2, La/zhi0;

    .line 166
    .line 167
    if-eqz v7, :cond_6

    .line 168
    .line 169
    move-object v7, p2

    .line 170
    check-cast v7, La/zhi0;

    .line 171
    .line 172
    iget-boolean v7, v7, La/zhi0;->e:Z

    .line 173
    .line 174
    if-eqz v7, :cond_6

    .line 175
    .line 176
    move v7, v5

    .line 177
    goto :goto_5

    .line 178
    :cond_6
    move v7, v4

    .line 179
    :goto_5
    instance-of v8, p2, Ljava/util/concurrent/CancellationException;

    .line 180
    .line 181
    if-nez v8, :cond_c

    .line 182
    .line 183
    instance-of v8, p2, Ljava/net/ConnectException;

    .line 184
    .line 185
    if-nez v8, :cond_c

    .line 186
    .line 187
    if-nez v7, :cond_c

    .line 188
    .line 189
    instance-of v7, p2, La/zhi0;

    .line 190
    .line 191
    if-eqz v7, :cond_9

    .line 192
    .line 193
    move-object v7, p2

    .line 194
    check-cast v7, La/zhi0;

    .line 195
    .line 196
    iget-boolean v8, v7, La/zhi0;->f:Z

    .line 197
    .line 198
    if-nez v8, :cond_8

    .line 199
    .line 200
    iget-boolean v7, v7, La/zhi0;->e:Z

    .line 201
    .line 202
    if-eqz v7, :cond_7

    .line 203
    .line 204
    goto :goto_6

    .line 205
    :cond_7
    move v7, v4

    .line 206
    goto :goto_7

    .line 207
    :cond_8
    :goto_6
    move v7, v5

    .line 208
    goto :goto_7

    .line 209
    :cond_9
    invoke-static {p2}, La/hic;->C(Ljava/lang/Throwable;)Z

    .line 210
    .line 211
    .line 212
    move-result v7

    .line 213
    if-nez v7, :cond_7

    .line 214
    .line 215
    goto :goto_6

    .line 216
    :goto_7
    add-int/2addr p0, v5

    .line 217
    const/4 v8, 0x3

    .line 218
    if-gt p0, v8, :cond_b

    .line 219
    .line 220
    if-eqz v7, :cond_a

    .line 221
    .line 222
    goto :goto_9

    .line 223
    :cond_a
    const-string v7, "error ("

    .line 224
    .line 225
    const-string v8, "): "

    .line 226
    .line 227
    invoke-static {p0, v7, v8, p2}, La/b1j;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)Ljava/lang/String;

    .line 228
    .line 229
    .line 230
    move-result-object p2

    .line 231
    sget-object v7, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 232
    .line 233
    invoke-virtual {v7, p2}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 234
    .line 235
    .line 236
    iput-object v6, v0, La/tq1;->l:La/fvt0;

    .line 237
    .line 238
    iput v2, v0, La/tq1;->i:I

    .line 239
    .line 240
    iput p1, v0, La/tq1;->j:I

    .line 241
    .line 242
    iput p0, v0, La/tq1;->k:I

    .line 243
    .line 244
    iput v3, v0, La/tq1;->o:I

    .line 245
    .line 246
    const-wide/16 v7, 0xbb8

    .line 247
    .line 248
    invoke-static {v7, v8, v0}, La/qcc;->O(JLa/yje;)Ljava/lang/Object;

    .line 249
    .line 250
    .line 251
    move-result-object p2

    .line 252
    if-ne p2, v1, :cond_1

    .line 253
    .line 254
    :goto_8
    return-object v1

    .line 255
    :cond_b
    :goto_9
    sget-object p0, La/j0g0;->b:La/e0g0;

    .line 256
    .line 257
    new-instance p0, La/g0g0;

    .line 258
    .line 259
    invoke-direct {p0, p2}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 260
    .line 261
    .line 262
    move-object p2, p0

    .line 263
    :goto_a
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 264
    .line 265
    .line 266
    return-object p2

    .line 267
    :cond_c
    throw p2
.end method

.method public t(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Boolean;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iget-object p2, p0, La/fvt0;->a:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p2, Ljava/lang/Boolean;

    .line 10
    .line 11
    if-eqz p2, :cond_0

    .line 12
    .line 13
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    goto :goto_1

    .line 18
    :cond_0
    iget-object p1, p1, Landroidx/fragment/app/Fragment;->g:Landroid/os/Bundle;

    .line 19
    .line 20
    const/4 p2, 0x0

    .line 21
    if-eqz p1, :cond_1

    .line 22
    .line 23
    const-string v0, "FULL_SCREEN_ANIMATION_FIX"

    .line 24
    .line 25
    invoke-virtual {p1, v0, p2}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    goto :goto_0

    .line 34
    :cond_1
    const/4 p1, 0x0

    .line 35
    :goto_0
    iput-object p1, p0, La/fvt0;->a:Ljava/lang/Object;

    .line 36
    .line 37
    if-eqz p1, :cond_2

    .line 38
    .line 39
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 40
    .line 41
    .line 42
    move-result p0

    .line 43
    goto :goto_1

    .line 44
    :cond_2
    move p0, p2

    .line 45
    :goto_1
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    return-object p0
.end method

.method public u(FFFF)V
    .locals 8

    .line 1
    iget-object p0, p0, La/fvt0;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/nr;

    .line 4
    .line 5
    invoke-virtual {p0}, La/nr;->i()La/x5a;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p0}, La/nr;->p()J

    .line 10
    .line 11
    .line 12
    move-result-wide v1

    .line 13
    const/16 v3, 0x20

    .line 14
    .line 15
    shr-long/2addr v1, v3

    .line 16
    long-to-int v1, v1

    .line 17
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    add-float/2addr p3, p1

    .line 22
    sub-float/2addr v1, p3

    .line 23
    invoke-virtual {p0}, La/nr;->p()J

    .line 24
    .line 25
    .line 26
    move-result-wide v4

    .line 27
    const-wide v6, 0xffffffffL

    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    and-long/2addr v4, v6

    .line 33
    long-to-int p3, v4

    .line 34
    invoke-static {p3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 35
    .line 36
    .line 37
    move-result p3

    .line 38
    add-float/2addr p4, p2

    .line 39
    sub-float/2addr p3, p4

    .line 40
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 41
    .line 42
    .line 43
    move-result p4

    .line 44
    int-to-long v1, p4

    .line 45
    invoke-static {p3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 46
    .line 47
    .line 48
    move-result p3

    .line 49
    int-to-long p3, p3

    .line 50
    shl-long/2addr v1, v3

    .line 51
    and-long/2addr p3, v6

    .line 52
    or-long/2addr p3, v1

    .line 53
    shr-long v1, p3, v3

    .line 54
    .line 55
    long-to-int v1, v1

    .line 56
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    const/4 v2, 0x0

    .line 61
    cmpl-float v1, v1, v2

    .line 62
    .line 63
    if-ltz v1, :cond_0

    .line 64
    .line 65
    and-long v3, p3, v6

    .line 66
    .line 67
    long-to-int v1, v3

    .line 68
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    cmpl-float v1, v1, v2

    .line 73
    .line 74
    if-ltz v1, :cond_0

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_0
    const-string v1, "Width and height must be greater than or equal to zero"

    .line 78
    .line 79
    invoke-static {v1}, La/wcx;->a(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    :goto_0
    invoke-virtual {p0, p3, p4}, La/nr;->H(J)V

    .line 83
    .line 84
    .line 85
    invoke-interface {v0, p1, p2}, La/x5a;->g(FF)V

    .line 86
    .line 87
    .line 88
    return-void
.end method

.method public v(JLa/zje;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p3, La/k3c;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, La/k3c;

    .line 7
    .line 8
    iget v1, v0, La/k3c;->k:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La/k3c;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/k3c;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, La/k3c;-><init>(La/fvt0;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, La/k3c;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/k3c;->k:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 41
    .line 42
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    const/4 p0, 0x0

    .line 46
    return-object p0

    .line 47
    :cond_2
    invoke-static {p3}, La/z1x;->P(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    iget-object p0, p0, La/fvt0;->a:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast p0, La/sjl0;

    .line 53
    .line 54
    iput v3, v0, La/k3c;->k:I

    .line 55
    .line 56
    invoke-virtual {p0, p1, p2, v0}, La/sjl0;->c(JLa/zje;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p3

    .line 60
    if-ne p3, v1, :cond_3

    .line 61
    .line 62
    return-object v1

    .line 63
    :cond_3
    :goto_1
    check-cast p3, La/ril0;

    .line 64
    .line 65
    iget-boolean p0, p3, La/ril0;->e:Z

    .line 66
    .line 67
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    return-object p0
.end method

.method public w(La/npn;La/zje;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-object v0, p1, La/npn;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/lang/Long;

    .line 4
    .line 5
    iget-wide v1, p1, La/npn;->a:J

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    new-instance v3, La/qgb;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 12
    .line 13
    .line 14
    move-result-wide v4

    .line 15
    invoke-direct {v3, v1, v2, v4, v5}, La/qgb;-><init>(JJ)V

    .line 16
    .line 17
    .line 18
    :goto_0
    move-object v8, v3

    .line 19
    goto :goto_1

    .line 20
    :cond_0
    new-instance v3, La/rgb;

    .line 21
    .line 22
    invoke-direct {v3, v1, v2}, La/rgb;-><init>(J)V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :goto_1
    iget-object p0, p0, La/fvt0;->a:Ljava/lang/Object;

    .line 27
    .line 28
    move-object v4, p0

    .line 29
    check-cast v4, La/nr;

    .line 30
    .line 31
    iget-wide v5, p1, La/npn;->c:J

    .line 32
    .line 33
    iget-boolean v7, p1, La/npn;->b:Z

    .line 34
    .line 35
    move-object v9, p2

    .line 36
    invoke-virtual/range {v4 .. v9}, La/nr;->u(JZLa/sgb;La/zje;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    sget-object p1, La/wne;->a:La/wne;

    .line 41
    .line 42
    if-ne p0, p1, :cond_1

    .line 43
    .line 44
    return-object p0

    .line 45
    :cond_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 46
    .line 47
    return-object p0
.end method

.method public x(J)V
    .locals 0

    .line 1
    iget-object p0, p0, La/fvt0;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/mii0;

    .line 4
    .line 5
    iget-object p0, p0, La/mii0;->d:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, La/ev7;

    .line 8
    .line 9
    iput-wide p1, p0, La/ev7;->b:J

    .line 10
    .line 11
    return-void
.end method

.method public y(FJ)V
    .locals 4

    .line 1
    iget-object p0, p0, La/fvt0;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/nr;

    .line 4
    .line 5
    invoke-virtual {p0}, La/nr;->i()La/x5a;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const/16 v0, 0x20

    .line 10
    .line 11
    shr-long v0, p2, v0

    .line 12
    .line 13
    long-to-int v0, v0

    .line 14
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    const-wide v2, 0xffffffffL

    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    and-long/2addr p2, v2

    .line 24
    long-to-int p2, p2

    .line 25
    invoke-static {p2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 26
    .line 27
    .line 28
    move-result p3

    .line 29
    invoke-interface {p0, v1, p3}, La/x5a;->g(FF)V

    .line 30
    .line 31
    .line 32
    invoke-interface {p0, p1}, La/x5a;->k(F)V

    .line 33
    .line 34
    .line 35
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    neg-float p1, p1

    .line 40
    invoke-static {p2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 41
    .line 42
    .line 43
    move-result p2

    .line 44
    neg-float p2, p2

    .line 45
    invoke-interface {p0, p1, p2}, La/x5a;->g(FF)V

    .line 46
    .line 47
    .line 48
    return-void
.end method

.method public z(FFJ)V
    .locals 4

    .line 1
    iget-object p0, p0, La/fvt0;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/nr;

    .line 4
    .line 5
    invoke-virtual {p0}, La/nr;->i()La/x5a;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const/16 v0, 0x20

    .line 10
    .line 11
    shr-long v0, p3, v0

    .line 12
    .line 13
    long-to-int v0, v0

    .line 14
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    const-wide v2, 0xffffffffL

    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    and-long/2addr p3, v2

    .line 24
    long-to-int p3, p3

    .line 25
    invoke-static {p3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 26
    .line 27
    .line 28
    move-result p4

    .line 29
    invoke-interface {p0, v1, p4}, La/x5a;->g(FF)V

    .line 30
    .line 31
    .line 32
    invoke-interface {p0, p1, p2}, La/x5a;->a(FF)V

    .line 33
    .line 34
    .line 35
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    neg-float p1, p1

    .line 40
    invoke-static {p3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 41
    .line 42
    .line 43
    move-result p2

    .line 44
    neg-float p2, p2

    .line 45
    invoke-interface {p0, p1, p2}, La/x5a;->g(FF)V

    .line 46
    .line 47
    .line 48
    return-void
.end method
