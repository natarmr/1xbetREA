.class public final La/dz2;
.super Landroid/hardware/camera2/CameraExtensionSession$StateCallback;
.source "SourceFile"


# instance fields
.field public final a:La/nw2;

.field public final b:La/cto;

.field public final c:La/gx9;

.field public final d:La/chf0;

.field public final e:La/k03;

.field public final f:La/c14;

.field public final g:La/c14;


# direct methods
.method public constructor <init>(La/nw2;La/cto;La/iki0;La/gx9;La/chf0;La/k03;)V
    .locals 0

    .line 1
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Landroid/hardware/camera2/CameraExtensionSession$StateCallback;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/dz2;->a:La/nw2;

    .line 8
    .line 9
    iput-object p2, p0, La/dz2;->b:La/cto;

    .line 10
    .line 11
    iput-object p4, p0, La/dz2;->c:La/gx9;

    .line 12
    .line 13
    iput-object p5, p0, La/dz2;->d:La/chf0;

    .line 14
    .line 15
    iput-object p6, p0, La/dz2;->e:La/k03;

    .line 16
    .line 17
    invoke-static {p3}, La/o2e;->Z(Ljava/lang/Object;)La/c14;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    iput-object p1, p0, La/dz2;->f:La/c14;

    .line 22
    .line 23
    const/4 p1, 0x0

    .line 24
    invoke-static {p1}, La/o2e;->Z(Ljava/lang/Object;)La/c14;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    iput-object p1, p0, La/dz2;->g:La/c14;

    .line 29
    .line 30
    return-void
.end method


# virtual methods
.method public final a(Landroid/hardware/camera2/CameraExtensionSession;La/gx9;)La/qw2;
    .locals 3

    .line 1
    iget-object v0, p0, La/dz2;->g:La/c14;

    .line 2
    .line 3
    iget-object v0, v0, La/c14;->a:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, La/qw2;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    return-object v0

    .line 10
    :cond_0
    new-instance v0, La/qw2;

    .line 11
    .line 12
    iget-object v1, p0, La/dz2;->a:La/nw2;

    .line 13
    .line 14
    iget-object v2, p0, La/dz2;->e:La/k03;

    .line 15
    .line 16
    invoke-direct {v0, v1, p1, p2, v2}, La/qw2;-><init>(La/nw2;Landroid/hardware/camera2/CameraExtensionSession;La/gx9;La/k03;)V

    .line 17
    .line 18
    .line 19
    iget-object p1, p0, La/dz2;->g:La/c14;

    .line 20
    .line 21
    const/4 p2, 0x0

    .line 22
    invoke-virtual {p1, p2, v0}, La/c14;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    if-eqz p1, :cond_1

    .line 27
    .line 28
    return-object v0

    .line 29
    :cond_1
    iget-object p0, p0, La/dz2;->g:La/c14;

    .line 30
    .line 31
    iget-object p0, p0, La/c14;->a:Ljava/lang/Object;

    .line 32
    .line 33
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    check-cast p0, La/qw2;

    .line 37
    .line 38
    return-object p0
.end method

.method public final onClosed(Landroid/hardware/camera2/CameraExtensionSession;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La/dz2;->c:La/gx9;

    .line 5
    .line 6
    invoke-virtual {p0, p1, v0}, La/dz2;->a(Landroid/hardware/camera2/CameraExtensionSession;La/gx9;)La/qw2;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, p1, v0}, La/dz2;->a(Landroid/hardware/camera2/CameraExtensionSession;La/gx9;)La/qw2;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    iget-object v0, p0, La/dz2;->b:La/cto;

    .line 14
    .line 15
    iget-object v1, v0, La/cto;->a:La/r9a;

    .line 16
    .line 17
    invoke-virtual {v1, p1}, La/r9a;->b(La/fy9;)V

    .line 18
    .line 19
    .line 20
    const/4 p1, 0x0

    .line 21
    sget-object v1, La/c14;->b:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 22
    .line 23
    iget-object v2, p0, La/dz2;->f:La/c14;

    .line 24
    .line 25
    invoke-virtual {v1, v2, p1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->getAndSet(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    check-cast p1, La/iki0;

    .line 30
    .line 31
    if-eqz p1, :cond_0

    .line 32
    .line 33
    invoke-interface {p1}, La/iki0;->a()V

    .line 34
    .line 35
    .line 36
    :cond_0
    invoke-virtual {v0}, La/cto;->a()V

    .line 37
    .line 38
    .line 39
    iget-object p1, p0, La/dz2;->d:La/chf0;

    .line 40
    .line 41
    if-eqz p1, :cond_1

    .line 42
    .line 43
    iget-object p0, p0, La/dz2;->a:La/nw2;

    .line 44
    .line 45
    iget-object p0, p0, La/nw2;->c:Ljava/lang/String;

    .line 46
    .line 47
    invoke-virtual {p1, p0}, La/chf0;->Y(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    :cond_1
    return-void
.end method

.method public final onConfigureFailed(Landroid/hardware/camera2/CameraExtensionSession;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La/dz2;->c:La/gx9;

    .line 5
    .line 6
    invoke-virtual {p0, p1, v0}, La/dz2;->a(Landroid/hardware/camera2/CameraExtensionSession;La/gx9;)La/qw2;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iget-object v0, p0, La/dz2;->b:La/cto;

    .line 11
    .line 12
    iget-object v1, v0, La/cto;->a:La/r9a;

    .line 13
    .line 14
    invoke-virtual {v1, p1}, La/r9a;->e(La/fy9;)V

    .line 15
    .line 16
    .line 17
    const/4 p1, 0x0

    .line 18
    sget-object v1, La/c14;->b:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 19
    .line 20
    iget-object v2, p0, La/dz2;->f:La/c14;

    .line 21
    .line 22
    invoke-virtual {v1, v2, p1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->getAndSet(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    check-cast p1, La/iki0;

    .line 27
    .line 28
    if-eqz p1, :cond_0

    .line 29
    .line 30
    invoke-interface {p1}, La/iki0;->a()V

    .line 31
    .line 32
    .line 33
    :cond_0
    invoke-virtual {v0}, La/cto;->a()V

    .line 34
    .line 35
    .line 36
    iget-object p1, p0, La/dz2;->d:La/chf0;

    .line 37
    .line 38
    if-eqz p1, :cond_1

    .line 39
    .line 40
    iget-object p0, p0, La/dz2;->a:La/nw2;

    .line 41
    .line 42
    iget-object p0, p0, La/nw2;->c:Ljava/lang/String;

    .line 43
    .line 44
    invoke-virtual {p1, p0}, La/chf0;->Z(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    :cond_1
    return-void
.end method

.method public final onConfigured(Landroid/hardware/camera2/CameraExtensionSession;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La/dz2;->c:La/gx9;

    .line 5
    .line 6
    invoke-virtual {p0, p1, v0}, La/dz2;->a(Landroid/hardware/camera2/CameraExtensionSession;La/gx9;)La/qw2;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iget-object v0, p0, La/dz2;->b:La/cto;

    .line 11
    .line 12
    iget-object v0, v0, La/cto;->a:La/r9a;

    .line 13
    .line 14
    invoke-virtual {v0, p1}, La/r9a;->f(La/fy9;)V

    .line 15
    .line 16
    .line 17
    const/4 p1, 0x0

    .line 18
    sget-object v0, La/c14;->b:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 19
    .line 20
    iget-object v1, p0, La/dz2;->f:La/c14;

    .line 21
    .line 22
    invoke-virtual {v0, v1, p1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->getAndSet(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    check-cast p1, La/iki0;

    .line 27
    .line 28
    if-eqz p1, :cond_0

    .line 29
    .line 30
    invoke-interface {p1}, La/iki0;->a()V

    .line 31
    .line 32
    .line 33
    :cond_0
    iget-object p1, p0, La/dz2;->d:La/chf0;

    .line 34
    .line 35
    if-eqz p1, :cond_1

    .line 36
    .line 37
    iget-object p0, p0, La/dz2;->a:La/nw2;

    .line 38
    .line 39
    iget-object p0, p0, La/nw2;->c:Ljava/lang/String;

    .line 40
    .line 41
    invoke-virtual {p1, p0}, La/chf0;->a0(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    :cond_1
    return-void
.end method
