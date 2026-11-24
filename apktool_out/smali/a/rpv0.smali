.class public final synthetic La/rpv0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:J

.field public final synthetic c:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(JLjava/lang/String;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/rpv0;->a:B

    iput-wide p1, p0, La/rpv0;->b:J

    iput-object p3, p0, La/rpv0;->c:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-byte v0, p0, La/rpv0;->a:B

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x1

    .line 5
    iget-object v3, p0, La/rpv0;->c:Ljava/lang/String;

    .line 6
    .line 7
    iget-wide v4, p0, La/rpv0;->b:J

    .line 8
    .line 9
    check-cast p1, La/qpg0;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    const-string p0, "UPDATE workspec SET schedule_requested_at=? WHERE id=?"

    .line 18
    .line 19
    invoke-interface {p1, p0}, La/qpg0;->Z0(Ljava/lang/String;)La/xpg0;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    :try_start_0
    invoke-interface {p0, v2, v4, v5}, La/xpg0;->o(IJ)V

    .line 24
    .line 25
    .line 26
    invoke-interface {p0, v1, v3}, La/xpg0;->z(ILjava/lang/String;)V

    .line 27
    .line 28
    .line 29
    invoke-interface {p0}, La/xpg0;->W0()Z

    .line 30
    .line 31
    .line 32
    invoke-static {p1}, La/s0x;->R(La/qpg0;)I

    .line 33
    .line 34
    .line 35
    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 36
    invoke-interface {p0}, Ljava/lang/AutoCloseable;->close()V

    .line 37
    .line 38
    .line 39
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    return-object p0

    .line 44
    :catchall_0
    move-exception p1

    .line 45
    invoke-interface {p0}, Ljava/lang/AutoCloseable;->close()V

    .line 46
    .line 47
    .line 48
    throw p1

    .line 49
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    const-string p0, "UPDATE workspec SET last_enqueue_time=? WHERE id=?"

    .line 53
    .line 54
    invoke-interface {p1, p0}, La/qpg0;->Z0(Ljava/lang/String;)La/xpg0;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    :try_start_1
    invoke-interface {p0, v2, v4, v5}, La/xpg0;->o(IJ)V

    .line 59
    .line 60
    .line 61
    invoke-interface {p0, v1, v3}, La/xpg0;->z(ILjava/lang/String;)V

    .line 62
    .line 63
    .line 64
    invoke-interface {p0}, La/xpg0;->W0()Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 65
    .line 66
    .line 67
    invoke-interface {p0}, Ljava/lang/AutoCloseable;->close()V

    .line 68
    .line 69
    .line 70
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 71
    .line 72
    return-object p0

    .line 73
    :catchall_1
    move-exception p1

    .line 74
    invoke-interface {p0}, Ljava/lang/AutoCloseable;->close()V

    .line 75
    .line 76
    .line 77
    throw p1

    .line 78
    nop

    .line 79
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
