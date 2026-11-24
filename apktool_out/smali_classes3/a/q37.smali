.class public final La/q37;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final synthetic a:B

.field public final b:La/b4j;

.field public final c:La/au0;

.field public final d:La/s64;

.field public final e:La/ih5;

.field public final f:La/l7k;

.field public final g:La/qu;

.field public final h:La/s64;

.field public final i:La/ix0;


# direct methods
.method public synthetic constructor <init>(La/b4j;La/au0;La/s64;La/ih5;La/l7k;La/qu;La/s64;La/ix0;B)V
    .locals 0

    .line 1
    iput-byte p9, p0, La/q37;->a:B

    iput-object p1, p0, La/q37;->b:La/b4j;

    iput-object p2, p0, La/q37;->c:La/au0;

    iput-object p3, p0, La/q37;->d:La/s64;

    iput-object p4, p0, La/q37;->e:La/ih5;

    iput-object p5, p0, La/q37;->f:La/l7k;

    iput-object p6, p0, La/q37;->g:La/qu;

    iput-object p7, p0, La/q37;->h:La/s64;

    iput-object p8, p0, La/q37;->i:La/ix0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(La/byv;La/z5w;La/r6w;)V
    .locals 2

    .line 1
    iget-byte v0, p0, La/q37;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/q37;->c:La/au0;

    .line 4
    .line 5
    iget-object p0, p0, La/q37;->b:La/b4j;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    sget-object v0, La/r6w;->f:La/r6w;

    .line 11
    .line 12
    if-eq p3, v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0, p1, p2, p3}, La/b4j;->a(La/byv;La/z5w;La/r6w;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, La/byv;->a()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-virtual {p2}, La/z5w;->a()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {p3}, La/r6w;->a()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    invoke-virtual {v1, p0, p1, p2}, La/au0;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    :cond_0
    return-void

    .line 33
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    sget-object v0, La/r6w;->f:La/r6w;

    .line 37
    .line 38
    if-eq p3, v0, :cond_1

    .line 39
    .line 40
    invoke-virtual {p0, p1, p2, p3}, La/b4j;->a(La/byv;La/z5w;La/r6w;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1}, La/byv;->a()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    invoke-virtual {p2}, La/z5w;->a()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-virtual {p3}, La/r6w;->a()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p2

    .line 55
    invoke-virtual {v1, p0, p1, p2}, La/au0;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    :cond_1
    return-void

    .line 59
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public b(La/f4w;)V
    .locals 4

    .line 1
    iget-object v0, p0, La/q37;->b:La/b4j;

    .line 2
    .line 3
    iget-object v0, v0, La/b4j;->a:La/kt2;

    .line 4
    .line 5
    sget-object v1, La/f4w;->a:La/f4w;

    .line 6
    .line 7
    invoke-virtual {v1}, La/f4w;->a()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    const-string v2, "point"

    .line 12
    .line 13
    invoke-virtual {p1}, La/f4w;->a()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    invoke-static {v2, v3, v0, v1}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1}, La/f4w;->a()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    iget-object p0, p0, La/q37;->c:La/au0;

    .line 25
    .line 26
    iget-object p0, p0, La/au0;->a:La/s1p;

    .line 27
    .line 28
    const-wide/16 v0, 0xc7f

    .line 29
    .line 30
    invoke-static {p1, p0, v0, v1}, La/b1j;->v(Ljava/lang/String;La/s1p;J)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public c(La/ozv;La/z5w;La/r6w;Ljava/lang/String;Ljava/lang/String;)V
    .locals 7

    .line 1
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, La/r6w;->f:La/r6w;

    .line 5
    .line 6
    if-eq p3, v0, :cond_0

    .line 7
    .line 8
    sget-object v0, La/a1w;->a:La/a1w;

    .line 9
    .line 10
    iget-object v1, p0, La/q37;->b:La/b4j;

    .line 11
    .line 12
    move-object v2, p1

    .line 13
    move-object v3, p2

    .line 14
    move-object v4, p3

    .line 15
    move-object v5, p4

    .line 16
    move-object v6, p5

    .line 17
    invoke-virtual/range {v1 .. v6}, La/b4j;->j(La/ozv;La/z5w;La/r6w;Ljava/lang/String;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    iget-wide p1, v2, La/ozv;->a:D

    .line 21
    .line 22
    double-to-float p1, p1

    .line 23
    invoke-virtual {v3}, La/z5w;->a()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    invoke-virtual {v4}, La/r6w;->a()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p3

    .line 31
    iget-object p0, p0, La/q37;->c:La/au0;

    .line 32
    .line 33
    invoke-virtual/range {p0 .. p5}, La/au0;->i(FLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    :cond_0
    return-void
.end method
