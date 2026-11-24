.class public final synthetic La/ouj;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/jgd;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/jkd0;


# direct methods
.method public synthetic constructor <init>(La/jkd0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/ouj;->a:B

    iput-object p1, p0, La/ouj;->b:La/jkd0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final x0(La/pzu;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-byte v0, p0, La/ouj;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/ouj;->b:La/jkd0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-static {p0, p1}, Lcom/google/firebase/remoteconfig/RemoteConfigRegistrar;->a(La/jkd0;La/pzu;)La/qff0;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0

    .line 13
    :pswitch_0
    invoke-static {p0, p1}, Lcom/google/firebase/perf/FirebasePerfRegistrar;->b(La/jkd0;La/pzu;)La/ogq;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0

    .line 18
    :pswitch_1
    invoke-static {p0, p1}, Lcom/google/firebase/messaging/FirebaseMessagingRegistrar;->a(La/jkd0;La/pzu;)Lcom/google/firebase/messaging/FirebaseMessaging;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_2
    new-instance v0, La/quj;

    .line 24
    .line 25
    const-class v1, Landroid/content/Context;

    .line 26
    .line 27
    invoke-virtual {p1, v1}, La/pzu;->a(Ljava/lang/Class;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    check-cast v1, Landroid/content/Context;

    .line 32
    .line 33
    const-class v2, La/nfq;

    .line 34
    .line 35
    invoke-virtual {p1, v2}, La/pzu;->a(Ljava/lang/Class;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    check-cast v2, La/nfq;

    .line 40
    .line 41
    invoke-virtual {v2}, La/nfq;->f()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    const-class v3, La/jtv;

    .line 46
    .line 47
    invoke-static {v3}, La/jkd0;->a(Ljava/lang/Class;)La/jkd0;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    invoke-virtual {p1, v3}, La/pzu;->m(La/jkd0;)Ljava/util/Set;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    const-class v4, La/yyj;

    .line 56
    .line 57
    invoke-virtual {p1, v4}, La/pzu;->j(Ljava/lang/Class;)La/p5d0;

    .line 58
    .line 59
    .line 60
    move-result-object v4

    .line 61
    invoke-virtual {p1, p0}, La/pzu;->e(La/jkd0;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    move-object v5, p0

    .line 66
    check-cast v5, Ljava/util/concurrent/Executor;

    .line 67
    .line 68
    invoke-direct/range {v0 .. v5}, La/quj;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/util/Set;La/p5d0;Ljava/util/concurrent/Executor;)V

    .line 69
    .line 70
    .line 71
    return-object v0

    .line 72
    nop

    .line 73
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
