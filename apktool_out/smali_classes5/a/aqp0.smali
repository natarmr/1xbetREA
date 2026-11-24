.class public final La/aqp0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/q7d0;

.field public final b:La/vby;

.field public final c:La/k050;

.field public final d:Ljava/util/concurrent/ConcurrentHashMap;

.field public final e:La/p7m0;


# direct methods
.method public constructor <init>(La/vby;La/q7d0;)V
    .locals 4

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p2, p0, La/aqp0;->a:La/q7d0;

    .line 11
    .line 12
    iput-object p1, p0, La/aqp0;->b:La/vby;

    .line 13
    .line 14
    new-instance v0, La/k050;

    .line 15
    .line 16
    invoke-direct {v0}, La/k050;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, La/aqp0;->c:La/k050;

    .line 20
    .line 21
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 22
    .line 23
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 24
    .line 25
    .line 26
    iput-object v0, p0, La/aqp0;->d:Ljava/util/concurrent/ConcurrentHashMap;

    .line 27
    .line 28
    :try_start_0
    const-string v0, "PREF_KEY_MY_TEAMS"

    .line 29
    .line 30
    const-string v1, ""

    .line 31
    .line 32
    invoke-virtual {p2}, La/q7d0;->a()Landroid/content/SharedPreferences;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    invoke-interface {p2, v0, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p2

    .line 40
    if-eqz p2, :cond_1

    .line 41
    .line 42
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    if-nez v0, :cond_0

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_0
    new-instance v0, La/inv;

    .line 50
    .line 51
    sget-object v1, La/okx;->a:La/okx;

    .line 52
    .line 53
    new-instance v2, La/zw3;

    .line 54
    .line 55
    const/4 v3, 0x0

    .line 56
    invoke-direct {v2, v1, v3}, La/zw3;-><init>(La/jiy;B)V

    .line 57
    .line 58
    .line 59
    const/4 v3, 0x1

    .line 60
    invoke-direct {v0, v1, v2, v3}, La/inv;-><init>(La/jiy;La/jiy;B)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p1, v0, p2}, La/vby;->b(La/jiy;Ljava/lang/String;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    check-cast p1, Ljava/util/Map;

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_1
    :goto_0
    sget-object p1, La/lun;->a:La/lun;

    .line 71
    .line 72
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 73
    .line 74
    .line 75
    goto :goto_1

    .line 76
    :catch_0
    sget-object p1, La/lun;->a:La/lun;

    .line 77
    .line 78
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    :goto_1
    invoke-static {p1}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    iput-object p1, p0, La/aqp0;->e:La/p7m0;

    .line 86
    .line 87
    return-void
.end method
