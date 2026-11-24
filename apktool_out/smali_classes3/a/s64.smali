.class public final La/s64;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/s1p;


# direct methods
.method public constructor <init>(La/s1p;B)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    packed-switch p2, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, La/s64;->a:La/s1p;

    .line 11
    .line 12
    return-void

    .line 13
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, La/s64;->a:La/s1p;

    .line 17
    .line 18
    return-void

    .line 19
    :pswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, La/s64;->a:La/s1p;

    .line 23
    .line 24
    return-void

    .line 25
    :pswitch_2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object p1, p0, La/s64;->a:La/s1p;

    .line 29
    .line 30
    return-void

    .line 31
    :pswitch_3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    .line 33
    .line 34
    iput-object p1, p0, La/s64;->a:La/s1p;

    .line 35
    .line 36
    return-void

    .line 37
    :pswitch_4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    .line 39
    .line 40
    iput-object p1, p0, La/s64;->a:La/s1p;

    .line 41
    .line 42
    return-void

    .line 43
    :pswitch_5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 44
    .line 45
    .line 46
    iput-object p1, p0, La/s64;->a:La/s1p;

    .line 47
    .line 48
    return-void

    .line 49
    :pswitch_6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 50
    .line 51
    .line 52
    iput-object p1, p0, La/s64;->a:La/s1p;

    .line 53
    .line 54
    return-void

    .line 55
    :pswitch_7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 56
    .line 57
    .line 58
    iput-object p1, p0, La/s64;->a:La/s1p;

    .line 59
    .line 60
    return-void

    .line 61
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public a(Ljava/lang/String;JZ)V
    .locals 2

    .line 1
    if-eqz p4, :cond_0

    .line 2
    .line 3
    const-string p4, "on"

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    const-string p4, "off"

    .line 7
    .line 8
    :goto_0
    new-instance v0, La/i1p;

    .line 9
    .line 10
    const/4 v1, 0x2

    .line 11
    invoke-direct {v0, v1, p2, p3}, La/i1p;-><init>(BJ)V

    .line 12
    .line 13
    .line 14
    new-instance p2, La/j1p;

    .line 15
    .line 16
    const/4 p3, 0x0

    .line 17
    invoke-direct {p2, p4, p3}, La/j1p;-><init>(Ljava/lang/String;B)V

    .line 18
    .line 19
    .line 20
    new-array p4, v1, [La/k1p;

    .line 21
    .line 22
    aput-object v0, p4, p3

    .line 23
    .line 24
    const/4 p3, 0x1

    .line 25
    aput-object p2, p4, p3

    .line 26
    .line 27
    invoke-static {p4}, La/dui0;->c([Ljava/lang/Object;)Ljava/util/Set;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    if-eqz p1, :cond_2

    .line 32
    .line 33
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 34
    .line 35
    .line 36
    move-result p4

    .line 37
    if-nez p4, :cond_1

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    new-instance p4, La/j1p;

    .line 41
    .line 42
    invoke-direct {p4, p1, p3}, La/j1p;-><init>(Ljava/lang/String;B)V

    .line 43
    .line 44
    .line 45
    invoke-interface {p2, p4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    :cond_2
    :goto_1
    iget-object p0, p0, La/s64;->a:La/s1p;

    .line 49
    .line 50
    const-wide/16 p3, 0xc88

    .line 51
    .line 52
    invoke-virtual {p0, p2, p3, p4}, La/s1p;->a(Ljava/util/Set;J)V

    .line 53
    .line 54
    .line 55
    return-void
.end method

.method public b(Ljava/lang/String;La/zje;)Ljava/lang/Object;
    .locals 2

    .line 1
    new-instance v0, La/j1p;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p1, v1}, La/j1p;-><init>(Ljava/lang/String;B)V

    .line 5
    .line 6
    .line 7
    invoke-static {v0}, La/cui0;->b(Ljava/lang/Object;)Ljava/util/Set;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    iget-object p0, p0, La/s64;->a:La/s1p;

    .line 12
    .line 13
    const-wide/16 v0, 0x3175

    .line 14
    .line 15
    invoke-virtual {p0, v0, v1, p2, p1}, La/s1p;->b(JLa/zje;Ljava/util/Set;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    sget-object p1, La/wne;->a:La/wne;

    .line 20
    .line 21
    if-ne p0, p1, :cond_0

    .line 22
    .line 23
    return-object p0

    .line 24
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 25
    .line 26
    return-object p0
.end method

.method public c(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object p0, p0, La/s64;->a:La/s1p;

    .line 2
    .line 3
    const-wide/16 v0, 0xbdb

    .line 4
    .line 5
    invoke-static {p1, p0, v0, v1}, La/b1j;->v(Ljava/lang/String;La/s1p;J)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public d(La/y1p;Ljava/lang/String;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, La/j1p;

    .line 5
    .line 6
    iget-object p1, p1, La/y1p;->a:Ljava/lang/String;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-direct {v0, p1, v1}, La/j1p;-><init>(Ljava/lang/String;B)V

    .line 10
    .line 11
    .line 12
    new-instance p1, La/j1p;

    .line 13
    .line 14
    const/4 v2, 0x2

    .line 15
    invoke-direct {p1, p2, v2}, La/j1p;-><init>(Ljava/lang/String;B)V

    .line 16
    .line 17
    .line 18
    new-array p2, v2, [La/k1p;

    .line 19
    .line 20
    aput-object v0, p2, v1

    .line 21
    .line 22
    const/4 v0, 0x1

    .line 23
    aput-object p1, p2, v0

    .line 24
    .line 25
    invoke-static {p2}, La/tx3;->l0([Ljava/lang/Object;)Ljava/util/Set;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    iget-object p0, p0, La/s64;->a:La/s1p;

    .line 30
    .line 31
    const-wide/16 v0, 0xbcc

    .line 32
    .line 33
    invoke-virtual {p0, p1, v0, v1}, La/s1p;->a(Ljava/util/Set;J)V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public e(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object p0, p0, La/s64;->a:La/s1p;

    .line 2
    .line 3
    const-wide/16 v0, 0xcd1

    .line 4
    .line 5
    invoke-static {p1, p0, v0, v1}, La/b1j;->v(Ljava/lang/String;La/s1p;J)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public f(La/hfi0;)V
    .locals 2

    .line 1
    new-instance v0, La/j1p;

    .line 2
    .line 3
    iget-object p1, p1, La/hfi0;->a:Ljava/lang/String;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-direct {v0, p1, v1}, La/j1p;-><init>(Ljava/lang/String;B)V

    .line 7
    .line 8
    .line 9
    invoke-static {v0}, La/cui0;->b(Ljava/lang/Object;)Ljava/util/Set;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    iget-object p0, p0, La/s64;->a:La/s1p;

    .line 14
    .line 15
    const-wide/16 v0, 0x2b44

    .line 16
    .line 17
    invoke-virtual {p0, p1, v0, v1}, La/s1p;->a(Ljava/util/Set;J)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public g(Z)V
    .locals 2

    .line 1
    new-instance v0, La/j1p;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    const-string p1, "on"

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const-string p1, "off"

    .line 9
    .line 10
    :goto_0
    const/4 v1, 0x0

    .line 11
    invoke-direct {v0, p1, v1}, La/j1p;-><init>(Ljava/lang/String;B)V

    .line 12
    .line 13
    .line 14
    invoke-static {v0}, La/cui0;->b(Ljava/lang/Object;)Ljava/util/Set;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    iget-object p0, p0, La/s64;->a:La/s1p;

    .line 19
    .line 20
    const-wide/16 v0, 0x2994

    .line 21
    .line 22
    invoke-virtual {p0, p1, v0, v1}, La/s1p;->a(Ljava/util/Set;J)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public h(I)V
    .locals 2

    .line 1
    iget-object p0, p0, La/s64;->a:La/s1p;

    .line 2
    .line 3
    const-wide/16 v0, 0xbdf

    .line 4
    .line 5
    invoke-static {p1, p0, v0, v1}, La/b1j;->r(ILa/s1p;J)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public i(ZLa/it2;)V
    .locals 5

    .line 1
    new-instance v0, La/j1p;

    .line 2
    .line 3
    const-string v1, "\u0441all_code"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, La/j1p;-><init>(Ljava/lang/String;B)V

    .line 7
    .line 8
    .line 9
    new-instance v1, La/j1p;

    .line 10
    .line 11
    iget-object p2, p2, La/it2;->a:Ljava/lang/String;

    .line 12
    .line 13
    const/4 v3, 0x1

    .line 14
    invoke-direct {v1, p2, v3}, La/j1p;-><init>(Ljava/lang/String;B)V

    .line 15
    .line 16
    .line 17
    new-instance p2, La/j1p;

    .line 18
    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    const-string p1, "ok"

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const-string p1, "cancel"

    .line 25
    .line 26
    :goto_0
    const/4 v4, 0x2

    .line 27
    invoke-direct {p2, p1, v4}, La/j1p;-><init>(Ljava/lang/String;B)V

    .line 28
    .line 29
    .line 30
    const/4 p1, 0x3

    .line 31
    new-array p1, p1, [La/k1p;

    .line 32
    .line 33
    aput-object v0, p1, v2

    .line 34
    .line 35
    aput-object v1, p1, v3

    .line 36
    .line 37
    aput-object p2, p1, v4

    .line 38
    .line 39
    invoke-static {p1}, La/tx3;->l0([Ljava/lang/Object;)Ljava/util/Set;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    iget-object p0, p0, La/s64;->a:La/s1p;

    .line 44
    .line 45
    const-wide/16 v0, 0x3100

    .line 46
    .line 47
    invoke-virtual {p0, p1, v0, v1}, La/s1p;->a(Ljava/util/Set;J)V

    .line 48
    .line 49
    .line 50
    return-void
.end method

.method public j(ZLa/it2;)V
    .locals 5

    .line 1
    new-instance v0, La/j1p;

    .line 2
    .line 3
    const-string v1, "telegram"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, La/j1p;-><init>(Ljava/lang/String;B)V

    .line 7
    .line 8
    .line 9
    new-instance v1, La/j1p;

    .line 10
    .line 11
    iget-object p2, p2, La/it2;->a:Ljava/lang/String;

    .line 12
    .line 13
    const/4 v3, 0x1

    .line 14
    invoke-direct {v1, p2, v3}, La/j1p;-><init>(Ljava/lang/String;B)V

    .line 15
    .line 16
    .line 17
    new-instance p2, La/j1p;

    .line 18
    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    const-string p1, "ok"

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const-string p1, "cancel"

    .line 25
    .line 26
    :goto_0
    const/4 v4, 0x2

    .line 27
    invoke-direct {p2, p1, v4}, La/j1p;-><init>(Ljava/lang/String;B)V

    .line 28
    .line 29
    .line 30
    const/4 p1, 0x3

    .line 31
    new-array p1, p1, [La/k1p;

    .line 32
    .line 33
    aput-object v0, p1, v2

    .line 34
    .line 35
    aput-object v1, p1, v3

    .line 36
    .line 37
    aput-object p2, p1, v4

    .line 38
    .line 39
    invoke-static {p1}, La/tx3;->l0([Ljava/lang/Object;)Ljava/util/Set;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    iget-object p0, p0, La/s64;->a:La/s1p;

    .line 44
    .line 45
    const-wide/16 v0, 0x3100

    .line 46
    .line 47
    invoke-virtual {p0, p1, v0, v1}, La/s1p;->a(Ljava/util/Set;J)V

    .line 48
    .line 49
    .line 50
    return-void
.end method

.method public k(ZLa/it2;)V
    .locals 5

    .line 1
    new-instance v0, La/j1p;

    .line 2
    .line 3
    const-string v1, "voice_sms"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, La/j1p;-><init>(Ljava/lang/String;B)V

    .line 7
    .line 8
    .line 9
    new-instance v1, La/j1p;

    .line 10
    .line 11
    iget-object p2, p2, La/it2;->a:Ljava/lang/String;

    .line 12
    .line 13
    const/4 v3, 0x1

    .line 14
    invoke-direct {v1, p2, v3}, La/j1p;-><init>(Ljava/lang/String;B)V

    .line 15
    .line 16
    .line 17
    new-instance p2, La/j1p;

    .line 18
    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    const-string p1, "ok"

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const-string p1, "cancel"

    .line 25
    .line 26
    :goto_0
    const/4 v4, 0x2

    .line 27
    invoke-direct {p2, p1, v4}, La/j1p;-><init>(Ljava/lang/String;B)V

    .line 28
    .line 29
    .line 30
    const/4 p1, 0x3

    .line 31
    new-array p1, p1, [La/k1p;

    .line 32
    .line 33
    aput-object v0, p1, v2

    .line 34
    .line 35
    aput-object v1, p1, v3

    .line 36
    .line 37
    aput-object p2, p1, v4

    .line 38
    .line 39
    invoke-static {p1}, La/tx3;->l0([Ljava/lang/Object;)Ljava/util/Set;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    iget-object p0, p0, La/s64;->a:La/s1p;

    .line 44
    .line 45
    const-wide/16 v0, 0x3100

    .line 46
    .line 47
    invoke-virtual {p0, p1, v0, v1}, La/s1p;->a(Ljava/util/Set;J)V

    .line 48
    .line 49
    .line 50
    return-void
.end method
