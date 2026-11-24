.class public interface abstract La/ndk0;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public a()Z
    .locals 2

    .line 1
    invoke-interface {p0}, La/ndk0;->c()La/rrm;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-static {}, La/n660;->q()La/n660;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iget-object p0, p0, La/g46;->u:La/d46;

    .line 13
    .line 14
    iget-object v1, v0, La/n660;->a:Ljava/lang/Object;

    .line 15
    .line 16
    monitor-enter v1

    .line 17
    :try_start_0
    invoke-virtual {v0, p0}, La/n660;->B(La/d46;)Z

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    monitor-exit v1

    .line 22
    return p0

    .line 23
    :catchall_0
    move-exception p0

    .line 24
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    throw p0
.end method

.method public abstract b()Lkotlin/jvm/functions/Function1;
.end method

.method public abstract c()La/rrm;
.end method

.method public dismiss()V
    .locals 1

    .line 1
    invoke-interface {p0}, La/ndk0;->c()La/rrm;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 v0, 0x3

    .line 6
    invoke-virtual {p0, v0}, La/g46;->a(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method
