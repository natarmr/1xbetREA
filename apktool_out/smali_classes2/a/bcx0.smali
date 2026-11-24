.class public final La/bcx0;
.super La/jkw0;
.source "SourceFile"


# static fields
.field private static final zzc:La/bcx0;

.field private static volatile zzd:La/alw0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La/alw0;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, La/bcx0;

    .line 2
    .line 3
    invoke-direct {v0}, La/jkw0;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/bcx0;->zzc:La/bcx0;

    .line 7
    .line 8
    const-class v1, La/bcx0;

    .line 9
    .line 10
    invoke-static {v1, v0}, La/jkw0;->l(Ljava/lang/Class;La/jkw0;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public static t(La/sjw0;La/dkw0;)V
    .locals 1

    .line 1
    sget-object v0, La/bcx0;->zzc:La/bcx0;

    .line 2
    .line 3
    invoke-static {v0, p0, p1}, La/jkw0;->e(La/jkw0;La/sjw0;La/dkw0;)La/jkw0;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/bcx0;

    .line 8
    .line 9
    return-void
.end method

.method public static u()La/bcx0;
    .locals 1

    .line 1
    sget-object v0, La/bcx0;->zzc:La/bcx0;

    .line 2
    .line 3
    return-object v0
.end method


# virtual methods
.method public final h(I)Ljava/lang/Object;
    .locals 2

    .line 1
    sget-object p0, La/zbx0;->a:[I

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    sub-int/2addr p1, v0

    .line 5
    aget p0, p0, p1

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    packed-switch p0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    throw p1

    .line 12
    :pswitch_0
    invoke-static {v0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0

    .line 17
    :pswitch_1
    sget-object p0, La/bcx0;->zzd:La/alw0;

    .line 18
    .line 19
    if-nez p0, :cond_1

    .line 20
    .line 21
    const-class p1, La/bcx0;

    .line 22
    .line 23
    monitor-enter p1

    .line 24
    :try_start_0
    sget-object p0, La/bcx0;->zzd:La/alw0;

    .line 25
    .line 26
    if-nez p0, :cond_0

    .line 27
    .line 28
    new-instance p0, La/ikw0;

    .line 29
    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    .line 32
    .line 33
    sput-object p0, La/bcx0;->zzd:La/alw0;

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :catchall_0
    move-exception p0

    .line 37
    goto :goto_1

    .line 38
    :cond_0
    :goto_0
    monitor-exit p1

    .line 39
    return-object p0

    .line 40
    :goto_1
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 41
    throw p0

    .line 42
    :cond_1
    return-object p0

    .line 43
    :pswitch_2
    sget-object p0, La/bcx0;->zzc:La/bcx0;

    .line 44
    .line 45
    return-object p0

    .line 46
    :pswitch_3
    const-string p0, "\u0000\u0000"

    .line 47
    .line 48
    sget-object v0, La/bcx0;->zzc:La/bcx0;

    .line 49
    .line 50
    new-instance v1, La/elw0;

    .line 51
    .line 52
    invoke-direct {v1, v0, p0, p1}, La/elw0;-><init>(La/ojw0;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    return-object v1

    .line 56
    :pswitch_4
    new-instance p0, La/acx0;

    .line 57
    .line 58
    sget-object p1, La/bcx0;->zzc:La/bcx0;

    .line 59
    .line 60
    invoke-direct {p0, p1}, La/hkw0;-><init>(La/jkw0;)V

    .line 61
    .line 62
    .line 63
    return-object p0

    .line 64
    :pswitch_5
    new-instance p0, La/bcx0;

    .line 65
    .line 66
    invoke-direct {p0}, La/jkw0;-><init>()V

    .line 67
    .line 68
    .line 69
    return-object p0

    .line 70
    nop

    .line 71
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
