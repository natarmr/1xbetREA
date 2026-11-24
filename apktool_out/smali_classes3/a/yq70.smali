.class public final La/yq70;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/uq70;


# instance fields
.field public final a:La/k6k0;

.field public final b:La/va;


# direct methods
.method public constructor <init>(La/k6k0;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/yq70;->a:La/k6k0;

    .line 8
    .line 9
    iget-object p1, p1, La/k6k0;->k:La/qoj0;

    .line 10
    .line 11
    new-instance v0, La/va;

    .line 12
    .line 13
    const/16 v1, 0x13

    .line 14
    .line 15
    invoke-direct {v0, p1, v1}, La/va;-><init>(La/qoj0;B)V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, La/yq70;->b:La/va;

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 0

    .line 1
    iget-object p0, p0, La/yq70;->a:La/k6k0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/k6k0;->c()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final b(La/xo9;)V
    .locals 6

    .line 1
    new-instance v0, La/t5k0;

    .line 2
    .line 3
    iget-object v1, p1, La/xo9;->a:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v2, p1, La/xo9;->b:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v3, p1, La/xo9;->c:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v4, p1, La/xo9;->d:Ljava/lang/String;

    .line 10
    .line 11
    iget-object v5, p1, La/xo9;->e:Ljava/util/Map;

    .line 12
    .line 13
    invoke-direct/range {v0 .. v5}, La/t5k0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    .line 14
    .line 15
    .line 16
    iget-object p0, p0, La/yq70;->a:La/k6k0;

    .line 17
    .line 18
    invoke-virtual {p0, v0}, La/k6k0;->e(La/t5k0;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public final c()V
    .locals 2

    .line 1
    iget-object p0, p0, La/yq70;->a:La/k6k0;

    .line 2
    .line 3
    iget-object p0, p0, La/k6k0;->i:La/jt2;

    .line 4
    .line 5
    const-string v0, "call ended by user"

    .line 6
    .line 7
    iget-object p0, p0, La/jt2;->a:La/n6k0;

    .line 8
    .line 9
    const-string v1, "onCallEndedByUser"

    .line 10
    .line 11
    invoke-virtual {p0, v1, v0}, La/n6k0;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final close()V
    .locals 0

    .line 1
    iget-object p0, p0, La/yq70;->a:La/k6k0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/k6k0;->a()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final d(Z)V
    .locals 0

    .line 1
    iget-object p0, p0, La/yq70;->a:La/k6k0;

    .line 2
    .line 3
    iget-object p0, p0, La/k6k0;->f:La/u24;

    .line 4
    .line 5
    iget-object p0, p0, La/u24;->a:Landroid/media/AudioManager;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Landroid/media/AudioManager;->setSpeakerphoneOn(Z)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final e(Z)V
    .locals 0

    .line 1
    iget-object p0, p0, La/yq70;->a:La/k6k0;

    .line 2
    .line 3
    iget-object p0, p0, La/k6k0;->e:La/v34;

    .line 4
    .line 5
    xor-int/lit8 p1, p1, 0x1

    .line 6
    .line 7
    iget-object p0, p0, La/v34;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final f()Z
    .locals 0

    .line 1
    iget-object p0, p0, La/yq70;->a:La/k6k0;

    .line 2
    .line 3
    iget-object p0, p0, La/k6k0;->s:La/t5k0;

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0

    .line 9
    :cond_0
    const/4 p0, 0x0

    .line 10
    return p0
.end method

.method public final g()Z
    .locals 0

    .line 1
    iget-object p0, p0, La/yq70;->a:La/k6k0;

    .line 2
    .line 3
    iget-object p0, p0, La/k6k0;->c:La/x5k0;

    .line 4
    .line 5
    iget-object p0, p0, La/x5k0;->d:Ljava/util/concurrent/atomic/AtomicReference;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    check-cast p0, La/y5k0;

    .line 12
    .line 13
    iget-boolean p0, p0, La/y5k0;->d:Z

    .line 14
    .line 15
    return p0
.end method

.method public final h()La/gmq;
    .locals 0

    .line 1
    iget-object p0, p0, La/yq70;->b:La/va;

    .line 2
    .line 3
    return-object p0
.end method
