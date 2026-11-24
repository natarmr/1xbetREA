.class public final La/s6k0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/javax/sip/SipListener;


# instance fields
.field public final a:Ljava/util/concurrent/atomic/AtomicReference;

.field public final b:La/r6k0;

.field public final c:La/jt2;

.field public final d:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final e:La/bg0;


# direct methods
.method public constructor <init>(Ljava/util/concurrent/atomic/AtomicReference;La/r6k0;La/jt2;Ljava/util/concurrent/atomic/AtomicBoolean;La/bg0;)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, La/s6k0;->a:Ljava/util/concurrent/atomic/AtomicReference;

    .line 11
    .line 12
    iput-object p2, p0, La/s6k0;->b:La/r6k0;

    .line 13
    .line 14
    iput-object p3, p0, La/s6k0;->c:La/jt2;

    .line 15
    .line 16
    iput-object p4, p0, La/s6k0;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 17
    .line 18
    iput-object p5, p0, La/s6k0;->e:La/bg0;

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final a(La/a7k0;)V
    .locals 0

    .line 1
    iget-object p0, p0, La/s6k0;->a:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/mz40;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    invoke-interface {p0, p1}, La/mz40;->g(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public final processDialogTerminated(Landroid/javax/sip/DialogTerminatedEvent;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method

.method public final processIOException(Landroid/javax/sip/IOExceptionEvent;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, La/s6k0;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    invoke-virtual {p1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 8
    .line 9
    .line 10
    new-instance p1, La/y6k0;

    .line 11
    .line 12
    invoke-direct {p1, v0}, La/y6k0;-><init>(Z)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, p1}, La/s6k0;->a(La/a7k0;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final processRequest(Landroid/javax/sip/RequestEvent;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method

.method public final processResponse(Landroid/javax/sip/ResponseEvent;)V
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/javax/sip/ResponseEvent;->getResponse()Landroid/javax/sip/message/Response;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    invoke-interface {p1}, Landroid/javax/sip/message/Response;->getStatusCode()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    invoke-interface {p1}, Landroid/javax/sip/message/Response;->getReasonPhrase()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    const-string v2, "Via"

    .line 20
    .line 21
    invoke-interface {p1, v2}, Landroid/javax/sip/message/Message;->getHeader(Ljava/lang/String;)Landroid/javax/sip/header/Header;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    instance-of v3, v2, Landroid/javax/sip/header/ViaHeader;

    .line 26
    .line 27
    if-eqz v3, :cond_0

    .line 28
    .line 29
    check-cast v2, Landroid/javax/sip/header/ViaHeader;

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    const/4 v2, 0x0

    .line 33
    :goto_0
    if-nez v2, :cond_1

    .line 34
    .line 35
    return-void

    .line 36
    :cond_1
    const-string v3, "received"

    .line 37
    .line 38
    invoke-interface {v2, v3}, Landroid/javax/sip/header/Parameters;->getParameter(Ljava/lang/String;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    invoke-interface {v2}, Landroid/javax/sip/header/ViaHeader;->getRPort()I

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    iget-object v4, p0, La/s6k0;->b:La/r6k0;

    .line 47
    .line 48
    if-eqz v3, :cond_3

    .line 49
    .line 50
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 51
    .line 52
    .line 53
    move-result v5

    .line 54
    if-nez v5, :cond_2

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_2
    iget-object v5, v4, La/r6k0;->f:Ljava/util/concurrent/atomic/AtomicReference;

    .line 58
    .line 59
    invoke-virtual {v5, v3}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    :cond_3
    :goto_1
    if-lez v2, :cond_4

    .line 66
    .line 67
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    iget-object v3, v4, La/r6k0;->g:Ljava/util/concurrent/atomic/AtomicReference;

    .line 72
    .line 73
    invoke-virtual {v3, v2}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    :cond_4
    new-instance v2, Ljava/lang/StringBuilder;

    .line 77
    .line 78
    const-string v3, "statusCode "

    .line 79
    .line 80
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    const-string v3, " reasonPhrase "

    .line 87
    .line 88
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    iget-object v2, p0, La/s6k0;->c:La/jt2;

    .line 99
    .line 100
    iget-object v2, v2, La/jt2;->a:La/n6k0;

    .line 101
    .line 102
    const-string v3, "registerResponse"

    .line 103
    .line 104
    invoke-virtual {v2, v3, v1}, La/n6k0;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    const/16 v1, 0xc8

    .line 108
    .line 109
    iget-object v2, p0, La/s6k0;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 110
    .line 111
    const/4 v3, 0x0

    .line 112
    if-eq v0, v1, :cond_9

    .line 113
    .line 114
    const/16 v1, 0x191

    .line 115
    .line 116
    const/4 v4, 0x1

    .line 117
    if-eq v0, v1, :cond_7

    .line 118
    .line 119
    const/16 v1, 0x1e6

    .line 120
    .line 121
    if-eq v0, v1, :cond_6

    .line 122
    .line 123
    const/16 v1, 0x1f7

    .line 124
    .line 125
    if-eq v0, v1, :cond_6

    .line 126
    .line 127
    const/16 v1, 0x197

    .line 128
    .line 129
    if-eq v0, v1, :cond_7

    .line 130
    .line 131
    const/16 p1, 0x198

    .line 132
    .line 133
    if-eq v0, p1, :cond_5

    .line 134
    .line 135
    invoke-virtual {v2, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 136
    .line 137
    .line 138
    new-instance p1, La/y6k0;

    .line 139
    .line 140
    invoke-direct {p1, v3}, La/y6k0;-><init>(Z)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {p0, p1}, La/s6k0;->a(La/a7k0;)V

    .line 144
    .line 145
    .line 146
    return-void

    .line 147
    :cond_5
    invoke-virtual {v2, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 148
    .line 149
    .line 150
    new-instance p1, La/y6k0;

    .line 151
    .line 152
    invoke-direct {p1, v4}, La/y6k0;-><init>(Z)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {p0, p1}, La/s6k0;->a(La/a7k0;)V

    .line 156
    .line 157
    .line 158
    return-void

    .line 159
    :cond_6
    invoke-virtual {v2, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 160
    .line 161
    .line 162
    new-instance p1, La/y6k0;

    .line 163
    .line 164
    invoke-direct {p1, v3}, La/y6k0;-><init>(Z)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {p0, p1}, La/s6k0;->a(La/a7k0;)V

    .line 168
    .line 169
    .line 170
    return-void

    .line 171
    :cond_7
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 172
    .line 173
    .line 174
    move-result v0

    .line 175
    if-eqz v0, :cond_8

    .line 176
    .line 177
    invoke-virtual {v2, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 178
    .line 179
    .line 180
    new-instance p1, La/y6k0;

    .line 181
    .line 182
    invoke-direct {p1, v3}, La/y6k0;-><init>(Z)V

    .line 183
    .line 184
    .line 185
    invoke-virtual {p0, p1}, La/s6k0;->a(La/a7k0;)V

    .line 186
    .line 187
    .line 188
    return-void

    .line 189
    :cond_8
    invoke-virtual {v2, v4}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 190
    .line 191
    .line 192
    iget-object p0, p0, La/s6k0;->e:La/bg0;

    .line 193
    .line 194
    invoke-virtual {p0, p1}, La/bg0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    return-void

    .line 198
    :cond_9
    invoke-virtual {v2, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 199
    .line 200
    .line 201
    sget-object p1, La/z6k0;->a:La/z6k0;

    .line 202
    .line 203
    invoke-virtual {p0, p1}, La/s6k0;->a(La/a7k0;)V

    .line 204
    .line 205
    .line 206
    return-void
.end method

.method public final processTimeout(Landroid/javax/sip/TimeoutEvent;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, La/s6k0;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    invoke-virtual {p1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 8
    .line 9
    .line 10
    new-instance p1, La/y6k0;

    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    invoke-direct {p1, v0}, La/y6k0;-><init>(Z)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, p1}, La/s6k0;->a(La/a7k0;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final processTransactionTerminated(Landroid/javax/sip/TransactionTerminatedEvent;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method
