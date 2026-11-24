.class public final Lorg/xplatform/client1/features/appactivity/IntentForwardingActivity;
.super La/yc3;
.source "SourceFile"


# instance fields
.field public B:La/fiu0;

.field public final Y:La/kiu0;


# direct methods
.method public constructor <init>()V
    .locals 6

    .line 1
    invoke-direct {p0}, La/yc3;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, La/y2x;

    .line 5
    .line 6
    const/16 v1, 0x8

    .line 7
    .line 8
    invoke-direct {v0, p0, v1}, La/y2x;-><init>(Ljava/lang/Object;B)V

    .line 9
    .line 10
    .line 11
    new-instance v1, La/kiu0;

    .line 12
    .line 13
    const-class v2, La/dlx;

    .line 14
    .line 15
    sget-object v3, La/sre0;->a:La/tre0;

    .line 16
    .line 17
    invoke-virtual {v3, v2}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    new-instance v3, La/clx;

    .line 22
    .line 23
    const/4 v4, 0x0

    .line 24
    invoke-direct {v3, p0, v4}, La/clx;-><init>(Lorg/xplatform/client1/features/appactivity/IntentForwardingActivity;B)V

    .line 25
    .line 26
    .line 27
    new-instance v4, La/clx;

    .line 28
    .line 29
    const/4 v5, 0x1

    .line 30
    invoke-direct {v4, p0, v5}, La/clx;-><init>(Lorg/xplatform/client1/features/appactivity/IntentForwardingActivity;B)V

    .line 31
    .line 32
    .line 33
    invoke-direct {v1, v2, v3, v0, v4}, La/kiu0;-><init>(La/sgy;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V

    .line 34
    .line 35
    .line 36
    iput-object v1, p0, Lorg/xplatform/client1/features/appactivity/IntentForwardingActivity;->Y:La/kiu0;

    .line 37
    .line 38
    return-void
.end method


# virtual methods
.method public final onCreate(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    invoke-super {p0, p1}, La/kxq;->onCreate(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    instance-of v0, p1, La/af3;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    check-cast p1, La/af3;

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move-object p1, v1

    .line 20
    :goto_0
    const-class v0, La/yr3;

    .line 21
    .line 22
    if-eqz p1, :cond_6

    .line 23
    .line 24
    invoke-interface {p1}, La/af3;->d()La/wcf0;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-virtual {p1, v0}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    check-cast p1, La/o5d0;

    .line 33
    .line 34
    if-eqz p1, :cond_1

    .line 35
    .line 36
    invoke-interface {p1}, La/o5d0;->get()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    check-cast p1, La/ze3;

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_1
    move-object p1, v1

    .line 44
    :goto_1
    instance-of v2, p1, La/yr3;

    .line 45
    .line 46
    if-nez v2, :cond_2

    .line 47
    .line 48
    move-object p1, v1

    .line 49
    :cond_2
    check-cast p1, La/yr3;

    .line 50
    .line 51
    if-eqz p1, :cond_6

    .line 52
    .line 53
    sget-object v0, La/p1w0;->h:La/p1w0;

    .line 54
    .line 55
    invoke-virtual {p1, v0}, La/yr3;->a(La/i1w0;)La/s8i;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    iget-object p1, p1, La/s8i;->M0:La/r5i;

    .line 60
    .line 61
    invoke-virtual {p1}, La/r5i;->get()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    check-cast p1, La/fiu0;

    .line 66
    .line 67
    iput-object p1, p0, Lorg/xplatform/client1/features/appactivity/IntentForwardingActivity;->B:La/fiu0;

    .line 68
    .line 69
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    invoke-static {p0, p1}, La/j120;->f0(La/yc3;Landroid/content/Intent;)Z

    .line 77
    .line 78
    .line 79
    move-result p1

    .line 80
    if-eqz p1, :cond_3

    .line 81
    .line 82
    return-void

    .line 83
    :cond_3
    iget-object p1, p0, Lorg/xplatform/client1/features/appactivity/IntentForwardingActivity;->Y:La/kiu0;

    .line 84
    .line 85
    invoke-virtual {p1}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    check-cast p1, La/dlx;

    .line 90
    .line 91
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    if-nez v0, :cond_4

    .line 96
    .line 97
    goto :goto_2

    .line 98
    :cond_4
    iget-object v2, p1, La/dlx;->b:La/rqt;

    .line 99
    .line 100
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    iget-object p1, p1, La/dlx;->c:La/jlx;

    .line 104
    .line 105
    invoke-virtual {p1, v0}, La/jlx;->a(Landroid/content/Intent;)V

    .line 106
    .line 107
    .line 108
    :goto_2
    invoke-static {p0}, La/j120;->Q(Landroid/content/Context;)Landroid/content/Intent;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    if-eqz p1, :cond_5

    .line 113
    .line 114
    const/high16 v0, 0x4000000

    .line 115
    .line 116
    invoke-virtual {p1, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    if-eqz p1, :cond_5

    .line 121
    .line 122
    const-string v0, "CUSTOM_INTENT"

    .line 123
    .line 124
    invoke-virtual {p1, v0}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    :cond_5
    invoke-virtual {p0, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 132
    .line 133
    .line 134
    return-void

    .line 135
    :cond_6
    const-string p0, "Cannot create dependency "

    .line 136
    .line 137
    invoke-static {v0, p0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object p0

    .line 141
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    return-void
.end method

.method public final onNewIntent(Landroid/content/Intent;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-super {p0, p1}, La/agd;->onNewIntent(Landroid/content/Intent;)V

    .line 5
    .line 6
    .line 7
    invoke-static {p0, p1}, La/j120;->f0(La/yc3;Landroid/content/Intent;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    iget-object v0, p0, Lorg/xplatform/client1/features/appactivity/IntentForwardingActivity;->Y:La/kiu0;

    .line 15
    .line 16
    invoke-virtual {v0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, La/dlx;

    .line 21
    .line 22
    iget-object v0, v0, La/dlx;->c:La/jlx;

    .line 23
    .line 24
    invoke-virtual {v0, p1}, La/jlx;->a(Landroid/content/Intent;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 28
    .line 29
    .line 30
    return-void
.end method
