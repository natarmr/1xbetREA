.class public final synthetic La/j3j0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/cp;

.field public final synthetic c:La/w5j0;


# direct methods
.method public synthetic constructor <init>(La/cp;La/w5j0;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/j3j0;->a:B

    iput-object p1, p0, La/j3j0;->b:La/cp;

    iput-object p2, p0, La/j3j0;->c:La/w5j0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 9

    .line 1
    iget-byte v0, p0, La/j3j0;->a:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget-object v2, p0, La/j3j0;->c:La/w5j0;

    .line 5
    .line 6
    iget-object p0, p0, La/j3j0;->b:La/cp;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    sget-object p1, La/ymx;->d:La/ymx;

    .line 15
    .line 16
    new-instance v0, La/rd7;

    .line 17
    .line 18
    const/16 v3, 0x12

    .line 19
    .line 20
    invoke-direct {v0, v2, p2, v3}, La/rd7;-><init>(Ljava/lang/Object;ZB)V

    .line 21
    .line 22
    .line 23
    invoke-static {p1, v0}, La/dyb;->P(La/ymx;Lkotlin/jvm/functions/Function0;)Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    if-nez p1, :cond_0

    .line 28
    .line 29
    iget-object p0, p0, La/cp;->u:La/yfu0;

    .line 30
    .line 31
    check-cast p0, La/g4j0;

    .line 32
    .line 33
    iget-object p0, p0, La/g4j0;->f:La/dc3;

    .line 34
    .line 35
    iget-object p0, p0, La/dc3;->e:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast p0, Lorg/xplatform/uikit/components/cells/right/DsCellRightSwitch;

    .line 38
    .line 39
    xor-int/lit8 p1, p2, 0x1

    .line 40
    .line 41
    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/SwitchCompat;->setChecked(Z)V

    .line 42
    .line 43
    .line 44
    :cond_0
    return-void

    .line 45
    :pswitch_0
    sget-object p1, La/ymx;->b:La/ymx;

    .line 46
    .line 47
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 48
    .line 49
    .line 50
    move-result-wide v3

    .line 51
    sget-wide v5, La/ivb0;->c:J

    .line 52
    .line 53
    sub-long/2addr v3, v5

    .line 54
    const/16 p1, 0x190

    .line 55
    .line 56
    int-to-long v5, p1

    .line 57
    cmp-long p1, v3, v5

    .line 58
    .line 59
    if-lez p1, :cond_1

    .line 60
    .line 61
    invoke-static {v2}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    sget-object v4, La/u5j0;->a:La/u5j0;

    .line 66
    .line 67
    new-instance v7, La/a220;

    .line 68
    .line 69
    const/16 p1, 0x18

    .line 70
    .line 71
    const/4 v0, 0x0

    .line 72
    invoke-direct {v7, v2, p2, v0, p1}, La/a220;-><init>(Ljava/lang/Object;ZLa/yje;B)V

    .line 73
    .line 74
    .line 75
    const/16 v8, 0xe

    .line 76
    .line 77
    const/4 v5, 0x0

    .line 78
    const/4 v6, 0x0

    .line 79
    invoke-static/range {v3 .. v8}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 80
    .line 81
    .line 82
    invoke-static {}, La/dyb;->u0()V

    .line 83
    .line 84
    .line 85
    move p1, v1

    .line 86
    goto :goto_0

    .line 87
    :cond_1
    const/4 p1, 0x0

    .line 88
    :goto_0
    if-nez p1, :cond_2

    .line 89
    .line 90
    iget-object p0, p0, La/cp;->u:La/yfu0;

    .line 91
    .line 92
    check-cast p0, La/b3j0;

    .line 93
    .line 94
    iget-object p0, p0, La/b3j0;->c:La/dc3;

    .line 95
    .line 96
    iget-object p0, p0, La/dc3;->e:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast p0, Lorg/xplatform/uikit/components/cells/right/DsCellRightSwitch;

    .line 99
    .line 100
    xor-int/lit8 p1, p2, 0x1

    .line 101
    .line 102
    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/SwitchCompat;->setChecked(Z)V

    .line 103
    .line 104
    .line 105
    :cond_2
    return-void

    .line 106
    nop

    .line 107
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
