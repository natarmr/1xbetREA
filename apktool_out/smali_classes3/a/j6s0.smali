.class public final synthetic La/j6s0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:J

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:La/bzt;


# direct methods
.method public synthetic constructor <init>(JLjava/lang/String;La/bzt;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput-byte v0, p0, La/j6s0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, La/j6s0;->b:J

    iput-object p3, p0, La/j6s0;->c:Ljava/lang/String;

    iput-object p4, p0, La/j6s0;->d:La/bzt;

    return-void
.end method

.method public synthetic constructor <init>(La/bzt;JLjava/lang/String;)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput-byte v0, p0, La/j6s0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/j6s0;->d:La/bzt;

    iput-wide p2, p0, La/j6s0;->b:J

    iput-object p4, p0, La/j6s0;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 14

    .line 1
    iget-byte v0, p0, La/j6s0;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/j6s0;->d:La/bzt;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v0, v1, La/bzt;->a:La/fsd;

    .line 9
    .line 10
    invoke-virtual {v0}, La/fsd;->a()La/v8d;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iget v6, v0, La/v8d;->r:I

    .line 15
    .line 16
    new-instance v1, La/sas0;

    .line 17
    .line 18
    sget-object v5, La/eas0;->a:La/eas0;

    .line 19
    .line 20
    const/4 v7, 0x0

    .line 21
    iget-wide v2, p0, La/j6s0;->b:J

    .line 22
    .line 23
    iget-object v4, p0, La/j6s0;->c:Ljava/lang/String;

    .line 24
    .line 25
    invoke-direct/range {v1 .. v7}, La/sas0;-><init>(JLjava/lang/String;La/fas0;IZ)V

    .line 26
    .line 27
    .line 28
    return-object v1

    .line 29
    :pswitch_0
    sget-object v11, La/gqt0;->h:La/gqt0;

    .line 30
    .line 31
    iget-object v0, v1, La/bzt;->a:La/fsd;

    .line 32
    .line 33
    invoke-virtual {v0}, La/fsd;->a()La/v8d;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    iget v12, v0, La/v8d;->r:I

    .line 38
    .line 39
    new-instance v2, La/e6s0;

    .line 40
    .line 41
    const/4 v10, 0x0

    .line 42
    const/4 v13, 0x0

    .line 43
    iget-wide v3, p0, La/j6s0;->b:J

    .line 44
    .line 45
    const-wide/16 v5, 0x0

    .line 46
    .line 47
    iget-object v7, p0, La/j6s0;->c:Ljava/lang/String;

    .line 48
    .line 49
    const-string v8, ""

    .line 50
    .line 51
    sget-object v9, La/r7s0;->a:La/r7s0;

    .line 52
    .line 53
    invoke-direct/range {v2 .. v13}, La/e6s0;-><init>(JJLjava/lang/String;Ljava/lang/String;La/s7s0;ZLa/gqt0;IZ)V

    .line 54
    .line 55
    .line 56
    return-object v2

    .line 57
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
