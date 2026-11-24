.class public final La/h2a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/fag0;


# instance fields
.field public final synthetic b:B

.field public final c:La/fag0;


# direct methods
.method public constructor <init>(BJ)V
    .locals 1

    .line 1
    iput-byte p1, p0, La/h2a;->b:B

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    new-instance p1, La/h2a;

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    invoke-direct {p1, v0, p2, p3}, La/h2a;-><init>(BJ)V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, La/h2a;->c:La/fag0;

    .line 16
    .line 17
    return-void

    .line 18
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    .line 20
    .line 21
    new-instance p1, La/rmq0;

    .line 22
    .line 23
    new-instance v0, La/g2a;

    .line 24
    .line 25
    invoke-direct {v0, p2, p3}, La/g2a;-><init>(J)V

    .line 26
    .line 27
    .line 28
    invoke-direct {p1, p2, p3, v0}, La/rmq0;-><init>(JLa/fag0;)V

    .line 29
    .line 30
    .line 31
    iput-object p1, p0, La/h2a;->c:La/fag0;

    .line 32
    .line 33
    return-void

    .line 34
    nop

    .line 35
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final a()J
    .locals 2

    .line 1
    iget-byte v0, p0, La/h2a;->b:B

    .line 2
    .line 3
    iget-object p0, p0, La/h2a;->c:La/fag0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, La/rmq0;

    .line 9
    .line 10
    iget-wide v0, p0, La/rmq0;->b:J

    .line 11
    .line 12
    return-wide v0

    .line 13
    :pswitch_0
    check-cast p0, La/h2a;

    .line 14
    .line 15
    iget-object p0, p0, La/h2a;->c:La/fag0;

    .line 16
    .line 17
    check-cast p0, La/rmq0;

    .line 18
    .line 19
    iget-wide v0, p0, La/rmq0;->b:J

    .line 20
    .line 21
    return-wide v0

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final b(La/f2a;)La/eag0;
    .locals 1

    .line 1
    iget-byte v0, p0, La/h2a;->b:B

    .line 2
    .line 3
    iget-object p0, p0, La/h2a;->c:La/fag0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, La/rmq0;

    .line 9
    .line 10
    invoke-virtual {p0, p1}, La/rmq0;->b(La/f2a;)La/eag0;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0

    .line 15
    :pswitch_0
    check-cast p0, La/h2a;

    .line 16
    .line 17
    iget-object p0, p0, La/h2a;->c:La/fag0;

    .line 18
    .line 19
    check-cast p0, La/rmq0;

    .line 20
    .line 21
    invoke-virtual {p0, p1}, La/rmq0;->b(La/f2a;)La/eag0;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    iget-boolean p0, p0, La/eag0;->b:Z

    .line 26
    .line 27
    if-nez p0, :cond_1

    .line 28
    .line 29
    iget-object p0, p1, La/f2a;->c:Ljava/lang/Throwable;

    .line 30
    .line 31
    instance-of p1, p0, La/w3a;

    .line 32
    .line 33
    if-eqz p1, :cond_0

    .line 34
    .line 35
    const-string p1, "CameraX"

    .line 36
    .line 37
    const-string v0, "The device might underreport the amount of the cameras. Finish the initialize task since we are already reaching the maximum number of retries."

    .line 38
    .line 39
    invoke-static {p1, v0}, La/l8x;->X(Ljava/lang/String;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    check-cast p0, La/w3a;

    .line 43
    .line 44
    iget p0, p0, La/w3a;->a:I

    .line 45
    .line 46
    if-lez p0, :cond_0

    .line 47
    .line 48
    sget-object p0, La/eag0;->f:La/eag0;

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_0
    sget-object p0, La/eag0;->d:La/eag0;

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_1
    sget-object p0, La/eag0;->e:La/eag0;

    .line 55
    .line 56
    :goto_0
    return-object p0

    .line 57
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
