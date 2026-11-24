.class public final La/s3a;
.super La/q3a;
.source "SourceFile"


# static fields
.field public static final b:La/s3a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, La/s3a;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/s3a;->b:La/s3a;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(La/nzw;La/ucs0;)V
    .locals 2

    .line 1
    invoke-super {p0, p1, p2}, La/q3a;->a(La/nzw;La/ucs0;)V

    .line 2
    .line 3
    .line 4
    invoke-static {}, La/wy40;->l()La/wy40;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    const-class v0, Landroidx/camera/camera2/compat/quirk/ImageCapturePixelHDRPlusQuirk;

    .line 9
    .line 10
    invoke-static {}, La/mhk;->a()La/kpd0;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v1, v0}, La/kpd0;->b(Ljava/lang/Class;)La/gpd0;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, Landroidx/camera/camera2/compat/quirk/ImageCapturePixelHDRPlusQuirk;

    .line 19
    .line 20
    if-nez v0, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    sget-object v0, La/nzw;->b:La/u15;

    .line 24
    .line 25
    invoke-interface {p1, v0}, La/qae0;->f(La/u15;)Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-nez v1, :cond_1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    invoke-interface {p1, v0}, La/qae0;->d(La/u15;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    check-cast p1, Ljava/lang/Integer;

    .line 37
    .line 38
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    if-eqz p1, :cond_3

    .line 43
    .line 44
    const/4 v0, 0x1

    .line 45
    if-eq p1, v0, :cond_2

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_2
    invoke-static {}, La/c0g;->d()Landroid/hardware/camera2/CaptureRequest$Key;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 56
    .line 57
    invoke-static {p1}, La/s5x0;->C(Landroid/hardware/camera2/CaptureRequest$Key;)La/u15;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    invoke-virtual {p0, p1, v0}, La/wy40;->y(La/u15;Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_3
    invoke-static {}, La/c0g;->d()Landroid/hardware/camera2/CaptureRequest$Key;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 73
    .line 74
    invoke-static {p1}, La/s5x0;->C(Landroid/hardware/camera2/CaptureRequest$Key;)La/u15;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    invoke-virtual {p0, p1, v0}, La/wy40;->y(La/u15;Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    :goto_0
    new-instance p1, La/hx9;

    .line 82
    .line 83
    invoke-static {p0}, La/b780;->j(La/drd;)La/b780;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    const/16 v0, 0x14

    .line 88
    .line 89
    invoke-direct {p1, p0, v0}, La/h03;-><init>(Ljava/lang/Object;B)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {p2, p1}, La/ucs0;->g(La/drd;)V

    .line 93
    .line 94
    .line 95
    return-void
.end method
