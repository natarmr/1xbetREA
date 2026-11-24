.class public final La/m6k0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/javax/sip/SipListener;


# instance fields
.field public final a:Landroid/javax/sip/SipProvider;

.field public final b:La/r6k0;

.field public final c:La/g090;

.field public final d:La/jt2;

.field public final e:Ljava/util/concurrent/atomic/AtomicReference;

.field public final f:Ljava/util/concurrent/atomic/AtomicReference;

.field public final g:La/sd60;


# direct methods
.method public constructor <init>(La/jt2;La/g090;La/r6k0;Landroid/javax/sip/SipProvider;Ljava/lang/String;Ljava/util/concurrent/atomic/AtomicReference;Ljava/util/concurrent/atomic/AtomicReference;)V
    .locals 8

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p4, p0, La/m6k0;->a:Landroid/javax/sip/SipProvider;

    .line 14
    .line 15
    iput-object p3, p0, La/m6k0;->b:La/r6k0;

    .line 16
    .line 17
    iput-object p2, p0, La/m6k0;->c:La/g090;

    .line 18
    .line 19
    iput-object p1, p0, La/m6k0;->d:La/jt2;

    .line 20
    .line 21
    iput-object p6, p0, La/m6k0;->e:Ljava/util/concurrent/atomic/AtomicReference;

    .line 22
    .line 23
    iput-object p7, p0, La/m6k0;->f:Ljava/util/concurrent/atomic/AtomicReference;

    .line 24
    .line 25
    new-instance v0, La/sd60;

    .line 26
    .line 27
    move-object v1, p1

    .line 28
    move-object v2, p2

    .line 29
    move-object v3, p3

    .line 30
    move-object v4, p4

    .line 31
    move-object v5, p5

    .line 32
    move-object v6, p6

    .line 33
    move-object v7, p7

    .line 34
    invoke-direct/range {v0 .. v7}, La/sd60;-><init>(La/jt2;La/g090;La/r6k0;Landroid/javax/sip/SipProvider;Ljava/lang/String;Ljava/util/concurrent/atomic/AtomicReference;Ljava/util/concurrent/atomic/AtomicReference;)V

    .line 35
    .line 36
    .line 37
    iput-object v0, p0, La/m6k0;->g:La/sd60;

    .line 38
    .line 39
    return-void
.end method

.method public static c(Landroid/javax/sip/ResponseEvent;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroid/javax/sip/ResponseEvent;->getResponse()Landroid/javax/sip/message/Response;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/javax/sip/ResponseEvent;->getDialog()Landroid/javax/sip/Dialog;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    const/4 v2, 0x0

    .line 13
    if-nez v1, :cond_1

    .line 14
    .line 15
    invoke-virtual {p0}, Landroid/javax/sip/ResponseEvent;->getClientTransaction()Landroid/javax/sip/ClientTransaction;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    if-eqz p0, :cond_0

    .line 20
    .line 21
    invoke-interface {p0}, Landroid/javax/sip/Transaction;->getDialog()Landroid/javax/sip/Dialog;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    move-object v1, p0

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    move-object v1, v2

    .line 28
    :goto_0
    if-nez v1, :cond_1

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_1
    const-string p0, "CSeq"

    .line 32
    .line 33
    invoke-interface {v0, p0}, Landroid/javax/sip/message/Message;->getHeader(Ljava/lang/String;)Landroid/javax/sip/header/Header;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    instance-of v0, p0, Landroid/javax/sip/header/CSeqHeader;

    .line 38
    .line 39
    if-eqz v0, :cond_2

    .line 40
    .line 41
    move-object v2, p0

    .line 42
    check-cast v2, Landroid/javax/sip/header/CSeqHeader;

    .line 43
    .line 44
    :cond_2
    if-nez v2, :cond_3

    .line 45
    .line 46
    :goto_1
    return-void

    .line 47
    :cond_3
    invoke-interface {v2}, Landroid/javax/sip/header/CSeqHeader;->getSeqNumber()J

    .line 48
    .line 49
    .line 50
    move-result-wide v2

    .line 51
    invoke-interface {v1, v2, v3}, Landroid/javax/sip/Dialog;->createAck(J)Landroid/javax/sip/message/Request;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    invoke-interface {v1, p0}, Landroid/javax/sip/Dialog;->sendAck(Landroid/javax/sip/message/Request;)V

    .line 59
    .line 60
    .line 61
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .line 1
    iget-object v0, p0, La/m6k0;->e:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, La/y5k0;

    .line 8
    .line 9
    iget-object v1, v1, La/y5k0;->c:Landroid/javax/sip/SipListener;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    :try_start_0
    iget-object p0, p0, La/m6k0;->a:Landroid/javax/sip/SipProvider;

    .line 14
    .line 15
    invoke-interface {p0, v1}, Landroid/javax/sip/SipProvider;->removeSipListener(Landroid/javax/sip/SipListener;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 16
    .line 17
    .line 18
    :catch_0
    new-instance p0, La/w5k0;

    .line 19
    .line 20
    const/16 v1, 0x9

    .line 21
    .line 22
    invoke-direct {p0, v1}, La/w5k0;-><init>(B)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReference;->getAndUpdate(Ljava/util/function/UnaryOperator;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    :cond_0
    return-void
.end method

.method public final b(La/x6k0;)V
    .locals 0

    .line 1
    iget-object p0, p0, La/m6k0;->f:Ljava/util/concurrent/atomic/AtomicReference;

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
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/javax/sip/DialogTerminatedEvent;->getDialog()Landroid/javax/sip/Dialog;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iget-object v0, p0, La/m6k0;->e:Ljava/util/concurrent/atomic/AtomicReference;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    check-cast v1, La/y5k0;

    .line 15
    .line 16
    iget-object v1, v1, La/y5k0;->a:Landroid/javax/sip/Dialog;

    .line 17
    .line 18
    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    if-nez p1, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    check-cast p1, La/y5k0;

    .line 30
    .line 31
    iget-boolean p1, p1, La/y5k0;->t:Z

    .line 32
    .line 33
    if-eqz p1, :cond_1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    invoke-static {v0}, La/m7x;->N(Ljava/util/concurrent/atomic/AtomicReference;)Z

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    if-nez p1, :cond_2

    .line 41
    .line 42
    :goto_0
    return-void

    .line 43
    :cond_2
    sget-object p1, La/u6k0;->a:La/u6k0;

    .line 44
    .line 45
    invoke-virtual {p0, p1}, La/m6k0;->b(La/x6k0;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0}, La/m6k0;->a()V

    .line 49
    .line 50
    .line 51
    new-instance p1, La/w5k0;

    .line 52
    .line 53
    const/4 v1, 0x4

    .line 54
    invoke-direct {p1, v1}, La/w5k0;-><init>(B)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->getAndUpdate(Ljava/util/function/UnaryOperator;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    iget-object p0, p0, La/m6k0;->f:Ljava/util/concurrent/atomic/AtomicReference;

    .line 61
    .line 62
    const/4 p1, 0x0

    .line 63
    invoke-virtual {p0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    return-void
.end method

.method public final processIOException(Landroid/javax/sip/IOExceptionEvent;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, La/m6k0;->e:Ljava/util/concurrent/atomic/AtomicReference;

    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    check-cast v0, La/y5k0;

    .line 11
    .line 12
    iget-boolean v0, v0, La/y5k0;->f:Z

    .line 13
    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    new-instance p1, La/w6k0;

    .line 17
    .line 18
    const-string v0, "IO error"

    .line 19
    .line 20
    invoke-direct {p1, v0}, La/w6k0;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, p1}, La/m6k0;->b(La/x6k0;)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    invoke-static {p1}, La/m7x;->u(Ljava/util/concurrent/atomic/AtomicReference;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public final processRequest(Landroid/javax/sip/RequestEvent;)V
    .locals 9

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/javax/sip/RequestEvent;->getRequest()Landroid/javax/sip/message/Request;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    invoke-interface {v0}, Landroid/javax/sip/message/Request;->getMethod()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    iget-object v2, p0, La/m6k0;->d:La/jt2;

    .line 23
    .line 24
    const/16 v3, 0xc8

    .line 25
    .line 26
    iget-object v4, p0, La/m6k0;->e:Ljava/util/concurrent/atomic/AtomicReference;

    .line 27
    .line 28
    iget-object v5, p0, La/m6k0;->b:La/r6k0;

    .line 29
    .line 30
    iget-object v6, p0, La/m6k0;->a:Landroid/javax/sip/SipProvider;

    .line 31
    .line 32
    sparse-switch v1, :sswitch_data_0

    .line 33
    .line 34
    .line 35
    goto/16 :goto_6

    .line 36
    .line 37
    :sswitch_0
    const-string v1, "BYE"

    .line 38
    .line 39
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-eqz v0, :cond_b

    .line 44
    .line 45
    invoke-static {v4}, La/m7x;->N(Ljava/util/concurrent/atomic/AtomicReference;)Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-nez v0, :cond_1

    .line 50
    .line 51
    :try_start_0
    invoke-virtual {p1}, Landroid/javax/sip/RequestEvent;->getServerTransaction()Landroid/javax/sip/ServerTransaction;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    if-nez p0, :cond_0

    .line 56
    .line 57
    invoke-virtual {p1}, Landroid/javax/sip/RequestEvent;->getRequest()Landroid/javax/sip/message/Request;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    invoke-interface {v6, p0}, Landroid/javax/sip/SipProvider;->getNewServerTransaction(Landroid/javax/sip/message/Request;)Landroid/javax/sip/ServerTransaction;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    :cond_0
    invoke-virtual {v5}, La/r6k0;->e()Landroid/javax/sip/message/MessageFactory;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-virtual {p1}, Landroid/javax/sip/RequestEvent;->getRequest()Landroid/javax/sip/message/Request;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    invoke-interface {v0, v3, p1}, Landroid/javax/sip/message/MessageFactory;->createResponse(ILandroid/javax/sip/message/Request;)Landroid/javax/sip/message/Response;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    invoke-interface {p0, p1}, Landroid/javax/sip/ServerTransaction;->sendResponse(Landroid/javax/sip/message/Response;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2

    .line 84
    .line 85
    .line 86
    return-void

    .line 87
    :cond_1
    iget-object v0, p0, La/m6k0;->f:Ljava/util/concurrent/atomic/AtomicReference;

    .line 88
    .line 89
    sget-object v1, La/u6k0;->a:La/u6k0;

    .line 90
    .line 91
    const/4 v7, 0x0

    .line 92
    :try_start_1
    invoke-virtual {p1}, Landroid/javax/sip/RequestEvent;->getServerTransaction()Landroid/javax/sip/ServerTransaction;

    .line 93
    .line 94
    .line 95
    move-result-object v8

    .line 96
    if-nez v8, :cond_2

    .line 97
    .line 98
    invoke-virtual {p1}, Landroid/javax/sip/RequestEvent;->getRequest()Landroid/javax/sip/message/Request;

    .line 99
    .line 100
    .line 101
    move-result-object v8

    .line 102
    invoke-interface {v6, v8}, Landroid/javax/sip/SipProvider;->getNewServerTransaction(Landroid/javax/sip/message/Request;)Landroid/javax/sip/ServerTransaction;

    .line 103
    .line 104
    .line 105
    move-result-object v8

    .line 106
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    goto :goto_0

    .line 110
    :catch_0
    move-exception p1

    .line 111
    goto :goto_1

    .line 112
    :cond_2
    :goto_0
    invoke-virtual {v5}, La/r6k0;->e()Landroid/javax/sip/message/MessageFactory;

    .line 113
    .line 114
    .line 115
    move-result-object v5

    .line 116
    invoke-virtual {p1}, Landroid/javax/sip/RequestEvent;->getRequest()Landroid/javax/sip/message/Request;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    invoke-interface {v5, v3, p1}, Landroid/javax/sip/message/MessageFactory;->createResponse(ILandroid/javax/sip/message/Request;)Landroid/javax/sip/message/Response;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 125
    .line 126
    .line 127
    invoke-interface {v8, p1}, Landroid/javax/sip/ServerTransaction;->sendResponse(Landroid/javax/sip/message/Response;)V

    .line 128
    .line 129
    .line 130
    const-string p1, "incomingBye"

    .line 131
    .line 132
    const-string v3, "Received BYE, sent 200 OK"

    .line 133
    .line 134
    iget-object v5, v2, La/jt2;->a:La/n6k0;

    .line 135
    .line 136
    invoke-virtual {v5, p1, v3}, La/n6k0;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {p0, v1}, La/m6k0;->b(La/x6k0;)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {p0}, La/m6k0;->a()V

    .line 143
    .line 144
    .line 145
    new-instance p1, La/w5k0;

    .line 146
    .line 147
    const/4 v3, 0x5

    .line 148
    invoke-direct {p1, v3}, La/w5k0;-><init>(B)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {v4, p1}, Ljava/util/concurrent/atomic/AtomicReference;->getAndUpdate(Ljava/util/function/UnaryOperator;)Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    invoke-virtual {v0, v7}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 155
    .line 156
    .line 157
    goto/16 :goto_6

    .line 158
    .line 159
    :goto_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 160
    .line 161
    .line 162
    move-result-object p1

    .line 163
    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object p1

    .line 167
    iget-object v2, v2, La/jt2;->a:La/n6k0;

    .line 168
    .line 169
    const-string v3, "incomingByeFailed"

    .line 170
    .line 171
    invoke-virtual {v2, v3, p1}, La/n6k0;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    invoke-virtual {p0, v1}, La/m6k0;->b(La/x6k0;)V

    .line 175
    .line 176
    .line 177
    invoke-virtual {p0}, La/m6k0;->a()V

    .line 178
    .line 179
    .line 180
    new-instance p0, La/w5k0;

    .line 181
    .line 182
    const/4 p1, 0x6

    .line 183
    invoke-direct {p0, p1}, La/w5k0;-><init>(B)V

    .line 184
    .line 185
    .line 186
    invoke-virtual {v4, p0}, Ljava/util/concurrent/atomic/AtomicReference;->getAndUpdate(Ljava/util/function/UnaryOperator;)Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    invoke-virtual {v0, v7}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 190
    .line 191
    .line 192
    goto/16 :goto_6

    .line 193
    .line 194
    :sswitch_1
    const-string p0, "ACK"

    .line 195
    .line 196
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 197
    .line 198
    .line 199
    return-void

    .line 200
    :sswitch_2
    const-string p0, "OPTIONS"

    .line 201
    .line 202
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 203
    .line 204
    .line 205
    move-result p0

    .line 206
    if-nez p0, :cond_3

    .line 207
    .line 208
    goto/16 :goto_6

    .line 209
    .line 210
    :cond_3
    :try_start_2
    invoke-virtual {p1}, Landroid/javax/sip/RequestEvent;->getServerTransaction()Landroid/javax/sip/ServerTransaction;

    .line 211
    .line 212
    .line 213
    move-result-object p0

    .line 214
    if-nez p0, :cond_4

    .line 215
    .line 216
    invoke-virtual {p1}, Landroid/javax/sip/RequestEvent;->getRequest()Landroid/javax/sip/message/Request;

    .line 217
    .line 218
    .line 219
    move-result-object p0

    .line 220
    invoke-interface {v6, p0}, Landroid/javax/sip/SipProvider;->getNewServerTransaction(Landroid/javax/sip/message/Request;)Landroid/javax/sip/ServerTransaction;

    .line 221
    .line 222
    .line 223
    move-result-object p0

    .line 224
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 225
    .line 226
    .line 227
    :cond_4
    invoke-virtual {v5}, La/r6k0;->e()Landroid/javax/sip/message/MessageFactory;

    .line 228
    .line 229
    .line 230
    move-result-object v0

    .line 231
    invoke-virtual {p1}, Landroid/javax/sip/RequestEvent;->getRequest()Landroid/javax/sip/message/Request;

    .line 232
    .line 233
    .line 234
    move-result-object p1

    .line 235
    const/16 v1, 0x195

    .line 236
    .line 237
    invoke-interface {v0, v1, p1}, Landroid/javax/sip/message/MessageFactory;->createResponse(ILandroid/javax/sip/message/Request;)Landroid/javax/sip/message/Response;

    .line 238
    .line 239
    .line 240
    move-result-object p1

    .line 241
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 242
    .line 243
    .line 244
    invoke-interface {p0, p1}, Landroid/javax/sip/ServerTransaction;->sendResponse(Landroid/javax/sip/message/Response;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 245
    .line 246
    .line 247
    goto/16 :goto_6

    .line 248
    .line 249
    :sswitch_3
    const-string v1, "INVITE"

    .line 250
    .line 251
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 252
    .line 253
    .line 254
    move-result v0

    .line 255
    if-nez v0, :cond_5

    .line 256
    .line 257
    goto/16 :goto_6

    .line 258
    .line 259
    :cond_5
    const-string v0, "sip:"

    .line 260
    .line 261
    invoke-virtual {p1}, Landroid/javax/sip/RequestEvent;->getDialog()Landroid/javax/sip/Dialog;

    .line 262
    .line 263
    .line 264
    move-result-object v1

    .line 265
    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 266
    .line 267
    .line 268
    move-result-object v7

    .line 269
    check-cast v7, La/y5k0;

    .line 270
    .line 271
    iget-object v7, v7, La/y5k0;->a:Landroid/javax/sip/Dialog;

    .line 272
    .line 273
    if-eqz v1, :cond_a

    .line 274
    .line 275
    invoke-virtual {v1, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 276
    .line 277
    .line 278
    move-result v1

    .line 279
    if-eqz v1, :cond_a

    .line 280
    .line 281
    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 282
    .line 283
    .line 284
    move-result-object v1

    .line 285
    check-cast v1, La/y5k0;

    .line 286
    .line 287
    iget-boolean v1, v1, La/y5k0;->f:Z

    .line 288
    .line 289
    if-nez v1, :cond_6

    .line 290
    .line 291
    goto/16 :goto_5

    .line 292
    .line 293
    :cond_6
    :try_start_3
    invoke-virtual {p1}, Landroid/javax/sip/RequestEvent;->getServerTransaction()Landroid/javax/sip/ServerTransaction;

    .line 294
    .line 295
    .line 296
    move-result-object v1

    .line 297
    if-nez v1, :cond_7

    .line 298
    .line 299
    invoke-virtual {p1}, Landroid/javax/sip/RequestEvent;->getRequest()Landroid/javax/sip/message/Request;

    .line 300
    .line 301
    .line 302
    move-result-object v1

    .line 303
    invoke-interface {v6, v1}, Landroid/javax/sip/SipProvider;->getNewServerTransaction(Landroid/javax/sip/message/Request;)Landroid/javax/sip/ServerTransaction;

    .line 304
    .line 305
    .line 306
    move-result-object v1

    .line 307
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 308
    .line 309
    .line 310
    goto :goto_2

    .line 311
    :catch_1
    move-exception p0

    .line 312
    goto/16 :goto_4

    .line 313
    .line 314
    :cond_7
    :goto_2
    invoke-virtual {v5}, La/r6k0;->e()Landroid/javax/sip/message/MessageFactory;

    .line 315
    .line 316
    .line 317
    move-result-object v6

    .line 318
    invoke-virtual {p1}, Landroid/javax/sip/RequestEvent;->getRequest()Landroid/javax/sip/message/Request;

    .line 319
    .line 320
    .line 321
    move-result-object p1

    .line 322
    invoke-interface {v6, v3, p1}, Landroid/javax/sip/message/MessageFactory;->createResponse(ILandroid/javax/sip/message/Request;)Landroid/javax/sip/message/Response;

    .line 323
    .line 324
    .line 325
    move-result-object p1

    .line 326
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 327
    .line 328
    .line 329
    iget-object p0, p0, La/m6k0;->c:La/g090;

    .line 330
    .line 331
    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 332
    .line 333
    .line 334
    move-result-object v3

    .line 335
    check-cast v3, La/y5k0;

    .line 336
    .line 337
    iget-object v3, v3, La/y5k0;->i:Ljava/lang/String;

    .line 338
    .line 339
    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 340
    .line 341
    .line 342
    move-result-object v6

    .line 343
    check-cast v6, La/y5k0;

    .line 344
    .line 345
    iget v6, v6, La/y5k0;->j:I

    .line 346
    .line 347
    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 348
    .line 349
    .line 350
    move-result-object v7

    .line 351
    check-cast v7, La/y5k0;

    .line 352
    .line 353
    iget-object v7, v7, La/y5k0;->n:Ljava/lang/String;

    .line 354
    .line 355
    invoke-virtual {p0, v6, v3, v7}, La/g090;->e(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 356
    .line 357
    .line 358
    move-result-object p0

    .line 359
    invoke-virtual {v5}, La/r6k0;->d()Landroid/javax/sip/header/HeaderFactory;

    .line 360
    .line 361
    .line 362
    move-result-object v3

    .line 363
    const-string v6, "application"

    .line 364
    .line 365
    const-string v7, "sdp"

    .line 366
    .line 367
    invoke-interface {v3, v6, v7}, Landroid/javax/sip/header/HeaderFactory;->createContentTypeHeader(Ljava/lang/String;Ljava/lang/String;)Landroid/javax/sip/header/ContentTypeHeader;

    .line 368
    .line 369
    .line 370
    move-result-object v3

    .line 371
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 372
    .line 373
    .line 374
    sget-object v6, Lkotlin/text/Charsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 375
    .line 376
    invoke-virtual {p0, v6}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 377
    .line 378
    .line 379
    move-result-object p0

    .line 380
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 381
    .line 382
    .line 383
    invoke-interface {p1, p0, v3}, Landroid/javax/sip/message/Message;->setContent(Ljava/lang/Object;Landroid/javax/sip/header/ContentTypeHeader;)V

    .line 384
    .line 385
    .line 386
    iget-object p0, v5, La/r6k0;->f:Ljava/util/concurrent/atomic/AtomicReference;

    .line 387
    .line 388
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 389
    .line 390
    .line 391
    move-result-object p0

    .line 392
    check-cast p0, Ljava/lang/String;

    .line 393
    .line 394
    if-nez p0, :cond_8

    .line 395
    .line 396
    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 397
    .line 398
    .line 399
    move-result-object p0

    .line 400
    check-cast p0, La/y5k0;

    .line 401
    .line 402
    iget-object p0, p0, La/y5k0;->i:Ljava/lang/String;

    .line 403
    .line 404
    :cond_8
    iget-object v3, v5, La/r6k0;->g:Ljava/util/concurrent/atomic/AtomicReference;

    .line 405
    .line 406
    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 407
    .line 408
    .line 409
    move-result-object v3

    .line 410
    check-cast v3, Ljava/lang/Integer;

    .line 411
    .line 412
    if-eqz v3, :cond_9

    .line 413
    .line 414
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 415
    .line 416
    .line 417
    move-result v3

    .line 418
    goto :goto_3

    .line 419
    :cond_9
    invoke-virtual {v5}, La/r6k0;->i()I

    .line 420
    .line 421
    .line 422
    move-result v3

    .line 423
    :goto_3
    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 424
    .line 425
    .line 426
    move-result-object v4

    .line 427
    check-cast v4, La/y5k0;

    .line 428
    .line 429
    iget-object v4, v4, La/y5k0;->n:Ljava/lang/String;

    .line 430
    .line 431
    invoke-static {v4}, La/n7x;->M(Ljava/lang/String;)Ljava/lang/String;

    .line 432
    .line 433
    .line 434
    move-result-object v4

    .line 435
    invoke-virtual {v5}, La/r6k0;->c()Landroid/javax/sip/address/AddressFactory;

    .line 436
    .line 437
    .line 438
    move-result-object v6

    .line 439
    new-instance v7, Ljava/lang/StringBuilder;

    .line 440
    .line 441
    invoke-direct {v7, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 442
    .line 443
    .line 444
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 445
    .line 446
    .line 447
    const-string v0, "@"

    .line 448
    .line 449
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 450
    .line 451
    .line 452
    invoke-virtual {v7, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 453
    .line 454
    .line 455
    const-string p0, ":"

    .line 456
    .line 457
    invoke-virtual {v7, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 458
    .line 459
    .line 460
    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 461
    .line 462
    .line 463
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 464
    .line 465
    .line 466
    move-result-object p0

    .line 467
    invoke-interface {v6, p0}, Landroid/javax/sip/address/AddressFactory;->createAddress(Ljava/lang/String;)Landroid/javax/sip/address/Address;

    .line 468
    .line 469
    .line 470
    move-result-object p0

    .line 471
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 472
    .line 473
    .line 474
    invoke-virtual {v5}, La/r6k0;->d()Landroid/javax/sip/header/HeaderFactory;

    .line 475
    .line 476
    .line 477
    move-result-object v0

    .line 478
    invoke-interface {v0, p0}, Landroid/javax/sip/header/HeaderFactory;->createContactHeader(Landroid/javax/sip/address/Address;)Landroid/javax/sip/header/ContactHeader;

    .line 479
    .line 480
    .line 481
    move-result-object p0

    .line 482
    invoke-interface {p1, p0}, Landroid/javax/sip/message/Message;->addHeader(Landroid/javax/sip/header/Header;)V

    .line 483
    .line 484
    .line 485
    invoke-interface {v1, p1}, Landroid/javax/sip/ServerTransaction;->sendResponse(Landroid/javax/sip/message/Response;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    .line 486
    .line 487
    .line 488
    goto :goto_6

    .line 489
    :goto_4
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 490
    .line 491
    .line 492
    move-result-object p0

    .line 493
    invoke-virtual {p0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 494
    .line 495
    .line 496
    move-result-object p0

    .line 497
    iget-object p1, v2, La/jt2;->a:La/n6k0;

    .line 498
    .line 499
    const-string v0, "incomingReInviteFailed"

    .line 500
    .line 501
    invoke-virtual {p1, v0, p0}, La/n6k0;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 502
    .line 503
    .line 504
    goto :goto_6

    .line 505
    :cond_a
    :goto_5
    const-string p0, "out-of-dialog INVITE ignored"

    .line 506
    .line 507
    iget-object p1, v2, La/jt2;->a:La/n6k0;

    .line 508
    .line 509
    const-string v0, "incomingInviteIgnored"

    .line 510
    .line 511
    invoke-virtual {p1, v0, p0}, La/n6k0;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 512
    .line 513
    .line 514
    :catch_2
    :cond_b
    :goto_6
    return-void

    .line 515
    :sswitch_data_0
    .sparse-switch
        -0x7efadcf7 -> :sswitch_3
        -0x1faded82 -> :sswitch_2
        0xfc69 -> :sswitch_1
        0x102ce -> :sswitch_0
    .end sparse-switch
.end method

.method public final processResponse(Landroid/javax/sip/ResponseEvent;)V
    .locals 21

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual/range {p1 .. p1}, Landroid/javax/sip/ResponseEvent;->getResponse()Landroid/javax/sip/message/Response;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-interface {v0}, Landroid/javax/sip/message/Response;->getStatusCode()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    invoke-interface {v0}, Landroid/javax/sip/message/Response;->getReasonPhrase()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    const-string v4, "CSeq"

    .line 22
    .line 23
    invoke-interface {v0, v4}, Landroid/javax/sip/message/Message;->getHeader(Ljava/lang/String;)Landroid/javax/sip/header/Header;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    instance-of v5, v4, Landroid/javax/sip/header/CSeqHeader;

    .line 28
    .line 29
    const/4 v6, 0x0

    .line 30
    if-eqz v5, :cond_0

    .line 31
    .line 32
    check-cast v4, Landroid/javax/sip/header/CSeqHeader;

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    move-object v4, v6

    .line 36
    :goto_0
    if-nez v4, :cond_1

    .line 37
    .line 38
    goto/16 :goto_8

    .line 39
    .line 40
    :cond_1
    invoke-interface {v4}, Landroid/javax/sip/header/CSeqHeader;->getMethod()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    const-string v5, "INVITE"

    .line 48
    .line 49
    invoke-virtual {v4, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v4

    .line 53
    if-nez v4, :cond_2

    .line 54
    .line 55
    goto/16 :goto_8

    .line 56
    .line 57
    :cond_2
    new-instance v4, Ljava/lang/StringBuilder;

    .line 58
    .line 59
    const-string v5, "statusCode "

    .line 60
    .line 61
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    const-string v5, " reasonPhrase "

    .line 68
    .line 69
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v4

    .line 79
    iget-object v5, v1, La/m6k0;->d:La/jt2;

    .line 80
    .line 81
    iget-object v7, v5, La/jt2;->a:La/n6k0;

    .line 82
    .line 83
    iget-object v5, v5, La/jt2;->a:La/n6k0;

    .line 84
    .line 85
    const-string v8, "inviteResponse"

    .line 86
    .line 87
    invoke-virtual {v7, v8, v4}, La/n6k0;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    const/16 v4, 0x64

    .line 91
    .line 92
    if-eq v2, v4, :cond_21

    .line 93
    .line 94
    const/16 v4, 0xb4

    .line 95
    .line 96
    if-eq v2, v4, :cond_21

    .line 97
    .line 98
    const/16 v4, 0xc8

    .line 99
    .line 100
    const/4 v7, 0x1

    .line 101
    const-string v8, " "

    .line 102
    .line 103
    iget-object v9, v1, La/m6k0;->e:Ljava/util/concurrent/atomic/AtomicReference;

    .line 104
    .line 105
    if-eq v2, v4, :cond_11

    .line 106
    .line 107
    const/16 v4, 0x191

    .line 108
    .line 109
    if-eq v2, v4, :cond_c

    .line 110
    .line 111
    const/16 v4, 0x197

    .line 112
    .line 113
    if-eq v2, v4, :cond_c

    .line 114
    .line 115
    invoke-virtual {v9}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    check-cast v0, La/y5k0;

    .line 120
    .line 121
    iget-boolean v0, v0, La/y5k0;->u:Z

    .line 122
    .line 123
    if-eqz v0, :cond_3

    .line 124
    .line 125
    invoke-static {v9}, La/m7x;->u(Ljava/util/concurrent/atomic/AtomicReference;)V

    .line 126
    .line 127
    .line 128
    return-void

    .line 129
    :cond_3
    const/16 v0, 0x193

    .line 130
    .line 131
    if-eq v2, v0, :cond_b

    .line 132
    .line 133
    const/16 v0, 0x194

    .line 134
    .line 135
    if-eq v2, v0, :cond_a

    .line 136
    .line 137
    const/16 v0, 0x1e0

    .line 138
    .line 139
    if-eq v2, v0, :cond_9

    .line 140
    .line 141
    const/16 v0, 0x1e6

    .line 142
    .line 143
    if-eq v2, v0, :cond_8

    .line 144
    .line 145
    const/16 v0, 0x1e8

    .line 146
    .line 147
    if-eq v2, v0, :cond_7

    .line 148
    .line 149
    const/16 v0, 0x1f4

    .line 150
    .line 151
    if-eq v2, v0, :cond_6

    .line 152
    .line 153
    const/16 v0, 0x1f7

    .line 154
    .line 155
    if-eq v2, v0, :cond_5

    .line 156
    .line 157
    const/16 v0, 0x25b

    .line 158
    .line 159
    if-eq v2, v0, :cond_4

    .line 160
    .line 161
    new-instance v0, Ljava/lang/StringBuilder;

    .line 162
    .line 163
    const-string v4, "Unknown response: "

    .line 164
    .line 165
    invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 169
    .line 170
    .line 171
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 172
    .line 173
    .line 174
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 175
    .line 176
    .line 177
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object v0

    .line 181
    goto :goto_1

    .line 182
    :cond_4
    const-string v0, "Call failed: 603 Declined"

    .line 183
    .line 184
    goto :goto_1

    .line 185
    :cond_5
    const-string v0, "Call failed: 503 Service Unavailable"

    .line 186
    .line 187
    goto :goto_1

    .line 188
    :cond_6
    const-string v0, "Call failed: 500 Server Error"

    .line 189
    .line 190
    goto :goto_1

    .line 191
    :cond_7
    const-string v0, "Call failed: 488 Not Acceptable Here"

    .line 192
    .line 193
    goto :goto_1

    .line 194
    :cond_8
    const-string v0, "Call failed: 486 Busy"

    .line 195
    .line 196
    goto :goto_1

    .line 197
    :cond_9
    const-string v0, "Call failed: 480 Temporarily Unavailable"

    .line 198
    .line 199
    goto :goto_1

    .line 200
    :cond_a
    const-string v0, "Call failed: 404 Not Found"

    .line 201
    .line 202
    goto :goto_1

    .line 203
    :cond_b
    const-string v0, "Call failed: 403 Forbidden"

    .line 204
    .line 205
    :goto_1
    new-instance v2, La/w6k0;

    .line 206
    .line 207
    invoke-direct {v2, v0}, La/w6k0;-><init>(Ljava/lang/String;)V

    .line 208
    .line 209
    .line 210
    invoke-virtual {v1, v2}, La/m6k0;->b(La/x6k0;)V

    .line 211
    .line 212
    .line 213
    return-void

    .line 214
    :cond_c
    invoke-virtual {v9}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object v2

    .line 218
    check-cast v2, La/y5k0;

    .line 219
    .line 220
    iget-boolean v2, v2, La/y5k0;->u:Z

    .line 221
    .line 222
    if-eqz v2, :cond_d

    .line 223
    .line 224
    invoke-static {v9}, La/m7x;->u(Ljava/util/concurrent/atomic/AtomicReference;)V

    .line 225
    .line 226
    .line 227
    return-void

    .line 228
    :cond_d
    invoke-virtual {v9}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    move-result-object v2

    .line 232
    check-cast v2, La/y5k0;

    .line 233
    .line 234
    iget-boolean v2, v2, La/y5k0;->e:Z

    .line 235
    .line 236
    const-string v3, "Auth failed"

    .line 237
    .line 238
    if-eqz v2, :cond_e

    .line 239
    .line 240
    new-instance v0, La/w5k0;

    .line 241
    .line 242
    const/4 v2, 0x7

    .line 243
    invoke-direct {v0, v2}, La/w5k0;-><init>(B)V

    .line 244
    .line 245
    .line 246
    invoke-virtual {v9, v0}, Ljava/util/concurrent/atomic/AtomicReference;->getAndUpdate(Ljava/util/function/UnaryOperator;)Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    new-instance v0, La/w6k0;

    .line 250
    .line 251
    invoke-direct {v0, v3}, La/w6k0;-><init>(Ljava/lang/String;)V

    .line 252
    .line 253
    .line 254
    invoke-virtual {v1, v0}, La/m6k0;->b(La/x6k0;)V

    .line 255
    .line 256
    .line 257
    return-void

    .line 258
    :cond_e
    new-instance v2, La/w5k0;

    .line 259
    .line 260
    const/16 v4, 0x8

    .line 261
    .line 262
    invoke-direct {v2, v4}, La/w5k0;-><init>(B)V

    .line 263
    .line 264
    .line 265
    invoke-virtual {v9, v2}, Ljava/util/concurrent/atomic/AtomicReference;->getAndUpdate(Ljava/util/function/UnaryOperator;)Ljava/lang/Object;

    .line 266
    .line 267
    .line 268
    iget-object v1, v1, La/m6k0;->g:La/sd60;

    .line 269
    .line 270
    iget-object v2, v1, La/sd60;->c:Ljava/lang/Object;

    .line 271
    .line 272
    check-cast v2, Ljava/util/concurrent/atomic/AtomicReference;

    .line 273
    .line 274
    iget-object v4, v1, La/sd60;->b:Ljava/lang/Object;

    .line 275
    .line 276
    check-cast v4, Ljava/util/concurrent/atomic/AtomicReference;

    .line 277
    .line 278
    const-string v5, "sip:"

    .line 279
    .line 280
    :try_start_0
    invoke-static {v0}, La/wti;->A(Landroid/javax/sip/message/Response;)La/mmk;

    .line 281
    .line 282
    .line 283
    move-result-object v16

    .line 284
    if-nez v16, :cond_f

    .line 285
    .line 286
    new-instance v0, La/w6k0;

    .line 287
    .line 288
    const-string v1, "Auth challenge failed: no authenticate header"

    .line 289
    .line 290
    invoke-direct {v0, v1}, La/w6k0;-><init>(Ljava/lang/String;)V

    .line 291
    .line 292
    .line 293
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 294
    .line 295
    .line 296
    move-result-object v1

    .line 297
    check-cast v1, La/mz40;

    .line 298
    .line 299
    if-eqz v1, :cond_21

    .line 300
    .line 301
    invoke-interface {v1, v0}, La/mz40;->g(Ljava/lang/Object;)Z

    .line 302
    .line 303
    .line 304
    goto/16 :goto_8

    .line 305
    .line 306
    :cond_f
    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 307
    .line 308
    .line 309
    move-result-object v6

    .line 310
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 311
    .line 312
    .line 313
    check-cast v6, La/y5k0;

    .line 314
    .line 315
    iget-object v9, v6, La/y5k0;->n:Ljava/lang/String;

    .line 316
    .line 317
    iget-object v14, v6, La/y5k0;->i:Ljava/lang/String;

    .line 318
    .line 319
    iget-object v8, v6, La/y5k0;->o:Ljava/lang/String;

    .line 320
    .line 321
    if-nez v8, :cond_10

    .line 322
    .line 323
    move-object v15, v14

    .line 324
    goto :goto_2

    .line 325
    :cond_10
    move-object v15, v8

    .line 326
    :goto_2
    iget-object v8, v6, La/y5k0;->h:Ljava/lang/String;

    .line 327
    .line 328
    new-instance v10, Ljava/lang/StringBuilder;

    .line 329
    .line 330
    invoke-direct {v10, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 331
    .line 332
    .line 333
    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 334
    .line 335
    .line 336
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 337
    .line 338
    .line 339
    move-result-object v12

    .line 340
    iget-object v5, v1, La/sd60;->h:Ljava/lang/Object;

    .line 341
    .line 342
    move-object v8, v5

    .line 343
    check-cast v8, La/wti;

    .line 344
    .line 345
    iget-object v5, v1, La/sd60;->g:Ljava/lang/Object;

    .line 346
    .line 347
    move-object v10, v5

    .line 348
    check-cast v10, Ljava/lang/String;

    .line 349
    .line 350
    const-string v11, "INVITE"

    .line 351
    .line 352
    move-object/from16 v13, v16

    .line 353
    .line 354
    invoke-virtual/range {v8 .. v13}, La/wti;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La/mmk;)La/nmk;

    .line 355
    .line 356
    .line 357
    move-result-object v17

    .line 358
    move-object/from16 v16, v13

    .line 359
    .line 360
    iget-object v5, v1, La/sd60;->e:Ljava/lang/Object;

    .line 361
    .line 362
    check-cast v5, La/g090;

    .line 363
    .line 364
    iget v8, v6, La/y5k0;->j:I

    .line 365
    .line 366
    iget-object v10, v6, La/y5k0;->n:Ljava/lang/String;

    .line 367
    .line 368
    invoke-virtual {v5, v8, v14, v10}, La/g090;->e(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 369
    .line 370
    .line 371
    move-result-object v18

    .line 372
    iget-object v5, v1, La/sd60;->i:Ljava/lang/Object;

    .line 373
    .line 374
    move-object v8, v5

    .line 375
    check-cast v8, La/pox;

    .line 376
    .line 377
    move-object v11, v9

    .line 378
    iget-object v9, v6, La/y5k0;->h:Ljava/lang/String;

    .line 379
    .line 380
    iget-object v10, v6, La/y5k0;->i:Ljava/lang/String;

    .line 381
    .line 382
    iget-object v13, v6, La/y5k0;->p:Ljava/lang/String;

    .line 383
    .line 384
    iget-object v14, v6, La/y5k0;->m:Ljava/lang/String;

    .line 385
    .line 386
    move-object v12, v15

    .line 387
    iget-object v15, v6, La/y5k0;->l:Ljava/lang/String;

    .line 388
    .line 389
    iget-object v5, v6, La/y5k0;->k:Ljava/util/Map;

    .line 390
    .line 391
    invoke-interface {v0}, Landroid/javax/sip/message/Response;->getStatusCode()I

    .line 392
    .line 393
    .line 394
    move-result v20

    .line 395
    move-object/from16 v19, v5

    .line 396
    .line 397
    invoke-virtual/range {v8 .. v20}, La/pox;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La/mmk;La/nmk;Ljava/lang/String;Ljava/util/Map;I)Landroid/javax/sip/message/Request;

    .line 398
    .line 399
    .line 400
    move-result-object v0

    .line 401
    iget-object v5, v1, La/sd60;->d:Ljava/lang/Object;

    .line 402
    .line 403
    check-cast v5, Landroid/javax/sip/SipProvider;

    .line 404
    .line 405
    invoke-interface {v5, v0}, Landroid/javax/sip/SipProvider;->getNewClientTransaction(Landroid/javax/sip/message/Request;)Landroid/javax/sip/ClientTransaction;

    .line 406
    .line 407
    .line 408
    move-result-object v0

    .line 409
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 410
    .line 411
    .line 412
    invoke-interface {v0}, Landroid/javax/sip/ClientTransaction;->sendRequest()V

    .line 413
    .line 414
    .line 415
    new-instance v5, La/v5k0;

    .line 416
    .line 417
    invoke-direct {v5, v0, v7}, La/v5k0;-><init>(Landroid/javax/sip/ClientTransaction;B)V

    .line 418
    .line 419
    .line 420
    invoke-virtual {v4, v5}, Ljava/util/concurrent/atomic/AtomicReference;->getAndUpdate(Ljava/util/function/UnaryOperator;)Ljava/lang/Object;

    .line 421
    .line 422
    .line 423
    iget-object v0, v1, La/sd60;->f:Ljava/lang/Object;

    .line 424
    .line 425
    check-cast v0, La/jt2;

    .line 426
    .line 427
    const-string v1, "inviteWithAuthSent"

    .line 428
    .line 429
    const-string v5, "INVITE with Digest Auth sent"

    .line 430
    .line 431
    iget-object v0, v0, La/jt2;->a:La/n6k0;

    .line 432
    .line 433
    invoke-virtual {v0, v1, v5}, La/n6k0;->a(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 434
    .line 435
    .line 436
    goto/16 :goto_8

    .line 437
    .line 438
    :catch_0
    new-instance v0, La/w5k0;

    .line 439
    .line 440
    const/4 v1, 0x3

    .line 441
    invoke-direct {v0, v1}, La/w5k0;-><init>(B)V

    .line 442
    .line 443
    .line 444
    invoke-virtual {v4, v0}, Ljava/util/concurrent/atomic/AtomicReference;->getAndUpdate(Ljava/util/function/UnaryOperator;)Ljava/lang/Object;

    .line 445
    .line 446
    .line 447
    new-instance v0, La/w6k0;

    .line 448
    .line 449
    invoke-direct {v0, v3}, La/w6k0;-><init>(Ljava/lang/String;)V

    .line 450
    .line 451
    .line 452
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 453
    .line 454
    .line 455
    move-result-object v1

    .line 456
    check-cast v1, La/mz40;

    .line 457
    .line 458
    if-eqz v1, :cond_21

    .line 459
    .line 460
    invoke-interface {v1, v0}, La/mz40;->g(Ljava/lang/Object;)Z

    .line 461
    .line 462
    .line 463
    goto/16 :goto_8

    .line 464
    .line 465
    :cond_11
    :try_start_1
    invoke-virtual/range {p1 .. p1}, Landroid/javax/sip/ResponseEvent;->getResponse()Landroid/javax/sip/message/Response;

    .line 466
    .line 467
    .line 468
    move-result-object v0

    .line 469
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 470
    .line 471
    .line 472
    invoke-virtual {v9}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 473
    .line 474
    .line 475
    move-result-object v2

    .line 476
    check-cast v2, La/y5k0;

    .line 477
    .line 478
    iget-boolean v2, v2, La/y5k0;->f:Z

    .line 479
    .line 480
    if-eqz v2, :cond_13

    .line 481
    .line 482
    invoke-virtual {v9}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 483
    .line 484
    .line 485
    move-result-object v0

    .line 486
    check-cast v0, La/y5k0;

    .line 487
    .line 488
    iget-boolean v0, v0, La/y5k0;->u:Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2

    .line 489
    .line 490
    if-eqz v0, :cond_12

    .line 491
    .line 492
    :try_start_2
    invoke-static {v9}, La/m7x;->u(Ljava/util/concurrent/atomic/AtomicReference;)V

    .line 493
    .line 494
    .line 495
    invoke-static/range {p1 .. p1}, La/m6k0;->c(Landroid/javax/sip/ResponseEvent;)V

    .line 496
    .line 497
    .line 498
    const-string v0, "sessionRefreshOk"

    .line 499
    .line 500
    const-string v2, "re-INVITE 200 OK, ACK sent"

    .line 501
    .line 502
    invoke-virtual {v5, v0, v2}, La/n6k0;->a(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    .line 503
    .line 504
    .line 505
    goto/16 :goto_8

    .line 506
    .line 507
    :catch_1
    :try_start_3
    invoke-static {v9}, La/m7x;->u(Ljava/util/concurrent/atomic/AtomicReference;)V

    .line 508
    .line 509
    .line 510
    goto/16 :goto_8

    .line 511
    .line 512
    :catch_2
    move-exception v0

    .line 513
    goto/16 :goto_7

    .line 514
    .line 515
    :cond_12
    new-instance v0, La/w5k0;

    .line 516
    .line 517
    const/16 v2, 0xa

    .line 518
    .line 519
    invoke-direct {v0, v2}, La/w5k0;-><init>(B)V

    .line 520
    .line 521
    .line 522
    invoke-virtual {v9, v0}, Ljava/util/concurrent/atomic/AtomicReference;->getAndUpdate(Ljava/util/function/UnaryOperator;)Ljava/lang/Object;

    .line 523
    .line 524
    .line 525
    invoke-static/range {p1 .. p1}, La/m6k0;->c(Landroid/javax/sip/ResponseEvent;)V

    .line 526
    .line 527
    .line 528
    goto/16 :goto_8

    .line 529
    .line 530
    :cond_13
    invoke-virtual/range {p1 .. p1}, Landroid/javax/sip/ResponseEvent;->getDialog()Landroid/javax/sip/Dialog;

    .line 531
    .line 532
    .line 533
    move-result-object v2

    .line 534
    if-nez v2, :cond_15

    .line 535
    .line 536
    invoke-virtual/range {p1 .. p1}, Landroid/javax/sip/ResponseEvent;->getClientTransaction()Landroid/javax/sip/ClientTransaction;

    .line 537
    .line 538
    .line 539
    move-result-object v2

    .line 540
    if-eqz v2, :cond_14

    .line 541
    .line 542
    invoke-interface {v2}, Landroid/javax/sip/Transaction;->getDialog()Landroid/javax/sip/Dialog;

    .line 543
    .line 544
    .line 545
    move-result-object v2

    .line 546
    goto :goto_3

    .line 547
    :cond_14
    move-object v2, v6

    .line 548
    :cond_15
    :goto_3
    if-nez v2, :cond_16

    .line 549
    .line 550
    new-instance v0, La/w6k0;

    .line 551
    .line 552
    const-string v2, "No dialog in 200 OK"

    .line 553
    .line 554
    invoke-direct {v0, v2}, La/w6k0;-><init>(Ljava/lang/String;)V

    .line 555
    .line 556
    .line 557
    invoke-virtual {v1, v0}, La/m6k0;->b(La/x6k0;)V

    .line 558
    .line 559
    .line 560
    goto/16 :goto_8

    .line 561
    .line 562
    :cond_16
    new-instance v3, La/kmk;

    .line 563
    .line 564
    const/4 v4, 0x2

    .line 565
    invoke-direct {v3, v2, v4}, La/kmk;-><init>(Ljava/lang/Object;B)V

    .line 566
    .line 567
    .line 568
    invoke-virtual {v9, v3}, Ljava/util/concurrent/atomic/AtomicReference;->getAndUpdate(Ljava/util/function/UnaryOperator;)Ljava/lang/Object;

    .line 569
    .line 570
    .line 571
    invoke-interface {v0}, Landroid/javax/sip/message/Message;->getContent()Ljava/lang/Object;

    .line 572
    .line 573
    .line 574
    move-result-object v0

    .line 575
    const/4 v2, 0x0

    .line 576
    if-nez v0, :cond_17

    .line 577
    .line 578
    const/4 v3, -0x1

    .line 579
    goto :goto_4

    .line 580
    :cond_17
    instance-of v3, v0, Ljava/lang/String;

    .line 581
    .line 582
    if-eqz v3, :cond_18

    .line 583
    .line 584
    move v3, v2

    .line 585
    goto :goto_4

    .line 586
    :cond_18
    instance-of v3, v0, [B

    .line 587
    .line 588
    if-eqz v3, :cond_19

    .line 589
    .line 590
    move v3, v7

    .line 591
    goto :goto_4

    .line 592
    :cond_19
    const/4 v3, -0x2

    .line 593
    :goto_4
    if-eqz v3, :cond_1b

    .line 594
    .line 595
    if-eq v3, v7, :cond_1a

    .line 596
    .line 597
    move-object v3, v6

    .line 598
    goto :goto_5

    .line 599
    :cond_1a
    new-instance v3, Ljava/lang/String;

    .line 600
    .line 601
    check-cast v0, [B

    .line 602
    .line 603
    sget-object v4, Lkotlin/text/Charsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 604
    .line 605
    invoke-direct {v3, v0, v4}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 606
    .line 607
    .line 608
    goto :goto_5

    .line 609
    :cond_1b
    move-object v3, v0

    .line 610
    check-cast v3, Ljava/lang/String;

    .line 611
    .line 612
    :goto_5
    if-eqz v3, :cond_1f

    .line 613
    .line 614
    const-string v0, "m=audio "

    .line 615
    .line 616
    invoke-static {v3}, Lkotlin/text/StringsKt;->Z(Ljava/lang/CharSequence;)Ljava/util/List;

    .line 617
    .line 618
    .line 619
    move-result-object v4

    .line 620
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 621
    .line 622
    .line 623
    move-result-object v4

    .line 624
    :cond_1c
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 625
    .line 626
    .line 627
    move-result v7

    .line 628
    if-eqz v7, :cond_1d

    .line 629
    .line 630
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 631
    .line 632
    .line 633
    move-result-object v7

    .line 634
    move-object v10, v7

    .line 635
    check-cast v10, Ljava/lang/String;

    .line 636
    .line 637
    invoke-static {v10, v0, v2}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 638
    .line 639
    .line 640
    move-result v10

    .line 641
    if-eqz v10, :cond_1c

    .line 642
    .line 643
    goto :goto_6

    .line 644
    :cond_1d
    move-object v7, v6

    .line 645
    :goto_6
    check-cast v7, Ljava/lang/String;

    .line 646
    .line 647
    if-eqz v7, :cond_1e

    .line 648
    .line 649
    invoke-static {v7, v0, v7}, Lkotlin/text/StringsKt;->m0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 650
    .line 651
    .line 652
    move-result-object v0

    .line 653
    invoke-static {v0, v8}, Lkotlin/text/StringsKt;->r0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 654
    .line 655
    .line 656
    move-result-object v0

    .line 657
    invoke-static {v0}, Lkotlin/text/StringsKt;->toIntOrNull(Ljava/lang/String;)Ljava/lang/Integer;

    .line 658
    .line 659
    .line 660
    move-result-object v6

    .line 661
    :cond_1e
    invoke-static {v3}, La/gne0;->g(Ljava/lang/String;)Ljava/lang/String;

    .line 662
    .line 663
    .line 664
    move-result-object v0

    .line 665
    if-eqz v6, :cond_1f

    .line 666
    .line 667
    if-eqz v0, :cond_1f

    .line 668
    .line 669
    invoke-static {v3}, La/gne0;->e(Ljava/lang/String;)I

    .line 670
    .line 671
    .line 672
    move-result v2

    .line 673
    new-instance v3, La/l6k0;

    .line 674
    .line 675
    invoke-direct {v3, v2, v6, v0}, La/l6k0;-><init>(ILjava/lang/Integer;Ljava/lang/String;)V

    .line 676
    .line 677
    .line 678
    invoke-virtual {v9, v3}, Ljava/util/concurrent/atomic/AtomicReference;->getAndUpdate(Ljava/util/function/UnaryOperator;)Ljava/lang/Object;

    .line 679
    .line 680
    .line 681
    :cond_1f
    invoke-static/range {p1 .. p1}, La/m6k0;->c(Landroid/javax/sip/ResponseEvent;)V

    .line 682
    .line 683
    .line 684
    const-string v0, "callEstablished"

    .line 685
    .line 686
    const-string v2, "Call established, ACK sent"

    .line 687
    .line 688
    invoke-virtual {v5, v0, v2}, La/n6k0;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 689
    .line 690
    .line 691
    invoke-virtual {v9}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 692
    .line 693
    .line 694
    move-result-object v0

    .line 695
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 696
    .line 697
    .line 698
    check-cast v0, La/y5k0;

    .line 699
    .line 700
    new-instance v2, La/v6k0;

    .line 701
    .line 702
    iget-object v3, v0, La/y5k0;->q:Ljava/lang/String;

    .line 703
    .line 704
    if-nez v3, :cond_20

    .line 705
    .line 706
    const-string v3, ""

    .line 707
    .line 708
    :cond_20
    iget v4, v0, La/y5k0;->r:I

    .line 709
    .line 710
    iget v0, v0, La/y5k0;->s:I

    .line 711
    .line 712
    invoke-direct {v2, v3, v4, v0}, La/v6k0;-><init>(Ljava/lang/String;II)V

    .line 713
    .line 714
    .line 715
    invoke-virtual {v1, v2}, La/m6k0;->b(La/x6k0;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    .line 716
    .line 717
    .line 718
    goto :goto_8

    .line 719
    :goto_7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 720
    .line 721
    .line 722
    move-result-object v0

    .line 723
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 724
    .line 725
    .line 726
    move-result-object v0

    .line 727
    const-string v2, "inviteOkFailed"

    .line 728
    .line 729
    invoke-virtual {v5, v2, v0}, La/n6k0;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 730
    .line 731
    .line 732
    new-instance v0, La/w6k0;

    .line 733
    .line 734
    const-string v2, "Failed to establish call"

    .line 735
    .line 736
    invoke-direct {v0, v2}, La/w6k0;-><init>(Ljava/lang/String;)V

    .line 737
    .line 738
    .line 739
    invoke-virtual {v1, v0}, La/m6k0;->b(La/x6k0;)V

    .line 740
    .line 741
    .line 742
    :cond_21
    :goto_8
    return-void
.end method

.method public final processTimeout(Landroid/javax/sip/TimeoutEvent;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, La/m6k0;->e:Ljava/util/concurrent/atomic/AtomicReference;

    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    check-cast v0, La/y5k0;

    .line 11
    .line 12
    iget-boolean v0, v0, La/y5k0;->f:Z

    .line 13
    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    new-instance p1, La/w6k0;

    .line 17
    .line 18
    const-string v0, "Call timeout"

    .line 19
    .line 20
    invoke-direct {p1, v0}, La/w6k0;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, p1}, La/m6k0;->b(La/x6k0;)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    invoke-static {p1}, La/m7x;->u(Ljava/util/concurrent/atomic/AtomicReference;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public final processTransactionTerminated(Landroid/javax/sip/TransactionTerminatedEvent;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method
