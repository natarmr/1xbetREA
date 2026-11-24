.class public La/dfn;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final a(DLa/bfn;La/bfn;)D
    .locals 6

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p3, p3, La/bfn;->a:Ljava/util/concurrent/TimeUnit;

    .line 5
    .line 6
    iget-object p2, p2, La/bfn;->a:Ljava/util/concurrent/TimeUnit;

    .line 7
    .line 8
    const-wide/16 v0, 0x1

    .line 9
    .line 10
    invoke-virtual {p3, v0, v1, p2}, Ljava/util/concurrent/TimeUnit;->convert(JLjava/util/concurrent/TimeUnit;)J

    .line 11
    .line 12
    .line 13
    move-result-wide v2

    .line 14
    const-wide/16 v4, 0x0

    .line 15
    .line 16
    cmp-long v4, v2, v4

    .line 17
    .line 18
    if-lez v4, :cond_0

    .line 19
    .line 20
    long-to-double p2, v2

    .line 21
    mul-double/2addr p0, p2

    .line 22
    return-wide p0

    .line 23
    :cond_0
    invoke-virtual {p2, v0, v1, p3}, Ljava/util/concurrent/TimeUnit;->convert(JLjava/util/concurrent/TimeUnit;)J

    .line 24
    .line 25
    .line 26
    move-result-wide p2

    .line 27
    long-to-double p2, p2

    .line 28
    div-double/2addr p0, p2

    .line 29
    return-wide p0
.end method

.method public static final b(JLa/bfn;La/bfn;)J
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iget-object p3, p3, La/bfn;->a:Ljava/util/concurrent/TimeUnit;

    .line 8
    .line 9
    iget-object p2, p2, La/bfn;->a:Ljava/util/concurrent/TimeUnit;

    .line 10
    .line 11
    invoke-virtual {p3, p0, p1, p2}, Ljava/util/concurrent/TimeUnit;->convert(JLjava/util/concurrent/TimeUnit;)J

    .line 12
    .line 13
    .line 14
    move-result-wide p0

    .line 15
    return-wide p0
.end method

.method public static c(Ljava/util/concurrent/TimeUnit;)La/bfn;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, La/cfn;->a:[I

    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    aget p0, v0, p0

    .line 11
    .line 12
    packed-switch p0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    invoke-static {}, La/t9f;->b()V

    .line 16
    .line 17
    .line 18
    const/4 p0, 0x0

    .line 19
    return-object p0

    .line 20
    :pswitch_0
    sget-object p0, La/bfn;->h:La/bfn;

    .line 21
    .line 22
    return-object p0

    .line 23
    :pswitch_1
    sget-object p0, La/bfn;->g:La/bfn;

    .line 24
    .line 25
    return-object p0

    .line 26
    :pswitch_2
    sget-object p0, La/bfn;->f:La/bfn;

    .line 27
    .line 28
    return-object p0

    .line 29
    :pswitch_3
    sget-object p0, La/bfn;->e:La/bfn;

    .line 30
    .line 31
    return-object p0

    .line 32
    :pswitch_4
    sget-object p0, La/bfn;->d:La/bfn;

    .line 33
    .line 34
    return-object p0

    .line 35
    :pswitch_5
    sget-object p0, La/bfn;->c:La/bfn;

    .line 36
    .line 37
    return-object p0

    .line 38
    :pswitch_6
    sget-object p0, La/bfn;->b:La/bfn;

    .line 39
    .line 40
    return-object p0

    .line 41
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
