.class public abstract Lorg/xplatform/background_video/api/presentation/m;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(La/be5;)Lorg/xplatform/background_video/api/presentation/BackgroundVideoDownloadServiceParams;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    instance-of v0, p0, La/vd5;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    new-instance v0, Lorg/xplatform/background_video/api/presentation/BackgroundVideoDownloadServiceParams$StartDestination$Preview$Large;

    .line 9
    .line 10
    check-cast p0, La/vd5;

    .line 11
    .line 12
    iget-object p0, p0, La/vd5;->a:Ljava/lang/String;

    .line 13
    .line 14
    invoke-direct {v0, p0}, Lorg/xplatform/background_video/api/presentation/BackgroundVideoDownloadServiceParams$StartDestination$Preview$Large;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return-object v0

    .line 18
    :cond_0
    instance-of v0, p0, La/wd5;

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    new-instance v0, Lorg/xplatform/background_video/api/presentation/BackgroundVideoDownloadServiceParams$StartDestination$Preview$Medium;

    .line 23
    .line 24
    check-cast p0, La/wd5;

    .line 25
    .line 26
    iget-object p0, p0, La/wd5;->a:Ljava/lang/String;

    .line 27
    .line 28
    invoke-direct {v0, p0}, Lorg/xplatform/background_video/api/presentation/BackgroundVideoDownloadServiceParams$StartDestination$Preview$Medium;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    return-object v0

    .line 32
    :cond_1
    instance-of v0, p0, La/xd5;

    .line 33
    .line 34
    if-eqz v0, :cond_2

    .line 35
    .line 36
    new-instance v0, Lorg/xplatform/background_video/api/presentation/BackgroundVideoDownloadServiceParams$StartDestination$Preview$Small;

    .line 37
    .line 38
    check-cast p0, La/xd5;

    .line 39
    .line 40
    iget-object p0, p0, La/xd5;->a:Ljava/lang/String;

    .line 41
    .line 42
    invoke-direct {v0, p0}, Lorg/xplatform/background_video/api/presentation/BackgroundVideoDownloadServiceParams$StartDestination$Preview$Small;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    return-object v0

    .line 46
    :cond_2
    instance-of v0, p0, La/yd5;

    .line 47
    .line 48
    if-eqz v0, :cond_3

    .line 49
    .line 50
    new-instance v0, Lorg/xplatform/background_video/api/presentation/BackgroundVideoDownloadServiceParams$StartDestination$Video$Large;

    .line 51
    .line 52
    check-cast p0, La/yd5;

    .line 53
    .line 54
    iget-object p0, p0, La/yd5;->a:Ljava/lang/String;

    .line 55
    .line 56
    invoke-direct {v0, p0}, Lorg/xplatform/background_video/api/presentation/BackgroundVideoDownloadServiceParams$StartDestination$Video$Large;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    return-object v0

    .line 60
    :cond_3
    instance-of v0, p0, La/zd5;

    .line 61
    .line 62
    if-eqz v0, :cond_4

    .line 63
    .line 64
    new-instance v0, Lorg/xplatform/background_video/api/presentation/BackgroundVideoDownloadServiceParams$StartDestination$Video$Medium;

    .line 65
    .line 66
    check-cast p0, La/zd5;

    .line 67
    .line 68
    iget-object p0, p0, La/zd5;->a:Ljava/lang/String;

    .line 69
    .line 70
    invoke-direct {v0, p0}, Lorg/xplatform/background_video/api/presentation/BackgroundVideoDownloadServiceParams$StartDestination$Video$Medium;-><init>(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    return-object v0

    .line 74
    :cond_4
    instance-of v0, p0, La/ae5;

    .line 75
    .line 76
    if-eqz v0, :cond_5

    .line 77
    .line 78
    new-instance v0, Lorg/xplatform/background_video/api/presentation/BackgroundVideoDownloadServiceParams$StartDestination$Video$Small;

    .line 79
    .line 80
    check-cast p0, La/ae5;

    .line 81
    .line 82
    iget-object p0, p0, La/ae5;->a:Ljava/lang/String;

    .line 83
    .line 84
    invoke-direct {v0, p0}, Lorg/xplatform/background_video/api/presentation/BackgroundVideoDownloadServiceParams$StartDestination$Video$Small;-><init>(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    return-object v0

    .line 88
    :cond_5
    invoke-static {}, La/t9f;->b()V

    .line 89
    .line 90
    .line 91
    const/4 p0, 0x0

    .line 92
    return-object p0
.end method
