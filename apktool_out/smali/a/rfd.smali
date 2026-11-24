.class public final synthetic La/rfd;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/agd;


# direct methods
.method public synthetic constructor <init>(La/agd;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/rfd;->a:B

    iput-object p1, p0, La/rfd;->b:La/agd;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, La/rfd;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, La/rfd;->b:La/agd;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    new-instance v0, La/jg60;

    .line 10
    .line 11
    new-instance v2, La/qfd;

    .line 12
    .line 13
    invoke-direct {v2, p0, v1}, La/qfd;-><init>(La/agd;B)V

    .line 14
    .line 15
    .line 16
    invoke-direct {v0, v2}, La/jg60;-><init>(Ljava/lang/Runnable;)V

    .line 17
    .line 18
    .line 19
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 20
    .line 21
    const/16 v3, 0x21

    .line 22
    .line 23
    if-lt v2, v3, :cond_1

    .line 24
    .line 25
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    if-nez v2, :cond_0

    .line 38
    .line 39
    new-instance v1, Landroid/os/Handler;

    .line 40
    .line 41
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 46
    .line 47
    .line 48
    new-instance v2, La/fy2;

    .line 49
    .line 50
    const/16 v3, 0x1b

    .line 51
    .line 52
    invoke-direct {v2, p0, v0, v3}, La/fy2;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_0
    iget-object v2, p0, La/zfd;->a:La/glz;

    .line 60
    .line 61
    new-instance v3, La/sfd;

    .line 62
    .line 63
    invoke-direct {v3, v0, p0, v1}, La/sfd;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v2, v3}, La/glz;->a(La/blz;)V

    .line 67
    .line 68
    .line 69
    :cond_1
    :goto_0
    return-object v0

    .line 70
    :pswitch_0
    new-instance v0, La/r0h0;

    .line 71
    .line 72
    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    if-eqz v2, :cond_2

    .line 81
    .line 82
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    invoke-virtual {v2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    goto :goto_1

    .line 91
    :cond_2
    const/4 v2, 0x0

    .line 92
    :goto_1
    invoke-direct {v0, v1, p0, v2}, La/r0h0;-><init>(Landroid/app/Application;La/i0h0;Landroid/os/Bundle;)V

    .line 93
    .line 94
    .line 95
    return-object v0

    .line 96
    :pswitch_1
    new-instance v0, La/cnk;

    .line 97
    .line 98
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 99
    .line 100
    .line 101
    invoke-virtual {p0}, La/agd;->b()La/ye50;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    invoke-virtual {p0, v0}, La/ye50;->b(La/ef50;)V

    .line 106
    .line 107
    .line 108
    return-object v0

    .line 109
    :pswitch_2
    new-instance v0, La/zcr;

    .line 110
    .line 111
    iget-object v2, p0, La/agd;->f:La/xfd;

    .line 112
    .line 113
    new-instance v3, La/rfd;

    .line 114
    .line 115
    invoke-direct {v3, p0, v1}, La/rfd;-><init>(La/agd;B)V

    .line 116
    .line 117
    .line 118
    invoke-direct {v0, v2, v3}, La/zcr;-><init>(Ljava/util/concurrent/Executor;La/rfd;)V

    .line 119
    .line 120
    .line 121
    return-object v0

    .line 122
    :pswitch_3
    invoke-virtual {p0}, La/agd;->reportFullyDrawn()V

    .line 123
    .line 124
    .line 125
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 126
    .line 127
    return-object p0

    .line 128
    nop

    .line 129
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
