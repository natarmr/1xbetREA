.class public final La/qq30;
.super La/guy;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/zpu;


# direct methods
.method public synthetic constructor <init>(La/zpu;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/qq30;->a:B

    iput-object p1, p0, La/qq30;->b:La/zpu;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, La/guy;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/qq30;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/qq30;->b:La/zpu;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, Landroid/app/ActivityManager$MemoryInfo;

    .line 9
    .line 10
    invoke-direct {v0}, Landroid/app/ActivityManager$MemoryInfo;-><init>()V

    .line 11
    .line 12
    .line 13
    iget-object p0, p0, La/zpu;->b:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p0, Landroid/app/ActivityManager;

    .line 16
    .line 17
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, v0}, Landroid/app/ActivityManager;->getMemoryInfo(Landroid/app/ActivityManager$MemoryInfo;)V

    .line 21
    .line 22
    .line 23
    iget-wide v0, v0, Landroid/app/ActivityManager$MemoryInfo;->totalMem:J

    .line 24
    .line 25
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    return-object p0

    .line 30
    :pswitch_0
    iget-object p0, p0, La/zpu;->c:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast p0, Landroid/os/StatFs;

    .line 33
    .line 34
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, Landroid/os/StatFs;->getTotalBytes()J

    .line 38
    .line 39
    .line 40
    move-result-wide v0

    .line 41
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    return-object p0

    .line 46
    nop

    .line 47
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
