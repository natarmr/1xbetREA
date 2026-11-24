.class public final La/s9g0;
.super La/eby;
.source "SourceFile"


# instance fields
.field public final e:La/gby;


# direct methods
.method public constructor <init>(La/gby;)V
    .locals 0

    .line 1
    invoke-direct {p0}, La/hu00;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/s9g0;->e:La/gby;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final l()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final m(Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, La/eby;->k()La/pby;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, La/pby;->H()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    instance-of v0, p1, La/udd;

    .line 10
    .line 11
    iget-object p0, p0, La/s9g0;->e:La/gby;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    sget-object v0, La/j0g0;->b:La/e0g0;

    .line 16
    .line 17
    check-cast p1, La/udd;

    .line 18
    .line 19
    iget-object p1, p1, La/udd;->a:Ljava/lang/Throwable;

    .line 20
    .line 21
    invoke-static {p1}, La/z1x;->C(Ljava/lang/Throwable;)La/g0g0;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {p0, p1}, La/n5a;->resumeWith(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_0
    sget-object v0, La/j0g0;->b:La/e0g0;

    .line 30
    .line 31
    invoke-static {p1}, La/qby;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-virtual {p0, p1}, La/n5a;->resumeWith(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    return-void
.end method
