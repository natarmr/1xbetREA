.class public final La/dgk;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/ivn;


# direct methods
.method public constructor <init>(La/ivn;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/dgk;->a:La/ivn;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(ZLa/bnn0;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object p0, p0, La/dgk;->a:La/ivn;

    .line 2
    .line 3
    iget-object p0, p0, La/ivn;->a:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, La/zri;

    .line 6
    .line 7
    new-instance v0, La/n5a;

    .line 8
    .line 9
    invoke-static {p2}, La/pnx;->b(La/yje;)La/yje;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    const/4 v1, 0x1

    .line 14
    invoke-direct {v0, v1, p2}, La/n5a;-><init>(ILa/yje;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, La/n5a;->r()V

    .line 18
    .line 19
    .line 20
    iget-object p2, p0, La/zri;->c:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast p2, La/vwb0;

    .line 23
    .line 24
    if-nez p1, :cond_0

    .line 25
    .line 26
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    invoke-virtual {p2}, La/vwb0;->b()Landroid/content/SharedPreferences;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    const-string v1, "PREF_IS_EMULATOR"

    .line 34
    .line 35
    invoke-interface {p1, v1}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    if-eqz p1, :cond_0

    .line 40
    .line 41
    sget-object p0, La/j0g0;->b:La/e0g0;

    .line 42
    .line 43
    invoke-virtual {p2}, La/vwb0;->b()Landroid/content/SharedPreferences;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    const/4 p1, 0x0

    .line 48
    invoke-interface {p0, v1, p1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    invoke-virtual {v0, p0}, La/n5a;->resumeWith(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 61
    .line 62
    .line 63
    move-result-wide v1

    .line 64
    new-instance p1, La/chf0;

    .line 65
    .line 66
    iget-object p0, p0, La/zri;->b:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast p0, La/us00;

    .line 69
    .line 70
    invoke-direct {p1, p0}, La/chf0;-><init>(La/us00;)V

    .line 71
    .line 72
    .line 73
    new-instance p0, La/ctl;

    .line 74
    .line 75
    invoke-direct {p0, v1, v2, p2, v0}, La/ctl;-><init>(JLa/vwb0;La/n5a;)V

    .line 76
    .line 77
    .line 78
    new-instance p2, Ljava/lang/Thread;

    .line 79
    .line 80
    new-instance v1, La/a4e;

    .line 81
    .line 82
    const/16 v2, 0x1d

    .line 83
    .line 84
    invoke-direct {v1, p1, p0, v2}, La/a4e;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 85
    .line 86
    .line 87
    invoke-direct {p2, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {p2}, Ljava/lang/Thread;->start()V

    .line 91
    .line 92
    .line 93
    :goto_0
    invoke-virtual {v0}, La/n5a;->p()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    sget-object p1, La/wne;->a:La/wne;

    .line 98
    .line 99
    return-object p0
.end method
