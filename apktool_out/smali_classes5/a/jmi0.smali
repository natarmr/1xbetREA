.class public final synthetic La/jmi0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/lmi0;


# direct methods
.method public synthetic constructor <init>(La/lmi0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/jmi0;->a:B

    iput-object p1, p0, La/jmi0;->b:La/lmi0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 5

    .line 1
    iget-byte v0, p0, La/jmi0;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/jmi0;->b:La/lmi0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, La/lmi0;->a:La/vby;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    :try_start_0
    iget-object p0, p0, La/lmi0;->b:La/vwb0;

    .line 12
    .line 13
    const-string v2, "SAVED_TIMER_STATUS_KEY"

    .line 14
    .line 15
    const-string v3, ""

    .line 16
    .line 17
    invoke-virtual {p0, v2, v3}, La/vwb0;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    new-instance v2, La/smi0;

    .line 22
    .line 23
    sget-object v3, La/umi0;->b:La/umi0;

    .line 24
    .line 25
    invoke-direct {v2, v3, v1}, La/smi0;-><init>(La/umi0;Z)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    sget-object v3, La/smi0;->Companion:La/rmi0;

    .line 32
    .line 33
    invoke-virtual {v3}, La/rmi0;->serializer()La/jiy;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    check-cast v4, La/jiy;

    .line 38
    .line 39
    invoke-virtual {v0, v4, v2}, La/vby;->d(La/jiy;Ljava/lang/Object;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    invoke-static {p0, v2}, La/sj3;->j0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    invoke-virtual {v3}, La/rmi0;->serializer()La/jiy;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    check-cast v2, La/jiy;

    .line 52
    .line 53
    invoke-virtual {v0, v2, p0}, La/vby;->b(La/jiy;Ljava/lang/String;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    check-cast p0, La/smi0;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :catch_0
    new-instance p0, La/smi0;

    .line 61
    .line 62
    sget-object v0, La/umi0;->b:La/umi0;

    .line 63
    .line 64
    invoke-direct {p0, v0, v1}, La/smi0;-><init>(La/umi0;Z)V

    .line 65
    .line 66
    .line 67
    :goto_0
    invoke-static {p0}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    return-object p0

    .line 72
    :pswitch_0
    iget-object p0, p0, La/lmi0;->b:La/vwb0;

    .line 73
    .line 74
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    invoke-virtual {p0}, La/vwb0;->b()Landroid/content/SharedPreferences;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    const-string v0, "SAVED_TIMER_VALUE_KEY"

    .line 82
    .line 83
    const-wide/16 v1, 0x0

    .line 84
    .line 85
    invoke-interface {p0, v0, v1, v2}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    .line 86
    .line 87
    .line 88
    move-result-wide v0

    .line 89
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    invoke-static {p0}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    return-object p0

    .line 98
    nop

    .line 99
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
