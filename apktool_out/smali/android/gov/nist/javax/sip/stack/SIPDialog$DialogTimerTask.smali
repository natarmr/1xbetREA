.class Landroid/gov/nist/javax/sip/stack/SIPDialog$DialogTimerTask;
.super Landroid/gov/nist/javax/sip/stack/SIPStackTimerTask;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/gov/nist/javax/sip/stack/SIPDialog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "DialogTimerTask"
.end annotation


# instance fields
.field nRetransmissions:I

.field final synthetic this$0:Landroid/gov/nist/javax/sip/stack/SIPDialog;

.field transaction:Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;


# direct methods
.method public constructor <init>(Landroid/gov/nist/javax/sip/stack/SIPDialog;Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog$DialogTimerTask;->this$0:Landroid/gov/nist/javax/sip/stack/SIPDialog;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/gov/nist/javax/sip/stack/SIPStackTimerTask;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog$DialogTimerTask;->transaction:Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;

    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    iput p1, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog$DialogTimerTask;->nRetransmissions:I

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public cleanUpBeforeCancel()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog$DialogTimerTask;->transaction:Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;

    .line 3
    .line 4
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog$DialogTimerTask;->this$0:Landroid/gov/nist/javax/sip/stack/SIPDialog;

    .line 5
    .line 6
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->cleanUpOnAck()V

    .line 7
    .line 8
    .line 9
    invoke-super {p0}, Landroid/gov/nist/javax/sip/stack/SIPStackTimerTask;->cleanUpBeforeCancel()V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public getThreadHash()Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog$DialogTimerTask;->this$0:Landroid/gov/nist/javax/sip/stack/SIPDialog;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getCallId()Landroid/javax/sip/header/CallIdHeader;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-interface {p0}, Landroid/javax/sip/header/CallIdHeader;->getCallId()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public runTask()V
    .locals 8

    .line 1
    const-string v0, "resend 200 response from "

    .line 2
    .line 3
    iget-object v1, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog$DialogTimerTask;->this$0:Landroid/gov/nist/javax/sip/stack/SIPDialog;

    .line 4
    .line 5
    invoke-static {}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->access$100()Landroid/gov/nist/core/StackLogger;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    const/16 v3, 0x20

    .line 10
    .line 11
    invoke-interface {v2, v3}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    invoke-static {}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->access$100()Landroid/gov/nist/core/StackLogger;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    const-string v4, "Running dialog timer"

    .line 22
    .line 23
    invoke-interface {v2, v4}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    :cond_0
    iget v2, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog$DialogTimerTask;->nRetransmissions:I

    .line 27
    .line 28
    const/4 v4, 0x1

    .line 29
    add-int/2addr v2, v4

    .line 30
    iput v2, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog$DialogTimerTask;->nRetransmissions:I

    .line 31
    .line 32
    iget-object v5, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog$DialogTimerTask;->transaction:Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;

    .line 33
    .line 34
    iget-object v6, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog$DialogTimerTask;->this$0:Landroid/gov/nist/javax/sip/stack/SIPDialog;

    .line 35
    .line 36
    invoke-static {v6}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->access$000(Landroid/gov/nist/javax/sip/stack/SIPDialog;)Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 37
    .line 38
    .line 39
    move-result-object v6

    .line 40
    invoke-virtual {v6}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getAckTimeoutFactor()I

    .line 41
    .line 42
    .line 43
    move-result v6

    .line 44
    if-le v2, v6, :cond_2

    .line 45
    .line 46
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog$DialogTimerTask;->this$0:Landroid/gov/nist/javax/sip/stack/SIPDialog;

    .line 47
    .line 48
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getSipProvider()Landroid/gov/nist/javax/sip/SipProviderImpl;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/SipProviderImpl;->getSipListener()Landroid/javax/sip/SipListener;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    if-eqz v0, :cond_1

    .line 57
    .line 58
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog$DialogTimerTask;->this$0:Landroid/gov/nist/javax/sip/stack/SIPDialog;

    .line 59
    .line 60
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getSipProvider()Landroid/gov/nist/javax/sip/SipProviderImpl;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/SipProviderImpl;->getSipListener()Landroid/javax/sip/SipListener;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    instance-of v0, v0, Landroid/gov/nist/javax/sip/SipListenerExt;

    .line 69
    .line 70
    if-eqz v0, :cond_1

    .line 71
    .line 72
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog$DialogTimerTask;->this$0:Landroid/gov/nist/javax/sip/stack/SIPDialog;

    .line 73
    .line 74
    invoke-static {v0, v4}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->access$300(Landroid/gov/nist/javax/sip/stack/SIPDialog;I)V

    .line 75
    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_1
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog$DialogTimerTask;->this$0:Landroid/gov/nist/javax/sip/stack/SIPDialog;

    .line 79
    .line 80
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->delete()V

    .line 81
    .line 82
    .line 83
    :goto_0
    if-eqz v5, :cond_6

    .line 84
    .line 85
    invoke-interface {v5}, Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;->getState()Landroid/javax/sip/TransactionState;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    sget-object v2, Landroid/javax/sip/TransactionState;->TERMINATED:Landroid/javax/sip/TransactionState;

    .line 90
    .line 91
    if-eq v0, v2, :cond_6

    .line 92
    .line 93
    invoke-interface {v5, v4}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->raiseErrorEvent(I)V

    .line 94
    .line 95
    .line 96
    goto/16 :goto_4

    .line 97
    .line 98
    :cond_2
    if-eqz v5, :cond_6

    .line 99
    .line 100
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->isAckSeen()Z

    .line 101
    .line 102
    .line 103
    move-result v2

    .line 104
    if-nez v2, :cond_6

    .line 105
    .line 106
    iget-object v2, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog$DialogTimerTask;->this$0:Landroid/gov/nist/javax/sip/stack/SIPDialog;

    .line 107
    .line 108
    iget-object v2, v2, Landroid/gov/nist/javax/sip/stack/SIPDialog;->lastResponseStatusCode:Ljava/lang/Integer;

    .line 109
    .line 110
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 111
    .line 112
    .line 113
    move-result v2

    .line 114
    div-int/lit8 v2, v2, 0x64

    .line 115
    .line 116
    const/4 v4, 0x2

    .line 117
    if-ne v2, v4, :cond_6

    .line 118
    .line 119
    :try_start_0
    invoke-interface {v5}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->getTimerT2()I

    .line 120
    .line 121
    .line 122
    move-result v2

    .line 123
    invoke-static {v1, v2}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->access$500(Landroid/gov/nist/javax/sip/stack/SIPDialog;I)Z

    .line 124
    .line 125
    .line 126
    move-result v2

    .line 127
    if-eqz v2, :cond_3

    .line 128
    .line 129
    invoke-interface {v5}, Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;->resendLastResponseAsBytes()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 130
    .line 131
    .line 132
    goto :goto_1

    .line 133
    :catchall_0
    move-exception p0

    .line 134
    goto :goto_3

    .line 135
    :cond_3
    :goto_1
    invoke-static {v1}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->access$000(Landroid/gov/nist/javax/sip/stack/SIPDialog;)Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 136
    .line 137
    .line 138
    invoke-static {}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->access$100()Landroid/gov/nist/core/StackLogger;

    .line 139
    .line 140
    .line 141
    move-result-object v2

    .line 142
    invoke-interface {v2, v3}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 143
    .line 144
    .line 145
    move-result v2

    .line 146
    if-eqz v2, :cond_4

    .line 147
    .line 148
    invoke-static {}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->access$100()Landroid/gov/nist/core/StackLogger;

    .line 149
    .line 150
    .line 151
    move-result-object v2

    .line 152
    new-instance v3, Ljava/lang/StringBuilder;

    .line 153
    .line 154
    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    :goto_2
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 158
    .line 159
    .line 160
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    invoke-interface {v2, v0}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    :cond_4
    invoke-interface {v5}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->fireTimer()V

    .line 168
    .line 169
    .line 170
    goto :goto_4

    .line 171
    :catch_0
    :try_start_1
    iget-object v2, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog$DialogTimerTask;->this$0:Landroid/gov/nist/javax/sip/stack/SIPDialog;

    .line 172
    .line 173
    invoke-interface {v5}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->getPeerAddress()Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object v4

    .line 177
    invoke-interface {v5}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->getPeerPort()I

    .line 178
    .line 179
    .line 180
    move-result v6

    .line 181
    invoke-interface {v5}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->getPeerProtocol()Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object v7

    .line 185
    invoke-static {v2, v4, v6, v7}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->access$600(Landroid/gov/nist/javax/sip/stack/SIPDialog;Ljava/lang/String;ILjava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 186
    .line 187
    .line 188
    invoke-static {v1}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->access$000(Landroid/gov/nist/javax/sip/stack/SIPDialog;)Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 189
    .line 190
    .line 191
    invoke-static {}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->access$100()Landroid/gov/nist/core/StackLogger;

    .line 192
    .line 193
    .line 194
    move-result-object v2

    .line 195
    invoke-interface {v2, v3}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 196
    .line 197
    .line 198
    move-result v2

    .line 199
    if-eqz v2, :cond_4

    .line 200
    .line 201
    invoke-static {}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->access$100()Landroid/gov/nist/core/StackLogger;

    .line 202
    .line 203
    .line 204
    move-result-object v2

    .line 205
    new-instance v3, Ljava/lang/StringBuilder;

    .line 206
    .line 207
    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 208
    .line 209
    .line 210
    goto :goto_2

    .line 211
    :goto_3
    invoke-static {v1}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->access$000(Landroid/gov/nist/javax/sip/stack/SIPDialog;)Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 212
    .line 213
    .line 214
    invoke-static {}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->access$100()Landroid/gov/nist/core/StackLogger;

    .line 215
    .line 216
    .line 217
    move-result-object v2

    .line 218
    invoke-interface {v2, v3}, Landroid/gov/nist/core/StackLogger;->isLoggingEnabled(I)Z

    .line 219
    .line 220
    .line 221
    move-result v2

    .line 222
    if-eqz v2, :cond_5

    .line 223
    .line 224
    invoke-static {}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->access$100()Landroid/gov/nist/core/StackLogger;

    .line 225
    .line 226
    .line 227
    move-result-object v2

    .line 228
    new-instance v3, Ljava/lang/StringBuilder;

    .line 229
    .line 230
    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 231
    .line 232
    .line 233
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 234
    .line 235
    .line 236
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 237
    .line 238
    .line 239
    move-result-object v0

    .line 240
    invoke-interface {v2, v0}, Landroid/gov/nist/core/StackLogger;->logDebug(Ljava/lang/String;)V

    .line 241
    .line 242
    .line 243
    :cond_5
    invoke-interface {v5}, Landroid/gov/nist/javax/sip/stack/SIPTransaction;->fireTimer()V

    .line 244
    .line 245
    .line 246
    throw p0

    .line 247
    :cond_6
    :goto_4
    invoke-virtual {v1}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->isAckSeen()Z

    .line 248
    .line 249
    .line 250
    move-result v0

    .line 251
    if-nez v0, :cond_7

    .line 252
    .line 253
    invoke-static {v1}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->access$700(Landroid/gov/nist/javax/sip/stack/SIPDialog;)I

    .line 254
    .line 255
    .line 256
    move-result v0

    .line 257
    const/4 v1, 0x3

    .line 258
    if-ne v0, v1, :cond_8

    .line 259
    .line 260
    :cond_7
    const/4 v0, 0x0

    .line 261
    iput-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog$DialogTimerTask;->transaction:Landroid/gov/nist/javax/sip/stack/SIPServerTransaction;

    .line 262
    .line 263
    iget-object v0, p0, Landroid/gov/nist/javax/sip/stack/SIPDialog$DialogTimerTask;->this$0:Landroid/gov/nist/javax/sip/stack/SIPDialog;

    .line 264
    .line 265
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/stack/SIPDialog;->getStack()Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;

    .line 266
    .line 267
    .line 268
    move-result-object v0

    .line 269
    invoke-virtual {v0}, Landroid/gov/nist/javax/sip/stack/SIPTransactionStack;->getTimer()Landroid/gov/nist/javax/sip/stack/timers/SipTimer;

    .line 270
    .line 271
    .line 272
    move-result-object v0

    .line 273
    invoke-interface {v0, p0}, Landroid/gov/nist/javax/sip/stack/timers/SipTimer;->cancel(Landroid/gov/nist/javax/sip/stack/SIPStackTimerTask;)Z

    .line 274
    .line 275
    .line 276
    :cond_8
    return-void
.end method
