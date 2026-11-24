.class public final La/q4x0;
.super La/bmw0;
.source "SourceFile"


# instance fields
.field public final synthetic e:B

.field public final synthetic f:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;La/syw0;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/q4x0;->e:B

    iput-object p1, p0, La/q4x0;->f:Ljava/lang/Object;

    invoke-direct {p0, p2}, La/bmw0;-><init>(La/syw0;)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    .line 1
    iget-byte v0, p0, La/q4x0;->e:B

    .line 2
    .line 3
    iget-object p0, p0, La/q4x0;->f:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, La/m6x0;

    .line 9
    .line 10
    invoke-virtual {p0}, La/m6x0;->J()La/fxw0;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, La/fxw0;->m1()V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, La/m6x0;->q:Ljava/util/LinkedList;

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/util/LinkedList;->pollFirst()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    check-cast v0, Ljava/lang/String;

    .line 24
    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    invoke-virtual {p0}, La/m6x0;->S()La/lwf;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 35
    .line 36
    .line 37
    move-result-wide v1

    .line 38
    iput-wide v1, p0, La/m6x0;->j1:J

    .line 39
    .line 40
    invoke-virtual {p0}, La/m6x0;->r()La/uuw0;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    iget-object v1, v1, La/uuw0;->o:La/quw0;

    .line 45
    .line 46
    const-string v2, "Sending trigger URI notification to app"

    .line 47
    .line 48
    invoke-virtual {v1, v0, v2}, La/quw0;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    new-instance v1, Landroid/content/Intent;

    .line 52
    .line 53
    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    .line 54
    .line 55
    .line 56
    const-string v2, "com.google.android.gms.measurement.TRIGGERS_AVAILABLE"

    .line 57
    .line 58
    invoke-virtual {v1, v2}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v1, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 62
    .line 63
    .line 64
    iget-object v0, p0, La/m6x0;->l:La/kxw0;

    .line 65
    .line 66
    iget-object v0, v0, La/kxw0;->a:Landroid/content/Context;

    .line 67
    .line 68
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 69
    .line 70
    const/16 v3, 0x22

    .line 71
    .line 72
    if-ge v2, v3, :cond_0

    .line 73
    .line 74
    invoke-virtual {v0, v1}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V

    .line 75
    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_0
    invoke-static {}, La/mmv;->d()Landroid/app/BroadcastOptions;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    invoke-static {v2}, La/mmv;->e(Landroid/app/BroadcastOptions;)Landroid/app/BroadcastOptions;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    invoke-static {v2}, La/big0;->b(Landroid/app/BroadcastOptions;)Landroid/os/Bundle;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    invoke-static {v0, v2, v1}, La/big0;->e(Landroid/content/Context;Landroid/os/Bundle;Landroid/content/Intent;)V

    .line 91
    .line 92
    .line 93
    :cond_1
    :goto_0
    invoke-virtual {p0}, La/m6x0;->E()V

    .line 94
    .line 95
    .line 96
    return-void

    .line 97
    :pswitch_0
    check-cast p0, La/i5x0;

    .line 98
    .line 99
    invoke-virtual {p0}, La/i5x0;->q1()V

    .line 100
    .line 101
    .line 102
    iget-object v0, p0, La/p4;->b:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast v0, La/kxw0;

    .line 105
    .line 106
    iget-object v0, v0, La/kxw0;->f:La/uuw0;

    .line 107
    .line 108
    invoke-static {v0}, La/kxw0;->g(La/ryw0;)V

    .line 109
    .line 110
    .line 111
    iget-object v0, v0, La/uuw0;->o:La/quw0;

    .line 112
    .line 113
    const-string v1, "Starting upload from DelayedRunnable"

    .line 114
    .line 115
    invoke-virtual {v0, v1}, La/quw0;->a(Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    iget-object p0, p0, La/k5x0;->c:La/m6x0;

    .line 119
    .line 120
    invoke-virtual {p0}, La/m6x0;->l()V

    .line 121
    .line 122
    .line 123
    return-void

    .line 124
    :pswitch_1
    check-cast p0, La/dr8;

    .line 125
    .line 126
    iget-object v0, p0, La/dr8;->d:Ljava/lang/Object;

    .line 127
    .line 128
    check-cast v0, La/w4x0;

    .line 129
    .line 130
    invoke-virtual {v0}, La/zrw0;->m1()V

    .line 131
    .line 132
    .line 133
    iget-object v0, v0, La/p4;->b:Ljava/lang/Object;

    .line 134
    .line 135
    check-cast v0, La/kxw0;

    .line 136
    .line 137
    iget-object v1, v0, La/kxw0;->k:La/lwf;

    .line 138
    .line 139
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 140
    .line 141
    .line 142
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 143
    .line 144
    .line 145
    move-result-wide v1

    .line 146
    const/4 v3, 0x0

    .line 147
    invoke-virtual {p0, v1, v2, v3, v3}, La/dr8;->r(JZZ)Z

    .line 148
    .line 149
    .line 150
    iget-object p0, v0, La/kxw0;->n:La/dqw0;

    .line 151
    .line 152
    invoke-static {p0}, La/kxw0;->d(La/zrw0;)V

    .line 153
    .line 154
    .line 155
    iget-object v0, v0, La/kxw0;->k:La/lwf;

    .line 156
    .line 157
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 158
    .line 159
    .line 160
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 161
    .line 162
    .line 163
    move-result-wide v0

    .line 164
    invoke-virtual {p0, v0, v1}, La/dqw0;->p1(J)V

    .line 165
    .line 166
    .line 167
    return-void

    .line 168
    nop

    .line 169
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
