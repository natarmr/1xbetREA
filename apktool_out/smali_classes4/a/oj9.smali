.class public final La/oj9;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/q7d0;

.field public final b:La/vby;

.field public final c:La/n0o0;


# direct methods
.method public constructor <init>(La/vby;La/q7d0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, La/oj9;->a:La/q7d0;

    .line 5
    .line 6
    iput-object p1, p0, La/oj9;->b:La/vby;

    .line 7
    .line 8
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 9
    .line 10
    invoke-static {p1}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 11
    .line 12
    .line 13
    new-instance p1, La/vb8;

    .line 14
    .line 15
    const/16 p2, 0x18

    .line 16
    .line 17
    invoke-direct {p1, p0, p2}, La/vb8;-><init>(Ljava/lang/Object;B)V

    .line 18
    .line 19
    .line 20
    invoke-static {p1}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    iput-object p1, p0, La/oj9;->c:La/n0o0;

    .line 25
    .line 26
    const/4 p0, 0x1

    .line 27
    sget-object p1, La/i99;->b:La/i99;

    .line 28
    .line 29
    const/4 p2, 0x0

    .line 30
    invoke-static {p2, p0, p1, p0}, La/roj0;->b(IILa/i99;I)La/qoj0;

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public static b(La/m97;La/m97;)Z
    .locals 4

    .line 1
    if-eq p0, p1, :cond_1

    .line 2
    .line 3
    iget-wide v0, p0, La/m97;->a:J

    .line 4
    .line 5
    iget-wide v2, p1, La/m97;->a:J

    .line 6
    .line 7
    cmp-long v0, v0, v2

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    iget-wide v0, p0, La/m97;->h:J

    .line 12
    .line 13
    iget-wide v2, p1, La/m97;->h:J

    .line 14
    .line 15
    cmp-long v0, v0, v2

    .line 16
    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    iget-wide v0, p0, La/m97;->f:J

    .line 20
    .line 21
    iget-wide v2, p1, La/m97;->f:J

    .line 22
    .line 23
    cmp-long v0, v0, v2

    .line 24
    .line 25
    if-nez v0, :cond_0

    .line 26
    .line 27
    iget-wide v0, p0, La/m97;->j:D

    .line 28
    .line 29
    iget-wide p0, p1, La/m97;->j:D

    .line 30
    .line 31
    cmpg-double p0, v0, p0

    .line 32
    .line 33
    if-nez p0, :cond_0

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    const/4 p0, 0x0

    .line 37
    return p0

    .line 38
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 39
    return p0
.end method


# virtual methods
.method public final a()La/qz40;
    .locals 0

    .line 1
    iget-object p0, p0, La/oj9;->c:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/qz40;

    .line 8
    .line 9
    return-object p0
.end method

.method public final c(Ljava/util/List;)V
    .locals 3

    .line 1
    new-instance v0, La/zw3;

    .line 2
    .line 3
    sget-object v1, La/pbs0;->Companion:La/obs0;

    .line 4
    .line 5
    invoke-virtual {v1}, La/obs0;->serializer()La/jiy;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-direct {v0, v1, v2}, La/zw3;-><init>(La/jiy;B)V

    .line 11
    .line 12
    .line 13
    iget-object v1, p0, La/oj9;->b:La/vby;

    .line 14
    .line 15
    invoke-virtual {v1, v0, p1}, La/vby;->d(La/jiy;Ljava/lang/Object;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    iget-object p0, p0, La/oj9;->a:La/q7d0;

    .line 20
    .line 21
    const-string v0, "track_events_json"

    .line 22
    .line 23
    invoke-virtual {p0, v0, p1}, La/q7d0;->g(Ljava/lang/String;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method
