.class public final La/wp2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/vp2;


# static fields
.field public static volatile c:La/wp2;


# instance fields
.field public final a:Lcom/google/android/gms/measurement/api/AppMeasurementSdk;

.field public final b:Ljava/util/concurrent/ConcurrentHashMap;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/measurement/api/AppMeasurementSdk;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, La/s0x;->H(Ljava/lang/Object;)V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/wp2;->a:Lcom/google/android/gms/measurement/api/AppMeasurementSdk;

    .line 8
    .line 9
    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    .line 10
    .line 11
    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, La/wp2;->b:Ljava/util/concurrent/ConcurrentHashMap;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 3

    .line 1
    invoke-static {p1}, La/tnw0;->a(Ljava/lang/String;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-static {p3, p2}, La/tnw0;->b(Landroid/os/Bundle;Ljava/lang/String;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_2

    .line 13
    .line 14
    invoke-static {p3, p1, p2}, La/tnw0;->d(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_2

    .line 19
    .line 20
    const-string v0, "clx"

    .line 21
    .line 22
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    const-string v0, "_ae"

    .line 29
    .line 30
    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eqz v0, :cond_1

    .line 35
    .line 36
    const-string v0, "_r"

    .line 37
    .line 38
    const-wide/16 v1, 0x1

    .line 39
    .line 40
    invoke-virtual {p3, v0, v1, v2}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 41
    .line 42
    .line 43
    :cond_1
    iget-object p0, p0, La/wp2;->a:Lcom/google/android/gms/measurement/api/AppMeasurementSdk;

    .line 44
    .line 45
    invoke-virtual {p0, p1, p2, p3}, Lcom/google/android/gms/measurement/api/AppMeasurementSdk;->logEvent(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 46
    .line 47
    .line 48
    :cond_2
    :goto_0
    return-void
.end method

.method public final b(Ljava/lang/String;La/yzn0;)La/pek0;
    .locals 4

    .line 1
    invoke-static {p1}, La/tnw0;->a(Ljava/lang/String;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    goto :goto_1

    .line 9
    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    iget-object v2, p0, La/wp2;->b:Ljava/util/concurrent/ConcurrentHashMap;

    .line 14
    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    invoke-virtual {v2, p1}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    invoke-virtual {v2, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_1
    const-string v0, "fiam"

    .line 31
    .line 32
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    iget-object p0, p0, La/wp2;->a:Lcom/google/android/gms/measurement/api/AppMeasurementSdk;

    .line 37
    .line 38
    if-eqz v0, :cond_2

    .line 39
    .line 40
    new-instance v0, La/fuj0;

    .line 41
    .line 42
    invoke-direct {v0, p0, p2}, La/fuj0;-><init>(Lcom/google/android/gms/measurement/api/AppMeasurementSdk;La/yzn0;)V

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_2
    const-string v0, "clx"

    .line 47
    .line 48
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    if-eqz v0, :cond_3

    .line 53
    .line 54
    new-instance v0, La/nmt0;

    .line 55
    .line 56
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 57
    .line 58
    .line 59
    iput-object p2, v0, La/nmt0;->a:Ljava/lang/Object;

    .line 60
    .line 61
    new-instance p2, La/vpw0;

    .line 62
    .line 63
    const/4 v3, 0x1

    .line 64
    invoke-direct {p2, v0, v3}, La/vpw0;-><init>(Ljava/lang/Object;B)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {p0, p2}, Lcom/google/android/gms/measurement/api/AppMeasurementSdk;->a(La/vpw0;)V

    .line 68
    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_3
    move-object v0, v1

    .line 72
    :goto_0
    if-eqz v0, :cond_4

    .line 73
    .line 74
    invoke-virtual {v2, p1, v0}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    new-instance p0, La/pek0;

    .line 78
    .line 79
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 80
    .line 81
    .line 82
    return-object p0

    .line 83
    :cond_4
    :goto_1
    return-object v1
.end method
