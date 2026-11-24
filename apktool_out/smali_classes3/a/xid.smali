.class public final synthetic La/xid;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/hjd;

.field public final synthetic c:La/d0t;


# direct methods
.method public synthetic constructor <init>(La/hjd;La/d0t;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/xid;->a:B

    iput-object p1, p0, La/xid;->b:La/hjd;

    iput-object p2, p0, La/xid;->c:La/d0t;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    iget-byte v0, p0, La/xid;->a:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget-object v2, p0, La/xid;->c:La/d0t;

    .line 5
    .line 6
    iget-object p0, p0, La/xid;->b:La/hjd;

    .line 7
    .line 8
    check-cast p1, La/k0w0;

    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    new-instance v0, La/ffd;

    .line 17
    .line 18
    const/4 v3, 0x0

    .line 19
    const/4 v4, 0x2

    .line 20
    invoke-direct {v0, p0, v2, v3, v4}, La/ffd;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 21
    .line 22
    .line 23
    new-instance p0, La/b1w0;

    .line 24
    .line 25
    invoke-direct {p0, v0}, La/b1w0;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1, p0}, La/k0w0;->b(La/g1w0;)La/ikt0;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    iget-object p0, p0, La/ikt0;->a:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast p0, La/c8d;

    .line 35
    .line 36
    sget-object p1, La/cfx0;->o:La/bjk;

    .line 37
    .line 38
    new-instance v0, La/v7d;

    .line 39
    .line 40
    invoke-direct {v0, v1, p1, p1}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 41
    .line 42
    .line 43
    iput-object v0, p0, La/c8d;->a:La/w7d;

    .line 44
    .line 45
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 46
    .line 47
    return-object p0

    .line 48
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    iget-object p0, p0, La/hjd;->h:La/uf3;

    .line 52
    .line 53
    iget-wide v4, v2, La/d0t;->a:J

    .line 54
    .line 55
    iget-wide v8, v2, La/d0t;->v:J

    .line 56
    .line 57
    iget-wide v10, v2, La/d0t;->u:J

    .line 58
    .line 59
    iget-wide v6, v2, La/d0t;->x:J

    .line 60
    .line 61
    invoke-static {v2}, La/qzb;->o0(La/d0t;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v12

    .line 65
    iget-boolean v13, v2, La/d0t;->C:Z

    .line 66
    .line 67
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    new-instance v3, Lorg/xplatform/feed/navigation/OldGameNotificationScreenFactoryImpl$getGameNotificationScreen$1;

    .line 71
    .line 72
    invoke-direct/range {v3 .. v13}, Lorg/xplatform/feed/navigation/OldGameNotificationScreenFactoryImpl$getGameNotificationScreen$1;-><init>(JJJJLjava/lang/String;Z)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {p1, v3}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    iget-object p0, p0, La/ikt0;->a:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast p0, La/c8d;

    .line 82
    .line 83
    sget-object p1, La/cfx0;->o:La/bjk;

    .line 84
    .line 85
    new-instance v0, La/v7d;

    .line 86
    .line 87
    invoke-direct {v0, v1, p1, p1}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 88
    .line 89
    .line 90
    iput-object v0, p0, La/c8d;->a:La/w7d;

    .line 91
    .line 92
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 93
    .line 94
    return-object p0

    .line 95
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
