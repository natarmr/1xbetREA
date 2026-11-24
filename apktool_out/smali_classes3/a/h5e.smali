.class public final synthetic La/h5e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/rg90;
.implements La/fer;


# instance fields
.field public final synthetic a:La/i5e;


# direct methods
.method public constructor <init>(La/i5e;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/h5e;->a:La/i5e;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final b()La/wdr;
    .locals 7

    .line 1
    new-instance v0, La/rer;

    .line 2
    .line 3
    const-string v5, "onCameraPermissionResult(Ljava/util/List;)V"

    .line 4
    .line 5
    const/4 v6, 0x0

    .line 6
    const/4 v1, 0x1

    .line 7
    iget-object v2, p0, La/h5e;->a:La/i5e;

    .line 8
    .line 9
    const-class v3, La/i5e;

    .line 10
    .line 11
    const-string v4, "onCameraPermissionResult"

    .line 12
    .line 13
    invoke-direct/range {v0 .. v6}, La/qer;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 14
    .line 15
    .line 16
    return-object v0
.end method

.method public final d(Ljava/util/ArrayList;)V
    .locals 2

    .line 1
    sget-object v0, La/i5e;->q2:La/kud;

    .line 2
    .line 3
    iget-object p0, p0, La/h5e;->a:La/i5e;

    .line 4
    .line 5
    invoke-virtual {p0}, La/i5e;->W0()La/c6e;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-static {p1}, La/n7x;->p(Ljava/util/List;)Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    if-eqz p1, :cond_3

    .line 14
    .line 15
    iget-object p1, p0, La/c6e;->f:La/pru;

    .line 16
    .line 17
    invoke-virtual {p1}, La/pru;->a()La/sff0;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    iget-boolean p1, p1, La/sff0;->M0:Z

    .line 22
    .line 23
    if-eqz p1, :cond_1

    .line 24
    .line 25
    iget-object p1, p0, La/c6e;->b:La/i1w0;

    .line 26
    .line 27
    invoke-static {p1, p1}, La/cs0;->i(La/i1w0;La/i1w0;)La/k0w0;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    iget-object p0, p0, La/c6e;->d:La/kj5;

    .line 32
    .line 33
    sget-object v1, La/kkd0;->b:La/kkd0;

    .line 34
    .line 35
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    new-instance p0, Lorg/xplatform/camera/impl/navigation/CameraScreens$CameraFragmentScreen;

    .line 39
    .line 40
    invoke-direct {p0}, Lorg/xplatform/camera/impl/navigation/CameraScreens$CameraFragmentScreen;-><init>()V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, p0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 44
    .line 45
    .line 46
    iget-object p0, v0, La/k0w0;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 47
    .line 48
    const/4 v0, 0x0

    .line 49
    invoke-static {p1, p0, v0}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    :goto_0
    move-object v0, p0

    .line 54
    check-cast v0, La/paw;

    .line 55
    .line 56
    invoke-virtual {v0}, La/paw;->hasNext()Z

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    if-eqz v1, :cond_0

    .line 61
    .line 62
    invoke-virtual {v0}, La/paw;->next()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    check-cast v0, La/oe50;

    .line 67
    .line 68
    invoke-virtual {p1, v0}, La/i1w0;->a(La/oe50;)V

    .line 69
    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_0
    return-void

    .line 73
    :cond_1
    iget-object p1, p0, La/c6e;->c:La/vqc;

    .line 74
    .line 75
    invoke-virtual {p1}, La/vqc;->h()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    if-lez v0, :cond_2

    .line 84
    .line 85
    new-instance v0, La/k5e;

    .line 86
    .line 87
    iget-object v1, p0, La/c6e;->e:La/aqt;

    .line 88
    .line 89
    invoke-virtual {v1}, La/aqt;->a()V

    .line 90
    .line 91
    .line 92
    invoke-direct {v0, p1}, La/k5e;-><init>(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {p0, v0}, La/c6e;->y(La/s5e;)V

    .line 96
    .line 97
    .line 98
    :cond_2
    return-void

    .line 99
    :cond_3
    sget-object p1, La/q5e;->a:La/q5e;

    .line 100
    .line 101
    invoke-virtual {p0, p1}, La/c6e;->y(La/s5e;)V

    .line 102
    .line 103
    .line 104
    return-void
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, La/rg90;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    instance-of v0, p1, La/fer;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, La/h5e;->b()La/wdr;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    check-cast p1, La/fer;

    .line 14
    .line 15
    invoke-interface {p1}, La/fer;->b()La/wdr;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    return p0

    .line 24
    :cond_0
    const/4 p0, 0x0

    .line 25
    return p0
.end method

.method public final hashCode()I
    .locals 0

    .line 1
    invoke-virtual {p0}, La/h5e;->b()La/wdr;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method
