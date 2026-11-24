.class public final La/u940;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/us00;


# direct methods
.method public constructor <init>(La/us00;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/u940;->a:La/us00;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(Lcom/google/firebase/messaging/RemoteMessage;La/gmo;)V
    .locals 12

    .line 1
    invoke-virtual {p1}, Lcom/google/firebase/messaging/RemoteMessage;->m()Ljava/util/HashMap;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const-string v0, "CIO-Delivery-Token"

    .line 6
    .line 7
    invoke-virtual {p1, v0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    new-instance p2, La/laj;

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    invoke-direct {p2, v0}, La/laj;-><init>(B)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p2, p1}, La/laj;->c(Ljava/util/Map;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p2}, La/laj;->a()La/maj;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    new-instance p2, La/hl50;

    .line 27
    .line 28
    sget-object p2, La/sl50;->a:La/sl50;

    .line 29
    .line 30
    new-instance p2, Ljava/util/LinkedHashSet;

    .line 31
    .line 32
    invoke-direct {p2}, Ljava/util/LinkedHashSet;-><init>()V

    .line 33
    .line 34
    .line 35
    sget-object v2, La/sl50;->b:La/sl50;

    .line 36
    .line 37
    new-instance v1, La/hl50;

    .line 38
    .line 39
    const/4 v0, 0x0

    .line 40
    invoke-direct {v1, v0}, La/hl50;-><init>(Landroid/net/NetworkRequest;)V

    .line 41
    .line 42
    .line 43
    invoke-static {p2}, Lkotlin/collections/CollectionsKt;->P0(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 44
    .line 45
    .line 46
    move-result-object v11

    .line 47
    new-instance v0, La/o4e;

    .line 48
    .line 49
    const/4 v3, 0x0

    .line 50
    const/4 v4, 0x0

    .line 51
    const/4 v5, 0x0

    .line 52
    const/4 v6, 0x0

    .line 53
    const-wide/16 v7, -0x1

    .line 54
    .line 55
    move-wide v9, v7

    .line 56
    invoke-direct/range {v0 .. v11}, La/o4e;-><init>(La/hl50;La/sl50;ZZZZJJLjava/util/Set;)V

    .line 57
    .line 58
    .line 59
    new-instance p2, La/xl60;

    .line 60
    .line 61
    const-class v1, Lorg/xplatform/services/mobile_services/impl/workers/CustomerIOPushWorker;

    .line 62
    .line 63
    invoke-direct {p2, v1}, La/v0;-><init>(Ljava/lang/Class;)V

    .line 64
    .line 65
    .line 66
    sget-object v1, La/od80;->a:La/od80;

    .line 67
    .line 68
    invoke-virtual {p2}, La/v0;->w()La/v0;

    .line 69
    .line 70
    .line 71
    move-result-object p2

    .line 72
    check-cast p2, La/xl60;

    .line 73
    .line 74
    iget-object v1, p2, La/v0;->c:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v1, La/ppv0;

    .line 77
    .line 78
    iput-object v0, v1, La/ppv0;->j:La/o4e;

    .line 79
    .line 80
    iget-object v0, p2, La/v0;->c:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast v0, La/ppv0;

    .line 83
    .line 84
    iput-object p1, v0, La/ppv0;->e:La/maj;

    .line 85
    .line 86
    invoke-virtual {p2}, La/v0;->k()La/lpv0;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    check-cast p1, La/yl60;

    .line 91
    .line 92
    iget-object p0, p0, La/u940;->a:La/us00;

    .line 93
    .line 94
    invoke-static {p0}, La/cpv0;->d(Landroid/content/Context;)La/cpv0;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 99
    .line 100
    .line 101
    invoke-virtual {p0, p1}, La/cpv0;->a(La/lpv0;)V

    .line 102
    .line 103
    .line 104
    return-void

    .line 105
    :cond_0
    invoke-virtual {p2}, La/gmo;->invoke()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    return-void
.end method
