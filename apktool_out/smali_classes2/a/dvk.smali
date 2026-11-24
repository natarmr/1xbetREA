.class public final La/dvk;
.super La/vzs0;
.source "SourceFile"


# instance fields
.field public final b:La/vzs0;

.field public final c:La/vzs0;


# direct methods
.method public constructor <init>(La/vzs0;La/vzs0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/dvk;->b:La/vzs0;

    .line 5
    .line 6
    iput-object p2, p0, La/dvk;->c:La/vzs0;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    .line 1
    iget-object v0, p0, La/dvk;->b:La/vzs0;

    .line 2
    .line 3
    invoke-virtual {v0}, La/vzs0;->a()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    iget-object p0, p0, La/dvk;->c:La/vzs0;

    .line 10
    .line 11
    invoke-virtual {p0}, La/vzs0;->a()Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    if-eqz p0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 p0, 0x0

    .line 19
    return p0

    .line 20
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 21
    return p0
.end method

.method public final b()Z
    .locals 1

    .line 1
    iget-object v0, p0, La/dvk;->b:La/vzs0;

    .line 2
    .line 3
    invoke-virtual {v0}, La/vzs0;->b()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    iget-object p0, p0, La/dvk;->c:La/vzs0;

    .line 10
    .line 11
    invoke-virtual {p0}, La/vzs0;->b()Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    if-eqz p0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 p0, 0x0

    .line 19
    return p0

    .line 20
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 21
    return p0
.end method

.method public final c(La/g93;)La/g93;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La/dvk;->b:La/vzs0;

    .line 5
    .line 6
    invoke-virtual {v0, p1}, La/vzs0;->c(La/g93;)La/g93;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iget-object p0, p0, La/dvk;->c:La/vzs0;

    .line 11
    .line 12
    invoke-virtual {p0, p1}, La/vzs0;->c(La/g93;)La/g93;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method public final d(La/wsy;)La/pzs0;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La/dvk;->b:La/vzs0;

    .line 5
    .line 6
    invoke-virtual {v0, p1}, La/vzs0;->d(La/wsy;)La/pzs0;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    iget-object p0, p0, La/dvk;->c:La/vzs0;

    .line 13
    .line 14
    invoke-virtual {p0, p1}, La/vzs0;->d(La/wsy;)La/pzs0;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0

    .line 19
    :cond_0
    return-object v0
.end method

.method public final f(La/wsy;La/t3u0;)La/wsy;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, La/dvk;->b:La/vzs0;

    .line 8
    .line 9
    invoke-virtual {v0, p1, p2}, La/vzs0;->f(La/wsy;La/t3u0;)La/wsy;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    iget-object p0, p0, La/dvk;->c:La/vzs0;

    .line 14
    .line 15
    invoke-virtual {p0, p1, p2}, La/vzs0;->f(La/wsy;La/t3u0;)La/wsy;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0
.end method
