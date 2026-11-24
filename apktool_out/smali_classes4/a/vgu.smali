.class public final La/vgu;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/vff0;


# direct methods
.method public constructor <init>(La/vff0;B)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    packed-switch p2, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, La/vgu;->a:La/vff0;

    .line 11
    .line 12
    return-void

    .line 13
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, La/vgu;->a:La/vff0;

    .line 17
    .line 18
    return-void

    .line 19
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public a(La/mcy;Ljava/lang/String;)V
    .locals 4

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, La/vgu;->a:La/vff0;

    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    :try_start_0
    invoke-virtual {p0}, La/vff0;->e()Ljava/util/Map;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    new-instance v1, Ljava/util/LinkedHashMap;

    .line 14
    .line 15
    invoke-direct {v1, v0}, Ljava/util/LinkedHashMap;-><init>(Ljava/util/Map;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1, p2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    check-cast v0, La/ssd;

    .line 23
    .line 24
    if-nez v0, :cond_0

    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    iget-object v2, v0, La/ssd;->a:La/mcy;

    .line 28
    .line 29
    iget-object v0, v0, La/ssd;->c:Ljava/util/List;

    .line 30
    .line 31
    new-instance v3, La/ssd;

    .line 32
    .line 33
    invoke-direct {v3, v2, p1, v0}, La/ssd;-><init>(La/mcy;La/mcy;Ljava/util/List;)V

    .line 34
    .line 35
    .line 36
    invoke-interface {v1, p2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    iget-object p1, p0, La/vff0;->h:La/vby;

    .line 40
    .line 41
    new-instance p2, La/inv;

    .line 42
    .line 43
    sget-object v0, La/ysm0;->a:La/ysm0;

    .line 44
    .line 45
    sget-object v2, La/ssd;->Companion:La/rsd;

    .line 46
    .line 47
    invoke-virtual {v2}, La/rsd;->serializer()La/jiy;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    const/4 v3, 0x1

    .line 52
    invoke-direct {p2, v0, v2, v3}, La/inv;-><init>(La/jiy;La/jiy;B)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p1, p2, v1}, La/vby;->d(La/jiy;Ljava/lang/Object;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    iget-object p2, p0, La/vff0;->c:La/q7d0;

    .line 60
    .line 61
    const-string v0, "TEST_SECTION_CONFIG_KEY"

    .line 62
    .line 63
    invoke-virtual {p2, v0, p1}, La/q7d0;->g(Ljava/lang/String;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    iput-object v1, p0, La/vff0;->q:Ljava/util/LinkedHashMap;

    .line 67
    .line 68
    iget-object p0, p0, La/vff0;->k:Ljava/util/concurrent/ConcurrentHashMap;

    .line 69
    .line 70
    invoke-virtual {p0}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 71
    .line 72
    .line 73
    return-void

    .line 74
    :catch_0
    move-exception p0

    .line 75
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 76
    .line 77
    .line 78
    return-void
.end method
