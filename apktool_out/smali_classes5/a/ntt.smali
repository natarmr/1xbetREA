.class public final La/ntt;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/kym0;


# direct methods
.method public constructor <init>(La/kym0;B)V
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
    iput-object p1, p0, La/ntt;->a:La/kym0;

    .line 11
    .line 12
    return-void

    .line 13
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, La/ntt;->a:La/kym0;

    .line 17
    .line 18
    return-void

    .line 19
    :pswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, La/ntt;->a:La/kym0;

    .line 23
    .line 24
    return-void

    .line 25
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public a()Ljava/util/ArrayList;
    .locals 3

    .line 1
    iget-object p0, p0, La/ntt;->a:La/kym0;

    .line 2
    .line 3
    iget-object p0, p0, La/kym0;->a:La/jym0;

    .line 4
    .line 5
    invoke-virtual {p0}, La/jym0;->a()Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    new-instance v0, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    instance-of v2, v1, La/uvm0;

    .line 29
    .line 30
    if-eqz v2, :cond_0

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    return-object v0
.end method

.method public b(J)V
    .locals 9

    .line 1
    iget-object p0, p0, La/ntt;->a:La/kym0;

    .line 2
    .line 3
    iget-object v0, p0, La/kym0;->a:La/jym0;

    .line 4
    .line 5
    invoke-virtual {v0}, La/jym0;->a()Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    move-object v2, v1

    .line 24
    check-cast v2, La/xvm0;

    .line 25
    .line 26
    instance-of v2, v2, La/tvm0;

    .line 27
    .line 28
    if-eqz v2, :cond_0

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    const/4 v1, 0x0

    .line 32
    :goto_0
    check-cast v1, La/xvm0;

    .line 33
    .line 34
    if-eqz v1, :cond_2

    .line 35
    .line 36
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    iget-object p0, p0, La/kym0;->b:La/yvf;

    .line 40
    .line 41
    invoke-virtual {p0, v1}, La/yvf;->b(La/xvm0;)V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :cond_2
    new-instance v2, La/tvm0;

    .line 46
    .line 47
    const/4 v8, 0x1

    .line 48
    const/4 v3, 0x0

    .line 49
    move-wide v6, p1

    .line 50
    move-wide v4, p1

    .line 51
    invoke-direct/range {v2 .. v8}, La/tvm0;-><init>(Ljava/lang/String;JJI)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    iget-object p0, p0, La/kym0;->b:La/yvf;

    .line 58
    .line 59
    invoke-virtual {p0, v2}, La/yvf;->b(La/xvm0;)V

    .line 60
    .line 61
    .line 62
    return-void
.end method

.method public c(Z)V
    .locals 2

    .line 1
    iget-object p0, p0, La/ntt;->a:La/kym0;

    .line 2
    .line 3
    iget-object p0, p0, La/kym0;->c:La/lym0;

    .line 4
    .line 5
    iget-object p0, p0, La/lym0;->b:La/p7m0;

    .line 6
    .line 7
    :cond_0
    invoke-virtual {p0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    move-object v1, v0

    .line 12
    check-cast v1, Ljava/lang/Boolean;

    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {p0, v0, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    return-void
.end method
