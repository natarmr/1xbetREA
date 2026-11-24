.class public final La/r34;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/nae0;
.implements La/vmb0;
.implements La/cy9;


# instance fields
.field public a:J

.field public b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(B)V
    .locals 2

    .line 1
    packed-switch p1, :pswitch_data_0

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    const-wide/16 v0, 0x0

    .line 8
    .line 9
    iput-wide v0, p0, La/r34;->a:J

    .line 10
    .line 11
    sget-object p1, La/bmq0;->a:La/zlq0;

    .line 12
    .line 13
    iput-object p1, p0, La/r34;->b:Ljava/lang/Object;

    .line 14
    .line 15
    const/4 p1, 0x0

    .line 16
    iput-object p1, p0, La/r34;->c:Ljava/lang/Object;

    .line 17
    .line 18
    return-void

    .line 19
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    .line 21
    .line 22
    sget-object p1, La/h6u0;->a:La/h6u0;

    .line 23
    .line 24
    new-instance p1, La/i6u0;

    .line 25
    .line 26
    invoke-direct {p1}, La/i6u0;-><init>()V

    .line 27
    .line 28
    .line 29
    iput-object p1, p0, La/r34;->b:Ljava/lang/Object;

    .line 30
    .line 31
    new-instance p1, La/i6u0;

    .line 32
    .line 33
    invoke-direct {p1}, La/i6u0;-><init>()V

    .line 34
    .line 35
    .line 36
    iput-object p1, p0, La/r34;->c:Ljava/lang/Object;

    .line 37
    .line 38
    return-void

    .line 39
    :pswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    .line 41
    .line 42
    new-instance p1, La/dpf;

    .line 43
    .line 44
    const/16 v0, 0x8

    .line 45
    .line 46
    invoke-direct {p1, v0}, La/dpf;-><init>(B)V

    .line 47
    .line 48
    .line 49
    sget-object v0, La/wez;->b:La/wez;

    .line 50
    .line 51
    invoke-static {v0, p1}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    iput-object p1, p0, La/r34;->b:Ljava/lang/Object;

    .line 56
    .line 57
    new-instance p1, La/dpf;

    .line 58
    .line 59
    const/16 v1, 0x9

    .line 60
    .line 61
    invoke-direct {p1, v1}, La/dpf;-><init>(B)V

    .line 62
    .line 63
    .line 64
    invoke-static {v0, p1}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    iput-object p1, p0, La/r34;->c:Ljava/lang/Object;

    .line 69
    .line 70
    return-void

    .line 71
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public constructor <init>(La/cy9;La/eoo0;J)V
    .locals 0

    .line 74
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 75
    iput-object p1, p0, La/r34;->b:Ljava/lang/Object;

    .line 76
    iput-object p2, p0, La/r34;->c:Ljava/lang/Object;

    .line 77
    iput-wide p3, p0, La/r34;->a:J

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 2

    .line 78
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 79
    iput-object p1, p0, La/r34;->b:Ljava/lang/Object;

    const-wide/high16 v0, -0x8000000000000000L

    .line 80
    iput-wide v0, p0, La/r34;->a:J

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;J)V
    .locals 0

    .line 71
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 72
    iput-object p1, p0, La/r34;->b:Ljava/lang/Object;

    .line 73
    iput-wide p2, p0, La/r34;->a:J

    return-void
.end method


# virtual methods
.method public a(La/mkx;JLa/k6z;J)J
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iget-object p1, p0, La/r34;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p1, La/w6k;

    .line 10
    .line 11
    sget-object p2, La/qmk;->a:La/zcl;

    .line 12
    .line 13
    const/high16 p2, 0x41800000    # 16.0f

    .line 14
    .line 15
    invoke-interface {p1, p2}, La/w6k;->T(F)I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    sget-object p2, La/k6z;->a:La/k6z;

    .line 20
    .line 21
    iget-wide v0, p0, La/r34;->a:J

    .line 22
    .line 23
    const/16 p3, 0x20

    .line 24
    .line 25
    if-ne p4, p2, :cond_0

    .line 26
    .line 27
    shr-long v2, v0, p3

    .line 28
    .line 29
    long-to-int p2, v2

    .line 30
    invoke-static {p2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 31
    .line 32
    .line 33
    move-result p2

    .line 34
    iget-object p0, p0, La/r34;->c:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast p0, La/j6z;

    .line 37
    .line 38
    invoke-interface {p0}, La/j6z;->g()J

    .line 39
    .line 40
    .line 41
    move-result-wide v2

    .line 42
    shr-long/2addr v2, p3

    .line 43
    long-to-int p0, v2

    .line 44
    int-to-float p0, p0

    .line 45
    add-float/2addr p2, p0

    .line 46
    int-to-float p0, p1

    .line 47
    add-float/2addr p2, p0

    .line 48
    shr-long p0, p5, p3

    .line 49
    .line 50
    long-to-int p0, p0

    .line 51
    int-to-float p0, p0

    .line 52
    sub-float/2addr p2, p0

    .line 53
    float-to-int p0, p2

    .line 54
    goto :goto_0

    .line 55
    :cond_0
    shr-long v2, v0, p3

    .line 56
    .line 57
    long-to-int p0, v2

    .line 58
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 59
    .line 60
    .line 61
    move-result p0

    .line 62
    int-to-float p1, p1

    .line 63
    sub-float/2addr p0, p1

    .line 64
    float-to-int p0, p0

    .line 65
    :goto_0
    const-wide p1, 0xffffffffL

    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    and-long/2addr v0, p1

    .line 71
    long-to-int p4, v0

    .line 72
    invoke-static {p4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 73
    .line 74
    .line 75
    move-result p4

    .line 76
    and-long/2addr p5, p1

    .line 77
    long-to-int p5, p5

    .line 78
    int-to-float p5, p5

    .line 79
    sub-float/2addr p4, p5

    .line 80
    float-to-int p4, p4

    .line 81
    int-to-long p5, p0

    .line 82
    shl-long/2addr p5, p3

    .line 83
    int-to-long p3, p4

    .line 84
    and-long p0, p3, p1

    .line 85
    .line 86
    or-long/2addr p0, p5

    .line 87
    return-wide p0
.end method

.method public b(JJ)V
    .locals 3

    .line 1
    iget-object v0, p0, La/r34;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/i6u0;

    .line 4
    .line 5
    const/16 v1, 0x20

    .line 6
    .line 7
    shr-long v1, p3, v1

    .line 8
    .line 9
    long-to-int v1, v1

    .line 10
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    invoke-virtual {v0, v1, p1, p2}, La/i6u0;->a(FJ)V

    .line 15
    .line 16
    .line 17
    iget-object p0, p0, La/r34;->c:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast p0, La/i6u0;

    .line 20
    .line 21
    const-wide v0, 0xffffffffL

    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    and-long/2addr p3, v0

    .line 27
    long-to-int p3, p3

    .line 28
    invoke-static {p3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 29
    .line 30
    .line 31
    move-result p3

    .line 32
    invoke-virtual {p0, p3, p1, p2}, La/i6u0;->a(FJ)V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public c()I
    .locals 0

    .line 1
    iget-object p0, p0, La/r34;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/cy9;

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    invoke-interface {p0}, La/cy9;->c()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0

    .line 12
    :cond_0
    const/4 p0, 0x1

    .line 13
    return p0
.end method

.method public d()La/s34;
    .locals 2

    .line 1
    iget-object v0, p0, La/r34;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/bmq0;

    .line 4
    .line 5
    invoke-virtual {v0}, La/bmq0;->p()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    iget-object v0, p0, La/r34;->c:Ljava/lang/Object;

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    iget-object v1, p0, La/r34;->b:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v1, La/bmq0;

    .line 18
    .line 19
    invoke-virtual {v1, v0}, La/bmq0;->b(Ljava/lang/Object;)I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    const/4 v1, -0x1

    .line 24
    if-eq v0, v1, :cond_0

    .line 25
    .line 26
    const/4 v0, 0x1

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 v0, 0x0

    .line 29
    :goto_0
    invoke-static {v0}, La/x0x;->A(Z)V

    .line 30
    .line 31
    .line 32
    :cond_1
    new-instance v0, La/s34;

    .line 33
    .line 34
    invoke-direct {v0, p0}, La/s34;-><init>(La/r34;)V

    .line 35
    .line 36
    .line 37
    return-object v0
.end method

.method public e(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Long;
    .locals 2

    .line 1
    iget-wide v0, p0, La/r34;->a:J

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iget-object p2, p0, La/r34;->c:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p2, Ljava/lang/Long;

    .line 12
    .line 13
    if-eqz p2, :cond_0

    .line 14
    .line 15
    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    .line 16
    .line 17
    .line 18
    move-result-wide v0

    .line 19
    goto :goto_1

    .line 20
    :cond_0
    iget-object p1, p1, Landroidx/fragment/app/Fragment;->g:Landroid/os/Bundle;

    .line 21
    .line 22
    if-eqz p1, :cond_1

    .line 23
    .line 24
    iget-object p2, p0, La/r34;->b:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast p2, Ljava/lang/String;

    .line 27
    .line 28
    invoke-virtual {p1, p2, v0, v1}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    .line 29
    .line 30
    .line 31
    move-result-wide p1

    .line 32
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    goto :goto_0

    .line 37
    :cond_1
    const/4 p1, 0x0

    .line 38
    :goto_0
    iput-object p1, p0, La/r34;->c:Ljava/lang/Object;

    .line 39
    .line 40
    if-eqz p1, :cond_2

    .line 41
    .line 42
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 43
    .line 44
    .line 45
    move-result-wide v0

    .line 46
    :cond_2
    :goto_1
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    return-object p0
.end method

.method public f()La/eoo0;
    .locals 0

    .line 1
    iget-object p0, p0, La/r34;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/eoo0;

    .line 4
    .line 5
    return-object p0
.end method

.method public h()J
    .locals 4

    .line 1
    iget-object v0, p0, La/r34;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/cy9;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-interface {v0}, La/cy9;->h()J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    return-wide v0

    .line 12
    :cond_0
    iget-wide v0, p0, La/r34;->a:J

    .line 13
    .line 14
    const-wide/16 v2, -0x1

    .line 15
    .line 16
    cmp-long p0, v0, v2

    .line 17
    .line 18
    if-eqz p0, :cond_1

    .line 19
    .line 20
    return-wide v0

    .line 21
    :cond_1
    const-string p0, "No timestamp is available."

    .line 22
    .line 23
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const-wide/16 v0, 0x0

    .line 27
    .line 28
    return-wide v0
.end method

.method public i(La/jr30;La/dyw;Ljava/util/Map;J)V
    .locals 6

    .line 1
    iget-object v0, p0, La/r34;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/dr8;

    .line 4
    .line 5
    iget-wide v1, v0, La/dr8;->a:J

    .line 6
    .line 7
    iget-object v3, v0, La/dr8;->c:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v3, Ljava/util/LinkedHashMap;

    .line 10
    .line 11
    cmp-long v1, p4, v1

    .line 12
    .line 13
    if-gtz v1, :cond_1

    .line 14
    .line 15
    new-instance p0, La/obe0;

    .line 16
    .line 17
    invoke-direct {p0, p2, p3, p4, p5}, La/obe0;-><init>(La/dyw;Ljava/util/Map;J)V

    .line 18
    .line 19
    .line 20
    invoke-interface {v3, p1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    invoke-virtual {v0}, La/dr8;->l()J

    .line 25
    .line 26
    .line 27
    move-result-wide p3

    .line 28
    invoke-virtual {v0, p1, p0}, La/dr8;->o(Ljava/lang/Object;Ljava/lang/Object;)J

    .line 29
    .line 30
    .line 31
    move-result-wide v1

    .line 32
    add-long/2addr v1, p3

    .line 33
    iput-wide v1, v0, La/dr8;->b:J

    .line 34
    .line 35
    if-eqz p2, :cond_0

    .line 36
    .line 37
    invoke-virtual {v0}, La/dr8;->l()J

    .line 38
    .line 39
    .line 40
    move-result-wide p3

    .line 41
    invoke-virtual {v0, p1, p2}, La/dr8;->o(Ljava/lang/Object;Ljava/lang/Object;)J

    .line 42
    .line 43
    .line 44
    move-result-wide v1

    .line 45
    sub-long/2addr p3, v1

    .line 46
    iput-wide p3, v0, La/dr8;->b:J

    .line 47
    .line 48
    invoke-virtual {v0, p1, p2, p0}, La/dr8;->k(Ljava/lang/Object;Ljava/lang/Object;La/obe0;)V

    .line 49
    .line 50
    .line 51
    :cond_0
    iget-wide p0, v0, La/dr8;->a:J

    .line 52
    .line 53
    invoke-virtual {v0, p0, p1}, La/dr8;->q(J)V

    .line 54
    .line 55
    .line 56
    return-void

    .line 57
    :cond_1
    invoke-interface {v3, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    if-eqz v1, :cond_2

    .line 62
    .line 63
    invoke-virtual {v0}, La/dr8;->l()J

    .line 64
    .line 65
    .line 66
    move-result-wide v2

    .line 67
    invoke-virtual {v0, p1, v1}, La/dr8;->o(Ljava/lang/Object;Ljava/lang/Object;)J

    .line 68
    .line 69
    .line 70
    move-result-wide v4

    .line 71
    sub-long/2addr v2, v4

    .line 72
    iput-wide v2, v0, La/dr8;->b:J

    .line 73
    .line 74
    const/4 v2, 0x0

    .line 75
    invoke-virtual {v0, p1, v1, v2}, La/dr8;->k(Ljava/lang/Object;Ljava/lang/Object;La/obe0;)V

    .line 76
    .line 77
    .line 78
    :cond_2
    iget-object p0, p0, La/r34;->b:Ljava/lang/Object;

    .line 79
    .line 80
    move-object v0, p0

    .line 81
    check-cast v0, La/y78;

    .line 82
    .line 83
    move-object v1, p1

    .line 84
    move-object v2, p2

    .line 85
    move-object v3, p3

    .line 86
    move-wide v4, p4

    .line 87
    invoke-virtual/range {v0 .. v5}, La/y78;->w(La/jr30;La/dyw;Ljava/util/Map;J)V

    .line 88
    .line 89
    .line 90
    return-void
.end method

.method public j(Landroidx/fragment/app/Fragment;La/iiy;J)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iget-object p2, p1, Landroidx/fragment/app/Fragment;->g:Landroid/os/Bundle;

    .line 8
    .line 9
    if-nez p2, :cond_0

    .line 10
    .line 11
    new-instance p2, Landroid/os/Bundle;

    .line 12
    .line 13
    invoke-direct {p2}, Landroid/os/Bundle;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1, p2}, Landroidx/fragment/app/Fragment;->s0(Landroid/os/Bundle;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    iget-object p1, p0, La/r34;->b:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast p1, Ljava/lang/String;

    .line 22
    .line 23
    invoke-virtual {p2, p1, p3, p4}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 24
    .line 25
    .line 26
    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    iput-object p1, p0, La/r34;->c:Ljava/lang/Object;

    .line 31
    .line 32
    return-void
.end method

.method public k()Ljava/util/List;
    .locals 22

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v0, v1, La/r34;->c:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, La/zlw0;

    .line 6
    .line 7
    iget-object v2, v0, La/p4;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v2, La/kxw0;

    .line 10
    .line 11
    new-instance v3, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    iget-object v4, v1, La/r34;->b:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v4, Ljava/lang/String;

    .line 19
    .line 20
    iget-wide v5, v1, La/r34;->a:J

    .line 21
    .line 22
    invoke-static {v5, v6}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v5

    .line 26
    filled-new-array {v4, v5}, [Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v10

    .line 30
    const-string v9, "app_id = ? and rowid > ?"

    .line 31
    .line 32
    const-string v14, "1000"

    .line 33
    .line 34
    const/4 v5, 0x0

    .line 35
    :try_start_0
    invoke-virtual {v0}, La/zlw0;->c2()Landroid/database/sqlite/SQLiteDatabase;

    .line 36
    .line 37
    .line 38
    move-result-object v6

    .line 39
    const-string v7, "raw_events"

    .line 40
    .line 41
    const-string v15, "rowid"

    .line 42
    .line 43
    const-string v16, "name"

    .line 44
    .line 45
    const-string v17, "timestamp"

    .line 46
    .line 47
    const-string v18, "metadata_fingerprint"

    .line 48
    .line 49
    const-string v19, "data"

    .line 50
    .line 51
    const-string v20, "realtime"

    .line 52
    .line 53
    const-string v21, "elapsed_time"

    .line 54
    .line 55
    filled-new-array/range {v15 .. v21}, [Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v8

    .line 59
    const-string v13, "rowid"

    .line 60
    .line 61
    const/4 v11, 0x0

    .line 62
    const/4 v12, 0x0

    .line 63
    invoke-virtual/range {v6 .. v14}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    .line 64
    .line 65
    .line 66
    move-result-object v5

    .line 67
    invoke-interface {v5}, Landroid/database/Cursor;->moveToFirst()Z

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    if-eqz v0, :cond_4

    .line 72
    .line 73
    :cond_0
    const/4 v0, 0x0

    .line 74
    invoke-interface {v5, v0}, Landroid/database/Cursor;->getLong(I)J

    .line 75
    .line 76
    .line 77
    move-result-wide v7

    .line 78
    const/4 v6, 0x3

    .line 79
    invoke-interface {v5, v6}, Landroid/database/Cursor;->getLong(I)J

    .line 80
    .line 81
    .line 82
    move-result-wide v9

    .line 83
    const/4 v6, 0x5

    .line 84
    invoke-interface {v5, v6}, Landroid/database/Cursor;->getLong(I)J

    .line 85
    .line 86
    .line 87
    move-result-wide v11

    .line 88
    const-wide/16 v13, 0x1

    .line 89
    .line 90
    cmp-long v6, v11, v13

    .line 91
    .line 92
    const/4 v11, 0x1

    .line 93
    if-nez v6, :cond_1

    .line 94
    .line 95
    move v0, v11

    .line 96
    :cond_1
    const/4 v6, 0x6

    .line 97
    invoke-interface {v5, v6}, Landroid/database/Cursor;->getLong(I)J

    .line 98
    .line 99
    .line 100
    move-result-wide v12

    .line 101
    const/4 v6, 0x4

    .line 102
    invoke-interface {v5, v6}, Landroid/database/Cursor;->getBlob(I)[B

    .line 103
    .line 104
    .line 105
    move-result-object v6

    .line 106
    iget-wide v14, v1, La/r34;->a:J

    .line 107
    .line 108
    cmp-long v14, v7, v14

    .line 109
    .line 110
    if-lez v14, :cond_2

    .line 111
    .line 112
    iput-wide v7, v1, La/r34;->a:J
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 113
    .line 114
    :cond_2
    :try_start_1
    invoke-static {}, La/sww0;->H()La/qww0;

    .line 115
    .line 116
    .line 117
    move-result-object v14

    .line 118
    invoke-static {v14, v6}, La/r6x0;->X1(La/iew0;[B)La/iew0;

    .line 119
    .line 120
    .line 121
    move-result-object v6

    .line 122
    check-cast v6, La/qww0;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 123
    .line 124
    :try_start_2
    invoke-interface {v5, v11}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v11

    .line 128
    if-nez v11, :cond_3

    .line 129
    .line 130
    const-string v11, ""

    .line 131
    .line 132
    :cond_3
    invoke-virtual {v6, v11}, La/qww0;->r(Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    const/4 v11, 0x2

    .line 136
    invoke-interface {v5, v11}, Landroid/database/Cursor;->getLong(I)J

    .line 137
    .line 138
    .line 139
    move-result-wide v14

    .line 140
    invoke-virtual {v6}, La/iew0;->c()V

    .line 141
    .line 142
    .line 143
    iget-object v11, v6, La/iew0;->b:La/mew0;

    .line 144
    .line 145
    check-cast v11, La/sww0;

    .line 146
    .line 147
    invoke-virtual {v11, v14, v15}, La/sww0;->O(J)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {v6}, La/iew0;->c()V

    .line 151
    .line 152
    .line 153
    iget-object v11, v6, La/iew0;->b:La/mew0;

    .line 154
    .line 155
    check-cast v11, La/sww0;

    .line 156
    .line 157
    invoke-virtual {v11, v12, v13}, La/sww0;->r(J)V

    .line 158
    .line 159
    .line 160
    move-object v11, v6

    .line 161
    new-instance v6, La/vlw0;

    .line 162
    .line 163
    invoke-virtual {v11}, La/iew0;->e()La/mew0;

    .line 164
    .line 165
    .line 166
    move-result-object v11

    .line 167
    move-object v12, v11

    .line 168
    check-cast v12, La/sww0;

    .line 169
    .line 170
    move v11, v0

    .line 171
    invoke-direct/range {v6 .. v12}, La/vlw0;-><init>(JJZLa/sww0;)V

    .line 172
    .line 173
    .line 174
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 175
    .line 176
    .line 177
    goto :goto_0

    .line 178
    :catchall_0
    move-exception v0

    .line 179
    goto :goto_3

    .line 180
    :catch_0
    move-exception v0

    .line 181
    goto :goto_1

    .line 182
    :catch_1
    move-exception v0

    .line 183
    iget-object v6, v2, La/kxw0;->f:La/uuw0;

    .line 184
    .line 185
    invoke-static {v6}, La/kxw0;->g(La/ryw0;)V

    .line 186
    .line 187
    .line 188
    iget-object v6, v6, La/uuw0;->g:La/quw0;

    .line 189
    .line 190
    const-string v7, "Data loss. Failed to merge raw event. appId"

    .line 191
    .line 192
    invoke-static {v4}, La/uuw0;->q1(Ljava/lang/String;)La/tuw0;

    .line 193
    .line 194
    .line 195
    move-result-object v8

    .line 196
    invoke-virtual {v6, v8, v0, v7}, La/quw0;->c(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 197
    .line 198
    .line 199
    :goto_0
    invoke-interface {v5}, Landroid/database/Cursor;->moveToNext()Z

    .line 200
    .line 201
    .line 202
    move-result v0

    .line 203
    if-nez v0, :cond_0

    .line 204
    .line 205
    goto :goto_2

    .line 206
    :cond_4
    sget-object v3, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;
    :try_end_2
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 207
    .line 208
    goto :goto_2

    .line 209
    :goto_1
    :try_start_3
    iget-object v1, v2, La/kxw0;->f:La/uuw0;

    .line 210
    .line 211
    invoke-static {v1}, La/kxw0;->g(La/ryw0;)V

    .line 212
    .line 213
    .line 214
    iget-object v1, v1, La/uuw0;->g:La/quw0;

    .line 215
    .line 216
    const-string v2, "Data loss. Error querying raw events batch. appId"

    .line 217
    .line 218
    invoke-static {v4}, La/uuw0;->q1(Ljava/lang/String;)La/tuw0;

    .line 219
    .line 220
    .line 221
    move-result-object v4

    .line 222
    invoke-virtual {v1, v4, v0, v2}, La/quw0;->c(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 223
    .line 224
    .line 225
    :goto_2
    if-eqz v5, :cond_5

    .line 226
    .line 227
    invoke-interface {v5}, Landroid/database/Cursor;->close()V

    .line 228
    .line 229
    .line 230
    :cond_5
    return-object v3

    .line 231
    :goto_3
    if-eqz v5, :cond_6

    .line 232
    .line 233
    invoke-interface {v5}, Landroid/database/Cursor;->close()V

    .line 234
    .line 235
    .line 236
    :cond_6
    throw v0
.end method

.method public m()La/zx9;
    .locals 0

    .line 1
    iget-object p0, p0, La/r34;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/cy9;

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    invoke-interface {p0}, La/cy9;->m()La/zx9;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :cond_0
    sget-object p0, La/zx9;->a:La/zx9;

    .line 13
    .line 14
    return-object p0
.end method

.method public bridge synthetic n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p2, Landroidx/fragment/app/Fragment;

    .line 2
    .line 3
    invoke-virtual {p0, p2, p1}, La/r34;->e(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Long;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public o()La/ay9;
    .locals 0

    .line 1
    iget-object p0, p0, La/r34;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/cy9;

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    invoke-interface {p0}, La/cy9;->o()La/ay9;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :cond_0
    sget-object p0, La/ay9;->a:La/ay9;

    .line 13
    .line 14
    return-object p0
.end method

.method public p()La/yx9;
    .locals 0

    .line 1
    iget-object p0, p0, La/r34;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, La/cy9;

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    invoke-interface {p0}, La/cy9;->p()La/yx9;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :cond_0
    sget-object p0, La/yx9;->a:La/yx9;

    .line 13
    .line 14
    return-object p0
.end method
