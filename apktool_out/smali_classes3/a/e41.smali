.class public final La/e41;
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
    iput-object p1, p0, La/e41;->a:La/s1p;

    .line 11
    .line 12
    return-void

    .line 13
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, La/e41;->a:La/s1p;

    .line 17
    .line 18
    return-void

    .line 19
    :pswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, La/e41;->a:La/s1p;

    .line 23
    .line 24
    return-void

    .line 25
    :pswitch_2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object p1, p0, La/e41;->a:La/s1p;

    .line 29
    .line 30
    return-void

    .line 31
    :pswitch_3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 32
    .line 33
    .line 34
    iput-object p1, p0, La/e41;->a:La/s1p;

    .line 35
    .line 36
    return-void

    .line 37
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static synthetic d(La/e41;Ljava/lang/String;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0, p1}, La/e41;->c(Ljava/lang/Integer;Ljava/lang/String;)V

    .line 3
    .line 4
    .line 5
    return-void
.end method


# virtual methods
.method public a(La/o31;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    const/4 v0, 0x1

    .line 6
    const/4 v1, 0x2

    .line 7
    if-eqz p1, :cond_2

    .line 8
    .line 9
    if-eq p1, v0, :cond_1

    .line 10
    .line 11
    if-ne p1, v1, :cond_0

    .line 12
    .line 13
    const-string p1, "ignore"

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-static {}, La/t9f;->b()V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_1
    const-string p1, "later"

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_2
    const-string p1, "take_part"

    .line 24
    .line 25
    :goto_0
    new-instance v2, La/i1p;

    .line 26
    .line 27
    const/16 v3, 0x212

    .line 28
    .line 29
    invoke-direct {v2, v3, v1}, La/i1p;-><init>(IB)V

    .line 30
    .line 31
    .line 32
    new-instance v3, La/j1p;

    .line 33
    .line 34
    const/4 v4, 0x0

    .line 35
    invoke-direct {v3, p1, v4}, La/j1p;-><init>(Ljava/lang/String;B)V

    .line 36
    .line 37
    .line 38
    new-array p1, v1, [La/k1p;

    .line 39
    .line 40
    aput-object v2, p1, v4

    .line 41
    .line 42
    aput-object v3, p1, v0

    .line 43
    .line 44
    invoke-static {p1}, La/tx3;->l0([Ljava/lang/Object;)Ljava/util/Set;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    iget-object p0, p0, La/e41;->a:La/s1p;

    .line 49
    .line 50
    const-wide/16 v0, 0x2ed7

    .line 51
    .line 52
    invoke-virtual {p0, p1, v0, v1}, La/s1p;->a(Ljava/util/Set;J)V

    .line 53
    .line 54
    .line 55
    return-void
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

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
    new-instance p1, La/j1p;

    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    invoke-direct {p1, p2, v2}, La/j1p;-><init>(Ljava/lang/String;B)V

    .line 11
    .line 12
    .line 13
    const/4 p2, 0x2

    .line 14
    new-array p2, p2, [La/k1p;

    .line 15
    .line 16
    aput-object v0, p2, v1

    .line 17
    .line 18
    aput-object p1, p2, v2

    .line 19
    .line 20
    invoke-static {p2}, La/tx3;->l0([Ljava/lang/Object;)Ljava/util/Set;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    iget-object p0, p0, La/e41;->a:La/s1p;

    .line 25
    .line 26
    const-wide/16 v0, 0xcdb

    .line 27
    .line 28
    invoke-virtual {p0, p1, v0, v1}, La/s1p;->a(Ljava/util/Set;J)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public c(Ljava/lang/Integer;Ljava/lang/String;)V
    .locals 4

    .line 1
    const-wide/16 v0, 0xc37

    .line 2
    .line 3
    iget-object p0, p0, La/e41;->a:La/s1p;

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    new-instance v2, La/j1p;

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    invoke-direct {v2, p2, v3}, La/j1p;-><init>(Ljava/lang/String;B)V

    .line 11
    .line 12
    .line 13
    new-instance p2, La/i1p;

    .line 14
    .line 15
    invoke-direct {p2, p1}, La/i1p;-><init>(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    const/4 p1, 0x2

    .line 19
    new-array p1, p1, [La/k1p;

    .line 20
    .line 21
    aput-object v2, p1, v3

    .line 22
    .line 23
    const/4 v2, 0x1

    .line 24
    aput-object p2, p1, v2

    .line 25
    .line 26
    invoke-static {p1}, La/tx3;->l0([Ljava/lang/Object;)Ljava/util/Set;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-virtual {p0, p1, v0, v1}, La/s1p;->a(Ljava/util/Set;J)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :cond_0
    invoke-static {p2, p0, v0, v1}, La/b1j;->v(Ljava/lang/String;La/s1p;J)V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public e(La/qun0;)V
    .locals 2

    .line 1
    new-instance v0, La/j1p;

    .line 2
    .line 3
    iget-object p1, p1, La/qun0;->a:Ljava/lang/String;

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
    iget-object p0, p0, La/e41;->a:La/s1p;

    .line 14
    .line 15
    const-wide/16 v0, 0x3179

    .line 16
    .line 17
    invoke-virtual {p0, p1, v0, v1}, La/s1p;->a(Ljava/util/Set;J)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public f(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object p0, p0, La/e41;->a:La/s1p;

    .line 2
    .line 3
    const-wide/16 v0, 0x2ed0

    .line 4
    .line 5
    invoke-static {p1, p0, v0, v1}, La/b1j;->v(Ljava/lang/String;La/s1p;J)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
